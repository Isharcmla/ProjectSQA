package org.apache.commons.math.stat.regression;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.MathException;
import org.junit.Assert;
import org.junit.Test;

public class SimpleRegressionTest {

    private static final double EPSILON = 1e-8;

    @Test
    public void testEmptyModel_returnsNaNAndZeroN() {
        SimpleRegression regression = new SimpleRegression();
        Assert.assertEquals(0L, regression.getN());
        Assert.assertTrue(Double.isNaN(regression.getSlope()));
        Assert.assertTrue(Double.isNaN(regression.getIntercept()));
        Assert.assertTrue(Double.isNaN(regression.predict(1.0)));
        Assert.assertTrue(Double.isNaN(regression.getTotalSumSquares()));
        Assert.assertTrue(Double.isNaN(regression.getMeanSquareError()));
        Assert.assertTrue(Double.isNaN(regression.getR()));
        Assert.assertTrue(Double.isNaN(regression.getRSquare()));
        Assert.assertTrue(Double.isNaN(regression.getInterceptStdErr()));
        Assert.assertTrue(Double.isNaN(regression.getSlopeStdErr()));
    }

    @Test
    public void testSingleObservation_returnsNaNForModelEstimates() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1.0, 2.0);

        Assert.assertEquals(1L, regression.getN());
        Assert.assertTrue(Double.isNaN(regression.getSlope()));
        Assert.assertTrue(Double.isNaN(regression.getIntercept()));
        Assert.assertTrue(Double.isNaN(regression.predict(5.0)));
        Assert.assertTrue(Double.isNaN(regression.getTotalSumSquares()));
        Assert.assertTrue(Double.isNaN(regression.getMeanSquareError()));
    }

    @Test
    public void testTwoObservations_noVariationInX_returnsNaNForSlope() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(2.0, 3.0);
        regression.addData(2.0, 5.0);

        Assert.assertEquals(2L, regression.getN());
        Assert.assertTrue(Double.isNaN(regression.getSlope()));
        Assert.assertTrue(Double.isNaN(regression.getIntercept()));
        Assert.assertTrue(Double.isNaN(regression.predict(2.0)));
        Assert.assertEquals(2.0, regression.getTotalSumSquares(), EPSILON);
        Assert.assertTrue(Double.isNaN(regression.getMeanSquareError()));
    }

    @Test
    public void testTwoObservations_positiveSlope_computesBasicStats() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1.0, 2.0);
        regression.addData(3.0, 6.0);

        Assert.assertEquals(2L, regression.getN());
        Assert.assertEquals(2.0, regression.getSlope(), EPSILON);
        Assert.assertEquals(0.0, regression.getIntercept(), EPSILON);
        Assert.assertEquals(10.0, regression.predict(5.0), EPSILON);
        Assert.assertEquals(8.0, regression.getTotalSumSquares(), EPSILON);
        Assert.assertEquals(8.0, regression.getRegressionSumSquares(), EPSILON);
        Assert.assertEquals(0.0, regression.getSumSquaredErrors(), EPSILON);
        Assert.assertEquals(1.0, regression.getRSquare(), EPSILON);
        Assert.assertEquals(1.0, regression.getR(), EPSILON);
        Assert.assertTrue(Double.isNaN(regression.getMeanSquareError()));
    }

    @Test
    public void testTwoObservations_negativeSlope_getRIsNegative() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1.0, 6.0);
        regression.addData(3.0, 2.0);

        Assert.assertEquals(2L, regression.getN());
        Assert.assertEquals(-2.0, regression.getSlope(), EPSILON);
        Assert.assertEquals(8.0, regression.getIntercept(), EPSILON);
        Assert.assertEquals(1.0, regression.getRSquare(), EPSILON);
        Assert.assertEquals(-1.0, regression.getR(), EPSILON);
    }

    @Test
    public void testMultipleObservations_batchAddData_verifiesAllStatistics() throws MathException {
        SimpleRegression regression = new SimpleRegression();
        double[][] data = {
            {1.0, 2.0},
            {2.0, 3.0},
            {3.0, 5.0},
            {4.0, 4.0},
            {5.0, 6.0}
        };
        regression.addData(data);

        Assert.assertEquals(5L, regression.getN());

        double expectedSlope = 0.9;
        double expectedIntercept = 1.3;
        Assert.assertEquals(expectedSlope, regression.getSlope(), EPSILON);
        Assert.assertEquals(expectedIntercept, regression.getIntercept(), EPSILON);
        Assert.assertEquals(expectedIntercept + expectedSlope * 10.0, regression.predict(10.0), EPSILON);

        double totalSS = regression.getTotalSumSquares();
        double regSS = regression.getRegressionSumSquares();
        double sumSE = regression.getSumSquaredErrors();

        Assert.assertEquals(10.0, totalSS, EPSILON);
        Assert.assertEquals(8.1, regSS, EPSILON);
        Assert.assertEquals(1.9, sumSE, EPSILON);

        Assert.assertEquals(sumSE / 3.0, regression.getMeanSquareError(), EPSILON);
        Assert.assertEquals(0.81, regression.getRSquare(), EPSILON);
        Assert.assertEquals(0.9, regression.getR(), EPSILON);

        Assert.assertTrue(regression.getSlopeStdErr() > 0);
        Assert.assertTrue(regression.getInterceptStdErr() > 0);

        double ci95 = regression.getSlopeConfidenceInterval();
        Assert.assertTrue(ci95 > 0);

        double ci99 = regression.getSlopeConfidenceInterval(0.01);
        Assert.assertTrue(ci99 > ci95);

        double significance = regression.getSignificance();
        Assert.assertTrue(significance > 0.0 && significance < 1.0);
    }

    @Test
    public void testClear_resetsState() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 4.0);
        Assert.assertEquals(2L, regression.getN());

        regression.clear();
        Assert.assertEquals(0L, regression.getN());
        Assert.assertTrue(Double.isNaN(regression.getSlope()));
        Assert.assertTrue(Double.isNaN(regression.getIntercept()));

        regression.addData(2.0, 5.0);
        Assert.assertEquals(1L, regression.getN());
    }

    @Test
    public void testAddDataEmptyArray_doesNotModifyState() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(new double[0][0]);
        Assert.assertEquals(0L, regression.getN());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSlopeConfidenceInterval_alphaZero_throwsException() throws MathException {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(new double[][]{{1, 2}, {2, 3}, {3, 4}});
        regression.getSlopeConfidenceInterval(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSlopeConfidenceInterval_negativeAlpha_throwsException() throws MathException {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(new double[][]{{1, 2}, {2, 3}, {3, 4}});
        regression.getSlopeConfidenceInterval(-0.05);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSlopeConfidenceInterval_alphaOne_throwsException() throws MathException {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(new double[][]{{1, 2}, {2, 3}, {3, 4}});
        regression.getSlopeConfidenceInterval(1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSlopeConfidenceInterval_alphaGreaterThanOne_throwsException() throws MathException {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(new double[][]{{1, 2}, {2, 3}, {3, 4}});
        regression.getSlopeConfidenceInterval(1.5);
    }

    @Test
    public void testNegativeAndZeroValues() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(-2.0, -4.0);
        regression.addData(-1.0, -2.0);
        regression.addData(0.0, 0.0);
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 4.0);

        Assert.assertEquals(5L, regression.getN());
        Assert.assertEquals(2.0, regression.getSlope(), EPSILON);
        Assert.assertEquals(0.0, regression.getIntercept(), EPSILON);
        Assert.assertEquals(0.0, regression.getSumSquaredErrors(), EPSILON);
        Assert.assertEquals(1.0, regression.getRSquare(), EPSILON);
    }

    @Test
    public void testSerialization() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(new double[][]{{1.0, 2.0}, {2.0, 4.0}, {3.0, 6.0}});

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(regression);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimpleRegression deserialized = (SimpleRegression) ois.readObject();
        ois.close();

        Assert.assertEquals(regression.getN(), deserialized.getN());
        Assert.assertEquals(regression.getSlope(), deserialized.getSlope(), EPSILON);
        Assert.assertEquals(regression.getIntercept(), deserialized.getIntercept(), EPSILON);
        Assert.assertEquals(regression.predict(5.0), deserialized.predict(5.0), EPSILON);
    }
}
