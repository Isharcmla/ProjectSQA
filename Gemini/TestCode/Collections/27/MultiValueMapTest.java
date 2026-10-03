package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.junit.Test;

public class MultiValueMapTest {

    @Test
    public void testDefaultConstructor() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testFactoryConstructorWithValidFactory() {
        Factory<HashSet<String>> factory = new Factory<HashSet<String>>() {
            @Override
            public HashSet<String> create() {
                return new HashSet<String>();
            }
        };
        MultiValueMap<String, String> map = new MultiValueMap<String, String>(new HashMap<String, Object>(), factory);
        map.put("key1", "val1");
        map.put("key1", "val1"); // duplicate in set should not increase size
        assertEquals(1, map.size("key1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryConstructorWithNullFactory_throwsException() {
        new MultiValueMap<String, String>(new HashMap<String, Object>(), null);
    }

    @Test
    public void testStaticFactoryMapOnly() {
        Map<String, Object> baseMap = new HashMap<String, Object>();
        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(baseMap);
        map.put("A", "1");
        assertEquals(1, map.totalSize());
        assertTrue(map.getCollection("A") instanceof ArrayList);
    }

    @Test
    public void testStaticFactoryMapAndClass() {
        Map<String, Object> baseMap = new HashMap<String, Object>();
        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(baseMap, LinkedList.class);
        map.put("A", "1");
        assertEquals(1, map.totalSize());
        assertTrue(map.getCollection("A") instanceof LinkedList);
    }

    @Test
    public void testStaticFactoryMapAndFactory() {
        Map<String, Object> baseMap = new HashMap<String, Object>();
        Factory<Collection<String>> factory = new Factory<Collection<String>>() {
            @Override
            public Collection<String> create() {
                return new ArrayList<String>();
            }
        };
        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(baseMap, factory);
        map.put("A", "1");
        assertEquals(1, map.totalSize());
    }

    @Test(expected = FunctorException.class)
    public void testReflectionFactory_instantiationFailure_throwsFunctorException() {
        // Abstract class cannot be instantiated by ReflectionFactory
        MultiValueMap<String, String> map = MultiValueMap.multiValueMap(new HashMap<String, Object>(), AbstractCollection.class);
        map.put("A", "1");
    }

    @Test
    public void testPut_and_GetCollection() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertNull(map.getCollection("key1"));

        Object putResult1 = map.put("key1", "val1");
        assertEquals("val1", putResult1);
        assertEquals(1, map.getCollection("key1").size());

        Object putResult2 = map.put("key1", "val2");
        assertEquals("val2", putResult2);
        assertEquals(2, map.getCollection("key1").size());

        // Test with null key and null value
        map.put(null, null);
        assertEquals(1, map.getCollection(null).size());
        assertTrue(map.getCollection(null).contains(null));
    }

    @Test
    public void testPutAll_Collection() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        
        // Null or empty collection to putAll
        assertFalse(map.putAll("key1", null));
        assertFalse(map.putAll("key1", Collections.<String>emptyList()));

        // Add collection to non-existing key
        assertTrue(map.putAll("key1", Arrays.asList("A", "B")));
        assertEquals(2, map.size("key1"));

        // Add collection to existing key
        assertTrue(map.putAll("key1", Arrays.asList("C", "D")));
        assertEquals(4, map.size("key1"));
    }

    @Test
    public void testPutAll_NormalMap() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("k1", "v1");
        normalMap.put("k2", "v2");

        map.putAll(normalMap);
        assertEquals(2, map.totalSize());
        assertEquals(1, map.size("k1"));
        assertEquals(1, map.size("k2"));
    }

    @Test
    public void testPutAll_MultiMap() {
        MultiValueMap<String, String> source = new MultiValueMap<String, String>();
        source.put("k1", "v1");
        source.put("k1", "v2");
        source.put("k2", "v3");

        MultiValueMap<String, String> target = new MultiValueMap<String, String>();
        target.put("k1", "v0");
        target.putAll(source);

        assertEquals(4, target.totalSize());
        assertEquals(3, target.size("k1"));
        assertEquals(1, target.size("k2"));
        assertTrue(target.getCollection("k1").containsAll(Arrays.asList("v0", "v1", "v2")));
    }

    @Test
    public void testRemoveMapping() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        // Non-existing key
        assertFalse(map.removeMapping("k1", "v1"));

        map.put("k1", "v1");
        map.put("k1", "v2");
        // Non-existing value under existing key
        assertFalse(map.removeMapping("k1", "nonexistent"));
        assertEquals(2, map.size("k1"));

        // Existing value, key still has elements left
        assertTrue(map.removeMapping("k1", "v1"));
        assertEquals(1, map.size("k1"));
        assertNotNull(map.get("k1"));

        // Last value removed, key should be removed from map
        assertTrue(map.removeMapping("k1", "v2"));
        assertNull(map.get("k1"));
        assertFalse(map.containsKey("k1"));
    }

    @Test
    public void testContainsValue_Global() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertFalse(map.containsValue("v1"));

        map.put("k1", "v1");
        map.put("k2", "v2");
        assertTrue(map.containsValue("v1"));
        assertTrue(map.containsValue("v2"));
        assertFalse(map.containsValue("v3"));
    }

    @Test
    public void testContainsValue_ForKey() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertFalse(map.containsValue("k1", "v1"));

        map.put("k1", "v1");
        assertTrue(map.containsValue("k1", "v1"));
        assertFalse(map.containsValue("k1", "v2"));
        assertFalse(map.containsValue("k2", "v1"));
    }

    @Test
    public void testSizeForKey() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertEquals(0, map.size("k1"));

        map.put("k1", "v1");
        map.put("k1", "v2");
        assertEquals(2, map.size("k1"));
        assertEquals(0, map.size("nonexistent"));
    }

    @Test
    public void testTotalSize() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        assertEquals(0, map.totalSize());

        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");
        assertEquals(3, map.totalSize());

        map.clear();
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testClear() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertFalse(map.isEmpty());

        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.totalSize());
        assertNull(map.getCollection("k1"));
    }

    @Test
    public void testEntrySet() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k1", "v1");
        map.put("k1", "v2");

        Set<Map.Entry<String, Object>> entries = map.entrySet();
        assertEquals(1, entries.size());
        Map.Entry<String, Object> entry = entries.iterator().next();
        assertEquals("k1", entry.getKey());
        assertTrue(entry.getValue() instanceof Collection);
        assertEquals(2, ((Collection<?>) entry.getValue()).size());
    }

    @Test
    public void testValues() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Collection<Object> values = map.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("v1"));
        assertTrue(values.contains("v2"));
        assertTrue(values.contains("v3"));

        // Test Values iterator and remove
        Iterator<Object> it = values.iterator();
        while (it.hasNext()) {
            Object val = it.next();
            if ("v1".equals(val) || "v2".equals(val)) {
                it.remove();
            }
        }
        assertEquals(1, map.totalSize());
        assertFalse(map.containsKey("k1")); // k1 should be removed because all its values were removed
        assertTrue(map.containsKey("k2"));

        // Test Values.clear()
        values.clear();
        assertEquals(0, map.totalSize());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testIteratorForKey() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        // Non-existent key returns empty iterator
        Iterator<String> emptyIt = map.iterator("nonexistent");
        assertNotNull(emptyIt);
        assertFalse(emptyIt.hasNext());

        map.put("k1", "v1");
        map.put("k1", "v2");
        Iterator<String> it = map.iterator("k1");
        assertTrue(it.hasNext());
        assertEquals("v1", it.next());
        it.remove();
        assertEquals(1, map.size("k1"));
        assertTrue(map.containsKey("k1"));

        assertEquals("v2", it.next());
        it.remove(); // removes last element in k1
        assertFalse(map.containsKey("k1"));
        assertNull(map.getCollection("k1"));
    }

    @Test
    public void testIterator() {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        Iterator<Map.Entry<String, String>> it = map.iterator();
        assertFalse(it.hasNext());

        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Iterator<Map.Entry<String, String>> it2 = map.iterator();
        int count = 0;
        while (it2.hasNext()) {
            Map.Entry<String, String> entry = it2.next();
            assertNotNull(entry.getKey());
            assertNotNull(entry.getValue());
            try {
                entry.setValue("newVal");
                fail("Entry.setValue should throw UnsupportedOperationException");
            } catch (UnsupportedOperationException expected) {
                // expected
            }
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testSerialization() throws Exception {
        MultiValueMap<String, String> map = new MultiValueMap<String, String>();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        MultiValueMap<String, String> deserialized = (MultiValueMap<String, String>) ois.readObject();
        ois.close();

        assertEquals(map.size(), deserialized.size());
        assertEquals(map.totalSize(), deserialized.totalSize());
        assertEquals(2, deserialized.size("k1"));
        assertEquals(1, deserialized.size("k2"));
        assertTrue(deserialized.containsValue("k1", "v1"));
        assertTrue(deserialized.containsValue("k1", "v2"));
        assertTrue(deserialized.containsValue("k2", "v3"));
    }
}
