package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UtilTest {

    @Test
    public void testConstructor() {
        Util util = new Util();
        assertNotNull(util);
    }

    @Test
    public void testStripLeadingHyphens_doubleHyphen_returnsStrippedString() {
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
    }

    @Test
    public void testStripLeadingHyphens_singleHyphen_returnsStrippedString() {
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
    }

    @Test
    public void testStripLeadingHyphens_tripleHyphen_returnsSingleHyphenPrefix() {
        assertEquals("-foo", Util.stripLeadingHyphens("---foo"));
    }

    @Test
    public void testStripLeadingHyphens_noHyphen_returnsOriginalString() {
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
    }

    @Test
    public void testStripLeadingHyphens_emptyString_returnsEmptyString() {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    @Test
    public void testStripLeadingHyphens_singleHyphenOnly_returnsEmptyString() {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    @Test
    public void testStripLeadingHyphens_doubleHyphenOnly_returnsEmptyString() {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    @Test(expected = NullPointerException.class)
    public void testStripLeadingHyphens_nullInput_throwsNullPointerException() {
        Util.stripLeadingHyphens(null);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_surroundedByQuotes_returnsContent() {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_leadingQuoteOnly_returnsContentWithoutLeadingQuote() {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_trailingQuoteOnly_returnsContentWithoutTrailingQuote() {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("one two\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_noQuotes_returnsOriginalString() {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("one two"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_emptyString_returnsEmptyString() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_singleQuoteOnly_returnsEmptyString() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_twoQuotesOnly_returnsEmptyString() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_innerQuotesRetained() {
        assertEquals("foo \"bar\" baz", Util.stripLeadingAndTrailingQuotes("\"foo \"bar\" baz\""));
    }

    @Test(expected = NullPointerException.class)
    public void testStripLeadingAndTrailingQuotes_nullInput_throwsNullPointerException() {
        Util.stripLeadingAndTrailingQuotes(null);
    }
}
