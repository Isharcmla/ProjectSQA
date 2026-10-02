import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

import static org.junit.Assert.*;

public class OptionGroupTest
{
    private OptionGroup group;

    @Before
    public void setUp()
    {
        group = new OptionGroup();
    }

    // --- addOption / getNames / getOptions ---

    @Test
    public void testAddOption_singleOption_addedSuccessfully() throws Exception
    {
        Option option = new Option("a", "description a");
        OptionGroup returned = group.addOption(option);

        assertSame("addOption should return the same OptionGroup instance", group, returned);
        assertEquals(1, group.getOptions().size());
        assertTrue(group.getNames().contains("a"));
    }

    @Test
    public void testAddOption_multipleOptions_allAdded() throws Exception
    {
        Option optionA = new Option("a", "description a");
        Option optionB = new Option("b", "description b");

        group.addOption(optionA);
        group.addOption(optionB);

        assertEquals(2, group.getOptions().size());
        assertEquals(2, group.getNames().size());
        assertTrue(group.getNames().contains("a"));
        assertTrue(group.getNames().contains("b"));
    }

    @Test
    public void testAddOption_sameKeyTwice_overwritesPrevious() throws Exception
    {
        Option optionA1 = new Option("a", "first description");
        Option optionA2 = new Option("a", "second description");

        group.addOption(optionA1);
        group.addOption(optionA2);

        assertEquals(1, group.getOptions().size());
        Option remaining = group.getOptions().iterator().next();
        assertEquals("second description", remaining.getDescription());
    }

    @Test
    public void testGetNames_emptyGroup_returnsEmptyCollection()
    {
        Collection<String> names = group.getNames();
        assertNotNull(names);
        assertTrue(names.isEmpty());
    }

    @Test
    public void testGetOptions_emptyGroup_returnsEmptyCollection()
    {
        Collection<Option> options = group.getOptions();
        assertNotNull(options);
        assertTrue(options.isEmpty());
    }

    // --- setSelected / getSelected ---

    @Test
    public void testSetSelected_nullOption_resetsSelection() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);
        group.setSelected(option);

        group.setSelected(null);

        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelected_firstSelection_setsSelected() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        group.setSelected(option);

        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelected_reselectSameOption_noException() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        group.setSelected(option);
        group.setSelected(option);

        assertEquals("a", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelected_differentOptionAlreadySelected_throwsException() throws Exception
    {
        Option optionA = new Option("a", "description a");
        Option optionB = new Option("b", "description b");
        group.addOption(optionA);
        group.addOption(optionB);

        group.setSelected(optionA);
        group.setSelected(optionB);
    }

    @Test
    public void testGetSelected_noSelection_returnsNull()
    {
        assertNull(group.getSelected());
    }

    // --- setRequired / isRequired ---

    @Test
    public void testSetRequired_true_isRequiredReturnsTrue()
    {
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    @Test
    public void testSetRequired_false_isRequiredReturnsFalse()
    {
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequired_defaultValue_returnsFalse()
    {
        assertFalse(group.isRequired());
    }

    // --- toString ---

    @Test
    public void testToString_emptyGroup_returnsEmptyBrackets()
    {
        String result = group.toString();
        assertEquals("[]", result);
    }

    @Test
    public void testToString_singleOptionWithOptAndDescription_formattedCorrectly() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        String result = group.toString();

        assertEquals("[-a description a]", result);
    }

    @Test
    public void testToString_optionWithLongOptOnly_usesDoubleDash() throws Exception
    {
        Option option = new Option(null, "longopt", false, "desc");
        group.addOption(option);

        String result = group.toString();

        assertTrue(result.startsWith("[--longopt"));
    }

    @Test
    public void testToString_optionWithoutDescription_noExtraSpace() throws Exception
    {
        Option option = new Option("a", null, false, null);
        group.addOption(option);

        String result = group.toString();

        assertEquals("[-a]", result);
    }

    @Test
    public void testToString_multipleOptions_separatedByComma() throws Exception
    {
        Option optionA = new Option("a", "description a");
        Option optionB = new Option("b", "description b");

        group.addOption(optionA);
        group.addOption(optionB);

        String result = group.toString();

        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains(", "));
        assertTrue(result.contains("-a description a"));
        assertTrue(result.contains("-b description b"));
    }

    @Test
    public void testGetOptions_iteratorUsedInToString_consistentWithGetOptions() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        Iterator<Option> iterator = group.getOptions().iterator();
        assertTrue(iterator.hasNext());
        assertEquals(option, iterator.next());
        assertFalse(iterator.hasNext());
    }
}
