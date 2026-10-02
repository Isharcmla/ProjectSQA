package org.apache.commons.math.stat.descriptive.moment;

import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class VarianceTest {

    private static final double TOLERANCE = 10E-12;

    @Test
    public void testDefaultConstructor_initialState() {
        Variance v = new Variance();
        Assert.assertTrue(v.isBiasCorrected());
        Assert.assertEquals(0L, v.getN());
        Assert.assertTrue(Double.isNaN(v.getResult()));
    }

    @Test
    public void testConstructorWithBiasCorrected() {
        Variance vTrue = new Variance(true);
        Assert.assertTrue(vTrue.isBiasCorrected());

        Variance vFalse = new Variance(false);
        Assert.assertFalse(vFalse.isBiasCorrected());
    }

    @Test
    public void testConstructorWithExternalSecondMoment() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(m2);
        Assert.assertTrue(v.isBiasCorrected());
        Assert.assertFalse(v.incMoment);

        v.increment(10.0);
        Assert.assertEquals(0L, v.getN());

        m2.increment(10.0);
        m2.increment(20.0);
        Assert.assertEquals(2L, v.getN());
        Assert.assertEquals(50.0, v.getResult(), TOLERANCE);

        v.clear();
        Assert.assertEquals(2L, v.getN());
    }

    @Test
    public void testConstructorWithBiasAndExternalSecondMoment() {
        SecondMoment m2 = new SecondMoment();
        Variance v = new Variance(false, m2);
        Assert.assertFalse(v.isBiasCorrected());
        Assert.assertFalse(v.incMoment);

        m2.increment(10.0);
        m2.increment(20.0);
        Assert.assertEquals(2L, v.getN());
        Assert.assertEquals(25.0, v.getResult(), TOLERANCE);
    }

    @Test
    public void testCopyConstructor() {
        Variance original = new Variance(false);
        original.increment(2.0);
        original.increment(4.0);
        original.increment(6.0);

        Variance copy = new Variance(original);
        Assert.assertEquals(original.getN(), copy.getN());
        Assert.assertEquals(original.isBiasCorrected(), copy.isBiasCorrected());
        Assert.assertEquals(original.getResult(), copy.getResult(), TOLERANCE);
    }

    @Test
    public void testIncrementAndGetResult_sampleVariance() {
        Variance v = new Variance();
        v.increment(1.0);
        Assert.assertEquals(1L, v.getN());
        Assert.assertEquals(0.0, v.getResult(), TOLERANCE);

        v.increment(2.0);
        v.increment(3.0);
        v.increment(4.0);
        v.increment(5.0);
        Assert.assertEquals(5L, v.getN());
        Assert.assertEquals(2.5, v.getResult(), TOLERANCE);

        v.clear();
        Assert.assertEquals(0L, v.getN());
        Assert.assertTrue(Double.isNaN(v.getResult()));
    }

    @Test
    public void testIncrementAndGetResult_populationVariance() {
        Variance v = new Variance(false);
        v.increment(1.0);
        Assert.assertEquals(0.0, v.getResult(), TOLERANCE);

        v.increment(2.0);
        v.increment(3.0);
        v.increment(4.0);
        v.increment(5.0);
        Assert.assertEquals(5L, v.getN());
        Assert.assertEquals(2.0, v.getResult(), TOLERANCE);
    }

    @Test
    public void testSetBiasCorrected() {
        Variance v = new Variance();
        v.increment(1.0);
        v.increment(3.0);
        Assert.assertEquals(2.0, v.getResult(), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertFalse(v.isBiasCorrected());
        Assert.assertEquals(1.0, v.getResult(), TOLERANCE);
    }

    @Test
    public void testEvaluateArray_emptyAndSingleElement() {
        Variance v = new Variance();
        double[] empty = new double[0];
        Assert.assertTrue(Double.isNaN(v.evaluate(empty)));

        double[] single = new double[]{42.0};
        Assert.assertEquals(0.0, v.evaluate(single), TOLERANCE);
    }

    @Test
    public void testEvaluateArray_multipleElements() {
        Variance v = new Variance();
        double[] values = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        Assert.assertEquals(2.5, v.evaluate(values), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertEquals(2.0, v.evaluate(values), TOLERANCE);
    }

    @Test
    public void testEvaluateSubArray() {
        Variance v = new Variance();
        double[] values = new double[]{100.0, 1.0, 2.0, 3.0, 4.0, 5.0, 200.0};
        Assert.assertEquals(2.5, v.evaluate(values, 1, 5), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertEquals(2.0, v.evaluate(values, 1, 5), TOLERANCE);

        Assert.assertEquals(0.0, v.evaluate(values, 1, 1), TOLERANCE);
        Assert.assertTrue(Double.isNaN(v.evaluate(values, 1, 0)));
    }

    @Test(expected = NullArgumentException.class)
    public void testEvaluateArray_nullArray_throwsException() {
        Variance v = new Variance();
        v.evaluate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateSubArray_invalidRange_throwsException() {
        Variance v = new Variance();
        double[] values = new double[]{1.0, 2.0};
        v.evaluate(values, 1, 5);
    }

    @Test
    public void testEvaluateArrayWithMean() {
        Variance v = new Variance();
        double[] values = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        double mean = 3.0;

        Assert.assertEquals(2.5, v.evaluate(values, mean), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertEquals(2.0, v.evaluate(values, mean), TOLERANCE);

        double[] empty = new double[0];
        Assert.assertTrue(Double.isNaN(v.evaluate(empty, 0.0)));

        double[] single = new double[]{10.0};
        Assert.assertEquals(0.0, v.evaluate(single, 10.0), TOLERANCE);
    }

    @Test
    public void testEvaluateSubArrayWithMean() {
        Variance v = new Variance();
        double[] values = new double[]{99.0, 1.0, 2.0, 3.0, 4.0, 5.0, 99.0};
        double mean = 3.0;

        Assert.assertEquals(2.5, v.evaluate(values, mean, 1, 5), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertEquals(2.0, v.evaluate(values, mean, 1, 5), TOLERANCE);

        Assert.assertEquals(0.0, v.evaluate(values, mean, 1, 1), TOLERANCE);
        Assert.assertTrue(Double.isNaN(v.evaluate(values, mean, 1, 0)));
    }

    @Test
    public void testEvaluateWeighted() {
        Variance v = new Variance();
        double[] values = new double[]{1.0, 2.0, 3.0};
        double[] weights = new double[]{1.0, 2.0, 1.0};

        double expectedSample = 0.5;
        Assert.assertEquals(expectedSample, v.evaluate(values, weights), TOLERANCE);

        v.setBiasCorrected(false);
        double expectedPopulation = 0.375;
        Assert.assertEquals(expectedPopulation, v.evaluate(values, weights), TOLERANCE);
    }

    @Test
    public void testEvaluateWeighted_emptyAndSingle() {
        Variance v = new Variance();
        double[] emptyValues = new double[0];
        double[] emptyWeights = new double[0];
        Assert.assertTrue(Double.isNaN(v.evaluate(emptyValues, emptyWeights)));

        double[] singleValue = new double[]{5.0};
        double[] singleWeight = new double[]{2.0};
        Assert.assertEquals(0.0, v.evaluate(singleValue, singleWeight), TOLERANCE);
    }

    @Test
    public void testEvaluateWeightedSubArray() {
        Variance v = new Variance();
        double[] values = new double[]{10.0, 1.0, 2.0, 3.0, 20.0};
        double[] weights = new double[]{10.0, 1.0, 2.0, 1.0, 20.0};

        Assert.assertEquals(0.5, v.evaluate(values, weights, 1, 3), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertEquals(0.375, v.evaluate(values, weights, 1, 3), TOLERANCE);

        Assert.assertEquals(0.0, v.evaluate(values, weights, 1, 1), TOLERANCE);
        Assert.assertTrue(Double.isNaN(v.evaluate(values, weights, 1, 0)));
    }

    @Test
    public void testEvaluateWeightedWithMean() {
        Variance v = new Variance();
        double[] values = new double[]{1.0, 2.0, 3.0};
        double[] weights = new double[]{1.0, 2.0, 1.0};
        double weightedMean = 2.0;

        Assert.assertEquals(0.5, v.evaluate(values, weights, weightedMean), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertEquals(0.375, v.evaluate(values, weights, weightedMean), TOLERANCE);

        double[] singleValue = new double[]{5.0};
        double[] singleWeight = new double[]{2.0};
        Assert.assertEquals(0.0, v.evaluate(singleValue, singleWeight, 5.0), TOLERANCE);

        double[] emptyValues = new double[0];
        double[] emptyWeights = new double[0];
        Assert.assertTrue(Double.isNaN(v.evaluate(emptyValues, emptyWeights, 0.0)));
    }

    @Test
    public void testEvaluateWeightedSubArrayWithMean() {
        Variance v = new Variance();
        double[] values = new double[]{9.0, 1.0, 2.0, 3.0, 9.0};
        double[] weights = new double[]{9.0, 1.0, 2.0, 1.0, 9.0};
        double weightedMean = 2.0;

        Assert.assertEquals(0.5, v.evaluate(values, weights, weightedMean, 1, 3), TOLERANCE);

        v.setBiasCorrected(false);
        Assert.assertEquals(0.375, v.evaluate(values, weights, weightedMean, 1, 3), TOLERANCE);

        Assert.assertEquals(0.0, v.evaluate(values, weights, weightedMean, 1, 1), TOLERANCE);
        Assert.assertTrue(Double.isNaN(v.evaluate(values, weights, weightedMean, 1, 0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeighted_nullValues_throwsException() {
        Variance v = new Variance();
        v.evaluate(null, new double[]{1.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeighted_nullWeights_throwsException() {
        Variance v = new Variance();
        v.evaluate(new double[]{1.0}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeighted_differentLengths_throwsException() {
        Variance v = new Variance();
        v.evaluate(new double[]{1.0, 2.0}, new double[]{1.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeighted_negativeWeight_throwsException() {
        Variance v = new Variance();
        v.evaluate(new double[]{1.0, 2.0}, new double[]{1.0, -1.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeighted_nanWeight_throwsException() {
        Variance v = new Variance();
        v.evaluate(new double[]{1.0, 2.0}, new double[]{1.0, Double.NaN});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateWeighted_infiniteWeight_throwsException() {
        Variance v = new Variance();
        v.evaluate(new double[]{1.0, 2.0}, new double[]{1.0, Double.POSITIVE_INFINITY});
    }

    @Test
    public void testCopyInstanceMethod() {
        Variance v = new Variance(false);
        v.increment(5.0);
        v.increment(15.0);

        Variance copy = v.copy();
        Assert.assertNotSame(v, copy);
        Assert.assertEquals(v.getN(), copy.getN());
        Assert.assertEquals(v.isBiasCorrected(), copy.isBiasCorrected());
        Assert.assertEquals(v.getResult(), copy.getResult(), TOLERANCE);
    }

    @Test
    public void testStaticCopy() {
        Variance src = new Variance(true);
        src.increment(10.0);
        src.increment(20.0);
        src.setData(new double[]{1.0, 2.0});

        Variance dest = new Variance(false);
        Variance.copy(src, dest);

        Assert.assertEquals(src.getN(), dest.getN());
        Assert.assertEquals(src.isBiasCorrected(), dest.isBiasCorrected());
        Assert.assertEquals(src.getResult(), dest.getResult(), TOLERANCE);
        Assert.assertArrayEquals(src.getData(), dest.getData(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testStaticCopy_nullSource_throwsException() {
        Variance dest = new Variance();
        Variance.copy(null, dest);
    }

    @Test(expected = NullArgumentException.class)
    public void testStaticCopy_nullDest_throwsException() {
        Variance src = new Variance();
        Variance.copy(src, null);
    }
}
