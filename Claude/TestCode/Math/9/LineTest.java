import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.util.FastMath;

public class LineTest {

    private static final double EPS = 1.0e-10;

    private Line line;
    private Vector3D p1;
    private Vector3D p2;

    @Before
    public void setUp() {
        p1 = new Vector3D(0, 0, 0);
        p2 = new Vector3D(1, 0, 0);
        line = new Line(p1, p2);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalPoints_createsLine() {
        Line l = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 1, 1));
        assertNotNull(l.getDirection());
        assertNotNull(l.getOrigin());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_equalPoints_throwsException() {
        Vector3D p = new Vector3D(1, 2, 3);
        new Line(p, new Vector3D(1, 2, 3));
    }

    @Test
    public void testCopyConstructor_copiesFields_sameValues() {
        Line copy = new Line(line);
        assertEquals(line.getDirection(), copy.getDirection());
        assertEquals(line.getOrigin(), copy.getOrigin());
    }

    // ---------- reset ----------

    @Test
    public void testReset_normalPoints_updatesLine() {
        Line l = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        l.reset(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        assertEquals(0.0, l.getDirection().getX(), EPS);
        assertEquals(1.0, l.getDirection().getY(), EPS);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testReset_equalPoints_throwsException() {
        Line l = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        l.reset(new Vector3D(5, 5, 5), new Vector3D(5, 5, 5));
    }

    // ---------- revert ----------

    @Test
    public void testRevert_reversesDirection_negatedDirection() {
        Line reverted = line.revert();
        assertEquals(-line.getDirection().getX(), reverted.getDirection().getX(), EPS);
        assertEquals(-line.getDirection().getY(), reverted.getDirection().getY(), EPS);
        assertEquals(-line.getDirection().getZ(), reverted.getDirection().getZ(), EPS);
    }

    // ---------- getDirection / getOrigin ----------

    @Test
    public void testGetDirection_normalLine_returnsNormalizedVector() {
        Vector3D dir = line.getDirection();
        assertEquals(1.0, dir.getNorm(), EPS);
    }

    @Test
    public void testGetOrigin_normalLine_returnsClosestPointToOrigin() {
        Vector3D origin = line.getOrigin();
        assertEquals(0.0, origin.getX(), EPS);
        assertEquals(0.0, origin.getY(), EPS);
        assertEquals(0.0, origin.getZ(), EPS);
    }

    @Test
    public void testGetOrigin_lineNotThroughOrigin_returnsProjection() {
        Line l = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        Vector3D origin = l.getOrigin();
        assertEquals(0.0, origin.getX(), EPS);
        assertEquals(1.0, origin.getY(), EPS);
        assertEquals(0.0, origin.getZ(), EPS);
    }

    // ---------- getAbscissa ----------

    @Test
    public void testGetAbscissa_pointOnLine_returnsCorrectValue() {
        double abscissa = line.getAbscissa(new Vector3D(5, 0, 0));
        assertEquals(5.0, abscissa, EPS);
    }

    @Test
    public void testGetAbscissa_originPoint_returnsZero() {
        double abscissa = line.getAbscissa(new Vector3D(0, 0, 0));
        assertEquals(0.0, abscissa, EPS);
    }

    @Test
    public void testGetAbscissa_negativeDirection_returnsNegativeValue() {
        double abscissa = line.getAbscissa(new Vector3D(-3, 0, 0));
        assertEquals(-3.0, abscissa, EPS);
    }

    // ---------- pointAt ----------

    @Test
    public void testPointAt_positiveAbscissa_returnsCorrectPoint() {
        Vector3D point = line.pointAt(5.0);
        assertEquals(5.0, point.getX(), EPS);
        assertEquals(0.0, point.getY(), EPS);
        assertEquals(0.0, point.getZ(), EPS);
    }

    @Test
    public void testPointAt_zeroAbscissa_returnsOrigin() {
        Vector3D point = line.pointAt(0.0);
        assertEquals(line.getOrigin(), point);
    }

    // ---------- toSubSpace / toSpace ----------

    @Test
    public void testToSubSpace_pointOnLine_returnsCorrectVector1D() {
        Vector1D v1d = line.toSubSpace(new Vector3D(3, 0, 0));
        assertEquals(3.0, v1d.getX(), EPS);
    }

    @Test
    public void testToSpace_abscissaValue_returnsCorrectVector3D() {
        Vector3D point = line.toSpace(new Vector1D(4.0));
        assertEquals(4.0, point.getX(), EPS);
        assertEquals(0.0, point.getY(), EPS);
        assertEquals(0.0, point.getZ(), EPS);
    }

    // ---------- isSimilarTo ----------

    @Test
    public void testIsSimilarTo_sameLine_returnsTrue() {
        Line other = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        assertTrue(line.isSimilarTo(other));
    }

    @Test
    public void testIsSimilarTo_oppositeDirection_returnsTrue() {
        Line other = new Line(new Vector3D(1, 0, 0), new Vector3D(0, 0, 0));
        assertTrue(line.isSimilarTo(other));
    }

    @Test
    public void testIsSimilarTo_differentLine_returnsFalse() {
        Line other = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        assertFalse(line.isSimilarTo(other));
    }

    @Test
    public void testIsSimilarTo_differentDirectionButSamePoint_returnsFalse() {
        Line other = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        assertFalse(line.isSimilarTo(other));
    }

    // ---------- contains ----------

    @Test
    public void testContains_pointOnLine_returnsTrue() {
        assertTrue(line.contains(new Vector3D(10, 0, 0)));
    }

    @Test
    public void testContains_pointNotOnLine_returnsFalse() {
        assertFalse(line.contains(new Vector3D(0, 1, 0)));
    }

    @Test
    public void testContains_originPoint_returnsTrue() {
        assertTrue(line.contains(new Vector3D(0, 0, 0)));
    }

    // ---------- distance(point) ----------

    @Test
    public void testDistance_pointOnLine_returnsZero() {
        double d = line.distance(new Vector3D(5, 0, 0));
        assertEquals(0.0, d, EPS);
    }

    @Test
    public void testDistance_pointOffLine_returnsPositiveDistance() {
        double d = line.distance(new Vector3D(0, 3, 0));
        assertEquals(3.0, d, EPS);
    }

    @Test
    public void testDistance_pointOffLine3D_returnsCorrectDistance() {
        double d = line.distance(new Vector3D(0, 3, 4));
        assertEquals(5.0, d, EPS);
    }

    // ---------- distance(line) ----------

    @Test
    public void testDistanceLine_intersectingLines_returnsZero() {
        Line other = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        double d = line.distance(other);
        assertEquals(0.0, d, EPS);
    }

    @Test
    public void testDistanceLine_parallelLines_returnsCorrectDistance() {
        Line other = new Line(new Vector3D(0, 2, 0), new Vector3D(1, 2, 0));
        double d = line.distance(other);
        assertEquals(2.0, d, EPS);
    }

    @Test
    public void testDistanceLine_skewLines_returnsCorrectDistance() {
        Line l1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line l2 = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1));
        double d = l1.distance(l2);
        assertEquals(1.0, d, EPS);
    }

    @Test
    public void testDistanceLine_sameLine_returnsZero() {
        Line other = new Line(new Vector3D(5, 0, 0), new Vector3D(10, 0, 0));
        double d = line.distance(other);
        assertEquals(0.0, d, EPS);
    }

    // ---------- closestPoint ----------

    @Test
    public void testClosestPoint_parallelLines_returnsZeroPoint() {
        Line other = new Line(new Vector3D(0, 2, 0), new Vector3D(1, 2, 0));
        Vector3D closest = line.closestPoint(other);
        assertEquals(line.getOrigin(), closest);
    }

    @Test
    public void testClosestPoint_intersectingLines_returnsIntersection() {
        Line other = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        Vector3D closest = line.closestPoint(other);
        assertEquals(0.0, closest.getX(), EPS);
        assertEquals(0.0, closest.getY(), EPS);
        assertEquals(0.0, closest.getZ(), EPS);
    }

    @Test
    public void testClosestPoint_skewLines_returnsClosestPointOnInstance() {
        Line l1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line l2 = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1));
        Vector3D closest = l1.closestPoint(l2);
        assertEquals(0.0, closest.getX(), EPS);
        assertEquals(0.0, closest.getY(), EPS);
        assertEquals(0.0, closest.getZ(), EPS);
    }

    // ---------- intersection ----------

    @Test
    public void testIntersection_intersectingLines_returnsIntersectionPoint() {
        Line other = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        Vector3D intersection = line.intersection(other);
        assertNotNull(intersection);
        assertEquals(0.0, intersection.getX(), EPS);
        assertEquals(0.0, intersection.getY(), EPS);
        assertEquals(0.0, intersection.getZ(), EPS);
    }

    @Test
    public void testIntersection_nonIntersectingLines_returnsNull() {
        Line l1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line l2 = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1));
        Vector3D intersection = l1.intersection(l2);
        assertNull(intersection);
    }

    @Test
    public void testIntersection_parallelLines_returnsNull() {
        Line other = new Line(new Vector3D(0, 2, 0), new Vector3D(1, 2, 0));
        Vector3D intersection = line.intersection(other);
        assertNull(intersection);
    }

    // ---------- wholeLine ----------

    @Test
    public void testWholeLine_returnsSubLineCoveringAll() {
        SubLine subLine = line.wholeLine();
        assertNotNull(subLine);
    }
}
