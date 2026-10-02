package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.DecimalNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class JsonNodeDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------
    // getDeserializer(Class<?>) tests
    // ---------------------------------------------------------

    @Test
    public void testGetDeserializer_ObjectNodeClass_returnsNonNullDeserializer() {
        JsonDeserializer<? extends JsonNode> deser = JsonNodeDeserializer.getDeserializer(ObjectNode.class);
        assertNotNull(deser);
    }

    @Test
    public void testGetDeserializer_ArrayNodeClass_returnsNonNullDeserializer() {
        JsonDeserializer<? extends JsonNode> deser = JsonNodeDeserializer.getDeserializer(ArrayNode.class);
        assertNotNull(deser);
    }

    @Test
    public void testGetDeserializer_OtherNodeClass_returnsGenericInstance() {
        JsonDeserializer<? extends JsonNode> deser1 = JsonNodeDeserializer.getDeserializer(JsonNode.class);
        JsonDeserializer<? extends JsonNode> deser2 = JsonNodeDeserializer.getDeserializer(TextNode.class);
        assertNotNull(deser1);
        assertNotNull(deser2);
        // both should be same singleton generic instance
        assertSame(deser1, deser2);
    }

    // ---------------------------------------------------------
    // getNullValue tests
    // ---------------------------------------------------------

    @Test
    public void testGetNullValueWithContext_viaReadValue_returnsNullNode() throws IOException {
        JsonNode node = mapper.readValue("null", JsonNode.class);
        assertTrue(node.isNull());
        assertSame(NullNode.getInstance(), node);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetNullValueDeprecated_returnsNullNode() {
        JsonDeserializer<? extends JsonNode> deser = JsonNodeDeserializer.getDeserializer(JsonNode.class);
        JsonNode node = deser.getNullValue();
        assertNotNull(node);
        assertTrue(node.isNull());
    }

    // ---------------------------------------------------------
    // deserialize(...) - generic entry point tests
    // ---------------------------------------------------------

    @Test
    public void testDeserialize_ObjectToken_returnsObjectNode() throws IOException {
        JsonNode node = mapper.readTree("{\"a\":1}");
        assertTrue(node.isObject());
        assertEquals(1, node.get("a").asInt());
    }

    @Test
    public void testDeserialize_ArrayToken_returnsArrayNode() throws IOException {
        JsonNode node = mapper.readTree("[1,2,3]");
        assertTrue(node.isArray());
        assertEquals(3, node.size());
    }

    @Test
    public void testDeserialize_ScalarString_returnsTextNode() throws IOException {
        JsonNode node = mapper.readTree("\"hello\"");
        assertTrue(node.isTextual());
        assertEquals("hello", node.asText());
    }

    @Test
    public void testDeserialize_ScalarBooleanTrue_returnsBooleanNode() throws IOException {
        JsonNode node = mapper.readTree("true");
        assertTrue(node.isBoolean());
        assertTrue(node.asBoolean());
    }

    @Test
    public void testDeserialize_ScalarBooleanFalse_returnsBooleanNode() throws IOException {
        JsonNode node = mapper.readTree("false");
        assertTrue(node.isBoolean());
        assertFalse(node.asBoolean());
    }

    @Test
    public void testDeserialize_ScalarNull_returnsNullNode() throws IOException {
        JsonNode node = mapper.readTree("null");
        assertTrue(node.isNull());
    }

    // ---------------------------------------------------------
    // deserializeObject tests
    // ---------------------------------------------------------

    @Test
    public void testDeserializeObject_EmptyObject_returnsEmptyObjectNode() throws IOException {
        JsonNode node = mapper.readTree("{}");
        assertTrue(node.isObject());
        assertEquals(0, node.size());
    }

    @Test
    public void testDeserializeObject_NestedObjectAndArray_returnsCorrectStructure() throws IOException {
        String json = "{\"obj\":{\"x\":1},\"arr\":[1,2],\"str\":\"s\",\"b\":true,\"f\":false,\"n\":null}";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.get("obj").isObject());
        assertEquals(1, node.get("obj").get("x").asInt());
        assertTrue(node.get("arr").isArray());
        assertEquals(2, node.get("arr").size());
        assertEquals("s", node.get("str").asText());
        assertTrue(node.get("b").asBoolean());
        assertFalse(node.get("f").asBoolean());
        assertTrue(node.get("n").isNull());
    }

    @Test
    public void testDeserializeObject_DuplicateField_lastValueWinsByDefault() throws IOException {
        JsonNode node = mapper.readTree("{\"a\":1,\"a\":2}");
        assertEquals(2, node.get("a").asInt());
    }

    @Test
    public void testDeserializeObject_DuplicateField_withFailOnDupEnabled_throwsException() {
        ObjectMapper strictMapper = new ObjectMapper();
        strictMapper.configure(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY, true);
        try {
            strictMapper.readTree("{\"a\":1,\"a\":2}");
            fail("Expected JsonProcessingException due to duplicate field");
        } catch (JsonProcessingException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException type: " + e);
        }
    }

    @Test
    public void testDeserializeObject_InvalidStartToken_throwsMappingException() {
        try {
            mapper.readValue("123", ObjectNode.class);
            fail("Expected exception for wrong token type");
        } catch (IOException e) {
            // expected
        }
    }

    // ---------------------------------------------------------
    // deserializeArray tests
    // ---------------------------------------------------------

    @Test
    public void testDeserializeArray_EmptyArray_returnsEmptyArrayNode() throws IOException {
        JsonNode node = mapper.readTree("[]");
        assertTrue(node.isArray());
        assertEquals(0, node.size());
    }

    @Test
    public void testDeserializeArray_NestedStructures_returnsCorrectStructure() throws IOException {
        String json = "[{\"a\":1},[1,2],\"s\",1,true,false,null]";
        JsonNode node = mapper.readTree(json);
        assertEquals(7, node.size());
        assertTrue(node.get(0).isObject());
        assertTrue(node.get(1).isArray());
        assertEquals("s", node.get(2).asText());
        assertEquals(1, node.get(3).asInt());
        assertTrue(node.get(4).asBoolean());
        assertFalse(node.get(5).asBoolean());
        assertTrue(node.get(6).isNull());
    }

    @Test
    public void testDeserializeArray_UnexpectedEndOfInput_throwsException() {
        try {
            mapper.readTree("[1,2,3");
            fail("Expected exception for unexpected end of input");
        } catch (IOException e) {
            // expected - either JsonMappingException (custom) or JsonParseException/EOF
        }
    }

    @Test
    public void testDeserializeArray_InvalidStartToken_throwsMappingException() {
        try {
            mapper.readValue("123", ArrayNode.class);
            fail("Expected exception for wrong token type");
        } catch (IOException e) {
            // expected
        }
    }

    // ---------------------------------------------------------
    // _fromInt tests (via number parsing with different features)
    // ---------------------------------------------------------

    @Test
    public void testFromInt_SmallInteger_returnsIntNode() throws IOException {
        JsonNode node = mapper.readTree("123");
        assertTrue(node instanceof IntNode);
        assertEquals(123, node.asInt());
    }

    @Test
    public void testFromInt_NegativeInteger_returnsIntNode() throws IOException {
        JsonNode node = mapper.readTree("-123");
        assertTrue(node instanceof IntNode);
        assertEquals(-123, node.asInt());
    }

    @Test
    public void testFromInt_VeryLargeNumber_returnsBigIntegerNode() throws IOException {
        String bigNum = "123456789012345678901234567890";
        JsonNode node = mapper.readTree(bigNum);
        assertTrue(node instanceof BigIntegerNode);
        assertEquals(new BigInteger(bigNum), node.bigIntegerValue());
    }

    @Test
    public void testFromInt_WithUseLongForIntsEnabled_returnsLongNode() throws IOException {
        ObjectMapper longMapper = new ObjectMapper();
        longMapper.configure(DeserializationFeature.USE_LONG_FOR_INTS, true);
        JsonNode node = longMapper.readTree("123");
        assertTrue(node instanceof LongNode);
        assertEquals(123L, node.asLong());
    }

    @Test
    public void testFromInt_WithUseBigIntegerForIntsEnabled_returnsBigIntegerNode() throws IOException {
        ObjectMapper bigIntMapper = new ObjectMapper();
        bigIntMapper.configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true);
        JsonNode node = bigIntMapper.readTree("123");
        assertTrue(node instanceof BigIntegerNode);
        assertEquals(BigInteger.valueOf(123), node.bigIntegerValue());
    }

    // ---------------------------------------------------------
    // _fromFloat tests
    // ---------------------------------------------------------

    @Test
    public void testFromFloat_DefaultBehavior_returnsDoubleNode() throws IOException {
        JsonNode node = mapper.readTree("1.5");
        assertTrue(node instanceof DoubleNode);
        assertEquals(1.5, node.asDouble(), 0.0001);
    }

    @Test
    public void testFromFloat_WithUseBigDecimalEnabled_returnsDecimalNode() throws IOException {
        ObjectMapper decimalMapper = new ObjectMapper();
        decimalMapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        JsonNode node = decimalMapper.readTree("1.5");
        assertTrue(node instanceof DecimalNode);
    }

    @Test
    public void testFromFloat_ZeroValue_returnsDoubleNode() throws IOException {
        JsonNode node = mapper.readTree("0.0");
        assertTrue(node instanceof DoubleNode);
        assertEquals(0.0, node.asDouble(), 0.0001);
    }

    // ---------------------------------------------------------
    // _fromEmbedded tests via TokenBuffer
    // ---------------------------------------------------------

    @Test
    public void testFromEmbedded_ByteArray_returnsBinaryNode() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartObject();
        buf.writeFieldName("bin");
        buf.writeBinary(new byte[]{1, 2, 3});
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        JsonNode node = mapper.readValue(p, JsonNode.class);
        assertTrue(node.get("bin") instanceof BinaryNode);
        assertTrue(Arrays.equals(new byte[]{1, 2, 3}, node.get("bin").binaryValue()));
        p.close();
        buf.close();
    }

    @Test
    public void testFromEmbedded_NullObject_returnsNullNode() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(null);
        JsonParser p = buf.asParser();
        p.nextToken();
        JsonNode node = mapper.readValue(p, JsonNode.class);
        assertTrue(node.isNull());
        p.close();
        buf.close();
    }

    @Test
    public void testFromEmbedded_JsonNodeInstance_returnsSameNode() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(TextNode.valueOf("embedded-text"));
        JsonParser p = buf.asParser();
        p.nextToken();
        JsonNode node = mapper.readValue(p, JsonNode.class);
        assertEquals("embedded-text", node.asText());
        p.close();
        buf.close();
    }

    @Test
    public void testFromEmbedded_RawValueInstance_returnsNonNullNode() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        RawValue raw = new RawValue("raw-content");
        buf.writeEmbeddedObject(raw);
        JsonParser p = buf.asParser();
        p.nextToken();
        JsonNode node = mapper.readValue(p, JsonNode.class);
        assertNotNull(node);
        p.close();
        buf.close();
    }

    @Test
    public void testFromEmbedded_ArbitraryPojo_returnsPojoNode() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeEmbeddedObject(new Date(0));
        JsonParser p = buf.asParser();
        p.nextToken();
        JsonNode node = mapper.readValue(p, JsonNode.class);
        assertTrue(node instanceof POJONode);
        p.close();
        buf.close();
    }

    // ---------------------------------------------------------
    // ObjectDeserializer / ArrayDeserializer (via typed readValue)
    // ---------------------------------------------------------

    @Test
    public void testObjectDeserializer_deserialize_viaTypedReadValue_returnsObjectNode() throws IOException {
        ObjectNode node = mapper.readValue("{\"k\":\"v\"}", ObjectNode.class);
        assertNotNull(node);
        assertEquals("v", node.get("k").asText());
    }

    @Test
    public void testObjectDeserializer_deserialize_EmptyObject_returnsEmptyObjectNode() throws IOException {
        ObjectNode node = mapper.readValue("{}", ObjectNode.class);
        assertNotNull(node);
        assertEquals(0, node.size());
    }

    @Test
    public void testArrayDeserializer_deserialize_viaTypedReadValue_returnsArrayNode() throws IOException {
        ArrayNode node = mapper.readValue("[1,2,3]", ArrayNode.class);
        assertNotNull(node);
        assertEquals(3, node.size());
    }

    @Test
    public void testArrayDeserializer_deserialize_EmptyArray_returnsEmptyArrayNode() throws IOException {
        ArrayNode node = mapper.readValue("[]", ArrayNode.class);
        assertNotNull(node);
        assertEquals(0, node.size());
    }

    // ---------------------------------------------------------
    // deserializeAny via field-name-positioned / embedded-in-array edge cases
    // ---------------------------------------------------------

    @Test
    public void testDeserializeArray_EmbeddedObjectElement_doesNotCrash() throws IOException {
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeStartArray();
        buf.writeEmbeddedObject(new byte[]{9, 8, 7});
        buf.writeEndArray();
        JsonParser p = buf.asParser();
        p.nextToken();
        JsonNode node = mapper.readValue(p, JsonNode.class);
        assertTrue(node.isArray());
        assertTrue(node.size() >= 1);
        p.close();
        buf.close();
    }

    @Test
    public void testDeserializeObject_StringValue_returnsTextNode() throws IOException {
        JsonNode node = mapper.readTree("{\"s\":\"hello world\"}");
        assertEquals("hello world", node.get("s").asText());
    }

    @Test
    public void testDeserializeObject_EmptyStringValue_returnsEmptyTextNode() throws IOException {
        JsonNode node = mapper.readTree("{\"s\":\"\"}");
        assertEquals("", node.get("s").asText());
    }
}
