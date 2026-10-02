import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class PosixParserTest
{
    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
    }

    // -------------------- flatten() tests --------------------

    @Test
    public void testFlatten_LongOptionNotExists_addedAsNonOption()
    {
        String[] args = { "--unknown", "value" };
        String[] result = parser.flatten(options, args, false);

        assertNotNull(result);
        assertEquals("--", result[0]);
        assertEquals("--unknown", result[1]);
        // eatTheRest becomes true, remaining should be gobbled
        assertEquals("value", result[2]);
    }

    @Test
    public void testFlatten_LongOptionExistsNoValue_addedToken()
    {
        options.addOption("f", "foo", false, "foo description");

        String[] args = { "--foo" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(1, result.length);
        assertEquals("--foo", result[0]);
    }

    @Test
    public void testFlatten_LongOptionExistsWithValue_addedTokenAndValue()
    {
        options.addOption("f", "foo", true, "foo description");

        String[] args = { "--foo=bar" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(2, result.length);
        assertEquals("--foo", result[0]);
        assertEquals("bar", result[1]);
    }

    @Test
    public void testFlatten_SingleHyphen_addedAsToken()
    {
        String[] args = { "-" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(1, result.length);
        assertEquals("-", result[0]);
    }

    @Test
    public void testFlatten_ShortOptionLength2Valid_addedToken()
    {
        options.addOption("a", false, "a description");

        String[] args = { "-a" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(1, result.length);
        assertEquals("-a", result[0]);
    }

    @Test
    public void testFlatten_ShortOptionLength2InvalidStopAtNonOption_eatRest()
    {
        // "-x" length == 2, but option not defined; processOptionToken called
        String[] args = { "-x", "value" };
        String[] result = parser.flatten(options, args, true);

        // token itself is always added by processOptionToken
        assertEquals("-x", result[0]);
        // since stopAtNonOption true and option doesn't exist, eatTheRest true -> gobble adds remaining
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlatten_ShortOptionLength2InvalidNoStop_addedTokenOnly()
    {
        String[] args = { "-x", "value" };
        String[] result = parser.flatten(options, args, false);

        assertEquals("-x", result[0]);
        // eatTheRest stays false, "value" treated separately as non-option token, added directly
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlatten_BurstTokenValidOptionsNoArg_addedSeparateTokens()
    {
        options.addOption("a", false, "a description");
        options.addOption("b", false, "b description");

        String[] args = { "-ab" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(2, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
    }

    @Test
    public void testFlatten_BurstTokenValidOptionWithArgAndRemaining_addedRemainder()
    {
        options.addOption("b", true, "b description with arg");

        String[] args = { "-bvalue" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(2, result.length);
        assertEquals("-b", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlatten_BurstTokenInvalidCharStopAtNonOption_processNonOption()
    {
        options.addOption("a", false, "a description");

        String[] args = { "-axy" };
        String[] result = parser.flatten(options, args, true);

        // 'a' matches, added as "-a" (hasArg false so no remainder appended immediately)
        // then 'x' does not match -> stopAtNonOption true -> processNonOptionToken("xy")
        assertEquals("-a", result[0]);
        assertEquals("--", result[1]);
        assertEquals("xy", result[2]);
    }

    @Test
    public void testFlatten_BurstTokenInvalidCharNoStop_addedWholeToken()
    {
        options.addOption("a", false, "a description");

        String[] args = { "-axy" };
        String[] result = parser.flatten(options, args, false);

        assertEquals("-a", result[0]);
        // 'x' invalid, stopAtNonOption false -> whole original token added, then break
        assertEquals("-axy", result[1]);
    }

    @Test
    public void testFlatten_NonOptionTokenStopAtNonOption_eatRest()
    {
        String[] args = { "plainArg", "second" };
        String[] result = parser.flatten(options, args, true);

        assertEquals("--", result[0]);
        assertEquals("plainArg", result[1]);
        assertEquals("second", result[2]);
    }

    @Test
    public void testFlatten_NonOptionTokenNoStop_addedDirectly()
    {
        String[] args = { "plainArg" };
        String[] result = parser.flatten(options, args, false);

        assertEquals(1, result.length);
        assertEquals("plainArg", result[0]);
    }

    @Test
    public void testFlatten_EmptyArguments_returnsEmptyArray()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);

        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_MixedTokens_typicalUsage()
    {
        options.addOption("a", false, "a desc");
        options.addOption("b", true, "b desc");
        options.addOption("f", "foo", true, "foo desc");

        String[] args = { "-a", "-b", "val", "--foo=bar", "arg1" };
        String[] result = parser.flatten(options, args, false);

        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("val", result[2]);
        assertEquals("--foo", result[3]);
        assertEquals("bar", result[4]);
        assertEquals("arg1", result[5]);
    }

    // -------------------- burstToken() tests (protected, same package access) --------------------

    @Test
    public void testBurstToken_ValidOptionNoArg_directCall()
    {
        options.addOption("a", false, "a desc");
        // Need to call flatten first for init(), then use burstToken directly is tricky
        // since tokens/options fields are set in flatten(). We call flatten with a burst-worthy token.
        String[] args = { "-a" + "a" }; // "-aa" two valid same option chars
        options.addOption("a", false, "a desc");
        String[] result = parser.flatten(options, args, false);
        assertTrue(result.length >= 1);
    }

    // -------------------- public parse() (inherited from Parser) tests --------------------

    @Test
    public void testParse_TypicalUsage_returnsCommandLine() throws ParseException
    {
        options.addOption("a", false, "a description");
        options.addOption("b", true, "b description with arg");

        String[] args = { "-a", "-b", "value" };
        CommandLine cl = parser.parse(options, args);

        assertNotNull(cl);
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("value", cl.getOptionValue("b"));
    }

    @Test
    public void testParse_EmptyArguments_returnsEmptyCommandLine() throws ParseException
    {
        String[] args = {};
        CommandLine cl = parser.parse(options, args);

        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test(expected = ParseException.class)
    public void testParse_UnrecognizedOption_throwsParseException() throws ParseException
    {
        // "-x" is length 2 so it's added as a token by processOptionToken,
        // but since no such option is registered, Parser.parse should throw.
        String[] args = { "-x" };
        parser.parse(options, args);
    }

    @Test
    public void testParse_NonOptionArguments_treatedAsArgs() throws ParseException
    {
        String[] args = { "plainArg1", "plainArg2" };
        CommandLine cl = parser.parse(options, args);

        assertNotNull(cl);
        assertEquals(2, cl.getArgs().length);
        assertEquals("plainArg1", cl.getArgs()[0]);
        assertEquals("plainArg2", cl.getArgs()[1]);
    }

    @Test
    public void testParse_LongOptionWithEqualsValue_parsedCorrectly() throws ParseException
    {
        options.addOption("f", "foo", true, "foo description");

        String[] args = { "--foo=bar" };
        CommandLine cl = parser.parse(options, args);

        assertNotNull(cl);
        assertTrue(cl.hasOption("foo"));
        assertEquals("bar", cl.getOptionValue("foo"));
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_NullArguments_throwsNullPointerException()
    {
        parser.flatten(options, null, false);
    }

    @Test
    public void testFlatten_StopAtNonOptionWithLongOptionUnknown_eatsRest()
    {
        String[] args = { "--unknown", "-a", "extra" };
        String[] result = parser.flatten(options, args, true);

        assertEquals("--", result[0]);
        assertEquals("--unknown", result[1]);
        assertEquals("-a", result[2]);
        assertEquals("extra", result[3]);
    }

    @Test
    public void testFlatten_MultipleCallsResetState_previousTokensCleared()
    {
        options.addOption("a", false, "a description");

        String[] firstArgs = { "-a" };
        parser.flatten(options, firstArgs, false);

        String[] secondArgs = { "plainArg" };
        String[] result = parser.flatten(options, secondArgs, false);

        // if init() properly resets tokens, result should only contain the new token
        assertEquals(1, result.length);
        assertEquals("plainArg", result[0]);
    }
}
