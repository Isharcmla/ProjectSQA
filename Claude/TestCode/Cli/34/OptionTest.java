import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.List;

public class OptionTest
{
    private Option option;

    @Before
    public void setUp()
    {
        option = null;
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_optDescription_normal()
    {
        Option opt = new Option("a", "description of a");
        assertEquals("a", opt.getOpt());
        assertEquals("description of a", opt.getDescription());
        assertFalse(opt.hasArg());
        assertNull(opt.getLongOpt());
    }

    @Test
    public void testConstructor_optHasArgDescription_normal()
    {
        Option opt = new Option("b", true, "description of b");
        assertEquals("b", opt.getOpt());
        assertTrue(opt.hasArg());
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testConstructor_optHasArgDescription_falseHasArg()
    {
        Option opt = new Option("c", false, "description of c");
        assertFalse(opt.hasArg());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    @Test
    public void testConstructor_fullConstructor_normal()
    {
        Option opt = new Option("d", "long-d", true, "description of d");
        assertEquals("d", opt.getOpt());
        assertEquals("long-d", opt.getLongOpt());
        assertTrue(opt.hasArg());
        assertEquals("description of d", opt.getDescription());
    }

    @Test
    public void testConstructor_nullOpt_allowedAsLongOption()
    {
        Option opt = new Option(null, "long-only", false, "desc");
        assertNull(opt.getOpt());
        assertEquals("long-only", opt.getLongOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidOptChar_throwsIllegalArgumentException()
    {
        // '!' is not a valid java identifier part and not '?' or '@', so should be invalid.
        new Option("!", "invalid option");
    }

    // ---------- getId ----------

    @Test
    public void testGetId_singleCharOpt_returnsCharCode()
    {
        Option opt = new Option("a", "desc");
        assertEquals((int) 'a', opt.getId());
    }

    @Test
    public void testGetId_nullOptWithLongOpt_returnsFirstCharOfLongOpt()
    {
        Option opt = new Option(null, "longonly", false, "desc");
        assertEquals((int) 'l', opt.getId());
    }

    // ---------- getOpt / getLongOpt / setLongOpt / hasLongOpt ----------

    @Test
    public void testGetOpt_normal()
    {
        Option opt = new Option("x", "desc");
        assertEquals("x", opt.getOpt());
    }

    @Test
    public void testHasLongOpt_noLongOpt_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        assertFalse(opt.hasLongOpt());
    }

    @Test
    public void testSetLongOpt_andHasLongOpt_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setLongOpt("extended");
        assertTrue(opt.hasLongOpt());
        assertEquals("extended", opt.getLongOpt());
    }

    // ---------- getType / setType ----------

    @Test
    public void testGetType_defaultIsNull()
    {
        Option opt = new Option("x", "desc");
        assertNull(opt.getType());
    }

    @Test
    public void testSetType_normal()
    {
        Option opt = new Option("x", "desc");
        opt.setType(String.class);
        assertEquals(String.class, opt.getType());
    }

    // ---------- optionalArg ----------

    @Test
    public void testHasOptionalArg_default_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        assertFalse(opt.hasOptionalArg());
    }

    @Test
    public void testSetOptionalArg_true_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setOptionalArg(true);
        assertTrue(opt.hasOptionalArg());
    }

    // ---------- hasArg ----------

    @Test
    public void testHasArg_zeroArgs_returnsFalse()
    {
        Option opt = new Option("x", false, "desc");
        assertFalse(opt.hasArg());
    }

    @Test
    public void testHasArg_unlimitedArgs_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArg());
    }

    // ---------- description ----------

    @Test
    public void testGetDescription_normal()
    {
        Option opt = new Option("x", "my description");
        assertEquals("my description", opt.getDescription());
    }

    @Test
    public void testSetDescription_normal()
    {
        Option opt = new Option("x", "old");
        opt.setDescription("new description");
        assertEquals("new description", opt.getDescription());
    }

    // ---------- required ----------

    @Test
    public void testIsRequired_default_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        assertFalse(opt.isRequired());
    }

    @Test
    public void testSetRequired_true_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setRequired(true);
        assertTrue(opt.isRequired());
    }

    // ---------- argName ----------

    @Test
    public void testGetArgName_default_returnsNull()
    {
        Option opt = new Option("x", "desc");
        assertNull(opt.getArgName());
    }

    @Test
    public void testSetArgName_normal()
    {
        Option opt = new Option("x", "desc");
        opt.setArgName("FILE");
        assertEquals("FILE", opt.getArgName());
    }

    @Test
    public void testHasArgName_null_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        assertFalse(opt.hasArgName());
    }

    @Test
    public void testHasArgName_emptyString_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        opt.setArgName("");
        assertFalse(opt.hasArgName());
    }

    @Test
    public void testHasArgName_nonEmptyString_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setArgName("FILE");
        assertTrue(opt.hasArgName());
    }

    // ---------- hasArgs / setArgs / getArgs ----------

    @Test
    public void testHasArgs_moreThanOne_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(2);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasArgs_unlimited_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasArgs_oneArg_returnsFalse()
    {
        Option opt = new Option("x", true, "desc");
        assertFalse(opt.hasArgs());
    }

    @Test
    public void testSetArgsGetArgs_normal()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(5);
        assertEquals(5, opt.getArgs());
    }

    // ---------- value separator ----------

    @Test
    public void testHasValueSeparator_default_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        assertFalse(opt.hasValueSeparator());
    }

    @Test
    public void testSetValueSeparator_andGetValueSeparator_normal()
    {
        Option opt = new Option("x", "desc");
        opt.setValueSeparator('=');
        assertEquals('=', opt.getValueSeparator());
        assertTrue(opt.hasValueSeparator());
    }

    // ---------- addValueForProcessing / getValue / getValues ----------

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_noArgsAllowed_throwsRuntimeException()
    {
        Option opt = new Option("x", "desc"); // numberOfArgs == UNINITIALIZED
        opt.addValueForProcessing("value");
    }

    @Test
    public void testAddValueForProcessing_singleArg_normal()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue());
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_exceedsLimit_throwsRuntimeException()
    {
        Option opt = new Option("x", true, "desc"); // numberOfArgs = 1
        opt.addValueForProcessing("value1");
        opt.addValueForProcessing("value2"); // should throw, list full
    }

    @Test
    public void testAddValueForProcessing_withValueSeparator_splitsValues()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(2);
        opt.setValueSeparator('=');
        opt.addValueForProcessing("key=value");
        assertEquals("key", opt.getValue(0));
        assertEquals("value", opt.getValue(1));
    }

    @Test
    public void testAddValueForProcessing_withValueSeparatorAndOptionalArg_allowsMultipleValues()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.setValueSeparator(',');
        opt.addValueForProcessing("a,b,c");
        String[] values = opt.getValues();
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("a", values[0]);
        assertEquals("b", values[1]);
        assertEquals("c", values[2]);
    }

    @Test
    public void testGetValue_noValues_returnsNull()
    {
        Option opt = new Option("x", true, "desc");
        assertNull(opt.getValue());
    }

    @Test
    public void testGetValueIndex_normal()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("only-value");
        assertEquals("only-value", opt.getValue(0));
    }

    @Test
    public void testGetValueIndex_noValues_returnsNull()
    {
        Option opt = new Option("x", true, "desc");
        assertNull(opt.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueIndex_outOfBounds_throwsException()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("only-value");
        opt.getValue(5);
    }

    @Test
    public void testGetValueWithDefault_hasValue_returnsActualValue()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("actual");
        assertEquals("actual", opt.getValue("default"));
    }

    @Test
    public void testGetValueWithDefault_noValue_returnsDefault()
    {
        Option opt = new Option("x", true, "desc");
        assertEquals("default", opt.getValue("default"));
    }

    @Test
    public void testGetValues_noValues_returnsNull()
    {
        Option opt = new Option("x", true, "desc");
        assertNull(opt.getValues());
    }

    @Test
    public void testGetValues_hasValues_returnsArray()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        String[] values = opt.getValues();
        assertNotNull(values);
        assertEquals(2, values.length);
    }

    @Test
    public void testGetValuesList_returnsListInstance()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("v1");
        List valuesList = opt.getValuesList();
        assertNotNull(valuesList);
        assertEquals(1, valuesList.size());
        assertEquals("v1", valuesList.get(0));
    }

    // ---------- toString ----------

    @Test
    public void testToString_noArgsNoLongOpt_containsDescription()
    {
        Option opt = new Option("x", "the description");
        String str = opt.toString();
        assertTrue(str.contains("the description"));
        assertTrue(str.contains("option: x"));
    }

    @Test
    public void testToString_withLongOptAndArgs_containsAllInfo()
    {
        Option opt = new Option("x", "long-x", false, "the description");
        opt.setArgs(2);
        opt.setType(String.class);
        String str = opt.toString();
        assertTrue(str.contains("long-x"));
        assertTrue(str.contains("[ARG...]"));
        assertTrue(str.contains("String"));
    }

    @Test
    public void testToString_withSingleArg_containsArgMarker()
    {
        Option opt = new Option("x", true, "desc");
        String str = opt.toString();
        assertTrue(str.contains("[ARG]"));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameInstance_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        assertTrue(opt.equals(opt));
    }

    @Test
    public void testEquals_null_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        assertFalse(opt.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        assertFalse(opt.equals("not an option"));
    }

    @Test
    public void testEquals_sameOptAndLongOpt_returnsTrue()
    {
        Option opt1 = new Option("x", "long-x", false, "desc1");
        Option opt2 = new Option("x", "long-x", true, "desc2");
        assertTrue(opt1.equals(opt2));
    }

    @Test
    public void testEquals_differentOpt_returnsFalse()
    {
        Option opt1 = new Option("x", "desc");
        Option opt2 = new Option("y", "desc");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_differentLongOpt_returnsFalse()
    {
        Option opt1 = new Option("x", "long1", false, "desc");
        Option opt2 = new Option("x", "long2", false, "desc");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_nullOptVsNonNullOpt_returnsFalse()
    {
        Option opt1 = new Option(null, "longopt", false, "desc");
        Option opt2 = new Option("x", "longopt", false, "desc");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testHashCode_equalObjects_sameHashCode()
    {
        Option opt1 = new Option("x", "long-x", false, "desc1");
        Option opt2 = new Option("x", "long-x", true, "desc2");
        assertEquals(opt1.hashCode(), opt2.hashCode());
    }

    @Test
    public void testHashCode_nullOptAndLongOpt_returnsZero()
    {
        Option opt = new Option(null, null, false, "desc");
        assertEquals(0, opt.hashCode());
    }

    // ---------- clone ----------

    @Test
    public void testClone_normal_returnsEqualButDistinctObject()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("v1");
        Option cloned = (Option) opt.clone();

        assertEquals(opt, cloned);
        assertNotSame(opt, cloned);
        assertNotSame(opt.getValuesList(), cloned.getValuesList());
        assertEquals(opt.getValue(), cloned.getValue());
    }

    // ---------- clearValues ----------

    @Test
    public void testClearValues_afterAddingValues_valuesAreCleared()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("v1");
        assertNotNull(opt.getValue());

        opt.clearValues();
        assertNull(opt.getValue());
    }

    // ---------- addValue (deprecated) ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue_deprecatedMethod_throwsUnsupportedOperationException()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValue("value");
    }

    // ---------- acceptsArg / requiresArg (package-private) ----------

    @Test
    public void testAcceptsArg_noArgOption_returnsFalse()
    {
        Option opt = new Option("x", false, "desc");
        assertFalse(opt.acceptsArg());
    }

    @Test
    public void testAcceptsArg_singleArgOptionNoValueYet_returnsTrue()
    {
        Option opt = new Option("x", true, "desc");
        assertTrue(opt.acceptsArg());
    }

    @Test
    public void testAcceptsArg_singleArgOptionValueFilled_returnsFalse()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("v1");
        assertFalse(opt.acceptsArg());
    }

    @Test
    public void testAcceptsArg_optionalArgOnly_returnsTrue()
    {
        Option opt = new Option("x", false, "desc");
        opt.setOptionalArg(true);
        assertTrue(opt.acceptsArg());
    }

    @Test
    public void testRequiresArg_optionalArgTrue_returnsFalse()
    {
        Option opt = new Option("x", true, "desc");
        opt.setOptionalArg(true);
        assertFalse(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_unlimitedValuesNoValue_returnsTrue()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_unlimitedValuesWithValue_returnsFalse()
    {
        Option opt = new Option("x", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.addValueForProcessing("v1");
        assertFalse(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_normalArgNoValue_returnsTrue()
    {
        Option opt = new Option("x", true, "desc");
        assertTrue(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_normalArgWithValue_returnsFalse()
    {
        Option opt = new Option("x", true, "desc");
        opt.addValueForProcessing("v1");
        assertFalse(opt.requiresArg());
    }
}
