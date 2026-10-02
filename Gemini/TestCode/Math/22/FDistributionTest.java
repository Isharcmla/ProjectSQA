package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Assert;
import org.junit.Test;

public class FDistributionTest {

    private static final double EPSILON = 1e-9;

    @Test
    public void testConstructorTwoParameters_validParameters_success() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        Assert.assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), EPSILON);
        Assert.assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), EPSILON);
        Assert.assertEquals(FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void testConstructorThreeParameters_validParameters_success() {
        FDistribution dist = new FDistribution(5.0, 10.0, 1e-6);
        Assert.assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), EPSILON);
        Assert.assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), EPSILON);
        Assert.assertEquals(1e-6, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test
    public void testConstructorFourParameters_validParameters_success() {
        Well19937c rng = new Well19937c(1234567L);
        FDistribution dist = new FDistribution(rng, 5.0, 10.0, 1e-6);
        Assert.assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), EPSILON);
        Assert.assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), EPSILON);
        Assert.assertEquals(1e-6, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroNumeratorDegreesOfFreedom_throwsException() {
        new FDistribution(0.0, 10.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_negativeNumeratorDegreesOfFreedom_throwsException() {
        new FDistribution(-5.0, 10.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroDenominatorDegreesOfFreedom_throwsException() {
        new FDistribution(5.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_negativeDenominatorDegreesOfFreedom_throwsException() {
        new FDistribution(5.0, -10.0);
    }

    @Test
    public void testDensity_positiveValues_returnsCorrectDensity() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        double density = dist.density(1.0);
        Assert.assertTrue(density > 0.0);
        Assert.assertEquals(0.612089456754, density, 1e-6);
    }

    @Test
    public void testCumulativeProbability_nonPositiveValues_returnsZero() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(0.0), EPSILON);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-1.0), EPSILON);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100.0), EPSILON);
    }

    @Test
    public void testCumulativeProbability_positiveValues_returnsCorrectProbability() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        double prob = dist.cumulativeProbability(1.0);
        Assert.assertTrue(prob > 0.0 && prob < 1.0);
        Assert.assertEquals(0.53123017, prob, 1e-6);

        Assert.assertEquals(1.0, dist.cumulativeProbability(Double.POSITIVE_INFINITY), 1e-6);
    }

    @Test
    public void testGetNumericalMean_denominatorGreaterThanTwo_returnsCorrectMean() {
        FDistribution dist = new FDistribution(5.0, 6.0);
        Assert.assertEquals(6.0 / (6.0 - 2.0), dist.getNumericalMean(), EPSILON);
    }

    @Test
    public void testGetNumericalMean_denominatorLessThanOrEqualToTwo_returnsNaN() {
        FDistribution dist2 = new FDistribution(5.0, 2.0);
        Assert.assertTrue(Double.isNaN(dist2.getNumericalMean()));

        FDistribution dist1 = new FDistribution(5.0, 1.0);
        Assert.assertTrue(Double.isNaN(dist1.getNumericalMean()));
    }

    @Test
    public void testGetNumericalVariance_denominatorGreaterThanFour_returnsCorrectVariance() {
        FDistribution dist = new FDistribution(5.0, 6.0);
        double a = 5.0;
        double b = 6.0;
        double expected = (2.0 * b * b * (a + b - 2.0)) / (a * (b - 2.0) * (b - 2.0) * (b - 4.0));
        
        Assert.assertEquals(expected, dist.getNumericalVariance(), EPSILON);
        // Test cache hit branch
        Assert.assertEquals(expected, dist.getNumericalVariance(), EPSILON);
    }

    @Test
    public void testGetNumericalVariance_denominatorLessThanOrEqualToFour_returnsNaN() {
        FDistribution dist4 = new FDistribution(5.0, 4.0);
        Assert.assertTrue(Double.isNaN(dist4.getNumericalVariance()));
        // Test cache hit branch for NaN
        Assert.assertTrue(Double.isNaN(dist4.getNumericalVariance()));

        FDistribution dist2 = new FDistribution(5.0, 2.0);
        Assert.assertTrue(Double.isNaN(dist2.getNumericalVariance()));
    }

    @Test
    public void testCalculateNumericalVariance_directCall_returnsExpected() {
        FDistribution dist = new FDistribution(5.0, 6.0);
        double a = 5.0;
        double b = 6.0;
        double expected = (2.0 * b * b * (a + b - 2.0)) / (a * (b - 2.0) * (b - 2.0) * (b - 4.0));
        Assert.assertEquals(expected, dist.calculateNumericalVariance(), EPSILON);

        FDistribution dist3 = new FDistribution(5.0, 3.0);
        Assert.assertTrue(Double.isNaN(dist3.calculateNumericalVariance()));
    }

    @Test
    public void testSupportProperties_fixedValues_returnsExpected() {
        FDistribution dist = new FDistribution(5.0, 10.0);
        Assert.assertEquals(0.0, dist.getSupportLowerBound(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, dist.getSupportUpperBound(), EPSILON);
        Assert.assertTrue(dist.isSupportLowerBoundInclusive());
        Assert.assertFalse(dist.isSupportUpperBoundInclusive());
        Assert.assertTrue(dist.isSupportConnected());
    }

    @Test
    public void testGetSolverAbsoluteAccuracy_returnsConfiguredAccuracy() {
        FDistribution dist = new FDistribution(5.0, 10.0, 1e-12);
        Assert.assertEquals(1e-12, dist.getSolverAbsoluteAccuracy(), EPSILON);
    }
}
