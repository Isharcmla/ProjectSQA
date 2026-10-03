package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class OptionsTest
{
    private Options options;

    @Before
    public void setUp()
    {
        options = new Options();
    }

    @Test
    public void testAddOption_optAndDescription_success()
    {
        Options result = options.addOption("a", "description A");
        assertSame(options, result);
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasShortOption("a"));
        assertFalse(options.hasLongOption("a"));

        Option opt = options.getOption("a");
        assertNotNull(opt);
        assertEquals("a", opt.getOpt());
        assertEquals("description A", opt.getDescription());
        assertFalse(opt.hasArg());
    }

    @Test
    public void testAddOption_optHasArgAndDescription_success()
    {
        Options result = options.addOption("b", true, "description B");
        assertSame(options, result);
        assertTrue(options.hasOption("b"));

        Option opt = options.getOption("b");
        assertNotNull(opt);
        assertEquals("b", opt.getOpt());
        assertTrue(opt.hasArg());
    }

    @Test
    public void testAddOption_optLongOptHasArgDescription_success()
    {
        Options result = options.addOption("c", "config", true, "description C");
        assertSame(options, result);
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("config"));
        assertTrue(options.hasShortOption("c"));
        assertTrue(options.hasLongOption("config"));

        Option optByShort = options.getOption("c");
        Option optByLong = options.getOption("config");
        assertSame(optByShort, optByLong);
        assertEquals("config", optByShort.getLongOpt());
    }

    @Test
    public void testAddOption_optionObjectRequired_addsToRequiredOptions()
    {
        Option opt = new Option("r", "required-opt", false, "Required option");
        opt.setRequired(true);

        options.addOption(opt);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("r", required.get(0));
    }

    @Test
    public void testAddOption_duplicateRequiredOption_updatesRequiredListWithoutDuplicates()
    {
        Option opt1 = new Option("r", "req", false, "Required option 1");
        opt1.setRequired(true);
        options.addOption(opt1);

        Option opt2 = new Option("r", "req", false, "Required option 2");
        opt2.setRequired(true);
        options.addOption(opt2);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("r", required.get(0));
    }

    @Test
    public void testAddOption_nonRequiredOption_notInRequiredList()
    {
        Option opt = new Option("n", false, "Not required");
        options.addOption(opt);

        assertTrue(options.getRequiredOptions().isEmpty());
    }

    @Test
    public void testAddOptionGroup_requiredGroup_addsGroupToRequiredOptions()
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);

        Option opt1 = new Option("f", "file", false, "file option");
        opt1.setRequired(true); // Should be reset to false by addOptionGroup
        Option opt2 = new Option("d", "dir", false, "dir option");

        group.addOption(opt1);
        group.addOption(opt2);

        Options result = options.addOptionGroup(group);
        assertSame(options, result);

        assertFalse(opt1.isRequired());
        assertFalse(opt2.isRequired());

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertSame(group, required.get(0));

        assertSame(group, options.getOptionGroup(opt1));
        assertSame(group, options.getOptionGroup(opt2));
        assertTrue(options.getOptionGroups().contains(group));
    }

    @Test
    public void testAddOptionGroup_nonRequiredGroup_notInRequiredOptions()
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);

        Option opt1 = new Option("x", "option X");
        group.addOption(opt1);

        options.addOptionGroup(group);

        assertTrue(options.getRequiredOptions().isEmpty());
        assertSame(group, options.getOptionGroup(opt1));
    }

    @Test
    public void testGetOption_withHyphens_findsOption()
    {
        Option opt = new Option("h", "help", false, "Help option");
        options.addOption(opt);

        assertSame(opt, options.getOption("h"));
        assertSame(opt, options.getOption("-h"));
        assertSame(opt, options.getOption("--help"));
        assertSame(opt, options.getOption("help"));
    }

    @Test
    public void testGetOption_nonExistent_returnsNull()
    {
        assertNull(options.getOption("unknown"));
        assertNull(options.getOption("--unknown"));
    }

    @Test
    public void testGetMatchingOptions_exactAndPartialMatches()
    {
        options.addOption("v", "version", false, "Display version");
        options.addOption("verbose", false, "Verbose mode");
        options.addOption("var", false, "Variable setting");

        List<String> matches = options.getMatchingOptions("ver");
        assertEquals(2, matches.size());
        assertTrue(matches.contains("version"));
        assertTrue(matches.contains("verbose"));

        List<String> matchPrefix = options.getMatchingOptions("--v");
        assertEquals(3, matchPrefix.size());

        List<String> noMatches = options.getMatchingOptions("debug");
        assertTrue(noMatches.isEmpty());
    }

    @Test
    public void testHasOption_withAndWithoutHyphens()
    {
        options.addOption("s", "silent", false, "Silent mode");

        assertTrue(options.hasOption("s"));
        assertTrue(options.hasOption("-s"));
        assertTrue(options.hasOption("silent"));
        assertTrue(options.hasOption("--silent"));
        assertFalse(options.hasOption("other"));
    }

    @Test
    public void testHasLongOption_validAndInvalid()
    {
        options.addOption("o", "output", true, "Output file");

        assertTrue(options.hasLongOption("output"));
        assertTrue(options.hasLongOption("--output"));
        assertFalse(options.hasLongOption("o"));
        assertFalse(options.hasLongOption("-o"));
        assertFalse(options.hasLongOption("other"));
    }

    @Test
    public void testHasShortOption_validAndInvalid()
    {
        options.addOption("i", "input", true, "Input file");

        assertTrue(options.hasShortOption("i"));
        assertTrue(options.hasShortOption("-i"));
        assertFalse(options.hasShortOption("input"));
        assertFalse(options.hasShortOption("--input"));
        assertFalse(options.hasShortOption("other"));
    }

    @Test
    public void testGetOptionGroup_optionNotInAnyGroup_returnsNull()
    {
        Option opt = new Option("k", "key", false, "Key option");
        options.addOption(opt);

        assertNull(options.getOptionGroup(opt));
    }

    @Test
    public void testGetOptions_and_helpOptions()
    {
        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");

        options.addOption(optA);
        options.addOption(optB);

        Collection<Option> allOptions = options.getOptions();
        assertEquals(2, allOptions.size());
        assertTrue(allOptions.contains(optA));
        assertTrue(allOptions.contains(optB));

        List<Option> helpList = options.helpOptions();
        assertEquals(2, helpList.size());
        assertTrue(helpList.contains(optA));
        assertTrue(helpList.contains(optB));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_unmodifiableCollection_throwsExceptionOnModify()
    {
        options.addOption("x", "option X");
        options.getOptions().clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRequiredOptions_unmodifiableList_throwsExceptionOnModify()
    {
        Option opt = new Option("req", "required option");
        opt.setRequired(true);
        options.addOption(opt);

        options.getRequiredOptions().clear();
    }

    @Test
    public void testToString_notNullAndContainsDetails()
    {
        options.addOption("x", "extended", false, "Extended mode");
        String str = options.toString();

        assertNotNull(str);
        assertTrue(str.startsWith("[ Options: [ short "));
        assertTrue(str.contains("extended"));
        assertTrue(str.endsWith(" ]"));
    }

    @Test
    public void testSerialization_preservesState() throws Exception
    {
        Option opt = new Option("s", "serialize", true, "Test serialization");
        opt.setRequired(true);
        options.addOption(opt);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(options);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Options deserializedOptions = (Options) ois.readObject();
        ois.close();

        assertTrue(deserializedOptions.hasOption("s"));
        assertTrue(deserializedOptions.hasLongOption("serialize"));
        assertEquals(1, deserializedOptions.getRequiredOptions().size());
        assertEquals("s", deserializedOptions.getRequiredOptions().get(0));
    }
}
