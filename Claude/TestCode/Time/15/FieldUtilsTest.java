import org.junit.Test;
import static org.junit.Assert.*;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.ISOChronology;

public class FieldUtilsTest {

    //------------------------------------------------------------------
    // safeNegate
    //------------------------------------------------------------------
    @Test
    public void testSafeNegate_normalValue_returnsNegated() {
        assertEquals(-5, FieldUtils.safeNegate(5));
        assertEquals(5, FieldUtils.safeNegate(-5));
    }

    @Test
    public void testSafeNegate_zero_returnsZero() {
        assertEquals(0, FieldUtils.safeNegate(0));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeNegate_minValue_throwsArithmeticException() {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    //------------------------------------------------------------------
    // safeAdd(int,int)
    //------------------------------------------------------------------
    @Test
    public void testSafeAddInt_normalValues_returnsSum() {
        assertEquals(7, FieldUtils.safeAdd(3, 4));
        assertEquals(-7, FieldUtils.safeAdd(-3, -4));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddInt_overflowPositive_throwsArithmeticException() {
        FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddInt_overflowNegative_throwsArithmeticException() {
        FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
    }

    //------------------------------------------------------------------
    // safeAdd(long,long)
    //------------------------------------------------------------------
    @Test
    public void testSafeAddLong_normalValues_returnsSum() {
        assertEquals(7L, FieldUtils.safeAdd(3L, 4L));
        assertEquals(-7L, FieldUtils.safeAdd(-3L, -4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddLong_overflowPositive_throwsArithmeticException() {
        FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAddLong_overflowNegative_throwsArithmeticException() {
        FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
    }

    //------------------------------------------------------------------
    // safeSubtract(long,long)
    //------------------------------------------------------------------
    @Test
    public void testSafeSubtract_normalValues_returnsDifference() {
        assertEquals(1L, FieldUtils.safeSubtract(5L, 4L));
        assertEquals(-1L, FieldUtils.safeSubtract(4L, 5L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeSubtract_overflow_throwsArithmeticException() {
        FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
    }

    //------------------------------------------------------------------
    // safeMultiply(int,int)
    //------------------------------------------------------------------
    @Test
    public void testSafeMultiplyIntInt_normalValues_returnsProduct() {
        assertEquals(12, FieldUtils.safeMultiply(3, 4));
        assertEquals(0, FieldUtils.safeMultiply(0, 100));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyIntInt_overflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Integer.MAX_VALUE, 2);
    }

    //------------------------------------------------------------------
    // safeMultiply(long,int)
    //------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongInt_valueMinusOne_returnsNegated() {
        assertEquals(-5L, FieldUtils.safeMultiply(5L, -1));
    }

    @Test
    public void testSafeMultiplyLongInt_valueZero_returnsZero() {
        assertEquals(0L, FieldUtils.safeMultiply(5L, 0));
    }

    @Test
    public void testSafeMultiplyLongInt_valueOne_returnsSameValue() {
        assertEquals(5L, FieldUtils.safeMultiply(5L, 1));
    }

    @Test
    public void testSafeMultiplyLongInt_normalValues_returnsProduct() {
        assertEquals(20L, FieldUtils.safeMultiply(5L, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongInt_overflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2);
    }

    //------------------------------------------------------------------
    // safeMultiply(long,long)
    //------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongLong_val2One_returnsVal1() {
        assertEquals(5L, FieldUtils.safeMultiply(5L, 1L));
    }

    @Test
    public void testSafeMultiplyLongLong_val1One_returnsVal2() {
        assertEquals(7L, FieldUtils.safeMultiply(1L, 7L));
    }

    @Test
    public void testSafeMultiplyLongLong_val1Zero_returnsZero() {
        assertEquals(0L, FieldUtils.safeMultiply(0L, 7L));
    }

    @Test
    public void testSafeMultiplyLongLong_val2Zero_returnsZero() {
        assertEquals(0L, FieldUtils.safeMultiply(7L, 0L));
    }

    @Test
    public void testSafeMultiplyLongLong_normalValues_returnsProduct() {
        assertEquals(35L, FieldUtils.safeMultiply(5L, 7L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_overflow_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_minValueTimesNegativeOne_throwsArithmeticException() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyLongLong_negativeOneTimesMinValue_throwsArithmeticException() {
        FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
    }

    //------------------------------------------------------------------
    // safeToInt
    //------------------------------------------------------------------
    @Test
    public void testSafeToInt_normalValue_returnsInt() {
        assertEquals(100, FieldUtils.safeToInt(100L));
    }

    @Test
    public void testSafeToInt_boundaryValues_returnsInt() {
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt((long) Integer.MIN_VALUE));
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt((long) Integer.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_overflow_throwsArithmeticException() {
        FieldUtils.safeToInt((long) Integer.MAX_VALUE + 1L);
    }

    //------------------------------------------------------------------
    // safeMultiplyToInt
    //------------------------------------------------------------------
    @Test
    public void testSafeMultiplyToInt_normalValues_returnsProduct() {
        assertEquals(20, FieldUtils.safeMultiplyToInt(5L, 4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_overflow_throwsArithmeticException() {
        FieldUtils.safeMultiplyToInt(Long.MAX_VALUE, 2L);
    }

    //------------------------------------------------------------------
    // verifyValueBounds(DateTimeField, ...)
    //------------------------------------------------------------------
    @Test
    public void testVerifyValueBoundsDateTimeField_withinBounds_noException() {
        DateTimeField field = ISOChronology.getInstance().year();
        FieldUtils.verifyValueBounds(field, 5, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBoundsDateTimeField_belowLowerBound_throwsException() {
        DateTimeField field = ISOChronology.getInstance().year();
        FieldUtils.verifyValueBounds(field, -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBoundsDateTimeField_aboveUpperBound_throwsException() {
        DateTimeField field = ISOChronology.getInstance().year();
        FieldUtils.verifyValueBounds(field, 11, 0, 10);
    }

    //------------------------------------------------------------------
    // verifyValueBounds(DateTimeFieldType, ...)
    //------------------------------------------------------------------
    @Test
    public void testVerifyValueBoundsDateTimeFieldType_withinBounds_noException() {
        DateTimeFieldType type = DateTimeFieldType.year();
        FieldUtils.verifyValueBounds(type, 5, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBoundsDateTimeFieldType_belowLowerBound_throwsException() {
        DateTimeFieldType type = DateTimeFieldType.year();
        FieldUtils.verifyValueBounds(type, -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBoundsDateTimeFieldType_aboveUpperBound_throwsException() {
        DateTimeFieldType type = DateTimeFieldType.year();
        FieldUtils.verifyValueBounds(type, 11, 0, 10);
    }

    //------------------------------------------------------------------
    // verifyValueBounds(String, ...)
    //------------------------------------------------------------------
    @Test
    public void testVerifyValueBoundsString_withinBounds_noException() {
        FieldUtils.verifyValueBounds("myField", 5, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBoundsString_belowLowerBound_throwsException() {
        FieldUtils.verifyValueBounds("myField", -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBoundsString_aboveUpperBound_throwsException() {
        FieldUtils.verifyValueBounds("myField", 11, 0, 10);
    }

    //------------------------------------------------------------------
    // getWrappedValue(currentValue, wrapValue, minValue, maxValue)
    //------------------------------------------------------------------
    @Test
    public void testGetWrappedValueFourArgs_normalValues_returnsWrapped() {
        // currentValue=5, wrapValue=10 -> combined=15, min=0,max=9 -> wrapRange=10 -> 15%10=5
        assertEquals(5, FieldUtils.getWrappedValue(5, 10, 0, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValueFourArgs_minGreaterEqualMax_throwsException() {
        FieldUtils.getWrappedValue(5, 10, 5, 5);
    }

    //------------------------------------------------------------------
    // getWrappedValue(value, minValue, maxValue)
    //------------------------------------------------------------------
    @Test
    public void testGetWrappedValueThreeArgs_positiveValue_returnsWrapped() {
        // min=0,max=9 -> wrapRange=10, value=15 -> 15%10=5
        assertEquals(5, FieldUtils.getWrappedValue(15, 0, 9));
    }

    @Test
    public void testGetWrappedValueThreeArgs_negativeValueRemainderNonZero_returnsWrapped() {
        // min=0,max=9 -> wrapRange=10, value=-5 -> value-min=-5 <0, remByRange=5%10=5
        // wrapRange-remByRange=10-5=5 -> +min=5
        assertEquals(5, FieldUtils.getWrappedValue(-5, 0, 9));
    }

    @Test
    public void testGetWrappedValueThreeArgs_negativeValueRemainderZero_returnsMinValue() {
        // min=0,max=9 -> wrapRange=10, value=-10 -> value-min=-10 <0, remByRange=10%10=0
        // return 0+min=0
        assertEquals(0, FieldUtils.getWrappedValue(-10, 0, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValueThreeArgs_minGreaterEqualMax_throwsException() {
        FieldUtils.getWrappedValue(5, 10, 5);
    }

    //------------------------------------------------------------------
    // equals(Object, Object)
    //------------------------------------------------------------------
    @Test
    public void testEquals_sameObjectReference_returnsTrue() {
        Object obj = new Object();
        assertTrue(FieldUtils.equals(obj, obj));
    }

    @Test
    public void testEquals_bothNull_returnsTrue() {
        assertTrue(FieldUtils.equals(null, null));
    }

    @Test
    public void testEquals_firstNullSecondNotNull_returnsFalse() {
        assertFalse(FieldUtils.equals(null, "test"));
    }

    @Test
    public void testEquals_firstNotNullSecondNull_returnsFalse() {
        assertFalse(FieldUtils.equals("test", null));
    }

    @Test
    public void testEquals_equalObjects_returnsTrue() {
        assertTrue(FieldUtils.equals("test", "test"));
    }

    @Test
    public void testEquals_differentObjects_returnsFalse() {
        assertFalse(FieldUtils.equals("test1", "test2"));
    }
}
