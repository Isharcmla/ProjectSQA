package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private PrintStream originalOut;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        originalOut = System.out;
    }

    @After
    public void tearDown()
    {
        System.setOut(originalOut);
    }

    // ---------------------------------------------------------------
    // Constants
    // ---------------------------------------------------------------

    @Test
    public void testConstants_defaultValues_correct()
    {
        assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
        assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
        assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
        assertEquals("usage: ", HelpFormatter.DEFAULT_SYNTAX_PREFIX);
        assertEquals("-", HelpFormatter.DEFAULT_OPT_PREFIX);
        assertEquals("--", HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        assertEquals(" ", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        assertEquals("arg", HelpFormatter.DEFAULT_ARG_NAME);
    }

    // ---------------------------------------------------------------
    // Getters / Setters
    // ---------------------------------------------------------------

    @Test
    public void testSetWidth_normalValue_getWidthReturnsSame()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testSetWidth_zeroValue_getWidthReturnsZero()
    {
        formatter.setWidth(0);
        assertEquals(0, formatter.getWidth());
    }

    @Test
    public void testSetWidth_negativeValue_getWidthReturnsNegative()
    {
        formatter.setWidth(-5);
        assertEquals(-5, formatter.getWidth());
    }

    @Test
    public void testGetWidth_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void testSetLeftPadding_normalValue_getLeftPaddingReturnsSame()
    {
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPadding_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    @Test
    public void testSetDescPadding_normalValue_getDescPaddingReturnsSame()
    {
        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPadding_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    @Test
    public void testSetSyntaxPrefix_normalValue_getSyntaxPrefixReturnsSame()
    {
        formatter.setSyntaxPrefix("run: ");
        assertEquals("run: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetSyntaxPrefix_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetNewLine_normalValue_getNewLineReturnsSame()
    {
        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());
    }

    @Test
    public void testGetNewLine_default_returnsSystemLineSeparator()
    {
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
    }

    @Test
    public void testSetOptPrefix_normalValue_getOptPrefixReturnsSame()
    {
        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefix_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    @Test
    public void testSetLongOptPrefix_normalValue_getLongOptPrefixReturnsSame()
    {
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefix_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptSeparator_normalValue_getLongOptSeparatorReturnsSame()
    {
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparator_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
    }

    @Test
    public void testSetArgName_normalValue_getArgNameReturnsSame()
    {
        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testGetArgName_default_returnsDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    @Test
    public void testGetOptionComparator_default_notNull()
    {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_customComparator_getOptionComparatorReturnsSame()
    {
        Comparator custom = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        };
        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_null_resetsToDefaultComparator()
    {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    // ---------------------------------------------------------------
    // printHelp overloads (writing directly to System.out)
    // ---------------------------------------------------------------

    @Test
    public void testPrintHelp_simpleSyntaxAndOptions_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp("app", options);

        String output = baos.toString();
        assertTrue(output.length() > 0);
    }

    @Test
    public void testPrintHelp_withAutoUsage_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp("app", options, true);

        String output = baos.toString();
        assertTrue(output.length() > 0);
    }

    @Test
    public void testPrintHelp_withHeaderAndFooter_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp("app", "header text", options, "footer text");

        String output = baos.toString();
        assertTrue(output.contains("header text"));
        assertTrue(output.contains("footer text"));
    }

    @Test
    public void testPrintHelp_withHeaderFooterAutoUsage_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp("app", "header text", options, "footer text", true);

        String output = baos.toString();
        assertTrue(output.contains("header text"));
        assertTrue(output.contains("footer text"));
    }

    @Test
    public void testPrintHelp_withWidthHeaderFooter_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp(80, "app", "header", options, "footer");

        String output = baos.toString();
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
    }

    @Test
    public void testPrintHelp_withWidthHeaderFooterAutoUsage_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp(80, "app", "header", options, "footer", true);

        String output = baos.toString();
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
    }

    // ---------------------------------------------------------------
    // printHelp with PrintWriter
    // ---------------------------------------------------------------

    @Test
    public void testPrintHelp_withPrintWriter_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
    }

    @Test
    public void testPrintHelp_withPrintWriterAndAutoUsage_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer", true);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
    }

    @Test
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();

        try
        {
            formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }

    @Test
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();

        try
        {
            formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }

    @Test
    public void testPrintHelp_nullHeaderFooter_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();

        String output = sw.toString();
        assertNotNull(output);
    }

    @Test
    public void testPrintHelp_blankHeaderFooter_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", false, "some description");

        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "   ", false);
        pw.flush();

        String output = sw.toString();
        assertNotNull(output);
    }

    // ---------------------------------------------------------------
    // printUsage
    // ---------------------------------------------------------------

    @Test
    public void testPrintUsage_simpleCmdLineSyntax_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "app -a -b");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("usage:"));
        assertTrue(output.contains("app"));
    }

    @Test
    public void testPrintUsage_withOptionsNoGroup_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("a", "aaa", false, "description");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-a"));
    }

    @Test
    public void testPrintUsage_withRequiredOption_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("a", "aaa", false, "description");
        opt.setRequired(true);
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-a"));
        assertFalse(output.contains("[-a]"));
    }

    @Test
    public void testPrintUsage_withOptionGroupRequired_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "aaa", false, "description a");
        Option opt2 = new Option("b", "bbb", false, "description b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("|"));
    }

    @Test
    public void testPrintUsage_withOptionGroupNotRequired_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "aaa", false, "description a");
        Option opt2 = new Option("b", "bbb", false, "description b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("["));
        assertTrue(output.contains("]"));
    }

    @Test
    public void testPrintUsage_optionWithArgAndArgName_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("f", "file", true, "file to use");
        opt.setArgName("FILE");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("<FILE>"));
    }

    @Test
    public void testPrintUsage_optionWithArgNoArgName_usesDefaultArgName()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("f", "file", true, "file to use");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("<") && output.contains(">"));
    }

    @Test
    public void testPrintUsage_optionWithLongOptOnly_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option(null, "long-only", false, "description");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("--long-only"));
    }

    // ---------------------------------------------------------------
    // printOptions
    // ---------------------------------------------------------------

    @Test
    public void testPrintOptions_withOptions_correctOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", false, "description a");
        options.addOption("b", "bbb", true, "description b");

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
    }

    @Test
    public void testPrintOptions_emptyOptions_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        assertNotNull(sw.toString());
    }

    // ---------------------------------------------------------------
    // printWrapped
    // ---------------------------------------------------------------

    @Test
    public void testPrintWrapped_shortText_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 80, "short text");
        pw.flush();

        assertTrue(sw.toString().contains("short text"));
    }

    @Test
    public void testPrintWrapped_withTabStop_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 20, 5, "this is a long text that should wrap around multiple lines");
        pw.flush();

        assertTrue(sw.toString().length() > 0);
    }

    // ---------------------------------------------------------------
    // Protected methods (accessible via same package)
    // ---------------------------------------------------------------

    @Test
    public void testRenderOptions_withOptions_returnsNonEmptyBuffer()
    {
        Options options = new Options();
        options.addOption("a", false, "description a");
        options.addOption("b", "bbb", true, "description b");

        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);

        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testRenderOptions_optionWithBlankArgName_correctOutput()
    {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file description");
        opt.setArgName("");
        options.addOption(opt);

        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);

        assertNotNull(result);
    }

    @Test
    public void testRenderOptions_optionWithNullOpt_correctOutput()
    {
        Options options = new Options();
        Option opt = new Option(null, "longonly", false, "description");
        options.addOption(opt);

        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);

        assertTrue(result.toString().contains("longonly"));
    }

    @Test
    public void testRenderWrappedText_shortText_returnsSameText()
    {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderWrappedText(sb, 80, 0, "short text");

        assertEquals("short text", result.toString());
    }

    @Test
    public void testRenderWrappedText_longTextWithWrap_wrapsCorrectly()
    {
        StringBuffer sb = new StringBuffer();
        String longText = "this is a very long piece of text that will need to be wrapped multiple times across several lines";
        StringBuffer result = formatter.renderWrappedText(sb, 20, 5, longText);

        assertTrue(result.length() > 0);
        assertTrue(result.toString().contains(formatter.getNewLine()));
    }

    @Test
    public void testRenderWrappedText_tabStopGreaterThanWidth_handlesGracefully()
    {
        StringBuffer sb = new StringBuffer();
        String longText = "this is a very long piece of text that will need to be wrapped multiple times";
        StringBuffer result = formatter.renderWrappedText(sb, 20, 25, longText);

        assertTrue(result.length() > 0);
    }

    @Test
    public void testFindWrapPos_textWithNewlineWithinWidth_returnsPositionAfterNewline()
    {
        String text = "abc\ndef";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_textWithTabWithinWidth_returnsPositionAfterTab()
    {
        String text = "abc\tdef";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_shortTextWithinWidth_returnsNegativeOne()
    {
        String text = "short";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_longTextWithWhitespace_returnsWrapPosition()
    {
        String text = "aaaaaaaaaa bbbbbbbbbb cccccccccc";
        int pos = formatter.findWrapPos(text, 15, 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testFindWrapPos_longTextNoWhitespaceBeforeWidth_chopsAtWidthOrBeyond()
    {
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testCreatePadding_positiveLength_returnsCorrectLengthString()
    {
        String padding = formatter.createPadding(5);
        assertEquals(5, padding.length());
        assertEquals("     ", padding);
    }

    @Test
    public void testCreatePadding_zeroLength_returnsEmptyString()
    {
        String padding = formatter.createPadding(0);
        assertEquals("", padding);
    }

    @Test
    public void testRtrim_nullInput_returnsNull()
    {
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void testRtrim_emptyInput_returnsEmpty()
    {
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void testRtrim_trailingWhitespace_returnsTrimmedString()
    {
        assertEquals("abc", formatter.rtrim("abc   "));
    }

    @Test
    public void testRtrim_noTrailingWhitespace_returnsSameString()
    {
        assertEquals("abc", formatter.rtrim("abc"));
    }

    @Test
    public void testRtrim_allWhitespace_returnsEmptyString()
    {
        assertEquals("", formatter.rtrim("   "));
    }
}
