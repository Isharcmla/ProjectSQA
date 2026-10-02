package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class EntitiesTest {

    private Document.OutputSettings settings;

    @Before
    public void setUp() {
        settings = new Document.OutputSettings();
    }

    // ---------- isNamedEntity ----------

    @Test
    public void testIsNamedEntity_knownEntity_returnsTrue() {
        assertTrue(Entities.isNamedEntity("amp"));
    }

    @Test
    public void testIsNamedEntity_unknownEntity_returnsFalse() {
        assertFalse(Entities.isNamedEntity("notARealEntityName"));
    }

    @Test
    public void testIsNamedEntity_emptyString_returnsFalse() {
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsNamedEntity_nullInput_returnsFalse() {
        assertFalse(Entities.isNamedEntity(null));
    }

    // ---------- isBaseNamedEntity ----------

    @Test
    public void testIsBaseNamedEntity_knownEntity_returnsTrue() {
        assertTrue(Entities.isBaseNamedEntity("amp"));
    }

    @Test
    public void testIsBaseNamedEntity_unknownEntity_returnsFalse() {
        assertFalse(Entities.isBaseNamedEntity("notARealEntityName"));
    }

    @Test
    public void testIsBaseNamedEntity_nullInput_returnsFalse() {
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    // ---------- getCharacterByName ----------

    @Test
    public void testGetCharacterByName_knownEntity_returnsCorrectChar() {
        Character c = Entities.getCharacterByName("amp");
        assertNotNull(c);
        assertEquals('&', c.charValue());
    }

    @Test
    public void testGetCharacterByName_unknownEntity_returnsNull() {
        Character c = Entities.getCharacterByName("notARealEntityName");
        assertNull(c);
    }

    @Test
    public void testGetCharacterByName_nullInput_returnsNull() {
        Character c = Entities.getCharacterByName(null);
        assertNull(c);
    }

    // ---------- escape (String, OutputSettings) wrapper ----------

    @Test
    public void testEscape_emptyString_returnsEmpty() {
        String result = Entities.escape("", settings);
        assertEquals("", result);
    }

    @Test
    public void testEscape_plainAsciiString_returnsSameString() {
        String result = Entities.escape("hello world", settings);
        assertEquals("hello world", result);
    }

    @Test
    public void testEscape_withAmpersand_returnsEscapedAmp() {
        String result = Entities.escape("a & b", settings);
        assertTrue(result.contains("&amp;"));
    }

    @Test
    public void testEscape_withLessThan_notInAttribute_returnsEscapedLt() {
        String result = Entities.escape("<div>", settings);
        assertTrue(result.contains("&lt;"));
        assertTrue(result.contains("&gt;"));
    }

    // ---------- escape (StringBuilder overload) - direct branch coverage ----------

    @Test
    public void testEscape_ampersandCharacter_appendsAmpEntity() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "&", settings, false, false, false);
        assertEquals("&amp;", sb.toString());
    }

    @Test
    public void testEscape_nbspChar_baseMode_appendsNbspEntity() {
        settings.escapeMode(Entities.EscapeMode.base);
        StringBuilder sb = new StringBuilder();
        String input = String.valueOf((char) 0xA0);
        Entities.escape(sb, input, settings, false, false, false);
        assertEquals("&nbsp;", sb.toString());
    }

    @Test
    public void testEscape_nbspChar_xhtmlMode_appendsNumericEntity() {
        settings.escapeMode(Entities.EscapeMode.xhtml);
        StringBuilder sb = new StringBuilder();
        String input = String.valueOf((char) 0xA0);
        Entities.escape(sb, input, settings, false, false, false);
        assertEquals("&#xa0;", sb.toString());
    }

    @Test
    public void testEscape_lessThan_notInAttribute_appendsLtEntity() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "<", settings, false, false, false);
        assertEquals("&lt;", sb.toString());
    }

    @Test
    public void testEscape_lessThan_inAttribute_appendsRawChar() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "<", settings, true, false, false);
        assertEquals("<", sb.toString());
    }

    @Test
    public void testEscape_greaterThan_notInAttribute_appendsGtEntity() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, ">", settings, false, false, false);
        assertEquals("&gt;", sb.toString());
    }

    @Test
    public void testEscape_greaterThan_inAttribute_appendsRawChar() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, ">", settings, true, false, false);
        assertEquals(">", sb.toString());
    }

    @Test
    public void testEscape_quote_inAttribute_appendsQuotEntity() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\"", settings, true, false, false);
        assertEquals("&quot;", sb.toString());
    }

    @Test
    public void testEscape_quote_notInAttribute_appendsRawChar() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\"", settings, false, false, false);
        assertEquals("\"", sb.toString());
    }

    @Test
    public void testEscape_asciiCharsetAsciiChar_canEncodeTrue_appendsRawChar() {
        settings.charset("ASCII");
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "A", settings, false, false, false);
        assertEquals("A", sb.toString());
    }

    @Test
    public void testEscape_asciiCharsetNonAsciiChar_extendedMode_mapContainsKey_appendsNamedEntity() {
        settings.charset("ASCII");
        settings.escapeMode(Entities.EscapeMode.extended);
        StringBuilder sb = new StringBuilder();
        String input = String.valueOf((char) 0xA9); // copyright, likely present in full/extended map
        Entities.escape(sb, input, settings, false, false, false);
        String result = sb.toString();
        assertTrue(result.startsWith("&") && result.endsWith(";"));
    }

    @Test
    public void testEscape_asciiCharsetNonAsciiChar_xhtmlMode_mapMissingKey_appendsNumericEntity() {
        settings.charset("ASCII");
        settings.escapeMode(Entities.EscapeMode.xhtml);
        StringBuilder sb = new StringBuilder();
        String input = String.valueOf((char) 0xE9); // e-acute, not in restricted xhtml map
        Entities.escape(sb, input, settings, false, false, false);
        String result = sb.toString();
        assertEquals("&#xe9;", result);
    }

    @Test
    public void testEscape_utfCharset_canEncodeAlwaysTrue_appendsRawChar() {
        settings.charset("UTF-8");
        StringBuilder sb = new StringBuilder();
        String input = String.valueOf((char) 0xE9);
        Entities.escape(sb, input, settings, false, false, false);
        assertEquals(String.valueOf((char) 0xE9), sb.toString());
    }

    @Test
    public void testEscape_fallbackCharset_usesEncoderCanEncode() {
        settings.charset("ISO-8859-1");
        StringBuilder sb = new StringBuilder();
        String input = "A";
        Entities.escape(sb, input, settings, false, false, false);
        assertEquals("A", sb.toString());
    }

    @Test
    public void testEscape_supplementaryCodePoint_utfCharset_encoderCanEncode_appendsRawChar() {
        settings.charset("UTF-8");
        StringBuilder sb = new StringBuilder();
        String emoji = new String(Character.toChars(0x1F600)); // grinning face emoji
        Entities.escape(sb, emoji, settings, false, false, false);
        assertEquals(emoji, sb.toString());
    }

    @Test
    public void testEscape_supplementaryCodePoint_asciiCharset_encoderCannotEncode_appendsNumericEntity() {
        settings.charset("ASCII");
        StringBuilder sb = new StringBuilder();
        String emoji = new String(Character.toChars(0x1F600));
        Entities.escape(sb, emoji, settings, false, false, false);
        String result = sb.toString();
        assertEquals("&#x1f600;", result);
    }

    @Test
    public void testEscape_normaliseWhite_collapsesMultipleSpaces() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "a    b", settings, false, true, false);
        assertEquals("a b", sb.toString());
    }

    @Test
    public void testEscape_normaliseWhite_stripLeadingWhite_removesLeadingSpaces() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "   a b", settings, false, true, true);
        assertEquals("a b", sb.toString());
    }

    @Test
    public void testEscape_normaliseWhite_noStripLeadingWhite_keepsLeadingSpace() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "  a", settings, false, true, false);
        assertEquals(" a", sb.toString());
    }

    // ---------- unescape ----------

    @Test
    public void testUnescape_basicNamedEntity_returnsUnescapedString() {
        String result = Entities.unescape("&amp;");
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_nonStrictWithoutTrailingSemicolon_returnsUnescapedString() {
        String result = Entities.unescape("&amp", false);
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_strictWithoutTrailingSemicolon_leavesStringUnescaped() {
        String result = Entities.unescape("&amp", true);
        assertEquals("&amp", result);
    }

    @Test
    public void testUnescape_noEntities_returnsSameString() {
        String result = Entities.unescape("hello world");
        assertEquals("hello world", result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmpty() {
        String result = Entities.unescape("");
        assertEquals("", result);
    }

    // ---------- EscapeMode enum ----------

    @Test
    public void testEscapeMode_getMap_returnsNonNullMap() {
        assertNotNull(Entities.EscapeMode.base.getMap());
        assertNotNull(Entities.EscapeMode.xhtml.getMap());
        assertNotNull(Entities.EscapeMode.extended.getMap());
    }

    @Test
    public void testEscapeMode_valuesAndValueOf() {
        Entities.EscapeMode mode = Entities.EscapeMode.valueOf("base");
        assertEquals(Entities.EscapeMode.base, mode);
        Entities.EscapeMode[] values = Entities.EscapeMode.values();
        assertEquals(3, values.length);
    }
}
