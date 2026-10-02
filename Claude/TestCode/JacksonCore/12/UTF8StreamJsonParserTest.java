import com.fasterxml.jackson.core.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Arrays;

public class UTF8StreamJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser createParser(String json) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        return factory.createParser(in);
    }

    private JsonParser createParserBytes(byte[] bytes) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        return factory.createParser(in);
    }

    // ---------- Basic object/array parsing ----------

    @Test
    public void testParseSimpleObject_typicalInput_returnsExpectedTokens() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":\"hello\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testParseSimpleArray_typicalInput_returnsExpectedTokens() throws IOException {
        JsonParser p = createParser("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testParseEmptyObject_edgeCase_returnsEndObject() throws IOException {
        JsonParser p = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testParseEmptyArray_edgeCase_returnsEndArray() throws IOException {
        JsonParser p = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testParseEmptyInput_edgeCase_returnsNull() throws IOException {
        JsonParser p = createParser("");
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testParseNestedObjectsAndArrays_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"arr\":[{\"x\":1},{\"y\":2}]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("x", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("y", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    // ---------- Mismatched brackets (exception) ----------

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("[1,2}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken(); // this should throw due to mismatched close
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingComma_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // should throw expecting comma
        p.close();
    }

    // ---------- Number parsing ----------

    @Test
    public void testParseNegativeNumber_typicalInput_success() throws IOException {
        JsonParser p = createParser("-123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-123, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseFloatNumber_typicalInput_success() throws IOException {
        JsonParser p = createParser("123.456");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(123.456, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseExponentNumber_typicalInput_success() throws IOException {
        JsonParser p = createParser("1.5e10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5e10, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseNegativeExponentNumber_typicalInput_success() throws IOException {
        JsonParser p = createParser("-1.5E-10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        p.close();
    }

    @Test
    public void testParseZero_edgeCase_success() throws IOException {
        JsonParser p = createParser("0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseLeadingZeroDisallowed_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("01");
        try {
            p.nextToken();
            fail("Expected JsonParseException for leading zero");
        } catch (JsonParseException e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testParseLongNumberAcrossBoundary_typicalInput_success() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            sb.append('1');
        }
        JsonParser p = createParser(sb.toString());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertNotNull(p.getText());
        p.close();
    }

    @Test
    public void testParseNegativeSignFollowedByNonDigit_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("-a");
        try {
            p.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
        p.close();
    }

    // ---------- Boolean & null ----------

    @Test
    public void testParseTrueFalseNull_typicalInput_success() throws IOException {
        JsonParser p = createParser("[true,false,null]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertFalse(p.getBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    // ---------- String parsing / escapes ----------

    @Test
    public void testParseStringWithEscapes_typicalInput_success() throws IOException {
        JsonParser p = createParser("\"hello\\nworld\\t\\\"quoted\\\"\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        String text = p.getText();
        assertTrue(text.contains("\n"));
        assertTrue(text.contains("\t"));
        assertTrue(text.contains("\""));
        p.close();
    }

    @Test
    public void testParseStringWithUnicodeEscape_typicalInput_success() throws IOException {
        JsonParser p = createParser("\"\\u0041\\u0042\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("AB", p.getText());
        p.close();
    }

    @Test
    public void testParseEmptyString_edgeCase_success() throws IOException {
        JsonParser p = createParser("\"\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("", p.getText());
        p.close();
    }

    @Test
    public void testGetTextCharacters_stringToken_success() throws IOException {
        JsonParser p = createParser("\"abc\"");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertNotNull(chars);
        assertEquals(3, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextCharacters_fieldName_success() throws IOException {
        JsonParser p = createParser("{\"fieldname\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        char[] chars = p.getTextCharacters();
        assertNotNull(chars);
        assertEquals("fieldname".length(), p.getTextLength());
        p.close();
    }

    @Test
    public void testParseLongFieldNameAcrossBoundary_typicalInput_success() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"");
        for (int i = 0; i < 50; i++) {
            sb.append("abcdefgh");
        }
        sb.append("\":1}");
        JsonParser p = createParser(sb.toString());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNotNull(p.getCurrentName());
        p.close();
    }

    @Test
    public void testParseStringWithMultiByteUtf8_typicalInput_success() throws IOException {
        // 2-byte, 3-byte UTF-8 chars
        String json = "\"\u00e9\u4e2d\"";
        JsonParser p = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        String text = p.getText();
        assertEquals("\u00e9\u4e2d", text);
        p.close();
    }

    @Test
    public void testParseLongStringAcrossBuffer_typicalInput_success() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        for (int i = 0; i < 10000; i++) {
            sb.append('x');
        }
        sb.append("\"");
        JsonParser p = createParser(sb.toString());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(10000, p.getText().length());
        p.close();
    }

    // ---------- getValueAsString / getValueAsInt ----------

    @Test
    public void testGetValueAsString_stringToken_returnsText() throws IOException {
        JsonParser p = createParser("\"value\"");
        p.nextToken();
        assertEquals("value", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsString_withDefault_nonStringToken_returnsDefault() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        assertEquals("default", p.getValueAsString("default"));
        p.close();
    }

    @Test
    public void testGetValueAsString_fieldName_returnsName() throws IOException {
        JsonParser p = createParser("{\"key\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("key", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsInt_numberToken_returnsInt() throws IOException {
        JsonParser p = createParser("42");
        p.nextToken();
        assertEquals(42, p.getValueAsInt());
        p.close();
    }

    @Test
    public void testGetValueAsInt_withDefault_nonNumberToken_returnsDefault() throws IOException {
        JsonParser p = createParser("\"abc\"");
        p.nextToken();
        assertEquals(99, p.getValueAsInt(99));
        p.close();
    }

    @Test
    public void testGetValueAsInt_floatToken_returnsIntPart() throws IOException {
        JsonParser p = createParser("42.9");
        p.nextToken();
        assertEquals(42, p.getValueAsInt());
        p.close();
    }

    // ---------- nextFieldName ----------

    @Test
    public void testNextFieldName_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":2}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        String name = p.nextFieldName();
        assertEquals("a", name);
        p.nextToken();
        name = p.nextFieldName();
        assertEquals("b", name);
        p.close();
    }

    @Test
    public void testNextFieldNameWithSerializableString_matches_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"target\":1}");
        p.nextToken();
        SerializableString ss = new SerializedString("target");
        boolean matched = p.nextFieldName(ss);
        assertTrue(matched);
        p.close();
    }

    @Test
    public void testNextFieldNameWithSerializableString_noMatch_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"other\":1}");
        p.nextToken();
        SerializableString ss = new SerializedString("target");
        boolean matched = p.nextFieldName(ss);
        assertFalse(matched);
        p.close();
    }

    @Test
    public void testNextFieldName_endOfObject_returnsNull() throws IOException {
        JsonParser p = createParser("{}");
        p.nextToken();
        String name = p.nextFieldName();
        assertNull(name);
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    // ---------- nextTextValue / nextIntValue / nextLongValue / nextBooleanValue ----------

    @Test
    public void testNextTextValue_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"a\":\"hello\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        String text = p.nextTextValue();
        assertEquals("hello", text);
        p.close();
    }

    @Test
    public void testNextTextValue_nonStringValue_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        String text = p.nextTextValue();
        assertNull(text);
        p.close();
    }

    @Test
    public void testNextIntValue_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        int val = p.nextIntValue(-1);
        assertEquals(42, val);
        p.close();
    }

    @Test
    public void testNextIntValue_nonIntValue_returnsDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        int val = p.nextIntValue(-1);
        assertEquals(-1, val);
        p.close();
    }

    @Test
    public void testNextLongValue_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        long val = p.nextLongValue(-1L);
        assertEquals(123456789012L, val);
        p.close();
    }

    @Test
    public void testNextLongValue_nonLongValue_returnsDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        long val = p.nextLongValue(-1L);
        assertEquals(-1L, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_true_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.TRUE, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_false_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.FALSE, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_nonBoolean_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertNull(val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_topLevelTrue_returnsTrue() throws IOException {
        JsonParser p = createParser("true");
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.TRUE, val);
        p.close();
    }

    @Test
    public void testNextIntValue_arrayStart_setsArrayContext() throws IOException {
        JsonParser p = createParser("{\"a\":[1,2]}");
        p.nextToken();
        p.nextToken();
        int val = p.nextIntValue(-1);
        assertEquals(-1, val);
        assertEquals(JsonToken.START_ARRAY, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextIntValue_objectStart_setsObjectContext() throws IOException {
        JsonParser p = createParser("{\"a\":{\"b\":1}}");
        p.nextToken();
        p.nextToken();
        int val = p.nextIntValue(-1);
        assertEquals(-1, val);
        assertEquals(JsonToken.START_OBJECT, p.getCurrentToken());
        p.close();
    }

    // ---------- Binary / Base64 ----------

    @Test
    public void testGetBinaryValue_typicalInput_success() throws IOException {
        byte[] data = "hello".getBytes("UTF-8");
        String encoded = java.util.Base64.getEncoder().encodeToString(data);
        JsonParser p = createParser("\"" + encoded + "\"");
        p.nextToken();
        byte[] result = p.getBinaryValue();
        assertArrayEquals(data, result);
        p.close();
    }

    @Test
    public void testReadBinaryValue_typicalInput_success() throws IOException {
        byte[] data = "world!!".getBytes("UTF-8");
        String encoded = java.util.Base64.getEncoder().encodeToString(data);
        JsonParser p = createParser("\"" + encoded + "\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.readBinaryValue(out);
        assertEquals(data.length, count);
        assertArrayEquals(data, out.toByteArray());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_nonStringToken_throwsException() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue();
        p.close();
    }

    // ---------- Comments (if enabled) ----------

    @Test
    public void testParseWithCommentsEnabled_typicalInput_success() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = f.createParser("[1, /* comment */ 2, // line comment\n 3]".getBytes("UTF-8"));
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testParseWithCommentsDisabled_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("[1, /* comment */ 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // should throw since comments not enabled by default
        p.close();
    }

    // ---------- Single quotes (if enabled) ----------

    @Test
    public void testParseWithSingleQuotesEnabled_typicalInput_success() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        JsonParser p = f.createParser("{'a':'b'}".getBytes("UTF-8"));
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("b", p.getText());
        p.close();
    }

    // ---------- Unquoted field names (if enabled) ----------

    @Test
    public void testParseWithUnquotedFieldNamesEnabled_typicalInput_success() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        JsonParser p = f.createParser("{abc:1}".getBytes("UTF-8"));
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    // ---------- NaN / Infinity (if enabled) ----------

    @Test
    public void testParseNaNEnabled_typicalInput_success() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = f.createParser("NaN".getBytes("UTF-8"));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testParseNaNDisabled_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("NaN");
        p.nextToken();
        p.close();
    }

    // ---------- Root value space checks ----------

    @Test
    public void testMultipleRootValuesWithSpace_typicalInput_success() throws IOException {
        JsonFactory f = new JsonFactory();
        f.disable(JsonFactory.Feature.INTERN_FIELD_NAMES); // no-op just to make factory unique
        JsonParser p = createParser("1 2");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        p.close();
    }

    // ---------- getCodec / setCodec ----------

    @Test
    public void testGetSetCodec_typicalInput_success() throws IOException {
        JsonParser p = createParser("1");
        ObjectCodec codec = null;
        p.setCodec(codec);
        assertNull(p.getCodec());
        p.close();
    }

    // ---------- getInputSource ----------

    @Test
    public void testGetInputSource_typicalInput_returnsInputStream() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes("UTF-8"));
        JsonParser p = factory.createParser(in);
        assertTrue(p instanceof com.fasterxml.jackson.core.json.UTF8StreamJsonParser);
        Object src = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser) p).getInputSource();
        assertSame(in, src);
        p.close();
    }

    // ---------- releaseBuffered ----------

    @Test
    public void testReleaseBuffered_typicalInput_returnsBufferedCount() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("123456".getBytes("UTF-8"));
        JsonParser p = factory.createParser(in);
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        if (p instanceof com.fasterxml.jackson.core.json.UTF8StreamJsonParser) {
            int count = ((com.fasterxml.jackson.core.json.UTF8StreamJsonParser) p).releaseBuffered(out);
            assertTrue(count >= 0);
        }
        p.close();
    }

    // ---------- close and buffer release ----------

    @Test
    public void testClose_typicalInput_success() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        p.close();
        assertTrue(p.isClosed());
    }

    // ---------- getTokenLocation / getCurrentLocation ----------

    @Test
    public void testGetTokenLocation_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        p.close();
    }

    @Test
    public void testGetCurrentLocation_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        JsonLocation loc = p.getCurrentLocation();
        assertNotNull(loc);
        p.close();
    }

    // ---------- Invalid unexpected value ----------

    @Test(expected = JsonParseException.class)
    public void testUnexpectedValue_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("@invalid");
        p.nextToken();
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidTokenStart_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("xyz");
        p.nextToken();
        p.close();
    }

    // ---------- Escaped surrogate pairs (4-byte UTF-8 within string) ----------

    @Test
    public void testParseStringWithSurrogatePairEscape_typicalInput_success() throws IOException {
        JsonParser p = createParser("\"\\uD83D\\uDE00\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        String text = p.getText();
        assertNotNull(text);
        p.close();
    }

    // ---------- Field name with escape ----------

    @Test
    public void testParseFieldNameWithEscape_typicalInput_success() throws IOException {
        JsonParser p = createParser("{\"a\\tb\":1}");
        p.nextToken();
        p.nextToken();
        String name = p.getCurrentName();
        assertTrue(name.contains("\t"));
        p.close();
    }

    // ---------- Invalid EOF within string ----------

    @Test(expected = JsonParseException.class)
    public void testUnterminatedString_edgeCase_throwsException() throws IOException {
        JsonParser p = createParser("\"unterminated");
        p.nextToken();
        p.getText();
        p.close();
    }

    // ---------- Long text spanning multiple segments for getText ----------

    @Test
    public void testGetText_numberToken_returnsCorrectString() throws IOException {
        JsonParser p = createParser("12345");
        p.nextToken();
        assertEquals("12345", p.getText());
        p.close();
    }

    @Test
    public void testGetText_booleanToken_returnsCorrectString() throws IOException {
        JsonParser p = createParser("true");
        p.nextToken();
        assertEquals("true", p.getText());
        p.close();
    }

    @Test
    public void testGetText_nullToken_returnsCorrectString() throws IOException {
        JsonParser p = createParser("null");
        p.nextToken();
        assertEquals("null", p.getText());
        p.close();
    }

    // ---------- Deeply nested structure to test context stack ----------

    @Test
    public void testDeeplyNestedStructure_typicalInput_success() throws IOException {
        StringBuilder sb = new StringBuilder();
        int depth = 50;
        for (int i = 0; i < depth; i++) {
            sb.append("[");
        }
        for (int i = 0; i < depth; i++) {
            sb.append("]");
        }
        JsonParser p = createParser(sb.toString());
        for (int i = 0; i < depth; i++) {
            assertEquals(JsonToken.START_ARRAY, p.nextToken());
        }
        for (int i = 0; i < depth; i++) {
            assertEquals(JsonToken.END_ARRAY, p.nextToken());
        }
        assertNull(p.nextToken());
        p.close();
    }
}
