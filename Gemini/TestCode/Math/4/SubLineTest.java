package org.apache.commons.math3.geometry.euclidean.threed;

import java.util.List;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.junit.Assert;
import org.junit.Test;

public class SubLineTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void testConstructor_LineAndIntervalsSet() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet region = new IntervalsSet(0.0, 2.0);
        SubLine subLine = new SubLine(line, region);

        List<Segment> segments = subLine.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(0.0, segments.get(0).getStart().distance(new Vector3D(0, 0, 0)), EPSILON);
        Assert.assertEquals(0.0, segments.get(0).getEnd().distance(new Vector3D(2, 0, 0)), EPSILON);
    }

    @Test
    public void testConstructor_StartAndEndPoints() {
        Vector3D start = new Vector3D(1, 2, 3);
        Vector3D end = new Vector3D(4, 5, 6);
        SubLine subLine = new SubLine(start, end);

        List<Segment> segments = subLine.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(0.0, segments.get(0).getStart().distance(start), EPSILON);
        Assert.assertEquals(0.0, segments.get(0).getEnd().distance(end), EPSILON);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_CoincidentPoints_ThrowsException() {
        Vector3D point = new Vector3D(1, 2, 3);
        new SubLine(point, point);
    }

    @Test
    public void testConstructor_Segment() {
        Vector3D start = new Vector3D(-1, -2, -3);
        Vector3D end = new Vector3D(2, 3, 4);
        Line line = new Line(start, end);
        Segment segment = new Segment(start, end, line);
        SubLine subLine = new SubLine(segment);

        List<Segment> segments = subLine.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(0.0, segments.get(0).getStart().distance(start), EPSILON);
        Assert.assertEquals(0.0, segments.get(0).getEnd().distance(end), EPSILON);
    }

    @Test
    public void testGetSegments_InfiniteLine() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet region = new IntervalsSet();
        SubLine subLine = new SubLine(line, region);

        List<Segment> segments = subLine.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertTrue(Double.isInfinite(segments.get(0).getStart().getX()));
        Assert.assertTrue(Double.isInfinite(segments.get(0).getEnd().getX()));
    }

    @Test
    public void testGetSegments_MultipleIntervals() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet region = new IntervalsSet(-10.0, -5.0);
        region = (IntervalsSet) region.union(new IntervalsSet(5.0, 10.0));
        SubLine subLine = new SubLine(line, region);

        List<Segment> segments = subLine.getSegments();
        Assert.assertEquals(2, segments.size());
    }

    @Test
    public void testIntersection_BothInside_IncludeEndPointsTrue() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, -1, 0), new Vector3D(1, 1, 0));

        Vector3D intersection = subLine1.intersection(subLine2, true);
        Assert.assertNotNull(intersection);
        Assert.assertEquals(0.0, intersection.distance(new Vector3D(1, 0, 0)), EPSILON);
    }

    @Test
    public void testIntersection_BothInside_IncludeEndPointsFalse() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, -1, 0), new Vector3D(1, 1, 0));

        Vector3D intersection = subLine1.intersection(subLine2, false);
        Assert.assertNotNull(intersection);
        Assert.assertEquals(0.0, intersection.distance(new Vector3D(1, 0, 0)), EPSILON);
    }

    @Test
    public void testIntersection_BoundaryAndInside_IncludeEndPointsTrue() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 0, 0), new Vector3D(1, 2, 0));

        Vector3D intersection = subLine1.intersection(subLine2, true);
        Assert.assertNotNull(intersection);
        Assert.assertEquals(0.0, intersection.distance(new Vector3D(1, 0, 0)), EPSILON);
    }

    @Test
    public void testIntersection_BoundaryAndInside_IncludeEndPointsFalse() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 0, 0), new Vector3D(1, 2, 0));

        Vector3D intersection = subLine1.intersection(subLine2, false);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_InsideAndBoundary_IncludeEndPointsFalse() {
        SubLine subLine1 = new SubLine(new Vector3D(1, 0, 0), new Vector3D(1, 2, 0));
        SubLine subLine2 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));

        Vector3D intersection = subLine1.intersection(subLine2, false);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_BothBoundary_IncludeEndPointsTrue() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 0, 0), new Vector3D(1, 1, 0));

        Vector3D intersection = subLine1.intersection(subLine2, true);
        Assert.assertNotNull(intersection);
        Assert.assertEquals(0.0, intersection.distance(new Vector3D(1, 0, 0)), EPSILON);
    }

    @Test
    public void testIntersection_BothBoundary_IncludeEndPointsFalse() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 0, 0), new Vector3D(1, 1, 0));

        Vector3D intersection = subLine1.intersection(subLine2, false);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_FirstOutsideSecondInside_IncludeEndPointsTrue() {
        SubLine subLine1 = new SubLine(new Vector3D(3, 0, 0), new Vector3D(5, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, -1, 0), new Vector3D(1, 1, 0));

        Vector3D intersection = subLine1.intersection(subLine2, true);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_FirstInsideSecondOutside_IncludeEndPointsTrue() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 2, 0), new Vector3D(1, 4, 0));

        Vector3D intersection = subLine1.intersection(subLine2, true);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_FirstOutsideSecondInside_IncludeEndPointsFalse() {
        SubLine subLine1 = new SubLine(new Vector3D(3, 0, 0), new Vector3D(5, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, -1, 0), new Vector3D(1, 1, 0));

        Vector3D intersection = subLine1.intersection(subLine2, false);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_FirstInsideSecondOutside_IncludeEndPointsFalse() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 2, 0), new Vector3D(1, 4, 0));

        Vector3D intersection = subLine1.intersection(subLine2, false);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_BothOutside_IncludeEndPointsTrue() {
        SubLine subLine1 = new SubLine(new Vector3D(3, 0, 0), new Vector3D(5, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 2, 0), new Vector3D(1, 4, 0));

        Vector3D intersection = subLine1.intersection(subLine2, true);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersection_BothOutside_IncludeEndPointsFalse() {
        SubLine subLine1 = new SubLine(new Vector3D(3, 0, 0), new Vector3D(5, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(1, 2, 0), new Vector3D(1, 4, 0));

        Vector3D intersection = subLine1.intersection(subLine2, false);
        Assert.assertNull(intersection);
    }

    @Test(expected = NullPointerException.class)
    public void testIntersection_ParallelLines_ThrowsNullPointerException() {
        SubLine subLine1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine2 = new SubLine(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));

        subLine1.intersection(subLine2, true);
    }
}
