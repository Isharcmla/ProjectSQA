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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StdKeyDeserializerTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    public enum SampleEnum {
        FIRST, SECOND;

        @Override
        public String toString() {
            return "custom_" + name().toLowerCase();
        }

        public static SampleEnum customFactory(String key) {
            if ("first_item".equals(key)) {
                return FIRST;
            }
            if ("error".equals(key)) {
                throw new IllegalArgumentException("invalid factory value");
            }
            return null;
        }
    }

    public static class SampleClassCtor {
        public final String value;

        public SampleClassCtor(String value) {
            this.value = value;
        }
    }

    public static class SampleClassFactory {
        public final String value;

        private SampleClassFactory(String value) {
            this.value = value;
        }

        public static SampleClassFactory create(String value) {
            return new SampleClassFactory(value);
        }
    }

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        ctxt = createCtxt(mapper);
    }

    private DeserializationContext createCtxt(ObjectMapper mapper) throws Exception {
        DefaultDeserializationContext defaultCtxt = (DefaultDeserializationContext) mapper.getDeserializationContext();
        JsonParser parser = mapper.getFactory().createParser("{}");
        return defaultCtxt.createInstance(mapper.getDeserializationConfig(), parser, mapper.getInjectableValues());
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
        Assert.assertNull(StdKeyDeserializer.forType(java.util.List.class));
    }

    @Test
    public void testGetKeyClass() {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        Assert.assertEquals(Integer.class, kd.getKeyClass());
    }

    @Test
    public void testDeserializeKey_nullKey() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        Assert.assertNull(kd.deserializeKey(null, ctxt));
    }

    @Test
    public void testBoolean_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        Assert.assertEquals(Boolean.TRUE, kd.deserializeKey("true", ctxt));
        Assert.assertEquals(Boolean.FALSE, kd.deserializeKey("false", ctxt));

        try {
            kd.deserializeKey("TRUE", ctxt);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testByte_validAndOverflow() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        Assert.assertEquals((byte) 0, kd.deserializeKey("0", ctxt));
        Assert.assertEquals((byte) 127, kd.deserializeKey("127", ctxt));
        Assert.assertEquals((byte) -128, kd.deserializeKey("-128", ctxt));
        Assert.assertEquals((byte) 255, kd.deserializeKey("255", ctxt));

        try {
            kd.deserializeKey("256", ctxt);
            Assert.fail("Expected overflow exception");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("-129", ctxt);
            Assert.fail("Expected overflow exception");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("not-a-number", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testShort_validAndOverflow() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        Assert.assertEquals((short) 0, kd.deserializeKey("0", ctxt));
        Assert.assertEquals((short) 32767, kd.deserializeKey("32767", ctxt));
        Assert.assertEquals((short) -32768, kd.deserializeKey("-32768", ctxt));

        try {
            kd.deserializeKey("32768", ctxt);
            Assert.fail("Expected overflow exception");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("-32769", ctxt);
            Assert.fail("Expected overflow exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testCharacter_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        Assert.assertEquals('a', kd.deserializeKey("a", ctxt));
        Assert.assertEquals('Z', kd.deserializeKey("Z", ctxt));

        try {
            kd.deserializeKey("", ctxt);
            Assert.fail("Expected exception for empty string");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kd.deserializeKey("ab", ctxt);
            Assert.fail("Expected exception for multi-char string");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testInt_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        Assert.assertEquals(12345, kd.deserializeKey("12345", ctxt));
        Assert.assertEquals(-12345, kd.deserializeKey("-12345", ctxt));

        try {
            kd.deserializeKey("abc", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testLong_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        Assert.assertEquals(1234567890123L, kd.deserializeKey("1234567890123", ctxt));
        Assert.assertEquals(-1234567890123L, kd.deserializeKey("-1234567890123", ctxt));

        try {
            kd.deserializeKey("abc", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testFloatAndDouble_validAndInvalid() throws Exception {
        StdKeyDeserializer kdFloat = StdKeyDeserializer.forType(Float.class);
        Assert.assertEquals(1.25f, (Float) kdFloat.deserializeKey("1.25", ctxt), 0.0001f);

        StdKeyDeserializer kdDouble = StdKeyDeserializer.forType(Double.class);
        Assert.assertEquals(3.14159, (Double) kdDouble.deserializeKey("3.14159", ctxt), 0.00001);

        try {
            kdFloat.deserializeKey("not-a-float", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            kdDouble.deserializeKey("not-a-double", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testLocale_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Locale.class);
        Assert.assertEquals(Locale.ENGLISH, kd.deserializeKey("en", ctxt));
        Assert.assertEquals(Locale.US, kd.deserializeKey("en_US", ctxt));
    }

    @Test
    public void testCurrency_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Currency.class);
        Assert.assertEquals(Currency.getInstance("USD"), kd.deserializeKey("USD", ctxt));

        try {
            kd.deserializeKey("INVALID_CURR", ctxt);
            Assert.fail("Expected exception for invalid currency");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDateAndCalendar_validAndInvalid() throws Exception {
        StdKeyDeserializer kdDate = StdKeyDeserializer.forType(Date.class);
        Object date = kdDate.deserializeKey("2020-01-01T00:00:00.000+0000", ctxt);
        Assert.assertTrue(date instanceof Date);

        StdKeyDeserializer kdCal = StdKeyDeserializer.forType(Calendar.class);
        Object cal = kdCal.deserializeKey("2020-01-01T00:00:00.000+0000", ctxt);
        Assert.assertTrue(cal instanceof Calendar);

        try {
            kdDate.deserializeKey("invalid-date", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testUUID_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        UUID uuid = UUID.randomUUID();
        Assert.assertEquals(uuid, kd.deserializeKey(uuid.toString(), ctxt));

        try {
            kd.deserializeKey("invalid-uuid", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testURIAndURL_validAndInvalid() throws Exception {
        StdKeyDeserializer kdUri = StdKeyDeserializer.forType(URI.class);
        Assert.assertEquals(URI.create("http://localhost:8080/test"), kdUri.deserializeKey("http://localhost:8080/test", ctxt));

        StdKeyDeserializer kdUrl = StdKeyDeserializer.forType(URL.class);
        Assert.assertEquals(new URL("http://localhost:8080/test"), kdUrl.deserializeKey("http://localhost:8080/test", ctxt));

        try {
            kdUrl.deserializeKey("not_a_valid_url", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testClass_validAndInvalid() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        Assert.assertEquals(String.class, kd.deserializeKey("java.lang.String", ctxt));

        try {
            kd.deserializeKey("com.nonexistent.NoSuchClass", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testProtectedHelpers() {
        StdKeyDeserializer kd = new StdKeyDeserializer(StdKeyDeserializer.TYPE_INT, Integer.class);
        Assert.assertEquals(42, kd._parseInt("42"));
        Assert.assertEquals(4242424242L, kd._parseLong("4242424242"));
        Assert.assertEquals(42.5, kd._parseDouble("42.5"), 0.001);
    }

    @Test
    public void testUnknownKind_returnsNullFromParse() throws Exception {
        StdKeyDeserializer kd = new StdKeyDeserializer(999, Object.class);
        try {
            kd.deserializeKey("anything", ctxt);
            Assert.fail("Expected exception since _parse returns null");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testStringKD() throws Exception {
        StdKeyDeserializer.StringKD kdString = StdKeyDeserializer.StringKD.forType(String.class);
        Assert.assertEquals("hello", kdString.deserializeKey("hello", ctxt));

        StdKeyDeserializer.StringKD kdObject = StdKeyDeserializer.StringKD.forType(Object.class);
        Assert.assertEquals("hello", kdObject.deserializeKey("hello", ctxt));

        StdKeyDeserializer.StringKD kdOther = StdKeyDeserializer.StringKD.forType(CharSequence.class);
        Assert.assertEquals("hello", kdOther.deserializeKey("hello", ctxt));
        Assert.assertEquals(CharSequence.class, kdOther.getKeyClass());
    }

    @Test
    public void testStringCtorKeyDeserializer() throws Exception {
        Constructor<SampleClassCtor> ctor = SampleClassCtor.class.getConstructor(String.class);
        StdKeyDeserializer.StringCtorKeyDeserializer kd = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);
        Object result = kd.deserializeKey("ctor_test", ctxt);
        Assert.assertTrue(result instanceof SampleClassCtor);
        Assert.assertEquals("ctor_test", ((SampleClassCtor) result).value);
    }

    @Test
    public void testStringFactoryKeyDeserializer() throws Exception {
        Method method = SampleClassFactory.class.getMethod("create", String.class);
        StdKeyDeserializer.StringFactoryKeyDeserializer kd = new StdKeyDeserializer.StringFactoryKeyDeserializer(method);
        Object result = kd.deserializeKey("factory_test", ctxt);
        Assert.assertTrue(result instanceof SampleClassFactory);
        Assert.assertEquals("factory_test", ((SampleClassFactory) result).value);
    }

    @Test
    public void testDelegatingKD() throws Exception {
        JsonDeserializer<String> deser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) {
                return "delegated_result";
            }
        };

        StdKeyDeserializer.DelegatingKD kd = new StdKeyDeserializer.DelegatingKD(String.class, deser);
        Assert.assertEquals(String.class, kd.getKeyClass());
        Assert.assertNull(kd.deserializeKey(null, ctxt));
        Assert.assertEquals("delegated_result", kd.deserializeKey("some_key", ctxt));

        JsonDeserializer<String> nullDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        StdKeyDeserializer.DelegatingKD kdNull = new StdKeyDeserializer.DelegatingKD(String.class, nullDeser);
        try {
            kdNull.deserializeKey("some_key", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }

        JsonDeserializer<String> errorDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new IOException("error in delegate");
            }
        };
        StdKeyDeserializer.DelegatingKD kdError = new StdKeyDeserializer.DelegatingKD(String.class, errorDeser);
        try {
            kdError.deserializeKey("some_key", ctxt);
            Assert.fail("Expected exception");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testEnumKD_byName() throws Exception {
        EnumResolver enumRes = EnumResolver.constructUnsafe(SampleEnum.class, mapper.getDeserializationConfig().getAnnotationIntrospector());
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(enumRes, null);

        Assert.assertEquals(SampleEnum.FIRST, kd.deserializeKey("FIRST", ctxt));
        Assert.assertEquals(SampleEnum.SECOND, kd.deserializeKey("SECOND", ctxt));

        try {
            kd.deserializeKey("UNKNOWN_VALUE", ctxt);
            Assert.fail("Expected exception for unknown enum value");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testEnumKD_readUnknownAsNull() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
        DeserializationContext localCtxt = createCtxt(localMapper);

        EnumResolver enumRes = EnumResolver.constructUnsafe(SampleEnum.class, localMapper.getDeserializationConfig().getAnnotationIntrospector());
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(enumRes, null);

        Assert.assertNull(kd.deserializeKey("NON_EXISTING", localCtxt));
    }

    @Test
    public void testEnumKD_byToString() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        DeserializationContext localCtxt = createCtxt(localMapper);

        EnumResolver enumRes = EnumResolver.constructUnsafe(SampleEnum.class, localMapper.getDeserializationConfig().getAnnotationIntrospector());
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(enumRes, null);

        Assert.assertEquals(SampleEnum.FIRST, kd.deserializeKey("custom_first", localCtxt));
        Assert.assertEquals(SampleEnum.SECOND, kd.deserializeKey("custom_second", localCtxt));
    }

    @Test
    public void testEnumKD_withFactoryMethod() throws Exception {
        Method factoryMethod = SampleEnum.class.getMethod("customFactory", String.class);
        TypeResolutionContext trc = new TypeResolutionContext.Basic(TypeFactory.defaultInstance(), TypeFactory.defaultInstance().constructType(SampleEnum.class).getBindings());
        AnnotatedMethod am = new AnnotatedMethod(trc, factoryMethod, null, null);

        EnumResolver enumRes = EnumResolver.constructUnsafe(SampleEnum.class, mapper.getDeserializationConfig().getAnnotationIntrospector());
        StdKeyDeserializer.EnumKD kd = new StdKeyDeserializer.EnumKD(enumRes, am);

        Assert.assertEquals(SampleEnum.FIRST, kd.deserializeKey("first_item", ctxt));

        try {
            kd.deserializeKey("error", ctxt);
            Assert.fail("Expected exception from factory method");
        } catch (JsonMappingException e) {
            // expected
        }
    }
}
