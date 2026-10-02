import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionBuilderTest
{
    @Before
    public void setUp()
    {
        // force OptionBuilder to reset its internal static state before each test
        // by creating a dummy option (create() resets the builder's fields)
        OptionBuilder.create("resetToken");
    }

    // ---------- withLongOpt ----------
    @Test
    public void testWithLongOpt_setsLongOpt_onCreatedOption()
    {
        Option option = OptionBuilder.withLongOpt("file").create('f');
        assertEquals("file", option.getLongOpt());
    }

    // ---------- hasArg() ----------
    @Test
    public void testHasArg_noParam_setsNumberOfArgsToOne()
    {
        Option option = OptionBuilder.hasArg().create('a');
        assertEquals(1, option.getArgs());
        assertTrue(option.hasArg());
    }

    // ---------- hasArg(boolean) ----------
    @Test
    public void testHasArg_true_setsNumberOfArgsToOne()
    {
        Option option = OptionBuilder.hasArg(true).create('a');
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasArg_false_setsNumberOfArgsToUninitialized()
    {
        Option option = OptionBuilder.hasArg(false).create('a');
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    // ---------- withArgName ----------
    @Test
    public void testWithArgName_setsArgName()
    {
        Option option = OptionBuilder.withArgName("FILE").create('f');
        assertEquals("FILE", option.getArgName());
    }

    @Test
    public void testWithArgName_emptyString_setsEmptyArgName()
    {
        Option option = OptionBuilder.withArgName("").create('f');
        assertEquals("", option.getArgName());
    }

    // ---------- isRequired() ----------
    @Test
    public void testIsRequired_noParam_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired().create('r');
        assertTrue(option.isRequired());
    }

    // ---------- isRequired(boolean) ----------
    @Test
    public void testIsRequired_true_setsRequiredTrue()
    {
        Option option = OptionBuilder.isRequired(true).create('r');
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_false_setsRequiredFalse()
    {
        Option option = OptionBuilder.isRequired(false).create('r');
        assertFalse(option.isRequired());
    }

    // ---------- withValueSeparator(char) ----------
    @Test
    public void testWithValueSeparator_char_setsSeparator()
    {
        Option option = OptionBuilder.withValueSeparator(':').create('D');
        assertEquals(':', option.getValueSeparator());
    }

    // ---------- withValueSeparator() ----------
    @Test
    public void testWithValueSeparator_default_setsEqualsSeparator()
    {
        Option option = OptionBuilder.withValueSeparator().create('D');
        assertEquals('=', option.getValueSeparator());
    }

    // ---------- hasArgs() ----------
    @Test
    public void testHasArgs_setsUnlimitedValues()
    {
        Option option = OptionBuilder.hasArgs().create('a');
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    // ---------- hasArgs(int) ----------
    @Test
    public void testHasArgs_withNum_setsSpecifiedNumber()
    {
        Option option = OptionBuilder.hasArgs(3).create('a');
        assertEquals(3, option.getArgs());
    }

    @Test
    public void testHasArgs_withZero_setsZero()
    {
        Option option = OptionBuilder.hasArgs(0).create('a');
        assertEquals(0, option.getArgs());
    }

    @Test
    public void testHasArgs_withNegativeNum_setsNegativeNumber()
    {
        Option option = OptionBuilder.hasArgs(-5).create('a');
        assertEquals(-5, option.getArgs());
    }

    // ---------- hasOptionalArg() ----------
    @Test
    public void testHasOptionalArg_setsArgsAndOptionalFlag()
    {
        Option option = OptionBuilder.hasOptionalArg().create('a');
        assertEquals(1, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    // ---------- hasOptionalArgs() ----------
    @Test
    public void testHasOptionalArgs_setsUnlimitedAndOptionalFlag()
    {
        Option option = OptionBuilder.hasOptionalArgs().create('a');
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    // ---------- hasOptionalArgs(int) ----------
    @Test
    public void testHasOptionalArgs_withNum_setsSpecifiedNumberAndOptionalFlag()
    {
        Option option = OptionBuilder.hasOptionalArgs(5).create('a');
        assertEquals(5, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    // ---------- withType ----------
    @Test
    public void testWithType_setsType()
    {
        Option option = OptionBuilder.withType(Number.class).create('n');
        assertEquals(Number.class, option.getType());
    }

    @Test
    public void testWithType_null_setsNullType()
    {
        Option option = OptionBuilder.withType(null).create('n');
        assertNull(option.getType());
    }

    // ---------- withDescription ----------
    @Test
    public void testWithDescription_setsDescription()
    {
        Option option = OptionBuilder.withDescription("desc").create('d');
        assertEquals("desc", option.getDescription());
    }

    @Test
    public void testWithDescription_null_setsNullDescription()
    {
        Option option = OptionBuilder.withDescription(null).create('d');
        assertNull(option.getDescription());
    }

    // ---------- create(char) ----------
    @Test
    public void testCreateChar_returnsOptionWithOptChar()
    {
        Option option = OptionBuilder.create('x');
        assertEquals("x", option.getOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateChar_invalidChar_throwsIllegalArgumentException()
    {
        OptionBuilder.create('=');
    }

    // ---------- create() ----------
    @Test
    public void testCreateNoArgs_withLongOptSet_returnsOption()
    {
        Option option = OptionBuilder.withLongOpt("verbose").create();
        assertNull(option.getOpt());
        assertEquals("verbose", option.getLongOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateNoArgs_withoutLongOpt_throwsIllegalArgumentException()
    {
        OptionBuilder.create();
    }

    // ---------- create(String) ----------
    @Test
    public void testCreateString_returnsOptionWithOptString()
    {
        Option option = OptionBuilder.create("test");
        assertEquals("test", option.getOpt());
    }

    @Test
    public void testCreateString_null_withLongOptSet_returnsOptionWithNullOpt()
    {
        Option option = OptionBuilder.withLongOpt("myopt").create((String) null);
        assertNull(option.getOpt());
        assertEquals("myopt", option.getLongOpt());
    }

    // ---------- default argName ----------
    @Test
    public void testCreate_defaultArgName_isArg()
    {
        Option option = OptionBuilder.create('a');
        assertEquals("arg", option.getArgName());
    }

    // ---------- state reset after creation ----------
    @Test
    public void testCreate_resetsStateAfterCreation()
    {
        Option first = OptionBuilder.withLongOpt("first")
                .isRequired()
                .hasArg()
                .withDescription("firstDesc")
                .withArgName("firstArg")
                .withType(String.class)
                .withValueSeparator(':')
                .create('a');

        assertEquals("first", first.getLongOpt());
        assertTrue(first.isRequired());

        Option second = OptionBuilder.create('b');

        assertNull(second.getLongOpt());
        assertFalse(second.isRequired());
        assertEquals(Option.UNINITIALIZED, second.getArgs());
        assertNull(second.getDescription());
        assertEquals("arg", second.getArgName());
        assertNull(second.getType());
        assertEquals((char) 0, second.getValueSeparator());
    }

    // ---------- chaining multiple builder methods ----------
    @Test
    public void testMultipleChaining_setsAllProperties()
    {
        Option option = OptionBuilder.withLongOpt("verbose")
                .withDescription("desc")
                .hasArg()
                .withArgName("val")
                .isRequired()
                .withType(String.class)
                .withValueSeparator(',')
                .create('v');

        assertEquals("v", option.getOpt());
        assertEquals("verbose", option.getLongOpt());
        assertEquals("desc", option.getDescription());
        assertEquals(1, option.getArgs());
        assertEquals("val", option.getArgName());
        assertTrue(option.isRequired());
        assertEquals(String.class, option.getType());
        assertEquals(',', option.getValueSeparator());
    }
}
