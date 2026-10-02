package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser createParser(String doc) {
        return createParser(doc, 0);
    }

    private ReaderBasedJsonParser createParser(String doc, int features) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        StringReader r = new StringReader(doc);
        return new ReaderBasedJsonParser(ctxt, features, r, null, sym);
    }

    private ReaderBasedJsonParser createParserWithBuffer(String doc, int features, boolean recyclable) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        char[] buf = doc.toCharArray();
        return new ReaderBasedJsonParser(ctxt, features, null, null, sym, buf, 0, buf.length, recyclable);
    }

    private ReaderBasedJsonParser createSlowParser(String doc, int features, final int chunkSize) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        Reader r = new FilterReader(new StringReader(doc)) {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return super.read(cbuf, off, Math.min(len, chunkSize));
            }
        };
        return new ReaderBasedJsonParser(ctxt, features, r, null, sym);
    }

    @Test
    public void testConstructorsAndGetters() throws IOException {
        ReaderBasedJsonParser parser1 = createParser("  {\"key\": 123}  ");
        Assert.assertNull(parser1.getCodec());
        Assert.assertNotNull(parser1.getInputSource());

        ObjectCodec mockCodec = new ObjectCodec() {
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) { return null; }
            @Override public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) { return null; }
            @Override public <T extends TreeNode> T readTree(JsonParser p) { return null; }
            @Override public <T> Iterator<T> readValues(JsonParser p, Class<T> valueType) { return null; }
            @Override public <T> Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) { return null; }
            @Override public <T> Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) { return null; }
            @Override public void writeValue(JsonGenerator gen, Object value) {}
            @Override public void writeTree(JsonGenerator gen, TreeNode tree) {}
            @Override public TreeNode createObjectNode() { return null; }
            @Override public TreeNode createArrayNode() { return null; }
            @Override public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override public <T> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
        };
        parser1.setCodec(mockCodec);
        Assert.assertSame(mockCodec, parser1.getCodec());

        ReaderBasedJsonParser parser2 = createParserWithBuffer("456", 0, false);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser2.nextToken());
        Assert.assertEquals("456", parser2.getText());
        parser2.close();
        parser1.close();
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        ReaderBasedJsonParser p = createParser("   {\"a\":1}   ");
        StringWriter sw = new StringWriter();
        int released = p.releaseBuffered(sw);
        Assert.assertEquals(0, released);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        released = p.releaseBuffered(sw);
        Assert.assertTrue(released >= 0);
        Assert.assertEquals(0, p.releaseBuffered(sw));
        p.close();
    }

    @Test
    public void testBasicStructures() throws IOException {
        String json = "{\"a\": [true, false, null, {}], \"b\": {\"nested\": 1}}";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("a", p.getCurrentName());
        Assert.assertEquals("a", p.getText());
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        Assert.assertEquals("true", p.getText());
        Assert.assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        Assert.assertEquals("false", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        Assert.assertEquals("null", p.getText());
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("b", p.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("nested", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNumbers() throws IOException {
        String json = "[ 0, 123, -456, 0.5, -0.25, 1.2e3, 2.5E-2, -3.7e+2, 0e0 ]";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(0, p.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(-456, p.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(0.5, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(-0.25, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(1200.0, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(0.025, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(-370.0, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(0.0, p.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testLeadingZeroesFeature() throws IOException {
        String json = "[ 007, -012 ]";
        ReaderBasedJsonParser pDisabled = createParser(json, 0);
        Assert.assertEquals(JsonToken.START_ARRAY, pDisabled.nextToken());
        try {
            pDisabled.nextToken();
            Assert.fail("Should fail on leading zero without feature enabled");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        }
        pDisabled.close();

        int feat = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        ReaderBasedJsonParser pEnabled = createParser(json, feat);
        Assert.assertEquals(JsonToken.START_ARRAY, pEnabled.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, pEnabled.nextToken());
        Assert.assertEquals(7, pEnabled.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, pEnabled.nextToken());
        Assert.assertEquals(-12, pEnabled.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, pEnabled.nextToken());
        pEnabled.close();
    }

    @Test
    public void testNonNumericNumbers() throws IOException {
        int feat = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        String json = "[ NaN, Infinity, +Infinity, -Infinity, +INF, -INF ]";
        ReaderBasedJsonParser p = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
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
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();

        ReaderBasedJsonParser pDisabled = createParser("[ NaN ]", 0);
        pDisabled.nextToken();
        try {
            pDisabled.nextToken();
            Assert.fail("Should fail when ALLOW_NON_NUMERIC_NUMBERS is disabled");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("ALLOW_NON_NUMERIC_NUMBERS"));
        }
        pDisabled.close();
    }

    @Test
    public void testStringsAndEscapes() throws IOException {
        String json = "[\"hello \\\"world\\\"\", \"line1\\nline2\\t\\r\\b\\f\\\\\\/\", \"\\u0041\\u0042\"]";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("hello \"world\"", p.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("line1\nline2\t\r\b\f\\/", p.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("AB", p.getText());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testGetTextVariants() throws IOException {
        String json = "{\"fld\": \"stringVal\", \"num\": 12345}";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertNull(p.getText());
        StringWriter sw = new StringWriter();
        Assert.assertEquals(0, p.getText(sw));

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("{", p.getText());
        p.getText(sw);

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("fld", p.getText());
        Assert.assertEquals("fld", p.getValueAsString());
        Assert.assertEquals(3, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());
        Assert.assertNotNull(p.getTextCharacters());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("stringVal", p.getText());
        Assert.assertEquals("stringVal", p.getValueAsString("default"));
        Assert.assertEquals(9, p.getTextLength());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("num", p.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("12345", p.getText());
        Assert.assertEquals(5, p.getTextLength());

        sw = new StringWriter();
        p.getText(sw);
        Assert.assertEquals("12345", sw.toString());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testSingleQuotes() throws IOException {
        int feat = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        String json = "{ 'key': 'value \\'with\\' quotes' }";
        ReaderBasedJsonParser p = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("key", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("value 'with' quotes", p.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testUnquotedFieldNames() throws IOException {
        int feat = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        String json = "{ foo: 1, bar_123: 2, $baz: 3 }";
        ReaderBasedJsonParser p = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("foo", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("bar_123", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("$baz", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testComments() throws IOException {
        int feat = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String json = "/* comment */\n" +
                "{\n" +
                "  // line comment\n" +
                "  \"a\": 1, # yaml comment\n" +
                "  \"b\": /* inline */ 2\n" +
                "}";
        ReaderBasedJsonParser p = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("a", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("b", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(2, p.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testTrailingComma() throws IOException {
        int feat = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
        String json = "{\"a\": 1, [1, 2, ], }";
        ReaderBasedJsonParser p = createParser("{\"a\": 1, }", feat);
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();

        p = createParser("[1, 2, ]", feat);
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testMissingValues() throws IOException {
        int feat = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
        String json = "[1,,3,]";
        ReaderBasedJsonParser p = createParser(json, feat);

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(3, p.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testNextFieldNameVariants() throws IOException {
        String json = "{\"name\": \"value\", \"age\": 30, \"flag\": true, \"arr\": [], \"obj\": {}}";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertTrue(p.nextFieldName(new SerializedString("name")));
        Assert.assertEquals(JsonToken.FIELD_NAME, p.currentToken());
        Assert.assertEquals("value", p.nextTextValue());

        Assert.assertFalse(p.nextFieldName(new SerializedString("notAge")));
        Assert.assertEquals("30", p.getText());
        Assert.assertEquals(30, p.getIntValue());

        Assert.assertEquals("flag", p.nextFieldName());
        Assert.assertEquals(Boolean.TRUE, p.nextBooleanValue());

        Assert.assertEquals("arr", p.nextFieldName());
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());

        Assert.assertEquals("obj", p.nextFieldName());
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextFieldName());
        p.close();
    }

    @Test
    public void testNextValueMethods() throws IOException {
        String json = "{\"s\": \"test\", \"i\": 42, \"l\": 9876543210, \"b\": true, \"f\": false}";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertNull(p.nextTextValue()); // at START_OBJECT
        Assert.assertEquals(10, p.nextIntValue(10));
        Assert.assertEquals(20L, p.nextLongValue(20L));
        Assert.assertNull(p.nextBooleanValue());

        p = createParser(json);
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());

        p.nextToken(); // "s"
        Assert.assertEquals("test", p.nextTextValue());

        p.nextToken(); // "i"
        Assert.assertEquals(42, p.nextIntValue(0));

        p.nextToken(); // "l"
        Assert.assertEquals(9876543210L, p.nextLongValue(0L));

        p.nextToken(); // "b"
        Assert.assertEquals(Boolean.TRUE, p.nextBooleanValue());

        p.nextToken(); // "f"
        Assert.assertEquals(Boolean.FALSE, p.nextBooleanValue());

        p.nextToken(); // END_OBJECT
        p.close();
    }

    @Test
    public void testBase64BinaryValues() throws IOException {
        byte[] original = "Jackson Core Test Base64 Binary Content".getBytes("UTF-8");
        String b64 = Base64Variants.MIME.encode(original);
        String json = "[\"" + b64 + "\", \"" + b64 + "\"]";

        ReaderBasedJsonParser p = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        // First via getBinaryValue (with incomplete token)
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] decoded1 = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(original, decoded1);

        // Access already decoded binary
        byte[] decoded1Cached = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(original, decoded1Cached);

        // Second via readBinaryValue streaming
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesRead = p.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(original.length, bytesRead);
        Assert.assertArrayEquals(original, baos.toByteArray());

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testBase64VariantsAndPadding() throws IOException {
        byte[] data1 = new byte[]{ 1 };
        byte[] data2 = new byte[]{ 1, 2 };
        byte[] data3 = new byte[]{ 1, 2, 3 };

        String b64_1 = Base64Variants.MIME.encode(data1);
        String b64_2 = Base64Variants.MIME.encode(data2);
        String b64_3 = Base64Variants.MIME.encode(data3);

        String json = "[\"" + b64_1 + "\", \"" + b64_2 + "\", \"" + b64_3 + "\"]";
        ReaderBasedJsonParser p = createParser(json);
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertArrayEquals(data1, p.getBinaryValue(Base64Variants.MIME));

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertArrayEquals(data2, p.getBinaryValue(Base64Variants.MIME));

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertArrayEquals(data3, p.getBinaryValue(Base64Variants.MIME));

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testLocations() throws IOException {
        String json = "{\n  \"field\": 100\n}";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        JsonLocation loc = p.getTokenLocation();
        Assert.assertNotNull(loc);
        Assert.assertEquals(1, loc.getLineNr());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        loc = p.getTokenLocation();
        Assert.assertEquals(2, loc.getLineNr());

        JsonLocation curLoc = p.getCurrentLocation();
        Assert.assertTrue(curLoc.getLineNr() >= 2);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testFinishTokenAndSkipString() throws IOException {
        String json = "[\"skipped string\", \"finished string\"]";
        ReaderBasedJsonParser p = createParser(json);

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        // nextToken() will skip the incomplete string
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.finishToken();
        Assert.assertEquals("finished string", p.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testSlowStreamingBufferBoundaries() throws IOException {
        String json = "{\"longKeyName\": 123456789, \"floatVal\": -123.456e+2, \"str\": \"a long string value to split across buffer\", \"flag\": true, \"nil\": null}";
        ReaderBasedJsonParser p = createSlowParser(json, 0, 2);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("longKeyName", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123456789, p.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("floatVal", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(-12345.6, p.getDoubleValue(), 0.01);

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("str", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("a long string value to split across buffer", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("flag", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("nil", p.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testExceptionsAndInvalidInputs() throws IOException {
        ReaderBasedJsonParser p1 = createParser("{ \"a\" 1 }"); // missing colon
        p1.nextToken();
        try {
            p1.nextToken();
            Assert.fail("Expected failure on missing colon");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("was expecting a colon"));
        }
        p1.close();

        ReaderBasedJsonParser p2 = createParser("{\"a\": 1 2}"); // missing comma
        p2.nextToken();
        p2.nextToken();
        p2.nextToken();
        try {
            p2.nextToken();
            Assert.fail("Expected failure on missing comma");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("was expecting comma"));
        }
        p2.close();

        ReaderBasedJsonParser p3 = createParser("[}"); // mismatched closing bracket
        p3.nextToken();
        try {
            p3.nextToken();
            Assert.fail("Expected failure on mismatched bracket");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected close marker"));
        }
        p3.close();

        ReaderBasedJsonParser p4 = createParser("{\"a\": \"unclosed string");
        p4.nextToken();
        p4.nextToken();
        try {
            p4.nextToken();
            p4.getText();
            Assert.fail("Expected failure on unclosed string");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("was expecting closing quote"));
        }
        p4.close();

        ReaderBasedJsonParser p5 = createParser("[ - ]");
        p5.nextToken();
        try {
            p5.nextToken();
            Assert.fail("Expected failure on solitary minus");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().contains("expected digit"));
        }
        p5.close();
    }
}
