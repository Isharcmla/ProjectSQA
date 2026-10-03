package org.apache.commons.cli;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class OptionBuilderTest
{
    @Test
    public void testPrivateConstructor_instantiationViaReflection_succeeds() throws Exception
    {
        Constructor<OptionBuilder> constructor = OptionBuilder.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        OptionBuilder instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testCreate_char_createsOptionWithSingleChar()
    {
        Option option = OptionBuilder.withDescription("simple option").create('s');

        assertNotNull(option);
        assertEquals("s", option.getOpt());
        assertEquals("simple option", option.getDescription());
        assertNull(option.getLongOpt());
        assertFalse(option.isRequired());
        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertEquals("arg", option.getArgName());
        assertEquals((char) 0, option.getValueSeparator());
    }

    @Test
    public void testCreate_string_createsOptionWithAllProperties()
    {
        Option option = OptionBuilder.withLongOpt("fullOption")
                                     .withDescription("full description")
                                     .withArgName("customArg")
                                     .isRequired()
                                     .hasArg()
                                     .withType(String.class)
                                     .withValueSeparator(':')
                                     .create("f");

        assertNotNull(option);
        assertEquals("f", option.getOpt());
        assertEquals("fullOption", option.getLongOpt());
        assertEquals("fullDescription", "full description", option.getDescription());
        assertEquals("customArg", option.getArgName());
        assertTrue(option.isRequired());
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
        assertEquals(String.class, option.getType());
        assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void testCreate_noArgWithLongOpt_createsOptionWithNullOpt()
    {
        Option option = OptionBuilder.withLongOpt("onlyLong")
                                     .withDescription("only long description")
                                     .create();

        assertNotNull(option);
        assertNull(option.getOpt());
        assertEquals("onlyLong", option.getLongOpt());
        assertEquals("only long description", option.getDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate_noArgWithoutLongOpt_throwsIllegalArgumentException()
    {
        OptionBuilder.withDescription("missing long opt").create();
    }

    @Test
    public void testCreate_invalidCharOpt_resetsStateEvenOnException()
    {
        try
        {
            // '?' is an invalid option character in Commons CLI
            OptionBuilder.withLongOpt("invalid").create('?');
            fail("Expected IllegalArgumentException for invalid option character");
        }
        catch (IllegalArgumentException e)
        {
            // Expected exception
        }

        // Verify state is reset properly even after an exception
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException because longopt should be reset");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("must specify longopt", e.getMessage());
        }
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
    public void testHasArg_booleanFalse_setsUninitializedArgs()
    {
        Option option = OptionBuilder.hasArg(false).create("a");

        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testHasArgs_noParams_setsUnlimitedArgs()
    {
        Option option = OptionBuilder.hasArgs().create("a");

        assertTrue(option.hasArgs());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasArgs_specificNumber_setsArgsCount()
    {
        Option option = OptionBuilder.hasArgs(3).create("a");

        assertTrue(option.hasArgs());
        assertEquals(3, option.getArgs());
    }

    @Test
    public void testHasArgs_zeroAndNegative_setsArgsCount()
    {
        Option optionZero = OptionBuilder.hasArgs(0).create("z");
        assertEquals(0, optionZero.getArgs());

        Option optionNegative = OptionBuilder.hasArgs(-2).create("n");
        assertEquals(-2, optionNegative.getArgs());
    }

    @Test
    public void testHasOptionalArg_noParams_setsOptionalArgWithOneArg()
    {
        Option option = OptionBuilder.hasOptionalArg().create("opt");

        assertTrue(option.hasOptionalArg());
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasOptionalArgs_noParams_setsUnlimitedOptionalArgs()
    {
        Option option = OptionBuilder.hasOptionalArgs().create("opt");

        assertTrue(option.hasOptionalArg());
        assertTrue(option.hasArgs());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasOptionalArgs_specificNumber_setsOptionalArgsCount()
    {
        Option option = OptionBuilder.hasOptionalArgs(5).create("opt");

        assertTrue(option.hasOptionalArg());
        assertTrue(option.hasArgs());
        assertEquals(5, option.getArgs());
    }

    @Test
    public void testIsRequired_noParams_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired().create("req");

        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_booleanTrue_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired(true).create("req");

        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_booleanFalse_setsRequiredFalse()
    {
        Option option = OptionBuilder.isRequired(false).create("notReq");

        assertFalse(option.isRequired());
    }

    @Test
    public void testWithValueSeparator_noParams_setsDefaultSeparatorEquals()
    {
        Option option = OptionBuilder.withValueSeparator().create("sep");

        assertTrue(option.hasValueSeparator());
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testWithValueSeparator_char_setsSpecifiedSeparator()
    {
        Option option = OptionBuilder.withValueSeparator(',').create("sep");

        assertTrue(option.hasValueSeparator());
        assertEquals(',', option.getValueSeparator());
    }

    @Test
    public void testWithType_object_setsCustomType()
    {
        Object customType = Number.class;
        Option option = OptionBuilder.withType(customType).create("typeOpt");

        assertEquals(customType, option.getType());
    }

    @Test
    public void testWithType_null_setsNullType()
    {
        Option option = OptionBuilder.withType(null).create("nullType");

        assertNull(option.getType());
    }

    @Test
    public void testWithArgName_customAndNull_setsArgName()
    {
        Option optionCustom = OptionBuilder.withArgName("customName").create("c");
        assertEquals("customName", optionCustom.getArgName());

        Option optionNull = OptionBuilder.withArgName(null).create("n");
        assertNull(optionNull.getArgName());

        Option optionEmpty = OptionBuilder.withArgName("").create("e");
        assertEquals("", optionEmpty.getArgName());
    }

    @Test
    public void testWithDescription_customAndNull_setsDescription()
    {
        Option optionCustom = OptionBuilder.withDescription("some desc").create("d");
        assertEquals("some desc", optionCustom.getDescription());

        Option optionNull = OptionBuilder.withDescription(null).create("n");
        assertNull(optionNull.getDescription());
    }

    @Test
    public void testWithLongOpt_emptyAndNull_setsLongOpt()
    {
        Option optionEmpty = OptionBuilder.withLongOpt("").create("e");
        assertEquals("", optionEmpty.getLongOpt());

        Option optionNull = OptionBuilder.withLongOpt(null).create("n");
        assertNull(optionNull.getLongOpt());
    }

    @Test
    public void testStateResetBetweenCreations_ensuresCleanStateForSubsequentOption()
    {
        Option first = OptionBuilder.withLongOpt("firstLong")
                                    .withDescription("first desc")
                                    .withArgName("firstArg")
                                    .isRequired()
                                    .hasArgs(2)
                                    .withType(Integer.class)
                                    .withValueSeparator(';')
                                    .create("first");

        assertNotNull(first);

        Option second = OptionBuilder.create("second");

        assertNotNull(second);
        assertEquals("second", second.getOpt());
        assertNull(second.getLongOpt());
        assertNull(second.getDescription());
        assertEquals("arg", second.getArgName());
        assertFalse(second.isRequired());
        assertEquals(Option.UNINITIALIZED, second.getArgs());
        assertNull(second.getType());
        assertEquals((char) 0, second.getValueSeparator());
        assertFalse(second.hasOptionalArg());
    }
}
