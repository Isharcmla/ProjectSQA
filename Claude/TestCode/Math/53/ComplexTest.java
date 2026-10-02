import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.List;

public class ComplexTest {

    private Complex oneOne;
    private Complex negativeOneZero;
    private Complex oneNegativeOne;
    private Complex oneInf;
    private Complex negInfOne;
    private Complex infInf;
    private Complex negInfNegInf;
    private Complex oneNaN;
    private Complex nanZero;
    private Complex zeroZero;

    @Before
    public void setUp() {
        oneOne = new Complex(1.0, 1.0);
        negativeOneZero = new Complex(-1.0, 0.0);
        oneNegativeOne = new Complex(1.0, -1.0);
        oneInf = new Complex(1.0, Double.POSITIVE_INFINITY);
        negInfOne = new Complex(Double.NEGATIVE_INFINITY, 1.0);
        infInf = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        negInfNegInf = new Complex(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        oneNaN = new Complex(1.0, Double.NaN);
        nanZero = new Complex(Double.NaN, 0.0);
        zeroZero = new Complex(0.0, 0.0);
    }

    // ---------- Constructor / basic getters ----------

    @Test
    public void testConstructor_normalValues_setsFields() {
        Complex z = new Complex(3.0, 4.0);
        assertEquals(3.0, z.getReal(), 1.0e-10);
        assertEquals(4.0, z.getImaginary(), 1.0e-10);
        assertFalse(z.isNaN());
        assertFalse(z.isInfinite());
    }

    @Test
    public void testConstructor_nanReal_isNaNTrue() {
        Complex z = new Complex(Double.NaN, 1.0);
        assertTrue(z.isNaN());
        assertFalse(z.isInfinite());
    }

    @Test
    public void testConstructor_nanImaginary_isNaNTrue() {
        Complex z = new Complex(1.0, Double.NaN);
        assertTrue(z.isNaN());
    }

    @Test
    public void testConstructor_infiniteReal_isInfiniteTrue() {
        Complex z = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertTrue(z.isInfinite());
        assertFalse(z.isNaN());
    }

    @Test
    public void testConstructor_infiniteImaginary_isInfiniteTrue() {
        Complex z = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertTrue(z.isInfinite());
    }

    @Test
    public void testConstructor_nanAndInfinite_isNaNTakesPrecedence() {
        Complex z = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        assertTrue(z.isNaN());
        assertFalse(z.isInfinite());
    }

    @Test
    public void testGetReal_normalValue_returnsReal() {
        Complex z = new Complex(5.5, 2.2);
        assertEquals(5.5, z.getReal(), 1.0e-10);
    }

    @Test
    public void testGetImaginary_normalValue_returnsImaginary() {
        Complex z = new Complex(5.5, 2.2);
        assertEquals(2.2, z.getImaginary(), 1.0e-10);
    }

    // ---------- abs() ----------

    @Test
    public void testAbs_normalValue_returnsCorrectAbs() {
        Complex z = new Complex(3.0, 4.0);
        assertEquals(5.0, z.abs(), 1.0e-10);
    }

    @Test
    public void testAbs_nan_returnsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
    }

    @Test
    public void testAbs_infinite_returnsPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 0);
    }

    @Test
    public void testAbs_realSmallerImaginaryZero_returnsAbsReal() {
        Complex z = new Complex(0.0, 0.0);
        assertEquals(0.0, z.abs(), 1.0e-10);
    }

    @Test
    public void testAbs_realZero_returnsAbsImaginary() {
        Complex z = new Complex(0.0, 5.0);
        assertEquals(5.0, z.abs(), 1.0e-10);
    }

    @Test
    public void testAbs_realSmallerThanImaginaryNonZero_computesSqrt() {
        Complex z = new Complex(1.0, 10.0);
        double expected = Math.sqrt(1.0 + 100.0);
        assertEquals(expected, z.abs(), 1.0e-9);
    }

    @Test
    public void testAbs_realGreaterOrEqualImaginaryNonZero_computesSqrt() {
        Complex z = new Complex(10.0, 1.0);
        double expected = Math.sqrt(100.0 + 1.0);
        assertEquals(expected, z.abs(), 1.0e-9);
    }

    // ---------- add ----------

    @Test
    public void testAdd_normalValues_returnsSum() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.add(b);
        assertEquals(4.0, result.getReal(), 1.0e-10);
        assertEquals(6.0, result.getImaginary(), 1.0e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_nullArgument_throwsNullArgumentException() {
        oneOne.add(null);
    }

    @Test
    public void testAdd_withNaN_returnsNaN() {
        Complex result = oneOne.add(Complex.NaN);
        assertTrue(result.isNaN());
    }

    // ---------- conjugate ----------

    @Test
    public void testConjugate_normalValue_returnsConjugate() {
        Complex z = new Complex(3.0, 4.0);
        Complex result = z.conjugate();
        assertEquals(3.0, result.getReal(), 1.0e-10);
        assertEquals(-4.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testConjugate_nan_returnsNaN() {
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    // ---------- divide ----------

    @Test
    public void testDivide_normalValues_returnsQuotient() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, -1.0);
        Complex result = a.divide(b);
        // (1+i)/(1-i) = i
        assertEquals(0.0, result.getReal(), 1.0e-9);
        assertEquals(1.0, result.getImaginary(), 1.0e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_nullArgument_throwsNullArgumentException() {
        oneOne.divide(null);
    }

    @Test
    public void testDivide_thisNaN_returnsNaN() {
        assertTrue(Complex.NaN.divide(oneOne).isNaN());
    }

    @Test
    public void testDivide_rhsNaN_returnsNaN() {
        assertTrue(oneOne.divide(Complex.NaN).isNaN());
    }

    @Test
    public void testDivide_byZero_returnsNaN() {
        Complex result = oneOne.divide(Complex.ZERO);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivide_bothInfinite_returnsNaN() {
        Complex result = Complex.INF.divide(Complex.INF);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivide_thisFiniteRhsInfinite_returnsZero() {
        Complex result = oneOne.divide(Complex.INF);
        assertEquals(Complex.ZERO, result);
    }

    @Test
    public void testDivide_absCLessThanAbsD_computesCorrectly() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(1.0, 2.0);
        Complex result = a.divide(b);
        // verify by multiplying back
        Complex check = result.multiply(b);
        assertEquals(a.getReal(), check.getReal(), 1.0e-9);
        assertEquals(a.getImaginary(), check.getImaginary(), 1.0e-9);
    }

    @Test
    public void testDivide_absCGreaterOrEqualAbsD_computesCorrectly() {
        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(2.0, 1.0);
        Complex result = a.divide(b);
        Complex check = result.multiply(b);
        assertEquals(a.getReal(), check.getReal(), 1.0e-9);
        assertEquals(a.getImaginary(), check.getImaginary(), 1.0e-9);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(oneOne.equals(oneOne));
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
        Complex b = new Complex(1.0, 3.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_bothNaN_returnsTrue() {
        Complex a = new Complex(Double.NaN, 1.0);
        Complex b = new Complex(2.0, Double.NaN);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_thisNaNOtherNot_returnsFalse() {
        Complex a = new Complex(Double.NaN, 1.0);
        Complex b = new Complex(1.0, 1.0);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_notComplexInstance_returnsFalse() {
        assertFalse(oneOne.equals("not a complex"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(oneOne.equals(null));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_nan_returnsSeven() {
        assertEquals(7, Complex.NaN.hashCode());
        assertEquals(7, oneNaN.hashCode());
    }

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------- isNaN / isInfinite ----------

    @Test
    public void testIsNaN_nanValue_returnsTrue() {
        assertTrue(Complex.NaN.isNaN());
    }

    @Test
    public void testIsNaN_normalValue_returnsFalse() {
        assertFalse(oneOne.isNaN());
    }

    @Test
    public void testIsInfinite_infiniteValue_returnsTrue() {
        assertTrue(Complex.INF.isInfinite());
    }

    @Test
    public void testIsInfinite_normalValue_returnsFalse() {
        assertFalse(oneOne.isInfinite());
    }

    // ---------- multiply(Complex) ----------

    @Test
    public void testMultiplyComplex_normalValues_returnsProduct() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.multiply(b);
        assertEquals(-5.0, result.getReal(), 1.0e-10);
        assertEquals(10.0, result.getImaginary(), 1.0e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplex_nullArgument_throwsNullArgumentException() {
        oneOne.multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplex_thisNaN_returnsNaN() {
        assertTrue(Complex.NaN.multiply(oneOne).isNaN());
    }

    @Test
    public void testMultiplyComplex_rhsNaN_returnsNaN() {
        assertTrue(oneOne.multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testMultiplyComplex_thisInfinite_returnsInf() {
        Complex result = Complex.INF.multiply(oneOne);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiplyComplex_rhsInfinite_returnsInf() {
        Complex result = oneOne.multiply(Complex.INF);
        assertEquals(Complex.INF, result);
    }

    // ---------- multiply(double) ----------

    @Test
    public void testMultiplyDouble_normalValue_returnsProduct() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.multiply(3.0);
        assertEquals(3.0, result.getReal(), 1.0e-10);
        assertEquals(6.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testMultiplyDouble_thisNaN_returnsNaN() {
        assertTrue(Complex.NaN.multiply(2.0).isNaN());
    }

    @Test
    public void testMultiplyDouble_scalarNaN_returnsNaN() {
        assertTrue(oneOne.multiply(Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyDouble_thisInfinite_returnsInf() {
        Complex result = Complex.INF.multiply(2.0);
        assertEquals(Complex.INF, result);
    }

    @Test
    public void testMultiplyDouble_scalarInfinite_returnsInf() {
        Complex result = oneOne.multiply(Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, result);
    }

    // ---------- negate ----------

    @Test
    public void testNegate_normalValue_returnsNegation() {
        Complex z = new Complex(3.0, 4.0);
        Complex result = z.negate();
        assertEquals(-3.0, result.getReal(), 1.0e-10);
        assertEquals(-4.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testNegate_nan_returnsNaN() {
        assertTrue(Complex.NaN.negate().isNaN());
    }

    // ---------- subtract ----------

    @Test
    public void testSubtract_normalValues_returnsDifference() {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.subtract(b);
        assertEquals(2.0, result.getReal(), 1.0e-10);
        assertEquals(2.0, result.getImaginary(), 1.0e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_nullArgument_throwsNullArgumentException() {
        oneOne.subtract(null);
    }

    @Test
    public void testSubtract_thisNaN_returnsNaN() {
        assertTrue(Complex.NaN.subtract(oneOne).isNaN());
    }

    @Test
    public void testSubtract_rhsNaN_returnsNaN() {
        assertTrue(oneOne.subtract(Complex.NaN).isNaN());
    }

    // ---------- acos ----------

    @Test
    public void testAcos_normalValue_returnsExpected() {
        Complex z = new Complex(1.0, 1.0);
        Complex result = z.acos();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAcos_nan_returnsNaN() {
        assertTrue(Complex.NaN.acos().isNaN());
    }

    // ---------- asin ----------

    @Test
    public void testAsin_normalValue_returnsExpected() {
        Complex z = new Complex(0.5, 0.5);
        Complex result = z.asin();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAsin_nan_returnsNaN() {
        assertTrue(Complex.NaN.asin().isNaN());
    }

    // ---------- atan ----------

    @Test
    public void testAtan_normalValue_returnsExpected() {
        Complex z = new Complex(0.5, 0.5);
        Complex result = z.atan();
        assertFalse(result.isNaN());
    }

    @Test
    public void testAtan_nan_returnsNaN() {
        assertTrue(Complex.NaN.atan().isNaN());
    }

    // ---------- cos ----------

    @Test
    public void testCos_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.cos();
        assertEquals(1.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testCos_nan_returnsNaN() {
        assertTrue(Complex.NaN.cos().isNaN());
    }

    // ---------- cosh ----------

    @Test
    public void testCosh_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.cosh();
        assertEquals(1.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testCosh_nan_returnsNaN() {
        assertTrue(Complex.NaN.cosh().isNaN());
    }

    // ---------- exp ----------

    @Test
    public void testExp_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.exp();
        assertEquals(1.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testExp_nan_returnsNaN() {
        assertTrue(Complex.NaN.exp().isNaN());
    }

    // ---------- log ----------

    @Test
    public void testLog_normalValue_returnsExpected() {
        Complex z = new Complex(1.0, 0.0);
        Complex result = z.log();
        assertEquals(0.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testLog_nan_returnsNaN() {
        assertTrue(Complex.NaN.log().isNaN());
    }

    // ---------- pow ----------

    @Test
    public void testPow_normalValue_returnsExpected() {
        Complex base = new Complex(2.0, 0.0);
        Complex exponent = new Complex(2.0, 0.0);
        Complex result = base.pow(exponent);
        assertEquals(4.0, result.getReal(), 1.0e-9);
        assertEquals(0.0, result.getImaginary(), 1.0e-9);
    }

    @Test(expected = NullArgumentException.class)
    public void testPow_nullArgument_throwsNullArgumentException() {
        oneOne.pow(null);
    }

    @Test
    public void testPow_thisNaN_returnsNaN() {
        Complex result = Complex.NaN.pow(oneOne);
        assertTrue(result.isNaN());
    }

    // ---------- sin ----------

    @Test
    public void testSin_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.sin();
        assertEquals(0.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testSin_nan_returnsNaN() {
        assertTrue(Complex.NaN.sin().isNaN());
    }

    // ---------- sinh ----------

    @Test
    public void testSinh_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.sinh();
        assertEquals(0.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testSinh_nan_returnsNaN() {
        assertTrue(Complex.NaN.sinh().isNaN());
    }

    // ---------- sqrt ----------

    @Test
    public void testSqrt_normalValue_returnsExpected() {
        Complex z = new Complex(3.0, 4.0);
        Complex result = z.sqrt();
        Complex squared = result.multiply(result);
        assertEquals(z.getReal(), squared.getReal(), 1.0e-9);
        assertEquals(z.getImaginary(), squared.getImaginary(), 1.0e-9);
    }

    @Test
    public void testSqrt_zero_returnsZero() {
        Complex result = zeroZero.sqrt();
        assertEquals(0.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testSqrt_negativeReal_computesCorrectly() {
        Complex z = new Complex(-3.0, 4.0);
        Complex result = z.sqrt();
        Complex squared = result.multiply(result);
        assertEquals(z.getReal(), squared.getReal(), 1.0e-9);
        assertEquals(z.getImaginary(), squared.getImaginary(), 1.0e-9);
    }

    @Test
    public void testSqrt_nan_returnsNaN() {
        assertTrue(Complex.NaN.sqrt().isNaN());
    }

    // ---------- sqrt1z ----------

    @Test
    public void testSqrt1z_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.sqrt1z();
        assertEquals(1.0, result.getReal(), 1.0e-9);
        assertEquals(0.0, result.getImaginary(), 1.0e-9);
    }

    @Test
    public void testSqrt1z_nan_returnsNaN() {
        assertTrue(Complex.NaN.sqrt1z().isNaN());
    }

    // ---------- tan ----------

    @Test
    public void testTan_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.tan();
        assertEquals(0.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testTan_nan_returnsNaN() {
        assertTrue(Complex.NaN.tan().isNaN());
    }

    // ---------- tanh ----------

    @Test
    public void testTanh_normalValue_returnsExpected() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.tanh();
        assertEquals(0.0, result.getReal(), 1.0e-10);
        assertEquals(0.0, result.getImaginary(), 1.0e-10);
    }

    @Test
    public void testTanh_nan_returnsNaN() {
        assertTrue(Complex.NaN.tanh().isNaN());
    }

    // ---------- getArgument ----------

    @Test
    public void testGetArgument_normalValue_returnsExpected() {
        Complex z = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4.0, z.getArgument(), 1.0e-10);
    }

    @Test
    public void testGetArgument_zero_returnsZero() {
        assertEquals(0.0, zeroZero.getArgument(), 1.0e-10);
    }

    @Test
    public void testGetArgument_nan_returnsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    // ---------- nthRoot ----------

    @Test
    public void testNthRoot_normalValue_returnsCorrectNumberOfRoots() {
        Complex z = new Complex(1.0, 0.0);
        List<Complex> roots = z.nthRoot(4);
        assertEquals(4, roots.size());
        for (Complex root : roots) {
            Complex check = root.multiply(root).multiply(root).multiply(root);
            assertEquals(z.getReal(), check.getReal(), 1.0e-9);
            assertEquals(z.getImaginary(), check.getImaginary(), 1.0e-9);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNthRoot_zeroN_throwsIllegalArgumentException() {
        oneOne.nthRoot(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNthRoot_negativeN_throwsIllegalArgumentException() {
        oneOne.nthRoot(-1);
    }

    @Test
    public void testNthRoot_nan_returnsSingleNaNElement() {
        List<Complex> roots = Complex.NaN.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_infinite_returnsSingleInfElement() {
        List<Complex> roots = Complex.INF.nthRoot(2);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    // ---------- getField ----------

    @Test
    public void testGetField_returnsComplexField() {
        assertNotNull(oneOne.getField());
    }

    // ---------- toString ----------

    @Test
    public void testToString_normalValue_returnsFormattedString() {
        Complex z = new Complex(1.0, 2.0);
        String s = z.toString();
        assertTrue(s.contains("1.0"));
        assertTrue(s.contains("2.0"));
    }

    // ---------- Static constants sanity ----------

    @Test
    public void testStaticConstants_valuesAreCorrect() {
        assertEquals(0.0, Complex.I.getReal(), 0);
        assertEquals(1.0, Complex.I.getImaginary(), 0);
        assertTrue(Complex.NaN.isNaN());
        assertTrue(Complex.INF.isInfinite());
        assertEquals(1.0, Complex.ONE.getReal(), 0);
        assertEquals(0.0, Complex.ONE.getImaginary(), 0);
        assertEquals(0.0, Complex.ZERO.getReal(), 0);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 0);
    }
}
