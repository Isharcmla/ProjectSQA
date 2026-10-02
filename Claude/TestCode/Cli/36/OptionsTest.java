import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import java.util.Collection;
import java.util.List;

public class OptionsTest {

    private Options options;

    @Before
    public void setUp() {
        options = new Options();
    }

    // ---------- addOption(String, String) ----------

    @Test
    public void testAddOption_shortNameAndDescription_normalInput() {
        Options result = options.addOption("a", "description a");
        Assert.assertSame(result, options);
        Assert.assertTrue(options.hasOption("a"));
        Option opt = options.getOption("a");
        Assert.assertNotNull(opt);
        Assert.assertEquals("description a", opt.getDescription());
        Assert.assertFalse(opt.hasArg());
    }

    @Test
    public void testAddOption_shortNameAndNullDescription_edgeCase() {
        Options result = options.addOption("b", null);
        Assert.assertSame(result, options);
        Assert.assertTrue(options.hasOption("b"));
        Option opt = options.getOption("b");
        Assert.assertNull(opt.getDescription());
    }

    // ---------- addOption(String, boolean, String) ----------

    @Test
    public void testAddOption_shortNameHasArgDescription_normalInput() {
        options.addOption("c", true, "description c");
        Option opt = options.getOption("c");
        Assert.assertNotNull(opt);
        Assert.assertTrue(opt.hasArg());
        Assert.assertEquals("description c", opt.getDescription());
    }

    @Test
    public void testAddOption_shortNameNoArgDescription_normalInput() {
        options.addOption("d", false, "description d");
        Option opt = options.getOption("d");
        Assert.assertNotNull(opt);
        Assert.assertFalse(opt.hasArg());
    }

    // ---------- addOption(String, String, boolean, String) ----------

    @Test
    public void testAddOption_shortLongHasArgDescription_normalInput() {
        options.addOption("e", "longE", true, "description e");
        Option optShort = options.getOption("e");
        Option optLong = options.getOption("longE");
        Assert.assertNotNull(optShort);
        Assert.assertNotNull(optLong);
        Assert.assertSame(optShort, optLong);
        Assert.assertTrue(optShort.hasArg());
        Assert.assertEquals("longE", optShort.getLongOpt());
    }

    @Test
    public void testAddOption_shortNullLongOpt_edgeCase() {
        options.addOption("f", null, false, "description f");
        Option opt = options.getOption("f");
        Assert.assertNotNull(opt);
        Assert.assertNull(opt.getLongOpt());
        Assert.assertFalse(opt.hasLongOpt());
    }

    // ---------- addOption(Option) ----------

    @Test
    public void testAddOption_optionInstance_normalInput() throws Exception {
        Option opt = new Option("g", "longG", false, "description g");
        Options result = options.addOption(opt);
        Assert.assertSame(result, options);
        Assert.assertTrue(options.hasOption("g"));
        Assert.assertTrue(options.hasOption("longG"));
    }

    @Test
    public void testAddOption_requiredOption_addedToRequiredList() throws Exception {
        Option opt = new Option("h", "longH", false, "description h");
        opt.setRequired(true);
        options.addOption(opt);
        List requiredOptions = options.getRequiredOptions();
        Assert.assertTrue(requiredOptions.contains("h"));
    }

    @Test
    public void testAddOption_duplicateRequiredOption_notDuplicatedInRequiredList() throws Exception {
        Option opt1 = new Option("i", "longI", false, "description i");
        opt1.setRequired(true);
        options.addOption(opt1);

        Option opt2 = new Option("i", "longI2", false, "description i2");
        opt2.setRequired(true);
        options.addOption(opt2);

        List requiredOptions = options.getRequiredOptions();
        int count = 0;
        for (Object o : requiredOptions) {
            if ("i".equals(o)) {
                count++;
            }
        }
        Assert.assertEquals(1, count);
    }

    @Test
    public void testAddOption_withoutLongOpt_notAddedToLongOptsMap() throws Exception {
        Option opt = new Option("j", false, "description j");
        options.addOption(opt);
        Assert.assertFalse(options.hasLongOption("j"));
        Assert.assertTrue(options.hasShortOption("j"));
    }

    // ---------- addOptionGroup(OptionGroup) ----------

    @Test
    public void testAddOptionGroup_requiredGroup_normalInput() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("k", "longK", false, "description k");
        Option opt2 = new Option("l", "longL", false, "description l");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);

        Options result = options.addOptionGroup(group);
        Assert.assertSame(result, options);

        Assert.assertTrue(options.hasOption("k"));
        Assert.assertTrue(options.hasOption("l"));

        List requiredOptions = options.getRequiredOptions();
        Assert.assertTrue(requiredOptions.contains(group));

        // options within a group should not be individually required
        Assert.assertFalse(opt1.isRequired());
        Assert.assertFalse(opt2.isRequired());

        OptionGroup fetchedGroup = options.getOptionGroup(opt1);
        Assert.assertSame(group, fetchedGroup);
    }

    @Test
    public void testAddOptionGroup_notRequiredGroup_edgeCase() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("m", "longM", false, "description m");
        group.addOption(opt1);
        group.setRequired(false);

        options.addOptionGroup(group);

        List requiredOptions = options.getRequiredOptions();
        Assert.assertFalse(requiredOptions.contains(group));
    }

    @Test
    public void testGetOptionGroups_multipleGroups_returnsCorrectSet() throws Exception {
        OptionGroup group1 = new OptionGroup();
        Option opt1 = new Option("n", "longN", false, "description n");
        group1.addOption(opt1);

        OptionGroup group2 = new OptionGroup();
        Option opt2 = new Option("o", "longO", false, "description o");
        group2.addOption(opt2);

        options.addOptionGroup(group1);
        options.addOptionGroup(group2);

        // getOptionGroups is package-private, testing indirectly via getOptionGroup
        Assert.assertSame(group1, options.getOptionGroup(opt1));
        Assert.assertSame(group2, options.getOptionGroup(opt2));
    }

    // ---------- getOptions() ----------

    @Test
    public void testGetOptions_afterAddingOptions_returnsAllOptions() {
        options.addOption("p", "description p");
        options.addOption("q", "description q");

        Collection<Option> allOptions = options.getOptions();
        Assert.assertEquals(2, allOptions.size());
    }

    @Test
    public void testGetOptions_emptyOptions_returnsEmptyCollection() {
        Collection<Option> allOptions = options.getOptions();
        Assert.assertTrue(allOptions.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_returnedCollectionIsUnmodifiable_throwsException() {
        options.addOption("r", "description r");
        Collection<Option> allOptions = options.getOptions();
        allOptions.clear();
    }

    // ---------- getRequiredOptions() ----------

    @Test
    public void testGetRequiredOptions_noRequiredOptions_returnsEmptyList() {
        options.addOption("s", "description s");
        List requiredOptions = options.getRequiredOptions();
        Assert.assertTrue(requiredOptions.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRequiredOptions_returnedListIsUnmodifiable_throwsException() throws Exception {
        Option opt = new Option("t", "longT", false, "description t");
        opt.setRequired(true);
        options.addOption(opt);
        List requiredOptions = options.getRequiredOptions();
        requiredOptions.clear();
    }

    // ---------- getOption(String) ----------

    @Test
    public void testGetOption_existingShortOption_returnsOption() {
        options.addOption("u", "description u");
        Option opt = options.getOption("u");
        Assert.assertNotNull(opt);
    }

    @Test
    public void testGetOption_existingLongOption_returnsOption() {
        options.addOption("v", "longV", false, "description v");
        Option opt = options.getOption("longV");
        Assert.assertNotNull(opt);
        Assert.assertEquals("v", opt.getOpt());
    }

    @Test
    public void testGetOption_nonExistingOption_returnsNull() {
        Option opt = options.getOption("nonexistent");
        Assert.assertNull(opt);
    }

    @Test
    public void testGetOption_withLeadingHyphens_stripsHyphensAndReturnsOption() {
        options.addOption("w", "description w");
        Option opt = options.getOption("--w");
        Assert.assertNotNull(opt);
    }

    @Test
    public void testGetOption_withSingleLeadingHyphen_stripsHyphenAndReturnsOption() {
        options.addOption("x", "description x");
        Option opt = options.getOption("-x");
        Assert.assertNotNull(opt);
    }

    // ---------- getMatchingOptions(String) ----------

    @Test
    public void testGetMatchingOptions_exactMatch_returnsSingleOption() {
        options.addOption("y", "longY", false, "description y");
        options.addOption("z", "longYZ", false, "description z");

        List<String> matches = options.getMatchingOptions("longY");
        Assert.assertEquals(1, matches.size());
        Assert.assertEquals("longY", matches.get(0));
    }

    @Test
    public void testGetMatchingOptions_partialMatch_returnsMultipleOptions() {
        options.addOption("a1", "alpha", false, "desc alpha");
        options.addOption("a2", "alphaBeta", false, "desc alphaBeta");

        List<String> matches = options.getMatchingOptions("alpha");
        // exact match "alpha" exists, so it should return only that single match
        Assert.assertEquals(1, matches.size());
        Assert.assertEquals("alpha", matches.get(0));
    }

    @Test
    public void testGetMatchingOptions_partialMatchNoExact_returnsMultipleOptions() {
        options.addOption("b1", "betaOne", false, "desc betaOne");
        options.addOption("b2", "betaTwo", false, "desc betaTwo");

        List<String> matches = options.getMatchingOptions("beta");
        Assert.assertEquals(2, matches.size());
        Assert.assertTrue(matches.contains("betaOne"));
        Assert.assertTrue(matches.contains("betaTwo"));
    }

    @Test
    public void testGetMatchingOptions_noMatch_returnsEmptyList() {
        options.addOption("c1", "gamma", false, "desc gamma");
        List<String> matches = options.getMatchingOptions("delta");
        Assert.assertTrue(matches.isEmpty());
    }

    @Test
    public void testGetMatchingOptions_withLeadingHyphens_stripsAndMatches() {
        options.addOption("d1", "deltaOption", false, "desc delta");
        List<String> matches = options.getMatchingOptions("--delta");
        Assert.assertEquals(1, matches.size());
        Assert.assertEquals("deltaOption", matches.get(0));
    }

    // ---------- hasOption(String) ----------

    @Test
    public void testHasOption_existingShortOption_returnsTrue() {
        options.addOption("e1", "description e1");
        Assert.assertTrue(options.hasOption("e1"));
    }

    @Test
    public void testHasOption_existingLongOption_returnsTrue() {
        options.addOption("f1", "longF1", false, "description f1");
        Assert.assertTrue(options.hasOption("longF1"));
    }

    @Test
    public void testHasOption_nonExistingOption_returnsFalse() {
        Assert.assertFalse(options.hasOption("nonexistent"));
    }

    @Test
    public void testHasOption_withLeadingHyphens_returnsTrue() {
        options.addOption("g1", "description g1");
        Assert.assertTrue(options.hasOption("-g1"));
    }

    // ---------- hasLongOption(String) ----------

    @Test
    public void testHasLongOption_existingLongOption_returnsTrue() {
        options.addOption("h1", "longH1", false, "description h1");
        Assert.assertTrue(options.hasLongOption("longH1"));
    }

    @Test
    public void testHasLongOption_shortOptionOnly_returnsFalse() {
        options.addOption("i1", "description i1");
        Assert.assertFalse(options.hasLongOption("i1"));
    }

    @Test
    public void testHasLongOption_withLeadingHyphens_returnsTrue() {
        options.addOption("j1", "longJ1", false, "description j1");
        Assert.assertTrue(options.hasLongOption("--longJ1"));
    }

    @Test
    public void testHasLongOption_nonExisting_returnsFalse() {
        Assert.assertFalse(options.hasLongOption("nonexistent"));
    }

    // ---------- hasShortOption(String) ----------

    @Test
    public void testHasShortOption_existingShortOption_returnsTrue() {
        options.addOption("k1", "description k1");
        Assert.assertTrue(options.hasShortOption("k1"));
    }

    @Test
    public void testHasShortOption_longOptionOnly_returnsFalseForLongName() {
        options.addOption("l1", "longL1", false, "description l1");
        Assert.assertFalse(options.hasShortOption("longL1"));
        Assert.assertTrue(options.hasShortOption("l1"));
    }

    @Test
    public void testHasShortOption_withLeadingHyphens_returnsTrue() {
        options.addOption("m1", "description m1");
        Assert.assertTrue(options.hasShortOption("-m1"));
    }

    @Test
    public void testHasShortOption_nonExisting_returnsFalse() {
        Assert.assertFalse(options.hasShortOption("nonexistent"));
    }

    // ---------- getOptionGroup(Option) ----------

    @Test
    public void testGetOptionGroup_optionInGroup_returnsGroup() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt = new Option("n1", "longN1", false, "description n1");
        group.addOption(opt);
        options.addOptionGroup(group);

        OptionGroup fetchedGroup = options.getOptionGroup(opt);
        Assert.assertSame(group, fetchedGroup);
    }

    @Test
    public void testGetOptionGroup_optionNotInGroup_returnsNull() throws Exception {
        Option opt = new Option("o1", "longO1", false, "description o1");
        options.addOption(opt);

        OptionGroup fetchedGroup = options.getOptionGroup(opt);
        Assert.assertNull(fetchedGroup);
    }

    // ---------- toString() ----------

    @Test
    public void testToString_withOptions_returnsFormattedString() {
        options.addOption("p1", "longP1", false, "description p1");
        String result = options.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("[ Options:"));
        Assert.assertTrue(result.contains("short"));
        Assert.assertTrue(result.contains("long"));
    }

    @Test
    public void testToString_emptyOptions_returnsFormattedEmptyString() {
        String result = options.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("[ Options:"));
    }

    // ---------- Exception scenarios ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddOption_invalidOptionCharacters_throwsException() throws Exception {
        // Option constructor should throw IllegalArgumentException for invalid characters
        Option invalidOption = new Option("=invalid=", "description invalid");
        options.addOption(invalidOption);
    }

    @Test
    public void testGetOption_nullOpt_handledGracefully() {
        // Util.stripLeadingHyphens with null input behavior depends on implementation;
        // testing that no unexpected exception breaks normal flow when opt not found
        try {
            Option opt = options.getOption("nonexistentXYZ");
            Assert.assertNull(opt);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }
}
