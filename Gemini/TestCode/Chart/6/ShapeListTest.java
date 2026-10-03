package org.jfree.chart.util;

import org.junit.Test;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the {@link ShapeList} class.
 */
public class ShapeListTest {

    @Test
    public void testConstructor_default_createsEmptyList() {
        ShapeList list = new ShapeList();
        assertEquals(0, list.size());
        assertNull(list.getShape(0));
    }

    @Test
    public void testGetAndSetShape_normalInput_storesAndRetrievesCorrectly() {
        ShapeList list = new ShapeList();
        Shape shape1 = new Rectangle2D.Double(0.0, 0.0, 10.0, 20.0);
        Shape shape2 = new Ellipse2D.Double(5.0, 5.0, 15.0, 25.0);

        list.setShape(0, shape1);
        list.setShape(1, shape2);

        assertEquals(shape1, list.getShape(0));
        assertEquals(shape2, list.getShape(1));
    }

    @Test
    public void testGetAndSetShape_withGaps_storesAndExpandsCorrectly() {
        ShapeList list = new ShapeList();
        Shape shape = new Line2D.Double(0.0, 0.0, 100.0, 100.0);

        list.setShape(3, shape);

        assertNull(list.getShape(0));
        assertNull(list.getShape(1));
        assertNull(list.getShape(2));
        assertEquals(shape, list.getShape(3));
        assertEquals(4, list.size());
    }

    @Test
    public void testGetAndSetShape_nullShape_storesNullCorrectly() {
        ShapeList list = new ShapeList();
        list.setShape(0, null);

        assertNull(list.getShape(0));
        assertEquals(1, list.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetShape_negativeIndex_throwsException() {
        ShapeList list = new ShapeList();
        list.setShape(-1, new Rectangle(0, 0, 10, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetShape_negativeIndex_throwsException() {
        ShapeList list = new ShapeList();
        list.getShape(-1);
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        ShapeList list = new ShapeList();
        assertTrue(list.equals(list));
    }

    @Test
    public void testEquals_nullAndOtherTypes_returnsFalse() {
        ShapeList list = new ShapeList();
        assertFalse(list.equals(null));
        assertFalse(list.equals("Not a ShapeList"));
        assertFalse(list.equals(new Object()));
    }

    @Test
    public void testEquals_identicalLists_returnsTrue() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));

        list1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list1.setShape(2, new Line2D.Double(0.0, 0.0, 5.0, 5.0));

        list2.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list2.setShape(2, new Line2D.Double(0.0, 0.0, 5.0, 5.0));

        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));
    }

    @Test
    public void testEquals_differentLists_returnsFalse() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        list1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list2.setShape(0, new Rectangle2D.Double(5.0, 6.0, 7.0, 8.0));

        assertFalse(list1.equals(list2));

        list2.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list2.setShape(1, new Ellipse2D.Double(0.0, 0.0, 1.0, 1.0));

        assertFalse(list1.equals(list2));
    }

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        assertEquals(list1.hashCode(), list2.hashCode());

        list1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list2.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));

        assertEquals(list1.hashCode(), list2.hashCode());
    }

    @Test
    public void testHashCode_differentObjects_differentOrEqualHashCode() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        list1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list2.setShape(0, new Rectangle2D.Double(5.0, 6.0, 7.0, 8.0));

        assertNotEquals(list1.hashCode(), list2.hashCode());
    }

    @Test
    public void testClone_clonedInstanceIsEqualButIndependent() throws CloneNotSupportedException {
        ShapeList list1 = new ShapeList();
        list1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list1.setShape(1, null);
        list1.setShape(2, new Line2D.Double(0.0, 0.0, 10.0, 10.0));

        ShapeList list2 = (ShapeList) list1.clone();

        assertNotSame(list1, list2);
        assertEquals(list1, list2);

        list2.setShape(0, new Rectangle2D.Double(9.0, 9.0, 9.0, 9.0));
        assertNotEquals(list1, list2);
    }

    @Test
    public void testSerialization_emptyList_restoresCorrectly() throws Exception {
        ShapeList list1 = new ShapeList();

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(list1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList list2 = (ShapeList) in.readObject();
        in.close();

        assertEquals(list1, list2);
        assertEquals(0, list2.size());
    }

    @Test
    public void testSerialization_populatedListWithNulls_restoresCorrectly() throws Exception {
        ShapeList list1 = new ShapeList();
        list1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        list1.setShape(1, null);
        list1.setShape(2, new Ellipse2D.Double(10.0, 20.0, 30.0, 40.0));
        list1.setShape(3, new Line2D.Double(1.0, 1.0, 5.0, 5.0));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(list1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList list2 = (ShapeList) in.readObject();
        in.close();

        assertEquals(list1, list2);
        assertEquals(4, list2.size());
        assertEquals(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), list2.getShape(0));
        assertNull(list2.getShape(1));
        assertEquals(new Ellipse2D.Double(10.0, 20.0, 30.0, 40.0), list2.getShape(2));
        assertEquals(new Line2D.Double(1.0, 1.0, 5.0, 5.0), list2.getShape(3));
    }
}
