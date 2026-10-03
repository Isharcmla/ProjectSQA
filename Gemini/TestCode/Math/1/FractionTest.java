package org.apache.commons.math3.fraction;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
    public void testConstructorDouble_validValues() {
        Fraction f1 = new Fraction(0.5);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        Fraction f2 = new Fraction(0.0);
        Assert.assertEquals(0, f2.getNumerator());
        Assert.assertEquals(1, f2.getDenominator());

        Fraction f3 = new Fraction(2.0);
        Assert.assertEquals(2, f3.getNumerator());
        Assert.assertEquals(1, f3.getDenominator());

        Fraction f4 = new Fraction(-0.75);
        Assert.assertEquals(-3, f4.getNumerator());
        Assert.assertEquals(4, f4.getDenominator());
    }

    @Test
    public void testConstructorDoubleEpsilonMaxIterations_validValues() {
        Fraction f = new Fraction(0.3333333333, 1e-5, 10);
        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(3, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDouble_overflow() {
        new Fraction(1.0e15, 1e-5, 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDouble_maxIterationsExceeded() {
        new Fraction(0.123456789, 1e-15, 2);
    }

    @Test
    public void testConstructorDoubleMaxDenominator_validValues() {
        Fraction f1 = new Fraction(0.6666666, 10);
        Assert.assertEquals(2, f1.getNumerator());
        Assert.assertEquals(3, f1.getDenominator());

        Fraction f2 = new Fraction(0.4, 2);
        Assert.assertEquals(1, f2.getNumerator());
        Assert.assertEquals(2, f2.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxDenominator_overflowInLoop() {
        new Fraction(1.0 / (Integer.MAX_VALUE - 1.0) * 0.99999999, 10);
        new Fraction(Double.MAX_VALUE, 100);
    }

    @Test
    public void testConstructorInt_valid() {
        Fraction f = new Fraction(5);
        Assert.assertEquals(5, f.getNumerator());
        Assert.assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt_valid() {
        Fraction f1 = new Fraction(2, 4);
        Assert.assertEquals(1, f1.getNumerator());
        Assert.assertEquals(2, f1.getDenominator());

        Fraction f2 = new Fraction(3, -4);
        Assert.assertEquals(-3, f2.getNumerator());
        Assert.assertEquals(4, f2.getDenominator());

        Fraction f3 = new Fraction(-3, -4);
        Assert.assertEquals(3, f3.getNumerator());
        Assert.assertEquals(4, f3.getDenominator());

        Fraction f4 = new Fraction(-3, 4);
        Assert.assertEquals(-3, f4.getNumerator());
        Assert.assertEquals(4, f4.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_zeroDenominator() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_overflowNumerator() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_overflowDenominator() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testAbs() {
        Fraction f1 = new Fraction(-2, 3);
        Fraction abs1 = f1.abs();
        Assert.assertEquals(2, abs1.getNumerator());
        Assert.assertEquals(3, abs1.getDenominator());

        Fraction f2 = new Fraction(2, 3);
        Fraction abs2 = f2.abs();
        Assert.assertSame(f2, abs2);

        Fraction f3 = new Fraction(0, 1);
        Assert.assertEquals(0, f3.abs().getNumerator());
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
    public void testValues() {
        Fraction f = new Fraction(3, 2);
        Assert.assertEquals(1.5, f.doubleValue(), EPSILON);
        Assert.assertEquals(1.5f, f.floatValue(), (float) EPSILON);
        Assert.assertEquals(1, f.intValue());
        Assert.assertEquals(1L, f.longValue());
        Assert.assertEquals(150.0, f.percentageValue(), EPSILON);

        Fraction fNeg = new Fraction(-3, 2);
        Assert.assertEquals(-1.5, fNeg.doubleValue(), EPSILON);
        Assert.assertEquals(-1.5f, fNeg.floatValue(), (float) EPSILON);
        Assert.assertEquals(-1, fNeg.intValue());
        Assert.assertEquals(-1L, fNeg.longValue());
        Assert.assertEquals(-150.0, fNeg.percentageValue(), EPSILON);
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
        Assert.assertFalse(f1.equals("Not a fraction"));

        Assert.assertEquals(f1.hashCode(), f2.hashCode());
        Assert.assertNotEquals(f1.hashCode(), f3.hashCode());
    }

    @Test
    public void testNegate() {
        Fraction f1 = new Fraction(1, 2);
        Fraction neg1 = f1.negate();
        Assert.assertEquals(-1, neg1.getNumerator());
        Assert.assertEquals(2, neg1.getDenominator());

        Fraction f2 = new Fraction(-1, 2);
        Fraction neg2 = f2.negate();
        Assert.assertEquals(1, neg2.getNumerator());
        Assert.assertEquals(2, neg2.getDenominator());

        Fraction f3 = new Fraction(0);
        Fraction neg3 = f3.negate();
        Assert.assertEquals(0, neg3.getNumerator());
        Assert.assertEquals(1, neg3.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_overflow() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    @Test
    public void testReciprocal() {
        Fraction f1 = new Fraction(2, 3);
        Fraction r1 = f1.reciprocal();
        Assert.assertEquals(3, r1.getNumerator());
        Assert.assertEquals(2, r1.getDenominator());

        Fraction f2 = new Fraction(-2, 3);
        Fraction r2 = f2.reciprocal();
        Assert.assertEquals(-3, r2.getNumerator());
        Assert.assertEquals(2, r2.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_zero() {
        Fraction.ZERO.reciprocal();
    }

    @Test
    public void testAddFraction() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(1, 6);
        Fraction sum = f1.add(f2);
        Assert.assertEquals(1, sum.getNumerator());
        Assert.assertEquals(2, sum.getDenominator());

        Assert.assertEquals(f1, f1.add(Fraction.ZERO));
        Assert.assertEquals(f2, Fraction.ZERO.add(f2));

        Fraction f3 = new Fraction(1, 2);
        Fraction f4 = new Fraction(1, 3);
        Fraction sum2 = f3.add(f4);
        Assert.assertEquals(5, sum2.getNumerator());
        Assert.assertEquals(6, sum2.getDenominator());

        Fraction f5 = new Fraction(2, 9);
        Fraction f6 = new Fraction(5, 6);
        Fraction sum3 = f5.add(f6);
        Assert.assertEquals(19, sum3.getNumerator());
        Assert.assertEquals(18, sum3.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddFraction_null() {
        Fraction.ONE.add((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAddFraction_overflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE - 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.add(f2);
    }

    @Test
    public void testAddInt() {
        Fraction f = new Fraction(1, 3);
        Fraction result = f.add(2);
        Assert.assertEquals(7, result.getNumerator());
        Assert.assertEquals(3, result.getDenominator());
    }

    @Test
    public void testSubtractFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction diff = f1.subtract(f2);
        Assert.assertEquals(1, diff.getNumerator());
        Assert.assertEquals(6, diff.getDenominator());

        Assert.assertEquals(f1, f1.subtract(Fraction.ZERO));
        Assert.assertEquals(f1.negate(), Fraction.ZERO.subtract(f1));

        Fraction f3 = new Fraction(1, 3);
        Fraction f4 = new Fraction(1, 6);
        Fraction diff2 = f3.subtract(f4);
        Assert.assertEquals(1, diff2.getNumerator());
        Assert.assertEquals(6, diff2.getDenominator());

        Fraction f5 = new Fraction(5, 6);
        Fraction f6 = new Fraction(2, 9);
        Fraction diff3 = f5.subtract(f6);
        Assert.assertEquals(11, diff3.getNumerator());
        Assert.assertEquals(18, diff3.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractFraction_null() {
        Fraction.ONE.subtract((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testSubtractFraction_overflow() {
        Fraction f1 = new Fraction(Integer.MIN_VALUE + 1, 1);
        Fraction f2 = new Fraction(2, 1);
        f1.subtract(f2);
    }

    @Test
    public void testSubtractInt() {
        Fraction f = new Fraction(7, 3);
        Fraction result = f.subtract(2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(3, result.getDenominator());
    }

    @Test
    public void testMultiplyFraction() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        Fraction product = f1.multiply(f2);
        Assert.assertEquals(1, product.getNumerator());
        Assert.assertEquals(2, product.getDenominator());

        Assert.assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.multiply(f1));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyFraction_null() {
        Fraction.ONE.multiply((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testMultiplyFraction_overflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 2);
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

        Assert.assertEquals(Fraction.ZERO, Fraction.ZERO.divide(f1));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideFraction_null() {
        Fraction.ONE.divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideFraction_byZero() {
        Fraction.ONE.divide(Fraction.ZERO);
    }

    @Test
    public void testDivideInt() {
        Fraction f = new Fraction(2, 3);
        Fraction result = f.divide(2);
        Assert.assertEquals(1, result.getNumerator());
        Assert.assertEquals(3, result.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideInt_byZero() {
        Fraction.ONE.divide(0);
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
        Assert.assertEquals("0", new Fraction(0, 3).toString());
        Assert.assertEquals("3", new Fraction(3, 1).toString());
        Assert.assertEquals("-3", new Fraction(-3, 1).toString());
        Assert.assertEquals("1 / 2", new Fraction(1, 2).toString());
        Assert.assertEquals("-1 / 2", new Fraction(-1, 2).toString());
    }

    @Test
    public void testGetField() {
        Fraction f = new Fraction(1, 2);
        Assert.assertEquals(FractionField.getInstance(), f.getField());
    }

    @Test
    public void testSerialization() throws Exception {
        Fraction original = new Fraction(3, 7);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Fraction deserialized = (Fraction) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.getNumerator(), deserialized.getNumerator());
        Assert.assertEquals(original.getDenominator(), deserialized.getDenominator());
    }
}
