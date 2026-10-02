package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CholeskyDecompositionImplTest {

    private static final double EPSILON = 1.0e-11;

    private final double[][] testData3x3 = {
        {  4.0,  12.0, -16.0 },
        { 12.0,  37.0, -43.0 },
        { -16.0, -43.0,  98.0 }
    };

    @Test
    public void testConstructor_validMatrix_success() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        CholeskyDecomposition cholesky = new CholeskyDecompositionImpl(matrix);

        RealMatrix l = cholesky.getL();
        RealMatrix lT = cholesky.getLT();
        RealMatrix reconstructed = l.multiply(lT);

        Assert.assertEquals(matrix.getRowDimension(), l.getRowDimension());
        Assert.assertEquals(matrix.getColumnDimension(), l.getColumnDimension());
        for (int i = 0; i < matrix.getRowDimension(); ++i) {
            for (int j = 0; j < matrix.getColumnDimension(); ++j) {
                Assert.assertEquals(matrix.getEntry(i, j), reconstructed.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructor_nonSquareMatrix_throwsNonSquareMatrixException() {
        double[][] nonSquareData = {
            { 1.0, 2.0, 3.0 },
            { 2.0, 5.0, 6.0 }
        };
        RealMatrix matrix = new RealMatrixImpl(nonSquareData);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotSymmetricMatrixException.class)
    public void testConstructor_nonSymmetricMatrix_throwsNotSymmetricMatrixException() {
        double[][] nonSymmetricData = {
            { 4.0, 1.0 },
            { 2.0, 4.0 }
        };
        RealMatrix matrix = new RealMatrixImpl(nonSymmetricData);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructor_nonPositiveDefiniteMatrix_throwsNotPositiveDefiniteMatrixException() {
        double[][] nonPositiveDefiniteData = {
            {  1.0,  2.0 },
            {  2.0,  1.0 }
        };
        RealMatrix matrix = new RealMatrixImpl(nonPositiveDefiniteData);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructor_zeroDiagonalElement_throwsNotPositiveDefiniteMatrixException() {
        double[][] zeroDiagonalData = {
            { 0.0, 0.0 },
            { 0.0, 1.0 }
        };
        RealMatrix matrix = new RealMatrixImpl(zeroDiagonalData);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test
    public void testConstructor_customThresholds() {
        double[][] nearSymmetric = {
            { 4.0, 1.00001 },
            { 1.0, 4.0 }
        };
        RealMatrix matrix = new RealMatrixImpl(nearSymmetric);
        CholeskyDecomposition cholesky = new CholeskyDecompositionImpl(matrix, 1.0e-3, 1.0e-5);
        Assert.assertNotNull(cholesky.getL());
    }

    @Test
    public void testDecomposition_1x1Matrix() {
        double[][] data = { { 9.0 } };
        RealMatrix matrix = new RealMatrixImpl(data);
        CholeskyDecomposition cholesky = new CholeskyDecompositionImpl(matrix);

        Assert.assertEquals(3.0, cholesky.getL().getEntry(0, 0), EPSILON);
        Assert.assertEquals(3.0, cholesky.getLT().getEntry(0, 0), EPSILON);
        Assert.assertEquals(9.0, cholesky.getDeterminant(), EPSILON);
    }

    @Test
    public void testGetL_and_GetLT_cached() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        CholeskyDecomposition cholesky = new CholeskyDecompositionImpl(matrix);

        RealMatrix l1 = cholesky.getL();
        RealMatrix l2 = cholesky.getL();
        Assert.assertSame(l1, l2);

        RealMatrix lt1 = cholesky.getLT();
        RealMatrix lt2 = cholesky.getLT();
        Assert.assertSame(lt1, lt2);
    }

    @Test
    public void testGetDeterminant() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        CholeskyDecomposition cholesky = new CholeskyDecompositionImpl(matrix);
        // L diagonal is [2, 1, 3] -> det(L)^2 = (2 * 1 * 3)^2 = 36
        Assert.assertEquals(36.0, cholesky.getDeterminant(), EPSILON);
    }

    @Test
    public void testSolver_isNonSingular() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();
        Assert.assertTrue(solver.isNonSingular());
    }

    @Test
    public void testSolver_solveDoubleArray_success() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        double[] b = { 0.0, 6.0, 39.0 };
        double[] expected = { 1.0, 1.0, 1.0 };
        double[] x = solver.solve(b);

        Assert.assertEquals(expected.length, x.length);
        for (int i = 0; i < expected.length; ++i) {
            Assert.assertEquals(expected[i], x[i], EPSILON);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_solveDoubleArray_dimensionMismatch() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();
        solver.solve(new double[]{ 1.0, 2.0 });
    }

    @Test
    public void testSolver_solveRealVectorImpl_success() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        RealVectorImpl b = new RealVectorImpl(new double[]{ 0.0, 6.0, 39.0 });
        RealVector x = solver.solve(b);

        Assert.assertEquals(1.0, x.getEntry(0), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(1), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(2), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_solveRealVectorImpl_dimensionMismatch() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();
        solver.solve(new RealVectorImpl(new double[]{ 1.0, 2.0 }));
    }

    @Test
    public void testSolver_solveGenericRealVector_success() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        final double[] data = { 0.0, 6.0, 39.0 };
        RealVector proxyVector = (RealVector) Proxy.newProxyInstance(
            RealVector.class.getClassLoader(),
            new Class<?>[]{ RealVector.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) {
                    if ("getDimension".equals(method.getName())) {
                        return data.length;
                    }
                    if ("getData".equals(method.getName())) {
                        return data.clone();
                    }
                    return null;
                }
            }
        );

        RealVector x = solver.solve(proxyVector);
        Assert.assertEquals(1.0, x.getEntry(0), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(1), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(2), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_solveGenericRealVector_dimensionMismatch() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        RealVector proxyVector = (RealVector) Proxy.newProxyInstance(
            RealVector.class.getClassLoader(),
            new Class<?>[]{ RealVector.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) {
                    if ("getDimension".equals(method.getName())) {
                        return 2;
                    }
                    return null;
                }
            }
        );

        solver.solve(proxyVector);
    }

    @Test
    public void testSolver_solveRealMatrix_success() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();

        double[][] bData = {
            { 0.0, 4.0 },
            { 6.0, 12.0 },
            { 39.0, -16.0 }
        };
        RealMatrix b = new RealMatrixImpl(bData);
        RealMatrix x = solver.solve(b);

        Assert.assertEquals(3, x.getRowDimension());
        Assert.assertEquals(2, x.getColumnDimension());

        Assert.assertEquals(1.0, x.getEntry(0, 0), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(1, 0), EPSILON);
        Assert.assertEquals(1.0, x.getEntry(2, 0), EPSILON);

        Assert.assertEquals(1.0, x.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, x.getEntry(1, 1), EPSILON);
        Assert.assertEquals(0.0, x.getEntry(2, 1), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolver_solveRealMatrix_dimensionMismatch() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();
        RealMatrix b = new RealMatrixImpl(new double[][]{ { 1.0 }, { 2.0 } });
        solver.solve(b);
    }

    @Test
    public void testSolver_getInverse() {
        RealMatrix matrix = new RealMatrixImpl(testData3x3);
        DecompositionSolver solver = new CholeskyDecompositionImpl(matrix).getSolver();
        RealMatrix inverse = solver.getInverse();

        RealMatrix identity = matrix.multiply(inverse);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                double expected = (i == j) ? 1.0 : 0.0;
                Assert.assertEquals(expected, identity.getEntry(i, j), EPSILON);
            }
        }
    }
}
