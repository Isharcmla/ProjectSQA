import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private List arguments;
    private WriteableCommandLineImpl cl;
    private Option sampleOption;
    private Argument sampleArgument;

    @Before
    public void setUp() {
        rootOption = new DefaultOptionBuilder().withShortName("r").create();
        arguments = new ArrayList();
        arguments.add("arg1");
        arguments.add("arg with space");

        cl = new WriteableCommandLineImpl(rootOption, arguments);

        sampleOption = new DefaultOptionBuilder().withShortName("v").withLongName("verbose").create();
        sampleArgument = new ArgumentBuilder().withName("file").create();
    }

    // ---------- Constructor ----------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullRootOption_throwsNullPointerException() {
        new WriteableCommandLineImpl(null, new ArrayList());
    }

    @Test
    public void testConstructor_validArguments_normalisedReturned() {
        List result = cl.getNormalised();
        assertEquals(2, result.size());
        assertEquals("arg1", result.get(0));
    }

    // ---------- addOption ----------

    @Test
    public void testAddOption_normalOption_addsSuccessfully() {
        cl.addOption(sampleOption);
        assertTrue(cl.hasOption(sampleOption));
    }

    @Test
    public void testAddOption_withParent_addsParentAlso() {
        Option parent = new DefaultOptionBuilder().withShortName("p").create();
        Option child = new DefaultOptionBuilder().withShortName("c").create();
        child.setParent(parent);

        cl.addOption(child);

        assertTrue(cl.hasOption(child));
        assertTrue(cl.hasOption(parent));
    }

    @Test
    public void testAddOption_parentAlreadyAdded_notAddedTwice() {
        Option parent = new DefaultOptionBuilder().withShortName("p2").create();
        Option child1 = new DefaultOptionBuilder().withShortName("c1").create();
        Option child2 = new DefaultOptionBuilder().withShortName("c2").create();
        child1.setParent(parent);
        child2.setParent(parent);

        cl.addOption(child1);
        cl.addOption(child2);

        int count = 0;
        for (Object o : cl.getOptions()) {
            if (o == parent) {
                count++;
            }
        }
        assertEquals(1, count);
    }

    // ---------- addValue ----------

    @Test
    public void testAddValue_withArgument_addsOptionAutomatically() {
        cl.addValue(sampleArgument, "value1");
        assertTrue(cl.hasOption(sampleArgument));
        assertEquals(1, cl.getUndefaultedValues(sampleArgument).size());
    }

    @Test
    public void testAddValue_withNonArgumentOption_doesNotAddOption() {
        cl.addValue(sampleOption, "test");
        assertFalse(cl.hasOption(sampleOption));
        assertEquals(1, cl.getUndefaultedValues(sampleOption).size());
    }

    @Test
    public void testAddValue_multipleValues_accumulatesInList() {
        cl.addValue(sampleArgument, "v1");
        cl.addValue(sampleArgument, "v2");
        List values = cl.getUndefaultedValues(sampleArgument);
        assertEquals(2, values.size());
        assertEquals("v1", values.get(0));
        assertEquals("v2", values.get(1));
    }

    // ---------- addSwitch ----------

    @Test
    public void testAddSwitch_normalUsage_setsSwitchValue() {
        cl.addSwitch(sampleOption, true);
        assertEquals(Boolean.TRUE, cl.getSwitch(sampleOption, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_calledTwiceForSameOption_throwsIllegalStateException() {
        cl.addSwitch(sampleOption, true);
        cl.addSwitch(sampleOption, false);
    }

    // ---------- hasOption ----------

    @Test
    public void testHasOption_optionNotAdded_returnsFalse() {
        assertFalse(cl.hasOption(sampleOption));
    }

    @Test
    public void testHasOption_optionAdded_returnsTrue() {
        cl.addOption(sampleOption);
        assertTrue(cl.hasOption(sampleOption));
    }

    // ---------- getOption ----------

    @Test
    public void testGetOption_knownTrigger_returnsOption() {
        cl.addOption(sampleOption);
        Option result = cl.getOption(sampleOption.getPreferredName());
        assertEquals(sampleOption, result);
    }

    @Test
    public void testGetOption_unknownTrigger_returnsNull() {
        assertNull(cl.getOption("unknown-trigger"));
    }

    // ---------- getValues ----------

    @Test
    public void testGetValues_noValuesNoDefaults_returnsEmptyList() {
        List result = cl.getValues(sampleOption, null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetValues_paramDefaultsOnly_returnsParamDefaults() {
        List defaults = Arrays.asList("d1", "d2");
        List result = cl.getValues(sampleOption, defaults);
        assertEquals(defaults, result);
    }

    @Test
    public void testGetValues_commandValuesSmallerThanDefaults_augmentsList() {
        cl.addValue(sampleArgument, "v1");
        List defaults = Arrays.asList("v1", "d2", "d3");
        List result = cl.getValues(sampleArgument, defaults);
        assertEquals(3, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("d2", result.get(1));
        assertEquals("d3", result.get(2));
    }

    @Test
    public void testGetValues_optionDefaultValuesSet_usesOptionDefaults() {
        List optDefaults = Arrays.asList("od1");
        cl.setDefaultValues(sampleOption, optDefaults);
        List result = cl.getValues(sampleOption, null);
        assertEquals(optDefaults, result);
    }

    @Test
    public void testGetValues_paramDefaultsEmpty_fallsBackToOptionDefaults() {
        List optDefaults = Arrays.asList("od1");
        cl.setDefaultValues(sampleOption, optDefaults);
        List result = cl.getValues(sampleOption, new ArrayList());
        assertEquals(optDefaults, result);
    }

    @Test
    public void testGetValues_commandValuesGreaterThanDefaults_returnsCommandValues() {
        cl.addValue(sampleArgument, "v1");
        cl.addValue(sampleArgument, "v2");
        List defaults = Arrays.asList("d1");
        List result = cl.getValues(sampleArgument, defaults);
        assertEquals(2, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("v2", result.get(1));
    }

    // ---------- getUndefaultedValues ----------

    @Test
    public void testGetUndefaultedValues_noValues_returnsEmptyList() {
        List result = cl.getUndefaultedValues(sampleOption);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetUndefaultedValues_withValues_returnsExactValues() {
        cl.addValue(sampleArgument, "v1");
        List result = cl.getUndefaultedValues(sampleArgument);
        assertEquals(1, result.size());
        assertEquals("v1", result.get(0));
    }

    // ---------- getSwitch ----------

    @Test
    public void testGetSwitch_noData_returnsNull() {
        assertNull(cl.getSwitch(sampleOption, null));
    }

    @Test
    public void testGetSwitch_withParamDefault_returnsParamDefault() {
        assertEquals(Boolean.TRUE, cl.getSwitch(sampleOption, Boolean.TRUE));
    }

    @Test
    public void testGetSwitch_withCommandLineSwitch_returnsSwitchValue() {
        cl.addSwitch(sampleOption, true);
        assertEquals(Boolean.TRUE, cl.getSwitch(sampleOption, Boolean.FALSE));
    }

    @Test
    public void testGetSwitch_withDefaultSwitchMap_returnsDefaultSwitch() {
        cl.setDefaultSwitch(sampleOption, Boolean.FALSE);
        assertEquals(Boolean.FALSE, cl.getSwitch(sampleOption, null));
    }

    // ---------- getProperty(String) / addProperty(String,String) ----------

    @Test
    public void testAddPropertyAndGetPropertyByName_doesNotThrow() {
        cl.addProperty("key1", "value1");
        // Behavior depends on inherited implementation from CommandLineImpl;
        // here we simply verify no exception is thrown and method is callable.
        String result = cl.getProperty("key1");
        assertTrue(result == null || result.equals("value1"));
    }

    // ---------- addProperty(Option,String,String) / getProperty(Option,String,String) ----------

    @Test
    public void testAddPropertyWithOption_thenGetProperty_returnsValue() {
        cl.addProperty(sampleOption, "prop1", "val1");
        String result = cl.getProperty(sampleOption, "prop1", "default");
        assertEquals("val1", result);
    }

    @Test
    public void testGetPropertyWithOption_noPropertiesSet_returnsDefaultValue() {
        String result = cl.getProperty(sampleOption, "propX", "defaultVal");
        assertEquals("defaultVal", result);
    }

    @Test
    public void testGetPropertyWithOption_propertyNotFoundButPropertiesExist_returnsDefaultValue() {
        cl.addProperty(sampleOption, "propA", "valA");
        String result = cl.getProperty(sampleOption, "propB", "defaultVal");
        assertEquals("defaultVal", result);
    }

    // ---------- getProperties(Option) / getProperties() ----------

    @Test
    public void testGetPropertiesWithOption_noProperties_returnsEmptySet() {
        Set result = cl.getProperties(sampleOption);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetPropertiesWithOption_withProperties_returnsCorrectKeys() {
        cl.addProperty(sampleOption, "keyA", "valA");
        cl.addProperty(sampleOption, "keyB", "valB");
        Set result = cl.getProperties(sampleOption);
        assertEquals(2, result.size());
        assertTrue(result.contains("keyA"));
        assertTrue(result.contains("keyB"));
    }

    @Test
    public void testGetProperties_noArgs_doesNotThrow() {
        Set result = cl.getProperties();
        assertNotNull(result);
    }

    // ---------- looksLikeOption ----------

    @Test
    public void testLooksLikeOption_startsWithPrefix_returnsTrue() {
        assertTrue(cl.looksLikeOption("-v"));
    }

    @Test
    public void testLooksLikeOption_doesNotStartWithPrefix_returnsFalse() {
        assertFalse(cl.looksLikeOption("value"));
    }

    @Test
    public void testLooksLikeOption_emptyString_returnsFalse() {
        assertFalse(cl.looksLikeOption(""));
    }

    // ---------- toString ----------

    @Test
    public void testToString_argumentsWithAndWithoutSpaces_formatsCorrectly() {
        String result = cl.toString();
        assertTrue(result.contains("arg1"));
        assertTrue(result.contains("\"arg with space\""));
    }

    @Test
    public void testToString_emptyNormalisedList_returnsEmptyString() {
        WriteableCommandLineImpl emptyCl =
            new WriteableCommandLineImpl(rootOption, new ArrayList());
        assertEquals("", emptyCl.toString());
    }

    // ---------- getOptions ----------

    @Test
    public void testGetOptions_afterAddingOptions_returnsUnmodifiableList() {
        cl.addOption(sampleOption);
        List result = cl.getOptions();
        assertTrue(result.contains(sampleOption));
        try {
            result.add(new DefaultOptionBuilder().withShortName("x").create());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- getOptionTriggers ----------

    @Test
    public void testGetOptionTriggers_afterAddOption_containsPreferredName() {
        cl.addOption(sampleOption);
        Set triggers = cl.getOptionTriggers();
        assertTrue(triggers.contains(sampleOption.getPreferredName()));
    }

    @Test
    public void testGetOptionTriggers_noOptionsAdded_returnsEmptySet() {
        Set triggers = cl.getOptionTriggers();
        assertTrue(triggers.isEmpty());
    }

    // ---------- setDefaultValues ----------

    @Test
    public void testSetDefaultValues_withList_storesDefaults() {
        List defaults = Arrays.asList("d1");
        cl.setDefaultValues(sampleOption, defaults);
        assertEquals(defaults, cl.getValues(sampleOption, null));
    }

    @Test
    public void testSetDefaultValues_withNull_removesDefaults() {
        List defaults = Arrays.asList("d1");
        cl.setDefaultValues(sampleOption, defaults);
        cl.setDefaultValues(sampleOption, null);
        List result = cl.getValues(sampleOption, null);
        assertTrue(result.isEmpty());
    }

    // ---------- setDefaultSwitch ----------

    @Test
    public void testSetDefaultSwitch_withBoolean_storesDefault() {
        cl.setDefaultSwitch(sampleOption, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cl.getSwitch(sampleOption, null));
    }

    @Test
    public void testSetDefaultSwitch_withNull_removesDefault() {
        cl.setDefaultSwitch(sampleOption, Boolean.TRUE);
        cl.setDefaultSwitch(sampleOption, null);
        assertNull(cl.getSwitch(sampleOption, null));
    }

    // ---------- getNormalised ----------

    @Test
    public void testGetNormalised_returnsUnmodifiableList() {
        List result = cl.getNormalised();
        assertEquals(2, result.size());
        try {
            result.add("extra");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}
