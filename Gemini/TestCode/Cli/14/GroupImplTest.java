package org.apache.commons.cli2.option;

import java.util.ArrayList;
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

    // --- Mock / Stub implementations for tests ---

    private static class DummyCommandLine implements WriteableCommandLine {
        private final Set presentOptions = new HashSet();
        private boolean looksLikeOptionResult = false;

        public void addOption(Option option) {
            presentOptions.add(option);
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

        public Object getProperty(String property, Object defaultValue) {
            return defaultValue;
        }

        public Set getProperties() {
            return Collections.EMPTY_SET;
        }

        public List getOptions() {
            return new ArrayList(presentOptions);
        }

        public Set getOptionTriggers() {
            return Collections.EMPTY_SET;
        }

        public void addValue(Option option, Object value) {}

        public void addProperty(String property, String value) {}

        public void addProperty(Option option, String property, String value) {}

        public void addSwitch(Option option, boolean value) {}

        public boolean looksLikeOption(String trigger) {
            return looksLikeOptionResult;
        }

        public void setLooksLikeOption(boolean value) {
            this.looksLikeOptionResult = value;
        }

        public List getUndefaultedValues(Option option) {
            return Collections.EMPTY_LIST;
        }

        public void setDefaultValues(Option option, List defaults) {}

        public void setDefaultSwitch(Option option, Boolean defaultSwitch) {}
    }

    private static class DummyOption implements Option {
        private final String preferredName;
        private final Set triggers = new HashSet();
        private final Set prefixes = new HashSet();
        private boolean required = false;
        private boolean canProcessResult = false;
        private boolean validated = false;
        private boolean defaulted = false;
        private boolean processed = false;
        private boolean throwOnValidate = false;

        public DummyOption(String preferredName) {
            this.preferredName = preferredName;
            if (preferredName != null) {
                triggers.add(preferredName);
                if (preferredName.startsWith("-")) {
                    prefixes.add("-");
                }
            }
        }

        public DummyOption(String preferredName, Set triggers, Set prefixes) {
            this.preferredName = preferredName;
            if (triggers != null) this.triggers.addAll(triggers);
            if (prefixes != null) this.prefixes.addAll(prefixes);
        }

        public boolean canProcess(WriteableCommandLine commandLine, String arg) {
            return canProcessResult || triggers.contains(arg);
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
            this.processed = true;
            if (arguments.hasNext()) {
                arguments.next();
            }
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            this.validated = true;
            if (throwOnValidate) {
                throw new OptionException(this, "Validation failed");
            }
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            buffer.append(preferredName);
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            List lines = new ArrayList();
            lines.add(new HelpLineImpl(this, depth));
            return lines;
        }

        public Set getTriggers() {
            return triggers;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public int getId() {
            return 0;
        }

        public boolean isRequired() {
            return required;
        }

        public void setRequired(boolean required) {
            this.required = required;
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return "Desc for " + preferredName;
        }

        public Option findOption(String trigger) {
            return triggers.contains(trigger) ? this : null;
        }

        public void defaults(WriteableCommandLine commandLine) {
            this.defaulted = true;
        }

        public boolean checkPrefixes(Set prefixes) {
            return true;
        }

        public void setCanProcessResult(boolean canProcessResult) {
            this.canProcessResult = canProcessResult;
        }

        public void setThrowOnValidate(boolean throwOnValidate) {
            this.throwOnValidate = throwOnValidate;
        }
    }

    private static class DummyArgument extends DummyOption implements Argument {
        public DummyArgument(String preferredName) {
            super(preferredName, Collections.EMPTY_SET, Collections.EMPTY_SET);
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            return true;
        }

        public Object getInitialSeparator() {
            return null;
        }

        public int getMaximum() {
            return 1;
        }

        public int getMinimum() {
            return 0;
        }

        public String getStripPrefix() {
            return null;
        }

        public boolean isRequired() {
            return false;
        }
    }

    // --- Tests ---

    @Test
    public void testConstructor_separatesOptionsAndArguments() {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("--opt");
        DummyArgument arg = new DummyArgument("arg");
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "group desc", 1, 2);

        Assert.assertEquals(1, group.getOptions().size());
        Assert.assertEquals(opt, group.getOptions().get(0));
        Assert.assertEquals(1, group.getAnonymous().size());
        Assert.assertEquals(arg, group.getAnonymous().get(0));
        Assert.assertEquals("group", group.getPreferredName());
        Assert.assertEquals("group desc", group.getDescription());
        Assert.assertEquals(1, group.getMinimum());
        Assert.assertEquals(2, group.getMaximum());
        Assert.assertTrue(group.isRequired());
    }

    @Test
    public void testCanProcess_nullArg_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "test", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        Assert.assertFalse(group.canProcess(cmd, null));
    }

    @Test
    public void testCanProcess_exactMatch_returnsTrue() {
        List options = new ArrayList();
        options.add(new DummyOption("--test"));
        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();

        Assert.assertTrue(group.canProcess(cmd, "--test"));
    }

    @Test
    public void testCanProcess_tailMapOptionCanProcess_returnsTrue() {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-f");
        opt.setCanProcessResult(true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();

        Assert.assertTrue(group.canProcess(cmd, "-fx"));
    }

    @Test
    public void testCanProcess_looksLikeOption_returnsFalse() {
        List options = new ArrayList();
        DummyArgument arg = new DummyArgument("file");
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.setLooksLikeOption(true);

        Assert.assertFalse(group.canProcess(cmd, "--unknown"));
    }

    @Test
    public void testCanProcess_anonymousArgumentAvailable_returnsTrue() {
        List options = new ArrayList();
        DummyArgument arg = new DummyArgument("file");
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.setLooksLikeOption(false);

        Assert.assertTrue(group.canProcess(cmd, "someFile.txt"));
    }

    @Test
    public void testCanProcess_noAnonymousAndNotOption_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.setLooksLikeOption(false);

        Assert.assertFalse(group.canProcess(cmd, "someFile.txt"));
    }

    @Test
    public void testGetPrefixesAndTriggers() {
        List options = new ArrayList();
        DummyOption opt1 = new DummyOption("-a");
        DummyOption opt2 = new DummyOption("--beta");
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2);

        Assert.assertTrue(group.getPrefixes().contains("-"));
        Assert.assertTrue(group.getTriggers().contains("-a"));
        Assert.assertTrue(group.getTriggers().contains("--beta"));
    }

    @Test
    public void testProcess_optionFound() throws OptionException {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("--file");
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();

        List args = new ArrayList();
        args.add("--file");
        args.add("value");

        ListIterator iterator = args.listIterator();
        group.process(cmd, iterator);

        Assert.assertTrue(opt.processed);
    }

    @Test
    public void testProcess_sameArgumentLoopPrevention() throws OptionException {
        List options = new ArrayList();
        // Create an option that doesn't advance the iterator in process to test loop break
        DummyOption opt = new DummyOption("--stuck") {
            public void process(WriteableCommandLine cl, ListIterator it) {}
        };
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();

        List args = new ArrayList();
        args.add("--stuck");

        ListIterator iterator = args.listIterator();
        group.process(cmd, iterator);

        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testProcess_burstingOptionFound() throws OptionException {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-f");
        opt.setCanProcessResult(true);
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.setLooksLikeOption(true);

        List args = new ArrayList();
        args.add("-foo");
        ListIterator iterator = args.listIterator();

        group.process(cmd, iterator);
        Assert.assertTrue(opt.processed);
    }

    @Test
    public void testProcess_looksLikeOptionButNotFound_backtracksAndReturns() throws OptionException {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-a");
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.setLooksLikeOption(true);

        List args = new ArrayList();
        args.add("-unknown");
        ListIterator iterator = args.listIterator();

        group.process(cmd, iterator);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("-unknown", iterator.next());
    }

    @Test
    public void testProcess_notLookingLikeOption_anonymousPresent() throws OptionException {
        List options = new ArrayList();
        DummyArgument arg = new DummyArgument("anon");
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.setLooksLikeOption(false);

        List args = new ArrayList();
        args.add("plainArg");
        ListIterator iterator = args.listIterator();

        group.process(cmd, iterator);
        Assert.assertTrue(arg.processed);
    }

    @Test
    public void testProcess_notLookingLikeOption_noAnonymous_breaks() throws OptionException {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-a");
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.setLooksLikeOption(false);

        List args = new ArrayList();
        args.add("plainArg");
        ListIterator iterator = args.listIterator();

        group.process(cmd, iterator);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("plainArg", iterator.next());
    }

    @Test
    public void testValidate_successful() throws OptionException {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-a");
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 1, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.addOption(opt);

        group.validate(cmd);
        Assert.assertTrue(opt.validated);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooFewOptions_throwsOptionException() throws OptionException {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-a");
        options.add(opt);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 1, 1);
        DummyCommandLine cmd = new DummyCommandLine();

        group.validate(cmd);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooManyOptions_throwsOptionException() throws OptionException {
        List options = new ArrayList();
        DummyOption opt1 = new DummyOption("-a");
        DummyOption opt2 = new DummyOption("-b");
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();
        cmd.addOption(opt1);
        cmd.addOption(opt2);

        group.validate(cmd);
    }

    @Test
    public void testValidate_withRequiredOptionAndAnonymous() throws OptionException {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-a");
        opt.setRequired(true);
        DummyArgument arg = new DummyArgument("arg");
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 5);
        DummyCommandLine cmd = new DummyCommandLine();

        group.validate(cmd);
        Assert.assertTrue(opt.validated);
        Assert.assertTrue(arg.validated);
    }

    @Test
    public void testValidate_withNestedGroup() throws OptionException {
        List innerOptions = new ArrayList();
        DummyOption innerOpt = new DummyOption("-inner");
        innerOptions.add(innerOpt);
        GroupImpl innerGroup = new GroupImpl(innerOptions, "innerGroup", "desc", 0, 1);

        List outerOptions = new ArrayList();
        outerOptions.add(innerGroup);

        GroupImpl outerGroup = new GroupImpl(outerOptions, "outerGroup", "desc", 0, 1);
        DummyCommandLine cmd = new DummyCommandLine();

        outerGroup.validate(cmd);
    }

    @Test
    public void testAppendUsage_allDisplaySettingsCombinations() {
        List options = new ArrayList();
        DummyOption opt1 = new DummyOption("-b");
        DummyOption opt2 = new DummyOption("-a");
        DummyArgument arg = new DummyArgument("FILE");
        options.add(opt1);
        options.add(opt2);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "mygroup", "group desc", 0, 2);

        // Case 1: Default appendUsage (minimum == 0, DISPLAY_OPTIONAL, DISPLAY_GROUP_EXPANDED, DISPLAY_GROUP_NAME, DISPLAY_GROUP_ARGUMENT, DISPLAY_GROUP_OUTER)
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);
        Assert.assertTrue(buffer.toString().startsWith("[mygroup ("));
        Assert.assertTrue(buffer.toString().endsWith("] FILE"));

        // Case 2: Custom separator and Comparator sorting
        buffer = new StringBuffer();
        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };
        group.appendUsage(buffer, settings, comp, ", ");
        Assert.assertTrue(buffer.toString().contains("-a, -b"));

        // Case 3: Expanded only (name is null)
        GroupImpl unnamedGroup = new GroupImpl(options, null, "desc", 1, 2);
        buffer = new StringBuffer();
        unnamedGroup.appendUsage(buffer, Collections.EMPTY_SET, null);
        Assert.assertEquals("-b|-a", buffer.toString());

        // Case 4: DISPLAY_OPTIONAL without DISPLAY_GROUP_OUTER
        Set settingsNoOuter = new HashSet();
        settingsNoOuter.add(DisplaySetting.DISPLAY_OPTIONAL);
        settingsNoOuter.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settingsNoOuter.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        buffer = new StringBuffer();
        group.appendUsage(buffer, settingsNoOuter, null);
        Assert.assertTrue(buffer.toString().startsWith("[-b|-a FILE]"));
    }

    @Test
    public void testHelpLines_variousSettings() {
        List options = new ArrayList();
        DummyOption opt1 = new DummyOption("-b");
        DummyOption opt2 = new DummyOption("-a");
        DummyArgument arg = new DummyArgument("ARG");
        options.add(opt1);
        options.add(opt2);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "groupName", "groupDesc", 0, 2);

        // Case 1: DISPLAY_GROUP_NAME only
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        List lines = group.helpLines(0, settings, null);
        Assert.assertEquals(1, lines.size());

        // Case 2: DISPLAY_GROUP_EXPANDED with comparator
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };
        lines = group.helpLines(0, settings, comp);
        Assert.assertEquals(4, lines.size()); // groupName, -a, -b, ARG

        // Case 3: DISPLAY_GROUP_EXPANDED without comparator
        lines = group.helpLines(0, settings, null);
        Assert.assertEquals(4, lines.size());
    }

    @Test
    public void testFindOption() {
        List options = new ArrayList();
        DummyOption opt1 = new DummyOption("--first");
        DummyOption opt2 = new DummyOption("--second");
        options.add(opt1);
        options.add(opt2);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2);

        Assert.assertEquals(opt1, group.findOption("--first"));
        Assert.assertEquals(opt2, group.findOption("--second"));
        Assert.assertNull(group.findOption("--notfound"));
    }

    @Test
    public void testDefaults() {
        List options = new ArrayList();
        DummyOption opt = new DummyOption("-o");
        DummyArgument arg = new DummyArgument("a");
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2);
        DummyCommandLine cmd = new DummyCommandLine();

        group.defaults(cmd);
        Assert.assertTrue(opt.defaulted);
        Assert.assertTrue(arg.defaulted);
    }

    @Test
    public void testIsRequired_basedOnMinimum() {
        GroupImpl optionalGroup = new GroupImpl(new ArrayList(), "grp1", "desc", 0, 1);
        Assert.assertFalse(optionalGroup.isRequired());

        GroupImpl requiredGroup = new GroupImpl(new ArrayList(), "grp2", "desc", 1, 2);
        Assert.assertTrue(requiredGroup.isRequired());
    }

    @Test
    public void testReverseStringComparator() {
        Comparator comp = ReverseStringComparator.getInstance();
        Assert.assertTrue(comp.compare("a", "b") > 0);
        Assert.assertTrue(comp.compare("b", "a") < 0);
        Assert.assertEquals(0, comp.compare("same", "same"));
    }
}
