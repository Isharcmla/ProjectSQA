import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ObjectNodeTest {

    private ObjectNode node;

    @Before
    public void setUp() {
        node = JsonNodeFactory.instance.objectNode();
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructorWithMap_normalInput_createsNodeWithGivenChildren() {
        Map<String, JsonNode> map = new LinkedHashMap<String, JsonNode>();
        map.put("a", JsonNodeFactory.instance.textNode("valueA"));
        ObjectNode custom = new ObjectNode(JsonNodeFactory.instance, map);
        assertEquals(1, custom.size());
        assertEquals("valueA", custom.get("a").textValue());
    }

    // ---------- deepCopy ----------

    @Test
    public void testDeepCopy_normalInput_returnsEqualButDistinctCopy() {
        node.put("a", 1);
        node.put("b", "hello");
        ObjectNode copy = node.deepCopy();
        assertEquals(node, copy);
        assertNotSame(node, copy);
        assertNotSame(node.get("a"), copy.get("a"));
    }

    // ---------- getNodeType / asToken ----------

    @Test
    public void testGetNodeType_normalInput_returnsObjectType() {
        assertEquals(JsonNodeType.OBJECT, node.getNodeType());
    }

    @Test
    public void testAsToken_normalInput_returnsStartObjectToken() {
        assertEquals(JsonToken.START_OBJECT, node.asToken());
    }

    // ---------- size ----------

    @Test
    public void testSize_emptyNode_returnsZero() {
        assertEquals(0, node.size());
    }

    @Test
    public void testSize_afterAddingFields_returnsCorrectCount() {
        node.put("a", 1);
        node.put("b", 2);
        assertEquals(2, node.size());
    }

    // ---------- elements ----------

    @Test
    public void testElements_normalInput_iteratesOverValues() {
        node.put("a", 1);
        node.put("b", 2);
        Iterator<JsonNode> it = node.elements();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    // ---------- get(int) ----------

    @Test
    public void testGetIndex_anyIndex_returnsNull() {
        node.put("a", 1);
        assertNull(node.get(0));
        assertNull(node.get(-1));
    }

    // ---------- get(String) ----------

    @Test
    public void testGetFieldName_existingField_returnsValue() {
        node.put("a", 1);
        assertNotNull(node.get("a"));
        assertEquals(1, node.get("a").intValue());
    }

    @Test
    public void testGetFieldName_missingField_returnsNull() {
        assertNull(node.get("missing"));
    }

    // ---------- fieldNames ----------

    @Test
    public void testFieldNames_normalInput_iteratesOverKeys() {
        node.put("a", 1);
        node.put("b", 2);
        Iterator<String> it = node.fieldNames();
        List<String> names = new ArrayList<String>();
        while (it.hasNext()) {
            names.add(it.next());
        }
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    // ---------- path(int) ----------

    @Test
    public void testPathIndex_anyIndex_returnsMissingNode() {
        JsonNode result = node.path(0);
        assertTrue(result.isMissingNode());
    }

    // ---------- path(String) ----------

    @Test
    public void testPathFieldName_existingField_returnsValue() {
        node.put("a", 1);
        assertEquals(1, node.path("a").intValue());
    }

    @Test
    public void testPathFieldName_missingField_returnsMissingNode() {
        JsonNode result = node.path("missing");
        assertTrue(result.isMissingNode());
    }

    // ---------- fields ----------

    @Test
    public void testFields_normalInput_iteratesOverEntries() {
        node.put("a", 1);
        node.put("b", 2);
        Iterator<Map.Entry<String, JsonNode>> it = node.fields();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    // ---------- with(String) ----------

    @Test
    public void testWith_notExistingProperty_createsNewObjectNode() {
        ObjectNode result = node.with("child");
        assertNotNull(result);
        assertTrue(node.get("child") instanceof ObjectNode);
    }

    @Test
    public void testWith_existingObjectNodeProperty_returnsExistingNode() {
        ObjectNode child = node.putObject("child");
        ObjectNode result = node.with("child");
        assertSame(child, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWith_existingNonObjectNodeProperty_throwsException() {
        node.put("child", "notAnObject");
        node.with("child");
    }

    // ---------- withArray(String) ----------

    @Test
    public void testWithArray_notExistingProperty_createsNewArrayNode() {
        ArrayNode result = node.withArray("arr");
        assertNotNull(result);
        assertTrue(node.get("arr") instanceof ArrayNode);
    }

    @Test
    public void testWithArray_existingArrayNodeProperty_returnsExistingNode() {
        ArrayNode arr = node.putArray("arr");
        ArrayNode result = node.withArray("arr");
        assertSame(arr, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithArray_existingNonArrayNodeProperty_throwsException() {
        node.put("arr", "notAnArray");
        node.withArray("arr");
    }

    // ---------- findValue ----------

    @Test
    public void testFindValue_existingFieldAtTopLevel_returnsValue() {
        node.put("a", 1);
        JsonNode result = node.findValue("a");
        assertNotNull(result);
        assertEquals(1, result.intValue());
    }

    @Test
    public void testFindValue_existingFieldNested_returnsValue() {
        ObjectNode child = node.putObject("child");
        child.put("b", 2);
        JsonNode result = node.findValue("b");
        assertNotNull(result);
        assertEquals(2, result.intValue());
    }

    @Test
    public void testFindValue_missingField_returnsNull() {
        node.put("a", 1);
        assertNull(node.findValue("missing"));
    }

    // ---------- findValues ----------

    @Test
    public void testFindValues_nullListPassed_createsNewListWithFoundValues() {
        node.put("a", 1);
        List<JsonNode> result = node.findValues("a", null);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void testFindValues_existingListPassed_appendsToList() {
        List<JsonNode> initial = new ArrayList<JsonNode>();
        node.put("a", 1);
        List<JsonNode> result = node.findValues("a", initial);
        assertSame(initial, result);
        assertEquals(1, result.size());
    }

    @Test
    public void testFindValues_missingField_returnsUnchangedList() {
        List<JsonNode> initial = new ArrayList<JsonNode>();
        node.put("a", 1);
        List<JsonNode> result = node.findValues("missing", initial);
        assertEquals(0, result.size());
    }

    // ---------- findValuesAsText ----------

    @Test
    public void testFindValuesAsText_existingField_returnsTextValues() {
        node.put("a", "hello");
        List<String> result = node.findValuesAsText("a", null);
        assertNotNull(result);
        assertEquals("hello", result.get(0));
    }

    @Test
    public void testFindValuesAsText_missingField_returnsNull() {
        node.put("a", "hello");
        List<String> result = node.findValuesAsText("missing", null);
        assertNull(result);
    }

    // ---------- findParent ----------

    @Test
    public void testFindParent_fieldExistsAtTopLevel_returnsThis() {
        node.put("a", 1);
        ObjectNode result = node.findParent("a");
        assertSame(node, result);
    }

    @Test
    public void testFindParent_fieldExistsNested_returnsNestedParent() {
        ObjectNode child = node.putObject("child");
        child.put("b", 2);
        ObjectNode result = node.findParent("b");
        assertSame(child, result);
    }

    @Test
    public void testFindParent_fieldNotFound_returnsNull() {
        node.put("a", 1);
        assertNull(node.findParent("missing"));
    }

    // ---------- findParents ----------

    @Test
    public void testFindParents_fieldExists_returnsListWithParent() {
        node.put("a", 1);
        List<JsonNode> result = node.findParents("a", null);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertSame(node, result.get(0));
    }

    @Test
    public void testFindParents_fieldNotFound_returnsNull() {
        node.put("a", 1);
        List<JsonNode> result = node.findParents("missing", null);
        assertNull(result);
    }

    // ---------- serialize ----------

    @Test
    public void testSerialize_normalInput_producesValidJson() throws IOException {
        node.put("a", 1);
        node.put("b", "text");
        JsonFactory factory = new JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        node.serialize(gen, null);
        gen.close();
        String json = sw.toString();
        assertTrue(json.contains("\"a\":1"));
        assertTrue(json.contains("\"b\":\"text\""));
    }

    @Test
    public void testSerialize_emptyObject_producesEmptyBraces() throws IOException {
        JsonFactory factory = new JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = factory.createGenerator(sw);
        node.serialize(gen, null);
        gen.close();
        assertEquals("{}", sw.toString());
    }

    // Note: serializeWithType requires a concrete TypeSerializer implementation.
    // TypeSerializer is an abstract class whose full API is not provided in the
    // given dependencies, and creating a mock/stub without guessing its API
    // would violate the constraints of this task. Therefore this method is not
    // covered directly to avoid guessing undocumented API.

    // ---------- set(String, JsonNode) ----------

    @Test
    public void testSet_normalValue_setsFieldAndReturnsThis() {
        JsonNode result = node.set("a", JsonNodeFactory.instance.textNode("hello"));
        assertSame(node, result);
        assertEquals("hello", node.get("a").textValue());
    }

    @Test
    public void testSet_nullValue_setsNullNode() {
        node.set("a", null);
        assertTrue(node.get("a").isNull());
    }

    // ---------- setAll(Map) ----------

    @Test
    public void testSetAllMap_normalInput_addsAllProperties() {
        Map<String, JsonNode> props = new LinkedHashMap<String, JsonNode>();
        props.put("x", JsonNodeFactory.instance.numberNode(1));
        props.put("y", null);
        JsonNode result = node.setAll(props);
        assertSame(node, result);
        assertEquals(1, node.get("x").intValue());
        assertTrue(node.get("y").isNull());
    }

    // ---------- setAll(ObjectNode) ----------

    @Test
    public void testSetAllObjectNode_normalInput_copiesAllProperties() {
        ObjectNode other = JsonNodeFactory.instance.objectNode();
        other.put("z", 99);
        JsonNode result = node.setAll(other);
        assertSame(node, result);
        assertEquals(99, node.get("z").intValue());
    }

    // ---------- replace ----------

    @Test
    public void testReplace_existingField_returnsOldValueAndSetsNew() {
        node.put("a", 1);
        JsonNode old = node.replace("a", JsonNodeFactory.instance.textNode("new"));
        assertEquals(1, old.intValue());
        assertEquals("new", node.get("a").textValue());
    }

    @Test
    public void testReplace_missingField_returnsNull() {
        JsonNode old = node.replace("a", JsonNodeFactory.instance.textNode("new"));
        assertNull(old);
    }

    @Test
    public void testReplace_nullValue_setsNullNode() {
        node.replace("a", null);
        assertTrue(node.get("a").isNull());
    }

    // ---------- without(String) ----------

    @Test
    public void testWithoutFieldName_existingField_removesField() {
        node.put("a", 1);
        JsonNode result = node.without("a");
        assertSame(node, result);
        assertNull(node.get("a"));
    }

    @Test
    public void testWithoutFieldName_missingField_doesNothing() {
        JsonNode result = node.without("missing");
        assertSame(node, result);
    }

    // ---------- without(Collection) ----------

    @Test
    public void testWithoutCollection_normalInput_removesSpecifiedFields() {
        node.put("a", 1);
        node.put("b", 2);
        node.put("c", 3);
        ObjectNode result = node.without(Arrays.asList("a", "b"));
        assertSame(node, result);
        assertNull(node.get("a"));
        assertNull(node.get("b"));
        assertNotNull(node.get("c"));
    }

    // ---------- put(String, JsonNode) deprecated ----------

    @Test
    public void testPutJsonNode_normalValue_setsFieldAndReturnsOldValue() {
        node.put("a", 1);
        JsonNode old = node.put("a", JsonNodeFactory.instance.textNode("new"));
        assertEquals(1, old.intValue());
        assertEquals("new", node.get("a").textValue());
    }

    @Test
    public void testPutJsonNode_nullValue_setsNullNode() {
        node.put("a", (JsonNode) null);
        assertTrue(node.get("a").isNull());
    }

    // ---------- remove(String) ----------

    @Test
    public void testRemoveFieldName_existingField_returnsValueAndRemoves() {
        node.put("a", 1);
        JsonNode removed = node.remove("a");
        assertEquals(1, removed.intValue());
        assertNull(node.get("a"));
    }

    @Test
    public void testRemoveFieldName_missingField_returnsNull() {
        assertNull(node.remove("missing"));
    }

    // ---------- remove(Collection) ----------

    @Test
    public void testRemoveCollection_normalInput_removesSpecifiedFields() {
        node.put("a", 1);
        node.put("b", 2);
        node.put("c", 3);
        ObjectNode result = node.remove(Arrays.asList("a", "b"));
        assertSame(node, result);
        assertNull(node.get("a"));
        assertNull(node.get("b"));
        assertNotNull(node.get("c"));
    }

    // ---------- removeAll ----------

    @Test
    public void testRemoveAll_normalInput_clearsAllFields() {
        node.put("a", 1);
        node.put("b", 2);
        ObjectNode result = node.removeAll();
        assertSame(node, result);
        assertEquals(0, node.size());
    }

    // ---------- putAll(Map) deprecated ----------

    @Test
    public void testPutAllMap_normalInput_addsAllProperties() {
        Map<String, JsonNode> props = new LinkedHashMap<String, JsonNode>();
        props.put("x", JsonNodeFactory.instance.numberNode(5));
        JsonNode result = node.putAll(props);
        assertSame(node, result);
        assertEquals(5, node.get("x").intValue());
    }

    // ---------- putAll(ObjectNode) deprecated ----------

    @Test
    public void testPutAllObjectNode_normalInput_copiesAllProperties() {
        ObjectNode other = JsonNodeFactory.instance.objectNode();
        other.put("y", 10);
        JsonNode result = node.putAll(other);
        assertSame(node, result);
        assertEquals(10, node.get("y").intValue());
    }

    // ---------- retain(Collection) ----------

    @Test
    public void testRetainCollection_normalInput_keepsOnlySpecifiedFields() {
        node.put("a", 1);
        node.put("b", 2);
        node.put("c", 3);
        ObjectNode result = node.retain(Arrays.asList("a", "c"));
        assertSame(node, result);
        assertNotNull(node.get("a"));
        assertNull(node.get("b"));
        assertNotNull(node.get("c"));
    }

    // ---------- retain(String...) ----------

    @Test
    public void testRetainVarargs_normalInput_keepsOnlySpecifiedFields() {
        node.put("a", 1);
        node.put("b", 2);
        node.put("c", 3);
        ObjectNode result = node.retain("a", "c");
        assertSame(node, result);
        assertNotNull(node.get("a"));
        assertNull(node.get("b"));
        assertNotNull(node.get("c"));
    }

    @Test
    public void testRetainVarargs_emptyArray_removesAllFields() {
        node.put("a", 1);
        ObjectNode result = node.retain();
        assertEquals(0, result.size());
    }

    // ---------- putArray ----------

    @Test
    public void testPutArray_normalInput_returnsNewArrayNodeAndAddsField() {
        ArrayNode arr = node.putArray("arr");
        assertNotNull(arr);
        assertSame(arr, node.get("arr"));
    }

    // ---------- putObject ----------

    @Test
    public void testPutObject_normalInput_returnsNewObjectNodeAndAddsField() {
        ObjectNode obj = node.putObject("obj");
        assertNotNull(obj);
        assertSame(obj, node.get("obj"));
    }

    // ---------- putPOJO ----------

    @Test
    public void testPutPOJO_normalInput_addsPojoNodeAndReturnsThis() {
        ObjectNode result = node.putPOJO("pojo", "someObject");
        assertSame(node, result);
        assertNotNull(node.get("pojo"));
    }

    // ---------- putNull ----------

    @Test
    public void testPutNull_normalInput_addsNullNodeAndReturnsThis() {
        ObjectNode result = node.putNull("n");
        assertSame(node, result);
        assertTrue(node.get("n").isNull());
    }

    // ---------- put(String, short) ----------

    @Test
    public void testPutShortPrimitive_normalInput_addsNumberNode() {
        short v = 5;
        ObjectNode result = node.put("s", v);
        assertSame(node, result);
        assertEquals(5, node.get("s").intValue());
    }

    // ---------- put(String, Short) ----------

    @Test
    public void testPutShortWrapper_normalValue_addsNumberNode() {
        Short v = 7;
        node.put("s", v);
        assertEquals(7, node.get("s").intValue());
    }

    @Test
    public void testPutShortWrapper_nullValue_addsNullNode() {
        Short v = null;
        node.put("s", v);
        assertTrue(node.get("s").isNull());
    }

    // ---------- put(String, int) ----------

    @Test
    public void testPutIntPrimitive_normalInput_addsNumberNode() {
        node.put("i", 42);
        assertEquals(42, node.get("i").intValue());
    }

    @Test
    public void testPutIntPrimitive_negativeValue_addsNumberNode() {
        node.put("i", -1);
        assertEquals(-1, node.get("i").intValue());
    }

    // ---------- put(String, Integer) ----------

    @Test
    public void testPutIntegerWrapper_normalValue_addsNumberNode() {
        Integer v = 10;
        node.put("i", v);
        assertEquals(10, node.get("i").intValue());
    }

    @Test
    public void testPutIntegerWrapper_nullValue_addsNullNode() {
        Integer v = null;
        node.put("i", v);
        assertTrue(node.get("i").isNull());
    }

    // ---------- put(String, long) ----------

    @Test
    public void testPutLongPrimitive_normalInput_addsNumberNode() {
        node.put("l", 123456789L);
        assertEquals(123456789L, node.get("l").longValue());
    }

    // ---------- put(String, Long) ----------

    @Test
    public void testPutLongWrapper_normalValue_addsNumberNode() {
        Long v = 999L;
        node.put("l", v);
        assertEquals(999L, node.get("l").longValue());
    }

    @Test
    public void testPutLongWrapper_nullValue_addsNullNode() {
        Long v = null;
        node.put("l", v);
        assertTrue(node.get("l").isNull());
    }

    // ---------- put(String, float) ----------

    @Test
    public void testPutFloatPrimitive_normalInput_addsNumberNode() {
        node.put("f", 1.5f);
        assertEquals(1.5f, node.get("f").floatValue(), 0.0001);
    }

    // ---------- put(String, Float) ----------

    @Test
    public void testPutFloatWrapper_normalValue_addsNumberNode() {
        Float v = 2.5f;
        node.put("f", v);
        assertEquals(2.5f, node.get("f").floatValue(), 0.0001);
    }

    @Test
    public void testPutFloatWrapper_nullValue_addsNullNode() {
        Float v = null;
        node.put("f", v);
        assertTrue(node.get("f").isNull());
    }

    // ---------- put(String, double) ----------

    @Test
    public void testPutDoublePrimitive_normalInput_addsNumberNode() {
        node.put("d", 3.14);
        assertEquals(3.14, node.get("d").doubleValue(), 0.0001);
    }

    // ---------- put(String, Double) ----------

    @Test
    public void testPutDoubleWrapper_normalValue_addsNumberNode() {
        Double v = 6.28;
        node.put("d", v);
        assertEquals(6.28, node.get("d").doubleValue(), 0.0001);
    }

    @Test
    public void testPutDoubleWrapper_nullValue_addsNullNode() {
        Double v = null;
        node.put("d", v);
        assertTrue(node.get("d").isNull());
    }

    // ---------- put(String, BigDecimal) ----------

    @Test
    public void testPutBigDecimal_normalValue_addsNumberNode() {
        BigDecimal v = new BigDecimal("123.456");
        node.put("bd", v);
        assertEquals(v, node.get("bd").decimalValue());
    }

    @Test
    public void testPutBigDecimal_nullValue_addsNullNode() {
        BigDecimal v = null;
        node.put("bd", v);
        assertTrue(node.get("bd").isNull());
    }

    // ---------- put(String, String) ----------

    @Test
    public void testPutString_normalValue_addsTextNode() {
        node.put("s", "hello");
        assertEquals("hello", node.get("s").textValue());
    }

    @Test
    public void testPutString_emptyString_addsTextNode() {
        node.put("s", "");
        assertEquals("", node.get("s").textValue());
    }

    @Test
    public void testPutString_nullValue_addsNullNode() {
        String v = null;
        node.put("s", v);
        assertTrue(node.get("s").isNull());
    }

    // ---------- put(String, boolean) ----------

    @Test
    public void testPutBooleanPrimitive_trueValue_addsBooleanNode() {
        node.put("b", true);
        assertTrue(node.get("b").booleanValue());
    }

    @Test
    public void testPutBooleanPrimitive_falseValue_addsBooleanNode() {
        node.put("b", false);
        assertFalse(node.get("b").booleanValue());
    }

    // ---------- put(String, Boolean) ----------

    @Test
    public void testPutBooleanWrapper_normalValue_addsBooleanNode() {
        Boolean v = Boolean.TRUE;
        node.put("b", v);
        assertTrue(node.get("b").booleanValue());
    }

    @Test
    public void testPutBooleanWrapper_nullValue_addsNullNode() {
        Boolean v = null;
        node.put("b", v);
        assertTrue(node.get("b").isNull());
    }

    // ---------- put(String, byte[]) ----------

    @Test
    public void testPutByteArray_normalValue_addsBinaryNode() throws IOException {
        byte[] v = new byte[] {1, 2, 3};
        node.put("bin", v);
        assertArrayEquals(v, node.get("bin").binaryValue());
    }

    @Test
    public void testPutByteArray_nullValue_addsNullNode() {
        byte[] v = null;
        node.put("bin", v);
        assertTrue(node.get("bin").isNull());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(node.equals(node));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(node.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(node.equals("notAnObjectNode"));
    }

    @Test
    public void testEquals_equalContent_returnsTrue() {
        node.put("a", 1);
        ObjectNode other = JsonNodeFactory.instance.objectNode();
        other.put("a", 1);
        assertTrue(node.equals(other));
    }

    @Test
    public void testEquals_differentContent_returnsFalse() {
        node.put("a", 1);
        ObjectNode other = JsonNodeFactory.instance.objectNode();
        other.put("a", 2);
        assertFalse(node.equals(other));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        node.put("a", 1);
        ObjectNode other = JsonNodeFactory.instance.objectNode();
        other.put("a", 1);
        assertEquals(node.hashCode(), other.hashCode());
    }

    // ---------- toString ----------

    @Test
    public void testToString_emptyObject_returnsEmptyBraces() {
        assertEquals("{}", node.toString());
    }

    @Test
    public void testToString_normalInput_returnsJsonStringRepresentation() {
        node.put("a", 1);
        String result = node.toString();
        assertTrue(result.startsWith("{"));
        assertTrue(result.endsWith("}"));
        assertTrue(result.contains("\"a\":1"));
    }
}
