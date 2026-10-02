package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PoissonDistributionImplTest {

    private PoissonDistributionImpl defaultDist;

    @Before
    public void setUp() {
        defaultDist = new PoissonDistributionImpl(4.0);
    }

    // Constructor tests

    @Test
    public void testConstructor_validMean_createsInstance() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(5.0);
        Assert.assertEquals(5.0, dist.getMean(), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroMean_throwsException() {
        new PoissonDistributionImpl(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeMean_throwsException() {
        new PoissonDistributionImpl(-1.0);
    }

    @Test
    public void testConstructor_withEpsilonAndMaxIterations_createsInstance() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(3.0, 1e-10, 5000);
        Assert.assertEquals(3.0, dist.getMean(), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withEpsilonAndMaxIterations_negativeMean_throwsException() {
        new PoissonDistributionImpl(-2.0, 1e-10, 5000);
    }

    @Test
    public void testConstructor_withEpsilon_createsInstance() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(3.0, 1e-8);
        Assert.assertEquals(3.0, dist.getMean(), 1e-9);
    }

    @Test
    public void testConstructor_withMaxIterations_createsInstance() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(3.0, 2000);
        Assert.assertEquals(3.0, dist.getMean(), 1e-9);
    }

    // getMean tests

    @Test
    public void testGetMean_typicalValue_returnsCorrectMean() {
        Assert.assertEquals(4.0, defaultDist.getMean(), 1e-9);
    }

    // probability tests

    @Test
    public void testProbability_negativeX_returnsZero() {
        Assert.assertEquals(0.0, defaultDist.probability(-1), 1e-9);
    }

    @Test
    public void testProbability_maxIntegerX_returnsZero() {
        Assert.assertEquals(0.0, defaultDist.probability(Integer.MAX_VALUE), 1e-9);
    }

    @Test
    public void testProbability_zeroX_returnsExpOfNegativeMean() {
        double expected = Math.exp(-4.0);
        Assert.assertEquals(expected, defaultDist.probability(0), 1e-9);
    }

    @Test
    public void testProbability_positiveX_returnsPositiveValue() {
        double result = defaultDist.probability(4);
        Assert.assertTrue(result > 0.0);
    }

    @Test
    public void testProbability_largeX_returnsSmallPositiveValue() {
        double result = defaultDist.probability(100);
        Assert.assertTrue(result >= 0.0);
    }

    // cumulativeProbability tests

    @Test
    public void testCumulativeProbability_negativeX_returnsZero() throws MathException {
        Assert.assertEquals(0.0, defaultDist.cumulativeProbability(-5), 1e-9);
    }

    @Test
    public void testCumulativeProbability_maxIntegerX_returnsOne() throws MathException {
        Assert.assertEquals(1.0, defaultDist.cumulativeProbability(Integer.MAX_VALUE), 1e-9);
    }

    @Test
    public void testCumulativeProbability_typicalX_returnsValueBetweenZeroAndOne() throws MathException {
        double result = defaultDist.cumulativeProbability(4);
        Assert.assertTrue(result > 0.0 && result <= 1.0);
    }

    @Test
    public void testCumulativeProbability_zeroX_returnsPositiveValue() throws MathException {
        double result = defaultDist.cumulativeProbability(0);
        Assert.assertTrue(result > 0.0);
    }

    // normalApproximateProbability tests

    @Test
    public void testNormalApproximateProbability_typicalX_returnsValueBetweenZeroAndOne() throws MathException {
        double result = defaultDist.normalApproximateProbability(4);
        Assert.assertTrue(result >= 0.0 && result <= 1.0);
    }

    @Test
    public void testNormalApproximateProbability_zeroX_returnsValidProbability() throws MathException {
        double result = defaultDist.normalApproximateProbability(0);
        Assert.assertTrue(result >= 0.0 && result <= 1.0);
    }

    @Test
    public void testNormalApproximateProbability_negativeX_returnsValidProbability() throws MathException {
        double result = defaultDist.normalApproximateProbability(-1);
        Assert.assertTrue(result >= 0.0 && result <= 1.0);
    }

    // sample tests

    @Test
    public void testSample_typicalMean_returnsNonNegativeValue() throws MathException {
        int result = defaultDist.sample();
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void testSample_multipleCalls_returnsValuesWithinBounds() throws MathException {
        for (int i = 0; i < 10; i++) {
            int result = defaultDist.sample();
            Assert.assertTrue(result >= 0);
            Assert.assertTrue(result <= Integer.MAX_VALUE);
        }
    }

    // getDomainLowerBound and getDomainUpperBound tests (protected methods tested indirectly)

    @Test
    public void testInverseCumulativeProbability_typicalP_returnsValidValue() throws MathException {
        int result = defaultDist.inverseCumulativeProbability(0.5);
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void testInverseCumulativeProbability_lowP_returnsValidValue() throws MathException {
        int result = defaultDist.inverseCumulativeProbability(0.01);
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void testInverseCumulativeProbability_highP_returnsValidValue() throws MathException {
        int result = defaultDist.inverseCumulativeProbability(0.99);
        Assert.assertTrue(result >= 0);
    }

    // Additional edge case: very small mean
    @Test
    public void testConstructor_verySmallPositiveMean_createsInstance() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(0.0001);
        Assert.assertEquals(0.0001, dist.getMean(), 1e-9);
    }

    // Additional edge case: large mean
    @Test
    public void testConstructor_largeMean_createsInstance() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(1000.0);
        Assert.assertEquals(1000.0, dist.getMean(), 1e-9);
    }

    @Test
    public void testProbability_withLargeMean_returnsValidProbability() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(1000.0);
        double result = dist.probability(1000);
        Assert.assertTrue(result >= 0.0);
    }

    @Test
    public void testCumulativeProbability_withLargeMean_returnsValidProbability() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(1000.0);
        double result = dist.cumulativeProbability(1000);
        Assert.assertTrue(result >= 0.0 && result <= 1.0);
    }
}
