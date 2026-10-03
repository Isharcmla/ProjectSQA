package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DefaultParserTest {

    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultParser();
        options = new Options();
    }

    @Test
    public void testParse_twoArgOverload_success() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_threeArgWithProperties_success() throws Exception {
        options.addOption(Option.builder("a").hasArg().build());
        Properties props = new Properties();
        props.setProperty("a", "propertyValue");

        CommandLine cmd = parser.parse(options, new String[]{}, props);
        assertTrue(cmd.hasOption("a"));
        assertEquals("propertyValue", cmd.getOptionValue("a"));
    }

    @Test
    public void testParse_threeArgWithStopAtNonOption_success() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "nonOption", "-b"}, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgList().size());
        assertEquals("nonOption", cmd.getArgList().get(0));
        assertEquals("-b", cmd.getArgList().get(1));
    }

    @Test
    public void testParse_nullArguments_returnsEmptyCommandLine() throws Exception {
        CommandLine cmd = parser.parse(options, null, null, false);
        assertNotNull(cmd);
        assertEquals(0, cmd.getOptions().length);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParse_emptyArguments_returnsEmptyCommandLine() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{}, null, false);
        assertNotNull(cmd);
        assertEquals(0, cmd.getOptions().length);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParse_doubleHyphenToken_skipsParsingRemainingTokens() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");

        CommandLine cmd = parser.parse(options, new String[]{"-a", "--", "-b", "extra"});
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
        assertEquals(2, cmd.getArgList().size());
        assertEquals("-b", cmd.getArgList().get(0));
        assertEquals("extra", cmd.getArgList().get(1));
    }

    @Test
    public void testParse_singleHyphenToken_treatedAsArgument() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-"});
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-", cmd.getArgList().get(0));
    }

    @Test
    public void testParse_negativeNumberAsArgument_accepted() throws Exception {
        options.addOption(Option.builder("n").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-n", "-42.5"});
        assertTrue(cmd.hasOption("n"));
        assertEquals("-42.5", cmd.getOptionValue("n"));
    }

    @Test
    public void testParse_quotedArgument_quotesStripped() throws Exception {
        options.addOption(Option.builder("v").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-v", "\"hello world\""});
        assertTrue(cmd.hasOption("v"));
        assertEquals("hello world", cmd.getOptionValue("v"));
    }

    @Test
    public void testParse_longOptionWithoutEqual_success() throws Exception {
        options.addOption(Option.builder().longOpt("config").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"--config", "app.properties"});
        assertTrue(cmd.hasOption("config"));
        assertEquals("app.properties", cmd.getOptionValue("config"));
    }

    @Test
    public void testParse_longOptionWithEqual_success() throws Exception {
        options.addOption(Option.builder().longOpt("config").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"--config=app.properties"});
        assertTrue(cmd.hasOption("config"));
        assertEquals("app.properties", cmd.getOptionValue("config"));
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithoutEqual_throwsAmbiguousOptionException() throws Exception {
        options.addOption(Option.builder().longOpt("configFile").build());
        options.addOption(Option.builder().longOpt("configDir").build());
        parser.parse(options, new String[]{"--config"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithEqual_throwsAmbiguousOptionException() throws Exception {
        options.addOption(Option.builder().longOpt("configFile").hasArg().build());
        options.addOption(Option.builder().longOpt("configDir").hasArg().build());
        parser.parse(options, new String[]{"--config=test"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedLongOptionWithoutEqual_throwsUnrecognizedOptionException() throws Exception {
        parser.parse(options, new String[]{"--unknown"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedLongOptionWithEqual_throwsUnrecognizedOptionException() throws Exception {
        parser.parse(options, new String[]{"--unknown=val"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_longOptionWithEqualOnNonArgOption_throwsUnrecognizedOptionException() throws Exception {
        options.addOption(Option.builder().longOpt("flag").build());
        parser.parse(options, new String[]{"--flag=unexpectedValue"});
    }

    @Test
    public void testParse_singleDashLongOptionWithoutEqual_success() throws Exception {
        options.addOption(Option.builder().longOpt("verbose").build());
        CommandLine cmd = parser.parse(options, new String[]{"-verbose"});
        assertTrue(cmd.hasOption("verbose"));
    }

    @Test
    public void testParse_singleDashLongOptionWithEqual_success() throws Exception {
        options.addOption(Option.builder().longOpt("output").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-output=result.txt"});
        assertTrue(cmd.hasOption("output"));
        assertEquals("result.txt", cmd.getOptionValue("output"));
    }

    @Test
    public void testParse_singleDashShortOptionWithEqual_success() throws Exception {
        options.addOption(Option.builder("o").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-o=out.log"});
        assertTrue(cmd.hasOption("o"));
        assertEquals("out.log", cmd.getOptionValue("o"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_singleDashShortOptionWithEqualWhenNoArgAccepted_throwsException() throws Exception {
        options.addOption("f", false, "flag");
        parser.parse(options, new String[]{"-f=illegal"});
    }

    @Test
    public void testParse_longPrefixAttachedValue_success() throws Exception {
        options.addOption(Option.builder().longOpt("Xmx").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-Xmx512m"});
        assertTrue(cmd.hasOption("Xmx"));
        assertEquals("512m", cmd.getOptionValue("Xmx"));
    }

    @Test
    public void testParse_javaPropertyStyleWithoutEqual_success() throws Exception {
        Option propOption = Option.builder("D").hasArgs().valueSeparator('=').build();
        options.addOption(propOption);
        CommandLine cmd = parser.parse(options, new String[]{"-DmyKey"});
        assertTrue(cmd.hasOption("D"));
        assertEquals("myKey", cmd.getOptionValue("D"));
    }

    @Test
    public void testParse_javaPropertyStyleWithEqual_success() throws Exception {
        Option propOption = Option.builder("D").numberOfArgs(2).valueSeparator('=').build();
        options.addOption(propOption);
        CommandLine cmd = parser.parse(options, new String[]{"-Dkey=val"});
        assertTrue(cmd.hasOption("D"));
        assertEquals("key", cmd.getOptionValues("D")[0]);
        assertEquals("val", cmd.getOptionValues("D")[1]);
    }

    @Test
    public void testParse_concatenatedShortOptions_success() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");

        CommandLine cmd = parser.parse(options, new String[]{"-abc"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
    }

    @Test
    public void testParse_concatenatedShortOptionsWithTrailingArg_success() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption(Option.builder("b").hasArg().build());

        CommandLine cmd = parser.parse(options, new String[]{"-abfile.txt"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("file.txt", cmd.getOptionValue("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_concatenatedShortOptionsWithInvalidChar_throwsException() throws Exception {
        options.addOption("a", false, "option a");
        parser.parse(options, new String[]{"-az"});
    }

    @Test
    public void testParse_concatenatedShortOptionsStopAtNonOption_stopsParsing() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cmd = parser.parse(options, new String[]{"-az", "extra"}, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgList().size());
        assertEquals("z", cmd.getArgList().get(0));
        assertEquals("extra", cmd.getArgList().get(1));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedShortOption_throwsException() throws Exception {
        parser.parse(options, new String[]{"-z"});
    }

    @Test
    public void testParse_unknownOptionWithStopAtNonOption_appendsToArgs() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"-unknown", "foo", "bar"}, true);
        assertEquals(3, cmd.getArgList().size());
        assertEquals("-unknown", cmd.getArgList().get(0));
        assertEquals("foo", cmd.getArgList().get(1));
        assertEquals("bar", cmd.getArgList().get(2));
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingRequiredArgumentAtEnd_throwsException() throws Exception {
        options.addOption(Option.builder("req").hasArg().build());
        parser.parse(options, new String[]{"-req"});
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingRequiredArgumentFollowedByOption_throwsException() throws Exception {
        options.addOption(Option.builder("a").hasArg().build());
        options.addOption("b", false, "flag b");
        parser.parse(options, new String[]{"-a", "-b"});
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsMissingOptionException() throws Exception {
        Option req = Option.builder("r").required().build();
        options.addOption(req);
        parser.parse(options, new String[]{});
    }

    @Test
    public void testParse_requiredOptionProvided_success() throws Exception {
        Option req = Option.builder("r").required().build();
        options.addOption(req);
        CommandLine cmd = parser.parse(options, new String[]{"-r"});
        assertTrue(cmd.hasOption("r"));
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_requiredOptionGroupMissing_throwsMissingOptionException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", "alpha"));
        group.addOption(new Option("b", "beta"));
        options.addOptionGroup(group);

        parser.parse(options, new String[]{});
    }

    @Test
    public void testParse_requiredOptionGroupProvided_success() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", "alpha"));
        group.addOption(new Option("b", "beta"));
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-b"});
        assertTrue(cmd.hasOption("b"));
        assertFalse(cmd.hasOption("a"));
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParse_optionGroupMultipleSelected_throwsAlreadySelectedException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha"));
        group.addOption(new Option("b", "beta"));
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-a", "-b"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testHandleProperties_unrecognizedPropertyOption_throwsException() throws Exception {
        Properties props = new Properties();
        props.setProperty("unknownProp", "value");
        parser.parse(options, new String[]{}, props);
    }

    @Test
    public void testHandleProperties_booleanFlags_variousValues() throws Exception {
        options.addOption("t", false, "flag true");
        options.addOption("y", false, "flag yes");
        options.addOption("one", false, "flag 1");
        options.addOption("f", false, "flag false");

        Properties props = new Properties();
        props.setProperty("t", "true");
        props.setProperty("y", "yes");
        props.setProperty("one", "1");
        props.setProperty("f", "0");

        CommandLine cmd = parser.parse(options, new String[]{}, props);
        assertTrue(cmd.hasOption("t"));
        assertTrue(cmd.hasOption("y"));
        assertTrue(cmd.hasOption("one"));
        assertFalse(cmd.hasOption("f"));
    }

    @Test
    public void testHandleProperties_optionAlreadySpecifiedInArgs_propertyIgnored() throws Exception {
        options.addOption(Option.builder("a").hasArg().build());
        Properties props = new Properties();
        props.setProperty("a", "fromProperty");

        CommandLine cmd = parser.parse(options, new String[]{"-a", "fromCommandLine"}, props);
        assertTrue(cmd.hasOption("a"));
        assertEquals("fromCommandLine", cmd.getOptionValue("a"));
    }

    @Test
    public void testHandleProperties_optionGroupAlreadySelectedInArgs_propertyIgnored() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha"));
        group.addOption(Option.builder("b").hasArg().build());
        options.addOptionGroup(group);

        Properties props = new Properties();
        props.setProperty("b", "betaVal");

        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test
    public void testParse_optionWithMultipleValues_collectsAll() throws Exception {
        options.addOption(Option.builder("m").hasArgs().numberOfArgs(3).build());
        CommandLine cmd = parser.parse(options, new String[]{"-m", "v1", "v2", "v3"});
        assertTrue(cmd.hasOption("m"));
        String[] values = cmd.getOptionValues("m");
        assertEquals(3, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
        assertEquals("v3", values[2]);
    }
}
