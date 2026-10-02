import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class TypeDeserializerBaseTest {

    /**
     * Minimal stub implementation of TypeIdResolver interface.
     * We do not need real behavior since none of the tested public
     * methods actually invoke its logic (only store/return the reference).
     */
    static class StubTypeIdResolver implements TypeIdResolver {
        @Override
        public void init(JavaType baseType) {
            // no-op
        }

        @Override
        public String idFromValue(Object value) {
            return null;
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return null;
        }

        @Override
        public String idFromBaseType() {
            return null;
        }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) throws IOException {
            return null;
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CLASS;
        }

        @Override
        public String getDescForKnownTypeIds() {
            return "stub-known-type-ids";
        }

        @Override
        public String toString() {
            return "StubTypeIdResolver";
        }
    }

    /**
     * Concrete subclass of the abstract TypeDeserializerBase, needed
     * because the class under test is abstract and cannot be
     * instantiated directly. This is not a mocking framework usage,
     * simply a manual concrete implementation required to exercise
     * the class under test's real logic.
     */
    static class ConcreteTypeDeserializer extends TypeDeserializerBase {

        private static final long serialVersionUID = 1L;

        protected ConcreteTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        protected ConcreteTypeDeserializer(ConcreteTypeDeserializer src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new ConcreteTypeDeserializer(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in tests");
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in tests");
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in tests");
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new UnsupportedOperationException("not used in tests");
        }
    }

    private JavaType stringType() {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    private JavaType objectType() {
        return TypeFactory.defaultInstance().constructType(Object.class);
    }

    // ---------------------------------------------------------------
    // (ก) Normal / typical input tests
    // ---------------------------------------------------------------

    @Test
    public void testBaseTypeName_normalInput_returnsFullyQualifiedClassName() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        assertEquals("java.lang.String", deser.baseTypeName());
    }

    @Test
    public void testGetPropertyName_normalInput_returnsGivenPropertyName() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        assertEquals("@type", deser.getPropertyName());
    }

    @Test
    public void testGetTypeIdResolver_normalInput_returnsSameInstance() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        assertSame(idRes, deser.getTypeIdResolver());
    }

    @Test
    public void testGetDefaultImpl_normalInput_returnsRawClassOfDefaultImpl() {
        JavaType baseType = stringType();
        JavaType defaultImpl = objectType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, defaultImpl);

        assertEquals(Object.class, deser.getDefaultImpl());
    }

    @Test
    public void testBaseType_normalInput_returnsSameJavaTypeInstance() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        assertSame(baseType, deser.baseType());
    }

    @Test
    public void testGetTypeInclusion_normalInput_returnsPropertyEnum() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        assertEquals(JsonTypeInfo.As.PROPERTY, deser.getTypeInclusion());
    }

    @Test
    public void testToString_normalInput_containsExpectedParts() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        String result = deser.toString();
        assertTrue(result.contains(ConcreteTypeDeserializer.class.getName()));
        assertTrue(result.contains("base-type:"));
        assertTrue(result.contains("id-resolver:"));
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
    }

    @Test
    public void testForProperty_normalInput_returnsNewInstanceWithSameBaseType() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        TypeDeserializer copy = deser.forProperty(null);

        assertNotNull(copy);
        assertNotSame(deser, copy);
        assertTrue(copy instanceof TypeDeserializerBase);
        TypeDeserializerBase copyBase = (TypeDeserializerBase) copy;
        assertEquals(deser.baseTypeName(), copyBase.baseTypeName());
        assertEquals(deser.getPropertyName(), copyBase.getPropertyName());
        assertSame(deser.getTypeIdResolver(), copyBase.getTypeIdResolver());
    }

    // ---------------------------------------------------------------
    // (ข) Edge case tests: null, empty string, boundary
    // ---------------------------------------------------------------

    @Test
    public void testGetPropertyName_nullTypePropertyName_returnsEmptyString() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        // Passing null for typePropertyName; class relies on ClassUtil.nonNullString
        // to convert null into an empty string.
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, null, false, null);

        assertEquals("", deser.getPropertyName());
    }

    @Test
    public void testGetPropertyName_emptyStringInput_returnsEmptyString() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "", false, null);

        assertEquals("", deser.getPropertyName());
    }

    @Test
    public void testGetDefaultImpl_nullDefaultImpl_returnsNull() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        assertNull(deser.getDefaultImpl());
    }

    @Test
    public void testGetTypeIdResolver_nullIdResolver_returnsNull() {
        JavaType baseType = stringType();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, null, "@type", false, null);

        assertNull(deser.getTypeIdResolver());
    }

    @Test
    public void testTypeIdVisible_edgeCaseTrueValue_doesNotAffectAccessors() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        // typeIdVisible = true, boundary boolean value
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", true, null);

        // No direct public getter for _typeIdVisible, but constructor should
        // not throw and other accessors should still work correctly.
        assertEquals("@type", deser.getPropertyName());
        assertEquals("java.lang.String", deser.baseTypeName());
    }

    @Test
    public void testForProperty_calledTwice_stillReturnsIndependentInstances() {
        JavaType baseType = stringType();
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                baseType, idRes, "@type", false, null);

        TypeDeserializer copy1 = deser.forProperty(null);
        TypeDeserializer copy2 = deser.forProperty(null);

        assertNotSame(copy1, copy2);
    }

    // ---------------------------------------------------------------
    // (ค) Exception scenarios
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testBaseTypeName_nullBaseType_throwsNullPointerException() {
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                null, idRes, "@type", false, null);

        // Calling baseTypeName() invokes _baseType.getRawClass() which
        // should throw NPE since _baseType is null.
        deser.baseTypeName();
    }

    @Test(expected = NullPointerException.class)
    public void testToString_nullBaseTypeStillFormatsButBaseTypeNameThrows_verifyNpeOnDirectCall() {
        // Separate scenario: ensure NPE surfaces distinctly when directly
        // exercising baseTypeName after construction with null base type,
        // confirming exception-path coverage independent of toString().
        TypeIdResolver idRes = new StubTypeIdResolver();
        ConcreteTypeDeserializer deser = new ConcreteTypeDeserializer(
                null, idRes, "@type", false, null);
        deser.baseTypeName();
    }
}
