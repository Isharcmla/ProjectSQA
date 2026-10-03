package org.apache.commons.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.junit.Assert;
import org.junit.Test;

public class MultiValueMapTest {

    @Test
    public void testDefaultConstructor_successfulInitialization() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
        Assert.assertEquals(0, map.totalSize());
    }

    @Test
    public void testDecorateMap_successfulDecorator() {
        Map baseMap = new HashMap();
        MultiValueMap map = MultiValueMap.decorate(baseMap);
        Assert.assertNotNull(map);
        map.put("key1", "val1");
        Assert.assertTrue(baseMap.containsKey("key1"));
    }

    @Test
    public void testDecorateMapAndClass_usesSpecifiedCollectionClass() {
        Map baseMap = new HashMap();
        MultiValueMap map = MultiValueMap.decorate(baseMap, TreeSet.class);
        map.put("key1", "valB");
        map.put("key1", "valA");
        Collection coll = map.getCollection("key1");
        Assert.assertTrue(coll instanceof TreeSet);
        Assert.assertEquals(2, coll.size());
        Iterator it = coll.iterator();
        Assert.assertEquals("valA", it.next());
        Assert.assertEquals("valB", it.next());
    }

    @Test(expected = FunctorException.class)
    public void testDecorateMapAndClass_invalidClassInstantiation_throwsFunctorException() {
        // Collection.class is an interface and cannot be instantiated
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), Collection.class);
        map.put("key1", "val1");
    }

    @Test
    public void testDecorateMapAndFactory_usesProvidedFactory() {
        Factory factory = new Factory() {
            public Object create() {
                return new HashSet();
            }
        };
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), factory);
        map.put("key1", "val1");
        map.put("key1", "val1"); // Set should ignore duplicates
        Collection coll = map.getCollection("key1");
        Assert.assertTrue(coll instanceof HashSet);
        Assert.assertEquals(1, coll.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFactory_throwsIllegalArgumentException() {
        new MultiValueMap(new HashMap(), null);
    }

    @Test
    public void testPut_singleAndMultipleValues() {
        MultiValueMap map = new MultiValueMap();

        // First put on key: returns null according to implementation logic (coll.size() > 0 sets result = false)
        Object res1 = map.put("keyA", "val1");
        Assert.assertNull(res1);
        Assert.assertEquals(1, map.size("keyA"));

        // Subsequent put on same key: returns value
        Object res2 = map.put("keyA", "val2");
        Assert.assertEquals("val2", res2);
        Assert.assertEquals(2, map.size("keyA"));

        // Null key and null value
        Object res3 = map.put(null, null);
        Assert.assertNull(res3);
        Assert.assertTrue(map.containsKey(null));
        Assert.assertTrue(map.containsValue(null, null));
    }

    @Test
    public void testPutAllKeyAndCollection_normalAndEdgeCases() {
        MultiValueMap map = new MultiValueMap();

        // null and empty collection
        Assert.assertFalse(map.putAll("k1", (Collection) null));
        Assert.assertFalse(map.putAll("k1", new ArrayList()));
        Assert.assertFalse(map.containsKey("k1"));

        // First putAll for key
        List values = Arrays.asList(new String[]{"v1", "v2"});
        boolean changed1 = map.putAll("k1", values);
        // Implementation note: initial putAll returns false due to coll.size() > 0 check, but collection is put into map
        Assert.assertFalse(changed1);
        Assert.assertEquals(2, map.size("k1"));

        // Second putAll for existing key
        List moreValues = Arrays.asList(new String[]{"v3"});
        boolean changed2 = map.putAll("k1", moreValues);
        Assert.assertTrue(changed2);
        Assert.assertEquals(3, map.size("k1"));
    }

    @Test
    public void testPutAllMap_standardMapAndMultiMap() {
        MultiValueMap map = new MultiValueMap();

        // 1. Normal Map
        Map standardMap = new HashMap();
        standardMap.put("A", "1");
        standardMap.put("B", "2");
        map.putAll(standardMap);

        Assert.assertEquals(1, map.size("A"));
        Assert.assertEquals(1, map.size("B"));

        // 2. MultiMap instance
        MultiValueMap multiMapSource = new MultiValueMap();
        multiMapSource.put("A", "3");
        multiMapSource.put("A", "4");
        multiMapSource.put("C", "5");

        map.putAll(multiMapSource);
        Assert.assertEquals(3, map.size("A"));
        Assert.assertEquals(1, map.size("B"));
        Assert.assertEquals(1, map.size("C"));
    }

    @Test
    public void testGetCollection_existingAndMissingKeys() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertNull(map.getCollection("nonExistent"));

        map.put("key", "val1");
        Collection coll = map.getCollection("key");
        Assert.assertNotNull(coll);
        Assert.assertEquals(1, coll.size());
        Assert.assertTrue(coll.contains("val1"));
    }

    @Test
    public void testSizeByKey_andTotalSize() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertEquals(0, map.size("missing"));
        Assert.assertEquals(0, map.totalSize());

        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Assert.assertEquals(2, map.size("k1"));
        Assert.assertEquals(1, map.size("k2"));
        Assert.assertEquals(0, map.size("k3"));
        Assert.assertEquals(3, map.totalSize());
    }

    @Test
    public void testContainsValue_byValueOnly() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertFalse(map.containsValue("v1"));

        map.put("k1", "v1");
        map.put("k2", "v2");

        Assert.assertTrue(map.containsValue("v1"));
        Assert.assertTrue(map.containsValue("v2"));
        Assert.assertFalse(map.containsValue("v3"));
    }

    @Test
    public void testContainsValue_byKeyAndValue() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertFalse(map.containsValue("k1", "v1"));

        map.put("k1", "v1");
        Assert.assertTrue(map.containsValue("k1", "v1"));
        Assert.assertFalse(map.containsValue("k1", "v2"));
        Assert.assertFalse(map.containsValue("missing", "v1"));
    }

    @Test
    public void testRemoveMapping_variousCases() {
        MultiValueMap map = new MultiValueMap();
        // 1. Key doesn't exist
        Assert.assertNull(map.removeMapping("missing", "val"));

        // 2. Key exists, value doesn't exist
        map.put("k1", "v1");
        map.put("k1", "v2");
        Assert.assertNull(map.removeMapping("k1", "v3"));
        Assert.assertEquals(2, map.size("k1"));

        // 3. Key exists, remove one of values (collection not empty)
        Object removed1 = map.removeMapping("k1", "v1");
        Assert.assertEquals("v1", removed1);
        Assert.assertEquals(1, map.size("k1"));
        Assert.assertTrue(map.containsKey("k1"));

        // 4. Key exists, remove last remaining value (collection becomes empty -> key removed)
        Object removed2 = map.removeMapping("k1", "v2");
        Assert.assertEquals("v2", removed2);
        Assert.assertFalse(map.containsKey("k1"));
        Assert.assertNull(map.getCollection("k1"));
    }

    @Test
    public void testClear_removesAllEntries() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals(2, map.totalSize());

        map.clear();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.totalSize());
        Assert.assertNull(map.getCollection("k1"));
    }

    @Test
    public void testIteratorByKey_presentAndAbsent() {
        MultiValueMap map = new MultiValueMap();

        // Absent key returns EmptyIterator
        Iterator emptyIt = map.iterator("absent");
        Assert.assertSame(EmptyIterator.INSTANCE, emptyIt);
        Assert.assertFalse(emptyIt.hasNext());

        // Present key returns ValuesIterator
        map.put("k1", "v1");
        map.put("k1", "v2");
        Iterator it = map.iterator("k1");
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("v1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("v2", it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorByKey_removeLastElementRemovesKey() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");

        Iterator it = map.iterator("k1");
        Assert.assertEquals("v1", it.next());
        it.remove();
        Assert.assertEquals(1, map.size("k1"));
        Assert.assertTrue(map.containsKey("k1"));

        Assert.assertEquals("v2", it.next());
        it.remove();
        Assert.assertFalse(map.containsKey("k1"));
        Assert.assertEquals(0, map.size("k1"));
    }

    @Test
    public void testValuesCollection_viewOperations() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Collection vals = map.values();
        // Repeated call returns cached instance
        Assert.assertSame(vals, map.values());
        Assert.assertEquals(3, vals.size());

        // Iterate through all values
        List collected = new ArrayList();
        for (Iterator it = vals.iterator(); it.hasNext();) {
            collected.add(it.next());
        }
        Assert.assertEquals(3, collected.size());
        Assert.assertTrue(collected.contains("v1"));
        Assert.assertTrue(collected.contains("v2"));
        Assert.assertTrue(collected.contains("v3"));

        // ValuesIterator.remove() via values() iterator
        Iterator vit = vals.iterator();
        while (vit.hasNext()) {
            Object v = vit.next();
            if ("v3".equals(v)) {
                vit.remove();
            }
        }
        Assert.assertFalse(map.containsKey("k2"));
        Assert.assertEquals(2, map.totalSize());

        // values.clear() clears the outer map
        vals.clear();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.totalSize());
    }

    @Test
    public void testCreateCollection_subclassOverride() {
        MultiValueMap customMap = new MultiValueMap(new HashMap(), new Factory() {
            public Object create() {
                return new ArrayList();
            }
        }) {
            protected Collection createCollection(int size) {
                return new HashSet();
            }
        };

        customMap.put("k1", "v1");
        Collection coll = customMap.getCollection("k1");
        Assert.assertTrue(coll instanceof HashSet);
    }
}
