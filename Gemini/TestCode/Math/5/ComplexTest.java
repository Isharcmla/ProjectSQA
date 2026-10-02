package org.apache.commons.math3.complex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstructor_singleRealArg_createsCorrectComplex() {
        Complex c = new Complex(3.0);
        Assert.assertEquals(3.0, c.getReal(), EPSILON);
        Assert.assertEquals(0.0, c.getImaginary(), EPSILON);
        Assert.assertFalse(c.isNaN());
        Assert.assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructor_twoArgs_createsCorrectComplex() {
        Complex c = new Complex(3.0, 4.0);
        Assert.assertEquals(3.0, c.getReal(), EPSILON);
        Assert.assertEquals(4.0, c.getImaginary(), EPSILON);
        Assert.assertFalse(c.isNaN());
        Assert.assertFalse(c.isInfinite());
    }

    @Test
    public void testConstants_initialization_expectedValues() {
        Assert.assertEquals(new Complex(0.0, 1.0), Complex.I);
        Assert.assertTrue(Complex.NaN.isNaN());
        Assert.assertTrue(Complex.INF.isInfinite());
        Assert.assertEquals(new Complex(1.0, 0.0), Complex.ONE);
        Assert.assertEquals(new Complex(0.0, 0.0), Complex.ZERO);
    }

    @Test
    public void testAbs_normalValues_returnsCorrectMagnitude() {
        Complex c1 = new Complex(3.0, 4.0); // |real| < |imaginary|
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        Complex c2 = new Complex(4.0, 3.0); // |real| >= |imaginary|
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        Complex c3 = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, c3.abs(), EPSILON);

        Complex c4 = new Complex(5.0, 0.0);
        Assert.assertEquals(5.0, c4.abs(), EPSILON);

        Complex c5 = new Complex(0.0, 5.0);
        Assert.assertEquals(5.0, c5.abs(), EPSILON);
    }

    @Test
    public void testAbs_nanAndInfinite_returnsExpected() {
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));
        Assert.assertTrue(Double.isNaN(new Complex(0.0, Double.NaN).abs()));

        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.POSITIVE_INFINITY, 0.0).abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(0.0, Double.NEGATIVE_INFINITY).abs(), EPSILON);
    }

    @Test
    public void testAdd_complex_returnsCorrectSum() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex sum = c1.add(c2);
        Assert.assertEquals(4.0, sum.getReal(), EPSILON);
        Assert.assertEquals(6.0, sum.getImaginary(), EPSILON);

        Assert.assertTrue(c1.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(c1).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_nullComplex_throwsNullArgumentException() {
        Complex.ONE.add((Complex) null);
    }

    @Test
    public void testAdd_double_returnsCorrectSum() {
        Complex c = new Complex(1.0, 2.0);
        Complex sum = c.add(3.0);
        Assert.assertEquals(4.0, sum.getReal(), EPSILON);
        Assert.assertEquals(2.0, sum.getImaginary(), EPSILON);

        Assert.assertTrue(c.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(3.0).isNaN());
    }

    @Test
    public void testConjugate_normalAndEdgeCases_returnsExpected() {
        Complex c = new Complex(3.0, 4.0);
        Complex conj = c.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPSILON);
        Assert.assertEquals(-4.0, conj.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.conjugate().isNaN());

        Complex infConj = new Complex(1.0, Double.POSITIVE_INFINITY).conjugate();
        Assert.assertEquals(1.0, infConj.getReal(), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, infConj.getImaginary(), EPSILON);
    }

    @Test
    public void testDivide_complex_normalValues() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0); // |c| < |d|
        Complex res1 = c1.divide(c2);
        Assert.assertEquals(11.0 / 25.0, res1.getReal(), EPSILON);
        Assert.assertEquals(2.0 / 25.0, res1.getImaginary(), EPSILON);

        Complex c3 = new Complex(4.0, 3.0); // |c| >= |d|
        Complex res2 = c1.divide(c3);
        Assert.assertEquals(10.0 / 25.0, res2.getReal(), EPSILON);
        Assert.assertEquals(5.0 / 25.0, res2.getImaginary(), EPSILON);
    }

    @Test
    public void testDivide_complex_edgeCases() {
        Complex c = new Complex(1.0, 2.0);
        Assert.assertTrue(c.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(c).isNaN());
        Assert.assertTrue(c.divide(Complex.ZERO).isNaN());
        Assert.assertTrue(Complex.INF.divide(Complex.INF).isNaN());

        Assert.assertEquals(Complex.ZERO, c.divide(Complex.INF));
        Assert.assertTrue(Complex.INF.divide(c).isInfinite() || Complex.INF.divide(c).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_nullComplex_throwsNullArgumentException() {
        Complex.ONE.divide((Complex) null);
    }

    @Test
    public void testDivide_double_normalAndEdgeCases() {
        Complex c = new Complex(4.0, 6.0);
        Complex res = c.divide(2.0);
        Assert.assertEquals(2.0, res.getReal(), EPSILON);
        Assert.assertEquals(3.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(c.divide(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(2.0).isNaN());
        Assert.assertTrue(c.divide(0.0).isNaN());

        Assert.assertEquals(Complex.ZERO, c.divide(Double.POSITIVE_INFINITY));
        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    @Test
    public void testReciprocal_normalAndEdgeCases() {
        Complex c1 = new Complex(3.0, 4.0); // |real| < |imaginary|
        Complex rec1 = c1.reciprocal();
        Assert.assertEquals(3.0 / 25.0, rec1.getReal(), EPSILON);
        Assert.assertEquals(-4.0 / 25.0, rec1.getImaginary(), EPSILON);

        Complex c2 = new Complex(4.0, 3.0); // |real| >= |imaginary|
        Complex rec2 = c2.reciprocal();
        Assert.assertEquals(4.0 / 25.0, rec2.getReal(), EPSILON);
        Assert.assertEquals(-3.0 / 25.0, rec2.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.reciprocal().isNaN());
        Assert.assertTrue(Complex.ZERO.reciprocal().isNaN());
        Assert.assertEquals(Complex.ZERO, Complex.INF.reciprocal());
    }

    @Test
    public void testEqualsAndHashCode_variousCases() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(1.0, 3.0);
        Complex c4 = new Complex(2.0, 2.0);

        Assert.assertTrue(c1.equals(c1));
        Assert.assertTrue(c1.equals(c2));
        Assert.assertEquals(c1.hashCode(), c2.hashCode());

        Assert.assertFalse(c1.equals(null));
        Assert.assertFalse(c1.equals("string"));
        Assert.assertFalse(c1.equals(c3));
        Assert.assertFalse(c1.equals(c4));

        Complex nan1 = new Complex(Double.NaN, 1.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertFalse(c1.equals(nan1));
        Assert.assertEquals(7, Complex.NaN.hashCode());
        Assert.assertEquals(7, nan1.hashCode());
    }

    @Test
    public void testMultiply_complex_normalAndEdgeCases() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex prod = c1.multiply(c2);
        Assert.assertEquals(-5.0, prod.getReal(), EPSILON);
        Assert.assertEquals(10.0, prod.getImaginary(), EPSILON);

        Assert.assertTrue(c1.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(c1).isNaN());

        Assert.assertEquals(Complex.INF, c1.multiply(Complex.INF));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(c1));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0).multiply(c1));
        Assert.assertEquals(Complex.INF, new Complex(0, Double.POSITIVE_INFINITY).multiply(c1));
        Assert.assertEquals(Complex.INF, c1.multiply(new Complex(Double.POSITIVE_INFINITY, 0)));
        Assert.assertEquals(Complex.INF, c1.multiply(new Complex(0, Double.POSITIVE_INFINITY)));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_nullComplex_throwsNullArgumentException() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testMultiply_int_normalAndEdgeCases() {
        Complex c = new Complex(2.0, 3.0);
        Complex prod = c.multiply(2);
        Assert.assertEquals(4.0, prod.getReal(), EPSILON);
        Assert.assertEquals(6.0, prod.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.multiply(2).isNaN());
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(2));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0).multiply(2));
        Assert.assertEquals(Complex.INF, new Complex(0, Double.POSITIVE_INFINITY).multiply(2));
    }

    @Test
    public void testMultiply_double_normalAndEdgeCases() {
        Complex c = new Complex(2.0, 3.0);
        Complex prod = c.multiply(2.5);
        Assert.assertEquals(5.0, prod.getReal(), EPSILON);
        Assert.assertEquals(7.5, prod.getImaginary(), EPSILON);

        Assert.assertTrue(c.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(2.5).isNaN());
        Assert.assertEquals(Complex.INF, c.multiply(Double.POSITIVE_INFINITY));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(2.5));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0).multiply(2.5));
        Assert.assertEquals(Complex.INF, new Complex(0, Double.POSITIVE_INFINITY).multiply(2.5));
    }

    @Test
    public void testNegate_normalAndNaN() {
        Complex c = new Complex(1.0, -2.0);
        Complex neg = c.negate();
        Assert.assertEquals(-1.0, neg.getReal(), EPSILON);
        Assert.assertEquals(2.0, neg.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testSubtract_complex_normalAndEdgeCases() {
        Complex c1 = new Complex(5.0, 7.0);
        Complex c2 = new Complex(2.0, 3.0);
        Complex diff = c1.subtract(c2);
        Assert.assertEquals(3.0, diff.getReal(), EPSILON);
        Assert.assertEquals(4.0, diff.getImaginary(), EPSILON);

        Assert.assertTrue(c1.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(c1).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_nullComplex_throwsNullArgumentException() {
        Complex.ONE.subtract((Complex) null);
    }

    @Test
    public void testSubtract_double_normalAndEdgeCases() {
        Complex c = new Complex(5.0, 7.0);
        Complex diff = c.subtract(2.0);
        Assert.assertEquals(3.0, diff.getReal(), EPSILON);
        Assert.assertEquals(7.0, diff.getImaginary(), EPSILON);

        Assert.assertTrue(c.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(2.0).isNaN());
    }

    @Test
    public void testAcos_normalAndNaN() {
        Complex c = new Complex(0.5, 0.5);
        Complex acos = c.acos();
        Assert.assertFalse(acos.isNaN());

        Assert.assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAsin_normalAndNaN() {
        Complex c = new Complex(0.5, 0.5);
        Complex asin = c.asin();
        Assert.assertFalse(asin.isNaN());

        Assert.assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAtan_normalAndNaN() {
        Complex c = new Complex(0.5, 0.5);
        Complex atan = c.atan();
        Assert.assertFalse(atan.isNaN());

        Assert.assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testCos_normalAndNaN() {
        Complex c = new Complex(FastMath.PI / 3, 0.0);
        Complex cos = c.cos();
        Assert.assertEquals(0.5, cos.getReal(), EPSILON);
        Assert.assertEquals(0.0, cos.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.cos().isNaN());
    }

    @Test
    public void testCosh_normalAndNaN() {
        Complex c = new Complex(0.0, FastMath.PI / 3);
        Complex cosh = c.cosh();
        Assert.assertEquals(0.5, cosh.getReal(), EPSILON);
        Assert.assertEquals(0.0, cosh.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.cosh().isNaN());
    }

    @Test
    public void testExp_normalAndNaN() {
        Complex c = new Complex(0.0, FastMath.PI);
        Complex exp = c.exp();
        Assert.assertEquals(-1.0, exp.getReal(), EPSILON);
        Assert.assertEquals(0.0, exp.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.exp().isNaN());
    }

    @Test
    public void testLog_normalAndNaN() {
        Complex c = new Complex(-1.0, 0.0);
        Complex log = c.log();
        Assert.assertEquals(0.0, log.getReal(), EPSILON);
        Assert.assertEquals(FastMath.PI, log.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.log().isNaN());
    }

    @Test
    public void testPow_complex_normalAndEdgeCases() {
        Complex c = new Complex(2.0, 0.0);
        Complex exp = new Complex(3.0, 0.0);
        Complex pow = c.pow(exp);
        Assert.assertEquals(8.0, pow.getReal(), EPSILON);
        Assert.assertEquals(0.0, pow.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testPow_nullComplex_throwsNullArgumentException() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testPow_double_normalAndEdgeCases() {
        Complex c = new Complex(2.0, 0.0);
        Complex pow = c.pow(3.0);
        Assert.assertEquals(8.0, pow.getReal(), EPSILON);
        Assert.assertEquals(0.0, pow.getImaginary(), EPSILON);
    }

    @Test
    public void testSin_normalAndNaN() {
        Complex c = new Complex(FastMath.PI / 6, 0.0);
        Complex sin = c.sin();
        Assert.assertEquals(0.5, sin.getReal(), EPSILON);
        Assert.assertEquals(0.0, sin.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.sin().isNaN());
    }

    @Test
    public void testSinh_normalAndNaN() {
        Complex c = new Complex(0.0, FastMath.PI / 6);
        Complex sinh = c.sinh();
        Assert.assertEquals(0.0, sinh.getReal(), EPSILON);
        Assert.assertEquals(0.5, sinh.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.sinh().isNaN());
    }

    @Test
    public void testSqrt_variousBranches() {
        Complex zero = new Complex(0.0, 0.0);
        Assert.assertEquals(Complex.ZERO, zero.sqrt());

        Complex posReal = new Complex(4.0, 0.0); // real >= 0
        Complex sqrtPosReal = posReal.sqrt();
        Assert.assertEquals(2.0, sqrtPosReal.getReal(), EPSILON);
        Assert.assertEquals(0.0, sqrtPosReal.getImaginary(), EPSILON);

        Complex negRealPosImag = new Complex(-4.0, 3.0); // real < 0, imag > 0
        Complex sqrtNegRealPosImag = negRealPosImag.sqrt();
        Assert.assertTrue(sqrtNegRealPosImag.getReal() > 0);
        Assert.assertTrue(sqrtNegRealPosImag.getImaginary() > 0);

        Complex negRealNegImag = new Complex(-4.0, -3.0); // real < 0, imag < 0
        Complex sqrtNegRealNegImag = negRealNegImag.sqrt();
        Assert.assertTrue(sqrtNegRealNegImag.getReal() > 0);
        Assert.assertTrue(sqrtNegRealNegImag.getImaginary() < 0);

        Assert.assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt1z_normalAndNaN() {
        Complex c = new Complex(0.6, 0.8);
        Complex res = c.sqrt1z();
        Assert.assertFalse(res.isNaN());

        Assert.assertTrue(Complex.NaN.sqrt1z().isNaN());
    }

    @Test
    public void testTan_branches() {
        Assert.assertTrue(Complex.NaN.tan().isNaN());
        Assert.assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).tan().isNaN());

        Complex largePositiveImag = new Complex(1.0, 25.0);
        Assert.assertEquals(new Complex(0.0, 1.0), largePositiveImag.tan());

        Complex largeNegativeImag = new Complex(1.0, -25.0);
        Assert.assertEquals(new Complex(0.0, -1.0), largeNegativeImag.tan());

        Complex normal = new Complex(1.0, 1.0);
        Complex tanNormal = normal.tan();
        Assert.assertFalse(tanNormal.isNaN());
    }

    @Test
    public void testTanh_branches() {
        Assert.assertTrue(Complex.NaN.tanh().isNaN());
        Assert.assertTrue(new Complex(1.0, Double.POSITIVE_INFINITY).tanh().isNaN());

        Complex largePositiveReal = new Complex(25.0, 1.0);
        Assert.assertEquals(new Complex(1.0, 0.0), largePositiveReal.tanh());

        Complex largeNegativeReal = new Complex(-25.0, 1.0);
        Assert.assertEquals(new Complex(-1.0, 0.0), largeNegativeReal.tanh());

        Complex normal = new Complex(1.0, 1.0);
        Complex tanhNormal = normal.tanh();
        Assert.assertFalse(tanhNormal.isNaN());
    }

    @Test
    public void testGetArgument_normalAndNaN() {
        Complex c = new Complex(1.0, 1.0);
        Assert.assertEquals(FastMath.PI / 4, c.getArgument(), EPSILON);

        Assert.assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    @Test
    public void testNthRoot_normalInput_returnsCorrectRoots() {
        Complex c = new Complex(0.0, 8.0);
        List<Complex> roots = c.nthRoot(3);
        Assert.assertEquals(3, roots.size());
        for (Complex root : roots) {
            Complex pow3 = root.multiply(root).multiply(root);
            Assert.assertEquals(c.getReal(), pow3.getReal(), 1e-5);
            Assert.assertEquals(c.getImaginary(), pow3.getImaginary(), 1e-5);
        }
    }

    @Test
    public void testNthRoot_nanAndInfinite_returnsSingletonList() {
        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        List<Complex> infRoots = Complex.INF.nthRoot(2);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertTrue(infRoots.get(0).isInfinite());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_zeroN_throwsNotPositiveException() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_negativeN_throwsNotPositiveException() {
        Complex.ONE.nthRoot(-1);
    }

    @Test
    public void testValueOf_twoDoubles_returnsExpectedInstance() {
        Complex c = Complex.valueOf(1.0, 2.0);
        Assert.assertEquals(1.0, c.getReal(), EPSILON);
        Assert.assertEquals(2.0, c.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
        Assert.assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());
    }

    @Test
    public void testValueOf_singleDouble_returnsExpectedInstance() {
        Complex c = Complex.valueOf(3.5);
        Assert.assertEquals(3.5, c.getReal(), EPSILON);
        Assert.assertEquals(0.0, c.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());
    }

    @Test
    public void testGetField_returnsNonNullComplexField() {
        Assert.assertNotNull(Complex.ONE.getField());
        Assert.assertEquals(ComplexField.getInstance(), Complex.ONE.getField());
    }

    @Test
    public void testToString_formatsCorrectly() {
        Complex c = new Complex(1.5, -2.5);
        Assert.assertEquals("(1.5, -2.5)", c.toString());
    }

    @Test
    public void testSerialization_preservesStateAndTransientFields() throws Exception {
        Complex original = new Complex(3.0, 4.0);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Complex deserialized = (Complex) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.getReal(), deserialized.getReal(), EPSILON);
        Assert.assertEquals(original.getImaginary(), deserialized.getImaginary(), EPSILON);
        Assert.assertFalse(deserialized.isNaN());
        Assert.assertFalse(deserialized.isInfinite());
    }
}
