import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import com.google.gson.stream.JsonWriter;

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
        JsonWriter jw = new JsonWriter(w);
        assertNotNull(jw);
    }

    // ---------- setIndent ----------

    @Test
    public void testSetIndent_emptyString_compactOutput() throws IOException {
        jsonWriter.setIndent("");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1L);
        jsonWriter.endObject();
        assertEquals("{\"a\":1}", stringWriter.toString());
    }

    @Test
    public void testSetIndent_nonEmptyString_prettyPrintOutput() throws IOException {
        jsonWriter.setIndent("  ");
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1L);
        jsonWriter.endObject();
        String result = stringWriter.toString();
        assertTrue(result.contains("\n"));
        assertTrue(result.contains("  \"a\": 1"));
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
    public void testIsLenient_defaultValue_returnsFalse() {
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
    public void testIsHtmlSafe_defaultValue_returnsFalse() {
        assertFalse(jsonWriter.isHtmlSafe());
    }

    @Test
    public void testHtmlSafe_specialCharactersEscaped() throws IOException {
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
    public void testGetSerializeNulls_defaultValue_returnsTrue() {
        assertTrue(jsonWriter.getSerializeNulls());
    }

    @Test
    public void testSerializeNulls_false_skipsNullMember() throws IOException {
        jsonWriter.setSerializeNulls(false);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.nullValue();
        jsonWriter.name("b").value(1L);
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
    public void testBeginArrayEndArray_emptyArray_writesBrackets() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endArray();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testBeginArray_withElements_writesCorrectJson() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(1L);
        jsonWriter.value(2L);
        jsonWriter.endArray();
        assertEquals("[1,2]", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_whenInObject_throwsIllegalStateException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_withDanglingName_throwsIllegalStateException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.endArray();
    }

    // ---------- beginObject / endObject ----------

    @Test
    public void testBeginObjectEndObject_emptyObject_writesBraces() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testBeginObject_withMembers_writesCorrectJson() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1L);
        jsonWriter.name("b").value(2L);
        jsonWriter.endObject();
        assertEquals("{\"a\":1,\"b\":2}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_whenInArray_throwsIllegalStateException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_withDanglingName_throwsIllegalStateException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.endObject();
    }

    // ---------- name() ----------

    @Test(expected = NullPointerException.class)
    public void testName_nullName_throwsNullPointerException() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testName_duplicateDeferredName_throwsIllegalStateException() throws IOException {
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

    @Test
    public void testName_validName_setsDeferredName() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("key").value("val");
        jsonWriter.endObject();
        assertEquals("{\"key\":\"val\"}", stringWriter.toString());
    }

    // ---------- value(String) ----------

    @Test
    public void testValueString_normalValue_writesQuotedString() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("hello");
        jsonWriter.endArray();
        assertEquals("[\"hello\"]", stringWriter.toString());
    }

    @Test
    public void testValueString_nullValue_writesNullLiteral() throws IOException {
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
    public void testValueString_specialCharacters_escapesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("a\"b\\c\td\be\nf\rg\fh");
        jsonWriter.endArray();
        String expected = "[\"a\\\"b\\\\c\\td\\be\\nf\\rg\\fh\"]";
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    public void testValueString_unicodeLineSeparators_escapesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("a\u2028b\u2029c");
        jsonWriter.endArray();
        assertEquals("[\"a\\u2028b\\u2029c\"]", stringWriter.toString());
    }

    @Test
    public void testValueString_controlCharacters_escapesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value("\u0001\u001f");
        jsonWriter.endArray();
        assertEquals("[\"\\u0001\\u001f\"]", stringWriter.toString());
    }

    // ---------- jsonValue(String) ----------

    @Test
    public void testJsonValue_normalValue_writesRawJson() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.jsonValue("{\"raw\":1}");
        jsonWriter.endArray();
        assertEquals("[{\"raw\":1}]", stringWriter.toString());
    }

    @Test
    public void testJsonValue_nullValue_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.jsonValue(null);
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    // ---------- nullValue() ----------

    @Test
    public void testNullValue_inArray_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.nullValue();
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test
    public void testNullValue_withDeferredNameAndSerializeNullsFalse_skipsMember() throws IOException {
        jsonWriter.setSerializeNulls(false);
        jsonWriter.beginObject();
        jsonWriter.name("a");
        jsonWriter.nullValue();
        jsonWriter.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testNullValue_withDeferredNameAndSerializeNullsTrue_writesMember() throws IOException {
        jsonWriter.setSerializeNulls(true);
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

    // ---------- value(Boolean) ----------

    @Test
    public void testValueBooleanObject_trueValue_writesTrueLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Boolean.TRUE);
        jsonWriter.endArray();
        assertEquals("[true]", stringWriter.toString());
    }

    @Test
    public void testValueBooleanObject_falseValue_writesFalseLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Boolean.FALSE);
        jsonWriter.endArray();
        assertEquals("[false]", stringWriter.toString());
    }

    @Test
    public void testValueBooleanObject_nullValue_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((Boolean) null);
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    // ---------- value(double) ----------

    @Test
    public void testValueDouble_finiteValue_writesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(3.14);
        jsonWriter.endArray();
        assertEquals("[3.14]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_NaN_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_positiveInfinity_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_negativeInfinity_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testValueDouble_negativeValue_writesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(-1.5);
        jsonWriter.endArray();
        assertEquals("[-1.5]", stringWriter.toString());
    }

    // ---------- value(long) ----------

    @Test
    public void testValueLong_positiveValue_writesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(123L);
        jsonWriter.endArray();
        assertEquals("[123]", stringWriter.toString());
    }

    @Test
    public void testValueLong_negativeValue_writesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(-123L);
        jsonWriter.endArray();
        assertEquals("[-123]", stringWriter.toString());
    }

    @Test
    public void testValueLong_zeroValue_writesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(0L);
        jsonWriter.endArray();
        assertEquals("[0]", stringWriter.toString());
    }

    // ---------- value(Number) ----------

    @Test
    public void testValueNumber_normalInteger_writesCorrectly() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Integer.valueOf(42));
        jsonWriter.endArray();
        assertEquals("[42]", stringWriter.toString());
    }

    @Test
    public void testValueNumber_nullValue_writesNullLiteral() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value((Number) null);
        jsonWriter.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumber_NaNNotLenient_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.valueOf(Double.NaN));
    }

    @Test
    public void testValueNumber_NaNLenient_writesNaN() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value(Double.valueOf(Double.NaN));
        jsonWriter.endArray();
        assertEquals("[NaN]", stringWriter.toString());
    }

    @Test
    public void testValueNumber_infinityLenient_writesInfinity() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.beginArray();
        jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
        jsonWriter.endArray();
        assertEquals("[Infinity]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumber_negativeInfinityNotLenient_throwsIllegalArgumentException() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
    }

    // ---------- flush() ----------

    @Test
    public void testFlush_openWriter_doesNotThrow() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(1L);
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

    // ---------- close() ----------

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

    @Test(expected = IOException.class)
    public void testClose_emptyDocument_throwsIOException() throws IOException {
        jsonWriter.close();
    }

    // ---------- beforeValue() nesting ----------

    @Test(expected = IllegalStateException.class)
    public void testValue_multipleTopLevelValuesNotLenient_throwsIllegalStateException() throws IOException {
        jsonWriter.value(1L);
        jsonWriter.value(2L);
    }

    @Test
    public void testValue_multipleTopLevelValuesLenient_writesBoth() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.value(1L);
        jsonWriter.value(2L);
        assertEquals("12", stringWriter.toString());
    }

    @Test
    public void testValue_topLevelStringLenient_writesValue() throws IOException {
        jsonWriter.setLenient(true);
        jsonWriter.value("hello");
        assertEquals("\"hello\"", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArray_topLevelNotLenientTwice_throwsIllegalStateException() throws IOException {
        // Attempting to write value at top level without array/object wrapper, not lenient
        jsonWriter.value("first");
        jsonWriter.value("second");
    }

    // ---------- Nested structures ----------

    @Test
    public void testNestedArraysAndObjects_complexStructure_writesCorrectly() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("array");
        jsonWriter.beginArray();
        jsonWriter.value(1L);
        jsonWriter.value(2L);
        jsonWriter.beginObject();
        jsonWriter.name("nested").value("value");
        jsonWriter.endObject();
        jsonWriter.endArray();
        jsonWriter.endObject();
        assertEquals("{\"array\":[1,2,{\"nested\":\"value\"}]}", stringWriter.toString());
    }

    @Test
    public void testMultipleArrayElements_writesCommaSeparated() throws IOException {
        jsonWriter.beginArray();
        jsonWriter.value(1L);
        jsonWriter.value(2L);
        jsonWriter.value(3L);
        jsonWriter.endArray();
        assertEquals("[1,2,3]", stringWriter.toString());
    }

    @Test
    public void testMultipleObjectMembers_writesCommaSeparated() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("a").value(1L);
        jsonWriter.name("b").value(2L);
        jsonWriter.name("c").value(3L);
        jsonWriter.endObject();
        assertEquals("{\"a\":1,\"b\":2,\"c\":3}", stringWriter.toString());
    }

    @Test
    public void testEmptyStringName_writesEmptyQuotedName() throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("").value(1L);
        jsonWriter.endObject();
        assertEquals("{\"\":1}", stringWriter.toString());
    }

    @Test
    public void testStackGrowth_deeplyNestedArrays_doesNotThrow() throws IOException {
        int depth = 40;
        for (int i = 0; i < depth; i++) {
            jsonWriter.beginArray();
        }
        for (int i = 0; i < depth; i++) {
            jsonWriter.endArray();
        }
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            expected.append('[');
        }
        for (int i = 0; i < depth; i++) {
            expected.append(']');
        }
        assertEquals(expected.toString(), stringWriter.toString());
    }
}
