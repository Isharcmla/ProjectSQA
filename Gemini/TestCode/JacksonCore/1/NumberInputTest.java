package com.fasterxml.jackson.core.io;

import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class NumberInputTest {

    @Test
    public void testConstructor() {
        NumberInput instance = new NumberInput();
        assertNotNull(instance);
    }

    @Test
    public void testParseInt_charArray_allLengths() {
        char[] chars = "0123456789".toCharArray();
        assertEquals(0, NumberInput.parseInt(chars, 0, 1));
        assertEquals(1, NumberInput.parseInt(chars, 1, 1));
        assertEquals(12, NumberInput.parseInt(chars, 1, 2));
        assertEquals(123, NumberInput.parseInt(chars, 1, 3));
        assertEquals(1234, NumberInput.parseInt(chars, 1, 4));
        assertEquals(12345, NumberInput.parseInt(chars, 1, 5));
        assertEquals(123456, NumberInput.parseInt(chars, 1, 6));
        assertEquals(1234567, NumberInput.parseInt(chars, 1, 7));
        assertEquals(12345678, NumberInput.parseInt(chars, 1, 8));
        assertEquals(123456789, NumberInput.parseInt(chars, 1, 9));
    }

    @Test
    public void testParseInt_String_validPositiveAndNegative() {
        assertEquals(0, NumberInput.parseInt("0"));
        assertEquals(5, NumberInput.parseInt("5"));
        assertEquals(42, NumberInput.parseInt("42"));
        assertEquals(123, NumberInput.parseInt("123"));
        assertEquals(1234, NumberInput.parseInt("1234"));
        assertEquals(123456789, NumberInput.parseInt("123456789"));

        assertEquals(-1, NumberInput.parseInt("-1"));
        assertEquals(-42, NumberInput.parseInt("-42"));
        assertEquals(-123, NumberInput.parseInt("-123"));
        assertEquals(-1234, NumberInput.parseInt("-1234"));
        assertEquals(-123456789, NumberInput.parseInt("-123456789"));
    }

    @Test
    public void testParseInt_String_fallbackToJdk() {
        assertEquals(1000000000, NumberInput.parseInt("1000000000"));
        assertEquals(-1000000000, NumberInput.parseInt("-1000000000"));
        assertEquals(2147483647, NumberInput.parseInt("2147483647"));
        assertEquals(-2147483648, NumberInput.parseInt("-2147483648"));
        assertEquals(123, NumberInput.parseInt("+123"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseInt_String_onlyMinusSign_throwsException() {
        NumberInput.parseInt("-");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseInt_String_invalidLeadingChar_throwsException() {
        NumberInput.parseInt("a");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseInt_String_invalidSecondChar_throwsException() {
        NumberInput.parseInt("1a");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseInt_String_invalidThirdChar_throwsException() {
        NumberInput.parseInt("12a");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseInt_String_invalidFourthChar_throwsException() {
        NumberInput.parseInt("123a");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseInt_String_invalidCharsNegative_throwsException() {
        NumberInput.parseInt("-1a");
    }

    @Test
    public void testParseLong_charArray() {
        char[] chars = "123456789012345678".toCharArray();
        assertEquals(1234567890L, NumberInput.parseLong(chars, 0, 10));
        assertEquals(123456789012345678L, NumberInput.parseLong(chars, 0, 18));
    }

    @Test
    public void testParseLong_String() {
        assertEquals(0L, NumberInput.parseLong("0"));
        assertEquals(123456789L, NumberInput.parseLong("123456789"));
        assertEquals(-123456789L, NumberInput.parseLong("-123456789"));
        assertEquals(1234567890L, NumberInput.parseLong("1234567890"));
        assertEquals(Long.MAX_VALUE, NumberInput.parseLong(String.valueOf(Long.MAX_VALUE)));
        assertEquals(Long.MIN_VALUE, NumberInput.parseLong(String.valueOf(Long.MIN_VALUE)));
    }

    @Test
    public void testInLongRange_charArray() {
        String maxLong = String.valueOf(Long.MAX_VALUE);
        String minLongNoSign = String.valueOf(Long.MIN_VALUE).substring(1);

        assertTrue(NumberInput.inLongRange("123".toCharArray(), 0, 3, false));
        assertFalse(NumberInput.inLongRange("12345678901234567890".toCharArray(), 0, 20, false));

        assertTrue(NumberInput.inLongRange(maxLong.toCharArray(), 0, maxLong.length(), false));
        assertTrue(NumberInput.inLongRange(minLongNoSign.toCharArray(), 0, minLongNoSign.length(), true));

        char[] aboveMax = maxLong.toCharArray();
        aboveMax[aboveMax.length - 1] = '8';
        assertFalse(NumberInput.inLongRange(aboveMax, 0, aboveMax.length, false));

        char[] belowMax = maxLong.toCharArray();
        belowMax[0] = '8';
        assertTrue(NumberInput.inLongRange(belowMax, 0, belowMax.length, false));
    }

    @Test
    public void testInLongRange_String() {
        String maxLong = String.valueOf(Long.MAX_VALUE);
        String minLongNoSign = String.valueOf(Long.MIN_VALUE).substring(1);

        assertTrue(NumberInput.inLongRange("123", false));
        assertFalse(NumberInput.inLongRange("12345678901234567890", false));

        assertTrue(NumberInput.inLongRange(maxLong, false));
        assertTrue(NumberInput.inLongRange(minLongNoSign, true));

        String aboveMax = maxLong.substring(0, maxLong.length() - 1) + "8";
        assertFalse(NumberInput.inLongRange(aboveMax, false));

        String belowMax = "8" + maxLong.substring(1);
        assertTrue(NumberInput.inLongRange(belowMax, false));

        String aboveMin = minLongNoSign.substring(0, minLongNoSign.length() - 1) + "9";
        assertFalse(NumberInput.inLongRange(aboveMin, true));
    }

    @Test
    public void testParseAsInt() {
        assertEquals(99, NumberInput.parseAsInt(null, 99));
        assertEquals(99, NumberInput.parseAsInt("", 99));
        assertEquals(99, NumberInput.parseAsInt("   ", 99));

        assertEquals(123, NumberInput.parseAsInt("123", 0));
        assertEquals(123, NumberInput.parseAsInt("+123", 0));
        assertEquals(-123, NumberInput.parseAsInt("-123", 0));

        assertEquals(123, NumberInput.parseAsInt("123.45", 0));
        assertEquals(-123, NumberInput.parseAsInt("-123.45", 0));
        assertEquals(99, NumberInput.parseAsInt("not_a_number", 99));

        assertEquals(99, NumberInput.parseAsInt("99999999999999999999", 99));
        assertEquals(99, NumberInput.parseAsInt("+", 99));
        assertEquals(99, NumberInput.parseAsInt("-", 99));
    }

    @Test
    public void testParseAsLong() {
        assertEquals(99L, NumberInput.parseAsLong(null, 99L));
        assertEquals(99L, NumberInput.parseAsLong("", 99L));
        assertEquals(99L, NumberInput.parseAsLong("   ", 99L));

        assertEquals(1234567890123L, NumberInput.parseAsLong("1234567890123", 0L));
        assertEquals(1234567890123L, NumberInput.parseAsLong("+1234567890123", 0L));
        assertEquals(-1234567890123L, NumberInput.parseAsLong("-1234567890123", 0L));

        assertEquals(123L, NumberInput.parseAsLong("123.45", 0L));
        assertEquals(-123L, NumberInput.parseAsLong("-123.45", 0L));
        assertEquals(99L, NumberInput.parseAsLong("not_a_number", 99L));

        assertEquals(99L, NumberInput.parseAsLong("999999999999999999999999999999", 99L));
        assertEquals(99L, NumberInput.parseAsLong("+", 99L));
        assertEquals(99L, NumberInput.parseAsLong("-", 99L));
    }

    @Test
    public void testParseAsDouble() {
        assertEquals(99.0, NumberInput.parseAsDouble(null, 99.0), 0.0);
        assertEquals(99.0, NumberInput.parseAsDouble("", 99.0), 0.0);
        assertEquals(99.0, NumberInput.parseAsDouble("   ", 99.0), 0.0);

        assertEquals(123.45, NumberInput.parseAsDouble("123.45", 0.0), 0.0);
        assertEquals(-123.45, NumberInput.parseAsDouble("-123.45", 0.0), 0.0);
        assertEquals(99.0, NumberInput.parseAsDouble("not_a_number", 99.0), 0.0);
    }

    @Test
    public void testParseDouble() {
        assertEquals(Double.MIN_VALUE, NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 0.0);
        assertEquals(123.456, NumberInput.parseDouble("123.456"), 0.0);
        assertEquals(-0.5, NumberInput.parseDouble("-0.5"), 0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseDouble_invalidString_throwsException() {
        NumberInput.parseDouble("invalid");
    }

    @Test
    public void testParseBigDecimal_String() {
        BigDecimal expected = new BigDecimal("12345.67890");
        assertEquals(expected, NumberInput.parseBigDecimal("12345.67890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimal_String_invalid_throwsException() {
        NumberInput.parseBigDecimal("invalid");
    }

    @Test
    public void testParseBigDecimal_charArray() {
        char[] chars = "12345.67890".toCharArray();
        BigDecimal expected = new BigDecimal("12345.67890");
        assertEquals(expected, NumberInput.parseBigDecimal(chars));
    }

    @Test
    public void testParseBigDecimal_charArrayWithOffsetAndLen() {
        char[] chars = "prefix12345.67890suffix".toCharArray();
        BigDecimal expected = new BigDecimal("12345.67890");
        assertEquals(expected, NumberInput.parseBigDecimal(chars, 6, 11));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimal_charArray_invalid_throwsException() {
        char[] chars = "invalid".toCharArray();
        NumberInput.parseBigDecimal(chars);
    }
}
