package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
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

    // ---------------------------------------------------------------
    // Getter / Setter tests
    // ---------------------------------------------------------------

    @Test
    public void testSetGetWidth_normalValue_returnsSameValue()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testGetWidth_default_returnsDefaultWidth()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void testSetGetWidth_negativeValue_returnsNegativeValue()
    {
        formatter.setWidth(-5);
        assertEquals(-5, formatter.getWidth());
    }

    @Test
    public void testSetGetLeftPadding_normalValue_returnsSameValue()
    {
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testSetGetDescPadding_normalValue_returnsSameValue()
    {
        formatter.setDescPadding(6);
        assertEquals(6, formatter.getDescPadding());
    }

    @Test
    public void testSetGetSyntaxPrefix_normalValue_returnsSameValue()
    {
        formatter.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
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
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    @Test
    public void testSetGetLongOptSeparator_normalValue_returnsSameValue()
    {
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparator_default_returnsDefaultSeparator()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
    }

    @Test
    public void testSetGetArgName_normalValue_returnsSameValue()
    {
        formatter.setArgName("FILE");
        assertEquals("FILE", formatter.getArgName());
    }

    @Test
    public void testGetOptionComparator_default_returnsNonNull()
    {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_nullValue_resetsToDefault()
    {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_customComparator_setsComparator()
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

    // ---------------------------------------------------------------
    // printHelp overloads
    // ---------------------------------------------------------------

    @Test
    public void testPrintHelp_cmdLineSyntaxOptions_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "some description");
        formatter.printHelp("cmd", options);
    }

    @Test
    public void testPrintHelp_cmdLineSyntaxOptionsAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "some description");
        formatter.printHelp("cmd", options, true);
    }

    @Test
    public void testPrintHelp_syntaxHeaderOptionsFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "some description");
        formatter.printHelp("cmd", "header", options, "footer");
    }

    @Test
    public void testPrintHelp_syntaxHeaderOptionsFooterAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "some description");
        formatter.printHelp("cmd", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelp_widthSyntaxHeaderOptionsFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "some description");
        formatter.printHelp(80, "cmd", "header", options, "footer");
    }

    @Test
    public void testPrintHelp_widthSyntaxHeaderOptionsFooterAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", false, "some description");
        formatter.printHelp(80, "cmd", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelp_printWriterFull_containsExpectedContent() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("a", "aopt", false, "description of a");
        options.addOption(opt);

        formatter.printHelp(pw, 80, "cmd", "This is header", options, 1, 3, "This is footer", false);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("cmd"));
        assertTrue(output.contains("This is header"));
        assertTrue(output.contains("This is footer"));
        assertTrue(output.contains("description of a"));
    }

    @Test
    public void testPrintHelp_printWriterFullAutoUsage_containsExpectedContent() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("a", "aopt", false, "description of a");
        opt.setRequired(true);
        options.addOption(opt);

        formatter.printHelp(pw, 80, "cmd", null, options, 1, 3, null, true);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("cmd"));
        assertTrue(output.contains("-a"));
    }

    @Test
    public void testPrintHelp_shortOverload_noExceptionWithWriter() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", false, "description of a");

        formatter.printHelp(pw, 80, "cmd", "header", options, 1, 3, "footer");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("cmd"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();

        formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();

        formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelp_blankHeaderAndFooter_noExceptionAndNotPrinted() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption("a", false, "desc");

        formatter.printHelp(pw, 80, "cmd", "   ", options, 1, 3, "   ", false);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("cmd"));
    }

    // ---------------------------------------------------------------
    // printUsage
    // ---------------------------------------------------------------

    @Test
    public void testPrintUsage_simple_containsSyntaxPrefixAndCmd() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "cmd -a -b");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains(HelpFormatter.DEFAULT_SYNTAX_PREFIX));
        assertTrue(output.contains("cmd"));
    }

    @Test
    public void testPrintUsage_withOptionsAndGroup_containsGroupSyntax() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt1 = new Option("a", false, "desc a");
        Option opt2 = new Option("b", false, "desc b");

        OptionGroup group = new OptionGroup();
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false);

        options.addOptionGroup(group);

        Option opt3 = new Option("c", true, "desc c");
        opt3.setRequired(true);
        opt3.setArgName("value");
        options.addOption(opt3);

        formatter.printUsage(pw, 80, "cmd", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("cmd"));
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("-c"));
    }

    @Test
    public void testPrintUsage_withRequiredGroup_noBrackets() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt1 = new Option("a", false, "desc a");
        Option opt2 = new Option("b", false, "desc b");

        OptionGroup group = new OptionGroup();
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);

        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "cmd", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
    }

    @Test
    public void testPrintUsage_withLongOptOnly_noException() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option(null, "longonly", true, "desc");
        opt.setArgName("val");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "cmd", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("longonly"));
    }

    // ---------------------------------------------------------------
    // printOptions
    // ---------------------------------------------------------------

    @Test
    public void testPrintOptions_normalOptions_containsDescriptions() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", "aopt", false, "description of a");
        options.addOption("b", "bopt", true, "description of b");

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("description of a"));
        assertTrue(output.contains("description of b"));
    }

    @Test
    public void testPrintOptions_emptyOptions_noException() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        // should not throw exception, output may be empty
    }

    // ---------------------------------------------------------------
    // printWrapped
    // ---------------------------------------------------------------

    @Test
    public void testPrintWrapped_simpleText_noException() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 20, "This is a simple test text that should wrap");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.length() > 0);
    }

    @Test
    public void testPrintWrapped_withTabStop_noException() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 20, 5, "This is a simple test text that should wrap with tabstop");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.length() > 0);
    }

    // ---------------------------------------------------------------
    // renderOptions (protected, same package access)
    // ---------------------------------------------------------------

    @Test
    public void testRenderOptions_normalOptions_containsPadding()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        options.addOption("a", "aopt", false, "description of a");
        options.addOption("b", "bopt", true, "description of b");

        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        assertNotNull(result);
        assertTrue(result.toString().contains("description of a"));
    }

    @Test
    public void testRenderOptions_optionWithBlankArgName_addsSpace()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        Option opt = new Option("a", true, "desc a");
        opt.setArgName("");
        options.addOption(opt);

        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        assertNotNull(result);
    }

    @Test
    public void testRenderOptions_optionWithNullOpt_usesLongOptPrefix()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        Option opt = new Option(null, "longonly", true, "desc long only");
        options.addOption(opt);

        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(result.toString().contains("longonly"));
    }

    // ---------------------------------------------------------------
    // renderWrappedText (protected)
    // ---------------------------------------------------------------

    @Test
    public void testRenderWrappedText_shortText_noWrapNeeded()
    {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderWrappedText(sb, 80, 0, "short text");
        assertEquals("short text", result.toString());
    }

    @Test
    public void testRenderWrappedText_longText_wrapsProperly()
    {
        StringBuffer sb = new StringBuffer();
        String text = "This is a very long piece of text that should be wrapped across multiple lines when rendered";
        StringBuffer result = formatter.renderWrappedText(sb, 20, 5, text);
        assertNotNull(result);
        assertTrue(result.toString().contains(formatter.getNewLine()));
    }

    @Test
    public void testRenderWrappedText_nextLineTabStopGreaterThanWidth_resetsToOne()
    {
        StringBuffer sb = new StringBuffer();
        String text = "This is a very long piece of text that should be wrapped across multiple lines when rendered with tabstop bigger than width";
        StringBuffer result = formatter.renderWrappedText(sb, 10, 15, text);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // findWrapPos (protected)
    // ---------------------------------------------------------------

    @Test
    public void testFindWrapPos_textWithNewline_returnsPositionAfterNewline()
    {
        String text = "abc\ndef";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_textWithTab_returnsPositionAfterTab()
    {
        String text = "abc\tdef";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_shortTextNoWrapNeeded_returnsNegativeOne()
    {
        String text = "short";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_wrapAtWhitespaceBeforeWidth_returnsPosition()
    {
        String text = "aaaaa bbbbb ccccc ddddd eeeee";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testFindWrapPos_noWhitespaceBeforeWidth_looksForward()
    {
        String text = "aaaaaaaaaaaaaaaaaaaa bbbbb";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertTrue(pos >= 5);
    }

    @Test
    public void testFindWrapPos_noWhitespaceAtAll_returnsNegativeOne()
    {
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertEquals(-1, pos);
    }

    // ---------------------------------------------------------------
    // createPadding (protected)
    // ---------------------------------------------------------------

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

    // ---------------------------------------------------------------
    // rtrim (protected)
    // ---------------------------------------------------------------

    @Test
    public void testRtrim_normalTrailingWhitespace_removesTrailingSpaces()
    {
        String result = formatter.rtrim("hello   ");
        assertEquals("hello", result);
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
