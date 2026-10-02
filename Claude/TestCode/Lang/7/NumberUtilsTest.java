import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtilsTest {

    // Constructor
    @Test
    public void testConstructor_instantiate_success() {
        NumberUtils nu = new NumberUtils();
        Assert.assertNotNull(nu);
    }

    // toInt
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

    // toLong
    @Test
    public void testToLong_validString_returnsLong() {
        Assert.assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLong_null_returnsZero() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLongWithDefault_null_returnsDefault() {
        Assert.assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test
    public void testToLongWithDefault_validString_returnsParsed() {
        Assert.assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // toFloat
    @Test
    public void testToFloat_validString_returnsFloat() {
        Assert.assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloat_null_returnsZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_null_returnsDefault() {
        Assert.assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_validString_returnsParsed() {
        Assert.assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0001f);
    }

    // toDouble
    @Test
    public void testToDouble_validString_returnsDouble() {
        Assert.assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDouble_null_returnsZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_null_returnsDefault() {
        Assert.assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_invalidString_returnsDefault() {
        Assert.assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_validString_returnsParsed() {
        Assert.assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0001d);
    }

    // toByte
    @Test
    public void testToByte_validString_returnsByte() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_null_returnsZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
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

    // toShort
    @Test
    public void testToShort_validString_returnsShort() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_null_returnsZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
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

    // createNumber
    @Test
    public void testCreateNumber_null_returnsNull() {
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
    public void testCreateNumber_hexInt_returnsInteger() {
        Number n = NumberUtils.createNumber("0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_hexNegative_returnsInteger() {
        Number n = NumberUtils.createNumber("-0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_hexUpperCase_returnsInteger() {
        Number n = NumberUtils.createNumber("0X1A");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_hexLongManyDigits_returnsLong() {
        Number n = NumberUtils.createNumber("0x123456789");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_hexNegativeLongManyDigits_returnsLong() {
        Number n = NumberUtils.createNumber("-0x123456789");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_plainInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("123");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_plainNegativeInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("-123");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_bigIntegerValue_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_longValue_returnsLong() {
        Number n = NumberUtils.createNumber("" + (Long.MAX_VALUE));
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_decimalValue_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_decimalWithExponent_returnsFloatOrDouble() {
        Number n = NumberUtils.createNumber("1.5e10");
        Assert.assertNotNull(n);
    }

    @Test
    public void testCreateNumber_bigDecimalValue_returnsBigDecimal() {
        Number n = NumberUtils.createNumber("1.123456789012345678901234567890123456789");
        Assert.assertTrue(n instanceof BigDecimal || n instanceof Double);
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
    public void testCreateNumber_longSuffixBigInteger_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongSuffix_throwsException() {
        NumberUtils.createNumber("1.5L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLastCharLetter_throwsException() {
        NumberUtils.createNumber("123X");
    }

    @Test
    public void testCreateNumber_zeroWithFloatSuffix_returnsFloat() {
        Number n = NumberUtils.createNumber("0.0f");
        Assert.assertTrue(n instanceof Float);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidExpPosition_throwsException() {
        NumberUtils.createNumber("1.2.3e");
    }

    @Test
    public void testCreateNumber_negativeDecimal_returnsFloat() {
        Number n = NumberUtils.createNumber("-1.5");
        Assert.assertTrue(n instanceof Float);
    }

    // createFloat
    @Test
    public void testCreateFloat_validString_returnsFloat() {
        Assert.assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 0.0001f);
    }

    @Test
    public void testCreateFloat_null_returnsNull() {
        Assert.assertNull(NumberUtils.createFloat(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalidString_throwsException() {
        NumberUtils.createFloat("abc");
    }

    // createDouble
    @Test
    public void testCreateDouble_validString_returnsDouble() {
        Assert.assertEquals(1.5d, NumberUtils.createDouble("1.5").doubleValue(), 0.0001d);
    }

    @Test
    public void testCreateDouble_null_returnsNull() {
        Assert.assertNull(NumberUtils.createDouble(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalidString_throwsException() {
        NumberUtils.createDouble("abc");
    }

    // createInteger
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

    // createLong
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

    // createBigInteger
    @Test
    public void testCreateBigInteger_validString_returnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(123), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigInteger_null_returnsNull() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalidString_throwsException() {
        NumberUtils.createBigInteger("abc");
    }

    // createBigDecimal
    @Test
    public void testCreateBigDecimal_validString_returnsBigDecimal() {
        Assert.assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
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
    public void testCreateBigDecimal_invalidString_throwsException() {
        NumberUtils.createBigDecimal("abc");
    }

    // min(long[])
    @Test
    public void testMinLongArray_normal_returnsMin() {
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
    public void testMinLongArray_singleElement_returnsElement() {
        Assert.assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    // min(int[])
    @Test
    public void testMinIntArray_normal_returnsMin() {
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

    // min(short[])
    @Test
    public void testMinShortArray_normal_returnsMin() {
        Assert.assertEquals((short) 1, NumberUtils.min(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_null_throwsException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_empty_throwsException() {
        NumberUtils.min(new short[]{});
    }

    // min(byte[])
    @Test
    public void testMinByteArray_normal_returnsMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_null_throwsException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_empty_throwsException() {
        NumberUtils.min(new byte[]{});
    }

    // min(double[])
    @Test
    public void testMinDoubleArray_normal_returnsMin() {
        Assert.assertEquals(1.0d, NumberUtils.min(new double[]{3.0, 1.0, 2.0}), 0.0001d);
    }

    @Test
    public void testMinDoubleArray_withNaN_returnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_null_throwsException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_empty_throwsException() {
        NumberUtils.min(new double[]{});
    }

    // min(float[])
    @Test
    public void testMinFloatArray_normal_returnsMin() {
        Assert.assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMinFloatArray_withNaN_returnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_null_throwsException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_empty_throwsException() {
        NumberUtils.min(new float[]{});
    }

    // max(long[])
    @Test
    public void testMaxLongArray_normal_returnsMax() {
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

    // max(int[])
    @Test
    public void testMaxIntArray_normal_returnsMax() {
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

    // max(short[])
    @Test
    public void testMaxShortArray_normal_returnsMax() {
        Assert.assertEquals((short) 3, NumberUtils.max(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_null_throwsException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_empty_throwsException() {
        NumberUtils.max(new short[]{});
    }

    // max(byte[])
    @Test
    public void testMaxByteArray_normal_returnsMax() {
        Assert.assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_null_throwsException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_empty_throwsException() {
        NumberUtils.max(new byte[]{});
    }

    // max(double[])
    @Test
    public void testMaxDoubleArray_normal_returnsMax() {
        Assert.assertEquals(3.0d, NumberUtils.max(new double[]{3.0, 1.0, 2.0}), 0.0001d);
    }

    @Test
    public void testMaxDoubleArray_withNaN_returnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_null_throwsException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_empty_throwsException() {
        NumberUtils.max(new double[]{});
    }

    // max(float[])
    @Test
    public void testMaxFloatArray_normal_returnsMax() {
        Assert.assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMaxFloatArray_withNaN_returnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_null_throwsException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_empty_throwsException() {
        NumberUtils.max(new float[]{});
    }

    // 3-param min
    @Test
    public void testMinLong3_normal_returnsMin() {
        Assert.assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
    }

    @Test
    public void testMinLong3_firstIsMin_returnsFirst() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
    }

    @Test
    public void testMinInt3_normal_returnsMin() {
        Assert.assertEquals(1, NumberUtils.min(3, 1, 2));
    }

    @Test
    public void testMinInt3_firstIsMin_returnsFirst() {
        Assert.assertEquals(1, NumberUtils.min(1, 2, 3));
    }

    @Test
    public void testMinShort3_normal_returnsMin() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMinByte3_normal_returnsMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMinDouble3_normal_returnsMin() {
        Assert.assertEquals(1.0d, NumberUtils.min(3.0, 1.0, 2.0), 0.0001d);
    }

    @Test
    public void testMinFloat3_normal_returnsMin() {
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    // 3-param max
    @Test
    public void testMaxLong3_normal_returnsMax() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
    }

    @Test
    public void testMaxLong3_firstIsMax_returnsFirst() {
        Assert.assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMaxInt3_normal_returnsMax() {
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
    }

    @Test
    public void testMaxInt3_firstIsMax_returnsFirst() {
        Assert.assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMaxShort3_normal_returnsMax() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
    }

    @Test
    public void testMaxByte3_normal_returnsMax() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
    }

    @Test
    public void testMaxDouble3_normal_returnsMax() {
        Assert.assertEquals(3.0d, NumberUtils.max(1.0, 3.0, 2.0), 0.0001d);
    }

    @Test
    public void testMaxFloat3_normal_returnsMax() {
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
    }

    // isDigits
    @Test
    public void testIsDigits_validDigits_returnsTrue() {
        Assert.assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_null_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_empty_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_withLetters_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("123a"));
    }

    @Test
    public void testIsDigits_withDecimalPoint_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("12.3"));
    }

    // isNumber
    @Test
    public void testIsNumber_validInteger_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_null_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_empty_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_negativeInteger_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_validDecimal_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_validHex_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_hexOnlyPrefix_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_invalidHex_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0xGG"));
    }

    @Test
    public void testIsNumber_validExponent_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5e10"));
    }

    @Test
    public void testIsNumber_validExponentWithSign_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5e-10"));
    }

    @Test
    public void testIsNumber_doubleDecimalPoints_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_doubleExponent_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1e2e3"));
    }

    @Test
    public void testIsNumber_exponentWithoutDigit_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("e10"));
    }

    @Test
    public void testIsNumber_trailingExponent_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123E"));
    }

    @Test
    public void testIsNumber_invalidSignPosition_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_validFloatSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45f"));
    }

    @Test
    public void testIsNumber_validDoubleSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45d"));
    }

    @Test
    public void testIsNumber_validLongSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_longSuffixWithDecimal_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123.45L"));
    }

    @Test
    public void testIsNumber_longSuffixWithExponent_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123e5L"));
    }

    @Test
    public void testIsNumber_invalidLastChar_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123X"));
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
    public void testIsNumber_invalidCharacter_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("12#3"));
    }

    @Test
    public void testIsNumber_signWithoutDigitAfterExponent_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1.5e-"));
    }

    @Test
    public void testIsNumber_negativeOnly_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("-"));
    }

    // Constants check
    @Test
    public void testConstants_values_areCorrect() {
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
}
