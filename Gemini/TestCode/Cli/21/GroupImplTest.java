package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.junit.Assert;
import org.junit.Test;

public class GroupImplTest {

    @Test
    public void testConstructorAndGetters_normalInput_returnsExpectedValues() {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-a", "--all", false, "display all", null, null, false, 1, 1, null, null);
        options.add(opt1);

        GroupImpl group = new GroupImpl(options, "group1", "test group description", 1, 2, true);

        Assert.assertEquals("group1", group.getPreferredName());
        Assert.assertEquals("test group description", group.getDescription());
        Assert.assertEquals(1, group.getMinimum());
        Assert.assertEquals(2, group.getMaximum());
        Assert.assertEquals(1, group.getOptions().size());
        Assert.assertEquals(0, group.getAnonymous().size());
        Assert.assertTrue(group.getPrefixes().contains("-"));
        Assert.assertTrue(group.getPrefixes().contains("--"));
        Assert.assertTrue(group.getTriggers().contains("-a"));
        Assert.assertTrue(group.getTriggers().contains("--all"));
        Assert.assertSame(group, opt1.getParent());
    }

    @Test
    public void testConstructor_withArgument_separatesAnonymousArgument() {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-o", "--output", false, "output file", null, null, false, 1, 1, null, null);
        ArgumentImpl arg = new ArgumentImpl("file", "a file", 1, 1, '\0', '\0', null, null, null, 0);
        options.add(opt1);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "groupWithArg", "desc", 0, 1, false);

        Assert.assertEquals(1, group.getOptions().size());
        Assert.assertTrue(group.getOptions().contains(opt1));
        Assert.assertEquals(1, group.getAnonymous().size());
        Assert.assertTrue(group.getAnonymous().contains(arg));
        Assert.assertSame(group, arg.getParent());
    }

    @Test
    public void testIsRequired_variousConditions_returnsCorrectBoolean() {
        List options = new ArrayList();
        GroupImpl reqGroup = new GroupImpl(options, "g1", "d", 1, 1, true);
        Assert.assertTrue(reqGroup.isRequired());

        GroupImpl nonReqGroupMinZero = new GroupImpl(options, "g2", "d", 0, 1, true);
        Assert.assertFalse(nonReqGroupMinZero.isRequired());

        GroupImpl nonReqGroupMinOneFalse = new GroupImpl(options, "g3", "d", 1, 1, false);
        Assert.assertTrue(nonReqGroupMinOneFalse.isRequired());

        GroupImpl parentGroup = new GroupImpl(options, "parent", "d", 0, 0, false);
        GroupImpl childGroupNotReq = new GroupImpl(options, "child1", "d", 1, 1, false);
        childGroupNotReq.setParent(parentGroup);
        Assert.assertFalse(childGroupNotReq.isRequired());

        GroupImpl childGroupReq = new GroupImpl(options, "child2", "d", 1, 1, true);
        childGroupReq.setParent(parentGroup);
        Assert.assertTrue(childGroupReq.isRequired());
    }

    @Test
    public void testCanProcess_nullArg_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 0, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());
        Assert.assertFalse(group.canProcess(cl, (String) null));
    }

    @Test
    public void testCanProcess_triggerPresent_returnsTrue() {
        List options = new ArrayList();
        DefaultOption opt = new DefaultOption("-v", "--verbose", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        Assert.assertTrue(group.canProcess(cl, "-v"));
        Assert.assertTrue(group.canProcess(cl, "--verbose"));
    }

    @Test
    public void testCanProcess_anonymousArgumentExists_returnsExpected() {
        List options = new ArrayList();
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 1, '\0', '\0', null, null, null, 0);
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        Assert.assertTrue(group.canProcess(cl, "plainValue"));
        Assert.assertFalse(group.canProcess(cl, "-unknownOption"));
    }

    @Test
    public void testCanProcess_burstingOrTailMapOptionCanProcess_returnsTrue() {
        List options = new ArrayList();
        DefaultOption opt = new DefaultOption("-f", "--file", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        Assert.assertTrue(group.canProcess(cl, "-fValue"));
    }

    @Test
    public void testCanProcess_noAnonymousAndNotOption_returnsFalse() {
        List options = new ArrayList();
        DefaultOption opt = new DefaultOption("-v", "--verbose", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        Assert.assertFalse(group.canProcess(cl, "plainValue"));
    }

    @Test
    public void testFindOption_matchesTrigger_returnsOptionOrNull() {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-a", "--all", false, "desc", null, null, false, 1, 1, null, null);
        DefaultOption opt2 = new DefaultOption("-b", "--brief", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 2, false);

        Assert.assertSame(opt1, group.findOption("-a"));
        Assert.assertSame(opt1, group.findOption("--all"));
        Assert.assertSame(opt2, group.findOption("-b"));
        Assert.assertNull(group.findOption("-c"));
    }

    @Test
    public void testDefaults_callsDefaultsOnChildrenAndAnonymous() {
        List options = new ArrayList();
        List defValues = Collections.singletonList("defaultVal");
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 1, '\0', '\0', null, null, defValues, 0);
        DefaultOption opt = new DefaultOption("-o", "--output", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        group.defaults(cl);
        Assert.assertTrue(cl.hasOption(arg));
        Assert.assertEquals("defaultVal", cl.getValue(arg));
    }

    @Test
    public void testProcess_directMatchOption_processesOption() throws OptionException {
        List options = new ArrayList();
        DefaultOption opt = new DefaultOption("-v", "--verbose", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        List args = new ArrayList();
        args.add("-v");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(cl.hasOption("-v"));
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testProcess_repeatedSameToken_breaksLoop() throws OptionException {
        List options = new ArrayList();
        DefaultOption opt = new DefaultOption("-v", "--verbose", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        String sameToken = new String("-v");
        List args = new ArrayList();
        args.add(sameToken);
        args.add(sameToken);

        ListIterator it = args.listIterator();
        group.process(cl, it);

        Assert.assertTrue(cl.hasOption("-v"));
    }

    @Test
    public void testProcess_burstOptionMatch_processesCorrectly() throws OptionException {
        List options = new ArrayList();
        ArgumentImpl arg = new ArgumentImpl("val", "desc", 1, 1, '\0', '\0', null, null, null, 0);
        DefaultOption opt = new DefaultOption("-f", "--file", false, "desc", null, null, false, 1, 1, arg, null);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        List args = new ArrayList();
        args.add("-fbar");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(cl.hasOption("-f"));
        Assert.assertEquals("bar", cl.getValue("-f"));
    }

    @Test
    public void testProcess_burstOptionNotFound_abortsAndRollsBack() throws OptionException {
        List options = new ArrayList();
        DefaultOption opt = new DefaultOption("-f", "--file", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        List args = new ArrayList();
        args.add("-zUnmatchedOption");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("-zUnmatchedOption", it.next());
    }

    @Test
    public void testProcess_anonymousArgumentMatch_processesArgument() throws OptionException {
        List options = new ArrayList();
        ArgumentImpl arg = new ArgumentImpl("file", "desc", 1, 1, '\0', '\0', null, null, null, 0);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        List args = new ArrayList();
        args.add("input.txt");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(cl.hasOption(arg));
        Assert.assertEquals("input.txt", cl.getValue(arg));
    }

    @Test
    public void testProcess_noAnonymousAndNotOption_stopsProcessing() throws OptionException {
        List options = new ArrayList();
        DefaultOption opt = new DefaultOption("-v", "--verbose", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        List args = new ArrayList();
        args.add("notAnOption");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("notAnOption", it.next());
    }

    @Test
    public void testValidate_validOptionCountAndAnonymous_succeeds() throws OptionException {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-a", "--all", false, "desc", null, null, false, 1, 1, null, null);
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 1, '\0', '\0', null, null, null, 0);
        options.add(opt1);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "g", "d", 1, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());
        cl.addOption(opt1);

        group.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooManyOptions_throwsException() throws OptionException {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-a", "--all", false, "desc", null, null, false, 1, 1, null, null);
        DefaultOption opt2 = new DefaultOption("-b", "--brief", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());
        cl.addOption(opt1);
        cl.addOption(opt2);

        group.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooFewOptions_throwsException() throws OptionException {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-a", "--all", false, "desc", null, null, false, 1, 1, null, null);
        options.add(opt1);

        GroupImpl group = new GroupImpl(options, "g", "d", 1, 1, false);
        WriteableCommandLine cl = new WriteableCommandLineImpl(group, new ArrayList());

        group.validate(cl);
    }

    @Test
    public void testAppendUsage_withVariousSettingsAndSeparators() {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-a", "--all", false, "desc1", null, null, false, 1, 1, null, null);
        DefaultOption opt2 = new DefaultOption("-b", "--brief", false, "desc2", null, null, false, 1, 1, null, null);
        ArgumentImpl arg = new ArgumentImpl("file", "desc3", 1, 1, '\0', '\0', null, null, null, 0);
        options.add(opt1);
        options.add(opt2);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "myGroup", "group desc", 0, 2, false);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        StringBuffer sb = new StringBuffer();
        group.appendUsage(sb, settings, null, ", ");
        String usage = sb.toString();

        Assert.assertTrue(usage.startsWith("["));
        Assert.assertTrue(usage.contains("myGroup"));
        Assert.assertTrue(usage.contains("-a"));
        Assert.assertTrue(usage.contains("-b"));
        Assert.assertTrue(usage.contains(", "));
        Assert.assertTrue(usage.contains("file"));
        Assert.assertTrue(usage.endsWith("]"));

        StringBuffer sbDefaultSep = new StringBuffer();
        group.appendUsage(sbDefaultSep, settings, null);
        Assert.assertTrue(sbDefaultSep.toString().contains("|"));

        Set settingsInner = new HashSet(settings);
        settingsInner.remove(DisplaySetting.DISPLAY_GROUP_OUTER);
        StringBuffer sbInner = new StringBuffer();
        group.appendUsage(sbInner, settingsInner, null);
        Assert.assertTrue(sbInner.toString().startsWith("["));
        Assert.assertTrue(sbInner.toString().endsWith("]"));
    }

    @Test
    public void testAppendUsage_sortedWithComparator() {
        List options = new ArrayList();
        DefaultOption optB = new DefaultOption("-b", "--brief", false, "desc", null, null, false, 1, 1, null, null);
        DefaultOption optA = new DefaultOption("-a", "--all", false, "desc", null, null, false, 1, 1, null, null);
        options.add(optB);
        options.add(optA);

        GroupImpl group = new GroupImpl(options, null, "desc", 1, 2, true);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
            }
        };

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, comp);
        Assert.assertEquals("-a|-b", buffer.toString());
    }

    @Test
    public void testHelpLines_withSettings_returnsCorrectHelpLines() {
        List options = new ArrayList();
        DefaultOption opt1 = new DefaultOption("-a", "--all", false, "desc1", null, null, false, 1, 1, null, null);
        ArgumentImpl arg = new ArgumentImpl("file", "desc2", 1, 1, '\0', '\0', null, null, null, 0);
        options.add(opt1);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "groupHelp", "group desc", 0, 1, false);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(0, settings, null);
        Assert.assertEquals(3, lines.size());
        Assert.assertEquals("groupHelp", ((HelpLine) lines.get(0)).getOption().getPreferredName());

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
            }
        };
        List sortedLines = group.helpLines(0, settings, comp);
        Assert.assertEquals(3, sortedLines.size());

        Set emptySettings = Collections.EMPTY_SET;
        List noLines = group.helpLines(0, emptySettings, null);
        Assert.assertTrue(noLines.isEmpty());
    }
}
