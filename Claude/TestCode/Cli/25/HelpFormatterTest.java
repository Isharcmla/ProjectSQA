import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest
{
    private HelpFormatter helpFormatter;

    /**
     * Subclass to expose protected methods for direct testing
     */
    private static class TestableHelpFormatter extends HelpFormatter
    {
        public StringBuffer publicRenderWrappedText(StringBuffer sb, int width, int nextLineTabStop, String text)
        {
            return renderWrappedText(sb, width, nextLineTabStop, text);
        }

        public int publicFindWrapPos(String text, int width, int startPos)
        {
            return findWrapPos(text, width, startPos);
        }

        public String publicCreatePadding(int len)
        {
            return createPadding(len);
        }

        public String publicRtrim(String s)
        {
            return rtrim(s);
        }

        public StringBuffer publicRenderOptions(StringBuffer sb, int width, Options options, int leftPad, int descPad)
        {
            return renderOptions(sb, width, options, leftPad, descPad);
        }
    }

    @Before
    public void setUp()
    {
        helpFormatter = new HelpFormatter();
    }

    // ---------------------- Getter/Setter tests ----------------------

    @Test
    public void testSetGetWidth_normalValue_returnsSameValue()
    {
        helpFormatter.setWidth(100);
        assertEquals(100, helpFormatter.getWidth());
    }

    @Test
    public void testGetWidth_default_returnsDefaultWidth()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, helpFormatter.getWidth());
    }

    @Test
    public void testSetGetWidth_negativeValue_returnsSameValue()
    {
        helpFormatter.setWidth(-5);
        assertEquals(-5, helpFormatter.getWidth());
    }

    @Test
    public void testSetGetLeftPadding_normalValue_returnsSameValue()
    {
        helpFormatter.setLeftPadding(5);
        assertEquals(5, helpFormatter.getLeftPadding());
    }

    @Test
    public void testSetGetLeftPadding_zeroValue_returnsZero()
    {
        helpFormatter.setLeftPadding(0);
        assertEquals(0, helpFormatter.getLeftPadding());
    }

    @Test
    public void testSetGetDescPadding_normalValue_returnsSameValue()
    {
        helpFormatter.setDescPadding(10);
        assertEquals(10, helpFormatter.getDescPadding());
    }

    @Test
    public void testSetGetSyntaxPrefix_normalValue_returnsSameValue()
    {
        helpFormatter.setSyntaxPrefix("MyUsage: ");
        assertEquals("MyUsage: ", helpFormatter.getSyntaxPrefix());
    }

    @Test
    public void testSetGetSyntaxPrefix_emptyString_returnsEmptyString()
    {
        helpFormatter.setSyntaxPrefix("");
        assertEquals("", helpFormatter.getSyntaxPrefix());
    }

    @Test
    public void testSetGetNewLine_normalValue_returnsSameValue()
    {
        helpFormatter.setNewLine("\r\n");
        assertEquals("\r\n", helpFormatter.getNewLine());
    }

    @Test
    public void testSetGetOptPrefix_normalValue_returnsSameValue()
    {
        helpFormatter.setOptPrefix("/");
        assertEquals("/", helpFormatter.getOptPrefix());
    }

    @Test
    public void testSetGetLongOptPrefix_normalValue_returnsSameValue()
    {
        helpFormatter.setLongOptPrefix("==");
        assertEquals("==", helpFormatter.getLongOptPrefix());
    }

    @Test
    public void testSetGetArgName_normalValue_returnsSameValue()
    {
        helpFormatter.setArgName("myArg");
        assertEquals("myArg", helpFormatter.getArgName());
    }

    @Test
    public void testSetGetArgName_emptyString_returnsEmptyString()
    {
        helpFormatter.setArgName("");
        assertEquals("", helpFormatter.getArgName());
    }

    @Test
    public void testGetOptionComparator_default_notNull()
    {
        assertNotNull(helpFormatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_nullValue_resetsToDefault()
    {
        helpFormatter.setOptionComparator(null);
        assertNotNull(helpFormatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_customComparator_usesCustom()
    {
        Comparator custom = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        };
        helpFormatter.setOptionComparator(custom);
        assertSame(custom, helpFormatter.getOptionComparator());
    }

    // ---------------------- printHelp tests ----------------------

    @Test
    public void testPrintHelp_simpleSyntaxAndOptions_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        helpFormatter.printHelp("app", options);
    }

    @Test
    public void testPrintHelp_withAutoUsageTrue_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        helpFormatter.printHelp("app", options, true);
    }

    @Test
    public void testPrintHelp_withAutoUsageFalse_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        helpFormatter.printHelp("app", options, false);
    }

    @Test
    public void testPrintHelp_withHeaderFooter_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        helpFormatter.printHelp("app", "header text", options, "footer text");
    }

    @Test
    public void testPrintHelp_withHeaderFooterAutoUsage_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        helpFormatter.printHelp("app", "header text", options, "footer text", true);
    }

    @Test
    public void testPrintHelp_withWidthHeaderFooter_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        helpFormatter.printHelp(80, "app", "header text", options, "footer text");
    }

    @Test
    public void testPrintHelp_withWidthHeaderFooterAutoUsage_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        helpFormatter.printHelp(80, "app", "header text", options, "footer text", true);
    }

    @Test
    public void testPrintHelp_withPrintWriter_producesOutput()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer");
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintHelp_withPrintWriterAutoUsage_producesOutput()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer", true);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException()
    {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException()
    {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelp_nullHeaderFooter_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();
        assertNotNull(sw.toString());
    }

    @Test
    public void testPrintHelp_emptyHeaderFooter_doesNotThrow()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "   ", false);
        pw.flush();
        assertNotNull(sw.toString());
    }

    // ---------------------- printUsage tests ----------------------

    @Test
    public void testPrintUsage_withOptions_producesOutput()
    {
        Options options = new Options();
        Option opt = new Option("a", "all", false, "do everything");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("usage:"));
    }

    @Test
    public void testPrintUsage_withRequiredOption_producesOutput()
    {
        Options options = new Options();
        Option opt = new Option("a", "all", false, "do everything");
        opt.setRequired(true);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintUsage_withOptionGroup_producesOutput()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "aaa", false, "option a");
        Option opt2 = new Option("b", "bbb", false, "option b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintUsage_withOptionalOptionGroup_producesOutput()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "aaa", false, "option a");
        Option opt2 = new Option("b", "bbb", false, "option b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("["));
    }

    @Test
    public void testPrintUsage_optionWithArg_producesOutputWithArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "input file");
        opt.setArgName("FILE");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("FILE"));
    }

    @Test
    public void testPrintUsage_optionWithLongOptOnly_producesOutput()
    {
        Options options = new Options();
        Option opt = new Option(null, "longonly", false, "long option only");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("--longonly"));
    }

    @Test
    public void testPrintUsage_simpleSyntax_producesOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app arg1 arg2");
        pw.flush();
        assertTrue(sw.toString().contains("usage: app"));
    }

    @Test
    public void testPrintUsage_singleWordSyntax_producesOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printUsage(pw, 80, "app");
        pw.flush();
        assertTrue(sw.toString().contains("app"));
    }

    // ---------------------- printOptions tests ----------------------

    @Test
    public void testPrintOptions_normalOptions_producesOutput()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        options.addOption("b", "bbb", true, "with argument");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintOptions_emptyOptions_doesNotThrow()
    {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertNotNull(sw.toString());
    }

    @Test
    public void testPrintOptions_optionWithoutLongOpt_producesOutput()
    {
        Options options = new Options();
        options.addOption("x", false, "simple option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(sw.toString().contains("-x"));
    }

    @Test
    public void testPrintOptions_optionWithArgNoArgName_producesOutput()
    {
        Options options = new Options();
        Option opt = new Option("f", true, "file option");
        opt.setArgName(null);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintOptions_optionWithLongOptOnly_producesOutput()
    {
        Options options = new Options();
        Option opt = new Option(null, "longopt", false, "description here");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(sw.toString().contains("--longopt"));
    }

    @Test
    public void testPrintOptions_optionWithNullDescription_doesNotThrow()
    {
        Options options = new Options();
        Option opt = new Option("n", false, null);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertNotNull(sw.toString());
    }

    // ---------------------- printWrapped tests ----------------------

    @Test
    public void testPrintWrapped_simpleText_producesOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printWrapped(pw, 20, "This is a short sample text for wrapping.");
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintWrapped_withTabStop_producesOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printWrapped(pw, 20, 5, "This is a longer sample text for wrapping with tab stop.");
        pw.flush();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintWrapped_shortTextNoWrap_producesOutput()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printWrapped(pw, 80, "short text");
        pw.flush();
        assertTrue(sw.toString().contains("short text"));
    }

    @Test
    public void testPrintWrapped_emptyText_doesNotThrow()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        helpFormatter.printWrapped(pw, 80, "");
        pw.flush();
        assertNotNull(sw.toString());
    }

    // ---------------------- Protected method tests via subclass ----------------------

    @Test
    public void testRenderWrappedText_shortText_noWrapNeeded()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        StringBuffer sb = new StringBuffer();
        formatter.publicRenderWrappedText(sb, 80, 0, "short text");
        assertEquals("short text", sb.toString());
    }

    @Test
    public void testRenderWrappedText_longText_wrapsCorrectly()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        StringBuffer sb = new StringBuffer();
        String longText = "This is a very long piece of text that should definitely wrap around multiple lines when rendered.";
        formatter.publicRenderWrappedText(sb, 20, 5, longText);
        assertTrue(sb.toString().length() > 0);
        assertTrue(sb.toString().contains(formatter.getNewLine()));
    }

    @Test
    public void testRenderWrappedText_nextLineTabStopGreaterThanWidth_handlesGracefully()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        StringBuffer sb = new StringBuffer();
        String longText = "This is a very long piece of text that should wrap with tab stop equal to width.";
        formatter.publicRenderWrappedText(sb, 10, 15, longText);
        assertTrue(sb.toString().length() > 0);
    }

    @Test
    public void testRenderWrappedText_textWithNewline_wrapsAtNewline()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        StringBuffer sb = new StringBuffer();
        String textWithNewline = "First line\nSecond line";
        formatter.publicRenderWrappedText(sb, 80, 0, textWithNewline);
        assertTrue(sb.toString().contains("First line"));
    }

    @Test
    public void testFindWrapPos_textWithNewlineWithinWidth_returnsPositionAfterNewline()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        int pos = formatter.publicFindWrapPos("abc\ndef", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_textWithTabWithinWidth_returnsPositionAfterTab()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        int pos = formatter.publicFindWrapPos("abc\tdef", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_shortTextWithinWidth_returnsNegativeOne()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        int pos = formatter.publicFindWrapPos("short", 80, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_longTextWithSpace_findsLastWhitespaceBeforeWidth()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String text = "1234567890 1234567890 1234567890";
        int pos = formatter.publicFindWrapPos(text, 15, 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testFindWrapPos_noWhitespaceBeforeWidth_looksForwardForWhitespace()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String text = "12345678901234567890 1234567890";
        int pos = formatter.publicFindWrapPos(text, 5, 0);
        assertTrue(pos >= 0);
    }

    @Test
    public void testFindWrapPos_noWhitespaceAtAll_returnsNegativeOne()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String text = "1234567890123456789012345678901234567890";
        int pos = formatter.publicFindWrapPos(text, 5, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testCreatePadding_positiveLength_returnsCorrectLength()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String padding = formatter.publicCreatePadding(5);
        assertEquals(5, padding.length());
        assertEquals("     ", padding);
    }

    @Test
    public void testCreatePadding_zeroLength_returnsEmptyString()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String padding = formatter.publicCreatePadding(0);
        assertEquals("", padding);
    }

    @Test
    public void testRtrim_trailingWhitespace_removesTrailingWhitespace()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String result = formatter.publicRtrim("hello   ");
        assertEquals("hello", result);
    }

    @Test
    public void testRtrim_nullString_returnsNull()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String result = formatter.publicRtrim(null);
        assertNull(result);
    }

    @Test
    public void testRtrim_emptyString_returnsEmptyString()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String result = formatter.publicRtrim("");
        assertEquals("", result);
    }

    @Test
    public void testRtrim_noTrailingWhitespace_returnsUnchanged()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        String result = formatter.publicRtrim("hello");
        assertEquals("hello", result);
    }

    @Test
    public void testRenderOptions_withOptions_returnsPopulatedBuffer()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        Options options = new Options();
        options.addOption("a", "all", false, "do everything");
        options.addOption("b", "bbb", true, "with argument");
        StringBuffer sb = new StringBuffer();
        formatter.publicRenderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testRenderOptions_emptyOptions_returnsEmptyBuffer()
    {
        TestableHelpFormatter formatter = new TestableHelpFormatter();
        Options options = new Options();
        StringBuffer sb = new StringBuffer();
        formatter.publicRenderOptions(sb, 80, options, 1, 3);
        assertEquals(0, sb.length());
    }
}
