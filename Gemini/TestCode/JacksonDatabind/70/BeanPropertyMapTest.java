package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeanPropertyMapTest {

    private static class TestSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private Throwable throwOnDeserialize;

        public TestSettableBeanProperty(String name) {
            this(new PropertyName(name), TypeFactory.unknownType(), PropertyMetadata.STD_REQUIRED, null);
        }

        public TestSettableBeanProperty(String name, JsonDeserializer<Object> deser) {
            this(new PropertyName(name), TypeFactory.unknownType(), PropertyMetadata.STD_REQUIRED, deser);
        }

        public TestSettableBeanProperty(PropertyName propName, JavaType type, PropertyMetadata metadata, JsonDeserializer<Object> deser) {
            super(propName, type, metadata, deser);
        }

        protected TestSettableBeanProperty(TestSettableBeanProperty src, JsonDeserializer<?> deser) {
            super(src, deser);
            this.throwOnDeserialize = src.throwOnDeserialize;
        }

        protected TestSettableBeanProperty(TestSettableBeanProperty src, PropertyName newName) {
            super(src, newName);
            this.throwOnDeserialize = src.throwOnDeserialize;
        }

        public void setThrowOnDeserialize(Throwable t) {
            this.throwOnDeserialize = t;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new TestSettableBeanProperty(this, deser);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new TestSettableBeanProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withSimpleName(String simpleName) {
            return new TestSettableBeanProperty(this, new PropertyName(simpleName));
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            if (throwOnDeserialize != null) {
                if (throwOnDeserialize instanceof IOException) {
                    throw (IOException) throwOnDeserialize;
                }
                if (throwOnDeserialize instanceof RuntimeException) {
                    throw (RuntimeException) throwOnDeserialize;
                }
                if (throwOnDeserialize instanceof Error) {
                    throw (Error) throwOnDeserialize;
                }
                throw new RuntimeException(throwOnDeserialize);
            }
            if (instance instanceof Map) {
                ((Map<Object, Object>) instance).put(getName(), "value");
            }
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            deserializeAndSet(p, ctxt, instance);
            return instance;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            if (instance instanceof Map) {
                ((Map<Object, Object>) instance).put(getName(), value);
            }
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return instance;
        }
    }

    private static class UnwrappingTestDeserializer extends JsonDeserializer<Object> {
        private final boolean returnNew;

        public UnwrappingTestDeserializer(boolean returnNew) {
            this.returnNew = returnNew;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer transformer) {
            return returnNew ? new UnwrappingTestDeserializer(false) : this;
        }
    }

    private List<String> generateCollidingKeys(int count, int mask) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        int targetSlot = -1;
        while (list.size() < count) {
            String candidate = "key_" + i;
            int slot = candidate.hashCode() & mask;
            if (targetSlot == -1) {
                targetSlot = slot;
                list.add(candidate);
            } else if (slot == targetSlot) {
                list.add(candidate);
            }
            i++;
        }
        return list;
    }

    @Test
    public void testConstructAndSizes() {
        // Size <= 5 -> hashSize 8
        List<SettableBeanProperty> list5 = new ArrayList<SettableBeanProperty>();
        for (int i = 0; i < 5; i++) {
            list5.add(new TestSettableBeanProperty("prop" + i));
        }
        BeanPropertyMap map5 = BeanPropertyMap.construct(list5, false);
        assertEquals(5, map5.size());

        // Size <= 12 -> hashSize 16
        List<SettableBeanProperty> list12 = new ArrayList<SettableBeanProperty>();
        for (int i = 0; i < 12; i++) {
            list12.add(new TestSettableBeanProperty("prop" + i));
        }
        BeanPropertyMap map12 = BeanPropertyMap.construct(list12, false);
        assertEquals(12, map12.size());

        // Size > 12 -> hashSize 32+
        List<SettableBeanProperty> list25 = new ArrayList<SettableBeanProperty>();
        for (int i = 0; i < 25; i++) {
            list25.add(new TestSettableBeanProperty("prop" + i));
        }
        BeanPropertyMap map25 = BeanPropertyMap.construct(list25, false);
        assertEquals(25, map25.size());
    }

    @Test
    public void testInitWithNullProperties() {
        List<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>();
        props.add(new TestSettableBeanProperty("a"));
        props.add(null);
        props.add(new TestSettableBeanProperty("b"));

        BeanPropertyMap map = new BeanPropertyMap(false, props);
        assertEquals(3, map.size());
        assertNotNull(map.find("a"));
        assertNotNull(map.find("b"));
    }

    @Test
    public void testWithCaseInsensitivity() {
        List<SettableBeanProperty> props = Collections.singletonList(new TestSettableBeanProperty("myProp"));
        BeanPropertyMap mapCaseSensitive = new BeanPropertyMap(false, props);

        assertSame(mapCaseSensitive, mapCaseSensitive.withCaseInsensitivity(false));

        BeanPropertyMap mapCaseInsensitive = mapCaseSensitive.withCaseInsensitivity(true);
        assertNotSame(mapCaseSensitive, mapCaseInsensitive);
        assertSame(mapCaseInsensitive, mapCaseInsensitive.withCaseInsensitivity(true));

        assertNull(mapCaseSensitive.find("MYPROP"));
        assertNotNull(mapCaseInsensitive.find("MYPROP"));
        assertNotNull(mapCaseInsensitive.find("myprop"));
    }

    @Test
    public void testWithProperty_replaceExisting() {
        TestSettableBeanProperty prop1 = new TestSettableBeanProperty("testProp");
        TestSettableBeanProperty prop2 = new TestSettableBeanProperty("testProp");

        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(prop1));
        BeanPropertyMap result = map.withProperty(prop2);

        assertSame(map, result);
        assertSame(prop2, map.find("testProp"));
        assertSame(prop2, map.getPropertiesInInsertionOrder()[0]);
    }

    @Test
    public void testWithProperty_collisionAndSpilloverExpand() {
        // Find 8 colliding keys on mask 7 (size <= 5 gives mask 7)
        List<String> keys = generateCollidingKeys(8, 7);

        List<SettableBeanProperty> initial = new ArrayList<SettableBeanProperty>();
        for (int i = 0; i < 3; i++) {
            initial.add(new TestSettableBeanProperty(keys.get(i)));
        }

        BeanPropertyMap map = new BeanPropertyMap(false, initial);

        // Add remaining colliding keys to trigger secondary, spillover, and spillover resizing
        for (int i = 3; i < keys.size(); i++) {
            map = map.withProperty(new TestSettableBeanProperty(keys.get(i)));
        }

        for (String key : keys) {
            assertNotNull("Should find key " + key, map.find(key));
        }
    }

    @Test
    public void testAssignIndexesAndFindByIndex() {
        List<SettableBeanProperty> props = Arrays.asList(
                new TestSettableBeanProperty("p1"),
                new TestSettableBeanProperty("p2"),
                new TestSettableBeanProperty("p3")
        );
        BeanPropertyMap map = new BeanPropertyMap(false, props);
        map.assignIndexes();

        for (SettableBeanProperty p : map) {
            assertTrue(p.getPropertyIndex() >= 0);
            assertSame(p, map.find(p.getPropertyIndex()));
        }
        assertNull(map.find(999));
        assertNull(map.find(-1));
    }

    @Test
    public void testRenameAll() {
        List<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>();
        props.add(new TestSettableBeanProperty("prop1", new UnwrappingTestDeserializer(true)));
        props.add(new TestSettableBeanProperty("prop2", new UnwrappingTestDeserializer(false)));
        props.add(null);

        BeanPropertyMap map = new BeanPropertyMap(false, props);

        assertSame(map, map.renameAll(null));
        assertSame(map, map.renameAll(NameTransformer.NOP));

        NameTransformer transformer = new NameTransformer() {
            @Override
            public String transform(String name) {
                return "prefix_" + name;
            }

            @Override
            public String reverse(String transformed) {
                return transformed.startsWith("prefix_") ? transformed.substring(7) : null;
            }
        };

        BeanPropertyMap renamedMap = map.renameAll(transformer);
        assertNotSame(map, renamedMap);
        assertNotNull(renamedMap.find("prefix_prop1"));
        assertNotNull(renamedMap.find("prefix_prop2"));
        assertNull(renamedMap.find("prop1"));
    }

    @Test
    public void testWithoutProperties() {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("p1");
        TestSettableBeanProperty p2 = new TestSettableBeanProperty("p2");
        TestSettableBeanProperty p3 = new TestSettableBeanProperty("p3");

        BeanPropertyMap map = new BeanPropertyMap(false, Arrays.asList(p1, p2, p3));

        assertSame(map, map.withoutProperties(Collections.<String>emptyList()));

        BeanPropertyMap trimmed = map.withoutProperties(Arrays.asList("p1", "p3"));
        assertEquals(1, trimmed.size());
        assertNull(trimmed.find("p1"));
        assertNotNull(trimmed.find("p2"));
        assertNull(trimmed.find("p3"));
    }

    @Test
    public void testReplace_success() {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("p1");
        TestSettableBeanProperty p2 = new TestSettableBeanProperty("p2");

        BeanPropertyMap map = new BeanPropertyMap(false, Arrays.asList(p1, p2));

        TestSettableBeanProperty p1Replacement = new TestSettableBeanProperty("p1");
        map.replace(p1Replacement);

        assertSame(p1Replacement, map.find("p1"));
        assertSame(p1Replacement, map.getPropertiesInInsertionOrder()[0]);
    }

    @Test(expected = NoSuchElementException.class)
    public void testReplace_notFoundThrowsException() {
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(new TestSettableBeanProperty("p1")));
        map.replace(new TestSettableBeanProperty("nonExisting"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFind_nullKeyThrowsException() {
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.emptyList());
        map.find(null);
    }

    @Test
    public void testFind_primarySecondarySpillAndMiss() {
        List<String> keys = generateCollidingKeys(4, 7);
        List<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>();
        for (String k : keys) {
            props.add(new TestSettableBeanProperty(k));
        }

        BeanPropertyMap map = new BeanPropertyMap(false, props);

        // Found in primary, secondary, spill
        for (String k : keys) {
            assertNotNull(map.find(k));
        }

        // Miss matching slot
        assertNull(map.find("unknownKey"));
    }

    @Test
    public void testRemove_successAndNotFound() {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("p1");
        TestSettableBeanProperty p2 = new TestSettableBeanProperty("p2");
        BeanPropertyMap map = new BeanPropertyMap(false, Arrays.asList(p1, p2));

        map.remove(p1);
        assertEquals(1, map.size());
        assertNull(map.find("p1"));
        assertNotNull(map.find("p2"));

        try {
            map.remove(p1);
            fail("Should have thrown NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertTrue(e.getMessage().contains("No entry 'p1' found"));
        }
    }

    @Test
    public void testFindDeserializeAndSet_normal() throws IOException {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("target");
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));

        Map<String, Object> bean = new HashMap<String, Object>();
        boolean found = map.findDeserializeAndSet(null, null, bean, "target");

        assertTrue(found);
        assertEquals("value", bean.get("target"));

        boolean notFound = map.findDeserializeAndSet(null, null, bean, "missing");
        assertFalse(notFound);
    }

    @Test(expected = AssertionError.class)
    public void testFindDeserializeAndSet_rethrowError() throws IOException {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("target");
        p1.setThrowOnDeserialize(new AssertionError("Fatal error"));
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));

        map.findDeserializeAndSet(null, null, new HashMap<String, Object>(), "target");
    }

    @Test
    public void testFindDeserializeAndSet_unwrapInvocationTargetException() throws IOException {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("target");
        p1.setThrowOnDeserialize(new InvocationTargetException(new IOException("Root io issue")));
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));

        try {
            map.findDeserializeAndSet(null, null, new HashMap<String, Object>(), "target");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Root io issue"));
        }
    }

    @Test(expected = IOException.class)
    public void testFindDeserializeAndSet_ioExceptionNoWrap() throws IOException {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("target");
        p1.setThrowOnDeserialize(new IOException("Raw IO"));
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.WRAP_EXCEPTIONS);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        map.findDeserializeAndSet(null, ctxt, new HashMap<String, Object>(), "target");
    }

    @Test(expected = RuntimeException.class)
    public void testFindDeserializeAndSet_runtimeExceptionNoWrap() throws IOException {
        TestSettableBeanProperty p1 = new TestSettableBeanProperty("target");
        p1.setThrowOnDeserialize(new IllegalArgumentException("Invalid argument"));
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.WRAP_EXCEPTIONS);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        map.findDeserializeAndSet(null, ctxt, new HashMap<String, Object>(), "target");
    }

    @Test
    public void testToString() {
        BeanPropertyMap emptyMap = new BeanPropertyMap(false, Collections.emptyList());
        assertEquals("Properties=[]", emptyMap.toString());

        TestSettableBeanProperty p1 = new TestSettableBeanProperty("name");
        TestSettableBeanProperty p2 = new TestSettableBeanProperty("age");
        BeanPropertyMap map = new BeanPropertyMap(false, Arrays.asList(p1, p2));

        String str = map.toString();
        assertTrue(str.startsWith("Properties=["));
        assertTrue(str.contains("name("));
        assertTrue(str.contains("age("));
        assertTrue(str.endsWith("]"));
    }

    @Test
    public void testProtectedRenameNull() {
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.emptyList());
        assertNull(map._rename(null, NameTransformer.NOP));
    }
}
