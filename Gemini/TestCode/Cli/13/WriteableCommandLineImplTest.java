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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private List argumentList;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        rootOption = createOption("root", Collections.singleton("root"), prefixes);
        argumentList = new ArrayList();
        argumentList.add("--opt");
        argumentList.add("value with spaces");
        argumentList.add("simpleValue");
        commandLine = new WriteableCommandLineImpl(rootOption, argumentList);
    }

    private Option createOption(final String preferredName, final Set triggers, final Set prefixes) {
        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
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
                        return Boolean.valueOf(proxy == args[0]);
                    }
                    if ("hashCode".equals(name)) {
                        return Integer.valueOf(System.identityHashCode(proxy));
                    }
                    if ("toString".equals(name)) {
                        return "Option[" + preferredName + "]";
                    }
                    return null;
                }
            }
        );
    }

    private Argument createArgument(final String preferredName, final Set triggers, final Set prefixes) {
        return (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
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
                        return Boolean.valueOf(proxy == args[0]);
                    }
                    if ("hashCode".equals(name)) {
                        return Integer.valueOf(System.identityHashCode(proxy));
                    }
                    if ("toString".equals(name)) {
                        return "Argument[" + preferredName + "]";
                    }
                    return null;
                }
            }
        );
    }

    @Test
    public void testConstructor_validInputs_setsNormalisedAndPrefixes() {
        Assert.assertEquals(argumentList, commandLine.getNormalised());
        Assert.assertTrue(commandLine.looksLikeOption("-a"));
        Assert.assertTrue(commandLine.looksLikeOption("--option"));
        Assert.assertFalse(commandLine.looksLikeOption("nonOption"));
    }

    @Test
    public void testAddOption_singleOption_registersPreferredNameAndTriggers() {
        Set triggers = new HashSet();
        triggers.add("-f");
        triggers.add("--file");
        Option fileOption = createOption("--file", triggers, Collections.singleton("-"));

        commandLine.addOption(fileOption);

        Assert.assertTrue(commandLine.hasOption(fileOption));
        Assert.assertEquals(fileOption, commandLine.getOption("-f"));
        Assert.assertEquals(fileOption, commandLine.getOption("--file"));
        Assert.assertTrue(commandLine.getOptions().contains(fileOption));
        Assert.assertTrue(commandLine.getOptionTriggers().contains("-f"));
        Assert.assertTrue(commandLine.getOptionTriggers().contains("--file"));
    }

    @Test
    public void testHasOption_notAdded_returnsFalse() {
        Option opt = createOption("test", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Assert.assertFalse(commandLine.hasOption(opt));
    }

    @Test
    public void testGetOption_unknownTrigger_returnsNull() {
        Assert.assertNull(commandLine.getOption("unknown"));
    }

    @Test
    public void testAddValue_regularOption_storesValuesWithoutAutoAddingOption() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addValue(opt, "val1");
        commandLine.addValue(opt, "val2");

        Assert.assertFalse(commandLine.hasOption(opt));

        List expected = Arrays.asList(new Object[] { "val1", "val2" });
        Assert.assertEquals(expected, commandLine.getValues(opt, null));
    }

    @Test
    public void testAddValue_argumentOption_automaticallyAddsOption() {
        Argument arg = createArgument("arg", Collections.singleton("arg"), Collections.EMPTY_SET);
        commandLine.addValue(arg, "argVal");

        Assert.assertTrue(commandLine.hasOption(arg));
        Assert.assertEquals(Collections.singletonList("argVal"), commandLine.getValues(arg, null));
    }

    @Test
    public void testGetValues_noValuesPresent_usesMethodDefaults() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List methodDefaults = Arrays.asList(new Object[] { "default1", "default2" });

        List values = commandLine.getValues(opt, methodDefaults);
        Assert.assertEquals(methodDefaults, values);
    }

    @Test
    public void testGetValues_emptyMethodDefaults_usesOptionDefaultValues() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List optDefaults = Collections.singletonList("optDefault");
        commandLine.setDefaultValues(opt, optDefaults);

        List values = commandLine.getValues(opt, Collections.EMPTY_LIST);
        Assert.assertEquals(optDefaults, values);
    }

    @Test
    public void testGetValues_noDefaultsAtAll_returnsEmptyList() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List values = commandLine.getValues(opt, null);
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }

    @Test
    public void testSetDefaultValues_null_removesDefaultValues() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultValues(opt, Collections.singletonList("def"));
        Assert.assertEquals(Collections.singletonList("def"), commandLine.getValues(opt, null));

        commandLine.setDefaultValues(opt, null);
        Assert.assertEquals(Collections.EMPTY_LIST, commandLine.getValues(opt, null));
    }

    @Test
    public void testAddSwitch_validValues_storesBooleans() {
        Option optTrue = createOption("trueOpt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Option optFalse = createOption("falseOpt", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addSwitch(optTrue, true);
        commandLine.addSwitch(optFalse, false);

        Assert.assertTrue(commandLine.hasOption(optTrue));
        Assert.assertTrue(commandLine.hasOption(optFalse));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(optTrue, null));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(optFalse, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_duplicateSwitch_throwsIllegalStateException() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testGetSwitch_notSet_usesMethodDefault() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.TRUE));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));
    }

    @Test
    public void testGetSwitch_methodDefaultNull_usesDefaultSwitches() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitch_noDefaults_returnsNull() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Assert.assertNull(commandLine.getSwitch(opt, null));
    }

    @Test
    public void testSetDefaultSwitch_null_removesDefaultSwitch() {
        Option opt = createOption("opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        commandLine.setDefaultSwitch(opt, null);
        Assert.assertNull(commandLine.getSwitch(opt, null));
    }

    @Test
    public void testAddProperty_and_getProperty_and_getProperties() {
        commandLine.addProperty("key1", "value1");
        commandLine.addProperty("key2", "value2");

        Assert.assertEquals("value1", commandLine.getProperty("key1", "default"));
        Assert.assertEquals("value2", commandLine.getProperty("key2", "default"));
        Assert.assertEquals("defaultVal", commandLine.getProperty("nonExistent", "defaultVal"));

        Set keys = commandLine.getProperties();
        Assert.assertEquals(2, keys.size());
        Assert.assertTrue(keys.contains("key1"));
        Assert.assertTrue(keys.contains("key2"));
    }

    @Test
    public void testLooksLikeOption_noPrefixes_returnsFalse() {
        Option rootWithoutPrefixes = createOption("root", Collections.EMPTY_SET, Collections.EMPTY_SET);
        WriteableCommandLineImpl cli = new WriteableCommandLineImpl(rootWithoutPrefixes, Collections.EMPTY_LIST);

        Assert.assertFalse(cli.looksLikeOption("-opt"));
        Assert.assertFalse(cli.looksLikeOption(""));
    }

    @Test
    public void testToString_formatsArgumentsCorrectly() {
        Assert.assertEquals("--opt \"value with spaces\" simpleValue", commandLine.toString());
    }

    @Test
    public void testToString_emptyArguments_returnsEmptyString() {
        WriteableCommandLineImpl emptyCli = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);
        Assert.assertEquals("", emptyCli.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_isUnmodifiable() {
        commandLine.getOptions().add(rootOption);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionTriggers_isUnmodifiable() {
        commandLine.getOptionTriggers().add("trigger");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetProperties_isUnmodifiable() {
        commandLine.getProperties().add("key");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetNormalised_isUnmodifiable() {
        commandLine.getNormalised().add("newArg");
    }
}
