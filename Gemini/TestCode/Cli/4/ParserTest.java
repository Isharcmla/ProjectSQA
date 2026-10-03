package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ParserTest {

    private static class DummyParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments != null ? arguments : new String[0];
        }
    }

    private Parser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DummyParser();
        options = new Options();
    }

    @Test
    public void testParse_twoArgOverload_success() throws Exception {
        options.addOption("a", "all", false, "toggle all");
        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testParse_threeArgOverloadWithProperties_success() throws Exception {
        options.addOption("p", "propertyOpt", true, "property option");
        Properties props = new Properties();
        props.setProperty("p", "propertyValue");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertNotNull(cl);
        assertTrue(cl.hasOption("p"));
        assertEquals("propertyValue", cl.getOptionValue("p"));
    }

    @Test
    public void testParse_threeArgOverloadWithStopAtNonOption_success() throws Exception {
        options.addOption("a", false, "opt a");
        CommandLine cl = parser.parse(options, new String[]{"-a", "nonOption", "-b"}, true);
        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("nonOption", cl.getArgs()[0]);
        assertEquals("-b", cl.getArgs()[1]);
    }

    @Test
    public void testParse_nullArguments_handledAsEmpty() throws Exception {
        CommandLine cl = parser.parse(options, (String[]) null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParse_doubleDash_eatsTheRest() throws Exception {
        options.addOption("a", false, "toggle a");
        String[] args = new String[]{"-a", "--", "arg1", "--", "arg2"};
        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
    }

    @Test
    public void testParse_singleDash_withoutStopAtNonOption() throws Exception {
        String[] args = new String[]{"-"};
        CommandLine cl = parser.parse(options, args, false);

        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    @Test
    public void testParse_singleDash_withStopAtNonOption() throws Exception {
        String[] args = new String[]{"-", "extra1", "extra2"};
        CommandLine cl = parser.parse(options, args, true);

        assertEquals(2, cl.getArgs().length);
        assertEquals("extra1", cl.getArgs()[0]);
        assertEquals("extra2", cl.getArgs()[1]);
    }

    @Test
    public void testParse_unknownOption_withStopAtNonOption() throws Exception {
        String[] args = new String[]{"-unknown", "extra"};
        CommandLine cl = parser.parse(options, args, true);

        assertEquals(2, cl.getArgs().length);
        assertEquals("-unknown", cl.getArgs()[0]);
        assertEquals("extra", cl.getArgs()[1]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unknownOption_withoutStopAtNonOption_throwsException() throws Exception {
        String[] args = new String[]{"-unknown"};
        parser.parse(options, args, false);
    }

    @Test
    public void testParse_nonOptionArg_withStopAtNonOption() throws Exception {
        options.addOption("a", false, "opt a");
        String[] args = new String[]{"arg1", "-a", "arg2"};
        CommandLine cl = parser.parse(options, args, true);

        assertFalse(cl.hasOption("a"));
        assertEquals(3, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("-a", cl.getArgs()[1]);
        assertEquals("arg2", cl.getArgs()[2]);
    }

    @Test
    public void testParse_helpOptionsValuesCleared() throws Exception {
        Option helpOpt = new Option("h", "help", true, "help option");
        helpOpt.addValue("oldValue");
        options.addOption(helpOpt);

        CommandLine cl = parser.parse(options, new String[]{"-h", "newValue"});
        assertEquals("newValue", cl.getOptionValue("h"));
    }

    @Test
    public void testParse_requiredOption_present_success() throws Exception {
        Option reqOpt = new Option("r", "required", true, "required option");
        reqOpt.setRequired(true);
        options.addOption(reqOpt);

        CommandLine cl = parser.parse(options, new String[]{"-r", "val"});
        assertTrue(cl.hasOption("r"));
        assertEquals("val", cl.getOptionValue("r"));
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_requiredOption_missing_throwsException() throws Exception {
        Option reqOpt = new Option("r", "required", true, "required option");
        reqOpt.setRequired(true);
        options.addOption(reqOpt);

        parser.parse(options, new String[0]);
    }

    @Test
    public void testParse_requiredOptionGroup_present_success() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("g1", "group1", false, "group opt 1");
        Option opt2 = new Option("g2", "group2", false, "group opt 2");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-g1"});
        assertTrue(cl.hasOption("g1"));
        assertEquals("g1", group.getSelected());
    }

    @Test
    public void testParse_properties_optionWithArg() throws Exception {
        options.addOption("f", "file", true, "file path");
        Properties props = new Properties();
        props.setProperty("f", "test.txt");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertTrue(cl.hasOption("f"));
        assertEquals("test.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testParse_properties_optionWithArg_alreadySpecifiedOnCmdLine() throws Exception {
        options.addOption("f", "file", true, "file path");
        Properties props = new Properties();
        props.setProperty("f", "fromProps.txt");

        CommandLine cl = parser.parse(options, new String[]{"-f", "fromCmd.txt"}, props);
        assertTrue(cl.hasOption("f"));
        assertEquals("fromCmd.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testParse_properties_optionWithoutArg_trueValues() throws Exception {
        options.addOption("v", "verbose", false, "verbose mode");
        options.addOption("d", "debug", false, "debug mode");
        options.addOption("t", "trace", false, "trace mode");

        Properties props = new Properties();
        props.setProperty("v", "yes");
        props.setProperty("d", "true");
        props.setProperty("t", "1");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertTrue(cl.hasOption("v"));
        assertTrue(cl.hasOption("d"));
        assertTrue(cl.hasOption("t"));
    }

    @Test
    public void testParse_properties_optionWithoutArg_falseValue() throws Exception {
        options.addOption("v", "verbose", false, "verbose mode");

        Properties props = new Properties();
        props.setProperty("v", "no");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertFalse(cl.hasOption("v"));
    }

    @Test
    public void testParse_properties_optionCannotAddValue_ignoredGracefully() throws Exception {
        Option opt = new Option("c", "count", false, "no args allowed");
        opt.setArgs(0);
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("c", "val");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertFalse(cl.hasOption("c"));
    }

    @Test
    public void testProcessArgs_quotedValue() throws Exception {
        Option opt = new Option("m", "message", true, "message");
        options.addOption(opt);

        List<String> tokens = Arrays.asList("\"hello world\"");
        ListIterator<String> iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertEquals("hello world", opt.getValue());
    }

    @Test
    public void testProcessArgs_stopsAtNextOption() throws Exception {
        Option opt1 = new Option("a", "alpha", true, "opt a");
        Option opt2 = new Option("b", "beta", false, "opt b");
        options.addOption(opt1);
        options.addOption(opt2);

        List<String> tokens = Arrays.asList("valueA", "-b");
        ListIterator<String> iter = tokens.listIterator();

        parser.processArgs(opt1, iter);
        assertEquals("valueA", opt1.getValue());
        assertEquals("-b", iter.next());
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_missingRequiredArgument_throwsException() throws Exception {
        Option opt = new Option("a", "alpha", true, "opt a");
        options.addOption(opt);

        List<String> tokens = new ArrayList<String>();
        ListIterator<String> iter = tokens.listIterator();

        parser.processArgs(opt, iter);
    }

    @Test
    public void testProcessArgs_optionalArgument_emptyList_success() throws Exception {
        Option opt = new Option("o", "optional", true, "optional opt");
        opt.setOptionalArg(true);
        options.addOption(opt);

        List<String> tokens = new ArrayList<String>();
        ListIterator<String> iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertEquals(null, opt.getValue());
    }

    @Test
    public void testProcessArgs_stopsWhenAddValueThrowsException() throws Exception {
        Option opt = new Option("a", "alpha", true, "opt a");
        opt.setArgs(1);
        options.addOption(opt);

        List<String> tokens = Arrays.asList("val1", "val2");
        ListIterator<String> iter = tokens.listIterator();

        parser.processArgs(opt, iter);
        assertEquals("val1", opt.getValue());
        assertEquals("val2", iter.next());
    }
}
