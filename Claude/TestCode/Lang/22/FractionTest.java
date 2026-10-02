import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.lang3.math.Fraction;

public class FractionTest {

    private Fraction f1;
    private Fraction f2;

    @Before
    public void setUp() {
        f1 = Fraction.getFraction(3, 7);
        f2 = Fraction.getFraction(1, 2);
    }

    // ---------- Constants ----------
    @Test
    public void testConstants_values_correct() {
        assertEquals(0, Fraction.ZERO.getNumerator());
        assertEquals(1, Fraction.ZERO.getDenominator());
        assertEquals(1, Fraction.ONE.getNumerator());
        assertEquals(1, Fraction.ONE.getDenominator());
        assertEquals(1, Fraction.ONE_HALF.getNumerator());
        assertEquals(2, Fraction.ONE_HALF.getDenominator());
        assertEquals(1, Fraction.ONE_THIRD.getNumerator());
        assertEquals(3, Fraction.ONE_THIRD.getDenominator());
        assertEquals(2, Fraction.TWO_THIRDS.getNumerator());
        assertEquals(3, Fraction.TWO_THIRDS.getDenominator());
        assertEquals(1, Fraction.ONE_QUARTER.getNumerator());
        assertEquals(4, Fraction.ONE_QUARTER.getDenominator());
        assertEquals(2, Fraction.TWO_QUARTERS.getNumerator());
        assertEquals(4, Fraction.TWO_QUARTERS.getDenominator());
        assertEquals(3, Fraction.THREE_QUARTERS.getNumerator());
        assertEquals(4, Fraction.THREE_QUARTERS.getDenominator());
        assertEquals(1, Fraction.ONE_FIFTH.getNumerator());
        assertEquals(5, Fraction.ONE_FIFTH.getDenominator());
        assertEquals(2, Fraction.TWO_FIFTHS.getNumerator());
        assertEquals(5, Fraction.TWO_FIFTHS.getDenominator());
        assertEquals(3, Fraction.THREE_FIFTHS.getNumerator());
        assertEquals(5, Fraction.THREE_FIFTHS.getDenominator());
        assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
    }

    // ---------- getFraction(int, int) ----------
    @Test
    public void testGetFractionIntInt_normal_correctValues() {
        Fraction f = Fraction.getFraction(3, 7);
        assertEquals(3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_zeroDenominator_throwsException() {
        Fraction.getFraction(1, 0);
    }

    @Test
    public void testGetFractionIntInt_negativeDenominator_resolvedToNumerator() {
        Fraction f = Fraction.getFraction(3, -7);
        assertEquals(-3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_negativeDenominatorMinValueNumerator_throwsException() {
        Fraction.getFraction(Integer.MIN_VALUE, -7);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionIntInt_denominatorMinValue_throwsException() {
        Fraction.getFraction(3, Integer.MIN_VALUE);
    }

    // ---------- getFraction(int, int, int) ----------
    @Test
    public void testGetFractionWholeNumDenom_normal_correctValues() {
        Fraction f = Fraction.getFraction(1, 3, 7);
        assertEquals(10, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetFractionWholeNumDenom_negativeWhole_correctValues() {
        Fraction f = Fraction.getFraction(-1, 3, 7);
        assertEquals(-10, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_zeroDenominator_throwsException() {
        Fraction.getFraction(1, 2, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_negativeDenominator_throwsException() {
        Fraction.getFraction(1, 2, -3);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_negativeNumerator_throwsException() {
        Fraction.getFraction(1, -2, 3);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionWholeNumDenom_overflow_throwsException() {
        Fraction.getFraction(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    // ---------- getReducedFraction ----------
    @Test
    public void testGetReducedFraction_normal_reducedCorrectly() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator_throwsException() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_zeroNumerator_returnsZero() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertEquals(Fraction.ZERO, f);
    }

    @Test
    public void testGetReducedFraction_negativeDenominator_resolvedCorrectly() {
        Fraction f = Fraction.getReducedFraction(2, -4);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetReducedFraction_numeratorMinValueNegativeDenom_throwsException() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -3);
    }

    @Test
    public void testGetReducedFraction_denominatorMinValueEvenNumerator_handledCorrectly() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
    }

    // ---------- getFraction(double) ----------
    @Test
    public void testGetFractionDouble_normal_correctValue() {
        Fraction f = Fraction.getFraction(0.5d);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_negativeValue_correctValue() {
        Fraction f = Fraction.getFraction(-0.5d);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_wholeNumber_correctValue() {
        Fraction f = Fraction.getFraction(5.0d);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFractionDouble_zero_correctValue() {
        Fraction f = Fraction.getFraction(0.0d);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_NaN_throwsException() {
        Fraction.getFraction(Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionDouble_tooLarge_throwsException() {
        Fraction.getFraction(((double) Integer.MAX_VALUE) + 1.0d);
    }

    // ---------- getFraction(String) ----------
    @Test(expected = IllegalArgumentException.class)
    public void testGetFractionString_null_throwsException() {
        Fraction.getFraction((String) null);
    }

    @Test
    public void testGetFractionString_doubleFormat_correctValue() {
        Fraction f = Fraction.getFraction("0.5");
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFractionString_wholeAndFractionFormat_correctValue() {
        Fraction f = Fraction.getFraction("1 3/7");
        assertEquals(10, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_wholeAndFractionFormatMissingSlash_throwsException() {
        Fraction.getFraction("1 37");
    }

    @Test
    public void testGetFractionString_simpleFractionFormat_correctValue() {
        Fraction f = Fraction.getFraction("3/7");
        assertEquals(3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetFractionString_wholeNumberFormat_correctValue() {
        Fraction f = Fraction.getFraction("5");
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFractionString_invalidFormat_throwsException() {
        Fraction.getFraction("abc");
    }

    // ---------- Accessors ----------
    @Test
    public void testGetNumerator_normal_correctValue() {
        assertEquals(3, f1.getNumerator());
    }

    @Test
    public void testGetDenominator_normal_correctValue() {
        assertEquals(7, f1.getDenominator());
    }

    @Test
    public void testGetProperNumerator_improperFraction_correctValue() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(3, f.getProperNumerator());
    }

    @Test
    public void testGetProperNumerator_negativeFraction_returnsPositive() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(3, f.getProperNumerator());
    }

    @Test
    public void testGetProperWhole_improperFraction_correctValue() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(1, f.getProperWhole());
    }

    @Test
    public void testGetProperWhole_negativeFraction_correctValue() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-1, f.getProperWhole());
    }

    // ---------- Number methods ----------
    @Test
    public void testIntValue_normal_correctValue() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(1, f.intValue());
    }

    @Test
    public void testLongValue_normal_correctValue() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(1L, f.longValue());
    }

    @Test
    public void testFloatValue_normal_correctValue() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(0.5f, f.floatValue(), 0.0001f);
    }

    @Test
    public void testDoubleValue_normal_correctValue() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(0.5d, f.doubleValue(), 0.0001d);
    }

    // ---------- reduce ----------
    @Test
    public void testReduce_reducibleFraction_returnsReduced() {
        Fraction f = Fraction.getFraction(2, 4);
        Fraction reduced = f.reduce();
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());
    }

    @Test
    public void testReduce_alreadyReduced_returnsSameInstance() {
        Fraction f = Fraction.getFraction(3, 7);
        Fraction reduced = f.reduce();
        assertSame(f, reduced);
    }

    @Test
    public void testReduce_zeroNumerator_returnsZero() {
        Fraction f = Fraction.getFraction(0, 5);
        Fraction reduced = f.reduce();
        assertEquals(Fraction.ZERO, reduced);
    }

    @Test
    public void testReduce_zeroEqualsZeroConst_returnsThis() {
        Fraction reduced = Fraction.ZERO.reduce();
        assertSame(Fraction.ZERO, reduced);
    }

    // ---------- invert ----------
    @Test
    public void testInvert_normal_correctValue() {
        Fraction f = Fraction.getFraction(3, 7);
        Fraction inv = f.invert();
        assertEquals(7, inv.getNumerator());
        assertEquals(3, inv.getDenominator());
    }

    @Test
    public void testInvert_negativeNumerator_correctValue() {
        Fraction f = Fraction.getFraction(-3, 7);
        Fraction inv = f.invert();
        assertEquals(-7, inv.getNumerator());
        assertEquals(3, inv.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_zeroNumerator_throwsException() {
        Fraction.ZERO.invert();
    }

    @Test(expected = ArithmeticException.class)
    public void testInvert_numeratorMinValue_throwsException() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        f.invert();
    }

    // ---------- negate ----------
    @Test
    public void testNegate_normal_correctValue() {
        Fraction f = Fraction.getFraction(3, 7);
        Fraction neg = f.negate();
        assertEquals(-3, neg.getNumerator());
        assertEquals(7, neg.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testNegate_numeratorMinValue_throwsException() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    // ---------- abs ----------
    @Test
    public void testAbs_positiveFraction_returnsSame() {
        Fraction f = Fraction.getFraction(3, 7);
        Fraction abs = f.abs();
        assertSame(f, abs);
    }

    @Test
    public void testAbs_negativeFraction_returnsPositive() {
        Fraction f = Fraction.getFraction(-3, 7);
        Fraction abs = f.abs();
        assertEquals(3, abs.getNumerator());
        assertEquals(7, abs.getDenominator());
    }

    // ---------- pow ----------
    @Test
    public void testPow_powerOne_returnsSame() {
        Fraction f = Fraction.getFraction(3, 7);
        assertSame(f, f.pow(1));
    }

    @Test
    public void testPow_powerZero_returnsOne() {
        Fraction f = Fraction.getFraction(3, 7);
        assertEquals(Fraction.ONE, f.pow(0));
    }

    @Test
    public void testPow_positivePowerEven_correctValue() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction result = f.pow(2);
        assertEquals(4, result.getNumerator());
        assertEquals(9, result.getDenominator());
    }

    @Test
    public void testPow_positivePowerOdd_correctValue() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction result = f.pow(3);
        assertEquals(8, result.getNumerator());
        assertEquals(27, result.getDenominator());
    }

    @Test
    public void testPow_negativePower_correctValue() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction result = f.pow(-2);
        assertEquals(9, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    public void testPow_minValuePower_handledCorrectly() {
        Fraction f = Fraction.getFraction(1, 1);
        Fraction result = f.pow(Integer.MIN_VALUE);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    // ---------- Arithmetic: add ----------
    @Test
    public void testAdd_normal_correctValue() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(1, 3);
        Fraction result = a.add(b);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAdd_zeroThis_returnsOther() {
        Fraction a = Fraction.ZERO;
        Fraction b = Fraction.getFraction(1, 3);
        Fraction result = a.add(b);
        assertSame(b, result);
    }

    @Test
    public void testAdd_zeroOther_returnsThis() {
        Fraction a = Fraction.getFraction(1, 3);
        Fraction b = Fraction.ZERO;
        Fraction result = a.add(b);
        assertSame(a, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_null_throwsException() {
        f1.add(null);
    }

    @Test
    public void testAdd_differentDenominatorsGcdNotOne_correctValue() {
        Fraction a = Fraction.getFraction(1, 4);
        Fraction b = Fraction.getFraction(1, 6);
        Fraction result = a.add(b);
        assertEquals(5, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testAdd_overflow_throwsException() {
        Fraction a = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        Fraction b = Fraction.getFraction(1, 1);
        a.add(b);
    }

    // ---------- Arithmetic: subtract ----------
    @Test
    public void testSubtract_normal_correctValue() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(1, 3);
        Fraction result = a.subtract(b);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtract_zeroThis_returnsNegatedOther() {
        Fraction a = Fraction.ZERO;
        Fraction b = Fraction.getFraction(1, 3);
        Fraction result = a.subtract(b);
        assertEquals(-1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testSubtract_zeroOther_returnsThis() {
        Fraction a = Fraction.getFraction(1, 3);
        Fraction b = Fraction.ZERO;
        Fraction result = a.subtract(b);
        assertSame(a, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_null_throwsException() {
        f1.subtract(null);
    }

    // ---------- Arithmetic: multiplyBy ----------
    @Test
    public void testMultiplyBy_normal_correctValue() {
        Fraction a = Fraction.getFraction(2, 3);
        Fraction b = Fraction.getFraction(3, 4);
        Fraction result = a.multiplyBy(b);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testMultiplyBy_zeroThis_returnsZero() {
        Fraction a = Fraction.ZERO;
        Fraction b = Fraction.getFraction(3, 4);
        Fraction result = a.multiplyBy(b);
        assertEquals(Fraction.ZERO, result);
    }

    @Test
    public void testMultiplyBy_zeroOther_returnsZero() {
        Fraction a = Fraction.getFraction(3, 4);
        Fraction b = Fraction.ZERO;
        Fraction result = a.multiplyBy(b);
        assertEquals(Fraction.ZERO, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyBy_null_throwsException() {
        f1.multiplyBy(null);
    }

    // ---------- Arithmetic: divideBy ----------
    @Test
    public void testDivideBy_normal_correctValue() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(1, 3);
        Fraction result = a.divideBy(b);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy_null_throwsException() {
        f1.divideBy(null);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy_zeroDivisor_throwsException() {
        Fraction a = Fraction.getFraction(1, 2);
        a.divideBy(Fraction.ZERO);
    }

    // ---------- equals ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(f1.equals(f1));
    }

    @Test
    public void testEquals_equalFraction_returnsTrue() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(1, 2);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_differentFraction_returnsFalse() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(2, 4);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_notFractionInstance_returnsFalse() {
        assertFalse(f1.equals("not a fraction"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(f1.equals(null));
    }

    // ---------- hashCode ----------
    @Test
    public void testHashCode_equalFractions_sameHashCode() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(1, 2);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testHashCode_calledTwice_cachedValueConsistent() {
        int h1 = f1.hashCode();
        int h2 = f1.hashCode();
        assertEquals(h1, h2);
    }

    // ---------- compareTo ----------
    @Test
    public void testCompareTo_sameInstance_returnsZero() {
        assertEquals(0, f1.compareTo(f1));
    }

    @Test
    public void testCompareTo_equalValueDifferentInstance_returnsZero() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(1, 2);
        assertEquals(0, a.compareTo(b));
    }

    @Test
    public void testCompareTo_equivalentFractionsDifferentRepresentation_returnsZero() {
        Fraction a = Fraction.getFraction(1, 2);
        Fraction b = Fraction.getFraction(2, 4);
        assertEquals(0, a.compareTo(b));
    }

    @Test
    public void testCompareTo_lessThan_returnsNegative() {
        Fraction a = Fraction.getFraction(1, 3);
        Fraction b = Fraction.getFraction(1, 2);
        assertTrue(a.compareTo(b) < 0);
    }

    @Test
    public void testCompareTo_greaterThan_returnsPositive() {
        Fraction a = Fraction.getFraction(2, 3);
        Fraction b = Fraction.getFraction(1, 2);
        assertTrue(a.compareTo(b) > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_null_throwsException() {
        f1.compareTo(null);
    }

    // ---------- toString ----------
    @Test
    public void testToString_normal_correctFormat() {
        Fraction f = Fraction.getFraction(3, 7);
        assertEquals("3/7", f.toString());
    }

    @Test
    public void testToString_calledTwice_cachedValueConsistent() {
        String s1 = f1.toString();
        String s2 = f1.toString();
        assertSame(s1, s2);
    }

    // ---------- toProperString ----------
    @Test
    public void testToProperString_zeroNumerator_returnsZero() {
        assertEquals("0", Fraction.ZERO.toProperString());
    }

    @Test
    public void testToProperString_numeratorEqualsDenominator_returnsOne() {
        Fraction f = Fraction.getFraction(5, 5);
        assertEquals("1", f.toProperString());
    }

    @Test
    public void testToProperString_numeratorEqualsNegativeDenominator_returnsNegativeOne() {
        Fraction f = Fraction.getFraction(-5, 5);
        assertEquals("-1", f.toProperString());
    }

    @Test
    public void testToProperString_improperFraction_correctFormat() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals("1 3/4", f.toProperString());
    }

    @Test
    public void testToProperString_improperFractionWithZeroProperNumerator_returnsWholeNumber() {
        Fraction f = Fraction.getFraction(8, 4);
        assertEquals("2", f.toProperString());
    }

    @Test
    public void testToProperString_properFraction_correctFormat() {
        Fraction f = Fraction.getFraction(3, 7);
        assertEquals("3/7", f.toProperString());
    }

    @Test
    public void testToProperString_negativeImproperFraction_correctFormat() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals("-1 3/4", f.toProperString());
    }

    @Test
    public void testToProperString_calledTwice_cachedValueConsistent() {
        String s1 = f1.toProperString();
        String s2 = f1.toProperString();
        assertSame(s1, s2);
    }

    @Test
    public void testToProperString_minValueNumerator_handledCorrectly() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        String result = f.toProperString();
        assertNotNull(result);
    }
}
