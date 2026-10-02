import org.junit.Test;
import org.junit.Assert;
import java.io.StringWriter;
import java.io.Writer;
import java.io.IOException;
import org.apache.commons.lang.exception.NestableRuntimeException;

public class StringEscapeUtilsTest {

    //--------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------
    @Test
    public void testConstructor_createsInstance() {
        StringEscapeUtils instance = new StringEscapeUtils();
        Assert.assertNotNull(instance);
    }

    //--------------------------------------------------------------------
    // escapeJava(String)
    //--------------------------------------------------------------------
    @Test
    public void testEscapeJava_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJava_emptyString_returnsEmpty() {
        Assert.assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJava_normalString_returnsEscaped() {
        String input = "He didn't say, \"Stop!\"";
        String result = StringEscapeUtils.escapeJava(input);
        Assert.assertEquals("He didn't say, \\\"Stop!\\\"", result);
    }

    @Test
    public void testEscapeJava_backslash_returnsEscaped() {
        String result = StringEscapeUtils.escapeJava("a\\b");
        Assert.assertEquals("a\\\\b", result);
    }

    @Test
    public void testEscapeJava_singleQuote_notEscaped() {
        String result = StringEscapeUtils.escapeJava("it's");
        Assert.assertEquals("it's", result);
    }

    @Test
    public void testEscapeJava_controlCharsNamed_returnsEscaped() {
        String input = "\b\n\t\f\r";
        String result = StringEscapeUtils.escapeJava(input);
        Assert.assertEquals("\\b\\n\\t\\f\\r", result);
    }

    @Test
    public void testEscapeJava_controlCharUnnamedSmall_returnsUnicodeEscape() {
        // char value 1 (<=0xf) not a named control char
        String input = "\u0001";
        String result = StringEscapeUtils.escapeJava(input);
        Assert.assertEquals("\\u0001", result);
    }

    @Test
    public void testEscapeJava_controlCharUnnamedLarge_returnsUnicodeEscape() {
        // char value 20 (0x14, >0xf) not a named control char
        String input = "\u0014";
        String result = StringEscapeUtils.escapeJava(input);
        Assert.assertEquals("\\u0014", result);
    }

    @Test
    public void testEscapeJava_charGreaterThan0xff_returnsUnicodeEscape() {
        // char value 256 (0x100) > 0xff, <= 0xfff
        String input = "\u0100";
        String result = StringEscapeUtils.escapeJava(input);
        Assert.assertEquals("\\u0100", result);
    }

    @Test
    public void testEscapeJava_charGreaterThan0xfff_returnsUnicodeEscape() {
        // char value 0xffff > 0xfff
        String input = "\uffff";
        String result = StringEscapeUtils.escapeJava(input);
        Assert.assertEquals("\\uFFFF", result);
    }

    @Test
    public void testEscapeJava_charGreaterThan0x7f_returnsUnicodeEscape() {
        // char value 0x80 (128) > 0x7f, <= 0xff
        String input = "\u0080";
        String result = StringEscapeUtils.escapeJava(input);
        Assert.assertEquals("\\u0080", result);
    }

    @Test
    public void testEscapeJava_normalAsciiChar_returnsUnchanged() {
        String result = StringEscapeUtils.escapeJava("abc123");
        Assert.assertEquals("abc123", result);
    }

    //--------------------------------------------------------------------
    // escapeJava(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeJava(null, "abc");
    }

    @Test
    public void testEscapeJavaWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, null);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJavaWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, "a\"b");
        Assert.assertEquals("a\\\"b", writer.toString());
    }

    //--------------------------------------------------------------------
    // escapeJavaScript(String)
    //--------------------------------------------------------------------
    @Test
    public void testEscapeJavaScript_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScript_singleQuote_escaped() {
        String result = StringEscapeUtils.escapeJavaScript("it's");
        Assert.assertEquals("it\\'s", result);
    }

    @Test
    public void testEscapeJavaScript_normalString_returnsEscaped() {
        String input = "He didn't say, \"Stop!\"";
        String result = StringEscapeUtils.escapeJavaScript(input);
        Assert.assertEquals("He didn\\'t say, \\\"Stop!\\\"", result);
    }

    //--------------------------------------------------------------------
    // escapeJavaScript(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaScriptWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeJavaScript(null, "abc");
    }

    @Test
    public void testEscapeJavaScriptWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJavaScript(writer, null);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJavaScriptWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJavaScript(writer, "it's");
        Assert.assertEquals("it\\'s", writer.toString());
    }

    //--------------------------------------------------------------------
    // unescapeJava(String)
    //--------------------------------------------------------------------
    @Test
    public void testUnescapeJava_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJava_emptyString_returnsEmpty() {
        Assert.assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJava_normalEscapes_returnsUnescaped() {
        String input = "a\\\\b\\n\\t\\r\\f\\b\\'\\\"c";
        String result = StringEscapeUtils.unescapeJava(input);
        Assert.assertEquals("a\\b\n\t\r\f\b\'\"c", result);
    }

    @Test
    public void testUnescapeJava_unicodeEscape_returnsUnescaped() {
        String input = "\\u0041";
        String result = StringEscapeUtils.unescapeJava(input);
        Assert.assertEquals("A", result);
    }

    @Test
    public void testUnescapeJava_invalidUnicode_throwsNestableRuntimeException() {
        try {
            StringEscapeUtils.unescapeJava("\\uZZZZ");
            Assert.fail("Expected NestableRuntimeException");
        } catch (NestableRuntimeException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeJava_trailingBackslash_returnsBackslash() {
        String result = StringEscapeUtils.unescapeJava("abc\\");
        Assert.assertEquals("abc\\", result);
    }

    @Test
    public void testUnescapeJava_unrecognizedEscape_returnsChar() {
        String result = StringEscapeUtils.unescapeJava("\\z");
        Assert.assertEquals("z", result);
    }

    @Test
    public void testUnescapeJava_noEscapes_returnsSame() {
        String result = StringEscapeUtils.unescapeJava("hello world");
        Assert.assertEquals("hello world", result);
    }

    //--------------------------------------------------------------------
    // unescapeJava(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeJava(null, "abc");
    }

    @Test
    public void testUnescapeJavaWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, null);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeJavaWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJava(writer, "\\n");
        Assert.assertEquals("\n", writer.toString());
    }

    //--------------------------------------------------------------------
    // unescapeJavaScript(String)
    //--------------------------------------------------------------------
    @Test
    public void testUnescapeJavaScript_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.unescapeJavaScript(null));
    }

    @Test
    public void testUnescapeJavaScript_normalString_returnsUnescaped() {
        String result = StringEscapeUtils.unescapeJavaScript("a\\'b");
        Assert.assertEquals("a'b", result);
    }

    //--------------------------------------------------------------------
    // unescapeJavaScript(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaScriptWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeJavaScript(null, "abc");
    }

    @Test
    public void testUnescapeJavaScriptWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeJavaScript(writer, "\\t");
        Assert.assertEquals("\t", writer.toString());
    }

    //--------------------------------------------------------------------
    // escapeHtml(String)
    //--------------------------------------------------------------------
    @Test
    public void testEscapeHtml_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtml_emptyString_returnsEmpty() {
        Assert.assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testEscapeHtml_normalString_returnsEscaped() {
        String input = "\"bread\" & \"butter\"";
        String result = StringEscapeUtils.escapeHtml(input);
        Assert.assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", result);
    }

    //--------------------------------------------------------------------
    // escapeHtml(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtmlWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeHtml(null, "abc");
    }

    @Test
    public void testEscapeHtmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, null);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeHtmlWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeHtml(writer, "<a>");
        Assert.assertEquals("&lt;a&gt;", writer.toString());
    }

    //--------------------------------------------------------------------
    // unescapeHtml(String)
    //--------------------------------------------------------------------
    @Test
    public void testUnescapeHtml_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtml_emptyString_returnsEmpty() {
        Assert.assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test
    public void testUnescapeHtml_normalString_returnsUnescaped() {
        String input = "&lt;Fran&ccedil;ais&gt;";
        String result = StringEscapeUtils.unescapeHtml(input);
        Assert.assertEquals("<Fran\u00e7ais>", result);
    }

    @Test
    public void testUnescapeHtml_unrecognizedEntity_leftAsIs() {
        String input = "&gt;&zzzz;x";
        String result = StringEscapeUtils.unescapeHtml(input);
        Assert.assertEquals(">&zzzz;x", result);
    }

    //--------------------------------------------------------------------
    // unescapeHtml(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtmlWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeHtml(null, "abc");
    }

    @Test
    public void testUnescapeHtmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, null);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeHtmlWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeHtml(writer, "&amp;");
        Assert.assertEquals("&", writer.toString());
    }

    //--------------------------------------------------------------------
    // escapeXml(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXmlWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.escapeXml(null, "abc");
    }

    @Test
    public void testEscapeXmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, null);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeXmlWriter_normalString_writesEscaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "<a>");
        Assert.assertEquals("&lt;a&gt;", writer.toString());
    }

    //--------------------------------------------------------------------
    // escapeXml(String)
    //--------------------------------------------------------------------
    @Test
    public void testEscapeXml_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void testEscapeXml_emptyString_returnsEmpty() {
        Assert.assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test
    public void testEscapeXml_normalString_returnsEscaped() {
        String input = "\"bread\" & \"butter\"";
        String result = StringEscapeUtils.escapeXml(input);
        Assert.assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", result);
    }

    @Test
    public void testEscapeXml_apostrophe_returnsEscaped() {
        String result = StringEscapeUtils.escapeXml("it's");
        Assert.assertEquals("it&apos;s", result);
    }

    //--------------------------------------------------------------------
    // unescapeXml(Writer, String)
    //--------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXmlWriter_nullWriter_throwsException() throws IOException {
        StringEscapeUtils.unescapeXml(null, "abc");
    }

    @Test
    public void testUnescapeXmlWriter_nullString_noEffect() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, null);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeXmlWriter_normalString_writesUnescaped() throws IOException {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, "&lt;a&gt;");
        Assert.assertEquals("<a>", writer.toString());
    }

    //--------------------------------------------------------------------
    // unescapeXml(String)
    //--------------------------------------------------------------------
    @Test
    public void testUnescapeXml_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void testUnescapeXml_emptyString_returnsEmpty() {
        Assert.assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test
    public void testUnescapeXml_normalString_returnsUnescaped() {
        String input = "&lt;a&gt;&amp;&apos;&quot;";
        String result = StringEscapeUtils.unescapeXml(input);
        Assert.assertEquals("<a>&'\"", result);
    }

    //--------------------------------------------------------------------
    // escapeSql(String)
    //--------------------------------------------------------------------
    @Test
    public void testEscapeSql_null_returnsNull() {
        Assert.assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSql_emptyString_returnsEmpty() {
        Assert.assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSql_normalString_returnsEscaped() {
        String result = StringEscapeUtils.escapeSql("McHale's Navy");
        Assert.assertEquals("McHale''s Navy", result);
    }

    @Test
    public void testEscapeSql_noQuotes_returnsSame() {
        String result = StringEscapeUtils.escapeSql("no quotes here");
        Assert.assertEquals("no quotes here", result);
    }

    @Test
    public void testEscapeSql_multipleQuotes_returnsEscaped() {
        String result = StringEscapeUtils.escapeSql("''");
        Assert.assertEquals("''''", result);
    }
}
