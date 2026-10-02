package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest
{
    @Test
    public void testStripLeadingHyphens_null_returnsNull()
    {
        assertNull(Util.stripLeadingHyphens(null));
    }

    @Test
    public void testStripLeadingHyphens_doubleHyphen_stripsBoth()
    {
        String result = Util.stripLeadingHyphens("--foo");
        assertEquals("foo", result);
    }

    @Test
    public void testStripLeadingHyphens_singleHyphen_stripsOne()
    {
        String result = Util.stripLeadingHyphens("-foo");
        assertEquals("foo", result);
    }

    @Test
    public void testStripLeadingHyphens_noHyphen_returnsSameString()
    {
        String result = Util.stripLeadingHyphens("foo");
        assertEquals("foo", result);
    }

    @Test
    public void testStripLeadingHyphens_emptyString_returnsEmptyString()
    {
        String result = Util.stripLeadingHyphens("");
        assertEquals("", result);
    }

    @Test
    public void testStripLeadingHyphens_onlyDoubleHyphen_returnsEmptyString()
    {
        String result = Util.stripLeadingHyphens("--");
        assertEquals("", result);
    }

    @Test
    public void testStripLeadingHyphens_onlySingleHyphen_returnsEmptyString()
    {
        String result = Util.stripLeadingHyphens("-");
        assertEquals("", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_bothQuotes_stripsBoth()
    {
        String result = Util.stripLeadingAndTrailingQuotes("\"one two\"");
        assertEquals("one two", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_noQuotes_returnsSameString()
    {
        String result = Util.stripLeadingAndTrailingQuotes("one two");
        assertEquals("one two", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_onlyLeadingQuote_stripsLeadingOnly()
    {
        String result = Util.stripLeadingAndTrailingQuotes("\"one two");
        assertEquals("one two", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_onlyTrailingQuote_stripsTrailingOnly()
    {
        String result = Util.stripLeadingAndTrailingQuotes("one two\"");
        assertEquals("one two", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_emptyString_returnsEmptyString()
    {
        String result = Util.stripLeadingAndTrailingQuotes("");
        assertEquals("", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_singleQuoteChar_returnsEmptyString()
    {
        String result = Util.stripLeadingAndTrailingQuotes("\"");
        assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void testStripLeadingAndTrailingQuotes_null_throwsNullPointerException()
    {
        Util.stripLeadingAndTrailingQuotes(null);
    }
}
