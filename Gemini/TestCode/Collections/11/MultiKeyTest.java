package org.apache.commons.collections.keyvalue;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class MultiKeyTest {

    @Test
    public void testConstructor_twoKeys_createsSuccessfully() {
        MultiKey mk = new MultiKey("A", "B");
        Assert.assertEquals(2, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testConstructor_threeKeys_createsSuccessfully() {
        MultiKey mk = new MultiKey("A", "B", "C");
        Assert.assertEquals(3, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
        Assert.assertEquals("C", mk.getKey(2));
    }

    @Test
    public void testConstructor_fourKeys_createsSuccessfully() {
        MultiKey mk = new MultiKey("A", "B", "C", "D");
        Assert.assertEquals(4, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
        Assert.assertEquals("C", mk.getKey(2));
        Assert.assertEquals("D", mk.getKey(3));
    }

    @Test
    public void testConstructor_fiveKeys_createsSuccessfully() {
        MultiKey mk = new MultiKey("A", "B", "C", "D", "E");
        Assert.assertEquals(5, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
        Assert.assertEquals("C", mk.getKey(2));
        Assert.assertEquals("D", mk.getKey(3));
        Assert.assertEquals("E", mk.getKey(4));
    }

    @Test
    public void testConstructor_arrayCloneTrue_createsClonedInstance() {
        Object[] originalArray = new Object[]{"A", "B"};
        MultiKey mk = new MultiKey(originalArray, true);
        originalArray[0] = "Z";

        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testConstructor_arrayCloneFalse_sharesArrayReference() {
        Object[] originalArray = new Object[]{"A", "B"};
        MultiKey mk = new MultiKey(originalArray, false);
        originalArray[0] = "Z";

        Assert.assertEquals("Z", mk.getKey(0));
    }

    @Test
    public void testConstructor_singleArrayArg_clonesArray() {
        Object[] originalArray = new Object[]{"A", "B"};
        MultiKey mk = new MultiKey(originalArray);
        originalArray[0] = "Z";

        Assert.assertEquals("A", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullArray_throwsIllegalArgumentException() {
        new MultiKey((Object[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullArrayWithCloneFlag_throwsIllegalArgumentException() {
        new MultiKey(null, true);
    }

    @Test
    public void testConstructor_emptyArray_createsEmptyMultiKey() {
        MultiKey mk = new MultiKey(new Object[0]);
        Assert.assertEquals(0, mk.size());
        Assert.assertEquals(0, mk.getKeys().length);
    }

    @Test
    public void testConstructor_nullElements_createsSuccessfully() {
        MultiKey mk = new MultiKey(null, null);
        Assert.assertEquals(2, mk.size());
        Assert.assertNull(mk.getKey(0));
        Assert.assertNull(mk.getKey(1));
    }

    @Test
    public void testGetKeys_returnsClonedArray() {
        MultiKey mk = new MultiKey("A", "B");
        Object[] retrievedKeys = mk.getKeys();
        Assert.assertArrayEquals(new Object[]{"A", "B"}, retrievedKeys);

        retrievedKeys[0] = "Z";
        Assert.assertEquals("A", mk.getKey(0));
    }

    @Test
    public void testGetKey_validIndex_returnsKey() {
        MultiKey mk = new MultiKey("A", "B", "C");
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
        Assert.assertEquals("C", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_negativeIndex_throwsIndexOutOfBoundsException() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_indexOutOfBounds_throwsIndexOutOfBoundsException() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(2);
    }

    @Test
    public void testSize_variousLengths_returnsCorrectSize() {
        Assert.assertEquals(0, new MultiKey(new Object[0]).size());
        Assert.assertEquals(1, new MultiKey(new Object[]{"A"}).size());
        Assert.assertEquals(2, new MultiKey("A", "B").size());
        Assert.assertEquals(3, new MultiKey("A", "B", "C").size());
        Assert.assertEquals(4, new MultiKey("A", "B", "C", "D").size());
        Assert.assertEquals(5, new MultiKey("A", "B", "C", "D", "E").size());
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        MultiKey mk = new MultiKey("A", "B");
        Assert.assertTrue(mk.equals(mk));
    }

    @Test
    public void testEquals_equalInstances_returnsTrue() {
        MultiKey mk1 = new MultiKey("A", 1, "");
        MultiKey mk2 = new MultiKey("A", 1, "");
        Assert.assertTrue(mk1.equals(mk2));
        Assert.assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEquals_differentKeys_returnsFalse() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "C");
        Assert.assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_differentSizes_returnsFalse() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B", "C");
        Assert.assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        MultiKey mk = new MultiKey("A", "B");
        Assert.assertFalse(mk.equals(null));
    }

    @Test
    public void testEquals_differentClassType_returnsFalse() {
        MultiKey mk = new MultiKey("A", "B");
        Assert.assertFalse(mk.equals("someString"));
    }

    @Test
    public void testEquals_withNullElements_handledCorrectly() {
        MultiKey mk1 = new MultiKey("A", null);
        MultiKey mk2 = new MultiKey("A", null);
        MultiKey mk3 = new MultiKey("A", "B");
        MultiKey mk4 = new MultiKey(null, "A");

        Assert.assertTrue(mk1.equals(mk2));
        Assert.assertFalse(mk1.equals(mk3));
        Assert.assertFalse(mk1.equals(mk4));
    }

    @Test
    public void testHashCode_equalObjects_returnsSameHashCode() {
        MultiKey mk1 = new MultiKey("A", "B", 123);
        MultiKey mk2 = new MultiKey("A", "B", 123);
        Assert.assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCode_withNullElements_calculatedCorrectly() {
        MultiKey mk1 = new MultiKey("A", null);
        int expectedHashCode = "A".hashCode() ^ 0;
        Assert.assertEquals(expectedHashCode, mk1.hashCode());

        MultiKey mkAllNull = new MultiKey(null, null);
        Assert.assertEquals(0, mkAllNull.hashCode());
    }

    @Test
    public void testHashCode_emptyArray_returnsZero() {
        MultiKey mk = new MultiKey(new Object[0]);
        Assert.assertEquals(0, mk.hashCode());
    }

    @Test
    public void testToString_validKeys_matchesExpectedFormat() {
        MultiKey mk = new MultiKey("A", "B", "C");
        Assert.assertEquals("MultiKey" + Arrays.asList("A", "B", "C").toString(), mk.toString());
    }

    @Test
    public void testToString_withNullAndEmpty_matchesExpectedFormat() {
        MultiKey mk = new MultiKey("", null, 0);
        Assert.assertEquals("MultiKey" + Arrays.asList("", null, 0).toString(), mk.toString());
    }

    @Test
    public void testSerialization_roundTrip_equalsOriginalObject() throws Exception {
        MultiKey original = new MultiKey("A", 1, null, "B");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MultiKey deserialized = (MultiKey) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertArrayEquals(original.getKeys(), deserialized.getKeys());
    }
}
