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

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstructorsAndGetters() {
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
    }

    @Test
    public void testAbs_normalAndEdgeCases() {
        Complex c1 = new Complex(3.0, 4.0);
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        Complex c2 = new Complex(4.0, 3.0);
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        Complex cZeroReal = new Complex(0.0, 5.0);
        Assert.assertEquals(5.0, cZeroReal.abs(), EPSILON);

        Complex cZeroImag = new Complex(5.0, 0.0);
        Assert.assertEquals(5.0, cZeroImag.abs(), EPSILON);

        Complex cZero = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, cZero.abs(), EPSILON);

        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.NEGATIVE_INFINITY, 0).abs(), EPSILON);
    }

    @Test
    public void testAdd_complex_normalAndEdgeCases() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex res = c1.add(c2);
        Assert.assertEquals(4.0, res.getReal(), EPSILON);
        Assert.assertEquals(6.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(c1.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(c1).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_nullComplex_throwsException() {
        Complex.ONE.add((Complex) null);
    }

    @Test
    public void testAdd_double_normalAndEdgeCases() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex res = c1.add(3.0);
        Assert.assertEquals(4.0, res.getReal(), EPSILON);
        Assert.assertEquals(2.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(c1.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(3.0).isNaN());
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(3.0, 4.0);
        Complex conj = c.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPSILON);
        Assert.assertEquals(-4.0, conj.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testDivide_complex_normalAndEdgeCases() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex res = c1.divide(c2);
        Assert.assertEquals(11.0 / 25.0, res.getReal(), EPSILON);
        Assert.assertEquals(2.0 / 25.0, res.getImaginary(), EPSILON);

        Complex c3 = new Complex(4.0, 3.0);
        Complex res2 = c1.divide(c3);
        Assert.assertEquals(10.0 / 25.0, res2.getReal(), EPSILON);
        Assert.assertEquals(5.0 / 25.0, res2.getImaginary(), EPSILON);

        Assert.assertTrue(c1.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(c1).isNaN());
        Assert.assertTrue(Complex.ZERO.divide(Complex.ZERO).isNaN());
        Assert.assertEquals(Complex.INF, c1.divide(Complex.ZERO));
        Assert.assertEquals(Complex.ZERO, c1.divide(Complex.INF));
        Assert.assertTrue(Complex.INF.divide(Complex.INF).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_nullComplex_throwsException() {
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
        Assert.assertTrue(Complex.ZERO.divide(0.0).isNaN());
        Assert.assertEquals(Complex.INF, c.divide(0.0));
        Assert.assertEquals(Complex.ZERO, c.divide(Double.POSITIVE_INFINITY));
        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    @Test
    public void testMultiply_complex_normalAndEdgeCases() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex res = c1.multiply(c2);
        Assert.assertEquals(-5.0, res.getReal(), EPSILON);
        Assert.assertEquals(10.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(c1.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(c1).isNaN());
        Assert.assertEquals(Complex.INF, c1.multiply(Complex.INF));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(c1));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0).multiply(new Complex(1, 1)));
        Assert.assertEquals(Complex.INF, new Complex(0, Double.POSITIVE_INFINITY).multiply(new Complex(1, 1)));
        Assert.assertEquals(Complex.INF, new Complex(1, 1).multiply(new Complex(Double.POSITIVE_INFINITY, 0)));
        Assert.assertEquals(Complex.INF, new Complex(1, 1).multiply(new Complex(0, Double.POSITIVE_INFINITY)));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_nullComplex_throwsException() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testMultiply_double_normalAndEdgeCases() {
        Complex c = new Complex(1.0, 2.0);
        Complex res = c.multiply(3.0);
        Assert.assertEquals(3.0, res.getReal(), EPSILON);
        Assert.assertEquals(6.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(c.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(3.0).isNaN());
        Assert.assertEquals(Complex.INF, c.multiply(Double.POSITIVE_INFINITY));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0.0).multiply(2.0));
        Assert.assertEquals(Complex.INF, new Complex(0.0, Double.POSITIVE_INFINITY).multiply(2.0));
    }

    @Test
    public void testNegate() {
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
        Complex res = c1.subtract(c2);
        Assert.assertEquals(3.0, res.getReal(), EPSILON);
        Assert.assertEquals(4.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(c1.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(c1).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_nullComplex_throwsException() {
        Complex.ONE.subtract((Complex) null);
    }

    @Test
    public void testSubtract_double_normalAndEdgeCases() {
        Complex c1 = new Complex(5.0, 7.0);
        Complex res = c1.subtract(2.0);
        Assert.assertEquals(3.0, res.getReal(), EPSILON);
        Assert.assertEquals(7.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(c1.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(2.0).isNaN());
    }

    @Test
    public void testAcos() {
        Complex c = new Complex(0.5, 0.5);
        Complex acos = c.acos();
        Assert.assertEquals(c, acos.cos());
        Assert.assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAsin() {
        Complex c = new Complex(0.5, 0.5);
        Complex asin = c.asin();
        Assert.assertEquals(c.getReal(), asin.sin().getReal(), EPSILON);
        Assert.assertEquals(c.getImaginary(), asin.sin().getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAtan() {
        Complex c = new Complex(0.5, 0.5);
        Complex atan = c.atan();
        Assert.assertEquals(c.getReal(), atan.tan().getReal(), EPSILON);
        Assert.assertEquals(c.getImaginary(), atan.tan().getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testCosAndCosh() {
        Complex c = new Complex(1.0, 2.0);
        Complex cos = c.cos();
        Assert.assertFalse(cos.isNaN());
        Assert.assertTrue(Complex.NaN.cos().isNaN());

        Complex cosh = c.cosh();
        Assert.assertFalse(cosh.isNaN());
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
    }

    @Test
    public void testExpAndLog() {
        Complex c = new Complex(1.0, 2.0);
        Complex exp = c.exp();
        Assert.assertFalse(exp.isNaN());
        Assert.assertTrue(Complex.NaN.exp().isNaN());

        Complex log = c.log();
        Assert.assertFalse(log.isNaN());
        Assert.assertTrue(Complex.NaN.log().isNaN());
    }

    @Test
    public void testPow_complex_normalAndEdgeCases() {
        Complex c1 = new Complex(2.0, 1.0);
        Complex c2 = new Complex(0.5, 2.0);
        Complex pow = c1.pow(c2);
        Assert.assertFalse(pow.isNaN());
        Assert.assertTrue(Complex.NaN.pow(c2).isNaN());
        Assert.assertTrue(c1.pow(Complex.NaN).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testPow_nullComplex_throwsException() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testPow_double_normalAndEdgeCases() {
        Complex c = new Complex(2.0, 1.0);
        Complex pow = c.pow(2.0);
        Assert.assertFalse(pow.isNaN());
        Assert.assertTrue(Complex.NaN.pow(2.0).isNaN());
    }

    @Test
    public void testSinAndSinh() {
        Complex c = new Complex(1.0, 2.0);
        Complex sin = c.sin();
        Assert.assertFalse(sin.isNaN());
        Assert.assertTrue(Complex.NaN.sin().isNaN());

        Complex sinh = c.sinh();
        Assert.assertFalse(sinh.isNaN());
        Assert.assertTrue(Complex.NaN.sinh().isNaN());
    }

    @Test
    public void testSqrt() {
        Complex cPos = new Complex(3.0, 4.0);
        Complex sqrtPos = cPos.sqrt();
        Assert.assertEquals(2.0, sqrtPos.getReal(), EPSILON);
        Assert.assertEquals(1.0, sqrtPos.getImaginary(), EPSILON);

        Complex cNeg = new Complex(-3.0, 4.0);
        Complex sqrtNeg = cNeg.sqrt();
        Assert.assertEquals(1.0, sqrtNeg.getReal(), EPSILON);
        Assert.assertEquals(2.0, sqrtNeg.getImaginary(), EPSILON);

        Complex cZero = new Complex(0.0, 0.0);
        Complex sqrtZero = cZero.sqrt();
        Assert.assertEquals(0.0, sqrtZero.getReal(), EPSILON);
        Assert.assertEquals(0.0, sqrtZero.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt1z() {
        Complex c = new Complex(0.5, 0.5);
        Complex res = c.sqrt1z();
        Assert.assertFalse(res.isNaN());
        Assert.assertTrue(Complex.NaN.sqrt1z().isNaN());
    }

    @Test
    public void testTanAndTanh() {
        Complex c = new Complex(1.0, 2.0);
        Complex tan = c.tan();
        Assert.assertFalse(tan.isNaN());
        Assert.assertTrue(Complex.NaN.tan().isNaN());

        Complex tanh = c.tanh();
        Assert.assertFalse(tanh.isNaN());
        Assert.assertTrue(Complex.NaN.tanh().isNaN());
    }

    @Test
    public void testGetArgument() {
        Complex c = new Complex(1.0, 1.0);
        Assert.assertEquals(FastMath.PI / 4.0, c.getArgument(), EPSILON);
        Assert.assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    @Test
    public void testNthRoot_normalAndEdgeCases() {
        Complex c = new Complex(0.0, 8.0);
        List<Complex> roots = c.nthRoot(3);
        Assert.assertEquals(3, roots.size());

        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        List<Complex> infRoots = Complex.INF.nthRoot(2);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertEquals(Complex.INF, infRoots.get(0));
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_zeroDegree_throwsException() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_negativeDegree_throwsException() {
        Complex.ONE.nthRoot(-2);
    }

    @Test
    public void testValueOf() {
        Complex c1 = Complex.valueOf(3.0, 4.0);
        Assert.assertEquals(3.0, c1.getReal(), EPSILON);
        Assert.assertEquals(4.0, c1.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
        Assert.assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());

        Complex c2 = Complex.valueOf(5.0);
        Assert.assertEquals(5.0, c2.getReal(), EPSILON);
        Assert.assertEquals(0.0, c2.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());
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
        Assert.assertFalse(c1.equals("Not a complex number"));
        Assert.assertFalse(c1.equals(c3));
        Assert.assertFalse(c1.equals(c4));

        Complex nan1 = new Complex(Double.NaN, 1.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertEquals(nan1.hashCode(), Complex.NaN.hashCode());
        Assert.assertEquals(7, Complex.NaN.hashCode());
        Assert.assertFalse(c1.equals(Complex.NaN));
    }

    @Test
    public void testToString() {
        Complex c = new Complex(1.5, -2.5);
        Assert.assertEquals("(1.5, -2.5)", c.toString());
    }

    @Test
    public void testGetField() {
        Complex c = new Complex(1.0, 2.0);
        Assert.assertNotNull(c.getField());
        Assert.assertEquals(ComplexField.getInstance(), c.getField());
    }

    @Test
    public void testSerialization() throws Exception {
        Complex c = new Complex(3.0, 4.0);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(c);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Complex deserialized = (Complex) ois.readObject();
        ois.close();

        Assert.assertEquals(c, deserialized);
        Assert.assertFalse(deserialized.isNaN());
        Assert.assertFalse(deserialized.isInfinite());
    }
}
