package org.apache.commons.math.distribution;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.MathException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link PoissonDistributionImpl}.
 */
public class PoissonDistributionImplTest {

    private static final double DEFAULT_EPSILON = 1E-12;

    @Test
    public void testConstructor_singleParameter_validMean() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(5.0);
        Assert.assertEquals(5.0, dist.getMean(), 1e-15);
    }

    @Test
    public void testConstructor_meanAndEpsilon_validParameters() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(3.5, 1e-10);
        Assert.assertEquals(3.5, dist.getMean(), 1e-15);
    }

    @Test
    public void testConstructor_meanAndMaxIterations_validParameters() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(2.5, 5000);
        Assert.assertEquals(2.5, dist.getMean(), 1e-15);
    }

    @Test
    public void testConstructor_allParameters_valid() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0, 1e-8, 1000);
        Assert.assertEquals(4.0, dist.getMean(), 1e-15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroMean_throwsIllegalArgumentException() {
        new PoissonDistributionImpl(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeMean_throwsIllegalArgumentException() {
        new PoissonDistributionImpl(-1.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_allParametersWithZeroMean_throwsIllegalArgumentException() {
        new PoissonDistributionImpl(0.0, 1e-10, 100);
    }

    @Test
    public void testGetMean_returnsCorrectMean() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(10.5);
        Assert.assertEquals(10.5, dist.getMean(), 1e-15);
    }

    @Test
    public void testProbability_negativeX_returnsZero() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        Assert.assertEquals(0.0, dist.probability(-1), 0.0);
        Assert.assertEquals(0.0, dist.probability(-100), 0.0);
    }

    @Test
    public void testProbability_maxInteger_returnsZero() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        Assert.assertEquals(0.0, dist.probability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testProbability_zeroX_returnsExpNegativeMean() {
        double mean = 3.0;
        PoissonDistributionImpl dist = new PoissonDistributionImpl(mean);
        double expected = FastMath.exp(-mean);
        Assert.assertEquals(expected, dist.probability(0), 1e-15);
    }

    @Test
    public void testProbability_positiveX_returnsCorrectProbability() {
        double mean = 2.0;
        PoissonDistributionImpl dist = new PoissonDistributionImpl(mean);
        // P(X=1) = e^(-2) * 2^1 / 1! = 2 * e^(-2)
        double expected1 = 2.0 * FastMath.exp(-2.0);
        Assert.assertEquals(expected1, dist.probability(1), 1e-12);

        // P(X=2) = e^(-2) * 2^2 / 2! = 2 * e^(-2)
        double expected2 = 2.0 * FastMath.exp(-2.0);
        Assert.assertEquals(expected2, dist.probability(2), 1e-12);

        // P(X=3) = e^(-2) * 2^3 / 3! = (4/3) * e^(-2)
        double expected3 = (4.0 / 3.0) * FastMath.exp(-2.0);
        Assert.assertEquals(expected3, dist.probability(3), 1e-12);
    }

    @Test
    public void testCumulativeProbability_negativeX_returnsZero() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-1), 0.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-50), 0.0);
    }

    @Test
    public void testCumulativeProbability_maxInteger_returnsOne() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        Assert.assertEquals(1.0, dist.cumulativeProbability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbability_zeroX_equalsProbabilityZero() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(2.5);
        Assert.assertEquals(dist.probability(0), dist.cumulativeProbability(0), 1e-12);
    }

    @Test
    public void testCumulativeProbability_positiveX_matchesSumOfProbabilities() throws MathException {
        double mean = 3.0;
        PoissonDistributionImpl dist = new PoissonDistributionImpl(mean);
        double sum = dist.probability(0) + dist.probability(1) + dist.probability(2);
        Assert.assertEquals(sum, dist.cumulativeProbability(2), 1e-10);
    }

    @Test
    public void testCumulativeProbability_range_returnsDifference() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(3.0);
        double rangeProb = dist.cumulativeProbability(1, 3);
        double expected = dist.probability(2) + dist.probability(3);
        Assert.assertEquals(expected, rangeProb, 1e-10);
    }

    @Test
    public void testNormalApproximateProbability_validInputs() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(100.0);
        double approxProb = dist.normalApproximateProbability(100);
        Assert.assertTrue(approxProb > 0.0 && approxProb < 1.0);
        Assert.assertEquals(0.5, approxProb, 0.05);
    }

    @Test
    public void testSample_smallMean_returnsNonNegativeValues() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(2.0);
        dist.reseedRandomGenerator(42L);
        for (int i = 0; i < 100; i++) {
            int sample = dist.sample();
            Assert.assertTrue("Sample should be non-negative", sample >= 0);
        }
    }

    @Test
    public void testSample_largeMean_returnsNonNegativeValues() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(50.0);
        dist.reseedRandomGenerator(42L);
        for (int i = 0; i < 100; i++) {
            int sample = dist.sample();
            Assert.assertTrue("Sample should be non-negative", sample >= 0);
        }
    }

    @Test
    public void testGetDomainLowerBound_returnsZero() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(5.0);
        Assert.assertEquals(0, dist.getDomainLowerBound(0.25));
        Assert.assertEquals(0, dist.getDomainLowerBound(0.0));
        Assert.assertEquals(0, dist.getDomainLowerBound(1.0));
    }

    @Test
    public void testGetDomainUpperBound_returnsIntegerMaxValue() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(5.0);
        Assert.assertEquals(Integer.MAX_VALUE, dist.getDomainUpperBound(0.25));
        Assert.assertEquals(Integer.MAX_VALUE, dist.getDomainUpperBound(0.0));
        Assert.assertEquals(Integer.MAX_VALUE, dist.getDomainUpperBound(1.0));
    }

    @Test
    public void testInverseCumulativeProbability_validProbabilities() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        Assert.assertEquals(0, dist.inverseCumulativeProbability(0.0));
        Assert.assertEquals(Integer.MAX_VALUE, dist.inverseCumulativeProbability(1.0));

        int median = dist.inverseCumulativeProbability(0.5);
        Assert.assertTrue(median >= 0);
        Assert.assertTrue(dist.cumulativeProbability(median) >= 0.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_negativeProbability_throwsException() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        dist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_greaterThanOneProbability_throwsException() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        dist.inverseCumulativeProbability(1.1);
    }

    @Test
    public void testSerialization_preservesState() throws Exception {
        PoissonDistributionImpl original = new PoissonDistributionImpl(7.5, 1e-9, 500);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        PoissonDistributionImpl deserialized = (PoissonDistributionImpl) ois.readObject();
        ois.close();

        Assert.assertEquals(original.getMean(), deserialized.getMean(), 1e-15);
        Assert.assertEquals(original.probability(5), deserialized.probability(5), 1e-15);
        Assert.assertEquals(original.cumulativeProbability(5), deserialized.cumulativeProbability(5), 1e-15);
    }
}
