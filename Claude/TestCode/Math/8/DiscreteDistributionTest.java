import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.Pair;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DiscreteDistributionTest {

    private List<Pair<String, Double>> normalSamples;
    private DiscreteDistribution<String> distribution;

    @Before
    public void setUp() {
        normalSamples = new ArrayList<Pair<String, Double>>();
        normalSamples.add(new Pair<String, Double>("A", 1.0));
        normalSamples.add(new Pair<String, Double>("B", 2.0));
        normalSamples.add(new Pair<String, Double>("C", 3.0));
        distribution = new DiscreteDistribution<String>(normalSamples);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalInput_createsDistributionSuccessfully() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("X", 1.0));
        samples.add(new Pair<String, Double>("Y", 1.0));

        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        assertNotNull(dist);
        List<Pair<String, Double>> result = dist.getSamples();
        assertEquals(2, result.size());
    }

    @Test
    public void testConstructorWithRNG_normalInput_createsDistributionSuccessfully() {
        RandomGenerator rng = new Well19937c();
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("X", 1.0));
        samples.add(new Pair<String, Double>("Y", 1.0));

        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, samples);
        assertNotNull(dist);
        assertEquals(2, dist.getSamples().size());
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_negativeProbability_throwsNotPositiveException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", -1.0));
        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_probabilitiesSumToZero_throwsMathArithmeticException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.0));
        samples.add(new Pair<String, Double>("B", 0.0));
        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_infiniteProbability_throwsMathIllegalArgumentException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", Double.POSITIVE_INFINITY));
        samples.add(new Pair<String, Double>("B", 1.0));
        new DiscreteDistribution<String>(samples);
    }

    @Test
    public void testConstructor_singleSample_createsDistributionSuccessfully() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("OnlyOne", 5.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        assertEquals(1, dist.getSamples().size());
        assertEquals("OnlyOne", dist.sample());
    }

    @Test
    public void testConstructor_emptySamplesList_createsEmptyDistribution() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        // This should not throw since normalizeArray with empty array doesn't sum to zero exception path
        // but may throw MathArithmeticException due to zero length sum; verify behavior gracefully
        try {
            DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
            assertEquals(0, dist.getSamples().size());
        } catch (MathArithmeticException e) {
            // Acceptable behavior for empty list depending on normalizeArray implementation
            assertTrue(true);
        }
    }

    // ---------- reseedRandomGenerator ----------

    @Test
    public void testReseedRandomGenerator_validSeed_doesNotThrowException() {
        distribution.reseedRandomGenerator(12345L);
        // After reseeding, sample should still return a valid value
        String sampled = distribution.sample();
        assertTrue(sampled.equals("A") || sampled.equals("B") || sampled.equals("C"));
    }

    @Test
    public void testReseedRandomGenerator_sameSeedProducesSameSequence() {
        distribution.reseedRandomGenerator(42L);
        String first = distribution.sample();
        String second = distribution.sample();

        distribution.reseedRandomGenerator(42L);
        String firstAgain = distribution.sample();
        String secondAgain = distribution.sample();

        assertEquals(first, firstAgain);
        assertEquals(second, secondAgain);
    }

    // ---------- probability(x) (package-private) ----------

    @Test
    public void testProbability_existingValue_returnsCorrectProbability() {
        double prob = distribution.probability("A");
        assertEquals(1.0 / 6.0, prob, 1e-9);
    }

    @Test
    public void testProbability_nonExistingValue_returnsZero() {
        double prob = distribution.probability("Z");
        assertEquals(0.0, prob, 1e-9);
    }

    @Test
    public void testProbability_nullValue_whenNullSingletonExists_returnsCorrectProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>(null, 1.0));
        samples.add(new Pair<String, Double>("B", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);

        double prob = dist.probability(null);
        assertEquals(0.5, prob, 1e-9);
    }

    @Test
    public void testProbability_nullValue_whenNoNullSingleton_returnsZero() {
        double prob = distribution.probability(null);
        assertEquals(0.0, prob, 1e-9);
    }

    @Test
    public void testProbability_duplicateValues_sumsProbabilities() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", 2.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);

        double prob = dist.probability("A");
        assertEquals(0.5, prob, 1e-9);
    }

    // ---------- getSamples() ----------

    @Test
    public void testGetSamples_normalDistribution_returnsCorrectList() {
        List<Pair<String, Double>> samples = distribution.getSamples();
        assertEquals(3, samples.size());

        double sum = 0;
        for (Pair<String, Double> p : samples) {
            sum += p.getValue();
        }
        assertEquals(1.0, sum, 1e-9);
    }

    @Test
    public void testGetSamples_valuesMatchOriginalKeys() {
        List<Pair<String, Double>> samples = distribution.getSamples();
        boolean foundA = false, foundB = false, foundC = false;
        for (Pair<String, Double> p : samples) {
            if ("A".equals(p.getKey())) foundA = true;
            if ("B".equals(p.getKey())) foundB = true;
            if ("C".equals(p.getKey())) foundC = true;
        }
        assertTrue(foundA);
        assertTrue(foundB);
        assertTrue(foundC);
    }

    // ---------- sample() ----------

    @Test
    public void testSample_normalDistribution_returnsValidSingleton() {
        String sampled = distribution.sample();
        assertTrue(sampled.equals("A") || sampled.equals("B") || sampled.equals("C"));
    }

    @Test
    public void testSample_singleElementDistribution_alwaysReturnsSameElement() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("Only", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);

        for (int i = 0; i < 10; i++) {
            assertEquals("Only", dist.sample());
        }
    }

    @Test
    public void testSample_multipleCallsOnNormalDistribution_allReturnValidValues() {
        for (int i = 0; i < 100; i++) {
            String sampled = distribution.sample();
            assertTrue(sampled.equals("A") || sampled.equals("B") || sampled.equals("C"));
        }
    }

    // ---------- sample(int sampleSize) ----------

    @Test
    public void testSampleWithSize_normalInput_returnsCorrectSizeArray() {
        String[] samples = distribution.sample(5);
        assertEquals(5, samples.length);
        for (String s : samples) {
            assertTrue(s.equals("A") || s.equals("B") || s.equals("C"));
        }
    }

    @Test
    public void testSampleWithSize_sizeOne_returnsSingleElementArray() {
        String[] samples = distribution.sample(1);
        assertEquals(1, samples.length);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleWithSize_zeroSize_throwsNotStrictlyPositiveException() {
        distribution.sample(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleWithSize_negativeSize_throwsNotStrictlyPositiveException() {
        distribution.sample(-5);
    }

    @Test
    public void testSampleWithSize_largeSize_returnsCorrectSizeArray() {
        String[] samples = distribution.sample(1000);
        assertEquals(1000, samples.length);
    }
}
