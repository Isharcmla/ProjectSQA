package org.apache.commons.math3.fraction;

import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;

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

        Assert.assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_FIFTH.getNumerator());
        Assert.assertEquals(5, Fraction.ONE_FIFTH.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_HALF.getNumerator());
        Assert.assertEquals(2, Fraction.ONE_HALF.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_QUARTER.getNumerator());
        Assert.assertEquals(4, Fraction.ONE_QUARTER.getDenominator());

        Assert.assertEquals(1, Fraction.ONE_THIRD.getNumerator());
        Assert.assertEquals(3, Fraction.ONE_THIRD.getDenominator());

        Assert.assertEquals(3, Fraction.THREE_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.THREE_FIFTHS.getDenominator());

        Assert.assertEquals(3, Fraction.THREE_QUARTERS.getNumerator());
        Assert.assertEquals(4, Fraction.THREE_QUARTERS.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_FIFTHS.getNumerator());
        Assert.assertEquals(5, Fraction.TWO_FIFTHS.getDenominator());

        Assert.assertEquals(1, Fraction.TWO_QUARTERS.getNumerator());
        Assert.assertEquals(2, Fraction.TWO_QUARTERS.getDenominator());

        Assert.assertEquals(2, Fraction.TWO_THIRDS.getNumerator());
        Assert.assertEquals(3, Fraction.TWO_THIRDS.getDenominator());

        Assert.assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
        Assert.assertEquals(1, Fraction.MINUS_ONE.getDenominator());
    }

    @Test
    public void testConstructor_int() {
        Fraction f = new Fraction(5);
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());

        Fraction fZero = new Fraction(0);
        Assert.assertEquals(0, fZero.getNumerator());
        Assert.assertEquals(1, fZero.getDenominator());

        Fraction fNeg = new Fraction(-7);
        Assert.assertEquals(-7, fNeg.getNumerator());
        Assert.assertEquals(1, fNeg.getDenominator());
    }

    @Test
    public void testConstructor_int_int_valid() {
        Fraction f1 = new Fraction(2, 4);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        Fraction f2 = new Fraction(3, -9);
        Assert.assertEquals(-1, f2.getNumerator());
        Assert.assertEquals(3, f2.getDenominator());

        Fraction f3 = new Fraction(-4, -8);
        Assert.assertEquals(1, f3.getNumerator());
        Assert.assertEquals(2, f3.getDenominator());

        Fraction f4 = new Fraction(0, 5);
        Assert.assertEquals(0, f4.getNumerator());
        Assert.assertEquals(1, f4.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_int_int_zeroDenominator_throwsException() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_int_int_overflowNumeratorMin_throwsException() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_int_int_overflowDenominatorMin_throwsException() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testConstructor_double_valid() {
        Fraction f1 = new Fraction(0.5);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        Fraction f2 = new Fraction(5.0);
        Assert.assertEquals(5, f2.getNumerator());
        Assert.assertEquals(1, f2.getDenominator());

        Fraction f3 = new Fraction(-0.75);
        Assert.assertEquals(-3, f3.getNumerator());
        Assert.assertEquals(4, f3.getDenominator());
    }

    @Test
    public void testConstructor_double_epsilon_maxIterations() {
        Fraction f = new Fraction(0.3333333333, 1.0e-5, 100);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructor_double_maxDenominator() {
        Fraction f1 = new Fraction(0.3333333333, 10);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(3, f1.getDenominator());

        Fraction f2 = new Fraction(0.8571428571428571, 5);
        Assert.assertEquals(4, f2.getNumerator());
        Assert.assertEquals(5, f2.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_double_overflowInitial() {
        new Fraction(1.0e20);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_double_maxIterationsExceeded() {
        new Fraction(0.618033988749895, 1.0e-15, 2);
    }

    @Test
    public void testAbs() {
        Fraction fPositive = new Fraction(3, 4);
        Assert.assertSame(fPositive, fPositive.abs());

        Fraction fNegative = new Fraction(-3, 4);
        Fraction fAbs = fNegative.abs();
        Assert.assertEquals(3, fAbs.getNumerator());
        Assert.assertEquals(4, fAbs.getDenominator());

        Fraction fZero = Fraction.ZERO;
        Assert.assertSame(fZero, fZero.abs());
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(1, 4);

        Assert.assertEquals(0, f1.compareTo(f2));
        Assert.assertTrue(f1.compareTo(f3) < 0);
        Assert.assertTrue(f1.compareTo(f4) > 0);
    }

    @Test
    public void testPrimitiveValues() {
        Fraction f = new Fraction(3, 2);
        Assert.assertEquals(1.5, f.doubleValue(), EPSILON);
        Assert.assertEquals(1.5f, f.floatValue(), (float) EPSILON);
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());
        Assert.assertEquals(150.0, f.percentageValue(), EPSILON);
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
        Assert.assertNotEquals(f1.hashCode(), f3.hashCode());
    }

    @Test
    public void testNegate() {
        Fraction f = new Fraction(3, 4);
        Fraction negated = f.negate();
        Assert.assertEquals(-3, negated.getNumerator());
        Assert.assertEquals(4, negated.getDenominator());

        Fraction negF = new Fraction(-3, 4);
        Assert.assertEquals(3, negF.negate().getNumerator());
        Assert.assertEquals(4, negF.negate().getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_overflow_throwsException() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 4);
        Fraction rec = f.reciprocal();
        Assert.assertEquals(4, rec.getNumerator());
        Assert.assertEquals(3, rec.getDenominator());

        Fraction fNeg = new Fraction(-3, 4);
        Fraction recNeg = fNeg.reciprocal();
        Assert.assertEquals(-4, recNeg.getNumerator());
        Assert.assertEquals(3, recNeg.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_zeroNumerator_throwsException() {
        Fraction.ZERO.reciprocal();
    }

    @Test
    public void testAdd_Fraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction sum = f1.add(f2);
        Assert.assertEquals(5, sum.getNumerator());
        Assert.assertEquals(6, sum.getDenominator());

        Fraction f3 = new Fraction(1, 4);
        Fraction f4 = new Fraction(1, 6);
        Fraction sumCommonGcd = f3.add(f4);
        Assert.assertEquals(5, sumCommonGcd.getNumerator());
        Assert.assertEquals(12, sumCommonGcd.getDenominator());

        Assert.assertEquals(f1, f1.add(Fraction.ZERO));
        Assert.assertEquals(f1, Fraction.ZERO.add(f1));
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_Fraction_null_throwsException() {
        Fraction.ONE.add((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAdd_Fraction_overflow_throwsException() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 2);
        Fraction f2 = new Fraction(1, 4);
        f1.add(f2);
    }

    @Test
    public void testAdd_int() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.add(2);
        Assert.assertEquals(5, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());

        Fraction resultNeg = f.add(-1);
        Assert.assertEquals(-1, resultNeg.getNumerator());
        Assert.assertEquals(2, resultNeg.getDenominator());
    }

    @Test
    public void testSubtract_Fraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction diff = f1.subtract(f2);
        Assert.assertEquals(1, diff.getNumerator());
        Assert.assertEquals(6, diff.getDenominator());

        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(1, 6);
        Fraction diffCommonGcd = f3.subtract(f4);
        Assert.assertEquals(7, diffCommonGcd.getNumerator());
        Assert.assertEquals(12, diffCommonGcd.getDenominator());

        Assert.assertEquals(f1, f1.subtract(Fraction.ZERO));
        Fraction zeroMinusF1 = Fraction.ZERO.subtract(f1);
        Assert.assertEquals(-1, zeroMinusF1.getNumerator());
        Assert.assertEquals(2, zeroMinusF1.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_Fraction_null_throwsException() {
        Fraction.ONE.subtract((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testSubtract_Fraction_overflow_throwsException() {
        Fraction f1 = new Fraction(Integer.MIN_VALUE + 2, 2);
        Fraction f2 = new Fraction(1, 4);
        f1.subtract(f2);
    }

    @Test
    public void testSubtract_int() {
        Fraction f = new Fraction(5, 2);
        Fraction result = f.subtract(2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test
    public void testMultiply_Fraction() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction product = f1.multiply(f2);
        Assert.assertEquals(1, product.getNumerator());
        Assert.assertEquals(2, product.getDenominator());

        Assert.assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(f1));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_Fraction_null_throwsException() {
        Fraction.ONE.multiply((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testMultiply_Fraction_overflow_throwsException() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.multiply(f2);
    }

    @Test
    public void testMultiply_int() {
        Fraction f = new Fraction(2, 5);
        Fraction result = f.multiply(3);
        Assert.assertEquals(6, result.getNumerator());
        Assert.assertEquals(5, result.getDenominator());

        Fraction zeroResult = f.multiply(0);
        Assert.assertEquals(0, zeroResult.getNumerator());
        Assert.assertEquals(1, zeroResult.getDenominator());
    }

    @Test
    public void testDivide_Fraction() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 5);
        Fraction result = f1.divide(f2);
        Assert.assertEquals(5, result.getNumerator());
        Assert.assertEquals(6, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_Fraction_null_throwsException() {
        Fraction.ONE.divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_Fraction_zero_throwsException() {
        Fraction.ONE.divide(Fraction.ZERO);
    }

    @Test
    public void testDivide_int() {
        Fraction f = new Fraction(4, 5);
        Fraction result = f.divide(2);
        Assert.assertEquals(2, result.getNumerator());
        Assert.assertEquals(5, result.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_int_zero_throwsException() {
        Fraction.ONE.divide(0);
    }

    @Test
    public void testGetReducedFraction() {
        Fraction f1 = Fraction.getReducedFraction(0, 5);
        Assert.assertSame(Fraction.ZERO, f1);

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

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator_throwsException() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_overflowNumeratorMin_throwsException() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_overflowDenominatorMin_throwsException() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("0", Fraction.ZERO.toString());
        Assert.assertEquals("5", new Fraction(5).toString());
        Assert.assertEquals("3 / 4", new Fraction(3, 4).toString());
        Assert.assertEquals("-1 / 2", new Fraction(-1, 2).toString());
    }

    @Test
    public void testGetField() {
        Fraction f = new Fraction(1, 2);
        Assert.assertNotNull(f.getField());
        Assert.assertEquals(FractionField.getInstance(), f.getField());
    }
}
