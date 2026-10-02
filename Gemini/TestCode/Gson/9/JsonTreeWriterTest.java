package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class JsonTreeWriterTest {

  private JsonTreeWriter writer;

  @Before
  public void setUp() {
    writer = new JsonTreeWriter();
  }

  @Test
  public void testGet_emptyWriter_returnsJsonNull() {
    Assert.assertEquals(JsonNull.INSTANCE, writer.get());
  }

  @Test(expected = IllegalStateException.class)
  public void testGet_unclosedDocument_throwsIllegalStateException() throws IOException {
    writer.beginArray();
    writer.get();
  }

  @Test
  public void testValueString_validString_setsProduct() throws IOException {
    writer.value("hello");
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals("hello", element.getAsString());
  }

  @Test
  public void testValueString_emptyString_setsProduct() throws IOException {
    writer.value("");
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonPrimitive());
    Assert.assertEquals("", element.getAsString());
  }

  @Test
  public void testValueString_nullString_setsJsonNull() throws IOException {
    writer.value((String) null);
    Assert.assertEquals(JsonNull.INSTANCE, writer.get());
  }

  @Test
  public void testNullValue_setsJsonNull() throws IOException {
    writer.nullValue();
    Assert.assertEquals(JsonNull.INSTANCE, writer.get());
  }

  @Test
  public void testValueBoolean_trueAndFalse() throws IOException {
    writer.value(true);
    Assert.assertTrue(writer.get().getAsBoolean());

    JsonTreeWriter writer2 = new JsonTreeWriter();
    writer2.value(false);
    Assert.assertFalse(writer2.get().getAsBoolean());
  }

  @Test
  public void testValueDouble_validDoubles() throws IOException {
    writer.value(123.456);
    Assert.assertEquals(123.456, writer.get().getAsDouble(), 0.00001);

    JsonTreeWriter writer2 = new JsonTreeWriter();
    writer2.value(-0.0);
    Assert.assertEquals(-0.0, writer2.get().getAsDouble(), 0.00001);

    JsonTreeWriter writer3 = new JsonTreeWriter();
    writer3.value(0.0);
    Assert.assertEquals(0.0, writer3.get().getAsDouble(), 0.00001);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_nanNotLenient_throwsException() throws IOException {
    writer.setLenient(false);
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_infinityNotLenient_throwsException() throws IOException {
    writer.setLenient(false);
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueDouble_negativeInfinityNotLenient_throwsException() throws IOException {
    writer.setLenient(false);
    writer.value(Double.NEGATIVE_INFINITY);
  }

  @Test
  public void testValueDouble_nanLenient_success() throws IOException {
    writer.setLenient(true);
    writer.value(Double.NaN);
    Assert.assertTrue(Double.isNaN(writer.get().getAsDouble()));
  }

  @Test
  public void testValueDouble_infinityLenient_success() throws IOException {
    writer.setLenient(true);
    writer.value(Double.POSITIVE_INFINITY);
    Assert.assertTrue(Double.isInfinite(writer.get().getAsDouble()));
  }

  @Test
  public void testValueLong_validLongs() throws IOException {
    writer.value(123456789L);
    Assert.assertEquals(123456789L, writer.get().getAsLong());

    JsonTreeWriter writer2 = new JsonTreeWriter();
    writer2.value(0L);
    Assert.assertEquals(0L, writer2.get().getAsLong());

    JsonTreeWriter writer3 = new JsonTreeWriter();
    writer3.value(-987654321L);
    Assert.assertEquals(-987654321L, writer3.get().getAsLong());
  }

  @Test
  public void testValueNumber_nullNumber_setsJsonNull() throws IOException {
    writer.value((Number) null);
    Assert.assertEquals(JsonNull.INSTANCE, writer.get());
  }

  @Test
  public void testValueNumber_validNumber() throws IOException {
    writer.value(Integer.valueOf(42));
    Assert.assertEquals(42, writer.get().getAsInt());

    JsonTreeWriter writer2 = new JsonTreeWriter();
    writer2.value(Byte.valueOf((byte) -5));
    Assert.assertEquals((byte) -5, writer2.get().getAsByte());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueNumber_nanNotLenient_throwsException() throws IOException {
    writer.setLenient(false);
    writer.value(Double.valueOf(Double.NaN));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueNumber_infinityNotLenient_throwsException() throws IOException {
    writer.setLenient(false);
    writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
  }

  @Test
  public void testValueNumber_nanLenient_success() throws IOException {
    writer.setLenient(true);
    writer.value(Double.valueOf(Double.NaN));
    Assert.assertTrue(Double.isNaN(writer.get().getAsDouble()));
  }

  @Test
  public void testArray_emptyArray() throws IOException {
    writer.beginArray();
    writer.endArray();
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonArray());
    Assert.assertEquals(0, element.getAsJsonArray().size());
  }

  @Test
  public void testArray_withValues() throws IOException {
    writer.beginArray();
    writer.value("item1");
    writer.value(2);
    writer.value(true);
    writer.nullValue();
    writer.endArray();

    JsonArray array = writer.get().getAsJsonArray();
    Assert.assertEquals(4, array.size());
    Assert.assertEquals("item1", array.get(0).getAsString());
    Assert.assertEquals(2, array.get(1).getAsInt());
    Assert.assertTrue(array.get(2).getAsBoolean());
    Assert.assertTrue(array.get(3).isJsonNull());
  }

  @Test
  public void testObject_emptyObject() throws IOException {
    writer.beginObject();
    writer.endObject();
    JsonElement element = writer.get();
    Assert.assertTrue(element.isJsonObject());
    Assert.assertEquals(0, element.getAsJsonObject().entrySet().size());
  }

  @Test
  public void testObject_withFields() throws IOException {
    writer.beginObject();
    writer.name("name").value("John");
    writer.name("age").value(30);
    writer.name("active").value(true);
    writer.endObject();

    JsonObject obj = writer.get().getAsJsonObject();
    Assert.assertEquals("John", obj.get("name").getAsString());
    Assert.assertEquals(30, obj.get("age").getAsInt());
    Assert.assertTrue(obj.get("active").getAsBoolean());
  }

  @Test
  public void testObject_serializeNullsTrue() throws IOException {
    writer.setSerializeNulls(true);
    writer.beginObject();
    writer.name("nullField").nullValue();
    writer.endObject();

    JsonObject obj = writer.get().getAsJsonObject();
    Assert.assertTrue(obj.has("nullField"));
    Assert.assertTrue(obj.get("nullField").isJsonNull());
  }

  @Test
  public void testObject_serializeNullsFalse() throws IOException {
    writer.setSerializeNulls(false);
    writer.beginObject();
    writer.name("nullField").nullValue();
    writer.endObject();

    JsonObject obj = writer.get().getAsJsonObject();
    Assert.assertFalse(obj.has("nullField"));
  }

  @Test
  public void testNestedStructures() throws IOException {
    writer.beginObject();
    writer.name("users").beginArray();
    writer.beginObject().name("id").value(1).endObject();
    writer.beginObject().name("id").value(2).endObject();
    writer.endArray();
    writer.endObject();

    JsonObject root = writer.get().getAsJsonObject();
    JsonArray users = root.getAsJsonArray("users");
    Assert.assertEquals(2, users.size());
    Assert.assertEquals(1, users.get(0).getAsJsonObject().get("id").getAsInt());
    Assert.assertEquals(2, users.get(1).getAsJsonObject().get("id").getAsInt());
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_onEmptyStack_throwsIllegalStateException() throws IOException {
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_whenPendingName_throwsIllegalStateException() throws IOException {
    writer.beginObject();
    writer.name("key");
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndArray_whenCurrentIsObject_throwsIllegalStateException() throws IOException {
    writer.beginObject();
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_onEmptyStack_throwsIllegalStateException() throws IOException {
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_whenPendingName_throwsIllegalStateException() throws IOException {
    writer.beginObject();
    writer.name("key");
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testEndObject_whenCurrentIsArray_throwsIllegalStateException() throws IOException {
    writer.beginArray();
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void testName_onEmptyStack_throwsIllegalStateException() throws IOException {
    writer.name("key");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_whenPendingNameAlreadySet_throwsIllegalStateException() throws IOException {
    writer.beginObject();
    writer.name("key1");
    writer.name("key2");
  }

  @Test(expected = IllegalStateException.class)
  public void testName_whenInArray_throwsIllegalStateException() throws IOException {
    writer.beginArray();
    writer.name("key");
  }

  @Test(expected = IllegalStateException.class)
  public void testPut_valueInObjectWithoutName_throwsIllegalStateException() throws IOException {
    writer.beginObject();
    writer.value("unnamedValue");
  }

  @Test
  public void testFlush_doesNothing() throws IOException {
    writer.value("test");
    writer.flush();
    Assert.assertEquals("test", writer.get().getAsString());
  }

  @Test
  public void testClose_completeDocument_success() throws IOException {
    writer.value("test");
    writer.close();
  }

  @Test(expected = IOException.class)
  public void testClose_incompleteDocument_throwsIOException() throws IOException {
    writer.beginObject();
    writer.close();
  }

  @Test(expected = IllegalStateException.class)
  public void testOperationsAfterClose_throwsException() throws IOException {
    writer.value("first");
    writer.close();
    writer.value("second");
  }
}
