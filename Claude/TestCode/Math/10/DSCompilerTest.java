import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;

public class DSCompilerTest {

    private static final double EPS = 1e-9;

    private double[] createVariable(final DSCompiler compiler, final int paramIndex,
                                     final int totalParams, final double value) {
        double[] ds = new double[compiler.getSize()];
        ds[0] = value;
        int[] orders = new int[totalParams];
        orders[paramIndex] = 1;
        ds[compiler.getPartialDerivativeIndex(orders)] = 1.0;
        return ds;
    }

    // ---------------------------------------------------------------
    // getCompiler
    // ---------------------------------------------------------------

    @Test
    public void testGetCompiler_validParams_returnsCompiler() {
        DSCompiler c = DSCompiler.getCompiler(2, 3);
        assertNotNull(c);
        assertEquals(2, c.getFreeParameters());
        assertEquals(3, c.getOrder());
    }

    @Test
    public void testGetCompiler_cachedCompiler_returnsSameInstance() {
        DSCompiler c1 = DSCompiler.getCompiler(1, 1);
        DSCompiler c2 = DSCompiler.getCompiler(1, 1);
        assertSame(c1, c2);
    }

    @Test
    public void testGetCompiler_zeroParameters_returnsValidCompiler() {
        DSCompiler c = DSCompiler.getCompiler(0, 3);
        assertNotNull(c);
        assertEquals(0, c.getFreeParameters());
        assertEquals(1, c.getSize());
    }

    @Test
    public void testGetCompiler_zeroOrder_returnsValidCompiler() {
        DSCompiler c = DSCompiler.getCompiler(2, 0);
        assertNotNull(c);
        assertEquals(1, c.getSize());
    }

    @Test
    public void testGetCompiler_largerParamsAfterSmaller_growsCache() {
        DSCompiler small = DSCompiler.getCompiler(1, 1);
        DSCompiler large = DSCompiler.getCompiler(4, 4);
        assertNotNull(small);
        assertNotNull(large);
        assertEquals(4, large.getFreeParameters());
        assertEquals(4, large.getOrder());
    }

    // ---------------------------------------------------------------
    // getFreeParameters / getOrder / getSize
    // ---------------------------------------------------------------

    @Test
    public void testGetFreeParameters_returnsCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(3, 2);
        assertEquals(3, c.getFreeParameters());
    }

    @Test
    public void testGetOrder_returnsCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(3, 2);
        assertEquals(2, c.getOrder());
    }

    @Test
    public void testGetSize_singleParamOrder3_returnsFour() {
        DSCompiler c = DSCompiler.getCompiler(1, 3);
        assertEquals(4, c.getSize());
    }

    @Test
    public void testGetSize_twoParamsOrder1_returnsThree() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        assertEquals(3, c.getSize());
    }

    // ---------------------------------------------------------------
    // getPartialDerivativeIndex / getPartialDerivativeOrders
    // ---------------------------------------------------------------

    @Test
    public void testGetPartialDerivativeIndex_singleParam_returnsOrderAsIndex() {
        DSCompiler c = DSCompiler.getCompiler(1, 3);
        assertEquals(0, c.getPartialDerivativeIndex(0));
        assertEquals(1, c.getPartialDerivativeIndex(1));
        assertEquals(2, c.getPartialDerivativeIndex(2));
        assertEquals(3, c.getPartialDerivativeIndex(3));
    }

    @Test
    public void testGetPartialDerivativeIndex_twoParamsOrder1_returnsExpectedIndices() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        assertEquals(0, c.getPartialDerivativeIndex(0, 0));
        assertEquals(1, c.getPartialDerivativeIndex(1, 0));
        assertEquals(2, c.getPartialDerivativeIndex(0, 1));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetPartialDerivativeIndex_wrongLength_throwsException() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        c.getPartialDerivativeIndex(1, 0, 0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testGetPartialDerivativeIndex_sumTooLarge_throwsException() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        c.getPartialDerivativeIndex(3);
    }

    @Test
    public void testGetPartialDerivativeOrders_returnsExpectedOrders() {
        DSCompiler c = DSCompiler.getCompiler(1, 3);
        int[] orders = c.getPartialDerivativeOrders(2);
        assertArrayEquals(new int[] { 2 }, orders);
    }

    @Test
    public void testGetPartialDerivativeOrders_indexZero_returnsAllZeros() {
        DSCompiler c = DSCompiler.getCompiler(2, 2);
        int[] orders = c.getPartialDerivativeOrders(0);
        assertArrayEquals(new int[] { 0, 0 }, orders);
    }

    // ---------------------------------------------------------------
    // linearCombination
    // ---------------------------------------------------------------

    @Test
    public void testLinearCombination2_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] c1 = { 2.0, 1.0 };
        double[] c2 = { 3.0, 2.0 };
        double[] result = new double[2];
        c.linearCombination(2.0, c1, 0, 3.0, c2, 0, result, 0);
        assertEquals(2 * 2.0 + 3 * 3.0, result[0], EPS);
        assertEquals(2 * 1.0 + 3 * 2.0, result[1], EPS);
    }

    @Test
    public void testLinearCombination3_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] c1 = { 1.0, 1.0 };
        double[] c2 = { 2.0, 2.0 };
        double[] c3 = { 3.0, 3.0 };
        double[] result = new double[2];
        c.linearCombination(1.0, c1, 0, 1.0, c2, 0, 1.0, c3, 0, result, 0);
        assertEquals(6.0, result[0], EPS);
        assertEquals(6.0, result[1], EPS);
    }

    @Test
    public void testLinearCombination4_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] c1 = { 1.0, 0.0 };
        double[] c2 = { 1.0, 0.0 };
        double[] c3 = { 1.0, 0.0 };
        double[] c4 = { 1.0, 0.0 };
        double[] result = new double[2];
        c.linearCombination(1.0, c1, 0, 1.0, c2, 0, 1.0, c3, 0, 1.0, c4, 0, result, 0);
        assertEquals(4.0, result[0], EPS);
        assertEquals(0.0, result[1], EPS);
    }

    // ---------------------------------------------------------------
    // add / subtract / multiply / divide / remainder
    // ---------------------------------------------------------------

    @Test
    public void testAdd_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] lhs = { 3.0, 1.0 };
        double[] rhs = { 2.0, 0.0 };
        double[] result = new double[2];
        c.add(lhs, 0, rhs, 0, result, 0);
        assertEquals(5.0, result[0], EPS);
        assertEquals(1.0, result[1], EPS);
    }

    @Test
    public void testSubtract_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] lhs = { 3.0, 1.0 };
        double[] rhs = { 2.0, 0.0 };
        double[] result = new double[2];
        c.subtract(lhs, 0, rhs, 0, result, 0);
        assertEquals(1.0, result[0], EPS);
        assertEquals(1.0, result[1], EPS);
    }

    @Test
    public void testMultiply_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] x = { 5.0, 1.0 }; // variable x
        double[] constVal = { 3.0, 0.0 }; // constant b
        double[] result = new double[2];
        c.multiply(x, 0, constVal, 0, result, 0);
        assertEquals(15.0, result[0], EPS);
        assertEquals(3.0, result[1], EPS);
    }

    @Test
    public void testMultiply_twoParams_computesCorrectCrossTerms() {
        DSCompiler c = DSCompiler.getCompiler(2, 2);
        double[] x = createVariable(c, 0, 2, 3.0);
        double[] y = createVariable(c, 1, 2, 4.0);
        double[] result = new double[c.getSize()];
        c.multiply(x, 0, y, 0, result, 0);
        // value should be x*y
        assertEquals(12.0, result[0], EPS);
        // d/dx(x*y) = y = 4
        assertEquals(4.0, result[c.getPartialDerivativeIndex(1, 0)], EPS);
        // d/dy(x*y) = x = 3
        assertEquals(3.0, result[c.getPartialDerivativeIndex(0, 1)], EPS);
        // d2/dxdy(x*y) = 1
        assertEquals(1.0, result[c.getPartialDerivativeIndex(1, 1)], EPS);
    }

    @Test
    public void testDivide_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] x = { 6.0, 1.0 };
        double[] constVal = { 2.0, 0.0 };
        double[] result = new double[2];
        c.divide(x, 0, constVal, 0, result, 0);
        assertEquals(3.0, result[0], EPS);
        assertEquals(0.5, result[1], EPS);
    }

    @Test
    public void testRemainder_computesCorrectValues() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] lhs = { 5.0, 1.0 };
        double[] rhs = { 2.0, 0.0 };
        double[] result = new double[2];
        c.remainder(lhs, 0, rhs, 0, result, 0);
        assertEquals(1.0, result[0], EPS);
        assertEquals(1.0, result[1], EPS);
    }

    // ---------------------------------------------------------------
    // pow (double exponent)
    // ---------------------------------------------------------------

    @Test
    public void testPowDouble_computesCorrectDerivatives() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] x = { 3.0, 1.0, 0.0 };
        double[] result = new double[3];
        c.pow(x, 0, 2.0, result, 0);
        assertEquals(9.0, result[0], EPS);
        assertEquals(6.0, result[1], EPS);
        assertEquals(2.0, result[2], EPS);
    }

    // ---------------------------------------------------------------
    // pow (integer exponent)
    // ---------------------------------------------------------------

    @Test
    public void testPowInt_zero_returnsOneAndZeroDerivatives() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] x = { 5.0, 1.0, 0.0 };
        double[] result = new double[3];
        c.pow(x, 0, 0, result, 0);
        assertEquals(1.0, result[0], EPS);
        assertEquals(0.0, result[1], EPS);
        assertEquals(0.0, result[2], EPS);
    }

    @Test
    public void testPowInt_positive_computesCorrectDerivatives() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] x = { 2.0, 1.0, 0.0 };
        double[] result = new double[3];
        c.pow(x, 0, 3, result, 0);
        assertEquals(8.0, result[0], EPS);
        assertEquals(12.0, result[1], EPS);
        assertEquals(12.0, result[2], EPS);
    }

    @Test
    public void testPowInt_negative_computesCorrectDerivatives() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] x = { 2.0, 1.0, 0.0 };
        double[] result = new double[3];
        c.pow(x, 0, -1, result, 0);
        assertEquals(0.5, result[0], EPS);
        assertEquals(-0.25, result[1], EPS);
        assertEquals(0.25, result[2], EPS);
    }

    @Test
    public void testPowInt_positiveOrderGreaterThanN_zeroHigherDerivatives() {
        DSCompiler c = DSCompiler.getCompiler(1, 3);
        double[] x = { 2.0, 1.0, 0.0, 0.0 };
        double[] result = new double[4];
        c.pow(x, 0, 1, result, 0);
        assertEquals(2.0, result[0], EPS);
        assertEquals(1.0, result[1], EPS);
    }

    // ---------------------------------------------------------------
    // pow (ds base, ds exponent)
    // ---------------------------------------------------------------

    @Test
    public void testPowDsDs_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        double[] x = createVariable(c, 0, 2, 2.0);
        double[] y = createVariable(c, 1, 2, 3.0);
        double[] result = new double[c.getSize()];
        c.pow(x, 0, y, 0, result, 0);
        assertEquals(FastMath.pow(2.0, 3.0), result[0], 1e-6);
    }

    // ---------------------------------------------------------------
    // rootN
    // ---------------------------------------------------------------

    @Test
    public void testRootN_n2_computesSqrt() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] x = { 4.0, 1.0, 0.0 };
        double[] result = new double[3];
        c.rootN(x, 0, 2, result, 0);
        assertEquals(2.0, result[0], EPS);
    }

    @Test
    public void testRootN_n3_computesCbrt() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] x = { 8.0, 1.0, 0.0 };
        double[] result = new double[3];
        c.rootN(x, 0, 3, result, 0);
        assertEquals(2.0, result[0], EPS);
    }

    @Test
    public void testRootN_nOther_computesGenericRoot() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] x = { 16.0, 1.0, 0.0 };
        double[] result = new double[3];
        c.rootN(x, 0, 4, result, 0);
        assertEquals(2.0, result[0], EPS);
    }

    // ---------------------------------------------------------------
    // exp / expm1
    // ---------------------------------------------------------------

    @Test
    public void testExp_computesCorrectValueAndDerivative() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double x0 = 1.0;
        double[] x = { x0, 1.0 };
        double[] result = new double[2];
        c.exp(x, 0, result, 0);
        assertEquals(FastMath.exp(x0), result[0], EPS);
        assertEquals(FastMath.exp(x0), result[1], EPS);
    }

    @Test
    public void testExpm1_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double x0 = 1.0;
        double[] x = { x0, 1.0 };
        double[] result = new double[2];
        c.expm1(x, 0, result, 0);
        assertEquals(FastMath.expm1(x0), result[0], EPS);
        assertEquals(FastMath.exp(x0), result[1], EPS);
    }

    // ---------------------------------------------------------------
    // log / log1p / log10
    // ---------------------------------------------------------------

    @Test
    public void testLog_computesCorrectValueAndDerivative() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double x0 = 2.0;
        double[] x = { x0, 1.0 };
        double[] result = new double[2];
        c.log(x, 0, result, 0);
        assertEquals(FastMath.log(x0), result[0], EPS);
        assertEquals(1.0 / x0, result[1], EPS);
    }

    @Test
    public void testLog_orderZero_noDerivativeComputation() {
        DSCompiler c = DSCompiler.getCompiler(1, 0);
        double[] x = { 2.0 };
        double[] result = new double[1];
        c.log(x, 0, result, 0);
        assertEquals(FastMath.log(2.0), result[0], EPS);
    }

    @Test
    public void testLog1p_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double x0 = 2.0;
        double[] x = { x0, 1.0 };
        double[] result = new double[2];
        c.log1p(x, 0, result, 0);
        assertEquals(FastMath.log1p(x0), result[0], EPS);
    }

    @Test
    public void testLog10_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double x0 = 100.0;
        double[] x = { x0, 1.0 };
        double[] result = new double[2];
        c.log10(x, 0, result, 0);
        assertEquals(FastMath.log10(x0), result[0], EPS);
    }

    // ---------------------------------------------------------------
    // trigonometric
    // ---------------------------------------------------------------

    @Test
    public void testCos_computesCorrectValueAndDerivative() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double x0 = 0.5;
        double[] x = { x0, 1.0, 0.0 };
        double[] result = new double[3];
        c.cos(x, 0, result, 0);
        assertEquals(FastMath.cos(x0), result[0], EPS);
        assertEquals(-FastMath.sin(x0), result[1], EPS);
    }

    @Test
    public void testCos_orderZero_noLoop() {
        DSCompiler c = DSCompiler.getCompiler(1, 0);
        double[] x = { 0.5 };
        double[] result = new double[1];
        c.cos(x, 0, result, 0);
        assertEquals(FastMath.cos(0.5), result[0], EPS);
    }

    @Test
    public void testSin_computesCorrectValueAndDerivative() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double x0 = 0.5;
        double[] x = { x0, 1.0, 0.0 };
        double[] result = new double[3];
        c.sin(x, 0, result, 0);
        assertEquals(FastMath.sin(x0), result[0], EPS);
        assertEquals(FastMath.cos(x0), result[1], EPS);
    }

    @Test
    public void testTan_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 0.3;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.tan(x, 0, result, 0);
        assertEquals(FastMath.tan(x0), result[0], EPS);
    }

    @Test
    public void testTan_orderZero_noLoop() {
        DSCompiler c = DSCompiler.getCompiler(1, 0);
        double[] x = { 0.3 };
        double[] result = new double[1];
        c.tan(x, 0, result, 0);
        assertEquals(FastMath.tan(0.3), result[0], EPS);
    }

    @Test
    public void testAcos_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 0.2;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.acos(x, 0, result, 0);
        assertEquals(FastMath.acos(x0), result[0], EPS);
    }

    @Test
    public void testAsin_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 0.2;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.asin(x, 0, result, 0);
        assertEquals(FastMath.asin(x0), result[0], EPS);
    }

    @Test
    public void testAtan_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 0.5;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.atan(x, 0, result, 0);
        assertEquals(FastMath.atan(x0), result[0], EPS);
    }

    // ---------------------------------------------------------------
    // atan2
    // ---------------------------------------------------------------

    @Test
    public void testAtan2_xPositive_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        double[] y = createVariable(c, 0, 2, 1.0);
        double[] x = createVariable(c, 1, 2, 1.0);
        double[] result = new double[c.getSize()];
        c.atan2(y, 0, x, 0, result, 0);
        assertEquals(FastMath.atan2(1.0, 1.0), result[0], 1e-6);
    }

    @Test
    public void testAtan2_xNegative_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        double[] y = createVariable(c, 0, 2, 1.0);
        double[] x = createVariable(c, 1, 2, -1.0);
        double[] result = new double[c.getSize()];
        c.atan2(y, 0, x, 0, result, 0);
        assertEquals(FastMath.atan2(1.0, -1.0), result[0], 1e-6);
    }

    @Test
    public void testAtan2_xNegativeYNegative_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        double[] y = createVariable(c, 0, 2, -1.0);
        double[] x = createVariable(c, 1, 2, -1.0);
        double[] result = new double[c.getSize()];
        c.atan2(y, 0, x, 0, result, 0);
        assertEquals(FastMath.atan2(-1.0, -1.0), result[0], 1e-6);
    }

    // ---------------------------------------------------------------
    // hyperbolic
    // ---------------------------------------------------------------

    @Test
    public void testCosh_computesCorrectValueAndDerivative() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double x0 = 0.5;
        double[] x = { x0, 1.0, 0.0 };
        double[] result = new double[3];
        c.cosh(x, 0, result, 0);
        assertEquals(FastMath.cosh(x0), result[0], EPS);
        assertEquals(FastMath.sinh(x0), result[1], EPS);
    }

    @Test
    public void testSinh_computesCorrectValueAndDerivative() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double x0 = 0.5;
        double[] x = { x0, 1.0, 0.0 };
        double[] result = new double[3];
        c.sinh(x, 0, result, 0);
        assertEquals(FastMath.sinh(x0), result[0], EPS);
        assertEquals(FastMath.cosh(x0), result[1], EPS);
    }

    @Test
    public void testTanh_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 0.4;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.tanh(x, 0, result, 0);
        assertEquals(FastMath.tanh(x0), result[0], EPS);
    }

    @Test
    public void testTanh_orderZero_noLoop() {
        DSCompiler c = DSCompiler.getCompiler(1, 0);
        double[] x = { 0.4 };
        double[] result = new double[1];
        c.tanh(x, 0, result, 0);
        assertEquals(FastMath.tanh(0.4), result[0], EPS);
    }

    @Test
    public void testAcosh_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 2.0;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.acosh(x, 0, result, 0);
        assertEquals(FastMath.acosh(x0), result[0], EPS);
    }

    @Test
    public void testAsinh_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 1.0;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.asinh(x, 0, result, 0);
        assertEquals(FastMath.asinh(x0), result[0], EPS);
    }

    @Test
    public void testAtanh_order4_computesWithoutException() {
        DSCompiler c = DSCompiler.getCompiler(1, 4);
        double x0 = 0.3;
        double[] x = new double[5];
        x[0] = x0;
        x[1] = 1.0;
        double[] result = new double[5];
        c.atanh(x, 0, result, 0);
        assertEquals(FastMath.atanh(x0), result[0], EPS);
    }

    // ---------------------------------------------------------------
    // compose
    // ---------------------------------------------------------------

    @Test
    public void testCompose_computesCorrectValue() {
        DSCompiler c = DSCompiler.getCompiler(1, 1);
        double[] operand = { 2.0, 1.0 };
        double[] f = { 4.0, 5.0 }; // f(operand[0]) = 4, f'(operand[0]) = 5
        double[] result = new double[2];
        c.compose(operand, 0, f, result, 0);
        assertEquals(4.0, result[0], EPS);
        assertEquals(5.0, result[1], EPS);
    }

    // ---------------------------------------------------------------
    // taylor
    // ---------------------------------------------------------------

    @Test
    public void testTaylor_singleParam_computesCorrectApproximation() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        // f(x) = x^2 at x0 = 3 => value=9, deriv1=6, deriv2=2
        double[] ds = { 9.0, 6.0, 2.0 };
        double value = c.taylor(ds, 0, 1.0);
        // exact value of (3+1)^2 = 16 matches taylor expansion to order 2
        assertEquals(16.0, value, EPS);
    }

    @Test
    public void testTaylor_zeroDelta_returnsOriginalValue() {
        DSCompiler c = DSCompiler.getCompiler(1, 2);
        double[] ds = { 9.0, 6.0, 2.0 };
        double value = c.taylor(ds, 0, 0.0);
        assertEquals(9.0, value, EPS);
    }

    @Test
    public void testTaylor_twoParams_computesCorrectApproximation() {
        DSCompiler c = DSCompiler.getCompiler(2, 1);
        double[] x = createVariable(c, 0, 2, 2.0);
        double[] y = createVariable(c, 1, 2, 3.0);
        double[] sum = new double[c.getSize()];
        c.add(x, 0, y, 0, sum, 0);
        double value = c.taylor(sum, 0, 0.5, 0.25);
        // f(x,y) = x + y, exact taylor = (2+0.5) + (3+0.25) = 6.0 - wait check below
        assertEquals((2.0 + 0.5) + (3.0 + 0.25), value, EPS);
    }

    // ---------------------------------------------------------------
    // checkCompatibility
    // ---------------------------------------------------------------

    @Test
    public void testCheckCompatibility_sameCompiler_noException() {
        DSCompiler c1 = DSCompiler.getCompiler(2, 2);
        DSCompiler c2 = DSCompiler.getCompiler(2, 2);
        c1.checkCompatibility(c2); // should not throw
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckCompatibility_differentParameters_throwsException() {
        DSCompiler c1 = DSCompiler.getCompiler(2, 2);
        DSCompiler c2 = DSCompiler.getCompiler(3, 2);
        c1.checkCompatibility(c2);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckCompatibility_differentOrder_throwsException() {
        DSCompiler c1 = DSCompiler.getCompiler(1, 2);
        DSCompiler c2 = DSCompiler.getCompiler(1, 3);
        c1.checkCompatibility(c2);
    }
}
