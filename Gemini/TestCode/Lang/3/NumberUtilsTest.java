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
    }

    @Test
    public void testToInt_String_int() {
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("", 5));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    @Test
    public void testToLong_String() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("abc"));
        assertEquals(123456789012L, NumberUtils.toLong("123456789012"));
    }

    @Test
    public void testToLong_String_long() {
        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("", 5L));
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
        assertEquals(123456789012L, NumberUtils.toLong("123456789012", 5L));
    }

    @Test
    public void testToFloat_String() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23"), 0.0001f);
    }

    @Test
    public void testToFloat_String_float() {
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("", 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("abc", 5.5f), 0.0001f);
        assertEquals(1.23f, NumberUtils.toFloat("1.23", 5.5f), 0.0001f);
    }

    @Test
    public void testToDouble_String() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345"), 0.0001d);
    }

    @Test
    public void testToDouble_String_double() {
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("", 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("abc", 5.5d), 0.0001d);
        assertEquals(1.2345d, NumberUtils.toDouble("1.2345", 5.5d), 0.0001d);
    }

    @Test
    public void testToByte_String() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
        assertEquals((byte) 123, NumberUtils.toByte("123"));
    }

    @Test
    public void testToByte_String_byte() {
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("", (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("abc", (byte) 5));
        assertEquals((byte) 123, NumberUtils.toByte("123", (byte) 5));
    }

    @Test
    public void testToShort_String() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 0, NumberUtils.toShort("abc"));
        assertEquals((short) 123, NumberUtils.toShort("123"));
    }

    @Test
    public void testToShort_String_short() {
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
        assertEquals((short) 123, NumberUtils.toShort("123", (short) 5));
    }

    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.234f), NumberUtils.createFloat("1.234"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("invalid");
    }

    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.234d), NumberUtils.createDouble("1.234"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("invalid");
    }

    @Test
    public void testCreateInteger() {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(1234), NumberUtils.createInteger("1234"));
        assertEquals(Integer.valueOf(0x12), NumberUtils.createInteger("0x12"));
        assertEquals(Integer.valueOf(012), NumberUtils.createInteger("012"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("invalid");
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(1234L), NumberUtils.createLong("1234"));
        assertEquals(Long.valueOf(0x12L), NumberUtils.createLong("0x12"));
        assertEquals(Long.valueOf(012L), NumberUtils.createLong("012"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("invalid");
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("1234"), NumberUtils.createBigInteger("1234"));
        assertEquals(new BigInteger("-1234"), NumberUtils.createBigInteger("-1234"));
        assertEquals(new BigInteger("10", 16), NumberUtils.createBigInteger("0x10"));
        assertEquals(new BigInteger("-10", 16), NumberUtils.createBigInteger("-0x10"));
        assertEquals(new BigInteger("10", 16), NumberUtils.createBigInteger("#10"));
        assertEquals(new BigInteger("-10", 16), NumberUtils.createBigInteger("-#10"));
        assertEquals(new BigInteger("10", 8), NumberUtils.createBigInteger("010"));
        assertEquals(new BigInteger("-10", 8), NumberUtils.createBigInteger("-010"));
        assertEquals(new BigInteger("0"), NumberUtils.createBigInteger("0"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("invalid");
    }

    @Test
    public void testCreateBigDecimal() {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_doubleNegative() {
        NumberUtils.createBigDecimal("--123.45");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("invalid");
    }

    @Test
    public void testCreateNumber() {
        assertNull(NumberUtils.createNumber(null));

        // Hex formats
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0x1234"));
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0X1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-0x1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-0X1234"));
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("#1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-#1234"));
        assertEquals(Long.valueOf(0x123456789L), NumberUtils.createNumber("0x123456789"));
        assertEquals(new BigInteger("123456789012345678", 16), NumberUtils.createNumber("0x123456789012345678"));

        // Long suffix
        assertEquals(Long.valueOf(12345L), NumberUtils.createNumber("12345L"));
        assertEquals(Long.valueOf(-12345L), NumberUtils.createNumber("-12345l"));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createNumber("123456789012345678901234567890L"));

        // Float suffix
        assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234f"));
        assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Double.valueOf(1.1E200d), NumberUtils.createNumber("1.1E200f"));

        // Double suffix
        assertEquals(Double.valueOf(1.234d), NumberUtils.createNumber("1.234d"));
        assertEquals(Double.valueOf(1.234d), NumberUtils.createNumber("1.234D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        assertEquals(new BigDecimal("1.1E500"), NumberUtils.createNumber("1.1E500d"));

        // Default type deduction - integers
        assertEquals(Integer.valueOf(1234), NumberUtils.createNumber("1234"));
        assertEquals(Long.valueOf(123456789012L), NumberUtils.createNumber("123456789012"));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createNumber("123456789012345678901234567890"));

        // Default type deduction - floating points
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234"));
        assertEquals(Double.valueOf(1.1E200d), NumberUtils.createNumber("1.1E200"));
        assertEquals(new BigDecimal("1.1E500"), NumberUtils.createNumber("1.1E500"));
        assertEquals(new BigDecimal("0.000000000000000000000000000000000000000000000000000001"),
                NumberUtils.createNumber("0.000000000000000000000000000000000000000000000000000001"));
        assertEquals(Float.valueOf(1e5f), NumberUtils.createNumber("1e5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosLessThanDecPos() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosGreaterThanLengthWithDec() {
        NumberUtils.createNumber("1.2eE3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosGreaterThanLengthWithoutDec() {
        NumberUtils.createNumber("12eE3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongSuffixDec() {
        NumberUtils.createNumber("123.4L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongSuffixExp() {
        NumberUtils.createNumber("123e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongSuffixAlpha() {
        NumberUtils.createNumber("123aL");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidFloatSuffix() {
        NumberUtils.createNumber("1.2.3f");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidDoubleSuffix() {
        NumberUtils.createNumber("1.2.3d");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidSuffix() {
        NumberUtils.createNumber("1234z");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidFloatDoubleFallback() {
        NumberUtils.createNumber("1.2.3");
    }

    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(1L, NumberUtils.min(new long[]{1L, 2L, 3L}));
        assertEquals(1L, NumberUtils.min(new long[]{3L, 2L, 1L}));
        assertEquals(1L, NumberUtils.min(new long[]{1L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_empty() {
        NumberUtils.min(new long[]{});
    }

    @Test
    public void testMin_intArray() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals(1, NumberUtils.min(new int[]{1, 2, 3}));
        assertEquals(1, NumberUtils.min(new int[]{3, 2, 1}));
        assertEquals(1, NumberUtils.min(new int[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArray_null() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArray_empty() {
        NumberUtils.min(new int[]{});
    }

    @Test
    public void testMin_shortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((short) 1, NumberUtils.min(new short[]{1, 2, 3}));
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 2, 1}));
        assertEquals((short) 1, NumberUtils.min(new short[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArray_null() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArray_empty() {
        NumberUtils.min(new short[]{});
    }

    @Test
    public void testMin_byteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{1, 2, 3}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 2, 1}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArray_null() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArray_empty() {
        NumberUtils.min(new byte[]{});
    }

    @Test
    public void testMin_doubleArray() {
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(new double[]{1.1d, 2.2d, 3.3d}), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 2.2d, 1.1d}), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(new double[]{1.1d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.1d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArray_null() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArray_empty() {
        NumberUtils.min(new double[]{});
    }

    @Test
    public void testMin_floatArray() {
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(new float[]{1.1f, 2.2f, 3.3f}), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 2.2f, 1.1f}), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(new float[]{1.1f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.1f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArray_null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArray_empty() {
        NumberUtils.min(new float[]{});
    }

    @Test
    public void testMax_longArray() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals(3L, NumberUtils.max(new long[]{3L, 2L, 1L}));
        assertEquals(3L, NumberUtils.max(new long[]{1L, 2L, 3L}));
        assertEquals(1L, NumberUtils.max(new long[]{1L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_null() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_empty() {
        NumberUtils.max(new long[]{});
    }

    @Test
    public void testMax_intArray() {
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        assertEquals(3, NumberUtils.max(new int[]{3, 2, 1}));
        assertEquals(3, NumberUtils.max(new int[]{1, 2, 3}));
        assertEquals(1, NumberUtils.max(new int[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArray_null() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArray_empty() {
        NumberUtils.max(new int[]{});
    }

    @Test
    public void testMax_shortArray() {
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
        assertEquals((short) 3, NumberUtils.max(new short[]{3, 2, 1}));
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 2, 3}));
        assertEquals((short) 1, NumberUtils.max(new short[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArray_null() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArray_empty() {
        NumberUtils.max(new short[]{});
    }

    @Test
    public void testMax_byteArray() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{3, 2, 1}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 2, 3}));
        assertEquals((byte) 1, NumberUtils.max(new byte[]{1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArray_null() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArray_empty() {
        NumberUtils.max(new byte[]{});
    }

    @Test
    public void testMax_doubleArray() {
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(new double[]{3.3d, 2.2d, 1.1d}), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 2.2d, 3.3d}), 0.0001d);
        assertEquals(1.1d, NumberUtils.max(new double[]{1.1d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.1d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArray_null() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArray_empty() {
        NumberUtils.max(new double[]{});
    }

    @Test
    public void testMax_floatArray() {
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(new float[]{3.3f, 2.2f, 1.1f}), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 2.2f, 3.3f}), 0.0001f);
        assertEquals(1.1f, NumberUtils.max(new float[]{1.1f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.1f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArray_null() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArray_empty() {
        NumberUtils.max(new float[]{});
    }

    @Test
    public void testMin_threeLongs() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin_threeInts() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin_threeShorts() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin_threeBytes() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin_threeDoubles() {
        assertEquals(1.1d, NumberUtils.min(1.1d, 2.2d, 3.3d), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(2.2d, 1.1d, 3.3d), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(3.3d, 2.2d, 1.1d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(1.1d, Double.NaN, 3.3d)));
    }

    @Test
    public void testMin_threeFloats() {
        assertEquals(1.1f, NumberUtils.min(1.1f, 2.2f, 3.3f), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(2.2f, 1.1f, 3.3f), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(3.3f, 2.2f, 1.1f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(1.1f, Float.NaN, 3.3f)));
    }

    @Test
    public void testMax_threeLongs() {
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
        assertEquals(3L, NumberUtils.max(2L, 3L, 1L));
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
    }

    @Test
    public void testMax_threeInts() {
        assertEquals(3, NumberUtils.max(3, 2, 1));
        assertEquals(3, NumberUtils.max(2, 3, 1));
        assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    @Test
    public void testMax_threeShorts() {
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
        assertEquals((short) 3, NumberUtils.max((short) 2, (short) 3, (short) 1));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMax_threeBytes() {
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
        assertEquals((byte) 3, NumberUtils.max((byte) 2, (byte) 3, (byte) 1));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
    }

    @Test
    public void testMax_threeDoubles() {
        assertEquals(3.3d, NumberUtils.max(3.3d, 2.2d, 1.1d), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(2.2d, 3.3d, 1.1d), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(1.1d, 2.2d, 3.3d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(1.1d, Double.NaN, 3.3d)));
    }

    @Test
    public void testMax_threeFloats() {
        assertEquals(3.3f, NumberUtils.max(3.3f, 2.2f, 1.1f), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(2.2f, 3.3f, 1.1f), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(1.1f, 2.2f, 3.3f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(1.1f, Float.NaN, 3.3f)));
    }

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("123a45"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.3"));
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(" "));
        assertFalse(NumberUtils.isNumber("abc"));

        // Hex numbers
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertTrue(NumberUtils.isNumber("0xabcdef"));
        assertTrue(NumberUtils.isNumber("0xABCDEF"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0x12g"));

        // Integers and Decimals
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertTrue(NumberUtils.isNumber(".45"));
        assertTrue(NumberUtils.isNumber("-.45"));
        assertTrue(NumberUtils.isNumber("123."));
        assertTrue(NumberUtils.isNumber("-123."));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("-."));
        assertFalse(NumberUtils.isNumber("1.2.3"));

        // Exponents
        assertTrue(NumberUtils.isNumber("1e5"));
        assertTrue(NumberUtils.isNumber("1E5"));
        assertTrue(NumberUtils.isNumber("1.2e5"));
        assertTrue(NumberUtils.isNumber("1.2e+5"));
        assertTrue(NumberUtils.isNumber("1.2e-5"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("1ee5"));
        assertFalse(NumberUtils.isNumber("1e5.4"));
        assertFalse(NumberUtils.isNumber("e5"));
        assertFalse(NumberUtils.isNumber("1e5e5"));

        // Type suffixes
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("-123L"));
        assertFalse(NumberUtils.isNumber("123.4L"));
        assertFalse(NumberUtils.isNumber("123e4L"));
        assertFalse(NumberUtils.isNumber("L"));

        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123.4f"));
        assertTrue(NumberUtils.isNumber("123e4f"));
        assertFalse(NumberUtils.isNumber("f"));

        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("123.4d"));
        assertTrue(NumberUtils.isNumber("123e4d"));
        assertFalse(NumberUtils.isNumber("d"));

        // Invalid placements of signs and characters
        assertFalse(NumberUtils.isNumber("12+3"));
        assertFalse(NumberUtils.isNumber("12-3"));
        assertFalse(NumberUtils.isNumber("--123"));
        assertFalse(NumberUtils.isNumber("123a"));
    }
}
