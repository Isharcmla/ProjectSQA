package org.apache.commons.lang3.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for NumberUtils targeting high code and branch coverage.
 */
public class NumberUtilsTest {

    private static final float FLOAT_DELTA = 0.0001f;
    private static final double DOUBLE_DELTA = 0.00001d;

    //-----------------------------------------------------------------------
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

    //-----------------------------------------------------------------------
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
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
        assertEquals(-123, NumberUtils.toInt("-123", 5));
    }

    //-----------------------------------------------------------------------
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
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123", 5L));
        assertEquals(-1234567890123L, NumberUtils.toLong("-1234567890123", 5L));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToFloat_String() {
        assertEquals(0.0f, NumberUtils.toFloat(null), FLOAT_DELTA);
        assertEquals(0.0f, NumberUtils.toFloat(""), FLOAT_DELTA);
        assertEquals(0.0f, NumberUtils.toFloat("abc"), FLOAT_DELTA);
        assertEquals(1.23f, NumberUtils.toFloat("1.23"), FLOAT_DELTA);
        assertEquals(-1.23f, NumberUtils.toFloat("-1.23"), FLOAT_DELTA);
    }

    @Test
    public void testToFloat_String_float() {
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), FLOAT_DELTA);
        assertEquals(5.5f, NumberUtils.toFloat("", 5.5f), FLOAT_DELTA);
        assertEquals(5.5f, NumberUtils.toFloat("abc", 5.5f), FLOAT_DELTA);
        assertEquals(1.23f, NumberUtils.toFloat("1.23", 5.5f), FLOAT_DELTA);
        assertEquals(-1.23f, NumberUtils.toFloat("-1.23", 5.5f), FLOAT_DELTA);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDouble_String() {
        assertEquals(0.0d, NumberUtils.toDouble(null), DOUBLE_DELTA);
        assertEquals(0.0d, NumberUtils.toDouble(""), DOUBLE_DELTA);
        assertEquals(0.0d, NumberUtils.toDouble("abc"), DOUBLE_DELTA);
        assertEquals(1.23d, NumberUtils.toDouble("1.23"), DOUBLE_DELTA);
        assertEquals(-1.23d, NumberUtils.toDouble("-1.23"), DOUBLE_DELTA);
    }

    @Test
    public void testToDouble_String_double() {
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), DOUBLE_DELTA);
        assertEquals(5.5d, NumberUtils.toDouble("", 5.5d), DOUBLE_DELTA);
        assertEquals(5.5d, NumberUtils.toDouble("abc", 5.5d), DOUBLE_DELTA);
        assertEquals(1.23d, NumberUtils.toDouble("1.23", 5.5d), DOUBLE_DELTA);
        assertEquals(-1.23d, NumberUtils.toDouble("-1.23", 5.5d), DOUBLE_DELTA);
    }

    //-----------------------------------------------------------------------
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
        assertEquals((byte) 5, NumberUtils.toByte("abc", (byte) 5));
        assertEquals((byte) 123, NumberUtils.toByte("123", (byte) 5));
        assertEquals((byte) -123, NumberUtils.toByte("-123", (byte) 5));
    }

    //-----------------------------------------------------------------------
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
        assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
        assertEquals((short) 1234, NumberUtils.toShort("1234", (short) 5));
        assertEquals((short) -1234, NumberUtils.toShort("-1234", (short) 5));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCreateNumber() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));

        // Hexadecimal
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0x1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-0x1234"));
        assertEquals(Integer.valueOf(0x1234), NumberUtils.createNumber("0X1234"));
        assertEquals(Integer.valueOf(-0x1234), NumberUtils.createNumber("-0X1234"));
        assertEquals(Long.valueOf(0x123456789L), NumberUtils.createNumber("0x123456789"));
        assertEquals(Long.valueOf(-0x123456789L), NumberUtils.createNumber("-0x123456789"));

        // No qualifier: Integer, Long, BigInteger
        assertEquals(Integer.valueOf(1234), NumberUtils.createNumber("1234"));
        assertEquals(Integer.valueOf(-1234), NumberUtils.createNumber("-1234"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));

        // No qualifier: Float, Double, BigDecimal
        assertEquals(Float.valueOf("1.23"), NumberUtils.createNumber("1.23"));
        assertEquals(Float.valueOf("0.0"), NumberUtils.createNumber("0.0"));
        assertEquals(Double.valueOf("1e40"), NumberUtils.createNumber("1e40"));
        assertEquals(Double.valueOf("1.2345678901234567"), NumberUtils.createNumber("1.2345678901234567"));
        assertEquals(new BigDecimal("1e400"), NumberUtils.createNumber("1e400"));
        assertEquals(new BigDecimal("1.0e-50"), NumberUtils.createNumber("1.0e-50"));
        assertEquals(new BigDecimal("0.00000000000000000000000000000000000000000000000001"),
                NumberUtils.createNumber("0.00000000000000000000000000000000000000000000000001"));

        // With Qualifier 'l', 'L'
        assertEquals(Long.valueOf(1234L), NumberUtils.createNumber("1234l"));
        assertEquals(Long.valueOf(-1234L), NumberUtils.createNumber("-1234L"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));

        // With Qualifier 'f', 'F'
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        assertEquals(Double.valueOf("1e40"), NumberUtils.createNumber("1e40f"));
        assertEquals(Double.valueOf("1.0e-50"), NumberUtils.createNumber("1.0e-50f"));
        assertEquals(new BigDecimal("1e400"), NumberUtils.createNumber("1e400f"));

        // With Qualifier 'd', 'D'
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        assertEquals(new BigDecimal("1e400"), NumberUtils.createNumber("1e400d"));
        assertEquals(new BigDecimal("1.0e-350"), NumberUtils.createNumber("1.0e-350d"));

        // Exponent without decimal
        assertEquals(Double.valueOf("1e2"), NumberUtils.createNumber("1e2"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_whitespaces() {
        NumberUtils.createNumber("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidExpBeforeDec() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidExpNoDec() {
        NumberUtils.createNumber("1e");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongWithDec() {
        NumberUtils.createNumber("1.2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongWithExp() {
        NumberUtils.createNumber("1e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongNonNumeric() {
        NumberUtils.createNumber("abcL");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_unknownQualifier() {
        NumberUtils.createNumber("1234z");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidFloatString() {
        NumberUtils.createNumber("abcf");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidDoubleString() {
        NumberUtils.createNumber("abcd");
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createFloat("1.23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("invalid");
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createDouble("1.23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("invalid");
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCreateInteger() {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(0x12), NumberUtils.createInteger("0x12"));
        assertEquals(Integer.valueOf(012), NumberUtils.createInteger("012"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("invalid");
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(123456789L), NumberUtils.createLong("123456789"));
        assertEquals(Long.valueOf(0x12L), NumberUtils.createLong("0x12"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("invalid");
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("invalid");
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCreateBigDecimal() {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("12345.6789"), NumberUtils.createBigDecimal("12345.6789"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() {
        NumberUtils.createBigDecimal("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("invalid");
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{1L}));
        assertEquals(1L, NumberUtils.min(new long[]{1L, 2L, 3L}));
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(1L, NumberUtils.min(new long[]{3L, 2L, 1L}));
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArrayNull() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArrayEmpty() {
        NumberUtils.min(new long[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMin_intArray() {
        assertEquals(1, NumberUtils.min(new int[]{1}));
        assertEquals(1, NumberUtils.min(new int[]{1, 2, 3}));
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
        assertEquals(1, NumberUtils.min(new int[]{3, 2, 1}));
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArrayNull() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_intArrayEmpty() {
        NumberUtils.min(new int[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMin_shortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{1}));
        assertEquals((short) 1, NumberUtils.min(new short[]{1, 2, 3}));
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
        assertEquals((short) 1, NumberUtils.min(new short[]{3, 2, 1}));
        assertEquals((short) -5, NumberUtils.min(new short[]{-1, -5, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArrayNull() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_shortArrayEmpty() {
        NumberUtils.min(new short[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMin_byteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{1}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{1, 2, 3}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 2, 1}));
        assertEquals((byte) -5, NumberUtils.min(new byte[]{-1, -5, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArrayNull() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_byteArrayEmpty() {
        NumberUtils.min(new byte[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMin_doubleArray() {
        assertEquals(1.1d, NumberUtils.min(new double[]{1.1d}), DOUBLE_DELTA);
        assertEquals(1.1d, NumberUtils.min(new double[]{1.1d, 2.2d, 3.3d}), DOUBLE_DELTA);
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), DOUBLE_DELTA);
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 2.2d, 1.1d}), DOUBLE_DELTA);
        assertEquals(-5.5d, NumberUtils.min(new double[]{-1.1d, -5.5d, 2.2d}), DOUBLE_DELTA);
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.1d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArrayNull() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_doubleArrayEmpty() {
        NumberUtils.min(new double[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMin_floatArray() {
        assertEquals(1.1f, NumberUtils.min(new float[]{1.1f}), FLOAT_DELTA);
        assertEquals(1.1f, NumberUtils.min(new float[]{1.1f, 2.2f, 3.3f}), FLOAT_DELTA);
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), FLOAT_DELTA);
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 2.2f, 1.1f}), FLOAT_DELTA);
        assertEquals(-5.5f, NumberUtils.min(new float[]{-1.1f, -5.5f, 2.2f}), FLOAT_DELTA);
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.1f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArrayNull() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_floatArrayEmpty() {
        NumberUtils.min(new float[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMax_longArray() {
        assertEquals(1L, NumberUtils.max(new long[]{1L}));
        assertEquals(3L, NumberUtils.max(new long[]{1L, 2L, 3L}));
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals(3L, NumberUtils.max(new long[]{3L, 2L, 1L}));
        assertEquals(2L, NumberUtils.max(new long[]{-1L, -5L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArrayNull() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArrayEmpty() {
        NumberUtils.max(new long[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMax_intArray() {
        assertEquals(1, NumberUtils.max(new int[]{1}));
        assertEquals(3, NumberUtils.max(new int[]{1, 2, 3}));
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        assertEquals(3, NumberUtils.max(new int[]{3, 2, 1}));
        assertEquals(2, NumberUtils.max(new int[]{-1, -5, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArrayNull() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_intArrayEmpty() {
        NumberUtils.max(new int[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMax_shortArray() {
        assertEquals((short) 1, NumberUtils.max(new short[]{1}));
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 2, 3}));
        assertEquals((short) 3, NumberUtils.max(new short[]{1, 3, 2}));
        assertEquals((short) 3, NumberUtils.max(new short[]{3, 2, 1}));
        assertEquals((short) 2, NumberUtils.max(new short[]{-1, -5, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArrayNull() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_shortArrayEmpty() {
        NumberUtils.max(new short[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMax_byteArray() {
        assertEquals((byte) 1, NumberUtils.max(new byte[]{1}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 2, 3}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{1, 3, 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{3, 2, 1}));
        assertEquals((byte) 2, NumberUtils.max(new byte[]{-1, -5, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArrayNull() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_byteArrayEmpty() {
        NumberUtils.max(new byte[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMax_doubleArray() {
        assertEquals(1.1d, NumberUtils.max(new double[]{1.1d}), DOUBLE_DELTA);
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 2.2d, 3.3d}), DOUBLE_DELTA);
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), DOUBLE_DELTA);
        assertEquals(3.3d, NumberUtils.max(new double[]{3.3d, 2.2d, 1.1d}), DOUBLE_DELTA);
        assertEquals(2.2d, NumberUtils.max(new double[]{-1.1d, -5.5d, 2.2d}), DOUBLE_DELTA);
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.1d, Double.NaN, 2.2d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArrayNull() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_doubleArrayEmpty() {
        NumberUtils.max(new double[0]);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMax_floatArray() {
        assertEquals(1.1f, NumberUtils.max(new float[]{1.1f}), FLOAT_DELTA);
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 2.2f, 3.3f}), FLOAT_DELTA);
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), FLOAT_DELTA);
        assertEquals(3.3f, NumberUtils.max(new float[]{3.3f, 2.2f, 1.1f}), FLOAT_DELTA);
        assertEquals(2.2f, NumberUtils.max(new float[]{-1.1f, -5.5f, 2.2f}), FLOAT_DELTA);
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.1f, Float.NaN, 2.2f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArrayNull() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_floatArrayEmpty() {
        NumberUtils.max(new float[0]);
    }

    //-----------------------------------------------------------------------
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
        assertEquals(1.1d, NumberUtils.min(1.1d, 2.2d, 3.3d), DOUBLE_DELTA);
        assertEquals(1.1d, NumberUtils.min(2.2d, 1.1d, 3.3d), DOUBLE_DELTA);
        assertEquals(1.1d, NumberUtils.min(3.3d, 2.2d, 1.1d), DOUBLE_DELTA);
        assertTrue(Double.isNaN(NumberUtils.min(Double.NaN, 2.2d, 1.1d)));
        assertTrue(Double.isNaN(NumberUtils.min(2.2d, Double.NaN, 1.1d)));
        assertTrue(Double.isNaN(NumberUtils.min(2.2d, 1.1d, Double.NaN)));
    }

    @Test
    public void testMin_3float() {
        assertEquals(1.1f, NumberUtils.min(1.1f, 2.2f, 3.3f), FLOAT_DELTA);
        assertEquals(1.1f, NumberUtils.min(2.2f, 1.1f, 3.3f), FLOAT_DELTA);
        assertEquals(1.1f, NumberUtils.min(3.3f, 2.2f, 1.1f), FLOAT_DELTA);
        assertTrue(Float.isNaN(NumberUtils.min(Float.NaN, 2.2f, 1.1f)));
        assertTrue(Float.isNaN(NumberUtils.min(2.2f, Float.NaN, 1.1f)));
        assertTrue(Float.isNaN(NumberUtils.min(2.2f, 1.1f, Float.NaN)));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMax_3long() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMax_3int() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMax_3short() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMax_3byte() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMax_3double() {
        assertEquals(3.3d, NumberUtils.max(1.1d, 2.2d, 3.3d), DOUBLE_DELTA);
        assertEquals(3.3d, NumberUtils.max(1.1d, 3.3d, 2.2d), DOUBLE_DELTA);
        assertEquals(3.3d, NumberUtils.max(3.3d, 2.2d, 1.1d), DOUBLE_DELTA);
        assertTrue(Double.isNaN(NumberUtils.max(Double.NaN, 2.2d, 1.1d)));
        assertTrue(Double.isNaN(NumberUtils.max(2.2d, Double.NaN, 1.1d)));
        assertTrue(Double.isNaN(NumberUtils.max(2.2d, 1.1d, Double.NaN)));
    }

    @Test
    public void testMax_3float() {
        assertEquals(3.3f, NumberUtils.max(1.1f, 2.2f, 3.3f), FLOAT_DELTA);
        assertEquals(3.3f, NumberUtils.max(1.1f, 3.3f, 2.2f), FLOAT_DELTA);
        assertEquals(3.3f, NumberUtils.max(3.3f, 2.2f, 1.1f), FLOAT_DELTA);
        assertTrue(Float.isNaN(NumberUtils.max(Float.NaN, 2.2f, 1.1f)));
        assertTrue(Float.isNaN(NumberUtils.max(2.2f, Float.NaN, 1.1f)));
        assertTrue(Float.isNaN(NumberUtils.max(2.2f, 1.1f, Float.NaN)));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("   "));
        assertFalse(NumberUtils.isDigits("12a3"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.3"));
        assertTrue(NumberUtils.isDigits("12345"));
        assertTrue(NumberUtils.isDigits("0"));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsNumber() {
        // null and empty
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("   "));

        // hex numbers
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0xG"));
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertTrue(NumberUtils.isNumber("0xabcdef"));
        assertTrue(NumberUtils.isNumber("0xABCDEF"));

        // Integers and signs
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertFalse(NumberUtils.isNumber("+123"));
        assertFalse(NumberUtils.isNumber("--123"));
        assertFalse(NumberUtils.isNumber("-"));

        // Decimals
        assertTrue(NumberUtils.isNumber("1.23"));
        assertTrue(NumberUtils.isNumber(".23"));
        assertTrue(NumberUtils.isNumber("123."));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber(".."));

        // Exponents
        assertTrue(NumberUtils.isNumber("1e2"));
        assertTrue(NumberUtils.isNumber("1E2"));
        assertTrue(NumberUtils.isNumber("1e+2"));
        assertTrue(NumberUtils.isNumber("1e-2"));
        assertTrue(NumberUtils.isNumber(".2e3"));
        assertTrue(NumberUtils.isNumber("1.2e3"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("e2"));
        assertFalse(NumberUtils.isNumber("1ee2"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("1.2e3.4"));
        assertFalse(NumberUtils.isNumber("1+2"));

        // Qualifiers
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("1.23f"));
        assertTrue(NumberUtils.isNumber("1.23d"));
        assertTrue(NumberUtils.isNumber("1e2f"));
        assertTrue(NumberUtils.isNumber("1e2d"));

        assertFalse(NumberUtils.isNumber("1.2L"));
        assertFalse(NumberUtils.isNumber("1e2L"));
        assertFalse(NumberUtils.isNumber("123a"));
        assertFalse(NumberUtils.isNumber("123z"));
        assertFalse(NumberUtils.isNumber("f"));
        assertFalse(NumberUtils.isNumber("d"));
        assertFalse(NumberUtils.isNumber("L"));
    }
}
