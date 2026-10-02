package org.apache.commons.cli;

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
        option = new Option("o", "description");
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_optAndDescription_normal()
    {
        Option opt = new Option("a", "some description");
        assertEquals("a", opt.getOpt());
        assertEquals("some description", opt.getDescription());
        assertFalse(opt.hasArg());
        assertNull(opt.getLongOpt());
    }

    @Test
    public void testConstructor_optHasArgDescription_normal()
    {
        Option opt = new Option("b", true, "desc with arg");
        assertEquals("b", opt.getOpt());
        assertTrue(opt.hasArg());
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testConstructor_optHasArgDescription_noArg()
    {
        Option opt = new Option("c", false, "desc without arg");
        assertFalse(opt.hasArg());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    @Test
    public void testConstructor_fullConstructor_normal()
    {
        Option opt = new Option("d", "dOpt", true, "full description");
        assertEquals("d", opt.getOpt());
        assertEquals("dOpt", opt.getLongOpt());
        assertTrue(opt.hasArg());
        assertEquals("full description", opt.getDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidOptChar_throwsException()
    {
        new Option("-", "invalid opt char");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidMultiCharOpt_throwsException()
    {
        new Option("in valid", "invalid multi char opt with space");
    }

    @Test
    public void testConstructor_nullOpt_longOptOnly()
    {
        // OptionValidator allows null opt (long option only scenario)
        Option opt = new Option(null, "someLong", false, "desc");
        assertNull(opt.getOpt());
        assertEquals("someLong", opt.getLongOpt());
    }

    // ---------- getId / getKey ----------

    @Test
    public void testGetId_singleCharOpt_returnsCharValue()
    {
        Option opt = new Option("x", "desc");
        assertEquals('x', opt.getId());
    }

    @Test
    public void testGetKey_optNotNull_returnsOpt()
    {
        Option opt = new Option("k", "desc");
        assertEquals("k", opt.getKey());
    }

    @Test
    public void testGetKey_optNull_returnsLongOpt()
    {
        Option opt = new Option(null, "longKey", false, "desc");
        assertEquals("longKey", opt.getKey());
    }

    // ---------- getOpt ----------

    @Test
    public void testGetOpt_returnsCorrectValue()
    {
        assertEquals("o", option.getOpt());
    }

    // ---------- getType / setType ----------

    @Test
    public void testSetTypeAndGetType_normal()
    {
        assertNull(option.getType());
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    public void testSetType_null_edgeCase()
    {
        option.setType(null);
        assertNull(option.getType());
    }

    // ---------- getLongOpt / setLongOpt ----------

    @Test
    public void testSetLongOptAndGetLongOpt_normal()
    {
        option.setLongOpt("longOption");
        assertEquals("longOption", option.getLongOpt());
    }

    @Test
    public void testGetLongOpt_notSet_returnsNull()
    {
        Option opt = new Option("z", "desc");
        assertNull(opt.getLongOpt());
    }

    // ---------- setOptionalArg / hasOptionalArg ----------

    @Test
    public void testHasOptionalArg_defaultFalse()
    {
        assertFalse(option.hasOptionalArg());
    }

    @Test
    public void testSetOptionalArg_true_returnsTrue()
    {
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }

    // ---------- hasLongOpt ----------

    @Test
    public void testHasLongOpt_notSet_returnsFalse()
    {
        assertFalse(option.hasLongOpt());
    }

    @Test
    public void testHasLongOpt_set_returnsTrue()
    {
        option.setLongOpt("opt");
        assertTrue(option.hasLongOpt());
    }

    // ---------- hasArg ----------

    @Test
    public void testHasArg_noArg_returnsFalse()
    {
        assertFalse(option.hasArg());
    }

    @Test
    public void testHasArg_withArg_returnsTrue()
    {
        Option opt = new Option("a", true, "desc");
        assertTrue(opt.hasArg());
    }

    @Test
    public void testHasArg_unlimitedValues_returnsTrue()
    {
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArg());
    }

    // ---------- getDescription / setDescription ----------

    @Test
    public void testSetDescriptionAndGetDescription_normal()
    {
        option.setDescription("new description");
        assertEquals("new description", option.getDescription());
    }

    @Test
    public void testSetDescription_null_edgeCase()
    {
        option.setDescription(null);
        assertNull(option.getDescription());
    }

    // ---------- isRequired / setRequired ----------

    @Test
    public void testIsRequired_default_returnsFalse()
    {
        assertFalse(option.isRequired());
    }

    @Test
    public void testSetRequired_true_returnsTrue()
    {
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    // ---------- setArgName / getArgName / hasArgName ----------

    @Test
    public void testGetArgName_default_returnsArg()
    {
        assertEquals("arg", option.getArgName());
    }

    @Test
    public void testSetArgNameAndGetArgName_normal()
    {
        option.setArgName("FILE");
        assertEquals("FILE", option.getArgName());
    }

    @Test
    public void testHasArgName_default_returnsTrue()
    {
        assertTrue(option.hasArgName());
    }

    @Test
    public void testHasArgName_null_returnsFalse()
    {
        option.setArgName(null);
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_emptyString_returnsFalse()
    {
        option.setArgName("");
        assertFalse(option.hasArgName());
    }

    // ---------- hasArgs / setArgs / getArgs ----------

    @Test
    public void testHasArgs_default_returnsFalse()
    {
        assertFalse(option.hasArgs());
    }

    @Test
    public void testSetArgsAndHasArgs_multipleArgs_returnsTrue()
    {
        option.setArgs(2);
        assertTrue(option.hasArgs());
        assertEquals(2, option.getArgs());
    }

    @Test
    public void testHasArgs_singleArg_returnsFalse()
    {
        option.setArgs(1);
        assertFalse(option.hasArgs());
    }

    @Test
    public void testHasArgs_unlimitedValues_returnsTrue()
    {
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArgs());
    }

    @Test
    public void testSetArgs_zero_edgeCase()
    {
        option.setArgs(0);
        assertEquals(0, option.getArgs());
        assertFalse(option.hasArg());
        assertFalse(option.hasArgs());
    }

    @Test
    public void testSetArgs_negativeValue_edgeCase()
    {
        option.setArgs(-5);
        assertEquals(-5, option.getArgs());
    }

    // ---------- setValueSeparator / getValueSeparator / hasValueSeparator ----------

    @Test
    public void testHasValueSeparator_default_returnsFalse()
    {
        assertFalse(option.hasValueSeparator());
        assertEquals('\u0000', option.getValueSeparator());
    }

    @Test
    public void testSetValueSeparatorAndGetValueSeparator_normal()
    {
        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
        assertTrue(option.hasValueSeparator());
    }

    // ---------- getValue ----------

    @Test
    public void testGetValue_noValues_returnsNull()
    {
        assertNull(option.getValue());
    }

    @Test
    public void testGetValue_withValue_returnsFirstValue()
    {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue());
    }

    @Test
    public void testGetValueWithIndex_normal()
    {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("value1");
        opt.addValueForProcessing("value2");
        assertEquals("value1", opt.getValue(0));
        assertEquals("value2", opt.getValue(1));
    }

    @Test
    public void testGetValueWithIndex_noValues_returnsNull()
    {
        assertNull(option.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueWithIndex_outOfBounds_throwsException()
    {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("value1");
        opt.getValue(5);
    }

    @Test
    public void testGetValueWithDefault_hasValue_returnsValue()
    {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("actualValue");
        assertEquals("actualValue", opt.getValue("defaultValue"));
    }

    @Test
    public void testGetValueWithDefault_noValue_returnsDefault()
    {
        assertEquals("defaultValue", option.getValue("defaultValue"));
    }

    // ---------- getValues / getValuesList ----------

    @Test
    public void testGetValues_noValues_returnsNull()
    {
        assertNull(option.getValues());
    }

    @Test
    public void testGetValues_withValues_returnsArray()
    {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        String[] values = opt.getValues();
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
    }

    @Test
    public void testGetValuesList_default_emptyList()
    {
        List list = option.getValuesList();
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testGetValuesList_afterAdd_containsValue()
    {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("val");
        List list = opt.getValuesList();
        assertEquals(1, list.size());
        assertEquals("val", list.get(0));
    }

    // ---------- toString ----------

    @Test
    public void testToString_noArgNoType_containsBasicInfo()
    {
        String str = option.toString();
        assertTrue(str.contains("option"));
        assertTrue(str.contains("o"));
    }

    @Test
    public void testToString_withArgAndType_containsAllInfo()
    {
        Option opt = new Option("a", "longA", true, "description here");
        opt.setType(String.class);
        String str = opt.toString();
        assertTrue(str.contains("longA"));
        assertTrue(str.contains("ARG"));
        assertTrue(str.contains("description here"));
        assertTrue(str.contains("String"));
    }

    @Test
    public void testToString_withMultipleArgs_containsArgsPattern()
    {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        String str = opt.toString();
        assertTrue(str.contains("[ARG...]"));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameInstance_returnsTrue()
    {
        assertTrue(option.equals(option));
    }

    @Test
    public void testEquals_null_returnsFalse()
    {
        assertFalse(option.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse()
    {
        assertFalse(option.equals("some string"));
    }

    @Test
    public void testEquals_sameOptAndLongOpt_returnsTrue()
    {
        Option opt1 = new Option("a", "longA", false, "desc1");
        Option opt2 = new Option("a", "longA", true, "desc2");
        assertTrue(opt1.equals(opt2));
    }

    @Test
    public void testEquals_differentOpt_returnsFalse()
    {
        Option opt1 = new Option("a", "desc");
        Option opt2 = new Option("b", "desc");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_differentLongOpt_returnsFalse()
    {
        Option opt1 = new Option("a", "longA", false, "desc");
        Option opt2 = new Option("a", "longB", false, "desc");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_oneNullOpt_returnsFalse()
    {
        Option opt1 = new Option("a", "desc");
        Option opt2 = new Option(null, "longB", false, "desc");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testHashCode_sameOptAndLongOpt_sameHashCode()
    {
        Option opt1 = new Option("a", "longA", false, "desc1");
        Option opt2 = new Option("a", "longA", true, "desc2");
        assertEquals(opt1.hashCode(), opt2.hashCode());
    }

    @Test
    public void testHashCode_nullOptAndLongOpt_noException()
    {
        Option opt = new Option(null, null, false, "desc");
        int hash = opt.hashCode();
        assertEquals(0, hash);
    }

    // ---------- clone ----------

    @Test
    public void testClone_normal_producesEqualCopy()
    {
        Option a = new Option("a", true, "desc");
        Option b = (Option) a.clone();
        assertEquals(a, b);
        assertNotSame(a, b);
    }

    @Test
    public void testClone_independentValuesList()
    {
        Option a = new Option("a", true, "desc");
        a.addValueForProcessing("v1");
        Option b = (Option) a.clone();
        b.getValuesList().clear();
        assertEquals(1, a.getValuesList().size());
        assertEquals(0, b.getValuesList().size());
    }

    @Test
    public void testClone_modifyClonedArgs_originalUnaffected()
    {
        Option a = new Option("a", true, "");
        Option b = (Option) a.clone();
        assertEquals(a, b);
        a.setArgs(2);
        assertFalse(a.equals(b) && a.getArgs() == b.getArgs());
        b.setArgs(2);
        assertEquals(a.getArgs(), b.getArgs());
    }

    // ---------- addValue (deprecated) ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue_deprecatedMethod_throwsException()
    {
        option.addValue("someValue");
    }

    // ---------- addValueForProcessing (package-private) ----------

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_noArgsAllowed_throwsRuntimeException()
    {
        // option has UNINITIALIZED numberOfArgs (no arg option)
        option.addValueForProcessing("value");
    }

    @Test
    public void testAddValueForProcessing_singleArg_addsValue()
    {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("val1");
        assertEquals("val1", opt.getValue());
    }

    @Test
    public void testAddValueForProcessing_withValueSeparator_splitsValues()
    {
        Option opt = new Option("D", true, "desc");
        opt.setArgs(2);
        opt.setValueSeparator('=');
        opt.addValueForProcessing("key=value");
        List values = opt.getValuesList();
        assertEquals(2, values.size());
        assertEquals("key", values.get(0));
        assertEquals("value", values.get(1));
    }

    @Test
    public void testAddValueForProcessing_valueSeparatorWithExtraSeparators_stopsAtLimit()
    {
        Option opt = new Option("D", true, "desc");
        opt.setArgs(2);
        opt.setValueSeparator('=');
        opt.addValueForProcessing("a=b=c");
        List values = opt.getValuesList();
        assertEquals(2, values.size());
        assertEquals("a", values.get(0));
        assertEquals("b=c", values.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_listFull_throwsRuntimeException()
    {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("val1");
        opt.addValueForProcessing("val2");
    }

    // ---------- acceptsArg / requiresArg (package-private) ----------

    @Test
    public void testAcceptsArg_noArgOption_returnsFalse()
    {
        assertFalse(option.acceptsArg());
    }

    @Test
    public void testAcceptsArg_hasArgWithSpace_returnsTrue()
    {
        Option opt = new Option("a", true, "desc");
        assertTrue(opt.acceptsArg());
    }

    @Test
    public void testAcceptsArg_valuesListFull_returnsFalse()
    {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("v1");
        assertFalse(opt.acceptsArg());
    }

    @Test
    public void testAcceptsArg_optionalArgOnly_returnsTrue()
    {
        Option opt = new Option("a", "desc");
        opt.setOptionalArg(true);
        assertTrue(opt.acceptsArg());
    }

    @Test
    public void testRequiresArg_optionalArgTrue_returnsFalse()
    {
        Option opt = new Option("a", true, "desc");
        opt.setOptionalArg(true);
        assertFalse(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_unlimitedValuesNoValues_returnsTrue()
    {
        Option opt = new Option("a", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_unlimitedValuesHasValue_returnsFalse()
    {
        Option opt = new Option("a", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.addValueForProcessing("v1");
        assertFalse(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_normalArg_delegatesToAcceptsArg()
    {
        Option opt = new Option("a", true, "desc");
        assertTrue(opt.requiresArg());
        opt.setArgs(1);
        opt.addValueForProcessing("v1");
        assertFalse(opt.requiresArg());
    }

    // ---------- clearValues (package-private) ----------

    @Test
    public void testClearValues_afterAddingValues_clearsList()
    {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("v1");
        assertEquals(1, opt.getValuesList().size());
        opt.clearValues();
        assertEquals(0, opt.getValuesList().size());
    }
}
