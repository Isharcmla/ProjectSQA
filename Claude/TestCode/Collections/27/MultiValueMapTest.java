import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.MultiMap;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MultiValueMapTest {

    private MultiValueMap<String, String> map;

    @Before
    public void setUp() {
        map = new MultiValueMap<String, String>();
    }

    //-----------------------------------------------------------------------
    // Static factory methods
    //-----------------------------------------------------------------------

    @Test
    public void testMultiValueMapFactory_defaultMap_returnsArrayListBackedMap() {
        Map<String, Object> underlying = new HashMap<String, Object>();
        MultiValueMap<String, String> mvm = MultiValueMap.multiValueMap(underlying);
        mvm.put("a", "1");
        Collection<String> coll = mvm.getCollection("a");
        assertTrue(coll instanceof ArrayList);
        assertEquals(1, coll.size());
    }

    @Test
    public void testMultiValueMapFactory_withCollectionClass_usesGivenClass() {
        Map<String, Object> underlying = new HashMap<String, Object>();
        MultiValueMap<String, String> mvm = MultiValueMap.multiValueMap(underlying, HashSet.class);
        mvm.put("a", "1");
        Collection<String> coll = mvm.getCollection("a");
        assertTrue(coll instanceof HashSet);
    }

    @Test(expected = FunctorException.class)
    public void testMultiValueMapFactory_withNonInstantiableClass_throwsFunctorException() {
        Map<String, Object> underlying = new HashMap<String, Object>();
        @SuppressWarnings({ "unchecked", "rawtypes" })
        MultiValueMap<String, String> mvm = MultiValueMap.multiValueMap((Map) underlying, Collection.class);
        mvm.put("a", "1");
    }

    @Test
    public void testMultiValueMapFactory_withFactory_usesFactory() {
        Map<String, Object> underlying = new HashMap<String, Object>();
        org.apache.commons.collections4.Factory<ArrayList<String>> factory =
                new org.apache.commons.collections4.Factory<ArrayList<String>>() {
                    @Override
                    public ArrayList<String> create() {
                        return new ArrayList<String>();
                    }
                };
        MultiValueMap<String, String> mvm = MultiValueMap.multiValueMap(underlying, factory);
        mvm.put("a", "1");
        Collection<String> coll = mvm.getCollection("a");
        assertTrue(coll instanceof ArrayList);
        assertEquals(1, coll.size());
    }

    //-----------------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------------

    @Test
    public void testConstructor_default_createsEmptyMap() {
        MultiValueMap<String, String> mvm = new MultiValueMap<String, String>();
        assertTrue(mvm.isEmpty());
    }

    //-----------------------------------------------------------------------
    // clear()
    //-----------------------------------------------------------------------

    @Test
    public void testClear_afterAddingValues_mapIsEmpty() {
        map.put("a", "1");
        map.put("b", "2");
        map.clear();
        assertTrue(map.isEmpty());
    }

    //-----------------------------------------------------------------------
    // removeMapping(key, value)
    //-----------------------------------------------------------------------

    @Test
    public void testRemoveMapping_keyNotPresent_returnsFalse() {
        assertFalse(map.removeMapping("noKey", "noValue"));
    }

    @Test
    public void testRemoveMapping_valueNotPresent_returnsFalse() {
        map.put("a", "1");
        assertFalse(map.removeMapping("a", "2"));
    }

    @Test
    public void testRemoveMapping_valuePresent_removesValueAndReturnsTrue() {
        map.put("a", "1");
        map.put("a", "2");
        assertTrue(map.removeMapping("a", "1"));
        assertEquals(1, map.size("a"));
    }

    @Test
    public void testRemoveMapping_lastValueRemoved_removesKeyEntirely() {
        map.put("a", "1");
        assertTrue(map.removeMapping("a", "1"));
        assertFalse(map.containsKey("a"));
    }

    //-----------------------------------------------------------------------
    // containsValue(value)
    //-----------------------------------------------------------------------

    @Test
    public void testContainsValue_valuePresent_returnsTrue() {
        map.put("a", "1");
        assertTrue(map.containsValue("1"));
    }

    @Test
    public void testContainsValue_valueNotPresent_returnsFalse() {
        map.put("a", "1");
        assertFalse(map.containsValue("2"));
    }

    @Test
    public void testContainsValue_emptyMap_returnsFalse() {
        assertFalse(map.containsValue("1"));
    }

    //-----------------------------------------------------------------------
    // put(key, value)
    //-----------------------------------------------------------------------

    @Test
    public void testPut_newKey_addsValueAndReturnsValue() {
        Object result = map.put("a", "1");
        assertEquals("1", result);
        assertEquals(1, map.size("a"));
    }

    @Test
    public void testPut_existingKey_addsAdditionalValue() {
        map.put("a", "1");
        Object result = map.put("a", "2");
        assertEquals("2", result);
        assertEquals(2, map.size("a"));
    }

    @Test
    public void testPut_nullValue_addsNullToCollection() {
        Object result = map.put("a", null);
        assertNull(result);
        // even though returned null, value should still be added since ArrayList.add(null) succeeds
        assertEquals(1, map.size("a"));
    }

    //-----------------------------------------------------------------------
    // putAll(Map)
    //-----------------------------------------------------------------------

    @Test
    public void testPutAll_normalMap_addsEachEntryAsSingleValue() {
        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("a", "1");
        normalMap.put("b", "2");
        map.putAll(normalMap);
        assertEquals(1, map.size("a"));
        assertEquals(1, map.size("b"));
    }

    @Test
    public void testPutAll_multiMap_addsAllValuesForEachKey() {
        MultiValueMap<String, String> other = new MultiValueMap<String, String>();
        other.put("a", "1");
        other.put("a", "2");
        map.putAll((Map<? extends String, ?>) (MultiMap<String, String>) other);
        assertEquals(2, map.size("a"));
    }

    //-----------------------------------------------------------------------
    // entrySet()
    //-----------------------------------------------------------------------

    @Test
    public void testEntrySet_returnsUnderlyingEntries() {
        map.put("a", "1");
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        assertEquals(1, entries.size());
    }

    //-----------------------------------------------------------------------
    // values()
    //-----------------------------------------------------------------------

    @Test
    public void testValues_returnsAllValuesAcrossKeys() {
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        Collection<Object> values = map.values();
        assertEquals(3, values.size());
    }

    @Test
    public void testValues_cachedInstanceReturnedOnSecondCall() {
        Collection<Object> first = map.values();
        Collection<Object> second = map.values();
        assertSame(first, second);
    }

    @Test
    public void testValues_clear_clearsUnderlyingMap() {
        map.put("a", "1");
        Collection<Object> values = map.values();
        values.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testValues_iterator_iteratesAllValues() {
        map.put("a", "1");
        map.put("b", "2");
        Collection<Object> values = map.values();
        Iterator<Object> it = values.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    //-----------------------------------------------------------------------
    // containsValue(key, value)
    //-----------------------------------------------------------------------

    @Test
    public void testContainsValueKeyValue_present_returnsTrue() {
        map.put("a", "1");
        assertTrue(map.containsValue("a", "1"));
    }

    @Test
    public void testContainsValueKeyValue_keyMissing_returnsFalse() {
        assertFalse(map.containsValue("missing", "1"));
    }

    @Test
    public void testContainsValueKeyValue_valueMissing_returnsFalse() {
        map.put("a", "1");
        assertFalse(map.containsValue("a", "2"));
    }

    //-----------------------------------------------------------------------
    // getCollection(key)
    //-----------------------------------------------------------------------

    @Test
    public void testGetCollection_keyPresent_returnsCollection() {
        map.put("a", "1");
        Collection<String> coll = map.getCollection("a");
        assertNotNull(coll);
        assertEquals(1, coll.size());
    }

    @Test
    public void testGetCollection_keyMissing_returnsNull() {
        assertNull(map.getCollection("missing"));
    }

    //-----------------------------------------------------------------------
    // size(key)
    //-----------------------------------------------------------------------

    @Test
    public void testSizeKey_keyMissing_returnsZero() {
        assertEquals(0, map.size("missing"));
    }

    @Test
    public void testSizeKey_keyPresent_returnsCorrectSize() {
        map.put("a", "1");
        map.put("a", "2");
        assertEquals(2, map.size("a"));
    }

    //-----------------------------------------------------------------------
    // putAll(key, values)
    //-----------------------------------------------------------------------

    @Test
    public void testPutAllKeyValues_nullValues_returnsFalse() {
        assertFalse(map.putAll("a", null));
    }

    @Test
    public void testPutAllKeyValues_emptyValues_returnsFalse() {
        assertFalse(map.putAll("a", new ArrayList<String>()));
    }

    @Test
    public void testPutAllKeyValues_newKey_createsCollectionAndReturnsTrue() {
        Collection<String> values = new ArrayList<String>();
        values.add("1");
        values.add("2");
        boolean result = map.putAll("a", values);
        assertTrue(result);
        assertEquals(2, map.size("a"));
    }

    @Test
    public void testPutAllKeyValues_existingKey_addsToExistingCollection() {
        map.put("a", "1");
        Collection<String> values = new ArrayList<String>();
        values.add("2");
        values.add("3");
        boolean result = map.putAll("a", values);
        assertTrue(result);
        assertEquals(3, map.size("a"));
    }

    //-----------------------------------------------------------------------
    // iterator(key)
    //-----------------------------------------------------------------------

    @Test
    public void testIteratorKey_keyMissing_returnsEmptyIterator() {
        Iterator<String> it = map.iterator("missing");
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorKey_keyPresent_iteratesValues() {
        map.put("a", "1");
        map.put("a", "2");
        Iterator<String> it = map.iterator("a");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testIteratorKey_remove_removesValueFromCollection() {
        map.put("a", "1");
        map.put("a", "2");
        Iterator<String> it = map.iterator("a");
        it.next();
        it.remove();
        assertEquals(1, map.size("a"));
    }

    @Test
    public void testIteratorKey_removeLastValue_removesKeyEntirely() {
        map.put("a", "1");
        Iterator<String> it = map.iterator("a");
        it.next();
        it.remove();
        assertFalse(map.containsKey("a"));
    }

    //-----------------------------------------------------------------------
    // iterator()
    //-----------------------------------------------------------------------

    @Test
    public void testIterator_multipleKeysAndValues_iteratesAllEntries() {
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        Iterator<Map.Entry<String, String>> it = map.iterator();
        int count = 0;
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            assertNotNull(entry.getKey());
            assertNotNull(entry.getValue());
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testIterator_emptyMap_returnsNoElements() {
        Iterator<Map.Entry<String, String>> it = map.iterator();
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_setValueOnEntry_throwsUnsupportedOperationException() {
        map.put("a", "1");
        Iterator<Map.Entry<String, String>> it = map.iterator();
        Map.Entry<String, String> entry = it.next();
        entry.setValue("2");
    }

    //-----------------------------------------------------------------------
    // totalSize()
    //-----------------------------------------------------------------------

    @Test
    public void testTotalSize_emptyMap_returnsZero() {
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSize_multipleKeysAndValues_returnsSumOfAllValues() {
        map.put("a", "1");
        map.put("a", "2");
        map.put("b", "3");
        assertEquals(3, map.totalSize());
    }

    //-----------------------------------------------------------------------
    // Serialization
    //-----------------------------------------------------------------------

    @Test
    public void testSerialization_roundTrip_preservesData() throws IOException, ClassNotFoundException {
        map.put("a", "1");
        map.put("a", "2");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        MultiValueMap<String, String> deserialized = (MultiValueMap<String, String>) ois.readObject();
        ois.close();

        assertEquals(2, deserialized.size("a"));
    }
}
