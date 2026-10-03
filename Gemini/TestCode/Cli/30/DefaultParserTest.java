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
    public void testParse_optionsAndArgumentsOnly_success() throws Exception {
        options.addOption("a", "alpha", false, "Option alpha");
        String[] args = new String[]{"-a", "arg1", "arg2"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("arg1", cl.getArgs()[0]);
        Assert.assertEquals("arg2", cl.getArgs()[1]);
    }

    @Test
    public void testParse_optionsArgumentsAndStopAtNonOption_stopsParsing() throws Exception {
        options.addOption("a", "alpha", false, "Option alpha");
        options.addOption("b", "beta", false, "Option beta");
        String[] args = new String[]{"-a", "nonOption", "-b"};

        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("nonOption", cl.getArgs()[0]);
        Assert.assertEquals("-b", cl.getArgs()[1]);
    }

    @Test
    public void testParse_withProperties_success() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('a'));
        options.addOption(OptionBuilder.create('b'));
        options.addOption(OptionBuilder.create('c'));
        options.addOption(OptionBuilder.create('d'));
        options.addOption(OptionBuilder.create('e'));

        Properties properties = new Properties();
        properties.setProperty("a", "propValA");
        properties.setProperty("b", "true");
        properties.setProperty("c", "yes");
        properties.setProperty("d", "1");
        properties.setProperty("e", "no");

        String[] args = new String[]{};
        CommandLine cl = parser.parse(options, args, properties);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals("propValA", cl.getOptionValue("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertTrue(cl.hasOption("c"));
        Assert.assertTrue(cl.hasOption("d"));
        Assert.assertFalse(cl.hasOption("e"));
    }

    @Test
    public void testParse_propertiesDoNotOverrideCommandLineArgs() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('a'));

        Properties properties = new Properties();
        properties.setProperty("a", "propVal");

        String[] args = new String[]{"-a", "cmdVal"};
        CommandLine cl = parser.parse(options, args, properties);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals("cmdVal", cl.getOptionValue("a"));
    }

    @Test
    public void testParse_nullArguments_treatedAsEmpty() throws Exception {
        options.addOption("a", false, "Option A");
        CommandLine cl = parser.parse(options, null);

        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParse_nullProperties_success() throws Exception {
        options.addOption("a", false, "Option A");
        CommandLine cl = parser.parse(options, new String[]{"-a"}, null, false);

        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testParse_doubleDash_skipsFurtherOptionParsing() throws Exception {
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");

        String[] args = new String[]{"-a", "--", "-b", "extra"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("-b", cl.getArgs()[0]);
        Assert.assertEquals("extra", cl.getArgs()[1]);
    }

    @Test
    public void testParse_negativeNumberAsArgument() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('n'));
        String[] args = new String[]{"-n", "-42.5"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("n"));
        Assert.assertEquals("-42.5", cl.getOptionValue("n"));
    }

    @Test
    public void testParse_singleHyphenArgument() throws Exception {
        options.addOption("a", false, "Option A");
        String[] args = new String[]{"-a", "-"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("-", cl.getArgs()[0]);
    }

    @Test
    public void testParse_quotedArgumentStripping() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('o'));
        String[] args = new String[]{"-o", "\"quoted value\""};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("o"));
        Assert.assertEquals("quoted value", cl.getOptionValue("o"));
    }

    @Test
    public void testParse_shortOptionWithAttachedValue() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('o'));
        String[] args = new String[]{"-ovalue"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("o"));
        Assert.assertEquals("value", cl.getOptionValue("o"));
    }

    @Test
    public void testParse_shortOptionWithEqualSign() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('o'));
        String[] args = new String[]{"-o=value"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("o"));
        Assert.assertEquals("value", cl.getOptionValue("o"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_shortOptionWithEqualSignWhenNoArgExpected_throwsException() throws Exception {
        options.addOption(OptionBuilder.create('o'));
        String[] args = new String[]{"-o=value"};

        parser.parse(options, args);
    }

    @Test
    public void testParse_concatenatedShortOptions() throws Exception {
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");
        options.addOption("c", false, "Option C");

        String[] args = new String[]{"-abc"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertTrue(cl.hasOption("c"));
    }

    @Test
    public void testParse_concatenatedShortOptionsWithTrailingValue() throws Exception {
        options.addOption("a", false, "Option A");
        options.addOption(OptionBuilder.hasArg().create('b'));

        String[] args = new String[]{"-abValue"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("Value", cl.getOptionValue("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_concatenatedShortOptionsWithInvalidChar_throwsException() throws Exception {
        options.addOption("a", false, "Option A");

        String[] args = new String[]{"-az"};
        parser.parse(options, args);
    }

    @Test
    public void testParse_concatenatedShortOptionsWithInvalidCharAndStopAtNonOption() throws Exception {
        options.addOption("a", false, "Option A");

        String[] args = new String[]{"-az"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("z", cl.getArgs()[0]);
    }

    @Test
    public void testParse_longOptionWithoutEqual() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create());
        String[] args = new String[]{"--foo", "bar"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("foo"));
        Assert.assertEquals("bar", cl.getOptionValue("foo"));
    }

    @Test
    public void testParse_longOptionWithEqual() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create());
        String[] args = new String[]{"--foo=bar"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("foo"));
        Assert.assertEquals("bar", cl.getOptionValue("foo"));
    }

    @Test
    public void testParse_singleHyphenLongOptionWithEqual() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create());
        String[] args = new String[]{"-foo=bar"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("foo"));
        Assert.assertEquals("bar", cl.getOptionValue("foo"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_longOptionWithEqualWhenNoArg_throwsException() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("foo").create());
        String[] args = new String[]{"--foo=bar"};

        parser.parse(options, args);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedLongOption_throwsException() throws Exception {
        options.addOption("a", false, "Option A");
        String[] args = new String[]{"--unknown"};

        parser.parse(options, args);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedLongOptionWithEqual_throwsException() throws Exception {
        options.addOption("a", false, "Option A");
        String[] args = new String[]{"--unknown=val"};

        parser.parse(options, args);
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithoutEqual_throwsException() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("testOptionOne").create());
        options.addOption(OptionBuilder.withLongOpt("testOptionTwo").create());

        String[] args = new String[]{"--testOption"};
        parser.parse(options, args);
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testParse_ambiguousLongOptionWithEqual_throwsException() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("testOptionOne").hasArg().create());
        options.addOption(OptionBuilder.withLongOpt("testOptionTwo").hasArg().create());

        String[] args = new String[]{"--testOption=val"};
        parser.parse(options, args);
    }

    @Test
    public void testParse_longPrefixAttachedOption() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("Xmx").hasArg().create());
        String[] args = new String[]{"-Xmx512m"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("Xmx"));
        Assert.assertEquals("512m", cl.getOptionValue("Xmx"));
    }

    @Test
    public void testParse_javaPropertyOptionAttached() throws Exception {
        Option propertyOpt = OptionBuilder.withValueSeparator()
                .hasArgs(2)
                .create('D');
        options.addOption(propertyOpt);

        String[] args = new String[]{"-Dkey=value"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption('D'));
        String[] values = cl.getOptionValues('D');
        Assert.assertEquals("key", values[0]);
        Assert.assertEquals("value", values[1]);
    }

    @Test
    public void testParse_javaPropertyOptionAttachedSingleValue() throws Exception {
        Option propertyOpt = OptionBuilder.hasArgs(2).create('D');
        options.addOption(propertyOpt);

        String[] args = new String[]{"-Dkey"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption('D'));
        Assert.assertEquals("key", cl.getOptionValue('D'));
    }

    @Test
    public void testParse_javaPropertyOptionUnlimitedValues() throws Exception {
        Option propertyOpt = OptionBuilder.hasArgs(Option.UNLIMITED_VALUES).create('D');
        options.addOption(propertyOpt);

        String[] args = new String[]{"-Dkey=val"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption('D'));
        String[] values = cl.getOptionValues('D');
        Assert.assertEquals("key", values[0]);
        Assert.assertEquals("val", values[1]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingArgumentForLastOption_throwsException() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('o'));
        String[] args = new String[]{"-o"};

        parser.parse(options, args);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingArgumentBeforeNextOption_throwsException() throws Exception {
        options.addOption(OptionBuilder.hasArg().create('a'));
        options.addOption(OptionBuilder.create('b'));
        String[] args = new String[]{"-a", "-b"};

        parser.parse(options, args);
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsException() throws Exception {
        options.addOption(OptionBuilder.isRequired().create('r'));
        String[] args = new String[]{};

        parser.parse(options, args);
    }

    @Test
    public void testParse_presentRequiredOption_success() throws Exception {
        options.addOption(OptionBuilder.isRequired().create('r'));
        String[] args = new String[]{"-r"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("r"));
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOptionGroup_throwsException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(OptionBuilder.create('a'));
        group.addOption(OptionBuilder.create('b'));
        options.addOptionGroup(group);

        String[] args = new String[]{};
        parser.parse(options, args);
    }

    @Test
    public void testParse_satisfiedRequiredOptionGroup_success() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(OptionBuilder.create('a'));
        group.addOption(OptionBuilder.create('b'));
        options.addOptionGroup(group);

        String[] args = new String[]{"-a"};
        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
    }

    @Test(expected = AlreadySelectedException.class)
    public void testParse_multipleOptionsSelectedInGroup_throwsException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(OptionBuilder.create('a'));
        group.addOption(OptionBuilder.create('b'));
        options.addOptionGroup(group);

        String[] args = new String[]{"-a", "-b"};
        parser.parse(options, args);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_singleHyphenUnknownMultiChar_throwsException() throws Exception {
        options.addOption("a", false, "Option A");
        String[] args = new String[]{"-z"};

        parser.parse(options, args);
    }

    @Test
    public void testParse_singleHyphenUnknownMultiCharWithStopAtNonOption() throws Exception {
        options.addOption("a", false, "Option A");
        String[] args = new String[]{"-z", "arg"};

        CommandLine cl = parser.parse(options, args, true);

        Assert.assertNotNull(cl);
        Assert.assertEquals(2, cl.getArgs().length);
        Assert.assertEquals("-z", cl.getArgs()[0]);
        Assert.assertEquals("arg", cl.getArgs()[1]);
    }

    @Test
    public void testParse_partialLongOptionSingleHyphen_success() throws Exception {
        options.addOption(OptionBuilder.withLongOpt("version").create('v'));
        String[] args = new String[]{"-version"};

        CommandLine cl = parser.parse(options, args);

        Assert.assertTrue(cl.hasOption("v"));
    }
}
