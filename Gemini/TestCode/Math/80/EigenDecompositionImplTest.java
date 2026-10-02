package org.apache.commons.math.linear;

import org.apache.commons.math.util.MathUtils;
import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImplTest {

    private static final double EPSILON = 1e-10;

    @Test(expected = InvalidMatrixException.class)
    public void testConstructor_asymmetricMatrix_throwsInvalidMatrixException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        });
        new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
    }

    @Test
    public void testDimension1_fromMatrix() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 5.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        Assert.assertEquals(5.0, ed.getRealEigenvalue(0), EPSILON);
        Assert.assertEquals(0.0, ed.getImagEigenvalue(0), EPSILON);
        Assert.assertArrayEquals(new double[] { 5.0 }, ed.getRealEigenvalues(), EPSILON);
        Assert.assertArrayEquals(new double[] { 0.0 }, ed.getImagEigenvalues(), EPSILON);
        Assert.assertEquals(5.0, ed.getDeterminant(), EPSILON);

        RealMatrix v = ed.getV();
        RealMatrix vt = ed.getVT();
        RealMatrix d = ed.getD();

        Assert.assertEquals(1.0, v.getEntry(0, 0), EPSILON);
        Assert.assertEquals(1.0, vt.getEntry(0, 0), EPSILON);
        Assert.assertEquals(5.0, d.getEntry(0, 0), EPSILON);

        RealVector ev = ed.getEigenvector(0);
        Assert.assertEquals(1.0, ev.getEntry(0), EPSILON);

        // Test Solver
        DecompositionSolver solver = ed.getSolver();
        Assert.assertTrue(solver.isNonSingular());

        double[] bVec = new double[] { 10.0 };
        double[] xVec = solver.solve(bVec);
        Assert.assertEquals(2.0, xVec[0], EPSILON);

        RealVector bRealVec = new ArrayRealVector(new double[] { 10.0 });
        RealVector xRealVec = solver.solve(bRealVec);
        Assert.assertEquals(2.0, xRealVec.getEntry(0), EPSILON);

        RealMatrix bMat = MatrixUtils.createRealMatrix(new double[][] { { 10.0, 15.0 } });
        RealMatrix xMat = solver.solve(bMat);
        Assert.assertEquals(2.0, xMat.getEntry(0, 0), EPSILON);
        Assert.assertEquals(3.0, xMat.getEntry(0, 1), EPSILON);

        RealMatrix inv = solver.getInverse();
        Assert.assertEquals(0.2, inv.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testDimension1_fromTridiagonalArrays() {
        double[] main = new double[] { 4.0 };
        double[] secondary = new double[0];
        EigenDecomposition ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);

        Assert.assertEquals(4.0, ed.getRealEigenvalue(0), EPSILON);
        Assert.assertEquals(4.0, ed.getDeterminant(), EPSILON);
    }

    @Test
    public void testDimension2_fromMatrix() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 2.0, 1.0 },
            { 1.0, 2.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        double[] eigenvalues = ed.getRealEigenvalues();
        Assert.assertEquals(2, eigenvalues.length);
        Assert.assertEquals(3.0, eigenvalues[0], EPSILON);
        Assert.assertEquals(1.0, eigenvalues[1], EPSILON);

        Assert.assertEquals(3.0, ed.getDeterminant(), EPSILON);

        RealMatrix v = ed.getV();
        RealMatrix vt = ed.getVT();
        RealMatrix d = ed.getD();

        // Check A = V * D * V^T
        RealMatrix reconstructed = v.multiply(d).multiply(vt);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }

        // Test cached V and VT reuse
        Assert.assertSame(v, ed.getV());
        Assert.assertSame(vt, ed.getVT());
        Assert.assertSame(d, ed.getD());
    }

    @Test
    public void testDimension3_fromMatrix() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 3.0, 2.0, 0.0 },
            { 2.0, 4.0, 1.0 },
            { 0.0, 1.0, 5.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        double[] ev = ed.getRealEigenvalues();
        Assert.assertEquals(3, ev.length);
        Assert.assertTrue(ev[0] >= ev[1] && ev[1] >= ev[2]);

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test
    public void testDimension4_fromTridiagonalArrays() {
        double[] main = new double[] { 4.0, 3.0, 2.0, 1.0 };
        double[] secondary = new double[] { 1.0, 0.5, 0.2 };
        EigenDecomposition ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);

        double[] ev = ed.getRealEigenvalues();
        Assert.assertEquals(4, ev.length);
        Assert.assertTrue(ev[0] >= ev[1] && ev[1] >= ev[2] && ev[2] >= ev[3]);

        for (int i = 0; i < 4; i++) {
            RealVector vec = ed.getEigenvector(i);
            Assert.assertEquals(1.0, vec.getNorm(), EPSILON);
        }
    }

    @Test
    public void testDimension6_generalBlock_decompositionAndSolve() {
        double[][] data = new double[][] {
            { 10.0,  1.0,  0.5,  0.0,  0.0,  0.0 },
            {  1.0,  8.0,  2.0,  0.1,  0.0,  0.0 },
            {  0.5,  2.0,  7.0,  1.5,  0.2,  0.0 },
            {  0.0,  0.1,  1.5,  6.0,  1.0,  0.5 },
            {  0.0,  0.0,  0.2,  1.0,  5.0,  2.0 },
            {  0.0,  0.0,  0.0,  0.5,  2.0,  4.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), 1e-8);
            }
        }

        DecompositionSolver solver = ed.getSolver();
        double[] b = new double[] { 1, 2, 3, 4, 5, 6 };
        double[] x = solver.solve(b);
        RealVector bVec = new ArrayRealVector(b);
        RealVector xVec = solver.solve(bVec);

        Assert.assertArrayEquals(x, xVec.getData(), EPSILON);

        RealMatrix bMat = MatrixUtils.createRealIdentityMatrix(6);
        RealMatrix xMat = solver.solve(bMat);
        RealMatrix inv = solver.getInverse();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Assert.assertEquals(xMat.getEntry(i, j), inv.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test
    public void testIndefiniteMatrix_muHandling() {
        // Matrix with both positive and negative eigenvalues
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            {  2.0, -3.0,  0.0 },
            { -3.0,  1.0, -2.0 },
            {  0.0, -2.0, -5.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);

        double[] ev = ed.getRealEigenvalues();
        Assert.assertTrue(ev[0] > 0);
        Assert.assertTrue(ev[ev.length - 1] < 0);

        RealMatrix v = ed.getV();
        RealMatrix d = ed.getD();
        RealMatrix vt = ed.getVT();
        RealMatrix reconstructed = v.multiply(d).multiply(vt);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test
    public void testSplittingBlocks() {
        // High splitTolerance forcing tridiagonal matrix to split into sub-blocks
        double[] main = new double[] { 10.0, 20.0, 30.0, 40.0, 50.0 };
        double[] secondary = new double[] { 1e-12, 5.0, 1e-12, 2.0 };
        EigenDecomposition ed = new EigenDecompositionImpl(main, secondary, 1e-5);

        double[] ev = ed.getRealEigenvalues();
        Assert.assertEquals(5, ev.length);
        Assert.assertTrue(ev[0] >= ev[1] && ev[1] >= ev[2] && ev[2] >= ev[3] && ev[3] >= ev[4]);

        for (int i = 0; i < 5; i++) {
            RealVector vec = ed.getEigenvector(i);
            Assert.assertEquals(1.0, vec.getNorm(), EPSILON);
        }
    }

    @Test
    public void testSingularMatrix_solverThrowsSingularMatrixException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 2.0 },
            { 2.0, 4.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();

        Assert.assertFalse(solver.isNonSingular());
        Assert.assertEquals(0.0, ed.getDeterminant(), EPSILON);

        try {
            solver.solve(new double[] { 1.0, 2.0 });
            Assert.fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            // Success
        }

        try {
            solver.solve(new ArrayRealVector(new double[] { 1.0, 2.0 }));
            Assert.fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            // Success
        }

        try {
            solver.solve(MatrixUtils.createRealIdentityMatrix(2));
            Assert.fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            // Success
        }

        try {
            solver.getInverse();
            Assert.fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            // Success
        }
    }

    @Test
    public void testSolver_dimensionMismatches_throwIllegalArgumentException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 3.0, 1.0 },
            { 1.0, 3.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = ed.getSolver();

        try {
            solver.solve(new double[] { 1.0, 2.0, 3.0 });
            Assert.fail("Expected IllegalArgumentException for array length mismatch");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            solver.solve(new ArrayRealVector(new double[] { 1.0 }));
            Assert.fail("Expected IllegalArgumentException for vector dimension mismatch");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            solver.solve(MatrixUtils.createRealMatrix(new double[][] { { 1.0 }, { 2.0 }, { 3.0 } }));
            Assert.fail("Expected IllegalArgumentException for matrix row dimension mismatch");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRealEigenvalue_outOfBounds_throwsException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 0.0 },
            { 0.0, 2.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        ed.getRealEigenvalue(5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetImagEigenvalue_outOfBounds_throwsException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 0.0 },
            { 0.0, 2.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        ed.getImagEigenvalue(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetEigenvector_outOfBounds_throwsException() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {
            { 1.0, 0.0 },
            { 0.0, 2.0 }
        });
        EigenDecomposition ed = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        ed.getEigenvector(3);
    }

    @Test
    public void testFlipWarrantedBranch() {
        // Array configured to trigger flipIfWarranted condition
        double[] main = new double[] { 1.0, 2.0, 3.0, 4.0, 50.0 };
        double[] secondary = new double[] { 0.5, 1.0, 1.5, 2.0 };
        EigenDecomposition ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);

        double[] ev = ed.getRealEigenvalues();
        Assert.assertEquals(5, ev.length);
        for (int i = 0; i < 5; i++) {
            Assert.assertNotNull(ed.getEigenvector(i));
        }
    }

    @Test
    public void testDiagonalMatrix() {
        // Zero off-diagonal matrix
        double[] main = new double[] { 5.0, 4.0, 3.0, 2.0, 1.0 };
        double[] secondary = new double[] { 0.0, 0.0, 0.0, 0.0 };
        EigenDecomposition ed = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);

        double[] ev = ed.getRealEigenvalues();
        Assert.assertArrayEquals(new double[] { 5.0, 4.0, 3.0, 2.0, 1.0 }, ev, EPSILON);
    }
}
