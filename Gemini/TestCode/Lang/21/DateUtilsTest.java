package org.apache.commons.lang3.time;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

public class DateUtilsTest {

    private SimpleDateFormat dateParser;
    private Date baseDate;
    private Calendar baseCal;

    @Before
    public void setUp() throws Exception {
        dateParser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        baseDate = dateParser.parse("2023-06-15 14:30:45.500");
        baseCal = Calendar.getInstance();
        baseCal.setTime(baseDate);
    }

    @Test
    public void testConstructor() {
        DateUtils utils = new DateUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testIsSameDay_Date_success() throws Exception {
        Date date1 = dateParser.parse("2023-06-15 01:00:00.000");
        Date date2 = dateParser.parse("2023-06-15 23:59:59.999");
        Date date3 = dateParser.parse("2023-06-16 01:00:00.000");

        Assert.assertTrue(DateUtils.isSameDay(date1, date2));
        Assert.assertFalse(DateUtils.isSameDay(date1, date3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_nullFirst() {
        DateUtils.isSameDay((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_nullSecond() {
        DateUtils.isSameDay(new Date(), (Date) null);
    }

    @Test
    public void testIsSameDay_Calendar_success() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2023, Calendar.JUNE, 15, 10, 0, 0);
        cal2.set(2023, Calendar.JUNE, 15, 22, 0, 0);

        Assert.assertTrue(DateUtils.isSameDay(cal1, cal2));

        cal2.set(2023, Calendar.JUNE, 16, 10, 0, 0);
        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));

        cal2.set(2022, Calendar.JUNE, 15, 10, 0, 0);
        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));

        cal2.set(Calendar.ERA, GregorianCalendar.BC);
        Assert.assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_nullFirst() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_nullSecond() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameInstant_Date_success() {
        Date d1 = new Date(1000L);
        Date d2 = new Date(1000L);
        Date d3 = new Date(2000L);

        Assert.assertTrue(DateUtils.isSameInstant(d1, d2));
        Assert.assertFalse(DateUtils.isSameInstant(d1, d3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_nullFirst() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_nullSecond() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test
    public void testIsSameInstant_Calendar_success() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        c2.setTimeInMillis(1000L);

        Assert.assertTrue(DateUtils.isSameInstant(c1, c2));

        c2.setTimeInMillis(2000L);
        Assert.assertFalse(DateUtils.isSameInstant(c1, c2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_nullFirst() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_nullSecond() {
        DateUtils.isSameInstant(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameLocalTime_Calendar_success() {
        Calendar c1 = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        Calendar c2 = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
        c1.set(2023, Calendar.JUNE, 15, 12, 30, 45);
        c1.set(Calendar.MILLISECOND, 500);
        c2.set(2023, Calendar.JUNE, 15, 12, 30, 45);
        c2.set(Calendar.MILLISECOND, 500);

        Assert.assertTrue(DateUtils.isSameLocalTime(c1, c2));

        c2.set(Calendar.MILLISECOND, 501);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
        c2.set(Calendar.MILLISECOND, 500);

        c2.set(Calendar.SECOND, 46);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
        c2.set(Calendar.SECOND, 45);

        c2.set(Calendar.MINUTE, 31);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
        c2.set(Calendar.MINUTE, 30);

        c2.set(Calendar.HOUR, (c1.get(Calendar.HOUR) + 1) % 12);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
        c2.set(Calendar.HOUR, c1.get(Calendar.HOUR));

        c2.set(Calendar.DAY_OF_YEAR, c1.get(Calendar.DAY_OF_YEAR) + 1);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
        c2.set(Calendar.DAY_OF_YEAR, c1.get(Calendar.DAY_OF_YEAR));

        c2.set(Calendar.YEAR, 2024);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
        c2.set(Calendar.YEAR, 2023);

        c2.set(Calendar.ERA, GregorianCalendar.BC);
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, c2));
        c2.set(Calendar.ERA, GregorianCalendar.AD);

        Calendar customCal = new Calendar(TimeZone.getDefault(), java.util.Locale.getDefault()) {
            @Override
            protected void computeTime() {}
            @Override
            protected void computeFields() {}
            @Override
            public void add(int field, int amount) {}
            @Override
            public void roll(int field, boolean up) {}
            @Override
            public int getMinimum(int field) { return 0; }
            @Override
            public int getMaximum(int field) { return 0; }
            @Override
            public int getGreatestMinimum(int field) { return 0; }
            @Override
            public int getLeastMaximum(int field) { return 0; }
        };
        Assert.assertFalse(DateUtils.isSameLocalTime(c1, customCal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Calendar_nullFirst() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Calendar_nullSecond() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }

    @Test
    public void testParseDate_success() throws Exception {
        String[] patterns = new String[]{"yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ssZZ"};
        Date parsed = DateUtils.parseDate("2023-06-15 12:00:00", patterns);
        Assert.assertNotNull(parsed);

        Date parsedIso = DateUtils.parseDate("2023-06-15T12:00:00+00:00", patterns);
        Assert.assertNotNull(parsedIso);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_notFound() throws Exception {
        DateUtils.parseDate("2023-06-15", "yyyy/MM/dd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_nullString() throws Exception {
        DateUtils.parseDate(null, "yyyy-MM-dd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_nullPatterns() throws Exception {
        DateUtils.parseDate("2023-06-15", (String[]) null);
    }

    @Test
    public void testParseDateStrictly_success() throws Exception {
        Date parsed = DateUtils.parseDateStrictly("2023-06-15", "yyyy-MM-dd");
        Assert.assertNotNull(parsed);
    }

    @Test(expected = ParseException.class)
    public void testParseDateStrictly_lenientFailure() throws Exception {
        DateUtils.parseDateStrictly("2023-02-30", "yyyy-MM-dd");
    }

    @Test
    public void testAddDateMethods() {
        Date base = new Date(0L);

        Date addedYears = DateUtils.addYears(base, 2);
        Calendar cal = Calendar.getInstance();
        cal.setTime(addedYears);
        Assert.assertEquals(1972, cal.get(Calendar.YEAR));

        Date addedMonths = DateUtils.addMonths(base, 5);
        cal.setTime(addedMonths);
        Assert.assertEquals(Calendar.JUNE, cal.get(Calendar.MONTH));

        Date addedWeeks = DateUtils.addWeeks(base, 2);
        cal.setTime(addedWeeks);
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));

        Date addedDays = DateUtils.addDays(base, 10);
        cal.setTime(addedDays);
        Assert.assertEquals(11, cal.get(Calendar.DAY_OF_MONTH));

        Date addedHours = DateUtils.addHours(base, 5);
        Assert.assertEquals(5 * 3600000L, addedHours.getTime() - base.getTime());

        Date addedMinutes = DateUtils.addMinutes(base, 30);
        Assert.assertEquals(30 * 60000L, addedMinutes.getTime() - base.getTime());

        Date addedSeconds = DateUtils.addSeconds(base, 45);
        Assert.assertEquals(45 * 1000L, addedSeconds.getTime() - base.getTime());

        Date addedMillis = DateUtils.addMilliseconds(base, 500);
        Assert.assertEquals(500L, addedMillis.getTime() - base.getTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddYears_nullDate() {
        DateUtils.addYears(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMonths_nullDate() {
        DateUtils.addMonths(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddWeeks_nullDate() {
        DateUtils.addWeeks(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDays_nullDate() {
        DateUtils.addDays(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddHours_nullDate() {
        DateUtils.addHours(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMinutes_nullDate() {
        DateUtils.addMinutes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddSeconds_nullDate() {
        DateUtils.addSeconds(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMilliseconds_nullDate() {
        DateUtils.addMilliseconds(null, 1);
    }

    @Test
    public void testSetDateMethods() {
        Date base = new Date();

        Date setY = DateUtils.setYears(base, 2025);
        Assert.assertEquals(2025, DateUtils.toCalendar(setY).get(Calendar.YEAR));

        Date setM = DateUtils.setMonths(base, Calendar.DECEMBER);
        Assert.assertEquals(Calendar.DECEMBER, DateUtils.toCalendar(setM).get(Calendar.MONTH));

        Date setD = DateUtils.setDays(base, 10);
        Assert.assertEquals(10, DateUtils.toCalendar(setD).get(Calendar.DAY_OF_MONTH));

        Date setH = DateUtils.setHours(base, 20);
        Assert.assertEquals(20, DateUtils.toCalendar(setH).get(Calendar.HOUR_OF_DAY));

        Date setMin = DateUtils.setMinutes(base, 45);
        Assert.assertEquals(45, DateUtils.toCalendar(setMin).get(Calendar.MINUTE));

        Date setSec = DateUtils.setSeconds(base, 55);
        Assert.assertEquals(55, DateUtils.toCalendar(setSec).get(Calendar.SECOND));

        Date setMs = DateUtils.setMilliseconds(base, 789);
        Assert.assertEquals(789, DateUtils.toCalendar(setMs).get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetYears_nullDate() {
        DateUtils.setYears(null, 2020);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMonths_nullDate() {
        DateUtils.setMonths(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDays_nullDate() {
        DateUtils.setDays(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHours_nullDate() {
        DateUtils.setHours(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMinutes_nullDate() {
        DateUtils.setMinutes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeconds_nullDate() {
        DateUtils.setSeconds(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMilliseconds_nullDate() {
        DateUtils.setMilliseconds(null, 1);
    }

    @Test
    public void testToCalendar_success() {
        Date d = new Date();
        Calendar c = DateUtils.toCalendar(d);
        Assert.assertEquals(d.getTime(), c.getTimeInMillis());
    }

    @Test(expected = NullPointerException.class)
    public void testToCalendar_nullDate() {
        DateUtils.toCalendar(null);
    }

    @Test
    public void testRound_Date_Calendar_Object() throws Exception {
        Date date = dateParser.parse("2023-06-15 14:45:45.600");

        Date roundedDate = DateUtils.round(date, Calendar.HOUR);
        Calendar cal = Calendar.getInstance();
        cal.setTime(roundedDate);
        Assert.assertEquals(15, cal.get(Calendar.HOUR_OF_DAY));

        Calendar calIn = Calendar.getInstance();
        calIn.setTime(date);
        Calendar roundedCal = DateUtils.round(calIn, Calendar.MINUTE);
        Assert.assertEquals(46, roundedCal.get(Calendar.MINUTE));

        Date roundedObjDate = (Date) DateUtils.round((Object) date, Calendar.DATE);
        Calendar calObj = Calendar.getInstance();
        calObj.setTime(roundedObjDate);
        Assert.assertEquals(16, calObj.get(Calendar.DATE));

        Date roundedObjCal = (Date) DateUtils.round((Object) calIn, Calendar.DATE);
        Assert.assertNotNull(roundedObjCal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Date_null() {
        DateUtils.round((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Calendar_null() {
        DateUtils.round((Calendar) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Object_null() {
        DateUtils.round((Object) null, Calendar.HOUR);
    }

    @Test(expected = ClassCastException.class)
    public void testRound_Object_invalidType() {
        DateUtils.round("invalid", Calendar.HOUR);
    }

    @Test
    public void testTruncate_Date_Calendar_Object() throws Exception {
        Date date = dateParser.parse("2023-06-15 14:45:45.600");

        Date truncatedDate = DateUtils.truncate(date, Calendar.HOUR);
        Calendar cal = Calendar.getInstance();
        cal.setTime(truncatedDate);
        Assert.assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(0, cal.get(Calendar.MINUTE));
        Assert.assertEquals(0, cal.get(Calendar.SECOND));

        Calendar calIn = Calendar.getInstance();
        calIn.setTime(date);
        Calendar truncatedCal = DateUtils.truncate(calIn, Calendar.MINUTE);
        Assert.assertEquals(45, truncatedCal.get(Calendar.MINUTE));
        Assert.assertEquals(0, truncatedCal.get(Calendar.SECOND));

        Date truncObjDate = DateUtils.truncate((Object) date, Calendar.MONTH);
        cal.setTime(truncObjDate);
        Assert.assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));

        Date truncObjCal = DateUtils.truncate((Object) calIn, Calendar.MONTH);
        Assert.assertNotNull(truncObjCal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Date_null() {
        DateUtils.truncate((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Calendar_null() {
        DateUtils.truncate((Calendar) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Object_null() {
        DateUtils.truncate((Object) null, Calendar.HOUR);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncate_Object_invalidType() {
        DateUtils.truncate("invalid", Calendar.HOUR);
    }

    @Test
    public void testCeiling_Date_Calendar_Object() throws Exception {
        Date date = dateParser.parse("2023-06-15 14:15:15.200");

        Date ceiledDate = DateUtils.ceiling(date, Calendar.HOUR);
        Calendar cal = Calendar.getInstance();
        cal.setTime(ceiledDate);
        Assert.assertEquals(15, cal.get(Calendar.HOUR_OF_DAY));

        Calendar calIn = Calendar.getInstance();
        calIn.setTime(date);
        Calendar ceiledCal = DateUtils.ceiling(calIn, Calendar.MINUTE);
        Assert.assertEquals(16, ceiledCal.get(Calendar.MINUTE));

        Date ceilObjDate = DateUtils.ceiling((Object) date, Calendar.MONTH);
        cal.setTime(ceilObjDate);
        Assert.assertEquals(Calendar.JULY, cal.get(Calendar.MONTH));

        Date ceilObjCal = DateUtils.ceiling((Object) calIn, Calendar.MONTH);
        Assert.assertNotNull(ceilObjCal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCeiling_Date_null() {
        DateUtils.ceiling((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCeiling_Calendar_null() {
        DateUtils.ceiling((Calendar) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCeiling_Object_null() {
        DateUtils.ceiling((Object) null, Calendar.HOUR);
    }

    @Test(expected = ClassCastException.class)
    public void testCeiling_Object_invalidType() {
        DateUtils.ceiling("invalid", Calendar.HOUR);
    }

    @Test
    public void testModifySpecialCases() throws Exception {
        Date date1 = dateParser.parse("2023-06-01 00:00:00.000");
        Date roundedSemi1 = DateUtils.round(date1, DateUtils.SEMI_MONTH);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(roundedSemi1);
        Assert.assertEquals(1, c1.get(Calendar.DAY_OF_MONTH));

        Date date16 = dateParser.parse("2023-06-16 00:00:00.000");
        Date roundedSemi16 = DateUtils.round(date16, DateUtils.SEMI_MONTH);
        Calendar c16 = Calendar.getInstance();
        c16.setTime(roundedSemi16);
        Assert.assertEquals(16, c16.get(Calendar.DAY_OF_MONTH));

        Date dateCeilSemi1 = DateUtils.ceiling(date1, DateUtils.SEMI_MONTH);
        c1.setTime(dateCeilSemi1);
        Assert.assertEquals(16, c1.get(Calendar.DAY_OF_MONTH));

        Date dateCeilSemi2 = dateParser.parse("2023-06-02 00:00:00.000");
        Date dateCeilSemi2Res = DateUtils.ceiling(dateCeilSemi2, DateUtils.SEMI_MONTH);
        c1.setTime(dateCeilSemi2Res);
        Assert.assertEquals(16, c1.get(Calendar.DAY_OF_MONTH));

        Date dateCeilSemi20 = dateParser.parse("2023-06-20 00:00:00.000");
        Date dateCeilSemi20Res = DateUtils.ceiling(dateCeilSemi20, DateUtils.SEMI_MONTH);
        c1.setTime(dateCeilSemi20Res);
        Assert.assertEquals(Calendar.JULY, c1.get(Calendar.MONTH));
        Assert.assertEquals(1, c1.get(Calendar.DAY_OF_MONTH));

        Date dateAmPm0 = dateParser.parse("2023-06-15 00:00:00.000");
        Date ceilAmPm0 = DateUtils.ceiling(dateAmPm0, Calendar.AM_PM);
        c1.setTime(ceilAmPm0);
        Assert.assertEquals(12, c1.get(Calendar.HOUR_OF_DAY));

        Date dateAmPm1 = dateParser.parse("2023-06-15 01:00:00.000");
        Date ceilAmPm1 = DateUtils.ceiling(dateAmPm1, Calendar.AM_PM);
        c1.setTime(ceilAmPm1);
        Assert.assertEquals(12, c1.get(Calendar.HOUR_OF_DAY));

        Date dateAmPm13 = dateParser.parse("2023-06-15 13:00:00.000");
        Date ceilAmPm13 = DateUtils.ceiling(dateAmPm13, Calendar.AM_PM);
        c1.setTime(ceilAmPm13);
        Assert.assertEquals(16, c1.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(0, c1.get(Calendar.HOUR_OF_DAY));

        Date roundAmPm0 = DateUtils.round(dateAmPm0, Calendar.AM_PM);
        c1.setTime(roundAmPm0);
        Assert.assertEquals(0, c1.get(Calendar.HOUR_OF_DAY));

        Date roundAmPm7 = dateParser.parse("2023-06-15 07:00:00.000");
        Date roundAmPm7Res = DateUtils.round(roundAmPm7, Calendar.AM_PM);
        c1.setTime(roundAmPm7Res);
        Assert.assertEquals(12, c1.get(Calendar.HOUR_OF_DAY));

        Date roundAmPm19 = dateParser.parse("2023-06-15 19:00:00.000");
        Date roundAmPm19Res = DateUtils.round(roundAmPm19, Calendar.AM_PM);
        c1.setTime(roundAmPm19Res);
        Assert.assertEquals(16, c1.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(0, c1.get(Calendar.HOUR_OF_DAY));

        Date msDate = DateUtils.truncate(date1, Calendar.MILLISECOND);
        Assert.assertEquals(date1, msDate);
    }

    @Test(expected = ArithmeticException.class)
    public void testModify_largeYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.truncate(cal, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModify_unsupportedField() {
        DateUtils.truncate(new Date(), Calendar.ZONE_OFFSET);
    }

    @Test
    public void testIterator_allRanges() {
        int[] styles = {
                DateUtils.RANGE_MONTH_SUNDAY,
                DateUtils.RANGE_MONTH_MONDAY,
                DateUtils.RANGE_WEEK_SUNDAY,
                DateUtils.RANGE_WEEK_MONDAY,
                DateUtils.RANGE_WEEK_RELATIVE,
                DateUtils.RANGE_WEEK_CENTER
        };

        for (int style : styles) {
            Iterator<Calendar> itDate = DateUtils.iterator(baseDate, style);
            Assert.assertTrue(itDate.hasNext());
            Calendar first = itDate.next();
            Assert.assertNotNull(first);

            Iterator<Calendar> itCal = DateUtils.iterator(baseCal, style);
            Assert.assertTrue(itCal.hasNext());

            Iterator<?> itObj = DateUtils.iterator((Object) baseCal, style);
            Assert.assertTrue(itObj.hasNext());

            Iterator<?> itObjDate = DateUtils.iterator((Object) baseDate, style);
            Assert.assertTrue(itObjDate.hasNext());
        }
    }

    @Test
    public void testDateIterator_exhaustAndExceptions() {
        Iterator<Calendar> it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_SUNDAY);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        Assert.assertEquals(7, count);

        try {
            it.next();
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {}

        try {
            it.remove();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {}
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Date_null() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Calendar_null() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Object_null() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_Object_invalidType() {
        DateUtils.iterator("invalid", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_invalidRangeStyle() {
        DateUtils.iterator(baseCal, -999);
    }

    @Test
    public void testGetFragments_Date() throws Exception {
        Date date = dateParser.parse("2023-01-05 07:15:10.538");

        Assert.assertEquals(538L, DateUtils.getFragmentInMilliseconds(date, Calendar.SECOND));
        Assert.assertEquals(10L, DateUtils.getFragmentInSeconds(date, Calendar.MINUTE));
        Assert.assertEquals(15L, DateUtils.getFragmentInMinutes(date, Calendar.HOUR_OF_DAY));
        Assert.assertEquals(7L, DateUtils.getFragmentInHours(date, Calendar.DATE));
        Assert.assertEquals(5L, DateUtils.getFragmentInDays(date, Calendar.MONTH));
        Assert.assertEquals(5L, DateUtils.getFragmentInDays(date, Calendar.YEAR));

        Assert.assertEquals(0L, DateUtils.getFragmentInMilliseconds(date, Calendar.MILLISECOND));
    }

    @Test
    public void testGetFragments_Calendar() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 5, 7, 15, 10);
        cal.set(Calendar.MILLISECOND, 538);

        Assert.assertEquals(538L, DateUtils.getFragmentInMilliseconds(cal, Calendar.SECOND));
        Assert.assertEquals(10538L, DateUtils.getFragmentInMilliseconds(cal, Calendar.MINUTE));
        Assert.assertEquals(10L, DateUtils.getFragmentInSeconds(cal, Calendar.MINUTE));
        Assert.assertEquals(15L, DateUtils.getFragmentInMinutes(cal, Calendar.HOUR_OF_DAY));
        Assert.assertEquals(7L, DateUtils.getFragmentInHours(cal, Calendar.DATE));
        Assert.assertEquals(5L, DateUtils.getFragmentInDays(cal, Calendar.MONTH));
        Assert.assertEquals(5L, DateUtils.getFragmentInDays(cal, Calendar.YEAR));

        Assert.assertEquals(0L, DateUtils.getFragmentInMilliseconds(cal, Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInMilliseconds_Date_null() {
        DateUtils.getFragmentInMilliseconds((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInSeconds_Date_null() {
        DateUtils.getFragmentInSeconds((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInMinutes_Date_null() {
        DateUtils.getFragmentInMinutes((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInHours_Date_null() {
        DateUtils.getFragmentInHours((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInDays_Date_null() {
        DateUtils.getFragmentInDays((Date) null, Calendar.MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInMilliseconds_Calendar_null() {
        DateUtils.getFragmentInMilliseconds((Calendar) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInSeconds_Calendar_null() {
        DateUtils.getFragmentInSeconds((Calendar) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInMinutes_Calendar_null() {
        DateUtils.getFragmentInMinutes((Calendar) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInHours_Calendar_null() {
        DateUtils.getFragmentInHours((Calendar) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInDays_Calendar_null() {
        DateUtils.getFragmentInDays((Calendar) null, Calendar.MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragment_invalidFragment() {
        DateUtils.getFragmentInMilliseconds(baseCal, Calendar.ZONE_OFFSET);
    }

    @Test
    public void testTruncatedEquals_Date() throws Exception {
        Date d1 = dateParser.parse("2023-06-15 14:30:10.000");
        Date d2 = dateParser.parse("2023-06-15 14:30:50.000");
        Date d3 = dateParser.parse("2023-06-15 15:30:10.000");

        Assert.assertTrue(DateUtils.truncatedEquals(d1, d2, Calendar.MINUTE));
        Assert.assertFalse(DateUtils.truncatedEquals(d1, d3, Calendar.MINUTE));
    }

    @Test
    public void testTruncatedEquals_Calendar() throws Exception {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(dateParser.parse("2023-06-15 14:30:10.000"));
        c2.setTime(dateParser.parse("2023-06-15 14:30:50.000"));

        Assert.assertTrue(DateUtils.truncatedEquals(c1, c2, Calendar.MINUTE));

        c2.setTime(dateParser.parse("2023-06-15 15:30:10.000"));
        Assert.assertFalse(DateUtils.truncatedEquals(c1, c2, Calendar.MINUTE));
    }

    @Test
    public void testTruncatedCompareTo_Date() throws Exception {
        Date d1 = dateParser.parse("2023-06-15 14:30:10.000");
        Date d2 = dateParser.parse("2023-06-15 14:30:50.000");
        Date d3 = dateParser.parse("2023-06-15 15:30:10.000");

        Assert.assertEquals(0, DateUtils.truncatedCompareTo(d1, d2, Calendar.MINUTE));
        Assert.assertTrue(DateUtils.truncatedCompareTo(d1, d3, Calendar.MINUTE) < 0);
        Assert.assertTrue(DateUtils.truncatedCompareTo(d3, d1, Calendar.MINUTE) > 0);
    }

    @Test
    public void testTruncatedCompareTo_Calendar() throws Exception {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        c1.setTime(dateParser.parse("2023-06-15 14:30:10.000"));
        c2.setTime(dateParser.parse("2023-06-15 14:30:50.000"));
        c3.setTime(dateParser.parse("2023-06-15 15:30:10.000"));

        Assert.assertEquals(0, DateUtils.truncatedCompareTo(c1, c2, Calendar.MINUTE));
        Assert.assertTrue(DateUtils.truncatedCompareTo(c1, c3, Calendar.MINUTE) < 0);
        Assert.assertTrue(DateUtils.truncatedCompareTo(c3, c1, Calendar.MINUTE) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncatedEquals_Date_null() {
        DateUtils.truncatedEquals((Date) null, new Date(), Calendar.DAY_OF_MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncatedEquals_Calendar_null() {
        DateUtils.truncatedEquals((Calendar) null, Calendar.getInstance(), Calendar.DAY_OF_MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncatedCompareTo_Date_null() {
        DateUtils.truncatedCompareTo((Date) null, new Date(), Calendar.DAY_OF_MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncatedCompareTo_Calendar_null() {
        DateUtils.truncatedCompareTo((Calendar) null, Calendar.getInstance(), Calendar.DAY_OF_MONTH);
    }
}
