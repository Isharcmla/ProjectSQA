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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ParserTest {

    private static class DefaultTestParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments != null ? arguments : new String[0];
        }
    }

    private Parser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultTestParser();
        options = new Options();
    }

    @Test
    public void testParse_twoArgSignature_success() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1"});

        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgList().size());
        assertEquals("arg1", cl.getArgList().get(0));
    }

    @Test
    public void testParse_threeArgSignatureWithProperties_success() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b");
        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cl = parser.parse(options, new String[]{"-a"}, props);

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("propValue", cl.getOptionValue("b"));
    }

    @Test
    public void testParse_threeArgSignatureWithStopAtNonOption_success() throws Exception {
        options.addOption("a", false, "option a");

        CommandLine cl = parser.parse(options, new String[]{"-a", "nonOption", "-b"}, true);

        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("nonOption", cl.getArgs()[0]);
        assertEquals("-b", cl.getArgs()[1]);
    }

    @Test
    public void testParse_nullArguments_treatedAsEmptyArray() throws Exception {
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
        assertEquals(0, cl.getOptions().length);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParse_doubleDash_eatsRestOfTokens() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");

        CommandLine cl = parser.parse(options, new String[]{"-a", "--", "-b", "--", "arg1"});

        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("-b", cl.getArgs()[0]);
        assertEquals("arg1", cl.getArgs()[1]);
    }

    @Test
    public void testParse_singleDashWithoutStopAtNonOption_addedAsArg() throws Exception {
        CommandLine cl = parser.parse(options, new String[]{"-", "arg1"}, false);

        assertEquals(2, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
        assertEquals("arg1", cl.getArgs()[1]);
    }

    @Test
    public void testParse_singleDashWithStopAtNonOption_eatsRest() throws Exception {
        CommandLine cl = parser.parse(options, new String[]{"-", "arg1"}, true);

        assertEquals(1, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
    }

    @Test
    public void testParse_unrecognizedOptionWithStopAtNonOption_eatsRest() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[]{"-a", "-unknown", "extra1", "extra2"}, true);

        assertTrue(cl.hasOption("a"));
        assertEquals(3, cl.getArgs().length);
        assertEquals("-unknown", cl.getArgs()[0]);
        assertEquals("extra1", cl.getArgs()[1]);
        assertEquals("extra2", cl.getArgs()[2]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOptionWithoutStopAtNonOption_throwsException() throws Exception {
        parser.parse(options, new String[]{"-unknown"}, false);
    }

    @Test
    public void testParse_nonOptionTokenWithStopAtNonOption_eatsRest() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[]{"nonOption", "-a", "extra"}, true);

        assertFalse(cl.hasOption("a"));
        assertEquals(3, cl.getArgs().length);
        assertEquals("nonOption", cl.getArgs()[0]);
        assertEquals("-a", cl.getArgs()[1]);
        assertEquals("extra", cl.getArgs()[2]);
    }

    @Test
    public void testParse_reuseOptionsAndOptionGroup_cleansState() throws Exception {
        Option optA = new Option("a", "option a");
        Option optB = new Option("b", "option b");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cl1 = parser.parse(options, new String[]{"-a"});
        assertTrue(cl1.hasOption("a"));
        assertEquals("a", group.getSelected());

        CommandLine cl2 = parser.parse(options, new String[]{"-b"});
        assertTrue(cl2.hasOption("b"));
        assertEquals("b", group.getSelected());
    }

    @Test
    public void testProcessProperties_nullProperties_noOp() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[]{"-a"}, null, false);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testProcessProperties_variousValueFormats() throws Exception {
        options.addOption("t", false, "true option");
        options.addOption("y", false, "yes option");
        options.addOption("one", false, "1 option");
        options.addOption("f", false, "false option");
        options.addOption("argOpt", true, "arg option");

        Properties props = new Properties();
        props.setProperty("t", "true");
        props.setProperty("y", "yes");
        props.setProperty("one", "1");
        props.setProperty("f", "false");
        props.setProperty("argOpt", "customVal");

        CommandLine cl = parser.parse(options, new String[0], props, false);

        assertTrue(cl.hasOption("t"));
        assertTrue(cl.hasOption("y"));
        assertTrue(cl.hasOption("one"));
        assertFalse(cl.hasOption("f"));
        assertTrue(cl.hasOption("argOpt"));
        assertEquals("customVal", cl.getOptionValue("argOpt"));
    }

    @Test
    public void testProcessProperties_optionAlreadyPresent_ignored() throws Exception {
        options.addOption("a", true, "option a");
        Properties props = new Properties();
        props.setProperty("a", "propertyValue");

        CommandLine cl = parser.parse(options, new String[]{"-a", "cliValue"}, props, false);

        assertTrue(cl.hasOption("a"));
        assertEquals("cliValue", cl.getOptionValue("a"));
    }

    @Test
    public void testProcessProperties_propertyValueCannotBeAddedToOption_handledGracefully() throws Exception {
        Option opt = new Option("a", true, "option a") {
            @Override
            public boolean addValue(String value) {
                throw new RuntimeException("Cannot add value");
            }
        };
        options.addOption(opt);
        Properties props = new Properties();
        props.setProperty("a", "val");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testCheckRequiredOptions_missingRequiredOption_throwsException() {
        Option opt = new Option("r", "required-opt");
        opt.setRequired(true);
        options.addOption(opt);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMissingOptions().contains("r"));
        } catch (ParseException e) {
            fail("Expected MissingOptionException but got " + e.getClass().getName());
        }
    }

    @Test
    public void testCheckRequiredOptions_requiredOptionGroup_satisfied() throws Exception {
        Option optA = new Option("a", "opt A");
        Option optB = new Option("b", "opt B");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-b"});
        assertTrue(cl.hasOption("b"));
    }

    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptions_requiredOptionGroup_missing_throwsException() throws Exception {
        Option optA = new Option("a", "opt A");
        Option optB = new Option("b", "opt B");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    @Test(expected = AlreadySelectedException.class)
    public void testOptionGroup_multipleSelected_throwsException() throws Exception {
        Option optA = new Option("a", "opt A");
        Option optB = new Option("b", "opt B");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-a", "-b"});
    }

    @Test
    public void testProcessArgs_withQuotes_stripsQuotes() throws Exception {
        Option opt = new Option("a", true, "option a");
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-a", "\"quoted value\""});
        assertEquals("quoted value", cl.getOptionValue("a"));
    }

    @Test
    public void testProcessArgs_nextIsAnotherOption_stopsProcessingArgs() throws Exception {
        options.addOption("a", true, "option a");
        options.addOption("b", false, "option b");

        CommandLine cl = parser.parse(options, new String[]{"-a", "valA", "-b"});
        assertTrue(cl.hasOption("a"));
        assertEquals("valA", cl.getOptionValue("a"));
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testProcessArgs_addValueThrowsRuntimeException_breaksLoop() throws Exception {
        Option opt = new Option("a", true, "option a") {
            private int count = 0;
            @Override
            public boolean addValue(String value) {
                if (count++ > 0) {
                    throw new RuntimeException("Limit exceeded");
                }
                return super.addValue(value);
            }
        };
        opt.setArgs(2);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-a", "first", "second"});
        assertTrue(cl.hasOption("a"));
        assertEquals("first", cl.getOptionValue("a"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("second", cl.getArgs()[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_missingArgument_throwsException() throws Exception {
        options.addOption("a", true, "option a");
        parser.parse(options, new String[]{"-a"});
    }

    @Test
    public void testProcessArgs_optionalArgumentProvided() throws Exception {
        Option opt = new Option("a", true, "option a");
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-a", "val"});
        assertTrue(cl.hasOption("a"));
        assertEquals("val", cl.getOptionValue("a"));
    }

    @Test
    public void testProcessArgs_optionalArgumentMissing() throws Exception {
        Option opt = new Option("a", true, "option a");
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertNull(cl.getOptionValue("a"));
    }

    @Test
    public void testProcessArgs_directCall_success() throws Exception {
        Option opt = new Option("a", true, "option a");
        options.addOption(opt);
        parser.setOptions(options);

        List<String> list = new ArrayList<String>(Arrays.asList("argValue"));
        ListIterator<String> iter = list.listIterator();

        parser.processArgs(opt, iter);

        assertEquals("argValue", opt.getValue());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testGettersAndSetters() {
        assertNull(parser.getOptions());
        assertNull(parser.getRequiredOptions());

        Option req = new Option("r", "req");
        req.setRequired(true);
        options.addOption(req);

        parser.setOptions(options);

        assertEquals(options, parser.getOptions());
        assertNotNull(parser.getRequiredOptions());
        assertEquals(1, parser.getRequiredOptions().size());
        assertEquals("r", parser.getRequiredOptions().get(0));
    }

    @Test
    public void testProcessOption_directCall_success() throws Exception {
        options.addOption("a", true, "option a");
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List<String> list = new ArrayList<String>(Arrays.asList("foo"));
        ListIterator<String> iter = list.listIterator();

        parser.processOption("-a", iter);

        assertTrue(parser.cmd.hasOption("a"));
        assertEquals("foo", parser.cmd.getOptionValue("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOption_directCall_unrecognized_throwsException() throws Exception {
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List<String> list = new ArrayList<String>();
        ListIterator<String> iter = list.listIterator();

        parser.processOption("-nonExistent", iter);
    }
}
