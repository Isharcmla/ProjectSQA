import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser createParser(String json) throws IOException {
        return factory.createParser(new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8)));
    }

    // ---------- Basic token parsing ----------

    @Test
    public void testBasicObjectParsing_typicalInput_returnsCorrectTokens() throws IOException {
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
    public void testArrayParsing_typicalInput_returnsCorrectTokens() throws IOException {
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
    public void testStringValue_typicalInput_returnsCorrectText() throws IOException {
        JsonParser p = createParser("\"simple string\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("simple string", p.getText());
        p.close();
    }

    @Test
    public void testNumberParsing_positiveInteger() throws IOException {
        JsonParser p = createParser("12345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12345, p.getIntValue());
        p.close();
    }

    @Test
    public void testNumberParsing_negativeInteger() throws IOException {
        JsonParser p = createParser("-98765");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-98765, p.getIntValue());
        p.close();
    }

    @Test
    public void testNumberParsing_floatingPoint() throws IOException {
        JsonParser p = createParser("3.14159");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14159, p.getDoubleValue(), 0.00001);
        p.close();
    }

    @Test
    public void testNumberParsing_exponent() throws IOException {
        JsonParser p = createParser("1.5e10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5e10, p.getDoubleValue(), 0.1);
        p.close();
    }

    @Test
    public void testNumberParsing_negativeExponent() throws IOException {
        JsonParser p = createParser("-2.5E-3");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-2.5E-3, p.getDoubleValue(), 0.0000001);
        p.close();
    }

    @Test
    public void testBooleanTrue_returnsTrueToken() throws IOException {
        JsonParser p = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testBooleanFalse_returnsFalseToken() throws IOException {
        JsonParser p = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertFalse(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testNullValue_returnsNullToken() throws IOException {
        JsonParser p = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        p.close();
    }

    @Test
    public void testEmptyString_returnsEmptyText() throws IOException {
        JsonParser p = createParser("\"\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("", p.getText());
        p.close();
    }

    @Test
    public void testEmptyObject_returnsStartAndEndTokens() throws IOException {
        JsonParser p = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testEmptyArray_returnsStartAndEndTokens() throws IOException {
        JsonParser p = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testNestedObjectsAndArrays_typicalInput_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{\"arr\":[1,{\"x\":true}]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("arr", p.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("x", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    // ---------- Text access methods ----------

    @Test
    public void testGetTextCharacters_forFieldName_returnsCorrectChars() throws IOException {
        JsonParser p = createParser("{\"field\":1}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        char[] chars = p.getTextCharacters();
        assertNotNull(chars);
        assertEquals("field", new String(chars, 0, p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextCharacters_forStringValue_returnsCorrectChars() throws IOException {
        JsonParser p = createParser("\"hello\"");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals("hello", new String(chars, 0, p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextLength_forFieldName_returnsCorrectLength() throws IOException {
        JsonParser p = createParser("{\"name\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(4, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetTextOffset_forStringValue_returnsZero() throws IOException {
        JsonParser p = createParser("\"abc\"");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetValueAsString_forStringToken_returnsText() throws IOException {
        JsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals("hello", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsString_withDefault_forNonStringToken() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        assertEquals("default", p.getValueAsString("default"));
        p.close();
    }

    @Test
    public void testGetValueAsInt_forIntToken_returnsValue() throws IOException {
        JsonParser p = createParser("42");
        p.nextToken();
        assertEquals(42, p.getValueAsInt());
        p.close();
    }

    @Test
    public void testGetValueAsInt_withDefault_forNonNumberToken() throws IOException {
        JsonParser p = createParser("\"notanumber\"");
        p.nextToken();
        assertEquals(999, p.getValueAsInt(999));
        p.close();
    }

    // ---------- Codec ----------

    @Test
    public void testGetCodec_setCodec_returnsSetCodec() throws IOException {
        JsonParser p = createParser("1");
        ObjectCodec codec = null; // no ObjectCodec impl available without dependency
        p.setCodec(codec);
        assertNull(p.getCodec());
        p.close();
    }

    // ---------- Input source ----------

    @Test
    public void testGetInputSource_returnsInputStream() throws IOException {
        JsonParser p = createParser("1");
        assertNotNull(p.getInputSource());
        p.close();
    }

    // ---------- releaseBuffered ----------

    @Test
    public void testReleaseBuffered_withRemainingData_writesToOutputStream() throws IOException {
        JsonParser p = createParser("123 456");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = p.releaseBuffered(out);
        assertTrue(count >= 0);
        p.close();
    }

    // ---------- Binary values ----------

    @Test
    public void testGetBinaryValue_validBase64_decodesCorrectly() throws IOException {
        String base64 = java.util.Base64.getEncoder().encodeToString("hello".getBytes(StandardCharsets.UTF_8));
        JsonParser p = createParser("\"" + base64 + "\"");
        p.nextToken();
        byte[] result = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertEquals("hello", new String(result, StandardCharsets.UTF_8));
        p.close();
    }

    @Test
    public void testReadBinaryValue_validBase64_writesCorrectBytes() throws IOException {
        String base64 = java.util.Base64.getEncoder().encodeToString("world".getBytes(StandardCharsets.UTF_8));
        JsonParser p = createParser("\"" + base64 + "\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(5, len);
        assertEquals("world", new String(out.toByteArray(), StandardCharsets.UTF_8));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_notStringOrBinaryToken_throwsException() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue(Base64Variants.getDefaultVariant());
        p.close();
    }

    // ---------- nextFieldName ----------

    @Test
    public void testNextFieldNameWithSerializableString_matchFound_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"target\":1}");
        p.nextToken(); // START_OBJECT
        SerializedString target = new SerializedString("target");
        boolean match = p.nextFieldName(target);
        assertTrue(match);
        p.close();
    }

    @Test
    public void testNextFieldNameWithSerializableString_noMatch_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"other\":1}");
        p.nextToken();
        SerializedString target = new SerializedString("target");
        boolean match = p.nextFieldName(target);
        assertFalse(match);
        assertEquals("other", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNextFieldNameNoArg_returnsFieldNameString() throws IOException {
        JsonParser p = createParser("{\"fname\":1}");
        p.nextToken();
        String name = p.nextFieldName();
        assertEquals("fname", name);
        p.close();
    }

    @Test
    public void testNextFieldNameNoArg_endOfObject_returnsNull() throws IOException {
        JsonParser p = createParser("{}");
        p.nextToken();
        String name = p.nextFieldName();
        assertNull(name);
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    // ---------- nextTextValue / nextIntValue / nextLongValue / nextBooleanValue ----------

    @Test
    public void testNextTextValue_afterFieldName_returnsStringValue() throws IOException {
        JsonParser p = createParser("{\"a\":\"val\"}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME a
        String val = p.nextTextValue();
        assertEquals("val", val);
        p.close();
    }

    @Test
    public void testNextTextValue_nonStringValue_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":123}");
        p.nextToken();
        p.nextToken();
        String val = p.nextTextValue();
        assertNull(val);
        p.close();
    }

    @Test
    public void testNextIntValue_afterFieldName_returnsIntValue() throws IOException {
        JsonParser p = createParser("{\"a\":55}");
        p.nextToken();
        p.nextToken();
        int val = p.nextIntValue(-1);
        assertEquals(55, val);
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
    public void testNextLongValue_afterFieldName_returnsLongValue() throws IOException {
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
    public void testNextBooleanValue_afterFieldName_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.TRUE, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_afterFieldName_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.FALSE, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_nonBooleanValue_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertNull(val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_directCall_returnsTrue() throws IOException {
        JsonParser p = createParser("true");
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.TRUE, val);
        p.close();
    }

    // ---------- Exceptions ----------

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker_throwsException() throws IOException {
        JsonParser p = createParser("[1,2}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken(); // should throw due to mismatched close
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidToken_throwsException() throws IOException {
        JsonParser p = createParser("nul");
        p.nextToken();
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharacter_throwsException() throws IOException {
        JsonParser p = createParser("@invalid");
        p.nextToken();
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaInArray_throwsException() throws IOException {
        JsonParser p = createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // expects comma, should throw
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisabled_throwsException() throws IOException {
        JsonParser p = createParser("{\"a\":1 /* comment */}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken(); // reaching comment should throw since comments disabled
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZerosDisallowed_throwsException() throws IOException {
        JsonParser p = createParser("007");
        p.nextToken();
        p.close();
    }

    // ---------- Feature-enabled scenarios ----------

    @Test
    public void testCommentsEnabled_parsesSuccessfully() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("{\"a\":1 /* comment */ ,\"b\":2}");
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
    }

    @Test
    public void testYamlCommentsEnabled_parsesSuccessfully() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        JsonParser p = createParser("{\"a\":1 # comment\n ,\"b\":2}");
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
    }

    @Test
    public void testSingleQuotesEnabled_parsesFieldNameAndString() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        JsonParser p = createParser("{'a':'value'}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        p.close();
    }

    @Test
    public void testLeadingZerosAllowed_parsesSuccessfully() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        JsonParser p = createParser("007");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());
        p.close();
    }

    @Test
    public void testUnquotedFieldNamesEnabled_parsesSuccessfully() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        JsonParser p = createParser("{abc:1}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test
    public void testNaNAllowed_parsesSuccessfully() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("NaN");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testInfinityAllowed_parsesSuccessfully() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNaNDisallowed_throwsException() throws IOException {
        JsonParser p = createParser("NaN");
        p.nextToken();
        p.close();
    }

    // ---------- Escapes / Unicode ----------

    @Test
    public void testEscapedCharacters_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"line1\\nline2\\ttab\\\"quote\\\\backslash\"");
        p.nextToken();
        String text = p.getText();
        assertEquals("line1\nline2\ttab\"quote\\backslash", text);
        p.close();
    }

    @Test
    public void testUnicodeEscape_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"\\u00e9\"");
        p.nextToken();
        assertEquals("\u00e9", p.getText());
        p.close();
    }

    @Test
    public void testMultiByteUtf8Characters_twoByteChar_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"h\u00e9llo\"");
        p.nextToken();
        assertEquals("h\u00e9llo", p.getText());
        p.close();
    }

    @Test
    public void testMultiByteUtf8Characters_threeByteChar_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"\u20ac100\"");
        p.nextToken();
        assertEquals("\u20ac100", p.getText());
        p.close();
    }

    @Test
    public void testMultiByteUtf8Characters_fourByteSurrogatePair_parsesCorrectly() throws IOException {
        String emoji = new StringBuilder().appendCodePoint(0x1F600).toString();
        JsonParser p = createParser("\"" + emoji + "\"");
        p.nextToken();
        assertEquals(emoji, p.getText());
        p.close();
    }

    @Test
    public void testMultiByteFieldName_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{\"\u00e9\u00e9\u00e9\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("\u00e9\u00e9\u00e9", p.getCurrentName());
        p.close();
    }

    // ---------- Long strings / field names crossing buffer boundaries ----------

    @Test
    public void testLongFieldName_crossingQuadBoundaries_parsesCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String longName = sb.toString();
        JsonParser p = createParser("{\"" + longName + "\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(longName, p.getCurrentName());
        p.close();
    }

    @Test
    public void testLargeStringCrossingBufferBoundary_parsesCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String longString = sb.toString();
        JsonParser p = createParser("\"" + longString + "\"");
        p.nextToken();
        assertEquals(longString, p.getText());
        p.close();
    }

    @Test
    public void testLargeNumberCrossingBufferBoundary_parsesCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            sb.append((i % 9) + 1);
        }
        String bigNum = sb.toString();
        JsonParser p = createParser(bigNum);
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        String text = p.getText();
        assertEquals(bigNum, text);
        p.close();
    }

    // ---------- Location ----------

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

    @Test
    public void testGetTokenLocation_forFieldName_returnsNonNullLocation() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        p.close();
    }

    // ---------- Close / release ----------

    @Test
    public void testClose_releasesResourcesWithoutError() throws IOException {
        JsonParser p = createParser("{}");
        p.nextToken();
        p.close();
        assertTrue(p.isClosed());
    }

    @Test
    public void testNextToken_afterEndOfInput_closesParserAndReturnsNull() throws IOException {
        JsonParser p = createParser("1");
        p.nextToken();
        JsonToken t = p.nextToken();
        assertNull(t);
        assertTrue(p.isClosed());
    }

    // ---------- Skipping incomplete string / children ----------

    @Test
    public void testSkipChildren_forArray_skipsAllElements() throws IOException {
        JsonParser p = createParser("{\"a\":[1,2,3],\"b\":4}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME a
        p.nextToken(); // START_ARRAY
        p.skipChildren();
        assertEquals(JsonToken.END_ARRAY, p.getCurrentToken());
        p.nextToken(); // FIELD_NAME b
        assertEquals("b", p.getCurrentName());
        p.close();
    }

    @Test
    public void testTokenIncompleteString_skippedWhenMovingToNextToken() throws IOException {
        JsonParser p = createParser("[\"long unread string value\",2]");
        p.nextToken(); // START_ARRAY
        p.nextToken(); // VALUE_STRING (not read via getText)
        JsonToken next = p.nextToken(); // should skip string internally
        assertEquals(JsonToken.VALUE_NUMBER_INT, next);
        assertEquals(2, p.getIntValue());
        p.close();
    }

    // ---------- Root value separation ----------

    @Test
    public void testMultipleRootValues_parsedSequentially() throws IOException {
        JsonParser p = createParser("1 2 3");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        p.close();
    }

    // ---------- getValueAsString edge with field name ----------

    @Test
    public void testGetValueAsString_forFieldNameToken_returnsFieldName() throws IOException {
        JsonParser p = createParser("{\"myField\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        assertEquals("myField", p.getValueAsString());
        p.close();
    }
}
