package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Assert;
import org.junit.Test;

public class GroupImplTest {

    private static class DummyCommandLine implements WriteableCommandLine {
        private final Set presentOptions = new HashSet();
        private boolean looksLikeOptionResult = false;

        public void addOption(Option opt) {
            presentOptions.add(opt);
        }

        public void setLooksLikeOption(boolean value) {
            this.looksLikeOptionResult = value;
        }

        public boolean hasOption(Option option) {
            return presentOptions.contains(option);
        }

        public boolean hasOption(String trigger) {
            return false;
        }

        public Option getOption(String trigger) {
            return null;
        }

        public List getValues(Option option) {
            return Collections.EMPTY_LIST;
        }

        public List getValues(Option option, List defaultValues) {
            return defaultValues;
        }

        public List getValues(String trigger) {
            return Collections.EMPTY_LIST;
        }

        public List getValues(String trigger, List defaultValues) {
            return defaultValues;
        }

        public Object getValue(Option option) {
            return null;
        }

        public Object getValue(Option option, Object defaultValue) {
            return defaultValue;
        }

        public Object getValue(String trigger) {
            return null;
        }

        public Object getValue(String trigger, Object defaultValue) {
            return defaultValue;
        }

        public Boolean getSwitch(Option option) {
            return null;
        }

        public Boolean getSwitch(Option option, Boolean defaultValue) {
            return defaultValue;
        }

        public Boolean getSwitch(String trigger) {
            return null;
        }

        public Boolean getSwitch(String trigger, Boolean defaultValue) {
            return defaultValue;
        }

        public Object getProperty(String property) {
            return null;
        }

        public Object getProperty(Option option, String property) {
            return null;
        }

        public Set getProperties() {
            return Collections.EMPTY_SET;
        }

        public Set getProperties(Option option) {
            return Collections.EMPTY_SET;
        }

        public boolean looksLikeOption(String trigger) {
            return looksLikeOptionResult;
        }

        public void addValue(Option option, Object value) {}

        public void addSwitch(Option option, boolean value) {}

        public void setProperty(Option option, String property, String value) {}

        public void setProperty(String property, String value) {}

        public int getOptionCount(Option option) {
            return presentOptions.contains(option) ? 1 : 0;
        }

        public int getOptionCount(String trigger) {
            return 0;
        }

        public List getOptions() {
            return new ArrayList(presentOptions);
        }

        public Set getOptionTriggers() {
            return Collections.EMPTY_SET;
        }

        public List getUndefaultedValues(Option option) {
            return Collections.EMPTY_LIST;
        }
    }

    private static class DummyOption implements Option {
        private final String preferredName;
        private final String description;
        private final Set triggers;
        private final Set prefixes;
        private final boolean required;
        public boolean canProcessResult = false;
        public boolean processCalled = false;
        public boolean validateCalled = false;
        public boolean defaultsCalled = false;

        public DummyOption(String preferredName, String description, Set triggers, Set prefixes, boolean required) {
            this.preferredName = preferredName;
            this.description = description;
            this.triggers = triggers != null ? triggers : Collections.EMPTY_SET;
            this.prefixes = prefixes != null ? prefixes : Collections.EMPTY_SET;
            this.required = required;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String arg) {
            return canProcessResult;
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            return canProcessResult;
        }

        public Set getTriggers() {
            return triggers;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
            processCalled = true;
            if (arguments.hasNext()) {
                arguments.next();
            }
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            validateCalled = true;
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            buffer.append(preferredName);
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            List list = new ArrayList();
            list.add(new HelpLineImpl(this, depth));
            return list;
        }

        public boolean isRequired() {
            return required;
        }

        public void defaults(WriteableCommandLine commandLine) {
            defaultsCalled = true;
        }

        public boolean checkPrefixes(Set prefixes) {
            return true;
        }

        public int getId() {
            return 0;
        }

        public Option findOption(String trigger) {
            if (triggers.contains(trigger)) {
                return this;
            }
            return null;
        }
    }

    private static class DummyArgument extends DummyOption implements Argument {
        public DummyArgument(String preferredName, String description, boolean required) {
            super(preferredName, description, Collections.EMPTY_SET, Collections.EMPTY_SET, required);
        }
    }

    @Test
    public void testConstructor_and_basicProperties() {
        DummyOption opt1 = new DummyOption("-a", "Option A", Collections.singleton("-a"), Collections.singleton("-"), false);
        DummyArgument arg1 = new DummyArgument("file", "File arg", false);

        List optionsList = new ArrayList();
        optionsList.add(opt1);
        optionsList.add(arg1);

        GroupImpl group = new GroupImpl(optionsList, "testGroup", "Test Group Description", 1, 2);

        Assert.assertEquals("testGroup", group.getPreferredName());
        Assert.assertEquals("Test Group Description", group.getDescription());
        Assert.assertEquals(1, group.getMinimum());
        Assert.assertEquals(2, group.getMaximum());
        Assert.assertTrue(group.isRequired());

        Assert.assertEquals(1, group.getOptions().size());
        Assert.assertTrue(group.getOptions().contains(opt1));

        Assert.assertEquals(1, group.getAnonymous().size());
        Assert.assertTrue(group.getAnonymous().contains(arg1));

        Assert.assertEquals(Collections.singleton("-"), group.getPrefixes());
        Assert.assertEquals(Collections.singleton("-a"), group.getTriggers());
    }

    @Test
    public void testIsRequired_zeroMinimum_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "optGroup", "desc", 0, 1);
        Assert.assertFalse(group.isRequired());
    }

    @Test
    public void testCanProcess_nullArg_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        Assert.assertFalse(group.canProcess(cl, (String) null));
    }

    @Test
    public void testCanProcess_exactTriggerMatch_returnsTrue() {
        DummyOption opt = new DummyOption("-v", "verbose", Collections.singleton("-v"), Collections.singleton("-"), false);
        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();

        Assert.assertTrue(group.canProcess(cl, "-v"));
    }

    @Test
    public void testCanProcess_tailMapBurstingCanProcessTrue_returnsTrue() {
        DummyOption opt = new DummyOption("-f", "file", Collections.singleton("-f"), Collections.singleton("-"), false);
        opt.canProcessResult = true;

        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();

        // "-fx" is sorted before "-f" in ReverseStringComparator, so tailMap("-fx") contains "-f"
        Assert.assertTrue(group.canProcess(cl, "-fx"));
    }

    @Test
    public void testCanProcess_tailMapNoMatchLooksLikeOption_returnsFalse() {
        DummyOption opt = new DummyOption("-f", "file", Collections.singleton("-f"), Collections.singleton("-"), false);
        opt.canProcessResult = false;

        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(true);

        Assert.assertFalse(group.canProcess(cl, "-fx"));
    }

    @Test
    public void testCanProcess_anonymousPresent_notOption_returnsTrue() {
        DummyArgument arg = new DummyArgument("anon", "anon arg", false);
        List options = new ArrayList();
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(false);

        Assert.assertTrue(group.canProcess(cl, "someArg"));
    }

    @Test
    public void testCanProcess_noAnonymous_notOption_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(false);

        Assert.assertFalse(group.canProcess(cl, "someArg"));
    }

    @Test
    public void testProcess_directOptionMatch() throws OptionException {
        DummyOption opt = new DummyOption("-o", "output", Collections.singleton("-o"), Collections.singleton("-"), false);
        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();

        List args = new ArrayList();
        args.add("-o");
        args.add("value");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(opt.processCalled);
        Assert.assertEquals("value", it.next());
    }

    @Test
    public void testProcess_loopProtectionSamePreviousToken_aborts() throws OptionException {
        DummyOption opt = new DummyOption("-o", "output", Collections.singleton("-o"), Collections.singleton("-"), false) {
            public void process(WriteableCommandLine commandLine, ListIterator arguments) {
                // intentionally do not advance arguments to trigger same token condition
            }
        };

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();

        List args = new ArrayList();
        args.add("-o");
        ListIterator it = args.listIterator();

        group.process(cl, it);
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("-o", it.next());
    }

    @Test
    public void testProcess_burstingOptionFound() throws OptionException {
        DummyOption opt = new DummyOption("-f", "file", Collections.singleton("-f"), Collections.singleton("-"), false);
        opt.canProcessResult = true;

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(true);

        List args = new ArrayList();
        args.add("-fx");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(opt.processCalled);
    }

    @Test
    public void testProcess_looksLikeOptionButNoMemberCanProcess_backtracksAndReturns() throws OptionException {
        DummyOption opt = new DummyOption("-f", "file", Collections.singleton("-f"), Collections.singleton("-"), false);
        opt.canProcessResult = false;

        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(true);

        List args = new ArrayList();
        args.add("-fx");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertFalse(opt.processCalled);
        Assert.assertEquals(0, it.nextIndex());
    }

    @Test
    public void testProcess_anonymousArgumentMatches() throws OptionException {
        DummyArgument arg = new DummyArgument("target", "target file", false);
        arg.canProcessResult = true;

        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(false);

        List args = new ArrayList();
        args.add("target.txt");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertTrue(arg.processCalled);
    }

    @Test
    public void testProcess_anonymousArgumentCannotProcess() throws OptionException {
        DummyArgument arg = new DummyArgument("target", "target file", false);
        arg.canProcessResult = false;

        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(false);

        List args = new ArrayList();
        args.add("target.txt");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertFalse(arg.processCalled);
    }

    @Test
    public void testProcess_noAnonymousAndNotLooksLikeOption_breaks() throws OptionException {
        GroupImpl group = new GroupImpl(new ArrayList(), "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.setLooksLikeOption(false);

        List args = new ArrayList();
        args.add("target.txt");
        ListIterator it = args.listIterator();

        group.process(cl, it);

        Assert.assertEquals(0, it.nextIndex());
    }

    @Test
    public void testValidate_success() throws OptionException {
        DummyOption opt = new DummyOption("-o", "opt", Collections.singleton("-o"), Collections.singleton("-"), false);
        DummyArgument arg = new DummyArgument("file", "arg", false);

        List options = new ArrayList();
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 1, 2);
        DummyCommandLine cl = new DummyCommandLine();
        cl.addOption(opt);

        group.validate(cl);

        Assert.assertTrue(opt.validateCalled);
        Assert.assertTrue(arg.validateCalled);
    }

    @Test
    public void testValidate_childGroupValidatedEvenIfNotInCommandLine() throws OptionException {
        GroupImpl childGroup = new GroupImpl(new ArrayList(), "child", "child group", 0, 1);
        List options = new ArrayList();
        options.add(childGroup);

        GroupImpl parentGroup = new GroupImpl(options, "parent", "parent group", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();

        parentGroup.validate(cl);
    }

    @Test
    public void testValidate_requiredChildValidated() throws OptionException {
        DummyOption reqOpt = new DummyOption("-r", "req", Collections.singleton("-r"), Collections.singleton("-"), true);
        List options = new ArrayList();
        options.add(reqOpt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2);
        DummyCommandLine cl = new DummyCommandLine();

        group.validate(cl);

        Assert.assertTrue(reqOpt.validateCalled);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooManyOptions_throwsException() throws OptionException {
        DummyOption opt1 = new DummyOption("-a", "a", Collections.singleton("-a"), Collections.singleton("-"), false);
        DummyOption opt2 = new DummyOption("-b", "b", Collections.singleton("-b"), Collections.singleton("-"), false);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();
        cl.addOption(opt1);
        cl.addOption(opt2);

        group.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooFewOptions_throwsException() throws OptionException {
        DummyOption opt1 = new DummyOption("-a", "a", Collections.singleton("-a"), Collections.singleton("-"), false);

        List options = new ArrayList();
        options.add(opt1);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 2, 3);
        DummyCommandLine cl = new DummyCommandLine();
        cl.addOption(opt1);

        group.validate(cl);
    }

    @Test
    public void testFindOption_exists() {
        DummyOption opt1 = new DummyOption("-a", "a", Collections.singleton("-a"), Collections.singleton("-"), false);
        DummyOption opt2 = new DummyOption("-b", "b", Collections.singleton("-b"), Collections.singleton("-"), false);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2);

        Assert.assertEquals(opt1, group.findOption("-a"));
        Assert.assertEquals(opt2, group.findOption("-b"));
        Assert.assertNull(group.findOption("-c"));
    }

    @Test
    public void testDefaults_callsAllChildren() {
        DummyOption opt = new DummyOption("-a", "a", Collections.singleton("-a"), Collections.singleton("-"), false);
        DummyArgument arg = new DummyArgument("file", "arg", false);

        List options = new ArrayList();
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cl = new DummyCommandLine();

        group.defaults(cl);

        Assert.assertTrue(opt.defaultsCalled);
        Assert.assertTrue(arg.defaultsCalled);
    }

    @Test
    public void testAppendUsage_allDisplaySettings() {
        DummyOption opt1 = new DummyOption("-a", "alpha", Collections.singleton("-a"), Collections.singleton("-"), false);
        DummyOption opt2 = new DummyOption("-b", "beta", Collections.singleton("-b"), Collections.singleton("-"), false);
        DummyArgument arg = new DummyArgument("<file>", "file argument", false);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "myGroup", "group desc", 0, 2);

        Set helpSettings = new HashSet();
        helpSettings.add(DisplaySetting.DISPLAY_OPTIONAL);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, helpSettings, null);

        String result = buffer.toString();
        Assert.assertTrue(result.contains("myGroup"));
        Assert.assertTrue(result.contains("-a"));
        Assert.assertTrue(result.contains("-b"));
        Assert.assertTrue(result.contains("<file>"));
        Assert.assertTrue(result.startsWith("["));
        Assert.assertTrue(result.endsWith("]"));
    }

    @Test
    public void testAppendUsage_withComparatorAndInnerOptional() {
        DummyOption opt1 = new DummyOption("-b", "beta", Collections.singleton("-b"), Collections.singleton("-"), false);
        DummyOption opt2 = new DummyOption("-a", "alpha", Collections.singleton("-a"), Collections.singleton("-"), false);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, null, "desc", 0, 2);

        Set helpSettings = new HashSet();
        helpSettings.add(DisplaySetting.DISPLAY_OPTIONAL);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
            }
        };

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, helpSettings, comp, ", ");

        String result = buffer.toString();
        Assert.assertEquals("[-a, -b]", result);
    }

    @Test
    public void testAppendUsage_namedNotExpanded() {
        DummyOption opt = new DummyOption("-a", "alpha", Collections.singleton("-a"), Collections.singleton("-"), false);
        List options = new ArrayList();
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "groupName", "desc", 1, 1);
        Set helpSettings = new HashSet();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, helpSettings, null);

        Assert.assertEquals("groupName", buffer.toString());
    }

    @Test
    public void testHelpLines() {
        DummyOption opt1 = new DummyOption("-a", "alpha", Collections.singleton("-a"), Collections.singleton("-"), false);
        DummyOption opt2 = new DummyOption("-b", "beta", Collections.singleton("-b"), Collections.singleton("-"), false);
        DummyArgument arg = new DummyArgument("file", "target", false);

        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "grp desc", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
            }
        };

        List lines = group.helpLines(0, settings, comp);
        Assert.assertEquals(4, lines.size()); // 1 group line + 2 options + 1 anonymous

        List linesNoComp = group.helpLines(0, settings, null);
        Assert.assertEquals(4, linesNoComp.size());

        List linesEmptySettings = group.helpLines(0, Collections.EMPTY_SET, null);
        Assert.assertEquals(0, linesEmptySettings.size());
    }
}
