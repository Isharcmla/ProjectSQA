package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
    }

    @Test
    public void testGetAndSetWidth() {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testGetAndSetLeftPadding() {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testGetAndSetDescPadding() {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(8);
        assertEquals(8, formatter.getDescPadding());
    }

    @Test
    public void testGetAndSetSyntaxPrefix() {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetAndSetNewLine() {
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testGetAndSetOptPrefix() {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    @Test
    public void testGetAndSetLongOptPrefix() {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetAndSetArgName() {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testPrintHelp_nullCmdLineSyntax_throwsException() {
        Options options = new Options();
        try {
            formatter.printHelp(printWriter, 80, null, "Header", options, 1, 3, "Footer", true);
            fail("Expected IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelp_emptyCmdLineSyntax_throwsException() {
        Options options = new Options();
        try {
            formatter.printHelp(printWriter, 80, "", "Header", options, 1, 3, "Footer", true);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelp_withHeaderAndFooter_success() {
        Options options = new Options();
        options.addOption("a", "all", false, "do not ignore entries starting with .");
        options.addOption("b", false, "do not list implied entries");

        formatter.printHelp(printWriter, 80, "myApp [options]", "Header text", options, 2, 4, "Footer text", false);
        printWriter.flush();

        String result = stringWriter.toString();
        assertTrue(result.contains("usage: myApp [options]"));
        assertTrue(result.contains("Header text"));
        assertTrue(result.contains("-a,--all"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains("Footer text"));
    }

    @Test
    public void testPrintHelp_withNullAndBlankHeaderAndFooter() {
        Options options = new Options();
        options.addOption("v", "version", false, "display version");

        formatter.printHelp(printWriter, 80, "app", null, options, 1, 3, "   ", true);
        printWriter.flush();

        String result = stringWriter.toString();
        assertTrue(result.contains("usage: app [-v]"));
        assertTrue(result.contains("-v,--version"));
        assertFalse(result.contains("   \n"));
    }

    @Test
    public void testPrintHelp_overloadsAndSystemOut() {
        Options options = new Options();
        options.addOption("h", "help", false, "print help");

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(outContent));

            formatter.printHelp("app", options);
            formatter.printHelp("app", options, true);
            formatter.printHelp("app", "header", options, "footer");
            formatter.printHelp("app", "header", options, "footer", true);
            formatter.printHelp(80, "app", "header", options, "footer");
            formatter.printHelp(80, "app", "header", options, "footer", true);

            formatter.printHelp(printWriter, 80, "app", "header", options, 1, 2, "footer");
            printWriter.flush();

            String sysOutResult = outContent.toString();
            assertTrue(sysOutResult.contains("usage: app"));
            assertTrue(sysOutResult.contains("-h,--help"));
            assertTrue(stringWriter.toString().contains("usage: app"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintUsage_plainSyntaxWithoutSpace() {
        formatter.printUsage(printWriter, 80, "myapp");
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: myapp"));
    }

    @Test
    public void testPrintUsage_withOptionsAndOptionGroups() {
        Options options = new Options();

        Option optA = new Option("a", "apple", false, "desc apple");
        Option optB = new Option("b", "banana", true, "desc banana");
        optB.setRequired(true);

        Option optLongOnly = new Option(null, "cherry", false, "desc cherry");

        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.setRequired(true);
        Option g1 = new Option("x", false, "option x");
        Option g2 = new Option("y", false, "option y");
        requiredGroup.addOption(g1);
        requiredGroup.addOption(g2);

        OptionGroup optionalGroup = new OptionGroup();
        optionalGroup.setRequired(false);
        Option g3 = new Option("m", false, "option m");
        Option g4 = new Option(null, "more", true, "option more");
        optionalGroup.addOption(g3);
        optionalGroup.addOption(g4);

        options.addOption(optA);
        options.addOption(optB);
        options.addOption(optLongOnly);
        options.addOptionGroup(requiredGroup);
        options.addOptionGroup(optionalGroup);

        formatter.printUsage(printWriter, 80, "myApp", options);
        printWriter.flush();

        String result = stringWriter.toString();
        assertTrue(result.contains("usage: myApp"));
        assertTrue(result.contains("[-a]"));
        assertTrue(result.contains("-b <arg>"));
        assertTrue(result.contains("[--cherry]"));
        assertTrue(result.contains("-x | -y"));
        assertTrue(result.contains("[-m | --more <arg>]"));
    }

    @Test
    public void testRenderOptions_variousOptionConfigurations() {
        Options options = new Options();

        Option shortOnly = new Option("s", "short only");
        Option longOnly = new Option(null, "long-only", false, "long only desc");
        Option shortAndLongWithArg = new Option("o", "output", true, "output file");
        shortAndLongWithArg.setArgName("FILE");

        Option argWithoutName = new Option("n", true, "no arg name desc");
        argWithoutName.setArgName(null);

        Option noDesc = new Option("z", "no description");
        noDesc.setDescription(null);

        options.addOption(shortOnly);
        options.addOption(longOnly);
        options.addOption(shortAndLongWithArg);
        options.addOption(argWithoutName);
        options.addOption(noDesc);

        formatter.printOptions(printWriter, 80, options, 2, 4);
        printWriter.flush();

        String result = stringWriter.toString();
        assertTrue(result.contains("  -s"));
        assertTrue(result.contains("     --long-only"));
        assertTrue(result.contains("  -o,--output <FILE>"));
        assertTrue(result.contains("  -n "));
        assertTrue(result.contains("  -z"));
    }

    @Test
    public void testPrintWrapped_withTabsAndNewlines() {
        String text = "Line 1\nLine 2\tTabbed\nLine 3 is a very long line that should be wrapped properly across multiple lines of output to verify wrapping.";
        formatter.printWrapped(printWriter, 30, text);
        printWriter.flush();

        String result = stringWriter.toString();
        assertTrue(result.contains("Line 1"));
        assertTrue(result.contains("Line 2"));
        assertTrue(result.contains("Line 3"));
    }

    @Test
    public void testFindWrapPos_exactAndEdgeCases() {
        // String shorter than width
        assertEquals(-1, formatter.findWrapPos("short", 10, 0));

        // Tab character before width
        assertEquals(5, formatter.findWrapPos("test\ttab", 6, 0));

        // Newline character before width
        assertEquals(5, formatter.findWrapPos("test\nnewline", 6, 0));

        // Break on space before width
        assertEquals(5, formatter.findWrapPos("word1 word2 word3", 8, 0));

        // Break on carriage return
        assertEquals(5, formatter.findWrapPos("word1\rword2", 8, 0));

        // Word longer than width without space before, but space after width
        // "abcdefghijklmn opqrst" with width 5
        assertEquals(14, formatter.findWrapPos("abcdefghijklmn opqrst", 5, 0));

        // No whitespace anywhere, longer than width -> return -1
        assertEquals(-1, formatter.findWrapPos("abcdefghijklmnopqrstuvwxyz", 10, 0));
    }

    @Test
    public void testRenderWrappedText_multilineWrap() {
        StringBuffer sb = new StringBuffer();
        String text = "This is a sentence that will definitely wrap across several lines when given a small width.";
        formatter.renderWrappedText(sb, 20, 4, text);

        String result = sb.toString();
        String[] lines = result.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
        for (int i = 1; i < lines.length; i++) {
            assertTrue("Line should start with tab stop padding", lines[i].startsWith("    "));
        }
    }

    @Test
    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void testRtrim() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("", formatter.rtrim("   \t  \n \r  "));
        assertEquals("abc", formatter.rtrim("abc"));
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("  abc", formatter.rtrim("  abc  \t "));
    }
}
