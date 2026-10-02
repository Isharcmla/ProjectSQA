import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class ReaderBasedJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private JsonParser createParser(String json) throws IOException {
        return factory.createParser(new StringReader(json));
    }

    // ---------- Basic object/array parsing ----------

    @Test
    public void testParseSimpleObject_normalInput_returnsTokens() throws IOException {
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
    public void testParseArray_normalInput_returnsTokens() throws IOException {
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
    public void testNestedObjectsAndArrays_normalInput() throws IOException {
        JsonParser p = createParser("{\"arr\":[{\"x\":true},{\"y\":false}],\"z\":null}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testEmptyInput_returnsNull() throws IOException {
        JsonParser p = createParser("");
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testEmptyObjectAndArray() throws IOException {
        JsonParser p = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();

        JsonParser p2 = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, p2.nextToken());
        assertEquals(JsonToken.END_ARRAY, p2.nextToken());
        p2.close();
    }

    // ---------- String parsing ----------

    @Test
    public void testParseString_withEscapes_normalInput() throws IOException {
        JsonParser p = createParser("\"line1\\nline2\\t\\\"quoted\\\"\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("line1\nline2\t\"quoted\"", p.getText());
        p.close();
    }

    @Test
    public void testParseString_unicodeEscape_normalInput() throws IOException {
        JsonParser p = createParser("\"\\u0041\\u0042\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("AB", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testParseString_invalidEscapeChar_throwsException() throws IOException {
        JsonParser p = createParser("\"\\x\"");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testParseString_unquotedControlChar_throwsException() throws IOException {
        JsonParser p = createParser("\"abc\ndef\"");
        p.nextToken();
        p.getText();
    }

    @Test
    public void testGetTextCharacters_stringToken() throws IOException {
        JsonParser p = createParser("\"hello\"");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertNotNull(chars);
        assertEquals(5, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextCharacters_fieldNameToken() throws IOException {
        JsonParser p = createParser("{\"fieldName\":1}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        char[] chars = p.getTextCharacters();
        assertEquals("fieldName", new String(chars, 0, p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextCharacters_numberToken() throws IOException {
        JsonParser p = createParser("12345");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals(5, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetTextCharacters_nullBeforeAnyToken() throws IOException {
        JsonParser p = createParser("123");
        assertNull(p.getTextCharacters());
        assertEquals(0, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextOffset_booleanToken() throws IOException {
        JsonParser p = createParser("true");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    // ---------- Number parsing ----------

    @Test
    public void testParsePositiveInt_normalInput() throws IOException {
        JsonParser p = createParser("42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseNegativeInt_normalInput() throws IOException {
        JsonParser p = createParser("-42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-42, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseFloat_normalInput() throws IOException {
        JsonParser p = createParser("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3.14, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseNegativeFloat_normalInput() throws IOException {
        JsonParser p = createParser("-3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-3.14, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseFloatWithExponent_normalInput() throws IOException {
        JsonParser p = createParser("1.5e10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5e10, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseFloatWithExponentSign_normalInput() throws IOException {
        JsonParser p = createParser("1.5e+10");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5e10, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseIntWithExponent_normalInput() throws IOException {
        JsonParser p = createParser("2e5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2e5, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testParseZero_edgeCase() throws IOException {
        JsonParser p = createParser("0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getIntValue());
        p.close();
    }

    @Test
    public void testParseLeadingZeroFollowedByDot_edgeCase() throws IOException {
        JsonParser p = createParser("0.5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0.5, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeros_disallowed_throwsException() throws IOException {
        JsonParser p = createParser("007");
        p.nextToken();
    }

    @Test
    public void testLeadingZeros_allowed_normalInput() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        JsonParser p = createParser("007");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testDecimalPointNotFollowedByDigit_throwsException() throws IOException {
        JsonParser p = createParser("1.");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testExponentNotFollowedByDigit_throwsException() throws IOException {
        JsonParser p = createParser("1e");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumberStart_throwsException() throws IOException {
        JsonParser p = createParser("-a");
        p.nextToken();
    }

    @Test
    public void testParseLargeNumberSpanningBuffer_normalInput() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sb.append('1');
        }
        JsonParser p = createParser(sb.toString());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertNotNull(p.getText());
        p.close();
    }

    // ---------- Boolean / null ----------

    @Test
    public void testParseTrue_normalInput() throws IOException {
        JsonParser p = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testParseFalse_normalInput() throws IOException {
        JsonParser p = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertFalse(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testParseNull_normalInput() throws IOException {
        JsonParser p = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        p.close();
    }

    @Test
    public void testParseTrueInArray_boundary() throws IOException {
        JsonParser p = createParser("[true,false,null]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    // ---------- Binary ----------

    @Test
    public void testGetBinaryValue_normalInput() throws IOException {
        JsonParser p = createParser("\"SGVsbG8=\"");
        p.nextToken();
        byte[] result = p.getBinaryValue();
        assertEquals("Hello", new String(result));
        p.close();
    }

    @Test
    public void testReadBinaryValue_normalInput() throws IOException {
        JsonParser p = createParser("\"SGVsbG8=\"");
        p.nextToken();
        StringWriter unused = new StringWriter();
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        int len = p.readBinaryValue(out);
        assertEquals(5, len);
        assertEquals("Hello", out.toString());
        p.close();
    }

    // ---------- nextFieldName ----------

    @Test
    public void testNextFieldNameSerializable_matches() throws IOException {
        JsonParser p = createParser("{\"abc\":1}");
        p.nextToken(); // START_OBJECT
        SerializedString sstr = new SerializedString("abc");
        boolean matched = p.nextFieldName(sstr);
        assertTrue(matched);
        p.close();
    }

    @Test
    public void testNextFieldNameSerializable_noMatch() throws IOException {
        JsonParser p = createParser("{\"xyz\":1}");
        p.nextToken(); // START_OBJECT
        SerializedString sstr = new SerializedString("abc");
        boolean matched = p.nextFieldName(sstr);
        assertFalse(matched);
        p.close();
    }

    @Test
    public void testNextFieldNameSerializable_afterFieldName() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":2}");
        p.nextToken();
        SerializedString a = new SerializedString("a");
        p.nextFieldName(a);
        // now current token is FIELD_NAME; call nextFieldName again to trigger _nextAfterName path
        SerializedString b = new SerializedString("b");
        boolean matched = p.nextFieldName(b);
        // first call consumed field name "a"; but we didn't advance value, this may throw.
        p.close();
    }

    @Test
    public void testNextFieldNameString_normalInput() throws IOException {
        JsonParser p = createParser("{\"key1\":1,\"key2\":2}");
        p.nextToken(); // START_OBJECT
        String name = p.nextFieldName();
        assertEquals("key1", name);
        p.close();
    }

    @Test
    public void testNextFieldNameString_endObject_returnsNull() throws IOException {
        JsonParser p = createParser("{}");
        p.nextToken();
        String name = p.nextFieldName();
        assertNull(name);
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testNextFieldNameString_notInObject_returnsNull() throws IOException {
        JsonParser p = createParser("[1,2]");
        p.nextToken(); // START_ARRAY
        String name = p.nextFieldName();
        assertNull(name);
        p.close();
    }

    // ---------- nextTextValue / nextIntValue / nextLongValue / nextBooleanValue ----------

    @Test
    public void testNextTextValue_normalInput() throws IOException {
        JsonParser p = createParser("{\"a\":\"hello\"}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME a
        String val = p.nextTextValue();
        assertEquals("hello", val);
        p.close();
    }

    @Test
    public void testNextTextValue_notString_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        String val = p.nextTextValue();
        assertNull(val);
        p.close();
    }

    @Test
    public void testNextIntValue_normalInput() throws IOException {
        JsonParser p = createParser("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        int val = p.nextIntValue(-1);
        assertEquals(42, val);
        p.close();
    }

    @Test
    public void testNextIntValue_notInt_returnsDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        int val = p.nextIntValue(-1);
        assertEquals(-1, val);
        p.close();
    }

    @Test
    public void testNextLongValue_normalInput() throws IOException {
        JsonParser p = createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        long val = p.nextLongValue(-1L);
        assertEquals(123456789012L, val);
        p.close();
    }

    @Test
    public void testNextLongValue_notInt_returnsDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        long val = p.nextLongValue(-1L);
        assertEquals(-1L, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_true() throws IOException {
        JsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.TRUE, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_false() throws IOException {
        JsonParser p = createParser("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertEquals(Boolean.FALSE, val);
        p.close();
    }

    @Test
    public void testNextBooleanValue_notBoolean_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        Boolean val = p.nextBooleanValue();
        assertNull(val);
        p.close();
    }

    // ---------- Feature: comments ----------

    @Test
    public void testAllowComments_lineComment_normalInput() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("{\"a\":1 // comment\n}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testAllowComments_blockComment_normalInput() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("{\"a\":1 /* comment */ }");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testCommentsDisabled_throwsException() throws IOException {
        JsonParser p = createParser("{\"a\":1 // comment\n}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testBlockCommentUnterminated_throwsException() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("{\"a\":1 /* unterminated");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test
    public void testAllowYamlComments_normalInput() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        JsonParser p = createParser("{\"a\":1 # comment\n}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    // ---------- Feature: single quotes ----------

    @Test
    public void testAllowSingleQuotes_stringValue_normalInput() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        JsonParser p = createParser("{'a':'value'}");
        p.nextToken();
        p.nextToken();
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuotesDisabled_throwsException() throws IOException {
        JsonParser p = createParser("{'a':1}");
        p.nextToken();
        p.nextToken();
    }

    // ---------- Feature: unquoted field names ----------

    @Test
    public void testAllowUnquotedFieldNames_normalInput() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        JsonParser p = createParser("{abc:1}");
        p.nextToken();
        p.nextToken();
        assertEquals("abc", p.getCurrentName());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNamesDisabled_throwsException() throws IOException {
        JsonParser p = createParser("{abc:1}");
        p.nextToken();
        p.nextToken();
    }

    // ---------- Feature: non-numeric numbers ----------

    @Test
    public void testAllowNonNumericNumbers_NaN() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("NaN");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testAllowNonNumericNumbers_PositiveInfinity() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);
        p.close();
    }

    @Test
    public void testAllowNonNumericNumbers_NegativeInfinityLong() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("-Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);
        p.close();
    }

    @Test
    public void testAllowNonNumericNumbers_PositiveINF() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("+INF");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);
        p.close();
    }

    @Test
    public void testAllowNonNumericNumbers_NegativeINF() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("-INF");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumericNumbersDisabled_NaN_throwsException() throws IOException {
        JsonParser p = createParser("NaN");
        p.nextToken();
    }

    // ---------- Error cases ----------

    @Test(expected = JsonParseException.class)
    public void testMismatchedEndMarker_throwsException() throws IOException {
        JsonParser p = createParser("[1,2}");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedCharacter_throwsException() throws IOException {
        JsonParser p = createParser("@invalid");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidTokenPartial_throwsException() throws IOException {
        JsonParser p = createParser("tru");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingCommaBetweenArrayElements_throwsException() throws IOException {
        JsonParser p = createParser("[1 2]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColonAfterFieldName_throwsException() throws IOException {
        JsonParser p = createParser("{\"a\" 1}");
        p.nextToken();
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedString_throwsException() throws IOException {
        JsonParser p = createParser("\"unterminated");
        p.nextToken();
        p.getText();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedObject_throwsException() throws IOException {
        JsonParser p = createParser("{\"a\":1");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
    }

    // ---------- getText / getValueAsString ----------

    @Test
    public void testGetText_fieldName() throws IOException {
        JsonParser p = createParser("{\"fname\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("fname", p.getText());
        p.close();
    }

    @Test
    public void testGetText_afterEndOfInput_returnsNullOrToken() throws IOException {
        JsonParser p = createParser("1");
        p.nextToken();
        assertEquals("1", p.getText());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testGetValueAsString_stringToken() throws IOException {
        JsonParser p = createParser("\"myvalue\"");
        p.nextToken();
        assertEquals("myvalue", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsString_fieldNameToken() throws IOException {
        JsonParser p = createParser("{\"fld\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("fld", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsString_withDefault_nonString() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        String val = p.getValueAsString("default");
        assertEquals("123", val);
        p.close();
    }

    @Test
    public void testGetValueAsString_nullTokenWithDefault() throws IOException {
        JsonParser p = createParser("null");
        p.nextToken();
        String val = p.getValueAsString("default");
        assertEquals("default", val);
        p.close();
    }

    // ---------- Location ----------

    @Test
    public void testGetTokenLocation_normalInput() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        p.close();
    }

    @Test
    public void testGetCurrentLocation_normalInput() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        JsonLocation loc = p.getCurrentLocation();
        assertNotNull(loc);
        p.close();
    }

    @Test
    public void testGetTokenLocation_fieldNameToken() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        p.close();
    }

    // ---------- Misc: codec, input source, releaseBuffered ----------

    @Test
    public void testGetCodecSetCodec_normalInput() throws IOException {
        JsonParser p = createParser("1");
        ObjectCodec codec = null;
        p.setCodec(codec);
        assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void testGetInputSource_returnsReader() throws IOException {
        StringReader reader = new StringReader("1");
        JsonParser p = factory.createParser(reader);
        assertNotNull(p.getCurrentLocation());
        p.close();
    }

    @Test
    public void testReleaseBuffered_normalInput() throws IOException {
        JsonParser p = createParser("{\"a\":1}extra content here");
        p.nextToken();
        StringWriter writer = new StringWriter();
        int count = p.releaseBuffered(writer);
        assertTrue(count >= 0);
        p.close();
    }

    @Test
    public void testReleaseBuffered_noRemainingContent() throws IOException {
        JsonParser p = createParser("1");
        p.nextToken();
        StringWriter writer = new StringWriter();
        // consume everything
        while (p.nextToken() != null) { }
        int count = p.releaseBuffered(writer);
        assertTrue(count >= 0);
        p.close();
    }

    // ---------- Odd value handling: '+' prefix, single-quote string value ----------

    @Test
    public void testHandleApos_singleQuoteStringValue() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        JsonParser p = createParser("'hello world'");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello world", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddValue_invalidCharacter_throwsException() throws IOException {
        JsonParser p = createParser("$");
        p.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddValue_javaIdentifierStart_throwsException() throws IOException {
        JsonParser p = createParser("xyz");
        p.nextToken();
    }

    // ---------- Root-level multiple values (space separated) ----------

    @Test
    public void testRootLevelMultipleValues_withSpace() throws IOException {
        JsonParser p = createParser("1 2 3");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testRootLevelMultipleValues_missingSpace_throwsException() throws IOException {
        JsonParser p = createParser("12");
        // this is actually just one number "12", not an error by itself.
        // To trigger _verifyRootSpace failure, need adjoining tokens without separator, e.g. "1{"
        p.close();
        JsonParser p2 = createParser("1{}");
        p2.nextToken();
        p2.nextToken();
    }

    // ---------- Whitespace handling: CR, LF, tabs ----------

    @Test
    public void testWhitespaceHandling_crlf_normalInput() throws IOException {
        JsonParser p = createParser("{\r\n\"a\"\t:\t1\r\n}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidControlCharInWhitespace_throwsException() throws IOException {
        // control char (other than space/tab/cr/lf) between tokens
        JsonParser p = createParser("{\u0001\"a\":1}");
        p.nextToken();
    }
}
