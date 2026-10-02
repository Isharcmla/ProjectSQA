package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.junit.Assert;
import org.junit.Test;

public class PolygonsSetTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void testDefaultConstructor_wholeSpace() {
        PolygonsSet set = new PolygonsSet();
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getX()));
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getY()));

        Vector2D[][] vertices = set.getVertices();
        Assert.assertNotNull(vertices);
        Assert.assertEquals(0, vertices.length);

        Assert.assertEquals(Region.Location.INSIDE, set.checkPoint(new Vector2D(0, 0)));
        Assert.assertEquals(Region.Location.INSIDE, set.checkPoint(new Vector2D(100, -100)));
    }

    @Test
    public void testTreeConstructor_emptySpace() {
        PolygonsSet set = new PolygonsSet(new BSPTree<Euclidean2D>(Boolean.FALSE));
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals(0.0, set.getSize(), EPSILON);
        Assert.assertEquals(0.0, set.getBarycenter().getX(), EPSILON);
        Assert.assertEquals(0.0, set.getBarycenter().getY(), EPSILON);

        Vector2D[][] vertices = set.getVertices();
        Assert.assertNotNull(vertices);
        Assert.assertEquals(0, vertices.length);

        Assert.assertEquals(Region.Location.OUTSIDE, set.checkPoint(new Vector2D(0, 0)));
    }

    @Test
    public void testTreeConstructor_wholeSpace() {
        PolygonsSet set = new PolygonsSet(new BSPTree<Euclidean2D>(Boolean.TRUE));
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getX()));
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getY()));

        Vector2D[][] vertices = set.getVertices();
        Assert.assertNotNull(vertices);
        Assert.assertEquals(0, vertices.length);
    }

    @Test
    public void testBoxConstructor_normal() {
        PolygonsSet set = new PolygonsSet(1.0, 4.0, 2.0, 6.0);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(12.0, set.getSize(), EPSILON);

        Vector2D barycenter = (Vector2D) set.getBarycenter();
        Assert.assertEquals(2.5, barycenter.getX(), EPSILON);
        Assert.assertEquals(4.0, barycenter.getY(), EPSILON);

        Vector2D[][] vertices = set.getVertices();
        Assert.assertEquals(1, vertices.length);
        Assert.assertEquals(4, vertices[0].length);

        // Test caching of vertices
        Vector2D[][] verticesCached = set.getVertices();
        Assert.assertSame(vertices.length, verticesCached.length);

        Assert.assertEquals(Region.Location.INSIDE, set.checkPoint(new Vector2D(2.5, 4.0)));
        Assert.assertEquals(Region.Location.BOUNDARY, set.checkPoint(new Vector2D(1.0, 3.0)));
        Assert.assertEquals(Region.Location.OUTSIDE, set.checkPoint(new Vector2D(0.0, 0.0)));
    }

    @Test
    public void testBoundaryCollectionConstructor_triangle() {
        Collection<SubHyperplane<Euclidean2D>> boundaries = new ArrayList<SubHyperplane<Euclidean2D>>();
        Line l1 = new Line(new Vector2D(0, 0), new Vector2D(4, 0));
        Line l2 = new Line(new Vector2D(4, 0), new Vector2D(0, 3));
        Line l3 = new Line(new Vector2D(0, 3), new Vector2D(0, 0));

        boundaries.add(new SubLine(new Vector2D(0, 0), new Vector2D(4, 0)));
        boundaries.add(new SubLine(new Vector2D(4, 0), new Vector2D(0, 3)));
        boundaries.add(new SubLine(new Vector2D(0, 3), new Vector2D(0, 0)));

        PolygonsSet set = new PolygonsSet(boundaries);
        Assert.assertEquals(6.0, set.getSize(), EPSILON);

        Vector2D barycenter = (Vector2D) set.getBarycenter();
        Assert.assertEquals(4.0 / 3.0, barycenter.getX(), EPSILON);
        Assert.assertEquals(1.0, barycenter.getY(), EPSILON);

        Vector2D[][] vertices = set.getVertices();
        Assert.assertEquals(1, vertices.length);
        Assert.assertEquals(3, vertices[0].length);
    }

    @Test
    public void testBoundaryCollectionConstructor_empty() {
        Collection<SubHyperplane<Euclidean2D>> boundaries = new ArrayList<SubHyperplane<Euclidean2D>>();
        PolygonsSet set = new PolygonsSet(boundaries);
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);
    }

    @Test
    public void testBuildNew() {
        PolygonsSet original = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        BSPTree<Euclidean2D> tree = original.getTree(false);
        PolygonsSet built = original.buildNew(tree);

        Assert.assertNotNull(built);
        Assert.assertEquals(1.0, built.getSize(), EPSILON);
    }

    @Test
    public void testHalfSpace_singleInfiniteLine() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        SubHyperplane<Euclidean2D> subLine = new SubLine(line, new IntervalsSet());
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(subLine,
                new BSPTree<Euclidean2D>(Boolean.TRUE),
                new BSPTree<Euclidean2D>(Boolean.FALSE),
                null);

        PolygonsSet set = new PolygonsSet(tree);
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getX()));

        Vector2D[][] vertices = set.getVertices();
        Assert.assertEquals(1, vertices.length);
        Assert.assertEquals(3, vertices[0].length);
        Assert.assertNull(vertices[0][0]);
        Assert.assertNotNull(vertices[0][1]);
        Assert.assertNotNull(vertices[0][2]);
    }

    @Test
    public void testQuadrant_openLoopWithRealPoint() {
        Line line1 = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Line line2 = new Line(new Vector2D(0, 0), new Vector2D(0, 1));

        PolygonsSet set1 = new PolygonsSet(new BSPTree<Euclidean2D>(new SubLine(line1, new IntervalsSet()),
                new BSPTree<Euclidean2D>(Boolean.TRUE),
                new BSPTree<Euclidean2D>(Boolean.FALSE),
                null));
        PolygonsSet set2 = new PolygonsSet(new BSPTree<Euclidean2D>(new SubLine(line2, new IntervalsSet()),
                new BSPTree<Euclidean2D>(Boolean.TRUE),
                new BSPTree<Euclidean2D>(Boolean.FALSE),
                null));

        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet quadrant = (PolygonsSet) factory.intersection(set1, set2);

        Assert.assertEquals(Double.POSITIVE_INFINITY, quadrant.getSize(), EPSILON);
        Vector2D[][] vertices = quadrant.getVertices();
        Assert.assertEquals(1, vertices.length);
        Assert.assertTrue(vertices[0].length >= 3);
        Assert.assertNull(vertices[0][0]);
        Assert.assertNotNull(vertices[0][1]);
    }

    @Test
    public void testInvertedBox_infiniteInsideWithFiniteHole() {
        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet box = new PolygonsSet(0.0, 5.0, 0.0, 5.0);
        PolygonsSet inverted = (PolygonsSet) factory.getComplement(box);

        Assert.assertEquals(Double.POSITIVE_INFINITY, inverted.getSize(), EPSILON);
        Assert.assertTrue(Double.isNaN(inverted.getBarycenter().getX()));
        Assert.assertTrue(Double.isNaN(inverted.getBarycenter().getY()));

        Vector2D[][] vertices = inverted.getVertices();
        Assert.assertEquals(1, vertices.length);
        Assert.assertEquals(4, vertices[0].length);
    }

    @Test
    public void testPolygonWithHole() {
        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet outer = new PolygonsSet(0.0, 10.0, 0.0, 10.0);
        PolygonsSet inner = new PolygonsSet(2.0, 5.0, 2.0, 5.0);
        PolygonsSet withHole = (PolygonsSet) factory.difference(outer, inner);

        Assert.assertEquals(100.0 - 9.0, withHole.getSize(), EPSILON);

        Vector2D[][] vertices = withHole.getVertices();
        Assert.assertEquals(2, vertices.length);
        Assert.assertEquals(4, vertices[0].length);
        Assert.assertEquals(4, vertices[1].length);
    }

    @Test
    public void testUnionAndXorOperations() {
        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet box1 = new PolygonsSet(0.0, 3.0, 0.0, 3.0);
        PolygonsSet box2 = new PolygonsSet(2.0, 5.0, 0.0, 3.0);

        PolygonsSet union = (PolygonsSet) factory.union(box1, box2);
        Assert.assertEquals(15.0, union.getSize(), EPSILON);

        PolygonsSet xor = (PolygonsSet) factory.xor(box1, box2);
        Assert.assertEquals(12.0, xor.getSize(), EPSILON);

        Vector2D[][] xorVertices = xor.getVertices();
        Assert.assertEquals(2, xorVertices.length);
    }

    @Test
    public void testDegeneratedThinLine_filteredOut() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Collection<SubHyperplane<Euclidean2D>> boundaries = new ArrayList<SubHyperplane<Euclidean2D>>();
        boundaries.add(new SubLine(new Vector2D(0, 0), new Vector2D(1, 0)));
        boundaries.add(new SubLine(new Vector2D(1, 0), new Vector2D(0, 0)));

        PolygonsSet set = new PolygonsSet(boundaries);
        Vector2D[][] vertices = set.getVertices();
        Assert.assertEquals(0, vertices.length);
    }
}
