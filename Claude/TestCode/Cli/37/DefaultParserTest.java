package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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

    // ---------- Normal / typical cases ----------

    @Test
    public void testParse_shortOption_returnsCommandLineWithOption() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_longOption_returnsCommandLineWithOption() throws ParseException
    {
        Options options = new Options();
        options.addOption("b", "bee", false, "bee option");

        CommandLine cmd = parser.parse(options, new String[] { "--bee" });

        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testParse_shortOptionWithArg_returnsValue() throws ParseException
    {
        Options options = new Options();
        options.addOption("c", "cee", true, "cee option with arg");

        CommandLine cmd = parser.parse(options, new String[] { "-c", "value" });

        assertEquals("value", cmd.getOptionValue("c"));
    }

    @Test
    public void testParse_longOptionWithEqualSign_returnsValue() throws ParseException
    {
        Options options = new Options();
        options.addOption("c", "cee", true, "cee option with arg");

        CommandLine cmd = parser.parse(options, new String[] { "--cee=value2" });

        assertEquals("value2", cmd.getOptionValue("cee"));
    }

    @Test
    public void testParse_shortOptionWithEqualSign_returnsValue() throws ParseException
    {
        Options options = new Options();
        options.addOption("c", "cee", true, "cee option with arg");

        CommandLine cmd = parser.parse(options, new String[] { "-c=value3" });

        assertEquals("value3", cmd.getOptionValue("c"));
    }

    @Test
    public void testParse_doubleDashStopsParsing_remainingTokensAsArgs() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "--", "-a", "extra" });

        List<String> args = cmd.getArgList();
        assertTrue(args.contains("-a"));
        assertTrue(args.contains("extra"));
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParse_negativeNumberAsArgument_returnsValue() throws ParseException
    {
        Options options = new Options();
        options.addOption("n", "num", true, "num option");

        CommandLine cmd = parser.parse(options, new String[] { "-n", "-1" });

        assertEquals("-1", cmd.getOptionValue("n"));
    }

    @Test
    public void testParse_concatenatedShortOptions_bothPresent() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");
        options.addOption("b", false, "b option");

        CommandLine cmd = parser.parse(options, new String[] { "-ab" });

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testParse_javaPropertyStyleOption_returnsKeyValue() throws ParseException
    {
        Options options = new Options();
        Option d = new Option("D", "use value for given property");
        d.setArgs(2);
        d.setValueSeparator('=');
        options.addOption(d);

        CommandLine cmd = parser.parse(options, new String[] { "-Dkey=value" });

        String[] values = cmd.getOptionValues("D");
        assertNotNull(values);
        assertEquals("key", values[0]);
        assertEquals("value", values[1]);
    }

    @Test
    public void testParse_twoArgOverload_returnsCommandLine() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertNotNull(cmd);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_propertiesOverload_optionSetFromProperties() throws ParseException
    {
        Options options = new Options();
        options.addOption("x", "xxx", false, "x option");

        Properties props = new Properties();
        props.setProperty("x", "true");

        CommandLine cmd = parser.parse(options, new String[] {}, props);

        assertTrue(cmd.hasOption("x"));
    }

    @Test
    public void testParse_propertiesWithFalseValue_optionNotSet() throws ParseException
    {
        Options options = new Options();
        options.addOption("x", "xxx", false, "x option");

        Properties props = new Properties();
        props.setProperty("x", "false");

        CommandLine cmd = parser.parse(options, new String[] {}, props);

        assertFalse(cmd.hasOption("x"));
    }

    @Test
    public void testParse_propertiesWithArgOption_valueApplied() throws ParseException
    {
        Options options = new Options();
        options.addOption("c", "cee", true, "cee option with arg");

        Properties props = new Properties();
        props.setProperty("c", "propvalue");

        CommandLine cmd = parser.parse(options, new String[] {}, props);

        assertEquals("propvalue", cmd.getOptionValue("c"));
    }

    @Test
    public void testParse_stopAtNonOptionThreeArgOverload_stopsParsing() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a", "-unknown", "extra" }, true);

        assertTrue(cmd.hasOption("a"));
        List<String> args = cmd.getArgList();
        assertTrue(args.contains("-unknown"));
        assertTrue(args.contains("extra"));
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_nullArguments_returnsEmptyCommandLine() throws ParseException
    {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, null);

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgList().size());
    }

    @Test
    public void testParse_emptyArguments_returnsEmptyCommandLine() throws ParseException
    {
        Options options = new Options();

        CommandLine cmd = parser.parse(options, new String[] {});

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgList().size());
    }

    @Test
    public void testParse_nullProperties_behavesAsNoProperties() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-a" }, (Properties) null);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_singleDashToken_addedAsArgument() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "-" });

        assertTrue(cmd.getArgList().contains("-"));
    }

    @Test
    public void testParse_unknownNonOptionToken_addedAsArgument() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        CommandLine cmd = parser.parse(options, new String[] { "plainArgument" });

        assertTrue(cmd.getArgList().contains("plainArgument"));
    }

    @Test
    public void testParse_optionGroupSelectionOnce_noException() throws ParseException
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("1", "one", false, "one option");
        Option opt2 = new Option("2", "two", false, "two option");
        group.addOption(opt1);
        group.addOption(opt2);

        Options options = new Options();
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[] { "-1" });

        assertTrue(cmd.hasOption("1"));
    }

    // ---------- Exception cases ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedShortOption_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();

        parser.parse(options, new String[] { "-x" });
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedLongOption_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();

        parser.parse(options, new String[] { "--zzz" });
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedLongOptionWithEqual_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();

        parser.parse(options, new String[] { "--zzz=value" });
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_propertiesWithUnrecognizedOption_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        Properties props = new Properties();
        props.setProperty("unknown", "true");

        parser.parse(options, new String[] {}, props);
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsMissingOptionException() throws ParseException
    {
        Options options = new Options();
        options.addRequiredOption("r", "req", false, "required option");

        parser.parse(options, new String[] {});
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingArgumentForOption_throwsMissingArgumentException() throws ParseException
    {
        Options options = new Options();
        options.addOption("c", "cee", true, "cee option with arg");

        parser.parse(options, new String[] { "-c" });
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_optionRequiringArgFollowedByAnotherOption_throwsMissingArgumentException() throws ParseException
    {
        Options options = new Options();
        options.addOption("c", "cee", true, "cee option with arg");
        options.addOption("a", false, "a option");

        parser.parse(options, new String[] { "-c", "-a" });
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOption_throwsAmbiguousOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption(null, "foo", false, "foo option");
        options.addOption(null, "foobar", false, "foobar option");

        parser.parse(options, new String[] { "--fo" });
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithEqual_throwsAmbiguousOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption(null, "foo", false, "foo option");
        options.addOption(null, "foobar", false, "foobar option");

        parser.parse(options, new String[] { "--fo=value" });
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParse_optionGroupSelectedTwiceDifferentOptions_throwsAlreadySelectedException() throws ParseException
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("1", "one", false, "one option");
        Option opt2 = new Option("2", "two", false, "two option");
        group.addOption(opt1);
        group.addOption(opt2);

        Options options = new Options();
        options.addOptionGroup(group);

        parser.parse(options, new String[] { "-1", "-2" });
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_shortOptionWithEqualNotAcceptingArg_throwsUnrecognizedOptionException() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", false, "a option");

        parser.parse(options, new String[] { "-a=value" });
    }
}
