package org.apache.commons.collections4.map;

import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ListOrderedMapTest {

    private ListOrderedMap<String, String> map;

    @Before
    public void setUp() {
        map = new ListOrderedMap<String, String>();
    }

    @Test
    public void testFactoryMethod_validMap_createsListOrderedMap() {
        final Map<String, String> original = new LinkedHashMap<String, String>();
        original.put("k1", "v1");
        original.put("k2", "v2");

        final ListOrderedMap<String, String> ordered = ListOrderedMap.listOrderedMap(original);
        Assert.assertEquals(2, ordered.size());
        Assert.assertEquals("k1", ordered.get(0));
        Assert.assertEquals("k2", ordered.get(1));
    }

    @Test(expected = NullPointerException.class)
    public void testFactoryMethod_nullMap_throwsException() {
        ListOrderedMap.listOrderedMap(null);
    }

    @Test
    public void testDefaultConstructor_createsEmptyMap() {
        final ListOrderedMap<String, String> emptyMap = new ListOrderedMap<String, String>();
        Assert.assertTrue(emptyMap.isEmpty());
        Assert.assertEquals(0, emptyMap.size());
    }

    @Test
    public void testPut_newAndExistingKeys_maintainsOrderAndUpdatesValue() {
        Assert.assertNull(map.put("a", "1"));
        Assert.assertNull(map.put("b", "2"));
        Assert.assertNull(map.put("c", "3"));

        Assert.assertEquals(3, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("b", map.get(1));
        Assert.assertEquals("c", map.get(2));

        // Re-adding existing key must not change the order
        final String previous = map.put("b", "updated_2");
        Assert.assertEquals("2", previous);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("b", map.get(1));
        Assert.assertEquals("c", map.get(2));
        Assert.assertEquals("updated_2", map.getValue(1));
    }

    @Test
    public void testPut_nullKeyAndNullValue_supported() {
        map.put(null, "nullValue");
        Assert.assertEquals(1, map.size());
        Assert.assertNull(map.get(0));
        Assert.assertEquals("nullValue", map.getValue(0));

        map.put("nullKey", null);
        Assert.assertEquals(2, map.size());
        Assert.assertNull(map.getValue(1));
    }

    @Test
    public void testPutAll_map_appendsInOrder() {
        final Map<String, String> toAdd = new LinkedHashMap<String, String>();
        toAdd.put("x", "10");
        toAdd.put("y", "20");

        map.putAll(toAdd);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("x", map.get(0));
        Assert.assertEquals("y", map.get(1));
    }

    @Test
    public void testPutAll_indexed_insertsAtSpecifiedPosition() {
        map.put("a", "1");
        map.put("d", "4");

        final Map<String, String> toInsert = new LinkedHashMap<String, String>();
        toInsert.put("b", "2");
        toInsert.put("c", "3");

        map.putAll(1, toInsert);

        Assert.assertEquals(4, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("b", map.get(1));
        Assert.assertEquals("c", map.get(2));
        Assert.assertEquals("d", map.get(3));
    }

    @Test
    public void testPutAll_indexed_withExistingKeysAndNullValues() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        final Map<String, String> toInsert = new LinkedHashMap<String, String>();
        toInsert.put("b", "20"); // key exists, replaced
        toInsert.put("d", null); // new key with null value

        map.putAll(1, toInsert);

        Assert.assertTrue(map.containsKey("b"));
        Assert.assertTrue(map.containsKey("d"));
        Assert.assertEquals("20", map.get("b"));
        Assert.assertNull(map.get("d"));
    }

    @Test
    public void testPut_indexed_newKey() {
        map.put("a", "1");
        map.put("c", "3");

        final String old = map.put(1, "b", "2");
        Assert.assertNull(old);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("b", map.get(1));
        Assert.assertEquals("c", map.get(2));
    }

    @Test
    public void testPut_indexed_existingKey_posLessThanIndex() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");

        // Move "b" (pos 1) to index 3 (pos < index branch)
        final String old = map.put(3, "b", "20");
        Assert.assertEquals("2", old);
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("c", map.get(1));
        Assert.assertEquals("b", map.get(2));
        Assert.assertEquals("d", map.get(3));
        Assert.assertEquals("20", map.get("b"));
    }

    @Test
    public void testPut_indexed_existingKey_posGreaterThanIndex() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");

        // Move "d" (pos 3) to index 1 (pos >= index branch)
        final String old = map.put(1, "d", "40");
        Assert.assertEquals("4", old);
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("d", map.get(1));
        Assert.assertEquals("b", map.get(2));
        Assert.assertEquals("c", map.get(3));
        Assert.assertEquals("40", map.get("d"));
    }

    @Test
    public void testRemove_byKey_removesFromMapAndOrder() {
        map.put("a", "1");
        map.put("b", "2");

        final String removed = map.remove("a");
        Assert.assertEquals("1", removed);
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("b", map.get(0));

        final String nonExisting = map.remove("nonExisting");
        Assert.assertNull(nonExisting);
    }

    @Test
    public void testRemove_byIndex_removesCorrectItem() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        final String removed = map.remove(1);
        Assert.assertEquals("2", removed);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("c", map.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_byIndex_outOfBounds_throwsException() {
        map.remove(0);
    }

    @Test
    public void testClear_removesAllEntriesAndOrder() {
        map.put("a", "1");
        map.put("b", "2");
        map.clear();

        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
        Assert.assertEquals(-1, map.indexOf("a"));
    }

    @Test
    public void testFirstKey_validMap_returnsFirstKey() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals("k1", map.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_emptyMap_throwsException() {
        map.firstKey();
    }

    @Test
    public void testLastKey_validMap_returnsLastKey() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals("k2", map.lastKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKey_emptyMap_throwsException() {
        map.lastKey();
    }

    @Test
    public void testNextKey_returnsNextOrNull() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Assert.assertEquals("b", map.nextKey("a"));
        Assert.assertEquals("c", map.nextKey("b"));
        Assert.assertNull(map.nextKey("c")); // last key
        Assert.assertNull(map.nextKey("z")); // not found
    }

    @Test
    public void testPreviousKey_returnsPreviousOrNull() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Assert.assertNull(map.previousKey("a")); // first key
        Assert.assertEquals("a", map.previousKey("b"));
        Assert.assertEquals("b", map.previousKey("c"));
        Assert.assertNull(map.previousKey("z")); // not found
    }

    @Test
    public void testGet_and_GetValue_byIndex() {
        map.put("k1", "v1");
        map.put("k2", "v2");

        Assert.assertEquals("k1", map.get(0));
        Assert.assertEquals("v1", map.getValue(0));
        Assert.assertEquals("k2", map.get(1));
        Assert.assertEquals("v2", map.getValue(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_byIndex_outOfBounds_throwsException() {
        map.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_byIndex_outOfBounds_throwsException() {
        map.getValue(0);
    }

    @Test
    public void testIndexOf_existingAndNonExisting() {
        map.put("x", "1");
        map.put("y", "2");

        Assert.assertEquals(0, map.indexOf("x"));
        Assert.assertEquals(1, map.indexOf("y"));
        Assert.assertEquals(-1, map.indexOf("z"));
    }

    @Test
    public void testSetValue_byIndex_updatesAndReturnsPrevious() {
        map.put("a", "1");
        map.put("b", "2");

        final String prev = map.setValue(1, "updated");
        Assert.assertEquals("2", prev);
        Assert.assertEquals("updated", map.get("b"));
        Assert.assertEquals("updated", map.getValue(1));
    }

    @Test
    public void testKeyList_and_AsList() {
        map.put("a", "1");
        map.put("b", "2");

        final List<String> list1 = map.keyList();
        final List<String> list2 = map.asList();

        Assert.assertEquals(Arrays.asList("a", "b"), list1);
        Assert.assertEquals(Arrays.asList("a", "b"), list2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testKeyList_unmodifiable() {
        map.put("a", "1");
        map.keyList().add("b");
    }

    @Test
    public void testKeySetView_allMethods() {
        map.put("a", "1");
        map.put("b", "2");

        final Set<String> keySet = map.keySet();
        Assert.assertEquals(2, keySet.size());
        Assert.assertTrue(keySet.contains("a"));
        Assert.assertFalse(keySet.contains("c"));

        final List<String> iterated = new ArrayList<String>();
        for (final String key : keySet) {
            iterated.add(key);
        }
        Assert.assertEquals(Arrays.asList("a", "b"), iterated);

        keySet.clear();
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testValuesView_and_ValueList_allMethods() {
        map.put("a", "1");
        map.put("b", "2");

        final Collection<String> values = map.values();
        final List<String> valueList = map.valueList();

        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("1"));
        Assert.assertFalse(values.contains("9"));

        final List<String> iterated = new ArrayList<String>();
        for (final String val : values) {
            iterated.add(val);
        }
        Assert.assertEquals(Arrays.asList("1", "2"), iterated);

        Assert.assertEquals("1", valueList.get(0));
        Assert.assertEquals("2", valueList.get(1));

        final String setPrev = valueList.set(0, "10");
        Assert.assertEquals("1", setPrev);
        Assert.assertEquals("10", map.get("a"));

        final String removed = valueList.remove(0);
        Assert.assertEquals("10", removed);
        Assert.assertEquals(1, map.size());
        Assert.assertFalse(map.containsKey("a"));

        valueList.clear();
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void testEntrySetView_allMethods() {
        map.put("a", "1");
        map.put("b", "2");

        final Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Assert.assertEquals(2, entrySet.size());
        Assert.assertFalse(entrySet.isEmpty());

        final Map.Entry<String, String> dummyEntry = new HashMap<String, String>() {{
            put("a", "1");
        }}.entrySet().iterator().next();

        final Map.Entry<String, String> nonExistingEntry = new HashMap<String, String>() {{
            put("a", "99");
        }}.entrySet().iterator().next();

        Assert.assertTrue(entrySet.contains(dummyEntry));
        Assert.assertFalse(entrySet.contains(nonExistingEntry));
        Assert.assertFalse(entrySet.contains("not-an-entry"));

        Assert.assertTrue(entrySet.containsAll(Collections.singleton(dummyEntry)));

        // Remove non entry
        Assert.assertFalse(entrySet.remove("invalid"));
        // Remove non existing entry
        Assert.assertFalse(entrySet.remove(nonExistingEntry));

        // Remove valid entry
        Assert.assertTrue(entrySet.remove(dummyEntry));
        Assert.assertEquals(1, map.size());
        Assert.assertFalse(map.containsKey("a"));

        // Equals & HashCode & toString
        Assert.assertTrue(entrySet.equals(entrySet));
        Assert.assertEquals(map.decorated().entrySet().hashCode(), entrySet.hashCode());
        Assert.assertEquals(map.decorated().entrySet().toString(), entrySet.toString());

        entrySet.clear();
        Assert.assertTrue(map.isEmpty());
        Assert.assertTrue(entrySet.isEmpty());
    }

    @Test
    public void testEntrySetView_iterator_entrySetValue_and_remove() {
        map.put("a", "1");
        map.put("b", "2");

        final Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Assert.assertTrue(it.hasNext());
        final Map.Entry<String, String> entry = it.next();
        Assert.assertEquals("a", entry.getKey());
        Assert.assertEquals("1", entry.getValue());

        final String oldVal = entry.setValue("100");
        Assert.assertEquals("1", oldVal);
        Assert.assertEquals("100", map.get("a"));

        it.remove();
        Assert.assertFalse(map.containsKey("a"));
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void testMapIterator_fullIteration_and_methods() {
        map.put("a", "1");
        map.put("b", "2");

        final OrderedMapIterator<String, String> it = map.mapIterator();
        Assert.assertEquals("Iterator[]", it.toString());
        Assert.assertTrue(it.hasNext());
        Assert.assertFalse(it.hasPrevious());

        final String key1 = it.next();
        Assert.assertEquals("a", key1);
        Assert.assertEquals("a", it.getKey());
        Assert.assertEquals("1", it.getValue());
        Assert.assertEquals("Iterator[a=1]", it.toString());

        final String prevVal = it.setValue("11");
        Assert.assertEquals("1", prevVal);
        Assert.assertEquals("11", map.get("a"));

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("b", it.next());
        Assert.assertTrue(it.hasPrevious());

        Assert.assertEquals("b", it.previous());
        Assert.assertEquals("a", it.previous());

        it.reset();
        Assert.assertEquals("Iterator[]", it.toString());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("a", it.next());

        it.remove();
        Assert.assertEquals(1, map.size());
        Assert.assertFalse(map.containsKey("a"));
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getKey_notReadable_throwsException() {
        final OrderedMapIterator<String, String> it = map.mapIterator();
        it.getKey();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getValue_notReadable_throwsException() {
        final OrderedMapIterator<String, String> it = map.mapIterator();
        it.getValue();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_setValue_notReadable_throwsException() {
        final OrderedMapIterator<String, String> it = map.mapIterator();
        it.setValue("val");
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_remove_notReadable_throwsException() {
        final OrderedMapIterator<String, String> it = map.mapIterator();
        it.remove();
    }

    @Test
    public void testToString_emptyMap() {
        Assert.assertEquals("{}", map.toString());
    }

    @Test
    public void testToString_nonEmptyMap() {
        map.put("key1", "val1");
        map.put("key2", "val2");
        Assert.assertEquals("{key1=val1, key2=val2}", map.toString());
    }

    @Test
    public void testToString_selfReference() {
        final ListOrderedMap<Object, Object> selfMap = new ListOrderedMap<Object, Object>();
        selfMap.put(selfMap, selfMap);
        Assert.assertEquals("{(this Map)=(this Map)}", selfMap.toString());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization_preservesStateAndOrder() throws Exception {
        map.put("first", "1");
        map.put("second", "2");

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        final ListOrderedMap<String, String> deserialized = (ListOrderedMap<String, String>) ois.readObject();
        ois.close();

        Assert.assertEquals(2, deserialized.size());
        Assert.assertEquals("first", deserialized.get(0));
        Assert.assertEquals("second", deserialized.get(1));
        Assert.assertEquals("1", deserialized.getValue(0));
        Assert.assertEquals("2", deserialized.getValue(1));
    }
}
