package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.*;

import static org.junit.Assert.*;

public class ObjectNodeTest {

    private JsonNodeFactory factory;
    private ObjectNode objectNode;

    @Before
    public void setUp() {
        factory = JsonNodeFactory.instance;
        objectNode = new ObjectNode(factory);
    }

    @Test
    public void testConstructors() {
        ObjectNode node1 = new ObjectNode(factory);
        assertEquals(0, node1.size());

        Map<String, JsonNode> map = new HashMap<String, JsonNode>();
        map.put("k1", new TextNode("v1"));
        ObjectNode node2 = new ObjectNode(factory, map);
        assertEquals(1, node2.size());
        assertEquals("v1", node2.get("k1").asText());
    }

    @Test
    public void testNodeTypeAndToken() {
        assertEquals(JsonNodeType.OBJECT, objectNode.getNodeType());
        assertEquals(JsonToken.START_OBJECT, objectNode.asToken());
    }

    @Test
    public void testSizeAndElements() {
        assertEquals(0, objectNode.size());
        assertFalse(objectNode.elements().hasNext());

        objectNode.put("a", 1);
        objectNode.put("b", 2);
        assertEquals(2, objectNode.size());

        Iterator<JsonNode> elements = objectNode.elements();
        assertTrue(elements.hasNext());
        assertEquals(1, elements.next().asInt());
        assertEquals(2, elements.next().asInt());
        assertFalse(elements.hasNext());
    }

    @Test
    public void testGetAndPath() {
        assertNull(objectNode.get(0));
        assertNull(objectNode.get("missing"));
        assertTrue(objectNode.path(0).isMissingNode());
        assertTrue(objectNode.path("missing").isMissingNode());

        objectNode.put("name", "jackson");
        assertEquals("jackson", objectNode.get("name").asText());
        assertEquals("jackson", objectNode.path("name").asText());
    }

    @Test
    public void testFieldNamesAndFields() {
        objectNode.put("k1", "v1").put("k2", "v2");

        Iterator<String> names = objectNode.fieldNames();
        assertTrue(names.hasNext());
        assertEquals("k1", names.next());
        assertEquals("k2", names.next());
        assertFalse(names.hasNext());

        Iterator<Map.Entry<String, JsonNode>> fields = objectNode.fields();
        assertTrue(fields.hasNext());
        Map.Entry<String, JsonNode> entry1 = fields.next();
        assertEquals("k1", entry1.getKey());
        assertEquals("v1", entry1.getValue().asText());
        Map.Entry<String, JsonNode> entry2 = fields.next();
        assertEquals("k2", entry2.getKey());
        assertEquals("v2", entry2.getValue().asText());
        assertFalse(fields.hasNext());
    }

    @Test
    public void testAtPointer() {
        objectNode.put("a", "valA");
        JsonPointer ptr = JsonPointer.compile("/a");
        JsonNode result = objectNode._at(ptr);
        assertNotNull(result);
        assertEquals("valA", result.asText());

        JsonPointer missingPtr = JsonPointer.compile("/missing");
        assertNull(objectNode._at(missingPtr));
    }

    @Test
    public void testDeepCopy() {
        objectNode.put("name", "original");
        ObjectNode child = objectNode.putObject("child");
        child.put("subKey", "subVal");

        ObjectNode copy = objectNode.deepCopy();
        assertNotSame(objectNode, copy);
        assertEquals(objectNode, copy);

        copy.put("name", "modified");
        ((ObjectNode) copy.get("child")).put("subKey", "subValModified");

        assertEquals("original", objectNode.get("name").asText());
        assertEquals("subVal", objectNode.get("child").get("subKey").asText());
    }

    @Test
    public void testWith_successNew() {
        ObjectNode child = objectNode.with("child");
        assertNotNull(child);
        assertTrue(objectNode.get("child").isObject());
    }

    @Test
    public void testWith_successExisting() {
        ObjectNode child1 = objectNode.with("child");
        ObjectNode child2 = objectNode.with("child");
        assertSame(child1, child2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWith_failureNotObject() {
        objectNode.put("textProp", "stringValue");
        objectNode.with("textProp");
    }

    @Test
    public void testWithArray_successNew() {
        ArrayNode arr = objectNode.withArray("arr");
        assertNotNull(arr);
        assertTrue(objectNode.get("arr").isArray());
    }

    @Test
    public void testWithArray_successExisting() {
        ArrayNode arr1 = objectNode.withArray("arr");
        ArrayNode arr2 = objectNode.withArray("arr");
        assertSame(arr1, arr2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithArray_failureNotArray() {
        objectNode.put("objProp", 123);
        objectNode.withArray("objProp");
    }

    @Test
    public void testFindValue() {
        assertNull(objectNode.findValue("target"));

        objectNode.put("direct", "directValue");
        ObjectNode sub = objectNode.putObject("sub");
        sub.put("target", "nestedValue");

        assertEquals("directValue", objectNode.findValue("direct").asText());
        assertEquals("nestedValue", objectNode.findValue("target").asText());
        assertNull(objectNode.findValue("unknown"));
    }

    @Test
    public void testFindValues() {
        objectNode.put("target", "val1");
        ObjectNode sub = objectNode.putObject("sub");
        sub.put("target", "val2");

        List<JsonNode> resultNullInitial = objectNode.findValues("target", null);
        assertEquals(2, resultNullInitial.size());
        assertEquals("val1", resultNullInitial.get(0).asText());
        assertEquals("val2", resultNullInitial.get(1).asText());

        List<JsonNode> existingList = new ArrayList<JsonNode>();
        existingList.add(new TextNode("val0"));
        List<JsonNode> resultWithInitial = objectNode.findValues("target", existingList);
        assertEquals(3, resultWithInitial.size());
        assertEquals("val0", resultWithInitial.get(0).asText());
    }

    @Test
    public void testFindValuesAsText() {
        objectNode.put("target", "text1");
        ObjectNode sub = objectNode.putObject("sub");
        sub.put("target", 100);

        List<String> resultNullInitial = objectNode.findValuesAsText("target", null);
        assertEquals(2, resultNullInitial.size());
        assertEquals("text1", resultNullInitial.get(0));
        assertEquals("100", resultNullInitial.get(1));

        List<String> existingList = new ArrayList<String>();
        existingList.add("initial");
        List<String> resultWithInitial = objectNode.findValuesAsText("target", existingList);
        assertEquals(3, resultWithInitial.size());
        assertEquals("initial", resultWithInitial.get(0));
    }

    @Test
    public void testFindParent() {
        assertNull(objectNode.findParent("target"));

        objectNode.put("direct", "directVal");
        ObjectNode sub = objectNode.putObject("sub");
        sub.put("target", "nestedVal");

        assertSame(objectNode, objectNode.findParent("direct"));
        assertSame(sub, objectNode.findParent("target"));
        assertNull(objectNode.findParent("nonExisting"));
    }

    @Test
    public void testFindParents() {
        objectNode.put("target", "val1");
        ObjectNode sub = objectNode.putObject("sub");
        sub.put("target", "val2");

        List<JsonNode> parentsNull = objectNode.findParents("target", null);
        assertEquals(2, parentsParentsSizeCheck(parentsNull));
        assertSame(objectNode, parentsNull.get(0));
        assertSame(sub, parentsNull.get(1));

        List<JsonNode> existingList = new ArrayList<JsonNode>();
        List<JsonNode> parentsWithInitial = objectNode.findParents("target", existingList);
        assertSame(existingList, parentsWithInitial);
        assertEquals(2, parentsWithInitial.size());
    }

    private int parentsParentsSizeCheck(List<JsonNode> list) {
        return list == null ? 0 : list.size();
    }

    @Test
    public void testMutatorSetAndSetAll() {
        assertSame(objectNode, objectNode.set("k1", new TextNode("v1")));
        assertSame(objectNode, objectNode.set("k2", null));
        assertEquals("v1", objectNode.get("k1").asText());
        assertTrue(objectNode.get("k2").isNull());

        Map<String, JsonNode> map = new HashMap<String, JsonNode>();
        map.put("m1", new IntNode(10));
        map.put("m2", null);
        assertSame(objectNode, objectNode.setAll(map));
        assertEquals(10, objectNode.get("m1").asInt());
        assertTrue(objectNode.get("m2").isNull());

        ObjectNode other = new ObjectNode(factory);
        other.put("o1", "otherVal");
        assertSame(objectNode, objectNode.setAll(other));
        assertEquals("otherVal", objectNode.get("o1").asText());
    }

    @Test
    public void testMutatorReplaceAndWithout() {
        assertNull(objectNode.replace("key", new TextNode("val1")));
        JsonNode oldVal = objectNode.replace("key", null);
        assertEquals("val1", oldVal.asText());
        assertTrue(objectNode.get("key").isNull());

        assertSame(objectNode, objectNode.without("key"));
        assertNull(objectNode.get("key"));

        objectNode.put("k1", 1).put("k2", 2).put("k3", 3);
        assertSame(objectNode, objectNode.without(Arrays.asList("k1", "k2")));
        assertNull(objectNode.get("k1"));
        assertNull(objectNode.get("k2"));
        assertNotNull(objectNode.get("k3"));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedPutAndPutAll() {
        assertNull(objectNode.put("d1", new TextNode("v1")));
        JsonNode prev = objectNode.put("d1", (JsonNode) null);
        assertEquals("v1", prev.asText());
        assertTrue(objectNode.get("d1").isNull());

        Map<String, JsonNode> map = new HashMap<String, JsonNode>();
        map.put("pMap", new TextNode("mapVal"));
        assertSame(objectNode, objectNode.putAll(map));
        assertEquals("mapVal", objectNode.get("pMap").asText());

        ObjectNode other = new ObjectNode(factory);
        other.put("pObj", "objVal");
        assertSame(objectNode, objectNode.putAll(other));
        assertEquals("objVal", objectNode.get("pObj").asText());
    }

    @Test
    public void testRemoveAndRetain() {
        objectNode.put("r1", 1).put("r2", 2).put("r3", 3).put("r4", 4);

        JsonNode removed = objectNode.remove("r1");
        assertEquals(1, removed.asInt());
        assertNull(objectNode.remove("nonExisting"));

        assertSame(objectNode, objectNode.remove(Arrays.asList("r2", "nonExisting")));
        assertNull(objectNode.get("r2"));

        objectNode.put("r5", 5);
        assertSame(objectNode, objectNode.retain(Arrays.asList("r3", "r5")));
        assertEquals(2, objectNode.size());
        assertNotNull(objectNode.get("r3"));
        assertNotNull(objectNode.get("r5"));

        assertSame(objectNode, objectNode.retain("r3"));
        assertEquals(1, objectNode.size());
        assertNotNull(objectNode.get("r3"));

        assertSame(objectNode, objectNode.removeAll());
        assertEquals(0, objectNode.size());
    }

    @Test
    public void testTypedPutContainersAndPojos() {
        ArrayNode arr = objectNode.putArray("arrayField");
        assertNotNull(arr);
        assertSame(arr, objectNode.get("arrayField"));

        ObjectNode obj = objectNode.putObject("objectField");
        assertNotNull(obj);
        assertSame(obj, objectNode.get("objectField"));

        List<String> pojo = Arrays.asList("a", "b");
        assertSame(objectNode, objectNode.putPOJO("pojoField", pojo));
        assertTrue(objectNode.get("pojoField").isPojo());

        assertSame(objectNode, objectNode.putNull("nullField"));
        assertTrue(objectNode.get("nullField").isNull());
    }

    @Test
    public void testTypedPutPrimitivesAndWrappers() {
        // short
        objectNode.put("s_prim", (short) 10);
        assertEquals(10, objectNode.get("s_prim").shortValue());
        objectNode.put("s_obj", Short.valueOf((short) 11));
        assertEquals(11, objectNode.get("s_obj").shortValue());
        objectNode.put("s_null", (Short) null);
        assertTrue(objectNode.get("s_null").isNull());

        // int
        objectNode.put("i_prim", 20);
        assertEquals(20, objectNode.get("i_prim").intValue());
        objectNode.put("i_obj", Integer.valueOf(21));
        assertEquals(21, objectNode.get("i_obj").intValue());
        objectNode.put("i_null", (Integer) null);
        assertTrue(objectNode.get("i_null").isNull());

        // long
        objectNode.put("l_prim", 30L);
        assertEquals(30L, objectNode.get("l_prim").longValue());
        objectNode.put("l_obj", Long.valueOf(31L));
        assertEquals(31L, objectNode.get("l_obj").longValue());
        objectNode.put("l_null", (Long) null);
        assertTrue(objectNode.get("l_null").isNull());

        // float
        objectNode.put("f_prim", 40.5f);
        assertEquals(40.5f, objectNode.get("f_prim").floatValue(), 0.001);
        objectNode.put("f_obj", Float.valueOf(41.5f));
        assertEquals(41.5f, objectNode.get("f_obj").floatValue(), 0.001);
        objectNode.put("f_null", (Float) null);
        assertTrue(objectNode.get("f_null").isNull());

        // double
        objectNode.put("d_prim", 50.5);
        assertEquals(50.5, objectNode.get("d_prim").doubleValue(), 0.001);
        objectNode.put("d_obj", Double.valueOf(51.5));
        assertEquals(51.5, objectNode.get("d_obj").doubleValue(), 0.001);
        objectNode.put("d_null", (Double) null);
        assertTrue(objectNode.get("d_null").isNull());

        // BigDecimal
        BigDecimal bd = new BigDecimal("123.456");
        objectNode.put("bd_obj", bd);
        assertEquals(bd, objectNode.get("bd_obj").decimalValue());
        objectNode.put("bd_null", (BigDecimal) null);
        assertTrue(objectNode.get("bd_null").isNull());

        // String
        objectNode.put("str_obj", "testString");
        assertEquals("testString", objectNode.get("str_obj").asText());
        objectNode.put("str_empty", "");
        assertEquals("", objectNode.get("str_empty").asText());
        objectNode.put("str_null", (String) null);
        assertTrue(objectNode.get("str_null").isNull());

        // boolean
        objectNode.put("bool_prim", true);
        assertTrue(objectNode.get("bool_prim").booleanValue());
        objectNode.put("bool_obj", Boolean.FALSE);
        assertFalse(objectNode.get("bool_obj").booleanValue());
        objectNode.put("bool_null", (Boolean) null);
        assertTrue(objectNode.get("bool_null").isNull());

        // binary
        byte[] bytes = new byte[]{1, 2, 3};
        objectNode.put("bin_obj", bytes);
        assertTrue(objectNode.get("bin_obj").isBinary());
        objectNode.put("bin_empty", new byte[0]);
        assertTrue(objectNode.get("bin_empty").isBinary());
        objectNode.put("bin_null", (byte[]) null);
        assertTrue(objectNode.get("bin_null").isNull());
    }

    @Test
    public void testEqualsAndHashCode() {
        ObjectNode other = new ObjectNode(factory);
        assertTrue(objectNode.equals(objectNode));
        assertTrue(objectNode.equals(other));
        assertEquals(objectNode.hashCode(), other.hashCode());

        assertFalse(objectNode.equals(null));
        assertFalse(objectNode.equals("notAnObjectNode"));

        objectNode.put("a", 1);
        assertFalse(objectNode.equals(other));
        assertNotEquals(objectNode.hashCode(), other.hashCode());

        other.put("a", 1);
        assertTrue(objectNode.equals(other));
        assertEquals(objectNode.hashCode(), other.hashCode());
        assertTrue(objectNode._childrenEqual(other));
    }

    @Test
    public void testToString() {
        assertEquals("{}", objectNode.toString());

        objectNode.put("name", "John");
        assertEquals("{\"name\":\"John\"}", objectNode.toString());

        objectNode.put("age", 30);
        assertEquals("{\"name\":\"John\",\"age\":30}", objectNode.toString());
    }

    @Test
    public void testSerialize() throws IOException {
        objectNode.put("str", "value");
        objectNode.put("num", 100);

        StringWriter sw = new StringWriter();
        JsonGenerator jg = new JsonFactory().createGenerator(sw);
        SerializerProvider provider = new ObjectMapper().getSerializerProviderInstance();

        objectNode.serialize(jg, provider);
        jg.flush();

        assertEquals("{\"str\":\"value\",\"num\":100}", sw.toString());
    }

    @Test
    public void testSerializeWithType() throws IOException {
        objectNode.put("prop", "val");

        StringWriter sw = new StringWriter();
        JsonGenerator jg = new JsonFactory().createGenerator(sw);
        SerializerProvider provider = new ObjectMapper().getSerializerProviderInstance();

        TypeSerializer typeSer = new AsPropertyTypeSerializer(
                new ClassNameIdResolver(TypeFactory.defaultInstance().constructType(ObjectNode.class), TypeFactory.defaultInstance()),
                null,
                "@class"
        );

        objectNode.serializeWithType(jg, provider, typeSer);
        jg.flush();

        String json = sw.toString();
        assertTrue(json.startsWith("{\"@class\":"));
        assertTrue(json.contains("\"prop\":\"val\""));
    }
}
