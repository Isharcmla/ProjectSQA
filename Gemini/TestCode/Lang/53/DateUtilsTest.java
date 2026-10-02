package org.apache.commons.lang.time;

import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class DateUtilsTest {

    private DateFormat dateFormat;
    private Date date1;
    private Date date2;
    private Calendar cal1;
    private Calendar cal2;

    @Before
    public void setUp() throws Exception {
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        date1 = dateFormat.parse("2004/02/12 11:10:05.000");
        date2 = dateFormat.parse("2004/02/12 11:10:05.001");
        cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2 = Calendar.getInstance();
        cal2.setTime(date2);
    }

    @Test
    public void testConstructor() {
        assertNotNull(new DateUtils());
    }

    @Test
    public void testConstants() {
        assertEquals(TimeZone.getTimeZone("GMT"), DateUtils.UTC_TIME_ZONE);
        assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
        assertEquals(60000L, DateUtils.MILLIS_PER_MINUTE);
        assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
        assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);
        assertEquals(1001, DateUtils.SEMI_MONTH);
        assertEquals(1, DateUtils.RANGE_WEEK_SUNDAY);
        assertEquals(2, DateUtils.RANGE_WEEK_MONDAY);
        assertEquals(3, DateUtils.RANGE_WEEK_RELATIVE);
        assertEquals(4, DateUtils.RANGE_WEEK_CENTER);
        assertEquals(5, DateUtils.RANGE_MONTH_SUNDAY);
        assertEquals(6, DateUtils.RANGE_MONTH_MONDAY);
        assertEquals(1000, DateUtils.MILLIS_IN_SECOND);
        assertEquals(60000, DateUtils.MILLIS_IN_MINUTE);
        assertEquals(3600000, DateUtils.MILLIS_IN_HOUR);
        assertEquals(86400000, DateUtils.MILLIS_IN_DAY);
    }

    @Test
    public void testIsSameDay_Date() {
        assertTrue(DateUtils.isSameDay(date1, date2));

        Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.add(Calendar.DAY_OF_MONTH, 1);
        assertFalse(DateUtils.isSameDay(date1, c.getTime()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate1() {
        DateUtils.isSameDay((Date) null, date2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate2() {
        DateUtils.isSameDay(date1, (Date) null);
    }

    @Test
    public void testIsSameDay_Calendar() {
        assertTrue(DateUtils.isSameDay(cal1, cal2));

        Calendar c = (Calendar) cal1.clone();
        c.add(Calendar.DAY_OF_YEAR, 1);
        assertFalse(DateUtils.isSameDay(cal1, c));

        c = (Calendar) cal1.clone();
        c.add(Calendar.YEAR, 1);
        assertFalse(DateUtils.isSameDay(cal1, c));

        c = (Calendar) cal1.clone();
        c.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameDay(cal1, c));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullCal1() {
        DateUtils.isSameDay((Calendar) null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullCal2() {
        DateUtils.isSameDay(cal1, (Calendar) null);
    }

    @Test
    public void testIsSameInstant_Date() {
        Date d1 = new Date(1000L);
        Date d2 = new Date(1000L);
        Date d3 = new Date(2000L);
        assertTrue(DateUtils.isSameInstant(d1, d2));
        assertFalse(DateUtils.isSameInstant(d1, d3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_NullDate1() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_NullDate2() {
        DateUtils.isSameInstant(new Date(), (Date) null);
    }

    @Test
    public void testIsSameInstant_Calendar() {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(1000L);
        Calendar c3 = Calendar.getInstance();
        c3.setTimeInMillis(2000L);
        assertTrue(DateUtils.isSameInstant(c1, c2));
        assertFalse(DateUtils.isSameInstant(c1, c3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_NullCal1() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_NullCal2() {
        DateUtils.isSameInstant(Calendar.getInstance(), (Calendar) null);
    }

    @Test
    public void testIsSameLocalTime_Calendar() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = (Calendar) c1.clone();
        assertTrue(DateUtils.isSameLocalTime(c1, c2));

        Calendar cDiffMs = (Calendar) c1.clone();
        cDiffMs.add(Calendar.MILLISECOND, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, cDiffMs));

        Calendar cDiffSec = (Calendar) c1.clone();
        cDiffSec.add(Calendar.SECOND, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, cDiffSec));

        Calendar cDiffMin = (Calendar) c1.clone();
        cDiffMin.add(Calendar.MINUTE, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, cDiffMin));

        Calendar cDiffHour = (Calendar) c1.clone();
        cDiffHour.add(Calendar.HOUR, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, cDiffHour));

        Calendar cDiffDay = (Calendar) c1.clone();
        cDiffDay.add(Calendar.DAY_OF_YEAR, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, cDiffDay));

        Calendar cDiffYear = (Calendar) c1.clone();
        cDiffYear.add(Calendar.YEAR, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, cDiffYear));

        Calendar cDiffEra = (Calendar) c1.clone();
        cDiffEra.set(Calendar.ERA, GregorianCalendar.BC);
        assertFalse(DateUtils.isSameLocalTime(c1, cDiffEra));

        Calendar customCal = new GregorianCalendar() {
            private static final long serialVersionUID = 1L;
        };
        customCal.setTime(c1.getTime());
        assertFalse(DateUtils.isSameLocalTime(c1, customCal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Calendar_NullCal1() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Calendar_NullCal2() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }

    @Test
    public void testParseDate() throws ParseException {
        String[] parsers = new String[]{"yyyy-MM-dd", "yyyy/MM/dd HH:mm:ss"};
        Date parsed1 = DateUtils.parseDate("2004-02-12", parsers);
        assertNotNull(parsed1);

        Date parsed2 = DateUtils.parseDate("2004/02/12 11:10:05", parsers);
        assertNotNull(parsed2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullStr() throws ParseException {
        DateUtils.parseDate(null, new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullParsers() throws ParseException {
        DateUtils.parseDate("2004-02-12", null);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_NoMatch() throws ParseException {
        DateUtils.parseDate("2004-02-12", new String[]{"HH:mm:ss", "yyyy/MM/dd"});
    }

    @Test(expected = ParseException.class)
    public void testParseDate_PartialMatch() throws ParseException {
        DateUtils.parseDate("2004-02-12 EXTRA", new String[]{"yyyy-MM-dd"});
    }

    @Test
    public void testAddYears() {
        Date result = DateUtils.addYears(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(2005, c.get(Calendar.YEAR));
    }

    @Test
    public void testAddMonths() {
        Date result = DateUtils.addMonths(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(Calendar.MARCH, c.get(Calendar.MONTH));
    }

    @Test
    public void testAddWeeks() {
        Date result = DateUtils.addWeeks(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(19, c.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddDays() {
        Date result = DateUtils.addDays(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(13, c.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddHours() {
        Date result = DateUtils.addHours(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes() {
        Date result = DateUtils.addMinutes(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(11, c.get(Calendar.MINUTE));
    }

    @Test
    public void testAddSeconds() {
        Date result = DateUtils.addSeconds(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(6, c.get(Calendar.SECOND));
    }

    @Test
    public void testAddMilliseconds() {
        Date result = DateUtils.addMilliseconds(date1, 1);
        Calendar c = Calendar.getInstance();
        c.setTime(result);
        assertEquals(1, c.get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    @Test
    public void testRound_Date() throws ParseException {
        Date d = dateFormat.parse("2004/02/12 11:10:05.500");
        Date rounded = DateUtils.round(d, Calendar.SECOND);
        assertEquals(dateFormat.parse("2004/02/12 11:10:06.000"), rounded);

        Date d2 = dateFormat.parse("2004/02/12 11:10:05.499");
        Date rounded2 = DateUtils.round(d2, Calendar.SECOND);
        assertEquals(dateFormat.parse("2004/02/12 11:10:05.000"), rounded2);

        Date d3 = dateFormat.parse("2004/02/12 11:10:35.000");
        Date rounded3 = DateUtils.round(d3, Calendar.MINUTE);
        assertEquals(dateFormat.parse("2004/02/12 11:11:00.000"), rounded3);

        Date d4 = dateFormat.parse("2004/02/12 11:35:00.000");
        Date rounded4 = DateUtils.round(d4, Calendar.HOUR);
        assertEquals(dateFormat.parse("2004/02/12 12:00:00.000"), rounded4);

        Date d5 = dateFormat.parse("2004/02/12 11:10:05.000");
        Date rounded5 = DateUtils.round(d5, Calendar.MILLISECOND);
        assertEquals(d5, rounded5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Date_Null() {
        DateUtils.round((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Calendar_Null() {
        DateUtils.round((Calendar) null, Calendar.HOUR);
    }

    @Test
    public void testRound_Object() {
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        Date res1 = DateUtils.round((Object) d, Calendar.DAY_OF_MONTH);
        Date res2 = DateUtils.round((Object) c, Calendar.DAY_OF_MONTH);
        assertEquals(res1, res2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Object_Null() {
        DateUtils.round((Object) null, Calendar.HOUR);
    }

    @Test(expected = ClassCastException.class)
    public void testRound_Object_InvalidType() {
        DateUtils.round("Not a date", Calendar.HOUR);
    }

    @Test
    public void testTruncate_Date() throws ParseException {
        Date d = dateFormat.parse("2004/02/12 11:10:35.500");
        Date truncated = DateUtils.truncate(d, Calendar.MINUTE);
        assertEquals(dateFormat.parse("2004/02/12 11:10:00.000"), truncated);

        Date truncatedSec = DateUtils.truncate(d, Calendar.SECOND);
        assertEquals(dateFormat.parse("2004/02/12 11:10:35.000"), truncatedSec);

        Date truncatedMs = DateUtils.truncate(d, Calendar.MILLISECOND);
        assertEquals(d, truncatedMs);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Date_Null() {
        DateUtils.truncate((Date) null, Calendar.HOUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Calendar_Null() {
        DateUtils.truncate((Calendar) null, Calendar.HOUR);
    }

    @Test
    public void testTruncate_Object() {
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        Date res1 = DateUtils.truncate((Object) d, Calendar.DAY_OF_MONTH);
        Date res2 = DateUtils.truncate((Object) c, Calendar.DAY_OF_MONTH);
        assertEquals(res1, res2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Object_Null() {
        DateUtils.truncate((Object) null, Calendar.HOUR);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncate_Object_InvalidType() {
        DateUtils.truncate("Not a date", Calendar.HOUR);
    }

    @Test(expected = ArithmeticException.class)
    public void testModify_YearTooLarge() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 280000001);
        DateUtils.round(c, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModify_UnsupportedField() {
        Calendar c = Calendar.getInstance();
        DateUtils.round(c, -999);
    }

    @Test
    public void testRoundAndTruncate_SemiMonth() throws ParseException {
        Date d1 = dateFormat.parse("2004/02/01 00:00:00.000");
        assertEquals(dateFormat.parse("2004/02/01 00:00:00.000"), DateUtils.truncate(d1, DateUtils.SEMI_MONTH));
        assertEquals(dateFormat.parse("2004/02/01 00:00:00.000"), DateUtils.round(d1, DateUtils.SEMI_MONTH));

        Date d9 = dateFormat.parse("2004/02/09 00:00:00.000");
        assertEquals(dateFormat.parse("2004/02/16 00:00:00.000"), DateUtils.round(d9, DateUtils.SEMI_MONTH));

        Date d16 = dateFormat.parse("2004/02/16 00:00:00.000");
        assertEquals(dateFormat.parse("2004/02/16 00:00:00.000"), DateUtils.truncate(d16, DateUtils.SEMI_MONTH));

        Date d24 = dateFormat.parse("2004/02/24 00:00:00.000");
        assertEquals(dateFormat.parse("2004/03/01 00:00:00.000"), DateUtils.round(d24, DateUtils.SEMI_MONTH));
    }

    @Test
    public void testRoundAndTruncate_AmPm() throws ParseException {
        Date amEarly = dateFormat.parse("2004/02/12 03:00:00.000");
        assertEquals(dateFormat.parse("2004/02/12 00:00:00.000"), DateUtils.round(amEarly, Calendar.AM_PM));

        Date amLate = dateFormat.parse("2004/02/12 08:00:00.000");
        assertEquals(dateFormat.parse("2004/02/12 12:00:00.000"), DateUtils.round(amLate, Calendar.AM_PM));

        Date pmEarly = dateFormat.parse("2004/02/12 15:00:00.000");
        assertEquals(dateFormat.parse("2004/02/12 12:00:00.000"), DateUtils.round(pmEarly, Calendar.AM_PM));

        Date pmLate = dateFormat.parse("2004/02/12 20:00:00.000");
        assertEquals(dateFormat.parse("2004/02/13 00:00:00.000"), DateUtils.round(pmLate, Calendar.AM_PM));
    }

    @Test
    public void testRoundAndTruncate_VariousFields() throws ParseException {
        Date d = dateFormat.parse("2004/02/12 11:10:05.000");
        assertEquals(dateFormat.parse("2004/02/12 00:00:00.000"), DateUtils.truncate(d, Calendar.DATE));
        assertEquals(dateFormat.parse("2004/02/01 00:00:00.000"), DateUtils.truncate(d, Calendar.MONTH));
        assertEquals(dateFormat.parse("2004/01/01 00:00:00.000"), DateUtils.truncate(d, Calendar.YEAR));
        assertEquals(dateFormat.parse("2004/01/01 00:00:00.000"), DateUtils.truncate(d, Calendar.ERA));

        Date roundMonth = dateFormat.parse("2004/02/20 00:00:00.000");
        assertEquals(dateFormat.parse("2004/03/01 00:00:00.000"), DateUtils.round(roundMonth, Calendar.MONTH));

        Date roundYear = dateFormat.parse("2004/08/20 00:00:00.000");
        assertEquals(dateFormat.parse("2005/01/01 00:00:00.000"), DateUtils.round(roundYear, Calendar.YEAR));
    }

    @Test
    public void testIterator_Date() {
        Iterator it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Date_Null() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test
    public void testIterator_Object() {
        Iterator itDate = DateUtils.iterator((Object) date1, DateUtils.RANGE_WEEK_SUNDAY);
        Iterator itCal = DateUtils.iterator((Object) cal1, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(itDate);
        assertNotNull(itCal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Object_Null() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_Object_InvalidType() {
        DateUtils.iterator("invalid", DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Calendar_Null() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_InvalidRangeStyle() {
        DateUtils.iterator(cal1, -1);
    }

    @Test
    public void testIterator_AllStyles() {
        int[] styles = new int[]{
                DateUtils.RANGE_MONTH_SUNDAY,
                DateUtils.RANGE_MONTH_MONDAY,
                DateUtils.RANGE_WEEK_SUNDAY,
                DateUtils.RANGE_WEEK_MONDAY,
                DateUtils.RANGE_WEEK_RELATIVE,
                DateUtils.RANGE_WEEK_CENTER
        };

        for (int style : styles) {
            Iterator it = DateUtils.iterator(cal1, style);
            int count = 0;
            while (it.hasNext()) {
                Object next = it.next();
                assertTrue(next instanceof Calendar);
                count++;
            }
            assertTrue(count >= 7);
        }
    }

    @Test
    public void testIterator_EdgeCutoffs() {
        Calendar calSunday = Calendar.getInstance();
        calSunday.set(2023, Calendar.JANUARY, 1); // Sunday

        Iterator itSunday = DateUtils.iterator(calSunday, DateUtils.RANGE_WEEK_CENTER);
        assertNotNull(itSunday.next());

        Calendar calSaturday = Calendar.getInstance();
        calSaturday.set(2023, Calendar.JANUARY, 7); // Saturday
        Iterator itSat = DateUtils.iterator(calSaturday, DateUtils.RANGE_WEEK_CENTER);
        assertNotNull(itSat.next());
    }

    @Test(expected = NoSuchElementException.class)
    public void testDateIterator_NoSuchElementException() {
        Iterator it = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        it.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDateIterator_Remove() {
        Iterator it = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }
}
