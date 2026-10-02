package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest {

    /**
     * Concrete implementation of Parser for testing purposes.
     * flatten() simply returns the arguments unchanged (similar to BasicParser).
     */
    private static class SimpleParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
    }

    private SimpleParser parser;

    @Before
    public void setUp() {
        parser = new SimpleParser();
    }

    // ---------- parse(Options, String[]) ----------

    @Test
    public void testParse_singleOptionNoArg_optionPresent() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "enable a"));

        CommandLine cmd = parser.parse(options, new String[]{"-a"});

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_optionWithArgument_valueSet() throws Exception {
        Options options = new Options();
        options.addOption(new Option("f", true, "file"));

        CommandLine cmd = parser.parse(options, new String[]{"-f", "test.txt"});

        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testParse_nullArguments_returnsEmptyCommandLine() throws Exception {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, null);

        assertEquals(0, cmd.getOptions().length);
        assertEquals(0, cmd.getArgList().size());
    }

    // ---------- parse(Options, String[], boolean) ----------

    @Test
    public void testParse_doubleDash_stopsOptionParsing() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "desc"));

        CommandLine cmd = parser.parse(options, new String[]{"--", "-a"});

        assertFalse(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-a", cmd.getArgList().get(0));
    }

    @Test
    public void testParse_singleDash_stopAtNonOptionFalse_addsArg() throws Exception {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[]{"-"}, false);

        assertEquals(1, cmd.getArgList().size());
        assertEquals("-", cmd.getArgList().get(0));
    }

    @Test
    public void testParse_singleDash_stopAtNonOptionTrue_eatsRest() throws Exception {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[]{"-", "arg1"}, true);

        // "-" itself is not added when stopAtNonOption is true,
        // but the remaining tokens are eaten and added.
        assertEquals(1, cmd.getArgList().size());
        assertEquals("arg1", cmd.getArgList().get(0));
    }

    @Test
    public void testParse_stopAtNonOption_recognizedOption_processesNormally() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "desc"));

        CommandLine cmd = parser.parse(options, new String[]{"-a"}, true);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_unrecognizedOption_stopAtNonOption_eatsRestAndAddsArg() throws Exception {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[]{"-x", "arg1"}, true);

        assertEquals(2, cmd.getArgList().size());
        assertTrue(cmd.getArgList().contains("-x"));
        assertTrue(cmd.getArgList().contains("arg1"));
    }

    @Test
    public void testParse_nonOptionArgument_stopAtNonOptionTrue_eatsRest() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "desc"));

        CommandLine cmd = parser.parse(options, new String[]{"arg1", "-a", "arg2"}, true);

        assertEquals(3, cmd.getArgList().size());
        assertFalse(cmd.hasOption("a"));
    }

    // ---------- parse(Options, String[], Properties) ----------

    @Test
    public void testParse_withProperties_setsOptionFromProperty() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose"));

        Properties props = new Properties();
        props.setProperty("v", "true");

        CommandLine cmd = parser.parse(options, new String[]{}, props);

        assertTrue(cmd.hasOption("v"));
    }

    @Test
    public void testParse_withProperties_valueFalse_optionNotAdded() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose"));

        Properties props = new Properties();
        props.setProperty("v", "false");

        CommandLine cmd = parser.parse(options, new String[]{}, props);

        assertFalse(cmd.hasOption("v"));
    }

    @Test
    public void testParse_withProperties_optionHasArg_setsValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("f", true, "file"));

        Properties props = new Properties();
        props.setProperty("f", "test.txt");

        CommandLine cmd = parser.parse(options, new String[]{}, props);

        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testParse_withProperties_optionAlreadySetInCmd_notOverridden() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose"));

        Properties props = new Properties();
        props.setProperty("v", "true");

        CommandLine cmd = parser.parse(options, new String[]{"-v"}, props);

        assertTrue(cmd.hasOption("v"));
    }

    // ---------- parse(Options, String[], Properties, boolean) ----------

    @Test
    public void testParse_fullOverload_normalUsage() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "desc"));

        Properties props = new Properties();

        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props, false);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_calledTwice_valuesResetBetweenCalls() throws Exception {
        Options options = new Options();
        options.addOption(new Option("f", true, "file"));

        parser.parse(options, new String[]{"-f", "first.txt"});
        CommandLine cmd2 = parser.parse(options, new String[]{"-f", "second.txt"});

        assertEquals("second.txt", cmd2.getOptionValue("f"));
    }

    // ---------- exception scenarios ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOption_noStopAtNonOption_throwsException() throws Exception {
        Options options = new Options();

        parser.parse(options, new String[]{"-x"});
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsMissingOptionException() throws Exception {
        Options options = new Options();
        Option req = new Option("r", "required option");
        req.setRequired(true);
        options.addOption(req);

        parser.parse(options, new String[]{});
    }

    @Test
    public void testParse_multipleMissingRequiredOptions_messageContainsPlural() throws Exception {
        Options options = new Options();
        Option req1 = new Option("r1", "req1");
        req1.setRequired(true);
        Option req2 = new Option("r2", "req2");
        req2.setRequired(true);
        options.addOption(req1);
        options.addOption(req2);

        try {
            parser.parse(options, new String[]{});
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required options"));
            assertTrue(e.getMessage().contains("r1"));
            assertTrue(e.getMessage().contains("r2"));
        }
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_argumentOption_missingValue_throwsMissingArgumentException() throws Exception {
        Options options = new Options();
        Option f = new Option("f", true, "file");
        options.addOption(f);

        parser.parse(options, new String[]{"-f"});
    }

    // ---------- OptionGroup scenarios ----------

    @Test
    public void testParse_optionGroup_selectsOption() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option a = new Option("a", "a desc");
        Option b = new Option("b", "b desc");
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});

        assertEquals("a", group.getSelected());
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_requiredOptionGroup_satisfied_noException() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option a = new Option("a", "desc");
        group.addOption(a);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-a"});

        assertTrue(cmd.hasOption("a"));
    }

    // ---------- protected methods direct testing ----------

    @Test
    public void testSetOptionsAndGetOptions_returnsSameInstance() {
        Options options = new Options();
        parser.setOptions(options);

        assertSame(options, parser.getOptions());
    }

    @Test
    public void testGetRequiredOptions_afterSetOptions_returnsListFromOptions() {
        Options options = new Options();
        Option req = new Option("r", "required");
        req.setRequired(true);
        options.addOption(req);

        parser.setOptions(options);

        assertNotNull(parser.getRequiredOptions());
        assertEquals(1, parser.getRequiredOptions().size());
    }

    @Test
    public void testProcessArgs_directCall_setsValue() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", true, "file");
        options.addOption(opt);
        parser.setOptions(options);

        List tokenList = Arrays.asList("value1");
        ListIterator iter = tokenList.listIterator();

        parser.processArgs(opt, iter);

        assertEquals("value1", opt.getValue());
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_emptyIterator_throwsMissingArgumentException() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", true, "file");
        options.addOption(opt);
        parser.setOptions(options);

        List tokenList = Arrays.asList();
        ListIterator iter = tokenList.listIterator();

        parser.processArgs(opt, iter);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOption_unrecognizedOption_throwsException() throws Exception {
        Options options = new Options();
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List tokenList = Arrays.asList();
        ListIterator iter = tokenList.listIterator();

        parser.processOption("-x", iter);
    }

    @Test
    public void testCheckRequiredOptions_noRequiredOptions_noException() throws Exception {
        Options options = new Options();
        parser.setOptions(options);

        parser.checkRequiredOptions();
        // no exception expected
        assertTrue(true);
    }
}
