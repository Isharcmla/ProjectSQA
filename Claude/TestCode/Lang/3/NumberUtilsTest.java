import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    // ---------- toInt ----------
    @Test
    public void testToInt_validString_returnsInt() {
        Assert.assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_null_returnsZero() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_emptyString_returnsZero() {
        Assert.assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_invalidString_returnsZero() {
        Assert.assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntWithDefault_null_returnsDefault() {
        Assert.assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void testToIntWithDefault_validString_returnsParsed() {
        Assert.assertEquals(1, NumberUtils.toInt("1", 0));
    }

    // ---------- toLong ----------
    @Test
    public void testToLong_validString_returnsLong() {
        Assert.assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLong_null_returnsZero() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_emptyString_returnsZero() {
        Assert.assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLongWithDefault_null_returnsDefault() {
        Assert.assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(1L, NumberUtils.toLong("abc", 1L));
    }

    @Test
    public void testToLongWithDefault_validString_returnsParsed() {
        Assert.assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // ---------- toFloat ----------
    @Test
    public void testToFloat_validString_returnsFloat() {
        Assert.assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloat_null_returnsZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
    }

    @Test
    public void testToFloat_emptyString_returnsZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(""), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_null_returnsDefault() {
        Assert.assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_validString_returnsParsed() {
        Assert.assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0001f);
    }

    // ---------- toDouble ----------
    @Test
    public void testToDouble_validString_returnsDouble() {
        Assert.assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDouble_null_returnsZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
    }

    @Test
    public void testToDouble_emptyString_returnsZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(""), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_null_returnsDefault() {
        Assert.assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(1.1d, NumberUtils.toDouble("abc", 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_validString_returnsParsed() {
        Assert.assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0001d);
    }

    // ---------- toByte ----------
    @Test
    public void testToByte_validString_returnsByte() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_null_returnsZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_emptyString_returnsZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByteWithDefault_null_returnsDefault() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("abc", (byte) 1));
    }

    @Test
    public void testToByteWithDefault_validString_returnsParsed() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    // ---------- toShort ----------
    @Test
    public void testToShort_validString_returnsShort() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_null_returnsZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_emptyString_returnsZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShortWithDefault_null_returnsDefault() {
        Assert.assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("abc", (short) 1));
    }

    @Test
    public void testToShortWithDefault_validString_returnsParsed() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    // ---------- createNumber ----------
    @Test
    public void testCreateNumber_null_returnsNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blankString_throwsException() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_plainInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("123");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("-123");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(-123, n.intValue());
    }

    @Test
    public void testCreateNumber_longValue_returnsLong() {
        Number n = NumberUtils.createNumber("123456789012");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_bigIntegerValue_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_hexPrefix0x_returnsInteger() {
        Number n = NumberUtils.createNumber("0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_hexPrefixUpper0X_returnsInteger() {
        Number n = NumberUtils.createNumber("0X1A");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_negativeHexPrefix_returnsInteger() {
        Number n = NumberUtils.createNumber("-0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_hexHashPrefix_returnsInteger() {
        Number n = NumberUtils.createNumber("#1A");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_negativeHexHashPrefix_returnsInteger() {
        Number n = NumberUtils.createNumber("-#1A");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_hexTooManyDigitsForInt_returnsLong() {
        Number n = NumberUtils.createNumber("0x123456789");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_hexTooManyDigitsForLong_returnsBigInteger() {
        Number n = NumberUtils.createNumber("0x12345678901234567");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_floatSuffix_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5f");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_floatSuffixUpper_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5F");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_doubleSuffix_returnsDouble() {
        Number n = NumberUtils.createNumber("1.5d");
        Assert.assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_doubleSuffixUpper_returnsDouble() {
        Number n = NumberUtils.createNumber("1.5D");
        Assert.assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_longSuffix_returnsLong() {
        Number n = NumberUtils.createNumber("123L");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_longSuffixUpper_returnsLong() {
        Number n = NumberUtils.createNumber("123l");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_negativeLongSuffix_returnsLong() {
        Number n = NumberUtils.createNumber("-123L");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_longSuffixTooBig_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongSuffix_throwsException() {
        NumberUtils.createNumber("1.5L");
    }

    @Test
    public void testCreateNumber_decimalNoSuffix_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_decimalPrecise_returnsDouble() {
        Number n = NumberUtils.createNumber("1.23456789012345");
        Assert.assertTrue(n != null);
    }

    @Test
    public void testCreateNumber_scientificNotation_returnsNumber() {
        Number n = NumberUtils.createNumber("1.5e10");
        Assert.assertNotNull(n);
    }

    @Test
    public void testCreateNumber_scientificNotationUpper_returnsNumber() {
        Number n = NumberUtils.createNumber("1.5E10");
        Assert.assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidString_throwsException() {
        NumberUtils.createNumber("abc");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_doubleExponentBeforeDecimal_throwsException() {
        NumberUtils.createNumber("1e10.5");
    }

    @Test
    public void testCreateNumber_bigDecimalValue_returnsBigDecimal() {
        Number n = NumberUtils.createNumber("1.234567890123456789012345678901234567890");
        Assert.assertTrue(n != null);
    }

    @Test
    public void testCreateNumber_zeroWithSuffix_returnsFloatZero() {
        Number n = NumberUtils.createNumber("0.0f");
        Assert.assertTrue(n instanceof Float);
        Assert.assertEquals(0.0f, n.floatValue(), 0.0001f);
    }

    @Test
    public void testCreateNumber_octalNotation_returnsInteger() {
        Number n = NumberUtils.createNumber("010");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(8, n.intValue());
    }

    // ---------- createFloat ----------
    @Test
    public void testCreateFloat_validString_returnsFloat() {
        Assert.assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test
    public void testCreateFloat_null_returnsNull() {
        Assert.assertNull(NumberUtils.createFloat(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalidString_throwsException() {
        NumberUtils.createFloat("abc");
    }

    // ---------- createDouble ----------
    @Test
    public void testCreateDouble_validString_returnsDouble() {
        Assert.assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateDouble_null_returnsNull() {
        Assert.assertNull(NumberUtils.createDouble(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalidString_throwsException() {
        NumberUtils.createDouble("abc");
    }

    // ---------- createInteger ----------
    @Test
    public void testCreateInteger_validString_returnsInteger() {
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateInteger_null_returnsNull() {
        Assert.assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_hexString_returnsInteger() {
        Assert.assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalidString_throwsException() {
        NumberUtils.createInteger("abc");
    }

    // ---------- createLong ----------
    @Test
    public void testCreateLong_validString_returnsLong() {
        Assert.assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test
    public void testCreateLong_null_returnsNull() {
        Assert.assertNull(NumberUtils.createLong(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalidString_throwsException() {
        NumberUtils.createLong("abc");
    }

    // ---------- createBigInteger ----------
    @Test
    public void testCreateBigInteger_validString_returnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(123), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigInteger_null_returnsNull() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_negativeString_returnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(-123), NumberUtils.createBigInteger("-123"));
    }

    @Test
    public void testCreateBigInteger_hexString_returnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(26), NumberUtils.createBigInteger("0x1A"));
    }

    @Test
    public void testCreateBigInteger_hashHexString_returnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(26), NumberUtils.createBigInteger("#1A"));
    }

    @Test
    public void testCreateBigInteger_octalString_returnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(8), NumberUtils.createBigInteger("010"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalidString_throwsException() {
        NumberUtils.createBigInteger("abc");
    }

    // ---------- createBigDecimal ----------
    @Test
    public void testCreateBigDecimal_validString_returnsBigDecimal() {
        Assert.assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    @Test
    public void testCreateBigDecimal_null_returnsNull() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blankString_throwsException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_doubleMinus_throwsException() {
        NumberUtils.createBigDecimal("--123");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalidString_throwsException() {
        NumberUtils.createBigDecimal("abc");
    }

    // ---------- min/max array: long ----------
    @Test
    public void testMinLongArray_typicalValues_returnsMin() {
        Assert.assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_null_throwsException() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_empty_throwsException() {
        NumberUtils.min(new long[]{});
    }

    @Test
    public void testMaxLongArray_typicalValues_returnsMax() {
        Assert.assertEquals(3L, NumberUtils.max(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_null_throwsException() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_empty_throwsException() {
        NumberUtils.max(new long[]{});
    }

    // ---------- min/max array: int ----------
    @Test
    public void testMinIntArray_typicalValues_returnsMin() {
        Assert.assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_null_throwsException() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_empty_throwsException() {
        NumberUtils.min(new int[]{});
    }

    @Test
    public void testMaxIntArray_typicalValues_returnsMax() {
        Assert.assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_null_throwsException() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_empty_throwsException() {
        NumberUtils.max(new int[]{});
    }

    // ---------- min/max array: short ----------
    @Test
    public void testMinShortArray_typicalValues_returnsMin() {
        Assert.assertEquals((short) 1, NumberUtils.min(new short[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_null_throwsException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_empty_throwsException() {
        NumberUtils.min(new short[]{});
    }

    @Test
    public void testMaxShortArray_typicalValues_returnsMax() {
        Assert.assertEquals((short) 3, NumberUtils.max(new short[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_null_throwsException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_empty_throwsException() {
        NumberUtils.max(new short[]{});
    }

    // ---------- min/max array: byte ----------
    @Test
    public void testMinByteArray_typicalValues_returnsMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_null_throwsException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_empty_throwsException() {
        NumberUtils.min(new byte[]{});
    }

    @Test
    public void testMaxByteArray_typicalValues_returnsMax() {
        Assert.assertEquals((byte) 3, NumberUtils.max(new byte[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_null_throwsException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_empty_throwsException() {
        NumberUtils.max(new byte[]{});
    }

    // ---------- min/max array: double ----------
    @Test
    public void testMinDoubleArray_typicalValues_returnsMin() {
        Assert.assertEquals(1.0d, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0001d);
    }

    @Test
    public void testMinDoubleArray_withNaN_returnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[]{3.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_null_throwsException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_empty_throwsException() {
        NumberUtils.min(new double[]{});
    }

    @Test
    public void testMaxDoubleArray_typicalValues_returnsMax() {
        Assert.assertEquals(3.0d, NumberUtils.max(new double[]{3.0, 1.0, 2.0}), 0.0001d);
    }

    @Test
    public void testMaxDoubleArray_withNaN_returnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[]{3.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_null_throwsException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_empty_throwsException() {
        NumberUtils.max(new double[]{});
    }

    // ---------- min/max array: float ----------
    @Test
    public void testMinFloatArray_typicalValues_returnsMin() {
        Assert.assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMinFloatArray_withNaN_returnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[]{3.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_null_throwsException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_empty_throwsException() {
        NumberUtils.min(new float[]{});
    }

    @Test
    public void testMaxFloatArray_typicalValues_returnsMax() {
        Assert.assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMaxFloatArray_withNaN_returnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[]{3.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_null_throwsException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_empty_throwsException() {
        NumberUtils.max(new float[]{});
    }

    // ---------- 3-param min ----------
    @Test
    public void testMinLong3Param_variousOrder_returnsMin() {
        Assert.assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        Assert.assertEquals(1L, NumberUtils.min(1L, 3L, 2L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMinInt3Param_variousOrder_returnsMin() {
        Assert.assertEquals(1, NumberUtils.min(3, 1, 2));
        Assert.assertEquals(1, NumberUtils.min(1, 3, 2));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMinShort3Param_variousOrder_returnsMin() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 1, (short) 3, (short) 2));
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMinByte3Param_variousOrder_returnsMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 3, (byte) 2));
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMinDouble3Param_typicalValues_returnsMin() {
        Assert.assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0001d);
    }

    @Test
    public void testMinFloat3Param_typicalValues_returnsMin() {
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    // ---------- 3-param max ----------
    @Test
    public void testMaxLong3Param_variousOrder_returnsMax() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
    }

    @Test
    public void testMaxInt3Param_variousOrder_returnsMax() {
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
        Assert.assertEquals(3, NumberUtils.max(3, 1, 2));
        Assert.assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    @Test
    public void testMaxShort3Param_variousOrder_returnsMax() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMaxByte3Param_variousOrder_returnsMax() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
    }

    @Test
    public void testMaxDouble3Param_typicalValues_returnsMax() {
        Assert.assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
    }

    @Test
    public void testMaxFloat3Param_typicalValues_returnsMax() {
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
    }

    // ---------- isDigits ----------
    @Test
    public void testIsDigits_allDigits_returnsTrue() {
        Assert.assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_null_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_emptyString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_nonDigitCharacter_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("12a45"));
    }

    @Test
    public void testIsDigits_decimalPoint_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("1.5"));
    }

    // ---------- isNumber ----------
    @Test
    public void testIsNumber_plainInteger_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("12345"));
    }

    @Test
    public void testIsNumber_null_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_emptyString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_negativeInteger_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("-12345"));
    }

    @Test
    public void testIsNumber_decimalNumber_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5"));
    }

    @Test
    public void testIsNumber_hexNumber_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_hexOnlyPrefix_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_invalidHex_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0xZZ"));
    }

    @Test
    public void testIsNumber_scientificNotation_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5e10"));
    }

    @Test
    public void testIsNumber_scientificNotationUpper_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5E10"));
    }

    @Test
    public void testIsNumber_doubleDecimalPoints_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1.5.5"));
    }

    @Test
    public void testIsNumber_doubleExponent_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1e5e5"));
    }

    @Test
    public void testIsNumber_exponentWithoutDigit_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1e"));
    }

    @Test
    public void testIsNumber_signWithoutAllow_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1+5"));
    }

    @Test
    public void testIsNumber_exponentWithSign_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5e-10"));
    }

    @Test
    public void testIsNumber_trailingLetterD_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5d"));
    }

    @Test
    public void testIsNumber_trailingLetterF_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5f"));
    }

    @Test
    public void testIsNumber_trailingLetterL_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_trailingLetterLWithExponent_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1.5e10L"));
    }

    @Test
    public void testIsNumber_illegalLastCharacter_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123x"));
    }

    @Test
    public void testIsNumber_trailingDecimalPoint_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_onlyDecimalPoint_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_endsWithE_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1E"));
    }

    @Test
    public void testIsNumber_endsWithExponentSign_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1E-"));
    }

    // ---------- constants ----------
    @Test
    public void testConstants_haveCorrectValues() {
        Assert.assertEquals(0L, NumberUtils.LONG_ZERO.longValue());
        Assert.assertEquals(1L, NumberUtils.LONG_ONE.longValue());
        Assert.assertEquals(-1L, NumberUtils.LONG_MINUS_ONE.longValue());
        Assert.assertEquals(0, NumberUtils.INTEGER_ZERO.intValue());
        Assert.assertEquals(1, NumberUtils.INTEGER_ONE.intValue());
        Assert.assertEquals(-1, NumberUtils.INTEGER_MINUS_ONE.intValue());
        Assert.assertEquals((short) 0, NumberUtils.SHORT_ZERO.shortValue());
        Assert.assertEquals((short) 1, NumberUtils.SHORT_ONE.shortValue());
        Assert.assertEquals((short) -1, NumberUtils.SHORT_MINUS_ONE.shortValue());
        Assert.assertEquals((byte) 0, NumberUtils.BYTE_ZERO.byteValue());
        Assert.assertEquals((byte) 1, NumberUtils.BYTE_ONE.byteValue());
        Assert.assertEquals((byte) -1, NumberUtils.BYTE_MINUS_ONE.byteValue());
        Assert.assertEquals(0.0d, NumberUtils.DOUBLE_ZERO.doubleValue(), 0.0001d);
        Assert.assertEquals(1.0d, NumberUtils.DOUBLE_ONE.doubleValue(), 0.0001d);
        Assert.assertEquals(-1.0d, NumberUtils.DOUBLE_MINUS_ONE.doubleValue(), 0.0001d);
        Assert.assertEquals(0.0f, NumberUtils.FLOAT_ZERO.floatValue(), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.FLOAT_ONE.floatValue(), 0.0001f);
        Assert.assertEquals(-1.0f, NumberUtils.FLOAT_MINUS_ONE.floatValue(), 0.0001f);
    }

    // ---------- constructor ----------
    @Test
    public void testConstructor_instantiation_success() {
        NumberUtils nu = new NumberUtils();
        Assert.assertNotNull(nu);
    }
}
