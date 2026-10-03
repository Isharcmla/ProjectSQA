package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CommandLineTest {

    private CommandLine cmd;

    @Before
    public void setUp() {
        cmd = new CommandLine();
    }

    @Test
    public void testEmptyCommandLine() {
        assertNotNull(cmd.getArgs());
        assertEquals(0, cmd.getArgs().length);
        assertNotNull(cmd.getArgList());
        assertEquals(0, cmd.getArgList().size());
        assertNotNull(cmd.getOptions());
        assertEquals(0, cmd.getOptions().length);
        assertNotNull(cmd.iterator());
        assertFalse(cmd.iterator().hasNext());
    }

    @Test
    public void testHasOption_stringAndChar() {
        Option opt = new Option("a", "alpha", false, "Option Alpha");
        cmd.addOption(opt);

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption('a'));
        assertFalse(cmd.hasOption("b"));
        assertFalse(cmd.hasOption('b'));
        assertFalse(cmd.hasOption("alpha"));
    }

    @Test
    public void testAddOption_longOptOnly() {
        Option opt = new Option(null, "verbose", false, "Verbose output");
        cmd.addOption(opt);

        assertTrue(cmd.hasOption("verbose"));
        assertFalse(cmd.hasOption("v"));
        assertFalse(cmd.hasOption('v'));
    }

    @Test
    public void testGetOptionValue_stringAndChar_singleValue() {
        Option opt = new Option("f", "file", true, "Input file");
        opt.addValue("test.txt");
        cmd.addOption(opt);

        assertEquals("test.txt", cmd.getOptionValue("f"));
        assertEquals("test.txt", cmd.getOptionValue('f'));
        assertEquals("test.txt", cmd.getOptionValue("file"));
        assertEquals("test.txt", cmd.getOptionValue("--file"));
        assertEquals("test.txt", cmd.getOptionValue("-f"));

        assertNull(cmd.getOptionValue("nonexistent"));
        assertNull(cmd.getOptionValue('z'));
    }

    @Test
    public void testGetOptionValue_noArgumentProvided() {
        Option opt = new Option("f", "file", true, "Input file");
        cmd.addOption(opt);

        assertNull(cmd.getOptionValue("f"));
        assertNull(cmd.getOptionValue('f'));
        assertNull(cmd.getOptionValue("file"));
    }

    @Test
    public void testGetOptionValues_multipleValues() {
        Option opt = new Option("s", "server", true, "Servers list");
        opt.addValue("server1");
        opt.addValue("server2");
        cmd.addOption(opt);

        String[] expected = new String[]{"server1", "server2"};
        assertArrayEquals(expected, cmd.getOptionValues("s"));
        assertArrayEquals(expected, cmd.getOptionValues('s'));
        assertArrayEquals(expected, cmd.getOptionValues("server"));
        assertArrayEquals(expected, cmd.getOptionValues("--server"));
        assertArrayEquals(expected, cmd.getOptionValues("-s"));

        assertNull(cmd.getOptionValues("unknown"));
        assertNull(cmd.getOptionValues('u'));
    }

    @Test
    public void testGetOptionValue_withDefaultValue() {
        Option opt = new Option("p", "port", true, "Port number");
        opt.addValue("8080");
        cmd.addOption(opt);

        assertEquals("8080", cmd.getOptionValue("p", "9090"));
        assertEquals("8080", cmd.getOptionValue('p', "9090"));
        assertEquals("8080", cmd.getOptionValue("port", "9090"));

        assertEquals("9090", cmd.getOptionValue("nonexistent", "9090"));
        assertEquals("9090", cmd.getOptionValue('n', "9090"));

        Option optNoVal = new Option("e", "empty", true, "Empty opt");
        cmd.addOption(optNoVal);
        assertEquals("defaultVal", cmd.getOptionValue("e", "defaultVal"));
        assertEquals("defaultVal", cmd.getOptionValue('e', "defaultVal"));
    }

    @Test
    public void testGetOptionObject_stringAndChar() {
        Option optNum = new Option("n", "number", true, "Number opt");
        optNum.setType(PatternOptionBuilder.NUMBER_VALUE);
        optNum.addValue("123");
        cmd.addOption(optNum);

        Object objByStr = cmd.getOptionObject("n");
        assertNotNull(objByStr);
        assertEquals(new Long(123), objByStr);

        Object objByChar = cmd.getOptionObject('n');
        assertNotNull(objByChar);
        assertEquals(new Long(123), objByChar);

        assertNull(cmd.getOptionObject("unknown"));
        assertNull(cmd.getOptionObject('u'));

        Option optNoVal = new Option("x", "novalue", true, "No value opt");
        optNoVal.setType(PatternOptionBuilder.NUMBER_VALUE);
        cmd.addOption(optNoVal);
        assertNull(cmd.getOptionObject("x"));
        assertNull(cmd.getOptionObject('x'));
    }

    @Test
    public void testAddArg_andGetArgs() {
        cmd.addArg("arg1");
        cmd.addArg("arg2");
        cmd.addArg("");

        String[] expectedArray = new String[]{"arg1", "arg2", ""};
        assertArrayEquals(expectedArray, cmd.getArgs());

        List argList = cmd.getArgList();
        assertEquals(3, argList.size());
        assertEquals("arg1", argList.get(0));
        assertEquals("arg2", argList.get(1));
        assertEquals("", argList.get(2));
    }

    @Test
    public void testIteratorAndGetOptions() {
        Option optA = new Option("a", "all", false, "All flag");
        Option optB = new Option("b", "brief", false, "Brief flag");
        cmd.addOption(optA);
        cmd.addOption(optB);

        Option[] options = cmd.getOptions();
        assertEquals(2, options.length);

        Iterator it = cmd.iterator();
        assertNotNull(it);
        int count = 0;
        while (it.hasNext()) {
            Object item = it.next();
            assertTrue(item instanceof Option);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetOptionValues_nullOption() {
        assertNull(cmd.getOptionValues((String) null));
        assertNull(cmd.getOptionValue((String) null));
        assertNull(cmd.getOptionObject((String) null));
    }

    @Test
    public void testGetOptionValue_edgeCases() {
        assertEquals("fallback", cmd.getOptionValue("", "fallback"));
        assertEquals("fallback", cmd.getOptionValue("-", "fallback"));
        assertEquals("fallback", cmd.getOptionValue("--", "fallback"));
    }
}
