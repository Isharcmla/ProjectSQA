package org.apache.commons.math3.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;

public class FastMathTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<FastMath> constructor = FastMath.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        FastMath instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testConstants() {
        Assert.assertEquals(Math.PI, FastMath.PI, 1e-15);
        Assert.assertEquals(Math.E, FastMath.E, 1e-15);
    }

    @Test
    public void testSqrt_variousInputs() {
        Assert.assertEquals(2.0, FastMath.sqrt(4.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.sqrt(0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.sqrt(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sqrt(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testCosh_variousInputs() {
        Assert.assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
        Assert.assertEquals(1.0, FastMath.cosh(0.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.cosh(-0.0), EPSILON);
        Assert.assertEquals(Math.cosh(1.5), FastMath.cosh(1.5), EPSILON);
        Assert.assertEquals(Math.cosh(-1.5), FastMath.cosh(-1.5), EPSILON);
        Assert.assertEquals(Math.cosh(25.0), FastMath.cosh(25.0), 1e-4);
        Assert.assertEquals(Math.cosh(-25.0), FastMath.cosh(-25.0), 1e-4);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(715.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(-715.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testSinh_variousInputs() {
        Assert.assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
        Assert.assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.sinh(-0.0), 0.0);
        Assert.assertEquals(Math.sinh(0.1), FastMath.sinh(0.1), EPSILON);
        Assert.assertEquals(Math.sinh(-0.1), FastMath.sinh(-0.1), EPSILON);
        Assert.assertEquals(Math.sinh(1.5), FastMath.sinh(1.5), EPSILON);
        Assert.assertEquals(Math.sinh(-1.5), FastMath.sinh(-1.5), EPSILON);
        Assert.assertEquals(Math.sinh(25.0), FastMath.sinh(25.0), 1e-4);
        Assert.assertEquals(Math.sinh(-25.0), FastMath.sinh(-25.0), 1e-4);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(715.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.sinh(-715.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.sinh(Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testTanh_variousInputs() {
        Assert.assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
        Assert.assertEquals(0.0, FastMath.tanh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.tanh(-0.0), 0.0);
        Assert.assertEquals(1.0, FastMath.tanh(25.0), EPSILON);
        Assert.assertEquals(-1.0, FastMath.tanh(-25.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.tanh(Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(-1.0, FastMath.tanh(Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.tanh(0.2), FastMath.tanh(0.2), EPSILON);
        Assert.assertEquals(Math.tanh(-0.2), FastMath.tanh(-0.2), EPSILON);
        Assert.assertEquals(Math.tanh(0.8), FastMath.tanh(0.8), EPSILON);
        Assert.assertEquals(Math.tanh(-0.8), FastMath.tanh(-0.8), EPSILON);
    }

    @Test
    public void testAcosh_variousInputs() {
        Assert.assertEquals(0.0, FastMath.acosh(1.0), EPSILON);
        Assert.assertEquals(1.3169578969248166, FastMath.acosh(2.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.acosh(0.5)));
        Assert.assertTrue(Double.isNaN(FastMath.acosh(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.acosh(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.acosh(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testAsinh_variousInputs() {
        Assert.assertEquals(0.0, FastMath.asinh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.asinh(-0.0), 0.0);
        Assert.assertEquals(0.001, FastMath.asinh(0.001), 1e-8);
        Assert.assertEquals(-0.001, FastMath.asinh(-0.001), 1e-8);
        Assert.assertEquals(0.01, FastMath.asinh(0.01), 1e-8);
        Assert.assertEquals(-0.01, FastMath.asinh(-0.01), 1e-8);
        Assert.assertEquals(0.05, FastMath.asinh(0.05), 1e-8);
        Assert.assertEquals(-0.05, FastMath.asinh(-0.05), 1e-8);
        Assert.assertEquals(0.12, FastMath.asinh(0.12), 1e-8);
        Assert.assertEquals(-0.12, FastMath.asinh(-0.12), 1e-8);
        Assert.assertEquals(1.4436354751788103, FastMath.asinh(2.0), EPSILON);
        Assert.assertEquals(-1.4436354751788103, FastMath.asinh(-2.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.asinh(Double.NaN)));
    }

    @Test
    public void testAtanh_variousInputs() {
        Assert.assertEquals(0.0, FastMath.atanh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.atanh(-0.0), 0.0);
        Assert.assertEquals(0.001, FastMath.atanh(0.001), 1e-8);
        Assert.assertEquals(-0.001, FastMath.atanh(-0.001), 1e-8);
        Assert.assertEquals(0.01, FastMath.atanh(0.01), 1e-8);
        Assert.assertEquals(-0.01, FastMath.atanh(-0.01), 1e-8);
        Assert.assertEquals(0.05, FastMath.atanh(0.05), 1e-8);
        Assert.assertEquals(-0.05, FastMath.atanh(-0.05), 1e-8);
        Assert.assertEquals(0.1, FastMath.atanh(0.1), 1e-8);
        Assert.assertEquals(-0.1, FastMath.atanh(-0.1), 1e-8);
        Assert.assertEquals(0.5493061443340548, FastMath.atanh(0.5), EPSILON);
        Assert.assertEquals(-0.5493061443340548, FastMath.atanh(-0.5), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.atanh(1.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.atanh(-1.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.atanh(2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atanh(-2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atanh(Double.NaN)));
    }

    @Test
    public void testSignum_double() {
        Assert.assertEquals(1.0, FastMath.signum(5.0), 0.0);
        Assert.assertEquals(-1.0, FastMath.signum(-5.0), 0.0);
        Assert.assertEquals(0.0, FastMath.signum(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.signum(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testSignum_float() {
        Assert.assertEquals(1.0f, FastMath.signum(5.0f), 0.0f);
        Assert.assertEquals(-1.0f, FastMath.signum(-5.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.signum(0.0f), 0.0f);
        Assert.assertEquals(-0.0f, FastMath.signum(-0.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.signum(Float.NaN)));
    }

    @Test
    public void testNextUp_double() {
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.nextUp(-Double.MIN_VALUE), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.MAX_VALUE), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.nextUp(Double.NaN)));
    }

    @Test
    public void testNextUp_float() {
        Assert.assertEquals(Float.MIN_VALUE, FastMath.nextUp(0.0f), 0.0f);
        Assert.assertEquals(-0.0f, FastMath.nextUp(-Float.MIN_VALUE), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.nextUp(Float.MAX_VALUE), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.nextUp(Float.POSITIVE_INFINITY), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.nextUp(Float.NaN)));
    }

    @Test
    public void testRandom() {
        double r = FastMath.random();
        Assert.assertTrue(r >= 0.0 && r < 1.0);
    }

    @Test
    public void testExp_variousInputs() {
        Assert.assertEquals(1.0, FastMath.exp(0.0), EPSILON);
        Assert.assertEquals(Math.E, FastMath.exp(1.0), EPSILON);
        Assert.assertEquals(Math.exp(2.5), FastMath.exp(2.5), EPSILON);
        Assert.assertEquals(Math.exp(-2.5), FastMath.exp(-2.5), EPSILON);
        Assert.assertEquals(0.0, FastMath.exp(-750.0), 0.0);
        Assert.assertTrue(FastMath.exp(-710.0) > 0.0);
        Assert.assertTrue(FastMath.exp(-709.5) > 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(710.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.exp(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.exp(Double.NaN)));
    }

    @Test
    public void testExpm1_variousInputs() {
        Assert.assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.expm1(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
        Assert.assertEquals(Math.expm1(2.0), FastMath.expm1(2.0), EPSILON);
        Assert.assertEquals(Math.expm1(-2.0), FastMath.expm1(-2.0), EPSILON);
        Assert.assertEquals(Math.expm1(0.5), FastMath.expm1(0.5), EPSILON);
        Assert.assertEquals(Math.expm1(-0.5), FastMath.expm1(-0.5), EPSILON);
        Assert.assertEquals(Math.expm1(1e-15), FastMath.expm1(1e-15), 1e-25);
        Assert.assertEquals(Math.expm1(-1e-15), FastMath.expm1(-1e-15), 1e-25);
    }

    @Test
    public void testLog_variousInputs() {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.log(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.log(1.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.log(Math.E), EPSILON);
        Assert.assertEquals(Math.log(1.005), FastMath.log(1.005), EPSILON);
        Assert.assertEquals(Math.log(0.995), FastMath.log(0.995), EPSILON);
        Assert.assertEquals(Math.log(1.5), FastMath.log(1.5), EPSILON);
        Assert.assertEquals(Math.log(100.0), FastMath.log(100.0), EPSILON);
        Assert.assertEquals(Math.log(Double.MIN_VALUE), FastMath.log(Double.MIN_VALUE), 1e-10);
    }

    @Test
    public void testLog1p_variousInputs() {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.log1p(-2.0)));
        Assert.assertEquals(0.0, FastMath.log1p(0.0), 0.0);
        Assert.assertEquals(Math.log1p(1e-8), FastMath.log1p(1e-8), 1e-20);
        Assert.assertEquals(Math.log1p(-1e-8), FastMath.log1p(-1e-8), 1e-20);
        Assert.assertEquals(Math.log1p(0.5), FastMath.log1p(0.5), EPSILON);
        Assert.assertEquals(Math.log1p(-0.5), FastMath.log1p(-0.5), EPSILON);
        Assert.assertEquals(Math.log1p(10.0), FastMath.log1p(10.0), EPSILON);
    }

    @Test
    public void testLog10_variousInputs() {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.log10(-1.0)));
        Assert.assertEquals(1.0, FastMath.log10(10.0), EPSILON);
        Assert.assertEquals(2.0, FastMath.log10(100.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testLogWithBase() {
        Assert.assertEquals(3.0, FastMath.log(2.0, 8.0), EPSILON);
        Assert.assertEquals(2.0, FastMath.log(10.0, 100.0), EPSILON);
    }

    @Test
    public void testPowDoubleDouble_variousInputs() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0.0), 0.0);
        Assert.assertEquals(1.0, FastMath.pow(0.0, 0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(2.0, Double.NaN)));

        Assert.assertEquals(0.0, FastMath.pow(0.0, 2.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.pow(-0.0, 3.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(-0.0, 2.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(-0.0, -2.0), 0.0);

        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 2.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN)));

        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.POSITIVE_INFINITY)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), 0.0);

        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 0.0);

        Assert.assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 0.0);

        Assert.assertEquals(4.0, FastMath.pow(-2.0, 2.0), EPSILON);
        Assert.assertEquals(-8.0, FastMath.pow(-2.0, 3.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.pow(-1.0, 4503599627370498.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));

        Assert.assertEquals(8.0, FastMath.pow(2.0, 3.0), EPSILON);
        Assert.assertEquals(Math.pow(2.0, 1e-10), FastMath.pow(2.0, 1e-10), EPSILON);
        Assert.assertEquals(Math.pow(1.5, 300.0), FastMath.pow(1.5, 300.0), 1e-5);
    }

    @Test
    public void testPowDoubleInt_variousInputs() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0), 0.0);
        Assert.assertEquals(8.0, FastMath.pow(2.0, 3), EPSILON);
        Assert.assertEquals(0.125, FastMath.pow(2.0, -3), EPSILON);
        Assert.assertEquals(16.0, FastMath.pow(2.0, 4), EPSILON);
        Assert.assertEquals(1024.0, FastMath.pow(2.0, 10), EPSILON);
    }

    @Test
    public void testSin_variousInputs() {
        Assert.assertEquals(0.0, FastMath.sin(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.sin(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(Math.sin(0.5), FastMath.sin(0.5), EPSILON);
        Assert.assertEquals(Math.sin(-0.5), FastMath.sin(-0.5), EPSILON);
        Assert.assertEquals(Math.sin(2.0), FastMath.sin(2.0), EPSILON);
        Assert.assertEquals(Math.sin(4.0), FastMath.sin(4.0), EPSILON);
        Assert.assertEquals(Math.sin(6.0), FastMath.sin(6.0), EPSILON);
        Assert.assertEquals(Math.sin(10000000.0), FastMath.sin(10000000.0), 1e-9);
    }

    @Test
    public void testCos_variousInputs() {
        Assert.assertEquals(1.0, FastMath.cos(0.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.cos(-0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(Math.cos(0.5), FastMath.cos(0.5), EPSILON);
        Assert.assertEquals(Math.cos(-0.5), FastMath.cos(-0.5), EPSILON);
        Assert.assertEquals(Math.cos(2.0), FastMath.cos(2.0), EPSILON);
        Assert.assertEquals(Math.cos(4.0), FastMath.cos(4.0), EPSILON);
        Assert.assertEquals(Math.cos(6.0), FastMath.cos(6.0), EPSILON);
        Assert.assertEquals(Math.cos(10000000.0), FastMath.cos(10000000.0), 1e-9);
    }

    @Test
    public void testTan_variousInputs() {
        Assert.assertEquals(0.0, FastMath.tan(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.tan(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(Math.tan(0.5), FastMath.tan(0.5), EPSILON);
        Assert.assertEquals(Math.tan(-0.5), FastMath.tan(-0.5), EPSILON);
        Assert.assertEquals(Math.tan(1.55), FastMath.tan(1.55), EPSILON);
        Assert.assertEquals(Math.tan(2.0), FastMath.tan(2.0), EPSILON);
        Assert.assertEquals(Math.tan(4.0), FastMath.tan(4.0), EPSILON);
        Assert.assertEquals(Math.tan(6.0), FastMath.tan(6.0), EPSILON);
        Assert.assertEquals(Math.tan(10000000.0), FastMath.tan(10000000.0), 1e-9);
    }

    @Test
    public void testAtan_variousInputs() {
        Assert.assertEquals(0.0, FastMath.atan(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.atan(-0.0), 0.0);
        Assert.assertEquals(Math.PI / 2.0, FastMath.atan(1e17), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan(-1e17), EPSILON);
        Assert.assertEquals(Math.atan(0.5), FastMath.atan(0.5), EPSILON);
        Assert.assertEquals(Math.atan(2.0), FastMath.atan(2.0), EPSILON);
        Assert.assertEquals(Math.atan(-0.5), FastMath.atan(-0.5), EPSILON);
        Assert.assertEquals(Math.atan(-2.0), FastMath.atan(-2.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.atan(Double.NaN)));
    }

    @Test
    public void testAtan2_variousInputs() {
        Assert.assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));

        Assert.assertEquals(0.0, FastMath.atan2(0.0, 1.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.atan2(-0.0, 1.0), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, Double.NEGATIVE_INFINITY), EPSILON);

        Assert.assertEquals(Math.PI * 0.25, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI * 0.75, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI * 0.5, FastMath.atan2(Double.POSITIVE_INFINITY, 1.0), EPSILON);

        Assert.assertEquals(-Math.PI * 0.25, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI * 0.75, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI * 0.5, FastMath.atan2(Double.NEGATIVE_INFINITY, 1.0), EPSILON);

        Assert.assertEquals(0.0, FastMath.atan2(1.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(-0.0, FastMath.atan2(-1.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(1.0, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-1.0, Double.NEGATIVE_INFINITY), EPSILON);

        Assert.assertEquals(Math.PI * 0.5, FastMath.atan2(1.0, 0.0), EPSILON);
        Assert.assertEquals(-Math.PI * 0.5, FastMath.atan2(-1.0, 0.0), EPSILON);

        Assert.assertEquals(Math.atan2(1.0, 1.0), FastMath.atan2(1.0, 1.0), EPSILON);
        Assert.assertEquals(Math.atan2(-1.0, 1.0), FastMath.atan2(-1.0, 1.0), EPSILON);
        Assert.assertEquals(Math.atan2(1.0, -1.0), FastMath.atan2(1.0, -1.0), EPSILON);
        Assert.assertEquals(Math.atan2(-1.0, -1.0), FastMath.atan2(-1.0, -1.0), EPSILON);
        Assert.assertEquals(Math.atan2(1e300, 1e-300), FastMath.atan2(1e300, 1e-300), EPSILON);
    }

    @Test
    public void testAsin_variousInputs() {
        Assert.assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(1.5)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(-1.5)));
        Assert.assertEquals(0.0, FastMath.asin(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.asin(-0.0), 0.0);
        Assert.assertEquals(Math.PI / 2.0, FastMath.asin(1.0), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), EPSILON);
        Assert.assertEquals(Math.asin(0.5), FastMath.asin(0.5), EPSILON);
        Assert.assertEquals(Math.asin(-0.5), FastMath.asin(-0.5), EPSILON);
    }

    @Test
    public void testAcos_variousInputs() {
        Assert.assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(1.5)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(-1.5)));
        Assert.assertEquals(0.0, FastMath.acos(1.0), 0.0);
        Assert.assertEquals(Math.PI, FastMath.acos(-1.0), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.acos(0.0), EPSILON);
        Assert.assertEquals(Math.acos(0.5), FastMath.acos(0.5), EPSILON);
        Assert.assertEquals(Math.acos(-0.5), FastMath.acos(-0.5), EPSILON);
    }

    @Test
    public void testCbrt_variousInputs() {
        Assert.assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.cbrt(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.cbrt(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(2.0, FastMath.cbrt(8.0), EPSILON);
        Assert.assertEquals(-2.0, FastMath.cbrt(-8.0), EPSILON);
        Assert.assertEquals(Math.cbrt(27.0), FastMath.cbrt(27.0), EPSILON);
        Assert.assertEquals(Math.cbrt(1e-300), FastMath.cbrt(1e-300), 1e-110);
        Assert.assertEquals(Math.cbrt(Double.MIN_VALUE), FastMath.cbrt(Double.MIN_VALUE), 1e-120);
    }

    @Test
    public void testToRadiansAndToDegrees() {
        Assert.assertEquals(0.0, FastMath.toRadians(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.toRadians(-0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.toRadians(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.toRadians(180.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.toRadians(1e-320), 0.0);

        Assert.assertEquals(0.0, FastMath.toDegrees(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.toDegrees(-0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.toDegrees(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(180.0, FastMath.toDegrees(Math.PI), EPSILON);
    }

    @Test
    public void testAbs() {
        Assert.assertEquals(10, FastMath.abs(10));
        Assert.assertEquals(10, FastMath.abs(-10));
        Assert.assertEquals(0, FastMath.abs(0));

        Assert.assertEquals(10L, FastMath.abs(10L));
        Assert.assertEquals(10L, FastMath.abs(-10L));
        Assert.assertEquals(0L, FastMath.abs(0L));

        Assert.assertEquals(10.5f, FastMath.abs(10.5f), 0.0f);
        Assert.assertEquals(10.5f, FastMath.abs(-10.5f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.abs(0.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.abs(-0.0f), 0.0f);

        Assert.assertEquals(10.5, FastMath.abs(10.5), 0.0);
        Assert.assertEquals(10.5, FastMath.abs(-10.5), 0.0);
        Assert.assertEquals(0.0, FastMath.abs(0.0), 0.0);
        Assert.assertEquals(0.0, FastMath.abs(-0.0), 0.0);
    }

    @Test
    public void testUlp_double() {
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.ulp(Double.NaN)));
        Assert.assertEquals(Double.MIN_VALUE, FastMath.ulp(0.0), 0.0);
        Assert.assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), 0.0);
    }

    @Test
    public void testUlp_float() {
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.POSITIVE_INFINITY), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.NEGATIVE_INFINITY), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.ulp(Float.NaN)));
        Assert.assertEquals(Float.MIN_VALUE, FastMath.ulp(0.0f), 0.0f);
        Assert.assertEquals(Math.ulp(1.0f), FastMath.ulp(1.0f), 0.0f);
    }

    @Test
    public void testScalb_double() {
        Assert.assertEquals(4.0, FastMath.scalb(1.0, 2), 0.0);
        Assert.assertEquals(0.25, FastMath.scalb(1.0, -2), 0.0);
        Assert.assertEquals(0.0, FastMath.scalb(0.0, 10), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, 10), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.scalb(Double.NaN, 10)));

        Assert.assertEquals(0.0, FastMath.scalb(1.0, -2100), 0.0);
        Assert.assertEquals(-0.0, FastMath.scalb(-1.0, -2100), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 2100), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.0, 2100), 0.0);

        Assert.assertEquals(Math.scalb(1.0, -1030), FastMath.scalb(1.0, -1030), 0.0);
        Assert.assertEquals(Math.scalb(1.0, -1080), FastMath.scalb(1.0, -1080), 0.0);
        Assert.assertEquals(Math.scalb(Double.MIN_VALUE, 1030), FastMath.scalb(Double.MIN_VALUE, 1030), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.MIN_VALUE, 2050), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-Double.MIN_VALUE, 2050), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 1030), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.0, 1030), 0.0);
    }

    @Test
    public void testScalb_float() {
        Assert.assertEquals(4.0f, FastMath.scalb(1.0f, 2), 0.0f);
        Assert.assertEquals(0.25f, FastMath.scalb(1.0f, -2), 0.0f);
        Assert.assertEquals(0.0f, FastMath.scalb(0.0f, 10), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(Float.POSITIVE_INFINITY, 10), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.scalb(Float.NaN, 10)));

        Assert.assertEquals(0.0f, FastMath.scalb(1.0f, -300), 0.0f);
        Assert.assertEquals(-0.0f, FastMath.scalb(-1.0f, -300), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 300), 0.0f);
        Assert.assertEquals(Float.NEGATIVE_INFINITY, FastMath.scalb(-1.0f, 300), 0.0f);

        Assert.assertEquals(Math.scalb(1.0f, -130), FastMath.scalb(1.0f, -130), 0.0f);
        Assert.assertEquals(Math.scalb(1.0f, -160), FastMath.scalb(1.0f, -160), 0.0f);
        Assert.assertEquals(Math.scalb(Float.MIN_VALUE, 130), FastMath.scalb(Float.MIN_VALUE, 130), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(Float.MIN_VALUE, 300), 0.0f);
        Assert.assertEquals(Float.NEGATIVE_INFINITY, FastMath.scalb(-Float.MIN_VALUE, 300), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 130), 0.0f);
        Assert.assertEquals(Float.NEGATIVE_INFINITY, FastMath.scalb(-1.0f, 130), 0.0f);
    }

    @Test
    public void testNextAfter_double() {
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(1.0, Double.NaN)));
        Assert.assertEquals(2.0, FastMath.nextAfter(2.0, 2.0), 0.0);
        Assert.assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
        Assert.assertEquals(-Double.MAX_VALUE, FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0), 0.0);
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        Assert.assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);

        Assert.assertEquals(Math.nextAfter(1.0, 2.0), FastMath.nextAfter(1.0, 2.0), 0.0);
        Assert.assertEquals(Math.nextAfter(1.0, 0.0), FastMath.nextAfter(1.0, 0.0), 0.0);
        Assert.assertEquals(Math.nextAfter(-1.0, -2.0), FastMath.nextAfter(-1.0, -2.0), 0.0);
        Assert.assertEquals(Math.nextAfter(-1.0, 0.0), FastMath.nextAfter(-1.0, 0.0), 0.0);
    }

    @Test
    public void testNextAfter_float() {
        Assert.assertTrue(Float.isNaN(FastMath.nextAfter(Float.NaN, 1.0)));
        Assert.assertTrue(Float.isNaN(FastMath.nextAfter(1.0f, Double.NaN)));
        Assert.assertEquals(2.0f, FastMath.nextAfter(2.0f, 2.0), 0.0f);
        Assert.assertEquals(Float.MAX_VALUE, FastMath.nextAfter(Float.POSITIVE_INFINITY, 0.0), 0.0f);
        Assert.assertEquals(-Float.MAX_VALUE, FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0.0), 0.0f);
        Assert.assertEquals(Float.MIN_VALUE, FastMath.nextAfter(0.0f, 1.0), 0.0f);
        Assert.assertEquals(-Float.MIN_VALUE, FastMath.nextAfter(0.0f, -1.0), 0.0f);

        Assert.assertEquals(Math.nextAfter(1.0f, 2.0), FastMath.nextAfter(1.0f, 2.0), 0.0f);
        Assert.assertEquals(Math.nextAfter(1.0f, 0.0), FastMath.nextAfter(1.0f, 0.0), 0.0f);
        Assert.assertEquals(Math.nextAfter(-1.0f, -2.0), FastMath.nextAfter(-1.0f, -2.0), 0.0f);
        Assert.assertEquals(Math.nextAfter(-1.0f, 0.0), FastMath.nextAfter(-1.0f, 0.0), 0.0f);
    }

    @Test
    public void testFloorCeilRintRound() {
        Assert.assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
        Assert.assertEquals(5.0, FastMath.floor(5.7), 0.0);
        Assert.assertEquals(-6.0, FastMath.floor(-5.7), 0.0);
        Assert.assertEquals(0.0, FastMath.floor(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.floor(-0.0), 0.0);
        Assert.assertEquals(4503599627370498.0, FastMath.floor(4503599627370498.0), 0.0);

        Assert.assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
        Assert.assertEquals(6.0, FastMath.ceil(5.3), 0.0);
        Assert.assertEquals(-5.0, FastMath.ceil(-5.3), 0.0);
        Assert.assertEquals(5.0, FastMath.ceil(5.0), 0.0);
        Assert.assertEquals(0.0, FastMath.ceil(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.ceil(-0.5), 0.0);
        Assert.assertEquals(4503599627370498.0, FastMath.ceil(4503599627370498.0), 0.0);

        Assert.assertEquals(6.0, FastMath.rint(5.7), 0.0);
        Assert.assertEquals(5.0, FastMath.rint(5.3), 0.0);
        Assert.assertEquals(6.0, FastMath.rint(5.5), 0.0);
        Assert.assertEquals(4.0, FastMath.rint(4.5), 0.0);
        Assert.assertEquals(-0.0, FastMath.rint(-0.4), 0.0);
        Assert.assertEquals(-0.0, FastMath.rint(-0.5), 0.0);

        Assert.assertEquals(6L, FastMath.round(5.7));
        Assert.assertEquals(5L, FastMath.round(5.3));
        Assert.assertEquals(6L, FastMath.round(5.5));
        Assert.assertEquals(-5L, FastMath.round(-5.5));

        Assert.assertEquals(6, FastMath.round(5.7f));
        Assert.assertEquals(5, FastMath.round(5.3f));
        Assert.assertEquals(6, FastMath.round(5.5f));
        Assert.assertEquals(-5, FastMath.round(-5.5f));
    }

    @Test
    public void testMinMax_int() {
        Assert.assertEquals(3, FastMath.min(3, 5));
        Assert.assertEquals(3, FastMath.min(5, 3));
        Assert.assertEquals(5, FastMath.max(3, 5));
        Assert.assertEquals(5, FastMath.max(5, 3));
    }

    @Test
    public void testMinMax_long() {
        Assert.assertEquals(3L, FastMath.min(3L, 5L));
        Assert.assertEquals(3L, FastMath.min(5L, 3L));
        Assert.assertEquals(5L, FastMath.max(3L, 5L));
        Assert.assertEquals(5L, FastMath.max(5L, 3L));
    }

    @Test
    public void testMinMax_float() {
        Assert.assertEquals(3.0f, FastMath.min(3.0f, 5.0f), 0.0f);
        Assert.assertEquals(3.0f, FastMath.min(5.0f, 3.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.min(Float.NaN, 3.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.min(3.0f, Float.NaN)));
        Assert.assertEquals(Float.floatToRawIntBits(-0.0f), Float.floatToRawIntBits(FastMath.min(0.0f, -0.0f)));
        Assert.assertEquals(Float.floatToRawIntBits(-0.0f), Float.floatToRawIntBits(FastMath.min(-0.0f, 0.0f)));

        Assert.assertEquals(5.0f, FastMath.max(3.0f, 5.0f), 0.0f);
        Assert.assertEquals(5.0f, FastMath.max(5.0f, 3.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.max(Float.NaN, 3.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.max(3.0f, Float.NaN)));
        Assert.assertEquals(Float.floatToRawIntBits(0.0f), Float.floatToRawIntBits(FastMath.max(0.0f, -0.0f)));
        Assert.assertEquals(Float.floatToRawIntBits(0.0f), Float.floatToRawIntBits(FastMath.max(-0.0f, 0.0f)));
    }

    @Test
    public void testMinMax_double() {
        Assert.assertEquals(3.0, FastMath.min(3.0, 5.0), 0.0);
        Assert.assertEquals(3.0, FastMath.min(5.0, 3.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.min(Double.NaN, 3.0)));
        Assert.assertTrue(Double.isNaN(FastMath.min(3.0, Double.NaN)));
        Assert.assertEquals(Double.doubleToRawLongBits(-0.0), Double.doubleToRawLongBits(FastMath.min(0.0, -0.0)));
        Assert.assertEquals(Double.doubleToRawLongBits(-0.0), Double.doubleToRawLongBits(FastMath.min(-0.0, 0.0)));

        Assert.assertEquals(5.0, FastMath.max(3.0, 5.0), 0.0);
        Assert.assertEquals(5.0, FastMath.max(5.0, 3.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.max(Double.NaN, 3.0)));
        Assert.assertTrue(Double.isNaN(FastMath.max(3.0, Double.NaN)));
        Assert.assertEquals(Double.doubleToRawLongBits(0.0), Double.doubleToRawLongBits(FastMath.max(0.0, -0.0)));
        Assert.assertEquals(Double.doubleToRawLongBits(0.0), Double.doubleToRawLongBits(FastMath.max(-0.0, 0.0)));
    }

    @Test
    public void testHypot_variousInputs() {
        Assert.assertEquals(5.0, FastMath.hypot(3.0, 4.0), EPSILON);
        Assert.assertEquals(5.0, FastMath.hypot(-3.0, 4.0), EPSILON);
        Assert.assertEquals(5.0, FastMath.hypot(3.0, -4.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(1.0, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.hypot(1.0, Double.NaN)));
        Assert.assertEquals(1e200, FastMath.hypot(1e200, 1.0), EPSILON);
        Assert.assertEquals(1e200, FastMath.hypot(1.0, 1e200), EPSILON);
    }

    @Test
    public void testIEEEremainder() {
        Assert.assertEquals(Math.IEEEremainder(5.0, 3.0), FastMath.IEEEremainder(5.0, 3.0), EPSILON);
        Assert.assertEquals(Math.IEEEremainder(7.0, 2.5), FastMath.IEEEremainder(7.0, 2.5), EPSILON);
    }

    @Test
    public void testCopySign_double() {
        Assert.assertEquals(2.0, FastMath.copySign(2.0, 3.0), 0.0);
        Assert.assertEquals(-2.0, FastMath.copySign(2.0, -3.0), 0.0);
        Assert.assertEquals(2.0, FastMath.copySign(-2.0, 3.0), 0.0);
        Assert.assertEquals(-2.0, FastMath.copySign(-2.0, -3.0), 0.0);
        Assert.assertEquals(2.0, FastMath.copySign(-2.0, Double.NaN), 0.0);
    }

    @Test
    public void testCopySign_float() {
        Assert.assertEquals(2.0f, FastMath.copySign(2.0f, 3.0f), 0.0f);
        Assert.assertEquals(-2.0f, FastMath.copySign(2.0f, -3.0f), 0.0f);
        Assert.assertEquals(2.0f, FastMath.copySign(-2.0f, 3.0f), 0.0f);
        Assert.assertEquals(-2.0f, FastMath.copySign(-2.0f, -3.0f), 0.0f);
        Assert.assertEquals(2.0f, FastMath.copySign(-2.0f, Float.NaN), 0.0f);
    }

    @Test
    public void testGetExponent_double() {
        Assert.assertEquals(0, FastMath.getExponent(1.0));
        Assert.assertEquals(1, FastMath.getExponent(2.0));
        Assert.assertEquals(10, FastMath.getExponent(1024.0));
        Assert.assertEquals(-1, FastMath.getExponent(0.5));
    }

    @Test
    public void testGetExponent_float() {
        Assert.assertEquals(0, FastMath.getExponent(1.0f));
        Assert.assertEquals(1, FastMath.getExponent(2.0f));
        Assert.assertEquals(10, FastMath.getExponent(1024.0f));
        Assert.assertEquals(-1, FastMath.getExponent(0.5f));
    }

    @Test
    public void testMain() {
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(new ByteArrayOutputStream()));
            FastMath.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }
    }
}
