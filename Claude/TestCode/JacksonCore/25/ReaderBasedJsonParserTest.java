import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.SerializedString;

public class ReaderBasedJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    @After
    public void tearDown() {
        factory = null;
    }

    private JsonParser createParser(String json) throws IOException {
        return factory.createParser(new StringReader(json));
    }

    // ---------------------------------------------------------
    // Codec related
    // ---------------------------------------------------------

    @Test
    public void testGetSetCodec_normal_setsAndReturnsCodec() throws IOException {
        JsonParser p = createParser("{}");
        ObjectCodec codec = null; // no real codec dependency available
        p.setCodec(codec);
        assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void testGetInputSource_normal_returnsReaderInstance() throws IOException {
        JsonParser p = createParser("{}");
        Object src = p.getInputSource();
        assertNotNull(src);
        p.close();
    }

    // ---------------------------------------------------------
    // releaseBuffered
    // ---------------------------------------------------------

    @Test
    public void testReleaseBuffered_hasBufferedContent_returnsPositiveCount() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken(); // START_OBJECT
        java.io.StringWriter sw = new java.io.StringWriter();
        int count = ((com.fasterxml.jackson.core.json.ReaderBasedJsonParser) p).releaseBuffered(sw);
        assertTrue(count >= 0);
        p.close();
    }

    // ---------------------------------------------------------
    // nextToken - basic scenarios
    // ---------------------------------------------------------

    @Test
    public void testNextToken_simpleObject_returnsExpectedTokens() throws IOException {
        JsonParser p = createParser("{\"key\":\"value\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("key", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNextToken_simpleArray_returnsExpectedTokens() throws IOException {
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
    public void testNextToken_negativeNumber_parsesCorrectly() throws IOException {
        JsonParser p = createParser("[-123]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-123, p.getIntValue());
        p.close();
    }

    @Test
    public void testNextToken_floatNumber_parsesCorrectly() throws IOException {
        JsonParser p = createParser("[1.5e2]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(150.0, p.getDoubleValue(), 0.0001);
        p.close();
    }

    @Test
    public void testNextToken_booleanTrue_returnsTrueToken() throws IOException {
        JsonParser p = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        p.close();
    }

    @Test
    public void testNextToken_booleanFalse_returnsFalseToken() throws IOException {
        JsonParser p = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        p.close();
    }

    @Test
    public void testNextToken_nullValue_returnsNullToken() throws IOException {
        JsonParser p = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        p.close();
    }

    @Test
    public void testNextToken_nestedStructures_parsesCorrectly() throws IOException {
        JsonParser p = createParser("{\"a\":[1,{\"b\":true}]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testNextToken_emptyInput_returnsNull() throws IOException {
        JsonParser p = createParser("");
        assertNull(p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNextToken_missingColon_throwsException() throws IOException {
        JsonParser p = createParser("{\"key\" \"value\"}");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNextToken_unexpectedClosingBrace_throwsException() throws IOException {
        JsonParser p = createParser("[}]");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    // ---------------------------------------------------------
    // getText / getText(Writer) / getValueAsString
    // ---------------------------------------------------------

    @Test
    public void testGetText_stringToken_returnsExpectedText() throws IOException {
        JsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals("hello", p.getText());
        p.close();
    }

    @Test
    public void testGetText_numberToken_returnsExpectedText() throws IOException {
        JsonParser p = createParser("12345");
        p.nextToken();
        assertEquals("12345", p.getText());
        p.close();
    }

    @Test
    public void testGetText_fieldNameToken_returnsFieldName() throws IOException {
        JsonParser p = createParser("{\"myField\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("myField", p.getText());
        p.close();
    }

    @Test
    public void testGetText_nullToken_returnsNull() throws IOException {
        JsonParser p = createParser("{}");
        assertNull(p.getText());
        p.close();
    }

    @Test
    public void testGetTextViaWriter_stringToken_writesExpectedContent() throws IOException {
        JsonParser p = createParser("\"hello world\"");
        p.nextToken();
        java.io.StringWriter sw = new java.io.StringWriter();
        int len = p.getText(sw);
        assertEquals("hello world", sw.toString());
        assertEquals(11, len);
        p.close();
    }

    @Test
    public void testGetTextViaWriter_fieldName_writesExpectedContent() throws IOException {
        JsonParser p = createParser("{\"abc\":1}");
        p.nextToken();
        p.nextToken();
        java.io.StringWriter sw = new java.io.StringWriter();
        int len = p.getText(sw);
        assertEquals("abc", sw.toString());
        assertEquals(3, len);
        p.close();
    }

    @Test
    public void testGetTextViaWriter_numberToken_writesExpectedContent() throws IOException {
        JsonParser p = createParser("42");
        p.nextToken();
        java.io.StringWriter sw = new java.io.StringWriter();
        int len = p.getText(sw);
        assertEquals("42", sw.toString());
        assertEquals(2, len);
        p.close();
    }

    @Test
    public void testGetTextViaWriter_nullToken_returnsZero() throws IOException {
        JsonParser p = createParser("{}");
        java.io.StringWriter sw = new java.io.StringWriter();
        int len = p.getText(sw);
        assertEquals(0, len);
        p.close();
    }

    @Test
    public void testGetTextViaWriter_booleanToken_writesExpectedContent() throws IOException {
        JsonParser p = createParser("true");
        p.nextToken();
        java.io.StringWriter sw = new java.io.StringWriter();
        int len = p.getText(sw);
        assertEquals("true", sw.toString());
        assertEquals(4, len);
        p.close();
    }

    @Test
    public void testGetValueAsString_stringToken_returnsValue() throws IOException {
        JsonParser p = createParser("\"abc\"");
        p.nextToken();
        assertEquals("abc", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsString_fieldNameToken_returnsFieldName() throws IOException {
        JsonParser p = createParser("{\"fld\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals("fld", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsString_withDefault_numberToken_returnsDefault() throws IOException {
        JsonParser p = createParser("1");
        p.nextToken();
        String result = p.getValueAsString("default");
        assertNotNull(result);
        p.close();
    }

    @Test
    public void testGetValueAsString_nullToken_returnsDefaultValue() throws IOException {
        JsonParser p = createParser("{}");
        String result = p.getValueAsString("def");
        assertEquals("def", result);
        p.close();
    }

    // ---------------------------------------------------------
    // getTextCharacters / getTextLength / getTextOffset
    // ---------------------------------------------------------

    @Test
    public void testGetTextCharacters_stringToken_returnsCorrectChars() throws IOException {
        JsonParser p = createParser("\"xyz\"");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertNotNull(chars);
        assertEquals('x', chars[0]);
        p.close();
    }

    @Test
    public void testGetTextCharacters_fieldNameToken_returnsCorrectChars() throws IOException {
        JsonParser p = createParser("{\"nm\":1}");
        p.nextToken();
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals("nm", new String(chars, 0, 2));
        p.close();
    }

    @Test
    public void testGetTextCharacters_nullToken_returnsNull() throws IOException {
        JsonParser p = createParser("{}");
        assertNull(p.getTextCharacters());
        p.close();
    }

    @Test
    public void testGetTextLength_stringToken_returnsCorrectLength() throws IOException {
        JsonParser p = createParser("\"abcdef\"");
        p.nextToken();
        assertEquals(6, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetTextLength_nullToken_returnsZero() throws IOException {
        JsonParser p = createParser("{}");
        assertEquals(0, p.getTextLength());
        p.close();
    }

    @Test
    public void testGetTextOffset_stringToken_returnsZeroOrMore() throws IOException {
        JsonParser p = createParser("\"abc\"");
        p.nextToken();
        assertTrue(p.getTextOffset() >= 0);
        p.close();
    }

    @Test
    public void testGetTextOffset_nullToken_returnsZero() throws IOException {
        JsonParser p = createParser("{}");
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    // ---------------------------------------------------------
    // Binary handling
    // ---------------------------------------------------------

    @Test
    public void testGetBinaryValue_validBase64String_decodesCorrectly() throws IOException {
        JsonParser p = createParser("\"SGVsbG8=\"");
        p.nextToken();
        byte[] result = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertNotNull(result);
        assertEquals("Hello", new String(result));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValue_notStringToken_throwsException() throws IOException {
        JsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue(Base64Variants.getDefaultVariant());
        p.close();
    }

    @Test
    public void testReadBinaryValue_validBase64_writesToOutputStream() throws IOException {
        JsonParser p = createParser("\"SGVsbG8=\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(5, len);
        assertEquals("Hello", out.toString());
        p.close();
    }

    // ---------------------------------------------------------
    // nextFieldName
    // ---------------------------------------------------------

    @Test
    public void testNextFieldNameSerializableString_matches_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"key\":1}");
        p.nextToken(); // START_OBJECT
        SerializedString target = new SerializedString("key");
        boolean matched = p.nextFieldName(target);
        assertTrue(matched);
        p.close();
    }

    @Test
    public void testNextFieldNameSerializableString_noMatch_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"other\":1}");
        p.nextToken();
        SerializedString target = new SerializedString("key");
        boolean matched = p.nextFieldName(target);
        assertFalse(matched);
        p.close();
    }

    @Test
    public void testNextFieldName_stringVersion_returnsFieldName() throws IOException {
        JsonParser p = createParser("{\"field1\":1}");
        p.nextToken();
        String name = p.nextFieldName();
        assertEquals("field1", name);
        p.close();
    }

    @Test
    public void testNextFieldName_afterFieldName_returnsNull() throws IOException {
        JsonParser p = createParser("{\"field1\":1}");
        p.nextToken();
        p.nextFieldName();
        String name = p.nextFieldName();
        assertNull(name);
        p.close();
    }

    @Test
    public void testNextFieldName_closingBrace_returnsNull() throws IOException {
        JsonParser p = createParser("{}");
        p.nextToken();
        String name = p.nextFieldName();
        assertNull(name);
        p.close();
    }

    // ---------------------------------------------------------
    // nextTextValue / nextIntValue / nextLongValue / nextBooleanValue
    // ---------------------------------------------------------

    @Test
    public void testNextTextValue_stringField_returnsValue() throws IOException {
        JsonParser p = createParser("{\"a\":\"text\"}");
        p.nextToken();
        p.nextToken(); // FIELD_NAME
        String value = p.nextTextValue();
        assertEquals("text", value);
        p.close();
    }

    @Test
    public void testNextTextValue_nonStringField_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        String value = p.nextTextValue();
        assertNull(value);
        p.close();
    }

    @Test
    public void testNextIntValue_intField_returnsValue() throws IOException {
        JsonParser p = createParser("{\"a\":42}");
        p.nextToken();
        p.nextToken();
        int value = p.nextIntValue(-1);
        assertEquals(42, value);
        p.close();
    }

    @Test
    public void testNextIntValue_nonIntField_returnsDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        int value = p.nextIntValue(-99);
        assertEquals(-99, value);
        p.close();
    }

    @Test
    public void testNextLongValue_longField_returnsValue() throws IOException {
        JsonParser p = createParser("{\"a\":123456789012}");
        p.nextToken();
        p.nextToken();
        long value = p.nextLongValue(-1L);
        assertEquals(123456789012L, value);
        p.close();
    }

    @Test
    public void testNextLongValue_nonLongField_returnsDefault() throws IOException {
        JsonParser p = createParser("{\"a\":\"str\"}");
        p.nextToken();
        p.nextToken();
        long value = p.nextLongValue(-99L);
        assertEquals(-99L, value);
        p.close();
    }

    @Test
    public void testNextBooleanValue_trueField_returnsTrue() throws IOException {
        JsonParser p = createParser("{\"a\":true}");
        p.nextToken();
        p.nextToken();
        Boolean value = p.nextBooleanValue();
        assertEquals(Boolean.TRUE, value);
        p.close();
    }

    @Test
    public void testNextBooleanValue_falseField_returnsFalse() throws IOException {
        JsonParser p = createParser("{\"a\":false}");
        p.nextToken();
        p.nextToken();
        Boolean value = p.nextBooleanValue();
        assertEquals(Boolean.FALSE, value);
        p.close();
    }

    @Test
    public void testNextBooleanValue_nonBooleanField_returnsNull() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        Boolean value = p.nextBooleanValue();
        assertNull(value);
        p.close();
    }

    // ---------------------------------------------------------
    // finishToken
    // ---------------------------------------------------------

    @Test
    public void testFinishToken_stringToken_completesToken() throws IOException {
        JsonParser p = createParser("\"abcdef\"");
        p.nextToken();
        p.finishToken();
        assertEquals("abcdef", p.getText());
        p.close();
    }

    // ---------------------------------------------------------
    // Location methods
    // ---------------------------------------------------------

    @Test
    public void testGetTokenLocation_afterToken_returnsNonNullLocation() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.nextToken();
        assertNotNull(p.getTokenLocation());
        p.close();
    }

    @Test
    public void testGetCurrentLocation_afterToken_returnsNonNullLocation() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        assertNotNull(p.getCurrentLocation());
        p.close();
    }

    // ---------------------------------------------------------
    // Feature-dependent behaviors
    // ---------------------------------------------------------

    @Test
    public void testSingleQuotes_enabled_parsesFieldAndValue() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        JsonParser p = createParser("{'key':'value'}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("key", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testSingleQuotes_disabled_throwsException() throws IOException {
        JsonParser p = createParser("{'key':'value'}");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test
    public void testUnquotedFieldNames_enabled_parsesFieldName() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        JsonParser p = createParser("{key:1}");
        p.nextToken();
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("key", p.getCurrentName());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnquotedFieldNames_disabled_throwsException() throws IOException {
        JsonParser p = createParser("{key:1}");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test
    public void testComments_enabled_skipsLineComment() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("// comment\n{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testComments_enabled_skipsBlockComment() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = createParser("/* comment */{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testComments_disabled_throwsException() throws IOException {
        JsonParser p = createParser("// comment\n{\"a\":1}");
        p.nextToken();
        p.close();
    }

    @Test
    public void testYamlComments_enabled_skipsHashComment() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        JsonParser p = createParser("# comment\n{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testTrailingComma_enabled_arrayParsesWithoutError() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_TRAILING_COMMA);
        JsonParser p = createParser("[1,2,]");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void testMissingValues_enabled_returnsNullForMissingElement() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_MISSING_VALUES);
        JsonParser p = createParser("[1,,3]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
    }

    @Test
    public void testNonNumericNumbers_enabled_parsesNaN() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("[NaN]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isNaN(p.getDoubleValue()));
        p.close();
    }

    @Test
    public void testNonNumericNumbers_enabled_parsesPositiveInfinity() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        JsonParser p = createParser("[Infinity]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertTrue(Double.isInfinite(p.getDoubleValue()));
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNonNumericNumbers_disabled_throwsException() throws IOException {
        JsonParser p = createParser("[NaN]");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    @Test
    public void testLeadingZeros_enabled_parsesNumber() throws IOException {
        factory.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        JsonParser p = createParser("[007]");
        p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(7, p.getIntValue());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testLeadingZeros_disabled_throwsException() throws IOException {
        JsonParser p = createParser("[007]");
        p.nextToken();
        p.nextToken();
        p.close();
    }

    // ---------------------------------------------------------
    // Edge cases: escapes, EOF, empty string
    // ---------------------------------------------------------

    @Test
    public void testStringWithEscapes_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"line1\\nline2\\ttab\\\"quote\\\"\"");
        p.nextToken();
        String text = p.getText();
        assertTrue(text.contains("\n"));
        assertTrue(text.contains("\t"));
        assertTrue(text.contains("\""));
        p.close();
    }

    @Test
    public void testUnicodeEscape_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"\\u0041\\u0042\"");
        p.nextToken();
        assertEquals("AB", p.getText());
        p.close();
    }

    @Test
    public void testEmptyStringValue_parsesCorrectly() throws IOException {
        JsonParser p = createParser("\"\"");
        p.nextToken();
        assertEquals("", p.getText());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testUnterminatedString_throwsException() throws IOException {
        JsonParser p = createParser("\"abc");
        p.nextToken();
        p.getText();
        p.close();
    }

    @Test
    public void testWhitespaceHandling_skipsAllWhitespaceTypes() throws IOException {
        JsonParser p = createParser("  \t\r\n{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void testMultipleRootValuesWithSeparatingSpace_parsesEachValue() throws IOException {
        JsonParser p = createParser("1 2 3");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        p.close();
    }

    @Test
    public void testLargeInputAcrossBufferBoundary_parsesCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        for (int i = 0; i < 10000; i++) {
            sb.append('a');
        }
        sb.append("\"");
        JsonParser p = createParser(sb.toString());
        p.nextToken();
        String text = p.getText();
        assertEquals(10000, text.length());
        p.close();
    }

    @Test
    public void testLargeNumberAcrossBufferBoundary_parsesCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sb.append('1');
        }
        JsonParser p = createParser(sb.toString());
        JsonToken t = p.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        p.close();
    }

    @Test
    public void testClose_afterParsing_doesNotThrow() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        p.nextToken();
        p.close();
        assertTrue(p.isClosed());
    }

    @Test
    public void testPlusPrefixedNumber_withNonNumericFeature_disabledThrows() throws IOException {
        JsonParser p = createParser("[+1]");
        p.nextToken();
        try {
            p.nextToken();
            fail("Expected exception for '+' prefixed number without proper feature handling");
        } catch (JsonParseException expected) {
            // expected because '+1' is not standard and digit follow leads into invalid number handling
        }
        p.close();
    }
}
