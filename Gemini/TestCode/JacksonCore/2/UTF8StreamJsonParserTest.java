package com.fasterxml.jackson.core.json;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8StreamJsonParserTest {

    private UTF8StreamJsonParser createParser(String json, int features, boolean managed) {
        byte[] docBytes = json.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(docBytes);
        IOContext ctxt = new IOContext(new BufferRecycler(), "testSource", managed);
        BytesToNameCanonicalizer sym = BytesToNameCanonicalizer.createRoot();
        byte[] inputBuffer = new byte[1024];
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, inputBuffer, 0, 0, true);
    }

    private UTF8StreamJsonParser createParser(String json) {
        return createParser(json, 0, false);
    }

    private UTF8StreamJsonParser createParserWithBuffer(byte[] buffer, int start, int end, InputStream in) {
        IOContext ctxt = new IOContext(new BufferRecycler(), "testSource", false);
        BytesToNameCanonicalizer sym = BytesToNameCanonicalizer.createRoot();
        return new UTF8StreamJsonParser(ctxt, 0, in, null, sym, buffer, start, end, true);
    }

    @Test
    public void testGetAndSetCodec_customCodec_returnsCorrectInstance() {
        UTF8StreamJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());

        ObjectCodec mockCodec = new ObjectCodec() {
            @Override
            public Version version() { return Version.unknownVersion(); }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) { return null; }
            @Override
            public void writeValue(JsonGenerator gen, Object value) {}
            @Override
            public <T extends TreeNode> T readTree(JsonParser p) { return null; }
            @Override
            public void writeTree(JsonGenerator gen, TreeNode tree) {}
            @Override
            public TreeNode createObjectNode() { return null; }
            @Override
            public TreeNode createArrayNode() { return null; }
            @Override
            public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override
            public <T> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
        };

        parser.setCodec(mockCodec);
        Assert.assertSame(mockCodec, parser.getCodec());
    }

    @Test
    public void testGetInputSource_validStream_returnsInputStream() {
        byte[] bytes = "[1, 2]".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        IOContext ctxt = new IOContext(new BufferRecycler(), "src", false);
        BytesToNameCanonicalizer sym = BytesToNameCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym, new byte[64], 0, 0, false);

        Assert.assertSame(in, parser.getInputSource());
    }

    @Test
    public void testReleaseBuffered_withRemainingBytes_writesToStream() throws IOException {
        byte[] buffer = "hello world".getBytes(StandardCharsets.UTF_8);
        UTF8StreamJsonParser parser = createParserWithBuffer(buffer, 0, buffer.length, null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);

        Assert.assertEquals(buffer.length, released);
        Assert.assertArrayEquals(buffer, out.toByteArray());
        Assert.assertEquals(0, parser.releaseBuffered(out));
    }

    @Test
    public void testGrowArrayBy_normalAndNull_returnsGrownArray() {
        int[] original = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 2);
        Assert.assertEquals(5, grown.length);
        Assert.assertEquals(1, grown[0]);
        Assert.assertEquals(2, grown[1]);
        Assert.assertEquals(3, grown[2]);

        int[] fromNull = UTF8StreamJsonParser.growArrayBy(null, 4);
        Assert.assertEquals(4, fromNull.length);
    }

    @Test
    public void testParseEmptyDocument_returnsNull() throws IOException {
        UTF8StreamJsonParser parser = createParser("");
        Assert.assertNull(parser.nextToken());
        Assert.assertNull(parser.getText());
        Assert.assertNull(parser.getTextCharacters());
        Assert.assertEquals(0, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());
        parser.close();
    }

    @Test
    public void testParseObjectAndArray_validJson_traversesSuccessfully() throws IOException {
        String json = "{\"name\": \"value\", \"arr\": [1, 2, true, false, null]}";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("name", parser.getText());
        Assert.assertEquals("name", parser.getCurrentName());
        Assert.assertEquals("name", new String(parser.getTextCharacters(), 0, parser.getTextLength()));
        Assert.assertEquals(4, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("value", parser.getText());
        Assert.assertEquals("value", parser.getValueAsString());
        Assert.assertEquals("value", parser.getValueAsString("default"));
        Assert.assertEquals(5, parser.getTextLength());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("arr", parser.getText());

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("1", parser.getText());
        Assert.assertEquals(1, parser.getIntValue());
        Assert.assertEquals(1L, parser.getLongValue());
        Assert.assertEquals(1, parser.getTextLength());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(2, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals("true", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        Assert.assertEquals("false", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals("null", parser.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testParseNumbers_variousFormats_parsedCorrectly() throws IOException {
        String json = "[0, -0, 123456789, -987654321, 0.123, -45.67, 1e5, 2E-3, -3.14E+2, 0.0]";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("0", parser.getText());
        Assert.assertEquals(0, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("-0", parser.getText());
        Assert.assertEquals(0, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("123456789", parser.getText());
        Assert.assertEquals(123456789, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("-987654321", parser.getText());
        Assert.assertEquals(-987654321L, parser.getLongValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("0.123", parser.getText());
        Assert.assertEquals(0.123, parser.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("-45.67", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("1e5", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("2E-3", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("-3.14E+2", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("0.0", parser.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testParseFieldNames_shortMediumLongAndSpecial() throws IOException {
        String json = "{"
                + "\"a\": 1,"
                + "\"ab\": 2,"
                + "\"abc\": 3,"
                + "\"abcd\": 4,"
                + "\"abcde\": 5,"
                + "\"abcdef\": 6,"
                + "\"abcdefg\": 7,"
                + "\"abcdefgh\": 8,"
                + "\"abcdefghi\": 9,"
                + "\"a_very_long_field_name_exceeding_quad_buffer_capacity_1234567890_test_long\": 10,"
                + "\"\\\"escaped\\\"\": 11,"
                + "\"utf8_\\u0041\\u0042\": 12,"
                + "\"\": 13"
                + "}";
        UTF8StreamJsonParser parser = createParser(json);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        String[] expectedNames = new String[]{
                "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi",
                "a_very_long_field_name_exceeding_quad_buffer_capacity_1234567890_test_long",
                "\"escaped\"", "utf8_AB", ""
        };

        for (int i = 0; i < expectedNames.length; i++) {
            Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            Assert.assertEquals(expectedNames[i], parser.getCurrentName());
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            Assert.assertEquals(i + 1, parser.getIntValue());
        }

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextFieldName_matchedAndUnmatched() throws IOException {
        String json = "{\"id\": 100, \"name\": \"Jackson\", \"flag\": true}";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        SerializedString strId = new SerializedString("id");
        SerializedString strName = new SerializedString("name");
        SerializedString strOther = new SerializedString("other");

        Assert.assertTrue(parser.nextFieldName(strId));
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        Assert.assertEquals(100, parser.nextIntValue(0));

        Assert.assertFalse(parser.nextFieldName(strOther));
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        Assert.assertEquals("name", parser.getCurrentName());
        Assert.assertEquals("Jackson", parser.nextTextValue());

        SerializedString strFlag = new SerializedString("flag");
        Assert.assertTrue(parser.nextFieldName(strFlag));
        Assert.assertTrue(parser.nextBooleanValue());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextSpecializedValues_variousCases() throws IOException {
        String json = "{\"s\": \"hello\", \"i\": 42, \"l\": 9876543210, \"b1\": true, \"b2\": false, \"arr\": [1]}";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("hello", parser.nextTextValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(42, parser.nextIntValue(-1));

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(9876543210L, parser.nextLongValue(-1L));

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertNull(parser.nextTextValue());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken());

        Assert.assertEquals(1, parser.nextIntValue(0));
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testStringEscapesAndUtf8Characters() throws IOException {
        String json = "[\"\\\"\\\\\\/\\b\\f\\n\\r\\t\\u0041\", \"2-byte: \u00A2 \u00E9\", \"3-byte: \u4E2D\u6587\", \"4-byte: \uD83D\uDE00\"]";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\"\\/\b\f\n\r\tA", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("2-byte: \u00A2 \u00E9", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("3-byte: \u4E2D\u6587", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("4-byte: \uD83D\uDE00", parser.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testSkipString_skipsEfficiently() throws IOException {
        String json = "[\"skipped string with \\n escapes and \u4E2D\u6587 \uD83D\uDE00 content\", 123]";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testComments_cAndCppAndYamlComments() throws IOException {
        int features = 0;
        features |= JsonParser.Feature.ALLOW_COMMENTS.getMask();
        features |= JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

        String json = "/* header comment */\n"
                + "{\n"
                + "  // single line comment\n"
                + "  \"key\": /* inline */ \"value\", \n"
                + "  # yaml comment\n"
                + "  \"num\": 1\n"
                + "/* trailing comment */\n"
                + "}";

        UTF8StreamJsonParser parser = createParser(json, features, false);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("key", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("value", parser.getText());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("num", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testAllowSingleQuotesAndUnquotedFieldNames() throws IOException {
        int features = 0;
        features |= JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        features |= JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

        String json = "{ unquoted_key: 'single quoted string \\' with escape \u00E9', 'single_name': 123 }";
        UTF8StreamJsonParser parser = createParser(json, features, false);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("unquoted_key", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("single quoted string ' with escape \u00E9", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("single_name", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testAllowNonNumericNumbers_nanAndInfinity() throws IOException {
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        String json = "[NaN, Infinity, +Infinity, -Infinity, +INF, -INF]";
        UTF8StreamJsonParser parser = createParser(json, features, false);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertTrue(Double.isNaN(parser.getDoubleValue()));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testAllowNumericLeadingZeros() throws IOException {
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        String json = "[007, 0123]";
        UTF8StreamJsonParser parser = createParser(json, features, false);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(7, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testBinaryValues_getAndReadBinaryValue() throws IOException {
        byte[] rawData = "Testing base64 binary content in UTF8 parser!".getBytes(StandardCharsets.UTF_8);
        Base64Variant variant = Base64Variants.MIME;
        String b64 = variant.encode(rawData);
        String json = "[\"" + b64 + "\", \"" + b64 + "\"]";

        UTF8StreamJsonParser parser = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded1 = parser.getBinaryValue(variant);
        Assert.assertArrayEquals(rawData, decoded1);

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(variant, out);
        Assert.assertEquals(rawData.length, count);
        Assert.assertArrayEquals(rawData, out.toByteArray());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testBinaryValues_unpaddedAndWithWhitespace() throws IOException {
        Base64Variant noPadding = Base64Variants.MODIFIED_FOR_URL;
        byte[] rawData = "Quick brown fox jumps".getBytes(StandardCharsets.UTF_8);
        String b64 = noPadding.encode(rawData);
        String json = "[\"  " + b64 + "  \"]";

        UTF8StreamJsonParser parser = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded = parser.getBinaryValue(noPadding);
        Assert.assertArrayEquals(rawData, decoded);
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_nonStringToken_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[123]");
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedArrayClosing_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("}");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedObjectClosing_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("]");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColon_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"key\" \"value\"}");
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingComma_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1 2]");
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroWithoutFeature_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[012]");
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnrecognizedToken_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[unknownToken]");
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharacter_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("@");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeSequence_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\z\"");
        parser.nextToken();
        parser.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisabled_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("// comment\n 123", 0, false);
        parser.nextToken();
    }

    @Test
    public void testCloseResourceManaged_closesUnderlyingStream() throws IOException {
        final boolean[] closed = new boolean[]{false};
        InputStream in = new InputStream() {
            private final ByteArrayInputStream inner = new ByteArrayInputStream("123".getBytes(StandardCharsets.UTF_8));
            @Override
            public int read() throws IOException { return inner.read(); }
            @Override
            public int read(byte[] b, int off, int len) throws IOException { return inner.read(b, off, len); }
            @Override
            public void close() throws IOException { closed[0] = true; inner.close(); }
        };

        IOContext ctxt = new IOContext(new BufferRecycler(), "managedSrc", true);
        BytesToNameCanonicalizer sym = BytesToNameCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym, new byte[64], 0, 0, true);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.close();
        Assert.assertTrue(closed[0]);
    }
}
