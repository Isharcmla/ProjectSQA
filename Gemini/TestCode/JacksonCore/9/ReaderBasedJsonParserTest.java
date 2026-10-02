package com.fasterxml.jackson.core.json;

import java.io.*;
import java.util.Arrays;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser createParser(String json) {
        return createParser(json, 0);
    }

    private ReaderBasedJsonParser createParser(String json, int features) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        return new ReaderBasedJsonParser(ctxt, features, new StringReader(json), null, sym);
    }

    private ReaderBasedJsonParser createParser(Reader reader, int features, boolean managedResource) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", managedResource);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        return new ReaderBasedJsonParser(ctxt, features, reader, null, sym);
    }

    private ReaderBasedJsonParser createParserWithBuffer(String json, int features, int bufSize, boolean recyclable) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        char[] buf = new char[Math.max(bufSize, json.length())];
        json.getChars(0, json.length(), buf, 0);
        return new ReaderBasedJsonParser(ctxt, features, null, null, sym, buf, 0, json.length(), recyclable);
    }

    @Test
    public void testConstructorsAndCodec() throws IOException {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        
        char[] buf = "{}".toCharArray();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, null, null, sym, buf, 0, buf.length, false);
        assertNull(parser.getCodec());
        assertNull(parser.getInputSource());
        
        ObjectCodec codec = new ObjectCodec() {
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override public <T> T readValue(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
            @Override public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) { return null; }
            @Override public <T extends TreeNode> T readTree(JsonParser p) { return null; }
            @Override public <T> java.util.Iterator<T> readValues(JsonParser p, Class<T> valueType) { return null; }
            @Override public <T> java.util.Iterator<T> readValues(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
            @Override public <T> java.util.Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) { return null; }
            @Override public void writeValue(JsonGenerator gen, Object value) {}
            @Override public void writeTree(JsonGenerator gen, TreeNode tree) {}
            @Override public TreeNode createObjectNode() { return null; }
            @Override public TreeNode createArrayNode() { return null; }
            @Override public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override public <T> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
        };
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
        parser.close();
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        String input = "  { \"a\" : 123 } ";
        StringReader reader = new StringReader(input);
        ReaderBasedJsonParser parser = createParser(reader, 0, false);
        
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        
        StringWriter sw = new StringWriter();
        int count = parser.releaseBuffered(sw);
        assertTrue(count > 0);
        assertTrue(sw.toString().length() > 0);
        
        // Secondary release should return 0 since pointer advanced to end
        int count2 = parser.releaseBuffered(sw);
        assertEquals(0, count2);
        
        parser.close();
    }

    @Test
    public void testGetInputSourceAndAutoClose() throws IOException {
        final boolean[] closed = new boolean[1];
        Reader r = new StringReader("123") {
            @Override
            public void close() {
                closed[0] = true;
                super.close();
            }
        };

        ReaderBasedJsonParser parser = createParser(r, JsonParser.Feature.AUTO_CLOSE_SOURCE.getMask(), false);
        assertSame(r, parser.getInputSource());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertNull(parser.nextToken()); // Triggers end-of-input close
        assertTrue(closed[0]);
    }

    @Test
    public void testCloseResourceManaged() throws IOException {
        final boolean[] closed = new boolean[1];
        Reader r = new StringReader("123") {
            @Override
            public void close() {
                closed[0] = true;
                super.close();
            }
        };

        ReaderBasedJsonParser parser = createParser(r, 0, true);
        parser.close();
        assertTrue(closed[0]);
    }

    @Test(expected = IOException.class)
    public void testReaderReturningZeroThrowsIOException() throws IOException {
        Reader r = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) {
                return 0; // Invalid according to contract when len > 0
            }
            @Override
            public void close() {}
        };
        ReaderBasedJsonParser parser = createParser(r, 0, false);
        parser.nextToken();
    }

    @Test
    public void testGetTextAndVariants() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"key\":\"value\", \"num\": 42, \"float\": 12.5, \"bool\": true, \"arr\": [null]}");

        assertNull(parser.getText());
        assertNull(parser.getTextCharacters());
        assertEquals(0, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertNull(parser.getValueAsString());
        assertEquals("default", parser.getValueAsString("default"));

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("{", parser.getText());
        assertArrayEquals("{".toCharArray(), parser.getTextCharacters());
        assertEquals(1, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertNull(parser.getValueAsString());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
        assertNotNull(parser.getTextCharacters());
        assertEquals(3, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertEquals("key", parser.getValueAsString());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals("value", parser.getValueAsString());
        assertEquals("value", parser.getValueAsString("fallback"));
        assertEquals(5, parser.getTextLength());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("42", parser.getText());
        assertEquals(2, parser.getTextLength());
        assertEquals("42", parser.getValueAsString());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("12.5", parser.getText());
        assertEquals(4, parser.getTextLength());
        assertEquals("12.5", parser.getValueAsString());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals("null", parser.getText());

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals("]", parser.getText());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals("}", parser.getText());

        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTextValueAndNextValueOptimizations() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"str\":\"hello\", \"int\":100, \"long\":200, \"t\":true, \"f\":false, \"arr\":[], \"obj\":{}}");

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("hello", parser.nextTextValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(100, parser.nextIntValue(-1));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(200L, parser.nextLongValue(-1L));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertNull(parser.nextTextValue()); // encounters START_ARRAY

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertNull(parser.nextTextValue()); // encounters START_OBJECT

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testDirectNextValues() throws IOException {
        ReaderBasedJsonParser p1 = createParser("\"directString\"");
        assertEquals("directString", p1.nextTextValue());
        p1.close();

        ReaderBasedJsonParser p2 = createParser("999");
        assertEquals(999, p2.nextIntValue(-1));
        p2.close();

        ReaderBasedJsonParser p3 = createParser("888888888888");
        assertEquals(888888888888L, p3.nextLongValue(-1L));
        p3.close();

        ReaderBasedJsonParser p4 = createParser("true");
        assertEquals(Boolean.TRUE, p4.nextBooleanValue());
        p4.close();

        ReaderBasedJsonParser p5 = createParser("false");
        assertEquals(Boolean.FALSE, p5.nextBooleanValue());
        p5.close();

        ReaderBasedJsonParser p6 = createParser("null");
        assertNull(p6.nextBooleanValue());
        p6.close();
    }

    @Test
    public void testNumberParsingIntAndFloats() throws IOException {
        String json = "[0, 123, -0, -123, 0.0, 0.25, -0.25, 12.34, -12.34, 1e2, 1E+2, 1e-2, -1e2, -1E+2, -1e-2, 0.5e2, -0.5e-2]";
        ReaderBasedJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-123, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.25, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.25, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(12.34, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-12.34, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(100.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(100.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.01, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-100.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-100.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.01, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(50.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.005, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNumberSplitOnBufferBoundary() throws IOException {
        String json = "12345.678e+2";
        // Create custom reader delivering 2 characters per read
        Reader r = new Reader() {
            private int pos = 0;
            @Override
            public int read(char[] cbuf, int off, int len) {
                if (pos >= json.length()) return -1;
                int toRead = Math.min(2, Math.min(len, json.length() - pos));
                json.getChars(pos, pos + toRead, cbuf, off);
                pos += toRead;
                return toRead;
            }
            @Override
            public void close() {}
        };
        ReaderBasedJsonParser parser = createParser(r, 0, false);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(12345.678e+2, parser.getDoubleValue(), 0.001);
        parser.close();
    }

    @Test
    public void testLeadingZeroes() throws IOException {
        int mask = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        ReaderBasedJsonParser p1 = createParser("[0123, 0005, -0123]", mask);
        assertEquals(JsonToken.START_ARRAY, p1.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p1.nextToken());
        assertEquals(123, p1.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p1.nextToken());
        assertEquals(5, p1.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p1.nextToken());
        assertEquals(-123, p1.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p1.nextToken());
        p1.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeroesDisallowed() throws IOException {
        ReaderBasedJsonParser p = createParser("0123", 0);
        p.nextToken();
    }

    @Test
    public void testNonNumericNumbers() throws IOException {
        int mask = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        ReaderBasedJsonParser p = createParser("[NaN, Infinity, +Infinity, -Infinity, +INF, -INF]", mask);

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
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumericNumbersDisallowedNaN() throws IOException {
        ReaderBasedJsonParser p = createParser("NaN", 0);
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumericNumbersDisallowedInfinity() throws IOException {
        ReaderBasedJsonParser p = createParser("Infinity", 0);
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumericNumbersDisallowedPlusInf() throws IOException {
        ReaderBasedJsonParser p = createParser("+INF", 0);
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumericNumbersDisallowedNegInf() throws IOException {
        ReaderBasedJsonParser p = createParser("-INF", 0);
        p.nextToken();
    }

    @Test
    public void testStringEscapes() throws IOException {
        String json = "\"\\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041 \\u0020\"";
        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\" \\ / \b \f \n \r \t A  ", parser.getText());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscapeSequence() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\q\"");
        parser.nextToken();
        parser.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidHexEscape() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\u00AG\"");
        parser.nextToken();
        parser.getText();
    }

    @Test
    public void testSkipString() throws IOException {
        ReaderBasedJsonParser parser = createParser("[\"skip me \\\" please\", 42]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken()); // incomplete string token
        // Next token directly called without reading string content -> triggers _skipString()
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testSingleQuotes() throws IOException {
        int mask = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        ReaderBasedJsonParser parser = createParser("{'key': 'value \\'with\\' single quotes'}", mask);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value 'with' single quotes", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuotesDisallowed() throws IOException {
        ReaderBasedJsonParser parser = createParser("{'key': 'value'}", 0);
        parser.nextToken();
    }

    @Test
    public void testUnquotedFieldNames() throws IOException {
        int mask = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        ReaderBasedJsonParser parser = createParser("{foo: 1, _bar: 2, $baz: 3}", mask);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("foo", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("_bar", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("$baz", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(3, parser.getIntValue());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNamesDisallowed() throws IOException {
        ReaderBasedJsonParser parser = createParser("{foo: 1}", 0);
        parser.nextToken();
    }

    @Test
    public void testComments() throws IOException {
        int mask = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String json = "/* C-style */\n" +
                "{\n" +
                "  // C++ line comment\n" +
                "  \"a\": 1, # YAML comment\n" +
                "  /* multi\n" +
                "     line */\n" +
                "  \"b\": 2\n" +
                "}";
        ReaderBasedJsonParser parser = createParser(json, mask);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisallowed() throws IOException {
        ReaderBasedJsonParser parser = createParser("/* comment */ 123", 0);
        parser.nextToken();
    }

    @Test
    public void testWhitespaceAndNewlines() throws IOException {
        String json = "\r\n\t  {\r\n\"a\"\r\n:\r\n1\r\n,\r\n\"b\"\r\n:\r\n2\r\n}\r\n";
        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testBase64Decoding() throws IOException {
        byte[] data = "Hello Jackson Base64 World!".getBytes("UTF-8");
        String encoded = Base64Variants.MIME.encode(data);
        String json = "\"" + encoded + "\"";

        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded = parser.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(data, decoded);

        // Re-get to test cached branch
        byte[] decodedCached = parser.getBinaryValue(Base64Variants.MIME);
        assertSame(decoded, decodedCached);
        parser.close();
    }

    @Test
    public void testReadBinaryValueStream() throws IOException {
        byte[] data = new byte[256];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        String encoded = Base64Variants.MIME.encode(data);
        String json = "\"" + encoded + "\"";

        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(data.length, count);
        assertArrayEquals(data, baos.toByteArray());
        parser.close();
    }

    @Test
    public void testBase64NoPaddingVariant() throws IOException {
        byte[] data = "Short string".getBytes("UTF-8");
        String encodedNoPadding = Base64Variants.MODIFIED_FOR_URL.encode(data, false);
        String json = "\"" + encodedNoPadding + "\"";

        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded = parser.getBinaryValue(Base64Variants.MODIFIED_FOR_URL);
        assertArrayEquals(data, decoded);
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidBase64ThrowsException() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"!@#$%\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.getBinaryValue();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueOnNonStringOrObject() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.getBinaryValue();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedArrayEndMarker() throws IOException {
        ReaderBasedJsonParser parser = createParser("{ } ]");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.nextToken(); // throws mismatched end marker
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedObjectEndMarker() throws IOException {
        ReaderBasedJsonParser parser = createParser("[ ] }");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.nextToken(); // throws mismatched end marker
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColonThrowsException() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"a\" 123}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaThrowsException() throws IOException {
        ReaderBasedJsonParser parser = createParser("[1 2]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnrecognizedTokenThrowsException() throws IOException {
        ReaderBasedJsonParser parser = createParser("unknownToken");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharacterThrowsException() throws IOException {
        ReaderBasedJsonParser parser = createParser("?");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testIncompleteDecimalThrowsException() throws IOException {
        ReaderBasedJsonParser parser = createParser("123.");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testIncompleteExponentThrowsException() throws IOException {
        ReaderBasedJsonParser parser = createParser("123e");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingRootSpaceBetweenValues() throws IOException {
        ReaderBasedJsonParser parser = createParser("12345\"string\"");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnclosedStringThrowsEOF() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"unclosed string");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testUnclosedCommentThrowsEOF() throws IOException {
        int mask = JsonParser.Feature.ALLOW_COMMENTS.getMask();
        ReaderBasedJsonParser parser = createParser("/* unclosed comment", mask);
        parser.nextToken();
    }

    @Test
    public void testEmptyAndNullEdgeCases() throws IOException {
        ReaderBasedJsonParser pEmpty = createParser("");
        assertNull(pEmpty.nextToken());
        pEmpty.close();

        ReaderBasedJsonParser pWs = createParser("    \t\r\n   ");
        assertNull(pWs.nextToken());
        pWs.close();

        ReaderBasedJsonParser pArray = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, pArray.nextToken());
        assertEquals(JsonToken.END_ARRAY, pArray.nextToken());
        assertNull(pArray.nextToken());
        pArray.close();

        ReaderBasedJsonParser pObj = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, pObj.nextToken());
        assertEquals(JsonToken.END_OBJECT, pObj.nextToken());
        assertNull(pObj.nextToken());
        pObj.close();
    }

    @Test
    public void testLargeNameAndBufferRecycling() throws IOException {
        char[] largeNameChars = new char[500];
        Arrays.fill(largeNameChars, 'x');
        String largeName = new String(largeNameChars);
        String json = "{\"" + largeName + "\": 1}";

        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(largeName, parser.getCurrentName());
        assertNotNull(parser.getTextCharacters());
        assertEquals(largeName.length(), parser.getTextLength());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }
}
