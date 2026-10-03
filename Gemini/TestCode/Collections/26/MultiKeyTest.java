package org.apache.commons.collections4.keyvalue;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class MultiKeyTest {

    @Test
    public void testConstructor2Keys_normal_createsInstance() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        Assert.assertEquals(2, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testConstructor3Keys_normal_createsInstance() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C");
        Assert.assertEquals(3, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
        Assert.assertEquals("C", mk.getKey(2));
    }

    @Test
    public void testConstructor4Keys_normal_createsInstance() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C", "D");
        Assert.assertEquals(4, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
        Assert.assertEquals("C", mk.getKey(2));
        Assert.assertEquals("D", mk.getKey(3));
    }

    @Test
    public void testConstructor5Keys_normal_createsInstance() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C", "D", "E");
        Assert.assertEquals(5, mk.size());
        Assert.assertEquals("A", mk.getKey(0));
        Assert.assertEquals("B", mk.getKey(1));
        Assert.assertEquals("C", mk.getKey(2));
        Assert.assertEquals("D", mk.getKey(3));
        Assert.assertEquals("E", mk.getKey(4));
    }

    @Test
    public void testConstructorArray_normal_clonesArray() {
        Integer[] array = new Integer[]{1, 2, 3};
        MultiKey<Integer> mk = new MultiKey<>(array);
        Assert.assertEquals(3, mk.size());
        array[0] = 99;
        Assert.assertEquals(Integer.valueOf(1), mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorArray_nullArray_throwsException() {
        new MultiKey<String>((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorArrayAndBoolean_nullArray_throwsException() {
        new MultiKey<String>(null, true);
    }

    @Test
    public void testConstructorArrayAndBoolean_cloneTrue_clonesArray() {
        String[] array = new String[]{"one", "two"};
        MultiKey<String> mk = new MultiKey<>(array, true);
        array[0] = "changed";
        Assert.assertEquals("one", mk.getKey(0));
    }

    @Test
    public void testConstructorArrayAndBoolean_cloneFalse_usesSameArray() {
        String[] array = new String[]{"one", "two"};
        MultiKey<String> mk = new MultiKey<>(array, false);
        array[0] = "changed";
        Assert.assertEquals("changed", mk.getKey(0));
    }

    @Test
    public void testConstructor_emptyArray_success() {
        MultiKey<String> mk = new MultiKey<>(new String[0]);
        Assert.assertEquals(0, mk.size());
        Assert.assertEquals(0, mk.getKeys().length);
    }

    @Test
    public void testConstructor_nullElements_success() {
        MultiKey<String> mk = new MultiKey<>(null, null);
        Assert.assertEquals(2, mk.size());
        Assert.assertNull(mk.getKey(0));
        Assert.assertNull(mk.getKey(1));
    }

    @Test
    public void testGetKeys_normal_returnsClonedArray() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        String[] keys1 = mk.getKeys();
        String[] keys2 = mk.getKeys();
        Assert.assertNotSame(keys1, keys2);
        Assert.assertArrayEquals(keys1, keys2);

        keys1[0] = "MODIFIED";
        Assert.assertEquals("A", mk.getKey(0));
    }

    @Test
    public void testGetKey_validIndex_returnsCorrectKey() {
        MultiKey<String> mk = new MultiKey<>("first", "second", "third");
        Assert.assertEquals("first", mk.getKey(0));
        Assert.assertEquals("second", mk.getKey(1));
        Assert.assertEquals("third", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_negativeIndex_throwsException() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_indexEqualToSize_throwsException() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        mk.getKey(2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_indexGreaterThanSize_throwsException() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        mk.getKey(5);
    }

    @Test
    public void testSize_variousLengths_returnsCorrectSize() {
        Assert.assertEquals(0, new MultiKey<>(new Object[0]).size());
        Assert.assertEquals(1, new MultiKey<>(new Object[]{"1"}).size());
        Assert.assertEquals(2, new MultiKey<>("1", "2").size());
        Assert.assertEquals(3, new MultiKey<>("1", "2", "3").size());
        Assert.assertEquals(4, new MultiKey<>("1", "2", "3", "4").size());
        Assert.assertEquals(5, new MultiKey<>("1", "2", "3", "4", "5").size());
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        Assert.assertTrue(mk.equals(mk));
    }

    @Test
    public void testEquals_equalInstances_returnsTrue() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "B");
        Assert.assertTrue(mk1.equals(mk2));
        Assert.assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "C");
        Assert.assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_differentSizes_returnsFalse() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B");
        MultiKey<String> mk2 = new MultiKey<>("A", "B", "C");
        Assert.assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        Assert.assertFalse(mk.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        MultiKey<String> mk = new MultiKey<>("A", "B");
        Assert.assertFalse(mk.equals("A string"));
        Assert.assertFalse(mk.equals(new Object()));
    }

    @Test
    public void testEquals_withNullKeys_correctComparison() {
        MultiKey<String> mk1 = new MultiKey<>(null, "B");
        MultiKey<String> mk2 = new MultiKey<>(null, "B");
        MultiKey<String> mk3 = new MultiKey<>("A", null);
        MultiKey<String> mk4 = new MultiKey<>(null, null);

        Assert.assertTrue(mk1.equals(mk2));
        Assert.assertFalse(mk1.equals(mk3));
        Assert.assertFalse(mk1.equals(mk4));
    }

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        MultiKey<String> mk1 = new MultiKey<>("A", "B", "C");
        MultiKey<String> mk2 = new MultiKey<>("A", "B", "C");
        Assert.assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCode_calculationWithNullKeys() {
        MultiKey<String> mkWithNull = new MultiKey<>(null, "B");
        int expected = "B".hashCode();
        Assert.assertEquals(expected, mkWithNull.hashCode());

        MultiKey<String> mkAllNull = new MultiKey<>(null, null, null);
        Assert.assertEquals(0, mkAllNull.hashCode());
    }

    @Test
    public void testHashCode_multipleNonNullKeys() {
        String k1 = "alpha";
        String k2 = "beta";
        String k3 = "gamma";
        int expected = k1.hashCode() ^ k2.hashCode() ^ k3.hashCode();
        MultiKey<String> mk = new MultiKey<>(k1, k2, k3);
        Assert.assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testToString_normal_returnsExpectedFormat() {
        MultiKey<String> mk = new MultiKey<>("A", "B", "C");
        Assert.assertEquals("MultiKey[A, B, C]", mk.toString());
    }

    @Test
    public void testToString_withNullElements_returnsExpectedFormat() {
        MultiKey<String> mk = new MultiKey<>("A", null);
        Assert.assertEquals("MultiKey[A, null]", mk.toString());
    }

    @Test
    public void testToString_emptyKeys_returnsExpectedFormat() {
        MultiKey<String> mk = new MultiKey<>(new String[0]);
        Assert.assertEquals("MultiKey[]", mk.toString());
    }

    @Test
    public void testSerialization_readResolve_restoresStateAndHashCode() throws Exception {
        MultiKey<String> original = new MultiKey<>("one", "two", "three");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(original);
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        MultiKey<?> deserialized;
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            deserialized = (MultiKey<?>) ois.readObject();
        }

        Assert.assertNotNull(deserialized);
        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.hashCode(), deserialized.hashCode());
        Assert.assertEquals(original.size(), deserialized.size());
        Assert.assertEquals("one", deserialized.getKey(0));
        Assert.assertEquals("two", deserialized.getKey(1));
        Assert.assertEquals("three", deserialized.getKey(2));
    }
}
