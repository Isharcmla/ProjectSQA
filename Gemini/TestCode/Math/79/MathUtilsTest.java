package org.apache.commons.math.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MathUtilsTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstants() {
        assertTrue(MathUtils.EPSILON > 0);
        assertTrue(MathUtils.SAFE_MIN > 0);
        assertEquals(2 * Math.PI, MathUtils.TWO_PI, 1e-15);
    }

    @Test
    public void testAddAndCheckInt_normal() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-5, MathUtils.addAndCheck(-2, -3));
        assertEquals(1, MathUtils.addAndCheck(3, -2));
        assertEquals(0, MathUtils.addAndCheck(0, 0));
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
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
        assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        assertEquals(5L, MathUtils.addAndCheck(3L, 2L)); // a > b branch
        assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        assertEquals(1L, MathUtils.addAndCheck(-2L, 3L));
        assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
        assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1L, 1L));
        assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE + 1L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowPositive() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowNegative() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testBinomialCoefficient_normal() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3)); // k > n/2 symmetry

        // n <= 61
        assertEquals(1144066L, MathUtils.binomialCoefficient(60, 5));

        // 61 < n <= 66
        assertEquals(27457788L, MathUtils.binomialCoefficient(65, 5));

        // n > 66 with small k (result fits in long)
        assertEquals(67L, MathUtils.binomialCoefficient(67, 1));
        assertEquals(2211L, MathUtils.binomialCoefficient(67, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_kGreaterThanN() {
        MathUtils.binomialCoefficient(4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_nNegative() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficient_overflow() {
        MathUtils.binomialCoefficient(67, 30);
    }

    @Test
    public void testBinomialCoefficientDouble_normal() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), EPSILON);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), EPSILON);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), EPSILON);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), EPSILON);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), EPSILON);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), EPSILON);
        assertTrue(MathUtils.binomialCoefficientDouble(70, 30) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_invalid() {
        MathUtils.binomialCoefficientDouble(3, 5);
    }

    @Test
    public void testBinomialCoefficientLog_normal() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), EPSILON);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), EPSILON);
        assertEquals(Math.log(5), MathUtils.binomialCoefficientLog(5, 1), EPSILON);
        assertEquals(Math.log(5), MathUtils.binomialCoefficientLog(5, 4), EPSILON);
        assertEquals(Math.log(10), MathUtils.binomialCoefficientLog(5, 2), EPSILON);
        assertTrue(MathUtils.binomialCoefficientLog(100, 30) > 0);
        assertTrue(MathUtils.binomialCoefficientLog(1100, 50) > 0); // n >= 1030
        assertTrue(MathUtils.binomialCoefficientLog(1100, 1050) > 0); // k > n/2 when n >= 1030
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_invalid() {
        MathUtils.binomialCoefficientLog(2, 4);
    }

    @Test
    public void testCompareTo() {
        assertEquals(0, MathUtils.compareTo(1.0, 1.0, 0.01));
        assertEquals(0, MathUtils.compareTo(1.0, 1.005, 0.01));
        assertEquals(-1, MathUtils.compareTo(1.0, 1.05, 0.01));
        assertEquals(1, MathUtils.compareTo(1.05, 1.0, 0.01));
    }

    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), EPSILON);
        assertEquals(Math.cosh(1.5), MathUtils.cosh(1.5), EPSILON);
        assertEquals(Math.cosh(-1.5), MathUtils.cosh(-1.5), EPSILON);
    }

    @Test
    public void testEqualsDoubleDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertFalse(MathUtils.equals(1.0, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
        assertTrue(MathUtils.equals(0.0, -0.0));
    }

    @Test
    public void testEqualsDoubleDoubleEps() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN, 0.1));
        assertTrue(MathUtils.equals(1.0, 1.05, 0.1));
        assertTrue(MathUtils.equals(1.05, 1.0, 0.1));
        assertFalse(MathUtils.equals(1.0, 1.2, 0.1));
    }

    @Test
    public void testEqualsDoubleDoubleUlps() {
        assertTrue(MathUtils.equals(1.0, Math.nextUp(1.0), 2));
        assertFalse(MathUtils.equals(1.0, 1.0 + 1e-10, 1));
        assertTrue(MathUtils.equals(-1.0, -Math.nextUp(1.0), 2));
        assertFalse(MathUtils.equals(-1.0, 1.0, 10));
    }

    @Test
    public void testEqualsDoubleArrays() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, Double.NaN}, new double[]{1.0, Double.NaN}));
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testFactorial_normal() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(2L, MathUtils.factorial(2));
        assertEquals(6L, MathUtils.factorial(3));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
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
        assertEquals(1.0, MathUtils.factorialDouble(0), EPSILON);
        assertEquals(1.0, MathUtils.factorialDouble(1), EPSILON);
        assertEquals(120.0, MathUtils.factorialDouble(5), EPSILON);
        assertTrue(MathUtils.factorialDouble(25) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog_normal() {
        assertEquals(0.0, MathUtils.factorialLog(0), EPSILON);
        assertEquals(0.0, MathUtils.factorialLog(1), EPSILON);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), EPSILON);
        assertTrue(MathUtils.factorialLog(25) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcd_normal() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(-5, 0));
        assertEquals(5, MathUtils.gcd(0, -5));
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(6, MathUtils.gcd(12, -18));
        assertEquals(6, MathUtils.gcd(-12, -18));
        assertEquals(1, MathUtils.gcd(17, 19));
        assertEquals(4, MathUtils.gcd(12, 8)); // u > 0, v > 0, both even
        assertEquals(1, MathUtils.gcd(15, 28)); // mixed even/odd
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_overflowMinMin() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_overflowMinZero() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_overflowZeroMin() {
        MathUtils.gcd(0, Integer.MIN_VALUE);
    }

    @Test
    public void testHashDouble() {
        int h1 = MathUtils.hash(1.0);
        int h2 = MathUtils.hash(1.0);
        int h3 = MathUtils.hash(2.0);
        assertEquals(h1, h2);
        assertTrue(h1 != h3);
    }

    @Test
    public void testHashDoubleArray() {
        assertEquals(0, MathUtils.hash((double[]) null));
        int h1 = MathUtils.hash(new double[]{1.0, 2.0});
        int h2 = MathUtils.hash(new double[]{1.0, 2.0});
        int h3 = MathUtils.hash(new double[]{2.0, 1.0});
        assertEquals(h1, h2);
        assertTrue(h1 != h3);
    }

    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorDouble() {
        assertEquals(1.0, MathUtils.indicator(5.0), EPSILON);
        assertEquals(1.0, MathUtils.indicator(0.0), EPSILON);
        assertEquals(-1.0, MathUtils.indicator(-5.0), EPSILON);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testIndicatorFloat() {
        assertEquals(1.0f, MathUtils.indicator(5.0f), 1e-6f);
        assertEquals(1.0f, MathUtils.indicator(0.0f), 1e-6f);
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), 1e-6f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(-1, MathUtils.indicator(-5));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-5L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short) 1, MathUtils.indicator((short) 5));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -5));
    }

    @Test
    public void testLcm_normal() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(12, MathUtils.lcm(4, 6));
        assertEquals(12, MathUtils.lcm(-4, 6));
        assertEquals(12, MathUtils.lcm(4, -6));
        assertEquals(12, MathUtils.lcm(-4, -6));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcm_overflow() {
        MathUtils.lcm(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(2.0, 4.0), EPSILON);
        assertEquals(3.0, MathUtils.log(10.0, 1000.0), EPSILON);
    }

    @Test
    public void testMulAndCheckInt_normal() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        assertEquals(6, MathUtils.mulAndCheck(-2, -3));
        assertEquals(0, MathUtils.mulAndCheck(0, 5));
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
    public void testMulAndCheckLong_normal() {
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        assertEquals(6L, MathUtils.mulAndCheck(3L, 2L)); // a > b
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_overflowPosPos() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_overflowNegNeg() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_overflowNegPos() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertTrue(Double.isInfinite(MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0)));
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        // Increase mantissa
        double d1 = 1.0;
        double next1 = MathUtils.nextAfter(d1, 2.0);
        assertTrue(next1 > d1);

        // Increase mantissa across exponent boundary (mantissa == 0x000fffffffffffffL)
        double dMaxMantissa = Double.longBitsToDouble(0x3fefffffffffffffL);
        double nextBoundary = MathUtils.nextAfter(dMaxMantissa, 2.0);
        assertTrue(nextBoundary > dMaxMantissa);

        // Decrease mantissa
        double d2 = 1.5;
        double prev2 = MathUtils.nextAfter(d2, 1.0);
        assertTrue(prev2 < d2);

        // Decrease mantissa across exponent boundary (mantissa == 0L)
        double dZeroMantissa = 1.0; // bits: 0x3ff0000000000000L
        double prevBoundary = MathUtils.nextAfter(dZeroMantissa, 0.0);
        assertTrue(prevBoundary < dZeroMantissa);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 5)));
        assertEquals(8.0, MathUtils.scalb(1.0, 3), EPSILON);
        assertEquals(0.125, MathUtils.scalb(1.0, -3), EPSILON);
        assertEquals(-8.0, MathUtils.scalb(-1.0, 3), EPSILON);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(MathUtils.TWO_PI, 0.0), EPSILON);
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, Math.PI), EPSILON);
        assertEquals(-Math.PI / 2, MathUtils.normalizeAngle(1.5 * Math.PI, 0.0), EPSILON);
    }

    @Test
    public void testNormalizeArray_normal() {
        double[] in = new double[]{1.0, 2.0, 3.0, Double.NaN};
        double[] out = MathUtils.normalizeArray(in, 12.0);
        assertEquals(2.0, out[0], EPSILON);
        assertEquals(4.0, out[1], EPSILON);
        assertEquals(6.0, out[2], EPSILON);
        assertTrue(Double.isNaN(out[3]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_targetInfinite() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_targetNaN() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_containsInfinite() {
        MathUtils.normalizeArray(new double[]{1.0, Double.POSITIVE_INFINITY}, 5.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_zeroSum() {
        MathUtils.normalizeArray(new double[]{1.0, -1.0}, 5.0);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.234, 2), EPSILON);
        assertEquals(1.24, MathUtils.round(1.235, 2), EPSILON);
        assertEquals(1.23, MathUtils.round(1.235, 2, BigDecimal.ROUND_HALF_DOWN), EPSILON);
        assertTrue(Double.isInfinite(MathUtils.round(Double.POSITIVE_INFINITY, 2)));
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundFloat() {
        assertEquals(1.23f, MathUtils.round(1.234f, 2), 1e-5f);
        assertEquals(1.24f, MathUtils.round(1.235f, 2), 1e-5f);

        // Test all switch branches in roundUnscaled through float round
        assertEquals(2.0f, MathUtils.round(1.2f, 0, BigDecimal.ROUND_CEILING), 1e-5f);
        assertEquals(-1.0f, MathUtils.round(-1.2f, 0, BigDecimal.ROUND_CEILING), 1e-5f);

        assertEquals(1.0f, MathUtils.round(1.8f, 0, BigDecimal.ROUND_DOWN), 1e-5f);
        assertEquals(-1.0f, MathUtils.round(-1.8f, 0, BigDecimal.ROUND_DOWN), 1e-5f);

        assertEquals(1.0f, MathUtils.round(1.8f, 0, BigDecimal.ROUND_FLOOR), 1e-5f);
        assertEquals(-2.0f, MathUtils.round(-1.2f, 0, BigDecimal.ROUND_FLOOR), 1e-5f);

        assertEquals(1.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-5f);
        assertEquals(2.0f, MathUtils.round(1.51f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-5f);

        assertEquals(2.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_UP), 1e-5f);
        assertEquals(1.0f, MathUtils.round(1.49f, 0, BigDecimal.ROUND_HALF_UP), 1e-5f);

        // ROUND_HALF_EVEN
        assertEquals(2.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f); // 1.5 -> 2 (even)
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f); // 2.5 -> 2 (even)
        assertEquals(2.0f, MathUtils.round(1.6f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f);
        assertEquals(1.0f, MathUtils.round(1.4f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f);

        assertEquals(2.0f, MathUtils.round(1.1f, 0, BigDecimal.ROUND_UP), 1e-5f);
        assertEquals(1.0f, MathUtils.round(1.0f, 0, BigDecimal.ROUND_UNNECESSARY), 1e-5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_unnecessaryException() {
        MathUtils.round(1.234f, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidRoundingMethod() {
        MathUtils.round(1.234f, 2, -99);
    }

    @Test
    public void testSignByte() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 10));
        assertEquals((byte) -1, MathUtils.sign((byte) -10));
    }

    @Test
    public void testSignDouble() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        assertEquals(1.0, MathUtils.sign(10.5), EPSILON);
        assertEquals(-1.0, MathUtils.sign(-10.5), EPSILON);
    }

    @Test
    public void testSignFloat() {
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
        assertEquals(0.0f, MathUtils.sign(0.0f), 0.0f);
        assertEquals(1.0f, MathUtils.sign(10.5f), 1e-6f);
        assertEquals(-1.0f, MathUtils.sign(-10.5f), 1e-6f);
    }

    @Test
    public void testSignInt() {
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(10));
        assertEquals(-1, MathUtils.sign(-10));
    }

    @Test
    public void testSignLong() {
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(10L));
        assertEquals(-1L, MathUtils.sign(-10L));
    }

    @Test
    public void testSignShort() {
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 10));
        assertEquals((short) -1, MathUtils.sign((short) -10));
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), EPSILON);
        assertEquals(Math.sinh(1.5), MathUtils.sinh(1.5), EPSILON);
        assertEquals(Math.sinh(-1.5), MathUtils.sinh(-1.5), EPSILON);
    }

    @Test
    public void testSubAndCheckInt_normal() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
        assertEquals(-8, MathUtils.subAndCheck(-5, 3));
        assertEquals(0, MathUtils.subAndCheck(0, 0));
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
    public void testSubAndCheckLong_normal() {
        assertEquals(2L, MathUtils.subAndCheck(5L, 3L));
        assertEquals(-8L, MathUtils.subAndCheck(-5L, 3L));
        assertEquals(0L, MathUtils.subAndCheck(0L, 0L));
        assertEquals(-1L, MathUtils.subAndCheck(-2L, Long.MIN_VALUE + 1L));
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowPositive() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowMinVal() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test
    public void testPowIntInt() {
        assertEquals(1, MathUtils.pow(5, 0));
        assertEquals(5, MathUtils.pow(5, 1));
        assertEquals(8, MathUtils.pow(2, 3));
        assertEquals(81, MathUtils.pow(3, 4));
        assertEquals(-8, MathUtils.pow(-2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntInt_negativeExponent() {
        MathUtils.pow(2, -1);
    }

    @Test
    public void testPowIntLong() {
        assertEquals(1, MathUtils.pow(5, 0L));
        assertEquals(5, MathUtils.pow(5, 1L));
        assertEquals(8, MathUtils.pow(2, 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntLong_negativeExponent() {
        MathUtils.pow(2, -1L);
    }

    @Test
    public void testPowLongInt() {
        assertEquals(1L, MathUtils.pow(5L, 0));
        assertEquals(5L, MathUtils.pow(5L, 1));
        assertEquals(8L, MathUtils.pow(2L, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongInt_negativeExponent() {
        MathUtils.pow(2L, -1);
    }

    @Test
    public void testPowLongLong() {
        assertEquals(1L, MathUtils.pow(5L, 0L));
        assertEquals(5L, MathUtils.pow(5L, 1L));
        assertEquals(8L, MathUtils.pow(2L, 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongLong_negativeExponent() {
        MathUtils.pow(2L, -1L);
    }

    @Test
    public void testPowBigIntegerInt() {
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(5), 0));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerInt_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), -1);
    }

    @Test
    public void testPowBigIntegerLong() {
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(5), 0L));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerLong_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), -1L);
    }

    @Test
    public void testPowBigIntegerBigInteger() {
        assertEquals(BigInteger.ONE, MathUtils.pow(BigInteger.valueOf(5), BigInteger.ZERO));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerBigInteger_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(-1));
    }

    @Test
    public void testDistance1Double() {
        double[] p1 = new double[]{1.0, 2.0, 3.0};
        double[] p2 = new double[]{4.0, 0.0, 1.0};
        assertEquals(7.0, MathUtils.distance1(p1, p2), EPSILON);
        assertEquals(0.0, MathUtils.distance1(new double[0], new double[0]), EPSILON);
    }

    @Test
    public void testDistance1Int() {
        int[] p1 = new int[]{1, 2, 3};
        int[] p2 = new int[]{4, 0, 1};
        assertEquals(7, MathUtils.distance1(p1, p2));
        assertEquals(0, MathUtils.distance1(new int[0], new int[0]));
    }

    @Test
    public void testDistanceDouble() {
        double[] p1 = new double[]{1.0, 2.0};
        double[] p2 = new double[]{4.0, 6.0};
        assertEquals(5.0, MathUtils.distance(p1, p2), EPSILON);
        assertEquals(0.0, MathUtils.distance(new double[0], new double[0]), EPSILON);
    }

    @Test
    public void testDistanceInt() {
        int[] p1 = new int[]{1, 2};
        int[] p2 = new int[]{4, 6};
        assertEquals(5.0, MathUtils.distance(p1, p2), EPSILON);
        assertEquals(0.0, MathUtils.distance(new int[0], new int[0]), EPSILON);
    }

    @Test
    public void testDistanceInfDouble() {
        double[] p1 = new double[]{1.0, 5.0, 3.0};
        double[] p2 = new double[]{4.0, 1.0, 1.0};
        assertEquals(4.0, MathUtils.distanceInf(p1, p2), EPSILON);
        assertEquals(0.0, MathUtils.distanceInf(new double[0], new double[0]), EPSILON);
    }

    @Test
    public void testDistanceInfInt() {
        int[] p1 = new int[]{1, 5, 3};
        int[] p2 = new int[]{4, 1, 1};
        assertEquals(4, MathUtils.distanceInf(p1, p2));
        assertEquals(0, MathUtils.distanceInf(new int[0], new int[0]));
    }
}
