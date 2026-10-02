package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * Unit tests for org.jsoup.nodes.Entities
 * หมายเหตุ: เมธอด escape(String, Document.OutputSettings) และ unescape(String)
 * เป็น package-private static methods ดังนั้น test class นี้ต้องอยู่ใน package เดียวกัน
 * (org.jsoup.nodes) เพื่อเข้าถึงได้
 *
 * หมายเหตุเพิ่มเติม: ไม่มีข้อมูล API ของ Document.OutputSettings (constructor, setter สำหรับ
 * encoder/escapeMode) ให้มาอย่างเพียงพอ จึงไม่ทดสอบ overload escape(String, Document.OutputSettings)
 * โดยตรง แต่ทดสอบผ่าน escape(String, CharsetEncoder, EscapeMode) ซึ่งเป็น logic หลักที่ overload
 * นั้นเรียกใช้แทน
 */
public class EntitiesTest {

    private CharsetEncoder asciiEncoder() {
        return Charset.forName("US-ASCII").newEncoder();
    }

    // ---------- escape() tests ----------

    @Test
    public void testEscape_emptyString_returnsEmptyString() {
        String result = Entities.escape("", asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("", result);
    }

    @Test
    public void testEscape_baseMode_knownEntityInMap_returnsEscapedEntity() {
        // '\u00A9' = copyright sign, exists in baseByVal map
        String input = "\u00A9";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&copy;", result);
    }

    @Test
    public void testEscape_extendedMode_knownEntityInMap_returnsEscapedEntity() {
        // '\u00A9' = copyright sign, exists in fullByVal map too
        String input = "\u00A9";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.extended);
        assertEquals("&copy;", result);
    }

    @Test
    public void testEscape_baseMode_charNotInMapButEncodable_appendsRawChar() {
        // 'a' is plain ASCII letter, not a key in baseByVal map, and ASCII encoder can encode it
        String input = "a";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("a", result);
    }

    @Test
    public void testEscape_baseMode_charNotInMapNotEncodable_appendsNumericEscape() {
        // '\u1234' (Ethiopic syllable) is not in baseByVal map and ASCII encoder cannot encode it
        String input = "\u1234";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&#4660;", result);
    }

    @Test
    public void testEscape_extendedMode_charOnlyInFullMap_returnsEscapedEntity() {
        // '\u03B1' (alpha) exists in fullByVal but not baseByVal
        String input = "\u03B1";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.extended);
        assertEquals("&alpha;", result);
    }

    @Test
    public void testEscape_baseMode_charOnlyInFullMapNotEncodable_returnsNumericEscape() {
        // '\u03B1' (alpha) is NOT in baseByVal map, and ASCII encoder cannot encode it
        String input = "\u03B1";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("&#945;", result);
    }

    @Test
    public void testEscape_mixedString_producesCorrectMixedOutput() {
        // Mix of: ascii encodable char, mapped entity char, and unmappable/unencodable char
        String input = "a\u00A9\u1234";
        String result = Entities.escape(input, asciiEncoder(), Entities.EscapeMode.base);
        assertEquals("a&copy;&#4660;", result);
    }

    @Test
    public void testEscape_utf8Encoder_allCharsEncodable_noNumericEscape() {
        CharsetEncoder utf8Encoder = Charset.forName("UTF-8").newEncoder();
        String input = "\u1234";
        String result = Entities.escape(input, utf8Encoder, Entities.EscapeMode.base);
        // UTF-8 can encode this char, and it's not in entity map, so raw char appended
        assertEquals("\u1234", result);
    }

    // ---------- unescape() tests ----------

    @Test
    public void testUnescape_noAmpersand_returnsSameString() {
        String input = "hello world";
        String result = Entities.unescape(input);
        assertEquals("hello world", result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        String result = Entities.unescape("");
        assertEquals("", result);
    }

    @Test
    public void testUnescape_namedEntityWithSemicolon_decodesCorrectly() {
        String result = Entities.unescape("&amp;");
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_namedEntityWithoutSemicolon_decodesCorrectly() {
        String result = Entities.unescape("&amp");
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_uppercaseNamedEntity_decodesCorrectlyViaLowercaseLookup() {
        String result = Entities.unescape("&AMP;");
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_numericDecimalEntity_decodesCorrectly() {
        String result = Entities.unescape("&#65;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_numericHexEntityLowercaseX_decodesCorrectly() {
        String result = Entities.unescape("&#x41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_numericHexEntityUppercaseX_decodesCorrectly() {
        String result = Entities.unescape("&#X41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_unknownNamedEntity_returnsOriginalText() {
        String input = "&foobar;";
        String result = Entities.unescape(input);
        assertEquals("&foobar;", result);
    }

    @Test
    public void testUnescape_numericOverflowCausesNumberFormatException_returnsOriginalText() {
        // Very large number causes NumberFormatException internally, caught, charval stays -1
        String input = "&#99999999999999999999;";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_multipleEntitiesInOneString_decodesAllCorrectly() {
        String input = "&amp;&lt;&gt;";
        String result = Entities.unescape(input);
        assertEquals("&<>", result);
    }

    @Test
    public void testUnescape_mixedTextAndEntities_decodesCorrectly() {
        String input = "Hello &amp; welcome &lt;world&gt;!";
        String result = Entities.unescape(input);
        assertEquals("Hello & welcome <world>!", result);
    }

    @Test
    public void testUnescape_namedEntityFromFullMapOnly_decodesCorrectly() {
        // "alpha" only exists in full map, not base map, but unescape uses full map regardless
        String result = Entities.unescape("&alpha;");
        assertEquals("\u03B1", result);
    }

    @Test
    public void testUnescape_stringWithAmpersandButNoValidEntity_returnsProcessedText() {
        String input = "just an & sign";
        String result = Entities.unescape(input);
        // "& " doesn't match the unescape pattern (no letters/digits following properly), so unchanged
        assertEquals("just an & sign", result);
    }

    // ---------- EscapeMode enum tests ----------

    @Test
    public void testEscapeMode_valuesAndValueOf_returnCorrectEnumConstants() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(2, modes.length);
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeMode_valueOfInvalidName_throwsException() {
        Entities.EscapeMode.valueOf("nonexistent");
    }
}
