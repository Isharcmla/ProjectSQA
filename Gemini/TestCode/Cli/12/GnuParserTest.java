package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GnuParserTest {

    private GnuParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new GnuParser();
        options = new Options();
        options.addOption("a", "all", false, "toggle all");
        options.addOption("b", "batch", true, "batch mode");
        options.addOption("D", "define", true, "define property");
        options.addOption("f", "file", true, "file target");
    }

    @Test
    public void testFlatten_emptyArguments_returnsEmptyArray() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testFlatten_doubleHyphen_eatsRemainingArguments() {
        String[] args = new String[] { "-a", "--", "-b", "foo", "bar" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "-a", "--", "-b", "foo", "bar" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_doubleHyphenAtEnd_handledProperly() {
        String[] args = new String[] { "-a", "--" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "-a", "--" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_singleHyphen_retainsSingleHyphen() {
        String[] args = new String[] { "-" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "-" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_knownShortOption_retainsOption() {
        String[] args = new String[] { "-a" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "-a" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_knownLongOption_retainsOption() {
        String[] args = new String[] { "--all" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "--all" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_specialPropertiesOption_splitsOptionAndValue() {
        String[] args = new String[] { "-Dproperty=value" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "-D", "property=value" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_unknownOptionStopAtNonOptionFalse_keepsOptionAndContinues() {
        String[] args = new String[] { "-unknown", "-a" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "-unknown", "-a" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_unknownOptionStopAtNonOptionTrue_eatsRemainingArguments() {
        String[] args = new String[] { "-unknown", "-a", "extra" };
        String[] result = parser.flatten(options, args, true);
        String[] expected = new String[] { "-unknown", "-a", "extra" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_nonOptionArgumentsStopAtNonOptionFalse_retainsArguments() {
        String[] args = new String[] { "foo", "bar" };
        String[] result = parser.flatten(options, args, false);
        String[] expected = new String[] { "foo", "bar" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlatten_nonOptionArgumentsStopAtNonOptionTrue_retainsArguments() {
        String[] args = new String[] { "foo", "-a" };
        String[] result = parser.flatten(options, args, true);
        String[] expected = new String[] { "foo", "-a" };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testParse_integrationWithCommandLine() throws Exception {
        String[] args = new String[] { "-a", "-Dkey=value", "--batch", "testVal", "arg1", "arg2" };
        CommandLine cmd = parser.parse(options, args);
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("D"));
        assertEquals("key=value", cmd.getOptionValue("D"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("testVal", cmd.getOptionValue("b"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("arg1", cmd.getArgs()[0]);
        assertEquals("arg2", cmd.getArgs()[1]);
    }
}
