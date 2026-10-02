package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private UTF8StreamJsonParser createParser(String json, int features) {
        return createParser(json.getBytes(StandardCharsets.UTF_8), features);
    }

    private UTF8StreamJsonParser createParser(byte[] bytes, int features) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot(0).makeChild(JsonFactory.Feature.collectDefaults());
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, new byte[bytes.length + 10], 0, 0, true);
    }

    private UTF8StreamJsonParser createParserWithBuffer(byte[] bytes, int start, int end, int features) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot(0).makeChild(JsonFactory.Feature.collectDefaults());
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, bytes, start, end, true);
    }

    @Test
    public void testCodecGetterSetter_validCodec_success() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}", 0);
        assertNull(parser.getCodec());
        parser.setCodec(null);
        assertNull(parser.getCodec());
        parser.close();
    }

    @Test
    public void testGetInputSource_validStream_returnsInputStream() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}", 0);
        assertNotNull(parser.getInputSource());
        assertTrue(parser.getInputSource() instanceof InputStream);
        parser.close();
    }

    @Test
    public void testReleaseBuffered_withRemainingBytes_writesToOutput() throws Exception {
        byte[] data = "123456789".getBytes(StandardCharsets.UTF_8);
        UTF8StreamJsonParser parser = createParserWithBuffer(data, 2, 7, 0);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(5, count);
        assertArrayEquals("34567".getBytes(StandardCharsets.UTF_8), out.toByteArray());
        assertEquals(0, parser.releaseBuffered(out));
        parser.close();
    }

    @Test
    public void testLocations_validInput_correctLineAndCol() throws Exception {
        String json = "{\n  \"key\": 123\n}";
        UTF8StreamJsonParser parser = createParser(json, 0);
        assertNotNull(parser.getTokenLocation());
        assertNotNull(parser.getCurrentLocation());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        JsonLocation tokenLoc = parser.getTokenLocation();
        assertEquals(2, tokenLoc.getLineNr());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testBasicDataTypes_allPrimitives_parsedCorrectly() throws Exception {
        String json = "{\"str\":\"hello\",\"num\":42,\"neg\":-17,\"flt\":3.14e-2,\"t\":true,\"f\":false,\"n\":null,\"arr\":[1,2],\"obj\":{\"inner\":0}}";
        UTF8StreamJsonParser parser = createParser(json, 0);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals("str", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertEquals("hello", parser.getValueAsString());
        assertEquals("hello", parser.getValueAsString("def"));
        assertNotNull(parser.getTextCharacters());
        assertEquals(5, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());

        assertEquals("num", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getValueAsInt());
        assertEquals(42, parser.getValueAsInt(10));
        assertEquals(42L, parser.getLongValue());
        assertEquals("42", parser.getText());

        assertEquals("neg", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-17, parser.getIntValue());
        assertEquals("-17", parser.getText());

        assertEquals("flt", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14e-2, parser.getDoubleValue(), 0.00001);
        assertEquals(0, parser.getValueAsInt());

        assertEquals("t", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());

        assertEquals("f", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals("false", parser.getText());

        assertEquals("n", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals("null", parser.getText());

        assertEquals("arr", parser.nextFieldName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(1, parser.nextIntValue(0));
        assertEquals(2L, parser.nextLongValue(0L));
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals("obj", parser.nextFieldName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("inner", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextOptimizedMethods_withFieldNames_returnsValuesDirectly() throws Exception {
        String json = "{\"t\":true,\"f\":false,\"i\":123,\"l\":9876543210,\"s\":\"text\",\"a\":[1],\"o\":{}}";
        UTF8StreamJsonParser parser = createParser(json, 0);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals("t", parser.nextFieldName());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        assertEquals("f", parser.nextFieldName());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        assertEquals("i", parser.nextFieldName());
        assertEquals(123, parser.nextIntValue(0));

        assertEquals("l", parser.nextFieldName());
        assertEquals(9876543210L, parser.nextLongValue(0L));

        assertEquals("s", parser.nextFieldName());
        assertEquals("text", parser.nextTextValue());

        assertEquals("a", parser.nextFieldName());
        assertNull(parser.nextTextValue()); // encounters START_ARRAY
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals("o", parser.nextFieldName());
        assertEquals(0, parser.nextIntValue(0)); // encounters START_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextFieldNameSerializable_matchesAndMismatches_returnsExpected() throws Exception {
        String json = "{\"short\":\"v1\",\"mediumName123\":\"v2\",\"reallyVeryLongFieldNameThatExceedsNormalBufferSize123456789\":\"v3\",\"other\":1}";
        UTF8StreamJsonParser parser = createParser(json, 0);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        SerializedString ssShort = new SerializedString("short");
        SerializedString ssMedium = new SerializedString("mediumName123");
        SerializedString ssLong = new SerializedString("reallyVeryLongFieldNameThatExceedsNormalBufferSize123456789");
        SerializedString ssNone = new SerializedString("none");

        assertTrue(parser.nextFieldName(ssShort));
        assertEquals("v1", parser.nextTextValue());

        assertFalse(parser.nextFieldName(ssNone));
        assertEquals("mediumName123", parser.getCurrentName());
        assertEquals("v2", parser.nextTextValue());

        assertTrue(parser.nextFieldName(ssLong));
        assertEquals("v3", parser.nextTextValue());

        assertFalse(parser.nextFieldName(ssNone));
        assertEquals("other", parser.getCurrentName());
        assertEquals(1, parser.nextIntValue(0));

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testFieldNamesLengthsAndUtf8_variousSizes_parsedCorrectly() throws Exception {
        // Names with lengths 1, 2, 3, 4, 5, 8, 9, 12, >12, multi-byte UTF-8
        String json = "{"
                + "\"a\":1,"
                + "\"ab\":2,"
                + "\"abc\":3,"
                + "\"abcd\":4,"
                + "\"abcde\":5,"
                + "\"abcdefgh\":8,"
                + "\"abcdefghi\":9,"
                + "\"abcdefghijkl\":12,"
                + "\"abcdefghijklm\":13,"
                + "\"long_name_exceeding_quad_buffer_size_to_trigger_growth_1234567890_abcdef\":100,"
                + "\"utf8_\\u00e9_\\u4e2d_\\ud83d\\ude00\":200,"
                + "\"\":0"
                + "}";
        UTF8StreamJsonParser parser = createParser(json, 0);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals("a", parser.nextFieldName());
        assertEquals(1, parser.nextIntValue(0));

        assertEquals("ab", parser.nextFieldName());
        assertEquals(2, parser.nextIntValue(0));

        assertEquals("abc", parser.nextFieldName());
        assertEquals(3, parser.nextIntValue(0));

        assertEquals("abcd", parser.nextFieldName());
        assertEquals(4, parser.nextIntValue(0));

        assertEquals("abcde", parser.nextFieldName());
        assertEquals(5, parser.nextIntValue(0));

        assertEquals("abcdefgh", parser.nextFieldName());
        assertEquals(8, parser.nextIntValue(0));

        assertEquals("abcdefghi", parser.nextFieldName());
        assertEquals(9, parser.nextIntValue(0));

        assertEquals("abcdefghijkl", parser.nextFieldName());
        assertEquals(12, parser.nextIntValue(0));

        assertEquals("abcdefghijklm", parser.nextFieldName());
        assertEquals(13, parser.nextIntValue(0));

        assertEquals("long_name_exceeding_quad_buffer_size_to_trigger_growth_1234567890_abcdef", parser.nextFieldName());
        assertEquals(100, parser.nextIntValue(0));

        assertEquals("utf8_\u00e9_\u4e2d_\ud83d\ude00", parser.nextFieldName());
        assertEquals(200, parser.nextIntValue(0));

        assertEquals("", parser.nextFieldName());
        assertEquals(0, parser.nextIntValue(0));

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testStringEscapesAndUtf8_variousChars_parsedCorrectly() throws Exception {
        String json = "[\"\\b\\t\\n\\f\\r\\\"\\\\\\/\\u0041\", \"UTF8: \\u00a9 \\u20ac \\ud83d\\ude00\", \"\", \"short\"]";
        UTF8StreamJsonParser parser = createParser(json, 0);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\b\t\n\f\r\"\\/A", parser.getText());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("UTF8: \u00a9 \u20ac \ud83d\ude00", parser.getText());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("", parser.getText());

        // Skip string token without reading getText()
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNumbersParsing_differentFormats_parsedCorrectly() throws Exception {
        String json = "[0, -0, 100, -200, 1.25, -2.5, 0.001, -0.05, 1e3, 2E+2, -3e-2, 0e0]";
        UTF8StreamJsonParser parser = createParser(json, 0);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(100, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-200, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.25, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-2.5, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.001, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.05, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1000.0, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(200.0, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.03, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNonStandardFeatures_singleQuoteAndUnquotedAndComments_parsedSuccessfully() throws Exception {
        int features = 0;
        features |= JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        features |= JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        features |= JsonParser.Feature.ALLOW_COMMENTS.getMask();
        features |= JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        features |= JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        features |= JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

        String json = "/* C comment */\n"
                + "{\n"
                + "  // C++ comment\n"
                + "  # YAML comment\n"
                + "  unquoted_name: 'single quoted string',\n"
                + "  'apos_name': 'val',\n"
                + "  nanVal: NaN,\n"
                + "  infVal: Infinity,\n"
                + "  negInfVal: -Infinity,\n"
                + "  leadingZero: 007\n"
                + "}";

        UTF8StreamJsonParser parser = createParser(json, features);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals("unquoted_name", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("single quoted string", parser.getText());

        assertEquals("apos_name", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("val", parser.getText());

        assertEquals("nanVal", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));

        assertEquals("infVal", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        assertEquals("negInfVal", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        assertEquals("leadingZero", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(7, parser.getIntValue());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testBase64Decoding_validData_returnsDecodedBytes() throws Exception {
        String text = "Hello World Jackson Base64";
        byte[] raw = text.getBytes(StandardCharsets.UTF_8);
        String base64 = Base64Variants.MIME.encode(raw);
        String json = "[\"" + base64 + "\", \"" + base64 + "\"]";

        UTF8StreamJsonParser parser = createParser(json, 0);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded1 = parser.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(raw, decoded1);

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int bytesCount = parser.readBinaryValue(Base64Variants.MIME, out);
        assertEquals(raw.length, bytesCount);
        assertArrayEquals(raw, out.toByteArray());

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testRootValuesWithSpaces_multipleNumbers_handledCorrectly() throws Exception {
        String json = "123 \t 456 \r\n 789 \n 0";
        UTF8StreamJsonParser parser = createParser(json, 0);

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(456, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(789, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());

        assertNull(parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedClosing_arrayInObject_throwsException() throws Exception {
        String json = "{\"key\": ]}";
        UTF8StreamJsonParser parser = createParser(json, 0);
        parser.nextToken(); // {
        parser.nextToken(); // key
        parser.nextToken(); // ] (error)
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedClosing_objectInArray_throwsException() throws Exception {
        String json = "[ } ]";
        UTF8StreamJsonParser parser = createParser(json, 0);
        parser.nextToken(); // [
        parser.nextToken(); // } (error)
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharacter_inNumber_throwsException() throws Exception {
        String json = "[ 12a3 ]";
        UTF8StreamJsonParser parser = createParser(json, 0);
        parser.nextToken();
        parser.nextToken();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnclosedString_reachesEOF_throwsException() throws Exception {
        String json = "\"unclosed string";
        UTF8StreamJsonParser parser = createParser(json, 0);
        parser.nextToken();
        parser.getText();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscape_hexEscapeTooShort_throwsException() throws Exception {
        String json = "\"\\u00G1\"";
        UTF8StreamJsonParser parser = createParser(json, 0);
        parser.nextToken();
        parser.getText();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisabled_encountersComment_throwsException() throws Exception {
        String json = "/* comment */ 123";
        UTF8StreamJsonParser parser = createParser(json, 0);
        parser.nextToken();
        parser.close();
    }

    @Test
    public void testGrowArrayBy_nullAndExistingArray_returnsGrownArray() {
        int[] grownFromNull = UTF8StreamJsonParser.growArrayBy(null, 5);
        assertNotNull(grownFromNull);
        assertEquals(5, grownFromNull.length);

        int[] original = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 4);
        assertEquals(7, grown.length);
        assertEquals(1, grown[0]);
        assertEquals(2, grown[1]);
        assertEquals(3, grown[2]);
        assertEquals(0, grown[3]);
    }

    @Test
    public void testGetTextMethods_beforeAndAfterTokens_returnsExpected() throws Exception {
        UTF8StreamJsonParser parser = createParser("[]", 0);
        assertNull(parser.getTextCharacters());
        assertEquals(0, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals("[", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals("]", parser.getText());
        assertNull(parser.nextToken());
        assertNull(parser.getTextCharacters());
        parser.close();
    }
}
