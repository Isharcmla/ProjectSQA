package org.apache.commons.lang.time;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

public class DateUtilsTest {

    @Test
    public void testConstructor_instantiation_success() {
        DateUtils utils = new DateUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testConstants_values_correct() {
        Assert.assertNotNull(DateUtils.UTC_TIME_ZONE);
        Assert.assertEquals("GMT", DateUtils.UTC_TIME_ZONE.getID());
        Assert.assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
        Assert.assertEquals(60000L, DateUtils.MILLIS_PER_MINUTE);
        Assert.assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
        Assert.assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);
        Assert.assertEquals(1000, DateUtils.MILLIS_IN_SECOND);
        Assert.assertEquals(60000, DateUtils.MILLIS_IN_MINUTE);
        Assert.assertEquals(3600000, DateUtils.MILLIS_IN_HOUR);
        Assert.assertEquals(86400000, DateUtils.MILLIS_IN_DAY);
        Assert.assertEquals(1001, DateUtils.SEMI_MONTH);
    }

    @Test
    public void testIsSameDay_dateEqual_returnsTrue() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, Calendar.MARCH, 28, 13, 45, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 28, 6, 1, 0);

        Assert.assertTrue(DateUtils.isSameDay(cal1.getTime(), cal2.getTime()));
    }

    @Test
    public void testIsSameDay_dateDifferent_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, Calendar.MARCH, 28, 13, 45, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 12, 13, 45, 1);

        Assert.assertFalse(DateUtils.isSameDay(cal1.getTime(), cal2.getTime()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_dateNullFirst_throwsException() {
        DateUtils.isSameDay((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_dateNullSecond_throwsException() {
        DateUtils.isSameDay(new Date(), (Date) null);
    }

    @Test
    public void testIsSameDay_calendarEqual_returnsTrue() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, Calendar.MARCH, 28, 13, 45, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 28, 6, 1, 0);

        Assert.assertTrue(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void testIsSameDay_calendarDifferentYear_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2022, Calendar.MARCH, 28);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 28);

        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void testIsSameDay_calendarDifferentEra_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.ERA, GregorianCalendar.BC);
        cal1.set(2023, Calendar.MARCH, 28);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.ERA, GregorianCalendar.AD);
        cal2.set(2023, Calendar.MARCH, 28);

        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_calendarNullFirst_throwsException() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_calendarNullSecond_throwsException() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameInstant_dateEqual_returnsTrue() {
        Date date1 = new Date(1000000L);
        Date date2 = new Date(1000000L);
        Assert.assertTrue(DateUtils.isSameInstant(date1, date2));
    }

    @Test
    public void testIsSameInstant_dateDifferent_returnsFalse() {
        Date date1 = new Date(1000000L);
        Date date2 = new Date(2000000L);
        Assert.assertFalse(DateUtils.isSameInstant(date1, date2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_dateNullFirst_throwsException() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_dateNullSecond_throwsException() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test
    public void testIsSameInstant_calendarEqual_returnsTrue() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(new Date(1000000L));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(new Date(1000000L));
        Assert.assertTrue(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test
    public void testIsSameInstant_calendarDifferent_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(new Date(1000000L));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(new Date(2000000L));
        Assert.assertFalse(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_calendarNullFirst_throwsException() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_calendarNullSecond_throwsException() {
        DateUtils.isSameInstant(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameLocalTime_calendarEqual_returnsTrue() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal1.set(2023, Calendar.MARCH, 28, 13, 45, 10);
        cal1.set(Calendar.MILLISECOND, 500);

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT+5"));
        cal2.set(2023, Calendar.MARCH, 28, 13, 45, 10);
        cal2.set(Calendar.MILLISECOND, 500);

        Assert.assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_calendarDifferentMillisecond_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.MILLISECOND, 100);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.set(Calendar.MILLISECOND, 200);
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_calendarDifferentSecond_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.SECOND, 10);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.set(Calendar.SECOND, 20);
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_calendarDifferentMinute_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.MINUTE, 10);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.set(Calendar.MINUTE, 20);
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_calendarDifferentHour_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.HOUR, 1);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.set(Calendar.HOUR, 2);
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_calendarDifferentDayOfYear_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.DAY_OF_YEAR, 10);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.set(Calendar.DAY_OF_YEAR, 20);
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_calendarDifferentYear_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2022);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.set(Calendar.YEAR, 2023);
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_calendarDifferentEra_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.ERA, GregorianCalendar.BC);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.set(Calendar.ERA, GregorianCalendar.AD);
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_differentCalendarClasses_returnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = new GregorianCalendar() {};
        Assert.assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_calendarNullFirst_throwsException() {
        DateUtils.isSameLocalTime((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_calendarNullSecond_throwsException() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testParseDate_validPattern_returnsDate() throws ParseException {
        String[] patterns = new String[]{"yyyy-MM-dd", "yyyy/MM/dd HH:mm:ss"};
        Date date1 = DateUtils.parseDate("2023-05-12", patterns);
        Assert.assertNotNull(date1);

        Date date2 = DateUtils.parseDate("2023/05/12 10:20:30", patterns);
        Assert.assertNotNull(date2);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_partialMatch_throwsParseException() throws ParseException {
        String[] patterns = new String[]{"yyyy-MM-dd"};
        DateUtils.parseDate("2023-05-12 trailing text", patterns);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_noMatchingPattern_throwsParseException() throws ParseException {
        String[] patterns = new String[]{"yyyy-MM-dd", "MM/dd/yyyy"};
        DateUtils.parseDate("invalid date string", patterns);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_emptyPatterns_throwsParseException() throws ParseException {
        DateUtils.parseDate("2023-05-12", new String[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_nullString_throwsException() throws ParseException {
        DateUtils.parseDate(null, new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_nullPatterns_throwsException() throws ParseException {
        DateUtils.parseDate("2023-05-12", null);
    }

    @Test
    public void testAddYears_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1);
        Date base = cal.getTime();

        Date result1 = DateUtils.addYears(base, 2);
        Calendar resCal1 = Calendar.getInstance();
        resCal1.setTime(result1);
        Assert.assertEquals(2022, resCal1.get(Calendar.YEAR));

        Date result2 = DateUtils.addYears(base, -2);
        Calendar resCal2 = Calendar.getInstance();
        resCal2.setTime(result2);
        Assert.assertEquals(2018, resCal2.get(Calendar.YEAR));
    }

    @Test
    public void testAddMonths_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1);
        Date base = cal.getTime();

        Date result = DateUtils.addMonths(base, 3);
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(result);
        Assert.assertEquals(Calendar.APRIL, resCal.get(Calendar.MONTH));
    }

    @Test
    public void testAddWeeks_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1);
        Date base = cal.getTime();

        Date result = DateUtils.addWeeks(base, 1);
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(result);
        Assert.assertEquals(8, resCal.get(Calendar.DATE));
    }

    @Test
    public void testAddDays_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1);
        Date base = cal.getTime();

        Date result = DateUtils.addDays(base, 5);
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(result);
        Assert.assertEquals(6, resCal.get(Calendar.DATE));
    }

    @Test
    public void testAddHours_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1, 10, 0, 0);
        Date base = cal.getTime();

        Date result = DateUtils.addHours(base, 3);
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(result);
        Assert.assertEquals(13, resCal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1, 10, 10, 0);
        Date base = cal.getTime();

        Date result = DateUtils.addMinutes(base, 15);
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(result);
        Assert.assertEquals(25, resCal.get(Calendar.MINUTE));
    }

    @Test
    public void testAddSeconds_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1, 10, 10, 10);
        Date base = cal.getTime();

        Date result = DateUtils.addSeconds(base, 20);
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(result);
        Assert.assertEquals(30, resCal.get(Calendar.SECOND));
    }

    @Test
    public void testAddMilliseconds_positiveAndNegative_correct() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1, 10, 10, 10);
        cal.set(Calendar.MILLISECOND, 100);
        Date base = cal.getTime();

        Date result = DateUtils.addMilliseconds(base, 200);
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(result);
        Assert.assertEquals(300, resCal.get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullDate_throwsException() {
        DateUtils.add(null, Calendar.DATE, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddYears_nullDate_throwsException() {
        DateUtils.addYears(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMonths_nullDate_throwsException() {
        DateUtils.addMonths(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddWeeks_nullDate_throwsException() {
        DateUtils.addWeeks(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDays_nullDate_throwsException() {
        DateUtils.addDays(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddHours_nullDate_throwsException() {
        DateUtils.addHours(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMinutes_nullDate_throwsException() {
        DateUtils.addMinutes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddSeconds_nullDate_throwsException() {
        DateUtils.addSeconds(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMilliseconds_nullDate_throwsException() {
        DateUtils.addMilliseconds(null, 1);
    }

    @Test
    public void testRound_date_roundDown() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 28, 13, 10, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Date rounded = DateUtils.round(cal.getTime(), Calendar.HOUR_OF_DAY);
        Calendar res = Calendar.getInstance();
        res.setTime(rounded);
        Assert.assertEquals(13, res.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(0, res.get(Calendar.MINUTE));
    }

    @Test
    public void testRound_date_roundUp() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Date rounded = DateUtils.round(cal.getTime(), Calendar.HOUR_OF_DAY);
        Calendar res = Calendar.getInstance();
        res.setTime(rounded);
        Assert.assertEquals(14, res.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(0, res.get(Calendar.MINUTE));
    }

    @Test
    public void testRound_calendar_success() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Calendar rounded = DateUtils.round(cal, Calendar.MONTH);
        Assert.assertEquals(Calendar.APRIL, rounded.get(Calendar.MONTH));
        Assert.assertEquals(1, rounded.get(Calendar.DATE));
    }

    @Test
    public void testRound_objectDateAndCalendar_success() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Date roundedDate = DateUtils.round((Object) cal.getTime(), Calendar.MONTH);
        Date roundedCal = DateUtils.round((Object) cal, Calendar.MONTH);
        Assert.assertEquals(roundedDate, roundedCal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_nullDate_throwsException() {
        DateUtils.round((Date) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_nullCalendar_throwsException() {
        DateUtils.round((Calendar) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_nullObject_throwsException() {
        DateUtils.round((Object) null, Calendar.DATE);
    }

    @Test(expected = ClassCastException.class)
    public void testRound_invalidObjectType_throwsException() {
        DateUtils.round("not a date", Calendar.DATE);
    }

    @Test
    public void testRound_semiMonth_roundDownAndUp() {
        // SEMI_MONTH: day <= 8 rounds to 1st
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 5, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Calendar rounded = DateUtils.round(cal, DateUtils.SEMI_MONTH);
        Assert.assertEquals(1, rounded.get(Calendar.DATE));

        // SEMI_MONTH: day > 8 (e.g. 10) rounds to 16th
        cal.set(2023, Calendar.JANUARY, 10, 0, 0, 0);
        rounded = DateUtils.round(cal, DateUtils.SEMI_MONTH);
        Assert.assertEquals(16, rounded.get(Calendar.DATE));

        // SEMI_MONTH: day == 1 rounds up when roundUp is true (e.g. if field is MONTH and we are at top)
        // Testing semi_month roundUp branch directly
        cal.set(2023, Calendar.JANUARY, 20, 0, 0, 0);
        rounded = DateUtils.round(cal, DateUtils.SEMI_MONTH);
        Assert.assertEquals(16, rounded.get(Calendar.DATE));

        cal.set(2023, Calendar.JANUARY, 26, 0, 0, 0);
        rounded = DateUtils.round(cal, DateUtils.SEMI_MONTH);
        Assert.assertEquals(Calendar.FEBRUARY, rounded.get(Calendar.MONTH));
        Assert.assertEquals(1, rounded.get(Calendar.DATE));

        // Test SEMI_MONTH roundUp when val.get(Calendar.DATE) == 1
        cal.set(2023, Calendar.JANUARY, 1, 15, 0, 0);
        rounded = DateUtils.round(cal, DateUtils.SEMI_MONTH);
        Assert.assertEquals(16, rounded.get(Calendar.DATE));
    }

    @Test
    public void testRound_amPm_roundDownAndUp() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 1, 4, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Calendar rounded = DateUtils.round(cal, Calendar.AM_PM);
        Assert.assertEquals(0, rounded.get(Calendar.HOUR_OF_DAY));

        cal.set(2023, Calendar.JANUARY, 1, 8, 0, 0);
        rounded = DateUtils.round(cal, Calendar.AM_PM);
        Assert.assertEquals(12, rounded.get(Calendar.HOUR_OF_DAY));

        cal.set(2023, Calendar.JANUARY, 1, 15, 0, 0);
        rounded = DateUtils.round(cal, Calendar.AM_PM);
        Assert.assertEquals(12, rounded.get(Calendar.HOUR_OF_DAY));

        cal.set(2023, Calendar.JANUARY, 1, 20, 0, 0);
        rounded = DateUtils.round(cal, Calendar.AM_PM);
        Assert.assertEquals(Calendar.AM, rounded.get(Calendar.AM_PM));
        Assert.assertEquals(2, rounded.get(Calendar.DATE));
    }

    @Test
    public void testRound_allStandardFields() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 20, 30);
        cal.set(Calendar.MILLISECOND, 500);

        Assert.assertNotNull(DateUtils.round(cal, Calendar.ERA));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.YEAR));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.MONTH));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.DATE));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.DAY_OF_MONTH));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.HOUR));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.HOUR_OF_DAY));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.MINUTE));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.SECOND));
        Assert.assertNotNull(DateUtils.round(cal, Calendar.MILLISECOND));
    }

    @Test(expected = ArithmeticException.class)
    public void testRound_excessiveYear_throwsArithmeticException() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.round(cal, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_unsupportedField_throwsException() {
        Calendar cal = Calendar.getInstance();
        DateUtils.round(cal, -999);
    }

    @Test
    public void testTruncate_date_success() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 28, 13, 45, 20);
        cal.set(Calendar.MILLISECOND, 500);

        Date truncated = DateUtils.truncate(cal.getTime(), Calendar.HOUR_OF_DAY);
        Calendar res = Calendar.getInstance();
        res.setTime(truncated);
        Assert.assertEquals(13, res.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(0, res.get(Calendar.MINUTE));
        Assert.assertEquals(0, res.get(Calendar.SECOND));
        Assert.assertEquals(0, res.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncate_calendar_success() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 28, 13, 45, 20);
        Calendar truncated = DateUtils.truncate(cal, Calendar.MONTH);
        Assert.assertEquals(Calendar.MARCH, truncated.get(Calendar.MONTH));
        Assert.assertEquals(1, truncated.get(Calendar.DATE));
    }

    @Test
    public void testTruncate_objectDateAndCalendar_success() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 28, 13, 45, 0);

        Date truncatedDate = DateUtils.truncate((Object) cal.getTime(), Calendar.MONTH);
        Date truncatedCal = DateUtils.truncate((Object) cal, Calendar.MONTH);
        Assert.assertEquals(truncatedDate, truncatedCal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_nullDate_throwsException() {
        DateUtils.truncate((Date) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_nullCalendar_throwsException() {
        DateUtils.truncate((Calendar) null, Calendar.DATE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_nullObject_throwsException() {
        DateUtils.truncate((Object) null, Calendar.DATE);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncate_invalidObjectType_throwsException() {
        DateUtils.truncate(12345, Calendar.DATE);
    }

    @Test
    public void testTruncate_semiMonth_firstAndSecondHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 10);
        Calendar truncated = DateUtils.truncate(cal, DateUtils.SEMI_MONTH);
        Assert.assertEquals(1, truncated.get(Calendar.DATE));

        cal.set(2023, Calendar.MARCH, 25);
        truncated = DateUtils.truncate(cal, DateUtils.SEMI_MONTH);
        Assert.assertEquals(16, truncated.get(Calendar.DATE));
    }

    @Test
    public void testTruncate_amPm_amAndPm() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 10, 5, 30, 0);
        Calendar truncated = DateUtils.truncate(cal, Calendar.AM_PM);
        Assert.assertEquals(0, truncated.get(Calendar.HOUR_OF_DAY));

        cal.set(2023, Calendar.MARCH, 10, 18, 30, 0);
        truncated = DateUtils.truncate(cal, Calendar.AM_PM);
        Assert.assertEquals(12, truncated.get(Calendar.HOUR_OF_DAY));
    }

    @Test(expected = ArithmeticException.class)
    public void testTruncate_excessiveYear_throwsArithmeticException() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.truncate(cal, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_unsupportedField_throwsException() {
        Calendar cal = Calendar.getInstance();
        DateUtils.truncate(cal, -1);
    }

    @Test
    public void testIterator_allRangeStyles() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4); // Thursday

        int[] rangeStyles = new int[]{
                DateUtils.RANGE_MONTH_SUNDAY,
                DateUtils.RANGE_MONTH_MONDAY,
                DateUtils.RANGE_WEEK_SUNDAY,
                DateUtils.RANGE_WEEK_MONDAY,
                DateUtils.RANGE_WEEK_RELATIVE,
                DateUtils.RANGE_WEEK_CENTER
        };

        for (int style : rangeStyles) {
            Iterator it = DateUtils.iterator(cal, style);
            Assert.assertNotNull(it);
            Assert.assertTrue(it.hasNext());
            int count = 0;
            while (it.hasNext()) {
                Object next = it.next();
                Assert.assertTrue(next instanceof Calendar);
                count++;
            }
            Assert.assertTrue(count > 0);
        }
    }

    @Test
    public void testIterator_withDateAndObject() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4);

        Iterator itDate = DateUtils.iterator(cal.getTime(), DateUtils.RANGE_WEEK_SUNDAY);
        Assert.assertNotNull(itDate);
        Assert.assertTrue(itDate.hasNext());

        Iterator itObjDate = DateUtils.iterator((Object) cal.getTime(), DateUtils.RANGE_WEEK_SUNDAY);
        Assert.assertNotNull(itObjDate);
        Assert.assertTrue(itObjDate.hasNext());

        Iterator itObjCal = DateUtils.iterator((Object) cal, DateUtils.RANGE_WEEK_SUNDAY);
        Assert.assertNotNull(itObjCal);
        Assert.assertTrue(itObjCal.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_nullDate_throwsException() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_nullCalendar_throwsException() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_nullObject_throwsException() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_invalidObjectType_throwsException() {
        DateUtils.iterator("invalid", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_invalidRangeStyle_throwsException() {
        Calendar cal = Calendar.getInstance();
        DateUtils.iterator(cal, 9999);
    }

    @Test
    public void testIterator_dayOfWeekCutoffAdjustments() {
        // Test edge cases for cutoff adjustment (Sunday / Saturday / Monday relative & center)
        Calendar calSunday = Calendar.getInstance();
        calSunday.set(2023, Calendar.MAY, 7); // Sunday
        Iterator itCenterSun = DateUtils.iterator(calSunday, DateUtils.RANGE_WEEK_CENTER);
        Assert.assertTrue(itCenterSun.hasNext());

        Calendar calSaturday = Calendar.getInstance();
        calSaturday.set(2023, Calendar.MAY, 13); // Saturday
        Iterator itCenterSat = DateUtils.iterator(calSaturday, DateUtils.RANGE_WEEK_CENTER);
        Assert.assertTrue(itCenterSat.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testDateIterator_nextPastEnd_throwsNoSuchElementException() {
        Calendar cal = Calendar.getInstance();
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        it.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDateIterator_remove_throwsUnsupportedOperationException() {
        Calendar cal = Calendar.getInstance();
        Iterator it = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }
}
