package org.apache.commons.cli;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class OptionTest
{
    @Test
    public void testConstructorTwoArgs_validInputs_setsFieldsCorrectly()
    {
        Option option = new Option("a", "description");
        assertEquals("a", option.getOpt());
        assertEquals("description", option.getDescription());
        assertNull(option.getLongOpt());
        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testConstructorThreeArgs_withHasArgTrue_setsArgsToOne()
    {
        Option option = new Option("b", true, "desc");
        assertEquals("b", option.getOpt());
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
        assertEquals("desc", option.getDescription());
    }

    @Test
    public void testConstructorThreeArgs_withHasArgFalse_setsArgsToUninitialized()
    {
        Option option = new Option("b", false, "desc");
        assertEquals("b", option.getOpt());
        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testConstructorFourArgs_allParameters_setsAllFields()
    {
        Option option = new Option("c", "long-c", true, "description c");
        assertEquals("c", option.getOpt());
        assertEquals("long-c", option.getLongOpt());
        assertTrue(option.hasLongOpt());
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
        assertEquals("description c", option.getDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidOptionChar_throwsIllegalArgumentException()
    {
        new Option("invalid?", "description");
    }

    @Test
    public void testGetId_shortOptPresent_returnsFirstChar()
    {
        Option option = new Option("x", "description");
        assertEquals('x', option.getId());
    }

    @Test
    public void testGetId_nullOptWithLongOpt_returnsFirstCharOfLongOpt()
    {
        Option option = new Option(null, "longOnly", false, "description");
        assertEquals('l', option.getId());
    }

    @Test
    public void testGetKey_optPresent_returnsOpt()
    {
        Option option = new Option("optKey", "longKey", false, "desc");
        assertEquals("optKey", option.getKey());
    }

    @Test
    public void testGetKey_optNull_returnsLongOpt()
    {
        Option option = new Option(null, "longKey", false, "desc");
        assertEquals("longKey", option.getKey());
    }

    @Test
    public void testSetAndGetType_customObject_returnsSameObject()
    {
        Option option = new Option("t", "desc");
        assertNull(option.getType());
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    @Test
    public void testSetAndGetLongOpt_validString_updatesLongOpt()
    {
        Option option = new Option("l", "desc");
        assertNull(option.getLongOpt());
        assertFalse(option.hasLongOpt());

        option.setLongOpt("myLongOpt");
        assertEquals("myLongOpt", option.getLongOpt());
        assertTrue(option.hasLongOpt());

        option.setLongOpt(null);
        assertNull(option.getLongOpt());
        assertFalse(option.hasLongOpt());
    }

    @Test
    public void testSetAndGetOptionalArg_booleanFlags_updatesCorrectly()
    {
        Option option = new Option("o", "desc");
        assertFalse(option.hasOptionalArg());

        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());

        option.setOptionalArg(false);
        assertFalse(option.hasOptionalArg());
    }

    @Test
    public void testHasArg_differentArgsCount_returnsExpected()
    {
        Option option = new Option("a", "desc");
        option.setArgs(Option.UNINITIALIZED);
        assertFalse(option.hasArg());

        option.setArgs(0);
        assertFalse(option.hasArg());

        option.setArgs(1);
        assertTrue(option.hasArg());

        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArg());
    }

    @Test
    public void testSetAndGetDescription_validString_updatesDescription()
    {
        Option option = new Option("d", "oldDesc");
        assertEquals("oldDesc", option.getDescription());

        option.setDescription("newDesc");
        assertEquals("newDesc", option.getDescription());

        option.setDescription(null);
        assertNull(option.getDescription());
    }

    @Test
    public void testSetAndIsRequired_booleanFlag_updatesCorrectly()
    {
        Option option = new Option("r", "desc");
        assertFalse(option.isRequired());

        option.setRequired(true);
        assertTrue(option.isRequired());

        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    public void testSetAndGetArgName_variousInputs_handlesProperly()
    {
        Option option = new Option("a", "desc");
        assertEquals("arg", option.getArgName());
        assertTrue(option.hasArgName());

        option.setArgName("customArg");
        assertEquals("customArg", option.getArgName());
        assertTrue(option.hasArgName());

        option.setArgName("");
        assertEquals("", option.getArgName());
        assertFalse(option.hasArgName());

        option.setArgName(null);
        assertNull(option.getArgName());
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgs_variousArgsCount_returnsExpected()
    {
        Option option = new Option("a", "desc");
        option.setArgs(Option.UNINITIALIZED);
        assertFalse(option.hasArgs());

        option.setArgs(1);
        assertFalse(option.hasArgs());

        option.setArgs(2);
        assertTrue(option.hasArgs());

        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArgs());
    }

    @Test
    public void testSetAndGetValueSeparator_charValue_updatesCorrectly()
    {
        Option option = new Option("s", "desc");
        assertEquals((char) 0, option.getValueSeparator());
        assertFalse(option.hasValueSeparator());

        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
        assertTrue(option.hasValueSeparator());

        option.setValueSeparator((char) 0);
        assertEquals((char) 0, option.getValueSeparator());
        assertFalse(option.hasValueSeparator());
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_uninitializedArgs_throwsRuntimeException()
    {
        Option option = new Option("u", "desc");
        option.addValueForProcessing("value");
    }

    @Test
    public void testAddValueForProcessing_singleValue_storesValue()
    {
        Option option = new Option("s", true, "desc");
        option.addValueForProcessing("val1");

        assertEquals("val1", option.getValue());
        assertEquals("val1", option.getValue(0));
        assertEquals("val1", option.getValue("default"));
        assertArrayEquals(new String[]{"val1"}, option.getValues());
        List list = option.getValuesList();
        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals("val1", list.get(0));
    }

    @Test
    public void testAddValueForProcessing_withValueSeparator_splitsValuesUpToLimit()
    {
        Option option = new Option("m", "desc");
        option.setArgs(3);
        option.setValueSeparator(',');
        option.addValueForProcessing("val1,val2,val3,val4");

        String[] values = option.getValues();
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
        assertEquals("val3,val4", values[2]);
    }

    @Test
    public void testAddValueForProcessing_withValueSeparator_fewerTokensThanLimit()
    {
        Option option = new Option("m", "desc");
        option.setArgs(5);
        option.setValueSeparator(';');
        option.addValueForProcessing("a;b;c");

        String[] values = option.getValues();
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("a", values[0]);
        assertEquals("b", values[1]);
        assertEquals("c", values[2]);
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_exceedingMaxArgs_throwsRuntimeException()
    {
        Option option = new Option("e", true, "desc");
        option.addValueForProcessing("val1");
        option.addValueForProcessing("val2");
    }

    @Test
    public void testGetValues_noValuesPresent_returnsNull()
    {
        Option option = new Option("n", true, "desc");
        assertNull(option.getValue());
        assertNull(option.getValue(0));
        assertEquals("default", option.getValue("default"));
        assertNull(option.getValues());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueByIndex_indexOutOfBounds_throwsIndexOutOfBoundsException()
    {
        Option option = new Option("i", true, "desc");
        option.addValueForProcessing("value1");
        option.getValue(5);
    }

    @Test
    public void testClearValues_clearsAllValues()
    {
        Option option = new Option("c", true, "desc");
        option.addValueForProcessing("val");
        assertEquals("val", option.getValue());

        option.clearValues();
        assertNull(option.getValue());
        assertNull(option.getValues());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue_deprecatedMethod_throwsUnsupportedOperationException()
    {
        Option option = new Option("a", "desc");
        option.addValue("test");
    }

    @Test
    public void testAcceptsArg_unlimitedValues_returnsTrue()
    {
        Option option = new Option("u", "desc");
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.acceptsArg());
        option.addValueForProcessing("v1");
        assertTrue(option.acceptsArg());
        option.addValueForProcessing("v2");
        assertTrue(option.acceptsArg());
    }

    @Test
    public void testAcceptsArg_optionalArgNoLimit_returnsExpected()
    {
        Option option = new Option("o", "desc");
        option.setOptionalArg(true);
        option.setArgs(1);
        assertTrue(option.acceptsArg());
        option.addValueForProcessing("v1");
        assertFalse(option.acceptsArg());
    }

    @Test
    public void testAcceptsArg_noArgsOption_returnsFalse()
    {
        Option option = new Option("n", false, "desc");
        assertFalse(option.acceptsArg());
    }

    @Test
    public void testRequiresArg_optionalArg_returnsFalse()
    {
        Option option = new Option("o", true, "desc");
        option.setOptionalArg(true);
        assertFalse(option.requiresArg());
    }

    @Test
    public void testRequiresArg_unlimitedValues_requiresAtLeastOne()
    {
        Option option = new Option("u", "desc");
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.requiresArg());

        option.addValueForProcessing("v1");
        assertFalse(option.requiresArg());
    }

    @Test
    public void testRequiresArg_fixedArgs_delegatesToAcceptsArg()
    {
        Option option = new Option("f", true, "desc");
        assertTrue(option.requiresArg());

        option.addValueForProcessing("val");
        assertFalse(option.requiresArg());
    }

    @Test
    public void testToString_variousConfigurations_formatsProperly()
    {
        Option option1 = new Option("a", "simple desc");
        assertEquals("[ option: a  :: simple desc ]", option1.toString());

        Option option2 = new Option("b", "long-b", true, "single arg desc");
        assertEquals("[ option: b long-b  [ARG] :: single arg desc ]", option2.toString());

        Option option3 = new Option("c", "long-c", false, "multiple args desc");
        option3.setArgs(2);
        option3.setType(String.class);
        assertEquals("[ option: c long-c [ARG...] :: multiple args desc :: " + String.class + " ]", option3.toString());
    }

    @Test
    public void testEqualsAndHashCode_comprehensiveBranches()
    {
        Option optA1 = new Option("a", "longA", false, "desc");
        Option optA2 = new Option("a", "longA", false, "desc");
        Option optB = new Option("b", "longA", false, "desc");
        Option optNullLong = new Option("a", null, false, "desc");
        Option optNullShort1 = new Option(null, "longA", false, "desc");
        Option optNullShort2 = new Option(null, "longA", false, "desc");
        Option optNullShortDifferentLong = new Option(null, "longB", false, "desc");

        assertTrue(optA1.equals(optA1));
        assertFalse(optA1.equals(null));
        assertFalse(optA1.equals("NotAnOption"));

        assertTrue(optA1.equals(optA2));
        assertEquals(optA1.hashCode(), optA2.hashCode());

        assertFalse(optA1.equals(optB));
        assertNotEquals(optA1.hashCode(), optB.hashCode());

        assertFalse(optA1.equals(optNullLong));
        assertFalse(optNullLong.equals(optA1));

        assertFalse(optA1.equals(optNullShort1));
        assertFalse(optNullShort1.equals(optA1));

        assertTrue(optNullShort1.equals(optNullShort2));
        assertEquals(optNullShort1.hashCode(), optNullShort2.hashCode());

        assertFalse(optNullShort1.equals(optNullShortDifferentLong));

        Option optBothNull1 = new Option(null, null, false, "desc");
        Option optBothNull2 = new Option(null, null, false, "desc");
        assertTrue(optBothNull1.equals(optBothNull2));
        assertEquals(optBothNull1.hashCode(), optBothNull2.hashCode());
    }

    @Test
    public void testClone_createsDeepCopyOfValuesList()
    {
        Option original = new Option("c", true, "desc");
        original.addValueForProcessing("val1");

        Option cloned = (Option) original.clone();
        assertNotSame(original, cloned);
        assertEquals(original, cloned);
        assertEquals(original.getValuesList(), cloned.getValuesList());
        assertNotSame(original.getValuesList(), cloned.getValuesList());

        cloned.clearValues();
        assertEquals(1, original.getValuesList().size());
        assertEquals(0, cloned.getValuesList().size());
    }
}
