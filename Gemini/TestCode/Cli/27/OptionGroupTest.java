package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class OptionGroupTest {

    private OptionGroup group;
    private Option optA;
    private Option optB;
    private Option optLongOnly;

    @Before
    public void setUp() {
        group = new OptionGroup();
        optA = new Option("a", "Option A description");
        optB = new Option("b", "Option B description");
        optLongOnly = new Option(null, "foo", false, "Option Foo description");
    }

    @Test
    public void testDefaultState() {
        assertNull(group.getSelected());
        assertFalse(group.isRequired());
        assertNotNull(group.getNames());
        assertTrue(group.getNames().isEmpty());
        assertNotNull(group.getOptions());
        assertTrue(group.getOptions().isEmpty());
        assertEquals("[]", group.toString());
    }

    @Test
    public void testAddOption_singleOption_containsOption() {
        OptionGroup returnedGroup = group.addOption(optA);

        assertSame(group, returnedGroup);
        Collection names = group.getNames();
        Collection options = group.getOptions();

        assertEquals(1, names.size());
        assertTrue(names.contains("a"));
        assertEquals(1, options.size());
        assertTrue(options.contains(optA));
    }

    @Test
    public void testAddOption_multipleOptions_containsAllOptions() {
        group.addOption(optA).addOption(optB).addOption(optLongOnly);

        Collection names = group.getNames();
        Collection options = group.getOptions();

        assertEquals(3, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
        assertTrue(names.contains("foo"));

        assertEquals(3, options.size());
        assertTrue(options.contains(optA));
        assertTrue(options.contains(optB));
        assertTrue(options.contains(optLongOnly));
    }

    @Test
    public void testSetRequired_trueAndFalse_updatesRequiredState() {
        group.setRequired(true);
        assertTrue(group.isRequired());

        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    public void testSetSelected_initialSelection_setsSelectedSuccessfully() throws AlreadySelectedException {
        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelected_sameOptionReselected_noExceptionThrown() throws AlreadySelectedException {
        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        Option optASameKey = new Option("a", "Another instance with same opt");
        group.setSelected(optASameKey);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelected_nullOption_resetsSelectedToNull() throws AlreadySelectedException {
        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        group.setSelected(null);
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelected_differentOptionSelected_throwsAlreadySelectedException() throws AlreadySelectedException {
        group.setSelected(optA);

        try {
            group.setSelected(optB);
            fail("Expected AlreadySelectedException when selecting a different option in the group.");
        } catch (AlreadySelectedException ex) {
            assertSame(group, ex.getOptionGroup());
            assertSame(optB, ex.getOption());
        }
    }

    @Test
    public void testToString_emptyGroup_returnsEmptyBrackets() {
        assertEquals("[]", group.toString());
    }

    @Test
    public void testToString_singleShortOpt_formatsCorrectly() {
        group.addOption(optA);
        assertEquals("[-a Option A description]", group.toString());
    }

    @Test
    public void testToString_singleLongOptOnly_formatsCorrectly() {
        group.addOption(optLongOnly);
        assertEquals("[--foo Option Foo description]", group.toString());
    }

    @Test
    public void testToString_multipleOptions_containsAllFormattedOptionsWithCommaSeparator() {
        group.addOption(optA);
        group.addOption(optLongOnly);

        String result = group.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains("-a Option A description"));
        assertTrue(result.contains("--foo Option Foo description"));
        assertTrue(result.contains(", "));
    }
}
