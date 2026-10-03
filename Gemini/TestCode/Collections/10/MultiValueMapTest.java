package org.apache.commons.collections.map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.junit.Assert;
import org.junit.Test;

public class MultiValueMapTest {

    @Test
    public void testConstructor_default_createsHashMapAndArrayList() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertEquals(0, map.size());
        Assert.assertEquals(0, map.totalSize());
        map.put("key1", "val1");
        Collection coll = map.getCollection("key1");
        Assert.assertTrue(coll instanceof ArrayList);
        Assert.assertEquals(1, coll.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFactory_throwsIllegalArgumentException() {
        new MultiValueMap(new HashMap(), null);
    }

    @Test
    public void testDecorate_mapOnly_createsArrayListBackedMap() {
        Map baseMap = new HashMap();
        MultiValueMap map = MultiValueMap.decorate(baseMap);
        map.put("key1", "val1");
        Collection coll = map.getCollection("key1");
        Assert.assertTrue(coll instanceof ArrayList);
        Assert.assertEquals(1, coll.size());
    }

    @Test
    public void testDecorate_mapAndCollectionClass_createsSpecifiedCollectionClass() {
        Map baseMap = new HashMap();
        MultiValueMap map = MultiValueMap.decorate(baseMap, HashSet.class);
        map.put("key1", "val1");
        Collection coll = map.getCollection("key1");
        Assert.assertTrue(coll instanceof HashSet);
        Assert.assertEquals(1, coll.size());
    }

    @Test(expected = FunctorException.class)
    public void testDecorate_abstractCollectionClass_throwsFunctorExceptionOnPut() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), AbstractList.class);
        map.put("key1", "val1");
    }

    @Test
    public void testDecorate_mapAndFactory_createsCustomFactoryCollection() {
        Factory factory = new Factory() {
            public Object create() {
                return new TreeSet();
            }
        };
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), factory);
        map.put("key1", "val1");
        Collection coll = map.getCollection("key1");
        Assert.assertTrue(coll instanceof TreeSet);
        Assert.assertEquals(1, coll.size());
    }

    @Test
    public void testPut_newKey_addsCollectionAndReturnsValue() {
        MultiValueMap map = new MultiValueMap();
        Object result = map.put("key1", "val1");
        Assert.assertEquals("val1", result);
        Assert.assertEquals(1, map.size("key1"));
        Assert.assertEquals(1, map.totalSize());
    }

    @Test
    public void testPut_existingKey_addsToCollection() {
        MultiValueMap map = new MultiValueMap();
        map.put("key1", "val1");
        Object result = map.put("key1", "val2");
        Assert.assertEquals("val2", result);
        Assert.assertEquals(2, map.size("key1"));
        Assert.assertEquals(2, map.totalSize());
    }

    @Test
    public void testPut_duplicateInSetBackedMap_returnsNullWhenNotChanged() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), HashSet.class);
        Assert.assertEquals("val1", map.put("key1", "val1"));
        Assert.assertNull(map.put("key1", "val1"));
        Assert.assertEquals(1, map.size("key1"));
    }

    @Test
    public void testPutAll_standardMap_addsAllEntries() {
        MultiValueMap map = new MultiValueMap();
        Map normalMap = new HashMap();
        normalMap.put("k1", "v1");
        normalMap.put("k2", "v2");

        map.putAll(normalMap);
        Assert.assertEquals(2, map.totalSize());
        Assert.assertTrue(map.containsValue("k1", "v1"));
        Assert.assertTrue(map.containsValue("k2", "v2"));
    }

    @Test
    public void testPutAll_multiMap_addsAllEntries() {
        MultiValueMap src = new MultiValueMap();
        src.put("k1", "v1_1");
        src.put("k1", "v1_2");
        src.put("k2", "v2_1");

        MultiValueMap dest = new MultiValueMap();
        dest.putAll(src);

        Assert.assertEquals(3, dest.totalSize());
        Assert.assertEquals(2, dest.size("k1"));
        Assert.assertEquals(1, dest.size("k2"));
        Assert.assertTrue(dest.containsValue("k1", "v1_1"));
        Assert.assertTrue(dest.containsValue("k1", "v1_2"));
        Assert.assertTrue(dest.containsValue("k2", "v2_1"));
    }

    @Test
    public void testPutAll_keyAndNullOrEmptyCollection_returnsFalse() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertFalse(map.putAll("k1", null));
        Assert.assertFalse(map.putAll("k1", Collections.emptyList()));
        Assert.assertEquals(0, map.totalSize());
    }

    @Test
    public void testPutAll_keyAndValidCollection_newKey_returnsTrue() {
        MultiValueMap map = new MultiValueMap();
        boolean result = map.putAll("k1", Arrays.asList("v1", "v2"));
        Assert.assertTrue(result);
        Assert.assertEquals(2, map.size("k1"));
        Assert.assertEquals(2, map.totalSize());
    }

    @Test
    public void testPutAll_keyAndValidCollection_existingKey_returnsTrue() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        boolean result = map.putAll("k1", Arrays.asList("v2", "v3"));
        Assert.assertTrue(result);
        Assert.assertEquals(3, map.size("k1"));
    }

    @Test
    public void testPutAll_keyAndDuplicateInSet_returnsFalseWhenNotModified() {
        MultiValueMap map = MultiValueMap.decorate(new HashMap(), HashSet.class);
        map.put("k1", "v1");
        boolean result = map.putAll("k1", Collections.singletonList("v1"));
        Assert.assertFalse(result);
        Assert.assertEquals(1, map.size("k1"));
    }

    @Test
    public void testRemoveMapping_keyNotFound_returnsNull() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertNull(map.removeMapping("nonExistingKey", "val"));
    }

    @Test
    public void testRemoveMapping_valueNotFound_returnsNull() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        Assert.assertNull(map.removeMapping("k1", "nonExistingVal"));
        Assert.assertEquals(1, map.size("k1"));
    }

    @Test
    public void testRemoveMapping_removesValueKeepKeyIfNotEmpty() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");

        Object removed = map.removeMapping("k1", "v1");
        Assert.assertEquals("v1", removed);
        Assert.assertEquals(1, map.size("k1"));
        Assert.assertTrue(map.containsKey("k1"));
    }

    @Test
    public void testRemoveMapping_removesValueAndRemovesKeyIfEmpty() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");

        Object removed = map.removeMapping("k1", "v1");
        Assert.assertEquals("v1", removed);
        Assert.assertEquals(0, map.size("k1"));
        Assert.assertFalse(map.containsKey("k1"));
        Assert.assertNull(map.get("k1"));
    }

    @Test
    public void testContainsValue_singleArg_foundAndNotFound() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertFalse(map.containsValue("v1"));

        map.put("k1", "v1");
        map.put("k2", "v2");

        Assert.assertTrue(map.containsValue("v1"));
        Assert.assertTrue(map.containsValue("v2"));
        Assert.assertFalse(map.containsValue("v3"));
    }

    @Test
    public void testContainsValue_keyAndValue_foundAndNotFound() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertFalse(map.containsValue("k1", "v1"));

        map.put("k1", "v1");
        Assert.assertTrue(map.containsValue("k1", "v1"));
        Assert.assertFalse(map.containsValue("k1", "v2"));
        Assert.assertFalse(map.containsValue("k2", "v1"));
    }

    @Test
    public void testGetCollection_keyExistsAndNotExists() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertNull(map.getCollection("k1"));

        map.put("k1", "v1");
        Collection coll = map.getCollection("k1");
        Assert.assertNotNull(coll);
        Assert.assertTrue(coll.contains("v1"));
    }

    @Test
    public void testSize_keyExistsAndNotExists() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertEquals(0, map.size("k1"));

        map.put("k1", "v1");
        map.put("k1", "v2");
        Assert.assertEquals(2, map.size("k1"));
    }

    @Test
    public void testTotalSize_tracksAcrossMultipleKeys() {
        MultiValueMap map = new MultiValueMap();
        Assert.assertEquals(0, map.totalSize());

        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");
        Assert.assertEquals(3, map.totalSize());
    }

    @Test
    public void testClear_removesAllEntries() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals(2, map.totalSize());

        map.clear();
        Assert.assertEquals(0, map.totalSize());
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testIterator_keyNotExists_returnsEmptyIterator() {
        MultiValueMap map = new MultiValueMap();
        Iterator it = map.iterator("nonExistingKey");
        Assert.assertSame(EmptyIterator.INSTANCE, it);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_keyExists_iteratesAndRemoves() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");

        Iterator it = map.iterator("k1");
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("v1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("v2", it.next());
        Assert.assertFalse(it.hasNext());

        // Test remove via iterator
        Iterator removeIt = map.iterator("k1");
        Assert.assertEquals("v1", removeIt.next());
        removeIt.remove();
        Assert.assertEquals(1, map.size("k1"));
        Assert.assertEquals("v2", removeIt.next());
        removeIt.remove();
        Assert.assertEquals(0, map.size("k1"));
        Assert.assertFalse(map.containsKey("k1"));
    }

    @Test
    public void testValues_sizeAndClear() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        Collection values = map.values();
        Assert.assertEquals(3, values.size());

        values.clear();
        Assert.assertEquals(0, map.totalSize());
        Assert.assertEquals(0, values.size());
    }

    @Test
    public void testValues_iterator_iteratesAllAndRemoves() {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Collection values = map.values();
        Iterator it = values.iterator();
        Set collected = new HashSet();
        while (it.hasNext()) {
            collected.add(it.next());
        }
        Assert.assertEquals(2, collected.size());
        Assert.assertTrue(collected.contains("v1"));
        Assert.assertTrue(collected.contains("v2"));

        Iterator removeIt = map.values().iterator();
        while (removeIt.hasNext()) {
            removeIt.next();
            removeIt.remove();
        }
        Assert.assertEquals(0, map.totalSize());
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testSerialization_roundTrip_preservesState() throws Exception {
        MultiValueMap map = new MultiValueMap();
        map.put("k1", "v1");
        map.put("k1", "v2");
        map.put("k2", "v3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MultiValueMap deserialized = (MultiValueMap) ois.readObject();

        Assert.assertEquals(3, deserialized.totalSize());
        Assert.assertEquals(2, deserialized.size("k1"));
        Assert.assertEquals(1, deserialized.size("k2"));
        Assert.assertTrue(deserialized.containsValue("k1", "v1"));
        Assert.assertTrue(deserialized.containsValue("k1", "v2"));
        Assert.assertTrue(deserialized.containsValue("k2", "v3"));
    }
}
