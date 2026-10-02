package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonWriterTest {

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullWriter_throwsNullPointerException() {
    new JsonWriter(null);
  }

  @Test
  public void testSetIndent_emptyAndNonEmpty() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.setIndent("  ");
    jsonWriter.beginObject();
    jsonWriter.name("a").value(1);
    jsonWriter.endObject();
    Assert.assertEquals("{\n  \"a\": 1\n}", stringWriter.toString());

    stringWriter = new StringWriter();
    jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setIndent("");
    jsonWriter.beginObject();
    jsonWriter.name("a").value(1);
    jsonWriter.endObject();
    Assert.assertEquals("{\"a\":1}", stringWriter.toString());
  }

  @Test
  public void testLenient_getterAndSetter() {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    Assert.assertFalse(jsonWriter.isLenient());

    jsonWriter.setLenient(true);
    Assert.assertTrue(jsonWriter.isLenient());

    jsonWriter.setLenient(false);
    Assert.assertFalse(jsonWriter.isLenient());
  }

  @Test
  public void testHtmlSafe_getterAndSetter() {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    Assert.assertFalse(jsonWriter.isHtmlSafe());

    jsonWriter.setHtmlSafe(true);
    Assert.assertTrue(jsonWriter.isHtmlSafe());

    jsonWriter.setHtmlSafe(false);
    Assert.assertFalse(jsonWriter.isHtmlSafe());
  }

  @Test
  public void testSerializeNulls_getterAndSetter() {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    Assert.assertTrue(jsonWriter.getSerializeNulls());

    jsonWriter.setSerializeNulls(false);
    Assert.assertFalse(jsonWriter.getSerializeNulls());

    jsonWriter.setSerializeNulls(true);
    Assert.assertTrue(jsonWriter.getSerializeNulls());
  }

  @Test
  public void testEmptyArray() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray().endArray();
    Assert.assertEquals("[]", stringWriter.toString());
  }

  @Test
  public void testNonEmptyArray() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.value("apple");
    jsonWriter.value("banana");
    jsonWriter.value(123L);
    jsonWriter.endArray();
    Assert.assertEquals("[\"apple\",\"banana\",123]", stringWriter.toString());
  }

  @Test
  public void testEmptyObject() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject().endObject();
    Assert.assertEquals("{}", stringWriter.toString());
  }

  @Test
  public void testNonEmptyObject() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("key1").value("value1");
    jsonWriter.name("key2").value(true);
    jsonWriter.name("key3").value(false);
    jsonWriter.endObject();
    Assert.assertEquals("{\"key1\":\"value1\",\"key2\":true,\"key3\":false}", stringWriter.toString());
  }

  @Test
  public void testDeepNesting_stackResizing() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    int depth = 40; // Exceeds initial stack size 32
    for (int i = 0; i < depth; i++) {
      jsonWriter.beginArray();
    }
    jsonWriter.value("deep");
    for (int i = 0; i < depth; i++) {
      jsonWriter.endArray();
    }
    StringBuilder expected = new StringBuilder();
    for (int i = 0; i < depth; i++) expected.append("[");
    expected.append("\"deep\"");
    for (int i = 0; i < depth; i++) expected.append("]");
    Assert.assertEquals(expected.toString(), stringWriter.toString());
  }

  @Test(expected = NullPointerException.class)
  public void testName_null_throwsNullPointerException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testName_duplicateWithoutValue_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("a");
    jsonWriter.name("b");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_outsideObject_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.name("a").value("b");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_whenClosed_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray().endArray();
    jsonWriter.close();
    jsonWriter.name("a");
  }

  @Test
  public void testValue_string() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.value((String) null);
    jsonWriter.value("normal");
    jsonWriter.value("");
    jsonWriter.endArray();
    Assert.assertEquals("[null,\"normal\",\"\"]", stringWriter.toString());
  }

  @Test
  public void testValue_stringEscaping() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value("\" \\ \t \b \n \r \f \u0000 \u001f \u2028 \u2029 abc");
    Assert.assertEquals("\"\\\" \\\\ \\t \\b \\n \\r \\f \\u0000 \\u001f \\u2028 \\u2029 abc\"", stringWriter.toString());
  }

  @Test
  public void testValue_htmlSafeEscaping() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setHtmlSafe(true);
    jsonWriter.value("< > & = '");
    Assert.assertEquals("\"\\u003c \\u003e \\u0026 \\u003d \\u0027\"", stringWriter.toString());
  }

  @Test
  public void testJsonValue() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.jsonValue("{\"raw\":123}");
    jsonWriter.jsonValue(null);
    jsonWriter.endArray();
    Assert.assertEquals("[{\"raw\":123},null]", stringWriter.toString());
  }

  @Test
  public void testNullValue_serializeNullsTrue() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(true);
    jsonWriter.beginObject();
    jsonWriter.name("key").nullValue();
    jsonWriter.endObject();
    Assert.assertEquals("{\"key\":null}", stringWriter.toString());
  }

  @Test
  public void testNullValue_serializeNullsFalse() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(false);
    jsonWriter.beginObject();
    jsonWriter.name("key").nullValue();
    jsonWriter.name("key2").value("value2");
    jsonWriter.endObject();
    Assert.assertEquals("{\"key2\":\"value2\"}", stringWriter.toString());
  }

  @Test
  public void testValue_double() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.value(-0.0);
    jsonWriter.value(1.5);
    jsonWriter.value(0.0);
    jsonWriter.endArray();
    Assert.assertEquals("[-0.0,1.5,0.0]", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doubleNaN_throwsIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doubleInfinity_throwsIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doubleNegativeInfinity_throwsIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.NEGATIVE_INFINITY);
  }

  @Test
  public void testValue_long() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.value(0L);
    jsonWriter.value(-123456789012345L);
    jsonWriter.value(Long.MAX_VALUE);
    jsonWriter.endArray();
    Assert.assertEquals("[0,-123456789012345,9223372036854775807]", stringWriter.toString());
  }

  @Test
  public void testValue_number() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.value((Number) null);
    jsonWriter.value(new BigInteger("12345678901234567890"));
    jsonWriter.value(new BigDecimal("123.456"));
    jsonWriter.endArray();
    Assert.assertEquals("[null,12345678901234567890,123.456]", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberNaN_strict_throwsIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.valueOf(Double.NaN));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberInfinity_strict_throwsIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberNegativeInfinity_strict_throwsIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
  }

  @Test
  public void testValue_numberLenient_nanAndInfinity() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(true);
    jsonWriter.beginArray();
    jsonWriter.value(Double.valueOf(Double.NaN));
    jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
    jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
    jsonWriter.endArray();
    Assert.assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
  }

  @Test
  public void testFlush_success() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.flush();
    Assert.assertEquals("[", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testFlush_whenClosed_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray().endArray();
    jsonWriter.close();
    jsonWriter.flush();
  }

  @Test
  public void testClose_success() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray().endArray();
    jsonWriter.close();
    Assert.assertEquals("[]", stringWriter.toString());
  }

  @Test(expected = IOException.class)
  public void testClose_emptyDocument_throwsIOException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.close();
  }

  @Test(expected = IOException.class)
  public void testClose_incompleteArray_throwsIOException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.close();
  }

  @Test(expected = IOException.class)
  public void testClose_incompleteObject_throwsIOException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.close();
  }

  @Test(expected = IllegalStateException.class)
  public void testCloseScope_danglingName_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("key");
    jsonWriter.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_mismatchedScope_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_mismatchedScope_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testMultipleTopLevelValues_strict_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value("first");
    jsonWriter.value("second");
  }

  @Test
  public void testMultipleTopLevelValues_lenient() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(true);
    jsonWriter.value("first");
    jsonWriter.value("second");
    Assert.assertEquals("\"first\"\"second\"", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testBeforeValue_invalidContext_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    // Cannot emit value in an object without a name
    jsonWriter.value("unnamed");
  }

  @Test
  public void testNestedPrettyPrinting() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setIndent("\t");
    jsonWriter.beginObject();
    jsonWriter.name("arr");
    jsonWriter.beginArray();
    jsonWriter.value(1);
    jsonWriter.value(2);
    jsonWriter.endArray();
    jsonWriter.name("obj");
    jsonWriter.beginObject();
    jsonWriter.name("k").value("v");
    jsonWriter.endObject();
    jsonWriter.endObject();

    String expected = "{\n"
        + "\t\"arr\": [\n"
        + "\t\t1,\n"
        + "\t\t2\n"
        + "\t],\n"
        + "\t\"obj\": {\n"
        + "\t\t\"k\": \"v\"\n"
        + "\t}\n"
        + "}";
    Assert.assertEquals(expected, stringWriter.toString());
  }
}
