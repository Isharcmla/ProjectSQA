package org.jsoup.nodes;

import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EntitiesTest {

    @Test
    public void testEntitiesConstructor_instantiation_notNull() {
        Entities entities = new Entities();
        assertNotNull(entities);
    }

    @Test
    public void testEscapeMode_valuesAndValueOf_correctEnums() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(3, modes.length);
        assertEquals(Entities.EscapeMode.xhtml, Entities.EscapeMode.valueOf("xhtml"));
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }

    @Test
    public void testEscapeMode_getMap_notNullAndNotEmpty() {
        Map<Character, String> xhtmlMap = Entities.EscapeMode.xhtml.getMap();
        Map<Character, String> baseMap = Entities.EscapeMode.base.getMap();
        Map<Character, String> extendedMap = Entities.EscapeMode.extended.getMap();

        assertNotNull(xhtmlMap);
        assertNotNull(baseMap);
        assertNotNull(extendedMap);

        assertTrue(xhtmlMap.containsKey('<'));
        assertTrue(baseMap.containsKey('<'));
        assertTrue(extendedMap.containsKey('<'));

        assertEquals("lt", xhtmlMap.get('<'));
        assertEquals("gt", xhtmlMap.get('>'));
        assertEquals("amp", xhtmlMap.get('&'));
        assertEquals("quot", xhtmlMap.get('"'));
        assertEquals("apos", xhtmlMap.get('\''));

        assertFalse(xhtmlMap.containsKey('©'));
        assertTrue(baseMap.containsKey('©'));
        assertTrue(extendedMap.containsKey('©'));
    }

    @Test
    public void testEscape_withDocumentOutputSettings_escapesCorrectly() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("US-ASCII");
        settings.escapeMode(Entities.EscapeMode.base);

        String input = "<p>Hello & \"world\" 'test' © \u00A9 \u4E2D</p>";
        String escaped = Entities.escape(input, settings);

        assertTrue(escaped.contains("&lt;p&gt;"));
        assertTrue(escaped.contains("&amp;"));
        assertTrue(escaped.contains("&quot;"));
        assertTrue(escaped.contains("&#20013;"));
    }

    @Test
    public void testEscape_charsetEncoderAndEscapeMode_handlesAllBranches() {
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        CharsetEncoder utf8Encoder = Charset.forName("UTF-8").newEncoder();

        // Branch 1: Character is in escape map
        String inMap = "<>&\"'";
        String escapedInMap = Entities.escape(inMap, utf8Encoder, Entities.EscapeMode.xhtml);
        assertEquals("&lt;&gt;&amp;&quot;&apos;", escapedInMap);

        // Branch 2: Character is not in escape map but can be encoded
        String encodable = "abc 123";
        String escapedEncodable = Entities.escape(encodable, asciiEncoder, Entities.EscapeMode.xhtml);
        assertEquals("abc 123", escapedEncodable);

        // Branch 3: Character is not in map and cannot be encoded
        String nonEncodable = "\u4E2D\u6587";
        String escapedNonEncodable = Entities.escape(nonEncodable, asciiEncoder, Entities.EscapeMode.xhtml);
        assertEquals("&#20013;&#25991;", escapedNonEncodable);

        // Empty string
        assertEquals("", Entities.escape("", utf8Encoder, Entities.EscapeMode.xhtml));
    }

    @Test
    public void testUnescape_noAmpersand_returnsOriginalString() {
        String input = "Hello world! No entities here 123.";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_namedEntities_unescapesCorrectly() {
        assertEquals("<", Entities.unescape("&lt;"));
        assertEquals(">", Entities.unescape("&gt;"));
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("\"", Entities.unescape("&quot;"));
        assertEquals("'", Entities.unescape("&apos;"));
        assertEquals("©", Entities.unescape("&copy;"));
        assertEquals("©", Entities.unescape("&COPY;"));
        assertEquals("Hello <world> & \"peace\"", Entities.unescape("Hello &lt;world&gt; &amp; &quot;peace&quot;"));
    }

    @Test
    public void testUnescape_namedEntitiesWithoutSemicolon_unescapesCorrectly() {
        assertEquals("&", Entities.unescape("&amp"));
        assertEquals("<", Entities.unescape("&lt"));
        assertEquals(">", Entities.unescape("&gt"));
        assertEquals("©", Entities.unescape("&copy"));
    }

    @Test
    public void testUnescape_decimalEntities_unescapesCorrectly() {
        assertEquals("&", Entities.unescape("&#38;"));
        assertEquals("<", Entities.unescape("&#60;"));
        assertEquals(">", Entities.unescape("&#62;"));
        assertEquals("A", Entities.unescape("&#65;"));
        assertEquals("A", Entities.unescape("&#65"));
    }

    @Test
    public void testUnescape_hexEntities_unescapesCorrectly() {
        assertEquals("&", Entities.unescape("&#x26;"));
        assertEquals("&", Entities.unescape("&#X26;"));
        assertEquals("<", Entities.unescape("&#x3c;"));
        assertEquals(">", Entities.unescape("&#X3E;"));
        assertEquals("A", Entities.unescape("&#x41;"));
        assertEquals("A", Entities.unescape("&#x41"));
    }

    @Test
    public void testUnescape_unknownNamedEntity_retainsOriginal() {
        String input = "&unknownEntity; &notAnEntity";
        String result = Entities.unescape(input);
        assertEquals("&unknownEntity; &notAnEntity", result);
    }

    @Test
    public void testUnescape_numberFormatException_retainsOriginal() {
        String hugeDec = "&#999999999999999999999999999999999999999999999;";
        String hugeHex = "&#x999999999999999999999999999999999999999999999;";
        assertEquals(hugeDec, Entities.unescape(hugeDec));
        assertEquals(hugeHex, Entities.unescape(hugeHex));
    }

    @Test
    public void testUnescape_mixedContent_unescapesAllProperly() {
        String input = "Text &lt;b&gt;bold &amp; italic&#63;&lt;/b&gt; &#x21; &nonexistent; tail";
        String expected = "Text <b>bold & italic?</b> ! &nonexistent; tail";
        assertEquals(expected, Entities.unescape(input));
    }

    @Test
    public void testUnescape_emptyAndSingleAmpersand_handlesEdgeCases() {
        assertEquals("", Entities.unescape(""));
        assertEquals("&", Entities.unescape("&"));
        assertEquals("&&", Entities.unescape("&&"));
        assertEquals("&;", Entities.unescape("&;"));
        assertEquals("foo & bar", Entities.unescape("foo & bar"));
    }
}
