package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ParserTest {

    /**
     * Simple concrete implementation of the abstract Parser class.
     * flatten() simply returns the arguments unchanged, which is enough
     * to exercise the logic contained in the abstract Parser class itself.
     */
    private static class SimpleParser extends Parser {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            if (arguments == null) {
                return new String[0];
            }
            return arguments;
        }
    }

    private SimpleParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new SimpleParser();
        options = new Options();
    }

    // ---------------------------------------------------------------
    // parse(Options, String[])
    // ---------------------------------------------------------------

    @Test
    public void testParse_SimpleOption_NormalInput() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_OptionWithArgument_NormalInput() throws Exception {
        Option b = new Option("b", true, "bbb");
        options.addOption(b);

        CommandLine cmd = parser.parse(options, new String[] { "-b", "value" });

        assertTrue(cmd.hasOption("b"));
        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test
    public void testParse_NullArguments_EdgeCase_NoException() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, null);

        assertNotNull(cmd);
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParse_EmptyArguments_EdgeCase() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, new String[0]);

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_UnrecognizedOption_ThrowsException() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        parser.parse(options, new String[] { "-x" });
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_MissingRequiredOption_ThrowsException() throws Exception {
        Option r = new Option("r", "required option");
        r.setRequired(true);
        options.addOption(r);

        parser.parse(options, new String[] { });
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_MissingArgument_ThrowsException() throws Exception {
        Option c = new Option("c", true, "ccc");
        options.addOption(c);

        // no value supplied after -c and next token IS an option -> triggers missing arg
        parser.parse(options, new String[] { "-c" });
    }

    // ---------------------------------------------------------------
    // parse(Options, String[], Properties)
    // ---------------------------------------------------------------

    @Test
    public void testParse_WithProperties_HasArg_NormalInput() throws Exception {
        Option d = new Option("d", true, "ddd");
        options.addOption(d);

        Properties props = new Properties();
        props.setProperty("d", "propValue");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("d"));
        assertEquals("propValue", cmd.getOptionValue("d"));
    }

    @Test
    public void testParse_WithProperties_NoArg_ValueYes_AddsOption() throws Exception {
        Option e = new Option("e", "eee");
        options.addOption(e);

        Properties props = new Properties();
        props.setProperty("e", "yes");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("e"));
    }

    @Test
    public void testParse_WithProperties_NoArg_ValueTrue_AddsOption() throws Exception {
        Option f = new Option("f", "fff");
        options.addOption(f);

        Properties props = new Properties();
        props.setProperty("f", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("f"));
    }

    @Test
    public void testParse_WithProperties_NoArg_ValueOne_AddsOption() throws Exception {
        Option g = new Option("g", "ggg");
        options.addOption(g);

        Properties props = new Properties();
        props.setProperty("g", "1");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("g"));
    }

    @Test
    public void testParse_WithProperties_NoArg_ValueOther_BreaksAndSkipsOption() throws Exception {
        Option h = new Option("h", "hhh");
        options.addOption(h);

        Properties props = new Properties();
        props.setProperty("h", "no");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertFalse(cmd.hasOption("h"));
    }

    @Test
    public void testParse_WithProperties_OptionAlreadySet_NotOverridden() throws Exception {
        Option i = new Option("i", true, "iii");
        options.addOption(i);

        Properties props = new Properties();
        props.setProperty("i", "propValue");

        CommandLine cmd = parser.parse(options, new String[] { "-i", "cmdValue" }, props);

        assertTrue(cmd.hasOption("i"));
        assertEquals("cmdValue", cmd.getOptionValue("i"));
    }

    @Test
    public void testParse_WithNullProperties_EdgeCase() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, new String[] { "-a" }, (Properties) null);

        assertTrue(cmd.hasOption("a"));
    }

    // ---------------------------------------------------------------
    // parse(Options, String[], boolean)
    // ---------------------------------------------------------------

    @Test
    public void testParse_StopAtNonOption_NonOptionArgument() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, new String[] { "foo", "-a" }, true);

        String[] args = cmd.getArgs();
        assertEquals(2, args.length);
        assertEquals("foo", args[0]);
        assertEquals("-a", args[1]);
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParse_NoStopAtNonOption_NonOptionArgument() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, new String[] { "foo", "-a" }, false);

        assertTrue(cmd.hasOption("a"));
        String[] args = cmd.getArgs();
        assertEquals(1, args.length);
        assertEquals("foo", args[0]);
    }

    @Test
    public void testParse_SingleDash_NoStopAtNonOption_AddedAsArg() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] { "-" }, false);

        String[] args = cmd.getArgs();
        assertEquals(1, args.length);
        assertEquals("-", args[0]);
    }

    @Test
    public void testParse_SingleDash_StopAtNonOption_EatsRest() throws Exception {
        CommandLine cmd = parser.parse(options, new String[] { "-", "extra" }, true);

        String[] args = cmd.getArgs();
        assertEquals(1, args.length);
        assertEquals("extra", args[0]);
    }

    @Test
    public void testParse_DoubleDash_EatsRestAndAddsArgsWithoutDuplicateDashes() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, new String[] { "--", "-a", "--" }, false);

        String[] args = cmd.getArgs();
        // both "--" occurrences should not be added, only "-a"
        assertEquals(1, args.length);
        assertEquals("-a", args[0]);
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParse_UnrecognizedOption_StopAtNonOption_AddsArgAndEatsRest() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        CommandLine cmd = parser.parse(options, new String[] { "-z", "-a" }, true);

        String[] args = cmd.getArgs();
        assertEquals(2, args.length);
        assertEquals("-z", args[0]);
        assertEquals("-a", args[1]);
        assertFalse(cmd.hasOption("a"));
    }

    // ---------------------------------------------------------------
    // parse(Options, String[], Properties, boolean)
    // ---------------------------------------------------------------

    @Test
    public void testParse_FullOverload_NormalInput() throws Exception {
        Option a = new Option("a", "aaa");
        options.addOption(a);

        Properties props = new Properties();

        CommandLine cmd = parser.parse(options, new String[] { "-a" }, props, false);

        assertTrue(cmd.hasOption("a"));
    }

    // ---------------------------------------------------------------
    // OptionGroup handling via processOption (through parse)
    // ---------------------------------------------------------------

    @Test
    public void testParse_OptionGroup_RequiredSatisfied_NormalInput() throws Exception {
        Option x = new Option("x", "xxx");
        Option y = new Option("y", "yyy");

        OptionGroup group = new OptionGroup();
        group.addOption(x);
        group.addOption(y);
        group.setRequired(true);

        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[] { "-x" });

        assertTrue(cmd.hasOption("x"));
        assertEquals("x", group.getSelected());
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_OptionGroup_RequiredNotSatisfied_ThrowsException() throws Exception {
        Option x = new Option("x", "xxx");
        Option y = new Option("y", "yyy");

        OptionGroup group = new OptionGroup();
        group.addOption(x);
        group.addOption(y);
        group.setRequired(true);

        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }

    // ---------------------------------------------------------------
    // processArgs (public method) direct testing
    // ---------------------------------------------------------------

    @Test
    public void testProcessArgs_NormalInput_AddsValue() throws Exception {
        Option opt = new Option("v", true, "value option");
        options.addOption(opt);
        parser.parse(options, new String[0]); // initialise options/cmd via setOptions

        List tokens = Arrays.asList(new String[] { "someValue" });
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);

        assertNotNull(opt.getValues());
        assertEquals("someValue", opt.getValues()[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_NoValueAndNotOptional_ThrowsException() throws Exception {
        Option opt = new Option("v", true, "value option");
        options.addOption(opt);
        parser.parse(options, new String[0]); // initialise options/cmd via setOptions

        List tokens = Arrays.asList(new String[0]);
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);
    }

    @Test
    public void testProcessArgs_OptionalArg_NoValue_NoException() throws Exception {
        Option opt = new Option("v", true, "value option");
        opt.setOptionalArg(true);
        options.addOption(opt);
        parser.parse(options, new String[0]); // initialise options/cmd via setOptions

        List tokens = Arrays.asList(new String[0]);
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);

        assertNull(opt.getValues());
    }
}
