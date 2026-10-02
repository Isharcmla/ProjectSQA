package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.ZeroException;

public class BigFractionTest {

    // ---------- Constructors ----------

    @Test
    public void testConstructor_BigInteger_normal_returnsFraction() {
        BigFraction f = new BigFraction(BigInteger.valueOf(5));
        assertEquals(BigInteger.valueOf(5), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_BigIntegerBigInteger_normal_reducesFraction() {
        BigFraction f = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(8));
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructor_BigIntegerBigInteger_zeroNumerator_returnsZeroFraction() {
        BigFraction f = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_BigIntegerBigInteger_negativeDenominator_movesSignToNumerator() {
        BigFraction f = new BigFraction(BigInteger.valueOf(3), BigInteger.valueOf(-4));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testConstructor_BigIntegerBigInteger_zeroDenominator_throwsZeroException() {
        new BigFraction(BigInteger.valueOf(1), BigInteger.ZERO);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_BigIntegerBigInteger_nullNumerator_throwsNullArgumentException() {
        new BigFraction(null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_BigIntegerBigInteger_nullDenominator_throwsNullArgumentException() {
        new BigFraction(BigInteger.ONE, null);
    }

    @Test
    public void testConstructor_double_normalValue_returnsFraction() {
        BigFraction f = new BigFraction(0.5);
        assertEquals(0.5, f.doubleValue(), 1e-10);
    }

    @Test
    public void testConstructor_double_zeroValue_returnsZero() {
        BigFraction f = new BigFraction(0.0);
        assertEquals(0.0, f.doubleValue(), 1e-10);
    }

    @Test
    public void testConstructor_double_negativeValue_returnsFraction() {
        BigFraction f = new BigFraction(-0.5);
        assertEquals(-0.5, f.doubleValue(), 1e-10);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_double_NaN_throwsMathIllegalArgumentException() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_double_PositiveInfinity_throwsMathIllegalArgumentException() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_double_NegativeInfinity_throwsMathIllegalArgumentException() {
        new BigFraction(Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testConstructor_doubleEpsilonMaxIterations_normalValue_convergesToFraction()
            throws FractionConversionException {
        BigFraction f = new BigFraction(1.0 / 3.0, 1.0e-10, 100);
        assertEquals(1.0 / 3.0, f.doubleValue(), 1e-9);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructor_doubleEpsilonMaxIterations_notConverging_throwsFractionConversionException()
            throws FractionConversionException {
        new BigFraction(Math.PI, 1.0e-20, 2);
    }

    @Test
    public void testConstructor_doubleMaxDenominator_normalValue_returnsFraction()
            throws FractionConversionException {
        BigFraction f = new BigFraction(Math.PI, 1000);
        assertNotNull(f);
    }

    @Test
    public void testConstructor_int_normal_returnsFraction() {
        BigFraction f = new BigFraction(7);
        assertEquals(BigInteger.valueOf(7), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_intInt_normal_reducesFraction() {
        BigFraction f = new BigFraction(2, 4);
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructor_long_normal_returnsFraction() {
        BigFraction f = new BigFraction(9L);
        assertEquals(BigInteger.valueOf(9), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_longLong_normal_reducesFraction() {
        BigFraction f = new BigFraction(6L, 9L);
        assertEquals(BigInteger.valueOf(2), f.getNumerator());
        assertEquals(BigInteger.valueOf(3), f.getDenominator());
    }

    // ---------- Static methods ----------

    @Test
    public void testGetReducedFraction_zeroNumerator_returnsZero() {
        BigFraction f = BigFraction.getReducedFraction(0, 5);
        assertEquals(BigFraction.ZERO, f);
    }

    @Test
    public void testGetReducedFraction_normal_returnsReducedFraction() {
        BigFraction f = BigFraction.getReducedFraction(4, 8);
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    // ---------- abs ----------

    @Test
    public void testAbs_positiveNumerator_returnsSame() {
        BigFraction f = new BigFraction(3, 4);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negativeNumerator_returnsPositive() {
        BigFraction f = new BigFraction(-3, 4);
        BigFraction result = f.abs();
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
    }

    // ---------- add ----------

    @Test
    public void testAdd_BigInteger_normal_returnsSum() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(BigInteger.valueOf(1));
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_BigInteger_null_throwsNullArgumentException() {
        BigFraction f = new BigFraction(1, 2);
        f.add((BigInteger) null);
    }

    @Test
    public void testAdd_int_normal_returnsSum() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(1);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
    }

    @Test
    public void testAdd_long_normal_returnsSum() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(1L);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_BigFraction_null_throwsNullArgumentException() {
        BigFraction f = new BigFraction(1, 2);
        f.add((BigFraction) null);
    }

    @Test
    public void testAdd_BigFraction_zero_returnsSame() {
        BigFraction f = new BigFraction(1, 2);
        assertSame(f, f.add(BigFraction.ZERO));
    }

    @Test
    public void testAdd_BigFraction_sameDenominator_returnsSum() {
        BigFraction f1 = new BigFraction(1, 4);
        BigFraction f2 = new BigFraction(2, 4);
        BigFraction result = f1.add(f2);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());
    }

    @Test
    public void testAdd_BigFraction_differentDenominator_returnsSum() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        BigFraction result = f1.add(f2);
        assertEquals(BigInteger.valueOf(5), result.getNumerator());
        assertEquals(BigInteger.valueOf(6), result.getDenominator());
    }

    // ---------- bigDecimalValue ----------

    @Test
    public void testBigDecimalValue_noArg_terminatingDecimal_returnsValue() {
        BigFraction f = new BigFraction(1, 4);
        BigDecimal bd = f.bigDecimalValue();
        assertEquals(new BigDecimal("0.25"), bd);
    }

    @Test(expected = ArithmeticException.class)
    public void testBigDecimalValue_noArg_nonTerminatingDecimal_throwsArithmeticException() {
        BigFraction f = new BigFraction(1, 3);
        f.bigDecimalValue();
    }

    @Test
    public void testBigDecimalValue_roundingMode_returnsValue() {
        BigFraction f = new BigFraction(1, 3);
        BigDecimal bd = f.bigDecimalValue(BigDecimal.ROUND_HALF_UP);
        assertNotNull(bd);
    }

    @Test
    public void testBigDecimalValue_scaleAndRoundingMode_returnsValue() {
        BigFraction f = new BigFraction(1, 3);
        BigDecimal bd = f.bigDecimalValue(2, BigDecimal.ROUND_HALF_UP);
        assertEquals(new BigDecimal("0.33"), bd);
    }

    // ---------- compareTo ----------

    @Test
    public void testCompareTo_lessThan_returnsNegative() {
        BigFraction f1 = new BigFraction(1, 4);
        BigFraction f2 = new BigFraction(1, 2);
        assertTrue(f1.compareTo(f2) < 0);
    }

    @Test
    public void testCompareTo_greaterThan_returnsPositive() {
        BigFraction f1 = new BigFraction(3, 4);
        BigFraction f2 = new BigFraction(1, 2);
        assertTrue(f1.compareTo(f2) > 0);
    }

    @Test
    public void testCompareTo_equal_returnsZero() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertEquals(0, f1.compareTo(f2));
    }

    // ---------- divide ----------

    @Test
    public void testDivide_BigInteger_normal_returnsResult() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.divide(BigInteger.valueOf(2));
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testDivide_BigInteger_zero_throwsZeroException() {
        BigFraction f = new BigFraction(1, 2);
        f.divide(BigInteger.ZERO);
    }

    @Test
    public void testDivide_int_normal_returnsResult() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.divide(2);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());
    }

    @Test
    public void testDivide_long_normal_returnsResult() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.divide(2L);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(4), result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_BigFraction_null_throwsNullArgumentException() {
        BigFraction f = new BigFraction(1, 2);
        f.divide((BigFraction) null);
    }

    @Test(expected = ZeroException.class)
    public void testDivide_BigFraction_zeroNumerator_throwsZeroException() {
        BigFraction f = new BigFraction(1, 2);
        f.divide(BigFraction.ZERO);
    }

    @Test
    public void testDivide_BigFraction_normal_returnsResult() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        BigFraction result = f1.divide(f2);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    // ---------- doubleValue ----------

    @Test
    public void testDoubleValue_normal_returnsValue() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(0.5, f.doubleValue(), 1e-10);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        BigFraction f = new BigFraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        BigFraction f = new BigFraction(1, 2);
        assertFalse(f.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        BigFraction f = new BigFraction(1, 2);
        assertFalse(f.equals("not a fraction"));
    }

    @Test
    public void testEquals_equivalentDifferentForm_returnsTrue() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquals_notEqual_returnsFalse() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        assertFalse(f1.equals(f2));
    }

    // ---------- floatValue ----------

    @Test
    public void testFloatValue_normal_returnsValue() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(0.5f, f.floatValue(), 1e-6f);
    }

    // ---------- getters ----------

    @Test
    public void testGetDenominator_normal_returnsDenominator() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testGetDenominatorAsInt_normal_returnsInt() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testGetDenominatorAsLong_normal_returnsLong() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(2L, f.getDenominatorAsLong());
    }

    @Test
    public void testGetNumerator_normal_returnsNumerator() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
    }

    @Test
    public void testGetNumeratorAsInt_normal_returnsInt() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(1, f.getNumeratorAsInt());
    }

    @Test
    public void testGetNumeratorAsLong_normal_returnsLong() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(1L, f.getNumeratorAsLong());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_consistentForEqualObjects_returnsSameHash() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 2);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    // ---------- intValue / longValue ----------

    @Test
    public void testIntValue_normal_returnsWholeNumber() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testLongValue_normal_returnsWholeNumber() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    // ---------- multiply ----------

    @Test
    public void testMultiply_BigInteger_normal_returnsProduct() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(BigInteger.valueOf(3));
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_BigInteger_null_throwsNullArgumentException() {
        BigFraction f = new BigFraction(1, 2);
        f.multiply((BigInteger) null);
    }

    @Test
    public void testMultiply_int_normal_returnsProduct() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(3);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
    }

    @Test
    public void testMultiply_long_normal_returnsProduct() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(3L);
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_BigFraction_null_throwsNullArgumentException() {
        BigFraction f = new BigFraction(1, 2);
        f.multiply((BigFraction) null);
    }

    @Test
    public void testMultiply_BigFraction_zeroNumerator_returnsZero() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(BigFraction.ZERO);
        assertEquals(BigFraction.ZERO, result);
    }

    @Test
    public void testMultiply_BigFraction_normal_returnsProduct() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 3);
        BigFraction result = f1.multiply(f2);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(3), result.getDenominator());
    }

    // ---------- negate ----------

    @Test
    public void testNegate_positiveFraction_returnsNegative() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.negate();
        assertEquals(BigInteger.valueOf(-1), result.getNumerator());
    }

    // ---------- percentageValue ----------

    @Test
    public void testPercentageValue_normal_returnsPercentage() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(50.0, f.percentageValue(), 1e-10);
    }

    // ---------- pow ----------

    @Test
    public void testPow_intPositive_returnsPower() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.pow(3);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(8), result.getDenominator());
    }

    @Test
    public void testPow_intNegative_returnsInversePower() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.pow(-2);
        assertEquals(BigInteger.valueOf(4), result.getNumerator());
        assertEquals(BigInteger.valueOf(1), result.getDenominator());
    }

    @Test
    public void testPow_intZero_returnsOne() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.pow(0);
        assertEquals(BigInteger.ONE, result.getNumerator());
        assertEquals(BigInteger.ONE, result.getDenominator());
    }

    @Test
    public void testPow_longPositive_returnsPower() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.pow(3L);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(8), result.getDenominator());
    }

    @Test
    public void testPow_longNegative_returnsInversePower() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.pow(-2L);
        assertEquals(BigInteger.valueOf(4), result.getNumerator());
        assertEquals(BigInteger.valueOf(1), result.getDenominator());
    }

    @Test
    public void testPow_BigIntegerPositive_returnsPower() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.pow(BigInteger.valueOf(3));
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(8), result.getDenominator());
    }

    @Test
    public void testPow_BigIntegerNegative_returnsInversePower() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.pow(BigInteger.valueOf(-2));
        assertEquals(BigInteger.valueOf(4), result.getNumerator());
        assertEquals(BigInteger.valueOf(1), result.getDenominator());
    }

    @Test
    public void testPow_double_returnsPower() {
        BigFraction f = new BigFraction(1, 2);
        double result = f.pow(2.0);
        assertEquals(0.25, result, 1e-10);
    }

    // ---------- reciprocal ----------

    @Test
    public void testReciprocal_normal_returnsInverse() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.reciprocal();
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    // ---------- reduce ----------

    @Test
    public void testReduce_alreadyReduced_returnsSameValue() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.reduce();
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    // ---------- subtract ----------

    @Test
    public void testSubtract_BigInteger_normal_returnsResult() {
        BigFraction f = new BigFraction(3, 2);
        BigFraction result = f.subtract(BigInteger.valueOf(1));
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_BigInteger_null_throwsNullArgumentException() {
        BigFraction f = new BigFraction(1, 2);
        f.subtract((BigInteger) null);
    }

    @Test
    public void testSubtract_int_normal_returnsResult() {
        BigFraction f = new BigFraction(3, 2);
        BigFraction result = f.subtract(1);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
    }

    @Test
    public void testSubtract_long_normal_returnsResult() {
        BigFraction f = new BigFraction(3, 2);
        BigFraction result = f.subtract(1L);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_BigFraction_null_throwsNullArgumentException() {
        BigFraction f = new BigFraction(1, 2);
        f.subtract((BigFraction) null);
    }

    @Test
    public void testSubtract_BigFraction_zero_returnsSame() {
        BigFraction f = new BigFraction(1, 2);
        assertSame(f, f.subtract(BigFraction.ZERO));
    }

    @Test
    public void testSubtract_BigFraction_sameDenominator_returnsResult() {
        BigFraction f1 = new BigFraction(3, 4);
        BigFraction f2 = new BigFraction(1, 4);
        BigFraction result = f1.subtract(f2);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(2), result.getDenominator());
    }

    @Test
    public void testSubtract_BigFraction_differentDenominator_returnsResult() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        BigFraction result = f1.subtract(f2);
        assertEquals(BigInteger.valueOf(1), result.getNumerator());
        assertEquals(BigInteger.valueOf(6), result.getDenominator());
    }

    // ---------- toString ----------

    @Test
    public void testToString_denominatorOne_returnsNumeratorOnly() {
        BigFraction f = new BigFraction(5, 1);
        assertEquals("5", f.toString());
    }

    @Test
    public void testToString_zeroNumerator_returnsZero() {
        BigFraction f = new BigFraction(0, 5);
        assertEquals("0", f.toString());
    }

    @Test
    public void testToString_normalFraction_returnsNumDenFormat() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals("1 / 2", f.toString());
    }

    // ---------- getField ----------

    @Test
    public void testGetField_normal_returnsBigFractionField() {
        BigFraction f = new BigFraction(1, 2);
        assertNotNull(f.getField());
        assertSame(BigFractionField.getInstance(), f.getField());
    }

    // ---------- Constants sanity checks ----------

    @Test
    public void testConstants_haveExpectedValues() {
        assertEquals(BigInteger.valueOf(2), BigFraction.TWO.getNumerator());
        assertEquals(BigInteger.valueOf(1), BigFraction.ONE.getNumerator());
        assertEquals(BigInteger.valueOf(0), BigFraction.ZERO.getNumerator());
        assertEquals(BigInteger.valueOf(-1), BigFraction.MINUS_ONE.getNumerator());
        assertEquals(BigInteger.valueOf(4), BigFraction.FOUR_FIFTHS.getNumerator());
        assertEquals(BigInteger.valueOf(5), BigFraction.FOUR_FIFTHS.getDenominator());
        assertEquals(BigInteger.valueOf(1), BigFraction.ONE_FIFTH.getNumerator());
        assertEquals(BigInteger.valueOf(1), BigFraction.ONE_HALF.getNumerator());
        assertEquals(BigInteger.valueOf(1), BigFraction.ONE_QUARTER.getNumerator());
        assertEquals(BigInteger.valueOf(1), BigFraction.ONE_THIRD.getNumerator());
        assertEquals(BigInteger.valueOf(3), BigFraction.THREE_FIFTHS.getNumerator());
        assertEquals(BigInteger.valueOf(3), BigFraction.THREE_QUARTERS.getNumerator());
        assertEquals(BigInteger.valueOf(2), BigFraction.TWO_FIFTHS.getNumerator());
        assertEquals(BigInteger.valueOf(1), BigFraction.TWO_QUARTERS.getNumerator());
        assertEquals(BigInteger.valueOf(2), BigFraction.TWO_THIRDS.getNumerator());
    }
}
