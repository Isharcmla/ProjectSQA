package com.fasterxml.jackson.core.json;

import java.io.*;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest
{
    private IOContext createIOContext() {
        return new IOContext(new BufferRecycler(), "testSource", false);
    }

    private ReaderBasedJsonParser createParser(String json) {
        return createParser(new StringReader(json), 0, null);
    }

    private ReaderBasedJsonParser createParser(Reader r, int features, ObjectCodec codec) {
        IOContext ctxt = createIOContext();
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot(12345);
        return new ReaderBasedJsonParser(ctxt, features, r, codec, sym);
    }

    private ReaderBasedJsonParser createParser(String json, int features) {
        return createParser(new StringReader(json), features, null);
    }

    // Helper reader that yields very few characters at a time to force loadMore()
    private static class ChunkedReader extends Reader {
        private final String _data;
        private final int _chunkSize;
        private int _pos = 0;

        public ChunkedReader(String data, int chunkSize) {
            _data = data;
            _chunkSize = chunkSize;
        }

        @Override
        public int read(char[] cbuf, int off, int len) {
            if (_pos >= _data.length()) {
                return -1;
            }
            int toRead = Math.min(len, Math.min(_chunkSize, _data.length() - _pos));
            _data.getChars(_pos, _pos + toRead, cbuf, off);
            _pos += toRead;
            return toRead;
        }

        @Override
        public void close() {
        }
    }

    @Test
    public void testConstructorAndGetters_normal_success() throws IOException {
        String json = "{}";
        StringReader reader = new StringReader(json);
        ReaderBasedJsonParser parser = createParser(reader, 0, null);

        assertNull(parser.getCodec());
        assertSame(reader, parser.getInputSource());

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
        assertSame(mockCodec, parser.getCodec());

        parser.close();
    }

    @Test
    public void testReleaseBuffered_normalAndEmpty_success() throws IOException {
        ReaderBasedJsonParser parser = createParser("   {\"a\": 1} rest");
        StringWriter sw = new StringWriter();
        assertEquals(0, parser.releaseBuffered(sw));

        parser.nextToken(); // START_OBJECT
        int released = parser.releaseBuffered(sw);
        assertTrue(released > 0);
        assertTrue(sw.toString().contains("a"));

        assertEquals(0, parser.releaseBuffered(sw));
        parser.close();
    }

    @Test
    public void testGetTextAndVariants_allTokenTypes_correctValues() throws IOException {
        String json = "{\"str\": \"hello world\", \"num\": 1234, \"float\": 56.78, \"bool\": true, \"nul\": null}";
        ReaderBasedJsonParser parser = createParser(json);

        assertNull(parser.getText());
        assertNull(parser.getTextCharacters());
        assertEquals(0, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertNull(parser.getValueAsString());
        assertEquals("default", parser.getValueAsString("default"));

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("{", parser.getText());
        assertNotNull(parser.getTextCharacters());
        assertEquals(1, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("str", parser.getText());
        assertEquals("str", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));
        assertEquals(3, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello world", parser.getValueAsString());
        assertEquals("hello world", parser.getValueAsString("def"));
        assertEquals("hello world", parser.getText());
        assertEquals("hello world", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));
        assertEquals(11, parser.getTextLength());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("1234", parser.getText());
        assertEquals(1234, parser.getIntValue());
        assertEquals("1234", parser.getValueAsString());
        assertEquals("1234", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));
        assertEquals(4, parser.getTextLength());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("56.78", parser.getText());
        assertEquals("56.78", parser.getValueAsString());
        assertEquals("56.78", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));
        assertEquals(5, parser.getTextLength());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());
        assertEquals("true", parser.getValueAsString());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals("null", parser.getText());
        assertNull(parser.getValueAsString());
        assertEquals("defaultVal", parser.getValueAsString("defaultVal"));

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals("}", parser.getText());

        assertNull(parser.nextToken());
        assertNull(parser.getText());
        parser.close();
    }

    @Test
    public void testNextOptimizedMethods_variousTokens_correctValues() throws IOException {
        String json = "{\"name\":\"John\", \"age\":30, \"id\":9876543210123, \"flag\":true, \"flag2\":false, \"obj\":{}, \"arr\":[]}";
        ReaderBasedJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("John", parser.nextTextValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(30, parser.nextIntValue(0));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(9876543210123L, parser.nextLongValue(0L));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertNull(parser.nextTextValue()); // obj starts

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(99, parser.nextIntValue(99)); // arr starts

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextOptimizedMethods_standaloneTokens_correctValues() throws IOException {
        ReaderBasedJsonParser p1 = createParser("\"standalone\"");
        assertEquals("standalone", p1.nextTextValue());
        p1.close();

        ReaderBasedJsonParser p2 = createParser("42");
        assertEquals(42, p2.nextIntValue(0));
        p2.close();

        ReaderBasedJsonParser p3 = createParser("123456789012");
        assertEquals(123456789012L, p3.nextLongValue(0L));
        p3.close();

        ReaderBasedJsonParser p4 = createParser("true false null");
        assertEquals(Boolean.TRUE, p4.nextBooleanValue());
        assertEquals(Boolean.FALSE, p4.nextBooleanValue());
        assertNull(p4.nextBooleanValue());
        p4.close();
    }

    @Test
    public void testNumbers_allFormats_success() throws IOException {
        String[] validNumbers = new String[] {
            "0", "-0", "1", "-1", "123456789", "-987654321",
            "0.0", "-0.0", "12.345", "-67.89",
            "1e5", "1e-5", "1e+5", "1.23e4", "-4.56E-2", "0E0"
        };
        for (String numStr : validNumbers) {
            ReaderBasedJsonParser parser = createParser(numStr);
            JsonToken t = parser.nextToken();
            assertTrue(t == JsonToken.VALUE_NUMBER_INT || t == JsonToken.VALUE_NUMBER_FLOAT);
            assertEquals(numStr, parser.getText());
            parser.close();
        }
    }

    @Test
    public void testNumbers_chunkedReader_parseNumber2() throws IOException {
        String json = " -123.456e+2 ";
        ReaderBasedJsonParser parser = createParser(new ChunkedReader(json, 2), 0, null);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals("-123.456e+2", parser.getText());
        assertEquals(Double.parseDouble("-123.456e+2"), parser.getDoubleValue(), 0.0001);
        parser.close();
    }

    @Test
    public void testNumbers_leadingZeroes_allowedAndDisallowed() throws IOException {
        // Disallowed by default
        ReaderBasedJsonParser p1 = createParser("0123");
        try {
            p1.nextToken();
            fail("Expected exception for leading zeroes");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        }
        p1.close();

        // Allowed via feature
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        ReaderBasedJsonParser p2 = createParser("000123", features);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        assertEquals("123", parserTextIgnoringZeroes(p2.getText()));
        p2.close();

        ReaderBasedJsonParser p3 = createParser("000.5", features);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p3.nextToken());
        assertEquals("0.5", parserTextIgnoringZeroes(p3.getText()));
        p3.close();
    }

    private String parserTextIgnoringZeroes(String text) {
        return text.replaceFirst("^0+(?!$)", "");
    }

    @Test
    public void testNumbers_nonNumericNumbers_allowedAndDisallowed() throws IOException {
        String[] tokens = new String[] { "NaN", "Infinity", "-Infinity", "+INF", "-INF", "+Infinity" };

        for (String token : tokens) {
            ReaderBasedJsonParser parser = createParser(token);
            try {
                parser.nextToken();
                fail("Expected exception for non-standard number token " + token);
            } catch (JsonParseException e) {
                assertTrue(e.getMessage().contains("Non-standard token") || e.getMessage().contains("expected digit"));
            }
            parser.close();
        }

        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        ReaderBasedJsonParser pNaN = createParser("NaN", features);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, pNaN.nextToken());
        assertTrue(Double.isNaN(pNaN.getDoubleValue()));
        pNaN.close();

        ReaderBasedJsonParser pInf = createParser("Infinity", features);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, pInf.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, pInf.getDoubleValue(), 0.0);
        pInf.close();

        ReaderBasedJsonParser pNegInf = createParser("-Infinity", features);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, pNegInf.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, pNegInf.getDoubleValue(), 0.0);
        pNegInf.close();

        ReaderBasedJsonParser pPlusInf = createParser("+INF", features);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, pPlusInf.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, pPlusInf.getDoubleValue(), 0.0);
        pPlusInf.close();

        ReaderBasedJsonParser pMinusInf = createParser("-INF", features);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, pMinusInf.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, pMinusInf.getDoubleValue(), 0.0);
        pMinusInf.close();
    }

    @Test
    public void testStrings_escapesAndUnicode_success() throws IOException {
        String json = "\"\\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041 \\u0020\"";
        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\" \\ / \b \f \n \r \t A  ", parser.getText());
        parser.close();
    }

    @Test
    public void testStrings_singleQuotes_allowedAndDisallowed() throws IOException {
        ReaderBasedJsonParser p1 = createParser("'hello'");
        try {
            p1.nextToken();
            fail("Expected exception for single quotes");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected a valid value"));
        }
        p1.close();

        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        ReaderBasedJsonParser p2 = createParser("'hello \\'world\\''", features);
        assertEquals(JsonToken.VALUE_STRING, p2.nextToken());
        assertEquals("hello 'world'", p2.getText());
        p2.close();
    }

    @Test
    public void testStrings_skipString_unparsedSkipped() throws IOException {
        String json = "[\"skipped string with \\\" escape\", 123]";
        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        // do not call getText(), advance to nextToken directly to trigger _skipString
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testFieldNames_unquotedAndApos_allowedAndDisallowed() throws IOException {
        // Disallowed unquoted
        ReaderBasedJsonParser p1 = createParser("{foo: 123}");
        try {
            p1.nextToken();
            fail("Expected exception for unquoted field name");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting double-quote"));
        }
        p1.close();

        // Allowed unquoted
        int features = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        ReaderBasedJsonParser p2 = createParser("{foo_bar: 123, $dollar: 456}", features);
        assertEquals(JsonToken.START_OBJECT, p2.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p2.nextToken());
        assertEquals("foo_bar", p2.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p2.nextToken());
        assertEquals("$dollar", p2.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        assertEquals(JsonToken.END_OBJECT, p2.nextToken());
        p2.close();

        // Allowed single quotes
        features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        ReaderBasedJsonParser p3 = createParser("{'name': 'value', 'escape\\'d': 1}", features);
        assertEquals(JsonToken.START_OBJECT, p3.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p3.nextToken());
        assertEquals("name", p3.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p3.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p3.nextToken());
        assertEquals("escape'd", p3.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p3.nextToken());
        assertEquals(JsonToken.END_OBJECT, p3.nextToken());
        p3.close();
    }

    @Test
    public void testComments_cAndCppAndYaml_handledCorrectly() throws IOException {
        // Comments not allowed
        ReaderBasedJsonParser p1 = createParser("/* comment */ 123");
        try {
            p1.nextToken();
            fail("Expected exception for comment");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("ALLOW_COMMENTS"));
        }
        p1.close();

        // C & C++ Comments allowed
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask();
        String jsonWithComments = "/* block \n comment */ // line comment\r\n 123";
        ReaderBasedJsonParser p2 = createParser(jsonWithComments, features);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        assertEquals(123, p2.getIntValue());
        assertNull(p2.nextToken());
        p2.close();

        // YAML comment allowed
        features = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String jsonYaml = "# yaml comment\r\n 456";
        ReaderBasedJsonParser p3 = createParser(jsonYaml, features);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p3.nextToken());
        assertEquals(456, p3.getIntValue());
        assertNull(p3.nextToken());
        p3.close();
    }

    @Test
    public void testBase64_getBinaryValue_successAndExceptions() throws IOException {
        byte[] original = "Jackson JSON Base64 Parsing Test! 1234567890".getBytes("UTF-8");
        String b64 = Base64Variants.MIME.encode(original);

        ReaderBasedJsonParser parser = createParser("\"" + b64 + "\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded = parser.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(original, decoded);
        // Call second time when already decoded
        assertArrayEquals(original, parser.getBinaryValue(Base64Variants.MIME));
        parser.close();

        // Non-string token error
        ReaderBasedJsonParser p2 = createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        try {
            p2.getBinaryValue(Base64Variants.MIME);
            fail("Expected error accessing binary from number");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("not VALUE_STRING"));
        }
        p2.close();
    }

    @Test
    public void testBase64_readBinaryValue_streamOutput() throws IOException {
        byte[] original = new byte[500];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) (i & 0xFF);
        }
        String b64 = Base64Variants.MIME.encode(original);

        ReaderBasedJsonParser parser = createParser("\"" + b64 + "\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(original.length, count);
        assertArrayEquals(original, baos.toByteArray());
        parser.close();
    }

    @Test
    public void testBase64_chunkedWithWhitespaceAndPadding_success() throws IOException {
        byte[] original = "Testing 1, 2, 3".getBytes("UTF-8");
        String b64 = Base64Variants.MIME.encode(original); // includes padding =
        String chunkedJson = "\"" + b64.substring(0, 4) + "\n" + b64.substring(4) + "\"";

        ReaderBasedJsonParser parser = createParser(new ChunkedReader(chunkedJson, 3), 0, null);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(original.length, count);
        assertArrayEquals(original, baos.toByteArray());
        parser.close();
    }

    @Test
    public void testBase64_noPaddingVariant_success() throws IOException {
        byte[] original = "Test".getBytes("UTF-8");
        Base64Variant noPaddingVariant = Base64Variants.MODIFIED_FOR_URL;
        String b64 = noPaddingVariant.encode(original);

        ReaderBasedJsonParser parser = createParser("\"" + b64 + "\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded = parser.getBinaryValue(noPaddingVariant);
        assertArrayEquals(original, decoded);
        parser.close();
    }

    @Test
    public void testInvalidTokensAndStructures_throwsExceptions() throws IOException {
        // Mismatched curly brace in array
        ReaderBasedJsonParser p1 = createParser("[}");
        p1.nextToken();
        try {
            p1.nextToken();
            fail("Expected mismatched bracket exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Mismatched"));
        }
        p1.close();

        // Mismatched square bracket in object
        ReaderBasedJsonParser p2 = createParser("{]");
        p2.nextToken();
        try {
            p2.nextToken();
            fail("Expected mismatched curly exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Mismatched"));
        }
        p2.close();

        // Missing colon in object
        ReaderBasedJsonParser p3 = createParser("{\"key\" 123}");
        p3.nextToken();
        try {
            p3.nextToken();
            fail("Expected colon exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting a colon"));
        }
        p3.close();

        // Missing comma between entries
        ReaderBasedJsonParser p4 = createParser("[1 2]");
        p4.nextToken();
        p4.nextToken();
        try {
            p4.nextToken();
            fail("Expected comma exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting comma"));
        }
        p4.close();

        // Invalid token literal
        ReaderBasedJsonParser p5 = createParser("truX");
        try {
            p5.nextToken();
            fail("Expected unrecognized token exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unrecognized token"));
        }
        p5.close();
    }

    @Test
    public void testEofExceptions_variousScenarios() throws IOException {
        // EOF in string
        ReaderBasedJsonParser p1 = createParser("\"unclosed string");
        try {
            p1.nextToken();
            fail("Expected EOF in string exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expecting closing quote"));
        }
        p1.close();

        // EOF in escape sequence
        ReaderBasedJsonParser p2 = createParser("\"escape \\u00");
        try {
            p2.nextToken();
            fail("Expected EOF in unicode escape exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("character escape sequence"));
        }
        p2.close();

        // EOF in number exponent
        ReaderBasedJsonParser p3 = createParser("123.45e");
        try {
            p3.nextToken();
            fail("Expected EOF in exponent exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Exponent indicator") || e.getMessage().contains("exponent"));
        }
        p3.close();

        // EOF in comment
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask();
        ReaderBasedJsonParser p4 = createParser("/* unclosed comment", features);
        try {
            p4.nextToken();
            fail("Expected EOF in comment exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("in a comment"));
        }
        p4.close();
    }

    @Test
    public void testCRAndLFLineCounting_correctTracking() throws IOException {
        String json = "{\r\n\"a\"\r:\n1\r\n}";
        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }
}
