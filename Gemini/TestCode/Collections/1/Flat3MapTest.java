package org.apache.commons.collections.map;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.apache.commons.collections.iterators.EmptyMapIterator;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Flat3MapTest {

    @Test
    public void testDefaultConstructor_initiallyEmpty() {
        Flat3Map map = new Flat3Map();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertNull(map.get("key"));
    }

    @Test
    public void testMapConstructor_nullMap_throwsNullPointerException() {
        try {
            new Flat3Map(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testMapConstructor_smallMap_flatMode() {
        Map source = new HashMap();
        source.put("k1", "v1");
        source.put("k2", "v2");
        Flat3Map map = new Flat3Map(source);
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));
    }

    @Test
    public void testMapConstructor_largeMap_delegateMode() {
        Map source = new HashMap();
        source.put("k1", "v1");
        source.put("k2", "v2");
        source.put("k3", "v3");
        source.put("k4", "v4");
        Flat3Map map = new Flat3Map(source);
        assertEquals(4, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v4", map.get("k4"));
    }

    @Test
    public void testPutAndGet_flatMode_size1To3() {
        Flat3Map map = new Flat3Map();
        assertNull(map.put("k1", "v1"));
        assertEquals(1, map.size());
        assertEquals("v1", map.get("k1"));
        assertNull(map.get("nonexistent"));

        assertNull(map.put("k2", "v2"));
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));

        assertNull(map.put("k3", "v3"));
        assertEquals(3, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));
        assertEquals("v3", map.get("k3"));

        // Replace existing keys
        assertEquals("v1", map.put("k1", "v1_new"));
        assertEquals("v1_new", map.get("k1"));

        assertEquals("v2", map.put("k2", "v2_new"));
        assertEquals("v2_new", map.get("k2"));

        assertEquals("v3", map.put("k3", "v3_new"));
        assertEquals("v3_new", map.get("k3"));
        assertEquals(3, map.size());
    }

    @Test
    public void testPutAndGet_nullKeys_flatMode() {
        Flat3Map map = new Flat3Map();
        assertNull(map.put(null, "nullVal1"));
        assertEquals(1, map.size());
        assertEquals("nullVal1", map.get(null));
        assertEquals("nullVal1", map.put(null, "nullVal1_updated"));
        assertEquals("nullVal1_updated", map.get(null));

        map = new Flat3Map();
        map.put("k1", "v1");
        map.put(null, "nullVal2");
        assertEquals(2, map.size());
        assertEquals("nullVal2", map.get(null));
        assertEquals("nullVal2", map.put(null, "nullVal2_updated"));

        map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "nullVal3");
        assertEquals(3, map.size());
        assertEquals("nullVal3", map.get(null));
        assertEquals("nullVal3", map.put(null, "nullVal3_updated"));
        assertEquals("nullVal3_updated", map.get(null));
    }

    @Test
    public void testPut_transitionToDelegateMode_size4AndAbove() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.put("k4", "v4"));

        assertEquals(4, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));
        assertEquals("v3", map.get("k3"));
        assertEquals("v4", map.get("k4"));

        assertEquals("v4", map.put("k4", "v4_updated"));
        assertEquals("v4_updated", map.get("k4"));

        map.put(null, "nullVal");
        assertEquals("nullVal", map.get(null));
    }

    @Test
    public void testContainsKey_flatMode() {
        Flat3Map map = new Flat3Map();
        assertFalse(map.containsKey("k1"));
        assertFalse(map.containsKey(null));

        map.put("k1", "v1");
        assertTrue(map.containsKey("k1"));
        assertFalse(map.containsKey("k2"));
        assertFalse(map.containsKey(null));

        map.put("k2", "v2");
        assertTrue(map.containsKey("k1"));
        assertTrue(map.containsKey("k2"));
        assertFalse(map.containsKey("k3"));

        map.put("k3", "v3");
        assertTrue(map.containsKey("k1"));
        assertTrue(map.containsKey("k2"));
        assertTrue(map.containsKey("k3"));
        assertFalse(map.containsKey("k4"));

        Flat3Map mapWithNull = new Flat3Map();
        mapWithNull.put(null, "v1");
        assertTrue(mapWithNull.containsKey(null));

        mapWithNull = new Flat3Map();
        mapWithNull.put("k1", "v1");
        mapWithNull.put(null, "v2");
        assertTrue(mapWithNull.containsKey(null));

        mapWithNull = new Flat3Map();
        mapWithNull.put("k1", "v1");
        mapWithNull.put("k2", "v2");
        mapWithNull.put(null, "v3");
        assertTrue(mapWithNull.containsKey(null));
    }

    @Test
    public void testContainsKey_delegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertTrue(map.containsKey("k1"));
        assertTrue(map.containsKey("k4"));
        assertFalse(map.containsKey("k5"));
    }

    @Test
    public void testContainsValue_flatMode() {
        Flat3Map map = new Flat3Map();
        assertFalse(map.containsValue("v1"));
        assertFalse(map.containsValue(null));

        map.put("k1", "v1");
        assertTrue(map.containsValue("v1"));
        assertFalse(map.containsValue("v2"));

        map.put("k2", null);
        assertTrue(map.containsValue(null));
        assertTrue(map.containsValue("v1"));

        map.put("k3", "v3");
        assertTrue(map.containsValue("v3"));
        assertTrue(map.containsValue(null));
        assertFalse(map.containsValue("v4"));

        Flat3Map mapNull3 = new Flat3Map();
        mapNull3.put("k1", "v1");
        mapNull3.put("k2", "v2");
        mapNull3.put("k3", null);
        assertTrue(mapNull3.containsValue(null));

        Flat3Map mapNull1 = new Flat3Map();
        mapNull1.put("k1", null);
        assertTrue(mapNull1.containsValue(null));
    }

    @Test
    public void testContainsValue_delegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        assertTrue(map.containsValue("v1"));
        assertTrue(map.containsValue("v4"));
        assertFalse(map.containsValue("v5"));
    }

    @Test
    public void testPutAll_emptyMap_noOp() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.putAll(new HashMap());
        assertEquals(1, map.size());
    }

    @Test
    public void testPutAll_smallMapIntoFlatMode() {
        Flat3Map map = new Flat3Map();
        Map source = new HashMap();
        source.put("k1", "v1");
        source.put("k2", "v2");
        map.putAll(source);
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));
    }

    @Test
    public void testPutAll_largeMapTransitionsToDelegate() {
        Flat3Map map = new Flat3Map();
        map.put("k0", "v0");
        Map source = new HashMap();
        source.put("k1", "v1");
        source.put("k2", "v2");
        source.put("k3", "v3");
        source.put("k4", "v4");
        map.putAll(source);
        assertEquals(5, map.size());
        assertEquals("v0", map.get("k0"));
        assertEquals("v4", map.get("k4"));
    }

    @Test
    public void testPutAll_alreadyInDelegateMode() {
        Flat3Map map = new Flat3Map();
        for (int i = 0; i < 5; i++) {
            map.put("k" + i, "v" + i);
        }
        Map source = new HashMap();
        source.put("k5", "v5");
        map.putAll(source);
        assertEquals(6, map.size());
        assertEquals("v5", map.get("k5"));
    }

    @Test
    public void testRemove_flatMode_size1() {
        Flat3Map map = new Flat3Map();
        assertNull(map.remove("k1"));

        map.put("k1", "v1");
        assertNull(map.remove("k2"));
        assertEquals("v1", map.remove("k1"));
        assertEquals(0, map.size());
        assertFalse(map.containsKey("k1"));

        map.put(null, "nullVal");
        assertEquals("nullVal", map.remove(null));
        assertEquals(0, map.size());
    }

    @Test
    public void testRemove_flatMode_size2() {
        // remove key1
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertNull(map.remove("k3"));
        assertEquals("v1", map.remove("k1"));
        assertEquals(1, map.size());
        assertEquals("v2", map.get("k2"));

        // remove key2
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals("v2", map.remove("k2"));
        assertEquals(1, map.size());
        assertEquals("v1", map.get("k1"));

        // remove null at position 1
        map = new Flat3Map();
        map.put(null, "v1");
        map.put("k2", "v2");
        assertEquals("v1", map.remove(null));
        assertEquals(1, map.size());
        assertEquals("v2", map.get("k2"));

        // remove null at position 2
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put(null, "v2");
        assertEquals("v2", map.remove(null));
        assertEquals(1, map.size());
        assertEquals("v1", map.get("k1"));

        // remove non-existing null
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertNull(map.remove(null));
    }

    @Test
    public void testRemove_flatMode_size3() {
        // remove key1
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.remove("k4"));
        assertEquals("v1", map.remove("k1"));
        assertEquals(2, map.size());
        assertEquals("v3", map.get("k1")); // Flat3Map moves k3 into slot 1
        assertEquals("v2", map.get("k2"));

        // remove key2
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v2", map.remove("k2"));
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v3", map.get("k2"));

        // remove key3
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v3", map.remove("k3"));
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v2", map.get("k2"));

        // remove null key at position 1
        map = new Flat3Map();
        map.put(null, "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v1", map.remove(null));
        assertEquals(2, map.size());

        // remove null key at position 2
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put(null, "v2");
        map.put("k3", "v3");
        assertEquals("v2", map.remove(null));
        assertEquals(2, map.size());

        // remove null key at position 3
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "v3");
        assertEquals("v3", map.remove(null));
        assertEquals(2, map.size());

        // remove non-existing null when size 3
        map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertNull(map.remove(null));
    }

    @Test
    public void testRemove_delegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");

        assertEquals("v2", map.remove("k2"));
        assertEquals(3, map.size());
        assertNull(map.get("k2"));
        assertNull(map.remove("k2"));
    }

    @Test
    public void testClear_flatModeAndDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertNull(map.get("k1"));

        for (int i = 0; i < 5; i++) {
            map.put("k" + i, "v" + i);
        }
        assertEquals(5, map.size());
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());

        // After clear, it switches back to flat mode
        map.put("newK", "newV");
        assertEquals(1, map.size());
        assertEquals("newV", map.get("newK"));
    }

    @Test
    public void testMapIterator_emptyMap() {
        Flat3Map map = new Flat3Map();
        MapIterator it = map.mapIterator();
        assertSame(EmptyMapIterator.INSTANCE, it);
        assertFalse(it.hasNext());
    }

    private static void assertSame(Object expected, Object actual) {
        org.junit.Assert.assertSame(expected, actual);
    }

    @Test
    public void testMapIterator_flatMode_fullIterationAndMutations() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        Flat3Map.FlatMapIterator it = (Flat3Map.FlatMapIterator) map.mapIterator();
        assertEquals("Iterator[]", it.toString());

        try {
            it.getKey();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        try {
            it.getValue();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        try {
            it.setValue("fail");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        try {
            it.remove();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }

        assertTrue(it.hasNext());
        assertEquals("k1", it.next());
        assertEquals("k1", it.getKey());
        assertEquals("v1", it.getValue());
        assertEquals("Iterator[k1=v1]", it.toString());
        assertEquals("v1", it.setValue("v1_mod"));
        assertEquals("v1_mod", it.getValue());

        assertTrue(it.hasNext());
        assertEquals("k2", it.next());
        assertEquals("k2", it.getKey());
        assertEquals("v2", it.getValue());
        assertEquals("v2", it.setValue("v2_mod"));

        assertTrue(it.hasNext());
        assertEquals("k3", it.next());
        assertEquals("k3", it.getKey());
        assertEquals("v3", it.getValue());
        assertEquals("v3", it.setValue("v3_mod"));

        assertFalse(it.hasNext());
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }

        it.reset();
        assertEquals("Iterator[]", it.toString());
        assertTrue(it.hasNext());
        assertEquals("k1", it.next());
        it.remove();
        assertEquals(2, map.size());

        try {
            it.remove();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testMapIterator_delegateMode() {
        Flat3Map map = new Flat3Map();
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

    @Test
    public void testEntrySet_flatMode_andDelegateMode() {
        Flat3Map map = new Flat3Map();
        Set entrySet = map.entrySet();
        assertEquals(0, entrySet.size());
        assertSame(EmptyIterator.INSTANCE, entrySet.iterator());

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals(3, entrySet.size());

        Iterator it = entrySet.iterator();
        try {
            ((Map.Entry) it).getKey();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        try {
            ((Map.Entry) it).getValue();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        try {
            ((Map.Entry) it).setValue("val");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        try {
            it.remove();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }

        assertEquals("", it.toString());
        assertFalse(it.equals(new Object()));

        assertTrue(it.hasNext());
        Map.Entry entry1 = (Map.Entry) it.next();
        assertEquals("k1", entry1.getKey());
        assertEquals("v1", entry1.getValue());
        assertEquals("k1=v1", entry1.toString());
        assertNotNull(entry1.hashCode());

        Map fakeEntry = new HashMap();
        fakeEntry.put("k1", "v1");
        Map.Entry realEntry = (Map.Entry) fakeEntry.entrySet().iterator().next();
        assertTrue(entry1.equals(realEntry));
        assertFalse(entry1.equals("NotAnEntry"));

        assertEquals("v1", entry1.setValue("v1_mod"));
        assertEquals("v1_mod", entry1.getValue());

        assertTrue(it.hasNext());
        Map.Entry entry2 = (Map.Entry) it.next();
        assertEquals("k2", entry2.getKey());
        assertEquals("v2", entry2.setValue("v2_mod"));

        assertTrue(it.hasNext());
        Map.Entry entry3 = (Map.Entry) it.next();
        assertEquals("k3", entry3.getKey());
        assertEquals("v3", entry3.setValue("v3_mod"));

        assertFalse(it.hasNext());
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }

        it.remove();
        assertEquals(2, map.size());

        assertFalse(entrySet.remove("not an entry"));
        fakeEntry.clear();
        fakeEntry.put("nonexistent", "val");
        assertFalse(entrySet.remove(fakeEntry.entrySet().iterator().next()));

        fakeEntry.clear();
        fakeEntry.put("k1", "v1_mod");
        assertTrue(entrySet.remove(fakeEntry.entrySet().iterator().next()));
        assertEquals(1, map.size());

        entrySet.clear();
        assertEquals(0, map.size());

        // Delegate mode entrySet
        for (int i = 0; i < 5; i++) {
            map.put("k" + i, "v" + i);
        }
        Set delEntrySet = map.entrySet();
        assertEquals(5, delEntrySet.size());
        Iterator delIt = delEntrySet.iterator();
        assertTrue(delIt.hasNext());
    }

    @Test
    public void testKeySet_flatMode_andDelegateMode() {
        Flat3Map map = new Flat3Map();
        Set keySet = map.keySet();
        assertEquals(0, keySet.size());
        assertSame(EmptyIterator.INSTANCE, keySet.iterator());

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        assertEquals(3, keySet.size());
        assertTrue(keySet.contains("k1"));
        assertFalse(keySet.contains("nonexistent"));

        Iterator it = keySet.iterator();
        assertTrue(it.hasNext());
        assertEquals("k1", it.next());
        assertTrue(it.hasNext());
        assertEquals("k2", it.next());
        assertTrue(it.hasNext());
        assertEquals("k3", it.next());

        assertTrue(keySet.remove("k2"));
        assertFalse(keySet.remove("k2"));
        assertEquals(2, keySet.size());

        keySet.clear();
        assertEquals(0, map.size());

        // Delegate mode keySet
        for (int i = 0; i < 5; i++) {
            map.put("k" + i, "v" + i);
        }
        Set delKeySet = map.keySet();
        assertEquals(5, delKeySet.size());
        assertTrue(delKeySet.iterator().hasNext());
    }

    @Test
    public void testValues_flatMode_andDelegateMode() {
        Flat3Map map = new Flat3Map();
        Collection values = map.values();
        assertEquals(0, values.size());
        assertSame(EmptyIterator.INSTANCE, values.iterator());

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        assertEquals(3, values.size());
        assertTrue(values.contains("v1"));
        assertFalse(values.contains("nonexistent"));

        Iterator it = values.iterator();
        assertTrue(it.hasNext());
        assertEquals("v1", it.next());
        assertTrue(it.hasNext());
        assertEquals("v2", it.next());
        assertTrue(it.hasNext());
        assertEquals("v3", it.next());

        values.clear();
        assertEquals(0, map.size());

        // Delegate mode values
        for (int i = 0; i < 5; i++) {
            map.put("k" + i, "v" + i);
        }
        Collection delValues = map.values();
        assertEquals(5, delValues.size());
        assertTrue(delValues.iterator().hasNext());
    }

    @Test
    public void testClone_flatAndDelegateMode() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Flat3Map clone = (Flat3Map) map.clone();
        assertNotSame(map, clone);
        assertEquals(map, clone);
        assertEquals(2, clone.size());

        for (int i = 3; i < 6; i++) {
            map.put("k" + i, "v" + i);
        }
        Flat3Map delegateClone = (Flat3Map) map.clone();
        assertNotSame(map, delegateClone);
        assertEquals(map, delegateClone);
        assertEquals(5, delegateClone.size());
    }

    @Test
    public void testEqualsAndHashCode_flatMode() {
        Flat3Map map1 = new Flat3Map();
        Flat3Map map2 = new Flat3Map();

        assertTrue(map1.equals(map1));
        assertFalse(map1.equals("Not a map"));
        assertTrue(map1.equals(map2));
        assertEquals(map1.hashCode(), map2.hashCode());

        map1.put("k1", "v1");
        assertFalse(map1.equals(map2));

        map2.put("k1", "v1");
        assertTrue(map1.equals(map2));
        assertEquals(map1.hashCode(), map2.hashCode());

        map1.put("k2", "v2");
        map2.put("k2", "diff");
        assertFalse(map1.equals(map2));

        map2.put("k2", "v2");
        map1.put("k3", "v3");
        map2.put("k3", "v3");
        assertTrue(map1.equals(map2));
        assertEquals(map1.hashCode(), map2.hashCode());

        Map diffKeyMap = new HashMap();
        diffKeyMap.put("k1", "v1");
        diffKeyMap.put("k2", "v2");
        diffKeyMap.put("other", "v3");
        assertFalse(map1.equals(diffKeyMap));

        diffKeyMap.clear();
        diffKeyMap.put("k1", "v1");
        diffKeyMap.put("other", "v2");
        diffKeyMap.put("k3", "v3");
        assertFalse(map1.equals(diffKeyMap));

        diffKeyMap.clear();
        diffKeyMap.put("other", "v1");
        diffKeyMap.put("k2", "v2");
        diffKeyMap.put("k3", "v3");
        assertFalse(map1.equals(diffKeyMap));

        // Test with null keys/values
        Flat3Map mapWithNulls1 = new Flat3Map();
        mapWithNulls1.put("k1", null);
        mapWithNulls1.put(null, "v2");
        mapWithNulls1.put("k3", null);

        Flat3Map mapWithNulls2 = new Flat3Map();
        mapWithNulls2.put("k1", null);
        mapWithNulls2.put(null, "v2");
        mapWithNulls2.put("k3", null);

        assertTrue(mapWithNulls1.equals(mapWithNulls2));
        assertEquals(mapWithNulls1.hashCode(), mapWithNulls2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_delegateMode() {
        Flat3Map map1 = new Flat3Map();
        Flat3Map map2 = new Flat3Map();

        for (int i = 0; i < 5; i++) {
            map1.put("k" + i, "v" + i);
            map2.put("k" + i, "v" + i);
        }

        assertTrue(map1.equals(map2));
        assertEquals(map1.hashCode(), map2.hashCode());

        map2.put("k5", "v5");
        assertFalse(map1.equals(map2));
    }

    @Test
    public void testToString_flatMode_andDelegateMode() {
        Flat3Map map = new Flat3Map();
        assertEquals("{}", map.toString());

        map.put("k1", "v1");
        assertEquals("{k1=v1}", map.toString());

        map.put("k2", "v2");
        assertEquals("{k2=v2,k1=v1}", map.toString());

        map.put("k3", "v3");
        assertEquals("{k3=v3,k2=v2,k1=v1}", map.toString());

        Flat3Map selfMap = new Flat3Map();
        selfMap.put(selfMap, selfMap);
        assertEquals("{(this Map)=(this Map)}", selfMap.toString());

        selfMap.put("k2", selfMap);
        assertEquals("{k2=(this Map),(this Map)=(this Map)}", selfMap.toString());

        selfMap.put("k3", selfMap);
        assertEquals("{k3=(this Map),k2=(this Map),(this Map)=(this Map)}", selfMap.toString());

        for (int i = 4; i <= 6; i++) {
            map.put("k" + i, "v" + i);
        }
        assertTrue(map.toString().startsWith("{"));
        assertTrue(map.toString().endsWith("}"));
    }

    @Test
    public void testSerialization_flatMode() throws Exception {
        Flat3Map map = new Flat3Map();
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

        assertEquals(3, deserialized.size());
        assertEquals("v1", deserialized.get("k1"));
        assertEquals("v2", deserialized.get("k2"));
        assertEquals("v3", deserialized.get("k3"));
    }

    @Test
    public void testSerialization_delegateMode() throws Exception {
        Flat3Map map = new Flat3Map();
        for (int i = 0; i < 5; i++) {
            map.put("k" + i, "v" + i);
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();

        assertEquals(5, deserialized.size());
        for (int i = 0; i < 5; i++) {
            assertEquals("v" + i, deserialized.get("k" + i));
        }
    }

    @Test
    public void testCreateDelegateMap_canBeOverridden() {
        Flat3Map map = new Flat3Map() {
            protected AbstractHashedMap createDelegateMap() {
                return new HashedMap(16);
            }
        };
        for (int i = 0; i < 5; i++) {
            map.put("k" + i, "v" + i);
        }
        assertEquals(5, map.size());
        assertEquals("v4", map.get("k4"));
    }
}
