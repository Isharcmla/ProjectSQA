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

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("--");
        prefixes.add("-");
        rootOption = createOption("root", Collections.singleton("--root"), prefixes, null);
        arguments = new ArrayList();
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    private Option createOption(final String preferredName, final Set triggers, final Set prefixes, final Option parent) {
        return (Option) Proxy.newProxyInstance(
                Option.class.getClassLoader(),
                new Class<?>[]{Option.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("getPreferredName".equals(name)) {
                            return preferredName;
                        }
                        if ("getTriggers".equals(name)) {
                            return triggers != null ? triggers : Collections.emptySet();
                        }
                        if ("getPrefixes".equals(name)) {
                            return prefixes != null ? prefixes : Collections.emptySet();
                        }
                        if ("getParent".equals(name)) {
                            return parent;
                        }
                        if ("equals".equals(name)) {
                            return proxy == args[0];
                        }
                        if ("hashCode".equals(name)) {
                            return System.identityHashCode(proxy);
                        }
                        if ("toString".equals(name)) {
                            return "Option[" + preferredName + "]";
                        }
                        Class<?> returnType = method.getReturnType();
                        if (returnType.equals(boolean.class)) {
                            return false;
                        }
                        if (returnType.equals(int.class)) {
                            return 0;
                        }
                        return null;
                    }
                }
        );
    }

    private Argument createArgument(final String preferredName, final Set triggers, final Set prefixes, final Option parent) {
        return (Argument) Proxy.newProxyInstance(
                Argument.class.getClassLoader(),
                new Class<?>[]{Argument.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("getPreferredName".equals(name)) {
                            return preferredName;
                        }
                        if ("getTriggers".equals(name)) {
                            return triggers != null ? triggers : Collections.emptySet();
                        }
                        if ("getPrefixes".equals(name)) {
                            return prefixes != null ? prefixes : Collections.emptySet();
                        }
                        if ("getParent".equals(name)) {
                            return parent;
                        }
                        if ("equals".equals(name)) {
                            return proxy == args[0];
                        }
                        if ("hashCode".equals(name)) {
                            return System.identityHashCode(proxy);
                        }
                        if ("toString".equals(name)) {
                            return "Argument[" + preferredName + "]";
                        }
                        Class<?> returnType = method.getReturnType();
                        if (returnType.equals(boolean.class)) {
                            return false;
                        }
                        if (returnType.equals(int.class)) {
                            return 0;
                        }
                        return null;
                    }
                }
        );
    }

    @Test
    public void testConstructor_normal_initializesCorrectly() {
        List args = Arrays.asList("arg1", "arg2");
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, args);
        Assert.assertEquals(args, cmd.getNormalised());
        Assert.assertTrue(cmd.looksLikeOption("--root"));
    }

    @Test
    public void testAddOption_withTriggersAndParentHierarchy_optionsAndTriggersMapped() {
        Option grandParent = createOption("grandParent", Collections.singleton("--gp"), null, null);
        Option parent = createOption("parent", Collections.singleton("--p"), null, grandParent);
        Set childTriggers = new HashSet(Arrays.asList("--child", "-c"));
        Option child = createOption("child", childTriggers, null, parent);

        commandLine.addOption(child);

        Assert.assertTrue(commandLine.hasOption(child));
        Assert.assertTrue(commandLine.hasOption(parent));
        Assert.assertTrue(commandLine.hasOption(grandParent));

        Assert.assertEquals(child, commandLine.getOption("child"));
        Assert.assertEquals(child, commandLine.getOption("--child"));
        Assert.assertEquals(child, commandLine.getOption("-c"));

        Assert.assertNull(commandLine.getOption("unknown"));

        List optionsList = commandLine.getOptions();
        Assert.assertTrue(optionsList.contains(child));
        Assert.assertTrue(optionsList.contains(parent));
        Assert.assertTrue(optionsList.contains(grandParent));

        Set triggersSet = commandLine.getOptionTriggers();
        Assert.assertTrue(triggersSet.contains("child"));
        Assert.assertTrue(triggersSet.contains("--child"));
        Assert.assertTrue(triggersSet.contains("-c"));
    }

    @Test
    public void testAddOption_parentAlreadyAdded_doesNotDuplicateParent() {
        Option parent = createOption("parent", Collections.singleton("--p"), null, null);
        Option child = createOption("child", Collections.singleton("--c"), null, parent);

        commandLine.addOption(parent);
        commandLine.addOption(child);

        int parentCount = 0;
        for (Object opt : commandLine.getOptions()) {
            if (opt.equals(parent)) {
                parentCount++;
            }
        }
        Assert.assertEquals(1, parentCount);
    }

    @Test
    public void testHasOption_nonExistentOption_returnsFalse() {
        Option unadded = createOption("unadded", Collections.emptySet(), null, null);
        Assert.assertFalse(commandLine.hasOption(unadded));
    }

    @Test
    public void testAddValue_nonArgumentOption_addsValueWithoutAddingOption() {
        Option option = createOption("opt", Collections.singleton("--opt"), null, null);

        commandLine.addValue(option, "val1");
        commandLine.addValue(option, "val2");

        Assert.assertFalse(commandLine.hasOption(option));
        List values = commandLine.getUndefaultedValues(option);
        Assert.assertEquals(Arrays.asList("val1", "val2"), values);
    }

    @Test
    public void testAddValue_argumentOption_addsOptionAndValue() {
        Argument argument = createArgument("arg", Collections.singleton("arg"), null, null);

        commandLine.addValue(argument, "val1");

        Assert.assertTrue(commandLine.hasOption(argument));
        List values = commandLine.getUndefaultedValues(argument);
        Assert.assertEquals(Collections.singletonList("val1"), values);
    }

    @Test
    public void testGetUndefaultedValues_whenNoValuesAdded_returnsEmptyList() {
        Option option = createOption("opt", Collections.emptySet(), null, null);
        List values = commandLine.getUndefaultedValues(option);
        Assert.assertNotNull(values);
        Assert.assertTrue(values.isEmpty());
    }

    @Test
    public void testAddSwitch_trueAndFalse_recordsCorrectly() {
        Option optTrue = createOption("optTrue", Collections.singleton("--t"), null, null);
        Option optFalse = createOption("optFalse", Collections.singleton("--f"), null, null);

        commandLine.addSwitch(optTrue, true);
        commandLine.addSwitch(optFalse, false);

        Assert.assertTrue(commandLine.hasOption(optTrue));
        Assert.assertTrue(commandLine.hasOption(optFalse));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(optTrue, null));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(optFalse, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_duplicateSwitch_throwsIllegalStateException() {
        Option opt = createOption("opt", Collections.singleton("--opt"), null, null);
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false);
    }

    @Test
    public void testGetSwitch_fallbacks_returnsExpectedValues() {
        Option opt = createOption("opt", Collections.singleton("--opt"), null, null);

        Assert.assertNull(commandLine.getSwitch(opt, null));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.TRUE));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));

        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        commandLine.setDefaultSwitch(opt, null);
        Assert.assertNull(commandLine.getSwitch(opt, null));

        commandLine.setDefaultSwitch(opt, Boolean.FALSE);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testGetValues_noValuesAndNoDefaults_returnsEmptyList() {
        Option opt = createOption("opt", Collections.emptySet(), null, null);
        List result = commandLine.getValues(opt, null);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());

        result = commandLine.getValues(opt, Collections.emptyList());
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testGetValues_noValuesWithParamDefaults_returnsParamDefaults() {
        Option opt = createOption("opt", Collections.emptySet(), null, null);
        List defaults = Arrays.asList("d1", "d2");
        List result = commandLine.getValues(opt, defaults);
        Assert.assertEquals(defaults, result);
    }

    @Test
    public void testGetValues_noValuesWithOptionDefaults_returnsOptionDefaults() {
        Option opt = createOption("opt", Collections.emptySet(), null, null);
        List defaults = Arrays.asList("od1", "od2");
        commandLine.setDefaultValues(opt, defaults);

        List result = commandLine.getValues(opt, null);
        Assert.assertEquals(defaults, result);

        commandLine.setDefaultValues(opt, null);
        Assert.assertTrue(commandLine.getValues(opt, null).isEmpty());
    }

    @Test
    public void testGetValues_existingValuesWithFewerDefaults_returnsOriginalValues() {
        Option opt = createOption("opt", Collections.emptySet(), null, null);
        commandLine.addValue(opt, "v1");
        commandLine.addValue(opt, "v2");
        commandLine.addValue(opt, "v3");

        List defaults = Collections.singletonList("d1");
        List result = commandLine.getValues(opt, defaults);
        Assert.assertEquals(Arrays.asList("v1", "v2", "v3"), result);
    }

    @Test
    public void testGetValues_existingValuesWithMoreDefaults_augmentsList() {
        Option opt = createOption("opt", Collections.emptySet(), null, null);
        commandLine.addValue(opt, "v1");

        List defaults = Arrays.asList("d1", "d2", "d3");
        List result = commandLine.getValues(opt, defaults);
        Assert.assertEquals(Arrays.asList("v1", "d2", "d3"), result);
    }

    @Test
    public void testGetValues_existingValuesWithEmptyDefaults_returnsOriginalValues() {
        Option opt = createOption("opt", Collections.emptySet(), null, null);
        commandLine.addValue(opt, "v1");

        List result = commandLine.getValues(opt, Collections.emptyList());
        Assert.assertEquals(Collections.singletonList("v1"), result);
    }

    @Test
    public void testPropertyMethods_withCustomOption() {
        Option opt = createOption("propOpt", Collections.emptySet(), null, null);
        Option otherOpt = createOption("otherOpt", Collections.emptySet(), null, null);

        Assert.assertNull(commandLine.getProperty(opt, "missing", null));
        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "missing", "defaultVal"));
        Assert.assertTrue(commandLine.getProperties(opt).isEmpty());

        commandLine.addProperty(opt, "key1", "val1");
        commandLine.addProperty(opt, "key2", "val2");

        Assert.assertEquals("val1", commandLine.getProperty(opt, "key1", "defaultVal"));
        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "nonExistent", "defaultVal"));
        Assert.assertEquals("defaultVal", commandLine.getProperty(otherOpt, "key1", "defaultVal"));

        Set propertiesSet = commandLine.getProperties(opt);
        Assert.assertEquals(2, propertiesSet.size());
        Assert.assertTrue(propertiesSet.contains("key1"));
        Assert.assertTrue(propertiesSet.contains("key2"));
        Assert.assertTrue(commandLine.getProperties(otherOpt).isEmpty());
    }

    @Test
    public void testPropertyMethods_withDefaultPropertyOption() {
        Assert.assertNull(commandLine.getProperty("missing"));
        Assert.assertTrue(commandLine.getProperties().isEmpty());

        commandLine.addProperty("propKey", "propValue");

        Assert.assertEquals("propValue", commandLine.getProperty("propKey"));
        Assert.assertNull(commandLine.getProperty("unknownKey"));

        Set props = commandLine.getProperties();
        Assert.assertTrue(props.contains("propKey"));
    }

    @Test
    public void testLooksLikeOption_checksPrefixesCorrectly() {
        Assert.assertTrue(commandLine.looksLikeOption("--help"));
        Assert.assertTrue(commandLine.looksLikeOption("-h"));
        Assert.assertFalse(commandLine.looksLikeOption("help"));
        Assert.assertFalse(commandLine.looksLikeOption("+h"));
        Assert.assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testToString_emptyArguments_returnsEmptyString() {
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, Collections.emptyList());
        Assert.assertEquals("", cmd.toString());
    }

    @Test
    public void testToString_singleAndMultipleArguments_formatsWithQuotesWhenNecessary() {
        List args = Arrays.asList("--opt", "simple", "with space", "--another=\"quoted value\"");
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, args);

        String expected = "--opt simple \"with space\" \"--another=\\\"quoted value\\\"\"";
        Assert.assertEquals(expected, cmd.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_isUnmodifiableList() {
        commandLine.getOptions().add(rootOption);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionTriggers_isUnmodifiableSet() {
        commandLine.getOptionTriggers().add("trigger");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetNormalised_isUnmodifiableList() {
        commandLine.getNormalised().add("newArg");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetProperties_isUnmodifiableSet() {
        Option opt = new PropertyOption();
        commandLine.addProperty(opt, "k", "v");
        commandLine.getProperties(opt).add("anotherKey");
    }
}
