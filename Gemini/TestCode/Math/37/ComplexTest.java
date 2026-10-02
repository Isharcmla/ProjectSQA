package org.apache.commons.math.complex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstants() {
        Assert.assertEquals(0.0, Complex.I.getReal(), EPSILON);
        Assert.assertEquals(1.0, Complex.I.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.isNaN());
        Assert.assertTrue(Complex.INF.isInfinite());

        Assert.assertEquals(1.0, Complex.ONE.getReal(), EPSILON);
        Assert.assertEquals(0.0, Complex.ONE.getImaginary(), EPSILON);

        Assert.assertEquals(0.0, Complex.ZERO.getReal(), EPSILON);
        Assert.assertEquals(0.0, Complex.ZERO.getImaginary(), EPSILON);
    }

    @Test
    public void testConstructors() {
        Complex c1 = new Complex(3.0);
        Assert.assertEquals(3.0, c1.getReal(), EPSILON);
        Assert.assertEquals(0.0, c1.getImaginary(), EPSILON);
        Assert.assertFalse(c1.isNaN());
        Assert.assertFalse(c1.isInfinite());

        Complex c2 = new Complex(3.0, -4.0);
        Assert.assertEquals(3.0, c2.getReal(), EPSILON);
        Assert.assertEquals(-4.0, c2.getImaginary(), EPSILON);
        Assert.assertFalse(c2.isNaN());
        Assert.assertFalse(c2.isInfinite());

        Complex cNan = new Complex(Double.NaN, 1.0);
        Assert.assertTrue(cNan.isNaN());
        Assert.assertFalse(cNan.isInfinite());

        Complex cInf = new Complex(Double.POSITIVE_INFINITY, 0.0);
        Assert.assertFalse(cInf.isNaN());
        Assert.assertTrue(cInf.isInfinite());

        Complex cInf2 = new Complex(0.0, Double.NEGATIVE_INFINITY);
        Assert.assertFalse(cInf2.isNaN());
        Assert.assertTrue(cInf2.isInfinite());

        Complex cInfNan = new Complex(Double.POSITIVE_INFINITY, Double.NaN);
        Assert.assertTrue(cInfNan.isNaN());
        Assert.assertFalse(cInfNan.isInfinite());
    }

    @Test
    public void testAbs_normalCases() {
        Complex c1 = new Complex(3.0, 4.0);
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        Complex c2 = new Complex(4.0, 3.0);
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        Complex c3 = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, c3.abs(), EPSILON);

        Complex c4 = new Complex(0.0, 5.0);
        Assert.assertEquals(5.0, c4.abs(), EPSILON);

        Complex c5 = new Complex(5.0, 0.0);
        Assert.assertEquals(5.0, c5.abs(), EPSILON);
    }

    @Test
    public void testAbs_specialCases() {
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));
        Assert.assertTrue(Double.isNaN(new Complex(0.0, Double.NaN).abs()));

        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.POSITIVE_INFINITY, 1.0).abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(1.0, Double.NEGATIVE_INFINITY).abs(), EPSILON);
    }

    @Test
    public void testAdd_complex() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(5.0, 6.0);
        Complex z = x.add(y);
        Assert.assertEquals(8.0, z.getReal(), EPSILON);
        Assert.assertEquals(10.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(x.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(x).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_complexNull_throwsException() {
        Complex.ONE.add((Complex) null);
    }

    @Test
    public void testAdd_double() {
        Complex x = new Complex(3.0, 4.0);
        Complex z = x.add(5.0);
        Assert.assertEquals(8.0, z.getReal(), EPSILON);
        Assert.assertEquals(4.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(x.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(5.0).isNaN());
    }

    @Test
    public void testConjugate() {
        Complex x = new Complex(3.0, 4.0);
        Complex conj = x.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPSILON);
        Assert.assertEquals(-4.0, conj.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.conjugate().isNaN());

        Complex inf = new Complex(1.0, Double.POSITIVE_INFINITY);
        Complex conjInf = inf.conjugate();
        Assert.assertEquals(1.0, conjInf.getReal(), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, conjInf.getImaginary(), EPSILON);
    }

    @Test
    public void testDivide_complex() {
        Complex x = new Complex(3.0, 2.0);
        Complex y = new Complex(4.0, -3.0);
        Complex z = x.divide(y);
        Assert.assertEquals(6.0 / 25.0, z.getReal(), EPSILON);
        Assert.assertEquals(17.0 / 25.0, z.getImaginary(), EPSILON);

        Complex y2 = new Complex(-3.0, 4.0);
        Complex z2 = x.divide(y2);
        Assert.assertEquals(-1.0 / 25.0, z2.getReal(), EPSILON);
        Assert.assertEquals(-18.0 / 25.0, z2.getImaginary(), EPSILON);

        Assert.assertTrue(x.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(x).isNaN());
        Assert.assertTrue(x.divide(Complex.ZERO).isNaN());
        Assert.assertTrue(Complex.INF.divide(Complex.INF).isNaN());

        Assert.assertEquals(Complex.ZERO, x.divide(Complex.INF));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_complexNull_throwsException() {
        Complex.ONE.divide((Complex) null);
    }

    @Test
    public void testDivide_double() {
        Complex x = new Complex(3.0, 4.0);
        Complex z = x.divide(2.0);
        Assert.assertEquals(1.5, z.getReal(), EPSILON);
        Assert.assertEquals(2.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(x.divide(0.0).isNaN());
        Assert.assertTrue(x.divide(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(2.0).isNaN());

        Assert.assertEquals(Complex.ZERO, x.divide(Double.POSITIVE_INFINITY));
        Assert.assertEquals(Complex.ZERO, x.divide(Double.NEGATIVE_INFINITY));
        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    @Test
    public void testReciprocal() {
        Complex x = new Complex(3.0, 4.0);
        Complex r = x.reciprocal();
        Assert.assertEquals(3.0 / 25.0, r.getReal(), EPSILON);
        Assert.assertEquals(-4.0 / 25.0, r.getImaginary(), EPSILON);

        Complex x2 = new Complex(4.0, 3.0);
        Complex r2 = x2.reciprocal();
        Assert.assertEquals(4.0 / 25.0, r2.getReal(), EPSILON);
        Assert.assertEquals(-3.0 / 25.0, r2.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.ZERO.reciprocal().isNaN());
        Assert.assertTrue(Complex.NaN.reciprocal().isNaN());
        Assert.assertEquals(Complex.ZERO, Complex.INF.reciprocal());
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(1.0, 3.0);
        Complex c4 = new Complex(3.0, 2.0);

        Assert.assertTrue(c1.equals(c1));
        Assert.assertTrue(c1.equals(c2));
        Assert.assertEquals(c1.hashCode(), c2.hashCode());

        Assert.assertFalse(c1.equals(null));
        Assert.assertFalse(c1.equals("Not a Complex"));
        Assert.assertFalse(c1.equals(c3));
        Assert.assertFalse(c1.equals(c4));

        Complex nan1 = new Complex(Double.NaN, 0.0);
        Complex nan2 = new Complex(0.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertFalse(c1.equals(nan1));
        Assert.assertFalse(nan1.equals(c1));
        Assert.assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testMultiply_complex() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(-2.0, 5.0);
        Complex z = x.multiply(y);
        Assert.assertEquals(-26.0, z.getReal(), EPSILON);
        Assert.assertEquals(7.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(x.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(x).isNaN());

        Assert.assertEquals(Complex.INF, x.multiply(Complex.INF));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(x));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(Complex.INF));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_complexNull_throwsException() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testMultiply_int() {
        Complex x = new Complex(3.0, 4.0);
        Complex z = x.multiply(2);
        Assert.assertEquals(6.0, z.getReal(), EPSILON);
        Assert.assertEquals(8.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.multiply(2).isNaN());
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(2));
    }

    @Test
    public void testMultiply_double() {
        Complex x = new Complex(3.0, 4.0);
        Complex z = x.multiply(2.5);
        Assert.assertEquals(7.5, z.getReal(), EPSILON);
        Assert.assertEquals(10.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(x.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(2.5).isNaN());
        Assert.assertEquals(Complex.INF, x.multiply(Double.POSITIVE_INFINITY));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(2.5));
    }

    @Test
    public void testNegate() {
        Complex x = new Complex(3.0, -4.0);
        Complex z = x.negate();
        Assert.assertEquals(-3.0, z.getReal(), EPSILON);
        Assert.assertEquals(4.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testSubtract_complex() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(1.0, 2.0);
        Complex z = x.subtract(y);
        Assert.assertEquals(2.0, z.getReal(), EPSILON);
        Assert.assertEquals(2.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(x.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(x).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_complexNull_throwsException() {
        Complex.ONE.subtract((Complex) null);
    }

    @Test
    public void testSubtract_double() {
        Complex x = new Complex(3.0, 4.0);
        Complex z = x.subtract(2.0);
        Assert.assertEquals(1.0, z.getReal(), EPSILON);
        Assert.assertEquals(4.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(x.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(2.0).isNaN());
    }

    @Test
    public void testAcos() {
        Complex x = new Complex(0.5, 0.5);
        Complex z = x.acos();
        Assert.assertEquals(x, z.cos());
        Assert.assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAsin() {
        Complex x = new Complex(0.5, 0.5);
        Complex z = x.asin();
        Assert.assertEquals(x.getReal(), z.sin().getReal(), EPSILON);
        Assert.assertEquals(x.getImaginary(), z.sin().getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAtan() {
        Complex x = new Complex(0.5, 0.5);
        Complex z = x.atan();
        Assert.assertEquals(x.getReal(), z.tan().getReal(), EPSILON);
        Assert.assertEquals(x.getImaginary(), z.tan().getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testCos() {
        Complex x = new Complex(1.0, 1.0);
        Complex z = x.cos();
        Assert.assertEquals(FastMath.cos(1.0) * FastMath.cosh(1.0), z.getReal(), EPSILON);
        Assert.assertEquals(-FastMath.sin(1.0) * FastMath.sinh(1.0), z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.cos().isNaN());
    }

    @Test
    public void testCosh() {
        Complex x = new Complex(1.0, 1.0);
        Complex z = x.cosh();
        Assert.assertEquals(FastMath.cosh(1.0) * FastMath.cos(1.0), z.getReal(), EPSILON);
        Assert.assertEquals(FastMath.sinh(1.0) * FastMath.sin(1.0), z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
    }

    @Test
    public void testExp() {
        Complex x = new Complex(1.0, FastMath.PI);
        Complex z = x.exp();
        Assert.assertEquals(-FastMath.E, z.getReal(), EPSILON);
        Assert.assertEquals(0.0, z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.exp().isNaN());
    }

    @Test
    public void testLog() {
        Complex x = new Complex(1.0, 1.0);
        Complex z = x.log();
        Assert.assertEquals(FastMath.log(FastMath.sqrt(2.0)), z.getReal(), EPSILON);
        Assert.assertEquals(FastMath.PI / 4.0, z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.log().isNaN());
    }

    @Test
    public void testPow_complex() {
        Complex x = new Complex(2.0, 0.0);
        Complex y = new Complex(3.0, 0.0);
        Complex z = x.pow(y);
        Assert.assertEquals(8.0, z.getReal(), EPSILON);
        Assert.assertEquals(0.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.pow(y).isNaN());
        Assert.assertTrue(x.pow(Complex.NaN).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testPow_complexNull_throwsException() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testPow_double() {
        Complex x = new Complex(2.0, 0.0);
        Complex z = x.pow(3.0);
        Assert.assertEquals(8.0, z.getReal(), EPSILON);
        Assert.assertEquals(0.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.pow(3.0).isNaN());
    }

    @Test
    public void testSin() {
        Complex x = new Complex(1.0, 1.0);
        Complex z = x.sin();
        Assert.assertEquals(FastMath.sin(1.0) * FastMath.cosh(1.0), z.getReal(), EPSILON);
        Assert.assertEquals(FastMath.cos(1.0) * FastMath.sinh(1.0), z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.sin().isNaN());
    }

    @Test
    public void testSinh() {
        Complex x = new Complex(1.0, 1.0);
        Complex z = x.sinh();
        Assert.assertEquals(FastMath.sinh(1.0) * FastMath.cos(1.0), z.getReal(), EPSILON);
        Assert.assertEquals(FastMath.cosh(1.0) * FastMath.sin(1.0), z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.sinh().isNaN());
    }

    @Test
    public void testSqrt() {
        Complex zero = new Complex(0.0, 0.0);
        Complex sqrtZero = zero.sqrt();
        Assert.assertEquals(0.0, sqrtZero.getReal(), EPSILON);
        Assert.assertEquals(0.0, sqrtZero.getImaginary(), EPSILON);

        Complex posReal = new Complex(3.0, 4.0);
        Complex sqrtPosReal = posReal.sqrt();
        Assert.assertEquals(2.0, sqrtPosReal.getReal(), EPSILON);
        Assert.assertEquals(1.0, sqrtPosReal.getImaginary(), EPSILON);

        Complex negReal = new Complex(-3.0, 4.0);
        Complex sqrtNegReal = negReal.sqrt();
        Assert.assertEquals(1.0, sqrtNegReal.getReal(), EPSILON);
        Assert.assertEquals(2.0, sqrtNegReal.getImaginary(), EPSILON);

        Complex negRealNegImag = new Complex(-3.0, -4.0);
        Complex sqrtNegRealNegImag = negRealNegImag.sqrt();
        Assert.assertEquals(1.0, sqrtNegRealNegImag.getReal(), EPSILON);
        Assert.assertEquals(-2.0, sqrtNegRealNegImag.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt1z() {
        Complex x = new Complex(0.0, 0.0);
        Complex z = x.sqrt1z();
        Assert.assertEquals(1.0, z.getReal(), EPSILON);
        Assert.assertEquals(0.0, z.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.sqrt1z().isNaN());
    }

    @Test
    public void testTan() {
        Complex x = new Complex(1.0, 1.0);
        Complex z = x.tan();
        Complex expected = x.sin().divide(x.cos());
        Assert.assertEquals(expected.getReal(), z.getReal(), EPSILON);
        Assert.assertEquals(expected.getImaginary(), z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.tan().isNaN());
    }

    @Test
    public void testTanh() {
        Complex x = new Complex(1.0, 1.0);
        Complex z = x.tanh();
        Complex expected = x.sinh().divide(x.cosh());
        Assert.assertEquals(expected.getReal(), z.getReal(), EPSILON);
        Assert.assertEquals(expected.getImaginary(), z.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.tanh().isNaN());
    }

    @Test
    public void testGetArgument() {
        Complex x1 = new Complex(1.0, 1.0);
        Assert.assertEquals(FastMath.PI / 4.0, x1.getArgument(), EPSILON);

        Complex x2 = new Complex(-1.0, 0.0);
        Assert.assertEquals(FastMath.PI, x2.getArgument(), EPSILON);

        Assert.assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    @Test
    public void testNthRoot_normalCases() {
        Complex x = new Complex(0.0, 8.0);
        List<Complex> roots = x.nthRoot(3);
        Assert.assertEquals(3, roots.size());
        for (Complex root : roots) {
            Complex cubed = root.multiply(root).multiply(root);
            Assert.assertEquals(x.getReal(), cubed.getReal(), 1e-6);
            Assert.assertEquals(x.getImaginary(), cubed.getImaginary(), 1e-6);
        }
    }

    @Test
    public void testNthRoot_specialCases() {
        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        List<Complex> infRoots = Complex.INF.nthRoot(2);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertTrue(infRoots.get(0).isInfinite());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_zero_throwsException() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_negative_throwsException() {
        Complex.ONE.nthRoot(-3);
    }

    @Test
    public void testValueOf() {
        Complex c1 = Complex.valueOf(3.0, 4.0);
        Assert.assertEquals(3.0, c1.getReal(), EPSILON);
        Assert.assertEquals(4.0, c1.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN, 4.0).isNaN());
        Assert.assertTrue(Complex.valueOf(3.0, Double.NaN).isNaN());

        Complex c2 = Complex.valueOf(5.0);
        Assert.assertEquals(5.0, c2.getReal(), EPSILON);
        Assert.assertEquals(0.0, c2.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());
    }

    @Test
    public void testGetField() {
        Complex c = new Complex(3.0, 4.0);
        Assert.assertNotNull(c.getField());
        Assert.assertSame(ComplexField.getInstance(), c.getField());
    }

    @Test
    public void testToString() {
        Complex c = new Complex(3.0, 4.0);
        Assert.assertEquals("(3.0, 4.0)", c.toString());
    }

    @Test
    public void testSerialization() throws Exception {
        Complex c = new Complex(3.0, -4.0);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Complex deserialized = (Complex) ois.readObject();

        Assert.assertEquals(c, deserialized);
        Assert.assertFalse(deserialized.isNaN());
        Assert.assertFalse(deserialized.isInfinite());
    }
}
