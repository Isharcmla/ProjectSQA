package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest {

    private static class TestParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) throws ParseException {
            if (arguments == null) {
                return new String[0];
            }
            List<String> result = new ArrayList<String>();
            for (int i = 0; i < arguments.length; i++) {
                String arg = arguments[i];
                if (stopAtNonOption && (arg == null || (!arg.startsWith("-") || "-".equals(arg)))) {
                    for (int j = i; j < arguments.length; j++) {
                        result.add(arguments[j]);
                    }
                    break;
                }
                result.add(arg);
            }
            return result.toArray(new String[result.size()]);
        }
    }

    private TestParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new TestParser();
        options = new Options();
    }

    @Test
    public void testParse_twoArgs_success() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        String[] args = new String[]{"-a", "extra"};

        CommandLine cl = parser.parse(options, args);
        Assert.assertNotNull(cl);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(1, cl.getArgList().size());
        Assert.assertEquals("extra", cl.getArgList().get(0));
    }

    @Test
    public void testParse_threeArgsWithProperties_success() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption(OptionBuilder.hasArg().create("b"));

        Properties props = new Properties();
        props.setProperty("b", "propValue");

        CommandLine cl = parser.parse(options, new String[]{"-a"}, props);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("propValue", cl.getOptionValue("b"));
    }

    @Test
    public void testParse_threeArgsWithStopAtNonOption_success() throws Exception {
        options.addOption("a", false, "alpha option");
        options.addOption("b", false, "beta option");

        String[] args = new String[]{"-a", "nonOption", "-b"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
        Assert.assertEquals(2, cl.getArgList().size());
        Assert.assertEquals("nonOption", cl.getArgList().get(0));
        Assert.assertEquals("-b", cl.getArgList().get(1));
    }

    @Test
    public void testParse_nullArguments_handlesAsEmptyArray() throws Exception {
        options.addOption("a", false, "alpha option");
        CommandLine cl = parser.parse(options, (String[]) null);
        Assert.assertNotNull(cl);
        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(0, cl.getArgList().size());
    }

    @Test
    public void testParse_doubleDash_eatsTheRest() throws Exception {
        options.addOption("a", false, "alpha");
        options.addOption("b", false, "beta");

        String[] args = new String[]{"-a", "--", "-b", "--", "foo"};
        CommandLine cl = parser.parse(options, args, false);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertFalse(cl.hasOption("b"));
        List<?> argList = cl.getArgList();
        Assert.assertEquals(2, argList.size());
        Assert.assertEquals("-b", argList.get(0));
        Assert.assertEquals("foo", argList.get(1));
    }

    @Test
    public void testParse_singleDash_stopAtNonOptionFalse() throws Exception {
        options.addOption("a", false, "alpha");
        String[] args = new String[]{"-", "-a"};
        CommandLine cl = parser.parse(options, args, false);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertEquals(1, cl.getArgList().size());
        Assert.assertEquals("-", cl.getArgList().get(0));
    }

    @Test
    public void testParse_singleDash_stopAtNonOptionTrue() throws Exception {
        options.addOption("a", false, "alpha");
        String[] args = new String[]{"-", "-a"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgList().size());
        Assert.assertEquals("-", cl.getArgList().get(0));
        Assert.assertEquals("-a", cl.getArgList().get(1));
    }

    @Test
    public void testParse_unrecognizedOption_stopAtNonOptionTrue() throws Exception {
        options.addOption("a", false, "alpha");
        String[] args = new String[]{"-unknown", "-a"};
        CommandLine cl = parser.parse(options, args, true);

        Assert.assertFalse(cl.hasOption("a"));
        Assert.assertEquals(2, cl.getArgList().size());
        Assert.assertEquals("-unknown", cl.getArgList().get(0));
        Assert.assertEquals("-a", cl.getArgList().get(1));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOption_stopAtNonOptionFalse_throwsException() throws Exception {
        options.addOption("a", false, "alpha");
        String[] args = new String[]{"-unknown"};
        parser.parse(options, args, false);
    }

    @Test
    public void testParse_clearsPreviousValuesAndGroups() throws Exception {
        Option opt = OptionBuilder.hasArg().create("a");
        OptionGroup group = new OptionGroup();
        group.addOption(opt);
        options.addOptionGroup(group);

        CommandLine cl1 = parser.parse(options, new String[]{"-a", "first"});
        Assert.assertEquals("first", cl1.getOptionValue("a"));

        CommandLine cl2 = parser.parse(options, new String[]{});
        Assert.assertFalse(cl2.hasOption("a"));
        Assert.assertNull(group.getSelected());
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsException() throws Exception {
        Option opt = OptionBuilder.isRequired().create("req");
        options.addOption(opt);

        parser.parse(options, new String[]{});
    }

    @Test
    public void testParse_requiredOptionPresent_success() throws Exception {
        Option opt = OptionBuilder.isRequired().create("req");
        options.addOption(opt);

        CommandLine cl = parser.parse(options, new String[]{"-req"});
        Assert.assertTrue(cl.hasOption("req"));
    }

    @Test
    public void testParse_requiredOptionGroupPresent_success() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(OptionBuilder.create("o1"));
        group.addOption(OptionBuilder.create("o2"));
        options.addOptionGroup(group);

        CommandLine cl = parser.parse(options, new String[]{"-o1"});
        Assert.assertTrue(cl.hasOption("o1"));
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOptionGroup_throwsException() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(OptionBuilder.create("o1"));
        group.addOption(OptionBuilder.create("o2"));
        options.addOptionGroup(group);

        parser.parse(options, new String[]{});
    }

    @Test
    public void testProcessArgs_withArgumentsAndQuotes() throws Exception {
        Option opt = OptionBuilder.hasArgs(2).create("f");
        options.addOption(opt);

        List<String> list = new ArrayList<String>(Arrays.asList("\"val1\"", "'val2'"));
        ListIterator<String> iter = list.listIterator();

        parser.setOptions(options);
        parser.processArgs(opt, iter);

        Assert.assertEquals("val1", opt.getValues()[0]);
        Assert.assertEquals("val2", opt.getValues()[1]);
        Assert.assertFalse(iter.hasNext());
    }

    @Test
    public void testProcessArgs_stopsAtNextOption() throws Exception {
        Option opt = OptionBuilder.hasArgs(2).create("f");
        options.addOption(opt);
        options.addOption("next", false, "next option");

        List<String> list = new ArrayList<String>(Arrays.asList("val1", "-next"));
        ListIterator<String> iter = list.listIterator();

        parser.setOptions(options);
        parser.processArgs(opt, iter);

        Assert.assertEquals(1, opt.getValues().length);
        Assert.assertEquals("val1", opt.getValues()[0]);
        Assert.assertTrue(iter.hasNext());
        Assert.assertEquals("-next", iter.next());
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgs_missingRequiredArgument_throwsException() throws Exception {
        Option opt = OptionBuilder.hasArg().create("f");
        options.addOption(opt);

        List<String> list = new ArrayList<String>();
        ListIterator<String> iter = list.listIterator();

        parser.setOptions(options);
        parser.processArgs(opt, iter);
    }

    @Test
    public void testProcessArgs_optionalArgumentMissing_success() throws Exception {
        Option opt = OptionBuilder.hasOptionalArg().create("f");
        options.addOption(opt);

        List<String> list = new ArrayList<String>();
        ListIterator<String> iter = list.listIterator();

        parser.setOptions(options);
        parser.processArgs(opt, iter);

        Assert.assertNull(opt.getValues());
    }

    @Test
    public void testProcessArgs_addValueThrowsRuntimeException_breaks() throws Exception {
        Option opt = new Option("f", true, "desc") {
            private int count = 0;
            @Override
            public boolean addValue(String value) {
                if (count++ > 0) {
                    throw new RuntimeException("Limit reached");
                }
                return super.addValue(value);
            }
        };
        opt.setArgs(2);
        options.addOption(opt);

        List<String> list = new ArrayList<String>(Arrays.asList("val1", "val2"));
        ListIterator<String> iter = list.listIterator();

        parser.setOptions(options);
        parser.processArgs(opt, iter);

        Assert.assertEquals(1, opt.getValues().length);
        Assert.assertEquals("val1", opt.getValues()[0]);
        Assert.assertTrue(iter.hasNext());
        Assert.assertEquals("val2", iter.next());
    }

    @Test
    public void testProcessProperties_variousCases() throws Exception {
        Option argOpt = OptionBuilder.hasArg().create("p1");
        Option booleanOpt1 = OptionBuilder.create("p2");
        Option booleanOpt2 = OptionBuilder.create("p3");
        Option booleanOpt3 = OptionBuilder.create("p4");
        Option booleanOptInvalid = OptionBuilder.create("p5");

        options.addOption(argOpt);
        options.addOption(booleanOpt1);
        options.addOption(booleanOpt2);
        options.addOption(booleanOpt3);
        options.addOption(booleanOptInvalid);

        Properties props = new Properties();
        props.setProperty("p1", "value1");
        props.setProperty("p2", "yes");
        props.setProperty("p3", "true");
        props.setProperty("p4", "1");
        props.setProperty("p5", "no");

        CommandLine cl = parser.parse(options, new String[]{}, props);

        Assert.assertTrue(cl.hasOption("p1"));
        Assert.assertEquals("value1", cl.getOptionValue("p1"));
        Assert.assertTrue(cl.hasOption("p2"));
        Assert.assertTrue(cl.hasOption("p3"));
        Assert.assertTrue(cl.hasOption("p4"));
        Assert.assertFalse(cl.hasOption("p5"));
    }

    @Test
    public void testProcessProperties_nullProperties_noOp() throws Exception {
        CommandLine cl = parser.parse(options, new String[]{}, null);
        Assert.assertNotNull(cl);
        Assert.assertEquals(0, cl.getOptions().length);
    }

    @Test
    public void testProcessProperties_optionAlreadyPresentInCmd_ignored() throws Exception {
        Option opt = OptionBuilder.hasArg().create("p");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("p", "propVal");

        CommandLine cl = parser.parse(options, new String[]{"-p", "cliVal"}, props);
        Assert.assertEquals("cliVal", cl.getOptionValue("p"));
    }

    @Test
    public void testProcessProperties_propertyOptionThrowsRuntimeException_handled() throws Exception {
        Option opt = new Option("p", true, "desc") {
            @Override
            public boolean addValue(String value) {
                throw new RuntimeException("Cannot add value");
            }
        };
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("p", "propVal");

        CommandLine cl = parser.parse(options, new String[]{}, props);
        Assert.assertTrue(cl.hasOption("p"));
        Assert.assertNull(cl.getOptionValue("p"));
    }

    @Test
    public void testGettersAndSetters() {
        parser.setOptions(options);
        Assert.assertSame(options, parser.getOptions());
        Assert.assertNotNull(parser.getRequiredOptions());
        Assert.assertTrue(parser.getRequiredOptions().isEmpty());
    }
}
