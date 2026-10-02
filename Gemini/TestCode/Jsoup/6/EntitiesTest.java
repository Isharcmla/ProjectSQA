package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class EntitiesTest {

    @Test
    public void testEscapeMode_valuesAndValueOf() {
        Entities.EscapeMode[] modes = Entities.EscapeMode.values();
        Assert.assertNotNull(modes);
        Assert.assertEquals(2, modes.length);
        Assert.assertEquals(Entities.EscapeMode.base, Entities.EscapeMode.valueOf("base"));
        Assert.assertEquals(Entities.EscapeMode.extended, Entities.EscapeMode.valueOf("extended"));
    }

    @Test
    public void testEntitiesConstructor() {
        Entities entities = new Entities();
        Assert.assertNotNull(entities);
    }

    @Test
    public void testEscape_withDocumentOutputSettings_escapesProperly() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.charset(Charset.forName("US-ASCII"));
        out.escapeMode(Entities.EscapeMode.base);

        String input = "<p>Hello & \"world\" \u00A0</p>";
        String result = Entities.escape(input, out);
        Assert.assertEquals("&lt;p&gt;Hello &amp; &quot;world&quot; &nbsp;&lt;/p&gt;", result);
    }

    @Test
    public void testEscape_emptyString_returnsEmptyString() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String result = Entities.escape("", encoder, Entities.EscapeMode.base);
        Assert.assertEquals("", result);
    }

    @Test
    public void testEscape_baseMode_escapesOnlyBaseAndUnencodable() {
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        // '&' and '<' are in baseByVal -> mapped to entity
        // 'A' is encodable by US-ASCII -> raw character
        // '\u0102' (Abreve) is NOT in baseByVal and CANNOT be encoded by US-ASCII -> &#258;
        String input = "&<A\u0102";
        String result = Entities.escape(input, encoder, Entities.EscapeMode.base);
        Assert.assertEquals("&amp;&lt;A&#258;", result);
    }

    @Test
    public void testEscape_extendedMode_escapesExtendedEntities() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        // '\u0102' (Abreve) is in fullByVal -> &Abreve;
        String input = "\u0102";
        String result = Entities.escape(input, encoder, Entities.EscapeMode.extended);
        Assert.assertEquals("&Abreve;", result);
    }

    @Test
    public void testEscape_extendedMode_unmappedUnencodableCharacter_outputsNumericEntity() {
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        // '\u4e2d' (Chinese character) is not in fullByVal and not encodable by US-ASCII -> &#20013;
        String input = "\u4e2d";
        String result = Entities.escape(input, encoder, Entities.EscapeMode.extended);
        Assert.assertEquals("&#20013;", result);
    }

    @Test
    public void testEscape_encodableCharacters_remainUnescaped() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        String input = "Hello World 123!@#$%^*()_+-=";
        String result = Entities.escape(input, encoder, Entities.EscapeMode.base);
        Assert.assertEquals("Hello World 123!@#$%^*()_+-=", result);
    }

    @Test(expected = NullPointerException.class)
    public void testEscape_nullString_throwsException() {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        Entities.escape(null, encoder, Entities.EscapeMode.base);
    }

    @Test
    public void testUnescape_noAmpersand_returnsOriginalString() {
        String input = "Hello World, no entities here!";
        String result = Entities.unescape(input);
        Assert.assertSame(input, result);
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        String result = Entities.unescape("");
        Assert.assertEquals("", result);
    }

    @Test
    public void testUnescape_namedEntitiesWithSemicolon() {
        String input = "&lt;div&gt;&amp;&quot;&copy;&trade;&apos;&lt;/div&gt;";
        String expected = "<div>&\"©™'</div>";
        String result = Entities.unescape(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testUnescape_namedEntitiesWithoutSemicolon() {
        String input = "&amp &lt &gt &copy";
        String expected = "& < > ©";
        String result = Entities.unescape(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testUnescape_decimalNumericEntities() {
        String input = "&#65;&#66;&#67; &#160; &#38;";
        String expected = "ABC \u00A0 &";
        String result = Entities.unescape(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testUnescape_decimalNumericEntitiesWithoutSemicolon() {
        String input = "&#65 and &#66";
        String expected = "A and B";
        String result = Entities.unescape(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testUnescape_hexNumericEntities_lowercaseX() {
        String input = "&#x41;&#x42;&#x43; &#xa0;&#x26;";
        String expected = "ABC \u00A0&";
        String result = Entities.unescape(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testUnescape_hexNumericEntities_uppercaseX() {
        String input = "&#X41;&#X42;&#X43; &#XA0;&#X26;";
        String expected = "ABC \u00A0&";
        String result = Entities.unescape(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testUnescape_unknownNamedEntity_leavesUnmodified() {
        String input = "This is &unknownEntity; and &notAnEntity";
        String result = Entities.unescape(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testUnescape_numericOverflow_handlesNumberFormatExceptionGracefully() {
        String input = "&#999999999999999999999999999999; and &#x999999999999999999999999999999;";
        String result = Entities.unescape(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testUnescape_loneAmpersandOrNonMatchingPattern() {
        String input = "Fish & Chips & 123 &&";
        String result = Entities.unescape(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void testUnescape_mixedContentWithPrefixAndSuffix() {
        String input = "Prefix &amp; Middle &#x20AC; &copy; Suffix";
        String expected = "Prefix & Middle \u20AC © Suffix";
        String result = Entities.unescape(input);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testUnescape_nullString_throwsException() {
        Entities.unescape(null);
    }
}
