package org.apache.commons.cli2.commandline;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private List arguments;
    private WriteableCommandLineImpl commandLine;

    private Option createOptionStub(final String preferredName, final Set triggers, final Set prefixes) {
        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class<?>[]{Option.class},
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) {
                        return preferredName;
                    }
                    if ("getTriggers".equals(name)) {
                        return triggers != null ? triggers : Collections.EMPTY_SET;
                    }
                    if ("getPrefixes".equals(name)) {
                        return prefixes != null ? prefixes : Collections.EMPTY_SET;
                    }
                    if ("equals".equals(name)) {
                        return proxy == args[0];
                    }
                    if ("hashCode".equals(name)) {
                        return System.identityHashCode(proxy);
                    }
                    if ("toString".equals(name)) {
                        return "OptionProxy[" + preferredName + "]";
                    }
                    return null;
                }
            }
        );
    }

    private Argument createArgumentStub(final String preferredName, final Set triggers, final Set prefixes) {
        return (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class<?>[]{Argument.class},
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) {
                        return preferredName;
                    }
                    if ("getTriggers".equals(name)) {
                        return triggers != null ? triggers : Collections.EMPTY_SET;
                    }
                    if ("getPrefixes".equals(name)) {
                        return prefixes != null ? prefixes : Collections.EMPTY_SET;
                    }
                    if ("equals".equals(name)) {
                        return proxy == args[0];
                    }
                    if ("hashCode".equals(name)) {
                        return System.identityHashCode(proxy);
                    }
                    if ("toString".equals(name)) {
                        return "ArgumentProxy[" + preferredName + "]";
                    }
                    return null;
                }
            }
        );
    }

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        rootOption = createOptionStub("root", Collections.EMPTY_SET, prefixes);
        arguments = new ArrayList();
        arguments.add("--file");
        arguments.add("my file.txt");
        arguments.add("verbose");
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    @Test
    public void testConstructor_normal_fieldsInitialized() {
        Assert.assertNotNull(commandLine.getNormalised());
        Assert.assertEquals(3, commandLine.getNormalised().size());
        Assert.assertEquals(arguments, commandLine.getNormalised());
    }

    @Test
    public void testAddOption_singleOptionWithTriggers_addedSuccessfully() {
        Set triggers = new HashSet();
        triggers.add("-f");
        triggers.add("--file");
        Option opt = createOptionStub("--file", triggers, Collections.EMPTY_SET);

        commandLine.addOption(opt);

        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertEquals(1, commandLine.getOptions().size());
        Assert.assertEquals(opt, commandLine.getOption("--file"));
        Assert.assertEquals(opt, commandLine.getOption("-f"));
        Assert.assertTrue(commandLine.getOptionTriggers().contains("-f"));
        Assert.assertTrue(commandLine.getOptionTriggers().contains("--file"));
    }

    @Test
    public void testHasOption_optionNotPresent_returnsFalse() {
        Option opt = createOptionStub("--absent", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Assert.assertFalse(commandLine.hasOption(opt));
    }

    @Test
    public void testGetOption_unknownTrigger_returnsNull() {
        Assert.assertNull(commandLine.getOption("--unknown"));
    }

    @Test
    public void testAddValue_regularOption_addsValuesWithoutAddingOption() {
        Option opt = createOptionStub("--valueOpt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addValue(opt, "val1");
        commandLine.addValue(opt, "val2");

        Assert.assertFalse(commandLine.hasOption(opt));
        List values = commandLine.getUndefaultedValues(opt);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("val1", values.get(0));
        Assert.assertEquals("val2", values.get(1));
    }

    @Test
    public void testAddValue_argumentOption_addsOptionAndValues() {
        Argument arg = createArgumentStub("argOpt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addValue(arg, "argValue");

        Assert.assertTrue(commandLine.hasOption(arg));
        List values = commandLine.getUndefaultedValues(arg);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("argValue", values.get(0));
    }

    @Test
    public void testGetUndefaultedValues_whenNoValuesAdded_returnsEmptyList() {
        Option opt = createOptionStub("--opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List values = commandLine.getUndefaultedValues(opt);
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }

    @Test
    public void testAddSwitch_trueAndFalseValues_storesSwitch() {
        Option optTrue = createOptionStub("--enable", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Option optFalse = createOptionStub("--disable", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addSwitch(optTrue, true);
        commandLine.addSwitch(optFalse, false);

        Assert.assertTrue(commandLine.hasOption(optTrue));
        Assert.assertTrue(commandLine.hasOption(optFalse));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(optTrue, null));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(optFalse, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_duplicateSwitch_throwsIllegalStateException() {
        Option opt = createOptionStub("--duplicate", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testGetValues_priorityResolution_commandLineValuesFirst() {
        Option opt = createOptionStub("--test", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addValue(opt, "cliValue");
        commandLine.setDefaultValues(opt, Arrays.asList(new Object[]{"optDefault"}));

        List result = commandLine.getValues(opt, Arrays.asList(new Object[]{"methodDefault"}));
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("cliValue", result.get(0));
    }

    @Test
    public void testGetValues_priorityResolution_methodDefaultsSecond() {
        Option opt = createOptionStub("--test", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultValues(opt, Arrays.asList(new Object[]{"optDefault"}));

        List result = commandLine.getValues(opt, Arrays.asList(new Object[]{"methodDefault"}));
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("methodDefault", result.get(0));
    }

    @Test
    public void testGetValues_priorityResolution_optionDefaultsThird() {
        Option opt = createOptionStub("--test", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultValues(opt, Arrays.asList(new Object[]{"optDefault"}));

        List result = commandLine.getValues(opt, Collections.EMPTY_LIST);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("optDefault", result.get(0));

        List resultNull = commandLine.getValues(opt, null);
        Assert.assertEquals(1, resultNull.size());
        Assert.assertEquals("optDefault", resultNull.get(0));
    }

    @Test
    public void testGetValues_allEmptyOrNull_returnsEmptyList() {
        Option opt = createOptionStub("--test", Collections.EMPTY_SET, Collections.EMPTY_SET);

        List result = commandLine.getValues(opt, null);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testSetDefaultValues_removeDefaultsWhenNull_defaultsCleared() {
        Option opt = createOptionStub("--test", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultValues(opt, Arrays.asList(new Object[]{"optDefault"}));
        commandLine.setDefaultValues(opt, null);

        List result = commandLine.getValues(opt, null);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testGetSwitch_priorityResolution_switchPresent() {
        Option opt = createOptionStub("--sw", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addSwitch(opt, true);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        Boolean result = commandLine.getSwitch(opt, Boolean.FALSE);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSwitch_priorityResolution_methodDefaultSecond() {
        Option opt = createOptionStub("--sw", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);

        Boolean result = commandLine.getSwitch(opt, Boolean.TRUE);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSwitch_priorityResolution_optionDefaultThird() {
        Option opt = createOptionStub("--sw", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);

        Boolean result = commandLine.getSwitch(opt, null);
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSwitch_allNull_returnsNull() {
        Option opt = createOptionStub("--sw", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Boolean result = commandLine.getSwitch(opt, null);
        Assert.assertNull(result);
    }

    @Test
    public void testSetDefaultSwitch_removeDefaultWhenNull_defaultCleared() {
        Option opt = createOptionStub("--sw", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        commandLine.setDefaultSwitch(opt, null);

        Boolean result = commandLine.getSwitch(opt, null);
        Assert.assertNull(result);
    }

    @Test
    public void testPropertyMethods_withCustomOption_storedAndRetrieved() {
        Option opt = createOptionStub("-D", Collections.EMPTY_SET, Collections.EMPTY_SET);

        Assert.assertNull(commandLine.getProperty(opt, "foo", null));
        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "foo", "defaultVal"));
        Assert.assertTrue(commandLine.getProperties(opt).isEmpty());

        commandLine.addProperty(opt, "foo", "bar");
        commandLine.addProperty(opt, "key2", "value2");

        Assert.assertEquals("bar", commandLine.getProperty(opt, "foo", "defaultVal"));
        Assert.assertEquals("value2", commandLine.getProperty(opt, "key2", null));
        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "absent", "defaultVal"));

        Set properties = commandLine.getProperties(opt);
        Assert.assertEquals(2, properties.size());
        Assert.assertTrue(properties.contains("foo"));
        Assert.assertTrue(properties.contains("key2"));
    }

    @Test
    public void testPropertyMethods_withDefaultPropertyOption_storedAndRetrieved() {
        Assert.assertNull(commandLine.getProperty("myProp"));
        Assert.assertTrue(commandLine.getProperties().isEmpty());

        commandLine.addProperty("myProp", "myVal");

        Assert.assertEquals("myVal", commandLine.getProperty("myProp"));
        Set props = commandLine.getProperties();
        Assert.assertEquals(1, props.size());
        Assert.assertTrue(props.contains("myProp"));
    }

    @Test
    public void testLooksLikeOption_matchingAndNonMatchingPrefixes() {
        Assert.assertTrue(commandLine.looksLikeOption("-file"));
        Assert.assertTrue(commandLine.looksLikeOption("--file"));
        Assert.assertFalse(commandLine.looksLikeOption("file"));
        Assert.assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOption_emptyPrefixes_returnsFalse() {
        Option emptyPrefixRoot = createOptionStub("root", Collections.EMPTY_SET, Collections.EMPTY_SET);
        WriteableCommandLineImpl emptyPrefixCmd = new WriteableCommandLineImpl(emptyPrefixRoot, Collections.EMPTY_LIST);

        Assert.assertFalse(emptyPrefixCmd.looksLikeOption("-test"));
    }

    @Test
    public void testToString_multipleArgumentsWithAndWithoutSpaces() {
        String output = commandLine.toString();
        Assert.assertEquals("--file \"my file.txt\" verbose", output);
    }

    @Test
    public void testToString_emptyArguments_returnsEmptyString() {
        WriteableCommandLineImpl emptyCmd = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);
        Assert.assertEquals("", emptyCmd.toString());
    }

    @Test
    public void testGetOptions_returnsUnmodifiableList() {
        Option opt = createOptionStub("--opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);

        List options = commandLine.getOptions();
        Assert.assertEquals(1, options.size());
        try {
            options.add(createOptionStub("--another", Collections.EMPTY_SET, Collections.EMPTY_SET));
            Assert.fail("getOptions() should return an unmodifiable list");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers_returnsUnmodifiableSet() {
        Option opt = createOptionStub("--opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);

        Set triggers = commandLine.getOptionTriggers();
        Assert.assertEquals(1, triggers.size());
        try {
            triggers.add("--another");
            Assert.fail("getOptionTriggers() should return an unmodifiable set");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testGetNormalised_returnsUnmodifiableList() {
        List normalised = commandLine.getNormalised();
        Assert.assertEquals(3, normalised.size());
        try {
            normalised.add("extra");
            Assert.fail("getNormalised() should return an unmodifiable list");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }
}
