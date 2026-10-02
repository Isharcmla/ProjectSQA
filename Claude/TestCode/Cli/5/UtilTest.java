package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilTest {

    // ---------- stripLeadingHyphens tests ----------

    @Test
    public void testStripLeadingHyphens_doubleHyphenPrefix_removesBothHyphens()
    {
        String result = Util.stripLeadingHyphens("--foo");
        assertEquals("foo", result);
    }

    @Test
    public void testStripLeadingHyphens_singleHyphenPrefix_removesOneHyphen()
    {
        String result = Util.stripLeadingHyphens("-foo");
        assertEquals("foo", result);
    }

    @Test
    public void testStripLeadingHyphens_noHyphenPrefix_returnsSameString()
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

    @Test(expected = NullPointerException.class)
    public void testStripLeadingHyphens_nullInput_throwsNullPointerException()
    {
        Util.stripLeadingHyphens(null);
    }

    // ---------- stripLeadingAndTrailingQuotes tests ----------

    @Test
    public void testStripLeadingAndTrailingQuotes_bothQuotesPresent_removesBoth()
    {
        String result = Util.stripLeadingAndTrailingQuotes("\"foo bar\"");
        assertEquals("foo bar", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_noQuotes_returnsSameString()
    {
        String result = Util.stripLeadingAndTrailingQuotes("foo bar");
        assertEquals("foo bar", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_onlyLeadingQuote_removesLeadingOnly()
    {
        String result = Util.stripLeadingAndTrailingQuotes("\"foo bar");
        assertEquals("foo bar", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_onlyTrailingQuote_removesTrailingOnly()
    {
        String result = Util.stripLeadingAndTrailingQuotes("foo bar\"");
        assertEquals("foo bar", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_emptyString_returnsEmptyString()
    {
        String result = Util.stripLeadingAndTrailingQuotes("");
        assertEquals("", result);
    }

    @Test
    public void testStripLeadingAndTrailingQuotes_singleQuoteCharacter_returnsEmptyString()
    {
        String result = Util.stripLeadingAndTrailingQuotes("\"");
        assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void testStripLeadingAndTrailingQuotes_nullInput_throwsNullPointerException()
    {
        Util.stripLeadingAndTrailingQuotes(null);
    }
}
