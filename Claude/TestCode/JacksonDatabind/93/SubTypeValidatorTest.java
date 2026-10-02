package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * JUnit 4 test suite for {@link SubTypeValidator}.
 *
 * Since {@link DeserializationContext} is abstract and mocking frameworks
 * are not allowed, tests that require a *real* {@code DeserializationContext}
 * (i.e. tests that expect a {@link JsonMappingException} to be thrown) obtain
 * one through an actual Jackson deserialization run, using a small custom
 * {@link JsonDeserializer} that simply delegates to
 * {@code SubTypeValidator.instance().validateSubType(...)}.
 *
 * For code paths that never touch {@code ctxt} (i.e. the "safe" / non
 * throwing path in {@code validateSubType}), passing {@code null} as the
 * context is acceptable and does not affect the code under test.
 */
public class SubTypeValidatorTest {

    private SubTypeValidator validator;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
    }

    // ---------------------------------------------------------------
    // instance() tests
    // ---------------------------------------------------------------

    @Test
    public void testInstance_calledMultipleTimes_returnsSameSingletonInstance() {
        SubTypeValidator first = SubTypeValidator.instance();
        SubTypeValidator second = SubTypeValidator.instance();
        assertNotNull(first);
        assertSame(first, second);
    }

    @Test
    public void testConstructor_protectedConstructor_canBeInstantiatedWithinSamePackage() {
        // Protected constructor is accessible from within the same package.
        SubTypeValidator local = new SubTypeValidator();
        assertNotNull(local);
        // Newly created instance is independent of the singleton instance.
        assertTrue(local != SubTypeValidator.instance());
    }

    // ---------------------------------------------------------------
    // validateSubType() - normal / typical inputs (no exception expected)
    // ---------------------------------------------------------------

    @Test
    public void testValidateSubType_safeClassString_doesNotThrowException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        // ctxt is not used on the "safe" return path, so null is fine here.
        validator.validateSubType(null, type);
        // reaching here means no exception was thrown - success
    }

    @Test
    public void testValidateSubType_safeClassInteger_doesNotThrowException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        validator.validateSubType(null, type);
    }

    @Test
    public void testValidateSubType_safeClassViaObjectMapper_doesNotThrowException() throws Exception {
        JavaType safeType = TypeFactory.defaultInstance().constructType(String.class);
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(ProbeTarget.class, new ProbeDeserializer(safeType));
        mapper.registerModule(module);

        Object result = mapper.readValue("{}", ProbeTarget.class);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // validateSubType() - edge cases
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testValidateSubType_nullType_throwsNullPointerException() throws Exception {
        // type.getRawClass() will be invoked on a null reference -> NPE
        validator.validateSubType(null, null);
    }

    @Test
    public void testValidateSubType_arrayTypeClass_doesNotThrowException() throws Exception {
        // An array type's raw class name (e.g. "[Ljava.lang.String;") should
        // never match illegal names nor the spring prefix.
        JavaType type = TypeFactory.defaultInstance().constructType(String[].class);
        validator.validateSubType(null, type);
    }

    // ---------------------------------------------------------------
    // validateSubType() - exception scenarios (illegal / dangerous classes)
    // ---------------------------------------------------------------

    @Test
    public void testValidateSubType_illegalDefaultClassFileHandler_throwsJsonMappingException()
            throws Exception {
        JavaType illegalType =
                TypeFactory.defaultInstance().constructType(java.util.logging.FileHandler.class);

        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(ProbeTarget.class, new ProbeDeserializer(illegalType));
        mapper.registerModule(module);

        try {
            mapper.readValue("{}", ProbeTarget.class);
            fail("Expected JsonMappingException to be thrown for illegal class type");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Illegal type"));
        }
    }

    @Test
    public void testValidateSubType_illegalDefaultClassUnicastRemoteObject_throwsJsonMappingException()
            throws Exception {
        JavaType illegalType =
                TypeFactory.defaultInstance().constructType(java.rmi.server.UnicastRemoteObject.class);

        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(ProbeTarget.class, new ProbeDeserializer(illegalType));
        mapper.registerModule(module);

        try {
            mapper.readValue("{}", ProbeTarget.class);
            fail("Expected JsonMappingException to be thrown for illegal class type");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(illegalType.getRawClass().getName()));
        }
    }

    @Test
    public void testValidateSubType_directCallWithNullContextOnIllegalClass_throwsException()
            throws Exception {
        // Direct call with a null context on the "illegal" path: the code
        // reaches the throw statement, and JsonMappingException.from(...)
        // internally dereferences ctxt, causing a NullPointerException.
        // This still exercises / covers the "illegal class detected" branch
        // inside validateSubType.
        JavaType illegalType =
                TypeFactory.defaultInstance().constructType(java.util.logging.FileHandler.class);
        try {
            validator.validateSubType(null, illegalType);
            fail("Expected an exception to be thrown for illegal class type");
        } catch (NullPointerException expectedDueToNullContext) {
            // expected - confirms the throwing branch was reached
        } catch (JsonMappingException alsoAcceptable) {
            // also acceptable depending on Jackson version internals
        }
    }

    // ---------------------------------------------------------------
    // Helper types used to obtain a *real* DeserializationContext via
    // actual Jackson deserialization (no mocking frameworks involved).
    // ---------------------------------------------------------------

    public static class ProbeTarget {
    }

    static class ProbeDeserializer extends JsonDeserializer<ProbeTarget> {
        private final JavaType typeToValidate;

        ProbeDeserializer(JavaType typeToValidate) {
            this.typeToValidate = typeToValidate;
        }

        @Override
        public ProbeTarget deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            SubTypeValidator.instance().validateSubType(ctxt, typeToValidate);
            return new ProbeTarget();
        }
    }
}
