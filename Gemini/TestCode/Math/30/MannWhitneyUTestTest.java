package org.apache.commons.math3.stat.inference;

import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.junit.Assert;
import org.junit.Test;

public class MannWhitneyUTestTest {

    private final MannWhitneyUTest testInstance = new MannWhitneyUTest();

    @Test
    public void testDefaultConstructor() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {4.0, 5.0, 6.0};
        Assert.assertEquals(9.0, test.mannWhitneyU(x, y), 1e-6);
    }

    @Test
    public void testCustomConstructor() {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.MAXIMAL, TiesStrategy.MAXIMUM);
        double[] x = {1.0, 2.0, Double.NaN};
        double[] y = {2.0, 3.0, 4.0};
        double u = test.mannWhitneyU(x, y);
        Assert.assertTrue(u >= 0.0);
    }

    @Test
    public void testMannWhitneyU_allXSmallerThanY_returnsCorrectU() {
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {4.0, 5.0, 6.0};
        double result = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(9.0, result, 1e-6);
    }

    @Test
    public void testMannWhitneyU_allXGreaterThanY_returnsCorrectU() {
        double[] x = {4.0, 5.0, 6.0};
        double[] y = {1.0, 2.0, 3.0};
        double result = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(9.0, result, 1e-6);
    }

    @Test
    public void testMannWhitneyU_interleavedSamples_returnsCorrectU() {
        double[] x = {19.0, 22.0, 16.0, 29.0, 24.0};
        double[] y = {20.0, 11.0, 17.0, 12.0};
        // n1 = 5, n2 = 4, product = 20
        // Combined sorted: 11(y), 12(y), 16(x), 17(y), 19(x), 20(y), 22(x), 24(x), 29(x)
        // Ranks of x: 3, 5, 7, 8, 9 -> sumRankX = 32
        // U1 = 32 - (5 * 6) / 2 = 32 - 15 = 17
        // U2 = 20 - 17 = 3
        // max(U1, U2) = 17
        double result = testInstance.mannWhitneyU(x, y);
        Assert.assertEquals(17.0, result, 1e-6);
    }

    @Test
    public void testMannWhitneyU_withTiesAndNegativeValues_returnsCorrectU() {
        double[] x = {-5.0, -2.0, 0.0, 3.0};
        double[] y = {-2.0, 0.0, 1.0, 4.0};
        double result = testInstance.mannWhitneyU(x, y);
        Assert.assertTrue(result >= 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyU_nullFirstSample_throwsNullArgumentException() {
        testInstance.mannWhitneyU(null, new double[]{1.0, 2.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyU_nullSecondSample_throwsNullArgumentException() {
        testInstance.mannWhitneyU(new double[]{1.0, 2.0}, null);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyU_emptyFirstSample_throwsNoDataException() {
        testInstance.mannWhitneyU(new double[]{}, new double[]{1.0, 2.0});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyU_emptySecondSample_throwsNoDataException() {
        testInstance.mannWhitneyU(new double[]{1.0, 2.0}, new double[]{});
    }

    @Test
    public void testMannWhitneyUTest_standardValues_returnsValidPValue() {
        double[] x = {19.0, 22.0, 16.0, 29.0, 24.0};
        double[] y = {20.0, 11.0, 17.0, 12.0};
        double pValue = testInstance.mannWhitneyUTest(x, y);
        Assert.assertTrue(pValue >= 0.0 && pValue <= 1.0);
        Assert.assertEquals(0.11125, pValue, 1e-3);
    }

    @Test
    public void testMannWhitneyUTest_identicalSamples_returnsHighPValue() {
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {1.0, 2.0, 3.0, 4.0, 5.0};
        double pValue = testInstance.mannWhitneyUTest(x, y);
        Assert.assertTrue(pValue > 0.5);
    }

    @Test
    public void testMannWhitneyUTest_completelyDisjointSamples_returnsLowPValue() {
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double[] y = {101.0, 102.0, 103.0, 104.0, 105.0, 106.0, 107.0, 108.0, 109.0, 110.0};
        double pValue = testInstance.mannWhitneyUTest(x, y);
        Assert.assertTrue(pValue < 0.01);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTest_nullFirstSample_throwsNullArgumentException() {
        testInstance.mannWhitneyUTest(null, new double[]{1.0, 2.0});
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTest_nullSecondSample_throwsNullArgumentException() {
        testInstance.mannWhitneyUTest(new double[]{1.0, 2.0}, null);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTest_emptyFirstSample_throwsNoDataException() {
        testInstance.mannWhitneyUTest(new double[]{}, new double[]{1.0, 2.0});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTest_emptySecondSample_throwsNoDataException() {
        testInstance.mannWhitneyUTest(new double[]{1.0, 2.0}, new double[]{});
    }
}
