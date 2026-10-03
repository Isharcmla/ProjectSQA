package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Test cases for {@link Options}.
 */
public class OptionsTest
{
    private Options options;

    @Before
    public void setUp()
    {
        options = new Options();
    }

    @Test
    public void testAddOption_shortOnlyAndDescription_success()
    {
        Options result = options.addOption("a", "description A");

        assertNotNull(result);
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasShortOption("a"));
        assertFalse(options.hasLongOption("a"));

        Option opt = options.getOption("a");
        assertNotNull(opt);
        assertEquals("a", opt.getOpt());
        assertNull(opt.getLongOpt());
        assertFalse(opt.hasArg());
        assertEquals("description A", opt.getDescription());
    }

    @Test
    public void testAddOption_shortAndHasArgAndDescription_success()
    {
        Options result = options.addOption("b", true, "description B");

        assertNotNull(result);
        assertTrue(options.hasOption("b"));
        Option opt = options.getOption("b");
        assertNotNull(opt);
        assertEquals("b", opt.getOpt());
        assertTrue(opt.hasArg());
        assertEquals("description B", opt.getDescription());
    }

    @Test
    public void testAddOption_shortAndLongAndHasArgAndDescription_success()
    {
        Options result = options.addOption("c", "config", true, "description C");

        assertNotNull(result);
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("config"));
        assertTrue(options.hasShortOption("c"));
        assertTrue(options.hasLongOption("config"));

        Option optByShort = options.getOption("c");
        Option optByLong = options.getOption("config");
        assertEquals(optByShort, optByLong);
        assertEquals("c", optByShort.getOpt());
        assertEquals("config", optByShort.getLongOpt());
        assertTrue(optByShort.hasArg());
        assertEquals("description C", optByShort.getDescription());
    }

    @Test
    public void testAddOption_optionObjectWithoutLongOpt_success()
    {
        Option opt = new Option("d", "description D");
        options.addOption(opt);

        assertTrue(options.hasOption("d"));
        assertTrue(options.hasShortOption("d"));
        assertFalse(options.hasLongOption("d"));
        assertEquals(opt, options.getOption("d"));
    }

    @Test
    public void testAddOption_optionObjectWithLongOptOnly_success()
    {
        Option opt = new Option(null, "verbose", false, "verbose mode");
        options.addOption(opt);

        assertTrue(options.hasOption("verbose"));
        assertTrue(options.hasLongOption("verbose"));
        assertFalse(options.hasShortOption("verbose"));
        assertEquals(opt, options.getOption("verbose"));
    }

    @Test
    public void testAddOption_requiredOption_addedToRequiredOptions()
    {
        Option opt = new Option("r", "req", false, "required opt");
        opt.setRequired(true);

        options.addOption(opt);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("r", required.get(0));
    }

    @Test
    public void testAddOption_duplicateRequiredOption_replacedInRequiredOptions()
    {
        Option opt1 = new Option("r", "req1", false, "required opt 1");
        opt1.setRequired(true);

        Option opt2 = new Option("r", "req2", false, "required opt 2");
        opt2.setRequired(true);

        options.addOption(opt1);
        options.addOption(opt2);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("r", required.get(0));
        assertEquals("req2", options.getOption("r").getLongOpt());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRequiredOptions_unmodifiableList_throwsExceptionOnModification()
    {
        Option opt = new Option("r", false, "required");
        opt.setRequired(true);
        options.addOption(opt);

        List required = options.getRequiredOptions();
        required.add("newOption");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_unmodifiableCollection_throwsExceptionOnModification()
    {
        options.addOption("a", "desc");
        Collection<Option> opts = options.getOptions();
        opts.clear();
    }

    @Test
    public void testGetOptions_andHelpOptions_containsAddedOptions()
    {
        options.addOption("a", "desc A");
        options.addOption("b", "longB", false, "desc B");

        Collection<Option> opts = options.getOptions();
        assertEquals(2, opts.size());

        List<Option> helpOpts = options.helpOptions();
        assertEquals(2, helpOpts.size());
        assertEquals(new ArrayList<Option>(opts), helpOpts);
    }

    @Test
    public void testAddOptionGroup_notRequired_optionsResetToNotRequired()
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);

        Option opt1 = new Option("x", "option X");
        opt1.setRequired(true);
        Option opt2 = new Option("y", "option Y");

        group.addOption(opt1);
        group.addOption(opt2);

        Options result = options.addOptionGroup(group);

        assertNotNull(result);
        assertFalse(opt1.isRequired());
        assertEquals(0, options.getRequiredOptions().size());
        assertEquals(group, options.getOptionGroup(opt1));
        assertEquals(group, options.getOptionGroup(opt2));

        Collection<OptionGroup> groups = options.getOptionGroups();
        assertEquals(1, groups.size());
        assertTrue(groups.contains(group));
    }

    @Test
    public void testAddOptionGroup_required_groupAddedToRequiredOptions()
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);

        Option opt1 = new Option("x", "option X");
        Option opt2 = new Option("y", "option Y");

        group.addOption(opt1);
        group.addOption(opt2);

        options.addOptionGroup(group);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals(group, required.get(0));
    }

    @Test
    public void testGetOptionGroup_optionNotInGroup_returnsNull()
    {
        Option opt = new Option("z", "option Z");
        options.addOption(opt);

        assertNull(options.getOptionGroup(opt));
    }

    @Test
    public void testGetOption_withLeadingHyphens_returnsCorrectOption()
    {
        options.addOption("a", "alpha", false, "alpha option");

        assertEquals("a", options.getOption("a").getOpt());
        assertEquals("a", options.getOption("-a").getOpt());
        assertEquals("a", options.getOption("--a").getOpt());
        assertEquals("a", options.getOption("alpha").getOpt());
        assertEquals("a", options.getOption("-alpha").getOpt());
        assertEquals("a", options.getOption("--alpha").getOpt());
        assertNull(options.getOption("nonExisting"));
        assertNull(options.getOption("--nonExisting"));
    }

    @Test
    public void testHasOption_withAndWithoutHyphens_returnsExpected()
    {
        options.addOption("s", "shortAndLong", false, "desc");

        assertTrue(options.hasOption("s"));
        assertTrue(options.hasOption("-s"));
        assertTrue(options.hasOption("--s"));
        assertTrue(options.hasOption("shortAndLong"));
        assertTrue(options.hasOption("-shortAndLong"));
        assertTrue(options.hasOption("--shortAndLong"));
        assertFalse(options.hasOption("other"));
        assertFalse(options.hasOption("--other"));
    }

    @Test
    public void testHasLongOption_withAndWithoutHyphens_returnsExpected()
    {
        options.addOption("s", "longOpt", false, "desc");

        assertTrue(options.hasLongOption("longOpt"));
        assertTrue(options.hasLongOption("-longOpt"));
        assertTrue(options.hasLongOption("--longOpt"));
        assertFalse(options.hasLongOption("s"));
        assertFalse(options.hasLongOption("-s"));
        assertFalse(options.hasLongOption("unknown"));
    }

    @Test
    public void testHasShortOption_withAndWithoutHyphens_returnsExpected()
    {
        options.addOption("s", "longOpt", false, "desc");

        assertTrue(options.hasShortOption("s"));
        assertTrue(options.hasShortOption("-s"));
        assertTrue(options.hasShortOption("--s"));
        assertFalse(options.hasShortOption("longOpt"));
        assertFalse(options.hasShortOption("-longOpt"));
        assertFalse(options.hasShortOption("unknown"));
    }

    @Test
    public void testGetMatchingOptions_exactMatch_returnsSingletonList()
    {
        options.addOption("f", "foo", false, "foo opt");
        options.addOption("b", "foobar", false, "foobar opt");

        List<String> matches = options.getMatchingOptions("foo");
        assertEquals(1, matches.size());
        assertEquals("foo", matches.get(0));

        List<String> matchesWithHyphen = options.getMatchingOptions("--foo");
        assertEquals(1, matchesWithHyphen.size());
        assertEquals("foo", matchesWithHyphen.get(0));
    }

    @Test
    public void testGetMatchingOptions_partialMatch_returnsAllPrefixes()
    {
        options.addOption(null, "config-file", true, "config file");
        options.addOption(null, "config-dir", true, "config directory");
        options.addOption(null, "context", true, "context");

        List<String> matches = options.getMatchingOptions("config");
        assertEquals(2, matches.size());
        assertTrue(matches.contains("config-file"));
        assertTrue(matches.contains("config-dir"));

        List<String> matchesWithHyphens = options.getMatchingOptions("--con");
        assertEquals(3, matchesWithHyphens.size());
        assertTrue(matchesWithHyphens.contains("config-file"));
        assertTrue(matchesWithHyphens.contains("config-dir"));
        assertTrue(matchesWithHyphens.contains("context"));
    }

    @Test
    public void testGetMatchingOptions_noMatch_returnsEmptyList()
    {
        options.addOption(null, "config-file", true, "config file");

        List<String> matches = options.getMatchingOptions("nonexistent");
        assertNotNull(matches);
        assertTrue(matches.isEmpty());
    }

    @Test
    public void testToString_validOutput()
    {
        options.addOption("a", "alpha", false, "alpha desc");

        String str = options.toString();
        assertNotNull(str);
        assertTrue(str.startsWith("[ Options: [ short "));
        assertTrue(str.contains("alpha"));
        assertTrue(str.contains(" ] [ long "));
        assertTrue(str.endsWith(" ]"));
    }

    @Test
    public void testSerializable_statePreserved() throws Exception
    {
        options.addOption("a", "alpha", true, "desc A");
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("g1", "group opt 1"));
        group.addOption(new Option("g2", "group opt 2"));
        options.addOptionGroup(group);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(options);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Options deserialized = (Options) ois.readObject();
        ois.close();

        assertNotNull(deserialized);
        assertTrue(deserialized.hasOption("a"));
        assertTrue(deserialized.hasOption("alpha"));
        assertTrue(deserialized.hasOption("g1"));
        assertTrue(deserialized.hasOption("g2"));
        assertEquals(1, deserialized.getRequiredOptions().size());
        assertEquals(1, deserialized.getOptionGroups().size());
    }
}
