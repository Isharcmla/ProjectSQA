import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;

public class NumberInputTest {

    // ---------- parseInt(char[], offset, len) ----------

    @Test
    public void testParseIntCharArray_variousLengths_correctResult() {
        char[] digits = "123456789".toCharArray();
        // exercise every branch depth from len=1 to len=9
        Assert.assertEquals(1, NumberInput.parseInt(digits, 0, 1));
        Assert.assertEquals(12, NumberInput.parseInt(digits, 0, 2));
        Assert.assertEquals(123, NumberInput.parseInt(digits, 0, 3));
        Assert.assertEquals(1234, NumberInput.parseInt(digits, 0, 4));
        Assert.assertEquals(12345, NumberInput.parseInt(digits, 0, 5));
        Assert.assertEquals(123456, NumberInput.parseInt(digits, 0, 6));
        Assert.assertEquals(1234567, NumberInput.parseInt(digits, 0, 7));
        Assert.assertEquals(12345678, NumberInput.parseInt(digits, 0, 8));
        Assert.assertEquals(123456789, NumberInput.parseInt(digits, 0, 9));
    }

    @Test
    public void testParseIntCharArray_withOffset_correctResult() {
        char[] digits = "00123456789".toCharArray();
        Assert.assertEquals(123456789, NumberInput.parseInt(digits, 2, 9));
    }

    @Test
    public void testParseIntCharArray_singleZero_returnsZero() {
        char[] digits = "0".toCharArray();
        Assert.assertEquals(0, NumberInput.parseInt(digits, 0, 1));
    }

    // ---------- parseInt(String) ----------

    @Test
    public void testParseIntString_zero_returnsZero() {
        Assert.assertEquals(0, NumberInput.parseInt("0"));
    }

    @Test
    public void testParseIntString_positiveShort_correctResult() {
        Assert.assertEquals(1, NumberInput.parseInt("1"));
        Assert.assertEquals(12, NumberInput.parseInt("12"));
        Assert.assertEquals(123, NumberInput.parseInt("123"));
        Assert.assertEquals(1234, NumberInput.parseInt("1234"));
        Assert.assertEquals(123456789, NumberInput.parseInt("123456789"));
    }

    @Test
    public void testParseIntString_negativeShort_correctResult() {
        Assert.assertEquals(-1, NumberInput.parseInt("-1"));
        Assert.assertEquals(-123456789, NumberInput.parseInt("-123456789"));
    }

    @Test
    public void testParseIntString_positiveLength10_fitsInInt_correctResult() {
        // length > 9 -> fallback to Integer.parseInt, but still fits
        Assert.assertEquals(2000000000, NumberInput.parseInt("2000000000"));
    }

    @Test
    public void testParseIntString_negativeLength11_fitsInInt_correctResult() {
        // negative, length > 10 -> fallback to Integer.parseInt
        Assert.assertEquals(-1234567890, NumberInput.parseInt("-1234567890"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_onlyMinusSign_throwsException() {
        // negative, length == 1 -> fallback to Integer.parseInt("-") -> throws
        NumberInput.parseInt("-");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_nonDigitCharacter_throwsException() {
        NumberInput.parseInt("12a45");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_nonDigitFirstChar_throwsException() {
        NumberInput.parseInt("a2345");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_nonDigitSecondChar_throwsException() {
        NumberInput.parseInt("1a345");
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntString_nonDigitThirdChar_throwsException() {
        NumberInput.parseInt("12a45");
    }

    // ---------- parseLong(char[], offset, len) ----------

    @Test
    public void testParseLongCharArray_length10_correctResult() {
        char[] digits = "1234567890".toCharArray();
        Assert.assertEquals(1234567890L, NumberInput.parseLong(digits, 0, 10));
    }

    @Test
    public void testParseLongCharArray_length18_correctResult() {
        char[] digits = "123456789012345678".toCharArray();
        Assert.assertEquals(123456789012345678L, NumberInput.parseLong(digits, 0, 18));
    }

    @Test
    public void testParseLongCharArray_withOffset_correctResult() {
        char[] digits = "001234567890".toCharArray();
        Assert.assertEquals(1234567890L, NumberInput.parseLong(digits, 2, 10));
    }

    // ---------- parseLong(String) ----------

    @Test
    public void testParseLongString_shortLength_usesParseInt() {
        Assert.assertEquals(123456789L, NumberInput.parseLong("123456789"));
    }

    @Test
    public void testParseLongString_longLength_usesLongParseLong() {
        Assert.assertEquals(1234567890123L, NumberInput.parseLong("1234567890123"));
    }

    @Test
    public void testParseLongString_negativeShort_correctResult() {
        Assert.assertEquals(-123L, NumberInput.parseLong("-123"));
    }

    @Test
    public void testParseLongString_negativeLong_correctResult() {
        Assert.assertEquals(-1234567890123L, NumberInput.parseLong("-1234567890123"));
    }

    // ---------- inLongRange(char[], offset, len, negative) ----------

    @Test
    public void testInLongRangeCharArray_shorterLength_returnsTrue() {
        char[] digits = "123".toCharArray();
        Assert.assertTrue(NumberInput.inLongRange(digits, 0, 3, false));
    }

    @Test
    public void testInLongRangeCharArray_longerLength_returnsFalse() {
        char[] digits = "12345678901234567890".toCharArray(); // 20 digits
        Assert.assertFalse(NumberInput.inLongRange(digits, 0, 20, false));
    }

    @Test
    public void testInLongRangeCharArray_equalToMax_returnsTrue() {
        char[] digits = "9223372036854775807".toCharArray(); // MAX_LONG_STR
        Assert.assertTrue(NumberInput.inLongRange(digits, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArray_greaterThanMax_returnsFalse() {
        char[] digits = "9223372036854775817".toCharArray(); // bigger than max
        Assert.assertFalse(NumberInput.inLongRange(digits, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArray_smallerThanMax_returnsTrue() {
        char[] digits = "9223372036854775707".toCharArray(); // smaller than max
        Assert.assertTrue(NumberInput.inLongRange(digits, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArray_equalToMinNoSign_returnsTrue() {
        char[] digits = "9223372036854775808".toCharArray(); // MIN_LONG_STR_NO_SIGN
        Assert.assertTrue(NumberInput.inLongRange(digits, 0, 19, true));
    }

    @Test
    public void testInLongRangeCharArray_greaterThanMinNoSign_returnsFalse() {
        char[] digits = "9223372036854775818".toCharArray();
        Assert.assertFalse(NumberInput.inLongRange(digits, 0, 19, true));
    }

    // ---------- inLongRange(String, negative) ----------

    @Test
    public void testInLongRangeString_shorterLength_returnsTrue() {
        Assert.assertTrue(NumberInput.inLongRange("123", false));
    }

    @Test
    public void testInLongRangeString_longerLength_returnsFalse() {
        Assert.assertFalse(NumberInput.inLongRange("12345678901234567890", false));
    }

    @Test
    public void testInLongRangeString_equalToMax_returnsTrue() {
        Assert.assertTrue(NumberInput.inLongRange("9223372036854775807", false));
    }

    @Test
    public void testInLongRangeString_greaterThanMax_returnsFalse() {
        Assert.assertFalse(NumberInput.inLongRange("9223372036854775817", false));
    }

    @Test
    public void testInLongRangeString_smallerThanMax_returnsTrue() {
        Assert.assertTrue(NumberInput.inLongRange("9223372036854775707", false));
    }

    @Test
    public void testInLongRangeString_equalToMinNoSign_returnsTrue() {
        Assert.assertTrue(NumberInput.inLongRange("9223372036854775808", true));
    }

    // ---------- parseAsInt(String, int) ----------

    @Test
    public void testParseAsInt_null_returnsDefault() {
        Assert.assertEquals(42, NumberInput.parseAsInt(null, 42));
    }

    @Test
    public void testParseAsInt_emptyAfterTrim_returnsDefault() {
        Assert.assertEquals(42, NumberInput.parseAsInt("   ", 42));
    }

    @Test
    public void testParseAsInt_plainNumber_correctResult() {
        Assert.assertEquals(123, NumberInput.parseAsInt("123", 0));
    }

    @Test
    public void testParseAsInt_withPlusSign_correctResult() {
        Assert.assertEquals(123, NumberInput.parseAsInt("+123", 0));
    }

    @Test
    public void testParseAsInt_withMinusSign_correctResult() {
        Assert.assertEquals(-123, NumberInput.parseAsInt("-123", 0));
    }

    @Test
    public void testParseAsInt_withTrimming_correctResult() {
        Assert.assertEquals(123, NumberInput.parseAsInt("  123  ", 0));
    }

    @Test
    public void testParseAsInt_decimalValue_coercedToInt() {
        Assert.assertEquals(12, NumberInput.parseAsInt("12.5", 0));
    }

    @Test
    public void testParseAsInt_invalidNonNumeric_returnsDefault() {
        Assert.assertEquals(42, NumberInput.parseAsInt("abc", 42));
    }

    @Test
    public void testParseAsInt_overflowNumber_returnsDefault() {
        // all digits, but overflows int -> NumberFormatException caught
        Assert.assertEquals(42, NumberInput.parseAsInt("99999999999", 42));
    }

    // ---------- parseAsLong(String, long) ----------

    @Test
    public void testParseAsLong_null_returnsDefault() {
        Assert.assertEquals(42L, NumberInput.parseAsLong(null, 42L));
    }

    @Test
    public void testParseAsLong_emptyAfterTrim_returnsDefault() {
        Assert.assertEquals(42L, NumberInput.parseAsLong("  ", 42L));
    }

    @Test
    public void testParseAsLong_plainNumber_correctResult() {
        Assert.assertEquals(123456789012L, NumberInput.parseAsLong("123456789012", 0L));
    }

    @Test
    public void testParseAsLong_withPlusSign_correctResult() {
        Assert.assertEquals(123L, NumberInput.parseAsLong("+123", 0L));
    }

    @Test
    public void testParseAsLong_withMinusSign_correctResult() {
        Assert.assertEquals(-123L, NumberInput.parseAsLong("-123", 0L));
    }

    @Test
    public void testParseAsLong_decimalValue_coercedToLong() {
        Assert.assertEquals(12L, NumberInput.parseAsLong("12.5", 0L));
    }

    @Test
    public void testParseAsLong_invalidNonNumeric_returnsDefault() {
        Assert.assertEquals(42L, NumberInput.parseAsLong("abc", 42L));
    }

    @Test
    public void testParseAsLong_overflowNumber_returnsDefault() {
        // digits only, but overflows long
        Assert.assertEquals(42L, NumberInput.parseAsLong("99999999999999999999", 42L));
    }

    // ---------- parseAsDouble(String, double) ----------

    @Test
    public void testParseAsDouble_null_returnsDefault() {
        Assert.assertEquals(3.14, NumberInput.parseAsDouble(null, 3.14), 0.0001);
    }

    @Test
    public void testParseAsDouble_emptyAfterTrim_returnsDefault() {
        Assert.assertEquals(3.14, NumberInput.parseAsDouble("   ", 3.14), 0.0001);
    }

    @Test
    public void testParseAsDouble_validNumber_correctResult() {
        Assert.assertEquals(3.14, NumberInput.parseAsDouble("3.14", 0.0), 0.0001);
    }

    @Test
    public void testParseAsDouble_invalidNumber_returnsDefault() {
        Assert.assertEquals(42.0, NumberInput.parseAsDouble("abc", 42.0), 0.0001);
    }

    // ---------- parseDouble(String) ----------

    @Test
    public void testParseDouble_nastySmallDouble_returnsMinValue() {
        Assert.assertEquals(Double.MIN_VALUE,
                NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 0.0);
    }

    @Test
    public void testParseDouble_normalNumber_correctResult() {
        Assert.assertEquals(123.45, NumberInput.parseDouble("123.45"), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseDouble_invalidFormat_throwsException() {
        NumberInput.parseDouble("abc");
    }

    // ---------- parseBigDecimal(String) ----------

    @Test
    public void testParseBigDecimalString_validNumber_correctResult() {
        BigDecimal result = NumberInput.parseBigDecimal("123.45");
        Assert.assertEquals(new BigDecimal("123.45"), result);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalString_invalidFormat_throwsException() {
        NumberInput.parseBigDecimal("abc");
    }

    // ---------- parseBigDecimal(char[]) ----------

    @Test
    public void testParseBigDecimalCharArray_validNumber_correctResult() {
        char[] buffer = "123.45".toCharArray();
        BigDecimal result = NumberInput.parseBigDecimal(buffer);
        Assert.assertEquals(new BigDecimal("123.45"), result);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalCharArray_invalidFormat_throwsException() {
        char[] buffer = "abc".toCharArray();
        NumberInput.parseBigDecimal(buffer);
    }

    // ---------- parseBigDecimal(char[], offset, len) ----------

    @Test
    public void testParseBigDecimalCharArrayOffsetLen_validNumber_correctResult() {
        char[] buffer = "xx123.45yy".toCharArray();
        BigDecimal result = NumberInput.parseBigDecimal(buffer, 2, 6);
        Assert.assertEquals(new BigDecimal("123.45"), result);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalCharArrayOffsetLen_invalidFormat_throwsException() {
        char[] buffer = "xxabcxx".toCharArray();
        NumberInput.parseBigDecimal(buffer, 2, 3);
    }
}
