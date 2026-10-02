package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class EntitiesTest {

    private Entities entities;

    @Before
    public void setUp() {
        entities = new Entities();
    }

    // A writer implementation that always throws IOException, used to
    // verify that IOExceptions from the underlying Writer are propagated.
    private static class ThrowingWriter extends Writer {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("forced failure");
        }

        @Override
        public void flush() throws IOException {
            // no-op
        }

        @Override
        public void close() throws IOException {
            // no-op
        }
    }

    // ---------------------------------------------------------------
    // addEntity / addEntities / entityName / entityValue
    // ---------------------------------------------------------------

    @Test
    public void testAddEntity_normalInput_entityNameAndValueMatch() {
        entities.addEntity("foo", 0xA1);
        assertEquals("foo", entities.entityName(0xA1));
        assertEquals(0xA1, entities.entityValue("foo"));
    }

    @Test
    public void testAddEntities_arrayOfEntities_allAddedCorrectly() {
        String[][] array = {
                {"one", "1"},
                {"two", "2"}
        };
        entities.addEntities(array);
        assertEquals(1, entities.entityValue("one"));
        assertEquals(2, entities.entityValue("two"));
        assertEquals("one", entities.entityName(1));
        assertEquals("two", entities.entityName(2));
    }

    @Test
    public void testEntityName_unknownValue_returnsNull() {
        assertNull(entities.entityName(999999));
    }

    @Test
    public void testEntityValue_unknownName_returnsMinusOne() {
        assertEquals(-1, entities.entityValue("doesNotExist"));
    }

    @Test
    public void testEntityValue_nullName_returnsMinusOne() {
        assertEquals(-1, entities.entityValue(null));
    }

    @Test
    public void testStaticXmlInstance_knownEntities_correctValues() {
        assertEquals(34, Entities.XML.entityValue("quot"));
        assertEquals(38, Entities.XML.entityValue("amp"));
        assertEquals(60, Entities.XML.entityValue("lt"));
        assertEquals(62, Entities.XML.entityValue("gt"));
        assertEquals(39, Entities.XML.entityValue("apos"));
    }

    @Test
    public void testStaticHtml32Instance_knownEntities_correctValues() {
        assertEquals(34, Entities.HTML32.entityValue("quot"));
        assertEquals(160, Entities.HTML32.entityValue("nbsp"));
        assertEquals(255, Entities.HTML32.entityValue("yuml"));
    }

    @Test
    public void testStaticHtml40Instance_knownEntities_correctValues() {
        assertEquals(34, Entities.HTML40.entityValue("quot"));
        assertEquals(160, Entities.HTML40.entityValue("nbsp"));
        assertEquals(8364, Entities.HTML40.entityValue("euro"));
        assertEquals(402, Entities.HTML40.entityValue("fnof"));
    }

    // ---------------------------------------------------------------
    // escape(String)
    // ---------------------------------------------------------------

    @Test
    public void testEscapeString_knownEntity_returnsEscapedForm() {
        String result = Entities.XML.escape("<a>&\"'");
        // < -> &lt; > -> &gt; & -> &amp; " -> &quot; ' -> &apos;
        assertEquals("&lt;a&gt;&amp;&quot;&apos;", result);
    }

    @Test
    public void testEscapeString_asciiUnmappedChar_returnsUnchanged() {
        String result = entities.escape("a");
        assertEquals("a", result);
    }

    @Test
    public void testEscapeString_charAbove0x7F_unmapped_returnsNumericEntity() {
        String str = String.valueOf((char) 0x100);
        String result = entities.escape(str);
        assertEquals("&#256;", result);
    }

    @Test
    public void testEscapeString_boundaryChar0x7F_notEscaped() {
        String str = String.valueOf((char) 0x7F);
        String result = entities.escape(str);
        assertEquals(str, result);
    }

    @Test
    public void testEscapeString_emptyString_returnsEmpty() {
        assertEquals("", entities.escape(""));
    }

    @Test
    public void testEscapeString_mappedHighChar_usesEntityName() {
        entities.addEntity("foo", 0xA1);
        String result = entities.escape(String.valueOf((char) 0xA1));
        assertEquals("&foo;", result);
    }

    // ---------------------------------------------------------------
    // escape(Writer, String)
    // ---------------------------------------------------------------

    @Test
    public void testEscapeWriter_knownEntity_writesEscapedForm() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.XML.escape(writer, "<a>&");
        assertEquals("&lt;a&gt;&amp;", writer.toString());
    }

    @Test
    public void testEscapeWriter_asciiUnmappedChar_writesUnchanged() throws IOException {
        StringWriter writer = new StringWriter();
        entities.escape(writer, "a");
        assertEquals("a", writer.toString());
    }

    @Test
    public void testEscapeWriter_charAbove0x7F_unmapped_writesNumericEntity() throws IOException {
        StringWriter writer = new StringWriter();
        String str = String.valueOf((char) 0x100);
        entities.escape(writer, str);
        assertEquals("&#256;", writer.toString());
    }

    @Test(expected = IOException.class)
    public void testEscapeWriter_writerThrowsIOException_propagatesException() throws IOException {
        Writer throwingWriter = new ThrowingWriter();
        entities.escape(throwingWriter, "a");
    }

    // ---------------------------------------------------------------
    // unescape(String)
    // ---------------------------------------------------------------

    @Test
    public void testUnescapeString_noAmpersand_returnsSameString() {
        String str = "plain text";
        assertEquals(str, entities.unescape(str));
    }

    @Test
    public void testUnescapeString_knownEntity_returnsUnescapedChar() {
        String result = Entities.XML.unescape("&amp;");
        assertEquals("&", result);
    }

    @Test
    public void testUnescapeString_unknownEntityName_returnsOriginalLiteral() {
        String result = entities.unescape("&foo;");
        assertEquals("&foo;", result);
    }

    @Test
    public void testUnescapeString_decimalNumericEntity_returnsCorrectChar() {
        String result = entities.unescape("&#65;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescapeString_hexLowerXNumericEntity_returnsCorrectChar() {
        String result = entities.unescape("&#x41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescapeString_hexUpperXNumericEntity_returnsCorrectChar() {
        String result = entities.unescape("&#X41;");
        assertEquals("A", result);
    }

    @Test
    public void testUnescapeString_invalidNumericEntity_returnsOriginalLiteral() {
        String result = entities.unescape("&#abc;");
        assertEquals("&#abc;", result);
    }

    @Test
    public void testUnescapeString_noSemicolon_returnsLiteralAmpersandAndRest() {
        String result = entities.unescape("&foo");
        assertEquals("&foo", result);
    }

    @Test
    public void testUnescapeString_nestedAmpersandBeforeSemicolon_returnsLiteral() {
        String result = entities.unescape("&amp&;");
        // amph index < semi index => appended literally then continue
        assertEquals("&amp&;", result);
    }

    @Test
    public void testUnescapeString_emptyEntityName_returnsLiteral() {
        String result = entities.unescape("&;");
        assertEquals("&;", result);
    }

    @Test
    public void testUnescapeString_hashOnly_returnsLiteral() {
        String result = entities.unescape("&#;");
        assertEquals("&#;", result);
    }

    @Test
    public void testUnescapeString_textBeforeAmpersand_isPreserved() {
        String result = Entities.XML.unescape("hello &amp; world");
        assertEquals("hello & world", result);
    }

    // ---------------------------------------------------------------
    // unescape(Writer, String)
    // ---------------------------------------------------------------

    @Test
    public void testUnescapeWriter_noAmpersand_writesSameString() throws IOException {
        StringWriter writer = new StringWriter();
        String str = "plain text";
        entities.unescape(writer, str);
        assertEquals(str, writer.toString());
    }

    @Test
    public void testUnescapeWriter_knownEntity_writesUnescapedChar() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.XML.unescape(writer, "&amp;");
        assertEquals("&", writer.toString());
    }

    @Test
    public void testUnescapeWriter_unknownEntityName_writesOriginalLiteral() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&foo;");
        assertEquals("&foo;", writer.toString());
    }

    @Test
    public void testUnescapeWriter_decimalNumericEntity_writesCorrectChar() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#65;");
        assertEquals("A", writer.toString());
    }

    @Test
    public void testUnescapeWriter_hexLowerXNumericEntity_writesCorrectChar() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#x41;");
        assertEquals("A", writer.toString());
    }

    @Test
    public void testUnescapeWriter_hexUpperXNumericEntity_writesCorrectChar() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#X41;");
        assertEquals("A", writer.toString());
    }

    @Test
    public void testUnescapeWriter_noSemicolon_writesLiteralAmpersandAndRest() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&foo");
        assertEquals("&foo", writer.toString());
    }

    @Test
    public void testUnescapeWriter_nestedAmpersandBeforeSemicolon_writesLiteral() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&amp&;");
        assertEquals("&amp&;", writer.toString());
    }

    @Test
    public void testUnescapeWriter_emptyEntityContent_writesLiteral() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&;");
        assertEquals("&;", writer.toString());
    }

    @Test
    public void testUnescapeWriter_hashOnlyContent_writesLiteral() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#;");
        assertEquals("&#;", writer.toString());
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriter_writerThrowsIOException_propagatesException_noAmpersand() throws IOException {
        Writer throwingWriter = new ThrowingWriter();
        entities.unescape(throwingWriter, "plain");
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriter_writerThrowsIOException_propagatesException_withAmpersand() throws IOException {
        Writer throwingWriter = new ThrowingWriter();
        entities.unescape(throwingWriter, "&amp;");
    }
}
