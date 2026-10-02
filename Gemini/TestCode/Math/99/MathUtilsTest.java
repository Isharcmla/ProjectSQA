package org.apache.commons.math.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<MathUtils> constructor = MathUtils.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        MathUtils instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testConstants() {
        Assert.assertTrue(MathUtils.EPSILON > 0);
        Assert.assertTrue(MathUtils.SAFE_MIN > 0);
    }

    @Test
    public void testAddAndCheckInt_normal() {
        Assert.assertEquals(5, MathUtils.addAndCheck(2, 3));
        Assert.assertEquals(-5, MathUtils.addAndCheck(-2, -3));
        Assert.assertEquals(1, MathUtils.addAndCheck(-2, 3));
        Assert.assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        Assert.assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckInt_positiveOverflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckInt_negativeOverflow() {
        MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testAddAndCheckLong_normal() {
        Assert.assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        Assert.assertEquals(5L, MathUtils.addAndCheck(3L, 2L)); // triggers a > b
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L)); // triggers a > b for negative
        Assert.assertEquals(1L, MathUtils.addAndCheck(-2L, 3L));
        Assert.assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
        Assert.assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1L, 1L));
        Assert.assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE + 1L, -1L));
        Assert.assertEquals(0L, MathUtils.addAndCheck(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_positiveOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_positiveOverflowReversed() {
        MathUtils.addAndCheck(1L, Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_negativeOverflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_negativeOverflowReversed() {
        MathUtils.addAndCheck(-1L, Long.MIN_VALUE);
    }

    @Test
    public void testBinomialCoefficient_normal() {
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        Assert.assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        Assert.assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        Assert.assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        Assert.assertEquals(10L, MathUtils.binomialCoefficient(5, 3));

        // n <= 61
        Assert.assertEquals(2598960L, MathUtils.binomialCoefficient(52, 5));

        // 61 < n <= 66
        Assert.assertEquals(278256L, MathUtils.binomialCoefficient(66, 3));
        Assert.assertEquals(721934755890025L, MathUtils.binomialCoefficient(66, 17));

        // n > 66
        Assert.assertEquals(365458440L, MathUtils.binomialCoefficient(68, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_nLessThanK() {
        MathUtils.binomialCoefficient(4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_negativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficient_overflow() {
        MathUtils.binomialCoefficient(68, 34);
    }

    @Test
    public void testBinomialCoefficientDouble_normal() {
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(0, 0), 1e-15);
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), 1e-15);
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), 1e-15);
        Assert.assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), 1e-15);
        Assert.assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), 1e-15);
        Assert.assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-15);
        Assert.assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), 1e-15);

        // n < 67
        Assert.assertEquals(2598960.0, MathUtils.binomialCoefficientDouble(52, 5), 1e-9);

        // n >= 67
        double b68_5 = MathUtils.binomialCoefficientDouble(68, 5);
        Assert.assertEquals(365458440.0, b68_5, 1e-9);
        double b68_63 = MathUtils.binomialCoefficientDouble(68, 63);
        Assert.assertEquals(365458440.0, b68_63, 1e-9);

        double large = MathUtils.binomialCoefficientDouble(1030, 515);
        Assert.assertTrue(Double.isInfinite(large) || large > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_nLessThanK() {
        MathUtils.binomialCoefficientDouble(4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_negativeN() {
        MathUtils.binomialCoefficientDouble(-1, 0);
    }

    @Test
    public void testBinomialCoefficientLog_normal() {
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(0, 0), 1e-15);
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 1e-15);
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 1e-15);
        Assert.assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-15);
        Assert.assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), 1e-15);
        Assert.assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-15);

        // n < 67
        Assert.assertEquals(Math.log(2598960.0), MathUtils.binomialCoefficientLog(52, 5), 1e-9);

        // 67 <= n < 1030
        Assert.assertEquals(Math.log(365458440.0), MathUtils.binomialCoefficientLog(68, 5), 1e-9);

        // n >= 1030
        double log1 = MathUtils.binomialCoefficientLog(1050, 10);
        double log2 = MathUtils.binomialCoefficientLog(1050, 1040);
        Assert.assertEquals(log1, log2, 1e-9);
        Assert.assertTrue(log1 > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_nLessThanK() {
        MathUtils.binomialCoefficientLog(4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_negativeN() {
        MathUtils.binomialCoefficientLog(-1, 0);
    }

    @Test
    public void testCosh() {
        Assert.assertEquals(1.0, MathUtils.cosh(0.0), 1e-15);
        Assert.assertEquals(MathUtils.cosh(-2.0), MathUtils.cosh(2.0), 1e-15);
        Assert.assertTrue(MathUtils.cosh(1.0) > 1.0);
    }

    @Test
    public void testSinh() {
        Assert.assertEquals(0.0, MathUtils.sinh(0.0), 1e-15);
        Assert.assertEquals(-MathUtils.sinh(2.0), MathUtils.sinh(-2.0), 1e-15);
    }

    @Test
    public void testEqualsDouble() {
        Assert.assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        Assert.assertFalse(MathUtils.equals(Double.NaN, 1.0));
        Assert.assertFalse(MathUtils.equals(1.0, Double.NaN));
        Assert.assertTrue(MathUtils.equals(1.0, 1.0));
        Assert.assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsDoubleWithEpsilon() {
        Assert.assertTrue(MathUtils.equals(1.0, 1.0, 0.0));
        Assert.assertTrue(MathUtils.equals(1.0, 1.05, 0.1));
        Assert.assertFalse(MathUtils.equals(1.0, 1.15, 0.1));
        Assert.assertTrue(MathUtils.equals(1.05, 1.0, 0.1));
        Assert.assertFalse(MathUtils.equals(1.15, 1.0, 0.1));
    }

    @Test
    public void testEqualsDoubleArray() {
        Assert.assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        Assert.assertFalse(MathUtils.equals(new double[] {1.0}, null));
        Assert.assertFalse(MathUtils.equals(null, new double[] {1.0}));
        Assert.assertTrue(MathUtils.equals(new double[0], new double[0]));
        Assert.assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.0, 2.0}));
        Assert.assertTrue(MathUtils.equals(new double[] {1.0, Double.NaN}, new double[] {1.0, Double.NaN}));
        Assert.assertFalse(MathUtils.equals(new double[] {1.0, 2.0}, new double[] {1.0, 3.0}));
    }

    @Test
    public void testFactorial_normal() {
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
    public void testFactorialDouble_normal() {
        Assert.assertEquals(1.0, MathUtils.factorialDouble(0), 1e-15);
        Assert.assertEquals(120.0, MathUtils.factorialDouble(5), 1e-15);
        Assert.assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), 1e-5);
        Assert.assertTrue(MathUtils.factorialDouble(21) > 2432902008176640000.0);
        Assert.assertTrue(MathUtils.factorialDouble(170) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog_normal() {
        Assert.assertEquals(0.0, MathUtils.factorialLog(0), 1e-15);
        Assert.assertEquals(0.0, MathUtils.factorialLog(1), 1e-15);
        Assert.assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-9);
        Assert.assertTrue(MathUtils.factorialLog(25) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcd_normal() {
        Assert.assertEquals(0, MathUtils.gcd(0, 0));
        Assert.assertEquals(5, MathUtils.gcd(0, 5));
        Assert.assertEquals(5, MathUtils.gcd(5, 0));
        Assert.assertEquals(5, MathUtils.gcd(0, -5));
        Assert.assertEquals(5, MathUtils.gcd(-5, 0));
        Assert.assertEquals(6, MathUtils.gcd(12, 18));
        Assert.assertEquals(6, MathUtils.gcd(-12, 18));
        Assert.assertEquals(6, MathUtils.gcd(12, -18));
        Assert.assertEquals(6, MathUtils.gcd(-12, -18));
        Assert.assertEquals(1, MathUtils.gcd(17, 19));
        Assert.assertEquals(4, MathUtils.gcd(8, 12));
        Assert.assertEquals(3, MathUtils.gcd(9, 6));
        Assert.assertEquals(1, MathUtils.gcd(Integer.MAX_VALUE, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_minAndZero() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_zeroAndMin() {
        MathUtils.gcd(0, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_minAndMin() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testHashDouble() {
        Assert.assertEquals(new Double(1.23).hashCode(), MathUtils.hash(1.23));
        Assert.assertEquals(new Double(0.0).hashCode(), MathUtils.hash(0.0));
        Assert.assertEquals(new Double(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testHashDoubleArray() {
        Assert.assertEquals(0, MathUtils.hash((double[]) null));
        Assert.assertEquals(1, MathUtils.hash(new double[0]));
        double[] arr = new double[] {1.0, 2.0, 3.0};
        Assert.assertTrue(MathUtils.hash(arr) != 0);
    }

    @Test
    public void testIndicatorByte() {
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        Assert.assertEquals((byte) -1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorDouble() {
        Assert.assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        Assert.assertEquals(1.0, MathUtils.indicator(0.0), 1e-15);
        Assert.assertEquals(1.0, MathUtils.indicator(5.5), 1e-15);
        Assert.assertEquals(-1.0, MathUtils.indicator(-5.5), 1e-15);
    }

    @Test
    public void testIndicatorFloat() {
        Assert.assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        Assert.assertEquals(1.0f, MathUtils.indicator(0.0f), 1e-6f);
        Assert.assertEquals(1.0f, MathUtils.indicator(5.5f), 1e-6f);
        Assert.assertEquals(-1.0f, MathUtils.indicator(-5.5f), 1e-6f);
    }

    @Test
    public void testIndicatorInt() {
        Assert.assertEquals(1, MathUtils.indicator(0));
        Assert.assertEquals(1, MathUtils.indicator(5));
        Assert.assertEquals(-1, MathUtils.indicator(-5));
    }

    @Test
    public void testIndicatorLong() {
        Assert.assertEquals(1L, MathUtils.indicator(0L));
        Assert.assertEquals(1L, MathUtils.indicator(5L));
        Assert.assertEquals(-1L, MathUtils.indicator(-5L));
    }

    @Test
    public void testIndicatorShort() {
        Assert.assertEquals((short) 1, MathUtils.indicator((short) 0));
        Assert.assertEquals((short) 1, MathUtils.indicator((short) 5));
        Assert.assertEquals((short) -1, MathUtils.indicator((short) -5));
    }

    @Test
    public void testLcm_normal() {
        Assert.assertEquals(0, MathUtils.lcm(0, 5));
        Assert.assertEquals(0, MathUtils.lcm(5, 0));
        Assert.assertEquals(0, MathUtils.lcm(0, 0));
        Assert.assertEquals(36, MathUtils.lcm(12, 18));
        Assert.assertEquals(36, MathUtils.lcm(-12, 18));
        Assert.assertEquals(36, MathUtils.lcm(12, -18));
        Assert.assertEquals(36, MathUtils.lcm(-12, -18));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcm_overflow() {
        MathUtils.lcm(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testLcm_minValOverflow() {
        MathUtils.lcm(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testLog() {
        Assert.assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-15);
        Assert.assertEquals(2.0, MathUtils.log(10.0, 100.0), 1e-15);
        Assert.assertTrue(Double.isNaN(MathUtils.log(-2.0, 8.0)));
        Assert.assertTrue(Double.isNaN(MathUtils.log(2.0, -8.0)));
        Assert.assertEquals(0.0, MathUtils.log(0.0, 5.0), 1e-15);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(5.0, 0.0), 1e-15);
        Assert.assertTrue(Double.isNaN(MathUtils.log(0.0, 0.0)));
    }

    @Test
    public void testMulAndCheckInt_normal() {
        Assert.assertEquals(6, MathUtils.mulAndCheck(2, 3));
        Assert.assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        Assert.assertEquals(6, MathUtils.mulAndCheck(-2, -3));
        Assert.assertEquals(0, MathUtils.mulAndCheck(0, 5));
        Assert.assertEquals(0, MathUtils.mulAndCheck(5, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckInt_positiveOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckInt_negativeOverflow() {
        MathUtils.mulAndCheck(Integer.MIN_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLong_normal() {
        Assert.assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(3L, 2L)); // symmetry a > b
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(3L, -2L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(-3L, -2L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, -5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_posOverflowBothPos() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_posOverflowBothNeg() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negOverflowNegPos() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testNextAfter() {
        Assert.assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isInfinite(MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0)));
        Assert.assertTrue(Double.isInfinite(MathUtils.nextAfter(Double.NEGATIVE_INFINITY, 1.0)));

        Assert.assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        Assert.assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        // Increase mantissa
        double nextUp = MathUtils.nextAfter(1.0, 2.0);
        Assert.assertTrue(nextUp > 1.0);

        // Mantissa full (overflow exponent)
        double maxMantissa = Double.longBitsToDouble(0x000fffffffffffffL);
        double afterMaxMantissa = MathUtils.nextAfter(maxMantissa, Double.MAX_VALUE);
        Assert.assertTrue(afterMaxMantissa > maxMantissa);

        // Decrease mantissa
        double nextDown = MathUtils.nextAfter(1.0, 0.0);
        Assert.assertTrue(nextDown < 1.0);

        // Mantissa zero (underflow exponent)
        double powerOfTwo = 2.0; // mantissa is 0L
        double beforePowerOfTwo = MathUtils.nextAfter(powerOfTwo, 0.0);
        Assert.assertTrue(beforePowerOfTwo < powerOfTwo);

        // Negative numbers direction
        double negNextUp = MathUtils.nextAfter(-1.0, 0.0); // towards 0 (greater value, decrease mantissa magnitude)
        Assert.assertTrue(negNextUp > -1.0);
    }

    @Test
    public void testScalb() {
        Assert.assertEquals(0.0, MathUtils.scalb(0.0, 2), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 2)));
        Assert.assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 2)));

        Assert.assertEquals(8.0, MathUtils.scalb(2.0, 2), 1e-15);
        Assert.assertEquals(0.5, MathUtils.scalb(2.0, -2), 1e-15);
    }

    @Test
    public void testNormalizeAngle() {
        Assert.assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-15);
        Assert.assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-15);
        Assert.assertEquals(0.0, MathUtils.normalizeAngle(-2 * Math.PI, 0.0), 1e-15);
        Assert.assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-15);
        Assert.assertEquals(Math.PI / 2, MathUtils.normalizeAngle(2.5 * Math.PI, 0.0), 1e-15);
    }

    @Test
    public void testRoundDoubleScale() {
        Assert.assertEquals(1.23, MathUtils.round(1.2345, 2), 1e-15);
        Assert.assertEquals(1.24, MathUtils.round(1.2355, 2), 1e-15);
    }

    @Test
    public void testRoundDoubleRoundingMethods() {
        // Special cases
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2, BigDecimal.ROUND_UP), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2, BigDecimal.ROUND_UP)));

        // Normal rounding methods with positive and negative values
        Assert.assertEquals(1.24, MathUtils.round(1.231, 2, BigDecimal.ROUND_CEILING), 1e-15);
        Assert.assertEquals(-1.23, MathUtils.round(-1.239, 2, BigDecimal.ROUND_CEILING), 1e-15);

        Assert.assertEquals(1.23, MathUtils.round(1.239, 2, BigDecimal.ROUND_DOWN), 1e-15);
        Assert.assertEquals(-1.23, MathUtils.round(-1.239, 2, BigDecimal.ROUND_DOWN), 1e-15);

        Assert.assertEquals(1.23, MathUtils.round(1.239, 2, BigDecimal.ROUND_FLOOR), 1e-15);
        Assert.assertEquals(-1.24, MathUtils.round(-1.231, 2, BigDecimal.ROUND_FLOOR), 1e-15);

        Assert.assertEquals(1.23, MathUtils.round(1.235, 2, BigDecimal.ROUND_HALF_DOWN), 1e-15);
        Assert.assertEquals(1.24, MathUtils.round(1.236, 2, BigDecimal.ROUND_HALF_DOWN), 1e-15);

        Assert.assertEquals(1.24, MathUtils.round(1.235, 2, BigDecimal.ROUND_HALF_UP), 1e-15);
        Assert.assertEquals(1.23, MathUtils.round(1.234, 2, BigDecimal.ROUND_HALF_UP), 1e-15);

        Assert.assertEquals(1.24, MathUtils.round(1.235, 2, BigDecimal.ROUND_HALF_EVEN), 1e-15); // odd rounds up to even
        Assert.assertEquals(1.24, MathUtils.round(1.245, 2, BigDecimal.ROUND_HALF_EVEN), 1e-15); // even rounds down to even
        Assert.assertEquals(1.24, MathUtils.round(1.236, 2, BigDecimal.ROUND_HALF_EVEN), 1e-15);
        Assert.assertEquals(1.23, MathUtils.round(1.234, 2, BigDecimal.ROUND_HALF_EVEN), 1e-15);

        Assert.assertEquals(1.24, MathUtils.round(1.231, 2, BigDecimal.ROUND_UP), 1e-15);

        Assert.assertEquals(1.23, MathUtils.round(1.23, 2, BigDecimal.ROUND_UNNECESSARY), 1e-15);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundDouble_unnecessaryThrows() {
        MathUtils.round(1.234, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundDouble_invalidMethod() {
        MathUtils.round(1.234, 2, 9999);
    }

    @Test
    public void testRoundFloatScale() {
        Assert.assertEquals(1.23f, MathUtils.round(1.2345f, 2), 1e-6f);
        Assert.assertEquals(1.24f, MathUtils.round(1.2355f, 2), 1e-6f);
    }

    @Test
    public void testRoundFloatRoundingMethods() {
        // ROUND_CEILING
        Assert.assertEquals(1.24f, MathUtils.round(1.231f, 2, BigDecimal.ROUND_CEILING), 1e-6f);
        Assert.assertEquals(-1.23f, MathUtils.round(-1.239f, 2, BigDecimal.ROUND_CEILING), 1e-6f);

        // ROUND_DOWN
        Assert.assertEquals(1.23f, MathUtils.round(1.239f, 2, BigDecimal.ROUND_DOWN), 1e-6f);
        Assert.assertEquals(-1.23f, MathUtils.round(-1.239f, 2, BigDecimal.ROUND_DOWN), 1e-6f);

        // ROUND_FLOOR
        Assert.assertEquals(1.23f, MathUtils.round(1.239f, 2, BigDecimal.ROUND_FLOOR), 1e-6f);
        Assert.assertEquals(-1.24f, MathUtils.round(-1.231f, 2, BigDecimal.ROUND_FLOOR), 1e-6f);

        // ROUND_HALF_DOWN
        Assert.assertEquals(1.23f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_DOWN), 1e-6f);
        Assert.assertEquals(1.24f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_HALF_DOWN), 1e-6f);

        // ROUND_HALF_EVEN
        Assert.assertEquals(1.24f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-6f);
        Assert.assertEquals(1.24f, MathUtils.round(1.245f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-6f);
        Assert.assertEquals(1.24f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-6f);
        Assert.assertEquals(1.23f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-6f);

        // ROUND_HALF_UP
        Assert.assertEquals(1.24f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_UP), 1e-6f);
        Assert.assertEquals(1.23f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_HALF_UP), 1e-6f);

        // ROUND_UP
        Assert.assertEquals(1.24f, MathUtils.round(1.231f, 2, BigDecimal.ROUND_UP), 1e-6f);

        // ROUND_UNNECESSARY
        Assert.assertEquals(1.23f, MathUtils.round(1.23f, 2, BigDecimal.ROUND_UNNECESSARY), 1e-6f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_unnecessaryThrows() {
        MathUtils.round(1.234f, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidMethod() {
        MathUtils.round(1.234f, 2, 9999);
    }

    @Test
    public void testSignByte() {
        Assert.assertEquals((byte) 0, MathUtils.sign((byte) 0));
        Assert.assertEquals((byte) 1, MathUtils.sign((byte) 5));
        Assert.assertEquals((byte) -1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignDouble() {
        Assert.assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        Assert.assertEquals(0.0, MathUtils.sign(0.0), 1e-15);
        Assert.assertEquals(1.0, MathUtils.sign(5.5), 1e-15);
        Assert.assertEquals(-1.0, MathUtils.sign(-5.5), 1e-15);
    }

    @Test
    public void testSignFloat() {
        Assert.assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
        Assert.assertEquals(0.0f, MathUtils.sign(0.0f), 1e-6f);
        Assert.assertEquals(1.0f, MathUtils.sign(5.5f), 1e-6f);
        Assert.assertEquals(-1.0f, MathUtils.sign(-5.5f), 1e-6f);
    }

    @Test
    public void testSignInt() {
        Assert.assertEquals(0, MathUtils.sign(0));
        Assert.assertEquals(1, MathUtils.sign(5));
        Assert.assertEquals(-1, MathUtils.sign(-5));
    }

    @Test
    public void testSignLong() {
        Assert.assertEquals(0L, MathUtils.sign(0L));
        Assert.assertEquals(1L, MathUtils.sign(5L));
        Assert.assertEquals(-1L, MathUtils.sign(-5L));
    }

    @Test
    public void testSignShort() {
        Assert.assertEquals((short) 0, MathUtils.sign((short) 0));
        Assert.assertEquals((short) 1, MathUtils.sign((short) 5));
        Assert.assertEquals((short) -1, MathUtils.sign((short) -5));
    }

    @Test
    public void testSubAndCheckInt_normal() {
        Assert.assertEquals(2, MathUtils.subAndCheck(5, 3));
        Assert.assertEquals(-2, MathUtils.subAndCheck(3, 5));
        Assert.assertEquals(8, MathUtils.subAndCheck(5, -3));
        Assert.assertEquals(-8, MathUtils.subAndCheck(-5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckInt_positiveOverflow() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckInt_negativeOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testSubAndCheckLong_normal() {
        Assert.assertEquals(2L, MathUtils.subAndCheck(5L, 3L));
        Assert.assertEquals(-2L, MathUtils.subAndCheck(3L, 5L));
        Assert.assertEquals(8L, MathUtils.subAndCheck(5L, -3L));
        Assert.assertEquals(-8L, MathUtils.subAndCheck(-5L, 3L));
        Assert.assertEquals(-1L, MathUtils.subAndCheck(Long.MIN_VALUE + 1L, Long.MIN_VALUE));
        Assert.assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_positiveOverflow() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_negativeOverflow() {
        MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_minSubtrahendPositiveMinuendOverflow() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_minSubtrahendPositiveMinuendOverflow2() {
        MathUtils.subAndCheck(1L, Long.MIN_VALUE);
    }
}
