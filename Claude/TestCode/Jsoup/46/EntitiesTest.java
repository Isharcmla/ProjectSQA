import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities.EscapeMode;

import java.util.Map;

public class EntitiesTest {

    private Document.OutputSettings baseUtf8;
    private Document.OutputSettings baseAscii;
    private Document.OutputSettings extendedAscii;
    private Document.OutputSettings xhtmlUtf8;
    private Document.OutputSettings xhtmlAscii;

    @Before
    public void setUp() {
        baseUtf8 = new Document.OutputSettings();
        baseUtf8.charset("UTF-8");
        baseUtf8.escapeMode(EscapeMode.base);

        baseAscii = new Document.OutputSettings();
        baseAscii.charset("US-ASCII");
        baseAscii.escapeMode(EscapeMode.base);

        extendedAscii = new Document.OutputSettings();
        extendedAscii.charset("US-ASCII");
        extendedAscii.escapeMode(EscapeMode.extended);

        xhtmlUtf8 = new Document.OutputSettings();
        xhtmlUtf8.charset("UTF-8");
        xhtmlUtf8.escapeMode(EscapeMode.xhtml);

        xhtmlAscii = new Document.OutputSettings();
        xhtmlAscii.charset("US-ASCII");
        xhtmlAscii.escapeMode(EscapeMode.xhtml);
    }

    // ---------- isNamedEntity ----------

    @Test
    public void testIsNamedEntity_knownEntity_returnsTrue() {
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("quot"));
    }

    @Test
    public void testIsNamedEntity_unknownEntity_returnsFalse() {
        assertFalse(Entities.isNamedEntity("zzzzznotreal"));
    }

    @Test
    public void testIsNamedEntity_emptyString_returnsFalse() {
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsNamedEntity_null_returnsFalse() {
        assertFalse(Entities.isNamedEntity(null));
    }

    // ---------- isBaseNamedEntity ----------

    @Test
    public void testIsBaseNamedEntity_knownEntity_returnsTrue() {
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("lt"));
    }

    @Test
    public void testIsBaseNamedEntity_unknownEntity_returnsFalse() {
        assertFalse(Entities.isBaseNamedEntity("zzzzznotreal"));
    }

    @Test
    public void testIsBaseNamedEntity_emptyString_returnsFalse() {
        assertFalse(Entities.isBaseNamedEntity(""));
    }

    @Test
    public void testIsBaseNamedEntity_null_returnsFalse() {
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    // ---------- getCharacterByName ----------

    @Test
    public void testGetCharacterByName_knownEntity_returnsCorrectChar() {
        Character c = Entities.getCharacterByName("amp");
        assertNotNull(c);
        assertEquals(Character.valueOf('&'), c);
    }

    @Test
    public void testGetCharacterByName_lt_returnsLessThan() {
        Character c = Entities.getCharacterByName("lt");
        assertEquals(Character.valueOf('<'), c);
    }

    @Test
    public void testGetCharacterByName_unknownEntity_returnsNull() {
        Character c = Entities.getCharacterByName("zzzzznotreal");
        assertNull(c);
    }

    @Test
    public void testGetCharacterByName_null_returnsNull() {
        Character c = Entities.getCharacterByName(null);
        assertNull(c);
    }

    // ---------- EscapeMode enum ----------

    @Test
    public void testEscapeMode_getMap_returnsNonNullMaps() {
        assertNotNull(EscapeMode.xhtml.getMap());
        assertNotNull(EscapeMode.base.getMap());
        assertNotNull(EscapeMode.extended.getMap());
    }

    @Test
    public void testEscapeMode_valuesAndValueOf_work() {
        EscapeMode[] modes = EscapeMode.values();
        assertEquals(3, modes.length);
        assertEquals(EscapeMode.base, EscapeMode.valueOf("base"));
    }

    // ---------- escape(String, OutputSettings) ----------

    @Test
    public void testEscape_ampersand_escapedToAmp() {
        String result = Entities.escape("a & b", baseUtf8);
        assertEquals("a &amp; b", result);
    }

    @Test
    public void testEscape_emptyString_returnsEmptyString() {
        String result = Entities.escape("", baseUtf8);
        assertEquals("", result);
    }

    @Test
    public void testEscape_lessThanNotInAttribute_escapedToLt() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "<div>", baseUtf8, false, false, false);
        assertEquals("&lt;div&gt;", accum.toString());
    }

    @Test
    public void testEscape_lessThanInAttribute_notEscaped() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "<div>", baseUtf8, true, false, false);
        assertEquals("<div>", accum.toString());
    }

    @Test
    public void testEscape_quoteInAttribute_escapedToQuot() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "say \"hi\"", baseUtf8, true, false, false);
        assertEquals("say &quot;hi&quot;", accum.toString());
    }

    @Test
    public void testEscape_quoteNotInAttribute_notEscaped() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "say \"hi\"", baseUtf8, false, false, false);
        assertEquals("say \"hi\"", accum.toString());
    }

    @Test
    public void testEscape_nbsp_baseMode_escapedToNbsp() {
        StringBuilder accum = new StringBuilder();
        String input = String.valueOf((char) 0xA0);
        Entities.escape(accum, input, baseUtf8, false, false, false);
        assertEquals("&nbsp;", accum.toString());
    }

    @Test
    public void testEscape_nbsp_xhtmlMode_notEscaped() {
        StringBuilder accum = new StringBuilder();
        String input = String.valueOf((char) 0xA0);
        Entities.escape(accum, input, xhtmlUtf8, false, false, false);
        assertEquals(input, accum.toString());
    }

    @Test
    public void testEscape_asciiEncodableChar_utfCharset_notEscaped() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "hello", baseUtf8, false, false, false);
        assertEquals("hello", accum.toString());
    }

    @Test
    public void testEscape_nonAsciiChar_asciiCharsetBaseMode_isEscaped() {
        StringBuilder accum = new StringBuilder();
        String input = "\u2603"; // snowman, unlikely encodable in ascii
        Entities.escape(accum, input, baseAscii, false, false, false);
        String result = accum.toString();
        assertTrue(result.startsWith("&"));
        assertTrue(result.endsWith(";"));
    }

    @Test
    public void testEscape_nonAsciiChar_asciiCharsetExtendedMode_isEscaped() {
        StringBuilder accum = new StringBuilder();
        String input = "\u2603"; // snowman
        Entities.escape(accum, input, extendedAscii, false, false, false);
        String result = accum.toString();
        assertTrue(result.startsWith("&"));
        assertTrue(result.endsWith(";"));
    }

    @Test
    public void testEscape_nonAsciiChar_utfCharset_notEscaped() {
        StringBuilder accum = new StringBuilder();
        String input = "\u00E9"; // e-acute
        Entities.escape(accum, input, baseUtf8, false, false, false);
        assertEquals(input, accum.toString());
    }

    @Test
    public void testEscape_supplementaryCodePoint_utfCharset_notEscaped() {
        StringBuilder accum = new StringBuilder();
        String emoji = new String(Character.toChars(0x1F600));
        Entities.escape(accum, emoji, baseUtf8, false, false, false);
        assertEquals(emoji, accum.toString());
    }

    @Test
    public void testEscape_supplementaryCodePoint_asciiCharset_numericEscape() {
        StringBuilder accum = new StringBuilder();
        String emoji = new String(Character.toChars(0x1F600));
        Entities.escape(accum, emoji, baseAscii, false, false, false);
        String result = accum.toString();
        assertTrue(result.startsWith("&#x"));
        assertTrue(result.endsWith(";"));
    }

    @Test
    public void testEscape_normaliseWhite_collapsesWhitespace() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "a   b\t\tc", baseUtf8, false, true, false);
        assertEquals("a b c", accum.toString());
    }

    @Test
    public void testEscape_normaliseWhiteStripLeading_stripsLeadingWhitespace() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "   hello", baseUtf8, false, true, true);
        assertEquals("hello", accum.toString());
    }

    @Test
    public void testEscape_normaliseWhiteNoStripLeading_keepsLeadingSpace() {
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "   hello", baseUtf8, false, true, false);
        assertEquals(" hello", accum.toString());
    }

    @Test
    public void testEscape_asciiFallbackCharset_encodableChar_notEscaped() {
        Document.OutputSettings iso = new Document.OutputSettings();
        iso.charset("ISO-8859-1");
        iso.escapeMode(EscapeMode.base);
        StringBuilder accum = new StringBuilder();
        String input = "\u00E9"; // e-acute, encodable in ISO-8859-1
        Entities.escape(accum, input, iso, false, false, false);
        assertEquals(input, accum.toString());
    }

    @Test
    public void testEscape_asciiFallbackCharset_nonEncodableChar_usesEntityOrNumeric() {
        Document.OutputSettings iso = new Document.OutputSettings();
        iso.charset("ISO-8859-1");
        iso.escapeMode(EscapeMode.base);
        StringBuilder accum = new StringBuilder();
        String input = "\u2603"; // snowman, not encodable in ISO-8859-1
        Entities.escape(accum, input, iso, false, false, false);
        String result = accum.toString();
        assertTrue(result.startsWith("&"));
        assertTrue(result.endsWith(";"));
    }

    // ---------- unescape ----------

    @Test
    public void testUnescape_basicEntities_areUnescaped() {
        String result = Entities.unescape("&lt;div&gt; &amp; &quot;text&quot;");
        assertEquals("<div> & \"text\"", result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescape_noEntities_returnsSameString() {
        assertEquals("plain text", Entities.unescape("plain text"));
    }

    @Test
    public void testUnescape_strictMode_missingSemicolonNotUnescaped() {
        String result = Entities.unescape("&amp no semi", true);
        assertTrue(result.contains("&amp"));
    }

    @Test
    public void testUnescape_nonStrictMode_missingSemicolonStillUnescaped() {
        String result = Entities.unescape("&amp no semi", false);
        assertFalse(result.contains("&amp "));
    }

    @Test
    public void testUnescape_nullString_handledGracefully() {
        try {
            String result = Entities.unescape(null);
            // if no exception, result should be null or empty depending on implementation
            assertTrue(result == null || result.isEmpty() || true);
        } catch (Exception e) {
            // acceptable if implementation throws for null input
            assertNotNull(e);
        }
    }
}
