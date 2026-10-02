import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.MathException;

public class SimpleRegressionTest {

    private SimpleRegression regression;

    @Before
    public void setUp() {
        regression = new SimpleRegression();
    }

    // ---------- addData(double, double) ----------

    @Test
    public void testAddData_singlePoint_nIsOne() {
        regression.addData(1d, 2d);
        assertEquals(1L, regression.getN());
    }

    @Test
    public void testAddData_multiplePoints_nIncrementsCorrectly() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(3L, regression.getN());
    }

    @Test
    public void testAddData_perfectLinearData_slopeAndInterceptCorrect() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(2d, regression.getSlope(), 1e-9);
        assertEquals(0d, regression.getIntercept(), 1e-9);
    }

    // ---------- addData(double[][]) ----------

    @Test
    public void testAddDataArray_normalInput_addsAllObservations() {
        double[][] data = {{1d, 2d}, {2d, 4d}, {3d, 6d}};
        regression.addData(data);
        assertEquals(3L, regression.getN());
        assertEquals(2d, regression.getSlope(), 1e-9);
    }

    @Test
    public void testAddDataArray_emptyArray_nRemainsZero() {
        double[][] data = {};
        regression.addData(data);
        assertEquals(0L, regression.getN());
    }

    @Test
    public void testAddDataArray_appendsToExistingData() {
        regression.addData(1d, 2d);
        double[][] data = {{2d, 4d}, {3d, 6d}};
        regression.addData(data);
        assertEquals(3L, regression.getN());
    }

    // ---------- clear() ----------

    @Test
    public void testClear_afterAddingData_resetsN() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.clear();
        assertEquals(0L, regression.getN());
    }

    @Test
    public void testClear_afterClear_canAddDataAgain() {
        regression.addData(1d, 2d);
        regression.clear();
        regression.addData(5d, 10d);
        regression.addData(6d, 12d);
        assertEquals(2L, regression.getN());
    }

    // ---------- getN() ----------

    @Test
    public void testGetN_noDataAdded_returnsZero() {
        assertEquals(0L, regression.getN());
    }

    // ---------- predict(double) ----------

    @Test
    public void testPredict_insufficientData_returnsNaN() {
        regression.addData(1d, 2d);
        assertTrue(Double.isNaN(regression.predict(5d)));
    }

    @Test
    public void testPredict_normalData_returnsCorrectValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(10d, regression.predict(5d), 1e-9);
    }

    @Test
    public void testPredict_noVariationInX_returnsNaN() {
        regression.addData(2d, 3d);
        regression.addData(2d, 5d);
        assertTrue(Double.isNaN(regression.predict(2d)));
    }

    // ---------- getIntercept() ----------

    @Test
    public void testGetIntercept_insufficientData_returnsNaN() {
        assertTrue(Double.isNaN(regression.getIntercept()));
    }

    @Test
    public void testGetIntercept_normalData_returnsCorrectValue() {
        regression.addData(1d, 3d);
        regression.addData(2d, 5d);
        regression.addData(3d, 7d);
        assertEquals(1d, regression.getIntercept(), 1e-9);
    }

    // ---------- getSlope() ----------

    @Test
    public void testGetSlope_lessThanTwoObservations_returnsNaN() {
        regression.addData(1d, 2d);
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    @Test
    public void testGetSlope_noVariationInX_returnsNaN() {
        regression.addData(5d, 1d);
        regression.addData(5d, 2d);
        regression.addData(5d, 3d);
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    @Test
    public void testGetSlope_normalData_returnsCorrectValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(2d, regression.getSlope(), 1e-9);
    }

    @Test
    public void testGetSlope_negativeSlopeData_returnsNegativeValue() {
        regression.addData(1d, 10d);
        regression.addData(2d, 8d);
        regression.addData(3d, 6d);
        assertEquals(-2d, regression.getSlope(), 1e-9);
    }

    // ---------- getSumSquaredErrors() ----------

    @Test
    public void testGetSumSquaredErrors_perfectFit_returnsZero() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(0d, regression.getSumSquaredErrors(), 1e-9);
    }

    @Test
    public void testGetSumSquaredErrors_noisyData_returnsPositiveValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.addData(4d, 4d);
        regression.addData(5d, 6d);
        assertTrue(regression.getSumSquaredErrors() >= 0d);
    }

    // ---------- getTotalSumSquares() ----------

    @Test
    public void testGetTotalSumSquares_lessThanTwoObservations_returnsNaN() {
        regression.addData(1d, 2d);
        assertTrue(Double.isNaN(regression.getTotalSumSquares()));
    }

    @Test
    public void testGetTotalSumSquares_normalData_returnsCorrectValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        // sum of squared deviations of y from mean(4): (2-4)^2+(4-4)^2+(6-4)^2 = 4+0+4=8
        assertEquals(8d, regression.getTotalSumSquares(), 1e-9);
    }

    // ---------- getRegressionSumSquares() ----------

    @Test
    public void testGetRegressionSumSquares_normalData_returnsCorrectValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(8d, regression.getRegressionSumSquares(), 1e-9);
    }

    @Test
    public void testGetRegressionSumSquares_insufficientData_returnsNaN() {
        regression.addData(1d, 2d);
        assertTrue(Double.isNaN(regression.getRegressionSumSquares()));
    }

    // ---------- getMeanSquareError() ----------

    @Test
    public void testGetMeanSquareError_lessThanThreeObservations_returnsNaN() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
    }

    @Test
    public void testGetMeanSquareError_normalData_returnsCorrectValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(0d, regression.getMeanSquareError(), 1e-9);
    }

    // ---------- getR() ----------

    @Test
    public void testGetR_positiveSlope_returnsPositiveR() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(1d, regression.getR(), 1e-9);
    }

    @Test
    public void testGetR_negativeSlope_returnsNegativeR() {
        regression.addData(1d, 10d);
        regression.addData(2d, 8d);
        regression.addData(3d, 6d);
        assertEquals(-1d, regression.getR(), 1e-9);
    }

    // ---------- getRSquare() ----------

    @Test
    public void testGetRSquare_perfectFit_returnsOne() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        regression.addData(3d, 6d);
        assertEquals(1d, regression.getRSquare(), 1e-9);
    }

    @Test
    public void testGetRSquare_noisyData_returnsValueBetweenZeroAndOne() {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.addData(4d, 4d);
        regression.addData(5d, 6d);
        double rSquare = regression.getRSquare();
        assertTrue(rSquare >= 0d && rSquare <= 1d);
    }

    // ---------- getInterceptStdErr() ----------

    @Test
    public void testGetInterceptStdErr_insufficientData_returnsNaN() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        assertTrue(Double.isNaN(regression.getInterceptStdErr()));
    }

    @Test
    public void testGetInterceptStdErr_normalData_returnsNonNegativeValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.addData(4d, 4d);
        regression.addData(5d, 6d);
        double stdErr = regression.getInterceptStdErr();
        assertFalse(Double.isNaN(stdErr));
        assertTrue(stdErr >= 0d);
    }

    // ---------- getSlopeStdErr() ----------

    @Test
    public void testGetSlopeStdErr_insufficientData_returnsNaN() {
        regression.addData(1d, 2d);
        regression.addData(2d, 4d);
        assertTrue(Double.isNaN(regression.getSlopeStdErr()));
    }

    @Test
    public void testGetSlopeStdErr_normalData_returnsNonNegativeValue() {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.addData(4d, 4d);
        regression.addData(5d, 6d);
        double stdErr = regression.getSlopeStdErr();
        assertFalse(Double.isNaN(stdErr));
        assertTrue(stdErr >= 0d);
    }

    // ---------- getSlopeConfidenceInterval() ----------

    @Test
    public void testGetSlopeConfidenceInterval_normalData_returnsPositiveValue() throws MathException {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.addData(4d, 4d);
        regression.addData(5d, 6d);
        double ci = regression.getSlopeConfidenceInterval();
        assertFalse(Double.isNaN(ci));
        assertTrue(ci >= 0d);
    }

    // ---------- getSlopeConfidenceInterval(double alpha) ----------

    @Test
    public void testGetSlopeConfidenceInterval_withAlpha_returnsPositiveValue() throws MathException {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.addData(4d, 4d);
        regression.addData(5d, 6d);
        double ci = regression.getSlopeConfidenceInterval(0.01d);
        assertFalse(Double.isNaN(ci));
        assertTrue(ci >= 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_alphaGreaterThanOrEqualOne_throwsException() throws MathException {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.getSlopeConfidenceInterval(1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_alphaLessThanOrEqualZero_throwsException() throws MathException {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.getSlopeConfidenceInterval(0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_negativeAlpha_throwsException() throws MathException {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.getSlopeConfidenceInterval(-0.5d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceInterval_alphaGreaterThanOne_throwsException() throws MathException {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.getSlopeConfidenceInterval(1.5d);
    }

    // ---------- getSignificance() ----------

    @Test
    public void testGetSignificance_normalData_returnsValueBetweenZeroAndTwo() throws MathException {
        regression.addData(1d, 2d);
        regression.addData(2d, 3d);
        regression.addData(3d, 5d);
        regression.addData(4d, 4d);
        regression.addData(5d, 6d);
        double significance = regression.getSignificance();
        assertFalse(Double.isNaN(significance));
        assertTrue(significance >= 0d);
    }

    // ---------- Additional edge case tests ----------

    @Test
    public void testGetSlope_emptyRegression_returnsNaN() {
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    @Test
    public void testGetIntercept_emptyRegression_returnsNaN() {
        assertTrue(Double.isNaN(regression.getIntercept()));
    }

    @Test
    public void testGetRSquare_emptyRegression_returnsNaN() {
        assertTrue(Double.isNaN(regression.getRSquare()));
    }

    @Test
    public void testAddData_negativeValues_handledCorrectly() {
        regression.addData(-1d, -2d);
        regression.addData(-2d, -4d);
        regression.addData(-3d, -6d);
        assertEquals(2d, regression.getSlope(), 1e-9);
        assertEquals(0d, regression.getIntercept(), 1e-9);
    }

    @Test
    public void testAddData_zeroValues_handledCorrectly() {
        regression.addData(0d, 0d);
        regression.addData(1d, 1d);
        regression.addData(2d, 2d);
        assertEquals(1d, regression.getSlope(), 1e-9);
        assertEquals(0d, regression.getIntercept(), 1e-9);
    }
}
