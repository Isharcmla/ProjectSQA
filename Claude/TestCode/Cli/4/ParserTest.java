package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest {

    /**
     * Concrete implementation of the abstract Parser class for testing.
     * flatten() simply returns the arguments unchanged (pass-through),
     * so we can focus tests on the parse() logic implemented in Parser itself.
     */
    private static class ConcreteParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
    }

    private ConcreteParser parser;

    @Before
    public void setUp() {
        parser = new ConcreteParser();
    }

    // ---------- Normal / typical cases ----------

    @Test
    public void testParse_simpleBooleanOption_optionPresent() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_optionWithArgument_valueSet() throws Exception {
        Options options = new Options();
        options.addOption("b", true, "b option");

        CommandLine cmd = parser.parse(options, new String[] { "-b", "value" });

        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test
    public void testParse_extraArguments_addedAsArgs() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a", "extra1", "extra2" });

        assertArrayEquals(new String[] { "extra1", "extra2" }, cmd.getArgs());
    }

    @Test
    public void testParseThreeArgOverload_withStopAtNonOption_normal() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a", "nonoption", "-a" }, true);

        // nonoption stops processing, remaining tokens added as args
        assertArrayEquals(new String[] { "nonoption", "-a" }, cmd.getArgs());
    }

    @Test
    public void testParseTwoArgOverload_defaultBehavior() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParseWithProperties_overload_setsOption() throws Exception {
        Options options = new Options();
        options.addOption("b", true, "b option");

        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertEquals("propValue", cmd.getOptionValue("b"));
    }

    @Test
    public void testParseFullOverload_withPropertiesAndStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();

        CommandLine cmd = parser.parse(options, new String[] { "-a" }, props, false);

        assertTrue(cmd.hasOption("a"));
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_nullArguments_treatedAsEmpty() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, null);

        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParse_doubleDash_stopsProcessingAndAddsRemainingArgsOnce() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");
        options.addOption("b", false, "b option");

        CommandLine cmd = parser.parse(options, new String[] { "--", "-a", "-b" });

        assertArrayEquals(new String[] { "-a", "-b" }, cmd.getArgs());
    }

    @Test
    public void testParse_singleDash_withoutStopAtNonOption_addedAsArg() throws Exception {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[] { "-" });

        assertArrayEquals(new String[] { "-" }, cmd.getArgs());
    }

    @Test
    public void testParse_singleDash_withStopAtNonOption_eatsRemaining() throws Exception {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[] { "-", "-a" }, true);

        assertArrayEquals(new String[] { "-a" }, cmd.getArgs());
    }

    @Test
    public void testParse_unrecognizedOptionButStopAtNonOption_addsToArgsAndEatsRest() throws Exception {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[] { "-x", "-y" }, true);

        assertArrayEquals(new String[] { "-x", "-y" }, cmd.getArgs());
    }

    @Test
    public void testParse_optionAlreadyPresentInCmd_propertyIgnored() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[] { "-a" }, props);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_propertyBooleanOptionTrueValue_optionAdded() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_propertyBooleanOptionFalseValue_optionNotAdded() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();
        props.setProperty("a", "false");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParse_optionGroup_selectionWorks() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option g1 = new Option("g1", "group option 1");
        Option g2 = new Option("g2", "group option 2");
        group.addOption(g1);
        group.addOption(g2);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[] { "-g1" });

        assertTrue(cmd.hasOption("g1"));
    }

    @Test
    public void testParse_optionalArgOption_noValueProvided_noException() throws Exception {
        Options options = new Options();
        Option opt = new Option("d", "d option");
        opt.setArgs(1);
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] { "-d" });

        assertTrue(cmd.hasOption("d"));
    }

    @Test
    public void testProcessArgs_directCall_addsValue() throws Exception {
        Options options = new Options();
        Option opt = new Option("e", true, "e option");
        options.addOption(opt);

        // initialise internal state of the parser by performing a parse first
        parser.parse(options, new String[0]);

        List tokenList = Arrays.asList(new String[] { "value1" });
        ListIterator iter = tokenList.listIterator();

        parser.processArgs(opt, iter);

        assertNotNull(opt.getValues());
        assertEquals("value1", opt.getValues()[0]);
    }

    // ---------- Exception cases ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOption_throwsException() throws Exception {
        Options options = new Options();

        parser.parse(options, new String[] { "-x" });
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsException() throws Exception {
        Options options = new Options();
        Option req = new Option("r", "required option");
        req.setRequired(true);
        options.addOption(req);

        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOptionGroup_throwsException() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option g1 = new Option("g1", "group option 1");
        Option g2 = new Option("g2", "group option 2");
        group.addOption(g1);
        group.addOption(g2);
        group.setRequired(true);
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingArgumentForOption_throwsException() throws Exception {
        Options options = new Options();
        options.addOption("c", true, "c option");

        parser.parse(options, new String[] { "-c" });
    }
}
