package org.apache.commons.math.stat.clustering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.apache.commons.math.exception.ConvergenceException;
import org.junit.Assert;
import org.junit.Test;

public class KMeansPlusPlusClustererTest {

    private static class TestPoint implements Clusterable<TestPoint> {
        private final double x;
        private final double y;

        public TestPoint(final double x, final double y) {
            this.x = x;
            this.y = y;
        }

        public double distanceFrom(final TestPoint p) {
            final double dx = x - p.x;
            final double dy = y - p.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public TestPoint centroidOf(final Collection<TestPoint> points) {
            if (points == null || points.isEmpty()) {
                return this;
            }
            double sumX = 0;
            double sumY = 0;
            for (final TestPoint p : points) {
                sumX += p.x;
                sumY += p.y;
            }
            return new TestPoint(sumX / points.size(), sumY / points.size());
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TestPoint)) {
                return false;
            }
            final TestPoint other = (TestPoint) obj;
            return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
        }

        @Override
        public int hashCode() {
            return Double.valueOf(x).hashCode() ^ Double.valueOf(y).hashCode();
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    @Test
    public void testEnumValues() {
        KMeansPlusPlusClusterer.EmptyClusterStrategy[] strategies = 
            KMeansPlusPlusClusterer.EmptyClusterStrategy.values();
        Assert.assertEquals(4, strategies.length);
        Assert.assertEquals(
            KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE,
            KMeansPlusPlusClusterer.EmptyClusterStrategy.valueOf("LARGEST_VARIANCE")
        );
    }

    @Test
    public void testConstructorWithRandomOnly_successfulClustering() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(new Random(42L));

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(0.0, 0.0),
            new TestPoint(0.1, 0.0),
            new TestPoint(0.0, 0.1),
            new TestPoint(10.0, 10.0),
            new TestPoint(10.1, 10.0),
            new TestPoint(10.0, 10.1)
        );

        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 2, 10);
        Assert.assertEquals(2, clusters.size());

        int totalPoints = 0;
        for (final Cluster<TestPoint> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        Assert.assertEquals(6, totalPoints);
    }

    @Test
    public void testCluster_singleCluster_successfulClustering() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(new Random(12345L));

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(1.0, 2.0),
            new TestPoint(2.0, 3.0),
            new TestPoint(3.0, 4.0)
        );

        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 1, 10);
        Assert.assertEquals(1, clusters.size());
        Assert.assertEquals(3, clusters.get(0).getPoints().size());
    }

    @Test
    public void testCluster_negativeMaxIterations_runsWithoutIterationLimit() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(new Random(42L));

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(0.0, 0.0),
            new TestPoint(10.0, 10.0)
        );

        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 2, -1);
        Assert.assertEquals(2, clusters.size());
    }

    @Test
    public void testCluster_zeroMaxIterations_returnsInitialClustersWithoutCentroidUpdate() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(new Random(42L));

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(0.0, 0.0),
            new TestPoint(1.0, 1.0),
            new TestPoint(10.0, 10.0),
            new TestPoint(11.0, 11.0)
        );

        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 2, 0);
        Assert.assertEquals(2, clusters.size());
    }

    @Test
    public void testCluster_emptyClusterStrategy_LARGEST_VARIANCE() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(
                new Random(1L),
                KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE
            );

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(100.0, 100.0)
        );

        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 3, 20);
        Assert.assertEquals(3, clusters.size());
    }

    @Test
    public void testCluster_emptyClusterStrategy_LARGEST_POINTS_NUMBER() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(
                new Random(1L),
                KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER
            );

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(100.0, 100.0)
        );

        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 3, 20);
        Assert.assertEquals(3, clusters.size());
    }

    @Test
    public void testCluster_emptyClusterStrategy_FARTHEST_POINT() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(
                new Random(1L),
                KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT
            );

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(100.0, 100.0)
        );

        final List<Cluster<TestPoint>> clusters = clusterer.cluster(points, 3, 20);
        Assert.assertEquals(3, clusters.size());
    }

    @Test(expected = ConvergenceException.class)
    public void testCluster_emptyClusterStrategy_ERROR_throwsException() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(
                new Random(1L),
                KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR
            );

        final List<TestPoint> points = Arrays.asList(
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(0.0, 0.0),
            new TestPoint(100.0, 100.0)
        );

        clusterer.cluster(points, 3, 20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCluster_emptyPointsList_throwsException() {
        final KMeansPlusPlusClusterer<TestPoint> clusterer =
            new KMeansPlusPlusClusterer<TestPoint>(new Random(42L));
        clusterer.cluster(new ArrayList<TestPoint>(), 1, 10);
    }
}
