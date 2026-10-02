package com.fasterxml.jackson.databind.deser.impl;

import java.util.*;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JavaUtilCollectionsDeserializersTest
{
    private ObjectMapper mapper;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        typeFactory = TypeFactory.defaultInstance();
    }

    // ---------- findForCollection tests ----------

    @Test
    public void testFindForCollection_arraysAsListType_returnsDeserializer() throws Exception {
        List<?> asListInstance = Arrays.asList("a", "b");
        JavaType type = typeFactory.constructType(asListInstance.getClass());

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_singletonListType_returnsDeserializer() throws Exception {
        List<?> singletonList = Collections.singletonList("x");
        JavaType type = typeFactory.constructType(singletonList.getClass());

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_singletonSetType_returnsDeserializer() throws Exception {
        Set<?> singletonSet = Collections.singleton("x");
        JavaType type = typeFactory.constructType(singletonSet.getClass());

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_unmodifiableListType_returnsDeserializer() throws Exception {
        List<?> unmodList = Collections.unmodifiableList(Arrays.asList("a", "b"));
        JavaType type = typeFactory.constructType(unmodList.getClass());

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_unmodifiableSetType_returnsDeserializer() throws Exception {
        Set<?> unmodSet = Collections.unmodifiableSet(new HashSet<Object>(Arrays.asList("a", "b")));
        JavaType type = typeFactory.constructType(unmodSet.getClass());

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_unrelatedType_returnsNull() throws Exception {
        JavaType type = typeFactory.constructType(ArrayList.class);

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);

        assertNull(deser);
    }

    // ---------- findForMap tests ----------

    @Test
    public void testFindForMap_singletonMapType_returnsDeserializer() throws Exception {
        Map<?,?> singletonMap = Collections.singletonMap("k", "v");
        JavaType type = typeFactory.constructType(singletonMap.getClass());

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);

        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMap_unmodifiableMapType_returnsDeserializer() throws Exception {
        Map<String,String> base = new HashMap<>();
        base.put("k", "v");
        Map<?,?> unmodMap = Collections.unmodifiableMap(base);
        JavaType type = typeFactory.constructType(unmodMap.getClass());

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);

        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMap_unrelatedType_returnsNull() throws Exception {
        JavaType type = typeFactory.constructType(HashMap.class);

        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);

        assertNull(deser);
    }

    // ---------- Round-trip functional tests using ObjectMapper (exercise Converter logic) ----------

    @Test
    public void testRoundTrip_arraysAsList_normalInput_deserializesCorrectly() throws Exception {
        List<String> orig = Arrays.asList("a", "b", "c");
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = mapper.writeValueAsString(orig);
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof List);
        assertEquals(orig, result);
    }

    @Test
    public void testRoundTrip_singletonList_normalInput_deserializesCorrectly() throws Exception {
        List<String> orig = Collections.singletonList("only");
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = mapper.writeValueAsString(orig);
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof List);
        assertEquals(1, ((List<?>) result).size());
        assertEquals("only", ((List<?>) result).get(0));
    }

    @Test
    public void testRoundTrip_singletonList_tooManyElements_throwsException() throws Exception {
        List<String> orig = Collections.singletonList("only");
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = "[\"a\",\"b\"]";

        try {
            mapper.readValue(json, type);
            fail("Expected an exception due to size mismatch for singleton container");
        } catch (Exception e) {
            // expected - either IllegalArgumentException directly or wrapped by Jackson
            assertNotNull(e);
        }
    }

    @Test
    public void testRoundTrip_singletonSet_normalInput_deserializesCorrectly() throws Exception {
        Set<String> orig = Collections.singleton("only");
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = mapper.writeValueAsString(orig);
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof Set);
        assertEquals(1, ((Set<?>) result).size());
        assertTrue(((Set<?>) result).contains("only"));
    }

    @Test
    public void testRoundTrip_singletonSet_emptyInput_throwsException() throws Exception {
        Set<String> orig = Collections.singleton("only");
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = "[]";

        try {
            mapper.readValue(json, type);
            fail("Expected an exception due to size mismatch for singleton container");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testRoundTrip_singletonMap_normalInput_deserializesCorrectly() throws Exception {
        Map<String,String> orig = Collections.singletonMap("k", "v");
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = mapper.writeValueAsString(orig);
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof Map);
        assertEquals(1, ((Map<?,?>) result).size());
        assertEquals("v", ((Map<?,?>) result).get("k"));
    }

    @Test
    public void testRoundTrip_singletonMap_tooManyEntries_throwsException() throws Exception {
        Map<String,String> orig = Collections.singletonMap("k", "v");
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = "{\"k1\":\"v1\",\"k2\":\"v2\"}";

        try {
            mapper.readValue(json, type);
            fail("Expected an exception due to size mismatch for singleton container");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testRoundTrip_unmodifiableList_normalInput_producesUnmodifiableList() throws Exception {
        List<String> base = Arrays.asList("a", "b");
        List<?> unmodList = Collections.unmodifiableList(base);
        JavaType type = typeFactory.constructType(unmodList.getClass());

        String json = mapper.writeValueAsString(unmodList);
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof List);
        assertEquals(Arrays.asList("a", "b"), result);

        try {
            @SuppressWarnings("unchecked")
            List<Object> castResult = (List<Object>) result;
            castResult.add("c");
            fail("Expected UnsupportedOperationException since list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testRoundTrip_unmodifiableSet_normalInput_producesUnmodifiableSet() throws Exception {
        Set<String> base = new HashSet<>(Arrays.asList("a", "b"));
        Set<?> unmodSet = Collections.unmodifiableSet(base);
        JavaType type = typeFactory.constructType(unmodSet.getClass());

        String json = mapper.writeValueAsString(unmodSet);
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof Set);
        assertEquals(2, ((Set<?>) result).size());

        try {
            @SuppressWarnings("unchecked")
            Set<Object> castResult = (Set<Object>) result;
            castResult.add("c");
            fail("Expected UnsupportedOperationException since set should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testRoundTrip_unmodifiableMap_normalInput_producesUnmodifiableMap() throws Exception {
        Map<String,String> base = new HashMap<>();
        base.put("k1", "v1");
        base.put("k2", "v2");
        Map<?,?> unmodMap = Collections.unmodifiableMap(base);
        JavaType type = typeFactory.constructType(unmodMap.getClass());

        String json = mapper.writeValueAsString(unmodMap);
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof Map);
        assertEquals(2, ((Map<?,?>) result).size());

        try {
            @SuppressWarnings("unchecked")
            Map<Object,Object> castResult = (Map<Object,Object>) result;
            castResult.put("k3", "v3");
            fail("Expected UnsupportedOperationException since map should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testRoundTrip_arraysAsList_emptyInput_deserializesCorrectly() throws Exception {
        List<String> orig = Arrays.asList();
        JavaType type = typeFactory.constructType(orig.getClass());

        String json = "[]";
        Object result = mapper.readValue(json, type);

        assertTrue(result instanceof List);
        assertEquals(0, ((List<?>) result).size());
    }
}
