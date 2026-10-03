package org.jfree.data;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for the {@link KeyedObjects2D} class.
 */
public class KeyedObjects2DTest {

    private KeyedObjects2D data;

    @Before
    public void setUp() {
        this.data = new KeyedObjects2D();
    }

    @Test
    public void testConstructor_InitialState_IsEmpty() {
        assertEquals(0, this.data.getRowCount());
        assertEquals(0, this.data.getColumnCount());
        assertNotNull(this.data.getRowKeys());
        assertTrue(this.data.getRowKeys().isEmpty());
        assertNotNull(this.data.getColumnKeys());
        assertTrue(this.data.getColumnKeys().isEmpty());
    }

    @Test
    public void testSetObjectAndGetObjectByIndices_NormalData_Success() {
        this.data.setObject("A", "R1", "C1");
        this.data.setObject("B", "R1", "C2");
        this.data.setObject("C", "R2", "C1");

        assertEquals(2, this.data.getRowCount());
        assertEquals(2, this.data.getColumnCount());

        assertEquals("A", this.data.getObject(0, 0));
        assertEquals("B", this.data.getObject(0, 1));
        assertEquals("C", this.data.getObject(1, 0));
        assertNull(this.data.getObject(1, 1)); // R2 does not have C2 set
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetObjectByIndex_InvalidRowIndex_ThrowsException() {
        this.data.getObject(0, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetObjectByIndex_InvalidColumnIndex_ThrowsException() {
        this.data.setObject("A", "R1", "C1");
        this.data.getObject(0, 5);
    }

    @Test
    public void testAddObject_NormalData_DelegatesToSetObject() {
        this.data.addObject("Value1", "Row1", "Col1");
        assertEquals("Value1", this.data.getObject("Row1", "Col1"));
        assertEquals(1, this.data.getRowCount());
        assertEquals(1, this.data.getColumnCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObject_NullRowKey_ThrowsIllegalArgumentException() {
        this.data.setObject("Value", null, "Col1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObject_NullColumnKey_ThrowsIllegalArgumentException() {
        this.data.setObject("Value", "Row1", null);
    }

    @Test
    public void testSetObject_OverwriteExistingValue_Success() {
        this.data.setObject("Old", "R1", "C1");
        assertEquals("Old", this.data.getObject("R1", "C1"));
        this.data.setObject("New", "R1", "C1");
        assertEquals("New", this.data.getObject("R1", "C1"));
    }

    @Test
    public void testGetObjectByKeys_ExistingKeys_ReturnsCorrectObject() {
        this.data.setObject("ValueA", "R1", "C1");
        this.data.setObject("ValueB", "R1", "C2");
        assertEquals("ValueA", this.data.getObject("R1", "C1"));
        assertEquals("ValueB", this.data.getObject("R1", "C2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetObjectByKeys_NullRowKey_ThrowsIllegalArgumentException() {
        this.data.getObject(null, "C1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetObjectByKeys_NullColumnKey_ThrowsIllegalArgumentException() {
        this.data.getObject("R1", null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetObjectByKeys_UnknownRowKey_ThrowsUnknownKeyException() {
        this.data.setObject("Value", "R1", "C1");
        this.data.getObject("UnknownRow", "C1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetObjectByKeys_UnknownColumnKey_ThrowsUnknownKeyException() {
        this.data.setObject("Value", "R1", "C1");
        this.data.getObject("R1", "UnknownCol");
    }

    @Test
    public void testGetRowKey_ValidIndex_ReturnsKey() {
        this.data.setObject("A", "R1", "C1");
        this.data.setObject("B", "R2", "C1");
        assertEquals("R1", this.data.getRowKey(0));
        assertEquals("R2", this.data.getRowKey(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRowKey_InvalidIndex_ThrowsException() {
        this.data.getRowKey(0);
    }

    @Test
    public void testGetRowIndex_ExistingAndNonExisting_ReturnsExpected() {
        this.data.setObject("A", "R1", "C1");
        this.data.setObject("B", "R2", "C1");

        assertEquals(0, this.data.getRowIndex("R1"));
        assertEquals(1, this.data.getRowIndex("R2"));
        assertEquals(-1, this.data.getRowIndex("R3"));
        assertEquals(-1, this.data.getRowIndex(null));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRowKeys_UnmodifiableList_ThrowsOnModify() {
        this.data.setObject("A", "R1", "C1");
        List rowKeys = this.data.getRowKeys();
        rowKeys.add("R2");
    }

    @Test
    public void testGetColumnKey_ValidIndex_ReturnsKey() {
        this.data.setObject("A", "R1", "C1");
        this.data.setObject("B", "R1", "C2");
        assertEquals("C1", this.data.getColumnKey(0));
        assertEquals("C2", this.data.getColumnKey(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetColumnKey_InvalidIndex_ThrowsException() {
        this.data.getColumnKey(0);
    }

    @Test
    public void testGetColumnIndex_ExistingAndNonExisting_ReturnsExpected() {
        this.data.setObject("A", "R1", "C1");
        this.data.setObject("B", "R1", "C2");

        assertEquals(0, this.data.getColumnIndex("C1"));
        assertEquals(1, this.data.getColumnIndex("C2"));
        assertEquals(-1, this.data.getColumnIndex("C3"));
        assertEquals(-1, this.data.getColumnIndex(null));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetColumnKeys_UnmodifiableList_ThrowsOnModify() {
        this.data.setObject("A", "R1", "C1");
        List colKeys = this.data.getColumnKeys();
        colKeys.add("C2");
    }

    @Test
    public void testRemoveObject_PartialRow_RowRetained() {
        this.data.setObject("V1", "R1", "C1");
        this.data.setObject("V2", "R1", "C2");

        this.data.removeObject("R1", "C1");

        assertEquals(1, this.data.getRowCount());
        assertEquals("R1", this.data.getRowKey(0));
        assertNull(this.data.getObject("R1", "C1"));
        assertEquals("V2", this.data.getObject("R1", "C2"));
    }

    @Test
    public void testRemoveObject_EntireRowNull_RowRemoved() {
        this.data.setObject("V1", "R1", "C1");
        this.data.setObject("V2", "R2", "C1");

        this.data.removeObject("R1", "C1");

        assertEquals(1, this.data.getRowCount());
        assertEquals("R2", this.data.getRowKey(0));
        assertEquals(-1, this.data.getRowIndex("R1"));
    }

    @Test
    public void testRemoveRow_ByIndex_RemovesRow() {
        this.data.setObject("V1", "R1", "C1");
        this.data.setObject("V2", "R2", "C1");
        this.data.setObject("V3", "R3", "C1");

        this.data.removeRow(1); // Remove R2

        assertEquals(2, this.data.getRowCount());
        assertEquals("R1", this.data.getRowKey(0));
        assertEquals("R3", this.data.getRowKey(1));
    }

    @Test
    public void testRemoveRow_ByKey_RemovesRow() {
        this.data.setObject("V1", "R1", "C1");
        this.data.setObject("V2", "R2", "C1");

        this.data.removeRow("R1");

        assertEquals(1, this.data.getRowCount());
        assertEquals("R2", this.data.getRowKey(0));
        assertEquals(-1, this.data.getRowIndex("R1"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveRow_UnknownKey_ThrowsIndexOutOfBoundsException() {
        this.data.setObject("V1", "R1", "C1");
        this.data.removeRow("UnknownRow");
    }

    @Test
    public void testRemoveColumn_ByIndex_RemovesColumn() {
        this.data.setObject("V1", "R1", "C1");
        this.data.setObject("V2", "R1", "C2");

        this.data.removeColumn(0); // Remove C1

        assertEquals(1, this.data.getColumnCount());
        assertEquals("C2", this.data.getColumnKey(0));
        assertEquals(-1, this.data.getColumnIndex("C1"));
    }

    @Test
    public void testRemoveColumn_ByKey_RemovesColumnFromAllRows() {
        this.data.setObject("V1", "R1", "C1");
        this.data.setObject("V2", "R1", "C2");
        this.data.setObject("V3", "R2", "C1");
        this.data.setObject("V4", "R2", "C2");

        this.data.removeColumn("C1");

        assertEquals(1, this.data.getColumnCount());
        assertEquals("C2", this.data.getColumnKey(0));
        assertEquals(-1, this.data.getColumnIndex("C1"));
        assertEquals("V2", this.data.getObject("R1", "C2"));
        assertEquals("V4", this.data.getObject("R2", "C2"));
    }

    @Test(expected = UnknownKeyException.class)
    public void testRemoveColumn_UnknownKey_ThrowsUnknownKeyException() {
        this.data.setObject("V1", "R1", "C1");
        this.data.removeColumn("UnknownCol");
    }

    @Test
    public void testEquals_SameInstance_ReturnsTrue() {
        assertTrue(this.data.equals(this.data));
    }

    @Test
    public void testEquals_NullOrDifferentClass_ReturnsFalse() {
        assertFalse(this.data.equals(null));
        assertFalse(this.data.equals("Some String"));
    }

    @Test
    public void testEquals_IdenticalObjects_ReturnsTrue() {
        KeyedObjects2D k1 = new KeyedObjects2D();
        k1.setObject("A", "R1", "C1");
        k1.setObject("B", "R1", "C2");

        KeyedObjects2D k2 = new KeyedObjects2D();
        k2.setObject("A", "R1", "C1");
        k2.setObject("B", "R1", "C2");

        assertTrue(k1.equals(k2));
        assertTrue(k2.equals(k1));
        assertEquals(k1.hashCode(), k2.hashCode());
    }

    @Test
    public void testEquals_DifferentRowKeys_ReturnsFalse() {
        KeyedObjects2D k1 = new KeyedObjects2D();
        k1.setObject("A", "R1", "C1");

        KeyedObjects2D k2 = new KeyedObjects2D();
        k2.setObject("A", "R2", "C1");

        assertFalse(k1.equals(k2));
    }

    @Test
    public void testEquals_DifferentColumnKeys_ReturnsFalse() {
        KeyedObjects2D k1 = new KeyedObjects2D();
        k1.setObject("A", "R1", "C1");

        KeyedObjects2D k2 = new KeyedObjects2D();
        k2.setObject("A", "R1", "C2");

        assertFalse(k1.equals(k2));
    }

    @Test
    public void testEquals_DifferentValues_ReturnsFalse() {
        KeyedObjects2D k1 = new KeyedObjects2D();
        k1.setObject("A", "R1", "C1");

        KeyedObjects2D k2 = new KeyedObjects2D();
        k2.setObject("B", "R1", "C1");

        assertFalse(k1.equals(k2));
    }

    @Test
    public void testEquals_OneNullValue_ReturnsFalse() {
        KeyedObjects2D k1 = new KeyedObjects2D();
        k1.setObject(null, "R1", "C1");
        k1.setObject("B", "R1", "C2"); // keeps row alive

        KeyedObjects2D k2 = new KeyedObjects2D();
        k2.setObject("A", "R1", "C1");
        k2.setObject("B", "R1", "C2");

        assertFalse(k1.equals(k2));
        assertFalse(k2.equals(k1));
    }

    @Test
    public void testEquals_BothNullValues_ReturnsTrue() {
        KeyedObjects2D k1 = new KeyedObjects2D();
        k1.setObject(null, "R1", "C1");
        k1.setObject("B", "R1", "C2");

        KeyedObjects2D k2 = new KeyedObjects2D();
        k2.setObject(null, "R1", "C1");
        k2.setObject("B", "R1", "C2");

        assertTrue(k1.equals(k2));
    }

    @Test
    public void testClone_IndependentCopy_Success() throws CloneNotSupportedException {
        this.data.setObject("A", "R1", "C1");
        this.data.setObject("B", "R1", "C2");
        this.data.setObject("C", "R2", "C1");

        KeyedObjects2D clone = (KeyedObjects2D) this.data.clone();

        assertNotSame(this.data, clone);
        assertEquals(this.data, clone);

        // Modify clone and ensure original is unaffected
        clone.setObject("Modified", "R1", "C1");
        assertEquals("A", this.data.getObject("R1", "C1"));
        assertEquals("Modified", clone.getObject("R1", "C1"));
    }

    @Test
    public void testSerialization_RoundTrip_RestoresEquivalentObject() throws Exception {
        this.data.setObject("Val1", "R1", "C1");
        this.data.setObject("Val2", "R2", "C2");

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(this.data);

        ByteArrayInputStream inBuffer = new ByteArrayInputStream(buffer.toByteArray());
        ObjectInputStream in = new ObjectInputStream(inBuffer);
        KeyedObjects2D deserialized = (KeyedObjects2D) in.readObject();

        assertNotSame(this.data, deserialized);
        assertEquals(this.data, deserialized);
        assertEquals("Val1", deserialized.getObject("R1", "C1"));
        assertEquals("Val2", deserialized.getObject("R2", "C2"));
    }
}
