package org.apache.commons.math.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link MathUtils}.
 */
public class MathUtilsTest {

    private static final double EPSILON = 10e-15;

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
        Assert.assertEquals(0x1.0p-53, MathUtils.EPSILON, 0.0);
        Assert.assertEquals(0x1.0p-1022, MathUtils.SAFE_MIN, 0.0);
    }

    @Test
    public void testAddAndCheckInt() {
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
    public void testAddAndCheckLong() {
        Assert.assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        Assert.assertEquals(5L, MathUtils.addAndCheck(3L, 2L));
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        Assert.assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        Assert.assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
        Assert.assertEquals(1L, MathUtils.addAndCheck(-2L, 3L));
        Assert.assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1L, 1L));
        Assert.assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE + 1L, -1L));
        Assert.assertEquals(0L, MathUtils.addAndCheck(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowPositive() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowPositiveSymmetric() {
        MathUtils.addAndCheck(1L, Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowNegative() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_overflowNegativeSymmetric() {
        MathUtils.addAndCheck(-1L, Long.MIN_VALUE);
    }

    @Test
    public void testSubAndCheckInt() {
        Assert.assertEquals(1, MathUtils.subAndCheck(3, 2));
        Assert.assertEquals(-1, MathUtils.subAndCheck(2, 3));
        Assert.assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE + 1, 1));
        Assert.assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE - 1, -1));
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
        Assert.assertEquals(1L, MathUtils.subAndCheck(3L, 2L));
        Assert.assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        Assert.assertEquals(0L, MathUtils.subAndCheck(-5L, -5L));
        Assert.assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
        Assert.assertEquals(1L, MathUtils.subAndCheck(Long.MIN_VALUE + 1L, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowPositive() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowNegative() {
        MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowMinValSubtrahend() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test
    public void testMulAndCheckInt() {
        Assert.assertEquals(6, MathUtils.mulAndCheck(2, 3));
        Assert.assertEquals(-6, MathUtils.mulAndCheck(-2, 3));
        Assert.assertEquals(6, MathUtils.mulAndCheck(-2, -3));
        Assert.assertEquals(0, MathUtils.mulAndCheck(0, 5));
        Assert.assertEquals(0, MathUtils.mulAndCheck(5, 0));
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
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        Assert.assertEquals(-6L, MathUtils.mulAndCheck(3L, -2L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        Assert.assertEquals(6L, MathUtils.mulAndCheck(-3L, -2L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(0L, -5L));
        Assert.assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        Assert.assertEquals(Long.MAX_VALUE, MathUtils.mulAndCheck(Long.MAX_VALUE, 1L));
        Assert.assertEquals(Long.MIN_VALUE, MathUtils.mulAndCheck(Long.MIN_VALUE, 1L));
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

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_overflowPosNeg() {
        MathUtils.mulAndCheck(2L, Long.MIN_VALUE);
    }

    @Test
    public void testBinomialCoefficient() {
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(0, 0));
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        Assert.assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        Assert.assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        Assert.assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        Assert.assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        Assert.assertEquals(10L, MathUtils.binomialCoefficient(5, 3));
        Assert.assertEquals(2598960L, MathUtils.binomialCoefficient(52, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_nLessThanK() {
        MathUtils.binomialCoefficient(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_nNegative() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficient_overflow() {
        MathUtils.binomialCoefficient(1000, 500);
    }

    @Test
    public void testBinomialCoefficientDouble() {
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(0, 0), EPSILON);
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), EPSILON);
        Assert.assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), EPSILON);
        Assert.assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), EPSILON);
        Assert.assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), EPSILON);
        Assert.assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_nLessThanK() {
        MathUtils.binomialCoefficientDouble(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_nNegative() {
        MathUtils.binomialCoefficientDouble(-1, 0);
    }

    @Test
    public void testBinomialCoefficientLog() {
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(0, 0), EPSILON);
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), EPSILON);
        Assert.assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), EPSILON);
        Assert.assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), EPSILON);
        Assert.assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), EPSILON);
        Assert.assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_nLessThanK() {
        MathUtils.binomialCoefficientLog(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_nNegative() {
        MathUtils.binomialCoefficientLog(-1, 0);
    }

    @Test
    public void testCosh() {
        Assert.assertEquals(1.0, MathUtils.cosh(0.0), EPSILON);
        Assert.assertEquals(Math.cosh(1.5), MathUtils.cosh(1.5), EPSILON);
        Assert.assertEquals(Math.cosh(-1.5), MathUtils.cosh(-1.5), EPSILON);
    }

    @Test
    public void testSinh() {
        Assert.assertEquals(0.0, MathUtils.sinh(0.0), EPSILON);
        Assert.assertEquals(Math.sinh(1.5), MathUtils.sinh(1.5), EPSILON);
        Assert.assertEquals(Math.sinh(-1.5), MathUtils.sinh(-1.5), EPSILON);
    }

    @Test
    public void testEqualsDouble() {
        Assert.assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        Assert.assertTrue(MathUtils.equals(1.0, 1.0));
        Assert.assertTrue(MathUtils.equals(0.0, 0.0));
        Assert.assertFalse(MathUtils.equals(1.0, 2.0));
        Assert.assertFalse(MathUtils.equals(Double.NaN, 1.0));
        Assert.assertFalse(MathUtils.equals(1.0, Double.NaN));
    }

    @Test
    public void testEqualsDoubleArray() {
        Assert.assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        Assert.assertFalse(MathUtils.equals(new double[] {1.0}, null));
        Assert.assertFalse(MathUtils.equals(null, new double[] {1.0}));
        Assert.assertTrue(MathUtils.equals(new double[] {}, new double[] {}));
        Assert.assertTrue(MathUtils.equals(new double[] {1.0, Double.NaN, 2.0}, new double[] {1.0, Double.NaN, 2.0}));
        Assert.assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.0, 2.0}));
        Assert.assertFalse(MathUtils.equals(new double[] {1.0, 2.0}, new double[] {1.0, 3.0}));
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
    public void testFactorial_tooLarge() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorialDouble() {
        Assert.assertEquals(1.0, MathUtils.factorialDouble(0), EPSILON);
        Assert.assertEquals(6.0, MathUtils.factorialDouble(3), EPSILON);
        Assert.assertEquals(2432902008176640000.0, MathUtils.factorialDouble(20), EPSILON);
        Assert.assertTrue(MathUtils.factorialDouble(25) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog() {
        Assert.assertEquals(Math.log(1.0), MathUtils.factorialLog(0), EPSILON);
        Assert.assertEquals(Math.log(6.0), MathUtils.factorialLog(3), EPSILON);
        Assert.assertEquals(Math.log(2432902008176640000.0), MathUtils.factorialLog(20), 1e-5);
        Assert.assertTrue(MathUtils.factorialLog(25) > MathUtils.factorialLog(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testGcd() {
        Assert.assertEquals(6, MathUtils.gcd(30, 24));
        Assert.assertEquals(6, MathUtils.gcd(-30, 24));
        Assert.assertEquals(6, MathUtils.gcd(30, -24));
        Assert.assertEquals(6, MathUtils.gcd(-30, -24));
        Assert.assertEquals(5, MathUtils.gcd(0, 5));
        Assert.assertEquals(5, MathUtils.gcd(5, 0));
        Assert.assertEquals(0, MathUtils.gcd(0, 0));
        Assert.assertEquals(1, MathUtils.gcd(17, 19));
        Assert.assertEquals(1, MathUtils.gcd(1, 1));
        Assert.assertEquals(2, MathUtils.gcd(2, 4));
        Assert.assertEquals(2, MathUtils.gcd(4, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_overflow() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testLcm() {
        Assert.assertEquals(6, MathUtils.lcm(2, 3));
        Assert.assertEquals(6, MathUtils.lcm(-2, 3));
        Assert.assertEquals(6, MathUtils.lcm(2, -3));
        Assert.assertEquals(6, MathUtils.lcm(-2, -3));
        Assert.assertEquals(0, MathUtils.lcm(0, 5));
        Assert.assertEquals(0, MathUtils.lcm(5, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcm_overflow() {
        MathUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    @Test
    public void testHashDouble() {
        Assert.assertEquals(Double.valueOf(1.0).hashCode(), MathUtils.hash(1.0));
        Assert.assertEquals(Double.valueOf(Double.NaN).hashCode(), MathUtils.hash(Double.NaN));
    }

    @Test
    public void testHashDoubleArray() {
        double[] array = new double[] {1.0, 2.0, 3.0};
        Assert.assertEquals(java.util.Arrays.hashCode(array), MathUtils.hash(array));
        Assert.assertEquals(0, MathUtils.hash((double[]) null));
    }

    @Test
    public void testIndicatorByte() {
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        Assert.assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        Assert.assertEquals((byte) -1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorShort() {
        Assert.assertEquals((short) 1, MathUtils.indicator((short) 5));
        Assert.assertEquals((short) 1, MathUtils.indicator((short) 0));
        Assert.assertEquals((short) -1, MathUtils.indicator((short) -5));
    }

    @Test
    public void testIndicatorInt() {
        Assert.assertEquals(1, MathUtils.indicator(5));
        Assert.assertEquals(1, MathUtils.indicator(0));
        Assert.assertEquals(-1, MathUtils.indicator(-5));
    }

    @Test
    public void testIndicatorLong() {
        Assert.assertEquals(1L, MathUtils.indicator(5L));
        Assert.assertEquals(1L, MathUtils.indicator(0L));
        Assert.assertEquals(-1L, MathUtils.indicator(-5L));
    }

    @Test
    public void testIndicatorFloat() {
        Assert.assertEquals(1.0f, MathUtils.indicator(5.0f), 0.0f);
        Assert.assertEquals(1.0f, MathUtils.indicator(0.0f), 0.0f);
        Assert.assertEquals(-1.0f, MathUtils.indicator(-5.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorDouble() {
        Assert.assertEquals(1.0, MathUtils.indicator(5.0), 0.0);
        Assert.assertEquals(1.0, MathUtils.indicator(0.0), 0.0);
        Assert.assertEquals(-1.0, MathUtils.indicator(-5.0), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testSignByte() {
        Assert.assertEquals((byte) 1, MathUtils.sign((byte) 5));
        Assert.assertEquals((byte) 0, MathUtils.sign((byte) 0));
        Assert.assertEquals((byte) -1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignShort() {
        Assert.assertEquals((short) 1, MathUtils.sign((short) 5));
        Assert.assertEquals((short) 0, MathUtils.sign((short) 0));
        Assert.assertEquals((short) -1, MathUtils.sign((short) -5));
    }

    @Test
    public void testSignInt() {
        Assert.assertEquals(1, MathUtils.sign(5));
        Assert.assertEquals(0, MathUtils.sign(0));
        Assert.assertEquals(-1, MathUtils.sign(-5));
    }

    @Test
    public void testSignLong() {
        Assert.assertEquals(1L, MathUtils.sign(5L));
        Assert.assertEquals(0L, MathUtils.sign(0L));
        Assert.assertEquals(-1L, MathUtils.sign(-5L));
    }

    @Test
    public void testSignFloat() {
        Assert.assertEquals(1.0f, MathUtils.sign(5.0f), 0.0f);
        Assert.assertEquals(0.0f, MathUtils.sign(0.0f), 0.0f);
        Assert.assertEquals(-1.0f, MathUtils.sign(-5.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSignDouble() {
        Assert.assertEquals(1.0, MathUtils.sign(5.0), 0.0);
        Assert.assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        Assert.assertEquals(-1.0, MathUtils.sign(-5.0), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    @Test
    public void testLog() {
        Assert.assertEquals(2.0, MathUtils.log(10.0, 100.0), EPSILON);
        Assert.assertEquals(3.0, MathUtils.log(2.0, 8.0), EPSILON);
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

        double nextUpNeg = MathUtils.nextAfter(-1.0, 0.0);
        Assert.assertTrue(nextUpNeg > -1.0);

        double nextDownNeg = MathUtils.nextAfter(-1.0, -2.0);
        Assert.assertTrue(nextDownNeg < -1.0);

        // mantissa edge cases
        double maxMantissa = Double.longBitsToDouble(0x000fffffffffffffL);
        double afterMaxMantissa = MathUtils.nextAfter(maxMantissa, Double.POSITIVE_INFINITY);
        Assert.assertTrue(afterMaxMantissa > maxMantissa);

        double minExpMantissaZero = Double.longBitsToDouble(0x0010000000000000L);
        double downMinExp = MathUtils.nextAfter(minExpMantissaZero, 0.0);
        Assert.assertTrue(downMinExp < minExpMantissaZero);
    }

    @Test
    public void testScalb() {
        Assert.assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
        Assert.assertEquals(4.0, MathUtils.scalb(1.0, 2), EPSILON);
        Assert.assertEquals(0.25, MathUtils.scalb(1.0, -2), EPSILON);
        Assert.assertEquals(-4.0, MathUtils.scalb(-1.0, 2), EPSILON);
    }

    @Test
    public void testNormalizeAngle() {
        Assert.assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), EPSILON);
        Assert.assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), EPSILON);
        Assert.assertEquals(0.0, MathUtils.normalizeAngle(-2 * Math.PI, 0.0), EPSILON);
        Assert.assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, Math.PI), EPSILON);
        Assert.assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), EPSILON);
    }

    @Test
    public void testRoundDouble() {
        Assert.assertEquals(1.23, MathUtils.round(1.234, 2), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.236, 2), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);
        Assert.assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));

        Assert.assertEquals(1.24, MathUtils.round(1.234, 2, BigDecimal.ROUND_UP), EPSILON);
        Assert.assertEquals(1.23, MathUtils.round(1.236, 2, BigDecimal.ROUND_DOWN), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.234, 2, BigDecimal.ROUND_CEILING), EPSILON);
        Assert.assertEquals(-1.23, MathUtils.round(-1.234, 2, BigDecimal.ROUND_CEILING), EPSILON);
        Assert.assertEquals(1.23, MathUtils.round(1.236, 2, BigDecimal.ROUND_FLOOR), EPSILON);
        Assert.assertEquals(-1.24, MathUtils.round(-1.234, 2, BigDecimal.ROUND_FLOOR), EPSILON);
        Assert.assertEquals(1.23, MathUtils.round(1.235, 2, BigDecimal.ROUND_HALF_DOWN), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.2351, 2, BigDecimal.ROUND_HALF_DOWN), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.235, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.245, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON);
        Assert.assertEquals(1.23, MathUtils.round(1.234, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.236, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON);
        Assert.assertEquals(1.24, MathUtils.round(1.235, 2, BigDecimal.ROUND_HALF_UP), EPSILON);
        Assert.assertEquals(1.23, MathUtils.round(1.234, 2, BigDecimal.ROUND_HALF_UP), EPSILON);
        Assert.assertEquals(1.23, MathUtils.round(1.23, 2, BigDecimal.ROUND_UNNECESSARY), EPSILON);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundDouble_unnecessaryInexact() {
        MathUtils.round(1.234, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundDouble_invalidRoundingMethod() {
        MathUtils.round(1.234, 2, -1);
    }

    @Test
    public void testRoundFloat() {
        Assert.assertEquals(1.23f, MathUtils.round(1.234f, 2), 0.001f);
        Assert.assertEquals(1.24f, MathUtils.round(1.236f, 2), 0.001f);
        Assert.assertEquals(-1.23f, MathUtils.round(-1.234f, 2), 0.001f);

        // Test roundUnscaled coverage via float rounding modes
        Assert.assertEquals(1.24f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_UP), 0.001f);
        Assert.assertEquals(1.23f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_DOWN), 0.001f);
        Assert.assertEquals(1.24f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_CEILING), 0.001f);
        Assert.assertEquals(-1.23f, MathUtils.round(-1.234f, 2, BigDecimal.ROUND_CEILING), 0.001f);
        Assert.assertEquals(1.23f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_FLOOR), 0.001f);
        Assert.assertEquals(-1.24f, MathUtils.round(-1.234f, 2, BigDecimal.ROUND_FLOOR), 0.001f);

        Assert.assertEquals(1.23f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_DOWN), 0.001f);
        Assert.assertEquals(1.24f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_HALF_DOWN), 0.001f);

        Assert.assertEquals(1.24f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_EVEN), 0.001f);
        Assert.assertEquals(1.24f, MathUtils.round(1.245f, 2, BigDecimal.ROUND_HALF_EVEN), 0.001f);
        Assert.assertEquals(1.23f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_HALF_EVEN), 0.001f);
        Assert.assertEquals(1.24f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_HALF_EVEN), 0.001f);

        Assert.assertEquals(1.24f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_UP), 0.001f);
        Assert.assertEquals(1.23f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_HALF_UP), 0.001f);

        Assert.assertEquals(1.23f, MathUtils.round(1.23f, 2, BigDecimal.ROUND_UNNECESSARY), 0.001f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_unnecessaryInexact() {
        MathUtils.round(1.234f, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidRoundingMethod() {
        MathUtils.round(1.234f, 2, -1);
    }
}
