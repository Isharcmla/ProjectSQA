package org.joda.time.chrono;

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MonthDay;
import org.joda.time.YearMonth;
import org.junit.Assert;
import org.junit.Test;

public class ZonedChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone FIXED_PLUS_2 = DateTimeZone.forOffsetHours(2);
    private static final DateTimeZone FIXED_MINUS_2 = DateTimeZone.forOffsetHours(-2);

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullBase_throwsException() {
        ZonedChronology.getInstance(null, PARIS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullZone_throwsException() {
        ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullUTCChronology_throwsException() {
        Chronology nullUtcChrono = new BaseChronology() {
            private static final long serialVersionUID = 1L;
            public DateTimeZone getZone() { return null; }
            public Chronology withUTC() { return null; }
            public Chronology withZone(DateTimeZone zone) { return this; }
            public String toString() { return "NullUTC"; }
        };
        ZonedChronology.getInstance(nullUtcChrono, PARIS);
    }

    @Test
    public void testGetInstance_validInputs_returnsInstance() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        Assert.assertNotNull(chrono);
        Assert.assertEquals(PARIS, chrono.getZone());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), chrono.withUTC());
    }

    @Test
    public void testWithZone_variousZones() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);

        // withZone(null) -> default zone
        Chronology defaultZoneChrono = chrono.withZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), defaultZoneChrono.getZone());

        // withZone(same zone) -> returns this
        Assert.assertSame(chrono, chrono.withZone(PARIS));

        // withZone(UTC) -> returns base
        Assert.assertSame(ISOChronology.getInstanceUTC(), chrono.withZone(DateTimeZone.UTC));

        // withZone(other zone) -> returns new ZonedChronology
        Chronology nyChrono = chrono.withZone(NEW_YORK);
        Assert.assertEquals(NEW_YORK, nyChrono.getZone());
        Assert.assertNotSame(chrono, nyChrono);
    }

    @Test
    public void testUseTimeArithmetic() {
        DurationField millis = ISOChronology.getInstanceUTC().millis();
        DurationField hours = ISOChronology.getInstanceUTC().hours();
        DurationField days = ISOChronology.getInstanceUTC().days();

        Assert.assertTrue(ZonedChronology.useTimeArithmetic(millis));
        Assert.assertTrue(ZonedChronology.useTimeArithmetic(hours));
        Assert.assertFalse(ZonedChronology.useTimeArithmetic(days));
        Assert.assertFalse(ZonedChronology.useTimeArithmetic(null));
    }

    @Test
    public void testGetDateTimeMillis_4args_valid() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), FIXED_PLUS_2);
        // 2021-06-15 at 02:00:00.000 (millisOfDay = 2 * 3600 * 1000 = 7200000) in UTC+2 is 2021-06-15 00:00:00.000Z
        long expectedUTC = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 0, 0, 0, 0);
        long actual = chrono.getDateTimeMillis(2021, 6, 15, 2 * 3600 * 1000);
        Assert.assertEquals(expectedUTC, actual);
    }

    @Test
    public void testGetDateTimeMillis_7args_valid() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), FIXED_PLUS_2);
        long expectedUTC = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 10, 30, 45, 500);
        long actual = chrono.getDateTimeMillis(2021, 6, 15, 12, 30, 45, 500);
        Assert.assertEquals(expectedUTC, actual);
    }

    @Test
    public void testGetDateTimeMillis_5args_instant_valid() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), FIXED_PLUS_2);
        long baseInstant = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 0, 0, 0, 0);
        long actual = chrono.getDateTimeMillis(baseInstant, 12, 30, 45, 500);
        long expectedUTC = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 10, 30, 45, 500);
        Assert.assertEquals(expectedUTC, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_inDSTGap_throwsException() {
        // America/New_York jumped from 01:59:59 to 03:00:00 on 2007-03-11
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), NEW_YORK);
        chrono.getDateTimeMillis(2007, 3, 11, 2, 30, 0, 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        ZonedChronology chrono1 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        ZonedChronology chrono2 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        ZonedChronology chrono3 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), NEW_YORK);
        ZonedChronology chrono4 = ZonedChronology.getInstance(GJChronology.getInstanceUTC(), PARIS);

        Assert.assertTrue(chrono1.equals(chrono1));
        Assert.assertTrue(chrono1.equals(chrono2));
        Assert.assertFalse(chrono1.equals(chrono3));
        Assert.assertFalse(chrono1.equals(chrono4));
        Assert.assertFalse(chrono1.equals(null));
        Assert.assertFalse(chrono1.equals("NotAChronology"));

        Assert.assertEquals(chrono1.hashCode(), chrono2.hashCode());
        Assert.assertNotEquals(chrono1.hashCode(), chrono3.hashCode());
    }

    @Test
    public void testToString() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        String str = chrono.toString();
        Assert.assertTrue(str.contains("ZonedChronology"));
        Assert.assertTrue(str.contains("Europe/Paris"));
        Assert.assertTrue(str.contains("ISOChronology"));
    }

    @Test
    public void testZonedDurationField_operations() {
        ZonedChronology chronoParis = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        ZonedChronology chronoFixed = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), FIXED_PLUS_2);

        DurationField hoursTimeField = chronoParis.hours();
        DurationField daysDateField = chronoParis.days();
        DurationField fixedDaysDateField = chronoFixed.days();

        // isPrecise
        Assert.assertTrue(hoursTimeField.isPrecise());
        Assert.assertFalse(daysDateField.isPrecise());
        Assert.assertTrue(fixedDaysDateField.isPrecise());

        // getUnitMillis
        Assert.assertEquals(DateTimeConstants.MILLIS_PER_HOUR, hoursTimeField.getUnitMillis());
        Assert.assertEquals(DateTimeConstants.MILLIS_PER_DAY, daysDateField.getUnitMillis());

        long instant = chronoParis.getDateTimeMillis(2021, 6, 15, 12, 0, 0, 0);

        // getValue & getValueAsLong
        Assert.assertEquals(2, hoursTimeField.getValue(2 * 3600 * 1000L, instant));
        Assert.assertEquals(2L, hoursTimeField.getValueAsLong(2 * 3600 * 1000L, instant));
        Assert.assertEquals(3, daysDateField.getValue(3 * 86400 * 1000L, instant));
        Assert.assertEquals(3L, daysDateField.getValueAsLong(3 * 86400 * 1000L, instant));

        // getMillis
        Assert.assertEquals(2 * 3600 * 1000L, hoursTimeField.getMillis(2, instant));
        Assert.assertEquals(2 * 3600 * 1000L, hoursTimeField.getMillis(2L, instant));
        Assert.assertEquals(3 * 86400 * 1000L, daysDateField.getMillis(3, instant));
        Assert.assertEquals(3 * 86400 * 1000L, daysDateField.getMillis(3L, instant));

        // add int & long
        long addedHours = hoursTimeField.add(instant, 5);
        Assert.assertEquals(instant + 5 * 3600 * 1000L, addedHours);
        long addedHoursLong = hoursTimeField.add(instant, 5L);
        Assert.assertEquals(instant + 5 * 3600 * 1000L, addedHoursLong);

        long addedDays = daysDateField.add(instant, 2);
        long expectedDays = chronoParis.getDateTimeMillis(2021, 6, 17, 12, 0, 0, 0);
        Assert.assertEquals(expectedDays, addedDays);
        long addedDaysLong = daysDateField.add(instant, 2L);
        Assert.assertEquals(expectedDays, addedDaysLong);

        // getDifference & getDifferenceAsLong
        Assert.assertEquals(5, hoursTimeField.getDifference(addedHours, instant));
        Assert.assertEquals(5L, hoursTimeField.getDifferenceAsLong(addedHours, instant));
        Assert.assertEquals(2, daysDateField.getDifference(addedDays, instant));
        Assert.assertEquals(2L, daysDateField.getDifferenceAsLong(addedDays, instant));
    }

    @Test(expected = ArithmeticException.class)
    public void testZonedDurationField_offsetToAddOverflow_throwsException() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), FIXED_PLUS_2);
        chrono.days().add(Long.MAX_VALUE - 1000L, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testZonedDurationField_offsetFromLocalToSubtractOverflow_throwsException() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), FIXED_MINUS_2);
        chrono.days().add(Long.MAX_VALUE - 1000L, 1);
    }

    @Test
    public void testZonedDateTimeField_timeFieldOperations() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField hourField = chrono.hourOfDay();
        DateTimeField minuteField = chrono.minuteOfHour();

        long instant = chrono.getDateTimeMillis(2021, 6, 15, 14, 30, 15, 100);

        Assert.assertFalse(hourField.isLenient());
        Assert.assertEquals(14, hourField.get(instant));
        Assert.assertEquals("14", hourField.getAsText(instant, Locale.ENGLISH));
        Assert.assertEquals("14", hourField.getAsShortText(instant, Locale.ENGLISH));
        Assert.assertEquals("14", hourField.getAsText(14, Locale.ENGLISH));
        Assert.assertEquals("14", hourField.getAsShortText(14, Locale.ENGLISH));

        // add int & long
        long addedHours = hourField.add(instant, 2);
        Assert.assertEquals(16, hourField.get(addedHours));
        long addedHoursLong = hourField.add(instant, 3L);
        Assert.assertEquals(17, hourField.get(addedHoursLong));

        // addWrapField
        long wrapHour = hourField.addWrapField(instant, 12);
        Assert.assertEquals(2, hourField.get(wrapHour));

        // set int & string
        long setHour = hourField.set(instant, 20);
        Assert.assertEquals(20, hourField.get(setHour));
        long setMinuteStr = minuteField.set(instant, "45", Locale.ENGLISH);
        Assert.assertEquals(45, minuteField.get(setMinuteStr));

        // getDifference & getDifferenceAsLong
        Assert.assertEquals(2, hourField.getDifference(addedHours, instant));
        Assert.assertEquals(3L, hourField.getDifferenceAsLong(addedHoursLong, instant));

        // roundFloor, roundCeiling, remainder
        long floor = hourField.roundFloor(instant);
        Assert.assertEquals(chrono.getDateTimeMillis(2021, 6, 15, 14, 0, 0, 0), floor);
        long ceiling = hourField.roundCeiling(instant);
        Assert.assertEquals(chrono.getDateTimeMillis(2021, 6, 15, 15, 0, 0, 0), ceiling);
        long rem = hourField.remainder(instant);
        Assert.assertEquals(30 * 60 * 1000L + 15 * 1000L + 100L, rem);

        // min / max values
        Assert.assertEquals(0, hourField.getMinimumValue());
        Assert.assertEquals(0, hourField.getMinimumValue(instant));
        Assert.assertEquals(23, hourField.getMaximumValue());
        Assert.assertEquals(23, hourField.getMaximumValue(instant));
        Assert.assertEquals(2, hourField.getMaximumTextLength(Locale.ENGLISH));
        Assert.assertEquals(2, hourField.getMaximumShortTextLength(Locale.ENGLISH));
    }

    @Test
    public void testZonedDateTimeField_dateFieldOperations() {
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField dayField = chrono.dayOfMonth();
        DateTimeField monthField = chrono.monthOfYear();
        DateTimeField yearField = chrono.year();

        long instant = chrono.getDateTimeMillis(2021, 6, 15, 14, 30, 15, 100);

        Assert.assertEquals(15, dayField.get(instant));
        Assert.assertEquals(6, monthField.get(instant));
        Assert.assertEquals("June", monthField.getAsText(instant, Locale.ENGLISH));
        Assert.assertEquals("Jun", monthField.getAsShortText(instant, Locale.ENGLISH));

        // add int & long
        long addedDays = dayField.add(instant, 5);
        Assert.assertEquals(20, dayField.get(addedDays));
        long addedMonthsLong = monthField.add(instant, 2L);
        Assert.assertEquals(8, monthField.get(addedMonthsLong));

        // addWrapField
        long wrapMonth = monthField.addWrapField(instant, 8); // 6 + 8 = 14 -> 2 (February)
        Assert.assertEquals(2, monthField.get(wrapMonth));

        // set int & text
        long setDay = dayField.set(instant, 25);
        Assert.assertEquals(25, dayField.get(setDay));
        long setMonthStr = monthField.set(instant, "July", Locale.ENGLISH);
        Assert.assertEquals(7, monthField.get(setMonthStr));

        // getDifference & getDifferenceAsLong
        Assert.assertEquals(5, dayField.getDifference(addedDays, instant));
        Assert.assertEquals(2L, monthField.getDifferenceAsLong(addedMonthsLong, instant));

        // durations
        Assert.assertNotNull(dayField.getDurationField());
        Assert.assertNotNull(dayField.getRangeDurationField());
        Assert.assertNull(dayField.getLeapDurationField());
        Assert.assertNotNull(monthField.getLeapDurationField());

        // isLeap and getLeapAmount
        long leapInstant = chrono.getDateTimeMillis(2020, 2, 1, 0, 0, 0, 0);
        Assert.assertTrue(monthField.isLeap(leapInstant));
        Assert.assertEquals(1, monthField.getLeapAmount(leapInstant));
        Assert.assertFalse(monthField.isLeap(instant));
        Assert.assertEquals(0, monthField.getLeapAmount(instant));

        // roundFloor & roundCeiling & remainder
        long floor = dayField.roundFloor(instant);
        Assert.assertEquals(chrono.getDateTimeMillis(2021, 6, 15, 0, 0, 0, 0), floor);
        long ceiling = dayField.roundCeiling(instant);
        Assert.assertEquals(chrono.getDateTimeMillis(2021, 6, 16, 0, 0, 0, 0), ceiling);
        long rem = dayField.remainder(instant);
        Assert.assertEquals(14 * 3600 * 1000L + 30 * 60 * 1000L + 15 * 1000L + 100L, rem);

        // min / max values with partials
        MonthDay monthDay = new MonthDay(6, 15, chrono);
        YearMonth yearMonth = new YearMonth(2021, 6, chrono);
        Assert.assertEquals(1, dayField.getMinimumValue());
        Assert.assertEquals(1, dayField.getMinimumValue(instant));
        Assert.assertEquals(1, dayField.getMinimumValue(monthDay));
        Assert.assertEquals(1, dayField.getMinimumValue(monthDay, new int[]{6, 15}));

        Assert.assertEquals(31, dayField.getMaximumValue());
        Assert.assertEquals(30, dayField.getMaximumValue(instant));
        Assert.assertEquals(30, dayField.getMaximumValue(yearMonth));
        Assert.assertEquals(30, dayField.getMaximumValue(yearMonth, new int[]{2021, 6}));

        Assert.assertTrue(monthField.getMaximumTextLength(Locale.ENGLISH) > 0);
        Assert.assertTrue(monthField.getMaximumShortTextLength(Locale.ENGLISH) > 0);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testZonedDateTimeField_setInDSTGap_throwsException() {
        // America/New_York DST transition: 2007-03-11 02:00:00 -> 03:00:00
        ZonedChronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), NEW_YORK);
        long instant = chrono.getDateTimeMillis(2007, 3, 11, 1, 0, 0, 0);
        chrono.hourOfDay().set(instant, 2);
    }
}
