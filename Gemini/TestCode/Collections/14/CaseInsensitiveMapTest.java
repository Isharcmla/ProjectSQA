package org.apache.commons.collections.map;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CaseInsensitiveMapTest {

    @Test
    public void testDefaultConstructor_createsEmptyMap() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testConstructorWithCapacity_validCapacity_createsEmptyMap() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(32);
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacity_zeroCapacity_throwsException() {
        new CaseInsensitiveMap(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacity_negativeCapacity_throwsException() {
        new CaseInsensitiveMap(-1);
    }

    @Test
    public void testConstructorWithCapacityAndLoadFactor_validArgs_createsEmptyMap() {
        CaseInsensitiveMap map = new CaseInsensitiveMap(16, 0.75f);
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacityAndLoadFactor_invalidCapacity_throwsException() {
        new CaseInsensitiveMap(0, 0.75f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacityAndLoadFactor_negativeLoadFactor_throwsException() {
        new CaseInsensitiveMap(16, -0.5f);
    }

    @Test
    public void testConstructorWithMap_validMap_populatesCorrectly() {
        Map source = new HashMap();
        source.put("One", "1");
        source.put("TWO", "2");
        source.put(null, "nullValue");

        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("1", map.get("one"));
        Assert.assertEquals("1", map.get("ONE"));
        Assert.assertEquals("2", map.get("two"));
        Assert.assertEquals("2", map.get("TWO"));
        Assert.assertEquals("nullValue", map.get(null));
    }

    @Test
    public void testConstructorWithMap_duplicateCaseInsensitiveKeys_overwrites() {
        Map source = new HashMap();
        source.put("key", "val1");
        source.put("KEY", "val2");

        CaseInsensitiveMap map = new CaseInsensitiveMap(source);
        Assert.assertEquals(1, map.size());
        Assert.assertTrue(map.containsKey("key"));
        Assert.assertTrue(map.containsKey("KEY"));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithMap_nullMap_throwsException() {
        new CaseInsensitiveMap((Map) null);
    }

    @Test
    public void testPutAndGet_caseInsensitiveStringKeys_returnsExpectedValues() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Assert.assertNull(map.put("KeyName", "Value1"));
        Assert.assertEquals("Value1", map.get("keyname"));
        Assert.assertEquals("Value1", map.get("KEYNAME"));
        Assert.assertEquals("Value1", map.get("KeyName"));

        Object previous = map.put("KEYNAME", "Value2");
        Assert.assertEquals("Value1", previous);
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("Value2", map.get("keyname"));
    }

    @Test
    public void testPutAndGet_emptyStringKey_handledProperly() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("", "EmptyKeyVal");
        Assert.assertTrue(map.containsKey(""));
        Assert.assertEquals("EmptyKeyVal", map.get(""));
    }

    @Test
    public void testPutAndGet_nullKey_supported() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Assert.assertNull(map.put(null, "NullValue"));
        Assert.assertTrue(map.containsKey(null));
        Assert.assertEquals("NullValue", map.get(null));
        Assert.assertEquals(1, map.size());

        Object prev = map.put(null, "NewNullValue");
        Assert.assertEquals("NullValue", prev);
        Assert.assertEquals("NewNullValue", map.get(null));
    }

    @Test
    public void testPutAndGet_nonStringObjectKey_convertedViaToString() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        Integer intKey = Integer.valueOf(12345);
        map.put(intKey, "NumericVal");

        Assert.assertTrue(map.containsKey(intKey));
        Assert.assertTrue(map.containsKey("12345"));
        Assert.assertEquals("NumericVal", map.get("12345"));
        Assert.assertEquals("NumericVal", map.get(intKey));
    }

    @Test
    public void testContainsKey_variousCasingAndNull_returnsCorrectBoolean() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Hello", "World");
        map.put(null, "NullVal");

        Assert.assertTrue(map.containsKey("hello"));
        Assert.assertTrue(map.containsKey("HELLO"));
        Assert.assertTrue(map.containsKey("Hello"));
        Assert.assertTrue(map.containsKey(null));
        Assert.assertFalse(map.containsKey("World"));
        Assert.assertFalse(map.containsKey("nonexistent"));
    }

    @Test
    public void testRemove_caseInsensitiveKeyAndNull_removesCorrectly() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("TestKey", "TestVal");
        map.put(null, "NullVal");

        Assert.assertEquals("TestVal", map.remove("TESTKEY"));
        Assert.assertFalse(map.containsKey("testkey"));
        Assert.assertEquals(1, map.size());

        Assert.assertEquals("NullVal", map.remove(null));
        Assert.assertFalse(map.containsKey(null));
        Assert.assertTrue(map.isEmpty());

        Assert.assertNull(map.remove("nonexistent"));
        Assert.assertNull(map.remove(null));
    }

    @Test
    public void testKeySet_returnsLowerCaseKeysAndNull() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("MixedCaseKey", "1");
        map.put("UPPERCASE", "2");
        map.put(null, "3");

        Set keys = map.keySet();
        Assert.assertEquals(3, keys.size());
        Assert.assertTrue(keys.contains("mixedcasekey"));
        Assert.assertTrue(keys.contains("uppercase"));
        Assert.assertTrue(keys.contains(null));
    }

    @Test
    public void testClone_createsIndependentShallowCopy() {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("Alpha", "A");
        map.put("Beta", "B");
        map.put(null, "N");

        CaseInsensitiveMap cloned = (CaseInsensitiveMap) map.clone();
        Assert.assertNotNull(cloned);
        Assert.assertNotSame(map, cloned);
        Assert.assertEquals(map.size(), cloned.size());
        Assert.assertEquals("A", cloned.get("alpha"));
        Assert.assertEquals("B", cloned.get("BETA"));
        Assert.assertEquals("N", cloned.get(null));

        cloned.put("Gamma", "C");
        Assert.assertFalse(map.containsKey("gamma"));
        Assert.assertTrue(cloned.containsKey("gamma"));
    }

    @Test
    public void testSerialization_preservesStateAndBehavior() throws Exception {
        CaseInsensitiveMap map = new CaseInsensitiveMap();
        map.put("First", "1");
        map.put("Second", "2");
        map.put(null, "nullValue");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CaseInsensitiveMap deserialized = (CaseInsensitiveMap) ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertEquals(map.size(), deserialized.size());
        Assert.assertEquals("1", deserialized.get("FIRST"));
        Assert.assertEquals("1", deserialized.get("first"));
        Assert.assertEquals("2", deserialized.get("second"));
        Assert.assertEquals("nullValue", deserialized.get(null));

        deserialized.put("Third", "3");
        Assert.assertEquals("3", deserialized.get("THIRD"));
    }

    @Test
    public void testConvertKey_directInvocationViaSubclass() {
        CaseInsensitiveMap map = new CaseInsensitiveMap() {
            @Override
            public Object convertKey(Object key) {
                return super.convertKey(key);
            }
        };

        Assert.assertEquals("hello", map.convertKey("HeLLo"));
        Assert.assertEquals("123", map.convertKey(Integer.valueOf(123)));
        Assert.assertEquals(AbstractHashedMap.NULL, map.convertKey(null));
    }
}
