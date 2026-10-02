import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigFractionTest {

    private static final double DELTA = 1e-9;

    // ---------- Constructors ----------

    @Test
    public void testConstructor_BigInteger_normal() {
        BigFraction f = new BigFraction(BigInteger.valueOf(5));
        assertEquals(BigInteger.valueOf(5), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_BigIntegerNumDen_normal() {
        BigFraction f = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(8));
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructor_BigIntegerNumDen_zeroNumerator() {
        BigFraction f = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_BigIntegerNumDen_negativeDenominator() {
        BigFraction f = new BigFraction(BigInteger.valueOf(3), BigInteger.valueOf(-4));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test(expected = ZeroException.class)
    public void testConstructor_BigIntegerNumDen_zeroDenominator_throws() {
        new BigFraction(BigInteger.valueOf(1), BigInteger.ZERO);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_BigIntegerNumDen_nullNumerator_throws() {
        new BigFraction((BigInteger) null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_BigIntegerNumDen_nullDenominator_throws() {
        new BigFraction(BigInteger.ONE, (BigInteger) null);
    }

    @Test
    public void testConstructor_double_normal() {
        BigFraction f = new BigFraction(0.5);
        assertEquals(0.5, f.doubleValue(), DELTA);
    }

    @Test
    public void testConstructor_double_negative() {
        BigFraction f = new BigFraction(-0.5);
        assertEquals(-0.5, f.doubleValue(), DELTA);
    }

    @Test
    public void testConstructor_double_zero() {
        BigFraction f = new BigFraction(0.0);
        assertEquals(0.0, f.doubleValue(), DELTA);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_double_NaN_throws() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructor_double_infinite_throws() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testConstructor_doubleEpsilonMaxIterations_normal() throws Exception {
        BigFraction f = new BigFraction(1.0 / 3.0, 1e-10, 100);
        assertEquals(1.0 / 3.0, f.doubleValue(), 1e-9);
    }

    @Test
    public void testConstructor_doubleMaxDenominator_normal() throws Exception {
        BigFraction f = new BigFraction(1.0 / 3.0, 100);
        assertEquals(1.0 / 3.0, f.doubleValue(), 1e-3);
    }

    @Test
    public void testConstructor_int_normal() {
        BigFraction f = new BigFraction(7);
        assertEquals(BigInteger.valueOf(7), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructor_intInt_normal() {
        BigFraction f = new BigFraction(2, 4);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testConstructor_long_normal() {
        BigFraction f = new BigFraction(123456789L);
        assertEquals(BigInteger.valueOf(123456789L), f.getNumerator());
    }

    @Test
    public void testConstructor_longLong_normal() {
        BigFraction f = new BigFraction(6L, 9L);
        assertEquals(2, f.getNumeratorAsInt());
        assertEquals(3, f.getDenominatorAsInt());
    }

    // ---------- Static factory ----------

    @Test
    public void testGetReducedFraction_normal() {
        BigFraction f = BigFraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumeratorAsInt());
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testGetReducedFraction_zeroNumerator_returnsZero() {
        BigFraction f = BigFraction.getReducedFraction(0, 5);
        assertEquals(BigFraction.ZERO, f);
    }

    // ---------- abs ----------

    @Test
    public void testAbs_positive_returnsSame() {
        BigFraction f = new BigFraction(3, 4);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negative_returnsPositive() {
        BigFraction f = new BigFraction(-3, 4);
        BigFraction result = f.abs();
        assertEquals(BigInteger.valueOf(3), result.getNumerator());
    }

    // ---------- add ----------

    @Test
    public void testAdd_BigInteger_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(BigInteger.valueOf(1));
        assertEquals(new BigFraction(3, 2), result);
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_BigInteger_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.add((BigInteger) null);
    }

    @Test
    public void testAdd_int_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(2);
        assertEquals(new BigFraction(5, 2), result);
    }

    @Test
    public void testAdd_long_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.add(2L);
        assertEquals(new BigFraction(5, 2), result);
    }

    @Test
    public void testAdd_BigFraction_sameDenominator() {
        BigFraction f1 = new BigFraction(1, 4);
        BigFraction f2 = new BigFraction(2, 4);
        BigFraction result = f1.add(f2);
        assertEquals(new BigFraction(3, 4), result);
    }

    @Test
    public void testAdd_BigFraction_differentDenominator() {
        BigFraction f1 = new BigFraction(1, 3);
        BigFraction f2 = new BigFraction(1, 2);
        BigFraction result = f1.add(f2);
        assertEquals(new BigFraction(5, 6), result);
    }

    @Test
    public void testAdd_BigFraction_zero_returnsSame() {
        BigFraction f1 = new BigFraction(1, 3);
        BigFraction result = f1.add(BigFraction.ZERO);
        assertSame(f1, result);
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_BigFraction_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.add((BigFraction) null);
    }

    // ---------- bigDecimalValue ----------

    @Test
    public void testBigDecimalValue_normal() {
        BigFraction f = new BigFraction(1, 4);
        BigDecimal bd = f.bigDecimalValue();
        assertEquals(new BigDecimal("0.25"), bd);
    }

    @Test
    public void testBigDecimalValue_roundingMode() {
        BigFraction f = new BigFraction(1, 3);
        BigDecimal bd = f.bigDecimalValue(BigDecimal.ROUND_DOWN);
        assertEquals(BigInteger.ZERO, bd.toBigInteger());
    }

    @Test
    public void testBigDecimalValue_scaleRoundingMode() {
        BigFraction f = new BigFraction(1, 3);
        BigDecimal bd = f.bigDecimalValue(2, BigDecimal.ROUND_HALF_UP);
        assertEquals(new BigDecimal("0.33"), bd);
    }

    // ---------- compareTo ----------

    @Test
    public void testCompareTo_less() {
        BigFraction f1 = new BigFraction(1, 3);
        BigFraction f2 = new BigFraction(1, 2);
        assertTrue(f1.compareTo(f2) < 0);
    }

    @Test
    public void testCompareTo_greater() {
        BigFraction f1 = new BigFraction(2, 3);
        BigFraction f2 = new BigFraction(1, 2);
        assertTrue(f1.compareTo(f2) > 0);
    }

    @Test
    public void testCompareTo_equal() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertEquals(0, f1.compareTo(f2));
    }

    // ---------- divide ----------

    @Test
    public void testDivide_BigInteger_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.divide(BigInteger.valueOf(2));
        assertEquals(new BigFraction(1, 4), result);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_BigInteger_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.divide((BigInteger) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_BigInteger_zero_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.divide(BigInteger.ZERO);
    }

    @Test
    public void testDivide_int_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.divide(2);
        assertEquals(new BigFraction(1, 4), result);
    }

    @Test
    public void testDivide_long_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.divide(2L);
        assertEquals(new BigFraction(1, 4), result);
    }

    @Test
    public void testDivide_BigFraction_normal() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 4);
        BigFraction result = f1.divide(f2);
        assertEquals(new BigFraction(2, 1), result);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_BigFraction_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.divide((BigFraction) null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivide_BigFraction_zeroNumerator_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.divide(BigFraction.ZERO);
    }

    // ---------- doubleValue ----------

    @Test
    public void testDoubleValue_normal() {
        BigFraction f = new BigFraction(1, 4);
        assertEquals(0.25, f.doubleValue(), DELTA);
    }

    @Test
    public void testDoubleValue_veryLargeNumbers() {
        BigInteger big = BigInteger.TEN.pow(400);
        BigFraction f = new BigFraction(big, BigInteger.TEN.pow(399));
        double val = f.doubleValue();
        assertEquals(10.0, val, DELTA);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_true() {
        BigFraction f = new BigFraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEquals_equalValue_true() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 4);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquals_differentValue_false() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquals_null_false() {
        BigFraction f1 = new BigFraction(1, 2);
        assertFalse(f1.equals(null));
    }

    @Test
    public void testEquals_differentType_false() {
        BigFraction f1 = new BigFraction(1, 2);
        assertFalse(f1.equals("1/2"));
    }

    // ---------- floatValue ----------

    @Test
    public void testFloatValue_normal() {
        BigFraction f = new BigFraction(1, 4);
        assertEquals(0.25f, f.floatValue(), 1e-6f);
    }

    @Test
    public void testFloatValue_veryLargeNumbers() {
        BigInteger big = BigInteger.TEN.pow(400);
        BigFraction f = new BigFraction(big, BigInteger.TEN.pow(399));
        float val = f.floatValue();
        assertEquals(10.0f, val, 1e-3f);
    }

    // ---------- getters ----------

    @Test
    public void testGetDenominator_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testGetDenominatorAsInt_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(2, f.getDenominatorAsInt());
    }

    @Test
    public void testGetDenominatorAsLong_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(2L, f.getDenominatorAsLong());
    }

    @Test
    public void testGetNumerator_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
    }

    @Test
    public void testGetNumeratorAsInt_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(1, f.getNumeratorAsInt());
    }

    @Test
    public void testGetNumeratorAsLong_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(1L, f.getNumeratorAsLong());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalFractions_sameHashCode() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 2);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    // ---------- intValue / longValue ----------

    @Test
    public void testIntValue_normal() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testLongValue_normal() {
        BigFraction f = new BigFraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    // ---------- multiply ----------

    @Test
    public void testMultiply_BigInteger_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(BigInteger.valueOf(2));
        assertEquals(BigFraction.ONE, result);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_BigInteger_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.multiply((BigInteger) null);
    }

    @Test
    public void testMultiply_int_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(2);
        assertEquals(BigFraction.ONE, result);
    }

    @Test
    public void testMultiply_long_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.multiply(2L);
        assertEquals(BigFraction.ONE, result);
    }

    @Test
    public void testMultiply_BigFraction_normal() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(2, 3);
        BigFraction result = f1.multiply(f2);
        assertEquals(new BigFraction(1, 3), result);
    }

    @Test
    public void testMultiply_BigFraction_zeroNumerator_returnsZero() {
        BigFraction f1 = BigFraction.ZERO;
        BigFraction f2 = new BigFraction(2, 3);
        BigFraction result = f1.multiply(f2);
        assertEquals(BigFraction.ZERO, result);
    }

    @Test
    public void testMultiply_BigFraction_otherZeroNumerator_returnsZero() {
        BigFraction f1 = new BigFraction(2, 3);
        BigFraction f2 = BigFraction.ZERO;
        BigFraction result = f1.multiply(f2);
        assertEquals(BigFraction.ZERO, result);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_BigFraction_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.multiply((BigFraction) null);
    }

    // ---------- negate ----------

    @Test
    public void testNegate_normal() {
        BigFraction f = new BigFraction(1, 2);
        BigFraction result = f.negate();
        assertEquals(new BigFraction(-1, 2), result);
    }

    // ---------- percentageValue ----------

    @Test
    public void testPercentageValue_normal() {
        BigFraction f = new BigFraction(1, 2);
        assertEquals(50.0, f.percentageValue(), DELTA);
    }

    // ---------- pow(int) ----------

    @Test
    public void testPowInt_positive() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(2);
        assertEquals(new BigFraction(4, 9), result);
    }

    @Test
    public void testPowInt_negative() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(-2);
        assertEquals(new BigFraction(9, 4), result);
    }

    @Test
    public void testPowInt_zero() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(0);
        assertEquals(BigFraction.ONE, result);
    }

    // ---------- pow(long) ----------

    @Test
    public void testPowLong_positive() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(2L);
        assertEquals(new BigFraction(4, 9), result);
    }

    @Test
    public void testPowLong_negative() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(-2L);
        assertEquals(new BigFraction(9, 4), result);
    }

    // ---------- pow(BigInteger) ----------

    @Test
    public void testPowBigInteger_positive() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(BigInteger.valueOf(2));
        assertEquals(new BigFraction(4, 9), result);
    }

    @Test
    public void testPowBigInteger_negative() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.pow(BigInteger.valueOf(-2));
        assertEquals(new BigFraction(9, 4), result);
    }

    // ---------- pow(double) ----------

    @Test
    public void testPowDouble_normal() {
        BigFraction f = new BigFraction(4, 9);
        double result = f.pow(0.5);
        assertEquals(2.0 / 3.0, result, DELTA);
    }

    // ---------- reciprocal ----------

    @Test
    public void testReciprocal_normal() {
        BigFraction f = new BigFraction(2, 3);
        BigFraction result = f.reciprocal();
        assertEquals(new BigFraction(3, 2), result);
    }

    // ---------- reduce ----------

    @Test
    public void testReduce_normal() {
        BigFraction f = new BigFraction(BigInteger.valueOf(4), BigInteger.valueOf(2));
        // constructor already reduces, so build manually with a fraction that
        // has a gcd > 1 scenario using reduce() directly
        BigFraction result = f.reduce();
        assertEquals(BigInteger.valueOf(2), result.getNumerator());
        assertEquals(BigInteger.valueOf(1), result.getDenominator());
    }

    // ---------- subtract ----------

    @Test
    public void testSubtract_BigInteger_normal() {
        BigFraction f = new BigFraction(3, 2);
        BigFraction result = f.subtract(BigInteger.valueOf(1));
        assertEquals(new BigFraction(1, 2), result);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_BigInteger_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.subtract((BigInteger) null);
    }

    @Test
    public void testSubtract_int_normal() {
        BigFraction f = new BigFraction(3, 2);
        BigFraction result = f.subtract(1);
        assertEquals(new BigFraction(1, 2), result);
    }

    @Test
    public void testSubtract_long_normal() {
        BigFraction f = new BigFraction(3, 2);
        BigFraction result = f.subtract(1L);
        assertEquals(new BigFraction(1, 2), result);
    }

    @Test
    public void testSubtract_BigFraction_sameDenominator() {
        BigFraction f1 = new BigFraction(3, 4);
        BigFraction f2 = new BigFraction(1, 4);
        BigFraction result = f1.subtract(f2);
        assertEquals(new BigFraction(1, 2), result);
    }

    @Test
    public void testSubtract_BigFraction_differentDenominator() {
        BigFraction f1 = new BigFraction(1, 2);
        BigFraction f2 = new BigFraction(1, 3);
        BigFraction result = f1.subtract(f2);
        assertEquals(new BigFraction(1, 6), result);
    }

    @Test
    public void testSubtract_BigFraction_zero_returnsSame() {
        BigFraction f1 = new BigFraction(1, 3);
        BigFraction result = f1.subtract(BigFraction.ZERO);
        assertSame(f1, result);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_BigFraction_null_throws() {
        BigFraction f = new BigFraction(1, 2);
        f.subtract((BigFraction) null);
    }

    // ---------- toString ----------

    @Test
    public void testToString_denominatorOne() {
        BigFraction f = new BigFraction(5, 1);
        assertEquals("5", f.toString());
    }

    @Test
    public void testToString_zeroNumerator() {
        BigFraction f = BigFraction.ZERO;
        assertEquals("0", f.toString());
    }

    @Test
    public void testToString_normalFraction() {
        BigFraction f = new BigFraction(3, 4);
        assertEquals("3 / 4", f.toString());
    }

    // ---------- getField ----------

    @Test
    public void testGetField_returnsBigFractionField() {
        BigFraction f = new BigFraction(1, 2);
        assertNotNull(f.getField());
    }

    // ---------- Static constant fractions sanity checks ----------

    @Test
    public void testConstants_values() {
        assertEquals(2, BigFraction.TWO.getNumeratorAsInt());
        assertEquals(1, BigFraction.ONE.getNumeratorAsInt());
        assertEquals(0, BigFraction.ZERO.getNumeratorAsInt());
        assertEquals(-1, BigFraction.MINUS_ONE.getNumeratorAsInt());
        assertEquals(4, BigFraction.FOUR_FIFTHS.getNumeratorAsInt());
        assertEquals(5, BigFraction.FOUR_FIFTHS.getDenominatorAsInt());
        assertEquals(1, BigFraction.ONE_FIFTH.getNumeratorAsInt());
        assertEquals(1, BigFraction.ONE_HALF.getNumeratorAsInt());
        assertEquals(1, BigFraction.ONE_QUARTER.getNumeratorAsInt());
        assertEquals(1, BigFraction.ONE_THIRD.getNumeratorAsInt());
        assertEquals(3, BigFraction.THREE_FIFTHS.getNumeratorAsInt());
        assertEquals(3, BigFraction.THREE_QUARTERS.getNumeratorAsInt());
        assertEquals(2, BigFraction.TWO_FIFTHS.getNumeratorAsInt());
        assertEquals(1, BigFraction.TWO_QUARTERS.getNumeratorAsInt());
        assertEquals(2, BigFraction.TWO_THIRDS.getNumeratorAsInt());
    }
}
