import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class OptionsTest
{
    private Options options;

    @Before
    public void setUp()
    {
        options = new Options();
    }

    // ---------- addOption(String opt, String description) ----------

    @Test
    public void testAddOption_shortOptWithDescription_addsOptionSuccessfully()
    {
        Options result = options.addOption("a", "description of a");
        Assert.assertSame(options, result);
        Assert.assertTrue(options.hasOption("a"));
        Option opt = options.getOption("a");
        Assert.assertNotNull(opt);
        Assert.assertEquals("description of a", opt.getDescription());
        Assert.assertFalse(opt.hasArg());
    }

    // ---------- addOption(String opt, boolean hasArg, String description) ----------

    @Test
    public void testAddOption_shortOptWithHasArg_addsOptionWithArgFlag()
    {
        options.addOption("b", true, "description of b");
        Option opt = options.getOption("b");
        Assert.assertNotNull(opt);
        Assert.assertTrue(opt.hasArg());
    }

    @Test
    public void testAddOption_shortOptWithoutArg_addsOptionWithoutArgFlag()
    {
        options.addOption("c", false, "description of c");
        Option opt = options.getOption("c");
        Assert.assertNotNull(opt);
        Assert.assertFalse(opt.hasArg());
    }

    // ---------- addOption(String opt, String longOpt, boolean hasArg, String description) ----------

    @Test
    public void testAddOption_shortAndLongOpt_addsOptionWithBothNames()
    {
        options.addOption("d", "delta", true, "description of d");
        Assert.assertTrue(options.hasOption("d"));
        Assert.assertTrue(options.hasOption("delta"));
        Assert.assertTrue(options.hasShortOption("d"));
        Assert.assertTrue(options.hasLongOption("delta"));
    }

    // ---------- addOption(Option opt) ----------

    @Test
    public void testAddOption_optionInstance_addsSuccessfully()
    {
        Option opt = new Option("e", "echo", true, "description of e");
        options.addOption(opt);
        Assert.assertTrue(options.hasOption("e"));
        Assert.assertTrue(options.hasOption("echo"));
    }

    @Test
    public void testAddOption_requiredOption_addedToRequiredList()
    {
        Option opt = new Option("f", "description of f");
        opt.setRequired(true);
        options.addOption(opt);

        List requiredOptions = options.getRequiredOptions();
        Assert.assertTrue(requiredOptions.contains("f"));
    }

    @Test
    public void testAddOption_duplicateRequiredOption_notDuplicatedInRequiredList()
    {
        Option opt1 = new Option("g", "description g1");
        opt1.setRequired(true);
        options.addOption(opt1);

        Option opt2 = new Option("g", "description g2");
        opt2.setRequired(true);
        options.addOption(opt2);

        List requiredOptions = options.getRequiredOptions();
        int count = 0;
        for (Object o : requiredOptions)
        {
            if ("g".equals(o))
            {
                count++;
            }
        }
        Assert.assertEquals(1, count);
    }

    @Test
    public void testAddOption_withoutLongOpt_longOptsMapNotAffected()
    {
        Option opt = new Option("h", "description of h");
        options.addOption(opt);
        Assert.assertFalse(options.hasLongOption("h"));
        Assert.assertTrue(options.hasShortOption("h"));
    }

    // ---------- addOptionGroup(OptionGroup group) ----------

    @Test
    public void testAddOptionGroup_normalGroup_addsAllOptionsInGroup()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("i", "description i");
        Option opt2 = new Option("j", "description j");
        group.addOption(opt1);
        group.addOption(opt2);

        Options result = options.addOptionGroup(group);
        Assert.assertSame(options, result);

        Assert.assertTrue(options.hasOption("i"));
        Assert.assertTrue(options.hasOption("j"));
        Assert.assertNotNull(options.getOptionGroup(opt1));
        Assert.assertNotNull(options.getOptionGroup(opt2));
    }

    @Test
    public void testAddOptionGroup_requiredGroup_addsGroupToRequiredList()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("k", "description k");
        group.addOption(opt1);
        group.setRequired(true);

        options.addOptionGroup(group);

        List requiredOptions = options.getRequiredOptions();
        Assert.assertTrue(requiredOptions.contains(group));
    }

    @Test
    public void testAddOptionGroup_optionsInGroupBecomeNotRequired()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("l", "description l");
        opt1.setRequired(true);
        group.addOption(opt1);

        options.addOptionGroup(group);

        Option retrieved = options.getOption("l");
        Assert.assertFalse(retrieved.isRequired());
    }

    // ---------- getOptions() ----------

    @Test
    public void testGetOptions_emptyOptions_returnsEmptyCollection()
    {
        Collection<Option> result = options.getOptions();
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testGetOptions_withOptions_returnsAllAddedOptions()
    {
        options.addOption("m", "description m");
        options.addOption("n", "description n");

        Collection<Option> result = options.getOptions();
        Assert.assertEquals(2, result.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_returnedCollectionIsUnmodifiable_throwsException()
    {
        options.addOption("o", "description o");
        Collection<Option> result = options.getOptions();
        result.clear();
    }

    // ---------- getRequiredOptions() ----------

    @Test
    public void testGetRequiredOptions_noRequiredOptions_returnsEmptyList()
    {
        options.addOption("p", "description p");
        List requiredOptions = options.getRequiredOptions();
        Assert.assertTrue(requiredOptions.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRequiredOptions_returnedListIsUnmodifiable_throwsException()
    {
        Option opt = new Option("q", "description q");
        opt.setRequired(true);
        options.addOption(opt);

        List requiredOptions = options.getRequiredOptions();
        requiredOptions.clear();
    }

    // ---------- getOption(String opt) ----------

    @Test
    public void testGetOption_existingShortOpt_returnsOption()
    {
        options.addOption("r", "description r");
        Option result = options.getOption("r");
        Assert.assertNotNull(result);
        Assert.assertEquals("r", result.getOpt());
    }

    @Test
    public void testGetOption_existingLongOpt_returnsOption()
    {
        options.addOption("s", "sierra", false, "description s");
        Option result = options.getOption("sierra");
        Assert.assertNotNull(result);
    }

    @Test
    public void testGetOption_withLeadingHyphens_stripsHyphensAndReturnsOption()
    {
        options.addOption("t", "tango", false, "description t");
        Option result = options.getOption("--tango");
        Assert.assertNotNull(result);

        Option shortResult = options.getOption("-t");
        Assert.assertNotNull(shortResult);
    }

    @Test
    public void testGetOption_nonExistingOpt_returnsNull()
    {
        Option result = options.getOption("nonexistent");
        Assert.assertNull(result);
    }

    // ---------- getMatchingOptions(String opt) ----------

    @Test
    public void testGetMatchingOptions_partialMatch_returnsMatchingLongOptions()
    {
        options.addOption("u", "update", false, "description update");
        options.addOption("v", "upgrade", false, "description upgrade");
        options.addOption("w", "wildcard", false, "description wildcard");

        List<String> matches = options.getMatchingOptions("up");
        Assert.assertEquals(2, matches.size());
        Assert.assertTrue(matches.contains("update"));
        Assert.assertTrue(matches.contains("upgrade"));
    }

    @Test
    public void testGetMatchingOptions_noMatch_returnsEmptyList()
    {
        options.addOption("x", "xray", false, "description xray");
        List<String> matches = options.getMatchingOptions("zzz");
        Assert.assertTrue(matches.isEmpty());
    }

    @Test
    public void testGetMatchingOptions_withLeadingHyphens_stripsAndMatches()
    {
        options.addOption("y", "yankee", false, "description yankee");
        List<String> matches = options.getMatchingOptions("--yan");
        Assert.assertEquals(1, matches.size());
        Assert.assertEquals("yankee", matches.get(0));
    }

    @Test
    public void testGetMatchingOptions_emptyString_matchesAllLongOptions()
    {
        options.addOption("z", "zulu", false, "description zulu");
        List<String> matches = options.getMatchingOptions("");
        Assert.assertEquals(1, matches.size());
    }

    // ---------- hasOption(String opt) ----------

    @Test
    public void testHasOption_existingShortOpt_returnsTrue()
    {
        options.addOption("aa", "description aa");
        Assert.assertTrue(options.hasOption("aa"));
    }

    @Test
    public void testHasOption_existingLongOpt_returnsTrue()
    {
        options.addOption("bb", "bblong", false, "description bb");
        Assert.assertTrue(options.hasOption("bblong"));
    }

    @Test
    public void testHasOption_nonExistingOpt_returnsFalse()
    {
        Assert.assertFalse(options.hasOption("nonexistent"));
    }

    @Test
    public void testHasOption_emptyString_returnsFalse()
    {
        Assert.assertFalse(options.hasOption(""));
    }

    // ---------- hasLongOption(String opt) ----------

    @Test
    public void testHasLongOption_existingLongOpt_returnsTrue()
    {
        options.addOption("cc", "cclong", false, "description cc");
        Assert.assertTrue(options.hasLongOption("cclong"));
    }

    @Test
    public void testHasLongOption_shortOptOnly_returnsFalse()
    {
        options.addOption("dd", "description dd");
        Assert.assertFalse(options.hasLongOption("dd"));
    }

    @Test
    public void testHasLongOption_withLeadingHyphens_stripsAndChecks()
    {
        options.addOption("ee", "eelong", false, "description ee");
        Assert.assertTrue(options.hasLongOption("--eelong"));
    }

    // ---------- hasShortOption(String opt) ----------

    @Test
    public void testHasShortOption_existingShortOpt_returnsTrue()
    {
        options.addOption("ff", "description ff");
        Assert.assertTrue(options.hasShortOption("ff"));
    }

    @Test
    public void testHasShortOption_nonExistingOpt_returnsFalse()
    {
        Assert.assertFalse(options.hasShortOption("nonexistent"));
    }

    @Test
    public void testHasShortOption_withLeadingHyphens_stripsAndChecks()
    {
        options.addOption("gg", "description gg");
        Assert.assertTrue(options.hasShortOption("-gg"));
    }

    // ---------- getOptionGroup(Option opt) ----------

    @Test
    public void testGetOptionGroup_optionInGroup_returnsGroup()
    {
        OptionGroup group = new OptionGroup();
        Option opt = new Option("hh", "description hh");
        group.addOption(opt);
        options.addOptionGroup(group);

        OptionGroup result = options.getOptionGroup(opt);
        Assert.assertNotNull(result);
        Assert.assertSame(group, result);
    }

    @Test
    public void testGetOptionGroup_optionNotInGroup_returnsNull()
    {
        Option opt = new Option("ii", "description ii");
        options.addOption(opt);

        OptionGroup result = options.getOptionGroup(opt);
        Assert.assertNull(result);
    }

    // ---------- toString() ----------

    @Test
    public void testToString_emptyOptions_containsExpectedFormat()
    {
        String result = options.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("[ Options:"));
        Assert.assertTrue(result.contains("short"));
        Assert.assertTrue(result.contains("long"));
    }

    @Test
    public void testToString_withOptions_containsOptionDetails()
    {
        options.addOption("jj", "jjlong", false, "description jj");
        String result = options.toString();
        Assert.assertTrue(result.contains("jj"));
    }

    // ---------- edge cases ----------

    @Test
    public void testAddOption_nullDescription_doesNotThrowException()
    {
        options.addOption("kk", (String) null);
        Assert.assertTrue(options.hasOption("kk"));
    }

    @Test
    public void testGetOption_nullLikeStrippedResult_returnsNullWhenNotFound()
    {
        Option result = options.getOption("---");
        Assert.assertNull(result);
    }

    @Test
    public void testAddOptionGroup_emptyGroup_doesNotAddAnyOptions()
    {
        OptionGroup group = new OptionGroup();
        Options result = options.addOptionGroup(group);
        Assert.assertSame(options, result);
        Assert.assertTrue(options.getOptions().isEmpty());
    }
}
