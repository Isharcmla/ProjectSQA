package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ParserTest {

    private static class ConcreteParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments != null ? arguments : new String[0];
        }
    }

    private ConcreteParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new ConcreteParser();
        options = new Options();
    }

    @Test
    public void testGetAndSetOptions() {
        options.addOption("a", "alpha", false, "alpha option");
        parser.setOptions(options);

        assertEquals(options, parser.getOptions());
        assertNotNull(parser.getRequiredOptions());
        assertEquals(0, parser.getRequiredOptions().size());
    }

    @Test
    public void testParse_twoArgumentsMethod_success() throws ParseException {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a"};

        CommandLine cl = parser.parse(options, args);
        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testParse_threeArgumentsWithProperties_success() throws ParseException {
        options.addOption(OptionBuilder.hasArg().create('p'));
        Properties props = new Properties();
        props.setProperty("p", "propertyValue");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertNotNull(cl);
        assertTrue(cl.hasOption("p"));
        assertEquals("propertyValue", cl.getOptionValue('p'));
    }

    @Test
    public void testParse_threeArgumentsWithStopAtNonOption_success() throws ParseException {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a", "nonOption1", "nonOption2"};

        CommandLine cl = parser.parse(options, args, true);
        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgList().size());
        assertEquals("nonOption1", cl.getArgList().get(0));
        assertEquals("nonOption2", cl.getArgList().get(1));
    }

    @Test
    public void testParse_nullArguments_handledGracefully() throws ParseException {
        CommandLine cl = parser.parse(options, (String[]) null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParse_clearsPreviousOptionValues() throws ParseException {
        Option opt = OptionBuilder.hasArg().create('v');
        opt.addValueForProcessing("oldValue");
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-v", "newValue"});
        assertEquals("newValue", cl.getOptionValue('v'));
    }

    @Test
    public void testParse_doubleDashStopsOptionProcessingAndEatsRemaining() throws ParseException {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        String[] args = new String[]{"-a", "--", "-b", "--", "file.txt"};

        CommandLine cl = parser.parse(options, args, false);
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));

        List argList = cl.getArgList();
        assertEquals(2, argList.size());
        assertEquals("-b", argList.get(0));
        assertEquals("file.txt", argList.get(1));
    }

    @Test
    public void testParse_singleDashWithoutStopAtNonOption_addedAsArg() throws ParseException {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-", "-a"};

        CommandLine cl = parser.parse(options, args, false);
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgList().size());
        assertEquals("-", cl.getArgList().get(0));
    }

    @Test
    public void testParse_singleDashWithStopAtNonOption_eatsRest() throws ParseException {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-", "-a", "arg1"};

        CommandLine cl = parser.parse(options, args, true);
        assertFalse(cl.hasOption("a"));
        assertEquals(2, cl.getArgList().size());
        assertEquals("-a", cl.getArgList().get(0));
        assertEquals("arg1", cl.getArgList().get(1));
    }

    @Test
    public void testParse_unrecognizedOptionWithStopAtNonOption_eatsRest() throws ParseException {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-unknown", "-a", "extra"};

        CommandLine cl = parser.parse(options, args, true);
        assertFalse(cl.hasOption("a"));
        assertEquals(3, cl.getArgList().size());
        assertEquals("-unknown", cl.getArgList().get(0));
        assertEquals("-a", cl.getArgList().get(1));
        assertEquals("extra", cl.getArgList().get(2));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOptionWithoutStopAtNonOption_throwsException() throws ParseException {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-unknown"};

        parser.parse(options, args, false);
    }

    @Test
    public void testParse_nonOptionWithoutStopAtNonOption_continuesParsing() throws ParseException {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        String[] args = new String[]{"arg1", "-a", "arg2", "-b"};

        CommandLine cl = parser.parse(options, args, false);
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals(2, cl.getArgList().size());
        assertEquals("arg1", cl.getArgList().get(0));
        assertEquals("arg2", cl.getArgList().get(1));
    }

    @Test
    public void testParse_nonOptionWithStopAtNonOption_eatsRemaining() throws ParseException {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"arg1", "-a", "arg2"};

        CommandLine cl = parser.parse(options, args, true);
        assertFalse(cl.hasOption("a"));
        assertEquals(3, cl.getArgList().size());
        assertEquals("arg1", cl.getArgList().get(0));
        assertEquals("-a", cl.getArgList().get(1));
        assertEquals("arg2", cl.getArgList().get(2));
    }

    @Test
    public void testProcessProperties_nullProperties_noOp() {
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(null);
        assertEquals(0, parser.cmd.getOptions().length);
    }

    @Test
    public void testProcessProperties_optionAlreadyOnCommandLine_skipped() {
        Option opt = new Option("a", "alpha", false, "alpha desc");
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.cmd.addOption(opt);

        Properties props = new Properties();
        props.setProperty("a", "true");

        parser.processProperties(props);
        assertEquals(1, parser.cmd.getOptions().length);
    }

    @Test
    public void testProcessProperties_optionWithArg_valuesHandled() {
        Option opt = OptionBuilder.hasArg().create('f');
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("f", "file.txt");

        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption('f'));
        assertEquals("file.txt", parser.cmd.getOptionValue('f'));
    }

    @Test
    public void testProcessProperties_optionWithArg_exceptionIgnored() {
        Option opt = new Option("f", "file", true, "desc") {
            @Override
            public void addValueForProcessing(String value) {
                throw new RuntimeException("Forced failure");
            }
        };
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("f", "file.txt");

        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("f"));
    }

    @Test
    public void testProcessProperties_flagOption_validTrueValues() {
        Option opt1 = new Option("a", "alpha", false, "desc");
        Option opt2 = new Option("b", "beta", false, "desc");
        Option opt3 = new Option("c", "gamma", false, "desc");
        options.addOption(opt1);
        options.addOption(opt2);
        options.addOption(opt3);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("a", "yes");
        props.setProperty("b", "TRUE");
        props.setProperty("c", "1");

        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("a"));
        assertTrue(parser.cmd.hasOption("b"));
        assertTrue(parser.cmd.hasOption("c"));
    }

    @Test
    public void testProcessProperties_flagOption_invalidValueStopsProcessing() {
        Option opt = new Option("a", "alpha", false, "desc");
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("a", "no");

        parser.processProperties(props);
        assertFalse(parser.cmd.hasOption("a"));
    }

    @Test
    public void testCheckRequiredOptions_singleMissingOption_throwsException() {
        Option opt = OptionBuilder.isRequired().create('r');
        options.addOption(opt);
        parser.setOptions(options);

        try {
            parser.checkRequiredOptions();
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().contains("Missing required option: r"));
        }
    }

    @Test
    public void testCheckRequiredOptions_multipleMissingOptions_throwsException() {
        Option opt1 = OptionBuilder.isRequired().create('r');
        Option opt2 = OptionBuilder.isRequired().create('q');
        options.addOption(opt1);
        options.addOption(opt2);
        parser.setOptions(options);

        try {
            parser.checkRequiredOptions();
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required options: "));
            assertTrue(e.getMessage().contains("r"));
            assertTrue(e.getMessage().contains("q"));
        }
    }

    @Test
    public void testCheckRequiredOptions_noneMissing_passes() throws MissingOptionException {
        parser.setOptions(options);
        parser.checkRequiredOptions();
    }

    @Test
    public void testProcessOption_requiredOption_removesFromRequired() throws ParseException {
        Option opt = OptionBuilder.isRequired().create('r');
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        assertTrue(parser.getRequiredOptions().contains("r"));
        List<String> list = Arrays.asList("-r");
        parser.processOption("-r", list.listIterator(1));
        assertFalse(parser.getRequiredOptions().contains("r"));
        assertTrue(parser.cmd.hasOption('r'));
    }

    @Test
    public void testProcessOption_inOptionGroup_handlesRequiredGroup() throws ParseException {
        Option optA = new Option("a", "option A");
        Option optB = new Option("b", "option B");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        group.addOption(optB);

        options.addOptionGroup(group);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        assertTrue(parser.getRequiredOptions().contains(group));
        List<String> list = Arrays.asList("-a");
        parser.processOption("-a", list.listIterator(1));

        assertFalse(parser.getRequiredOptions().contains(group));
        assertEquals("a", group.getSelected());
        assertTrue(parser.cmd.hasOption("a"));
    }

    @Test
    public void testProcessOption_inNonRequiredOptionGroup_setsSelected() throws ParseException {
        Option optA = new Option("a", "option A");
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        group.addOption(optA);

        options.addOptionGroup(group);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List<String> list = Arrays.asList("-a");
        parser.processOption("-a", list.listIterator(1));

        assertEquals("a", group.getSelected());
        assertTrue(parser.cmd.hasOption("a"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_missingRequiredArgument_throwsException() throws ParseException {
        Option opt = OptionBuilder.hasArg().create('o');
        options.addOption(opt);
        parser.setOptions(options);

        List<String> list = Arrays.asList("-o");
        ListIterator<String> it = list.listIterator();
        it.next(); // consume -o
        parser.processArgs(opt, it);
    }

    @Test
    public void testProcessArgs_missingOptionalArgument_passes() throws ParseException {
        Option opt = OptionBuilder.hasOptionalArg().create('o');
        options.addOption(opt);
        parser.setOptions(options);

        List<String> list = Arrays.asList("-o");
        ListIterator<String> it = list.listIterator();
        it.next(); // consume -o
        parser.processArgs(opt, it);

        assertNull(opt.getValues());
    }

    @Test
    public void testProcessArgs_withQuotedValue_stripsQuotes() throws ParseException {
        Option opt = OptionBuilder.hasArg().create('o');
        options.addOption(opt);
        parser.setOptions(options);

        List<String> list = Arrays.asList("\"quotedValue\"");
        ListIterator<String> it = list.listIterator();
        parser.processArgs(opt, it);

        assertEquals("quotedValue", opt.getValue());
    }

    @Test
    public void testProcessArgs_multipleArgumentsUntilNextOption() throws ParseException {
        Option opt = OptionBuilder.hasArgs(2).create('m');
        options.addOption(opt);
        options.addOption("next", false, "next option");
        parser.setOptions(options);

        List<String> list = Arrays.asList("val1", "val2", "-next");
        ListIterator<String> it = list.listIterator();
        parser.processArgs(opt, it);

        String[] vals = opt.getValues();
        assertNotNull(vals);
        assertEquals(2, vals.length);
        assertEquals("val1", vals[0]);
        assertEquals("val2", vals[1]);

        assertEquals("-next", it.next());
    }

    @Test
    public void testProcessArgs_exceedingArgumentCount_stopsGracefully() throws ParseException {
        Option opt = OptionBuilder.hasArg().create('s'); // accepts only 1 arg
        options.addOption(opt);
        parser.setOptions(options);

        List<String> list = Arrays.asList("val1", "val2");
        ListIterator<String> it = list.listIterator();
        parser.processArgs(opt, it);

        assertEquals("val1", opt.getValue());
        assertEquals("val2", it.next());
    }
}
