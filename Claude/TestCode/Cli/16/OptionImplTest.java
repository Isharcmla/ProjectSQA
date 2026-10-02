import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class OptionImplTest {

    /**
     * Minimal concrete implementation of OptionImpl used purely to exercise
     * the base class logic. It does not perform real CLI parsing.
     */
    private static class TestOptionImpl extends OptionImpl {
        private final String preferredName;
        private final String description;
        private final Set prefixes;
        private final Set triggers;

        TestOptionImpl(final int id,
                        final boolean required,
                        final String preferredName,
                        final String description,
                        final Set prefixes,
                        final Set triggers) {
            super(id, required);
            this.preferredName = preferredName;
            this.description = description;
            this.prefixes = prefixes;
            this.triggers = triggers;
        }

        public boolean canProcess(final WriteableCommandLine commandLine, final String argument) {
            return triggers != null && triggers.contains(argument);
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public Set getTriggers() {
            return triggers;
        }

        public void process(final WriteableCommandLine commandLine, final ListIterator arguments)
                throws OptionException {
            // no-op for test purposes
        }

        public void validate(final WriteableCommandLine commandLine) throws OptionException {
            // no-op for test purposes
        }

        public void appendUsage(final StringBuffer buffer, final Set helpSettings, final Comparator comp) {
            if (preferredName != null) {
                buffer.append(preferredName);
            } else {
                buffer.append("null");
            }
        }

        public List helpLines(final int depth, final Set helpSettings, final Comparator comp) {
            return Collections.EMPTY_LIST;
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }
    }

    private Set prefixesWithDash;
    private Set triggersFoo;

    @Before
    public void setUp() {
        prefixesWithDash = new HashSet();
        prefixesWithDash.add("-");
        prefixesWithDash.add("--");

        triggersFoo = new HashSet();
        triggersFoo.add("foo");
        triggersFoo.add("--foo");
    }

    // ---------- getId() ----------

    @Test
    public void testGetId_normalValue_returnsSameId() {
        TestOptionImpl option = new TestOptionImpl(42, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        assertEquals(42, option.getId());
    }

    @Test
    public void testGetId_zeroValue_returnsZero() {
        TestOptionImpl option = new TestOptionImpl(0, false, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        assertEquals(0, option.getId());
    }

    @Test
    public void testGetId_negativeValue_returnsNegative() {
        TestOptionImpl option = new TestOptionImpl(-1, false, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        assertEquals(-1, option.getId());
    }

    // ---------- isRequired() ----------

    @Test
    public void testIsRequired_trueFlag_returnsTrue() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_falseFlag_returnsFalse() {
        TestOptionImpl option = new TestOptionImpl(1, false, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        assertFalse(option.isRequired());
    }

    // ---------- canProcess(WriteableCommandLine, ListIterator) ----------

    @Test
    public void testCanProcess_withMatchingArgument_returnsTrue() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        List args = new ArrayList();
        args.add("--foo");
        args.add("bar");

        ListIterator it = args.listIterator();

        assertTrue(option.canProcess(null, it));
        // Ensure iterator position was restored (previous() call inside canProcess)
        assertEquals("--foo", it.next());
    }

    @Test
    public void testCanProcess_withNonMatchingArgument_returnsFalse() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        List args = new ArrayList();
        args.add("--bar");

        ListIterator it = args.listIterator();

        assertFalse(option.canProcess(null, it));
    }

    @Test
    public void testCanProcess_emptyIterator_returnsFalse() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        List args = new ArrayList();
        ListIterator it = args.listIterator();

        assertFalse(option.canProcess(null, it));
    }

    // ---------- toString() ----------

    @Test
    public void testToString_normalOption_containsPreferredName() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        String result = option.toString();
        assertNotNull(result);
        assertTrue(result.contains("--foo"));
    }

    @Test
    public void testToString_nullPreferredName_containsNullLiteral() {
        TestOptionImpl option = new TestOptionImpl(1, true, null, "desc",
                prefixesWithDash, triggersFoo);

        String result = option.toString();
        assertNotNull(result);
        assertTrue(result.contains("null"));
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameFields_returnsTrue() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        assertTrue(option1.equals(option2));
    }

    @Test
    public void testEquals_differentId_returnsFalse() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(2, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEquals_differentPreferredName_returnsFalse() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(1, true, "--bar", "desc",
                prefixesWithDash, triggersFoo);

        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEquals_notOptionImplInstance_returnsFalse() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        assertFalse(option1.equals("not an option"));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        assertFalse(option1.equals(null));
    }

    @Test
    public void testEquals_bothNullPreferredNameAndDescription_returnsTrue() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, null, null,
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(1, true, null, null,
                prefixesWithDash, triggersFoo);

        assertTrue(option1.equals(option2));
    }

    @Test
    public void testEquals_oneNullPreferredName_returnsFalse() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, null, "desc",
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEquals_differentPrefixes_returnsFalse() {
        Set otherPrefixes = new HashSet();
        otherPrefixes.add("/");

        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(1, true, "--foo", "desc",
                otherPrefixes, triggersFoo);

        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEquals_differentTriggers_returnsFalse() {
        Set otherTriggers = new HashSet();
        otherTriggers.add("baz");

        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, otherTriggers);

        assertFalse(option1.equals(option2));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        TestOptionImpl option1 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);
        TestOptionImpl option2 = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        assertEquals(option1.hashCode(), option2.hashCode());
    }

    @Test
    public void testHashCode_nullPreferredNameAndDescription_doesNotThrow() {
        TestOptionImpl option = new TestOptionImpl(1, true, null, null,
                prefixesWithDash, triggersFoo);

        int hash = option.hashCode();
        assertTrue(hash != 0 || hash == 0); // just ensure it executes without exception
    }

    // ---------- findOption() ----------

    @Test
    public void testFindOption_triggerExists_returnsSelf() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        Option found = option.findOption("foo");
        assertSame(option, found);
    }

    @Test
    public void testFindOption_triggerDoesNotExist_returnsNull() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        Option found = option.findOption("nonexistent");
        assertNull(found);
    }

    // ---------- defaults() ----------

    @Test
    public void testDefaults_doesNothing_noExceptionThrown() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        option.defaults(null);
        // no assertion needed; test passes if no exception thrown
        assertTrue(true);
    }

    // ---------- checkPrefixes() (protected, same-package access) ----------

    @Test
    public void testCheckPrefixes_emptyPrefixSet_noExceptionThrown() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        Set emptyPrefixes = new HashSet();
        option.checkPrefixes(emptyPrefixes);
        assertTrue(true);
    }

    @Test
    public void testCheckPrefixes_validPrefix_noExceptionThrown() {
        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                prefixesWithDash, triggersFoo);

        option.checkPrefixes(prefixesWithDash);
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrefixes_invalidPrefix_throwsIllegalArgumentException() {
        Set badPrefixes = new HashSet();
        badPrefixes.add("+");

        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                badPrefixes, triggersFoo);

        option.checkPrefixes(badPrefixes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrefixes_preferredNameDoesNotMatchPrefix_throwsException() {
        Set validForTriggerOnly = new HashSet();
        validForTriggerOnly.add("zzz");

        TestOptionImpl option = new TestOptionImpl(1, true, "--foo", "desc",
                validForTriggerOnly, triggersFoo);

        option.checkPrefixes(validForTriggerOnly);
    }
}
