import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.EOFException;

public class JsonReaderTest {

    private JsonReader newReader(String json) {
        return new JsonReader(new StringReader(json));
    }

    // ---------- Constructor ----------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullReader_throwsNPE() {
        new JsonReader(null);
    }

    @Test
    public void testConstructor_validReader_created() {
        JsonReader reader = newReader("{}");
        assertNotNull(reader);
    }

    // ---------- setLenient / isLenient ----------

    @Test
    public void testSetLenient_true_isLenientReturnsTrue() {
        JsonReader reader = newReader("{}");
        reader.setLenient(true);
        assertTrue(reader.isLenient());
    }

    @Test
    public void testSetLenient_false_isLenientReturnsFalse() {
        JsonReader reader = newReader("{}");
        reader.setLenient(false);
        assertFalse(reader.isLenient());
    }

    @Test
    public void testIsLenient_default_isFalse() {
        JsonReader reader = newReader("{}");
        assertFalse(reader.isLenient());
    }

    // ---------- beginArray / endArray ----------

    @Test
    public void testBeginArray_validArray_success() throws IOException {
        JsonReader reader = newReader("[1,2,3]");
        reader.beginArray();
        assertEquals(1, reader.nextInt());
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArray_notAnArray_throwsException() throws IOException {
        JsonReader reader = newReader("{}");
        reader.beginArray();
    }

    @Test
    public void testEndArray_validEmptyArray_success() throws IOException {
        JsonReader reader = newReader("[]");
        reader.beginArray();
        reader.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_notEndOfArray_throwsException() throws IOException {
        JsonReader reader = newReader("[1,2]");
        reader.beginArray();
        reader.endArray();
    }

    // ---------- beginObject / endObject ----------

    @Test
    public void testBeginObject_validObject_success() throws IOException {
        JsonReader reader = newReader("{\"a\":1}");
        reader.beginObject();
        assertEquals("a", reader.nextName());
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginObject_notAnObject_throwsException() throws IOException {
        JsonReader reader = newReader("[]");
        reader.beginObject();
    }

    @Test
    public void testEndObject_validEmptyObject_success() throws IOException {
        JsonReader reader = newReader("{}");
        reader.beginObject();
        reader.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_notEndOfObject_throwsException() throws IOException {
        JsonReader reader = newReader("{\"a\":1}");
        reader.beginObject();
        reader.endObject();
    }

    // ---------- hasNext ----------

    @Test
    public void testHasNext_arrayWithElements_returnsTrue() throws IOException {
        JsonReader reader = newReader("[1,2]");
        reader.beginArray();
        assertTrue(reader.hasNext());
    }

    @Test
    public void testHasNext_emptyArray_returnsFalse() throws IOException {
        JsonReader reader = newReader("[]");
        reader.beginArray();
        assertFalse(reader.hasNext());
    }

    @Test
    public void testHasNext_emptyObject_returnsFalse() throws IOException {
        JsonReader reader = newReader("{}");
        reader.beginObject();
        assertFalse(reader.hasNext());
    }

    // ---------- peek ----------

    @Test
    public void testPeek_beginArray_returnsBeginArray() throws IOException {
        JsonReader reader = newReader("[1]");
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    }

    @Test
    public void testPeek_beginObject_returnsBeginObject() throws IOException {
        JsonReader reader = newReader("{}");
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
    }

    @Test
    public void testPeek_string_returnsString() throws IOException {
        JsonReader reader = newReader("\"hello\"");
        assertEquals(JsonToken.STRING, reader.peek());
    }

    @Test
    public void testPeek_number_returnsNumber() throws IOException {
        JsonReader reader = newReader("123");
        assertEquals(JsonToken.NUMBER, reader.peek());
    }

    @Test
    public void testPeek_booleanTrue_returnsBoolean() throws IOException {
        JsonReader reader = newReader("true");
        assertEquals(JsonToken.BOOLEAN, reader.peek());
    }

    @Test
    public void testPeek_null_returnsNull() throws IOException {
        JsonReader reader = newReader("null");
        assertEquals(JsonToken.NULL, reader.peek());
    }

    @Test
    public void testPeek_endArray_returnsEndArray() throws IOException {
        JsonReader reader = newReader("[]");
        reader.beginArray();
        assertEquals(JsonToken.END_ARRAY, reader.peek());
    }

    @Test
    public void testPeek_endObject_returnsEndObject() throws IOException {
        JsonReader reader = newReader("{}");
        reader.beginObject();
        assertEquals(JsonToken.END_OBJECT, reader.peek());
    }

    @Test
    public void testPeek_name_returnsName() throws IOException {
        JsonReader reader = newReader("{\"a\":1}");
        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
    }

    @Test
    public void testPeek_endDocument_returnsEndDocument() throws IOException {
        JsonReader reader = newReader("1");
        reader.setLenient(true);
        reader.nextInt();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    // ---------- nextName ----------

    @Test
    public void testNextName_doubleQuoted_returnsName() throws IOException {
        JsonReader reader = newReader("{\"key\":1}");
        reader.beginObject();
        assertEquals("key", reader.nextName());
    }

    @Test
    public void testNextName_singleQuoted_returnsName() throws IOException {
        JsonReader reader = newReader("{'key':1}");
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("key", reader.nextName());
    }

    @Test
    public void testNextName_unquoted_returnsName() throws IOException {
        JsonReader reader = newReader("{key:1}");
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("key", reader.nextName());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextName_notAName_throwsException() throws IOException {
        JsonReader reader = newReader("[1]");
        reader.beginArray();
        reader.nextName();
    }

    // ---------- nextString ----------

    @Test
    public void testNextString_doubleQuoted_returnsString() throws IOException {
        JsonReader reader = newReader("\"hello\"");
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNextString_singleQuoted_returnsString() throws IOException {
        JsonReader reader = newReader("'hello'");
        reader.setLenient(true);
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNextString_unquoted_returnsString() throws IOException {
        JsonReader reader = newReader("hello");
        reader.setLenient(true);
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNextString_numberAsString_returnsString() throws IOException {
        JsonReader reader = newReader("123");
        assertEquals("123", reader.nextString());
    }

    @Test
    public void testNextString_longNumberAsString_returnsString() throws IOException {
        JsonReader reader = newReader("12345678901234");
        assertEquals("12345678901234", reader.nextString());
    }

    @Test
    public void testNextString_doubleNumberAsString_returnsString() throws IOException {
        JsonReader reader = newReader("1.5");
        assertEquals("1.5", reader.nextString());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextString_notAString_throwsException() throws IOException {
        JsonReader reader = newReader("[]");
        reader.nextString();
    }

    // ---------- nextBoolean ----------

    @Test
    public void testNextBoolean_true_returnsTrue() throws IOException {
        JsonReader reader = newReader("true");
        assertTrue(reader.nextBoolean());
    }

    @Test
    public void testNextBoolean_false_returnsFalse() throws IOException {
        JsonReader reader = newReader("false");
        assertFalse(reader.nextBoolean());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextBoolean_notABoolean_throwsException() throws IOException {
        JsonReader reader = newReader("1");
        reader.nextBoolean();
    }

    // ---------- nextNull ----------

    @Test
    public void testNextNull_nullValue_success() throws IOException {
        JsonReader reader = newReader("null");
        reader.nextNull();
    }

    @Test(expected = IllegalStateException.class)
    public void testNextNull_notNull_throwsException() throws IOException {
        JsonReader reader = newReader("1");
        reader.nextNull();
    }

    // ---------- nextDouble ----------

    @Test
    public void testNextDouble_simpleNumber_returnsDouble() throws IOException {
        JsonReader reader = newReader("1.5");
        assertEquals(1.5, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDouble_longNumberInput_returnsDouble() throws IOException {
        JsonReader reader = newReader("100");
        assertEquals(100.0, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDouble_quotedString_returnsDouble() throws IOException {
        JsonReader reader = newReader("\"1.5\"");
        assertEquals(1.5, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDouble_singleQuotedString_returnsDouble() throws IOException {
        JsonReader reader = newReader("'1.5'");
        reader.setLenient(true);
        assertEquals(1.5, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDouble_unquotedString_returnsDouble() throws IOException {
        JsonReader reader = newReader("1.5e2");
        assertEquals(150.0, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDouble_nanLenient_returnsNaN() throws IOException {
        JsonReader reader = newReader("\"NaN\"");
        reader.setLenient(true);
        assertTrue(Double.isNaN(reader.nextDouble()));
    }

    @Test(expected = MalformedJsonException.class)
    public void testNextDouble_nanStrict_throwsException() throws IOException {
        JsonReader reader = newReader("\"NaN\"");
        reader.nextDouble();
    }

    @Test(expected = IllegalStateException.class)
    public void testNextDouble_notANumber_throwsException() throws IOException {
        JsonReader reader = newReader("[]");
        reader.nextDouble();
    }

    @Test(expected = NumberFormatException.class)
    public void testNextDouble_invalidNumberFormat_throwsException() throws IOException {
        JsonReader reader = newReader("\"not-a-number\"");
        reader.setLenient(true);
        reader.nextDouble();
    }

    // ---------- nextLong ----------

    @Test
    public void testNextLong_simpleNumber_returnsLong() throws IOException {
        JsonReader reader = newReader("123");
        assertEquals(123L, reader.nextLong());
    }

    @Test
    public void testNextLong_negativeNumber_returnsLong() throws IOException {
        JsonReader reader = newReader("-123");
        assertEquals(-123L, reader.nextLong());
    }

    @Test
    public void testNextLong_quotedNumberString_returnsLong() throws IOException {
        JsonReader reader = newReader("\"123\"");
        assertEquals(123L, reader.nextLong());
    }

    @Test
    public void testNextLong_unquotedNumberString_returnsLong() throws IOException {
        JsonReader reader = newReader("123");
        reader.setLenient(true);
        assertEquals(123L, reader.nextLong());
    }

    @Test
    public void testNextLong_veryLargeNumber_returnsAsDouble() throws IOException {
        JsonReader reader = newReader("9007199254740993.0");
        long value = reader.nextLong();
        assertEquals(9007199254740992L, value);
    }

    @Test(expected = IllegalStateException.class)
    public void testNextLong_notANumber_throwsException() throws IOException {
        JsonReader reader = newReader("[]");
        reader.nextLong();
    }

    @Test(expected = NumberFormatException.class)
    public void testNextLong_lossOfPrecision_throwsException() throws IOException {
        JsonReader reader = newReader("1.5");
        reader.nextLong();
    }

    @Test
    public void testNextLong_stringFallbackToDouble_returnsLong() throws IOException {
        JsonReader reader = newReader("\"123.0\"");
        assertEquals(123L, reader.nextLong());
    }

    // ---------- nextInt ----------

    @Test
    public void testNextInt_simpleNumber_returnsInt() throws IOException {
        JsonReader reader = newReader("123");
        assertEquals(123, reader.nextInt());
    }

    @Test
    public void testNextInt_negativeNumber_returnsInt() throws IOException {
        JsonReader reader = newReader("-123");
        assertEquals(-123, reader.nextInt());
    }

    @Test
    public void testNextInt_quotedNumberString_returnsInt() throws IOException {
        JsonReader reader = newReader("\"123\"");
        assertEquals(123, reader.nextInt());
    }

    @Test
    public void testNextInt_unquotedNumberString_returnsInt() throws IOException {
        JsonReader reader = newReader("hello123");
        reader.setLenient(true);
        try {
            reader.nextInt();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testNextInt_notANumber_throwsException() throws IOException {
        JsonReader reader = newReader("[]");
        reader.nextInt();
    }

    @Test(expected = NumberFormatException.class)
    public void testNextInt_overflowLong_throwsException() throws IOException {
        JsonReader reader = newReader("99999999999999");
        reader.nextInt();
    }

    @Test
    public void testNextInt_stringFallbackToDouble_returnsInt() throws IOException {
        JsonReader reader = newReader("\"123.0\"");
        assertEquals(123, reader.nextInt());
    }

    @Test(expected = NumberFormatException.class)
    public void testNextInt_lossOfPrecisionFromDouble_throwsException() throws IOException {
        JsonReader reader = newReader("\"123.5\"");
        reader.nextInt();
    }

    // ---------- close ----------

    @Test
    public void testClose_validReader_success() throws IOException {
        JsonReader reader = newReader("{}");
        reader.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testClose_thenUseReader_throwsException() throws IOException {
        JsonReader reader = newReader("{}");
        reader.close();
        reader.beginObject();
    }

    // ---------- skipValue ----------

    @Test
    public void testSkipValue_simpleNumber_success() throws IOException {
        JsonReader reader = newReader("[1,2]");
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void testSkipValue_nestedArray_success() throws IOException {
        JsonReader reader = newReader("[[1,2],3]");
        reader.beginArray();
        reader.skipValue();
        assertEquals(3, reader.nextInt());
    }

    @Test
    public void testSkipValue_nestedObject_success() throws IOException {
        JsonReader reader = newReader("[{\"a\":1},2]");
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void testSkipValue_string_success() throws IOException {
        JsonReader reader = newReader("[\"hello\",2]");
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void testSkipValue_singleQuotedString_success() throws IOException {
        JsonReader reader = newReader("['hello',2]");
        reader.setLenient(true);
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void testSkipValue_unquotedString_success() throws IOException {
        JsonReader reader = newReader("[hello,2]");
        reader.setLenient(true);
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void testSkipValue_name_success() throws IOException {
        JsonReader reader = newReader("{\"a\":1}");
        reader.beginObject();
        reader.skipValue();
        reader.skipValue();
        reader.endObject();
    }

    // ---------- getPath ----------

    @Test
    public void testGetPath_rootDocument_returnsDollarSign() throws IOException {
        JsonReader reader = newReader("{}");
        assertEquals("$", reader.getPath());
    }

    @Test
    public void testGetPath_insideArray_returnsIndexPath() throws IOException {
        JsonReader reader = newReader("[1,2]");
        reader.beginArray();
        reader.nextInt();
        assertEquals("$[1]", reader.getPath());
    }

    @Test
    public void testGetPath_insideObject_returnsNamePath() throws IOException {
        JsonReader reader = newReader("{\"a\":1}");
        reader.beginObject();
        reader.nextName();
        assertEquals("$.a", reader.getPath());
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsClassNameWithLocation() throws IOException {
        JsonReader reader = newReader("{}");
        String result = reader.toString();
        assertTrue(result.startsWith("JsonReader"));
    }

    // ---------- lenient parsing features ----------

    @Test
    public void testLenient_nonExecutePrefix_success() throws IOException {
        JsonReader reader = newReader(")]}'\n[1,2,3]");
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1, reader.nextInt());
    }

    @Test
    public void testLenient_endOfLineComment_success() throws IOException {
        JsonReader reader = newReader("// comment\n[1]");
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1, reader.nextInt());
    }

    @Test
    public void testLenient_hashComment_success() throws IOException {
        JsonReader reader = newReader("# comment\n[1]");
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1, reader.nextInt());
    }

    @Test
    public void testLenient_cStyleComment_success() throws IOException {
        JsonReader reader = newReader("/* comment */[1]");
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1, reader.nextInt());
    }

    @Test(expected = MalformedJsonException.class)
    public void testLenient_unterminatedComment_throwsException() throws IOException {
        JsonReader reader = newReader("/* comment [1]");
        reader.setLenient(true);
        reader.beginArray();
    }

    @Test
    public void testLenient_semicolonSeparatorInArray_success() throws IOException {
        JsonReader reader = newReader("[1;2]");
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void testLenient_semicolonSeparatorInObject_success() throws IOException {
        JsonReader reader = newReader("{\"a\":1;\"b\":2}");
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        reader.nextInt();
        assertEquals("b", reader.nextName());
        reader.nextInt();
    }

    @Test
    public void testLenient_equalsSeparator_success() throws IOException {
        JsonReader reader = newReader("{\"a\"=1}");
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1, reader.nextInt());
    }

    @Test
    public void testLenient_equalsGreaterThanSeparator_success() throws IOException {
        JsonReader reader = newReader("{\"a\"=>1}");
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1, reader.nextInt());
    }

    @Test
    public void testLenient_trailingCommaInArray_returnsNull() throws IOException {
        JsonReader reader = newReader("[1,]");
        reader.setLenient(true);
        reader.beginArray();
        reader.nextInt();
        assertEquals(JsonToken.NULL, reader.peek());
    }

    @Test
    public void testLenient_unquotedName_success() throws IOException {
        JsonReader reader = newReader("{a:1}");
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
    }

    @Test
    public void testLenient_multipleTopLevelValues_success() throws IOException {
        JsonReader reader = newReader("1 2");
        reader.setLenient(true);
        assertEquals(1, reader.nextInt());
        assertEquals(2, reader.nextInt());
    }

    @Test(expected = MalformedJsonException.class)
    public void testStrict_multipleTopLevelValues_throwsException() throws IOException {
        JsonReader reader = newReader("1 2");
        reader.nextInt();
        reader.nextInt();
    }

    @Test(expected = MalformedJsonException.class)
    public void testStrict_commentsNotAllowed_throwsException() throws IOException {
        JsonReader reader = newReader("// comment\n[1]");
        reader.beginArray();
    }

    // ---------- escape sequences ----------

    @Test
    public void testNextString_escapedCharacters_returnsUnescapedString() throws IOException {
        JsonReader reader = newReader("\"a\\tb\\nc\\\\d\\\"e\\/f\"");
        assertEquals("a\tb\nc\\d\"e/f", reader.nextString());
    }

    @Test
    public void testNextString_unicodeEscape_returnsUnicodeCharacter() throws IOException {
        JsonReader reader = newReader("\"\\u0041\"");
        assertEquals("A", reader.nextString());
    }

    @Test(expected = MalformedJsonException.class)
    public void testNextString_unterminatedString_throwsException() throws IOException {
        JsonReader reader = newReader("\"unterminated");
        reader.nextString();
    }

    @Test(expected = EOFException.class)
    public void testBeginArray_endOfInput_throwsEOFException() throws IOException {
        JsonReader reader = newReader("");
        reader.beginArray();
    }

    // ---------- syntax errors ----------

    @Test(expected = MalformedJsonException.class)
    public void testDoPeek_unterminatedArray_throwsException() throws IOException {
        JsonReader reader = newReader("[1 2]");
        reader.beginArray();
        reader.nextInt();
        reader.nextInt();
    }

    @Test(expected = MalformedJsonException.class)
    public void testDoPeek_unterminatedObject_throwsException() throws IOException {
        JsonReader reader = newReader("{\"a\":1 \"b\":2}");
        reader.beginObject();
        reader.nextName();
        reader.nextInt();
        reader.nextName();
    }

    @Test(expected = MalformedJsonException.class)
    public void testDoPeek_expectedColon_throwsException() throws IOException {
        JsonReader reader = newReader("{\"a\" 1}");
        reader.beginObject();
        reader.nextName();
        reader.nextInt();
    }

    @Test(expected = MalformedJsonException.class)
    public void testDoPeek_expectedNameStrict_throwsException() throws IOException {
        JsonReader reader = newReader("{a:1}");
        reader.beginObject();
        reader.nextName();
    }

    @Test
    public void testNextInt_multipleValuesInArray_returnsCorrectValues() throws IOException {
        JsonReader reader = newReader("[1,2,3,4,5]");
        reader.beginArray();
        int sum = 0;
        while (reader.hasNext()) {
            sum += reader.nextInt();
        }
        reader.endArray();
        assertEquals(15, sum);
    }

    @Test
    public void testNestedArraysAndObjects_fullTraversal_success() throws IOException {
        JsonReader reader = newReader("{\"a\":[1,2,{\"b\":true}]}");
        reader.beginObject();
        assertEquals("a", reader.nextName());
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        assertEquals(2, reader.nextInt());
        reader.beginObject();
        assertEquals("b", reader.nextName());
        assertTrue(reader.nextBoolean());
        reader.endObject();
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testNextDouble_negativeNumber_returnsNegativeDouble() throws IOException {
        JsonReader reader = newReader("-1.5");
        assertEquals(-1.5, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextLong_minValue_returnsMinLong() throws IOException {
        JsonReader reader = newReader(String.valueOf(Long.MIN_VALUE));
        assertEquals(Long.MIN_VALUE, reader.nextLong());
    }

    @Test
    public void testNextLong_maxValue_returnsMaxLong() throws IOException {
        JsonReader reader = newReader(String.valueOf(Long.MAX_VALUE));
        assertEquals(Long.MAX_VALUE, reader.nextLong());
    }

    @Test
    public void testPeek_infinityLenient_returnsAsUnquoted() throws IOException {
        JsonReader reader = newReader("Infinity");
        reader.setLenient(true);
        double val = reader.nextDouble();
        assertTrue(Double.isInfinite(val));
    }

    @Test
    public void testNextDouble_negativeInfinityLenient_returnsNegativeInfinity() throws IOException {
        JsonReader reader = newReader("-Infinity");
        reader.setLenient(true);
        double val = reader.nextDouble();
        assertTrue(Double.isInfinite(val));
        assertTrue(val < 0);
    }
}
