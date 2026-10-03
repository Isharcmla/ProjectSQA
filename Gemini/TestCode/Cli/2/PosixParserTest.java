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
        String[] args = new String[]{};
        String[] result = parser.flatten(options, args, false);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_longOptionWithoutEquals_returnsSameToken() {
        options.addOption("f", "foo", false, "foo option");
        String[] args = new String[]{"--foo"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--foo"}, result);
    }

    @Test
    public void testFlatten_longOptionWithEquals_splitsIntoTwoTokens() {
        options.addOption("f", "foo", true, "foo option");
        String[] args = new String[]{"--foo=bar"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--foo", "bar"}, result);
    }

    @Test
    public void testFlatten_singleHyphen_retainsHyphenToken() {
        String[] args = new String[]{"-"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlatten_validShortOptionTwoChars_recognizesOption() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-a"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a"}, result);
    }

    @Test
    public void testFlatten_invalidShortOptionWithStopAtNonOptionFalse_ignoresToken() {
        String[] args = new String[]{"-x"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_invalidShortOptionWithStopAtNonOptionTrue_eatsTheRest() {
        String[] args = new String[]{"-x", "foo", "bar"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"foo", "bar"}, result);
    }

    @Test
    public void testFlatten_multiCharOptionRecognizedByOptions_returnsTokenDirectly() {
        options.addOption("foo", false, "multi-char option");
        String[] args = new String[]{"-foo"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-foo"}, result);
    }

    @Test
    public void testFlatten_burstMultipleShortOptionsWithoutArg_burstsSeparately() {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");
        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    public void testFlatten_burstShortOptionWithAttachedArg_burstsAndAppendsArg() {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b with arg");
        String[] args = new String[]{"-abfoo"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b", "foo"}, result);
    }

    @Test
    public void testFlatten_burstUnrecognizedOptionStopAtNonOptionFalse_prependsHyphenToEach() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-ax"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-x"}, result);
    }

    @Test
    public void testFlatten_burstUnrecognizedOptionStopAtNonOptionTrue_processesRemaining() {
        options.addOption("a", false, "option a");
        String[] args = new String[]{"-ax", "rest1", "rest2"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"-a", "--", "x", "rest1", "rest2"}, result);
    }

    @Test
    public void testFlatten_nonOptionTokenWithStopAtNonOptionFalse_appendsToken() {
        String[] args = new String[]{"foo", "bar"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"foo", "bar"}, result);
    }

    @Test
    public void testFlatten_nonOptionTokenWithStopAtNonOptionTrueAndNoCurrentOption_eatsTheRest() {
        String[] args = new String[]{"foo", "bar"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"--", "foo", "bar"}, result);
    }

    @Test
    public void testFlatten_nonOptionTokenWithCurrentOptionHavingArg_consumesArg() {
        options.addOption("a", true, "option a with arg");
        String[] args = new String[]{"-a", "foo", "bar"};
        String[] result = parser.flatten(options, args, true);
        Assert.assertArrayEquals(new String[]{"-a", "foo", "--", "bar"}, result);
    }

    @Test
    public void testFlatten_doubleHyphenToken_addsToken() {
        String[] args = new String[]{"--", "foo"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--", "foo"}, result);
    }

    @Test
    public void testBurstToken_directCall() {
        options.addOption("k", false, "key");
        parser.flatten(options, new String[]{}, false);
        parser.burstToken("-k", false);
        String[] result = parser.flatten(options, new String[]{}, false);
        Assert.assertEquals(0, result.length);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_nullArguments_throwsNullPointerException() {
        parser.flatten(options, null, false);
    }

    @Test
    public void testParse_integrationWithPosixParser() throws ParseException {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b");
        CommandLine cl = parser.parse(options, new String[]{"-a", "-b", "val", "nonOpt"});
        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("b"));
        Assert.assertEquals("val", cl.getOptionValue("b"));
        Assert.assertEquals(1, cl.getArgList().size());
        Assert.assertEquals("nonOpt", cl.getArgList().get(0));
    }
}
