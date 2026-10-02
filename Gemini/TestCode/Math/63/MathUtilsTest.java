package org.apache.commons.math.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.NonMonotonousSequenceException;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstants() {
        Assert.assertEquals(0x1.0p-53, MathUtils.EPSILON, 0.0);
        Assert.assertEquals(0x1.0p-1022, MathUtils.SAFE_MIN, 0.0);
        Assert.assertEquals(2 * FastMath.PI, MathUtils.TWO_PI, 0.0);
    }

    @Test
    public void testAddAndCheckInt_normal() {
        Assert.assertEquals(5, MathUtils.addAndCheck(2, 3));
        Assert.assertEquals(-5, MathUtils.addAndCheck(-2, -3));
        Assert.assertEquals(1, MathUtils.addAndCheck(3, -2));
        Assert.assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        Assert.assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckInt_overflowPositive() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckInt_overflowNegative() {
        MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testAddAndCheckLong_normal() {
        Assert.assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        Assert.assertEquals(5L, MathUtils.addAndCheck(3L, 2L));
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        Assert.assertEquals(1L, MathUtils.addAndCheck(-2L, 3L));
        Assert.assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
        Assert.assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1L, 1L));
        Assert.assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE + 1L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowPositive() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowPositiveCommutative() {
        MathUtils.addAndCheck(1L, Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowNegative() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowNegativeCommutative() {
        MathUtils.addAndCheck(-1L, Long.MIN_VALUE);
    }

    @Test
    public void testBinomialCoefficient_smallValues() {
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        Assert.assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        Assert.assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        Assert.assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        Assert.assertEquals(10L, MathUtils.binomialCoefficient(5, 3));
    }

    @Test
    public void testBinomialCoefficient_intermediateBranches() {
        // Branch: n <= 61
        Assert.assertEquals(184756L, MathUtils.binomialCoefficient(20, 10));
        // Branch: 61 < n <= 66
        long c62_3 = MathUtils.binomialCoefficient(62, 3);
        Assert.assertEquals(37820L, c62_3);
        long c66_3 = MathUtils.binomialCoefficient(66, 3);
        Assert.assertEquals(45760L, c66_3);
        // Branch: n > 66 but within long bounds
        long c67_2 = MathUtils.binomialCoefficient(67, 2);
        Assert.assertEquals(2211L, c67_2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_invalidOrder() {
        MathUtils.binomialCoefficient(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_negativeParameter() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficient_overflow() {
        MathUtils.binomialCoefficient(67, 30);
    }

    @Test
    public void testBinomialCoefficientDouble() {
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), EPSILON);
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), EPSILON);
        Assert.assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), EPSILON);
        Assert.assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), EPSILON);
        Assert.assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), EPSILON);
        Assert.assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), EPSILON);
        Assert.assertEquals(184756.0, MathUtils.binomialCoefficientDouble(20, 10), EPSILON);

        // n >= 67
        double bcd70_30 = MathUtils.binomialCoefficientDouble(70, 30);
        double bcd70_40 = MathUtils.binomialCoefficientDouble(70, 40);
        Assert.assertEquals(bcd70_30, bcd70_40, 1.0);
        Assert.assertTrue(bcd70_30 > 0);
    }

    @Test
    public void testBinomialCoefficientLog() {
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), EPSILON);
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), EPSILON);
        Assert.assertEquals(FastMath.log(5), MathUtils.binomialCoefficientLog(5, 1), EPSILON);
        Assert.assertEquals(FastMath.log(5), MathUtils.binomialCoefficientLog(5, 4), EPSILON);

        // n < 67
        Assert.assertEquals(FastMath.log(10), MathUtils.binomialCoefficientLog(5, 2), EPSILON);

        // 67 <= n < 1030
        Assert.assertEquals(FastMath.log(MathUtils.binomialCoefficientDouble(100, 10)),
                MathUtils.binomialCoefficientLog(100, 10), 1e-6);

        // n >= 1030
        double log1 = MathUtils.binomialCoefficientLog(1050, 10);
        double log2 = MathUtils.binomialCoefficientLog(1050, 1040);
        Assert.assertEquals(log1, log2, 1e-6);
        Assert.assertTrue(log1 > 0);
    }

    @Test
    public void testCompareTo() {
        Assert.assertEquals(0, MathUtils.compareTo(1.0, 1.0001, 0.01));
        Assert.assertEquals(-1, MathUtils.compareTo(1.0, 2.0, 0.01));
        Assert.assertEquals(1, MathUtils.compareTo(2.0, 1.0, 0.01));
    }

    @Test
    public void testCosh() {
        Assert.assertEquals(1.0, MathUtils.cosh(0.0), EPSILON);
        Assert.assertEquals(Math.cosh(1.5), MathUtils.cosh(1.5), EPSILON);
        Assert.assertEquals(Math.cosh(-2.0), MathUtils.cosh(-2.0), EPSILON);
    }

    @Test
    public void testSinh() {
        Assert.assertEquals(0.0, MathUtils.sinh(0.0), EPSILON);
        Assert.assertEquals(Math.sinh(1.5), MathUtils.sinh(1.5), EPSILON);
        Assert.assertEquals(Math.sinh(-2.0), MathUtils.sinh(-2.0), EPSILON);
    }

    @Test
    public void testEqualsDoubleDouble() {
        Assert.assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        Assert.assertTrue(MathUtils.equals(1.0, 1.0));
        Assert.assertFalse(MathUtils.equals(Double.NaN, 1.0));
        Assert.assertFalse(MathUtils.equals(1.0, Double.NaN));
        Assert.assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsIncludingNaNDoubleDouble() {
        Assert.assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN));
        Assert.assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.0));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(Double.NaN, 1.0));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(1.0, 2.0));
    }

    @Test
    public void testEqualsDoubleDoubleEps() {
        Assert.assertTrue(MathUtils.equals(1.0, 1.05, 0.1));
        Assert.assertFalse(MathUtils.equals(1.0, 1.2, 0.1));
        Assert.assertFalse(MathUtils.equals(Double.NaN, 1.0, 0.1));
    }

    @Test
    public void testEqualsIncludingNaNDoubleDoubleEps() {
        Assert.assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN, 0.1));
        Assert.assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.05, 0.1));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(1.0, 1.2, 0.1));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(Double.NaN, 1.0, 0.1));
    }

    @Test
    public void testEqualsDoubleDoubleMaxUlps() {
        double d1 = 1.0;
        double d2 = Math.nextUp(d1);
        Assert.assertTrue(MathUtils.equals(d1, d2, 1));
        Assert.assertTrue(MathUtils.equals(-1.0, -1.0, 1));
        Assert.assertTrue(MathUtils.equals(-1.0, Math.nextAfter(-1.0, Double.NEGATIVE_INFINITY), 1));
        Assert.assertFalse(MathUtils.equals(1.0, 2.0, 1));
        Assert.assertFalse(MathUtils.equals(Double.NaN, 1.0, 1));
        Assert.assertFalse(MathUtils.equals(1.0, Double.NaN, 1));
        Assert.assertFalse(MathUtils.equals(Double.NaN, Double.NaN, 1));
    }

    @Test
    public void testEqualsIncludingNaNDoubleDoubleMaxUlps() {
        Assert.assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN, 1));
        Assert.assertTrue(MathUtils.equalsIncludingNaN(1.0, Math.nextUp(1.0), 1));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(Double.NaN, 1.0, 1));
    }

    @Test
    public void testEqualsDoubleArray() {
        Assert.assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        Assert.assertFalse(MathUtils.equals(new double[1], null));
        Assert.assertFalse(MathUtils.equals(null, new double[1]));
        Assert.assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        Assert.assertTrue(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}));
        Assert.assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
        Assert.assertTrue(MathUtils.equals(new double[]{Double.NaN}, new double[]{Double.NaN}));
    }

    @Test
    public void testEqualsIncludingNaNDoubleArray() {
        Assert.assertTrue(MathUtils.equalsIncludingNaN((double[]) null, (double[]) null));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(new double[1], null));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(null, new double[1]));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(new double[]{1.0}, new double[]{1.0, 2.0}));
        Assert.assertTrue(MathUtils.equalsIncludingNaN(new double[]{1.0, Double.NaN}, new double[]{1.0, Double.NaN}));
        Assert.assertFalse(MathUtils.equalsIncludingNaN(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(1L, MathUtils.factorial(0));
        Assert.assertEquals(1L, MathUtils.factorial(1));
        Assert.assertEquals(2L, MathUtils.factorial(2));
        Assert.assertEquals(6L, MathUtils.factorial(3));
        Assert.assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_negative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorial_overflow() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorialDouble() {
        Assert.assertEquals(1.0, MathUtils.factorialDouble(0), EPSILON);
        Assert.assertEquals(24.0, MathUtils.factorialDouble(4), EPSILON);
        Assert.assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 1e3);
        double f21 = MathUtils.factorialDouble(21);
        Assert.assertEquals(51090942171709440000.0, f21, 1e7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog() {
        Assert.assertEquals(0.0, MathUtils.factorialLog(0), EPSILON);
        Assert.assertEquals(FastMath.log(24.0), MathUtils.factorialLog(4), EPSILON);
        Assert.assertEquals(FastMath.log(51090942171709440000.0), MathUtils.factorialLog(21), 1e-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcdInt() {
        Assert.assertEquals(0, MathUtils.gcd(0, 0));
        Assert.assertEquals(5, MathUtils.gcd(0, 5));
        Assert.assertEquals(5, MathUtils.gcd(5, 0));
        Assert.assertEquals(5, MathUtils.gcd(0, -5));
        Assert.assertEquals(5, MathUtils.gcd(-5, 0));
        Assert.assertEquals(6, MathUtils.gcd(30, 24));
        Assert.assertEquals(6, MathUtils.gcd(-30, 24));
        Assert.assertEquals(6, MathUtils.gcd(30, -24));
        Assert.assertEquals(6, MathUtils.gcd(-30, -24));
        Assert.assertEquals(1, MathUtils.gcd(17, 19));
        Assert.assertEquals(1 << 5, MathUtils.gcd(1 << 5, 1 << 6));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdInt_minValU() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdInt_minValV() {
        MathUtils.gcd(0, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdInt_overflowBothMin() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testGcdLong() {
        Assert.assertEquals(0L, MathUtils.gcd(0L, 0L));
        Assert.assertEquals(5L, MathUtils.gcd(0L, 5L));
        Assert.assertEquals(5L, MathUtils.gcd(5L, 0L));
        Assert.assertEquals(5L, MathUtils.gcd(0L, -5L));
        Assert.assertEquals(5L, MathUtils.gcd(-5L, 0L));
        Assert.assertEquals(6L, MathUtils.gcd(30L, 24L));
        Assert.assertEquals(6L, MathUtils.gcd(-30L, 24L));
        Assert.assertEquals(6L, MathUtils.gcd(30L, -24L));
        Assert.assertEquals(6L, MathUtils.gcd(-30L, -24L));
        Assert.assertEquals(1L, MathUtils.gcd(17L, 19L));
        Assert.assertEquals(1L << 5, MathUtils.gcd(1L << 5, 1L << 6));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdLong_minValU() {
        MathUtils.gcd(Long.MIN_VALUE, 0L);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdLong_minValV() {
        MathUtils.gcd(0L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdLong_overflowBothMin() {
        MathUtils.gcd(Long.MIN_VALUE, Long.MIN_VALUE);
    }

    @Test
    public void testHash() {
        Assert.assertEquals(new Double(2.5).hashCode(), MathUtils.hash(2.5));
        Assert.assertEquals(java.util.Arrays.hashCode(new double[]{1.0, 2.0}), MathUtils.hash(new double[]{1.0, 2.0}));
        Assert.assertEquals(java.util.Arrays.hashCode((double[]) null), MathUtils.hash((double[]) null));
    }

    @Test
    public void testIndicator() {
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        Assert.assertEquals((byte) -1, MathUtils.indicator((byte) -5));

        Assert.assertEquals((short) 1, MathUtils.indicator((short) 5));
        Assert.assertEquals((short) 1, MathUtils.indicator((short) 0));
        Assert.assertEquals((short) -1, MathUtils.indicator((short) -5));

        Assert.assertEquals(1, MathUtils.indicator(5));
        Assert.assertEquals(1, MathUtils.indicator(0));
        Assert.assertEquals(-1, MathUtils.indicator(-5));

        Assert.assertEquals(1L, MathUtils.indicator(5L));
        Assert.assertEquals(1L, MathUtils.indicator(0L));
        Assert.assertEquals(-1L, MathUtils.indicator(-5L));

        Assert.assertEquals(1.0f, MathUtils.indicator(5.0f), EPSILON);
        Assert.assertEquals(1.0f, MathUtils.indicator(0.0f), EPSILON);
        Assert.assertEquals(-1.0f, MathUtils.indicator(-5.0f), EPSILON);
        Assert.assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));

        Assert.assertEquals(1.0, MathUtils.indicator(5.0), EPSILON);
        Assert.assertEquals(1.0, MathUtils.indicator(0.0), EPSILON);
        Assert.assertEquals(-1.0, MathUtils.indicator(-5.0), EPSILON);
        Assert.assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testLcmInt() {
        Assert.assertEquals(0, MathUtils.lcm(0, 5));
        Assert.assertEquals(0, MathUtils.lcm(5, 0));
        Assert.assertEquals(12, MathUtils.lcm(4, 6));
        Assert.assertEquals(12, MathUtils.lcm(-4, 6));
        Assert.assertEquals(12, MathUtils.lcm(4, -6));
        Assert.assertEquals(12, MathUtils.lcm(-4, -6));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmInt_overflow() {
        MathUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmInt_minValPowerOfTwo() {
        MathUtils.lcm(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testLcmLong() {
        Assert.assertEquals(0L, MathUtils.lcm(0L, 5L));
        Assert.assertEquals(0L, MathUtils.lcm(5L, 0L));
        Assert.assertEquals(12L, MathUtils.lcm(4L, 6L));
        Assert.assertEquals(12L, MathUtils.lcm(-4L, 6L));
        Assert.assertEquals(12L, MathUtils.lcm(4L, -6L));
        Assert.assertEquals(12L, MathUtils.lcm(-4L, -6L));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmLong_overflow() {
        MathUtils.lcm(Long.MAX_VALUE, Long.MAX_VALUE - 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmLong_minValPowerOfTwo() {
        MathUtils.lcm(Long.MIN_VALUE, 1L);
    }

    @Test
    public void testLog() {
        Assert.assertEquals(3.0, MathUtils.log(2.0, 8.0), EPSILON);
        Assert.assertEquals(2.0, MathUtils.log(10.0, 100.0), EPSILON);
    }

    @Test
    public void testMulAndCheckInt() {
        Assert.assertEquals(6, MathUtils.mulAndCheck(2, 3));
        Assert.assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        Assert.assertEquals(0, MathUtils.mulAndCheck(0, 5));
        Assert.assertEquals(Integer.MAX_VALUE, MathUtils.mulAndCheck(Integer.MAX_VALUE, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckInt_overflowPositive() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckInt_overflowNegative() {
        MathUtils.mulAndCheck(Integer.MIN_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLong() {
        Assert.assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(3L, 2L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(-3L, -2L));
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(3L, -2L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, -5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_overflowPositive() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_overflowNegativeBoth() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_overflowNegativePositive() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testScalb() {
        Assert.assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        Assert.assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 5)));
        Assert.assertEquals(8.0, MathUtils.scalb(2.0, 2), EPSILON);
        Assert.assertEquals(0.5, MathUtils.scalb(2.0, -2), EPSILON);
    }

    @Test
    public void testNormalizeAngle() {
        Assert.assertEquals(FastMath.PI, MathUtils.normalizeAngle(FastMath.PI, FastMath.PI), EPSILON);
        Assert.assertEquals(0.0, MathUtils.normalizeAngle(MathUtils.TWO_PI, 0.0), EPSILON);
        Assert.assertEquals(FastMath.PI / 2, MathUtils.normalizeAngle(5 * FastMath.PI / 2, 0.0), EPSILON);
    }

    @Test
    public void testNormalizeArray() {
        double[] input = {1.0, 2.0, 3.0};
        double[] normalized = MathUtils.normalizeArray(input, 12.0);
        Assert.assertEquals(2.0, normalized[0], EPSILON);
        Assert.assertEquals(4.0, normalized[1], EPSILON);
        Assert.assertEquals(6.0, normalized[2], EPSILON);

        double[] inputWithNaN = {1.0, Double.NaN, 3.0};
        double[] normNaN = MathUtils.normalizeArray(inputWithNaN, 8.0);
        Assert.assertEquals(2.0, normNaN[0], EPSILON);
        Assert.assertTrue(Double.isNaN(normNaN[1]));
        Assert.assertEquals(6.0, normNaN[2], EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_infiniteTargetSum() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_nanTargetSum() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_infiniteElement() {
        MathUtils.normalizeArray(new double[]{1.0, Double.POSITIVE_INFINITY}, 10.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_sumToZero() {
        MathUtils.normalizeArray(new double[]{1.0, -1.0}, 10.0);
    }

    @Test
    public void testRoundDouble() {
        Assert.assertEquals(1.23, MathUtils.round(1.23456, 2), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.23556, 2), EPSILON);
        Assert.assertEquals(1.23, MathUtils.round(1.235, 2, BigDecimal.ROUND_DOWN), EPSILON);
        Assert.assertTrue(Double.isInfinite(MathUtils.round(Double.POSITIVE_INFINITY, 2)));
        Assert.assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundFloat() {
        Assert.assertEquals(1.23f, MathUtils.round(1.23456f, 2), 1e-4f);
        Assert.assertEquals(1.24f, MathUtils.round(1.23556f, 2), 1e-4f);

        // Test all BigDecimal rounding modes via round(float, int, int)
        Assert.assertEquals(1.3f, MathUtils.round(1.21f, 1, BigDecimal.ROUND_UP), 1e-4f);
        Assert.assertEquals(-1.3f, MathUtils.round(-1.21f, 1, BigDecimal.ROUND_UP), 1e-4f);

        Assert.assertEquals(1.2f, MathUtils.round(1.29f, 1, BigDecimal.ROUND_DOWN), 1e-4f);
        Assert.assertEquals(-1.2f, MathUtils.round(-1.29f, 1, BigDecimal.ROUND_DOWN), 1e-4f);

        Assert.assertEquals(1.3f, MathUtils.round(1.21f, 1, BigDecimal.ROUND_CEILING), 1e-4f);
        Assert.assertEquals(-1.2f, MathUtils.round(-1.29f, 1, BigDecimal.ROUND_CEILING), 1e-4f);

        Assert.assertEquals(1.2f, MathUtils.round(1.29f, 1, BigDecimal.ROUND_FLOOR), 1e-4f);
        Assert.assertEquals(-1.3f, MathUtils.round(-1.21f, 1, BigDecimal.ROUND_FLOOR), 1e-4f);

        Assert.assertEquals(1.2f, MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_DOWN), 1e-4f);
        Assert.assertEquals(1.3f, MathUtils.round(1.26f, 1, BigDecimal.ROUND_HALF_DOWN), 1e-4f);

        Assert.assertEquals(1.2f, MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-4f);
        Assert.assertEquals(1.4f, MathUtils.round(1.35f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-4f);
        Assert.assertEquals(1.3f, MathUtils.round(1.26f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-4f);
        Assert.assertEquals(1.2f, MathUtils.round(1.24f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-4f);

        Assert.assertEquals(1.3f, MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_UP), 1e-4f);
        Assert.assertEquals(1.2f, MathUtils.round(1.24f, 1, BigDecimal.ROUND_HALF_UP), 1e-4f);

        Assert.assertEquals(1.2f, MathUtils.round(1.2f, 1, BigDecimal.ROUND_UNNECESSARY), 1e-4f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_unnecessaryException() {
        MathUtils.round(1.25f, 1, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidRoundingMode() {
        MathUtils.round(1.25f, 1, -99);
    }

    @Test
    public void testSign() {
        Assert.assertEquals((byte) 1, MathUtils.sign((byte) 5));
        Assert.assertEquals((byte) 0, MathUtils.sign((byte) 0));
        Assert.assertEquals((byte) -1, MathUtils.sign((byte) -5));

        Assert.assertEquals((short) 1, MathUtils.sign((short) 5));
        Assert.assertEquals((short) 0, MathUtils.sign((short) 0));
        Assert.assertEquals((short) -1, MathUtils.sign((short) -5));

        Assert.assertEquals(1, MathUtils.sign(5));
        Assert.assertEquals(0, MathUtils.sign(0));
        Assert.assertEquals(-1, MathUtils.sign(-5));

        Assert.assertEquals(1L, MathUtils.sign(5L));
        Assert.assertEquals(0L, MathUtils.sign(0L));
        Assert.assertEquals(-1L, MathUtils.sign(-5L));

        Assert.assertEquals(1.0f, MathUtils.sign(5.0f), EPSILON);
        Assert.assertEquals(0.0f, MathUtils.sign(0.0f), EPSILON);
        Assert.assertEquals(-1.0f, MathUtils.sign(-5.0f), EPSILON);
        Assert.assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));

        Assert.assertEquals(1.0, MathUtils.sign(5.0), EPSILON);
        Assert.assertEquals(0.0, MathUtils.sign(0.0), EPSILON);
        Assert.assertEquals(-1.0, MathUtils.sign(-5.0), EPSILON);
        Assert.assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    @Test
    public void testSubAndCheckInt() {
        Assert.assertEquals(-1, MathUtils.subAndCheck(2, 3));
        Assert.assertEquals(1, MathUtils.subAndCheck(3, 2));
        Assert.assertEquals(5, MathUtils.subAndCheck(2, -3));
        Assert.assertEquals(-5, MathUtils.subAndCheck(-2, 3));
        Assert.assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckInt_overflowPositive() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckInt_overflowNegative() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testSubAndCheckLong() {
        Assert.assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        Assert.assertEquals(1L, MathUtils.subAndCheck(3L, 2L));
        Assert.assertEquals(5L, MathUtils.subAndCheck(2L, -3L));
        Assert.assertEquals(-5L, MathUtils.subAndCheck(-2L, 3L));
        Assert.assertEquals(-1L, MathUtils.subAndCheck(-1L - Long.MIN_VALUE, Long.MIN_VALUE));
        Assert.assertEquals(0L, MathUtils.subAndCheck(-5L, -5L));
        Assert.assertEquals(-1L, MathUtils.subAndCheck(-1L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowMinValSubtrahend() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowPositive() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    @Test
    public void testPowIntInt() {
        Assert.assertEquals(1, MathUtils.pow(5, 0));
        Assert.assertEquals(5, MathUtils.pow(5, 1));
        Assert.assertEquals(25, MathUtils.pow(5, 2));
        Assert.assertEquals(125, MathUtils.pow(5, 3));
        Assert.assertEquals(-8, MathUtils.pow(-2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntInt_negativeExponent() {
        MathUtils.pow(2, -1);
    }

    @Test
    public void testPowIntLong() {
        Assert.assertEquals(1, MathUtils.pow(5, 0L));
        Assert.assertEquals(5, MathUtils.pow(5, 1L));
        Assert.assertEquals(25, MathUtils.pow(5, 2L));
        Assert.assertEquals(125, MathUtils.pow(5, 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntLong_negativeExponent() {
        MathUtils.pow(2, -1L);
    }

    @Test
    public void testPowLongInt() {
        Assert.assertEquals(1L, MathUtils.pow(5L, 0));
        Assert.assertEquals(5L, MathUtils.pow(5L, 1));
        Assert.assertEquals(25L, MathUtils.pow(5L, 2));
        Assert.assertEquals(125L, MathUtils.pow(5L, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongInt_negativeExponent() {
        MathUtils.pow(2L, -1);
    }

    @Test
    public void testPowLongLong() {
        Assert.assertEquals(1L, MathUtils.pow(5L, 0L));
        Assert.assertEquals(5L, MathUtils.pow(5L, 1L));
        Assert.assertEquals(25L, MathUtils.pow(5L, 2L));
        Assert.assertEquals(125L, MathUtils.pow(5L, 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongLong_negativeExponent() {
        MathUtils.pow(2L, -1L);
    }

    @Test
    public void testPowBigIntegerInt() {
        BigInteger bi = BigInteger.valueOf(5);
        Assert.assertEquals(BigInteger.ONE, MathUtils.pow(bi, 0));
        Assert.assertEquals(bi, MathUtils.pow(bi, 1));
        Assert.assertEquals(BigInteger.valueOf(25), MathUtils.pow(bi, 2));
        Assert.assertEquals(BigInteger.valueOf(125), MathUtils.pow(bi, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerInt_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), -1);
    }

    @Test
    public void testPowBigIntegerLong() {
        BigInteger bi = BigInteger.valueOf(5);
        Assert.assertEquals(BigInteger.ONE, MathUtils.pow(bi, 0L));
        Assert.assertEquals(bi, MathUtils.pow(bi, 1L));
        Assert.assertEquals(BigInteger.valueOf(25), MathUtils.pow(bi, 2L));
        Assert.assertEquals(BigInteger.valueOf(125), MathUtils.pow(bi, 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerLong_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), -1L);
    }

    @Test
    public void testPowBigIntegerBigInteger() {
        BigInteger bi = BigInteger.valueOf(5);
        Assert.assertEquals(BigInteger.ONE, MathUtils.pow(bi, BigInteger.ZERO));
        Assert.assertEquals(bi, MathUtils.pow(bi, BigInteger.ONE));
        Assert.assertEquals(BigInteger.valueOf(25), MathUtils.pow(bi, BigInteger.valueOf(2)));
        Assert.assertEquals(BigInteger.valueOf(125), MathUtils.pow(bi, BigInteger.valueOf(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerBigInteger_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(-1));
    }

    @Test
    public void testDistancesDouble() {
        double[] p1 = {1.0, 2.0, 3.0};
        double[] p2 = {4.0, 6.0, 3.0};

        Assert.assertEquals(7.0, MathUtils.distance1(p1, p2), EPSILON);
        Assert.assertEquals(5.0, MathUtils.distance(p1, p2), EPSILON);
        Assert.assertEquals(4.0, MathUtils.distanceInf(p1, p2), EPSILON);
    }

    @Test
    public void testDistancesInt() {
        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 6, 3};

        Assert.assertEquals(7, MathUtils.distance1(p1, p2));
        Assert.assertEquals(5.0, MathUtils.distance(p1, p2), EPSILON);
        Assert.assertEquals(4, MathUtils.distanceInf(p1, p2));
    }

    @Test
    public void testCheckOrder() {
        double[] incStrict = {1.0, 2.0, 3.0};
        double[] incNonStrict = {1.0, 2.0, 2.0, 3.0};
        double[] decStrict = {3.0, 2.0, 1.0};
        double[] decNonStrict = {3.0, 2.0, 2.0, 1.0};

        MathUtils.checkOrder(incStrict);
        MathUtils.checkOrder(incStrict, MathUtils.OrderDirection.INCREASING, true);
        MathUtils.checkOrder(incNonStrict, MathUtils.OrderDirection.INCREASING, false);
        MathUtils.checkOrder(decStrict, MathUtils.OrderDirection.DECREASING, true);
        MathUtils.checkOrder(decNonStrict, MathUtils.OrderDirection.DECREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_increasingStrictFailEqual() {
        MathUtils.checkOrder(new double[]{1.0, 2.0, 2.0}, MathUtils.OrderDirection.INCREASING, true);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_increasingNonStrictFail() {
        MathUtils.checkOrder(new double[]{1.0, 3.0, 2.0}, MathUtils.OrderDirection.INCREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_decreasingStrictFailEqual() {
        MathUtils.checkOrder(new double[]{3.0, 2.0, 2.0}, MathUtils.OrderDirection.DECREASING, true);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_decreasingNonStrictFail() {
        MathUtils.checkOrder(new double[]{3.0, 1.0, 2.0}, MathUtils.OrderDirection.DECREASING, false);
    }

    @Test
    public void testSafeNorm() {
        // Normal values
        double[] v1 = {3.0, 4.0};
        Assert.assertEquals(5.0, MathUtils.safeNorm(v1), EPSILON);

        // Giant values (s1 != 0 branch)
        double[] vGiant = {1.0e20, 2.0e20, 0.5e20};
        double normGiant = MathUtils.safeNorm(vGiant);
        Assert.assertTrue(normGiant > 1.0e20);

        // Dwarf values only (s1 == 0, s2 == 0, s3 != 0)
        double[] vDwarf = {1.0e-25, 2.0e-25, 0.5e-25, 0.0};
        double normDwarf = MathUtils.safeNorm(vDwarf);
        Assert.assertTrue(normDwarf > 1.0e-25);

        // Dwarf and medium values (s1 == 0, s2 >= x3max)
        double[] vDwarfMed1 = {1.0e-25, 2.0};
        double normDwarfMed1 = MathUtils.safeNorm(vDwarfMed1);
        Assert.assertEquals(2.0, normDwarfMed1, 1e-6);

        // Dwarf and very tiny medium values (s1 == 0, s2 < x3max)
        double[] vDwarfMed2 = {1.0e-21, 1.0e-22};
        double normDwarfMed2 = MathUtils.safeNorm(vDwarfMed2);
        Assert.assertTrue(normDwarfMed2 > 0);

        // Empty array (s1 == 0, s2 == 0, s3 == 0)
        Assert.assertEquals(0.0, MathUtils.safeNorm(new double[0]), 0.0);
    }
}
