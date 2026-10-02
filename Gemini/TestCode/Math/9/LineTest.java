package org.apache.commons.math3.geometry.euclidean.threed;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class LineTest {

    private static final double EPSILON = 1.0e-10;

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_identicalPoints_throwsMathIllegalArgumentException() {
        Vector3D p = new Vector3D(1.0, 2.0, 3.0);
        new Line(p, p);
    }

    @Test
    public void testConstructor_validPoints_createsCorrectLine() {
        Vector3D p1 = new Vector3D(1.0, 1.0, 1.0);
        Vector3D p2 = new Vector3D(1.0, 1.0, 3.0);
        Line line = new Line(p1, p2);

        Assert.assertEquals(0.0, line.getDirection().getX(), EPSILON);
        Assert.assertEquals(0.0, line.getDirection().getY(), EPSILON);
        Assert.assertEquals(1.0, line.getDirection().getZ(), EPSILON);

        Assert.assertEquals(1.0, line.getOrigin().getX(), EPSILON);
        Assert.assertEquals(1.0, line.getOrigin().getY(), EPSILON);
        Assert.assertEquals(0.0, line.getOrigin().getZ(), EPSILON);
    }

    @Test
    public void testCopyConstructor_createsIndependentDeepCopy() {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);
        Line original = new Line(p1, p2);
        Line copy = new Line(original);

        Assert.assertEquals(0.0, Vector3D.distance(original.getDirection(), copy.getDirection()), EPSILON);
        Assert.assertEquals(0.0, Vector3D.distance(original.getOrigin(), copy.getOrigin()), EPSILON);
        Assert.assertTrue(original.isSimilarTo(copy));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testReset_identicalPoints_throwsMathIllegalArgumentException() {
        Line line = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Vector3D p = new Vector3D(2.0, 2.0, 2.0);
        line.reset(p, p);
    }

    @Test
    public void testReset_validPoints_updatesLineProperties() {
        Line line = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Vector3D p1 = new Vector3D(0.0, 2.0, 0.0);
        Vector3D p2 = new Vector3D(0.0, 5.0, 0.0);
        line.reset(p1, p2);

        Assert.assertEquals(0.0, line.getDirection().getX(), EPSILON);
        Assert.assertEquals(1.0, line.getDirection().getY(), EPSILON);
        Assert.assertEquals(0.0, line.getDirection().getZ(), EPSILON);
        Assert.assertEquals(0.0, line.getOrigin().getNorm(), EPSILON);
    }

    @Test
    public void testRevert_reversesLineDirection() {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(1.0, 2.0, 10.0);
        Line line = new Line(p1, p2);
        Line reverted = line.revert();

        Assert.assertEquals(0.0, Vector3D.distance(line.getOrigin(), reverted.getOrigin()), EPSILON);
        Assert.assertEquals(0.0, line.getDirection().add(reverted.getDirection()).getNorm(), EPSILON);
        Assert.assertTrue(line.isSimilarTo(reverted));
    }

    @Test
    public void testGetAbscissa_and_PointAt() {
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(0.0, 0.0, 2.0);
        Line line = new Line(p1, p2);

        Assert.assertEquals(0.0, line.getAbscissa(new Vector3D(0.0, 0.0, 0.0)), EPSILON);
        Assert.assertEquals(5.0, line.getAbscissa(new Vector3D(0.0, 0.0, 5.0)), EPSILON);
        Assert.assertEquals(-3.0, line.getAbscissa(new Vector3D(0.0, 0.0, -3.0)), EPSILON);
        Assert.assertEquals(5.0, line.getAbscissa(new Vector3D(2.0, 3.0, 5.0)), EPSILON);

        Vector3D pointAtPositive = line.pointAt(4.5);
        Assert.assertEquals(0.0, pointAtPositive.getX(), EPSILON);
        Assert.assertEquals(0.0, pointAtPositive.getY(), EPSILON);
        Assert.assertEquals(4.5, pointAtPositive.getZ(), EPSILON);

        Vector3D pointAtNegative = line.pointAt(-2.5);
        Assert.assertEquals(0.0, pointAtNegative.getX(), EPSILON);
        Assert.assertEquals(0.0, pointAtNegative.getY(), EPSILON);
        Assert.assertEquals(-2.5, pointAtNegative.getZ(), EPSILON);
    }

    @Test
    public void testToSubSpace_and_ToSpace_roundTrip() {
        Line line = new Line(new Vector3D(1.0, 2.0, 3.0), new Vector3D(4.0, 6.0, 3.0));
        Vector3D point3D = new Vector3D(7.0, 10.0, 3.0);

        Vector1D point1D = line.toSubSpace(point3D);
        Vector3D projected3D = line.toSpace(point1D);

        Assert.assertEquals(0.0, Vector3D.distance(point3D, projected3D), EPSILON);
        Assert.assertEquals(line.getAbscissa(point3D), point1D.getX(), EPSILON);
    }

    @Test
    public void testIsSimilarTo_sameDirectionSamePoints_returnsTrue() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(5.0, 0.0, 0.0), new Vector3D(10.0, 0.0, 0.0));

        Assert.assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarTo_oppositeDirectionSamePoints_returnsTrue() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(10.0, 0.0, 0.0), new Vector3D(5.0, 0.0, 0.0));

        Assert.assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarTo_parallelDisplaced_returnsFalse() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(0.0, 1.0, 0.0), new Vector3D(1.0, 1.0, 0.0));

        Assert.assertFalse(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarTo_nonParallelIntersecting_returnsFalse() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(0.0, 1.0, 0.0));

        Assert.assertFalse(line1.isSimilarTo(line2));
    }

    @Test
    public void testContains_pointOnLine_returnsTrue() {
        Line line = new Line(new Vector3D(0.0, 1.0, 2.0), new Vector3D(0.0, 1.0, 10.0));

        Assert.assertTrue(line.contains(new Vector3D(0.0, 1.0, 5.0)));
        Assert.assertTrue(line.contains(new Vector3D(0.0, 1.0, -100.0)));
    }

    @Test
    public void testContains_pointNotOnLine_returnsFalse() {
        Line line = new Line(new Vector3D(0.0, 1.0, 2.0), new Vector3D(0.0, 1.0, 10.0));

        Assert.assertFalse(line.contains(new Vector3D(1.0, 1.0, 5.0)));
        Assert.assertFalse(line.contains(new Vector3D(0.0, 0.0, 0.0)));
    }

    @Test
    public void testDistance_toPoint() {
        Line line = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));

        Assert.assertEquals(0.0, line.distance(new Vector3D(5.0, 0.0, 0.0)), EPSILON);
        Assert.assertEquals(3.0, line.distance(new Vector3D(5.0, 3.0, 0.0)), EPSILON);
        Assert.assertEquals(5.0, line.distance(new Vector3D(2.0, 3.0, 4.0)), EPSILON);
    }

    @Test
    public void testDistance_toParallelLine() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(0.0, 4.0, 3.0), new Vector3D(1.0, 4.0, 3.0));

        Assert.assertEquals(5.0, line1.distance(line2), EPSILON);
    }

    @Test
    public void testDistance_toSameLine() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(10.0, 0.0, 0.0), new Vector3D(20.0, 0.0, 0.0));

        Assert.assertEquals(0.0, line1.distance(line2), EPSILON);
    }

    @Test
    public void testDistance_toSkewLine() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(0.0, 0.0, 2.0), new Vector3D(0.0, 1.0, 2.0));

        Assert.assertEquals(2.0, line1.distance(line2), EPSILON);
    }

    @Test
    public void testClosestPoint_parallelLines_returnsLineZero() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(0.0, 2.0, 0.0), new Vector3D(1.0, 2.0, 0.0));

        Vector3D closest = line1.closestPoint(line2);
        Assert.assertEquals(0.0, Vector3D.distance(line1.getOrigin(), closest), EPSILON);
    }

    @Test
    public void testClosestPoint_skewLines_returnsCorrectClosestPoint() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(3.0, 0.0, 5.0), new Vector3D(3.0, 1.0, 5.0));

        Vector3D closest = line1.closestPoint(line2);
        Assert.assertEquals(3.0, closest.getX(), EPSILON);
        Assert.assertEquals(0.0, closest.getY(), EPSILON);
        Assert.assertEquals(0.0, closest.getZ(), EPSILON);
    }

    @Test
    public void testIntersection_intersectingLines_returnsIntersectionPoint() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(2.0, -1.0, 0.0), new Vector3D(2.0, 1.0, 0.0));

        Vector3D intersection = line1.intersection(line2);
        Assert.assertNotNull(intersection);
        Assert.assertEquals(2.0, intersection.getX(), EPSILON);
        Assert.assertEquals(0.0, intersection.getY(), EPSILON);
        Assert.assertEquals(0.0, intersection.getZ(), EPSILON);
    }

    @Test
    public void testIntersection_parallelNonCoincidentLines_returnsNull() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(0.0, 1.0, 0.0), new Vector3D(1.0, 1.0, 0.0));

        Assert.assertNull(line1.intersection(line2));
    }

    @Test
    public void testIntersection_coincidentLines_returnsPoint() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(5.0, 0.0, 0.0), new Vector3D(10.0, 0.0, 0.0));

        Vector3D intersection = line1.intersection(line2);
        Assert.assertNotNull(intersection);
        Assert.assertTrue(line1.contains(intersection));
        Assert.assertTrue(line2.contains(intersection));
    }

    @Test
    public void testIntersection_skewLines_returnsNull() {
        Line line1 = new Line(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        Line line2 = new Line(new Vector3D(0.0, 0.0, 1.0), new Vector3D(0.0, 1.0, 1.0));

        Assert.assertNull(line1.intersection(line2));
    }

    @Test
    public void testWholeLine_returnsInfiniteSubLine() {
        Line line = new Line(new Vector3D(1.0, 2.0, 3.0), new Vector3D(2.0, 4.0, 6.0));
        SubLine subLine = line.wholeLine();

        Assert.assertNotNull(subLine);
        Assert.assertTrue(Double.isInfinite(subLine.getRemainingRegion().getSize()));
    }
}
