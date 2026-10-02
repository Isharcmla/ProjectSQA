package org.joda.time.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.junit.Assert;
import org.junit.Test;

public class FieldUtilsTest {

    @Test
    public void testConstructor_privateAccessibleViaReflection() throws Exception {
        Constructor<FieldUtils> constructor = FieldUtils.class.getDeclaredConstructor();
        Assert.assertFalse(constructor.isAccessible());
        constructor.setAccessible(true);
        FieldUtils instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    //-----------------------------------------------------------------------
    // safeNegate
    //-----------------------------------------------------------------------
    @Test
    public void testSafeNegate_positiveValue_returnsNegative() {
        Assert.assertEquals(-5, FieldUtils.safeNegate(5));
        Assert.assertEquals(-Integer.MAX_VALUE, FieldUtils.safeNegate(Integer.MAX_VALUE));
    }

    @Test
    public void testSafeNegate_negativeValue_returnsPositive() {
        Assert.assertEquals(5, FieldUtils.safeNegate(-5));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeNegate(-Integer.MAX_VALUE));
    }

    @Test
    public void testSafeNegate_zero_returnsZero() {
        Assert.assertEquals(0, FieldUtils.safeNegate(0));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeNegate_minValue_throwsArithmeticException() {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    //-----------------------------------------------------------------------
    // safeAdd(int, int)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeAddInt_normalValues_returnsSum() {
        Assert.assertEquals(5, FieldUtils.safeAdd(2, 3));
        Assert.assertEquals(-1, FieldUtils.safeAdd(2, -3));
        Assert.assertEquals(-5, FieldUtils.safeAdd(-2, -3));
        Assert.assertEquals(0, FieldUtils.safeAdd(0, 0));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeAdd(Integer.MAX_VALUE - 1, 1));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeAdd(Integer.MIN_VALUE + 1, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddInt_positiveOverflow_throwsArithmeticException() {
        FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddInt_negativeOverflow_throwsArithmeticException() {
        FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
    }

    //-----------------------------------------------------------------------
    // safeAdd(long, long)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeAddLong_normalValues_returnsSum() {
        Assert.assertEquals(5L, FieldUtils.safeAdd(2L, 3L));
        Assert.assertEquals(-1L, FieldUtils.safeAdd(2L, -3L));
        Assert.assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L));
        Assert.assertEquals(0L, FieldUtils.safeAdd(0L, 0L));
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeAdd(Long.MAX_VALUE - 1L, 1L));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeAdd(Long.MIN_VALUE + 1L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddLong_positiveOverflow_throwsArithmeticException() {
        FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddLong_negativeOverflow_throwsArithmeticException() {
        FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
    }

    //-----------------------------------------------------------------------
    // safeSubtract(long, long)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeSubtractLong_normalValues_returnsDifference() {
        Assert.assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L));
        Assert.assertEquals(5L, FieldUtils.safeSubtract(2L, -3L));
        Assert.assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L));
        Assert.assertEquals(0L, FieldUtils.safeSubtract(0L, 0L));
        Assert.assertEquals(Long.MIN_VALUE, FieldUtils.safeSubtract(Long.MIN_VALUE + 1L, 1L));
        Assert.assertEquals(Long.MAX_VALUE, FieldUtils.safeSubtract(Long.MAX_VALUE - 1L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeSubtractLong_positiveOverflow_throwsArithmeticException() {
        FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeSubtractLong_negativeOverflow_throwsArithmeticException() {
        FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
    }

    //-----------------------------------------------------------------------
    // safeMultiply(int, int)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyInt_normalValues_returnsProduct() {
        Assert.assertEquals(6, FieldUtils.safeMultiply(2, 3));
        Assert.assertEquals(-6, FieldUtils.safeMultiply(2, -3));
        Assert.assertEquals(6, FieldUtils.safeMultiply(-2, -3));
        Assert.assertEquals(0, FieldUtils.safeMultiply(0, 100));
        Assert.assertEquals(0, FieldUtils.safeMultiply(100, 0));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiply(Integer.MAX_VALUE, 1));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiply(Integer.MIN_VALUE, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyInt_positiveOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyInt_negativeOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Integer.MIN_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyInt_overflowFromNegativeMultiplier_throwsArithmeticException() {
        FieldUtils.safeMultiply(Integer.MAX_VALUE, -2);
    }

    //-----------------------------------------------------------------------
    // safeMultiply(long, int)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongInt_cases_returnsProduct() {
        Assert.assertEquals(-10L, FieldUtils.safeMultiply(10L, -1));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(10L, 0));
        Assert.assertEquals(10L, FieldUtils.safeMultiply(10L, 1));
        Assert.assertEquals(50L, FieldUtils.safeMultiply(10L, 5));
        Assert.assertEquals(-50L, FieldUtils.safeMultiply(10L, -5));
        Assert.assertEquals(-50L, FieldUtils.safeMultiply(-10L, 5));
        Assert.assertEquals(50L, FieldUtils.safeMultiply(-10L, -5));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongInt_positiveOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongInt_negativeOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, 2);
    }

    //-----------------------------------------------------------------------
    // safeMultiply(long, long)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongLong_normalAndSpecialValues_returnsProduct() {
        Assert.assertEquals(100L, FieldUtils.safeMultiply(100L, 1L));
        Assert.assertEquals(100L, FieldUtils.safeMultiply(1L, 100L));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(0L, 100L));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(100L, 0L));
        Assert.assertEquals(0L, FieldUtils.safeMultiply(0L, 0L));
        Assert.assertEquals(6L, FieldUtils.safeMultiply(2L, 3L));
        Assert.assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L));
        Assert.assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L));
        Assert.assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_val1MinValueAndVal2MinusOne_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_val2MinValueAndVal1MinusOne_throwsArithmeticException() {
        FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_positiveOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_negativeOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, 2L);
    }

    //-----------------------------------------------------------------------
    // safeToInt(long)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeToInt_withinRange_returnsInt() {
        Assert.assertEquals(0, FieldUtils.safeToInt(0L));
        Assert.assertEquals(12345, FieldUtils.safeToInt(12345L));
        Assert.assertEquals(-12345, FieldUtils.safeToInt(-12345L));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt((long) Integer.MAX_VALUE));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt((long) Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_aboveMax_throwsArithmeticException() {
        FieldUtils.safeToInt((long) Integer.MAX_VALUE + 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_belowMin_throwsArithmeticException() {
        FieldUtils.safeToInt((long) Integer.MIN_VALUE - 1L);
    }

    //-----------------------------------------------------------------------
    // safeMultiplyToInt(long, long)
    //-----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyToInt_withinRange_returnsInt() {
        Assert.assertEquals(6, FieldUtils.safeMultiplyToInt(2L, 3L));
        Assert.assertEquals(-6, FieldUtils.safeMultiplyToInt(2L, -3L));
        Assert.assertEquals(0, FieldUtils.safeMultiplyToInt(0L, 5L));
        Assert.assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiplyToInt((long) Integer.MAX_VALUE, 1L));
        Assert.assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiplyToInt((long) Integer.MIN_VALUE, 1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_multiplicationOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiplyToInt(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_intCastOverflow_throwsArithmeticException() {
        FieldUtils.safeMultiplyToInt((long) Integer.MAX_VALUE, 2L);
    }

    //-----------------------------------------------------------------------
    // verifyValueBounds(DateTimeField, int, int, int)
    //-----------------------------------------------------------------------
    private static class StubDateTimeField extends BaseDateTimeField {
        protected StubDateTimeField() {
            super(DateTimeFieldType.year());
        }
        public int get(long instant) { return 0; }
        public long set(long instant, int value) { return 0; }
        public DurationField getDurationField() { return null; }
        public DurationField getRangeDurationField() { return null; }
        public int getMinimumValue() { return 0; }
        public int getMaximumValue() { return 100; }
        public long roundFloor(long instant) { return 0; }
    }

    @Test
    public void testVerifyValueBounds_dateTimeField_withinBounds_noException() {
        DateTimeField field = new StubDateTimeField();
        FieldUtils.verifyValueBounds(field, 5, 1, 10);
        FieldUtils.verifyValueBounds(field, 1, 1, 10);
        FieldUtils.verifyValueBounds(field, 10, 1, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_dateTimeField_belowBound_throwsException() {
        DateTimeField field = new StubDateTimeField();
        FieldUtils.verifyValueBounds(field, 0, 1, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_dateTimeField_aboveBound_throwsException() {
        DateTimeField field = new StubDateTimeField();
        FieldUtils.verifyValueBounds(field, 11, 1, 10);
    }

    //-----------------------------------------------------------------------
    // verifyValueBounds(DateTimeFieldType, int, int, int)
    //-----------------------------------------------------------------------
    @Test
    public void testVerifyValueBounds_dateTimeFieldType_withinBounds_noException() {
        DateTimeFieldType type = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(type, 15, 1, 31);
        FieldUtils.verifyValueBounds(type, 1, 1, 31);
        FieldUtils.verifyValueBounds(type, 31, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_dateTimeFieldType_belowBound_throwsException() {
        DateTimeFieldType type = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(type, 0, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_dateTimeFieldType_aboveBound_throwsException() {
        DateTimeFieldType type = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(type, 32, 1, 31);
    }

    //-----------------------------------------------------------------------
    // verifyValueBounds(String, int, int, int)
    //-----------------------------------------------------------------------
    @Test
    public void testVerifyValueBounds_string_withinBounds_noException() {
        FieldUtils.verifyValueBounds("testField", 5, 0, 10);
        FieldUtils.verifyValueBounds("testField", 0, 0, 10);
        FieldUtils.verifyValueBounds("testField", 10, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_string_belowBound_throwsException() {
        FieldUtils.verifyValueBounds("testField", -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_string_aboveBound_throwsException() {
        FieldUtils.verifyValueBounds("testField", 11, 0, 10);
    }

    //-----------------------------------------------------------------------
    // getWrappedValue(int currentValue, int wrapValue, int minValue, int maxValue)
    //-----------------------------------------------------------------------
    @Test
    public void testGetWrappedValue_withWrapValue_wrapsCorrectly() {
        Assert.assertEquals(5, FieldUtils.getWrappedValue(2, 3, 1, 10));
        Assert.assertEquals(2, FieldUtils.getWrappedValue(9, 3, 1, 10));
        Assert.assertEquals(9, FieldUtils.getWrappedValue(2, -3, 1, 10));
    }

    //-----------------------------------------------------------------------
    // getWrappedValue(int value, int minValue, int maxValue)
    //-----------------------------------------------------------------------
    @Test
    public void testGetWrappedValue_valueWithinRange_returnsValue() {
        Assert.assertEquals(1, FieldUtils.getWrappedValue(1, 1, 10));
        Assert.assertEquals(5, FieldUtils.getWrappedValue(5, 1, 10));
        Assert.assertEquals(10, FieldUtils.getWrappedValue(10, 1, 10));
    }

    @Test
    public void testGetWrappedValue_valueAboveRange_wrapsAround() {
        Assert.assertEquals(1, FieldUtils.getWrappedValue(11, 1, 10));
        Assert.assertEquals(5, FieldUtils.getWrappedValue(15, 1, 10));
        Assert.assertEquals(10, FieldUtils.getWrappedValue(20, 1, 10));
        Assert.assertEquals(1, FieldUtils.getWrappedValue(21, 1, 10));
    }

    @Test
    public void testGetWrappedValue_valueBelowRange_remByRangeZero() {
        // value - minValue is exact multiple of wrapRange (10)
        // e.g. minValue = 1, maxValue = 10, range = 10
        // value = -9 -> value - min = -10, -(-10) % 10 = 0 -> returns 0 + 1 = 1
        Assert.assertEquals(1, FieldUtils.getWrappedValue(-9, 1, 10));
        Assert.assertEquals(1, FieldUtils.getWrappedValue(-19, 1, 10));
    }

    @Test
    public void testGetWrappedValue_valueBelowRange_remByRangeNonZero() {
        // value = 0, min = 1, max = 10, range = 10 -> value - min = -1 -> rem = 1 -> 10 - 1 + 1 = 10
        Assert.assertEquals(10, FieldUtils.getWrappedValue(0, 1, 10));
        // value = -1, min = 1, max = 10 -> value - min = -2 -> rem = 2 -> 10 - 2 + 1 = 9
        Assert.assertEquals(9, FieldUtils.getWrappedValue(-1, 1, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValue_minEqualToMax_throwsIllegalArgumentException() {
        FieldUtils.getWrappedValue(5, 10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValue_minGreaterThanMax_throwsIllegalArgumentException() {
        FieldUtils.getWrappedValue(5, 11, 10);
    }

    //-----------------------------------------------------------------------
    // equals(Object, Object)
    //-----------------------------------------------------------------------
    @Test
    public void testEquals_sameObject_returnsTrue() {
        String str = "test";
        Assert.assertTrue(FieldUtils.equals(str, str));
    }

    @Test
    public void testEquals_bothNull_returnsTrue() {
        Assert.assertTrue(FieldUtils.equals(null, null));
    }

    @Test
    public void testEquals_firstNullSecondNonNull_returnsFalse() {
        Assert.assertFalse(FieldUtils.equals(null, "test"));
    }

    @Test
    public void testEquals_firstNonNullSecondNull_returnsFalse() {
        Assert.assertFalse(FieldUtils.equals("test", null));
    }

    @Test
    public void testEquals_equalObjects_returnsTrue() {
        Assert.assertTrue(FieldUtils.equals("test", new String("test")));
        Assert.assertTrue(FieldUtils.equals(Integer.valueOf(42), Integer.valueOf(42)));
    }

    @Test
    public void testEquals_differentObjects_returnsFalse() {
        Assert.assertFalse(FieldUtils.equals("test1", "test2"));
        Assert.assertFalse(FieldUtils.equals(Integer.valueOf(42), Integer.valueOf(43)));
    }
}
