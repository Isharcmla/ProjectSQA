import org.junit.Test;
import org.junit.Assert;

public class WordUtilsTest {

    // ---------- Constructor ----------
    @Test
    public void testConstructor_createInstance_notNull() {
        WordUtils wu = new WordUtils();
        Assert.assertNotNull(wu);
    }

    // ---------- wrap(String, int) ----------
    @Test
    public void testWrap_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.wrap(null, 20));
    }

    @Test
    public void testWrap_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.wrap("", 20));
    }

    @Test
    public void testWrap_normalText_wrapsCorrectly() {
        String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        String expected = "Here is one line of" + System.getProperty("line.separator")
                + "text that is going" + System.getProperty("line.separator")
                + "to be wrapped after" + System.getProperty("line.separator")
                + "20 columns.";
        Assert.assertEquals(expected, WordUtils.wrap(input, 20));
    }

    @Test
    public void testWrap_wrapLengthLessThanOne_treatedAsOne() {
        String input = "abc";
        String result = WordUtils.wrap(input, 0);
        Assert.assertNotNull(result);
    }

    @Test
    public void testWrap_shortTextFitsLine_noWrap() {
        String input = "short";
        Assert.assertEquals("short", WordUtils.wrap(input, 20));
    }

    // ---------- wrap(String, int, String, boolean) ----------
    @Test
    public void testWrap4Args_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.wrap(null, 20, "\n", true));
    }

    @Test
    public void testWrap4Args_customNewLine_usesCustomSeparator() {
        String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        String result = WordUtils.wrap(input, 20, "\n", false);
        Assert.assertTrue(result.contains("\n"));
    }

    @Test
    public void testWrap4Args_wrapLongWordsTrue_wrapsLongWord() {
        String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String result = WordUtils.wrap(input, 10, "\n", true);
        Assert.assertTrue(result.contains("\n"));
    }

    @Test
    public void testWrap4Args_wrapLongWordsFalse_longWordNotWrappedNoSpaceFound() {
        String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String result = WordUtils.wrap(input, 10, "\n", false);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testWrap4Args_wrapLongWordsFalse_longWordWithSpaceAfter() {
        String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa bbb";
        String result = WordUtils.wrap(input, 10, "\n", false);
        Assert.assertTrue(result.contains("\n"));
    }

    @Test
    public void testWrap4Args_leadingSpace_skipsSpace() {
        String input = "     word another word that is long enough to wrap";
        String result = WordUtils.wrap(input, 10, "\n", false);
        Assert.assertNotNull(result);
    }

    @Test
    public void testWrap4Args_negativeWrapLength_treatedAsOne() {
        String input = "abc def";
        String result = WordUtils.wrap(input, -5, "\n", false);
        Assert.assertNotNull(result);
    }

    // ---------- capitalize(String) ----------
    @Test
    public void testCapitalize_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.capitalize(null));
    }

    @Test
    public void testCapitalize_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.capitalize(""));
    }

    @Test
    public void testCapitalize_normalText_capitalizesFirstLetters() {
        Assert.assertEquals("I Am FINE", WordUtils.capitalize("i am FINE"));
    }

    // ---------- capitalize(String, char[]) ----------
    @Test
    public void testCapitalizeWithDelimiters_nullString_returnsNull() {
        Assert.assertNull(WordUtils.capitalize(null, new char[]{'.'}));
    }

    @Test
    public void testCapitalizeWithDelimiters_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.capitalize("", new char[]{'.'}));
    }

    @Test
    public void testCapitalizeWithDelimiters_emptyDelimiterArray_returnsOriginal() {
        String input = "i am fine";
        Assert.assertEquals(input, WordUtils.capitalize(input, new char[0]));
    }

    @Test
    public void testCapitalizeWithDelimiters_nullDelimiters_usesWhitespace() {
        Assert.assertEquals("I Am Fine", WordUtils.capitalize("i am fine", null));
    }

    @Test
    public void testCapitalizeWithDelimiters_customDelimiters_capitalizesAfterDelimiter() {
        Assert.assertEquals("I aM.Fine", WordUtils.capitalize("i aM.fine", new char[]{'.'}));
    }

    // ---------- capitalizeFully(String) ----------
    @Test
    public void testCapitalizeFully_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.capitalizeFully(null));
    }

    @Test
    public void testCapitalizeFully_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.capitalizeFully(""));
    }

    @Test
    public void testCapitalizeFully_normalText_capitalizesAndLowercasesRest() {
        Assert.assertEquals("I Am Fine", WordUtils.capitalizeFully("i am FINE"));
    }

    // ---------- capitalizeFully(String, char[]) ----------
    @Test
    public void testCapitalizeFullyWithDelimiters_nullString_returnsNull() {
        Assert.assertNull(WordUtils.capitalizeFully(null, new char[]{'.'}));
    }

    @Test
    public void testCapitalizeFullyWithDelimiters_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.capitalizeFully("", new char[]{'.'}));
    }

    @Test
    public void testCapitalizeFullyWithDelimiters_emptyDelimiterArray_returnsOriginal() {
        String input = "I AM FINE";
        Assert.assertEquals(input, WordUtils.capitalizeFully(input, new char[0]));
    }

    @Test
    public void testCapitalizeFullyWithDelimiters_nullDelimiters_usesWhitespace() {
        Assert.assertEquals("I Am Fine", WordUtils.capitalizeFully("I AM FINE", null));
    }

    @Test
    public void testCapitalizeFullyWithDelimiters_customDelimiters_lowercaseAndCapitalize() {
        Assert.assertEquals("I am.Fine", WordUtils.capitalizeFully("i aM.fine", new char[]{'.'}));
    }

    // ---------- uncapitalize(String) ----------
    @Test
    public void testUncapitalize_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.uncapitalize(null));
    }

    @Test
    public void testUncapitalize_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.uncapitalize(""));
    }

    @Test
    public void testUncapitalize_normalText_uncapitalizesFirstLetters() {
        Assert.assertEquals("i am fINE", WordUtils.uncapitalize("I Am FINE"));
    }

    // ---------- uncapitalize(String, char[]) ----------
    @Test
    public void testUncapitalizeWithDelimiters_nullString_returnsNull() {
        Assert.assertNull(WordUtils.uncapitalize(null, new char[]{'.'}));
    }

    @Test
    public void testUncapitalizeWithDelimiters_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.uncapitalize("", new char[]{'.'}));
    }

    @Test
    public void testUncapitalizeWithDelimiters_emptyDelimiterArray_returnsOriginal() {
        String input = "I AM FINE";
        Assert.assertEquals(input, WordUtils.uncapitalize(input, new char[0]));
    }

    @Test
    public void testUncapitalizeWithDelimiters_nullDelimiters_usesWhitespace() {
        Assert.assertEquals("i aM fINE", WordUtils.uncapitalize("I aM FINE", null));
    }

    @Test
    public void testUncapitalizeWithDelimiters_customDelimiters_uncapitalizeAfterDelimiter() {
        Assert.assertEquals("i AM.fINE", WordUtils.uncapitalize("I AM.FINE", new char[]{'.'}));
    }

    // ---------- swapCase(String) ----------
    @Test
    public void testSwapCase_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.swapCase(null));
    }

    @Test
    public void testSwapCase_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.swapCase(""));
    }

    @Test
    public void testSwapCase_normalText_swapsCaseCorrectly() {
        Assert.assertEquals("tHE DOG HAS A bone", WordUtils.swapCase("The dog has a BONE"));
    }

    @Test
    public void testSwapCase_titleCaseCharacter_convertsToLower() {
        // U+01C5 is a title case character (Dz)
        char titleCaseChar = '\u01C5';
        String input = String.valueOf(titleCaseChar);
        String result = WordUtils.swapCase(input);
        Assert.assertEquals(Character.toLowerCase(titleCaseChar), result.charAt(0));
    }

    @Test
    public void testSwapCase_nonLetterCharacter_remainsUnchanged() {
        Assert.assertEquals("123", WordUtils.swapCase("123"));
    }

    // ---------- initials(String) ----------
    @Test
    public void testInitials_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.initials(null));
    }

    @Test
    public void testInitials_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.initials(""));
    }

    @Test
    public void testInitials_normalText_returnsInitials() {
        Assert.assertEquals("BJL", WordUtils.initials("Ben John Lee"));
    }

    @Test
    public void testInitials_dotSeparated_returnsPartialInitials() {
        Assert.assertEquals("BJ", WordUtils.initials("Ben J.Lee"));
    }

    // ---------- initials(String, char[]) ----------
    @Test
    public void testInitialsWithDelimiters_nullString_returnsNull() {
        Assert.assertNull(WordUtils.initials(null, new char[]{' '}));
    }

    @Test
    public void testInitialsWithDelimiters_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.initials("", new char[]{' '}));
    }

    @Test
    public void testInitialsWithDelimiters_emptyDelimiterArray_returnsEmptyString() {
        Assert.assertEquals("", WordUtils.initials("Ben John Lee", new char[0]));
    }

    @Test
    public void testInitialsWithDelimiters_nullDelimiters_usesWhitespace() {
        Assert.assertEquals("BJL", WordUtils.initials("Ben John Lee", null));
    }

    @Test
    public void testInitialsWithDelimiters_customDelimiters_returnsAllInitials() {
        Assert.assertEquals("BJL", WordUtils.initials("Ben J.Lee", new char[]{' ', '.'}));
    }

    // ---------- abbreviate(String, int, int, String) ----------
    @Test
    public void testAbbreviate_nullInput_returnsNull() {
        Assert.assertNull(WordUtils.abbreviate(null, 5, 10, "..."));
    }

    @Test
    public void testAbbreviate_emptyString_returnsEmpty() {
        Assert.assertEquals("", WordUtils.abbreviate("", 5, 10, "..."));
    }

    @Test
    public void testAbbreviate_normalText_abbreviatesAtSpaceWithinLimits() {
        String input = "Now is the time for all good men to come to the aid of the party.";
        String result = WordUtils.abbreviate(input, 10, 20, "");
        Assert.assertEquals("Now is the", result);
    }

    @Test
    public void testAbbreviate_noSpaceFoundUpperEqualsLength_noAppend() {
        String input = "abcdefgh";
        String result = WordUtils.abbreviate(input, 3, -1, "...");
        Assert.assertEquals(input, result);
    }

    @Test
    public void testAbbreviate_noSpaceFoundUpperLessThanLength_appendsEnd() {
        String input = "abcdefghij";
        String result = WordUtils.abbreviate(input, 3, 5, "...");
        Assert.assertEquals("abcde...", result);
    }

    @Test
    public void testAbbreviate_indexGreaterThanUpper_abbreviatesAtUpper() {
        String input = "abc def ghijklmnop";
        String result = WordUtils.abbreviate(input, 3, 6, "...");
        Assert.assertEquals("abc de...", result);
    }

    @Test
    public void testAbbreviate_upperLessThanLower_adjustsUpperToLower() {
        String input = "abcdefghij";
        String result = WordUtils.abbreviate(input, 5, 2, "...");
        Assert.assertNotNull(result);
    }

    @Test
    public void testAbbreviate_upperIsNegativeOne_noLimit() {
        String input = "abc def";
        String result = WordUtils.abbreviate(input, 3, -1, "...");
        Assert.assertEquals("abc", result);
    }

    @Test
    public void testAbbreviate_appendToEndNull_defaultsToEmptyString() {
        String input = "abcdefghij";
        String result = WordUtils.abbreviate(input, 3, 5, null);
        Assert.assertEquals("abcde", result);
    }

    @Test
    public void testAbbreviate_indexEqualsUpper_abbreviatesAtIndex() {
        String input = "abc defghij";
        String result = WordUtils.abbreviate(input, 2, 3, "...");
        Assert.assertEquals("abc...", result);
    }
}
