NumberUtilsTest.java
```java
package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    // ---------- Constants ----------
    @Test
    public void testConstants_values_correct() {
        assertEquals(0L, NumberUtils.LONG_ZERO.longValue());
        assertEquals(1L, NumberUtils.LONG_ONE.longValue());
        assertEquals(-1L, NumberUtils.LONG_MINUS_ONE.longValue());
        assertEquals(0, NumberUtils.INTEGER_ZERO.intValue());
        assertEquals(1, NumberUtils.INTEGER_ONE.intValue());
        assertEquals(-1, NumberUtils.INTEGER_MINUS_ONE.intValue());
        assertEquals(0, NumberUtils.SHORT_ZERO.shortValue());
        assertEquals(1, NumberUtils.SHORT_ONE.shortValue());
        assertEquals(-1, NumberUtils.SHORT_MINUS_ONE.shortValue());
        assertEquals(0, NumberUtils.BYTE_ZERO.byteValue());
        assertEquals(1, NumberUtils.BYTE_ONE.byteValue());
        assertEquals(-1, NumberUtils.BYTE_MINUS_ONE.byteValue());
        assertEquals(0.0d, NumberUtils.DOUBLE_ZERO.doubleValue(), 0.0001);
        assertEquals(1.0d, NumberUtils.DOUBLE_ONE.doubleValue(), 0.0001);
        assertEquals(-1.0d, NumberUtils.DOUBLE_MINUS_ONE.doubleValue(), 0.0001);
        assertEquals(0.0f, NumberUtils.FLOAT_ZERO.floatValue(), 0.0001f);
        assertEquals(1.0f, NumberUtils.FLOAT_ONE.floatValue(), 0.0001f);
        assertEquals(-1.0f, NumberUtils.FLOAT_MINUS_ONE.floatValue(), 0.0001f);
    }

    @Test
    public void testConstructor_default_createsInstance() {
        NumberUtils nu = new NumberUtils();
        assertNotNull(nu);
    }

    // ---------- toInt ----------
    @Test
    public void testToInt_validString_returnsParsedValue() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_null_returnsZero() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_emptyString_returnsZero() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_invalidString_returnsZero() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntWithDefault_null_returnsDefault() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntWithDefault_invalid_returnsDefault() {
        assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void testToIntWithDefault_valid_returnsParsed() {
        assertEquals(10, NumberUtils.toInt("10", 5));
    }

    // ---------- toLong ----------
    @Test
    public void testToLong_validString_returnsParsedValue() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLong_null_returnsZero() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_invalidString_returnsZero() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongWithDefault_null_returnsDefault() {
        assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongWithDefault_invalid_returnsDefault() {
        assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test
    public void testToLongWithDefault_valid_returnsParsed() {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // ---------- toFloat ----------
    @Test
    public void testToFloat_validString_returnsParsedValue() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloat_null_returnsZero() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
    }

    @Test
    public void testToFloat_invalidString_returnsZero() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_null_returnsDefault() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_invalid_returnsDefault() {
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_valid_returnsParsed() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0001f);
    }

    // ---------- toDouble ----------
    @Test
    public void testToDouble_validString_returnsParsedValue() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDouble_null_returnsZero() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
    }

    @Test
    public void testToDouble_invalidString_returnsZero() {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_null_returnsDefault() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_invalid_returnsDefault() {
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_valid_returnsParsed() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0001d);
    }

    // ---------- toByte ----------
    @Test
    public void testToByte_validString_returnsParsedValue() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_null_returnsZero() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_invalidString_returnsZero() {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteWithDefault_null_returnsDefault() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteWithDefault_invalid_returnsDefault() {
        assertEquals((byte) 1, NumberUtils.toByte("", (byte) 1));
    }

    @Test
    public void testToByteWithDefault_valid_returnsParsed() {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    // ---------- toShort ----------
    @Test
    public void testToShort_validString_returnsParsedValue() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_null_returnsZero() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_invalidString_returnsZero() {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortWithDefault_null_returnsDefault() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortWithDefault_invalid_returnsDefault() {
        assertEquals((short) 1, NumberUtils.toShort("", (short) 1));
    }

    @Test
    public void testToShortWithDefault_valid_returnsParsed() {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    // ---------- createNumber ----------
    @Test
    public void testCreateNumber_null_returnsNull() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blankString_throwsException() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_doubleDash_returnsNull() {
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hexString_returnsInteger() {
        Number n = NumberUtils.createNumber("0x1A");
        assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeHexString_returnsInteger() {
        Number n = NumberUtils.createNumber("-0x1A");
        assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_plainInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeInteger_returnsInteger() {
        Number n = NumberUtils.createNumber("-123");
        assertEquals(-123, n.intValue());
    }

    @Test
    public void testCreateNumber_longValue_returnsLong() {
        Number n = NumberUtils.createNumber("123456789123456");
        assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_bigIntegerValue_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_floatValue_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_typeQualifierL_returnsLong() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_typeQualifierLNegative_returnsLong() {
        Number n = NumberUtils.createNumber("-123L");
        assertEquals(-123L, n.longValue());
    }

    @Test
    public void testCreateNumber_typeQualifierLBigInteger_returnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_typeQualifierLInvalid_throwsException() {
        NumberUtils.createNumber("1.5L");
    }

    @Test
    public void testCreateNumber_typeQualifierF_returnsFloat() {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_typeQualifierD_returnsDouble() {
        Number n = NumberUtils.createNumber("1.5d");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_typeQualifierD_zeroAllZeros_returnsDouble() {
        Number n = NumberUtils.createNumber("0.0d");
        assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_exponentNotation_returnsNumber() {
        Number n = NumberUtils.createNumber("1.5E2");
        assertNotNull(n);
    }

    @Test
    public void testCreateNumber_exponentNotationInt_returnsNumber() {
        Number n = NumberUtils.createNumber("2E2");
        assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_expBeforeDec_throwsException() {
        NumberUtils.createNumber("1E2.5");
    }

    @Test
    public void testCreateNumber_bigDecimalPrecision_returnsBigDecimal() {
        Number n = NumberUtils.createNumber("1.23456789012345678901234567890123456789");
        assertTrue(n instanceof BigDecimal || n instanceof Double || n instanceof Float);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidTypeQualifier_throwsException() {
        NumberUtils.createNumber("123X");
    }

    @Test
    public void testCreateNumber_decimalWithTrailingDot_handled() {
        Number n = NumberUtils.createNumber("1.");
        assertNotNull(n);
    }

    // ---------- createFloat ----------
    @Test
    public void testCreateFloat_validString_returnsFloat() {
        assertEquals(Float.valueOf("1.5"), NumberUtils.createFloat("1.5"));
    }

    @Test
    public void testCreateFloat_null_returnsNull() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalidString_throwsException() {
        NumberUtils.createFloat("abc");
    }

    // ---------- createDouble ----------
    @Test
    public void testCreateDouble_validString_returnsDouble() {
        assertEquals(Double.valueOf("1.5"), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateDouble_null_returnsNull() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalidString_throwsException() {
        NumberUtils.createDouble("abc");
    }

    // ---------- createInteger ----------
    @Test
    public void testCreateInteger_validString_returnsInteger() {
        assertEquals(Integer.valueOf(1), NumberUtils.createInteger("1"));
    }

    @Test
    public void testCreateInteger_null_returnsNull() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_hexString_returnsInteger() {
        assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalidString_throwsException() {
        NumberUtils.createInteger("abc");
    }

    // ---------- createLong ----------
    @Test
    public void testCreateLong_validString_returnsLong() {
        assertEquals(Long.valueOf(1L), NumberUtils.createLong("1"));
    }

    @Test
    public void testCreateLong_null_returnsNull() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalidString_throwsException() {
        NumberUtils.createLong("abc");
    }

    // ---------- createBigInteger ----------
    @Test
    public void testCreateBigInteger_validString_returnsBigInteger() {
        assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigInteger_null_returnsNull() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalidString_throwsException() {
        NumberUtils.createBigInteger("abc");
    }

    // ---------- createBigDecimal ----------
    @Test
    public void testCreateBigDecimal_validString_returnsBigDecimal() {
        assertEquals(new BigDecimal("1.5"), NumberUtils.createBigDecimal("1.5"));
    }

    @Test
    public void testCreateBigDecimal_null_returnsNull() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blankString_throwsException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalidString_throwsException() {
        NumberUtils.createBigDecimal("abc");
    }

    // ---------- min array long ----------
    @Test
    public void testMinLongArray_normal_returnsMin() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
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
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    // ---------- min array int ----------
    @Test
    public void testMinIntArray_normal_returnsMin() {
        assertEquals(1, NumberUtils.min(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_null_throwsException() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_empty_throwsException() {
        NumberUtils.min(new int[]{});
    }

    // ---------- min array short ----------
    @Test
    public void testMinShortArray_normal_returnsMin() {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_null_throwsException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_empty_throwsException() {
        NumberUtils.min(new short[]{});
    }

    // ---------- min array byte ----------
    @Test
    public void testMinByteArray_normal_returnsMin() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_null_throwsException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_empty_throwsException() {
        NumberUtils.min(new byte[]{});
    }

    // ---------- min array double ----------
    @Test
    public void testMinDoubleArray_normal_returnsMin() {
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
    }

    @Test
    public void testMinDoubleArray_containsNaN_returnsNaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_null_throwsException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_empty_throwsException() {
        NumberUtils.min(new double[]{});
    }

    // ---------- min array float ----------
    @Test
    public void testMinFloatArray_normal_returnsMin() {
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMinFloatArray_containsNaN_returnsNaN() {
        assertTrue(Float.isNaN(NumberUtils.min(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_null_throwsException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_empty_throwsException() {
        NumberUtils.min(new float[]{});
    }

    // ---------- max array long ----------
    @Test
    public void testMaxLongArray_normal_returnsMax() {
        assertEquals(3L, NumberUtils.max(new long[]{3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_null_throwsException() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_empty_throwsException() {
        NumberUtils.max(new long[]{});
    }

    // ---------- max array int ----------
    @Test
    public void testMaxIntArray_normal_returnsMax() {
        assertEquals(3, NumberUtils.max(new int[]{3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_null_throwsException() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_empty_throwsException() {
        NumberUtils.max(new int[]{});
    }

    // ---------- max array short ----------
    @Test
    public void testMaxShortArray_normal_returnsMax() {
        assertEquals((short) 3, NumberUtils.max(new short[]{(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_null_throwsException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_empty_throwsException() {
        NumberUtils.max(new short[]{});
    }

    // ---------- max array byte ----------
    @Test
    public void testMaxByteArray_normal_returnsMax() {
        assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_null_throwsException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_empty_throwsException() {
        NumberUtils.max(new byte[]{});
    }

    // ---------- max array double ----------
    @Test
    public void testMaxDoubleArray_normal_returnsMax() {
        assertEquals(3.0d, NumberUtils.max(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
    }

    @Test
    public void testMaxDoubleArray_containsNaN_returnsNaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0d, Double.NaN, 2.0d})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_null_throwsException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_empty_throwsException() {
        NumberUtils.max(new double[]{});
    }

    // ---------- max array float ----------
    @Test
    public void testMaxFloatArray_normal_returnsMax() {
        assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMaxFloatArray_containsNaN_returnsNaN() {
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_null_throwsException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_empty_throwsException() {
        NumberUtils.max(new float[]{});
    }

    // ---------- min 3 params long ----------
    @Test
    public void testMin3Long_bSmallest_returnsB() {
        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
    }

    @Test
    public void testMin3Long_cSmallest_returnsC() {
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMin3Long_aSmallest_returnsA() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
    }

    // ---------- min 3 params int ----------
    @Test
    public void testMin3Int_bSmallest_returnsB() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
    }

    @Test
    public void testMin3Int_cSmallest_returnsC() {
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMin3Int_aSmallest_returnsA() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
    }

    // ---------- min 3 params short ----------
    @Test
    public void testMin3Short_bSmallest_returnsB() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMin3Short_cSmallest_returnsC() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    // ---------- min 3 params byte ----------
    @Test
    public void testMin3Byte_bSmallest_returnsB() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMin3Byte_cSmallest_returnsC() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    // ---------- min 3 params double ----------
    @Test
    public void testMin3Double_normal_returnsMin() {
        assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0001d);
    }

    // ---------- min 3 params float ----------
    @Test
    public void testMin3Float_normal_returnsMin() {
        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    // ---------- max 3 params long ----------
    @Test
    public void testMax3Long_bLargest_returnsB() {
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
    }

    @Test
    public void testMax3Long_cLargest_returnsC() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
    }

    @Test
    public void testMax3Long_aLargest_returnsA() {
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    // ---------- max 3 params int ----------
    @Test
    public void testMax3Int_bLargest_returnsB() {
        assertEquals(3, NumberUtils.max(1, 3, 2));
    }

    @Test
    public void testMax3Int_cLargest_returnsC() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    // ---------- max 3 params short ----------
    @Test
    public void testMax3Short_bLargest_returnsB() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
    }

    @Test
    public void testMax3Short_cLargest_returnsC() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
    }

    // ---------- max 3 params byte ----------
    @Test
    public void testMax3Byte_bLargest_returnsB() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
    }

    @Test
    public void testMax3Byte_cLargest_returnsC() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
    }

    // ---------- max 3 params double ----------
    @Test
    public void testMax3Double_normal_returnsMax() {
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0001d);
    }

    // ---------- max 3 params float ----------
    @Test
    public void testMax3Float_normal_returnsMax() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
    }

    // ---------- isDigits ----------
    @Test
    public void testIsDigits_validDigits_returnsTrue() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_null_returnsFalse() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_emptyString_returnsFalse() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_nonDigitChars_returnsFalse() {
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    @Test
    public void testIsDigits_decimalNumber_returnsFalse() {
        assertFalse(NumberUtils.isDigits("1.5"));
    }

    // ---------- isNumber ----------
    @Test
    public void testIsNumber_validInteger_returnsTrue() {
        assertTrue(NumberUtils.isNumber("12345"));
    }

    @Test
    public void testIsNumber_null_returnsFalse() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_emptyString_returnsFalse() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_negativeInteger_returnsTrue() {
        assertTrue(NumberUtils.isNumber("-12345"));
    }

    @Test
    public void testIsNumber_validHex_returnsTrue() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_invalidHexOnlyPrefix_returnsFalse() {
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_invalidHexChars_returnsFalse() {
        assertFalse(NumberUtils.isNumber("0xZZ"));
    }

    @Test
    public void testIsNumber_decimalNumber_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1.5"));
    }

    @Test
    public void testIsNumber_twoDecimalPoints_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1.5.6"));
    }

    @Test
    public void testIsNumber_exponentNotation_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1.5E10"));
    }

    @Test
    public void testIsNumber_exponentWithSign_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1.5E-10"));
    }

    @Test
    public void testIsNumber_twoExponents_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1.5E10E5"));
    }

    @Test
    public void testIsNumber_exponentWithoutDigitBefore_returnsFalse() {
        assertFalse(NumberUtils.isNumber("E10"));
    }

    @Test
    public void testIsNumber_signWithoutAllow_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1+5"));
    }

    @Test
    public void testIsNumber_trailingDecimalPoint_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1."));
    }

    @Test
    public void testIsNumber_trailingE_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1E"));
    }

    @Test
    public void testIsNumber_floatQualifier_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1.5f"));
    }

    @Test
    public void testIsNumber_doubleQualifier_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1.5d"));
    }

    @Test
    public void testIsNumber_longQualifier_returnsTrue() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_longQualifierWithExponent_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1.5E10L"));
    }

    @Test
    public void testIsNumber_illegalLastChar_returnsFalse() {
        assertFalse(NumberUtils.isNumber("123X"));
    }

    @Test
    public void testIsNumber_onlyMinusSign_returnsFalse() {
        assertFalse(NumberUtils.isNumber("-"));
    }

    @Test
    public void testIsNumber_illegalChar_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1a5"));
    }

    @Test
    public void testIsNumber_endsWithE_allowSignsTrue_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1.5E-"));
    }
}
```
