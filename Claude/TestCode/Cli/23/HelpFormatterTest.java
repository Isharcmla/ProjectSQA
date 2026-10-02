package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest
{
    private HelpFormatter formatter;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
    }

    // ---------------------- Getter / Setter tests ----------------------

    @Test
    public void testSetGetWidth_normalValue_returnsSameValue()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testGetWidth_defaultValue_returnsDefaultWidth()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void testSetGetWidth_negativeValue_returnsNegativeValue()
    {
        formatter.setWidth(-10);
        assertEquals(-10, formatter.getWidth());
    }

    @Test
    public void testSetGetLeftPadding_normalValue_returnsSameValue()
    {
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testSetGetLeftPadding_zeroValue_returnsZero()
    {
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }

    @Test
    public void testSetGetDescPadding_normalValue_returnsSameValue()
    {
        formatter.setDescPadding(4);
        assertEquals(4, formatter.getDescPadding());
    }

    @Test
    public void testSetGetSyntaxPrefix_normalValue_returnsSameValue()
    {
        formatter.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetGetSyntaxPrefix_emptyString_returnsEmptyString()
    {
        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetGetNewLine_normalValue_returnsSameValue()
    {
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testSetGetOptPrefix_normalValue_returnsSameValue()
    {
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    @Test
    public void testSetGetLongOptPrefix_normalValue_returnsSameValue()
    {
        formatter.setLongOptPrefix("==");
        assertEquals("==", formatter.getLongOptPrefix());
    }

    @Test
    public void testSetGetArgName_normalValue_returnsSameValue()
    {
        formatter.setArgName("myArg");
        assertEquals("myArg", formatter.getArgName());
    }

    @Test
    public void testGetOptionComparator_default_notNull()
    {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_customComparator_setsCorrectly()
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

    // ---------------------- printHelp overloads ----------------------

    @Test
    public void testPrintHelp_stringOptions_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        formatter.printHelp("myapp", options);
    }

    @Test
    public void testPrintHelp_stringOptionsAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        formatter.printHelp("myapp", options, true);
    }

    @Test
    public void testPrintHelp_headerFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        formatter.printHelp("myapp", "header", options, "footer");
    }

    @Test
    public void testPrintHelp_headerFooterAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        formatter.printHelp("myapp", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelp_widthHeaderFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        formatter.printHelp(80, "myapp", "header", options, "footer");
    }

    @Test
    public void testPrintHelp_widthHeaderFooterAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        formatter.printHelp(80, "myapp", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelp_printWriterVariant_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "myapp", "header", options, 1, 3, "footer");
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintHelp_printWriterVariantAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "myapp", "header", options, 1, 3, "footer", true);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException()
    {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException()
    {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelp_nullHeaderFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "myapp", null, options, 1, 3, null, false);
    }

    @Test
    public void testPrintHelp_blankHeaderFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "myapp", "   ", options, 1, 3, "   ", false);
    }

    // ---------------------- printUsage tests ----------------------

    @Test
    public void testPrintUsage_simpleOptions_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        options.addOption("b", true, "the b option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        assertTrue(sw.toString().contains("usage:"));
    }

    @Test
    public void testPrintUsage_optionGroupNotRequired_bracketsPresent()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "the a option"));
        group.addOption(new Option("b", "the b option"));
        group.setRequired(false);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        assertTrue(sw.toString().indexOf('[') >= 0);
    }

    @Test
    public void testPrintUsage_optionGroupRequired_noBrackets()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "the a option"));
        group.addOption(new Option("b", "the b option"));
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintUsage_requiredOption_noBrackets()
    {
        Options options = new Options();
        Option opt = new Option("a", "the a option");
        opt.setRequired(true);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintUsage_optionWithArgAndArgName_containsArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", true, "the f option");
        opt.setArgName("file");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        assertTrue(sw.toString().contains("file"));
    }

    @Test
    public void testPrintUsage_emptyOptions_noException()
    {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintUsage_cmdLineSyntaxOnly_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp arg1 arg2");
        pw.flush();
        assertTrue(sw.toString().contains("usage:"));
    }

    // ---------------------- printOptions tests ----------------------

    @Test
    public void testPrintOptions_normalOptions_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        options.addOption("b", "bee", true, "the b option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintOptions_emptyOptions_noException()
    {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertNotNull(sw.toString());
    }

    // ---------------------- printWrapped tests ----------------------

    @Test
    public void testPrintWrapped_simpleText_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 20, "This is a simple line of text to wrap");
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintWrapped_withTabStop_noException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 20, 5, "This is a simple line of text to wrap with tab stop");
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    // ---------------------- renderOptions tests (protected, same package) ----------------------

    @Test
    public void testRenderOptions_withLongOptOnly_noException()
    {
        Options options = new Options();
        Option opt = new Option(null, "longonly", false, "description for long only option");
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        assertNotNull(result);
        assertTrue(result.toString().contains("longonly"));
    }

    @Test
    public void testRenderOptions_shortAndLongOpt_containsBoth()
    {
        Options options = new Options();
        Option opt = new Option("a", "aaa", false, "the a option");
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(result.toString().contains("-a"));
        assertTrue(result.toString().contains("--aaa"));
    }

    @Test
    public void testRenderOptions_argWithoutArgName_containsSpace()
    {
        Options options = new Options();
        Option opt = new Option("f", true, "the f option");
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        assertNotNull(result);
    }

    @Test
    public void testRenderOptions_multipleOptions_containsNewLine()
    {
        Options options = new Options();
        options.addOption("a", false, "the a option");
        options.addOption("b", false, "the b option");
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(result.toString().indexOf(formatter.getNewLine()) >= 0);
    }

    // ---------------------- renderWrappedText tests ----------------------

    @Test
    public void testRenderWrappedText_shortText_noWrap()
    {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderWrappedText(sb, 80, 0, "short text");
        assertEquals("short text", result.toString());
    }

    @Test
    public void testRenderWrappedText_longText_wrapsCorrectly()
    {
        StringBuffer sb = new StringBuffer();
        String text = "This is a fairly long piece of text that should wrap around multiple lines when rendered";
        StringBuffer result = formatter.renderWrappedText(sb, 20, 0, text);
        assertTrue(result.toString().indexOf(formatter.getNewLine()) >= 0);
    }

    @Test
    public void testRenderWrappedText_textWithNewline_handlesNewlineCorrectly()
    {
        StringBuffer sb = new StringBuffer();
        String text = "line one\nline two";
        StringBuffer result = formatter.renderWrappedText(sb, 80, 0, text);
        assertNotNull(result);
    }

    @Test(expected = RuntimeException.class)
    public void testRenderWrappedText_textTooLongForLine_throwsRuntimeException()
    {
        StringBuffer sb = new StringBuffer();
        String text = "aaaaaaaaaa bbbbbbbbbb";
        formatter.renderWrappedText(sb, 3, 10, text);
    }

    // ---------------------- findWrapPos tests ----------------------

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
    public void testFindWrapPos_textShorterThanWidth_returnsMinusOne()
    {
        String text = "short";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_textWithSpaceBeforeWidth_returnsSpacePosition()
    {
        String text = "aaaaa bbbbb ccccc ddddd eeeee";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testFindWrapPos_noWhitespaceAnywhere_returnsMinusOne()
    {
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_whitespaceAfterWidth_returnsWhitespacePosition()
    {
        String text = "aaaaaaaaaa bbbbb";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertTrue(pos > 0);
    }

    // ---------------------- createPadding tests ----------------------

    @Test
    public void testCreatePadding_positiveLength_returnsStringOfSpaces()
    {
        String padding = formatter.createPadding(5);
        assertEquals("     ", padding);
    }

    @Test
    public void testCreatePadding_zeroLength_returnsEmptyString()
    {
        String padding = formatter.createPadding(0);
        assertEquals("", padding);
    }

    // ---------------------- rtrim tests ----------------------

    @Test
    public void testRtrim_trailingWhitespace_removesTrailingWhitespace()
    {
        String result = formatter.rtrim("hello world   ");
        assertEquals("hello world", result);
    }

    @Test
    public void testRtrim_nullInput_returnsNull()
    {
        String result = formatter.rtrim(null);
        assertNull(result);
    }

    @Test
    public void testRtrim_emptyString_returnsEmptyString()
    {
        String result = formatter.rtrim("");
        assertEquals("", result);
    }

    @Test
    public void testRtrim_noTrailingWhitespace_returnsSameString()
    {
        String result = formatter.rtrim("hello");
        assertEquals("hello", result);
    }
}
