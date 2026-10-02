package org.apache.commons.math.linear;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CholeskyDecompositionImplTest {

    private RealMatrix spdMatrix;

    @Before
    public void setUp() {
        // Symmetric positive definite matrix: A = [[4,2],[2,3]]
        // Cholesky: L = [[2,0],[1,sqrt(2)]]
        spdMatrix = new RealMatrixImpl(new double[][] {
                {4.0, 2.0},
                {2.0, 3.0}
        });
    }

    // --------------------------------------------------------------
    // Constructor tests (normal / typical)
    // --------------------------------------------------------------

    @Test
    public void testConstructor_normalMatrix_computesCorrectDecomposition() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        RealMatrix l = cd.getL();

        assertEquals(2.0, l.getEntry(0, 0), 1.0e-9);
        assertEquals(0.0, l.getEntry(0, 1), 1.0e-9);
        assertEquals(1.0, l.getEntry(1, 0), 1.0e-9);
        assertEquals(Math.sqrt(2.0), l.getEntry(1, 1), 1.0e-9);
    }

    @Test
    public void testConstructorWithThresholds_customThresholds_works() {
        // slightly asymmetric matrix, but within a large relative symmetry threshold
        RealMatrix slightlyAsymmetric = new RealMatrixImpl(new double[][] {
                {4.0, 2.0000001},
                {2.0, 3.0}
        });
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(
                slightlyAsymmetric, 1.0, 1.0e-10);
        assertNotNull(cd.getL());
    }

    // --------------------------------------------------------------
    // Edge / exception cases for constructor
    // --------------------------------------------------------------

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructor_nonSquareMatrix_throwsException() {
        RealMatrix nonSquare = new RealMatrixImpl(new double[][] {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0}
        });
        new CholeskyDecompositionImpl(nonSquare);
    }

    @Test(expected = NotSymmetricMatrixException.class)
    public void testConstructor_nonSymmetricMatrix_throwsException() {
        RealMatrix nonSymmetric = new RealMatrixImpl(new double[][] {
                {4.0, 2.0},
                {3.0, 3.0}
        });
        new CholeskyDecompositionImpl(nonSymmetric);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructor_notPositiveDefiniteMatrix_throwsException() {
        RealMatrix notPositiveDefinite = new RealMatrixImpl(new double[][] {
                {-4.0, 2.0},
                {2.0, 3.0}
        });
        new CholeskyDecompositionImpl(notPositiveDefinite);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructor_zeroDiagonalElement_throwsException() {
        RealMatrix zeroDiagonal = new RealMatrixImpl(new double[][] {
                {0.0, 0.0},
                {0.0, 3.0}
        });
        new CholeskyDecompositionImpl(zeroDiagonal);
    }

    // --------------------------------------------------------------
    // getL / getLT
    // --------------------------------------------------------------

    @Test
    public void testGetL_returnsLowerTriangularMatrix() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        RealMatrix l = cd.getL();
        assertEquals(0.0, l.getEntry(0, 1), 1.0e-9);
    }

    @Test
    public void testGetLT_returnsTransposeOfL() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        RealMatrix lt = cd.getLT();
        RealMatrix l = cd.getL();
        assertEquals(l.getEntry(1, 0), lt.getEntry(0, 1), 1.0e-9);
        assertEquals(l.getEntry(0, 0), lt.getEntry(0, 0), 1.0e-9);
    }

    @Test
    public void testGetL_cachedValue_sameInstanceReturned() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        RealMatrix l1 = cd.getL();
        RealMatrix l2 = cd.getL();
        assertSame(l1, l2);
    }

    @Test
    public void testGetLT_cachedValue_sameInstanceReturned() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        RealMatrix lt1 = cd.getLT();
        RealMatrix lt2 = cd.getLT();
        assertSame(lt1, lt2);
    }

    // --------------------------------------------------------------
    // getDeterminant
    // --------------------------------------------------------------

    @Test
    public void testGetDeterminant_returnsCorrectValue() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        // det(A) = 4*3 - 2*2 = 8
        assertEquals(8.0, cd.getDeterminant(), 1.0e-9);
    }

    // --------------------------------------------------------------
    // getSolver basic
    // --------------------------------------------------------------

    @Test
    public void testGetSolver_returnsNonNullSolver() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        assertNotNull(solver);
    }

    @Test
    public void testSolver_isNonSingular_returnsTrue() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        assertTrue(solver.isNonSingular());
    }

    // --------------------------------------------------------------
    // solve(double[])
    // --------------------------------------------------------------

    @Test
    public void testSolver_solveArray_normalInput_correctResult() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        double[] b = {1.0, 2.0};
        double[] x = solver.solve(b);
        // A^-1 = 1/8 * [[3,-2],[-2,4]]; x = A^-1 * b = [-0.125, 0.75]
        assertEquals(-0.125, x[0], 1.0e-9);
        assertEquals(0.75, x[1], 1.0e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_solveArray_dimensionMismatch_throwsException() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        double[] b = {1.0, 2.0, 3.0};
        solver.solve(b);
    }

    // --------------------------------------------------------------
    // solve(RealVector) via RealVectorImpl
    // --------------------------------------------------------------

    @Test
    public void testSolver_solveRealVectorImpl_normalInput_correctResult() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        RealVectorImpl b = new RealVectorImpl(new double[] {1.0, 2.0});
        RealVector x = solver.solve(b);
        assertEquals(-0.125, x.getEntry(0), 1.0e-9);
        assertEquals(0.75, x.getEntry(1), 1.0e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_solveRealVectorImpl_dimensionMismatch_throwsException() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        RealVectorImpl b = new RealVectorImpl(new double[] {1.0, 2.0, 3.0});
        solver.solve(b);
    }

    // --------------------------------------------------------------
    // solve(RealMatrix)
    // --------------------------------------------------------------

    @Test
    public void testSolver_solveRealMatrix_identity_returnsInverse() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        RealMatrix identity = new RealMatrixImpl(new double[][] {
                {1.0, 0.0},
                {0.0, 1.0}
        });
        RealMatrix inv = solver.solve(identity);
        assertEquals(0.375, inv.getEntry(0, 0), 1.0e-9);
        assertEquals(-0.25, inv.getEntry(0, 1), 1.0e-9);
        assertEquals(-0.25, inv.getEntry(1, 0), 1.0e-9);
        assertEquals(0.5, inv.getEntry(1, 1), 1.0e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_solveRealMatrix_dimensionMismatch_throwsException() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        RealMatrix wrongDimension = new RealMatrixImpl(new double[][] {
                {1.0, 0.0},
                {0.0, 1.0},
                {0.0, 0.0}
        });
        solver.solve(wrongDimension);
    }

    // --------------------------------------------------------------
    // getInverse
    // --------------------------------------------------------------

    @Test
    public void testSolver_getInverse_matchesManualSolve() {
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(spdMatrix);
        DecompositionSolver solver = cd.getSolver();
        RealMatrix inverse = solver.getInverse();
        assertEquals(0.375, inverse.getEntry(0, 0), 1.0e-9);
        assertEquals(-0.25, inverse.getEntry(0, 1), 1.0e-9);
        assertEquals(-0.25, inverse.getEntry(1, 0), 1.0e-9);
        assertEquals(0.5, inverse.getEntry(1, 1), 1.0e-9);
    }

    // --------------------------------------------------------------
    // Larger matrix for additional coverage of loops
    // --------------------------------------------------------------

    @Test
    public void testConstructor_largerMatrix_computesCorrectDecomposition() {
        RealMatrix larger = new RealMatrixImpl(new double[][] {
                {4.0, 2.0, 0.0},
                {2.0, 5.0, 1.0},
                {0.0, 1.0, 3.0}
        });
        CholeskyDecompositionImpl cd = new CholeskyDecompositionImpl(larger);
        RealMatrix l = cd.getL();
        RealMatrix lt = cd.getLT();

        // reconstruct A = L * LT manually using entries
        double a00 = l.getEntry(0, 0) * lt.getEntry(0, 0);
        assertEquals(4.0, a00, 1.0e-9);

        double a11 = l.getEntry(1, 0) * lt.getEntry(0, 1) + l.getEntry(1, 1) * lt.getEntry(1, 1);
        assertEquals(5.0, a11, 1.0e-9);
    }
}
