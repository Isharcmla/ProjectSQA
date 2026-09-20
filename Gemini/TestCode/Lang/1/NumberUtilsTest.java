package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

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
    public void testToInt() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(0, NumberUtils.toInt("abc"));
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(-123, NumberUtils.toInt("-123"));

        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("", 5));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    @Test
    public void testToLong() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("abc"));
        assertEquals(123L, NumberUtils.toLong("123"));
        assertEquals(-123L, NumberUtils.toLong("-123"));

        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("", 5L));
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
        assertEquals(123L, NumberUtils.toLong("123", 5L));
    }

    @Test
    public void testToFloat() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
        assertEquals(-1.5f, NumberUtils.toFloat("-1.5"), 0.0001f);

        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("", 5.5f), 0.0001f);
        assertEquals(5.5f, NumberUtils.toFloat("abc", 5.5f), 0.0001f);
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 5.5f), 0.0001f);
    }

    @Test
    public void testToDouble() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
        assertEquals(-1.5d, NumberUtils.toDouble("-1.5"), 0.0001d);

        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("", 5.5d), 0.0001d);
        assertEquals(5.5d, NumberUtils.toDouble("abc", 5.5d), 0.0001d);
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 5.5d), 0.0001d);
    }

    @Test
    public void testToByte() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
        assertEquals((byte) 12, NumberUtils.toByte("12"));
        assertEquals((byte) -12, NumberUtils.toByte("-12"));

        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("", (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("abc", (byte) 5));
        assertEquals((byte) 12, NumberUtils.toByte("12", (byte) 5));
    }

    @Test
    public void testToShort() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 0, NumberUtils.toShort("abc"));
        assertEquals((short) 123, NumberUtils.toShort("123"));
        assertEquals((short) -123, NumberUtils.toShort("-123"));

        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
        assertEquals((short) 123, NumberUtils.toShort("123", (short) 5));
    }

    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("invalid");
    }

    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
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
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("#7b"));
        assertEquals(Integer.valueOf(8), NumberUtils.createInteger("010"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("invalid");
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(123456789012L), NumberUtils.createLong("123456789012"));
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("0x7b"));
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("#7b"));
        assertEquals(Long.valueOf(8L), NumberUtils.createLong("010"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("invalid");
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
        assertEquals(new BigInteger("-123"), NumberUtils.createBigInteger("-123"));
        assertEquals(new BigInteger("123", 16), NumberUtils.createBigInteger("0x123"));
        assertEquals(new BigInteger("-123", 16), NumberUtils.createBigInteger("-0x123"));
        assertEquals(new BigInteger("123", 16), NumberUtils.createBigInteger("#123"));
        assertEquals(new BigInteger("-123", 16), NumberUtils.createBigInteger("-#123"));
        assertEquals(new BigInteger("12", 8), NumberUtils.createBigInteger("012"));
        assertEquals(new BigInteger("-12", 8), NumberUtils.createBigInteger("-012"));
        assertEquals(BigInteger.ZERO, NumberUtils.createBigInteger("0"));
        assertEquals(BigInteger.ZERO, NumberUtils.createBigInteger("-0"));
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
        NumberUtils.createBigDecimal("--123");
    }

    @Test
    public void testCreateNumber() {
        assertNull(NumberUtils.createNumber(null));

        // Hex numbers
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0x1234"));
        assertEquals(Integer.valueOf(0X1234), NumberUtils.createNumber("0X1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-0x1234"));
        assertEquals(Integer.valueOf(-0X1234), NumberUtils.createNumber("-0X1234"));
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("#1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-#1234"));
        assertEquals(Long.valueOf(0x123456789L), NumberUtils.createNumber("0x123456789"));
        assertEquals(new BigInteger("123456789012345678", 16), NumberUtils.createNumber("0x123456789012345678"));

        // Integers and Longs
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Long.valueOf(123456789012L), NumberUtils.createNumber("123456789012"));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createNumber("123456789012345678901234567890"));

        // With type specifiers - Long
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createNumber("123456789012345678901234567890L"));

        // With type specifiers - Float
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));

        // With type specifiers - Double
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));

        // Fallthrough from float/double type qualifier to BigDecimal if precision/overflow
        assertEquals(new BigDecimal("1.234567890123456789e350"), NumberUtils.createNumber("1.234567890123456789e350f"));
        assertEquals(new BigDecimal("1.234567890123456789e350"), NumberUtils.createNumber("1.234567890123456789e350d"));

        // Floating point without type specifier
        assertEquals(Float.valueOf(1.2345f), NumberUtils.createNumber("1.2345"));
        assertEquals(Double.valueOf(1.23456789012d), NumberUtils.createNumber("1.23456789012"));
        assertEquals(new BigDecimal("1.23456789012345678901"), NumberUtils.createNumber("1.23456789012345678901"));

        // Exponents
        assertEquals(Float.valueOf("1.23e4"), NumberUtils.createNumber("1.23e4"));
        assertEquals(Float.valueOf("1.23E4"), NumberUtils.createNumber("1.23E4"));
        assertEquals(Float.valueOf("1e4"), NumberUtils.createNumber("1e4"));
        assertEquals(Double.valueOf("1.2345678901e4"), NumberUtils.createNumber("1.2345678901e4"));
        assertEquals(new BigDecimal("1.23456789012345678901e40"), NumberUtils.createNumber("1.23456789012345678901e40"));

        // Exponent with qualifier
        assertEquals(Float.valueOf("1.23e4f"), NumberUtils.createNumber("1.23e4f"));
        assertEquals(Double.valueOf("1.23e4d"), NumberUtils.createNumber("1.23e4d"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierWithDec() {
        NumberUtils.createNumber("1.23L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierWithExp() {
        NumberUtils.createNumber("1e3L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierNotDigits() {
        NumberUtils.createNumber("abcL");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidQualifier() {
        NumberUtils.createNumber("123a");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_misplacedExpAndDec() {
        NumberUtils.createNumber("1e.2");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_doubleExponent() {
        NumberUtils.createNumber("1e2e3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_doubleExponentNoDec() {
        NumberUtils.createNumber("1e2E3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_noTypeMatch() {
        NumberUtils.createNumber("foo.bar");
    }

    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 2L, 1L}));
        assertEquals(-5L, NumberUtils.min(new long[]{3L, -5L, 1L}));
        assertEquals(7L, NumberUtils.min(new long[]{7L}));
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
        assertEquals(1, NumberUtils.min(new int[]{3, 2, 1}));
        assertEquals(-5, NumberUtils.min(new int[]{3, -5, 1}));
        assertEquals(7, NumberUtils.min(new int[]{7}));
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
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 2, 1}));
        assertEquals((short) -5, NumberUtils.min(new short[]{3, -5, 1}));
        assertEquals((short) 7, NumberUtils.min(new short[]{7}));
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
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 2, 1}));
        assertEquals((byte) -5, NumberUtils.min(new byte[]{3, -5, 1}));
        assertEquals((byte) 7, NumberUtils.min(new byte[]{7}));
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
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0d, 2.0d, 1.0d}), 0.0001d);
        assertEquals(-5.0d, NumberUtils.min(new double[]{3.0d, -5.0d, 1.0d}), 0.0001d);
        assertEquals(7.0d, NumberUtils.min(new double[]{7.0d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{3.0d, Double.NaN, 1.0d})));
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
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 2.0f, 1.0f}), 0.0001f);
        assertEquals(-5.0f, NumberUtils.min(new float[]{3.0f, -5.0f, 1.0f}), 0.0001f);
        assertEquals(7.0f, NumberUtils.min(new float[]{7.0f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{3.0f, Float.NaN, 1.0f})));
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
        assertEquals(3L, NumberUtils.max(new long[]{1L, 2L, 3L}));
        assertEquals(5L, NumberUtils.max(new long[]{-3L, 5L, 1L}));
        assertEquals(7L, NumberUtils.max(new long[]{7L}));
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
        assertEquals(3, NumberUtils.max(new int[]{1, 2, 3}));
        assertEquals(5, NumberUtils.max(new int[]{-3, 5, 1}));
        assertEquals(7, NumberUtils.max(new int[]{7}));
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
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 2, 3}));
        assertEquals((short) 5, NumberUtils.max(new short[]{-3, 5, 1}));
        assertEquals((short) 7, NumberUtils.max(new short[]{7}));
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
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 2, 3}));
        assertEquals((byte) 5, NumberUtils.max(new byte[]{-3, 5, 1}));
        assertEquals((byte) 7, NumberUtils.max(new byte[]{7}));
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
        assertEquals(3.0d, NumberUtils.max(new double[]{1.0d, 2.0d, 3.0d}), 0.0001d);
        assertEquals(5.0d, NumberUtils.max(new double[]{-3.0d, 5.0d, 1.0d}), 0.0001d);
        assertEquals(7.0d, NumberUtils.max(new double[]{7.0d}), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0d, Double.NaN, 3.0d})));
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
        assertEquals(3.0f, NumberUtils.max(new float[]{1.0f, 2.0f, 3.0f}), 0.0001f);
        assertEquals(5.0f, NumberUtils.max(new float[]{-3.0f, 5.0f, 1.0f}), 0.0001f);
        assertEquals(7.0f, NumberUtils.max(new float[]{7.0f}), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 3.0f})));
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
    public void testMin_3longs() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin_3ints() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin_3shorts() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMin_3bytes() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMin_3doubles() {
        assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(Double.NaN, 2.0d, 3.0d)));
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, Double.NaN, 3.0d)));
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, 2.0d, Double.NaN)));
    }

    @Test
    public void testMin_3floats() {
        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(Float.NaN, 2.0f, 3.0f)));
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, Float.NaN, 3.0f)));
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, 2.0f, Float.NaN)));
    }

    @Test
    public void testMax_3longs() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax_3ints() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMax_3shorts() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax_3bytes() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax_3doubles() {
        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(3.0d, 2.0d, 1.0d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(Double.NaN, 2.0d, 3.0d)));
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, Double.NaN, 3.0d)));
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, 2.0d, Double.NaN)));
    }

    @Test
    public void testMax_3floats() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(3.0f, 2.0f, 1.0f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(Float.NaN, 2.0f, 3.0f)));
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 3.0f)));
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, 2.0f, Float.NaN)));
    }

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("12345"));
        assertFalse(NumberUtils.isDigits("123.45"));
        assertFalse(NumberUtils.isDigits("123a45"));
        assertFalse(NumberUtils.isDigits("-123"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(" "));

        // Hex numbers
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertTrue(NumberUtils.isNumber("0xabcdef"));
        assertTrue(NumberUtils.isNumber("0xABCDEF"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0x123G"));

        // Integers
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));

        // Decimals
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertTrue(NumberUtils.isNumber(".45"));
        assertTrue(NumberUtils.isNumber("-.45"));
        assertTrue(NumberUtils.isNumber("123."));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("-."));
        assertFalse(NumberUtils.isNumber("123.45.67"));

        // Exponents
        assertTrue(NumberUtils.isNumber("123e4"));
        assertTrue(NumberUtils.isNumber("123E4"));
        assertTrue(NumberUtils.isNumber("123e+4"));
        assertTrue(NumberUtils.isNumber("123e-4"));
        assertTrue(NumberUtils.isNumber("-123e4"));
        assertTrue(NumberUtils.isNumber("123.45e4"));
        assertFalse(NumberUtils.isNumber("123e"));
        assertFalse(NumberUtils.isNumber("123e+"));
        assertFalse(NumberUtils.isNumber("123e-"));
        assertFalse(NumberUtils.isNumber("123e4e5"));
        assertFalse(NumberUtils.isNumber("e4"));
        assertFalse(NumberUtils.isNumber("123e4.5"));

        // Type qualifiers
        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123.45d"));
        assertTrue(NumberUtils.isNumber("123.45f"));
        assertTrue(NumberUtils.isNumber("123e4d"));
        assertTrue(NumberUtils.isNumber("123e4f"));

        assertFalse(NumberUtils.isNumber("123.45l"));
        assertFalse(NumberUtils.isNumber("123e4l"));
        assertFalse(NumberUtils.isNumber("123a"));
        assertFalse(NumberUtils.isNumber("d"));
        assertFalse(NumberUtils.isNumber("f"));
        assertFalse(NumberUtils.isNumber("l"));
        assertFalse(NumberUtils.isNumber("+123"));
        assertFalse(NumberUtils.isNumber("--123"));
    }
}
