package org.jfree.chart.util;

import org.junit.Test;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Constructor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for {@link ShapeUtilities}.
 */
public class ShapeUtilitiesTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<ShapeUtilities> constructor = ShapeUtilities.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ShapeUtilities instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testClone_null() {
        assertNull(ShapeUtilities.clone(null));
    }

    @Test
    public void testClone_cloneableShape() {
        Rectangle2D rect = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape cloned = ShapeUtilities.clone(rect);
        assertNotNull(cloned);
        assertNotSame(rect, cloned);
        assertEquals(rect, cloned);
    }

    @Test
    public void testClone_nonCloneableShape() {
        Shape customShape = new Shape() {
            public Rectangle2D getBounds2D() { return new Rectangle2D.Double(); }
            public java.awt.Rectangle getBounds() { return new java.awt.Rectangle(); }
            public boolean contains(double x, double y) { return false; }
            public boolean contains(Point2D p) { return false; }
            public boolean intersects(double x, double y, double w, double h) { return false; }
            public boolean intersects(Rectangle2D r) { return false; }
            public boolean contains(double x, double y, double w, double h) { return false; }
            public boolean contains(Rectangle2D r) { return false; }
            public PathIterator getPathIterator(AffineTransform at) { return null; }
            public PathIterator getPathIterator(AffineTransform at, double flatness) { return null; }
        };
        assertNull(ShapeUtilities.clone(customShape));
    }

    @Test
    public void testClone_cloneableThrowsException() {
        class FailingCloneableShape implements Shape, Cloneable {
            public Rectangle2D getBounds2D() { return new Rectangle2D.Double(); }
            public java.awt.Rectangle getBounds() { return new java.awt.Rectangle(); }
            public boolean contains(double x, double y) { return false; }
            public boolean contains(Point2D p) { return false; }
            public boolean intersects(double x, double y, double w, double h) { return false; }
            public boolean intersects(Rectangle2D r) { return false; }
            public boolean contains(double x, double y, double w, double h) { return false; }
            public boolean contains(Rectangle2D r) { return false; }
            public PathIterator getPathIterator(AffineTransform at) { return null; }
            public PathIterator getPathIterator(AffineTransform at, double flatness) { return null; }
            @Override
            public Object clone() throws CloneNotSupportedException {
                throw new CloneNotSupportedException();
            }
        }
        assertNull(ShapeUtilities.clone(new FailingCloneableShape()));
    }

    @Test
    public void testEqualShape_bothNull() {
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
    }

    @Test
    public void testEqualShape_oneNull() {
        Shape s = new Rectangle2D.Double(0, 0, 10, 10);
        assertFalse(ShapeUtilities.equal(s, null));
        assertFalse(ShapeUtilities.equal(null, s));
    }

    @Test
    public void testEqualShape_line2D() {
        Shape l1 = new Line2D.Double(0.0, 0.0, 1.0, 1.0);
        Shape l2 = new Line2D.Double(0.0, 0.0, 1.0, 1.0);
        Shape l3 = new Line2D.Double(0.0, 0.0, 2.0, 2.0);
        assertTrue(ShapeUtilities.equal(l1, l2));
        assertFalse(ShapeUtilities.equal(l1, l3));
    }

    @Test
    public void testEqualShape_ellipse2D() {
        Shape e1 = new Ellipse2D.Double(0.0, 0.0, 10.0, 20.0);
        Shape e2 = new Ellipse2D.Double(0.0, 0.0, 10.0, 20.0);
        Shape e3 = new Ellipse2D.Double(0.0, 0.0, 10.0, 30.0);
        assertTrue(ShapeUtilities.equal(e1, e2));
        assertFalse(ShapeUtilities.equal(e1, e3));
    }

    @Test
    public void testEqualShape_arc2D() {
        Shape a1 = new Arc2D.Double(0.0, 0.0, 10.0, 20.0, 0.0, 90.0, Arc2D.OPEN);
        Shape a2 = new Arc2D.Double(0.0, 0.0, 10.0, 20.0, 0.0, 90.0, Arc2D.OPEN);
        Shape a3 = new Arc2D.Double(0.0, 0.0, 10.0, 20.0, 0.0, 45.0, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal(a1, a2));
        assertFalse(ShapeUtilities.equal(a1, a3));
    }

    @Test
    public void testEqualShape_polygon() {
        Shape p1 = new Polygon(new int[]{0, 10, 0}, new int[]{0, 0, 10}, 3);
        Shape p2 = new Polygon(new int[]{0, 10, 0}, new int[]{0, 0, 10}, 3);
        Shape p3 = new Polygon(new int[]{0, 10, 10}, new int[]{0, 0, 10}, 3);
        assertTrue(ShapeUtilities.equal(p1, p2));
        assertFalse(ShapeUtilities.equal(p1, p3));
    }

    @Test
    public void testEqualShape_generalPath() {
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(0, 0);
        gp1.lineTo(10, 10);
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(0, 0);
        gp2.lineTo(10, 10);
        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(0, 0);
        gp3.lineTo(20, 20);
        assertTrue(ShapeUtilities.equal(gp1, gp2));
        assertFalse(ShapeUtilities.equal(gp1, gp3));
    }

    @Test
    public void testEqualShape_rectangle2DAndOthers() {
        Shape r1 = new Rectangle2D.Double(0, 0, 10, 20);
        Shape r2 = new Rectangle2D.Double(0, 0, 10, 20);
        Shape r3 = new Rectangle2D.Double(0, 0, 10, 30);
        assertTrue(ShapeUtilities.equal(r1, r2));
        assertFalse(ShapeUtilities.equal(r1, r3));

        Shape line = new Line2D.Double(0, 0, 10, 20);
        assertFalse(ShapeUtilities.equal(r1, line));
    }

    @Test
    public void testEqualLine2D() {
        Line2D l1 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Line2D l2 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);

        assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
        assertFalse(ShapeUtilities.equal(null, l1));
        assertFalse(ShapeUtilities.equal(l1, null));
        assertTrue(ShapeUtilities.equal(l1, l2));

        Line2D diffP1 = new Line2D.Double(0.0, 2.0, 3.0, 4.0);
        assertFalse(ShapeUtilities.equal(l1, diffP1));

        Line2D diffP2 = new Line2D.Double(1.0, 2.0, 0.0, 4.0);
        assertFalse(ShapeUtilities.equal(l1, diffP2));
    }

    @Test
    public void testEqualEllipse2D() {
        Ellipse2D e1 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);
        Ellipse2D e2 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);

        assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));
        assertFalse(ShapeUtilities.equal(null, e1));
        assertFalse(ShapeUtilities.equal(e1, null));
        assertTrue(ShapeUtilities.equal(e1, e2));

        Ellipse2D diffFrame = new Ellipse2D.Double(1.0, 2.0, 3.0, 5.0);
        assertFalse(ShapeUtilities.equal(e1, diffFrame));
    }

    @Test
    public void testEqualArc2D() {
        Arc2D a1 = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, Arc2D.PIE);
        Arc2D a2 = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, Arc2D.PIE);

        assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
        assertFalse(ShapeUtilities.equal(null, a1));
        assertFalse(ShapeUtilities.equal(a1, null));
        assertTrue(ShapeUtilities.equal(a1, a2));

        Arc2D diffFrame = new Arc2D.Double(0.0, 2.0, 3.0, 4.0, 5.0, 6.0, Arc2D.PIE);
        assertFalse(ShapeUtilities.equal(a1, diffFrame));

        Arc2D diffStart = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 0.0, 6.0, Arc2D.PIE);
        assertFalse(ShapeUtilities.equal(a1, diffStart));

        Arc2D diffExtent = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 5.0, 0.0, Arc2D.PIE);
        assertFalse(ShapeUtilities.equal(a1, diffExtent));

        Arc2D diffType = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, diffType));
    }

    @Test
    public void testEqualPolygon() {
        Polygon p1 = new Polygon(new int[]{1, 2, 3}, new int[]{4, 5, 6}, 3);
        Polygon p2 = new Polygon(new int[]{1, 2, 3}, new int[]{4, 5, 6}, 3);

        assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
        assertFalse(ShapeUtilities.equal(null, p1));
        assertFalse(ShapeUtilities.equal(p1, null));
        assertTrue(ShapeUtilities.equal(p1, p2));

        Polygon diffNPoints = new Polygon(new int[]{1, 2}, new int[]{4, 5}, 2);
        assertFalse(ShapeUtilities.equal(p1, diffNPoints));

        Polygon diffX = new Polygon(new int[]{0, 2, 3}, new int[]{4, 5, 6}, 3);
        assertFalse(ShapeUtilities.equal(p1, diffX));

        Polygon diffY = new Polygon(new int[]{1, 2, 3}, new int[]{0, 5, 6}, 3);
        assertFalse(ShapeUtilities.equal(p1, diffY));
    }

    @Test
    public void testEqualGeneralPath() {
        GeneralPath gp1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gp1.moveTo(0.0, 0.0);
        gp1.lineTo(10.0, 10.0);
        gp1.closePath();

        GeneralPath gp2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        gp2.moveTo(0.0, 0.0);
        gp2.lineTo(10.0, 10.0);
        gp2.closePath();

        assertTrue(ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null));
        assertFalse(ShapeUtilities.equal(null, gp1));
        assertFalse(ShapeUtilities.equal(gp1, null));
        assertTrue(ShapeUtilities.equal(gp1, gp2));

        GeneralPath diffWinding = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        diffWinding.moveTo(0.0, 0.0);
        diffWinding.lineTo(10.0, 10.0);
        diffWinding.closePath();
        assertFalse(ShapeUtilities.equal(gp1, diffWinding));

        GeneralPath diffLength = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        diffLength.moveTo(0.0, 0.0);
        assertFalse(ShapeUtilities.equal(gp1, diffLength));

        GeneralPath diffSegmentType = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        diffSegmentType.moveTo(0.0, 0.0);
        diffSegmentType.quadTo(5.0, 0.0, 10.0, 10.0);
        diffSegmentType.closePath();
        assertFalse(ShapeUtilities.equal(gp1, diffSegmentType));

        GeneralPath diffCoords = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        diffCoords.moveTo(0.0, 0.0);
        diffCoords.lineTo(10.0, 20.0);
        diffCoords.closePath();
        assertFalse(ShapeUtilities.equal(gp1, diffCoords));

        GeneralPath empty1 = new GeneralPath();
        GeneralPath empty2 = new GeneralPath();
        assertTrue(ShapeUtilities.equal(empty1, empty2));
    }

    @Test
    public void testCreateTranslatedShape_offsets() {
        Rectangle2D base = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);
        Shape translated = ShapeUtilities.createTranslatedShape(base, 5.0, -10.0);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(15.0, bounds.getX(), 1e-6);
        assertEquals(10.0, bounds.getY(), 1e-6);
        assertEquals(30.0, bounds.getWidth(), 1e-6);
        assertEquals(40.0, bounds.getHeight(), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_offsets_nullShape() {
        ShapeUtilities.createTranslatedShape(null, 1.0, 1.0);
    }

    @Test
    public void testCreateTranslatedShape_anchor() {
        Rectangle2D base = new Rectangle2D.Double(0.0, 0.0, 10.0, 20.0);
        Shape translated = ShapeUtilities.createTranslatedShape(base, RectangleAnchor.CENTER, 50.0, 50.0);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(45.0, bounds.getX(), 1e-6);
        assertEquals(40.0, bounds.getY(), 1e-6);
        assertEquals(10.0, bounds.getWidth(), 1e-6);
        assertEquals(20.0, bounds.getHeight(), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_anchor_nullShape() {
        ShapeUtilities.createTranslatedShape(null, RectangleAnchor.CENTER, 10.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_anchor_nullAnchor() {
        Rectangle2D base = new Rectangle2D.Double(0.0, 0.0, 10.0, 20.0);
        ShapeUtilities.createTranslatedShape(base, null, 10.0, 10.0);
    }

    @Test
    public void testRotateShape() {
        assertNull(ShapeUtilities.rotateShape(null, Math.PI / 2, 0.0f, 0.0f));

        Rectangle2D base = new Rectangle2D.Double(0.0, 0.0, 10.0, 20.0);
        Shape rotated = ShapeUtilities.rotateShape(base, 0.0, 0.0f, 0.0f);
        assertNotNull(rotated);
        assertEquals(base.getBounds2D().getWidth(), rotated.getBounds2D().getWidth(), 1e-6);
    }

    @Test
    public void testDrawRotatedShape() {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Shape shape = new Rectangle2D.Double(10, 10, 20, 20);
        AffineTransform originalTransform = g2.getTransform();

        ShapeUtilities.drawRotatedShape(g2, shape, Math.PI / 4, 20.0f, 20.0f);

        assertEquals(originalTransform, g2.getTransform());
        g2.dispose();
    }

    @Test
    public void testCreateDiagonalCross() {
        Shape cross = ShapeUtilities.createDiagonalCross(10.0f, 2.0f);
        assertNotNull(cross);
        Rectangle2D bounds = cross.getBounds2D();
        assertTrue(bounds.getWidth() > 0);
        assertTrue(bounds.getHeight() > 0);
    }

    @Test
    public void testCreateRegularCross() {
        Shape cross = ShapeUtilities.createRegularCross(10.0f, 2.0f);
        assertNotNull(cross);
        Rectangle2D bounds = cross.getBounds2D();
        assertTrue(bounds.getWidth() > 0);
        assertTrue(bounds.getHeight() > 0);
    }

    @Test
    public void testCreateDiamond() {
        Shape diamond = ShapeUtilities.createDiamond(10.0f);
        assertNotNull(diamond);
        Rectangle2D bounds = diamond.getBounds2D();
        assertEquals(-10.0, bounds.getX(), 1e-6);
        assertEquals(-10.0, bounds.getY(), 1e-6);
        assertEquals(20.0, bounds.getWidth(), 1e-6);
        assertEquals(20.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateUpTriangle() {
        Shape triangle = ShapeUtilities.createUpTriangle(10.0f);
        assertNotNull(triangle);
        Rectangle2D bounds = triangle.getBounds2D();
        assertEquals(-10.0, bounds.getX(), 1e-6);
        assertEquals(-10.0, bounds.getY(), 1e-6);
        assertEquals(20.0, bounds.getWidth(), 1e-6);
        assertEquals(20.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateDownTriangle() {
        Shape triangle = ShapeUtilities.createDownTriangle(10.0f);
        assertNotNull(triangle);
        Rectangle2D bounds = triangle.getBounds2D();
        assertEquals(-10.0, bounds.getX(), 1e-6);
        assertEquals(-10.0, bounds.getY(), 1e-6);
        assertEquals(20.0, bounds.getWidth(), 1e-6);
        assertEquals(20.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateLineRegion_nonVertical() {
        Line2D line = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Shape region = ShapeUtilities.createLineRegion(line, 2.0f);
        assertNotNull(region);
        assertTrue(region.getBounds2D().getWidth() > 0);
        assertTrue(region.getBounds2D().getHeight() > 0);
    }

    @Test
    public void testCreateLineRegion_vertical() {
        Line2D line = new Line2D.Double(5.0, 0.0, 5.0, 20.0);
        Shape region = ShapeUtilities.createLineRegion(line, 4.0f);
        assertNotNull(region);
        Rectangle2D bounds = region.getBounds2D();
        assertEquals(3.0, bounds.getX(), 1e-6);
        assertEquals(0.0, bounds.getY(), 1e-6);
        assertEquals(4.0, bounds.getWidth(), 1e-6);
        assertEquals(20.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testGetPointInRectangle() {
        Rectangle2D rect = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);

        Point2D inside = ShapeUtilities.getPointInRectangle(20.0, 30.0, rect);
        assertEquals(20.0, inside.getX(), 1e-6);
        assertEquals(30.0, inside.getY(), 1e-6);

        Point2D minClamp = ShapeUtilities.getPointInRectangle(0.0, 0.0, rect);
        assertEquals(10.0, minClamp.getX(), 1e-6);
        assertEquals(20.0, minClamp.getY(), 1e-6);

        Point2D maxClamp = ShapeUtilities.getPointInRectangle(100.0, 100.0, rect);
        assertEquals(40.0, maxClamp.getX(), 1e-6);
        assertEquals(60.0, maxClamp.getY(), 1e-6);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPointInRectangle_nullArea() {
        ShapeUtilities.getPointInRectangle(0.0, 0.0, null);
    }

    @Test
    public void testContains() {
        Rectangle2D r1 = new Rectangle2D.Double(0.0, 0.0, 100.0, 100.0);

        assertTrue(ShapeUtilities.contains(r1, new Rectangle2D.Double(10.0, 10.0, 50.0, 50.0)));
        assertTrue(ShapeUtilities.contains(r1, new Rectangle2D.Double(0.0, 0.0, 100.0, 100.0)));
        assertTrue(ShapeUtilities.contains(r1, new Rectangle2D.Double(10.0, 10.0, 0.0, 0.0)));

        assertFalse(ShapeUtilities.contains(r1, new Rectangle2D.Double(-5.0, 10.0, 20.0, 20.0)));
        assertFalse(ShapeUtilities.contains(r1, new Rectangle2D.Double(10.0, -5.0, 20.0, 20.0)));
        assertFalse(ShapeUtilities.contains(r1, new Rectangle2D.Double(90.0, 10.0, 20.0, 20.0)));
        assertFalse(ShapeUtilities.contains(r1, new Rectangle2D.Double(10.0, 90.0, 20.0, 20.0)));
    }

    @Test
    public void testIntersects() {
        Rectangle2D r1 = new Rectangle2D.Double(10.0, 10.0, 100.0, 100.0);

        assertTrue(ShapeUtilities.intersects(r1, new Rectangle2D.Double(50.0, 50.0, 20.0, 20.0)));
        assertTrue(ShapeUtilities.intersects(r1, new Rectangle2D.Double(0.0, 0.0, 20.0, 20.0)));
        assertTrue(ShapeUtilities.intersects(r1, new Rectangle2D.Double(110.0, 110.0, 20.0, 20.0)));

        assertFalse(ShapeUtilities.intersects(r1, new Rectangle2D.Double(0.0, 0.0, 5.0, 5.0)));
        assertFalse(ShapeUtilities.intersects(r1, new Rectangle2D.Double(50.0, 0.0, 10.0, 5.0)));
        assertFalse(ShapeUtilities.intersects(r1, new Rectangle2D.Double(120.0, 50.0, 10.0, 10.0)));
        assertFalse(ShapeUtilities.intersects(r1, new Rectangle2D.Double(50.0, 120.0, 10.0, 10.0)));
    }
}
