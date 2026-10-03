package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for {@link PosixParser}.
 */
public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
        options.addOption("a", false, "option a without argument");
        options.addOption("b", false, "option b without argument");
        options.addOption("c", true, "option c with argument");
        options.addOption("d", true, "option d with argument");
        options.addOption("foo", false, "multi-character option without hyphen in definition");
        options.addOption("-bar", false, "multi-character option starting with hyphen");
    }

    @Test
    public void testFlatten_emptyArguments_returnsEmptyArray() {
        String[] result = parser.flatten(options, new String[0], false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_doubleHyphenToken_returnsUnchanged() {
        String[] args = new String[]{"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--"}, result);
    }

    @Test
    public void testFlatten_longOptionWithoutEquals_returnsUnchanged() {
        String[] args = new String[]{"--foo", "--bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo", "--bar"}, result);
    }

    @Test
    public void testFlatten_longOptionWithEquals_splitsIntoKeyAndValue() {
        String[] args = new String[]{"--foo=bar", "--key=value=more"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--foo", "bar", "--key", "value=more"}, result);
    }

    @Test
    public void testFlatten_singleHyphen_returnsUnchanged() {
        String[] args = new String[]{"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlatten_singleHyphenOptionPresent_stopAtNonOptionFalse() {
        String[] args = new String[]{"-a", "-b"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testFlatten_singleHyphenOptionPresent_stopAtNonOptionTrue() {
        String[] args = new String[]{"-a", "-b"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testFlatten_singleHyphenOptionUnknown_stopAtNonOptionFalse_ignored() {
        String[] args = new String[]{"-z"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[0], result);
    }

    @Test
    public void testFlatten_singleHyphenOptionUnknown_stopAtNonOptionTrue_eatsTheRest() {
        String[] args = new String[]{"-z", "extra1", "extra2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-z", "extra1", "extra2"}, result);
    }

    @Test
    public void testFlatten_multiCharSingleHyphenOptionDefinedInOptions_addedDirectly() {
        String[] args = new String[]{"--bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--bar"}, result);

        String[] argsHyphen = new String[]{"-bar"};
        String[] resultHyphen = parser.flatten(options, argsHyphen, false);
        assertArrayEquals(new String[]{"-bar"}, resultHyphen);
    }

    @Test
    public void testFlatten_burstMultipleNoArgOptions() {
        String[] args = new String[]{"-ab"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testFlatten_burstOptionWithArgAttached() {
        String[] args = new String[]{"-acValue"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-c", "Value"}, result);
    }

    @Test
    public void testFlatten_burstOptionWithArgAtEnd_noRemainingChars() {
        String[] args = new String[]{"-c"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-c"}, result);
    }

    @Test
    public void testFlatten_burstUnknownOption_stopAtNonOptionFalse() {
        String[] args = new String[]{"-unknown"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-unknown"}, result);
    }

    @Test
    public void testFlatten_burstUnknownOption_stopAtNonOptionTrue_eatsTheRest() {
        String[] args = new String[]{"-unknown", "rest1", "rest2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "unknown", "rest1", "rest2"}, result);
    }

    @Test
    public void testFlatten_burstPartiallyValidThenUnknown_stopAtNonOptionTrue() {
        String[] args = new String[]{"-az", "rest"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "z", "rest"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionFalse_addedDirectly() {
        String[] args = new String[]{"nonOption1", "nonOption2"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"nonOption1", "nonOption2"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionTrue_noCurrentOption_eatsTheRest() {
        String[] args = new String[]{"nonOption1", "nonOption2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "nonOption1", "nonOption2"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionTrue_withCurrentOptionExpectingArg() {
        String[] args = new String[]{"-c", "argValue", "nextNonOption", "after"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-c", "argValue", "--", "nextNonOption", "after"}, result);
    }

    @Test
    public void testBurstToken_directlyCalled_validAndInvalidCases() {
        parser.flatten(options, new String[0], false); // initialize options inside parser

        parser.burstToken("-a", false);
        String[] result1 = parser.flatten(options, new String[]{"-a"}, false);
        assertArrayEquals(new String[]{"-a"}, result1);

        String[] result2 = parser.flatten(options, new String[]{"-cVal"}, false);
        assertArrayEquals(new String[]{"-c", "Val"}, result2);

        String[] result3 = parser.flatten(options, new String[]{"-x"}, false);
        assertArrayEquals(new String[0], result3);
    }

    @Test
    public void testFlatten_multipleCalls_verifyStateReset() {
        String[] args1 = new String[]{"-c", "val", "nonOpt"};
        String[] result1 = parser.flatten(options, args1, true);
        assertArrayEquals(new String[]{"-c", "val", "--", "nonOpt"}, result1);

        String[] args2 = new String[]{"-a"};
        String[] result2 = parser.flatten(options, args2, false);
        assertArrayEquals(new String[]{"-a"}, result2);
    }

    @Test
    public void testParse_integrationThroughParser() throws ParseException {
        String[] args = new String[]{"-a", "-c", "myArg", "extra"};
        CommandLine cl = parser.parse(options, args);
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("c"));
        assertEquals("myArg", cl.getOptionValue("c"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("extra", cl.getArgs()[0]);
    }

    @Test
    public void testParse_stopAtNonOptionIntegration() throws ParseException {
        String[] args = new String[]{"-a", "nonOption", "-b"};
        CommandLine cl = parser.parse(options, args, true);
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("nonOption", cl.getArgs()[0]);
        assertEquals("-b", cl.getArgs()[1]);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullArgumentsArray_throwsException() {
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullOptions_throwsException() {
        parser.flatten(null, new String[]{"-a"}, false);
    }
}
