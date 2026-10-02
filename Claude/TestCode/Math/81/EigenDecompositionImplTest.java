package org.apache.commons.math.linear;

import org.apache.commons.math.util.MathUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class EigenDecompositionImplTest {

    private static final double TOL = 1.0e-6;

    private static void assertMatrixEquals(RealMatrix expected, RealMatrix actual, double tol) {
        assertEquals(expected.getRowDimension(), actual.getRowDimension());
        assertEquals(expected.getColumnDimension(), actual.getColumnDimension());
        for (int i = 0; i < expected.getRowDimension(); ++i) {
            for (int j = 0; j < expected.getColumnDimension(); ++j) {
                assertEquals(expected.getEntry(i, j), actual.getEntry(i, j), tol);
            }
        }
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_symmetricMatrix_success() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = decomposition.getRealEigenvalues();
        assertEquals(2, eigenvalues.length);
        // sorted descending: 3, 1
        assertEquals(3.0, eigenvalues[0], TOL);
        assertEquals(1.0, eigenvalues[1], TOL);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testConstructor_asymmetricMatrix_throwsException() {
        double[][] data = { {1, 2}, {3, 4} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
    }

    @Test
    public void testConstructor_tridiagonal1Row_success() {
        double[] main = { 7.0 };
        double[] secondary = {};
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] eigenvalues = decomposition.getRealEigenvalues();
        assertEquals(1, eigenvalues.length);
        assertEquals(7.0, eigenvalues[0], TOL);
    }

    @Test
    public void testConstructor_tridiagonal2Rows_success() {
        double[] main = { 2.0, 3.0 };
        double[] secondary = { 1.0 };
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] eigenvalues = decomposition.getRealEigenvalues();
        assertEquals(2, eigenvalues.length);
        double sum = eigenvalues[0] + eigenvalues[1];
        double product = eigenvalues[0] * eigenvalues[1];
        assertEquals(5.0, sum, TOL);
        assertEquals(5.0, product, TOL);
    }

    @Test
    public void testConstructor_tridiagonal3Rows_success() {
        double[] main = { 6.0, 5.0, 4.0 };
        double[] secondary = { 1.0, 1.0 };
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] eigenvalues = decomposition.getRealEigenvalues();
        assertEquals(3, eigenvalues.length);
        double sum = eigenvalues[0] + eigenvalues[1] + eigenvalues[2];
        assertEquals(15.0, sum, TOL);
        // descending order
        assertTrue(eigenvalues[0] >= eigenvalues[1]);
        assertTrue(eigenvalues[1] >= eigenvalues[2]);
    }

    @Test
    public void testConstructor_tridiagonalGeneralBlock_success() {
        double[] main = { 4.0, 3.0, 2.0, 1.0 };
        double[] secondary = { 1.0, 1.0, 1.0 };
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] eigenvalues = decomposition.getRealEigenvalues();
        assertEquals(4, eigenvalues.length);
        double sum = 0;
        for (double ev : eigenvalues) {
            sum += ev;
        }
        assertEquals(10.0, sum, TOL);
    }

    // ---------- getV / getD / getVT tests ----------

    @Test
    public void testGetV_getD_getVT_reconstructsOriginalMatrix() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        RealMatrix v = decomposition.getV();
        RealMatrix d = decomposition.getD();
        RealMatrix vt = decomposition.getVT();

        RealMatrix reconstructed = v.multiply(d).multiply(vt);
        assertMatrixEquals(matrix, reconstructed, 1.0e-6);
    }

    @Test
    public void testGetD_isDiagonal() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        RealMatrix d = decomposition.getD();
        for (int i = 0; i < d.getRowDimension(); ++i) {
            for (int j = 0; j < d.getColumnDimension(); ++j) {
                if (i != j) {
                    assertEquals(0.0, d.getEntry(i, j), TOL);
                }
            }
        }
    }

    @Test
    public void testGetVT_isTransposeOfV() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        RealMatrix v = decomposition.getV();
        RealMatrix vt = decomposition.getVT();
        assertMatrixEquals(v.transpose(), vt, TOL);
    }

    @Test
    public void testGetV_largeSymmetricMatrix_reconstructsOriginal() {
        double[][] data = {
            {5, 4, 3, 2, 1},
            {4, 5, 4, 3, 2},
            {3, 4, 5, 4, 3},
            {2, 3, 4, 5, 4},
            {1, 2, 3, 4, 5}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        RealMatrix v = decomposition.getV();
        RealMatrix d = decomposition.getD();
        RealMatrix vt = decomposition.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);
        assertMatrixEquals(matrix, reconstructed, 1.0e-6);
    }

    // ---------- getRealEigenvalues / getRealEigenvalue ----------

    @Test
    public void testGetRealEigenvalues_returnsClonedArraySortedDescending() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues1 = decomposition.getRealEigenvalues();
        double[] eigenvalues2 = decomposition.getRealEigenvalues();
        assertNotSame(eigenvalues1, eigenvalues2);
        assertArrayEquals(eigenvalues1, eigenvalues2, TOL);
        assertTrue(eigenvalues1[0] >= eigenvalues1[1]);
    }

    @Test
    public void testGetRealEigenvalue_validIndex_returnsCorrectValue() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(3.0, decomposition.getRealEigenvalue(0), TOL);
        assertEquals(2.0, decomposition.getRealEigenvalue(1), TOL);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRealEigenvalue_invalidIndex_throwsException() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        decomposition.getRealEigenvalue(5);
    }

    // ---------- getImagEigenvalues / getImagEigenvalue ----------

    @Test
    public void testGetImagEigenvalues_allZero() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] imag = decomposition.getImagEigenvalues();
        assertEquals(2, imag.length);
        for (double v : imag) {
            assertEquals(0.0, v, TOL);
        }
    }

    @Test
    public void testGetImagEigenvalue_validIndex_returnsZero() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(0.0, decomposition.getImagEigenvalue(0), TOL);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetImagEigenvalue_invalidIndex_throwsException() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        decomposition.getImagEigenvalue(-1);
    }

    // ---------- getEigenvector ----------

    @Test
    public void testGetEigenvector_validIndex_satisfiesEigenEquation() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        double lambda0 = decomposition.getRealEigenvalue(0);
        RealVector v0 = decomposition.getEigenvector(0);

        // A * v should equal lambda * v
        double[] vData = { v0.getEntry(0), v0.getEntry(1) };
        double[] avData = new double[2];
        for (int i = 0; i < 2; ++i) {
            double s = 0;
            for (int j = 0; j < 2; ++j) {
                s += data[i][j] * vData[j];
            }
            avData[i] = s;
        }
        assertEquals(lambda0 * vData[0], avData[0], TOL);
        assertEquals(lambda0 * vData[1], avData[1], TOL);
    }

    @Test
    public void testGetEigenvector_tridiagonalConstructor_nullTransformerBranch() {
        double[] main = { 2.0, 3.0 };
        double[] secondary = { 1.0 };
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        RealVector v0 = decomposition.getEigenvector(0);
        assertNotNull(v0);
        assertEquals(2, v0.getDimension());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetEigenvector_invalidIndex_throwsException() {
        double[][] data = { {2, 1}, {1, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        decomposition.getEigenvector(10);
    }

    // ---------- getDeterminant ----------

    @Test
    public void testGetDeterminant_diagonalMatrix_returnsProductOfDiagonal() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(6.0, decomposition.getDeterminant(), TOL);
    }

    @Test
    public void testGetDeterminant_identityMatrix_returnsOne() {
        double[][] data = { {1, 0, 0}, {0, 1, 0}, {0, 0, 1} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(1.0, decomposition.getDeterminant(), TOL);
    }

    @Test
    public void testGetDeterminant_singularMatrix_returnsZero() {
        double[][] data = { {1, 0}, {0, 0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(0.0, decomposition.getDeterminant(), TOL);
    }

    // ---------- getSolver tests ----------

    @Test
    public void testGetSolver_isNonSingular_trueForRegularMatrix() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testGetSolver_isNonSingular_falseForSingularMatrix() {
        double[][] data = { {1, 0}, {0, 0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        assertFalse(solver.isNonSingular());
    }

    @Test
    public void testGetSolver_solveDoubleArray_returnsCorrectSolution() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();

        double[] b = { 6.0, 4.0 };
        double[] x = solver.solve(b);
        // A * x should equal b
        assertEquals(6.0, 3 * x[0], TOL);
        assertEquals(4.0, 2 * x[1], TOL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolver_solveDoubleArray_dimensionMismatch_throwsException() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        double[] b = { 1.0, 2.0, 3.0 };
        solver.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetSolver_solveDoubleArray_singularMatrix_throwsException() {
        double[][] data = { {1, 0}, {0, 0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        double[] b = { 1.0, 1.0 };
        solver.solve(b);
    }

    @Test
    public void testGetSolver_solveRealVector_returnsCorrectSolution() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();

        RealVector b = new ArrayRealVector(new double[] { 6.0, 4.0 });
        RealVector x = solver.solve(b);
        assertEquals(6.0, 3 * x.getEntry(0), TOL);
        assertEquals(4.0, 2 * x.getEntry(1), TOL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolver_solveRealVector_dimensionMismatch_throwsException() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        RealVector b = new ArrayRealVector(new double[] { 1.0, 2.0, 3.0 });
        solver.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetSolver_solveRealVector_singularMatrix_throwsException() {
        double[][] data = { {1, 0}, {0, 0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        RealVector b = new ArrayRealVector(new double[] { 1.0, 1.0 });
        solver.solve(b);
    }

    @Test
    public void testGetSolver_solveRealMatrix_returnsCorrectSolution() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();

        double[][] bData = { {6.0}, {4.0} };
        RealMatrix b = MatrixUtils.createRealMatrix(bData);
        RealMatrix x = solver.solve(b);

        RealMatrix reconstructedB = matrix.multiply(x);
        assertMatrixEquals(b, reconstructedB, TOL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolver_solveRealMatrix_dimensionMismatch_throwsException() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        double[][] bData = { {1.0}, {2.0}, {3.0} };
        RealMatrix b = MatrixUtils.createRealMatrix(bData);
        solver.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetSolver_solveRealMatrix_singularMatrix_throwsException() {
        double[][] data = { {1, 0}, {0, 0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        double[][] bData = { {1.0}, {1.0} };
        RealMatrix b = MatrixUtils.createRealMatrix(bData);
        solver.solve(b);
    }

    @Test
    public void testGetSolver_getInverse_returnsCorrectInverse() {
        double[][] data = { {3, 0}, {0, 2} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();

        RealMatrix inverse = solver.getInverse();
        RealMatrix identity = matrix.multiply(inverse);

        double[][] expectedIdentity = { {1, 0}, {0, 1} };
        assertMatrixEquals(MatrixUtils.createRealMatrix(expectedIdentity), identity, TOL);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetSolver_getInverse_singularMatrix_throwsException() {
        double[][] data = { {1, 0}, {0, 0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl decomposition =
            new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = decomposition.getSolver();
        solver.getInverse();
    }
}
