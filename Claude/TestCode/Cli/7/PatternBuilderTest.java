package org.apache.commons.cli2.builder;

import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternBuilderTest {

    private PatternBuilder patternBuilder;

    @Before
    public void setUp() {
        patternBuilder = new PatternBuilder();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsUsableInstance() {
        PatternBuilder pb = new PatternBuilder();
        assertNotNull(pb);
        pb.withPattern("a");
        Option option = pb.create();
        assertNotNull(option);
    }

    @Test
    public void testParameterizedConstructor_createsUsableInstance() {
        GroupBuilder gbuilder = new GroupBuilder();
        DefaultOptionBuilder obuilder = new DefaultOptionBuilder();
        ArgumentBuilder abuilder = new ArgumentBuilder();
        PatternBuilder pb = new PatternBuilder(gbuilder, obuilder, abuilder);
        assertNotNull(pb);
        pb.withPattern("a");
        Option option = pb.create();
        assertNotNull(option);
    }

    // ---------- withPattern / create - normal cases ----------

    @Test
    public void testWithPattern_singleOption_returnsNonGroupOption() {
        patternBuilder.withPattern("a");
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertFalse(option instanceof Group);
    }

    @Test
    public void testWithPattern_multipleOptions_returnsGroup() {
        patternBuilder.withPattern("ab");
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testWithPattern_requiredOption_createsOptionSuccessfully() {
        patternBuilder.withPattern("!a");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_stringArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a:");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_numberArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a%");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_dateArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a#");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_classArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a@");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_instanceArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a+");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_existingFileArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a<");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_fileArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a>");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_multipleValueFileArgumentType_createsOptionSuccessfully() {
        // type '*' skips withMaximum(1) branch
        patternBuilder.withPattern("a*");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_urlArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("a/");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_requiredWithArgumentType_createsOptionSuccessfully() {
        patternBuilder.withPattern("!a%");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_complexPatternWithMultipleTypesAndOptions_returnsGroup() {
        patternBuilder.withPattern("a@!b:c%d#e<f>g*h/i");
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testWithPattern_multipleRequiredOptionsInSequence_returnsGroup() {
        patternBuilder.withPattern("!a!b");
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testWithPattern_typeOverwrittenBySecondTypeChar_createsOptionSuccessfully() {
        // type '%' overwritten by '#'
        patternBuilder.withPattern("a%#");
        Option option = patternBuilder.create();
        assertNotNull(option);
    }

    // ---------- edge cases ----------

    @Test
    public void testWithPattern_emptyString_createsEmptyGroup() {
        patternBuilder.withPattern("");
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testWithPattern_onlySpecialCharsNoOptionLetter_createsEmptyGroup() {
        // no default-case char encountered so opt remains ' ' and no option is created
        patternBuilder.withPattern("!@");
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test(expected = NullPointerException.class)
    public void testWithPattern_nullPattern_throwsNullPointerException() {
        patternBuilder.withPattern(null);
    }

    @Test
    public void testCreate_withoutAnyPattern_returnsEmptyGroup() {
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    // ---------- reset tests ----------

    @Test
    public void testReset_returnsSameInstance() {
        PatternBuilder result = patternBuilder.reset();
        assertSame(patternBuilder, result);
    }

    @Test
    public void testReset_clearsOptions_subsequentCreateReturnsEmptyGroup() {
        patternBuilder.withPattern("ab");
        patternBuilder.reset();
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testCreate_automaticallyResetsInternalState() {
        patternBuilder.withPattern("a");
        Option first = patternBuilder.create();
        assertNotNull(first);
        // after create(), internal options should be cleared automatically
        patternBuilder.withPattern("b");
        Option second = patternBuilder.create();
        assertNotNull(second);
        assertFalse(second instanceof Group);
    }

    @Test
    public void testWithPattern_calledMultipleTimesBeforeCreate_accumulatesOptions() {
        patternBuilder.withPattern("a");
        patternBuilder.withPattern("b");
        Option option = patternBuilder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }
}
