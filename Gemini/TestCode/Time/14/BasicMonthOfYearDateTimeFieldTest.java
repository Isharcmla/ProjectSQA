package org.joda.time.chrono;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.YearMonth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BasicMonthOfYearDateTimeFieldTest {

    private GregorianChronology chronology;
    private BasicMonthOfYearDateTimeField field;

    @Before
    public void setUp() {
        chronology = GregorianChronology.getInstanceUTC();
        field = new BasicMonthOfYearDateTimeField(chronology, DateTimeConstants.FEBRUARY);
    }

    @Test
    public void testIsLenient_returnsFalse() {
        Assert.assertFalse(field.isLenient());
    }

    @Test
    public void testGet_standardInstant_returnsCorrectMonth() {
        // 2021-06-15 UTC
        long instant = chronology.getYearMonthDayMillis(2021, 6, 15);
        Assert.assertEquals(6, field.get(instant));
    }

    @Test
    public void testAdd_intZero_returnsSameInstant() {
        long instant = chronology.getYearMonthDayMillis(2021, 6, 15) + 12345L;
        Assert.assertEquals(instant, field.add(instant, 0));
    }

    @Test
    public void testAdd_intPositiveWithinYear() {
        long instant = chronology.getYearMonthDayMillis(2021, 3, 10);
        long result = field.add(instant, 5);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 8, 10), result);
    }

    @Test
    public void testAdd_intPositiveAcrossYears() {
        long instant = chronology.getYearMonthDayMillis(2021, 10, 15);
        long result = field.add(instant, 5);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2022, 3, 15), result);
    }

    @Test
    public void testAdd_intNegativeAcrossYears() {
        long instant = chronology.getYearMonthDayMillis(2021, 3, 15);
        long result = field.add(instant, -5);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2020, 10, 15), result);
    }

    @Test
    public void testAdd_intNegativeExactYearMultiple() {
        // Jan 15, 2021 - 12 months = Jan 15, 2020 (tests remMonthToUse == 0 and monthToUse == 1)
        long instant = chronology.getYearMonthDayMillis(2021, 1, 15);
        long result = field.add(instant, -12);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2020, 1, 15), result);
    }

    @Test
    public void testAdd_intNegativeNotExactYearMultiple() {
        // Jan 15, 2021 - 13 months = Dec 15, 2019
        long instant = chronology.getYearMonthDayMillis(2021, 1, 15);
        long result = field.add(instant, -13);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2019, 12, 15), result);
    }

    @Test
    public void testAdd_intDayClamping_endOfMonth() {
        // May 31 + 1 month = June 30
        long instant = chronology.getYearMonthDayMillis(2021, 5, 31);
        long result = field.add(instant, 1);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 6, 30), result);

        // Jan 31 + 1 month in leap year = Feb 29
        long leapInstant = chronology.getYearMonthDayMillis(2020, 1, 31);
        long leapResult = field.add(leapInstant, 1);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2020, 2, 29), leapResult);

        // Jan 31 + 1 month in non-leap year = Feb 28
        long nonLeapInstant = chronology.getYearMonthDayMillis(2021, 1, 31);
        long nonLeapResult = field.add(nonLeapInstant, 1);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 2, 28), nonLeapResult);
    }

    @Test
    public void testAdd_longWithinIntRange_delegatesToAddInt() {
        long instant = chronology.getYearMonthDayMillis(2021, 5, 10);
        long result = field.add(instant, 3L);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 8, 10), result);
    }

    @Test
    public void testAdd_longPositiveLargeValue() {
        long instant = chronology.getYearMonthDayMillis(2000, 1, 15);
        long monthsToAdd = 3_000_000_000L; // > Integer.MAX_VALUE
        long result = field.add(instant, monthsToAdd);
        long expectedYear = 2000L + (monthsToAdd / 12);
        int expectedMonth = (int) (monthsToAdd % 12) + 1;
        Assert.assertEquals(chronology.getYearMonthDayMillis((int) expectedYear, expectedMonth, 15), result);
    }

    @Test
    public void testAdd_longPositiveLargeValueClampedDay() {
        long instant = chronology.getYearMonthDayMillis(2000, 1, 31);
        // 3_000_000_001L months from Jan -> month 2 (Feb) of target year
        long monthsToAdd = 3_000_000_001L;
        long result = field.add(instant, monthsToAdd);
        int targetYear = (int) (2000L + (monthsToAdd / 12));
        int daysInFeb = chronology.getDaysInYearMonth(targetYear, 2);
        Assert.assertEquals(chronology.getYearMonthDayMillis(targetYear, 2, daysInFeb), result);
    }

    @Test
    public void testAdd_longNegativeLargeValueExactMultiple() {
        long instant = chronology.getYearMonthDayMillis(200000000, 1, 15);
        long monthsToAdd = -2_400_000_000L; // Multiple of 12
        long result = field.add(instant, monthsToAdd);
        int targetYear = 200000000 + (int) (monthsToAdd / 12);
        Assert.assertEquals(chronology.getYearMonthDayMillis(targetYear, 1, 15), result);
    }

    @Test
    public void testAdd_longNegativeLargeValueNonMultiple() {
        long instant = chronology.getYearMonthDayMillis(200000000, 1, 15);
        long monthsToAdd = -2_400_000_001L; // monthToUse boundary test
        long result = field.add(instant, monthsToAdd);
        int targetYear = 200000000 + (int) (monthsToAdd / 12) - 1;
        Assert.assertEquals(chronology.getYearMonthDayMillis(targetYear, 12, 15), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_longExceedsMaxYear_throwsException() {
        long instant = chronology.getYearMonthDayMillis(2021, 1, 1);
        field.add(instant, 100_000_000_000_000L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_longExceedsMinYear_throwsException() {
        long instant = chronology.getYearMonthDayMillis(2021, 1, 1);
        field.add(instant, -100_000_000_000_000L);
    }

    @Test
    public void testAdd_partialContiguous_zeroValue() {
        YearMonth ym = new YearMonth(2021, 5, chronology);
        int[] values = new int[]{2021, 5};
        int[] result = field.add(ym, 1, values, 0);
        Assert.assertArrayEquals(values, result);
    }

    @Test
    public void testAdd_partialContiguous_nonZeroValue() {
        YearMonth ym = new YearMonth(2021, 5, chronology);
        int[] values = new int[]{2021, 5};
        int[] result = field.add(ym, 1, values, 3);
        Assert.assertArrayEquals(new int[]{2021, 8}, result);
    }

    @Test
    public void testAdd_partialNonContiguous() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.secondOfMinute()
        };
        int[] values = new int[]{5, 30};
        Partial partial = new Partial(types, values, chronology);

        int[] result = field.add(partial, 0, values, 4);
        Assert.assertEquals(9, result[0]);
        Assert.assertEquals(30, result[1]);
    }

    @Test
    public void testAddWrapField_positiveAndNegative() {
        long instant = chronology.getYearMonthDayMillis(2021, 10, 15);
        long added = field.addWrapField(instant, 5); // 10 + 5 = 15 -> wrapped to 3 (March 2021)
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 3, 15), added);

        long subtracted = field.addWrapField(instant, -11); // 10 - 11 = -1 -> wrapped to 11 (Nov 2021)
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 11, 15), subtracted);
    }

    @Test
    public void testGetDifferenceAsLong_minuendLessThanSubtrahend() {
        long instant1 = chronology.getYearMonthDayMillis(2020, 1, 15);
        long instant2 = chronology.getYearMonthDayMillis(2021, 6, 15);
        Assert.assertEquals(-17L, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_sameDaySameTime() {
        long instant1 = chronology.getYearMonthDayMillis(2021, 6, 15);
        long instant2 = chronology.getYearMonthDayMillis(2020, 1, 15);
        Assert.assertEquals(17L, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_withRemainderAdjustment() {
        long instant1 = chronology.getYearMonthDayMillis(2021, 6, 15) + 1000L;
        long instant2 = chronology.getYearMonthDayMillis(2021, 5, 15) + 2000L;
        // minuendRem < subtrahendRem -> difference reduced by 1
        Assert.assertEquals(0L, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_lastDayOfMonthCoercion() {
        // Minuend is Feb 28 in non-leap year (last day)
        // Subtrahend is Mar 31
        long minuend = chronology.getYearMonthDayMillis(2021, 2, 28);
        long subtrahend = chronology.getYearMonthDayMillis(2021, 1, 31);
        Assert.assertEquals(1L, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testSet_validMonth() {
        long instant = chronology.getYearMonthDayMillis(2021, 5, 20) + 500L;
        long result = field.set(instant, 8);
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 8, 20) + 500L, result);
    }

    @Test
    public void testSet_validMonthDayClamping() {
        long instant = chronology.getYearMonthDayMillis(2021, 1, 31);
        long result = field.set(instant, 2); // Feb 2021 has 28 days
        Assert.assertEquals(chronology.getYearMonthDayMillis(2021, 2, 28), result);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testSet_monthBelowMin_throwsException() {
        long instant = chronology.getYearMonthDayMillis(2021, 5, 20);
        field.set(instant, 0);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testSet_monthAboveMax_throwsException() {
        long instant = chronology.getYearMonthDayMillis(2021, 5, 20);
        field.set(instant, 13);
    }

    @Test
    public void testGetRangeDurationField() {
        Assert.assertEquals(chronology.years(), field.getRangeDurationField());
    }

    @Test
    public void testIsLeap_leapMonthInLeapYear_returnsTrue() {
        long leapYearFeb = chronology.getYearMonthDayMillis(2020, 2, 10);
        Assert.assertTrue(field.isLeap(leapYearFeb));
    }

    @Test
    public void testIsLeap_nonLeapMonthInLeapYear_returnsFalse() {
        long leapYearJan = chronology.getYearMonthDayMillis(2020, 1, 10);
        Assert.assertFalse(field.isLeap(leapYearJan));
    }

    @Test
    public void testIsLeap_leapMonthInNonLeapYear_returnsFalse() {
        long nonLeapYearFeb = chronology.getYearMonthDayMillis(2021, 2, 10);
        Assert.assertFalse(field.isLeap(nonLeapYearFeb));
    }

    @Test
    public void testGetLeapAmount() {
        long leapYearFeb = chronology.getYearMonthDayMillis(2020, 2, 10);
        long nonLeapYearFeb = chronology.getYearMonthDayMillis(2021, 2, 10);

        Assert.assertEquals(1, field.getLeapAmount(leapYearFeb));
        Assert.assertEquals(0, field.getLeapAmount(nonLeapYearFeb));
    }

    @Test
    public void testGetLeapDurationField() {
        Assert.assertEquals(chronology.days(), field.getLeapDurationField());
    }

    @Test
    public void testGetMinimumValue() {
        Assert.assertEquals(DateTimeConstants.JANUARY, field.getMinimumValue());
    }

    @Test
    public void testGetMaximumValue() {
        Assert.assertEquals(12, field.getMaximumValue());
    }

    @Test
    public void testRoundFloor() {
        long instant = chronology.getYearMonthDayMillis(2021, 6, 15) + 3600000L;
        long expected = chronology.getYearMonthMillis(2021, 6);
        Assert.assertEquals(expected, field.roundFloor(instant));
    }

    @Test
    public void testRemainder() {
        long instant = chronology.getYearMonthDayMillis(2021, 6, 15) + 3600000L;
        long floor = chronology.getYearMonthMillis(2021, 6);
        Assert.assertEquals(instant - floor, field.remainder(instant));
    }

    @Test
    public void testSerialization_readResolve() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(field);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertEquals(chronology.monthOfYear().getClass(), deserialized.getClass());
    }
}
