package org.apache.commons.math.fraction;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.ZeroException;
import org.junit.Assert;
import org.junit.Test;

public class BigFractionTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstants() {
        Assert.assertEquals(BigInteger.valueOf(2), BigFraction.TWO.getNumerator());
        Assert.assertEquals(BigInteger.ONE, BigFraction.TWO.getDenominator());

        Assert.assertEquals(BigInteger.ONE, BigFraction.ONE.getNumerator());
        Assert.assertEquals(BigInteger.ONE, BigFraction.ONE.getDenominator());

        Assert.assertEquals(BigInteger.ZERO, BigFraction.ZERO.getNumerator());
        Assert.assertEquals(BigInteger.ONE, BigFraction.ZERO.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(-1), BigFraction.MINUS_ONE.getNumerator());
        Assert.assertEquals(BigInteger.ONE, BigFraction.MINUS_ONE.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(4), BigFraction.FOUR_FIFTHS.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(5), BigFraction.FOUR_FIFTHS.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(1), BigFraction.ONE_FIFTH.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(5), BigFraction.ONE_FIFTH.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(1), BigFraction.ONE_HALF.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), BigFraction.ONE_HALF.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(1), BigFraction.ONE_QUARTER.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), BigFraction.ONE_QUARTER.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(1), BigFraction.ONE_THIRD.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), BigFraction.ONE_THIRD.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(3), BigFraction.THREE_FIFTHS.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(5), BigFraction.THREE_FIFTHS.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(3), BigFraction.THREE_QUARTERS.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), BigFraction.THREE_QUARTERS.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(2), BigFraction.TWO_FIFTHS.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(5), BigFraction.TWO_FIFTHS.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(1), BigFraction.TWO_QUARTERS.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), BigFraction.TWO_QUARTERS.getDenominator());

        Assert.assertEquals(BigInteger.valueOf(2), BigFraction.TWO_THIRDS.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), BigFraction.TWO_THIRDS.getDenominator());
    }

    @Test
    public void testConstructorBigInteger() {
        BigFraction f = new BigFraction(BigInteger.valueOf(5));
        Assert.assertEquals(BigInteger.valueOf(5), f.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructorBigInteger_reductionAndSigns() {
        BigFraction f1 = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(6));
        Assert.assertEquals(BigInteger.valueOf(2), f1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f1.getDenominator());

        BigFraction f2 = new BigFraction(BigInteger.valueOf(2), BigInteger.valueOf(-3));
        Assert.assertEquals(BigInteger.valueOf(-2), f2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f2.getDenominator());

        BigFraction f3 = new BigFraction(BigInteger.valueOf(-2), BigInteger.valueOf(-3));
        Assert.assertEquals(BigInteger.valueOf(2), f3.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f3.getDenominator());

        BigFraction f4 = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        Assert.assertEquals(BigInteger.ZERO, f4.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f4.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorBigInteger_nullNumerator() {
        new BigFraction((BigInteger) null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorBigInteger_nullDenominator() {
        new BigFraction(BigInteger.ONE, (BigInteger) null);
    }

    @Test(expected = ZeroException.class)
    public void testConstructorBigInteger_zeroDenominator() {
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void testConstructorIntAndLong() {
        BigFraction f1 = new BigFraction(10);
        Assert.assertEquals(BigInteger.valueOf(10), f1.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f1.getDenominator());

        BigFraction f2 = new BigFraction(10, 15);
        Assert.assertEquals(BigInteger.valueOf(2), f2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f2.getDenominator());

        BigFraction f3 = new BigFraction(100L);
        Assert.assertEquals(BigInteger.valueOf(100), f3.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f3.getDenominator());

        BigFraction f4 = new BigFraction(20L, 30L);
        Assert.assertEquals(BigInteger.valueOf(2), f4.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f4.getDenominator());
    }

    @Test
    public void testConstructorDouble_exact() {
        BigFraction f1 = new BigFraction(0.5);
        Assert.assertEquals(BigInteger.ONE, f1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), f1.getDenominator());

        BigFraction f2 = new BigFraction(-0.5);
        Assert.assertEquals(BigInteger.valueOf(-1), f2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), f2.getDenominator());

        BigFraction f3 = new BigFraction(0.0);
        Assert.assertEquals(BigInteger.ZERO, f3.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f3.getDenominator());

        BigFraction f4 = new BigFraction(Double.MIN_VALUE);
        Assert.assertTrue(f4.getNumerator().compareTo(BigInteger.ZERO) > 0);

        BigFraction f5 = new BigFraction(FastMath.scalb(1.0, 60));
        Assert.assertEquals(BigInteger.ONE, f5.getDenominator());
        Assert.assertEquals(BigInteger.valueOf(2).pow(60), f5.getNumerator());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDouble_nan() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDouble_posInf() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDouble_negInf() {
        new BigFraction(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testConstructorDoubleWithEpsilon() {
        BigFraction f1 = new BigFraction(1.0 / 3.0, 1e-5, 100);
        Assert.assertEquals(BigInteger.ONE, f1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f1.getDenominator());

        BigFraction f2 = new BigFraction(4.0, 1e-5, 10);
        Assert.assertEquals(BigInteger.valueOf(4), f2.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f2.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleWithEpsilon_overflow() {
        new BigFraction(3.0e10, 1e-5, 10);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleWithEpsilon_maxIterations() {
        new BigFraction(FastMath.PI, 1e-20, 2);
    }

    @Test
    public void testConstructorDoubleWithMaxDenominator() {
        BigFraction f1 = new BigFraction(0.3333333333, 10);
        Assert.assertEquals(BigInteger.ONE, f1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), f1.getDenominator());

        BigFraction f2 = new BigFraction(0.3333333333, 2);
        Assert.assertEquals(BigInteger.ZERO, f2.getNumerator());
        Assert.assertEquals(BigInteger.ONE, f2.getDenominator());
    }

    @Test
    public void testGetReducedFraction() {
        BigFraction f1 = BigFraction.getReducedFraction(0, 5);
        Assert.assertSame(BigFraction.ZERO, f1);

        BigFraction f2 = BigFraction.getReducedFraction(2, 4);
        Assert.assertEquals(BigInteger.ONE, f2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), f2.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testGetReducedFraction_zeroDenominator() {
        BigFraction.getReducedFraction(1, 0);
    }

    @Test
    public void testAbs() {
        BigFraction fPos = new BigFraction(3, 4);
        Assert.assertEquals(fPos, fPos.abs());

        BigFraction fNeg = new BigFraction(-3, 4);
        Assert.assertEquals(fPos, fNeg.abs());

        Assert.assertEquals(BigFraction.ZERO, BigFraction.ZERO.abs());
    }

    @Test
    public void testAdd() {
        BigFraction f = new BigFraction(1, 3);

        Assert.assertEquals(new BigFraction(4, 3), f.add(BigInteger.ONE));
        Assert.assertEquals(new BigFraction(4, 3), f.add(1));
        Assert.assertEquals(new BigFraction(4, 3), f.add(1L));

        Assert.assertSame(f, f.add(BigFraction.ZERO));

        BigFraction fSameDen = new BigFraction(2, 3);
        Assert.assertEquals(BigFraction.ONE, f.add(fSameDen));

        BigFraction fDiffDen = new BigFraction(1, 6);
        Assert.assertEquals(BigFraction.ONE_HALF, f.add(fDiffDen));
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_nullBigInteger() {
        BigFraction.ONE.add((BigInteger) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_nullBigFraction() {
        BigFraction.ONE.add((BigFraction) null);
    }

    @Test
    public void testBigDecimalValue() {
        BigFraction f = new BigFraction(1, 2);
        Assert.assertEquals(new BigDecimal("0.5"), f.bigDecimalValue());

        BigFraction f3 = new BigFraction(1, 3);
        Assert.assertEquals(new BigDecimal("0.33"), f3.bigDecimalValue(2, BigDecimal.ROUND_HALF_UP));
        Assert.assertEquals(BigDecimal.ZERO, f3.bigDecimalValue(BigDecimal.ROUND_DOWN));
    }

    @Test(expected = ArithmeticException.class)
    public void testBigDecimalValue_nonTerminating() {
        BigFraction.ONE_THIRD.bigDecimalValue();
    }

    @Test
    public void testCompareTo() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 3);
        BigFraction f3 = new BigFraction(2, 4);

        Assert.assertTrue(f1.compareTo(f2) < 0);
        Assert.assertTrue(f2.compareTo(f1) > 0);
        Assert.assertEquals(0, f1.compareTo(f3));
    }

    @Test
    public void testDivide() {
        BigFraction f = new BigFraction(1, 2);

        Assert.assertEquals(new BigFraction(1, 4), f.divide(BigInteger.valueOf(2)));
        Assert.assertEquals(new BigFraction(1, 4), f.divide(2));
        Assert.assertEquals(new BigFraction(1, 4), f.divide(2L));
        Assert.assertEquals(new BigFraction(2, 3), f.divide(new BigFraction(3, 4)));
    }

    @Test(expected = ZeroException.class)
    public void testDivide_zeroBigInteger() {
        BigFraction.ONE.divide(BigInteger.ZERO);
    }

    @Test(expected = ZeroException.class)
    public void testDivide_zeroInt() {
        BigFraction.ONE.divide(0);
    }

    @Test(expected = ZeroException.class)
    public void testDivide_zeroLong() {
        BigFraction.ONE.divide(0L);
    }

    @Test(expected = ZeroException.class)
    public void testDivide_zeroBigFraction() {
        BigFraction.ONE.divide(BigFraction.ZERO);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_nullBigFraction() {
        BigFraction.ONE.divide((BigFraction) null);
    }

    @Test
    public void testDoubleAndFloatValue() {
        BigFraction f = new BigFraction(1, 4);
        Assert.assertEquals(0.25, f.doubleValue(), EPSILON);
        Assert.assertEquals(0.25f, f.floatValue(), (float) EPSILON);
    }

    @Test
    public void testEqualsAndHashCode() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        BigFraction f3 = new BigFraction(1, 3);

        Assert.assertEquals(f1, f1);
        Assert.assertEquals(f1, f2);
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        Assert.assertNotEquals(f1, f3);
        Assert.assertNotEquals(f1, null);
        Assert.assertNotEquals(f1, "1/2");
    }

    @Test
    public void testGetters() {
        BigFraction f = new BigFraction(Long.MAX_VALUE - 1, Long.MAX_VALUE);
        Assert.assertEquals(BigInteger.valueOf(Long.MAX_VALUE - 1), f.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(Long.MAX_VALUE), f.getDenominator());
        Assert.assertEquals((int) (Long.MAX_VALUE - 1), f.getNumeratorAsInt());
        Assert.assertEquals((int) Long.MAX_VALUE, f.getDenominatorAsInt());
        Assert.assertEquals(Long.MAX_VALUE - 1, f.getNumeratorAsLong());
        Assert.assertEquals(Long.MAX_VALUE, f.getDenominatorAsLong());
    }

    @Test
    public void testIntAndLongValue() {
        BigFraction f1 = new BigFraction(7, 3);
        Assert.assertEquals(2, f1.intValue());
        Assert.assertEquals(2L, f1.longValue());

        BigFraction f2 = new BigFraction(-7, 3);
        Assert.assertEquals(-2, f2.intValue());
        Assert.assertEquals(-2L, f2.longValue());
    }

    @Test
    public void testMultiply() {
        BigFraction f = new BigFraction(2, 3);

        Assert.assertEquals(new BigFraction(4, 3), f.multiply(BigInteger.valueOf(2)));
        Assert.assertEquals(new BigFraction(4, 3), f.multiply(2));
        Assert.assertEquals(new BigFraction(4, 3), f.multiply(2L));

        Assert.assertEquals(new BigFraction(1, 2), f.multiply(new BigFraction(3, 4)));
        Assert.assertSame(BigFraction.ZERO, f.multiply(BigFraction.ZERO));
        Assert.assertSame(BigFraction.ZERO, BigFraction.ZERO.multiply(f));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_nullBigInteger() {
        BigFraction.ONE.multiply((BigInteger) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_nullBigFraction() {
        BigFraction.ONE.multiply((BigFraction) null);
    }

    @Test
    public void testNegate() {
        BigFraction f = new BigFraction(3, 4);
        Assert.assertEquals(new BigFraction(-3, 4), f.negate());
        Assert.assertEquals(f, f.negate().negate());
    }

    @Test
    public void testPercentageValue() {
        BigFraction f = new BigFraction(1, 4);
        Assert.assertEquals(25.0, f.percentageValue(), EPSILON);
    }

    @Test
    public void testPow() {
        BigFraction f = new BigFraction(2, 3);

        Assert.assertEquals(new BigFraction(8, 27), f.pow(3));
        Assert.assertEquals(BigFraction.ONE, f.pow(0));
        Assert.assertEquals(new BigFraction(27, 8), f.pow(-3));

        Assert.assertEquals(new BigFraction(8, 27), f.pow(3L));
        Assert.assertEquals(BigFraction.ONE, f.pow(0L));
        Assert.assertEquals(new BigFraction(27, 8), f.pow(-3L));

        Assert.assertEquals(new BigFraction(8, 27), f.pow(BigInteger.valueOf(3)));
        Assert.assertEquals(BigFraction.ONE, f.pow(BigInteger.ZERO));
        Assert.assertEquals(new BigFraction(27, 8), f.pow(BigInteger.valueOf(-3)));

        Assert.assertEquals(FastMath.pow(2.0 / 3.0, 1.5), f.pow(1.5), EPSILON);
    }

    @Test
    public void testReciprocal() {
        BigFraction f = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(3, 2), f.reciprocal());

        BigFraction fNeg = new BigFraction(-2, 3);
        Assert.assertEquals(new BigFraction(-3, 2), fNeg.reciprocal());
    }

    @Test
    public void testReduce() {
        BigFraction f = new BigFraction(2, 3);
        Assert.assertEquals(f, f.reduce());
    }

    @Test
    public void testSubtract() {
        BigFraction f = new BigFraction(2, 3);

        Assert.assertEquals(new BigFraction(-1, 3), f.subtract(BigInteger.ONE));
        Assert.assertEquals(new BigFraction(-1, 3), f.subtract(1));
        Assert.assertEquals(new BigFraction(-1, 3), f.subtract(1L));

        Assert.assertSame(f, f.subtract(BigFraction.ZERO));

        BigFraction fSameDen = new BigFraction(1, 3);
        Assert.assertEquals(new BigFraction(1, 3), f.subtract(fSameDen));

        BigFraction fDiffDen = new BigFraction(1, 2);
        Assert.assertEquals(new BigFraction(1, 6), f.subtract(fDiffDen));
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_nullBigInteger() {
        BigFraction.ONE.subtract((BigInteger) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_nullBigFraction() {
        BigFraction.ONE.subtract((BigFraction) null);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("5", new BigFraction(5).toString());
        Assert.assertEquals("0", BigFraction.ZERO.toString());
        Assert.assertEquals("2 / 3", new BigFraction(2, 3).toString());
        Assert.assertEquals("-2 / 3", new BigFraction(-2, 3).toString());
    }

    @Test
    public void testGetField() {
        Assert.assertNotNull(BigFraction.ONE.getField());
        Assert.assertSame(BigFractionField.getInstance(), BigFraction.ONE.getField());
    }
}
