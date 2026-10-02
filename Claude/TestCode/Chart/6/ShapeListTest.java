import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

public class ShapeListTest {

    private ShapeList shapeList;

    @Before
    public void setUp() {
        shapeList = new ShapeList();
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_createsEmptyList() {
        ShapeList list = new ShapeList();
        assertNotNull(list);
    }

    // ---------- getShape / setShape : normal cases ----------

    @Test
    public void testSetShapeAndGetShape_normalInput_returnsCorrectShape() {
        Shape rect = new Rectangle2D.Double(0, 0, 10, 10);
        shapeList.setShape(0, rect);
        assertEquals(rect, shapeList.getShape(0));
    }

    @Test
    public void testSetShapeAndGetShape_multipleEntries_returnsCorrectShapes() {
        Shape rect = new Rectangle2D.Double(1, 1, 5, 5);
        Shape ellipse = new Ellipse2D.Double(2, 2, 8, 8);
        shapeList.setShape(0, rect);
        shapeList.setShape(1, ellipse);

        assertEquals(rect, shapeList.getShape(0));
        assertEquals(ellipse, shapeList.getShape(1));
    }

    @Test
    public void testSetShape_nullShape_storesNull() {
        shapeList.setShape(0, null);
        assertNull(shapeList.getShape(0));
    }

    // ---------- getShape : edge cases ----------

    @Test
    public void testGetShape_indexOutOfBoundsBeyondSize_returnsNull() {
        // no shapes set yet, list is empty
        assertNull(shapeList.getShape(5));
    }

    @Test
    public void testGetShape_negativeIndex_returnsNull() {
        assertNull(shapeList.getShape(-1));
    }

    @Test
    public void testGetShape_indexZeroOnEmptyList_returnsNull() {
        assertNull(shapeList.getShape(0));
    }

    // ---------- setShape : edge cases / expansion ----------

    @Test
    public void testSetShape_indexEqualsSize_appendsShape() {
        Shape rect = new Rectangle2D.Double(0, 0, 1, 1);
        shapeList.setShape(0, rect);
        Shape rect2 = new Rectangle2D.Double(1, 1, 2, 2);
        shapeList.setShape(1, rect2);
        assertEquals(rect2, shapeList.getShape(1));
    }

    @Test
    public void testSetShape_indexGreaterThanSize_expandsListWithNulls() {
        Shape rect = new Rectangle2D.Double(0, 0, 3, 3);
        shapeList.setShape(5, rect);
        assertEquals(rect, shapeList.getShape(5));
        // indices before 5 should be null
        assertNull(shapeList.getShape(0));
        assertNull(shapeList.getShape(4));
    }

    // ---------- setShape : exception case ----------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetShape_negativeIndex_throwsIndexOutOfBoundsException() {
        shapeList.setShape(-1, new Rectangle2D.Double(0, 0, 1, 1));
    }

    // ---------- clone ----------

    @Test
    public void testClone_returnsIndependentEqualCopy() throws CloneNotSupportedException {
        Shape rect = new Rectangle2D.Double(0, 0, 10, 10);
        shapeList.setShape(0, rect);

        ShapeList clone = (ShapeList) shapeList.clone();

        assertNotSame(shapeList, clone);
        assertEquals(shapeList, clone);
        assertEquals(shapeList.getShape(0), clone.getShape(0));
    }

    @Test
    public void testClone_emptyList_returnsEqualEmptyClone() throws CloneNotSupportedException {
        ShapeList clone = (ShapeList) shapeList.clone();
        assertNotSame(shapeList, clone);
        assertEquals(shapeList, clone);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(shapeList.equals(shapeList));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(shapeList.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(shapeList.equals("not a ShapeList"));
    }

    @Test
    public void testEquals_equalLists_returnsTrue() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        Shape rect = new Rectangle2D.Double(0, 0, 5, 5);
        list1.setShape(0, rect);
        list2.setShape(0, rect);

        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));
    }

    @Test
    public void testEquals_differentShapes_returnsFalse() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        list1.setShape(0, new Rectangle2D.Double(0, 0, 5, 5));
        list2.setShape(0, new Ellipse2D.Double(0, 0, 5, 5));

        assertFalse(list1.equals(list2));
    }

    @Test
    public void testEquals_differentSizes_returnsFalse() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        list1.setShape(0, new Rectangle2D.Double(0, 0, 5, 5));
        list1.setShape(1, new Rectangle2D.Double(1, 1, 5, 5));

        list2.setShape(0, new Rectangle2D.Double(0, 0, 5, 5));

        assertFalse(list1.equals(list2));
    }

    @Test
    public void testEquals_bothEmptyLists_returnsTrue() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        assertTrue(list1.equals(list2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        Shape rect = new Rectangle2D.Double(0, 0, 5, 5);
        list1.setShape(0, rect);
        list2.setShape(0, rect);

        assertEquals(list1.hashCode(), list2.hashCode());
    }

    @Test
    public void testHashCode_returnsConsistentValueOnRepeatedCalls() {
        shapeList.setShape(0, new Rectangle2D.Double(0, 0, 5, 5));
        int hash1 = shapeList.hashCode();
        int hash2 = shapeList.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_emptyList_doesNotThrow() {
        // should not throw exception even for empty list
        int hash = shapeList.hashCode();
        assertNotNull(hash);
    }
}
