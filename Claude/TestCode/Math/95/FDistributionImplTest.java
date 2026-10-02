import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FDistributionImplTest {

    private FDistributionImpl distribution;

    @Before
    public void setUp() {
        distribution = new FDistributionImpl(5.0, 6.0);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalInput_createsInstance() {
        FDistributionImpl dist = new FDistributionImpl(1.0, 1.0);
        assertEquals(1.0, dist.getNumeratorDegreesOfFreedom(), 0.0);
        assertEquals(1.0, dist.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroNumeratorDegreesOfFreedom_throwsException() {
        new FDistributionImpl(0.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeNumeratorDegreesOfFreedom_throwsException() {
        new FDistributionImpl(-1.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_zeroDenominatorDegreesOfFreedom_throwsException() {
        new FDistributionImpl(5.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_negativeDenominatorDegreesOfFreedom_throwsException() {
        new FDistributionImpl(5.0, -1.0);
    }

    // ---------- cumulativeProbability tests ----------

    @Test
    public void testCumulativeProbability_xIsZero_returnsZero() throws MathException {
        double result = distribution.cumulativeProbability(0.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testCumulativeProbability_xIsNegative_returnsZero() throws MathException {
        double result = distribution.cumulativeProbability(-5.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testCumulativeProbability_positiveX_returnsValueBetweenZeroAndOne() throws MathException {
        double result = distribution.cumulativeProbability(1.0);
        assertTrue(result > 0.0 && result < 1.0);
    }

    @Test
    public void testCumulativeProbability_largeX_returnsValueCloseToOne() throws MathException {
        double result = distribution.cumulativeProbability(1000.0);
        assertTrue(result > 0.9);
    }

    // ---------- inverseCumulativeProbability tests ----------

    @Test
    public void testInverseCumulativeProbability_pIsZero_returnsZero() throws MathException {
        double result = distribution.inverseCumulativeProbability(0.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_pIsOne_returnsPositiveInfinity() throws MathException {
        double result = distribution.inverseCumulativeProbability(1.0);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_pIsHalf_returnsPositiveFiniteValue() throws MathException {
        double result = distribution.inverseCumulativeProbability(0.5);
        assertTrue(result > 0.0);
        assertTrue(result < Double.POSITIVE_INFINITY);
    }

    @Test
    public void testInverseCumulativeProbability_roundTrip_consistentWithCumulativeProbability() throws MathException {
        double p = 0.3;
        double x = distribution.inverseCumulativeProbability(p);
        double cdf = distribution.cumulativeProbability(x);
        assertEquals(p, cdf, 1e-4);
    }

    // ---------- getDomainLowerBound / getDomainUpperBound / getInitialDomain ----------

    @Test
    public void testGetDomainLowerBound_anyP_returnsZero() {
        double result = distribution.getDomainLowerBound(0.5);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testGetDomainUpperBound_anyP_returnsMaxDouble() {
        double result = distribution.getDomainUpperBound(0.5);
        assertEquals(Double.MAX_VALUE, result, 0.0);
    }

    @Test
    public void testGetInitialDomain_normalDenominatorDegreesOfFreedom_returnsMean() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 6.0);
        double expected = 6.0 / (6.0 - 2.0);
        double result = dist.getInitialDomain(0.5);
        assertEquals(expected, result, 1e-9);
    }

    @Test
    public void testGetInitialDomain_denominatorDegreesOfFreedomEqualsTwo_returnsInfinity() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 2.0);
        double result = dist.getInitialDomain(0.5);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testGetInitialDomain_denominatorDegreesOfFreedomLessThanTwo_returnsNegativeValue() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 1.0);
        double result = dist.getInitialDomain(0.5);
        assertTrue(result < 0.0);
    }

    // ---------- Numerator degrees of freedom getters/setters ----------

    @Test
    public void testSetGetNumeratorDegreesOfFreedom_normalValue_setsAndGetsCorrectly() {
        distribution.setNumeratorDegreesOfFreedom(10.0);
        assertEquals(10.0, distribution.getNumeratorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedom_zeroValue_throwsException() {
        distribution.setNumeratorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedom_negativeValue_throwsException() {
        distribution.setNumeratorDegreesOfFreedom(-5.0);
    }

    // ---------- Denominator degrees of freedom getters/setters ----------

    @Test
    public void testSetGetDenominatorDegreesOfFreedom_normalValue_setsAndGetsCorrectly() {
        distribution.setDenominatorDegreesOfFreedom(12.0);
        assertEquals(12.0, distribution.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedom_zeroValue_throwsException() {
        distribution.setDenominatorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedom_negativeValue_throwsException() {
        distribution.setDenominatorDegreesOfFreedom(-3.0);
    }
}
