package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class EntitiesTest {

    private CharsetEncoder utf8Encoder;
    private CharsetEncoder asciiEncoder;

    @Before
    public void setUp() {
        utf8Encoder = Charset.forName("UTF-8").newEncoder();
        asciiEncoder = Charset.forName("ASCII").newEncoder();
    }

    // ---------- isNamedEntity ----------

    @Test
    public void testIsNamedEntity_knownEntity_returnsTrue() {
        assertTrue(Entities.isNamedEntity("amp"));
    }

    @Test
    public void testIsNamedEntity_unknownEntity_returnsFalse() {
        assertFalse(Entities.isNamedEntity("notarealentity"));
    }

    @Test
    public void testIsNamedEntity_emptyString_returnsFalse() {
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsNamedEntity_null_returnsFalse() {
        // HashMap.containsKey(null) does not throw, should return false
        assertFalse(Entities.isNamedEntity(null));
    }

    // ---------- getCharacterByName ----------

    @Test
    public void testGetCharacterByName_knownEntity_returnsCorrectChar() {
        Character result = Entities.getCharacterByName("amp");
        assertNotNull(result);
        assertEquals(Character.valueOf('&'), result);
    }

    @Test
    public void testGetCharacterByName_unknownEntity_returnsNull() {
        assertNull(Entities.getCharacterByName("notarealentity"));
    }

    @Test
    public void testGetCharacterByName_null_returnsNull() {
        assertNull(Entities.getCharacterByName(null));
    }

    // ---------- EscapeMode enum ----------

    @Test
    public void testEscapeMode_xhtml_mapContainsBasicEntities() {
        Map<Character, String> map = Entities.EscapeMode.xhtml.getMap();
        assertNotNull(map);
        assertEquals("lt", map.get('<'));
        assertEquals("gt", map.get('>'));
        assertEquals("amp", map.get('&'));
        assertEquals("quot", map.get('"'));
        assertEquals("apos", map.get('\''));
    }

    @Test
    public void testEscapeMode_base_mapNotNull() {
        Map<Character, String> map = Entities.EscapeMode.base.getMap();
        assertNotNull(map);
        assertFalse(map.isEmpty());
    }

    @Test
    public void testEscapeMode_extended_mapNotNull() {
        Map<Character, String> map = Entities.EscapeMode.extended.getMap();
        assertNotNull(map);
        assertFalse(map.isEmpty());
    }

    // ---------- escape(String, CharsetEncoder, EscapeMode) ----------

    @Test
    public void testEscape_withXhtmlMode_escapesBasicChars() {
        String result = Entities.escape("<a>&'\"", utf8Encoder, Entities.EscapeMode.xhtml);
        assertEquals("&lt;a&gt;&amp;&apos;&quot;", result);
    }

    @Test
    public void testEscape_withBaseMode_encodableChar_appendsRaw() {
        // 'a' is not in the base entity map and is encodable by utf-8 encoder
        String result = Entities.escape("a", utf8Encoder, Entities.EscapeMode.base);
        assertEquals("a", result);
    }

    @Test
    public void testEscape_withAsciiEncoder_cannotEncode_appendsNumericEntity() {
        // use a char that is not in the map and cannot be encoded by ascii encoder
        String input = String.valueOf('\u2603'); // snowman char, not ascii, not in base map
        String result = Entities.escape(input, asciiEncoder, Entities.EscapeMode.base);
        assertEquals("&#" + (int) '\u2603' + ";", result);
    }

    @Test
    public void testEscape_emptyString_returnsEmpty() {
        String result = Entities.escape("", utf8Encoder, Entities.EscapeMode.base);
        assertEquals("", result);
    }

    @Test
    public void testEscape_mixedContent_producesExpectedOutput() {
        String result = Entities.escape("<hello & world>", utf8Encoder, Entities.EscapeMode.xhtml);
        assertEquals("&lt;hello &amp; world&gt;", result);
    }

    // ---------- unescape(String) ----------

    @Test
    public void testUnescape_simpleNamed_returnsUnescaped() {
        String result = Entities.unescape("&amp;");
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_noAmpersand_returnsSameString() {
        String input = "hello world";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_numericDecimal_returnsChar() {
        String result = Entities.unescape("&#65;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_numericHex_returnsChar() {
        String result = Entities.unescape("&#x41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_numericHexUpperX_returnsChar() {
        String result = Entities.unescape("&#X41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_unknownNamedEntity_returnsOriginal() {
        String input = "&foobar;";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_numberFormatOverflow_returnsOriginal() {
        // a number too large for Integer.valueOf, triggers NumberFormatException catch
        String input = "&#99999999999999;";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmpty() {
        String result = Entities.unescape("");
        assertEquals("", result);
    }

    // ---------- unescape(String, boolean) ----------

    @Test
    public void testUnescape_strictMode_withSemicolon_unescapes() {
        String result = Entities.unescape("&amp;", true);
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_strictMode_withoutSemicolon_returnsOriginal() {
        String input = "&amp";
        String result = Entities.unescape(input, true);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_nonStrictMode_withoutSemicolon_unescapes() {
        String result = Entities.unescape("&amp", false);
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_nonStrictMode_withSemicolon_unescapes() {
        String result = Entities.unescape("&amp;", false);
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_multipleEntitiesInString_allUnescaped() {
        String result = Entities.unescape("&lt;div&gt; &amp; &quot;text&quot;");
        assertEquals("<div> & \"text\"", result);
    }
}
