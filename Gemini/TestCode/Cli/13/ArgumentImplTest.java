package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.validation.Validator;
import org.junit.Assert;
import org.junit.Test;

public class ArgumentImplTest {

    private static class DummyCommandLine implements WriteableCommandLine {
        private final Map values = new HashMap();
        private final Map defaultValues = new HashMap();
        private final Set optionLooks = new HashSet();

        public void addOption(Option option) {}

        public void addValue(Option option, Object value) {
            List list = (List) values.get(option);
            if (list == null) {
                list = new ArrayList();
                values.put(option, list);
            }
            list.add(value);
        }

        public void addProperty(Option option, String property, String value) {}
        public void addProperty(String property, String value) {}
        public void addSwitch(Option option, boolean value) {}
        public boolean hasOption(Option option) { return false; }
        public boolean hasOption(String trigger) { return false; }
        public Option getOption(String trigger) { return null; }
        public Option getOption(Option option) { return null; }

        public List getValues(Option option) {
            List list = (List) values.get(option);
            return list != null ? list : Collections.EMPTY_LIST;
        }

        public List getValues(Option option, List defaultValues) { return getValues(option); }
        public List getValues(String trigger) { return Collections.EMPTY_LIST; }
        public List getValues(String trigger, List defaultValues) { return Collections.EMPTY_LIST; }
        public Object getValue(Option option) { return null; }
        public Object getValue(Option option, Object defaultValue) { return null; }
        public Object getValue(String trigger) { return null; }
        public Object getValue(String trigger, Object defaultValue) { return null; }
        public Boolean getSwitch(Option option) { return null; }
        public Boolean getSwitch(Option option, Boolean defaultValue) { return null; }
        public Boolean getSwitch(String trigger) { return null; }
        public Boolean getSwitch(String trigger, Boolean defaultValue) { return null; }
        public String getProperty(String property) { return null; }
        public String getProperty(String property, String defaultValue) { return null; }
        public String getProperty(Option option, String property) { return null; }
        public String getProperty(Option option, String property, String defaultValue) { return null; }
        public Set getProperties() { return Collections.EMPTY_SET; }
        public Set getProperties(Option option) { return Collections.EMPTY_SET; }
        public Set getOptions() { return Collections.EMPTY_SET; }
        public Set getOptionNames() { return Collections.EMPTY_SET; }

        public boolean looksLikeOption(String trigger) {
            return optionLooks.contains(trigger);
        }

        public void setDefaultValues(Option option, List defaults) {
            if (defaults != null) {
                defaultValues.put(option, defaults);
            }
        }

        public void setDefaultSwitch(Option option, Boolean defaultSwitch) {}
        public List getUndeterminedOptions() { return Collections.EMPTY_LIST; }

        public void setOptionLooks(String trigger) {
            optionLooks.add(trigger);
        }

        public List getDefaultValues(Option option) {
            return (List) defaultValues.get(option);
        }
    }

    @Test
    public void testConstructor_normalValues() {
        List defaults = Arrays.asList("default1", "default2");
        ArgumentImpl argument = new ArgumentImpl(
                "argName", "argDesc", 1, 3, '=', ',', null, "--", defaults, 10
        );

        Assert.assertEquals("argName", argument.getPreferredName());
        Assert.assertEquals("argDesc", argument.getDescription());
        Assert.assertEquals(1, argument.getMinimum());
        Assert.assertEquals(3, argument.getMaximum());
        Assert.assertEquals('=', argument.getInitialSeparator());
        Assert.assertEquals(',', argument.getSubsequentSeparator());
        Assert.assertEquals("--", argument.getConsumeRemaining());
        Assert.assertEquals(defaults, argument.getDefaultValues());
        Assert.assertNull(argument.getValidator());
        Assert.assertEquals(10, argument.getId());
        Assert.assertTrue(argument.isRequired());
        Assert.assertTrue(argument.getPrefixes().isEmpty());
        Assert.assertTrue(argument.getTriggers().isEmpty());
    }

    @Test
    public void testConstructor_nullNameAndZeroMin() {
        ArgumentImpl argument = new ArgumentImpl(
                null, null, 0, 5, '\0', '\0', null, null, null, 0
        );

        Assert.assertEquals("arg", argument.getPreferredName());
        Assert.assertNull(argument.getDescription());
        Assert.assertEquals(0, argument.getMinimum());
        Assert.assertEquals(5, argument.getMaximum());
        Assert.assertFalse(argument.isRequired());
        Assert.assertEquals('\0', argument.getInitialSeparator());
        Assert.assertEquals('\0', argument.getSubsequentSeparator());
        Assert.assertNull(argument.getConsumeRemaining());
        Assert.assertNull(argument.getDefaultValues());
        Assert.assertNull(argument.getValidator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_minExceedsMax_throwsException() {
        new ArgumentImpl("test", "desc", 5, 2, '=', ',', null, "--", null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_tooFewDefaults_throwsException() {
        List defaults = Collections.singletonList("single");
        new ArgumentImpl("test", "desc", 2, 5, '=', ',', null, "--", defaults, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_tooManyDefaults_throwsException() {
        List defaults = Arrays.asList("1", "2", "3", "4");
        new ArgumentImpl("test", "desc", 1, 2, '=', ',', null, "--", defaults, 1);
    }

    @Test
    public void testConstructor_emptyDefaultsList_valid() {
        List defaults = Collections.emptyList();
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 2, 5, '=', ',', null, "--", defaults, 1);
        Assert.assertNotNull(argument);
        Assert.assertTrue(argument.getDefaultValues().isEmpty());
    }

    @Test
    public void testCanProcess() {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 1, '=', ',', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        Assert.assertTrue(argument.canProcess(cl, "any-arg"));
        Assert.assertTrue(argument.canProcess(cl, (String) null));
    }

    @Test
    public void testStripBoundaryQuotes() {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 1, '=', ',', null, "--", null, 1);
        Assert.assertEquals("hello", argument.stripBoundaryQuotes("\"hello\""));
        Assert.assertEquals("\"hello", argument.stripBoundaryQuotes("\"hello"));
        Assert.assertEquals("hello\"", argument.stripBoundaryQuotes("hello\""));
        Assert.assertEquals("hello", argument.stripBoundaryQuotes("hello"));
        Assert.assertEquals("", argument.stripBoundaryQuotes("\"\""));
    }

    @Test
    public void testProcessValues_normalValuesWithoutSplit() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 2, '\0', '\0', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        List argsList = new ArrayList(Arrays.asList("\"val1\"", "val2", "val3"));
        ListIterator it = argsList.listIterator();

        argument.process(cl, it);

        List values = cl.getValues(argument);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("val1", values.get(0));
        Assert.assertEquals("val2", values.get(1));
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("val3", it.next());
    }

    @Test
    public void testProcessValues_consumeRemaining() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        List argsList = new ArrayList(Arrays.asList("--", "-opt1", "val2"));
        ListIterator it = argsList.listIterator();

        argument.processValues(cl, it, argument);

        List values = cl.getValues(argument);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("-opt1", values.get(0));
        Assert.assertEquals("val2", values.get(1));
    }

    @Test
    public void testProcessValues_looksLikeOptionBreaks() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setOptionLooks("-flag");

        List argsList = new ArrayList(Arrays.asList("val1", "-flag", "val2"));
        ListIterator it = argsList.listIterator();

        argument.processValues(cl, it, argument);

        List values = cl.getValues(argument);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("val1", values.get(0));
        Assert.assertEquals("-flag", it.next());
    }

    @Test
    public void testProcessValues_subsequentSplitSuccess() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 4, '\0', ',', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        List argsList = new ArrayList(Arrays.asList("a,b,c", "d"));
        ListIterator it = argsList.listIterator();

        argument.processValues(cl, it, argument);

        List values = cl.getValues(argument);
        Assert.assertEquals(4, values.size());
        Assert.assertEquals(Arrays.asList("a", "b", "c", "d"), values);
    }

    @Test(expected = OptionException.class)
    public void testProcessValues_subsequentSplitExceedsMax_throwsOptionException() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 2, '\0', ',', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        List argsList = new ArrayList(Collections.singletonList("a,b,c"));
        ListIterator it = argsList.listIterator();

        argument.processValues(cl, it, argument);
    }

    @Test
    public void testValidate_success() throws OptionException {
        Validator dummyValidator = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                if (values.contains("invalid")) {
                    throw new InvalidArgumentException("invalid detected");
                }
            }
        };

        ArgumentImpl argument = new ArgumentImpl("test", "desc", 1, 3, '\0', '\0', dummyValidator, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.addValue(argument, "valid1");
        cl.addValue(argument, "valid2");

        argument.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooFewValues_throwsOptionException() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 2, 3, '\0', '\0', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.addValue(argument, "onlyOne");

        argument.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooManyValues_throwsOptionException() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 1, 2, '\0', '\0', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.addValue(argument, "val1");
        cl.addValue(argument, "val2");
        cl.addValue(argument, "val3");

        argument.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_validatorThrowsInvalidArgumentException_throwsOptionException() throws OptionException {
        Validator failingValidator = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                throw new InvalidArgumentException("validation failed");
            }
        };

        ArgumentImpl argument = new ArgumentImpl("test", "desc", 1, 2, '\0', '\0', failingValidator, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.addValue(argument, "val1");

        argument.validate(cl);
    }

    @Test
    public void testValidate_nullValidator() throws OptionException {
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 2, '\0', '\0', null, "--", null, 1);
        DummyCommandLine cl = new DummyCommandLine();
        argument.validate(cl);
    }

    @Test
    public void testDefaults() {
        List defaultVals = Arrays.asList("def1", "def2");
        ArgumentImpl argument = new ArgumentImpl("test", "desc", 0, 2, '\0', '\0', null, "--", defaultVals, 1);
        DummyCommandLine cl = new DummyCommandLine();

        argument.defaults(cl);

        Assert.assertEquals(defaultVals, cl.getDefaultValues(argument));
    }

    @Test
    public void testHelpLines() {
        ArgumentImpl argument = new ArgumentImpl("testArg", "description of testArg", 0, 1, '\0', '\0', null, "--", null, 1);
        List helpLines = argument.helpLines(2, Collections.EMPTY_SET, null);

        Assert.assertNotNull(helpLines);
        Assert.assertEquals(1, helpLines.size());
        HelpLine helpLine = (HelpLine) helpLines.get(0);
        Assert.assertEquals(2, helpLine.getIndent());
        Assert.assertSame(argument, helpLine.getOption());
    }

    @Test
    public void testAppendUsage_allCombinations() {
        // Case 1: Simple required argument, no special settings
        ArgumentImpl arg1 = new ArgumentImpl("target", "desc", 1, 1, '\0', '\0', null, "--", null, 1);
        StringBuffer buffer1 = new StringBuffer();
        arg1.appendUsage(buffer1, Collections.EMPTY_SET, null);
        Assert.assertEquals("target", buffer1.toString());

        // Case 2: Bracketed & Numbered & Optional with multiple args
        ArgumentImpl arg2 = new ArgumentImpl("file", "desc", 1, 3, '\0', '\0', null, "--", null, 1);
        Set settings2 = new HashSet();
        settings2.add(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);
        settings2.add(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        settings2.add(DisplaySetting.DISPLAY_OPTIONAL);

        StringBuffer buffer2 = new StringBuffer();
        arg2.appendUsage(buffer2, settings2, null);
        Assert.assertEquals("<file1> [<file2>] [<file3>]", buffer2.toString());

        // Case 3: Infinite maximum (Integer.MAX_VALUE), optional, bracketed
        ArgumentImpl arg3 = new ArgumentImpl("item", "desc", 0, Integer.MAX_VALUE, '\0', '\0', null, "--", null, 1);
        Set settings3 = new HashSet();
        settings3.add(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);
        settings3.add(DisplaySetting.DISPLAY_OPTIONAL);

        StringBuffer buffer3 = new StringBuffer();
        arg3.appendUsage(buffer3, settings3, null);
        Assert.assertEquals("[<item>] [<item>] ...", buffer3.toString());

        // Case 4: Infinite maximum with minimum 1, not numbered, no bracket
        ArgumentImpl arg4 = new ArgumentImpl("path", "desc", 1, Integer.MAX_VALUE, '\0', '\0', null, "--", null, 1);
        Set settings4 = new HashSet();
        settings4.add(DisplaySetting.DISPLAY_OPTIONAL);

        StringBuffer buffer4 = new StringBuffer();
        arg4.appendUsage(buffer4, settings4, null);
        Assert.assertEquals("path [path] ...", buffer4.toString());

        // Case 5: Multiple arguments, minimum = 0, no optional display setting
        ArgumentImpl arg5 = new ArgumentImpl("param", "desc", 0, 2, '\0', '\0', null, "--", null, 1);
        StringBuffer buffer5 = new StringBuffer();
        arg5.appendUsage(buffer5, Collections.EMPTY_SET, null);
        Assert.assertEquals("param [param]", buffer5.toString());
    }

    @Test
    public void testGettersAndConstants() {
        Assert.assertEquals('\0', ArgumentImpl.DEFAULT_INITIAL_SEPARATOR);
        Assert.assertEquals('\0', ArgumentImpl.DEFAULT_SUBSEQUENT_SEPARATOR);
        Assert.assertEquals("--", ArgumentImpl.DEFAULT_CONSUME_REMAINING);

        Validator v = new Validator() {
            public void validate(List values) {}
        };
        ArgumentImpl arg = new ArgumentImpl("name", "desc", 2, 4, ':', ';', v, "---", null, 42);

        Assert.assertEquals("name", arg.getPreferredName());
        Assert.assertEquals("desc", arg.getDescription());
        Assert.assertEquals(2, arg.getMinimum());
        Assert.assertEquals(4, arg.getMaximum());
        Assert.assertEquals(':', arg.getInitialSeparator());
        Assert.assertEquals(';', arg.getSubsequentSeparator());
        Assert.assertSame(v, arg.getValidator());
        Assert.assertEquals("---", arg.getConsumeRemaining());
        Assert.assertTrue(arg.isRequired());
    }
}
