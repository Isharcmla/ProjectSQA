package org.apache.commons.cli2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link WriteableCommandLine}.
 *
 * NOTE: Because {@link WriteableCommandLine} (and the {@link CommandLine}
 * interface it extends) do not have a provided concrete implementation in
 * this exercise, and because mocking frameworks are not allowed, a minimal
 * self-contained stub implementation ({@link StubWriteableCommandLine}) is
 * defined below purely to allow exercising the public API declared in
 * {@link WriteableCommandLine}. The inherited {@link CommandLine} methods
 * are implemented with simple, best-effort bodies only so that the class
 * compiles; they are not the focus of these tests. The {@code Option}
 * parameter type is only ever referenced via {@code null} in these tests,
 * since the {@code Option} interface's own API is not provided and must
 * not be guessed.
 */
public class WriteableCommandLineTest {

    /**
     * Minimal stub implementation of WriteableCommandLine for testing
     * purposes only.
     */
    private static class StubWriteableCommandLine implements WriteableCommandLine {

        private final List options = new ArrayList();
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
                throw new IllegalStateException("switch already added for option");
            }
            switches.put(option, Boolean.valueOf(value));
        }

        public void setDefaultSwitch(final Option option, final Boolean defaultSwitch) {
            defaultSwitches.put(option, defaultSwitch);
        }

        public void addProperty(final String property, final String value) {
            if (property == null) {
                throw new NullPointerException("property is null");
            }
            properties.put(property, value);
        }

        public boolean looksLikeOption(final String argument) {
            if (argument == null) {
                return false;
            }
            return argument.startsWith("-");
        }

        // ---- Test accessors ----
        List getOptionsList() {
            return options;
        }

        List getValuesFor(final Option option) {
            List list = (List) values.get(option);
            return list == null ? new ArrayList() : list;
        }

        List getDefaultValuesFor(final Option option) {
            return (List) defaultValues.get(option);
        }

        Boolean getSwitchFor(final Option option) {
            return (Boolean) switches.get(option);
        }

        Boolean getDefaultSwitchFor(final Option option) {
            return (Boolean) defaultSwitches.get(option);
        }

        String getPropertyValue(final String property) {
            return (String) properties.get(property);
        }

        // ---- Minimal CommandLine method implementations (best-effort) ----

        public boolean hasOption(final String trigger) {
            return false;
        }

        public boolean hasOption(final Option option) {
            return options.contains(option);
        }

        public Object getValue(final String trigger, final Object defaultValue) {
            return defaultValue;
        }

        public Object getValue(final Option option, final Object defaultValue) {
            List list = (List) values.get(option);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return defaultValue;
        }

        public Object getValue(final String trigger) {
            return null;
        }

        public Object getValue(final Option option) {
            return getValue(option, null);
        }

        public List getValues(final String trigger, final List defaultVals) {
            return defaultVals;
        }

        public List getValues(final Option option, final List defaultVals) {
            List list = (List) values.get(option);
            if (list == null) {
                return defaultVals;
            }
            return list;
        }

        public List getValues(final String trigger) {
            return new ArrayList();
        }

        public List getValues(final Option option) {
            List list = (List) values.get(option);
            return list == null ? new ArrayList() : list;
        }

        public Boolean getSwitch(final String trigger, final Boolean defaultValue) {
            return defaultValue;
        }

        public Boolean getSwitch(final Option option, final Boolean defaultValue) {
            Boolean value = (Boolean) switches.get(option);
            return value == null ? defaultValue : value;
        }

        public Boolean getSwitch(final String trigger) {
            return null;
        }

        public Boolean getSwitch(final Option option) {
            return getSwitch(option, null);
        }

        public int getOptionCount(final String trigger) {
            return 0;
        }

        public int getOptionCount(final Option option) {
            return options.contains(option) ? 1 : 0;
        }

        public List getOptions() {
            return options;
        }

        public Set getOptionTriggers() {
            return new HashSet();
        }

        public String getProperty(final String property) {
            return (String) properties.get(property);
        }

        public String getProperty(final String property, final String defaultValue) {
            String value = (String) properties.get(property);
            return value == null ? defaultValue : value;
        }

        public Set getProperties() {
            return new HashSet(properties.keySet());
        }

        public List getArguments() {
            return new ArrayList();
        }

        public Option getOption(final String trigger) {
            return null;
        }
    }

    private StubWriteableCommandLine commandLine;

    @Before
    public void setUp() {
        commandLine = new StubWriteableCommandLine();
    }

    // ---------------- addOption ----------------

    @Test
    public void testAddOption_normalOption_addedSuccessfully() {
        Option option = null; // Option API not provided; using null as a valid placeholder token
        commandLine.addOption(option);
        assertEquals(1, commandLine.getOptionsList().size());
    }

    @Test
    public void testAddOption_multipleOptions_allAdded() {
        commandLine.addOption(null);
        commandLine.addOption(null);
        assertEquals(2, commandLine.getOptionsList().size());
    }

    @Test
    public void testAddOption_nullOption_edgeCaseAcceptedByStub() {
        commandLine.addOption(null);
        assertTrue(commandLine.getOptionsList().contains(null));
    }

    // ---------------- addValue ----------------

    @Test
    public void testAddValue_normalValue_storedCorrectly() {
        Option option = null;
        commandLine.addValue(option, "value1");
        List result = commandLine.getValuesFor(option);
        assertEquals(1, result.size());
        assertEquals("value1", result.get(0));
    }

    @Test
    public void testAddValue_multipleValuesSameOption_allStoredInOrder() {
        Option option = null;
        commandLine.addValue(option, "first");
        commandLine.addValue(option, "second");
        List result = commandLine.getValuesFor(option);
        assertEquals(2, result.size());
        assertEquals("first", result.get(0));
        assertEquals("second", result.get(1));
    }

    @Test
    public void testAddValue_nullValue_edgeCaseAccepted() {
        Option option = null;
        commandLine.addValue(option, null);
        List result = commandLine.getValuesFor(option);
        assertEquals(1, result.size());
        assertNull(result.get(0));
    }

    // ---------------- setDefaultValues ----------------

    @Test
    public void testSetDefaultValues_normalList_storedCorrectly() {
        Option option = null;
        List defaults = new ArrayList();
        defaults.add("default1");
        commandLine.setDefaultValues(option, defaults);
        assertEquals(defaults, commandLine.getDefaultValuesFor(option));
    }

    @Test
    public void testSetDefaultValues_emptyList_edgeCaseStoredAsEmpty() {
        Option option = null;
        List defaults = new ArrayList();
        commandLine.setDefaultValues(option, defaults);
        assertTrue(commandLine.getDefaultValuesFor(option).isEmpty());
    }

    @Test
    public void testSetDefaultValues_nullList_edgeCaseAccepted() {
        Option option = null;
        commandLine.setDefaultValues(option, null);
        assertNull(commandLine.getDefaultValuesFor(option));
    }

    // ---------------- addSwitch ----------------

    @Test
    public void testAddSwitch_normalSwitch_storedCorrectly() {
        Option option = null;
        commandLine.addSwitch(option, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitchFor(option));
    }

    @Test
    public void testAddSwitch_falseValue_storedCorrectly() {
        Option option = null;
        commandLine.addSwitch(option, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitchFor(option));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_alreadyAddedSameOption_throwsIllegalStateException() {
        Option option = null;
        commandLine.addSwitch(option, true);
        // Adding the switch again for the same option should throw as per contract
        commandLine.addSwitch(option, false);
    }

    @Test
    public void testAddSwitch_illegalStateExceptionCaught_verifiedManually() {
        Option option = null;
        commandLine.addSwitch(option, true);
        try {
            commandLine.addSwitch(option, true);
            fail("Expected IllegalStateException was not thrown");
        } catch (IllegalStateException expected) {
            // expected behavior
            assertTrue(true);
        }
    }

    // ---------------- setDefaultSwitch ----------------

    @Test
    public void testSetDefaultSwitch_normalBooleanTrue_storedCorrectly() {
        Option option = null;
        commandLine.setDefaultSwitch(option, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getDefaultSwitchFor(option));
    }

    @Test
    public void testSetDefaultSwitch_normalBooleanFalse_storedCorrectly() {
        Option option = null;
        commandLine.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.FALSE, commandLine.getDefaultSwitchFor(option));
    }

    @Test
    public void testSetDefaultSwitch_nullBoolean_edgeCaseAccepted() {
        Option option = null;
        commandLine.setDefaultSwitch(option, null);
        assertNull(commandLine.getDefaultSwitchFor(option));
    }

    // ---------------- addProperty ----------------

    @Test
    public void testAddProperty_normalPropertyAndValue_storedCorrectly() {
        commandLine.addProperty("myProperty", "myValue");
        assertEquals("myValue", commandLine.getPropertyValue("myProperty"));
    }

    @Test
    public void testAddProperty_replaceExistingValue_overwritesPreviousValue() {
        commandLine.addProperty("myProperty", "firstValue");
        commandLine.addProperty("myProperty", "secondValue");
        assertEquals("secondValue", commandLine.getPropertyValue("myProperty"));
    }

    @Test
    public void testAddProperty_emptyStringValue_edgeCaseStoredAsEmptyString() {
        commandLine.addProperty("emptyProp", "");
        assertEquals("", commandLine.getPropertyValue("emptyProp"));
    }

    @Test
    public void testAddProperty_nullValue_edgeCaseAcceptedAsNull() {
        commandLine.addProperty("nullValProp", null);
        assertNull(commandLine.getPropertyValue("nullValProp"));
    }

    @Test(expected = NullPointerException.class)
    public void testAddProperty_nullPropertyName_throwsNullPointerException() {
        commandLine.addProperty(null, "someValue");
    }

    // ---------------- looksLikeOption ----------------

    @Test
    public void testLooksLikeOption_argumentStartingWithDash_returnsTrue() {
        assertTrue(commandLine.looksLikeOption("-verbose"));
    }

    @Test
    public void testLooksLikeOption_argumentNotStartingWithDash_returnsFalse() {
        assertFalse(commandLine.looksLikeOption("verbose"));
    }

    @Test
    public void testLooksLikeOption_emptyStringArgument_edgeCaseReturnsFalse() {
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOption_nullArgument_edgeCaseReturnsFalse() {
        assertFalse(commandLine.looksLikeOption(null));
    }

    @Test
    public void testLooksLikeOption_doubleDashArgument_returnsTrue() {
        assertTrue(commandLine.looksLikeOption("--long-option"));
    }
}
