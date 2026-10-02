import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;

import java.util.List;

public class ComplexTest {

    private Complex one;
    private Complex two;
    private Complex negOne;
    private Complex negInfinity;
    private Complex infinity;
    private Complex infNegInf;
    private Complex infInf;
    private Complex negInfNegInf;
    private Complex negInfInf;
    private Complex nan;
    private Complex oneNaN;
    private Complex zeroInf;
    private Complex zeroNaN;
    private double inf = Double.POSITIVE_INFINITY;
    private double negInf = Double.NEGATIVE_INFINITY;
    private double nanD = Double.NaN;

    @Before
    public void setUp() {
        one = new Complex(1, 0);
        two = new Complex(2, 0);
        negOne = new Complex(-1, 0);
        infinity = new Complex(inf, inf);
        negInfinity = new Complex(negInf, negInf);
        infNegInf = new Complex(inf, negInf);
        infInf = new Complex(inf, inf);
        negInfNegInf = new Complex(negInf, negInf);
        negInfInf = new Complex(negInf, inf);
        nan = new Complex(nanD, nanD);
        oneNaN = new Complex(1, nanD);
        zeroInf = new Complex(0, inf);
        zeroNaN = new Complex(0, nanD);
    }

    // ---------- Constructor tests ----------
    @Test
    public void testConstructor_realOnly_imaginaryIsZero() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), 1e-10);
        assertEquals(0.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testConstructor_realAndImaginary_valuesSetCorrectly() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), 1e-10);
        assertEquals(4.0, c.getImaginary(), 1e-10);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructor_nanReal_isNaNTrue() {
        Complex c = new Complex(Double.NaN, 1.0);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructor_infiniteReal_isInfiniteTrue() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(c.isInfinite());
        assertFalse(c.isNaN());
    }

    @Test
    public void testConstructor_nanAndInfinite_isNaNTakesPrecedence() {
        Complex c = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    // ---------- abs() ----------
    @Test
    public void testAbs_normalValue_correctResult() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_NaN_returnsNaN() {
        assertTrue(Double.isNaN(nan.abs()));
    }

    @Test
    public void testAbs_infinite_returnsPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, infinity.abs(), 0);
    }

    @Test
    public void testAbs_imaginaryZeroWithLargerAbsReal_returnsAbsReal() {
        Complex c = new Complex(5.0, 0.0);
        assertEquals(5.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_realZeroWithLargerAbsImaginary_returnsAbsImaginary() {
        Complex c = new Complex(0.0, 5.0);
        assertEquals(5.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_realSmallerThanImaginary_computesCorrectly() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(Math.sqrt(5.0), c.abs(), 1e-10);
    }

    @Test
    public void testAbs_realGreaterOrEqualImaginary_computesCorrectly() {
        Complex c = new Complex(2.0, 1.0);
        assertEquals(Math.sqrt(5.0), c.abs(), 1e-10);
    }

    @Test
    public void testAbs_zero_returnsZero() {
        assertEquals(0.0, Complex.ZERO.abs(), 1e-10);
    }

    // ---------- add(Complex) ----------
    @Test
    public void testAddComplex_normalValues_correctSum() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex result = a.add(b);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testAddComplex_nullArgument_throwsNullArgumentException() {
        try {
            one.add((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddComplex_thisIsNaN_returnsNaN() {
        Complex result = nan.add(one);
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddComplex_addendIsNaN_returnsNaN() {
        Complex result = one.add(nan);
        assertTrue(result.isNaN());
    }

    // ---------- add(double) ----------
    @Test
    public void testAddDouble_normalValue_correctSum() {
        Complex a = new Complex(1, 2);
        Complex result = a.add(3.0);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(2.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testAddDouble_thisIsNaN_returnsNaN() {
        assertTrue(nan.add(1.0).isNaN());
    }

    @Test
    public void testAddDouble_addendIsNaN_returnsNaN() {
        assertTrue(one.add(Double.NaN).isNaN());
    }

    // ---------- conjugate() ----------
    @Test
    public void testConjugate_normalValue_negatesImaginary() {
        Complex c = new Complex(3, 4);
        Complex result = c.conjugate();
        assertEquals(3.0, result.getReal(), 1e-10);
        assertEquals(-4.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testConjugate_NaN_returnsNaN() {
        assertTrue(nan.conjugate().isNaN());
    }

    // ---------- divide(Complex) ----------
    @Test
    public void testDivideComplex_normalValues_correctResult() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex result = a.divide(b);
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testDivideComplex_nullArgument_throwsNullArgumentException() {
        try {
            one.divide((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDivideComplex_thisIsNaN_returnsNaN() {
        assertTrue(nan.divide(one).isNaN());
    }

    @Test
    public void testDivideComplex_divisorIsNaN_returnsNaN() {
        assertTrue(one.divide(nan).isNaN());
    }

    @Test
    public void testDivideComplex_divisorIsZero_returnsNaN() {
        assertTrue(one.divide(Complex.ZERO).isNaN());
    }

    @Test
    public void testDivideComplex_bothInfinite_returnsNaN() {
        Complex result = infinity.divide(infinity);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplex_thisFiniteDivisorInfinite_returnsZero() {
        Complex result = one.divide(infinity);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideComplex_absCLessThanAbsD_computesCorrectly() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 2);
        Complex result = a.divide(b);
        // (1+i)/(1+2i) = (1*1+1*2)/(1+4) + (1*1-1*2)i/5 = 3/5 - 1/5 i
        assertEquals(0.6, result.getReal(), 1e-9);
        assertEquals(-0.2, result.getImaginary(), 1e-9);
    }

    @Test
    public void testDivideComplex_absCGreaterOrEqualAbsD_computesCorrectly() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 1);
        Complex result = a.divide(b);
        assertEquals(0.6, result.getReal(), 1e-9);
        assertEquals(0.2, result.getImaginary(), 1e-9);
    }

    // ---------- divide(double) ----------
    @Test
    public void testDivideDouble_normalValue_correctResult() {
        Complex a = new Complex(4, 6);
        Complex result = a.divide(2.0);
        assertEquals(2.0, result.getReal(), 1e-10);
        assertEquals(3.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testDivideDouble_thisIsNaN_returnsNaN() {
        assertTrue(nan.divide(2.0).isNaN());
    }

    @Test
    public void testDivideDouble_divisorIsNaN_returnsNaN() {
        assertTrue(one.divide(Double.NaN).isNaN());
    }

    @Test
    public void testDivideDouble_divisorIsZero_returnsNaN() {
        assertTrue(one.divide(0.0).isNaN());
    }

    @Test
    public void testDivideDouble_divisorIsInfiniteThisFinite_returnsZero() {
        assertEquals(Complex.ZERO, one.divide(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testDivideDouble_divisorIsInfiniteThisInfinite_returnsNaN() {
        assertTrue(infinity.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    // ---------- reciprocal() ----------
    @Test
    public void testReciprocal_normalValue_correctResult() {
        Complex c = new Complex(1, 1);
        Complex result = c.reciprocal();
        assertEquals(0.5, result.getReal(), 1e-10);
        assertEquals(-0.5, result.getImaginary(), 1e-10);
    }

    @Test
    public void testReciprocal_NaN_returnsNaN() {
        assertTrue(nan.reciprocal().isNaN());
    }

    @Test
    public void testReciprocal_zero_returnsNaN() {
        assertTrue(Complex.ZERO.reciprocal().isNaN());
    }

    @Test
    public void testReciprocal_infinite_returnsZero() {
        assertEquals(Complex.ZERO, infinity.reciprocal());
    }

    @Test
    public void testReciprocal_realLessThanImaginary_computesCorrectly() {
        Complex c = new Complex(1, 2);
        Complex result = c.reciprocal();
        // 1/(1+2i) = (1-2i)/5
        assertEquals(0.2, result.getReal(), 1e-9);
        assertEquals(-0.4, result.getImaginary(), 1e-9);
    }

    @Test
    public void testReciprocal_realGreaterOrEqualImaginary_computesCorrectly() {
        Complex c = new Complex(2, 1);
        Complex result = c.reciprocal();
        assertEquals(0.4, result.getReal(), 1e-9);
        assertEquals(-0.2, result.getImaginary(), 1e-9);
    }

    // ---------- equals(Object) ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(one.equals(one));
    }

    @Test
    public void testEquals_equalValues_returnsTrue() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(1, 2);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(1, 3);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_otherIsNaN_thisIsNaN_returnsTrue() {
        assertTrue(nan.equals(oneNaN));
    }

    @Test
    public void testEquals_otherIsNaN_thisIsNotNaN_returnsFalse() {
        assertFalse(one.equals(nan));
    }

    @Test
    public void testEquals_notComplexInstance_returnsFalse() {
        assertFalse(one.equals("not a complex"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(one.equals(null));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_NaN_returnsSevenConstant() {
        assertEquals(7, nan.hashCode());
        assertEquals(7, oneNaN.hashCode());
    }

    @Test
    public void testHashCode_normalValue_consistentWithEquals() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(1, 2);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------- getImaginary(), getReal() ----------
    @Test
    public void testGetImaginary_returnsImaginaryPart() {
        Complex c = new Complex(3, 4);
        assertEquals(4.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testGetReal_returnsRealPart() {
        Complex c = new Complex(3, 4);
        assertEquals(3.0, c.getReal(), 1e-10);
    }

    // ---------- isNaN(), isInfinite() ----------
    @Test
    public void testIsNaN_trueCase() {
        assertTrue(nan.isNaN());
    }

    @Test
    public void testIsNaN_falseCase() {
        assertFalse(one.isNaN());
    }

    @Test
    public void testIsInfinite_trueCase() {
        assertTrue(infinity.isInfinite());
    }

    @Test
    public void testIsInfinite_falseCase() {
        assertFalse(one.isInfinite());
    }

    // ---------- multiply(Complex) ----------
    @Test
    public void testMultiplyComplex_normalValues_correctResult() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex result = a.multiply(b);
        assertEquals(-5.0, result.getReal(), 1e-10);
        assertEquals(10.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testMultiplyComplex_nullArgument_throwsNullArgumentException() {
        try {
            one.multiply((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMultiplyComplex_thisIsNaN_returnsNaN() {
        assertTrue(nan.multiply(one).isNaN());
    }

    @Test
    public void testMultiplyComplex_factorIsNaN_returnsNaN() {
        assertTrue(one.multiply(nan).isNaN());
    }

    @Test
    public void testMultiplyComplex_thisInfiniteFactorFinite_returnsInf() {
        Complex result = infinity.multiply(one);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiplyComplex_factorInfinite_returnsInf() {
        Complex result = one.multiply(infinity);
        assertEquals(Complex.INF, result);
    }

    // ---------- multiply(int) ----------
    @Test
    public void testMultiplyInt_normalValue_correctResult() {
        Complex c = new Complex(2, 3);
        Complex result = c.multiply(2);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testMultiplyInt_thisIsNaN_returnsNaN() {
        assertTrue(nan.multiply(3).isNaN());
    }

    @Test
    public void testMultiplyInt_thisIsInfinite_returnsInf() {
        assertEquals(Complex.INF, infinity.multiply(2));
    }

    // ---------- multiply(double) ----------
    @Test
    public void testMultiplyDouble_normalValue_correctResult() {
        Complex c = new Complex(2, 3);
        Complex result = c.multiply(2.0);
        assertEquals(4.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testMultiplyDouble_thisIsNaN_returnsNaN() {
        assertTrue(nan.multiply(2.0).isNaN());
    }

    @Test
    public void testMultiplyDouble_factorIsNaN_returnsNaN() {
        assertTrue(one.multiply(Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyDouble_thisInfinite_returnsInf() {
        assertEquals(Complex.INF, infinity.multiply(2.0));
    }

    @Test
    public void testMultiplyDouble_factorInfinite_returnsInf() {
        assertEquals(Complex.INF, one.multiply(Double.POSITIVE_INFINITY));
    }

    // ---------- negate() ----------
    @Test
    public void testNegate_normalValue_correctResult() {
        Complex c = new Complex(3, -4);
        Complex result = c.negate();
        assertEquals(-3.0, result.getReal(), 1e-10);
        assertEquals(4.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testNegate_NaN_returnsNaN() {
        assertTrue(nan.negate().isNaN());
    }

    // ---------- subtract(Complex) ----------
    @Test
    public void testSubtractComplex_normalValues_correctResult() {
        Complex a = new Complex(5, 6);
        Complex b = new Complex(2, 3);
        Complex result = a.subtract(b);
        assertEquals(3.0, result.getReal(), 1e-10);
        assertEquals(3.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSubtractComplex_nullArgument_throwsNullArgumentException() {
        try {
            one.subtract((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSubtractComplex_thisIsNaN_returnsNaN() {
        assertTrue(nan.subtract(one).isNaN());
    }

    @Test
    public void testSubtractComplex_subtrahendIsNaN_returnsNaN() {
        assertTrue(one.subtract(nan).isNaN());
    }

    // ---------- subtract(double) ----------
    @Test
    public void testSubtractDouble_normalValue_correctResult() {
        Complex a = new Complex(5, 6);
        Complex result = a.subtract(2.0);
        assertEquals(3.0, result.getReal(), 1e-10);
        assertEquals(6.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSubtractDouble_thisIsNaN_returnsNaN() {
        assertTrue(nan.subtract(2.0).isNaN());
    }

    @Test
    public void testSubtractDouble_subtrahendIsNaN_returnsNaN() {
        assertTrue(one.subtract(Double.NaN).isNaN());
    }

    // ---------- acos() ----------
    @Test
    public void testAcos_normalValue_doesNotThrow() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.acos();
        assertNotNull(result);
    }

    @Test
    public void testAcos_NaN_returnsNaN() {
        assertTrue(nan.acos().isNaN());
    }

    // ---------- asin() ----------
    @Test
    public void testAsin_normalValue_doesNotThrow() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.asin();
        assertNotNull(result);
    }

    @Test
    public void testAsin_NaN_returnsNaN() {
        assertTrue(nan.asin().isNaN());
    }

    // ---------- atan() ----------
    @Test
    public void testAtan_normalValue_doesNotThrow() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.atan();
        assertNotNull(result);
    }

    @Test
    public void testAtan_NaN_returnsNaN() {
        assertTrue(nan.atan().isNaN());
    }

    // ---------- cos() ----------
    @Test
    public void testCos_normalValue_correctResult() {
        Complex c = new Complex(0, 0);
        Complex result = c.cos();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testCos_NaN_returnsNaN() {
        assertTrue(nan.cos().isNaN());
    }

    // ---------- cosh() ----------
    @Test
    public void testCosh_normalValue_correctResult() {
        Complex c = new Complex(0, 0);
        Complex result = c.cosh();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testCosh_NaN_returnsNaN() {
        assertTrue(nan.cosh().isNaN());
    }

    // ---------- exp() ----------
    @Test
    public void testExp_normalValue_correctResult() {
        Complex c = new Complex(0, 0);
        Complex result = c.exp();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testExp_NaN_returnsNaN() {
        assertTrue(nan.exp().isNaN());
    }

    // ---------- log() ----------
    @Test
    public void testLog_normalValue_correctResult() {
        Complex c = new Complex(1, 0);
        Complex result = c.log();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testLog_NaN_returnsNaN() {
        assertTrue(nan.log().isNaN());
    }

    // ---------- pow(Complex) ----------
    @Test
    public void testPowComplex_normalValue_doesNotThrow() {
        Complex base = new Complex(2, 0);
        Complex exponent = new Complex(2, 0);
        Complex result = base.pow(exponent);
        assertNotNull(result);
        assertEquals(4.0, result.getReal(), 1e-6);
    }

    @Test
    public void testPowComplex_nullArgument_throwsNullArgumentException() {
        try {
            one.pow((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    // ---------- pow(double) ----------
    @Test
    public void testPowDouble_normalValue_correctResult() {
        Complex base = new Complex(2, 0);
        Complex result = base.pow(2.0);
        assertEquals(4.0, result.getReal(), 1e-6);
    }

    // ---------- sin() ----------
    @Test
    public void testSin_normalValue_correctResult() {
        Complex c = new Complex(0, 0);
        Complex result = c.sin();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSin_NaN_returnsNaN() {
        assertTrue(nan.sin().isNaN());
    }

    // ---------- sinh() ----------
    @Test
    public void testSinh_normalValue_correctResult() {
        Complex c = new Complex(0, 0);
        Complex result = c.sinh();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSinh_NaN_returnsNaN() {
        assertTrue(nan.sinh().isNaN());
    }

    // ---------- sqrt() ----------
    @Test
    public void testSqrt_normalValue_correctResult() {
        Complex c = new Complex(4, 0);
        Complex result = c.sqrt();
        assertEquals(2.0, result.getReal(), 1e-9);
        assertEquals(0.0, result.getImaginary(), 1e-9);
    }

    @Test
    public void testSqrt_NaN_returnsNaN() {
        assertTrue(nan.sqrt().isNaN());
    }

    @Test
    public void testSqrt_zero_returnsZero() {
        Complex result = Complex.ZERO.sqrt();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSqrt_negativeReal_correctResult() {
        Complex c = new Complex(-4, 0);
        Complex result = c.sqrt();
        assertEquals(0.0, result.getReal(), 1e-9);
        assertEquals(2.0, result.getImaginary(), 1e-9);
    }

    @Test
    public void testSqrt_negativeRealNegativeImaginary_correctSign() {
        Complex c = new Complex(-4, -1);
        Complex result = c.sqrt();
        assertTrue(result.getImaginary() < 0);
    }

    // ---------- sqrt1z() ----------
    @Test
    public void testSqrt1z_normalValue_doesNotThrow() {
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.sqrt1z();
        assertNotNull(result);
    }

    // ---------- tan() ----------
    @Test
    public void testTan_normalValue_correctResult() {
        Complex c = new Complex(0, 0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testTan_NaN_returnsNaN() {
        assertTrue(nan.tan().isNaN());
    }

    @Test
    public void testTan_infiniteReal_returnsNaN() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(c.tan().isNaN());
    }

    @Test
    public void testTan_imaginaryGreaterThan20_returnsI() {
        Complex c = new Complex(1.0, 21.0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(1.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testTan_imaginaryLessThanNeg20_returnsNegativeI() {
        Complex c = new Complex(1.0, -21.0);
        Complex result = c.tan();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(-1.0, result.getImaginary(), 1e-10);
    }

    // ---------- tanh() ----------
    @Test
    public void testTanh_normalValue_correctResult() {
        Complex c = new Complex(0, 0);
        Complex result = c.tanh();
        assertEquals(0.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testTanh_NaN_returnsNaN() {
        assertTrue(nan.tanh().isNaN());
    }

    @Test
    public void testTanh_infiniteImaginary_returnsNaN() {
        Complex c = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertTrue(c.tanh().isNaN());
    }

    @Test
    public void testTanh_realGreaterThan20_returnsOne() {
        Complex c = new Complex(21.0, 1.0);
        Complex result = c.tanh();
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testTanh_realLessThanNeg20_returnsNegativeOne() {
        Complex c = new Complex(-21.0, 1.0);
        Complex result = c.tanh();
        assertEquals(-1.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    // ---------- getArgument() ----------
    @Test
    public void testGetArgument_normalValue_correctResult() {
        Complex c = new Complex(1, 1);
        assertEquals(Math.PI / 4, c.getArgument(), 1e-10);
    }

    @Test
    public void testGetArgument_NaN_returnsNaN() {
        assertTrue(Double.isNaN(nan.getArgument()));
    }

    // ---------- nthRoot(int) ----------
    @Test
    public void testNthRoot_normalValue_correctNumberOfRoots() {
        Complex c = new Complex(1, 0);
        List<Complex> roots = c.nthRoot(4);
        assertEquals(4, roots.size());
    }

    @Test
    public void testNthRoot_nonPositiveN_throwsNotPositiveException() {
        try {
            one.nthRoot(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testNthRoot_negativeN_throwsNotPositiveException() {
        try {
            one.nthRoot(-2);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testNthRoot_NaN_returnsListWithSingleNaN() {
        List<Complex> roots = nan.nthRoot(3);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_infinite_returnsListWithSingleInf() {
        List<Complex> roots = infinity.nthRoot(3);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    // ---------- valueOf(double, double) ----------
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

    // ---------- valueOf(double) ----------
    @Test
    public void testValueOfOneArg_normalValue_correctResult() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), 1e-10);
        assertEquals(0.0, c.getImaginary(), 1e-10);
    }

    @Test
    public void testValueOfOneArg_NaN_returnsNaN() {
        Complex c = Complex.valueOf(Double.NaN);
        assertTrue(c.isNaN());
    }

    // ---------- getField() ----------
    @Test
    public void testGetField_returnsComplexFieldInstance() {
        assertNotNull(one.getField());
    }

    // ---------- toString() ----------
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

    // ---------- Static constants sanity checks ----------
    @Test
    public void testStaticConstants_valuesAreCorrect() {
        assertEquals(0.0, Complex.I.getReal(), 1e-10);
        assertEquals(1.0, Complex.I.getImaginary(), 1e-10);
        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
        assertEquals(1.0, Complex.ONE.getReal(), 1e-10);
        assertEquals(0.0, Complex.ONE.getImaginary(), 1e-10);
        assertEquals(0.0, Complex.ZERO.getReal(), 1e-10);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 1e-10);
    }
}
