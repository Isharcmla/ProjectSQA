package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniformRealDistributionTest {

    private static final double EPS = 1e-12;

    private UniformRealDistribution defaultDist;
    private UniformRealDistribution customDist;

    @Before
    public void setUp() {
        defaultDist = new UniformRealDistribution();
        customDist = new UniformRealDistribution(2.0, 10.0);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsStandardUniform() {
        assertEquals(0.0, defaultDist.getSupportLowerBound(), EPS);
        assertEquals(1.0, defaultDist.getSupportUpperBound(), EPS);
    }

    @Test
    public void testTwoArgConstructor_validBounds_createsDistribution() {
        UniformRealDistribution dist = new UniformRealDistribution(1.0, 5.0);
        assertEquals(1.0, dist.getSupportLowerBound(), EPS);
        assertEquals(5.0, dist.getSupportUpperBound(), EPS);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testTwoArgConstructor_lowerEqualsUpper_throwsException() {
        new UniformRealDistribution(5.0, 5.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testTwoArgConstructor_lowerGreaterThanUpper_throwsException() {
        new UniformRealDistribution(10.0, 5.0);
    }

    @Test
    public void testThreeArgConstructor_validBounds_createsDistribution() {
        UniformRealDistribution dist = new UniformRealDistribution(0.0, 2.0, 1e-6);
        assertEquals(0.0, dist.getSupportLowerBound(), EPS);
        assertEquals(2.0, dist.getSupportUpperBound(), EPS);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testThreeArgConstructor_lowerEqualsUpper_throwsException() {
        new UniformRealDistribution(5.0, 5.0, 1e-6);
    }

    @Test
    public void testFourArgConstructor_withRandomGenerator_createsDistribution() {
        RandomGenerator rng = new Well19937c();
        UniformRealDistribution dist = new UniformRealDistribution(rng, 1.0, 3.0, 1e-6);
        assertEquals(1.0, dist.getSupportLowerBound(), EPS);
        assertEquals(3.0, dist.getSupportUpperBound(), EPS);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testFourArgConstructor_lowerGreaterThanUpper_throwsException() {
        RandomGenerator rng = new Well19937c();
        new UniformRealDistribution(rng, 10.0, 1.0, 1e-6);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testFourArgConstructor_lowerEqualsUpper_throwsException() {
        RandomGenerator rng = new Well19937c();
        new UniformRealDistribution(rng, 5.0, 5.0, 1e-6);
    }

    // ---------- density tests ----------

    @Test
    public void testDensity_withinBounds_returnsCorrectValue() {
        double density = customDist.density(5.0);
        assertEquals(1.0 / (10.0 - 2.0), density, EPS);
    }

    @Test
    public void testDensity_belowLowerBound_returnsZero() {
        assertEquals(0.0, customDist.density(1.0), EPS);
    }

    @Test
    public void testDensity_aboveUpperBound_returnsZero() {
        assertEquals(0.0, customDist.density(11.0), EPS);
    }

    @Test
    public void testDensity_atLowerBound_returnsNonZero() {
        double density = customDist.density(2.0);
        assertEquals(1.0 / (10.0 - 2.0), density, EPS);
    }

    @Test
    public void testDensity_atUpperBound_returnsNonZero() {
        double density = customDist.density(10.0);
        assertEquals(1.0 / (10.0 - 2.0), density, EPS);
    }

    // ---------- cumulativeProbability tests ----------

    @Test
    public void testCumulativeProbability_withinBounds_returnsCorrectValue() {
        double cp = customDist.cumulativeProbability(6.0);
        assertEquals((6.0 - 2.0) / (10.0 - 2.0), cp, EPS);
    }

    @Test
    public void testCumulativeProbability_atLowerBound_returnsZero() {
        assertEquals(0.0, customDist.cumulativeProbability(2.0), EPS);
    }

    @Test
    public void testCumulativeProbability_belowLowerBound_returnsZero() {
        assertEquals(0.0, customDist.cumulativeProbability(0.0), EPS);
    }

    @Test
    public void testCumulativeProbability_atUpperBound_returnsOne() {
        assertEquals(1.0, customDist.cumulativeProbability(10.0), EPS);
    }

    @Test
    public void testCumulativeProbability_aboveUpperBound_returnsOne() {
        assertEquals(1.0, customDist.cumulativeProbability(20.0), EPS);
    }

    // ---------- getNumericalMean tests ----------

    @Test
    public void testGetNumericalMean_typicalBounds_returnsCorrectMean() {
        assertEquals(0.5 * (2.0 + 10.0), customDist.getNumericalMean(), EPS);
    }

    @Test
    public void testGetNumericalMean_defaultBounds_returnsHalf() {
        assertEquals(0.5, defaultDist.getNumericalMean(), EPS);
    }

    // ---------- getNumericalVariance tests ----------

    @Test
    public void testGetNumericalVariance_typicalBounds_returnsCorrectVariance() {
        double ul = 10.0 - 2.0;
        assertEquals(ul * ul / 12, customDist.getNumericalVariance(), EPS);
    }

    @Test
    public void testGetNumericalVariance_defaultBounds_returnsCorrectVariance() {
        assertEquals(1.0 / 12.0, defaultDist.getNumericalVariance(), EPS);
    }

    // ---------- getSupportLowerBound / getSupportUpperBound ----------

    @Test
    public void testGetSupportLowerBound_returnsLower() {
        assertEquals(2.0, customDist.getSupportLowerBound(), EPS);
    }

    @Test
    public void testGetSupportUpperBound_returnsUpper() {
        assertEquals(10.0, customDist.getSupportUpperBound(), EPS);
    }

    // ---------- isSupportLowerBoundInclusive / isSupportUpperBoundInclusive ----------

    @Test
    public void testIsSupportLowerBoundInclusive_returnsTrue() {
        assertTrue(customDist.isSupportLowerBoundInclusive());
    }

    @Test
    public void testIsSupportUpperBoundInclusive_returnsFalse() {
        assertFalse(customDist.isSupportUpperBoundInclusive());
    }

    // ---------- isSupportConnected ----------

    @Test
    public void testIsSupportConnected_returnsTrue() {
        assertTrue(customDist.isSupportConnected());
    }

    // ---------- sample ----------

    @Test
    public void testSample_withinBounds_returnsValueInRange() {
        for (int i = 0; i < 1000; i++) {
            double sample = customDist.sample();
            assertTrue(sample >= customDist.getSupportLowerBound());
            assertTrue(sample <= customDist.getSupportUpperBound());
        }
    }

    @Test
    public void testSample_defaultDistribution_returnsValueInZeroOneRange() {
        for (int i = 0; i < 1000; i++) {
            double sample = defaultDist.sample();
            assertTrue(sample >= 0.0);
            assertTrue(sample <= 1.0);
        }
    }

    // ---------- getSolverAbsoluteAccuracy (protected, tested indirectly via inverseCumulativeProbability) ----------

    @Test
    public void testInverseCumulativeProbability_validProbability_returnsCorrectValue() {
        double x = customDist.inverseCumulativeProbability(0.5);
        assertEquals(6.0, x, 1e-6);
    }

    @Test
    public void testInverseCumulativeProbability_zeroProbability_returnsLowerBound() {
        double x = customDist.inverseCumulativeProbability(0.0);
        assertEquals(2.0, x, 1e-6);
    }

    @Test
    public void testInverseCumulativeProbability_oneProbability_returnsUpperBound() {
        double x = customDist.inverseCumulativeProbability(1.0);
        assertEquals(10.0, x, 1e-6);
    }
}
