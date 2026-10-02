package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import org.junit.Assert;
import org.junit.Test;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class JsonReaderTest {

  private JsonReader reader(String json) {
    return new JsonReader(new StringReader(json));
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullReader_throwsException() {
    new JsonReader(null);
  }

  @Test
  public void testLenientProperty_setAndGet_success() {
    JsonReader reader = reader("{}");
    Assert.assertFalse(reader.isLenient());
    reader.setLenient(true);
    Assert.assertTrue(reader.isLenient());
    reader.setLenient(false);
    Assert.assertFalse(reader.isLenient());
  }

  @Test
  public void testBeginAndEndArray_emptyArray_success() throws IOException {
    JsonReader reader = reader("[]");
    reader.beginArray();
    Assert.assertFalse(reader.hasNext());
    reader.endArray();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginArray_notAnArray_throwsException() throws IOException {
    JsonReader reader = reader("{}");
    reader.beginArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_notAtEndOfArray_throwsException() throws IOException {
    JsonReader reader = reader("[1]");
    reader.beginArray();
    reader.endArray();
  }

  @Test
  public void testBeginAndEndObject_emptyObject_success() throws IOException {
    JsonReader reader = reader("{}");
    reader.beginObject();
    Assert.assertFalse(reader.hasNext());
    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void testBeginObject_notAnObject_throwsException() throws IOException {
    JsonReader reader = reader("[]");
    reader.beginObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_notAtEndOfObject_throwsException() throws IOException {
    JsonReader reader = reader("{\"a\":1}");
    reader.beginObject();
    reader.endObject();
  }

  @Test
  public void testNextName_doubleQuoted_success() throws IOException {
    JsonReader reader = reader("{\"name\":\"value\"}");
    reader.beginObject();
    Assert.assertEquals("name", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testNextName_singleQuotedLenient_success() throws IOException {
    JsonReader reader = reader("{'name':'value'}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("name", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testNextName_unquotedLenient_success() throws IOException {
    JsonReader reader = reader("{name:123}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("name", reader.nextName());
    Assert.assertEquals(123, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextName_whenTokenIsValue_throwsException() throws IOException {
    JsonReader reader = reader("[\"name\"]");
    reader.beginArray();
    reader.nextName();
  }

  @Test
  public void testNextString_variousFormats_success() throws IOException {
    JsonReader reader = reader("[\"str\", 'single', unquoted, 123, 12.5, true, null]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals("str", reader.nextString());
    Assert.assertEquals("single", reader.nextString());
    Assert.assertEquals("unquoted", reader.nextString());
    Assert.assertEquals("123", reader.nextString());
    Assert.assertEquals("12.5", reader.nextString());
    Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
    Assert.assertTrue(reader.nextBoolean());
    reader.nextNull();
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextString_notAString_throwsException() throws IOException {
    JsonReader reader = reader("[true]");
    reader.beginArray();
    reader.nextString();
  }

  @Test
  public void testNextBoolean_trueAndFalse_success() throws IOException {
    JsonReader reader = reader("[true, false, TRUE, FALSE]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextBoolean_notABoolean_throwsException() throws IOException {
    JsonReader reader = reader("[\"true\"]");
    reader.beginArray();
    reader.nextBoolean();
  }

  @Test
  public void testNextNull_nullLiteral_success() throws IOException {
    JsonReader reader = reader("[null, NULL]");
    reader.setLenient(true);
    reader.beginArray();
    reader.nextNull();
    reader.nextNull();
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextNull_notANull_throwsException() throws IOException {
    JsonReader reader = reader("[0]");
    reader.beginArray();
    reader.nextNull();
  }

  @Test
  public void testNextDouble_variousNumbers_success() throws IOException {
    JsonReader reader = reader("[0.0, -0.0, 123.456, -123.456, 1e5, -1E-5, \"3.1415\", '2.718', unquotedDouble]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0.0, reader.nextDouble(), 0.0);
    Assert.assertEquals(-0.0, reader.nextDouble(), 0.0);
    Assert.assertEquals(123.456, reader.nextDouble(), 0.0001);
    Assert.assertEquals(-123.456, reader.nextDouble(), 0.0001);
    Assert.assertEquals(100000.0, reader.nextDouble(), 0.0001);
    Assert.assertEquals(-0.00001, reader.nextDouble(), 0.000001);
    Assert.assertEquals(3.1415, reader.nextDouble(), 0.0001);
    Assert.assertEquals(2.718, reader.nextDouble(), 0.0001);
    try {
      reader.nextDouble();
      Assert.fail();
    } catch (NumberFormatException expected) {
    }
  }

  @Test
  public void testNextDouble_longNumbers_success() throws IOException {
    JsonReader reader = reader("[123456789]");
    reader.beginArray();
    Assert.assertEquals(123456789.0, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test
  public void testNextDouble_nanAndInfinityLenient_success() throws IOException {
    JsonReader reader = reader("[NaN, Infinity, -Infinity]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertTrue(Double.isNaN(reader.nextDouble()));
    Assert.assertEquals(Double.POSITIVE_INFINITY, reader.nextDouble(), 0.0);
    Assert.assertEquals(Double.NEGATIVE_INFINITY, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testNextDouble_nanStrict_throwsException() throws IOException {
    JsonReader reader = reader("[\"NaN\"]");
    reader.beginArray();
    reader.nextDouble();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextDouble_notANumber_throwsException() throws IOException {
    JsonReader reader = reader("[true]");
    reader.beginArray();
    reader.nextDouble();
  }

  @Test
  public void testNextLong_variousFormats_success() throws IOException {
    JsonReader reader = reader("[0, -0, 9223372036854775807, -9223372036854775808, \"100\", '200', 1.0e2]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(Long.MAX_VALUE, reader.nextLong());
    Assert.assertEquals(Long.MIN_VALUE, reader.nextLong());
    Assert.assertEquals(100L, reader.nextLong());
    Assert.assertEquals(200L, reader.nextLong());
    Assert.assertEquals(100L, reader.nextLong());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextLong_overflow_throwsException() throws IOException {
    JsonReader reader = reader("[9223372036854775808]");
    reader.beginArray();
    reader.nextLong();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextLong_fractionalDouble_throwsException() throws IOException {
    JsonReader reader = reader("[\"123.45\"]");
    reader.beginArray();
    reader.nextLong();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextLong_notANumber_throwsException() throws IOException {
    JsonReader reader = reader("[false]");
    reader.beginArray();
    reader.nextLong();
  }

  @Test
  public void testNextInt_variousFormats_success() throws IOException {
    JsonReader reader = reader("[0, -0, 2147483647, -2147483648, \"100\", '200', 1.0e2]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(Integer.MAX_VALUE, reader.nextInt());
    Assert.assertEquals(Integer.MIN_VALUE, reader.nextInt());
    Assert.assertEquals(100, reader.nextInt());
    Assert.assertEquals(200, reader.nextInt());
    Assert.assertEquals(100, reader.nextInt());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextInt_overflowFromLong_throwsException() throws IOException {
    JsonReader reader = reader("[2147483648]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextInt_fractionalDouble_throwsException() throws IOException {
    JsonReader reader = reader("[\"123.45\"]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextInt_notANumber_throwsException() throws IOException {
    JsonReader reader = reader("[{}]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test
  public void testClose_closesReaderAndThrowsOnSubsequentUse() throws IOException {
    final boolean[] closed = new boolean[1];
    Reader in = new StringReader("[]") {
      @Override
      public void close() {
        closed[0] = true;
        super.close();
      }
    };
    JsonReader reader = new JsonReader(in);
    reader.close();
    Assert.assertTrue(closed[0]);

    try {
      reader.peek();
      Assert.fail();
    } catch (IllegalStateException expected) {
    }
  }

  @Test
  public void testSkipValue_nestedObjectsAndArrays_success() throws IOException {
    JsonReader reader = reader("{\"a\":[1,2,{\"k\":\"v\"}],\"b\":3,\"c\":'skip',\"d\":unquoted,\"e\":1.23}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("b", reader.nextName());
    Assert.assertEquals(3, reader.nextInt());
    Assert.assertEquals("c", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("d", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("e", reader.nextName());
    reader.skipValue();
    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testGetPath_tracksPathCorrectly() throws IOException {
    JsonReader reader = reader("{\"a\":[1,{\"b\":true}],\"c\":\"d\"}");
    Assert.assertEquals("$", reader.getPath());
    reader.beginObject();
    Assert.assertEquals("$.", reader.getPath());
    reader.nextName();
    Assert.assertEquals("$.a", reader.getPath());
    reader.beginArray();
    Assert.assertEquals("$.a[0]", reader.getPath());
    reader.nextInt();
    Assert.assertEquals("$.a[1]", reader.getPath());
    reader.beginObject();
    Assert.assertEquals("$.a[1].", reader.getPath());
    reader.nextName();
    Assert.assertEquals("$.a[1].b", reader.getPath());
    reader.nextBoolean();
    reader.endObject();
    Assert.assertEquals("$.a[2]", reader.getPath());
    reader.endArray();
    reader.nextName();
    Assert.assertEquals("$.c", reader.getPath());
    reader.nextString();
    reader.endObject();
    Assert.assertEquals("$", reader.getPath());
  }

  @Test
  public void testToString_format() {
    JsonReader reader = reader("  [1]");
    Assert.assertTrue(reader.toString().startsWith("JsonReader at line 1 column 1"));
  }

  @Test
  public void testStringEscapes_allSupportedCharacters_success() throws IOException {
    JsonReader reader = reader("[\"\\\"\\\\\\/\\b\\f\\n\\r\\t\\u0041\\u0020\"]");
    reader.beginArray();
    Assert.assertEquals("\"\\/\b\f\n\r\tA ", reader.nextString());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void testStringEscapes_malformedUnicode_throwsException() throws IOException {
    JsonReader reader = reader("[\"\\u00AG\"]");
    reader.beginArray();
    reader.nextString();
  }

  @Test
  public void testComments_cStyleAndHash_lenient() throws IOException {
    String json = "/* comment */\n"
        + "{\n"
        + "  // single line comment\n"
        + "  # hash comment\n"
        + "  \"key\": /* inline */ \"value\"\n"
        + "}";
    JsonReader reader = reader(json);
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void testComments_strictMode_throwsException() throws IOException {
    JsonReader reader = reader("// comment\n{}");
    reader.beginObject();
  }

  @Test
  public void testNonExecutePrefix_lenientMode_success() throws IOException {
    JsonReader reader = reader(")]}'\n{\"key\":\"value\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testLenientNameValueSeparators() throws IOException {
    JsonReader reader = reader("{key = \"value1\", key2 => \"value2\"; key3: \"value3\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value1", reader.nextString());
    Assert.assertEquals("key2", reader.nextName());
    Assert.assertEquals("value2", reader.nextString());
    Assert.assertEquals("key3", reader.nextName());
    Assert.assertEquals("value3", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testLenientArraySeparatorsAndEmptyValues() throws IOException {
    JsonReader reader = reader("[1; 2, , 3, ]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    reader.nextNull();
    Assert.assertEquals(3, reader.nextInt());
    reader.nextNull();
    reader.endArray();
  }

  @Test
  public void testMultipleTopLevelValuesLenient() throws IOException {
    JsonReader reader = reader("1 2 3");
    reader.setLenient(true);
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    Assert.assertEquals(3, reader.nextInt());
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testBomStripping() throws IOException {
    JsonReader reader = reader("\ufeff{\"a\":1}");
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void testLargeBufferFill() throws IOException {
    char[] chars = new char[2048];
    Arrays.fill(chars, 'a');
    String largeString = new String(chars);
    JsonReader reader = reader("[\"" + largeString + "\", unquoted" + largeString + "]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(largeString, reader.nextString());
    Assert.assertEquals("unquoted" + largeString, reader.nextString());
    reader.endArray();
  }

  @Test
  public void testStackExpansion() throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 40; i++) {
      sb.append("[");
    }
    sb.append("1");
    for (int i = 0; i < 40; i++) {
      sb.append("]");
    }
    JsonReader reader = reader(sb.toString());
    for (int i = 0; i < 40; i++) {
      reader.beginArray();
    }
    Assert.assertEquals(1, reader.nextInt());
    for (int i = 0; i < 40; i++) {
      reader.endArray();
    }
  }

  @Test
  public void testPromoteNameToValue() throws IOException {
    JsonReader reader = reader("{\"k1\":\"v1\", 'k2':'v2', k3:1}");
    reader.setLenient(true);
    reader.beginObject();

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals("k1", reader.nextString());
    Assert.assertEquals("v1", reader.nextString());

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals("k2", reader.nextString());
    Assert.assertEquals("v2", reader.nextString());

    Assert.assertEquals(JsonToken.NAME, reader.peek());
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals("k3", reader.nextString());
    Assert.assertEquals(1, reader.nextInt());

    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testPromoteNameToValue_invalidToken_throwsException() throws IOException {
    JsonReader reader = reader("[1]");
    reader.beginArray();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
  }

  @Test(expected = EOFException.class)
  public void testEmptyDocument_strict_throwsException() throws IOException {
    JsonReader reader = reader("");
    reader.peek();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedComment_throwsException() throws IOException {
    JsonReader reader = reader("/* unterminated");
    reader.setLenient(true);
    reader.peek();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedString_throwsException() throws IOException {
    JsonReader reader = reader("\"unterminated");
    reader.peek();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedArray_throwsException() throws IOException {
    JsonReader reader = reader("[1,");
    reader.beginArray();
    reader.nextInt();
    reader.peek();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedObject_throwsException() throws IOException {
    JsonReader reader = reader("{\"a\":1,");
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    reader.peek();
  }
}
