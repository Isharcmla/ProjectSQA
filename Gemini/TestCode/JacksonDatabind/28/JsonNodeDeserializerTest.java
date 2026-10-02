package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DecimalNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class JsonNodeDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testGetDeserializer_returnsCorrectInstance() {
        JsonDeserializer<? extends JsonNode> objectDeser = JsonNodeDeserializer.getDeserializer(ObjectNode.class);
        assertSame(JsonNodeDeserializer.ObjectDeserializer.getInstance(), objectDeser);

        JsonDeserializer<? extends JsonNode> arrayDeser = JsonNodeDeserializer.getDeserializer(ArrayNode.class);
        assertSame(JsonNodeDeserializer.ArrayDeserializer.getInstance(), arrayDeser);

        JsonDeserializer<? extends JsonNode> genericDeser = JsonNodeDeserializer.getDeserializer(JsonNode.class);
        assertNotNull(genericDeser);
        assertTrue(genericDeser instanceof JsonNodeDeserializer);

        JsonDeserializer<? extends JsonNode> valueDeser = JsonNodeDeserializer.getDeserializer(ValueNode.class);
        assertSame(genericDeser, valueDeser);
    }

    @Test
    public void testGetNullValue_returnsNullNode() {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonNode nullValWithCtxt = deserializer.getNullValue(ctxt);
        assertSame(NullNode.getInstance(), nullValWithCtxt);

        @SuppressWarnings("deprecation")
        JsonNode nullValDeprecated = deserializer.getNullValue();
        assertSame(NullNode.getInstance(), nullValDeprecated);
    }

    @Test
    public void testIsCachable_returnsTrue() {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testDeserialize_scalars() throws IOException {
        JsonNode strNode = mapper.readTree("\"hello world\"");
        assertTrue(strNode.isTextual());
        assertEquals("hello world", strNode.asText());

        JsonNode emptyStrNode = mapper.readTree("\"\"");
        assertTrue(emptyStrNode.isTextual());
        assertEquals("", emptyStrNode.asText());

        JsonNode trueNode = mapper.readTree("true");
        assertTrue(trueNode.isBoolean());
        assertTrue(trueNode.asBoolean());

        JsonNode falseNode = mapper.readTree("false");
        assertTrue(falseNode.isBoolean());
        assertFalse(falseNode.asBoolean());

        JsonNode nullNode = mapper.readTree("null");
        assertTrue(nullNode.isNull());

        JsonNode intNode = mapper.readTree("123");
        assertTrue(intNode.isInt());
        assertEquals(123, intNode.asInt());

        JsonNode negativeIntNode = mapper.readTree("-456");
        assertTrue(negativeIntNode.isInt());
        assertEquals(-456, negativeIntNode.asInt());

        JsonNode zeroNode = mapper.readTree("0");
        assertTrue(zeroNode.isInt());
        assertEquals(0, zeroNode.asInt());

        long largeLong = 3000000000L;
        JsonNode longNode = mapper.readTree(String.valueOf(largeLong));
        assertTrue(longNode.isLong());
        assertEquals(largeLong, longNode.asLong());

        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        JsonNode bigIntNode = mapper.readTree(bigInt.toString());
        assertTrue(bigIntNode.isBigInteger());
        assertEquals(bigInt, bigIntNode.bigIntegerValue());

        JsonNode doubleNode = mapper.readTree("12.34");
        assertTrue(doubleNode.isDouble() || doubleNode.isFloatingPointNumber());
        assertEquals(12.34, doubleNode.asDouble(), 0.0001);
    }

    @Test
    public void testDeserialize_intCoercions() throws IOException {
        ObjectMapper bigIntMapper = new ObjectMapper().enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        JsonNode n1 = bigIntMapper.readTree("10");
        assertTrue(n1.isBigInteger());

        ObjectMapper longMapper = new ObjectMapper().enable(DeserializationFeature.USE_LONG_FOR_INTS);
        JsonNode n2 = longMapper.readTree("10");
        assertTrue(n2.isLong());

        ObjectMapper bigDecMapper = new ObjectMapper().enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        JsonNode n3 = bigDecMapper.readTree("10.5");
        assertTrue(n3.isBigDecimal());
    }

    @Test
    public void testDeserialize_objectNode_emptyAndNested() throws IOException {
        JsonNode emptyObj = mapper.readTree("{}");
        assertTrue(emptyObj.isObject());
        assertEquals(0, emptyObj.size());

        String json = "{\"name\":\"Alice\",\"age\":30,\"active\":true,\"skills\":[\"Java\",\"JSON\"],\"details\":{\"id\":100}}";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isObject());
        assertEquals("Alice", node.get("name").asText());
        assertEquals(30, node.get("age").asInt());
        assertTrue(node.get("active").asBoolean());
        assertTrue(node.get("skills").isArray());
        assertEquals(2, node.get("skills").size());
        assertEquals("Java", node.get("skills").get(0).asText());
        assertEquals("JSON", node.get("skills").get(1).asText());
        assertTrue(node.get("details").isObject());
        assertEquals(100, node.get("details").get("id").asInt());
    }

    @Test
    public void testDeserialize_arrayNode_emptyAndNested() throws IOException {
        JsonNode emptyArr = mapper.readTree("[]");
        assertTrue(emptyArr.isArray());
        assertEquals(0, emptyArr.size());

        String json = "[1, \"two\", false, null, [3, 4], {\"key\":\"val\"}]";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isArray());
        assertEquals(6, node.size());
        assertEquals(1, node.get(0).asInt());
        assertEquals("two", node.get(1).asText());
        assertFalse(node.get(2).asBoolean());
        assertTrue(node.get(3).isNull());
        assertTrue(node.get(4).isArray());
        assertEquals(2, node.get(4).size());
        assertTrue(node.get(5).isObject());
        assertEquals("val", node.get(5).get("key").asText());
    }

    @Test
    public void testDeserialize_duplicateKeys_defaultOverwrites() throws IOException {
        String json = "{\"a\":1,\"a\":2}";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isObject());
        assertEquals(2, node.get("a").asInt());
    }

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_duplicateKeys_failFeatureEnabled() throws IOException {
        ObjectMapper failMapper = new ObjectMapper().enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY);
        failMapper.readTree("{\"a\":1,\"a\":2}");
    }

    @Test
    public void testDeserialize_embeddedObjects() throws IOException {
        byte[] rawBytes = new byte[]{1, 2, 3};
        RawValue rawValue = new RawValue("\"raw_val\"");
        JsonNode childNode = IntNode.valueOf(99);
        Object customPojo = new StringBuilder("customPojo");

        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeStartObject();
        tb.writeFieldName("bytes");
        tb.writeEmbeddedObject(rawBytes);
        tb.writeFieldName("raw");
        tb.writeEmbeddedObject(rawValue);
        tb.writeFieldName("node");
        tb.writeEmbeddedObject(childNode);
        tb.writeFieldName("pojo");
        tb.writeEmbeddedObject(customPojo);
        tb.writeFieldName("nullEmbedded");
        tb.writeEmbeddedObject(null);
        tb.writeEndObject();

        JsonParser p = tb.asParser();
        JsonNode node = mapper.readTree(p);
        tb.close();

        assertTrue(node.get("bytes").isBinary());
        assertArrayEquals(rawBytes, ((BinaryNode) node.get("bytes")).binaryValue());

        assertTrue(node.get("raw") != null);

        assertTrue(node.get("node").isInt());
        assertEquals(99, node.get("node").asInt());

        assertTrue(node.get("pojo") instanceof POJONode);
        assertEquals(customPojo, ((POJONode) node.get("pojo")).getPojo());

        assertTrue(node.get("nullEmbedded").isNull());
    }

    @Test
    public void testDeserialize_embeddedObjectInArray() throws IOException {
        byte[] rawBytes = new byte[]{4, 5, 6};
        TokenBuffer tb = new TokenBuffer(mapper, false);
        tb.writeStartArray();
        tb.writeEmbeddedObject(rawBytes);
        tb.writeEndArray();

        JsonParser p = tb.asParser();
        JsonNode node = mapper.readTree(p);
        tb.close();

        assertTrue(node.isArray());
        assertEquals(1, node.size());
        assertTrue(node.get(0).isBinary());
        assertArrayEquals(rawBytes, ((BinaryNode) node.get(0)).binaryValue());
    }

    @Test
    public void testObjectDeserializer_directInvocation() throws IOException {
        JsonDeserializer<? extends JsonNode> deser = JsonNodeDeserializer.getDeserializer(ObjectNode.class);

        JsonParser p1 = mapper.getFactory().createParser("{\"k\":\"v\"}");
        p1.nextToken();
        ObjectNode objNode1 = (ObjectNode) deser.deserialize(p1, mapper.getDeserializationContext());
        assertEquals("v", objNode1.get("k").asText());
        p1.close();

        JsonParser p2 = mapper.getFactory().createParser("{\"k2\":\"v2\"}");
        p2.nextToken();
        p2.nextToken();
        ObjectNode objNode2 = (ObjectNode) deser.deserialize(p2, mapper.getDeserializationContext());
        assertEquals("v2", objNode2.get("k2").asText());
        p2.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testObjectDeserializer_invalidToken_throwsException() throws IOException {
        JsonDeserializer<? extends JsonNode> deser = JsonNodeDeserializer.getDeserializer(ObjectNode.class);
        JsonParser p = mapper.getFactory().createParser("[1, 2, 3]");
        p.nextToken();
        deser.deserialize(p, mapper.getDeserializationContext());
    }

    @Test
    public void testArrayDeserializer_directInvocation() throws IOException {
        JsonDeserializer<? extends JsonNode> deser = JsonNodeDeserializer.getDeserializer(ArrayNode.class);

        JsonParser p = mapper.getFactory().createParser("[10, 20]");
        p.nextToken();
        ArrayNode arrNode = (ArrayNode) deser.deserialize(p, mapper.getDeserializationContext());
        assertEquals(2, arrNode.size());
        assertEquals(10, arrNode.get(0).asInt());
        assertEquals(20, arrNode.get(1).asInt());
        p.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testArrayDeserializer_invalidToken_throwsException() throws IOException {
        JsonDeserializer<? extends JsonNode> deser = JsonNodeDeserializer.getDeserializer(ArrayNode.class);
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        p.nextToken();
        deser.deserialize(p, mapper.getDeserializationContext());
    }

    public static class PolymorphicWrapper {
        public Object node;
    }

    @Test
    public void testDeserializeWithType_polymorphicSupport() throws IOException {
        ObjectMapper polyMapper = new ObjectMapper();
        polyMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);

        PolymorphicWrapper wrapper = new PolymorphicWrapper();
        wrapper.node = mapper.createObjectNode().put("testKey", "testVal");

        String json = polyMapper.writeValueAsString(wrapper);
        PolymorphicWrapper result = polyMapper.readValue(json, PolymorphicWrapper.class);

        assertNotNull(result);
        assertTrue(result.node instanceof ObjectNode);
        assertEquals("testVal", ((ObjectNode) result.node).get("testKey").asText());
    }

    @Test
    public void testDeserializeAny_unexpectedToken_throwsException() throws IOException {
        JsonNodeDeserializer deser = new JsonNodeDeserializer();
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        p.nextToken(); // VALUE_NUMBER_INT
        p.nextToken(); // END_OBJECT

        try {
            deser.deserialize(p, mapper.getDeserializationContext());
            fail("Expected JsonMappingException for unexpected END_OBJECT token in deserializeAny");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        } finally {
            p.close();
        }
    }
}
