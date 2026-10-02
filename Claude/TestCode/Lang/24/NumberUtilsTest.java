import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtilsTest {

    // ---------- Constructor ----------
    @Test
    public void testConstructor_instanceCreated() {
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
    public void testToIntWithDefault_null_returnsDefault() {
        assertEquals(1, NumberUtils.toInt(null, 1));
    }

    @Test
    public void testToIntWithDefault_invalid_returnsDefault() {
        assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void testToIntWithDefault_valid_returnsParsed() {
        assertEquals(1, NumberUtils.toInt("1", 0));
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
    public void testToFloatWithDefault_null_returnsDefault() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0001f);
    }

    @Test
    public void testToFloatWithDefault_invalid_returnsDefault() {
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0001f);
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
    public void testToByteWithDefault_null_returnsDefault() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByteWithDefault_invalid_returnsDefault() {
        assertEquals((byte) 1, NumberUtils.toByte("abc", (byte) 1));
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
    public void testToShortWithDefault_null_returnsDefault() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShortWithDefault_invalid_returnsDefault() {
        assertEquals((short) 1, NumberUtils.toShort("abc", (short) 1));
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
        NumberUtils.createNumber("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_emptyString_throwsException() {
        NumberUtils.createNumber("");
    }

    @Test
    public void testCreateNumber_doubleMinus_returnsNull() {
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hex_returnsInteger() {
        Number n = NumberUtils.createNumber("0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(26, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeHex_returnsInteger() {
        Number n = NumberUtils.createNumber("-0x1A");
        assertTrue(n instanceof Integer);
        assertEquals(-26, n.intValue());
    }

    @Test
    public void testCreateNumber_plainInt_returnsInteger() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_tooBigForInt_returnsLong() {
        Number n = NumberUtils.createNumber("2147483648");
        assertTrue(n instanceof Long);
        assertEquals(2147483648L, n.longValue());
    }

    @Test
    public void testCreateNumber_tooBigForLong_returnsBigInteger() {
        Number n = NumberUtils.createNumber("12345678901234567890");
        assertTrue(n instanceof BigInteger);
    }

    @Test
    public void testCreateNumber_decimalNoTypeChar_returnsFloat() {
        Number n = NumberUtils.createNumber("123.45");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_decimalWithExponent_returnsFloat() {
        Number n = NumberUtils.createNumber("123.45e10");
        assertNotNull(n);
    }

    @Test
    public void testCreateNumber_longTypeChar_returnsLong() {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_floatTypeChar_returnsFloat() {
        Number n = NumberUtils.createNumber("123.45F");
        assertTrue(n instanceof Float);
    }

    @Test
    public void testCreateNumber_doubleTypeChar_returnsDouble() {
        Number n = NumberUtils.createNumber("123.45D");
        assertTrue(n instanceof Double);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidString_throwsException() {
        NumberUtils.createNumber("NotANumber");
    }

    @Test
    public void testCreateNumber_bigDecimalTypeChar_returnsBigDecimal() {
        Number n = NumberUtils.createNumber("123.45D");
        assertNotNull(n);
    }

    // ---------- createFloat ----------
    @Test
    public void testCreateFloat_null_returnsNull() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_validString_returnsFloat() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 0.0001f);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalidString_throwsException() {
        NumberUtils.createFloat("abc");
    }

    // ---------- createDouble ----------
    @Test
    public void testCreateDouble_null_returnsNull() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_validString_returnsDouble() {
        assertEquals(1.5d, NumberUtils.createDouble("1.5").doubleValue(), 0.0001d);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalidString_throwsException() {
        NumberUtils.createDouble("abc");
    }

    // ---------- createInteger ----------
    @Test
    public void testCreateInteger_null_returnsNull() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_validString_returnsInteger() {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
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
    public void testCreateLong_null_returnsNull() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_validString_returnsLong() {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalidString_throwsException() {
        NumberUtils.createLong("abc");
    }

    // ---------- createBigInteger ----------
    @Test
    public void testCreateBigInteger_null_returnsNull() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_validString_returnsBigInteger() {
        assertEquals(BigInteger.valueOf(123L), NumberUtils.createBigInteger("123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalidString_throwsException() {
        NumberUtils.createBigInteger("abc");
    }

    // ---------- createBigDecimal ----------
    @Test
    public void testCreateBigDecimal_null_returnsNull() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimal_validString_returnsBigDecimal() {
        assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blankString_throwsException() {
        NumberUtils.createBigDecimal("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalidString_throwsException() {
        NumberUtils.createBigDecimal("abc");
    }

    // ---------- min(long[]) ----------
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

    // ---------- min(int[]) ----------
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

    // ---------- min(short[]) ----------
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

    // ---------- min(byte[]) ----------
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

    // ---------- min(double[]) ----------
    @Test
    public void testMinDoubleArray_normal_returnsMin() {
        assertEquals(1.0d, NumberUtils.min(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
    }

    @Test
    public void testMinDoubleArray_withNaN_returnsNaN() {
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

    // ---------- min(float[]) ----------
    @Test
    public void testMinFloatArray_normal_returnsMin() {
        assertEquals(1.0f, NumberUtils.min(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMinFloatArray_withNaN_returnsNaN() {
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

    // ---------- max(long[]) ----------
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

    // ---------- max(int[]) ----------
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

    // ---------- max(short[]) ----------
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

    // ---------- max(byte[]) ----------
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

    // ---------- max(double[]) ----------
    @Test
    public void testMaxDoubleArray_normal_returnsMax() {
        assertEquals(3.0d, NumberUtils.max(new double[]{3.0d, 1.0d, 2.0d}), 0.0001d);
    }

    @Test
    public void testMaxDoubleArray_withNaN_returnsNaN() {
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

    // ---------- max(float[]) ----------
    @Test
    public void testMaxFloatArray_normal_returnsMax() {
        assertEquals(3.0f, NumberUtils.max(new float[]{3.0f, 1.0f, 2.0f}), 0.0001f);
    }

    @Test
    public void testMaxFloatArray_withNaN_returnsNaN() {
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

    // ---------- 3 param min ----------
    @Test
    public void testMinLong3_bAndCBothSmaller_returnsSmallest() {
        assertEquals(1L, NumberUtils.min(3L, 2L, 1L));
    }

    @Test
    public void testMinLong3_noneSmaller_returnsA() {
        assertEquals(1L, NumberUtils.min(1L, 2L, 3L));
    }

    @Test
    public void testMinInt3_bAndCBothSmaller_returnsSmallest() {
        assertEquals(1, NumberUtils.min(3, 2, 1));
    }

    @Test
    public void testMinInt3_noneSmaller_returnsA() {
        assertEquals(1, NumberUtils.min(1, 2, 3));
    }

    @Test
    public void testMinShort3_bAndCBothSmaller_returnsSmallest() {
        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMinShort3_noneSmaller_returnsA() {
        assertEquals((short) 1, NumberUtils.min((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMinByte3_bAndCBothSmaller_returnsSmallest() {
        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMinByte3_noneSmaller_returnsA() {
        assertEquals((byte) 1, NumberUtils.min((byte) 1, (byte) 2, (byte) 3));
    }

    @Test
    public void testMinDouble3_normal_returnsSmallest() {
        assertEquals(1.0d, NumberUtils.min(3.0d, 2.0d, 1.0d), 0.0001d);
    }

    @Test
    public void testMinFloat3_normal_returnsSmallest() {
        assertEquals(1.0f, NumberUtils.min(3.0f, 2.0f, 1.0f), 0.0001f);
    }

    // ---------- 3 param max ----------
    @Test
    public void testMaxLong3_bAndCBothLarger_returnsLargest() {
        assertEquals(3L, NumberUtils.max(1L, 2L, 3L));
    }

    @Test
    public void testMaxLong3_noneLarger_returnsA() {
        assertEquals(3L, NumberUtils.max(3L, 2L, 1L));
    }

    @Test
    public void testMaxInt3_bAndCBothLarger_returnsLargest() {
        assertEquals(3, NumberUtils.max(1, 2, 3));
    }

    @Test
    public void testMaxInt3_noneLarger_returnsA() {
        assertEquals(3, NumberUtils.max(3, 2, 1));
    }

    @Test
    public void testMaxShort3_bAndCBothLarger_returnsLargest() {
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 2, (short) 3));
    }

    @Test
    public void testMaxShort3_noneLarger_returnsA() {
        assertEquals((short) 3, NumberUtils.max((short) 3, (short) 2, (short) 1));
    }

    @Test
    public void testMaxByte3_bAndCBothLarger_returnsLargest() {
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 2, (byte) 3));
    }

    @Test
    public void testMaxByte3_noneLarger_returnsA() {
        assertEquals((byte) 3, NumberUtils.max((byte) 3, (byte) 2, (byte) 1));
    }

    @Test
    public void testMaxDouble3_normal_returnsLargest() {
        assertEquals(3.0d, NumberUtils.max(1.0d, 2.0d, 3.0d), 0.0001d);
    }

    @Test
    public void testMaxFloat3_normal_returnsLargest() {
        assertEquals(3.0f, NumberUtils.max(1.0f, 2.0f, 3.0f), 0.0001f);
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
    public void testIsDigits_withLetters_returnsFalse() {
        assertFalse(NumberUtils.isDigits("12a45"));
    }

    @Test
    public void testIsDigits_negativeNumber_returnsFalse() {
        assertFalse(NumberUtils.isDigits("-123"));
    }

    // ---------- isNumber ----------
    @Test
    public void testIsNumber_null_returnsFalse() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_emptyString_returnsFalse() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_plainInteger_returnsTrue() {
        assertTrue(NumberUtils.isNumber("12345"));
    }

    @Test
    public void testIsNumber_negativeInteger_returnsTrue() {
        assertTrue(NumberUtils.isNumber("-12345"));
    }

    @Test
    public void testIsNumber_decimal_returnsTrue() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_hexValid_returnsTrue() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumber_hexOnlyPrefix_returnsFalse() {
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_hexInvalidChar_returnsFalse() {
        assertFalse(NumberUtils.isNumber("0xZZ"));
    }

    @Test
    public void testIsNumber_scientificNotation_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1.5e10"));
    }

    @Test
    public void testIsNumber_scientificNotationNegativeExp_returnsTrue() {
        assertTrue(NumberUtils.isNumber("1.5E-10"));
    }

    @Test
    public void testIsNumber_longTypeQualifier_returnsTrue() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_longTypeQualifierWithDecimal_returnsFalse() {
        assertFalse(NumberUtils.isNumber("123.45L"));
    }

    @Test
    public void testIsNumber_floatTypeQualifier_returnsTrue() {
        assertTrue(NumberUtils.isNumber("123.45F"));
    }

    @Test
    public void testIsNumber_doubleTypeQualifier_returnsTrue() {
        assertTrue(NumberUtils.isNumber("123.45D"));
    }

    @Test
    public void testIsNumber_twoDecimalPoints_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumber_twoExponents_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1e2e3"));
    }

    @Test
    public void testIsNumber_trailingExponentOnly_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1E"));
    }

    @Test
    public void testIsNumber_invalidCharacter_returnsFalse() {
        assertFalse(NumberUtils.isNumber("abc"));
    }

    @Test
    public void testIsNumber_signNotAllowed_returnsFalse() {
        assertFalse(NumberUtils.isNumber("1+2"));
    }

    @Test
    public void testIsNumber_trailingDecimalPoint_returnsTrue() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    // ---------- Constants sanity check ----------
    @Test
    public void testConstants_haveExpectedValues() {
        assertEquals(0L, NumberUtils.LONG_ZERO.longValue());
        assertEquals(1L, NumberUtils.LONG_ONE.longValue());
        assertEquals(-1L, NumberUtils.LONG_MINUS_ONE.longValue());
        assertEquals(0, NumberUtils.INTEGER_ZERO.intValue());
        assertEquals(1, NumberUtils.INTEGER_ONE.intValue());
        assertEquals(-1, NumberUtils.INTEGER_MINUS_ONE.intValue());
        assertEquals((short) 0, NumberUtils.SHORT_ZERO.shortValue());
        assertEquals((short) 1, NumberUtils.SHORT_ONE.shortValue());
        assertEquals((short) -1, NumberUtils.SHORT_MINUS_ONE.shortValue());
        assertEquals((byte) 0, NumberUtils.BYTE_ZERO.byteValue());
        assertEquals((byte) 1, NumberUtils.BYTE_ONE.byteValue());
        assertEquals((byte) -1, NumberUtils.BYTE_MINUS_ONE.byteValue());
        assertEquals(0.0d, NumberUtils.DOUBLE_ZERO.doubleValue(), 0.0001d);
        assertEquals(1.0d, NumberUtils.DOUBLE_ONE.doubleValue(), 0.0001d);
        assertEquals(-1.0d, NumberUtils.DOUBLE_MINUS_ONE.doubleValue(), 0.0001d);
        assertEquals(0.0f, NumberUtils.FLOAT_ZERO.floatValue(), 0.0001f);
        assertEquals(1.0f, NumberUtils.FLOAT_ONE.floatValue(), 0.0001f);
        assertEquals(-1.0f, NumberUtils.FLOAT_MINUS_ONE.floatValue(), 0.0001f);
    }
}
