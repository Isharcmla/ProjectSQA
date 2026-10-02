import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.MultiMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MultiValueMapTest {

    private MultiValueMap map;

    @Before
    public void setUp() {
        map = new MultiValueMap();
    }

    // ---------------- decorate factory methods ----------------

    @Test
    public void testDecorateMap_normal_returnsWorkingMap() {
        Map baseMap = new HashMap();
        MultiValueMap result = MultiValueMap.decorate(baseMap);
        Assert.assertNotNull(result);
        result.put("key", "value");
        Assert.assertTrue(result.containsValue("key", "value"));
    }

    @Test
    public void testDecorateMapClass_normal_usesLinkedList() {
        Map baseMap = new HashMap();
        MultiValueMap result = MultiValueMap.decorate(baseMap, LinkedList.class);
        result.put("key", "value1");
        result.put("key", "value2");
        Collection coll = result.getCollection("key");
        Assert.assertTrue(coll instanceof LinkedList);
        Assert.assertEquals(2, coll.size());
    }

    @Test
    public void testDecorateMapFactory_normal_usesFactory() {
        Map baseMap = new HashMap();
        Factory factory = new Factory() {
            public Object create() {
                return new ArrayList();
            }
        };
        MultiValueMap result = MultiValueMap.decorate(baseMap, factory);
        result.put("key", "value");
        Assert.assertTrue(result.containsValue("key", "value"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateMapFactory_nullFactory_throwsException() {
        Map baseMap = new HashMap();
        MultiValueMap.decorate(baseMap, (Factory) null);
    }

    // ---------------- constructor ----------------

    @Test
    public void testDefaultConstructor_createsEmptyMap() {
        MultiValueMap m = new MultiValueMap();
        Assert.assertTrue(m.isEmpty());
    }

    // ---------------- clear ----------------

    @Test
    public void testClear_removesAllEntries() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        Assert.assertFalse(map.isEmpty());
        map.clear();
        Assert.assertTrue(map.isEmpty());
    }

    // ---------------- removeMapping ----------------

    @Test
    public void testRemoveMapping_existingValue_returnsValueAndUpdatesMap() {
        map.put("key", "value1");
        map.put("key", "value2");
        Object removed = map.removeMapping("key", "value1");
        Assert.assertEquals("value1", removed);
        Collection coll = map.getCollection("key");
        Assert.assertEquals(1, coll.size());
        Assert.assertFalse(coll.contains("value1"));
    }

    @Test
    public void testRemoveMapping_lastValue_removesKeyEntirely() {
        map.put("key", "value1");
        Object removed = map.removeMapping("key", "value1");
        Assert.assertEquals("value1", removed);
        Assert.assertNull(map.getCollection("key"));
    }

    @Test
    public void testRemoveMapping_nonExistingKey_returnsNull() {
        Object removed = map.removeMapping("noKey", "value");
        Assert.assertNull(removed);
    }

    @Test
    public void testRemoveMapping_nonExistingValue_returnsNull() {
        map.put("key", "value1");
        Object removed = map.removeMapping("key", "valueX");
        Assert.assertNull(removed);
    }

    // ---------------- containsValue(Object) ----------------

    @Test
    public void testContainsValue_existingValue_returnsTrue() {
        map.put("key", "value1");
        Assert.assertTrue(map.containsValue("value1"));
    }

    @Test
    public void testContainsValue_nonExistingValue_returnsFalse() {
        map.put("key", "value1");
        Assert.assertFalse(map.containsValue("value2"));
    }

    @Test
    public void testContainsValue_emptyMap_returnsFalse() {
        Assert.assertFalse(map.containsValue("anything"));
    }

    // ---------------- put ----------------

    @Test
    public void testPut_newKey_returnsValue() {
        Object result = map.put("key", "value1");
        Assert.assertEquals("value1", result);
        Assert.assertTrue(map.containsValue("key", "value1"));
    }

    @Test
    public void testPut_existingKey_addsAnotherValue() {
        map.put("key", "value1");
        Object result = map.put("key", "value2");
        Assert.assertEquals("value2", result);
        Assert.assertEquals(2, map.size("key"));
    }

    @Test
    public void testPut_nullValue_addsNull() {
        Object result = map.put("key", null);
        Assert.assertNull(result);
        // Since the collection now contains null, and result is null because coll.add(null) added element (result should be true, but since size>0 special-case sets result false)
        Assert.assertEquals(1, map.size("key"));
    }

    // ---------------- putAll(Map) ----------------

    @Test
    public void testPutAllMap_normalMap_addsAllEntries() {
        Map source = new HashMap();
        source.put("key1", "value1");
        source.put("key2", "value2");
        map.putAll(source);
        Assert.assertTrue(map.containsValue("key1", "value1"));
        Assert.assertTrue(map.containsValue("key2", "value2"));
    }

    @Test
    public void testPutAllMap_multiMap_addsAllCollections() {
        MultiValueMap source = new MultiValueMap();
        source.put("key1", "value1");
        source.put("key1", "value2");

        map.putAll((Map) source);
        Assert.assertEquals(2, map.size("key1"));
        Assert.assertTrue(map.containsValue("key1", "value1"));
        Assert.assertTrue(map.containsValue("key1", "value2"));
    }

    // ---------------- values() ----------------

    @Test
    public void testValues_returnsAllValuesAcrossKeys() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        Collection allValues = map.values();
        Assert.assertEquals(3, allValues.size());
    }

    @Test
    public void testValues_cachedInstanceReturnedOnSecondCall() {
        Collection v1 = map.values();
        Collection v2 = map.values();
        Assert.assertSame(v1, v2);
    }

    @Test
    public void testValuesIterator_iteratesAllValues() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        Collection allValues = map.values();
        Iterator it = allValues.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        Assert.assertEquals(2, count);
    }

    @Test
    public void testValues_clear_clearsUnderlyingMap() {
        map.put("key1", "value1");
        Collection allValues = map.values();
        allValues.clear();
        Assert.assertTrue(map.isEmpty());
    }

    // ---------------- containsValue(key, value) ----------------

    @Test
    public void testContainsValueKeyValue_existingKeyAndValue_returnsTrue() {
        map.put("key", "value1");
        Assert.assertTrue(map.containsValue("key", "value1"));
    }

    @Test
    public void testContainsValueKeyValue_existingKeyWrongValue_returnsFalse() {
        map.put("key", "value1");
        Assert.assertFalse(map.containsValue("key", "value2"));
    }

    @Test
    public void testContainsValueKeyValue_nonExistingKey_returnsFalse() {
        Assert.assertFalse(map.containsValue("noKey", "value"));
    }

    // ---------------- getCollection ----------------

    @Test
    public void testGetCollection_existingKey_returnsCollection() {
        map.put("key", "value1");
        Collection coll = map.getCollection("key");
        Assert.assertNotNull(coll);
        Assert.assertTrue(coll.contains("value1"));
    }

    @Test
    public void testGetCollection_nonExistingKey_returnsNull() {
        Collection coll = map.getCollection("noKey");
        Assert.assertNull(coll);
    }

    // ---------------- size(key) ----------------

    @Test
    public void testSizeKey_existingKey_returnsCorrectSize() {
        map.put("key", "value1");
        map.put("key", "value2");
        Assert.assertEquals(2, map.size("key"));
    }

    @Test
    public void testSizeKey_nonExistingKey_returnsZero() {
        Assert.assertEquals(0, map.size("noKey"));
    }

    // ---------------- putAll(key, Collection) ----------------

    @Test
    public void testPutAllKeyCollection_newKey_addsAllValues() {
        List values = new ArrayList();
        values.add("v1");
        values.add("v2");
        boolean result = map.putAll("key", values);
        Assert.assertTrue(result);
        Assert.assertEquals(2, map.size("key"));
    }

    @Test
    public void testPutAllKeyCollection_existingKey_addsMoreValues() {
        map.put("key", "v0");
        List values = new ArrayList();
        values.add("v1");
        values.add("v2");
        boolean result = map.putAll("key", values);
        Assert.assertTrue(result);
        Assert.assertEquals(3, map.size("key"));
    }

    @Test
    public void testPutAllKeyCollection_nullValues_returnsFalse() {
        boolean result = map.putAll("key", null);
        Assert.assertFalse(result);
        Assert.assertEquals(0, map.size("key"));
    }

    @Test
    public void testPutAllKeyCollection_emptyValues_returnsFalse() {
        boolean result = map.putAll("key", new ArrayList());
        Assert.assertFalse(result);
        Assert.assertEquals(0, map.size("key"));
    }

    // ---------------- iterator(key) ----------------

    @Test
    public void testIteratorKey_existingKey_returnsValuesIterator() {
        map.put("key", "value1");
        map.put("key", "value2");
        Iterator it = map.iterator("key");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        Assert.assertEquals(2, count);
    }

    @Test
    public void testIteratorKey_nonExistingKey_returnsEmptyIterator() {
        Iterator it = map.iterator("noKey");
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorKey_remove_removesElementAndKeyIfEmpty() {
        map.put("key", "value1");
        Iterator it = map.iterator("key");
        Assert.assertTrue(it.hasNext());
        it.next();
        it.remove();
        Assert.assertNull(map.getCollection("key"));
    }

    @Test
    public void testIteratorKey_removePartial_keepsKeyWithRemainingValues() {
        map.put("key", "value1");
        map.put("key", "value2");
        Iterator it = map.iterator("key");
        it.next();
        it.remove();
        Assert.assertNotNull(map.getCollection("key"));
        Assert.assertEquals(1, map.size("key"));
    }

    // ---------------- totalSize ----------------

    @Test
    public void testTotalSize_emptyMap_returnsZero() {
        Assert.assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSize_multipleKeysAndValues_returnsCorrectSum() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        Assert.assertEquals(3, map.totalSize());
    }

    // ---------------- createCollection / ReflectionFactory exception ----------------

    @Test(expected = FunctorException.class)
    public void testCreateCollection_badClass_throwsFunctorException() {
        Map baseMap = new HashMap();
        // Collection is an interface, cannot be instantiated via newInstance()
        MultiValueMap badMap = MultiValueMap.decorate(baseMap, Collection.class);
        badMap.put("key", "value");
    }

    // ---------------- MultiMap interface check ----------------

    @Test
    public void testIsInstanceOfMultiMap() {
        Assert.assertTrue(map instanceof MultiMap);
    }
}
