package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertArrayEquals(new String[0], result);
    }

    @Test
    public void testFlatten_longOptionWithoutEquals_addsToken() {
        options.addOption("foo", false, "foo option");
        String[] args = new String[]{"--foo"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--foo"}, result);
    }

    @Test
    public void testFlatten_longOptionWithEquals_splitsIntoTwoTokens() {
        options.addOption("foo", true, "foo option with arg");
        String[] args = new String[]{"--foo=bar"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--foo", "bar"}, result);
    }

    @Test
    public void testFlatten_singleHyphen_addsSingleHyphenToken() {
        String[] args = new String[]{"-"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlatten_twoHyphens_addsDoubleHyphenToken() {
        String[] args = new String[]{"--"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--"}, result);
    }

    @Test
    public void testFlatten_singleCharacterValidOption_setsCurrentOptionAndAddsToken() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlatten_singleCharacterInvalidOptionStopAtNonOptionFalse_addsToken() {
        String[] args = new String[]{"-z"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-z"}, result);
    }

    @Test
    public void testFlatten_singleCharacterInvalidOptionStopAtNonOptionTrue_eatsTheRest() {
        String[] args = new String[]{"-z", "extra1", "extra2"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"-z", "extra1", "extra2"}, result);
    }

    @Test
    public void testFlatten_multiCharOptionRecognizedDirectly_addsToken() {
        options.addOption("foo", false, "multi-char option");
        String[] args = new String[]{"-foo"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-foo"}, result);
    }

    @Test
    public void testFlatten_burstMultipleShortOptions_burstsIntoSeparateTokens() {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");
        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    public void testFlatten_burstOptionWithAttachedArgument_splitsOptionAndArgument() {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b with arg");
        String[] args = new String[]{"-abValue"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b", "Value"}, result);
    }

    @Test
    public void testFlatten_burstOptionWithArgAtEnd_doesNotBurstFurther() {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b with arg");
        String[] args = new String[]{"-ab"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testFlatten_burstInvalidCharacterStopAtNonOptionFalse_addsWholeTokenAndStopsBursting() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-azb"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-azb"}, result);
    }

    @Test
    public void testFlatten_burstInvalidCharacterStopAtNonOptionTrue_processesRemainingAndEatsTheRest() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-azb", "remaining"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"-a", "--", "zb", "remaining"}, result);
    }

    @Test
    public void testFlatten_nonOptionTokenWithStopAtNonOptionFalse_addsToken() {
        String[] args = new String[]{"nonOption1", "nonOption2"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"nonOption1", "nonOption2"}, result);
    }

    @Test
    public void testFlatten_nonOptionTokenWithStopAtNonOptionTrueAndCurrentOptionHasArg_consumesArg() {
        options.addOption("a", true, "option a with arg");
        String[] args = new String[]{"-a", "argValue", "other"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"-a", "argValue", "--", "other"}, result);
    }

    @Test
    public void testFlatten_nonOptionTokenWithStopAtNonOptionTrueAndNoCurrentOption_eatsTheRestWithDashDash() {
        String[] args = new String[]{"nonOption", "another"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"--", "nonOption", "another"}, result);
    }

    @Test
    public void testParse_usingPosixParser_parsesCommandLineSuccessfully() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b");
        String[] args = new String[]{"-a", "-b", "value", "extra"};

        CommandLine cl = parser.parse(options, args);
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("value", cl.getOptionValue("b"));
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("extra", cl.getArgs()[0]);
    }

    @Test
    public void testParse_multipleInvocations_resetsInternalStateCorrectly() throws Exception {
        options.addOption("a", false, "option a");
        String[] args1 = new String[]{"-a"};
        CommandLine cl1 = parser.parse(options, args1);
        Assert.assertTrue(cl1.hasOption("a"));

        String[] args2 = new String[]{"nonOption"};
        CommandLine cl2 = parser.parse(options, args2, true);
        Assert.assertFalse(cl2.hasOption("a"));
        Assert.assertEquals(1, cl2.getArgs().length);
        Assert.assertEquals("nonOption", cl2.getArgs()[0]);
    }

    @Test
    public void testBurstToken_directlyCalled_executesExpectedLogic() {
        options.addOption("x", false, "option x");
        options.addOption("y", true, "option y");
        String[] args = new String[]{"-xyValue"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-x", "-y", "Value"}, result);
    }
}
