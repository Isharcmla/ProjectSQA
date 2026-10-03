package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
        options.addOption("a", "all", false, "toggle all");
        options.addOption("b", "batch", false, "toggle batch");
        options.addOption("c", "count", false, "toggle count");
        options.addOption(OptionBuilder.hasArg().create('f'));
        options.addOption(OptionBuilder.hasArg().withLongOpt("foo").create());
        options.addOption(OptionBuilder.withLongOpt("bar").create());
    }

    @Test
    public void testFlatten_emptyArguments_returnsEmptyArray() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_singleHyphen_retainsSingleHyphen() {
        String[] args = new String[]{"-"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    public void testFlatten_doubleHyphenAlone_treatedAsUnknownLongOption() {
        String[] args = new String[]{"--"};
        String[] result = parser.flatten(options, args, false);
        // "--" startsWith "--", pos = -1, opt = "--", options.hasOption("--") is false -> processNonOptionToken("--")
        Assert.assertArrayEquals(new String[]{"--", "--"}, result);
    }

    @Test
    public void testFlatten_longOptionWithoutValue_addsOption() {
        String[] args = new String[]{"--bar"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--bar"}, result);
    }

    @Test
    public void testFlatten_longOptionWithValue_splitsOptionAndValue() {
        String[] args = new String[]{"--foo=baz"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"--foo", "baz"}, result);
    }

    @Test
    public void testFlatten_unknownLongOption_stopAtNonOptionFalse_processedAsNonOption() {
        String[] args = new String[]{"--unknown", "extra"};
        String[] result = parser.flatten(options, args, false);
        // --unknown triggers processNonOptionToken -> adds "--", "--unknown", eatTheRest=true, gobbles "extra"
        Assert.assertArrayEquals(new String[]{"--", "--unknown", "extra"}, result);
    }

    @Test
    public void testFlatten_validShortOptionTwoChars_addedDirectly() {
        String[] args = new String[]{"-a", "-b"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testFlatten_invalidShortOptionTwoChars_stopAtNonOptionFalse() {
        String[] args = new String[]{"-z", "-a"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-z", "-a"}, result);
    }

    @Test
    public void testFlatten_invalidShortOptionTwoChars_stopAtNonOptionTrue_stopsAndGobbles() {
        String[] args = new String[]{"-z", "-a", "extra"};
        String[] result = parser.flatten(options, args, true);
        // -z length 2, not in options, stopAtNonOption=true -> processOptionToken sets eatTheRest=true, adds "-z", gobbles rest
        Assert.assertArrayEquals(new String[]{"-z", "-a", "extra"}, result);
    }

    @Test
    public void testFlatten_multiCharOptionDirectlyInOptions() {
        Options customOptions = new Options();
        customOptions.addOption("file", false, "file option");
        String[] args = new String[]{"-file"};
        String[] result = parser.flatten(customOptions, args, false);
        Assert.assertArrayEquals(new String[]{"-file"}, result);
    }

    @Test
    public void testFlatten_burstToken_allSingleFlags() {
        String[] args = new String[]{"-abc"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b", "-c"}, result);
    }

    @Test
    public void testFlatten_burstToken_withArgumentAttached() {
        String[] args = new String[]{"-abfValue", "another"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"-a", "-b", "-f", "Value", "another"}, result);
    }

    @Test
    public void testFlatten_burstToken_withArgOptionAtEnd() {
        String[] args = new String[]{"-abf", "Value"};
        String[] result = parser.flatten(options, args, false);
        // -f is at the end of burst token (token.length() == i + 1)
        Assert.assertArrayEquals(new String[]{"-a", "-b", "-f", "Value"}, result);
    }

    @Test
    public void testFlatten_burstToken_unknownCharacter_stopAtNonOptionTrue() {
        String[] args = new String[]{"-abzRemaining", "moreArgs"};
        String[] result = parser.flatten(options, args, true);
        // -a and -b matched, then 'z' is unknown with stopAtNonOption=true -> processNonOptionToken("zRemaining"), gobbles rest
        Assert.assertArrayEquals(new String[]{"-a", "-b", "--", "zRemaining", "moreArgs"}, result);
    }

    @Test
    public void testFlatten_burstToken_unknownCharacter_stopAtNonOptionFalse() {
        String[] args = new String[]{"-abz", "moreArgs"};
        String[] result = parser.flatten(options, args, false);
        // -a and -b matched, then 'z' unknown with stopAtNonOption=false -> adds "-abz" and breaks loop
        Assert.assertArrayEquals(new String[]{"-a", "-b", "-abz", "moreArgs"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionFalse_addedDirectly() {
        String[] args = new String[]{"plainArg", "-a"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertArrayEquals(new String[]{"plainArg", "-a"}, result);
    }

    @Test
    public void testFlatten_nonOption_stopAtNonOptionTrue_stopsAndGobbles() {
        String[] args = new String[]{"plainArg", "-a", "extra"};
        String[] result = parser.flatten(options, args, true);
        // plainArg -> processNonOptionToken adds "--", "plainArg", eatTheRest=true, gobbles rest
        Assert.assertArrayEquals(new String[]{"--", "plainArg", "-a", "extra"}, result);
    }

    @Test
    public void testBurstToken_directlyCallable() {
        // Direct call to protected burstToken
        parser.flatten(options, new String[0], false); // initialize options
        parser.burstToken("-ab", false);
        // Verifies no exception thrown when calling directly
    }

    @Test
    public void testParse_integrationWithPropertiesAndArguments() throws ParseException {
        Properties properties = new Properties();
        properties.setProperty("bar", "true");

        String[] args = new String[]{"-a", "-f", "myFile", "nonOption"};
        CommandLine cl = parser.parse(options, args, properties, false);

        Assert.assertTrue(cl.hasOption("a"));
        Assert.assertTrue(cl.hasOption("bar"));
        Assert.assertEquals("myFile", cl.getOptionValue("f"));
        Assert.assertEquals(1, cl.getArgs().length);
        Assert.assertEquals("nonOption", cl.getArgs()[0]);
    }

    @Test
    public void testParse_multipleRuns_reinitializesState() throws ParseException {
        String[] args1 = new String[]{"nonOption", "-a"};
        CommandLine cl1 = parser.parse(options, args1, true);
        Assert.assertEquals(2, cl1.getArgs().length);

        // Run second parse to ensure parser tokens and eatTheRest are reset
        String[] args2 = new String[]{"-a"};
        CommandLine cl2 = parser.parse(options, args2, true);
        Assert.assertTrue(cl2.hasOption("a"));
        Assert.assertEquals(0, cl2.getArgs().length);
    }
}
