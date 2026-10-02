package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StdKeyDeserializerTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    enum TestEnum {
        ALPHA,
        BETA;

        @Override
        public String toString() {
            return name().toLowerCase();
        }

        public static TestEnum customFactory(String key) {
            if ("customAlpha".equals(key)) {
                return ALPHA;
            }
            throw new IllegalArgumentException("Invalid key for custom factory: " + key);
        }
    }

    static class StringCtorSample {
        final String value;
        public StringCtorSample(String value) {
            this.value = value;
        }
    }

    static class StringFactorySample {
        final String value;
        private StringFactorySample(String value) {
            this.value = value;
        }
        public static StringFactorySample valueOf(String value) {
            return new StringFactorySample(value);
        }
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
    }

    @Test
    public void testForType_allSupportedTypes() {
        Assert.assertNotNull(StdKeyDeserializer.forType(String.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(Object.class));
        Assert.assertNotNull(StdKeyDeserializer.forType(CharSequence.class));
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
        Assert.assertNotNull(StdKeyDeserializer.forType(byte[].class));
        Assert.assertNull(StdKeyDeserializer.forType(StringBuilder.class));
    }

    @Test
    public void testDeserializeKey_nullKey_returnsNull() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Integer.class);
        Assert.assertNull(deser.deserializeKey(null, ctxt));
    }

    @Test
    public void testStringKD_deserializeKey() throws IOException {
        StdKeyDeserializer deserString = StdKeyDeserializer.forType(String.class);
        Assert.assertEquals("hello", deserString.deserializeKey("hello", ctxt));
        Assert.assertEquals(String.class, deserString.getKeyClass());

        StdKeyDeserializer deserObj = StdKeyDeserializer.forType(Object.class);
        Assert.assertEquals("test", deserObj.deserializeKey("test", ctxt));
        Assert.assertEquals(Object.class, deserObj.getKeyClass());

        StdKeyDeserializer deserSeq = StdKeyDeserializer.forType(CharSequence.class);
        Assert.assertEquals("seq", deserSeq.deserializeKey("seq", ctxt));
        Assert.assertEquals(CharSequence.class, deserSeq.getKeyClass());
    }

    @Test
    public void testBoolean_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Boolean.class);
        Assert.assertEquals(Boolean.TRUE, deser.deserializeKey("true", ctxt));
        Assert.assertEquals(Boolean.FALSE, deser.deserializeKey("false", ctxt));

        try {
            deser.deserializeKey("True", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testByte_validRangeAndOverflow() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Byte.class);
        Assert.assertEquals(Byte.valueOf((byte) 0), deser.deserializeKey("0", ctxt));
        Assert.assertEquals(Byte.valueOf((byte) 127), deser.deserializeKey("127", ctxt));
        Assert.assertEquals(Byte.valueOf((byte) -128), deser.deserializeKey("-128", ctxt));
        Assert.assertEquals(Byte.valueOf((byte) 255), deser.deserializeKey("255", ctxt));

        try {
            deser.deserializeKey("256", ctxt);
            Assert.fail("Expected InvalidFormatException on overflow");
        } catch (InvalidFormatException e) {
            // expected
        }

        try {
            deser.deserializeKey("-129", ctxt);
            Assert.fail("Expected InvalidFormatException on underflow");
        } catch (InvalidFormatException e) {
            // expected
        }

        try {
            deser.deserializeKey("notAByte", ctxt);
            Assert.fail("Expected InvalidFormatException on non-numeric");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testShort_validRangeAndOverflow() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Short.class);
        Assert.assertEquals(Short.valueOf((short) 0), deser.deserializeKey("0", ctxt));
        Assert.assertEquals(Short.valueOf((short) 32767), deser.deserializeKey("32767", ctxt));
        Assert.assertEquals(Short.valueOf((short) -32768), deser.deserializeKey("-32768", ctxt));

        try {
            deser.deserializeKey("32768", ctxt);
            Assert.fail("Expected InvalidFormatException on overflow");
        } catch (InvalidFormatException e) {
            // expected
        }

        try {
            deser.deserializeKey("-32769", ctxt);
            Assert.fail("Expected InvalidFormatException on underflow");
        } catch (InvalidFormatException e) {
            // expected
        }

        try {
            deser.deserializeKey("abc", ctxt);
            Assert.fail("Expected InvalidFormatException on non-numeric");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testCharacter_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Character.class);
        Assert.assertEquals(Character.valueOf('a'), deser.deserializeKey("a", ctxt));

        try {
            deser.deserializeKey("", ctxt);
            Assert.fail("Expected InvalidFormatException on empty string");
        } catch (InvalidFormatException e) {
            // expected
        }

        try {
            deser.deserializeKey("ab", ctxt);
            Assert.fail("Expected InvalidFormatException on multi-character string");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testInt_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Integer.class);
        Assert.assertEquals(12345, deser.deserializeKey("12345", ctxt));
        Assert.assertEquals(-12345, deser.deserializeKey("-12345", ctxt));

        try {
            deser.deserializeKey("invalidInt", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testLong_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Long.class);
        Assert.assertEquals(1234567890123L, deser.deserializeKey("1234567890123", ctxt));
        Assert.assertEquals(-1234567890123L, deser.deserializeKey("-1234567890123", ctxt));

        try {
            deser.deserializeKey("invalidLong", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testFloat_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Float.class);
        Assert.assertEquals(12.34f, (Float) deser.deserializeKey("12.34", ctxt), 0.0001f);
        Assert.assertEquals(-12.34f, (Float) deser.deserializeKey("-12.34", ctxt), 0.0001f);

        try {
            deser.deserializeKey("invalidFloat", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testDouble_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Double.class);
        Assert.assertEquals(123.456, (Double) deser.deserializeKey("123.456", ctxt), 0.000001);
        Assert.assertEquals(-123.456, (Double) deser.deserializeKey("-123.456", ctxt), 0.000001);

        try {
            deser.deserializeKey("invalidDouble", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testLocale_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Locale.class);
        Assert.assertEquals(Locale.US, deser.deserializeKey("en_US", ctxt));
    }

    @Test
    public void testCurrency_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Currency.class);
        Assert.assertEquals(Currency.getInstance("USD"), deser.deserializeKey("USD", ctxt));

        try {
            deser.deserializeKey("UNKNOWN_CURRENCY", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testDateAndCalendar_validAndInvalid() throws IOException {
        StdKeyDeserializer deserDate = StdKeyDeserializer.forType(Date.class);
        Object dateObj = deserDate.deserializeKey("2020-01-01T00:00:00.000+00:00", ctxt);
        Assert.assertTrue(dateObj instanceof Date);

        StdKeyDeserializer deserCal = StdKeyDeserializer.forType(Calendar.class);
        Object calObj = deserCal.deserializeKey("2020-01-01T00:00:00.000+00:00", ctxt);
        Assert.assertTrue(calObj instanceof Calendar);

        try {
            deserDate.deserializeKey("notADate", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }

        try {
            deserCal.deserializeKey("notACalendarDate", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testUUID_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(UUID.class);
        UUID uuid = UUID.randomUUID();
        Assert.assertEquals(uuid, deser.deserializeKey(uuid.toString(), ctxt));

        try {
            deser.deserializeKey("invalid-uuid-string", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testURI_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(URI.class);
        URI uri = URI.create("http://localhost:8080/test");
        Assert.assertEquals(uri, deser.deserializeKey("http://localhost:8080/test", ctxt));

        try {
            deser.deserializeKey("http://invalid uri with spaces", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testURL_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(URL.class);
        URL url = new URL("http://localhost:8080/path");
        Assert.assertEquals(url, deser.deserializeKey("http://localhost:8080/path", ctxt));

        try {
            deser.deserializeKey("invalidUrlProtocol", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testClass_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(Class.class);
        Assert.assertEquals(String.class, deser.deserializeKey(String.class.getName(), ctxt));

        try {
            deser.deserializeKey("com.nonexistent.Class12345", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testByteArray_validAndInvalid() throws IOException {
        StdKeyDeserializer deser = StdKeyDeserializer.forType(byte[].class);
        byte[] original = new byte[] { 1, 2, 3, 4, 5 };
        String encoded = Base64Variants.MIME.encode(original);
        byte[] decoded = (byte[]) deser.deserializeKey(encoded, ctxt);
        Assert.assertArrayEquals(original, decoded);

        try {
            deser.deserializeKey("!NotValidBase64#@", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testUnknownKind_throwsIllegalStateException() throws Exception {
        StdKeyDeserializer deser = new StdKeyDeserializer(999, String.class);
        deser._parse("key", ctxt);
    }

    @Test
    public void testStringCtorKeyDeserializer() throws Exception {
        Constructor<?> ctor = StringCtorSample.class.getConstructor(String.class);
        StdKeyDeserializer.StringCtorKeyDeserializer deser = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);

        Object result = deser.deserializeKey("myValue", ctxt);
        Assert.assertTrue(result instanceof StringCtorSample);
        Assert.assertEquals("myValue", ((StringCtorSample) result).value);
        Assert.assertEquals(StringCtorSample.class, deser.getKeyClass());
    }

    @Test
    public void testStringFactoryKeyDeserializer() throws Exception {
        Method factoryMethod = StringFactorySample.class.getMethod("valueOf", String.class);
        StdKeyDeserializer.StringFactoryKeyDeserializer deser = new StdKeyDeserializer.StringFactoryKeyDeserializer(factoryMethod);

        Object result = deser.deserializeKey("factoryValue", ctxt);
        Assert.assertTrue(result instanceof StringFactorySample);
        Assert.assertEquals("factoryValue", ((StringFactorySample) result).value);
        Assert.assertEquals(StringFactorySample.class, deser.getKeyClass());
    }

    @Test
    public void testDelegatingKD() throws IOException {
        JsonDeserializer<String> stringDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "wrapped:" + p.getText();
            }
        };

        StdKeyDeserializer.DelegatingKD delegatingKD = new StdKeyDeserializer.DelegatingKD(String.class, stringDeser);
        Assert.assertEquals(String.class, delegatingKD.getKeyClass());
        Assert.assertNull(delegatingKD.deserializeKey(null, ctxt));
        Assert.assertEquals("wrapped:testKey", delegatingKD.deserializeKey("testKey", ctxt));

        JsonDeserializer<String> nullDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        StdKeyDeserializer.DelegatingKD returningNullKD = new StdKeyDeserializer.DelegatingKD(String.class, nullDeser);
        try {
            returningNullKD.deserializeKey("testKey", ctxt);
            Assert.fail("Expected InvalidFormatException on null result");
        } catch (InvalidFormatException e) {
            // expected
        }

        JsonDeserializer<String> throwingDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) {
                throw new RuntimeException("custom deserializer error");
            }
        };
        StdKeyDeserializer.DelegatingKD throwingKD = new StdKeyDeserializer.DelegatingKD(String.class, throwingDeser);
        try {
            throwingKD.deserializeKey("testKey", ctxt);
            Assert.fail("Expected InvalidFormatException on delegate exception");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testEnumKD_standardResolution() throws IOException {
        EnumResolver enumResolver = EnumResolver.constructFor(ctxt.getConfig(), TestEnum.class);
        StdKeyDeserializer.EnumKD enumKD = new StdKeyDeserializer.EnumKD(enumResolver, null);

        Assert.assertEquals(TestEnum.ALPHA, enumKD.deserializeKey("ALPHA", ctxt));
        Assert.assertEquals(TestEnum.BETA, enumKD.deserializeKey("BETA", ctxt));

        try {
            enumKD.deserializeKey("GAMMA", ctxt);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            // expected
        }
    }

    @Test
    public void testEnumKD_readUnknownAsNull() throws IOException {
        ObjectMapper mapperUnknownNull = new ObjectMapper();
        mapperUnknownNull.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
        DeserializationContext unknownNullCtxt = mapperUnknownNull.getDeserializationContext();

        EnumResolver enumResolver = EnumResolver.constructFor(unknownNullCtxt.getConfig(), TestEnum.class);
        StdKeyDeserializer.EnumKD enumKD = new StdKeyDeserializer.EnumKD(enumResolver, null);

        Assert.assertNull(enumKD.deserializeKey("GAMMA", unknownNullCtxt));
    }

    @Test
    public void testEnumKD_usingDefaultValue() throws IOException {
        ObjectMapper mapperDefault = new ObjectMapper();
        mapperDefault.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true);
        DeserializationContext defaultCtxt = mapperDefault.getDeserializationContext();

        EnumResolver enumResolver = EnumResolver.constructUsingMethod(defaultCtxt.getConfig(), TestEnum.class, null);
        EnumResolver enumResolverWithDefault = EnumResolver.constructFor(defaultCtxt.getConfig(), TestEnum.class);

        AnnotatedClass ac = AnnotatedClassResolver.resolve(defaultCtxt.getConfig(), defaultCtxt.constructType(TestEnum.class), null);
        EnumResolver resolverWithDef = EnumResolver.constructUsingToString(defaultCtxt.getConfig(), TestEnum.class);

        EnumResolver customResolver = new EnumResolver(TestEnum.class, TestEnum.values(),
                enumResolverWithDefault.getEnumIds().toArray(new String[0]), TestEnum.BETA, false) {};

        StdKeyDeserializer.EnumKD enumKD = new StdKeyDeserializer.EnumKD(customResolver, null);
        Assert.assertEquals(TestEnum.BETA, enumKD.deserializeKey("UNKNOWN_VAL", defaultCtxt));
    }

    @Test
    public void testEnumKD_usingToString() throws IOException {
        ObjectMapper mapperToString = new ObjectMapper();
        mapperToString.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        DeserializationContext toStringCtxt = mapperToString.getDeserializationContext();

        EnumResolver enumResolver = EnumResolver.constructFor(toStringCtxt.getConfig(), TestEnum.class);
        StdKeyDeserializer.EnumKD enumKD = new StdKeyDeserializer.EnumKD(enumResolver, null);

        Assert.assertEquals(TestEnum.ALPHA, enumKD.deserializeKey("alpha", toStringCtxt));
        Assert.assertEquals(TestEnum.BETA, enumKD.deserializeKey("beta", toStringCtxt));
    }

    @Test
    public void testEnumKD_withFactoryMethod() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(ctxt.getConfig(), ctxt.constructType(TestEnum.class), null);
        Method factoryM = TestEnum.class.getMethod("customFactory", String.class);
        AnnotatedMethod annotatedMethod = null;
        for (AnnotatedMethod am : ac.getFactoryMethods()) {
            if ("customFactory".equals(am.getName())) {
                annotatedMethod = am;
                break;
            }
        }
        if (annotatedMethod == null) {
            annotatedMethod = new AnnotatedMethod(null, factoryM, null, null);
        }

        EnumResolver enumResolver = EnumResolver.constructFor(ctxt.getConfig(), TestEnum.class);
        StdKeyDeserializer.EnumKD enumKD = new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);

        Assert.assertEquals(TestEnum.ALPHA, enumKD.deserializeKey("customAlpha", ctxt));

        try {
            enumKD.deserializeKey("customInvalid", ctxt);
            Assert.fail("Expected InvalidFormatException due to IAE in factory");
        } catch (InvalidFormatException e) {
            // expected
        }
    }
}
