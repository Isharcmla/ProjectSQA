package org.apache.commons.lang3.math;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

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
        Fraction f = Fraction.getFraction(3, 5);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(5, f.getDenominator());

        f = Fraction.getFraction(-3, 5);
        Assert.assertEquals(-3, f.getNumerator());
        Assert.assertEquals(5, f.getDenominator());

        f = Fraction.getFraction(3, -5);
        Assert.assertEquals(-3, f.getNumerator());
        Assert.assertEquals(5, f.getDenominator());

        f = Fraction.getFraction(-3, -5);
        Assert.assertEquals(3, f.getNumerator());
        Assert.assertEquals(5, f.getDenominator());

        f = Fraction.getFraction(0, 5);
        Assert.assertEquals(0, f.getNumerator());
        Assert.assertEquals(5, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_twoInts_zeroDenominator() {
        Fraction.getFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_twoInts_minNumeratorNegativeDenom() {
        Fraction.getFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_twoInts_minDenominator() {
        Fraction.getFraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testGetFraction_threeInts_valid() {
        Fraction f = Fraction.getFraction(1, 2, 3);
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());

        f = Fraction.getFraction(-1, 2, 3);
        Assert.assertEquals(-5, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());

        f = Fraction.getFraction(0, 2, 3);
        Assert.assertEquals(2, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());

        f = Fraction.getFraction(0, 0, 3);
        Assert.assertEquals(0, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_zeroDenominator() {
        Fraction.getFraction(1, 2, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_negativeDenominator() {
        Fraction.getFraction(1, 2, -3);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_threeInts_negativeNumerator() {
        Fraction.getFraction(1, -2, 3);
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

        f = Fraction.getReducedFraction(-2, 4);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getReducedFraction(2, -4);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getReducedFraction(-2, -4);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        // power of 2 with Integer.MIN_VALUE denominator
        f = Fraction.getReducedFraction(4, Integer.MIN_VALUE);
        Assert.assertEquals(-1, f.getNumerator());
        Assert.assertEquals(1 << 29, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_minNumeratorNegativeDenom() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_minDenominatorOddNumerator() {
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

        f = Fraction.getFraction(0.0);
        Assert.assertEquals(0, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());

        f = Fraction.getFraction(2.5);
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());

        f = Fraction.getFraction(-2.5);
        Assert.assertEquals(-5, f.getNumerator());
        Assert.assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_double_greaterThanMaxInt() {
        Fraction.getFraction((double) Integer.MAX_VALUE + 1.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_double_nan() {
        Fraction.getFraction(Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFraction_double_nonConvergent() {
        // A value designed to not converge in 25 iterations within denom <= 10000 bound
        Fraction.getFraction(0.4999999999999999);
    }

    @Test
    public void testGetFraction_String_valid() {
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

        f = Fraction.getFraction("-5");
        Assert.assertEquals(-5, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFraction_String_null() {
        Fraction.getFraction((String) null);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFraction_String_invalidCompoundFormat() {
        Fraction.getFraction("1 2");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFraction_String_invalidSimpleFormat() {
        Fraction.getFraction("abc");
    }

    @Test
    public void testAccessorsAndNumberMethods() {
        Fraction f = Fraction.getFraction(7, 4);
        Assert.assertEquals(7, f.getNumerator());
        Assert.assertEquals(4, f.getDenominator());
        Assert.assertEquals(3, f.getProperNumerator());
        Assert.assertEquals(1, f.getProperWhole());
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());
        Assert.assertEquals(1.75f, f.floatValue(), 0.00001f);
        Assert.assertEquals(1.75d, f.doubleValue(), 0.00001d);

        Fraction neg = Fraction.getFraction(-7, 4);
        Assert.assertEquals(-7, neg.getNumerator());
        Assert.assertEquals(4, neg.getDenominator());
        Assert.assertEquals(3, neg.getProperNumerator());
        Assert.assertEquals(-1, neg.getProperWhole());
        Assert.assertEquals(-1, neg.intValue());
        Assert.assertEquals(-1L, neg.longValue());
        Assert.assertEquals(-1.75f, neg.floatValue(), 0.00001f);
        Assert.assertEquals(-1.75d, neg.doubleValue(), 0.00001d);
    }

    @Test
    public void testReduce() {
        Fraction f = Fraction.getFraction(2, 4);
        Fraction reduced = f.reduce();
        Assert.assertEquals(1, reduced.getNumerator());
        Assert.assertEquals(2, reduced.getDenominator());

        Fraction irreducible = Fraction.getFraction(1, 2);
        Assert.assertSame(irreducible, irreducible.reduce());

        Fraction zero = Fraction.ZERO;
        Assert.assertSame(zero, zero.reduce());

        Fraction zeroUnreduced = Fraction.getFraction(0, 5);
        Assert.assertEquals(Fraction.ZERO, zeroUnreduced.reduce());
    }

    @Test
    public void testInvert() {
        Fraction f = Fraction.getFraction(3, 4);
        Fraction inv = f.invert();
        Assert.assertEquals(4, inv.getNumerator());
        Assert.assertEquals(3, inv.getDenominator());

        Fraction neg = Fraction.getFraction(-3, 4);
        Fraction negInv = neg.invert();
        Assert.assertEquals(-4, negInv.getNumerator());
        Assert.assertEquals(3, negInv.getDenominator());
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
        Fraction neg = f.negate();
        Assert.assertEquals(-3, neg.getNumerator());
        Assert.assertEquals(4, neg.getDenominator());

        Fraction neg2 = Fraction.getFraction(-3, 4);
        Fraction pos = neg2.negate();
        Assert.assertEquals(3, pos.getNumerator());
        Assert.assertEquals(4, pos.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegate_minNumerator() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    @Test
    public void testAbs() {
        Fraction pos = Fraction.getFraction(3, 4);
        Assert.assertSame(pos, pos.abs());

        Fraction neg = Fraction.getFraction(-3, 4);
        Fraction abs = neg.abs();
        Assert.assertEquals(3, abs.getNumerator());
        Assert.assertEquals(4, abs.getDenominator());
    }

    @Test
    public void testPow() {
        Fraction f = Fraction.getFraction(2, 3);
        Assert.assertEquals(Fraction.ONE, f.pow(0));
        Assert.assertSame(f, f.pow(1));
        Assert.assertEquals(Fraction.getFraction(4, 9), f.pow(2));
        Assert.assertEquals(Fraction.getFraction(8, 27), f.pow(3));
        Assert.assertEquals(Fraction.getFraction(3, 2), f.pow(-1));
        Assert.assertEquals(Fraction.getFraction(9, 4), f.pow(-2));
        Assert.assertEquals(Fraction.getFraction(27, 8), f.pow(-3));

        Assert.assertEquals(Fraction.ONE, Fraction.ZERO.pow(0));

        Fraction one = Fraction.ONE;
        Assert.assertEquals(Fraction.ONE, one.pow(Integer.MIN_VALUE));
    }

    @Test
    public void testAdd() {
        Fraction f1 = Fraction.getFraction(1, 3);
        Fraction f2 = Fraction.getFraction(1, 6);
        Fraction res = f1.add(f2);
        Assert.assertEquals(1, res.getNumerator());
        Assert.assertEquals(2, res.getDenominator());

        Fraction coprime1 = Fraction.getFraction(1, 3);
        Fraction coprime2 = Fraction.getFraction(1, 4);
        Assert.assertEquals(Fraction.getFraction(7, 12), coprime1.add(coprime2));

        Assert.assertSame(f1, f1.add(Fraction.ZERO));
        Assert.assertSame(f2, Fraction.ZERO.add(f2));

        Fraction f3 = Fraction.getFraction(1, 4);
        Fraction f4 = Fraction.getFraction(3, 4);
        Assert.assertEquals(Fraction.ONE, f3.add(f4));
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
        Fraction f2 = Fraction.getFraction(1, 6);
        Fraction res = f1.subtract(f2);
        Assert.assertEquals(1, res.getNumerator());
        Assert.assertEquals(3, res.getDenominator());

        Fraction coprime1 = Fraction.getFraction(1, 3);
        Fraction coprime2 = Fraction.getFraction(1, 4);
        Assert.assertEquals(Fraction.getFraction(1, 12), coprime1.subtract(coprime2));

        Assert.assertSame(f1, f1.subtract(Fraction.ZERO));
        Assert.assertEquals(Fraction.getFraction(-1, 6), Fraction.ZERO.subtract(f2));
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
        Fraction res = f1.multiplyBy(f2);
        Assert.assertEquals(1, res.getNumerator());
        Assert.assertEquals(2, res.getDenominator());

        Assert.assertSame(Fraction.ZERO, f1.multiplyBy(Fraction.ZERO));
        Assert.assertSame(Fraction.ZERO, Fraction.ZERO.multiplyBy(f2));
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
        Fraction f2 = Fraction.getFraction(3, 4);
        Fraction res = f1.divideBy(f2);
        Assert.assertEquals(2, res.getNumerator());
        Assert.assertEquals(3, res.getDenominator());
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
        Assert.assertFalse(f1.equals("1/2"));

        Assert.assertEquals(f1.hashCode(), f2.hashCode());
        Assert.assertEquals(f1.hashCode(), f1.hashCode());
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        Fraction f3 = Fraction.getFraction(2, 4);
        Fraction f4 = Fraction.getFraction(1, 3);
        Fraction f5 = Fraction.getFraction(2, 3);

        Assert.assertEquals(0, f1.compareTo(f1));
        Assert.assertEquals(0, f1.compareTo(f2));
        Assert.assertEquals(0, f1.compareTo(f3));
        Assert.assertEquals(1, f1.compareTo(f4));
        Assert.assertEquals(-1, f1.compareTo(f5));
    }

    @Test
    public void testToString() {
        Fraction f1 = Fraction.getFraction(3, 4);
        Assert.assertEquals("3/4", f1.toString());
        Assert.assertSame(f1.toString(), f1.toString());

        Fraction f2 = Fraction.getFraction(-3, 4);
        Assert.assertEquals("-3/4", f2.toString());
    }

    @Test
    public void testToProperString() {
        Fraction f0 = Fraction.ZERO;
        Assert.assertEquals("0", f0.toProperString());

        Fraction f1 = Fraction.ONE;
        Assert.assertEquals("1", f1.toProperString());

        Fraction fNeg1 = Fraction.getFraction(-1, 1);
        Assert.assertEquals("-1", fNeg1.toProperString());

        Fraction f2 = Fraction.getFraction(7, 4);
        Assert.assertEquals("1 3/4", f2.toProperString());

        Fraction f3 = Fraction.getFraction(-7, 4);
        Assert.assertEquals("-1 3/4", f3.toProperString());

        Fraction f4 = Fraction.getFraction(8, 4);
        Assert.assertEquals("2", f4.toProperString());

        Fraction f5 = Fraction.getFraction(-8, 4);
        Assert.assertEquals("-2", f5.toProperString());

        Fraction f6 = Fraction.getFraction(3, 4);
        Assert.assertEquals("3/4", f6.toProperString());

        Fraction f7 = Fraction.getFraction(-3, 4);
        Assert.assertEquals("-3/4", f7.toProperString());

        Fraction fMinWhole = Fraction.getFraction(Integer.MIN_VALUE, 1);
        Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), fMinWhole.toProperString());

        Assert.assertSame(f2.toProperString(), f2.toProperString());
    }
}
