package org.apache.commons.cli2.builder;

import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.DefaultOption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for PatternBuilder ensuring maximum line and branch coverage.
 */
public class PatternBuilderTest {

    private PatternBuilder builder;

    @Before
    public void setUp() {
        builder = new PatternBuilder();
    }

    @Test
    public void testDefaultConstructor() {
        PatternBuilder pb = new PatternBuilder();
        assertNotNull(pb);
    }

    @Test
    public void testCustomConstructor() {
        GroupBuilder gb = new GroupBuilder();
        DefaultOptionBuilder ob = new DefaultOptionBuilder();
        ArgumentBuilder ab = new ArgumentBuilder();
        PatternBuilder pb = new PatternBuilder(gb, ob, ab);
        assertNotNull(pb);
        
        pb.withPattern("a");
        Option option = pb.create();
        assertNotNull(option);
    }

    @Test
    public void testCreate_noOptions_returnsEmptyGroup() {
        Option option = builder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testCreate_singleOption_returnsOptionDirectly() {
        builder.withPattern("a");
        Option option = builder.create();
        assertNotNull(option);
        assertTrue(option instanceof DefaultOption);
        assertEquals("-a", option.getPreferredName());
    }

    @Test
    public void testCreate_multipleOptions_returnsGroupContainingOptions() {
        builder.withPattern("ab");
        Option option = builder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testReset_clearsExistingOptions() {
        builder.withPattern("a");
        PatternBuilder returned = builder.reset();
        assertSame(builder, returned);

        Option option = builder.create();
        assertTrue(option instanceof Group);
    }

    @Test(expected = NullPointerException.class)
    public void testWithPattern_null_throwsNullPointerException() {
        builder.withPattern(null);
    }

    @Test
    public void testWithPattern_emptyString_noOptionsCreated() {
        builder.withPattern("");
        Option option = builder.create();
        assertTrue(option instanceof Group);
    }

    @Test
    public void testWithPattern_onlyModifiers_noOptionsCreated() {
        builder.withPattern("!@#%*<>+/:");
        Option option = builder.create();
        assertTrue(option instanceof Group);
    }

    @Test
    public void testWithPattern_requiredFlagBeforeOptionChar() {
        builder.withPattern("!a");
        Option option = builder.create();
        assertTrue(option instanceof DefaultOption);
        assertTrue(option.isRequired());
    }

    @Test
    public void testWithPattern_requiredFlagAfterOptionChar() {
        builder.withPattern("a!");
        Option option = builder.create();
        assertTrue(option instanceof DefaultOption);
        assertTrue(option.isRequired());
    }

    @Test
    public void testWithPattern_validatorTypeClassInstance() {
        builder.withPattern("a@");
        Option option = builder.create();
        assertNotNull(option);
        assertFalse(option.isRequired());
    }

    @Test
    public void testWithPattern_validatorTypeClass() {
        builder.withPattern("a+");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_validatorTypeNumber() {
        builder.withPattern("a%");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_validatorTypeDate() {
        builder.withPattern("a#");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_validatorTypeExistingFile() {
        builder.withPattern("a<");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_validatorTypeFile() {
        builder.withPattern("a>");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_validatorTypeFileMultipleArguments() {
        builder.withPattern("a*");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_validatorTypeFileMultipleArgumentsRequired() {
        builder.withPattern("a!*");
        Option option = builder.create();
        assertNotNull(option);
        assertTrue(option.isRequired());
    }

    @Test
    public void testWithPattern_validatorTypeUrl() {
        builder.withPattern("a/");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_validatorTypeStringColon() {
        builder.withPattern("a:");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_noArgumentOption() {
        builder.withPattern("a");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPattern_complexMultipleOptions() {
        builder.withPattern("a!@b+c%d#e<f>g*h/i:j");
        Option option = builder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }

    @Test
    public void testWithPattern_multipleSequentialInvocations() {
        builder.withPattern("a!");
        builder.withPattern("b@");
        Option option = builder.create();
        assertNotNull(option);
        assertTrue(option instanceof Group);
    }
}
