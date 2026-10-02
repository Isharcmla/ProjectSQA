package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;

public class StdKeyDeserializerTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    enum SampleEnum {
        FOO, BAR
    }

    public static class SampleCtor {
        public final String value;
        public SampleCtor(String value) {
            this.value = value;
        }
    }

    public static class SampleFactory {
        public final String value;
        private SampleFactory(String value) {
            this.value = value;
        }
        public static SampleFactory valueOf(String value) {
            if ("error".equals(value)) {
                throw new IllegalArgumentException("Forced factory error");
            }
            return new SampleFactory(value);
        }
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
    }

    private DeserializationContext createContext() throws Exception {
        JsonParser p = mapper.getFactory().createParser("{}");
        return mapper.createDeserializationContext(p, mapper.getDeserializationConfig());
    }

    @Test
    public void testForType_allSupportedTypes() {
        Assert.assertNotNull(StdKeyDeserializer.forType(String.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Object.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(UUID.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Integer.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Long.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Date.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Calendar.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Boolean.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Byte.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Character.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Short.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Float.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Double.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(URI.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(URL.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Class.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Locale.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Currency.class));
        Assert.assertNull(StdKeyDeserializer.forType(StringBuilder.class));
    }

    @Test
    public void testDeserializeKey_nullKey_returnsNull() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        DeserializationContext dc = createContext();
        Assert.assertNull(kd.deserializeKey(null, dc));
    }

    @Test
    public void testGetKeyClass() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        Assert.assertEquals(Integer.class, kd.getKeyClass());
    }

    @Test
    public void testBoolean_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(Boolean.TRUE, kd.deserializeKey("true", dc));
        Assert.assertEquals(Boolean.FALSE, kd.deserializeKey("false", dc));

        try {
            kd.deserializeKey("invalid", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testByte_validOverflowAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(Byte.valueOf((byte) 127), kd.deserializeKey("127", dc));
        Assert.assertEquals(Byte.valueOf((byte) -128), kd.deserializeKey("-128", dc));
        Assert.assertEquals(Byte.valueOf((byte) 200), kd.deserializeKey("200", dc));

        try {
            kd.deserializeKey("256", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("-129", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("not-a-number", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testShort_validOverflowAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(Short.valueOf((short) 1000), kd.deserializeKey("1000", dc));
        Assert.assertEquals(Short.valueOf((short) -32768), kd.deserializeKey("-32768", dc));
        Assert.assertEquals(Short.valueOf((short) 32767), kd.deserializeKey("32767", dc));

        try {
            kd.deserializeKey("32768", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("-32769", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("abc", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testCharacter_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(Character.valueOf('A'), kd.deserializeKey("A", dc));
        Assert.assertEquals(Character.valueOf('0'), kd.deserializeKey("0", dc));

        try {
            kd.deserializeKey("", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("AB", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testIntAndLong_validAndInvalid() throws Exception {
        StdKeyDeserializer intKd = StdKeyDeserializer.forType(Integer.class);
        StdKeyDeserializer longKd = StdKeyDeserializer.forType(Long.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(Integer.valueOf(12345), intKd.deserializeKey("12345", dc));
        Assert.assertEquals(Integer.valueOf(-12345), intKd.deserializeKey("-12345", dc));
        Assert.assertEquals(Long.valueOf(1234567890123L), longKd.deserializeKey("1234567890123", dc));
        Assert.assertEquals(Long.valueOf(-1234567890123L), longKd.deserializeKey("-1234567890123", dc));

        try {
            intKd.deserializeKey("not-an-int", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            longKd.deserializeKey("not-a-long", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testFloatAndDouble_validAndInvalid() throws Exception {
        StdKeyDeserializer floatKd = StdKeyDeserializer.forType(Float.class);
        StdKeyDeserializer doubleKd = StdKeyDeserializer.forType(Double.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(Float.valueOf(1.25f), floatKd.deserializeKey("1.25", dc));
        Assert.assertEquals(Double.valueOf(1.25d), doubleKd.deserializeKey("1.25", dc));

        try {
            floatKd.deserializeKey("not-a-float", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            doubleKd.deserializeKey("not-a-double", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testLocaleAndCurrency_validAndInvalid() throws Exception {
        StdKeyDeserializer locKd = StdKeyDeserializer.forType(Locale.class);
        StdKeyDeserializer curKd = StdKeyDeserializer.forType(Currency.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(Locale.ENGLISH, locKd.deserializeKey("en", dc));
        Assert.assertEquals(Currency.getInstance("USD"), curKd.deserializeKey("USD", dc));

        try {
            curKd.deserializeKey("NOT_A_CURRENCY", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDateAndCalendar_valid() throws Exception {
        StdKeyDeserializer dateKd = StdKeyDeserializer.forType(Date.class);
        StdKeyDeserializer calKd = StdKeyDeserializer.forType(Calendar.class);
        DeserializationContext dc = createContext();

        Date date = (Date) dateKd.deserializeKey("2020-01-01T00:00:00.000+0000", dc);
        Assert.assertNotNull(date);

        Calendar cal = (Calendar) calKd.deserializeKey("2020-01-01T00:00:00.000+0000", dc);
        Assert.assertNotNull(cal);
    }

    @Test
    public void testUUID_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        DeserializationContext dc = createContext();

        UUID uuid = UUID.randomUUID();
        Assert.assertEquals(uuid, kd.deserializeKey(uuid.toString(), dc));

        try {
            kd.deserializeKey("invalid-uuid", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testUriAndUrl_validAndInvalid() throws Exception {
        StdKeyDeserializer uriKd = StdKeyDeserializer.forType(URI.class);
        StdKeyDeserializer urlKd = StdKeyDeserializer.forType(URL.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(URI.create("http://localhost:8080/test"), uriKd.deserializeKey("http://localhost:8080/test", dc));
        Assert.assertEquals(new URL("http://localhost:8080/test"), urlKd.deserializeKey("http://localhost:8080/test", dc));

        try {
            uriKd.deserializeKey("http://invalid uri", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            urlKd.deserializeKey("invalid-protocol://path", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testClass_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals(String.class, kd.deserializeKey(String.class.getName(), dc));

        try {
            kd.deserializeKey("com.nonexistent.Class12345", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testStringKD_forType() throws Exception {
        StdKeyDeserializer.StringKD s1 = StdKeyDeserializer.StringKD.forType(String.class);
        StdKeyDeserializer.StringKD s2 = StdKeyDeserializer.StringKD.forType(Object.class);
        StdKeyDeserializer.StringKD s3 = StdKeyDeserializer.StringKD.forType(CharSequence.class);
        DeserializationContext dc = createContext();

        Assert.assertEquals("test", s1.deserializeKey("test", dc));
        Assert.assertEquals("test", s2.deserializeKey("test", dc));
        Assert.assertEquals("test", s3.deserializeKey("test", dc));
    }

    @Test
    public void testDelegatingKD() throws Exception {
        JsonDeserializer<String> deser = new FromStringDeserializer<String>(String.class) {
            @Override
            protected String _deserialize(String value, DeserializationContext ctxt) {
                if ("nullValue".equals(value)) {
                    return null;
                }
                if ("throwError".equals(value)) {
                    throw new RuntimeException("delegating fail");
                }
                return value.toUpperCase();
            }
        };

        StdKeyDeserializer.DelegatingKD delegatingKD = new StdKeyDeserializer.DelegatingKD(String.class, deser);
        DeserializationContext dc = createContext();

        Assert.assertEquals(String.class, delegatingKD.getKeyClass());
        Assert.assertNull(delegatingKD.deserializeKey(null, dc));

        try {
            delegatingKD.deserializeKey("nullValue", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            delegatingKD.deserializeKey("throwError", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testEnumKD_standardAndFeatures() throws Exception {
        EnumResolver enumRes = EnumResolver.constructUnsafe(SampleEnum.class, mapper.getDeserializationConfig().getAnnotationIntrospector());
        StdKeyDeserializer.EnumKD enumKd = new StdKeyDeserializer.EnumKD(enumRes, null);

        DeserializationContext dc = createContext();
        Assert.assertEquals(SampleEnum.FOO, enumKd.deserializeKey("FOO", dc));
        Assert.assertEquals(SampleEnum.BAR, enumKd.deserializeKey("BAR", dc));

        try {
            enumKd.deserializeKey("NON_EXISTING", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        ObjectMapper mapperUnknownNull = new ObjectMapper();
        mapperUnknownNull.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
        JsonParser p1 = mapperUnknownNull.getFactory().createParser("{}");
        DeserializationContext dcUnknownNull = mapperUnknownNull.createDeserializationContext(p1, mapperUnknownNull.getDeserializationConfig());
        Assert.assertNull(enumKd.deserializeKey("NON_EXISTING", dcUnknownNull));

        ObjectMapper mapperToString = new ObjectMapper();
        mapperToString.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        JsonParser p2 = mapperToString.getFactory().createParser("{}");
        DeserializationContext dcToString = mapperToString.createDeserializationContext(p2, mapperToString.getDeserializationConfig());
        Assert.assertEquals(SampleEnum.FOO, enumKd.deserializeKey("FOO", dcToString));
    }

    @Test
    public void testEnumKD_withFactoryMethod() throws Exception {
        Method m = SampleEnum.class.getMethod("valueOf", String.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(TypeFactory.defaultInstance(), TypeFactory.defaultInstance().constructType(SampleEnum.class).getBindings());
        AnnotatedMethod annotatedMethod = new AnnotatedMethod(typeResCtxt, m, null, null);

        EnumResolver enumRes = EnumResolver.constructUnsafe(SampleEnum.class, mapper.getDeserializationConfig().getAnnotationIntrospector());
        StdKeyDeserializer.EnumKD enumKd = new StdKeyDeserializer.EnumKD(enumRes, annotatedMethod);

        DeserializationContext dc = createContext();
        Assert.assertEquals(SampleEnum.FOO, enumKd.deserializeKey("FOO", dc));

        try {
            enumKd.deserializeKey("UNKNOWN", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testStringCtorKeyDeserializer() throws Exception {
        Constructor<?> ctor = SampleCtor.class.getConstructor(String.class);
        StdKeyDeserializer.StringCtorKeyDeserializer ctorKd = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);
        DeserializationContext dc = createContext();

        Object result = ctorKd.deserializeKey("test-ctor-value", dc);
        Assert.assertTrue(result instanceof SampleCtor);
        Assert.assertEquals("test-ctor-value", ((SampleCtor) result).value);
    }

    @Test
    public void testStringFactoryKeyDeserializer() throws Exception {
        Method method = SampleFactory.class.getMethod("valueOf", String.class);
        StdKeyDeserializer.StringFactoryKeyDeserializer factoryKd = new StdKeyDeserializer.StringFactoryKeyDeserializer(method);
        DeserializationContext dc = createContext();

        Object result = factoryKd.deserializeKey("test-factory-value", dc);
        Assert.assertTrue(result instanceof SampleFactory);
        Assert.assertEquals("test-factory-value", ((SampleFactory) result).value);

        try {
            factoryKd.deserializeKey("error", dc);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testParse_invalidKind_throwsIllegalStateException() throws Exception {
        StdKeyDeserializer kd = new StdKeyDeserializer(999, String.class);
        DeserializationContext dc = createContext();
        kd._parse("test", dc);
    }
}
