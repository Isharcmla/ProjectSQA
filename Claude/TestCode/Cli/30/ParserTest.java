package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest
{
    private SimpleParser parser;

    @Before
    public void setUp()
    {
        parser = new SimpleParser();
    }

    /**
     * Concrete implementation of the abstract Parser class.
     * flatten() simply returns the arguments unchanged, treating each
     * element of the input array as an already-tokenized value.
     */
    private static class SimpleParser extends Parser
    {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption)
                throws ParseException
        {
            return arguments;
        }
    }

    // ---------- parse(Options, String[]) ----------

    @Test
    public void testParse_TwoArgOverload_SimpleOption_ReturnsCommandLineWithOption() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "desc");

        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_NullArguments_TreatedAsEmptyArray() throws ParseException
    {
        CommandLine cmd = parser.parse(new Options(), null);

        assertNotNull(cmd);
        assertTrue(cmd.getArgList().isEmpty());
    }

    @Test
    public void testParse_EmptyArgumentsArray_ReturnsEmptyCommandLine() throws ParseException
    {
        CommandLine cmd = parser.parse(new Options(), new String[0]);

        assertEquals(0, cmd.getArgs().length);
    }

    // ---------- parse(Options, String[], Properties) ----------

    @Test
    public void testParse_ThreeArgOverloadWithProperties_SetsOptionFromProperties() throws ParseException
    {
        Options options = new Options();
        options.addOption("b", false, "desc");

        Properties props = new Properties();
        props.setProperty("b", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testProcessProperties_ValueNotYesTrueOrOne_SkipsOption() throws ParseException
    {
        Options options = new Options();
        options.addOption("c", false, "desc");

        Properties props = new Properties();
        props.setProperty("c", "no");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertFalse(cmd.hasOption("c"));
    }

    @Test
    public void testParse_PropertiesWithAlreadySetOption_SkipsProperty() throws ParseException
    {
        Options options = new Options();
        options.addOption("b", false, "desc");

        Properties props = new Properties();
        props.setProperty("b", "true");

        CommandLine cmd = parser.parse(options, new String[] { "-b" }, props);

        assertTrue(cmd.hasOption("b"));
    }

    // ---------- parse(Options, String[], boolean) ----------

    @Test
    public void testParse_ThreeArgOverloadWithStopAtNonOption_UnknownArgStopsParsing() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "desc");

        String[] args = { "-a", "unknown", "-b" };
        CommandLine cmd = parser.parse(options, args, true);

        assertTrue(cmd.hasOption("a"));
        List extraArgs = cmd.getArgList();
        assertEquals(2, extraArgs.size());
        assertEquals("unknown", extraArgs.get(0));
        assertEquals("-b", extraArgs.get(1));
    }

    @Test
    public void testParse_SingleDash_StopAtNonOptionFalse_AddsDashAsArg() throws ParseException
    {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[] { "-" }, false);

        assertEquals(1, cmd.getArgList().size());
        assertEquals("-", cmd.getArgList().get(0));
    }

    @Test
    public void testParse_SingleDash_StopAtNonOptionTrue_EatsRest() throws ParseException
    {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[] { "-", "foo" }, true);

        assertEquals(1, cmd.getArgList().size());
        assertEquals("foo", cmd.getArgList().get(0));
    }

    // ---------- parse(Options, String[], Properties, boolean) ----------

    @Test
    public void testParse_FourArgOverload_NormalCase_ReturnsCommandLine() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "desc");

        CommandLine cmd = parser.parse(options, new String[] { "-a" }, null, false);

        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_FourArgOverload_MissingRequiredOption_ThrowsMissingOptionException() throws ParseException
    {
        Options options = new Options();
        Option req = new Option("r", "desc");
        req.setRequired(true);
        options.addOption(req);

        parser.parse(options, new String[0], null, false);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOption_UnrecognizedOption_ThrowsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();

        parser.parse(options, new String[] { "-x" });
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_ViaParse_MissingArgument_ThrowsMissingArgumentException() throws ParseException
    {
        Options options = new Options();
        options.addOption("b", true, "desc");

        parser.parse(options, new String[] { "-b" });
    }

    @Test
    public void testProcessArgs_ViaParse_OptionalArg_NoExceptionAndNullValue() throws ParseException
    {
        Options options = new Options();
        Option opt = new Option("o", true, "desc");
        opt.setOptionalArg(true);
        options.addOption(opt);

        CommandLine cmd = parser.parse(options, new String[] { "-o" });

        assertTrue(cmd.hasOption("o"));
        assertNull(cmd.getOptionValue("o"));
    }

    @Test
    public void testParse_DoubleDash_StopsOptionProcessing() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "desc");

        CommandLine cmd = parser.parse(options, new String[] { "--", "-a" });

        List argList = cmd.getArgList();
        assertEquals(1, argList.size());
        assertEquals("-a", argList.get(0));
        assertFalse(cmd.hasOption("a"));
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParse_OptionGroup_AlreadySelected_ThrowsAlreadySelectedException() throws ParseException
    {
        Options options = new Options();
        Option x = new Option("x", "desc");
        Option y = new Option("y", "desc");

        OptionGroup group = new OptionGroup();
        group.addOption(x);
        group.addOption(y);
        options.addOptionGroup(group);

        parser.parse(options, new String[] { "-x", "-y" });
    }

    @Test
    public void testParse_OptionGroup_SingleSelection_Success() throws ParseException
    {
        Options options = new Options();
        Option x = new Option("x", "desc");
        Option y = new Option("y", "desc");

        OptionGroup group = new OptionGroup();
        group.addOption(x);
        group.addOption(y);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[] { "-x" });

        assertTrue(cmd.hasOption("x"));
        assertFalse(cmd.hasOption("y"));
    }

    // ---------- direct calls to public/protected members (same package) ----------

    @Test
    public void testProcessArgs_DirectCall_ConsumesValue() throws ParseException
    {
        parser.setOptions(new Options());

        Option opt = new Option("z", true, "desc");
        List tokens = Arrays.asList(new String[] { "value1" });
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);

        assertEquals("value1", opt.getValue());
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_DirectCall_NextTokenIsOption_ThrowsMissingArgumentException() throws ParseException
    {
        Options options = new Options();
        options.addOption("y", false, "desc");
        parser.setOptions(options);

        Option opt = new Option("z", true, "desc");
        List tokens = Arrays.asList(new String[] { "-y" });
        ListIterator iter = tokens.listIterator();

        parser.processArgs(opt, iter);
    }

    @Test
    public void testGetOptions_AfterParse_ReturnsSameOptionsInstance() throws ParseException
    {
        Options options = new Options();
        parser.parse(options, new String[0]);

        assertSame(options, parser.getOptions());
    }

    @Test
    public void testGetRequiredOptions_AfterSetOptions_ReturnsRequiredOptionsList()
    {
        Options options = new Options();
        Option req = new Option("r", "desc");
        req.setRequired(true);
        options.addOption(req);

        parser.setOptions(options);

        List requiredOptions = parser.getRequiredOptions();
        assertEquals(1, requiredOptions.size());
    }

    @Test
    public void testCheckRequiredOptions_NoRequiredOptions_NoExceptionThrown() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "desc");

        // should not throw since option "a" is not required
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
    }
}
