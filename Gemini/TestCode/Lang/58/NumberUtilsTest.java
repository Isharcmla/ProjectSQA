package org.apache.commons.lang.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
    @SuppressWarnings("deprecation")
    public void testStringToInt_default() {
        assertEquals(0, NumberUtils.stringToInt(null));
        assertEquals(0, NumberUtils.stringToInt(""));
        assertEquals(0, NumberUtils.stringToInt("invalid"));
        assertEquals(123, NumberUtils.stringToInt("123"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testStringToInt_withDefault() {
        assertEquals(5, NumberUtils.stringToInt(null, 5));
        assertEquals(5, NumberUtils.stringToInt("", 5));
        assertEquals(5, NumberUtils.stringToInt("abc", 5));
        assertEquals(123, NumberUtils.stringToInt("123", 5));
    }

    @Test
    public void testToInt_default() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(0, NumberUtils.toInt(""));
        assertEquals(0, NumberUtils.toInt("abc"));
        assertEquals(42, NumberUtils.toInt("42"));
        assertEquals(-42, NumberUtils.toInt("-42"));
    }

    @Test
    public void testToInt_withDefault() {
        assertEquals(10, NumberUtils.toInt(null, 10));
        assertEquals(10, NumberUtils.toInt("", 10));
        assertEquals(10, NumberUtils.toInt("invalid", 10));
        assertEquals(42, NumberUtils.toInt("42", 10));
    }

    @Test
    public void testToLong_default() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(0L, NumberUtils.toLong(""));
        assertEquals(0L, NumberUtils.toLong("invalid"));
        assertEquals(123456789012L, NumberUtils.toLong("123456789012"));
    }

    @Test
    public void testToLong_withDefault() {
        assertEquals(99L, NumberUtils.toLong(null, 99L));
        assertEquals(99L, NumberUtils.toLong("", 99L));
        assertEquals(99L, NumberUtils.toLong("invalid", 99L));
        assertEquals(123456789012L, NumberUtils.toLong("123456789012", 99L));
    }

    @Test
    public void testToFloat_default() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
        assertEquals(0.0f, NumberUtils.toFloat("invalid"), 0.0001f);
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloat_withDefault() {
        assertEquals(2.5f, NumberUtils.toFloat(null, 2.5f), 0.0001f);
        assertEquals(2.5f, NumberUtils.toFloat("", 2.5f), 0.0001f);
        assertEquals(2.5f, NumberUtils.toFloat("invalid", 2.5f), 0.0001f);
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 2.5f), 0.0001f);
    }

    @Test
    public void testToDouble_default() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
        assertEquals(0.0d, NumberUtils.toDouble("invalid"), 0.0001d);
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDouble_withDefault() {
        assertEquals(2.5d, NumberUtils.toDouble(null, 2.5d), 0.0001d);
        assertEquals(2.5d, NumberUtils.toDouble("", 2.5d), 0.0001d);
        assertEquals(2.5d, NumberUtils.toDouble("invalid", 2.5d), 0.0001d);
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 2.5d), 0.0001d);
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
        assertEquals(Integer.valueOf(16), NumberUtils.createInteger("0x10"));
        assertEquals(Integer.valueOf(-16), NumberUtils.createInteger("-0x10"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("invalid");
    }

    @Test
    public void testCreateLong() {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("invalid");
    }

    @Test
    public void testCreateBigInteger() {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
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
    public void testCreateBigDecimal_empty() {
        NumberUtils.createBigDecimal("");
    }

    @Test
    public void testCreateNumber() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--1.5"));

        // Hexadecimal
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xFF"));

        // Long specifiers 'l' and 'L'
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123l"));
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
        assertEquals(Long.valueOf(-123L), NumberUtils.createNumber("-123L"));
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createNumber("123456789012345678901234567890L"));

        // Float specifiers 'f' and 'F'
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));

        // Double specifiers 'd' and 'D'
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));

        // Fall through from Float/Double with loss of precision
        assertEquals(new BigDecimal("1e-50"), NumberUtils.createNumber("1e-50f"));
        assertEquals(new BigDecimal("1e-400"), NumberUtils.createNumber("1e-400d"));

        // Integer, Long, BigInteger automatically selected
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));

        // Decimals & Exponents automatically selected
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Float.valueOf(1.23e4f), NumberUtils.createNumber("1.23e4"));
        assertEquals(Float.valueOf(1e4f), NumberUtils.createNumber("1e4"));
        assertEquals(Double.valueOf(1e20d), NumberUtils.createNumber("1e20"));
        assertEquals(new BigDecimal("1.23e-400"), NumberUtils.createNumber("1.23e-400"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blank() {
        NumberUtils.createNumber("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_empty() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expPosBeforeDecPos() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierWithDec() {
        NumberUtils.createNumber("1.2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierWithExp() {
        NumberUtils.createNumber("1e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongQualifierNotDigits() {
        NumberUtils.createNumber("1a2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidTypeQualifier() {
        NumberUtils.createNumber("123a");
    }

    @Test
    public void testEquals_byteArray() {
        byte[] b1 = new byte[]{1, 2, 3};
        byte[] b2 = new byte[]{1, 2, 3};
        byte[] b3 = new byte[]{1, 2, 4};
        byte[] b4 = new byte[]{1, 2};

        assertTrue(NumberUtils.equals(b1, b1));
        assertTrue(NumberUtils.equals((byte[]) null, (byte[]) null));
        assertFalse(NumberUtils.equals(b1, null));
        assertFalse(NumberUtils.equals(null, b1));
        assertTrue(NumberUtils.equals(b1, b2));
        assertFalse(NumberUtils.equals(b1, b3));
        assertFalse(NumberUtils.equals(b1, b4));
    }

    @Test
    public void testEquals_shortArray() {
        short[] s1 = new short[]{1, 2, 3};
        short[] s2 = new short[]{1, 2, 3};
        short[] s3 = new short[]{1, 2, 4};
        short[] s4 = new short[]{1, 2};

        assertTrue(NumberUtils.equals(s1, s1));
        assertTrue(NumberUtils.equals((short[]) null, (short[]) null));
        assertFalse(NumberUtils.equals(s1, null));
        assertFalse(NumberUtils.equals(null, s1));
        assertTrue(NumberUtils.equals(s1, s2));
        assertFalse(NumberUtils.equals(s1, s3));
        assertFalse(NumberUtils.equals(s1, s4));
    }

    @Test
    public void testEquals_intArray() {
        int[] i1 = new int[]{1, 2, 3};
        int[] i2 = new int[]{1, 2, 3};
        int[] i3 = new int[]{1, 2, 4};
        int[] i4 = new int[]{1, 2};

        assertTrue(NumberUtils.equals(i1, i1));
        assertTrue(NumberUtils.equals((int[]) null, (int[]) null));
        assertFalse(NumberUtils.equals(i1, null));
        assertFalse(NumberUtils.equals(null, i1));
        assertTrue(NumberUtils.equals(i1, i2));
        assertFalse(NumberUtils.equals(i1, i3));
        assertFalse(NumberUtils.equals(i1, i4));
    }

    @Test
    public void testEquals_longArray() {
        long[] l1 = new long[]{1L, 2L, 3L};
        long[] l2 = new long[]{1L, 2L, 3L};
        long[] l3 = new long[]{1L, 2L, 4L};
        long[] l4 = new long[]{1L, 2L};

        assertTrue(NumberUtils.equals(l1, l1));
        assertTrue(NumberUtils.equals((long[]) null, (long[]) null));
        assertFalse(NumberUtils.equals(l1, null));
        assertFalse(NumberUtils.equals(null, l1));
        assertTrue(NumberUtils.equals(l1, l2));
        assertFalse(NumberUtils.equals(l1, l3));
        assertFalse(NumberUtils.equals(l1, l4));
    }

    @Test
    public void testEquals_floatArray() {
        float[] f1 = new float[]{1.0f, Float.NaN, 3.0f};
        float[] f2 = new float[]{1.0f, Float.NaN, 3.0f};
        float[] f3 = new float[]{1.0f, 2.0f, 3.0f};
        float[] f4 = new float[]{1.0f, Float.NaN};

        assertTrue(NumberUtils.equals(f1, f1));
        assertTrue(NumberUtils.equals((float[]) null, (float[]) null));
        assertFalse(NumberUtils.equals(f1, null));
        assertFalse(NumberUtils.equals(null, f1));
        assertTrue(NumberUtils.equals(f1, f2));
        assertFalse(NumberUtils.equals(f1, f3));
        assertFalse(NumberUtils.equals(f1, f4));
    }

    @Test
    public void testEquals_doubleArray() {
        double[] d1 = new double[]{1.0d, Double.NaN, 3.0d};
        double[] d2 = new double[]{1.0d, Double.NaN, 3.0d};
        double[] d3 = new double[]{1.0d, 2.0d, 3.0d};
        double[] d4 = new double[]{1.0d, Double.NaN};

        assertTrue(NumberUtils.equals(d1, d1));
        assertTrue(NumberUtils.equals((double[]) null, (double[]) null));
        assertFalse(NumberUtils.equals(d1, null));
        assertFalse(NumberUtils.equals(null, d1));
        assertTrue(NumberUtils.equals(d1, d2));
        assertFalse(NumberUtils.equals(d1, d3));
        assertFalse(NumberUtils.equals(d1, d4));
    }

    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, 0L}));
        assertEquals(42L, NumberUtils.min(new long[]{42L}));
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
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, 0}));
        assertEquals(42, NumberUtils.min(new int[]{42}));
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
        assertEquals((short) -5, NumberUtils.min(new short[]{-1, -5, 0}));
        assertEquals((short) 42, NumberUtils.min(new short[]{42}));
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
        assertEquals((byte) -5, NumberUtils.min(new byte[]{-1, -5, 0}));
        assertEquals((byte) 42, NumberUtils.min(new byte[]{42}));
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
        assertEquals(-5.5d, NumberUtils.min(new double[]{-1.1d, -5.5d, 0.0d}), 0.0001d);
        assertEquals(42.0d, NumberUtils.min(new double[]{42.0d}), 0.0001d);
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
        assertEquals(-5.5f, NumberUtils.min(new float[]{-1.1f, -5.5f, 0.0f}), 0.0001f);
        assertEquals(42.0f, NumberUtils.min(new float[]{42.0f}), 0.0001f);
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
        assertEquals(0L, NumberUtils.max(new long[]{-1L, -5L, 0L}));
        assertEquals(42L, NumberUtils.max(new long[]{42L}));
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
        assertEquals(0, NumberUtils.max(new int[]{-1, -5, 0}));
        assertEquals(42, NumberUtils.max(new int[]{42}));
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
        assertEquals((short) 0, NumberUtils.max(new short[]{-1, -5, 0}));
        assertEquals((short) 42, NumberUtils.max(new short[]{42}));
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
        assertEquals((byte) 0, NumberUtils.max(new byte[]{-1, -5, 0}));
        assertEquals((byte) 42, NumberUtils.max(new byte[]{42}));
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
        assertEquals(0.0d, NumberUtils.max(new double[]{-1.1d, -5.5d, 0.0d}), 0.0001d);
        assertEquals(42.0d, NumberUtils.max(new double[]{42.0d}), 0.0001d);
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
        assertEquals(0.0f, NumberUtils.max(new float[]{-1.1f, -5.5f, 0.0f}), 0.0001f);
        assertEquals(42.0f, NumberUtils.max(new float[]{42.0f}), 0.0001f);
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
    public void testMin_3params() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.min(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));

        assertEquals(1, NumberUtils.min(1, 2, 3));
        assertEquals(1, NumberUtils.min(2, 1, 3));
        assertEquals(1, NumberUtils.min(3, 2, 1));

        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 2, (short) 1, (short) 3));
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));

        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 2, (byte) 1, (byte) 3));
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));

        assertEquals(1.0d, NumberUtils.min(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(2.0d, 1.0d, 3.0d), 0.0001d);
        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.min(1.0d, Double.NaN, 3.0d)));

        assertEquals(1.0f, NumberUtils.min(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(2.0f, 1.0f, 3.0f), 0.0001f);
        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.min(1.0f, Float.NaN, 3.0f)));
    }

    @Test
    public void testMax_3params() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));

        assertEquals(3, NumberUtils.max(1, 2, 3));
        assertEquals(3, NumberUtils.max(1, 3, 2));
        assertEquals(3, NumberUtils.max(3, 2, 1));

        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));

        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));

        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
        assertEquals(3.0d, NumberUtils.max(3.0d, 2.0d, 1.0d), 0.0001d);
        assertTrue(Double.isNaN(NumberUtils.max(1.0d, Double.NaN, 3.0d)));

        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
        assertEquals(3.0f, NumberUtils.max(3.0f, 2.0f, 1.0f), 0.0001f);
        assertTrue(Float.isNaN(NumberUtils.max(1.0f, Float.NaN, 3.0f)));
    }

    @Test
    public void testCompareDouble() {
        assertEquals(-1, NumberUtils.compare(1.0d, 2.0d));
        assertEquals(1, NumberUtils.compare(2.0d, 1.0d));
        assertEquals(0, NumberUtils.compare(1.0d, 1.0d));
        assertEquals(-1, NumberUtils.compare(-0.0d, 0.0d));
        assertEquals(1, NumberUtils.compare(0.0d, -0.0d));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
        assertEquals(1, NumberUtils.compare(Double.NaN, 1.0d));
        assertEquals(-1, NumberUtils.compare(1.0d, Double.NaN));
    }

    @Test
    public void testCompareFloat() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
        assertEquals(-1, NumberUtils.compare(-0.0f, 0.0f));
        assertEquals(1, NumberUtils.compare(0.0f, -0.0f));
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
        assertEquals(1, NumberUtils.compare(Float.NaN, 1.0f));
        assertEquals(-1, NumberUtils.compare(1.0f, Float.NaN));
    }

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("12a34"));
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("12.34"));
        assertTrue(NumberUtils.isDigits("0"));
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(" "));
        assertFalse(NumberUtils.isNumber("abc"));
        assertFalse(NumberUtils.isNumber("--1"));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("1.2.3"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("e1"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0xGHI"));
        assertFalse(NumberUtils.isNumber("123a"));
        assertFalse(NumberUtils.isNumber("123e4L"));

        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("0"));
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertTrue(NumberUtils.isNumber(".45"));
        assertTrue(NumberUtils.isNumber("-.45"));
        assertTrue(NumberUtils.isNumber("123."));
        assertTrue(NumberUtils.isNumber("0x12aF"));
        assertTrue(NumberUtils.isNumber("-0x12aF"));
        assertTrue(NumberUtils.isNumber("1e3"));
        assertTrue(NumberUtils.isNumber("1E3"));
        assertTrue(NumberUtils.isNumber("1.2e+3"));
        assertTrue(NumberUtils.isNumber("1.2e-3"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("1.2e3f"));
        assertTrue(NumberUtils.isNumber("1.2e3d"));
    }
}
