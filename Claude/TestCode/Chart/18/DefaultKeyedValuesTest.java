import org.jfree.chart.util.SortOrder;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class DefaultKeyedValuesTest {

    private DefaultKeyedValues data;

    @Before
    public void setUp() {
        data = new DefaultKeyedValues();
    }

    // ---------- Constructor ----------
    @Test
    public void testConstructor_newInstance_isEmpty() {
        assertEquals(0, data.getItemCount());
    }

    // ---------- getItemCount ----------
    @Test
    public void testGetItemCount_afterAddingValues_returnsCorrectCount() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        assertEquals(2, data.getItemCount());
    }

    // ---------- getValue(int) ----------
    @Test
    public void testGetValueByIndex_validIndex_returnsValue() {
        data.addValue("A", 1.0);
        assertEquals(1.0, data.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueByIndex_invalidIndex_throwsException() {
        data.getValue(0);
    }

    // ---------- getKey(int) ----------
    @Test
    public void testGetKeyByIndex_validIndex_returnsKey() {
        data.addValue("A", 1.0);
        assertEquals("A", data.getKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyByIndex_invalidIndex_throwsException() {
        data.getKey(0);
    }

    // ---------- getIndex ----------
    @Test
    public void testGetIndex_existingKey_returnsCorrectIndex() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        assertEquals(1, data.getIndex("B"));
    }

    @Test
    public void testGetIndex_nonExistingKey_returnsMinusOne() {
        data.addValue("A", 1.0);
        assertEquals(-1, data.getIndex("Z"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_nullKey_throwsException() {
        data.getIndex(null);
    }

    // ---------- getKeys ----------
    @Test
    public void testGetKeys_afterAddingValues_returnsAllKeys() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        List keys = data.getKeys();
        assertEquals(2, keys.size());
        assertEquals("A", keys.get(0));
        assertEquals("B", keys.get(1));
    }

    @Test
    public void testGetKeys_emptyCollection_returnsEmptyList() {
        List keys = data.getKeys();
        assertTrue(keys.isEmpty());
    }

    // ---------- getValue(Comparable) ----------
    @Test
    public void testGetValueByKey_existingKey_returnsValue() {
        data.addValue("A", 1.0);
        assertEquals(1.0, data.getValue("A").doubleValue(), 0.0001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueByKey_nonExistingKey_throwsUnknownKeyException() {
        data.getValue("Z");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueByKey_nullKey_throwsException() {
        data.getValue((Comparable) null);
    }

    // ---------- addValue(Comparable, double) ----------
    @Test
    public void testAddValueDouble_newKey_addsValue() {
        data.addValue("A", 5.0);
        assertEquals(5.0, data.getValue("A").doubleValue(), 0.0001);
    }

    @Test
    public void testAddValueDouble_existingKey_updatesValue() {
        data.addValue("A", 5.0);
        data.addValue("A", 10.0);
        assertEquals(1, data.getItemCount());
        assertEquals(10.0, data.getValue("A").doubleValue(), 0.0001);
    }

    // ---------- addValue(Comparable, Number) ----------
    @Test
    public void testAddValueNumber_newKey_addsValue() {
        data.addValue("A", new Integer(3));
        assertEquals(3, data.getValue("A").intValue());
    }

    @Test
    public void testAddValueNumber_nullValue_isPermitted() {
        data.addValue("A", (Number) null);
        assertNull(data.getValue("A"));
    }

    // ---------- setValue(Comparable, double) ----------
    @Test
    public void testSetValueDouble_newKey_addsValue() {
        data.setValue("A", 7.0);
        assertEquals(7.0, data.getValue("A").doubleValue(), 0.0001);
    }

    @Test
    public void testSetValueDouble_existingKey_updatesValue() {
        data.setValue("A", 7.0);
        data.setValue("A", 8.0);
        assertEquals(8.0, data.getValue("A").doubleValue(), 0.0001);
    }

    // ---------- setValue(Comparable, Number) ----------
    @Test
    public void testSetValueNumber_newKey_addsValue() {
        data.setValue("A", new Double(2.5));
        assertEquals(2.5, data.getValue("A").doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValueNumber_nullKey_throwsException() {
        data.setValue(null, new Double(1.0));
    }

    // ---------- insertValue(int, Comparable, double) ----------
    @Test
    public void testInsertValueDouble_newPosition_insertsValue() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.insertValue(0, "C", 3.0);
        assertEquals(3, data.getItemCount());
        assertEquals("C", data.getKey(0));
        assertEquals(3.0, data.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- insertValue(int, Comparable, Number) ----------
    @Test
    public void testInsertValueNumber_samePosition_updatesValueInPlace() {
        data.addValue("A", 1.0);
        data.insertValue(0, "A", new Double(9.0));
        assertEquals(1, data.getItemCount());
        assertEquals(9.0, data.getValue("A").doubleValue(), 0.0001);
    }

    @Test
    public void testInsertValueNumber_existingKeyDifferentPosition_movesValue() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);
        data.insertValue(0, "C", new Double(30.0));
        assertEquals(3, data.getItemCount());
        assertEquals("C", data.getKey(0));
        assertEquals(30.0, data.getValue("C").doubleValue(), 0.0001);
        assertEquals("A", data.getKey(1));
        assertEquals("B", data.getKey(2));
    }

    @Test
    public void testInsertValueNumber_newKeyAtEnd_insertsAtEnd() {
        data.addValue("A", 1.0);
        data.insertValue(1, "B", new Double(2.0));
        assertEquals(2, data.getItemCount());
        assertEquals("B", data.getKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_positionOutOfBoundsNegative_throwsException() {
        data.insertValue(-1, "A", new Double(1.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_positionOutOfBoundsTooLarge_throwsException() {
        data.addValue("A", 1.0);
        data.insertValue(5, "B", new Double(2.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValue_nullKey_throwsException() {
        data.insertValue(0, null, new Double(1.0));
    }

    // ---------- removeValue(int) ----------
    @Test
    public void testRemoveValueByIndex_validIndex_removesValue() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.removeValue(0);
        assertEquals(1, data.getItemCount());
        assertEquals("B", data.getKey(0));
    }

    @Test
    public void testRemoveValueByIndex_lastIndex_removesValueWithoutRebuild() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.removeValue(1);
        assertEquals(1, data.getItemCount());
        assertEquals("A", data.getKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveValueByIndex_invalidIndex_throwsException() {
        data.removeValue(0);
    }

    // ---------- removeValue(Comparable) ----------
    @Test
    public void testRemoveValueByKey_existingKey_removesValue() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.removeValue("A");
        assertEquals(1, data.getItemCount());
        assertEquals("B", data.getKey(0));
    }

    @Test
    public void testRemoveValueByKey_nonExistingKey_doesNothing() {
        data.addValue("A", 1.0);
        data.removeValue("Z");
        assertEquals(1, data.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveValueByKey_nullKey_throwsException() {
        data.removeValue((Comparable) null);
    }

    // ---------- clear ----------
    @Test
    public void testClear_afterAddingValues_removesAllValues() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.clear();
        assertEquals(0, data.getItemCount());
        assertTrue(data.getKeys().isEmpty());
    }

    // ---------- sortByKeys ----------
    @Test
    public void testSortByKeys_ascendingOrder_sortsCorrectly() {
        data.addValue("C", 3.0);
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.sortByKeys(SortOrder.ASCENDING);
        assertEquals("A", data.getKey(0));
        assertEquals("B", data.getKey(1));
        assertEquals("C", data.getKey(2));
    }

    @Test
    public void testSortByKeys_descendingOrder_sortsCorrectly() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);
        data.sortByKeys(SortOrder.DESCENDING);
        assertEquals("C", data.getKey(0));
        assertEquals("B", data.getKey(1));
        assertEquals("A", data.getKey(2));
    }

    @Test
    public void testSortByKeys_emptyCollection_remainsEmpty() {
        data.sortByKeys(SortOrder.ASCENDING);
        assertEquals(0, data.getItemCount());
    }

    // ---------- sortByValues ----------
    @Test
    public void testSortByValues_ascendingOrder_sortsCorrectly() {
        data.addValue("A", 3.0);
        data.addValue("B", 1.0);
        data.addValue("C", 2.0);
        data.sortByValues(SortOrder.ASCENDING);
        assertEquals(1.0, data.getValue(0).doubleValue(), 0.0001);
        assertEquals(2.0, data.getValue(1).doubleValue(), 0.0001);
        assertEquals(3.0, data.getValue(2).doubleValue(), 0.0001);
    }

    @Test
    public void testSortByValues_descendingOrder_sortsCorrectly() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);
        data.sortByValues(SortOrder.DESCENDING);
        assertEquals(3.0, data.getValue(0).doubleValue(), 0.0001);
        assertEquals(2.0, data.getValue(1).doubleValue(), 0.0001);
        assertEquals(1.0, data.getValue(2).doubleValue(), 0.0001);
    }

    @Test
    public void testSortByValues_withNullValue_sortsNullToEnd() {
        data.addValue("A", new Double(2.0));
        data.addValue("B", (Number) null);
        data.addValue("C", new Double(1.0));
        data.sortByValues(SortOrder.ASCENDING);
        assertNull(data.getValue(2));
    }

    // ---------- equals ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        data.addValue("A", 1.0);
        assertTrue(data.equals(data));
    }

    @Test
    public void testEquals_notKeyedValuesInstance_returnsFalse() {
        data.addValue("A", 1.0);
        assertFalse(data.equals("not a KeyedValues"));
    }

    @Test
    public void testEquals_differentItemCount_returnsFalse() {
        data.addValue("A", 1.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", 1.0);
        other.addValue("B", 2.0);
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_differentKeys_returnsFalse() {
        data.addValue("A", 1.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("B", 1.0);
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        data.addValue("A", 1.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", 2.0);
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_bothNullValues_returnsTrue() {
        data.addValue("A", (Number) null);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", (Number) null);
        assertTrue(data.equals(other));
    }

    @Test
    public void testEquals_oneNullValueOtherNonNull_returnsFalse() {
        data.addValue("A", (Number) null);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", new Double(1.0));
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_equalContent_returnsTrue() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", 1.0);
        other.addValue("B", 2.0);
        assertTrue(data.equals(other));
    }

    // ---------- hashCode ----------
    @Test
    public void testHashCode_consistentWithEqualObjects_returnsSameHashCode() {
        data.addValue("A", 1.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", 1.0);
        assertEquals(data.hashCode(), other.hashCode());
    }

    // ---------- clone ----------
    @Test
    public void testClone_producesEqualButIndependentCopy() throws CloneNotSupportedException {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        DefaultKeyedValues clone = (DefaultKeyedValues) data.clone();
        assertTrue(data.equals(clone));
        clone.addValue("C", 3.0);
        assertFalse(data.equals(clone));
    }
}
