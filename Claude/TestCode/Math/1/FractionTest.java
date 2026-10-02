import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;

public class FractionTest {

    private Fraction oneHalf;
    private Fraction twoThirds;

    @Before
    public void setUp() {
        oneHalf = new Fraction(1, 2);
        twoThirds = new Fraction(2, 3);
    }

    // ---------- Constructors ----------

    @Test
    public void testConstructorIntInt_normal_reduced() {
        Fraction f = new Fraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt_negativeDenominator_signMovedToNumerator() {
        Fraction f = new Fraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_zeroDenominator_throwsException() {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_overflowMinValueNumerator_throwsException() {
        new Fraction(Integer.MIN_VALUE, -1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntInt_overflowMinValueDenominator_throwsException() {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testConstructorInt_normal_denominatorOne() {
        Fraction f = new Fraction(5);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorDouble_normal_convertsCorrectly() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorDouble_integerValue_returnsIntegerFraction() throws FractionConversionException {
        Fraction f = new Fraction(3.0);
        assertEquals(3, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleEpsilonMaxIter_normal_convertsCorrectly() throws FractionConversionException {
        Fraction f = new Fraction(1.0 / 3.0, 1e-6, 1000);
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleEpsilonMaxIter_notConverging_throwsException() throws FractionConversionException {
        new Fraction(Math.PI, 1e-20, 2);
    }

    @Test
    public void testConstructorDoubleMaxDenominator_normal_convertsCorrectly() throws FractionConversionException {
        Fraction f = new Fraction(Math.PI, 1000);
        assertTrue(f.getDenominator() <= 1000);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDouble_overflowValue_throwsException() throws FractionConversionException {
        new Fraction(Double.MAX_VALUE);
    }

    // ---------- abs ----------

    @Test
    public void testAbs_positiveNumerator_returnsSame() {
        Fraction f = new Fraction(1, 2);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negativeNumerator_returnsPositive() {
        Fraction f = new Fraction(-1, 2);
        Fraction abs = f.abs();
        assertEquals(1, abs.getNumerator());
        assertEquals(2, abs.getDenominator());
    }

    // ---------- compareTo ----------

    @Test
    public void testCompareTo_equalFractions_returnsZero() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test
    public void testCompareTo_lessThan_returnsNegative() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test
    public void testCompareTo_greaterThan_returnsPositive() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(1, f1.compareTo(f2));
    }

    // ---------- doubleValue / floatValue / intValue / longValue ----------

    @Test
    public void testDoubleValue_normal_returnsCorrectValue() {
        assertEquals(0.5, oneHalf.doubleValue(), 1e-10);
    }

    @Test
    public void testFloatValue_normal_returnsCorrectValue() {
        assertEquals(0.5f, oneHalf.floatValue(), 1e-6f);
    }

    @Test
    public void testIntValue_normal_returnsWholeNumberPart() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testLongValue_normal_returnsWholeNumberPart() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(oneHalf.equals(oneHalf));
    }

    @Test
    public void testEquals_equalValues_returnsTrue() {
        Fraction f2 = new Fraction(1, 2);
        assertTrue(oneHalf.equals(f2));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        assertFalse(oneHalf.equals(twoThirds));
    }

    @Test
    public void testEquals_notFractionInstance_returnsFalse() {
        assertFalse(oneHalf.equals("1/2"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(oneHalf.equals(null));
    }

    @Test
    public void testHashCode_equalFractions_sameHashCode() {
        Fraction f2 = new Fraction(1, 2);
        assertEquals(oneHalf.hashCode(), f2.hashCode());
    }

    // ---------- getters ----------

    @Test
    public void testGetNumerator_normal_returnsCorrectValue() {
        assertEquals(1, oneHalf.getNumerator());
    }

    @Test
    public void testGetDenominator_normal_returnsCorrectValue() {
        assertEquals(2, oneHalf.getDenominator());
    }

    // ---------- negate ----------

    @Test
    public void testNegate_normal_returnsNegatedFraction() {
        Fraction f = oneHalf.negate();
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegate_minValueNumerator_throwsException() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    // ---------- reciprocal ----------

    @Test
    public void testReciprocal_normal_returnsInverted() {
        Fraction f = oneHalf.reciprocal();
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    // ---------- add ----------

    @Test
    public void testAddFraction_normal_returnsSum() {
        Fraction result = oneHalf.add(twoThirds);
        assertEquals(7, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAddFraction_thisZero_returnsOtherFraction() {
        Fraction zero = new Fraction(0, 1);
        Fraction result = zero.add(twoThirds);
        assertEquals(2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testAddFraction_otherZero_returnsThis() {
        Fraction zero = new Fraction(0, 1);
        Fraction result = oneHalf.add(zero);
        assertSame(oneHalf, result);
    }

    @Test
    public void testAddFraction_gcdNotOne_usesBigIntegerPath() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(1, 6);
        Fraction result = f1.add(f2);
        assertEquals(5, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddFraction_null_throwsException() {
        oneHalf.add((Fraction) null);
    }

    @Test
    public void testAddInt_normal_returnsSum() {
        Fraction result = oneHalf.add(1);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    // ---------- subtract ----------

    @Test
    public void testSubtractFraction_normal_returnsDifference() {
        Fraction result = twoThirds.subtract(oneHalf);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtractFraction_thisZero_returnsNegatedOther() {
        Fraction zero = new Fraction(0, 1);
        Fraction result = zero.subtract(twoThirds);
        assertEquals(-2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testSubtractFraction_otherZero_returnsThis() {
        Fraction zero = new Fraction(0, 1);
        Fraction result = oneHalf.subtract(zero);
        assertSame(oneHalf, result);
    }

    @Test
    public void testSubtractFraction_gcdNotOne_usesBigIntegerPath() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(1, 6);
        Fraction result = f1.subtract(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractFraction_null_throwsException() {
        oneHalf.subtract((Fraction) null);
    }

    @Test
    public void testSubtractInt_normal_returnsDifference() {
        Fraction result = oneHalf.subtract(1);
        assertEquals(-1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    // ---------- multiply ----------

    @Test
    public void testMultiplyFraction_normal_returnsProduct() {
        Fraction result = oneHalf.multiply(twoThirds);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testMultiplyFraction_thisZero_returnsZero() {
        Fraction zero = new Fraction(0, 1);
        Fraction result = zero.multiply(twoThirds);
        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    public void testMultiplyFraction_otherZero_returnsZero() {
        Fraction zero = new Fraction(0, 1);
        Fraction result = oneHalf.multiply(zero);
        assertEquals(0, result.getNumerator());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyFraction_null_throwsException() {
        oneHalf.multiply((Fraction) null);
    }

    @Test
    public void testMultiplyInt_normal_returnsProduct() {
        Fraction result = oneHalf.multiply(4);
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    // ---------- divide ----------

    @Test
    public void testDivideFraction_normal_returnsQuotient() {
        Fraction result = oneHalf.divide(twoThirds);
        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideFraction_zeroDivisor_throwsException() {
        Fraction zero = new Fraction(0, 1);
        oneHalf.divide(zero);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideFraction_null_throwsException() {
        oneHalf.divide((Fraction) null);
    }

    @Test
    public void testDivideInt_normal_returnsQuotient() {
        Fraction result = oneHalf.divide(2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    // ---------- percentageValue ----------

    @Test
    public void testPercentageValue_normal_returnsCorrectValue() {
        assertEquals(50.0, oneHalf.percentageValue(), 1e-10);
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
        assertSame(Fraction.ZERO, f);
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
    public void testGetReducedFraction_overflowMinValueDenominator_throwsException() {
        Fraction.getReducedFraction(3, Integer.MIN_VALUE);
    }

    @Test
    public void testGetReducedFraction_minValueDenominatorEvenNumerator_handlesCorrectly() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
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
        assertEquals("1 / 2", oneHalf.toString());
    }

    // ---------- getField ----------

    @Test
    public void testGetField_normal_returnsFractionFieldInstance() {
        FractionField field = oneHalf.getField();
        assertNotNull(field);
        assertSame(FractionField.getInstance(), field);
    }

    // ---------- static constants sanity ----------

    @Test
    public void testStaticConstants_values_areCorrect() {
        assertEquals(2, Fraction.TWO.getNumerator());
        assertEquals(1, Fraction.ONE.getNumerator());
        assertEquals(0, Fraction.ZERO.getNumerator());
        assertEquals(-1, Fraction.MINUS_ONE.getNumerator());
        assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
    }
}
