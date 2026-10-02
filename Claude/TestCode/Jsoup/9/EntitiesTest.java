package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class EntitiesTest {

    // ---------- EscapeMode enum tests ----------

    @Test
    public void testEscapeMode_xhtml_getMap_containsBasicEntities() {
        Map<Character, String> map = Entities.EscapeMode.xhtml.getMap();
        assertNotNull(map);
        assertEquals("amp", map.get('&'));
        assertEquals("lt", map.get('<'));
        assertEquals("gt", map.get('>'));
        assertEquals("quot", map.get('"'));
        assertEquals("apos", map.get('\''));
    }

    @Test
    public void testEscapeMode_base_getMap_containsExtraEntities() {
        Map<Character, String> map = Entities.EscapeMode.base.getMap();
        assertNotNull(map);
        assertEquals("amp", map.get('&'));
        assertEquals("eacute", map.get('\u00e9')); // é
        assertEquals("nbsp", map.get('\u00a0'));
    }

    @Test
    public void testEscapeMode_extended_getMap_containsFullSet() {
        Map<Character, String> map = Entities.EscapeMode.extended.getMap();
        assertNotNull(map);
        assertEquals("amp", map.get('&'));
        assertEquals("euro", map.get('\u20ac'));
    }

    @Test
    public void testEscapeMode_valueOf_returnsEnumInstance() {
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.xhtml, Entities.EscapeMode.valueOf("xhtml"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }

    @Test
    public void testEscapeMode_values_hasThreeModes() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(3, modes.length);
    }

    // ---------- escape(String, CharsetEncoder, EscapeMode) tests ----------

    @Test
    public void testEscape_xhtmlMode_withAsciiEncoder_normalInput() throws Exception {
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        String result = Entities.escape("<a&b>", encoder, Entities.EscapeMode.xhtml);
        assertEquals("&lt;a&amp;b&gt;", result);
    }

    @Test
    public void testEscape_baseMode_withAsciiEncoder_unicodeCharMappedToNamedEntity() throws Exception {
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        // 'é' (0x00E9) is in baseArray as "eacute"
        String result = Entities.escape("caf\u00e9", encoder, Entities.EscapeMode.base);
        assertEquals("caf&eacute;", result);
    }

    @Test
    public void testEscape_extendedMode_withAsciiEncoder_unmappedUnicodeCharFallsBackToNumeric() throws Exception {
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        // snowman character, not expected to be part of entity maps
        String input = "x\u2603y";
        String result = Entities.escape(input, encoder, Entities.EscapeMode.extended);
        assertEquals("x&#9731;y", result);
    }

    @Test
    public void testEscape_emptyString_returnsEmptyString() throws Exception {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("", encoder, Entities.EscapeMode.base);
        assertEquals("", result);
    }

    @Test
    public void testEscape_utf8Encoder_unicodeCharPassesThroughDirectly() throws Exception {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        // UTF-8 encoder can encode almost any character directly, and 'é' is not in xhtml map
        String result = Entities.escape("caf\u00e9", encoder, Entities.EscapeMode.xhtml);
        assertEquals("caf\u00e9", result);
    }

    @Test(expected = NullPointerException.class)
    public void testEscape_nullString_throwsNullPointerException() throws Exception {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        Entities.escape(null, encoder, Entities.EscapeMode.base);
    }

    // ---------- escape(String, Document.OutputSettings) tests ----------
    // NOTE: Document.OutputSettings API (constructor, escapeMode(), charset()) is assumed
    // based on standard jsoup usage within this same package.

    @Test
    public void testEscape_withOutputSettings_defaultBaseMode() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        String result = Entities.escape("<hello & world>", settings);
        assertEquals("&lt;hello &amp; world&gt;", result);
    }

    @Test
    public void testEscape_withOutputSettings_xhtmlMode() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.xhtml);
        String result = Entities.escape("<tag>", settings);
        assertEquals("&lt;tag&gt;", result);
    }

    // ---------- unescape(String) tests ----------

    @Test
    public void testUnescape_noAmpersand_returnsSameString() {
        String input = "plain text without entities";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescape_namedEntityWithSemicolon_decodesCorrectly() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("<", Entities.unescape("&lt;"));
        assertEquals(">", Entities.unescape("&gt;"));
    }

    @Test
    public void testUnescape_decimalNumericEntity_decodesCorrectly() {
        assertEquals("A", Entities.unescape("&#65;"));
    }

    @Test
    public void testUnescape_hexNumericEntity_decodesCorrectly() {
        assertEquals("A", Entities.unescape("&#x41;"));
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescape_invalidEntityName_returnsOriginalText() {
        String input = "&notARealEntityName;";
        assertEquals(input, Entities.unescape(input));
    }

    @Test
    public void testUnescape_multipleEntitiesInOneString_decodesAll() {
        String input = "&lt;div&gt;Hello &amp; welcome&lt;/div&gt;";
        String expected = "<div>Hello & welcome</div>";
        assertEquals(expected, Entities.unescape(input));
    }

    @Test
    public void testUnescape_overflowingHexNumber_handlesNumberFormatExceptionGracefully() {
        // Hex value larger than Integer.MAX_VALUE triggers NumberFormatException internally,
        // original text should be preserved.
        String input = "&#xFFFFFFFF;";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_ampersandOnlyWithoutValidEntity_returnsSameText() {
        String input = "just an & sign without entity";
        assertEquals(input, Entities.unescape(input));
    }

    @Test(expected = NullPointerException.class)
    public void testUnescape_nullString_throwsNullPointerException() {
        Entities.unescape(null);
    }
}
