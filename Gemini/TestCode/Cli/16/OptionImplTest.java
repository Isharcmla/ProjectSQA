package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Assert;
import org.junit.Test;

public class OptionImplTest {

    private static class ConcreteOption extends OptionImpl {
        private String preferredName;
        private String description;
        private Set prefixes = Collections.emptySet();
        private Set triggers = Collections.emptySet();
        private boolean canProcessResult = true;

        public ConcreteOption(int id, boolean required) {
            super(id, required);
        }

        public ConcreteOption(int id, boolean required, String preferredName,
                              String description, Set prefixes, Set triggers) {
            super(id, required);
            this.preferredName = preferredName;
            this.description = description;
            this.prefixes = prefixes == null ? Collections.emptySet() : prefixes;
            this.triggers = triggers == null ? Collections.emptySet() : triggers;
        }

        public void setCanProcessResult(boolean canProcessResult) {
            this.canProcessResult = canProcessResult;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return canProcessResult;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments)
            throws OptionException {
            // No-op for testing
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            // No-op for testing
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            if (preferredName != null) {
                buffer.append(preferredName);
            } else {
                buffer.append("defaultUsage");
            }
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return Collections.emptyList();
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public Set getTriggers() {
            return triggers;
        }

        public void executeCheckPrefixes(Set prefixes) {
            super.checkPrefixes(prefixes);
        }
    }

    @Test
    public void testGetId_positiveValue_returnsCorrectId() {
        ConcreteOption option = new ConcreteOption(42, false);
        Assert.assertEquals(42, option.getId());
    }

    @Test
    public void testGetId_negativeAndZeroValue_returnsCorrectId() {
        ConcreteOption optionZero = new ConcreteOption(0, false);
        Assert.assertEquals(0, optionZero.getId());

        ConcreteOption optionNegative = new ConcreteOption(-1, false);
        Assert.assertEquals(-1, optionNegative.getId());
    }

    @Test
    public void testIsRequired_trueAndFalse_returnsExpected() {
        ConcreteOption requiredOption = new ConcreteOption(1, true);
        Assert.assertTrue(requiredOption.isRequired());

        ConcreteOption optionalOption = new ConcreteOption(1, false);
        Assert.assertFalse(optionalOption.isRequired());
    }

    @Test
    public void testCanProcess_withArguments_returnsCanProcessResultAndPreservesIterator() {
        ConcreteOption option = new ConcreteOption(1, false);
        List list = new ArrayList();
        list.add("--test");
        ListIterator iterator = list.listIterator();

        option.setCanProcessResult(true);
        Assert.assertTrue(option.canProcess(null, iterator));
        Assert.assertEquals(0, iterator.nextIndex());

        option.setCanProcessResult(false);
        Assert.assertFalse(option.canProcess(null, iterator));
        Assert.assertEquals(0, iterator.nextIndex());
    }

    @Test
    public void testCanProcess_emptyArguments_returnsFalse() {
        ConcreteOption option = new ConcreteOption(1, false);
        List list = new ArrayList();
        ListIterator iterator = list.listIterator();

        Assert.assertFalse(option.canProcess(null, iterator));
    }

    @Test
    public void testToString_validOption_returnsUsageString() {
        ConcreteOption optionWithName = new ConcreteOption(1, false, "--option", "desc", null, null);
        Assert.assertEquals("--option", optionWithName.toString());

        ConcreteOption optionWithoutName = new ConcreteOption(1, false, null, "desc", null, null);
        Assert.assertEquals("defaultUsage", optionWithoutName.toString());
    }

    @Test
    public void testDefaults_called_doesNotThrowException() {
        ConcreteOption option = new ConcreteOption(1, false);
        option.defaults(null);
    }

    @Test
    public void testFindOption_triggerPresent_returnsThis() {
        Set triggers = new HashSet();
        triggers.add("--opt");
        triggers.add("-o");
        ConcreteOption option = new ConcreteOption(1, false, "--opt", "desc", null, triggers);

        Option found = option.findOption("--opt");
        Assert.assertSame(option, found);

        found = option.findOption("-o");
        Assert.assertSame(option, found);
    }

    @Test
    public void testFindOption_triggerNotPresent_returnsNull() {
        Set triggers = new HashSet();
        triggers.add("--opt");
        ConcreteOption option = new ConcreteOption(1, false, "--opt", "desc", null, triggers);

        Option found = option.findOption("--unknown");
        Assert.assertNull(found);

        found = option.findOption(null);
        Assert.assertNull(found);
    }

    @Test
    public void testEquals_sameObject_returnsTrue() {
        ConcreteOption option = new ConcreteOption(1, false, "name", "desc", Collections.singleton("-"), Collections.singleton("-n"));
        Assert.assertTrue(option.equals(option));
    }

    @Test
    public void testEquals_nullOrDifferentType_returnsFalse() {
        ConcreteOption option = new ConcreteOption(1, false);
        Assert.assertFalse(option.equals(null));
        Assert.assertFalse(option.equals("someString"));
        Assert.assertFalse(option.equals(new Integer(1)));
    }

    @Test
    public void testEquals_identicalObjects_returnsTrue() {
        Set prefixes1 = Collections.singleton("-");
        Set prefixes2 = Collections.singleton("-");
        Set triggers1 = Collections.singleton("-n");
        Set triggers2 = Collections.singleton("-n");

        ConcreteOption opt1 = new ConcreteOption(1, false, "name", "desc", prefixes1, triggers1);
        ConcreteOption opt2 = new ConcreteOption(1, false, "name", "desc", prefixes2, triggers2);

        Assert.assertTrue(opt1.equals(opt2));
        Assert.assertTrue(opt2.equals(opt1));
    }

    @Test
    public void testEquals_allNullFieldsMatching_returnsTrue() {
        ConcreteOption opt1 = new ConcreteOption(1, false, null, null, Collections.emptySet(), Collections.emptySet());
        ConcreteOption opt2 = new ConcreteOption(1, false, null, null, Collections.emptySet(), Collections.emptySet());

        Assert.assertTrue(opt1.equals(opt2));
    }

    @Test
    public void testEquals_differentId_returnsFalse() {
        ConcreteOption opt1 = new ConcreteOption(1, false, "name", "desc", Collections.emptySet(), Collections.emptySet());
        ConcreteOption opt2 = new ConcreteOption(2, false, "name", "desc", Collections.emptySet(), Collections.emptySet());

        Assert.assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_differentPreferredName_returnsFalse() {
        ConcreteOption opt1 = new ConcreteOption(1, false, "name1", "desc", Collections.emptySet(), Collections.emptySet());
        ConcreteOption opt2 = new ConcreteOption(1, false, "name2", "desc", Collections.emptySet(), Collections.emptySet());
        ConcreteOption optNull = new ConcreteOption(1, false, null, "desc", Collections.emptySet(), Collections.emptySet());

        Assert.assertFalse(opt1.equals(opt2));
        Assert.assertFalse(opt1.equals(optNull));
        Assert.assertFalse(optNull.equals(opt1));
    }

    @Test
    public void testEquals_differentDescription_returnsFalse() {
        ConcreteOption opt1 = new ConcreteOption(1, false, "name", "desc1", Collections.emptySet(), Collections.emptySet());
        ConcreteOption opt2 = new ConcreteOption(1, false, "name", "desc2", Collections.emptySet(), Collections.emptySet());
        ConcreteOption optNull = new ConcreteOption(1, false, "name", null, Collections.emptySet(), Collections.emptySet());

        Assert.assertFalse(opt1.equals(opt2));
        Assert.assertFalse(opt1.equals(optNull));
        Assert.assertFalse(optNull.equals(opt1));
    }

    @Test
    public void testEquals_differentPrefixes_returnsFalse() {
        ConcreteOption opt1 = new ConcreteOption(1, false, "name", "desc", Collections.singleton("-"), Collections.emptySet());
        ConcreteOption opt2 = new ConcreteOption(1, false, "name", "desc", Collections.singleton("--"), Collections.emptySet());

        Assert.assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_differentTriggers_returnsFalse() {
        ConcreteOption opt1 = new ConcreteOption(1, false, "name", "desc", Collections.emptySet(), Collections.singleton("-a"));
        ConcreteOption opt2 = new ConcreteOption(1, false, "name", "desc", Collections.emptySet(), Collections.singleton("-b"));

        Assert.assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testHashCode_consistentAndAccountsForNulls() {
        Set prefixes = Collections.singleton("-");
        Set triggers = Collections.singleton("-a");

        ConcreteOption optFull = new ConcreteOption(1, false, "name", "desc", prefixes, triggers);
        ConcreteOption optFullIdentical = new ConcreteOption(1, false, "name", "desc", prefixes, triggers);
        Assert.assertEquals(optFull.hashCode(), optFullIdentical.hashCode());

        ConcreteOption optNullName = new ConcreteOption(1, false, null, "desc", prefixes, triggers);
        Assert.assertNotEquals(optFull.hashCode(), optNullName.hashCode());

        ConcreteOption optNullDesc = new ConcreteOption(1, false, "name", null, prefixes, triggers);
        Assert.assertNotEquals(optFull.hashCode(), optNullDesc.hashCode());

        ConcreteOption optAllNull = new ConcreteOption(1, false, null, null, prefixes, triggers);
        Assert.assertNotEquals(optFull.hashCode(), optAllNull.hashCode());
    }

    @Test
    public void testCheckPrefixes_emptyPrefixes_doesNothing() {
        ConcreteOption option = new ConcreteOption(1, false, "test", "desc", null, null);
        option.executeCheckPrefixes(Collections.emptySet());
    }

    @Test
    public void testCheckPrefixes_validPrefixes_success() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");

        Set triggers = new HashSet();
        triggers.add("-t");
        triggers.add("--test");

        ConcreteOption option = new ConcreteOption(1, false, "--test", "desc", prefixes, triggers);
        option.executeCheckPrefixes(prefixes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrefixes_preferredNameInvalidPrefix_throwsException() {
        Set prefixes = Collections.singleton("-");
        Set triggers = Collections.singleton("-valid");

        ConcreteOption option = new ConcreteOption(1, false, "invalidPrefix", "desc", prefixes, triggers);
        option.executeCheckPrefixes(prefixes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrefixes_triggerInvalidPrefix_throwsException() {
        Set prefixes = Collections.singleton("-");
        Set triggers = new HashSet();
        triggers.add("-valid");
        triggers.add("invalidTrigger");

        ConcreteOption option = new ConcreteOption(1, false, "-validPreferred", "desc", prefixes, triggers);
        option.executeCheckPrefixes(prefixes);
    }
}
