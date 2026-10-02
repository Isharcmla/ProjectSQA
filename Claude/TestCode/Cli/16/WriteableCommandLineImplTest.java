package org.apache.commons.cli2.commandline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private List normalisedArgs;
    private WriteableCommandLineImpl cli;

    @Before
    public void setUp() {
        Option child = new DefaultOptionBuilder().withShortName("h").withLongName("help").create();
        rootOption = new GroupBuilder().withOption(child).create();
        normalisedArgs = new ArrayList();
        normalisedArgs.add("--help");
        cli = new WriteableCommandLineImpl(rootOption, normalisedArgs);
    }

    @Test
    public void testConstructor_validRootOption_success() {
        assertNotNull(cli);
        assertNotNull(cli.getNormalised());
        assertEquals(1, cli.getNormalised().size());
    }

    @Test
    public void testAddOption_addsOptionAndTriggers() {
        Option option = new DefaultOptionBuilder().withShortName("x").withLongName("xxx").create();
        cli.addOption(option);
        assertTrue(cli.hasOption(option));
        assertEquals(option, cli.getOption(option.getPreferredName()));
        assertTrue(cli.getOptions().contains(option));
    }

    @Test
    public void testAddValue_argumentOption_addsValueAndOption() {
        Argument arg = new ArgumentBuilder().withName("arg").withMinimum(0).withMaximum(5).create();
        cli.addValue(arg, "val1");
        assertTrue(cli.hasOption(arg));
        List values = cli.getUndefaultedValues(arg);
        assertEquals(1, values.size());
        assertEquals("val1", values.get(0));
    }

    @Test
    public void testAddValue_nonArgumentOption_addsValueOnly() {
        Option option = new DefaultOptionBuilder().withShortName("y").withLongName("yyy").create();
        cli.addValue(option, "someValue");
        assertFalse(cli.hasOption(option));
        List values = cli.getUndefaultedValues(option);
        assertEquals(1, values.size());
        assertEquals("someValue", values.get(0));
    }

    @Test
    public void testAddSwitch_newOption_success() {
        Option option = new DefaultOptionBuilder().withShortName("s").withLongName("sss").create();
        cli.addSwitch(option, true);
        assertEquals(Boolean.TRUE, cli.getSwitch(option, null));
        assertTrue(cli.hasOption(option));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_duplicateOption_throwsException() {
        Option option = new DefaultOptionBuilder().withShortName("d").withLongName("ddd").create();
        cli.addSwitch(option, true);
        cli.addSwitch(option, false);
    }

    @Test
    public void testHasOption_optionPresent_true() {
        Option option = new DefaultOptionBuilder().withShortName("p").withLongName("ppp").create();
        cli.addOption(option);
        assertTrue(cli.hasOption(option));
    }

    @Test
    public void testHasOption_optionAbsent_false() {
        Option option = new DefaultOptionBuilder().withShortName("q").withLongName("qqq").create();
        assertFalse(cli.hasOption(option));
    }

    @Test
    public void testGetOption_existingTrigger_returnsOption() {
        Option option = new DefaultOptionBuilder().withShortName("g").withLongName("ggg").create();
        cli.addOption(option);
        assertEquals(option, cli.getOption(option.getPreferredName()));
    }

    @Test
    public void testGetOption_nonExistingTrigger_returnsNull() {
        assertNull(cli.getOption("--nonexistent"));
    }

    @Test
    public void testGetValues_withDefaultValuesParam_returnsCombined() {
        Argument arg = new ArgumentBuilder().withName("arg2").withMinimum(0).withMaximum(5).create();
        cli.addValue(arg, "a");
        cli.addValue(arg, "b");

        List defaultsParam = new ArrayList();
        defaultsParam.add("d1");
        defaultsParam.add("d2");
        defaultsParam.add("d3");

        List result = cli.getValues(arg, defaultsParam);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
        assertEquals("d3", result.get(2));
    }

    @Test
    public void testGetValues_noValuesNoDefaults_returnsEmptyList() {
        Argument arg = new ArgumentBuilder().withName("arg3").withMinimum(0).withMaximum(5).create();
        List result = cli.getValues(arg, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetValues_defaultsLargerThanValues_appendsExtra() {
        Argument arg = new ArgumentBuilder().withName("arg4").withMinimum(0).withMaximum(5).create();
        List internalDefaults = new ArrayList();
        internalDefaults.add("x");
        internalDefaults.add("y");
        internalDefaults.add("z");
        cli.setDefaultValues(arg, internalDefaults);

        cli.addValue(arg, "a");

        List result = cli.getValues(arg, null);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("y", result.get(1));
        assertEquals("z", result.get(2));
    }

    @Test
    public void testGetUndefaultedValues_withValues_returnsValues() {
        Argument arg = new ArgumentBuilder().withName("arg5").withMinimum(0).withMaximum(5).create();
        cli.addValue(arg, "onlyValue");
        List result = cli.getUndefaultedValues(arg);
        assertEquals(1, result.size());
        assertEquals("onlyValue", result.get(0));
    }

    @Test
    public void testGetUndefaultedValues_noValues_returnsEmptyList() {
        Argument arg = new ArgumentBuilder().withName("arg6").withMinimum(0).withMaximum(5).create();
        List result = cli.getUndefaultedValues(arg);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetSwitch_setValue_returnsSetValue() {
        Option option = new DefaultOptionBuilder().withShortName("z").withLongName("zzz").create();
        cli.addSwitch(option, false);
        assertEquals(Boolean.FALSE, cli.getSwitch(option, Boolean.TRUE));
    }

    @Test
    public void testGetSwitch_defaultValueParam_returnsDefault() {
        Option option = new DefaultOptionBuilder().withShortName("w").withLongName("www").create();
        assertEquals(Boolean.TRUE, cli.getSwitch(option, Boolean.TRUE));
    }

    @Test
    public void testGetSwitch_defaultSwitchMap_returnsDefaultSwitch() {
        Option option = new DefaultOptionBuilder().withShortName("v").withLongName("vvv").create();
        cli.setDefaultSwitch(option, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cli.getSwitch(option, null));
    }

    @Test
    public void testGetSwitch_allNull_returnsNull() {
        Option option = new DefaultOptionBuilder().withShortName("u").withLongName("uuu").create();
        assertNull(cli.getSwitch(option, null));
    }

    @Test
    public void testGetProperty_singleArg_returnsValue() {
        cli.addProperty("key1", "value1");
        assertEquals("value1", cli.getProperty("key1"));
    }

    @Test
    public void testAddProperty_optionSpecific_setsProperty() {
        Option option = new DefaultOptionBuilder().withShortName("o").withLongName("ooo").create();
        cli.addProperty(option, "propKey", "propValue");
        assertEquals("propValue", cli.getProperty(option, "propKey", "defaultVal"));
    }

    @Test
    public void testGetProperty_withOptionAndDefault_returnsDefaultWhenNotSet() {
        Option option = new DefaultOptionBuilder().withShortName("n").withLongName("nnn").create();
        assertEquals("defaultValue", cli.getProperty(option, "unsetKey", "defaultValue"));
    }

    @Test
    public void testGetProperties_option_returnsKeys() {
        Option option = new DefaultOptionBuilder().withShortName("m").withLongName("mmm").create();
        cli.addProperty(option, "k1", "v1");
        cli.addProperty(option, "k2", "v2");
        Set keys = cli.getProperties(option);
        assertTrue(keys.contains("k1"));
        assertTrue(keys.contains("k2"));
        assertEquals(2, keys.size());
    }

    @Test
    public void testGetProperties_noArgs_delegatesToPropertyOption() {
        cli.addProperty("globalKey", "globalValue");
        Set keys = cli.getProperties();
        assertTrue(keys.contains("globalKey"));
    }

    @Test
    public void testLooksLikeOption_matchingPrefix_true() {
        assertTrue(cli.looksLikeOption("--help"));
    }

    @Test
    public void testLooksLikeOption_nonMatchingPrefix_false() {
        assertFalse(cli.looksLikeOption("help"));
    }

    @Test
    public void testToString_withSpaceInArgument_quotesIt() {
        List args = new ArrayList();
        args.add("--help");
        args.add("some value");
        WriteableCommandLineImpl localCli = new WriteableCommandLineImpl(rootOption, args);
        String result = localCli.toString();
        assertTrue(result.contains("\"some value\""));
        assertTrue(result.startsWith("--help"));
    }

    @Test
    public void testToString_noSpace_noQuotes() {
        List args = new ArrayList();
        args.add("--help");
        args.add("value");
        WriteableCommandLineImpl localCli = new WriteableCommandLineImpl(rootOption, args);
        String result = localCli.toString();
        assertFalse(result.contains("\""));
        assertEquals("--help value", result);
    }

    @Test
    public void testToString_emptyList_returnsEmptyString() {
        List args = new ArrayList();
        WriteableCommandLineImpl localCli = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("", localCli.toString());
    }

    @Test
    public void testGetOptions_unmodifiable_throwsOnModify() {
        Option option = new DefaultOptionBuilder().withShortName("t").withLongName("ttt").create();
        cli.addOption(option);
        List options = cli.getOptions();
        assertTrue(options.contains(option));
        try {
            options.add(option);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers_containsAddedTriggers() {
        Option option = new DefaultOptionBuilder().withShortName("r").withLongName("rrr").create();
        cli.addOption(option);
        Set triggers = cli.getOptionTriggers();
        assertTrue(triggers.contains(option.getPreferredName()));
    }

    @Test
    public void testSetDefaultValues_nullRemoves() {
        Argument arg = new ArgumentBuilder().withName("arg7").withMinimum(0).withMaximum(5).create();
        List defaults = new ArrayList();
        defaults.add("d1");
        cli.setDefaultValues(arg, defaults);
        cli.setDefaultValues(arg, null);
        List result = cli.getValues(arg, null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSetDefaultValues_setsValue() {
        Argument arg = new ArgumentBuilder().withName("arg8").withMinimum(0).withMaximum(5).create();
        List defaults = new ArrayList();
        defaults.add("dv1");
        cli.setDefaultValues(arg, defaults);
        List result = cli.getValues(arg, null);
        assertEquals(1, result.size());
        assertEquals("dv1", result.get(0));
    }

    @Test
    public void testSetDefaultSwitch_nullRemoves() {
        Option option = new DefaultOptionBuilder().withShortName("e").withLongName("eee").create();
        cli.setDefaultSwitch(option, Boolean.TRUE);
        cli.setDefaultSwitch(option, null);
        assertNull(cli.getSwitch(option, null));
    }

    @Test
    public void testSetDefaultSwitch_setsValue() {
        Option option = new DefaultOptionBuilder().withShortName("f").withLongName("fff").create();
        cli.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.FALSE, cli.getSwitch(option, null));
    }

    @Test
    public void testGetNormalised_unmodifiable_returnsSameContent() {
        List normalised = cli.getNormalised();
        assertEquals(1, normalised.size());
        assertEquals("--help", normalised.get(0));
        try {
            normalised.add("extra");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}
