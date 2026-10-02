import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.fraction.FractionConversionException;

public class FractionTest {

    private Fraction half;
    private Fraction third;
    private Fraction negHalf;

    @Before
    public void setUp() {
        half = new Fraction(1, 2);
        third = new Fraction(1, 3);
        negHalf = new Fraction(-1, 2);
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructorIntInt_normal_reducesFraction() {
        Fraction f = new Fraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt_negativeDenominator_movesSignToNumerator() {
        Fraction f = new Fraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt_negativeNumerator_staysNegative() {
        Fraction f = new Fraction(-1, 2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_zeroDenominator_throwsException() {
        new Fraction(5, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_minValueNumeratorNegativeDenom_throwsOverflow() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_minValueDenominator_throwsOverflow() {
        new Fraction(5, Integer.MIN_VALUE);
    }

    @Test
    public void testConstructorInt_normal_denominatorOne() {
        Fraction f = new Fraction(5);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorDouble_normal_convertsCorrectly() throws Exception {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorDouble_integerValue_returnsWholeNumber() throws Exception {
        Fraction f = new Fraction(3.0);
        assertEquals(3, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleEpsilonMaxIterations_normal_convergesCorrectly() throws Exception {
        Fraction f = new Fraction(0.3333333333333333, 1.0e-5, 100);
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleEpsilonMaxIterations_lowIterations_throwsException() throws Exception {
        new Fraction(Math.PI, 1.0e-20, 2);
    }

    @Test
    public void testConstructorDoubleMaxDenominator_normal_limitsDenominator() throws Exception {
        Fraction f = new Fraction(0.6152, 100);
        assertTrue(f.getDenominator() <= 100);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDouble_overflowValue_throwsException() throws Exception {
        new Fraction(1.0e20);
    }

    // ---------- abs ----------

    @Test
    public void testAbs_positiveNumerator_returnsSame() {
        Fraction f = new Fraction(3, 4);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negativeNumerator_returnsPositive() {
        Fraction f = negHalf.abs();
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    // ---------- compareTo ----------

    @Test
    public void testCompareTo_lessThan_returnsNegative() {
        assertEquals(-1, third.compareTo(half));
    }

    @Test
    public void testCompareTo_greaterThan_returnsPositive() {
        assertEquals(1, half.compareTo(third));
    }

    @Test
    public void testCompareTo_equal_returnsZero() {
        Fraction anotherHalf = new Fraction(2, 4);
        assertEquals(0, half.compareTo(anotherHalf));
    }

    // ---------- doubleValue ----------

    @Test
    public void testDoubleValue_normal_returnsCorrectValue() {
        assertEquals(0.5, half.doubleValue(), 1e-10);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(half.equals(half));
    }

    @Test
    public void testEquals_equalFraction_returnsTrue() {
        Fraction f = new Fraction(1, 2);
        assertTrue(half.equals(f));
    }

    @Test
    public void testEquals_differentFraction_returnsFalse() {
        assertFalse(half.equals(third));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(half.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(half.equals("not a fraction"));
    }

    // ---------- floatValue ----------

    @Test
    public void testFloatValue_normal_returnsCorrectValue() {
        assertEquals(0.5f, half.floatValue(), 1e-6f);
    }

    // ---------- getDenominator / getNumerator ----------

    @Test
    public void testGetDenominator_normal_returnsDenominator() {
        assertEquals(2, half.getDenominator());
    }

    @Test
    public void testGetNumerator_normal_returnsNumerator() {
        assertEquals(1, half.getNumerator());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalFractions_sameHashCode() {
        Fraction f = new Fraction(1, 2);
        assertEquals(half.hashCode(), f.hashCode());
    }

    // ---------- intValue ----------

    @Test
    public void testIntValue_normal_returnsWholePart() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3, f.intValue());
    }

    // ---------- longValue ----------

    @Test
    public void testLongValue_normal_returnsWholePart() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    // ---------- negate ----------

    @Test
    public void testNegate_positiveNumerator_returnsNegative() {
        Fraction f = half.negate();
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_minValueNumerator_throwsOverflow() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    // ---------- reciprocal ----------

    @Test
    public void testReciprocal_normal_swapsNumeratorAndDenominator() {
        Fraction f = half.reciprocal();
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    // ---------- add(Fraction) ----------

    @Test
    public void testAddFraction_normal_returnsCorrectSum() {
        Fraction result = half.add(third);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAddFraction_zeroThis_returnsOther() {
        Fraction result = Fraction.ZERO.add(third);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testAddFraction_zeroOther_returnsThis() {
        Fraction result = half.add(Fraction.ZERO);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddFraction_null_throwsException() {
        half.add((Fraction) null);
    }

    @Test
    public void testAddFraction_largeDenominators_usesBigIntegerPath() {
        Fraction f1 = new Fraction(1, 6);
        Fraction f2 = new Fraction(1, 10);
        Fraction result = f1.add(f2);
        assertEquals(4, result.getNumerator());
        assertEquals(15, result.getDenominator());
    }

    // ---------- add(int) ----------

    @Test
    public void testAddInt_normal_returnsCorrectSum() {
        Fraction result = half.add(1);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    // ---------- subtract(Fraction) ----------

    @Test
    public void testSubtractFraction_normal_returnsCorrectDifference() {
        Fraction result = half.subtract(third);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtractFraction_zeroThis_returnsNegatedOther() {
        Fraction result = Fraction.ZERO.subtract(third);
        assertEquals(-1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testSubtractFraction_zeroOther_returnsThis() {
        Fraction result = half.subtract(Fraction.ZERO);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractFraction_null_throwsException() {
        half.subtract((Fraction) null);
    }

    @Test
    public void testSubtractFraction_largeDenominators_usesBigIntegerPath() {
        Fraction f1 = new Fraction(1, 6);
        Fraction f2 = new Fraction(1, 10);
        Fraction result = f1.subtract(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(15, result.getDenominator());
    }

    // ---------- subtract(int) ----------

    @Test
    public void testSubtractInt_normal_returnsCorrectDifference() {
        Fraction result = half.subtract(1);
        assertEquals(-1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    // ---------- multiply(Fraction) ----------

    @Test
    public void testMultiplyFraction_normal_returnsCorrectProduct() {
        Fraction result = half.multiply(third);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testMultiplyFraction_zeroThis_returnsZero() {
        Fraction result = Fraction.ZERO.multiply(third);
        assertEquals(Fraction.ZERO, result);
    }

    @Test
    public void testMultiplyFraction_zeroOther_returnsZero() {
        Fraction result = half.multiply(Fraction.ZERO);
        assertEquals(Fraction.ZERO, result);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyFraction_null_throwsException() {
        half.multiply((Fraction) null);
    }

    // ---------- multiply(int) ----------

    @Test
    public void testMultiplyInt_normal_returnsCorrectProduct() {
        Fraction result = half.multiply(4);
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    // ---------- divide(Fraction) ----------

    @Test
    public void testDivideFraction_normal_returnsCorrectQuotient() {
        Fraction result = half.divide(third);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideFraction_null_throwsException() {
        half.divide((Fraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideFraction_divideByZeroFraction_throwsException() {
        half.divide(Fraction.ZERO);
    }

    // ---------- divide(int) ----------

    @Test
    public void testDivideInt_normal_returnsCorrectQuotient() {
        Fraction result = half.divide(2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    // ---------- percentageValue ----------

    @Test
    public void testPercentageValue_normal_returnsCorrectPercentage() {
        assertEquals(50.0, half.percentageValue(), 1e-10);
    }

    // ---------- getReducedFraction ----------

    @Test
    public void testGetReducedFraction_normal_returnsReducedFraction() {
        Fraction f = Fraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_zeroNumerator_returnsZero() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertEquals(Fraction.ZERO, f);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_zeroDenominator_throwsException() {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFraction_negativeDenominator_movesSignToNumerator() {
        Fraction f = Fraction.getReducedFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_minValueDenominator_throwsOverflow() {
        Fraction.getReducedFraction(3, Integer.MIN_VALUE);
    }

    @Test
    public void testGetReducedFraction_minValueDenominatorEvenNumerator_handlesSpecialCase() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertTrue(f.getDenominator() > 0);
    }

    // ---------- toString ----------

    @Test
    public void testToString_denominatorOne_returnsNumeratorOnly() {
        Fraction f = new Fraction(5, 1);
        assertEquals("5", f.toString());
    }

    @Test
    public void testToString_zeroNumerator_returnsZeroString() {
        Fraction f = new Fraction(0, 5);
        assertEquals("0", f.toString());
    }

    @Test
    public void testToString_normalFraction_returnsFormattedString() {
        assertEquals("1 / 2", half.toString());
    }

    // ---------- getField ----------

    @Test
    public void testGetField_normal_returnsFractionField() {
        assertNotNull(half.getField());
        assertSame(FractionField.getInstance(), half.getField());
    }

    // ---------- Static constants sanity checks ----------

    @Test
    public void testStaticConstants_valuesAreCorrect() {
        assertEquals(2, Fraction.TWO.getNumerator());
        assertEquals(1, Fraction.TWO.getDenominator());
        assertEquals(1, Fraction.ONE.getNumerator());
        assertEquals(0, Fraction.ZERO.getNumerator());
        assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
        assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
    }
}
