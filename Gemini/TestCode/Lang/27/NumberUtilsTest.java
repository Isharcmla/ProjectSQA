package org.apache.commons.lang3.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class NumberUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new NumberUtils());
    }

    @Test
    public void testConstants() {
        assertEquals(Long.valueOf(0L), NumberUtils.LONG_ZERO);
        assertEquals(Long.valueOf(1L), NumberUtils.LONG_ONE);
        assertEquals(Long.valueOf(-1L), NumberUtils.LONG_MINUS_ONE);
        assertEquals(Integer.valueOf(0), NumberUtils.INTEGER_ZERO);
        assertEquals(Integer.valueOf(1), NumberUtils.INTEGER_ONE);
        assertEquals(Integer.valueOf(-1), NumberUtils.INTEGER_MINUS_ONE);
        assertEquals(Short.valueOf((short) 0), NumberUtils.SHORT_ZERO);
        assertEquals(Short.valueOf((short) 1), NumberUtils.SHORT_ONE);
        assertEquals(Short.valueOf((short) -1), NumberUtils.SHORT_MINUS_ONE);
        assertEquals(Byte.valueOf((byte) 0), NumberUtils.BYTE_ZERO);
        assertEquals(Byte.valueOf((byte) 1), NumberUtils.BYTE_ONE);
        assertEquals(Byte.valueOf((byte) -1), NumberUtils.BYTE_MINUS_ONE);
        assertEquals(Double.valueOf(0.0d), NumberUtils.DOUBLE_ZERO);
        assertEquals(Double.valueOf(1.0d), NumberUtils.DOUBLE_ONE);
        assertEquals(Double.valueOf(-1.0d), NumberUtils.DOUBLE_MINUS_ONE);
        assertEquals(Float.valueOf(0.0f), NumberUtils.FLOAT_ZERO);
        assertEquals(Float.valueOf(1.0f), NumberUtils.FLOAT_ONE);
        assertEquals(Float.valueOf(-1.0f), NumberUtils.FLOAT_MINUS_ONE);
    }

    @Test
    public void testToInt_String() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(0, NumberUtils.toInt("abc"));
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(-123, NumberUtils.toInt("-123"));
    }

    @Test
    public void testToInt_String_int() {
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("", 5));
        assertEquals(5, NumberUtils.toInt("invalid", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    @Test
    public void testToLong_String() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("abc"));
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        assertEquals(-1234567890123L, NumberUtils.toLong("-1234567890123"));
    }

    @Test
    public void testToLong_String_long() {
        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("", 5L));
        assertEquals(5L, NumberUtils.toLong("invalid", 5L));
        assertEquals(123L, NumberUtils.toLong("123", 5L));
    }

    @Test
    public void testToFloat_String() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23"), 0.0001f);
        assertEquals(-1.23f, NumberUtils.toFloat("-1.23"), 0.0001f);
    }

    @Test
    public void testToFloat_String_float() {
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("", 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("invalid", 5.5f), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23", 5.5f), 0.0001f);
    }

    @Test
    public void testToDouble_String() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345"), 0.0001d);
        assertEquals(-1.2345d, NumberUtils.toDouble("-1.2345"), 0.0001d);
    }

    @Test
    public void testToDouble_String_double() {
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("", 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("invalid", 5.5d), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345", 5.5d), 0.0001d);
    }

    @Test
    public void testToByte_String() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
        assertEquals((byte) 123, NumberUtils.toByte("123"));
        assertEquals((byte) -123, NumberUtils.toByte("-123"));
    }

    @Test
    public void testToByte_String_byte() {
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("", (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("invalid", (byte) 5));
        assertEquals((byte) 123, NumberUtils.toByte("123", (byte) 5));
    }

    @Test
    public void testToShort_String() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 0, NumberUtils.toShort("abc"));
        assertEquals((short) 1234, NumberUtils.toShort("1234"));
        assertEquals((short) -1234, NumberUtils.toShort("-1234"));
    }

    @Test
    public void testToShort_String_short() {
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("invalid", (short) 5));
        assertEquals((short) 1234, NumberUtils.toShort("1234", (short) 5));
    }

    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createFloat("1.23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("invalid");
    }

    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.2345d), NumberUtils.createDouble("1.2345"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("invalid");
    }

    @Test
    public void testCreateInteger() {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("0x7b"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createInteger("-0x7b"));
        assertEquals(Integer.valueOf(8), NumberUtils.createInteger("010"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("invalid");
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(1234567890123L), NumberUtils.createLong("1234567890123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("invalid");
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createBigInteger("123456789012345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("invalid");
    }

    @Test
    public void testCreateBigDecimal() {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("12345678901234567890.123456789"), NumberUtils.createBigDecimal("12345678901234567890.123456789"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("invalid");
    }

    @Test
    public void testCreateNumber() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("0x7b"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-0x7b"));
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));

        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));

        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("00.00f"));
        assertEquals(Float.valueOf(1e2f), NumberUtils.createNumber("1e2f"));
        assertEquals(new BigDecimal("1.23456789012345678901234567890f".substring(0, 31)), NumberUtils.createNumber("1.23456789012345678901234567890f"));

        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        assertEquals(Double.valueOf(1e2d), NumberUtils.createNumber("1e2d"));

        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        assertEquals(Double.valueOf(1.2345678901234567d), NumberUtils.createNumber("1.2345678901234567"));
        assertEquals(new BigDecimal("1.234567890123456789012345678901234567890"), NumberUtils.createNumber("1.234567890123456789012345678901234567890"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Double.valueOf(1e2), NumberUtils.createNumber("1e2"));
        assertEquals(Double.valueOf(1e20), NumberUtils.createNumber("1e20"));
        assertEquals(Float.valueOf(1.2f), NumberUtils.createNumber("1.2e1"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0e0"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0e0"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001e-400"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expBeforeDec() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongWithDec() {
        NumberUtils.createNumber("1.23L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongWithExp() {
        NumberUtils.createNumber("1e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongChars() {
        NumberUtils.createNumber("1a2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidQualifier() {
        NumberUtils.createNumber("123z");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidInput() {
        NumberUtils.createNumber("abc");
    }

    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, 0L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_empty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMin_intArray() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArray_null() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArray_empty() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMin_shortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 3, (short) 1, (short) 2}));
        assertEquals((short) -5, NumberUtils.min(new short[]{(short) -1, (short) -5, (short) 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArray_null() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArray_empty() {
        NumberUtils.min(new short[0]);
    }

    @Test
    public void testMin_byteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
        assertEquals((byte) -5, NumberUtils.min(new byte[]{(byte) -1, (byte) -5, (byte) 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArray_null() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArray_empty() {
        NumberUtils.min(new byte[0]);
    }

    @Test
    public void testMin_doubleArray() {
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), 0.0001d);
        assertEquals(-5.5d, NumberUtils.min(new double[]{-1.1d, -5.5d, 0.0d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArray_null() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArray_empty() {
        NumberUtils.min(new double[0]);
    }

    @Test
    public void testMin_floatArray() {
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), 0.0001f);
        assertEquals(-5.5f, NumberUtils.min(new float[]{-1.1f, -5.5f, 0.0f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArray_null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArray_empty() {
        NumberUtils.min(new float[0]);
    }

    @Test
    public void testMax_longArray() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals(0L, NumberUtils.max(new long[]{-1L, -5L, 0L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_null() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_empty() {
        NumberUtils.max(new long[0]);
    }

    @Test
    public void testMax_intArray() {
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        assertEquals(0, NumberUtils.max(new int[]{-1, -5, 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArray_null() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArray_empty() {
        NumberUtils.max(new int[0]);
    }

    @Test
    public void testMax_shortArray() {
        assertEquals((short) 3, NumberUtils.max(new short[]{(short) 1, (short) 3, (short) 2}));
        assertEquals((short) 0, NumberUtils.max(new short[]{(short) -1, (short) -5, (short) 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArray_null() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArray_empty() {
        NumberUtils.max(new short[0]);
    }

    @Test
    public void testMax_byteArray() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 1, (byte) 3, (byte) 2}));
        assertEquals((byte) 0, NumberUtils.max(new byte[]{(byte) -1, (byte) -5, (byte) 0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArray_null() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArray_empty() {
        NumberUtils.max(new byte[0]);
    }

    @Test
    public void testMax_doubleArray() {
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), 0.0001d);
        assertEquals(0.0d, NumberUtils.max(new double[]{-1.1d, -5.5d, 0.0d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArray_null() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArray_empty() {
        NumberUtils.max(new double[0]);
    }

    @Test
    public void testMax_floatArray() {
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), 0.0001f);
        assertEquals(0.0f, NumberUtils.max(new float[]{-1.1f, -5.5f, 0.0f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArray_null() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArray_empty() {
        NumberUtils.max(new float[0]);
    }

    @Test
    public void testMin_3long() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin_3int() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin_3short() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin_3byte() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin_3double() {
        assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(Double.NaN, 1.0d, 2.0d)));
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, Double.NaN, 2.0d)));
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, 2.0d, Double.NaN)));
    }

    @Test
    public void testMin_3float() {
        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(Float.NaN, 1.0f, 2.0f)));
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, Float.NaN, 2.0f)));
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, 2.0f, Float.NaN)));
    }

    @Test
    public void testMax_3long() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
    }

    @Test
    public void testMax_3int() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 1, 2));
    }

    @Test
    public void testMax_3short() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMax_3byte() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMax_3double() {
        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(Double.NaN, 1.0d, 2.0d)));
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, Double.NaN, 2.0d)));
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, 2.0d, Double.NaN)));
    }

    @Test
    public void testMax_3float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(Float.NaN, 1.0f, 2.0f)));
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 2.0f)));
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, 2.0f, Float.NaN)));
    }

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("123a"));
        assertFalse(NumberUtils.isDigits("12.3"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertTrue(NumberUtils.isDigits("1234567890"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(" "));
        assertFalse(NumberUtils.isNumber("abc"));

        // Hex numbers
        assertTrue(NumberUtils.isNumber("0x123"));
        assertTrue(NumberUtils.isNumber("-0x123"));
        assertTrue(NumberUtils.isNumber("0xABCdef"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0xGHI"));

        // Integers
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));

        // Decimals
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertTrue(NumberUtils.isNumber(".45"));
        assertTrue(NumberUtils.isNumber("123."));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("1.2.3"));

        // Exponents
        assertTrue(NumberUtils.isNumber("123e4"));
        assertTrue(NumberUtils.isNumber("123E4"));
        assertTrue(NumberUtils.isNumber("123e+4"));
        assertTrue(NumberUtils.isNumber("123e-4"));
        assertTrue(NumberUtils.isNumber("-123e-4"));
        assertTrue(NumberUtils.isNumber("1.23e4"));
        assertFalse(NumberUtils.isNumber("e4"));
        assertFalse(NumberUtils.isNumber("123e"));
        assertFalse(NumberUtils.isNumber("123e+"));
        assertFalse(NumberUtils.isNumber("123e-"));
        assertFalse(NumberUtils.isNumber("123e4e5"));
        assertFalse(NumberUtils.isNumber("123e4.5"));

        // Type qualifiers
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("1.23f"));
        assertTrue(NumberUtils.isNumber("1.23d"));
        assertTrue(NumberUtils.isNumber("1.23e4f"));
        assertTrue(NumberUtils.isNumber("1.23e4d"));
        assertFalse(NumberUtils.isNumber("123e4L"));
        assertFalse(NumberUtils.isNumber("L"));
        assertFalse(NumberUtils.isNumber("f"));
        assertFalse(NumberUtils.isNumber("d"));
        assertFalse(NumberUtils.isNumber("123a"));
        assertFalse(NumberUtils.isNumber("123-4"));
    }
}
