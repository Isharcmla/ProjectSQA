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

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser createParser(String doc, int features) {
        IOContext ctxt = new IOContext(new BufferRecycler(), "test", false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        return new ReaderBasedJsonParser(ctxt, features, new StringReader(doc), null, sym);
    }

    private ReaderBasedJsonParser createParser(String doc) {
        return createParser(doc, 0);
    }

    private ReaderBasedJsonParser createParserWithBuffer(String doc, int features, boolean recyclable) {
        IOContext ctxt = new IOContext(new BufferRecycler(), "test", false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        char[] buf = doc.toCharArray();
        return new ReaderBasedJsonParser(ctxt, features, new StringReader(doc), null, sym, buf, 0, buf.length, recyclable);
    }

    @Test
    public void testConstructorsAndConfig() throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), "test", false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot().makeChild(JsonFactory.Feature.collectDefaults());
        StringReader reader = new StringReader("{\"a\":1}");
        
        ReaderBasedJsonParser parser1 = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym);
        assertNull(parser1.getCodec());
        parser1.setCodec(null);
        assertSame(reader, parser1.getInputSource());

        StringWriter sw = new StringWriter();
        assertEquals(0, parser1.releaseBuffered(sw));

        char[] buf = new char[]{' ', '1'};
        ReaderBasedJsonParser parser2 = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""), null, sym, buf, 0, 2, false);
        assertEquals(2, parser2.releaseBuffered(sw));
        assertEquals(" 1", sw.toString());

        parser1.close();
        parser2.close();
    }

    @Test
    public void testBasicDataTypesAndTextAccess() throws IOException {
        String json = "{\"name\":\"Jackson\", \"num\": 123, \"float\": -45.67e2, \"flag\": true, \"other\": false, \"nil\": null, \"arr\": []}";
        ReaderBasedJsonParser parser = createParser(json);

        assertNull(parser.getText());
        assertEquals(0, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertNull(parser.getTextCharacters());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("{", parser.getText());
        assertArrayEquals("{".toCharArray(), parser.getTextCharacters());
        assertEquals(1, parser.getTextLength());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals("name", parser.getText());
        assertEquals("name", parser.getValueAsString());
        assertEquals("name", parser.getValueAsString("def"));
        assertEquals("name", new String(parser.getTextCharacters(), 0, parser.getTextLength()));
        assertEquals(4, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("Jackson", parser.getText());
        assertEquals("Jackson", parser.getValueAsString());
        assertEquals("Jackson", parser.getValueAsString("default"));
        assertEquals("Jackson", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("num", parser.getText());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals("123", parser.getText());
        assertEquals("123", parser.getValueAsString());
        assertEquals("123", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("float", parser.getText());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-45.67e2, parser.getDoubleValue(), 0.001);
        assertEquals("-45.67e2", parser.getText());
        assertEquals("-45.67e2", parser.getValueAsString());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());
        assertEquals("true", parser.getValueAsString("default"));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals("false", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals("null", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextFieldNameVariants() throws IOException {
        String json = "{\"id\":1, \"desc\":\"item\", \"valid\":true, \"count\":-10, \"ratio\":2.5, \"list\":[1], \"map\":{\"k\":\"v\"}}";
        ReaderBasedJsonParser parser = createParser(json);

        assertTrue(parser.nextFieldName(new SerializedString("id")));
        assertEquals(1, parser.nextIntValue(0));

        assertEquals("desc", parser.nextFieldName());
        assertEquals("item", parser.nextTextValue());

        assertTrue(parser.nextFieldName(new SerializedString("valid")));
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        assertEquals("count", parser.nextFieldName());
        assertEquals(-10L, parser.nextLongValue(0L));

        assertEquals("ratio", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());

        assertEquals("list", parser.nextFieldName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(1, parser.nextIntValue(0));
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals("map", parser.nextFieldName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("k", parser.nextFieldName());
        assertEquals("v", parser.nextTextValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testNextFieldNameMismatchAndOptimization() throws IOException {
        String json = "{\"first\": \"val\", \"second\": 2, \"third\": false}";
        ReaderBasedJsonParser parser = createParser(json);

        assertFalse(parser.nextFieldName(new SerializedString("second")));
        assertEquals("first", parser.getCurrentName());
        assertEquals("val", parser.nextTextValue());

        assertFalse(parser.nextFieldName(new SerializedString("nomatch")));
        assertEquals("second", parser.getCurrentName());
        assertEquals(2, parser.nextIntValue(0));

        assertTrue(parser.nextFieldName(new SerializedString("third")));
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextValueMethodsDirect() throws IOException {
        String json = "[\"text\", 100, 20000000000, true, false, null]";
        ReaderBasedJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals("text", parser.nextTextValue());
        assertEquals(100, parser.nextIntValue(0));
        assertEquals(20000000000L, parser.nextLongValue(0L));
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
        assertNull(parser.nextBooleanValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextTextValue());
        parser.close();
    }

    @Test
    public void testNumberParsingVariousFormats() throws IOException {
        String json = "[0, 0.0, 0.5, -0, -0.0, 123456, -98765, 1.0e10, 2.5E-3, -3.2e+2, 0.123e4]";
        ReaderBasedJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.0, parser.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.5, parser.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.0, parser.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123456, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-98765, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.0e10, parser.getDoubleValue(), 10.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(2.5e-3, parser.getDoubleValue(), 0.00001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-320.0, parser.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1230.0, parser.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testLeadingZeroesFeature() throws IOException {
        int feat = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        ReaderBasedJsonParser parser = createParser("[007, 000, 0123]", feat);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(7, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();

        ReaderBasedJsonParser failParser = createParser("[007]");
        assertEquals(JsonToken.START_ARRAY, failParser.nextToken());
        try {
            failParser.nextToken();
            fail("Should fail on leading zeroes");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        }
        failParser.close();
    }

    @Test
    public void testAllowNonNumericNumbers() throws IOException {
        int feat = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        String json = "[NaN, Infinity, +Infinity, -Infinity, +INF, -INF]";
        ReaderBasedJsonParser parser = createParser(json, feat);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();

        ReaderBasedJsonParser failParser = createParser("[NaN]");
        failParser.nextToken();
        try {
            failParser.nextToken();
            fail("Should fail on NaN when feature disabled");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Non-standard token 'NaN'"));
        }
        failParser.close();
    }

    @Test
    public void testStringEscapesAndUnicode() throws IOException {
        String json = "[\"Quote: \\\" Backslash: \\\\ Slash: \\/ Bell: \\b Tab: \\t LF: \\n FF: \\f CR: \\r Unicode: \\u0041\\u0042\"]";
        ReaderBasedJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("Quote: \" Backslash: \\ Slash: / Bell: \b Tab: \t LF: \n FF: \f CR: \r Unicode: AB", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testSingleQuotesAndUnquotedFieldNames() throws IOException {
        int feat = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask() | JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        String json = "{unquoted_id: 'single quoted string', another: 123}";
        ReaderBasedJsonParser parser = createParser(json, feat);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("unquoted_id", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("single quoted string", parser.getText());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("another", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testComments() throws IOException {
        int feat = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String json = "/* C-style */\n" +
                "{\n" +
                "// C++ style\n" +
                "\"a\": 1, # YAML style\n" +
                "\"b\": 2\n" +
                "}";
        ReaderBasedJsonParser parser = createParser(json, feat);

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

    @Test
    public void testBinaryValuesBase64() throws IOException {
        byte[] originalData = "Hello World! Jackson Binary Parsing Test.".getBytes("UTF-8");
        String base64Mime = Base64Variants.MIME.encode(originalData);
        String json = "[\"" + base64Mime + "\", \"" + base64Mime + "\"]";

        ReaderBasedJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded1 = parser.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(originalData, decoded1);

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesRead = parser.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(originalData.length, bytesRead);
        assertArrayEquals(originalData, baos.toByteArray());

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testLocationTracking() throws IOException {
        String json = "{\n  \"field\": 123\n}";
        ReaderBasedJsonParser parser = createParser(json);

        JsonLocation loc = parser.getCurrentLocation();
        assertEquals(1, loc.getLineNr());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field", parser.getCurrentName());
        JsonLocation tokenLoc = parser.getTokenLocation();
        assertEquals(2, tokenLoc.getLineNr());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testSkipStringDirectly() throws IOException {
        String json = "[\"skipped string\", 123]";
        ReaderBasedJsonParser parser = createParser(json);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testInvalidJsonErrors() throws IOException {
        try {
            ReaderBasedJsonParser parser = createParser("}");
            parser.nextToken();
            fail("Expected parse exception for misplaced }");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected a value") || e.getMessage().contains("Unexpected close marker"));
        }

        try {
            ReaderBasedJsonParser parser = createParser("{\"a\":}");
            parser.nextToken();
            parser.nextToken();
            fail("Expected parse exception for missing object value");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected a value"));
        }

        try {
            ReaderBasedJsonParser parser = createParser("{\"a\" 1}");
            parser.nextToken();
            parser.nextToken();
            fail("Expected parse exception for missing colon");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting a colon"));
        }

        try {
            ReaderBasedJsonParser parser = createParser("[1 2]");
            parser.nextToken();
            parser.nextToken();
            parser.nextToken();
            fail("Expected parse exception for missing comma");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting comma"));
        }

        try {
            ReaderBasedJsonParser parser = createParser("[\"unclosed string]");
            parser.nextToken();
            parser.nextToken();
            parser.getText();
            fail("Expected parse exception for EOF in string");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting closing quote"));
        }

        try {
            ReaderBasedJsonParser parser = createParser("[\"bad hex \\u00Z0\"]");
            parser.nextToken();
            parser.nextToken();
            parser.getText();
            fail("Expected parse exception for bad hex escape");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected a hex-digit"));
        }
    }

    @Test
    public void testInvalidNumberErrors() throws IOException {
        try {
            ReaderBasedJsonParser parser = createParser("[-]");
            parser.nextToken();
            parser.nextToken();
            fail("Expected error on lone minus");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected digit"));
        }

        try {
            ReaderBasedJsonParser parser = createParser("[1.]");
            parser.nextToken();
            parser.nextToken();
            fail("Expected error on missing fraction digit");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Decimal point not followed by a digit"));
        }

        try {
            ReaderBasedJsonParser parser = createParser("[1e]");
            parser.nextToken();
            parser.nextToken();
            fail("Expected error on missing exponent digit");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Exponent indicator not followed by a digit"));
        }
    }

    @Test
    public void testEmptyAndBufferRecyclable() throws IOException {
        ReaderBasedJsonParser parser = createParserWithBuffer("", 0, false);
        assertNull(parser.nextToken());
        parser.close();
    }
}
