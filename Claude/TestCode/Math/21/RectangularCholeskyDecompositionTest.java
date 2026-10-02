import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RectangularCholeskyDecomposition;
import org.junit.Assert;
import org.junit.Test;

public class RectangularCholeskyDecompositionTest {

    private static final double DELTA = 1.0e-9;

    /**
     * Normal case: full rank symmetric positive definite matrix.
     * Verify that B * B^T reconstructs the original matrix and rank equals order.
     */
    @Test
    public void testConstructor_fullRankMatrix_rootReconstructsOriginal() {
        double[][] data = {
            {4.0, 2.0},
            {2.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 1.0e-10);

        Assert.assertEquals(2, decomposition.getRank());

        RealMatrix root = decomposition.getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), DELTA);
            }
        }
    }

    /**
     * Normal case: rank deficient positive semidefinite matrix.
     * All rows/columns are identical, so the matrix should have rank 1.
     */
    @Test
    public void testConstructor_rankDeficientMatrix_rankLessThanOrder() {
        double[][] data = {
            {1.0, 1.0, 1.0},
            {1.0, 1.0, 1.0},
            {1.0, 1.0, 1.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 1.0e-10);

        Assert.assertEquals(1, decomposition.getRank());

        RealMatrix root = decomposition.getRootMatrix();
        Assert.assertEquals(3, root.getRowDimension());
        Assert.assertEquals(1, root.getColumnDimension());

        RealMatrix reconstructed = root.multiply(root.transpose());
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), DELTA);
            }
        }
    }

    /**
     * Edge case: identity matrix. Since all diagonal values are equal,
     * no swap should occur, and root should approximate identity.
     */
    @Test
    public void testConstructor_identityMatrix_rootApproximatesIdentity() {
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 1.0e-10);

        Assert.assertEquals(3, decomposition.getRank());

        RealMatrix root = decomposition.getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), DELTA);
            }
        }
    }

    /**
     * Normal case with distinct diagonal elements to trigger the swap logic
     * (swap[r] != r branch) during maximal diagonal element search.
     */
    @Test
    public void testConstructor_diagonalMatrixWithDistinctValues_swapOccursAndReconstructsOriginal() {
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 5.0, 0.0},
            {0.0, 0.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 1.0e-10);

        Assert.assertEquals(3, decomposition.getRank());

        RealMatrix root = decomposition.getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), DELTA);
            }
        }
    }

    /**
     * Edge case: single element positive matrix (boundary 1x1 case).
     */
    @Test
    public void testConstructor_singlePositiveElement_rankOneRootCorrect() {
        double[][] data = { { 9.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 1.0e-10);

        Assert.assertEquals(1, decomposition.getRank());
        RealMatrix root = decomposition.getRootMatrix();
        Assert.assertEquals(3.0, root.getEntry(0, 0), DELTA);
    }

    /**
     * Edge case: zero matrix (all zero diagonal elements).
     * Should throw NonPositiveDefiniteMatrixException because the very first
     * diagonal element (r == 0) is below the "small" threshold.
     */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructor_zeroMatrix_throwsExceptionAtRZero() {
        double[][] data = {
            {0.0, 0.0},
            {0.0, 0.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        new RectangularCholeskyDecomposition(matrix, 1.0e-10);
    }

    /**
     * Edge case: single negative element matrix.
     * Should throw NonPositiveDefiniteMatrixException immediately (r == 0 branch).
     */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructor_singleNegativeElement_throwsExceptionAtRZero() {
        double[][] data = { { -1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        new RectangularCholeskyDecomposition(matrix, 1.0e-10);
    }

    /**
     * Exception case: a matrix that is not positive semidefinite, where the
     * negative diagonal element only appears after the first elimination step
     * (r > 0 branch of the diagonal check).
     */
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructor_notPositiveSemidefiniteMatrix_throwsExceptionAtRGreaterThanZero() {
        double[][] data = {
            {1.0, 2.0},
            {2.0, 1.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        new RectangularCholeskyDecomposition(matrix, 1.0e-10);
    }

    /**
     * Verify getRootMatrix() returns a matrix with correct dimensions
     * (rows == order, columns == rank).
     */
    @Test
    public void testGetRootMatrix_returnsCorrectDimensions() {
        double[][] data = {
            {2.0, 1.0, 0.0},
            {1.0, 2.0, 1.0},
            {0.0, 1.0, 2.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 1.0e-10);

        RealMatrix root = decomposition.getRootMatrix();
        Assert.assertEquals(3, root.getRowDimension());
        Assert.assertEquals(decomposition.getRank(), root.getColumnDimension());
    }

    /**
     * Verify getRank() returns the expected value for a known full rank matrix.
     */
    @Test
    public void testGetRank_fullRankMatrix_returnsOrder() {
        double[][] data = {
            {6.0, 1.0},
            {1.0, 4.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 1.0e-10);

        Assert.assertEquals(2, decomposition.getRank());
    }

    /**
     * Edge case: large "small" threshold causes many columns to be discarded,
     * resulting in a lower rank even for an otherwise full rank matrix.
     */
    @Test
    public void testConstructor_largeSmallThreshold_reducesRank() {
        double[][] data = {
            {4.0, 0.0},
            {0.0, 0.0001}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(matrix, 0.01);

        Assert.assertEquals(1, decomposition.getRank());
    }
}
