package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Test suite for {@link OptionGroup}.
 */
public class OptionGroupTest
{
    private OptionGroup group;
    private Option optA;
    private Option optB;

    @Before
    public void setUp()
    {
        group = new OptionGroup();
        optA = new Option("a", "first option");
        optB = new Option("b", "second option");
    }

    @Test
    public void testAddOption_singleOption_groupContainsOption()
    {
        OptionGroup returnedGroup = group.addOption(optA);
        assertSame(group, returnedGroup);

        Collection<String> names = group.getNames();
        assertEquals(1, names.size());
        assertTrue(names.contains("a"));

        Collection<Option> options = group.getOptions();
        assertEquals(1, options.size());
        assertTrue(options.contains(optA));
    }

    @Test
    public void testAddOption_multipleOptions_groupContainsAllOptions()
    {
        group.addOption(optA);
        group.addOption(optB);

        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));

        Collection<Option> options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(optA));
        assertTrue(options.contains(optB));
    }

    @Test
    public void testGetSelected_initialState_returnsNull()
    {
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelected_validOption_selectedIsUpdated() throws Exception
    {
        group.addOption(optA);
        group.setSelected(optA);

        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelected_reselectSameOption_succeeds() throws Exception
    {
        group.addOption(optA);
        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        // Reselect the exact same option
        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        // Reselect another Option object having the same key
        Option optADuplicate = new Option("a", "duplicate key option");
        group.setSelected(optADuplicate);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelected_nullOption_resetsSelected() throws Exception
    {
        group.addOption(optA);
        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        group.setSelected(null);
        assertNull(group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelected_differentOptionAlreadySelected_throwsException() throws Exception
    {
        group.addOption(optA);
        group.addOption(optB);

        group.setSelected(optA);
        group.setSelected(optB);
    }

    @Test
    public void testSetSelected_alreadySelectedExceptionDetails()
    {
        group.addOption(optA);
        group.addOption(optB);

        try
        {
            group.setSelected(optA);
            group.setSelected(optB);
            fail("Expected AlreadySelectedException was not thrown");
        }
        catch (AlreadySelectedException ex)
        {
            assertSame(group, ex.getOptionGroup());
            assertSame(optB, ex.getOption());
        }
    }

    @Test
    public void testSetRequired_trueAndFalse_updatesRequiredState()
    {
        assertFalse(group.isRequired());

        group.setRequired(true);
        assertTrue(group.isRequired());

        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    public void testToString_emptyGroup_returnsEmptyBrackets()
    {
        assertEquals("[]", group.toString());
    }

    @Test
    public void testToString_shortOptionWithDescription_formattedCorrectly()
    {
        group.addOption(new Option("a", "description a"));
        assertEquals("[-a description a]", group.toString());
    }

    @Test
    public void testToString_shortOptionWithoutDescription_formattedCorrectly()
    {
        group.addOption(new Option("a", null));
        assertEquals("[-a]", group.toString());
    }

    @Test
    public void testToString_longOptionOnlyWithDescription_formattedCorrectly()
    {
        Option longOnly = new Option(null, "long-opt", false, "description long");
        group.addOption(longOnly);
        assertEquals("[--long-opt description long]", group.toString());
    }

    @Test
    public void testToString_longOptionOnlyWithoutDescription_formattedCorrectly()
    {
        Option longOnly = new Option(null, "long-opt", false, null);
        group.addOption(longOnly);
        assertEquals("[--long-opt]", group.toString());
    }

    @Test
    public void testToString_multipleOptions_containsAllAndSeparators()
    {
        group.addOption(new Option("a", "descA"));
        group.addOption(new Option(null, "foo", false, "descFoo"));

        String result = group.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains("-a descA"));
        assertTrue(result.contains("--foo descFoo"));
        assertTrue(result.contains(", "));
    }

    @Test
    public void testGetNamesAndGetOptions_emptyGroup_returnsEmptyCollections()
    {
        assertNotNull(group.getNames());
        assertTrue(group.getNames().isEmpty());

        assertNotNull(group.getOptions());
        assertTrue(group.getOptions().isEmpty());
    }
}
