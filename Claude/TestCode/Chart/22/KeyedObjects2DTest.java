import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;

import java.util.List;

public class KeyedObjects2DTest {

    private KeyedObjects2D data;

    @Before
    public void setUp() {
        data = new KeyedObjects2D();
    }

    // ---------- Constructor ----------
    @Test
    public void testConstructor_initialState_emptyLists() {
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertTrue(data.getRowKeys().isEmpty());
        assertTrue(data.getColumnKeys().isEmpty());
    }

    // ---------- getRowCount / getColumnCount ----------
    @Test
    public void testGetRowCount_afterAddingRows_returnsCorrectCount() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R2", "C1");
        assertEquals(2, data.getRowCount());
    }

    @Test
    public void testGetColumnCount_afterAddingColumns_returnsCorrectCount() {
        data.setObject("A1", "R1", "C1");
        data.setObject("A2", "R1", "C2");
        assertEquals(2, data.getColumnCount());
    }

    // ---------- setObject / addObject ----------
    @Test
    public void testSetObject_newRowAndColumn_addsSuccessfully() {
        data.setObject("Value1", "Row1", "Col1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals("Value1", data.getObject("Row1", "Col1"));
    }

    @Test
    public void testSetObject_existingRowNewColumn_updatesCorrectly() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row1", "Col2");
        assertEquals(1, data.getRowCount());
        assertEquals(2, data.getColumnCount());
        assertEquals("Value2", data.getObject("Row1", "Col2"));
    }

    @Test
    public void testSetObject_overwriteExistingValue_updatesValue() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row1", "Col1");
        assertEquals("Value2", data.getObject("Row1", "Col1"));
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObject_nullRowKey_throwsIllegalArgumentException() {
        data.setObject("Value1", null, "Col1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObject_nullColumnKey_throwsIllegalArgumentException() {
        data.setObject("Value1", "Row1", null);
    }

    @Test
    public void testAddObject_normalUsage_addsSuccessfully() {
        data.addObject("Value1", "Row1", "Col1");
        assertEquals("Value1", data.getObject("Row1", "Col1"));
    }

    // ---------- getObject(int, int) ----------
    @Test
    public void testGetObjectByIndex_validIndices_returnsCorrectValue() {
        data.setObject("Value1", "Row1", "Col1");
        assertEquals("Value1", data.getObject(0, 0));
    }

    @Test
    public void testGetObjectByIndex_nonExistentColumnKeyInRow_returnsNull() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row2", "Col2");
        // Row1 does not have Col2 key set, getObject(0,1) should return null
        Object result = data.getObject(0, 1);
        assertNull(result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetObjectByIndex_invalidRowIndex_throwsException() {
        data.getObject(0, 0);
    }

    // ---------- getRowKey / getRowIndex / getRowKeys ----------
    @Test
    public void testGetRowKey_validIndex_returnsCorrectKey() {
        data.setObject("Value1", "Row1", "Col1");
        assertEquals("Row1", data.getRowKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRowKey_invalidIndex_throwsException() {
        data.getRowKey(0);
    }

    @Test
    public void testGetRowIndex_existingKey_returnsCorrectIndex() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row2", "Col1");
        assertEquals(1, data.getRowIndex("Row2"));
    }

    @Test
    public void testGetRowIndex_nonExistingKey_returnsNegativeOne() {
        assertEquals(-1, data.getRowIndex("NonExistent"));
    }

    @Test
    public void testGetRowKeys_afterAddingRows_returnsUnmodifiableList() {
        data.setObject("Value1", "Row1", "Col1");
        List rowKeys = data.getRowKeys();
        assertEquals(1, rowKeys.size());
        try {
            rowKeys.add("Row2");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- getColumnKey / getColumnIndex / getColumnKeys ----------
    @Test
    public void testGetColumnKey_validIndex_returnsCorrectKey() {
        data.setObject("Value1", "Row1", "Col1");
        assertEquals("Col1", data.getColumnKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetColumnKey_invalidIndex_throwsException() {
        data.getColumnKey(0);
    }

    @Test
    public void testGetColumnIndex_existingKey_returnsCorrectIndex() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row1", "Col2");
        assertEquals(1, data.getColumnIndex("Col2"));
    }

    @Test
    public void testGetColumnIndex_nonExistingKey_returnsNegativeOne() {
        assertEquals(-1, data.getColumnIndex("NonExistent"));
    }

    @Test
    public void testGetColumnKeys_afterAddingColumns_returnsUnmodifiableList() {
        data.setObject("Value1", "Row1", "Col1");
        List columnKeys = data.getColumnKeys();
        assertEquals(1, columnKeys.size());
        try {
            columnKeys.add("Col2");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- getObject(Comparable, Comparable) ----------
    @Test
    public void testGetObjectByKey_validKeys_returnsCorrectValue() {
        data.setObject("Value1", "Row1", "Col1");
        assertEquals("Value1", data.getObject("Row1", "Col1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetObjectByKey_nullRowKey_throwsIllegalArgumentException() {
        data.getObject(null, "Col1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetObjectByKey_nullColumnKey_throwsIllegalArgumentException() {
        data.getObject("Row1", null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetObjectByKey_unknownRowKey_throwsUnknownKeyException() {
        data.setObject("Value1", "Row1", "Col1");
        data.getObject("UnknownRow", "Col1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetObjectByKey_unknownColumnKey_throwsUnknownKeyException() {
        data.setObject("Value1", "Row1", "Col1");
        data.getObject("Row1", "UnknownCol");
    }

    // ---------- removeObject ----------
    @Test
    public void testRemoveObject_singleValueInRow_removesRow() {
        data.setObject("Value1", "Row1", "Col1");
        data.removeObject("Row1", "Col1");
        assertEquals(0, data.getRowCount());
    }

    @Test
    public void testRemoveObject_multipleValuesInRow_keepsRowIfNotAllNull() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row1", "Col2");
        data.removeObject("Row1", "Col1");
        assertEquals(1, data.getRowCount());
        assertNull(data.getObject("Row1", "Col1"));
        assertEquals("Value2", data.getObject("Row1", "Col2"));
    }

    @Test
    public void testRemoveObject_allValuesNullInRow_removesRow() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject(null, "Row1", "Col2");
        data.removeObject("Row1", "Col1");
        assertEquals(0, data.getRowCount());
    }

    // ---------- removeRow(int) ----------
    @Test
    public void testRemoveRowByIndex_validIndex_removesRow() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row2", "Col1");
        data.removeRow(0);
        assertEquals(1, data.getRowCount());
        assertEquals("Row2", data.getRowKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveRowByIndex_invalidIndex_throwsException() {
        data.removeRow(0);
    }

    // ---------- removeRow(Comparable) ----------
    @Test
    public void testRemoveRowByKey_validKey_removesRow() {
        data.setObject("Value1", "Row1", "Col1");
        data.removeRow("Row1");
        assertEquals(0, data.getRowCount());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveRowByKey_nonExistingKey_throwsException() {
        data.removeRow("NonExistent");
    }

    // ---------- removeColumn(int) ----------
    @Test
    public void testRemoveColumnByIndex_validIndex_removesColumn() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row1", "Col2");
        data.removeColumn(0);
        assertEquals(1, data.getColumnCount());
        assertEquals("Col2", data.getColumnKey(0));
    }

    // ---------- removeColumn(Comparable) ----------
    @Test
    public void testRemoveColumnByKey_validKey_removesColumn() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row1", "Col2");
        data.removeColumn("Col1");
        assertEquals(1, data.getColumnCount());
        assertEquals("Col2", data.getColumnKey(0));
    }

    @Test(expected = UnknownKeyException.class)
    public void testRemoveColumnByKey_unknownKey_throwsUnknownKeyException() {
        data.setObject("Value1", "Row1", "Col1");
        data.removeColumn("UnknownCol");
    }

    // ---------- equals ----------
    @Test
    public void testEquals_sameObject_returnsTrue() {
        data.setObject("Value1", "Row1", "Col1");
        assertTrue(data.equals(data));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        data.setObject("Value1", "Row1", "Col1");
        assertFalse(data.equals("NotAKeyedObjects2D"));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        assertFalse(data.equals(null));
    }

    @Test
    public void testEquals_equalObjects_returnsTrue() {
        data.setObject("Value1", "Row1", "Col1");
        KeyedObjects2D other = new KeyedObjects2D();
        other.setObject("Value1", "Row1", "Col1");
        assertTrue(data.equals(other));
    }

    @Test
    public void testEquals_differentRowKeys_returnsFalse() {
        data.setObject("Value1", "Row1", "Col1");
        KeyedObjects2D other = new KeyedObjects2D();
        other.setObject("Value1", "RowDifferent", "Col1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_differentColumnKeys_returnsFalse() {
        data.setObject("Value1", "Row1", "Col1");
        KeyedObjects2D other = new KeyedObjects2D();
        other.setObject("Value1", "Row1", "ColDifferent");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        data.setObject("Value1", "Row1", "Col1");
        KeyedObjects2D other = new KeyedObjects2D();
        other.setObject("Value2", "Row1", "Col1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_differentRowCount_returnsFalse() {
        data.setObject("Value1", "Row1", "Col1");
        KeyedObjects2D other = new KeyedObjects2D();
        other.setObject("Value1", "Row1", "Col1");
        other.setObject("Value2", "Row2", "Col1");
        assertFalse(data.equals(other));
    }

    @Test
    public void testEquals_bothNullValues_returnsTrue() {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject(null, "Row1", "Col2");
        KeyedObjects2D other = new KeyedObjects2D();
        other.setObject("Value1", "Row1", "Col1");
        other.setObject(null, "Row1", "Col2");
        assertTrue(data.equals(other));
    }

    // ---------- hashCode ----------
    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        data.setObject("Value1", "Row1", "Col1");
        KeyedObjects2D other = new KeyedObjects2D();
        other.setObject("Value1", "Row1", "Col1");
        assertEquals(data.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_emptyObject_doesNotThrow() {
        int hash = data.hashCode();
        assertNotNull(hash);
    }

    // ---------- clone ----------
    @Test
    public void testClone_producesEqualButIndependentCopy() throws CloneNotSupportedException {
        data.setObject("Value1", "Row1", "Col1");
        data.setObject("Value2", "Row2", "Col2");
        KeyedObjects2D clone = (KeyedObjects2D) data.clone();
        assertTrue(data.equals(clone));
        assertNotSame(data, clone);

        // Modify original, clone should remain unaffected
        data.setObject("Value3", "Row3", "Col3");
        assertFalse(data.equals(clone));
        assertEquals(2, clone.getRowCount());
    }

    @Test
    public void testClone_emptyObject_producesEmptyClone() throws CloneNotSupportedException {
        KeyedObjects2D clone = (KeyedObjects2D) data.clone();
        assertEquals(0, clone.getRowCount());
        assertEquals(0, clone.getColumnCount());
    }
}
