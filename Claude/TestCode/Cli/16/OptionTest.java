package org.apache.commons.cli2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the Option interface.
 *
 * Since Option is an interface, we create a simple concrete
 * implementation (TestOptionImpl) to exercise its contract
 * through the public API, without using any mocking framework.
 */
public class OptionTest {

    /**
     * Simple, self-contained implementation of the Option interface
     * used purely for testing purposes.
     */
    private static class TestOptionImpl implements Option {

        private final String preferredName;
        private final String description;
        private final int id;
        private final boolean required;
        private final Set triggers;
        private final Set prefixes;
        private Option childToFind;
        private boolean throwOnProcess = false;
        private boolean throwOnValidate = false;

        TestOptionImpl(String preferredName, String description, int id, boolean required) {
            this.preferredName = preferredName;
            this.description = description;
            this.id = id;
            this.required = required;
            this.triggers = new HashSet();
            if (preferredName != null) {
                triggers.add(preferredName);
            }
            this.prefixes = new HashSet();
            prefixes.add("-");
            prefixes.add("--");
        }

        void setThrowOnProcess(boolean value) {
            this.throwOnProcess = value;
        }

        void setThrowOnValidate(boolean value) {
            this.throwOnValidate = value;
        }

        void setChildToFind(Option child) {
            this.childToFind = child;
        }

        public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {
            if (throwOnProcess) {
                throw new OptionException(this, "forced-process-exception");
            }
            if (args.hasNext()) {
                args.next();
            }
        }

        public void defaults(WriteableCommandLine commandLine) {
            // no-op default implementation
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            if (argument == null) {
                return false;
            }
            return argument.equals(preferredName);
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            boolean result = false;
            if (arguments.hasNext()) {
                Object next = arguments.next();
                if (next != null && next.equals(preferredName)) {
                    result = true;
                }
                arguments.previous();
            }
            return result;
        }

        public Set getTriggers() {
            return triggers;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            if (throwOnValidate) {
                throw new OptionException(this, "forced-validate-exception");
            }
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            List list = new ArrayList();
            list.add("helpLine-depth-" + depth);
            return list;
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            buffer.append(preferredName == null ? "" : preferredName);
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
            if (trigger != null && trigger.equals(preferredName)) {
                return this;
            }
            if (childToFind != null) {
                return childToFind.findOption(trigger);
            }
            return null;
        }

        public boolean isRequired() {
            return required;
        }
    }

    private TestOptionImpl option;

    @Before
    public void setUp() {
        option = new TestOptionImpl("--test", "Test option description", 42, false);
    }

    // ---------- process() tests ----------

    @Test
    public void testProcess_normalInput_advancesIterator() throws OptionException {
        List args = new ArrayList();
        args.add("--test");
        args.add("value");
        ListIterator it = args.listIterator();

        WriteableCommandLine cl = null; // not used by stub implementation

        option.process(cl, it);

        assertTrue("iterator should have advanced past first element", it.hasNext());
        assertEquals("value", it.next());
    }

    @Test
    public void testProcess_emptyIterator_doesNotAdvance() throws OptionException {
        List args = new ArrayList();
        ListIterator it = args.listIterator();

        option.process(null, it);

        assertFalse(it.hasNext());
    }

    @Test(expected = OptionException.class)
    public void testProcess_configuredToThrow_throwsOptionException() throws OptionException {
        option.setThrowOnProcess(true);
        List args = new ArrayList();
        args.add("--test");
        ListIterator it = args.listIterator();

        option.process(null, it);
    }

    // ---------- defaults() tests ----------

    @Test
    public void testDefaults_normalInvocation_doesNotThrow() {
        // defaults() is a no-op in our stub; simply ensure it can be called
        option.defaults(null);
        assertTrue(true);
    }

    // ---------- canProcess(String) tests ----------

    @Test
    public void testCanProcessString_matchingArgument_returnsTrue() {
        boolean result = option.canProcess(null, "--test");
        assertTrue(result);
    }

    @Test
    public void testCanProcessString_nonMatchingArgument_returnsFalse() {
        boolean result = option.canProcess(null, "--other");
        assertFalse(result);
    }

    @Test
    public void testCanProcessString_nullArgument_returnsFalse() {
        boolean result = option.canProcess(null, (String) null);
        assertFalse(result);
    }

    // ---------- canProcess(ListIterator) tests ----------

    @Test
    public void testCanProcessListIterator_matchingArgument_returnsTrueAndRestoresIterator() {
        List args = new ArrayList();
        args.add("--test");
        args.add("extra");
        ListIterator it = args.listIterator();

        boolean result = option.canProcess(null, it);

        assertTrue(result);
        // iterator must be restored to initial position
        assertEquals("--test", it.next());
    }

    @Test
    public void testCanProcessListIterator_nonMatchingArgument_returnsFalse() {
        List args = new ArrayList();
        args.add("--other");
        ListIterator it = args.listIterator();

        boolean result = option.canProcess(null, it);

        assertFalse(result);
    }

    @Test
    public void testCanProcessListIterator_emptyIterator_returnsFalse() {
        List args = new ArrayList();
        ListIterator it = args.listIterator();

        boolean result = option.canProcess(null, it);

        assertFalse(result);
    }

    // ---------- getTriggers() tests ----------

    @Test
    public void testGetTriggers_normalOption_containsPreferredName() {
        Set triggers = option.getTriggers();
        assertNotNull(triggers);
        assertTrue(triggers.contains("--test"));
    }

    @Test
    public void testGetTriggers_returnedSetIsNotNull_evenForEmptyOption() {
        TestOptionImpl emptyOption = new TestOptionImpl(null, "desc", 1, false);
        Set triggers = emptyOption.getTriggers();
        assertNotNull(triggers);
        assertTrue(triggers.isEmpty());
    }

    // ---------- getPrefixes() tests ----------

    @Test
    public void testGetPrefixes_normalOption_containsExpectedPrefixes() {
        Set prefixes = option.getPrefixes();
        assertNotNull(prefixes);
        assertTrue(prefixes.contains("-"));
        assertTrue(prefixes.contains("--"));
    }

    // ---------- validate() tests ----------

    @Test
    public void testValidate_normalInvocation_doesNotThrow() throws OptionException {
        option.validate(null);
        assertTrue(true);
    }

    @Test(expected = OptionException.class)
    public void testValidate_configuredToThrow_throwsOptionException() throws OptionException {
        option.setThrowOnValidate(true);
        option.validate(null);
    }

    // ---------- helpLines() tests ----------

    @Test
    public void testHelpLines_normalInvocation_returnsNonNullList() {
        List lines = option.helpLines(0, new HashSet(), null);
        assertNotNull(lines);
        assertFalse(lines.isEmpty());
    }

    @Test
    public void testHelpLines_negativeDepth_returnsListWithoutError() {
        List lines = option.helpLines(-1, new HashSet(), null);
        assertNotNull(lines);
        assertTrue(((String) lines.get(0)).contains("-1"));
    }

    // ---------- appendUsage() tests ----------

    @Test
    public void testAppendUsage_normalInvocation_appendsPreferredName() {
        StringBuffer buffer = new StringBuffer();
        option.appendUsage(buffer, new HashSet(), null);
        assertEquals("--test", buffer.toString());
    }

    @Test
    public void testAppendUsage_optionWithNullPreferredName_appendsEmptyString() {
        TestOptionImpl noNameOption = new TestOptionImpl(null, "desc", 1, false);
        StringBuffer buffer = new StringBuffer();
        noNameOption.appendUsage(buffer, new HashSet(), null);
        assertEquals("", buffer.toString());
    }

    // ---------- getPreferredName() tests ----------

    @Test
    public void testGetPreferredName_normalOption_returnsExpectedName() {
        assertEquals("--test", option.getPreferredName());
    }

    @Test
    public void testGetPreferredName_nullPreferredName_returnsNull() {
        TestOptionImpl noNameOption = new TestOptionImpl(null, "desc", 1, false);
        assertNull(noNameOption.getPreferredName());
    }

    // ---------- getDescription() tests ----------

    @Test
    public void testGetDescription_normalOption_returnsExpectedDescription() {
        assertEquals("Test option description", option.getDescription());
    }

    @Test
    public void testGetDescription_emptyDescription_returnsEmptyString() {
        TestOptionImpl emptyDescOption = new TestOptionImpl("--x", "", 1, false);
        assertEquals("", emptyDescOption.getDescription());
    }

    // ---------- getId() tests ----------

    @Test
    public void testGetId_normalOption_returnsExpectedId() {
        assertEquals(42, option.getId());
    }

    @Test
    public void testGetId_zeroId_returnsZero() {
        TestOptionImpl zeroIdOption = new TestOptionImpl("--z", "desc", 0, false);
        assertEquals(0, zeroIdOption.getId());
    }

    @Test
    public void testGetId_negativeId_returnsNegativeValue() {
        TestOptionImpl negIdOption = new TestOptionImpl("--n", "desc", -5, false);
        assertEquals(-5, negIdOption.getId());
    }

    // ---------- findOption() tests ----------

    @Test
    public void testFindOption_matchingTrigger_returnsSelf() {
        Option found = option.findOption("--test");
        assertNotNull(found);
        assertEquals(option, found);
    }

    @Test
    public void testFindOption_nonMatchingTriggerNoChild_returnsNull() {
        Option found = option.findOption("--nonexistent");
        assertNull(found);
    }

    @Test
    public void testFindOption_delegatesToChild_returnsChildMatch() {
        TestOptionImpl child = new TestOptionImpl("--child", "child desc", 2, false);
        option.setChildToFind(child);

        Option found = option.findOption("--child");
        assertNotNull(found);
        assertEquals(child, found);
    }

    @Test
    public void testFindOption_nullTrigger_returnsNull() {
        Option found = option.findOption(null);
        assertNull(found);
    }

    // ---------- isRequired() tests ----------

    @Test
    public void testIsRequired_requiredOption_returnsTrue() {
        TestOptionImpl requiredOption = new TestOptionImpl("--req", "desc", 1, true);
        assertTrue(requiredOption.isRequired());
    }

    @Test
    public void testIsRequired_optionalOption_returnsFalse() {
        assertFalse(option.isRequired());
    }

    // ---------- Basic sanity test ensuring interface contract holds ----------

    @Test
    public void testOptionImplementsInterface_instanceOfOption_true() {
        assertTrue(option instanceof Option);
    }
}
