package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for {@link PosixParser} targeting high branch and line coverage.
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
    public void testFlatten_doubleHyphenWithEquals_splitsIntoTwoTokens() {
        String[] args = new String[]{"--output=file.txt"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--output", "file.txt"}, result);
    }

    @Test
    public void testFlatten_doubleHyphenWithoutEquals_keepsTokenIntact() {
        String[] args = new String[]{"--output"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--output"}, result);
    }

    @Test
    public void testFlatten_doubleHyphenAlone_keepsTokenIntact() {
        String[] args = new String[]{"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--"}, result);
    }

    @Test
    public void testFlatten_singleHyphen_processedAsSingleHyphenToken() {
        String[] args = new String[]{"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlatten_validTwoCharOption_stopAtNonOptionFalse_tokenAdded() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlatten_validTwoCharOption_stopAtNonOptionTrue_tokenAdded() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlatten_invalidTwoCharOption_stopAtNonOptionFalse_tokenIgnored() {
        String[] args = new String[]{"-z", "nextArg"};
        String[] result = parser.flatten(options, args, false);
        // -z is ignored since it's not a recognized option, nextArg is added
        assertArrayEquals(new String[]{"nextArg"}, result);
    }

    @Test
    public void testFlatten_invalidTwoCharOption_stopAtNonOptionTrue_eatsTheRest() {
        String[] args = new String[]{"-z", "nextArg1", "nextArg2"};
        String[] result = parser.flatten(options, args, true);
        // -z triggers eatTheRest, remaining arguments are gobbled
        assertArrayEquals(new String[]{"nextArg1", "nextArg2"}, result);
    }

    @Test
    public void testFlatten_longOptionWithSingleHyphen_matchedDirectly() {
        options.addOption("foo", false, "long option starting with single hyphen");
        String[] args = new String[]{"-foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-foo"}, result);
    }

    @Test
    public void testFlatten_burstToken_allValidNoArgs_burstsAllOptions() {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");

        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    public void testFlatten_burstToken_optionWithArgAttached_burstsAndAddsRemainingAsArg() {
        options.addOption("a", false, "option a");
        Option b = OptionBuilder.hasArg().create('b');
        options.addOption(b);

        String[] args = new String[]{"-abFilename.txt"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "Filename.txt"}, result);
    }

    @Test
    public void testFlatten_burstToken_unrecognizedChar_stopAtNonOptionFalse_keepsOriginalToken() {
        options.addOption("a", false, "option a");
        // 'z' is not a recognized option, stopAtNonOption is false
        String[] args = new String[]{"-az"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-az"}, result);
    }

    @Test
    public void testFlatten_burstToken_firstCharUnrecognized_stopAtNonOptionFalse_keepsOriginalToken() {
        // -xyz has length > 2, not in options, first char 'x' not in options
        String[] args = new String[]{"-xyz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-xyz"}, result);
    }

    @Test
    public void testFlatten_burstToken_unrecognizedChar_stopAtNonOptionTrue_eatsTheRestWithDashDash() {
        options.addOption("a", false, "option a");
        // 'z' is unrecognized, stopAtNonOption is true -> calls process("z"), gobble next
        String[] args = new String[]{"-az", "extra1", "extra2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "z", "extra1", "extra2"}, result);
    }

    @Test
    public void testFlatten_burstToken_firstCharUnrecognized_stopAtNonOptionTrue_eatsTheRestWithDashDash() {
        String[] args = new String[]{"-xyz", "remaining"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "xyz", "remaining"}, result);
    }

    @Test
    public void testFlatten_nonOptionTokens_stopAtNonOptionFalse_addedAsIs() {
        String[] args = new String[]{"file1.txt", "file2.txt"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"file1.txt", "file2.txt"}, result);
    }

    @Test
    public void testFlatten_nonOptionToken_stopAtNonOptionTrue_withoutCurrentOption_eatsTheRestWithDashDash() {
        String[] args = new String[]{"file1.txt", "file2.txt"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "file1.txt", "file2.txt"}, result);
    }

    @Test
    public void testFlatten_nonOptionToken_stopAtNonOptionTrue_withCurrentOptionConsumingArg() {
        Option a = OptionBuilder.hasArg().create('a');
        options.addOption(a);

        String[] args = new String[]{"-a", "argValue", "nonOptionFollowUp", "tail"};
        String[] result = parser.flatten(options, args, true);
        // -a sets currentOption, "argValue" is consumed by -a, then "nonOptionFollowUp" has currentOption=null so triggers "--"
        assertArrayEquals(new String[]{"-a", "argValue", "--", "nonOptionFollowUp", "tail"}, result);
    }

    @Test
    public void testParse_endToEndCommandLineParsing() throws Exception {
        options.addOption("a", false, "flag a");
        options.addOption("b", true, "option b with arg");

        String[] args = new String[]{"-a", "-b", "val", "extra"};
        CommandLine cmd = parser.parse(options, args);

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("val", cmd.getOptionValue("b"));
        assertEquals(1, cmd.getArgs().length);
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    public void testParse_multipleRuns_initResetsStateProperly() throws Exception {
        options.addOption("a", true, "option a with arg");

        // Run 1
        String[] args1 = new String[]{"-a", "val1"};
        CommandLine cmd1 = parser.parse(options, args1);
        assertEquals("val1", cmd1.getOptionValue("a"));

        // Run 2 with empty args should not retain previous state
        String[] args2 = new String[]{};
        CommandLine cmd2 = parser.parse(options, args2);
        assertFalse(cmd2.hasOption("a"));
    }
}
