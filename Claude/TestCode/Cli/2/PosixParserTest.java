package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PosixParserTest {

    private PosixParser parser;

    @Before
    public void setUp() {
        parser = new PosixParser();
    }

    // ---------- flatten() tests (protected method, accessible in same package) ----------

    @Test
    public void testFlatten_longOptionWithEquals_splitsIntoTwoTokens() {
        Options options = new Options();
        String[] args = { "--foo=bar" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void testFlatten_longOptionWithoutEquals_addsAsSingleToken() {
        Options options = new Options();
        String[] args = { "--foo" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--foo" }, result);
    }

    @Test
    public void testFlatten_singleHyphenToken_addsHyphenToTokens() {
        Options options = new Options();
        String[] args = { "-" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-" }, result);
    }

    @Test
    public void testFlatten_mixedSpecialTokens_orderIsPreserved() {
        String[] args = { "-", "--", "plain" };

        String[] result = parser.flatten(null, args, false);

        assertArrayEquals(new String[] { "-", "--", "plain" }, result);
    }

    @Test
    public void testFlatten_validShortOption_addsTokenAndSetsCurrentOption() {
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] args = { "-a" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testFlatten_invalidShortOption_stopAtNonOptionTrue_gobblesRemaining() {
        Options options = new Options();
        String[] args = { "-a", "rest" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "rest" }, result);
    }

    @Test
    public void testFlatten_invalidShortOption_stopAtNonOptionFalse_ignoresToken() {
        Options options = new Options();
        String[] args = { "-a" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] {}, result);
    }

    @Test
    public void testFlatten_burstToken_multipleValidOptions_burstsIntoSeparateTokens() {
        Options options = new Options();
        options.addOption("a", false, "desc a");
        options.addOption("b", false, "desc b");
        String[] args = { "-ab" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a", "-b" }, result);
    }

    @Test
    public void testFlatten_burstToken_optionWithArg_addsRemainderAsValue() {
        Options options = new Options();
        options.addOption("a", true, "desc a");
        String[] args = { "-avalue" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a", "value" }, result);
    }

    @Test
    public void testFlatten_burstToken_nonOption_stopAtNonOptionTrue_addsDashDashAndValues() {
        Options options = new Options();
        String[] args = { "-xy" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "--", "xy", "--", "y" }, result);
    }

    @Test
    public void testFlatten_burstToken_nonOption_stopAtNonOptionFalse_addsEachCharAsToken() {
        Options options = new Options();
        String[] args = { "-xy" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-x", "-y" }, result);
    }

    @Test
    public void testFlatten_nonOptionToken_stopAtNonOptionTrue_processedWithDashDash() {
        Options options = new Options();
        String[] args = { "value1" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "--", "value1" }, result);
    }

    @Test
    public void testFlatten_nonOptionToken_stopAtNonOptionFalse_addsDirectly() {
        Options options = new Options();
        String[] args = { "value1" };

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "value1" }, result);
    }

    @Test
    public void testFlatten_currentOptionHasArg_consumesNextNonOptionToken() {
        Options options = new Options();
        options.addOption("a", true, "desc a");
        String[] args = { "-a", "value" };

        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "-a", "value" }, result);
    }

    @Test
    public void testFlatten_emptyArguments_returnsEmptyArray() {
        Options options = new Options();
        String[] args = {};

        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] {}, result);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullArguments_throwsNullPointerException() {
        Options options = new Options();
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullOptionsWithShortOptionToken_throwsNullPointerException() {
        String[] args = { "-a" };
        parser.flatten(null, args, false);
    }

    // ---------- public parse() tests (inherited public method) ----------

    @Test
    public void testParse_publicMethod_withValidShortOption_returnsCommandLine() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] args = { "-a" };

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParse_publicMethod_withOptionValue_returnsCorrectValue() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        String[] args = { "-a", "val" };

        CommandLine cmd = parser.parse(options, args);

        assertEquals("val", cmd.getOptionValue("a"));
    }

    @Test
    public void testParse_publicMethod_withLongOptionEquals_returnsCorrectValue() throws Exception {
        Options options = new Options();
        options.addOption("f", "file", true, "desc");
        String[] args = { "--file=test.txt" };

        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("f"));
        assertEquals("test.txt", cmd.getOptionValue("f"));
    }

    @Test
    public void testParse_publicMethod_withStopAtNonOptionOverload_returnsCommandLine() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] args = { "-a" };

        CommandLine cmd = parser.parse(options, args, false);

        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = ParseException.class)
    public void testParse_publicMethod_missingRequiredOption_throwsParseException() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "desc");
        opt.setRequired(true);
        options.addOption(opt);
        String[] args = {};

        parser.parse(options, args);
    }

    @Test(expected = ParseException.class)
    public void testParse_publicMethod_missingArgumentValue_throwsParseException() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        String[] args = { "-a" };

        parser.parse(options, args);
    }

    @Test(expected = NullPointerException.class)
    public void testParse_publicMethod_nullArguments_throwsNullPointerException() throws Exception {
        Options options = new Options();
        parser.parse(options, null);
    }
}
