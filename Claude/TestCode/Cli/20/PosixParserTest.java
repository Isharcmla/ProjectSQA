package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PosixParserTest {

    /**
     * Helper subclass to expose the protected flatten() method for direct testing.
     */
    private static class TestablePosixParser extends PosixParser {
        public String[] callFlatten(Options options, String[] arguments, boolean stopAtNonOption) {
            return flatten(options, arguments, stopAtNonOption);
        }
    }

    private TestablePosixParser testableParser;
    private PosixParser parser;

    @Before
    public void setUp() {
        testableParser = new TestablePosixParser();
        parser = new PosixParser();
    }

    // ---------- Normal / typical cases ----------

    @Test
    public void testFlatten_longOptionWithoutEquals_addsTokenDirectly() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"--foo"}, false);
        assertArrayEquals(new String[] {"--foo"}, result);
    }

    @Test
    public void testFlatten_longOptionWithEquals_splitsIntoTwoTokens() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"--foo=bar"}, false);
        assertArrayEquals(new String[] {"--foo", "bar"}, result);
    }

    @Test
    public void testFlatten_singleHyphen_addsTokenDirectly() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"-"}, false);
        assertArrayEquals(new String[] {"-"}, result);
    }

    @Test
    public void testFlatten_doubleHyphenAlone_addsTokenDirectly() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"--"}, false);
        assertArrayEquals(new String[] {"--"}, result);
    }

    @Test
    public void testFlatten_twoCharOptionValid_addsTokenAndSetsCurrentOption() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        String[] result = testableParser.callFlatten(options, new String[] {"-a"}, false);
        assertArrayEquals(new String[] {"-a"}, result);
    }

    @Test
    public void testFlatten_tokenLengthGreaterThanTwoAndHasOption_addsWholeToken() {
        Options options = new Options();
        options.addOption("abc", false, "option abc");
        String[] result = testableParser.callFlatten(options, new String[] {"-abc"}, false);
        assertArrayEquals(new String[] {"-abc"}, result);
    }

    @Test
    public void testFlatten_burstToken_allSingleCharsValidNoArgs() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        String[] result = testableParser.callFlatten(options, new String[] {"-ab"}, false);
        assertArrayEquals(new String[] {"-a", "-b"}, result);
    }

    @Test
    public void testFlatten_burstToken_withArgumentValue() {
        Options options = new Options();
        options.addOption("a", true, "option a with arg");
        String[] result = testableParser.callFlatten(options, new String[] {"-avalue"}, false);
        assertArrayEquals(new String[] {"-a", "value"}, result);
    }

    @Test
    public void testFlatten_normalTokenNotOption_stopAtNonOptionFalse_addsDirectly() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"value"}, false);
        assertArrayEquals(new String[] {"value"}, result);
    }

    @Test
    public void testFlatten_normalTokenAfterOptionWithArg_stopAtNonOptionTrue_processesArgument() {
        Options options = new Options();
        options.addOption("a", true, "option a with arg");
        String[] result = testableParser.callFlatten(options, new String[] {"-a", "value"}, true);
        assertArrayEquals(new String[] {"-a", "value"}, result);
    }

    // ---------- Edge cases ----------

    @Test
    public void testFlatten_emptyArguments_returnsEmptyArray() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[0], false);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_twoCharOptionInvalid_stopAtNonOptionFalse_addsTokenWithoutEating() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"-x"}, false);
        assertArrayEquals(new String[] {"-x"}, result);
    }

    @Test
    public void testFlatten_twoCharOptionInvalid_stopAtNonOptionTrue_eatsRemainingTokens() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"-x", "y", "z"}, true);
        assertArrayEquals(new String[] {"-x", "y", "z"}, result);
    }

    @Test
    public void testFlatten_burstToken_nonOptionChar_stopAtNonOptionFalse_addsWholeToken() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"-xyz"}, false);
        assertArrayEquals(new String[] {"-xyz"}, result);
    }

    @Test
    public void testFlatten_burstToken_nonOptionChar_stopAtNonOptionTrue_processesAndEatsRemainder() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"-xyz", "more"}, true);
        assertArrayEquals(new String[] {"--", "xyz", "more"}, result);
    }

    @Test
    public void testFlatten_normalTokenNoCurrentOption_stopAtNonOptionTrue_addsDoubleHyphenAndValue() {
        Options options = new Options();
        String[] result = testableParser.callFlatten(options, new String[] {"value"}, true);
        assertArrayEquals(new String[] {"--", "value"}, result);
    }

    @Test
    public void testFlatten_calledTwice_reinitializesStateCorrectly() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        String[] firstResult = testableParser.callFlatten(options, new String[] {"-a"}, false);
        assertArrayEquals(new String[] {"-a"}, firstResult);

        String[] secondResult = testableParser.callFlatten(options, new String[] {"value"}, false);
        assertArrayEquals(new String[] {"value"}, secondResult);
    }

    // ---------- Exception cases ----------

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullArguments_throwsNullPointerException() {
        Options options = new Options();
        testableParser.callFlatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullOptionsWithShortOption_throwsNullPointerException() {
        testableParser.callFlatten(null, new String[] {"-a"}, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullOptionsWithBurstToken_throwsNullPointerException() {
        testableParser.callFlatten(null, new String[] {"-abc"}, false);
    }

    // ---------- Public API (inherited parse methods) integration tests ----------

    @Test
    public void testParse_shortOptionNoArg_returnsCommandLineWithOption() throws ParseException {
        Options options = new Options();
        options.addOption("a", false, "enable a");
        CommandLine cmd = parser.parse(options, new String[] {"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_optionWithArgument_returnsExpectedValue() throws ParseException {
        Options options = new Options();
        options.addOption("b", true, "b with arg");
        CommandLine cmd = parser.parse(options, new String[] {"-b", "value"});
        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test
    public void testParse_stopAtNonOptionTrue_preservesRemainingArguments() throws ParseException {
        Options options = new Options();
        options.addOption("a", false, "a");
        CommandLine cmd = parser.parse(options, new String[] {"-a", "nonoption", "extra"}, true);
        assertNotNull(cmd.getArgs());
        assertTrue(cmd.getArgs().length > 0);
    }

    @Test
    public void testParse_noArguments_returnsCommandLineWithNoOptions() throws ParseException {
        Options options = new Options();
        options.addOption("a", false, "a");
        CommandLine cmd = parser.parse(options, new String[0]);
        assertFalse(cmd.hasOption("a"));
        assertEquals(0, cmd.getArgs().length);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedOption_throwsParseException() throws ParseException {
        Options options = new Options();
        parser.parse(options, new String[] {"-z"});
    }
}
