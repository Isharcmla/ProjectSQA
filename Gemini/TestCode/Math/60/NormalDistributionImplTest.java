package org.apache.commons.math.distribution;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class NormalDistributionImplTest {

    private static final double DEFAULT_TOLERANCE = 1e-7;

    @Test
    public void testDefaultConstructor_defaultParameters_correctValues() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        Assert.assertEquals(0.0, dist.getMean(), DEFAULT_TOLERANCE);
        Assert.assertEquals(1.0, dist.getStandardDeviation(), DEFAULT_TOLERANCE);
        Assert.assertEquals(NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY, dist.getSolverAbsoluteAccuracy(), DEFAULT_TOLERANCE);
    }

    @Test
    public void testTwoArgConstructor_validParameters_correctValues() {
        NormalDistributionImpl dist = new NormalDistributionImpl(2.5, 1.5);
        Assert.assertEquals(2.5, dist.getMean(), DEFAULT_TOLERANCE);
        Assert.assertEquals(1.5, dist.getStandardDeviation(), DEFAULT_TOLERANCE);
        Assert.assertEquals(NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY, dist.getSolverAbsoluteAccuracy(), DEFAULT_TOLERANCE);
    }

    @Test
    public void testThreeArgConstructor_validParameters_correctValues() {
        NormalDistributionImpl dist = new NormalDistributionImpl(-10.0, 3.0, 1e-5);
        Assert.assertEquals(-10.0, dist.getMean(), DEFAULT_TOLERANCE);
        Assert.assertEquals(3.0, dist.getStandardDeviation(), DEFAULT_TOLERANCE);
        Assert.assertEquals(1e-5, dist.getSolverAbsoluteAccuracy(), DEFAULT_TOLERANCE);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroStandardDeviation_throwsException() {
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_negativeStandardDeviation_throwsException() {
        new NormalDistributionImpl(0.0, -2.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testThreeArgConstructor_negativeStandardDeviation_throwsException() {
        new NormalDistributionImpl(1.0, -0.5, 1e-6);
    }

    @Test
    public void testDensity_standardNormal_correctValues() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        double expectedAtZero = 1.0 / FastMath.sqrt(2.0 * FastMath.PI);
        Assert.assertEquals(expectedAtZero, dist.density(0.0), 1e-9);

        // Density symmetry
        Assert.assertEquals(dist.density(1.0), dist.density(-1.0), 1e-9);
        Assert.assertEquals(dist.density(2.5), dist.density(-2.5), 1e-9);

        // Density far from mean
        Assert.assertTrue(dist.density(100.0) >= 0.0);
        Assert.assertEquals(0.0, dist.density(100.0), 1e-15);
    }

    @Test
    public void testDensity_customNormal_correctValues() {
        double mean = 5.0;
        double sd = 2.0;
        NormalDistributionImpl dist = new NormalDistributionImpl(mean, sd);
        double expectedAtMean = 1.0 / (sd * FastMath.sqrt(2.0 * FastMath.PI));
        Assert.assertEquals(expectedAtMean, dist.density(mean), 1e-9);
        Assert.assertEquals(dist.density(mean + 1.5), dist.density(mean - 1.5), 1e-9);
    }

    @Test
    public void testCumulativeProbability_standardNormal_correctValues() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        Assert.assertEquals(0.5, dist.cumulativeProbability(0.0), 1e-9);
        Assert.assertEquals(0.8413447460685429, dist.cumulativeProbability(1.0), 1e-7);
        Assert.assertEquals(0.15865525393145705, dist.cumulativeProbability(-1.0), 1e-7);
        Assert.assertEquals(0.9772498680518208, dist.cumulativeProbability(2.0), 1e-7);
    }

    @Test
    public void testCumulativeProbability_extremeValues_returnsZeroOrOne() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(0.0, 1.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100.0), 1e-15);
        Assert.assertEquals(1.0, dist.cumulativeProbability(100.0), 1e-15);

        NormalDistributionImpl customDist = new NormalDistributionImpl(100.0, 5.0);
        Assert.assertEquals(0.0, customDist.cumulativeProbability(-100.0), 1e-15);
        Assert.assertEquals(1.0, customDist.cumulativeProbability(300.0), 1e-15);
    }

    @Test
    public void testInverseCumulativeProbability_boundaryPoints_returnsInfinity() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        Assert.assertEquals(Double.NEGATIVE_INFINITY, dist.inverseCumulativeProbability(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, dist.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_standardPoints_correctValues() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        Assert.assertEquals(0.0, dist.inverseCumulativeProbability(0.5), DEFAULT_TOLERANCE);
        Assert.assertEquals(1.0, dist.inverseCumulativeProbability(0.8413447460685429), DEFAULT_TOLERANCE);
        Assert.assertEquals(-1.0, dist.inverseCumulativeProbability(0.15865525393145705), DEFAULT_TOLERANCE);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbability_negativeProbability_throwsException() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbability_greaterThanOneProbability_throwsException() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        dist.inverseCumulativeProbability(1.1);
    }

    @Test
    public void testGetDomainLowerBound_allBranches() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        Assert.assertEquals(-Double.MAX_VALUE, dist.getDomainLowerBound(0.2), 0.0);
        Assert.assertEquals(10.0, dist.getDomainLowerBound(0.5), 0.0);
        Assert.assertEquals(10.0, dist.getDomainLowerBound(0.8), 0.0);
    }

    @Test
    public void testGetDomainUpperBound_allBranches() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        Assert.assertEquals(10.0, dist.getDomainUpperBound(0.2), 0.0);
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), 0.0);
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.8), 0.0);
    }

    @Test
    public void testGetInitialDomain_allBranches() {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        Assert.assertEquals(8.0, dist.getInitialDomain(0.2), 0.0);
        Assert.assertEquals(10.0, dist.getInitialDomain(0.5), 0.0);
        Assert.assertEquals(12.0, dist.getInitialDomain(0.8), 0.0);
    }

    @Test
    public void testSample_returnsValidNumbers() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);
        for (int i = 0; i < 20; i++) {
            double sample = dist.sample();
            Assert.assertFalse(Double.isNaN(sample));
            Assert.assertFalse(Double.isInfinite(sample));
        }
    }

    @Test
    public void testSerialization_roundTrip_equalsState() throws Exception {
        NormalDistributionImpl dist = new NormalDistributionImpl(12.34, 5.67, 1e-8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dist);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        NormalDistributionImpl deserialized = (NormalDistributionImpl) ois.readObject();
        ois.close();

        Assert.assertEquals(dist.getMean(), deserialized.getMean(), 0.0);
        Assert.assertEquals(dist.getStandardDeviation(), deserialized.getStandardDeviation(), 0.0);
        Assert.assertEquals(dist.getSolverAbsoluteAccuracy(), deserialized.getSolverAbsoluteAccuracy(), 0.0);
    }
}
