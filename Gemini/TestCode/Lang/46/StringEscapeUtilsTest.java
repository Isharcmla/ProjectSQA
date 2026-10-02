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
        assertNotNull(new StringEscapeUtils());
    }

    // --- Java and JavaScript Escaping ---

    @Test
    public void testEscapeJava_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJava_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJava_controlCharacters() {
        String input = "\b\n\t\f\r";
        String expected = "\\b\\n\\t\\f\\r";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJava_specialCharacters() {
        String input = "\"'\\/";
        String expected = "\"\\\"\\\\\\/";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJava_unicodeAndAsciiRanges() {
        String input = "\u0001" + "\u0010" + "\u0080" + "\u0100" + "\u1000";
        String expected = "\\u0001\\u0010\\u0080\\u0100\\u1000";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJava_normalText() {
        assertEquals("Hello World 123", StringEscapeUtils.escapeJava("Hello World 123"));
    }

    @Test
    public void testEscapeJava_writer_validInput() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, "He didn't say, \"Stop!\"");
        assertEquals("He didn't say, \\\"Stop!\\\"", sw.toString());
    }

    @Test
    public void testEscapeJava_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJava_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeJava((Writer) null, "test");
    }

    @Test
    public void testEscapeJavaScript_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScript_singleQuoteEscaped() {
        assertEquals("He didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJavaScript("He didn't say, \"Stop!\""));
    }

    @Test
    public void testEscapeJavaScript_writer_validInput() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJavaScript(sw, "It's a test");
        assertEquals("It\\'s a test", sw.toString());
    }

    @Test
    public void testEscapeJavaScript_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJavaScript(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaScript_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeJavaScript((Writer) null, "test");
    }

    // --- Java and JavaScript Unescaping ---

    @Test
    public void testUnescapeJava_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJava_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJava_escapedCharacters() {
        String input = "\\\\\\'\\\"\\r\\f\\t\\n\\b";
        String expected = "\\'\"\r\f\t\n\b";
        assertEquals(expected, StringEscapeUtils.unescapeJava(input));
    }

    @Test
    public void testUnescapeJava_unicodeCharacters() {
        String input = "\\u0041\\u0042\\u0043";
        String expected = "ABC";
        assertEquals(expected, StringEscapeUtils.unescapeJava(input));
    }

    @Test
    public void testUnescapeJava_unknownEscapeSequence() {
        assertEquals("a", StringEscapeUtils.unescapeJava("\\a"));
        assertEquals("q", StringEscapeUtils.unescapeJava("\\q"));
    }

    @Test
    public void testUnescapeJava_trailingBackslash() {
        assertEquals("test\\", StringEscapeUtils.unescapeJava("test\\"));
    }

    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJava_invalidUnicode_throwsException() {
        StringEscapeUtils.unescapeJava("\\uZZZZ");
    }

    @Test
    public void testUnescapeJava_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJava_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeJava((Writer) null, "test");
    }

    @Test
    public void testUnescapeJavaScript_string() {
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJavaScript("He didn't say, \\\"Stop!\\\""));
    }

    @Test
    public void testUnescapeJavaScript_writer() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(sw, "\\tHello\\n");
        assertEquals("\tHello\n", sw.toString());
    }

    @Test
    public void testUnescapeJavaScript_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaScript_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeJavaScript((Writer) null, "test");
    }

    // --- HTML Escaping and Unescaping ---

    @Test
    public void testEscapeHtml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testEscapeHtml_entities() {
        assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", StringEscapeUtils.escapeHtml("\"bread\" & \"butter\""));
        assertEquals("&lt;Fran&ccedil;ais&gt;", StringEscapeUtils.escapeHtml("<Fran\u00e7ais>"));
    }

    @Test
    public void testEscapeHtml_writer() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, "<b>Hello & Welcome</b>");
        assertEquals("&lt;b&gt;Hello &amp; Welcome&lt;/b&gt;", sw.toString());
    }

    @Test
    public void testEscapeHtml_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtml_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeHtml((Writer) null, "test");
    }

    @Test
    public void testUnescapeHtml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test
    public void testUnescapeHtml_entities() {
        assertEquals("\"bread\" & \"butter\"", StringEscapeUtils.unescapeHtml("&quot;bread&quot; &amp; &quot;butter&quot;"));
        assertEquals("<Fran\u00e7ais>", StringEscapeUtils.unescapeHtml("&lt;Fran&ccedil;ais&gt;"));
        assertEquals("&zzzz;x", StringEscapeUtils.unescapeHtml("&zzzz;x"));
    }

    @Test
    public void testUnescapeHtml_writer() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeHtml(sw, "&lt;b&gt;Hello &amp; Welcome&lt;/b&gt;");
        assertEquals("<b>Hello & Welcome</b>", sw.toString());
    }

    @Test
    public void testUnescapeHtml_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeHtml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtml_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeHtml((Writer) null, "test");
    }

    // --- XML Escaping and Unescaping ---

    @Test
    public void testEscapeXml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void testEscapeXml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test
    public void testEscapeXml_entities() {
        assertEquals("&quot;bread&quot; &amp; &apos;butter&apos; &lt;&gt;", StringEscapeUtils.escapeXml("\"bread\" & 'butter' <>"));
    }

    @Test
    public void testEscapeXml_writer() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, "<foo val=\"bar & 'baz'\">");
        assertEquals("&lt;foo val=&quot;bar &amp; &apos;baz&apos;&quot;&gt;", sw.toString());
    }

    @Test
    public void testEscapeXml_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXml_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeXml((Writer) null, "test");
    }

    @Test
    public void testUnescapeXml_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void testUnescapeXml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test
    public void testUnescapeXml_entities() {
        assertEquals("\"bread\" & 'butter' <>", StringEscapeUtils.unescapeXml("&quot;bread&quot; &amp; &apos;butter&apos; &lt;&gt;"));
    }

    @Test
    public void testUnescapeXml_writer() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeXml(sw, "&lt;foo val=&quot;bar &amp; &apos;baz&apos;&quot;&gt;");
        assertEquals("<foo val=\"bar & 'baz'\">", sw.toString());
    }

    @Test
    public void testUnescapeXml_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeXml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXml_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeXml((Writer) null, "test");
    }

    // --- SQL Escaping ---

    @Test
    public void testEscapeSql_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSql_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSql_quotes() {
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
        assertEquals("''''", StringEscapeUtils.escapeSql("''"));
        assertEquals("NoQuotes", StringEscapeUtils.escapeSql("NoQuotes"));
    }

    // --- CSV Escaping and Unescaping ---

    @Test
    public void testEscapeCsv_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.escapeCsv(null));
    }

    @Test
    public void testEscapeCsv_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeCsv(""));
    }

    @Test
    public void testEscapeCsv_noSpecialChars_returnsUnchanged() {
        assertEquals("simple", StringEscapeUtils.escapeCsv("simple"));
    }

    @Test
    public void testEscapeCsv_withComma() {
        assertEquals("\"foo,bar\"", StringEscapeUtils.escapeCsv("foo,bar"));
    }

    @Test
    public void testEscapeCsv_withQuotes() {
        assertEquals("\"foo\"\"bar\"", StringEscapeUtils.escapeCsv("foo\"bar"));
    }

    @Test
    public void testEscapeCsv_withCrLf() {
        assertEquals("\"foo\rbar\"", StringEscapeUtils.escapeCsv("foo\rbar"));
        assertEquals("\"foo\nbar\"", StringEscapeUtils.escapeCsv("foo\nbar"));
    }

    @Test
    public void testEscapeCsv_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeCsv(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testEscapeCsv_writer_noSpecialChars() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeCsv(sw, "simple");
        assertEquals("simple", sw.toString());
    }

    @Test
    public void testEscapeCsv_writer_specialChars() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeCsv(sw, "a,\"b\"\nc");
        assertEquals("\"a,\"\"b\"\"\nc\"", sw.toString());
    }

    @Test
    public void testUnescapeCsv_nullInput_returnsNull() {
        assertNull(StringEscapeUtils.unescapeCsv(null));
    }

    @Test
    public void testUnescapeCsv_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeCsv(""));
    }

    @Test
    public void testUnescapeCsv_lengthLessThanTwo() {
        assertEquals("a", StringEscapeUtils.unescapeCsv("a"));
        assertEquals("\"", StringEscapeUtils.unescapeCsv("\""));
    }

    @Test
    public void testUnescapeCsv_notQuoted() {
        assertEquals("foo,bar", StringEscapeUtils.unescapeCsv("foo,bar"));
        assertEquals("\"foo", StringEscapeUtils.unescapeCsv("\"foo"));
        assertEquals("foo\"", StringEscapeUtils.unescapeCsv("foo\""));
    }

    @Test
    public void testUnescapeCsv_quotedWithoutSpecialChars() {
        assertEquals("simple", StringEscapeUtils.unescapeCsv("\"simple\""));
    }

    @Test
    public void testUnescapeCsv_quotedWithSpecialChars() {
        assertEquals("foo,bar", StringEscapeUtils.unescapeCsv("\"foo,bar\""));
        assertEquals("foo\"bar", StringEscapeUtils.unescapeCsv("\"foo\"\"bar\""));
        assertEquals("foo\nbar", StringEscapeUtils.unescapeCsv("\"foo\nbar\""));
        assertEquals("foo\rbar", StringEscapeUtils.unescapeCsv("\"foo\rbar\""));
    }

    @Test
    public void testUnescapeCsv_writer_nullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testUnescapeCsv_writer_validInput() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "\"a,\"\"b\"\"\nc\"");
        assertEquals("a,\"b\"\nc", sw.toString());
    }
}
