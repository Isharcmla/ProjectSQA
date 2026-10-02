package org.apache.commons.math.util;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testConstants() {
        Assert.assertEquals(0x1.0p-53, MathUtils.EPSILON, 0.0);
        Assert.assertEquals(0x1.0p-1022, MathUtils.SAFE_MIN, 0.0);
    }

    @Test
    public void testAddAndCheckInt_normal() {
        Assert.assertEquals(5, MathUtils.addAndCheck(2, 3));
        Assert.assertEquals(-5, MathUtils.addAndCheck(-2, -3));
        Assert.assertEquals(0, MathUtils.addAndCheck(0, 0));
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
        Assert.assertEquals(5L, MathUtils.addAndCheck(3L, 2L));
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        Assert.assertEquals(1L, MathUtils.addAndCheck(-2L, 3L));
        Assert.assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
        Assert.assertEquals(0L, MathUtils.addAndCheck(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_positiveOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_positiveOverflowSymmetric() {
        MathUtils.addAndCheck(1L, Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_negativeOverflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_negativeOverflowSymmetric() {
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
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_kGreaterThanN() {
        MathUtils.binomialCoefficient(4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_negativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficient_overflow() {
        MathUtils.binomialCoefficient(67, 33);
    }

    @Test
    public void testBinomialCoefficientDouble_normal() {
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(0, 0), 1e-10);
        Assert.assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-10);
        Assert.assertTrue(MathUtils.binomialCoefficientDouble(1030, 515) > 0);
    }

    @Test
    public void testBinomialCoefficientLog_normal() {
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(0, 0), 1e-10);
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 1e-10);
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 1e-10);
        Assert.assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-10);
        Assert.assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), 1e-10);
        Assert.assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_kGreaterThanN() {
        MathUtils.binomialCoefficientLog(3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_negativeN() {
        MathUtils.binomialCoefficientLog(-2, -1);
    }

    @Test
    public void testCosh() {
        Assert.assertEquals(1.0, MathUtils.cosh(0.0), 1e-10);
        Assert.assertEquals(Math.cosh(1.5), MathUtils.cosh(1.5), 1e-10);
        Assert.assertEquals(Math.cosh(-2.0), MathUtils.cosh(-2.0), 1e-10);
    }

    @Test
    public void testEqualsDouble() {
        Assert.assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        Assert.assertFalse(MathUtils.equals(Double.NaN, 1.0));
        Assert.assertFalse(MathUtils.equals(1.0, Double.NaN));
        Assert.assertTrue(MathUtils.equals(1.234, 1.234));
        Assert.assertFalse(MathUtils.equals(1.234, 1.235));
    }

    @Test
    public void testEqualsDoubleArray() {
        Assert.assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        Assert.assertFalse(MathUtils.equals(new double[]{1.0}, null));
        Assert.assertFalse(MathUtils.equals(null, new double[]{1.0}));
        Assert.assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        Assert.assertTrue(MathUtils.equals(new double[]{}, new double[]{}));
        Assert.assertTrue(MathUtils.equals(new double[]{1.0, Double.NaN, 3.0}, new double[]{1.0, Double.NaN, 3.0}));
        Assert.assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testFactorial_normal() {
        Assert.assertEquals(1L, MathUtils.factorial(0));
        Assert.assertEquals(1L, MathUtils.factorial(1));
        Assert.assertEquals(120L, MathUtils.factorial(5));
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
        Assert.assertEquals(1.0, MathUtils.factorialDouble(0), 1e-10);
        Assert.assertEquals(120.0, MathUtils.factorialDouble(5), 1e-10);
        Assert.assertTrue(Double.isInfinite(MathUtils.factorialDouble(171)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-5);
    }

    @Test
    public void testFactorialLog_normal() {
        Assert.assertEquals(0.0, MathUtils.factorialLog(0), 1e-10);
        Assert.assertEquals(0.0, MathUtils.factorialLog(1), 1e-10);
        Assert.assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcd() {
        Assert.assertEquals(6, MathUtils.gcd(0, 6));
        Assert.assertEquals(6, MathUtils.gcd(6, 0));
        Assert.assertEquals(0, MathUtils.gcd(0, 0));
        Assert.assertEquals(6, MathUtils.gcd(54, 24));
        Assert.assertEquals(6, MathUtils.gcd(-54, 24));
        Assert.assertEquals(6, MathUtils.gcd(54, -24));
        Assert.assertEquals(6, MathUtils.gcd(-54, -24));
        Assert.assertEquals(1, MathUtils.gcd(17, 13));
        Assert.assertEquals(8, MathUtils.gcd(24, 16));
        Assert.assertEquals(1, MathUtils.gcd(1, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_overflow() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test
    public void testHashDouble() {
        Assert.assertEquals(new Double(123.456).hashCode(), MathUtils.hash(123.456));
        Assert.assertEquals(new Double(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testHashDoubleArray() {
        double[] array = new double[]{1.0, 2.0, 3.0};
        Assert.assertEquals(java.util.Arrays.hashCode(array), MathUtils.hash(array));
        Assert.assertEquals(0, MathUtils.hash((double[]) null));
    }

    @Test
    public void testIndicatorByte() {
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 10));
        Assert.assertEquals((byte) -1, MathUtils.indicator((byte) -10));
    }

    @Test
    public void testIndicatorDouble() {
        Assert.assertEquals(1.0, MathUtils.indicator(0.0), 0.0);
        Assert.assertEquals(1.0, MathUtils.indicator(5.5), 0.0);
        Assert.assertEquals(-1.0, MathUtils.indicator(-5.5), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testIndicatorFloat() {
        Assert.assertEquals(1.0f, MathUtils.indicator(0.0f), 0.0f);
        Assert.assertEquals(1.0f, MathUtils.indicator(5.5f), 0.0f);
        Assert.assertEquals(-1.0f, MathUtils.indicator(-5.5f), 0.0f);
        Assert.assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorInt() {
        Assert.assertEquals(1, MathUtils.indicator(0));
        Assert.assertEquals(1, MathUtils.indicator(42));
        Assert.assertEquals(-1, MathUtils.indicator(-42));
    }

    @Test
    public void testIndicatorLong() {
        Assert.assertEquals(1L, MathUtils.indicator(0L));
        Assert.assertEquals(1L, MathUtils.indicator(42L));
        Assert.assertEquals(-1L, MathUtils.indicator(-42L));
    }

    @Test
    public void testIndicatorShort() {
        Assert.assertEquals((short) 1, MathUtils.indicator((short) 0));
        Assert.assertEquals((short) 1, MathUtils.indicator((short) 42));
        Assert.assertEquals((short) -1, MathUtils.indicator((short) -42));
    }

    @Test
    public void testLcm() {
        Assert.assertEquals(12, MathUtils.lcm(4, 6));
        Assert.assertEquals(12, MathUtils.lcm(-4, 6));
        Assert.assertEquals(12, MathUtils.lcm(4, -6));
        Assert.assertEquals(12, MathUtils.lcm(-4, -6));
        Assert.assertEquals(0, MathUtils.lcm(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcm_overflow() {
        MathUtils.lcm(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testLog() {
        Assert.assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-10);
        Assert.assertEquals(2.0, MathUtils.log(10.0, 100.0), 1e-10);
    }

    @Test
    public void testMulAndCheckInt_normal() {
        Assert.assertEquals(6, MathUtils.mulAndCheck(2, 3));
        Assert.assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        Assert.assertEquals(6, MathUtils.mulAndCheck(-2, -3));
        Assert.assertEquals(0, MathUtils.mulAndCheck(0, 5));
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
        Assert.assertEquals(6L, MathUtils.mulAndCheck(3L, 2L));
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(3L, -2L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(-3L, -2L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, -5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_positiveOverflowPositivePositive() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_positiveOverflowNegativeNegative() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negativeOverflowNegativePositive() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testNextAfter() {
        Assert.assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 0.0);
        Assert.assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        Assert.assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        double nextUp = MathUtils.nextAfter(1.0, 2.0);
        Assert.assertTrue(nextUp > 1.0);

        double nextDown = MathUtils.nextAfter(1.0, 0.0);
        Assert.assertTrue(nextDown < 1.0);

        double maxMantissa = Double.longBitsToDouble(0x000fffffffffffffL);
        double nextMaxMantissa = MathUtils.nextAfter(maxMantissa, Double.POSITIVE_INFINITY);
        Assert.assertTrue(nextMaxMantissa > maxMantissa);

        double zeroMantissa = Double.longBitsToDouble(0x0010000000000000L);
        double prevZeroMantissa = MathUtils.nextAfter(zeroMantissa, Double.NEGATIVE_INFINITY);
        Assert.assertTrue(prevZeroMantissa < zeroMantissa);
    }

    @Test
    public void testScalb() {
        Assert.assertEquals(0.0, MathUtils.scalb(0.0, 2), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 2)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 2), 0.0);
        Assert.assertEquals(8.0, MathUtils.scalb(2.0, 2), 1e-10);
        Assert.assertEquals(0.5, MathUtils.scalb(2.0, -2), 1e-10);
    }

    @Test
    public void testNormalizeAngle() {
        Assert.assertEquals(Math.PI / 2, MathUtils.normalizeAngle(Math.PI / 2, 0.0), 1e-10);
        Assert.assertEquals(Math.PI / 2, MathUtils.normalizeAngle(5 * Math.PI / 2, 0.0), 1e-10);
        Assert.assertEquals(3 * Math.PI / 2, MathUtils.normalizeAngle(-Math.PI / 2, Math.PI), 1e-10);
    }

    @Test
    public void testRoundDouble() {
        Assert.assertEquals(1.23, MathUtils.round(1.234, 2), 1e-10);
        Assert.assertEquals(1.24, MathUtils.round(1.235, 2), 1e-10);
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundFloat_allModes() {
        Assert.assertEquals(1.23f, MathUtils.round(1.234f, 2), 1e-5f);

        // ROUND_CEILING
        Assert.assertEquals(1.3f, MathUtils.round(1.21f, 1, BigDecimal.ROUND_CEILING), 1e-5f);
        Assert.assertEquals(-1.2f, MathUtils.round(-1.21f, 1, BigDecimal.ROUND_CEILING), 1e-5f);

        // ROUND_DOWN
        Assert.assertEquals(1.2f, MathUtils.round(1.29f, 1, BigDecimal.ROUND_DOWN), 1e-5f);
        Assert.assertEquals(-1.2f, MathUtils.round(-1.29f, 1, BigDecimal.ROUND_DOWN), 1e-5f);

        // ROUND_FLOOR
        Assert.assertEquals(1.2f, MathUtils.round(1.29f, 1, BigDecimal.ROUND_FLOOR), 1e-5f);
        Assert.assertEquals(-1.3f, MathUtils.round(-1.21f, 1, BigDecimal.ROUND_FLOOR), 1e-5f);

        // ROUND_HALF_DOWN
        Assert.assertEquals(1.2f, MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_DOWN), 1e-5f);
        Assert.assertEquals(1.3f, MathUtils.round(1.26f, 1, BigDecimal.ROUND_HALF_DOWN), 1e-5f);

        // ROUND_HALF_EVEN
        Assert.assertEquals(1.2f, MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-5f);
        Assert.assertEquals(1.4f, MathUtils.round(1.35f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-5f);
        Assert.assertEquals(1.2f, MathUtils.round(1.24f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-5f);
        Assert.assertEquals(1.3f, MathUtils.round(1.26f, 1, BigDecimal.ROUND_HALF_EVEN), 1e-5f);

        // ROUND_HALF_UP
        Assert.assertEquals(1.3f, MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_UP), 1e-5f);
        Assert.assertEquals(1.2f, MathUtils.round(1.24f, 1, BigDecimal.ROUND_HALF_UP), 1e-5f);

        // ROUND_UP
        Assert.assertEquals(1.3f, MathUtils.round(1.21f, 1, BigDecimal.ROUND_UP), 1e-5f);

        // ROUND_UNNECESSARY
        Assert.assertEquals(1.2f, MathUtils.round(1.20f, 1, BigDecimal.ROUND_UNNECESSARY), 1e-5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_roundUnnecessaryException() {
        MathUtils.round(1.25f, 1, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidRoundingMethod() {
        MathUtils.round(1.25f, 1, 9999);
    }

    @Test
    public void testSignByte() {
        Assert.assertEquals((byte) 0, MathUtils.sign((byte) 0));
        Assert.assertEquals((byte) 1, MathUtils.sign((byte) 10));
        Assert.assertEquals((byte) -1, MathUtils.sign((byte) -10));
    }

    @Test
    public void testSignDouble() {
        Assert.assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        Assert.assertEquals(1.0, MathUtils.sign(5.5), 0.0);
        Assert.assertEquals(-1.0, MathUtils.sign(-5.5), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    @Test
    public void testSignFloat() {
        Assert.assertEquals(0.0f, MathUtils.sign(0.0f), 0.0f);
        Assert.assertEquals(1.0f, MathUtils.sign(5.5f), 0.0f);
        Assert.assertEquals(-1.0f, MathUtils.sign(-5.5f), 0.0f);
        Assert.assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSignInt() {
        Assert.assertEquals(0, MathUtils.sign(0));
        Assert.assertEquals(1, MathUtils.sign(42));
        Assert.assertEquals(-1, MathUtils.sign(-42));
    }

    @Test
    public void testSignLong() {
        Assert.assertEquals(0L, MathUtils.sign(0L));
        Assert.assertEquals(1L, MathUtils.sign(42L));
        Assert.assertEquals(-1L, MathUtils.sign(-42L));
    }

    @Test
    public void testSignShort() {
        Assert.assertEquals((short) 0, MathUtils.sign((short) 0));
        Assert.assertEquals((short) 1, MathUtils.sign((short) 42));
        Assert.assertEquals((short) -1, MathUtils.sign((short) -42));
    }

    @Test
    public void testSinh() {
        Assert.assertEquals(0.0, MathUtils.sinh(0.0), 1e-10);
        Assert.assertEquals(Math.sinh(1.5), MathUtils.sinh(1.5), 1e-10);
        Assert.assertEquals(Math.sinh(-2.0), MathUtils.sinh(-2.0), 1e-10);
    }

    @Test
    public void testSubAndCheckInt_normal() {
        Assert.assertEquals(2, MathUtils.subAndCheck(5, 3));
        Assert.assertEquals(-2, MathUtils.subAndCheck(3, 5));
        Assert.assertEquals(0, MathUtils.subAndCheck(0, 0));
        Assert.assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE + 1, 1));
        Assert.assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE - 1, -1));
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
        Assert.assertEquals(0L, MathUtils.subAndCheck(0L, 0L));
        Assert.assertEquals(1L, MathUtils.subAndCheck(Long.MIN_VALUE + 1, Long.MIN_VALUE));
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
    public void testSubAndCheckLong_minValOverflowWithNonNegativeA() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }
}
