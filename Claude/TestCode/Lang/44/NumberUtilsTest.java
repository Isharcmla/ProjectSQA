import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    // -------------------- Constructor --------------------

    @Test
    public void testConstructor_createInstance_notNull() {
        NumberUtils nu = new NumberUtils();
        Assert.assertNotNull(nu);
    }

    // -------------------- stringToInt(String) --------------------

    @Test
    public void testStringToInt_validNumber_returnsParsedInt() {
        Assert.assertEquals(12345, NumberUtils.stringToInt("12345"));
    }

    @Test
    public void testStringToInt_invalidNumber_returnsZero() {
        Assert.assertEquals(0, NumberUtils.stringToInt("abc"));
    }

    @Test
    public void testStringToInt_null_returnsZero() {
        Assert.assertEquals(0, NumberUtils.stringToInt(null));
    }

    // -------------------- stringToInt(String, int) --------------------

    @Test
    public void testStringToIntWithDefault_validNumber_returnsParsedInt() {
        Assert.assertEquals(42, NumberUtils.stringToInt("42", -1));
    }

    @Test
    public void testStringToIntWithDefault_invalidNumber_returnsDefault() {
        Assert.assertEquals(-1, NumberUtils.stringToInt("notanumber", -1));
    }

    @Test
    public void testStringToIntWithDefault_null_returnsDefault() {
        Assert.assertEquals(99, NumberUtils.stringToInt(null, 99));
    }

    // -------------------- createNumber --------------------

    @Test
    public void testCreateNumber_null_returnsNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_emptyString_throwsException() {
        NumberUtils.createNumber("");
    }

    @Test
    public void testCreateNumber_doubleMinus_returnsNull() {
        Assert.assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hex_returnsInteger() {
        Number n = NumberUtils.createNumber("0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeHex_returnsInteger() {
        Number n = NumberUtils.createNumber("-0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_plainInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("123");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_plainLong_returnsLong() {
        Number n = NumberUtils.createNumber("123456789012345");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_plainBigInteger_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_decimalPoint_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_decimalWithExponent_returnsFloatOrDouble() {
        Number n = NumberUtils.createNumber("1.5E3");
        Assert.assertNotNull(n);
    }

    @Test
    public void testCreateNumber_plainExponentNoDecimal_returnsFloatOrDouble() {
        Number n = NumberUtils.createNumber("15E3");
        Assert.assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expBeforeDec_throwsException() {
        NumberUtils.createNumber("1E2.3");
    }

    @Test
    public void testCreateNumber_longSuffix_returnsLong() {
        Number n = NumberUtils.createNumber("123L");
        Assert.assertTrue(n instanceof Long);
        Assert.assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_negativeLongSuffix_returnsLong() {
        Number n = NumberUtils.createNumber("-123L");
        Assert.assertTrue(n instanceof Long);
        Assert.assertEquals(-123L, n.longValue());
    }

    @Test
    public void testCreateNumber_bigLongSuffix_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidLongSuffix_throwsException() {
        NumberUtils.createNumber("1.5L");
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
    public void testCreateNumber_upperDoubleSuffix_returnsDouble() {
        Number n = NumberUtils.createNumber("1.5D");
        Assert.assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_upperFloatSuffix_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5F");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_zeroFloatSuffix_returnsFloatOrBigDecimal() {
        Number n = NumberUtils.createNumber("0.0f");
        Assert.assertNotNull(n);
    }

    @Test
    public void testCreateNumber_largeFloatSuffix_fallsThroughToDoubleOrBigDecimal() {
        // value too large for float precision requirement due to allZeros logic
        Number n = NumberUtils.createNumber("1.23456789123456789f");
        Assert.assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidSuffix_throwsException() {
        NumberUtils.createNumber("123X");
    }

    @Test
    public void testCreateNumber_bigDecimalPlain_returnsFloatDoubleOrBigDecimal() {
        Number n = NumberUtils.createNumber("1.23456789012345678901234567890");
        Assert.assertNotNull(n);
    }

    // -------------------- createFloat --------------------

    @Test
    public void testCreateFloat_validString_returnsFloat() {
        Float f = NumberUtils.createFloat("1.5");
        Assert.assertEquals(1.5f, f.floatValue(), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalidString_throwsException() {
        NumberUtils.createFloat("abc");
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFloat_null_throwsException() {
        NumberUtils.createFloat(null);
    }

    // -------------------- createDouble --------------------

    @Test
    public void testCreateDouble_validString_returnsDouble() {
        Double d = NumberUtils.createDouble("1.5");
        Assert.assertEquals(1.5d, d.doubleValue(), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalidString_throwsException() {
        NumberUtils.createDouble("abc");
    }

    @Test(expected = NullPointerException.class)
    public void testCreateDouble_null_throwsException() {
        NumberUtils.createDouble(null);
    }

    // -------------------- createInteger --------------------

    @Test
    public void testCreateInteger_decimalString_returnsInteger() {
        Integer i = NumberUtils.createInteger("123");
        Assert.assertEquals(123, i.intValue());
    }

    @Test
    public void testCreateInteger_hexString_returnsInteger() {
        Integer i = NumberUtils.createInteger("0x1A");
        Assert.assertEquals(26, i.intValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalidString_throwsException() {
        NumberUtils.createInteger("abc");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_null_throwsException() {
        NumberUtils.createInteger(null);
    }

    // -------------------- createLong --------------------

    @Test
    public void testCreateLong_validString_returnsLong() {
        Long l = NumberUtils.createLong("123456789");
        Assert.assertEquals(123456789L, l.longValue());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalidString_throwsException() {
        NumberUtils.createLong("abc");
    }

    @Test(expected = NullPointerException.class)
    public void testCreateLong_null_throwsException() {
        NumberUtils.createLong(null);
    }

    // -------------------- createBigInteger --------------------

    @Test
    public void testCreateBigInteger_validString_returnsBigInteger() {
        BigInteger bi = NumberUtils.createBigInteger("123456789012345678901234567890");
        Assert.assertEquals(new BigInteger("123456789012345678901234567890"), bi);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalidString_throwsException() {
        NumberUtils.createBigInteger("abc");
    }

    // -------------------- createBigDecimal --------------------

    @Test
    public void testCreateBigDecimal_validString_returnsBigDecimal() {
        BigDecimal bd = NumberUtils.createBigDecimal("1.23456789");
        Assert.assertEquals(new BigDecimal("1.23456789"), bd);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalidString_throwsException() {
        NumberUtils.createBigDecimal("abc");
    }

    // -------------------- minimum(long,long,long) --------------------

    @Test
    public void testMinimumLong_firstIsSmallest_returnsFirst() {
        Assert.assertEquals(1L, NumberUtils.minimum(1L, 2L, 3L));
    }

    @Test
    public void testMinimumLong_secondIsSmallest_returnsSecond() {
        Assert.assertEquals(1L, NumberUtils.minimum(2L, 1L, 3L));
    }

    @Test
    public void testMinimumLong_thirdIsSmallest_returnsThird() {
        Assert.assertEquals(1L, NumberUtils.minimum(2L, 3L, 1L));
    }

    @Test
    public void testMinimumLong_allEqual_returnsSameValue() {
        Assert.assertEquals(5L, NumberUtils.minimum(5L, 5L, 5L));
    }

    @Test
    public void testMinimumLong_negativeValues_returnsSmallest() {
        Assert.assertEquals(-10L, NumberUtils.minimum(-1L, -5L, -10L));
    }

    // -------------------- minimum(int,int,int) --------------------

    @Test
    public void testMinimumInt_firstIsSmallest_returnsFirst() {
        Assert.assertEquals(1, NumberUtils.minimum(1, 2, 3));
    }

    @Test
    public void testMinimumInt_secondIsSmallest_returnsSecond() {
        Assert.assertEquals(1, NumberUtils.minimum(2, 1, 3));
    }

    @Test
    public void testMinimumInt_thirdIsSmallest_returnsThird() {
        Assert.assertEquals(1, NumberUtils.minimum(2, 3, 1));
    }

    @Test
    public void testMinimumInt_allEqual_returnsSameValue() {
        Assert.assertEquals(5, NumberUtils.minimum(5, 5, 5));
    }

    // -------------------- maximum(long,long,long) --------------------

    @Test
    public void testMaximumLong_firstIsLargest_returnsFirst() {
        Assert.assertEquals(3L, NumberUtils.maximum(3L, 2L, 1L));
    }

    @Test
    public void testMaximumLong_secondIsLargest_returnsSecond() {
        Assert.assertEquals(3L, NumberUtils.maximum(1L, 3L, 2L));
    }

    @Test
    public void testMaximumLong_thirdIsLargest_returnsThird() {
        Assert.assertEquals(3L, NumberUtils.maximum(1L, 2L, 3L));
    }

    @Test
    public void testMaximumLong_allEqual_returnsSameValue() {
        Assert.assertEquals(5L, NumberUtils.maximum(5L, 5L, 5L));
    }

    @Test
    public void testMaximumLong_negativeValues_returnsLargest() {
        Assert.assertEquals(-1L, NumberUtils.maximum(-1L, -5L, -10L));
    }

    // -------------------- maximum(int,int,int) --------------------

    @Test
    public void testMaximumInt_firstIsLargest_returnsFirst() {
        Assert.assertEquals(3, NumberUtils.maximum(3, 2, 1));
    }

    @Test
    public void testMaximumInt_secondIsLargest_returnsSecond() {
        Assert.assertEquals(3, NumberUtils.maximum(1, 3, 2));
    }

    @Test
    public void testMaximumInt_thirdIsLargest_returnsThird() {
        Assert.assertEquals(3, NumberUtils.maximum(1, 2, 3));
    }

    @Test
    public void testMaximumInt_allEqual_returnsSameValue() {
        Assert.assertEquals(5, NumberUtils.maximum(5, 5, 5));
    }

    // -------------------- compare(double,double) --------------------

    @Test
    public void testCompareDouble_lhsLess_returnsNegativeOne() {
        Assert.assertEquals(-1, NumberUtils.compare(1.0d, 2.0d));
    }

    @Test
    public void testCompareDouble_lhsGreater_returnsPositiveOne() {
        Assert.assertEquals(1, NumberUtils.compare(2.0d, 1.0d));
    }

    @Test
    public void testCompareDouble_equalValues_returnsZero() {
        Assert.assertEquals(0, NumberUtils.compare(1.0d, 1.0d));
    }

    @Test
    public void testCompareDouble_bothNaN_returnsZero() {
        Assert.assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
    }

    @Test
    public void testCompareDouble_negativeZeroVsPositiveZero_returnsNegativeOne() {
        Assert.assertEquals(-1, NumberUtils.compare(-0.0d, 0.0d));
    }

    @Test
    public void testCompareDouble_positiveZeroVsNegativeZero_returnsPositiveOne() {
        Assert.assertEquals(1, NumberUtils.compare(0.0d, -0.0d));
    }

    @Test
    public void testCompareDouble_valueVsNaN_returnsNegativeOne() {
        Assert.assertEquals(-1, NumberUtils.compare(1.0d, Double.NaN));
    }

    @Test
    public void testCompareDouble_NaNVsValue_returnsPositiveOne() {
        Assert.assertEquals(1, NumberUtils.compare(Double.NaN, 1.0d));
    }

    // -------------------- compare(float,float) --------------------

    @Test
    public void testCompareFloat_lhsLess_returnsNegativeOne() {
        Assert.assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
    }

    @Test
    public void testCompareFloat_lhsGreater_returnsPositiveOne() {
        Assert.assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
    }

    @Test
    public void testCompareFloat_equalValues_returnsZero() {
        Assert.assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
    }

    @Test
    public void testCompareFloat_bothNaN_returnsZero() {
        Assert.assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
    }

    @Test
    public void testCompareFloat_negativeZeroVsPositiveZero_returnsNegativeOne() {
        Assert.assertEquals(-1, NumberUtils.compare(-0.0f, 0.0f));
    }

    @Test
    public void testCompareFloat_positiveZeroVsNegativeZero_returnsPositiveOne() {
        Assert.assertEquals(1, NumberUtils.compare(0.0f, -0.0f));
    }

    @Test
    public void testCompareFloat_valueVsNaN_returnsNegativeOne() {
        Assert.assertEquals(-1, NumberUtils.compare(1.0f, Float.NaN));
    }

    @Test
    public void testCompareFloat_NaNVsValue_returnsPositiveOne() {
        Assert.assertEquals(1, NumberUtils.compare(Float.NaN, 1.0f));
    }

    // -------------------- isDigits --------------------

    @Test
    public void testIsDigits_allDigits_returnsTrue() {
        Assert.assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_containsNonDigit_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("123a5"));
    }

    @Test
    public void testIsDigits_null_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_emptyString_returnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(""));
    }

    // -------------------- isNumber --------------------

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
        Assert.assertTrue(NumberUtils.isNumber("12345"));
    }

    @Test
    public void testIsNumber_negativeInteger_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("-12345"));
    }

    @Test
    public void testIsNumber_decimalNumber_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_scientificNotation_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5E10"));
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
        Assert.assertFalse(NumberUtils.isNumber("0xGG"));
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
    public void testIsNumber_exponentWithoutDigit_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("E123"));
    }

    @Test
    public void testIsNumber_signWithoutAllow_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_illegalCharacter_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("12a45"));
    }

    @Test
    public void testIsNumber_floatSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45f"));
    }

    @Test
    public void testIsNumber_doubleSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45d"));
    }

    @Test
    public void testIsNumber_longSuffix_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("12345L"));
    }

    @Test
    public void testIsNumber_longSuffixWithExponent_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1.5E10L"));
    }

    @Test
    public void testIsNumber_endingWithE_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123E"));
    }

    @Test
    public void testIsNumber_illegalLastCharacter_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123X"));
    }

    @Test
    public void testIsNumber_qualifierWithoutDigit_returnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(".f"));
    }

    @Test
    public void testIsNumber_trailingDotOnlyDigit_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1."));
    }

    @Test
    public void testIsNumber_negativeExponentNumber_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5E-10"));
    }

    @Test
    public void testIsNumber_positiveExponentNumber_returnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5E+10"));
    }
}
