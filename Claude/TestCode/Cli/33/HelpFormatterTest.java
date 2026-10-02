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
    private HelpFormatter helpFormatter;
    private PrintStream originalOut;

    @Before
    public void setUp()
    {
        helpFormatter = new HelpFormatter();
        originalOut = System.out;
    }

    @After
    public void tearDown()
    {
        System.setOut(originalOut);
    }

    // ---------------------- Default values ----------------------

    @Test
    public void testDefaultValues_initialState_matchesConstants()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, helpFormatter.getWidth());
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, helpFormatter.getLeftPadding());
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, helpFormatter.getDescPadding());
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, helpFormatter.getSyntaxPrefix());
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, helpFormatter.getOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, helpFormatter.getLongOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, helpFormatter.getLongOptSeparator());
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, helpFormatter.getArgName());
        assertNotNull(helpFormatter.getOptionComparator());
    }

    // ---------------------- Getter/Setter ----------------------

    @Test
    public void testSetWidth_normalValue_getWidthReturnsSameValue()
    {
        helpFormatter.setWidth(100);
        assertEquals(100, helpFormatter.getWidth());
    }

    @Test
    public void testSetWidth_negativeValue_getWidthReturnsNegative()
    {
        helpFormatter.setWidth(-5);
        assertEquals(-5, helpFormatter.getWidth());
    }

    @Test
    public void testSetLeftPadding_normalValue_getLeftPaddingReturnsSameValue()
    {
        helpFormatter.setLeftPadding(5);
        assertEquals(5, helpFormatter.getLeftPadding());
    }

    @Test
    public void testSetDescPadding_normalValue_getDescPaddingReturnsSameValue()
    {
        helpFormatter.setDescPadding(7);
        assertEquals(7, helpFormatter.getDescPadding());
    }

    @Test
    public void testSetSyntaxPrefix_normalValue_getSyntaxPrefixReturnsSameValue()
    {
        helpFormatter.setSyntaxPrefix("myprefix: ");
        assertEquals("myprefix: ", helpFormatter.getSyntaxPrefix());
    }

    @Test
    public void testSetNewLine_normalValue_getNewLineReturnsSameValue()
    {
        helpFormatter.setNewLine("\r\n");
        assertEquals("\r\n", helpFormatter.getNewLine());
    }

    @Test
    public void testSetOptPrefix_normalValue_getOptPrefixReturnsSameValue()
    {
        helpFormatter.setOptPrefix("/");
        assertEquals("/", helpFormatter.getOptPrefix());
    }

    @Test
    public void testSetLongOptPrefix_normalValue_getLongOptPrefixReturnsSameValue()
    {
        helpFormatter.setLongOptPrefix("==");
        assertEquals("==", helpFormatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptSeparator_normalValue_getLongOptSeparatorReturnsSameValue()
    {
        helpFormatter.setLongOptSeparator("=");
        assertEquals("=", helpFormatter.getLongOptSeparator());
    }

    @Test
    public void testSetArgName_normalValue_getArgNameReturnsSameValue()
    {
        helpFormatter.setArgName("myArg");
        assertEquals("myArg", helpFormatter.getArgName());
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
        helpFormatter.setOptionComparator(custom);
        assertSame(custom, helpFormatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_null_resetsToDefaultComparator()
    {
        Comparator custom = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        };
        helpFormatter.setOptionComparator(custom);
        helpFormatter.setOptionComparator(null);
        assertNotSame(custom, helpFormatter.getOptionComparator());
        assertNotNull(helpFormatter.getOptionComparator());
    }

    // ---------------------- printHelp overloads ----------------------

    @Test
    public void testPrintHelp_simpleOverload_printsToSystemOut()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp("cmdSyntax", options);

        String output = baos.toString();
        assertTrue(output.contains("cmdSyntax"));
        assertTrue(output.contains("-a"));
    }

    @Test
    public void testPrintHelp_withAutoUsageTrue_printsAutoGeneratedUsage()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp("cmdSyntax", options, true);

        String output = baos.toString();
        assertTrue(output.contains("cmdSyntax"));
    }

    @Test
    public void testPrintHelp_withHeaderFooter_printsHeaderAndFooter()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp("cmdSyntax", "myHeader", options, "myFooter");

        String output = baos.toString();
        assertTrue(output.contains("myHeader"));
        assertTrue(output.contains("myFooter"));
    }

    @Test
    public void testPrintHelp_withHeaderFooterAutoUsage_printsCorrectly()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp("cmdSyntax", "myHeader", options, "myFooter", true);

        String output = baos.toString();
        assertTrue(output.contains("myHeader"));
        assertTrue(output.contains("myFooter"));
    }

    @Test
    public void testPrintHelp_withWidth_printsCorrectly()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp(80, "cmdSyntax", "myHeader", options, "myFooter");

        String output = baos.toString();
        assertTrue(output.contains("myHeader"));
        assertTrue(output.contains("myFooter"));
    }

    @Test
    public void testPrintHelp_withWidthAndAutoUsage_printsCorrectly()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp(80, "cmdSyntax", "myHeader", options, "myFooter", true);

        String output = baos.toString();
        assertTrue(output.contains("myHeader"));
        assertTrue(output.contains("myFooter"));
    }

    @Test
    public void testPrintHelp_withPrintWriter_printsCorrectly()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp(pw, 80, "cmdSyntax", "myHeader", options, 1, 3, "myFooter");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("myHeader"));
        assertTrue(output.contains("myFooter"));
    }

    @Test
    public void testPrintHelp_withPrintWriterAndAutoUsage_printsCorrectly()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp(pw, 80, "cmdSyntax", "myHeader", options, 1, 3, "myFooter", true);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("myHeader"));
        assertTrue(output.contains("myFooter"));
    }

    @Test
    public void testPrintHelp_nullHeaderAndFooter_noExceptionThrown()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp(pw, 80, "cmdSyntax", null, options, 1, 3, null, false);
        pw.flush();

        String output = sw.toString();
        assertNotNull(output);
    }

    @Test
    public void testPrintHelp_blankHeaderAndFooter_noExceptionThrown()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");

        helpFormatter.printHelp(pw, 80, "cmdSyntax", "   ", options, 1, 3, "   ", false);
        pw.flush();

        String output = sw.toString();
        assertNotNull(output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        helpFormatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        helpFormatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
    }

    // ---------------------- printUsage ----------------------

    @Test
    public void testPrintUsage_withOptions_printsUsageWithOptions()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");
        options.addOption(Option.builder("b").longOpt("bbb").hasArg().argName("arg").desc("desc b").build() == null ? new Option("b", "bbb", true, "desc b") : new Option("b", "bbb", true, "desc b"));

        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("usage: app"));
    }

    @Test
    public void testPrintUsage_withRequiredOption_printsWithoutBrackets()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("r", "required", false, "a required option");
        opt.setRequired(true);
        options.addOption(opt);

        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-r"));
        assertFalse(output.contains("[-r]"));
    }

    @Test
    public void testPrintUsage_withOptionGroupRequired_printsCorrectly() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", "xxx", false, "x desc"));
        group.addOption(new Option("y", "yyy", false, "y desc"));
        group.setRequired(true);
        options.addOptionGroup(group);

        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-x"));
        assertTrue(output.contains("-y"));
        assertFalse(output.contains("[-x"));
    }

    @Test
    public void testPrintUsage_withOptionGroupNotRequired_printsWithBrackets() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", "xxx", false, "x desc"));
        group.addOption(new Option("y", "yyy", false, "y desc"));
        group.setRequired(false);
        options.addOptionGroup(group);

        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("[-x"));
    }

    @Test
    public void testPrintUsage_optionWithArgAndArgName_printsArgName() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("f", "file", true, "file desc");
        opt.setArgName("FILE");
        options.addOption(opt);

        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("<FILE>"));
    }

    @Test
    public void testPrintUsage_optionWithLongOptOnly_printsLongOpt() throws Exception
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option(null, "longonly", true, "desc");
        opt.setArgName("VAL");
        options.addOption(opt);

        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("--longonly"));
    }

    @Test
    public void testPrintUsage_simpleOverload_printsUsage()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        helpFormatter.printUsage(pw, 80, "app -a -b");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("usage: app -a -b"));
    }

    // ---------------------- printOptions ----------------------

    @Test
    public void testPrintOptions_withOptions_printsCorrectly()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");
        Option opt2 = new Option("b", "bbb", true, "description of b");
        opt2.setArgName("VAL");
        options.addOption(opt2);

        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("VAL"));
    }

    @Test
    public void testPrintOptions_emptyOptions_printsEmptyLine()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String output = sw.toString();
        assertNotNull(output);
    }

    @Test
    public void testPrintOptions_optionWithNoArgNameHasArg_printsSpace()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("c", "ccc", true, "desc c");
        opt.setArgName("");
        options.addOption(opt);

        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-c"));
    }

    @Test
    public void testPrintOptions_optionWithoutLongOpt_printsOnlyShortOpt()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option("d", "description d");
        options.addOption(opt);

        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-d"));
    }

    @Test
    public void testPrintOptions_optionWithNullOpt_printsLongOptOnly()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option opt = new Option(null, "onlylong", false, "desc");
        options.addOption(opt);

        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("--onlylong"));
    }

    // ---------------------- printWrapped ----------------------

    @Test
    public void testPrintWrapped_shortText_printsUnwrapped()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        helpFormatter.printWrapped(pw, 80, "short text");
        pw.flush();

        assertTrue(sw.toString().contains("short text"));
    }

    @Test
    public void testPrintWrapped_withTabStop_wrapsCorrectly()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        String longText = "This is a very long piece of text that should be wrapped across multiple lines because it exceeds the width limit specified";

        helpFormatter.printWrapped(pw, 30, 5, longText);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.length() > 0);
        assertTrue(output.contains("This"));
    }

    @Test
    public void testPrintWrapped_emptyText_printsEmptyLine()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        helpFormatter.printWrapped(pw, 80, "");
        pw.flush();

        assertNotNull(sw.toString());
    }

    // ---------------------- renderWrappedText (protected, same package) ----------------------

    @Test
    public void testRenderWrappedText_noWrapNeeded_returnsTrimmedText()
    {
        StringBuffer sb = new StringBuffer();
        helpFormatter.renderWrappedText(sb, 80, 0, "short text   ");
        assertEquals("short text", sb.toString());
    }

    @Test
    public void testRenderWrappedText_longTextWraps_containsNewLine()
    {
        StringBuffer sb = new StringBuffer();
        String text = "aaaaaaaaaa bbbbbbbbbb cccccccccc dddddddddd eeeeeeeeee ffffffffff";
        helpFormatter.renderWrappedText(sb, 20, 0, text);
        assertTrue(sb.toString().contains(helpFormatter.getNewLine()));
    }

    @Test
    public void testRenderWrappedText_nextLineTabStopGreaterThanWidth_avoidsInfiniteLoop()
    {
        StringBuffer sb = new StringBuffer();
        String text = "aaaaaaaaaa bbbbbbbbbb cccccccccc dddddddddd eeeeeeeeee ffffffffff";
        // nextLineTabStop >= width triggers the reset to 1
        helpFormatter.renderWrappedText(sb, 10, 15, text);
        assertNotNull(sb.toString());
    }

    @Test
    public void testRenderWrappedText_textWithNewlineChar_wrapsAtNewline()
    {
        StringBuffer sb = new StringBuffer();
        String text = "abc\ndef ghijklmnop qrstuv";
        helpFormatter.renderWrappedText(sb, 10, 0, text);
        assertTrue(sb.toString().contains(helpFormatter.getNewLine()));
    }

    // ---------------------- findWrapPos (protected, same package) ----------------------

    @Test
    public void testFindWrapPos_textWithNewlineWithinWidth_returnsPositionAfterNewline()
    {
        int pos = helpFormatter.findWrapPos("abc\ndefgh", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_textWithTabWithinWidth_returnsPositionAfterTab()
    {
        int pos = helpFormatter.findWrapPos("abc\tdefgh", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_textShorterThanWidth_returnsMinusOne()
    {
        int pos = helpFormatter.findWrapPos("short", 80, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_textWithSpaceBeforeWidth_returnsSpacePosition()
    {
        String text = "aaaaaaaaaa bbbbbbbbbb ccccccccccccccccccccccccccc";
        int pos = helpFormatter.findWrapPos(text, 15, 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testFindWrapPos_noWhitespaceFoundBeforeWidth_chopsAtWidth()
    {
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int pos = helpFormatter.findWrapPos(text, 10, 0);
        assertEquals(10, pos);
    }

    @Test
    public void testFindWrapPos_noWhitespaceAndPosEqualsTextLength_returnsMinusOne()
    {
        String text = "aaaaaaaaaa";
        int pos = helpFormatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    // ---------------------- createPadding (protected, same package) ----------------------

    @Test
    public void testCreatePadding_positiveLength_returnsStringOfSpaces()
    {
        String padding = helpFormatter.createPadding(5);
        assertEquals("     ", padding);
        assertEquals(5, padding.length());
    }

    @Test
    public void testCreatePadding_zeroLength_returnsEmptyString()
    {
        String padding = helpFormatter.createPadding(0);
        assertEquals("", padding);
    }

    // ---------------------- rtrim (protected, same package) ----------------------

    @Test
    public void testRtrim_trailingWhitespace_removesTrailingWhitespace()
    {
        String result = helpFormatter.rtrim("hello   ");
        assertEquals("hello", result);
    }

    @Test
    public void testRtrim_noTrailingWhitespace_returnsSameString()
    {
        String result = helpFormatter.rtrim("hello");
        assertEquals("hello", result);
    }

    @Test
    public void testRtrim_nullString_returnsNull()
    {
        String result = helpFormatter.rtrim(null);
        assertNull(result);
    }

    @Test
    public void testRtrim_emptyString_returnsEmptyString()
    {
        String result = helpFormatter.rtrim("");
        assertEquals("", result);
    }

    // ---------------------- renderOptions (protected, same package) ----------------------

    @Test
    public void testRenderOptions_withOptions_returnsRenderedStringBuffer()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        options.addOption("a", "aaa", false, "description of a");
        Option opt = new Option("b", "bbb", true, "description of b");
        opt.setArgName("VAL");
        options.addOption(opt);

        StringBuffer result = helpFormatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(result.toString().contains("-a"));
        assertTrue(result.toString().contains("-b"));
    }

    @Test
    public void testRenderOptions_optionWithBlankArgName_appendsSpace()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        Option opt = new Option("e", "eee", true, "desc e");
        opt.setArgName("");
        options.addOption(opt);

        StringBuffer result = helpFormatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(result.toString().contains("-e"));
    }

    @Test
    public void testRenderOptions_optionWithNullDescription_doesNotThrow()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        Option opt = new Option("f", "fff", false, null);
        options.addOption(opt);

        StringBuffer result = helpFormatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(result.toString().contains("-f"));
    }
}
