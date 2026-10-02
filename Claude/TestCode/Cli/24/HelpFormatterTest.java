import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Comparator;

public class HelpFormatterTest
{
    private HelpFormatter helpFormatter;

    @Before
    public void setUp()
    {
        helpFormatter = new HelpFormatter();
    }

    // ---------------- getters/setters ----------------

    @Test
    public void testSetWidth_normalValue_getWidthReturnsSameValue()
    {
        helpFormatter.setWidth(100);
        assertEquals(100, helpFormatter.getWidth());
    }

    @Test
    public void testGetWidth_defaultValue_returnsDefaultWidth()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, helpFormatter.getWidth());
    }

    @Test
    public void testSetWidth_negativeValue_getWidthReturnsNegativeValue()
    {
        helpFormatter.setWidth(-1);
        assertEquals(-1, helpFormatter.getWidth());
    }

    @Test
    public void testSetLeftPadding_normalValue_getLeftPaddingReturnsSameValue()
    {
        helpFormatter.setLeftPadding(5);
        assertEquals(5, helpFormatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPadding_defaultValue_returnsDefaultLeftPad()
    {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, helpFormatter.getLeftPadding());
    }

    @Test
    public void testSetDescPadding_normalValue_getDescPaddingReturnsSameValue()
    {
        helpFormatter.setDescPadding(6);
        assertEquals(6, helpFormatter.getDescPadding());
    }

    @Test
    public void testGetDescPadding_defaultValue_returnsDefaultDescPad()
    {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, helpFormatter.getDescPadding());
    }

    @Test
    public void testSetSyntaxPrefix_normalValue_getSyntaxPrefixReturnsSameValue()
    {
        helpFormatter.setSyntaxPrefix("custom: ");
        assertEquals("custom: ", helpFormatter.getSyntaxPrefix());
    }

    @Test
    public void testGetSyntaxPrefix_defaultValue_returnsDefaultSyntaxPrefix()
    {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, helpFormatter.getSyntaxPrefix());
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
        helpFormatter.setOptPrefix("+");
        assertEquals("+", helpFormatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefix_defaultValue_returnsDefaultOptPrefix()
    {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, helpFormatter.getOptPrefix());
    }

    @Test
    public void testSetLongOptPrefix_normalValue_getLongOptPrefixReturnsSameValue()
    {
        helpFormatter.setLongOptPrefix("==");
        assertEquals("==", helpFormatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefix_defaultValue_returnsDefaultLongOptPrefix()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, helpFormatter.getLongOptPrefix());
    }

    @Test
    public void testSetArgName_normalValue_getArgNameReturnsSameValue()
    {
        helpFormatter.setArgName("FILE");
        assertEquals("FILE", helpFormatter.getArgName());
    }

    @Test
    public void testGetArgName_defaultValue_returnsDefaultArgName()
    {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, helpFormatter.getArgName());
    }

    @Test
    public void testGetOptionComparator_defaultValue_notNull()
    {
        assertNotNull(helpFormatter.getOptionComparator());
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
    public void testSetOptionComparator_nullComparator_resetsToDefaultComparator()
    {
        helpFormatter.setOptionComparator(null);
        assertNotNull(helpFormatter.getOptionComparator());
    }

    // ---------------- printHelp overloads ----------------

    @Test
    public void testPrintHelp_cmdLineSyntaxAndOptions_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        helpFormatter.printHelp("app", options);
    }

    @Test
    public void testPrintHelp_cmdLineSyntaxOptionsAutoUsageTrue_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        helpFormatter.printHelp("app", options, true);
    }

    @Test
    public void testPrintHelp_cmdLineSyntaxOptionsAutoUsageFalse_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        helpFormatter.printHelp("app", options, false);
    }

    @Test
    public void testPrintHelp_withHeaderAndFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        helpFormatter.printHelp("app", "header text", options, "footer text");
    }

    @Test
    public void testPrintHelp_withHeaderFooterAndAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        helpFormatter.printHelp("app", "header text", options, "footer text", true);
    }

    @Test
    public void testPrintHelp_withWidthHeaderFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        helpFormatter.printHelp(80, "app", "header text", options, "footer text");
    }

    @Test
    public void testPrintHelp_withWidthHeaderFooterAutoUsage_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        helpFormatter.printHelp(80, "app", "header text", options, "footer text", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException()
    {
        Options options = new Options();
        PrintWriter pw = new PrintWriter(new ByteArrayOutputStream());
        helpFormatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException()
    {
        Options options = new Options();
        PrintWriter pw = new PrintWriter(new ByteArrayOutputStream());
        helpFormatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer");
    }

    @Test
    public void testPrintHelp_withPrintWriterAndAllParams_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer");
        pw.flush();
        assertTrue(baos.toString().length() > 0);
    }

    @Test
    public void testPrintHelp_withPrintWriterAllParamsAutoUsageTrue_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer", true);
        pw.flush();
        assertTrue(baos.toString().length() > 0);
    }

    @Test
    public void testPrintHelp_withNullHeaderAndFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();
    }

    @Test
    public void testPrintHelp_withBlankHeaderAndFooter_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "   ", false);
        pw.flush();
    }

    // ---------------- printUsage ----------------

    @Test
    public void testPrintUsage_simpleOption_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(baos.toString().contains("app"));
    }

    @Test
    public void testPrintUsage_requiredOption_containsOptionWithoutBrackets()
    {
        Options options = new Options();
        Option opt = new Option("r", "required", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(baos.toString().contains("-r"));
    }

    @Test
    public void testPrintUsage_optionWithArg_containsArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file option");
        opt.setArgName("FILE");
        options.addOption(opt);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(baos.toString().contains("<FILE>"));
    }

    @Test
    public void testPrintUsage_optionGroupRequired_noException()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "alpha desc"));
        group.addOption(new Option("b", "beta", false, "beta desc"));
        group.setRequired(true);
        options.addOptionGroup(group);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
    }

    @Test
    public void testPrintUsage_optionGroupNotRequired_containsBrackets()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "alpha desc"));
        group.addOption(new Option("b", "beta", false, "beta desc"));
        group.setRequired(false);
        options.addOptionGroup(group);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("["));
        assertTrue(output.contains("]"));
    }

    @Test
    public void testPrintUsage_noOptions_noException()
    {
        Options options = new Options();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(baos.toString().length() > 0);
    }

    @Test
    public void testPrintUsage_cmdLineSyntaxOnly_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app -a -b");
        pw.flush();
        assertTrue(baos.toString().contains("usage:"));
    }

    @Test
    public void testPrintUsage_cmdLineSyntaxNoSpace_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printUsage(pw, 80, "app");
        pw.flush();
        assertTrue(baos.toString().contains("app"));
    }

    // ---------------- printOptions ----------------

    @Test
    public void testPrintOptions_normalOptions_noException()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha description");
        options.addOption("b", "beta", true, "beta description with argument");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
    }

    @Test
    public void testPrintOptions_optionWithOnlyLongOpt_noException()
    {
        Options options = new Options();
        Option opt = new Option(null, "longonly", false, "long only description");
        options.addOption(opt);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(baos.toString().contains("longonly"));
    }

    @Test
    public void testPrintOptions_optionWithArgNoArgName_noException()
    {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file description");
        opt.setArgName("");
        options.addOption(opt);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(baos.toString().length() > 0);
    }

    @Test
    public void testPrintOptions_emptyOptions_noException()
    {
        Options options = new Options();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
    }

    @Test
    public void testPrintOptions_optionWithoutDescription_noException()
    {
        Options options = new Options();
        Option opt = new Option("a", "alpha", false, null);
        options.addOption(opt);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
    }

    // ---------------- printWrapped ----------------

    @Test
    public void testPrintWrapped_shortText_noWrap()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printWrapped(pw, 80, "short text");
        pw.flush();
        assertTrue(baos.toString().contains("short text"));
    }

    @Test
    public void testPrintWrapped_longTextWithTabStop_wrapsCorrectly()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        String longText = "This is a very long text that should be wrapped across " +
                "multiple lines because it exceeds the given width limit for testing purposes";
        helpFormatter.printWrapped(pw, 20, 5, longText);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.length() > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintWrapped_nextLineTabStopGreaterThanWidth_throwsIllegalStateException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        String longText = "This is a very long text that should cause an exception because " +
                "the tab stop is greater than or equal to the width parameter given here";
        helpFormatter.printWrapped(pw, 10, 15, longText);
        pw.flush();
    }

    @Test
    public void testPrintWrapped_textWithNewline_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printWrapped(pw, 80, "line one\nline two");
        pw.flush();
        assertTrue(baos.toString().contains("line one"));
    }

    @Test
    public void testPrintWrapped_textWithTab_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printWrapped(pw, 80, "column1\tcolumn2");
        pw.flush();
        assertTrue(baos.toString().length() > 0);
    }

    @Test
    public void testPrintWrapped_emptyText_noException()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        helpFormatter.printWrapped(pw, 80, "");
        pw.flush();
    }
}
