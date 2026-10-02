package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;

public class EigenDecompositionImplTest {

    private static final double DELTA = 1.0e-6;
    private static final double LOOSE_DELTA = 1.0e-4;

    // ---------- helper methods ----------

    private RealMatrix buildMatrix(double[][] data) {
        return MatrixUtils.createRealMatrix(data);
    }

    private void assertMatrixEquals(RealMatrix expected, RealMatrix actual, double delta) {
        assertEquals(expected.getRowDimension(), actual.getRowDimension());
        assertEquals(expected.getColumnDimension(), actual.getColumnDimension());
        for (int i = 0; i < expected.getRowDimension(); ++i) {
            for (int j = 0; j < expected.getColumnDimension(); ++j) {
                assertEquals(expected.getEntry(i, j), actual.getEntry(i, j), delta);
            }
        }
    }

    private RealMatrix buildTridiagonal(double[] main, double[] secondary) {
        int n = main.length;
        double[][] data = new double[n][n];
        for (int i = 0; i < n; ++i) {
            data[i][i] = main[i];
        }
        for (int i = 0; i < secondary.length; ++i) {
            data[i][i + 1] = secondary[i];
            data[i + 1][i] = secondary[i];
        }
        return buildMatrix(data);
    }

    // ---------- constructor tests ----------

    @Test
    public void testConstructor_symmetricMatrix_computesEigenvalues() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(2, ev.length);
        assertEquals(3.0, ev[0], DELTA);
        assertEquals(1.0, ev[1], DELTA);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testConstructor_asymmetricMatrix_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {1, 2}, {3, 4} });
        new EigenDecompositionImpl(m, 1.0e-10);
    }

    @Test
    public void testConstructor_tridiagonalArrays_1x1() throws Exception {
        double[] main = { 5.0 };
        double[] secondary = {};
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(1, ev.length);
        assertEquals(5.0, ev[0], DELTA);
    }

    @Test
    public void testConstructor_tridiagonalArrays_2x2() throws Exception {
        double[] main = { 2.0, 2.0 };
        double[] secondary = { 1.0 };
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(2, ev.length);
        assertEquals(3.0, ev[0], DELTA);
        assertEquals(1.0, ev[1], DELTA);
    }

    @Test
    public void testConstructor_tridiagonalArrays_3x3() throws Exception {
        double[] main = { 2.0, 2.0, 2.0 };
        double[] secondary = { 1.0, 1.0 };
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(3, ev.length);
        assertEquals(2 + Math.sqrt(2), ev[0], LOOSE_DELTA);
        assertEquals(2.0, ev[1], LOOSE_DELTA);
        assertEquals(2 - Math.sqrt(2), ev[2], LOOSE_DELTA);
    }

    @Test
    public void testConstructor_tridiagonalArrays_4x4() throws Exception {
        double[] main = { 2.0, 2.0, 2.0, 2.0 };
        double[] secondary = { 1.0, 1.0, 1.0 };
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(4, ev.length);
        assertEquals(2 + 2 * Math.cos(Math.PI / 5), ev[0], LOOSE_DELTA);
        assertEquals(2 + 2 * Math.cos(2 * Math.PI / 5), ev[1], LOOSE_DELTA);
        assertEquals(2 + 2 * Math.cos(3 * Math.PI / 5), ev[2], LOOSE_DELTA);
        assertEquals(2 + 2 * Math.cos(4 * Math.PI / 5), ev[3], LOOSE_DELTA);
    }

    @Test
    public void testConstructor_diagonalMatrix_splitsIntoSingleRowBlocks() throws Exception {
        RealMatrix m = buildMatrix(new double[][] {
            {3, 0, 0},
            {0, 5, 0},
            {0, 0, 7}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(3, ev.length);
        assertEquals(7.0, ev[0], DELTA);
        assertEquals(5.0, ev[1], DELTA);
        assertEquals(3.0, ev[2], DELTA);
    }

    // ---------- getV / getD / getVT tests ----------

    @Test
    public void testGetV_isOrthogonal() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        RealMatrix v = ed.getV();
        RealMatrix vt = v.transpose();
        RealMatrix product = vt.multiply(v);
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        assertMatrixEquals(identity, product, LOOSE_DELTA);
    }

    @Test
    public void testGetD_isDiagonalWithEigenvalues() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        RealMatrix d = ed.getD();
        assertEquals(3.0, d.getEntry(0, 0), DELTA);
        assertEquals(1.0, d.getEntry(1, 1), DELTA);
        assertEquals(0.0, d.getEntry(0, 1), DELTA);
        assertEquals(0.0, d.getEntry(1, 0), DELTA);
    }

    @Test
    public void testGetVT_isTransposeOfV() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        RealMatrix v = ed.getV();
        RealMatrix vt = ed.getVT();
        assertMatrixEquals(v.transpose(), vt, DELTA);
    }

    @Test
    public void testDecomposition_reconstructsOriginalMatrix() throws Exception {
        double[] main = { 2.0, 2.0, 2.0 };
        double[] secondary = { 1.0, 1.0 };
        EigenDecompositionImpl ed = new EigenDecompositionImpl(main, secondary, 1.0e-10);
        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);
        RealMatrix original = buildTridiagonal(main, secondary);
        assertMatrixEquals(original, reconstructed, LOOSE_DELTA);
    }

    // ---------- eigenvalues/eigenvectors accessor tests ----------

    @Test
    public void testGetRealEigenvalues_returnsClonedArray() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double[] ev1 = ed.getRealEigenvalues();
        ev1[0] = -999.0;
        double[] ev2 = ed.getRealEigenvalues();
        assertEquals(3.0, ev2[0], DELTA);
    }

    @Test
    public void testGetRealEigenvalue_validIndex() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        assertEquals(3.0, ed.getRealEigenvalue(0), DELTA);
        assertEquals(1.0, ed.getRealEigenvalue(1), DELTA);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRealEigenvalue_invalidIndex_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        ed.getRealEigenvalue(5);
    }

    @Test
    public void testGetImagEigenvalues_allZero() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double[] imag = ed.getImagEigenvalues();
        for (double v : imag) {
            assertEquals(0.0, v, DELTA);
        }
    }

    @Test
    public void testGetImagEigenvalue_validIndex_isZero() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        assertEquals(0.0, ed.getImagEigenvalue(0), DELTA);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetImagEigenvalue_invalidIndex_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        ed.getImagEigenvalue(10);
    }

    @Test
    public void testGetEigenvector_validIndex() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        RealVector v0 = ed.getEigenvector(0);
        assertEquals(2, v0.getDimension());
        // norm should be 1 since vectors are normalized
        double norm2 = v0.getEntry(0) * v0.getEntry(0) + v0.getEntry(1) * v0.getEntry(1);
        assertEquals(1.0, norm2, LOOSE_DELTA);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetEigenvector_invalidIndex_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        ed.getEigenvector(99);
    }

    // ---------- determinant ----------

    @Test
    public void testGetDeterminant_matchesProductOfEigenvalues() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double det = ed.getDeterminant();
        assertEquals(3.0, det, DELTA);
    }

    @Test
    public void testGetDeterminant_singularMatrix_isZero() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {1, 1}, {1, 1} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double det = ed.getDeterminant();
        assertEquals(0.0, det, DELTA);
    }

    // ---------- Solver tests ----------

    @Test
    public void testGetSolver_solveDoubleArray_normalCase() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        double[] b = { 3.0, 3.0 };
        double[] x = solver.solve(b);
        // verify A * x ~= b
        double r0 = m.getEntry(0, 0) * x[0] + m.getEntry(0, 1) * x[1];
        double r1 = m.getEntry(1, 0) * x[0] + m.getEntry(1, 1) * x[1];
        assertEquals(b[0], r0, LOOSE_DELTA);
        assertEquals(b[1], r1, LOOSE_DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolver_solveDoubleArray_wrongLength_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        double[] b = { 1.0, 2.0, 3.0 };
        solver.solve(b);
    }

    @Test
    public void testGetSolver_solveRealVector_normalCase() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        RealVector b = new ArrayRealVector(new double[] { 3.0, 3.0 });
        RealVector x = solver.solve(b);
        double r0 = m.getEntry(0, 0) * x.getEntry(0) + m.getEntry(0, 1) * x.getEntry(1);
        double r1 = m.getEntry(1, 0) * x.getEntry(0) + m.getEntry(1, 1) * x.getEntry(1);
        assertEquals(3.0, r0, LOOSE_DELTA);
        assertEquals(3.0, r1, LOOSE_DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolver_solveRealVector_wrongDimension_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        RealVector b = new ArrayRealVector(new double[] { 1.0, 2.0, 3.0 });
        solver.solve(b);
    }

    @Test
    public void testGetSolver_solveRealMatrix_normalCase() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        RealMatrix b = buildMatrix(new double[][] { {3.0}, {3.0} });
        RealMatrix x = solver.solve(b);
        RealMatrix reconstructedB = m.multiply(x);
        assertMatrixEquals(b, reconstructedB, LOOSE_DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSolver_solveRealMatrix_wrongRowDimension_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        RealMatrix b = buildMatrix(new double[][] { {3.0}, {3.0}, {3.0} });
        solver.solve(b);
    }

    @Test
    public void testGetSolver_isNonSingular_trueCase() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testGetSolver_isNonSingular_falseCase_singularMatrix() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {1, 1}, {1, 1} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        assertFalse(solver.isNonSingular());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetSolver_solve_singularMatrix_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {1, 1}, {1, 1} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        solver.solve(new double[] { 1.0, 1.0 });
    }

    @Test
    public void testGetSolver_getInverse_normalCase() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {2, 1}, {1, 2} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        RealMatrix inverse = solver.getInverse();
        RealMatrix product = m.multiply(inverse);
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        assertMatrixEquals(identity, product, LOOSE_DELTA);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetSolver_getInverse_singularMatrix_throwsException() throws Exception {
        RealMatrix m = buildMatrix(new double[][] { {1, 1}, {1, 1} });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        DecompositionSolver solver = ed.getSolver();
        solver.getInverse();
    }

    // ---------- larger matrix / transformer path ----------

    @Test
    public void testConstructor_fourByFourSymmetricMatrix_viaTransformer() throws Exception {
        RealMatrix m = buildMatrix(new double[][] {
            {4, 1, 0, 0},
            {1, 4, 1, 0},
            {0, 1, 4, 1},
            {0, 0, 1, 4}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(4, ev.length);
        double sum = 0;
        for (double v : ev) {
            sum += v;
        }
        assertEquals(16.0, sum, LOOSE_DELTA);

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);
        assertMatrixEquals(m, reconstructed, LOOSE_DELTA);
    }

    @Test
    public void testConstructor_nonTridiagonalSymmetricMatrix_fullMatrix() throws Exception {
        RealMatrix m = buildMatrix(new double[][] {
            {2, 1, 1},
            {1, 2, 1},
            {1, 1, 2}
        });
        EigenDecompositionImpl ed = new EigenDecompositionImpl(m, 1.0e-10);
        double[] ev = ed.getRealEigenvalues();
        assertEquals(3, ev.length);
        // eigenvalues of this matrix are 4, 1, 1
        assertEquals(4.0, ev[0], LOOSE_DELTA);
        assertEquals(1.0, ev[1], LOOSE_DELTA);
        assertEquals(1.0, ev[2], LOOSE_DELTA);
    }
}
