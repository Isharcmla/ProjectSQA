import org.junit.Test;
import org.junit.Assert;
import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    // ---------- toInt ----------
    @Test
    public void testToInt_validString_returnsParsedValue() {
        Assert.assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_nullString_returnsZero() {
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
    public void testToIntWithDefault_nullString_returnsDefault() {
        Assert.assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void testToIntWithDefault_validString_returnsParsed() {
        Assert.assertEquals(10, NumberUtils.toInt("10", 5));
    }

    // ---------- toLong ----------
    @Test
    public void testToLong_validString_returnsParsedValue() {
        Assert.assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLong_nullString_returnsZero() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_invalidString_returnsZero() {
        Assert.assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongWithDefault_nullString_returnsDefault() {
        Assert.assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(99L, NumberUtils.toLong("xyz", 99L));
    }

    @Test
    public void testToLongWithDefault_validString_returnsParsed() {
        Assert.assertEquals(123L, NumberUtils.toLong("123", 0L));
    }

    // ---------- toFloat ----------
    @Test
    public void testToFloat_validString_returnsParsedValue() {
        Assert.assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloat_nullString_returnsZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
    }

    @Test
    public void testToFloat_invalidString_returnsZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_nullString_returnsDefault() {
        Assert.assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(2.2f, NumberUtils.toFloat("bad", 2.2f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_validString_returnsParsed() {
        Assert.assertEquals(3.3f, NumberUtils.toFloat("3.3", 0.0f), 0.0001f);
    }

    // ---------- toDouble ----------
    @Test
    public void testToDouble_validString_returnsParsedValue() {
        Assert.assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDouble_nullString_returnsZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
    }

    @Test
    public void testToDouble_invalidString_returnsZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_nullString_returnsDefault() {
        Assert.assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(2.2d, NumberUtils.toDouble("bad", 2.2d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_validString_returnsParsed() {
        Assert.assertEquals(3.3d, NumberUtils.toDouble("3.3", 0.0d), 0.0001d);
    }

    // ---------- toByte ----------
    @Test
    public void testToByte_validString_returnsParsedValue() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_nullString_returnsZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_invalidString_returnsZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteWithDefault_nullString_returnsDefault() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals((byte) 9, NumberUtils.toByte("xx", (byte) 9));
    }

    @Test
    public void testToByteWithDefault_validString_returnsParsed() {
        Assert.assertEquals((byte) 5, NumberUtils.toByte("5", (byte) 0));
    }

    // ---------- toShort ----------
    @Test
    public void testToShort_validString_returnsParsedValue() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_nullString_returnsZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_invalidString_returnsZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortWithDefault_nullString_returnsDefault() {
        Assert.assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals((short) 9, NumberUtils.toShort("xx", (short) 9));
    }

    @Test
    public void testToShortWithDefault_validString_returnsParsed() {
        Assert.assertEquals((short) 5, NumberUtils.toShort("5", (short) 0));
    }

    // ---------- createFloat ----------
    @Test
    public void testCreateFloat_validString_returnsFloat() {
        Assert.assertEquals(Float.valueOf("1.5"), NumberUtils.createFloat("1.5"));
    }

    @Test
    public void testCreateFloat_nullString_returnsNull() {
        Assert.assertNull(NumberUtils.createFloat(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalidString_throwsException() {
        NumberUtils.createFloat("abc");
    }

    // ---------- createDouble ----------
    @Test
    public void testCreateDouble_validString_returnsDouble() {
        Assert.assertEquals(Double.valueOf("1.5"), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateDouble_nullString_returnsNull() {
        Assert.assertNull(NumberUtils.createDouble(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalidString_throwsException() {
        NumberUtils.createDouble("abc");
    }

    // ---------- createInteger ----------
    @Test
    public void testCreateInteger_validString_returnsInteger() {
        Assert.assertEquals(Integer.valueOf(10), NumberUtils.createInteger("10"));
    }

    @Test
    public void testCreateInteger_nullString_returnsNull() {
        Assert.assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_hexString_returnsInteger() {
        Assert.assertEquals(Integer.valueOf(171), NumberUtils.createInteger("0xAB"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalidString_throwsException() {
        NumberUtils.createInteger("abc");
    }

    // ---------- createLong ----------
    @Test
    public void testCreateLong_validString_returnsLong() {
        Assert.assertEquals(Long.valueOf(10L), NumberUtils.createLong("10"));
    }

    @Test
    public void testCreateLong_nullString_returnsNull() {
        Assert.assertNull(NumberUtils.createLong(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalidString_throwsException() {
        NumberUtils.createLong("abc");
    }

    // ---------- createBigInteger ----------
    @Test
    public void testCreateBigInteger_validString_returnsBigInteger() {
        Assert.assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test
    public void testCreateBigInteger_nullString_returnsNull() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
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
    public void testCreateBigDecimal_nullString_returnsNull() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blankString_throwsException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalidString_throwsException() {
        NumberUtils.createBigDecimal("abc");
    }

    // ---------- createNumber ----------
    @Test
    public void testCreateNumber_nullString_returnsNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blankString_throwsException() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_doubleDash_returnsNull() {
        Assert.assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hexString_returnsInteger() {
        Number n = NumberUtils.createNumber("0xFF");
        Assert.assertEquals(Integer.valueOf(255), n);
    }

    @Test
    public void testCreateNumber_negativeHexString_returnsInteger() {
        Number n = NumberUtils.createNumber("-0xFF");
        Assert.assertEquals(Integer.valueOf(-255), n);
    }

    @Test
    public void testCreateNumber_plainInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("123");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_bigIntegerValue_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_longValue_returnsLong() {
        Number n = NumberUtils.createNumber("123456789012345");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_floatSuffix_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5f");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_doubleSuffix_returnsDouble() {
        Number n = NumberUtils.createNumber("1.5d");
        Assert.assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_longSuffix_returnsLong() {
        Number n = NumberUtils.createNumber("123L");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_longSuffixBigValue_returnsBigInteger() {
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
    public void testCreateNumber_decimalWithExponent_returnsNumber() {
        Number n = NumberUtils.createNumber("1.5E10");
        Assert.assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expBeforeDec_throwsException() {
        NumberUtils.createNumber("1E2.5");
    }

    @Test
    public void testCreateNumber_bigDecimalValue_returnsBigDecimalOrDouble() {
        Number n = NumberUtils.createNumber("1.23456789012345678901234567890123456789");
        Assert.assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidSuffixChar_throwsException() {
        NumberUtils.createNumber("123X");
    }

    @Test
    public void testCreateNumber_hugeIntegerString_returnsBigInteger() {
        Number n = NumberUtils.createNumber("999999999999999999999999999999");
        Assert.assertTrue(n instanceof BigInteger);
    }

    // ---------- isDigits ----------
    @Test
    public void testIsDigits_allDigits_returnsTrue() {
        Assert.assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_nullString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_emptyString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_nonDigitString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("12a45"));
    }

    // ---------- isNumber ----------
    @Test
    public void testIsNumber_nullString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_emptyString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_plainInteger_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_negativeInteger_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_decimal_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_scientificNotation_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5E10"));
    }

    @Test
    public void testIsNumber_hexString_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_hexOnly_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_invalidHex_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0xGG"));
    }

    @Test
    public void testIsNumber_floatSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45f"));
    }

    @Test
    public void testIsNumber_longSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_longSuffixWithExp_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123E4L"));
    }

    @Test
    public void testIsNumber_twoDecimalPoints_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_twoExponents_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1E2E3"));
    }

    @Test
    public void testIsNumber_expWithoutDigit_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("E5"));
    }

    @Test
    public void testIsNumber_trailingE_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1E"));
    }

    @Test
    public void testIsNumber_invalidCharacter_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("12a3"));
    }

    @Test
    public void testIsNumber_signInMiddle_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_expWithSign_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.2E-3"));
    }

    @Test
    public void testIsNumber_dotOnly_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("."));
    }

    // ---------- min(long[]) ----------
    @Test
    public void testMinLongArray_normalInput_returnsMin() {
        Assert.assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_nullArray_throwsException() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_emptyArray_throwsException() {
        NumberUtils.min(new long[]{});
    }

    // ---------- min(int[]) ----------
    @Test
    public void testMinIntArray_normalInput_returnsMin() {
        Assert.assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_nullArray_throwsException() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_emptyArray_throwsException() {
        NumberUtils.min(new int[]{});
    }

    // ---------- min(short[]) ----------
    @Test
    public void testMinShortArray_normalInput_returnsMin() {
        Assert.assertEquals((short) 1, NumberUtils.min(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_nullArray_throwsException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_emptyArray_throwsException() {
        NumberUtils.min(new short[]{});
    }

    // ---------- min(byte[]) ----------
    @Test
    public void testMinByteArray_normalInput_returnsMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_nullArray_throwsException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_emptyArray_throwsException() {
        NumberUtils.min(new byte[]{});
    }

    // ---------- min(double[]) ----------
    @Test
    public void testMinDoubleArray_normalInput_returnsMin() {
        Assert.assertEquals(1.0d, NumberUtils.min(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
    }

    @Test
    public void testMinDoubleArray_containsNaN_returnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_nullArray_throwsException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_emptyArray_throwsException() {
        NumberUtils.min(new double[]{});
    }

    // ---------- min(float[]) ----------
    @Test
    public void testMinFloatArray_normalInput_returnsMin() {
        Assert.assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMinFloatArray_containsNaN_returnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_nullArray_throwsException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_emptyArray_throwsException() {
        NumberUtils.min(new float[]{});
    }

    // ---------- max(long[]) ----------
    @Test
    public void testMaxLongArray_normalInput_returnsMax() {
        Assert.assertEquals(3L, NumberUtils.max(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_nullArray_throwsException() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_emptyArray_throwsException() {
        NumberUtils.max(new long[]{});
    }

    // ---------- max(int[]) ----------
    @Test
    public void testMaxIntArray_normalInput_returnsMax() {
        Assert.assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_nullArray_throwsException() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_emptyArray_throwsException() {
        NumberUtils.max(new int[]{});
    }

    // ---------- max(short[]) ----------
    @Test
    public void testMaxShortArray_normalInput_returnsMax() {
        Assert.assertEquals((short) 3, NumberUtils.max(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_nullArray_throwsException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_emptyArray_throwsException() {
        NumberUtils.max(new short[]{});
    }

    // ---------- max(byte[]) ----------
    @Test
    public void testMaxByteArray_normalInput_returnsMax() {
        Assert.assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_nullArray_throwsException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_emptyArray_throwsException() {
        NumberUtils.max(new byte[]{});
    }

    // ---------- max(double[]) ----------
    @Test
    public void testMaxDoubleArray_normalInput_returnsMax() {
        Assert.assertEquals(3.0d, NumberUtils.max(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
    }

    @Test
    public void testMaxDoubleArray_containsNaN_returnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_nullArray_throwsException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_emptyArray_throwsException() {
        NumberUtils.max(new double[]{});
    }

    // ---------- max(float[]) ----------
    @Test
    public void testMaxFloatArray_normalInput_returnsMax() {
        Assert.assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMaxFloatArray_containsNaN_returnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_nullArray_throwsException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_emptyArray_throwsException() {
        NumberUtils.max(new float[]{});
    }

    // ---------- 3-param min ----------
    @Test
    public void testMin3Long_variousOrder_returnsSmallest() {
        Assert.assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        Assert.assertEquals(1L, NumberUtils.min(1L, 3L, 2L));
        Assert.assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin3Int_variousOrder_returnsSmallest() {
        Assert.assertEquals(1, NumberUtils.min(3, 1, 2));
        Assert.assertEquals(1, NumberUtils.min(1, 3, 2));
        Assert.assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin3Short_variousOrder_returnsSmallest() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMin3Byte_variousOrder_returnsSmallest() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMin3Double_variousOrder_returnsSmallest() {
        Assert.assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0001d);
    }

    @Test
    public void testMin3Float_variousOrder_returnsSmallest() {
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    // ---------- 3-param max ----------
    @Test
    public void testMax3Long_variousOrder_returnsLargest() {
        Assert.assertEquals(3L, NumberUtils.max(3L, 1L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
        Assert.assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
    }

    @Test
    public void testMax3Int_variousOrder_returnsLargest() {
        Assert.assertEquals(3, NumberUtils.max(3, 1, 2));
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
        Assert.assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    @Test
    public void testMax3Short_variousOrder_returnsLargest() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMax3Byte_variousOrder_returnsLargest() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMax3Double_variousOrder_returnsLargest() {
        Assert.assertEquals(3.0d, NumberUtils.max(3.0d, 1.0d, 2.0d), 0.0001d);
    }

    @Test
    public void testMax3Float_variousOrder_returnsLargest() {
        Assert.assertEquals(3.0f, NumberUtils.max(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    // ---------- Constants ----------
    @Test
    public void testConstants_values_areCorrect() {
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

    // ---------- Constructor ----------
    @Test
    public void testConstructor_newInstance_isNotNull() {
        NumberUtils instance = new NumberUtils();
        Assert.assertNotNull(instance);
    }
}
