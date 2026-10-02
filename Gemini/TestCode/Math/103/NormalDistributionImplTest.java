package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.junit.Assert;
import org.junit.Test;

public class NormalDistributionImplTest {

    private static final double DEFAULT_TOLERANCE = 1e-6;

    @Test
    public void testDefaultConstructor_defaultValues_success() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        Assert.assertEquals(0.0, dist.getMean(), DEFAULT_TOLERANCE);
        Assert.assertEquals(1.0, dist.getStandardDeviation(), DEFAULT_TOLERANCE);
    }

    @Test
    public void testCustomConstructor_validParameters_success() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.5);
        Assert.assertEquals(5.0, dist.getMean(), DEFAULT_TOLERANCE);
        Assert.assertEquals(2.5, dist.getStandardDeviation(), DEFAULT_TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomConstructor_zeroStandardDeviation_throwsIllegalArgumentException() {
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomConstructor_negativeStandardDeviation_throwsIllegalArgumentException() {
        new NormalDistributionImpl(0.0, -1.0);
    }

    @Test
    public void testSetMean_validMean_success() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.setMean(10.5);
        Assert.assertEquals(10.5, dist.getMean(), DEFAULT_TOLERANCE);
        dist.setMean(-5.5);
        Assert.assertEquals(-5.5, dist.getMean(), DEFAULT_TOLERANCE);
    }

    @Test
    public void testSetStandardDeviation_positiveValue_success() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.setStandardDeviation(3.2);
        Assert.assertEquals(3.2, dist.getStandardDeviation(), DEFAULT_TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviation_zeroValue_throwsIllegalArgumentException() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.setStandardDeviation(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviation_negativeValue_throwsIllegalArgumentException() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.setStandardDeviation(-0.5);
    }

    @Test
    public void testCumulativeProbability_standardNormal_accurateResults() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);

        Assert.assertEquals(0.5, dist.cumulativeProbability(0.0), DEFAULT_TOLERANCE);
        Assert.assertEquals(0.8413447, dist.cumulativeProbability(1.0), DEFAULT_TOLERANCE);
        Assert.assertEquals(0.1586553, dist.cumulativeProbability(-1.0), DEFAULT_TOLERANCE);
        Assert.assertEquals(0.9772498, dist.cumulativeProbability(2.0), DEFAULT_TOLERANCE);
        Assert.assertEquals(0.0227501, dist.cumulativeProbability(-2.0), DEFAULT_TOLERANCE);
    }

    @Test
    public void testCumulativeProbability_nonStandardNormal_accurateResults() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);

        Assert.assertEquals(0.5, dist.cumulativeProbability(10.0), DEFAULT_TOLERANCE);
        Assert.assertEquals(0.8413447, dist.cumulativeProbability(12.0), DEFAULT_TOLERANCE);
        Assert.assertEquals(0.1586553, dist.cumulativeProbability(8.0), DEFAULT_TOLERANCE);
    }

    @Test
    public void testInverseCumulativeProbability_boundaryValues_returnsInfinities() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();

        Assert.assertEquals(Double.NEGATIVE_INFINITY, dist.inverseCumulativeProbability(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, dist.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_validProbabilities_accurateResults() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);

        Assert.assertEquals(0.0, dist.inverseCumulativeProbability(0.5), DEFAULT_TOLERANCE);
        Assert.assertEquals(1.0, dist.inverseCumulativeProbability(0.8413447), DEFAULT_TOLERANCE);
        Assert.assertEquals(-1.0, dist.inverseCumulativeProbability(0.1586553), DEFAULT_TOLERANCE);
        Assert.assertEquals(1.959964, dist.inverseCumulativeProbability(0.975), DEFAULT_TOLERANCE);
        Assert.assertEquals(-1.959964, dist.inverseCumulativeProbability(0.025), DEFAULT_TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_negativeProbability_throwsIllegalArgumentException() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_greaterThanOneProbability_throwsIllegalArgumentException() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.inverseCumulativeProbability(1.1);
    }

    @Test
    public void testGetDomainLowerBound_variousProbabilities_correctBounds() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);

        Assert.assertEquals(-Double.MAX_VALUE, dist.getDomainLowerBound(0.1), 0.0);
        Assert.assertEquals(-Double.MAX_VALUE, dist.getDomainLowerBound(0.499), 0.0);
        Assert.assertEquals(5.0, dist.getDomainLowerBound(0.5), DEFAULT_TOLERANCE);
        Assert.assertEquals(5.0, dist.getDomainLowerBound(0.9), DEFAULT_TOLERANCE);
    }

    @Test
    public void testGetDomainUpperBound_variousProbabilities_correctBounds() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);

        Assert.assertEquals(5.0, dist.getDomainUpperBound(0.1), DEFAULT_TOLERANCE);
        Assert.assertEquals(5.0, dist.getDomainUpperBound(0.499), DEFAULT_TOLERANCE);
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), 0.0);
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.9), 0.0);
    }

    @Test
    public void testGetInitialDomain_variousProbabilities_correctInitialEstimates() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);

        // p < 0.5 -> mean - sd = 5.0 - 2.0 = 3.0
        Assert.assertEquals(3.0, dist.getInitialDomain(0.2), DEFAULT_TOLERANCE);
        
        // p > 0.5 -> mean + sd = 5.0 + 2.0 = 7.0
        Assert.assertEquals(7.0, dist.getInitialDomain(0.8), DEFAULT_TOLERANCE);
        
        // p == 0.5 -> mean = 5.0
        Assert.assertEquals(5.0, dist.getInitialDomain(0.5), DEFAULT_TOLERANCE);
    }
}
