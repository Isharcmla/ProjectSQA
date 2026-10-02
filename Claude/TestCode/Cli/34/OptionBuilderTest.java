import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class OptionBuilderTest
{
    @After
    public void resetBuilderState()
    {
        // ensure static state of OptionBuilder is reset after each test
        try
        {
            OptionBuilder.create('a');
        }
        catch (IllegalArgumentException e)
        {
            // ignore, state should already have been reset by create()
        }
    }

    @Test
    public void testWithLongOpt_normalInput_returnsInstanceAndSetsLongOpt()
    {
        OptionBuilder builder = OptionBuilder.withLongOpt("file");
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.withLongOpt("file").create('f');
        Assert.assertEquals("file", option.getLongOpt());
        Assert.assertEquals("f", option.getOpt());
    }

    @Test
    public void testWithLongOpt_nullInput_acceptsNull()
    {
        Option option = OptionBuilder.withLongOpt(null).create('f');
        Assert.assertNull(option.getLongOpt());
    }

    @Test
    public void testHasArg_normalCall_setsNumberOfArgsToOne()
    {
        Option option = OptionBuilder.hasArg().create('f');
        Assert.assertTrue(option.hasArg());
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasArgBoolean_true_setsNumberOfArgsToOne()
    {
        Option option = OptionBuilder.hasArg(true).create('f');
        Assert.assertTrue(option.hasArg());
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasArgBoolean_false_setsNumberOfArgsToUninitialized()
    {
        Option option = OptionBuilder.hasArg(false).create('f');
        Assert.assertFalse(option.hasArg());
    }

    @Test
    public void testWithArgName_normalInput_setsArgName()
    {
        Option option = OptionBuilder.withArgName("file").create('f');
        Assert.assertEquals("file", option.getArgName());
    }

    @Test
    public void testWithArgName_emptyString_setsEmptyArgName()
    {
        Option option = OptionBuilder.withArgName("").create('f');
        Assert.assertEquals("", option.getArgName());
    }

    @Test
    public void testIsRequired_normalCall_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired().create('f');
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequiredBoolean_true_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired(true).create('f');
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequiredBoolean_false_setsRequiredFalse()
    {
        Option option = OptionBuilder.isRequired(false).create('f');
        Assert.assertFalse(option.isRequired());
    }

    @Test
    public void testWithValueSeparatorChar_normalInput_setsValueSeparator()
    {
        Option option = OptionBuilder.withValueSeparator(':').create('f');
        Assert.assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void testWithValueSeparator_defaultCall_setsEqualsSign()
    {
        Option option = OptionBuilder.withValueSeparator().create('f');
        Assert.assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testHasArgs_normalCall_setsUnlimitedValues()
    {
        Option option = OptionBuilder.hasArgs().create('f');
        Assert.assertTrue(option.hasArgs());
    }

    @Test
    public void testHasArgsInt_normalInput_setsNumberOfArgs()
    {
        Option option = OptionBuilder.hasArgs(3).create('f');
        Assert.assertEquals(3, option.getArgs());
    }

    @Test
    public void testHasArgsInt_zero_setsNumberOfArgsZero()
    {
        Option option = OptionBuilder.hasArgs(0).create('f');
        Assert.assertEquals(0, option.getArgs());
    }

    @Test
    public void testHasArgsInt_negativeValue_setsNegativeArgs()
    {
        Option option = OptionBuilder.hasArgs(-5).create('f');
        Assert.assertEquals(-5, option.getArgs());
    }

    @Test
    public void testHasOptionalArg_normalCall_setsOptionalArgTrue()
    {
        Option option = OptionBuilder.hasOptionalArg().create('f');
        Assert.assertTrue(option.hasOptionalArg());
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasOptionalArgs_normalCall_setsUnlimitedOptionalArgs()
    {
        Option option = OptionBuilder.hasOptionalArgs().create('f');
        Assert.assertTrue(option.hasOptionalArg());
        Assert.assertTrue(option.hasArgs());
    }

    @Test
    public void testHasOptionalArgsInt_normalInput_setsSpecifiedNumberOfOptionalArgs()
    {
        Option option = OptionBuilder.hasOptionalArgs(4).create('f');
        Assert.assertTrue(option.hasOptionalArg());
        Assert.assertEquals(4, option.getArgs());
    }

    @Test
    public void testWithType_normalInput_setsType()
    {
        Option option = OptionBuilder.withType(String.class).create('f');
        Assert.assertEquals(String.class, option.getType());
    }

    @Test
    public void testWithType_nullInput_setsTypeNull()
    {
        Option option = OptionBuilder.withType(null).create('f');
        Assert.assertNull(option.getType());
    }

    @Test
    public void testWithDescription_normalInput_setsDescription()
    {
        Option option = OptionBuilder.withDescription("a description").create('f');
        Assert.assertEquals("a description", option.getDescription());
    }

    @Test
    public void testWithDescription_nullInput_setsDescriptionNull()
    {
        Option option = OptionBuilder.withDescription(null).create('f');
        Assert.assertNull(option.getDescription());
    }

    @Test
    public void testCreateChar_normalInput_returnsOptionWithGivenOpt()
    {
        Option option = OptionBuilder.withDescription("desc").create('x');
        Assert.assertEquals("x", option.getOpt());
        Assert.assertEquals("desc", option.getDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateChar_invalidCharacter_throwsIllegalArgumentException()
    {
        OptionBuilder.create(' ');
    }

    @Test
    public void testCreateNoArgs_longOptSet_returnsOptionWithNullOpt()
    {
        Option option = OptionBuilder.withLongOpt("file").create();
        Assert.assertEquals("file", option.getLongOpt());
        Assert.assertNull(option.getOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateNoArgs_longOptNotSet_throwsIllegalArgumentException()
    {
        OptionBuilder.create();
    }

    @Test
    public void testCreateString_normalInput_returnsOptionWithGivenOpt()
    {
        Option option = OptionBuilder.withDescription("a description")
                .withLongOpt("file")
                .create("f");

        Assert.assertEquals("f", option.getOpt());
        Assert.assertEquals("file", option.getLongOpt());
        Assert.assertEquals("a description", option.getDescription());
    }

    @Test
    public void testCreateString_nullOpt_returnsOptionWithNullOpt()
    {
        Option option = OptionBuilder.withLongOpt("file").create((String) null);
        Assert.assertNull(option.getOpt());
        Assert.assertEquals("file", option.getLongOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateString_invalidOpt_throwsIllegalArgumentException()
    {
        OptionBuilder.create("invalid opt!");
    }

    @Test
    public void testCreateString_resetsStateAfterCreation()
    {
        Option firstOption = OptionBuilder.withLongOpt("first")
                .hasArg()
                .isRequired()
                .withDescription("first desc")
                .create('a');

        Assert.assertEquals("first", firstOption.getLongOpt());
        Assert.assertTrue(firstOption.isRequired());

        // after create(), internal static state should have been reset
        Option secondOption = OptionBuilder.create('b');
        Assert.assertNull(secondOption.getLongOpt());
        Assert.assertFalse(secondOption.isRequired());
        Assert.assertNull(secondOption.getDescription());
        Assert.assertFalse(secondOption.hasArg());
    }

    @Test
    public void testCreateString_stateResetEvenWhenExceptionThrown()
    {
        OptionBuilder.withDescription("desc").withLongOpt("opt1");
        try
        {
            OptionBuilder.create("invalid opt!");
            Assert.fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        // verify state was reset despite the exception
        Option option = OptionBuilder.create('z');
        Assert.assertNull(option.getLongOpt());
        Assert.assertNull(option.getDescription());
    }

    @Test
    public void testChainedBuilderMethods_combinedUsage_setsAllProperties()
    {
        Option option = OptionBuilder.withLongOpt("longName")
                .hasArgs(2)
                .withArgName("ARG")
                .isRequired(true)
                .withValueSeparator(',')
                .withType(Integer.class)
                .withDescription("combined test")
                .create('c');

        Assert.assertEquals("c", option.getOpt());
        Assert.assertEquals("longName", option.getLongOpt());
        Assert.assertEquals(2, option.getArgs());
        Assert.assertEquals("ARG", option.getArgName());
        Assert.assertTrue(option.isRequired());
        Assert.assertEquals(',', option.getValueSeparator());
        Assert.assertEquals(Integer.class, option.getType());
        Assert.assertEquals("combined test", option.getDescription());
    }
}
