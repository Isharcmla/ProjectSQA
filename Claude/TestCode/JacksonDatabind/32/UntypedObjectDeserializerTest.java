package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class UntypedObjectDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ----------------------------------------------------------------
    // Constructor / basic instance tests
    // ----------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructor_default_createsInstance() {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer();
        assertNotNull(deser);
    }

    @Test
    public void testConstructor_withNullTypes_createsInstance() {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer(null, null);
        assertNotNull(deser);
    }

    @Test
    public void testConstructor_withConcreteTypes_createsInstance() {
        JavaType listType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType mapType = TypeFactory.defaultInstance().constructType(Map.class);
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer(listType, mapType);
        assertNotNull(deser);
    }

    @Test
    public void testIsCachable_returnsTrue() {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer(null, null);
        assertTrue(deser.isCachable());
    }

    @Test
    public void testVanillaStd_isSingletonInstance() {
        assertNotNull(UntypedObjectDeserializer.Vanilla.std);
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        assertNotNull(v);
    }

    // ----------------------------------------------------------------
    // Object (JSON Object) mapping - normal / typical cases
    // ----------------------------------------------------------------

    @Test
    public void testDeserialize_emptyObject_returnsEmptyMap() throws Exception {
        Object result = mapper.readValue("{}", Object.class);
        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testDeserialize_singleEntryObject_returnsMapWithOneEntry() throws Exception {
        Object result = mapper.readValue("{\"a\":1}", Object.class);
        assertTrue(result instanceof Map);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(1, map.size());
        assertEquals(Integer.valueOf(1), map.get("a"));
    }

    @Test
    public void testDeserialize_twoEntryObject_returnsMapWithTwoEntries() throws Exception {
        Object result = mapper.readValue("{\"a\":1,\"b\":2}", Object.class);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(2, map.size());
        assertEquals(Integer.valueOf(1), map.get("a"));
        assertEquals(Integer.valueOf(2), map.get("b"));
    }

    @Test
    public void testDeserialize_threeEntryObject_returnsMapWithThreeEntries() throws Exception {
        Object result = mapper.readValue("{\"a\":1,\"b\":2,\"c\":3}", Object.class);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(3, map.size());
    }

    @Test
    public void testDeserialize_manyEntryObject_returnsMapWithAllEntries() throws Exception {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < 25; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("\"k").append(i).append("\":").append(i);
        }
        sb.append("}");
        Object result = mapper.readValue(sb.toString(), Object.class);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(25, map.size());
    }

    @Test
    public void testDeserialize_nestedObject_returnsNestedMap() throws Exception {
        Object result = mapper.readValue("{\"a\":{\"b\":1}}", Object.class);
        Map<?, ?> map = (Map<?, ?>) result;
        assertTrue(map.get("a") instanceof Map);
    }

    // ----------------------------------------------------------------
    // Array (JSON Array) mapping - normal / typical cases
    // ----------------------------------------------------------------

    @Test
    public void testDeserialize_emptyArray_returnsEmptyList() throws Exception {
        Object result = mapper.readValue("[]", Object.class);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testDeserialize_oneElementArray_returnsListWithOneElement() throws Exception {
        Object result = mapper.readValue("[1]", Object.class);
        List<?> list = (List<?>) result;
        assertEquals(1, list.size());
    }

    @Test
    public void testDeserialize_twoElementArray_returnsListWithTwoElements() throws Exception {
        Object result = mapper.readValue("[1,2]", Object.class);
        List<?> list = (List<?>) result;
        assertEquals(2, list.size());
    }

    @Test
    public void testDeserialize_threeElementArray_returnsListWithThreeElements() throws Exception {
        Object result = mapper.readValue("[1,2,3]", Object.class);
        List<?> list = (List<?>) result;
        assertEquals(3, list.size());
    }

    @Test
    public void testDeserialize_manyElementArray_returnsListWithAllElements() throws Exception {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 40; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(i);
        }
        sb.append("]");
        Object result = mapper.readValue(sb.toString(), Object.class);
        List<?> list = (List<?>) result;
        assertEquals(40, list.size());
    }

    @Test
    public void testDeserialize_nestedArray_returnsNestedList() throws Exception {
        Object result = mapper.readValue("[[1,2],[3,4]]", Object.class);
        List<?> list = (List<?>) result;
        assertEquals(2, list.size());
        assertTrue(list.get(0) instanceof List);
    }

    // ----------------------------------------------------------------
    // USE_JAVA_ARRAY_FOR_JSON_ARRAY feature - edge / boundary cases
    // ----------------------------------------------------------------

    @Test
    public void testDeserialize_arrayWithJavaArrayFeatureEnabled_returnsObjectArray() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        Object result = m.readValue("[1,2,3]", Object.class);
        assertTrue(result instanceof Object[]);
        assertEquals(3, ((Object[]) result).length);
    }

    @Test
    public void testDeserialize_emptyArrayWithJavaArrayFeatureEnabled_returnsEmptyObjectArray() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        Object result = m.readValue("[]", Object.class);
        assertTrue(result instanceof Object[]);
        assertEquals(0, ((Object[]) result).length);
    }

    @Test
    public void testDeserialize_manyElementArrayWithJavaArrayFeatureEnabled_returnsFullObjectArray() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 30; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(i);
        }
        sb.append("]");
        Object result = m.readValue(sb.toString(), Object.class);
        assertTrue(result instanceof Object[]);
        assertEquals(30, ((Object[]) result).length);
    }

    // ----------------------------------------------------------------
    // Scalar values - normal cases
    // ----------------------------------------------------------------

    @Test
    public void testDeserialize_stringValue_returnsString() throws Exception {
        Object result = mapper.readValue("\"hello\"", Object.class);
        assertEquals("hello", result);
    }

    @Test
    public void testDeserialize_emptyStringValue_returnsEmptyString() throws Exception {
        Object result = mapper.readValue("\"\"", Object.class);
        assertEquals("", result);
    }

    @Test
    public void testDeserialize_integerValue_returnsInteger() throws Exception {
        Object result = mapper.readValue("123", Object.class);
        assertTrue(result instanceof Integer);
        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void testDeserialize_zeroValue_returnsZero() throws Exception {
        Object result = mapper.readValue("0", Object.class);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void testDeserialize_negativeIntegerValue_returnsNegativeInteger() throws Exception {
        Object result = mapper.readValue("-123", Object.class);
        assertEquals(Integer.valueOf(-123), result);
    }

    @Test
    public void testDeserialize_floatValue_returnsDouble() throws Exception {
        Object result = mapper.readValue("1.5", Object.class);
        assertTrue(result instanceof Double);
        assertEquals(1.5, (Double) result, 0.0001);
    }

    @Test
    public void testDeserialize_negativeFloatValue_returnsNegativeDouble() throws Exception {
        Object result = mapper.readValue("-1.5", Object.class);
        assertEquals(-1.5, (Double) result, 0.0001);
    }

    @Test
    public void testDeserialize_floatValueWithBigDecimalFeature_returnsBigDecimal() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        Object result = m.readValue("1.5", Object.class);
        assertTrue(result instanceof BigDecimal);
    }

    @Test
    public void testDeserialize_intValueWithBigIntegerFeature_returnsBigInteger() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true);
        Object result = m.readValue("123", Object.class);
        assertTrue(result instanceof BigInteger);
    }

    @Test
    public void testDeserialize_trueValue_returnsBooleanTrue() throws Exception {
        Object result = mapper.readValue("true", Object.class);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testDeserialize_falseValue_returnsBooleanFalse() throws Exception {
        Object result = mapper.readValue("false", Object.class);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testDeserialize_nullValue_returnsNull() throws Exception {
        Object result = mapper.readValue("null", Object.class);
        assertNull(result);
    }

    // ----------------------------------------------------------------
    // Mixed / complex structures using Object as a nested value
    // (exercises resolve()/createContextual() indirectly)
    // ----------------------------------------------------------------

    @Test
    public void testDeserialize_complexMixedStructure_returnsExpectedTypes() throws Exception {
        Map<String, Object> result = mapper.readValue(
                "{\"a\":1,\"b\":[1,2,3],\"c\":{\"d\":1},\"e\":\"str\",\"f\":true,\"g\":null}",
                new com.fasterxml.jackson.core.type.TypeReference<Map<String, Object>>() {
                });
        assertEquals(6, result.size());
        assertTrue(result.get("a") instanceof Integer);
        assertTrue(result.get("b") instanceof List);
        assertTrue(result.get("c") instanceof Map);
        assertTrue(result.get("e") instanceof String);
        assertEquals(Boolean.TRUE, result.get("f"));
        assertNull(result.get("g"));
    }

    // ----------------------------------------------------------------
    // deserializeWithType (polymorphic) path - via default typing
    // ----------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testDeserializeWithType_defaultTypingEnabled_returnsCorrectValue() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        String json = m.writeValueAsString("hello");
        Object result = m.readValue(json, Object.class);
        assertEquals("hello", result);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeserializeWithType_defaultTypingEnabledForMap_returnsCorrectMap() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        Map<String, Object> src = new java.util.LinkedHashMap<String, Object>();
        src.put("x", 1);
        String json = m.writeValueAsString(src);
        Object result = m.readValue(json, Object.class);
        assertTrue(result instanceof Map);
    }

    // ----------------------------------------------------------------
    // Exception cases
    // ----------------------------------------------------------------

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_malformedJson_throwsException() throws Exception {
        mapper.readValue("]", Object.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_unclosedObject_throwsException() throws Exception {
        mapper.readValue("{\"a\":1", Object.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_unclosedArray_throwsException() throws Exception {
        mapper.readValue("[1,2,3", Object.class);
    }

    @Test(expected = JsonProcessingException.class)
    public void testDeserialize_emptyInput_throwsException() throws Exception {
        mapper.readValue("", Object.class);
    }
}
