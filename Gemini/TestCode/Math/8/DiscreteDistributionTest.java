package org.apache.commons.math3.distribution;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class DiscreteDistributionTest {

    private static final double EPSILON = 1e-9;

    @Test
    public void testConstructor_singleArgument_success() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", 3.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        Assert.assertNotNull(distribution);
        Assert.assertEquals(0.25, distribution.probability("A"), EPSILON);
        Assert.assertEquals(0.75, distribution.probability("B"), EPSILON);
    }

    @Test
    public void testConstructor_withRng_success() {
        List<Pair<Integer, Double>> samples = new ArrayList<Pair<Integer, Double>>();
        samples.add(new Pair<Integer, Double>(1, 2.0));
        samples.add(new Pair<Integer, Double>(2, 8.0));

        Well19937c rng = new Well19937c(42L);
        DiscreteDistribution<Integer> distribution = new DiscreteDistribution<Integer>(rng, samples);

        Assert.assertNotNull(distribution);
        Assert.assertEquals(0.2, distribution.probability(1), EPSILON);
        Assert.assertEquals(0.8, distribution.probability(2), EPSILON);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_negativeProbability_throwsNotPositiveException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", -0.5));

        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_allZeroProbabilities_throwsMathArithmeticException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.0));
        samples.add(new Pair<String, Double>("B", 0.0));

        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_infiniteProbability_throwsMathIllegalArgumentException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", Double.POSITIVE_INFINITY));

        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_nanProbability_throwsMathIllegalArgumentException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", Double.NaN));

        new DiscreteDistribution<String>(samples);
    }

    @Test
    public void testReseedRandomGenerator_reproducibleSampling() {
        List<Pair<Integer, Double>> samples = new ArrayList<Pair<Integer, Double>>();
        samples.add(new Pair<Integer, Double>(1, 0.5));
        samples.add(new Pair<Integer, Double>(2, 0.5));

        DiscreteDistribution<Integer> distribution = new DiscreteDistribution<Integer>(samples);

        distribution.reseedRandomGenerator(12345L);
        Integer[] sample1 = distribution.sample(5);

        distribution.reseedRandomGenerator(12345L);
        Integer[] sample2 = distribution.sample(5);

        Assert.assertArrayEquals(sample1, sample2);
    }

    @Test
    public void testProbability_existingAndNonExistingElements() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 2.0));
        samples.add(new Pair<String, Double>("B", 3.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        Assert.assertEquals(0.4, distribution.probability("A"), EPSILON);
        Assert.assertEquals(0.6, distribution.probability("B"), EPSILON);
        Assert.assertEquals(0.0, distribution.probability("C"), EPSILON);
        Assert.assertEquals(0.0, distribution.probability(""), EPSILON);
        Assert.assertEquals(0.0, distribution.probability(null), EPSILON);
    }

    @Test
    public void testProbability_duplicateKeys_accumulatesProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", 2.0));
        samples.add(new Pair<String, Double>("A", 3.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        Assert.assertEquals(4.0 / 6.0, distribution.probability("A"), EPSILON);
        Assert.assertEquals(2.0 / 6.0, distribution.probability("B"), EPSILON);
    }

    @Test
    public void testProbability_withNullKey_returnsCorrectProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>(null, 2.0));
        samples.add(new Pair<String, Double>("A", 3.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        Assert.assertEquals(0.4, distribution.probability(null), EPSILON);
        Assert.assertEquals(0.6, distribution.probability("A"), EPSILON);
        Assert.assertEquals(0.0, distribution.probability("B"), EPSILON);
    }

    @Test
    public void testGetSamples_returnsNormalizedProbabilities() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("One", 10.0));
        samples.add(new Pair<String, Double>("Two", 30.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);
        List<Pair<String, Double>> resultSamples = distribution.getSamples();

        Assert.assertEquals(2, resultSamples.size());
        Assert.assertEquals("One", resultSamples.get(0).getKey());
        Assert.assertEquals(0.25, resultSamples.get(0).getValue(), EPSILON);
        Assert.assertEquals("Two", resultSamples.get(1).getKey());
        Assert.assertEquals(0.75, resultSamples.get(1).getValue(), EPSILON);
    }

    @Test
    public void testSample_singleValue_returnsExpectedValue() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("Single", 1.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        String sample = distribution.sample();
        Assert.assertEquals("Single", sample);
    }

    @Test
    public void testSample_multipleSamples_returnsCorrectArray() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.5));
        samples.add(new Pair<String, Double>("B", 0.5));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        String[] result = distribution.sample(10);
        Assert.assertNotNull(result);
        Assert.assertEquals(10, result.length);

        for (String item : result) {
            Assert.assertTrue("A".equals(item) || "B".equals(item));
        }
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSample_zeroSampleSize_throwsNotStrictlyPositiveException() {
        List<Pair<Integer, Double>> samples = new ArrayList<Pair<Integer, Double>>();
        samples.add(new Pair<Integer, Double>(1, 1.0));

        DiscreteDistribution<Integer> distribution = new DiscreteDistribution<Integer>(samples);
        distribution.sample(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSample_negativeSampleSize_throwsNotStrictlyPositiveException() {
        List<Pair<Integer, Double>> samples = new ArrayList<Pair<Integer, Double>>();
        samples.add(new Pair<Integer, Double>(1, 1.0));

        DiscreteDistribution<Integer> distribution = new DiscreteDistribution<Integer>(samples);
        distribution.sample(-5);
    }
}
