import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;

public class DeserializerCacheTest {

    // Simple POJO for normal deserialization test
    public static class SamplePojo {
        public String name;
        public int value;
        public SamplePojo() {}
    }

    public static class AnotherPojo {
        public String field;
        public AnotherPojo() {}
    }

    interface UnknownInterface {
        void doSomething();
    }

    private static DeserializationContext capturedCtxt;
    private ObjectMapper mapper;
    private DeserializerFactory factory;
    private DeserializerCache cache;

    static class ProbeDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            capturedCtxt = ctxt;
            return p.getValueAsString();
        }
    }

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(String.class, new ProbeDeserializer());
        mapper.registerModule(module);
        // trigger deserialization to capture a real DeserializationContext instance
        mapper.readValue("\"probe\"", String.class);
        assertNotNull("Captured context should not be null", capturedCtxt);

        factory = BeanDeserializerFactory.instance;
        cache = new DeserializerCache();
    }

    @Test
    public void testCachedDeserializersCount_initially_zero() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializers_afterFlush_countIsZero() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SamplePojo.class);
        JsonDeserializer<Object> deser = cache.findValueDeserializer(capturedCtxt, factory, type);
        assertNotNull(deser);
        assertTrue(cache.cachedDeserializersCount() > 0);
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializer_normalPojo_returnsDeserializerAndCaches() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SamplePojo.class);
        JsonDeserializer<Object> deser1 = cache.findValueDeserializer(capturedCtxt, factory, type);
        assertNotNull(deser1);
        int countAfterFirst = cache.cachedDeserializersCount();
        assertTrue(countAfterFirst >= 1);

        // second call should hit cache and return same instance (if cachable)
        JsonDeserializer<Object> deser2 = cache.findValueDeserializer(capturedCtxt, factory, type);
        assertNotNull(deser2);
        assertSame(deser1, deser2);
        assertEquals(countAfterFirst, cache.cachedDeserializersCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueDeserializer_nullType_throwsIllegalArgumentException() throws Exception {
        cache.findValueDeserializer(capturedCtxt, factory, null);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindValueDeserializer_unresolvableInterface_throwsJsonMappingException() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(UnknownInterface.class);
        cache.findValueDeserializer(capturedCtxt, factory, type);
    }

    @Test
    public void testFindKeyDeserializer_stringType_returnsNonNullKeyDeserializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        KeyDeserializer kd = cache.findKeyDeserializer(capturedCtxt, factory, type);
        assertNotNull(kd);
    }

    @Test
    public void testFindKeyDeserializer_intType_returnsNonNullKeyDeserializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        KeyDeserializer kd = cache.findKeyDeserializer(capturedCtxt, factory, type);
        assertNotNull(kd);
    }

    @Test
    public void testHasValueDeserializerFor_normalPojo_returnsTrue() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SamplePojo.class);
        boolean has = cache.hasValueDeserializerFor(capturedCtxt, factory, type);
        assertTrue(has);
    }

    @Test
    public void testHasValueDeserializerFor_afterCaching_returnsTrueFromCache() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SamplePojo.class);
        // populate cache first
        cache.findValueDeserializer(capturedCtxt, factory, type);
        boolean has = cache.hasValueDeserializerFor(capturedCtxt, factory, type);
        assertTrue(has);
    }

    @Test
    public void testCachedDeserializersCount_afterMultipleTypes_countReflectsEntries() throws Exception {
        JavaType type1 = mapper.getTypeFactory().constructType(SamplePojo.class);
        JavaType type2 = mapper.getTypeFactory().constructType(AnotherPojo.class);
        cache.findValueDeserializer(capturedCtxt, factory, type1);
        cache.findValueDeserializer(capturedCtxt, factory, type2);
        assertTrue(cache.cachedDeserializersCount() >= 2);
    }

    @Test
    public void testFlushCachedDeserializers_whenEmpty_doesNotThrow() {
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializer_withDefaultInstance_constructorWorks() {
        DeserializerCache newCache = new DeserializerCache();
        assertNotNull(newCache);
        assertEquals(0, newCache.cachedDeserializersCount());
    }
}
