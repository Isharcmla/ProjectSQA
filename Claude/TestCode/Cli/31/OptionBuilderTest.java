import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionBuilderTest
{
    @Before
    public void setUp()
    {
        // Reset the static state of OptionBuilder before each test.
        // Calling create(String) always resets the internal state in its finally block,
        // regardless of success or failure.
        try
        {
            OptionBuilder.create("reset");
        }
        catch (IllegalArgumentException e)
        {
            // ignore - state is still reset
        }
    }

    @Test
    public void testWithLongOpt_setsLongOpt_optionHasLongOpt()
    {
        Option option = OptionBuilder.withLongOpt("longoption").create('a');
        assertEquals("longoption", option.getLongOpt());
    }

    @Test
    public void testHasArg_setsNumberOfArgsToOne()
    {
        Option option = OptionBuilder.hasArg().create('a');
        assertEquals(1, option.getArgs());
        assertTrue(option.hasArg());
    }

    @Test
    public void testHasArgTrue_setsNumberOfArgsToOne()
    {
        Option option = OptionBuilder.hasArg(true).create('a');
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasArgFalse_setsNumberOfArgsToUninitialized()
    {
        Option option = OptionBuilder.hasArg(false).create('a');
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertFalse(option.hasArg());
    }

    @Test
    public void testWithArgName_setsArgName()
    {
        Option option = OptionBuilder.withArgName("myArg").create('a');
        assertEquals("myArg", option.getArgName());
    }

    @Test
    public void testWithArgName_nullValue_setsArgNameNull()
    {
        Option option = OptionBuilder.withArgName(null).create('a');
        assertNull(option.getArgName());
    }

    @Test
    public void testIsRequired_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired().create('a');
        assertTrue(option.isRequired());
    }

    @Test
    public void testWithValueSeparatorChar_setsSeparator()
    {
        Option option = OptionBuilder.withValueSeparator(':').create('a');
        assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void testWithValueSeparatorNoArg_setsEqualsSeparator()
    {
        Option option = OptionBuilder.withValueSeparator().create('a');
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testIsRequiredBoolean_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired(true).create('a');
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequiredBoolean_setsRequiredFalse()
    {
        Option option = OptionBuilder.isRequired(false).create('a');
        assertFalse(option.isRequired());
    }

    @Test
    public void testHasArgs_setsUnlimitedValues()
    {
        Option option = OptionBuilder.hasArgs().create('a');
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasArgsInt_setsNumberOfArgs()
    {
        Option option = OptionBuilder.hasArgs(3).create('a');
        assertEquals(3, option.getArgs());
    }

    @Test
    public void testHasArgsInt_zeroValue_setsNumberOfArgsToZero()
    {
        Option option = OptionBuilder.hasArgs(0).create('a');
        assertEquals(0, option.getArgs());
    }

    @Test
    public void testHasOptionalArg_setsOptionalArgTrueAndNumberOfArgsOne()
    {
        Option option = OptionBuilder.hasOptionalArg().create('a');
        assertTrue(option.hasOptionalArg());
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasOptionalArgs_setsOptionalArgTrueAndUnlimited()
    {
        Option option = OptionBuilder.hasOptionalArgs().create('a');
        assertTrue(option.hasOptionalArg());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testHasOptionalArgsInt_setsOptionalArgTrueAndNumArgs()
    {
        Option option = OptionBuilder.hasOptionalArgs(5).create('a');
        assertTrue(option.hasOptionalArg());
        assertEquals(5, option.getArgs());
    }

    @Test
    public void testWithType_setsType()
    {
        Object type = Number.class;
        Option option = OptionBuilder.withType(type).create('a');
        assertEquals(type, option.getType());
    }

    @Test
    public void testWithType_nullValue_setsTypeNull()
    {
        Option option = OptionBuilder.withType(null).create('a');
        assertNull(option.getType());
    }

    @Test
    public void testWithDescription_setsDescription()
    {
        Option option = OptionBuilder.withDescription("desc").create('a');
        assertEquals("desc", option.getDescription());
    }

    @Test
    public void testWithDescription_nullValue_setsDescriptionNull()
    {
        Option option = OptionBuilder.withDescription(null).create('a');
        assertNull(option.getDescription());
    }

    @Test
    public void testCreateChar_createsOptionWithCorrectOpt()
    {
        Option option = OptionBuilder.create('x');
        assertEquals("x", option.getOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateNoArgs_withoutLongOpt_throwsException()
    {
        OptionBuilder.create();
    }

    @Test
    public void testCreateNoArgs_withoutLongOpt_resetsState()
    {
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        // Verify state has been reset - a subsequent valid build should not
        // carry over any previous configuration.
        Option option = OptionBuilder.withLongOpt("newLong").create('b');
        assertEquals("newLong", option.getLongOpt());
        assertFalse(option.isRequired());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testCreateNoArgs_withLongOpt_createsOption()
    {
        Option option = OptionBuilder.withLongOpt("myLongOpt").create();
        assertEquals("myLongOpt", option.getLongOpt());
        assertNull(option.getOpt());
    }

    @Test
    public void testCreateString_createsOptionWithProperties()
    {
        Option option = OptionBuilder
                .withLongOpt("verbose")
                .withDescription("be verbose")
                .hasArg()
                .withArgName("level")
                .isRequired()
                .withType(String.class)
                .withValueSeparator(',')
                .create("v");

        assertEquals("v", option.getOpt());
        assertEquals("verbose", option.getLongOpt());
        assertEquals("be verbose", option.getDescription());
        assertTrue(option.hasArg());
        assertEquals("level", option.getArgName());
        assertTrue(option.isRequired());
        assertEquals(String.class, option.getType());
        assertEquals(',', option.getValueSeparator());
    }

    @Test
    public void testCreateString_resetsStateAfterCreation()
    {
        OptionBuilder.withLongOpt("first")
                .hasArg()
                .isRequired()
                .create("f");

        // After creation, internal state should be reset to defaults.
        Option second = OptionBuilder.create('s');
        assertNull(second.getLongOpt());
        assertFalse(second.isRequired());
        assertEquals(Option.UNINITIALIZED, second.getArgs());
        assertEquals("arg", second.getArgName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateString_withNullOpt_throwsIllegalArgumentException()
    {
        OptionBuilder.create((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateString_withEmptyOpt_throwsIllegalArgumentException()
    {
        OptionBuilder.create("");
    }

    @Test
    public void testCreateString_resetsStateEvenOnException()
    {
        try
        {
            OptionBuilder.withLongOpt("bad").create((String) null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        // Even though an exception was thrown, the state should be reset.
        Option option = OptionBuilder.create('z');
        assertNull(option.getLongOpt());
    }

    @Test
    public void testMultipleBuilderCallsReturnSameInstance()
    {
        OptionBuilder first = OptionBuilder.withLongOpt("a");
        OptionBuilder second = OptionBuilder.hasArg();
        assertSame(first, second);
    }
}
