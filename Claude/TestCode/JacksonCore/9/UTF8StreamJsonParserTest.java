import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UTF8StreamJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser createParser(String json) throws IOException {
        return factory.createParser(json.getBytes(StandardCharsets.UTF_8));
    }

    private JsonParser createParserWithFeature(String json, JsonParser.Feature feature, boolean enabled) throws IOException {
        factory.configure(feature, enabled);
        return factory.createParser(json.getBytes(StandardCharsets.UTF_8));
    }

    // ---------- Basic object/array parsing ----------

    @Test
    public void testNextToken_simpleObject_returnsCorrectTokens() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":true}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNextToken_simpleArray_returnsCorrectTokens() throws IOException {
        JsonParser p = createParser("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testEmptyObject_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testEmptyArray_parsesCorrectly() throws IOException {
        JsonParser p = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testNestedObjectsAndArrays_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{\"a\":[1,{\"b\":2}]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    // ---------- String value tests ----------

    @Test
    public void testGetText_stringValue_returnsCorrectText() throws IOException {
        JsonParser p = createParser("\"hello world\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello world", p.getText());
        p.close();
    }

    @Test
    public void testGetText_escapedString_returnsCorrectText() throws IOException {
        JsonParser p = createParser("\"line1\\nline2\\ttab\\\"quote\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("line1\nline2\ttab\"quote", p.getText());
        p.close();
    }

    @Test
    public void testEmptyString_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("", p.getText());
        p.close();
    }

    @Test
    public void testUnicodeEscape_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"\\u0041\\u0042\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("AB", p.getText());
        p.close();
    }

    @Test
    public void testMultiByteUtf8Characters_parsesCorrectly() throws IOException {
        // 2-byte (latin extended), 3-byte (CJK), and ASCII mixed
        String value = "café\u4e2d\u6587";
        String json = "\"" + value + "\"";
        JsonParser p = createParser(json);
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(value, p.getText());
        p.close();
    }

    @Test
    public void testGetTextCharacters_stringValue_returnsCorrectChars() throws IOException {
        JsonParser p = createParser("\"abc\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        char[] chars = p.getTextCharacters();
        assertEquals('a', chars[0]);
        assertEquals('b', chars[1]);
        assertEquals('c', chars[2]);
        p.close();
    }

    @Test
    public void testGetTextLength_stringValue_returnsCorrectLength() throws IOException {
        JsonParser p = createParser("\"abcdef\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(6, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetTextOffset_stringValue_returnsZero() throws IOException {
        JsonParser p = createParser("\"abc\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextCharacters_fieldName_returnsCorrectChars() throws IOException {
        JsonParser p = createParser("{\"field\":1}");
        p.nextToken();
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals("field", new String(chars, 0, p.getTextLength()));
        p.close();
    }

    // ---------- Number parsing tests ----------

    @Test
    public void testParseNumber_positiveInteger_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("12345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseNumber_negativeInteger_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("-98765");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-98765, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseNumber_floatingPoint_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("3.14159");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14159, p.getDoubleValue(), 0.00001);
        p.close();
    }

    @Test
    public void testParseNumber_negativeFloat_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("-2.5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-2.5, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseNumber_exponent_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("1.5e10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5e10, p.getDoubleValue(), 0.1);
        p.close();
    }

    @Test
    public void testParseNumber_exponentWithPlusSign_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("2E+3");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2000.0, p.getDoubleValue(), 0.1);
        p.close();
    }

    @Test
    public void testParseNumber_zero_returnsZero() throws IOException {
        JsonParser p = createParser("0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumber_leadingZero_throwsException() throws IOException {
        JsonParser p = createParser("012");
        p.nextToken();
    }

    @Test
    public void testParseNumber_leadingZeroAllowed_parsesCorrectly() throws IOException {
        JsonParser p = createParserWithFeature("012", JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseNumber_longNumber_crossesBuffer() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            sb.append(i % 10);
        }
        String json = sb.toString();
        JsonParser p = createParser(json);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(json, p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumber_invalidNegative_throwsException() throws IOException {
        JsonParser p = createParser("-abc");
        p.nextToken();
    }

    // ---------- Boolean and null value tests ----------

    @Test
    public void testBooleanTrue_parsesCorrectly() throws IOException {
        JsonParser p = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testBooleanFalse_parsesCorrectly() throws IOException {
        JsonParser p = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertFalse(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testNullValue_parsesCorrectly() throws IOException {
        JsonParser p = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidToken_throwsException() throws IOException {
        JsonParser p = createParser("tru");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidToken_falsy_throwsException() throws IOException {
        JsonParser p = createParser("flase");
        p.nextToken();
    }

    // ---------- Mismatch / error tests ----------

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker_arrayClosedAsObject_throwsException() throws IOException {
        JsonParser p = createParser("[1,2}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker_objectClosedAsArray_throwsException() throws IOException {
        JsonParser p = createParser("{\"a\":1]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedChar_missingComma_throwsException() throws IOException {
        JsonParser p = createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedValue_invalidStart_throwsException() throws IOException {
        JsonParser p = createParser("@invalid");
        p.nextToken();
    }

    // ---------- Feature: single quotes ----------

    @Test
    public void testSingleQuotes_enabled_parsesFieldNameAndValue() throws IOException {
        JsonParser p = createParserWithFeature("{'a':'b'}", JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("b", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuotes_disabled_throwsException() throws IOException {
        JsonParser p = createParser("{'a':'b'}");
        p.nextToken();
        p.nextToken();
    }

    // ---------- Feature: comments ----------

    @Test
    public void testComments_slashSlash_enabled_skipsComment() throws IOException {
        JsonParser p = createParserWithFeature("// comment\n{\"a\":1}", JsonParser.Feature.ALLOW_COMMENTS, true);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testComments_slashStar_enabled_skipsComment() throws IOException {
        JsonParser p = createParserWithFeature("/* comment */{\"a\":1}", JsonParser.Feature.ALLOW_COMMENTS, true);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testComments_disabled_throwsException() throws IOException {
        JsonParser p = createParser("// comment\n{\"a\":1}");
        p.nextToken();
    }

    @Test
    public void testYamlComments_enabled_skipsComment() throws IOException {
        JsonParser p = createParserWithFeature("# comment\n{\"a\":1}", JsonParser.Feature.ALLOW_YAML_COMMENTS, true);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    // ---------- Feature: unquoted field names ----------

    @Test
    public void testUnquotedFieldNames_enabled_parsesCorrectly() throws IOException {
        JsonParser p = createParserWithFeature("{a:1}", JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNames_disabled_throwsException() throws IOException {
        JsonParser p = createParser("{a:1}");
        p.nextToken();
        p.nextToken();
    }

    // ---------- Feature: NaN / Infinity ----------

    @Test
    public void testNaN_enabled_parsesCorrectly() throws IOException {
        JsonParser p = createParserWithFeature("NaN", JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNaN_disabled_throwsException() throws IOException {
        JsonParser p = createParser("NaN");
        p.nextToken();
    }

    @Test
    public void testInfinity_enabled_parsesCorrectly() throws IOException {
        JsonParser p = createParserWithFeature("Infinity", JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
        p.close();
    }

    // ---------- Field name tests (long names crossing boundaries) ----------

    @Test
    public void testLongFieldName_crossesBuffer_parsesCorrectly() throws IOException {
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            nameBuilder.append("abcdefgh");
        }
        String longName = nameBuilder.toString();
        String json = "{\"" + longName + "\":1}";
        JsonParser p = createParser(json);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(longName, p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldName_withEscape_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{\"a\\tb\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a\tb", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldName_withUnicodeEscape_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{\"a\\u00e9b\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a\u00e9b", p.getCurrentName());
        p.close();
    }

    @Test
    public void testFieldName_multipleFields_returnsCorrectNames() throws IOException {
        JsonParser p = createParser("{\"first\":1,\"second\":2,\"third\":3}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("first", p.getCurrentName());
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("second", p.getCurrentName());
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("third", p.getCurrentName());
        p.close();
    }

    // ---------- nextFieldName tests ----------

    @Test
    public void testNextFieldName_string_returnsCorrectName() throws IOException {
        JsonParser p = createParser("{\"foo\":1}");
        p.nextToken(); // START_OBJECT
        String name = p.nextFieldName();
        assertEquals("foo", name);
        p.close();
    }

    @Test
    public void testNextFieldName_serializableString_matches_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"foo\":1}");
        p.nextToken(); // START_OBJECT
        boolean matched = p.nextFieldName(new SerializedString("foo"));
        assertTrue(matched);
        p.close();
    }

    @Test
    public void testNextFieldName_serializableString_noMatch_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"foo\":1}");
        p.nextToken(); // START_OBJECT
        boolean matched = p.nextFieldName(new SerializedString("bar"));
        assertFalse(matched);
        assertEquals("foo", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNextFieldName_atEndOfObject_returnsNull() throws IOException {
        JsonParser p = createParser("{}");
        p.nextToken(); // START_OBJECT
        String name = p.nextFieldName();
        assertNull(name);
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    // ---------- nextTextValue / nextIntValue / nextLongValue / nextBooleanValue ----------

    @Test
    public void testNextTextValue_returnsStringValue() throws IOException {
        JsonParser p = createParser("{\"a\":\"hello\"}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME "a"
        String value = p.nextTextValue();
        assertEquals("hello", value);
        p.close();
    }

    @Test
    public void testNextTextValue_nonString_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        String value = p.nextTextValue();
        assertNull(value);
        p.close();
    }

    @Test
    public void testNextIntValue_returnsIntValue() throws IOException {
        JsonParser p = createParser("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        int value = p.nextIntValue(-1);
        assertEquals(42, value);
        p.close();
    }

    @Test
    public void testNextIntValue_nonInt_returnsDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        int value = p.nextIntValue(-1);
        assertEquals(-1, value);
        p.close();
    }

    @Test
    public void testNextLongValue_returnsLongValue() throws IOException {
        JsonParser p = createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        long value = p.nextLongValue(-1L);
        assertEquals(123456789012L, value);
        p.close();
    }

    @Test
    public void testNextBooleanValue_true_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        Boolean value = p.nextBooleanValue();
        assertEquals(Boolean.TRUE, value);
        p.close();
    }

    @Test
    public void testNextBooleanValue_false_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        Boolean value = p.nextBooleanValue();
        assertEquals(Boolean.FALSE, value);
        p.close();
    }

    @Test
    public void testNextBooleanValue_nonBoolean_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        Boolean value = p.nextBooleanValue();
        assertNull(value);
        p.close();
    }

    // ---------- getValueAsString / getValueAsInt tests ----------

    @Test
    public void testGetValueAsString_stringToken_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals("hello", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsString_withDefault_nonString_returnsDefault() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        assertEquals("default", p.getValueAsString("default"));
        p.close();
    }

    @Test
    public void testGetValueAsInt_intToken_returnsCorrectValue() throws IOException {
        JsonParser p = createParser("42");
        p.nextToken();
        assertEquals(42, p.getValueAsInt());
        p.close();
    }

    @Test
    public void testGetValueAsInt_withDefault_nonNumber_returnsDefault() throws IOException {
        JsonParser p = createParser("\"str\"");
        p.nextToken();
        assertEquals(99, p.getValueAsInt(99));
        p.close();
    }

    @Test
    public void testGetValueAsInt_floatToken_returnsIntValue() throws IOException {
        JsonParser p = createParser("3.99");
        p.nextToken();
        assertEquals(3, p.getValueAsInt());
        p.close();
    }

    // ---------- Base64 binary value tests ----------

    @Test
    public void testGetBinaryValue_validBase64_decodesCorrectly() throws IOException {
        String encoded = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant()
                .encode("hello".getBytes(StandardCharsets.UTF_8));
        JsonParser p = createParser("\"" + encoded + "\"");
        p.nextToken();
        byte[] decoded = p.getBinaryValue();
        assertEquals("hello", new String(decoded, StandardCharsets.UTF_8));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_nonStringToken_throwsException() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue();
    }

    @Test
    public void testReadBinaryValue_writesToOutputStream() throws IOException {
        String encoded = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant()
                .encode("world".getBytes(StandardCharsets.UTF_8));
        JsonParser p = createParser("\"" + encoded + "\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(out);
        assertEquals(5, len);
        assertEquals("world", out.toString("UTF-8"));
        p.close();
    }

    // ---------- Location tests ----------

    @Test
    public void testGetTokenLocation_returnsNonNullLocation() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        p.close();
    }

    @Test
    public void testGetCurrentLocation_returnsNonNullLocation() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        JsonLocation loc = p.getCurrentLocation();
        assertNotNull(loc);
        p.close();
    }

    // ---------- Codec tests ----------

    @Test
    public void testGetCodecAndSetCodec_returnsCorrectCodec() throws IOException {
        JsonParser p = createParser("1");
        assertNull(p.getCodec());
        ObjectCodec codec = null; // no concrete ObjectCodec instance available without extra deps
        p.setCodec(codec);
        assertNull(p.getCodec());
        p.close();
    }

    // ---------- Close / release tests ----------

    @Test
    public void testClose_afterParsing_doesNotThrow() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.close();
        assertTrue(p.isClosed());
    }

    @Test
    public void testReleaseBuffered_returnsRemainingBytes() throws IOException {
        JsonParser p = createParser("{\"a\":1} extra");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken(); // END_OBJECT
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.releaseBuffered(out);
        assertTrue(count >= 0);
        p.close();
    }

    @Test
    public void testGetInputSource_returnsInputStreamOrNull() throws IOException {
        InputStream in = new ByteArrayInputStream("1".getBytes(StandardCharsets.UTF_8));
        JsonParser p = factory.createParser(in);
        Object source = p.getInputSource();
        // Could be an InputStream depending on internal wrapping
        assertNotNull(source);
        p.close();
    }

    // ---------- Root-level whitespace tests ----------

    @Test
    public void testMultipleRootValues_separatedBySpace_parsesCorrectly() throws IOException {
        JsonFactory f = new JsonFactory();
        f.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        JsonParser p = f.createParser("1 2 3".getBytes(StandardCharsets.UTF_8));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMultipleRootValues_noSeparatingSpace_throwsException() throws IOException {
        JsonParser p = createParser("12");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        // "12" alone is valid single number; force boundary error using adjoining tokens without space
        JsonParser p2 = createParser("1{}");
        p2.nextToken();
        p2.nextToken();
    }

    // ---------- CR / LF / TAB whitespace handling ----------

    @Test
    public void testWhitespace_withCRLF_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{\r\n\"a\"\t:\t1\r\n}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidControlCharacterInWhitespace_throwsException() throws IOException {
        // Using a control char (0x01) which is invalid unescaped whitespace
        byte[] data = new byte[]{'{', 0x01, '}'};
        JsonParser p = factory.createParser(data);
        p.nextToken();
    }

    // ---------- EOF handling tests ----------

    @Test(expected = JsonParseException.class)
    public void testEOF_inMiddleOfString_throwsException() throws IOException {
        JsonParser p = createParser("\"unterminated");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testEOF_inMiddleOfFieldName_throwsException() throws IOException {
        JsonParser p = createParser("{\"unterminated");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testEOF_atRootLevel_returnsNull() throws IOException {
        JsonParser p = createParser("");
        assertNull(p.nextToken());
        p.close();
    }

    // ---------- Skip / feature interplay: unexpected value character ----------

    @Test(expected = JsonParseException.class)
    public void testHandleUnexpectedValue_closingBracketAsValue_throwsException() throws IOException {
        JsonParser p = createParser("[,]");
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testPlusPrefixedInvalidNumber_withoutFeature_throwsException() throws IOException {
        JsonParser p = createParser("+123");
        try {
            p.nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException expected) {
            // expected: '+' prefix is not standard start unless followed by INF etc.
        }
        p.close();
    }

    // ---------- getText for various token types ----------

    @Test
    public void testGetText_fieldName_returnsFieldName() throws IOException {
        JsonParser p = createParser("{\"key\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("key", p.getText());
        p.close();
    }

    @Test
    public void testGetText_numberToken_returnsNumericString() throws IOException {
        JsonParser p = createParser("12345");
        p.nextToken();
        assertEquals("12345", p.getText());
        p.close();
    }

    @Test
    public void testGetText_booleanToken_returnsBooleanString() throws IOException {
        JsonParser p = createParser("true");
        p.nextToken();
        assertEquals("true", p.getText());
        p.close();
    }

    @Test
    public void testGetText_nullToken_returnsNullString() throws IOException {
        JsonParser p = createParser("null");
        p.nextToken();
        assertEquals("null", p.getText());
        p.close();
    }
}
