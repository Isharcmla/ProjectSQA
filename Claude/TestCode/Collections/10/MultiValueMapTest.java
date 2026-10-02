import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;

import org.apache.commons.collections.Factory;
import org.apache.commons.collections.FunctorException;

import org.apache.commons.collections.map.MultiValueMap;

public class MultiValueMapTest {

    private MultiValueMap multiValueMap;

    @Before
    public void setUp() {
        multiValueMap = MultiValueMap.decorate(new HashMap());
    }

    // -------------------- decorate(Map) --------------------
    @Test
    public void testDecorateMap_normal_returnsMultiValueMap() {
        Map baseMap = new HashMap();
        MultiValueMap mvm = MultiValueMap.decorate(baseMap);
        assertNotNull(mvm);
        mvm.put("key1", "value1");
        assertEquals(1, mvm.size());
    }

    // -------------------- decorate(Map, Class) --------------------
    @Test
    public void testDecorateMapClass_normal_usesSpecifiedCollectionClass() {
        Map baseMap = new HashMap();
        MultiValueMap mvm = MultiValueMap.decorate(baseMap, HashSet.class);
        mvm.put("key1", "value1");
        mvm.put("key1", "value1"); // duplicate - HashSet should not add it twice
        Collection coll = mvm.getCollection("key1");
        assertTrue(coll instanceof HashSet);
        assertEquals(1, coll.size());
    }

    // -------------------- decorate(Map, Factory) --------------------
    @Test
    public void testDecorateMapFactory_normal_returnsMultiValueMap() {
        Factory factory = new Factory() {
            public Object create() {
                return new ArrayList();
            }
        };
        Map baseMap = new HashMap();
        MultiValueMap mvm = MultiValueMap.decorate(baseMap, factory);
        assertNotNull(mvm);
        mvm.put("key1", "value1");
        assertEquals(1, mvm.getCollection("key1").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateMapFactory_nullFactory_throwsException() {
        Map baseMap = new HashMap();
        MultiValueMap.decorate(baseMap, (Factory) null);
    }

    // -------------------- default constructor --------------------
    @Test
    public void testDefaultConstructor_normal_createsEmptyMap() {
        MultiValueMap mvm = new MultiValueMap();
        assertNotNull(mvm);
        assertEquals(0, mvm.size());
    }

    // -------------------- clear --------------------
    @Test
    public void testClear_removesAllEntries() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key2", "value2");
        assertEquals(2, multiValueMap.size());
        multiValueMap.clear();
        assertEquals(0, multiValueMap.size());
    }

    // -------------------- removeMapping --------------------
    @Test
    public void testRemoveMapping_existingValue_returnsValue() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key1", "value2");
        Object removed = multiValueMap.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        assertEquals(1, multiValueMap.size("key1"));
    }

    @Test
    public void testRemoveMapping_nonExistingKey_returnsNull() {
        Object removed = multiValueMap.removeMapping("noKey", "value1");
        assertNull(removed);
    }

    @Test
    public void testRemoveMapping_nonExistingValue_returnsNull() {
        multiValueMap.put("key1", "value1");
        Object removed = multiValueMap.removeMapping("key1", "value2");
        assertNull(removed);
    }

    @Test
    public void testRemoveMapping_lastValueRemoved_removesKey() {
        multiValueMap.put("key1", "value1");
        Object removed = multiValueMap.removeMapping("key1", "value1");
        assertEquals("value1", removed);
        assertFalse(multiValueMap.containsKey("key1"));
    }

    // -------------------- containsValue(Object value) --------------------
    @Test
    public void testContainsValue_valueExists_returnsTrue() {
        multiValueMap.put("key1", "value1");
        assertTrue(multiValueMap.containsValue("value1"));
    }

    @Test
    public void testContainsValue_valueNotExists_returnsFalse() {
        multiValueMap.put("key1", "value1");
        assertFalse(multiValueMap.containsValue("nonExisting"));
    }

    @Test
    public void testContainsValue_emptyMap_returnsFalse() {
        assertFalse(multiValueMap.containsValue("anything"));
    }

    // -------------------- put --------------------
    @Test
    public void testPut_newKey_addsValue() {
        Object result = multiValueMap.put("key1", "value1");
        assertEquals("value1", result);
        assertEquals(1, multiValueMap.size("key1"));
    }

    @Test
    public void testPut_existingKey_addsToCollection() {
        multiValueMap.put("key1", "value1");
        Object result = multiValueMap.put("key1", "value2");
        assertEquals("value2", result);
        assertEquals(2, multiValueMap.size("key1"));
    }

    @Test
    public void testPut_withFactoryThrowsException_wrappedInFunctorException() {
        MultiValueMap mvm = MultiValueMap.decorate(new HashMap(), Integer.class);
        try {
            mvm.put("key1", "value1");
            fail("Expected FunctorException");
        } catch (FunctorException e) {
            // expected because Integer has no default constructor
            assertNotNull(e);
        }
    }

    // -------------------- putAll(Map) --------------------
    @Test
    public void testPutAll_normalMap_addsEachEntry() {
        Map normalMap = new HashMap();
        normalMap.put("key1", "value1");
        normalMap.put("key2", "value2");
        multiValueMap.putAll(normalMap);
        assertEquals(2, multiValueMap.size());
        assertTrue(multiValueMap.containsValue("key1", "value1"));
        assertTrue(multiValueMap.containsValue("key2", "value2"));
    }

    @Test
    public void testPutAll_multiMap_addsCollections() {
        MultiValueMap sourceMap = MultiValueMap.decorate(new HashMap());
        sourceMap.put("key1", "value1");
        sourceMap.put("key1", "value2");

        multiValueMap.putAll(sourceMap);
        assertEquals(2, multiValueMap.size("key1"));
        assertTrue(multiValueMap.containsValue("key1", "value1"));
        assertTrue(multiValueMap.containsValue("key1", "value2"));
    }

    // -------------------- values() --------------------
    @Test
    public void testValues_returnsAllValues() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key1", "value2");
        multiValueMap.put("key2", "value3");

        Collection values = multiValueMap.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
        assertTrue(values.contains("value3"));
    }

    @Test
    public void testValues_calledTwice_returnsSameCachedView() {
        Collection values1 = multiValueMap.values();
        Collection values2 = multiValueMap.values();
        assertSame(values1, values2);
    }

    @Test
    public void testValues_clear_clearsMap() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key2", "value2");
        Collection values = multiValueMap.values();
        values.clear();
        assertEquals(0, multiValueMap.size());
    }

    @Test
    public void testValues_iteratorOnEmptyMap_hasNoElements() {
        Collection values = multiValueMap.values();
        Iterator it = values.iterator();
        assertFalse(it.hasNext());
    }

    // -------------------- containsValue(Object key, Object value) --------------------
    @Test
    public void testContainsValueKey_existingKeyValue_returnsTrue() {
        multiValueMap.put("key1", "value1");
        assertTrue(multiValueMap.containsValue("key1", "value1"));
    }

    @Test
    public void testContainsValueKey_nonExistingKey_returnsFalse() {
        assertFalse(multiValueMap.containsValue("noKey", "value1"));
    }

    @Test
    public void testContainsValueKey_existingKeyWrongValue_returnsFalse() {
        multiValueMap.put("key1", "value1");
        assertFalse(multiValueMap.containsValue("key1", "value2"));
    }

    // -------------------- getCollection --------------------
    @Test
    public void testGetCollection_existingKey_returnsCollection() {
        multiValueMap.put("key1", "value1");
        Collection coll = multiValueMap.getCollection("key1");
        assertNotNull(coll);
        assertTrue(coll.contains("value1"));
    }

    @Test
    public void testGetCollection_nonExistingKey_returnsNull() {
        Collection coll = multiValueMap.getCollection("noKey");
        assertNull(coll);
    }

    // -------------------- size(key) --------------------
    @Test
    public void testSize_existingKey_returnsSize() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key1", "value2");
        assertEquals(2, multiValueMap.size("key1"));
    }

    @Test
    public void testSize_nonExistingKey_returnsZero() {
        assertEquals(0, multiValueMap.size("noKey"));
    }

    // -------------------- putAll(key, values) --------------------
    @Test
    public void testPutAllKeyCollection_normal_returnsTrue() {
        Collection values = new ArrayList();
        values.add("value1");
        values.add("value2");
        boolean result = multiValueMap.putAll("key1", values);
        assertTrue(result);
        assertEquals(2, multiValueMap.size("key1"));
    }

    @Test
    public void testPutAllKeyCollection_nullValues_returnsFalse() {
        boolean result = multiValueMap.putAll("key1", null);
        assertFalse(result);
        assertEquals(0, multiValueMap.size("key1"));
    }

    @Test
    public void testPutAllKeyCollection_emptyValues_returnsFalse() {
        Collection empty = new ArrayList();
        boolean result = multiValueMap.putAll("key1", empty);
        assertFalse(result);
        assertEquals(0, multiValueMap.size("key1"));
    }

    @Test
    public void testPutAllKeyCollection_existingKey_addsMore() {
        multiValueMap.put("key1", "value1");
        Collection more = new ArrayList();
        more.add("value2");
        more.add("value3");
        boolean result = multiValueMap.putAll("key1", more);
        assertTrue(result);
        assertEquals(3, multiValueMap.size("key1"));
    }

    // -------------------- iterator(key) --------------------
    @Test
    public void testIterator_existingKey_iteratesValues() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key1", "value2");
        Iterator it = multiValueMap.iterator("key1");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testIterator_nonExistingKey_returnsEmptyIterator() {
        Iterator it = multiValueMap.iterator("noKey");
        assertFalse(it.hasNext());
    }

    @Test
    public void testValuesIteratorRemove_removesValueAndKeyIfEmpty() {
        multiValueMap.put("key1", "value1");
        Iterator it = multiValueMap.iterator("key1");
        assertTrue(it.hasNext());
        it.next();
        it.remove();
        assertFalse(multiValueMap.containsKey("key1"));
    }

    @Test
    public void testValuesIteratorRemove_removesValueButKeyRemainsIfNotEmpty() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key1", "value2");
        Iterator it = multiValueMap.iterator("key1");
        it.next();
        it.remove();
        assertTrue(multiValueMap.containsKey("key1"));
        assertEquals(1, multiValueMap.size("key1"));
    }

    // -------------------- totalSize --------------------
    @Test
    public void testTotalSize_normal_returnsTotalCount() {
        multiValueMap.put("key1", "value1");
        multiValueMap.put("key1", "value2");
        multiValueMap.put("key2", "value3");
        assertEquals(3, multiValueMap.totalSize());
    }

    @Test
    public void testTotalSize_emptyMap_returnsZero() {
        assertEquals(0, multiValueMap.totalSize());
    }
}
