package org.jfree.data;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Unit tests for {@link DefaultKeyedValues2D}.
 */
public class DefaultKeyedValues2DTest {

    @Test
    public void testConstructor_default_createsEmptyStructure() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertTrue(data.getRowKeys().isEmpty());
        assertTrue(data.getColumnKeys().isEmpty());
    }

    @Test
    public void testConstructor_sortRowKeys_maintainsSortedOrder() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D(true);
        data.setValue(1.0, "R3", "C1");
        data.setValue(2.0, "R1", "C1");
        data.setValue(3.0, "R2", "C1");

        assertEquals(3, data.getRowCount());
        assertEquals("R1", data.getRowKey(0));
        assertEquals("R2", data.getRowKey(1));
        assertEquals("R3", data.getRowKey(2));
    }

    @Test
    public void testGetRowCountAndColumnCount_emptyAndPopulated_returnsCorrectCounts() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());

        data.addValue(10, "R1", "C1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());

        data.addValue(20, "R2", "C2");
        assertEquals(2, data.getRowCount());
        assertEquals(2, data.getColumnCount());
    }

    @Test
    public void testGetValue_byIndices_returnsCorrectValue() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(100, "R1", "C1");
        data.setValue(200, "R2", "C2");

        assertEquals(100, data.getValue(0, 0));
        assertNull(data.getValue(0, 1)); // C2 is not in R1
        assertNull(data.getValue(1, 0)); // C1 is not in R2
        assertEquals(200, data.getValue(1, 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_byIndices_invalidRow_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getValue(0, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_byIndices_invalidColumn_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.getValue(0, 1);
    }

    @Test
    public void testGetRowKey_validIndex_returnsKey() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        assertEquals("R1", data.getRowKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRowKey_invalidIndex_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getRowKey(0);
    }

    @Test
    public void testGetRowIndex_existingKey_returnsIndex() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.setValue(20, "R2", "C1");

        assertEquals(0, data.getRowIndex("R1"));
        assertEquals(1, data.getRowIndex("R2"));
        assertEquals(-1, data.getRowIndex("NonExisting"));
    }

    @Test
    public void testGetRowIndex_sortedMode_returnsBinarySearchIndex() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D(true);
        data.setValue(10, "B", "C1");
        data.setValue(20, "D", "C1");

        assertEquals(0, data.getRowIndex("B"));
        assertEquals(1, data.getRowIndex("D"));
        assertTrue(data.getRowIndex("A") < 0);
        assertTrue(data.getRowIndex("C") < 0);
        assertTrue(data.getRowIndex("E") < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowIndex_nullKey_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getRowIndex(null);
    }

    @Test
    public void testGetRowKeys_returnsUnmodifiableList() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");

        List rowKeys = data.getRowKeys();
        assertEquals(1, rowKeys.size());
        assertEquals("R1", rowKeys.get(0));

        try {
            rowKeys.add("R2");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testGetColumnKey_validIndex_returnsKey() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        assertEquals("C1", data.getColumnKey(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetColumnKey_invalidIndex_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getColumnKey(0);
    }

    @Test
    public void testGetColumnIndex_existingKey_returnsIndex() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.setValue(20, "R1", "C2");

        assertEquals(0, data.getColumnIndex("C1"));
        assertEquals(1, data.getColumnIndex("C2"));
        assertEquals(-1, data.getColumnIndex("NonExisting"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_nullKey_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getColumnIndex(null);
    }

    @Test
    public void testGetColumnKeys_returnsUnmodifiableList() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");

        List colKeys = data.getColumnKeys();
        assertEquals(1, colKeys.size());
        assertEquals("C1", colKeys.get(0));

        try {
            colKeys.add("C2");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testGetValue_byKeys_existingKeys_returnsValue() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(100, "R1", "C1");
        data.setValue(null, "R1", "C2");
        data.setValue(200, "R2", "C2");

        assertEquals(100, data.getValue("R1", "C1"));
        assertNull(data.getValue("R1", "C2"));
        assertNull(data.getValue("R2", "C1")); // R2 doesn't have C1 explicitly set
        assertEquals(200, data.getValue("R2", "C2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_byKeys_nullRowKey_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getValue(null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_byKeys_nullColumnKey_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getValue("R1", null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_byKeys_unknownColumnKey_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.getValue("R1", "UnknownCol");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_byKeys_unknownRowKey_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.getValue("UnknownRow", "C1");
    }

    @Test
    public void testSetValue_updatesExistingValue() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        assertEquals(10, data.getValue("R1", "C1"));

        data.setValue(20, "R1", "C1");
        assertEquals(20, data.getValue("R1", "C1"));
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
    }

    @Test
    public void testAddValue_delegatesToSetValue() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.addValue(50, "R1", "C1");
        assertEquals(50, data.getValue("R1", "C1"));
    }

    @Test
    public void testRemoveValue_singleValue_removesRowAndColumn() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.removeValue("R1", "C1");

        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
    }

    @Test
    public void testRemoveValue_partialRowRemoval_onlyRowRemoved() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.setValue(20, "R2", "C1");

        data.removeValue("R1", "C1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals("R2", data.getRowKey(0));
        assertEquals("C1", data.getColumnKey(0));
    }

    @Test
    public void testRemoveValue_partialColumnRemoval_onlyColumnRemoved() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(10, "R1", "C1");
        data.setValue(20, "R1", "C2");

        data.removeValue("R1", "C1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals("R1", data.getRowKey(0));
        assertEquals("C2", data.getColumnKey(0));
    }

    @Test
    public void testRemoveValue_neitherRowNorColumnBecomesEmpty() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(1, "R1", "C1");
        data.setValue(2, "R1", "C2");
        data.setValue(3, "R2", "C1");
        data.setValue(4, "R2", "C2");

        data.removeValue("R1", "C1");
        assertEquals(2, data.getRowCount());
        assertEquals(2, data.getColumnCount());
        assertNull(data.getValue("R1", "C1"));
        assertEquals(2, data.getValue("R1", "C2"));
        assertEquals(3, data.getValue("R2", "C1"));
        assertEquals(4, data.getValue("R2", "C2"));
    }

    @Test
    public void testRemoveRow_byIndex_removesRow() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(1, "R1", "C1");
        data.setValue(2, "R2", "C1");

        data.removeRow(0);
        assertEquals(1, data.getRowCount());
        assertEquals("R2", data.getRowKey(0));
    }

    @Test
    public void testRemoveRow_byKey_removesRow() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(1, "R1", "C1");
        data.setValue(2, "R2", "C1");

        data.removeRow("R1");
        assertEquals(1, data.getRowCount());
        assertEquals("R2", data.getRowKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRow_nullKey_throwsException() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.removeRow(null);
    }

    @Test
    public void testRemoveColumn_byIndex_removesColumn() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(1, "R1", "C1");
        data.setValue(2, "R1", "C2");

        data.removeColumn(0);
        assertEquals(1, data.getColumnCount());
        assertEquals("C2", data.getColumnKey(0));
    }

    @Test
    public void testRemoveColumn_byKey_removesColumn() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(1, "R1", "C1");
        data.setValue(2, "R1", "C2");
        data.setValue(3, "R2", "C1");

        data.removeColumn("C1");
        assertEquals(1, data.getColumnCount());
        assertEquals("C2", data.getColumnKey(0));
        assertNull(data.getValue(0, 0)); // R1, C2 = 2
        assertEquals(2, data.getValue("R1", "C2"));
    }

    @Test
    public void testClear_removesAllData() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(1, "R1", "C1");
        data.setValue(2, "R2", "C2");

        data.clear();
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertTrue(data.getRowKeys().isEmpty());
        assertTrue(data.getColumnKeys().isEmpty());
    }

    @Test
    public void testEquals_and_HashCode() {
        DefaultKeyedValues2D d1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D d2 = new DefaultKeyedValues2D();

        // Same object
        assertTrue(d1.equals(d1));
        // Null & different class
        assertFalse(d1.equals(null));
        assertFalse(d1.equals("NotA2D"));

        // Both empty
        assertTrue(d1.equals(d2));
        assertEquals(d1.hashCode(), d2.hashCode());

        // Same structure and values
        d1.setValue(10, "R1", "C1");
        assertFalse(d1.equals(d2));

        d2.setValue(10, "R1", "C1");
        assertTrue(d1.equals(d2));
        assertEquals(d1.hashCode(), d2.hashCode());

        // Different row keys
        DefaultKeyedValues2D d3 = new DefaultKeyedValues2D();
        d3.setValue(10, "R2", "C1");
        assertFalse(d1.equals(d3));

        // Different column keys
        DefaultKeyedValues2D d4 = new DefaultKeyedValues2D();
        d4.setValue(10, "R1", "C2");
        assertFalse(d1.equals(d4));

        // Different values (v1 != v2)
        DefaultKeyedValues2D d5 = new DefaultKeyedValues2D();
        d5.setValue(20, "R1", "C1");
        assertFalse(d1.equals(d5));

        // Null value matching
        d1.setValue(null, "R1", "C2");
        d2.setValue(null, "R1", "C2");
        assertTrue(d1.equals(d2));

        // One null, one non-null
        d2.setValue(99, "R1", "C2");
        assertFalse(d1.equals(d2));
        assertFalse(d2.equals(d1));
    }

    @Test
    public void testClone_createsIndependentDeepCopy() throws Exception {
        DefaultKeyedValues2D d1 = new DefaultKeyedValues2D();
        d1.setValue(10, "R1", "C1");
        d1.setValue(20, "R2", "C2");

        DefaultKeyedValues2D d2 = (DefaultKeyedValues2D) d1.clone();
        assertNotSame(d1, d2);
        assertTrue(d1.equals(d2));

        // Modify d1, ensure d2 is not modified
        d1.setValue(30, "R1", "C1");
        assertEquals(30, d1.getValue("R1", "C1"));
        assertEquals(10, d2.getValue("R1", "C1"));

        d1.setValue(40, "R3", "C3");
        assertFalse(d1.equals(d2));
    }

    @Test
    public void testSerialization() throws Exception {
        DefaultKeyedValues2D d1 = new DefaultKeyedValues2D();
        d1.setValue(1.5, "R1", "C1");
        d1.setValue(null, "R1", "C2");
        d1.setValue(3.5, "R2", "C2");

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(d1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        DefaultKeyedValues2D d2 = (DefaultKeyedValues2D) in.readObject();
        in.close();

        assertEquals(d1, d2);
        assertEquals(d1.hashCode(), d2.hashCode());
        assertEquals(1.5, d2.getValue("R1", "C1"));
        assertNull(d2.getValue("R1", "C2"));
        assertEquals(3.5, d2.getValue("R2", "C2"));
    }
}
