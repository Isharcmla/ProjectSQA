import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    private static final double DELTA = 1e-9;

    // ---------- Constructors ----------

    @Test
    public void testConstructor_intNumDen_normalReduction() {
        Fraction f = new Fraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructor_intOnly_denominatorOne() {
        Fraction f = new Fraction(5);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructor_negativeDenominator_signMovedToNumerator() {
        Fraction f = new Fraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testConstructor_negativeNumeratorAndDenominator_bothPositive() {
        Fraction f = new Fraction(-3, -4);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_zeroDenominator_throwsException() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_overflowMinValueNum_throwsException() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructor_overflowMinValueDen_throwsException() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testConstructor_double_normalValue() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructor_double_integerValue() throws FractionConversionException {
        Fraction f = new Fraction(3.0);
        assertEquals(3, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructor_doubleEpsilonMaxIterations_normal() throws FractionConversionException {
        Fraction f = new Fraction(1.0 / 3.0, 1.0e-10, 100);
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_doubleTooFewIterations_throwsException() throws FractionConversionException {
        new Fraction(Math.PI, 1.0e-20, 2);
    }

    @Test
    public void testConstructor_doubleMaxDenominator_normal() throws FractionConversionException {
        Fraction f = new Fraction(0.333333, 100);
        assertTrue(f.getDenominator() <= 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_doubleOverflow_throwsException() throws FractionConversionException {
        new Fraction((double) Integer.MAX_VALUE + 1.0, 1.0e-5, 100);
    }

    // ---------- abs ----------

    @Test
    public void testAbs_positiveNumerator_returnsSame() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.abs());
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
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test
    public void testCompareTo_greaterThan_returnsPositive() {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test
    public void testCompareTo_equal_returnsZero() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertEquals(0, f1.compareTo(f2));
    }

    // ---------- doubleValue ----------

    @Test
    public void testDoubleValue_normal() {
        Fraction f = new Fraction(1, 4);
        assertEquals(0.25, f.doubleValue(), DELTA);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_true() {
        Fraction f = new Fraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_equalFractions_true() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquals_differentFractions_false() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_null_false() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals(null));
    }

    @Test
    public void testEquals_notFractionInstance_false() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals("1/2"));
    }

    // ---------- floatValue ----------

    @Test
    public void testFloatValue_normal() {
        Fraction f = new Fraction(1, 4);
        assertEquals(0.25f, f.floatValue(), 1e-6f);
    }

    // ---------- getDenominator / getNumerator ----------

    @Test
    public void testGetDenominator_normal() {
        Fraction f = new Fraction(3, 7);
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetNumerator_normal() {
        Fraction f = new Fraction(3, 7);
        assertEquals(3, f.getNumerator());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalFractions_sameHashCode() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    // ---------- intValue ----------

    @Test
    public void testIntValue_normal() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3, f.intValue());
    }

    // ---------- longValue ----------

    @Test
    public void testLongValue_normal() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    // ---------- negate ----------

    @Test
    public void testNegate_normal() {
        Fraction f = new Fraction(3, 4);
        Fraction result = f.negate();
        assertEquals(-3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_minValueNumerator_throwsException() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    // ---------- reciprocal ----------

    @Test
    public void testReciprocal_normal() {
        Fraction f = new Fraction(3, 4);
        Fraction result = f.reciprocal();
        assertEquals(4, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_zeroNumerator_throwsException() {
        Fraction f = new Fraction(0, 1);
        f.reciprocal();
    }

    // ---------- add(Fraction) ----------

    @Test
    public void testAddFraction_normal() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.add(f2);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAddFraction_thisZero_returnsOther() {
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.add(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testAddFraction_otherZero_returnsThis() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(0, 1);
        Fraction result = f1.add(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testAddFraction_commonDenominatorGreaterThanOne() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(1, 6);
        Fraction result = f1.add(f2);
        assertEquals(5, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddFraction_null_throwsException() {
        Fraction f = new Fraction(1, 2);
        f.add((Fraction) null);
    }

    // ---------- add(int) ----------

    @Test
    public void testAddInt_normal() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.add(1);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    // ---------- subtract(Fraction) ----------

    @Test
    public void testSubtractFraction_normal() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.subtract(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtractFraction_thisZero_returnsNegatedOther() {
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.subtract(f2);
        assertEquals(-1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testSubtractFraction_otherZero_returnsThis() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(0, 1);
        Fraction result = f1.subtract(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractFraction_null_throwsException() {
        Fraction f = new Fraction(1, 2);
        f.subtract((Fraction) null);
    }

    // ---------- subtract(int) ----------

    @Test
    public void testSubtractInt_normal() {
        Fraction f = new Fraction(3, 2);
        Fraction result = f.subtract(1);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    // ---------- multiply(Fraction) ----------

    @Test
    public void testMultiplyFraction_normal() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        Fraction result = f1.multiply(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testMultiplyFraction_zeroNumerator_returnsZero() {
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(2, 3);
        Fraction result = f1.multiply(f2);
        assertEquals(Fraction.ZERO, result);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyFraction_null_throwsException() {
        Fraction f = new Fraction(1, 2);
        f.multiply((Fraction) null);
    }

    // ---------- multiply(int) ----------

    @Test
    public void testMultiplyInt_normal() {
        Fraction f = new Fraction(1, 3);
        Fraction result = f.multiply(2);
        assertEquals(2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    // ---------- divide(Fraction) ----------

    @Test
    public void testDivideFraction_normal() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction result = f1.divide(f2);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideFraction_null_throwsException() {
        Fraction f = new Fraction(1, 2);
        f.divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideFraction_zeroDivisor_throwsException() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(0, 1);
        f1.divide(f2);
    }

    // ---------- divide(int) ----------

    @Test
    public void testDivideInt_normal() {
        Fraction f = new Fraction(1, 2);
        Fraction result = f.divide(2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    // ---------- percentageValue ----------

    @Test
    public void testPercentageValue_normal() {
        Fraction f = new Fraction(1, 2);
        assertEquals(50.0, f.percentageValue(), DELTA);
    }

    // ---------- getReducedFraction ----------

    @Test
    public void testGetReducedFraction_normal() {
        Fraction f = Fraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_zeroNumerator_returnsZeroConstant() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertSame(Fraction.ZERO, f);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator_throwsException() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_negativeDenominator_normalizesSign() {
        Fraction f = Fraction.getReducedFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_minValueDenominatorEvenNumerator_handled() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertTrue(f.getDenominator() > 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_minValueDenominatorOddNumerator_throwsException() {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    // ---------- toString ----------

    @Test
    public void testToString_denominatorOne_returnsIntegerString() {
        Fraction f = new Fraction(5, 1);
        assertEquals("5", f.toString());
    }

    @Test
    public void testToString_numeratorZero_returnsZeroString() {
        Fraction f = new Fraction(0, 5);
        assertEquals("0", f.toString());
    }

    @Test
    public void testToString_normalFraction_returnsFormattedString() {
        Fraction f = new Fraction(3, 4);
        assertEquals("3 / 4", f.toString());
    }

    // ---------- getField ----------

    @Test
    public void testGetField_returnsFractionFieldInstance() {
        Fraction f = new Fraction(1, 2);
        assertNotNull(f.getField());
        assertSame(FractionField.getInstance(), f.getField());
    }

    // ---------- Constants sanity check ----------

    @Test
    public void testConstants_values_areCorrect() {
        assertEquals(2, Fraction.TWO.getNumerator());
        assertEquals(1, Fraction.TWO.getDenominator());
        assertEquals(1, Fraction.ONE.getNumerator());
        assertEquals(0, Fraction.ZERO.getNumerator());
        assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
        assertEquals(1, Fraction.ONE_FIFTH.getNumerator());
        assertEquals(1, Fraction.ONE_HALF.getNumerator());
        assertEquals(1, Fraction.ONE_QUARTER.getNumerator());
        assertEquals(1, Fraction.ONE_THIRD.getNumerator());
        assertEquals(3, Fraction.THREE_FIFTHS.getNumerator());
        assertEquals(3, Fraction.THREE_QUARTERS.getNumerator());
        assertEquals(2, Fraction.TWO_FIFTHS.getNumerator());
        assertEquals(1, Fraction.TWO_QUARTERS.getNumerator());
        assertEquals(2, Fraction.TWO_THIRDS.getNumerator());
        assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
    }
}
