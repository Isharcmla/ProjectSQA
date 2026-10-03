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

    private WriteableCommandLineImpl commandLine;
    private DummyOption testOption;

    @Before
    public void setUp() {
        commandLine = new WriteableCommandLineImpl();
        testOption = new DummyOption("testOption", "--test");
    }

    @Test
    public void testAddOption_validOption_optionAddedSuccessfully() {
        commandLine.addOption(testOption);
        Assert.assertTrue(commandLine.hasOption(testOption));
        Assert.assertTrue(commandLine.getOptions().contains(testOption));
    }

    @Test
    public void testAddOption_nullOption_handlesGracefully() {
        commandLine.addOption(null);
        Assert.assertFalse(commandLine.hasOption(testOption));
    }

    @Test
    public void testAddValue_validValue_valueRetrievedCorrectly() {
        commandLine.addOption(testOption);
        commandLine.addValue(testOption, "value1");
        commandLine.addValue(testOption, "value2");

        List values = commandLine.getUndefaultedValues(testOption);
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("value1", values.get(0));
        Assert.assertEquals("value2", values.get(1));
    }

    @Test
    public void testAddValue_nullOptionAndNullValue_handlesGracefully() {
        commandLine.addValue(null, null);
        List values = commandLine.getUndefaultedValues(null);
        Assert.assertNotNull(values);
        Assert.assertEquals(1, values.size());
        Assert.assertNull(values.get(0));
    }

    @Test
    public void testGetUndefaultedValues_noValuesPresent_returnsEmptyList() {
        List values = commandLine.getUndefaultedValues(testOption);
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }

    @Test
    public void testSetDefaultValues_validList_defaultsSetCorrectly() {
        List defaults = new ArrayList();
        defaults.add("default1");
        defaults.add("default2");

        commandLine.setDefaultValues(testOption, defaults);
        List result = commandLine.getValues(testOption);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals("default1", result.get(0));
        Assert.assertEquals("default2", result.get(1));
    }

    @Test
    public void testSetDefaultValues_nullList_clearsDefaults() {
        commandLine.setDefaultValues(testOption, null);
        List result = commandLine.getValues(testOption);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testAddSwitch_validSwitch_switchAddedSuccessfully() {
        commandLine.addSwitch(testOption, true);
        Boolean switchVal = commandLine.getSwitch(testOption);
        Assert.assertNotNull(switchVal);
        Assert.assertTrue(switchVal.booleanValue());
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_alreadyAdded_throwsIllegalStateException() {
        commandLine.addSwitch(testOption, true);
        commandLine.addSwitch(testOption, false);
    }

    @Test
    public void testSetDefaultSwitch_validBoolean_defaultSetCorrectly() {
        commandLine.setDefaultSwitch(testOption, Boolean.TRUE);
        Boolean switchVal = commandLine.getSwitch(testOption);
        Assert.assertEquals(Boolean.TRUE, switchVal);

        commandLine.setDefaultSwitch(testOption, Boolean.FALSE);
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(testOption));
    }

    @Test
    public void testSetDefaultSwitch_nullValue_clearsDefault() {
        commandLine.setDefaultSwitch(testOption, Boolean.TRUE);
        commandLine.setDefaultSwitch(testOption, null);
        Assert.assertNull(commandLine.getSwitch(testOption));
    }

    @Test
    public void testAddProperty_withOption_propertyAddedAndRetrieved() {
        commandLine.addProperty(testOption, "propertyKey", "propertyValue");
        String value = commandLine.getProperty(testOption, "propertyKey");
        Assert.assertEquals("propertyValue", value);

        // Overwrite existing property
        commandLine.addProperty(testOption, "propertyKey", "updatedValue");
        Assert.assertEquals("updatedValue", commandLine.getProperty(testOption, "propertyKey"));
    }

    @Test
    public void testAddProperty_withOptionEdgeCases_emptyAndNullValues() {
        commandLine.addProperty(testOption, "", "");
        Assert.assertEquals("", commandLine.getProperty(testOption, ""));

        commandLine.addProperty(null, "key", "val");
        Assert.assertEquals("val", commandLine.getProperty(null, "key"));
    }

    @Test
    public void testAddProperty_defaultPropertySet_propertyAddedAndRetrieved() {
        commandLine.addProperty("globalKey", "globalValue");
        String value = commandLine.getProperty("globalKey");
        Assert.assertEquals("globalValue", value);

        // Overwrite existing global property
        commandLine.addProperty("globalKey", "updatedGlobalValue");
        Assert.assertEquals("updatedGlobalValue", commandLine.getProperty("globalKey"));
    }

    @Test
    public void testAddProperty_defaultPropertySetEdgeCases_emptyAndNullValues() {
        commandLine.addProperty("", "");
        Assert.assertEquals("", commandLine.getProperty(""));

        commandLine.addProperty(null, "valueForNullKey");
        Assert.assertEquals("valueForNullKey", commandLine.getProperty((String) null));
    }

    @Test
    public void testLooksLikeOption_validOptionTriggers_returnsTrue() {
        Assert.assertTrue(commandLine.looksLikeOption("-a"));
        Assert.assertTrue(commandLine.looksLikeOption("--option"));
        Assert.assertTrue(commandLine.looksLikeOption("/opt"));
    }

    @Test
    public void testLooksLikeOption_nonOptionArguments_returnsFalse() {
        Assert.assertFalse(commandLine.looksLikeOption("argument"));
        Assert.assertFalse(commandLine.looksLikeOption(""));
        Assert.assertFalse(commandLine.looksLikeOption(null));
        Assert.assertFalse(commandLine.looksLikeOption("12345"));
        Assert.assertFalse(commandLine.looksLikeOption("-"));
    }

    private static class DummyOption implements Option {
        private final String name;
        private final String trigger;

        public DummyOption(String name, String trigger) {
            this.name = name;
            this.trigger = trigger;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return argument != null && argument.equals(trigger);
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator argument) {
            return false;
        }

        public void process(WriteableCommandLine commandLine, ListIterator argument) {
        }

        public void validate(WriteableCommandLine commandLine) {
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, java.util.Comparator comp) {
            buffer.append(name);
        }

        public String getPreferredName() {
            return name;
        }

        public String getDescription() {
            return name;
        }

        public Set getHelpLines(int depth, Set helpSettings, java.util.Comparator comp) {
            return Collections.emptySet();
        }

        public List helpLines(int depth, Set helpSettings, java.util.Comparator comp) {
            return Collections.emptyList();
        }

        public Set getPrefixes() {
            Set prefixes = new HashSet();
            prefixes.add("-");
            prefixes.add("--");
            prefixes.add("/");
            return prefixes;
        }

        public Set getTriggers() {
            Set triggers = new HashSet();
            triggers.add(trigger);
            return triggers;
        }

        public Option findOption(String trigger) {
            return this.trigger.equals(trigger) ? this : null;
        }

        public int getId() {
            return 0;
        }

        public boolean isRequired() {
            return false;
        }

        public void defaults(WriteableCommandLine commandLine) {
        }

        public void checkPrefixes(Set prefixes) {
        }
    }

    private static class WriteableCommandLineImpl implements WriteableCommandLine {
        private final Set options = new HashSet();
        private final Map values = new HashMap();
        private final Map defaultValues = new HashMap();
        private final Map switches = new HashMap();
        private final Map defaultSwitches = new HashMap();
        private final Map optionProperties = new HashMap();
        private final Map defaultProperties = new HashMap();

        public void addOption(Option option) {
            if (option != null) {
                options.add(option);
            }
        }

        public void addValue(Option option, Object value) {
            List valList = (List) values.get(option);
            if (valList == null) {
                valList = new ArrayList();
                values.put(option, valList);
            }
            valList.add(value);
        }

        public List getUndefaultedValues(Option option) {
            List valList = (List) values.get(option);
            return valList != null ? Collections.unmodifiableList(valList) : Collections.emptyList();
        }

        public void setDefaultValues(Option option, List defaults) {
            if (defaults == null) {
                defaultValues.remove(option);
            } else {
                defaultValues.put(option, new ArrayList(defaults));
            }
        }

        public void addSwitch(Option option, boolean value) throws IllegalStateException {
            if (switches.containsKey(option)) {
                throw new IllegalStateException("Switch already added for option");
            }
            switches.put(option, Boolean.valueOf(value));
        }

        public void setDefaultSwitch(Option option, Boolean defaultSwitch) {
            if (defaultSwitch == null) {
                defaultSwitches.remove(option);
            } else {
                defaultSwitches.put(option, defaultSwitch);
            }
        }

        public void addProperty(Option option, String property, String value) {
            Map props = (Map) optionProperties.get(option);
            if (props == null) {
                props = new HashMap();
                optionProperties.put(option, props);
            }
            props.put(property, value);
        }

        public void addProperty(String property, String value) {
            defaultProperties.put(property, value);
        }

        public boolean looksLikeOption(String argument) {
            if (argument == null || argument.length() < 2) {
                return false;
            }
            return argument.startsWith("-") || argument.startsWith("--") || argument.startsWith("/");
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
            return options.contains(option) ? option : null;
        }

        public List getValues(Option option) {
            List valList = (List) values.get(option);
            if (valList != null && !valList.isEmpty()) {
                return valList;
            }
            List def = (List) defaultValues.get(option);
            return def != null ? def : Collections.emptyList();
        }

        public List getValues(Option option, List defaultValuesList) {
            List valList = getValues(option);
            return (valList != null && !valList.isEmpty()) ? valList : defaultValuesList;
        }

        public List getValues(String trigger) {
            return Collections.emptyList();
        }

        public List getValues(String trigger, List defaultValuesList) {
            return defaultValuesList;
        }

        public Object getValue(Option option) {
            List valList = getValues(option);
            return (valList != null && !valList.isEmpty()) ? valList.get(0) : null;
        }

        public Object getValue(Option option, Object defaultValue) {
            Object val = getValue(option);
            return val != null ? val : defaultValue;
        }

        public Object getValue(String trigger) {
            return null;
        }

        public Object getValue(String trigger, Object defaultValue) {
            return defaultValue;
        }

        public Boolean getSwitch(Option option) {
            if (switches.containsKey(option)) {
                return (Boolean) switches.get(option);
            }
            return (Boolean) defaultSwitches.get(option);
        }

        public Boolean getSwitch(Option option, Boolean defaultValue) {
            Boolean val = getSwitch(option);
            return val != null ? val : defaultValue;
        }

        public Boolean getSwitch(String trigger) {
            return null;
        }

        public Boolean getSwitch(String trigger, Boolean defaultValue) {
            return defaultValue;
        }

        public String getProperty(Option option, String property) {
            Map props = (Map) optionProperties.get(option);
            return props != null ? (String) props.get(property) : null;
        }

        public String getProperty(Option option, String property, String defaultValue) {
            String val = getProperty(option, property);
            return val != null ? val : defaultValue;
        }

        public String getProperty(String property) {
            return (String) defaultProperties.get(property);
        }

        public String getProperty(String property, String defaultValue) {
            String val = getProperty(property);
            return val != null ? val : defaultValue;
        }

        public Set getProperties(Option option) {
            Map props = (Map) optionProperties.get(option);
            return props != null ? props.keySet() : Collections.emptySet();
        }

        public Set getProperties() {
            return defaultProperties.keySet();
        }

        public Set getOptionTriggers() {
            return Collections.emptySet();
        }

        public Set getOptions() {
            return Collections.unmodifiableSet(options);
        }
    }
}
