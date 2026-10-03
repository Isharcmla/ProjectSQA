package org.apache.commons.cli2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteableCommandLineTest {

    private WriteableCommandLine commandLine;

    private static class StubOption implements Option {
        private final String trigger;

        StubOption(String trigger) {
            this.trigger = trigger;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return false;
        }

        public void process(WriteableCommandLine commandLine, java.util.ListIterator arguments) {
        }

        public void validate(WriteableCommandLine commandLine) {
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, java.util.Comparator comp) {
        }

        public String getPreferredName() {
            return trigger;
        }

        public String getDescription() {
            return "";
        }

        public Set getPrefixes() {
            return Collections.emptySet();
        }

        public Set getTriggers() {
            return trigger == null ? Collections.emptySet() : Collections.singleton(trigger);
        }

        public boolean isRequired() {
            return false;
        }

        public int getId() {
            return 0;
        }

        public Option findOption(String trigger) {
            return null;
        }

        public boolean checkPrefixes(Set prefixes) {
            return false;
        }

        public void helpLines(int depth, Set helpSettings, java.util.Comparator comp) {
        }
    }

    private static class TestWriteableCommandLine implements WriteableCommandLine {
        private final Set options = new HashSet();
        private final Map values = new HashMap();
        private final Map defaultValues = new HashMap();
        private final Map switches = new HashMap();
        private final Map defaultSwitches = new HashMap();
        private final Map properties = new HashMap();

        public void addOption(final Option option) {
            options.add(option);
        }

        public void addValue(final Option option, final Object value) {
            List list = (List) values.get(option);
            if (list == null) {
                list = new ArrayList();
                values.put(option, list);
            }
            list.add(value);
        }

        public void setDefaultValues(final Option option, final List defaultVals) {
            defaultValues.put(option, defaultVals);
        }

        public void addSwitch(final Option option, final boolean value) throws IllegalStateException {
            if (switches.containsKey(option)) {
                throw new IllegalStateException("Switch already exists for option: " + option);
            }
            switches.put(option, Boolean.valueOf(value));
        }

        public void setDefaultSwitch(final Option option, final Boolean defaultSwitch) {
            defaultSwitches.put(option, defaultSwitch);
        }

        public void addProperty(final String property, final String value) {
            properties.put(property, value);
        }

        public boolean looksLikeOption(final String argument) {
            return argument != null && argument.startsWith("-") && argument.length() > 1;
        }

        public boolean hasOption(Option option) {
            return options.contains(option);
        }

        public boolean hasOption(String trigger) {
            return false;
        }

        public Option getOption(String trigger) {
            return null;
        }

        public Option getOption(Option option) {
            return null;
        }

        public List getValues(Option option) {
            List list = (List) values.get(option);
            return list != null ? list : Collections.emptyList();
        }

        public List getValues(Option option, List defaultVal) {
            List list = (List) values.get(option);
            return (list != null && !list.isEmpty()) ? list : defaultVal;
        }

        public List getValues(String trigger) {
            return Collections.emptyList();
        }

        public List getValues(String trigger, List defaultVal) {
            return defaultVal;
        }

        public Object getValue(Option option) {
            List list = getValues(option);
            return list.isEmpty() ? null : list.get(0);
        }

        public Object getValue(Option option, Object defaultVal) {
            Object val = getValue(option);
            return val != null ? val : defaultVal;
        }

        public Object getValue(String trigger) {
            return null;
        }

        public Object getValue(String trigger, Object defaultVal) {
            return defaultVal;
        }

        public List getUndefaultedValues(Option option) {
            return getValues(option);
        }

        public Boolean getSwitch(Option option) {
            return (Boolean) switches.get(option);
        }

        public Boolean getSwitch(Option option, Boolean defaultVal) {
            Boolean val = getSwitch(option);
            return val != null ? val : defaultVal;
        }

        public Boolean getSwitch(String trigger) {
            return null;
        }

        public Boolean getSwitch(String trigger, Boolean defaultVal) {
            return defaultVal;
        }

        public String getProperty(String property) {
            return (String) properties.get(property);
        }

        public String getProperty(String property, String defaultVal) {
            String val = getProperty(property);
            return val != null ? val : defaultVal;
        }

        public Set getProperties() {
            return properties.keySet();
        }

        public Set getOptions() {
            return options;
        }

        public Set getOptionTriggers() {
            return Collections.emptySet();
        }
    }

    @Before
    public void setUp() {
        commandLine = new TestWriteableCommandLine();
    }

    @Test
    public void testCommandLineHierarchy_instanceOfCommandLine_returnsTrue() {
        Assert.assertTrue(commandLine instanceof CommandLine);
        Assert.assertTrue(commandLine instanceof WriteableCommandLine);
    }

    @Test
    public void testAddOption_validOption_optionAdded() {
        Option opt = new StubOption("--help");
        commandLine.addOption(opt);
        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertTrue(commandLine.getOptions().contains(opt));
    }

    @Test
    public void testAddOption_nullOption_handledCorrectly() {
        commandLine.addOption(null);
        Assert.assertTrue(commandLine.getOptions().contains(null));
    }

    @Test
    public void testAddValue_validValue_valueAdded() {
        Option opt = new StubOption("--file");
        commandLine.addValue(opt, "test.txt");
        List values = commandLine.getValues(opt);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("test.txt", values.get(0));
    }

    @Test
    public void testAddValue_multipleValues_valuesPreservedInOrder() {
        Option opt = new StubOption("--include");
        commandLine.addValue(opt, "src");
        commandLine.addValue(opt, "lib");
        commandLine.addValue(opt, "bin");

        List values = commandLine.getValues(opt);
        Assert.assertEquals(3, values.size());
        Assert.assertEquals("src", values.get(0));
        Assert.assertEquals("lib", values.get(1));
        Assert.assertEquals("bin", values.get(2));
    }

    @Test
    public void testAddValue_nullValue_addedSuccessfully() {
        Option opt = new StubOption("--opt");
        commandLine.addValue(opt, null);
        List values = commandLine.getValues(opt);
        Assert.assertEquals(1, values.size());
        Assert.assertNull(values.get(0));
    }

    @Test
    public void testAddValue_nullOption_addedSuccessfully() {
        commandLine.addValue(null, "valueForNullOption");
        List values = commandLine.getValues((Option) null);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("valueForNullOption", values.get(0));
    }

    @Test
    public void testSetDefaultValues_validList_defaultsSet() {
        Option opt = new StubOption("--port");
        List defaults = new ArrayList();
        defaults.add("8080");
        commandLine.setDefaultValues(opt, defaults);

        TestWriteableCommandLine testCmd = (TestWriteableCommandLine) commandLine;
        Assert.assertEquals(defaults, testCmd.defaultValues.get(opt));
    }

    @Test
    public void testSetDefaultValues_emptyList_defaultsSet() {
        Option opt = new StubOption("--port");
        commandLine.setDefaultValues(opt, Collections.emptyList());

        TestWriteableCommandLine testCmd = (TestWriteableCommandLine) commandLine;
        Assert.assertEquals(Collections.emptyList(), testCmd.defaultValues.get(opt));
    }

    @Test
    public void testSetDefaultValues_nullList_defaultsSet() {
        Option opt = new StubOption("--port");
        commandLine.setDefaultValues(opt, null);

        TestWriteableCommandLine testCmd = (TestWriteableCommandLine) commandLine;
        Assert.assertNull(testCmd.defaultValues.get(opt));
    }

    @Test
    public void testAddSwitch_trueValue_switchAdded() {
        Option opt = new StubOption("--verbose");
        commandLine.addSwitch(opt, true);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt));
    }

    @Test
    public void testAddSwitch_falseValue_switchAdded() {
        Option opt = new StubOption("--quiet");
        commandLine.addSwitch(opt, false);
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_duplicateSwitch_throwsIllegalStateException() {
        Option opt = new StubOption("--debug");
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testSetDefaultSwitch_trueValue_defaultSwitchSet() {
        Option opt = new StubOption("--color");
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);

        TestWriteableCommandLine testCmd = (TestWriteableCommandLine) commandLine;
        Assert.assertEquals(Boolean.TRUE, testCmd.defaultSwitches.get(opt));
    }

    @Test
    public void testSetDefaultSwitch_falseValue_defaultSwitchSet() {
        Option opt = new StubOption("--color");
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        TestWriteableCommandLine testCmd = (TestWriteableCommandLine) commandLine;
        Assert.assertEquals(Boolean.FALSE, testCmd.defaultSwitches.get(opt));
    }

    @Test
    public void testSetDefaultSwitch_nullValue_defaultSwitchSet() {
        Option opt = new StubOption("--color");
        commandLine.setDefaultSwitch(opt, null);

        TestWriteableCommandLine testCmd = (TestWriteableCommandLine) commandLine;
        Assert.assertNull(testCmd.defaultSwitches.get(opt));
    }

    @Test
    public void testAddProperty_validKeyAndValue_propertyAdded() {
        commandLine.addProperty("foo", "bar");
        Assert.assertEquals("bar", commandLine.getProperty("foo"));
    }

    @Test
    public void testAddProperty_overwriteExistingKey_valueUpdated() {
        commandLine.addProperty("key", "initial");
        Assert.assertEquals("initial", commandLine.getProperty("key"));

        commandLine.addProperty("key", "updated");
        Assert.assertEquals("updated", commandLine.getProperty("key"));
    }

    @Test
    public void testAddProperty_emptyKeyAndValue_propertyAdded() {
        commandLine.addProperty("", "");
        Assert.assertEquals("", commandLine.getProperty(""));
    }

    @Test
    public void testAddProperty_nullKeyAndValue_propertyAdded() {
        commandLine.addProperty(null, null);
        Assert.assertNull(commandLine.getProperty(null));
        Assert.assertTrue(commandLine.getProperties().contains(null));
    }

    @Test
    public void testLooksLikeOption_validOptionFormat_returnsTrue() {
        Assert.assertTrue(commandLine.looksLikeOption("-a"));
        Assert.assertTrue(commandLine.looksLikeOption("--help"));
        Assert.assertTrue(commandLine.looksLikeOption("-Dproperty=value"));
    }

    @Test
    public void testLooksLikeOption_nonOptionArgument_returnsFalse() {
        Assert.assertFalse(commandLine.looksLikeOption("fileName.txt"));
        Assert.assertFalse(commandLine.looksLikeOption("command"));
        Assert.assertFalse(commandLine.looksLikeOption("12345"));
    }

    @Test
    public void testLooksLikeOption_singleDash_returnsFalse() {
        Assert.assertFalse(commandLine.looksLikeOption("-"));
    }

    @Test
    public void testLooksLikeOption_emptyString_returnsFalse() {
        Assert.assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOption_nullArgument_returnsFalse() {
        Assert.assertFalse(commandLine.looksLikeOption(null));
    }
}
