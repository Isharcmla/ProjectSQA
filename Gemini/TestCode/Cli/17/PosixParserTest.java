package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit test suite for {@link PosixParser}.
 */
public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    @Test
    public void testFlatten_emptyArguments_returnsEmptyArray() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_longOptionWithEquals_splitsIntoTwoTokens() {
        String[] args = new String[]{"--output=file.txt"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--output", "file.txt"}, result);
    }

    @Test
    public void testFlatten_longOptionWithoutEquals_preservesToken() {
        String[] args = new String[]{"--verbose"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--verbose"}, result);
    }

    @Test
    public void testFlatten_doubleHyphenToken_preservesToken() {
        String[] args = new String[]{"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--"}, result);
    }

    @Test
    public void testFlatten_singleHyphenToken_preservesToken() {
        String[] args = new String[]{"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlatten_knownSingleHyphenOption_addsTokenAndSetsCurrentOption() {
        Option optA = new Option("a", "alpha", false, "alpha option");
        options.addOption(optA);

        String[] args = new String[]{"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlatten_unknownSingleHyphenOption_stopAtNonOptionTrue_eatsRemainingTokens() {
        String[] args = new String[]{"-z", "arg1", "arg2"};
        String[] result = parser.flatten(options, args, true);
        // Unknown option with stopAtNonOption=true triggers eatTheRest without adding "-z"
        assertArrayEquals(new String[]{"arg1", "arg2"}, result);
    }

    @Test
    public void testFlatten_unknownSingleHyphenOption_stopAtNonOptionFalse_ignoresOptionToken() {
        String[] args = new String[]{"-z", "arg1"};
        String[] result = parser.flatten(options, args, false);
        // Unknown option with stopAtNonOption=false ignores "-z" and processes "arg1"
        assertArrayEquals(new String[]{"arg1"}, result);
    }

    @Test
    public void testFlatten_multiCharOptionDefinedInOptions_addsTokenDirectly() {
        Option optFoo = new Option("foo", "option foo");
        options.addOption(optFoo);

        String[] args = new String[]{"-foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-foo"}, result);
    }

    @Test
    public void testBurstToken_multipleSingleCharOptions_burstsAllOptions() {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");

        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    public void testBurstToken_optionWithAttachedArgument_splitsOptionAndArgument() {
        Option optA = new Option("a", true, "option a with arg");
        options.addOption(optA);

        String[] args = new String[]{"-aValue"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "Value"}, result);
    }

    @Test
    public void testBurstToken_optionWithEmptyAttachedValueAtEnd() {
        Option optA = new Option("a", true, "option a with arg");
        options.addOption(optA);

        String[] args = new String[]{"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testBurstToken_unknownOption_stopAtNonOptionTrue_processesRemainingSubstring() {
        options.addOption("a", false, "option a");

        // 'a' is known, 'x' and 'y' are not known
        String[] args = new String[]{"-axy", "extraArg"};
        String[] result = parser.flatten(options, args, true);
        // -a processed, then burst reaches 'x' which is unknown with stopAtNonOption=true -> process("xy")
        // since currentOption 'a' has no arg, process("xy") marks eatTheRest, adds "--", "xy" and gobbles "extraArg"
        assertArrayEquals(new String[]{"-a", "--", "xy", "extraArg"}, result);
    }

    @Test
    public void testBurstToken_unknownOption_stopAtNonOptionFalse_addsWholeTokenAndBreaks() {
        options.addOption("a", false, "option a");

        String[] args = new String[]{"-axy"};
        String[] result = parser.flatten(options, args, false);
        // -a processed, then burst reaches 'x' which is unknown with stopAtNonOption=false -> adds "-axy" and breaks
        assertArrayEquals(new String[]{"-a", "-axy"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionTrue_withCurrentOptionExpectingArg() {
        Option optA = new Option("a", true, "option a requiring arg");
        options.addOption(optA);

        String[] args = new String[]{"-a", "argumentValue", "extraValue"};
        String[] result = parser.flatten(options, args, true);
        // -a consumes "argumentValue" as its argument and resets currentOption to null;
        // next "extraValue" has currentOption == null, so it triggers "--", "extraValue"
        assertArrayEquals(new String[]{"-a", "argumentValue", "--", "extraValue"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionTrue_noCurrentOption_eatsTheRestWithDoubleHyphen() {
        String[] args = new String[]{"nonOption1", "nonOption2"};
        String[] result = parser.flatten(options, args, true);
        // Non-option with stopAtNonOption=true, currentOption is null -> adds "--", "nonOption1", and gobbles "nonOption2"
        assertArrayEquals(new String[]{"--", "nonOption1", "nonOption2"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionFalse_addsAllDirectly() {
        String[] args = new String[]{"nonOption1", "nonOption2"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"nonOption1", "nonOption2"}, result);
    }

    @Test
    public void testFlatten_multipleInvocations_reinitializesProperly() {
        options.addOption("a", false, "option a");
        String[] args1 = new String[]{"-a", "file1"};
        String[] result1 = parser.flatten(options, args1, false);
        assertArrayEquals(new String[]{"-a", "file1"}, result1);

        String[] args2 = new String[]{"-a"};
        String[] result2 = parser.flatten(options, args2, false);
        assertArrayEquals(new String[]{"-a"}, result2);
    }

    @Test
    public void testParse_integrationWithCommandLineParsing() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b");
        options.addOption("c", false, "option c");

        String[] args = new String[]{"-ab", "bValue", "extra1", "extra2"};
        CommandLine cl = parser.parse(options, args, false);

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("bValue", cl.getOptionValue("b"));
        assertArrayEquals(new String[]{"extra1", "extra2"}, cl.getArgs());
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullArgumentsArray_throwsNullPointerException() {
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullOptions_throwsNullPointerException() {
        String[] args = new String[]{"-a"};
        parser.flatten(null, args, false);
    }
}
