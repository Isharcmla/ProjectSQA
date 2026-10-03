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
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testGettersAndSetters_normalInputs_valuesUpdatedCorrectly() {
        formatter.setWidth(80);
        Assert.assertEquals(80, formatter.getWidth());

        formatter.setLeftPadding(2);
        Assert.assertEquals(2, formatter.getLeftPadding());

        formatter.setDescPadding(5);
        Assert.assertEquals(5, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Syntax: ");
        Assert.assertEquals("Syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        Assert.assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("+");
        Assert.assertEquals("+", formatter.getOptPrefix());

        formatter.setLongOptPrefix("++");
        Assert.assertEquals("++", formatter.getLongOptPrefix());

        formatter.setLongOptSeparator("=");
        Assert.assertEquals("=", formatter.getLongOptSeparator());

        formatter.setArgName("parameter");
        Assert.assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparator_nullComparator_resetsToDefaultComparator() {
        Comparator customComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        formatter.setOptionComparator(customComparator);
        Assert.assertSame(customComparator, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        Assert.assertNotNull(formatter.getOptionComparator());
        Assert.assertNotSame(customComparator, formatter.getOptionComparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsIllegalArgumentException() {
        formatter.printHelp(new PrintWriter(new StringWriter()), 80, null, "header", new Options(), 1, 3, "footer");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsIllegalArgumentException() {
        formatter.printHelp(new PrintWriter(new StringWriter()), 80, "", "header", new Options(), 1, 3, "footer");
    }

    @Test
    public void testPrintHelp_allOverloadsToSystemOut_outputProduced() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha description");

        formatter.printHelp("app", options);
        Assert.assertTrue(outContent.toString().contains("usage: app"));

        outContent.reset();
        formatter.printHelp("app", options, true);
        Assert.assertTrue(outContent.toString().contains("usage: app"));

        outContent.reset();
        formatter.printHelp("app", "header", options, "footer");
        Assert.assertTrue(outContent.toString().contains("header"));
        Assert.assertTrue(outContent.toString().contains("footer"));

        outContent.reset();
        formatter.printHelp("app", "header", options, "footer", true);
        Assert.assertTrue(outContent.toString().contains("header"));
        Assert.assertTrue(outContent.toString().contains("footer"));

        outContent.reset();
        formatter.printHelp(80, "app", "header", options, "footer");
        Assert.assertTrue(outContent.toString().contains("header"));

        outContent.reset();
        formatter.printHelp(80, "app", "header", options, "footer", true);
        Assert.assertTrue(outContent.toString().contains("header"));
    }

    @Test
    public void testPrintHelp_allOverloadsToPrintWriter_outputContainsExpectedParts() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha description");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printHelp(pw, 80, "myApp", "header", options, 2, 4, "footer");
        pw.flush();
        String result = sw.toString();
        Assert.assertTrue(result.contains("usage: myApp"));
        Assert.assertTrue(result.contains("header"));
        Assert.assertTrue(result.contains("alpha"));
        Assert.assertTrue(result.contains("footer"));

        sw = new StringWriter();
        pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "myApp", "   ", options, 2, 4, "   ", true);
        pw.flush();
        result = sw.toString();
        Assert.assertTrue(result.contains("usage: myApp [-a]"));
    }

    @Test
    public void testPrintUsage_withOptionsAndOptionGroups_formattedCorrectly() {
        Options options = new Options();
        Option optA = new Option("a", "alpha", true, "Alpha description");
        Option optB = new Option("b", "beta", false, "Beta description");
        optB.setRequired(true);

        Option optLongOnly = new Option(null, "gamma", true, "Gamma description");
        optLongOnly.setArgName("");

        Option optC = new Option("c", "charlie", false, "Charlie description");
        Option optD = new Option("d", "delta", true, "Delta description");
        optD.setArgName("val");

        OptionGroup optionalGroup = new OptionGroup();
        optionalGroup.addOption(optC);
        optionalGroup.addOption(optD);
        optionalGroup.setRequired(false);

        Option optE = new Option("e", "echo", false, "Echo description");
        Option optF = new Option(null, "foxtrot", true, "Foxtrot description");
        optF.setArgName("foxArg");
        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.addOption(optE);
        requiredGroup.addOption(optF);
        requiredGroup.setRequired(true);

        options.addOption(optA);
        options.addOption(optB);
        options.addOption(optLongOnly);
        options.addOptionGroup(optionalGroup);
        options.addOptionGroup(requiredGroup);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();

        Assert.assertTrue(result.contains("[-a <arg>]"));
        Assert.assertTrue(result.contains("-b"));
        Assert.assertTrue(result.contains("[--gamma]"));
        Assert.assertTrue(result.contains("[-c | -d <val>]"));
        Assert.assertTrue(result.contains("-e | --foxtrot <foxArg>"));
    }

    @Test
    public void testPrintUsage_stringSyntax_printedCorrectly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "myApp [options] <files>");
        pw.flush();
        String result = sw.toString();

        Assert.assertTrue(result.startsWith("usage: myApp [options] <files>"));
    }

    @Test
    public void testPrintWrapped_multipleOverloads_wrappedCorrectly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 20, "This is a simple wrapped text that exceeds width.");
        pw.flush();
        Assert.assertTrue(sw.toString().contains("This is a simple"));

        sw = new StringWriter();
        pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 20, 5, "This is another test for wrapped text with nextLineTabStop.");
        pw.flush();
        Assert.assertTrue(sw.toString().contains("This is another"));
    }

    @Test
    public void testRenderOptions_variousOptionConfigurations_rendersProperly() {
        Options options = new Options();

        Option opt1 = new Option("a", "alpha", true, "Alpha description");
        Option opt2 = new Option("b", false, null);
        Option opt3 = new Option(null, "longonly", true, "Long only description");
        opt3.setArgName("customArg");
        Option opt4 = new Option("c", "charlie", true, "Blank arg name");
        opt4.setArgName("");

        options.addOption(opt1);
        options.addOption(opt2);
        options.addOption(opt3);
        options.addOption(opt4);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 2, 4);
        String result = sb.toString();

        Assert.assertTrue(result.contains("-a,--alpha <arg>"));
        Assert.assertTrue(result.contains("-b"));
        Assert.assertTrue(result.contains("--longonly <customArg>"));
        Assert.assertTrue(result.contains("-c,--charlie "));
        Assert.assertTrue(result.contains("Alpha description"));
    }

    @Test
    public void testRenderWrappedText_tabStopGreaterThanWidth_resetsTo1() {
        StringBuffer sb = new StringBuffer();
        String text = "Short words that will wrap repeatedly into next lines with large tabStop";
        formatter.renderWrappedText(sb, 10, 15, text);
        Assert.assertTrue(sb.toString().length() > 0);
    }

    @Test
    public void testRenderWrappedText_longUnbrokenWordExceedsWidth_wrapsProperly() {
        StringBuffer sb = new StringBuffer();
        String text = "Prefix " + "VERYLONGWORDWITHOUTSPACESEXCEEDINGWIDTH" + " suffix";
        formatter.renderWrappedText(sb, 10, 2, text);
        Assert.assertTrue(sb.toString().contains("VERYLONGWORD"));
    }

    @Test
    public void testRenderWrappedText_textFitsWithinWidth_appendsDirectly() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 50, 0, "Short text");
        Assert.assertEquals("Short text", sb.toString());
    }

    @Test
    public void testFindWrapPos_newlineAndTabCharacters_returnsImmediateBreak() {
        Assert.assertEquals(5, formatter.findWrapPos("1234\n6789", 10, 0));
        Assert.assertEquals(5, formatter.findWrapPos("1234\t6789", 10, 0));
    }

    @Test
    public void testFindWrapPos_startPosPlusWidthGreaterThanLength_returnsNegativeOne() {
        Assert.assertEquals(-1, formatter.findWrapPos("short", 10, 0));
    }

    @Test
    public void testFindWrapPos_lastSpaceWithinBoundary_returnsSpaceIndex() {
        Assert.assertEquals(4, formatter.findWrapPos("one two three", 6, 0));
    }

    @Test
    public void testFindWrapPos_noSpaceBeforeWidth_returnsFirstSpaceAfterWidth() {
        Assert.assertEquals(10, formatter.findWrapPos("abcdefghij klm", 5, 0));
    }

    @Test
    public void testFindWrapPos_noSpaceInEntireText_returnsNegativeOne() {
        Assert.assertEquals(-1, formatter.findWrapPos("abcdefghijklmno", 5, 0));
    }

    @Test
    public void testCreatePadding_zeroAndPositiveLengths_returnsCorrectPadding() {
        Assert.assertEquals("", formatter.createPadding(0));
        Assert.assertEquals(" ", formatter.createPadding(1));
        Assert.assertEquals("     ", formatter.createPadding(5));
    }

    @Test
    public void testRtrim_nullEmptyAndSpacedStrings_trimsTrailingWhitespaceOnly() {
        Assert.assertNull(formatter.rtrim(null));
        Assert.assertEquals("", formatter.rtrim(""));
        Assert.assertEquals("", formatter.rtrim("   "));
        Assert.assertEquals("  abc", formatter.rtrim("  abc   \t\n\r"));
        Assert.assertEquals("abc", formatter.rtrim("abc"));
    }

    @Test
    public void testOptionComparator_compare_ordersAlphabeticallyCaseInsensitive() {
        Comparator comp = formatter.getOptionComparator();
        Option optA = new Option("a", "desc");
        Option optB = new Option("B", "desc");
        Option optA2 = new Option("A", "desc");

        Assert.assertTrue(comp.compare(optA, optB) < 0);
        Assert.assertTrue(comp.compare(optB, optA) > 0);
        Assert.assertEquals(0, comp.compare(optA, optA2));
    }
}
