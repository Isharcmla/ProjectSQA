import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FDistributionTest {

    private FDistribution dist;

    @Before
    public void setUp() {
        dist = new FDistribution(5.0, 10.0);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalParams_createsInstance() {
        FDistribution d = new FDistribution(2.0, 3.0);
        assertEquals(2.0, d.getNumeratorDegreesOfFreedom(), 0d);
        assertEquals(3.0, d.getDenominatorDegreesOfFreedom(), 0d);
    }

    @Test
    public void testConstructor_withInverseCumAccuracy_createsInstance() {
        FDistribution d = new FDistribution(2.0, 3.0, 1e-6);
        assertEquals(2.0, d.getNumeratorDegreesOfFreedom(), 0d);
        assertEquals(3.0, d.getDenominatorDegreesOfFreedom(), 0d);
        assertEquals(1e-6, d.getSolverAbsoluteAccuracy(), 0d);
    }

    @Test
    public void testConstructor_withRandomGenerator_createsInstance() {
        RandomGenerator rng = new Well19937c();
        FDistribution d = new FDistribution(rng, 2.0, 3.0, 1e-9);
        assertEquals(2.0, d.getNumeratorDegreesOfFreedom(), 0d);
        assertEquals(3.0, d.getDenominatorDegreesOfFreedom(), 0d);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroNumeratorDF_throwsException() {
        new FDistribution(0.0, 10.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_negativeNumeratorDF_throwsException() {
        new FDistribution(-5.0, 10.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_zeroDenominatorDF_throwsException() {
        new FDistribution(5.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_negativeDenominatorDF_throwsException() {
        new FDistribution(5.0, -10.0);
    }

    // ---------- density ----------

    @Test
    public void testDensity_normalInput_returnsPositiveValue() {
        double result = dist.density(1.0);
        assertTrue(result > 0);
    }

    @Test
    public void testDensity_smallX_returnsValue() {
        double result = dist.density(0.001);
        assertFalse(Double.isNaN(result));
    }

    @Test
    public void testDensity_largeX_returnsValue() {
        double result = dist.density(1000.0);
        assertTrue(result >= 0);
    }

    // ---------- cumulativeProbability ----------

    @Test
    public void testCumulativeProbability_xZero_returnsZero() {
        assertEquals(0.0, dist.cumulativeProbability(0.0), 0d);
    }

    @Test
    public void testCumulativeProbability_negativeX_returnsZero() {
        assertEquals(0.0, dist.cumulativeProbability(-5.0), 0d);
    }

    @Test
    public void testCumulativeProbability_positiveX_returnsProbability() {
        double result = dist.cumulativeProbability(1.0);
        assertTrue(result > 0 && result < 1);
    }

    @Test
    public void testCumulativeProbability_largeX_approachesOne() {
        double result = dist.cumulativeProbability(100000.0);
        assertTrue(result > 0.99);
    }

    // ---------- getNumeratorDegreesOfFreedom / getDenominatorDegreesOfFreedom ----------

    @Test
    public void testGetNumeratorDegreesOfFreedom_returnsCorrectValue() {
        assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), 0d);
    }

    @Test
    public void testGetDenominatorDegreesOfFreedom_returnsCorrectValue() {
        assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), 0d);
    }

    // ---------- getSolverAbsoluteAccuracy ----------

    @Test
    public void testGetSolverAbsoluteAccuracy_defaultValue_returnsDefault() {
        assertEquals(FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                dist.getSolverAbsoluteAccuracy(), 0d);
    }

    // ---------- getNumericalMean ----------

    @Test
    public void testGetNumericalMean_denominatorDFGreaterThanTwo_returnsValue() {
        // b = 10 > 2 => mean = 10/(10-2) = 1.25
        assertEquals(1.25, dist.getNumericalMean(), 1e-12);
    }

    @Test
    public void testGetNumericalMean_denominatorDFLessThanOrEqualTwo_returnsNaN() {
        FDistribution d = new FDistribution(5.0, 2.0);
        assertTrue(Double.isNaN(d.getNumericalMean()));
    }

    @Test
    public void testGetNumericalMean_denominatorDFEqualsTwo_returnsNaN() {
        FDistribution d = new FDistribution(5.0, 1.0);
        assertTrue(Double.isNaN(d.getNumericalMean()));
    }

    // ---------- getNumericalVariance / calculateNumericalVariance ----------

    @Test
    public void testGetNumericalVariance_denominatorDFGreaterThanFour_returnsValue() {
        // n=5, m=10 -> var = (2*100*(5+10-2)) / (5*(8*8)*(6)) = (200*13)/(5*64*6)
        double expected = (2 * (10.0 * 10.0) * (5.0 + 10.0 - 2)) /
                (5.0 * (8.0 * 8.0) * (10.0 - 4));
        assertEquals(expected, dist.getNumericalVariance(), 1e-9);
    }

    @Test
    public void testGetNumericalVariance_denominatorDFLessThanOrEqualFour_returnsNaN() {
        FDistribution d = new FDistribution(5.0, 4.0);
        assertTrue(Double.isNaN(d.getNumericalVariance()));
    }

    @Test
    public void testGetNumericalVariance_calledTwice_usesCachedValue() {
        double first = dist.getNumericalVariance();
        double second = dist.getNumericalVariance();
        assertEquals(first, second, 0d);
    }

    // ---------- getSupportLowerBound / getSupportUpperBound ----------

    @Test
    public void testGetSupportLowerBound_alwaysZero() {
        assertEquals(0.0, dist.getSupportLowerBound(), 0d);
    }

    @Test
    public void testGetSupportUpperBound_alwaysPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, dist.getSupportUpperBound(), 0d);
    }

    // ---------- isSupportLowerBoundInclusive / isSupportUpperBoundInclusive ----------

    @Test
    public void testIsSupportLowerBoundInclusive_returnsTrue() {
        assertTrue(dist.isSupportLowerBoundInclusive());
    }

    @Test
    public void testIsSupportUpperBoundInclusive_returnsFalse() {
        assertFalse(dist.isSupportUpperBoundInclusive());
    }

    // ---------- isSupportConnected ----------

    @Test
    public void testIsSupportConnected_returnsTrue() {
        assertTrue(dist.isSupportConnected());
    }
}
