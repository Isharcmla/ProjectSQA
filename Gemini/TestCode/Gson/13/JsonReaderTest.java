package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import org.junit.Assert;
import org.junit.Test;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class JsonReaderTest {

  private JsonReader reader(String json) {
    return new JsonReader(new StringReader(json));
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullReader_throwsNullPointerException() {
    new JsonReader(null);
  }

  @Test
  public void testSetLenient_and_isLenient() {
    JsonReader reader = reader("{}");
    assertFalse(reader.isLenient());
    reader.setLenient(true);
    assertTrue(reader.isLenient());
    reader.setLenient(false);
    assertFalse(reader.isLenient());
  }

  @Test
  public void testEmptyArray() throws IOException {
    JsonReader reader = reader("[]");
    reader.beginArray();
    assertFalse(reader.hasNext());
    reader.endArray();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testEmptyObject() throws IOException {
    JsonReader reader = reader("{}");
    reader.beginObject();
    assertFalse(reader.hasNext());
    reader.endObject();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testArrayWithElements() throws IOException {
    JsonReader reader = reader("[1, 2, 3]");
    reader.beginArray();
    assertTrue(reader.hasNext());
    assertEquals(1, reader.nextInt());
    assertTrue(reader.hasNext());
    assertEquals(2L, reader.nextLong());
    assertTrue(reader.hasNext());
    assertEquals(3.0, reader.nextDouble(), 0.0);
    assertFalse(reader.hasNext());
    reader.endArray();
  }

  @Test
  public void testObjectWithElements() throws IOException {
    JsonReader reader = reader("{\"a\": 1, \"b\": true, \"c\": null, \"d\": \"str\"}");
    reader.beginObject();
    assertTrue(reader.hasNext());
    assertEquals("a", reader.nextName());
    assertEquals(1, reader.nextInt());

    assertTrue(reader.hasNext());
    assertEquals("b", reader.nextName());
    assertTrue(reader.nextBoolean());

    assertTrue(reader.hasNext());
    assertEquals("c", reader.nextName());
    reader.nextNull();

    assertTrue(reader.hasNext());
    assertEquals("d", reader.nextName());
    assertEquals("str", reader.nextString());

    assertFalse(reader.hasNext());
    reader.endObject();
  }

  @Test
  public void testBooleans() throws IOException {
    JsonReader reader = reader("[true, false, TRUE, FALSE]");
    reader.setLenient(true);
    reader.beginArray();
    assertTrue(reader.nextBoolean());
    assertFalse(reader.nextBoolean());
    assertTrue(reader.nextBoolean());
    assertFalse(reader.nextBoolean());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextBoolean_notBoolean_throwsException() throws IOException {
    JsonReader reader = reader("\"true\"");
    reader.nextBoolean();
  }

  @Test
  public void testNulls() throws IOException {
    JsonReader reader = reader("[null, NULL]");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();
    assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextNull_notNull_throwsException() throws IOException {
    JsonReader reader = reader("123");
    reader.nextNull();
  }

  @Test
  public void testNumbers_variousFormats() throws IOException {
    String json = "[0, -0, 1, -1, 123456789012345, -9223372036854775808, 0.0, -0.5, 1e2, 1e-2, 1E+2, 1.25e3]";
    JsonReader reader = reader(json);
    reader.beginArray();
    assertEquals(0, reader.nextInt());
    assertEquals(0, reader.nextInt());
    assertEquals(1, reader.nextLong());
    assertEquals(-1, reader.nextLong());
    assertEquals(123456789012345L, reader.nextLong());
    assertEquals(Long.MIN_VALUE, reader.nextLong());
    assertEquals(0.0, reader.nextDouble(), 0.0);
    assertEquals(-0.5, reader.nextDouble(), 0.0);
    assertEquals(100.0, reader.nextDouble(), 0.0);
    assertEquals(0.01, reader.nextDouble(), 0.0001);
    assertEquals(100.0, reader.nextDouble(), 0.0);
    assertEquals(1250.0, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test
  public void testNumbers_stringConversion() throws IOException {
    JsonReader reader = reader("[\"123\", \"123.45\", '456']");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(123, reader.nextInt());
    assertEquals(123.45, reader.nextDouble(), 0.0);
    assertEquals(456L, reader.nextLong());
    reader.endArray();
  }

  @Test
  public void testNumbers_doubleParsedFromLong() throws IOException {
    JsonReader reader = reader("[100]");
    reader.beginArray();
    assertEquals(100.0, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test
  public void testNumbers_longLossOfPrecision_throwsException() throws IOException {
    JsonReader reader = reader("[\"123.45\"]");
    reader.beginArray();
    try {
      reader.nextLong();
      fail();
    } catch (NumberFormatException expected) {
    }
  }

  @Test
  public void testNumbers_intLossOfPrecision_throwsException() throws IOException {
    JsonReader reader = reader("[9223372036854775807, \"123.45\"]");
    reader.beginArray();
    try {
      reader.nextInt();
      fail();
    } catch (NumberFormatException expected) {
    }
    try {
      reader.nextInt();
      fail();
    } catch (NumberFormatException expected) {
    }
  }

  @Test
  public void testStrings_escapes() throws IOException {
    String json = "[\"\\\"\", \"\\\\\", \"\\/\", \"\\b\", \"\\f\", \"\\n\", \"\\r\", \"\\t\", \"\\u0041\", \"\\u000a\", \"\\u000A\"]";
    JsonReader reader = reader(json);
    reader.beginArray();
    assertEquals("\"", reader.nextString());
    assertEquals("\\", reader.nextString());
    assertEquals("/", reader.nextString());
    assertEquals("\b", reader.nextString());
    assertEquals("\f", reader.nextString());
    assertEquals("\n", reader.nextString());
    assertEquals("\r", reader.nextString());
    assertEquals("\t", reader.nextString());
    assertEquals("A", reader.nextString());
    assertEquals("\n", reader.nextString());
    assertEquals("\n", reader.nextString());
    reader.endArray();
  }

  @Test
  public void testStrings_singleQuoted_lenient() throws IOException {
    JsonReader reader = reader("['hello', 'world']");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals("hello", reader.nextString());
    assertEquals("world", reader.nextString());
    reader.endArray();
  }

  @Test
  public void testStrings_unquoted_lenient() throws IOException {
    JsonReader reader = reader("[hello, world]");
    reader.setLenient(true);
    reader.beginArray();
    assertEquals("hello", reader.nextString());
    assertEquals("world", reader.nextString());
    reader.endArray();
  }

  @Test
  public void testSkipValue_literalsAndStructures() throws IOException {
    JsonReader reader = reader("[1, \"skip\", true, false, null, [1, 2], {\"a\": 1}, 'single', unquoted]");
    reader.setLenient(true);
    reader.beginArray();
    reader.skipValue(); // 1
    reader.skipValue(); // "skip"
    reader.skipValue(); // true
    reader.skipValue(); // false
    reader.skipValue(); // null
    reader.skipValue(); // [1, 2]
    reader.skipValue(); // {"a": 1}
    reader.skipValue(); // 'single'
    reader.skipValue(); // unquoted
    reader.endArray();
  }

  @Test
  public void testSkipValue_objectKeysAndValues() throws IOException {
    JsonReader reader = reader("{\"a\": [1, 2], \"b\": {\"c\": 3}}");
    reader.beginObject();
    reader.skipValue(); // a
    reader.skipValue(); // [1, 2]
    reader.skipValue(); // b
    reader.skipValue(); // {"c": 3}
    reader.endObject();
  }

  @Test
  public void testGetPath() throws IOException {
    JsonReader reader = reader("{\"a\": [1, {\"b\": 2}], \"c\": 3}");
    assertEquals("$", reader.getPath());
    reader.beginObject();
    assertEquals("$.", reader.getPath());
    assertEquals("a", reader.nextName());
    assertEquals("$.a", reader.getPath());
    reader.beginArray();
    assertEquals("$.a[0]", reader.getPath());
    assertEquals(1, reader.nextInt());
    assertEquals("$.a[1]", reader.getPath());
    reader.beginObject();
    assertEquals("$.a[1].", reader.getPath());
    assertEquals("b", reader.nextName());
    assertEquals("$.a[1].b", reader.getPath());
    assertEquals(2, reader.nextInt());
    reader.endObject();
    reader.endArray();
    assertEquals("$.a", reader.getPath());
    assertEquals("c", reader.nextName());
    assertEquals("$.c", reader.getPath());
    assertEquals(3, reader.nextInt());
    reader.endObject();
    assertEquals("$", reader.getPath());
  }

  @Test
  public void testComments_lenient() throws IOException {
    String json = "// comment 1\n"
        + "# comment 2\r"
        + "/* multi\nline\ncomment */\n"
        + "{\"a\" /* name comment */ : // colon comment\n"
        + " 123 /* value comment */ }";
    JsonReader reader = reader(json);
    reader.setLenient(true);
    reader.beginObject();
    assertEquals("a", reader.nextName());
    assertEquals(123, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void testNonExecutePrefix_lenient() throws IOException {
    String json = ")]}'\n{\"key\": \"value\"}";
    JsonReader reader = reader(json);
    reader.setLenient(true);
    reader.beginObject();
    assertEquals("key", reader.nextName());
    assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testLenientNameSeparators() throws IOException {
    String json = "{a = 1, b => 2; c: 3}";
    JsonReader reader = reader(json);
    reader.setLenient(true);
    reader.beginObject();
    assertEquals("a", reader.nextName());
    assertEquals(1, reader.nextInt());
    assertEquals("b", reader.nextName());
    assertEquals(2, reader.nextInt());
    assertEquals("c", reader.nextName());
    assertEquals(3, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void testLenientArraySeparators() throws IOException {
    String json = "[1; 2, 3;]";
    JsonReader reader = reader(json);
    reader.setLenient(true);
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    assertEquals(2, reader.nextInt());
    assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testLenientEmptyArrayValues() throws IOException {
    String json = "[,]";
    JsonReader reader = reader(json);
    reader.setLenient(true);
    reader.beginArray();
    reader.nextNull();
    reader.endArray();
  }

  @Test
  public void testLenientTopLevelValues() throws IOException {
    JsonReader reader = reader("123 \"abc\"");
    reader.setLenient(true);
    assertEquals(123, reader.nextInt());
    assertEquals("abc", reader.nextString());
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testLenientSpecialDoubles() throws IOException {
    JsonReader reader = reader("[NaN, -Infinity, Infinity]");
    reader.setLenient(true);
    reader.beginArray();
    assertTrue(Double.isNaN(reader.nextDouble()));
    assertEquals(Double.NEGATIVE_INFINITY, reader.nextDouble(), 0.0);
    assertEquals(Double.POSITIVE_INFINITY, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testStrictSpecialDoubles_throwsException() throws IOException {
    JsonReader reader = reader("[NaN]");
    reader.setLenient(true);
    reader.beginArray();
    reader.setLenient(false);
    reader.nextDouble();
  }

  @Test
  public void testBomAtStartOfDocument() throws IOException {
    JsonReader reader = reader("\ufeff[1]");
    reader.beginArray();
    assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testBufferFillingLargeLiteral() throws IOException {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < 2000; i++) {
      sb.append("a");
    }
    sb.append("]");
    JsonReader reader = reader(sb.toString());
    reader.setLenient(true);
    reader.beginArray();
    String str = reader.nextString();
    assertEquals(2000, str.length());
    reader.endArray();
  }

  @Test
  public void testBufferFillingLargeQuotedString() throws IOException {
    StringBuilder sb = new StringBuilder("[\"");
    for (int i = 0; i < 2000; i++) {
      sb.append("a");
    }
    sb.append("\"]");
    JsonReader reader = reader(sb.toString());
    reader.beginArray();
    String str = reader.nextString();
    assertEquals(2000, str.length());
    reader.endArray();
  }

  @Test
  public void testStackGrowth() throws IOException {
    StringBuilder sb = new StringBuilder();
    int depth = 40;
    for (int i = 0; i < depth; i++) {
      sb.append("[");
    }
    for (int i = 0; i < depth; i++) {
      sb.append("]");
    }
    JsonReader reader = reader(sb.toString());
    for (int i = 0; i < depth; i++) {
      reader.beginArray();
    }
    for (int i = 0; i < depth; i++) {
      reader.endArray();
    }
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testClose() throws IOException {
    JsonReader reader = reader("[1, 2]");
    reader.close();
    try {
      reader.peek();
      fail();
    } catch (IllegalStateException expected) {
    }
  }

  @Test
  public void testToString() {
    JsonReader reader = reader("[1, 2]");
    assertTrue(reader.toString().startsWith("JsonReader at line 1 column 1 path $"));
  }

  @Test
  public void testPromoteNameToValue() throws IOException {
    JsonReader reader = reader("{\"name\": \"value\"}");
    reader.beginObject();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    assertEquals("name", reader.nextString());
    assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testPromoteNameToValue_invalidToken_throwsException() throws IOException {
    JsonReader reader = reader("[1]");
    reader.beginArray();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
  }

  @Test(expected = MalformedJsonException.class)
  public void testMalformedJson_strictUnquotedString_throwsException() throws IOException {
    JsonReader reader = reader("[unquoted]");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void testMalformedJson_unterminatedArray_throwsException() throws IOException {
    JsonReader reader = reader("[1, 2");
    reader.beginArray();
    reader.nextInt();
    reader.nextInt();
    reader.hasNext();
  }

  @Test(expected = MalformedJsonException.class)
  public void testMalformedJson_unterminatedObject_throwsException() throws IOException {
    JsonReader reader = reader("{\"a\": 1");
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    reader.hasNext();
  }

  @Test(expected = MalformedJsonException.class)
  public void testMalformedJson_unterminatedComment_throwsException() throws IOException {
    JsonReader reader = reader("/* comment");
    reader.setLenient(true);
    reader.peek();
  }

  @Test(expected = MalformedJsonException.class)
  public void testMalformedJson_invalidEscape_throwsException() throws IOException {
    JsonReader reader = reader("[\"\\q\"]");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = NumberFormatException.class)
  public void testMalformedJson_invalidUnicodeEscape_throwsException() throws IOException {
    JsonReader reader = reader("[\"\\u12G4\"]");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = EOFException.class)
  public void testEmptyDocument_peek_throwsEOFException() throws IOException {
    JsonReader reader = reader("");
    reader.peek();
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginArray_wrongToken_throwsException() throws IOException {
    JsonReader reader = reader("{}");
    reader.beginArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_wrongToken_throwsException() throws IOException {
    JsonReader reader = reader("{}");
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginObject_wrongToken_throwsException() throws IOException {
    JsonReader reader = reader("[]");
    reader.beginObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_wrongToken_throwsException() throws IOException {
    JsonReader reader = reader("[]");
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextName_wrongToken_throwsException() throws IOException {
    JsonReader reader = reader("[1]");
    reader.beginArray();
    reader.nextName();
  }
}
