package org.apache.commons.math.stat.correlation;

import org.apache.commons.math.MathException;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.junit.Assert;
import org.junit.Test;

public class PearsonsCorrelationTest {

    private static final double TOLERANCE = 10e-12;

    private final double[][] testData = {
        {1.0, 2.0, 5.0},
        {2.0, 4.0, 4.0},
        {3.0, 6.0, 3.0},
        {4.0, 8.0, 2.0},
        {5.0, 10.0, 1.0}
    };

    @Test
    public void testDefaultConstructor() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        Assert.assertNull(corr.getCorrelationMatrix());
    }

    @Test
    public void testConstructorWithDoubleArray() {
        PearsonsCorrelation corr = new PearsonsCorrelation(testData);
        RealMatrix matrix = corr.getCorrelationMatrix();

        Assert.assertNotNull(matrix);
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());
        Assert.assertEquals(1.0, matrix.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(1.0, matrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(-1.0, matrix.getEntry(0, 2), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithDoubleArray_insufficientRows_throwsException() {
        double[][] data = {
            {1.0, 2.0}
        };
        new PearsonsCorrelation(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithDoubleArray_insufficientCols_throwsException() {
        double[][] data = {
            {1.0},
            {2.0}
        };
        new PearsonsCorrelation(data);
    }

    @Test
    public void testConstructorWithRealMatrix() {
        RealMatrix inputMatrix = new BlockRealMatrix(testData);
        PearsonsCorrelation corr = new PearsonsCorrelation(inputMatrix);
        RealMatrix matrix = corr.getCorrelationMatrix();

        Assert.assertNotNull(matrix);
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(1.0, matrix.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(1.0, matrix.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(-1.0, matrix.getEntry(2, 0), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithRealMatrix_insufficientRows_throwsException() {
        RealMatrix inputMatrix = new BlockRealMatrix(new double[][]{{1.0, 2.0}});
        new PearsonsCorrelation(inputMatrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithRealMatrix_insufficientCols_throwsException() {
        RealMatrix inputMatrix = new BlockRealMatrix(new double[][]{{1.0}, {2.0}});
        new PearsonsCorrelation(inputMatrix);
    }

    @Test
    public void testConstructorWithCovariance() {
        Covariance cov = new Covariance(testData);
        PearsonsCorrelation corr = new PearsonsCorrelation(cov);
        RealMatrix matrix = corr.getCorrelationMatrix();

        Assert.assertNotNull(matrix);
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(1.0, matrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(-1.0, matrix.getEntry(0, 2), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCovariance_nullCovarianceMatrix_throwsException() {
        Covariance cov = new Covariance();
        new PearsonsCorrelation(cov);
    }

    @Test
    public void testConstructorWithCovarianceMatrixAndObservations() {
        Covariance cov = new Covariance(testData);
        RealMatrix covMatrix = cov.getCovarianceMatrix();
        PearsonsCorrelation corr = new PearsonsCorrelation(covMatrix, testData.length);
        RealMatrix matrix = corr.getCorrelationMatrix();

        Assert.assertNotNull(matrix);
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(1.0, matrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(-1.0, matrix.getEntry(0, 2), TOLERANCE);
    }

    @Test
    public void testCorrelation_positiveAndNegativeCorrelation() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {2.0, 4.0, 6.0, 8.0, 10.0};
        double[] z = {5.0, 4.0, 3.0, 2.0, 1.0};

        Assert.assertEquals(1.0, corr.correlation(x, y), TOLERANCE);
        Assert.assertEquals(-1.0, corr.correlation(x, z), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_differentArrayLengths_throwsException() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 2.0};
        corr.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_insufficientDataLength_throwsException() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {1.0};
        double[] y = {2.0};
        corr.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_emptyArrays_throwsException() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[] x = {};
        double[] y = {};
        corr.correlation(x, y);
    }

    @Test
    public void testComputeCorrelationMatrix_doubleArray() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        RealMatrix matrix = corr.computeCorrelationMatrix(testData);

        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());
        Assert.assertEquals(1.0, matrix.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(1.0, matrix.getEntry(1, 1), TOLERANCE);
        Assert.assertEquals(1.0, matrix.getEntry(2, 2), TOLERANCE);
        Assert.assertEquals(1.0, matrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(1.0, matrix.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(-1.0, matrix.getEntry(0, 2), TOLERANCE);
        Assert.assertEquals(-1.0, matrix.getEntry(2, 0), TOLERANCE);
    }

    @Test
    public void testComputeCorrelationMatrix_realMatrix() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        RealMatrix inputMatrix = new BlockRealMatrix(testData);
        RealMatrix matrix = corr.computeCorrelationMatrix(inputMatrix);

        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());
        Assert.assertEquals(1.0, matrix.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(1.0, matrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(-1.0, matrix.getEntry(0, 2), TOLERANCE);
    }

    @Test
    public void testCovarianceToCorrelation() {
        PearsonsCorrelation corr = new PearsonsCorrelation();
        double[][] covData = {
            {4.0, 2.0},
            {2.0, 9.0}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        RealMatrix corrMatrix = corr.covarianceToCorrelation(covMatrix);

        Assert.assertEquals(1.0, corrMatrix.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(1.0, corrMatrix.getEntry(1, 1), TOLERANCE);
        Assert.assertEquals(2.0 / (2.0 * 3.0), corrMatrix.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(2.0 / (2.0 * 3.0), corrMatrix.getEntry(1, 0), TOLERANCE);
    }

    @Test
    public void testGetCorrelationStandardErrors() {
        double[][] data = {
            {1.0, 2.0},
            {2.0, 3.0},
            {3.0, 5.0},
            {4.0, 7.0},
            {5.0, 11.0}
        };
        PearsonsCorrelation corr = new PearsonsCorrelation(data);
        RealMatrix stdErrors = corr.getCorrelationStandardErrors();
        RealMatrix corrMatrix = corr.getCorrelationMatrix();

        Assert.assertEquals(2, stdErrors.getRowDimension());
        Assert.assertEquals(2, stdErrors.getColumnDimension());

        int nObs = data.length;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double r = corrMatrix.getEntry(i, j);
                double expectedSE = Math.sqrt((1 - r * r) / (nObs - 2));
                Assert.assertEquals(expectedSE, stdErrors.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test
    public void testGetCorrelationPValues() throws MathException {
        double[][] data = {
            {1.0, 2.0},
            {2.0, 3.0},
            {3.0, 5.0},
            {4.0, 7.0},
            {5.0, 11.0}
        };
        PearsonsCorrelation corr = new PearsonsCorrelation(data);
        RealMatrix pValues = corr.getCorrelationPValues();

        Assert.assertEquals(2, pValues.getRowDimension());
        Assert.assertEquals(2, pValues.getColumnDimension());
        Assert.assertEquals(0.0, pValues.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(0.0, pValues.getEntry(1, 1), TOLERANCE);
        Assert.assertTrue(pValues.getEntry(0, 1) >= 0.0 && pValues.getEntry(0, 1) <= 1.0);
        Assert.assertEquals(pValues.getEntry(0, 1), pValues.getEntry(1, 0), TOLERANCE);
    }
}
