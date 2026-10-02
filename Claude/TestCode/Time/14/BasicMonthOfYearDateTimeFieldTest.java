package org.joda.time.chrono;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for BasicMonthOfYearDateTimeField.
 * Since the class is package-private, we obtain an instance of it
 * through the public API of GregorianChronology (chrono.monthOfYear()),
 * whose runtime type is BasicMonthOfYearDateTimeField.
 */
public class BasicMonthOfYearDateTimeFieldTest {

    private GregorianChronology chrono;
    private DateTimeField field;

    @Before
    public void setUp() {
        chrono = GregorianChronology.getInstance(DateTimeZone.UTC);
        field = chrono.monthOfYear();
    }

    //-----------------------------------------------------------------------
    // isLenient
    //-----------------------------------------------------------------------
    @Test
    public void testIsLenient_alwaysFalse() {
        assertFalse(field.isLenient());
    }

    //-----------------------------------------------------------------------
    // get
    //-----------------------------------------------------------------------
    @Test
    public void testGet_normalInput_returnsCorrectMonth() {
        long instant = chrono.getDateTimeMillis(2004, 2, 29, 0);
        assertEquals(2, field.get(instant));
    }

    @Test
    public void testGet_januaryBoundary_returnsOne() {
        long instant = chrono.getDateTimeMillis(2004, 1, 1, 0);
        assertEquals(1, field.get(instant));
    }

    @Test
    public void testGet_decemberBoundary_returnsTwelve() {
        long instant = chrono.getDateTimeMillis(2004, 12, 31, 0);
        assertEquals(12, field.get(instant));
    }

    //-----------------------------------------------------------------------
    // add(long, int)
    //-----------------------------------------------------------------------
    @Test
    public void testAddInt_zeroMonths_returnsSameInstant() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        long result = field.add(instant, 0);
        assertEquals(instant, result);
    }

    @Test
    public void testAddInt_positiveMonths_dayOverflowCoercedToMaxDay() {
        // Jan 31 + 1 month -> Feb 29 (2004 is leap year)
        long instant = chrono.getDateTimeMillis(2004, 1, 31, 0);
        long result = field.add(instant, 1);
        assertEquals(2004, chrono.getYear(result));
        assertEquals(2, field.get(result));
        assertEquals(29, chrono.getDayOfMonth(result));
    }

    @Test
    public void testAddInt_negativeMonths_crossesYearBoundary() {
        long instant = chrono.getDateTimeMillis(2004, 1, 15, 0);
        long result = field.add(instant, -1);
        assertEquals(2003, chrono.getYear(result));
        assertEquals(12, field.get(result));
        assertEquals(15, chrono.getDayOfMonth(result));
    }

    @Test
    public void testAddInt_negativeMonths_boundaryRemainderZero() {
        // Triggers remMonthToUse == 0 branch and monthToUse == 1 branch
        long instant = chrono.getDateTimeMillis(2004, 1, 15, 0);
        long result = field.add(instant, -12);
        assertEquals(2003, chrono.getYear(result));
        assertEquals(1, field.get(result));
        assertEquals(15, chrono.getDayOfMonth(result));
    }

    @Test
    public void testAddInt_largePositiveMonths_wrapsMultipleYears() {
        long instant = chrono.getDateTimeMillis(2000, 1, 1, 0);
        long result = field.add(instant, 25); // 2 years + 1 month
        assertEquals(2002, chrono.getYear(result));
        assertEquals(2, field.get(result));
    }

    //-----------------------------------------------------------------------
    // add(long, long)
    //-----------------------------------------------------------------------
    @Test
    public void testAddLong_fitsInInt_delegatesToIntOverload() {
        long instant = chrono.getDateTimeMillis(2004, 1, 31, 0);
        long result = field.add(instant, 1L);
        assertEquals(2004, chrono.getYear(result));
        assertEquals(2, field.get(result));
        assertEquals(29, chrono.getDayOfMonth(result));
    }

    @Test
    public void testAddLong_zeroMonths_returnsSameInstant() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        long result = field.add(instant, 0L);
        assertEquals(instant, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddLong_beyondIntRange_throwsIllegalArgumentException() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        // A value that doesn't fit into an int, forcing the long-specific path,
        // which produces a year far outside the valid range.
        field.add(instant, 5000000000L);
    }

    @Test
    public void testAddLong_negativeBeyondIntRange_throwsIllegalArgumentException() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        try {
            field.add(instant, -5000000000L);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    // add(ReadablePartial, int, int[], int)
    //-----------------------------------------------------------------------
    @Test
    public void testAddPartial_zeroValueToAdd_returnsSameValuesArray() {
        YearMonthDay partial = new YearMonthDay(2004, 2, 29, chrono);
        int[] values = partial.getValues();
        int[] result = field.add(partial, 1, values, 0);
        assertSame(values, result);
    }

    @Test
    public void testAddPartial_contiguousPartial_addsMonthsCorrectly() {
        YearMonthDay partial = new YearMonthDay(2004, 2, 29, chrono);
        int[] values = partial.getValues();
        // fieldIndex 1 corresponds to monthOfYear in YearMonthDay (year, month, day)
        int[] result = field.add(partial, 1, values, 48); // add 4 years worth of months
        assertEquals(2008, result[0]);
        assertEquals(2, result[1]);
        assertEquals(29, result[2]);
    }

    @Test
    public void testAddPartial_contiguousPartial_dayOverflowCoerced() {
        YearMonthDay partial = new YearMonthDay(2004, 1, 31, chrono);
        int[] values = partial.getValues();
        int[] result = field.add(partial, 1, values, 1); // Jan 31 + 1 month -> Feb 29
        assertEquals(2004, result[0]);
        assertEquals(2, result[1]);
        assertEquals(29, result[2]);
    }

    //-----------------------------------------------------------------------
    // addWrapField
    //-----------------------------------------------------------------------
    @Test
    public void testAddWrapField_wrapsAroundMaxValue() {
        long instant = chrono.getDateTimeMillis(2004, 12, 15, 0);
        long result = field.addWrapField(instant, 2);
        // 12 + 2 wraps to 2 within [1..12]
        assertEquals(2, field.get(result));
    }

    @Test
    public void testAddWrapField_noWrapNeeded() {
        long instant = chrono.getDateTimeMillis(2004, 3, 15, 0);
        long result = field.addWrapField(instant, 2);
        assertEquals(5, field.get(result));
    }

    //-----------------------------------------------------------------------
    // getDifferenceAsLong
    //-----------------------------------------------------------------------
    @Test
    public void testGetDifferenceAsLong_minuendAfterSubtrahend_returnsPositive() {
        long minuend = chrono.getDateTimeMillis(2005, 3, 15, 0);
        long subtrahend = chrono.getDateTimeMillis(2004, 1, 15, 0);
        long diff = field.getDifferenceAsLong(minuend, subtrahend);
        assertEquals(14, diff);
    }

    @Test
    public void testGetDifferenceAsLong_minuendBeforeSubtrahend_returnsNegative() {
        long minuend = chrono.getDateTimeMillis(2004, 1, 15, 0);
        long subtrahend = chrono.getDateTimeMillis(2005, 3, 15, 0);
        long diff = field.getDifferenceAsLong(minuend, subtrahend);
        assertEquals(-14, diff);
    }

    @Test
    public void testGetDifferenceAsLong_lastDayOfMonthAdjustment() {
        // minuend is last day of Feb (leap year), subtrahend has a larger day-of-month
        long minuend = chrono.getDateTimeMillis(2004, 2, 29, 0);
        long subtrahend = chrono.getDateTimeMillis(2004, 1, 31, 0);
        long diff = field.getDifferenceAsLong(minuend, subtrahend);
        assertEquals(1, diff);
    }

    @Test
    public void testGetDifferenceAsLong_remainderCausesDecrement() {
        // minuend earlier in the day than subtrahend within their respective months
        long minuend = chrono.getDateTimeMillis(2004, 3, 15, 0); // start of day
        long subtrahend = chrono.getDateTimeMillis(2004, 1, 15, 12 * 60 * 60 * 1000); // noon
        long diff = field.getDifferenceAsLong(minuend, subtrahend);
        // minuendRem (start of day on 15th) < subtrahendRem (noon on 15th) -> decrement
        assertEquals(1, diff);
    }

    @Test
    public void testGetDifferenceAsLong_sameInstant_returnsZero() {
        long instant = chrono.getDateTimeMillis(2004, 6, 10, 0);
        long diff = field.getDifferenceAsLong(instant, instant);
        assertEquals(0, diff);
    }

    //-----------------------------------------------------------------------
    // set
    //-----------------------------------------------------------------------
    @Test
    public void testSet_normalMonth_updatesCorrectly() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        long result = field.set(instant, 8);
        assertEquals(8, field.get(result));
        assertEquals(15, chrono.getDayOfMonth(result));
    }

    @Test
    public void testSet_dayOverflowCoercedToMaxDay() {
        // Jan 31 set to Feb (non-leap year 2003) -> Feb 28
        long instant = chrono.getDateTimeMillis(2003, 1, 31, 0);
        long result = field.set(instant, 2);
        assertEquals(2, field.get(result));
        assertEquals(28, chrono.getDayOfMonth(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_belowMinimum_throwsIllegalArgumentException() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        field.set(instant, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_aboveMaximum_throwsIllegalArgumentException() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        field.set(instant, 13);
    }

    @Test
    public void testSet_minimumBoundaryValue_succeeds() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        long result = field.set(instant, 1);
        assertEquals(1, field.get(result));
    }

    @Test
    public void testSet_maximumBoundaryValue_succeeds() {
        long instant = chrono.getDateTimeMillis(2004, 5, 15, 0);
        long result = field.set(instant, 12);
        assertEquals(12, field.get(result));
    }

    //-----------------------------------------------------------------------
    // getRangeDurationField
    //-----------------------------------------------------------------------
    @Test
    public void testGetRangeDurationField_returnsYearsField() {
        assertSame(chrono.years(), field.getRangeDurationField());
    }

    //-----------------------------------------------------------------------
    // isLeap
    //-----------------------------------------------------------------------
    @Test
    public void testIsLeap_leapYearLeapMonth_returnsTrue() {
        long instant = chrono.getDateTimeMillis(2004, 2, 10, 0);
        assertTrue(field.isLeap(instant));
    }

    @Test
    public void testIsLeap_nonLeapYear_returnsFalse() {
        long instant = chrono.getDateTimeMillis(2003, 2, 10, 0);
        assertFalse(field.isLeap(instant));
    }

    @Test
    public void testIsLeap_leapYearNonLeapMonth_returnsFalse() {
        long instant = chrono.getDateTimeMillis(2004, 3, 10, 0);
        assertFalse(field.isLeap(instant));
    }

    //-----------------------------------------------------------------------
    // getLeapAmount
    //-----------------------------------------------------------------------
    @Test
    public void testGetLeapAmount_leapYearLeapMonth_returnsOne() {
        long instant = chrono.getDateTimeMillis(2004, 2, 10, 0);
        assertEquals(1, field.getLeapAmount(instant));
    }

    @Test
    public void testGetLeapAmount_nonLeap_returnsZero() {
        long instant = chrono.getDateTimeMillis(2003, 2, 10, 0);
        assertEquals(0, field.getLeapAmount(instant));
    }

    //-----------------------------------------------------------------------
    // getLeapDurationField
    //-----------------------------------------------------------------------
    @Test
    public void testGetLeapDurationField_returnsDaysField() {
        assertSame(chrono.days(), field.getLeapDurationField());
    }

    //-----------------------------------------------------------------------
    // getMinimumValue
    //-----------------------------------------------------------------------
    @Test
    public void testGetMinimumValue_returnsOne() {
        assertEquals(1, field.getMinimumValue());
    }

    //-----------------------------------------------------------------------
    // getMaximumValue
    //-----------------------------------------------------------------------
    @Test
    public void testGetMaximumValue_returnsTwelve() {
        assertEquals(12, field.getMaximumValue());
    }

    //-----------------------------------------------------------------------
    // roundFloor
    //-----------------------------------------------------------------------
    @Test
    public void testRoundFloor_midMonth_returnsStartOfMonth() {
        long instant = chrono.getDateTimeMillis(2004, 2, 15, 12345);
        long expectedStart = chrono.getDateTimeMillis(2004, 2, 1, 0);
        long result = field.roundFloor(instant);
        assertEquals(expectedStart, result);
    }

    @Test
    public void testRoundFloor_startOfMonth_returnsSameInstant() {
        long instant = chrono.getDateTimeMillis(2004, 2, 1, 0);
        long result = field.roundFloor(instant);
        assertEquals(instant, result);
    }

    //-----------------------------------------------------------------------
    // remainder
    //-----------------------------------------------------------------------
    @Test
    public void testRemainder_midMonth_returnsOffsetFromStart() {
        long instant = chrono.getDateTimeMillis(2004, 2, 15, 0);
        long startOfMonth = chrono.getDateTimeMillis(2004, 2, 1, 0);
        long expectedRemainder = instant - startOfMonth;
        assertEquals(expectedRemainder, field.remainder(instant));
    }

    @Test
    public void testRemainder_startOfMonth_returnsZero() {
        long instant = chrono.getDateTimeMillis(2004, 2, 1, 0);
        assertEquals(0, field.remainder(instant));
    }

    //-----------------------------------------------------------------------
    // Sanity check that the field instance was correctly obtained
    //-----------------------------------------------------------------------
    @Test
    public void testFieldInstance_isNotNull() {
        assertNotNull(field);
    }
}
