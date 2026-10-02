import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.lang.StringEscapeUtils;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class StringEscapeUtilsTest {

    private StringEscapeUtils instance;

    @Before
    public void setUp() {
        instance = new StringEscapeUtils();
    }

    // ---------- Constructor ----------
    @Test
    public void testConstructor_instance_notNull() {
        assertNotNull(instance);
    }

    // ---------- escapeJava(String) ----------
    @Test
    public void testEscapeJava_null_returnsNull() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJava_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJava_normalString_returnsEscaped() {
        String result = StringEscapeUtils.escapeJava("He didn't say, \"Stop!\"");
        assertEquals("He didn't say, \\\"Stop!\\\"", result);
    }

    @Test
    public void testEscapeJava_controlChars_returnsEscaped() {
        String input = "\b\n\t\f\r";
        String result = StringEscapeUtils.escapeJava(input);
        assertEquals("\\b\\n\\t\\f\\r", result);
    }

    @Test
    public void testEscapeJava_backslashAndSlash_returnsEscaped() {
        String result = StringEscapeUtils.escapeJava("a\\b/c");
        assertEquals("a\\\\b\\/c", result);
    }

    @Test
    public void testEscapeJava_singleQuote_notEscaped() {
        String result = StringEscapeUtils.escapeJava("it's");
        assertEquals("it's", result);
    }

    @Test
    public void testEscapeJava_unicodeHighChar_returnsEscaped() {
        // char > 0xfff
        String input = "\u1234";
        String result = StringEscapeUtils.escapeJava(input);
        assertEquals("\\u1234", result);
    }

    @Test
    public void testEscapeJava_unicodeMidChar_returnsEscaped() {
        // char > 0xff and <= 0xfff
        String input = "\u0123";
        String result = StringEscapeUtils.escapeJava(input);
        assertEquals("\\u0123", result);
    }

    @Test
    public void testEscapeJava_unicodeLowChar_returnsEscaped() {
        // char > 0x7f and <= 0xff
        String input = "\u00e9"; // é
        String result = StringEscapeUtils.escapeJava(input);
        assertEquals("\\u00e9".toUpperCase().replace("U", "u"), result);
    }

    @Test
    public void testEscapeJava_controlCharSmallHex_returnsEscaped() {
        // char < 32, not special, and <= 0xf
        char ch = (char) 0x05;
        String input = String.valueOf(ch);
        String result = StringEscapeUtils.escapeJava(input);
        assertEquals("\\u0005", result);
    }

    @Test
    public void testEscapeJava_controlCharLargeHex_returnsEscaped() {
        // char < 32, not special, and > 0xf
        char ch = (char) 0x1f;
        String input = String.valueOf(ch);
        String result = StringEscapeUtils.escapeJava(input);
        assertEquals("\\u001F".toLowerCase().replace("u001f", "u001f"), result.toLowerCase());
    }

    @Test
    public void testEscapeJava_normalChar_returnedAsIs() {
        String result = StringEscapeUtils.escapeJava("abc123");
        assertEquals("abc123", result);
    }

    // ---------- escapeJava(Writer, String) ----------
    @Test
    public void testEscapeJavaWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.escapeJava(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEscapeJavaWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJavaWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, "a\"b");
        assertEquals("a\\\"b", writer.toString());
    }

    // ---------- escapeJavaScript(String) ----------
    @Test
    public void testEscapeJavaScript_null_returnsNull() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScript_singleQuote_returnsEscaped() {
        String result = StringEscapeUtils.escapeJavaScript("it's");
        assertEquals("it\\'s", result);
    }

    @Test
    public void testEscapeJavaScript_normalString_returnsEscaped() {
        String result = StringEscapeUtils.escapeJavaScript("He didn't say, \"Stop!\"");
        assertEquals("He didn\\'t say, \\\"Stop!\\\"", result);
    }

    // ---------- escapeJavaScript(Writer, String) ----------
    @Test
    public void testEscapeJavaScriptWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.escapeJavaScript(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEscapeJavaScriptWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJavaScript(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJavaScriptWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJavaScript(writer, "it's");
        assertEquals("it\\'s", writer.toString());
    }

    // ---------- unescapeJava(String) ----------
    @Test
    public void testUnescapeJava_null_returnsNull() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJava_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJava_normalEscapes_returnsUnescaped() {
        String result = StringEscapeUtils.unescapeJava("He didn't say, \\\"Stop!\\\"");
        assertEquals("He didn't say, \"Stop!\"", result);
    }

    @Test
    public void testUnescapeJava_allEscapeChars_returnsUnescaped() {
        String input = "\\\\\\'\\\"\\r\\f\\t\\n\\b";
        String result = StringEscapeUtils.unescapeJava(input);
        assertEquals("\\'\"\r\f\t\n\b", result);
    }

    @Test
    public void testUnescapeJava_unicodeEscape_returnsUnescaped() {
        String result = StringEscapeUtils.unescapeJava("\\u0041");
        assertEquals("A", result);
    }

    @Test
    public void testUnescapeJava_invalidUnicodeEscape_throwsException() {
        try {
            StringEscapeUtils.unescapeJava("\\uZZZZ");
            fail("Expected NestableRuntimeException");
        } catch (RuntimeException e) {
            // expected - NestableRuntimeException wraps NumberFormatException
        }
    }

    @Test
    public void testUnescapeJava_trailingBackslash_outputsBackslash() {
        String result = StringEscapeUtils.unescapeJava("abc\\");
        assertEquals("abc\\", result);
    }

    @Test
    public void testUnescapeJava_unknownEscapeChar_outputsCharAsIs() {
        String result = StringEscapeUtils.unescapeJava("\\x");
        assertEquals("x", result);
    }

    @Test
    public void testUnescapeJava_noEscapes_returnsAsIs() {
        String result = StringEscapeUtils.unescapeJava("plain text");
        assertEquals("plain text", result);
    }

    // ---------- unescapeJava(Writer, String) ----------
    @Test
    public void testUnescapeJavaWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.unescapeJava(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeJavaWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeJavaWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, "\\n");
        assertEquals("\n", writer.toString());
    }

    // ---------- unescapeJavaScript(String) ----------
    @Test
    public void testUnescapeJavaScript_null_returnsNull() {
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
    }

    @Test
    public void testUnescapeJavaScript_normalString_returnsUnescaped() {
        String result = StringEscapeUtils.unescapeJavaScript("it\\'s");
        assertEquals("it's", result);
    }

    // ---------- unescapeJavaScript(Writer, String) ----------
    @Test
    public void testUnescapeJavaScriptWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.unescapeJavaScript(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeJavaScriptWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(writer, "\\n");
        assertEquals("\n", writer.toString());
    }

    // ---------- escapeHtml(String) ----------
    @Test
    public void testEscapeHtml_null_returnsNull() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testEscapeHtml_normalString_returnsEscaped() {
        String result = StringEscapeUtils.escapeHtml("\"bread\" & \"butter\"");
        assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", result);
    }

    @Test
    public void testEscapeHtml_plainString_returnsSame() {
        assertEquals("plain", StringEscapeUtils.escapeHtml("plain"));
    }

    // ---------- escapeHtml(Writer, String) ----------
    @Test
    public void testEscapeHtmlWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.escapeHtml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEscapeHtmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeHtmlWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, "<p>");
        assertEquals("&lt;p&gt;", writer.toString());
    }

    // ---------- unescapeHtml(String) ----------
    @Test
    public void testUnescapeHtml_null_returnsNull() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test
    public void testUnescapeHtml_normalEntities_returnsUnescaped() {
        String result = StringEscapeUtils.unescapeHtml("&lt;Fran&ccedil;ais&gt;");
        assertEquals("<Fran\u00e7ais>", result);
    }

    @Test
    public void testUnescapeHtml_unrecognizedEntity_leftAsIs() {
        String result = StringEscapeUtils.unescapeHtml("&gt;&zzzz;x");
        assertEquals(">&zzzz;x", result);
    }

    // ---------- unescapeHtml(Writer, String) ----------
    @Test
    public void testUnescapeHtmlWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.unescapeHtml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeHtmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeHtmlWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, "&lt;p&gt;");
        assertEquals("<p>", writer.toString());
    }

    // ---------- escapeXml(Writer, String) ----------
    @Test
    public void testEscapeXmlWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.escapeXml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEscapeXmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeXmlWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "<a>'b'</a>");
        assertEquals("&lt;a&gt;&apos;b&apos;&lt;/a&gt;", writer.toString());
    }

    // ---------- escapeXml(String) ----------
    @Test
    public void testEscapeXml_null_returnsNull() {
        assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void testEscapeXml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test
    public void testEscapeXml_normalString_returnsEscaped() {
        String result = StringEscapeUtils.escapeXml("\"bread\" & \"butter\"");
        assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", result);
    }

    // ---------- unescapeXml(Writer, String) ----------
    @Test
    public void testUnescapeXmlWriter_nullWriter_throwsIllegalArgumentException() throws IOException {
        try {
            StringEscapeUtils.unescapeXml(null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeXmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeXmlWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, "&lt;a&gt;");
        assertEquals("<a>", writer.toString());
    }

    // ---------- unescapeXml(String) ----------
    @Test
    public void testUnescapeXml_null_returnsNull() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void testUnescapeXml_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test
    public void testUnescapeXml_normalString_returnsUnescaped() {
        String result = StringEscapeUtils.unescapeXml("&lt;a&gt;&apos;b&apos;&lt;/a&gt;");
        assertEquals("<a>'b'</a>", result);
    }

    // ---------- escapeSql(String) ----------
    @Test
    public void testEscapeSql_null_returnsNull() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSql_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSql_singleQuote_returnsDoubled() {
        String result = StringEscapeUtils.escapeSql("McHale's Navy");
        assertEquals("McHale''s Navy", result);
    }

    @Test
    public void testEscapeSql_noQuotes_returnsSame() {
        String result = StringEscapeUtils.escapeSql("plain text");
        assertEquals("plain text", result);
    }

    // ---------- escapeCsv(String) ----------
    @Test
    public void testEscapeCsv_null_returnsNull() {
        assertNull(StringEscapeUtils.escapeCsv(null));
    }

    @Test
    public void testEscapeCsv_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.escapeCsv(""));
    }

    @Test
    public void testEscapeCsv_noSpecialChars_returnsSame() {
        String result = StringEscapeUtils.escapeCsv("plain text");
        assertEquals("plain text", result);
    }

    @Test
    public void testEscapeCsv_containsComma_returnsQuoted() {
        String result = StringEscapeUtils.escapeCsv("a,b,c");
        assertEquals("\"a,b,c\"", result);
    }

    @Test
    public void testEscapeCsv_containsQuote_returnsEscapedAndQuoted() {
        String result = StringEscapeUtils.escapeCsv("a\"b");
        assertEquals("\"a\"\"b\"", result);
    }

    @Test
    public void testEscapeCsv_containsNewline_returnsQuoted() {
        String result = StringEscapeUtils.escapeCsv("a\nb");
        assertEquals("\"a\nb\"", result);
    }

    @Test
    public void testEscapeCsv_containsCR_returnsQuoted() {
        String result = StringEscapeUtils.escapeCsv("a\rb");
        assertEquals("\"a\rb\"", result);
    }

    // ---------- escapeCsv(Writer, String) ----------
    @Test
    public void testEscapeCsvWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeCsvWriter_noSpecialChars_writesSame() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeCsv(writer, "plain");
        assertEquals("plain", writer.toString());
    }

    @Test
    public void testEscapeCsvWriter_containsComma_writesQuoted() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeCsv(writer, "a,b");
        assertEquals("\"a,b\"", writer.toString());
    }

    @Test
    public void testEscapeCsvWriter_containsQuote_writesEscapedQuoted() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeCsv(writer, "a\"b");
        assertEquals("\"a\"\"b\"", writer.toString());
    }

    // ---------- unescapeCsv(String) ----------
    @Test
    public void testUnescapeCsv_null_returnsNull() {
        assertNull(StringEscapeUtils.unescapeCsv(null));
    }

    @Test
    public void testUnescapeCsv_emptyString_returnsEmpty() {
        assertEquals("", StringEscapeUtils.unescapeCsv(""));
    }

    @Test
    public void testUnescapeCsv_shortString_returnsSame() {
        String result = StringEscapeUtils.unescapeCsv("a");
        assertEquals("a", result);
    }

    @Test
    public void testUnescapeCsv_notQuoted_returnsSame() {
        String result = StringEscapeUtils.unescapeCsv("abc");
        assertEquals("abc", result);
    }

    @Test
    public void testUnescapeCsv_quotedWithComma_returnsUnquoted() {
        String result = StringEscapeUtils.unescapeCsv("\"a,b\"");
        assertEquals("a,b", result);
    }

    @Test
    public void testUnescapeCsv_quotedWithEscapedQuote_returnsUnescaped() {
        String result = StringEscapeUtils.unescapeCsv("\"a\"\"b,c\"");
        assertEquals("a\"b,c", result);
    }

    @Test
    public void testUnescapeCsv_quotedNoSpecialChars_returnsAsIs() {
        String result = StringEscapeUtils.unescapeCsv("\"abc\"");
        assertEquals("\"abc\"", result);
    }

    @Test
    public void testUnescapeCsv_onlyStartQuote_returnsSame() {
        String result = StringEscapeUtils.unescapeCsv("\"abc");
        assertEquals("\"abc", result);
    }

    // ---------- unescapeCsv(Writer, String) ----------
    @Test
    public void testUnescapeCsvWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeCsvWriter_shortString_writesSame() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeCsv(writer, "a");
        assertEquals("a", writer.toString());
    }

    @Test
    public void testUnescapeCsvWriter_quotedWithComma_writesUnquoted() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeCsv(writer, "\"a,b\"");
        assertEquals("a,b", writer.toString());
    }

    @Test
    public void testUnescapeCsvWriter_notQuoted_writesSame() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeCsv(writer, "abc");
        assertEquals("abc", writer.toString());
    }
}
