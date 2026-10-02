package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Test;

public class HypergeometricDistributionTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstructor_validParameters_success() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        Assert.assertEquals(10, dist.getPopulationSize());
        Assert.assertEquals(5, dist.getNumberOfSuccesses());
        Assert.assertEquals(3, dist.getSampleSize());
    }

    @Test
    public void testConstructorWithRng_validParameters_success() {
        Well19937c rng = new Well19937c(12345L);
        HypergeometricDistribution dist = new HypergeometricDistribution(rng, 20, 10, 5);
        Assert.assertEquals(20, dist.getPopulationSize());
        Assert.assertEquals(10, dist.getNumberOfSuccesses());
        Assert.assertEquals(5, dist.getSampleSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_populationSizeZero_throwsException() {
        new HypergeometricDistribution(0, 0, 0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_populationSizeNegative_throwsException() {
        new HypergeometricDistribution(-5, 0, 0);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_numberOfSuccessesNegative_throwsException() {
        new HypergeometricDistribution(10, -1, 5);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_sampleSizeNegative_throwsException() {
        new HypergeometricDistribution(10, 5, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_numberOfSuccessesLargerThanPopulation_throwsException() {
        new HypergeometricDistribution(10, 11, 5);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_sampleSizeLargerThanPopulation_throwsException() {
        new HypergeometricDistribution(10, 5, 11);
    }

    @Test
    public void testGetters() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 30, 20);
        Assert.assertEquals(100, dist.getPopulationSize());
        Assert.assertEquals(30, dist.getNumberOfSuccesses());
        Assert.assertEquals(20, dist.getSampleSize());
    }

    @Test
    public void testSupportBounds() {
        // N = 10, m = 7, k = 5 -> lower = max(0, 5 + 7 - 10) = 2, upper = min(7, 5) = 5
        HypergeometricDistribution dist1 = new HypergeometricDistribution(10, 7, 5);
        Assert.assertEquals(2, dist1.getSupportLowerBound());
        Assert.assertEquals(5, dist1.getSupportUpperBound());

        // N = 10, m = 3, k = 4 -> lower = max(0, 4 + 3 - 10) = 0, upper = min(3, 4) = 3
        HypergeometricDistribution dist2 = new HypergeometricDistribution(10, 3, 4);
        Assert.assertEquals(0, dist2.getSupportLowerBound());
        Assert.assertEquals(3, dist2.getSupportUpperBound());
    }

    @Test
    public void testIsSupportConnected() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 3);
        Assert.assertTrue(dist.isSupportConnected());
    }

    @Test
    public void testProbability_outsideDomain_returnsZero() {
        // N = 10, m = 7, k = 5 -> Domain: [2, 5]
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 7, 5);
        Assert.assertEquals(0.0, dist.probability(1), EPSILON);
        Assert.assertEquals(0.0, dist.probability(-1), EPSILON);
        Assert.assertEquals(0.0, dist.probability(6), EPSILON);
        Assert.assertEquals(0.0, dist.probability(10), EPSILON);
    }

    @Test
    public void testProbability_insideDomain_correctValues() {
        // N = 5, m = 2, k = 3 -> Domain: [0, 2]
        // Probabilities:
        // P(X=0) = (2C0 * 3C3) / 5C3 = (1 * 1) / 10 = 0.1
        // P(X=1) = (2C1 * 3C2) / 5C3 = (2 * 3) / 10 = 0.6
        // P(X=2) = (2C2 * 3C1) / 5C3 = (1 * 3) / 10 = 0.3
        HypergeometricDistribution dist = new HypergeometricDistribution(5, 2, 3);
        Assert.assertEquals(0.1, dist.probability(0), EPSILON);
        Assert.assertEquals(0.6, dist.probability(1), EPSILON);
        Assert.assertEquals(0.3, dist.probability(2), EPSILON);
    }

    @Test
    public void testCumulativeProbability_variousX() {
        // N = 5, m = 2, k = 3 -> Domain: [0, 2]
        HypergeometricDistribution dist = new HypergeometricDistribution(5, 2, 3);

        // x < lowerDomain -> 0.0
        Assert.assertEquals(0.0, dist.cumulativeProbability(-1), EPSILON);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100), EPSILON);

        // x >= upperDomain -> 1.0
        Assert.assertEquals(1.0, dist.cumulativeProbability(2), EPSILON);
        Assert.assertEquals(1.0, dist.cumulativeProbability(3), EPSILON);

        // inside domain
        Assert.assertEquals(0.1, dist.cumulativeProbability(0), EPSILON);
        Assert.assertEquals(0.7, dist.cumulativeProbability(1), EPSILON);
    }

    @Test
    public void testUpperCumulativeProbability_variousX() {
        // N = 5, m = 2, k = 3 -> Domain: [0, 2]
        HypergeometricDistribution dist = new HypergeometricDistribution(5, 2, 3);

        // x <= lowerDomain -> 1.0
        Assert.assertEquals(1.0, dist.upperCumulativeProbability(0), EPSILON);
        Assert.assertEquals(1.0, dist.upperCumulativeProbability(-1), EPSILON);

        // x > upperDomain -> 0.0
        Assert.assertEquals(0.0, dist.upperCumulativeProbability(3), EPSILON);
        Assert.assertEquals(0.0, dist.upperCumulativeProbability(10), EPSILON);

        // inside domain
        // P(X >= 1) = P(X=1) + P(X=2) = 0.6 + 0.3 = 0.9
        Assert.assertEquals(0.9, dist.upperCumulativeProbability(1), EPSILON);
        // P(X >= 2) = P(X=2) = 0.3
        Assert.assertEquals(0.3, dist.upperCumulativeProbability(2), EPSILON);
    }

    @Test
    public void testGetNumericalMean() {
        // N = 10, m = 4, k = 5 -> mean = 5 * 4 / 10 = 2.0
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 4, 5);
        Assert.assertEquals(2.0, dist.getNumericalMean(), EPSILON);
    }

    @Test
    public void testGetNumericalVariance_andCaching() {
        // N = 10, m = 4, k = 5
        // Var = [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)]
        // Var = [5 * 4 * (10 - 5) * (10 - 4)] / [100 * 9] = [20 * 5 * 6] / 900 = 600 / 900 = 2/3
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 4, 5);

        double varFirstCall = dist.getNumericalVariance();
        Assert.assertEquals(2.0 / 3.0, varFirstCall, EPSILON);

        // Second call should return cached value
        double varSecondCall = dist.getNumericalVariance();
        Assert.assertEquals(2.0 / 3.0, varSecondCall, EPSILON);

        // Direct call to protected calculateNumericalVariance
        double directVar = dist.calculateNumericalVariance();
        Assert.assertEquals(2.0 / 3.0, directVar, EPSILON);
    }

    @Test
    public void testEdgeCase_zeroSuccesses() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 0, 5);
        Assert.assertEquals(0, dist.getSupportLowerBound());
        Assert.assertEquals(0, dist.getSupportUpperBound());
        Assert.assertEquals(1.0, dist.probability(0), EPSILON);
        Assert.assertEquals(0.0, dist.probability(1), EPSILON);
        Assert.assertEquals(0.0, dist.getNumericalMean(), EPSILON);
        Assert.assertEquals(0.0, dist.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testEdgeCase_zeroSampleSize() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 0);
        Assert.assertEquals(0, dist.getSupportLowerBound());
        Assert.assertEquals(0, dist.getSupportUpperBound());
        Assert.assertEquals(1.0, dist.probability(0), EPSILON);
        Assert.assertEquals(0.0, dist.probability(1), EPSILON);
        Assert.assertEquals(0.0, dist.getNumericalMean(), EPSILON);
        Assert.assertEquals(0.0, dist.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testEdgeCase_allSuccessesAllSampled() {
        HypergeometricDistribution dist = new HypergeometricDistribution(5, 5, 5);
        Assert.assertEquals(5, dist.getSupportLowerBound());
        Assert.assertEquals(5, dist.getSupportUpperBound());
        Assert.assertEquals(1.0, dist.probability(5), EPSILON);
        Assert.assertEquals(0.0, dist.probability(4), EPSILON);
        Assert.assertEquals(5.0, dist.getNumericalMean(), EPSILON);
    }
}
