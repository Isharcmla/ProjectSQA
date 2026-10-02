package com.fasterxml.jackson.databind.node;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.RawValue;

public class POJONodeTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------- getNodeType ----------

    @Test
    public void testGetNodeType_returnsPOJO() {
        POJONode node = new POJONode("someValue");
        assertEquals(JsonNodeType.POJO, node.getNodeType());
    }

    // ---------- asToken ----------

    @Test
    public void testAsToken_returnsValueEmbeddedObject() {
        POJONode node = new POJONode("someValue");
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    // ---------- binaryValue ----------

    @Test
    public void testBinaryValue_byteArrayValue_returnsSameArray() throws IOException {
        byte[] data = new byte[]{1, 2, 3};
        POJONode node = new POJONode(data);
        byte[] result = node.binaryValue();
        assertArrayEquals(data, result);
    }

    @Test
    public void testBinaryValue_nonByteArrayValue_returnsNull() throws IOException {
        POJONode node = new POJONode("notBinary");
        byte[] result = node.binaryValue();
        assertNull(result);
    }

    // ---------- asText ----------

    @Test
    public void testAsText_nullValue_returnsNullString() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.asText());
    }

    @Test
    public void testAsText_nonNullValue_returnsToString() {
        POJONode node = new POJONode(123);
        assertEquals("123", node.asText());
    }

    // ---------- asText(defaultValue) ----------

    @Test
    public void testAsTextWithDefault_nullValue_returnsDefault() {
        POJONode node = new POJONode(null);
        assertEquals("defaultVal", node.asText("defaultVal"));
    }

    @Test
    public void testAsTextWithDefault_nonNullValue_returnsToString() {
        POJONode node = new POJONode("hello");
        assertEquals("hello", node.asText("defaultVal"));
    }

    // ---------- asBoolean ----------

    @Test
    public void testAsBoolean_trueValue_returnsTrue() {
        POJONode node = new POJONode(Boolean.TRUE);
        assertTrue(node.asBoolean(false));
    }

    @Test
    public void testAsBoolean_falseValue_returnsFalse() {
        POJONode node = new POJONode(Boolean.FALSE);
        assertFalse(node.asBoolean(true));
    }

    @Test
    public void testAsBoolean_nonBooleanValue_returnsDefault() {
        POJONode node = new POJONode("notBoolean");
        assertTrue(node.asBoolean(true));
        assertFalse(node.asBoolean(false));
    }

    @Test
    public void testAsBoolean_nullValue_returnsDefault() {
        POJONode node = new POJONode(null);
        assertTrue(node.asBoolean(true));
    }

    // ---------- asInt ----------

    @Test
    public void testAsInt_numberValue_returnsIntValue() {
        POJONode node = new POJONode(Integer.valueOf(42));
        assertEquals(42, node.asInt(-1));
    }

    @Test
    public void testAsInt_nonNumberValue_returnsDefault() {
        POJONode node = new POJONode("notNumber");
        assertEquals(-1, node.asInt(-1));
    }

    @Test
    public void testAsInt_negativeNumberValue_returnsNegativeInt() {
        POJONode node = new POJONode(Integer.valueOf(-99));
        assertEquals(-99, node.asInt(0));
    }

    // ---------- asLong ----------

    @Test
    public void testAsLong_numberValue_returnsLongValue() {
        POJONode node = new POJONode(Long.valueOf(123456789L));
        assertEquals(123456789L, node.asLong(-1L));
    }

    @Test
    public void testAsLong_nonNumberValue_returnsDefault() {
        POJONode node = new POJONode("notNumber");
        assertEquals(-1L, node.asLong(-1L));
    }

    // ---------- asDouble ----------

    @Test
    public void testAsDouble_numberValue_returnsDoubleValue() {
        POJONode node = new POJONode(Double.valueOf(3.14));
        assertEquals(3.14, node.asDouble(-1.0), 0.0001);
    }

    @Test
    public void testAsDouble_nonNumberValue_returnsDefault() {
        POJONode node = new POJONode("notNumber");
        assertEquals(-1.0, node.asDouble(-1.0), 0.0001);
    }

    // ---------- serialize ----------

    @Test
    public void testSerialize_nullValue_writesNull() throws IOException {
        POJONode node = new POJONode(null);
        String json = mapper.writeValueAsString(node);
        assertEquals("null", json);
    }

    @Test
    public void testSerialize_jsonSerializableValue_delegatesToValue() throws IOException {
        // IntNode implements JsonSerializable via JsonNode
        JsonNode inner = IntNode.valueOf(99);
        POJONode node = new POJONode(inner);
        String json = mapper.writeValueAsString(node);
        assertEquals("99", json);
    }

    @Test
    public void testSerialize_normalPojo_writesObject() throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", "value");
        POJONode node = new POJONode(map);
        String json = mapper.writeValueAsString(node);
        assertTrue(json.contains("key"));
        assertTrue(json.contains("value"));
    }

    @Test
    public void testSerialize_stringPojo_writesQuotedString() throws IOException {
        POJONode node = new POJONode("plainString");
        String json = mapper.writeValueAsString(node);
        assertEquals("\"plainString\"", json);
    }

    // ---------- getPojo ----------

    @Test
    public void testGetPojo_returnsWrappedValue() {
        Object value = new Object();
        POJONode node = new POJONode(value);
        assertSame(value, node.getPojo());
    }

    @Test
    public void testGetPojo_nullValue_returnsNull() {
        POJONode node = new POJONode(null);
        assertNull(node.getPojo());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        POJONode node = new POJONode("value");
        assertTrue(node.equals(node));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        POJONode node = new POJONode("value");
        assertFalse(node.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        POJONode node = new POJONode("value");
        assertFalse(node.equals("value"));
    }

    @Test
    public void testEquals_samePojoValue_returnsTrue() {
        POJONode node1 = new POJONode("sameValue");
        POJONode node2 = new POJONode("sameValue");
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEquals_differentPojoValue_returnsFalse() {
        POJONode node1 = new POJONode("value1");
        POJONode node2 = new POJONode("value2");
        assertFalse(node1.equals(node2));
    }

    @Test
    public void testEquals_bothNullValues_returnsTrue() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(null);
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEquals_oneNullValueOtherNonNull_returnsFalse() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode("value");
        assertFalse(node1.equals(node2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_nonNullValue_returnsValueHashCode() {
        String value = "hashMe";
        POJONode node = new POJONode(value);
        assertEquals(value.hashCode(), node.hashCode());
    }

    @Test(expected = NullPointerException.class)
    public void testHashCode_nullValue_throwsNullPointerException() {
        POJONode node = new POJONode(null);
        node.hashCode();
    }

    // ---------- toString ----------

    @Test
    public void testToString_byteArrayValue_returnsBinaryDescription() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        POJONode node = new POJONode(data);
        assertEquals("(binary value of 5 bytes)", node.toString());
    }

    @Test
    public void testToString_rawValue_returnsRawValueDescription() {
        RawValue rawValue = new RawValue("rawContent");
        POJONode node = new POJONode(rawValue);
        String result = node.toString();
        assertTrue(result.startsWith("(raw value '"));
        assertTrue(result.contains("rawContent"));
    }

    @Test
    public void testToString_normalValue_returnsValueString() {
        POJONode node = new POJONode(12345);
        assertEquals("12345", node.toString());
    }

    @Test
    public void testToString_nullValue_returnsNullString() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.toString());
    }
}
