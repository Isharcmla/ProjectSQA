package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class SingularValueDecompositionImplTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testSquareMatrix_decomposeAndReconstruct_matchesOriginal() {
        double[][] data = {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        RealMatrix u = svd.getU();
        RealMatrix s = svd.getS();
        RealMatrix vt = svd.getVT();
        RealMatrix reconstructed = u.multiply(s).multiply(vt);

        checkMatrixEquals(matrix, reconstructed, EPSILON);

        Assert.assertNotNull(svd.getUT());
        Assert.assertNotNull(svd.getV());
        Assert.assertEquals(2, svd.getSingularValues().length);
        Assert.assertEquals(2, svd.getRank());
        Assert.assertTrue(svd.getNorm() > 0);
        Assert.assertTrue(svd.getConditionNumber() >= 1.0);
    }

    @Test
    public void testTallMatrix_mGreaterThanN_decomposeAndReconstruct() {
        double[][] data = {
            { 1.0, 2.0 },
            { 3.0, 4.0 },
            { 5.0, 6.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        RealMatrix u = svd.getU();
        RealMatrix s = svd.getS();
        RealMatrix vt = svd.getVT();
        RealMatrix reconstructed = u.multiply(s).multiply(vt);

        checkMatrixEquals(matrix, reconstructed, EPSILON);

        // Verify caching paths
        Assert.assertSame(u, svd.getU());
        Assert.assertSame(s, svd.getS());
        Assert.assertSame(vt, svd.getVT());
        Assert.assertSame(svd.getUT(), svd.getUT());
        Assert.assertSame(svd.getV(), svd.getV());
    }

    @Test
    public void testWideMatrix_mLessThanN_decomposeAndReconstruct() {
        double[][] data = {
            { 1.0, 2.0, 3.0 },
            { 4.0, 5.0, 6.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        RealMatrix u = svd.getU();
        RealMatrix s = svd.getS();
        RealMatrix vt = svd.getVT();
        RealMatrix reconstructed = u.multiply(s).multiply(vt);

        checkMatrixEquals(matrix, reconstructed, EPSILON);

        // Verify caching paths
        Assert.assertSame(u, svd.getU());
        Assert.assertSame(s, svd.getS());
        Assert.assertSame(vt, svd.getVT());
        Assert.assertSame(svd.getUT(), svd.getUT());
        Assert.assertSame(svd.getV(), svd.getV());
    }

    @Test
    public void testTruncatedSVD_maxParamSmallerThanRank() {
        double[][] data = {
            { 1.0, 2.0, 3.0 },
            { 4.0, 5.0, 6.0 },
            { 7.0, 8.0, 9.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix, 1);

        Assert.assertEquals(1, svd.getSingularValues().length);
        Assert.assertEquals(3, svd.getU().getRowDimension());
        Assert.assertEquals(1, svd.getU().getColumnDimension());
        Assert.assertEquals(3, svd.getV().getRowDimension());
        Assert.assertEquals(1, svd.getV().getColumnDimension());
    }

    @Test
    public void testTruncatedSVD_wideMatrix_maxParam() {
        double[][] data = {
            { 1.0, 2.0, 3.0, 4.0 },
            { 5.0, 6.0, 7.0, 8.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix, 1);

        Assert.assertEquals(1, svd.getSingularValues().length);
        Assert.assertEquals(2, svd.getU().getRowDimension());
        Assert.assertEquals(1, svd.getU().getColumnDimension());
        Assert.assertEquals(4, svd.getV().getRowDimension());
        Assert.assertEquals(1, svd.getV().getColumnDimension());
    }

    @Test
    public void testRankDeficientMatrix_zeroRankSingularValues() {
        double[][] data = {
            { 0.0, 0.0 },
            { 0.0, 0.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        Assert.assertEquals(0, svd.getSingularValues().length);
        Assert.assertEquals(0, svd.getRank());
    }

    @Test
    public void testGetCovariance_validThreshold_returnsCovariance() {
        double[][] data = {
            { 1.0, 0.0 },
            { 0.0, 2.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        RealMatrix cov = svd.getCovariance(1.5);
        Assert.assertNotNull(cov);
        Assert.assertEquals(2, cov.getRowDimension());
        Assert.assertEquals(2, cov.getColumnDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCovariance_cutoffTooHigh_throwsException() {
        double[][] data = {
            { 1.0, 0.0 },
            { 0.0, 2.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);
        svd.getCovariance(100.0);
    }

    @Test
    public void testSolver_solveArrayVectorMatrix() {
        double[][] data = {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);
        DecompositionSolver solver = svd.getSolver();

        Assert.assertTrue(solver.isNonSingular());

        double[] bArray = { 2.0, 3.0 };
        double[] xArray = solver.solve(bArray);
        Assert.assertEquals(2.0, xArray[0], EPSILON);
        Assert.assertEquals(3.0, xArray[1], EPSILON);

        RealVector bVector = new ArrayRealVector(bArray);
        RealVector xVector = solver.solve(bVector);
        Assert.assertEquals(2.0, xVector.getEntry(0), EPSILON);
        Assert.assertEquals(3.0, xVector.getEntry(1), EPSILON);

        RealMatrix bMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix xMatrix = solver.solve(bMatrix);
        checkMatrixEquals(bMatrix, xMatrix, EPSILON);

        RealMatrix inverse = solver.getInverse();
        checkMatrixEquals(bMatrix, inverse, EPSILON);
    }

    @Test
    public void testSolver_singularMatrix_isNonSingularFalse() {
        double[][] data = {
            { 1.0, 2.0 },
            { 2.0, 4.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);
        DecompositionSolver solver = svd.getSolver();

        Assert.assertFalse(solver.isNonSingular());
    }

    @Test
    public void testGetSingularValues_cloneImmutability() {
        double[][] data = {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        SingularValueDecomposition svd = new SingularValueDecompositionImpl(matrix);

        double[] values1 = svd.getSingularValues();
        double[] values2 = svd.getSingularValues();
        Assert.assertNotSame(values1, values2);
        values1[0] = -999.0;
        Assert.assertNotEquals(values1[0], values2[0], EPSILON);
    }

    private void checkMatrixEquals(RealMatrix expected, RealMatrix actual, double tol) {
        Assert.assertEquals(expected.getRowDimension(), actual.getRowDimension());
        Assert.assertEquals(expected.getColumnDimension(), actual.getColumnDimension());
        for (int i = 0; i < expected.getRowDimension(); ++i) {
            for (int j = 0; j < expected.getColumnDimension(); ++j) {
                Assert.assertEquals(expected.getEntry(i, j), actual.getEntry(i, j), tol);
            }
        }
    }
}
