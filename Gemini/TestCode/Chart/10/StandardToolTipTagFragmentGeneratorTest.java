package org.jfree.chart.imagemap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the {@link StandardToolTipTagFragmentGenerator} class.
 */
public class StandardToolTipTagFragmentGeneratorTest {

    private StandardToolTipTagFragmentGenerator generator;

    @Before
    public void setUp() {
        this.generator = new StandardToolTipTagFragmentGenerator();
    }

    @Test
    public void testConstructor_createsValidInstance() {
        StandardToolTipTagFragmentGenerator newInstance = new StandardToolTipTagFragmentGenerator();
        assertNotNull(newInstance);
        assertTrue(newInstance instanceof ToolTipTagFragmentGenerator);
    }

    @Test
    public void testGenerateToolTipFragment_normalText_returnsCorrectTagFragment() {
        String toolTipText = "Sales: 100";
        String expected = " title=\"Sales: 100\" alt=\"\"";
        String actual = this.generator.generateToolTipFragment(toolTipText);
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateToolTipFragment_emptyString_returnsCorrectTagFragment() {
        String toolTipText = "";
        String expected = " title=\"\" alt=\"\"";
        String actual = this.generator.generateToolTipFragment(toolTipText);
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateToolTipFragment_nullString_returnsTagFragmentWithNullString() {
        String toolTipText = null;
        String expected = " title=\"null\" alt=\"\"";
        String actual = this.generator.generateToolTipFragment(toolTipText);
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateToolTipFragment_specialCharacters_returnsCorrectTagFragment() {
        String toolTipText = "Value & <Tag> \"Quoted\"";
        String expected = " title=\"Value & <Tag> \"Quoted\"\" alt=\"\"";
        String actual = this.generator.generateToolTipFragment(toolTipText);
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateToolTipFragment_whitespaceString_returnsCorrectTagFragment() {
        String toolTipText = "   ";
        String expected = " title=\"   \" alt=\"\"";
        String actual = this.generator.generateToolTipFragment(toolTipText);
        assertEquals(expected, actual);
    }
}
