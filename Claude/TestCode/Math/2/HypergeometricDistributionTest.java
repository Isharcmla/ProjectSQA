import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

public class HypergeometricDistributionTest {

    private HypergeometricDistribution dist;

    @Before
    public void setUp() {
        // population=10, numberOfSuccesses=5, sampleSize=5
        dist = new HypergeometricDistribution(10, 5, 5);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalParams_createsInstance() {
        HypergeometricDistribution d = new HypergeometricDistribution(20, 10, 5);
        Assert.assertEquals(20, d.getPopulationSize());
        Assert.assertEquals(10, d.getNumberOfSuccesses());
        Assert.assertEquals(5, d.getSampleSize());
    }

    @Test
    public void testConstructor_withRandomGenerator_createsInstance() {
        RandomGenerator rng = new Well19937c();
        HypergeometricDistribution d = new HypergeometricDistribution(rng, 10, 4, 3);
        Assert.assertEquals(10, d.getPopulationSize());
        Assert.assertEquals(4, d.getNumberOfSuccesses());
        Assert.assertEquals(3, d.getSampleSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_populationSizeZero_throwsException() {
        new HypergeometricDistribution(0, 0, 0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_populationSizeNegative_throwsException() {
        new HypergeometricDistribution(-5, 2, 2);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_numberOfSuccessesNegative_throwsException() {
        new HypergeometricDistribution(10, -1, 5);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_sampleSizeNegative_throwsException() {
        new HypergeometricDistribution(10, 5, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_numberOfSuccessesGreaterThanPopulation_throwsException() {
        new HypergeometricDistribution(10, 11, 5);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_sampleSizeGreaterThanPopulation_throwsException() {
        new HypergeometricDistribution(10, 5, 11);
    }

    // ---------- Getter tests ----------

    @Test
    public void testGetNumberOfSuccesses_normalParams_returnsCorrectValue() {
        Assert.assertEquals(5, dist.getNumberOfSuccesses());
    }

    @Test
    public void testGetPopulationSize_normalParams_returnsCorrectValue() {
        Assert.assertEquals(10, dist.getPopulationSize());
    }

    @Test
    public void testGetSampleSize_normalParams_returnsCorrectValue() {
        Assert.assertEquals(5, dist.getSampleSize());
    }

    // ---------- probability() tests ----------

    @Test
    public void testProbability_withinDomain_returnsPositiveValue() {
        double p = dist.probability(2);
        Assert.assertTrue(p > 0.0);
        Assert.assertTrue(p <= 1.0);
    }

    @Test
    public void testProbability_belowLowerDomain_returnsZero() {
        // lower domain = max(0, m-(n-k)) = max(0, 5-(10-5)) = 0
        // use a case where lower domain > 0
        HypergeometricDistribution d = new HypergeometricDistribution(10, 8, 8);
        // lower domain = max(0, 8-(10-8)) = 6
        double p = d.probability(0);
        Assert.assertEquals(0.0, p, 0.0);
    }

    @Test
    public void testProbability_aboveUpperDomain_returnsZero() {
        // upper domain = min(k, m) = min(5,5)=5
        double p = dist.probability(6);
        Assert.assertEquals(0.0, p, 0.0);
    }

    @Test
    public void testProbability_atLowerBoundaryOfDomain_returnsPositiveValue() {
        int lower = dist.getSupportLowerBound();
        double p = dist.probability(lower);
        Assert.assertTrue(p >= 0.0);
    }

    @Test
    public void testProbability_atUpperBoundaryOfDomain_returnsPositiveValue() {
        int upper = dist.getSupportUpperBound();
        double p = dist.probability(upper);
        Assert.assertTrue(p >= 0.0);
    }

    // ---------- cumulativeProbability() tests ----------

    @Test
    public void testCumulativeProbability_belowLowerDomain_returnsZero() {
        double cp = dist.cumulativeProbability(-1);
        Assert.assertEquals(0.0, cp, 0.0);
    }

    @Test
    public void testCumulativeProbability_atOrAboveUpperDomain_returnsOne() {
        double cp = dist.cumulativeProbability(5);
        Assert.assertEquals(1.0, cp, 1e-9);
    }

    @Test
    public void testCumulativeProbability_aboveUpperDomain_returnsOne() {
        double cp = dist.cumulativeProbability(100);
        Assert.assertEquals(1.0, cp, 1e-9);
    }

    @Test
    public void testCumulativeProbability_withinDomain_returnsValueBetweenZeroAndOne() {
        double cp = dist.cumulativeProbability(2);
        Assert.assertTrue(cp >= 0.0 && cp <= 1.0);
    }

    @Test
    public void testCumulativeProbability_atLowerDomain_returnsPositiveValue() {
        int lower = dist.getSupportLowerBound();
        double cp = dist.cumulativeProbability(lower);
        Assert.assertTrue(cp > 0.0);
    }

    // ---------- upperCumulativeProbability() tests ----------

    @Test
    public void testUpperCumulativeProbability_atOrBelowLowerDomain_returnsOne() {
        double ucp = dist.upperCumulativeProbability(0);
        Assert.assertEquals(1.0, ucp, 1e-9);
    }

    @Test
    public void testUpperCumulativeProbability_belowLowerDomain_returnsOne() {
        double ucp = dist.upperCumulativeProbability(-5);
        Assert.assertEquals(1.0, ucp, 1e-9);
    }

    @Test
    public void testUpperCumulativeProbability_aboveUpperDomain_returnsZero() {
        double ucp = dist.upperCumulativeProbability(100);
        Assert.assertEquals(0.0, ucp, 0.0);
    }

    @Test
    public void testUpperCumulativeProbability_withinDomain_returnsValueBetweenZeroAndOne() {
        double ucp = dist.upperCumulativeProbability(3);
        Assert.assertTrue(ucp >= 0.0 && ucp <= 1.0);
    }

    @Test
    public void testUpperCumulativeProbability_atUpperDomainBoundary_returnsSmallPositiveValue() {
        int upper = dist.getSupportUpperBound();
        double ucp = dist.upperCumulativeProbability(upper);
        Assert.assertTrue(ucp > 0.0);
    }

    // ---------- getNumericalMean() tests ----------

    @Test
    public void testGetNumericalMean_normalParams_returnsCorrectValue() {
        // mean = n*m/N = 5*5/10 = 2.5
        double mean = dist.getNumericalMean();
        Assert.assertEquals(2.5, mean, 1e-9);
    }

    // ---------- getNumericalVariance() tests ----------

    @Test
    public void testGetNumericalVariance_normalParams_returnsCorrectValue() {
        // variance = [n*m*(N-n)*(N-m)] / [N^2*(N-1)]
        // = [5*5*(10-5)*(10-5)] / [100*9] = [5*5*5*5]/900 = 625/900
        double expected = 625.0 / 900.0;
        double variance = dist.getNumericalVariance();
        Assert.assertEquals(expected, variance, 1e-9);
    }

    @Test
    public void testGetNumericalVariance_calledTwice_returnsCachedValue() {
        double v1 = dist.getNumericalVariance();
        double v2 = dist.getNumericalVariance();
        Assert.assertEquals(v1, v2, 0.0);
    }

    // ---------- getSupportLowerBound() tests ----------

    @Test
    public void testGetSupportLowerBound_normalParams_returnsCorrectValue() {
        // max(0, n+m-N) = max(0, 5+5-10) = 0
        Assert.assertEquals(0, dist.getSupportLowerBound());
    }

    @Test
    public void testGetSupportLowerBound_withLargeSuccessAndSample_returnsPositiveValue() {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 8, 8);
        // max(0, 8+8-10) = 6
        Assert.assertEquals(6, d.getSupportLowerBound());
    }

    // ---------- getSupportUpperBound() tests ----------

    @Test
    public void testGetSupportUpperBound_normalParams_returnsCorrectValue() {
        // min(m,n) = min(5,5) = 5
        Assert.assertEquals(5, dist.getSupportUpperBound());
    }

    @Test
    public void testGetSupportUpperBound_withDifferentSuccessAndSample_returnsCorrectValue() {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 3, 7);
        // min(3,7) = 3
        Assert.assertEquals(3, d.getSupportUpperBound());
    }

    // ---------- isSupportConnected() tests ----------

    @Test
    public void testIsSupportConnected_alwaysReturnsTrue() {
        Assert.assertTrue(dist.isSupportConnected());
    }

    // ---------- Edge case: minimal valid distribution ----------

    @Test
    public void testConstructor_minimalValidParams_createsInstance() {
        HypergeometricDistribution d = new HypergeometricDistribution(1, 0, 0);
        Assert.assertEquals(1, d.getPopulationSize());
        Assert.assertEquals(0, d.getNumberOfSuccesses());
        Assert.assertEquals(0, d.getSampleSize());
    }

    @Test
    public void testProbability_minimalDistribution_returnsOneAtZero() {
        HypergeometricDistribution d = new HypergeometricDistribution(1, 0, 0);
        double p = d.probability(0);
        Assert.assertEquals(1.0, p, 1e-9);
    }

    @Test
    public void testCumulativeProbability_minimalDistribution_returnsOneAtZero() {
        HypergeometricDistribution d = new HypergeometricDistribution(1, 0, 0);
        double cp = d.cumulativeProbability(0);
        Assert.assertEquals(1.0, cp, 1e-9);
    }

    // ---------- Sum of probabilities over domain should be ~1 ----------

    @Test
    public void testProbability_sumOverDomain_approximatelyOne() {
        int lower = dist.getSupportLowerBound();
        int upper = dist.getSupportUpperBound();
        double sum = 0.0;
        for (int i = lower; i <= upper; i++) {
            sum += dist.probability(i);
        }
        Assert.assertEquals(1.0, sum, 1e-9);
    }
}
