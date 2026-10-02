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
  public void testSetLenient_and_isLenient() {
    JsonReader reader = reader("{}");
    Assert.assertFalse(reader.isLenient());
    reader.setLenient(true);
    Assert.assertTrue(reader.isLenient());
  }

  @Test
  public void testEmptyArray_success() throws IOException {
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
  public void testEmptyObject_success() throws IOException {
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
    JsonReader reader = reader("{\"a\": 1}");
    reader.beginObject();
    reader.endObject();
  }

  @Test
  public void testNextName_doubleQuoted() throws IOException {
    JsonReader reader = reader("{\"key\":\"value\"}");
    reader.beginObject();
    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testNextName_singleQuotedLenient() throws IOException {
    JsonReader reader = reader("{'key':'value'}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void testNextName_unquotedLenient() throws IOException {
    JsonReader reader = reader("{key:\"value\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextName_whenExpectingValue_throwsException() throws IOException {
    JsonReader reader = reader("[\"val\"]");
    reader.beginArray();
    reader.nextName();
  }

  @Test
  public void testNextString_variousTypes() throws IOException {
    JsonReader reader = reader("[\"str\", 'single', unquoted, 123, 45.67, true, false, null]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals("str", reader.nextString());
    Assert.assertEquals("single", reader.nextString());
    Assert.assertEquals("unquoted", reader.nextString());
    Assert.assertEquals("123", reader.nextString());
    Assert.assertEquals("45.67", reader.nextString());
    Assert.assertEquals("true", reader.nextString());
    Assert.assertEquals("false", reader.nextString());
    Assert.assertEquals("null", reader.nextString());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextString_whenObject_throwsException() throws IOException {
    JsonReader reader = reader("{}");
    reader.nextString();
  }

  @Test
  public void testNextBoolean_trueAndFalse() throws IOException {
    JsonReader reader = reader("[true, false]");
    reader.beginArray();
    Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
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
  public void testNextNull_success() throws IOException {
    JsonReader reader = reader("[null]");
    reader.beginArray();
    Assert.assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextNull_notNull_throwsException() throws IOException {
    JsonReader reader = reader("[1]");
    reader.beginArray();
    reader.nextNull();
  }

  @Test
  public void testNextDouble_variousFormats() throws IOException {
    JsonReader reader = reader("[0.0, -0.5, 123, \"123.45\", '67.89', 1e-2, 1E+2, -1.5e3]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0.0, reader.nextDouble(), 0.0);
    Assert.assertEquals(-0.5, reader.nextDouble(), 0.0);
    Assert.assertEquals(123.0, reader.nextDouble(), 0.0);
    Assert.assertEquals(123.45, reader.nextDouble(), 0.0);
    Assert.assertEquals(67.89, reader.nextDouble(), 0.0);
    Assert.assertEquals(0.01, reader.nextDouble(), 0.0);
    Assert.assertEquals(100.0, reader.nextDouble(), 0.0);
    Assert.assertEquals(-1500.0, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test
  public void testNextDouble_lenientNaNAndInfinity() throws IOException {
    JsonReader reader = reader("[NaN, Infinity, -Infinity]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertTrue(Double.isNaN(reader.nextDouble()));
    Assert.assertEquals(Double.POSITIVE_INFINITY, reader.nextDouble(), 0.0);
    Assert.assertEquals(Double.NEGATIVE_INFINITY, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void testNextDouble_strictNaN_throwsException() throws IOException {
    JsonReader reader = reader("[\"NaN\"]");
    reader.beginArray();
    reader.nextDouble();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextDouble_onBoolean_throwsException() throws IOException {
    JsonReader reader = reader("[true]");
    reader.beginArray();
    reader.nextDouble();
  }

  @Test
  public void testNextLong_variousFormats() throws IOException {
    JsonReader reader = reader("[0, -0, 9223372036854775807, -9223372036854775808, \"100\", '200', 300.0]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(Long.MAX_VALUE, reader.nextLong());
    Assert.assertEquals(Long.MIN_VALUE, reader.nextLong());
    Assert.assertEquals(100L, reader.nextLong());
    Assert.assertEquals(200L, reader.nextLong());
    Assert.assertEquals(300L, reader.nextLong());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextLong_overflow_throwsException() throws IOException {
    JsonReader reader = reader("[9223372036854775808]");
    reader.beginArray();
    reader.nextLong();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextLong_fractionalLoss_throwsException() throws IOException {
    JsonReader reader = reader("[12.34]");
    reader.beginArray();
    reader.nextLong();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextLong_onBoolean_throwsException() throws IOException {
    JsonReader reader = reader("[false]");
    reader.beginArray();
    reader.nextLong();
  }

  @Test
  public void testNextInt_variousFormats() throws IOException {
    JsonReader reader = reader("[0, -1, 2147483647, -2147483648, \"100\", '200', 300.0]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(-1, reader.nextInt());
    Assert.assertEquals(Integer.MAX_VALUE, reader.nextInt());
    Assert.assertEquals(Integer.MIN_VALUE, reader.nextInt());
    Assert.assertEquals(100, reader.nextInt());
    Assert.assertEquals(200, reader.nextInt());
    Assert.assertEquals(300, reader.nextInt());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextInt_longOverflow_throwsException() throws IOException {
    JsonReader reader = reader("[2147483648]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = NumberFormatException.class)
  public void testNextInt_fractionalLoss_throwsException() throws IOException {
    JsonReader reader = reader("[1.5]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = IllegalStateException.class)
  public void testNextInt_onNull_throwsException() throws IOException {
    JsonReader reader = reader("[null]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test
  public void testEscapedCharacters() throws IOException {
    JsonReader reader = reader("[\"\\\"\\\\\\/\\b\\f\\n\\r\\t\\u0041\\u000a\\u000A\"]");
    reader.beginArray();
    Assert.assertEquals("\"\\/\b\f\n\r\tA\n\n", reader.nextString());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void testMalformedUnicodeEscape_throwsException() throws IOException {
    JsonReader reader = reader("[\"\\u12G4\"]");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedEscape_throwsException() throws IOException {
    JsonReader reader = reader("[\"\\");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedString_throwsException() throws IOException {
    JsonReader reader = reader("[\"unterminated");
    reader.beginArray();
    reader.nextString();
  }

  @Test
  public void testSkipValue_complexNestedStructure() throws IOException {
    JsonReader reader = reader("{\"a\":[1,2,{\"b\":true}], \"c\":'single', \"d\":unquoted, \"e\":123, \"f\":\"double\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("c", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("d", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("e", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("f", reader.nextName());
    reader.skipValue();
    reader.endObject();
  }

  @Test
  public void testSkipValue_inArray() throws IOException {
    JsonReader reader = reader("[[1, 2], {\"a\": 3}, 'str', unq, 45]");
    reader.setLenient(true);
    reader.beginArray();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.endArray();
  }

  @Test
  public void testGetPath_trackingCorrectly() throws IOException {
    JsonReader reader = reader("{\"a\":[1,{\"b\":2}]}");
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
    reader.nextInt();
    Assert.assertEquals("$.a[1].b", reader.getPath());
    reader.endObject();
    Assert.assertEquals("$.a[2]", reader.getPath());
    reader.endArray();
    Assert.assertEquals("$[1]", reader.getPath());
    reader.endObject();
    Assert.assertEquals("$[1]", reader.getPath());
  }

  @Test
  public void testStackAndBufferGrowth() throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 40; i++) {
      sb.append("[");
    }
    char[] bigString = new char[2048];
    Arrays.fill(bigString, 'x');
    sb.append("\"").append(new String(bigString)).append("\"");
    for (int i = 0; i < 40; i++) {
      sb.append("]");
    }
    JsonReader reader = reader(sb.toString());
    for (int i = 0; i < 40; i++) {
      reader.beginArray();
    }
    Assert.assertEquals(new String(bigString), reader.nextString());
    for (int i = 0; i < 40; i++) {
      reader.endArray();
    }
  }

  @Test
  public void testLargeUnquotedStringGrowth() throws IOException {
    char[] bigChars = new char[2048];
    Arrays.fill(bigChars, 'u');
    String bigUnquoted = new String(bigChars);
    JsonReader reader = reader(bigUnquoted);
    reader.setLenient(true);
    Assert.assertEquals(bigUnquoted, reader.nextString());
  }

  @Test
  public void testComments_cStyleAndHashAndSlashSlash() throws IOException {
    String json = "/* comment */\n"
        + "// slash comment\n"
        + "# hash comment\n"
        + "{\"a\": /* inline */ 1 // end of line\n"
        + "}";
    JsonReader reader = reader(json);
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void testUnterminatedComment_throwsException() throws IOException {
    JsonReader reader = reader("/* comment");
    reader.setLenient(true);
    reader.peek();
  }

  @Test
  public void testLenientNameSeparators() throws IOException {
    JsonReader reader = reader("{a=1, b=>2}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals("b", reader.nextName());
    Assert.assertEquals(2, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void testLenientArraySeparators() throws IOException {
    JsonReader reader = reader("[1;2,3,]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    Assert.assertEquals(3, reader.nextInt());
    Assert.assertNull(reader.nextString());
    reader.endArray();
  }

  @Test
  public void testNonExecutePrefix() throws IOException {
    JsonReader reader = reader(")]}'\n[1]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testByteOrderMark_consumed() throws IOException {
    JsonReader reader = reader("\ufeff[1]");
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void testMultipleTopLevelValues_lenient() throws IOException {
    JsonReader reader = reader("1 2 3");
    reader.setLenient(true);
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    Assert.assertEquals(3, reader.nextInt());
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = MalformedJsonException.class)
  public void testMultipleTopLevelValues_strict_throwsException() throws IOException {
    JsonReader reader = reader("1 2");
    reader.nextInt();
    reader.peek();
  }

  @Test
  public void testInternalAccess_promoteNameToValue() throws IOException {
    JsonReader reader = reader("{\"a\": 1, 'b': 2, c: 3}");
    reader.setLenient(true);
    reader.beginObject();

    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals("a", reader.nextString());
    Assert.assertEquals(1, reader.nextInt());

    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals("b", reader.nextString());
    Assert.assertEquals(2, reader.nextInt());

    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals("c", reader.nextString());
    Assert.assertEquals(3, reader.nextInt());

    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testInternalAccess_promoteNameToValue_invalidToken_throwsException() throws IOException {
    JsonReader reader = reader("[1]");
    reader.beginArray();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
  }

  @Test
  public void testClose_and_toString() throws IOException {
    JsonReader reader = reader("[1]");
    reader.beginArray();
    Assert.assertTrue(reader.toString().contains("JsonReader"));
    reader.close();
    try {
      reader.peek();
      Assert.fail("Expected IllegalStateException after close");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test(expected = EOFException.class)
  public void testEmptyDocument_throwsEOF() throws IOException {
    JsonReader reader = reader("");
    reader.peek();
  }

  @Test(expected = MalformedJsonException.class)
  public void testStrict_unquotedString_throwsException() throws IOException {
    JsonReader reader = reader("[unquoted]");
    reader.beginArray();
    reader.peek();
  }

  @Test(expected = MalformedJsonException.class)
  public void testStrict_singleQuotedString_throwsException() throws IOException {
    JsonReader reader = reader("['single']");
    reader.beginArray();
    reader.peek();
  }
}
