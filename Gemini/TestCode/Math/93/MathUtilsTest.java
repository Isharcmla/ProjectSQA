package org.apache.commons.math.util;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MathUtilsTest {

    private static final double EPS = 1e-10;

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<MathUtils> constructor = MathUtils.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        MathUtils instance = constructor.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void testConstants() {
        assertTrue(MathUtils.EPSILON > 0);
        assertTrue(MathUtils.SAFE_MIN > 0);
    }

    @Test
    public void testAddAndCheckInt_normal() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-5, MathUtils.addAndCheck(-2, -3));
        assertEquals(1, MathUtils.addAndCheck(3, -2));
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
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
        assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        assertEquals(5L, MathUtils.addAndCheck(3L, 2L)); // a > b branch
        assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        assertEquals(1L, MathUtils.addAndCheck(-2L, 3L)); // a < 0, b >= 0 branch
        assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
        assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1L, 1L));
        assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE + 1L, -1L));
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
    public void testBinomialCoefficient_specialAndNormal() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3));
        assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
        assertEquals(184756L, MathUtils.binomialCoefficient(20, 10));
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
        MathUtils.binomialCoefficient(100, 50);
    }

    @Test
    public void testBinomialCoefficientDouble_normal() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), EPS);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), EPS);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), EPS);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), EPS);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), EPS);
        assertTrue(Double.isInfinite(MathUtils.binomialCoefficientDouble(1030, 515)) ||
                   MathUtils.binomialCoefficientDouble(1030, 515) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_kGreaterThanN() {
        MathUtils.binomialCoefficientDouble(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_nNegative() {
        MathUtils.binomialCoefficientDouble(-2, 1);
    }

    @Test
    public void testBinomialCoefficientLog_normal() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), EPS);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), EPS);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), EPS);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), EPS);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_kGreaterThanN() {
        MathUtils.binomialCoefficientLog(3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_nNegative() {
        MathUtils.binomialCoefficientLog(-1, -1);
    }

    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), EPS);
        assertEquals((Math.exp(1.0) + Math.exp(-1.0)) / 2.0, MathUtils.cosh(1.0), EPS);
        assertEquals((Math.exp(-2.5) + Math.exp(2.5)) / 2.0, MathUtils.cosh(-2.5), EPS);
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertTrue(MathUtils.equals(0.0, 0.0));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertFalse(MathUtils.equals(1.0, Double.NaN));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsDoubleArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertTrue(MathUtils.equals(new double[]{}, new double[]{}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, Double.NaN, 3.0}, new double[]{1.0, Double.NaN, 3.0}));
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testFactorial_normal() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(2L, MathUtils.factorial(2));
        assertEquals(6L, MathUtils.factorial(3));
        assertEquals(24L, MathUtils.factorial(4));
        assertEquals(120L, MathUtils.factorial(5));
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
        assertEquals(1.0, MathUtils.factorialDouble(0), EPS);
        assertEquals(1.0, MathUtils.factorialDouble(1), EPS);
        assertEquals(120.0, MathUtils.factorialDouble(5), EPS);
        assertEquals(Math.floor(Math.exp(MathUtils.factorialLog(170)) + 0.5), MathUtils.factorialDouble(170), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog_normal() {
        assertEquals(0.0, MathUtils.factorialLog(0), EPS);
        assertEquals(0.0, MathUtils.factorialLog(1), EPS);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcd_normal() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(5, MathUtils.gcd(0, -5));
        assertEquals(5, MathUtils.gcd(-5, 0));
        assertEquals(6, MathUtils.gcd(30, 24));
        assertEquals(6, MathUtils.gcd(-30, 24));
        assertEquals(6, MathUtils.gcd(30, -24));
        assertEquals(6, MathUtils.gcd(-30, -24));
        assertEquals(1, MathUtils.gcd(17, 19));
        assertEquals(8, MathUtils.gcd(24, 16));
        assertEquals(8, MathUtils.gcd(16, 24));
        assertEquals(1 << 15, MathUtils.gcd(1 << 15, 1 << 15));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_overflow() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testHashDouble() {
        assertEquals(new Double(0.0).hashCode(), MathUtils.hash(0.0));
        assertEquals(new Double(123.456).hashCode(), MathUtils.hash(123.456));
        assertEquals(new Double(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testHashDoubleArray() {
        assertEquals(0, MathUtils.hash((double[]) null));
        assertEquals(java.util.Arrays.hashCode(new double[]{1.0, 2.0}), MathUtils.hash(new double[]{1.0, 2.0}));
        assertEquals(java.util.Arrays.hashCode(new double[]{}), MathUtils.hash(new double[]{}));
    }

    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorDouble() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0, MathUtils.indicator(0.0), EPS);
        assertEquals(1.0, MathUtils.indicator(5.5), EPS);
        assertEquals(-1.0, MathUtils.indicator(-5.5), EPS);
    }

    @Test
    public void testIndicatorFloat() {
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        assertEquals(1.0f, MathUtils.indicator(0.0f), 1e-6f);
        assertEquals(1.0f, MathUtils.indicator(5.5f), 1e-6f);
        assertEquals(-1.0f, MathUtils.indicator(-5.5f), 1e-6f);
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(1, MathUtils.indicator(100));
        assertEquals(-1, MathUtils.indicator(-100));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(1L, MathUtils.indicator(100L));
        assertEquals(-1L, MathUtils.indicator(-100L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) 1, MathUtils.indicator((short) 10));
        assertEquals((short) -1, MathUtils.indicator((short) -10));
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
        MathUtils.lcm(Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2);
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(10.0, 100.0), EPS);
        assertEquals(3.0, MathUtils.log(2.0, 8.0), EPS);
        assertTrue(Double.isNaN(MathUtils.log(-2.0, 8.0)));
        assertTrue(Double.isNaN(MathUtils.log(2.0, -8.0)));
        assertEquals(0.0, MathUtils.log(0.0, 5.0), EPS);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.log(2.0, 0.0), EPS);
        assertTrue(Double.isNaN(MathUtils.log(0.0, 0.0)));
    }

    @Test
    public void testMulAndCheckInt_normal() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        assertEquals(6, MathUtils.mulAndCheck(-2, -3));
        assertEquals(0, MathUtils.mulAndCheck(0, 5));
        assertEquals(0, MathUtils.mulAndCheck(5, 0));
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
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, -5L));
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        assertEquals(6L, MathUtils.mulAndCheck(3L, 2L));
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        assertEquals(-6L, MathUtils.mulAndCheck(3L, -2L));
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        assertEquals(6L, MathUtils.mulAndCheck(-3L, -2L));
        assertEquals(Long.MAX_VALUE, MathUtils.mulAndCheck(Long.MAX_VALUE, 1L));
        assertEquals(Long.MIN_VALUE, MathUtils.mulAndCheck(Long.MIN_VALUE, 1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_posPosOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_posPosOverflowSymmetric() {
        MathUtils.mulAndCheck(2L, Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negNegOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negNegOverflowSymmetric() {
        MathUtils.mulAndCheck(-2L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negPosOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_posNegOverflow() {
        MathUtils.mulAndCheck(2L, Long.MIN_VALUE);
    }

    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), 0.0);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        // d * (direction - d) >= 0 (e.g. positive d, increasing direction)
        double d1 = 1.0;
        double next1 = MathUtils.nextAfter(d1, 2.0);
        assertTrue(next1 > d1);

        // mantissa rollover / exponent change on increase
        double maxMantissaDouble = Double.longBitsToDouble(0x3ff0000000000000L | 0x000fffffffffffffL);
        double afterMaxMantissa = MathUtils.nextAfter(maxMantissaDouble, 10.0);
        assertTrue(afterMaxMantissa > maxMantissaDouble);

        // d * (direction - d) < 0 (e.g. positive d, decreasing direction)
        double next2 = MathUtils.nextAfter(d1, 0.5);
        assertTrue(next2 < d1);

        // mantissa == 0 on decrease
        double powerOfTwo = 2.0; // mantissa is 0
        double beforePowerOfTwo = MathUtils.nextAfter(powerOfTwo, 1.0);
        assertTrue(beforePowerOfTwo < powerOfTwo);

        // non-zero mantissa on decrease
        double nonZeroMantissa = 1.5;
        double beforeNonZero = MathUtils.nextAfter(nonZeroMantissa, 1.0);
        assertTrue(beforeNonZero < nonZeroMantissa);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
        assertEquals( Double.NEGATIVE_INFINITY, MathUtils.scalb(Double.NEGATIVE_INFINITY, 5), 0.0);
        assertEquals(8.0, MathUtils.scalb(2.0, 2), EPS);
        assertEquals(0.5, MathUtils.scalb(2.0, -2), EPS);
        assertEquals(-8.0, MathUtils.scalb(-2.0, 2), EPS);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), EPS);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), EPS);
        assertEquals(-Math.PI / 2, MathUtils.normalizeAngle(1.5 * Math.PI, 0.0), EPS);
        assertEquals(Math.PI / 2, MathUtils.normalizeAngle(2.5 * Math.PI, 0.0), EPS);
    }

    @Test
    public void testRoundDouble_twoArgs() {
        assertEquals(1.23, MathUtils.round(1.234, 2), EPS);
        assertEquals(1.24, MathUtils.round(1.235, 2), EPS);
        assertEquals(-1.24, MathUtils.round(-1.235, 2), EPS);
    }

    @Test
    public void testRoundDouble_threeArgs() {
        assertEquals(1.23, MathUtils.round(1.234, 2, BigDecimal.ROUND_HALF_UP), EPS);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, MathUtils.round(Double.NEGATIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP), 0.0);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2, BigDecimal.ROUND_HALF_UP)));
    }

    @Test
    public void testRoundFloat_twoArgs() {
        assertEquals(1.23f, MathUtils.round(1.234f, 2), 1e-5f);
        assertEquals(1.24f, MathUtils.round(1.235f, 2), 1e-5f);
    }

    @Test
    public void testRoundFloat_threeArgs_allModes() {
        // ROUND_CEILING
        assertEquals(2.0f, MathUtils.round(1.2f, 0, BigDecimal.ROUND_CEILING), 1e-5f);
        assertEquals(-1.0f, MathUtils.round(-1.2f, 0, BigDecimal.ROUND_CEILING), 1e-5f);

        // ROUND_DOWN
        assertEquals(1.0f, MathUtils.round(1.8f, 0, BigDecimal.ROUND_DOWN), 1e-5f);
        assertEquals(-1.0f, MathUtils.round(-1.8f, 0, BigDecimal.ROUND_DOWN), 1e-5f);

        // ROUND_FLOOR
        assertEquals(1.0f, MathUtils.round(1.8f, 0, BigDecimal.ROUND_FLOOR), 1e-5f);
        assertEquals(-2.0f, MathUtils.round(-1.2f, 0, BigDecimal.ROUND_FLOOR), 1e-5f);

        // ROUND_HALF_DOWN
        assertEquals(1.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-5f);
        assertEquals(2.0f, MathUtils.round(1.6f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-5f);

        // ROUND_HALF_EVEN
        assertEquals(2.0f, MathUtils.round(1.6f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f);
        assertEquals(1.0f, MathUtils.round(1.4f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f);
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f); // even
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f); // odd -> rounds to 4

        // ROUND_HALF_UP
        assertEquals(2.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_UP), 1e-5f);
        assertEquals(1.0f, MathUtils.round(1.4f, 0, BigDecimal.ROUND_HALF_UP), 1e-5f);

        // ROUND_UNNECESSARY
        assertEquals(2.0f, MathUtils.round(2.0f, 0, BigDecimal.ROUND_UNNECESSARY), 1e-5f);

        // ROUND_UP
        assertEquals(2.0f, MathUtils.round(1.2f, 0, BigDecimal.ROUND_UP), 1e-5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_roundUnnecessaryException() {
        MathUtils.round(1.25f, 1, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidRoundingMethod() {
        MathUtils.round(1.25f, 1, 999);
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
        assertEquals(1.0, MathUtils.sign(10.5), EPS);
        assertEquals(-1.0, MathUtils.sign(-10.5), EPS);
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
        assertEquals(1, MathUtils.sign(100));
        assertEquals(-1, MathUtils.sign(-100));
    }

    @Test
    public void testSignLong() {
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(100L));
        assertEquals(-1L, MathUtils.sign(-100L));
    }

    @Test
    public void testSignShort() {
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 10));
        assertEquals((short) -1, MathUtils.sign((short) -10));
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), EPS);
        assertEquals((Math.exp(1.0) - Math.exp(-1.0)) / 2.0, MathUtils.sinh(1.0), EPS);
        assertEquals((Math.exp(-2.0) - Math.exp(2.0)) / 2.0, MathUtils.sinh(-2.0), EPS);
    }

    @Test
    public void testSubAndCheckInt_normal() {
        assertEquals(-1, MathUtils.subAndCheck(2, 3));
        assertEquals(1, MathUtils.subAndCheck(3, 2));
        assertEquals(5, MathUtils.subAndCheck(2, -3));
        assertEquals(-5, MathUtils.subAndCheck(-2, 3));
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE + 1, 1));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE - 1, -1));
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
        assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        assertEquals(1L, MathUtils.subAndCheck(3L, 2L));
        assertEquals(5L, MathUtils.subAndCheck(2L, -3L));
        assertEquals(-5L, MathUtils.subAndCheck(-2L, 3L));
        assertEquals(-1L, MathUtils.subAndCheck(-1L - Long.MIN_VALUE, Long.MIN_VALUE));
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
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
}
