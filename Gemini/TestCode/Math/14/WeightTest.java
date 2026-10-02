package org.apache.commons.math3.optim.nonlinear.vector;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Assert;
import org.junit.Test;

public class WeightTest {

    @Test
    public void testConstructor_doubleArray_standard() {
        double[] diagonal = new double[] { 1.5, 2.0, 3.5 };
        Weight weight = new Weight(diagonal);
        RealMatrix matrix = weight.getWeight();

        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    Assert.assertEquals(diagonal[i], matrix.getEntry(i, j), 1e-15);
                } else {
                    Assert.assertEquals(0.0, matrix.getEntry(i, j), 1e-15);
                }
            }
        }
    }

    @Test
    public void testConstructor_doubleArray_empty() {
        double[] diagonal = new double[0];
        Weight weight = new Weight(diagonal);
        RealMatrix matrix = weight.getWeight();

        Assert.assertEquals(0, matrix.getRowDimension());
        Assert.assertEquals(0, matrix.getColumnDimension());
    }

    @Test
    public void testConstructor_doubleArray_withZeroAndNegativeValues() {
        double[] diagonal = new double[] { 0.0, -2.5, 10.0 };
        Weight weight = new Weight(diagonal);
        RealMatrix matrix = weight.getWeight();

        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());
        Assert.assertEquals(0.0, matrix.getEntry(0, 0), 1e-15);
        Assert.assertEquals(-2.5, matrix.getEntry(1, 1), 1e-15);
        Assert.assertEquals(10.0, matrix.getEntry(2, 2), 1e-15);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_doubleArray_null_throwsNullPointerException() {
        new Weight((double[]) null);
    }

    @Test
    public void testConstructor_realMatrix_square() {
        double[][] data = {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        Weight weight = new Weight(inputMatrix);
        RealMatrix resultMatrix = weight.getWeight();

        Assert.assertEquals(2, resultMatrix.getRowDimension());
        Assert.assertEquals(2, resultMatrix.getColumnDimension());
        Assert.assertEquals(1.0, resultMatrix.getEntry(0, 0), 1e-15);
        Assert.assertEquals(2.0, resultMatrix.getEntry(0, 1), 1e-15);
        Assert.assertEquals(3.0, resultMatrix.getEntry(1, 0), 1e-15);
        Assert.assertEquals(4.0, resultMatrix.getEntry(1, 1), 1e-15);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructor_realMatrix_nonSquareMoreCols_throwsNonSquareMatrixException() {
        double[][] data = {
            { 1.0, 2.0, 3.0 },
            { 4.0, 5.0, 6.0 }
        };
        RealMatrix nonSquare = new Array2DRowRealMatrix(data);
        new Weight(nonSquare);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructor_realMatrix_nonSquareMoreRows_throwsNonSquareMatrixException() {
        double[][] data = {
            { 1.0, 2.0 },
            { 3.0, 4.0 },
            { 5.0, 6.0 }
        };
        RealMatrix nonSquare = new Array2DRowRealMatrix(data);
        new Weight(nonSquare);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_realMatrix_null_throwsNullPointerException() {
        new Weight((RealMatrix) null);
    }

    @Test
    public void testGetWeight_defensiveCopyFromConstructor() {
        double[][] data = {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        Weight weight = new Weight(inputMatrix);

        inputMatrix.setEntry(0, 0, 99.0);

        Assert.assertEquals(1.0, weight.getWeight().getEntry(0, 0), 1e-15);
    }

    @Test
    public void testGetWeight_defensiveCopyOnReturn() {
        double[] diagonal = new double[] { 1.0, 2.0 };
        Weight weight = new Weight(diagonal);

        RealMatrix returnedMatrix = weight.getWeight();
        returnedMatrix.setEntry(0, 0, 99.0);

        Assert.assertEquals(1.0, weight.getWeight().getEntry(0, 0), 1e-15);
    }
}
