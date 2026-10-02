package org.apache.commons.math.util;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class FastMathTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<FastMath> constructor = FastMath.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        FastMath instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testSqrt() {
        Assert.assertEquals(2.0, FastMath.sqrt(4.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.sqrt(0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.sqrt(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sqrt(Double.POSITIVE_INFINITY), EPSILON);
    }

    @Test
    public void testCosh() {
        Assert.assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
        Assert.assertEquals(Math.cosh(25.0), FastMath.cosh(25.0), Math.cosh(25.0) * 1e-5);
        Assert.assertEquals(Math.cosh(-25.0), FastMath.cosh(-25.0), Math.cosh(-25.0) * 1e-5);
        Assert.assertEquals(1.0, FastMath.cosh(0.0), EPSILON);
        Assert.assertEquals(Math.cosh(2.5), FastMath.cosh(2.5), EPSILON);
        Assert.assertEquals(Math.cosh(-2.5), FastMath.cosh(-2.5), EPSILON);
        Assert.assertEquals(Math.cosh(0.1), FastMath.cosh(0.1), EPSILON);
        Assert.assertEquals(Math.cosh(-0.1), FastMath.cosh(-0.1), EPSILON);
    }

    @Test
    public void testSinh() {
        Assert.assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
        Assert.assertEquals(Math.sinh(25.0), FastMath.sinh(25.0), Math.sinh(25.0) * 1e-5);
        Assert.assertEquals(Math.sinh(-25.0), FastMath.sinh(-25.0), Math.sinh(-25.0) * 1e-5);
        Assert.assertEquals(0.0, FastMath.sinh(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.sinh(-0.0), EPSILON);
        Assert.assertEquals(Math.sinh(2.5), FastMath.sinh(2.5), EPSILON);
        Assert.assertEquals(Math.sinh(-2.5), FastMath.sinh(-2.5), EPSILON);
        Assert.assertEquals(Math.sinh(0.1), FastMath.sinh(0.1), EPSILON);
        Assert.assertEquals(Math.sinh(-0.1), FastMath.sinh(-0.1), EPSILON);
    }

    @Test
    public void testTanh() {
        Assert.assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
        Assert.assertEquals(1.0, FastMath.tanh(25.0), EPSILON);
        Assert.assertEquals(-1.0, FastMath.tanh(-25.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.tanh(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.tanh(-0.0), EPSILON);
        Assert.assertEquals(Math.tanh(1.5), FastMath.tanh(1.5), EPSILON);
        Assert.assertEquals(Math.tanh(-1.5), FastMath.tanh(-1.5), EPSILON);
        Assert.assertEquals(Math.tanh(0.2), FastMath.tanh(0.2), EPSILON);
        Assert.assertEquals(Math.tanh(-0.2), FastMath.tanh(-0.2), EPSILON);
    }

    @Test
    public void testAcosh() {
        Assert.assertEquals(0.0, FastMath.acosh(1.0), EPSILON);
        Assert.assertEquals(1.3169578969248166, FastMath.acosh(2.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.acosh(0.5)));
        Assert.assertTrue(Double.isNaN(FastMath.acosh(Double.NaN)));
    }

    @Test
    public void testAsinh() {
        Assert.assertEquals(0.0, FastMath.asinh(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.asinh(-0.0), EPSILON);
        Assert.assertEquals(1.4436354751788103, FastMath.asinh(2.0), EPSILON);
        Assert.assertEquals(-1.4436354751788103, FastMath.asinh(-2.0), EPSILON);
        Assert.assertEquals(0.11971118167810793, FastMath.asinh(0.12), EPSILON);
        Assert.assertEquals(-0.11971118167810793, FastMath.asinh(-0.12), EPSILON);
        Assert.assertEquals(0.049979183491919864, FastMath.asinh(0.05), EPSILON);
        Assert.assertEquals(-0.049979183491919864, FastMath.asinh(-0.05), EPSILON);
        Assert.assertEquals(0.009999833334166663, FastMath.asinh(0.01), EPSILON);
        Assert.assertEquals(-0.009999833334166663, FastMath.asinh(-0.01), EPSILON);
        Assert.assertEquals(0.0019999986666671998, FastMath.asinh(0.002), EPSILON);
        Assert.assertEquals(-0.0019999986666671998, FastMath.asinh(-0.002), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.asinh(Double.NaN)));
    }

    @Test
    public void testAtanh() {
        Assert.assertEquals(0.0, FastMath.atanh(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.atanh(-0.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.atanh(1.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.atanh(-1.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.atanh(2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atanh(-2.0)));
        Assert.assertEquals(0.5493061443340549, FastMath.atanh(0.5), EPSILON);
        Assert.assertEquals(-0.5493061443340549, FastMath.atanh(-0.5), EPSILON);
        Assert.assertEquals(0.1003353477310756, FastMath.atanh(0.1), EPSILON);
        Assert.assertEquals(-0.1003353477310756, FastMath.atanh(-0.1), EPSILON);
        Assert.assertEquals(0.0500417292784916, FastMath.atanh(0.05), EPSILON);
        Assert.assertEquals(-0.0500417292784916, FastMath.atanh(-0.05), EPSILON);
        Assert.assertEquals(0.01000033335333476, FastMath.atanh(0.01), EPSILON);
        Assert.assertEquals(-0.01000033335333476, FastMath.atanh(-0.01), EPSILON);
        Assert.assertEquals(0.002000002666670933, FastMath.atanh(0.002), EPSILON);
        Assert.assertEquals(-0.002000002666670933, FastMath.atanh(-0.002), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.atanh(Double.NaN)));
    }

    @Test
    public void testSignum() {
        Assert.assertEquals(1.0, FastMath.signum(123.45), EPSILON);
        Assert.assertEquals(-1.0, FastMath.signum(-123.45), EPSILON);
        Assert.assertEquals(0.0, FastMath.signum(0.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.signum(-0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testNextUp() {
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 0.0);
        Assert.assertEquals(0.0, FastMath.nextUp(-Double.MIN_VALUE), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.nextUp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.nextUp(Double.NaN)));
        Assert.assertEquals(Math.nextUp(1.0), FastMath.nextUp(1.0), 0.0);
    }

    @Test
    public void testRandom() {
        double r = FastMath.random();
        Assert.assertTrue(r >= 0.0 && r < 1.0);
    }

    @Test
    public void testExp() {
        Assert.assertEquals(1.0, FastMath.exp(0.0), EPSILON);
        Assert.assertEquals(Math.E, FastMath.exp(1.0), EPSILON);
        Assert.assertEquals(Math.exp(2.5), FastMath.exp(2.5), EPSILON);
        Assert.assertEquals(Math.exp(-2.5), FastMath.exp(-2.5), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(710.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.exp(-750.0), EPSILON);
        Assert.assertEquals(Math.exp(-709.5), FastMath.exp(-709.5), 1e-300);
        Assert.assertEquals(Math.exp(-708.5), FastMath.exp(-708.5), 1e-300);
    }

    @Test
    public void testExpm1() {
        Assert.assertEquals(0.0, FastMath.expm1(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.expm1(-0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
        Assert.assertEquals(Math.expm1(2.0), FastMath.expm1(2.0), EPSILON);
        Assert.assertEquals(Math.expm1(-2.0), FastMath.expm1(-2.0), EPSILON);
        Assert.assertEquals(Math.expm1(0.5), FastMath.expm1(0.5), EPSILON);
        Assert.assertEquals(Math.expm1(-0.5), FastMath.expm1(-0.5), EPSILON);
        Assert.assertEquals(Math.expm1(1e-10), FastMath.expm1(1e-10), 1e-20);
        Assert.assertEquals(Math.expm1(-1e-10), FastMath.expm1(-1e-10), 1e-20);
    }

    @Test
    public void testLog() {
        Assert.assertEquals(0.0, FastMath.log(1.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.log(FastMath.E), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.log(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.log(1.005), FastMath.log(1.005), EPSILON);
        Assert.assertEquals(Math.log(0.995), FastMath.log(0.995), EPSILON);
        Assert.assertEquals(Math.log(12345.678), FastMath.log(12345.678), EPSILON);
        Assert.assertEquals(Math.log(Double.MIN_NORMAL / 4.0), FastMath.log(Double.MIN_NORMAL / 4.0), EPSILON);
    }

    @Test
    public void testLog1p() {
        Assert.assertEquals(0.0, FastMath.log1p(0.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.log1p(-2.0)));
        Assert.assertEquals(Math.log1p(1e-8), FastMath.log1p(1e-8), 1e-16);
        Assert.assertEquals(Math.log1p(-1e-8), FastMath.log1p(-1e-8), 1e-16);
        Assert.assertEquals(Math.log1p(2.0), FastMath.log1p(2.0), EPSILON);
        Assert.assertEquals(Math.log1p(-0.5), FastMath.log1p(-0.5), EPSILON);
    }

    @Test
    public void testLog10() {
        Assert.assertEquals(1.0, FastMath.log10(10.0), EPSILON);
        Assert.assertEquals(2.0, FastMath.log10(100.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.log10(1.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.log10(-10.0)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), EPSILON);
    }

    @Test
    public void testPow() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.pow(0.0, 0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(2.0, Double.NaN)));
        Assert.assertEquals(0.0, FastMath.pow(0.0, 2.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.pow(-0.0, 3.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.pow(-0.0, 2.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(-0.0, -2.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 2.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.POSITIVE_INFINITY)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), EPSILON);
        Assert.assertEquals(4.0, FastMath.pow(-2.0, 2.0), EPSILON);
        Assert.assertEquals(-8.0, FastMath.pow(-2.0, 3.0), EPSILON);
        Assert.assertEquals(Math.pow(-2.0, 10000000000000000.0), FastMath.pow(-2.0, 10000000000000000.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
        Assert.assertEquals(8.0, FastMath.pow(2.0, 3.0), EPSILON);
        Assert.assertEquals(Math.pow(2.0, 1e300), FastMath.pow(2.0, 1e300), EPSILON);
    }

    @Test
    public void testSin() {
        Assert.assertEquals(0.0, FastMath.sin(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.sin(-0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(Math.sin(1.0), FastMath.sin(1.0), EPSILON);
        Assert.assertEquals(Math.sin(2.0), FastMath.sin(2.0), EPSILON);
        Assert.assertEquals(Math.sin(3.0), FastMath.sin(3.0), EPSILON);
        Assert.assertEquals(Math.sin(4.0), FastMath.sin(4.0), EPSILON);
        Assert.assertEquals(Math.sin(-1.0), FastMath.sin(-1.0), EPSILON);
        Assert.assertEquals(Math.sin(-2.0), FastMath.sin(-2.0), EPSILON);
        Assert.assertEquals(Math.sin(-3.0), FastMath.sin(-3.0), EPSILON);
        Assert.assertEquals(Math.sin(-4.0), FastMath.sin(-4.0), EPSILON);
        Assert.assertEquals(Math.sin(4000000.0), FastMath.sin(4000000.0), 1e-9);
    }

    @Test
    public void testCos() {
        Assert.assertEquals(1.0, FastMath.cos(0.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.cos(-0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(Math.cos(1.0), FastMath.cos(1.0), EPSILON);
        Assert.assertEquals(Math.cos(2.0), FastMath.cos(2.0), EPSILON);
        Assert.assertEquals(Math.cos(3.0), FastMath.cos(3.0), EPSILON);
        Assert.assertEquals(Math.cos(4.0), FastMath.cos(4.0), EPSILON);
        Assert.assertEquals(Math.cos(-1.0), FastMath.cos(-1.0), EPSILON);
        Assert.assertEquals(Math.cos(-2.0), FastMath.cos(-2.0), EPSILON);
        Assert.assertEquals(Math.cos(-3.0), FastMath.cos(-3.0), EPSILON);
        Assert.assertEquals(Math.cos(-4.0), FastMath.cos(-4.0), EPSILON);
        Assert.assertEquals(Math.cos(4000000.0), FastMath.cos(4000000.0), 1e-9);
    }

    @Test
    public void testTan() {
        Assert.assertEquals(0.0, FastMath.tan(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.tan(-0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(Math.tan(0.5), FastMath.tan(0.5), EPSILON);
        Assert.assertEquals(Math.tan(1.55), FastMath.tan(1.55), EPSILON);
        Assert.assertEquals(Math.tan(2.5), FastMath.tan(2.5), EPSILON);
        Assert.assertEquals(Math.tan(-0.5), FastMath.tan(-0.5), EPSILON);
        Assert.assertEquals(Math.tan(-1.55), FastMath.tan(-1.55), EPSILON);
        Assert.assertEquals(Math.tan(-2.5), FastMath.tan(-2.5), EPSILON);
        Assert.assertEquals(Math.tan(4000000.0), FastMath.tan(4000000.0), 1e-9);
    }

    @Test
    public void testAtan() {
        Assert.assertEquals(0.0, FastMath.atan(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.atan(-0.0), EPSILON);
        Assert.assertEquals(Math.PI / 4.0, FastMath.atan(1.0), EPSILON);
        Assert.assertEquals(-Math.PI / 4.0, FastMath.atan(-1.0), EPSILON);
        Assert.assertEquals(Math.atan(0.5), FastMath.atan(0.5), EPSILON);
        Assert.assertEquals(Math.atan(2.5), FastMath.atan(2.5), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.atan(2e16), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan(-2e16), EPSILON);
    }

    @Test
    public void testAtan2() {
        Assert.assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
        Assert.assertEquals(0.0, FastMath.atan2(0.0, 1.0), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(3.0 * Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 1.0), EPSILON);
        Assert.assertEquals(-Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(-3.0 * Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.atan2(1.0, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(-0.0, FastMath.atan2(-1.0, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.atan2(1.0, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-1.0, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan2(-1.0, 0.0), EPSILON);
        Assert.assertEquals(Math.atan2(1e300, 1e300), FastMath.atan2(1e300, 1e300), EPSILON);
        Assert.assertEquals(Math.atan2(1.0, 2.0), FastMath.atan2(1.0, 2.0), EPSILON);
        Assert.assertEquals(Math.atan2(1.0, -2.0), FastMath.atan2(1.0, -2.0), EPSILON);
        Assert.assertEquals(Math.atan2(-1.0, 2.0), FastMath.atan2(-1.0, 2.0), EPSILON);
        Assert.assertEquals(Math.atan2(-1.0, -2.0), FastMath.atan2(-1.0, -2.0), EPSILON);
    }

    @Test
    public void testAsin() {
        Assert.assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(1.5)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(-1.5)));
        Assert.assertEquals(Math.PI / 2.0, FastMath.asin(1.0), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.asin(0.0), EPSILON);
        Assert.assertEquals(Math.asin(0.5), FastMath.asin(0.5), EPSILON);
        Assert.assertEquals(Math.asin(-0.5), FastMath.asin(-0.5), EPSILON);
    }

    @Test
    public void testAcos() {
        Assert.assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(1.5)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(-1.5)));
        Assert.assertEquals(0.0, FastMath.acos(1.0), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.acos(-1.0), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.acos(0.0), EPSILON);
        Assert.assertEquals(Math.acos(0.5), FastMath.acos(0.5), EPSILON);
        Assert.assertEquals(Math.acos(-0.5), FastMath.acos(-0.5), EPSILON);
    }

    @Test
    public void testCbrt() {
        Assert.assertEquals(0.0, FastMath.cbrt(0.0), EPSILON);
        Assert.assertEquals(-0.0, FastMath.cbrt(-0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.cbrt(Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(2.0, FastMath.cbrt(8.0), EPSILON);
        Assert.assertEquals(-2.0, FastMath.cbrt(-8.0), EPSILON);
        Assert.assertEquals(Math.cbrt(Double.MIN_NORMAL / 8.0), FastMath.cbrt(Double.MIN_NORMAL / 8.0), 1e-300);
        Assert.assertEquals(Math.cbrt(27.0), FastMath.cbrt(27.0), EPSILON);
        Assert.assertEquals(Math.cbrt(64.0), FastMath.cbrt(64.0), EPSILON);
    }

    @Test
    public void testToRadians() {
        Assert.assertEquals(0.0, FastMath.toRadians(0.0), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.toRadians(180.0), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.toRadians(90.0), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.toRadians(-180.0), EPSILON);
    }

    @Test
    public void testToDegrees() {
        Assert.assertEquals(0.0, FastMath.toDegrees(0.0), EPSILON);
        Assert.assertEquals(180.0, FastMath.toDegrees(Math.PI), EPSILON);
        Assert.assertEquals(90.0, FastMath.toDegrees(Math.PI / 2.0), EPSILON);
        Assert.assertEquals(-180.0, FastMath.toDegrees(-Math.PI), EPSILON);
    }

    @Test
    public void testAbsInt() {
        Assert.assertEquals(10, FastMath.abs(10));
        Assert.assertEquals(10, FastMath.abs(-10));
        Assert.assertEquals(0, FastMath.abs(0));
    }

    @Test
    public void testAbsLong() {
        Assert.assertEquals(10L, FastMath.abs(10L));
        Assert.assertEquals(10L, FastMath.abs(-10L));
        Assert.assertEquals(0L, FastMath.abs(0L));
    }

    @Test
    public void testAbsFloat() {
        Assert.assertEquals(10.5f, FastMath.abs(10.5f), 1e-6f);
        Assert.assertEquals(10.5f, FastMath.abs(-10.5f), 1e-6f);
        Assert.assertEquals(0.0f, FastMath.abs(0.0f), 1e-6f);
    }

    @Test
    public void testAbsDouble() {
        Assert.assertEquals(10.5, FastMath.abs(10.5), EPSILON);
        Assert.assertEquals(10.5, FastMath.abs(-10.5), EPSILON);
        Assert.assertEquals(0.0, FastMath.abs(0.0), EPSILON);
    }

    @Test
    public void testUlp() {
        Assert.assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), 0.0);
        Assert.assertEquals(Math.ulp(0.0), FastMath.ulp(0.0), 0.0);
        Assert.assertEquals(Math.ulp(-100.0), FastMath.ulp(-100.0), 0.0);
    }

    @Test
    public void testNextAfter() {
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(1.0, Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.nextAfter(Double.POSITIVE_INFINITY, 1.0), 0.0);
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        Assert.assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);
        Assert.assertEquals(Math.nextAfter(1.0, 2.0), FastMath.nextAfter(1.0, 2.0), 0.0);
        Assert.assertEquals(Math.nextAfter(1.0, 0.0), FastMath.nextAfter(1.0, 0.0), 0.0);
        Assert.assertEquals(Math.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), FastMath.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.nextAfter(2.0, 1.0), FastMath.nextAfter(2.0, 1.0), 0.0);
        Assert.assertEquals(Math.nextAfter(-2.0, -3.0), FastMath.nextAfter(-2.0, -3.0), 0.0);
        Assert.assertEquals(Math.nextAfter(-2.0, -1.0), FastMath.nextAfter(-2.0, -1.0), 0.0);
    }

    @Test
    public void testFloor() {
        Assert.assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
        Assert.assertEquals(1e16, FastMath.floor(1e16), 0.0);
        Assert.assertEquals(-1e16, FastMath.floor(-1e16), 0.0);
        Assert.assertEquals(2.0, FastMath.floor(2.7), 0.0);
        Assert.assertEquals(-3.0, FastMath.floor(-2.7), 0.0);
        Assert.assertEquals(2.0, FastMath.floor(2.0), 0.0);
        Assert.assertEquals(-2.0, FastMath.floor(-2.0), 0.0);
        Assert.assertEquals(0.0, FastMath.floor(0.5), 0.0);
        Assert.assertEquals(-1.0, FastMath.floor(-0.5), 0.0);
        Assert.assertEquals(0.0, FastMath.floor(0.0), 0.0);
    }

    @Test
    public void testCeil() {
        Assert.assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
        Assert.assertEquals(3.0, FastMath.ceil(2.3), 0.0);
        Assert.assertEquals(-2.0, FastMath.ceil(-2.3), 0.0);
        Assert.assertEquals(2.0, FastMath.ceil(2.0), 0.0);
        Assert.assertEquals(-2.0, FastMath.ceil(-2.0), 0.0);
        Assert.assertEquals(0.0, FastMath.ceil(-0.5), 0.0);
    }

    @Test
    public void testRint() {
        Assert.assertEquals(2.0, FastMath.rint(2.1), 0.0);
        Assert.assertEquals(3.0, FastMath.rint(2.9), 0.0);
        Assert.assertEquals(2.0, FastMath.rint(2.5), 0.0);
        Assert.assertEquals(4.0, FastMath.rint(3.5), 0.0);
        Assert.assertEquals(-2.0, FastMath.rint(-2.5), 0.0);
        Assert.assertEquals(-4.0, FastMath.rint(-3.5), 0.0);
    }

    @Test
    public void testRoundDouble() {
        Assert.assertEquals(3L, FastMath.round(2.6));
        Assert.assertEquals(2L, FastMath.round(2.4));
        Assert.assertEquals(-2L, FastMath.round(-2.4));
        Assert.assertEquals(-2L, FastMath.round(-2.6));
    }

    @Test
    public void testRoundFloat() {
        Assert.assertEquals(3, FastMath.round(2.6f));
        Assert.assertEquals(2, FastMath.round(2.4f));
        Assert.assertEquals(-2, FastMath.round(-2.4f));
        Assert.assertEquals(-3, FastMath.round(-2.6f));
    }

    @Test
    public void testMinInt() {
        Assert.assertEquals(1, FastMath.min(1, 2));
        Assert.assertEquals(1, FastMath.min(2, 1));
        Assert.assertEquals(1, FastMath.min(1, 1));
    }

    @Test
    public void testMinLong() {
        Assert.assertEquals(1L, FastMath.min(1L, 2L));
        Assert.assertEquals(1L, FastMath.min(2L, 1L));
        Assert.assertEquals(1L, FastMath.min(1L, 1L));
    }

    @Test
    public void testMinFloat() {
        Assert.assertEquals(1.0f, FastMath.min(1.0f, 2.0f), 0.0f);
        Assert.assertEquals(1.0f, FastMath.min(2.0f, 1.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.min(1.0f, Float.NaN)));
    }

    @Test
    public void testMinDouble() {
        Assert.assertEquals(1.0, FastMath.min(1.0, 2.0), 0.0);
        Assert.assertEquals(1.0, FastMath.min(2.0, 1.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.min(1.0, Double.NaN)));
    }

    @Test
    public void testMaxInt() {
        Assert.assertEquals(2, FastMath.max(1, 2));
        Assert.assertEquals(2, FastMath.max(2, 1));
        Assert.assertEquals(1, FastMath.max(1, 1));
    }

    @Test
    public void testMaxLong() {
        Assert.assertEquals(2L, FastMath.max(1L, 2L));
        Assert.assertEquals(2L, FastMath.max(2L, 1L));
        Assert.assertEquals(1L, FastMath.max(1L, 1L));
    }

    @Test
    public void testMaxFloat() {
        Assert.assertEquals(2.0f, FastMath.max(1.0f, 2.0f), 0.0f);
        Assert.assertEquals(2.0f, FastMath.max(2.0f, 1.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.max(1.0f, Float.NaN)));
    }

    @Test
    public void testMaxDouble() {
        Assert.assertEquals(2.0, FastMath.max(1.0, 2.0), 0.0);
        Assert.assertEquals(2.0, FastMath.max(2.0, 1.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.max(1.0, Double.NaN)));
    }
}
