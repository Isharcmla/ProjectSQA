package org.jfree.data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.jfree.chart.util.SortOrder;
import org.junit.Assert;
import org.junit.Test;

public class DefaultKeyedValuesTest {

    @Test
    public void testConstructor_initialState_isEmpty() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        Assert.assertEquals(0, data.getItemCount());
        Assert.assertNotNull(data.getKeys());
        Assert.assertTrue(data.getKeys().isEmpty());
    }

    @Test
    public void testAddValue_doubleAndNumber_success() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("Key1", 10.5);
        data.addValue("Key2", new Integer(20));
        data.addValue("Key3", null);

        Assert.assertEquals(3, data.getItemCount());
        Assert.assertEquals(new Double(10.5), data.getValue(0));
        Assert.assertEquals(new Integer(20), data.getValue(1));
        Assert.assertNull(data.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_nullKey_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.setValue(null, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_nullKeyWithNumber_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.setValue(null, new Double(10.0));
    }

    @Test
    public void testSetValue_updateExistingKey_updatesValue() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.setValue("A", 1.0);
        data.setValue("B", 2.0);
        data.setValue("A", 10.0);

        Assert.assertEquals(2, data.getItemCount());
        Assert.assertEquals(new Double(10.0), data.getValue("A"));
        Assert.assertEquals(new Double(2.0), data.getValue("B"));
    }

    @Test
    public void testGetValue_byIndex_success() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("Key1", 100.0);
        Assert.assertEquals(new Double(100.0), data.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_byIndexOutOfBounds_throwsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.getValue(0);
    }

    @Test
    public void testGetKey_byIndex_success() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("K1", 5.0);
        Assert.assertEquals("K1", data.getKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_byIndexOutOfBounds_throwsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.getKey(0);
    }

    @Test
    public void testGetIndex_existingKey_returnsIndex() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        Assert.assertEquals(0, data.getIndex("A"));
        Assert.assertEquals(1, data.getIndex("B"));
    }

    @Test
    public void testGetIndex_nonExistingKey_returnsNegativeOne() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        Assert.assertEquals(-1, data.getIndex("Z"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_nullKey_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.getIndex(null);
    }

    @Test
    public void testGetValue_byKey_success() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 15.0);
        Assert.assertEquals(new Double(15.0), data.getValue("A"));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_byNonExistingKey_throwsUnknownKeyException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.getValue("NonExistent");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_byNullKey_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.getValue((Comparable) null);
    }

    @Test
    public void testGetKeys_returnsDefensiveCopy() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        List keys = data.getKeys();
        keys.clear();
        Assert.assertEquals(1, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
    }

    @Test
    public void testInsertValue_doubleAndNumber_success() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("C", 3.0);
        data.insertValue(1, "B", 2.0);

        Assert.assertEquals(3, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("B", data.getKey(1));
        Assert.assertEquals("C", data.getKey(2));
        Assert.assertEquals(new Double(2.0), data.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_negativePosition_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.insertValue(-1, "A", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_positionGreaterThanCount_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.insertValue(1, "A", 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_nullKey_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.insertValue(0, null, new Double(1.0));
    }

    @Test
    public void testInsertValue_existingKeySamePosition_updatesValue() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.insertValue(0, "A", 10.0);

        Assert.assertEquals(2, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals(new Double(10.0), data.getValue(0));
    }

    @Test
    public void testInsertValue_existingKeyDifferentPosition_movesAndUpdatesValue() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);

        data.insertValue(0, "C", 30.0);

        Assert.assertEquals(3, data.getItemCount());
        Assert.assertEquals("C", data.getKey(0));
        Assert.assertEquals(new Double(30.0), data.getValue(0));
        Assert.assertEquals("A", data.getKey(1));
        Assert.assertEquals("B", data.getKey(2));
        Assert.assertEquals(0, data.getIndex("C"));
        Assert.assertEquals(1, data.getIndex("A"));
        Assert.assertEquals(2, data.getIndex("B"));
    }

    @Test
    public void testRemoveValue_byIndex_middleElementRebuildsIndex() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);

        data.removeValue(1);

        Assert.assertEquals(2, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("C", data.getKey(1));
        Assert.assertEquals(0, data.getIndex("A"));
        Assert.assertEquals(1, data.getIndex("C"));
        Assert.assertEquals(-1, data.getIndex("B"));
    }

    @Test
    public void testRemoveValue_byIndex_lastElement() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);

        data.removeValue(1);

        Assert.assertEquals(1, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals(-1, data.getIndex("B"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveValue_byIndexOutOfBounds_throwsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.removeValue(0);
    }

    @Test
    public void testRemoveValue_byKey_existingKeyRemovesSuccessfully() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);

        data.removeValue("A");

        Assert.assertEquals(1, data.getItemCount());
        Assert.assertEquals("B", data.getKey(0));
        Assert.assertEquals(-1, data.getIndex("A"));
    }

    @Test
    public void testRemoveValue_byKey_nonExistingKeyDoesNothing() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);

        data.removeValue("Z");

        Assert.assertEquals(1, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveValue_byNullKey_throwsIllegalArgumentException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.removeValue((Comparable) null);
    }

    @Test
    public void testClear_removesAllItems() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);

        data.clear();

        Assert.assertEquals(0, data.getItemCount());
        Assert.assertEquals(-1, data.getIndex("A"));
        Assert.assertEquals(-1, data.getIndex("B"));
        Assert.assertTrue(data.getKeys().isEmpty());
    }

    @Test
    public void testSortByKeys_ascendingAndDescending() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("C", 3.0);
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);

        data.sortByKeys(SortOrder.ASCENDING);
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("B", data.getKey(1));
        Assert.assertEquals("C", data.getKey(2));

        data.sortByKeys(SortOrder.DESCENDING);
        Assert.assertEquals("C", data.getKey(0));
        Assert.assertEquals("B", data.getKey(1));
        Assert.assertEquals("A", data.getKey(2));
    }

    @Test
    public void testSortByValues_ascendingAndDescending_withNulls() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("K1", 30.0);
        data.addValue("K2", null);
        data.addValue("K3", 10.0);
        data.addValue("K4", 20.0);

        data.sortByValues(SortOrder.ASCENDING);
        Assert.assertEquals("K3", data.getKey(0));
        Assert.assertEquals("K4", data.getKey(1));
        Assert.assertEquals("K1", data.getKey(2));
        Assert.assertEquals("K2", data.getKey(3));
        Assert.assertNull(data.getValue(3));

        data.sortByValues(SortOrder.DESCENDING);
        Assert.assertEquals("K1", data.getKey(0));
        Assert.assertEquals("K4", data.getKey(1));
        Assert.assertEquals("K3", data.getKey(2));
        Assert.assertEquals("K2", data.getKey(3));
        Assert.assertNull(data.getValue(3));
    }

    @Test
    public void testEquals_branchesCoverage() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        DefaultKeyedValues v2 = new DefaultKeyedValues();

        // Same object
        Assert.assertTrue(v1.equals(v1));

        // Different type / null
        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("NotAKeyedValues"));

        // Both empty
        Assert.assertTrue(v1.equals(v2));

        // Different count
        v1.addValue("A", 1.0);
        Assert.assertFalse(v1.equals(v2));

        // Same count, different keys
        v2.addValue("B", 1.0);
        Assert.assertFalse(v1.equals(v2));

        // Same keys, different nullability of values
        v2.clear();
        v2.addValue("A", null);
        DefaultKeyedValues vNull = new DefaultKeyedValues();
        vNull.addValue("A", null);

        Assert.assertFalse(vNull.equals(v1)); // v1 value is not null, vNull value is null
        Assert.assertFalse(v1.equals(vNull)); // v1 value is not null, vNull value is null
        Assert.assertTrue(vNull.equals(v2));  // both null values

        // Same keys, different non-null values
        v2.clear();
        v2.addValue("A", 2.0);
        Assert.assertFalse(v1.equals(v2));

        // Fully equal
        v2.clear();
        v2.addValue("A", 1.0);
        Assert.assertTrue(v1.equals(v2));
    }

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        DefaultKeyedValues v2 = new DefaultKeyedValues();
        v1.addValue("A", 1.0);
        v2.addValue("A", 1.0);

        Assert.assertEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testClone_createsIndependentCopy() throws Exception {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        v1.addValue("A", 1.0);
        v1.addValue("B", 2.0);

        DefaultKeyedValues v2 = (DefaultKeyedValues) v1.clone();

        Assert.assertNotSame(v1, v2);
        Assert.assertEquals(v1, v2);

        v2.addValue("C", 3.0);
        Assert.assertEquals(2, v1.getItemCount());
        Assert.assertEquals(3, v2.getItemCount());
    }

    @Test
    public void testSerialization_preservesState() throws Exception {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        v1.addValue("A", 1.0);
        v1.addValue("B", null);
        v1.addValue("C", 3.0);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(v1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        DefaultKeyedValues v2 = (DefaultKeyedValues) in.readObject();
        in.close();

        Assert.assertEquals(v1, v2);
        Assert.assertEquals(new Double(1.0), v2.getValue("A"));
        Assert.assertNull(v2.getValue("B"));
        Assert.assertEquals(new Double(3.0), v2.getValue("C"));
    }
}
