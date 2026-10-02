package org.apache.commons.lang.math;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    private static final double EPSILON = 1e-6;

    @Test
    public void testConstants() {
        Assert.assertEquals(0, Fraction.ZERO.getNumerator());
        Assert.assertEquals(1, Fraction.ZERO.getDenominator());
        Assert.assertEquals(1, Fraction.ONE.getNumerator());
        Assert.assertEquals(1, Fraction.ONE.getDenominator());
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
    public void testGetFraction_twoInts_valid() {
        Fraction f = Fraction.getFraction(3, 4);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(3, -4);
        Assert.assertEquals(-3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(-3, -4);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_twoInts_zeroDenominator() {
        Fraction.getFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_twoInts_minNumeratorNegateOverflow() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_twoInts_minDenominatorNegateOverflow() {
        Fraction.getFraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testGetFraction_threeInts_valid() {
        Fraction f = Fraction.getFraction(1, 1, 2);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(-1, 1, 2);
        Assert.assertEquals(-3, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(0, 1, 2);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_zeroDenominator() {
        Fraction.getFraction(1, 1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_negativeDenominator() {
        Fraction.getFraction(1, 1, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_negativeNumerator() {
        Fraction.getFraction(1, -1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_overflowPositive() {
        Fraction.getFraction(Integer.MAX_VALUE, 1, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_overflowNegative() {
        Fraction.getFraction(Integer.MIN_VALUE, 1, 2);
    }

    @Test
    public void testGetReducedFraction_valid() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        Assert.assertSame(Fraction.ZERO, f);

        f = Fraction.getReducedFraction(2, 4);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getReducedFraction(2, -4);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(-(Integer.MIN_VALUE / 2), f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_overflowMinNumerator() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_overflowMinDenominator() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testGetFraction_double_valid() {
        Fraction f = Fraction.getFraction(0.5);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(-0.5);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(2.75);
        Assert.assertEquals(11, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        f = Fraction.getFraction(0.0);
        Assert.assertEquals(0, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_double_tooLarge() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 100.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_double_nan() {
        Fraction.getFraction(Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_double_nonConvergent() {
        Fraction.getFraction(0.12345678901234567);
    }

    @Test
    public void testGetFraction_string_valid() {
        Fraction f = Fraction.getFraction("0.5");
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getFraction("1 1/2");
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getFraction("3/4");
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());

        f = Fraction.getFraction("5");
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFraction_string_null() {
        Fraction.getFraction((String) null);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFraction_string_invalidFormat() {
        Fraction.getFraction("1 2 3");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFraction_string_invalidChars() {
        Fraction.getFraction("abc");
    }

    @Test
    public void testAccessors() {
        Fraction f = Fraction.getFraction(7, 4);
        Assert.assertEquals(7, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());
        Assert.assertEquals(3, f.getProperNumerator());
        Assert.assertEquals(1, f.getProperWhole());

        Fraction neg = Fraction.getFraction(-7, 4);
        Assert.assertEquals(-7, neg.getNumerator());
        Assert.assertEquals(4, neg.getDenominator());
        Assert.assertEquals(3, neg.getProperNumerator());
        Assert.assertEquals(-1, neg.getProperWhole());
    }

    @Test
    public void testNumberMethods() {
        Fraction f = Fraction.getFraction(7, 4);
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());
        Assert.assertEquals(1.75f, f.floatValue(), EPSILON);
        Assert.assertEquals(1.75, f.doubleValue(), EPSILON);
    }

    @Test
    public void testReduce() {
        Fraction f = Fraction.getFraction(2, 4);
        Fraction reduced = f.reduce();
        Assert.assertEquals(1, reduced.getNumerator());
        Assert.assertEquals(2, reduced.getDenominator());

        Fraction irreducible = Fraction.getFraction(1, 2);
        Assert.assertSame(irreducible, irreducible.reduce());
    }

    @Test
    public void testInvert() {
        Fraction f = Fraction.getFraction(3, 4);
        Fraction inverted = f.invert();
        Assert.assertEquals(4, inverted.getNumerator());
        Assert.assertEquals(3, inverted.getDenominator());

        Fraction neg = Fraction.getFraction(-3, 4);
        inverted = neg.invert();
        Assert.assertEquals(-4, inverted.getNumerator());
        Assert.assertEquals(3, inverted.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_zero() {
        Fraction.ZERO.invert();
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_minNumerator() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        f.invert();
    }

    @Test
    public void testNegate() {
        Fraction f = Fraction.getFraction(3, 4);
        Fraction negated = f.negate();
        Assert.assertEquals(-3, negated.getNumerator());
        Assert.assertEquals(4, negated.getDenominator());

        Fraction neg = Fraction.getFraction(-3, 4);
        Assert.assertEquals(3, neg.negate().getNumerator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegate_minNumerator() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    @Test
    public void testAbs() {
        Fraction f = Fraction.getFraction(3, 4);
        Assert.assertSame(f, f.abs());

        Fraction neg = Fraction.getFraction(-3, 4);
        Fraction abs = neg.abs();
        Assert.assertEquals(3, abs.getNumerator());
        Assert.assertEquals(4, abs.getDenominator());
    }

    @Test
    public void testPow() {
        Fraction f = Fraction.getFraction(2, 3);
        Assert.assertSame(f, f.pow(1));
        Assert.assertEquals(Fraction.ONE, f.pow(0));
        Assert.assertEquals(Fraction.getFraction(4, 9), f.pow(2));
        Assert.assertEquals(Fraction.getFraction(8, 27), f.pow(3));
        Assert.assertEquals(Fraction.getFraction(9, 4), f.pow(-2));
        Assert.assertEquals(Fraction.ONE, Fraction.ONE.pow(Integer.MIN_VALUE));
    }

    @Test
    public void testAdd() {
        Fraction f1 = Fraction.getFraction(1, 3);
        Fraction f2 = Fraction.getFraction(1, 2);
        Fraction result = f1.add(f2);
        Assert.assertEquals(5, result.getNumerator());
        Assert.assertEquals(6, result.getDenominator());

        Assert.assertEquals(f2, Fraction.ZERO.add(f2));
        Assert.assertEquals(f1, f1.add(Fraction.ZERO));

        Fraction f3 = Fraction.getFraction(1, 6);
        result = f1.add(f3);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_null() {
        Fraction.ONE.add(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testAdd_overflow() {
        Fraction f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = Fraction.getFraction(2, 1);
        f1.add(f2);
    }

    @Test
    public void testSubtract() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction result = f1.subtract(f2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(6, result.getDenominator());

        Assert.assertEquals(Fraction.getFraction(-1, 2), Fraction.ZERO.subtract(f1));
        Assert.assertEquals(f1, f1.subtract(Fraction.ZERO));

        Fraction f3 = Fraction.getFraction(1, 6);
        result = f1.subtract(f3);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(3, result.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_null() {
        Fraction.ONE.subtract(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtract_overflow() {
        Fraction f1 = Fraction.getFraction(Integer.MIN_VALUE + 1, 1);
        Fraction f2 = Fraction.getFraction(2, 1);
        f1.subtract(f2);
    }

    @Test
    public void testMultiplyBy() {
        Fraction f1 = Fraction.getFraction(2, 3);
        Fraction f2 = Fraction.getFraction(3, 4);
        Fraction result = f1.multiplyBy(f2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(2, result.getDenominator());

        Assert.assertEquals(Fraction.ZERO, f1.multiplyBy(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiplyBy(f1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyBy_null() {
        Fraction.ONE.multiplyBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplyBy_overflow() {
        Fraction f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        Fraction f2 = Fraction.getFraction(2, 1);
        f1.multiplyBy(f2);
    }

    @Test
    public void testDivideBy() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 4);
        Fraction result = f1.divideBy(f2);
        Assert.assertEquals(2, result.getNumerator());
        Assert.assertEquals(1, result.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy_null() {
        Fraction.ONE.divideBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy_zero() {
        Fraction.ONE.divideBy(Fraction.ZERO);
    }

    @Test
    public void testEqualsAndHashCode() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        Fraction f3 = Fraction.getFraction(2, 4);
        Fraction f4 = Fraction.getFraction(1, 3);

        Assert.assertTrue(f1.equals(f1));
        Assert.assertTrue(f1.equals(f2));
        Assert.assertFalse(f1.equals(f3));
        Assert.assertFalse(f1.equals(f4));
        Assert.assertFalse(f1.equals(null));
        Assert.assertFalse(f1.equals("string"));

        Assert.assertEquals(f1.hashCode(), f2.hashCode());
        Assert.assertTrue(f1.hashCode() != 0);
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4);
        Fraction f3 = Fraction.getFraction(1, 3);
        Fraction f4 = Fraction.getFraction(2, 3);

        Assert.assertEquals(0, f1.compareTo(f1));
        Assert.assertEquals(0, f1.compareTo(f2));
        Assert.assertTrue(f1.compareTo(f3) > 0);
        Assert.assertTrue(f1.compareTo(f4) < 0);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_null() {
        Fraction.ONE.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_invalidType() {
        Fraction.ONE.compareTo("string");
    }

    @Test
    public void testToString() {
        Fraction f = Fraction.getFraction(3, 4);
        Assert.assertEquals("3/4", f.toString());
        Assert.assertEquals("3/4", f.toString());
    }

    @Test
    public void testToProperString() {
        Assert.assertEquals("0", Fraction.ZERO.toProperString());
        Assert.assertEquals("1", Fraction.ONE.toProperString());
        Assert.assertEquals("-1", Fraction.getFraction(-1, 1).toProperString());
        Assert.assertEquals("3/4", Fraction.getFraction(3, 4).toProperString());
        Assert.assertEquals("-3/4", Fraction.getFraction(-3, 4).toProperString());
        Assert.assertEquals("1 3/4", Fraction.getFraction(7, 4).toProperString());
        Assert.assertEquals("-1 3/4", Fraction.getFraction(-7, 4).toProperString());
        Assert.assertEquals("2", Fraction.getFraction(4, 2).toProperString());
        Assert.assertEquals("-2", Fraction.getFraction(-4, 2).toProperString());
        
        Fraction cached = Fraction.getFraction(7, 4);
        Assert.assertEquals("1 3/4", cached.toProperString());
        Assert.assertEquals("1 3/4", cached.toProperString());
    }
}
