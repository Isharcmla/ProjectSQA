package org.apache.commons.math.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Before;
import org.junit.Test;

public class NormalDistributionImplTest {

    private NormalDistributionImpl standardDist;
    private static final double DELTA = 1e-6;

    @Before
    public void setUp() {
        standardDist = new NormalDistributionImpl();
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_default_meanZeroSdOne() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        assertEquals(0.0, dist.getMean(), DELTA);
        assertEquals(1.0, dist.getStandardDeviation(), DELTA);
    }

    @Test
    public void testConstructor_withMeanAndSd_normalInput() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(5.0, dist.getMean(), DELTA);
        assertEquals(2.0, dist.getStandardDeviation(), DELTA);
    }

    @Test
    public void testConstructor_withMeanSdAndAccuracy_normalInput() {
        NormalDistributionImpl dist = new NormalDistributionImpl(3.0, 1.5, 1e-10);
        assertEquals(3.0, dist.getMean(), DELTA);
        assertEquals(1.5, dist.getStandardDeviation(), DELTA);
        assertEquals(1e-10, dist.getSolverAbsoluteAccuracy(), DELTA);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_sdZero_throwsException() {
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_sdNegative_throwsException() {
        new NormalDistributionImpl(0.0, -1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_withAccuracy_sdNegative_throwsException() {
        new NormalDistributionImpl(0.0, -5.0, 1e-9);
    }

    // ---------- getMean / getStandardDeviation ----------

    @Test
    public void testGetMean_returnsCorrectValue() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        assertEquals(10.0, dist.getMean(), DELTA);
    }

    @Test
    public void testGetStandardDeviation_returnsCorrectValue() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.5);
        assertEquals(2.5, dist.getStandardDeviation(), DELTA);
    }

    // ---------- density ----------

    @Test
    public void testDensity_atMean_returnsMaxDensity() {
        double density = standardDist.density(0.0);
        // density at mean for standard normal is 1/sqrt(2*pi)
        assertEquals(0.3989422804014327, density, DELTA);
    }

    @Test
    public void testDensity_awayFromMean_returnsLowerDensity() {
        double density = standardDist.density(2.0);
        assertTrue(density > 0);
        assertTrue(density < standardDist.density(0.0));
    }

    @Test
    public void testDensity_negativeValue_symmetric() {
        double densityNeg = standardDist.density(-1.0);
        double densityPos = standardDist.density(1.0);
        assertEquals(densityPos, densityNeg, DELTA);
    }

    // ---------- cumulativeProbability ----------

    @Test
    public void testCumulativeProbability_atMean_returnsHalf() throws MathException {
        double cdf = standardDist.cumulativeProbability(0.0);
        assertEquals(0.5, cdf, DELTA);
    }

    @Test
    public void testCumulativeProbability_positiveValue_returnsGreaterThanHalf() throws MathException {
        double cdf = standardDist.cumulativeProbability(1.0);
        assertTrue(cdf > 0.5);
    }

    @Test
    public void testCumulativeProbability_negativeValue_returnsLessThanHalf() throws MathException {
        double cdf = standardDist.cumulativeProbability(-1.0);
        assertTrue(cdf < 0.5);
    }

    @Test
    public void testCumulativeProbability_farBelowMean_returnsNearZero() throws MathException {
        double cdf = standardDist.cumulativeProbability(-30.0);
        assertTrue(cdf >= 0.0 && cdf < 1e-6);
    }

    @Test
    public void testCumulativeProbability_farAboveMean_returnsNearOne() throws MathException {
        double cdf = standardDist.cumulativeProbability(30.0);
        assertTrue(cdf <= 1.0 && cdf > 1 - 1e-6);
    }

    // ---------- inverseCumulativeProbability ----------

    @Test
    public void testInverseCumulativeProbability_pZero_returnsNegativeInfinity() throws MathException {
        double x = standardDist.inverseCumulativeProbability(0.0);
        assertEquals(Double.NEGATIVE_INFINITY, x, 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_pOne_returnsPositiveInfinity() throws MathException {
        double x = standardDist.inverseCumulativeProbability(1.0);
        assertEquals(Double.POSITIVE_INFINITY, x, 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_pHalf_returnsMean() throws MathException {
        double x = standardDist.inverseCumulativeProbability(0.5);
        assertEquals(0.0, x, 1e-6);
    }

    @Test
    public void testInverseCumulativeProbability_pLessThanHalf_returnsNegativeValue() throws MathException {
        double x = standardDist.inverseCumulativeProbability(0.1);
        assertTrue(x < 0);
    }

    @Test
    public void testInverseCumulativeProbability_pGreaterThanHalf_returnsPositiveValue() throws MathException {
        double x = standardDist.inverseCumulativeProbability(0.9);
        assertTrue(x > 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbability_pNegative_throwsException() throws MathException {
        standardDist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbability_pGreaterThanOne_throwsException() throws MathException {
        standardDist.inverseCumulativeProbability(1.1);
    }

    // ---------- sample ----------

    @Test
    public void testSample_returnsFiniteValue() throws MathException {
        double sample = standardDist.sample();
        assertTrue(!Double.isNaN(sample));
        assertTrue(!Double.isInfinite(sample));
    }

    // ---------- getSolverAbsoluteAccuracy ----------

    @Test
    public void testGetSolverAbsoluteAccuracy_defaultValue() {
        assertEquals(NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                standardDist.getSolverAbsoluteAccuracy(), DELTA);
    }

    @Test
    public void testGetSolverAbsoluteAccuracy_customValue() {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0, 1e-5);
        assertEquals(1e-5, dist.getSolverAbsoluteAccuracy(), DELTA);
    }

    // ---------- getDomainLowerBound ----------

    @Test
    public void testGetDomainLowerBound_pLessThanHalf_returnsNegativeMaxValue() {
        double lowerBound = standardDist.getDomainLowerBound(0.3);
        assertEquals(-Double.MAX_VALUE, lowerBound, 0.0);
    }

    @Test
    public void testGetDomainLowerBound_pGreaterEqualHalf_returnsMean() {
        double lowerBound = standardDist.getDomainLowerBound(0.5);
        assertEquals(standardDist.getMean(), lowerBound, DELTA);
    }

    @Test
    public void testGetDomainLowerBound_pGreaterThanHalf_returnsMean() {
        double lowerBound = standardDist.getDomainLowerBound(0.7);
        assertEquals(standardDist.getMean(), lowerBound, DELTA);
    }

    // ---------- getDomainUpperBound ----------

    @Test
    public void testGetDomainUpperBound_pLessThanHalf_returnsMean() {
        double upperBound = standardDist.getDomainUpperBound(0.3);
        assertEquals(standardDist.getMean(), upperBound, DELTA);
    }

    @Test
    public void testGetDomainUpperBound_pGreaterEqualHalf_returnsMaxValue() {
        double upperBound = standardDist.getDomainUpperBound(0.5);
        assertEquals(Double.MAX_VALUE, upperBound, 0.0);
    }

    @Test
    public void testGetDomainUpperBound_pGreaterThanHalf_returnsMaxValue() {
        double upperBound = standardDist.getDomainUpperBound(0.7);
        assertEquals(Double.MAX_VALUE, upperBound, 0.0);
    }

    // ---------- getInitialDomain ----------

    @Test
    public void testGetInitialDomain_pLessThanHalf_returnsMeanMinusSd() {
        double initial = standardDist.getInitialDomain(0.3);
        assertEquals(standardDist.getMean() - standardDist.getStandardDeviation(), initial, DELTA);
    }

    @Test
    public void testGetInitialDomain_pGreaterThanHalf_returnsMeanPlusSd() {
        double initial = standardDist.getInitialDomain(0.7);
        assertEquals(standardDist.getMean() + standardDist.getStandardDeviation(), initial, DELTA);
    }

    @Test
    public void testGetInitialDomain_pEqualHalf_returnsMean() {
        double initial = standardDist.getInitialDomain(0.5);
        assertEquals(standardDist.getMean(), initial, DELTA);
    }
}
