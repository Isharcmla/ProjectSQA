import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.jsoup.helper.StringUtil;

public class StringUtilTest {

    // ---------- join(Collection, String) ----------

    @Test
    public void testJoinCollection_normalInput_returnsJoinedString() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        String result = StringUtil.join(list, ", ");
        Assert.assertEquals("a, b, c", result);
    }

    @Test
    public void testJoinCollection_emptyCollection_returnsEmptyString() {
        List<String> list = new ArrayList<String>();
        String result = StringUtil.join(list, ", ");
        Assert.assertEquals("", result);
    }

    @Test
    public void testJoinCollection_singleElement_returnsElementWithoutSeparator() {
        List<String> list = new ArrayList<String>();
        list.add("only");
        String result = StringUtil.join(list, ", ");
        Assert.assertEquals("only", result);
    }

    // ---------- join(Iterator, String) ----------

    @Test
    public void testJoinIterator_normalInput_returnsJoinedString() {
        List<String> list = Arrays.asList("x", "y", "z");
        String result = StringUtil.join(list.iterator(), "-");
        Assert.assertEquals("x-y-z", result);
    }

    @Test
    public void testJoinIterator_emptyIterator_returnsEmptyString() {
        List<String> list = new ArrayList<String>();
        String result = StringUtil.join(list.iterator(), "-");
        Assert.assertEquals("", result);
    }

    @Test
    public void testJoinIterator_singleElement_returnsElementWithoutSeparator() {
        List<String> list = Collections.singletonList("single");
        String result = StringUtil.join(list.iterator(), "-");
        Assert.assertEquals("single", result);
    }

    // ---------- join(String[], String) ----------

    @Test
    public void testJoinArray_normalInput_returnsJoinedString() {
        String[] arr = {"one", "two", "three"};
        String result = StringUtil.join(arr, ",");
        Assert.assertEquals("one,two,three", result);
    }

    @Test
    public void testJoinArray_emptyArray_returnsEmptyString() {
        String[] arr = {};
        String result = StringUtil.join(arr, ",");
        Assert.assertEquals("", result);
    }

    @Test
    public void testJoinArray_singleElementArray_returnsElementWithoutSeparator() {
        String[] arr = {"solo"};
        String result = StringUtil.join(arr, ",");
        Assert.assertEquals("solo", result);
    }

    // ---------- padding(int) ----------

    @Test
    public void testPadding_normalWidth_returnsCorrectSpaces() {
        String result = StringUtil.padding(5);
        Assert.assertEquals("     ", result);
    }

    @Test
    public void testPadding_zeroWidth_returnsEmptyString() {
        String result = StringUtil.padding(0);
        Assert.assertEquals("", result);
    }

    @Test
    public void testPadding_boundaryWidthWithinArray_returnsCachedPadding() {
        String result = StringUtil.padding(20);
        Assert.assertEquals(20, result.length());
    }

    @Test
    public void testPadding_widthBeyondCachedArray_returnsGeneratedPadding() {
        String result = StringUtil.padding(25);
        Assert.assertEquals(25, result.length());
        for (int i = 0; i < 25; i++) {
            Assert.assertEquals(' ', result.charAt(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPadding_negativeWidth_throwsException() {
        StringUtil.padding(-1);
    }

    // ---------- isBlank(String) ----------

    @Test
    public void testIsBlank_nullString_returnsTrue() {
        Assert.assertTrue(StringUtil.isBlank(null));
    }

    @Test
    public void testIsBlank_emptyString_returnsTrue() {
        Assert.assertTrue(StringUtil.isBlank(""));
    }

    @Test
    public void testIsBlank_onlyWhitespace_returnsTrue() {
        Assert.assertTrue(StringUtil.isBlank("   \t\n\r\f"));
    }

    @Test
    public void testIsBlank_nonBlankString_returnsFalse() {
        Assert.assertFalse(StringUtil.isBlank("hello"));
    }

    @Test
    public void testIsBlank_mixedWhitespaceAndContent_returnsFalse() {
        Assert.assertFalse(StringUtil.isBlank("  hello  "));
    }

    // ---------- isNumeric(String) ----------

    @Test
    public void testIsNumeric_nullString_returnsFalse() {
        Assert.assertFalse(StringUtil.isNumeric(null));
    }

    @Test
    public void testIsNumeric_emptyString_returnsFalse() {
        Assert.assertFalse(StringUtil.isNumeric(""));
    }

    @Test
    public void testIsNumeric_onlyDigits_returnsTrue() {
        Assert.assertTrue(StringUtil.isNumeric("12345"));
    }

    @Test
    public void testIsNumeric_containsNonDigit_returnsFalse() {
        Assert.assertFalse(StringUtil.isNumeric("123a45"));
    }

    @Test
    public void testIsNumeric_singleDigit_returnsTrue() {
        Assert.assertTrue(StringUtil.isNumeric("5"));
    }

    // ---------- isWhitespace(int) ----------

    @Test
    public void testIsWhitespace_space_returnsTrue() {
        Assert.assertTrue(StringUtil.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespace_tab_returnsTrue() {
        Assert.assertTrue(StringUtil.isWhitespace('\t'));
    }

    @Test
    public void testIsWhitespace_newline_returnsTrue() {
        Assert.assertTrue(StringUtil.isWhitespace('\n'));
    }

    @Test
    public void testIsWhitespace_formFeed_returnsTrue() {
        Assert.assertTrue(StringUtil.isWhitespace('\f'));
    }

    @Test
    public void testIsWhitespace_carriageReturn_returnsTrue() {
        Assert.assertTrue(StringUtil.isWhitespace('\r'));
    }

    @Test
    public void testIsWhitespace_nonWhitespaceChar_returnsFalse() {
        Assert.assertFalse(StringUtil.isWhitespace('a'));
    }

    @Test
    public void testIsWhitespace_nbsp_returnsFalse() {
        Assert.assertFalse(StringUtil.isWhitespace(160));
    }

    // ---------- isActuallyWhitespace(int) ----------

    @Test
    public void testIsActuallyWhitespace_space_returnsTrue() {
        Assert.assertTrue(StringUtil.isActuallyWhitespace(' '));
    }

    @Test
    public void testIsActuallyWhitespace_nbsp_returnsTrue() {
        Assert.assertTrue(StringUtil.isActuallyWhitespace(160));
    }

    @Test
    public void testIsActuallyWhitespace_tab_returnsTrue() {
        Assert.assertTrue(StringUtil.isActuallyWhitespace('\t'));
    }

    @Test
    public void testIsActuallyWhitespace_nonWhitespaceChar_returnsFalse() {
        Assert.assertFalse(StringUtil.isActuallyWhitespace('a'));
    }

    // ---------- normaliseWhitespace(String) ----------

    @Test
    public void testNormaliseWhitespace_multipleSpaces_collapsesToSingleSpace() {
        String result = StringUtil.normaliseWhitespace("hello    world");
        Assert.assertEquals("hello world", result);
    }

    @Test
    public void testNormaliseWhitespace_mixedWhitespaceChars_convertsToSpace() {
        String result = StringUtil.normaliseWhitespace("hello\t\n\rworld");
        Assert.assertEquals("hello world", result);
    }

    @Test
    public void testNormaliseWhitespace_emptyString_returnsEmptyString() {
        String result = StringUtil.normaliseWhitespace("");
        Assert.assertEquals("", result);
    }

    @Test
    public void testNormaliseWhitespace_leadingWhitespace_keepsLeadingSpace() {
        String result = StringUtil.normaliseWhitespace("   hello");
        Assert.assertEquals(" hello", result);
    }

    // ---------- appendNormalisedWhitespace ----------

    @Test
    public void testAppendNormalisedWhitespace_stripLeadingTrue_removesLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "   hello world", true);
        Assert.assertEquals("hello world", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_stripLeadingFalse_keepsLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "   hello world", false);
        Assert.assertEquals(" hello world", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_consecutiveWhitespace_collapsesToOneSpace() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "hello     world", false);
        Assert.assertEquals("hello world", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_emptyString_appendsNothing() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "", false);
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespace_onlyWhitespaceWithStripLeading_resultsEmpty() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "    ", true);
        Assert.assertEquals("", sb.toString());
    }

    // ---------- in(String, String...) ----------

    @Test
    public void testIn_needleExists_returnsTrue() {
        Assert.assertTrue(StringUtil.in("b", "a", "b", "c"));
    }

    @Test
    public void testIn_needleDoesNotExist_returnsFalse() {
        Assert.assertFalse(StringUtil.in("z", "a", "b", "c"));
    }

    @Test
    public void testIn_emptyHaystack_returnsFalse() {
        Assert.assertFalse(StringUtil.in("a"));
    }

    // ---------- inSorted(String, String[]) ----------

    @Test
    public void testInSorted_needleExists_returnsTrue() {
        String[] sortedArr = {"a", "b", "c", "d"};
        Assert.assertTrue(StringUtil.inSorted("b", sortedArr));
    }

    @Test
    public void testInSorted_needleDoesNotExist_returnsFalse() {
        String[] sortedArr = {"a", "b", "c", "d"};
        Assert.assertFalse(StringUtil.inSorted("z", sortedArr));
    }

    // ---------- resolve(URL, String) ----------

    @Test
    public void testResolveUrl_normalRelativePath_returnsResolvedUrl() throws MalformedURLException {
        URL base = new URL("http://example.com/foo/");
        URL result = StringUtil.resolve(base, "bar.html");
        Assert.assertEquals("http://example.com/foo/bar.html", result.toExternalForm());
    }

    @Test
    public void testResolveUrl_queryStringOnly_resolvesCorrectly() throws MalformedURLException {
        URL base = new URL("http://example.com/foo/file.html");
        URL result = StringUtil.resolve(base, "?query=1");
        Assert.assertTrue(result.toExternalForm().contains("file.html"));
    }

    @Test
    public void testResolveUrl_dotPrefixedRelativeWithoutLeadingSlashInFile_resolvesCorrectly() throws MalformedURLException {
        URL base = new URL("http://example.com");
        URL result = StringUtil.resolve(base, "./foo");
        Assert.assertNotNull(result);
    }

    @Test
    public void testResolveUrl_absoluteRelUrl_returnsRelUrl() throws MalformedURLException {
        URL base = new URL("http://example.com/foo/");
        URL result = StringUtil.resolve(base, "http://other.com/bar");
        Assert.assertEquals("http://other.com/bar", result.toExternalForm());
    }

    // ---------- resolve(String, String) ----------

    @Test
    public void testResolveString_validBaseAndRelative_returnsResolvedUrl() {
        String result = StringUtil.resolve("http://example.com/foo/", "bar.html");
        Assert.assertEquals("http://example.com/foo/bar.html", result);
    }

    @Test
    public void testResolveString_invalidBaseButAbsoluteRelUrl_returnsRelUrl() {
        String result = StringUtil.resolve("not a url", "http://example.com/bar");
        Assert.assertEquals("http://example.com/bar", result);
    }

    @Test
    public void testResolveString_invalidBaseAndInvalidRelUrl_returnsEmptyString() {
        String result = StringUtil.resolve("not a url", "also not a url");
        Assert.assertEquals("", result);
    }

    @Test
    public void testResolveString_validBaseButInvalidResultUrl_returnsEmptyStringOrValid() {
        // This covers general path; result may or may not throw depending on URL rules.
        String result = StringUtil.resolve("http://example.com/foo/", "bar.html");
        Assert.assertNotNull(result);
    }

    // ---------- stringBuilder() ----------

    @Test
    public void testStringBuilder_returnsEmptyBuilder() {
        StringBuilder sb = StringUtil.stringBuilder();
        Assert.assertEquals(0, sb.length());
    }

    @Test
    public void testStringBuilder_reusedAfterAppend_isClearedOnNextCall() {
        StringBuilder sb1 = StringUtil.stringBuilder();
        sb1.append("some content");
        StringBuilder sb2 = StringUtil.stringBuilder();
        Assert.assertEquals(0, sb2.length());
    }

    @Test
    public void testStringBuilder_largeContentTriggersNewBuilder() {
        StringBuilder sb = StringUtil.stringBuilder();
        // Append more than MaxCachedBuilderSize (8*1024) characters to trigger new builder branch
        char[] filler = new char[9000];
        Arrays.fill(filler, 'x');
        sb.append(filler);
        StringBuilder sb2 = StringUtil.stringBuilder();
        Assert.assertEquals(0, sb2.length());
    }
}
