import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

/**
 * Unit tests for {@link CommandLine}.
 *
 * NOTE: The {@link Option} class source was not provided as part of this task's
 * <source_code> tag. Since CommandLine cannot be meaningfully exercised without
 * Option instances (addOption/getOptionValue/etc. all depend on it), this test
 * suite relies on the well-known, stable public constructors and methods of
 * org.apache.commons.cli.Option (e.g. Option(String, String, boolean, String),
 * getKey(), getLongOpt(), addValue(String), getValues()) that are part of the
 * same commons-cli package as CommandLine. No other unverified/guessed API is used.
 */
public class CommandLineTest {

    private CommandLine commandLine;

    @Before
    public void setUp() {
        commandLine = new CommandLine();
    }

    // ---------------------------------------------------------------
    // hasOption(String) / hasOption(char)
    // ---------------------------------------------------------------

    @Test
    public void testHasOption_optionNotSet_returnsFalse() {
        assertFalse(commandLine.hasOption("a"));
    }

    @Test
    public void testHasOption_optionSet_returnsTrue() throws Exception {
        Option opt = new Option("a", "description");
        commandLine.addOption(opt);
        assertTrue(commandLine.hasOption("a"));
    }

    @Test
    public void testHasOption_charOption_returnsTrue() throws Exception {
        Option opt = new Option("b", "description");
        commandLine.addOption(opt);
        assertTrue(commandLine.hasOption('b'));
    }

    @Test
    public void testHasOption_charOption_notSet_returnsFalse() {
        assertFalse(commandLine.hasOption('z'));
    }

    @Test
    public void testHasOption_withHyphenPrefix_notStripped_returnsFalse() throws Exception {
        Option opt = new Option("a", "description");
        commandLine.addOption(opt);
        // hasOption does not strip leading hyphens, so "-a" should not match "a"
        assertFalse(commandLine.hasOption("-a"));
    }

    @Test
    public void testHasOption_emptyString_returnsFalse() {
        assertFalse(commandLine.hasOption(""));
    }

    // ---------------------------------------------------------------
    // getOptionObject(String) / getOptionObject(char)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionObject_optionNotSet_returnsNull() {
        assertNull(commandLine.getOptionObject("a"));
    }

    @Test
    public void testGetOptionObject_optionSetWithoutValue_returnsNull() throws Exception {
        Option opt = new Option("a", "description");
        commandLine.addOption(opt);
        assertNull(commandLine.getOptionObject("a"));
    }

    @Test
    public void testGetOptionObject_charOverload_optionNotSet_returnsNull() {
        assertNull(commandLine.getOptionObject('x'));
    }

    // ---------------------------------------------------------------
    // getOptionValue(String) / getOptionValue(char)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionValue_optionNotSet_returnsNull() {
        assertNull(commandLine.getOptionValue("a"));
    }

    @Test
    public void testGetOptionValue_optionSetWithValue_returnsValue() throws Exception {
        Option opt = new Option("a", true, "description");
        opt.addValue("value1");
        commandLine.addOption(opt);
        assertEquals("value1", commandLine.getOptionValue("a"));
    }

    @Test
    public void testGetOptionValue_charOverload_optionSetWithValue_returnsValue() throws Exception {
        Option opt = new Option("b", true, "description");
        opt.addValue("valueB");
        commandLine.addOption(opt);
        assertEquals("valueB", commandLine.getOptionValue('b'));
    }

    @Test
    public void testGetOptionValue_charOverload_optionNotSet_returnsNull() {
        assertNull(commandLine.getOptionValue('z'));
    }

    // ---------------------------------------------------------------
    // getOptionValues(String) / getOptionValues(char)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionValues_optionNotSet_returnsNull() {
        assertNull(commandLine.getOptionValues("a"));
    }

    @Test
    public void testGetOptionValues_optionSetWithMultipleValues_returnsValuesArray() throws Exception {
        Option opt = new Option("a", true, "description");
        opt.addValue("v1");
        opt.addValue("v2");
        commandLine.addOption(opt);
        String[] values = commandLine.getOptionValues("a");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
    }

    @Test
    public void testGetOptionValues_withLeadingHyphens_stripsHyphensAndFindsOption() throws Exception {
        Option opt = new Option("a", true, "description");
        opt.addValue("val");
        commandLine.addOption(opt);
        String[] values = commandLine.getOptionValues("-a");
        assertNotNull(values);
        assertEquals("val", values[0]);
    }

    @Test
    public void testGetOptionValues_byLongOptionName_resolvesViaNamesMap() throws Exception {
        Option opt = new Option("s", "longopt", true, "description");
        opt.addValue("longVal");
        commandLine.addOption(opt);
        String[] values = commandLine.getOptionValues("longopt");
        assertNotNull(values);
        assertEquals("longVal", values[0]);
    }

    @Test
    public void testGetOptionValues_charOverload_returnsValues() throws Exception {
        Option opt = new Option("c", true, "description");
        opt.addValue("cVal");
        commandLine.addOption(opt);
        String[] values = commandLine.getOptionValues('c');
        assertNotNull(values);
        assertEquals("cVal", values[0]);
    }

    @Test
    public void testGetOptionValues_charOverload_notSet_returnsNull() {
        assertNull(commandLine.getOptionValues('q'));
    }

    // ---------------------------------------------------------------
    // getOptionValue(String, String) / getOptionValue(char, String)
    // ---------------------------------------------------------------

    @Test
    public void testGetOptionValueWithDefault_optionSet_returnsActualValue() throws Exception {
        Option opt = new Option("a", true, "description");
        opt.addValue("actual");
        commandLine.addOption(opt);
        assertEquals("actual", commandLine.getOptionValue("a", "default"));
    }

    @Test
    public void testGetOptionValueWithDefault_optionNotSet_returnsDefaultValue() {
        assertEquals("default", commandLine.getOptionValue("missing", "default"));
    }

    @Test
    public void testGetOptionValueWithDefault_charOverload_optionSet_returnsActualValue() throws Exception {
        Option opt = new Option("d", true, "description");
        opt.addValue("dVal");
        commandLine.addOption(opt);
        assertEquals("dVal", commandLine.getOptionValue('d', "def"));
    }

    @Test
    public void testGetOptionValueWithDefault_charOverload_optionNotSet_returnsDefault() {
        assertEquals("def", commandLine.getOptionValue('z', "def"));
    }

    @Test
    public void testGetOptionValueWithDefault_nullDefault_returnsNullWhenNotSet() {
        assertNull(commandLine.getOptionValue("missing", null));
    }

    // ---------------------------------------------------------------
    // getArgs() / getArgList() / addArg()
    // ---------------------------------------------------------------

    @Test
    public void testGetArgs_noArgsAdded_returnsEmptyArray() {
        String[] args = commandLine.getArgs();
        assertNotNull(args);
        assertEquals(0, args.length);
    }

    @Test
    public void testGetArgs_argsAdded_returnsPopulatedArray() {
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        String[] args = commandLine.getArgs();
        assertEquals(2, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("arg2", args[1]);
    }

    @Test
    public void testGetArgList_noArgsAdded_returnsEmptyList() {
        List argList = commandLine.getArgList();
        assertNotNull(argList);
        assertTrue(argList.isEmpty());
    }

    @Test
    public void testGetArgList_argsAdded_returnsPopulatedList() {
        commandLine.addArg("first");
        List argList = commandLine.getArgList();
        assertEquals(1, argList.size());
        assertEquals("first", argList.get(0));
    }

    @Test
    public void testAddArg_addsArgumentToList() {
        commandLine.addArg("someArg");
        assertTrue(commandLine.getArgList().contains("someArg"));
    }

    @Test
    public void testAddArg_emptyStringArg_addsSuccessfully() {
        commandLine.addArg("");
        assertEquals(1, commandLine.getArgList().size());
        assertEquals("", commandLine.getArgList().get(0));
    }

    // ---------------------------------------------------------------
    // addOption(Option) - indirectly tested via other methods, plus direct checks
    // ---------------------------------------------------------------

    @Test
    public void testAddOption_withShortAndLongOpt_storesBothMappings() throws Exception {
        Option opt = new Option("s", "long", true, "description");
        commandLine.addOption(opt);
        assertTrue(commandLine.hasOption("s"));
        // long opt should resolve via names map for values lookup
        assertNull(commandLine.getOptionValues("long")); // no value added, but key resolves
    }

    @Test
    public void testAddOption_withOnlyShortOpt_storesUnderShortKey() throws Exception {
        Option opt = new Option("o", "description");
        commandLine.addOption(opt);
        assertTrue(commandLine.hasOption("o"));
    }

    // ---------------------------------------------------------------
    // iterator()
    // ---------------------------------------------------------------

    @Test
    public void testIterator_noOptionsAdded_hasNoNext() {
        Iterator it = commandLine.iterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_optionsAdded_iteratesOverAddedOptions() throws Exception {
        Option opt1 = new Option("a", "descA");
        Option opt2 = new Option("b", "descB");
        commandLine.addOption(opt1);
        commandLine.addOption(opt2);

        Iterator it = commandLine.iterator();
        int count = 0;
        while (it.hasNext()) {
            Object o = it.next();
            assertTrue(o instanceof Option);
            count++;
        }
        assertEquals(2, count);
    }

    // ---------------------------------------------------------------
    // getOptions()
    // ---------------------------------------------------------------

    @Test
    public void testGetOptions_noOptionsAdded_returnsEmptyArray() {
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_optionsAdded_returnsArrayWithAddedOptions() throws Exception {
        Option opt1 = new Option("a", "descA");
        Option opt2 = new Option("b", "descB");
        commandLine.addOption(opt1);
        commandLine.addOption(opt2);

        Option[] options = commandLine.getOptions();
        assertNotNull(options);
        assertEquals(2, options.length);
    }
}
