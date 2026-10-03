package org.apache.commons.cli2.commandline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class WriteableCommandLineImplTest {

    private static class DummyOption implements Option {
        private final String preferredName;
        private final Set triggers;
        private final Set prefixes;

        public DummyOption(String preferredName, Set triggers, Set prefixes) {
            this.preferredName = preferredName;
            this.triggers = triggers != null ? triggers : Collections.EMPTY_SET;
            this.prefixes = prefixes != null ? prefixes : Collections.EMPTY_SET;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return false;
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            return false;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) {
        }

        public void validate(WriteableCommandLine commandLine) {
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return "Dummy description";
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return Collections.EMPTY_LIST;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public Set getTriggers() {
            return triggers;
        }

        public Option findOption(String trigger) {
            return triggers.contains(trigger) || preferredName.equals(trigger) ? this : null;
        }

        public void checkPrefixes(Set prefixes) {
        }

        public boolean isRequired() {
            return false;
        }

        public int getId() {
            return 0;
        }
    }

    private static class DummyArgument extends DummyOption implements Argument {
        public DummyArgument(String preferredName, Set triggers, Set prefixes) {
            super(preferredName, triggers, prefixes);
        }

        public String getInitialSeparator() {
            return "=";
        }

        public void defaultValues(WriteableCommandLine commandLine, Option option) {
        }

        public int getMinimum() {
            return 0;
        }

        public int getMaximum() {
            return 1;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return true;
        }
    }

    private DummyOption rootOption;
    private List arguments;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("--");
        prefixes.add("-");
        rootOption = new DummyOption("root", Collections.singleton("root"), prefixes);
        arguments = new ArrayList();
        arguments.add("--file");
        arguments.add("test file.txt");
        arguments.add("-v");
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    @Test
    public void testAddOption_andGetOption_andHasOption() {
        Set triggers = new HashSet();
        triggers.add("-f");
        triggers.add("--file");
        DummyOption opt = new DummyOption("--file", triggers, Collections.EMPTY_SET);

        assertFalse(commandLine.hasOption(opt));
        assertNull(commandLine.getOption("-f"));
        assertNull(commandLine.getOption("--file"));

        commandLine.addOption(opt);

        assertTrue(commandLine.hasOption(opt));
        assertSame(opt, commandLine.getOption("-f"));
        assertSame(opt, commandLine.getOption("--file"));
        assertEquals(1, commandLine.getOptions().size());
        assertTrue(commandLine.getOptions().contains(opt));
        assertTrue(commandLine.getOptionTriggers().contains("-f"));
        assertTrue(commandLine.getOptionTriggers().contains("--file"));
    }

    @Test
    public void testAddValue_regularOption() {
        DummyOption opt = new DummyOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addValue(opt, "val1");
        commandLine.addValue(opt, "val2");

        assertFalse(commandLine.hasOption(opt));
        List values = commandLine.getUndefaultedValues(opt);
        assertEquals(2, values.size());
        assertEquals("val1", values.get(0));
        assertEquals("val2", values.get(1));
    }

    @Test
    public void testAddValue_argumentOption_automaticallyAddsOption() {
        DummyArgument arg = new DummyArgument("arg", Collections.singleton("argTrigger"), Collections.EMPTY_SET);

        commandLine.addValue(arg, "argValue");

        assertTrue(commandLine.hasOption(arg));
        assertSame(arg, commandLine.getOption("argTrigger"));
        assertSame(arg, commandLine.getOption("arg"));
        assertEquals(Collections.singletonList("argValue"), commandLine.getUndefaultedValues(arg));
    }

    @Test
    public void testAddSwitch_successAndDuplicateException() {
        DummyOption switchOpt = new DummyOption("-s", Collections.singleton("-s"), Collections.EMPTY_SET);

        commandLine.addSwitch(switchOpt, true);
        assertTrue(commandLine.hasOption(switchOpt));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(switchOpt));

        try {
            commandLine.addSwitch(switchOpt, false);
            fail("Expected IllegalStateException when setting an already set switch");
        } catch (IllegalStateException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testAddSwitch_falseValue() {
        DummyOption switchOpt = new DummyOption("-f", Collections.singleton("-f"), Collections.EMPTY_SET);
        commandLine.addSwitch(switchOpt, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(switchOpt));
    }

    @Test
    public void testGetValues_combinations() {
        DummyOption opt = new DummyOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // 1. No values, no default supplied, no default configured -> EMPTY_LIST
        assertEquals(Collections.EMPTY_LIST, commandLine.getValues(opt));
        assertEquals(Collections.EMPTY_LIST, commandLine.getValues(opt, null));
        assertEquals(Collections.EMPTY_LIST, commandLine.getValues(opt, Collections.EMPTY_LIST));

        // 2. No values, default supplied in method
        List suppliedDefaults = Arrays.asList(new Object[]{"d1", "d2"});
        assertEquals(suppliedDefaults, commandLine.getValues(opt, suppliedDefaults));

        // 3. No values, default configured on commandLine
        List configuredDefaults = Arrays.asList(new Object[]{"cfg1", "cfg2", "cfg3"});
        commandLine.setDefaultValues(opt, configuredDefaults);
        assertEquals(configuredDefaults, commandLine.getValues(opt, null));
        assertEquals(configuredDefaults, commandLine.getValues(opt, Collections.EMPTY_LIST));

        // 4. Supplied default overrides configured default when value list is empty
        assertEquals(suppliedDefaults, commandLine.getValues(opt, suppliedDefaults));

        // 5. Value list present, size smaller than defaults -> augmented
        commandLine.addValue(opt, "v1");
        List result = commandLine.getValues(opt, configuredDefaults);
        assertEquals(3, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("cfg2", result.get(1));
        assertEquals("cfg3", result.get(2));

        // 6. Value list present, size >= defaults -> not augmented
        commandLine.addValue(opt, "v2");
        commandLine.addValue(opt, "v3");
        commandLine.addValue(opt, "v4");
        List result2 = commandLine.getValues(opt, configuredDefaults);
        assertEquals(4, result2.size());
        assertEquals("v1", result2.get(0));
        assertEquals("v2", result2.get(1));
        assertEquals("v3", result2.get(2));
        assertEquals("v4", result2.get(3));
    }

    @Test
    public void testGetUndefaultedValues_whenEmpty() {
        DummyOption opt = new DummyOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        assertEquals(Collections.EMPTY_LIST, commandLine.getUndefaultedValues(opt));
    }

    @Test
    public void testGetSwitch_hierarchyAndDefaults() {
        DummyOption opt = new DummyOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // 1. None set, default param is null, default switch is null -> null
        assertNull(commandLine.getSwitch(opt));
        assertNull(commandLine.getSwitch(opt, (Boolean) null));

        // 2. Default switch configured
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, (Boolean) null));

        // 3. Method defaultValue overrides configured default switch
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));

        // 4. Actual switch set overrides both
        commandLine.addSwitch(opt, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testSetDefaultSwitch_andSetDefaultValues_remove() {
        DummyOption opt = new DummyOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt));
        commandLine.setDefaultSwitch(opt, null);
        assertNull(commandLine.getSwitch(opt));

        commandLine.setDefaultValues(opt, Collections.singletonList("val"));
        assertEquals(Collections.singletonList("val"), commandLine.getValues(opt));
        commandLine.setDefaultValues(opt, null);
        assertEquals(Collections.EMPTY_LIST, commandLine.getValues(opt));
    }

    @Test
    public void testProperties_customOption() {
        DummyOption opt = new DummyOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Check empty states
        assertNull(commandLine.getProperty(opt, "unknown", null));
        assertEquals("defVal", commandLine.getProperty(opt, "unknown", "defVal"));
        assertEquals(Collections.EMPTY_SET, commandLine.getProperties(opt));

        // Add properties
        commandLine.addProperty(opt, "key1", "val1");
        commandLine.addProperty(opt, "key2", "val2");

        assertEquals("val1", commandLine.getProperty(opt, "key1", "fallback"));
        assertEquals("val2", commandLine.getProperty(opt, "key2", "fallback"));
        assertEquals("fallback", commandLine.getProperty(opt, "key3", "fallback"));

        Set keys = commandLine.getProperties(opt);
        assertEquals(2, keys.size());
        assertTrue(keys.contains("key1"));
        assertTrue(keys.contains("key2"));
    }

    @Test
    public void testProperties_defaultPropertyOption() {
        assertNull(commandLine.getProperty("myProp"));
        assertEquals(Collections.EMPTY_SET, commandLine.getProperties());

        commandLine.addProperty("myProp", "propValue");
        assertEquals("propValue", commandLine.getProperty("myProp"));
        assertEquals("propValue", commandLine.getProperty(new PropertyOption(), "myProp", "def"));

        Set props = commandLine.getProperties();
        assertEquals(1, props.size());
        assertTrue(props.contains("myProp"));
    }

    @Test
    public void testLooksLikeOption() {
        assertTrue(commandLine.looksLikeOption("--file"));
        assertTrue(commandLine.looksLikeOption("-v"));
        assertFalse(commandLine.looksLikeOption("file.txt"));
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testToString_formatting() {
        assertEquals("--file \"test file.txt\" -v", commandLine.toString());

        WriteableCommandLineImpl emptyCmd = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);
        assertEquals("", emptyCmd.toString());

        List singleArg = Collections.singletonList("singleArg");
        WriteableCommandLineImpl singleCmd = new WriteableCommandLineImpl(rootOption, singleArg);
        assertEquals("singleArg", singleCmd.toString());

        List singleArgWithSpace = Collections.singletonList("single arg");
        WriteableCommandLineImpl spaceCmd = new WriteableCommandLineImpl(rootOption, singleArgWithSpace);
        assertEquals("\"single arg\"", spaceCmd.toString());
    }

    @Test
    public void testGetNormalised() {
        List normalised = commandLine.getNormalised();
        assertEquals(3, normalised.size());
        assertEquals("--file", normalised.get(0));
        assertEquals("test file.txt", normalised.get(1));
        assertEquals("-v", normalised.get(2));

        try {
            normalised.add("extra");
            fail("Normalised list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetOptions_unmodifiable() {
        List opts = commandLine.getOptions();
        try {
            opts.add(rootOption);
            fail("Options list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetOptionTriggers_unmodifiable() {
        Set triggers = commandLine.getOptionTriggers();
        try {
            triggers.add("dummy");
            fail("Option triggers set should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
        }
    }
}
