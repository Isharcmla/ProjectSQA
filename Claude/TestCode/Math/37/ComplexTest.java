import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;

import java.util.List;

public class ComplexTest {

    private Complex one;
    private Complex two;
    private Complex negOne;
    private Complex negInf;
    private Complex posInf;
    private Complex nanComplex;
    private Complex neg5;

    @Before
    public void setUp() {
        one = new Complex(1.0, 0.0);
        two = new Complex(2.0, 0.0);
        negOne = new Complex(-1.0, 0.0);
        negInf = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        posInf = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        nanComplex = new Complex(Double.NaN, Double.NaN);
        neg5 = new Complex(-5.0, 0.0);
    }

    // Constructor Tests
    @Test
    public void testConstructor_realOnly_imaginaryZero() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), 1e-10);
        assertEquals(0.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testConstructor_realAndImaginary_correctValues() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), 1e-10);
        assertEquals(4.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testConstructor_withNaNReal_isNaNTrue() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testConstructor_withNaNImaginary_isNaNTrue() {
        Complex c = new Complex(1.0, Double.NaN);
        assertTrue(c.isNaN());
    }

    @Test
    public void testConstructor_withInfiniteReal_isInfiniteTrue() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(c.isInfinite());
        assertFalse(c.isNaN());
    }

    @Test
    public void testConstructor_withInfiniteImaginary_isInfiniteTrue() {
        Complex c = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertTrue(c.isInfinite());
    }

    @Test
    public void testConstructor_nanAndInfinite_isNaNTakesPrecedence() {
        Complex c = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    // abs() tests
    @Test
    public void testAbs_normalValue_correctResult() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_isNaN_returnsNaN() {
        assertTrue(Double.isNaN(nanComplex.abs()));
    }

    @Test
    public void testAbs_isInfinite_returnsPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, posInf.abs(), 1e-10);
    }

    @Test
    public void testAbs_realLessThanImaginary_imaginaryZero() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_realLessThanImaginary_nonZeroImaginary() {
        Complex c = new Complex(1.0, 5.0);
        assertEquals(Math.sqrt(26), c.abs(), 1e-10);
    }

    @Test
    public void testAbs_realGreaterOrEqual_realZero() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_realGreaterOrEqual_nonZeroReal() {
        Complex c = new Complex(5.0, 1.0);
        assertEquals(Math.sqrt(26), c.abs(), 1e-10);
    }

    // add(Complex) tests
    @Test
    public void testAddComplex_normalValues_correctSum() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.add(c2);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testAddComplex_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.add(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddComplex_addendIsNaN_returnsNaN() {
        Complex result = one.add(nanComplex);
        assertTrue(result.isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddComplex_nullAddend_throwsException() {
        one.add((Complex) null);
    }

    // add(double) tests
    @Test
    public void testAddDouble_normalValue_correctSum() {
        Complex c = new Complex(1.0, 2.0);
        Complex result = c.add(3.0);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(2.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testAddDouble_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.add(1.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddDouble_addendIsNaN_returnsNaN() {
        Complex result = one.add(Double.NaN);
        assertTrue(result.isNaN());
    }

    // conjugate() tests
    @Test
    public void testConjugate_normalValue_correctResult() {
        Complex c = new Complex(3.0, 4.0);
        Complex result = c.conjugate();
        assertEquals(3.0, result.getReal(), 1e-10);
        assertEquals(-4.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testConjugate_isNaN_returnsNaN() {
        Complex result = nanComplex.conjugate();
        assertTrue(result.isNaN());
    }

    // divide(Complex) tests
    @Test
    public void testDivideComplex_normalValues_correctResult() {
        Complex c1 = new Complex(1.0, 1.0);
        Complex c2 = new Complex(1.0, 0.0);
        Complex result = c1.divide(c2);
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(1.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testDivideComplex_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.divide(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_divisorIsNaN_returnsNaN() {
        Complex result = one.divide(nanComplex);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_divisorIsZero_returnsNaN() {
        Complex result = one.divide(Complex.ZERO);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_divisorInfiniteThisFinite_returnsZero() {
        Complex result = one.divide(posInf);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideComplex_bothInfinite_returnsNaN() {
        Complex result = posInf.divide(negInf);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_absCLessThanAbsD_correctResult() {
        Complex c1 = new Complex(1.0, 1.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex result = c1.divide(c2);
        assertFalse(result.isNaN());
    }

    @Test
    public void testDivideComplex_absCGreaterOrEqualAbsD_correctResult() {
        Complex c1 = new Complex(1.0, 1.0);
        Complex c2 = new Complex(2.0, 1.0);
        Complex result = c1.divide(c2);
        assertFalse(result.isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideComplex_nullDivisor_throwsException() {
        one.divide((Complex) null);
    }

    // divide(double) tests
    @Test
    public void testDivideDouble_normalValue_correctResult() {
        Complex c = new Complex(4.0, 2.0);
        Complex result = c.divide(2.0);
        assertEquals(2.0, result.getReal(), 1e-10);
        assertEquals(1.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testDivideDouble_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.divide(2.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble_divisorIsNaN_returnsNaN() {
        Complex result = one.divide(Double.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble_divisorIsZero_returnsNaN() {
        Complex result = one.divide(0.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble_divisorInfiniteThisFinite_returnsZero() {
        Complex result = one.divide(Double.POSITIVE_INFINITY);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideDouble_divisorInfiniteThisInfinite_returnsNaN() {
        Complex result = posInf.divide(Double.POSITIVE_INFINITY);
        assertTrue(result.isNaN());
    }

    // reciprocal() tests
    @Test
    public void testReciprocal_normalValue_correctResult() {
        Complex c = new Complex(2.0, 0.0);
        Complex result = c.reciprocal();
        assertEquals(0.5, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testReciprocal_isNaN_returnsNaN() {
        Complex result = nanComplex.reciprocal();
        assertTrue(result.isNaN());
    }

    @Test
    public void testReciprocal_isZero_returnsNaN() {
        Complex result = Complex.ZERO.reciprocal();
        assertTrue(result.isNaN());
    }

    @Test
    public void testReciprocal_isInfinite_returnsZero() {
        Complex result = posInf.reciprocal();
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testReciprocal_realLessThanImaginary_correctResult() {
        Complex c = new Complex(1.0, 5.0);
        Complex result = c.reciprocal();
        assertFalse(result.isNaN());
    }

    @Test
    public void testReciprocal_realGreaterOrEqualImaginary_correctResult() {
        Complex c = new Complex(5.0, 1.0);
        Complex result = c.reciprocal();
        assertFalse(result.isNaN());
    }

    // equals() tests
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(one.equals(one));
    }

    @Test
    public void testEquals_equalValues_returnsTrue() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 3.0);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_otherIsNaN_thisIsNaN_returnsTrue() {
        Complex c1 = new Complex(Double.NaN, 1.0);
        assertTrue(c1.equals(Complex.NaN));
    }

    @Test
    public void testEquals_otherIsNaN_thisIsNotNaN_returnsFalse() {
        assertFalse(one.equals(Complex.NaN));
    }

    @Test
    public void testEquals_notComplexInstance_returnsFalse() {
        assertFalse(one.equals("not a complex"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(one.equals(null));
    }

    // hashCode() tests
    @Test
    public void testHashCode_isNaN_returnsSeven() {
        assertEquals(7, nanComplex.hashCode());
    }

    @Test
    public void testHashCode_normalValue_consistentHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    // getImaginary / getReal tests
    @Test
    public void testGetImaginary_normalValue_correctResult() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(2.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testGetReal_normalValue_correctResult() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 1e-10);
    }

    // isNaN / isInfinite tests
    @Test
    public void testIsNaN_nanValue_returnsTrue() {
        assertTrue(nanComplex.isNaN());
    }

    @Test
    public void testIsNaN_normalValue_returnsFalse() {
        assertFalse(one.isNaN());
    }

    @Test
    public void testIsInfinite_infiniteValue_returnsTrue() {
        assertTrue(posInf.isInfinite());
    }

    @Test
    public void testIsInfinite_normalValue_returnsFalse() {
        assertFalse(one.isInfinite());
    }

    // multiply(Complex) tests
    @Test
    public void testMultiplyComplex_normalValues_correctResult() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.multiply(c2);
        assertEquals(-5.0, result.getReal(), 1e-10);
        assertEquals(10.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testMultiplyComplex_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.multiply(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyComplex_factorIsNaN_returnsNaN() {
        Complex result = one.multiply(nanComplex);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyComplex_thisIsInfinite_returnsInf() {
        Complex result = posInf.multiply(one);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiplyComplex_factorIsInfinite_returnsInf() {
        Complex result = one.multiply(posInf);
        assertEquals(Complex.INF, result);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplex_nullFactor_throwsException() {
        one.multiply((Complex) null);
    }

    // multiply(int) tests
    @Test
    public void testMultiplyInt_normalValue_correctResult() {
        Complex c = new Complex(2.0, 3.0);
        Complex result = c.multiply(2);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testMultiplyInt_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.multiply(2);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyInt_thisIsInfinite_returnsInf() {
        Complex result = posInf.multiply(2);
        assertEquals(Complex.INF, result);
    }

    // multiply(double) tests
    @Test
    public void testMultiplyDouble_normalValue_correctResult() {
        Complex c = new Complex(2.0, 3.0);
        Complex result = c.multiply(2.0);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testMultiplyDouble_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.multiply(2.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyDouble_factorIsNaN_returnsNaN() {
        Complex result = one.multiply(Double.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiplyDouble_thisIsInfinite_returnsInf() {
        Complex result = posInf.multiply(2.0);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiplyDouble_factorIsInfinite_returnsInf() {
        Complex result = one.multiply(Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, result);
    }

    // negate() tests
    @Test
    public void testNegate_normalValue_correctResult() {
        Complex c = new Complex(1.0, 2.0);
        Complex result = c.negate();
        assertEquals(-1.0, result.getReal(), 1e-10);
        assertEquals(-2.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testNegate_isNaN_returnsNaN() {
        Complex result = nanComplex.negate();
        assertTrue(result.isNaN());
    }

    // subtract(Complex) tests
    @Test
    public void testSubtractComplex_normalValues_correctResult() {
        Complex c1 = new Complex(5.0, 6.0);
        Complex c2 = new Complex(2.0, 3.0);
        Complex result = c1.subtract(c2);
        assertEquals(3.0, result.getReal(), 1e-10);
        assertEquals(3.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSubtractComplex_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.subtract(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testSubtractComplex_subtrahendIsNaN_returnsNaN() {
        Complex result = one.subtract(nanComplex);
        assertTrue(result.isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplex_nullSubtrahend_throwsException() {
        one.subtract((Complex) null);
    }

    // subtract(double) tests
    @Test
    public void testSubtractDouble_normalValue_correctResult() {
        Complex c = new Complex(5.0, 6.0);
        Complex result = c.subtract(2.0);
        assertEquals(3.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSubtractDouble_thisIsNaN_returnsNaN() {
        Complex result = nanComplex.subtract(2.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testSubtractDouble_subtrahendIsNaN_returnsNaN() {
        Complex result = one.subtract(Double.NaN);
        assertTrue(result.isNaN());
    }

    // acos() tests
    @Test
    public void testAcos_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.acos();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAcos_isNaN_returnsNaN() {
        Complex result = nanComplex.acos();
        assertTrue(result.isNaN());
    }

    // asin() tests
    @Test
    public void testAsin_normalValue_correctResult() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.asin();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAsin_isNaN_returnsNaN() {
        Complex result = nanComplex.asin();
        assertTrue(result.isNaN());
    }

    // atan() tests
    @Test
    public void testAtan_normalValue_correctResult() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.atan();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAtan_isNaN_returnsNaN() {
        Complex result = nanComplex.atan();
        assertTrue(result.isNaN());
    }

    // cos() tests
    @Test
    public void testCos_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.cos();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testCos_isNaN_returnsNaN() {
        Complex result = nanComplex.cos();
        assertTrue(result.isNaN());
    }

    // cosh() tests
    @Test
    public void testCosh_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.cosh();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testCosh_isNaN_returnsNaN() {
        Complex result = nanComplex.cosh();
        assertTrue(result.isNaN());
    }

    // exp() tests
    @Test
    public void testExp_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.exp();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testExp_isNaN_returnsNaN() {
        Complex result = nanComplex.exp();
        assertTrue(result.isNaN());
    }

    // log() tests
    @Test
    public void testLog_normalValue_correctResult() {
        Complex c = new Complex(1.0, 0.0);
        Complex result = c.log();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testLog_isNaN_returnsNaN() {
        Complex result = nanComplex.log();
        assertTrue(result.isNaN());
    }

    // pow(Complex) tests
    @Test
    public void testPowComplex_normalValue_correctResult() {
        Complex base = new Complex(2.0, 0.0);
        Complex exponent = new Complex(2.0, 0.0);
        Complex result = base.pow(exponent);
        assertEquals(4.0, result.getReal(), 1e-9);
        assertEquals(0.0, result.getImaginary(), 1e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowComplex_nullExponent_throwsException() {
        one.pow((Complex) null);
    }

    // pow(double) tests
    @Test
    public void testPowDouble_normalValue_correctResult() {
        Complex base = new Complex(2.0, 0.0);
        Complex result = base.pow(2.0);
        assertEquals(4.0, result.getReal(), 1e-9);
        assertEquals(0.0, result.getImaginary(), 1e-9);
    }

    // sin() tests
    @Test
    public void testSin_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.sin();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSin_isNaN_returnsNaN() {
        Complex result = nanComplex.sin();
        assertTrue(result.isNaN());
    }

    // sinh() tests
    @Test
    public void testSinh_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.sinh();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSinh_isNaN_returnsNaN() {
        Complex result = nanComplex.sinh();
        assertTrue(result.isNaN());
    }

    // sqrt() tests
    @Test
    public void testSqrt_normalValue_correctResult() {
        Complex c = new Complex(4.0, 0.0);
        Complex result = c.sqrt();
        assertEquals(2.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSqrt_isNaN_returnsNaN() {
        Complex result = nanComplex.sqrt();
        assertTrue(result.isNaN());
    }

    @Test
    public void testSqrt_isZero_returnsZero() {
        Complex result = Complex.ZERO.sqrt();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSqrt_negativeReal_correctResult() {
        Complex c = new Complex(-4.0, 0.0);
        Complex result = c.sqrt();
        assertEquals(0.0, result.getReal(), 1e-9);
        assertEquals(2.0, result.getImaginary(), 1e-9);
    }

    // sqrt1z() tests
    @Test
    public void testSqrt1z_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.sqrt1z();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    // tan() tests
    @Test
    public void testTan_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testTan_isNaN_returnsNaN() {
        Complex result = nanComplex.tan();
        assertTrue(result.isNaN());
    }

    // tanh() tests
    @Test
    public void testTanh_normalValue_correctResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.tanh();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testTanh_isNaN_returnsNaN() {
        Complex result = nanComplex.tanh();
        assertTrue(result.isNaN());
    }

    // getArgument() tests
    @Test
    public void testGetArgument_normalValue_correctResult() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4, c.getArgument(), 1e-10);
    }

    @Test
    public void testGetArgument_zero_returnsZero() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.getArgument(), 1e-10);
    }

    // nthRoot() tests
    @Test
    public void testNthRoot_normalValue_correctSize() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(3);
        assertEquals(3, roots.size());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_zeroN_throwsException() {
        one.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_negativeN_throwsException() {
        one.nthRoot(-1);
    }

    @Test
    public void testNthRoot_isNaN_returnsListWithNaN() {
        List<Complex> roots = nanComplex.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_isInfinite_returnsListWithInf() {
        List<Complex> roots = posInf.nthRoot(2);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    @Test
    public void testNthRoot_singleRoot_correctValue() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(1);
        assertEquals(1, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 1e-10);
        assertEquals(0.0, roots.get(0).getImaginary(), 1e-10);
    }

    // valueOf(double, double) tests
    @Test
    public void testValueOfTwoArgs_normalValues_correctResult() {
        Complex c = Complex.valueOf(3.0, 4.0);
        assertEquals(3.0, c.getReal(), 1e-10);
        assertEquals(4.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testValueOfTwoArgs_realIsNaN_returnsNaN() {
        Complex c = Complex.valueOf(Double.NaN, 4.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testValueOfTwoArgs_imaginaryIsNaN_returnsNaN() {
        Complex c = Complex.valueOf(3.0, Double.NaN);
        assertTrue(c.isNaN());
    }

    // valueOf(double) tests
    @Test
    public void testValueOfOneArg_normalValue_correctResult() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), 1e-10);
        assertEquals(0.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testValueOfOneArg_isNaN_returnsNaN() {
        Complex c = Complex.valueOf(Double.NaN);
        assertTrue(c.isNaN());
    }

    // getField() tests
    @Test
    public void testGetField_returnsNotNull() {
        assertNotNull(one.getField());
    }

    // toString() tests
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
    public void testStaticConstants_valuesCorrect() {
        assertEquals(0.0, Complex.I.getReal(), 1e-10);
        assertEquals(1.0, Complex.I.getImaginary(), 1e-10);
        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
        assertEquals(1.0, Complex.ONE.getReal(), 1e-10);
        assertEquals(0.0, Complex.ONE.getImaginary(), 1e-10);
        assertEquals(0.0, Complex.ZERO.getReal(), 1e-10);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 1e-10);
    }

    // Additional edge cases
    @Test
    public void testDivide_negativeNumbers_correctResult() {
        Complex c1 = neg5;
        Complex c2 = negOne;
        Complex result = c1.divide(c2);
        assertEquals(5.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testMultiply_negativeNumbers_correctResult() {
        Complex result = negOne.multiply(negOne);
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testAbs_negativeRealAndImaginary_correctResult() {
        Complex c = new Complex(-3.0, -4.0);
        assertEquals(5.0, c.abs(), 1e-10);
    }
}
