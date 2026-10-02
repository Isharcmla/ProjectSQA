package org.apache.commons.math.distribution;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.MathException;
import org.junit.Assert;
import org.junit.Test;

public class FDistributionImplTest {

    private static final double TOLERANCE = 1e-6;

    @Test
    public void testConstructor_validParameters_success() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        Assert.assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), TOLERANCE);
        Assert.assertEquals(6.0, dist.getDenominatorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroNumeratorDegreesOfFreedom_throwsIllegalArgumentException() {
        new FDistributionImpl(0.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeNumeratorDegreesOfFreedom_throwsIllegalArgumentException() {
        new FDistributionImpl(-1.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroDenominatorDegreesOfFreedom_throwsIllegalArgumentException() {
        new FDistributionImpl(5.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeDenominatorDegreesOfFreedom_throwsIllegalArgumentException() {
        new FDistributionImpl(5.0, -1.0);
    }

    @Test
    public void testSetNumeratorDegreesOfFreedom_validValue_success() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.setNumeratorDegreesOfFreedom(10.0);
        Assert.assertEquals(10.0, dist.getNumeratorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedom_zero_throwsIllegalArgumentException() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.setNumeratorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedom_negative_throwsIllegalArgumentException() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.setNumeratorDegreesOfFreedom(-2.5);
    }

    @Test
    public void testSetDenominatorDegreesOfFreedom_validValue_success() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.setDenominatorDegreesOfFreedom(12.0);
        Assert.assertEquals(12.0, dist.getDenominatorDegreesOfFreedom(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedom_zero_throwsIllegalArgumentException() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.setDenominatorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedom_negative_throwsIllegalArgumentException() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.setDenominatorDegreesOfFreedom(-4.0);
    }

    @Test
    public void testCumulativeProbability_nonPositiveInput_returnsZero() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(0.0), TOLERANCE);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-1.0), TOLERANCE);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-100.0), TOLERANCE);
    }

    @Test
    public void testCumulativeProbability_positiveInput_returnsCorrectValue() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        double result = dist.cumulativeProbability(4.387374);
        Assert.assertEquals(0.95, result, 1e-4);
    }

    @Test
    public void testInverseCumulativeProbability_zero_returnsZero() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        Assert.assertEquals(0.0, dist.inverseCumulativeProbability(0.0), TOLERANCE);
    }

    @Test
    public void testInverseCumulativeProbability_one_returnsPositiveInfinity() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, dist.inverseCumulativeProbability(1.0), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_negative_throwsIllegalArgumentException() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_greaterThanOne_throwsIllegalArgumentException() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        dist.inverseCumulativeProbability(1.1);
    }

    @Test
    public void testInverseCumulativeProbability_validProbability_returnsCorrectValue() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        double x = dist.inverseCumulativeProbability(0.95);
        Assert.assertEquals(4.387374, x, 1e-4);
    }

    @Test
    public void testGetDomainLowerBound_returnsZero() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        Assert.assertEquals(0.0, dist.getDomainLowerBound(0.5), TOLERANCE);
    }

    @Test
    public void testGetDomainUpperBound_returnsDoubleMaxValue() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        Assert.assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), TOLERANCE);
    }

    @Test
    public void testGetInitialDomain_returnsMean() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        double expected = 6.0 / (6.0 - 2.0); // 1.5
        Assert.assertEquals(expected, dist.getInitialDomain(0.5), TOLERANCE);
    }

    @Test
    public void testSerialization() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(4.0, 8.0);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dist);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FDistributionImpl deserialized = (FDistributionImpl) ois.readObject();

        Assert.assertEquals(dist.getNumeratorDegreesOfFreedom(), deserialized.getNumeratorDegreesOfFreedom(), TOLERANCE);
        Assert.assertEquals(dist.getDenominatorDegreesOfFreedom(), deserialized.getDenominatorDegreesOfFreedom(), TOLERANCE);
        Assert.assertEquals(dist.cumulativeProbability(2.0), deserialized.cumulativeProbability(2.0), TOLERANCE);
    }
}
