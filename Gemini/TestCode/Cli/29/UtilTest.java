package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class UtilTest {

    @Test
    public void testConstructor_instantiation_success() {
        Util util = new Util();
        assertNotNull(util);
    }

    @Test
    public void testStripLeadingHyphens_nullInput_returnsNull() {
        assertNull(Util.stripLeadingHyphens(null));
    }

    @Test
    public void testStripLeadingHyphens_doubleHyphen_returnsStrippedString() {
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
        assertEquals("", Util.stripLeadingHyphens("--"));
        assertEquals("-foo", Util.stripLeadingHyphens("---foo"));
    }

    @Test
    public void testStripLeadingHyphens_singleHyphen_returnsStrippedString() {
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    @Test
    public void testStripLeadingHyphens_noHyphen_returnsOriginalString() {
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_bothQuotesPresent_returnsUnquotedString() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo\""));
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_leadingQuoteOnly_returnsStrippedLeading() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_trailingQuoteOnly_returnsStrippedTrailing() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("foo\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_noQuotes_returnsOriginalString() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("foo"));
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_quotesOnly_returnsEmptyString() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\""));
    }

    @Test(expected = NullPointerException.class)
    public void testStripLeadingAndTrailingQuotes_nullInput_throwsNullPointerException() {
        Util.stripLeadingAndTrailingQuotes(null);
    }
}
