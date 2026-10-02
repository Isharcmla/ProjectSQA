package org.apache.commons.math.distribution;

import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NormalDistributionImplTest {

    private NormalDistributionImpl standardNormal;
    private NormalDistributionImpl customNormal;

    @Before
    public void setUp() {
        standardNormal = new NormalDistributionImpl();
        customNormal = new NormalDistributionImpl(10.0, 2.0);
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testDefaultConstructor_createsStandardNormal() {
        NormalDistributionImpl dist = new NormalDistributionImpl();
        assertEquals(0.0, dist.getMean(), 1e-10);
        assertEquals(1.0, dist.getStandardDeviation(), 1e-10);
    }

    @Test
    public void testConstructorWithParams_setsCorrectValues() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 3.0);
        assertEquals(5.0, dist.getMean(), 1e-10);
        assertEquals(3.0, dist.getStandardDeviation(), 1e-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroStandardDeviation_throwsException() {
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeStandardDeviation_throwsException() {
        new NormalDistributionImpl(0.0, -1.0);
    }

    // ---------- getMean / setMean Tests ----------

    @Test
    public void testGetMean_returnsCorrectValue() {
        assertEquals(10.0, customNormal.getMean(), 1e-10);
    }

    @Test
    public void testSetMean_updatesValue() {
        standardNormal.setMean(7.5);
        assertEquals(7.5, standardNormal.getMean(), 1e-10);
    }

    @Test
    public void testSetMean_negativeValue_updatesValue() {
        standardNormal.setMean(-3.0);
        assertEquals(-3.0, standardNormal.getMean(), 1e-10);
    }

    @Test
    public void testSetMean_zeroValue_updatesValue() {
        standardNormal.setMean(0.0);
        assertEquals(0.0, standardNormal.getMean(), 1e-10);
    }

    // ---------- getStandardDeviation / setStandardDeviation Tests ----------

    @Test
    public void testGetStandardDeviation_returnsCorrectValue() {
        assertEquals(2.0, customNormal.getStandardDeviation(), 1e-10);
    }

    @Test
    public void testSetStandardDeviation_updatesValue() {
        standardNormal.setStandardDeviation(4.0);
        assertEquals(4.0, standardNormal.getStandardDeviation(), 1e-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviation_zeroValue_throwsException() {
        standardNormal.setStandardDeviation(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviation_negativeValue_throwsException() {
        standardNormal.setStandardDeviation(-2.0);
    }

    // ---------- cumulativeProbability Tests ----------

    @Test
    public void testCumulativeProbability_atMean_returnsHalf() throws MathException {
        double result = standardNormal.cumulativeProbability(0.0);
        assertEquals(0.5, result, 1e-9);
    }

    @Test
    public void testCumulativeProbability_standardNormal_returnsCorrectValue() throws MathException {
        double result = standardNormal.cumulativeProbability(1.0);
        assertEquals(0.8413447460685429, result, 1e-7);
    }

    @Test
    public void testCumulativeProbability_negativeX_returnsCorrectValue() throws MathException {
        double result = standardNormal.cumulativeProbability(-1.0);
        assertEquals(0.15865525393145707, result, 1e-7);
    }

    @Test
    public void testCumulativeProbability_customDistributionAtMean_returnsHalf() throws MathException {
        double result = customNormal.cumulativeProbability(10.0);
        assertEquals(0.5, result, 1e-9);
    }

    @Test
    public void testCumulativeProbability_farFromMean_returnsNearZero() throws MathException {
        double result = standardNormal.cumulativeProbability(-100.0);
        assertEquals(0.0, result, 1e-6);
    }

    @Test
    public void testCumulativeProbability_farFromMean_returnsNearOne() throws MathException {
        double result = standardNormal.cumulativeProbability(100.0);
        assertEquals(1.0, result, 1e-6);
    }

    // ---------- inverseCumulativeProbability Tests ----------

    @Test
    public void testInverseCumulativeProbability_zero_returnsNegativeInfinity() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(0.0);
        assertEquals(Double.NEGATIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_one_returnsPositiveInfinity() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(1.0);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_half_returnsMean() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(0.5);
        assertEquals(0.0, result, 1e-5);
    }

    @Test
    public void testInverseCumulativeProbability_normalValue_returnsCorrectValue() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(0.975);
        assertEquals(1.959963985, result, 1e-4);
    }

    @Test
    public void testInverseCumulativeProbability_lowProbability_returnsNegativeValue() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(0.025);
        assertEquals(-1.959963985, result, 1e-4);
    }

    @Test
    public void testInverseCumulativeProbability_customDistribution_returnsCorrectValue() throws MathException {
        double result = customNormal.inverseCumulativeProbability(0.5);
        assertEquals(10.0, result, 1e-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_negativeP_throwsException() throws MathException {
        standardNormal.inverseCumulativeProbability(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverseCumulativeProbability_pGreaterThanOne_throwsException() throws MathException {
        standardNormal.inverseCumulativeProbability(1.1);
    }

    // ---------- getDomainLowerBound Tests (protected, same package access) ----------

    @Test
    public void testGetDomainLowerBound_pLessThanHalf_returnsNegativeMaxValue() {
        double result = standardNormal.getDomainLowerBound(0.3);
        assertEquals(-Double.MAX_VALUE, result, 0.0);
    }

    @Test
    public void testGetDomainLowerBound_pEqualsHalf_returnsMean() {
        double result = standardNormal.getDomainLowerBound(0.5);
        assertEquals(standardNormal.getMean(), result, 1e-10);
    }

    @Test
    public void testGetDomainLowerBound_pGreaterThanHalf_returnsMean() {
        double result = customNormal.getDomainLowerBound(0.7);
        assertEquals(customNormal.getMean(), result, 1e-10);
    }

    // ---------- getDomainUpperBound Tests ----------

    @Test
    public void testGetDomainUpperBound_pLessThanHalf_returnsMean() {
        double result = standardNormal.getDomainUpperBound(0.3);
        assertEquals(standardNormal.getMean(), result, 1e-10);
    }

    @Test
    public void testGetDomainUpperBound_pEqualsHalf_returnsMaxValue() {
        double result = standardNormal.getDomainUpperBound(0.5);
        assertEquals(Double.MAX_VALUE, result, 0.0);
    }

    @Test
    public void testGetDomainUpperBound_pGreaterThanHalf_returnsMaxValue() {
        double result = customNormal.getDomainUpperBound(0.7);
        assertEquals(Double.MAX_VALUE, result, 0.0);
    }

    // ---------- getInitialDomain Tests ----------

    @Test
    public void testGetInitialDomain_pLessThanHalf_returnsMeanMinusSd() {
        double result = standardNormal.getInitialDomain(0.3);
        double expected = standardNormal.getMean() - standardNormal.getStandardDeviation();
        assertEquals(expected, result, 1e-10);
    }

    @Test
    public void testGetInitialDomain_pGreaterThanHalf_returnsMeanPlusSd() {
        double result = standardNormal.getInitialDomain(0.7);
        double expected = standardNormal.getMean() + standardNormal.getStandardDeviation();
        assertEquals(expected, result, 1e-10);
    }

    @Test
    public void testGetInitialDomain_pEqualsHalf_returnsMean() {
        double result = standardNormal.getInitialDomain(0.5);
        assertEquals(standardNormal.getMean(), result, 1e-10);
    }

    @Test
    public void testGetInitialDomain_customDistribution_pLessThanHalf_returnsCorrectValue() {
        double result = customNormal.getInitialDomain(0.3);
        double expected = customNormal.getMean() - customNormal.getStandardDeviation();
        assertEquals(expected, result, 1e-10);
    }

    @Test
    public void testGetInitialDomain_customDistribution_pGreaterThanHalf_returnsCorrectValue() {
        double result = customNormal.getInitialDomain(0.7);
        double expected = customNormal.getMean() + customNormal.getStandardDeviation();
        assertEquals(expected, result, 1e-10);
    }
}
