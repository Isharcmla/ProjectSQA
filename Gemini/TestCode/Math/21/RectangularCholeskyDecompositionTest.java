package org.apache.commons.math3.linear;

import org.junit.Assert;
import org.junit.Test;

public class RectangularCholeskyDecompositionTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void testDecomposition_1x1PositiveMatrix_success() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 4.0 }
        });
        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(matrix, 1.0e-6);

        Assert.assertEquals(1, rcd.getRank());
        RealMatrix root = rcd.getRootMatrix();
        Assert.assertEquals(1, root.getRowDimension());
        Assert.assertEquals(1, root.getColumnDimension());
        Assert.assertEquals(2.0, root.getEntry(0, 0), EPSILON);

        RealMatrix reconstructed = root.multiply(root.transpose());
        Assert.assertEquals(4.0, reconstructed.getEntry(0, 0), EPSILON);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testDecomposition_1x1NegativeMatrix_throwsException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { -1.0 }
        });
        new RectangularCholeskyDecomposition(matrix, 1.0e-6);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testDecomposition_firstPivotBelowThreshold_throwsException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 0.0, 0.0 },
            { 0.0, 0.0 }
        });
        new RectangularCholeskyDecomposition(matrix, 1.0e-6);
    }

    @Test
    public void testDecomposition_fullRank3x3_reconstructsOriginalMatrix() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 4.0, 1.0, 2.0 },
            { 1.0, 5.0, 3.0 },
            { 2.0, 3.0, 6.0 }
        });
        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(matrix, 1.0e-6);

        Assert.assertEquals(3, rcd.getRank());
        RealMatrix root = rcd.getRootMatrix();
        Assert.assertEquals(3, root.getRowDimension());
        Assert.assertEquals(3, root.getColumnDimension());

        RealMatrix reconstructed = root.multiply(root.transpose());
        for (int i = 0; i < matrix.getRowDimension(); ++i) {
            for (int j = 0; j < matrix.getColumnDimension(); ++j) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test
    public void testDecomposition_diagonalSortingAndSwapping_success() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 0.0, 0.0 },
            { 0.0, 5.0, 0.0 },
            { 0.0, 0.0, 10.0 }
        });
        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(matrix, 1.0e-6);

        Assert.assertEquals(3, rcd.getRank());
        RealMatrix root = rcd.getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());

        for (int i = 0; i < matrix.getRowDimension(); ++i) {
            for (int j = 0; j < matrix.getColumnDimension(); ++j) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test
    public void testDecomposition_rankDeficientMatrix_success() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 1.0, 1.0 },
            { 1.0, 1.0, 1.0 },
            { 1.0, 1.0, 1.0 }
        });
        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(matrix, 1.0e-6);

        Assert.assertEquals(1, rcd.getRank());
        RealMatrix root = rcd.getRootMatrix();
        Assert.assertEquals(3, root.getRowDimension());
        Assert.assertEquals(1, root.getColumnDimension());

        RealMatrix reconstructed = root.multiply(root.transpose());
        for (int i = 0; i < matrix.getRowDimension(); ++i) {
            for (int j = 0; j < matrix.getColumnDimension(); ++j) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test
    public void testDecomposition_rank2InDimension3_success() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 2.0, 1.0, 1.0 },
            { 1.0, 2.0, 1.0 },
            { 1.0, 1.0, 2.0 }
        });
        RealMatrix root = new RectangularCholeskyDecomposition(matrix, 1.0e-6).getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());

        for (int i = 0; i < matrix.getRowDimension(); ++i) {
            for (int j = 0; j < matrix.getColumnDimension(); ++j) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testDecomposition_notPositiveSemidefinite_throwsException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 2.0, 3.0 },
            { 3.0, 2.0 }
        });
        new RectangularCholeskyDecomposition(matrix, 1.0e-6);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testDecomposition_negativeEigenvalueWithMultipleColumns_throwsException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 2.0, 0.0 },
            { 2.0, 1.0, 0.0 },
            { 0.0, 0.0, 1.0 }
        });
        new RectangularCholeskyDecomposition(matrix, 1.0e-6);
    }

    @Test
    public void testDecomposition_4x4PositiveDefinite_coversInnerLoops() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 10.0,  1.0,  2.0,  3.0 },
            {  1.0, 11.0,  4.0,  5.0 },
            {  2.0,  4.0, 12.0,  6.0 },
            {  3.0,  5.0,  6.0, 13.0 }
        });
        RectangularCholeskyDecomposition rcd = new RectangularCholeskyDecomposition(matrix, 1.0e-6);

        Assert.assertEquals(4, rcd.getRank());
        RealMatrix root = rcd.getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());

        for (int i = 0; i < matrix.getRowDimension(); ++i) {
            for (int j = 0; j < matrix.getColumnDimension(); ++j) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }
}
