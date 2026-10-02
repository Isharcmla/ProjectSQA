import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Region.Location;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * JUnit 4 test suite for {@link PolygonsSet}.
 */
public class PolygonsSetTest {

    private static final double EPS = 1.0e-10;

    private PolygonsSet box;

    @Before
    public void setUp() {
        box = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
    }

    // ---------------------------------------------------------------
    // Default constructor - represents whole space
    // ---------------------------------------------------------------
    @Test
    public void testDefaultConstructor_representsWholeSpace() {
        PolygonsSet whole = new PolygonsSet();
        assertEquals(Double.POSITIVE_INFINITY, whole.getSize(), 0.0);
        Vector2D barycenter = (Vector2D) whole.getBarycenter();
        assertTrue(Double.isNaN(barycenter.getX()));
        assertTrue(Double.isNaN(barycenter.getY()));
    }

    @Test
    public void testDefaultConstructor_checkPointAlwaysInside() {
        PolygonsSet whole = new PolygonsSet();
        Location loc = whole.checkPoint(new Vector2D(123.456, -789.012));
        assertEquals(Location.INSIDE, loc);
    }

    // ---------------------------------------------------------------
    // Box constructor - normal typical input
    // ---------------------------------------------------------------
    @Test
    public void testBoxConstructor_normalBox_correctSize() {
        assertEquals(1.0, box.getSize(), EPS);
    }

    @Test
    public void testBoxConstructor_normalBox_correctBarycenter() {
        Vector2D barycenter = (Vector2D) box.getBarycenter();
        assertEquals(0.5, barycenter.getX(), EPS);
        assertEquals(0.5, barycenter.getY(), EPS);
    }

    @Test
    public void testBoxConstructor_nonUnitBox_correctSize() {
        PolygonsSet rect = new PolygonsSet(-2.0, 3.0, -1.0, 4.0);
        // width 5, height 5 => area 25
        assertEquals(25.0, rect.getSize(), EPS);
    }

    // ---------------------------------------------------------------
    // Box constructor - edge case: reversed bounds (xMin > xMax)
    // ---------------------------------------------------------------
    @Test
    public void testBoxConstructor_reversedBounds_resultsInInfiniteSize() {
        PolygonsSet reversed = new PolygonsSet(5.0, 0.0, 0.0, 5.0);
        // reversed orientation triggers the "sum < 0" branch
        assertEquals(Double.POSITIVE_INFINITY, reversed.getSize(), 0.0);
        Vector2D barycenter = (Vector2D) reversed.getBarycenter();
        assertTrue(Double.isNaN(barycenter.getX()));
        assertTrue(Double.isNaN(barycenter.getY()));
    }

    // ---------------------------------------------------------------
    // getVertices()
    // ---------------------------------------------------------------
    @Test
    public void testGetVertices_box_returnsFourVerticesLoop() {
        Vector2D[][] vertices = box.getVertices();
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);

        boolean[] found = new boolean[4];
        double[][] expectedCorners = {
            {0.0, 0.0},
            {1.0, 0.0},
            {1.0, 1.0},
            {0.0, 1.0}
        };

        for (Vector2D v : vertices[0]) {
            assertNotNull(v);
            for (int k = 0; k < expectedCorners.length; k++) {
                if (Math.abs(v.getX() - expectedCorners[k][0]) < EPS &&
                    Math.abs(v.getY() - expectedCorners[k][1]) < EPS) {
                    found[k] = true;
                }
            }
        }
        for (boolean f : found) {
            assertTrue(f);
        }
    }

    @Test
    public void testGetVertices_wholeSpace_returnsEmptyArray() {
        PolygonsSet whole = new PolygonsSet();
        Vector2D[][] vertices = whole.getVertices();
        assertEquals(0, vertices.length);
    }

    @Test
    public void testGetVertices_calledTwice_returnsConsistentResult() {
        Vector2D[][] firstCall = box.getVertices();
        Vector2D[][] secondCall = box.getVertices();
        assertEquals(firstCall.length, secondCall.length);
        assertEquals(firstCall[0].length, secondCall[0].length);
    }

    // ---------------------------------------------------------------
    // buildNew()
    // ---------------------------------------------------------------
    @Test
    public void testBuildNew_fromTree_createsEquivalentPolygon() {
        BSPTree<Euclidean2D> tree = box.getTree(false);
        PolygonsSet rebuilt = box.buildNew(tree);
        assertNotNull(rebuilt);
        assertTrue(rebuilt instanceof PolygonsSet);
        assertEquals(box.getSize(), rebuilt.getSize(), EPS);
    }

    // ---------------------------------------------------------------
    // Constructor from BSPTree
    // ---------------------------------------------------------------
    @Test
    public void testConstructorBSPTree_insideAttribute_wholeSpaceInside() {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        PolygonsSet set = new PolygonsSet(tree);
        assertEquals(Double.POSITIVE_INFINITY, set.getSize(), 0.0);
        Vector2D barycenter = (Vector2D) set.getBarycenter();
        assertTrue(Double.isNaN(barycenter.getX()));
        assertTrue(Double.isNaN(barycenter.getY()));
    }

    @Test
    public void testConstructorBSPTree_outsideAttribute_emptyRegion() {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.FALSE);
        PolygonsSet set = new PolygonsSet(tree);
        assertEquals(0.0, set.getSize(), EPS);
        Vector2D barycenter = (Vector2D) set.getBarycenter();
        assertEquals(0.0, barycenter.getX(), EPS);
        assertEquals(0.0, barycenter.getY(), EPS);
    }

    // ---------------------------------------------------------------
    // Constructor from Collection<SubHyperplane> - edge case empty boundary
    // ---------------------------------------------------------------
    @Test
    public void testConstructorCollection_emptyBoundary_wholeSpace() {
        Collection<SubHyperplane<Euclidean2D>> emptyBoundary =
            new ArrayList<SubHyperplane<Euclidean2D>>();
        PolygonsSet set = new PolygonsSet(emptyBoundary);
        assertEquals(Double.POSITIVE_INFINITY, set.getSize(), 0.0);
    }

    // ---------------------------------------------------------------
    // checkPoint()
    // ---------------------------------------------------------------
    @Test
    public void testCheckPoint_insidePoint_returnsInside() {
        Location loc = box.checkPoint(new Vector2D(0.5, 0.5));
        assertEquals(Location.INSIDE, loc);
    }

    @Test
    public void testCheckPoint_outsidePoint_returnsOutside() {
        Location loc = box.checkPoint(new Vector2D(2.0, 2.0));
        assertEquals(Location.OUTSIDE, loc);
    }

    @Test
    public void testCheckPoint_boundaryPoint_returnsBoundary() {
        Location loc = box.checkPoint(new Vector2D(0.0, 0.5));
        assertEquals(Location.BOUNDARY, loc);
    }

    @Test
    public void testCheckPoint_cornerPoint_returnsBoundary() {
        Location loc = box.checkPoint(new Vector2D(0.0, 0.0));
        assertEquals(Location.BOUNDARY, loc);
    }

    // ---------------------------------------------------------------
    // getSize() / getBarycenter() additional coverage
    // ---------------------------------------------------------------
    @Test
    public void testGetSize_box_matchesExpectedArea() {
        PolygonsSet rect = new PolygonsSet(0.0, 4.0, 0.0, 2.0);
        assertEquals(8.0, rect.getSize(), EPS);
    }

    @Test
    public void testGetBarycenter_box_matchesExpectedCenter() {
        PolygonsSet rect = new PolygonsSet(0.0, 4.0, 0.0, 2.0);
        Vector2D barycenter = (Vector2D) rect.getBarycenter();
        assertEquals(2.0, barycenter.getX(), EPS);
        assertEquals(1.0, barycenter.getY(), EPS);
    }

    // ---------------------------------------------------------------
    // Edge case: negative coordinates box
    // ---------------------------------------------------------------
    @Test
    public void testBoxConstructor_negativeCoordinates_correctSize() {
        PolygonsSet rect = new PolygonsSet(-5.0, -1.0, -3.0, -1.0);
        assertEquals(8.0, rect.getSize(), EPS);
        Vector2D barycenter = (Vector2D) rect.getBarycenter();
        assertEquals(-3.0, barycenter.getX(), EPS);
        assertEquals(-2.0, barycenter.getY(), EPS);
    }

    // ---------------------------------------------------------------
    // Edge case: very small box (boundary value near zero area)
    // ---------------------------------------------------------------
    @Test
    public void testBoxConstructor_verySmallBox_doesNotThrow() {
        PolygonsSet tiny = new PolygonsSet(0.0, 1.0e-6, 0.0, 1.0e-6);
        assertTrue(tiny.getSize() >= 0.0 || Double.isInfinite(tiny.getSize()));
    }
}
