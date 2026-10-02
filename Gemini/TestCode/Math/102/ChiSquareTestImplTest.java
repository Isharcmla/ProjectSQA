package org.apache.commons.math.stat.inference;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.DistributionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChiSquareTestImplTest {

    private ChiSquareTestImpl testStatistic;

    @Before
    public void setUp() {
        testStatistic = new ChiSquareTestImpl();
    }

    @Test
    public void testConstructor_withDistributionParameter() {
        ChiSquaredDistribution customDist = new ChiSquaredDistributionImpl(2.0);
        ChiSquareTestImpl customTest = new ChiSquareTestImpl(customDist);
        Assert.assertNotNull(customTest);
    }

    @Test
    public void testChiSquare_validInput_returnsCorrectStatistic() {
        double[] expected = {500, 500};
        long[] observed = {400, 600};
        double stat = testStatistic.chiSquare(expected, observed);
        Assert.assertEquals(40.0, stat, 1e-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_lengthLessThanTwo_throwsIllegalArgumentException() {
        double[] expected = {100.0};
        long[] observed = {100};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_mismatchedArrayLengths_throwsIllegalArgumentException() {
        double[] expected = {10.0, 20.0, 30.0};
        long[] observed = {10, 20};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_expectedArrayContainsZero_throwsIllegalArgumentException() {
        double[] expected = {10.0, 0.0};
        long[] observed = {10, 20};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_expectedArrayContainsNegative_throwsIllegalArgumentException() {
        double[] expected = {10.0, -5.0};
        long[] observed = {10, 20};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_observedArrayContainsNegative_throwsIllegalArgumentException() {
        double[] expected = {10.0, 20.0};
        long[] observed = {10, -5};
        testStatistic.chiSquare(expected, observed);
    }

    @Test
    public void testChiSquareTest_validInput_returnsCorrectPValue() throws MathException {
        double[] expected = {500, 500};
        long[] observed = {500, 500};
        double pValue = testStatistic.chiSquareTest(expected, observed);
        Assert.assertEquals(1.0, pValue, 1e-5);
    }

    @Test
    public void testChiSquareTest_withAlpha_returnsExpectedBoolean() throws MathException {
        double[] expected = {500, 500};
        long[] observed = {400, 600};
        boolean reject = testStatistic.chiSquareTest(expected, observed, 0.05);
        Assert.assertTrue(reject);

        long[] observedEqual = {500, 500};
        boolean rejectEqual = testStatistic.chiSquareTest(expected, observedEqual, 0.05);
        Assert.assertFalse(rejectEqual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_alphaZero_throwsIllegalArgumentException() throws MathException {
        double[] expected = {500, 500};
        long[] observed = {400, 600};
        testStatistic.chiSquareTest(expected, observed, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_alphaNegative_throwsIllegalArgumentException() throws MathException {
        double[] expected = {500, 500};
        long[] observed = {400, 600};
        testStatistic.chiSquareTest(expected, observed, -0.05);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_alphaGreaterThanHalf_throwsIllegalArgumentException() throws MathException {
        double[] expected = {500, 500};
        long[] observed = {400, 600};
        testStatistic.chiSquareTest(expected, observed, 0.51);
    }

    @Test
    public void testChiSquareMatrix_validInput_returnsCorrectStatistic() {
        long[][] counts = {{40, 22, 18}, {30, 28, 52}};
        double stat = testStatistic.chiSquare(counts);
        Assert.assertTrue(stat > 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareMatrix_lessThanTwoRows_throwsIllegalArgumentException() {
        long[][] counts = {{10, 20, 30}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareMatrix_lessThanTwoColumns_throwsIllegalArgumentException() {
        long[][] counts = {{10}, {20}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareMatrix_nonRectangular_throwsIllegalArgumentException() {
        long[][] counts = {{10, 20}, {30, 40, 50}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareMatrix_negativeEntry_throwsIllegalArgumentException() {
        long[][] counts = {{10, 20}, {30, -5}};
        testStatistic.chiSquare(counts);
    }

    @Test
    public void testChiSquareTestMatrix_validInput_returnsPValue() throws MathException {
        long[][] counts = {{40, 22, 18}, {30, 28, 52}};
        double pValue = testStatistic.chiSquareTest(counts);
        Assert.assertTrue(pValue >= 0.0 && pValue <= 1.0);
    }

    @Test
    public void testChiSquareTestMatrix_withAlpha_returnsExpectedBoolean() throws MathException {
        long[][] counts = {{40, 22, 18}, {30, 28, 52}};
        boolean reject = testStatistic.chiSquareTest(counts, 0.01);
        Assert.assertTrue(reject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestMatrix_alphaInvalidZero_throwsIllegalArgumentException() throws MathException {
        long[][] counts = {{10, 20}, {30, 40}};
        testStatistic.chiSquareTest(counts, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestMatrix_alphaInvalidTooLarge_throwsIllegalArgumentException() throws MathException {
        long[][] counts = {{10, 20}, {30, 40}};
        testStatistic.chiSquareTest(counts, 0.6);
    }

    @Test
    public void testChiSquareDataSetsComparison_equalTotalCounts_returnsCorrectStatistic() {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {5, 15, 14, 10};
        double stat = testStatistic.chiSquareDataSetsComparison(observed1, observed2);
        Assert.assertTrue(stat >= 0.0);
    }

    @Test
    public void testChiSquareDataSetsComparison_unequalTotalCounts_returnsCorrectStatistic() {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {15, 30, 25, 20};
        double stat = testStatistic.chiSquareDataSetsComparison(observed1, observed2);
        Assert.assertTrue(stat >= 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_lengthLessThanTwo_throwsIllegalArgumentException() {
        long[] observed1 = {10};
        long[] observed2 = {10};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_mismatchedLengths_throwsIllegalArgumentException() {
        long[] observed1 = {10, 20};
        long[] observed2 = {10, 20, 30};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_negativeObserved1_throwsIllegalArgumentException() {
        long[] observed1 = {-1, 20};
        long[] observed2 = {10, 20};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_negativeObserved2_throwsIllegalArgumentException() {
        long[] observed1 = {10, 20};
        long[] observed2 = {10, -5};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_allZerosInSample_throwsIllegalArgumentException() {
        long[] observed1 = {0, 0};
        long[] observed2 = {10, 20};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_bothZeroAtSameIndex_throwsIllegalArgumentException() {
        long[] observed1 = {0, 20};
        long[] observed2 = {0, 30};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test
    public void testChiSquareTestDataSetsComparison_validInput_returnsPValue() throws MathException {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {15, 30, 25, 20};
        double pValue = testStatistic.chiSquareTestDataSetsComparison(observed1, observed2);
        Assert.assertTrue(pValue >= 0.0 && pValue <= 1.0);
    }

    @Test
    public void testChiSquareTestDataSetsComparison_withAlpha_returnsExpectedBoolean() throws MathException {
        long[] observed1 = {10, 12, 12, 10};
        long[] observed2 = {15, 30, 25, 20};
        boolean reject = testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.05);
        Assert.assertFalse(reject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_alphaZero_throwsIllegalArgumentException() throws MathException {
        long[] observed1 = {10, 20};
        long[] observed2 = {15, 25};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_alphaTooLarge_throwsIllegalArgumentException() throws MathException {
        long[] observed1 = {10, 20};
        long[] observed2 = {15, 25};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.55);
    }

    @Test
    public void testSetDistribution_updatesDistribution() throws MathException {
        ChiSquaredDistribution customDist = new ChiSquaredDistributionImpl(5.0);
        testStatistic.setDistribution(customDist);

        double[] expected = {500, 500};
        long[] observed = {500, 500};
        double pValue = testStatistic.chiSquareTest(expected, observed);
        Assert.assertEquals(1.0, pValue, 1e-5);
    }

    @Test
    public void testGetDistributionFactory_returnsFactoryInstance() {
        DistributionFactory factory = testStatistic.getDistributionFactory();
        Assert.assertNotNull(factory);
    }
}
