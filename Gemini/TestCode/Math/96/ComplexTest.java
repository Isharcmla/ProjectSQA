package org.apache.commons.math.complex;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstants() {
        Assert.assertEquals(0.0, Complex.I.getReal(), EPSILON);
        Assert.assertEquals(1.0, Complex.I.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.isNaN());
        Assert.assertTrue(Double.isNaN(Complex.NaN.getReal()));
        Assert.assertTrue(Double.isNaN(Complex.NaN.getImaginary()));

        Assert.assertTrue(Complex.INF.isInfinite());
        Assert.assertTrue(Double.isInfinite(Complex.INF.getReal()));
        Assert.assertTrue(Double.isInfinite(Complex.INF.getImaginary()));

        Assert.assertEquals(1.0, Complex.ONE.getReal(), EPSILON);
        Assert.assertEquals(0.0, Complex.ONE.getImaginary(), EPSILON);

        Assert.assertEquals(0.0, Complex.ZERO.getReal(), EPSILON);
        Assert.assertEquals(0.0, Complex.ZERO.getImaginary(), EPSILON);
    }

    @Test
    public void testConstructorAndGetters() {
        Complex c = new Complex(3.0, -4.0);
        Assert.assertEquals(3.0, c.getReal(), EPSILON);
        Assert.assertEquals(-4.0, c.getImaginary(), EPSILON);
    }

    @Test
    public void testIsNaN() {
        Assert.assertTrue(new Complex(Double.NaN, 0.0).isNaN());
        Assert.assertTrue(new Complex(0.0, Double.NaN).isNaN());
        Assert.assertTrue(new Complex(Double.NaN, Double.NaN).isNaN());
        Assert.assertFalse(new Complex(1.0, 2.0).isNaN());
        Assert.assertFalse(Complex.INF.isNaN());
    }

    @Test
    public void testIsInfinite() {
        Assert.assertTrue(new Complex(Double.POSITIVE_INFINITY, 0.0).isInfinite());
        Assert.assertTrue(new Complex(Double.NEGATIVE_INFINITY, 0.0).isInfinite());
        Assert.assertTrue(new Complex(0.0, Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertTrue(new Complex(0.0, Double.NEGATIVE_INFINITY).isInfinite());
        Assert.assertTrue(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertFalse(new Complex(Double.POSITIVE_INFINITY, Double.NaN).isInfinite());
        Assert.assertFalse(new Complex(Double.NaN, Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertFalse(new Complex(1.0, 2.0).isInfinite());
    }

    @Test
    public void testAbs() {
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.POSITIVE_INFINITY, 1.0).abs(), EPSILON);

        // |real| < |imaginary|
        Complex c1 = new Complex(3.0, 4.0);
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        // |real| >= |imaginary|
        Complex c2 = new Complex(4.0, 3.0);
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        // Zero case
        Assert.assertEquals(0.0, Complex.ZERO.abs(), EPSILON);
        Assert.assertEquals(0.0, new Complex(0.0, 0.0).abs(), EPSILON);
    }

    @Test
    public void testAdd() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.add(b);
        Assert.assertEquals(4.0, result.getReal(), EPSILON);
        Assert.assertEquals(6.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(a).isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_nullRhs_throwsException() {
        Complex.ONE.add(null);
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(3.0, -4.0);
        Complex conj = c.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPSILON);
        Assert.assertEquals(4.0, conj.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);

        // |c| < |d|
        Complex result1 = a.divide(b);
        Assert.assertEquals(0.44, result1.getReal(), EPSILON);
        Assert.assertEquals(0.08, result1.getImaginary(), EPSILON);

        // |c| >= |d|
        Complex c = new Complex(4.0, 3.0);
        Complex result2 = a.divide(c);
        Assert.assertEquals(0.4, result2.getReal(), EPSILON);
        Assert.assertEquals(0.2, result2.getImaginary(), EPSILON);

        // NaN cases
        Assert.assertTrue(Complex.NaN.divide(a).isNaN());
        Assert.assertTrue(a.divide(Complex.NaN).isNaN());

        // Divide by zero
        Assert.assertTrue(a.divide(Complex.ZERO).isNaN());
        Assert.assertTrue(a.divide(new Complex(0.0, 0.0)).isNaN());

        // Divide finite by infinite
        Complex divByInf = a.divide(Complex.INF);
        Assert.assertEquals(Complex.ZERO, divByInf);

        // Both infinite
        Complex infByInf = Complex.INF.divide(Complex.INF);
        Assert.assertTrue(infByInf.isNaN() || Double.isNaN(infByInf.getReal()) || Double.isNaN(infByInf.getImaginary()));
    }

    @Test(expected = NullPointerException.class)
    public void testDivide_nullRhs_throwsException() {
        Complex.ONE.divide(null);
    }

    @Test
    public void testMultiply() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.multiply(b);
        Assert.assertEquals(-5.0, result.getReal(), EPSILON);
        Assert.assertEquals(10.0, result.getImaginary(), EPSILON);

        // NaN cases
        Assert.assertTrue(Complex.NaN.multiply(a).isNaN());
        Assert.assertTrue(a.multiply(Complex.NaN).isNaN());

        // Infinite cases
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 1.0).multiply(a));
        Assert.assertEquals(Complex.INF, new Complex(1.0, Double.POSITIVE_INFINITY).multiply(a));
        Assert.assertEquals(Complex.INF, a.multiply(new Complex(Double.POSITIVE_INFINITY, 1.0)));
        Assert.assertEquals(Complex.INF, a.multiply(new Complex(1.0, Double.POSITIVE_INFINITY)));
    }

    @Test(expected = NullPointerException.class)
    public void testMultiply_nullRhs_throwsException() {
        Complex.ONE.multiply(null);
    }

    @Test
    public void testNegate() {
        Complex c = new Complex(1.0, -2.0);
        Complex result = c.negate();
        Assert.assertEquals(-1.0, result.getReal(), EPSILON);
        Assert.assertEquals(2.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testSubtract() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.subtract(b);
        Assert.assertEquals(-2.0, result.getReal(), EPSILON);
        Assert.assertEquals(-2.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(a).isNaN());
    }

    @Test(expected = NullPointerException.class)
    public void testSubtract_nullRhs_throwsException() {
        Complex.ONE.subtract(null);
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        Complex diffReal = new Complex(2.0, 2.0);
        Complex diffImag = new Complex(1.0, 3.0);

        Assert.assertTrue(a.equals(a));
        Assert.assertTrue(a.equals(b));
        Assert.assertEquals(a.hashCode(), b.hashCode());

        Assert.assertFalse(a.equals(null));
        Assert.assertFalse(a.equals("string"));
        Assert.assertFalse(a.equals(diffReal));
        Assert.assertFalse(a.equals(diffImag));

        Assert.assertTrue(Complex.NaN.equals(new Complex(Double.NaN, Double.NaN)));
        Assert.assertTrue(Complex.NaN.equals(new Complex(Double.NaN, 1.0)));
        Assert.assertTrue(new Complex(1.0, Double.NaN).equals(Complex.NaN));
        Assert.assertFalse(a.equals(Complex.NaN));
        Assert.assertFalse(Complex.NaN.equals(a));

        Assert.assertEquals(7, Complex.NaN.hashCode());
        Assert.assertEquals(7, new Complex(Double.NaN, 0.0).hashCode());
    }

    @Test
    public void testAcos() {
        Assert.assertTrue(Complex.NaN.acos().isNaN());
        Complex result = new Complex(0.5, 0.5).acos();
        Assert.assertFalse(result.isNaN());
    }

    @Test
    public void testAsin() {
        Assert.assertTrue(Complex.NaN.asin().isNaN());
        Complex result = new Complex(0.5, 0.5).asin();
        Assert.assertFalse(result.isNaN());
    }

    @Test
    public void testAtan() {
        Assert.assertTrue(Complex.NaN.atan().isNaN());
        Complex result = new Complex(0.5, 0.5).atan();
        Assert.assertFalse(result.isNaN());
    }

    @Test
    public void testCos() {
        Assert.assertTrue(Complex.NaN.cos().isNaN());
        Complex result = new Complex(1.0, 1.0).cos();
        Assert.assertEquals(Math.cos(1.0) * Math.cosh(1.0), result.getReal(), EPSILON);
        Assert.assertEquals(-Math.sin(1.0) * Math.sinh(1.0), result.getImaginary(), EPSILON);
    }

    @Test
    public void testCosh() {
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
        Complex result = new Complex(1.0, 1.0).cosh();
        Assert.assertEquals(Math.cosh(1.0) * Math.cos(1.0), result.getReal(), EPSILON);
        Assert.assertEquals(Math.sinh(1.0) * Math.sin(1.0), result.getImaginary(), EPSILON);
    }

    @Test
    public void testExp() {
        Assert.assertTrue(Complex.NaN.exp().isNaN());
        Complex result = new Complex(1.0, Math.PI).exp();
        Assert.assertEquals(-Math.E, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testLog() {
        Assert.assertTrue(Complex.NaN.log().isNaN());
        Complex result = Complex.ONE.log();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testPow() {
        Complex base = new Complex(2.0, 0.0);
        Complex exponent = new Complex(3.0, 0.0);
        Complex result = base.pow(exponent);
        Assert.assertEquals(8.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test(expected = NullPointerException.class)
    public void testPow_nullExponent_throwsException() {
        Complex.ONE.pow(null);
    }

    @Test
    public void testSin() {
        Assert.assertTrue(Complex.NaN.sin().isNaN());
        Complex result = new Complex(1.0, 1.0).sin();
        Assert.assertEquals(Math.sin(1.0) * Math.cosh(1.0), result.getReal(), EPSILON);
        Assert.assertEquals(Math.cos(1.0) * Math.sinh(1.0), result.getImaginary(), EPSILON);
    }

    @Test
    public void testSinh() {
        Assert.assertTrue(Complex.NaN.sinh().isNaN());
        Complex result = new Complex(1.0, 1.0).sinh();
        Assert.assertEquals(Math.sinh(1.0) * Math.cos(1.0), result.getReal(), EPSILON);
        Assert.assertEquals(Math.cosh(1.0) * Math.sin(1.0), result.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt() {
        Assert.assertTrue(Complex.NaN.sqrt().isNaN());

        // Zero
        Complex zeroSqrt = Complex.ZERO.sqrt();
        Assert.assertEquals(0.0, zeroSqrt.getReal(), EPSILON);
        Assert.assertEquals(0.0, zeroSqrt.getImaginary(), EPSILON);

        // real >= 0
        Complex posReal = new Complex(3.0, 4.0).sqrt();
        Assert.assertEquals(2.0, posReal.getReal(), EPSILON);
        Assert.assertEquals(1.0, posReal.getImaginary(), EPSILON);

        // real < 0, imaginary >= 0
        Complex negRealPosImag = new Complex(-3.0, 4.0).sqrt();
        Assert.assertEquals(1.0, negRealPosImag.getReal(), EPSILON);
        Assert.assertEquals(2.0, negRealPosImag.getImaginary(), EPSILON);

        // real < 0, imaginary < 0
        Complex negRealNegImag = new Complex(-3.0, -4.0).sqrt();
        Assert.assertEquals(1.0, negRealNegImag.getReal(), EPSILON);
        Assert.assertEquals(-2.0, negRealNegImag.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt1z() {
        Assert.assertTrue(Complex.NaN.sqrt1z().isNaN());
        Complex result = Complex.ZERO.sqrt1z();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testTan() {
        Assert.assertTrue(Complex.NaN.tan().isNaN());
        Complex result = new Complex(1.0, 1.0).tan();
        Assert.assertFalse(result.isNaN());
    }

    @Test
    public void testTanh() {
        Assert.assertTrue(Complex.NaN.tanh().isNaN());
        Complex result = new Complex(1.0, 1.0).tanh();
        Assert.assertFalse(result.isNaN());
    }

    @Test
    public void testCreateComplex() {
        Complex c = new Complex(1.0, 2.0);
        Complex created = c.createComplex(3.0, 4.0);
        Assert.assertEquals(3.0, created.getReal(), EPSILON);
        Assert.assertEquals(4.0, created.getImaginary(), EPSILON);
    }
}
