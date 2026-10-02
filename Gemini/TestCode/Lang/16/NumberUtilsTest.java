package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

/**
 * Test suite for NumberUtils providing comprehensive branch and line coverage.
 */
public class NumberUtilsTest {

    private static final double DELTA_DOUBLE = 0.0001d;
    private static final float DELTA_FLOAT = 0.0001f;

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

    // -----------------------------------------------------------------------
    // toInt
    // -----------------------------------------------------------------------
    @Test
    public void testToInt_string() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(0, NumberUtils.toInt("invalid"));
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(-123, NumberUtils.toInt("-123"));
    }

    @Test
    public void testToInt_string_default() {
        assertEquals(5, NumberUtils.toInt(null, 5));
        assertEquals(5, NumberUtils.toInt("", 5));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    // -----------------------------------------------------------------------
    // toLong
    // -----------------------------------------------------------------------
    @Test
    public void testToLong_string() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("invalid"));
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
        assertEquals(-1234567890123L, NumberUtils.toLong("-1234567890123"));
    }

    @Test
    public void testToLong_string_default() {
        assertEquals(5L, NumberUtils.toLong(null, 5L));
        assertEquals(5L, NumberUtils.toLong("", 5L));
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
        assertEquals(123L, NumberUtils.toLong("123", 5L));
    }

    // -----------------------------------------------------------------------
    // toFloat
    // -----------------------------------------------------------------------
    @Test
    public void testToFloat_string() {
        assertEquals(0.0f, NumberUtils.toFloat(null), DELTA_FLOAT);
        assertEquals(0.0f, NumberUtils.toFloat(""), DELTA_FLOAT);
        assertEquals(0.0f, NumberUtils.toFloat("invalid"), DELTA_FLOAT);
        assertEquals(12.34f, NumberUtils.toFloat("12.34"), DELTA_FLOAT);
        assertEquals(-12.34f, NumberUtils.toFloat("-12.34"), DELTA_FLOAT);
    }

    @Test
    public void testToFloat_string_default() {
        assertEquals(5.5f, NumberUtils.toFloat(null, 5.5f), DELTA_FLOAT);
        assertEquals(5.5f, NumberUtils.toFloat("", 5.5f), DELTA_FLOAT);
        assertEquals(5.5f, NumberUtils.toFloat("abc", 5.5f), DELTA_FLOAT);
        assertEquals(12.34f, NumberUtils.toFloat("12.34", 5.5f), DELTA_FLOAT);
    }

    // -----------------------------------------------------------------------
    // toDouble
    // -----------------------------------------------------------------------
    @Test
    public void testToDouble_string() {
        assertEquals(0.0d, NumberUtils.toDouble(null), DELTA_DOUBLE);
        assertEquals(0.0d, NumberUtils.toDouble(""), DELTA_DOUBLE);
        assertEquals(0.0d, NumberUtils.toDouble("invalid"), DELTA_DOUBLE);
        assertEquals(12.34567d, NumberUtils.toDouble("12.34567"), DELTA_DOUBLE);
        assertEquals(-12.34567d, NumberUtils.toDouble("-12.34567"), DELTA_DOUBLE);
    }

    @Test
    public void testToDouble_string_default() {
        assertEquals(5.5d, NumberUtils.toDouble(null, 5.5d), DELTA_DOUBLE);
        assertEquals(5.5d, NumberUtils.toDouble("", 5.5d), DELTA_DOUBLE);
        assertEquals(5.5d, NumberUtils.toDouble("abc", 5.5d), DELTA_DOUBLE);
        assertEquals(12.34567d, NumberUtils.toDouble("12.34567", 5.5d), DELTA_DOUBLE);
    }

    // -----------------------------------------------------------------------
    // toByte
    // -----------------------------------------------------------------------
    @Test
    public void testToByte_string() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
        assertEquals((byte) 0, NumberUtils.toByte(""));
        assertEquals((byte) 0, NumberUtils.toByte("invalid"));
        assertEquals((byte) 123, NumberUtils.toByte("123"));
        assertEquals((byte) -123, NumberUtils.toByte("-123"));
    }

    @Test
    public void testToByte_string_default() {
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("", (byte) 5));
        assertEquals((byte) 5, NumberUtils.toByte("abc", (byte) 5));
        assertEquals((byte) 123, NumberUtils.toByte("123", (byte) 5));
    }

    // -----------------------------------------------------------------------
    // toShort
    // -----------------------------------------------------------------------
    @Test
    public void testToShort_string() {
        assertEquals((short) 0, NumberUtils.toShort(null));
        assertEquals((short) 0, NumberUtils.toShort(""));
        assertEquals((short) 0, NumberUtils.toShort("invalid"));
        assertEquals((short) 12345, NumberUtils.toShort("12345"));
        assertEquals((short) -12345, NumberUtils.toShort("-12345"));
    }

    @Test
    public void testToShort_string_default() {
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
        assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
        assertEquals((short) 12345, NumberUtils.toShort("12345", (short) 5));
    }

    // -----------------------------------------------------------------------
    // createNumber
    // -----------------------------------------------------------------------
    @Test
    public void testCreateNumber_nullAndBlank() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_spaces() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_hex() {
        assertEquals(Integer.valueOf(0x12), NumberUtils.createNumber("0x12"));
        assertEquals(Integer.valueOf(0x12), NumberUtils.createNumber("0X12"));
        assertEquals(Integer.valueOf(-0x12), NumberUtils.createNumber("-0x12"));
        assertEquals(Integer.valueOf(-0x12), NumberUtils.createNumber("-0X12"));
    }

    @Test
    public void testCreateNumber_integersAndLongs() {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testCreateNumber_longQualifier() {
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808L"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_longQualifierInvalid_dec() {
        NumberUtils.createNumber("123.4L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_longQualifierInvalid_exp() {
        NumberUtils.createNumber("123e4L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_longQualifierInvalid_chars() {
        NumberUtils.createNumber("abcL");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_longQualifierInvalid_dashOnly() {
        NumberUtils.createNumber("-L");
    }

    @Test
    public void testCreateNumber_floatQualifier() {
        assertEquals(Float.valueOf(123.45f), NumberUtils.createNumber("123.45f"));
        assertEquals(Float.valueOf(123.45f), NumberUtils.createNumber("123.45F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("00.00f"));
        // Float precision overflow fallbacks to Double
        Number valDouble = NumberUtils.createNumber("1.0000000000000000000000000000000000000001f");
        assertTrue(valDouble instanceof Double || valDouble instanceof BigDecimal);
        // Float overflow to infinity fallbacks to Double/BigDecimal
        Number bigFloat = NumberUtils.createNumber("3.4028236E39f");
        assertTrue(bigFloat instanceof Double || bigFloat instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_doubleQualifier() {
        assertEquals(Double.valueOf(123.45d), NumberUtils.createNumber("123.45d"));
        assertEquals(Double.valueOf(123.45d), NumberUtils.createNumber("123.45D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("00.00d"));
        // Double precision overflow fallbacks to BigDecimal
        Number valBD = NumberUtils.createNumber("1.000000000000000000000000000000000000000000000000000000000000000001d");
        assertTrue(valBD instanceof BigDecimal);
        // Double overflow to infinity fallbacks to BigDecimal
        Number bigDouble = NumberUtils.createNumber("1.7976931348623158E309d");
        assertTrue(bigDouble instanceof BigDecimal);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidQualifier() {
        NumberUtils.createNumber("123.45z");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidFloatFormat() {
        NumberUtils.createNumber("1.2.3f");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidDoubleFormat() {
        NumberUtils.createNumber("1.2.3d");
    }

    @Test
    public void testCreateNumber_floatingPointNoQualifier() {
        assertEquals(Float.valueOf(1.234f), NumberUtils.createNumber("1.234"));
        assertEquals(Double.valueOf(1.123456789012345d), NumberUtils.createNumber("1.123456789012345"));
        assertEquals(new BigDecimal("1.123456789012345678901234567890"), NumberUtils.createNumber("1.123456789012345678901234567890"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("00.00"));
        assertEquals(Double.valueOf(1.7976931348623157E308d), NumberUtils.createNumber("1.7976931348623157E308"));
        assertEquals(new BigDecimal("1.7976931348623159E309"), NumberUtils.createNumber("1.7976931348623159E309"));
    }

    @Test
    public void testCreateNumber_scientificNotation() {
        assertEquals(Float.valueOf(1.23e4f), NumberUtils.createNumber("1.23e4"));
        assertEquals(Float.valueOf(1.23E4f), NumberUtils.createNumber("1.23E4"));
        assertEquals(Float.valueOf(123e4f), NumberUtils.createNumber("123e4"));
        assertEquals(Float.valueOf(1.23e4f), NumberUtils.createNumber("1.23e4f"));
        assertEquals(Double.valueOf(1.23e4d), NumberUtils.createNumber("1.23e4d"));
        assertEquals(Float.valueOf(0.0e0f), NumberUtils.createNumber("0.0e0"));
        assertEquals(Float.valueOf(00.00e00f), NumberUtils.createNumber("00.00e00"));
        assertEquals(Float.valueOf(0e0f), NumberUtils.createNumber("0e0"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosLessThanDecPos() {
        NumberUtils.createNumber("123e4.5");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosOutOfRangeDec() {
        NumberUtils.createNumber("1.2e");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosOutOfRangeNoDec() {
        NumberUtils.createNumber("123e");
    }

    // -----------------------------------------------------------------------
    // Individual create methods
    // -----------------------------------------------------------------------
    @Test
    public void testCreateFloat() {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(12.34f), NumberUtils.createFloat("12.34"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void testCreateDouble() {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(12.3456d), NumberUtils.createDouble("12.3456"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void testCreateInteger() {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(1234), NumberUtils.createInteger("1234"));
        assertEquals(Integer.valueOf(0x12), NumberUtils.createInteger("0x12"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(1234567890123L), NumberUtils.createLong("1234567890123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("abc");
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void testCreateBigDecimal() {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1234567890.1234567890"), NumberUtils.createBigDecimal("1234567890.1234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() {
        NumberUtils.createBigDecimal("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_spaces() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("abc");
    }

    // -----------------------------------------------------------------------
    // Array min
    // -----------------------------------------------------------------------
    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(-5L, NumberUtils.min(new long[]{3L, -5L, 2L}));
        assertEquals(10L, NumberUtils.min(new long[]{10L}));
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
        assertEquals(-5, NumberUtils.min(new int[]{3, -5, 2}));
        assertEquals(10, NumberUtils.min(new int[]{10}));
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
        assertEquals((short) -5, NumberUtils.min(new short[]{(short) 3, (short) -5, (short) 2}));
        assertEquals((short) 10, NumberUtils.min(new short[]{(short) 10}));
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
        assertEquals((byte) -5, NumberUtils.min(new byte[]{(byte) 3, (byte) -5, (byte) 2}));
        assertEquals((byte) 10, NumberUtils.min(new byte[]{(byte) 10}));
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
        assertEquals(1.1d, NumberUtils.min(new double[]{3.3d, 1.1d, 2.2d}), DELTA_DOUBLE);
        assertEquals(-5.5d, NumberUtils.min(new double[]{3.3d, -5.5d, 2.2d}), DELTA_DOUBLE);
        assertEquals(10.0d, NumberUtils.min(new double[]{10.0d}), DELTA_DOUBLE);
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
        assertEquals(1.1f, NumberUtils.min(new float[]{3.3f, 1.1f, 2.2f}), DELTA_FLOAT);
        assertEquals(-5.5f, NumberUtils.min(new float[]{3.3f, -5.5f, 2.2f}), DELTA_FLOAT);
        assertEquals(10.0f, NumberUtils.min(new float[]{10.0f}), DELTA_FLOAT);
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

    // -----------------------------------------------------------------------
    // Array max
    // -----------------------------------------------------------------------
    @Test
    public void testMax_longArray() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals(5L, NumberUtils.max(new long[]{-3L, 5L, 2L}));
        assertEquals(10L, NumberUtils.max(new long[]{10L}));
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
        assertEquals(5, NumberUtils.max(new int[]{-3, 5, 2}));
        assertEquals(10, NumberUtils.max(new int[]{10}));
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
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) -3, (short) 5, (short) 2}));
        assertEquals((short) 10, NumberUtils.max(new short[]{(short) 10}));
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
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) -3, (byte) 5, (byte) 2}));
        assertEquals((byte) 10, NumberUtils.max(new byte[]{(byte) 10}));
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
        assertEquals(3.3d, NumberUtils.max(new double[]{1.1d, 3.3d, 2.2d}), DELTA_DOUBLE);
        assertEquals(5.5d, NumberUtils.max(new double[]{-3.3d, 5.5d, 2.2d}), DELTA_DOUBLE);
        assertEquals(10.0d, NumberUtils.max(new double[]{10.0d}), DELTA_DOUBLE);
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
        assertEquals(3.3f, NumberUtils.max(new float[]{1.1f, 3.3f, 2.2f}), DELTA_FLOAT);
        assertEquals(5.5f, NumberUtils.max(new float[]{-3.3f, 5.5f, 2.2f}), DELTA_FLOAT);
        assertEquals(10.0f, NumberUtils.max(new float[]{10.0f}), DELTA_FLOAT);
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

    // -----------------------------------------------------------------------
    // 3-param min / max
    // -----------------------------------------------------------------------
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
        assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), DELTA_DOUBLE);
        assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), DELTA_DOUBLE);
        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), DELTA_DOUBLE);
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, Double.NaN, 3.0d)));
    }

    @Test
    public void testMin_3float() {
        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), DELTA_FLOAT);
        assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), DELTA_FLOAT);
        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), DELTA_FLOAT);
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, Float.NaN, 3.0f)));
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
        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), DELTA_DOUBLE);
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), DELTA_DOUBLE);
        assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), DELTA_DOUBLE);
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, Double.NaN, 3.0d)));
    }

    @Test
    public void testMax_3float() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), DELTA_FLOAT);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), DELTA_FLOAT);
        assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), DELTA_FLOAT);
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 3.0f)));
    }

    // -----------------------------------------------------------------------
    // isDigits
    // -----------------------------------------------------------------------
    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("  "));
        assertFalse(NumberUtils.isDigits("12a34"));
        assertFalse(NumberUtils.isDigits("12.34"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertTrue(NumberUtils.isDigits("12345"));
        assertTrue(NumberUtils.isDigits("0"));
    }

    // -----------------------------------------------------------------------
    // isNumber
    // -----------------------------------------------------------------------
    @Test
    public void testIsNumber_nullOrEmpty() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("   "));
    }

    @Test
    public void testIsNumber_hex() {
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("0X1234"));
        assertTrue(NumberUtils.isNumber("0xabcdef"));
        assertTrue(NumberUtils.isNumber("0xABCDEF"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertTrue(NumberUtils.isNumber("-0X1234"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0x123g"));
        assertFalse(NumberUtils.isNumber("-0x123g"));
    }

    @Test
    public void testIsNumber_integers() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("0"));
        assertFalse(NumberUtils.isNumber("-"));
        assertFalse(NumberUtils.isNumber("+"));
        assertFalse(NumberUtils.isNumber("--123"));
    }

    @Test
    public void testIsNumber_decimals() {
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertTrue(NumberUtils.isNumber(".45"));
        assertTrue(NumberUtils.isNumber("-.45"));
        assertTrue(NumberUtils.isNumber("123."));
        assertTrue(NumberUtils.isNumber("-123."));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("12.34.56"));
        assertFalse(NumberUtils.isNumber("123..45"));
    }

    @Test
    public void testIsNumber_scientificNotation() {
        assertTrue(NumberUtils.isNumber("1e10"));
        assertTrue(NumberUtils.isNumber("1E10"));
        assertTrue(NumberUtils.isNumber("1.2e10"));
        assertTrue(NumberUtils.isNumber("1.2e+10"));
        assertTrue(NumberUtils.isNumber("1.2e-10"));
        assertTrue(NumberUtils.isNumber("-1.2e-10"));
        assertFalse(NumberUtils.isNumber("e10"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("1e1.2"));
        assertFalse(NumberUtils.isNumber("1e1e1"));
        assertFalse(NumberUtils.isNumber("1.2.e10"));
    }

    @Test
    public void testIsNumber_typeQualifiers() {
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("-123l"));
        assertFalse(NumberUtils.isNumber("123.4l"));
        assertFalse(NumberUtils.isNumber("123e4l"));
        assertFalse(NumberUtils.isNumber("l"));

        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123.45f"));
        assertTrue(NumberUtils.isNumber("123.45F"));
        assertTrue(NumberUtils.isNumber("123e4f"));
        assertFalse(NumberUtils.isNumber("f"));

        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("123.45d"));
        assertTrue(NumberUtils.isNumber("123.45D"));
        assertTrue(NumberUtils.isNumber("123e4d"));
        assertFalse(NumberUtils.isNumber("d"));

        assertFalse(NumberUtils.isNumber("123a"));
        assertFalse(NumberUtils.isNumber("123z"));
        assertFalse(NumberUtils.isNumber("123.45."));
        assertFalse(NumberUtils.isNumber("123+45"));
    }
}
