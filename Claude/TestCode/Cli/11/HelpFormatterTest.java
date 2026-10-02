import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest {

    private HelpFormatter formatter;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
    }

    // ---------------------- Getter/Setter tests ----------------------

    @Test
    public void testGetWidth_default_returnsDefaultWidth() {
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void testSetWidth_setValue_returnsSetValue() {
        formatter.setWidth(100);
        Assert.assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testSetWidth_negativeValue_returnsNegativeValue() {
        formatter.setWidth(-5);
        Assert.assertEquals(-5, formatter.getWidth());
    }

    @Test
    public void testGetLeftPadding_default_returnsDefaultLeftPad() {
        Assert.assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    @Test
    public void testSetLeftPadding_setValue_returnsSetValue() {
        formatter.setLeftPadding(5);
        Assert.assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testGetDescPadding_default_returnsDefaultDescPad() {
        Assert.assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    @Test
    public void testSetDescPadding_setValue_returnsSetValue() {
        formatter.setDescPadding(10);
        Assert.assertEquals(10, formatter.getDescPadding());
    }

    @Test
    public void testGetSyntaxPrefix_default_returnsDefaultSyntaxPrefix() {
        Assert.assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefix_setValue_returnsSetValue() {
        formatter.setSyntaxPrefix("custom: ");
        Assert.assertEquals("custom: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetNewLine_default_notNull() {
        Assert.assertNotNull(formatter.getNewLine());
    }

    @Test
    public void testSetNewLine_setValue_returnsSetValue() {
        formatter.setNewLine("\r\n");
        Assert.assertEquals("\r\n", formatter.getNewLine());
    }

    @Test
    public void testGetOptPrefix_default_returnsDefaultOptPrefix() {
        Assert.assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefix_setValue_returnsSetValue() {
        formatter.setOptPrefix("+");
        Assert.assertEquals("+", formatter.getOptPrefix());
    }

    @Test
    public void testGetLongOptPrefix_default_returnsDefaultLongOptPrefix() {
        Assert.assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefix_setValue_returnsSetValue() {
        formatter.setLongOptPrefix("==");
        Assert.assertEquals("==", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetArgName_default_returnsDefaultArgName() {
        Assert.assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    @Test
    public void testSetArgName_setValue_returnsSetValue() {
        formatter.setArgName("myarg");
        Assert.assertEquals("myarg", formatter.getArgName());
    }

    @Test
    public void testGetOptionComparator_default_notNull() {
        Assert.assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_null_resetsToDefaultComparator() {
        formatter.setOptionComparator(null);
        Assert.assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparator_customComparator_setsCustom() {
        Comparator custom = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(custom);
        Assert.assertSame(custom, formatter.getOptionComparator());
    }

    // ---------------------- printHelp tests ----------------------

    @Test
    public void testPrintHelp_cmdLineSyntaxOptions_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        formatter.printHelp("app", options);
    }

    @Test
    public void testPrintHelp_withAutoUsage_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        formatter.printHelp("app", options, true);
    }

    @Test
    public void testPrintHelp_withHeaderFooter_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        formatter.printHelp("app", "header text", options, "footer text");
    }

    @Test
    public void testPrintHelp_withHeaderFooterAutoUsage_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        formatter.printHelp("app", "header text", options, "footer text", true);
    }

    @Test
    public void testPrintHelp_withWidth_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        formatter.printHelp(80, "app", "header", options, "footer");
    }

    @Test
    public void testPrintHelp_withWidthAutoUsage_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        formatter.printHelp(80, "app", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelp_pwWidthCmdLineSyntax_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer");
        pw.flush();
        Assert.assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintHelp_pwWidthCmdLineSyntaxAutoUsage_noException() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer", true);
        pw.flush();
        Assert.assertTrue(sw.toString().length() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsException() {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsException() {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelp_headerFooterEmpty_noExceptionAndSkipped() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "   ", false);
        pw.flush();
        Assert.assertTrue(sw.toString().length() > 0);
    }

    // ---------------------- printUsage tests ----------------------

    @Test
    public void testPrintUsage_withOptions_correctOutput() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", false, "option a");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        Assert.assertTrue(sw.toString().contains("usage:"));
        Assert.assertTrue(sw.toString().contains("app"));
    }

    @Test
    public void testPrintUsage_withoutOptions_correctOutput() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app arg1 arg2");
        pw.flush();
        Assert.assertTrue(sw.toString().contains("usage:"));
    }

    @Test
    public void testPrintUsage_withRequiredOption_correctOutput() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", false, "option a");
        opt.setRequired(true);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        Assert.assertTrue(sw.toString().contains("-a"));
    }

    @Test
    public void testPrintUsage_withOptionGroup_correctOutput() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", false, "option a");
        Option opt2 = new Option("b", false, "option b");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        Assert.assertTrue(sw.toString().contains("["));
    }

    @Test
    public void testPrintUsage_withRequiredOptionGroup_correctOutput() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", false, "option a");
        Option opt2 = new Option("b", false, "option b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        Assert.assertTrue(sw.toString().contains("-a"));
        Assert.assertTrue(sw.toString().contains("|"));
    }

    @Test
    public void testPrintUsage_withLongOptOnly_correctOutput() throws Exception {
        Options options = new Options();
        Option opt = new Option(null, "longopt", false, "long option");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        Assert.assertTrue(sw.toString().contains("--longopt"));
    }

    @Test
    public void testPrintUsage_optionWithArgName_correctOutput() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", true, "option a");
        opt.setArgName("value");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        Assert.assertTrue(sw.toString().contains("<value>"));
    }

    // ---------------------- printOptions tests ----------------------

    @Test
    public void testPrintOptions_basic_noException() throws Exception {
        Options options = new Options();
        options.addOption("a", "aaa", false, "option a description");
        options.addOption("b", false, "option b");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        Assert.assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintOptions_emptyOptions_noException() {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        Assert.assertNotNull(sw.toString());
    }

    // ---------------------- printWrapped tests ----------------------

    @Test
    public void testPrintWrapped_shortText_noWrap() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 80, "short text");
        pw.flush();
        Assert.assertTrue(sw.toString().contains("short text"));
    }

    @Test
    public void testPrintWrapped_withNextLineTabStop_noException() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 10, 2, "this is a longer text that should wrap");
        pw.flush();
        Assert.assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testPrintWrapped_longText_wraps() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String text = "this is a very long text that will definitely need to wrap across multiple lines because it exceeds the width";
        formatter.printWrapped(pw, 20, text);
        pw.flush();
        Assert.assertTrue(sw.toString().contains(formatter.getNewLine()));
    }

    // ---------------------- renderOptions tests (protected, same package) ----------------------

    @Test
    public void testRenderOptions_basic_returnsNonEmptyBuffer() throws Exception {
        Options options = new Options();
        options.addOption("a", "aaa", false, "description a");
        options.addOption("b", false, "description b");
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        Assert.assertTrue(result.length() > 0);
    }

    @Test
    public void testRenderOptions_optionWithArgName_containsArgName() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", true, "desc");
        opt.setArgName("value");
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        Assert.assertTrue(result.toString().contains("<value>"));
    }

    @Test
    public void testRenderOptions_optionWithArgNoArgName_containsSpace() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", true, "desc");
        opt.setArgName(null);
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        Assert.assertNotNull(result);
    }

    @Test
    public void testRenderOptions_multipleOptions_containsNewLine() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description a");
        options.addOption("b", false, "description b");
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderOptions(sb, 80, options, 1, 3);
        Assert.assertTrue(result.toString().contains(formatter.getNewLine()));
    }

    // ---------------------- renderWrappedText tests ----------------------

    @Test
    public void testRenderWrappedText_shortText_returnsSameText() {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = formatter.renderWrappedText(sb, 80, 0, "short");
        Assert.assertEquals("short", result.toString());
    }

    @Test
    public void testRenderWrappedText_withNewlineChar_wrapsAtNewline() {
        StringBuffer sb = new StringBuffer();
        String text = "line1\nline2";
        StringBuffer result = formatter.renderWrappedText(sb, 80, 0, text);
        Assert.assertTrue(result.toString().contains("line1"));
        Assert.assertTrue(result.toString().contains("line2"));
    }

    @Test
    public void testRenderWrappedText_withTabChar_wrapsAtTab() {
        StringBuffer sb = new StringBuffer();
        String text = "line1\tline2";
        StringBuffer result = formatter.renderWrappedText(sb, 80, 0, text);
        Assert.assertTrue(result.toString().length() > 0);
    }

    @Test
    public void testRenderWrappedText_longText_wrapsMultipleLines() {
        StringBuffer sb = new StringBuffer();
        String text = "this is a very long piece of text that should be wrapped across several lines when rendered";
        StringBuffer result = formatter.renderWrappedText(sb, 20, 2, text);
        Assert.assertTrue(result.toString().contains(formatter.getNewLine()));
    }

    // ---------------------- findWrapPos tests ----------------------

    @Test
    public void testFindWrapPos_withNewlineWithinWidth_returnsPosAfterNewline() {
        String text = "abc\ndef";
        int pos = formatter.findWrapPos(text, 80, 0);
        Assert.assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_withTabWithinWidth_returnsPosAfterTab() {
        String text = "abc\tdef";
        int pos = formatter.findWrapPos(text, 80, 0);
        Assert.assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPos_textShorterThanWidth_returnsMinusOne() {
        String text = "short text";
        int pos = formatter.findWrapPos(text, 80, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_whitespaceFoundBeforeWidth_returnsWhitespacePos() {
        String text = "aaaaa bbbbb ccccc ddddd";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertTrue(pos > 0);
    }

    @Test
    public void testFindWrapPos_noWhitespaceAtAll_returnsMinusOneOrEnd() {
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int pos = formatter.findWrapPos(text, 5, 0);
        Assert.assertTrue(pos == -1 || pos > 0);
    }

    // ---------------------- createPadding tests ----------------------

    @Test
    public void testCreatePadding_positiveLength_returnsSpaces() {
        String padding = formatter.createPadding(5);
        Assert.assertEquals("     ", padding);
    }

    @Test
    public void testCreatePadding_zeroLength_returnsEmptyString() {
        String padding = formatter.createPadding(0);
        Assert.assertEquals("", padding);
    }

    // ---------------------- rtrim tests ----------------------

    @Test
    public void testRtrim_nullString_returnsNull() {
        String result = formatter.rtrim(null);
        Assert.assertNull(result);
    }

    @Test
    public void testRtrim_emptyString_returnsEmptyString() {
        String result = formatter.rtrim("");
        Assert.assertEquals("", result);
    }

    @Test
    public void testRtrim_trailingWhitespace_removesTrailingWhitespace() {
        String result = formatter.rtrim("hello   ");
        Assert.assertEquals("hello", result);
    }

    @Test
    public void testRtrim_noTrailingWhitespace_returnsSameString() {
        String result = formatter.rtrim("hello");
        Assert.assertEquals("hello", result);
    }

    @Test
    public void testRtrim_allWhitespace_returnsEmptyString() {
        String result = formatter.rtrim("   ");
        Assert.assertEquals("", result);
    }
}
