package com.fasterxml.jackson.core.json;

import java.io.*;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser createParser(String doc) {
        return createParser(doc, 0);
    }

    private ReaderBasedJsonParser createParser(String doc, int features) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        return new ReaderBasedJsonParser(ctxt, features, new StringReader(doc), null, sym);
    }

    private ReaderBasedJsonParser createCustomBufferParser(String doc, boolean recyclable) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        char[] buf = doc.toCharArray();
        return new ReaderBasedJsonParser(ctxt, 0, new StringReader(doc), null, sym, buf, 0, buf.length, recyclable);
    }

    @Test
    public void testConstructorsAndCodec() {
        ReaderBasedJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
        assertNull(parser.getInputSource()); // Reader is active
        assertNotNull(parser.getInputSource());

        ObjectCodec mockCodec = new ObjectCodec() {
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) { return null; }
            @Override public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) { return null; }
            @Override public <T extends TreeNode> T readTree(JsonParser p) { return null; }
            @Override public void writeValue(JsonGenerator gen, Object value) {}
            @Override public void writeTree(JsonGenerator gen, TreeNode tree) {}
            @Override public TreeNode createObjectNode() { return null; }
            @Override public TreeNode createArrayNode() { return null; }
            @Override public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override public <T> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
        };

        parser.setCodec(mockCodec);
        assertSame(mockCodec, parser.getCodec());

        ReaderBasedJsonParser customParser = createCustomBufferParser("[]", false);
        assertNotNull(customParser);
        try {
            customParser.close();
        } catch (IOException e) {
            fail("Close should not fail: " + e.getMessage());
        }
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"k\":\"v\"}");
        StringWriter sw = new StringWriter();
        assertEquals(0, parser.releaseBuffered(sw));

        // Advance once to load buffer
        parser.nextToken();
        int released = parser.releaseBuffered(sw);
        assertTrue(released > 0);
        assertTrue(sw.toString().length() > 0);
        parser.close();
    }

    @Test
    public void testNextTokenBasicTypes() throws IOException {
        String json = "{\"str\":\"hello\", \"int\":123, \"float\":45.67, \"true\":true, \"false\":false, \"null\":null, \"arr\":[1,2]}";
        ReaderBasedJsonParser p = createParser(json);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertTrue(p.isExpectedStartObjectToken());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("str", p.getCurrentName());
        assertEquals("str", p.getText());
        assertEquals("str", p.getValueAsString());
        assertEquals("str", p.getValueAsString("def"));

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
        assertEquals("hello", p.getValueAsString());
        assertEquals("hello", p.getValueAsString("def"));
        assertNotNull(p.getTextCharacters());
        assertEquals(5, p.getTextLength());
        assertEquals(0, p.getTextOffset());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("int", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals("123", p.getText());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("float", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(45.67, p.getDoubleValue(), 0.0001);
        assertEquals("45.67", p.getText());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("true", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals("true", p.getText());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("false", p.getCurrentName());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals("false", p.getText());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("null", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals("null", p.getText());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("arr", p.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertTrue(p.isExpectedStartArrayToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNextFieldNameVariations() throws IOException {
        String json = "{\"name1\":\"val1\", \"name2\":123, \"name3\":true, \"name4\":false, \"name5\":null, \"name6\":[1], \"name7\":{\"inner\":2}}";
        ReaderBasedJsonParser p = createParser(json);

        assertNull(p.nextFieldName()); // Before start object
        assertEquals(JsonToken.START_OBJECT, p.getCurrentToken());

        SerializedString sstr1 = new SerializedString("name1");
        assertTrue(p.nextFieldName(sstr1));
        assertEquals("name1", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("val1", p.getText());

        SerializedString sstrMismatch = new SerializedString("notThere");
        assertFalse(p.nextFieldName(sstrMismatch));
        assertEquals("name2", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());

        assertEquals("name3", p.nextFieldName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());

        assertEquals("name4", p.nextFieldName());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());

        assertEquals("name5", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        assertEquals("name6", p.nextFieldName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(1, p.nextIntValue(0));
        assertEquals(JsonToken.END_ARRAY, p.nextToken());

        assertEquals("name7", p.nextFieldName());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals("inner", p.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextFieldName());
        p.close();
    }

    @Test
    public void testNextValueOptimizedMethods() throws IOException {
        String json = "{\"t\":\"text\", \"i\":42, \"l\":9876543210, \"b1\":true, \"b2\":false, \"arr\":[], \"obj\":{}}";
        ReaderBasedJsonParser p = createParser(json);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("text", p.nextTextValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(42, p.nextIntValue(0));

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(9876543210L, p.nextLongValue(0L));

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(Boolean.TRUE, p.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(p.nextTextValue()); // encounters START_ARRAY
        assertEquals(JsonToken.END_ARRAY, p.nextToken());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(99, p.nextIntValue(99)); // encounters START_OBJECT
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testNextValueDirectCalls() throws IOException {
        String json = "\"directString\" 123 456789012345 true false";
        ReaderBasedJsonParser p = createParser(json);

        assertEquals("directString", p.nextTextValue());
        assertEquals(123, p.nextIntValue(0));
        assertEquals(456789012345L, p.nextLongValue(0L));
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        assertNull(p.nextBooleanValue());
        p.close();
    }

    @Test
    public void testNumberParsingComprehensive() throws IOException {
        String numbers = "0 -0 123 -123 0.25 -0.25 1.5e2 -1.5E2 2e+3 3E-2 -4e-3";
        ReaderBasedJsonParser p = createParser(numbers);

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-123, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0.25, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-0.25, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(150.0, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-150.0, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2000.0, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0.03, p.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-0.004, p.getDoubleValue(), 0.00001);

        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNonNumericNumbers() throws IOException {
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        String json = "NaN Infinity +Infinity -Infinity +INF -INF";
        ReaderBasedJsonParser p = createParser(json, features);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);

        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumericNumbersDisabled() throws IOException {
        ReaderBasedJsonParser p = createParser("NaN");
        p.nextToken();
    }

    @Test
    public void testLeadingZerosAllowed() throws IOException {
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        String json = "007 0123";
        ReaderBasedJsonParser p = createParser(json, features);

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZerosDisabled() throws IOException {
        ReaderBasedJsonParser p = createParser("007");
        p.nextToken();
    }

    @Test
    public void testStringEscapes() throws IOException {
        String json = "\"\\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041 \\u006a\"";
        ReaderBasedJsonParser p = createParser(json);

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("\" \\ / \b \f \n \r \t A j", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeSequence() throws IOException {
        ReaderBasedJsonParser p = createParser("\"\\z\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidUnicodeEscapeSequence() throws IOException {
        ReaderBasedJsonParser p = createParser("\"\\u004G\"");
        p.nextToken();
        p.getText();
    }

    @Test
    public void testSingleQuoteFeature() throws IOException {
        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        String json = "{'key': 'value \\'with\\' quotes'}";
        ReaderBasedJsonParser p = createParser(json, features);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("key", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value 'with' quotes", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testUnquotedFieldNamesFeature() throws IOException {
        int features = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        String json = "{foo: 1, bar_123: 2, $test: 3}";
        ReaderBasedJsonParser p = createParser(json, features);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("foo", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("bar_123", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("$test", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testCommentsFeature() throws IOException {
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String json = "{\n" +
                "// C++ style line comment\n" +
                "/* C style block comment */\n" +
                "# YAML style comment\n" +
                "\"key\" : /* comment */ 123 // trailing\n" +
                "}";
        ReaderBasedJsonParser p = createParser(json, features);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("key", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisabled() throws IOException {
        ReaderBasedJsonParser p = createParser("// comment\n{}");
        p.nextToken();
    }

    @Test
    public void testBase64BinaryParsing() throws IOException {
        byte[] original = "Jackson JSON Parser Binary Test Data 1234567890".getBytes("UTF-8");
        String base64Mime = Base64Variants.MIME.encode(original);
        String json = "[\"" + base64Mime + "\", \"" + base64Mime + "\"]";

        ReaderBasedJsonParser p = createParser(json);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] decoded1 = p.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(original, decoded1);

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesRead = p.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(original.length, bytesRead);
        assertArrayEquals(original, baos.toByteArray());

        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidBase64() throws IOException {
        ReaderBasedJsonParser p = createParser("[\"!!!not-base-64!!!\"]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.getBinaryValue(Base64Variants.MIME);
    }

    @Test
    public void testLocationsAndTracking() throws IOException {
        String json = "{\n  \"field\": 123\n}";
        ReaderBasedJsonParser p = createParser(json);

        JsonLocation loc1 = p.getCurrentLocation();
        assertEquals(1, loc1.getLineNr());
        assertEquals(1, loc1.getColumnNr());

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        JsonLocation tokenLoc = p.getTokenLocation();
        assertEquals(1, tokenLoc.getLineNr());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        JsonLocation locEnd = p.getCurrentLocation();
        assertEquals(3, locEnd.getLineNr());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedArrayEnd() throws IOException {
        ReaderBasedJsonParser p = createParser("{]");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedObjectEnd() throws IOException {
        ReaderBasedJsonParser p = createParser("[}");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedEndOfInputInString() throws IOException {
        ReaderBasedJsonParser p = createParser("\"unterminated");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedEndOfInputInComment() throws IOException {
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask();
        ReaderBasedJsonParser p = createParser("/* unfinished comment", features);
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumberNoDigitsAfterDecimal() throws IOException {
        ReaderBasedJsonParser p = createParser("123.");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumberNoDigitsAfterExponent() throws IOException {
        ReaderBasedJsonParser p = createParser("123e+");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnrecognizedToken() throws IOException {
        ReaderBasedJsonParser p = createParser("unknownToken");
        p.nextToken();
    }

    @Test
    public void testSkipStringIncomplete() throws IOException {
        String json = "[\"skipped string\", 123]";
        ReaderBasedJsonParser p = createParser(json);

        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        // Do not call getText(), advance immediately
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }
}
