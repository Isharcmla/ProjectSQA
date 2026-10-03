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
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testGettersAndSetters_normalValues_expectedValuesSet() {
        formatter.setWidth(100);
        Assert.assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        Assert.assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(7);
        Assert.assertEquals(7, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Syntax: ");
        Assert.assertEquals("Syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        Assert.assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("+");
        Assert.assertEquals("+", formatter.getOptPrefix());

        formatter.setLongOptPrefix("++");
        Assert.assertEquals("++", formatter.getLongOptPrefix());

        formatter.setArgName("argument");
        Assert.assertEquals("argument", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparator_customAndNull_updatesComparator() {
        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o2).getKey().compareTo(((Option) o1).getKey());
            }
        };

        formatter.setOptionComparator(customComp);
        Assert.assertSame(customComp, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        Assert.assertNotNull(formatter.getOptionComparator());
        Assert.assertNotSame(customComp, formatter.getOptionComparator());
    }

    @Test
    public void testPrintHelp_cmdLineSyntaxAndOptions_printsToSystemOut() {
        Options options = new Options();
        options.addOption("a", false, "option a description");

        formatter.printHelp("app", options);
        String output = outContent.toString();
        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("-a"));
        Assert.assertTrue(output.contains("option a description"));
    }

    @Test
    public void testPrintHelp_withAutoUsage_printsToSystemOut() {
        Options options = new Options();
        options.addOption("b", "beta", true, "option beta description");

        formatter.printHelp("myApp", options, true);
        String output = outContent.toString();
        Assert.assertTrue(output.contains("usage: myApp [-b <arg>]"));
        Assert.assertTrue(output.contains("-b,--beta <arg>"));
    }

    @Test
    public void testPrintHelp_headerOptionsFooter_printsAllSections() {
        Options options = new Options();
        options.addOption("c", false, "desc c");

        formatter.printHelp("app", "Header text", options, "Footer text");
        String output = outContent.toString();
        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("Header text"));
        Assert.assertTrue(output.contains("Footer text"));
    }

    @Test
    public void testPrintHelp_headerOptionsFooterAutoUsage_printsAllSections() {
        Options options = new Options();
        options.addOption("c", false, "desc c");

        formatter.printHelp("app", "Header text", options, "Footer text", true);
        String output = outContent.toString();
        Assert.assertTrue(output.contains("usage: app [-c]"));
        Assert.assertTrue(output.contains("Header text"));
        Assert.assertTrue(output.contains("Footer text"));
    }

    @Test
    public void testPrintHelp_widthCmdLineHeaderOptionsFooter_printsCorrectly() {
        Options options = new Options();
        options.addOption("d", "delta", false, "desc d");

        formatter.printHelp(80, "app", "Header", options, "Footer");
        String output = outContent.toString();
        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("Header"));
        Assert.assertTrue(output.contains("Footer"));
    }

    @Test
    public void testPrintHelp_widthCmdLineHeaderOptionsFooterAutoUsage_printsCorrectly() {
        Options options = new Options();
        options.addOption("e", true, "desc e");

        formatter.printHelp(80, "app", "Header", options, "Footer", true);
        String output = outContent.toString();
        Assert.assertTrue(output.contains("usage: app [-e <arg>]"));
        Assert.assertTrue(output.contains("Header"));
        Assert.assertTrue(output.contains("Footer"));
    }

    @Test
    public void testPrintHelp_printWriterOverloadWithoutAutoUsage_writesToWriter() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("f", false, "desc f");

        formatter.printHelp(pw, 80, "app", "Header", options, 2, 4, "Footer");
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("Header"));
        Assert.assertTrue(output.contains("Footer"));
        Assert.assertTrue(output.contains("  -f    desc f"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, null, "Header", new Options(), 1, 3, "Footer", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "", "Header", new Options(), 1, 3, "Footer", true);
    }

    @Test
    public void testPrintHelp_blankHeaderAndFooter_omitsBlanks() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        options.addOption("g", false, "desc g");

        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "   ", false);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.startsWith("usage: app"));
        Assert.assertFalse(output.contains("   \n"));
    }

    @Test
    public void testPrintUsage_withOptionsAndOptionGroups_formatsCorrectly() {
        Options options = new Options();

        Option opt1 = OptionBuilder.withLongOpt("file")
                .hasArg()
                .withArgName("FILE")
                .isRequired(true)
                .withDescription("file option")
                .create('f');
        options.addOption(opt1);

        Option optLongOnly = OptionBuilder.withLongOpt("verbose")
                .withDescription("verbose output")
                .create();
        options.addOption(optLongOnly);

        Option g1 = new Option("a", "alpha");
        Option g2 = new Option("b", "beta");
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        group.addOption(g1);
        group.addOption(g2);
        options.addOptionGroup(group);

        Option g3 = new Option("x", "xray");
        Option g4 = new Option("y", "yankee");
        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.setRequired(true);
        requiredGroup.addOption(g3);
        requiredGroup.addOption(g4);
        options.addOptionGroup(requiredGroup);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("-f <FILE>"));
        Assert.assertTrue(output.contains("[--verbose]"));
        Assert.assertTrue(output.contains("[-a | -b]"));
        Assert.assertTrue(output.contains("-x | -y"));
    }

    @Test
    public void testPrintUsage_plainCmdLineSyntax_formatsCorrectly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "myApp command [options]");
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("usage: myApp command [options]"));
    }

    @Test
    public void testPrintOptions_variousOptionTypes_rendersAccurately() {
        Options options = new Options();

        Option optLongOnlyNoArg = OptionBuilder.withLongOpt("version")
                .withDescription("Display version")
                .create();
        options.addOption(optLongOnlyNoArg);

        Option optArgNoName = OptionBuilder.withLongOpt("count")
                .hasArg()
                .create('c');
        optArgNoName.setArgName(null);
        options.addOption(optArgNoName);

        Option optShortOnlyNoDesc = new Option("q", null);
        options.addOption(optShortOnlyNoDesc);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, 80, options, 2, 4);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("--version"));
        Assert.assertTrue(output.contains("-c "));
        Assert.assertTrue(output.contains("-q"));
    }

    @Test
    public void testPrintWrapped_plainAndTabStops_wrapsProperly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 20, "This is a short line.");
        formatter.printWrapped(pw, 20, 4, "This is a very long line that definitely needs wrapping across multiple lines.");
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("This is a short"));
        Assert.assertTrue(output.contains("    "));
    }

    @Test
    public void testFindWrapPos_specialCharactersAndBoundaries() {
        int pos1 = formatter.findWrapPos("line1\nline2", 10, 0);
        Assert.assertEquals(6, pos1);

        int pos2 = formatter.findWrapPos("line1\tline2", 10, 0);
        Assert.assertEquals(6, pos2);

        int pos3 = formatter.findWrapPos("short", 10, 0);
        Assert.assertEquals(-1, pos3);

        int pos4 = formatter.findWrapPos("a very long string without breaks until the end", 10, 0);
        Assert.assertEquals(7, pos4);

        int pos5 = formatter.findWrapPos("supercalifragilisticexpialidocious text", 10, 0);
        Assert.assertEquals(34, pos5);

        int pos6 = formatter.findWrapPos("supercalifragilisticexpialidocious", 10, 0);
        Assert.assertEquals(-1, pos6);
    }

    @Test
    public void testCreatePadding_zeroAndPositiveLength() {
        Assert.assertEquals("", formatter.createPadding(0));
        Assert.assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void testRtrim_variousInputs() {
        Assert.assertNull(formatter.rtrim(null));
        Assert.assertEquals("", formatter.rtrim(""));
        Assert.assertEquals("test", formatter.rtrim("test   \t\n"));
        Assert.assertEquals("test", formatter.rtrim("test"));
        Assert.assertEquals("", formatter.rtrim("   "));
    }

    @Test(expected = RuntimeException.class)
    public void testRenderWrappedText_unbreakableWordExceedingWidth_throwsRuntimeException() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 5, 4, "abcdefghijk lmnopqrst");
    }

    @Test
    public void testOptionComparator_coverage() {
        Comparator comp = formatter.getOptionComparator();
        Option optA = new Option("a", "alpha");
        Option optB = new Option("B", "Beta");
        Option optA2 = new Option("A", "Alpha");

        Assert.assertTrue(comp.compare(optA, optB) < 0);
        Assert.assertTrue(comp.compare(optB, optA) > 0);
        Assert.assertEquals(0, comp.compare(optA, optA2));
    }
}
