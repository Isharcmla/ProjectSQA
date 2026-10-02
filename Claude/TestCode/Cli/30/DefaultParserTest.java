import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import java.util.List;
import java.util.Properties;

public class DefaultParserTest
{
    private DefaultParser parser;

    @Before
    public void setUp()
    {
        parser = new DefaultParser();
    }

    @Test
    public void testConstructor_defaultParser_notNull()
    {
        assertNotNull(parser);
    }

    // ---------- Two-arg parse(Options, String[]) ----------

    @Test
    public void testParse_twoArgOverload_shortOption_success() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[]{"-a"});

        assertTrue(cmd.hasOption("a"));
    }

    // ---------- Three-arg parse(Options, String[], Properties) ----------

    @Test
    public void testParse_threeArgPropertiesOverload_addsOptionFromProperties() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[]{}, props);

        assertTrue(cmd.hasOption("a"));
    }

    // ---------- Three-arg parse(Options, String[], boolean) ----------

    @Test
    public void testParse_threeArgStopAtNonOptionOverload_addsRemainingArgs() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[]{"-a", "-x"}, true);

        assertTrue(cmd.hasOption("a"));
        List args = cmd.getArgList();
        assertTrue(args.contains("-x"));
    }

    // ---------- Four-arg parse(Options, String[], Properties, boolean) ----------

    @Test
    public void testParse_fourArgOverload_longOptionWithEqual_success() throws ParseException
    {
        Options options = new Options();
        options.addOption("f", "file", true, "file option");

        CommandLine cmd = parser.parse(options, new String[]{"--file=test.txt"}, null, false);

        assertEquals("test.txt", cmd.getOptionValue("file"));
    }

    // ---------- Short option with argument ----------

    @Test
    public void testParse_shortOptionWithArg_success() throws ParseException
    {
        Options options = new Options();
        options.addOption("f", true, "file option");

        CommandLine cmd = parser.parse(options, new String[]{"-f", "test.txt"});

        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    // ---------- Missing required argument ----------

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingRequiredArgument_throwsMissingArgumentException() throws ParseException
    {
        Options options = new Options();
        options.addOption("f", true, "file option");

        parser.parse(options, new String[]{"-f"});
    }

    // ---------- Unrecognized option ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOption_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();

        parser.parse(options, new String[]{"-x"});
    }

    // ---------- Missing required option ----------

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsMissingOptionException() throws ParseException
    {
        Option required = new Option("r", "required option");
        required.setRequired(true);

        Options options = new Options();
        options.addOption(required);

        parser.parse(options, new String[]{});
    }

    // ---------- Already selected option group ----------

    @Test(expected = AlreadySelectedException.class)
    public void testParse_alreadySelectedGroupOption_throwsAlreadySelectedException() throws ParseException
    {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", "x option"));
        group.addOption(new Option("y", "y option"));

        Options options = new Options();
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-x", "-y"});
    }

    // ---------- Double hyphen stops parsing ----------

    @Test
    public void testParse_doubleHyphen_stopsParsingAndAddsRemainingArgs() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[]{"--", "-a"});

        assertFalse(cmd.hasOption("a"));
        assertTrue(cmd.getArgList().contains("-a"));
    }

    // ---------- Negative number as option argument ----------

    @Test
    public void testParse_negativeNumberAsOptionArgument_addedAsValue() throws ParseException
    {
        Options options = new Options();
        options.addOption("f", true, "file option");

        CommandLine cmd = parser.parse(options, new String[]{"-f", "-1"});

        assertEquals("-1", cmd.getOptionValue("f"));
    }

    // ---------- Negative number without option context ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_negativeNumberWithoutOptionContext_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();

        parser.parse(options, new String[]{"-1"});
    }

    // ---------- Ambiguous long option ----------

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOption_throwsAmbiguousOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", "foobar", false, "foobar option");
        options.addOption("b", "foodefault", false, "foodefault option");

        parser.parse(options, new String[]{"--foo"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithEqual_throwsAmbiguousOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", "foobar", true, "foobar option");
        options.addOption("b", "foodefault", true, "foodefault option");

        parser.parse(options, new String[]{"--foo=val"});
    }

    // ---------- Long option with equal, unknown option ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_longOptionEqualUnknown_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();

        parser.parse(options, new String[]{"--foo=val"});
    }

    // ---------- Long option with equal, option does not accept arg ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_longOptionEqualNoArgOption_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");

        parser.parse(options, new String[]{"--alpha=val"});
    }

    // ---------- Java property style option (-Dkey=value) ----------

    @Test
    public void testParse_javaPropertyWithEqual_addsKeyValue() throws ParseException
    {
        Option d = new Option("D", "define");
        d.setArgs(2);

        Options options = new Options();
        options.addOption(d);

        CommandLine cmd = parser.parse(options, new String[]{"-Dkey=value"});

        String[] values = cmd.getOptionValues("D");
        assertNotNull(values);
        assertEquals("key", values[0]);
        assertEquals("value", values[1]);
    }

    @Test
    public void testParse_javaPropertyWithoutValue_addsFlagAsValue() throws ParseException
    {
        Option d = new Option("D", "define");
        d.setArgs(2);

        Options options = new Options();
        options.addOption(d);

        CommandLine cmd = parser.parse(options, new String[]{"-Dflag"});

        String[] values = cmd.getOptionValues("D");
        assertNotNull(values);
        assertEquals("flag", values[0]);
    }

    // ---------- Concatenated short options ----------

    @Test
    public void testParse_concatenatedShortOptions_allSet() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");
        options.addOption("b", false, "b option");
        options.addOption("c", false, "c option");

        CommandLine cmd = parser.parse(options, new String[]{"-abc"});

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_concatenatedOptionsWithUnknownChar_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        parser.parse(options, new String[]{"-ax"});
    }

    @Test
    public void testParse_concatenatedOptionsUnknownCharWithStopAtNonOption_addsRemainingAsArg() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[]{"-ax"}, true);

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.getArgList().contains("x"));
    }

    // ---------- Short option with equal sign ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_shortOptionEqualsNoArgOption_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        parser.parse(options, new String[]{"-a=test"});
    }

    @Test
    public void testParse_shortOptionEqualsWithArg_success() throws ParseException
    {
        Options options = new Options();
        options.addOption("f", true, "file option");

        CommandLine cmd = parser.parse(options, new String[]{"-f=test.txt"});

        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    // ---------- Properties handling ----------

    @Test
    public void testParse_propertiesValueNotTrueForNoArgOption_optionNotAdded() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();
        props.setProperty("a", "false");

        CommandLine cmd = parser.parse(options, new String[]{}, props);

        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParse_propertiesOptionAlreadySetFromCommandLine_notOverridden() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_propertiesWithArgOption_addsValue() throws ParseException
    {
        Options options = new Options();
        options.addOption("f", true, "file option");

        Properties props = new Properties();
        props.setProperty("f", "test.txt");

        CommandLine cmd = parser.parse(options, new String[]{}, props);

        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    // ---------- Null / empty argument edge cases ----------

    @Test
    public void testParse_nullArguments_returnsEmptyCommandLine() throws ParseException
    {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, null);

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParse_emptyArguments_returnsEmptyCommandLine() throws ParseException
    {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[]{});

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }
}
