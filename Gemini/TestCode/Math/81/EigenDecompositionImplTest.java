package org.apache.commons.math.linear;

import org.apache.commons.math.util.MathUtils;
import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImplTest {

    private static final double TOLERANCE = 1e-6;

    @Test(expected = InvalidMatrixException.class)
    public void testConstructor_nonSymmetricMatrix_throwsException() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
    }

    @Test
    public void test1x1Matrix() {
        double[][] data = {{5.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        Assert.assertEquals(1, ed.getRealEigenvalues().length);
        Assert.assertEquals(5.0, ed.getRealEigenvalue(0), TOLERANCE);
        Assert.assertEquals(0.0, ed.getImagEigenvalue(0), TOLERANCE);
        Assert.assertEquals(5.0, ed.getDeterminant(), TOLERANCE);

        RealMatrix v = ed.getV();
        RealMatrix vt = ed.getVT();
        RealMatrix d = ed.getD();

        Assert.assertEquals(1.0, Math.abs(v.getEntry(0, 0)), TOLERANCE);
        Assert.assertEquals(1.0, Math.abs(vt.getEntry(0, 0)), TOLERANCE);
        Assert.assertEquals(5.0, d.getEntry(0, 0), TOLERANCE);

        RealVector ev = ed.getEigenvector(0);
        Assert.assertEquals(1, ev.getDimension());
        Assert.assertEquals(1.0, Math.abs(ev.getEntry(0)), TOLERANCE);
    }

    @Test
    public void test2x2Matrix() {
        double[][] data = {
            {2.0, 1.0},
            {1.0, 2.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        double[] realValues = ed.getRealEigenvalues();
        Assert.assertEquals(2, realValues.length);
        Assert.assertEquals(3.0, realValues[0], TOLERANCE);
        Assert.assertEquals(1.0, realValues[1], TOLERANCE);
        Assert.assertEquals(3.0, ed.getDeterminant(), TOLERANCE);

        // Test V * D * V^T = A
        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test
    public void test3x3Matrix() {
        double[][] data = {
            {2.0, -1.0, 0.0},
            {-1.0, 2.0, -1.0},
            {0.0, -1.0, 2.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        double[] realValues = ed.getRealEigenvalues();
        Assert.assertEquals(3, realValues.length);
        Assert.assertTrue(realValues[0] >= realValues[1]);
        Assert.assertTrue(realValues[1] >= realValues[2]);

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test
    public void testTridiagonalDirectConstructor_4x4() {
        double[] main = {4.0, 3.0, 2.0, 1.0};
        double[] secondary = {1.0, 0.5, 0.2};
        EigenDecomposition ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);

        double[] realValues = ed.getRealEigenvalues();
        Assert.assertEquals(4, realValues.length);
        for (int i = 0; i < realValues.length - 1; i++) {
            Assert.assertTrue(realValues[i] >= realValues[i + 1]);
        }

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        Assert.assertEquals(main[0], reconstructed.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(secondary[0], reconstructed.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(secondary[0], reconstructed.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(main[1], reconstructed.getEntry(1, 1), TOLERANCE);
    }

    @Test
    public void testLargerMatrix_generalBlockDqds() {
        int n = 8;
        double[][] data = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = (i == j) ? 2.0 * (i + 1) : ((Math.abs(i - j) == 1) ? 1.0 : 0.0);
            }
        }
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test
    public void testDiagonalMatrix_splitsHandling() {
        double[] main = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] secondary = {0.0, 0.0, 0.0, 0.0};
        EigenDecomposition ed = new EigenDecompositionImpl(main, secondary, 1.0);

        double[] realValues = ed.getRealEigenvalues();
        for (int i = 0; i < main.length; i++) {
            Assert.assertEquals(main[i], realValues[i], TOLERANCE);
        }
    }

    @Test
    public void testIndefiniteMatrix_muShiftInEigenvectors() {
        double[][] data = {
            {-2.0, 1.0, 0.0, 0.0},
            {1.0, 3.0, 1.0, 0.0},
            {0.0, 1.0, -1.0, 1.0},
            {0.0, 0.0, 1.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        double[] realValues = ed.getRealEigenvalues();
        Assert.assertTrue(realValues[0] > 0);
        Assert.assertTrue(realValues[realValues.length - 1] < 0);

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Assert.assertEquals(data[i][j], reconstructed.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test
    public void testSolver_solveArrayVectorMatrix() {
        double[][] data = {
            {4.0, 1.0, -2.0},
            {1.0, 2.0, 0.0},
            {-2.0, 0.0, 3.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();

        Assert.assertTrue(solver.isNonSingular());

        double[] bArray = {1.0, 2.0, 3.0};
        double[] xArray = solver.solve(bArray);
        RealVector xVecFromArr = matrix.operate(new ArrayRealVector(xArray));
        for (int i = 0; i < bArray.length; i++) {
            Assert.assertEquals(bArray[i], xVecFromArr.getEntry(i), TOLERANCE);
        }

        RealVector bVec = new ArrayRealVector(bArray);
        RealVector xVec = solver.solve(bVec);
        RealVector bVecReconstructed = matrix.operate(xVec);
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(bVec.getEntry(i), bVecReconstructed.getEntry(i), TOLERANCE);
        }

        RealMatrix bMat = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix inv = solver.solve(bMat);
        RealMatrix identity = matrix.multiply(inv);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals((i == j) ? 1.0 : 0.0, identity.getEntry(i, j), TOLERANCE);
            }
        }

        RealMatrix directInv = solver.getInverse();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(inv.getEntry(i, j), directInv.getEntry(i, j), TOLERANCE);
            }
        }
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolver_singularMatrix_throwsExceptionOnSolveArray() {
        double[][] data = {
            {1.0, 1.0},
            {1.0, 1.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();

        Assert.assertFalse(solver.isNonSingular());
        solver.solve(new double[]{1.0, 2.0});
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolver_singularMatrix_throwsExceptionOnSolveVector() {
        double[][] data = {
            {1.0, 1.0},
            {1.0, 1.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();

        solver.solve(new ArrayRealVector(new double[]{1.0, 2.0}));
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolver_singularMatrix_throwsExceptionOnSolveMatrix() {
        double[][] data = {
            {1.0, 1.0},
            {1.0, 1.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();

        solver.solve(MatrixUtils.createRealIdentityMatrix(2));
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolver_singularMatrix_throwsExceptionOnGetInverse() {
        double[][] data = {
            {1.0, 1.0},
            {1.0, 1.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();

        solver.getInverse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_dimensionMismatch_array() {
        double[][] data = {
            {2.0, 1.0},
            {1.0, 2.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new double[]{1.0, 2.0, 3.0});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_dimensionMismatch_vector() {
        double[][] data = {
            {2.0, 1.0},
            {1.0, 2.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        ed.getSolver().solve(new ArrayRealVector(new double[]{1.0, 2.0, 3.0}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_dimensionMismatch_matrix() {
        double[][] data = {
            {2.0, 1.0},
            {1.0, 2.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        ed.getSolver().solve(MatrixUtils.createRealIdentityMatrix(3));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRealEigenvalue_outOfBounds_throwsException() {
        double[][] data = {{1.0}};
        EigenDecomposition ed = new EigenDecompositionImpl(new Array2DRowRealMatrix(data), MathUtils.SAFE_MIN);
        ed.getRealEigenvalue(1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetImagEigenvalue_outOfBounds_throwsException() {
        double[][] data = {{1.0}};
        EigenDecomposition ed = new EigenDecompositionImpl(new Array2DRowRealMatrix(data), MathUtils.SAFE_MIN);
        ed.getImagEigenvalue(1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetEigenvector_outOfBounds_throwsException() {
        double[][] data = {{1.0}};
        EigenDecomposition ed = new EigenDecompositionImpl(new Array2DRowRealMatrix(data), MathUtils.SAFE_MIN);
        ed.getEigenvector(1);
    }

    @Test
    public void testCachedValues() {
        double[][] data = {
            {2.0, 1.0},
            {1.0, 2.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        RealMatrix v1 = ed.getV();
        RealMatrix v2 = ed.getV();
        Assert.assertSame(v1, v2);

        RealMatrix vt1 = ed.getVT();
        RealMatrix vt2 = ed.getVT();
        Assert.assertSame(vt1, vt2);

        RealMatrix d1 = ed.getD();
        RealMatrix d2 = ed.getD();
        Assert.assertSame(d1, d2);

        double[] imag = ed.getImagEigenvalues();
        Assert.assertEquals(2, imag.length);
        Assert.assertEquals(0.0, imag[0], TOLERANCE);
        Assert.assertEquals(0.0, imag[1], TOLERANCE);
    }
}
