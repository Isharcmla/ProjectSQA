package com.fasterxml.jackson.databind.node;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;

public class POJONodeTest {

    private final ObjectMapper mapper = new ObjectMapper();

    private static class CustomSerializable implements JsonSerializable {
        private final String value;

        public CustomSerializable(String value) {
            this.value = value;
        }

        @Override
        public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("custom:" + value);
        }

        @Override
        public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {
            serialize(gen, serializers);
        }
    }

    @Test
    public void testGetNodeType_returnsPojo() {
        POJONode node = new POJONode("test");
        assertEquals(JsonNodeType.POJO, node.getNodeType());
    }

    @Test
    public void testAsToken_returnsValueEmbeddedObject() {
        POJONode node = new POJONode("test");
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    @Test
    public void testGetPojo_returnsWrappedValue() {
        String data = "sample";
        POJONode node = new POJONode(data);
        assertSame(data, node.getPojo());

        POJONode nullNode = new POJONode(null);
        assertNull(nullNode.getPojo());
    }

    @Test
    public void testBinaryValue_withByteArray_returnsArray() throws IOException {
        byte[] expected = new byte[]{1, 2, 3, 4};
        POJONode node = new POJONode(expected);
        assertArrayEquals(expected, node.binaryValue());

        byte[] empty = new byte[0];
        POJONode emptyNode = new POJONode(empty);
        assertArrayEquals(empty, emptyNode.binaryValue());
    }

    @Test
    public void testBinaryValue_withNonByteArray_returnsSuperBinaryValue() throws IOException {
        POJONode node = new POJONode("not a byte array");
        assertNull(node.binaryValue());

        POJONode nullNode = new POJONode(null);
        assertNull(nullNode.binaryValue());
    }

    @Test
    public void testAsText_withNonNullValue_returnsStringRepresentation() {
        POJONode node = new POJONode("hello");
        assertEquals("hello", node.asText());

        POJONode emptyNode = new POJONode("");
        assertEquals("", emptyNode.asText());

        POJONode intNode = new POJONode(123);
        assertEquals("123", intNode.asText());
    }

    @Test
    public void testAsText_withNullValue_returnsNullString() {
        POJONode nullNode = new POJONode(null);
        assertEquals("null", nullNode.asText());
    }

    @Test
    public void testAsTextWithDefault_withNonNullValue_returnsStringRepresentation() {
        POJONode node = new POJONode("hello");
        assertEquals("hello", node.asText("default"));

        POJONode emptyNode = new POJONode("");
        assertEquals("", emptyNode.asText("default"));
    }

    @Test
    public void testAsTextWithDefault_withNullValue_returnsDefaultValue() {
        POJONode nullNode = new POJONode(null);
        assertEquals("default", nullNode.asText("default"));
        assertNull(nullNode.asText(null));
    }

    @Test
    public void testAsBoolean_withBooleanValue_returnsBoolean() {
        POJONode trueNode = new POJONode(Boolean.TRUE);
        assertTrue(trueNode.asBoolean(false));

        POJONode falseNode = new POJONode(Boolean.FALSE);
        assertFalse(falseNode.asBoolean(true));
    }

    @Test
    public void testAsBoolean_withNonBooleanValue_returnsDefaultValue() {
        POJONode nullNode = new POJONode(null);
        assertTrue(nullNode.asBoolean(true));
        assertFalse(nullNode.asBoolean(false));

        POJONode stringNode = new POJONode("true");
        assertTrue(stringNode.asBoolean(true));
        assertFalse(stringNode.asBoolean(false));

        POJONode intNode = new POJONode(1);
        assertTrue(intNode.asBoolean(true));
        assertFalse(intNode.asBoolean(false));
    }

    @Test
    public void testAsInt_withNumberValue_returnsInt() {
        POJONode intNode = new POJONode(Integer.valueOf(42));
        assertEquals(42, intNode.asInt(0));

        POJONode negIntNode = new POJONode(Integer.valueOf(-100));
        assertEquals(-100, negIntNode.asInt(0));

        POJONode longNode = new POJONode(Long.valueOf(1000L));
        assertEquals(1000, longNode.asInt(0));

        POJONode doubleNode = new POJONode(Double.valueOf(12.99));
        assertEquals(12, doubleNode.asInt(0));
    }

    @Test
    public void testAsInt_withNonNumberValue_returnsDefaultValue() {
        POJONode nullNode = new POJONode(null);
        assertEquals(7, nullNode.asInt(7));

        POJONode stringNode = new POJONode("42");
        assertEquals(7, stringNode.asInt(7));

        POJONode boolNode = new POJONode(Boolean.TRUE);
        assertEquals(7, boolNode.asInt(7));
    }

    @Test
    public void testAsLong_withNumberValue_returnsLong() {
        POJONode longNode = new POJONode(Long.valueOf(12345678901L));
        assertEquals(12345678901L, longNode.asLong(0L));

        POJONode negLongNode = new POJONode(Long.valueOf(-999L));
        assertEquals(-999L, negLongNode.asLong(0L));

        POJONode intNode = new POJONode(Integer.valueOf(50));
        assertEquals(50L, intNode.asLong(0L));

        POJONode doubleNode = new POJONode(Double.valueOf(50.7));
        assertEquals(50L, doubleNode.asLong(0L));
    }

    @Test
    public void testAsLong_withNonNumberValue_returnsDefaultValue() {
        POJONode nullNode = new POJONode(null);
        assertEquals(99L, nullNode.asLong(99L));

        POJONode stringNode = new POJONode("123");
        assertEquals(99L, stringNode.asLong(99L));

        POJONode boolNode = new POJONode(Boolean.FALSE);
        assertEquals(99L, boolNode.asLong(99L));
    }

    @Test
    public void testAsDouble_withNumberValue_returnsDouble() {
        POJONode doubleNode = new POJONode(Double.valueOf(3.14159));
        assertEquals(3.14159, doubleNode.asDouble(0.0), 0.00001);

        POJONode negDoubleNode = new POJONode(Double.valueOf(-2.5));
        assertEquals(-2.5, negDoubleNode.asDouble(0.0), 0.00001);

        POJONode intNode = new POJONode(Integer.valueOf(10));
        assertEquals(10.0, intNode.asDouble(0.0), 0.00001);

        POJONode longNode = new POJONode(Long.valueOf(100L));
        assertEquals(100.0, longNode.asDouble(0.0), 0.00001);
    }

    @Test
    public void testAsDouble_withNonNumberValue_returnsDefaultValue() {
        POJONode nullNode = new POJONode(null);
        assertEquals(1.23, nullNode.asDouble(1.23), 0.00001);

        POJONode stringNode = new POJONode("3.14");
        assertEquals(1.23, stringNode.asDouble(1.23), 0.00001);

        POJONode boolNode = new POJONode(Boolean.TRUE);
        assertEquals(1.23, boolNode.asDouble(1.23), 0.00001);
    }

    @Test
    public void testSerialize_withNullValue() throws IOException {
        POJONode nullNode = new POJONode(null);
        String json = mapper.writeValueAsString(nullNode);
        assertEquals("null", json);
    }

    @Test
    public void testSerialize_withJsonSerializableValue() throws IOException {
        POJONode serializableNode = new POJONode(new CustomSerializable("payload"));
        String json = mapper.writeValueAsString(serializableNode);
        assertEquals("\"custom:payload\"", json);
    }

    @Test
    public void testSerialize_withStandardObject() throws IOException {
        POJONode stringNode = new POJONode("simple text");
        String json = mapper.writeValueAsString(stringNode);
        assertEquals("\"simple text\"", json);

        POJONode intNode = new POJONode(Integer.valueOf(123));
        String intJson = mapper.writeValueAsString(intNode);
        assertEquals("123", intJson);
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        POJONode node = new POJONode("test");
        assertTrue(node.equals(node));
    }

    @Test
    public void testEquals_nullAndOtherTypes_returnsFalse() {
        POJONode node = new POJONode("test");
        assertFalse(node.equals(null));
        assertFalse(node.equals("test"));
        assertFalse(node.equals(new TextNode("test")));
    }

    @Test
    public void testEquals_nullValueComparison() {
        POJONode nullNode1 = new POJONode(null);
        POJONode nullNode2 = new POJONode(null);
        POJONode nonNullNode = new POJONode("test");

        assertTrue(nullNode1.equals(nullNode2));
        assertFalse(nullNode1.equals(nonNullNode));
        assertFalse(nonNullNode.equals(nullNode1));
    }

    @Test
    public void testEquals_nonNullValues() {
        POJONode node1 = new POJONode("test");
        POJONode node2 = new POJONode("test");
        POJONode node3 = new POJONode("other");

        assertTrue(node1.equals(node2));
        assertFalse(node1.equals(node3));
    }

    @Test
    public void testHashCode_delegatesToValueHashCode() {
        String value = "hashCodeTest";
        POJONode node = new POJONode(value);
        assertEquals(value.hashCode(), node.hashCode());

        Integer intVal = 42;
        POJONode intNode = new POJONode(intVal);
        assertEquals(intVal.hashCode(), intNode.hashCode());
    }

    @Test
    public void testToString_withByteArray() {
        byte[] bytes = new byte[]{1, 2, 3};
        POJONode node = new POJONode(bytes);
        assertEquals("(binary value of 3 bytes)", node.toString());

        POJONode emptyBytesNode = new POJONode(new byte[0]);
        assertEquals("(binary value of 0 bytes)", emptyBytesNode.toString());
    }

    @Test
    public void testToString_withRawValue() {
        RawValue raw = new RawValue("[1,2,3]");
        POJONode node = new POJONode(raw);
        assertEquals("(raw value '[1,2,3]')", node.toString());
    }

    @Test
    public void testToString_withNullValue() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.toString());
    }

    @Test
    public void testToString_withGeneralObject() {
        POJONode node = new POJONode("sample string");
        assertEquals("sample string", node.toString());

        POJONode intNode = new POJONode(12345);
        assertEquals("12345", intNode.toString());
    }
}
