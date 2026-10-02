package org.apache.commons.math3.analysis.differentiation;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class DSCompilerTest {

    private static final double EPS = 1e-10;

    @Test
    public void testGetCompiler_variousParametersAndOrders() {
        DSCompiler c00 = DSCompiler.getCompiler(0, 0);
        Assert.assertEquals(0, c00.getFreeParameters());
        Assert.assertEquals(0, c00.getOrder());
        Assert.assertEquals(1, c00.getSize());

        DSCompiler c01 = DSCompiler.getCompiler(0, 1);
        Assert.assertEquals(0, c01.getFreeParameters());
        Assert.assertEquals(1, c01.getOrder());
        Assert.assertEquals(1, c01.getSize());

        DSCompiler c10 = DSCompiler.getCompiler(1, 0);
        Assert.assertEquals(1, c10.getFreeParameters());
        Assert.assertEquals(0, c10.getOrder());
        Assert.assertEquals(1, c10.getSize());

        DSCompiler c22 = DSCompiler.getCompiler(2, 2);
        Assert.assertEquals(2, c22.getFreeParameters());
        Assert.assertEquals(2, c22.getOrder());
        Assert.assertEquals(6, c22.getSize());

        // Test caching retrieve
        DSCompiler c22Cached = DSCompiler.getCompiler(2, 2);
        Assert.assertSame(c22, c22Cached);

        // Enlarge cache
        DSCompiler c34 = DSCompiler.getCompiler(3, 4);
        Assert.assertEquals(3, c34.getFreeParameters());
        Assert.assertEquals(4, c34.getOrder());

        // Retrieve smaller from expanded cache
        DSCompiler c12 = DSCompiler.getCompiler(1, 2);
        Assert.assertEquals(1, c12.getFreeParameters());
        Assert.assertEquals(2, c12.getOrder());
        Assert.assertEquals(3, c12.getSize());
    }

    @Test
    public void testGetPartialDerivativeIndex_valid() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        Assert.assertEquals(0, compiler.getPartialDerivativeIndex(0, 0));
        Assert.assertEquals(1, compiler.getPartialDerivativeIndex(1, 0));
        Assert.assertEquals(2, compiler.getPartialDerivativeIndex(2, 0));
        Assert.assertEquals(3, compiler.getPartialDerivativeIndex(0, 1));
        Assert.assertEquals(4, compiler.getPartialDerivativeIndex(1, 1));
        Assert.assertEquals(5, compiler.getPartialDerivativeIndex(0, 2));

        int[] orders0 = compiler.getPartialDerivativeOrders(0);
        Assert.assertArrayEquals(new int[] { 0, 0 }, orders0);

        int[] orders4 = compiler.getPartialDerivativeOrders(4);
        Assert.assertArrayEquals(new int[] { 1, 1 }, orders4);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetPartialDerivativeIndex_dimensionMismatch() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        compiler.getPartialDerivativeIndex(1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testGetPartialDerivativeIndex_tooLargeException() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        compiler.getPartialDerivativeIndex(2, 1);
    }

    @Test
    public void testLinearCombination_twoOperands() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] c1 = new double[] { 0.0, 2.0, 3.0 };
        double[] c2 = new double[] { 0.0, 4.0, 5.0 };
        double[] res = new double[3];
        compiler.linearCombination(2.0, c1, 1, 3.0, c2, 1, res, 1);
        Assert.assertEquals(2.0 * 2.0 + 3.0 * 4.0, res[1], EPS);
        Assert.assertEquals(2.0 * 3.0 + 3.0 * 5.0, res[2], EPS);
    }

    @Test
    public void testLinearCombination_threeOperands() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] c1 = new double[] { 1.0, 2.0 };
        double[] c2 = new double[] { 3.0, 4.0 };
        double[] c3 = new double[] { 5.0, 6.0 };
        double[] res = new double[2];
        compiler.linearCombination(1.0, c1, 0, 2.0, c2, 0, 3.0, c3, 0, res, 0);
        Assert.assertEquals(1.0 * 1.0 + 2.0 * 3.0 + 3.0 * 5.0, res[0], EPS);
        Assert.assertEquals(1.0 * 2.0 + 2.0 * 4.0 + 3.0 * 6.0, res[1], EPS);
    }

    @Test
    public void testLinearCombination_fourOperands() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] c1 = new double[] { 1.0, 2.0 };
        double[] c2 = new double[] { 3.0, 4.0 };
        double[] c3 = new double[] { 5.0, 6.0 };
        double[] c4 = new double[] { 7.0, 8.0 };
        double[] res = new double[2];
        compiler.linearCombination(1.0, c1, 0, 2.0, c2, 0, 3.0, c3, 0, 4.0, c4, 0, res, 0);
        Assert.assertEquals(1.0 * 1.0 + 2.0 * 3.0 + 3.0 * 5.0 + 4.0 * 7.0, res[0], EPS);
        Assert.assertEquals(1.0 * 2.0 + 2.0 * 4.0 + 3.0 * 6.0 + 4.0 * 8.0, res[1], EPS);
    }

    @Test
    public void testAddSubtractMultiplyDivide() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        int sz = compiler.getSize();
        double[] lhs = new double[] { 3.0, 1.0, 0.0 };
        double[] rhs = new double[] { 2.0, 0.0, 0.0 };
        double[] res = new double[sz];

        compiler.add(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(5.0, res[0], EPS);
        Assert.assertEquals(1.0, res[1], EPS);

        compiler.subtract(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(1.0, res[0], EPS);
        Assert.assertEquals(1.0, res[1], EPS);

        compiler.multiply(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(6.0, res[0], EPS);
        Assert.assertEquals(2.0, res[1], EPS);

        compiler.divide(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(1.5, res[0], EPS);
        Assert.assertEquals(0.5, res[1], EPS);
    }

    @Test
    public void testRemainder() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] lhs = new double[] { 5.5, 2.0 };
        double[] rhs = new double[] { 2.0, 1.0 };
        double[] res = new double[2];
        compiler.remainder(lhs, 0, rhs, 0, res, 0);
        double expectedRem = 5.5 % 2.0;
        double k = FastMath.rint((5.5 - expectedRem) / 2.0);
        Assert.assertEquals(expectedRem, res[0], EPS);
        Assert.assertEquals(2.0 - k * 1.0, res[1], EPS);
    }

    @Test
    public void testPowDouble() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] op = new double[] { 2.0, 1.0, 0.0 };
        double[] res = new double[compiler.getSize()];
        compiler.pow(op, 0, 3.0, res, 0);
        Assert.assertEquals(8.0, res[0], EPS);
        Assert.assertEquals(12.0, res[1], EPS);
        Assert.assertEquals(12.0, res[2], EPS);
    }

    @Test
    public void testPowInt() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] op = new double[] { 2.0, 1.0, 0.0 };
        double[] res = new double[compiler.getSize()];

        // n == 0
        compiler.pow(op, 0, 0, res, 0);
        Assert.assertEquals(1.0, res[0], EPS);
        Assert.assertEquals(0.0, res[1], EPS);
        Assert.assertEquals(0.0, res[2], EPS);

        // n > 0, n < order
        compiler.pow(op, 0, 1, res, 0);
        Assert.assertEquals(2.0, res[0], EPS);
        Assert.assertEquals(1.0, res[1], EPS);
        Assert.assertEquals(0.0, res[2], EPS);

        // n > 0, n >= order
        compiler.pow(op, 0, 3, res, 0);
        Assert.assertEquals(8.0, res[0], EPS);
        Assert.assertEquals(12.0, res[1], EPS);
        Assert.assertEquals(12.0, res[2], EPS);

        // n < 0
        compiler.pow(op, 0, -1, res, 0);
        Assert.assertEquals(0.5, res[0], EPS);
        Assert.assertEquals(-0.25, res[1], EPS);
        Assert.assertEquals(0.25, res[2], EPS);
    }

    @Test
    public void testPowDerivativeStructure() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] x = new double[] { 2.0, 1.0 };
        double[] y = new double[] { 3.0, 0.0 };
        double[] res = new double[2];
        compiler.pow(x, 0, y, 0, res, 0);
        Assert.assertEquals(8.0, res[0], EPS);
        Assert.assertEquals(12.0, res[1], EPS);
    }

    @Test
    public void testRootN() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] op = new double[] { 4.0, 1.0, 0.0 };
        double[] res = new double[compiler.getSize()];

        // n = 2
        compiler.rootN(op, 0, 2, res, 0);
        Assert.assertEquals(2.0, res[0], EPS);
        Assert.assertEquals(0.25, res[1], EPS);

        // n = 3
        op[0] = 8.0;
        compiler.rootN(op, 0, 3, res, 0);
        Assert.assertEquals(2.0, res[0], EPS);
        Assert.assertEquals(1.0 / 12.0, res[1], EPS);

        // n = 4
        op[0] = 16.0;
        compiler.rootN(op, 0, 4, res, 0);
        Assert.assertEquals(2.0, res[0], EPS);
        Assert.assertEquals(1.0 / 32.0, res[1], EPS);
    }

    @Test
    public void testExpAndExpm1() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] op = new double[] { 0.0, 1.0, 0.0 };
        double[] resExp = new double[compiler.getSize()];
        double[] resExpm1 = new double[compiler.getSize()];

        compiler.exp(op, 0, resExp, 0);
        Assert.assertEquals(1.0, resExp[0], EPS);
        Assert.assertEquals(1.0, resExp[1], EPS);
        Assert.assertEquals(1.0, resExp[2], EPS);

        compiler.expm1(op, 0, resExpm1, 0);
        Assert.assertEquals(0.0, resExpm1[0], EPS);
        Assert.assertEquals(1.0, resExpm1[1], EPS);
        Assert.assertEquals(1.0, resExpm1[2], EPS);
    }

    @Test
    public void testLogs() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] op = new double[] { 1.0, 1.0, 0.0 };
        double[] res = new double[compiler.getSize()];

        compiler.log(op, 0, res, 0);
        Assert.assertEquals(0.0, res[0], EPS);
        Assert.assertEquals(1.0, res[1], EPS);
        Assert.assertEquals(-1.0, res[2], EPS);

        op[0] = 0.0;
        compiler.log1p(op, 0, res, 0);
        Assert.assertEquals(0.0, res[0], EPS);
        Assert.assertEquals(1.0, res[1], EPS);
        Assert.assertEquals(-1.0, res[2], EPS);

        op[0] = 10.0;
        compiler.log10(op, 0, res, 0);
        Assert.assertEquals(1.0, res[0], EPS);
        Assert.assertEquals(1.0 / (10.0 * FastMath.log(10.0)), res[1], EPS);
    }

    @Test
    public void testTrigonometric() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 4);
        int sz = compiler.getSize();
        double[] op = new double[sz];
        op[0] = 0.5;
        op[1] = 1.0;
        double[] res = new double[sz];

        compiler.cos(op, 0, res, 0);
        Assert.assertEquals(FastMath.cos(0.5), res[0], EPS);
        Assert.assertEquals(-FastMath.sin(0.5), res[1], EPS);

        compiler.sin(op, 0, res, 0);
        Assert.assertEquals(FastMath.sin(0.5), res[0], EPS);
        Assert.assertEquals(FastMath.cos(0.5), res[1], EPS);

        compiler.tan(op, 0, res, 0);
        Assert.assertEquals(FastMath.tan(0.5), res[0], EPS);

        compiler.acos(op, 0, res, 0);
        Assert.assertEquals(FastMath.acos(0.5), res[0], EPS);

        compiler.asin(op, 0, res, 0);
        Assert.assertEquals(FastMath.asin(0.5), res[0], EPS);

        compiler.atan(op, 0, res, 0);
        Assert.assertEquals(FastMath.atan(0.5), res[0], EPS);
    }

    @Test
    public void testAtan2() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        int sz = compiler.getSize();
        double[] y = new double[] { 1.0, 0.0 };
        double[] x = new double[] { 1.0, 1.0 };
        double[] res = new double[sz];

        // x >= 0
        compiler.atan2(y, 0, x, 0, res, 0);
        Assert.assertEquals(FastMath.PI / 4.0, res[0], EPS);
        Assert.assertEquals(-0.5, res[1], EPS);

        // x < 0, y > 0 -> tmp2[0] > 0
        x[0] = -1.0;
        y[0] = 1.0;
        compiler.atan2(y, 0, x, 0, res, 0);
        Assert.assertEquals(3.0 * FastMath.PI / 4.0, res[0], EPS);

        // x < 0, y < 0 -> tmp2[0] < 0
        x[0] = -1.0;
        y[0] = -1.0;
        compiler.atan2(y, 0, x, 0, res, 0);
        Assert.assertEquals(-3.0 * FastMath.PI / 4.0, res[0], EPS);
    }

    @Test
    public void testHyperbolic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 4);
        int sz = compiler.getSize();
        double[] op = new double[sz];
        op[0] = 0.5;
        op[1] = 1.0;
        double[] res = new double[sz];

        compiler.cosh(op, 0, res, 0);
        Assert.assertEquals(FastMath.cosh(0.5), res[0], EPS);
        Assert.assertEquals(FastMath.sinh(0.5), res[1], EPS);

        compiler.sinh(op, 0, res, 0);
        Assert.assertEquals(FastMath.sinh(0.5), res[0], EPS);
        Assert.assertEquals(FastMath.cosh(0.5), res[1], EPS);

        compiler.tanh(op, 0, res, 0);
        Assert.assertEquals(FastMath.tanh(0.5), res[0], EPS);

        op[0] = 1.5;
        compiler.acosh(op, 0, res, 0);
        Assert.assertEquals(FastMath.acosh(1.5), res[0], EPS);

        op[0] = 0.5;
        compiler.asinh(op, 0, res, 0);
        Assert.assertEquals(FastMath.asinh(0.5), res[0], EPS);

        compiler.atanh(op, 0, res, 0);
        Assert.assertEquals(FastMath.atanh(0.5), res[0], EPS);
    }

    @Test
    public void testTaylor() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        // f(x, y) = 1 + 2x + 3y + 4x^2 + 5xy + 6y^2
        // at (0,0): f=1, fx=2, fxx=8, fy=3, fxy=5, fyy=12
        double[] ds = new double[compiler.getSize()];
        ds[compiler.getPartialDerivativeIndex(0, 0)] = 1.0;
        ds[compiler.getPartialDerivativeIndex(1, 0)] = 2.0;
        ds[compiler.getPartialDerivativeIndex(2, 0)] = 8.0;
        ds[compiler.getPartialDerivativeIndex(0, 1)] = 3.0;
        ds[compiler.getPartialDerivativeIndex(1, 1)] = 5.0;
        ds[compiler.getPartialDerivativeIndex(0, 2)] = 12.0;

        double dx = 0.1;
        double dy = 0.2;
        double expected = 1.0 + 2.0 * dx + 3.0 * dy + 4.0 * dx * dx + 5.0 * dx * dy + 6.0 * dy * dy;
        double actual = compiler.taylor(ds, 0, dx, dy);
        Assert.assertEquals(expected, actual, EPS);
    }

    @Test
    public void testCheckCompatibility() {
        DSCompiler c1 = DSCompiler.getCompiler(2, 3);
        DSCompiler c2 = DSCompiler.getCompiler(2, 3);
        c1.checkCompatibility(c2);

        DSCompiler diffP = DSCompiler.getCompiler(1, 3);
        try {
            c1.checkCompatibility(diffP);
            Assert.fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            Assert.assertEquals(2, e.getArgument());
            Assert.assertEquals(1, e.getDimension());
        }

        DSCompiler diffO = DSCompiler.getCompiler(2, 2);
        try {
            c1.checkCompatibility(diffO);
            Assert.fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            Assert.assertEquals(3, e.getArgument());
            Assert.assertEquals(2, e.getDimension());
        }
    }
}
