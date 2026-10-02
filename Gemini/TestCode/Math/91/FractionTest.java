package org.apache.commons.math.fraction;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstants() {
        Assert.assertEquals(2, Fraction.TWO.getNumerator());
        Assert.assertEquals(1, Fraction.TWO.getDenominator());

        Assert.assertEquals(1, Fraction.ONE.getNumerator());
        Assert.assertEquals(1, Fraction.ONE.getDenominator());

        Assert.assertEquals(0, Fraction.ZERO.getNumerator());
        Assert.assertEquals(1, Fraction.ZERO.getDenominator());

        Assert.assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
        Assert.assertEquals(1, Fraction.MINUS_ONE.getDenominator());
    }

    @Test
    public void testConstructorDouble_validValues() throws FractionConversionException {
        Fraction f1 = new Fraction(0.5);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        Fraction f2 = new Fraction(2.0);
        Assert.assertEquals(2, f2.getNumerator());
        Assert.assertEquals(1, f2.getDenominator());

        Fraction f3 = new Fraction(-0.75);
        Assert.assertEquals(-3, f3.getNumerator());
        Assert.assertEquals(4, f3.getDenominator());

        Fraction f4 = new Fraction(0.0);
        Assert.assertEquals(0, f4.getNumerator());
        Assert.assertEquals(1, f4.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDouble_overflowValue() throws FractionConversionException {
        new Fraction((double) Integer.MAX_VALUE + 1000.0);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDouble_maxIterationsExceeded() throws FractionConversionException {
        new Fraction(Math.PI, 1.0e-20, 2);
    }

    @Test
    public void testConstructorDouble_withMaxDenominator() throws FractionConversionException {
        Fraction f = new Fraction(0.6666666666, 10);
        Assert.assertEquals(2, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());

        Fraction f2 = new Fraction(0.3333333333, 2);
        Assert.assertEquals(0, f2.getNumerator());
        Assert.assertEquals(1, f2.getDenominator());
    }

    @Test
    public void testConstructorIntInt_validValues() {
        Fraction f1 = new Fraction(2, 4);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        Fraction f2 = new Fraction(3, -9);
        Assert.assertEquals(-1, f2.getNumerator());
        Assert.assertEquals(3, f2.getDenominator());

        Fraction f3 = new Fraction(-4, -6);
        Assert.assertEquals(2, f3.getNumerator());
        Assert.assertEquals(3, f3.getDenominator());

        Fraction f4 = new Fraction(0, 5);
        Assert.assertEquals(0, f4.getNumerator());
        Assert.assertEquals(1, f4.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorIntInt_zeroDenominator() {
        new Fraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorIntInt_minValuesOverflow() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorIntInt_numeratorMinDenominatorNegative() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testAbs() {
        Fraction f1 = new Fraction(3, 4);
        Assert.assertEquals(f1, f1.abs());

        Fraction f2 = new Fraction(-3, 4);
        Fraction absF2 = f2.abs();
        Assert.assertEquals(3, absF2.getNumerator());
        Assert.assertEquals(4, absF2.getDenominator());

        Fraction f3 = new Fraction(0, 1);
        Assert.assertEquals(0, f3.abs().getNumerator());
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(1, 4);

        Assert.assertEquals(0, f1.compareTo(f2));
        Assert.assertEquals(-1, f1.compareTo(f3));
        Assert.assertEquals(1, f1.compareTo(f4));
    }

    @Test
    public void testConversions() {
        Fraction f = new Fraction(3, 2);
        Assert.assertEquals(1.5, f.doubleValue(), EPSILON);
        Assert.assertEquals(1.5f, f.floatValue(), (float) EPSILON);
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());

        Fraction neg = new Fraction(-5, 2);
        Assert.assertEquals(-2.5, neg.doubleValue(), EPSILON);
        Assert.assertEquals(-2, neg.intValue());
        Assert.assertEquals(-2L, neg.longValue());
    }

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(1, 3);
        Fraction f4 = new Fraction(2, 3);

        Assert.assertTrue(f1.equals(f1));
        Assert.assertTrue(f1.equals(f2));
        Assert.assertFalse(f1.equals(f3));
        Assert.assertFalse(f1.equals(f4));
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals("Not a Fraction"));

        Assert.assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testNegate() {
        Fraction f1 = new Fraction(3, 4);
        Fraction neg1 = f1.negate();
        Assert.assertEquals(-3, neg1.getNumerator());
        Assert.assertEquals(4, neg1.getDenominator());

        Fraction f2 = new Fraction(-3, 4);
        Fraction neg2 = f2.negate();
        Assert.assertEquals(3, neg2.getNumerator());
        Assert.assertEquals(4, neg2.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegate_overflow() {
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        f.negate();
    }

    @Test
    public void testReciprocal() {
        Fraction f1 = new Fraction(3, 4);
        Fraction r1 = f1.reciprocal();
        Assert.assertEquals(4, r1.getNumerator());
        Assert.assertEquals(3, r1.getDenominator());

        Fraction f2 = new Fraction(-3, 4);
        Fraction r2 = f2.reciprocal();
        Assert.assertEquals(-4, r2.getNumerator());
        Assert.assertEquals(3, r2.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testReciprocal_zeroNumerator() {
        Fraction.ZERO.reciprocal();
    }

    @Test
    public void testAdd() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(1, 6);
        Fraction sum1 = f1.add(f2);
        Assert.assertEquals(1, sum1.getNumerator());
        Assert.assertEquals(2, sum1.getDenominator());

        Fraction f3 = new Fraction(2, 5);
        Fraction f4 = new Fraction(1, 7);
        Fraction sum2 = f3.add(f4);
        Assert.assertEquals(19, sum2.getNumerator());
        Assert.assertEquals(35, sum2.getDenominator());

        Assert.assertEquals(f1, f1.add(Fraction.ZERO));
        Assert.assertEquals(f1, Fraction.ZERO.add(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullArgument() {
        Fraction.ONE.add(null);
    }

    @Test
    public void testSubtract() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction diff1 = f1.subtract(f2);
        Assert.assertEquals(1, diff1.getNumerator());
        Assert.assertEquals(6, diff1.getDenominator());

        Fraction f3 = new Fraction(5, 6);
        Fraction f4 = new Fraction(1, 6);
        Fraction diff2 = f3.subtract(f4);
        Assert.assertEquals(2, diff2.getNumerator());
        Assert.assertEquals(3, diff2.getDenominator());

        Assert.assertEquals(f1, f1.subtract(Fraction.ZERO));
        Assert.assertEquals(new Fraction(-1, 2), Fraction.ZERO.subtract(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_nullArgument() {
        Fraction.ONE.subtract(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddSub_overflowNumerator() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.add(f2);
    }

    @Test
    public void testMultiply() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction prod = f1.multiply(f2);
        Assert.assertEquals(1, prod.getNumerator());
        Assert.assertEquals(2, prod.getDenominator());

        Assert.assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_nullArgument() {
        Fraction.ONE.multiply(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiply_overflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.multiply(f2);
    }

    @Test
    public void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction quot = f1.divide(f2);
        Assert.assertEquals(2, quot.getNumerator());
        Assert.assertEquals(1, quot.getDenominator());

        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.divide(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide_nullArgument() {
        Fraction.ONE.divide(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide_byZero() {
        Fraction.ONE.divide(Fraction.ZERO);
    }

    @Test
    public void testGetReducedFraction() {
        Fraction f1 = Fraction.getReducedFraction(0, 5);
        Assert.assertEquals(0, f1.getNumerator());
        Assert.assertEquals(1, f1.getDenominator());

        Fraction f2 = Fraction.getReducedFraction(2, 4);
        Assert.assertEquals(1, f2.getNumerator());
        Assert.assertEquals(2, f2.getDenominator());

        Fraction f3 = Fraction.getReducedFraction(2, -4);
        Assert.assertEquals(-1, f3.getNumerator());
        Assert.assertEquals(2, f3.getDenominator());

        Fraction f4 = Fraction.getReducedFraction(-2, -4);
        Assert.assertEquals(1, f4.getNumerator());
        Assert.assertEquals(2, f4.getDenominator());

        Fraction f5 = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        Assert.assertEquals(-1, f5.getNumerator());
        Assert.assertEquals(1073741824, f5.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_overflowDenominatorMinWithOddNumerator() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_overflowNumeratorMinWithNegativeDenominator() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }
}
