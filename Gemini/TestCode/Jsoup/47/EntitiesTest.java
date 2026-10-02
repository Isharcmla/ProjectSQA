package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Map;

import static org.junit.Assert.*;

public class EntitiesTest {

    @Test
    public void testPrivateConstructor_coversInstantiation() throws Exception {
        Constructor<Entities> constructor = Entities.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Entities instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testEscapeMode_enumValuesAndMaps() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(3, modes.length);
        assertEquals(Entities.EscapeMode.xhtml, Entities.EscapeMode.valueOf("xhtml"));
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));

        Map<Character, String> xhtmlMap = Entities.EscapeMode.xhtml.getMap();
        assertNotNull(xhtmlMap);
        assertEquals("quot", xhtmlMap.get('"'));
        assertEquals("amp", xhtmlMap.get('&'));
        assertEquals("lt", xhtmlMap.get('<'));
        assertEquals("gt", xhtmlMap.get('>'));

        Map<Character, String> baseMap = Entities.EscapeMode.base.getMap();
        assertNotNull(baseMap);
        assertTrue(baseMap.containsKey('&'));
        assertTrue(baseMap.containsKey(' '));

        Map<Character, String> extendedMap = Entities.EscapeMode.extended.getMap();
        assertNotNull(extendedMap);
        assertTrue(extendedMap.size() > baseMap.size());
    }

    @Test
    public void testIsNamedEntity_validAndInvalid() {
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("quot"));
        assertTrue(Entities.isNamedEntity("copy"));
        assertFalse(Entities.isNamedEntity("nonExistentEntityName12345"));
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsBaseNamedEntity_validAndInvalid() {
        assertTrue(Entities.isBaseNamedEntity("lt"));
        assertTrue(Entities.isBaseNamedEntity("gt"));
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("quot"));
        assertFalse(Entities.isBaseNamedEntity("nonExistentEntityName12345"));
        assertFalse(Entities.isBaseNamedEntity(""));
    }

    @Test
    public void testGetCharacterByName_validAndInvalid() {
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
        assertNull(Entities.getCharacterByName("nonExistentEntityName12345"));
    }

    @Test
    public void testEscape_simpleStringDefaultSettings() {
        Document.OutputSettings settings = new Document.OutputSettings();
        String escaped = Entities.escape("Hello & < > \" ' World", settings);
        assertEquals("Hello &amp; &lt; &gt; \" ' World", escaped);
    }

    @Test
    public void testEscape_emptyString() {
        Document.OutputSettings settings = new Document.OutputSettings();
        assertEquals("", Entities.escape("", settings));
    }

    @Test
    public void testEscape_inAttribute_trueAndFalse() {
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();

        // inAttribute = true: quotes are escaped, < and > are kept literal
        Entities.escape(accum, "< > \" &", settings, true, false, false);
        assertEquals("< > &quot; &amp;", accum.toString());

        accum.setLength(0);
        // inAttribute = false: < and > are escaped, quotes are kept literal
        Entities.escape(accum, "< > \" &", settings, false, false, false);
        assertEquals("&lt; &gt; \" &amp;", accum.toString());
    }

    @Test
    public void testEscape_nbspHandling() {
        Document.OutputSettings settings = new Document.OutputSettings();
        String nonBreakingSpace = "\u00A0";

        // Default / base mode
        settings.escapeMode(Entities.EscapeMode.base);
        assertEquals("&nbsp;", Entities.escape(nonBreakingSpace, settings));

        // Extended mode
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals("&nbsp;", Entities.escape(nonBreakingSpace, settings));

        // XHTML mode
        settings.escapeMode(Entities.EscapeMode.xhtml);
        assertEquals("&#xa0;", Entities.escape(nonBreakingSpace, settings));
    }

    @Test
    public void testEscape_whitespaceNormalisationAndStripLeading() {
        Document.OutputSettings settings = new Document.OutputSettings();

        // normaliseWhite = true, stripLeadingWhite = true
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "   Hello   World!   ", settings, false, true, true);
        assertEquals("Hello World! ", accum.toString());

        // normaliseWhite = true, stripLeadingWhite = false
        accum.setLength(0);
        Entities.escape(accum, "   Hello   World!   ", settings, false, true, false);
        assertEquals(" Hello World! ", accum.toString());

        // normaliseWhite = false
        accum.setLength(0);
        Entities.escape(accum, "   Hello   World!   ", settings, false, false, false);
        assertEquals("   Hello   World!   ", accum.toString());
    }

    @Test
    public void testEscape_asciiCharset_mappedAndUnmappedEntities() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("US-ASCII"));
        settings.escapeMode(Entities.EscapeMode.base);

        // '©' (0xA9) is mapped to &copy; in base mode
        String mapped = "\u00A9";
        assertEquals("&copy;", Entities.escape(mapped, settings));

        // '\u03C0' (Greek Pi) is not in base mode, so hex encoded
        String unmapped = "\u03C0";
        assertEquals("&#x3c0;", Entities.escape(unmapped, settings));
    }

    @Test
    public void testEscape_utfCharset() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("UTF-8"));

        String text = "Hello \u00A9 \u03C0 \u4E2D";
        assertEquals("Hello \u00A9 \u03C0 \u4E2D", Entities.escape(text, settings));
    }

    @Test
    public void testEscape_fallbackCharset() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset(Charset.forName("ISO-8859-1"));
        settings.escapeMode(Entities.EscapeMode.base);

        // ISO-8859-1 can encode © (0xA9)
        assertEquals("\u00A9", Entities.escape("\u00A9", settings));

        // ISO-8859-1 cannot encode \u03C0; with base mode it's not in map -> hex
        assertEquals("&#x3c0;", Entities.escape("\u03C0", settings));

        // With extended mode, \u03C0 is in map ("pi") -> &pi;
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals("&pi;", Entities.escape("\u03C0", settings));
    }

    @Test
    public void testEscape_supplementaryCharacters_surrogatePairs() {
        Document.OutputSettings settingsUtf = new Document.OutputSettings();
        settingsUtf.charset(Charset.forName("UTF-8"));

        // Emoji: U+1F600 (GRINNING FACE) -> \uD83D\uDE00
        String emoji = "\uD83D\uDE00";
        assertEquals(emoji, Entities.escape(emoji, settingsUtf));

        Document.OutputSettings settingsAscii = new Document.OutputSettings();
        settingsAscii.charset(Charset.forName("US-ASCII"));
        assertEquals("&#x1f600;", Entities.escape(emoji, settingsAscii));
    }

    @Test
    public void testUnescape_singleArg() {
        String input = "&lt;div class=&quot;test&quot;&gt;&amp;&nbsp;&lt;/div&gt;";
        String unescaped = Entities.unescape(input);
        assertEquals("<div class=\"test\">& </div>", unescaped);
    }

    @Test
    public void testUnescape_strictAndNonStrict() {
        // Strict = false (allows unescaped entities without trailing semicolon if parser supports it)
        String unescapedRelaxed = Entities.unescape("&amp; &lt &gt", false);
        assertEquals("& < >", unescapedRelaxed);

        // Strict = true
        String unescapedStrict = Entities.unescape("&amp; &lt &gt;", true);
        assertEquals("& &lt >", unescapedStrict);
    }
}
