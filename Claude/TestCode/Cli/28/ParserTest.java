import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest
{
    /**
     * Concrete implementation of the abstract Parser class for testing purposes.
     * flatten simply returns the arguments unchanged (similar to BasicParser behaviour).
     */
    static class TestParser extends Parser
    {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) throws ParseException
        {
            return arguments;
        }
    }

    private TestParser parser;

    @Before
    public void setUp()
    {
        parser = new TestParser();
    }

    // ---------- parse(Options, String[]) ----------

    @Test
    public void testParse_basicOptionWithArgument_returnsCommandLineWithValue() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("a", true, "desc a"));

        String[] args = {"-a", "value1"};
        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        assertEquals("value1", cmd.getOptionValue("a"));
    }

    @Test
    public void testParse_nullArguments_returnsEmptyCommandLine() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "desc a"));

        CommandLine cmd = parser.parse(options, null);

        assertFalse(cmd.hasOption("a"));
        assertEquals(0, cmd.getArgs().length);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOption_throwsUnrecognizedOptionException() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "desc a"));

        String[] args = {"-x"};
        parser.parse(options, args);
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsMissingOptionException() throws Exception
    {
        Options options = new Options();
        Option required = new Option("r", false, "required option");
        required.setRequired(true);
        options.addOption(required);

        String[] args = {};
        parser.parse(options, args);
    }

    @Test
    public void testParse_doubleDash_eatsRestOfArguments() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "desc a"));

        String[] args = {"-a", "--", "-b", "extra"};
        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        List argList = cmd.getArgList();
        assertTrue(argList.contains("-b"));
        assertTrue(argList.contains("extra"));
    }

    @Test
    public void testParse_singleDashWithoutStopAtNonOption_addsAsArg() throws Exception
    {
        Options options = new Options();

        String[] args = {"-"};
        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.getArgList().contains("-"));
    }

    // ---------- parse(Options, String[], Properties) ----------

    @Test
    public void testParse_withPropertiesBooleanOptionYes_addsOption() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("b", false, "boolean option"));

        Properties props = new Properties();
        props.setProperty("b", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testParse_withPropertiesArgOption_addsValue() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("c", true, "arg option"));

        Properties props = new Properties();
        props.setProperty("c", "value1");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("c"));
        assertEquals("value1", cmd.getOptionValue("c"));
    }

    // ---------- parse(Options, String[], boolean) ----------

    @Test
    public void testParse_stopAtNonOptionTrue_unrecognizedOptionAddedAsArgAndEatsRest() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "desc a"));

        String[] args = {"-a", "-x", "extra"};
        CommandLine cmd = parser.parse(options, args, true);

        assertTrue(cmd.hasOption("a"));
        List argList = cmd.getArgList();
        assertTrue(argList.contains("-x"));
        assertTrue(argList.contains("extra"));
    }

    @Test
    public void testParse_stopAtNonOptionTrueWithSingleDash_eatsRest() throws Exception
    {
        Options options = new Options();

        String[] args = {"-", "extra"};
        CommandLine cmd = parser.parse(options, args, true);

        List argList = cmd.getArgList();
        assertTrue(argList.contains("extra"));
    }

    @Test
    public void testParse_stopAtNonOptionTrueWithPlainArgument_eatsRest() throws Exception
    {
        Options options = new Options();

        String[] args = {"nonoption", "arg2"};
        CommandLine cmd = parser.parse(options, args, true);

        List argList = cmd.getArgList();
        assertTrue(argList.contains("nonoption"));
        assertTrue(argList.contains("arg2"));
    }

    // ---------- parse(Options, String[], Properties, boolean) ----------

    @Test
    public void testParse_fullSignatureWithOptionGroup_selectsOption() throws Exception
    {
        Options options = new Options();
        Option optA = new Option("a", false, "a desc");
        Option optB = new Option("b", false, "b desc");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(true);
        options.addOptionGroup(group);

        String[] args = {"-a"};
        CommandLine cmd = parser.parse(options, args, (Properties) null, false);

        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    // ---------- processArgs ----------

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_missingArgument_throwsMissingArgumentException() throws Exception
    {
        Option opt = new Option("d", true, "desc d");

        List tokenList = new ArrayList();
        ListIterator iter = tokenList.listIterator();

        parser.processArgs(opt, iter);
    }

    @Test
    public void testProcessArgs_optionalArgWithNoValue_doesNotThrow() throws Exception
    {
        Option opt = new Option("e", true, "desc e");
        opt.setOptionalArg(true);

        List tokenList = new ArrayList();
        ListIterator iter = tokenList.listIterator();

        parser.processArgs(opt, iter);
        // no exception expected
        assertNull(opt.getValues());
    }

    @Test
    public void testProcessArgs_withValidValue_addsValue() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("f", true, "desc f"));
        parser.setOptions(options);

        Option opt = new Option("f", true, "desc f");

        List tokenList = new ArrayList();
        tokenList.add("someValue");
        ListIterator iter = tokenList.listIterator();

        parser.processArgs(opt, iter);

        assertEquals("someValue", opt.getValue());
    }

    // ---------- processOption ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOption_unrecognizedOption_throwsUnrecognizedOptionException() throws Exception
    {
        Options options = new Options();
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List tokenList = new ArrayList();
        ListIterator iter = tokenList.listIterator();

        parser.processOption("-z", iter);
    }

    @Test
    public void testProcessOption_requiredOptionInGroup_removesFromRequiredOptions() throws Exception
    {
        Options options = new Options();
        Option optA = new Option("g", false, "g desc");
        Option optB = new Option("h", false, "h desc");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(true);
        options.addOptionGroup(group);

        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List tokenList = new ArrayList();
        ListIterator iter = tokenList.listIterator();

        parser.processOption("-g", iter);

        assertTrue(parser.cmd.hasOption("g"));
        assertTrue(parser.getRequiredOptions().isEmpty());
    }

    @Test
    public void testProcessOption_requiredOption_removesFromRequiredOptionsList() throws Exception
    {
        Options options = new Options();
        Option required = new Option("i", false, "required option");
        required.setRequired(true);
        options.addOption(required);

        parser.setOptions(options);
        parser.cmd = new CommandLine();

        List tokenList = new ArrayList();
        ListIterator iter = tokenList.listIterator();

        parser.processOption("-i", iter);

        assertTrue(parser.cmd.hasOption("i"));
        assertTrue(parser.getRequiredOptions().isEmpty());
    }

    // ---------- checkRequiredOptions ----------

    @Test
    public void testCheckRequiredOptions_noRequiredOptions_doesNotThrow() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("j", false, "desc j"));
        parser.setOptions(options);

        parser.checkRequiredOptions();
        // no exception expected
    }

    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptions_missingRequiredOption_throwsMissingOptionException() throws Exception
    {
        Options options = new Options();
        Option required = new Option("k", false, "required option");
        required.setRequired(true);
        options.addOption(required);
        parser.setOptions(options);

        parser.checkRequiredOptions();
    }

    // ---------- processProperties ----------

    @Test
    public void testProcessProperties_nullProperties_doesNothing() throws Exception
    {
        Options options = new Options();
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        parser.processProperties(null);
        // no exception, cmd unchanged
        assertEquals(0, parser.cmd.getOptions().length);
    }

    @Test
    public void testProcessProperties_booleanOptionValidValue_addsOption() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("l", false, "desc l"));
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("l", "yes");

        parser.processProperties(props);

        assertTrue(parser.cmd.hasOption("l"));
    }

    @Test
    public void testProcessProperties_booleanOptionInvalidValue_doesNotAddOption() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("m", false, "desc m"));
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("m", "no");

        parser.processProperties(props);

        assertFalse(parser.cmd.hasOption("m"));
    }

    @Test
    public void testProcessProperties_argOptionWithExistingValues_doesNotOverwrite() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("n", true, "desc n"));
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        // Pre-populate the option with a value using parse
        String[] args = {"-n", "initialValue"};
        CommandLine preCmd = parser.parse(options, args);
        parser.cmd = preCmd;

        Properties props = new Properties();
        props.setProperty("n", "propertyValue");

        // since cmd already has option "n", processProperties should skip it
        parser.processProperties(props);

        assertEquals("initialValue", parser.cmd.getOptionValue("n"));
    }

    @Test
    public void testProcessProperties_optionAlreadyOnCommandLine_isSkipped() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("o", false, "desc o"));
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        String[] args = {"-o"};
        CommandLine preCmd = parser.parse(options, args);
        parser.cmd = preCmd;

        Properties props = new Properties();
        props.setProperty("o", "true");

        parser.processProperties(props);

        assertTrue(parser.cmd.hasOption("o"));
    }

    // ---------- setOptions / getOptions / getRequiredOptions ----------

    @Test
    public void testSetOptionsAndGetOptions_returnsSameInstance()
    {
        Options options = new Options();
        options.addOption(new Option("p", false, "desc p"));

        parser.setOptions(options);

        assertSame(options, parser.getOptions());
    }

    @Test
    public void testGetRequiredOptions_afterSetOptions_containsRequiredOption()
    {
        Options options = new Options();
        Option required = new Option("q", false, "required option");
        required.setRequired(true);
        options.addOption(required);

        parser.setOptions(options);

        assertEquals(1, parser.getRequiredOptions().size());
    }

    @Test
    public void testGetRequiredOptions_noRequiredOptions_isEmpty()
    {
        Options options = new Options();
        options.addOption(new Option("s", false, "desc s"));

        parser.setOptions(options);

        assertTrue(parser.getRequiredOptions().isEmpty());
    }
}
