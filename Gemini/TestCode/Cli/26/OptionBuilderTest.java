package org.apache.commons.cli;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class OptionBuilderTest
{
    @Test
    public void testWithLongOpt_validString_setsLongOpt()
    {
        Option option = OptionBuilder.withLongOpt("help").create('h');
        assertEquals("help", option.getLongOpt());
    }

    @Test
    public void testWithLongOpt_nullString_setsNullLongOpt()
    {
        Option option = OptionBuilder.withLongOpt(null).create('h');
        assertNull(option.getLongOpt());
    }

    @Test
    public void testHasArg_noParams_setsSingleArg()
    {
        Option option = OptionBuilder.hasArg().create("a");
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasArg_booleanTrue_setsSingleArg()
    {
        Option option = OptionBuilder.hasArg(true).create("a");
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasArg_booleanFalse_setsNoArg()
    {
        Option option = OptionBuilder.hasArg(false).create("a");
        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testWithArgName_validName_setsArgName()
    {
        Option option = OptionBuilder.withArgName("file").create("f");
        assertEquals("file", option.getArgName());
    }

    @Test
    public void testWithArgName_nullAndEmpty_setsArgName()
    {
        Option optionNull = OptionBuilder.withArgName(null).create("n");
        assertNull(optionNull.getArgName());

        Option optionEmpty = OptionBuilder.withArgName("").create("e");
        assertEquals("", optionEmpty.getArgName());
    }

    @Test
    public void testIsRequired_noParams_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired().create("r");
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_booleanTrue_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired(true).create("r");
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_booleanFalse_setsRequiredFalse()
    {
        Option option = OptionBuilder.isRequired(false).create("r");
        assertFalse(option.isRequired());
    }

    @Test
    public void testWithValueSeparator_charParam_setsValueSeparator()
    {
        Option option = OptionBuilder.withValueSeparator(':').create("D");
        assertTrue(option.hasValueSeparator());
        assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void testWithValueSeparator_noParams_setsDefaultEqualsSeparator()
    {
        Option option = OptionBuilder.withValueSeparator().create("D");
        assertTrue(option.hasValueSeparator());
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testHasArgs_noParams_setsUnlimitedArgs()
    {
        Option option = OptionBuilder.hasArgs().create("m");
        assertTrue(option.hasArgs());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasArgs_positiveNumber_setsSpecificArgs()
    {
        Option option = OptionBuilder.hasArgs(3).create("m");
        assertTrue(option.hasArgs());
        assertEquals(3, option.getArgs());
    }

    @Test
    public void testHasArgs_zeroAndNegative_setsArgs()
    {
        Option optionZero = OptionBuilder.hasArgs(0).create("z");
        assertEquals(0, optionZero.getArgs());

        Option optionNeg = OptionBuilder.hasArgs(-2).create("n");
        assertEquals(-2, optionNeg.getArgs());
    }

    @Test
    public void testHasOptionalArg_noParams_setsOptionalAndSingleArg()
    {
        Option option = OptionBuilder.hasOptionalArg().create("o");
        assertTrue(option.hasOptionalArg());
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasOptionalArgs_noParams_setsOptionalAndUnlimitedArgs()
    {
        Option option = OptionBuilder.hasOptionalArgs().create("o");
        assertTrue(option.hasOptionalArg());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasOptionalArgs_positiveNumber_setsOptionalAndSpecificArgs()
    {
        Option option = OptionBuilder.hasOptionalArgs(4).create("o");
        assertTrue(option.hasOptionalArg());
        assertEquals(4, option.getArgs());
    }

    @Test
    public void testWithType_objectParam_setsType()
    {
        Option option = OptionBuilder.withType(Integer.class).create("t");
        assertEquals(Integer.class, option.getType());
    }

    @Test
    public void testWithType_nullParam_setsNullType()
    {
        Option option = OptionBuilder.withType(null).create("t");
        assertNull(option.getType());
    }

    @Test
    public void testWithDescription_validString_setsDescription()
    {
        Option option = OptionBuilder.withDescription("description text").create("d");
        assertEquals("description text", option.getDescription());
    }

    @Test
    public void testWithDescription_nullAndEmpty_setsDescription()
    {
        Option optionNull = OptionBuilder.withDescription(null).create("d");
        assertNull(optionNull.getDescription());

        Option optionEmpty = OptionBuilder.withDescription("").create("e");
        assertEquals("", optionEmpty.getDescription());
    }

    @Test
    public void testCreate_charParam_createsOption()
    {
        Option option = OptionBuilder.create('o');
        assertEquals("o", option.getOpt());
    }

    @Test
    public void testCreate_noParamsWithLongOpt_createsOption()
    {
        Option option = OptionBuilder.withLongOpt("only-long").create();
        assertNull(option.getOpt());
        assertEquals("only-long", option.getLongOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate_noParamsWithoutLongOpt_throwsIllegalArgumentException()
    {
        OptionBuilder.create();
    }

    @Test
    public void testCreate_invalidOptChar_throwsIllegalArgumentException()
    {
        try
        {
            OptionBuilder.create('?');
            fail("Expected IllegalArgumentException for '?' option name");
        }
        catch (IllegalArgumentException expected)
        {
            // Expected exception
        }
    }

    @Test
    public void testCreate_invalidOptString_throwsIllegalArgumentException()
    {
        try
        {
            OptionBuilder.create("opt with spaces");
            fail("Expected IllegalArgumentException for opt with spaces");
        }
        catch (IllegalArgumentException expected)
        {
            // Expected exception
        }
    }

    @Test
    public void testFluentChaining_allMethods_createsFullyConfiguredOption()
    {
        Option option = OptionBuilder
                .withLongOpt("full-option")
                .withDescription("full description")
                .withArgName("fullArg")
                .isRequired(true)
                .hasArgs(2)
                .withType(String.class)
                .withValueSeparator(';')
                .create("f");

        assertEquals("f", option.getOpt());
        assertEquals("full-option", option.getLongOpt());
        assertEquals("full description", option.getDescription());
        assertEquals("fullArg", option.getArgName());
        assertTrue(option.isRequired());
        assertEquals(2, option.getArgs());
        assertEquals(String.class, option.getType());
        assertEquals(';', option.getValueSeparator());
    }

    @Test
    public void testReset_afterCreate_resetsBuilderStateToDefaults()
    {
        OptionBuilder
                .withLongOpt("previous-long")
                .withDescription("previous description")
                .withArgName("previousArg")
                .isRequired()
                .hasArgs(5)
                .hasOptionalArgs()
                .withType(Double.class)
                .withValueSeparator(',')
                .create("p");

        Option nextOption = OptionBuilder.create("n");

        assertEquals("n", nextOption.getOpt());
        assertNull(nextOption.getLongOpt());
        assertNull(nextOption.getDescription());
        assertEquals("arg", nextOption.getArgName());
        assertFalse(nextOption.isRequired());
        assertEquals(Option.UNINITIALIZED, nextOption.getArgs());
        assertFalse(nextOption.hasOptionalArg());
        assertNull(nextOption.getType());
        assertEquals((char) 0, nextOption.getValueSeparator());
    }

    @Test
    public void testReset_afterCreateException_resetsBuilderState()
    {
        OptionBuilder.withDescription("will fail");

        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException when longOpt is null");
        }
        catch (IllegalArgumentException expected)
        {
            // Expected
        }

        Option nextOption = OptionBuilder.create("x");
        assertNull(nextOption.getDescription());
    }
}
