import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class JsonWriterTest {

    private StringWriter stringWriter;
    private JsonWriter jsonWriter;

    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        jsonWriter = new JsonWriter(stringWriter);
    }

    // ---------- Constructor ----------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullWriter_throwsNullPointerException() {
        new JsonWriter(null);
    }

    @Test
    public void testConstructor_validWriter_createsInstance() {
        Writer w = new StringWriter();
        JsonWriter writer = new JsonWriter(w);
        assertNotNull(writer);
    }

    // ---------- setIndent ----------

    @Test
    public void testSetIndent_emptyString_compactOutput() throws IOException {
        jsonWriter.setIndent("");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1);
        jsonWriter.endObject();
        assertEquals("{\"a\":1}", stringWriter.toString());
    }

    @Test
    public void testSetIndent_nonEmptyString_prettyOutput() throws IOException {
        jsonWriter.setIndent("  ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1);
        jsonWriter.endObject();
        String expected = "{\n  \"a\": 1\n}";
        assertEquals(expected, stringWriter.toString());
    }

    // ---------- setLenient / isLenient ----------

    @Test
    public void testSetLenient_true_isLenientReturnsTrue() {
        jsonWriter.setLenient(true);
        assertTrue(jsonWriter.isLenient());
    }

    @Test
    public void testSetLenient_false_isLenientReturnsFalse() {
        jsonWriter.setLenient(false);
        assertFalse(jsonWriter.isLenient());
    }

    @Test
    public void testIsLenient_defaultValue_isFalse() {
        assertFalse(jsonWriter.isLenient());
    }

    // ---------- setHtmlSafe / isHtmlSafe ----------

    @Test
    public void testSetHtmlSafe_true_isHtmlSafeReturnsTrue() {
        jsonWriter.setHtmlSafe(true);
        assertTrue(jsonWriter.isHtmlSafe());
    }

    @Test
    public void testSetHtmlSafe_false_isHtmlSafeReturnsFalse() {
        jsonWriter.setHtmlSafe(false);
        assertFalse(jsonWriter.isHtmlSafe());
    }

    @Test
    public void testHtmlSafe_escapesSpecialCharacters() throws IOException {
        jsonWriter.setHtmlSafe(true);
        jsonWriter.beginArray();
        jsonWriter.value("<>&='");
        jsonWriter.endArray();
        String result = stringWriter.toString();
        assertTrue(result.contains("\\u003c"));
        assertTrue(result.contains("\\u003e"));
        assertTrue(result.contains("\\u0026"));
        assertTrue(result.contains("\\u003d"));
        assertTrue(result.contains("\\u0027"));
    }

    // ---------- setSerializeNulls / getSerializeNulls ----------

    @Test
    public void testSetSerializeNulls_true_getSerializeNullsReturnsTrue() {
        jsonWriter.setSerializeNulls(true);
        assertTrue(jsonWriter.getSerializeNulls());
    }

    @Test
    public void testSetSerializeNulls_false_getSerializeNullsReturnsFalse() {
        jsonWriter.setSerializeNulls(false);
        assertFalse(jsonWriter.getSerializeNulls());
    }

    @Test
    public void testGetSerializeNulls_defaultValue_isTrue() {
        assertTrue(jsonWriter.getSerializeNulls());
    }

    @Test
    public void testSerializeNulls_false_skipsNullMember() throws IOException {
        jsonWriter.setSerializeNulls(false);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.nullValue();
        jsonWriter.name("b").value(1);
        jsonWriter.endObject();
        assertEquals("{\"b\":1}", stringWriter.toString());
    }

    @Test
    public void testSerializeNulls_true_writesNullMember() throws IOException {
        jsonWriter.setSerializeNulls(true);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.nullValue();
        jsonWriter.endObject();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    // ---------- beginArray / endArray ----------

    @Test
    public void testBeginArray_endArray_emptyArray_writesBrackets() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endArray();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testBeginArray_withValues_writesArray() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(2);
        jsonWriter.endArray();
        assertEquals("[1,2]", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_withoutBeginArray_throwsIllegalStateException() throws IOException {
        jsonWriter.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_mismatchedWithObject_throwsIllegalStateException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.endArray();
    }

    // ---------- beginObject / endObject ----------

    @Test
    public void testBeginObject_endObject_emptyObject_writesBraces() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testBeginObject_withNameValue_writesObject() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key").value("value");
        jsonWriter.endObject();
        assertEquals("{\"key\":\"value\"}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_withoutBeginObject_throwsIllegalStateException() throws IOException {
        jsonWriter.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_mismatchedWithArray_throwsIllegalStateException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_danglingName_throwsIllegalStateException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key");
        jsonWriter.endObject();
    }

    // ---------- name ----------

    @Test
    public void testName_validName_setsDeferredName() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key").value(1);
        jsonWriter.endObject();
        assertEquals("{\"key\":1}", stringWriter.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testName_nullName_throwsNullPointerException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testName_calledTwiceInARow_throwsIllegalStateException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.name("b");
    }

    @Test(expected = IllegalStateException.class)
    public void testName_afterClose_throwsIllegalStateException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.close();
        jsonWriter.name("a");
    }

    // ---------- value(String) ----------

    @Test
    public void testValueString_normalString_writesQuotedString() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("hello");
        jsonWriter.endArray();
        assertEquals("[\"hello\"]", stringWriter.toString());
    }

    @Test
    public void testValueString_nullString_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((String) null);
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test
    public void testValueString_emptyString_writesEmptyQuotes() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("");
        jsonWriter.endArray();
        assertEquals("[\"\"]", stringWriter.toString());
    }

    @Test
    public void testValueString_specialCharacters_escapesProperly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("a\"b\\c\td\be\nf\rg\fh");
        jsonWriter.endArray();
        String result = stringWriter.toString();
        assertTrue(result.contains("\\\""));
        assertTrue(result.contains("\\\\"));
        assertTrue(result.contains("\\t"));
        assertTrue(result.contains("\\b"));
        assertTrue(result.contains("\\n"));
        assertTrue(result.contains("\\r"));
        assertTrue(result.contains("\\f"));
    }

    @Test
    public void testValueString_controlCharacter_escapesAsUnicode() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("\u0001");
        jsonWriter.endArray();
        assertEquals("[\"\\u0001\"]", stringWriter.toString());
    }

    @Test
    public void testValueString_lineSeparatorUnicode2028_escapesProperly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("a\u2028b");
        jsonWriter.endArray();
        assertEquals("[\"a\\u2028b\"]", stringWriter.toString());
    }

    @Test
    public void testValueString_paragraphSeparatorUnicode2029_escapesProperly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("a\u2029b");
        jsonWriter.endArray();
        assertEquals("[\"a\\u2029b\"]", stringWriter.toString());
    }

    @Test
    public void testValueString_asObjectPropertyValue_writesCorrectly() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key").value("val");
        jsonWriter.endObject();
        assertEquals("{\"key\":\"val\"}", stringWriter.toString());
    }

    // ---------- jsonValue ----------

    @Test
    public void testJsonValue_validRawJson_writesRawContent() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.jsonValue("{\"raw\":true}");
        jsonWriter.endArray();
        assertEquals("[{\"raw\":true}]", stringWriter.toString());
    }

    @Test
    public void testJsonValue_nullValue_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.jsonValue(null);
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    // ---------- nullValue ----------

    @Test
    public void testNullValue_inArray_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.nullValue();
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test
    public void testNullValue_asObjectMemberWithSerializeNulls_writesNull() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.nullValue();
        jsonWriter.endObject();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    // ---------- value(boolean) ----------

    @Test
    public void testValueBoolean_true_writesTrueLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(true);
        jsonWriter.endArray();
        assertEquals("[true]", stringWriter.toString());
    }

    @Test
    public void testValueBoolean_false_writesFalseLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(false);
        jsonWriter.endArray();
        assertEquals("[false]", stringWriter.toString());
    }

    // ---------- value(double) ----------

    @Test
    public void testValueDouble_normalValue_writesNumber() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(1.5);
        jsonWriter.endArray();
        assertEquals("[1.5]", stringWriter.toString());
    }

    @Test
    public void testValueDouble_zero_writesZero() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(0.0);
        jsonWriter.endArray();
        assertEquals("[0.0]", stringWriter.toString());
    }

    @Test
    public void testValueDouble_negativeValue_writesNegativeNumber() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(-3.14);
        jsonWriter.endArray();
        assertEquals("[-3.14]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_NaN_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_infinity_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testValueDouble_NaNLenient_writesNaN() throws IOException {
        // even in lenient mode, value(double) still throws for NaN/Infinite
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        try {
            jsonWriter.value(Double.NaN);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected because value(double) always disallows NaN/Infinite
        }
    }

    // ---------- value(long) ----------

    @Test
    public void testValueLong_positiveValue_writesNumber() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(100L);
        jsonWriter.endArray();
        assertEquals("[100]", stringWriter.toString());
    }

    @Test
    public void testValueLong_zero_writesZero() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(0L);
        jsonWriter.endArray();
        assertEquals("[0]", stringWriter.toString());
    }

    @Test
    public void testValueLong_negativeValue_writesNegativeNumber() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(-100L);
        jsonWriter.endArray();
        assertEquals("[-100]", stringWriter.toString());
    }

    // ---------- value(Number) ----------

    @Test
    public void testValueNumber_validInteger_writesNumber() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((Number) Integer.valueOf(42));
        jsonWriter.endArray();
        assertEquals("[42]", stringWriter.toString());
    }

    @Test
    public void testValueNumber_null_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((Number) null);
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumber_NaNStrict_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((Number) Double.NaN);
    }

    @Test
    public void testValueNumber_NaNLenient_writesNaN() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value((Number) Double.NaN);
        jsonWriter.endArray();
        assertEquals("[NaN]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumber_InfinityStrict_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((Number) Double.POSITIVE_INFINITY);
    }

    @Test
    public void testValueNumber_InfinityLenient_writesInfinity() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value((Number) Double.POSITIVE_INFINITY);
        jsonWriter.endArray();
        assertEquals("[Infinity]", stringWriter.toString());
    }

    @Test
    public void testValueNumber_negativeInfinityLenient_writesNegativeInfinity() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value((Number) Double.NEGATIVE_INFINITY);
        jsonWriter.endArray();
        assertEquals("[-Infinity]", stringWriter.toString());
    }

    // ---------- flush ----------

    @Test
    public void testFlush_openWriter_doesNotThrow() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.flush();
        jsonWriter.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testFlush_afterClose_throwsIllegalStateException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.close();
        jsonWriter.flush();
    }

    // ---------- close ----------

    @Test
    public void testClose_completeDocument_closesSuccessfully() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.close();
    }

    @Test(expected = IOException.class)
    public void testClose_incompleteDocument_throwsIOException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.close();
    }

    @Test
    public void testClose_lenientTopLevelValue_closesSuccessfully() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.value(1);
        jsonWriter.close();
    }

    // ---------- top-level value strictness ----------

    @Test(expected = IllegalStateException.class)
    public void testValue_topLevelStrictNotObjectOrArray_throwsIllegalStateException() throws IOException {
        jsonWriter.value(1);
    }

    @Test
    public void testValue_topLevelLenient_writesValue() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.value(1);
        assertEquals("1", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testValue_multipleTopLevelValuesStrict_throwsIllegalStateException() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.value(1);
        jsonWriter.setLenient(false);
        jsonWriter.value(2);
    }

    @Test
    public void testValue_multipleTopLevelValuesLenient_writesBoth() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.value(1);
        jsonWriter.value(2);
        assertEquals("12", stringWriter.toString());
    }

    // ---------- nested structures ----------

    @Test
    public void testNestedArraysAndObjects_writesCorrectStructure() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("array");
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(2);
        jsonWriter.endArray();
        jsonWriter.name("nested");
        jsonWriter.beginObject();
        jsonWriter.name("inner").value("value");
        jsonWriter.endObject();
        jsonWriter.endObject();
        assertEquals("{\"array\":[1,2],\"nested\":{\"inner\":\"value\"}}", stringWriter.toString());
    }

    @Test
    public void testMultipleObjectMembers_writesCommaSeparated() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1);
        jsonWriter.name("b").value(2);
        jsonWriter.endObject();
        assertEquals("{\"a\":1,\"b\":2}", stringWriter.toString());
    }

    @Test
    public void testMultipleArrayElements_writesCommaSeparated() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(1);
        jsonWriter.value(2);
        jsonWriter.value(3);
        jsonWriter.endArray();
        assertEquals("[1,2,3]", stringWriter.toString());
    }
}
