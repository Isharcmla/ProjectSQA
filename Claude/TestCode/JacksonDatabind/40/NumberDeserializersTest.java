package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonProcessingException;

public class NumberDeserializersTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------------
    // find() method tests
    // ---------------------------------------------------------------

    @Test
    public void testFind_primitiveInt_returnsIntegerPrimitiveInstance() {
        Object deser = NumberDeserializers.find(int.class, null);
        assertSame(NumberDeserializers.IntegerDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_primitiveBoolean_returnsBooleanPrimitiveInstance() {
        Object deser = NumberDeserializers.find(boolean.class, null);
        assertSame(NumberDeserializers.BooleanDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_primitiveLong_returnsLongPrimitiveInstance() {
        Object deser = NumberDeserializers.find(long.class, null);
        assertSame(NumberDeserializers.LongDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_primitiveDouble_returnsDoublePrimitiveInstance() {
        Object deser = NumberDeserializers.find(double.class, null);
        assertSame(NumberDeserializers.DoubleDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_primitiveChar_returnsCharacterPrimitiveInstance() {
        Object deser = NumberDeserializers.find(char.class, null);
        assertSame(NumberDeserializers.CharacterDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_primitiveByte_returnsBytePrimitiveInstance() {
        Object deser = NumberDeserializers.find(byte.class, null);
        assertSame(NumberDeserializers.ByteDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_primitiveShort_returnsShortPrimitiveInstance() {
        Object deser = NumberDeserializers.find(short.class, null);
        assertSame(NumberDeserializers.ShortDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_primitiveFloat_returnsFloatPrimitiveInstance() {
        Object deser = NumberDeserializers.find(float.class, null);
        assertSame(NumberDeserializers.FloatDeserializer.primitiveInstance, deser);
    }

    @Test
    public void testFind_wrapperInteger_returnsIntegerWrapperInstance() {
        Object deser = NumberDeserializers.find(Integer.class, Integer.class.getName());
        assertSame(NumberDeserializers.IntegerDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_wrapperBoolean_returnsBooleanWrapperInstance() {
        Object deser = NumberDeserializers.find(Boolean.class, Boolean.class.getName());
        assertSame(NumberDeserializers.BooleanDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_wrapperLong_returnsLongWrapperInstance() {
        Object deser = NumberDeserializers.find(Long.class, Long.class.getName());
        assertSame(NumberDeserializers.LongDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_wrapperDouble_returnsDoubleWrapperInstance() {
        Object deser = NumberDeserializers.find(Double.class, Double.class.getName());
        assertSame(NumberDeserializers.DoubleDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_wrapperCharacter_returnsCharacterWrapperInstance() {
        Object deser = NumberDeserializers.find(Character.class, Character.class.getName());
        assertSame(NumberDeserializers.CharacterDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_wrapperByte_returnsByteWrapperInstance() {
        Object deser = NumberDeserializers.find(Byte.class, Byte.class.getName());
        assertSame(NumberDeserializers.ByteDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_wrapperShort_returnsShortWrapperInstance() {
        Object deser = NumberDeserializers.find(Short.class, Short.class.getName());
        assertSame(NumberDeserializers.ShortDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_wrapperFloat_returnsFloatWrapperInstance() {
        Object deser = NumberDeserializers.find(Float.class, Float.class.getName());
        assertSame(NumberDeserializers.FloatDeserializer.wrapperInstance, deser);
    }

    @Test
    public void testFind_number_returnsNumberDeserializerInstance() {
        Object deser = NumberDeserializers.find(Number.class, Number.class.getName());
        assertSame(NumberDeserializers.NumberDeserializer.instance, deser);
    }

    @Test
    public void testFind_bigDecimal_returnsBigDecimalDeserializerInstance() {
        Object deser = NumberDeserializers.find(BigDecimal.class, BigDecimal.class.getName());
        assertSame(NumberDeserializers.BigDecimalDeserializer.instance, deser);
    }

    @Test
    public void testFind_bigInteger_returnsBigIntegerDeserializerInstance() {
        Object deser = NumberDeserializers.find(BigInteger.class, BigInteger.class.getName());
        assertSame(NumberDeserializers.BigIntegerDeserializer.instance, deser);
    }

    @Test
    public void testFind_unknownClass_returnsNull() {
        Object deser = NumberDeserializers.find(String.class, String.class.getName());
        assertNull(deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFind_mismatchedClassNameButKnownName_throwsIllegalArgumentException() {
        // clsName matches a known numeric type name, but rawType does not match
        // any of the checks -> triggers "should never occur" branch
        NumberDeserializers.find(String.class, Integer.class.getName());
    }

    // ---------------------------------------------------------------
    // BooleanDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testBooleanDeserializer_deserializeTrue_returnsTrue() throws Exception {
        Boolean result = mapper.readValue("true", Boolean.class);
        assertTrue(result);
    }

    @Test
    public void testBooleanDeserializer_deserializeFalse_returnsFalse() throws Exception {
        Boolean result = mapper.readValue("false", Boolean.class);
        assertFalse(result);
    }

    @Test
    public void testBooleanDeserializer_deserializeNullWrapper_returnsNull() throws Exception {
        Boolean result = mapper.readValue("null", Boolean.class);
        assertNull(result);
    }

    @Test
    public void testBooleanDeserializer_deserializePrimitiveNull_returnsFalse() throws Exception {
        boolean result = mapper.readValue("null", boolean.class);
        assertFalse(result);
    }

    // ---------------------------------------------------------------
    // ByteDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testByteDeserializer_deserializeNormalValue_returnsByte() throws Exception {
        Byte result = mapper.readValue("5", Byte.class);
        assertEquals((byte) 5, result.byteValue());
    }

    @Test
    public void testByteDeserializer_deserializeNegativeValue_returnsNegativeByte() throws Exception {
        Byte result = mapper.readValue("-5", Byte.class);
        assertEquals((byte) -5, result.byteValue());
    }

    @Test
    public void testByteDeserializer_deserializeNullWrapper_returnsNull() throws Exception {
        Byte result = mapper.readValue("null", Byte.class);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // ShortDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testShortDeserializer_deserializeNormalValue_returnsShort() throws Exception {
        Short result = mapper.readValue("100", Short.class);
        assertEquals((short) 100, result.shortValue());
    }

    @Test
    public void testShortDeserializer_deserializeNullWrapper_returnsNull() throws Exception {
        Short result = mapper.readValue("null", Short.class);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // CharacterDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testCharacterDeserializer_deserializeSingleCharString_returnsChar() throws Exception {
        Character result = mapper.readValue("\"a\"", Character.class);
        assertEquals(Character.valueOf('a'), result);
    }

    @Test
    public void testCharacterDeserializer_deserializeFromIntValue_returnsCorrespondingChar() throws Exception {
        Character result = mapper.readValue("65", Character.class);
        assertEquals(Character.valueOf('A'), result);
    }

    @Test
    public void testCharacterDeserializer_deserializeEmptyString_returnsNull() throws Exception {
        Character result = mapper.readValue("\"\"", Character.class);
        assertNull(result);
    }

    @Test(expected = JsonProcessingException.class)
    public void testCharacterDeserializer_deserializeMultiCharString_throwsException() throws Exception {
        mapper.readValue("\"ab\"", Character.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testCharacterDeserializer_deserializeFromObject_throwsException() throws Exception {
        mapper.readValue("{}", Character.class);
    }

    @Test
    public void testCharacterDeserializer_deserializeSingleValueArray_returnsChar() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        Character result = mapper.readValue("[\"a\"]", Character.class);
        assertEquals(Character.valueOf('a'), result);
    }

    @Test(expected = JsonProcessingException.class)
    public void testCharacterDeserializer_deserializeMultiValueArray_throwsException() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        mapper.readValue("[\"a\",\"b\"]", Character.class);
    }

    // ---------------------------------------------------------------
    // IntegerDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testIntegerDeserializer_deserializeNormalValue_returnsInteger() throws Exception {
        Integer result = mapper.readValue("123", Integer.class);
        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void testIntegerDeserializer_deserializeFromString_returnsInteger() throws Exception {
        Integer result = mapper.readValue("\"123\"", Integer.class);
        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void testIntegerDeserializer_deserializeNullWrapper_returnsNull() throws Exception {
        Integer result = mapper.readValue("null", Integer.class);
        assertNull(result);
    }

    @Test
    public void testIntegerDeserializer_deserializePrimitiveNull_returnsZero() throws Exception {
        int result = mapper.readValue("null", int.class);
        assertEquals(0, result);
    }

    @Test
    public void testIntegerDeserializer_isCachable_returnsTrue() {
        assertTrue(NumberDeserializers.IntegerDeserializer.wrapperInstance.isCachable());
    }

    // ---------------------------------------------------------------
    // LongDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testLongDeserializer_deserializeNormalValue_returnsLong() throws Exception {
        Long result = mapper.readValue("12345678900", Long.class);
        assertEquals(Long.valueOf(12345678900L), result);
    }

    @Test
    public void testLongDeserializer_deserializeNullWrapper_returnsNull() throws Exception {
        Long result = mapper.readValue("null", Long.class);
        assertNull(result);
    }

    @Test
    public void testLongDeserializer_isCachable_returnsTrue() {
        assertTrue(NumberDeserializers.LongDeserializer.wrapperInstance.isCachable());
    }

    // ---------------------------------------------------------------
    // FloatDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testFloatDeserializer_deserializeNormalValue_returnsFloat() throws Exception {
        Float result = mapper.readValue("1.5", Float.class);
        assertEquals(1.5f, result, 0.0001f);
    }

    @Test
    public void testFloatDeserializer_deserializeNullWrapper_returnsNull() throws Exception {
        Float result = mapper.readValue("null", Float.class);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // DoubleDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testDoubleDeserializer_deserializeNormalValue_returnsDouble() throws Exception {
        Double result = mapper.readValue("1.5", Double.class);
        assertEquals(1.5d, result, 0.0001d);
    }

    @Test
    public void testDoubleDeserializer_deserializeNullWrapper_returnsNull() throws Exception {
        Double result = mapper.readValue("null", Double.class);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // NumberDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testNumberDeserializer_deserializeIntValue_returnsInteger() throws Exception {
        Number result = mapper.readValue("123", Number.class);
        assertTrue(result instanceof Integer);
        assertEquals(123, result.intValue());
    }

    @Test
    public void testNumberDeserializer_deserializeFloatValue_returnsDouble() throws Exception {
        Number result = mapper.readValue("1.5", Number.class);
        assertTrue(result instanceof Double);
        assertEquals(1.5d, result.doubleValue(), 0.0001d);
    }

    @Test
    public void testNumberDeserializer_deserializeFloatValueWithBigDecimalFeature_returnsBigDecimal() throws Exception {
        mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        Number result = mapper.readValue("1.5", Number.class);
        assertTrue(result instanceof BigDecimal);
    }

    @Test
    public void testNumberDeserializer_deserializeStringInt_returnsInteger() throws Exception {
        Number result = mapper.readValue("\"123\"", Number.class);
        assertTrue(result instanceof Integer);
        assertEquals(123, result.intValue());
    }

    @Test
    public void testNumberDeserializer_deserializeStringFloat_returnsDouble() throws Exception {
        Number result = mapper.readValue("\"1.5\"", Number.class);
        assertTrue(result instanceof Double);
    }

    @Test
    public void testNumberDeserializer_deserializeEmptyString_returnsNull() throws Exception {
        Number result = mapper.readValue("\"\"", Number.class);
        assertNull(result);
    }

    @Test
    public void testNumberDeserializer_deserializeLargeIntString_returnsLong() throws Exception {
        Number result = mapper.readValue("\"12345678900\"", Number.class);
        assertTrue(result instanceof Long);
    }

    @Test
    public void testNumberDeserializer_deserializeStringUseBigIntegerFeature_returnsBigInteger() throws Exception {
        mapper.configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true);
        Number result = mapper.readValue("\"123\"", Number.class);
        assertTrue(result instanceof BigInteger);
    }

    @Test(expected = JsonProcessingException.class)
    public void testNumberDeserializer_deserializeInvalidString_throwsException() throws Exception {
        mapper.readValue("\"notanumber\"", Number.class);
    }

    @Test
    public void testNumberDeserializer_deserializeSingleValueArray_returnsNumber() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        Number result = mapper.readValue("[123]", Number.class);
        assertEquals(123, result.intValue());
    }

    @Test(expected = JsonProcessingException.class)
    public void testNumberDeserializer_deserializeMultiValueArray_throwsException() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        mapper.readValue("[123,456]", Number.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testNumberDeserializer_deserializeFromObject_throwsException() throws Exception {
        mapper.readValue("{}", Number.class);
    }

    // ---------------------------------------------------------------
    // BigIntegerDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testBigIntegerDeserializer_deserializeIntValue_returnsBigInteger() throws Exception {
        BigInteger result = mapper.readValue("123", BigInteger.class);
        assertEquals(BigInteger.valueOf(123), result);
    }

    @Test
    public void testBigIntegerDeserializer_deserializeStringValue_returnsBigInteger() throws Exception {
        BigInteger result = mapper.readValue("\"123\"", BigInteger.class);
        assertEquals(BigInteger.valueOf(123), result);
    }

    @Test
    public void testBigIntegerDeserializer_deserializeEmptyString_returnsNull() throws Exception {
        BigInteger result = mapper.readValue("\"\"", BigInteger.class);
        assertNull(result);
    }

    @Test(expected = JsonProcessingException.class)
    public void testBigIntegerDeserializer_deserializeInvalidString_throwsException() throws Exception {
        mapper.readValue("\"notanumber\"", BigInteger.class);
    }

    @Test
    public void testBigIntegerDeserializer_deserializeFloatValueWithAcceptFloat_returnsTruncatedBigInteger() throws Exception {
        // ACCEPT_FLOAT_AS_INT defaults to true
        BigInteger result = mapper.readValue("1.9", BigInteger.class);
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test(expected = JsonProcessingException.class)
    public void testBigIntegerDeserializer_deserializeFloatValueWithoutAcceptFloat_throwsException() throws Exception {
        mapper.configure(DeserializationFeature.ACCEPT_FLOAT_AS_INT, false);
        mapper.readValue("1.9", BigInteger.class);
    }

    @Test
    public void testBigIntegerDeserializer_deserializeSingleValueArray_returnsBigInteger() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        BigInteger result = mapper.readValue("[123]", BigInteger.class);
        assertEquals(BigInteger.valueOf(123), result);
    }

    @Test(expected = JsonProcessingException.class)
    public void testBigIntegerDeserializer_deserializeMultiValueArray_throwsException() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        mapper.readValue("[123,456]", BigInteger.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testBigIntegerDeserializer_deserializeFromObject_throwsException() throws Exception {
        mapper.readValue("{}", BigInteger.class);
    }

    // ---------------------------------------------------------------
    // BigDecimalDeserializer
    // ---------------------------------------------------------------

    @Test
    public void testBigDecimalDeserializer_deserializeIntValue_returnsBigDecimal() throws Exception {
        BigDecimal result = mapper.readValue("123", BigDecimal.class);
        assertEquals(new BigDecimal("123"), result);
    }

    @Test
    public void testBigDecimalDeserializer_deserializeFloatValue_returnsBigDecimal() throws Exception {
        BigDecimal result = mapper.readValue("123.45", BigDecimal.class);
        assertEquals(new BigDecimal("123.45"), result);
    }

    @Test
    public void testBigDecimalDeserializer_deserializeStringValue_returnsBigDecimal() throws Exception {
        BigDecimal result = mapper.readValue("\"123.45\"", BigDecimal.class);
        assertEquals(new BigDecimal("123.45"), result);
    }

    @Test
    public void testBigDecimalDeserializer_deserializeEmptyString_returnsNull() throws Exception {
        BigDecimal result = mapper.readValue("\"\"", BigDecimal.class);
        assertNull(result);
    }

    @Test(expected = JsonProcessingException.class)
    public void testBigDecimalDeserializer_deserializeInvalidString_throwsException() throws Exception {
        mapper.readValue("\"notanumber\"", BigDecimal.class);
    }

    @Test
    public void testBigDecimalDeserializer_deserializeSingleValueArray_returnsBigDecimal() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        BigDecimal result = mapper.readValue("[123.45]", BigDecimal.class);
        assertEquals(new BigDecimal("123.45"), result);
    }

    @Test(expected = JsonProcessingException.class)
    public void testBigDecimalDeserializer_deserializeMultiValueArray_throwsException() throws Exception {
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        mapper.readValue("[123.45,456.78]", BigDecimal.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testBigDecimalDeserializer_deserializeFromObject_throwsException() throws Exception {
        mapper.readValue("{}", BigDecimal.class);
    }
}
