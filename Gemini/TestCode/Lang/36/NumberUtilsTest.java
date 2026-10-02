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
    public void testToInt_String_Int() {
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
        assertEquals(-123456789012L, NumberUtils.toLong("-123456789012"));
    }

    @Test
    public void testToLong_String_Long() {
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
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
        assertEquals(-1.5f, NumberUtils.toFloat("-1.5"), 0.0001f);
    }

    @Test
    public void testToFloat_String_Float() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0001f);
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0001f);
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 1.1f), 0.0001f);
    }

    @Test
    public void testToDouble_String() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
        assertEquals(-1.5d, NumberUtils.toDouble("-1.5"), 0.0001d);
    }

    @Test
    public void testToDouble_String_Double() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0001d);
        assertEquals(1.1d, NumberUtils.toDouble("abc", 1.1d), 0.0001d);
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 1.1d), 0.0001d);
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
    public void testToByte_String_Byte() {
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
        assertEquals((short) 1234, NumberUtils.toShort("1234"));
        assertEquals((short) -1234, NumberUtils.toShort("-1234"));
    }

    @Test
    public void testToShort_String_Short() {
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
        assertEquals((short) 1234, NumberUtils.toShort("1234", (short) 5));
    }

    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_Invalid() {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_Invalid() {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void testCreateInteger() {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("0x7B"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createInteger("-0x7B"));
        assertEquals(Integer.valueOf(63), NumberUtils.createInteger("077"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_Invalid() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(123456789012L), NumberUtils.createLong("123456789012"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_Invalid() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createBigInteger("123456789012345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_Invalid() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void testCreateBigDecimal() {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("123456789012345678901234567890.12345"), NumberUtils.createBigDecimal("123456789012345678901234567890.12345"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Empty() {
        NumberUtils.createBigDecimal("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Invalid() {
        NumberUtils.createBigDecimal("abc");
    }

    @Test
    public void testCreateNumber() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));

        // Hex
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xFF"));

        // No qualifier, Integer, Long, BigInteger
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));

        // No qualifier, Float, Double, BigDecimal
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        assertEquals(Double.valueOf(1.2345678901234567d), NumberUtils.createNumber("1.2345678901234567"));
        assertEquals(new BigDecimal("1e-450"), NumberUtils.createNumber("1e-450"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.00e00"));

        // Qualifier 'l' / 'L'
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));

        // Qualifier 'f' / 'F'
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(-1.23f), NumberUtils.createNumber("-1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Double.valueOf(1.2345678901234567d), NumberUtils.createNumber("1.2345678901234567f"));
        assertEquals(new BigDecimal("1e-450"), NumberUtils.createNumber("1e-450f"));

        // Qualifier 'd' / 'D'
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(-1.23d), NumberUtils.createNumber("-1.23D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        assertEquals(new BigDecimal("1e-450"), NumberUtils.createNumber("1e-450d"));

        // Exponent handling without dec
        assertEquals(Float.valueOf(1e10f), NumberUtils.createNumber("1e10"));
        assertEquals(Float.valueOf(1E10f), NumberUtils.createNumber("1E10"));
        assertEquals(Float.valueOf(1e10f), NumberUtils.createNumber("1e10f"));
        assertEquals(Double.valueOf(1e10d), NumberUtils.createNumber("1e10d"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Empty() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ExpPosLessThanDecPos() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidLQualifierDec() {
        NumberUtils.createNumber("1.23L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidLQualifierExp() {
        NumberUtils.createNumber("1e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidLQualifierChars() {
        NumberUtils.createNumber("abcL");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidQualifier() {
        NumberUtils.createNumber("123q");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidExponent() {
        NumberUtils.createNumber("1e#d");
    }

    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(-5L, NumberUtils.min(new long[]{3L, -5L, 2L}));
        assertEquals(10L, NumberUtils.min(new long[]{10L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_Null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_Empty() {
        NumberUtils.min(new long[]{});
    }

    @Test
    public void testMin_intArray() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals(-5, NumberUtils.min(new int[]{3, -5, 2}));
        assertEquals(10, NumberUtils.min(new int[]{10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArray_Null() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArray_Empty() {
        NumberUtils.min(new int[]{});
    }

    @Test
    public void testMin_shortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((short) -5, NumberUtils.min(new short[]{3, -5, 2}));
        assertEquals((short) 10, NumberUtils.min(new short[]{10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArray_Null() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArray_Empty() {
        NumberUtils.min(new short[]{});
    }

    @Test
    public void testMin_byteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals((byte) -5, NumberUtils.min(new byte[]{3, -5, 2}));
        assertEquals((byte) 10, NumberUtils.min(new byte[]{10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArray_Null() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArray_Empty() {
        NumberUtils.min(new byte[]{});
    }

    @Test
    public void testMin_doubleArray() {
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), 0.0001d);
        assertEquals(-5.5d, NumberUtils.min(new double[]{3.3d, -5.5d, 2.2d}), 0.0001d);
        assertEquals(10.0d, NumberUtils.min(new double[]{10.0d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{3.3d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArray_Null() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArray_Empty() {
        NumberUtils.min(new double[]{});
    }

    @Test
    public void testMin_floatArray() {
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), 0.0001f);
        assertEquals(-5.5f, NumberUtils.min(new float[]{3.3f, -5.5f, 2.2f}), 0.0001f);
        assertEquals(10.0f, NumberUtils.min(new float[]{10.0f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{3.3f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArray_Null() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArray_Empty() {
        NumberUtils.min(new float[]{});
    }

    @Test
    public void testMax_longArray() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals(5L, NumberUtils.max(new long[]{-3L, 5L, -2L}));
        assertEquals(10L, NumberUtils.max(new long[]{10L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_Null() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_Empty() {
        NumberUtils.max(new long[]{});
    }

    @Test
    public void testMax_intArray() {
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        assertEquals(5, NumberUtils.max(new int[]{-3, 5, -2}));
        assertEquals(10, NumberUtils.max(new int[]{10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArray_Null() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArray_Empty() {
        NumberUtils.max(new int[]{});
    }

    @Test
    public void testMax_shortArray() {
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
        assertEquals((short) 5, NumberUtils.max(new short[]{-3, 5, -2}));
        assertEquals((short) 10, NumberUtils.max(new short[]{10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArray_Null() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArray_Empty() {
        NumberUtils.max(new short[]{});
    }

    @Test
    public void testMax_byteArray() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
        assertEquals((byte) 5, NumberUtils.max(new byte[]{-3, 5, -2}));
        assertEquals((byte) 10, NumberUtils.max(new byte[]{10}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArray_Null() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArray_Empty() {
        NumberUtils.max(new byte[]{});
    }

    @Test
    public void testMax_doubleArray() {
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), 0.0001d);
        assertEquals(5.5d, NumberUtils.max(new double[]{-3.3d, 5.5d, -2.2d}), 0.0001d);
        assertEquals(10.0d, NumberUtils.max(new double[]{10.0d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{3.3d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArray_Null() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArray_Empty() {
        NumberUtils.max(new double[]{});
    }

    @Test
    public void testMax_floatArray() {
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), 0.0001f);
        assertEquals(5.5f, NumberUtils.max(new float[]{-3.3f, 5.5f, -2.2f}), 0.0001f);
        assertEquals(10.0f, NumberUtils.max(new float[]{10.0f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{3.3f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArray_Null() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArray_Empty() {
        NumberUtils.max(new float[]{});
    }

    @Test
    public void testMin_3Longs() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin_3Ints() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin_3Shorts() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin_3Bytes() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin_3Doubles() {
        assertEquals(1.1d, NumberUtils.min(1.1d, 2.2d, 3.3d), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(2.2d, 1.1d, 3.3d), 0.0001d);
        assertEquals(1.1d, NumberUtils.min(3.3d, 2.2d, 1.1d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(Double.NaN, 2.2d, 3.3d)));
        assertTrue(Double.isNaN(NumberUtils.min(1.1d, Double.NaN, 3.3d)));
        assertTrue(Double.isNaN(NumberUtils.min(1.1d, 2.2d, Double.NaN)));
    }

    @Test
    public void testMin_3Floats() {
        assertEquals(1.1f, NumberUtils.min(1.1f, 2.2f, 3.3f), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(2.2f, 1.1f, 3.3f), 0.0001f);
        assertEquals(1.1f, NumberUtils.min(3.3f, 2.2f, 1.1f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(Float.NaN, 2.2f, 3.3f)));
        assertTrue(Float.isNaN(NumberUtils.min(1.1f, Float.NaN, 3.3f)));
        assertTrue(Float.isNaN(NumberUtils.min(1.1f, 2.2f, Float.NaN)));
    }

    @Test
    public void testMax_3Longs() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax_3Ints() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMax_3Shorts() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax_3Bytes() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax_3Doubles() {
        assertEquals(3.3d, NumberUtils.max(1.1d, 2.2d, 3.3d), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(1.1d, 3.3d, 2.2d), 0.0001d);
        assertEquals(3.3d, NumberUtils.max(3.3d, 2.2d, 1.1d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(Double.NaN, 2.2d, 3.3d)));
        assertTrue(Double.isNaN(NumberUtils.max(1.1d, Double.NaN, 3.3d)));
        assertTrue(Double.isNaN(NumberUtils.max(1.1d, 2.2d, Double.NaN)));
    }

    @Test
    public void testMax_3Floats() {
        assertEquals(3.3f, NumberUtils.max(1.1f, 2.2f, 3.3f), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(1.1f, 3.3f, 2.2f), 0.0001f);
        assertEquals(3.3f, NumberUtils.max(3.3f, 2.2f, 1.1f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(Float.NaN, 2.2f, 3.3f)));
        assertTrue(Float.isNaN(NumberUtils.max(1.1f, Float.NaN, 3.3f)));
        assertTrue(Float.isNaN(NumberUtils.max(1.1f, 2.2f, Float.NaN)));
    }

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("12a34"));
        assertFalse(NumberUtils.isDigits("-1234"));
        assertFalse(NumberUtils.isDigits("12.34"));
        assertTrue(NumberUtils.isDigits("1234567890"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("   "));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0xxyz"));
        assertTrue(NumberUtils.isNumber("0x1234ABCD"));
        assertTrue(NumberUtils.isNumber("0x1234abcd"));
        assertTrue(NumberUtils.isNumber("-0x1234ABCD"));

        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("+123"));
        assertTrue(NumberUtils.isNumber("12.34"));
        assertTrue(NumberUtils.isNumber("-12.34"));
        assertTrue(NumberUtils.isNumber("12.34e+56"));
        assertTrue(NumberUtils.isNumber("12.34E-56"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("12.34f"));
        assertTrue(NumberUtils.isNumber("12.34F"));
        assertTrue(NumberUtils.isNumber("12.34d"));
        assertTrue(NumberUtils.isNumber("12.34D"));
        assertTrue(NumberUtils.isNumber("1234."));
        assertTrue(NumberUtils.isNumber(".1234"));

        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("12.34.56"));
        assertFalse(NumberUtils.isNumber("12e34e56"));
        assertFalse(NumberUtils.isNumber("12e.4"));
        assertFalse(NumberUtils.isNumber("e12"));
        assertFalse(NumberUtils.isNumber("12e"));
        assertFalse(NumberUtils.isNumber("12e+"));
        assertFalse(NumberUtils.isNumber("12e-"));
        assertFalse(NumberUtils.isNumber("12e+34L"));
        assertFalse(NumberUtils.isNumber("1234L5"));
        assertFalse(NumberUtils.isNumber("1234a"));
        assertFalse(NumberUtils.isNumber("--123"));
        assertFalse(NumberUtils.isNumber("++123"));
        assertFalse(NumberUtils.isNumber("1-2"));
        assertFalse(NumberUtils.isNumber("1+2"));
    }
}
