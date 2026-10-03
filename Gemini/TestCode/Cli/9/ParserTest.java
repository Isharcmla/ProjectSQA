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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ParserTest {

    private static class DummyParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments != null ? arguments : new String[0];
        }
    }

    private DummyParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DummyParser();
        options = new Options();
    }

    @Test
    public void testSetAndGetOptionsAndRequiredOptions() {
        Option opt = new Option("a", "alpha", false, "desc");
        opt.setRequired(true);
        options.addOption(opt);

        parser.setOptions(options);

        assertSame(options, parser.getOptions());
        assertNotNull(parser.getRequiredOptions());
        assertEquals(1, parser.getRequiredOptions().size());
        assertEquals("a", parser.getRequiredOptions().get(0));
    }

    @Test
    public void testParseTwoArgsOverload_success() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1"});

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgList().size());
        assertEquals("arg1", cl.getArgList().get(0));
    }

    @Test
    public void testParseThreeArgsPropertiesOverload_success() throws Exception {
        options.addOption("a", false, "option a");
        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cl = parser.parse(options, new String[0], props);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testParseThreeArgsStopAtNonOptionOverload_success() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1", "-b"}, true);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgList().size());
        assertEquals("arg1", cl.getArgList().get(0));
        assertEquals("-b", cl.getArgList().get(1));
    }

    @Test
    public void testParseNullArguments_treatedAsEmptyArray() throws Exception {
        CommandLine cl = parser.parse(options, (String[]) null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParseClearsPreviousOptionValues() throws Exception {
        Option opt = new Option("a", true, "option a");
        options.addOption(opt);

        parser.parse(options, new String[]{"-a", "val1"});
        assertEquals("val1", opt.getValue());

        CommandLine cl2 = parser.parse(options, new String[0]);
        assertNull(opt.getValues());
        assertFalse(cl2.hasOption("a"));
    }

    @Test
    public void testParseDoubleDash_eatsTheRestAndSkipsSubsequentDoubleDash() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a", "--", "foo", "--", "bar"};

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("a"));
        List argList = cl.getArgList();
        assertEquals(2, argList.size());
        assertEquals("foo", argList.get(0));
        assertEquals("bar", argList.get(1));
    }

    @Test
    public void testParseSingleDash_withoutStopAtNonOption() throws Exception {
        CommandLine cl = parser.parse(options, new String[]{"-", "foo"}, false);

        List argList = cl.getArgList();
        assertEquals(2, argList.size());
        assertEquals("-", argList.get(0));
        assertEquals("foo", argList.get(1));
    }

    @Test
    public void testParseSingleDash_withStopAtNonOption() throws Exception {
        CommandLine cl = parser.parse(options, new String[]{"-", "foo", "bar"}, true);

        List argList = cl.getArgList();
        assertEquals(2, argList.size());
        assertEquals("foo", argList.get(0));
        assertEquals("bar", argList.get(1));
    }

    @Test
    public void testParseOptionPrefixed_withStopAtNonOptionAndUnknownOption() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[]{"-a", "-unknown", "rest"}, true);

        assertTrue(cl.hasOption("a"));
        List argList = cl.getArgList();
        assertEquals(2, argList.size());
        assertEquals("-unknown", argList.get(0));
        assertEquals("rest", argList.get(1));
    }

    @Test
    public void testParseUnrecognizedOptionWithoutStopAtNonOption_throwsException() {
        try {
            parser.parse(options, new String[]{"-unknown"});
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertTrue(e.getMessage().contains("-unknown"));
        } catch (ParseException e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testParseRequiredOption_successWhenProvided() throws Exception {
        Option opt = new Option("r", "req", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-r"});
        assertTrue(cl.hasOption("r"));
        assertEquals(0, parser.getRequiredOptions().size());
    }

    @Test
    public void testCheckRequiredOptions_singleMissing_throwsException() {
        Option opt = new Option("r", "req", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required option: "));
            assertTrue(e.getMessage().contains("r"));
        } catch (ParseException e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCheckRequiredOptions_multipleMissing_throwsException() {
        Option opt1 = new Option("r1", false, "req 1");
        opt1.setRequired(true);
        Option opt2 = new Option("r2", false, "req 2");
        opt2.setRequired(true);
        options.addOption(opt1);
        options.addOption(opt2);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required options: "));
        } catch (ParseException e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testParseOptionGroup_requiredGroupSatisfied() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option optA = new Option("a", false, "option A");
        Option optB = new Option("b", false, "option B");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertEquals("a", group.getSelected());
        assertEquals(0, parser.getRequiredOptions().size());
    }

    @Test
    public void testParseOptionGroup_nonRequiredGroupSelected() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option optA = new Option("a", false, "option A");
        group.addOption(optA);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testProcessArgs_withQuotesAndMultipleValues() throws Exception {
        Option opt = new Option("f", true, "file option");
        opt.setArgs(2);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-f", "\"val1\"", "'val2'"});
        assertTrue(cl.hasOption("f"));
        String[] values = cl.getOptionValues("f");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
    }

    @Test
    public void testProcessArgs_stopsAtNextOption() throws Exception {
        Option opt1 = new Option("a", true, "option a");
        opt1.setArgs(2);
        Option opt2 = new Option("b", false, "option b");
        options.addOption(opt1);
        options.addOption(opt2);

        CommandLine cl = parser.parse(options, new String[]{"-a", "val1", "-b"});
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("val1", cl.getOptionValue("a"));
    }

    @Test
    public void testProcessArgs_exceedingArgumentLimit_stopsAddingArgs() throws Exception {
        Option opt = new Option("a", true, "option a");
        opt.setArgs(1);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-a", "val1", "val2"});
        assertTrue(cl.hasOption("a"));
        assertEquals("val1", cl.getOptionValue("a"));
        assertEquals(1, cl.getArgList().size());
        assertEquals("val2", cl.getArgList().get(0));
    }

    @Test
    public void testProcessArgs_missingRequiredArgument_throwsException() {
        Option opt = new Option("a", true, "option a");
        options.addOption(opt);

        try {
            parser.parse(options, new String[]{"-a"});
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
            assertTrue(e.getMessage().contains("Missing argument for option:a"));
        } catch (ParseException e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testProcessArgs_optionalArgument_omitted_success() throws Exception {
        Option opt = new Option("a", true, "option a");
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertNull(cl.getOptionValue("a"));
    }

    @Test
    public void testProcessProperties_nullProperties_noOp() throws Exception {
        options.addOption("a", false, "option a");
        parser.parse(options, new String[0], null, false);
        assertNotNull(parser.cmd);
    }

    @Test
    public void testProcessProperties_flagValues() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");

        Properties props = new Properties();
        props.setProperty("a", "yes");
        props.setProperty("b", "1");
        props.setProperty("c", "TRUE");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertTrue(cl.hasOption("c"));
    }

    @Test
    public void testProcessProperties_invalidFlagValue_breaks() throws Exception {
        options.addOption("a", false, "option a");
        Properties props = new Properties();
        props.setProperty("a", "no");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertFalse(cl.hasOption("a"));
    }

    @Test
    public void testProcessProperties_argOption_addsValue() throws Exception {
        options.addOption("f", true, "file");
        Properties props = new Properties();
        props.setProperty("f", "test.txt");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertTrue(cl.hasOption("f"));
        assertEquals("test.txt", cl.getOptionValue("f"));
    }

    @Test
    public void testProcessProperties_argOptionCannotAddValue_handledGracefully() throws Exception {
        Option opt = new Option("f", false, "flag") {
            @Override
            public boolean hasArg() {
                return true;
            }

            @Override
            public String[] getValues() {
                return null;
            }

            @Override
            public void addValueForProcessing(String value) {
                throw new RuntimeException("Cannot add value");
            }
        };
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("f", "val");

        CommandLine cl = parser.parse(options, new String[0], props, false);
        assertTrue(cl.hasOption("f"));
    }

    @Test
    public void testProcessProperties_alreadyPresentOnCommandLine_skipped() throws Exception {
        options.addOption("f", true, "file");
        Properties props = new Properties();
        props.setProperty("f", "propValue");

        CommandLine cl = parser.parse(options, new String[]{"-f", "cliValue"}, props, false);
        assertTrue(cl.hasOption("f"));
        assertEquals("cliValue", cl.getOptionValue("f"));
    }

    @Test
    public void testProcessOption_invalidOption_throwsException() {
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        List tokens = Arrays.asList("-z");
        ListIterator iter = tokens.listIterator();
        iter.next();

        try {
            parser.processOption("-z", iter);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertTrue(e.getMessage().contains("Unrecognized option: -z"));
        } catch (ParseException e) {
            fail("Unexpected exception: " + e);
        }
    }
}
