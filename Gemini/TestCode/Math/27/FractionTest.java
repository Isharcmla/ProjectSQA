package org.apache.commons.math3.fraction;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstants() {
        Assert.assertEquals(0, Fraction.ZERO.getNumerator());
        Assert.assertEquals(1, Fraction.ZERO.getDenominator());

        Assert.assertEquals(1, Fraction.ONE.getNumerator());
        Assert.assertEquals(1, Fraction.ONE.getDenominator());

        Assert.assertEquals(2, Fraction.TWO.getNumerator());
        Assert.assertEquals(1, Fraction.TWO.getDenominator());

        Assert.assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
        Assert.assertEquals(1, Fraction.MINUS_ONE.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_HALF.getNumerator());
        Assert.assertEquals(2, Fraction.ONE_HALF.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_THIRD.getNumerator());
        Assert.assertEquals(3, Fraction.ONE_THIRD.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_THIRDS.getNumerator());
        Assert.assertEquals(3, Fraction.TWO_THIRDS.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_QUARTER.getNumerator());
        Assert.assertEquals(4, Fraction.ONE_QUARTER.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_QUARTERS.getNumerator());
        Assert.assertEquals(4, Fraction.TWO_QUARTERS.getDenominator());

        Assert.assertEquals(3, Fraction.THREE_QUARTERS.getNumerator());
        Assert.assertEquals(4, Fraction.THREE_QUARTERS.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_FIFTH.getNumerator());
        Assert.assertEquals(5, Fraction.ONE_FIFTH.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.TWO_FIFTHS.getDenominator());

        Assert.assertEquals(3, Fraction.THREE_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.THREE_FIFTHS.getDenominator());

        Assert.assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
    }

    @Test
    public void testConstructor_double_exactIntegers() {
        Fraction f1 = new Fraction(2.0);
        Assert.assertEquals(2, f1.getNumerator());
        Assert.assertEquals(1, f1.getDenominator());

        Fraction f2 = new Fraction(0.0);
        Assert.assertEquals(0, f2.getNumerator());
        Assert.assertEquals(1, f2.getDenominator());

        Fraction f3 = new Fraction(-5.0);
        Assert.assertEquals(-5, f3.getNumerator());
        Assert.assertEquals(1, f3.getDenominator());
    }

    @Test
    public void testConstructor_double_fractions() {
        Fraction f = new Fraction(0.75);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        Fraction fNeg = new Fraction(-0.75);
        Assert.assertEquals(-3, fNeg.getNumerator());
        Assert.assertEquals(4, fNeg.getDenominator());
    }

    @Test
    public void testConstructor_doubleEpsilonMaxIterations() {
        Fraction f = new Fraction(0.3333333333, 1.0e-5, 100);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructor_doubleMaxDenominator() {
        Fraction f1 = new Fraction(0.3333333333, 10);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(3, f1.getDenominator());

        Fraction f2 = new Fraction(0.6180339887, 10);
        Assert.assertTrue(f2.getDenominator() <= 10);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_double_overflowInitial() {
        new Fraction((double) Long.MAX_VALUE);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_double_maxIterationsExceeded() {
        new Fraction(0.6180339887, 1.0e-15, 2);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_double_convergentOverflow() {
        new Fraction(1.0e-20, 1.0e-30, Integer.MAX_VALUE, 100);
    }

    @Test
    public void testConstructor_int() {
        Fraction f = new Fraction(10);
        Assert.assertEquals(10, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());

        Fraction fZero = new Fraction(0);
        Assert.assertEquals(0, fZero.getNumerator());
        Assert.assertEquals(1, fZero.getDenominator());

        Fraction fNeg = new Fraction(-10);
        Assert.assertEquals(-10, fNeg.getNumerator());
        Assert.assertEquals(1, fNeg.getDenominator());
    }

    @Test
    public void testConstructor_intInt_reductionAndSigns() {
        Fraction f1 = new Fraction(2, 4);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        Fraction f2 = new Fraction(-2, 4);
        Assert.assertEquals(-1, f2.getNumerator());
        Assert.assertEquals(2, f2.getDenominator());

        Fraction f3 = new Fraction(2, -4);
        Assert.assertEquals(-1, f3.getNumerator());
        Assert.assertEquals(2, f3.getDenominator());

        Fraction f4 = new Fraction(-2, -4);
        Assert.assertEquals(1, f4.getNumerator());
        Assert.assertEquals(2, f4.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_intInt_zeroDenominator() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_intInt_overflowNumerator() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_intInt_overflowDenominator() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testAbs() {
        Fraction fPos = new Fraction(3, 4);
        Assert.assertSame(fPos, fPos.abs());

        Fraction fNeg = new Fraction(-3, 4);
        Fraction fAbs = fNeg.abs();
        Assert.assertEquals(3, fAbs.getNumerator());
        Assert.assertEquals(4, fAbs.getDenominator());

        Fraction fZero = Fraction.ZERO;
        Assert.assertSame(fZero, fZero.abs());
    }

    @Test
    public void testCompareTo() {
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(2, 3);
        Fraction third = new Fraction(1, 2);

        Assert.assertTrue(first.compareTo(second) < 0);
        Assert.assertTrue(second.compareTo(first) > 0);
        Assert.assertEquals(0, first.compareTo(third));
    }

    @Test
    public void testNumericValues() {
        Fraction f = new Fraction(3, 2);
        Assert.assertEquals(1.5, f.doubleValue(), EPSILON);
        Assert.assertEquals(1.5f, f.floatValue(), EPSILON);
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());

        Fraction fNeg = new Fraction(-3, 2);
        Assert.assertEquals(-1.5, fNeg.doubleValue(), EPSILON);
        Assert.assertEquals(-1.5f, fNeg.floatValue(), EPSILON);
        Assert.assertEquals(-1, fNeg.intValue());
        Assert.assertEquals(-1L, fNeg.longValue());
    }

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(1, 3);

        Assert.assertTrue(f1.equals(f1));
        Assert.assertTrue(f1.equals(f2));
        Assert.assertFalse(f1.equals(f3));
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals(new Object()));

        Assert.assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testNegate() {
        Fraction f = new Fraction(3, 4);
        Fraction negated = f.negate();
        Assert.assertEquals(-3, negated.getNumerator());
        Assert.assertEquals(4, negated.getDenominator());

        Fraction fNeg = new Fraction(-3, 4);
        Fraction negatedPos = fNeg.negate();
        Assert.assertEquals(3, negatedPos.getNumerator());
        Assert.assertEquals(4, negatedPos.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_overflow() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 4);
        Fraction r = f.reciprocal();
        Assert.assertEquals(4, r.getNumerator());
        Assert.assertEquals(3, r.getDenominator());

        Fraction fNeg = new Fraction(-3, 4);
        Fraction rNeg = fNeg.reciprocal();
        Assert.assertEquals(-4, rNeg.getNumerator());
        Assert.assertEquals(3, rNeg.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_zeroNumerator() {
        Fraction.ZERO.reciprocal();
    }

    @Test
    public void testAddFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction sum = f1.add(f2);
        Assert.assertEquals(5, sum.getNumerator());
        Assert.assertEquals(6, sum.getDenominator());

        Fraction f3 = new Fraction(1, 6);
        Fraction sum2 = f1.add(f3);
        Assert.assertEquals(2, sum2.getNumerator());
        Assert.assertEquals(3, sum2.getDenominator());

        Assert.assertEquals(f1, f1.add(Fraction.ZERO));
        Assert.assertEquals(f1, Fraction.ZERO.add(f1));
    }

    @Test
    public void testAddFraction_commonDenominatorDivisible() {
        Fraction f1 = new Fraction(1, 6);
        Fraction f2 = new Fraction(5, 6);
        Fraction sum = f1.add(f2);
        Assert.assertEquals(1, sum.getNumerator());
        Assert.assertEquals(1, sum.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddFraction_nullArgument() {
        Fraction.ONE.add(null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAddFraction_overflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.add(f2);
    }

    @Test
    public void testAddInt() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.add(2);
        Assert.assertEquals(5, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test
    public void testSubtractFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction diff = f1.subtract(f2);
        Assert.assertEquals(1, diff.getNumerator());
        Assert.assertEquals(6, diff.getDenominator());

        Assert.assertEquals(f1, f1.subtract(Fraction.ZERO));

        Fraction zeroMinusF1 = Fraction.ZERO.subtract(f1);
        Assert.assertEquals(-1, zeroMinusF1.getNumerator());
        Assert.assertEquals(2, zeroMinusF1.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractFraction_nullArgument() {
        Fraction.ONE.subtract(null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testSubtractFraction_overflow() {
        Fraction f1 = new Fraction(Integer.MIN_VALUE + 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.subtract(f2);
    }

    @Test
    public void testSubtractInt() {
        Fraction f = new Fraction(5, 2);
        Fraction result = f.subtract(2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test
    public void testMultiplyFraction() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction prod = f1.multiply(f2);
        Assert.assertEquals(1, prod.getNumerator());
        Assert.assertEquals(2, prod.getDenominator());

        Assert.assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(f1));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyFraction_nullArgument() {
        Fraction.ONE.multiply(null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testMultiplyFraction_overflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.multiply(f2);
    }

    @Test
    public void testMultiplyInt() {
        Fraction f = new Fraction(2, 3);
        Fraction result = f.multiply(3);
        Assert.assertEquals(2, result.getNumerator());
        Assert.assertEquals(1, result.getDenominator());
    }

    @Test
    public void testDivideFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction quotient = f1.divide(f2);
        Assert.assertEquals(2, quotient.getNumerator());
        Assert.assertEquals(1, quotient.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideFraction_nullArgument() {
        Fraction.ONE.divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideFraction_divideByZero() {
        Fraction.ONE.divide(Fraction.ZERO);
    }

    @Test
    public void testDivideInt() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.divide(2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(4, result.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideInt_divideByZero() {
        Fraction.ONE.divide(0);
    }

    @Test
    public void testPercentageValue() {
        Fraction f = new Fraction(1, 4);
        Assert.assertEquals(25.0, f.percentageValue(), EPSILON);

        Fraction f2 = new Fraction(3, 5);
        Assert.assertEquals(60.0, f2.percentageValue(), EPSILON);
    }

    @Test
    public void testGetReducedFraction() {
        Fraction f1 = Fraction.getReducedFraction(0, 5);
        Assert.assertEquals(Fraction.ZERO, f1);

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
        Assert.assertEquals(1, f5.getNumerator());
        Assert.assertEquals(-(Integer.MIN_VALUE / 2), f5.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_overflowNumerator() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_overflowDenominator() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testToString() {
        Fraction f1 = new Fraction(3, 4);
        Assert.assertEquals("3 / 4", f1.toString());

        Fraction f2 = new Fraction(5, 1);
        Assert.assertEquals("5", f2.toString());

        Fraction f3 = new Fraction(0, 5);
        Assert.assertEquals("0", f3.toString());
    }

    @Test
    public void testGetField() {
        Fraction f = new Fraction(1, 2);
        Assert.assertNotNull(f.getField());
        Assert.assertSame(FractionField.getInstance(), f.getField());
    }
}
