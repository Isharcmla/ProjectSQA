import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;

import java.util.List;

public class ComplexTest {

    private Complex x;
    private Complex y;

    @Before
    public void setUp() {
        x = new Complex(3.0, 4.0);
        y = new Complex(1.0, 2.0);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_realOnly_imaginaryZero() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), 0.0);
        assertEquals(0.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testConstructor_realAndImaginary_setsFields() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
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
    public void testConstructor_NaNAndInfinite_isNaNTakesPrecedence() {
        Complex c = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        assertTrue(c.isNaN());
        assertFalse(c.isInfinite());
    }

    // ---------- abs() ----------

    @Test
    public void testAbs_normalValue_returnsCorrectResult() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_isNaN_returnsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
    }

    @Test
    public void testAbs_isInfinite_returnsPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 0.0);
    }

    @Test
    public void testAbs_realZero_returnsAbsImaginary() {
        Complex c = new Complex(0.0, -5.0);
        assertEquals(5.0, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_imaginaryZero_realLessThanImaginary_returnsAbsReal() {
        // abs(real) < abs(imaginary) and imaginary == 0.0 is contradictory unless real also 0
        // test case where real smaller magnitude than imaginary, imaginary nonzero
        Complex c = new Complex(1.0, 2.0);
        double expected = Math.sqrt(1 + 4);
        assertEquals(expected, c.abs(), 1e-10);
    }

    @Test
    public void testAbs_imaginaryZeroExactly_withSmallReal() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), 0.0);
    }

    @Test
    public void testAbs_realGreaterThanImaginary_returnsCorrect() {
        Complex c = new Complex(5.0, 1.0);
        assertEquals(Math.sqrt(26), c.abs(), 1e-10);
    }

    // ---------- add ----------

    @Test
    public void testAddComplex_normalValues_returnsSum() {
        Complex result = x.add(y);
        assertEquals(4.0, result.getReal(), 0.0);
        assertEquals(6.0, result.getImaginary(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddComplex_null_throwsException() {
        x.add((Complex) null);
    }

    @Test
    public void testAddComplex_thisIsNaN_returnsNaN() {
        Complex result = Complex.NaN.add(y);
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddComplex_addendIsNaN_returnsNaN() {
        Complex result = x.add(Complex.NaN);
        assertTrue(result.isNaN());
    }

    @Test
    public void testAddDouble_normalValue_returnsSum() {
        Complex result = x.add(2.0);
        assertEquals(5.0, result.getReal(), 0.0);
        assertEquals(4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testAddDouble_thisIsNaN_returnsNaN() {
        assertTrue(Complex.NaN.add(2.0).isNaN());
    }

    @Test
    public void testAddDouble_addendIsNaN_returnsNaN() {
        assertTrue(x.add(Double.NaN).isNaN());
    }

    // ---------- conjugate ----------

    @Test
    public void testConjugate_normalValue_returnsConjugate() {
        Complex result = x.conjugate();
        assertEquals(3.0, result.getReal(), 0.0);
        assertEquals(-4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testConjugate_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    // ---------- divide(Complex) ----------

    @Test
    public void testDivideComplex_normalValues_returnsQuotient() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, 0.0);
        Complex result = a.divide(b);
        assertEquals(1.0, result.getReal(), 1e-10);
        assertEquals(1.0, result.getImaginary(), 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideComplex_null_throwsException() {
        x.divide((Complex) null);
    }

    @Test
    public void testDivideComplex_thisIsNaN_returnsNaN() {
        assertTrue(Complex.NaN.divide(y).isNaN());
    }

    @Test
    public void testDivideComplex_divisorIsNaN_returnsNaN() {
        assertTrue(x.divide(Complex.NaN).isNaN());
    }

    @Test
    public void testDivideComplex_divisorIsZero_returnsNaN() {
        assertTrue(x.divide(Complex.ZERO).isNaN());
    }

    @Test
    public void testDivideComplex_divisorInfiniteThisFinite_returnsZero() {
        Complex result = x.divide(Complex.INF);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideComplex_bothInfinite_returnsNaN() {
        assertTrue(Complex.INF.divide(Complex.INF).isNaN());
    }

    @Test
    public void testDivideComplex_absCLessThanAbsD_branch() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, 3.0);
        Complex result = a.divide(b);
        // verify no exception, result finite
        assertFalse(result.isNaN());
    }

    @Test
    public void testDivideComplex_absCGreaterOrEqualAbsD_branch() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(3.0, 1.0);
        Complex result = a.divide(b);
        assertFalse(result.isNaN());
    }

    // ---------- divide(double) ----------

    @Test
    public void testDivideDouble_normalValue_returnsQuotient() {
        Complex result = x.divide(2.0);
        assertEquals(1.5, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testDivideDouble_thisIsNaN_returnsNaN() {
        assertTrue(Complex.NaN.divide(2.0).isNaN());
    }

    @Test
    public void testDivideDouble_divisorIsNaN_returnsNaN() {
        assertTrue(x.divide(Double.NaN).isNaN());
    }

    @Test
    public void testDivideDouble_divisorIsZero_returnsNaN() {
        assertTrue(x.divide(0.0).isNaN());
    }

    @Test
    public void testDivideDouble_divisorInfiniteThisFinite_returnsZero() {
        Complex result = x.divide(Double.POSITIVE_INFINITY);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivideDouble_divisorInfiniteThisInfinite_returnsNaN() {
        assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(x.equals(x));
    }

    @Test
    public void testEquals_equalValues_returnsTrue() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        assertFalse(x.equals(y));
    }

    @Test
    public void testEquals_otherIsNaN_thisIsNaN_returnsTrue() {
        Complex a = new Complex(Double.NaN, 1.0);
        assertTrue(a.equals(Complex.NaN));
    }

    @Test
    public void testEquals_otherIsNaN_thisNotNaN_returnsFalse() {
        assertFalse(x.equals(Complex.NaN));
    }

    @Test
    public void testEquals_notComplexInstance_returnsFalse() {
        assertFalse(x.equals("not a complex"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(x.equals(null));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_isNaN_returnsSeven() {
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testHashCode_normalValue_consistentWithEquals() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------- getters ----------

    @Test
    public void testGetReal_returnsRealPart() {
        assertEquals(3.0, x.getReal(), 0.0);
    }

    @Test
    public void testGetImaginary_returnsImaginaryPart() {
        assertEquals(4.0, x.getImaginary(), 0.0);
    }

    @Test
    public void testIsNaN_trueCase() {
        assertTrue(Complex.NaN.isNaN());
    }

    @Test
    public void testIsNaN_falseCase() {
        assertFalse(x.isNaN());
    }

    @Test
    public void testIsInfinite_trueCase() {
        assertTrue(Complex.INF.isInfinite());
    }

    @Test
    public void testIsInfinite_falseCase() {
        assertFalse(x.isInfinite());
    }

    // ---------- multiply(Complex) ----------

    @Test
    public void testMultiplyComplex_normalValues_returnsProduct() {
        Complex result = x.multiply(y);
        // (3+4i)(1+2i) = 3 + 6i + 4i + 8i^2 = 3 - 8 + 10i = -5 + 10i
        assertEquals(-5.0, result.getReal(), 1e-10);
        assertEquals(10.0, result.getImaginary(), 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplex_null_throwsException() {
        x.multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplex_thisIsNaN_returnsNaN() {
        assertTrue(Complex.NaN.multiply(y).isNaN());
    }

    @Test
    public void testMultiplyComplex_factorIsNaN_returnsNaN() {
        assertTrue(x.multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testMultiplyComplex_thisInfinite_returnsInf() {
        assertEquals(Complex.INF, Complex.INF.multiply(y));
    }

    @Test
    public void testMultiplyComplex_factorInfinite_returnsInf() {
        assertEquals(Complex.INF, x.multiply(Complex.INF));
    }

    // ---------- multiply(double) ----------

    @Test
    public void testMultiplyDouble_normalValue_returnsProduct() {
        Complex result = x.multiply(2.0);
        assertEquals(6.0, result.getReal(), 0.0);
        assertEquals(8.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testMultiplyDouble_thisIsNaN_returnsNaN() {
        assertTrue(Complex.NaN.multiply(2.0).isNaN());
    }

    @Test
    public void testMultiplyDouble_factorIsNaN_returnsNaN() {
        assertTrue(x.multiply(Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyDouble_thisInfinite_returnsInf() {
        assertEquals(Complex.INF, Complex.INF.multiply(2.0));
    }

    @Test
    public void testMultiplyDouble_factorInfinite_returnsInf() {
        assertEquals(Complex.INF, x.multiply(Double.POSITIVE_INFINITY));
    }

    // ---------- negate ----------

    @Test
    public void testNegate_normalValue_returnsNegated() {
        Complex result = x.negate();
        assertEquals(-3.0, result.getReal(), 0.0);
        assertEquals(-4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testNegate_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.negate().isNaN());
    }

    // ---------- subtract(Complex) ----------

    @Test
    public void testSubtractComplex_normalValues_returnsDifference() {
        Complex result = x.subtract(y);
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(2.0, result.getImaginary(), 0.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplex_null_throwsException() {
        x.subtract((Complex) null);
    }

    @Test
    public void testSubtractComplex_thisIsNaN_returnsNaN() {
        assertTrue(Complex.NaN.subtract(y).isNaN());
    }

    @Test
    public void testSubtractComplex_subtrahendIsNaN_returnsNaN() {
        assertTrue(x.subtract(Complex.NaN).isNaN());
    }

    // ---------- subtract(double) ----------

    @Test
    public void testSubtractDouble_normalValue_returnsDifference() {
        Complex result = x.subtract(1.0);
        assertEquals(2.0, result.getReal(), 0.0);
        assertEquals(4.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSubtractDouble_thisIsNaN_returnsNaN() {
        assertTrue(Complex.NaN.subtract(1.0).isNaN());
    }

    @Test
    public void testSubtractDouble_subtrahendIsNaN_returnsNaN() {
        assertTrue(x.subtract(Double.NaN).isNaN());
    }

    // ---------- acos ----------

    @Test
    public void testAcos_normalValue_returnsResult() {
        Complex result = x.acos();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAcos_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.acos().isNaN());
    }

    // ---------- asin ----------

    @Test
    public void testAsin_normalValue_returnsResult() {
        Complex result = x.asin();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAsin_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.asin().isNaN());
    }

    // ---------- atan ----------

    @Test
    public void testAtan_normalValue_returnsResult() {
        Complex result = x.atan();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAtan_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.atan().isNaN());
    }

    // ---------- cos ----------

    @Test
    public void testCos_normalValue_returnsResult() {
        Complex result = x.cos();
        assertFalse(result.isNaN());
    }

    @Test
    public void testCos_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.cos().isNaN());
    }

    // ---------- cosh ----------

    @Test
    public void testCosh_normalValue_returnsResult() {
        Complex result = x.cosh();
        assertFalse(result.isNaN());
    }

    @Test
    public void testCosh_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.cosh().isNaN());
    }

    // ---------- exp ----------

    @Test
    public void testExp_normalValue_returnsResult() {
        Complex result = x.exp();
        assertFalse(result.isNaN());
    }

    @Test
    public void testExp_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.exp().isNaN());
    }

    // ---------- log ----------

    @Test
    public void testLog_normalValue_returnsResult() {
        Complex result = x.log();
        assertFalse(result.isNaN());
    }

    @Test
    public void testLog_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.log().isNaN());
    }

    // ---------- pow(Complex) ----------

    @Test
    public void testPowComplex_normalValue_returnsResult() {
        Complex result = x.pow(y);
        assertFalse(result.isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testPowComplex_null_throwsException() {
        x.pow((Complex) null);
    }

    // ---------- pow(double) ----------

    @Test
    public void testPowDouble_normalValue_returnsResult() {
        Complex result = x.pow(2.0);
        assertFalse(result.isNaN());
    }

    // ---------- sin ----------

    @Test
    public void testSin_normalValue_returnsResult() {
        Complex result = x.sin();
        assertFalse(result.isNaN());
    }

    @Test
    public void testSin_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.sin().isNaN());
    }

    // ---------- sinh ----------

    @Test
    public void testSinh_normalValue_returnsResult() {
        Complex result = x.sinh();
        assertFalse(result.isNaN());
    }

    @Test
    public void testSinh_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.sinh().isNaN());
    }

    // ---------- sqrt ----------

    @Test
    public void testSqrt_normalValuePositiveReal_returnsResult() {
        Complex c = new Complex(4.0, 0.0);
        Complex result = c.sqrt();
        assertEquals(2.0, result.getReal(), 1e-10);
        assertEquals(0.0, result.getImaginary(), 1e-10);
    }

    @Test
    public void testSqrt_negativeReal_returnsResult() {
        Complex c = new Complex(-4.0, 0.0);
        Complex result = c.sqrt();
        assertFalse(result.isNaN());
    }

    @Test
    public void testSqrt_zero_returnsZero() {
        Complex result = Complex.ZERO.sqrt();
        assertEquals(0.0, result.getReal(), 0.0);
        assertEquals(0.0, result.getImaginary(), 0.0);
    }

    @Test
    public void testSqrt_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.sqrt().isNaN());
    }

    // ---------- sqrt1z ----------

    @Test
    public void testSqrt1z_normalValue_returnsResult() {
        Complex result = x.sqrt1z();
        assertNotNull(result);
    }

    // ---------- tan ----------

    @Test
    public void testTan_normalValue_returnsResult() {
        Complex result = x.tan();
        assertFalse(result.isNaN());
    }

    @Test
    public void testTan_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.tan().isNaN());
    }

    // ---------- tanh ----------

    @Test
    public void testTanh_normalValue_returnsResult() {
        Complex result = x.tanh();
        assertFalse(result.isNaN());
    }

    @Test
    public void testTanh_isNaN_returnsNaN() {
        assertTrue(Complex.NaN.tanh().isNaN());
    }

    // ---------- getArgument ----------

    @Test
    public void testGetArgument_normalValue_returnsCorrectAngle() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4, c.getArgument(), 1e-10);
    }

    @Test
    public void testGetArgument_zero_returnsZero() {
        assertEquals(0.0, Complex.ZERO.getArgument(), 0.0);
    }

    @Test
    public void testGetArgument_withNaN_returnsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    // ---------- nthRoot ----------

    @Test
    public void testNthRoot_normalValue_returnsCorrectNumberOfRoots() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(3);
        assertEquals(3, roots.size());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_zeroN_throwsException() {
        x.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_negativeN_throwsException() {
        x.nthRoot(-1);
    }

    @Test
    public void testNthRoot_isNaN_returnsListWithNaN() {
        List<Complex> roots = Complex.NaN.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_isInfinite_returnsListWithInf() {
        List<Complex> roots = Complex.INF.nthRoot(2);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    // ---------- valueOf ----------

    @Test
    public void testValueOfTwoArgs_normalValues_returnsComplex() {
        Complex c = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testValueOfTwoArgs_realIsNaN_returnsNaN() {
        Complex c = Complex.valueOf(Double.NaN, 2.0);
        assertTrue(c.isNaN());
    }

    @Test
    public void testValueOfTwoArgs_imaginaryIsNaN_returnsNaN() {
        Complex c = Complex.valueOf(1.0, Double.NaN);
        assertTrue(c.isNaN());
    }

    @Test
    public void testValueOfOneArg_normalValue_returnsComplex() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), 0.0);
        assertEquals(0.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testValueOfOneArg_isNaN_returnsNaN() {
        Complex c = Complex.valueOf(Double.NaN);
        assertTrue(c.isNaN());
    }

    // ---------- getField ----------

    @Test
    public void testGetField_returnsComplexFieldInstance() {
        assertNotNull(x.getField());
    }

    // ---------- toString ----------

    @Test
    public void testToString_normalValue_returnsFormattedString() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals("(1.0, 2.0)", c.toString());
    }

    @Test
    public void testToString_negativeValues_returnsFormattedString() {
        Complex c = new Complex(-1.0, -2.0);
        assertEquals("(-1.0, -2.0)", c.toString());
    }

    // ---------- static constants sanity checks ----------

    @Test
    public void testStaticConstants_I_hasCorrectValues() {
        assertEquals(0.0, Complex.I.getReal(), 0.0);
        assertEquals(1.0, Complex.I.getImaginary(), 0.0);
    }

    @Test
    public void testStaticConstants_ONE_hasCorrectValues() {
        assertEquals(1.0, Complex.ONE.getReal(), 0.0);
        assertEquals(0.0, Complex.ONE.getImaginary(), 0.0);
    }

    @Test
    public void testStaticConstants_ZERO_hasCorrectValues() {
        assertEquals(0.0, Complex.ZERO.getReal(), 0.0);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 0.0);
    }

    @Test
    public void testStaticConstants_NaN_isNaNTrue() {
        assertTrue(Complex.NaN.isNaN());
    }

    @Test
    public void testStaticConstants_INF_isInfiniteTrue() {
        assertTrue(Complex.INF.isInfinite());
    }
}
