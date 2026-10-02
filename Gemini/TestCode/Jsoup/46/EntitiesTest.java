package org.jsoup.nodes;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Map;

import static org.junit.Assert.*;

public class EntitiesTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<Entities> constructor = Entities.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Entities instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testIsNamedEntity_validAndInvalid() {
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("quot"));
        assertTrue(Entities.isNamedEntity("copy"));
        assertFalse(Entities.isNamedEntity("nonExistentEntityName"));
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsBaseNamedEntity_validAndInvalid() {
        assertTrue(Entities.isBaseNamedEntity("lt"));
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("quot"));
        assertFalse(Entities.isBaseNamedEntity("nonExistentEntityName"));
        assertFalse(Entities.isBaseNamedEntity(""));
    }

    @Test
    public void testGetCharacterByName_validAndInvalid() {
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
        assertNull(Entities.getCharacterByName("invalidEntity"));
        assertNull(Entities.getCharacterByName(""));
    }

    @Test
    public void testEscapeModeEnum() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(3, modes.length);

        assertEquals(Entities.EscapeMode.xhtml, Entities.EscapeMode.valueOf("xhtml"));
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));

        Map<Character, String> xhtmlMap = Entities.EscapeMode.xhtml.getMap();
        assertNotNull(xhtmlMap);
        assertEquals("lt", xhtmlMap.get('<'));
        assertEquals("gt", xhtmlMap.get('>'));
        assertEquals("amp", xhtmlMap.get('&'));
        assertEquals("quot", xhtmlMap.get('"'));

        Map<Character, String> baseMap = Entities.EscapeMode.base.getMap();
        assertNotNull(baseMap);

        Map<Character, String> extendedMap = Entities.EscapeMode.extended.getMap();
        assertNotNull(extendedMap);
    }

    @Test
    public void testEscape_emptyString() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals("", Entities.escape("", settings));
    }

    @Test
    public void testEscape_basicHtmlEntitiesUtf8() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("UTF-8");

        String input = "<foo & \"bar\" >";
        String escaped = Entities.escape(input, settings);
        assertEquals("&lt;foo &amp; \"bar\" &gt;", escaped);
    }

    @Test
    public void testEscape_inAttribute() {
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();

        // In attribute: < and > should NOT be escaped, " should be escaped, & should be escaped
        Entities.escape(accum, "<foo & \"bar\" >", settings, true, false, false);
        assertEquals("<foo &amp; &quot;bar&quot; >", accum.toString());
    }

    @Test
    public void testEscape_notInAttribute() {
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();

        // Outside attribute: < and > should be escaped, " should NOT be escaped
        Entities.escape(accum, "<foo & \"bar\" >", settings, false, false, false);
        assertEquals("&lt;foo &amp; \"bar\" &gt;", accum.toString());
    }

    @Test
    public void testEscape_nonBreakingSpace() {
        Document.OutputSettings settings = new Document.OutputSettings();

        // Default / Base mode: 0xA0 -> &nbsp;
        settings.escapeMode(Entities.EscapeMode.base);
        assertEquals("&nbsp;", Entities.escape("\u00A0", settings));

        // Extended mode: 0xA0 -> &nbsp;
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals("&nbsp;", Entities.escape("\u00A0", settings));

        // XHTML mode: 0xA0 -> raw char \u00A0
        settings.escapeMode(Entities.EscapeMode.xhtml);
        assertEquals("\u00A0", Entities.escape("\u00A0", settings));
    }

    @Test
    public void testEscape_asciiCharsetFallback() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("US-ASCII");
        settings.escapeMode(Entities.EscapeMode.base);

        // 'é' (0xE9) is in base map -> &eacute;
        assertEquals("&eacute;", Entities.escape("é", settings));

        // Character not in base map and non-ascii -> hex entity
        assertEquals("&#x430;", Entities.escape("а", settings)); // Cyrillic small letter 'a' (U+0430)
    }

    @Test
    public void testEscape_fallbackCharset() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("ISO-8859-1");
        settings.escapeMode(Entities.EscapeMode.base);

        // ISO-8859-1 can encode 'é'
        if (Charset.isSupported("ISO-8859-1")) {
            assertEquals("é", Entities.escape("é", settings));
            // ISO-8859-1 cannot encode Cyrillic 'а', not in base map -> hex entity
            assertEquals("&#x430;", Entities.escape("а", settings));
        }
    }

    @Test
    public void testEscape_supplementaryCharacters() {
        Document.OutputSettings utfSettings = new Document.OutputSettings();
        utfSettings.charset("UTF-8");

        // Code point U+1F600 (Grinning Face emoji)
        String emoji = new String(Character.toChars(0x1F600));

        // UTF-8 can encode surrogate pairs
        assertEquals(emoji, Entities.escape(emoji, utfSettings));

        // ASCII cannot encode surrogate pairs
        Document.OutputSettings asciiSettings = new Document.OutputSettings();
        asciiSettings.charset("US-ASCII");
        assertEquals("&#x1f600;", Entities.escape(emoji, asciiSettings));
    }

    @Test
    public void testEscape_normaliseWhitespace_stripLeadingWhiteTrue() {
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();

        // Leading whitespace should be stripped, multiple whitespace collapsed into single space
        String input = "   Hello   \t\n  World!   ";
        Entities.escape(accum, input, settings, false, true, true);
        assertEquals("Hello World! ", accum.toString());
    }

    @Test
    public void testEscape_normaliseWhitespace_stripLeadingWhiteFalse() {
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();

        // Leading whitespace should be collapsed to single space, not completely stripped
        String input = "   Hello   World! ";
        Entities.escape(accum, input, settings, false, true, false);
        assertEquals(" Hello World! ", accum.toString());
    }

    @Test
    public void testEscape_normaliseWhitespace_onlyWhitespace() {
        Document.OutputSettings settings = new Document.OutputSettings();

        StringBuilder accum1 = new StringBuilder();
        Entities.escape(accum1, "    ", settings, false, true, true);
        assertEquals("", accum1.toString());

        StringBuilder accum2 = new StringBuilder();
        Entities.escape(accum2, "    ", settings, false, true, false);
        assertEquals(" ", accum2.toString());
    }

    @Test
    public void testUnescape_default() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("<foo & \"bar\">", Entities.unescape("&lt;foo &amp; &quot;bar&gt;"));
        assertEquals("Hello World", Entities.unescape("Hello World"));
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescape_strict() {
        // Strict requires trailing ';'
        assertEquals("&", Entities.unescape("&amp;", true));
        assertEquals("&amp", Entities.unescape("&amp", true));
        assertEquals("&", Entities.unescape("&amp", false));
    }
}
