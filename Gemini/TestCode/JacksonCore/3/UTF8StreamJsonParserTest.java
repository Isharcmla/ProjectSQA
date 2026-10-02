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
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class UTF8StreamJsonParserTest {

    private UTF8StreamJsonParser createParser(String json) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), 0);
    }

    private UTF8StreamJsonParser createParser(String json, int features) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), features);
    }

    private UTF8StreamJsonParser createParser(byte[] bytes, int features) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        BytesToNameCanonicalizer sym = BytesToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        byte[] inputBuf = new byte[bytes.length + 64];
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, inputBuf, 0, 0, true);
    }

    private UTF8StreamJsonParser createParserWithBuffer(byte[] bytes, int features, int bufSize, boolean bufferRecyclable) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        BytesToNameCanonicalizer sym = BytesToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        byte[] inputBuf = new byte[bufSize];
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, inputBuf, 0, 0, bufferRecyclable);
    }

    @Test
    public void testGrowArrayBy_nullAndNonNull() {
        int[] arr1 = UTF8StreamJsonParser.growArrayBy(null, 5);
        Assert.assertNotNull(arr1);
        Assert.assertEquals(5, arr1.length);

        int[] arr2 = UTF8StreamJsonParser.growArrayBy(new int[]{1, 2}, 3);
        Assert.assertEquals(5, arr2.length);
        Assert.assertEquals(1, arr2[0]);
        Assert.assertEquals(2, arr2[1]);
    }

    @Test
    public void testLifecycle_codecAndInputSource() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());
        ObjectCodec dummyCodec = new ObjectCodec() {
            @Override
            public Version version() { return Version.unknownVersion(); }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> T readValue(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
            @Override
            public <T> T readValue(JsonParser p, ResolvedType valueType) { return null; }
            @Override
            public <T extends TreeNode> T readTree(JsonParser p) { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, ResolvedType valueType) { return null; }
            @Override
            public void writeValue(JsonGenerator gen, Object value) {}
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
        parser.setCodec(dummyCodec);
        Assert.assertSame(dummyCodec, parser.getCodec());
        Assert.assertNotNull(parser.getInputSource());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Assert.assertEquals(0, parser.releaseBuffered(out));
        parser.close();
        parser.close(); // idempotent
    }

    @Test
    public void testReleaseBuffered_withRemainingBytes() throws IOException {
        byte[] bytes = "12345".getBytes(StandardCharsets.UTF_8);
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        BytesToNameCanonicalizer sym = BytesToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, null, null, sym, bytes, 1, 4, false);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(3, count);
        Assert.assertArrayEquals("234".getBytes(StandardCharsets.UTF_8), out.toByteArray());
    }

    @Test
    public void testBasicTokensAndTextAccessors() throws IOException {
        String json = "{\"id\": 123, \"flag\": true, \"other\": null, \"fl\": 45.67, \"neg\": -89, \"arr\": [false, \"hello\"]}";
        UTF8StreamJsonParser p = createParser(json);

        Assert.assertNull(p.getText());
        Assert.assertNull(p.getTextCharacters());
        Assert.assertEquals(0, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("{", p.getText());
        Assert.assertNotNull(p.getTextCharacters());
        Assert.assertEquals(1, p.getTextLength());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("id", p.getText());
        Assert.assertEquals("id", p.getCurrentName());
        Assert.assertEquals("id", new String(p.getTextCharacters(), p.getTextOffset(), p.getTextLength()));
        // Call getTextCharacters again to test cached _nameCopyBuffer
        Assert.assertEquals("id", new String(p.getTextCharacters(), p.getTextOffset(), p.getTextLength()));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("123", p.getText());
        Assert.assertEquals(123, p.getIntValue());
        Assert.assertEquals(123L, p.getLongValue());
        Assert.assertEquals("123", p.getValueAsString());
        Assert.assertEquals("123", p.getValueAsString("def"));
        Assert.assertEquals(3, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        Assert.assertEquals("true", p.getText());
        Assert.assertEquals(Boolean.TRUE, p.nextBooleanValue()); // will return null/next token handling

        p.close();
    }

    @Test
    public void testNextFieldName_andNextValues() throws IOException {
        String json = "{\"str\": \"world\", \"num\": 42, \"lg\": 9999999999, \"b\": true, \"b2\": false, \"arr\": [1]}";
        UTF8StreamJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());

        SerializedString strField = new SerializedString("str");
        SerializedString wrongField = new SerializedString("wrong");

        Assert.assertTrue(p.nextFieldName(strField));
        Assert.assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
        Assert.assertEquals("world", p.nextTextValue());

        SerializedString numField = new SerializedString("num");
        Assert.assertTrue(p.nextFieldName(numField));
        Assert.assertEquals(42, p.nextIntValue(0));

        SerializedString lgField = new SerializedString("lg");
        Assert.assertTrue(p.nextFieldName(lgField));
        Assert.assertEquals(9999999999L, p.nextLongValue(0L));

        SerializedString bField = new SerializedString("b");
        Assert.assertTrue(p.nextFieldName(bField));
        Assert.assertEquals(Boolean.TRUE, p.nextBooleanValue());

        SerializedString b2Field = new SerializedString("b2");
        Assert.assertTrue(p.nextFieldName(b2Field));
        Assert.assertEquals(Boolean.FALSE, p.nextBooleanValue());

        SerializedString arrField = new SerializedString("arr");
        Assert.assertTrue(p.nextFieldName(arrField));
        Assert.assertNull(p.nextTextValue()); // array value token

        Assert.assertEquals(1, p.nextIntValue(0));
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNextFieldName_notInObjectAndMismatches() throws IOException {
        String json = "[\"val1\", \"val2\"]";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken(); // START_ARRAY
        SerializedString field = new SerializedString("field");
        Assert.assertFalse(p.nextFieldName(field)); // not in object
        p.close();

        // Object with wrong name match
        String json2 = "{\"foo\": 123}";
        UTF8StreamJsonParser p2 = createParser(json2);
        p2.nextToken();
        Assert.assertFalse(p2.nextFieldName(new SerializedString("bar")));
        Assert.assertEquals(JsonToken.FIELD_NAME, p2.getCurrentToken());
        Assert.assertEquals("foo", p2.getCurrentName());
        p2.close();
    }

    @Test
    public void testNumberParsing_integersAndFloats() throws IOException {
        String json = "0 -0 123 -456 0.5 -0.5 12.34e2 -56.78E-3 1e+2 0e1 10000000000000000000000000000000000";
        UTF8StreamJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("0", p.getText());
        Assert.assertEquals(0, p.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("-0", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("123", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("-456", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("0.5", p.getText());
        Assert.assertEquals(0.5, p.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("-0.5", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("12.34e2", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("-56.78E-3", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("1e+2", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("0e1", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());

        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNumberParsing_leadingZeroesFeature() throws IOException {
        int feat = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        UTF8StreamJsonParser p = createParser("007 000 0123", feat);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("7", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("0", p.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("123", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNumberParsing_leadingZeroesNotAllowed() throws IOException {
        UTF8StreamJsonParser p = createParser("007");
        p.nextToken();
    }

    @Test
    public void testNumberParsing_nonNumericNumbers() throws IOException {
        int feat = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        UTF8StreamJsonParser p = createParser("NaN Infinity +Infinity -Infinity +INF -INF", feat);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertTrue(Double.isNaN(p.getDoubleValue()));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);
        p.close();
    }

    @Test
    public void testFieldNames_lengthsAndCanonicalization() throws IOException {
        // Names: 0 byte "", 1-4 bytes, 5-8 bytes, >8 bytes, >16 bytes
        String json = "{"
                + "\"\": 0,"
                + "\"a\": 1,"
                + "\"ab\": 2,"
                + "\"abc\": 3,"
                + "\"abcd\": 4,"
                + "\"abcde\": 5,"
                + "\"abcdef\": 6,"
                + "\"abcdefg\": 7,"
                + "\"abcdefgh\": 8,"
                + "\"abcdefghi\": 9,"
                + "\"abcdefghijklmnopqrstuvwxyz0123456789_very_long_name_to_grow_quad_buffer_properly\": 10"
                + "}";
        UTF8StreamJsonParser p = createParser(json);
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());

        String[] expectedNames = new String[]{
                "", "a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi",
                "abcdefghijklmnopqrstuvwxyz0123456789_very_long_name_to_grow_quad_buffer_properly"
        };

        for (int i = 0; i < expectedNames.length; i++) {
            Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
            Assert.assertEquals(expectedNames[i], p.getCurrentName());
            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            Assert.assertEquals(i, p.getIntValue());
        }
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testFieldNames_escapedAndMultiByteUtf8() throws IOException {
        String json = "{"
                + "\"escaped\\n\\t\\u0041\": 1,"
                + "\"utf2_\\u00A2\": 2,"
                + "\"utf3_\\u20AC\": 3,"
                + "\"utf4_\uD83D\uDE00\": 4"
                + "}";
        UTF8StreamJsonParser p = createParser(json);
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("escaped\n\tA", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("utf2_\u00A2", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("utf3_\u20AC", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("utf4_\uD83D\uDE00", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testUnquotedAndSingleQuotedNamesAndStrings() throws IOException {
        int feat = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask()
                | JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

        String json = "{ unquoted: 'single quoted string', 'singleQuotedName': 'another\\'s string', empty: '' }";
        UTF8StreamJsonParser p = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("unquoted", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("single quoted string", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("singleQuotedName", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("another's string", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("empty", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("", p.getText());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testStringEscapes_allStandard() throws IOException {
        String json = "\"\\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041 \u00A2 \u20AC \uD83D\uDE00\"";
        UTF8StreamJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        String expected = "\" \\ / \b \f \n \r \t A \u00A2 \u20AC \uD83D\uDE00";
        Assert.assertEquals(expected, p.getText());
        p.close();
    }

    @Test
    public void testSkipString_variousContents() throws IOException {
        String json = "[\"simple string\", \"\\\" \\n \\u0041\", \"\u00A2 \u20AC \uD83D\uDE00\", 123]";
        UTF8StreamJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        // Skip strings without calling getText()
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testComments_cAndCppAndYaml() throws IOException {
        int feat = JsonParser.Feature.ALLOW_COMMENTS.getMask()
                | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

        String json = "/* block comment */\n"
                + "// line comment\n"
                + "# yaml comment\n"
                + "{\n"
                + "  /* comment inside */ \"a\" /* c */ : /* c */ 1 // line\n"
                + "}";
        UTF8StreamJsonParser p = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("a", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testLocations() throws IOException {
        String json = "{\n  \"a\": 123\n}";
        UTF8StreamJsonParser p = createParser(json);
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        JsonLocation tokLoc = p.getTokenLocation();
        JsonLocation curLoc = p.getCurrentLocation();
        Assert.assertNotNull(tokLoc);
        Assert.assertNotNull(curLoc);
        Assert.assertEquals(1, tokLoc.getLineNr());
        Assert.assertEquals(1, tokLoc.getColumnNr());
        p.close();
    }

    @Test
    public void testBase64BinaryParsing_fullAndIncremental() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Base64Variant b64 = Base64Variants.MIME;
        String b64Str = b64.encode(data);
        String json = "[\"" + b64Str + "\", \"" + b64Str + "\"]";

        UTF8StreamJsonParser p = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        // 1. Get binary directly when token is incomplete
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] decoded1 = p.getBinaryValue(b64);
        Assert.assertArrayEquals(data, decoded1);

        // 2. Read binary using stream when token is incomplete
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.readBinaryValue(b64, out);
        Assert.assertEquals(data.length, count);
        Assert.assertArrayEquals(data, out.toByteArray());

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testBase64BinaryParsing_paddingVariants() throws IOException {
        byte[] data1 = new byte[]{1};
        byte[] data2 = new byte[]{1, 2};
        byte[] data3 = new byte[]{1, 2, 3};

        Base64Variant b64 = Base64Variants.MIME;
        String json = "[\"" + b64.encode(data1) + "\", \"" + b64.encode(data2) + "\", \"" + b64.encode(data3) + "\"]";

        UTF8StreamJsonParser p = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertArrayEquals(data1, p.getBinaryValue(b64));

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        p.readBinaryValue(b64, out);
        Assert.assertArrayEquals(data2, out.toByteArray());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertArrayEquals(data3, p.getBinaryValue(b64));

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testSmallBuffer_loadToHaveAtLeastAndBoundaryCrossing() throws IOException {
        String json = "{\"longFieldName123456789\": 1234567890, \"str\": \"a_very_long_string_that_crosses_buffer_boundary\"}";
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);

        // Use a tiny buffer of 8 bytes to force repeated loadMore and loadToHaveAtLeast
        UTF8StreamJsonParser p = createParserWithBuffer(bytes, 0, 8, true);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("longFieldName123456789", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1234567890, p.getIntValue());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("str", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("a_very_long_string_that_crosses_buffer_boundary", p.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testException_mismatchedArrayEnd() throws IOException {
        UTF8StreamJsonParser p = createParser("{ ]");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_mismatchedObjectEnd() throws IOException {
        UTF8StreamJsonParser p = createParser("[ }");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_missingColon() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\" 1}");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_missingComma() throws IOException {
        UTF8StreamJsonParser p = createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_invalidNumberDecimalPoint() throws IOException {
        UTF8StreamJsonParser p = createParser("1.");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_invalidNumberExponent() throws IOException {
        UTF8StreamJsonParser p = createParser("1e");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_invalidToken() throws IOException {
        UTF8StreamJsonParser p = createParser("truth");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_invalidEscapeSequence() throws IOException {
        UTF8StreamJsonParser p = createParser("\"\\z\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testException_invalidHexEscapeSequence() throws IOException {
        UTF8StreamJsonParser p = createParser("\"\\u12G4\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testException_unclosedString() throws IOException {
        UTF8StreamJsonParser p = createParser("\"unclosed string");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testException_unclosedComment() throws IOException {
        int feat = JsonParser.Feature.ALLOW_COMMENTS.getMask();
        UTF8StreamJsonParser p = createParser("/* unclosed", feat);
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testException_getBinaryOnNonString() throws IOException {
        UTF8StreamJsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue(Base64Variants.MIME);
    }
}
