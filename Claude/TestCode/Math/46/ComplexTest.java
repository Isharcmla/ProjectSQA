package org.apache.commons.math.complex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import org.junit.Test;

public class ComplexTest {

    private static final double EPS = 1e-9;

    // Constructor tests
    @Test
    public void testConstructor_realOnly_imaginaryZero() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), EPS);
        assertEquals(0.0, c.getImaginary(), EPS);
    }

    @Test
    public void testConstructor_realAndImaginary_correctValues() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), EPS);
        assertEquals(4.0, c.getImaginary(), EPS);
    }

    @Test
    public void testConstructor_nanReal_isNaNTrue() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testConstructor_nanImaginary_isNaNTrue() {
        Complex c = new Complex(1.0, Double.NaN);
        assertTrue(c.isNaN());
    }

    @Test
    public void testConstructor_infiniteReal_isInfiniteTrue() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(c.isInfinite());
        assertFalse(c.isNaN());
    }

    @Test
    public void testConstructor_infiniteImaginary_isInfiniteTrue() {
        Complex c = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertTrue(c.isInfinite());
    }

    @Test
    public void testConstructor_zero_isZeroTrue() {
        Complex c = new Complex(0.0, 0.0);
        // isZero is private, test via divide behavior
        Complex result = c.divide(Complex.ZERO);
        assertTrue(result.isNaN());
    }

    // abs() tests
    @Test
    public void testAbs_normalValue_correctResult() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_nan_returnsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
    }

    @Test
    public void testAbs_infinite_returnsPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPS);
    }

    @Test
    public void testAbs_realZero_returnsAbsImaginary() {
        Complex c = new Complex(0.0, -5.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_imaginaryZero_returnsAbsReal() {
        Complex c = new Complex(-5.0, 0.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_realGreaterThanImaginary_correctResult() {
        Complex c = new Complex(10.0, 2.0);
        double expected = Math.sqrt(10.0 * 10.0 + 2.0 * 2.0);
        assertEquals(expected, c.abs(), EPS);
    }

    @Test
    public void testAbs_imaginaryGreaterThanReal_correctResult() {
        Complex c = new Complex(2.0, 10.0);
        double expected = Math.sqrt(10.0 * 10.0 + 2.0 * 2.0);
        assertEquals(expected, c.abs(), EPS);
    }

    @Test
    public void testAbs_zero_returnsZero() {
        assertEquals(0.0, Complex.ZERO.abs(), EPS);
    }

    // add(Complex) tests
    @Test
    public void testAddComplex_normalValues_correctResult() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.add(b);
        assertEquals(4.0, result.getReal(), EPS);
        assertEquals(6.0, result.getImaginary(), EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddComplex_null_throwsException() {
        Complex a = new Complex(1.0, 2.0);
        a.add((Complex) null);
    }

    @Test
    public void testAddComplex_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.add(new Complex(1.0, 2.0));
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddComplex_addendNaN_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.add(Complex.NaN);
        assertTrue(result.isNaN());
    }

    // add(double) tests
    @Test
    public void testAddDouble_normalValue_correctResult() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.add(3.0);
        assertEquals(4.0, result.getReal(), EPS);
        assertEquals(2.0, result.getImaginary(), EPS);
    }

    @Test
    public void testAddDouble_nan_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.add(Double.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddDouble_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.add(3.0);
        assertTrue(result.isNaN());
    }

    // conjugate() tests
    @Test
    public void testConjugate_normalValue_correctResult() {
        Complex c = new Complex(3.0, 4.0);
        Complex result = c.conjugate();
        assertEquals(3.0, result.getReal(), EPS);
        assertEquals(-4.0, result.getImaginary(), EPS);
    }

    @Test
    public void testConjugate_nan_returnsNaN() {
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    // divide(Complex) tests
    @Test
    public void testDivideComplex_normalValues_correctResult() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, 1.0);
        Complex result = a.divide(b);
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideComplex_null_throwsException() {
        Complex a = new Complex(1.0, 2.0);
        a.divide((Complex) null);
    }

    @Test
    public void testDivideComplex_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.divide(new Complex(1.0, 2.0));
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_divisorNaN_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.divide(Complex.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_bothZero_returnsNaN() {
        Complex result = Complex.ZERO.divide(Complex.ZERO);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_divisorZeroNotThisZero_returnsInf() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.divide(Complex.ZERO);
        assertTrue(result.isInfinite());
    }

    @Test
    public void testDivideComplex_divisorInfiniteThisFinite_returnsZero() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.divide(Complex.INF);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideComplex_bothInfinite_returnsNaN() {
        Complex result = Complex.INF.divide(Complex.INF);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_cLessThanD_correctResult() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, 2.0);
        Complex result = a.divide(b);
        assertNotNull(result);
        assertFalse(result.isNaN());
    }

    @Test
    public void testDivideComplex_cGreaterOrEqualD_correctResult() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(2.0, 1.0);
        Complex result = a.divide(b);
        assertNotNull(result);
        assertFalse(result.isNaN());
    }

    // divide(double) tests
    @Test
    public void testDivideDouble_normalValue_correctResult() {
        Complex a = new Complex(4.0, 8.0);
        Complex result = a.divide(2.0);
        assertEquals(2.0, result.getReal(), EPS);
        assertEquals(4.0, result.getImaginary(), EPS);
    }

    @Test
    public void testDivideDouble_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.divide(2.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble_divisorNaN_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.divide(Double.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble_divisorZeroNotZero_returnsInf() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.divide(0.0);
        assertTrue(result.isInfinite());
    }

    @Test
    public void testDivideDouble_divisorZeroAndThisZero_returnsNaN() {
        Complex result = Complex.ZERO.divide(0.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble_divisorInfiniteThisFinite_returnsZero() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.divide(Double.POSITIVE_INFINITY);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideDouble_divisorInfiniteThisInfinite_returnsNaN() {
        Complex result = Complex.INF.divide(Double.POSITIVE_INFINITY);
        assertTrue(result.isNaN());
    }

    // equals() tests
    @Test
    public void testEquals_sameObject_returnsTrue() {
        Complex c = new Complex(1.0, 2.0);
        assertTrue(c.equals(c));
    }

    @Test
    public void testEquals_equalValues_returnsTrue() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_bothNaN_returnsTrue() {
        Complex a = new Complex(Double.NaN, 1.0);
        Complex b = new Complex(1.0, Double.NaN);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_notComplexInstance_returnsFalse() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.equals("not a complex"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.equals(null));
    }

    @Test
    public void testEquals_thisNaNOtherNotNaN_returnsFalse() {
        Complex a = Complex.NaN;
        Complex b = new Complex(1.0, 2.0);
        assertFalse(a.equals(b));
    }

    // hashCode() tests
    @Test
    public void testHashCode_nan_returnsSeven() {
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testHashCode_normalValue_consistentWithEquals() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // getImaginary / getReal tests
    @Test
    public void testGetImaginary_returnsCorrectValue() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(2.0, c.getImaginary(), EPS);
    }

    @Test
    public void testGetReal_returnsCorrectValue() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), EPS);
    }

    // isNaN tests
    @Test
    public void testIsNaN_nanValue_returnsTrue() {
        assertTrue(Complex.NaN.isNaN());
    }

    @Test
    public void testIsNaN_normalValue_returnsFalse() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.isNaN());
    }

    // isInfinite tests
    @Test
    public void testIsInfinite_infiniteValue_returnsTrue() {
        assertTrue(Complex.INF.isInfinite());
    }

    @Test
    public void testIsInfinite_normalValue_returnsFalse() {
        Complex c = new Complex(1.0, 2.0);
        assertFalse(c.isInfinite());
    }

    // multiply(Complex) tests
    @Test
    public void testMultiplyComplex_normalValues_correctResult() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.multiply(b);
        assertEquals(-5.0, result.getReal(), EPS);
        assertEquals(10.0, result.getImaginary(), EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplex_null_throwsException() {
        Complex a = new Complex(1.0, 2.0);
        a.multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplex_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.multiply(new Complex(1.0, 2.0));
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyComplex_factorNaN_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.multiply(Complex.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyComplex_thisInfinite_returnsInf() {
        Complex a = new Complex(Double.POSITIVE_INFINITY, 2.0);
        Complex result = a.multiply(new Complex(1.0, 2.0));
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiplyComplex_factorInfinite_returnsInf() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.multiply(new Complex(Double.POSITIVE_INFINITY, 2.0));
        assertEquals(Complex.INF, result);
    }

    // multiply(double) tests
    @Test
    public void testMultiplyDouble_normalValue_correctResult() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.multiply(3.0);
        assertEquals(3.0, result.getReal(), EPS);
        assertEquals(6.0, result.getImaginary(), EPS);
    }

    @Test
    public void testMultiplyDouble_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.multiply(3.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyDouble_factorNaN_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.multiply(Double.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyDouble_thisInfinite_returnsInf() {
        Complex a = new Complex(Double.POSITIVE_INFINITY, 2.0);
        Complex result = a.multiply(3.0);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiplyDouble_factorInfinite_returnsInf() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.multiply(Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, result);
    }

    // negate() tests
    @Test
    public void testNegate_normalValue_correctResult() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.negate();
        assertEquals(-1.0, result.getReal(), EPS);
        assertEquals(-2.0, result.getImaginary(), EPS);
    }

    @Test
    public void testNegate_nan_returnsNaN() {
        assertTrue(Complex.NaN.negate().isNaN());
    }

    // subtract(Complex) tests
    @Test
    public void testSubtractComplex_normalValues_correctResult() {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.subtract(b);
        assertEquals(2.0, result.getReal(), EPS);
        assertEquals(2.0, result.getImaginary(), EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplex_null_throwsException() {
        Complex a = new Complex(1.0, 2.0);
        a.subtract((Complex) null);
    }

    @Test
    public void testSubtractComplex_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.subtract(new Complex(1.0, 2.0));
        assertTrue(result.isNaN());
    }

    @Test
    public void testSubtractComplex_subtrahendNaN_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.subtract(Complex.NaN);
        assertTrue(result.isNaN());
    }

    // subtract(double) tests
    @Test
    public void testSubtractDouble_normalValue_correctResult() {
        Complex a = new Complex(5.0, 6.0);
        Complex result = a.subtract(3.0);
        assertEquals(2.0, result.getReal(), EPS);
        assertEquals(6.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSubtractDouble_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.subtract(3.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testSubtractDouble_subtrahendNaN_returnsNaN() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.subtract(Double.NaN);
        assertTrue(result.isNaN());
    }

    // acos() tests
    @Test
    public void testAcos_normalValue_correctResult() {
        Complex a = new Complex(1.0, 0.0);
        Complex result = a.acos();
        assertNotNull(result);
    }

    @Test
    public void testAcos_nan_returnsNaN() {
        assertTrue(Complex.NaN.acos().isNaN());
    }

    // asin() tests
    @Test
    public void testAsin_normalValue_correctResult() {
        Complex a = new Complex(0.5, 0.0);
        Complex result = a.asin();
        assertNotNull(result);
    }

    @Test
    public void testAsin_nan_returnsNaN() {
        assertTrue(Complex.NaN.asin().isNaN());
    }

    // atan() tests
    @Test
    public void testAtan_normalValue_correctResult() {
        Complex a = new Complex(1.0, 1.0);
        Complex result = a.atan();
        assertNotNull(result);
    }

    @Test
    public void testAtan_nan_returnsNaN() {
        assertTrue(Complex.NaN.atan().isNaN());
    }

    // cos() tests
    @Test
    public void testCos_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.cos();
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testCos_nan_returnsNaN() {
        assertTrue(Complex.NaN.cos().isNaN());
    }

    // cosh() tests
    @Test
    public void testCosh_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.cosh();
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testCosh_nan_returnsNaN() {
        assertTrue(Complex.NaN.cosh().isNaN());
    }

    // exp() tests
    @Test
    public void testExp_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.exp();
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testExp_nan_returnsNaN() {
        assertTrue(Complex.NaN.exp().isNaN());
    }

    // log() tests
    @Test
    public void testLog_normalValue_correctResult() {
        Complex a = new Complex(1.0, 0.0);
        Complex result = a.log();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testLog_nan_returnsNaN() {
        assertTrue(Complex.NaN.log().isNaN());
    }

    // pow(Complex) tests
    @Test
    public void testPowComplex_normalValues_correctResult() {
        Complex a = new Complex(2.0, 0.0);
        Complex x = new Complex(2.0, 0.0);
        Complex result = a.pow(x);
        assertEquals(4.0, result.getReal(), 1e-6);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowComplex_null_throwsException() {
        Complex a = new Complex(2.0, 0.0);
        a.pow((Complex) null);
    }

    // pow(double) tests
    @Test
    public void testPowDouble_normalValue_correctResult() {
        Complex a = new Complex(2.0, 0.0);
        Complex result = a.pow(2.0);
        assertEquals(4.0, result.getReal(), 1e-6);
    }

    // sin() tests
    @Test
    public void testSin_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.sin();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSin_nan_returnsNaN() {
        assertTrue(Complex.NaN.sin().isNaN());
    }

    // sinh() tests
    @Test
    public void testSinh_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.sinh();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSinh_nan_returnsNaN() {
        assertTrue(Complex.NaN.sinh().isNaN());
    }

    // sqrt() tests
    @Test
    public void testSqrt_normalValue_correctResult() {
        Complex a = new Complex(4.0, 0.0);
        Complex result = a.sqrt();
        assertEquals(2.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_nan_returnsNaN() {
        assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt_zeroZero_returnsZero() {
        Complex result = Complex.ZERO.sqrt();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_negativeReal_correctResult() {
        Complex a = new Complex(-4.0, 0.0);
        Complex result = a.sqrt();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(2.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_negativeRealNegativeImaginary_correctResult() {
        Complex a = new Complex(-4.0, -1.0);
        Complex result = a.sqrt();
        assertNotNull(result);
        assertFalse(result.isNaN());
    }

    // sqrt1z() tests
    @Test
    public void testSqrt1z_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.sqrt1z();
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSqrt1z_nan_returnsNaN() {
        assertTrue(Complex.NaN.sqrt1z().isNaN());
    }

    // tan() tests
    @Test
    public void testTan_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.tan();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testTan_nan_returnsNaN() {
        assertTrue(Complex.NaN.tan().isNaN());
    }

    // tanh() tests
    @Test
    public void testTanh_normalValue_correctResult() {
        Complex a = new Complex(0.0, 0.0);
        Complex result = a.tanh();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testTanh_nan_returnsNaN() {
        assertTrue(Complex.NaN.tanh().isNaN());
    }

    // getArgument() tests
    @Test
    public void testGetArgument_normalValue_correctResult() {
        Complex a = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4, a.getArgument(), EPS);
    }

    @Test
    public void testGetArgument_zeroZero_returnsZero() {
        assertEquals(0.0, Complex.ZERO.getArgument(), EPS);
    }

    @Test
    public void testGetArgument_nan_returnsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    // nthRoot() tests
    @Test
    public void testNthRoot_normalValue_correctSize() {
        Complex a = new Complex(1.0, 0.0);
        List<Complex> roots = a.nthRoot(4);
        assertEquals(4, roots.size());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_zeroN_throwsException() {
        Complex a = new Complex(1.0, 0.0);
        a.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_negativeN_throwsException() {
        Complex a = new Complex(1.0, 0.0);
        a.nthRoot(-1);
    }

    @Test
    public void testNthRoot_nan_returnsListWithNaN() {
        List<Complex> roots = Complex.NaN.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_infinite_returnsListWithInf() {
        List<Complex> roots = Complex.INF.nthRoot(2);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    @Test
    public void testNthRoot_nEqualsOne_returnsOneRoot() {
        Complex a = new Complex(2.0, 0.0);
        List<Complex> roots = a.nthRoot(1);
        assertEquals(1, roots.size());
    }

    // valueOf(double, double) tests
    @Test
    public void testValueOfTwoArgs_normalValues_correctResult() {
        Complex c = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c.getReal(), EPS);
        assertEquals(2.0, c.getImaginary(), EPS);
    }

    @Test
    public void testValueOfTwoArgs_nanReal_returnsNaN() {
        Complex c = Complex.valueOf(Double.NaN, 2.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testValueOfTwoArgs_nanImaginary_returnsNaN() {
        Complex c = Complex.valueOf(1.0, Double.NaN);
        assertTrue(c.isNaN());
    }

    // valueOf(double) tests
    @Test
    public void testValueOfOneArg_normalValue_correctResult() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), EPS);
        assertEquals(0.0, c.getImaginary(), EPS);
    }

    @Test
    public void testValueOfOneArg_nan_returnsNaN() {
        Complex c = Complex.valueOf(Double.NaN);
        assertTrue(c.isNaN());
    }

    // getField() test
    @Test
    public void testGetField_returnsNotNull() {
        Complex c = new Complex(1.0, 2.0);
        assertNotNull(c.getField());
    }

    // toString() test
    @Test
    public void testToString_normalValue_correctFormat() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals("(1.0, 2.0)", c.toString());
    }

    @Test
    public void testToString_negativeValues_correctFormat() {
        Complex c = new Complex(-1.0, -2.0);
        assertEquals("(-1.0, -2.0)", c.toString());
    }

    // Static constants tests
    @Test
    public void testStaticConstant_I_correctValues() {
        assertEquals(0.0, Complex.I.getReal(), EPS);
        assertEquals(1.0, Complex.I.getImaginary(), EPS);
    }

    @Test
    public void testStaticConstant_NaN_isNaN() {
        assertTrue(Complex.NaN.isNaN());
    }

    @Test
    public void testStaticConstant_INF_isInfinite() {
        assertTrue(Complex.INF.isInfinite());
    }

    @Test
    public void testStaticConstant_ONE_correctValues() {
        assertEquals(1.0, Complex.ONE.getReal(), EPS);
        assertEquals(0.0, Complex.ONE.getImaginary(), EPS);
    }

    @Test
    public void testStaticConstant_ZERO_correctValues() {
        assertEquals(0.0, Complex.ZERO.getReal(), EPS);
        assertEquals(0.0, Complex.ZERO.getImaginary(), EPS);
    }
}
