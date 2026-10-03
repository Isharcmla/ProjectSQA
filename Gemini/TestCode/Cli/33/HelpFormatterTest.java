package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

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
    public void testGettersAndSetters() {
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

        formatter.setArgName("argument");
        Assert.assertEquals("argument", formatter.getArgName());
    }

    @Test
    public void testOptionComparator_customAndReset() {
        Comparator nullComp = null;
        formatter.setOptionComparator(nullComp);
        Assert.assertNotNull(formatter.getOptionComparator());

        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o2).getKey().compareTo(((Option) o1).getKey());
            }
        };
        formatter.setOptionComparator(customComp);
        Assert.assertSame(customComp, formatter.getOptionComparator());
    }

    @Test
    public void testOptionComparator_compare() {
        Comparator comp = formatter.getOptionComparator();
        Option optA = new Option("a", "alpha", false, "desc a");
        Option optB = new Option("b", "beta", false, "desc b");
        Option optA2 = new Option("A", "Alpha", false, "desc A");

        Assert.assertTrue(comp.compare(optA, optB) < 0);
        Assert.assertTrue(comp.compare(optB, optA) > 0);
        Assert.assertEquals(0, comp.compare(optA, optA2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_nullCmdLineSyntax_throwsException() {
        formatter.printHelp(pw, 80, null, "header", new Options(), 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_emptyCmdLineSyntax_throwsException() {
        formatter.printHelp(pw, 80, "", "header", new Options(), 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelp_simpleUsageAndOptions() {
        Options options = new Options();
        options.addOption("a", "all", false, "turn on all");
        options.addOption("f", "file", true, "input file");

        formatter.printHelp(pw, 80, "myapp", "Header text", options, 2, 4, "Footer text", false);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("usage: myapp"));
        Assert.assertTrue(output.contains("Header text"));
        Assert.assertTrue(output.contains("-a,--all"));
        Assert.assertTrue(output.contains("-f,--file <arg>"));
        Assert.assertTrue(output.contains("Footer text"));
    }

    @Test
    public void testPrintHelp_withAutoUsage() {
        Options options = new Options();
        Option requiredOpt = new Option("r", "req", true, "required option");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);
        options.addOption("o", false, "optional option");

        formatter.printHelp(pw, 80, "myapp", "Header", options, 1, 3, "Footer", true);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("usage: myapp -r <arg> [-o]"));
    }

    @Test
    public void testPrintHelp_nullAndBlankHeaderFooter() {
        Options options = new Options();
        options.addOption("h", false, "help");

        formatter.printHelp(pw, 80, "app", null, options, 1, 3, "   ", false);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.startsWith("usage: app"));
        Assert.assertTrue(output.contains("-h"));
    }

    @Test
    public void testPrintHelp_overloadsWithSystemOut() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.io.PrintStream originalOut = System.out;
        try {
            System.setOut(new java.io.PrintStream(baos));
            Options options = new Options();
            options.addOption("v", "version", false, "display version");

            formatter.printHelp("app", options);
            formatter.printHelp("app", options, true);
            formatter.printHelp("app", "header", options, "footer");
            formatter.printHelp("app", "header", options, "footer", true);
            formatter.printHelp(60, "app", "header", options, "footer");
            formatter.printHelp(60, "app", "header", options, "footer", true);

            String result = baos.toString();
            Assert.assertTrue(result.contains("usage: app"));
            Assert.assertTrue(result.contains("-v,--version"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintHelp_overloadWithPrintWriter() {
        Options options = new Options();
        options.addOption("d", "debug", false, "debug mode");

        formatter.printHelp(pw, 80, "app", "header", options, 2, 2, "footer");
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("-d,--debug"));
    }

    @Test
    public void testPrintUsage_withOptionGroup_requiredAndOptional() {
        Options options = new Options();
        
        OptionGroup reqGroup = new OptionGroup();
        reqGroup.setRequired(true);
        reqGroup.addOption(new Option("a", "option A"));
        reqGroup.addOption(new Option("b", "option B"));
        options.addOptionGroup(reqGroup);

        OptionGroup optGroup = new OptionGroup();
        optGroup.setRequired(false);
        optGroup.addOption(new Option("x", "option X"));
        optGroup.addOption(new Option("y", "option Y"));
        options.addOptionGroup(optGroup);

        formatter.printUsage(pw, 80, "mygroupapp", options);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("-a | -b"));
        Assert.assertTrue(output.contains("[-x | -y]"));
    }

    @Test
    public void testPrintUsage_longOptOnlyAndCustomArgName() {
        Options options = new Options();
        
        Option longOnly = new Option(null, "config", true, "configuration file");
        longOnly.setArgName("file.xml");
        options.addOption(longOnly);

        Option blankArgName = new Option("b", true, "blank arg");
        blankArgName.setArgName("");
        options.addOption(blankArgName);

        formatter.setLongOptSeparator("=");
        formatter.printUsage(pw, 80, "longapp", options);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("[--config=<file.xml>]"));
        Assert.assertTrue(output.contains("[-b]"));
    }

    @Test
    public void testPrintUsage_plainCmdLineSyntax() {
        formatter.printUsage(pw, 80, "myapp <file> [options]");
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.contains("usage: myapp <file> [options]"));
    }

    @Test
    public void testPrintWrapped_wrappingAndTabStops() {
        String text = "This is a very long line of text that is intended to test line wrapping behavior with tab stops correctly.";
        formatter.printWrapped(pw, 30, text);
        pw.flush();

        String output = sw.toString();
        String[] lines = output.split(formatter.getNewLine());
        Assert.assertTrue(lines.length > 1);
        for (String line : lines) {
            Assert.assertTrue(line.length() <= 30);
        }
    }

    @Test
    public void testPrintWrapped_tabStopGreaterThanOrEqualToWidth() {
        String text = "This text wraps when tabstop is larger than width";
        formatter.printWrapped(pw, 20, 25, text);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.length() > 0);
    }

    @Test
    public void testRenderOptions_variousOptionConfigs() {
        Options options = new Options();
        
        Option optLongOnly = new Option(null, "long-only", false, "desc long only");
        Option optBoth = new Option("b", "both", true, "desc both");
        optBoth.setArgName("param");
        Option optShortOnly = new Option("s", false, "desc short only");
        Option optBlankArg = new Option("k", true, "blank arg desc");
        optBlankArg.setArgName("");
        Option optNoDesc = new Option("n", "no-desc", false, null);

        options.addOption(optLongOnly);
        options.addOption(optBoth);
        options.addOption(optShortOnly);
        options.addOption(optBlankArg);
        options.addOption(optNoDesc);

        formatter.setLongOptSeparator("=");
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 2, 4);

        String result = sb.toString();
        Assert.assertTrue(result.contains("--long-only"));
        Assert.assertTrue(result.contains("-b,--both=<param>"));
        Assert.assertTrue(result.contains("-s"));
        Assert.assertTrue(result.contains("-k "));
        Assert.assertTrue(result.contains("-n,--no-desc"));
    }

    @Test
    public void testRenderWrappedText_longWordWithoutSpaces() {
        StringBuffer sb = new StringBuffer();
        String longWord = "123456789012345678901234567890";
        formatter.renderWrappedText(sb, 10, 0, longWord);

        String result = sb.toString();
        Assert.assertTrue(result.contains("1234567890"));
    }

    @Test
    public void testRenderWrappedText_wrapPosEqualsTabStopMinusOne() {
        StringBuffer sb = new StringBuffer();
        String text = "abc def ghijklmnopqrstuvwxyz";
        formatter.renderWrappedText(sb, 10, 5, text);
        Assert.assertTrue(sb.length() > 0);
    }

    @Test
    public void testFindWrapPos_newLineAndTab() {
        String textNewLine = "first line\nsecond line";
        int pos1 = formatter.findWrapPos(textNewLine, 20, 0);
        Assert.assertEquals(11, pos1);

        String textTab = "first\tsecond";
        int pos2 = formatter.findWrapPos(textTab, 20, 0);
        Assert.assertEquals(6, pos2);
    }

    @Test
    public void testFindWrapPos_beyondLength() {
        String text = "short";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_exactBoundaryAndChop() {
        String textWithSpace = "abc def ghij";
        int pos1 = formatter.findWrapPos(textWithSpace, 6, 0);
        Assert.assertEquals(3, pos1);

        String textNoSpace = "abcdefghij";
        int pos2 = formatter.findWrapPos(textNoSpace, 5, 0);
        Assert.assertEquals(5, pos2);

        int pos3 = formatter.findWrapPos(textNoSpace, 10, 0);
        Assert.assertEquals(-1, pos3);
    }

    @Test
    public void testCreatePadding() {
        Assert.assertEquals("", formatter.createPadding(0));
        Assert.assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void testRtrim() {
        Assert.assertNull(formatter.rtrim(null));
        Assert.assertEquals("", formatter.rtrim(""));
        Assert.assertEquals("  abc", formatter.rtrim("  abc   \t\n\r"));
        Assert.assertEquals("abc", formatter.rtrim("abc"));
    }
}
