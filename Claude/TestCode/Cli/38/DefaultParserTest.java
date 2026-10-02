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

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class DefaultParserTest
{
    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new DefaultParser();
        options = new Options();
    }

    // ---------- Normal / typical cases ----------

    @Test
    public void testParse_shortOptionNoArg_optionPresent() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        String[] args = {"-a"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_longOptionNoArg_optionPresent() throws ParseException
    {
        options.addOption(new Option("a", "alpha", false, "option alpha"));
        String[] args = {"--alpha"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("alpha"));
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_shortOptionWithArgSpaceSeparated_valueSet() throws ParseException
    {
        options.addOption(new Option("f", true, "file"));
        String[] args = {"-f", "myfile.txt"};

        CommandLine cmd = parser.parse(options, args);

        assertEquals("myfile.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testParse_longOptionWithEqualSign_valueSet() throws ParseException
    {
        options.addOption(new Option("f", "file", true, "file"));
        String[] args = {"--file=myfile.txt"};

        CommandLine cmd = parser.parse(options, args);

        assertEquals("myfile.txt", cmd.getOptionValue("file"));
    }

    @Test
    public void testParse_shortOptionWithEqualSign_valueSet() throws ParseException
    {
        options.addOption(new Option("f", true, "file"));
        String[] args = {"-f=myfile.txt"};

        CommandLine cmd = parser.parse(options, args);

        assertEquals("myfile.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testParse_plainArguments_addedToArgList() throws ParseException
    {
        String[] args = {"foo", "bar"};

        CommandLine cmd = parser.parse(options, args);

        assertEquals(2, cmd.getArgs().length);
        assertEquals("foo", cmd.getArgs()[0]);
        assertEquals("bar", cmd.getArgs()[1]);
    }

    @Test
    public void testParse_doubleHyphenStopsParsing_remainingAddedAsArgs() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        String[] args = {"-a", "--", "-b", "c"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("-b", cmd.getArgs()[0]);
        assertEquals("c", cmd.getArgs()[1]);
    }

    @Test
    public void testParse_concatenatedShortOptions_bothSet() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("b", false, "option b"));
        String[] args = {"-ab"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testParse_concatenatedShortOptionsWithTrailingArg_valueSet() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("b", false, "option b"));
        options.addOption(new Option("r", true, "option r"));
        String[] args = {"-abrfoo"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("foo", cmd.getOptionValue("r"));
    }

    @Test
    public void testParse_javaPropertyStyleNoEqual_valueSet() throws ParseException
    {
        Option d = new Option("D", true, "define");
        d.setArgs(2);
        options.addOption(d);
        String[] args = {"-Dflag"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("D"));
        assertEquals("flag", cmd.getOptionValues("D")[0]);
    }

    @Test
    public void testParse_javaPropertyStyleWithEqual_keyValueSet() throws ParseException
    {
        Option d = new Option("D", true, "define");
        d.setArgs(2);
        options.addOption(d);
        String[] args = {"-Dkey=value"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("D"));
        String[] values = cmd.getOptionValues("D");
        assertEquals("key", values[0]);
        assertEquals("value", values[1]);
    }

    @Test
    public void testParse_longPrefixOption_valueSet() throws ParseException
    {
        Option xmx = new Option("X", "Xmx", true, "max memory");
        options.addOption(xmx);
        String[] args = {"-Xmx512m"};

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("Xmx"));
        assertEquals("512m", cmd.getOptionValue("Xmx"));
    }

    @Test
    public void testParse_negativeNumberAsArgumentValue_valueSet() throws ParseException
    {
        options.addOption(new Option("n", true, "number"));
        String[] args = {"-n", "-5"};

        CommandLine cmd = parser.parse(options, args);

        assertEquals("-5", cmd.getOptionValue("n"));
    }

    @Test
    public void testParse_stopAtNonOptionTrue_remainingAddedAsArgs() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        String[] args = {"-a", "foo", "-x"};

        CommandLine cmd = parser.parse(options, args, true);

        assertTrue(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("foo", cmd.getArgs()[0]);
        assertEquals("-x", cmd.getArgs()[1]);
    }

    @Test
    public void testParse_propertiesHandled_optionSetFromProperty() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_propertiesWithArgValue_valueSet() throws ParseException
    {
        options.addOption(new Option("f", true, "file"));
        Properties props = new Properties();
        props.setProperty("f", "myfile.txt");

        CommandLine cmd = parser.parse(options, new String[0], props, false);

        assertEquals("myfile.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testParse_propertiesNonYesTrueOneValueIgnoredForNoArgOption() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        Properties props = new Properties();
        props.setProperty("a", "no");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParse_optionAlreadySetByArgsPropertiesSkipped() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        Properties props = new Properties();
        props.setProperty("a", "true");

        String[] args = {"-a"};
        CommandLine cmd = parser.parse(options, args, props);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_optionGroupSelected_groupTracksSelection() throws ParseException
    {
        Option a = new Option("a", false, "option a");
        Option b = new Option("b", false, "option b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        String[] args = {"-a"};
        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_nullArguments_returnsEmptyCommandLine() throws ParseException
    {
        CommandLine cmd = parser.parse(options, null);

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParse_emptyArgumentsArray_returnsEmptyCommandLine() throws ParseException
    {
        CommandLine cmd = parser.parse(options, new String[0]);

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParse_emptyOptionsWithPlainArgs_addedAsArgs() throws ParseException
    {
        String[] args = {"plainArg"};

        CommandLine cmd = parser.parse(options, args);

        assertEquals(1, cmd.getArgs().length);
        assertEquals("plainArg", cmd.getArgs()[0]);
    }

    @Test
    public void testParse_nullPropertiesIgnored() throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        String[] args = {"-a"};

        CommandLine cmd = parser.parse(options, args, (Properties) null);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_singleHyphenToken_treatedAsArgument() throws ParseException
    {
        String[] args = {"-"};

        CommandLine cmd = parser.parse(options, args);

        assertEquals(1, cmd.getArgs().length);
        assertEquals("-", cmd.getArgs()[0]);
    }

    @Test
    public void testParse_unknownCharInConcatenatedOptionsWithStopAtNonOption_addsRemainderAsArg()
            throws ParseException
    {
        options.addOption(new Option("a", false, "option a"));
        String[] args = {"-axyz"};

        CommandLine cmd = parser.parse(options, args, true);

        assertTrue(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgs().length);
        assertEquals("xyz", cmd.getArgs()[0]);
    }

    // ---------- Exception cases ----------

    @Test(expected = MissingOptionException.class)
    public void testParse_requiredOptionMissing_throwsMissingOptionException() throws ParseException
    {
        Option a = new Option("a", false, "option a");
        a.setRequired(true);
        options.addOption(a);

        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_requiredArgMissing_throwsMissingArgumentException() throws ParseException
    {
        options.addOption(new Option("a", true, "option a"));
        String[] args = {"-a"};

        parser.parse(options, args);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOption_throwsUnrecognizedOptionException() throws ParseException
    {
        String[] args = {"-x"};

        parser.parse(options, args);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedPropertyOption_throwsUnrecognizedOptionException() throws ParseException
    {
        Properties props = new Properties();
        props.setProperty("unknown", "true");

        parser.parse(options, new String[0], props);
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOption_throwsAmbiguousOptionException() throws ParseException
    {
        options.addOption(new Option("f", "foo", false, "foo option"));
        options.addOption(new Option("b", "foobar", false, "foobar option"));

        String[] args = {"--fo"};

        parser.parse(options, args);
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParse_optionGroupAlreadySelected_throwsAlreadySelectedException() throws ParseException
    {
        Option a = new Option("a", false, "option a");
        Option b = new Option("b", false, "option b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        String[] args = {"-a", "-b"};

        parser.parse(options, args);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedTokenWithoutStopAtNonOption_throwsException() throws ParseException
    {
        String[] args = {"--unknownLongOption"};

        parser.parse(options, args, false);
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_requiredOptionGroupMissing_throwsMissingOptionException() throws ParseException
    {
        Option a = new Option("a", false, "option a");
        Option b = new Option("b", false, "option b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);

        parser.parse(options, new String[0]);
    }
}
