package org.apache.commons.math3.fraction;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.junit.Assert;
import org.junit.Test;

public class BigFractionTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstants() {
        Assert.assertEquals(new BigFraction(2, 1), BigFraction.TWO);
        Assert.assertEquals(new BigFraction(1, 1), BigFraction.ONE);
        Assert.assertEquals(new BigFraction(0, 1), BigFraction.ZERO);
        Assert.assertEquals(new BigFraction(-1, 1), BigFraction.MINUS_ONE);
        Assert.assertEquals(new BigFraction(4, 5), BigFraction.FOUR_FIFTHS);
        Assert.assertEquals(new BigFraction(1, 5), BigFraction.ONE_FIFTH);
        Assert.assertEquals(new BigFraction(1, 2), BigFraction.ONE_HALF);
        Assert.assertEquals(new BigFraction(1, 4), BigFraction.ONE_QUARTER);
        Assert.assertEquals(new BigFraction(1, 3), BigFraction.ONE_THIRD);
        Assert.assertEquals(new BigFraction(3, 5), BigFraction.THREE_FIFTHS);
        Assert.assertEquals(new BigFraction(3, 4), BigFraction.THREE_QUARTERS);
        Assert.assertEquals(new BigFraction(2, 5), BigFraction.TWO_FIFTHS);
        Assert.assertEquals(new BigFraction(2, 4), BigFraction.TWO_QUARTERS);
        Assert.assertEquals(new BigFraction(2, 3), BigFraction.TWO_THIRDS);
    }

    @Test
    public void testConstructor_BigInteger() {
        BigFraction bf = new BigFraction(BigInteger.valueOf(5));
        Assert.assertEquals(BigInteger.valueOf(5), bf.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructor_BigInteger_BigInteger_Normal() {
        BigFraction bf1 = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(6));
        Assert.assertEquals(BigInteger.valueOf(2), bf1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), bf1.getDenominator());

        BigFraction bf2 = new BigFraction(BigInteger.valueOf(2), BigInteger.valueOf(-3));
        Assert.assertEquals(BigInteger.valueOf(-2), bf2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), bf2.getDenominator());

        BigFraction bf3 = new BigFraction(BigInteger.valueOf(-2), BigInteger.valueOf(-3));
        Assert.assertEquals(BigInteger.valueOf(2), bf3.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), bf3.getDenominator());

        BigFraction bf4 = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        Assert.assertEquals(BigInteger.ZERO, bf4.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf4.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_BigInteger_NullNumerator() {
        new BigFraction(null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_BigInteger_NullDenominator() {
        new BigFraction(BigInteger.ONE, null);
    }

    @Test(expected = ZeroException.class)
    public void testConstructor_BigInteger_ZeroDenominator() {
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void testConstructor_Double_Exact() {
        BigFraction bf1 = new BigFraction(0.5);
        Assert.assertEquals(BigInteger.ONE, bf1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), bf1.getDenominator());

        BigFraction bf2 = new BigFraction(-0.75);
        Assert.assertEquals(BigInteger.valueOf(-3), bf2.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), bf2.getDenominator());

        BigFraction bf3 = new BigFraction(0.0);
        Assert.assertEquals(BigInteger.ZERO, bf3.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf3.getDenominator());

        BigFraction bf4 = new BigFraction(4.0);
        Assert.assertEquals(BigInteger.valueOf(4), bf4.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf4.getDenominator());

        BigFraction bf5 = new BigFraction(Double.MIN_VALUE);
        Assert.assertTrue(bf5.getNumerator().compareTo(BigInteger.ZERO) > 0);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_Double_NaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_Double_PositiveInfinity() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_Double_NegativeInfinity() {
        new BigFraction(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testConstructor_Double_Epsilon_MaxIterations() {
        BigFraction bf1 = new BigFraction(1.0 / 3.0, 1e-5, 100);
        Assert.assertEquals(BigInteger.ONE, bf1.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), bf1.getDenominator());

        BigFraction bf2 = new BigFraction(2.0, 1e-5, 100);
        Assert.assertEquals(BigInteger.valueOf(2), bf2.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf2.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_Double_Epsilon_Overflow() {
        new BigFraction(Double.MAX_VALUE, 1e-5, 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_Double_Epsilon_MaxIterationsExceeded() {
        new BigFraction(Math.PI, 1e-20, 2);
    }

    @Test
    public void testConstructor_Double_MaxDenominator() {
        BigFraction bf = new BigFraction(0.3333333333, 10);
        Assert.assertEquals(BigInteger.ONE, bf.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(3), bf.getDenominator());
    }

    @Test
    public void testConstructor_Int() {
        BigFraction bf = new BigFraction(42);
        Assert.assertEquals(BigInteger.valueOf(42), bf.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructor_Int_Int() {
        BigFraction bf = new BigFraction(6, 8);
        Assert.assertEquals(BigInteger.valueOf(3), bf.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(4), bf.getDenominator());
    }

    @Test
    public void testConstructor_Long() {
        BigFraction bf = new BigFraction(1234567890123L);
        Assert.assertEquals(BigInteger.valueOf(1234567890123L), bf.getNumerator());
        Assert.assertEquals(BigInteger.ONE, bf.getDenominator());
    }

    @Test
    public void testConstructor_Long_Long() {
        BigFraction bf = new BigFraction(10L, -20L);
        Assert.assertEquals(BigInteger.valueOf(-1), bf.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test
    public void testGetReducedFraction() {
        Assert.assertEquals(BigFraction.ZERO, BigFraction.getReducedFraction(0, 5));
        BigFraction bf = BigFraction.getReducedFraction(3, 6);
        Assert.assertEquals(BigInteger.ONE, bf.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), bf.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testGetReducedFraction_ZeroDenominator() {
        BigFraction.getReducedFraction(1, 0);
    }

    @Test
    public void testAbs() {
        BigFraction bfPos = new BigFraction(3, 4);
        BigFraction bfNeg = new BigFraction(-3, 4);
        BigFraction bfZero = BigFraction.ZERO;

        Assert.assertEquals(bfPos, bfPos.abs());
        Assert.assertEquals(bfPos, bfNeg.abs());
        Assert.assertEquals(bfZero, bfZero.abs());
    }

    @Test
    public void testAdd_BigInteger() {
        BigFraction bf = new BigFraction(1, 3);
        BigFraction res = bf.add(BigInteger.valueOf(2));
        Assert.assertEquals(new BigFraction(7, 3), res);
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_BigInteger_Null() {
        BigFraction.ONE.add((BigInteger) null);
    }

    @Test
    public void testAdd_Int() {
        BigFraction bf = new BigFraction(1, 3);
        Assert.assertEquals(new BigFraction(4, 3), bf.add(1));
    }

    @Test
    public void testAdd_Long() {
        BigFraction bf = new BigFraction(1, 3);
        Assert.assertEquals(new BigFraction(7, 3), bf.add(2L));
    }

    @Test
    public void testAdd_BigFraction() {
        BigFraction bf1 = new BigFraction(1, 3);
        BigFraction bf2 = new BigFraction(2, 3);
        BigFraction bf3 = new BigFraction(1, 4);

        Assert.assertEquals(BigFraction.ONE, bf1.add(bf2));
        Assert.assertEquals(new BigFraction(7, 12), bf1.add(bf3));
        Assert.assertSame(bf1, bf1.add(BigFraction.ZERO));
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_BigFraction_Null() {
        BigFraction.ONE.add((BigFraction) null);
    }

    @Test
    public void testBigDecimalValue() {
        BigFraction bf1 = new BigFraction(1, 2);
        Assert.assertEquals(new BigDecimal("0.5"), bf1.bigDecimalValue());

        BigFraction bf2 = new BigFraction(2, 3);
        BigDecimal rounded1 = bf2.bigDecimalValue(RoundingMode.HALF_UP.ordinal());
        Assert.assertEquals(new BigDecimal("1"), rounded1);

        BigDecimal rounded2 = bf2.bigDecimalValue(4, RoundingMode.HALF_UP.ordinal());
        Assert.assertEquals(new BigDecimal("0.6667"), rounded2);
    }

    @Test(expected = ArithmeticException.class)
    public void testBigDecimalValue_NonTerminating() {
        new BigFraction(1, 3).bigDecimalValue();
    }

    @Test
    public void testCompareTo() {
        BigFraction a = new BigFraction(1, 2);
        BigFraction b = new BigFraction(2, 4);
        BigFraction c = new BigFraction(3, 4);

        Assert.assertEquals(0, a.compareTo(b));
        Assert.assertTrue(a.compareTo(c) < 0);
        Assert.assertTrue(c.compareTo(a) > 0);
    }

    @Test
    public void testDivide_BigInteger() {
        BigFraction bf = new BigFraction(1, 2);
        Assert.assertEquals(new BigFraction(1, 6), bf.divide(BigInteger.valueOf(3)));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_BigInteger_Null() {
        BigFraction.ONE.divide((BigInteger) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_BigInteger_Zero() {
        BigFraction.ONE.divide(BigInteger.ZERO);
    }

    @Test
    public void testDivide_Int() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(1, 3), bf.divide(2));
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_Int_Zero() {
        BigFraction.ONE.divide(0);
    }

    @Test
    public void testDivide_Long() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(1, 3), bf.divide(2L));
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_Long_Zero() {
        BigFraction.ONE.divide(0L);
    }

    @Test
    public void testDivide_BigFraction() {
        BigFraction bf1 = new BigFraction(1, 2);
        BigFraction bf2 = new BigFraction(1, 4);
        Assert.assertEquals(BigFraction.TWO, bf1.divide(bf2));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_BigFraction_Null() {
        BigFraction.ONE.divide((BigFraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_BigFraction_Zero() {
        BigFraction.ONE.divide(BigFraction.ZERO);
    }

    @Test
    public void testDoubleValue() {
        BigFraction bf = new BigFraction(1, 2);
        Assert.assertEquals(0.5, bf.doubleValue(), EPSILON);

        BigInteger bigNum = BigInteger.TEN.pow(400);
        BigInteger bigDen = BigInteger.TEN.pow(400).multiply(BigInteger.valueOf(2));
        BigFraction hugeBf = new BigFraction(bigNum, bigDen);
        Assert.assertEquals(0.5, hugeBf.doubleValue(), EPSILON);
    }

    @Test
    public void testFloatValue() {
        BigFraction bf = new BigFraction(1, 2);
        Assert.assertEquals(0.5f, bf.floatValue(), 1e-5f);

        BigInteger bigNum = BigInteger.TEN.pow(50);
        BigInteger bigDen = BigInteger.TEN.pow(50).multiply(BigInteger.valueOf(2));
        BigFraction hugeBf = new BigFraction(bigNum, bigDen);
        Assert.assertEquals(0.5f, hugeBf.floatValue(), 1e-5f);
    }

    @Test
    public void testEqualsAndHashCode() {
        BigFraction a = new BigFraction(1, 2);
        BigFraction b = new BigFraction(2, 4);
        BigFraction c = new BigFraction(1, 3);

        Assert.assertTrue(a.equals(a));
        Assert.assertTrue(a.equals(b));
        Assert.assertTrue(b.equals(a));
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(a.equals(null));
        Assert.assertFalse(a.equals("1/2"));

        Assert.assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testGetters() {
        BigFraction bf = new BigFraction(7, 11);
        Assert.assertEquals(BigInteger.valueOf(7), bf.getNumerator());
        Assert.assertEquals(7, bf.getNumeratorAsInt());
        Assert.assertEquals(7L, bf.getNumeratorAsLong());

        Assert.assertEquals(BigInteger.valueOf(11), bf.getDenominator());
        Assert.assertEquals(11, bf.getDenominatorAsInt());
        Assert.assertEquals(11L, bf.getDenominatorAsLong());
    }

    @Test
    public void testIntValueAndLongValue() {
        BigFraction bf = new BigFraction(7, 2);
        Assert.assertEquals(3, bf.intValue());
        Assert.assertEquals(3L, bf.longValue());
    }

    @Test
    public void testMultiply_BigInteger() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(BigFraction.TWO, bf.multiply(BigInteger.valueOf(3)));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_BigInteger_Null() {
        BigFraction.ONE.multiply((BigInteger) null);
    }

    @Test
    public void testMultiply_Int() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(BigFraction.TWO, bf.multiply(3));
    }

    @Test
    public void testMultiply_Long() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(BigFraction.TWO, bf.multiply(3L));
    }

    @Test
    public void testMultiply_BigFraction() {
        BigFraction bf1 = new BigFraction(2, 3);
        BigFraction bf2 = new BigFraction(3, 4);
        Assert.assertEquals(BigFraction.ONE_HALF, bf1.multiply(bf2));

        Assert.assertEquals(BigFraction.ZERO, bf1.multiply(BigFraction.ZERO));
        Assert.assertEquals(BigFraction.ZERO, BigFraction.ZERO.multiply(bf1));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_BigFraction_Null() {
        BigFraction.ONE.multiply((BigFraction) null);
    }

    @Test
    public void testNegate() {
        BigFraction bf = new BigFraction(3, 4);
        Assert.assertEquals(new BigFraction(-3, 4), bf.negate());
        Assert.assertEquals(bf, bf.negate().negate());
    }

    @Test
    public void testPercentageValue() {
        BigFraction bf = new BigFraction(1, 4);
        Assert.assertEquals(25.0, bf.percentageValue(), EPSILON);
    }

    @Test
    public void testPow_Int() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(4, 9), bf.pow(2));
        Assert.assertEquals(BigFraction.ONE, bf.pow(0));
        Assert.assertEquals(new BigFraction(9, 4), bf.pow(-2));
    }

    @Test
    public void testPow_Long() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(4, 9), bf.pow(2L));
        Assert.assertEquals(BigFraction.ONE, bf.pow(0L));
        Assert.assertEquals(new BigFraction(9, 4), bf.pow(-2L));
    }

    @Test
    public void testPow_BigInteger() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(4, 9), bf.pow(BigInteger.valueOf(2)));
        Assert.assertEquals(BigFraction.ONE, bf.pow(BigInteger.ZERO));
        Assert.assertEquals(new BigFraction(9, 4), bf.pow(BigInteger.valueOf(-2)));
    }

    @Test
    public void testPow_Double() {
        BigFraction bf = new BigFraction(4, 9);
        Assert.assertEquals(0.6666666666666666, bf.pow(0.5), EPSILON);
    }

    @Test
    public void testReciprocal() {
        BigFraction bf = new BigFraction(2, 3);
        Assert.assertEquals(new BigFraction(3, 2), bf.reciprocal());
    }

    @Test(expected = ZeroException.class)
    public void testReciprocal_Zero() {
        BigFraction.ZERO.reciprocal();
    }

    @Test
    public void testReduce() {
        BigFraction bf = new BigFraction(2, 4);
        BigFraction red = bf.reduce();
        Assert.assertEquals(BigInteger.ONE, red.getNumerator());
        Assert.assertEquals(BigInteger.valueOf(2), red.getDenominator());
    }

    @Test
    public void testSubtract_BigInteger() {
        BigFraction bf = new BigFraction(7, 3);
        Assert.assertEquals(new BigFraction(1, 3), bf.subtract(BigInteger.valueOf(2)));
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_BigInteger_Null() {
        BigFraction.ONE.subtract((BigInteger) null);
    }

    @Test
    public void testSubtract_Int() {
        BigFraction bf = new BigFraction(4, 3);
        Assert.assertEquals(new BigFraction(1, 3), bf.subtract(1));
    }

    @Test
    public void testSubtract_Long() {
        BigFraction bf = new BigFraction(7, 3);
        Assert.assertEquals(new BigFraction(1, 3), bf.subtract(2L));
    }

    @Test
    public void testSubtract_BigFraction() {
        BigFraction bf1 = new BigFraction(3, 4);
        BigFraction bf2 = new BigFraction(1, 4);
        BigFraction bf3 = new BigFraction(1, 3);

        Assert.assertEquals(BigFraction.ONE_HALF, bf1.subtract(bf2));
        Assert.assertEquals(new BigFraction(5, 12), bf1.subtract(bf3));
        Assert.assertSame(bf1, bf1.subtract(BigFraction.ZERO));
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_BigFraction_Null() {
        BigFraction.ONE.subtract((BigFraction) null);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("5", new BigFraction(5).toString());
        Assert.assertEquals("0", BigFraction.ZERO.toString());
        Assert.assertEquals("3 / 4", new BigFraction(3, 4).toString());
        Assert.assertEquals("-3 / 4", new BigFraction(-3, 4).toString());
    }

    @Test
    public void testGetField() {
        BigFraction bf = new BigFraction(1, 2);
        Assert.assertNotNull(bf.getField());
        Assert.assertEquals(BigFractionField.getInstance(), bf.getField());
    }
}
