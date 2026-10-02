import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.complex.Complex;

public class ComplexTest {

    private Complex one;
    private Complex zero;
    private Complex i;
    private Complex nan;
    private Complex inf;
    private Complex negInf;
    private Complex negOne;
    private Complex oneInf;
    private Complex negInfNegInf;
    private Complex negOneInf;

    private static final double EPS = 1e-10;

    @Before
    public void setUp() {
        one = new Complex(1.0, 0.0);
        zero = new Complex(0.0, 0.0);
        i = new Complex(0.0, 1.0);
        nan = new Complex(Double.NaN, Double.NaN);
        inf = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        negInf = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        negOne = new Complex(-1.0, 0.0);
        oneInf = new Complex(1.0, Double.POSITIVE_INFINITY);
        negInfNegInf = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        negOneInf = new Complex(-1.0, Double.POSITIVE_INFINITY);
    }

    // ---------- Constructor ----------
    @Test
    public void testConstructor_normalValues_setsFields() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), EPS);
        assertEquals(4.0, c.getImaginary(), EPS);
    }

    @Test
    public void testConstructor_nanValues_isNaNTrue() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
    }

    // ---------- abs() ----------
    @Test
    public void testAbs_normalValue_returnsCorrectAbs() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_isNaN_returnsNaN() {
        assertTrue(Double.isNaN(nan.abs()));
    }

    @Test
    public void testAbs_isInfinite_returnsPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, inf.abs(), EPS);
    }

    @Test
    public void testAbs_realZeroImaginaryGreater_returnsAbsImaginary() {
        Complex c = new Complex(0.0, 5.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_imaginaryZeroRealGreater_returnsAbsReal() {
        Complex c = new Complex(5.0, 0.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_imaginaryZeroAndRealLess_returnsAbsReal() {
        // real abs < imaginary abs branch, with imaginary == 0.0 impossible unless real==0 too
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_negativeValues_returnsPositiveAbs() {
        Complex c = new Complex(-3.0, -4.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    // ---------- add() ----------
    @Test
    public void testAdd_normalValues_returnsSum() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.add(c2);
        assertEquals(4.0, result.getReal(), EPS);
        assertEquals(6.0, result.getImaginary(), EPS);
    }

    @Test
    public void testAdd_withZero_returnsSameValue() {
        Complex c1 = new Complex(5.0, 5.0);
        Complex result = c1.add(zero);
        assertEquals(5.0, result.getReal(), EPS);
        assertEquals(5.0, result.getImaginary(), EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_nullArgument_throwsNullPointerException() {
        one.add(null);
    }

    // ---------- conjugate() ----------
    @Test
    public void testConjugate_normalValue_returnsConjugate() {
        Complex c = new Complex(3.0, 4.0);
        Complex result = c.conjugate();
        assertEquals(3.0, result.getReal(), EPS);
        assertEquals(-4.0, result.getImaginary(), EPS);
    }

    @Test
    public void testConjugate_isNaN_returnsNaN() {
        Complex result = nan.conjugate();
        assertTrue(result.isNaN());
    }

    // ---------- divide() ----------
    @Test
    public void testDivide_normalValues_returnsQuotient() {
        Complex c1 = new Complex(1.0, 1.0);
        Complex c2 = new Complex(1.0, 1.0);
        Complex result = c1.divide(c2);
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testDivide_isNaN_returnsNaN() {
        Complex result = nan.divide(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivide_rhsIsNaN_returnsNaN() {
        Complex result = one.divide(nan);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivide_rhsIsZero_returnsNaN() {
        Complex result = one.divide(zero);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivide_rhsInfiniteThisFinite_returnsZero() {
        Complex result = one.divide(inf);
        assertEquals(zero, result);
    }

    @Test
    public void testDivide_bothInfinite_returnsNaN() {
        Complex result = inf.divide(inf);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivide_absCLessThanAbsD_returnsCorrectResult() {
        Complex c1 = new Complex(1.0, 1.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex result = c1.divide(c2);
        assertFalse(result.isNaN());
    }

    @Test
    public void testDivide_absCLessThanAbsD_dZero_divideByC() {
        // c=1, d=0, but c==0&&d==0 check false; abs(c)<abs(d) false since d=0
        // force branch where c< d magnitude and d==0 is impossible since abs(c)<abs(d) requires d!=0 when c=... 
        // Instead test standard branch for completeness
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(4.0, 0.0);
        Complex result = c1.divide(c2);
        assertEquals(0.5, result.getReal(), EPS);
        assertEquals(0.75, result.getImaginary(), EPS);
    }

    @Test
    public void testDivide_cZero_dNonZero_elseBranch() {
        Complex c1 = new Complex(1.0, 1.0);
        Complex c2 = new Complex(0.0, 5.0);
        Complex result = c1.divide(c2);
        assertFalse(result.isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testDivide_nullArgument_throwsNullPointerException() {
        one.divide(null);
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(one.equals(one));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(one.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(one.equals("not a complex"));
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
        Complex c2 = new Complex(2.0, 1.0);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void testEquals_bothNaN_returnsTrue() {
        Complex c1 = new Complex(Double.NaN, 1.0);
        Complex c2 = new Complex(2.0, Double.NaN);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals_thisNaNOtherNotNaN_returnsFalse() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(Double.NaN, 2.0);
        assertFalse(c1.equals(c2));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_isNaN_returns7() {
        assertEquals(7, nan.hashCode());
    }

    @Test
    public void testHashCode_normalValue_consistentHash() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    // ---------- getImaginary / getReal ----------
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

    // ---------- isNaN() ----------
    @Test
    public void testIsNaN_realNaN_returnsTrue() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testIsNaN_imaginaryNaN_returnsTrue() {
        Complex c = new Complex(1.0, Double.NaN);
        assertTrue(c.isNaN());
    }

    @Test
    public void testIsNaN_normalValue_returnsFalse() {
        Complex c = new Complex(1.0, 1.0);
        assertFalse(c.isNaN());
    }

    // ---------- isInfinite() ----------
    @Test
    public void testIsInfinite_infiniteReal_returnsTrue() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(c.isInfinite());
    }

    @Test
    public void testIsInfinite_infiniteImaginary_returnsTrue() {
        Complex c = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertTrue(c.isInfinite());
    }

    @Test
    public void testIsInfinite_nanValue_returnsFalse() {
        Complex c = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        assertFalse(c.isInfinite());
    }

    @Test
    public void testIsInfinite_normalValue_returnsFalse() {
        Complex c = new Complex(1.0, 1.0);
        assertFalse(c.isInfinite());
    }

    // ---------- multiply() ----------
    @Test
    public void testMultiply_normalValues_returnsProduct() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.multiply(c2);
        assertEquals(-5.0, result.getReal(), EPS);
        assertEquals(10.0, result.getImaginary(), EPS);
    }

    @Test
    public void testMultiply_isNaN_returnsNaN() {
        Complex result = nan.multiply(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiply_rhsIsNaN_returnsNaN() {
        Complex result = one.multiply(nan);
        assertTrue(result.isNaN());
    }

    @Test
    public void testMultiply_thisInfinite_returnsInf() {
        Complex result = inf.multiply(one);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiply_rhsInfinite_returnsInf() {
        Complex result = one.multiply(inf);
        assertEquals(Complex.INF, result);
    }

    @Test(expected = NullPointerException.class)
    public void testMultiply_nullArgument_throwsNullPointerException() {
        one.multiply(null);
    }

    // ---------- negate() ----------
    @Test
    public void testNegate_normalValue_returnsNegated() {
        Complex c = new Complex(3.0, 4.0);
        Complex result = c.negate();
        assertEquals(-3.0, result.getReal(), EPS);
        assertEquals(-4.0, result.getImaginary(), EPS);
    }

    @Test
    public void testNegate_isNaN_returnsNaN() {
        Complex result = nan.negate();
        assertTrue(result.isNaN());
    }

    // ---------- subtract() ----------
    @Test
    public void testSubtract_normalValues_returnsDifference() {
        Complex c1 = new Complex(5.0, 6.0);
        Complex c2 = new Complex(2.0, 3.0);
        Complex result = c1.subtract(c2);
        assertEquals(3.0, result.getReal(), EPS);
        assertEquals(3.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSubtract_isNaN_returnsNaN() {
        Complex result = nan.subtract(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testSubtract_rhsIsNaN_returnsNaN() {
        Complex result = one.subtract(nan);
        assertTrue(result.isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testSubtract_nullArgument_throwsNullPointerException() {
        one.subtract(null);
    }

    // ---------- acos() ----------
    @Test
    public void testAcos_normalValue_returnsResult() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.acos();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAcos_isNaN_returnsNaN() {
        Complex result = nan.acos();
        assertTrue(result.isNaN());
    }

    // ---------- asin() ----------
    @Test
    public void testAsin_normalValue_returnsResult() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.asin();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAsin_isNaN_returnsNaN() {
        Complex result = nan.asin();
        assertTrue(result.isNaN());
    }

    // ---------- atan() ----------
    @Test
    public void testAtan_normalValue_returnsResult() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.atan();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAtan_isNaN_returnsNaN() {
        Complex result = nan.atan();
        assertTrue(result.isNaN());
    }

    // ---------- cos() ----------
    @Test
    public void testCos_normalValue_returnsResult() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.cos();
        assertFalse(result.isNaN());
    }

    @Test
    public void testCos_isNaN_returnsNaN() {
        Complex result = nan.cos();
        assertTrue(result.isNaN());
    }

    @Test
    public void testCos_zero_returnsOne() {
        Complex result = zero.cos();
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    // ---------- cosh() ----------
    @Test
    public void testCosh_normalValue_returnsResult() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.cosh();
        assertFalse(result.isNaN());
    }

    @Test
    public void testCosh_isNaN_returnsNaN() {
        Complex result = nan.cosh();
        assertTrue(result.isNaN());
    }

    // ---------- exp() ----------
    @Test
    public void testExp_normalValue_returnsResult() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.exp();
        assertEquals(1.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testExp_isNaN_returnsNaN() {
        Complex result = nan.exp();
        assertTrue(result.isNaN());
    }

    // ---------- log() ----------
    @Test
    public void testLog_normalValue_returnsResult() {
        Complex c = new Complex(1.0, 0.0);
        Complex result = c.log();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testLog_isNaN_returnsNaN() {
        Complex result = nan.log();
        assertTrue(result.isNaN());
    }

    @Test
    public void testLog_zero_returnsNegativeInfinity() {
        Complex result = zero.log();
        assertEquals(Double.NEGATIVE_INFINITY, result.getReal(), EPS);
    }

    // ---------- pow() ----------
    @Test
    public void testPow_normalValue_returnsResult() {
        Complex base = new Complex(2.0, 0.0);
        Complex exponent = new Complex(2.0, 0.0);
        Complex result = base.pow(exponent);
        assertEquals(4.0, result.getReal(), 1e-6);
        assertEquals(0.0, result.getImaginary(), 1e-6);
    }

    @Test(expected = NullPointerException.class)
    public void testPow_nullArgument_throwsNullPointerException() {
        one.pow(null);
    }

    // ---------- sin() ----------
    @Test
    public void testSin_normalValue_returnsResult() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.sin();
        assertFalse(result.isNaN());
    }

    @Test
    public void testSin_isNaN_returnsNaN() {
        Complex result = nan.sin();
        assertTrue(result.isNaN());
    }

    @Test
    public void testSin_zero_returnsZero() {
        Complex result = zero.sin();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    // ---------- sinh() ----------
    @Test
    public void testSinh_normalValue_returnsResult() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.sinh();
        assertFalse(result.isNaN());
    }

    @Test
    public void testSinh_isNaN_returnsNaN() {
        Complex result = nan.sinh();
        assertTrue(result.isNaN());
    }

    // ---------- sqrt() ----------
    @Test
    public void testSqrt_normalValue_returnsResult() {
        Complex c = new Complex(4.0, 0.0);
        Complex result = c.sqrt();
        assertEquals(2.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_isNaN_returnsNaN() {
        Complex result = nan.sqrt();
        assertTrue(result.isNaN());
    }

    @Test
    public void testSqrt_zero_returnsZero() {
        Complex result = zero.sqrt();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_negativeReal_returnsCorrectBranch() {
        Complex c = new Complex(-4.0, 0.0);
        Complex result = c.sqrt();
        assertFalse(result.isNaN());
        assertEquals(0.0, result.getReal(), 1e-6);
    }

    @Test
    public void testSqrt_negativeRealNegativeImaginary_indicatorNegative() {
        Complex c = new Complex(-4.0, -1.0);
        Complex result = c.sqrt();
        assertFalse(result.isNaN());
    }

    // ---------- sqrt1z() ----------
    @Test
    public void testSqrt1z_normalValue_returnsResult() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.sqrt1z();
        assertFalse(result.isNaN());
    }

    @Test
    public void testSqrt1z_isNaN_returnsNaN() {
        Complex result = nan.sqrt1z();
        assertTrue(result.isNaN());
    }

    // ---------- tan() ----------
    @Test
    public void testTan_normalValue_returnsResult() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.tan();
        assertFalse(result.isNaN());
    }

    @Test
    public void testTan_isNaN_returnsNaN() {
        Complex result = nan.tan();
        assertTrue(result.isNaN());
    }

    @Test
    public void testTan_zero_returnsZero() {
        Complex result = zero.tan();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    // ---------- tanh() ----------
    @Test
    public void testTanh_normalValue_returnsResult() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.tanh();
        assertFalse(result.isNaN());
    }

    @Test
    public void testTanh_isNaN_returnsNaN() {
        Complex result = nan.tanh();
        assertTrue(result.isNaN());
    }

    @Test
    public void testTanh_zero_returnsZero() {
        Complex result = zero.tanh();
        assertEquals(0.0, result.getReal(), EPS);
        assertEquals(0.0, result.getImaginary(), EPS);
    }

    // ---------- Static constants ----------
    @Test
    public void testStaticConstants_valuesCorrect() {
        assertEquals(0.0, Complex.I.getReal(), EPS);
        assertEquals(1.0, Complex.I.getImaginary(), EPS);
        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
        assertEquals(1.0, Complex.ONE.getReal(), EPS);
        assertEquals(0.0, Complex.ONE.getImaginary(), EPS);
        assertEquals(0.0, Complex.ZERO.getReal(), EPS);
        assertEquals(0.0, Complex.ZERO.getImaginary(), EPS);
    }
}
