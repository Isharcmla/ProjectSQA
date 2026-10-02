package org.jsoup.nodes;

import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class EntitiesTest {

    @Test
    public void testConstructor_default_instanceCreated() {
        Entities entities = new Entities();
        assertNotNull(entities);
    }

    @Test
    public void testEscapeMode_valuesAndValueOf() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(2, modes.length);
        assertSame(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertSame(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }

    @Test
    public void testEscape_withDocumentOutputSettings_escapesCorrectly() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("US-ASCII");
        settings.escapeMode(Entities.EscapeMode.base);

        String input = "<foo & bar> \"quote\" 'apos' \u00A0 \u03C0";
        String escaped = Entities.escape(input, settings);
        assertEquals("&lt;foo &amp; bar&gt; &quot;quote&quot; 'apos' &nbsp; &#960;", escaped);
    }

    @Test
    public void testEscape_baseMode_asciiEncoder() {
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        String input = "Hello & <world> \"test\" \u00A9 \u03C0";
        String escaped = Entities.escape(input, asciiEncoder, Entities.EscapeMode.base);
        assertEquals("Hello &amp; &lt;world&gt; &quot;test&quot; &copy; &#960;", escaped);
    }

    @Test
    public void testEscape_extendedMode_asciiEncoder() {
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        String input = "Alpha \u0391 & \u03C0";
        String escaped = Entities.escape(input, asciiEncoder, Entities.EscapeMode.extended);
        assertEquals("Alpha &alpha; &amp; &pi;", escaped);
    }

    @Test
    public void testEscape_utf8Encoder_leavesUnmappedNonAsciiIntact() {
        CharsetEncoder utf8Encoder = Charset.forName("UTF-8").newEncoder();
        String input = "Hello \u4E16\u754C & < >";
        String escaped = Entities.escape(input, utf8Encoder, Entities.EscapeMode.base);
        assertEquals("Hello \u4E16\u754C &amp; &lt; &gt;", escaped);
    }

    @Test
    public void testEscape_unencodableCharacterWithoutEntity_escapesToNumeric() {
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        String input = "\u4E16";
        String escaped = Entities.escape(input, asciiEncoder, Entities.EscapeMode.base);
        assertEquals("&#20016;", escaped);
    }

    @Test
    public void testEscape_emptyString_returnsEmptyString() {
        CharsetEncoder utf8Encoder = Charset.forName("UTF-8").newEncoder();
        String escaped = Entities.escape("", utf8Encoder, Entities.EscapeMode.base);
        assertEquals("", escaped);
    }

    @Test
    public void testUnescape_noAmpersand_returnsOriginal() {
        String input = "Hello world! No entities here.";
        String unescaped = Entities.unescape(input);
        assertSame(input, unescaped);
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        String unescaped = Entities.unescape("");
        assertEquals("", unescaped);
    }

    @Test
    public void testUnescape_namedEntity_basic() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("<", Entities.unescape("&lt;"));
        assertEquals(">", Entities.unescape("&gt;"));
        assertEquals("\"", Entities.unescape("&quot;"));
        assertEquals("\u00A9", Entities.unescape("&copy;"));
    }

    @Test
    public void testUnescape_namedEntity_caseInsensitive() {
        assertEquals("&", Entities.unescape("&AMP;"));
        assertEquals("&", Entities.unescape("&Amp;"));
        assertEquals("<", Entities.unescape("&LT;"));
        assertEquals("\u00A9", Entities.unescape("&COPY;"));
    }

    @Test
    public void testUnescape_namedEntity_withoutTrailingSemicolon() {
        assertEquals("&", Entities.unescape("&amp"));
        assertEquals("<", Entities.unescape("&lt"));
        assertEquals("& and <", Entities.unescape("&amp and &lt"));
    }

    @Test
    public void testUnescape_unknownNamedEntity_retainsOriginal() {
        assertEquals("&unknownentity;", Entities.unescape("&unknownentity;"));
        assertEquals("&notanentity", Entities.unescape("&notanentity"));
    }

    @Test
    public void testUnescape_decimalNumericEntity_valid() {
        assertEquals("A", Entities.unescape("&#65;"));
        assertEquals(" ", Entities.unescape("&#32;"));
        assertEquals("\u00A0", Entities.unescape("&#160;"));
        assertEquals("A", Entities.unescape("&#65"));
    }

    @Test
    public void testUnescape_hexNumericEntity_lowerAndUpperCaseX() {
        assertEquals("A", Entities.unescape("&#x41;"));
        assertEquals("A", Entities.unescape("&#X41;"));
        assertEquals("\u00A9", Entities.unescape("&#xa9;"));
        assertEquals("\u00A9", Entities.unescape("&#XA9;"));
        assertEquals("B", Entities.unescape("&#x42"));
    }

    @Test
    public void testUnescape_numericEntityOverflow_retainsOriginal() {
        String overflowEntity = "&#999999999999999999999999999999;";
        assertEquals(overflowEntity, Entities.unescape(overflowEntity));
    }

    @Test
    public void testUnescape_bareAmpersand_retainsAmpersand() {
        assertEquals("&", Entities.unescape("&"));
        assertEquals("Fish & Chips", Entities.unescape("Fish & Chips"));
        assertEquals("&&&", Entities.unescape("&&&"));
    }

    @Test
    public void testUnescape_mixedString_unescapesAllTypes() {
        String input = "Prefix &amp; &#65; &#x42; &copy; &invalid; &gt Suffix";
        String expected = "Prefix & A B \u00A9 &invalid; > Suffix";
        assertEquals(expected, Entities.unescape(input));
    }
}
