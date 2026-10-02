package com.fasterxml.jackson.databind.deser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.core.JsonParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DeserializerCacheTest {

    // Simple marker class used to trigger real deserialization
    // so we can capture a real DeserializationContext instance.
    static class Marker { }

    // Simple POJO for bean deserializer tests
    static class SimpleBean {
        public String name;
    }

    enum SampleEnum { A, B }

    // Custom deserializer used only to capture the real DeserializationContext
    static class CapturingDeserializer extends JsonDeserializer<Marker> {
        static DeserializationContext lastContext;

        @Override
        public Marker deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            lastContext = ctxt;
            p.skipChildren();
            return new Marker();
        }
    }

    private DeserializationContext ctxt;
    private DeserializerFactory factory;
    private DeserializerCache cache;

    @Before
    public void setUp() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Marker.class, new CapturingDeserializer());
        mapper.registerModule(module);
        mapper.readValue("{}", Marker.class);

        ctxt = CapturingDeserializer.lastContext;
        assertNotNull("Failed to capture DeserializationContext", ctxt);

        factory = BeanDeserializerFactory.instance;
        cache = new DeserializerCache();
    }

    // ---------------------------------------------------------
    // cachedDeserializersCount() / flushCachedDeserializers()
    // ---------------------------------------------------------

    @Test
    public void testCachedDeserializersCount_initially_returnsZero() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializers_afterCachingSomething_countBecomesZero() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);

        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    // ---------------------------------------------------------
    // findValueDeserializer()
    // ---------------------------------------------------------

    @Test
    public void testFindValueDeserializer_forStringType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_forListType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_forMapType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructMapType(Map.class, String.class, String.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_forEnumType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(SampleEnum.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_forArrayType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(int[].class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_forJsonNodeType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(JsonNode.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test
    public void testFindValueDeserializer_forBeanType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueDeserializer_nullType_throwsIllegalArgumentException() throws JsonMappingException {
        cache.findValueDeserializer(ctxt, factory, null);
    }

    @Test
    public void testFindValueDeserializer_calledTwiceForSameType_secondCallHitsCache() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        JsonDeserializer<Object> first = cache.findValueDeserializer(ctxt, factory, type);
        int countAfterFirst = cache.cachedDeserializersCount();
        JsonDeserializer<Object> second = cache.findValueDeserializer(ctxt, factory, type);
        int countAfterSecond = cache.cachedDeserializersCount();

        assertNotNull(first);
        assertNotNull(second);
        assertEquals(countAfterFirst, countAfterSecond);
    }

    // ---------------------------------------------------------
    // findKeyDeserializer()
    // ---------------------------------------------------------

    @Test
    public void testFindKeyDeserializer_forStringType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, type);
        assertNotNull(kd);
    }

    // ---------------------------------------------------------
    // hasValueDeserializerFor()
    // ---------------------------------------------------------

    @Test
    public void testHasValueDeserializerFor_forStringType_returnsTrue() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        boolean has = cache.hasValueDeserializerFor(ctxt, factory, type);
        assertTrue(has);
    }

    @Test
    public void testHasValueDeserializerFor_forBeanType_returnsTrue() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        boolean has = cache.hasValueDeserializerFor(ctxt, factory, type);
        assertTrue(has);
    }

    // ---------------------------------------------------------
    // Protected helper methods (accessible since same package)
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void test_findCachedDeserializer_nullType_throwsIllegalArgumentException() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void test_findCachedDeserializer_forUncachedType_returnsNull() {
        JavaType type = TypeFactory.defaultInstance().constructType(Double.class);
        JsonDeserializer<Object> deser = cache._findCachedDeserializer(type);
        assertNull(deser);
    }

    @Test
    public void test_createAndCacheValueDeserializer_forKnownType_returnsDeserializer() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(Long.class);
        JsonDeserializer<Object> deser = cache._createAndCacheValueDeserializer(ctxt, factory, type);
        assertNotNull(deser);
    }

    @Test(expected = JsonMappingException.class)
    public void test_handleUnknownValueDeserializer_forInterfaceType_throwsException() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(java.io.Serializable.class);
        cache._handleUnknownValueDeserializer(ctxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void test_handleUnknownKeyDeserializer_throwsException() throws JsonMappingException {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        cache._handleUnknownKeyDeserializer(ctxt, type);
    }

    // ---------------------------------------------------------
    // writeReplace() - package-private JDK serialization handling
    // ---------------------------------------------------------

    @Test
    public void testWriteReplace_returnsSameInstanceAndClearsIncompleteMap() throws Exception {
        DeserializerCache localCache = new DeserializerCache();
        Object result = localCache.writeReplace();
        assertSame(localCache, result);
        assertTrue(localCache._incompleteDeserializers.isEmpty());
    }
}
