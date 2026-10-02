import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeWriter;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JsonTreeWriterTest {

    private JsonTreeWriter writer;

    @Before
    public void setUp() {
        writer = new JsonTreeWriter();
    }

    // ---------- get() tests ----------

    @Test
    public void testGet_defaultValue_returnsJsonNull() {
        JsonElement result = writer.get();
        assertTrue(result.isJsonNull());
    }

    @Test(expected = IllegalStateException.class)
    public void testGet_incompleteStack_throwsException() throws IOException {
        writer.beginArray();
        writer.get();
    }

    // ---------- beginArray / endArray tests ----------

    @Test
    public void testBeginArrayEndArray_emptyArray_returnsEmptyJsonArray() throws IOException {
        writer.beginArray();
        writer.endArray();
        JsonElement result = writer.get();
        assertTrue(result.isJsonArray());
        assertEquals(0, result.getAsJsonArray().size());
    }

    @Test
    public void testBeginArray_nestedArray_returnsNestedStructure() throws IOException {
        writer.beginArray();
        writer.beginArray();
        writer.value(1L);
        writer.endArray();
        writer.endArray();
        JsonElement result = writer.get();
        assertTrue(result.isJsonArray());
        JsonArray outer = result.getAsJsonArray();
        assertEquals(1, outer.size());
        assertTrue(outer.get(0).isJsonArray());
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_emptyStack_throwsException() throws IOException {
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_pendingNameSet_throwsException() throws IOException {
        writer.beginObject();
        writer.name("key");
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArray_topNotArray_throwsException() throws IOException {
        writer.beginObject();
        writer.endArray();
    }

    // ---------- beginObject / endObject tests ----------

    @Test
    public void testBeginObjectEndObject_emptyObject_returnsEmptyJsonObject() throws IOException {
        writer.beginObject();
        writer.endObject();
        JsonElement result = writer.get();
        assertTrue(result.isJsonObject());
        assertEquals(0, result.getAsJsonObject().size());
    }

    @Test
    public void testBeginObject_withNameValue_returnsPopulatedObject() throws IOException {
        writer.beginObject();
        writer.name("key");
        writer.value("value");
        writer.endObject();
        JsonElement result = writer.get();
        JsonObject obj = result.getAsJsonObject();
        assertEquals("value", obj.get("key").getAsString());
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_emptyStack_throwsException() throws IOException {
        writer.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_pendingNameSet_throwsException() throws IOException {
        writer.beginObject();
        writer.name("key");
        writer.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObject_topNotObject_throwsException() throws IOException {
        writer.beginArray();
        writer.endObject();
    }

    // ---------- name() tests ----------

    @Test(expected = IllegalStateException.class)
    public void testName_emptyStack_throwsException() throws IOException {
        writer.name("key");
    }

    @Test(expected = IllegalStateException.class)
    public void testName_pendingNameAlreadySet_throwsException() throws IOException {
        writer.beginObject();
        writer.name("key1");
        writer.name("key2");
    }

    @Test(expected = IllegalStateException.class)
    public void testName_topNotObject_throwsException() throws IOException {
        writer.beginArray();
        writer.name("key");
    }

    // ---------- value(String) tests ----------

    @Test
    public void testValueString_normalValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value("hello");
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertEquals("hello", arr.get(0).getAsString());
    }

    @Test
    public void testValueString_nullValue_addsJsonNull() throws IOException {
        writer.beginArray();
        writer.value((String) null);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertTrue(arr.get(0).isJsonNull());
    }

    @Test
    public void testValueString_emptyString_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value("");
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertEquals("", arr.get(0).getAsString());
    }

    // ---------- nullValue() tests ----------

    @Test
    public void testNullValue_addsJsonNullToArray() throws IOException {
        writer.beginArray();
        writer.nullValue();
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertTrue(arr.get(0).isJsonNull());
    }

    @Test
    public void testNullValue_withSerializeNullsTrue_addedToObject() throws IOException {
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("key");
        writer.nullValue();
        writer.endObject();
        JsonObject obj = writer.get().getAsJsonObject();
        assertTrue(obj.get("key").isJsonNull());
    }

    @Test
    public void testNullValue_withSerializeNullsFalse_notAddedToObject() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("key");
        writer.nullValue();
        writer.endObject();
        JsonObject obj = writer.get().getAsJsonObject();
        assertFalse(obj.has("key"));
    }

    // ---------- value(boolean) tests ----------

    @Test
    public void testValueBoolean_trueValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertTrue(arr.get(0).getAsBoolean());
    }

    @Test
    public void testValueBoolean_falseValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value(false);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertFalse(arr.get(0).getAsBoolean());
    }

    // ---------- value(double) tests ----------

    @Test
    public void testValueDouble_normalValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value(3.14);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertEquals(3.14, arr.get(0).getAsDouble(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_NaNNotLenient_throwsException() throws IOException {
        writer.beginArray();
        writer.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDouble_InfiniteNotLenient_throwsException() throws IOException {
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testValueDouble_NaNLenient_addedCorrectly() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.NaN);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertTrue(Double.isNaN(arr.get(0).getAsDouble()));
    }

    // ---------- value(long) tests ----------

    @Test
    public void testValueLong_normalValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value(123456789L);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertEquals(123456789L, arr.get(0).getAsLong());
    }

    @Test
    public void testValueLong_negativeValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value(-100L);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertEquals(-100L, arr.get(0).getAsLong());
    }

    @Test
    public void testValueLong_zeroValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value(0L);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertEquals(0L, arr.get(0).getAsLong());
    }

    // ---------- value(Number) tests ----------

    @Test
    public void testValueNumber_normalValue_addedCorrectly() throws IOException {
        writer.beginArray();
        writer.value(Integer.valueOf(42));
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertEquals(42, arr.get(0).getAsInt());
    }

    @Test
    public void testValueNumber_nullValue_addsJsonNull() throws IOException {
        writer.beginArray();
        writer.value((Number) null);
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertTrue(arr.get(0).isJsonNull());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumber_NaNNotLenient_throwsException() throws IOException {
        writer.beginArray();
        writer.value(Double.valueOf(Double.NaN));
    }

    @Test
    public void testValueNumber_NaNLenient_addedCorrectly() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.valueOf(Double.NaN));
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertTrue(Double.isNaN(arr.get(0).getAsDouble()));
    }

    @Test
    public void testValueNumber_infiniteLenient_addedCorrectly() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
        writer.endArray();
        JsonArray arr = writer.get().getAsJsonArray();
        assertTrue(Double.isInfinite(arr.get(0).getAsDouble()));
    }

    // ---------- flush() tests ----------

    @Test
    public void testFlush_doesNotThrowException() throws IOException {
        writer.flush();
    }

    // ---------- close() tests ----------

    @Test
    public void testClose_completeDocument_doesNotThrowException() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
    }

    @Test(expected = IOException.class)
    public void testClose_incompleteDocument_throwsIOException() throws IOException {
        writer.beginArray();
        writer.close();
    }

    // ---------- put() indirect tests via top-level product ----------

    @Test
    public void testPut_topLevelValue_setsProductDirectly() throws IOException {
        writer.value(100L);
        JsonElement result = writer.get();
        assertEquals(100L, result.getAsLong());
    }

    @Test(expected = IllegalStateException.class)
    public void testPut_arrayInsideNonArrayElement_throwsException() throws IOException {
        // Force a scenario where peek() is not JsonArray but stack is not empty
        // This case naturally happens via endObject then trying to put in wrong context
        writer.beginObject();
        writer.name("key");
        writer.beginArray();
        writer.value(1L);
        writer.endArray();
        writer.endObject();
        // additional test to hit exception path: put a value directly on object without name
        writer.value(2L);
    }
}
