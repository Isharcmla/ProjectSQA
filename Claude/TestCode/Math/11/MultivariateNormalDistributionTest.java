package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MultivariateNormalDistributionTest {

    private double[] means2D;
    private double[][] covariances2D;
    private MultivariateNormalDistribution dist2D;

    @Before
    public void setUp() {
        means2D = new double[] {0.0, 0.0};
        covariances2D = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        dist2D = new MultivariateNormalDistribution(means2D, covariances2D);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_validInput_createsDistribution() {
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means2D, covariances2D);
        assertNotNull(dist);
        assertArrayEquals(means2D, dist.getMeans(), 1e-12);
    }

    @Test
    public void testConstructor_withRandomGenerator_createsDistribution() {
        RandomGenerator rng = new Well19937c();
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(rng, means2D, covariances2D);
        assertNotNull(dist);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructor_covarianceRowsMismatch_throwsException() {
        double[] means = new double[] {0.0, 0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        new MultivariateNormalDistribution(means, covariances);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructor_covarianceColumnsMismatch_throwsException() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0}
        };
        new MultivariateNormalDistribution(means, covariances);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructor_negativeEigenvalue_throwsException() {
        double[] means = new double[] {0.0, 0.0};
        double[][] covariances = new double[][] {
            {1.0, 2.0},
            {2.0, 1.0}
        };
        new MultivariateNormalDistribution(means, covariances);
    }

    @Test
    public void testConstructor_singleDimension_createsDistribution() {
        double[] means = new double[] {5.0};
        double[][] covariances = new double[][] {{2.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertNotNull(dist);
        assertEquals(5.0, dist.getMeans()[0], 1e-12);
    }

    // ---------- getMeans ----------

    @Test
    public void testGetMeans_returnsCorrectValues() {
        double[] expected = {0.0, 0.0};
        assertArrayEquals(expected, dist2D.getMeans(), 1e-12);
    }

    @Test
    public void testGetMeans_returnsDefensiveCopy() {
        double[] m1 = dist2D.getMeans();
        m1[0] = 999.0;
        double[] m2 = dist2D.getMeans();
        assertEquals(0.0, m2[0], 1e-12);
    }

    // ---------- getCovariances ----------

    @Test
    public void testGetCovariances_returnsCorrectMatrix() {
        RealMatrix cov = dist2D.getCovariances();
        assertEquals(1.0, cov.getEntry(0, 0), 1e-12);
        assertEquals(0.0, cov.getEntry(0, 1), 1e-12);
        assertEquals(0.0, cov.getEntry(1, 0), 1e-12);
        assertEquals(1.0, cov.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testGetCovariances_returnsDefensiveCopy() {
        RealMatrix cov1 = dist2D.getCovariances();
        cov1.setEntry(0, 0, 999.0);
        RealMatrix cov2 = dist2D.getCovariances();
        assertEquals(1.0, cov2.getEntry(0, 0), 1e-12);
    }

    // ---------- density ----------

    @Test
    public void testDensity_atMean_returnsMaxDensity() {
        double[] vals = {0.0, 0.0};
        double density = dist2D.density(vals);
        // For standard 2D normal at mean: 1/(2*pi) ~ 0.159154943
        assertEquals(1.0 / (2 * Math.PI), density, 1e-6);
    }

    @Test
    public void testDensity_awayFromMean_returnsLowerDensity() {
        double[] atMean = {0.0, 0.0};
        double[] awayFromMean = {1.0, 1.0};
        double densityAtMean = dist2D.density(atMean);
        double densityAway = dist2D.density(awayFromMean);
        assertTrue(densityAway < densityAtMean);
    }

    @Test
    public void testDensity_nonZeroValues_returnsPositiveValue() {
        double[] vals = {0.5, -0.5};
        double density = dist2D.density(vals);
        assertTrue(density > 0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDensity_wrongDimension_throwsException() {
        double[] vals = {0.0, 0.0, 0.0};
        dist2D.density(vals);
    }

    @Test
    public void testDensity_singleDimension_computesCorrectly() {
        double[] means = new double[] {0.0};
        double[][] covariances = new double[][] {{1.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double density = dist.density(new double[] {0.0});
        // Standard normal density at 0: 1/sqrt(2*pi)
        assertEquals(1.0 / Math.sqrt(2 * Math.PI), density, 1e-6);
    }

    // ---------- getStandardDeviations ----------

    @Test
    public void testGetStandardDeviations_identityCovariance_returnsOnes() {
        double[] stdDevs = dist2D.getStandardDeviations();
        assertEquals(1.0, stdDevs[0], 1e-12);
        assertEquals(1.0, stdDevs[1], 1e-12);
    }

    @Test
    public void testGetStandardDeviations_variedCovariance_returnsCorrectValues() {
        double[] means = {0.0, 0.0};
        double[][] covariances = {
            {4.0, 0.0},
            {0.0, 9.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] stdDevs = dist.getStandardDeviations();
        assertEquals(2.0, stdDevs[0], 1e-12);
        assertEquals(3.0, stdDevs[1], 1e-12);
    }

    // ---------- sample ----------

    @Test
    public void testSample_returnsCorrectDimension() {
        double[] sample = dist2D.sample();
        assertEquals(2, sample.length);
    }

    @Test
    public void testSample_multipleCalls_returnDifferentValues() {
        double[] sample1 = dist2D.sample();
        double[] sample2 = dist2D.sample();
        // With extremely high probability these will differ
        boolean allEqual = true;
        for (int i = 0; i < sample1.length; i++) {
            if (sample1[i] != sample2[i]) {
                allEqual = false;
                break;
            }
        }
        assertTrue(!allEqual);
    }

    @Test
    public void testSample_statisticalMean_closeToDistributionMean() {
        double[] means = {5.0, -3.0};
        double[][] covariances = {
            {1.0, 0.0},
            {0.0, 1.0}
        };
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);

        int n = 20000;
        double sum0 = 0.0;
        double sum1 = 0.0;
        for (int i = 0; i < n; i++) {
            double[] sample = dist.sample();
            sum0 += sample[0];
            sum1 += sample[1];
        }
        double avg0 = sum0 / n;
        double avg1 = sum1 / n;

        assertEquals(5.0, avg0, 0.1);
        assertEquals(-3.0, avg1, 0.1);
    }

    @Test
    public void testSample_singleDimension_returnsArrayOfLengthOne() {
        double[] means = {10.0};
        double[][] covariances = {{4.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        double[] sample = dist.sample();
        assertEquals(1, sample.length);
    }
}
