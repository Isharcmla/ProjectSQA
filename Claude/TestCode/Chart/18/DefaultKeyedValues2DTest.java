package org.jfree.data;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DefaultKeyedValues2DTest {

    private DefaultKeyedValues2D data;

    @Before
    public void setUp() {
        data = new DefaultKeyedValues2D();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsEmptyStructure() {
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
    }

    @Test
    public void testConstructorWithSortFlag_createsEmptyStructure() {
        DefaultKeyedValues2D sorted = new DefaultKeyedValues2D(true);
        assertEquals(0, sorted.getRowCount());
        assertEquals(0, sorted.getColumnCount());
    }

    // ---------- getRowCount / getColumnCount ----------

    @Test
    public void testGetRowCount_afterAddingValues_returnsCorrectCount() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R2", "C1");
        assertEquals(2, data.getRowCount());
    }

    @Test
    public void testGetColumnCount_afterAddingValues_returnsCorrectCount() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R1", "C2");
        assertEquals(2, data.getColumnCount());
    }

    // ---------- getValue(int, int) ----------

    @Test
    public void testGetValueByIndex_existingValue_returnsValue() {
        data.addValue(new Integer(5), "R1", "C1");
        assertEquals(new Integer(5), data.getValue(0, 0));
    }

    @Test
    public void testGetValueByIndex_missingColumnInRow_returnsNull() {
        data.addValue(new Integer(5), "R1", "C1");
        data.addValue(new Integer(10), "R2", "C2");
        // R1 has no entry for C2
        assertNull(data.getValue(0, 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueByIndex_invalidRowIndex_throwsException() {
        data.addValue(new Integer(5), "R1", "C1");
        data.getValue(5, 0);
    }

    // ---------- getRowKey / getRowIndex / getRowKeys ----------

    @Test
    public void testGetRowKey_validIndex_returnsKey() {
        data.addValue(new Integer(1), "R1", "C1");
        assertEquals("R1", data.getRowKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRowKey_invalidIndex_throwsException() {
        data.getRowKey(0);
    }

    @Test
    public void testGetRowIndex_existingKey_returnsCorrectIndex() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R2", "C1");
        assertEquals(1, data.getRowIndex("R2"));
    }

    @Test
    public void testGetRowIndex_nonExistingKey_returnsNegative() {
        data.addValue(new Integer(1), "R1", "C1");
        assertEquals(-1, data.getRowIndex("R99"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowIndex_nullKey_throwsException() {
        data.getRowIndex(null);
    }

    @Test
    public void testGetRowIndex_sortedRowKeys_usesBinarySearch() {
        DefaultKeyedValues2D sorted = new DefaultKeyedValues2D(true);
        sorted.addValue(new Integer(1), "A", "C1");
        sorted.addValue(new Integer(2), "B", "C1");
        sorted.addValue(new Integer(3), "C", "C1");
        assertEquals(1, sorted.getRowIndex("B"));
    }

    @Test
    public void testGetRowKeys_returnsUnmodifiableList() {
        data.addValue(new Integer(1), "R1", "C1");
        List keys = data.getRowKeys();
        assertEquals(1, keys.size());
        try {
            keys.add("R2");
            fail("Expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- getColumnKey / getColumnIndex / getColumnKeys ----------

    @Test
    public void testGetColumnKey_validIndex_returnsKey() {
        data.addValue(new Integer(1), "R1", "C1");
        assertEquals("C1", data.getColumnKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetColumnKey_invalidIndex_throwsException() {
        data.getColumnKey(0);
    }

    @Test
    public void testGetColumnIndex_existingKey_returnsCorrectIndex() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R1", "C2");
        assertEquals(1, data.getColumnIndex("C2"));
    }

    @Test
    public void testGetColumnIndex_nonExistingKey_returnsNegative() {
        data.addValue(new Integer(1), "R1", "C1");
        assertEquals(-1, data.getColumnIndex("C99"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_nullKey_throwsException() {
        data.getColumnIndex(null);
    }

    @Test
    public void testGetColumnKeys_returnsUnmodifiableList() {
        data.addValue(new Integer(1), "R1", "C1");
        List keys = data.getColumnKeys();
        assertEquals(1, keys.size());
        try {
            keys.add("C2");
            fail("Expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- getValue(Comparable, Comparable) ----------

    @Test
    public void testGetValueByKey_existingKeys_returnsValue() {
        data.addValue(new Integer(7), "R1", "C1");
        assertEquals(new Integer(7), data.getValue("R1", "C1"));
    }

    @Test
    public void testGetValueByKey_missingValueForRow_returnsNull() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R2", "C2");
        assertNull(data.getValue("R1", "C2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueByKey_nullRowKey_throwsException() {
        data.addValue(new Integer(1), "R1", "C1");
        data.getValue((Comparable) null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValueByKey_nullColumnKey_throwsException() {
        data.addValue(new Integer(1), "R1", "C1");
        data.getValue("R1", (Comparable) null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueByKey_unknownColumnKey_throwsException() {
        data.addValue(new Integer(1), "R1", "C1");
        data.getValue("R1", "C99");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueByKey_unknownRowKey_throwsException() {
        data.addValue(new Integer(1), "R1", "C1");
        data.getValue("R99", "C1");
    }

    // ---------- addValue / setValue ----------

    @Test
    public void testAddValue_newRowAndColumn_addsCorrectly() {
        data.addValue(new Integer(10), "R1", "C1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals(new Integer(10), data.getValue("R1", "C1"));
    }

    @Test
    public void testSetValue_updateExistingValue_valueUpdated() {
        data.setValue(new Integer(1), "R1", "C1");
        data.setValue(new Integer(2), "R1", "C1");
        assertEquals(new Integer(2), data.getValue("R1", "C1"));
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
    }

    @Test
    public void testSetValue_nullValue_allowed() {
        data.setValue(null, "R1", "C1");
        assertNull(data.getValue("R1", "C1"));
    }

    @Test
    public void testSetValue_sortedRowKeys_insertsInOrder() {
        DefaultKeyedValues2D sorted = new DefaultKeyedValues2D(true);
        sorted.setValue(new Integer(3), "C", "COL1");
        sorted.setValue(new Integer(1), "A", "COL1");
        sorted.setValue(new Integer(2), "B", "COL1");
        assertEquals("A", sorted.getRowKey(0));
        assertEquals("B", sorted.getRowKey(1));
        assertEquals("C", sorted.getRowKey(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_nullRowKey_throwsException() {
        data.setValue(new Integer(1), null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_nullColumnKey_throwsException() {
        data.setValue(new Integer(1), "R1", null);
    }

    // ---------- removeValue ----------

    @Test
    public void testRemoveValue_removesValueAndKeepsStructureIfNotEmpty() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R1", "C2");
        data.removeValue("R1", "C1");
        assertNull(data.getValue("R1", "C1"));
        assertEquals(1, data.getRowCount());
    }

    @Test
    public void testRemoveValue_rowBecomesEmpty_rowRemoved() {
        data.addValue(new Integer(1), "R1", "C1");
        data.removeValue("R1", "C1");
        assertEquals(0, data.getRowCount());
    }

    @Test
    public void testRemoveValue_columnBecomesEmpty_columnRemoved() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R2", "C1");
        data.removeValue("R1", "C1");
        data.removeValue("R2", "C1");
        assertEquals(0, data.getColumnCount());
    }

    @Test
    public void testRemoveValue_rowNotEmpty_rowRetained() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R1", "C2");
        data.removeValue("R1", "C1");
        assertEquals(1, data.getRowCount());
        assertEquals(new Integer(2), data.getValue("R1", "C2"));
    }

    // ---------- removeRow(int) / removeRow(Comparable) ----------

    @Test
    public void testRemoveRowByIndex_removesRow() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R2", "C1");
        data.removeRow(0);
        assertEquals(1, data.getRowCount());
        assertEquals("R2", data.getRowKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveRowByIndex_invalidIndex_throwsException() {
        data.removeRow(0);
    }

    @Test
    public void testRemoveRowByKey_removesRow() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R2", "C1");
        data.removeRow("R1");
        assertEquals(1, data.getRowCount());
        assertEquals("R2", data.getRowKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveRowByKey_unknownKey_throwsException() {
        data.addValue(new Integer(1), "R1", "C1");
        data.removeRow("R99");
    }

    // ---------- removeColumn(int) / removeColumn(Comparable) ----------

    @Test
    public void testRemoveColumnByIndex_removesColumn() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R1", "C2");
        data.removeColumn(0);
        assertEquals(1, data.getColumnCount());
        assertEquals("C2", data.getColumnKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveColumnByIndex_invalidIndex_throwsException() {
        data.removeColumn(0);
    }

    @Test
    public void testRemoveColumnByKey_removesColumn() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R1", "C2");
        data.removeColumn("C1");
        assertEquals(1, data.getColumnCount());
        assertEquals("C2", data.getColumnKey(0));
    }

    @Test
    public void testRemoveColumnByKey_unknownKey_columnKeysUnchanged() {
        data.addValue(new Integer(1), "R1", "C1");
        data.removeColumn("C99");
        // removeValue on unknown key in row does nothing; columnKeys.remove
        // returns false but no exception thrown
        assertEquals(1, data.getColumnCount());
    }

    // ---------- clear ----------

    @Test
    public void testClear_removesAllData() {
        data.addValue(new Integer(1), "R1", "C1");
        data.addValue(new Integer(2), "R2", "C2");
        data.clear();
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        data.addValue(new Integer(1), "R1", "C1");
        assertTrue(data.equals(data));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(data.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(data.equals("Not a KeyedValues2D"));
    }

    @Test
    public void testEquals_equalStructures_returnsTrue() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.addValue(new Integer(1), "R1", "C1");
        other.addValue(new Integer(1), "R1", "C1");
        assertTrue(data.equals(other));
    }

    @Test
    public void testEquals_differentRowKeys_returnsFalse() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.addValue(new Integer(1), "R1", "C1");
        other.addValue(new Integer(1), "R2", "C1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_differentColumnKeys_returnsFalse() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.addValue(new Integer(1), "R1", "C1");
        other.addValue(new Integer(1), "R1", "C2");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.addValue(new Integer(1), "R1", "C1");
        other.addValue(new Integer(2), "R1", "C1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_oneNullValueOtherNonNull_returnsFalse() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.addValue(null, "R1", "C1");
        other.addValue(new Integer(1), "R1", "C1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_bothNullValues_returnsTrue() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.addValue(null, "R1", "C1");
        other.addValue(null, "R1", "C1");
        assertTrue(data.equals(other));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_consistentForEqualObjects() {
        DefaultKeyedValues2D other = new DefaultKeyedValues2D();
        data.addValue(new Integer(1), "R1", "C1");
        other.addValue(new Integer(1), "R1", "C1");
        assertEquals(data.hashCode(), other.hashCode());
    }

    // ---------- clone ----------

    @Test
    public void testClone_producesEqualButIndependentCopy() throws Exception {
        data.addValue(new Integer(1), "R1", "C1");
        DefaultKeyedValues2D clone = (DefaultKeyedValues2D) data.clone();
        assertTrue(data.equals(clone));
        assertNotSame(data, clone);

        clone.addValue(new Integer(2), "R2", "C2");
        assertEquals(1, data.getRowCount());
        assertEquals(2, clone.getRowCount());
    }
}
