package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private StringWriter sw;
    private PrintWriter pw;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        sw = new StringWriter();
        pw = new PrintWriter(sw);
    }

    @Test
    public void testGettersAndSetters_defaultAndCustomValues_correctlyAssigned() {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(8);
        assertEquals(8, formatter.getDescPadding());

        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());

        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("//");
        assertEquals("//", formatter.getLongOptPrefix());

        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());

        Comparator originalComparator = formatter.getOptionComparator();
        assertNotNull(originalComparator);

        Comparator customComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComparator);
        assertSame(customComparator, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testPrintHelp_nullOrEmptySyntax_throwsIllegalArgumentException() {
        Options options = new Options();
        try {
            formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer");
            fail("Expected IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException expected) {
            // Success
        }

        try {
            formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer");
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testPrintHelp_overloadsPrintingToSystemOut_executedWithoutError() {
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            Options options = new Options();
            options.addOption("a", "alpha", false, "Alpha description");

            formatter.printHelp("app", options);
            formatter.printHelp("app", options, true);
            formatter.printHelp("app", "header", options, "footer");
            formatter.printHelp("app", "header", options, "footer", true);
            formatter.printHelp(80, "app", "header", options, "footer");
            formatter.printHelp(80, "app", "header", options, "footer", true);

            String result = out.toString();
            assertTrue(result.contains("usage: app"));
            assertTrue(result.contains("Alpha description"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_withHeaderAndFooter_printedCorrectly() {
        Options options = new Options();
        options.addOption("h", "help", false, "Print help");

        formatter.printHelp(pw, 80, "myapp", "--- Header ---", options, 2, 4, "--- Footer ---", false);
        pw.flush();

        String result = sw.toString();
        assertTrue(result.startsWith("usage: myapp"));
        assertTrue(result.contains("--- Header ---"));
        assertTrue(result.contains("-h,--help"));
        assertTrue(result.contains("--- Footer ---"));
    }

    @Test
    public void testPrintHelp_withEmptyHeaderAndFooter_ignoresHeaderAndFooter() {
        Options options = new Options();
        options.addOption("o", false, "An option");

        formatter.printHelp(pw, 80, "myapp", "   ", options, 1, 3, null, true);
        pw.flush();

        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-o"));
    }

    @Test
    public void testPrintUsage_withOptionsAndOptionGroups_formattedProperly() {
        Options options = new Options();
        
        Option requiredOpt = new Option("r", "req", false, "Required option");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);

        Option longOnlyOpt = new Option(null, "longonly", true, "Long only option");
        longOnlyOpt.setArgName("val");
        options.addOption(longOnlyOpt);

        OptionGroup group1 = new OptionGroup();
        group1.setRequired(false);
        Option g1OptA = new Option("a", "group-a", false, "Group 1 Opt A");
        Option g1OptB = new Option("b", false, "Group 1 Opt B");
        group1.addOption(g1OptA);
        group1.addOption(g1OptB);
        options.addOptionGroup(group1);

        OptionGroup group2 = new OptionGroup();
        group2.setRequired(true);
        Option g2OptC = new Option("c", false, "Group 2 Opt C");
        Option g2OptD = new Option("d", true, "Group 2 Opt D");
        g2OptD.setArgName("dval");
        group2.addOption(g2OptC);
        group2.addOption(g2OptD);
        options.addOptionGroup(group2);

        formatter.printUsage(pw, 80, "testapp", options);
        pw.flush();

        String result = sw.toString();
        assertTrue(result.contains("-r"));
        assertTrue(result.contains("[--longonly <val>]"));
        assertTrue(result.contains("[-a | -b]"));
        assertTrue(result.contains("-c | -d <dval>"));
    }

    @Test
    public void testPrintUsage_simpleSyntax_formattedProperly() {
        formatter.printUsage(pw, 80, "testapp arg1 arg2");
        pw.flush();

        String result = sw.toString();
        assertEquals("usage: testapp arg1 arg2" + formatter.getNewLine(), result);
    }

    @Test
    public void testPrintOptions_variousOptionConfigurations_rendersAccurately() {
        Options options = new Options();

        Option optLongOnlyNoArg = new Option(null, "config", false, "Configuration file");
        Option optShortOnlyWithArg = new Option("f", true, "File path");
        optShortOnlyWithArg.setArgName("FILE");
        Option optBothWithArgUnnamed = new Option("x", "extended", true, "Extended options");
        optBothWithArgUnnamed.setArgName(null);
        Option optNoDesc = new Option("n", "nodesc", false, null);

        options.addOption(optLongOnlyNoArg);
        options.addOption(optShortOnlyWithArg);
        options.addOption(optBothWithArgUnnamed);
        options.addOption(optNoDesc);

        formatter.printOptions(pw, 80, options, 2, 4);
        pw.flush();

        String result = sw.toString();
        assertTrue(result.contains("--config"));
        assertTrue(result.contains("-f <FILE>"));
        assertTrue(result.contains("-x,--extended"));
        assertTrue(result.contains("-n,--nodesc"));
    }

    @Test
    public void testRenderWrappedText_multilineWrapAndTabStop_correctWrapping() {
        StringBuffer sb = new StringBuffer();
        String text = "This is a very long text that definitely needs to be wrapped across multiple lines of text output.";
        formatter.renderWrappedText(sb, 20, 4, text);

        String result = sb.toString();
        String[] lines = result.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
        for (int i = 1; i < lines.length; i++) {
            assertTrue(lines[i].startsWith("    "));
        }
    }

    @Test
    public void testRenderWrappedText_tabStopGreaterThanOrEqualToWidth_cappedCorrectly() {
        StringBuffer sb = new StringBuffer();
        String text = "Short words in a sentence that must wrap properly";
        formatter.renderWrappedText(sb, 10, 15, text);

        String result = sb.toString();
        String[] lines = result.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
    }

    @Test
    public void testRenderWrappedText_boundaryWrapPos_advancesCorrectly() {
        StringBuffer sb = new StringBuffer();
        String text = "abcdefghij klmnopqrstuvwxyz";
        formatter.renderWrappedText(sb, 10, 5, text);

        String result = sb.toString();
        String[] lines = result.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
    }

    @Test
    public void testPrintWrapped_singleAndMultiLine_rendersExpected() {
        formatter.printWrapped(pw, 50, "Simple single line");
        formatter.printWrapped(pw, 20, 2, "A longer sentence intended to test print wrapped with tab stop.");
        pw.flush();

        String result = sw.toString();
        assertTrue(result.contains("Simple single line"));
        assertTrue(result.contains("A longer sentence"));
    }

    @Test
    public void testFindWrapPos_specialCharactersAndEdgeCases_returnsExpectedPositions() {
        assertEquals(6, formatter.findWrapPos("line1\nline2", 10, 0));
        assertEquals(6, formatter.findWrapPos("line1\tline2", 10, 0));

        assertEquals(-1, formatter.findWrapPos("short", 10, 0));

        assertEquals(4, formatter.findWrapPos("one two three", 6, 0));

        assertEquals(13, formatter.findWrapPos("supercalifragilistic expialidocious", 10, 0));

        assertEquals(-1, formatter.findWrapPos("supercalifragilisticexpialidocious", 10, 0));
    }

    @Test
    public void testCreatePadding_positiveAndZeroLength_createsSpaces() {
        assertEquals("", formatter.createPadding(0));
        assertEquals(" ", formatter.createPadding(1));
        assertEquals("     ", formatter.createPadding(5));
    }

    @Test
    public void testRtrim_variousStrings_trimsTrailingWhitespaceOnly() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("", formatter.rtrim("   "));
        assertEquals("  abc", formatter.rtrim("  abc   \t\n\r"));
        assertEquals("abc", formatter.rtrim("abc"));
    }

    @Test
    public void testOptionComparator_sortingOptions_caseInsensitive() {
        Comparator comp = formatter.getOptionComparator();
        Option optA = new Option("a", "alpha", false, null);
        Option optB = new Option("B", "beta", false, null);
        Option optA2 = new Option("A", "ALPHA", false, null);

        assertTrue(comp.compare(optA, optB) < 0);
        assertTrue(comp.compare(optB, optA) > 0);
        assertEquals(0, comp.compare(optA, optA2));
    }
}
