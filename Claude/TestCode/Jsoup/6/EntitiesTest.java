package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    // ---------- escape(String, CharsetEncoder, EscapeMode) tests ----------

    @Test
    public void testEscape_baseMode_knownEntities_producesEscapedString() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("<a> & \"b\"", encoder, Entities.EscapeMode.base);
        assertEquals("&lt;a&gt; &amp; &quot;b&quot;", result);
    }

    @Test
    public void testEscape_extendedMode_knownExtendedOnlyEntity_producesEscapedString() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        // '\u0391' is Alpha, only present in the extended (full) table, not base
        String result = Entities.escape("Pi: \u03A0", encoder, Entities.EscapeMode.extended);
        assertEquals("Pi: &Pi;", result);
    }

    @Test
    public void testEscape_baseMode_charNotInBaseTable_encodableChar_outputsRawChar() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        // '\u03A0' (Pi) is not in base table, but UTF-8 encoder can encode it
        String result = Entities.escape("Pi: \u03A0", encoder, Entities.EscapeMode.base);
        assertEquals("Pi: \u03A0", result);
    }

    @Test
    public void testEscape_charCannotBeEncoded_outputsNumericEscape() {
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        char unicodeChar = '\u4E2D'; // Chinese character, not encodable by ASCII, not in any table
        String input = String.valueOf(unicodeChar);
        String expected = "&#" + (int) unicodeChar + ";";
        String result = Entities.escape(input, encoder, Entities.EscapeMode.base);
        assertEquals(expected, result);
    }

    @Test
    public void testEscape_emptyString_returnsEmptyString() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("", encoder, Entities.EscapeMode.base);
        assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void testEscape_nullString_throwsNullPointerException() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        Entities.escape(null, encoder, Entities.EscapeMode.base);
    }

    // ---------- escape(String, Document.OutputSettings) tests ----------

    @Test
    public void testEscape_withOutputSettings_baseMode_producesEscapedString() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.charset("UTF-8");
        out.escapeMode(Entities.EscapeMode.base);
        String result = Entities.escape("<a> & \"b\"", out);
        assertEquals("&lt;a&gt; &amp; &quot;b&quot;", result);
    }

    @Test
    public void testEscape_withOutputSettings_extendedMode_producesEscapedString() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.charset("UTF-8");
        out.escapeMode(Entities.EscapeMode.extended);
        String result = Entities.escape("Pi: \u03A0", out);
        assertEquals("Pi: &Pi;", result);
    }

    // ---------- unescape(String) tests ----------

    @Test
    public void testUnescape_noAmpersand_returnsSameString() {
        String input = "no entities here";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        String result = Entities.unescape("");
        assertEquals("", result);
    }

    @Test
    public void testUnescape_namedEntityWithSemicolon_decodesToChar() {
        String result = Entities.unescape("&amp;");
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_namedEntityWithoutTrailingSemicolon_decodesToChar() {
        String result = Entities.unescape("&amp");
        assertEquals("&", result);
    }

    @Test
    public void testUnescape_decimalNumericEntity_decodesToChar() {
        String result = Entities.unescape("&#65;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_hexNumericEntity_lowercaseX_decodesToChar() {
        String result = Entities.unescape("&#x41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_hexNumericEntity_uppercaseX_decodesToChar() {
        String result = Entities.unescape("&#X41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescape_unknownNamedEntity_leavesUnchanged() {
        String input = "&unknownEntityName;";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_numberFormatOverflow_leavesUnchanged() {
        // decimal digits too large to fit in an int -> NumberFormatException is caught
        String input = "&#99999999999;";
        String result = Entities.unescape(input);
        assertEquals(input, result);
    }

    @Test
    public void testUnescape_valueOutOfCharRange_doesNotThrow() {
        // numeric value larger than 0xFFFF, still successfully parsed as int
        String input = "&#1114112;";
        String result = Entities.unescape(input);
        // Should not throw, and should produce some single character result (truncated by char cast)
        assertNotNull(result);
        assertEquals(1, result.length());
    }

    @Test
    public void testUnescape_multipleEntitiesInOneString_decodesAll() {
        String input = "&amp; and &lt; and &#65; and &#x42;";
        String result = Entities.unescape(input);
        assertEquals("& and < and A and B", result);
    }

    @Test
    public void testUnescape_fullTableOnlyEntity_decodesToChar() {
        String result = Entities.unescape("&forall;");
        assertEquals("\u2200", result);
    }

    @Test(expected = NullPointerException.class)
    public void testUnescape_nullString_throwsNullPointerException() {
        Entities.unescape(null);
    }

    // ---------- EscapeMode enum tests ----------

    @Test
    public void testEscapeMode_valuesAndValueOf_workCorrectly() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        assertEquals(2, modes.length);
        assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }
}
