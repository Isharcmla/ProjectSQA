import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jfree.chart.util.ShapeUtilities;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ObjectUtilities;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class ShapeUtilitiesTest {

    // ---------------------- clone() ----------------------

    @Test
    public void testClone_lineShape_returnsClonedEqualLine() {
        Line2D line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape cloned = ShapeUtilities.clone(line);
        assertNotNull(cloned);
        assertTrue(cloned instanceof Line2D);
        assertNotSame(line, cloned);
        assertTrue(ShapeUtilities.equal(line, (Line2D) cloned));
    }

    @Test
    public void testClone_nullShape_returnsNull() {
        Shape cloned = ShapeUtilities.clone(null);
        assertNull(cloned);
    }

    @Test
    public void testClone_nonCloneableShape_returnsNull() {
        // Polygon does not implement Cloneable
        Polygon p = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Shape cloned = ShapeUtilities.clone(p);
        assertNull(cloned);
    }

    // ---------------------- equal(Shape, Shape) ----------------------

    @Test
    public void testEqualShape_bothLines_returnsTrueWhenEqual() {
        Line2D l1 = new Line2D.Double(0, 0, 10, 10);
        Line2D l2 = new Line2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.equal((Shape) l1, (Shape) l2));
    }

    @Test
    public void testEqualShape_bothEllipses_returnsTrueWhenEqual() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 10, 10);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.equal((Shape) e1, (Shape) e2));
    }

    @Test
    public void testEqualShape_bothArcs_returnsTrueWhenEqual() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal((Shape) a1, (Shape) a2));
    }

    @Test
    public void testEqualShape_bothPolygons_returnsTrueWhenEqual() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertTrue(ShapeUtilities.equal((Shape) p1, (Shape) p2));
    }

    @Test
    public void testEqualShape_bothGeneralPaths_returnsTrueWhenEqual() {
        GeneralPath g1 = new GeneralPath();
        g1.moveTo(0, 0);
        g1.lineTo(10, 10);
        GeneralPath g2 = new GeneralPath();
        g2.moveTo(0, 0);
        g2.lineTo(10, 10);
        assertTrue(ShapeUtilities.equal((Shape) g1, (Shape) g2));
    }

    @Test
    public void testEqualShape_rectangles_delegatesToObjectUtilities() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D r2 = new Rectangle2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.equal((Shape) r1, (Shape) r2));
    }

    @Test
    public void testEqualShape_bothNullShapes_returnsTrue() {
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
    }

    // ---------------------- equal(Line2D, Line2D) ----------------------

    @Test
    public void testEqualLine_bothNull_returnsTrue() {
        assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
    }

    @Test
    public void testEqualLine_firstNullSecondNotNull_returnsFalse() {
        Line2D l2 = new Line2D.Double(0, 0, 1, 1);
        assertFalse(ShapeUtilities.equal((Line2D) null, l2));
    }

    @Test
    public void testEqualLine_secondNull_returnsFalse() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        assertFalse(ShapeUtilities.equal(l1, (Line2D) null));
    }

    @Test
    public void testEqualLine_differentP1_returnsFalse() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(5, 5, 1, 1);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine_differentP2_returnsFalse() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(0, 0, 9, 9);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine_equalLines_returnsTrue() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(0, 0, 1, 1);
        assertTrue(ShapeUtilities.equal(l1, l2));
    }

    // ---------------------- equal(Ellipse2D, Ellipse2D) ----------------------

    @Test
    public void testEqualEllipse_bothNull_returnsTrue() {
        assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));
    }

    @Test
    public void testEqualEllipse_firstNull_returnsFalse() {
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 5, 5);
        assertFalse(ShapeUtilities.equal((Ellipse2D) null, e2));
    }

    @Test
    public void testEqualEllipse_secondNull_returnsFalse() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 5, 5);
        assertFalse(ShapeUtilities.equal(e1, (Ellipse2D) null));
    }

    @Test
    public void testEqualEllipse_differentFrame_returnsFalse() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 5, 5);
        Ellipse2D e2 = new Ellipse2D.Double(1, 1, 5, 5);
        assertFalse(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void testEqualEllipse_equalEllipses_returnsTrue() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 5, 5);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 5, 5);
        assertTrue(ShapeUtilities.equal(e1, e2));
    }

    // ---------------------- equal(Arc2D, Arc2D) ----------------------

    @Test
    public void testEqualArc_bothNull_returnsTrue() {
        assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
    }

    @Test
    public void testEqualArc_firstNull_returnsFalse() {
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal((Arc2D) null, a2));
    }

    @Test
    public void testEqualArc_secondNull_returnsFalse() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, (Arc2D) null));
    }

    @Test
    public void testEqualArc_differentFrame_returnsFalse() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(1, 1, 10, 10, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_differentAngleStart_returnsFalse() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 10, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_differentAngleExtent_returnsFalse() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 45, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_differentArcType_returnsFalse() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.CHORD);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_equalArcs_returnsTrue() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal(a1, a2));
    }

    // ---------------------- equal(Polygon, Polygon) ----------------------

    @Test
    public void testEqualPolygon_bothNull_returnsTrue() {
        assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
    }

    @Test
    public void testEqualPolygon_firstNull_returnsFalse() {
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertFalse(ShapeUtilities.equal((Polygon) null, p2));
    }

    @Test
    public void testEqualPolygon_secondNull_returnsFalse() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertFalse(ShapeUtilities.equal(p1, (Polygon) null));
    }

    @Test
    public void testEqualPolygon_differentNpoints_returnsFalse() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1}, new int[]{0, 1}, 2);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygon_differentXpoints_returnsFalse() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 9, 2}, new int[]{0, 1, 2}, 3);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygon_differentYpoints_returnsFalse() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 9, 2}, 3);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygon_equalPolygons_returnsTrue() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertTrue(ShapeUtilities.equal(p1, p2));
    }

    // ---------------------- equal(GeneralPath, GeneralPath) ----------------------

    @Test
    public void testEqualGeneralPath_bothNull_returnsTrue() {
        assertTrue(ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null));
    }

    @Test
    public void testEqualGeneralPath_firstNull_returnsFalse() {
        GeneralPath g2 = new GeneralPath();
        g2.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal((GeneralPath) null, g2));
    }

    @Test
    public void testEqualGeneralPath_secondNull_returnsFalse() {
        GeneralPath g1 = new GeneralPath();
        g1.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal(g1, (GeneralPath) null));
    }

    @Test
    public void testEqualGeneralPath_differentWindingRule_returnsFalse() {
        GeneralPath g1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        g1.moveTo(0, 0);
        GeneralPath g2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        g2.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal(g1, g2));
    }

    @Test
    public void testEqualGeneralPath_equalPaths_returnsTrue() {
        GeneralPath g1 = new GeneralPath();
        g1.moveTo(0, 0);
        g1.lineTo(10, 10);
        g1.closePath();
        GeneralPath g2 = new GeneralPath();
        g2.moveTo(0, 0);
        g2.lineTo(10, 10);
        g2.closePath();
        assertTrue(ShapeUtilities.equal(g1, g2));
    }

    // ---------------------- createTranslatedShape(Shape, double, double) ----------------------

    @Test
    public void testCreateTranslatedShape_normal_translatesCorrectly() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape result = ShapeUtilities.createTranslatedShape(rect, 5.0, 5.0);
        Rectangle2D bounds = result.getBounds2D();
        assertEquals(5.0, bounds.getX(), 0.0001);
        assertEquals(5.0, bounds.getY(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_nullShape_throwsException() {
        ShapeUtilities.createTranslatedShape(null, 1.0, 1.0);
    }

    // ---------------------- createTranslatedShape(Shape, RectangleAnchor, double, double) ----------------------

    @Test
    public void testCreateTranslatedShapeAnchor_normal_translatesCorrectly() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape result = ShapeUtilities.createTranslatedShape(rect,
                RectangleAnchor.CENTER, 100.0, 100.0);
        assertNotNull(result);
        Rectangle2D bounds = result.getBounds2D();
        assertEquals(100.0, bounds.getCenterX(), 0.0001);
        assertEquals(100.0, bounds.getCenterY(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeAnchor_nullShape_throwsException() {
        ShapeUtilities.createTranslatedShape(null, RectangleAnchor.CENTER,
                1.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeAnchor_nullAnchor_throwsException() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        ShapeUtilities.createTranslatedShape(rect, null, 1.0, 1.0);
    }

    // ---------------------- rotateShape ----------------------

    @Test
    public void testRotateShape_nullShape_returnsNull() {
        Shape result = ShapeUtilities.rotateShape(null, Math.PI / 2, 0f, 0f);
        assertNull(result);
    }

    @Test
    public void testRotateShape_normal_returnsRotatedShape() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape result = ShapeUtilities.rotateShape(rect, Math.PI / 2, 0f, 0f);
        assertNotNull(result);
        assertNotSame(rect, result);
    }

    // ---------------------- drawRotatedShape ----------------------

    @Test
    public void testDrawRotatedShape_normal_restoresTransform() {
        BufferedImage image = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        AffineTransform originalTransform = g2.getTransform();
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        ShapeUtilities.drawRotatedShape(g2, rect, Math.PI / 4, 5f, 5f);
        assertEquals(originalTransform, g2.getTransform());
        g2.dispose();
    }

    // ---------------------- createDiagonalCross ----------------------

    @Test
    public void testCreateDiagonalCross_normal_returnsNonNullShape() {
        Shape shape = ShapeUtilities.createDiagonalCross(5f, 1f);
        assertNotNull(shape);
        assertFalse(shape.getBounds2D().isEmpty());
    }

    // ---------------------- createRegularCross ----------------------

    @Test
    public void testCreateRegularCross_normal_returnsNonNullShape() {
        Shape shape = ShapeUtilities.createRegularCross(5f, 1f);
        assertNotNull(shape);
        assertFalse(shape.getBounds2D().isEmpty());
    }

    // ---------------------- createDiamond ----------------------

    @Test
    public void testCreateDiamond_normal_returnsNonNullShape() {
        Shape shape = ShapeUtilities.createDiamond(5f);
        assertNotNull(shape);
        assertFalse(shape.getBounds2D().isEmpty());
    }

    // ---------------------- createUpTriangle ----------------------

    @Test
    public void testCreateUpTriangle_normal_returnsNonNullShape() {
        Shape shape = ShapeUtilities.createUpTriangle(5f);
        assertNotNull(shape);
        assertFalse(shape.getBounds2D().isEmpty());
    }

    // ---------------------- createDownTriangle ----------------------

    @Test
    public void testCreateDownTriangle_normal_returnsNonNullShape() {
        Shape shape = ShapeUtilities.createDownTriangle(5f);
        assertNotNull(shape);
        assertFalse(shape.getBounds2D().isEmpty());
    }

    // ---------------------- createLineRegion ----------------------

    @Test
    public void testCreateLineRegion_diagonalLine_returnsNonNullShape() {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2f);
        assertNotNull(region);
        assertFalse(region.getBounds2D().isEmpty());
    }

    @Test
    public void testCreateLineRegion_verticalLine_returnsNonNullShape() {
        Line2D line = new Line2D.Double(5, 0, 5, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2f);
        assertNotNull(region);
        assertFalse(region.getBounds2D().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testCreateLineRegion_nullLine_throwsException() {
        ShapeUtilities.createLineRegion(null, 2f);
    }

    // ---------------------- getPointInRectangle ----------------------

    @Test
    public void testGetPointInRectangle_pointInside_returnsSamePoint() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, 5, area);
        assertEquals(5.0, p.getX(), 0.0001);
        assertEquals(5.0, p.getY(), 0.0001);
    }

    @Test
    public void testGetPointInRectangle_pointOutsideBelowMin_returnsMinBound() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(-5, -5, area);
        assertEquals(0.0, p.getX(), 0.0001);
        assertEquals(0.0, p.getY(), 0.0001);
    }

    @Test
    public void testGetPointInRectangle_pointOutsideAboveMax_returnsMaxBound() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(50, 50, area);
        assertEquals(10.0, p.getX(), 0.0001);
        assertEquals(10.0, p.getY(), 0.0001);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPointInRectangle_nullArea_throwsException() {
        ShapeUtilities.getPointInRectangle(5, 5, null);
    }

    // ---------------------- contains(Rectangle2D, Rectangle2D) ----------------------

    @Test
    public void testContains_rect1ContainsRect2_returnsTrue() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 20, 20);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 5, 5);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_rect2OutsideRect1_returnsFalse() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 20, 20);
        Rectangle2D rect2 = new Rectangle2D.Double(15, 15, 10, 10);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_rect2ZeroSizeInside_returnsTrue() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 20, 20);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 0, 0);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_rect2BeforeOrigin_returnsFalse() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 20, 20);
        Rectangle2D rect2 = new Rectangle2D.Double(-5, -5, 5, 5);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    // ---------------------- intersects(Rectangle2D, Rectangle2D) ----------------------

    @Test
    public void testIntersects_overlappingRectangles_returnsTrue() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 20, 20);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 20, 20);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersects_nonOverlappingRectangles_returnsFalse() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(50, 50, 10, 10);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersects_touchingRectangles_returnsTrue() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 10, 10);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }
}
