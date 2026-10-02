import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChiSquareTestImplTest {

    private ChiSquareTestImpl testStatistic;

    @Before
    public void setUp() {
        testStatistic = new ChiSquareTestImpl();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsInstance_notNull() {
        ChiSquareTestImpl instance = new ChiSquareTestImpl();
        assertNotNull(instance);
    }

    @Test
    public void testConstructorWithDistribution_createsInstance_notNull() {
        ChiSquaredDistribution dist = new ChiSquaredDistributionImpl(2.0);
        ChiSquareTestImpl instance = new ChiSquareTestImpl(dist);
        assertNotNull(instance);
    }

    @Test
    public void testSetDistribution_validDistribution_noException() {
        ChiSquaredDistribution dist = new ChiSquaredDistributionImpl(3.0);
        testStatistic.setDistribution(dist);
        // no exception expected
        assertTrue(true);
    }

    // ---------- chiSquare(double[], long[]) ----------

    @Test
    public void testChiSquare_typicalInput_returnsExpectedValue() {
        long[] observed = {10, 10, 10, 10};
        double[] expected = {10.0, 10.0, 10.0, 10.0};
        double result = testStatistic.chiSquare(expected, observed);
        assertEquals(0.0, result, 1e-9);
    }

    @Test
    public void testChiSquare_differentValues_returnsPositiveValue() {
        long[] observed = {10, 20, 30, 40};
        double[] expected = {15.0, 15.0, 15.0, 15.0};
        double result = testStatistic.chiSquare(expected, observed);
        assertTrue(result > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_expectedLengthLessThanTwo_throwsException() {
        long[] observed = {10};
        double[] expected = {10.0};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_mismatchedLengths_throwsException() {
        long[] observed = {10, 20, 30};
        double[] expected = {10.0, 20.0};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_negativeObserved_throwsException() {
        long[] observed = {-1, 20, 30};
        double[] expected = {10.0, 20.0, 30.0};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_nonPositiveExpected_throwsException() {
        long[] observed = {10, 20, 30};
        double[] expected = {0.0, 20.0, 30.0};
        testStatistic.chiSquare(expected, observed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquare_negativeExpected_throwsException() {
        long[] observed = {10, 20, 30};
        double[] expected = {-5.0, 20.0, 30.0};
        testStatistic.chiSquare(expected, observed);
    }

    // ---------- chiSquareTest(double[], long[]) ----------

    @Test
    public void testChiSquareTest_typicalInput_returnsPValueBetweenZeroAndOne() throws MathException {
        long[] observed = {10, 10, 10, 10};
        double[] expected = {10.0, 10.0, 10.0, 10.0};
        double pValue = testStatistic.chiSquareTest(expected, observed);
        assertTrue(pValue >= 0.0 && pValue <= 1.0);
    }

    @Test
    public void testChiSquareTest_differentValues_returnsValidPValue() throws MathException {
        long[] observed = {10, 20, 30, 40};
        double[] expected = {15.0, 15.0, 15.0, 15.0};
        double pValue = testStatistic.chiSquareTest(expected, observed);
        assertTrue(pValue >= 0.0 && pValue <= 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTest_invalidInput_throwsException() throws MathException {
        long[] observed = {10};
        double[] expected = {10.0};
        testStatistic.chiSquareTest(expected, observed);
    }

    // ---------- chiSquareTest(double[], long[], double alpha) ----------

    @Test
    public void testChiSquareTestWithAlpha_typicalInput_returnsBoolean() throws MathException {
        long[] observed = {10, 20, 30, 40};
        double[] expected = {15.0, 15.0, 15.0, 15.0};
        boolean result = testStatistic.chiSquareTest(expected, observed, 0.05);
        assertNotNull(result);
    }

    @Test
    public void testChiSquareTestWithAlpha_boundaryAlphaHalf_returnsBoolean() throws MathException {
        long[] observed = {10, 20, 30, 40};
        double[] expected = {15.0, 15.0, 15.0, 15.0};
        boolean result = testStatistic.chiSquareTest(expected, observed, 0.5);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestWithAlpha_zeroAlpha_throwsException() throws MathException {
        long[] observed = {10, 20, 30, 40};
        double[] expected = {15.0, 15.0, 15.0, 15.0};
        testStatistic.chiSquareTest(expected, observed, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestWithAlpha_negativeAlpha_throwsException() throws MathException {
        long[] observed = {10, 20, 30, 40};
        double[] expected = {15.0, 15.0, 15.0, 15.0};
        testStatistic.chiSquareTest(expected, observed, -0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestWithAlpha_alphaGreaterThanHalf_throwsException() throws MathException {
        long[] observed = {10, 20, 30, 40};
        double[] expected = {15.0, 15.0, 15.0, 15.0};
        testStatistic.chiSquareTest(expected, observed, 0.6);
    }

    // ---------- chiSquare(long[][]) ----------

    @Test
    public void testChiSquareTwoWayTable_typicalInput_returnsExpectedValue() {
        long[][] counts = {{10, 20}, {30, 40}};
        double result = testStatistic.chiSquare(counts);
        assertTrue(result >= 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayTable_tooFewRows_throwsException() {
        long[][] counts = {{10, 20}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayTable_tooFewColumns_throwsException() {
        long[][] counts = {{10}, {20}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayTable_notRectangular_throwsException() {
        long[][] counts = {{10, 20}, {30, 40, 50}};
        testStatistic.chiSquare(counts);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayTable_negativeEntries_throwsException() {
        long[][] counts = {{10, -20}, {30, 40}};
        testStatistic.chiSquare(counts);
    }

    // ---------- chiSquareTest(long[][]) ----------

    @Test
    public void testChiSquareTestTwoWayTable_typicalInput_returnsValidPValue() throws MathException {
        long[][] counts = {{10, 20}, {30, 40}};
        double pValue = testStatistic.chiSquareTest(counts);
        assertTrue(pValue >= 0.0 && pValue <= 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestTwoWayTable_invalidInput_throwsException() throws MathException {
        long[][] counts = {{10, 20}};
        testStatistic.chiSquareTest(counts);
    }

    // ---------- chiSquareTest(long[][], double alpha) ----------

    @Test
    public void testChiSquareTestTwoWayTableWithAlpha_typicalInput_returnsBoolean() throws MathException {
        long[][] counts = {{10, 20}, {30, 40}};
        boolean result = testStatistic.chiSquareTest(counts, 0.05);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestTwoWayTableWithAlpha_zeroAlpha_throwsException() throws MathException {
        long[][] counts = {{10, 20}, {30, 40}};
        testStatistic.chiSquareTest(counts, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestTwoWayTableWithAlpha_alphaGreaterThanHalf_throwsException() throws MathException {
        long[][] counts = {{10, 20}, {30, 40}};
        testStatistic.chiSquareTest(counts, 0.6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestTwoWayTableWithAlpha_negativeAlpha_throwsException() throws MathException {
        long[][] counts = {{10, 20}, {30, 40}};
        testStatistic.chiSquareTest(counts, -0.1);
    }

    // ---------- chiSquareDataSetsComparison(long[], long[]) ----------

    @Test
    public void testChiSquareDataSetsComparison_equalCounts_returnsValue() {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {10, 20, 30};
        double result = testStatistic.chiSquareDataSetsComparison(observed1, observed2);
        assertEquals(0.0, result, 1e-9);
    }

    @Test
    public void testChiSquareDataSetsComparison_unequalCounts_returnsPositiveValue() {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {15, 25, 35};
        double result = testStatistic.chiSquareDataSetsComparison(observed1, observed2);
        assertTrue(result >= 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_tooShortArrays_throwsException() {
        long[] observed1 = {10};
        long[] observed2 = {20};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_mismatchedLengths_throwsException() {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {10, 20};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_negativeCounts_throwsException() {
        long[] observed1 = {-10, 20, 30};
        long[] observed2 = {10, 20, 30};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_bothSumsZero_throwsException() {
        long[] observed1 = {0, 0, 0};
        long[] observed2 = {0, 0, 0};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparison_bothZeroAtSameIndex_throwsException() {
        long[] observed1 = {0, 20, 30};
        long[] observed2 = {0, 20, 30};
        testStatistic.chiSquareDataSetsComparison(observed1, observed2);
    }

    // ---------- chiSquareTestDataSetsComparison(long[], long[]) ----------

    @Test
    public void testChiSquareTestDataSetsComparison_typicalInput_returnsValidPValue() throws MathException {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {15, 25, 35};
        double pValue = testStatistic.chiSquareTestDataSetsComparison(observed1, observed2);
        assertTrue(pValue >= 0.0 && pValue <= 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparison_invalidInput_throwsException() throws MathException {
        long[] observed1 = {10};
        long[] observed2 = {20};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2);
    }

    // ---------- chiSquareTestDataSetsComparison(long[], long[], double alpha) ----------

    @Test
    public void testChiSquareTestDataSetsComparisonWithAlpha_typicalInput_returnsBoolean() throws MathException {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {15, 25, 35};
        boolean result = testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.05);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonWithAlpha_zeroAlpha_throwsException() throws MathException {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {15, 25, 35};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonWithAlpha_alphaGreaterThanHalf_throwsException() throws MathException {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {15, 25, 35};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, 0.6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonWithAlpha_negativeAlpha_throwsException() throws MathException {
        long[] observed1 = {10, 20, 30};
        long[] observed2 = {15, 25, 35};
        testStatistic.chiSquareTestDataSetsComparison(observed1, observed2, -0.1);
    }
}
