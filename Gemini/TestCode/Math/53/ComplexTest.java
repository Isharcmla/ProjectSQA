package org.apache.commons.math.complex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    private static final double EPSILON = 1e-10;

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
    public void testConstructor_and_Getters() {
        Complex c = new Complex(3.0, -4.0);
        Assert.assertEquals(3.0, c.getReal(), EPSILON);
        Assert.assertEquals(-4.0, c.getImaginary(), EPSILON);
        Assert.assertFalse(c.isNaN());
        Assert.assertFalse(c.isInfinite());

        Complex cNanReal = new Complex(Double.NaN, 1.0);
        Assert.assertTrue(cNanReal.isNaN());
        Assert.assertFalse(cNanReal.isInfinite());

        Complex cNanImag = new Complex(1.0, Double.NaN);
        Assert.assertTrue(cNanImag.isNaN());
        Assert.assertFalse(cNanImag.isInfinite());

        Complex cInfReal = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Assert.assertFalse(cInfReal.isNaN());
        Assert.assertTrue(cInfReal.isInfinite());

        Complex cInfImag = new Complex(1.0, Double.NEGATIVE_INFINITY);
        Assert.assertFalse(cInfImag.isNaN());
        Assert.assertTrue(cInfImag.isInfinite());
    }

    @Test
    public void testAbs_normal() {
        Complex c1 = new Complex(3.0, 4.0); // |real| < |imaginary|
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        Complex c2 = new Complex(4.0, 3.0); // |real| >= |imaginary|
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        Complex cZero = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, cZero.abs(), EPSILON);
    }

    @Test
    public void testAbs_edgeCases() {
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));
        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.NEGATIVE_INFINITY, 0.0).abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(0.0, Double.POSITIVE_INFINITY).abs(), EPSILON);
    }

    @Test
    public void testAdd_normal() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.add(c2);
        Assert.assertEquals(4.0, result.getReal(), EPSILON);
        Assert.assertEquals(6.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testAdd_NaN() {
        Complex c = new Complex(1.0, 2.0);
        Assert.assertTrue(c.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(c).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_nullRhs_throwsException() {
        Complex.ONE.add(null);
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(3.0, 4.0);
        Complex conj = c.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPSILON);
        Assert.assertEquals(-4.0, conj.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.conjugate().isNaN());

        Complex cInf = new Complex(1.0, Double.POSITIVE_INFINITY);
        Complex conjInf = cInf.conjugate();
        Assert.assertEquals(1.0, conjInf.getReal(), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, conjInf.getImaginary(), EPSILON);
    }

    @Test
    public void testDivide_normal() {
        Complex c1 = new Complex(2.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0); // |c| < |d|
        Complex result1 = c1.divide(c2);
        Assert.assertEquals(2.0, result1.getReal(), EPSILON);
        Assert.assertEquals(0.0, result1.getImaginary(), EPSILON);

        Complex c3 = new Complex(2.0, 1.0); // |c| >= |d|
        Complex result2 = c1.divide(c3);
        Assert.assertEquals(1.6, result2.getReal(), EPSILON);
        Assert.assertEquals(1.2, result2.getImaginary(), EPSILON);
    }

    @Test
    public void testDivide_edgeCases() {
        Assert.assertTrue(Complex.ONE.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(Complex.ONE).isNaN());
        Assert.assertTrue(Complex.ONE.divide(Complex.ZERO).isNaN());
        Assert.assertTrue(Complex.INF.divide(Complex.INF).isNaN());

        Complex resultFiniteByInf = Complex.ONE.divide(Complex.INF);
        Assert.assertEquals(0.0, resultFiniteByInf.getReal(), EPSILON);
        Assert.assertEquals(0.0, resultFiniteByInf.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_nullRhs_throwsException() {
        Complex.ONE.divide(null);
    }

    @Test
    public void testMultiply_Complex_normal() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.multiply(c2);
        Assert.assertEquals(-5.0, result.getReal(), EPSILON);
        Assert.assertEquals(10.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testMultiply_Complex_edgeCases() {
        Assert.assertTrue(Complex.ONE.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(Complex.ONE).isNaN());

        Complex inf1 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex inf2 = new Complex(1.0, Double.NEGATIVE_INFINITY);
        Assert.assertTrue(Complex.ONE.multiply(inf1).isInfinite());
        Assert.assertTrue(inf2.multiply(Complex.ONE).isInfinite());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_Complex_nullRhs_throwsException() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testMultiply_Double_normal() {
        Complex c = new Complex(2.0, -3.0);
        Complex result = c.multiply(2.5);
        Assert.assertEquals(5.0, result.getReal(), EPSILON);
        Assert.assertEquals(-7.5, result.getImaginary(), EPSILON);
    }

    @Test
    public void testMultiply_Double_edgeCases() {
        Assert.assertTrue(Complex.ONE.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(2.0).isNaN());
        Assert.assertTrue(Complex.ONE.multiply(Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertTrue(Complex.INF.multiply(2.0).isInfinite());
    }

    @Test
    public void testSubtract_normal() {
        Complex c1 = new Complex(5.0, 7.0);
        Complex c2 = new Complex(2.0, 3.0);
        Complex result = c1.subtract(c2);
        Assert.assertEquals(3.0, result.getReal(), EPSILON);
        Assert.assertEquals(4.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testSubtract_edgeCases() {
        Assert.assertTrue(Complex.ONE.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(Complex.ONE).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_nullRhs_throwsException() {
        Complex.ONE.subtract(null);
    }

    @Test
    public void testNegate() {
        Complex c = new Complex(2.5, -3.5);
        Complex result = c.negate();
        Assert.assertEquals(-2.5, result.getReal(), EPSILON);
        Assert.assertEquals(3.5, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testEquals_and_HashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(1.0, 3.0);
        Complex c4 = new Complex(3.0, 2.0);

        Assert.assertTrue(c1.equals(c1));
        Assert.assertTrue(c1.equals(c2));
        Assert.assertEquals(c1.hashCode(), c2.hashCode());

        Assert.assertFalse(c1.equals(null));
        Assert.assertFalse(c1.equals("Not A Complex"));
        Assert.assertFalse(c1.equals(c3));
        Assert.assertFalse(c1.equals(c4));

        Complex nan1 = new Complex(Double.NaN, 0.0);
        Complex nan2 = new Complex(0.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertFalse(c1.equals(nan1));
        Assert.assertFalse(nan1.equals(c1));
        Assert.assertEquals(7, nan1.hashCode());
    }

    @Test
    public void testAcos() {
        Assert.assertTrue(Complex.NaN.acos().isNaN());
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.acos();
        Assert.assertEquals(0.9045568943023814, result.getReal(), EPSILON);
        Assert.assertEquals(-0.5176147424907185, result.getImaginary(), EPSILON);
    }

    @Test
    public void testAsin() {
        Assert.assertTrue(Complex.NaN.asin().isNaN());
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.asin();
        Assert.assertEquals(0.6662394324925153, result.getReal(), EPSILON);
        Assert.assertEquals(0.5176147424907185, result.getImaginary(), EPSILON);
    }

    @Test
    public void testAtan() {
        Assert.assertTrue(Complex.NaN.atan().isNaN());
        Complex c = new Complex(0.5, 0.5);
        Complex result = c.atan();
        Assert.assertEquals(0.4636476090008061, result.getReal(), EPSILON);
        Assert.assertEquals(0.4023594781085251, result.getImaginary(), EPSILON);
    }

    @Test
    public void testCos() {
        Assert.assertTrue(Complex.NaN.cos().isNaN());
        Complex c = new Complex(Math.PI / 3, 0.0);
        Complex result = c.cos();
        Assert.assertEquals(0.5, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testCosh() {
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
        Complex c = new Complex(0.0, Math.PI / 3);
        Complex result = c.cosh();
        Assert.assertEquals(0.5, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testExp() {
        Assert.assertTrue(Complex.NaN.exp().isNaN());
        Complex c = new Complex(0.0, Math.PI);
        Complex result = c.exp();
        Assert.assertEquals(-1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testLog() {
        Assert.assertTrue(Complex.NaN.log().isNaN());
        Complex c = new Complex(Math.E, 0.0);
        Complex result = c.log();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testPow() {
        Complex base = new Complex(2.0, 0.0);
        Complex exp = new Complex(3.0, 0.0);
        Complex result = base.pow(exp);
        Assert.assertEquals(8.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testPow_nullExponent_throwsException() {
        Complex.ONE.pow(null);
    }

    @Test
    public void testSin() {
        Assert.assertTrue(Complex.NaN.sin().isNaN());
        Complex c = new Complex(Math.PI / 6, 0.0);
        Complex result = c.sin();
        Assert.assertEquals(0.5, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testSinh() {
        Assert.assertTrue(Complex.NaN.sinh().isNaN());
        Complex c = new Complex(0.0, Math.PI / 6);
        Complex result = c.sinh();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.5, result.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt() {
        Assert.assertTrue(Complex.NaN.sqrt().isNaN());

        Complex zeroSqrt = Complex.ZERO.sqrt();
        Assert.assertEquals(0.0, zeroSqrt.getReal(), EPSILON);
        Assert.assertEquals(0.0, zeroSqrt.getImaginary(), EPSILON);

        Complex cPos = new Complex(3.0, 4.0); // real >= 0
        Complex resPos = cPos.sqrt();
        Assert.assertEquals(2.0, resPos.getReal(), EPSILON);
        Assert.assertEquals(1.0, resPos.getImaginary(), EPSILON);

        Complex cNeg = new Complex(-3.0, 4.0); // real < 0
        Complex resNeg = cNeg.sqrt();
        Assert.assertEquals(1.0, resNeg.getReal(), EPSILON);
        Assert.assertEquals(2.0, resNeg.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt1z() {
        Complex c = new Complex(0.0, 0.0);
        Complex result = c.sqrt1z();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testTan() {
        Assert.assertTrue(Complex.NaN.tan().isNaN());
        Complex c = new Complex(Math.PI / 4, 0.0);
        Complex result = c.tan();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testTanh() {
        Assert.assertTrue(Complex.NaN.tanh().isNaN());
        Complex c = new Complex(0.0, Math.PI / 4);
        Complex result = c.tanh();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(1.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testGetArgument() {
        Assert.assertEquals(0.0, new Complex(1.0, 0.0).getArgument(), EPSILON);
        Assert.assertEquals(Math.PI / 2, new Complex(0.0, 1.0).getArgument(), EPSILON);
        Assert.assertEquals(Math.PI, new Complex(-1.0, 0.0).getArgument(), EPSILON);
        Assert.assertEquals(-Math.PI / 2, new Complex(0.0, -1.0).getArgument(), EPSILON);
    }

    @Test
    public void testNthRoot_normal() {
        Complex c = new Complex(0.0, 8.0);
        List<Complex> roots = c.nthRoot(3);
        Assert.assertEquals(3, roots.size());
        for (Complex root : roots) {
            Complex cubed = root.multiply(root).multiply(root);
            Assert.assertEquals(c.getReal(), cubed.getReal(), EPSILON);
            Assert.assertEquals(c.getImaginary(), cubed.getImaginary(), EPSILON);
        }
    }

    @Test
    public void testNthRoot_edgeCases() {
        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        List<Complex> infRoots = Complex.INF.nthRoot(2);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertTrue(infRoots.get(0).isInfinite());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNthRoot_zeroN_throwsException() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNthRoot_negativeN_throwsException() {
        Complex.ONE.nthRoot(-2);
    }

    @Test
    public void testGetField() {
        Complex c = new Complex(1.0, 2.0);
        Assert.assertNotNull(c.getField());
        Assert.assertSame(ComplexField.getInstance(), c.getField());
    }

    @Test
    public void testToString() {
        Complex c = new Complex(1.5, -2.5);
        Assert.assertEquals("(1.5, -2.5)", c.toString());
    }

    @Test
    public void testSerialization_and_ReadResolve() throws Exception {
        Complex original = new Complex(3.0, 4.0);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(original);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Complex deserialized = (Complex) ois.readObject();

        Assert.assertEquals(original, deserialized);
        Assert.assertFalse(deserialized.isNaN());
        Assert.assertFalse(deserialized.isInfinite());
    }
}
