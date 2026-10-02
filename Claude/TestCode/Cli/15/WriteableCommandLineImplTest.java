package org.apache.commons.cli2.commandline;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;
import org.apache.commons.cli2.option.DefaultOption;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl cmdLine;
    private Option rootOption;
    private DefaultOption optionA;
    private DefaultOption optionB;
    private Argument argument;
    private List arguments;

    @Before
    public void setUp() throws Exception {
        argument = new ArgumentBuilder()
            .withName("arg")
            .withMinimum(0)
            .withMaximum(1)
            .create();

        optionA = new DefaultOptionBuilder()
            .withShortPrefix("-")
            .withLongPrefix("--")
            .withPreferredName("-a")
            .withDescription("option a")
            .create();

        optionB = new DefaultOptionBuilder()
            .withShortPrefix("-")
            .withLongPrefix("--")
            .withPreferredName("-b")
            .withDescription("option b")
            .withArgument(argument)
            .create();

        rootOption = new GroupBuilder()
            .withName("root")
            .withOption(optionA)
            .withOption(optionB)
            .create();

        arguments = new ArrayList();
        arguments.add("-a");
        arguments.add("hello world");

        cmdLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    @Test
    public void testConstructor_and_getNormalised_returnsSameContent() {
        List normalised = cmdLine.getNormalised();
        assertEquals(2, normalised.size());
        assertEquals("-a", normalised.get(0));
        assertEquals("hello world", normalised.get(1));
    }

    @Test
    public void testGetNormalised_isUnmodifiable_throwsException() {
        List normalised = cmdLine.getNormalised();
        try {
            normalised.add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAddOption_and_hasOption_returnsTrue() {
        cmdLine.addOption(optionA);
        assertTrue(cmdLine.hasOption(optionA));
    }

    @Test
    public void testHasOption_notAdded_returnsFalse() {
        assertFalse(cmdLine.hasOption(optionA));
    }

    @Test
    public void testGetOption_afterAdd_returnsOption() {
        cmdLine.addOption(optionA);
        Option found = cmdLine.getOption("-a");
        assertEquals(optionA, found);
    }

    @Test
    public void testGetOption_unknownTrigger_returnsNull() {
        Option found = cmdLine.getOption("--unknown");
        assertNull(found);
    }

    @Test
    public void testAddValue_withArgumentOption_addsOptionAutomatically() {
        cmdLine.addValue(argument, "value1");
        assertTrue(cmdLine.hasOption(argument));
        List values = cmdLine.getUndefaultedValues(argument);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testAddValue_withNonArgumentOption_doesNotAddAutomatically() {
        cmdLine.addValue(optionA, "val");
        assertFalse(cmdLine.hasOption(optionA));
        List values = cmdLine.getUndefaultedValues(optionA);
        assertEquals(1, values.size());
        assertEquals("val", values.get(0));
    }

    @Test
    public void testAddSwitch_normal_setsSwitchValue() {
        cmdLine.addSwitch(optionA, true);
        assertTrue(cmdLine.hasOption(optionA));
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(optionA, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_duplicate_throwsException() {
        cmdLine.addSwitch(optionA, true);
        cmdLine.addSwitch(optionA, false);
    }

    @Test
    public void testGetValues_noValues_returnsEmptyList() {
        List values = cmdLine.getValues(optionA, null);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testGetValues_withDirectValues_returnsThoseValues() {
        cmdLine.addValue(optionA, "v1");
        cmdLine.addValue(optionA, "v2");
        List values = cmdLine.getValues(optionA, null);
        assertEquals(2, values.size());
        assertEquals("v1", values.get(0));
        assertEquals("v2", values.get(1));
    }

    @Test
    public void testGetValues_withMethodDefaultValues_usedWhenNoDirectValues() {
        List defaults = Arrays.asList(new Object[] {"d1", "d2"});
        List values = cmdLine.getValues(optionA, defaults);
        assertEquals(2, values.size());
        assertEquals("d1", values.get(0));
    }

    @Test
    public void testGetValues_withOptionDefaultValues_viaSetDefaultValues() {
        List defaults = Arrays.asList(new Object[] {"od1"});
        cmdLine.setDefaultValues(optionA, defaults);
        List values = cmdLine.getValues(optionA, null);
        assertEquals(1, values.size());
        assertEquals("od1", values.get(0));
    }

    @Test
    public void testGetUndefaultedValues_noValues_returnsEmptyList() {
        List values = cmdLine.getUndefaultedValues(optionA);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testGetUndefaultedValues_withValues_returnsValues() {
        cmdLine.addValue(optionA, "val1");
        List values = cmdLine.getUndefaultedValues(optionA);
        assertEquals(1, values.size());
        assertEquals("val1", values.get(0));
    }

    @Test
    public void testGetSwitch_directSwitchSet_returnsThatValue() {
        cmdLine.addSwitch(optionA, true);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(optionA, Boolean.FALSE));
    }

    @Test
    public void testGetSwitch_noDirectSwitch_usesMethodDefault() {
        Boolean result = cmdLine.getSwitch(optionA, Boolean.FALSE);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGetSwitch_noDirectOrMethodDefault_usesOptionDefaultSwitch() {
        cmdLine.setDefaultSwitch(optionA, Boolean.TRUE);
        Boolean result = cmdLine.getSwitch(optionA, null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSwitch_noneSet_returnsNull() {
        Boolean result = cmdLine.getSwitch(optionA, null);
        assertNull(result);
    }

    @Test
    public void testAddProperty_withOption_and_getProperty_returnsValue() {
        cmdLine.addProperty(optionA, "key1", "value1");
        String value = cmdLine.getProperty(optionA, "key1", "defaultVal");
        assertEquals("value1", value);
    }

    @Test
    public void testGetProperty_withOption_noPropertiesSet_returnsDefault() {
        String value = cmdLine.getProperty(optionA, "unknownKey", "defaultVal");
        assertEquals("defaultVal", value);
    }

    @Test
    public void testGetProperty_withOption_unknownKey_returnsDefault() {
        cmdLine.addProperty(optionA, "key1", "value1");
        String value = cmdLine.getProperty(optionA, "otherKey", "defaultVal");
        assertEquals("defaultVal", value);
    }

    @Test
    public void testGetProperties_withOption_noPropertiesSet_returnsEmptySet() {
        Set props = cmdLine.getProperties(optionA);
        assertTrue(props.isEmpty());
    }

    @Test
    public void testGetProperties_withOption_afterAddProperty_containsKey() {
        cmdLine.addProperty(optionA, "key1", "value1");
        Set props = cmdLine.getProperties(optionA);
        assertTrue(props.contains("key1"));
    }

    @Test
    public void testAddProperty_stringOverload_and_getProperty_stringOverload() {
        cmdLine.addProperty("sysKey", "sysValue");
        String value = cmdLine.getProperty("sysKey");
        assertEquals("sysValue", value);
    }

    @Test
    public void testGetProperty_stringOverload_unknownKey_returnsNull() {
        String value = cmdLine.getProperty("notSetKey");
        assertNull(value);
    }

    @Test
    public void testGetProperties_noArgOverload_afterAddProperty_containsKey() {
        cmdLine.addProperty("propKey", "propValue");
        Set props = cmdLine.getProperties();
        assertTrue(props.contains("propKey"));
    }

    @Test
    public void testLooksLikeOption_withMatchingPrefix_returnsTrue() {
        assertTrue(cmdLine.looksLikeOption("-a"));
    }

    @Test
    public void testLooksLikeOption_withNonMatchingPrefix_returnsFalse() {
        assertFalse(cmdLine.looksLikeOption("xyz"));
    }

    @Test
    public void testLooksLikeOption_emptyString_returnsFalse() {
        assertFalse(cmdLine.looksLikeOption(""));
    }

    @Test
    public void testToString_withSpaceInArgument_quotesIt() {
        String result = cmdLine.toString();
        assertTrue(result.contains("\"hello world\""));
        assertTrue(result.startsWith("-a"));
    }

    @Test
    public void testToString_emptyNormalisedList_returnsEmptyString() {
        WriteableCommandLineImpl emptyCmdLine =
            new WriteableCommandLineImpl(rootOption, new ArrayList());
        assertEquals("", emptyCmdLine.toString());
    }

    @Test
    public void testGetOptions_afterAdd_containsOption() {
        cmdLine.addOption(optionA);
        List opts = cmdLine.getOptions();
        assertTrue(opts.contains(optionA));
    }

    @Test
    public void testGetOptions_isUnmodifiable_throwsException() {
        cmdLine.addOption(optionA);
        List opts = cmdLine.getOptions();
        try {
            opts.add(optionB);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers_afterAdd_containsTrigger() {
        cmdLine.addOption(optionA);
        Set triggers = cmdLine.getOptionTriggers();
        assertTrue(triggers.contains("-a"));
    }

    @Test
    public void testGetOptionTriggers_isUnmodifiable_throwsException() {
        cmdLine.addOption(optionA);
        Set triggers = cmdLine.getOptionTriggers();
        try {
            triggers.add("-z");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetDefaultValues_withList_setsDefault() {
        List defaults = Arrays.asList(new Object[] {"d1"});
        cmdLine.setDefaultValues(optionA, defaults);
        List values = cmdLine.getValues(optionA, null);
        assertEquals(1, values.size());
        assertEquals("d1", values.get(0));
    }

    @Test
    public void testSetDefaultValues_withNull_removesDefault() {
        List defaults = Arrays.asList(new Object[] {"d1"});
        cmdLine.setDefaultValues(optionA, defaults);
        cmdLine.setDefaultValues(optionA, null);
        List values = cmdLine.getValues(optionA, null);
        assertTrue(values.isEmpty());
    }

    @Test
    public void testSetDefaultSwitch_withBoolean_setsDefault() {
        cmdLine.setDefaultSwitch(optionA, Boolean.TRUE);
        Boolean result = cmdLine.getSwitch(optionA, null);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testSetDefaultSwitch_withNull_removesDefault() {
        cmdLine.setDefaultSwitch(optionA, Boolean.TRUE);
        cmdLine.setDefaultSwitch(optionA, null);
        Boolean result = cmdLine.getSwitch(optionA, null);
        assertNull(result);
    }
}
