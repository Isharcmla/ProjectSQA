package com.fasterxml.jackson.core.json;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private UTF8StreamJsonParser createParser(byte[] input, int features, int bufSize) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot(12345).makeChild(JsonFactory.Feature.collectDefaults());
        InputStream in = new ByteArrayInputStream(input);
        byte[] buffer = new byte[Math.max(bufSize, 16)];
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, buffer, 0, 0, true);
    }

    private UTF8StreamJsonParser createParser(String json) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), 0, 4000);
    }

    private UTF8StreamJsonParser createParser(String json, int features) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), features, 4000);
    }

    private UTF8StreamJsonParser createParserWithSmallBuffer(String json, int features) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), features, 16);
    }

    @Test
    public void testCodecAndInputSource() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        assertNull(p.getCodec());
        assertNotNull(p.getInputSource());

        ObjectCodec mockCodec = null;
        p.setCodec(mockCodec);
        assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        byte[] input = "{\"a\":1}   ".getBytes(StandardCharsets.UTF_8);
        UTF8StreamJsonParser p = new UTF8StreamJsonParser(ctxt, 0, null, null, sym, input, 0, input.length, false);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = p.releaseBuffered(baos);
        assertEquals(input.length, count);
        assertArrayEquals(input, baos.toByteArray());

        assertEquals(0, p.releaseBuffered(baos));
        p.close();
    }

    @Test
    public void testBasicTokensAndStructure() throws IOException {
        String json = "{\n" +
                "  \"str\": \"hello world\",\n" +
                "  \"num\": 12345,\n" +
                "  \"neg\": -987,\n" +
                "  \"float\": 12.34e+2,\n" +
                "  \"negFloat\": -0.5E-3,\n" +
                "  \"boolT\": true,\n" +
                "  \"boolF\": false,\n" +
                "  \"nil\": null,\n" +
                "  \"arr\": [1, true, \"item\"]\n" +
                "}";

        UTF8StreamJsonParser p = createParser(json);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertTrue(p.isExpectedStartObjectToken());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("str", p.getCurrentName());
        assertEquals("str", p.getText());
        assertNotNull(p.getTextCharacters());
        assertEquals(3, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello world", p.getText());
        assertEquals("hello world", p.getValueAsString());
        assertEquals("hello world", p.getValueAsString("default"));

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("num", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
        assertEquals(12345, p.getValueAsInt());
        assertEquals(12345, p.getValueAsInt(1));
        assertEquals("12345", p.getText());
        assertEquals(5, p.getTextLength());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-987, p.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1234.0, p.getDoubleValue(), 0.001);
        assertEquals(1234, p.getValueAsInt());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-0.0005, p.getDoubleValue(), 0.000001);

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(Boolean.TRUE, p.nextBooleanValue()); // null because current is not FIELD_NAME, next will be checked

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertTrue(p.isExpectedStartArrayToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testFieldNamesOfVariousLengths() throws IOException {
        String json = "{" +
                "\"\": 0," +
                "\"a\": 1," +
                "\"ab\": 2," +
                "\"abc\": 3," +
                "\"abcd\": 4," +
                "\"abcde\": 5," +
                "\"abcdef\": 6," +
                "\"abcdefg\": 7," +
                "\"abcdefgh\": 8," +
                "\"abcdefghi\": 9," +
                "\"abcdefghij\": 10," +
                "\"abcdefghijk\": 11," +
                "\"abcdefghijkl\": 12," +
                "\"abcdefghijklm\": 13," +
                "\"abcdefghijklmnopqrstuvwxyz0123456789_very_long_name_to_grow_quad_buffer_properly\": 14" +
                "}";

        UTF8StreamJsonParser p = createParser(json);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());

        String[] names = {
                "", "a", "ab", "abc", "abcd",
                "abcde", "abcdef", "abcdefg", "abcdefgh",
                "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl",
                "abcdefghijklm",
                "abcdefghijklmnopqrstuvwxyz0123456789_very_long_name_to_grow_quad_buffer_properly"
        };

        for (int i = 0; i < names.length; i++) {
            assertEquals(names[i], p.nextFieldName());
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testFieldNamesEscapedAndUtf8() throws IOException {
        String json = "{" +
                "\"a\\\"b\": 1," +
                "\"name\\\\\": 2," +
                "\"\\u0041\\u0042\": 3," +
                "\"\u00E9\u07FF\u4E16\uD83D\uDE00\": 4" +
                "}";

        UTF8StreamJsonParser p = createParser(json);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());

        assertEquals("a\"b", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        assertEquals("name\\", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        assertEquals("AB", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        assertEquals("\u00E9\u07FF\u4E16\uD83D\uDE00", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testNextFieldNameWithSerializableString() throws IOException {
        String json = "{\"first\": 1, \"second\": 2, \"third\": 3}";
        UTF8StreamJsonParser p = createParser(json);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertTrue(p.nextFieldName(new SerializedString("first")));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        assertFalse(p.nextFieldName(new SerializedString("notSecond")));
        assertEquals("second", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        assertTrue(p.nextFieldName(new SerializedString("third")));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        assertFalse(p.nextFieldName(new SerializedString("third"))); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT, p.currentToken());
        p.close();
    }

    @Test
    public void testNextOptimizedMethods() throws IOException {
        String json = "{\"str\":\"hello\", \"i\":42, \"l\":99999999999, \"b\":true, \"b2\":false, \"arr\":[]}";
        UTF8StreamJsonParser p = createParser(json);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());

        assertEquals("str", p.nextFieldName());
        assertEquals("hello", p.nextTextValue());

        assertEquals("i", p.nextFieldName());
        assertEquals(42, p.nextIntValue(0));

        assertEquals("l", p.nextFieldName());
        assertEquals(99999999999L, p.nextLongValue(0L));

        assertEquals("b", p.nextFieldName());
        assertEquals(Boolean.TRUE, p.nextBooleanValue());

        assertEquals("b2", p.nextFieldName());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());

        assertEquals("arr", p.nextFieldName());
        assertNull(p.nextTextValue()); // returns null and advances to START_ARRAY
        assertEquals(JsonToken.START_ARRAY, p.currentToken());

        p.close();
    }

    @Test
    public void testRootValuesAndSeparators() throws IOException {
        String json = "123\n456\r\n789\t\"str\"\r'apos'";
        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        UTF8StreamJsonParser p = createParser(json, features);

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(456, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(789, p.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("str", p.getText());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("apos", p.getText());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testLeadingZeroesFeature() throws IOException {
        String json = "0 007 0";
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        UTF8StreamJsonParser p = createParser(json, features);

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());

        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroesDisabled() throws IOException {
        String json = "007";
        UTF8StreamJsonParser p = createParser(json, 0);
        p.nextToken();
    }

    @Test
    public void testNonStandardNumbers() throws IOException {
        String json = "[NaN, Infinity, +INF, -Infinity, -INF]";
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        UTF8StreamJsonParser p = createParser(json, features);

        assertEquals(JsonToken.START_ARRAY, p.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testComments() throws IOException {
        String json = "{\n" +
                "  // Line comment\n" +
                "  \"a\": /* C-comment */ 1,\n" +
                "  # YAML comment\n" +
                "  \"b\": 2\n" +
                "}";

        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        UTF8StreamJsonParser p = createParser(json, features);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals("a", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("b", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testUnquotedAndSingleQuotedFieldNames() throws IOException {
        String json = "{\n" +
                "  'single': 1,\n" +
                "  unquoted: 2,\n" +
                "  $dollar_123: 3\n" +
                "}";

        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask() | JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        UTF8StreamJsonParser p = createParser(json, features);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals("single", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("unquoted", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("$dollar_123", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testStringEscapesAndUtf8Characters() throws IOException {
        String json = "[\"\\b\\t\\n\\f\\r\\\"\\\\\\/\\u0041\", \"\u00A2\", \"\u20AC\", \"\uD83D\uDE00\"]";
        UTF8StreamJsonParser p = createParser(json);

        assertEquals(JsonToken.START_ARRAY, p.nextToken());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("\b\t\n\f\r\"\\/A", p.getText());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("\u00A2", p.getText());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("\u20AC", p.getText());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("\uD83D\uDE00", p.getText());

        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testSkipStringFastPath() throws IOException {
        String json = "[\"skipped string 1\", \"\u00A2 2-byte\", \"\u20AC 3-byte\", \"\uD83D\uDE00 4-byte\", 123]";
        UTF8StreamJsonParser p = createParser(json);

        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        // Skip through nextToken without accessing getText()
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testBase64Decoding() throws IOException {
        byte[] original = "Jackson JSON Parser Base64 Test Binary Payload!".getBytes(StandardCharsets.UTF_8);
        String base64 = Base64Variants.MIME.encode(original);
        String json = "[\"" + base64 + "\", \"\"]";

        UTF8StreamJsonParser p = createParser(json);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] decoded = p.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(original, decoded);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        int read = p.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(0, read);
        assertEquals(0, baos.size());

        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testBase64ReadBinaryValue() throws IOException {
        byte[] original = "Testing Base64 incremental stream reading with multiple blocks 1234567890".getBytes(StandardCharsets.UTF_8);
        String base64 = Base64Variants.MIME.encode(original);
        String json = "\"" + base64 + "\"";

        UTF8StreamJsonParser p = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = p.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(original.length, count);
        assertArrayEquals(original, baos.toByteArray());

        p.close();
    }

    @Test
    public void testLocationTracking() throws IOException {
        String json = "{\n  \"key\":\n    123\n}";
        UTF8StreamJsonParser p = createParser(json);

        JsonLocation loc0 = p.getCurrentLocation();
        assertEquals(1, loc0.getLineNr());

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        JsonLocation tokenLoc = p.getTokenLocation();
        assertEquals(2, tokenLoc.getLineNr());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(3, p.getCurrentLocation().getLineNr());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testSmallBufferSplitAcrossBoundaries() throws IOException {
        String json = "{\"longKey1234567890\": \"longValue1234567890abcdefghijklmnopqrstuvwxyz\", \"float\": -123456789.987654e-2}";
        UTF8StreamJsonParser p = createParserWithSmallBuffer(json, 0);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals("longKey1234567890", p.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("longValue1234567890abcdefghijklmnopqrstuvwxyz", p.getText());
        assertEquals("float", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-123456789.987654e-2, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testGrowArrayBy() {
        int[] original = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 5);
        assertEquals(8, grown.length);
        assertEquals(1, grown[0]);
        assertEquals(2, grown[1]);
        assertEquals(3, grown[2]);

        int[] fromNull = UTF8StreamJsonParser.growArrayBy(null, 4);
        assertNotNull(fromNull);
        assertEquals(4, fromNull.length);
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedArrayEnd() throws IOException {
        UTF8StreamJsonParser p = createParser("}");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedObjectEnd() throws IOException {
        UTF8StreamJsonParser p = createParser("]");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColon() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"key\" 123}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingComma() throws IOException {
        UTF8StreamJsonParser p = createParser("[1 2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumberFollowedByMinus() throws IOException {
        UTF8StreamJsonParser p = createParser("-a");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidFloatNoDigitsAfterDot() throws IOException {
        UTF8StreamJsonParser p = createParser("12.");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidFloatNoDigitsAfterExp() throws IOException {
        UTF8StreamJsonParser p = createParser("12e");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeChar() throws IOException {
        UTF8StreamJsonParser p = createParser("\"\\z\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedValueToken() throws IOException {
        UTF8StreamJsonParser p = createParser("?");
        p.nextToken();
    }

    @Test
    public void testEmptyInputs() throws IOException {
        UTF8StreamJsonParser p = createParser("");
        assertNull(p.nextToken());
        p.close();

        p = createParser("   \t\r\n");
        assertNull(p.nextToken());
        p.close();
    }
}
