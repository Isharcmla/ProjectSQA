package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public void testConstructor_createsInstance() {
        StringUtil util = new StringUtil();
        assertNotNull(util);
    }

    @Test
    public void testJoin_collection_emptyCollection_returnsEmptyString() {
        List<String> list = Collections.emptyList();
        assertEquals("", StringUtil.join(list, ","));
    }

    @Test
    public void testJoin_collection_singleElement_returnsElementWithoutSeparator() {
        List<String> list = Collections.singletonList("one");
        assertEquals("one", StringUtil.join(list, ","));
    }

    @Test
    public void testJoin_collection_multipleElements_joinsWithSeparator() {
        List<String> list = Arrays.asList("one", "two", "three");
        assertEquals("one, two, three", StringUtil.join(list, ", "));
    }

    @Test
    public void testJoin_iterator_emptyIterator_returnsEmptyString() {
        Iterator<String> iterator = Collections.emptyIterator();
        assertEquals("", StringUtil.join(iterator, ","));
    }

    @Test
    public void testJoin_iterator_singleElement_returnsElementWithoutSeparator() {
        Iterator<String> iterator = Collections.singletonList("solo").iterator();
        assertEquals("solo", StringUtil.join(iterator, "-"));
    }

    @Test
    public void testJoin_iterator_multipleElements_joinsWithSeparator() {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        assertEquals("a-b-c", StringUtil.join(iterator, "-"));
    }

    @Test
    public void testJoin_array_emptyArray_returnsEmptyString() {
        String[] array = new String[0];
        assertEquals("", StringUtil.join(array, ","));
    }

    @Test
    public void testJoin_array_singleElement_returnsElementWithoutSeparator() {
        String[] array = new String[]{"single"};
        assertEquals("single", StringUtil.join(array, ","));
    }

    @Test
    public void testJoin_array_multipleElements_joinsWithSeparator() {
        String[] array = new String[]{"foo", "bar", "baz"};
        assertEquals("foo::bar::baz", StringUtil.join(array, "::"));
    }

    @Test
    public void testPadding_cachedLengths_returnsCachedSpaces() {
        assertEquals("", StringUtil.padding(0));
        assertEquals(" ", StringUtil.padding(1));
        assertEquals("  ", StringUtil.padding(2));
        assertEquals("                    ", StringUtil.padding(20));
    }

    @Test
    public void testPadding_exceedsCachedLength_generatesCorrectPadding() {
        String padding21 = StringUtil.padding(21);
        assertEquals(21, padding21.length());
        assertEquals("                     ", padding21);

        String padding30 = StringUtil.padding(30);
        assertEquals(30, padding30.length());
        assertEquals("                              ", padding30);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPadding_negativeWidth_throwsIllegalArgumentException() {
        StringUtil.padding(-1);
    }

    @Test
    public void testIsBlank_nullString_returnsTrue() {
        assertTrue(StringUtil.isBlank(null));
    }

    @Test
    public void testIsBlank_emptyString_returnsTrue() {
        assertTrue(StringUtil.isBlank(""));
    }

    @Test
    public void testIsBlank_onlyWhitespace_returnsTrue() {
        assertTrue(StringUtil.isBlank("   "));
        assertTrue(StringUtil.isBlank("\t\r\n \f"));
    }

    @Test
    public void testIsBlank_nonWhitespace_returnsFalse() {
        assertFalse(StringUtil.isBlank("a"));
        assertFalse(StringUtil.isBlank("   a   "));
        assertFalse(StringUtil.isBlank("hello world"));
    }

    @Test
    public void testIsNumeric_nullString_returnsFalse() {
        assertFalse(StringUtil.isNumeric(null));
    }

    @Test
    public void testIsNumeric_emptyString_returnsFalse() {
        assertFalse(StringUtil.isNumeric(""));
    }

    @Test
    public void testIsNumeric_allDigits_returnsTrue() {
        assertTrue(StringUtil.isNumeric("0"));
        assertTrue(StringUtil.isNumeric("1234567890"));
    }

    @Test
    public void testIsNumeric_containsNonDigits_returnsFalse() {
        assertFalse(StringUtil.isNumeric("123a"));
        assertFalse(StringUtil.isNumeric(" 123"));
        assertFalse(StringUtil.isNumeric("12.3"));
        assertFalse(StringUtil.isNumeric("-123"));
        assertFalse(StringUtil.isNumeric("abc"));
    }

    @Test
    public void testIsWhitespace_whitespaceCodePoints_returnsTrue() {
        assertTrue(StringUtil.isWhitespace(' '));
        assertTrue(StringUtil.isWhitespace('\t'));
        assertTrue(StringUtil.isWhitespace('\n'));
        assertTrue(StringUtil.isWhitespace('\f'));
        assertTrue(StringUtil.isWhitespace('\r'));
    }

    @Test
    public void testIsWhitespace_nonWhitespaceCodePoints_returnsFalse() {
        assertFalse(StringUtil.isWhitespace('a'));
        assertFalse(StringUtil.isWhitespace('1'));
        assertFalse(StringUtil.isWhitespace(160)); // &nbsp; is not standard HTML whitespace
    }

    @Test
    public void testIsActuallyWhitespace_whitespaceCodePoints_returnsTrue() {
        assertTrue(StringUtil.isActuallyWhitespace(' '));
        assertTrue(StringUtil.isActuallyWhitespace('\t'));
        assertTrue(StringUtil.isActuallyWhitespace('\n'));
        assertTrue(StringUtil.isActuallyWhitespace('\f'));
        assertTrue(StringUtil.isActuallyWhitespace('\r'));
        assertTrue(StringUtil.isActuallyWhitespace(160)); // non-breaking space
    }

    @Test
    public void testIsActuallyWhitespace_nonWhitespaceCodePoints_returnsFalse() {
        assertFalse(StringUtil.isActuallyWhitespace('a'));
        assertFalse(StringUtil.isActuallyWhitespace('0'));
        assertFalse(StringUtil.isActuallyWhitespace(161));
    }

    @Test
    public void testNormaliseWhitespace_collapsesAndNormalisesWhitespace() {
        String input = "  Hello   \n\t  World  \r\f  !  ";
        String expected = " Hello World ! ";
        assertEquals(expected, StringUtil.normaliseWhitespace(input));
    }

    @Test
    public void testNormaliseWhitespace_withNonBreakingSpace() {
        String input = "Hello\u00A0\u00A0World";
        String expected = "Hello World";
        assertEquals(expected, StringUtil.normaliseWhitespace(input));
    }

    @Test
    public void testAppendNormalisedWhitespace_stripLeadingTrue_removesLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "   leading and   trailing   ", true);
        assertEquals("leading and trailing ", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_stripLeadingFalse_preservesSingleLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "   leading and   trailing   ", false);
        assertEquals(" leading and trailing ", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_withSurrogatePairCodePoints() {
        // Unicode character with code point > 0xFFFF (Character.charCount == 2)
        String emojiString = "Hello \uD83D\uDE00   World"; // 😀
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, emojiString, false);
        assertEquals("Hello \uD83D\uDE00 World", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_emptyString() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "", true);
        assertEquals("", sb.toString());
    }

    @Test
    public void testIn_needlePresent_returnsTrue() {
        assertTrue(StringUtil.in("b", "a", "b", "c"));
        assertTrue(StringUtil.in("test", "test"));
    }

    @Test
    public void testIn_needleAbsent_returnsFalse() {
        assertFalse(StringUtil.in("d", "a", "b", "c"));
        assertFalse(StringUtil.in("test"));
    }

    @Test
    public void testInSorted_needlePresent_returnsTrue() {
        String[] sortedHaystack = new String[]{"apple", "banana", "cherry", "date"};
        assertTrue(StringUtil.inSorted("banana", sortedHaystack));
        assertTrue(StringUtil.inSorted("apple", sortedHaystack));
        assertTrue(StringUtil.inSorted("date", sortedHaystack));
    }

    @Test
    public void testInSorted_needleAbsent_returnsFalse() {
        String[] sortedHaystack = new String[]{"apple", "banana", "cherry", "date"};
        assertFalse(StringUtil.inSorted("avocado", sortedHaystack));
        assertFalse(StringUtil.inSorted("fig", sortedHaystack));
    }

    @Test
    public void testResolve_urlBaseAndRelativeUrl_standardResolution() throws MalformedURLException {
        URL base = new URL("http://example.com/path/index.html");
        URL resolved = StringUtil.resolve(base, "sub/page.html");
        assertEquals("http://example.com/path/sub/page.html", resolved.toExternalForm());
    }

    @Test
    public void testResolve_urlBaseAndQueryRelativeUrl_resolvesCorrectly() throws MalformedURLException {
        URL base = new URL("http://example.com/dir/file.html");
        URL resolved = StringUtil.resolve(base, "?foo=bar");
        assertEquals("http://example.com/dir/file.html?foo=bar", resolved.toExternalForm());
    }

    @Test
    public void testResolve_urlBaseWithoutLeadingSlashInFileAndDotRelativeUrl() throws MalformedURLException {
        // Construct base with file not starting with '/'
        URL baseWithoutLeadingSlash = new URL("http", "example.com", 80, "file.html");
        URL resolved = StringUtil.resolve(baseWithoutLeadingSlash, "./other.html");
        assertEquals("http://example.com/other.html", resolved.toExternalForm());
    }

    @Test
    public void testResolve_stringBaseAndRelative_resolvesCorrectly() {
        String resolved = StringUtil.resolve("http://example.com/dir/index.html", "about.html");
        assertEquals("http://example.com/dir/about.html", resolved);
    }

    @Test
    public void testResolve_stringBaseInvalid_relUrlAbsolute_returnsRelUrl() {
        String resolved = StringUtil.resolve("invalid-url", "http://example.com/page.html");
        assertEquals("http://example.com/page.html", resolved);
    }

    @Test
    public void testResolve_stringBaseInvalid_relUrlInvalid_returnsEmptyString() {
        String resolved = StringUtil.resolve("invalid-base", "invalid-rel");
        assertEquals("", resolved);
    }

    @Test
    public void testResolve_stringBaseValid_relUrlMalformedProtocol_returnsEmptyString() {
        String resolved = StringUtil.resolve("http://example.com", "http://:80/invalid");
        assertEquals("", resolved);
    }

    @Test
    public void testStringBuilder_clearsBetweenUses() {
        StringBuilder sb1 = StringUtil.stringBuilder();
        sb1.append("test content");

        StringBuilder sb2 = StringUtil.stringBuilder();
        assertEquals(0, sb2.length());
        assertEquals("", sb2.toString());
    }

    @Test
    public void testStringBuilder_exceedsMaxCachedBuilderSize_reallocatesBuilder() {
        StringBuilder sb = StringUtil.stringBuilder();
        // Append more than 8 * 1024 (8192) characters
        for (int i = 0; i < 9000; i++) {
            sb.append('x');
        }

        StringBuilder nextSb = StringUtil.stringBuilder();
        assertEquals(0, nextSb.length());
        assertEquals("", nextSb.toString());
    }
}
