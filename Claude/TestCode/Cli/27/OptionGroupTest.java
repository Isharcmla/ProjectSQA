import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class OptionGroupTest
{
    private OptionGroup group;

    @Before
    public void setUp()
    {
        group = new OptionGroup();
    }

    @Test
    public void testAddOption_singleOption_addedSuccessfully()
    {
        Option option = new Option("a", "description a");
        OptionGroup result = group.addOption(option);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, group.getOptions().size());
        Assert.assertTrue(group.getNames().contains("a"));
    }

    @Test
    public void testAddOption_multipleOptions_addedSuccessfully()
    {
        Option option1 = new Option("a", "description a");
        Option option2 = new Option("b", "description b");

        group.addOption(option1);
        group.addOption(option2);

        Assert.assertEquals(2, group.getOptions().size());
        Assert.assertEquals(2, group.getNames().size());
    }

    @Test
    public void testAddOption_sameKeyTwice_overwritesPreviousOption()
    {
        Option option1 = new Option("a", "description a");
        Option option2 = new Option("a", "description a2");

        group.addOption(option1);
        group.addOption(option2);

        Assert.assertEquals(1, group.getOptions().size());
        Collection options = group.getOptions();
        Option retrieved = (Option) options.iterator().next();
        Assert.assertEquals("description a2", retrieved.getDescription());
    }

    @Test
    public void testGetNames_emptyGroup_returnsEmptyCollection()
    {
        Collection names = group.getNames();
        Assert.assertNotNull(names);
        Assert.assertTrue(names.isEmpty());
    }

    @Test
    public void testGetNames_withOptions_returnsCorrectNames()
    {
        group.addOption(new Option("a", "description a"));
        group.addOption(new Option("b", "description b"));

        Collection names = group.getNames();
        Assert.assertEquals(2, names.size());
        Assert.assertTrue(names.contains("a"));
        Assert.assertTrue(names.contains("b"));
    }

    @Test
    public void testGetOptions_emptyGroup_returnsEmptyCollection()
    {
        Collection options = group.getOptions();
        Assert.assertNotNull(options);
        Assert.assertTrue(options.isEmpty());
    }

    @Test
    public void testGetOptions_withOptions_returnsCorrectOptions()
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        Collection options = group.getOptions();
        Assert.assertEquals(1, options.size());
        Assert.assertTrue(options.contains(option));
    }

    @Test
    public void testSetSelected_nullOption_resetsSelected() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);
        group.setSelected(option);

        Assert.assertEquals("a", group.getSelected());

        group.setSelected(null);
        Assert.assertNull(group.getSelected());
    }

    @Test
    public void testSetSelected_firstSelection_setsSelected() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        group.setSelected(option);

        Assert.assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelected_sameOptionReselected_noException() throws Exception
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        group.setSelected(option);
        group.setSelected(option);

        Assert.assertEquals("a", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelected_differentOptionAlreadySelected_throwsException() throws Exception
    {
        Option option1 = new Option("a", "description a");
        Option option2 = new Option("b", "description b");
        group.addOption(option1);
        group.addOption(option2);

        group.setSelected(option1);
        group.setSelected(option2);
    }

    @Test
    public void testGetSelected_noSelection_returnsNull()
    {
        Assert.assertNull(group.getSelected());
    }

    @Test
    public void testSetRequired_true_isRequiredReturnsTrue()
    {
        group.setRequired(true);
        Assert.assertTrue(group.isRequired());
    }

    @Test
    public void testSetRequired_false_isRequiredReturnsFalse()
    {
        group.setRequired(false);
        Assert.assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequired_defaultValue_returnsFalse()
    {
        Assert.assertFalse(group.isRequired());
    }

    @Test
    public void testToString_emptyGroup_returnsEmptyBrackets()
    {
        String result = group.toString();
        Assert.assertEquals("[]", result);
    }

    @Test
    public void testToString_singleOptionWithShortOpt_returnsFormattedString()
    {
        Option option = new Option("a", "description a");
        group.addOption(option);

        String result = group.toString();
        Assert.assertEquals("[-a description a]", result);
    }

    @Test
    public void testToString_multipleOptions_returnsCommaSeparatedString()
    {
        Option option1 = new Option("a", "description a");
        group.addOption(option1);

        String result = group.toString();
        Assert.assertTrue(result.startsWith("["));
        Assert.assertTrue(result.endsWith("]"));
        Assert.assertTrue(result.contains("-a description a"));
    }

    @Test
    public void testToString_optionWithLongOptOnly_returnsFormattedStringWithDoubleDash()
    {
        Option option = new Option(null, "longopt", false, "description long");
        group.addOption(option);

        String result = group.toString();
        Assert.assertTrue(result.contains("--longopt description long"));
    }
}
