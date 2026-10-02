package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class UniformRealDistributionTest {

    private static final double TOLERANCE = 1e-9;

    @Test
    public void testDefaultConstructor_defaultParameters_correctBoundsAndMean() {
        UniformRealDistribution dist = new UniformRealDistribution();
        Assert.assertEquals(0.0, dist.getSupportLowerBound(), TOLERANCE);
        Assert.assertEquals(1.0, dist.getSupportUpperBound(), TOLERANCE);
        Assert.assertEquals(0.5, dist.getNumericalMean(), TOLERANCE);
        Assert.assertEquals(1.0 / 12.0, dist.getNumericalVariance(), TOLERANCE);
        Assert.assertEquals(UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY, dist.getSolverAbsoluteAccuracy(), TOLERANCE);
    }

    @Test
    public void testTwoArgConstructor_validBounds_initializedProperly() {
        UniformRealDistribution dist = new UniformRealDistribution(-2.0, 3.0);
        Assert.assertEquals(-2.0, dist.getSupportLowerBound(), TOLERANCE);
        Assert.assertEquals(3.0, dist.getSupportUpperBound(), TOLERANCE);
        Assert.assertEquals(0.5, dist.getNumericalMean(), TOLERANCE);
        Assert.assertEquals(25.0 / 12.0, dist.getNumericalVariance(), TOLERANCE);
    }

    @Test
    public void testThreeArgConstructor_validParameters_accuracySet() {
        double customAccuracy = 1e-6;
        UniformRealDistribution dist = new UniformRealDistribution(1.0, 5.0, customAccuracy);
        Assert.assertEquals(1.0, dist.getSupportLowerBound(), TOLERANCE);
        Assert.assertEquals(5.0, dist.getSupportUpperBound(), TOLERANCE);
        Assert.assertEquals(customAccuracy, dist.getSolverAbsoluteAccuracy(), TOLERANCE);
    }

    @Test
    public void testFourArgConstructor_withRng_initializedProperly() {
        RandomGenerator rng = new JDKRandomGenerator();
        rng.setSeed(42);
        UniformRealDistribution dist = new UniformRealDistribution(rng, 10.0, 20.0, 1e-8);
        Assert.assertEquals(10.0, dist.getSupportLowerBound(), TOLERANCE);
        Assert.assertEquals(20.0, dist.getSupportUpperBound(), TOLERANCE);
        Assert.assertEquals(15.0, dist.getNumericalMean(), TOLERANCE);
        Assert.assertEquals(100.0 / 12.0, dist.getNumericalVariance(), TOLERANCE);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_lowerEqualToUpper_throwsException() {
        new UniformRealDistribution(2.0, 2.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_lowerGreaterThanUpper_throwsException() {
        new UniformRealDistribution(5.0, 1.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testThreeArgConstructor_lowerGreaterThanUpper_throwsException() {
        new UniformRealDistribution(5.0, 1.0, 1e-5);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testFourArgConstructor_lowerGreaterThanUpper_throwsException() {
        RandomGenerator rng = new JDKRandomGenerator();
        new UniformRealDistribution(rng, 5.0, 1.0, 1e-5);
    }

    @Test
    public void testDensity_pointsInsideAndOutsideBounds_returnsCorrectDensity() {
        UniformRealDistribution dist = new UniformRealDistribution(-1.0, 3.0);
        double expectedDensity = 1.0 / (3.0 - (-1.0)); // 0.25

        // Inside support
        Assert.assertEquals(expectedDensity, dist.density(0.0), TOLERANCE);
        Assert.assertEquals(expectedDensity, dist.density(1.5), TOLERANCE);
        
        // Exact boundary points (lower <= x <= upper for density implementation)
        Assert.assertEquals(expectedDensity, dist.density(-1.0), TOLERANCE);
        Assert.assertEquals(expectedDensity, dist.density(3.0), TOLERANCE);

        // Outside support
        Assert.assertEquals(0.0, dist.density(-1.0001), TOLERANCE);
        Assert.assertEquals(0.0, dist.density(3.0001), TOLERANCE);
        Assert.assertEquals(0.0, dist.density(-100.0), TOLERANCE);
        Assert.assertEquals(0.0, dist.density(100.0), TOLERANCE);
    }

    @Test
    public void testCumulativeProbability_pointsAcrossInterval_returnsCorrectProbabilities() {
        UniformRealDistribution dist = new UniformRealDistribution(2.0, 6.0);

        // Below lower bound
        Assert.assertEquals(0.0, dist.cumulativeProbability(1.0), TOLERANCE);
        Assert.assertEquals(0.0, dist.cumulativeProbability(2.0), TOLERANCE);

        // Inside interval
        Assert.assertEquals(0.25, dist.cumulativeProbability(3.0), TOLERANCE);
        Assert.assertEquals(0.50, dist.cumulativeProbability(4.0), TOLERANCE);
        Assert.assertEquals(0.75, dist.cumulativeProbability(5.0), TOLERANCE);

        // Above upper bound
        Assert.assertEquals(1.0, dist.cumulativeProbability(6.0), TOLERANCE);
        Assert.assertEquals(1.0, dist.cumulativeProbability(7.0), TOLERANCE);
    }

    @Test
    public void testSupportProperties_standardValues_expectedFlags() {
        UniformRealDistribution dist = new UniformRealDistribution(-5.0, 5.0);
        Assert.assertTrue(dist.isSupportLowerBoundInclusive());
        Assert.assertFalse(dist.isSupportUpperBoundInclusive());
        Assert.assertTrue(dist.isSupportConnected());
    }

    @Test
    public void testSample_seededRandom_valuesWithinRange() {
        RandomGenerator rng = new JDKRandomGenerator();
        rng.setSeed(123456L);
        UniformRealDistribution dist = new UniformRealDistribution(rng, 10.0, 20.0, 1e-9);

        for (int i = 0; i < 1000; i++) {
            double sample = dist.sample();
            Assert.assertTrue("Sample " + sample + " should be >= 10.0", sample >= 10.0);
            Assert.assertTrue("Sample " + sample + " should be <= 20.0", sample <= 20.0);
        }
    }

    @Test
    public void testSample_negativeBounds_valuesWithinRange() {
        RandomGenerator rng = new JDKRandomGenerator();
        rng.setSeed(987654L);
        UniformRealDistribution dist = new UniformRealDistribution(rng, -10.0, -2.0, 1e-9);

        for (int i = 0; i < 1000; i++) {
            double sample = dist.sample();
            Assert.assertTrue("Sample " + sample + " should be >= -10.0", sample >= -10.0);
            Assert.assertTrue("Sample " + sample + " should be <= -2.0", sample <= -2.0);
        }
    }

    @Test
    public void testInverseCumulativeProbability_validRange_returnsCorrectQuantiles() {
        UniformRealDistribution dist = new UniformRealDistribution(0.0, 10.0);
        Assert.assertEquals(0.0, dist.inverseCumulativeProbability(0.0), TOLERANCE);
        Assert.assertEquals(5.0, dist.inverseCumulativeProbability(0.5), TOLERANCE);
        Assert.assertEquals(10.0, dist.inverseCumulativeProbability(1.0), TOLERANCE);
    }
}
