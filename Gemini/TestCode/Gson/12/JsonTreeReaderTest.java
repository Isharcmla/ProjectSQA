package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonToken;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class JsonTreeReaderTest {

  @Test
  public void testEmptyArray_traverseSuccessfully() throws IOException {
    JsonArray array = new JsonArray();
    JsonTreeReader reader = new JsonTreeReader(array);

    assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    assertEquals("$", reader.getPath());
    reader.beginArray();

    assertFalse(reader.hasNext());
    assertEquals(JsonToken.END_ARRAY, reader.peek());
    assertEquals("$[0]", reader.getPath());
    reader.endArray();

    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    assertEquals("$", reader.getPath());
  }

  @Test
  public void testEmptyObject_traverseSuccessfully() throws IOException {
    JsonObject object = new JsonObject();
    JsonTreeReader reader = new JsonTreeReader(object);

    assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
    assertEquals("$", reader.getPath());
    reader.beginObject();

    assertFalse(reader.hasNext());
    assertEquals(JsonToken.END_OBJECT, reader.peek());
    assertEquals("$.", reader.getPath());
    reader.endObject();

    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testPrimitives_readAllTypes() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("hello"));
    array.add(new JsonPrimitive(true));
    array.add(new JsonPrimitive(123));
    array.add(new JsonPrimitive(456L));
    array.add(new JsonPrimitive(7.89));
    array.add(JsonNull.INSTANCE);

    JsonTreeReader reader = new JsonTreeReader(array);
    reader.beginArray();

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.STRING, reader.peek());
    assertEquals("hello", reader.nextString());

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.BOOLEAN, reader.peek());
    assertTrue(reader.nextBoolean());

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NUMBER, reader.peek());
    assertEquals(123, reader.nextInt());

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NUMBER, reader.peek());
    assertEquals(456L, reader.nextLong());

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NUMBER, reader.peek());
    assertEquals(7.89, reader.nextDouble(), 0.0001);

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();

    assertFalse(reader.hasNext());
    reader.endArray();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testNextString_withNumberPrimitive_returnsString() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(12345));
    assertEquals(JsonToken.NUMBER, reader.peek());
    assertEquals("12345", reader.nextString());
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testNumbers_withStringPrimitive_parsedCorrectly() throws IOException {
    JsonTreeReader reader1 = new JsonTreeReader(new JsonPrimitive("42"));
    assertEquals(42, reader1.nextInt());

    JsonTreeReader reader2 = new JsonTreeReader(new JsonPrimitive("1234567890123"));
    assertEquals(1234567890123L, reader2.nextLong());

    JsonTreeReader reader3 = new JsonTreeReader(new JsonPrimitive("3.14159"));
    assertEquals(3.14159, reader3.nextDouble(), 0.00001);
  }

  @Test
  public void testJsonObject_traverseMembers() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("key1", "val1");
    obj.addProperty("key2", 100);

    JsonTreeReader reader = new JsonTreeReader(obj);
    reader.beginObject();

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NAME, reader.peek());
    assertEquals("key1", reader.nextName());
    assertEquals("$.key1", reader.getPath());
    assertEquals("val1", reader.nextString());

    assertTrue(reader.hasNext());
    assertEquals(JsonToken.NAME, reader.peek());
    assertEquals("key2", reader.nextName());
    assertEquals("$.key2", reader.getPath());
    assertEquals(100, reader.nextInt());

    assertFalse(reader.hasNext());
    reader.endObject();
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testPromoteNameToValue() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("foo", "bar");

    JsonTreeReader reader = new JsonTreeReader(obj);
    reader.beginObject();

    assertEquals(JsonToken.NAME, reader.peek());
    reader.promoteNameToValue();

    assertEquals(JsonToken.STRING, reader.peek());
    assertEquals("foo", reader.nextString());

    assertEquals(JsonToken.STRING, reader.peek());
    assertEquals("bar", reader.nextString());

    reader.endObject();
  }

  @Test
  public void testPromoteNameToValue_whenNotName_throwsException() {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("hello"));
    try {
      reader.promoteNameToValue();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected NAME but was STRING"));
    } catch (IOException e) {
      fail("Unexpected IOException: " + e.getMessage());
    }
  }

  @Test
  public void testSkipValue_onObjectMemberName() throws IOException {
    JsonObject obj = new JsonObject();
    obj.addProperty("key1", "val1");
    obj.addProperty("key2", "val2");

    JsonTreeReader reader = new JsonTreeReader(obj);
    reader.beginObject();

    reader.skipValue(); // skips "key1"
    assertEquals("val1", reader.nextString());

    assertEquals("key2", reader.nextName());
    reader.skipValue(); // skips "val2"

    reader.endObject();
  }

  @Test
  public void testSkipValue_onArrayElements() throws IOException {
    JsonArray array = new JsonArray();
    array.add(1);
    array.add(2);
    array.add(3);

    JsonTreeReader reader = new JsonTreeReader(array);
    reader.beginArray();

    reader.skipValue(); // skips 1
    assertEquals(2, reader.nextInt());
    reader.skipValue(); // skips 3

    reader.endArray();
  }

  @Test
  public void testNextDouble_nanAndInfinity_lenientAndStrict() throws IOException {
    JsonTreeReader readerNaN = new JsonTreeReader(new JsonPrimitive(Double.NaN));
    try {
      readerNaN.nextDouble();
      fail("Expected NumberFormatException when strict");
    } catch (NumberFormatException expected) {
      assertTrue(expected.getMessage().contains("JSON forbids NaN and infinities"));
    }

    readerNaN = new JsonTreeReader(new JsonPrimitive(Double.NaN));
    readerNaN.setLenient(true);
    assertTrue(Double.isNaN(readerNaN.nextDouble()));

    JsonTreeReader readerInf = new JsonTreeReader(new JsonPrimitive(Double.POSITIVE_INFINITY));
    try {
      readerInf.nextDouble();
      fail("Expected NumberFormatException when strict");
    } catch (NumberFormatException expected) {
      assertTrue(expected.getMessage().contains("JSON forbids NaN and infinities"));
    }

    readerInf = new JsonTreeReader(new JsonPrimitive(Double.POSITIVE_INFINITY));
    readerInf.setLenient(true);
    assertTrue(Double.isInfinite(readerInf.nextDouble()));
  }

  @Test
  public void testClose_makesReaderUnusable() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("test"));
    reader.close();

    try {
      reader.peek();
      fail("Expected IllegalStateException after close");
    } catch (IllegalStateException expected) {
      assertEquals("JsonReader is closed", expected.getMessage());
    }
  }

  @Test
  public void testToString() {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("test"));
    assertEquals("JsonTreeReader", reader.toString());
  }

  @Test
  public void testStackExpansion_pushMoreThan32Elements() throws IOException {
    JsonArray root = new JsonArray();
    JsonArray current = root;
    for (int i = 0; i < 40; i++) {
      JsonArray next = new JsonArray();
      current.add(next);
      current = next;
    }
    current.add(999);

    JsonTreeReader reader = new JsonTreeReader(root);
    for (int i = 0; i < 40; i++) {
      reader.beginArray();
    }
    reader.beginArray();
    assertEquals(999, reader.nextInt());
    reader.endArray();
    for (int i = 0; i < 40; i++) {
      reader.endArray();
    }
    assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void testGetPath_nestedStructures() throws IOException {
    JsonObject root = new JsonObject();
    JsonArray array = new JsonArray();
    JsonObject innerObj = new JsonObject();
    innerObj.addProperty("field", "value");
    array.add(innerObj);
    root.add("items", array);

    JsonTreeReader reader = new JsonTreeReader(root);
    assertEquals("$", reader.getPath());

    reader.beginObject();
    assertEquals("$.", reader.getPath());

    assertEquals("items", reader.nextName());
    assertEquals("$.items", reader.getPath());

    reader.beginArray();
    assertEquals("$.items[0]", reader.getPath());

    reader.beginObject();
    assertEquals("$.items[0].", reader.getPath());

    assertEquals("field", reader.nextName());
    assertEquals("$.items[0].field", reader.getPath());

    assertEquals("value", reader.nextString());

    reader.endObject();
    assertEquals("$.items[0]", reader.getPath());

    reader.endArray();
    assertEquals("$.items", reader.getPath());

    reader.endObject();
    assertEquals("$", reader.getPath());
  }

  @Test
  public void testExpectMismatch_throwsIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("string"));

    try {
      reader.beginArray();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected BEGIN_ARRAY but was STRING at path $"));
    }

    try {
      reader.beginObject();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected BEGIN_OBJECT but was STRING at path $"));
    }

    try {
      reader.endArray();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected END_ARRAY but was STRING at path $"));
    }

    try {
      reader.endObject();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected END_OBJECT but was STRING at path $"));
    }

    try {
      reader.nextBoolean();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected BOOLEAN but was STRING at path $"));
    }

    try {
      reader.nextNull();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected NULL but was STRING at path $"));
    }
  }

  @Test
  public void testNextTypeMismatch_throwsIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));

    try {
      reader.nextString();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected STRING but was BOOLEAN at path $"));
    }

    try {
      reader.nextDouble();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected NUMBER but was BOOLEAN at path $"));
    }

    try {
      reader.nextLong();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected NUMBER but was BOOLEAN at path $"));
    }

    try {
      reader.nextInt();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected NUMBER but was BOOLEAN at path $"));
    }
  }

  @Test
  public void testNextName_whenNotName_throwsIllegalStateException() throws IOException {
    JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("not_a_name"));
    try {
      reader.nextName();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("Expected NAME but was STRING at path $"));
    }
  }

  @Test
  public void testCustomJsonElementSubclass_peekThrowsAssertionError() {
    JsonElement customElement = new JsonElement() {
      @Override
      public JsonElement deepCopy() {
        return this;
      }
    };
    JsonTreeReader reader = new JsonTreeReader(customElement);
    try {
      reader.peek();
      fail("Expected AssertionError for unknown JsonElement subtype");
    } catch (AssertionError expected) {
      // Expected
    } catch (IOException e) {
      fail("Unexpected IOException: " + e.getMessage());
    }
  }
}
