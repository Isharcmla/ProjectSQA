package org.apache.commons.cli2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class OptionTest {

    private static class DummyOption implements Option {
        private final int id;
        private final String preferredName;
        private final String description;
        private final boolean required;
        private final Set triggers = new HashSet();
        private final Set prefixes = new HashSet();
        private Option childOption;
        private boolean processCalled = false;
        private boolean defaultsCalled = false;
        private boolean validateCalled = false;
        private boolean throwOnProcess = false;
        private boolean throwOnValidate = false;

        public DummyOption(int id, String preferredName, String description, boolean required) {
            this.id = id;
            this.preferredName = preferredName;
            this.description = description;
            this.required = required;
        }

        public void setChildOption(Option childOption) {
            this.childOption = childOption;
        }

        public void setThrowOnProcess(boolean throwOnProcess) {
            this.throwOnProcess = throwOnProcess;
        }

        public void setThrowOnValidate(boolean throwOnValidate) {
            this.throwOnValidate = throwOnValidate;
        }

        public boolean isProcessCalled() {
            return processCalled;
        }

        public boolean isDefaultsCalled() {
            return defaultsCalled;
        }

        public boolean isValidateCalled() {
            return validateCalled;
        }

        public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {
            if (throwOnProcess) {
                throw new OptionException(this, "Process error");
            }
            processCalled = true;
            if (args != null && args.hasNext()) {
                args.next();
            }
        }

        public void defaults(WriteableCommandLine commandLine) {
            defaultsCalled = true;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            if (argument == null) {
                return false;
            }
            return triggers.contains(argument);
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            if (arguments == null || !arguments.hasNext()) {
                return false;
            }
            Object next = arguments.next();
            arguments.previous();
            return canProcess(commandLine, next != null ? next.toString() : null);
        }

        public Set getTriggers() {
            return triggers;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            if (throwOnValidate) {
                throw new OptionException(this, "Validation error");
            }
            validateCalled = true;
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            List lines = new ArrayList();
            lines.add("depth=" + depth + ",name=" + preferredName);
            return lines;
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            if (buffer != null) {
                if (preferredName != null) {
                    buffer.append(preferredName);
                }
            }
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public int getId() {
            return id;
        }

        public Option findOption(String trigger) {
            if (trigger == null) {
                return null;
            }
            if (triggers.contains(trigger)) {
                return this;
            }
            if (childOption != null) {
                return childOption.findOption(trigger);
            }
            return null;
        }

        public boolean isRequired() {
            return required;
        }
    }

    private DummyOption option;

    @Before
    public void setUp() {
        option = new DummyOption(1, "--test", "Test option description", true);
        option.getTriggers().add("--test");
        option.getTriggers().add("-t");
        option.getPrefixes().add("--");
        option.getPrefixes().add("-");
    }

    @Test
    public void testGetId_positiveId_returnsCorrectId() {
        assertEquals(1, option.getId());
    }

    @Test
    public void testGetId_zeroAndNegativeId_returnsCorrectId() {
        DummyOption zeroOption = new DummyOption(0, null, null, false);
        assertEquals(0, zeroOption.getId());

        DummyOption negativeOption = new DummyOption(-100, "", "", false);
        assertEquals(-100, negativeOption.getId());
    }

    @Test
    public void testGetPreferredName_normalString_returnsPreferredName() {
        assertEquals("--test", option.getPreferredName());
    }

    @Test
    public void testGetPreferredName_nullAndEmpty_returnsCorrectValue() {
        DummyOption nullNameOption = new DummyOption(2, null, "desc", false);
        assertNull(nullNameOption.getPreferredName());

        DummyOption emptyNameOption = new DummyOption(3, "", "desc", false);
        assertEquals("", emptyNameOption.getPreferredName());
    }

    @Test
    public void testGetDescription_normalString_returnsDescription() {
        assertEquals("Test option description", option.getDescription());
    }

    @Test
    public void testGetDescription_nullAndEmpty_returnsCorrectValue() {
        DummyOption nullDescOption = new DummyOption(2, "--name", null, false);
        assertNull(nullDescOption.getDescription());

        DummyOption emptyDescOption = new DummyOption(3, "--name", "", false);
        assertEquals("", emptyDescOption.getDescription());
    }

    @Test
    public void testIsRequired_trueAndFalse_returnsCorrectState() {
        assertTrue(option.isRequired());

        DummyOption optionalOption = new DummyOption(2, "--opt", "Optional", false);
        assertFalse(optionalOption.isRequired());
    }

    @Test
    public void testGetTriggers_normalAndEmpty_returnsSet() {
        Set triggers = option.getTriggers();
        assertNotNull(triggers);
        assertEquals(2, triggers.size());
        assertTrue(triggers.contains("--test"));
        assertTrue(triggers.contains("-t"));

        DummyOption emptyOption = new DummyOption(3, "--empty", "Empty", false);
        assertNotNull(emptyOption.getTriggers());
        assertTrue(emptyOption.getTriggers().isEmpty());
    }

    @Test
    public void testGetPrefixes_normalAndEmpty_returnsSet() {
        Set prefixes = option.getPrefixes();
        assertNotNull(prefixes);
        assertEquals(2, prefixes.size());
        assertTrue(prefixes.contains("--"));
        assertTrue(prefixes.contains("-"));

        DummyOption emptyOption = new DummyOption(3, "--empty", "Empty", false);
        assertNotNull(emptyOption.getPrefixes());
        assertTrue(emptyOption.getPrefixes().isEmpty());
    }

    @Test
    public void testCanProcess_withStringArgument_matchesCorrectly() {
        assertTrue(option.canProcess(null, "--test"));
        assertTrue(option.canProcess(null, "-t"));
        assertFalse(option.canProcess(null, "--other"));
        assertFalse(option.canProcess(null, ""));
        assertFalse(option.canProcess(null, (String) null));
    }

    @Test
    public void testCanProcess_withListIterator_matchesAndRestoresState() {
        List argsList = new ArrayList();
        argsList.add("--test");
        argsList.add("value");
        ListIterator iterator = argsList.listIterator();

        assertTrue(option.canProcess(null, iterator));
        assertEquals(0, iterator.nextIndex());

        List nonMatchingList = new ArrayList();
        nonMatchingList.add("--unknown");
        ListIterator nonMatchingIterator = nonMatchingList.listIterator();
        assertFalse(option.canProcess(null, nonMatchingIterator));
        assertEquals(0, nonMatchingIterator.nextIndex());

        List emptyList = new ArrayList();
        assertFalse(option.canProcess(null, emptyList.listIterator()));
        assertFalse(option.canProcess(null, (ListIterator) null));
    }

    @Test
    public void testProcess_validArguments_processesSuccessfully() throws OptionException {
        List argsList = new ArrayList();
        argsList.add("--test");
        argsList.add("extra");
        ListIterator iterator = argsList.listIterator();

        option.process(null, iterator);
        assertTrue(option.isProcessCalled());
        assertEquals(1, iterator.nextIndex());
    }

    @Test(expected = OptionException.class)
    public void testProcess_errorCondition_throwsOptionException() throws OptionException {
        option.setThrowOnProcess(true);
        option.process(null, Collections.emptyList().listIterator());
    }

    @Test
    public void testProcess_nullArguments_handlesSafely() throws OptionException {
        option.process(null, null);
        assertTrue(option.isProcessCalled());
    }

    @Test
    public void testDefaults_callsDefaultsSuccessfully() {
        assertFalse(option.isDefaultsCalled());
        option.defaults(null);
        assertTrue(option.isDefaultsCalled());
    }

    @Test
    public void testValidate_validState_succeeds() throws OptionException {
        assertFalse(option.isValidateCalled());
        option.validate(null);
        assertTrue(option.isValidateCalled());
    }

    @Test(expected = OptionException.class)
    public void testValidate_invalidState_throwsOptionException() throws OptionException {
        option.setThrowOnValidate(true);
        option.validate(null);
    }

    @Test
    public void testHelpLines_variousParameters_returnsHelpLines() {
        List lines = option.helpLines(0, Collections.emptySet(), null);
        assertNotNull(lines);
        assertEquals(1, lines.size());
        assertEquals("depth=0,name=--test", lines.get(0));

        List linesWithDepth = option.helpLines(4, new HashSet(), Collections.reverseOrder());
        assertEquals(1, linesWithDepth.size());
        assertEquals("depth=4,name=--test", linesWithDepth.get(0));

        List linesNegativeDepth = option.helpLines(-1, null, null);
        assertEquals(1, linesNegativeDepth.size());
        assertEquals("depth=-1,name=--test", linesNegativeDepth.get(0));
    }

    @Test
    public void testAppendUsage_validAndNullBuffers_appendsCorrectly() {
        StringBuffer sb = new StringBuffer();
        option.appendUsage(sb, Collections.emptySet(), null);
        assertEquals("--test", sb.toString());

        // Null buffer check
        try {
            option.appendUsage(null, null, null);
        } catch (Exception e) {
            fail("appendUsage should not throw unexpected exception when buffer is null: " + e.getMessage());
        }

        DummyOption nullNameOption = new DummyOption(2, null, "desc", false);
        StringBuffer emptyBuffer = new StringBuffer();
        nullNameOption.appendUsage(emptyBuffer, Collections.emptySet(), null);
        assertEquals("", emptyBuffer.toString());
    }

    @Test
    public void testFindOption_matchesRootAndChildOptions() {
        assertSame(option, option.findOption("--test"));
        assertSame(option, option.findOption("-t"));
        assertNull(option.findOption("--unknown"));
        assertNull(option.findOption(""));
        assertNull(option.findOption(null));

        DummyOption child = new DummyOption(2, "--child", "Child option", false);
        child.getTriggers().add("--child");
        child.getTriggers().add("-c");
        option.setChildOption(child);

        assertSame(child, option.findOption("--child"));
        assertSame(child, option.findOption("-c"));
        assertNull(option.findOption("--nonexistent"));
    }
}
