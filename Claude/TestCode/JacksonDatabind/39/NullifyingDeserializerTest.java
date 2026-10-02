import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class NullifyingDeserializerTest {

    private final NullifyingDeserializer deserializer = new NullifyingDeserializer();
    private final JsonFactory factory = new JsonFactory();

    // -----------------------------------------------------------------
    // Tests for constructor / static instance (public API)
    // -----------------------------------------------------------------

    @Test
    public void testConstructor_createsInstance_notNull() {
        NullifyingDeserializer d = new NullifyingDeserializer();
        assertNotNull(d);
    }

    @Test
    public void testInstance_staticField_notNullAndCorrectType() {
        assertNotNull(NullifyingDeserializer.instance);
        assertTrue(NullifyingDeserializer.instance instanceof NullifyingDeserializer);
    }

    // -----------------------------------------------------------------
    // Tests for deserialize(JsonParser, DeserializationContext)
    // -----------------------------------------------------------------

    @Test
    public void testDeserialize_simpleObject_returnsNull() throws IOException {
        JsonParser p = factory.createParser("{\"a\":1,\"b\":2}");
        p.nextToken(); // START_OBJECT
        Object result = deserializer.deserialize(p, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_simpleArray_returnsNull() throws IOException {
        JsonParser p = factory.createParser("[1,2,3]");
        p.nextToken(); // START_ARRAY
        Object result = deserializer.deserialize(p, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_scalarValue_returnsNull() throws IOException {
        JsonParser p = factory.createParser("\"hello\"");
        p.nextToken(); // VALUE_STRING
        Object result = deserializer.deserialize(p, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_emptyObject_returnsNull() throws IOException {
        JsonParser p = factory.createParser("{}");
        p.nextToken(); // START_OBJECT
        Object result = deserializer.deserialize(p, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserialize_nestedStructure_returnsNull() throws IOException {
        JsonParser p = factory.createParser("{\"a\":[1,2,{\"b\":3}]}");
        p.nextToken(); // START_OBJECT
        Object result = deserializer.deserialize(p, null);
        assertNull(result);
        p.close();
    }

    @Test(expected = IOException.class)
    public void testDeserialize_incompleteObject_throwsIOException() throws IOException {
        // Malformed / incomplete JSON should cause skipChildren() to throw
        JsonParser p = factory.createParser("{\"a\":");
        p.nextToken(); // START_OBJECT
        try {
            deserializer.deserialize(p, null);
        } finally {
            p.close();
        }
    }

    // -----------------------------------------------------------------
    // Tests for deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)
    // -----------------------------------------------------------------

    @Test
    public void testDeserializeWithType_defaultToken_returnsNull() throws IOException {
        JsonParser p = factory.createParser("\"hello\"");
        p.nextToken(); // VALUE_STRING -> falls into default branch
        Object result = deserializer.deserializeWithType(p, null, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_numberToken_returnsNull() throws IOException {
        JsonParser p = factory.createParser("42");
        p.nextToken(); // VALUE_NUMBER_INT -> default branch
        Object result = deserializer.deserializeWithType(p, null, null);
        assertNull(result);
        p.close();
    }

    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType_startObject_callsTypeDeserializer_throwsNPE() throws IOException {
        JsonParser p = factory.createParser("{}");
        p.nextToken(); // START_OBJECT
        try {
            // typeDeserializer is null (no mocking allowed), so real call
            // to typeDeserializer.deserializeTypedFromAny(...) will NPE,
            // but this proves the branch (ID_START_OBJECT) is exercised.
            deserializer.deserializeWithType(p, null, null);
        } finally {
            p.close();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType_startArray_callsTypeDeserializer_throwsNPE() throws IOException {
        JsonParser p = factory.createParser("[1,2]");
        p.nextToken(); // START_ARRAY
        try {
            deserializer.deserializeWithType(p, null, null);
        } finally {
            p.close();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType_fieldName_callsTypeDeserializer_throwsNPE() throws IOException {
        JsonParser p = factory.createParser("{\"a\":1}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        try {
            deserializer.deserializeWithType(p, null, null);
        } finally {
            p.close();
        }
    }

    @Test
    public void testDeserializeWithType_booleanToken_returnsNull() throws IOException {
        JsonParser p = factory.createParser("true");
        p.nextToken(); // VALUE_TRUE -> default branch
        Object result = deserializer.deserializeWithType(p, null, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_nullToken_returnsNull() throws IOException {
        JsonParser p = factory.createParser("null");
        p.nextToken(); // VALUE_NULL -> default branch
        Object result = deserializer.deserializeWithType(p, null, null);
        assertNull(result);
        p.close();
    }

    @Test
    public void testDeserializeWithType_endObjectToken_returnsNull() throws IOException {
        JsonParser p = factory.createParser("{}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // END_OBJECT -> default branch (not in the switch cases)
        assertEquals(JsonToken.END_OBJECT, p.currentToken());
        Object result = deserializer.deserializeWithType(p, null, null);
        assertNull(result);
        p.close();
    }
}
