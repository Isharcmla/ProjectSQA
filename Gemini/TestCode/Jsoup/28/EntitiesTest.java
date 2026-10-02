package org.jsoup.nodes;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
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
        assertEquals("apos", xhtmlMap.get('\''));

        Map<Character, String> baseMap = Entities.EscapeMode.base.getMap();
        assertNotNull(baseMap);
        assertTrue(baseMap.containsKey('<'));

        Map<Character, String> extendedMap = Entities.EscapeMode.extended.getMap();
        assertNotNull(extendedMap);
        assertTrue(extendedMap.containsKey('<'));
    }

    @Test
    public void testIsNamedEntity_validAndInvalidNames() {
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("quot"));
        assertTrue(Entities.isNamedEntity("nbsp"));

        assertFalse(Entities.isNamedEntity("nonExistentEntity123"));
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testGetCharacterByName_validAndInvalidNames() {
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));

        assertNull(Entities.getCharacterByName("nonExistentEntity123"));
        assertNull(Entities.getCharacterByName(""));
    }

    @Test
    public void testEscape_withCharsetEncoderAndEscapeModes() {
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        CharsetEncoder utf8Encoder = Charset.forName("UTF-8").newEncoder();

        String input = "<foo & bar> \"quote\" 'apos' \u00A0 \u20AC";

        // XHTML mode with UTF-8
        String escapedXhtml = Entities.escape(input, utf8Encoder, Entities.EscapeMode.xhtml);
        assertEquals("&lt;foo &amp; bar&gt; &quot;quote&quot; &apos;apos&apos; \u00A0 \u20AC", escapedXhtml);

        // Base mode with US-ASCII (non-mappable chars should be escaped to numeric entities)
        String escapedBaseAscii = Entities.escape(input, asciiEncoder, Entities.EscapeMode.base);
        assertTrue(escapedBaseAscii.contains("&lt;"));
        assertTrue(escapedBaseAscii.contains("&amp;"));
        assertTrue(escapedBaseAscii.contains("&gt;"));
        assertTrue(escapedBaseAscii.contains("&quot;"));
        assertTrue(escapedBaseAscii.contains("&#8364;")); // Euro sign \u20AC in ASCII

        // Extended mode
        String escapedExtended = Entities.escape("<>&", utf8Encoder, Entities.EscapeMode.extended);
        assertEquals("&lt;&gt;&amp;", escapedExtended);

        // Empty string
        assertEquals("", Entities.escape("", utf8Encoder, Entities.EscapeMode.base));
    }

    @Test
    public void testEscape_withDocumentOutputSettings() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("UTF-8");
        settings.escapeMode(Entities.EscapeMode.base);

        String result = Entities.escape("<hello & world>", settings);
        assertEquals("&lt;hello &amp; world&gt;", result);
    }

    @Test
    public void testUnescape_withoutAmpersand_returnsOriginalString() {
        String input = "Hello World! No entities here 12345.";
        assertEquals(input, Entities.unescape(input));
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescape_namedEntities() {
        assertEquals("<foo & bar>", Entities.unescape("&lt;foo &amp; bar&gt;"));
        assertEquals("\"quote\"", Entities.unescape("&quot;quote&quot;"));
        assertEquals("<", Entities.unescape("&lt")); // non-strict: optional trailing semicolon
        assertEquals("&unknown;", Entities.unescape("&unknown;")); // unmapped name entity preserved
    }

    @Test
    public void testUnescape_decimalEntities() {
        assertEquals("<foo & bar>", Entities.unescape("&#60;foo &#38; bar&#62;"));
        assertEquals("<", Entities.unescape("&#60")); // non-strict decimal without semicolon
    }

    @Test
    public void testUnescape_hexEntities() {
        assertEquals("<foo & bar>", Entities.unescape("&#x3c;foo &#x26; bar&#x3E;"));
        assertEquals("<", Entities.unescape("&#X3c;"));
        assertEquals("<", Entities.unescape("&#x3c")); // non-strict hex without semicolon
    }

    @Test
    public void testUnescape_strictMode() {
        // Strict mode requires trailing semicolon
        assertEquals("<foo & bar>", Entities.unescape("&lt;foo &amp; bar&gt;", true));
        assertEquals("&lt;foo", Entities.unescape("&lt;foo", true));
        assertEquals("&lt foo", Entities.unescape("&lt foo", true));
        assertEquals("&#60 foo", Entities.unescape("&#60 foo", true));
        assertEquals("< foo", Entities.unescape("&#60; foo", true));
        assertEquals("&#x3c foo", Entities.unescape("&#x3c foo", true));
        assertEquals("< foo", Entities.unescape("&#x3c; foo", true));
    }

    @Test
    public void testUnescape_invalidNumberFormat_handlesGracefully() {
        // Number too large for integer parse or invalid format in regex group
        String invalidNum = "&#99999999999999999999999999999999999;";
        assertEquals(invalidNum, Entities.unescape(invalidNum));

        String invalidHex = "&#x99999999999999999999999999999999999;";
        assertEquals(invalidHex, Entities.unescape(invalidHex));
    }

    @Test
    public void testUnescape_mixedContentAndEdgeCases() {
        String mixed = "A & B &amp; C &#60; D &#x3E; E &invalid; F &#; G";
        assertEquals("A & B & C < D > E &invalid; F &#; G", Entities.unescape(mixed));
    }
}
