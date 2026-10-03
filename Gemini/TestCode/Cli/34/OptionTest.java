package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class OptionTest
{
    @Test
    public void testConstructor_twoArgs_initializesProperly()
    {
        Option option = new Option("a", "description a");
        Assert.assertEquals("a", option.getOpt());
        Assert.assertEquals("description a", option.getDescription());
        Assert.assertNull(option.getLongOpt());
        Assert.assertFalse(option.hasArg());
        Assert.assertFalse(option.hasArgs());
        Assert.assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testConstructor_threeArgs_hasArgTrue()
    {
        Option option = new Option("b", true, "description b");
        Assert.assertEquals("b", option.getOpt());
        Assert.assertEquals("description b", option.getDescription());
        Assert.assertNull(option.getLongOpt());
        Assert.assertTrue(option.hasArg());
        Assert.assertFalse(option.hasArgs());
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void testConstructor_threeArgs_hasArgFalse()
    {
        Option option = new Option("b", false, "description b");
        Assert.assertEquals("b", option.getOpt());
        Assert.assertEquals("description b", option.getDescription());
        Assert.assertNull(option.getLongOpt());
        Assert.assertFalse(option.hasArg());
        Assert.assertFalse(option.hasArgs());
        Assert.assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testConstructor_fourArgs_withLongOpt()
    {
        Option option = new Option("c", "opt-c", true, "description c");
        Assert.assertEquals("c", option.getOpt());
        Assert.assertEquals("opt-c", option.getLongOpt());
        Assert.assertTrue(option.hasLongOpt());
        Assert.assertTrue(option.hasArg());
        Assert.assertEquals("description c", option.getDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidOpt_throwsException()
    {
        new Option("invalid opt", "desc");
    }

    @Test
    public void testGetId_shortOptSingleChar()
    {
        Option option = new Option("x", "desc");
        Assert.assertEquals('x', option.getId());
    }

    @Test
    public void testGetId_nullShortOptUsesLongOpt()
    {
        Option option = new Option(null, "longOption", false, "desc");
        Assert.assertEquals('l', option.getId());
    }

    @Test
    public void testGetKey_optPresent()
    {
        Option option = new Option("k", "key-opt", false, "desc");
        Assert.assertEquals("k", option.getKey());
    }

    @Test
    public void testGetKey_optNullReturnsLongOpt()
    {
        Option option = new Option(null, "key-opt", false, "desc");
        Assert.assertEquals("key-opt", option.getKey());
    }

    @Test
    public void testType_getterAndSetter()
    {
        Option option = new Option("t", "desc");
        Assert.assertNull(option.getType());
        option.setType(String.class);
        Assert.assertEquals(String.class, option.getType());
    }

    @Test
    public void testLongOpt_getterAndSetter()
    {
        Option option = new Option("o", "desc");
        Assert.assertNull(option.getLongOpt());
        Assert.assertFalse(option.hasLongOpt());

        option.setLongOpt("long-opt");
        Assert.assertEquals("long-opt", option.getLongOpt());
        Assert.assertTrue(option.hasLongOpt());

        option.setLongOpt(null);
        Assert.assertNull(option.getLongOpt());
        Assert.assertFalse(option.hasLongOpt());
    }

    @Test
    public void testOptionalArg_getterAndSetter()
    {
        Option option = new Option("o", "desc");
        Assert.assertFalse(option.hasOptionalArg());

        option.setOptionalArg(true);
        Assert.assertTrue(option.hasOptionalArg());

        option.setOptionalArg(false);
        Assert.assertFalse(option.hasOptionalArg());
    }

    @Test
    public void testDescription_getterAndSetter()
    {
        Option option = new Option("d", "desc");
        Assert.assertEquals("desc", option.getDescription());

        option.setDescription("new desc");
        Assert.assertEquals("new desc", option.getDescription());

        option.setDescription(null);
        Assert.assertNull(option.getDescription());
    }

    @Test
    public void testRequired_getterAndSetter()
    {
        Option option = new Option("r", "desc");
        Assert.assertFalse(option.isRequired());

        option.setRequired(true);
        Assert.assertTrue(option.isRequired());

        option.setRequired(false);
        Assert.assertFalse(option.isRequired());
    }

    @Test
    public void testArgName_getterSetterAndHasArgName()
    {
        Option option = new Option("a", "desc");
        Assert.assertNull(option.getArgName());
        Assert.assertFalse(option.hasArgName());

        option.setArgName("");
        Assert.assertEquals("", option.getArgName());
        Assert.assertFalse(option.hasArgName());

        option.setArgName("FILE");
        Assert.assertEquals("FILE", option.getArgName());
        Assert.assertTrue(option.hasArgName());

        option.setArgName(null);
        Assert.assertNull(option.getArgName());
        Assert.assertFalse(option.hasArgName());
    }

    @Test
    public void testArgs_hasArg_hasArgs()
    {
        Option option = new Option("a", "desc");
        Assert.assertFalse(option.hasArg());
        Assert.assertFalse(option.hasArgs());

        option.setArgs(0);
        Assert.assertEquals(0, option.getArgs());
        Assert.assertFalse(option.hasArg());
        Assert.assertFalse(option.hasArgs());

        option.setArgs(1);
        Assert.assertEquals(1, option.getArgs());
        Assert.assertTrue(option.hasArg());
        Assert.assertFalse(option.hasArgs());

        option.setArgs(2);
        Assert.assertEquals(2, option.getArgs());
        Assert.assertTrue(option.hasArg());
        Assert.assertTrue(option.hasArgs());

        option.setArgs(Option.UNLIMITED_VALUES);
        Assert.assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        Assert.assertTrue(option.hasArg());
        Assert.assertTrue(option.hasArgs());

        option.setArgs(Option.UNINITIALIZED);
        Assert.assertEquals(Option.UNINITIALIZED, option.getArgs());
        Assert.assertFalse(option.hasArg());
        Assert.assertFalse(option.hasArgs());
    }

    @Test
    public void testValueSeparator_getterSetterAndHas()
    {
        Option option = new Option("s", "desc");
        Assert.assertEquals(0, option.getValueSeparator());
        Assert.assertFalse(option.hasValueSeparator());

        option.setValueSeparator('=');
        Assert.assertEquals('=', option.getValueSeparator());
        Assert.assertTrue(option.hasValueSeparator());
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_uninitializedThrowsException()
    {
        Option option = new Option("u", "desc");
        option.addValueForProcessing("val");
    }

    @Test
    public void testAddValueForProcessing_singleValue()
    {
        Option option = new Option("v", true, "desc");
        option.addValueForProcessing("hello");
        Assert.assertEquals("hello", option.getValue());
        Assert.assertEquals("hello", option.getValue(0));
        Assert.assertEquals("hello", option.getValue("default"));
        Assert.assertArrayEquals(new String[]{"hello"}, option.getValues());
        Assert.assertEquals(1, option.getValuesList().size());
        Assert.assertEquals("hello", option.getValuesList().get(0));
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_exceedNumberOfArgsThrowsException()
    {
        Option option = new Option("v", true, "desc");
        option.addValueForProcessing("val1");
        option.addValueForProcessing("val2");
    }

    @Test
    public void testAddValueForProcessing_withValueSeparator()
    {
        Option option = new Option("k", "desc");
        option.setArgs(2);
        option.setValueSeparator('=');

        option.addValueForProcessing("key=value");
        Assert.assertArrayEquals(new String[]{"key", "value"}, option.getValues());
    }

    @Test
    public void testAddValueForProcessing_withValueSeparator_multipleSeparatorsAndLimit()
    {
        Option option = new Option("k", "desc");
        option.setArgs(2);
        option.setValueSeparator(':');

        option.addValueForProcessing("a:b:c");
        Assert.assertArrayEquals(new String[]{"a", "b:c"}, option.getValues());
    }

    @Test
    public void testAddValueForProcessing_withValueSeparator_unlimitedArgs()
    {
        Option option = new Option("k", "desc");
        option.setArgs(Option.UNLIMITED_VALUES);
        option.setValueSeparator(',');

        option.addValueForProcessing("item1,item2,item3");
        Assert.assertArrayEquals(new String[]{"item1", "item2", "item3"}, option.getValues());
    }

    @Test
    public void testGetValue_emptyReturnsNullOrDefault()
    {
        Option option = new Option("e", true, "desc");
        Assert.assertNull(option.getValue());
        Assert.assertNull(option.getValue(0));
        Assert.assertEquals("defaultVal", option.getValue("defaultVal"));
        Assert.assertNull(option.getValues());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_indexOutOfBoundsThrowsException()
    {
        Option option = new Option("i", true, "desc");
        option.addValueForProcessing("v");
        option.getValue(2);
    }

    @Test
    public void testToString_variousConfigurations()
    {
        Option optionNoArg = new Option("a", "desc");
        Assert.assertEquals("[ option: a  :: desc ]", optionNoArg.toString());

        Option optionLongOpt = new Option("b", "beta", false, "desc");
        Assert.assertEquals("[ option: b beta  :: desc ]", optionLongOpt.toString());

        Option optionSingleArg = new Option("c", true, "desc");
        Assert.assertEquals("[ option: c  [ARG] :: desc ]", optionSingleArg.toString());

        Option optionMultiArg = new Option("d", "delta", false, "desc");
        optionMultiArg.setArgs(2);
        Assert.assertEquals("[ option: d delta [ARG...] :: desc ]", optionMultiArg.toString());

        Option optionWithType = new Option("e", "desc");
        optionWithType.setType(Integer.class);
        Assert.assertEquals("[ option: e  :: desc :: class java.lang.Integer ]", optionWithType.toString());
    }

    @Test
    public void testEqualsAndHashCode()
    {
        Option opt1 = new Option("a", "alpha", false, "desc");
        Option opt2 = new Option("a", "alpha", false, "desc");
        Option opt3 = new Option("a", "beta", false, "desc");
        Option opt4 = new Option("b", "alpha", false, "desc");
        Option optNull1 = new Option(null, "alpha", false, "desc");
        Option optNull2 = new Option(null, "alpha", false, "desc");
        Option optNoLong1 = new Option("a", "desc");
        Option optNoLong2 = new Option("a", "desc");

        Assert.assertTrue(opt1.equals(opt1));
        Assert.assertTrue(opt1.equals(opt2));
        Assert.assertEquals(opt1.hashCode(), opt2.hashCode());

        Assert.assertFalse(opt1.equals(null));
        Assert.assertFalse(opt1.equals("NotAnOption"));

        Assert.assertFalse(opt1.equals(opt3));
        Assert.assertFalse(opt1.equals(opt4));
        Assert.assertFalse(opt1.equals(optNull1));
        Assert.assertFalse(optNull1.equals(opt1));
        Assert.assertFalse(opt1.equals(optNoLong1));
        Assert.assertFalse(optNoLong1.equals(opt1));

        Assert.assertTrue(optNull1.equals(optNull2));
        Assert.assertEquals(optNull1.hashCode(), optNull2.hashCode());

        Assert.assertTrue(optNoLong1.equals(optNoLong2));
        Assert.assertEquals(optNoLong1.hashCode(), optNoLong2.hashCode());

        Option optBothNull1 = new Option(null, null, false, "desc");
        Option optBothNull2 = new Option(null, null, false, "desc");
        Assert.assertTrue(optBothNull1.equals(optBothNull2));
        Assert.assertEquals(optBothNull1.hashCode(), optBothNull2.hashCode());
    }

    @Test
    public void testClone()
    {
        Option option = new Option("c", true, "desc");
        option.addValueForProcessing("val1");

        Option cloned = (Option) option.clone();
        Assert.assertNotSame(option, cloned);
        Assert.assertEquals(option, cloned);
        Assert.assertEquals(option.getValuesList(), cloned.getValuesList());
        Assert.assertNotSame(option.getValuesList(), cloned.getValuesList());

        cloned.clearValues();
        Assert.assertEquals(1, option.getValuesList().size());
        Assert.assertEquals(0, cloned.getValuesList().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue_deprecatedThrowsException()
    {
        Option option = new Option("x", "desc");
        option.addValue("someVal");
    }

    @Test
    public void testAcceptsArg()
    {
        Option opt = new Option("a", "desc");
        Assert.assertFalse(opt.acceptsArg());

        opt.setOptionalArg(true);
        Assert.assertTrue(opt.acceptsArg());

        opt.setOptionalArg(false);
        opt.setArgs(1);
        Assert.assertTrue(opt.acceptsArg());
        opt.addValueForProcessing("val1");
        Assert.assertFalse(opt.acceptsArg());

        opt.setArgs(Option.UNLIMITED_VALUES);
        Assert.assertTrue(opt.acceptsArg());
        opt.addValueForProcessing("val2");
        Assert.assertTrue(opt.acceptsArg());

        Option zeroArgOpt = new Option("z", "desc");
        zeroArgOpt.setArgs(0);
        zeroArgOpt.setOptionalArg(true);
        Assert.assertTrue(zeroArgOpt.acceptsArg());
    }

    @Test
    public void testRequiresArg()
    {
        Option opt = new Option("r", "desc");
        Assert.assertFalse(opt.requiresArg());

        opt.setOptionalArg(true);
        opt.setArgs(1);
        Assert.assertFalse(opt.requiresArg());

        opt.setOptionalArg(false);
        opt.setArgs(Option.UNLIMITED_VALUES);
        Assert.assertTrue(opt.requiresArg());
        opt.addValueForProcessing("val1");
        Assert.assertFalse(opt.requiresArg());

        Option singleArgOpt = new Option("s", true, "desc");
        Assert.assertTrue(singleArgOpt.requiresArg());
        singleArgOpt.addValueForProcessing("val1");
        Assert.assertFalse(singleArgOpt.requiresArg());
    }

    @Test
    public void testClearValues()
    {
        Option option = new Option("v", true, "desc");
        option.addValueForProcessing("val");
        Assert.assertNotNull(option.getValue());
        option.clearValues();
        Assert.assertNull(option.getValue());
        Assert.assertEquals(0, option.getValuesList().size());
    }
}
