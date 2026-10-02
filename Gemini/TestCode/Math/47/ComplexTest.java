package org.apache.commons.math.complex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstructorsAndGetters_normalValues_correctAssignedValues() {
        Complex c1 = new Complex(3.0);
        Assert.assertEquals(3.0, c1.getReal(), EPSILON);
        Assert.assertEquals(0.0, c1.getImaginary(), EPSILON);
        Assert.assertFalse(c1.isNaN());
        Assert.assertFalse(c1.isInfinite());

        Complex c2 = new Complex(3.0, 4.0);
        Assert.assertEquals(3.0, c2.getReal(), EPSILON);
        Assert.assertEquals(4.0, c2.getImaginary(), EPSILON);
        Assert.assertFalse(c2.isNaN());
        Assert.assertFalse(c2.isInfinite());
    }

    @Test
    public void testConstructors_nanAndInfinity_flagsCorrectlySet() {
        Complex nan1 = new Complex(Double.NaN, 1.0);
        Assert.assertTrue(nan1.isNaN());
        Assert.assertFalse(nan1.isInfinite());

        Complex nan2 = new Complex(1.0, Double.NaN);
        Assert.assertTrue(nan2.isNaN());
        Assert.assertFalse(nan2.isInfinite());

        Complex inf1 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Assert.assertFalse(inf1.isNaN());
        Assert.assertTrue(inf1.isInfinite());

        Complex inf2 = new Complex(1.0, Double.NEGATIVE_INFINITY);
        Assert.assertFalse(inf2.isNaN());
        Assert.assertTrue(inf2.isInfinite());

        Complex infNan = new Complex(Double.POSITIVE_INFINITY, Double.NaN);
        Assert.assertTrue(infNan.isNaN());
        Assert.assertFalse(infNan.isInfinite());
    }

    @Test
    public void testAbs_normalAndEdgeCases_correctModulus() {
        Assert.assertEquals(5.0, new Complex(3.0, 4.0).abs(), EPSILON);
        Assert.assertEquals(5.0, new Complex(4.0, 3.0).abs(), EPSILON);
        Assert.assertEquals(0.0, Complex.ZERO.abs(), EPSILON);
        Assert.assertEquals(3.0, new Complex(0.0, 3.0).abs(), EPSILON);
        Assert.assertEquals(3.0, new Complex(3.0, 0.0).abs(), EPSILON);
        Assert.assertEquals(3.0, new Complex(0.0, -3.0).abs(), EPSILON);
        Assert.assertEquals(3.0, new Complex(-3.0, 0.0).abs(), EPSILON);
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.NEGATIVE_INFINITY, 0).abs(), EPSILON);
    }

    @Test
    public void testAddComplex_normalAndEdgeCases_correctSum() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.add(b);
        Assert.assertEquals(4.0, result.getReal(), EPSILON);
        Assert.assertEquals(6.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(a).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddComplex_nullArgument_throwsException() {
        new Complex(1.0, 1.0).add((Complex) null);
    }

    @Test
    public void testAddDouble_normalAndEdgeCases_correctSum() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.add(3.0);
        Assert.assertEquals(4.0, result.getReal(), EPSILON);
        Assert.assertEquals(2.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(3.0).isNaN());
    }

    @Test
    public void testConjugate_normalAndEdgeCases_correctConjugate() {
        Complex a = new Complex(1.0, 2.0);
        Complex conj = a.conjugate();
        Assert.assertEquals(1.0, conj.getReal(), EPSILON);
        Assert.assertEquals(-2.0, conj.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testDivideComplex_normalAndEdgeCases_correctDivision() {
        Complex a = new Complex(2.0, 4.0);
        Complex b = new Complex(2.0, 0.0);
        Complex result = a.divide(b);
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(2.0, result.getImaginary(), EPSILON);

        Complex c = new Complex(0.0, 2.0);
        Complex result2 = a.divide(c);
        Assert.assertEquals(2.0, result2.getReal(), EPSILON);
        Assert.assertEquals(-1.0, result2.getImaginary(), EPSILON);

        Assert.assertTrue(a.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(a).isNaN());
        Assert.assertTrue(a.divide(Complex.ZERO).isNaN());
        Assert.assertEquals(Complex.ZERO, a.divide(Complex.INF));
        Assert.assertTrue(Complex.INF.divide(Complex.INF).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideComplex_nullArgument_throwsException() {
        new Complex(1.0, 1.0).divide((Complex) null);
    }

    @Test
    public void testDivideDouble_normalAndEdgeCases_correctDivision() {
        Complex a = new Complex(2.0, 4.0);
        Complex result = a.divide(2.0);
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(2.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.divide(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(2.0).isNaN());
        Assert.assertTrue(a.divide(0.0).isNaN());
        Assert.assertEquals(Complex.ZERO, a.divide(Double.POSITIVE_INFINITY));
        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    @Test
    public void testMultiplyComplex_normalAndEdgeCases_correctProduct() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.multiply(b);
        Assert.assertEquals(-5.0, result.getReal(), EPSILON);
        Assert.assertEquals(10.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(a).isNaN());
        Assert.assertEquals(Complex.INF, a.multiply(Complex.INF));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(a));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0).multiply(new Complex(1, 0)));
        Assert.assertEquals(Complex.INF, new Complex(0, Double.POSITIVE_INFINITY).multiply(new Complex(1, 0)));
        Assert.assertEquals(Complex.INF, new Complex(1, 0).multiply(new Complex(Double.POSITIVE_INFINITY, 0)));
        Assert.assertEquals(Complex.INF, new Complex(1, 0).multiply(new Complex(0, Double.POSITIVE_INFINITY)));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplex_nullArgument_throwsException() {
        new Complex(1.0, 1.0).multiply((Complex) null);
    }

    @Test
    public void testMultiplyDouble_normalAndEdgeCases_correctProduct() {
        Complex a = new Complex(1.0, 2.0);
        Complex result = a.multiply(3.0);
        Assert.assertEquals(3.0, result.getReal(), EPSILON);
        Assert.assertEquals(6.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(3.0).isNaN());
        Assert.assertEquals(Complex.INF, a.multiply(Double.POSITIVE_INFINITY));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 0).multiply(2.0));
        Assert.assertEquals(Complex.INF, new Complex(0, Double.POSITIVE_INFINITY).multiply(2.0));
    }

    @Test
    public void testNegate_normalAndEdgeCases_correctNegation() {
        Complex a = new Complex(1.0, -2.0);
        Complex result = a.negate();
        Assert.assertEquals(-1.0, result.getReal(), EPSILON);
        Assert.assertEquals(2.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testSubtractComplex_normalAndEdgeCases_correctDifference() {
        Complex a = new Complex(3.0, 5.0);
        Complex b = new Complex(1.0, 2.0);
        Complex result = a.subtract(b);
        Assert.assertEquals(2.0, result.getReal(), EPSILON);
        Assert.assertEquals(3.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(a).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplex_nullArgument_throwsException() {
        new Complex(1.0, 1.0).subtract((Complex) null);
    }

    @Test
    public void testSubtractDouble_normalAndEdgeCases_correctDifference() {
        Complex a = new Complex(3.0, 5.0);
        Complex result = a.subtract(1.0);
        Assert.assertEquals(2.0, result.getReal(), EPSILON);
        Assert.assertEquals(5.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(a.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(1.0).isNaN());
    }

    @Test
    public void testEqualsAndHashCode_variousCases_consistentResults() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(1.0, 2.0);
        Complex c = new Complex(1.0, 3.0);
        Complex d = new Complex(2.0, 2.0);

        Assert.assertTrue(a.equals(a));
        Assert.assertTrue(a.equals(b));
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(a.equals(d));
        Assert.assertFalse(a.equals(null));
        Assert.assertFalse(a.equals("Not a complex"));

        Assert.assertEquals(a.hashCode(), b.hashCode());

        Complex nan1 = new Complex(Double.NaN, 1.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertFalse(nan1.equals(a));
        Assert.assertEquals(7, nan1.hashCode());
        Assert.assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testAcos_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.5, 0.5);
        Complex result = z.acos();
        Assert.assertNotNull(result);
        Assert.assertFalse(result.isNaN());

        Assert.assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAsin_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.5, 0.5);
        Complex result = z.asin();
        Assert.assertNotNull(result);
        Assert.assertFalse(result.isNaN());

        Assert.assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAtan_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.5, 0.5);
        Complex result = z.atan();
        Assert.assertNotNull(result);
        Assert.assertFalse(result.isNaN());

        Assert.assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testCos_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.cos();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.cos().isNaN());
    }

    @Test
    public void testCosh_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.cosh();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.cosh().isNaN());
    }

    @Test
    public void testExp_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.exp();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.exp().isNaN());
    }

    @Test
    public void testLog_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(1.0, 0.0);
        Complex result = z.log();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.log().isNaN());
    }

    @Test
    public void testPowComplex_normalAndEdgeCases_correctResult() {
        Complex base = new Complex(2.0, 0.0);
        Complex exp = new Complex(3.0, 0.0);
        Complex result = base.pow(exp);
        Assert.assertEquals(8.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowComplex_nullArgument_throwsException() {
        new Complex(2.0, 0.0).pow((Complex) null);
    }

    @Test
    public void testPowDouble_normalAndEdgeCases_correctResult() {
        Complex base = new Complex(2.0, 0.0);
        Complex result = base.pow(3.0);
        Assert.assertEquals(8.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testSin_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.sin();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.sin().isNaN());
    }

    @Test
    public void testSinh_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.sinh();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.sinh().isNaN());
    }

    @Test
    public void testSqrt_normalAndEdgeCases_correctResult() {
        Complex z1 = new Complex(0.0, 0.0);
        Complex r1 = z1.sqrt();
        Assert.assertEquals(0.0, r1.getReal(), EPSILON);
        Assert.assertEquals(0.0, r1.getImaginary(), EPSILON);

        Complex z2 = new Complex(4.0, 0.0);
        Complex r2 = z2.sqrt();
        Assert.assertEquals(2.0, r2.getReal(), EPSILON);
        Assert.assertEquals(0.0, r2.getImaginary(), EPSILON);

        Complex z3 = new Complex(-4.0, 0.0);
        Complex r3 = z3.sqrt();
        Assert.assertEquals(0.0, r3.getReal(), EPSILON);
        Assert.assertEquals(2.0, r3.getImaginary(), EPSILON);

        Complex z4 = new Complex(-4.0, -3.0);
        Complex r4 = z4.sqrt();
        Assert.assertTrue(r4.getReal() > 0);
        Assert.assertTrue(r4.getImaginary() < 0);

        Assert.assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt1z_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.sqrt1z();
        Assert.assertEquals(1.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);
    }

    @Test
    public void testTan_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.tan();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.tan().isNaN());
    }

    @Test
    public void testTanh_normalAndEdgeCases_correctResult() {
        Complex z = new Complex(0.0, 0.0);
        Complex result = z.tanh();
        Assert.assertEquals(0.0, result.getReal(), EPSILON);
        Assert.assertEquals(0.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.tanh().isNaN());
    }

    @Test
    public void testGetArgument_normalAndEdgeCases_correctArgument() {
        Assert.assertEquals(0.0, new Complex(1.0, 0.0).getArgument(), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, new Complex(0.0, 1.0).getArgument(), EPSILON);
        Assert.assertEquals(Math.PI, new Complex(-1.0, 0.0).getArgument(), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, new Complex(0.0, -1.0).getArgument(), EPSILON);
        Assert.assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    @Test
    public void testNthRoot_validDegree_returnsRoots() {
        Complex z = new Complex(1.0, 0.0);
        List<Complex> roots2 = z.nthRoot(2);
        Assert.assertEquals(2, roots2.size());
        Assert.assertEquals(1.0, roots2.get(0).getReal(), EPSILON);
        Assert.assertEquals(0.0, roots2.get(0).getImaginary(), EPSILON);
        Assert.assertEquals(-1.0, roots2.get(1).getReal(), EPSILON);
        Assert.assertEquals(0.0, roots2.get(1).getImaginary(), EPSILON);

        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        List<Complex> infRoots = Complex.INF.nthRoot(2);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertTrue(infRoots.get(0).isInfinite());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_zeroDegree_throwsException() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_negativeDegree_throwsException() {
        Complex.ONE.nthRoot(-1);
    }

    @Test
    public void testValueOf_doubleDouble_createsCorrectComplex() {
        Complex c = Complex.valueOf(3.0, 4.0);
        Assert.assertEquals(3.0, c.getReal(), EPSILON);
        Assert.assertEquals(4.0, c.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
        Assert.assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());
    }

    @Test
    public void testValueOf_singleDouble_createsCorrectComplex() {
        Complex c = Complex.valueOf(3.0);
        Assert.assertEquals(3.0, c.getReal(), EPSILON);
        Assert.assertEquals(0.0, c.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());
    }

    @Test
    public void testGetField_returnsFieldInstance() {
        Complex c = new Complex(1.0, 1.0);
        Assert.assertNotNull(c.getField());
        Assert.assertEquals(ComplexField.getInstance(), c.getField());
    }

    @Test
    public void testToString_validOutput() {
        Complex c = new Complex(1.5, -2.5);
        Assert.assertEquals("(1.5, -2.5)", c.toString());
    }

    @Test
    public void testSerializationAndReadResolve_success() throws Exception {
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
