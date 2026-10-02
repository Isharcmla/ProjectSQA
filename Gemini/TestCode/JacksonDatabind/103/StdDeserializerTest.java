package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class StdDeserializerTest {

    private ObjectMapper mapper;
    private JsonFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        factory = mapper.getFactory();
    }

    @JacksonStdImpl
    private static class StdImplDeserializer extends StdDeserializer<Object> {
        public StdImplDeserializer() {
            super(Object.class);
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return null;
        }
    }

    @JacksonStdImpl
    private static class StdImplKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }
    }

    private static class ConcreteStdDeserializer<T> extends StdDeserializer<T> {
        private final JavaType _customType;

        public ConcreteStdDeserializer(Class<?> vc) {
            super(vc);
            _customType = null;
        }

        public ConcreteStdDeserializer(JavaType vt) {
            super(vt);
            _customType = vt;
        }

        public ConcreteStdDeserializer(StdDeserializer<?> src) {
            super(src);
            _customType = null;
        }

        @Override
        public JavaType getValueType() {
            return _customType;
        }

        @Override
        public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    private DeserializationContext createCtxt(JsonParser p, ObjectMapper m) {
        return ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) m.getDeserializationContext())
                .createInstance(m.getDeserializationConfig(), p, null);
    }

    @Test
    public void testConstructorsAndAccessors_validInputs_expectedResults() {
        ConcreteStdDeserializer<String> deser1 = new ConcreteStdDeserializer<String>(String.class);
        Assert.assertEquals(String.class, deser1.handledType());
        Assert.assertEquals(String.class, deser1.getValueClass());
        Assert.assertNull(deser1.getValueType());

        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        ConcreteStdDeserializer<String> deser2 = new ConcreteStdDeserializer<String>(stringType);
        Assert.assertEquals(String.class, deser2.handledType());
        Assert.assertEquals(stringType, deser2.getValueType());

        ConcreteStdDeserializer<Object> deserNullType = new ConcreteStdDeserializer<Object>((JavaType) null);
        Assert.assertEquals(Object.class, deserNullType.handledType());

        ConcreteStdDeserializer<String> deserCopy = new ConcreteStdDeserializer<String>(deser1);
        Assert.assertEquals(String.class, deserCopy.handledType());
    }

    @Test
    public void testIsDefaultDeserializer_variousInputs_expectedDetection() {
        ConcreteStdDeserializer<Object> custom = new ConcreteStdDeserializer<Object>(Object.class);
        StdImplDeserializer std = new StdImplDeserializer();

        Assert.assertFalse(custom.isDefaultDeserializer(custom));
        Assert.assertTrue(custom.isDefaultDeserializer(std));

        StdImplKeyDeserializer stdKey = new StdImplKeyDeserializer();
        KeyDeserializer customKey = new KeyDeserializer() {
            @Override
            public Object deserializeKey(String key, DeserializationContext ctxt) {
                return key;
            }
        };
        Assert.assertTrue(custom.isDefaultKeyDeserializer(stdKey));
        Assert.assertFalse(custom.isDefaultKeyDeserializer(customKey));
    }

    @Test
    public void testHelperPredicateMethods_variousInputs_correctEvaluation() {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);

        Assert.assertTrue(deser._hasTextualNull("null"));
        Assert.assertFalse(deser._hasTextualNull("NULL"));
        Assert.assertFalse(deser._hasTextualNull(""));

        Assert.assertTrue(deser._isEmptyOrTextualNull(""));
        Assert.assertTrue(deser._isEmptyOrTextualNull("null"));
        Assert.assertFalse(deser._isEmptyOrTextualNull("abc"));

        Assert.assertTrue(deser._isPosInf("Infinity"));
        Assert.assertTrue(deser._isPosInf("INF"));
        Assert.assertFalse(deser._isPosInf("123"));

        Assert.assertTrue(deser._isNegInf("-Infinity"));
        Assert.assertTrue(deser._isNegInf("-INF"));
        Assert.assertFalse(deser._isNegInf("-123"));

        Assert.assertTrue(deser._isNaN("NaN"));
        Assert.assertFalse(deser._isNaN("NAN"));

        Assert.assertTrue(deser._isIntNumber("12345"));
        Assert.assertTrue(deser._isIntNumber("+12345"));
        Assert.assertTrue(deser._isIntNumber("-12345"));
        Assert.assertFalse(deser._isIntNumber(""));
        Assert.assertFalse(deser._isIntNumber("12a45"));
        Assert.assertFalse(deser._isIntNumber("-"));

        Assert.assertTrue(StdDeserializer._neitherNull("a", "b"));
        Assert.assertFalse(StdDeserializer._neitherNull(null, "b"));
        Assert.assertFalse(StdDeserializer._neitherNull("a", null));
        Assert.assertFalse(StdDeserializer._neitherNull(null, null));

        Assert.assertTrue(deser._byteOverflow(-129));
        Assert.assertTrue(deser._byteOverflow(256));
        Assert.assertFalse(deser._byteOverflow(100));

        Assert.assertTrue(deser._shortOverflow(-32769));
        Assert.assertTrue(deser._shortOverflow(32768));
        Assert.assertFalse(deser._shortOverflow(1000));

        Assert.assertTrue(deser._intOverflow((long) Integer.MAX_VALUE + 1L));
        Assert.assertTrue(deser._intOverflow((long) Integer.MIN_VALUE - 1L));
        Assert.assertFalse(deser._intOverflow(1000L));

        Assert.assertEquals(Integer.valueOf(0), deser._nonNullNumber(null));
        Assert.assertEquals(Integer.valueOf(10), deser._nonNullNumber(10));
    }

    @Test
    public void testParseDouble_specialValues_expectedResults() {
        Assert.assertEquals(Double.MIN_NORMAL, StdDeserializer.parseDouble("2.2250738585072012e-308"), 0.0000000001);
        Assert.assertEquals(12.34, StdDeserializer.parseDouble("12.34"), 0.001);
    }

    @Test
    public void testCoerceTypeDesc_variousTypes_correctDescription() {
        ConcreteStdDeserializer<Integer> intDeser = new ConcreteStdDeserializer<Integer>(int.class);
        Assert.assertEquals("for type int", intDeser._coercedTypeDesc());

        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        ConcreteStdDeserializer<List<String>> listDeser = new ConcreteStdDeserializer<List<String>>(listType);
        Assert.assertTrue(listDeser._coercedTypeDesc().startsWith("as content of type '"));

        ConcreteStdDeserializer<int[]> arrayDeser = new ConcreteStdDeserializer<int[]>(int[].class);
        Assert.assertTrue(arrayDeser._coercedTypeDesc().startsWith("as content of type"));
    }

    @Test
    public void testParseBooleanPrimitive_validAndInvalidInputs() throws Exception {
        ConcreteStdDeserializer<Boolean> deser = new ConcreteStdDeserializer<Boolean>(boolean.class);

        JsonParser p = factory.createParser("true");
        p.nextToken();
        Assert.assertTrue(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("false");
        p.nextToken();
        Assert.assertFalse(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("null");
        p.nextToken();
        Assert.assertFalse(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("1");
        p.nextToken();
        Assert.assertTrue(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("0");
        p.nextToken();
        Assert.assertFalse(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\"true\"");
        p.nextToken();
        Assert.assertTrue(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\"False\"");
        p.nextToken();
        Assert.assertFalse(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\"\"");
        p.nextToken();
        Assert.assertFalse(deser._parseBooleanPrimitive(p, createCtxt(p, mapper)));

        ObjectMapper unwrapMapper = new ObjectMapper().enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        p = factory.createParser("[ true ]");
        p.nextToken();
        Assert.assertTrue(deser._parseBooleanPrimitive(p, createCtxt(p, unwrapMapper)));
    }

    @Test(expected = MismatchedInputException.class)
    public void testParseBooleanPrimitive_failOnNullForPrimitives() throws Exception {
        ConcreteStdDeserializer<Boolean> deser = new ConcreteStdDeserializer<Boolean>(boolean.class);
        ObjectMapper strictMapper = new ObjectMapper().enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
        JsonParser p = factory.createParser("null");
        p.nextToken();
        deser._parseBooleanPrimitive(p, createCtxt(p, strictMapper));
    }

    @Test(expected = MismatchedInputException.class)
    public void testParseBooleanPrimitive_invalidStringCoercion() throws Exception {
        ConcreteStdDeserializer<Boolean> deser = new ConcreteStdDeserializer<Boolean>(boolean.class);
        JsonParser p = factory.createParser("\"maybe\"");
        p.nextToken();
        deser._parseBooleanPrimitive(p, createCtxt(p, mapper));
    }

    @Test
    public void testParseIntPrimitive_variousInputs() throws Exception {
        ConcreteStdDeserializer<Integer> deser = new ConcreteStdDeserializer<Integer>(int.class);

        JsonParser p = factory.createParser("123");
        p.nextToken();
        Assert.assertEquals(123, deser._parseIntPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\" 456 \"");
        p.nextToken();
        Assert.assertEquals(456, deser._parseIntPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\"2147483647\"");
        p.nextToken();
        Assert.assertEquals(2147483647, deser._parseIntPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\"\"");
        p.nextToken();
        Assert.assertEquals(0, deser._parseIntPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("null");
        p.nextToken();
        Assert.assertEquals(0, deser._parseIntPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("12.34");
        p.nextToken();
        Assert.assertEquals(12, deser._parseIntPrimitive(p, createCtxt(p, mapper)));

        ObjectMapper unwrapMapper = new ObjectMapper().enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        p = factory.createParser("[ 789 ]");
        p.nextToken();
        Assert.assertEquals(789, deser._parseIntPrimitive(p, createCtxt(p, unwrapMapper)));
    }

    @Test(expected = MismatchedInputException.class)
    public void testParseIntPrimitive_floatDisabled_throwsException() throws Exception {
        ConcreteStdDeserializer<Integer> deser = new ConcreteStdDeserializer<Integer>(int.class);
        ObjectMapper m = new ObjectMapper().disable(DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        JsonParser p = factory.createParser("12.34");
        p.nextToken();
        deser._parseIntPrimitive(p, createCtxt(p, m));
    }

    @Test
    public void testParseByteAndShortPrimitive_validValues() throws Exception {
        ConcreteStdDeserializer<Byte> byteDeser = new ConcreteStdDeserializer<Byte>(byte.class);
        JsonParser p = factory.createParser("120");
        p.nextToken();
        Assert.assertEquals((byte) 120, byteDeser._parseBytePrimitive(p, createCtxt(p, mapper)));

        ConcreteStdDeserializer<Short> shortDeser = new ConcreteStdDeserializer<Short>(short.class);
        p = factory.createParser("30000");
        p.nextToken();
        Assert.assertEquals((short) 30000, shortDeser._parseShortPrimitive(p, createCtxt(p, mapper)));
    }

    @Test(expected = MismatchedInputException.class)
    public void testParseBytePrimitive_overflow_throwsException() throws Exception {
        ConcreteStdDeserializer<Byte> byteDeser = new ConcreteStdDeserializer<Byte>(byte.class);
        JsonParser p = factory.createParser("300");
        p.nextToken();
        byteDeser._parseBytePrimitive(p, createCtxt(p, mapper));
    }

    @Test(expected = MismatchedInputException.class)
    public void testParseShortPrimitive_overflow_throwsException() throws Exception {
        ConcreteStdDeserializer<Short> shortDeser = new ConcreteStdDeserializer<Short>(short.class);
        JsonParser p = factory.createParser("70000");
        p.nextToken();
        shortDeser._parseShortPrimitive(p, createCtxt(p, mapper));
    }

    @Test
    public void testParseLongPrimitive_variousInputs() throws Exception {
        ConcreteStdDeserializer<Long> deser = new ConcreteStdDeserializer<Long>(long.class);

        JsonParser p = factory.createParser("9223372036854775807");
        p.nextToken();
        Assert.assertEquals(9223372036854775807L, deser._parseLongPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\"1234567890123\"");
        p.nextToken();
        Assert.assertEquals(1234567890123L, deser._parseLongPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("\"\"");
        p.nextToken();
        Assert.assertEquals(0L, deser._parseLongPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("null");
        p.nextToken();
        Assert.assertEquals(0L, deser._parseLongPrimitive(p, createCtxt(p, mapper)));

        p = factory.createParser("123.45");
        p.nextToken();
        Assert.assertEquals(123L, deser._parseLongPrimitive(p, createCtxt(p, mapper)));

        ObjectMapper unwrapMapper = new ObjectMapper().enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        p = factory.createParser("[ 999999 ]");
        p.nextToken();
        Assert.assertEquals(999999L, deser._parseLongPrimitive(p, createCtxt(p, unwrapMapper)));
    }

    @Test
    public void testParseFloatAndDoublePrimitive_variousInputs() throws Exception {
        ConcreteStdDeserializer<Float> fDeser = new ConcreteStdDeserializer<Float>(float.class);

        JsonParser p = factory.createParser("12.5");
        p.nextToken();
        Assert.assertEquals(12.5f, fDeser._parseFloatPrimitive(p, createCtxt(p, mapper)), 0.001f);

        p = factory.createParser("\"Infinity\"");
        p.nextToken();
        Assert.assertEquals(Float.POSITIVE_INFINITY, fDeser._parseFloatPrimitive(p, createCtxt(p, mapper)), 0.0f);

        p = factory.createParser("\"-Infinity\"");
        p.nextToken();
        Assert.assertEquals(Float.NEGATIVE_INFINITY, fDeser._parseFloatPrimitive(p, createCtxt(p, mapper)), 0.0f);

        p = factory.createParser("\"NaN\"");
        p.nextToken();
        Assert.assertTrue(Float.isNaN(fDeser._parseFloatPrimitive(p, createCtxt(p, mapper))));

        p = factory.createParser("123");
        p.nextToken();
        Assert.assertEquals(123.0f, fDeser._parseFloatPrimitive(p, createCtxt(p, mapper)), 0.001f);

        ConcreteStdDeserializer<Double> dDeser = new ConcreteStdDeserializer<Double>(double.class);
        p = factory.createParser("45.67");
        p.nextToken();
        Assert.assertEquals(45.67, dDeser._parseDoublePrimitive(p, createCtxt(p, mapper)), 0.001);

        p = factory.createParser("\"Infinity\"");
        p.nextToken();
        Assert.assertEquals(Double.POSITIVE_INFINITY, dDeser._parseDoublePrimitive(p, createCtxt(p, mapper)), 0.0);

        p = factory.createParser("\"-INF\"");
        p.nextToken();
        Assert.assertEquals(Double.NEGATIVE_INFINITY, dDeser._parseDoublePrimitive(p, createCtxt(p, mapper)), 0.0);

        p = factory.createParser("\"NaN\"");
        p.nextToken();
        Assert.assertTrue(Double.isNaN(dDeser._parseDoublePrimitive(p, createCtxt(p, mapper))));
    }

    @Test
    public void testParseDate_variousInputs() throws Exception {
        ConcreteStdDeserializer<Date> deser = new ConcreteStdDeserializer<Date>(Date.class);

        JsonParser p = factory.createParser("1500000000000");
        p.nextToken();
        Date date = deser._parseDate(p, createCtxt(p, mapper));
        Assert.assertEquals(1500000000000L, date.getTime());

        p = factory.createParser("\"2020-01-01T00:00:00.000+0000\"");
        p.nextToken();
        Date parsedDate = deser._parseDate(p, createCtxt(p, mapper));
        Assert.assertNotNull(parsedDate);

        p = factory.createParser("null");
        p.nextToken();
        Assert.assertNull(deser._parseDate(p, createCtxt(p, mapper)));

        p = factory.createParser("\"\"");
        p.nextToken();
        Assert.assertNull(deser._parseDate(p, createCtxt(p, mapper)));

        ObjectMapper emptyArrMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        p = factory.createParser("[]");
        p.nextToken();
        Assert.assertNull(deser._parseDate(p, createCtxt(p, emptyArrMapper)));

        ObjectMapper unwrapMapper = new ObjectMapper().enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        p = factory.createParser("[ 1500000000000 ]");
        p.nextToken();
        Assert.assertEquals(1500000000000L, deser._parseDate(p, createCtxt(p, unwrapMapper)).getTime());
    }

    @Test
    public void testParseString_variousInputs() throws Exception {
        ConcreteStdDeserializer<String> deser = new ConcreteStdDeserializer<String>(String.class);

        JsonParser p = factory.createParser("\"hello\"");
        p.nextToken();
        Assert.assertEquals("hello", deser._parseString(p, createCtxt(p, mapper)));

        p = factory.createParser("123");
        p.nextToken();
        Assert.assertEquals("123", deser._parseString(p, createCtxt(p, mapper)));
    }

    @Test
    public void testDeserializeFromEmpty_variousSettings() throws Exception {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);

        ObjectMapper acceptEmptyStr = new ObjectMapper().enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        JsonParser p = factory.createParser("\"   \"");
        p.nextToken();
        Assert.assertNull(deser._deserializeFromEmpty(p, createCtxt(p, acceptEmptyStr)));

        ObjectMapper acceptEmptyArr = new ObjectMapper().enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        p = factory.createParser("[]");
        p.nextToken();
        Assert.assertNull(deser._deserializeFromEmpty(p, createCtxt(p, acceptEmptyArr)));
    }

    @Test
    public void testCoerceIntegral_differentConfigurations() throws Exception {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);

        ObjectMapper bigIntMapper = new ObjectMapper().enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        JsonParser p = factory.createParser("12345");
        p.nextToken();
        Object result = deser._coerceIntegral(p, createCtxt(p, bigIntMapper));
        Assert.assertTrue(result instanceof BigInteger);

        ObjectMapper longMapper = new ObjectMapper().enable(DeserializationFeature.USE_LONG_FOR_INTS);
        p = factory.createParser("12345");
        p.nextToken();
        result = deser._coerceIntegral(p, createCtxt(p, longMapper));
        Assert.assertTrue(result instanceof Long);
    }

    @Test
    public void testCoerceMethods_normalAndFailure() throws Exception {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);
        DeserializationContext ctxt = createCtxt(factory.createParser(""), mapper);

        Assert.assertNull(deser._coerceNullToken(ctxt, false));
        Assert.assertNull(deser._coerceTextualNull(ctxt, false));
        Assert.assertNull(deser._coerceEmptyString(ctxt, false));

        ObjectMapper noCoerce = new ObjectMapper().disable(MapperFeature.ALLOW_COERCION_OF_SCALARS);
        DeserializationContext noCoerceCtxt = createCtxt(factory.createParser(""), noCoerce);

        try {
            deser._coerceTextualNull(noCoerceCtxt, false);
            Assert.fail("Expected exception");
        } catch (MismatchedInputException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot coerce"));
        }

        try {
            deser._coerceEmptyString(noCoerceCtxt, false);
            Assert.fail("Expected exception");
        } catch (MismatchedInputException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot coerce"));
        }
    }

    @Test
    public void testVerifyScalarCoercions_noCoercionEnabled_throws() throws Exception {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);
        ObjectMapper noCoerce = new ObjectMapper().disable(MapperFeature.ALLOW_COERCION_OF_SCALARS);
        JsonParser p = factory.createParser("123");
        p.nextToken();
        DeserializationContext ctxt = createCtxt(p, noCoerce);

        try {
            deser._verifyNullForScalarCoercion(ctxt, "null");
            Assert.fail("Expected exception");
        } catch (MismatchedInputException ignored) {}

        try {
            deser._verifyStringForScalarCoercion(ctxt, "test");
            Assert.fail("Expected exception");
        } catch (MismatchedInputException ignored) {}

        try {
            deser._verifyNumberForScalarCoercion(ctxt, p);
            Assert.fail("Expected exception");
        } catch (MismatchedInputException ignored) {}
    }

    @Test
    public void testDeserializeWithType_callsTypeDeserializer() throws Exception {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);
        JsonParser p = factory.createParser("\"hello\"");
        p.nextToken();
        DeserializationContext ctxt = createCtxt(p, mapper);

        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        ClassNameIdResolver resolver = new ClassNameIdResolver(type, mapper.getTypeFactory());
        TypeDeserializer typeDeser = new AsPropertyTypeDeserializer(type, resolver, "@class", false, type);

        Object result = deser.deserializeWithType(p, ctxt, typeDeser);
        Assert.assertEquals("hello", result);
    }

    @Test
    public void testFindNullProvider_variousNullSettings() throws Exception {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);
        DeserializationContext ctxt = createCtxt(factory.createParser(""), mapper);

        NullValueProvider skipProvider = deser._findNullProvider(ctxt, null, Nulls.SKIP, deser);
        Assert.assertTrue(skipProvider instanceof NullsConstantProvider);

        NullValueProvider failProvider = deser._findNullProvider(ctxt, null, Nulls.FAIL, deser);
        Assert.assertTrue(failProvider instanceof NullsFailProvider);

        NullValueProvider nullDeserProvider = deser._findNullProvider(ctxt, null, Nulls.AS_EMPTY, null);
        Assert.assertNull(nullDeserProvider);

        NullValueProvider asEmptyProvider = deser._findNullProvider(ctxt, null, Nulls.AS_EMPTY, deser);
        Assert.assertNotNull(asEmptyProvider);

        Assert.assertNull(deser.findContentNullStyle(ctxt, null));
        Assert.assertNull(deser.findValueNullProvider(ctxt, (SettableBeanProperty) null, null));
    }

    @Test
    public void testFindFormatOverridesAndFeatures() {
        ConcreteStdDeserializer<Date> deser = new ConcreteStdDeserializer<Date>(Date.class);
        DeserializationContext ctxt = createCtxt(factory.createParser(""), mapper);

        JsonFormat.Value overrides = deser.findFormatOverrides(ctxt, null, Date.class);
        Assert.assertNotNull(overrides);

        Boolean feat = deser.findFormatFeature(ctxt, null, Date.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Assert.assertNull(feat);
    }

    @Test
    public void testHandleUnknownProperty_skipsChildren() throws Exception {
        ConcreteStdDeserializer<Object> deser = new ConcreteStdDeserializer<Object>(Object.class);
        JsonParser p = factory.createParser("{\"unknown\": [1, 2, 3], \"valid\": 42}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME "unknown"
        p.nextToken(); // START_ARRAY
        DeserializationContext ctxt = createCtxt(p, mapper);

        deser.handleUnknownProperty(p, ctxt, null, "unknown");
        Assert.assertEquals(JsonToken.END_ARRAY, p.currentToken());
    }

    @Test(expected = MismatchedInputException.class)
    public void testHandleMissingEndArrayForSingle_throwsException() throws Exception {
        ConcreteStdDeserializer<Integer> deser = new ConcreteStdDeserializer<Integer>(Integer.class);
        JsonParser p = factory.createParser("[ 1, 2 ]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // 1
        DeserializationContext ctxt = createCtxt(p, mapper);
        deser.handleMissingEndArrayForSingle(p, ctxt);
    }

    @Test
    public void testDeserializeFromArray_emptyArrayAndUnwrapSingle() throws Exception {
        ConcreteStdDeserializer<String> deser = new ConcreteStdDeserializer<String>(String.class) {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return p.getText();
            }
        };

        ObjectMapper emptyArrMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        JsonParser p = factory.createParser("[]");
        p.nextToken();
        Assert.assertNull(deser._deserializeFromArray(p, createCtxt(p, emptyArrMapper)));

        ObjectMapper unwrapMapper = new ObjectMapper().enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        p = factory.createParser("[ \"test\" ]");
        p.nextToken();
        Assert.assertEquals("test", deser._deserializeFromArray(p, createCtxt(p, unwrapMapper)));
    }

    @Test(expected = MismatchedInputException.class)
    public void testDeserializeWrappedValue_nestedArray_throwsException() throws Exception {
        ConcreteStdDeserializer<String> deser = new ConcreteStdDeserializer<String>(String.class);
        JsonParser p = factory.createParser("[ [ \"nested\" ] ]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // START_ARRAY
        deser._deserializeWrappedValue(p, createCtxt(p, mapper));
    }
}
