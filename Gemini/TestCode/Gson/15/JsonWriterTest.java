package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonWriterTest {

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullWriter_throwsNullPointerException() {
    new JsonWriter(null);
  }

  @Test
  public void testSetIndent_emptyString_disablesPrettyPrinting() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setIndent("  ");
    writer.setIndent("");
    writer.beginObject().name("key").value("value").endObject();
    Assert.assertEquals("{\"key\":\"value\"}", stringWriter.toString());
  }

  @Test
  public void testSetIndent_nonEmptyString_enablesPrettyPrinting() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setIndent("  ");
    writer.beginArray();
    writer.value(1);
    writer.value(2);
    writer.endArray();
    String expected = "[\n  1,\n  2\n]";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void testSetLenient_getterAndSetter() {
    JsonWriter writer = new JsonWriter(new StringWriter());
    Assert.assertFalse(writer.isLenient());
    writer.setLenient(true);
    Assert.assertTrue(writer.isLenient());
    writer.setLenient(false);
    Assert.assertFalse(writer.isLenient());
  }

  @Test
  public void testSetHtmlSafe_getterAndSetter() {
    JsonWriter writer = new JsonWriter(new StringWriter());
    Assert.assertFalse(writer.isHtmlSafe());
    writer.setHtmlSafe(true);
    Assert.assertTrue(writer.isHtmlSafe());
    writer.setHtmlSafe(false);
    Assert.assertFalse(writer.isHtmlSafe());
  }

  @Test
  public void testSetSerializeNulls_getterAndSetter() {
    JsonWriter writer = new JsonWriter(new StringWriter());
    Assert.assertTrue(writer.getSerializeNulls());
    writer.setSerializeNulls(false);
    Assert.assertFalse(writer.getSerializeNulls());
    writer.setSerializeNulls(true);
    Assert.assertTrue(writer.getSerializeNulls());
  }

  @Test
  public void testSerializeNulls_true_writesNullField() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setSerializeNulls(true);
    writer.beginObject();
    writer.name("field").nullValue();
    writer.endObject();
    Assert.assertEquals("{\"field\":null}", stringWriter.toString());
  }

  @Test
  public void testSerializeNulls_false_skipsNullField() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setSerializeNulls(false);
    writer.beginObject();
    writer.name("field1").nullValue();
    writer.name("field2").value("value2");
    writer.name("field3").value((String) null);
    writer.endObject();
    Assert.assertEquals("{\"field2\":\"value2\"}", stringWriter.toString());
  }

  @Test
  public void testBeginEndArray_emptyArray() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.endArray();
    Assert.assertEquals("[]", stringWriter.toString());
  }

  @Test
  public void testBeginEndObject_emptyObject() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginObject();
    writer.endObject();
    Assert.assertEquals("{}", stringWriter.toString());
  }

  @Test
  public void testObjectMultipleProperties() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginObject();
    writer.name("a").value(1);
    writer.name("b").value("test");
    writer.name("c").value(true);
    writer.endObject();
    Assert.assertEquals("{\"a\":1,\"b\":\"test\",\"c\":true}", stringWriter.toString());
  }

  @Test
  public void testArrayMultipleValues() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.value("first");
    writer.value("second");
    writer.value(3);
    writer.endArray();
    Assert.assertEquals("[\"first\",\"second\",3]", stringWriter.toString());
  }

  @Test(expected = NullPointerException.class)
  public void testName_null_throwsNullPointerException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    writer.name(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testName_duplicateNameCall_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    writer.name("a");
    writer.name("b");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_outsideObject_throwsIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.name("name");
    writer.value("value");
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_mismatchedScope_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_mismatchedScope_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_withDanglingName_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginObject();
    writer.name("dangling");
    writer.endObject();
  }

  @Test
  public void testValue_booleanPrimitive() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.value(true);
    writer.value(false);
    writer.endArray();
    Assert.assertEquals("[true,false]", stringWriter.toString());
  }

  @Test
  public void testValue_booleanObject() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.value(Boolean.TRUE);
    writer.value(Boolean.FALSE);
    writer.value((Boolean) null);
    writer.endArray();
    Assert.assertEquals("[true,false,null]", stringWriter.toString());
  }

  @Test
  public void testValue_long() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.value(0L);
    writer.value(-100L);
    writer.value(Long.MAX_VALUE);
    writer.value(Long.MIN_VALUE);
    writer.endArray();
    Assert.assertEquals("[0,-100,9223372036854775807,-9223372036854775808]", stringWriter.toString());
  }

  @Test
  public void testValue_double() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.value(0.0);
    writer.value(-12.34);
    writer.value(1.0E10);
    writer.endArray();
    Assert.assertEquals("[0.0,-12.34,1.0E10]", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doubleNaN_strict_throwsIllegalArgumentException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doublePositiveInfinity_strict_throwsIllegalArgumentException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doubleNegativeInfinity_strict_throwsIllegalArgumentException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value(Double.NEGATIVE_INFINITY);
  }

  @Test
  public void testValue_number() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.value(new BigDecimal("12345.6789"));
    writer.value(new BigInteger("9999999999999999999999999999"));
    writer.value((Number) null);
    writer.endArray();
    Assert.assertEquals("[12345.6789,9999999999999999999999999999,null]", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberNaN_strict_throwsIllegalArgumentException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value((Number) Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberInfinity_strict_throwsIllegalArgumentException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value((Number) Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberNegativeInfinity_strict_throwsIllegalArgumentException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value((Number) Double.NEGATIVE_INFINITY);
  }

  @Test
  public void testValue_numberLenientNonFinite() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setLenient(true);
    writer.beginArray();
    writer.value((Number) Double.NaN);
    writer.value((Number) Double.POSITIVE_INFINITY);
    writer.value((Number) Double.NEGATIVE_INFINITY);
    writer.endArray();
    Assert.assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
  }

  @Test
  public void testJsonValue_validStringAndNull() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.beginArray();
    writer.jsonValue("{\"raw\":true}");
    writer.jsonValue(null);
    writer.endArray();
    Assert.assertEquals("[{\"raw\":true},null]", stringWriter.toString());
  }

  @Test
  public void testStringEscapes_standardEscapes() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    String input = "\"\\\t\b\n\r\f\u0000\u001f\u2028\u2029hello \u00e9 world";
    writer.value(input);
    String expected = "\"\\\"\\\\\\t\\b\\n\\r\\f\\u0000\\u001f\\u2028\\u2029hello \u00e9 world\"";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void testStringEscapes_htmlSafe() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setHtmlSafe(true);
    writer.value("<tag attr='val'> & =</tag>");
    String expected = "\"\\u003ctag attr=\\u0027val\\u0027\\u003e \\u0026 \\u003d\\u003c/tag\\u003e\"";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void testStackResize_deepNesting() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    int depth = 40;
    for (int i = 0; i < depth; i++) {
      writer.beginArray();
    }
    writer.value("deep");
    for (int i = 0; i < depth; i++) {
      writer.endArray();
    }

    StringBuilder expected = new StringBuilder();
    for (int i = 0; i < depth; i++) {
      expected.append("[");
    }
    expected.append("\"deep\"");
    for (int i = 0; i < depth; i++) {
      expected.append("]");
    }
    Assert.assertEquals(expected.toString(), stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testMultipleTopLevelValues_strict_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value("first");
    writer.value("second");
  }

  @Test
  public void testMultipleTopLevelValues_lenient() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setLenient(true);
    writer.value("first");
    writer.value("second");
    Assert.assertEquals("\"first\"\"second\"", stringWriter.toString());
  }

  @Test
  public void testFlush() throws IOException {
    final boolean[] flushed = new boolean[1];
    Writer customWriter = new Writer() {
      @Override
      public void write(char[] cbuf, int off, int len) {}

      @Override
      public void flush() {
        flushed[0] = true;
      }

      @Override
      public void close() {}
    };

    JsonWriter writer = new JsonWriter(customWriter);
    writer.value("test");
    writer.flush();
    Assert.assertTrue(flushed[0]);
  }

  @Test
  public void testClose_completeDocument() throws IOException {
    final boolean[] closed = new boolean[1];
    Writer customWriter = new Writer() {
      @Override
      public void write(char[] cbuf, int off, int len) {}

      @Override
      public void flush() {}

      @Override
      public void close() {
        closed[0] = true;
      }
    };

    JsonWriter writer = new JsonWriter(customWriter);
    writer.beginArray().endArray();
    writer.close();
    Assert.assertTrue(closed[0]);
  }

  @Test(expected = IOException.class)
  public void testClose_emptyDocument_throwsIOException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.close();
  }

  @Test(expected = IOException.class)
  public void testClose_unclosedArray_throwsIOException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray();
    writer.close();
  }

  @Test(expected = IllegalStateException.class)
  public void testFlush_afterClose_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value(1);
    writer.close();
    writer.flush();
  }

  @Test(expected = IllegalStateException.class)
  public void testName_afterClose_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value(1);
    writer.close();
    writer.name("name");
  }

  @Test(expected = IllegalStateException.class)
  public void testValue_afterClose_throwsIllegalStateException() throws IOException {
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.value(1);
    writer.close();
    writer.value(2);
  }
}
