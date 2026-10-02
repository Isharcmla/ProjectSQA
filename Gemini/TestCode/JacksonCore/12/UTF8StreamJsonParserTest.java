package com.fasterxml.jackson.core.json;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8StreamJsonParserTest {

    private UTF8StreamJsonParser createParser(String json) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), 0);
    }

    private UTF8StreamJsonParser createParser(String json, int features) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), features);
    }

    private UTF8StreamJsonParser createParser(byte[] input, int features) {
        IOContext ctxt = new IOContext(new BufferRecycler(), input, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        return new UTF8StreamJsonParser(ctxt, features, new ByteArrayInputStream(input), null, sym, input, 0, input.length, false);
    }

    private UTF8StreamJsonParser createParserWithChunkedStream(byte[] input, int features, int chunkSize) {
        IOContext ctxt = new IOContext(new BufferRecycler(), input, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        InputStream in = new InputStream() {
            private int ptr = 0;
            @Override
            public int read() {
                if (ptr < input.length) {
                    return input[ptr++] & 0xFF;
                }
                return -1;
            }
            @Override
            public int read(byte[] b, int off, int len) {
                if (ptr >= input.length) {
                    return -1;
                }
                int toRead = Math.min(len, Math.min(chunkSize, input.length - ptr));
                System.arraycopy(input, ptr, b, off, toRead);
                ptr += toRead;
                return toRead;
            }
        };
        byte[] buf = new byte[chunkSize];
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, buf, 0, 0, true);
    }

    @Test
    public void testGetAndSetCodec_validCodec_returnsCodec() {
        UTF8StreamJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());
        parser.setCodec(null);
        Assert.assertNull(parser.getCodec());
    }

    @Test
    public void testGetInputSource_validStream_returnsInputStream() {
        UTF8StreamJsonParser parser = createParser("{}");
        Assert.assertNotNull(parser.getInputSource());
        Assert.assertTrue(parser.getInputSource() instanceof InputStream);
    }

    @Test
    public void testReleaseBuffered_withRemainingBytes_writesToOutputStream() throws IOException {
        byte[] input = "  {\"key\": 123}".getBytes(StandardCharsets.UTF_8);
        IOContext ctxt = new IOContext(new BufferRecycler(), input, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, new ByteArrayInputStream(input), null, sym, input, 0, input.length, false);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(input.length, count);
        Assert.assertArrayEquals(input, out.toByteArray());

        int countAgain = parser.releaseBuffered(out);
        Assert.assertEquals(0, countAgain);
    }

    @Test
    public void testGrowArrayBy_validArray_returnsExpandedArray() {
        int[] original = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 5);
        Assert.assertEquals(8, grown.length);
        Assert.assertEquals(1, grown[0]);
        Assert.assertEquals(2, grown[1]);
        Assert.assertEquals(3, grown[2]);

        int[] fromNull = UTF8StreamJsonParser.growArrayBy(null, 4);
        Assert.assertEquals(4, fromNull.length);
    }

    @Test
    public void testParseEmptyDocument_returnsNullToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("");
        Assert.assertNull(parser.nextToken());
        Assert.assertNull(parser.getText());
        Assert.assertEquals(0, parser.getTextLength());
        Assert.assertEquals(0, parser.getTextOffset());
        Assert.assertNull(parser.getTextCharacters());
    }

    @Test
    public void testParseSimpleLiterals_booleanAndNull_success() throws IOException {
        UTF8StreamJsonParser parser = createParser("[true, false, null]");
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals("true", parser.getText());
        Assert.assertTrue(parser.nextBooleanValue());

        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        Assert.assertEquals("false", parser.getText());
        Assert.assertFalse(parser.nextBooleanValue());

        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals("null", parser.getText());
        Assert.assertNull(parser.nextBooleanValue());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testParseNumbers_posNegFloatInt_success() throws IOException {
        UTF8StreamJsonParser parser = createParser("[0, 1234567, -42, 3.14159, -0.001, 1e10, 2.5E-3, -1.2e+4]");
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(0, parser.getIntValue());
        Assert.assertEquals(0, parser.getValueAsInt());
        Assert.assertEquals(0, parser.getValueAsInt(99));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1234567, parser.getIntValue());
        Assert.assertEquals(1234567L, parser.nextLongValue(0L));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(-42, parser.getIntValue());
        Assert.assertEquals(-42, parser.nextIntValue(0));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(3.14159, parser.getDoubleValue(), 0.00001);
        Assert.assertEquals(3, parser.getValueAsInt());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(-0.001, parser.getDoubleValue(), 0.000001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(1e10, parser.getDoubleValue(), 1.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(0.0025, parser.getDoubleValue(), 0.00001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(-12000.0, parser.getDoubleValue(), 0.01);

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testParseNonNumericNumbers_enabledFeature_success() throws IOException {
        int feat = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        UTF8StreamJsonParser parser = createParser("[NaN, Infinity, +Infinity, -Infinity, +INF, -INF]", feat);
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
    }

    @Test
    public void testParseLeadingZeroes_enabledFeature_success() throws IOException {
        int feat = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        UTF8StreamJsonParser parser = createParser("[007, 000, 0123]", feat);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(7, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(0, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testParseLeadingZeroes_disabledFeature_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[007]");
        parser.nextToken();
        parser.nextToken();
    }

    @Test
    public void testParseVariousFieldNames_shortMediumLongAndEscaped_success() throws IOException {
        String json = "{\"\": 0, \"a\": 1, \"ab\": 2, \"abc\": 3, \"abcd\": 4, "
                + "\"abcde\": 5, \"abcdef\": 6, \"abcdefg\": 7, \"abcdefgh\": 8, "
                + "\"abcdefghi\": 9, \"abcdefghij\": 10, \"abcdefghijk\": 11, \"abcdefghijkl\": 12, "
                + "\"aLongerFieldNameThatExceedsSixteenBytes\": 13, \"with\\nEscape\\t\": 14, "
                + "\"unicode\\u0041\\u0042\": 15, \"utf8_\\u00e9_\\u4e2d_\\ud83d\\ude00\": 16}";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        String[] expectedNames = new String[]{
                "", "a", "ab", "abc", "abcd",
                "abcde", "abcdef", "abcdefg", "abcdefgh",
                "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl",
                "aLongerFieldNameThatExceedsSixteenBytes", "with\nEscape\t",
                "unicodeAB", "utf8_\u00e9_\u4e2d_\uD83D\uDE00"
        };

        for (int i = 0; i < expectedNames.length; i++) {
            Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            Assert.assertEquals(expectedNames[i], parser.getCurrentName());
            Assert.assertEquals(expectedNames[i], parser.getText());
            Assert.assertEquals(expectedNames[i], parser.getValueAsString());
            Assert.assertEquals(expectedNames[i], parser.getValueAsString("def"));
            Assert.assertEquals(expectedNames[i].length(), parser.getTextLength());
            Assert.assertEquals(0, parser.getTextOffset());
            char[] chars = parser.getTextCharacters();
            Assert.assertEquals(expectedNames[i], new String(chars, 0, parser.getTextLength()));

            Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            Assert.assertEquals(i, parser.getIntValue());
        }

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextFieldNameFastPath_matchesExpectedSerializableString() throws IOException {
        String json = "{\"id\": 10, \"name\": \"test\", \"active\": true, \"count\": 20}";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        SerializedString idStr = new SerializedString("id");
        SerializedString nameStr = new SerializedString("name");
        SerializedString missingStr = new SerializedString("missing");

        Assert.assertTrue(parser.nextFieldName(idStr));
        Assert.assertEquals(10, parser.nextIntValue(0));

        Assert.assertFalse(parser.nextFieldName(missingStr));
        Assert.assertEquals("name", parser.getCurrentName());
        Assert.assertEquals("test", parser.nextTextValue());

        Assert.assertEquals("active", parser.nextFieldName());
        Assert.assertTrue(parser.nextBooleanValue());

        Assert.assertEquals("count", parser.nextFieldName());
        Assert.assertEquals(20L, parser.nextLongValue(0L));

        Assert.assertNull(parser.nextFieldName());
    }

    @Test
    public void testParseStrings_asciiEscapesAndUnicode() throws IOException {
        String json = "[\"simple\", \"escape: \\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041\", \"2byte: \u00e9\", \"3byte: \u4e2d\", \"4byte: \uD83D\uDE00\"]";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("simple", parser.getText());
        Assert.assertEquals(6, parser.getTextLength());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("escape: \" \\ / \b \f \n \r \t A", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("2byte: \u00e9", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("3byte: \u4e2d", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("4byte: \uD83D\uDE00", parser.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testSkipString_largeStringSkipped_success() throws IOException {
        String json = "[\"toSkip_123456789_\\\"_\\\\_\\u0041_\u00e9_\u4e2d_\uD83D\uDE00\", 99]";
        UTF8StreamJsonParser parser = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(99, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testParseSingleQuotes_whenFeatureEnabled_success() throws IOException {
        int feat = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        String json = "{'key': 'value with \\' quote', 'num': 123}";
        UTF8StreamJsonParser parser = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("key", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("value with ' quote", parser.getText());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("num", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParseUnquotedFieldNames_whenFeatureEnabled_success() throws IOException {
        int feat = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        String json = "{foo: 1, bar: 2, _baz: 3, $dollar: 4}";
        UTF8StreamJsonParser parser = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("foo", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("bar", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(2, parser.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("_baz", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(3, parser.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("$dollar", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(4, parser.getIntValue());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParseComments_allStyles_whenEnabled() throws IOException {
        int feat = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String json = "/* C-style block comment */\n"
                + "{\n"
                + "  // C++ line comment\n"
                + "  \"a\": 1, # YAML style comment\n"
                + "  \"b\": /* inline comment */ 2\n"
                + "}";
        UTF8StreamJsonParser parser = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("a", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("b", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(2, parser.getIntValue());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testBase64Decoding_allVariantsAndPadding() throws IOException {
        byte[] rawData = "Hello World Jackson UTF8 Parser Testing!".getBytes(StandardCharsets.UTF_8);
        String base64Mime = "SGVsbG8gV29ybGQgSmFja3NvbiBVVEY4IFBhcnNlciBUZXN0aW5nIQ==";
        String json = "[\"" + base64Mime + "\", \"" + base64Mime + "\"]";

        UTF8StreamJsonParser parser = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded1 = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(rawData, decoded1);

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int readBytes = parser.readBinaryValue(Base64Variants.MIME, out);
        Assert.assertEquals(rawData.length, readBytes);
        Assert.assertArrayEquals(rawData, out.toByteArray());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testGetLocation_tracksLinesColumnsAndOffsets() throws IOException {
        String json = "{\n  \"field\": 123\n}";
        UTF8StreamJsonParser parser = createParser(json);

        JsonLocation locBefore = parser.getCurrentLocation();
        Assert.assertEquals(1, locBefore.getLineNr());

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        JsonLocation tokenLoc = parser.getTokenLocation();
        Assert.assertEquals(2, tokenLoc.getLineNr());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testChunkedInputStream_handlesBoundarySplits() throws IOException {
        String json = "{\"longString\": \"" + new String(new char[200]).replace('\0', 'x') + "\", \"num\": 123456789}";
        UTF8StreamJsonParser parser = createParserWithChunkedStream(json.getBytes(StandardCharsets.UTF_8), 0, 16);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("longString", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals(200, parser.getText().length());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("num", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123456789, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndBracket_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"key\": 123]");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndCurly_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[123}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColon_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"key\" 123}");
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingComma_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1 2]");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidToken_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[trux]");
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeSequence_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[\"invalid \\z escape\"]");
        parser.nextToken();
        parser.nextToken();
        parser.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidHexEscapeSequence_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[\"invalid \\u004G hex\"]");
        parser.nextToken();
        parser.nextToken();
        parser.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedString_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[\"unterminated");
        parser.nextToken();
        parser.nextToken();
        parser.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisabled_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("/* comment */ 123", 0);
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumberStartMinusFollowedByNonDigit_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[-a]");
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidFloatNoDigitsAfterPeriod_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1.]");
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidFloatNoDigitsAfterExponent_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1e]");
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingRootSpaceBetweenValues_throwsException() throws IOException {
        UTF8StreamJsonParser parser = createParser("123 456\"bad\"");
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextValueHelpers_withObjectFields() throws IOException {
        String json = "{\"text\": \"hello\", \"intVal\": 42, \"longVal\": 9999999999, \"boolVal\": true, \"arr\": [], \"obj\": {}}";
        UTF8StreamJsonParser parser = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals("text", parser.nextFieldName());
        Assert.assertEquals("hello", parser.nextTextValue());

        Assert.assertEquals("intVal", parser.nextFieldName());
        Assert.assertEquals(42, parser.nextIntValue(0));

        Assert.assertEquals("longVal", parser.nextFieldName());
        Assert.assertEquals(9999999999L, parser.nextLongValue(0L));

        Assert.assertEquals("boolVal", parser.nextFieldName());
        Assert.assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        Assert.assertEquals("arr", parser.nextFieldName());
        Assert.assertNull(parser.nextTextValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        Assert.assertEquals("obj", parser.nextFieldName());
        Assert.assertEquals(0, parser.nextIntValue(0));
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testClose_closesUnderlyingResourcesAndIdempotent() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1, 2, 3]");
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        parser.close();
        Assert.assertNull(parser.nextToken());
    }
}
