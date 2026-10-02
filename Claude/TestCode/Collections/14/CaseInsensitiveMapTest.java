import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.collections.map.CaseInsensitiveMap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CaseInsensitiveMapTest {

    private CaseInsensitiveMap map;

    @Before
    public void setUp() {
        map = new CaseInsensitiveMap();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsEmptyMap() {
        CaseInsensitiveMap m = new CaseInsensitiveMap();
        assertTrue(m.isEmpty());
        assertEquals(0, m.size());
    }

    @Test
    public void testConstructorWithCapacity_normalValue_createsEmptyMap() {
        CaseInsensitiveMap m = new CaseInsensitiveMap(10);
        assertTrue(m.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacity_negativeValue_throwsException() {
        new CaseInsensitiveMap(-1);
    }

    @Test
    public void testConstructorWithCapacityAndLoadFactor_normalValues_createsEmptyMap() {
        CaseInsensitiveMap m = new CaseInsensitiveMap(10, 0.5f);
        assertTrue(m.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacityAndLoadFactor_negativeLoadFactor_throwsException() {
        new CaseInsensitiveMap(10, -0.5f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacityAndLoadFactor_zeroCapacity_throwsException() {
        new CaseInsensitiveMap(0, 0.5f);
    }

    @Test
    public void testConstructorWithMap_normalMap_copiesEntries() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("One", "1");
        source.put("Two", "2");

        CaseInsensitiveMap m = new CaseInsensitiveMap(source);
        assertEquals(2, m.size());
        assertEquals("1", m.get("one"));
        assertEquals("2", m.get("TWO"));
    }

    @Test
    public void testConstructorWithMap_duplicateKeysDifferentCase_mergesEntries() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("One", "1");
        source.put("one", "2");

        CaseInsensitiveMap m = new CaseInsensitiveMap(source);
        assertEquals(1, m.size());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithMap_nullMap_throwsException() {
        new CaseInsensitiveMap((Map) null);
    }

    // ---------- put / get - normal & case-insensitivity ----------

    @Test
    public void testPutGet_normalKey_returnsValue() {
        map.put("Key", "Value");
        assertEquals("Value", map.get("Key"));
    }

    @Test
    public void testPutGet_differentCaseKey_returnsSameValue() {
        map.put("One", "One");
        assertEquals("One", map.get("one"));
        assertEquals("One", map.get("ONE"));
        assertEquals("One", map.get("OnE"));
    }

    @Test
    public void testPut_overwriteWithDifferentCase_updatesValue() {
        map.put("One", "One");
        map.put("one", "Four");
        assertEquals("Four", map.get("ONE"));
        assertEquals(1, map.size());
    }

    @Test
    public void testPutGet_nullKey_supported() {
        map.put(null, "Three");
        assertEquals("Three", map.get(null));
    }

    @Test
    public void testPutGet_emptyStringKey_supported() {
        map.put("", "EmptyKeyValue");
        assertEquals("EmptyKeyValue", map.get(""));
    }

    @Test
    public void testGet_nonExistentKey_returnsNull() {
        assertNull(map.get("nonexistent"));
    }

    @Test
    public void testPut_multipleDistinctKeys_allRetrievable() {
        map.put("One", "One");
        map.put("Two", "Two");
        map.put(null, "Three");
        map.put("one", "Four");

        assertEquals(3, map.size());
        assertEquals("Three", map.get(null));
        assertEquals("Four", map.get("ONE"));
        assertEquals("Two", map.get("two"));
    }

    // ---------- keySet ----------

    @Test
    public void testKeySet_returnsLowercaseKeysAndNull() {
        map.put("One", "One");
        map.put("Two", "Two");
        map.put(null, "Three");
        map.put("one", "Four");

        Set keys = map.keySet();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("one"));
        assertTrue(keys.contains("two"));
        assertTrue(keys.contains(null));
    }

    @Test
    public void testKeySet_emptyMap_returnsEmptySet() {
        Set keys = map.keySet();
        assertTrue(keys.isEmpty());
    }

    @Test
    public void testKeySet_iteratorTraversal_worksCorrectly() {
        map.put("Alpha", "A");
        map.put("Beta", "B");

        Iterator it = map.keySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            Object key = it.next();
            assertTrue(key.equals("alpha") || key.equals("beta"));
            count++;
        }
        assertEquals(2, count);
    }

    // ---------- remove / containsKey ----------

    @Test
    public void testRemove_existingKeyDifferentCase_removesEntry() {
        map.put("Key", "Value");
        Object removed = map.remove("KEY");
        assertEquals("Value", removed);
        assertFalse(map.containsKey("key"));
    }

    @Test
    public void testContainsKey_caseInsensitive_returnsTrue() {
        map.put("Key", "Value");
        assertTrue(map.containsKey("KEY"));
        assertTrue(map.containsKey("key"));
    }

    @Test
    public void testContainsKey_nullKey_returnsTrueWhenPresent() {
        map.put(null, "Value");
        assertTrue(map.containsKey(null));
    }

    // ---------- clone ----------

    @Test
    public void testClone_producesEqualButIndependentMap() {
        map.put("One", "1");
        map.put("Two", "2");

        CaseInsensitiveMap cloned = (CaseInsensitiveMap) map.clone();

        assertEquals(map.size(), cloned.size());
        assertEquals(map.get("one"), cloned.get("one"));

        cloned.put("Three", "3");
        assertFalse(map.containsKey("three"));
    }

    @Test
    public void testClone_emptyMap_returnsEmptyClone() {
        CaseInsensitiveMap cloned = (CaseInsensitiveMap) map.clone();
        assertTrue(cloned.isEmpty());
    }

    // ---------- serialization ----------

    @Test
    public void testSerialization_writeAndReadObject_preservesData() throws Exception {
        map.put("One", "1");
        map.put(null, "NullValueKey");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.flush();
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserialized = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        assertEquals(2, deserialized.size());
        assertEquals("1", deserialized.get("ONE"));
        assertEquals("NullValueKey", deserialized.get(null));
    }

    @Test
    public void testSerialization_emptyMap_preservesEmptiness() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.flush();
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserialized = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        assertTrue(deserialized.isEmpty());
    }

    // ---------- non-string key conversion ----------

    @Test
    public void testPutGet_nonStringKey_convertedViaToString() {
        Integer intKey = Integer.valueOf(123);
        map.put(intKey, "IntValue");
        assertEquals("IntValue", map.get("123"));
    }

    // ---------- size after clear ----------

    @Test
    public void testClear_removesAllEntries() {
        map.put("One", "1");
        map.put("Two", "2");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }
}
