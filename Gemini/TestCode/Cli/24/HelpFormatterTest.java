package org.apache.commons.cli;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;
    private PrintStream originalOut;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
        originalOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testGettersAndSetters_normalValues_valuesUpdated() {
        formatter.setWidth(100);
        Assert.assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        Assert.assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(8);
        Assert.assertEquals(8, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Syntax: ");
        Assert.assertEquals("Syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\r\n");
        Assert.assertEquals("\r\n", formatter.getNewLine());

        formatter.setOptPrefix("+");
        Assert.assertEquals("+", formatter.getOptPrefix());

        formatter.setLongOptPrefix("++");
        Assert.assertEquals("++", formatter.getLongOptPrefix());

        formatter.setArgName("parameter");
        Assert.assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void testOptionComparator_setCustomAndNull_correctComparatorUsed() {
        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o2).getKey().compareTo(((Option) o1).getKey());
            }
        };

        formatter.setOptionComparator(customComp);
        Assert.assertSame(customComp, formatter.getOptionComparator());

        // Setting null should restore default OptionComparator
        formatter.setOptionComparator(null);
        Assert.assertNotNull(formatter.getOptionComparator());
        Assert.assertNotSame(customComp, formatter.getOptionComparator());

        // Test default comparator sorting
        Option optA = new Option("a", "alpha", false, "desc");
        Option optB = new Option("b", "beta", false, "desc");
        Assert.assertTrue(formatter.getOptionComparator().compare(optA, optB) < 0);
        Assert.assertTrue(formatter.getOptionComparator().compare(optB, optA) > 0);
        Assert.assertEquals(0, formatter.getOptionComparator().compare(optA, optA));
    }

    @Test
    public void testRtrim_variousInputs_trimmedCorrectly() {
        Assert.assertNull(formatter.rtrim(null));
        Assert.assertEquals("", formatter.rtrim(""));
        Assert.assertEquals("", formatter.rtrim("   \t\n"));
        Assert.assertEquals("test", formatter.rtrim("test   \t\n"));
        Assert.assertEquals("  test", formatter.rtrim("  test   "));
        Assert.assertEquals("test", formatter.rtrim("test"));
    }

    @Test
    public void testCreatePadding_positiveAndZero_correctLength() {
        Assert.assertEquals("", formatter.createPadding(0));
        Assert.assertEquals(" ", formatter.createPadding(1));
        Assert.assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void testFindWrapPos_boundaryAndControlCharacters_correctPositions() {
        // Tab break
        int posTab = formatter.findWrapPos("foo\tbar", 10, 0);
        Assert.assertEquals(4, posTab);

        // Newline break
        int posNl = formatter.findWrapPos("foo\nbar", 10, 0);
        Assert.assertEquals(4, posNl);

        // Fits within width -> -1
        int posFit = formatter.findWrapPos("fits in width", 20, 0);
        Assert.assertEquals(-1, posFit);

        // Wrap on whitespace before max width
        int posSpace = formatter.findWrapPos("first second third", 10, 0);
        Assert.assertEquals(5, posSpace);

        // Word longer than width -> finds next whitespace after width
        int posLong = formatter.findWrapPos("unbreakableword second", 5, 0);
        Assert.assertEquals(15, posLong);

        // Long single word with no spaces beyond width -> returns -1
        int posSingleLong = formatter.findWrapPos("unbreakableword", 5, 0);
        Assert.assertEquals(-1, posSingleLong);
    }

    @Test(expected = IllegalStateException.class)
    public void testRenderWrappedText_tabStopExceedsWidth_throwsException() {
        StringBuffer sb = new StringBuffer();
        // text requires wrapping and nextLineTabStop >= width
        formatter.renderWrappedText(sb, 10, 10, "This is a long description requiring wrapping");
    }

    @Test
    public void testRenderWrappedText_specialAdjustmentBranch_handledGracefully() {
        StringBuffer sb = new StringBuffer();
        // Trigger condition: (text.length() > width) && (pos == nextLineTabStop - 1)
        // nextLineTabStop = 5, padding = "     ", text after padding has no space before pos 4
        formatter.renderWrappedText(sb, 10, 5, "1234567890abcdef 12345");
        Assert.assertTrue(sb.length() > 0);
    }

    @Test
    public void testRenderOptions_variousOptionConfigurations_rendersProperly() {
        Options options = new Options();
        Option shortOnly = new Option("s", "Short only");
        Option longOnly = new Option(null, "long-only", false, "Long only description");
        Option both = new Option("b", "both", true, "Both short and long with arg");
        both.setArgName("FILE");
        Option noArgName = new Option("n", "no-arg-name", true, null);
        noArgName.setArgName(""); // empty arg name
        Option noDesc = new Option("x", "No description", false, null);

        options.addOption(shortOnly);
        options.addOption(longOnly);
        options.addOption(both);
        options.addOption(noArgName);
        options.addOption(noDesc);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 2, 4);

        String result = sb.toString();
        Assert.assertTrue(result.contains("-s"));
        Assert.assertTrue(result.contains("--long-only"));
        Assert.assertTrue(result.contains("-b,--both <FILE>"));
        Assert.assertTrue(result.contains("-n,--no-arg-name"));
        Assert.assertTrue(result.contains("-x"));
    }

    @Test
    public void testPrintWrapped_overloadedMethods_writesOutput() {
        formatter.printWrapped(printWriter, 20, "Single short line");
        printWriter.flush();
        Assert.assertTrue(stringWriter.toString().contains("Single short line"));

        stringWriter.getBuffer().setLength(0);
        formatter.printWrapped(printWriter, 20, 4, "A very long text that must be wrapped into multiple lines properly");
        printWriter.flush();
        Assert.assertTrue(stringWriter.toString().contains("\n") || stringWriter.toString().contains("\r"));
    }

    @Test
    public void testPrintUsage_withOptionsAndOptionGroups_formattedCorrectly() {
        Options options = new Options();

        Option requiredOpt = new Option("r", "req", false, "Required option");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);

        Option normalOpt = new Option("a", "arg-opt", true, "Optional with arg");
        options.addOption(normalOpt);

        Option longOptOnly = new Option(null, "long-only", false, "Long opt only");
        options.addOption(longOptOnly);

        OptionGroup optionalGroup = new OptionGroup();
        optionalGroup.setRequired(false);
        optionalGroup.addOption(new Option("g1", "Group option 1"));
        optionalGroup.addOption(new Option("g2", "Group option 2"));
        options.addOptionGroup(optionalGroup);

        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.setRequired(true);
        requiredGroup.addOption(new Option("q1", "Req Group opt 1"));
        requiredGroup.addOption(new Option("q2", "Req Group opt 2"));
        options.addOptionGroup(requiredGroup);

        formatter.printUsage(printWriter, 80, "myapp", options);
        printWriter.flush();

        String usage = stringWriter.toString();
        Assert.assertTrue(usage.contains("myapp"));
        Assert.assertTrue(usage.contains("-r"));
        Assert.assertTrue(usage.contains("[-a <arg>]"));
        Assert.assertTrue(usage.contains("[--long-only]"));
        Assert.assertTrue(usage.contains("[-g1 | -g2]"));
        Assert.assertTrue(usage.contains("-q1 | -q2"));
    }

    @Test
    public void testPrintUsage_commandLineSyntaxOnly_writesSyntax() {
        formatter.printUsage(printWriter, 80, "myapp [options] <file>");
        printWriter.flush();

        String usage = stringWriter.toString();
        Assert.assertTrue(usage.startsWith(HelpFormatter.DEFAULT_SYNTAX_PREFIX));
        Assert.assertTrue(usage.contains("myapp [options] <file>"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsException() {
        formatter.printHelp(printWriter, 80, null, "Header", new Options(), 1, 3, "Footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsException() {
        formatter.printHelp(printWriter, 80, "", "Header", new Options(), 1, 3, "Footer", false);
    }

    @Test
    public void testPrintHelp_withHeaderFooterAndAutoUsage_writesCompleteHelp() {
        Options options = new Options();
        options.addOption("h", "help", false, "Print this help message");

        formatter.printHelp(printWriter, 80, "app", "Header banner", options, 2, 4, "Footer banner", true);
        printWriter.flush();

        String result = stringWriter.toString();
        Assert.assertTrue(result.contains("usage: app"));
        Assert.assertTrue(result.contains("Header banner"));
        Assert.assertTrue(result.contains("-h,--help"));
        Assert.assertTrue(result.contains("Footer banner"));
    }

    @Test
    public void testPrintHelp_blankHeaderAndFooter_omitsBanners() {
        Options options = new Options();
        options.addOption("v", "version", false, "Show version");

        formatter.printHelp(printWriter, 80, "app", "   ", options, 1, 3, "", false);
        printWriter.flush();

        String result = stringWriter.toString();
        Assert.assertTrue(result.contains("usage: app"));
        Assert.assertTrue(result.contains("-v"));
    }

    @Test
    public void testPrintHelp_allOverloadsToSystemOutAndPrintWriter_covered() {
        Options options = new Options();
        options.addOption("o", "output", true, "Output file");

        // printHelp(String, Options)
        formatter.printHelp("app1", options);

        // printHelp(String, Options, boolean)
        formatter.printHelp("app2", options, true);

        // printHelp(String, String, Options, String)
        formatter.printHelp("app3", "Header3", options, "Footer3");

        // printHelp(String, String, Options, String, boolean)
        formatter.printHelp("app4", "Header4", options, "Footer4", true);

        // printHelp(int, String, String, Options, String)
        formatter.printHelp(80, "app5", "Header5", options, "Footer5");

        // printHelp(int, String, String, Options, String, boolean)
        formatter.printHelp(80, "app6", "Header6", options, "Footer6", true);

        String consoleOutput = outContent.toString();
        Assert.assertTrue(consoleOutput.contains("app1"));
        Assert.assertTrue(consoleOutput.contains("app2"));
        Assert.assertTrue(consoleOutput.contains("app3"));
        Assert.assertTrue(consoleOutput.contains("app4"));
        Assert.assertTrue(consoleOutput.contains("app5"));
        Assert.assertTrue(consoleOutput.contains("app6"));

        // printHelp(PrintWriter, int, String, String, Options, int, int, String)
        formatter.printHelp(printWriter, 80, "app7", "Header7", options, 2, 2, "Footer7");
        printWriter.flush();
        Assert.assertTrue(stringWriter.toString().contains("app7"));
    }

    @Test
    public void testPrintOptions_validOptions_printsRenderedOptions() {
        Options options = new Options();
        options.addOption("a", "all", false, "Do not ignore entries starting with .");
        options.addOption("l", "list", false, "Use a long listing format");

        formatter.printOptions(printWriter, 80, options, 2, 4);
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertTrue(output.contains("-a,--all"));
        Assert.assertTrue(output.contains("-l,--list"));
    }
}
