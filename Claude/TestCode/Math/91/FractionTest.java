package org.apache.commons.math.fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FractionTest {

    // ---------- Constructor: Fraction(int, int) ----------

    @Test
    public void testIntIntConstructor_normalInput_reducesCorrectly() {
        Fraction f = new Fraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testIntIntConstructor_negativeDenominator_signMovesToNumerator() {
        Fraction f = new Fraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testIntIntConstructor_zeroDenominator_throwsException() {
        new Fraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testIntIntConstructor_minValueNumeratorNegativeDenominator_throwsOverflow() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testIntIntConstructor_minValueDenominator_throwsOverflow() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testIntIntConstructor_positiveValues_noReductionNeeded() {
        Fraction f = new Fraction(3, 7);
        assertEquals(3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    // ---------- Constructor: Fraction(double) ----------

    @Test
    public void testDoubleConstructor_simpleValue_producesCorrectFraction() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testDoubleConstructor_integerValue_producesIntegerFraction() throws FractionConversionException {
        Fraction f = new Fraction(2.0);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleConstructor_overflowValue_throwsException() throws FractionConversionException {
        new Fraction(1.0e10);
    }

    // ---------- Constructor: Fraction(double, epsilon, maxIterations) ----------

    @Test
    public void testDoubleEpsilonIterationsConstructor_normalValue_works() throws FractionConversionException {
        Fraction f = new Fraction(Math.PI, 1.0e-6, 1000);
        assertTrue(Math.abs(f.doubleValue() - Math.PI) < 1.0e-6);
    }

    @Test(expected = FractionConversionException.class)
    public void testDoubleEpsilonIterationsConstructor_notEnoughIterations_throwsException() throws FractionConversionException {
        new Fraction(Math.PI, 1.0e-20, 2);
    }

    // ---------- Constructor: Fraction(double, maxDenominator) ----------

    @Test
    public void testDoubleMaxDenominatorConstructor_normalValue_denominatorWithinLimit() throws FractionConversionException {
        Fraction f = new Fraction(Math.PI, 100);
        assertTrue(f.getDenominator() <= 100);
    }

    @Test
    public void testDoubleMaxDenominatorConstructor_exactValue_producesExactFraction() throws FractionConversionException {
        Fraction f = new Fraction(0.25, 1000);
        assertEquals(1, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    // ---------- abs() ----------

    @Test
    public void testAbs_positiveNumerator_returnsSame() {
        Fraction f = new Fraction(3, 4);
        assertEquals(f, f.abs());
    }

    @Test
    public void testAbs_negativeNumerator_returnsPositive() {
        Fraction f = new Fraction(-3, 4);
        Fraction result = f.abs();
        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    // ---------- compareTo ----------

    @Test
    public void testCompareTo_lessThan_returnsNegative() {
        Fraction a = new Fraction(1, 4);
        Fraction b = new Fraction(1, 2);
        assertEquals(-1, a.compareTo(b));
    }

    @Test
    public void testCompareTo_greaterThan_returnsPositive() {
        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(1, 2);
        assertEquals(1, a.compareTo(b));
    }

    @Test
    public void testCompareTo_equal_returnsZero() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 4);
        assertEquals(0, a.compareTo(b));
    }

    // ---------- doubleValue ----------

    @Test
    public void testDoubleValue_normalFraction_returnsCorrectValue() {
        Fraction f = new Fraction(1, 4);
        assertEquals(0.25, f.doubleValue(), 1.0e-9);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        Fraction f = new Fraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals("not a fraction"));
    }

    @Test
    public void testEquals_equalFractions_returnsTrue() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 4);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentFractions_returnsFalse() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        assertFalse(a.equals(b));
    }

    // ---------- floatValue ----------

    @Test
    public void testFloatValue_normalFraction_returnsCorrectValue() {
        Fraction f = new Fraction(1, 4);
        assertEquals(0.25f, f.floatValue(), 1.0e-6f);
    }

    // ---------- getDenominator / getNumerator ----------

    @Test
    public void testGetDenominator_normalFraction_returnsDenominator() {
        Fraction f = new Fraction(3, 7);
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetNumerator_normalFraction_returnsNumerator() {
        Fraction f = new Fraction(3, 7);
        assertEquals(3, f.getNumerator());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalFractions_haveSameHashCode() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 4);
        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------- intValue / longValue ----------

    @Test
    public void testIntValue_wholeNumberPart_returnsCorrectValue() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testLongValue_wholeNumberPart_returnsCorrectValue() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    // ---------- negate ----------

    @Test
    public void testNegate_positiveFraction_returnsNegative() {
        Fraction f = new Fraction(3, 4);
        Fraction result = f.negate();
        assertEquals(-3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegate_minValueNumerator_throwsException() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    // ---------- reciprocal ----------

    @Test
    public void testReciprocal_normalFraction_returnsInverse() {
        Fraction f = new Fraction(3, 4);
        Fraction result = f.reciprocal();
        assertEquals(4, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    // ---------- add ----------

    @Test
    public void testAdd_normalFractions_d1Equals1_returnsCorrectSum() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction result = a.add(b);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAdd_d1NotEqual1_usesBigIntegerPath() {
        Fraction a = new Fraction(1, 4);
        Fraction b = new Fraction(1, 6);
        Fraction result = a.add(b);
        assertEquals(5, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    public void testAdd_thisNumeratorZero_returnsOtherFraction() {
        Fraction a = new Fraction(0, 1);
        Fraction b = new Fraction(1, 3);
        Fraction result = a.add(b);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testAdd_otherNumeratorZero_returnsThisFraction() {
        Fraction a = new Fraction(1, 3);
        Fraction b = new Fraction(0, 1);
        Fraction result = a.add(b);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullFraction_throwsException() {
        Fraction a = new Fraction(1, 2);
        a.add(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testAdd_overflow_throwsException() {
        Fraction a = new Fraction(Integer.MAX_VALUE, 1);
        Fraction b = new Fraction(1, 1);
        a.add(b);
    }

    // ---------- subtract ----------

    @Test
    public void testSubtract_normalFractions_d1Equals1_returnsCorrectDifference() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction result = a.subtract(b);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtract_d1NotEqual1_usesBigIntegerPath() {
        Fraction a = new Fraction(1, 4);
        Fraction b = new Fraction(1, 6);
        Fraction result = a.subtract(b);
        assertEquals(1, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    public void testSubtract_thisNumeratorZero_returnsNegatedOther() {
        Fraction a = new Fraction(0, 1);
        Fraction b = new Fraction(1, 3);
        Fraction result = a.subtract(b);
        assertEquals(-1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testSubtract_otherNumeratorZero_returnsThisFraction() {
        Fraction a = new Fraction(1, 3);
        Fraction b = new Fraction(0, 1);
        Fraction result = a.subtract(b);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_nullFraction_throwsException() {
        Fraction a = new Fraction(1, 2);
        a.subtract(null);
    }

    // ---------- multiply ----------

    @Test
    public void testMultiply_normalFractions_returnsCorrectProduct() {
        Fraction a = new Fraction(2, 3);
        Fraction b = new Fraction(3, 4);
        Fraction result = a.multiply(b);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testMultiply_thisNumeratorZero_returnsZero() {
        Fraction a = new Fraction(0, 1);
        Fraction b = new Fraction(3, 4);
        Fraction result = a.multiply(b);
        assertEquals(Fraction.ZERO, result);
    }

    @Test
    public void testMultiply_otherNumeratorZero_returnsZero() {
        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(0, 1);
        Fraction result = a.multiply(b);
        assertEquals(Fraction.ZERO, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_nullFraction_throwsException() {
        Fraction a = new Fraction(1, 2);
        a.multiply(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiply_overflow_throwsException() {
        Fraction a = new Fraction(Integer.MAX_VALUE, 1);
        Fraction b = new Fraction(2, 1);
        a.multiply(b);
    }

    // ---------- divide ----------

    @Test
    public void testDivide_normalFractions_returnsCorrectQuotient() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 4);
        Fraction result = a.divide(b);
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide_nullFraction_throwsException() {
        Fraction a = new Fraction(1, 2);
        a.divide(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide_byZeroFraction_throwsException() {
        Fraction a = new Fraction(1, 2);
        Fraction zero = new Fraction(0, 1);
        a.divide(zero);
    }

    // ---------- getReducedFraction ----------

    @Test
    public void testGetReducedFraction_normalInput_reducesCorrectly() {
        Fraction f = Fraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_numeratorZero_returnsZero() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertEquals(Fraction.ZERO, f);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator_throwsException() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_negativeDenominator_normalizesSign() {
        Fraction f = Fraction.getReducedFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_minValueNumeratorNegativeDenominator_throwsOverflow() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -5);
    }

    @Test
    public void testGetReducedFraction_minValueDenominatorEvenNumerator_handlesSpecialCase() {
        Fraction f = Fraction.getReducedFraction(4, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(536870912, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_minValueDenominatorOddNumerator_throwsOverflow() {
        Fraction.getReducedFraction(3, Integer.MIN_VALUE);
    }

    // ---------- Constants ----------

    @Test
    public void testConstants_haveExpectedValues() {
        assertEquals(2, Fraction.TWO.getNumerator());
        assertEquals(1, Fraction.TWO.getDenominator());

        assertEquals(1, Fraction.ONE.getNumerator());
        assertEquals(1, Fraction.ONE.getDenominator());

        assertEquals(0, Fraction.ZERO.getNumerator());
        assertEquals(1, Fraction.ZERO.getDenominator());

        assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
        assertEquals(1, Fraction.MINUS_ONE.getDenominator());
    }
}
