import org.junit.Test;
import org.junit.Assert;
import org.apache.commons.lang3.math.NumberUtils;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    // ---------- toInt ----------
    @Test
    public void testToInt_ValidString_ReturnsInt() {
        Assert.assertEquals(1, NumberUtils.toInt("1"));
    }

    @Test
    public void testToInt_Null_ReturnsZero() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_Empty_ReturnsZero() {
        Assert.assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_InvalidString_ReturnsZero() {
        Assert.assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntWithDefault_Null_ReturnsDefault() {
        Assert.assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntWithDefault_Invalid_ReturnsDefault() {
        Assert.assertEquals(1, NumberUtils.toInt("", 1));
    }

    @Test
    public void testToIntWithDefault_Valid_ReturnsParsed() {
        Assert.assertEquals(1, NumberUtils.toInt("1", 0));
    }

    // ---------- toLong ----------
    @Test
    public void testToLong_ValidString_ReturnsLong() {
        Assert.assertEquals(1L, NumberUtils.toLong("1"));
    }

    @Test
    public void testToLong_Null_ReturnsZero() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_Invalid_ReturnsZero() {
        Assert.assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongWithDefault_Null_ReturnsDefault() {
        Assert.assertEquals(1L, NumberUtils.toLong(null, 1L));
    }

    @Test
    public void testToLongWithDefault_Invalid_ReturnsDefault() {
        Assert.assertEquals(1L, NumberUtils.toLong("", 1L));
    }

    @Test
    public void testToLongWithDefault_Valid_ReturnsParsed() {
        Assert.assertEquals(1L, NumberUtils.toLong("1", 0L));
    }

    // ---------- toFloat ----------
    @Test
    public void testToFloat_ValidString_ReturnsFloat() {
        Assert.assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);
    }

    @Test
    public void testToFloat_Null_ReturnsZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0001f);
    }

    @Test
    public void testToFloat_Invalid_ReturnsZero() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_Null_ReturnsDefault() {
        Assert.assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_Invalid_ReturnsDefault() {
        Assert.assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_Valid_ReturnsParsed() {
        Assert.assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0001f);
    }

    // ---------- toDouble ----------
    @Test
    public void testToDouble_ValidString_ReturnsDouble() {
        Assert.assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0001d);
    }

    @Test
    public void testToDouble_Null_ReturnsZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble(null), 0.0001d);
    }

    @Test
    public void testToDouble_Invalid_ReturnsZero() {
        Assert.assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_Null_ReturnsDefault() {
        Assert.assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_Invalid_ReturnsDefault() {
        Assert.assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0001d);
    }

    @Test
    public void testToDoubleWithDefault_Valid_ReturnsParsed() {
        Assert.assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0001d);
    }

    // ---------- toByte ----------
    @Test
    public void testToByte_ValidString_ReturnsByte() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_Null_ReturnsZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_Invalid_ReturnsZero() {
        Assert.assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteWithDefault_Null_ReturnsDefault() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteWithDefault_Invalid_ReturnsDefault() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("", (byte) 1));
    }

    @Test
    public void testToByteWithDefault_Valid_ReturnsParsed() {
        Assert.assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    // ---------- toShort ----------
    @Test
    public void testToShort_ValidString_ReturnsShort() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_Null_ReturnsZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_Invalid_ReturnsZero() {
        Assert.assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortWithDefault_Null_ReturnsDefault() {
        Assert.assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortWithDefault_Invalid_ReturnsDefault() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("", (short) 1));
    }

    @Test
    public void testToShortWithDefault_Valid_ReturnsParsed() {
        Assert.assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    // ---------- createNumber ----------
    @Test
    public void testCreateNumber_Null_ReturnsNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_Blank_ThrowsException() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_HexPrefix0x_ReturnsInteger() {
        Number n = NumberUtils.createNumber("0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_HexPrefixUpper0X_ReturnsInteger() {
        Number n = NumberUtils.createNumber("0X1A");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_NegativeHex_ReturnsInteger() {
        Number n = NumberUtils.createNumber("-0x1A");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_HashHexPrefix_ReturnsInteger() {
        Number n = NumberUtils.createNumber("#1A");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_NegativeHashHexPrefix_ReturnsInteger() {
        Number n = NumberUtils.createNumber("-#1A");
        Assert.assertTrue(n instanceof Integer);
    }

    @Test
    public void testCreateNumber_HexTooLongForInt_ReturnsLong() {
        // 9 hex digits after prefix
        Number n = NumberUtils.createNumber("0x123456789");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_HexTooLongForLong_ReturnsBigInteger() {
        // 17 hex digits after prefix
        Number n = NumberUtils.createNumber("0x12345678901234567");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_PlainInteger_ReturnsInteger() {
        Number n = NumberUtils.createNumber("123");
        Assert.assertTrue(n instanceof Integer);
        Assert.assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_LargeIntegerString_ReturnsLong() {
        Number n = NumberUtils.createNumber("12345678901");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_VeryLargeIntegerString_ReturnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_DecimalString_ReturnsFloat() {
        Number n = NumberUtils.createNumber("1.5");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_DoubleTypeQualifier_ReturnsDouble() {
        Number n = NumberUtils.createNumber("1.5d");
        Assert.assertTrue(n instanceof Double);
    }

    @Test
    public void testCreateNumber_FloatTypeQualifier_ReturnsFloat() {
        Number n = NumberUtils.createNumber("1.5f");
        Assert.assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_LongTypeQualifier_ReturnsLong() {
        Number n = NumberUtils.createNumber("123L");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_LongTypeQualifierNegative_ReturnsLong() {
        Number n = NumberUtils.createNumber("-123L");
        Assert.assertTrue(n instanceof Long);
    }

    @Test
    public void testCreateNumber_LongTypeQualifierTooBig_ReturnsBigInteger() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890L");
        Assert.assertTrue(n instanceof BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_LongTypeQualifierWithDecimal_ThrowsException() {
        NumberUtils.createNumber("1.5L");
    }

    @Test
    public void testCreateNumber_ExponentString_ReturnsFloat() {
        Number n = NumberUtils.createNumber("1.5e10");
        Assert.assertNotNull(n);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidExponentPosition_ThrowsException() {
        NumberUtils.createNumber("1.5e10.5");
    }

    @Test
    public void testCreateNumber_BigDecimalTypeQualifier_ReturnsBigDecimal() {
        Number n = NumberUtils.createNumber("123456789012345678901234567890.12345678901234567890D");
        Assert.assertTrue(n instanceof BigDecimal || n instanceof Double);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidTypeQualifier_ThrowsException() {
        NumberUtils.createNumber("123X");
    }

    @Test
    public void testCreateNumber_ManyDecimalsForFloat_ReturnsDoubleOrBigDecimal() {
        Number n = NumberUtils.createNumber("1.123456789012345");
        Assert.assertNotNull(n);
    }

    @Test
    public void testCreateNumber_VeryPreciseDecimal_ReturnsBigDecimal() {
        Number n = NumberUtils.createNumber("1.12345678901234567890123456789");
        Assert.assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_ZeroFloat_ReturnsFloat() {
        Number n = NumberUtils.createNumber("0.0f");
        Assert.assertTrue(n instanceof Float);
    }

    // ---------- createFloat ----------
    @Test
    public void testCreateFloat_ValidString_ReturnsFloat() {
        Assert.assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 0.0001f);
    }

    @Test
    public void testCreateFloat_Null_ReturnsNull() {
        Assert.assertNull(NumberUtils.createFloat(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_Invalid_ThrowsException() {
        NumberUtils.createFloat("abc");
    }

    // ---------- createDouble ----------
    @Test
    public void testCreateDouble_ValidString_ReturnsDouble() {
        Assert.assertEquals(1.5d, NumberUtils.createDouble("1.5").doubleValue(), 0.0001d);
    }

    @Test
    public void testCreateDouble_Null_ReturnsNull() {
        Assert.assertNull(NumberUtils.createDouble(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_Invalid_ThrowsException() {
        NumberUtils.createDouble("abc");
    }

    // ---------- createInteger ----------
    @Test
    public void testCreateInteger_ValidString_ReturnsInteger() {
        Assert.assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateInteger_Null_ReturnsNull() {
        Assert.assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_HexString_ReturnsInteger() {
        Assert.assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_Invalid_ThrowsException() {
        NumberUtils.createInteger("abc");
    }

    // ---------- createLong ----------
    @Test
    public void testCreateLong_ValidString_ReturnsLong() {
        Assert.assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test
    public void testCreateLong_Null_ReturnsNull() {
        Assert.assertNull(NumberUtils.createLong(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_Invalid_ThrowsException() {
        NumberUtils.createLong("abc");
    }

    // ---------- createBigInteger ----------
    @Test
    public void testCreateBigInteger_ValidString_ReturnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(123), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigInteger_Null_ReturnsNull() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_HexString_ReturnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(26), NumberUtils.createBigInteger("0x1A"));
    }

    @Test
    public void testCreateBigInteger_HashHexString_ReturnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(26), NumberUtils.createBigInteger("#1A"));
    }

    @Test
    public void testCreateBigInteger_OctalString_ReturnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(8), NumberUtils.createBigInteger("010"));
    }

    @Test
    public void testCreateBigInteger_NegativeString_ReturnsBigInteger() {
        Assert.assertEquals(BigInteger.valueOf(-123), NumberUtils.createBigInteger("-123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_Invalid_ThrowsException() {
        NumberUtils.createBigInteger("abc");
    }

    // ---------- createBigDecimal ----------
    @Test
    public void testCreateBigDecimal_ValidString_ReturnsBigDecimal() {
        Assert.assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
    }

    @Test
    public void testCreateBigDecimal_Null_ReturnsNull() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Blank_ThrowsException() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_DoubleMinus_ThrowsException() {
        NumberUtils.createBigDecimal("--123.45");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_Invalid_ThrowsException() {
        NumberUtils.createBigDecimal("abc");
    }

    // ---------- min array ----------
    @Test
    public void testMinLongArray_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1L, NumberUtils.min(new long[] {3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Null_ThrowsException() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArray_Empty_ThrowsException() {
        NumberUtils.min(new long[] {});
    }

    @Test
    public void testMinIntArray_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1, NumberUtils.min(new int[] {3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Null_ThrowsException() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArray_Empty_ThrowsException() {
        NumberUtils.min(new int[] {});
    }

    @Test
    public void testMinShortArray_TypicalValues_ReturnsMin() {
        Assert.assertEquals((short) 1, NumberUtils.min(new short[] {(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Null_ThrowsException() {
        NumberUtils.min((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinShortArray_Empty_ThrowsException() {
        NumberUtils.min(new short[] {});
    }

    @Test
    public void testMinByteArray_TypicalValues_ReturnsMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min(new byte[] {(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Null_ThrowsException() {
        NumberUtils.min((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinByteArray_Empty_ThrowsException() {
        NumberUtils.min(new byte[] {});
    }

    @Test
    public void testMinDoubleArray_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1.0d, NumberUtils.min(new double[] {3.0, 1.0, 2.0}), 0.0001);
    }

    @Test
    public void testMinDoubleArray_ContainsNaN_ReturnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.min(new double[] {1.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Null_ThrowsException() {
        NumberUtils.min((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinDoubleArray_Empty_ThrowsException() {
        NumberUtils.min(new double[] {});
    }

    @Test
    public void testMinFloatArray_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1.0f, NumberUtils.min(new float[] {3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMinFloatArray_ContainsNaN_ReturnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.min(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Null_ThrowsException() {
        NumberUtils.min((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloatArray_Empty_ThrowsException() {
        NumberUtils.min(new float[] {});
    }

    // ---------- max array ----------
    @Test
    public void testMaxLongArray_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3L, NumberUtils.max(new long[] {3L, 1L, 2L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Null_ThrowsException() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLongArray_Empty_ThrowsException() {
        NumberUtils.max(new long[] {});
    }

    @Test
    public void testMaxIntArray_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3, NumberUtils.max(new int[] {3, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Null_ThrowsException() {
        NumberUtils.max((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxIntArray_Empty_ThrowsException() {
        NumberUtils.max(new int[] {});
    }

    @Test
    public void testMaxShortArray_TypicalValues_ReturnsMax() {
        Assert.assertEquals((short) 3, NumberUtils.max(new short[] {(short) 3, (short) 1, (short) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Null_ThrowsException() {
        NumberUtils.max((short[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShortArray_Empty_ThrowsException() {
        NumberUtils.max(new short[] {});
    }

    @Test
    public void testMaxByteArray_TypicalValues_ReturnsMax() {
        Assert.assertEquals((byte) 3, NumberUtils.max(new byte[] {(byte) 3, (byte) 1, (byte) 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Null_ThrowsException() {
        NumberUtils.max((byte[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByteArray_Empty_ThrowsException() {
        NumberUtils.max(new byte[] {});
    }

    @Test
    public void testMaxDoubleArray_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3.0d, NumberUtils.max(new double[] {3.0, 1.0, 2.0}), 0.0001);
    }

    @Test
    public void testMaxDoubleArray_ContainsNaN_ReturnsNaN() {
        Assert.assertTrue(Double.isNaN(NumberUtils.max(new double[] {1.0, Double.NaN, 2.0})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Null_ThrowsException() {
        NumberUtils.max((double[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDoubleArray_Empty_ThrowsException() {
        NumberUtils.max(new double[] {});
    }

    @Test
    public void testMaxFloatArray_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3.0f, NumberUtils.max(new float[] {3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMaxFloatArray_ContainsNaN_ReturnsNaN() {
        Assert.assertTrue(Float.isNaN(NumberUtils.max(new float[] {1.0f, Float.NaN, 2.0f})));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Null_ThrowsException() {
        NumberUtils.max((float[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloatArray_Empty_ThrowsException() {
        NumberUtils.max(new float[] {});
    }

    // ---------- 3-param min ----------
    @Test
    public void testMinThreeLong_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
    }

    @Test
    public void testMinThreeLong_AllEqual_ReturnsSameValue() {
        Assert.assertEquals(5L, NumberUtils.min(5L, 5L, 5L));
    }

    @Test
    public void testMinThreeInt_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1, NumberUtils.min(3, 1, 2));
    }

    @Test
    public void testMinThreeShort_TypicalValues_ReturnsMin() {
        Assert.assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
    }

    @Test
    public void testMinThreeByte_TypicalValues_ReturnsMin() {
        Assert.assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
    }

    @Test
    public void testMinThreeDouble_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1.0d, NumberUtils.min(3.0, 1.0, 2.0), 0.0001);
    }

    @Test
    public void testMinThreeFloat_TypicalValues_ReturnsMin() {
        Assert.assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0001f);
    }

    // ---------- 3-param max ----------
    @Test
    public void testMaxThreeLong_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3L, NumberUtils.max(1L, 3L, 2L));
    }

    @Test
    public void testMaxThreeLong_AllEqual_ReturnsSameValue() {
        Assert.assertEquals(5L, NumberUtils.max(5L, 5L, 5L));
    }

    @Test
    public void testMaxThreeInt_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3, NumberUtils.max(1, 3, 2));
    }

    @Test
    public void testMaxThreeShort_TypicalValues_ReturnsMax() {
        Assert.assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));
    }

    @Test
    public void testMaxThreeByte_TypicalValues_ReturnsMax() {
        Assert.assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));
    }

    @Test
    public void testMaxThreeDouble_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3.0d, NumberUtils.max(1.0, 3.0, 2.0), 0.0001);
    }

    @Test
    public void testMaxThreeFloat_TypicalValues_ReturnsMax() {
        Assert.assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0001f);
    }

    // ---------- isDigits ----------
    @Test
    public void testIsDigits_AllDigits_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_Null_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_Empty_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_ContainsLetter_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("123a"));
    }

    @Test
    public void testIsDigits_ContainsDecimal_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("12.3"));
    }

    // ---------- isNumber ----------
    @Test
    public void testIsNumber_PlainInteger_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_Null_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_Empty_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_NegativeInteger_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_Decimal_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_HexNumber_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_HexOnlyPrefix_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_InvalidHexDigits_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("0xGG"));
    }

    @Test
    public void testIsNumber_ExponentNumber_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5e10"));
    }

    @Test
    public void testIsNumber_ExponentWithSign_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("1.5e-10"));
    }

    @Test
    public void testIsNumber_DoubleDecimalPoint_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_DoubleExponent_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1e2e3"));
    }

    @Test
    public void testIsNumber_ExponentWithoutDigit_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("e10"));
    }

    @Test
    public void testIsNumber_SignWithoutAllowSigns_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_TrailingLetter_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123abc"));
    }

    @Test
    public void testIsNumber_FloatTypeQualifier_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45f"));
    }

    @Test
    public void testIsNumber_DoubleTypeQualifier_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123.45d"));
    }

    @Test
    public void testIsNumber_LongTypeQualifier_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_LongTypeQualifierWithDecimal_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123.45L"));
    }

    @Test
    public void testIsNumber_TrailingDecimalPoint_ReturnsTrue() {
        Assert.assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_OnlyDecimalPoint_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_ExponentEndingLetter_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123E"));
    }

    @Test
    public void testIsNumber_TypeQualifierWithoutDigit_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("-L"));
    }

    @Test
    public void testIsNumber_IllegalLastChar_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("123x"));
    }

    @Test
    public void testIsNumber_EndsWithExponentSignNoDigit_ReturnsFalse() {
        Assert.assertFalse(NumberUtils.isNumber("1e-"));
    }

    // ---------- constants ----------
    @Test
    public void testConstants_ValuesAreCorrect() {
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
        Assert.assertEquals(0.0d, NumberUtils.DOUBLE_ZERO.doubleValue(), 0.0001);
        Assert.assertEquals(1.0d, NumberUtils.DOUBLE_ONE.doubleValue(), 0.0001);
        Assert.assertEquals(-1.0d, NumberUtils.DOUBLE_MINUS_ONE.doubleValue(), 0.0001);
        Assert.assertEquals(0.0f, NumberUtils.FLOAT_ZERO.floatValue(), 0.0001f);
        Assert.assertEquals(1.0f, NumberUtils.FLOAT_ONE.floatValue(), 0.0001f);
        Assert.assertEquals(-1.0f, NumberUtils.FLOAT_MINUS_ONE.floatValue(), 0.0001f);
    }

    // ---------- constructor ----------
    @Test
    public void testConstructor_CreatesInstance() {
        NumberUtils instance = new NumberUtils();
        Assert.assertNotNull(instance);
    }
}
