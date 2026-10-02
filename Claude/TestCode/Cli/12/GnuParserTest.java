import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GnuParserTest
{

    private GnuParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new GnuParser();
        options = new Options();
    }

    @Test
    public void testConstructor_createsInstance_notNull()
    {
        GnuParser p = new GnuParser();
        assertNotNull(p);
    }

    @Test
    public void testParse_shortOptionRecognized_optionSetTrue() throws ParseException
    {
        options.addOption("a", false, "a option");

        CommandLine cl = parser.parse(options, new String[] {"-a"});

        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testParse_longOptionRecognized_optionSetTrue() throws ParseException
    {
        options.addOption("v", "verbose", false, "verbose option");

        CommandLine cl = parser.parse(options, new String[] {"--verbose"});

        assertTrue(cl.hasOption("verbose"));
    }

    @Test
    public void testParse_multipleShortOptions_bothRecognized() throws ParseException
    {
        options.addOption("a", false, "a option");
        options.addOption("b", false, "b option");

        CommandLine cl = parser.parse(options, new String[] {"-a", "-b"});

        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testParse_doubleDashTerminator_stopsOptionProcessing() throws ParseException
    {
        options.addOption("a", false, "a option");

        CommandLine cl = parser.parse(options, new String[] {"--", "-a", "b"});

        assertFalse(cl.hasOption("a"));
        assertArrayEquals(new String[] {"-a", "b"}, cl.getArgs());
    }

    @Test
    public void testParse_doubleDashAlone_noRemainingArguments() throws ParseException
    {
        CommandLine cl = parser.parse(options, new String[] {"--"});

        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParse_singleHyphenArgument_treatedAsPlainArgument() throws ParseException
    {
        CommandLine cl = parser.parse(options, new String[] {"-"});

        assertArrayEquals(new String[] {"-"}, cl.getArgs());
        assertFalse(cl.hasOption("-"));
    }

    @Test
    public void testParse_propertyStyleOption_splitIntoOptionAndValue() throws ParseException
    {
        options.addOption("D", true, "define property");

        CommandLine cl = parser.parse(options, new String[] {"-Dproperty=value"});

        assertTrue(cl.hasOption("D"));
        assertEquals("property=value", cl.getOptionValue("D"));
    }

    @Test
    public void testParse_normalNonOptionArgument_addedToArgsList() throws ParseException
    {
        CommandLine cl = parser.parse(options, new String[] {"file.txt"});

        assertArrayEquals(new String[] {"file.txt"}, cl.getArgs());
    }

    @Test
    public void testParse_emptyArgumentsArray_returnsEmptyCommandLine() throws ParseException
    {
        CommandLine cl = parser.parse(options, new String[] {});

        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParse_unknownOptionWithStopAtNonOptionTrue_remainingTreatedAsArguments() throws ParseException
    {
        options.addOption("a", false, "a option");

        CommandLine cl = parser.parse(options, new String[] {"-b", "-a"}, true);

        assertFalse(cl.hasOption("a"));
        assertArrayEquals(new String[] {"-b", "-a"}, cl.getArgs());
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParse_unknownOptionWithoutStopAtNonOption_throwsUnrecognizedOptionException()
        throws ParseException
    {
        options.addOption("a", false, "a option");

        parser.parse(options, new String[] {"-b", "-a"}, false);
    }

    @Test
    public void testParse_unknownOptionDefaultBehaviour_throwsUnrecognizedOptionException()
    {
        options.addOption("a", false, "a option");

        try
        {
            parser.parse(options, new String[] {"-xyz"});
            fail("Expected UnrecognizedOptionException to be thrown");
        }
        catch (UnrecognizedOptionException e)
        {
            // expected
        }
        catch (ParseException e)
        {
            fail("Expected UnrecognizedOptionException but got: " + e.getClass().getName());
        }
    }

    @Test
    public void testParse_nullElementInArgumentsArray_throwsNullPointerException()
    {
        try
        {
            parser.parse(options, new String[] {null});
            fail("Expected NullPointerException to be thrown");
        }
        catch (NullPointerException e)
        {
            // expected
        }
        catch (ParseException e)
        {
            fail("Expected NullPointerException but got ParseException: " + e.getMessage());
        }
    }

    @Test
    public void testParse_longOptionWithUnrecognizedEqualsFormat_throwsParseException()
    {
        options.addOption("v", "verbose", false, "verbose option");

        try
        {
            parser.parse(options, new String[] {"--verbose=true"});
            fail("Expected a ParseException to be thrown for unrecognized token format");
        }
        catch (ParseException e)
        {
            // expected - GNU flatten does not split long option equals format
        }
    }

    @Test
    public void testParse_mixedOptionsAndArguments_correctlySeparated() throws ParseException
    {
        options.addOption("a", false, "a option");

        CommandLine cl = parser.parse(options, new String[] {"-a", "arg1", "arg2"});

        assertTrue(cl.hasOption("a"));
        assertArrayEquals(new String[] {"arg1", "arg2"}, cl.getArgs());
    }
}
