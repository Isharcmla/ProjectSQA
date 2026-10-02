package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.junit.Assert;
import org.junit.Test;

public class MultivariateNormalDistributionTest {

    private static final double TOLERANCE = 1e-6;

    @Test
    public void testConstructor_validInputsDefaultRng_success() {
        double[] means = new double[] { 1.0, 2.0 };
        double[][] cov = new double[][] {
            { 1.0, 0.5 },
            { 0.5, 2.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);

        Assert.assertEquals(2, dist.getDimension());
        Assert.assertArrayEquals(means, dist.getMeans(), TOLERANCE);
        
        RealMatrix covMatrix = dist.getCovariances();
        Assert.assertEquals(cov[0][0], covMatrix.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(cov[0][1], covMatrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(cov[1][0], covMatrix.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(cov[1][1], covMatrix.getEntry(1, 1), TOLERANCE);
    }

    @Test
    public void testConstructor_validInputsCustomRng_success() {
        RandomGenerator rng = new JDKRandomGenerator();
        rng.setSeed(42);
        double[] means = new double[] { 0.0 };
        double[][] cov = new double[][] { { 4.0 } };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(rng, means, cov);

        Assert.assertEquals(1, dist.getDimension());
        Assert.assertArrayEquals(means, dist.getMeans(), TOLERANCE);
        Assert.assertEquals(4.0, dist.getCovariances().getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructor_rowDimensionMismatch_throwsDimensionMismatchException() {
        double[] means = new double[] { 1.0, 2.0 };
        double[][] cov = new double[][] {
            { 1.0, 0.0 }
        };

        new MultivariateNormalDistribution(means, cov);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructor_columnDimensionMismatch_throwsDimensionMismatchException() {
        double[] means = new double[] { 1.0, 2.0 };
        double[][] cov = new double[][] {
            { 1.0, 0.0, 0.0 },
            { 0.0, 1.0 }
        };

        new MultivariateNormalDistribution(means, cov);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructor_negativeEigenvalue_throwsNonPositiveDefiniteMatrixException() {
        double[] means = new double[] { 0.0, 0.0 };
        double[][] cov = new double[][] {
            { 1.0, 2.0 },
            { 2.0, 1.0 }
        };

        new MultivariateNormalDistribution(means, cov);
    }

    @Test
    public void testGetMeans_immutability_returnedArrayModificationDoesNotAffectDistribution() {
        double[] means = new double[] { 1.0, 2.0 };
        double[][] cov = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        double[] retrievedMeans = dist.getMeans();
        retrievedMeans[0] = 99.0;

        Assert.assertEquals(1.0, dist.getMeans()[0], TOLERANCE);
    }

    @Test
    public void testGetCovariances_immutability_returnedMatrixModificationDoesNotAffectDistribution() {
        double[] means = new double[] { 1.0, 2.0 };
        double[][] cov = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        RealMatrix covMatrix = dist.getCovariances();
        covMatrix.setEntry(0, 0, 99.0);

        Assert.assertEquals(1.0, dist.getCovariances().getEntry(0, 0), TOLERANCE);
    }

    @Test
    public void testGetStandardDeviations_validCovariance_returnsSquareRootOfDiagonal() {
        double[] means = new double[] { 1.0, 2.0, 3.0 };
        double[][] cov = new double[][] {
            { 4.0, 0.0, 0.0 },
            { 0.0, 9.0, 0.0 },
            { 0.0, 0.0, 16.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        double[] std = dist.getStandardDeviations();

        Assert.assertEquals(3, std.length);
        Assert.assertEquals(2.0, std[0], TOLERANCE);
        Assert.assertEquals(3.0, std[1], TOLERANCE);
        Assert.assertEquals(4.0, std[2], TOLERANCE);
    }

    @Test
    public void testDensity_knownValues_returnsCorrectDensity() {
        double[] means = new double[] { 0.0, 0.0 };
        double[][] cov = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);

        double expectedPeakDensity = 1.0 / (2.0 * Math.PI);
        Assert.assertEquals(expectedPeakDensity, dist.density(new double[] { 0.0, 0.0 }), TOLERANCE);

        double expectedOffPeakDensity = (1.0 / (2.0 * Math.PI)) * Math.exp(-0.5 * (1.0 + 1.0));
        Assert.assertEquals(expectedOffPeakDensity, dist.density(new double[] { 1.0, 1.0 }), TOLERANCE);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDensity_dimensionMismatch_throwsDimensionMismatchException() {
        double[] means = new double[] { 0.0, 0.0 };
        double[][] cov = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        dist.density(new double[] { 0.0 });
    }

    @Test
    public void testSample_singleSample_returnsCorrectDimension() {
        double[] means = new double[] { 5.0, -2.0 };
        double[][] cov = new double[][] {
            { 2.0, 0.5 },
            { 0.5, 1.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(new Well19937c(12345), means, cov);
        double[] sample = dist.sample();

        Assert.assertNotNull(sample);
        Assert.assertEquals(2, sample.length);
    }

    @Test
    public void testSample_multipleSamplesStatisticalProperties_matchesMeanAndVariance() {
        RandomGenerator rng = new Well19937c(987654321L);
        double[] means = new double[] { 10.0, -5.0 };
        double[][] cov = new double[][] {
            { 4.0, 1.0 },
            { 1.0, 9.0 }
        };

        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(rng, means, cov);

        int sampleSize = 20000;
        double[][] samples = dist.sample(sampleSize);

        Assert.assertEquals(sampleSize, samples.length);

        Mean mean0 = new Mean();
        Mean mean1 = new Mean();
        Variance var0 = new Variance();
        Variance var1 = new Variance();

        for (int i = 0; i < sampleSize; i++) {
            mean0.increment(samples[i][0]);
            mean1.increment(samples[i][1]);
            var0.increment(samples[i][0]);
            var1.increment(samples[i][1]);
        }

        Assert.assertEquals(means[0], mean0.getResult(), 0.1);
        Assert.assertEquals(means[1], mean1.getResult(), 0.1);
        Assert.assertEquals(cov[0][0], var0.getResult(), 0.2);
        Assert.assertEquals(cov[1][1], var1.getResult(), 0.3);
    }
}
