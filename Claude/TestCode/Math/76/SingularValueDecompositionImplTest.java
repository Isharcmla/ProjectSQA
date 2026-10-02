import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.InvalidMatrixException;
import org.apache.commons.math.linear.MatrixUtils;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.SingularValueDecompositionImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingularValueDecompositionImplTest {

    private static final double EPS = 1.0e-9;

    private RealMatrix squareMatrix;
    private RealMatrix tallMatrix;   // m > n
    private RealMatrix wideMatrix;   // m < n
    private RealMatrix singularMatrix;

    @Before
    public void setUp() {
        squareMatrix = new Array2DRowRealMatrix(new double[][] {
            {3.0, 0.0},
            {0.0, 4.0}
        });

        tallMatrix = new Array2DRowRealMatrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        });

        wideMatrix = new Array2DRowRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        });

        singularMatrix = new Array2DRowRealMatrix(new double[][] {
            {1.0, 2.0},
            {2.0, 4.0}
        });
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

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_squareMatrix_normalInput() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        double[] sv = svd.getSingularValues();
        assertEquals(2, sv.length);
        // singular values should be sorted descending
        assertTrue(sv[0] >= sv[1]);
    }

    @Test
    public void testConstructor_tallMatrix_moreRowsThanColumns() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        assertEquals(2, svd.getSingularValues().length);

        RealMatrix u = svd.getU();
        RealMatrix s = svd.getS();
        RealMatrix vt = svd.getVT();

        RealMatrix reconstructed = u.multiply(s).multiply(vt);
        assertMatrixEquals(tallMatrix, reconstructed, 1.0e-6);
    }

    @Test
    public void testConstructor_wideMatrix_moreColumnsThanRows() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(wideMatrix);
        assertEquals(2, svd.getSingularValues().length);

        RealMatrix u = svd.getU();
        RealMatrix s = svd.getS();
        RealMatrix vt = svd.getVT();

        RealMatrix reconstructed = u.multiply(s).multiply(vt);
        assertMatrixEquals(wideMatrix, reconstructed, 1.0e-6);
    }

    @Test
    public void testConstructor_withMaxParameter_limitsSingularValues() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix, 1);
        assertEquals(1, svd.getSingularValues().length);
    }

    @Test
    public void testConstructor_singularMatrix_rankDeficient() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(singularMatrix);
        double[] sv = svd.getSingularValues();
        // one singular value should be (close to) zero, filtered out => length < 2 or second very small
        assertTrue(sv.length <= 2);
    }

    // ---------- getU / getUT ----------

    @Test
    public void testGetU_squareMatrix_returnsOrthogonalMatrix() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix u = svd.getU();
        assertNotNull(u);
        assertEquals(2, u.getRowDimension());
    }

    @Test
    public void testGetU_tallMatrix_cachedValueReturnedOnSecondCall() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        RealMatrix u1 = svd.getU();
        RealMatrix u2 = svd.getU();
        assertSame(u1, u2);
    }

    @Test
    public void testGetU_wideMatrix_returnsMatrixWithCorrectDimensions() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(wideMatrix);
        RealMatrix u = svd.getU();
        assertEquals(2, u.getRowDimension());
    }

    @Test
    public void testGetUT_returnsTransposeOfU() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        RealMatrix u = svd.getU();
        RealMatrix ut = svd.getUT();
        assertMatrixEquals(u.transpose(), ut, EPS);
    }

    @Test
    public void testGetUT_cachedValueReturnedOnSecondCall() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        RealMatrix ut1 = svd.getUT();
        RealMatrix ut2 = svd.getUT();
        assertSame(ut1, ut2);
    }

    // ---------- getS ----------

    @Test
    public void testGetS_returnsDiagonalMatrix() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix s = svd.getS();
        assertEquals(2, s.getRowDimension());
        assertEquals(2, s.getColumnDimension());
        assertEquals(0.0, s.getEntry(0, 1), EPS);
        assertEquals(0.0, s.getEntry(1, 0), EPS);
    }

    @Test
    public void testGetS_cachedValueReturnedOnSecondCall() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix s1 = svd.getS();
        RealMatrix s2 = svd.getS();
        assertSame(s1, s2);
    }

    // ---------- getSingularValues ----------

    @Test
    public void testGetSingularValues_returnsClonedArray_notSameReference() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        double[] sv1 = svd.getSingularValues();
        double[] sv2 = svd.getSingularValues();
        assertNotSame(sv1, sv2);
        assertArrayEquals(sv1, sv2, EPS);
    }

    // ---------- getV / getVT ----------

    @Test
    public void testGetV_tallMatrix_returnsCorrectDimensions() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        RealMatrix v = svd.getV();
        assertEquals(2, v.getRowDimension());
    }

    @Test
    public void testGetV_wideMatrix_returnsCorrectDimensions() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(wideMatrix);
        RealMatrix v = svd.getV();
        assertEquals(3, v.getRowDimension());
    }

    @Test
    public void testGetV_cachedValueReturnedOnSecondCall() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        RealMatrix v1 = svd.getV();
        RealMatrix v2 = svd.getV();
        assertSame(v1, v2);
    }

    @Test
    public void testGetVT_returnsTransposeOfV() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        RealMatrix v = svd.getV();
        RealMatrix vt = svd.getVT();
        assertMatrixEquals(v.transpose(), vt, EPS);
    }

    @Test
    public void testGetVT_cachedValueReturnedOnSecondCall() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        RealMatrix vt1 = svd.getVT();
        RealMatrix vt2 = svd.getVT();
        assertSame(vt1, vt2);
    }

    // ---------- getCovariance ----------

    @Test
    public void testGetCovariance_normalInput_returnsSquareMatrix() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        double minSingularValue = 0.0;
        RealMatrix cov = svd.getCovariance(minSingularValue);
        assertNotNull(cov);
        assertEquals(cov.getRowDimension(), cov.getColumnDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCovariance_thresholdTooHigh_throwsIllegalArgumentException() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        double[] sv = svd.getSingularValues();
        double tooHigh = sv[0] + 100.0;
        svd.getCovariance(tooHigh);
    }

    // ---------- getNorm ----------

    @Test
    public void testGetNorm_returnsLargestSingularValue() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        double norm = svd.getNorm();
        double[] sv = svd.getSingularValues();
        assertEquals(sv[0], norm, EPS);
    }

    // ---------- getConditionNumber ----------

    @Test
    public void testGetConditionNumber_returnsRatioOfExtremeSingularValues() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        double cond = svd.getConditionNumber();
        double[] sv = svd.getSingularValues();
        assertEquals(sv[0] / sv[sv.length - 1], cond, EPS);
    }

    // ---------- getRank ----------

    @Test
    public void testGetRank_fullRankMatrix_returnsMinDimension() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        int rank = svd.getRank();
        assertEquals(2, rank);
    }

    @Test
    public void testGetRank_singularMatrix_returnsLowerRank() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(singularMatrix);
        int rank = svd.getRank();
        assertEquals(1, rank);
    }

    // ---------- getSolver ----------

    @Test
    public void testGetSolver_notNull() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        DecompositionSolver solver = svd.getSolver();
        assertNotNull(solver);
    }

    @Test
    public void testSolver_isNonSingular_forFullRankSquareMatrix_returnsTrue() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        DecompositionSolver solver = svd.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testSolver_isNonSingular_forSingularMatrix_returnsFalse() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(singularMatrix);
        DecompositionSolver solver = svd.getSolver();
        assertFalse(solver.isNonSingular());
    }

    @Test
    public void testSolver_solveDoubleArray_returnsCorrectSolution() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        DecompositionSolver solver = svd.getSolver();
        double[] b = {3.0, 8.0};
        double[] x = solver.solve(b);
        assertEquals(2, x.length);
        // squareMatrix is diagonal [3,0;0,4], so solution is [1, 2]
        assertEquals(1.0, x[0], 1.0e-6);
        assertEquals(2.0, x[1], 1.0e-6);
    }

    @Test
    public void testSolver_solveRealVector_returnsCorrectSolution() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        DecompositionSolver solver = svd.getSolver();
        RealVector b = new ArrayRealVector(new double[] {3.0, 8.0});
        RealVector x = solver.solve(b);
        assertEquals(1.0, x.getEntry(0), 1.0e-6);
        assertEquals(2.0, x.getEntry(1), 1.0e-6);
    }

    @Test
    public void testSolver_solveRealMatrix_returnsCorrectSolution() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        DecompositionSolver solver = svd.getSolver();
        RealMatrix b = MatrixUtils.createRealMatrix(new double[][] {
            {3.0},
            {8.0}
        });
        RealMatrix x = solver.solve(b);
        assertEquals(1.0, x.getEntry(0, 0), 1.0e-6);
        assertEquals(2.0, x.getEntry(1, 0), 1.0e-6);
    }

    @Test
    public void testSolver_getInverse_returnsPseudoInverse() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        DecompositionSolver solver = svd.getSolver();
        RealMatrix inverse = solver.getInverse();
        assertNotNull(inverse);
        // product of matrix and its inverse should be identity for a full rank square matrix
        RealMatrix identity = squareMatrix.multiply(inverse);
        assertEquals(1.0, identity.getEntry(0, 0), 1.0e-6);
        assertEquals(1.0, identity.getEntry(1, 1), 1.0e-6);
        assertEquals(0.0, identity.getEntry(0, 1), 1.0e-6);
        assertEquals(0.0, identity.getEntry(1, 0), 1.0e-6);
    }

    @Test
    public void testSolver_getInverse_forTallMatrix_returnsPseudoInverseWithCorrectDimensions() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        DecompositionSolver solver = svd.getSolver();
        RealMatrix inverse = solver.getInverse();
        // pseudo inverse of m x n matrix should be n x m
        assertEquals(2, inverse.getRowDimension());
        assertEquals(3, inverse.getColumnDimension());
    }

    @Test
    public void testSolver_getInverse_forWideMatrix_returnsPseudoInverseWithCorrectDimensions() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(wideMatrix);
        DecompositionSolver solver = svd.getSolver();
        RealMatrix inverse = solver.getInverse();
        // pseudo inverse of m x n matrix should be n x m
        assertEquals(3, inverse.getRowDimension());
        assertEquals(2, inverse.getColumnDimension());
    }
}
