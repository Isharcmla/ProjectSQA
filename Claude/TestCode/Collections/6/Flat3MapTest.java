import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.collections.map.Flat3Map;
import org.apache.commons.collections.MapIterator;

import java.util.*;
import java.io.*;

public class Flat3MapTest {

    private Flat3Map map;

    @Before
    public void setUp() {
        map = new Flat3Map();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_empty() {
        Flat3Map m = new Flat3Map();
        assertEquals(0, m.size());
        assertTrue(m.isEmpty());
    }

    @Test
    public void testMapConstructor_copiesElements() {
        Map<String, String> src = new HashMap<String, String>();
        src.put("a", "1");
        src.put("b", "2");
        Flat3Map m = new Flat3Map(src);
        assertEquals(2, m.size());
        assertEquals("1", m.get("a"));
        assertEquals("2", m.get("b"));
    }

    @Test(expected = NullPointerException.class)
    public void testMapConstructor_nullMap_throwsException() {
        new Flat3Map(null);
    }

    // ---------- put / get tests (flat mode) ----------

    @Test
    public void testPutGet_singleEntry() {
        assertNull(map.put("key1", "value1"));
        assertEquals(1, map.size());
        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testPutGet_multipleEntries_flatMode() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals(3, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
    }

    @Test
    public void testPut_fourthEntry_switchesToDelegateMode() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        assertEquals(4, map.size());
        assertEquals("value4", map.get("key4"));
        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testPut_updateExistingKey_flatMode() {
        map.put("key1", "value1");
        Object old = map.put("key1", "newValue");
        assertEquals("value1", old);
        assertEquals(1, map.size());
        assertEquals("newValue", map.get("key1"));
    }

    @Test
    public void testPut_updateExistingKey_atPositionTwo() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        Object old = map.put("key2", "newValue2");
        assertEquals("value2", old);
        assertEquals("newValue2", map.get("key2"));
    }

    @Test
    public void testPut_updateExistingKey_atPositionThree() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        Object old = map.put("key3", "newValue3");
        assertEquals("value3", old);
        assertEquals("newValue3", map.get("key3"));
    }

    @Test
    public void testPut_nullKey() {
        assertNull(map.put(null, "value1"));
        assertEquals(1, map.size());
        assertEquals("value1", map.get(null));
    }

    @Test
    public void testPut_nullKeyUpdate_singlePosition() {
        map.put(null, "value1");
        Object old = map.put(null, "value2");
        assertEquals("value1", old);
        assertEquals("value2", map.get(null));
    }

    @Test
    public void testPut_nullKeyUpdate_secondPosition() {
        map.put("k1", "v1");
        map.put(null, "value1");
        Object old = map.put(null, "value2");
        assertEquals("value1", old);
        assertEquals("value2", map.get(null));
    }

    @Test
    public void testPut_nullKeyUpdate_thirdPosition() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "value1");
        Object old = map.put(null, "value2");
        assertEquals("value1", old);
        assertEquals("value2", map.get(null));
    }

    @Test
    public void testPut_updateInDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Object old = map.put("k1", "newV1");
        assertEquals("v1", old);
        assertEquals("newV1", map.get("k1"));
    }

    @Test
    public void testGet_nonExistentKey_returnsNull() {
        map.put("key1", "value1");
        assertNull(map.get("nonexistent"));
    }

    @Test
    public void testGet_emptyMap_returnsNull() {
        assertNull(map.get("anything"));
    }

    @Test
    public void testGet_nullKeyNotPresent_returnsNull() {
        map.put("k1", "v1");
        assertNull(map.get(null));
    }

    @Test
    public void testGet_inDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertEquals("v2", map.get("k2"));
        assertNull(map.get("nonexistent"));
    }

    // ---------- size / isEmpty ----------

    @Test
    public void testSize_empty() {
        assertEquals(0, map.size());
    }

    @Test
    public void testIsEmpty_true() {
        assertTrue(map.isEmpty());
    }

    @Test
    public void testIsEmpty_false() {
        map.put("k1", "v1");
        assertFalse(map.isEmpty());
    }

    @Test
    public void testSize_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertEquals(4, map.size());
    }

    // ---------- containsKey ----------

    @Test
    public void testContainsKey_flatMode_true() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertTrue(map.containsKey("k1"));
        assertTrue(map.containsKey("k2"));
        assertTrue(map.containsKey("k3"));
    }

    @Test
    public void testContainsKey_flatMode_false() {
        map.put("k1", "v1");
        assertFalse(map.containsKey("nonexistent"));
    }

    @Test
    public void testContainsKey_nullKey_true() {
        map.put(null, "v1");
        assertTrue(map.containsKey(null));
    }

    @Test
    public void testContainsKey_nullKey_atPositions() {
        map.put("k1", "v1");
        map.put(null, "v2");
        assertTrue(map.containsKey(null));
        map.put("k3", "v3");
        assertTrue(map.containsKey(null));
    }

    @Test
    public void testContainsKey_nullKey_falseWhenEmpty() {
        assertFalse(map.containsKey(null));
    }

    @Test
    public void testContainsKey_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertTrue(map.containsKey("k4"));
        assertFalse(map.containsKey("nonexistent"));
    }

    // ---------- containsValue ----------

    @Test
    public void testContainsValue_flatMode_true() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertTrue(map.containsValue("v1"));
        assertTrue(map.containsValue("v2"));
        assertTrue(map.containsValue("v3"));
    }

    @Test
    public void testContainsValue_flatMode_false() {
        map.put("k1", "v1");
        assertFalse(map.containsValue("nonexistent"));
    }

    @Test
    public void testContainsValue_nullValue_true() {
        map.put("k1", null);
        assertTrue(map.containsValue(null));
    }

    @Test
    public void testContainsValue_nullValue_atPositions() {
        map.put("k1", "v1");
        map.put("k2", null);
        assertTrue(map.containsValue(null));
        map.put("k3", "v3");
        assertTrue(map.containsValue(null));
    }

    @Test
    public void testContainsValue_nullValue_falseWhenEmpty() {
        assertFalse(map.containsValue(null));
    }

    @Test
    public void testContainsValue_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertTrue(map.containsValue("v4"));
        assertFalse(map.containsValue("nonexistent"));
    }

    // ---------- putAll ----------

    @Test
    public void testPutAll_emptyMap_noChange() {
        map.put("k1", "v1");
        map.putAll(new HashMap());
        assertEquals(1, map.size());
    }

    @Test
    public void testPutAll_smallMap_flatMode() {
        Map<String, String> src = new HashMap<String, String>();
        src.put("a", "1");
        src.put("b", "2");
        map.putAll(src);
        assertEquals(2, map.size());
    }

    @Test
    public void testPutAll_largeMap_convertsToDelegate() {
        Map<String, String> src = new HashMap<String, String>();
        src.put("a", "1");
        src.put("b", "2");
        src.put("c", "3");
        src.put("d", "4");
        map.putAll(src);
        assertEquals(4, map.size());
    }

    @Test
    public void testPutAll_inDelegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Map<String, String> src = new HashMap<String, String>();
        src.put("k5", "v5");
        map.putAll(src);
        assertEquals(5, map.size());
    }

    // ---------- remove ----------

    @Test
    public void testRemove_fromEmptyMap_returnsNull() {
        assertNull(map.remove("k1"));
    }

    @Test
    public void testRemove_size1_matching() {
        map.put("k1", "v1");
        Object removed = map.remove("k1");
        assertEquals("v1", removed);
        assertEquals(0, map.size());
    }

    @Test
    public void testRemove_size1_notMatching() {
        map.put("k1", "v1");
        assertNull(map.remove("nonexistent"));
        assertEquals(1, map.size());
    }

    @Test
    public void testRemove_size2_removeSecond() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Object removed = map.remove("k2");
        assertEquals("v2", removed);
        assertEquals(1, map.size());
    }

    @Test
    public void testRemove_size2_removeFirst() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Object removed = map.remove("k1");
        assertEquals("v1", removed);
        assertEquals(1, map.size());
        assertEquals("v2", map.get("k2"));
    }

    @Test
    public void testRemove_size2_notMatching() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertNull(map.remove("nonexistent"));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemove_size3_removeThird() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object removed = map.remove("k3");
        assertEquals("v3", removed);
        assertEquals(2, map.size());
    }

    @Test
    public void testRemove_size3_removeSecond() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object removed = map.remove("k2");
        assertEquals("v2", removed);
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v3", map.get("k3"));
    }

    @Test
    public void testRemove_size3_removeFirst() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object removed = map.remove("k1");
        assertEquals("v1", removed);
        assertEquals(2, map.size());
        assertEquals("v2", map.get("k2"));
        assertEquals("v3", map.get("k3"));
    }

    @Test
    public void testRemove_size3_notMatching() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.remove("nonexistent"));
        assertEquals(3, map.size());
    }

    @Test
    public void testRemove_nullKey_size1() {
        map.put(null, "v1");
        Object removed = map.remove(null);
        assertEquals("v1", removed);
        assertEquals(0, map.size());
    }

    @Test
    public void testRemove_nullKey_size1_notFound() {
        map.put("k1", "v1");
        assertNull(map.remove(null));
        assertEquals(1, map.size());
    }

    @Test
    public void testRemove_nullKey_size2_removeSecond() {
        map.put("k1", "v1");
        map.put(null, "v2");
        Object removed = map.remove(null);
        assertEquals("v2", removed);
        assertEquals(1, map.size());
    }

    @Test
    public void testRemove_nullKey_size2_removeFirst() {
        map.put(null, "v1");
        map.put("k2", "v2");
        Object removed = map.remove(null);
        assertEquals("v1", removed);
        assertEquals(1, map.size());
        assertEquals("v2", map.get("k2"));
    }

    @Test
    public void testRemove_nullKey_size2_notFound() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertNull(map.remove(null));
        assertEquals(2, map.size());
    }

    @Test
    public void testRemove_nullKey_size3_removeThird() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "v3");
        Object removed = map.remove(null);
        assertEquals("v3", removed);
        assertEquals(2, map.size());
    }

    @Test
    public void testRemove_nullKey_size3_removeSecond() {
        map.put("k1", "v1");
        map.put(null, "v2");
        map.put("k3", "v3");
        Object removed = map.remove(null);
        assertEquals("v2", removed);
        assertEquals(2, map.size());
    }

    @Test
    public void testRemove_nullKey_size3_removeFirst() {
        map.put(null, "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Object removed = map.remove(null);
        assertEquals("v1", removed);
        assertEquals(2, map.size());
    }

    @Test
    public void testRemove_nullKey_size3_notFound() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.remove(null));
        assertEquals(3, map.size());
    }

    @Test
    public void testRemove_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Object removed = map.remove("k2");
        assertEquals("v2", removed);
        assertEquals(3, map.size());
    }

    // ---------- clear ----------

    @Test
    public void testClear_flatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testClear_delegateMode_switchesBackToFlat() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        map.clear();
        assertEquals(0, map.size());
        // after clear, should behave in flat mode
        map.put("k5", "v5");
        assertEquals(1, map.size());
        assertEquals("v5", map.get("k5"));
    }

    // ---------- mapIterator ----------

    @Test
    public void testMapIterator_emptyMap() {
        MapIterator it = map.mapIterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIterator_flatMode_iterateAll() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        MapIterator it = map.mapIterator();
        int count = 0;
        while (it.hasNext()) {
            Object key = it.next();
            assertNotNull(key);
            assertNotNull(it.getValue());
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testMapIterator_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        MapIterator it = map.mapIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    @Test(expected = NoSuchElementException.class)
    public void testMapIterator_next_pastEnd_throwsException() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.next();
        it.next(); // should throw
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getKey_beforeNext_throwsException() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.getKey();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getValue_beforeNext_throwsException() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.getValue();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_setValue_beforeNext_throwsException() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.setValue("x");
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_remove_beforeNext_throwsException() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.remove();
    }

    @Test
    public void testMapIterator_setValue() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.next();
        Object old = it.setValue("newV1");
        assertEquals("v1", old);
        assertEquals("newV1", map.get("k1"));
    }

    @Test
    public void testMapIterator_remove() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        MapIterator it = map.mapIterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
    }

    @Test
    public void testMapIterator_reset() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        MapIterator it = map.mapIterator();
        it.next();
        it.next();
        assertFalse(it.hasNext());
        ((org.apache.commons.collections.ResettableIterator) it).reset();
        assertTrue(it.hasNext());
    }

    @Test
    public void testMapIterator_toString_beforeNext() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        assertEquals("Iterator[]", it.toString());
    }

    @Test
    public void testMapIterator_toString_afterNext() {
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.next();
        String s = it.toString();
        assertTrue(s.contains("k1"));
        assertTrue(s.contains("v1"));
    }

    // ---------- entrySet ----------

    @Test
    public void testEntrySet_size() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals(2, map.entrySet().size());
    }

    @Test
    public void testEntrySet_clear() {
        map.put("k1", "v1");
        Set entries = map.entrySet();
        entries.clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testEntrySet_iterator_flatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Iterator it = map.entrySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            assertNotNull(entry.getKey());
            assertNotNull(entry.getValue());
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testEntrySet_iterator_emptyMap() {
        Iterator it = map.entrySet().iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testEntrySet_iterator_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Iterator it = map.entrySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    @Test
    public void testEntrySet_remove_validEntry() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Set entries = map.entrySet();
        Map.Entry toRemove = new AbstractMap.SimpleEntry("k1", "v1");
        boolean result = entries.remove(toRemove);
        assertTrue(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testEntrySet_remove_nonEntryObject_returnsFalse() {
        map.put("k1", "v1");
        Set entries = map.entrySet();
        boolean result = entries.remove("not an entry");
        assertFalse(result);
    }

    @Test
    public void testEntrySet_delegateMode_directAccess() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Set entries = map.entrySet();
        assertEquals(4, entries.size());
    }

    @Test
    public void testEntrySetIterator_getKey_beforeNext_throws() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        try {
            ((Map.Entry) it).getKey();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected, but iterator itself is not Entry until next() called in this impl
        } catch (ClassCastException e) {
            // acceptable since Iterator instance before next() cast may fail differently
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testEntrySetIterator_next_pastEnd_throws() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        it.next();
        it.next();
    }

    @Test
    public void testEntrySetIterator_remove() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Iterator it = map.entrySet().iterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testEntrySetIterator_remove_withoutNext_throws() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        it.remove();
    }

    @Test
    public void testEntrySetIterator_setValue() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Object old = entry.setValue("newV1");
        assertEquals("v1", old);
        assertEquals("newV1", map.get("k1"));
    }

    @Test
    public void testEntrySetIterator_equals_and_hashCode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Iterator it1 = map.entrySet().iterator();
        Map.Entry e1 = (Map.Entry) it1.next();

        Map<String,String> other = new HashMap<String,String>();
        other.put("k1", "v1");
        Iterator otherIt = other.entrySet().iterator();
        Map.Entry otherEntry = (Map.Entry) otherIt.next();

        assertTrue(e1.equals(otherEntry));
        assertEquals(e1.hashCode(), otherEntry.hashCode());
    }

    @Test
    public void testEntrySetIterator_equals_falseForNonEntry() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Map.Entry e1 = (Map.Entry) it.next();
        assertFalse(e1.equals("not an entry"));
    }

    @Test
    public void testEntrySetIterator_toString() {
        map.put("k1", "v1");
        Iterator it = map.entrySet().iterator();
        Map.Entry e1 = (Map.Entry) it.next();
        assertEquals("k1=v1", e1.toString());
    }

    // ---------- keySet ----------

    @Test
    public void testKeySet_size() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals(2, map.keySet().size());
    }

    @Test
    public void testKeySet_contains() {
        map.put("k1", "v1");
        assertTrue(map.keySet().contains("k1"));
        assertFalse(map.keySet().contains("nonexistent"));
    }

    @Test
    public void testKeySet_remove() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        boolean result = map.keySet().remove("k1");
        assertTrue(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testKeySet_remove_notFound() {
        map.put("k1", "v1");
        boolean result = map.keySet().remove("nonexistent");
        assertFalse(result);
    }

    @Test
    public void testKeySet_clear() {
        map.put("k1", "v1");
        map.keySet().clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testKeySet_iterator_flatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Iterator it = map.keySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            Object key = it.next();
            assertNotNull(key);
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testKeySet_iterator_emptyMap() {
        Iterator it = map.keySet().iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testKeySet_iterator_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Iterator it = map.keySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    // ---------- values ----------

    @Test
    public void testValues_size() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals(2, map.values().size());
    }

    @Test
    public void testValues_contains() {
        map.put("k1", "v1");
        assertTrue(map.values().contains("v1"));
        assertFalse(map.values().contains("nonexistent"));
    }

    @Test
    public void testValues_clear() {
        map.put("k1", "v1");
        map.values().clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testValues_iterator_flatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Iterator it = map.values().iterator();
        int count = 0;
        while (it.hasNext()) {
            Object val = it.next();
            assertNotNull(val);
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testValues_iterator_emptyMap() {
        Iterator it = map.values().iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testValues_iterator_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Iterator it = map.values().iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(4, count);
    }

    // ---------- clone ----------

    @Test
    public void testClone_flatMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map.size(), cloned.size());
        assertEquals(map.get("k1"), cloned.get("k1"));
        // modifying clone should not affect original
        cloned.put("k3", "v3");
        assertNotEquals(map.size(), cloned.size());
    }

    @Test
    public void testClone_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map.size(), cloned.size());
        assertEquals(map.get("k1"), cloned.get("k1"));
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_true() {
        map.put("k1", "v1");
        assertTrue(map.equals(map));
    }

    @Test
    public void testEquals_notAMap_false() {
        map.put("k1", "v1");
        assertFalse(map.equals("not a map"));
    }

    @Test
    public void testEquals_differentSize_false() {
        map.put("k1", "v1");
        Map<String, String> other = new HashMap<String, String>();
        other.put("k1", "v1");
        other.put("k2", "v2");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEquals_sameContent_true() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Map<String, String> other = new HashMap<String, String>();
        other.put("k1", "v1");
        other.put("k2", "v2");
        assertTrue(map.equals(other));
    }

    @Test
    public void testEquals_differentContent_false() {
        map.put("k1", "v1");
        Map<String, String> other = new HashMap<String, String>();
        other.put("k1", "differentValue");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEquals_missingKeyInOther_false() {
        map.put("k1", "v1");
        Map<String, String> other = new HashMap<String, String>();
        other.put("k2", "v1");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEquals_emptyMaps_true() {
        Map<String, String> other = new HashMap<String, String>();
        assertTrue(map.equals(other));
    }

    @Test
    public void testEquals_nullValue_matching() {
        map.put("k1", null);
        Map<String, String> other = new HashMap<String, String>();
        other.put("k1", null);
        assertTrue(map.equals(other));
    }

    @Test
    public void testEquals_nullValue_mismatch() {
        map.put("k1", null);
        Map<String, String> other = new HashMap<String, String>();
        other.put("k1", "notNull");
        assertFalse(map.equals(other));
    }

    @Test
    public void testEquals_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Map<String, String> other = new HashMap<String, String>();
        other.put("k1", "v1");
        other.put("k2", "v2");
        other.put("k3", "v3");
        other.put("k4", "v4");
        assertTrue(map.equals(other));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_emptyMap() {
        assertEquals(0, map.hashCode());
    }

    @Test
    public void testHashCode_singleEntry() {
        map.put("k1", "v1");
        int hc = map.hashCode();
        assertTrue(hc != 0 || "k1".hashCode() == 0);
    }

    @Test
    public void testHashCode_consistentWithEquals() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Map<String, String> other = new HashMap<String, String>();
        other.put("k1", "v1");
        other.put("k2", "v2");
        assertEquals(map.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        int hc = map.hashCode();
        // just verify no exception and consistent call
        assertEquals(hc, map.hashCode());
    }

    // ---------- toString ----------

    @Test
    public void testToString_emptyMap() {
        assertEquals("{}", map.toString());
    }

    @Test
    public void testToString_singleEntry() {
        map.put("k1", "v1");
        String s = map.toString();
        assertTrue(s.contains("k1"));
        assertTrue(s.contains("v1"));
    }

    @Test
    public void testToString_multipleEntries() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        String s = map.toString();
        assertTrue(s.startsWith("{"));
        assertTrue(s.endsWith("}"));
    }

    @Test
    public void testToString_delegateMode() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        String s = map.toString();
        assertNotNull(s);
    }

    @Test
    public void testToString_selfReference() {
        map.put("selfKey", map);
        String s = map.toString();
        assertTrue(s.contains("(this Map)"));
    }

    // ---------- serialization ----------

    @Test
    public void testSerialization_flatMode() throws IOException, ClassNotFoundException {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();
        ois.close();

        assertEquals(3, deserialized.size());
        assertEquals("v1", deserialized.get("k1"));
        assertEquals("v2", deserialized.get("k2"));
        assertEquals("v3", deserialized.get("k3"));
    }

    @Test
    public void testSerialization_delegateMode() throws IOException, ClassNotFoundException {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();
        ois.close();

        assertEquals(4, deserialized.size());
        assertEquals("v1", deserialized.get("k1"));
        assertEquals("v4", deserialized.get("k4"));
    }

    @Test
    public void testSerialization_emptyMap() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();
        ois.close();

        assertEquals(0, deserialized.size());
    }

    // ---------- KeySetIterator / ValuesIterator specific ----------

    @Test
    public void testKeySetIterator_next_returnsKey() {
        map.put("k1", "v1");
        Iterator it = map.keySet().iterator();
        Object result = it.next();
        assertEquals("k1", result);
    }

    @Test
    public void testValuesIterator_next_returnsValue() {
        map.put("k1", "v1");
        Iterator it = map.values().iterator();
        Object result = it.next();
        assertEquals("v1", result);
    }
}
