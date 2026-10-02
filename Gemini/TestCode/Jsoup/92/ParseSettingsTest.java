package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ParseSettingsTest {

    @Test
    public void testConstants_initialization_expectedDefaults() {
        assertNotNull(ParseSettings.htmlDefault);
        assertNotNull(ParseSettings.preserveCase);
        assertFalse(ParseSettings.htmlDefault.preserveTagCase());
        assertTrue(ParseSettings.preserveCase.preserveTagCase());
    }

    @Test
    public void testConstructor_variousCombinations_setsFieldsCorrectly() {
        ParseSettings settingsFF = new ParseSettings(false, false);
        assertFalse(settingsFF.preserveTagCase());

        ParseSettings settingsTF = new ParseSettings(true, false);
        assertTrue(settingsTF.preserveTagCase());

        ParseSettings settingsFT = new ParseSettings(false, true);
        assertFalse(settingsFT.preserveTagCase());

        ParseSettings settingsTT = new ParseSettings(true, true);
        assertTrue(settingsTT.preserveTagCase());
    }

    @Test
    public void testNormalizeTag_preserveTagCaseFalse_lowercasesAndTrims() {
        ParseSettings settings = new ParseSettings(false, false);

        assertEquals("div", settings.normalizeTag("DIV"));
        assertEquals("div", settings.normalizeTag("  DIV  "));
        assertEquals("span", settings.normalizeTag("sPaN"));
        assertEquals("p", settings.normalizeTag("p"));
        assertEquals("", settings.normalizeTag(""));
        assertEquals("", settings.normalizeTag("   "));
    }

    @Test
    public void testNormalizeTag_preserveTagCaseTrue_preservesCaseAndTrims() {
        ParseSettings settings = new ParseSettings(true, false);

        assertEquals("DIV", settings.normalizeTag("DIV"));
        assertEquals("DIV", settings.normalizeTag("  DIV  "));
        assertEquals("sPaN", settings.normalizeTag("sPaN"));
        assertEquals("p", settings.normalizeTag("p"));
        assertEquals("", settings.normalizeTag(""));
        assertEquals("", settings.normalizeTag("   "));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeTag_nullInput_throwsNullPointerException() {
        ParseSettings settings = new ParseSettings(true, true);
        settings.normalizeTag(null);
    }

    @Test
    public void testNormalizeAttribute_preserveAttributeCaseFalse_lowercasesAndTrims() {
        ParseSettings settings = new ParseSettings(false, false);

        assertEquals("href", settings.normalizeAttribute("HREF"));
        assertEquals("href", settings.normalizeAttribute("  HREF  "));
        assertEquals("datavalue", settings.normalizeAttribute("DataValue"));
        assertEquals("id", settings.normalizeAttribute("id"));
        assertEquals("", settings.normalizeAttribute(""));
        assertEquals("", settings.normalizeAttribute("   "));
    }

    @Test
    public void testNormalizeAttribute_preserveAttributeCaseTrue_preservesCaseAndTrims() {
        ParseSettings settings = new ParseSettings(false, true);

        assertEquals("HREF", settings.normalizeAttribute("HREF"));
        assertEquals("HREF", settings.normalizeAttribute("  HREF  "));
        assertEquals("DataValue", settings.normalizeAttribute("DataValue"));
        assertEquals("id", settings.normalizeAttribute("id"));
        assertEquals("", settings.normalizeAttribute(""));
        assertEquals("", settings.normalizeAttribute("   "));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttribute_nullInput_throwsNullPointerException() {
        ParseSettings settings = new ParseSettings(true, true);
        settings.normalizeAttribute(null);
    }

    @Test
    public void testNormalizeAttributes_preserveAttributeCaseFalse_normalizesKeys() {
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attributes = new Attributes();
        attributes.put("HREF", "https://example.com");
        attributes.put("Data-ID", "123");

        Attributes result = settings.normalizeAttributes(attributes);

        assertSame(attributes, result);
        assertTrue(result.hasKey("href"));
        assertTrue(result.hasKey("data-id"));
        assertFalse(result.hasKey("HREF"));
        assertFalse(result.hasKey("Data-ID"));
        assertEquals("https://example.com", result.get("href"));
        assertEquals("123", result.get("data-id"));
    }

    @Test
    public void testNormalizeAttributes_preserveAttributeCaseTrue_preservesKeys() {
        ParseSettings settings = new ParseSettings(false, true);
        Attributes attributes = new Attributes();
        attributes.put("HREF", "https://example.com");
        attributes.put("Data-ID", "123");

        Attributes result = settings.normalizeAttributes(attributes);

        assertSame(attributes, result);
        assertTrue(result.hasKey("HREF"));
        assertTrue(result.hasKey("Data-ID"));
        assertEquals("https://example.com", result.get("HREF"));
        assertEquals("123", result.get("Data-ID"));
    }

    @Test
    public void testNormalizeAttributes_emptyAttributes_returnsEmpty() {
        ParseSettings settingsFalse = new ParseSettings(false, false);
        Attributes emptyAttributes = new Attributes();
        Attributes result = settingsFalse.normalizeAttributes(emptyAttributes);
        assertSame(emptyAttributes, result);
        assertEquals(0, result.size());

        ParseSettings settingsTrue = new ParseSettings(true, true);
        Attributes emptyAttributes2 = new Attributes();
        Attributes result2 = settingsTrue.normalizeAttributes(emptyAttributes2);
        assertSame(emptyAttributes2, result2);
        assertEquals(0, result2.size());
    }

    @Test
    public void testNormalizeAttributes_preserveCaseTrueNullInput_returnsNull() {
        ParseSettings settings = new ParseSettings(true, true);
        Attributes result = settings.normalizeAttributes(null);
        assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttributes_preserveCaseFalseNullInput_throwsNullPointerException() {
        ParseSettings settings = new ParseSettings(false, false);
        settings.normalizeAttributes(null);
    }
}
