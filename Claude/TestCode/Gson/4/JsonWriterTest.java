import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

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
  public void testConstructor_nullWriter_throwsNPE() {
    new JsonWriter(null);
  }

  // ---------- beginArray / endArray ----------

  @Test
  public void testBeginArrayEndArray_empty_writesEmptyBrackets() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.endArray();
    assertEquals("[]", stringWriter.toString());
  }

  @Test
  public void testBeginArray_withValues_writesCommaSeparated() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(1);
    jsonWriter.value(2);
    jsonWriter.endArray();
    assertEquals("[1,2]", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_nestingProblem_throwsIllegalState() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.endArray();
  }

  // ---------- beginObject / endObject ----------

  @Test
  public void testBeginObjectEndObject_empty_writesEmptyBraces() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.endObject();
    assertEquals("{}", stringWriter.toString());
  }

  @Test
  public void testBeginObject_withNameValue_writesCorrectly() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.name("a").value(1);
    jsonWriter.endObject();
    assertEquals("{\"a\":1}", stringWriter.toString());
  }

  @Test
  public void testBeginObject_withMultipleNames_writesCommaSeparated() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.name("a").value(1);
    jsonWriter.name("b").value(2);
    jsonWriter.endObject();
    assertEquals("{\"a\":1,\"b\":2}", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_withDanglingName_throwsIllegalState() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.name("a");
    jsonWriter.endObject();
  }

  // ---------- name() ----------

  @Test(expected = NullPointerException.class)
  public void testName_null_throwsNPE() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.name(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testName_afterDeferredName_throwsIllegalState() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.name("a");
    jsonWriter.name("b");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_afterClose_throwsIllegalState() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.endArray();
    jsonWriter.close();
    jsonWriter.name("a");
  }

  // ---------- value(String) ----------

  @Test
  public void testValueString_normal_writesQuotedString() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value("hello");
    jsonWriter.endArray();
    assertEquals("[\"hello\"]", stringWriter.toString());
  }

  @Test
  public void testValueString_null_writesNullLiteral() throws IOException {
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

  // ---------- jsonValue() ----------

  @Test
  public void testJsonValue_normal_writesRawValue() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.jsonValue("123");
    jsonWriter.endArray();
    assertEquals("[123]", stringWriter.toString());
  }

  @Test
  public void testJsonValue_null_writesNullLiteral() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.jsonValue(null);
    jsonWriter.endArray();
    assertEquals("[null]", stringWriter.toString());
  }

  // ---------- nullValue() ----------

  @Test
  public void testNullValue_serializeNullsTrue_writesNull() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.name("a");
    jsonWriter.nullValue();
    jsonWriter.endObject();
    assertEquals("{\"a\":null}", stringWriter.toString());
  }

  @Test
  public void testNullValue_serializeNullsFalse_skipsNameAndValue() throws IOException {
    jsonWriter.setSerializeNulls(false);
    jsonWriter.beginObject();
    jsonWriter.name("a");
    jsonWriter.nullValue();
    jsonWriter.endObject();
    assertEquals("{}", stringWriter.toString());
  }

  @Test
  public void testNullValue_inArray_writesNull() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.nullValue();
    jsonWriter.endArray();
    assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void testGetSerializeNulls_defaultTrue() {
    assertTrue(jsonWriter.getSerializeNulls());
  }

  @Test
  public void testSetSerializeNulls_false_getterReturnsFalse() {
    jsonWriter.setSerializeNulls(false);
    assertFalse(jsonWriter.getSerializeNulls());
  }

  // ---------- value(boolean) ----------

  @Test
  public void testValueBoolean_true_writesTrue() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(true);
    jsonWriter.endArray();
    assertEquals("[true]", stringWriter.toString());
  }

  @Test
  public void testValueBoolean_false_writesFalse() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(false);
    jsonWriter.endArray();
    assertEquals("[false]", stringWriter.toString());
  }

  // ---------- value(double) ----------

  @Test
  public void testValueDouble_normal_writesNumber() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(1.5);
    jsonWriter.endArray();
    assertEquals("[1.5]", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_NaN_throwsIllegalArgumentException() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_Infinite_throwsIllegalArgumentException() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_NegativeInfinite_throwsIllegalArgumentException() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(Double.NEGATIVE_INFINITY);
  }

  // ---------- value(long) ----------

  @Test
  public void testValueLong_normal_writesNumber() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(123456789L);
    jsonWriter.endArray();
    assertEquals("[123456789]", stringWriter.toString());
  }

  @Test
  public void testValueLong_negative_writesNegativeNumber() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(-5L);
    jsonWriter.endArray();
    assertEquals("[-5]", stringWriter.toString());
  }

  // ---------- value(Number) ----------

  @Test
  public void testValueNumber_normal_writesNumber() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(Integer.valueOf(42));
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
  public void testValueNumber_NaNNotLenient_throwsIllegalArgumentException() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(Double.valueOf(Double.NaN));
  }

  @Test
  public void testValueNumber_NaNLenient_writesNaN() throws IOException {
    jsonWriter.setLenient(true);
    jsonWriter.value(Double.valueOf(Double.NaN));
    assertEquals("NaN", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueNumber_InfinityNotLenient_throwsIllegalArgumentException() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueNumber_NegativeInfinityNotLenient_throwsIllegalArgumentException() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
  }

  // ---------- flush() ----------

  @Test
  public void testFlush_normal_doesNotThrow() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value(1);
    jsonWriter.flush();
    jsonWriter.endArray();
    // no exception expected
  }

  @Test(expected = IllegalStateException.class)
  public void testFlush_afterClose_throwsIllegalState() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.endArray();
    jsonWriter.close();
    jsonWriter.flush();
  }

  // ---------- close() ----------

  @Test
  public void testClose_completeDocument_succeeds() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.endArray();
    jsonWriter.close();
    // no exception expected
  }

  @Test(expected = IOException.class)
  public void testClose_incompleteDocument_throwsIOException() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.close();
  }

  @Test(expected = IOException.class)
  public void testClose_noTopLevelValue_throwsIOException() throws IOException {
    jsonWriter.close();
  }

  // ---------- setIndent ----------

  @Test
  public void testSetIndent_prettyPrint_writesIndentedOutput() throws IOException {
    jsonWriter.setIndent("  ");
    jsonWriter.beginObject();
    jsonWriter.name("a").value(1);
    jsonWriter.endObject();
    String expected = "{\n  \"a\": 1\n}";
    assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void testSetIndent_emptyString_compactOutput() throws IOException {
    jsonWriter.setIndent("");
    jsonWriter.beginObject();
    jsonWriter.name("a").value(1);
    jsonWriter.endObject();
    assertEquals("{\"a\":1}", stringWriter.toString());
  }

  // ---------- setLenient / isLenient ----------

  @Test
  public void testIsLenient_defaultFalse() {
    assertFalse(jsonWriter.isLenient());
  }

  @Test
  public void testSetLenient_true_getterReturnsTrue() {
    jsonWriter.setLenient(true);
    assertTrue(jsonWriter.isLenient());
  }

  @Test(expected = IllegalStateException.class)
  public void testTopLevelValue_notLenient_notObjectOrArray_throwsIllegalState() throws IOException {
    jsonWriter.value("hello");
  }

  @Test
  public void testTopLevelValue_lenient_succeeds() throws IOException {
    jsonWriter.setLenient(true);
    jsonWriter.value("hello");
    assertEquals("\"hello\"", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testMultipleTopLevelValues_notLenient_throwsIllegalState() throws IOException {
    jsonWriter.setLenient(true);
    jsonWriter.value(1);
    jsonWriter.setLenient(false);
    jsonWriter.value(2);
  }

  @Test
  public void testMultipleTopLevelValues_lenient_succeeds() throws IOException {
    jsonWriter.setLenient(true);
    jsonWriter.value(1);
    jsonWriter.value(2);
    assertEquals("12", stringWriter.toString());
  }

  // ---------- setHtmlSafe / isHtmlSafe ----------

  @Test
  public void testIsHtmlSafe_defaultFalse() {
    assertFalse(jsonWriter.isHtmlSafe());
  }

  @Test
  public void testSetHtmlSafe_true_escapesHtmlChars() throws IOException {
    jsonWriter.setHtmlSafe(true);
    assertTrue(jsonWriter.isHtmlSafe());
    jsonWriter.beginArray();
    jsonWriter.value("<html>&'=");
    jsonWriter.endArray();
    String result = stringWriter.toString();
    assertTrue(result.contains("\\u003c"));
    assertTrue(result.contains("\\u003e"));
    assertTrue(result.contains("\\u0026"));
    assertTrue(result.contains("\\u0027"));
    assertTrue(result.contains("\\u003d"));
  }

  @Test
  public void testSetHtmlSafe_false_doesNotEscapeHtmlChars() throws IOException {
    jsonWriter.setHtmlSafe(false);
    jsonWriter.beginArray();
    jsonWriter.value("<html>");
    jsonWriter.endArray();
    assertEquals("[\"<html>\"]", stringWriter.toString());
  }

  // ---------- string escaping (control chars, quotes, backslash) ----------

  @Test
  public void testValueString_withControlAndSpecialChars_escapesCorrectly() throws IOException {
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
  public void testValueString_withUnicodeLineSeparators_escapesCorrectly() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value("a\u2028b\u2029c");
    jsonWriter.endArray();
    String result = stringWriter.toString();
    assertTrue(result.contains("\\u2028"));
    assertTrue(result.contains("\\u2029"));
  }

  @Test
  public void testValueString_withOtherUnicodeChar_notEscaped() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.value("caf\u00e9");
    jsonWriter.endArray();
    assertEquals("[\"caf\u00e9\"]", stringWriter.toString());
  }

  // ---------- nested arrays/objects ----------

  @Test
  public void testNestedArrayInObject_writesCorrectly() throws IOException {
    jsonWriter.beginObject();
    jsonWriter.name("arr");
    jsonWriter.beginArray();
    jsonWriter.value(1);
    jsonWriter.value(2);
    jsonWriter.endArray();
    jsonWriter.endObject();
    assertEquals("{\"arr\":[1,2]}", stringWriter.toString());
  }

  @Test
  public void testNestedObjectInArray_writesCorrectly() throws IOException {
    jsonWriter.beginArray();
    jsonWriter.beginObject();
    jsonWriter.name("k").value("v");
    jsonWriter.endObject();
    jsonWriter.endArray();
    assertEquals("[{\"k\":\"v\"}]", stringWriter.toString());
  }
}
