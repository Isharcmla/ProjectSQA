package org.apache.commons.lang3.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void testConstructor() {
        NumberUtils utils = new NumberUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testConstants() {
        Assert.assertEquals(Long.valueOf(0L), NumberUtils.LONG_ZERO);
        Assert.assertEquals(Long.valueOf(1L), NumberUtils.LONG_ONE);
        Assert.assertEquals(Long.valueOf(-1L), NumberUtils.LONG_MINUS_ONE);

        Assert.assertEquals(Integer.valueOf(0), NumberUtils.INTEGER_ZERO);
        Assert.assertEquals(Integer.valueOf(1), NumberUtils.INTEGER_ONE);
        Assert.assertEquals(Integer.valueOf(-1), NumberUtils.INTEGER_MINUS_ONE);

        Assert.assertEquals(Short.valueOf((short) 0), NumberUtils.SHORT_ZERO);
        Assert.assertEquals(Short.valueOf((short) 1), NumberUtils.SHORT_ONE);
        Assert.assertEquals(Short.valueOf((short) -1), NumberUtils.SHORT_MINUS_ONE);

        Assert.assertEquals(Byte.valueOf((byte) 0), NumberUtils.BYTE_ZERO);
        Assert.assertEquals(Byte.valueOf((byte) 1), NumberUtils.BYTE_ONE);
        Assert.assertEquals(Byte.valueOf((byte) -1), NumberUtils.BYTE_MINUS_ONE);

        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.DOUBLE_ZERO);
        Assert.assertEquals(Double.valueOf(1.0d), NumberUtils.DOUBLE_ONE);
        Assert.assertEquals(Double.valueOf(-1.0d), NumberUtils.DOUBLE_MINUS_ONE);

        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.FLOAT_ZERO);
        Assert.assertEquals(Float.valueOf(1.0f), NumberUtils.FLOAT_ONE);
        Assert.assertEquals(Float.valueOf(-1.0f), NumberUtils.FLOAT_MINUS_ONE);
    }

    @Test
    public void testToInt_string() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
        Assert.assertEquals(0, NumberUtils.toInt(""));
        Assert.assertEquals(0, NumberUtils.toInt("abc"));
        Assert.assertEquals(123, NumberUtils.toInt("123"));
        Assert.assertEquals(-123, NumberUtils.toInt("-123"));
    }

    @Test
    public void testToInt_string_defaultValue() {
        Assert.assertEquals(5, NumberUtils.toInt(null, 5));
        Assert.assertEquals(5, NumberUtils.toInt("", 5));
        Assert.assertEquals(5, NumberUtils.toInt("abc", 5));
        Assert.assertEquals(123, NumberUtils.toInt("123", 5));
        Assert.assertEquals(-123, NumberUtils.toInt("-123", 5));
    }

    @Test
    public void testToLong_string() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
        Assert.assertEquals(0L, NumberUtils.toLong(""));
        Assert.assertEquals(0L, NumberUtils.toLong("abc"));
        Assert.assertEquals(123456789012L, NumberUtils.toLong("123456789012"));
        Assert.assertEquals(-123456789012L, NumberUtils.toLong("-123456789012"));
    }

    @Test
    public void testToLong_string_defaultValue() {
        Assert.assertEquals(5L, NumberUtils.toLong(null, 5L));
        Assert.assertEquals(5L, NumberUtils.toLong("", 5L));
        Assert.assertEquals(5L, NumberUtils.toLong("abc", 5L));
        Assert.assertEquals(123456789012L, NumberUtils.toLong("123456789012", 5L));
    }

    @Test
    public void testToFloat_string() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        Assert.assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
        Assert.assertEquals(1.23f, NumberUtils.toFloat("1.23"), 0.0001f);
        Assert.assertEquals(-1.23f, NumberUtils.toFloat("-1.23"), 0.0001f);
    }

    @Test
    public void testToFloat_string_defaultValue() {
        Assert.assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        Assert.assertEquals(5.5f, NumberUtils.toFloat("", 5.5f), 0.0001f);
        Assert.assertEquals(5.5f, NumberUtils.toFloat("abc", 5.5f), 0.0001f);
        Assert.assertEquals(1.23f, NumberUtils.toFloat("1.23", 5.5f), 0.0001f);
    }

    @Test
    public void testToDouble_string() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        Assert.assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
        Assert.assertEquals(1.2345d, NumberUtils.toDouble("1.2345"), 0.0001d);
        Assert.assertEquals(-1.2345d, NumberUtils.toDouble("-1.2345"), 0.0001d);
    }

    @Test
    public void testToDouble_string_defaultValue() {
        Assert.assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0001d);
        Assert.assertEquals(5.5d, NumberUtils.toDouble("", 5.5d), 0.0001d);
        Assert.assertEquals(5.5d, NumberUtils.toDouble("abc", 5.5d), 0.0001d);
        Assert.assertEquals(1.2345d, NumberUtils.toDouble("1.2345", 5.5d), 0.0001d);
    }

    @Test
    public void testToByte_string() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
        Assert.assertEquals((byte) 0, NumberUtils.toByte(""));
        Assert.assertEquals((byte) 0, NumberUtils.toByte("abc"));
        Assert.assertEquals((byte) 123, NumberUtils.toByte("123"));
        Assert.assertEquals((byte) -123, NumberUtils.toByte("-123"));
    }

    @Test
    public void testToByte_string_defaultValue() {
        Assert.assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        Assert.assertEquals((byte) 5, NumberUtils.toByte("", (byte) 5));
        Assert.assertEquals((byte) 5, NumberUtils.toByte("abc", (byte) 5));
        Assert.assertEquals((byte) 123, NumberUtils.toByte("123", (byte) 5));
    }

    @Test
    public void testToShort_string() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
        Assert.assertEquals((short) 0, NumberUtils.toShort(""));
        Assert.assertEquals((short) 0, NumberUtils.toShort("abc"));
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234"));
        Assert.assertEquals((short) -1234, NumberUtils.toShort("-1234"));
    }

    @Test
    public void testToShort_string_defaultValue() {
        Assert.assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        Assert.assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
        Assert.assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
        Assert.assertEquals((short) 1234, NumberUtils.toShort("1234", (short) 5));
    }

    @Test
    public void testCreateFloat() {
        Assert.assertNull(NumberUtils.createFloat(null));
        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createFloat("1.23"));
        Assert.assertEquals(Float.valueOf(-1.23f), NumberUtils.createFloat("-1.23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void testCreateDouble() {
        Assert.assertNull(NumberUtils.createDouble(null));
        Assert.assertEquals(Double.valueOf(1.2345d), NumberUtils.createDouble("1.2345"));
        Assert.assertEquals(Double.valueOf(-1.2345d), NumberUtils.createDouble("-1.2345"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void testCreateInteger() {
        Assert.assertNull(NumberUtils.createInteger(null));
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        Assert.assertEquals(Integer.valueOf(0x1a), NumberUtils.createInteger("0x1a"));
        Assert.assertEquals(Integer.valueOf(012), NumberUtils.createInteger("012"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void testCreateLong() {
        Assert.assertNull(NumberUtils.createLong(null));
        Assert.assertEquals(Long.valueOf(123456789012L), NumberUtils.createLong("123456789012"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void testCreateBigInteger() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
        Assert.assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void testCreateBigDecimal() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
        Assert.assertEquals(new BigDecimal("12345678901234567890.123456789"), NumberUtils.createBigDecimal("12345678901234567890.123456789"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() {
        NumberUtils.createBigDecimal("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_empty() {
        NumberUtils.createBigDecimal("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("abc");
    }

    @Test
    public void testCreateNumber_nullAndBlank() {
        Assert.assertNull(NumberUtils.createNumber(null));
        Assert.assertNull(NumberUtils.createNumber("--1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_empty() {
        NumberUtils.createNumber("");
    }

    @Test
    public void testCreateNumber_hex() {
        Assert.assertEquals(Integer.valueOf(26), NumberUtils.createNumber("0x1a"));
        Assert.assertEquals(Integer.valueOf(26), NumberUtils.createNumber("0X1A"));
        Assert.assertEquals(Integer.valueOf(-26), NumberUtils.createNumber("-0x1a"));
        Assert.assertEquals(Integer.valueOf(-26), NumberUtils.createNumber("-0X1A"));
    }

    @Test
    public void testCreateNumber_typeQualifiers() {
        Assert.assertEquals(Long.valueOf(1234L), NumberUtils.createNumber("1234l"));
        Assert.assertEquals(Long.valueOf(1234L), NumberUtils.createNumber("1234L"));
        Assert.assertEquals(Long.valueOf(-1234L), NumberUtils.createNumber("-1234L"));
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));

        Assert.assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234f"));
        Assert.assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234F"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0f"));

        Assert.assertEquals(Double.valueOf(1.234d), NumberUtils.createNumber("1.234d"));
        Assert.assertEquals(Double.valueOf(1.234d), NumberUtils.createNumber("1.234D"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        Assert.assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0d"));

        Assert.assertEquals(new BigDecimal("1.23456789012345678901234567890"), NumberUtils.createNumber("1.23456789012345678901234567890f"));
        Assert.assertEquals(new BigDecimal("1.23456789012345678901234567890"), NumberUtils.createNumber("1.23456789012345678901234567890d"));

        Assert.assertEquals(Float.valueOf(1.23e2f), NumberUtils.createNumber("1.23e2f"));
        Assert.assertEquals(Double.valueOf(1.23e2d), NumberUtils.createNumber("1.23e2d"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierWithDec() {
        NumberUtils.createNumber("12.34L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierWithExp() {
        NumberUtils.createNumber("12e3L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidTypeQualifier() {
        NumberUtils.createNumber("1234z");
    }

    @Test
    public void testCreateNumber_noQualifier() {
        Assert.assertEquals(Integer.valueOf(1234), NumberUtils.createNumber("1234"));
        Assert.assertEquals(Integer.valueOf(-1234), NumberUtils.createNumber("-1234"));
        Assert.assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        Assert.assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));

        Assert.assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        Assert.assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        Assert.assertEquals(Double.valueOf(1.23e20d), NumberUtils.createNumber("1.23e20"));
        Assert.assertEquals(new BigDecimal("1.23456789012345678901234567890"), NumberUtils.createNumber("1.23456789012345678901234567890"));
        Assert.assertEquals(Float.valueOf(1.23e-2f), NumberUtils.createNumber("1.23e-2"));
        Assert.assertEquals(Float.valueOf(12e2f), NumberUtils.createNumber("12e2"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidExpBeforeDec() {
        NumberUtils.createNumber("12e3.4");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidExpPositionNoDec() {
        NumberUtils.createNumber("123e");
    }

    @Test
    public void testMin_longArray() {
        Assert.assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        Assert.assertEquals(-5L, NumberUtils.min(new long[]{3L, -5L, 2L}));
        Assert.assertEquals(10L, NumberUtils.min(new long[]{10L}));
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
        Assert.assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        Assert.assertEquals(-5, NumberUtils.min(new int[]{3, -5, 2}));
        Assert.assertEquals(10, NumberUtils.min(new int[]{10}));
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
        Assert.assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        Assert.assertEquals((short) -5, NumberUtils.min(new short[]{3, -5, 2}));
        Assert.assertEquals((short) 10, NumberUtils.min(new short[]{10}));
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
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        Assert.assertEquals((byte) -5, NumberUtils.min(new byte[]{3, -5, 2}));
        Assert.assertEquals((byte) 10, NumberUtils.min(new byte[]{10}));
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
        Assert.assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), 0.0001d);
        Assert.assertEquals(-5.5d, NumberUtils.min(new double[]{3.3d, -5.5d, 2.2d}), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[]{3.3d, Double.NaN, 2.2d})));
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
        Assert.assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), 0.0001f);
        Assert.assertEquals(-5.5f, NumberUtils.min(new float[]{3.3f, -5.5f, 2.2f}), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[]{3.3f, Float.NaN, 2.2f})));
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
        Assert.assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        Assert.assertEquals(5L, NumberUtils.max(new long[]{-3L, 5L, 2L}));
        Assert.assertEquals(10L, NumberUtils.max(new long[]{10L}));
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
        Assert.assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        Assert.assertEquals(5, NumberUtils.max(new int[]{-3, 5, 2}));
        Assert.assertEquals(10, NumberUtils.max(new int[]{10}));
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
        Assert.assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
        Assert.assertEquals((short) 5, NumberUtils.max(new short[]{-3, 5, 2}));
        Assert.assertEquals((short) 10, NumberUtils.max(new short[]{10}));
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
        Assert.assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
        Assert.assertEquals((byte) 5, NumberUtils.max(new byte[]{-3, 5, 2}));
        Assert.assertEquals((byte) 10, NumberUtils.max(new byte[]{10}));
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
        Assert.assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), 0.0001d);
        Assert.assertEquals(5.5d, NumberUtils.max(new double[]{-3.3d, 5.5d, 2.2d}), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.1d, Double.NaN, 2.2d})));
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
        Assert.assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), 0.0001f);
        Assert.assertEquals(5.5f, NumberUtils.max(new float[]{-3.3f, 5.5f, 2.2f}), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.1f, Float.NaN, 2.2f})));
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
    public void testMin_threeLongs() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin_threeInts() {
        Assert.assertEquals(1, NumberUtils.min(1, 2, 3));
        Assert.assertEquals(1, NumberUtils.min(2, 1, 3));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin_threeShorts() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin_threeBytes() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin_threeDoubles() {
        Assert.assertEquals(1.1d, NumberUtils.min(1.1d, 2.2d, 3.3d), 0.0001d);
        Assert.assertEquals(1.1d, NumberUtils.min(2.2d, 1.1d, 3.3d), 0.0001d);
        Assert.assertEquals(1.1d, NumberUtils.min(3.3d, 2.2d, 1.1d), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.min(1.1d, Double.NaN, 3.3d)));
    }

    @Test
    public void testMin_threeFloats() {
        Assert.assertEquals(1.1f, NumberUtils.min(1.1f, 2.2f, 3.3f), 0.0001f);
        Assert.assertEquals(1.1f, NumberUtils.min(2.2f, 1.1f, 3.3f), 0.0001f);
        Assert.assertEquals(1.1f, NumberUtils.min(3.3f, 2.2f, 1.1f), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.min(1.1f, Float.NaN, 3.3f)));
    }

    @Test
    public void testMax_threeLongs() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax_threeInts() {
        Assert.assertEquals(3, NumberUtils.max(1, 2, 3));
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
        Assert.assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMax_threeShorts() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax_threeBytes() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax_threeDoubles() {
        Assert.assertEquals(3.3d, NumberUtils.max(1.1d, 2.2d, 3.3d), 0.0001d);
        Assert.assertEquals(3.3d, NumberUtils.max(1.1d, 3.3d, 2.2d), 0.0001d);
        Assert.assertEquals(3.3d, NumberUtils.max(3.3d, 2.2d, 1.1d), 0.0001d);
        Assert.assertTrue(Double.isNaN(NumberUtils.max(1.1d, Double.NaN, 3.3d)));
    }

    @Test
    public void testMax_threeFloats() {
        Assert.assertEquals(3.3f, NumberUtils.max(1.1f, 2.2f, 3.3f), 0.0001f);
        Assert.assertEquals(3.3f, NumberUtils.max(1.1f, 3.3f, 2.2f), 0.0001f);
        Assert.assertEquals(3.3f, NumberUtils.max(3.3f, 2.2f, 1.1f), 0.0001f);
        Assert.assertTrue(Float.isNaN(NumberUtils.max(1.1f, Float.NaN, 3.3f)));
    }

    @Test
    public void testIsDigits() {
        Assert.assertFalse(NumberUtils.isDigits(null));
        Assert.assertFalse(NumberUtils.isDigits(""));
        Assert.assertFalse(NumberUtils.isDigits("123a"));
        Assert.assertFalse(NumberUtils.isDigits("-123"));
        Assert.assertFalse(NumberUtils.isDigits("12.3"));
        Assert.assertTrue(NumberUtils.isDigits("1234567890"));
    }

    @Test
    public void testIsNumber() {
        Assert.assertFalse(NumberUtils.isNumber(null));
        Assert.assertFalse(NumberUtils.isNumber(""));
        Assert.assertFalse(NumberUtils.isNumber(" "));
        Assert.assertFalse(NumberUtils.isNumber("abc"));
        Assert.assertFalse(NumberUtils.isNumber("0x"));
        Assert.assertFalse(NumberUtils.isNumber("-0x"));
        Assert.assertFalse(NumberUtils.isNumber("0xxyz"));
        Assert.assertTrue(NumberUtils.isNumber("0x1a"));
        Assert.assertTrue(NumberUtils.isNumber("0X1A"));
        Assert.assertTrue(NumberUtils.isNumber("-0x1a"));
        Assert.assertTrue(NumberUtils.isNumber("-0X1A"));

        Assert.assertTrue(NumberUtils.isNumber("123"));
        Assert.assertTrue(NumberUtils.isNumber("-123"));
        Assert.assertTrue(NumberUtils.isNumber("123.45"));
        Assert.assertTrue(NumberUtils.isNumber("-123.45"));
        Assert.assertTrue(NumberUtils.isNumber(".45"));
        Assert.assertTrue(NumberUtils.isNumber("123."));
        Assert.assertFalse(NumberUtils.isNumber("."));

        Assert.assertTrue(NumberUtils.isNumber("123e4"));
        Assert.assertTrue(NumberUtils.isNumber("123E4"));
        Assert.assertTrue(NumberUtils.isNumber("123e+4"));
        Assert.assertTrue(NumberUtils.isNumber("123e-4"));
        Assert.assertFalse(NumberUtils.isNumber("123e"));
        Assert.assertFalse(NumberUtils.isNumber("123e+"));
        Assert.assertFalse(NumberUtils.isNumber("123e-"));
        Assert.assertFalse(NumberUtils.isNumber("123ee4"));
        Assert.assertFalse(NumberUtils.isNumber("123.45.6"));
        Assert.assertFalse(NumberUtils.isNumber("123e4.5"));
        Assert.assertFalse(NumberUtils.isNumber("e123"));

        Assert.assertTrue(NumberUtils.isNumber("123d"));
        Assert.assertTrue(NumberUtils.isNumber("123D"));
        Assert.assertTrue(NumberUtils.isNumber("123f"));
        Assert.assertTrue(NumberUtils.isNumber("123F"));
        Assert.assertTrue(NumberUtils.isNumber("123l"));
        Assert.assertTrue(NumberUtils.isNumber("123L"));

        Assert.assertTrue(NumberUtils.isNumber("123.45d"));
        Assert.assertTrue(NumberUtils.isNumber("123.45f"));
        Assert.assertFalse(NumberUtils.isNumber("123.45l"));
        Assert.assertFalse(NumberUtils.isNumber("123e4l"));
        Assert.assertFalse(NumberUtils.isNumber("123z"));

        Assert.assertFalse(NumberUtils.isNumber("--123"));
        Assert.assertFalse(NumberUtils.isNumber("123-"));
        Assert.assertFalse(NumberUtils.isNumber("123+"));
        Assert.assertFalse(NumberUtils.isNumber("+123"));
    }
}
