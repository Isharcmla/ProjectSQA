package org.apache.commons.lang;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new NumberUtils());
    }

    @Test
    public void testStringToInt_defaultZero() {
        assertEquals(0, NumberUtils.stringToInt(null));
        assertEquals(0, NumberUtils.stringToInt(""));
        assertEquals(0, NumberUtils.stringToInt("abc"));
        assertEquals(123, NumberUtils.stringToInt("123"));
        assertEquals(-123, NumberUtils.stringToInt("-123"));
    }

    @Test
    public void testStringToInt_customDefault() {
        assertEquals(10, NumberUtils.stringToInt(null, 10));
        assertEquals(10, NumberUtils.stringToInt("", 10));
        assertEquals(10, NumberUtils.stringToInt("invalid", 10));
        assertEquals(42, NumberUtils.stringToInt("42", 10));
        assertEquals(-42, NumberUtils.stringToInt("-42", 10));
    }

    @Test
    public void testCreateFloat() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createFloat("1.23"));
        assertEquals(Float.valueOf(-1.23f), NumberUtils.createFloat("-1.23"));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFloat_null() {
        NumberUtils.createFloat(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("invalid");
    }

    @Test
    public void testCreateDouble() {
        assertEquals(Double.valueOf(1.2345d), NumberUtils.createDouble("1.2345"));
        assertEquals(Double.valueOf(-1.2345d), NumberUtils.createDouble("-1.2345"));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateDouble_null() {
        NumberUtils.createDouble(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("invalid");
    }

    @Test
    public void testCreateInteger() {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createInteger("-123"));
        assertEquals(Integer.valueOf(0x12), NumberUtils.createInteger("0x12"));
        assertEquals(Integer.valueOf(-0x12), NumberUtils.createInteger("-0x12"));
        assertEquals(Integer.valueOf(077), NumberUtils.createInteger("077"));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateInteger_null() {
        NumberUtils.createInteger(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("invalid");
    }

    @Test
    public void testCreateLong() {
        assertEquals(Long.valueOf(1234567890123L), NumberUtils.createLong("1234567890123"));
        assertEquals(Long.valueOf(-1234567890123L), NumberUtils.createLong("-1234567890123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_null() {
        NumberUtils.createLong(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("invalid");
    }

    @Test
    public void testCreateBigInteger() {
        assertEquals(new BigInteger("123456789012345678901234567890"), NumberUtils.createBigInteger("123456789012345678901234567890"));
        assertEquals(new BigInteger("-123456789012345678901234567890"), NumberUtils.createBigInteger("-123456789012345678901234567890"));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateBigInteger_null() {
        NumberUtils.createBigInteger(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("invalid");
    }

    @Test
    public void testCreateBigDecimal() {
        assertEquals(new BigDecimal("12345678901234567890.123456789"), NumberUtils.createBigDecimal("12345678901234567890.123456789"));
        assertEquals(new BigDecimal("-12345678901234567890.123456789"), NumberUtils.createBigDecimal("-12345678901234567890.123456789"));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateBigDecimal_null() {
        NumberUtils.createBigDecimal(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("invalid");
    }

    @Test
    public void testCreateNumber_nullAndEmptyAndLeadingDashes() {
        assertNull(NumberUtils.createNumber(null));
        assertNull(NumberUtils.createNumber("--123"));
        assertNull(NumberUtils.createNumber("--"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_emptyString() {
        NumberUtils.createNumber("");
    }

    @Test
    public void testCreateNumber_hex() {
        assertEquals(Integer.valueOf(16), NumberUtils.createNumber("0x10"));
        assertEquals(Integer.valueOf(-16), NumberUtils.createNumber("-0x10"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_exponentBeforeDecimal() {
        NumberUtils.createNumber("1e2.3");
    }

    @Test
    public void testCreateNumber_typeQualifierLong() {
        assertEquals(Long.valueOf(12345L), NumberUtils.createNumber("12345l"));
        assertEquals(Long.valueOf(12345L), NumberUtils.createNumber("12345L"));
        assertEquals(Long.valueOf(-12345L), NumberUtils.createNumber("-12345L"));
        assertEquals(new BigInteger("99999999999999999999999999999999"), NumberUtils.createNumber("99999999999999999999999999999999L"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_typeQualifierLongWithDecimal() {
        NumberUtils.createNumber("1.2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_typeQualifierLongWithExponent() {
        NumberUtils.createNumber("1e2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_typeQualifierLongNonDigits() {
        NumberUtils.createNumber("-L");
    }

    @Test
    public void testCreateNumber_typeQualifierFloat() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23F"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0f"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("00.000e00f"));
        assertEquals(Double.valueOf("1.17549435e-38"), NumberUtils.createNumber("1.17549435e-38f"));
        assertEquals(new BigDecimal("1.7976931348623157e+3081"), NumberUtils.createNumber("1.7976931348623157e+3081f"));
    }

    @Test
    public void testCreateNumber_typeQualifierDouble() {
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23D"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createNumber("0.0d"));
        assertEquals(new BigDecimal("1.7976931348623157e+3081"), NumberUtils.createNumber("1.7976931348623157e+3081d"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_invalidTypeQualifier() {
        NumberUtils.createNumber("123a");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_badQualifierFallback() {
        NumberUtils.createNumber("blahf");
    }

    @Test
    public void testCreateNumber_noQualifierIntegers() {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testCreateNumber_noQualifierFloatingPoint() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("0.0"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createNumber("00.00e0"));
        assertEquals(Double.valueOf(1.23456789012345d), NumberUtils.createNumber("1.23456789012345"));
        assertEquals(Double.valueOf("1.17549435e-38"), NumberUtils.createNumber("1.17549435e-38"));
        assertEquals(new BigDecimal("1.7976931348623157e+3081"), NumberUtils.createNumber("1.7976931348623157e+3081"));
        assertEquals(new BigDecimal("123.456789012345678901234567890"), NumberUtils.createNumber("123.456789012345678901234567890"));
        assertEquals(Float.valueOf(1.2e3f), NumberUtils.createNumber("1.2e3"));
        assertEquals(Float.valueOf(1e3f), NumberUtils.createNumber("1e3"));
        assertEquals(Float.valueOf(1E3f), NumberUtils.createNumber("1E3"));
    }

    @Test
    public void testMinimum_long() {
        assertEquals(1L, NumberUtils.minimum(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.minimum(2L, 1L, 3L));
        assertEquals(1L, NumberUtils.minimum(3L, 2L, 1L));
        assertEquals(1L, NumberUtils.minimum(1L, 1L, 1L));
        assertEquals(-5L, NumberUtils.minimum(-1L, -5L, 0L));
    }

    @Test
    public void testMinimum_int() {
        assertEquals(1, NumberUtils.minimum(1, 2, 3));
        assertEquals(1, NumberUtils.minimum(2, 1, 3));
        assertEquals(1, NumberUtils.minimum(3, 2, 1));
        assertEquals(1, NumberUtils.minimum(1, 1, 1));
        assertEquals(-5, NumberUtils.minimum(-1, -5, 0));
    }

    @Test
    public void testMaximum_long() {
        assertEquals(3L, NumberUtils.maximum(3L, 2L, 1L));
        assertEquals(3L, NumberUtils.maximum(1L, 3L, 2L));
        assertEquals(3L, NumberUtils.maximum(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.maximum(3L, 3L, 3L));
        assertEquals(5L, NumberUtils.maximum(-1L, 5L, 0L));
    }

    @Test
    public void testMaximum_int() {
        assertEquals(3, NumberUtils.maximum(3, 2, 1));
        assertEquals(3, NumberUtils.maximum(1, 3, 2));
        assertEquals(3, NumberUtils.maximum(1, 2, 3));
        assertEquals(3, NumberUtils.maximum(3, 3, 3));
        assertEquals(5, NumberUtils.maximum(-1, 5, 0));
    }

    @Test
    public void testCompare_double() {
        assertEquals(-1, NumberUtils.compare(1.0d, 2.0d));
        assertEquals(1, NumberUtils.compare(2.0d, 1.0d));
        assertEquals(0, NumberUtils.compare(1.0d, 1.0d));
        assertEquals(0, NumberUtils.compare(0.0d, 0.0d));
        assertEquals(0, NumberUtils.compare(-0.0d, -0.0d));
        assertEquals(-1, NumberUtils.compare(-0.0d, +0.0d));
        assertEquals(1, NumberUtils.compare(+0.0d, -0.0d));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
        assertEquals(1, NumberUtils.compare(Double.NaN, Double.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.NaN));
        assertEquals(1, NumberUtils.compare(Double.NaN, 0.0d));
        assertEquals(-1, NumberUtils.compare(0.0d, Double.NaN));
    }

    @Test
    public void testCompare_float() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
        assertEquals(0, NumberUtils.compare(0.0f, 0.0f));
        assertEquals(0, NumberUtils.compare(-0.0f, -0.0f));
        assertEquals(-1, NumberUtils.compare(-0.0f, +0.0f));
        assertEquals(1, NumberUtils.compare(+0.0f, -0.0f));
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
        assertEquals(1, NumberUtils.compare(Float.NaN, Float.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Float.POSITIVE_INFINITY, Float.NaN));
        assertEquals(1, NumberUtils.compare(Float.NaN, 0.0f));
        assertEquals(-1, NumberUtils.compare(0.0f, Float.NaN));
    }

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("12a34"));
        assertFalse(NumberUtils.isDigits("-1234"));
        assertFalse(NumberUtils.isDigits("12.34"));
        assertTrue(NumberUtils.isDigits("0"));
        assertTrue(NumberUtils.isDigits("1234567890"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber("   "));
        assertFalse(NumberUtils.isNumber("abc"));

        // Hexadecimal
        assertTrue(NumberUtils.isNumber("0x1234"));
        assertTrue(NumberUtils.isNumber("0X1234"));
        assertTrue(NumberUtils.isNumber("0xabcdef"));
        assertTrue(NumberUtils.isNumber("0xABCDEF"));
        assertTrue(NumberUtils.isNumber("-0x1234"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
        assertFalse(NumberUtils.isNumber("0x12g"));

        // Integers and signs
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("-123"));
        assertFalse(NumberUtils.isNumber("-"));
        assertFalse(NumberUtils.isNumber("+123"));

        // Decimals
        assertTrue(NumberUtils.isNumber("123.45"));
        assertTrue(NumberUtils.isNumber(".45"));
        assertTrue(NumberUtils.isNumber("123."));
        assertTrue(NumberUtils.isNumber("-123.45"));
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("123.45.67"));
        assertFalse(NumberUtils.isNumber("123..45"));

        // Exponents
        assertTrue(NumberUtils.isNumber("1e2"));
        assertTrue(NumberUtils.isNumber("1E2"));
        assertTrue(NumberUtils.isNumber("1e+2"));
        assertTrue(NumberUtils.isNumber("1e-2"));
        assertTrue(NumberUtils.isNumber("-1.2e-3"));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1e+"));
        assertFalse(NumberUtils.isNumber("1e-"));
        assertFalse(NumberUtils.isNumber("e1"));
        assertFalse(NumberUtils.isNumber("1ee2"));
        assertFalse(NumberUtils.isNumber("1e2e3"));
        assertFalse(NumberUtils.isNumber("1.2e3.4"));

        // Type qualifiers
        assertTrue(NumberUtils.isNumber("123f"));
        assertTrue(NumberUtils.isNumber("123F"));
        assertTrue(NumberUtils.isNumber("123.4f"));
        assertTrue(NumberUtils.isNumber("1e2f"));
        assertTrue(NumberUtils.isNumber("123d"));
        assertTrue(NumberUtils.isNumber("123D"));
        assertTrue(NumberUtils.isNumber("123.4d"));
        assertTrue(NumberUtils.isNumber("1e2d"));
        assertTrue(NumberUtils.isNumber("123l"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("-123L"));

        assertFalse(NumberUtils.isNumber("f"));
        assertFalse(NumberUtils.isNumber("d"));
        assertFalse(NumberUtils.isNumber("l"));
        assertFalse(NumberUtils.isNumber("1e+f"));
        assertFalse(NumberUtils.isNumber("1.2L"));
        assertFalse(NumberUtils.isNumber("1e2L"));
        assertFalse(NumberUtils.isNumber("123a"));
        assertFalse(NumberUtils.isNumber("123#"));
    }
}
