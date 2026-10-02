package org.jfree.chart.imagemap;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StandardToolTipTagFragmentGeneratorTest {

    private StandardToolTipTagFragmentGenerator generator;

    @Before
    public void setUp() {
        generator = new StandardToolTipTagFragmentGenerator();
    }

    @Test
    public void testGenerateToolTipFragment_normalInput_returnsFormattedString() {
        String result = generator.generateToolTipFragment("Hello World");
        assertEquals(" title=\"Hello World\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_emptyString_returnsFormattedStringWithEmptyTitle() {
        String result = generator.generateToolTipFragment("");
        assertEquals(" title=\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_nullInput_returnsFormattedStringWithNullText() {
        String result = generator.generateToolTipFragment(null);
        assertEquals(" title=\"null\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_specialCharacters_returnsFormattedStringWithSpecialCharacters() {
        String input = "<b>Bold</b> & \"Quoted\"";
        String result = generator.generateToolTipFragment(input);
        assertEquals(" title=\"<b>Bold</b> & \"Quoted\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_whitespaceOnly_returnsFormattedStringWithWhitespace() {
        String result = generator.generateToolTipFragment("   ");
        assertEquals(" title=\"   \" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_longString_returnsFormattedStringWithLongText() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        String longText = sb.toString();
        String result = generator.generateToolTipFragment(longText);
        assertEquals(" title=\"" + longText + "\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_numericString_returnsFormattedStringWithNumericText() {
        String result = generator.generateToolTipFragment("12345");
        assertEquals(" title=\"12345\" alt=\"\"", result);
    }

    @Test
    public void testConstructor_createsInstance_notNull() {
        StandardToolTipTagFragmentGenerator newGenerator = new StandardToolTipTagFragmentGenerator();
        assertNotNull(newGenerator);
    }

    @Test
    public void testGenerateToolTipFragment_implementsInterface_returnsExpectedType() {
        assertTrue(generator instanceof ToolTipTagFragmentGenerator);
    }
}
