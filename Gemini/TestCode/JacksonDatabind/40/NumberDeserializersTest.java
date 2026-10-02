package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberDeserializersTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testFind_primitives_returnsMatchingDeserializers() {
        Assert.assertSame(NumberDeserializers.IntegerDeserializer.primitiveInstance,
                NumberDeserializers.find(int.class, int.class.getName()));
        Assert.assertSame(NumberDeserializers.BooleanDeserializer.primitiveInstance,
                NumberDeserializers.find(boolean.class, boolean.class.getName()));
        Assert.assertSame(NumberDeserializers.LongDeserializer.primitiveInstance,
                NumberDeserializers.find(long.class, long.class.getName()));
        Assert.assertSame(NumberDeserializers.DoubleDeserializer.primitiveInstance,
                NumberDeserializers.find(double.class, double.class.getName()));
        Assert.assertSame(NumberDeserializers.CharacterDeserializer.primitiveInstance,
                NumberDeserializers.find(char.class, char.class.getName()));
        Assert.assertSame(NumberDeserializers.ByteDeserializer.primitiveInstance,
                NumberDeserializers.find(byte.class, byte.class.getName()));
        Assert.assertSame(NumberDeserializers.ShortDeserializer.primitiveInstance,
                NumberDeserializers.find(short.class, short.class.getName()));
        Assert.assertSame(NumberDeserializers.FloatDeserializer.primitiveInstance,
                NumberDeserializers.find(float.class, float.class.getName()));
    }

    @Test
    public void testFind_wrappersAndBigNumbers_returnsMatchingDeserializers() {
        Assert.assertSame(NumberDeserializers.IntegerDeserializer.wrapperInstance,
                NumberDeserializers.find(Integer.class, Integer.class.getName()));
        Assert.assertSame(NumberDeserializers.BooleanDeserializer.wrapperInstance,
                NumberDeserializers.find(Boolean.class, Boolean.class.getName()));
        Assert.assertSame(NumberDeserializers.LongDeserializer.wrapperInstance,
                NumberDeserializers.find(Long.class, Long.class.getName()));
        Assert.assertSame(NumberDeserializers.DoubleDeserializer.wrapperInstance,
                NumberDeserializers.find(Double.class, Double.class.getName()));
        Assert.assertSame(NumberDeserializers.CharacterDeserializer.wrapperInstance,
                NumberDeserializers.find(Character.class, Character.class.getName()));
        Assert.assertSame(NumberDeserializers.ByteDeserializer.wrapperInstance,
                NumberDeserializers.find(Byte.class, Byte.class.getName()));
        Assert.assertSame(NumberDeserializers.ShortDeserializer.wrapperInstance,
                NumberDeserializers.find(Short.class, Short.class.getName()));
        Assert.assertSame(NumberDeserializers.FloatDeserializer.wrapperInstance,
                NumberDeserializers.find(Float.class, Float.class.getName()));
        Assert.assertSame(NumberDeserializers.NumberDeserializer.instance,
                NumberDeserializers.find(Number.class, Number.class.getName()));
        Assert.assertSame(NumberDeserializers.BigDecimalDeserializer.instance,
                NumberDeserializers.find(BigDecimal.class, BigDecimal.class.getName()));
        Assert.assertSame(NumberDeserializers.BigIntegerDeserializer.instance,
                NumberDeserializers.find(BigInteger.class, BigInteger.class.getName()));
    }

    @Test
    public void testFind_unknownType_returnsNull() {
        Assert.assertNull(NumberDeserializers.find(String.class, String.class.getName()));
        Assert.assertNull(NumberDeserializers.find(Object.class, Object.class.getName()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFind_primitiveWithCustomUnknownType_throwsIllegalArgumentException() {
        NumberDeserializers.find(void.class, void.class.getName());
    }

    @Test
    public void testInstantiateNumberDeserializers() {
        NumberDeserializers deserializers = new NumberDeserializers();
        Assert.assertNotNull(deserializers);
    }

    @Test
    public void testPrimitiveOrWrapperDeserializer_nullValues() throws Exception {
        NumberDeserializers.IntegerDeserializer intDeser = NumberDeserializers.IntegerDeserializer.primitiveInstance;
        Assert.assertEquals(Integer.valueOf(0), intDeser.getNullValue());

        NumberDeserializers.IntegerDeserializer wrapperDeser = NumberDeserializers.IntegerDeserializer.wrapperInstance;
        Assert.assertNull(wrapperDeser.getNullValue());

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Assert.assertNull(wrapperDeser.getNullValue(ctxt));

        mapper.enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
        try {
            mapper.readValue("null", int.class);
            Assert.fail("Should have failed on null for primitive");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Can not map JSON null into type"));
        }
    }

    @Test
    public void testBooleanDeserializer_variousInputs() throws Exception {
        Assert.assertTrue(mapper.readValue("true", boolean.class));
        Assert.assertFalse(mapper.readValue("false", boolean.class));
        Assert.assertTrue(mapper.readValue("\"true\"", Boolean.class));
        Assert.assertFalse(mapper.readValue("\"false\"", Boolean.class));
        Assert.assertTrue(mapper.readValue("1", Boolean.class));
        Assert.assertFalse(mapper.readValue("0", Boolean.class));
        Assert.assertNull(mapper.readValue("null", Boolean.class));

        NumberDeserializers.BooleanDeserializer deser = NumberDeserializers.BooleanDeserializer.wrapperInstance;
        JsonParser p = mapper.getFactory().createParser("true");
        p.nextToken();
        Boolean val = deser.deserializeWithType(p, mapper.getDeserializationContext(), null);
        Assert.assertEquals(Boolean.TRUE, val);
        p.close();
    }

    @Test
    public void testByteDeserializer_variousInputs() throws Exception {
        Assert.assertEquals((byte) 12, (byte) mapper.readValue("12", byte.class));
        Assert.assertEquals((byte) -5, (byte) mapper.readValue("-5", Byte.class));
        Assert.assertEquals((byte) 42, (byte) mapper.readValue("\"42\"", Byte.class));
        Assert.assertNull(mapper.readValue("null", Byte.class));
    }

    @Test
    public void testShortDeserializer_variousInputs() throws Exception {
        Assert.assertEquals((short) 100, (short) mapper.readValue("100", short.class));
        Assert.assertEquals((short) -200, (short) mapper.readValue("-200", Short.class));
        Assert.assertEquals((short) 300, (short) mapper.readValue("\"300\"", Short.class));
        Assert.assertNull(mapper.readValue("null", Short.class));
    }

    @Test
    public void testCharacterDeserializer_variousInputs() throws Exception {
        Assert.assertEquals('a', (char) mapper.readValue("\"a\"", char.class));
        Assert.assertEquals('Z', (char) mapper.readValue("\"Z\"", Character.class));
        Assert.assertEquals((char) 65, (char) mapper.readValue("65", Character.class));
        Assert.assertEquals('\0', (char) mapper.readValue("0", Character.class));
        Assert.assertEquals((char) 0xFFFF, (char) mapper.readValue("65535", Character.class));
        Assert.assertNull(mapper.readValue("null", Character.class));

        Assert.assertNull(mapper.readValue("\"\"", Character.class));

        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        Assert.assertEquals('x', (char) mapper.readValue("[\"x\"]", Character.class));

        try {
            mapper.readValue("[\"x\", \"y\"]", Character.class);
            Assert.fail("Expected unwrap exception");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Attempted to unwrap single value array"));
        }

        try {
            mapper.readValue("100000", Character.class);
            Assert.fail("Expected mapping exception for char out of range");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }

        try {
            mapper.readValue("\"abc\"", Character.class);
            Assert.fail("Expected mapping exception for string with length > 1");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }

        try {
            mapper.disable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            mapper.readValue("[\"a\"]", Character.class);
            Assert.fail("Expected exception when unwrap disabled");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testIntegerDeserializer_variousInputs() throws Exception {
        NumberDeserializers.IntegerDeserializer deser = NumberDeserializers.IntegerDeserializer.wrapperInstance;
        Assert.assertTrue(deser.isCachable());

        Assert.assertEquals(123, (int) mapper.readValue("123", int.class));
        Assert.assertEquals(-456, (int) mapper.readValue("-456", Integer.class));
        Assert.assertEquals(789, (int) mapper.readValue("\"789\"", Integer.class));
        Assert.assertNull(mapper.readValue("null", Integer.class));

        JsonParser pInt = mapper.getFactory().createParser("42");
        pInt.nextToken();
        Assert.assertEquals(Integer.valueOf(42), deser.deserialize(pInt, mapper.getDeserializationContext()));
        pInt.close();

        JsonParser pIntType = mapper.getFactory().createParser("42");
        pIntType.nextToken();
        Assert.assertEquals(Integer.valueOf(42), deser.deserializeWithType(pIntType, mapper.getDeserializationContext(), null));
        pIntType.close();

        JsonParser pStrType = mapper.getFactory().createParser("\"42\"");
        pStrType.nextToken();
        Assert.assertEquals(Integer.valueOf(42), deser.deserializeWithType(pStrType, mapper.getDeserializationContext(), null));
        pStrType.close();
    }

    @Test
    public void testLongDeserializer_variousInputs() throws Exception {
        NumberDeserializers.LongDeserializer deser = NumberDeserializers.LongDeserializer.wrapperInstance;
        Assert.assertTrue(deser.isCachable());

        Assert.assertEquals(1234567890123L, (long) mapper.readValue("1234567890123", long.class));
        Assert.assertEquals(-9876543210L, (long) mapper.readValue("-9876543210", Long.class));
        Assert.assertEquals(555L, (long) mapper.readValue("\"555\"", Long.class));
        Assert.assertNull(mapper.readValue("null", Long.class));

        JsonParser p = mapper.getFactory().createParser("9999999999");
        p.nextToken();
        Assert.assertEquals(Long.valueOf(9999999999L), deser.deserialize(p, mapper.getDeserializationContext()));
        p.close();

        JsonParser pStr = mapper.getFactory().createParser("\"9999999999\"");
        pStr.nextToken();
        Assert.assertEquals(Long.valueOf(9999999999L), deser.deserialize(pStr, mapper.getDeserializationContext()));
        pStr.close();
    }

    @Test
    public void testFloatDeserializer_variousInputs() throws Exception {
        Assert.assertEquals(1.23f, mapper.readValue("1.23", float.class), 0.001f);
        Assert.assertEquals(-4.56f, mapper.readValue("-4.56", Float.class), 0.001f);
        Assert.assertEquals(7.89f, mapper.readValue("\"7.89\"", Float.class), 0.001f);
        Assert.assertNull(mapper.readValue("null", Float.class));
    }

    @Test
    public void testDoubleDeserializer_variousInputs() throws Exception {
        Assert.assertEquals(12.34d, mapper.readValue("12.34", double.class), 0.001d);
        Assert.assertEquals(-56.78d, mapper.readValue("-56.78", Double.class), 0.001d);
        Assert.assertEquals(90.12d, mapper.readValue("\"90.12\"", Double.class), 0.001d);
        Assert.assertNull(mapper.readValue("null", Double.class));

        NumberDeserializers.DoubleDeserializer deser = NumberDeserializers.DoubleDeserializer.wrapperInstance;
        JsonParser p = mapper.getFactory().createParser("3.14159");
        p.nextToken();
        Double val = deser.deserializeWithType(p, mapper.getDeserializationContext(), null);
        Assert.assertEquals(Double.valueOf(3.14159), val);
        p.close();
    }

    @Test
    public void testNumberDeserializer_numbers() throws Exception {
        Object intNum = mapper.readValue("123", Number.class);
        Assert.assertEquals(123, ((Number) intNum).intValue());

        Object floatNum = mapper.readValue("123.45", Number.class);
        Assert.assertEquals(123.45d, (Double) floatNum, 0.001d);

        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        Object bigDecNum = mapper.readValue("123.45", Number.class);
        Assert.assertTrue(bigDecNum instanceof BigDecimal);
        Assert.assertEquals(new BigDecimal("123.45"), bigDecNum);
        mapper.disable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
    }

    @Test
    public void testNumberDeserializer_strings() throws Exception {
        Assert.assertNull(mapper.readValue("\"\"", Number.class));
        Assert.assertNull(mapper.readValue("\"   \"", Number.class));
        Assert.assertNull(mapper.readValue("\"null\"", Number.class));

        Assert.assertEquals(Double.POSITIVE_INFINITY, mapper.readValue("\"Infinity\"", Number.class));
        Assert.assertEquals(Double.POSITIVE_INFINITY, mapper.readValue("\"+Infinity\"", Number.class));
        Assert.assertEquals(Double.NEGATIVE_INFINITY, mapper.readValue("\"-Infinity\"", Number.class));
        Assert.assertEquals(Double.NaN, mapper.readValue("\"NaN\"", Number.class));

        Assert.assertEquals(123, mapper.readValue("\"123\"", Number.class));
        Assert.assertEquals(1234567890123L, mapper.readValue("\"1234567890123\"", Number.class));

        mapper.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        Assert.assertEquals(new BigInteger("123"), mapper.readValue("\"123\"", Number.class));
        mapper.disable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);

        mapper.enable(DeserializationFeature.USE_LONG_FOR_INTS);
        Assert.assertEquals(123L, mapper.readValue("\"123\"", Number.class));
        mapper.disable(DeserializationFeature.USE_LONG_FOR_INTS);

        Assert.assertEquals(12.34d, (Double) mapper.readValue("\"12.34\"", Number.class), 0.001d);

        mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        Assert.assertEquals(new BigDecimal("12.34"), mapper.readValue("\"12.34\"", Number.class));
        mapper.disable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);

        try {
            mapper.readValue("\"not_a_number\"", Number.class);
            Assert.fail("Expected invalid format exception");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("not a valid number"));
        }
    }

    @Test
    public void testNumberDeserializer_arrayUnwrap() throws Exception {
        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        Assert.assertEquals(10, mapper.readValue("[10]", Number.class));

        try {
            mapper.readValue("[10, 20]", Number.class);
            Assert.fail("Expected error on multiple elements in array");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Attempted to unwrap single value array"));
        }

        try {
            mapper.disable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            mapper.readValue("[10]", Number.class);
            Assert.fail("Expected error when unwrap disabled");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testNumberDeserializer_deserializeWithType() throws Exception {
        NumberDeserializers.NumberDeserializer deser = NumberDeserializers.NumberDeserializer.instance;

        JsonParser pInt = mapper.getFactory().createParser("123");
        pInt.nextToken();
        Assert.assertEquals(123, deser.deserializeWithType(pInt, mapper.getDeserializationContext(), null));
        pInt.close();

        JsonParser pFloat = mapper.getFactory().createParser("123.45");
        pFloat.nextToken();
        Assert.assertEquals(123.45d, (Double) deser.deserializeWithType(pFloat, mapper.getDeserializationContext(), null), 0.001d);
        pFloat.close();

        JsonParser pStr = mapper.getFactory().createParser("\"123.45\"");
        pStr.nextToken();
        Assert.assertEquals(123.45d, (Double) deser.deserializeWithType(pStr, mapper.getDeserializationContext(), null), 0.001d);
        pStr.close();
    }

    @Test
    public void testBigIntegerDeserializer_variousInputs() throws Exception {
        Assert.assertEquals(new BigInteger("12345678901234567890"),
                mapper.readValue("12345678901234567890", BigInteger.class));
        Assert.assertEquals(new BigInteger("100"), mapper.readValue("100", BigInteger.class));
        Assert.assertEquals(new BigInteger("99999999999"), mapper.readValue("99999999999", BigInteger.class));

        Assert.assertEquals(new BigInteger("12"), mapper.readValue("12.34", BigInteger.class));

        mapper.disable(DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        try {
            mapper.readValue("12.34", BigInteger.class);
            Assert.fail("Expected failure on float to BigInteger coercion");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }
        mapper.enable(DeserializationFeature.ACCEPT_FLOAT_AS_INT);

        Assert.assertEquals(new BigInteger("987654321"), mapper.readValue("\"987654321\"", BigInteger.class));
        Assert.assertNull(mapper.readValue("\"\"", BigInteger.class));
        Assert.assertNull(mapper.readValue("\"   \"", BigInteger.class));

        try {
            mapper.readValue("\"invalid_big_int\"", BigInteger.class);
            Assert.fail("Expected invalid representation exception");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("not a valid representation"));
        }

        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        Assert.assertEquals(new BigInteger("42"), mapper.readValue("[42]", BigInteger.class));

        try {
            mapper.readValue("[42, 43]", BigInteger.class);
            Assert.fail("Expected array unwrap failure for multiple values");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Attempted to unwrap single value array"));
        }

        try {
            mapper.disable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            mapper.readValue("[42]", BigInteger.class);
            Assert.fail("Expected failure when unwrap disabled");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }

        try {
            mapper.readValue("true", BigInteger.class);
            Assert.fail("Expected failure on boolean for BigInteger");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testBigDecimalDeserializer_variousInputs() throws Exception {
        Assert.assertEquals(new BigDecimal("123.456"), mapper.readValue("123.456", BigDecimal.class));
        Assert.assertEquals(new BigDecimal("100"), mapper.readValue("100", BigDecimal.class));
        Assert.assertEquals(new BigDecimal("789.1011"), mapper.readValue("\"789.1011\"", BigDecimal.class));
        Assert.assertNull(mapper.readValue("\"\"", BigDecimal.class));
        Assert.assertNull(mapper.readValue("\"   \"", BigDecimal.class));
        Assert.assertNull(mapper.readValue("null", BigDecimal.class));

        try {
            mapper.readValue("\"invalid_big_dec\"", BigDecimal.class);
            Assert.fail("Expected invalid representation exception");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("not a valid representation"));
        }

        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        Assert.assertEquals(new BigDecimal("55.5"), mapper.readValue("[55.5]", BigDecimal.class));

        try {
            mapper.readValue("[55.5, 66.6]", BigDecimal.class);
            Assert.fail("Expected array unwrap failure for multiple values");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Attempted to unwrap single value array"));
        }

        try {
            mapper.disable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            mapper.readValue("[55.5]", BigDecimal.class);
            Assert.fail("Expected failure when unwrap disabled");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }

        try {
            mapper.readValue("true", BigDecimal.class);
            Assert.fail("Expected failure on boolean for BigDecimal");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }
}
