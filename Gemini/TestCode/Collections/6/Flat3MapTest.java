package org.apache.commons.collections.map;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.ResettableIterator;
import org.junit.Assert;
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

public class Flat3MapTest {

    @Test
    public void testDefaultConstructor_empty() {
        Flat3Map map = new Flat3Map();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.get("key"));
        Assert.assertFalse(map.containsKey("key"));
        Assert.assertFalse(map.containsValue("value"));
        Assert.assertEquals("{}", map.toString());
        Assert.assertEquals(0, map.hashCode());
    }

    @Test
    public void testMapConstructor_withEntries() {
        Map<String, String> init = new HashMap<String, String>();
        init.put("a", "1");
        init.put("b", "2");
        Flat3Map map = new Flat3Map(init);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("1", map.get("a"));
        Assert.assertEquals("2", map.get("b"));
    }

    @Test(expected = NullPointerException.class)
    public void testMapConstructor_nullMap_throwsException() {
        new Flat3Map(null);
    }

    @Test
    public void testPutAndGet_flatMode_sizes1To3() {
        Flat3Map map = new Flat3Map();

        Assert.assertNull(map.put("k1", "v1"));
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("v1", map.get("k1"));
        Assert.assertTrue(map.containsKey("k1"));
        Assert.assertTrue(map.containsValue("v1"));

        Assert.assertNull(map.put("k2", "v2"));
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("v2", map.get("k2"));
        Assert.assertTrue(map.containsKey("k2"));
        Assert.assertTrue(map.containsValue("v2"));

        Assert.assertNull(map.put("k3", "v3"));
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("v3", map.get("k3"));
        Assert.assertTrue(map.containsKey("k3"));
        Assert.assertTrue(map.containsValue("v3"));

        Assert.assertNull(map.get("nonexistent"));
        Assert.assertFalse(map.containsKey("nonexistent"));
        Assert.assertFalse(map.containsValue("nonexistent"));
    }

    @Test
    public void testPut_existingKeys_updatesValues() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        Assert.assertEquals("v1", map.put("k1", "v1_updated"));
        Assert.assertEquals("v1_updated", map.get("k1"));
        Assert.assertEquals(1, map.size());

        map.put("k2", "v2");
        Assert.assertEquals("v2", map.put("k2", "v2_updated"));
        Assert.assertEquals("v2_updated", map.get("k2"));
        Assert.assertEquals(2, map.size());

        map.put("k3", "v3");
        Assert.assertEquals("v3", map.put("k3", "v3_updated"));
        Assert.assertEquals("v3_updated", map.get("k3"));
        Assert.assertEquals(3, map.size());

        Assert.assertEquals("v1_updated", map.put("k1", "v1_final"));
        Assert.assertEquals("v1_final", map.get("k1"));
        Assert.assertEquals("v2_updated", map.put("k2", "v2_final"));
        Assert.assertEquals("v2_final", map.get("k2"));
    }

    @Test
    public void testPut_nullKeysAndValues() {
        Flat3Map map = new Flat3Map();
        Assert.assertNull(map.put(null, "nullVal1"));
        Assert.assertEquals(1, map.size());
        Assert.assertTrue(map.containsKey(null));
        Assert.assertEquals("nullVal1", map.get(null));

        Assert.assertEquals("nullVal1", map.put(null, "nullVal2"));
        Assert.assertEquals("nullVal2", map.get(null));

        map.put("k2", null);
        Assert.assertTrue(map.containsValue(null));
        Assert.assertNull(map.get("k2"));

        map.put("k3", "v3");
        Assert.assertTrue(map.containsKey(null));
        Assert.assertTrue(map.containsValue(null));
        Assert.assertEquals("nullVal2", map.put(null, "nullVal3"));
    }

    @Test
    public void testConvertToDelegateMap_whenExceeds3() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Assert.assertNull(map.put("k4", "v4"));

        Assert.assertEquals(4, map.size());
        Assert.assertFalse(map.isEmpty());
        Assert.assertEquals("v1", map.get("k1"));
        Assert.assertEquals("v2", map.get("k2"));
        Assert.assertEquals("v3", map.get("k3"));
        Assert.assertEquals("v4", map.get("k4"));
        Assert.assertTrue(map.containsKey("k4"));
        Assert.assertTrue(map.containsValue("v4"));

        Assert.assertEquals("v4", map.put("k4", "v4_updated"));
        Assert.assertEquals("v4_updated", map.get("k4"));
        Assert.assertEquals("v4_updated", map.remove("k4"));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void testPutAll_emptyMap() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.putAll(new HashMap());
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void testPutAll_lessThan4Entries() {
        Flat3Map map = new Flat3Map();
        Map<String, String> src = new HashMap<String, String>();
        src.put("k1", "v1");
        src.put("k2", "v2");
        map.putAll(src);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("v1", map.get("k1"));
        Assert.assertEquals("v2", map.get("k2"));
    }

    @Test
    public void testPutAll_moreThan3Entries_triggersDelegation() {
        Flat3Map map = new Flat3Map();
        Map<String, String> src = new HashMap<String, String>();
        src.put("k1", "v1");
        src.put("k2", "v2");
        src.put("k3", "v3");
        src.put("k4", "v4");
        map.putAll(src);
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("v4", map.get("k4"));

        Map<String, String> src2 = new HashMap<String, String>();
        src2.put("k5", "v5");
        map.putAll(src2);
        Assert.assertEquals(5, map.size());
        Assert.assertEquals("v5", map.get("k5"));
    }

    @Test
    public void testRemove_flatMode_allCombinations() {
        Flat3Map map = new Flat3Map();
        Assert.assertNull(map.remove("nonexistent"));
        Assert.assertNull(map.remove(null));

        // Size 1 remove
        map.put("k1", "v1");
        Assert.assertNull(map.remove("other"));
        Assert.assertNull(map.remove(null));
        Assert.assertEquals("v1", map.remove("k1"));
        Assert.assertEquals(0, map.size());

        // Size 1 remove null
        map.put(null, "vNull");
        Assert.assertEquals("vNull", map.remove(null));
        Assert.assertEquals(0, map.size());

        // Size 2 remove key2
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertNull(map.remove("k3"));
        Assert.assertNull(map.remove(null));
        Assert.assertEquals("v2", map.remove("k2"));
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("v1", map.get("k1"));

        // Size 2 remove key1
        map.clear();
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals("v1", map.remove("k1"));
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("v2", map.get("k2"));

        // Size 2 remove null key when at key2
        map.clear();
        map.put("k1", "v1");
        map.put(null, "v2");
        Assert.assertEquals("v2", map.remove(null));
        Assert.assertEquals(1, map.size());

        // Size 2 remove null key when at key1
        map.clear();
        map.put(null, "v1");
        map.put("k2", "v2");
        Assert.assertEquals("v1", map.remove(null));
        Assert.assertEquals(1, map.size());

        // Size 3 remove key3
        map.clear();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Assert.assertNull(map.remove("k4"));
        Assert.assertNull(map.remove(null));
        Assert.assertEquals("v3", map.remove("k3"));
        Assert.assertEquals(2, map.size());

        // Size 3 remove key2
        map.clear();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Assert.assertEquals("v2", map.remove("k2"));
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("v1", map.get("k1"));
        Assert.assertEquals("v3", map.get("k3"));

        // Size 3 remove key1
        map.clear();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Assert.assertEquals("v1", map.remove("k1"));
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("v2", map.get("k2"));
        Assert.assertEquals("v3", map.get("k3"));

        // Size 3 remove null key at key3
        map.clear();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put(null, "v3");
        Assert.assertEquals("v3", map.remove(null));
        Assert.assertEquals(2, map.size());

        // Size 3 remove null key at key2
        map.clear();
        map.put("k1", "v1");
        map.put(null, "v2");
        map.put("k3", "v3");
        Assert.assertEquals("v2", map.remove(null));
        Assert.assertEquals(2, map.size());

        // Size 3 remove null key at key1
        map.clear();
        map.put(null, "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        Assert.assertEquals("v1", map.remove(null));
        Assert.assertEquals(2, map.size());
    }

    @Test
    public void testClear_flatAndDelegate() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.clear();
        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.isEmpty());

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        Assert.assertEquals(4, map.size());
        map.clear();
        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.isEmpty());

        map.put("a", "b");
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("b", map.get("a"));
    }

    @Test
    public void testMapIterator_flatMode() {
        Flat3Map map = new Flat3Map();
        MapIterator emptyIt = map.mapIterator();
        Assert.assertFalse(emptyIt.hasNext());

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        MapIterator it = map.mapIterator();
        Assert.assertEquals("Iterator[]", it.toString());

        Assert.assertTrue(it.hasNext());
        Object k1 = it.next();
        Assert.assertEquals("k1", k1);
        Assert.assertEquals("k1", it.getKey());
        Assert.assertEquals("v1", it.getValue());
        Assert.assertEquals("Iterator[k1=v1]", it.toString());
        Assert.assertEquals("v1", it.setValue("v1_new"));
        Assert.assertEquals("v1_new", map.get("k1"));

        Assert.assertTrue(it.hasNext());
        Object k2 = it.next();
        Assert.assertEquals("k2", k2);
        Assert.assertEquals("v2", it.setValue("v2_new"));

        Assert.assertTrue(it.hasNext());
        Object k3 = it.next();
        Assert.assertEquals("k3", k3);
        Assert.assertEquals("v3", it.setValue("v3_new"));
        Assert.assertFalse(it.hasNext());

        ((ResettableIterator) it).reset();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("k1", it.next());
        it.remove();
        Assert.assertEquals(2, map.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testMapIterator_nextPastEnd_throwsException() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.next();
        it.next();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getKeyBeforeNext_throwsException() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.mapIterator().getKey();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_getValueBeforeNext_throwsException() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.mapIterator().getValue();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_setValueBeforeNext_throwsException() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.mapIterator().setValue("new");
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIterator_doubleRemove_throwsException() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        MapIterator it = map.mapIterator();
        it.next();
        it.remove();
        it.remove();
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
        Assert.assertEquals(4, count);
    }

    @Test
    public void testEntrySet_flatAndDelegate() {
        Flat3Map map = new Flat3Map();
        Set entrySet = map.entrySet();
        Assert.assertEquals(0, entrySet.size());
        Assert.assertFalse(entrySet.iterator().hasNext());

        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals(2, entrySet.size());

        Iterator it = entrySet.iterator();
        Assert.assertTrue(it.hasNext());
        Map.Entry e1 = (Map.Entry) it.next();
        Assert.assertEquals("k1", e1.getKey());
        Assert.assertEquals("v1", e1.getValue());
        Assert.assertEquals("k1=v1", e1.toString());
        Assert.assertEquals("k1".hashCode() ^ "v1".hashCode(), e1.hashCode());
        Assert.assertEquals("v1", e1.setValue("v1_mod"));
        Assert.assertEquals("v1_mod", map.get("k1"));

        Map.Entry otherEntry = new HashMap.SimpleEntry("k1", "v1_mod");
        Assert.assertTrue(e1.equals(otherEntry));
        Assert.assertFalse(e1.equals("not an entry"));

        Map.Entry e2 = (Map.Entry) it.next();
        Assert.assertEquals("k2", e2.getKey());
        it.remove();
        Assert.assertEquals(1, map.size());

        entrySet.clear();
        Assert.assertEquals(0, map.size());

        // Delegate mode entrySet
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        Assert.assertEquals(4, map.entrySet().size());
        Iterator delIt = map.entrySet().iterator();
        Assert.assertNotNull(delIt.next());
    }

    @Test
    public void testEntrySet_removeEntry() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        Set set = map.entrySet();
        Assert.assertFalse(set.remove("not an entry"));
        Assert.assertTrue(set.remove(new HashMap.SimpleEntry("k1", "v1")));
        Assert.assertEquals(0, map.size());
        Assert.assertFalse(set.remove(new HashMap.SimpleEntry("k1", "v1")));
    }

    @Test
    public void testKeySet_flatAndDelegate() {
        Flat3Map map = new Flat3Map();
        Set keySet = map.keySet();
        Assert.assertEquals(0, keySet.size());
        Assert.assertFalse(keySet.iterator().hasNext());

        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals(2, keySet.size());
        Assert.assertTrue(keySet.contains("k1"));
        Assert.assertFalse(keySet.contains("k3"));

        Iterator it = keySet.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("k1", it.next());
        it.remove();
        Assert.assertEquals(1, map.size());
        Assert.assertFalse(map.containsKey("k1"));

        Assert.assertTrue(keySet.remove("k2"));
        Assert.assertFalse(keySet.remove("k2"));
        Assert.assertEquals(0, map.size());

        map.put("k1", "v1");
        keySet.clear();
        Assert.assertEquals(0, map.size());

        // Delegate mode keySet
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        Assert.assertEquals(4, map.keySet().size());
        Assert.assertTrue(map.keySet().iterator().hasNext());
    }

    @Test
    public void testValues_flatAndDelegate() {
        Flat3Map map = new Flat3Map();
        Collection values = map.values();
        Assert.assertEquals(0, values.size());
        Assert.assertFalse(values.iterator().hasNext());

        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("v1"));
        Assert.assertFalse(values.contains("v3"));

        Iterator it = values.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("v1", it.next());

        values.clear();
        Assert.assertEquals(0, map.size());

        // Delegate mode values
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        Assert.assertEquals(4, map.values().size());
        Assert.assertTrue(map.values().iterator().hasNext());
    }

    @Test
    public void testEntrySetIterator_edgeCases() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        Flat3Map.EntrySetIterator it = (Flat3Map.EntrySetIterator) map.entrySet().iterator();
        Assert.assertEquals("", it.toString());
        Assert.assertEquals(0, it.hashCode());
        Assert.assertFalse(it.equals(new HashMap.SimpleEntry("k1", "v1")));

        it.next(); // at k1
        it.next(); // at k2
        Assert.assertEquals("v2", it.setValue("v2_updated"));
        it.next(); // at k3
        Assert.assertEquals("v3", it.setValue("v3_updated"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Flat3Map map1 = new Flat3Map();
        Flat3Map map2 = new Flat3Map();

        Assert.assertTrue(map1.equals(map1));
        Assert.assertTrue(map1.equals(map2));
        Assert.assertEquals(map1.hashCode(), map2.hashCode());

        map1.put("k1", "v1");
        Assert.assertFalse(map1.equals(map2));
        Assert.assertFalse(map1.equals("not a map"));

        map2.put("k1", "v1");
        Assert.assertTrue(map1.equals(map2));
        Assert.assertEquals(map1.hashCode(), map2.hashCode());

        map1.put("k2", "v2");
        map1.put("k3", "v3");
        map2.put("k2", "v2");
        map2.put("k3", "v3");
        Assert.assertTrue(map1.equals(map2));
        Assert.assertEquals(map1.hashCode(), map2.hashCode());

        Map<String, String> diffMap = new HashMap<String, String>();
        diffMap.put("k1", "v1");
        diffMap.put("k2", "v2");
        diffMap.put("k3", "different");
        Assert.assertFalse(map1.equals(diffMap));

        Map<String, String> missingKeyMap = new HashMap<String, String>();
        missingKeyMap.put("k1", "v1");
        missingKeyMap.put("k2", "v2");
        missingKeyMap.put("kOther", "v3");
        Assert.assertFalse(map1.equals(missingKeyMap));

        // Delegate mode equals and hashCode
        map1.put("k4", "v4");
        map2.put("k4", "v4");
        Assert.assertTrue(map1.equals(map2));
        Assert.assertEquals(map1.hashCode(), map2.hashCode());
    }

    @Test
    public void testToString_variousSizesAndRecursive() {
        Flat3Map map = new Flat3Map();
        Assert.assertEquals("{}", map.toString());

        map.put("k1", "v1");
        Assert.assertEquals("{k1=v1}", map.toString());

        map.put("k2", "v2");
        Assert.assertEquals("{k2=v2,k1=v1}", map.toString());

        map.put("k3", "v3");
        Assert.assertEquals("{k3=v3,k2=v2,k1=v1}", map.toString());

        Flat3Map rec = new Flat3Map();
        rec.put(rec, rec);
        Assert.assertEquals("{(this Map)=(this Map)}", rec.toString());

        map.put("k4", "v4");
        Assert.assertTrue(map.toString().contains("k4=v4"));
    }

    @Test
    public void testClone_flatAndDelegate() {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");
        Flat3Map clone1 = (Flat3Map) map.clone();
        Assert.assertEquals(map, clone1);
        Assert.assertNotSame(map, clone1);

        map.put("k3", "v3");
        map.put("k4", "v4");
        Flat3Map clone2 = (Flat3Map) map.clone();
        Assert.assertEquals(map, clone2);
        Assert.assertNotSame(map, clone2);
    }

    @Test
    public void testSerialization_flatMode() throws Exception {
        Flat3Map map = new Flat3Map();
        map.put("k1", "v1");
        map.put("k2", "v2");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Flat3Map deserialized = (Flat3Map) ois.readObject();

        Assert.assertEquals(map, deserialized);
        Assert.assertEquals("v1", deserialized.get("k1"));
        Assert.assertEquals("v2", deserialized.get("k2"));
    }

    @Test
    public void testSerialization_delegateMode() throws Exception {
        Flat3Map map = new Flat3Map();
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

        Assert.assertEquals(map, deserialized);
        Assert.assertEquals(4, deserialized.size());
        Assert.assertEquals("v4", deserialized.get("k4"));
    }

    @Test
    public void testCreateDelegateMap_override() {
        Flat3Map map = new Flat3Map() {
            @Override
            protected AbstractHashedMap createDelegateMap() {
                return super.createDelegateMap();
            }
        };
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("d", map.get("4"));
    }
}
