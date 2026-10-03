package org.apache.commons.cli;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Test suite for {@link OptionBuilder}.
 */
public class OptionBuilderTest
{
    @Test
    public void testCreateChar_validChar_createsOptionWithDefaults()
    {
        Option opt = OptionBuilder.create('a');
        assertEquals("a", opt.getOpt());
        assertNull(opt.getDescription());
        assertNull(opt.getLongOpt());
        assertNull(opt.getArgName());
        assertNull(opt.getType());
        assertFalse(opt.isRequired());
        assertFalse(opt.hasArg());
        assertFalse(opt.hasOptionalArg());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertEquals((char) 0, opt.getValueSeparator());
    }

    @Test
    public void testCreateString_validString_createsOptionWithAllProperties()
    {
        Option opt = OptionBuilder.withLongOpt("opt-long")
                                  .withDescription("description of opt")
                                  .withArgName("arg-name")
                                  .isRequired()
                                  .hasArg()
                                  .withType(String.class)
                                  .withValueSeparator(':')
                                  .create("opt");

        assertEquals("opt", opt.getOpt());
        assertEquals("opt-long", opt.getLongOpt());
        assertEquals("description of opt", opt.getDescription());
        assertEquals("arg-name", opt.getArgName());
        assertTrue(opt.isRequired());
        assertTrue(opt.hasArg());
        assertEquals(1, opt.getArgs());
        assertEquals(String.class, opt.getType());
        assertEquals(':', opt.getValueSeparator());
    }

    @Test
    public void testCreateNoArg_withLongOpt_createsOptionSuccessfully()
    {
        Option opt = OptionBuilder.withLongOpt("only-long").create();
        assertNull(opt.getOpt());
        assertEquals("only-long", opt.getLongOpt());
    }

    @Test
    public void testCreateNoArg_withoutLongOpt_throwsIllegalArgumentException()
    {
        try
        {
            OptionBuilder.withDescription("missing longopt").create();
            fail("Expected IllegalArgumentException when longopt is not specified");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("must specify longopt", e.getMessage());
        }

        // Verify that properties are reset after exception
        Option opt = OptionBuilder.withLongOpt("recovery").create();
        assertNull(opt.getDescription());
        assertEquals("recovery", opt.getLongOpt());
    }

    @Test
    public void testCreateString_invalidOptionChar_throwsExceptionAndResetsBuilder()
    {
        try
        {
            OptionBuilder.withDescription("invalid opt").create("?");
            fail("Expected IllegalArgumentException for illegal character in opt name");
        }
        catch (IllegalArgumentException e)
        {
            // Expected
        }

        // Verify that the builder was reset in finally block
        Option nextOpt = OptionBuilder.create("valid");
        assertNull(nextOpt.getDescription());
        assertEquals("valid", nextOpt.getOpt());
    }

    @Test
    public void testHasArg_noArg_setsNumberOfArgsToOne()
    {
        Option opt = OptionBuilder.hasArg().create('h');
        assertTrue(opt.hasArg());
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testHasArg_booleanTrue_setsNumberOfArgsToOne()
    {
        Option opt = OptionBuilder.hasArg(true).create('t');
        assertTrue(opt.hasArg());
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testHasArg_booleanFalse_setsNumberOfArgsToUninitialized()
    {
        Option opt = OptionBuilder.hasArg(false).create('f');
        assertFalse(opt.hasArg());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    @Test
    public void testHasArgs_noArg_setsUnlimitedValues()
    {
        Option opt = OptionBuilder.hasArgs().create('m');
        assertTrue(opt.hasArgs());
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
    }

    @Test
    public void testHasArgs_withCount_setsSpecifiedNumberOfArgs()
    {
        Option opt = OptionBuilder.hasArgs(3).create('c');
        assertTrue(opt.hasArgs());
        assertEquals(3, opt.getArgs());
    }

    @Test
    public void testHasArgs_withZeroCount_setsZeroArgs()
    {
        Option opt = OptionBuilder.hasArgs(0).create('z');
        assertFalse(opt.hasArg());
        assertEquals(0, opt.getArgs());
    }

    @Test
    public void testHasOptionalArg_setsOneOptionalArg()
    {
        Option opt = OptionBuilder.hasOptionalArg().create('o');
        assertTrue(opt.hasOptionalArg());
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testHasOptionalArgs_noArg_setsUnlimitedOptionalArgs()
    {
        Option opt = OptionBuilder.hasOptionalArgs().create('u');
        assertTrue(opt.hasOptionalArg());
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
    }

    @Test
    public void testHasOptionalArgs_withCount_setsSpecifiedOptionalArgs()
    {
        Option opt = OptionBuilder.hasOptionalArgs(2).create('p');
        assertTrue(opt.hasOptionalArg());
        assertEquals(2, opt.getArgs());
    }

    @Test
    public void testIsRequired_noArg_setsRequiredToTrue()
    {
        Option opt = OptionBuilder.isRequired().create('r');
        assertTrue(opt.isRequired());
    }

    @Test
    public void testIsRequired_booleanTrue_setsRequiredToTrue()
    {
        Option opt = OptionBuilder.isRequired(true).create('r');
        assertTrue(opt.isRequired());
    }

    @Test
    public void testIsRequired_booleanFalse_setsRequiredToFalse()
    {
        Option opt = OptionBuilder.isRequired(false).create('n');
        assertFalse(opt.isRequired());
    }

    @Test
    public void testWithValueSeparator_noArg_setsDefaultEqualsSeparator()
    {
        Option opt = OptionBuilder.withValueSeparator().create('s');
        assertEquals('=', opt.getValueSeparator());
        assertTrue(opt.hasValueSeparator());
    }

    @Test
    public void testWithValueSeparator_charArg_setsCustomSeparator()
    {
        Option opt = OptionBuilder.withValueSeparator(',').create('c');
        assertEquals(',', opt.getValueSeparator());
        assertTrue(opt.hasValueSeparator());
    }

    @Test
    public void testWithType_setsType()
    {
        Option opt = OptionBuilder.withType(Integer.class).create('i');
        assertEquals(Integer.class, opt.getType());
    }

    @Test
    public void testWithArgName_setsArgName()
    {
        Option opt = OptionBuilder.withArgName("file").create('f');
        assertEquals("file", opt.getArgName());
    }

    @Test
    public void testWithDescription_setsDescription()
    {
        Option opt = OptionBuilder.withDescription("help message").create('h');
        assertEquals("help message", opt.getDescription());
    }

    @Test
    public void testReset_clearsStateBetweenCreations()
    {
        Option opt1 = OptionBuilder.withLongOpt("first")
                                   .withDescription("first desc")
                                   .withArgName("firstArg")
                                   .isRequired()
                                   .hasArg()
                                   .withType(Double.class)
                                   .withValueSeparator(';')
                                   .create('1');

        assertEquals("first", opt1.getLongOpt());
        assertEquals("first desc", opt1.getDescription());
        assertEquals("firstArg", opt1.getArgName());
        assertTrue(opt1.isRequired());
        assertEquals(1, opt1.getArgs());
        assertEquals(Double.class, opt1.getType());
        assertEquals(';', opt1.getValueSeparator());

        Option opt2 = OptionBuilder.create('2');
        assertNull(opt2.getLongOpt());
        assertNull(opt2.getDescription());
        assertNull(opt2.getArgName());
        assertFalse(opt2.isRequired());
        assertEquals(Option.UNINITIALIZED, opt2.getArgs());
        assertNull(opt2.getType());
        assertEquals((char) 0, opt2.getValueSeparator());
    }

    @Test
    public void testEdgeCases_nullAndEmptyValues()
    {
        Option opt = OptionBuilder.withLongOpt("")
                                  .withDescription("")
                                  .withArgName("")
                                  .withType(null)
                                  .create("");

        assertEquals("", opt.getOpt());
        assertEquals("", opt.getLongOpt());
        assertEquals("", opt.getDescription());
        assertEquals("", opt.getArgName());
        assertNull(opt.getType());
    }
}
