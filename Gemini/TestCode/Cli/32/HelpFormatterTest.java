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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private String defaultEOL;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        defaultEOL = formatter.getNewLine();
    }

    @Test
    public void testGetAndSetWidth() {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
        formatter.setWidth(0);
        assertEquals(0, formatter.getWidth());
        formatter.setWidth(-10);
        assertEquals(-10, formatter.getWidth());
    }

    @Test
    public void testGetAndSetLeftPadding() {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }

    @Test
    public void testGetAndSetDescPadding() {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());
        formatter.setDescPadding(0);
        assertEquals(0, formatter.getDescPadding());
    }

    @Test
    public void testGetAndSetSyntaxPrefix() {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix(null);
        assertNull(formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetAndSetNewLine() {
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
        formatter.setNewLine("");
        assertEquals("", formatter.getNewLine());
        formatter.setNewLine(null);
        assertNull(formatter.getNewLine());
    }

    @Test
    public void testGetAndSetOptPrefix() {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
        formatter.setOptPrefix(null);
        assertNull(formatter.getOptPrefix());
    }

    @Test
    public void testGetAndSetLongOptPrefix() {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getLongOptPrefix());
        formatter.setLongOptPrefix(null);
        assertNull(formatter.getLongOptPrefix());
    }

    @Test
    public void testGetAndSetLongOptSeparator() {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
        formatter.setLongOptSeparator("");
        assertEquals("", formatter.getLongOptSeparator());
        formatter.setLongOptSeparator(null);
        assertNull(formatter.getLongOptSeparator());
    }

    @Test
    public void testGetAndSetArgName() {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("val");
        assertEquals("val", formatter.getArgName());
        formatter.setArgName("");
        assertEquals("", formatter.getArgName());
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }

    @Test
    public void testGetAndSetOptionComparator() {
        assertNotNull(formatter.getOptionComparator());
        Comparator customComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComparator);
        assertEquals(customComparator, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());

        // Test default OptionComparator behavior
        Option optA = new Option("a", "alpha option");
        Option optB = new Option("b", "beta option");
        Option optUpperA = new Option("A", "upper alpha");
        assertEquals(0, formatter.getOptionComparator().compare(optA, optUpperA));
        assertTrue(formatter.getOptionComparator().compare(optA, optB) < 0);
        assertTrue(formatter.getOptionComparator().compare(optB, optA) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsException() {
        formatter.printHelp((String) null, new Options());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsException() {
        formatter.printHelp("", new Options());
    }

    @Test
    public void testPrintHelp_twoArgs_systemOut() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos));
            Options options = new Options();
            options.addOption("a", "alpha");
            formatter.printHelp("app", options);
            String output = baos.toString();
            assertTrue(output.contains("usage: app"));
            assertTrue(output.contains("-a"));
            assertTrue(output.contains("alpha"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_threeArgs_autoUsageTrue_systemOut() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos));
            Options options = new Options();
            options.addOption("b", "beta");
            formatter.printHelp("app", options, true);
            String output = baos.toString();
            assertTrue(output.contains("usage: app [-b]"));
            assertTrue(output.contains("-b"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_fourArgs_headerAndFooter() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos));
            Options options = new Options();
            formatter.printHelp("app", "Header banner", options, "Footer banner");
            String output = baos.toString();
            assertTrue(output.contains("Header banner"));
            assertTrue(output.contains("Footer banner"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_fiveArgs_stringWidthHeaderOptionsFooterAutoUsage() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos));
            Options options = new Options();
            options.addOption("c", "charlie");
            formatter.printHelp("app", "Header", options, "Footer", true);
            String output = baos.toString();
            assertTrue(output.contains("usage: app [-c]"));
            assertTrue(output.contains("Header"));
            assertTrue(output.contains("Footer"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_fiveArgs_intWidth() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos));
            Options options = new Options();
            formatter.printHelp(80, "app", "Header", options, "Footer");
            String output = baos.toString();
            assertTrue(output.contains("Header"));
            assertTrue(output.contains("Footer"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_sixArgs_intWidthAutoUsage() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos));
            Options options = new Options();
            options.addOption("d", "delta");
            formatter.printHelp(80, "app", "Header", options, "Footer", true);
            String output = baos.toString();
            assertTrue(output.contains("usage: app [-d]"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_eightArgs_withPrintWriter() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption("e", "echo");

        formatter.printHelp(pw, 80, "app", "Header", options, 2, 4, "Footer");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
        assertTrue(output.contains("-e"));
    }

    @Test
    public void testPrintHelp_nineArgs_emptyHeaderAndFooter() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption("f", "foxtrot");

        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "", false);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("-f"));
    }

    @Test
    public void testPrintUsage_plainSyntax() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "myapp -param1 -param2");
        pw.flush();

        String expected = "usage: myapp -param1 -param2" + defaultEOL;
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testPrintUsage_withOptions_variousCombinations() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();

        Option optShortOnly = new Option("a", false, "short only");
        Option optRequired = new Option("b", true, "required option");
        optRequired.setRequired(true);

        Option optLongOnly = OptionBuilder.withLongOpt("long-only").hasArg().withArgName("LVAL").create();

        Option optEmptyArgName = OptionBuilder.withLongOpt("empty-arg").hasArg().withArgName("").create('e');

        Option optCustomArgName = OptionBuilder.withLongOpt("custom-arg").hasArg().withArgName("CUSTOM").create('c');

        options.addOption(optShortOnly);
        options.addOption(optRequired);
        options.addOption(optLongOnly);
        options.addOption(optEmptyArgName);
        options.addOption(optCustomArgName);

        // Group not required
        OptionGroup optionalGroup = new OptionGroup();
        optionalGroup.addOption(new Option("x", "x option"));
        optionalGroup.addOption(new Option("y", "y option"));
        options.addOptionGroup(optionalGroup);

        // Group required
        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.setRequired(true);
        requiredGroup.addOption(OptionBuilder.withLongOpt("req-opt1").create());
        requiredGroup.addOption(OptionBuilder.withLongOpt("req-opt2").create());
        options.addOptionGroup(requiredGroup);

        formatter.printUsage(pw, 80, "testapp", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("usage: testapp"));
        assertTrue(output.contains("[-a]"));
        assertTrue(output.contains("-b <arg>"));
        assertTrue(output.contains("[--long-only <LVAL>]"));
        assertTrue(output.contains("[-e]"));
        assertTrue(output.contains("[-c <CUSTOM>]"));
        assertTrue(output.contains("[-x | -y]"));
        assertTrue(output.contains("--req-opt1 | --req-opt2"));
    }

    @Test
    public void testPrintOptions_renderedProperly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Options options = new Options();
        Option shortOnly = new Option("s", "short desc");
        Option longOnly = OptionBuilder.withLongOpt("long-only").hasArg().withDescription("long only desc").create();
        Option both = OptionBuilder.withLongOpt("both-opts").hasArg().withArgName("VAL").withDescription("both desc").create('b');
        Option emptyArg = OptionBuilder.hasArg().withArgName("").withDescription("empty arg desc").create('e');
        Option nullDesc = new Option("n", null);

        options.addOption(shortOnly);
        options.addOption(longOnly);
        options.addOption(both);
        options.addOption(emptyArg);
        options.addOption(nullDesc);

        formatter.setLongOptSeparator("=");
        formatter.printOptions(pw, 80, options, 2, 4);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.contains("-s"));
        assertTrue(output.contains("--long-only=<arg>"));
        assertTrue(output.contains("-b,--both-opts=<VAL>"));
        assertTrue(output.contains("-e "));
        assertTrue(output.contains("-n"));
    }

    @Test
    public void testPrintWrapped_tabAndNewLineAndWrapping() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 20, "This is a line with\nnewline and \ttab character.");
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("newline and"));
    }

    @Test
    public void testPrintWrapped_infiniteLoopGuard_tabStopGreaterThanWidth() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 10, 15, "This is a long sentence that must wrap properly.");
        pw.flush();
        String output = sw.toString();
        assertTrue(output.split(defaultEOL).length > 1);
    }

    @Test
    public void testPrintWrapped_unbreakableLongWord() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        String longWord = "supercalifragilisticexpialidociousveryverylongword";
        formatter.printWrapped(pw, 10, 0, longWord);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains(longWord));
    }

    @Test
    public void testPrintWrapped_longWordWithNextLineTabStopExceeded() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        String text = "abc defghijklmnopqrstuvwxyz1234567890";
        formatter.printWrapped(pw, 10, 5, text);
        pw.flush();
        String output = sw.toString();
        assertNotNull(output);
    }

    @Test
    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals(" ", formatter.createPadding(1));
        assertEquals("    ", formatter.createPadding(4));
    }

    @Test
    public void testRtrim() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("abc", formatter.rtrim("abc"));
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("  abc", formatter.rtrim("  abc \t\r\n "));
        assertEquals("", formatter.rtrim("   \t \n\r "));
    }

    @Test
    public void testFindWrapPos_variousCases() {
        // Line ends before max wrap position with \n
        assertEquals(4, formatter.findWrapPos("abc\ndef", 10, 0));
        // Line with \t
        assertEquals(4, formatter.findWrapPos("abc\tdef", 10, 0));
        // Start pos + width >= text length
        assertEquals(-1, formatter.findWrapPos("short", 10, 0));
        // Normal whitespace wrap before width
        assertEquals(3, formatter.findWrapPos("abc def", 5, 0));
        // Unbreakable string reaching end
        assertEquals(-1, formatter.findWrapPos("abcdefghij", 5, 0));
        // Breakable string after startPos + width
        assertEquals(10, formatter.findWrapPos("abcdefghij klmn", 5, 0));
    }

    @Test
    public void testRenderWrappedText_noWrapNeeded() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 80, 0, "Simple short text");
        assertEquals("Simple short text", sb.toString());
    }

    @Test
    public void testDeprecatedPublicFieldsDirectAccess() {
        HelpFormatter hf = new HelpFormatter();
        hf.defaultWidth = 50;
        assertEquals(50, hf.getWidth());
        hf.defaultLeftPad = 3;
        assertEquals(3, hf.getLeftPadding());
        hf.defaultDescPad = 5;
        assertEquals(5, hf.getDescPadding());
        hf.defaultSyntaxPrefix = "use: ";
        assertEquals("use: ", hf.getSyntaxPrefix());
        hf.defaultNewLine = "\r\n";
        assertEquals("\r\n", hf.getNewLine());
        hf.defaultOptPrefix = "~";
        assertEquals("~", hf.getOptPrefix());
        hf.defaultLongOptPrefix = "~~";
        assertEquals("~~", hf.getLongOptPrefix());
        hf.defaultArgName = "param";
        assertEquals("param", hf.getArgName());
    }
}
