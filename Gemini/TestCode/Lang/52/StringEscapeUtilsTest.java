package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.commons.lang.exception.NestableRuntimeException;
import org.junit.Test;

public class StringEscapeUtilsTest {

    @Test
    public void testConstructor() {
        StringEscapeUtils utils = new StringEscapeUtils();
        assertNotNull(utils);
    }

    // --- Java and JavaScript Escaping ---

    @Test
    public void testEscapeJava_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJava_emptyString_returnsEmptyString() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJava_controlCharacters() {
        String input = "\b\n\t\f\r";
        String expected = "\\b\\n\\t\\f\\r";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJava_quotesAndSlashes() {
        String input = "\"He said 'Hello' to \\ me\"";
        String expected = "\\\"He said 'Hello' to \\\\ me\\\"";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJava_unicodeCharacters() {
        // ch > 0xfff
        assertEquals("\\u1234", StringEscapeUtils.escapeJava("\u1234"));
        // ch > 0xff and ch <= 0xfff
        assertEquals("\\u0123", StringEscapeUtils.escapeJava("\u0123"));
        // ch > 0x7f and ch <= 0xff
        assertEquals("\\u0080", StringEscapeUtils.escapeJava("\u0080"));
        assertEquals("\\u00FF", StringEscapeUtils.escapeJava("\u00ff"));
        // ch < 32 with hex formatting (ch > 0xf: e.g. 0x10 = 16)
        assertEquals("\\u0010", StringEscapeUtils.escapeJava("\u0010"));
        // ch < 32 with hex formatting (ch <= 0xf: e.g. 0x01 = 1)
        assertEquals("\\u0001", StringEscapeUtils.escapeJava("\u0001"));
    }

    @Test
    public void testEscapeJava_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.escapeJava(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null", e.getMessage());
        }
    }

    @Test
    public void testEscapeJava_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJava_writer_normalString() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, "hello\tworld");
        assertEquals("hello\\tworld", writer.toString());
    }

    @Test
    public void testEscapeJavaScript_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScript_singleQuoteEscaped() {
        String input = "He didn't say, \"Stop!\"";
        String expected = "He didn\\'t say, \\\"Stop!\\\"";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }

    @Test
    public void testEscapeJavaScript_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.escapeJavaScript(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null", e.getMessage());
        }
    }

    @Test
    public void testEscapeJavaScript_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJavaScript(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJavaScript_writer_normalString() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJavaScript(writer, "It's a 'test'");
        assertEquals("It\\'s a \\'test\\'", writer.toString());
    }

    // --- Java and JavaScript Unescaping ---

    @Test
    public void testUnescapeJava_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJava_emptyString_returnsEmptyString() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJava_escapedSequences() {
        String input = "\\b\\n\\t\\f\\r\\'\\\"\\\\";
        String expected = "\b\n\t\f\r\'\"\\";
        assertEquals(expected, StringEscapeUtils.unescapeJava(input));
    }

    @Test
    public void testUnescapeJava_unicodeSequence() {
        assertEquals("\u0041\u1234", StringEscapeUtils.unescapeJava("\\u0041\\u1234"));
    }

    @Test
    public void testUnescapeJava_invalidUnicode_throwsNestableRuntimeException() {
        try {
            StringEscapeUtils.unescapeJava("\\u00ZZ");
            fail("Expected NestableRuntimeException");
        } catch (NestableRuntimeException e) {
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testUnescapeJava_trailingBackslash() {
        assertEquals("abc\\", StringEscapeUtils.unescapeJava("abc\\"));
    }

    @Test
    public void testUnescapeJava_unrecognizedEscapeSequence() {
        assertEquals("a", StringEscapeUtils.unescapeJava("\\a"));
    }

    @Test
    public void testUnescapeJava_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.unescapeJava((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null", e.getMessage());
        }
    }

    @Test
    public void testUnescapeJava_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeJavaScript_string() {
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJavaScript("He didn\\'t say, \\\"Stop!\\\""));
    }

    @Test
    public void testUnescapeJavaScript_writer() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(writer, "hello\\nworld");
        assertEquals("hello\nworld", writer.toString());
    }

    @Test
    public void testUnescapeJavaScript_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.unescapeJavaScript(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null", e.getMessage());
        }
    }

    @Test
    public void testUnescapeJavaScript_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(writer, null);
        assertEquals("", writer.toString());
    }

    // --- HTML Escaping and Unescaping ---

    @Test
    public void testEscapeHtml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtml_emptyString_returnsEmptyString() {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testEscapeHtml_entities() {
        String input = "\"bread\" & 'butter' <tag>";
        String expected = "&quot;bread&quot; &amp; 'butter' &lt;tag&gt;";
        assertEquals(expected, StringEscapeUtils.escapeHtml(input));
    }

    @Test
    public void testEscapeHtml_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.escapeHtml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null.", e.getMessage());
        }
    }

    @Test
    public void testEscapeHtml_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeHtml_writer_normalString() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, "bread & butter");
        assertEquals("bread &amp; butter", writer.toString());
    }

    @Test
    public void testUnescapeHtml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtml_entities() {
        String input = "&lt;Fran&ccedil;ais&gt;&amp;zzzz;x";
        String expected = "<Fran\u00e7ais>&zzzz;x";
        assertEquals(expected, StringEscapeUtils.unescapeHtml(input));
    }

    @Test
    public void testUnescapeHtml_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.unescapeHtml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null.", e.getMessage());
        }
    }

    @Test
    public void testUnescapeHtml_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeHtml_writer_normalString() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, "&quot;hello&quot;");
        assertEquals("\"hello\"", writer.toString());
    }

    // --- XML Escaping and Unescaping ---

    @Test
    public void testEscapeXml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeXml((String) null));
    }

    @Test
    public void testEscapeXml_entities() {
        String input = "\"bread\" & 'butter' <tag>";
        String expected = "&quot;bread&quot; &amp; &apos;butter&apos; &lt;tag&gt;";
        assertEquals(expected, StringEscapeUtils.escapeXml(input));
    }

    @Test
    public void testEscapeXml_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.escapeXml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null.", e.getMessage());
        }
    }

    @Test
    public void testEscapeXml_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeXml_writer_normalString() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "a < b");
        assertEquals("a &lt; b", writer.toString());
    }

    @Test
    public void testUnescapeXml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeXml((String) null));
    }

    @Test
    public void testUnescapeXml_entities() {
        String input = "&quot;bread&quot; &amp; &apos;butter&apos; &lt;tag&gt;";
        String expected = "\"bread\" & 'butter' <tag>";
        assertEquals(expected, StringEscapeUtils.unescapeXml(input));
    }

    @Test
    public void testUnescapeXml_writer_nullWriter_throwsException() throws IOException {
        try {
            StringEscapeUtils.unescapeXml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null.", e.getMessage());
        }
    }

    @Test
    public void testUnescapeXml_writer_nullString_noOutput() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeXml_writer_normalString() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, "&amp;&lt;&gt;&quot;&apos;");
        assertEquals("&<>\"'", writer.toString());
    }

    // --- SQL Escaping ---

    @Test
    public void testEscapeSql_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSql_emptyString_returnsEmptyString() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSql_withoutQuotes() {
        assertEquals("McHale Navy", StringEscapeUtils.escapeSql("McHale Navy"));
    }

    @Test
    public void testEscapeSql_withQuotes() {
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
        assertEquals("''quoted''", StringEscapeUtils.escapeSql("'quoted'"));
    }
}
