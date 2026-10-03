package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

public class DefaultParserTest {

    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultParser();
        options = new Options();
    }

    @Test
    public void testParse_simpleOptionsAndArgs_success() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", true, "beta option");

        String[] args = new String[]{"-a", "--beta", "value1", "extra1", "extra2"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("alpha"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertTrue(cl.hasOption("beta"));
        Assert.assertEquals("value1", cl.getOptionValue("b"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("extra1", cl.getArgs()[0]);
        Assert.assertEquals("extra2", cl.getArgs()[1]);
    }

    @Test
    public void testParse_nullArguments_success() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, null);
        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParse_emptyArguments_success() throws Exception {
        options.addOption("a", false, "option a");
        CommandLine cl = parser.parse(options, new String[0]);
        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
    }

    @Test
    public void testParse_withProperties_hasArgOption() throws Exception {
        Option optB = OptionBuilder.hasArg().create('b');
        options.addOption(optB);

        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cl = parser.parse(options, new String[]{}, props);
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("propValue", cl.getOptionValue("b"));
    }

    @Test
    public void testParse_withProperties_booleanOptionVariants() throws Exception {
        options.addOption("a", false, "opt a");
        options.addOption("b", false, "opt b");
        options.addOption("c", false, "opt c");
        options.addOption("d", false, "opt d");

        Properties props = new Properties();
        props.setProperty("a", "yes");
        props.setProperty("b", "true");
        props.setProperty("c", "1");
        props.setProperty("d", "no");

        CommandLine cl = parser.parse(options, new String[]{}, props);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertTrue(cl.hasOption("c"));
        Assert.assertFalse(cl.hasOption("d"));
    }

    @Test
    public void testParse_withProperties_alreadyPresentInArgs_notOverridden() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('b'));

        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cl = parser.parse(options, new String[]{"-b", "argValue"}, props);
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("argValue", cl.getOptionValue("b"));
    }

    @Test
    public void testParse_withProperties_groupAlreadySelected() throws Exception {
        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        Properties props = new Properties();
        props.setProperty("b", "true");

        CommandLine cl = parser.parse(options, new String[]{"-a"}, props);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_withProperties_undefinedOptionThrows() throws Exception {
        Properties props = new Properties();
        props.setProperty("unknown", "value");
        parser.parse(options, new String[]{}, props);
    }

    @Test
    public void testParse_stopAtNonOption_booleanOverload() throws Exception {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a", "nonOption", "-b", "--other"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(3, cl.getArgs().length);
        Assert.assertEquals("nonOption", cl.getArgs()[0]);
        Assert.assertEquals("-b", cl.getArgs()[1]);
        Assert.assertEquals("--other", cl.getArgs()[2]);
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOptionThrows() throws Exception {
        Option optReq = OptionBuilder.isRequired().create('r');
        options.addOption(optReq);

        parser.parse(options, new String[]{});
    }

    @Test
    public void testParse_requiredOptionPresent() throws Exception {
        Option optReq = OptionBuilder.isRequired().create('r');
        options.addOption(optReq);

        CommandLine cl = parser.parse(options, new String[]{"-r"});
        Assert.assertTrue(cl.hasOption("r"));
    }

    @Test
    public void testParse_requiredOptionGroupPresent() throws Exception {
        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-b"});
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("b", group.getSelected());
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOptionGroupThrows() throws Exception {
        Option optA = new Option("a", "alpha");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optA);
        options.addOptionGroup(group);

        parser.parse(options, new String[]{});
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParse_optionGroupMultipleSelectionThrows() throws Exception {
        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        parser.parse(options, new String[]{"-a", "-b"});
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingRequiredArgsThrows() throws Exception {
        options.addOption(OptionBuilder.hasArg().isRequired().create('f'));
        parser.parse(options, new String[]{"-f"});
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingRequiredArgsBeforeNextOptionThrows() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('f'));
        options.addOption("a", false, "option a");
        parser.parse(options, new String[]{"-f", "-a"});
    }

    @Test
    public void testParse_doubleDashDelimiter_skipsParsingRemaining() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");

        CommandLine cl = parser.parse(options, new String[]{"-a", "--", "-b", "arg1"});
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("-b", cl.getArgs()[0]);
        Assert.assertEquals("arg1", cl.getArgs()[1]);
    }

    @Test
    public void testParse_quotedArgumentsStripped() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('o'));
        CommandLine cl = parser.parse(options, new String[]{"-o", "\"quoted_value\""});
        Assert.assertEquals("quoted_value", cl.getOptionValue("o"));
    }

    @Test
    public void testParse_negativeNumberAsArgument() throws Exception {
        options.addOption(OptionBuilder.hasArg().create("n"));
        CommandLine cl = parser.parse(options, new String[]{"-n", "-42.5"});
        Assert.assertEquals("-42.5", cl.getOptionValue("n"));
    }

    @Test
    public void testParse_singleHyphenAsArgument() throws Exception {
        options.addOption(OptionBuilder.hasArg().create("f"));
        CommandLine cl = parser.parse(options, new String[]{"-f", "-"});
        Assert.assertEquals("-", cl.getOptionValue("f"));
    }

    @Test
    public void testParse_singleHyphenAsExtraArg() throws Exception {
        CommandLine cl = parser.parse(options, new String[]{"-"});
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("-", cl.getArgs()[0]);
    }

    @Test
    public void testParse_longOptionWithEqual() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create());
        CommandLine cl = parser.parse(options, new String[]{"--foo=bar"});
        Assert.assertTrue(cl.hasOption("foo"));
        Assert.assertEquals("bar", cl.getOptionValue("foo"));
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithoutEqualThrows() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("foo").create());
        options.addOption(OptionBuilder.withLongOpt("foobar").create());
        parser.parse(options, new String[]{"--fo"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithEqualThrows() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create());
        options.addOption(OptionBuilder.withLongOpt("foobar").hasArg().create());
        parser.parse(options, new String[]{"--fo=val"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unknownLongOptionThrows() throws Exception {
        parser.parse(options, new String[]{"--unknown"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unknownLongOptionWithEqualThrows() throws Exception {
        parser.parse(options, new String[]{"--unknown=val"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_longOptionWithEqualWhenNoArgAcceptedThrows() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("noarg").create());
        parser.parse(options, new String[]{"--noarg=val"});
    }

    @Test
    public void testParse_shortOptionWithEqual() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('s'));
        CommandLine cl = parser.parse(options, new String[]{"-s=value"});
        Assert.assertTrue(cl.hasOption("s"));
        Assert.assertEquals("value", cl.getOptionValue("s"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_shortOptionWithEqualWhenNoArgAcceptedThrows() throws Exception {
        options.addOption("s", false, "no arg");
        parser.parse(options, new String[]{"-s=value"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unknownShortOptionThrows() throws Exception {
        parser.parse(options, new String[]{"-x"});
    }

    @Test
    public void testParse_singleHyphenLongOptionWithoutEqual() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("optLong").create());
        CommandLine cl = parser.parse(options, new String[]{"-optLong"});
        Assert.assertTrue(cl.hasOption("optLong"));
    }

    @Test
    public void testParse_singleHyphenLongOptionWithEqual() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("optLong").hasArg().create());
        CommandLine cl = parser.parse(options, new String[]{"-optLong=val"});
        Assert.assertTrue(cl.hasOption("optLong"));
        Assert.assertEquals("val", cl.getOptionValue("optLong"));
    }

    @Test
    public void testParse_longPrefixAttachedArgument() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("Xmx").hasArg().create());
        CommandLine cl = parser.parse(options, new String[]{"-Xmx512m"});
        Assert.assertTrue(cl.hasOption("Xmx"));
        Assert.assertEquals("512m", cl.getOptionValue("Xmx"));
    }

    @Test
    public void testParse_javaPropertyStyleOption() throws Exception {
        Option optD = OptionBuilder.withValueSeparator().hasArgs(2).create('D');
        options.addOption(optD);

        CommandLine cl = parser.parse(options, new String[]{"-Dkey=value"});
        Assert.assertTrue(cl.hasOption("D"));
        String[] values = cl.getOptionValues("D");
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("key", values[0]);
        Assert.assertEquals("value", values[1]);
    }

    @Test
    public void testParse_javaPropertyStyleOptionWithoutEqual() throws Exception {
        Option optD = OptionBuilder.hasArgs(2).create('D');
        options.addOption(optD);

        CommandLine cl = parser.parse(options, new String[]{"-Dproperty"});
        Assert.assertTrue(cl.hasOption("D"));
        Assert.assertEquals("property", cl.getOptionValue("D"));
    }

    @Test
    public void testParse_concatenatedShortOptions() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");

        CommandLine cl = parser.parse(options, new String[]{"-abc"});
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertTrue(cl.hasOption("c"));
    }

    @Test
    public void testParse_concatenatedShortOptionsWithTrailingValue() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption(OptionBuilder.hasArg().create('b'));

        CommandLine cl = parser.parse(options, new String[]{"-abValue"});
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("Value", cl.getOptionValue("b"));
    }

    @Test
    public void testParse_concatenatedShortOptions_stopAtNonOption() throws Exception {
        options.addOption("a", false, "option a");

        CommandLine cl = parser.parse(options, new String[]{"-azx"}, true);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("zx", cl.getArgs()[0]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_concatenatedShortOptions_unknownThrows() throws Exception {
        options.addOption("a", false, "option a");
        parser.parse(options, new String[]{"-azx"}, false);
    }

    @Test
    public void testParse_multipleArgumentsForOption() throws Exception {
        Option optM = OptionBuilder.hasArgs(3).create('m');
        options.addOption(optM);

        CommandLine cl = parser.parse(options, new String[]{"-m", "v1", "v2", "v3", "extra"});
        Assert.assertTrue(cl.hasOption("m"));
        String[] vals = cl.getOptionValues("m");
        Assert.assertEquals(3, vals.length);
        Assert.assertEquals("v1", vals[0]);
        Assert.assertEquals("v2", vals[1]);
        Assert.assertEquals("v3", vals[2]);
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("extra", cl.getArgs()[0]);
    }

    @Test
    public void testParse_unlimitedValuesForOption() throws Exception {
        Option optM = OptionBuilder.hasArgs(Option.UNLIMITED_VALUES).create('u');
        options.addOption(optM);

        CommandLine cl = parser.parse(options, new String[]{"-u", "v1", "v2", "--", "trailing"});
        Assert.assertTrue(cl.hasOption("u"));
        String[] vals = cl.getOptionValues("u");
        Assert.assertEquals(2, vals.length);
        Assert.assertEquals("v1", vals[0]);
        Assert.assertEquals("v2", vals[1]);
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("trailing", cl.getArgs()[0]);
    }
}
