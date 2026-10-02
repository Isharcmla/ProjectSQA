import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.cli.UnrecognizedOptionException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

    // ---------- Normal / typical cases ----------

    @Test
    public void testFlatten_shortOptionNoArg_returnsOptionSet() throws ParseException
    {
        options.addOption("a", false, "option a");
        String[] args = { "-a" };

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testFlatten_shortOptionWithArg_returnsOptionValue() throws ParseException
    {
        options.addOption("b", true, "option b");
        String[] args = { "-b", "foo" };

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("b"));
        assertEquals("foo", cl.getOptionValue("b"));
    }

    @Test
    public void testFlatten_longOptionWithEquals_returnsOptionValue() throws ParseException
    {
        options.addOption("f", "foo", true, "long option foo");
        String[] args = { "--foo=bar" };

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("f"));
        assertEquals("bar", cl.getOptionValue("f"));
    }

    @Test
    public void testFlatten_longOptionWithoutEquals_returnsOptionPresent() throws ParseException
    {
        options.addOption("f", "foo", false, "long option foo");
        String[] args = { "--foo" };

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("f"));
    }

    @Test
    public void testFlatten_burstedShortOptions_multipleFlagsSet() throws ParseException
    {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        String[] args = { "-ab" };

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testFlatten_burstedShortOptionWithArgument_returnsValue() throws ParseException
    {
        options.addOption("b", true, "option b requires arg");
        String[] args = { "-bvalue" };

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("b"));
        assertEquals("value", cl.getOptionValue("b"));
    }

    @Test
    public void testFlatten_multiCharOptionMatchesFullToken_addedDirectly() throws ParseException
    {
        options.addOption("value", false, "multi char short option");
        String[] args = { "-value" };

        CommandLine cl = parser.parse(options, args);

        assertTrue(cl.hasOption("value"));
    }

    @Test
    public void testFlatten_nonOptionArgument_stopAtNonOptionFalse_addedToArgs() throws ParseException
    {
        String[] args = { "plainArgument" };

        CommandLine cl = parser.parse(options, args, false);

        assertEquals(1, cl.getArgs().length);
        assertEquals("plainArgument", cl.getArgs()[0]);
    }

    @Test
    public void testFlatten_doubleHyphenAlone_stopsOptionProcessing() throws ParseException
    {
        options.addOption("a", false, "option a");
        String[] args = { "--", "-a" };

        CommandLine cl = parser.parse(options, args);

        assertFalse(cl.hasOption("a"));
        assertTrue(cl.getArgList().contains("-a"));
    }

    // ---------- Edge cases ----------

    @Test
    public void testFlatten_singleHyphen_addedAsArgument() throws ParseException
    {
        String[] args = { "-" };

        CommandLine cl = parser.parse(options, args);

        assertNotNull(cl);
        assertTrue(cl.getArgList().contains("-"));
    }

    @Test
    public void testFlatten_emptyStringToken_treatedAsArgument() throws ParseException
    {
        String[] args = { "" };

        CommandLine cl = parser.parse(options, args, false);

        assertEquals(1, cl.getArgs().length);
        assertEquals("", cl.getArgs()[0]);
    }

    @Test
    public void testFlatten_emptyArguments_returnsEmptyCommandLine() throws ParseException
    {
        String[] args = new String[0];

        CommandLine cl = parser.parse(options, args);

        assertEquals(0, cl.getOptions().length);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testFlatten_unknownShortOption_stopAtNonOptionTrue_stopsProcessing() throws ParseException
    {
        // no options registered
        String[] args = { "-x", "foo" };

        CommandLine cl = parser.parse(options, args, true);

        assertFalse(cl.hasOption("x"));
        assertTrue(cl.getArgList().contains("foo"));
    }

    @Test
    public void testFlatten_unknownShortOption_stopAtNonOptionFalse_ignoresOption() throws ParseException
    {
        // no options registered
        String[] args = { "-x", "foo" };

        CommandLine cl = parser.parse(options, args, false);

        assertTrue(cl.getArgList().contains("foo"));
    }

    @Test
    public void testFlatten_burstToken_unknownTrailingChar_stopAtNonOptionTrue() throws ParseException
    {
        options.addOption("a", false, "option a, no arg");
        String[] args = { "-ax" };

        CommandLine cl = parser.parse(options, args, true);

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.getArgList().contains("x"));
    }

    @Test
    public void testFlatten_burstToken_knownOptionWithArgAndRemainder() throws ParseException
    {
        options.addOption("b", true, "option b requires arg");
        String[] args = { "-bfoo", "extra" };

        CommandLine cl = parser.parse(options, args, false);

        assertTrue(cl.hasOption("b"));
        assertEquals("foo", cl.getOptionValue("b"));
        assertTrue(cl.getArgList().contains("extra"));
    }

    @Test
    public void testFlatten_nonOptionArgument_stopAtNonOptionTrue_addedAsDoubleHyphenArgs() throws ParseException
    {
        String[] args = { "plainArgument", "another" };

        CommandLine cl = parser.parse(options, args, true);

        assertTrue(cl.getArgList().contains("plainArgument"));
        assertTrue(cl.getArgList().contains("another"));
    }

    // ---------- Exception cases ----------

    @Test(expected = MissingArgumentException.class)
    public void testParse_missingArgument_throwsMissingArgumentException() throws ParseException
    {
        options.addOption("b", true, "option b requires arg");
        String[] args = { "-b" };

        parser.parse(options, args);
    }

    @Test(expected = MissingOptionException.class)
    public void testParse_missingRequiredOption_throwsMissingOptionException() throws ParseException
    {
        options.addOption("r", false, "required option");
        options.getOption("r").setRequired(true);
        String[] args = new String[0];

        parser.parse(options, args);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unrecognizedLongOption_throwsUnrecognizedOptionException() throws ParseException
    {
        String[] args = { "--unknownLongOption" };

        parser.parse(options, args);
    }

    @Test(expected = NullPointerException.class)
    public void testParse_nullArguments_throwsNullPointerException() throws ParseException
    {
        parser.parse(options, null);
    }

    @Test(expected = NullPointerException.class)
    public void testParse_nullOptions_throwsNullPointerException() throws ParseException
    {
        String[] args = { "-a" };

        parser.parse(null, args);
    }

    @Test
    public void testParse_stopAtNonOptionWithSubsequentOptionTokensConsumedAsArgs() throws ParseException
    {
        options.addOption("a", false, "option a");
        options.addOption("c", false, "option c");
        String[] args = { "-a", "nonOption", "-c" };

        CommandLine cl = parser.parse(options, args, true);

        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("c"));
        assertTrue(cl.getArgList().contains("nonOption"));
        assertTrue(cl.getArgList().contains("-c"));
    }

    @Test
    public void testParse_multipleOptionsMixedWithArguments_correctlyParsed() throws ParseException
    {
        options.addOption("a", false, "option a");
        options.addOption("b", true, "option b requires arg");
        String[] args = { "-a", "-b", "value", "remainderArg" };

        CommandLine cl = parser.parse(options, args, false);

        assertTrue(cl.hasOption("a"));
        assertEquals("value", cl.getOptionValue("b"));
        assertTrue(cl.getArgList().contains("remainderArg"));
    }
}
