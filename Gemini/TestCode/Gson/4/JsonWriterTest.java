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
  public void testTopLevelObject_empty() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.endObject();
    writer.close();
    Assert.assertEquals("{}", out.toString());
  }

  @Test
  public void testTopLevelArray_empty() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.endArray();
    writer.close();
    Assert.assertEquals("[]", out.toString());
  }

  @Test
  public void testSetIndent_emptyString_disablesIndentation() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setIndent("  ");
    writer.setIndent("");
    writer.beginArray();
    writer.value("a");
    writer.value("b");
    writer.endArray();
    writer.close();
    Assert.assertEquals("[\"a\",\"b\"]", out.toString());
  }

  @Test
  public void testSetIndent_withIndentation() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setIndent("  ");
    writer.beginObject();
    writer.name("a").value("b");
    writer.name("c").value(123);
    writer.endObject();
    writer.close();
    Assert.assertEquals("{\n  \"a\": \"b\",\n  \"c\": 123\n}", out.toString());
  }

  @Test
  public void testSetIndent_nestedArraysAndObjects() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setIndent("\t");
    writer.beginArray();
    writer.beginObject();
    writer.name("key").value(true);
    writer.endObject();
    writer.endArray();
    writer.close();
    Assert.assertEquals("[\n\t{\n\t\t\"key\": true\n\t}\n]", out.toString());
  }

  @Test
  public void testLenient_getterAndSetter() {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    Assert.assertFalse(writer.isLenient());
    writer.setLenient(true);
    Assert.assertTrue(writer.isLenient());
    writer.setLenient(false);
    Assert.assertFalse(writer.isLenient());
  }

  @Test
  public void testHtmlSafe_getterAndSetter() {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    Assert.assertFalse(writer.isHtmlSafe());
    writer.setHtmlSafe(true);
    Assert.assertTrue(writer.isHtmlSafe());
    writer.setHtmlSafe(false);
    Assert.assertFalse(writer.isHtmlSafe());
  }

  @Test
  public void testSerializeNulls_getterAndSetter() {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    Assert.assertTrue(writer.getSerializeNulls());
    writer.setSerializeNulls(false);
    Assert.assertFalse(writer.getSerializeNulls());
    writer.setSerializeNulls(true);
    Assert.assertTrue(writer.getSerializeNulls());
  }

  @Test
  public void testLenient_topLevelValues() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setLenient(true);
    writer.value("top-level");
    writer.value(123);
    writer.value(false);
    writer.nullValue();
    writer.close();
    Assert.assertEquals("\"top-level\"123falsenull", out.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testNonLenient_topLevelLiteral_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.value("string");
  }

  @Test(expected = IllegalStateException.class)
  public void testNonLenient_multipleTopLevelValues_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray().endArray();
    writer.beginArray().endArray();
  }

  @Test(expected = NullPointerException.class)
  public void testName_null_throwsNullPointerException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.name(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testName_duplicateCallsWithoutValue_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.name("name1");
    writer.name("name2");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_whenClosed_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject().endObject();
    writer.close();
    writer.name("name");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_outsideObject_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.name("name");
    writer.value("val");
  }

  @Test
  public void testValues_primitivesAndStrings() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value("hello");
    writer.value("");
    writer.value(true);
    writer.value(false);
    writer.value(0L);
    writer.value(-123456789012345L);
    writer.value(123456789012345L);
    writer.value(0.0);
    writer.value(-12.5);
    writer.value(12.5);
    writer.value((String) null);
    writer.nullValue();
    writer.endArray();
    writer.close();
    Assert.assertEquals(
        "[\"hello\",\"\",true,false,0,-123456789012345,123456789012345,0.0,-12.5,12.5,null,null]",
        out.toString()
    );
  }

  @Test
  public void testValue_numberSubclasses() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(new BigInteger("123456789012345678901234567890"));
    writer.value(new BigDecimal("12345.67890"));
    writer.value((Number) null);
    writer.value(Byte.valueOf((byte) 10));
    writer.value(Short.valueOf((short) -20));
    writer.value(Integer.valueOf(300));
    writer.value(Float.valueOf(1.5f));
    writer.endArray();
    writer.close();
    Assert.assertEquals(
        "[123456789012345678901234567890,12345.67890,null,10,-20,300,1.5]",
        out.toString()
    );
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doubleNaN_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doublePositiveInfinity_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_doubleNegativeInfinity_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(Double.NEGATIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberNaN_nonLenient_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(Double.valueOf(Double.NaN));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberPositiveInfinity_nonLenient_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValue_numberNegativeInfinity_nonLenient_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(Double.valueOf(Double.NEGATIVE_INFINITY));
  }

  @Test
  public void testValue_numberNaNAndInfinities_lenient() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setLenient(true);
    writer.beginArray();
    writer.value(Double.valueOf(Double.NaN));
    writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
    writer.value(Double.valueOf(Double.NEGATIVE_INFINITY));
    writer.endArray();
    writer.close();
    Assert.assertEquals("[NaN,Infinity,-Infinity]", out.toString());
  }

  @Test
  public void testJsonValue_validJson() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.name("raw");
    writer.jsonValue("{\"nested\":[1,2,3]}");
    writer.name("nullRaw");
    writer.jsonValue(null);
    writer.endObject();
    writer.close();
    Assert.assertEquals("{\"raw\":{\"nested\":[1,2,3]},\"nullRaw\":null}", out.toString());
  }

  @Test
  public void testSerializeNulls_trueAndFalse() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setSerializeNulls(false);
    writer.beginObject();
    writer.name("skipMe").nullValue();
    writer.name("skipMeToo").value((String) null);
    writer.name("keepMe").value("val");
    writer.endObject();
    writer.close();
    Assert.assertEquals("{\"keepMe\":\"val\"}", out.toString());
  }

  @Test
  public void testStringEscaping_standard() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value("\"quotes\"");
    writer.value("slash\\slash");
    writer.value("tab\t");
    writer.value("backspace\b");
    writer.value("newline\n");
    writer.value("carriageReturn\r");
    writer.value("formfeed\f");
    writer.value("control\u0000\u001f\u0007");
    writer.value("paragraphSeparator\u2028lineSeparator\u2029");
    writer.value("normalText");
    writer.value("unicode\u00A0\u1234");
    writer.endArray();
    writer.close();

    String expected = "[\"\\\"quotes\\\"\","
        + "\"slash\\\\slash\","
        + "\"tab\\t\","
        + "\"backspace\\b\","
        + "\"newline\\n\","
        + "\"carriageReturn\\r\","
        + "\"formfeed\\f\","
        + "\"control\\u0000\\u001f\\u0007\","
        + "\"paragraphSeparator\\u2028lineSeparator\\u2029\","
        + "\"normalText\","
        + "\"unicode\u00A0\u1234\"]";
    Assert.assertEquals(expected, out.toString());
  }

  @Test
  public void testStringEscaping_htmlSafe() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.setHtmlSafe(true);
    writer.beginArray();
    writer.value("<a>");
    writer.value("foo & bar");
    writer.value("a = b");
    writer.value("'single'");
    writer.endArray();
    writer.close();

    String expected = "[\"\\u003ca\\u003e\",\"foo \\u0026 bar\",\"a \\u003d b\",\"\\u0027single\\u0027\"]";
    Assert.assertEquals(expected, out.toString());
  }

  @Test
  public void testStackGrowth_deepNesting() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    for (int i = 0; i < 40; i++) {
      writer.beginArray();
    }
    writer.value(1);
    for (int i = 0; i < 40; i++) {
      writer.endArray();
    }
    writer.close();

    StringBuilder expected = new StringBuilder();
    for (int i = 0; i < 40; i++) {
      expected.append("[");
    }
    expected.append("1");
    for (int i = 0; i < 40; i++) {
      expected.append("]");
    }
    Assert.assertEquals(expected.toString(), out.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_mismatch_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_mismatch_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_withDanglingName_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.name("dangling");
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_atRoot_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_atRoot_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.endArray();
  }

  @Test(expected = IOException.class)
  public void testClose_emptyDocument_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.close();
  }

  @Test(expected = IOException.class)
  public void testClose_unclosedArray_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.close();
  }

  @Test(expected = IOException.class)
  public void testClose_unclosedObject_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.close();
  }

  @Test
  public void testFlush_andClose() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray();
    writer.value(10);
    writer.endArray();
    writer.flush();
    Assert.assertEquals("[10]", out.toString());
    writer.close();
  }

  @Test(expected = IllegalStateException.class)
  public void testFlush_whenClosed_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray().endArray();
    writer.close();
    writer.flush();
  }

  @Test(expected = IllegalStateException.class)
  public void testValue_whenClosed_throwsException() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginArray().endArray();
    writer.close();
    writer.value("closed");
  }

  @Test
  public void testObjectWithMultipleProperties() throws IOException {
    StringWriter out = new StringWriter();
    JsonWriter writer = new JsonWriter(out);
    writer.beginObject();
    writer.name("k1").value("v1");
    writer.name("k2").value(2);
    writer.name("k3").value(false);
    writer.name("k4").value((String) null);
    writer.endObject();
    writer.close();
    Assert.assertEquals("{\"k1\":\"v1\",\"k2\":2,\"k3\":false,\"k4\":null}", out.toString());
  }

  @Test
  public void testCustomWriter_propagatesClose() throws IOException {
    final boolean[] closed = new boolean[1];
    Writer customWriter = new Writer() {
      @Override
      public void write(char[] cbuf, int off, int len) {
      }

      @Override
      public void flush() {
      }

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
}
