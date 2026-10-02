import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.List;

public class SubLineTest {

    private static final double EPS = 1.0e-10;

    private Line xAxisLine;

    @Before
    public void setUp() {
        xAxisLine = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
    }

    // ---------- Constructor(Vector3D, Vector3D) tests ----------

    @Test
    public void testConstructorFromPoints_normalInput_createsValidSubLine() {
        Vector3D start = new Vector3D(0, 0, 0);
        Vector3D end   = new Vector3D(1, 0, 0);
        SubLine subLine = new SubLine(start, end);
        List<Segment> segments = subLine.getSegments();
        assertNotNull(segments);
        assertEquals(1, segments.size());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorFromPoints_equalPoints_throwsException() {
        Vector3D p = new Vector3D(1, 1, 1);
        new SubLine(p, p);
    }

    // ---------- Constructor(Segment) tests ----------

    @Test
    public void testConstructorFromSegment_normalInput_createsValidSubLine() {
        Vector3D start = new Vector3D(0, 0, 0);
        Vector3D end   = new Vector3D(2, 0, 0);
        Segment segment = new Segment(start, end, xAxisLine);
        SubLine subLine = new SubLine(segment);
        List<Segment> segments = subLine.getSegments();
        assertNotNull(segments);
        assertEquals(1, segments.size());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorFromSegment_equalEndpoints_throwsException() {
        Vector3D p = new Vector3D(3, 3, 3);
        Segment segment = new Segment(p, p, xAxisLine);
        new SubLine(segment);
    }

    // ---------- Constructor(Line, IntervalsSet) tests ----------

    @Test
    public void testConstructorFromLineAndIntervalsSet_normalInput_createsValidSubLine() {
        IntervalsSet intervalsSet = new IntervalsSet(0.0, 1.0);
        SubLine subLine = new SubLine(xAxisLine, intervalsSet);
        List<Segment> segments = subLine.getSegments();
        assertNotNull(segments);
        assertEquals(1, segments.size());
    }

    // ---------- getSegments() tests ----------

    @Test
    public void testGetSegments_boundedInterval_returnsCorrectEndpoints() {
        Vector3D start = new Vector3D(0, 0, 0);
        Vector3D end   = new Vector3D(2, 0, 0);
        SubLine subLine = new SubLine(start, end);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
        Segment segment = segments.get(0);
        assertEquals(0.0, segment.getStart().getX(), EPS);
        assertEquals(2.0, segment.getEnd().getX(), EPS);
    }

    @Test
    public void testGetSegments_wholeLine_returnsInfiniteEndpoints() {
        IntervalsSet wholeLine = new IntervalsSet();
        SubLine subLine = new SubLine(xAxisLine, wholeLine);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
        Segment segment = segments.get(0);
        boolean startInfinite = Double.isInfinite(segment.getStart().getX())
                || Double.isInfinite(segment.getStart().getY())
                || Double.isInfinite(segment.getStart().getZ());
        boolean endInfinite = Double.isInfinite(segment.getEnd().getX())
                || Double.isInfinite(segment.getEnd().getY())
                || Double.isInfinite(segment.getEnd().getZ());
        assertTrue(startInfinite || endInfinite);
    }

    // ---------- intersection() tests ----------

    @Test
    public void testIntersection_includeEndPointsTrue_insideIntersection_returnsPoint() {
        SubLine sub1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine sub2 = new SubLine(new Vector3D(0.5, -1, 0), new Vector3D(0.5, 1, 0));

        Vector3D intersection = sub1.intersection(sub2, true);
        assertNotNull(intersection);
        assertEquals(0.5, intersection.getX(), EPS);
        assertEquals(0.0, intersection.getY(), EPS);
        assertEquals(0.0, intersection.getZ(), EPS);
    }

    @Test
    public void testIntersection_includeEndPointsFalse_insideIntersection_returnsPoint() {
        SubLine sub1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine sub2 = new SubLine(new Vector3D(0.5, -1, 0), new Vector3D(0.5, 1, 0));

        Vector3D intersection = sub1.intersection(sub2, false);
        assertNotNull(intersection);
        assertEquals(0.5, intersection.getX(), EPS);
        assertEquals(0.0, intersection.getY(), EPS);
        assertEquals(0.0, intersection.getZ(), EPS);
    }

    @Test
    public void testIntersection_boundaryPointIncludeEndPointsTrue_returnsPoint() {
        SubLine sub1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine sub2 = new SubLine(new Vector3D(2, -1, 0), new Vector3D(2, 1, 0));

        Vector3D intersection = sub1.intersection(sub2, true);
        assertNotNull(intersection);
        assertEquals(2.0, intersection.getX(), EPS);
        assertEquals(0.0, intersection.getY(), EPS);
    }

    @Test
    public void testIntersection_boundaryPointIncludeEndPointsFalse_returnsNull() {
        SubLine sub1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        SubLine sub2 = new SubLine(new Vector3D(2, -1, 0), new Vector3D(2, 1, 0));

        Vector3D intersection = sub1.intersection(sub2, false);
        assertNull(intersection);
    }

    @Test
    public void testIntersection_outsideBothRanges_returnsNull() {
        SubLine sub1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine sub2 = new SubLine(new Vector3D(5, -1, 0), new Vector3D(5, 1, 0));

        Vector3D intersection = sub1.intersection(sub2, true);
        assertNull(intersection);
    }

    @Test(expected = NullPointerException.class)
    public void testIntersection_parallelLines_throwsNullPointerException() {
        SubLine sub1 = new SubLine(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine sub2 = new SubLine(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));

        sub1.intersection(sub2, true);
    }
}
