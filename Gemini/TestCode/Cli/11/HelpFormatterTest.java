package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testGetAndSetWidth_validValues_updatesCorrectly() {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(120);
        assertEquals(120, formatter.getWidth());
        formatter.setWidth(0);
        assertEquals(0, formatter.getWidth());
        formatter.setWidth(-10);
        assertEquals(-10, formatter.getWidth());
    }

    @Test
    public void testGetAndSetLeftPadding_validValues_updatesCorrectly() {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }

    @Test
    public void testGetAndSetDescPadding_validValues_updatesCorrectly() {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());
        formatter.setDescPadding(0);
        assertEquals(0, formatter.getDescPadding());
    }

    @Test
    public void testGetAndSetSyntaxPrefix_validAndNull_updatesCorrectly() {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix(null);
        assertEquals(null, formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetAndSetNewLine_validAndNull_updatesCorrectly() {
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
        formatter.setNewLine(null);
        assertEquals(null, formatter.getNewLine());
    }

    @Test
    public void testGetAndSetOptPrefix_validAndNull_updatesCorrectly() {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
        formatter.setOptPrefix(null);
        assertEquals(null, formatter.getOptPrefix());
    }

    @Test
    public void testGetAndSetLongOptPrefix_validAndNull_updatesCorrectly() {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
        formatter.setLongOptPrefix(null);
        assertEquals(null, formatter.getLongOptPrefix());
    }

    @Test
    public void testGetAndSetArgName_validAndNull_updatesCorrectly() {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("parameter");
        assertEquals("parameter", formatter.getArgName());
        formatter.setArgName(null);
        assertEquals(null, formatter.getArgName());
    }

    @Test
    public void testGetAndSetOptionComparator_customAndNull_updatesCorrectly() {
        assertNotNull(formatter.getOptionComparator());
        Comparator customComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComparator);
        assertEquals(customComparator, formatter.getOptionComparator());

        // setting null resets to default OptionComparator
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertTrue(formatter.getOptionComparator() != customComparator);
    }

    @Test
    public void testOptionComparator_compare_ordersCaseInsensitively() {
        Comparator comp = formatter.getOptionComparator();
        Option optA = new Option("a", "alpha", false, "desc");
        Option optB = new Option("B", "beta", false, "desc");
        Option optLongOnly = OptionBuilder.withLongOpt("gamma").create();

        assertTrue(comp.compare(optA, optB) < 0);
        assertTrue(comp.compare(optB, optA) > 0);
        assertEquals(0, comp.compare(optA, new Option("A", "alpha2", false, "desc")));
        assertTrue(comp.compare(optA, optLongOnly) < 0);
    }

    @Test
    public void testPrintHelp_nullOrEmptySyntax_throwsIllegalArgumentException() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();

        try {
            formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", true);
            fail("Expected IllegalArgumentException for null syntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }

        try {
            formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", true);
            fail("Expected IllegalArgumentException for empty syntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelp_allOverloadsToSystemOut_printsOutput() {
        Options options = new Options();
        options.addOption("h", "help", false, "print help");

        formatter.printHelp("app", options);
        formatter.printHelp("app", options, true);
        formatter.printHelp("app", "header", options, "footer");
        formatter.printHelp("app", "header", options, "footer", true);
        formatter.printHelp(80, "app", "header", options, "footer");
        formatter.printHelp(80, "app", "header", options, "footer", true);

        String output = outContent.toString();
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("-h,--help"));
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
    }

    @Test
    public void testPrintHelp_withPrintWriter8Args_printsExpectedOutput() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption("v", false, "verbose mode");

        formatter.printHelp(pw, 80, "myApp", "My Header", options, 2, 4, "My Footer");
        pw.flush();

        String result = sw.toString();
        assertTrue(result.contains("usage: myApp"));
        assertTrue(result.contains("My Header"));
        assertTrue(result.contains("-v"));
        assertTrue(result.contains("verbose mode"));
        assertTrue(result.contains("My Footer"));
    }

    @Test
    public void testPrintHelp_withBlankHeadersAndFooters_omitsWrappedSections() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption("a", "all", false, "do all");

        formatter.printHelp(pw, 80, "app", "   ", options, 1, 2, "", false);
        formatter.printHelp(pw, 80, "app", null, options, 1, 2, null, false);
        pw.flush();

        String result = sw.toString();
        assertTrue(result.contains("usage: app"));
        assertTrue(!result.contains("null"));
    }

    @Test
    public void testPrintUsage_stringSyntax_printsProperly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "myApp [options] <file>");
        pw.flush();

        String expected = "usage: myApp [options] <file>" + formatter.getNewLine();
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintUsage_withOptionGroupsAndOptions_coversAllBranches() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        // Optional short option with arg
        Option optA = new Option("a", "argA", true, "option a");
        optA.setArgName("valueA");
        options.addOption(optA);

        // Required short option without arg
        Option optB = new Option("b", false, "option b");
        optB.setRequired(true);
        options.addOption(optB);

        // Long only option with arg but no custom argName
        Option optLong = OptionBuilder.withLongOpt("longOnly").hasArg().create();
        optLong.setArgName(null);
        options.addOption(optLong);

        // Option group - required
        OptionGroup reqGroup = new OptionGroup();
        reqGroup.setRequired(true);
        reqGroup.addOption(new Option("c", "optC", false, "desc c"));
        reqGroup.addOption(new Option("d", false, "desc d"));
        options.addOptionGroup(reqGroup);

        // Option group - optional
        OptionGroup optGroup = new OptionGroup();
        optGroup.setRequired(false);
        optGroup.addOption(new Option("e", false, "desc e"));
        optGroup.addOption(new Option("f", false, "desc f"));
        options.addOptionGroup(optGroup);

        formatter.printUsage(pw, 80, "testApp", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.startsWith("usage: testApp "));
        assertTrue(output.contains("[-a <valueA>]"));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("[--longOnly]"));
        assertTrue(output.contains("-c | -d"));
        assertTrue(output.contains("[-e | -f]"));
    }

    @Test
    public void testPrintOptions_variousOptionFormats_rendersCorrectly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        // 1. Long option only, no short opt, with arg and argName
        Option opt1 = OptionBuilder.withLongOpt("config")
                .hasArg()
                .withArgName("file")
                .withDescription("Configuration file path")
                .create();
        options.addOption(opt1);

        // 2. Short opt only, hasArg but argName is null (triggers space branch)
        Option opt2 = new Option("s", "silent mode");
        opt2.setArgs(1);
        opt2.setArgName(null);
        options.addOption(opt2);

        // 3. Short opt and long opt with description null
        Option opt3 = new Option("n", "no-desc", false, null);
        options.addOption(opt3);

        formatter.printOptions(pw, 80, options, 2, 4);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("--config <file>"));
        assertTrue(output.contains("Configuration file path"));
        assertTrue(output.contains("-s"));
        assertTrue(output.contains("-n,--no-desc"));
    }

    @Test
    public void testPrintWrapped_withAndWithoutNextLineTabStop() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 20, "Short line");
        formatter.printWrapped(pw, 15, 4, "This is a long sentence that must be wrapped across multiple lines with padding.");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("Short line"));
        assertTrue(output.contains("This is a long"));
    }

    @Test
    public void testFindWrapPos_specialCharactersAndBoundaries() {
        // Tab character within width
        int posTab = formatter.findWrapPos("hello\tworld", 10, 0);
        assertEquals(6, posTab);

        // Newline character within width
        int posNewline = formatter.findWrapPos("hello\nworld", 10, 0);
        assertEquals(6, posNewline);

        // Text shorter than width
        int posShort = formatter.findWrapPos("short", 10, 0);
        assertEquals(-1, posShort);

        // Space wrap point within startPos + width
        int posSpace = formatter.findWrapPos("first second third", 10, 0);
        assertEquals(6, posSpace);

        // Long single word exceeding width without whitespace before width
        int posNoSpaceBefore = formatter.findWrapPos("supercalifragilisticexpialidocious next", 10, 0);
        assertEquals(34, posNoSpaceBefore);

        // Long single word exceeding total text length
        int posLongSingleWord = formatter.findWrapPos("supercalifragilisticexpialidocious", 10, 0);
        assertEquals(-1, posLongSingleWord);
    }

    @Test
    public void testCreatePadding_zeroPositiveNegative() {
        assertEquals("", formatter.createPadding(0));
        assertEquals("   ", formatter.createPadding(3));
        assertEquals("", formatter.createPadding(-1));
    }

    @Test
    public void testRtrim_variousStrings() {
        assertEquals(null, formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("abc", formatter.rtrim("abc   \t\n\r"));
        assertEquals("  abc", formatter.rtrim("  abc  "));
        assertEquals("", formatter.rtrim("   \t  "));
    }

    @Test
    public void testRenderWrappedText_multilineWrappingAndExactWidth() {
        StringBuffer sb = new StringBuffer();
        String text = "Line 1 text that wraps onto line 2 and then wraps onto line 3 exactly.";
        formatter.renderWrappedText(sb, 25, 4, text);
        String result = sb.toString();

        String[] lines = result.split(formatter.getNewLine());
        assertTrue(lines.length >= 3);
        assertTrue(lines[1].startsWith("    "));
        assertTrue(lines[2].startsWith("    "));
    }

    @Test
    public void testRenderOptions_emptyOptions() {
        StringBuffer sb = new StringBuffer();
        Options emptyOptions = new Options();
        formatter.renderOptions(sb, 80, emptyOptions, 1, 3);
        assertEquals("", sb.toString());
    }
}
