package org.apache.commons.math3.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FastMathTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstants() {
        Assert.assertEquals(Math.PI, FastMath.PI, 1e-15);
        Assert.assertEquals(Math.E, FastMath.E, 1e-15);
    }

    @Test
    public void testSqrt_normalAndEdgeCases() {
        Assert.assertEquals(2.0, FastMath.sqrt(4.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.sqrt(0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.sqrt(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sqrt(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testCosh_variousBranches() {
        Assert.assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(1.0, FastMath.cosh(0.0), EPSILON);
        Assert.assertEquals(Math.cosh(2.5), FastMath.cosh(2.5), 1e-10);
        Assert.assertEquals(Math.cosh(-2.5), FastMath.cosh(-2.5), 1e-10);
        Assert.assertEquals(0.5 * FastMath.exp(25.0), FastMath.cosh(25.0), 1e-5);
        Assert.assertEquals(0.5 * FastMath.exp(25.0), FastMath.cosh(-25.0), 1e-5);
    }

    @Test
    public void testSinh_variousBranches() {
        Assert.assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
        Assert.assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.sinh(-0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.sinh(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(0.5 * FastMath.exp(25.0), FastMath.sinh(25.0), 1e-5);
        Assert.assertEquals(-0.5 * FastMath.exp(25.0), FastMath.sinh(-25.0), 1e-5);

        Assert.assertEquals(Math.sinh(1.5), FastMath.sinh(1.5), 1e-10);
        Assert.assertEquals(Math.sinh(-1.5), FastMath.sinh(-1.5), 1e-10);
        Assert.assertEquals(Math.sinh(0.1), FastMath.sinh(0.1), 1e-10);
        Assert.assertEquals(Math.sinh(-0.1), FastMath.sinh(-0.1), 1e-10);
    }

    @Test
    public void testTanh_variousBranches() {
        Assert.assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
        Assert.assertEquals(0.0, FastMath.tanh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.tanh(-0.0), 0.0);
        Assert.assertEquals(1.0, FastMath.tanh(25.0), EPSILON);
        Assert.assertEquals(-1.0, FastMath.tanh(-25.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.tanh(Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(-1.0, FastMath.tanh(Double.NEGATIVE_INFINITY), EPSILON);

        Assert.assertEquals(Math.tanh(1.2), FastMath.tanh(1.2), 1e-10);
        Assert.assertEquals(Math.tanh(-1.2), FastMath.tanh(-1.2), 1e-10);
        Assert.assertEquals(Math.tanh(0.2), FastMath.tanh(0.2), 1e-10);
        Assert.assertEquals(Math.tanh(-0.2), FastMath.tanh(-0.2), 1e-10);
    }

    @Test
    public void testAcosh_variousInputs() {
        Assert.assertEquals(0.0, FastMath.acosh(1.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.acosh(0.5)));
        Assert.assertTrue(Double.isNaN(FastMath.acosh(-2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.acosh(Double.NaN)));
        Assert.assertEquals(FastMath.log(2.0 + FastMath.sqrt(3.0)), FastMath.acosh(2.0), EPSILON);
    }

    @Test
    public void testAsinh_branchCoverage() {
        Assert.assertEquals(0.0, FastMath.asinh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.asinh(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.asinh(Double.NaN)));

        // Range > 0.167
        Assert.assertTrue(FastMath.asinh(2.0) > 0);
        Assert.assertTrue(FastMath.asinh(-2.0) < 0);
        // Range 0.097 < a <= 0.167
        Assert.assertEquals(0.12, FastMath.asinh(0.12), 1e-3);
        Assert.assertEquals(-0.12, FastMath.asinh(-0.12), 1e-3);
        // Range 0.036 < a <= 0.097
        Assert.assertEquals(0.05, FastMath.asinh(0.05), 1e-3);
        Assert.assertEquals(-0.05, FastMath.asinh(-0.05), 1e-3);
        // Range 0.0036 < a <= 0.036
        Assert.assertEquals(0.01, FastMath.asinh(0.01), 1e-4);
        Assert.assertEquals(-0.01, FastMath.asinh(-0.01), 1e-4);
        // Range a <= 0.0036
        Assert.assertEquals(0.001, FastMath.asinh(0.001), 1e-5);
        Assert.assertEquals(-0.001, FastMath.asinh(-0.001), 1e-5);
    }

    @Test
    public void testAtanh_branchCoverage() {
        Assert.assertEquals(0.0, FastMath.atanh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.atanh(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.atanh(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.atanh(1.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.atanh(-1.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.atanh(2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atanh(-2.0)));

        // Range > 0.15
        Assert.assertTrue(FastMath.atanh(0.5) > 0);
        Assert.assertTrue(FastMath.atanh(-0.5) < 0);
        // Range 0.087 < a <= 0.15
        Assert.assertEquals(0.1, FastMath.atanh(0.1), 1e-3);
        Assert.assertEquals(-0.1, FastMath.atanh(-0.1), 1e-3);
        // Range 0.031 < a <= 0.087
        Assert.assertEquals(0.05, FastMath.atanh(0.05), 1e-3);
        Assert.assertEquals(-0.05, FastMath.atanh(-0.05), 1e-3);
        // Range 0.003 < a <= 0.031
        Assert.assertEquals(0.01, FastMath.atanh(0.01), 1e-4);
        Assert.assertEquals(-0.01, FastMath.atanh(-0.01), 1e-4);
        // Range a <= 0.003
        Assert.assertEquals(0.001, FastMath.atanh(0.001), 1e-5);
        Assert.assertEquals(-0.001, FastMath.atanh(-0.001), 1e-5);
    }

    @Test
    public void testSignum_doubleAndFloat() {
        Assert.assertEquals(1.0, FastMath.signum(5.0), 0.0);
        Assert.assertEquals(-1.0, FastMath.signum(-5.0), 0.0);
        Assert.assertEquals(0.0, FastMath.signum(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.signum(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));

        Assert.assertEquals(1.0f, FastMath.signum(5.0f), 0.0f);
        Assert.assertEquals(-1.0f, FastMath.signum(-5.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.signum(0.0f), 0.0f);
        Assert.assertEquals(-0.0f, FastMath.signum(-0.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.signum(Float.NaN)));
    }

    @Test
    public void testNextUp_doubleAndFloat() {
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 0.0);
        Assert.assertEquals(0.0, FastMath.nextUp(-Double.MIN_VALUE), 0.0);
        Assert.assertEquals(Float.MIN_VALUE, FastMath.nextUp(0.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.nextUp(-Float.MIN_VALUE), 0.0f);
    }

    @Test
    public void testRandom_range() {
        for (int i = 0; i < 10; i++) {
            double r = FastMath.random();
            Assert.assertTrue(r >= 0.0 && r < 1.0);
        }
    }

    @Test
    public void testExp_variousRanges() {
        Assert.assertEquals(1.0, FastMath.exp(0.0), EPSILON);
        Assert.assertEquals(Math.E, FastMath.exp(1.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.exp(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.exp(Double.NaN)));

        // Large values
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(710.0), 0.0);
        Assert.assertEquals(0.0, FastMath.exp(-750.0), 0.0);

        // Subnormal output ranges (intVal == 709 and > 709)
        double r709 = FastMath.exp(-709.1);
        Assert.assertTrue(r709 > 0.0 && r709 < 1e-300);
        double r720 = FastMath.exp(-720.0);
        Assert.assertTrue(r720 >= 0.0);

        // Typical negative and positive
        Assert.assertEquals(Math.exp(-2.5), FastMath.exp(-2.5), 1e-10);
        Assert.assertEquals(Math.exp(5.5), FastMath.exp(5.5), 1e-10);
    }

    @Test
    public void testExpm1_variousRanges() {
        Assert.assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.expm1(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.expm1(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(-1.0, FastMath.expm1(Double.NEGATIVE_INFINITY), EPSILON);

        // Large values (x <= -1.0 or x >= 1.0)
        Assert.assertEquals(Math.expm1(2.0), FastMath.expm1(2.0), 1e-10);
        Assert.assertEquals(Math.expm1(-2.0), FastMath.expm1(-2.0), 1e-10);

        // Small values (-1.0 < x < 1.0)
        Assert.assertEquals(Math.expm1(0.5), FastMath.expm1(0.5), 1e-10);
        Assert.assertEquals(Math.expm1(-0.5), FastMath.expm1(-0.5), 1e-10);
        Assert.assertEquals(Math.expm1(1e-5), FastMath.expm1(1e-5), 1e-15);
        Assert.assertEquals(Math.expm1(-1e-5), FastMath.expm1(-1e-5), 1e-15);
    }

    @Test
    public void testLog_variousInputs() {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.log(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.log(1.0), EPSILON);

        // Subnormal number
        double subnormal = Double.longBitsToDouble(0x0000000000000001L);
        Assert.assertTrue(FastMath.log(subnormal) < -700);

        // Near 1.0 (0.99 < x < 1.01)
        Assert.assertEquals(Math.log(1.005), FastMath.log(1.005), 1e-14);
        Assert.assertEquals(Math.log(0.995), FastMath.log(0.995), 1e-14);

        // General values
        Assert.assertEquals(Math.log(10.0), FastMath.log(10.0), 1e-14);
        Assert.assertEquals(Math.log(0.2), FastMath.log(0.2), 1e-14);
    }

    @Test
    public void testLog1p_variousInputs() {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.log1p(-2.0)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.log1p(Double.NaN)));

        // Small x (|x| <= 1e-6)
        Assert.assertEquals(Math.log1p(1e-7), FastMath.log1p(1e-7), 1e-15);
        Assert.assertEquals(Math.log1p(-1e-7), FastMath.log1p(-1e-7), 1e-15);

        // Normal x
        Assert.assertEquals(Math.log1p(0.5), FastMath.log1p(0.5), 1e-14);
        Assert.assertEquals(Math.log1p(-0.5), FastMath.log1p(-0.5), 1e-14);
    }

    @Test
    public void testLog10_and_logBase() {
        Assert.assertEquals(1.0, FastMath.log10(10.0), EPSILON);
        Assert.assertEquals(2.0, FastMath.log10(100.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.log10(-1.0)));

        Assert.assertEquals(3.0, FastMath.log(2.0, 8.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.log(-2.0, 8.0)));
    }

    @Test
    public void testPowDoubleDouble_edgeCases() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.pow(0.0, 0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(2.0, Double.NaN)));

        // Base 0.0
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(0.0, 2.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(-0.0, -2.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.pow(-0.0, 3.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(-0.0, 2.0), 0.0);

        // Base POSITIVE_INFINITY
        Assert.assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 2.0), 0.0);

        // Exponent POSITIVE_INFINITY
        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.POSITIVE_INFINITY)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), 0.0);

        // Base NEGATIVE_INFINITY
        Assert.assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), 0.0);

        // Exponent NEGATIVE_INFINITY
        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.NEGATIVE_INFINITY)));
        Assert.assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 0.0);

        // Negative Base
        Assert.assertEquals(4.0, FastMath.pow(-2.0, 2.0), EPSILON);
        Assert.assertEquals(-8.0, FastMath.pow(-2.0, 3.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
        Assert.assertEquals(1.0, FastMath.pow(-1.0, 4503599627370498.0), EPSILON); // y >= 2^52

        // Large y split path
        Assert.assertEquals(0.0, FastMath.pow(0.5, 1e300), 0.0);

        // Standard power
        Assert.assertEquals(8.0, FastMath.pow(2.0, 3.0), EPSILON);
        Assert.assertEquals(Math.pow(2.3, 4.5), FastMath.pow(2.3, 4.5), 1e-10);
    }

    @Test
    public void testPowDoubleInt() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0), EPSILON);
        Assert.assertEquals(8.0, FastMath.pow(2.0, 3), EPSILON);
        Assert.assertEquals(0.125, FastMath.pow(2.0, -3), EPSILON);
        Assert.assertEquals(1024.0, FastMath.pow(2.0, 10), EPSILON);
        Assert.assertEquals(1.0 / 1024.0, FastMath.pow(2.0, -10), EPSILON);
    }

    @Test
    public void testTrigonometric_sinCosTan() {
        // Zero & NaN & Infinity
        Assert.assertEquals(0.0, FastMath.sin(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.sin(-0.0), 0.0);
        Assert.assertEquals(1.0, FastMath.cos(0.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.tan(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.tan(-0.0), 0.0);

        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));

        // Quadrants and CodyWaite reduction
        double[] angles = {0.1, 0.7, 1.5, 1.55, 2.5, 3.5, 5.0, -0.1, -1.55, -2.5, -5.0};
        for (double a : angles) {
            Assert.assertEquals(Math.sin(a), FastMath.sin(a), 1e-10);
            Assert.assertEquals(Math.cos(a), FastMath.cos(a), 1e-10);
            Assert.assertEquals(Math.tan(a), FastMath.tan(a), 1e-10);
        }

        // Large angles (> 3294198.0 -> PayneHanek reduction)
        double largeAngle = 10000000.0;
        Assert.assertEquals(Math.sin(largeAngle), FastMath.sin(largeAngle), 1e-9);
        Assert.assertEquals(Math.cos(largeAngle), FastMath.cos(largeAngle), 1e-9);
        Assert.assertEquals(Math.tan(largeAngle), FastMath.tan(largeAngle), 1e-9);

        double largeNegAngle = -10000000.0;
        Assert.assertEquals(Math.sin(largeNegAngle), FastMath.sin(largeNegAngle), 1e-9);
        Assert.assertEquals(Math.cos(largeNegAngle), FastMath.cos(largeNegAngle), 1e-9);
        Assert.assertEquals(Math.tan(largeNegAngle), FastMath.tan(largeNegAngle), 1e-9);
    }

    @Test
    public void testAtan_and_Atan2() {
        Assert.assertEquals(0.0, FastMath.atan(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.atan(-0.0), 0.0);
        Assert.assertEquals(Math.PI / 2, FastMath.atan(2e16), 1e-10);
        Assert.assertEquals(-Math.PI / 2, FastMath.atan(-2e16), 1e-10);
        Assert.assertEquals(Math.atan(0.5), FastMath.atan(0.5), 1e-10);
        Assert.assertEquals(Math.atan(-0.5), FastMath.atan(-0.5), 1e-10);
        Assert.assertEquals(Math.atan(2.5), FastMath.atan(2.5), 1e-10);
        Assert.assertEquals(Math.atan(-2.5), FastMath.atan(-2.5), 1e-10);

        // Atan2 edge cases
        Assert.assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));

        Assert.assertEquals(0.0, FastMath.atan2(0.0, 1.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.atan2(-0.0, 1.0), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, Double.NEGATIVE_INFINITY), EPSILON);

        Assert.assertEquals(Math.PI / 4, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(3 * Math.PI / 4, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI / 2, FastMath.atan2(Double.POSITIVE_INFINITY, 1.0), EPSILON);

        Assert.assertEquals(-Math.PI / 4, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(-3 * Math.PI / 4, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI / 2, FastMath.atan2(Double.NEGATIVE_INFINITY, 1.0), EPSILON);

        Assert.assertEquals(0.0, FastMath.atan2(1.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(-0.0, FastMath.atan2(-1.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(1.0, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-1.0, Double.NEGATIVE_INFINITY), EPSILON);

        Assert.assertEquals(Math.PI / 2, FastMath.atan2(1.0, 0.0), EPSILON);
        Assert.assertEquals(-Math.PI / 2, FastMath.atan2(-1.0, 0.0), EPSILON);

        Assert.assertEquals(Math.atan2(3.0, 4.0), FastMath.atan2(3.0, 4.0), 1e-10);
        Assert.assertEquals(Math.atan2(-3.0, 4.0), FastMath.atan2(-3.0, 4.0), 1e-10);
        Assert.assertEquals(Math.atan2(3.0, -4.0), FastMath.atan2(3.0, -4.0), 1e-10);
        Assert.assertEquals(Math.atan2(-3.0, -4.0), FastMath.atan2(-3.0, -4.0), 1e-10);
    }

    @Test
    public void testAsinAcos() {
        Assert.assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(-2.0)));
        Assert.assertEquals(Math.PI / 2, FastMath.asin(1.0), EPSILON);
        Assert.assertEquals(-Math.PI / 2, FastMath.asin(-1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.asin(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.asin(-0.0), 0.0);
        Assert.assertEquals(Math.asin(0.5), FastMath.asin(0.5), 1e-10);
        Assert.assertEquals(Math.asin(-0.5), FastMath.asin(-0.5), 1e-10);

        Assert.assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(-2.0)));
        Assert.assertEquals(0.0, FastMath.acos(1.0), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.acos(-1.0), EPSILON);
        Assert.assertEquals(Math.PI / 2, FastMath.acos(0.0), EPSILON);
        Assert.assertEquals(Math.acos(0.5), FastMath.acos(0.5), 1e-10);
        Assert.assertEquals(Math.acos(-0.5), FastMath.acos(-0.5), 1e-10);
    }

    @Test
    public void testCbrt_variousCases() {
        Assert.assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.cbrt(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.cbrt(Double.NEGATIVE_INFINITY), 0.0);

        // Subnormal
        double subnormal = Double.longBitsToDouble(0x0000000000000001L);
        Assert.assertTrue(FastMath.cbrt(subnormal) > 0.0);

        // Normal powers
        Assert.assertEquals(2.0, FastMath.cbrt(8.0), EPSILON);
        Assert.assertEquals(-2.0, FastMath.cbrt(-8.0), EPSILON);
        Assert.assertEquals(3.0, FastMath.cbrt(27.0), EPSILON);
        Assert.assertEquals(Math.cbrt(100.0), FastMath.cbrt(100.0), 1e-10);
        Assert.assertEquals(Math.cbrt(2.0), FastMath.cbrt(2.0), 1e-10);
        Assert.assertEquals(Math.cbrt(4.0), FastMath.cbrt(4.0), 1e-10);
    }

    @Test
    public void testToRadiansAndToDegrees() {
        Assert.assertEquals(0.0, FastMath.toRadians(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.toRadians(-0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.toRadians(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.toRadians(180.0), EPSILON);

        Assert.assertEquals(0.0, FastMath.toDegrees(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.toDegrees(-0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.toDegrees(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(180.0, FastMath.toDegrees(Math.PI), EPSILON);
    }

    @Test
    public void testAbsMethods() {
        Assert.assertEquals(10, FastMath.abs(-10));
        Assert.assertEquals(10, FastMath.abs(10));
        Assert.assertEquals(10L, FastMath.abs(-10L));
        Assert.assertEquals(10L, FastMath.abs(10L));

        Assert.assertEquals(10.5f, FastMath.abs(-10.5f), 0.0f);
        Assert.assertEquals(10.5f, FastMath.abs(10.5f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.abs(-0.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.abs(0.0f), 0.0f);

        Assert.assertEquals(10.5, FastMath.abs(-10.5), 0.0);
        Assert.assertEquals(10.5, FastMath.abs(10.5), 0.0);
        Assert.assertEquals(0.0, FastMath.abs(-0.0), 0.0);
        Assert.assertEquals(0.0, FastMath.abs(0.0), 0.0);
    }

    @Test
    public void testUlpMethods() {
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), 0.0);
        Assert.assertEquals(Math.ulp(0.0), FastMath.ulp(0.0), 0.0);

        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.POSITIVE_INFINITY), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.NEGATIVE_INFINITY), 0.0f);
        Assert.assertEquals(Math.ulp(1.0f), FastMath.ulp(1.0f), 0.0f);
        Assert.assertEquals(Math.ulp(0.0f), FastMath.ulp(0.0f), 0.0f);
    }

    @Test
    public void testScalbDouble() {
        Assert.assertEquals(8.0, FastMath.scalb(2.0, 2), EPSILON);
        Assert.assertEquals(0.5, FastMath.scalb(2.0, -2), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.scalb(Double.NaN, 5)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
        Assert.assertEquals(0.0, FastMath.scalb(0.0, 5), 0.0);

        // Extreme scaling n < -2098 and n > 2097
        Assert.assertEquals(0.0, FastMath.scalb(1.0, -2100), 0.0);
        Assert.assertEquals(-0.0, FastMath.scalb(-1.0, -2100), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 2100), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.0, 2100), 0.0);

        // Subnormal transitions
        Assert.assertTrue(FastMath.scalb(1.0, -1050) > 0.0);
        Assert.assertEquals(0.0, FastMath.scalb(1.0, -1100), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 1050), 0.0);

        double subnormal = Double.longBitsToDouble(1L);
        Assert.assertTrue(FastMath.scalb(subnormal, 1050) > 0.0);
    }

    @Test
    public void testScalbFloat() {
        Assert.assertEquals(8.0f, FastMath.scalb(2.0f, 2), 0.0f);
        Assert.assertEquals(0.5f, FastMath.scalb(2.0f, -2), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.scalb(Float.NaN, 5)));
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(Float.POSITIVE_INFINITY, 5), 0.0f);
        Assert.assertEquals(0.0f, FastMath.scalb(0.0f, 5), 0.0f);

        // Extreme scaling
        Assert.assertEquals(0.0f, FastMath.scalb(1.0f, -300), 0.0f);
        Assert.assertEquals(-0.0f, FastMath.scalb(-1.0f, -300), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 300), 0.0f);
        Assert.assertEquals(Float.NEGATIVE_INFINITY, FastMath.scalb(-1.0f, 300), 0.0f);

        // Subnormal transitions
        Assert.assertTrue(FastMath.scalb(1.0f, -140) > 0.0f);
        Assert.assertEquals(0.0f, FastMath.scalb(1.0f, -160), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 140), 0.0f);

        float subnormal = Float.intBitsToFloat(1);
        Assert.assertTrue(FastMath.scalb(subnormal, 140) > 0.0f);
    }

    @Test
    public void testNextAfter_doubleAndFloat() {
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(1.0, Double.NaN)));
        Assert.assertEquals(1.0, FastMath.nextAfter(1.0, 1.0), 0.0);
        Assert.assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
        Assert.assertEquals(-Double.MAX_VALUE, FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0), 0.0);
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        Assert.assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);

        Assert.assertTrue(FastMath.nextAfter(1.0, 2.0) > 1.0);
        Assert.assertTrue(FastMath.nextAfter(1.0, 0.0) < 1.0);
        Assert.assertTrue(FastMath.nextAfter(-1.0, -2.0) < -1.0);
        Assert.assertTrue(FastMath.nextAfter(-1.0, 0.0) > -1.0);

        Assert.assertTrue(Float.isNaN(FastMath.nextAfter(Float.NaN, 1.0)));
        Assert.assertTrue(Float.isNaN(FastMath.nextAfter(1.0f, Double.NaN)));
        Assert.assertEquals(1.0f, FastMath.nextAfter(1.0f, 1.0), 0.0f);
        Assert.assertEquals(Float.MAX_VALUE, FastMath.nextAfter(Float.POSITIVE_INFINITY, 0.0), 0.0f);
        Assert.assertEquals(-Float.MAX_VALUE, FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0.0), 0.0f);
        Assert.assertEquals(Float.MIN_VALUE, FastMath.nextAfter(0.0f, 1.0), 0.0f);
        Assert.assertEquals(-Float.MIN_VALUE, FastMath.nextAfter(0.0f, -1.0), 0.0f);

        Assert.assertTrue(FastMath.nextAfter(1.0f, 2.0) > 1.0f);
        Assert.assertTrue(FastMath.nextAfter(1.0f, 0.0) < 1.0f);
        Assert.assertTrue(FastMath.nextAfter(-1.0f, -2.0) < -1.0f);
        Assert.assertTrue(FastMath.nextAfter(-1.0f, 0.0) > -1.0f);
    }

    @Test
    public void testFloorCeilRintRound() {
        Assert.assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
        Assert.assertEquals(5.0, FastMath.floor(5.8), 0.0);
        Assert.assertEquals(-6.0, FastMath.floor(-5.8), 0.0);
        Assert.assertEquals(0.0, FastMath.floor(0.5), 0.0);
        Assert.assertEquals(1e16, FastMath.floor(1e16), 0.0);
        Assert.assertEquals(-1e16, FastMath.floor(-1e16), 0.0);

        Assert.assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
        Assert.assertEquals(6.0, FastMath.ceil(5.2), 0.0);
        Assert.assertEquals(-5.0, FastMath.ceil(-5.8), 0.0);
        Assert.assertEquals(5.0, FastMath.ceil(5.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.ceil(-0.5), 0.0);

        Assert.assertEquals(2.0, FastMath.rint(2.3), 0.0);
        Assert.assertEquals(3.0, FastMath.rint(2.7), 0.0);
        Assert.assertEquals(2.0, FastMath.rint(2.5), 0.0);
        Assert.assertEquals(4.0, FastMath.rint(3.5), 0.0);
        Assert.assertEquals(-0.0, FastMath.rint(-0.5), 0.0);

        Assert.assertEquals(3L, FastMath.round(2.6));
        Assert.assertEquals(2L, FastMath.round(2.4));
        Assert.assertEquals(3, FastMath.round(2.6f));
        Assert.assertEquals(2, FastMath.round(2.4f));
    }

    @Test
    public void testMinMax() {
        Assert.assertEquals(1, FastMath.min(1, 2));
        Assert.assertEquals(1, FastMath.min(2, 1));
        Assert.assertEquals(1L, FastMath.min(1L, 2L));
        Assert.assertEquals(1L, FastMath.min(2L, 1L));

        Assert.assertEquals(1.0f, FastMath.min(1.0f, 2.0f), 0.0f);
        Assert.assertEquals(1.0f, FastMath.min(2.0f, 1.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.min(1.0f, Float.NaN)));
        Assert.assertEquals(-0.0f, FastMath.min(-0.0f, 0.0f), 0.0f);
        Assert.assertEquals(-0.0f, FastMath.min(0.0f, -0.0f), 0.0f);

        Assert.assertEquals(1.0, FastMath.min(1.0, 2.0), 0.0);
        Assert.assertEquals(1.0, FastMath.min(2.0, 1.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.min(1.0, Double.NaN)));
        Assert.assertEquals(-0.0, FastMath.min(-0.0, 0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.min(0.0, -0.0), 0.0);

        Assert.assertEquals(2, FastMath.max(1, 2));
        Assert.assertEquals(2, FastMath.max(2, 1));
        Assert.assertEquals(2L, FastMath.max(1L, 2L));
        Assert.assertEquals(2L, FastMath.max(2L, 1L));

        Assert.assertEquals(2.0f, FastMath.max(1.0f, 2.0f), 0.0f);
        Assert.assertEquals(2.0f, FastMath.max(2.0f, 1.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.max(1.0f, Float.NaN)));
        Assert.assertEquals(0.0f, FastMath.max(-0.0f, 0.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.max(0.0f, -0.0f), 0.0f);

        Assert.assertEquals(2.0, FastMath.max(1.0, 2.0), 0.0);
        Assert.assertEquals(2.0, FastMath.max(2.0, 1.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.max(1.0, Double.NaN)));
        Assert.assertEquals(0.0, FastMath.max(-0.0, 0.0), 0.0);
        Assert.assertEquals(0.0, FastMath.max(0.0, -0.0), 0.0);
    }

    @Test
    public void testHypot() {
        Assert.assertEquals(5.0, FastMath.hypot(3.0, 4.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(1.0, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.hypot(1.0, Double.NaN)));

        // Large difference in exponents
        Assert.assertEquals(1e50, FastMath.hypot(1e50, 1.0), EPSILON);
        Assert.assertEquals(1e50, FastMath.hypot(1.0, 1e50), EPSILON);
    }

    @Test
    public void testIEEEremainder() {
        Assert.assertEquals(StrictMath.IEEEremainder(5.0, 3.0), FastMath.IEEEremainder(5.0, 3.0), EPSILON);
        Assert.assertEquals(StrictMath.IEEEremainder(7.0, 2.5), FastMath.IEEEremainder(7.0, 2.5), EPSILON);
    }

    @Test
    public void testCopySign() {
        Assert.assertEquals(2.0, FastMath.copySign(2.0, 1.0), 0.0);
        Assert.assertEquals(-2.0, FastMath.copySign(2.0, -1.0), 0.0);
        Assert.assertEquals(2.0, FastMath.copySign(-2.0, 1.0), 0.0);
        Assert.assertEquals(-2.0, FastMath.copySign(-2.0, -1.0), 0.0);
        Assert.assertEquals(2.0, FastMath.copySign(-2.0, Double.NaN), 0.0);

        Assert.assertEquals(2.0f, FastMath.copySign(2.0f, 1.0f), 0.0f);
        Assert.assertEquals(-2.0f, FastMath.copySign(2.0f, -1.0f), 0.0f);
        Assert.assertEquals(2.0f, FastMath.copySign(-2.0f, 1.0f), 0.0f);
        Assert.assertEquals(-2.0f, FastMath.copySign(-2.0f, -1.0f), 0.0f);
        Assert.assertEquals(2.0f, FastMath.copySign(-2.0f, Float.NaN), 0.0f);
    }

    @Test
    public void testGetExponent() {
        Assert.assertEquals(3, FastMath.getExponent(8.0));
        Assert.assertEquals(-1, FastMath.getExponent(0.5));
        Assert.assertEquals(3, FastMath.getExponent(8.0f));
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
