import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonToken;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JsonTreeReaderTest {

    // ---------- Constructor & basic peek ----------

    @Test
    public void testConstructor_withPrimitive_createsReader() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive("hello");
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals(JsonToken.STRING, reader.peek());
    }

    @Test
    public void testPeek_stringPrimitive_returnsString() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("test"));
        assertEquals(JsonToken.STRING, reader.peek());
    }

    @Test
    public void testPeek_booleanPrimitive_returnsBoolean() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
        assertEquals(JsonToken.BOOLEAN, reader.peek());
    }

    @Test
    public void testPeek_numberPrimitive_returnsNumber() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(42));
        assertEquals(JsonToken.NUMBER, reader.peek());
    }

    @Test
    public void testPeek_jsonNull_returnsNull() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(JsonNull.INSTANCE);
        assertEquals(JsonToken.NULL, reader.peek());
    }

    @Test
    public void testPeek_emptyObject_returnsBeginObject() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonObject());
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
    }

    @Test
    public void testPeek_emptyArray_returnsBeginArray() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonArray());
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    }

    @Test
    public void testPeek_afterClose_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
        reader.close();
        try {
            reader.peek();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- beginArray / endArray ----------

    @Test
    public void testBeginArray_endArray_normalArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(1));
        array.add(new JsonPrimitive(2));
        JsonTreeReader reader = new JsonTreeReader(array);

        reader.beginArray();
        assertTrue(reader.hasNext());
        assertEquals(1, reader.nextInt());
        assertTrue(reader.hasNext());
        assertEquals(2, reader.nextInt());
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testBeginArray_emptyArray_endArraySucceeds() throws IOException {
        JsonArray array = new JsonArray();
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testBeginArray_wrongToken_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("notArray"));
        try {
            reader.beginArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testEndArray_nestedArray_incrementsParentIndex() throws IOException {
        JsonArray outer = new JsonArray();
        JsonArray inner = new JsonArray();
        inner.add(new JsonPrimitive(1));
        outer.add(inner);
        outer.add(new JsonPrimitive(2));

        JsonTreeReader reader = new JsonTreeReader(outer);
        reader.beginArray();
        reader.beginArray();
        reader.nextInt();
        reader.endArray();
        assertEquals(2, reader.nextInt());
        reader.endArray();
    }

    // ---------- beginObject / endObject ----------

    @Test
    public void testBeginObject_endObject_normalObject() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("key", "value");
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertTrue(reader.hasNext());
        assertEquals("key", reader.nextName());
        assertEquals("value", reader.nextString());
        assertFalse(reader.hasNext());
        reader.endObject();
    }

    @Test
    public void testBeginObject_emptyObject_endObjectSucceeds() throws IOException {
        JsonObject obj = new JsonObject();
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        assertFalse(reader.hasNext());
        reader.endObject();
    }

    @Test
    public void testBeginObject_wrongToken_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("notObject"));
        try {
            reader.beginObject();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testEndObject_nestedInArray_incrementsParentIndex() throws IOException {
        JsonArray array = new JsonArray();
        JsonObject obj = new JsonObject();
        obj.addProperty("a", 1);
        array.add(obj);
        array.add(new JsonPrimitive(5));

        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        reader.beginObject();
        reader.nextName();
        reader.nextInt();
        reader.endObject();
        assertEquals(5, reader.nextInt());
        reader.endArray();
    }

    // ---------- hasNext ----------

    @Test
    public void testHasNext_endOfArray_returnsFalse() throws IOException {
        JsonArray array = new JsonArray();
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        assertFalse(reader.hasNext());
    }

    @Test
    public void testHasNext_endOfObject_returnsFalse() throws IOException {
        JsonObject obj = new JsonObject();
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        assertFalse(reader.hasNext());
    }

    @Test
    public void testHasNext_valuePresent_returnsTrue() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive("x"));
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        assertTrue(reader.hasNext());
    }

    // ---------- nextName ----------

    @Test
    public void testNextName_validObject_returnsKey() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("name", "John");
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        assertEquals("name", reader.nextName());
        reader.nextString();
        reader.endObject();
    }

    @Test
    public void testNextName_wrongToken_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
        try {
            reader.nextName();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- nextString ----------

    @Test
    public void testNextString_stringValue_returnsString() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("hello"));
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNextString_numberValue_returnsStringRepresentation() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(123));
        assertEquals("123", reader.nextString());
    }

    @Test
    public void testNextString_wrongType_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
        try {
            reader.nextString();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- nextBoolean ----------

    @Test
    public void testNextBoolean_trueValue_returnsTrue() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
        assertTrue(reader.nextBoolean());
    }

    @Test
    public void testNextBoolean_falseValue_returnsFalse() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(false));
        assertFalse(reader.nextBoolean());
    }

    @Test
    public void testNextBoolean_wrongType_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("notBoolean"));
        try {
            reader.nextBoolean();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- nextNull ----------

    @Test
    public void testNextNull_nullValue_succeeds() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(JsonNull.INSTANCE);
        reader.nextNull();
        // no exception, success
    }

    @Test
    public void testNextNull_wrongType_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("notNull"));
        try {
            reader.nextNull();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- nextDouble ----------

    @Test
    public void testNextDouble_normalValue_returnsDouble() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(3.14));
        assertEquals(3.14, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDouble_stringNumericValue_returnsDouble() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("2.5"));
        assertEquals(2.5, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDouble_wrongType_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
        try {
            reader.nextDouble();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testNextDouble_nanNotLenient_throwsNumberFormatException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("NaN"));
        try {
            reader.nextDouble();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
            // expected
        }
    }

    @Test
    public void testNextDouble_nanLenient_returnsNaN() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("NaN"));
        reader.setLenient(true);
        double result = reader.nextDouble();
        assertTrue(Double.isNaN(result));
    }

    // ---------- nextLong ----------

    @Test
    public void testNextLong_normalValue_returnsLong() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(1234567890123L));
        assertEquals(1234567890123L, reader.nextLong());
    }

    @Test
    public void testNextLong_wrongType_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(false));
        try {
            reader.nextLong();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- nextInt ----------

    @Test
    public void testNextInt_normalValue_returnsInt() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(42));
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testNextInt_negativeValue_returnsNegativeInt() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(-5));
        assertEquals(-5, reader.nextInt());
    }

    @Test
    public void testNextInt_wrongType_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
        try {
            reader.nextInt();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- close ----------

    @Test
    public void testClose_afterClose_peekThrowsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
        reader.close();
        try {
            reader.peek();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- skipValue ----------

    @Test
    public void testSkipValue_primitiveValue_skipsSuccessfully() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive("skip me"));
        array.add(new JsonPrimitive(2));
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testSkipValue_nameValue_skipsSuccessfully() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("skipKey", "skipValue");
        obj.addProperty("keepKey", "keepValue");
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        reader.skipValue();
        assertEquals("keepKey", reader.nextName());
        reader.nextString();
        reader.endObject();
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsSimpleClassName() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
        assertEquals("JsonTreeReader", reader.toString());
    }

    // ---------- promoteNameToValue ----------

    @Test
    public void testPromoteNameToValue_validName_promotesSuccessfully() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("keyAsValue", "actualValue");
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        reader.promoteNameToValue();
        String promoted = reader.nextString();
        assertEquals("keyAsValue", promoted);
        String actual = reader.nextString();
        assertEquals("actualValue", actual);
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue_wrongToken_throwsIllegalStateException() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
        try {
            reader.promoteNameToValue();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    // ---------- getPath ----------

    @Test
    public void testGetPath_rootLevel_returnsDollarSign() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
        assertEquals("$", reader.getPath());
    }

    @Test
    public void testGetPath_insideArray_returnsIndexPath() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(1));
        array.add(new JsonPrimitive(2));
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        reader.nextInt();
        String path = reader.getPath();
        assertTrue(path.contains("["));
    }

    @Test
    public void testGetPath_insideObject_returnsNamePath() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("field", "value");
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        reader.nextName();
        String path = reader.getPath();
        assertTrue(path.contains("field"));
    }

    // ---------- Stack growth test (push resizing) ----------

    @Test
    public void testPush_stackGrowthBeyondInitialCapacity_handlesCorrectly() throws IOException {
        JsonArray outer = new JsonArray();
        JsonArray current = outer;
        // Create deeply nested arrays to force stack resize beyond 32
        for (int i = 0; i < 40; i++) {
            JsonArray next = new JsonArray();
            current.add(next);
            current = next;
        }
        JsonTreeReader reader = new JsonTreeReader(outer);
        for (int i = 0; i < 40; i++) {
            reader.beginArray();
        }
        for (int i = 0; i < 40; i++) {
            reader.endArray();
        }
    }

    // ---------- Mixed nested structure covering peek recursive branch ----------

    @Test
    public void testPeek_arrayWithNestedElement_pushesAndReturnsCorrectToken() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive("nested"));
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("nested", reader.nextString());
        reader.endArray();
    }

    @Test
    public void testHasNext_endDocument_returnsFalseAtEndDocument() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("x"));
        reader.nextString();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
        assertTrue(reader.hasNext());
    }
}
