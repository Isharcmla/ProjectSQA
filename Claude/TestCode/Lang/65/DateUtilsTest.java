import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DateUtilsTest {

    private Calendar baseCal;
    private Date baseDate;

    @Before
    public void setUp() {
        baseCal = Calendar.getInstance();
        baseCal.set(2005, Calendar.JUNE, 15, 13, 45, 30);
        baseCal.set(Calendar.MILLISECOND, 500);
        baseDate = baseCal.getTime();
    }

    // ---------------------- isSameDay(Date, Date) ----------------------

    @Test
    public void testIsSameDay_Date_SameDay_ReturnsTrue() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2005, Calendar.JUNE, 15, 10, 0, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2005, Calendar.JUNE, 15, 23, 59, 0);
        assertTrue(DateUtils.isSameDay(cal1.getTime(), cal2.getTime()));
    }

    @Test
    public void testIsSameDay_Date_DifferentDay_ReturnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2005, Calendar.JUNE, 15, 10, 0, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2005, Calendar.JUNE, 16, 10, 0, 0);
        assertFalse(DateUtils.isSameDay(cal1.getTime(), cal2.getTime()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate1_ThrowsException() {
        DateUtils.isSameDay((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_NullDate2_ThrowsException() {
        DateUtils.isSameDay(new Date(), (Date) null);
    }

    // ---------------------- isSameDay(Calendar, Calendar) ----------------------

    @Test
    public void testIsSameDay_Calendar_SameDay_ReturnsTrue() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2005, Calendar.JUNE, 15, 10, 0, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2005, Calendar.JUNE, 15, 23, 59, 0);
        assertTrue(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void testIsSameDay_Calendar_DifferentYear_ReturnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2005, Calendar.JUNE, 15, 10, 0, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2006, Calendar.JUNE, 15, 10, 0, 0);
        assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullCal1_ThrowsException() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_NullCal2_ThrowsException() {
        DateUtils.isSameDay(Calendar.getInstance(), (Calendar) null);
    }

    // ---------------------- isSameInstant(Date, Date) ----------------------

    @Test
    public void testIsSameInstant_Date_SameInstant_ReturnsTrue() {
        Date d1 = new Date(100000L);
        Date d2 = new Date(100000L);
        assertTrue(DateUtils.isSameInstant(d1, d2));
    }

    @Test
    public void testIsSameInstant_Date_DifferentInstant_ReturnsFalse() {
        Date d1 = new Date(100000L);
        Date d2 = new Date(200000L);
        assertFalse(DateUtils.isSameInstant(d1, d2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null_ThrowsException() {
        DateUtils.isSameInstant((Date) null, (Date) null);
    }

    // ---------------------- isSameInstant(Calendar, Calendar) ----------------------

    @Test
    public void testIsSameInstant_Calendar_SameInstant_ReturnsTrue() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(100000L);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(100000L);
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test
    public void testIsSameInstant_Calendar_DifferentInstant_ReturnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(100000L);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(200000L);
        assertFalse(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_Null_ThrowsException() {
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
    }

    // ---------------------- isSameLocalTime(Calendar, Calendar) ----------------------

    @Test
    public void testIsSameLocalTime_SameLocalTime_ReturnsTrue() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2005, Calendar.JUNE, 15, 10, 20, 30);
        cal1.set(Calendar.MILLISECOND, 0);
        Calendar cal2 = (Calendar) cal1.clone();
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_DifferentLocalTime_ReturnsFalse() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2005, Calendar.JUNE, 15, 10, 20, 30);
        cal1.set(Calendar.MILLISECOND, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2005, Calendar.JUNE, 15, 11, 20, 30);
        cal2.set(Calendar.MILLISECOND, 0);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Null_ThrowsException() {
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
    }

    // ---------------------- parseDate ----------------------

    @Test
    public void testParseDate_ValidPattern_ReturnsDate() throws ParseException {
        String[] patterns = new String[] { "yyyy-MM-dd" };
        Date d = DateUtils.parseDate("2005-06-15", patterns);
        assertNotNull(d);
    }

    @Test
    public void testParseDate_MultiplePatternsSecondMatches_ReturnsDate() throws ParseException {
        String[] patterns = new String[] { "MM/dd/yyyy", "yyyy-MM-dd" };
        Date d = DateUtils.parseDate("2005-06-15", patterns);
        assertNotNull(d);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_NoPatternMatches_ThrowsParseException() throws ParseException {
        String[] patterns = new String[] { "MM/dd/yyyy" };
        DateUtils.parseDate("not-a-date", patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullString_ThrowsException() throws ParseException {
        DateUtils.parseDate(null, new String[] { "yyyy-MM-dd" });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns_ThrowsException() throws ParseException {
        DateUtils.parseDate("2005-06-15", null);
    }

    // ---------------------- addYears / addMonths / addWeeks / addDays / addHours / addMinutes / addSeconds / addMilliseconds ----------------------

    @Test
    public void testAddYears_PositiveAmount_AddsYears() {
        Date result = DateUtils.addYears(baseDate, 1);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2006, cal.get(Calendar.YEAR));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddYears_NullDate_ThrowsException() {
        DateUtils.addYears(null, 1);
    }

    @Test
    public void testAddMonths_NegativeAmount_SubtractsMonths() {
        Date result = DateUtils.addMonths(baseDate, -1);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testAddWeeks_PositiveAmount_AddsWeeks() {
        Date result = DateUtils.addWeeks(baseDate, 1);
        assertTrue(result.getTime() > baseDate.getTime());
    }

    @Test
    public void testAddDays_PositiveAmount_AddsDays() {
        Date result = DateUtils.addDays(baseDate, 1);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(16, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddHours_PositiveAmount_AddsHours() {
        Date result = DateUtils.addHours(baseDate, 1);
        assertTrue(result.getTime() > baseDate.getTime());
    }

    @Test
    public void testAddMinutes_PositiveAmount_AddsMinutes() {
        Date result = DateUtils.addMinutes(baseDate, 1);
        assertTrue(result.getTime() > baseDate.getTime());
    }

    @Test
    public void testAddSeconds_PositiveAmount_AddsSeconds() {
        Date result = DateUtils.addSeconds(baseDate, 1);
        assertTrue(result.getTime() > baseDate.getTime());
    }

    @Test
    public void testAddMilliseconds_PositiveAmount_AddsMillis() {
        Date result = DateUtils.addMilliseconds(baseDate, 1);
        assertEquals(baseDate.getTime() + 1, result.getTime());
    }

    // ---------------------- add ----------------------

    @Test
    public void testAdd_ValidField_ReturnsNewDate() {
        Date result = DateUtils.add(baseDate, Calendar.YEAR, 2);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2007, cal.get(Calendar.YEAR));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate_ThrowsException() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    // ---------------------- round(Date, field) ----------------------

    @Test
    public void testRoundDate_HourField_RoundsUp() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 15, 13, 45, 30);
        cal.set(Calendar.MILLISECOND, 0);
        Date result = DateUtils.round(cal.getTime(), Calendar.HOUR_OF_DAY);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(14, resultCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, resultCal.get(Calendar.MINUTE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundDate_NullDate_ThrowsException() {
        DateUtils.round((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundDate_YearTooLarge_ThrowsArithmeticException() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.round(cal.getTime(), Calendar.HOUR_OF_DAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundDate_UnsupportedField_ThrowsException() {
        DateUtils.round(baseDate, Calendar.ZONE_OFFSET);
    }

    @Test
    public void testRoundDate_SemiMonthDateAt1_RoundsUpTo16() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 1, 13, 45, 30);
        Date result = DateUtils.round(cal.getTime(), DateUtils.SEMI_MONTH);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(16, resultCal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRoundDate_SemiMonthDateAt20_RoundsToNextMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 20, 13, 45, 30);
        Date result = DateUtils.round(cal.getTime(), DateUtils.SEMI_MONTH);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(Calendar.JULY, resultCal.get(Calendar.MONTH));
        assertEquals(1, resultCal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRoundDate_AmPmField_RoundsCorrectly() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 15, 20, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date result = DateUtils.round(cal.getTime(), Calendar.AM_PM);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        // 20:00 -> offset = 8, > 6, rounds up to next day
        assertEquals(16, resultCal.get(Calendar.DAY_OF_MONTH));
    }

    // ---------------------- round(Calendar, field) ----------------------

    @Test
    public void testRoundCalendar_MonthField_RoundsToNearestMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 20, 13, 45, 30);
        Calendar result = DateUtils.round(cal, Calendar.MONTH);
        assertEquals(Calendar.JULY, result.get(Calendar.MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundCalendar_NullCalendar_ThrowsException() {
        DateUtils.round((Calendar) null, Calendar.HOUR_OF_DAY);
    }

    // ---------------------- round(Object, field) ----------------------

    @Test
    public void testRoundObject_DateInstance_ReturnsRoundedDate() {
        Date result = DateUtils.round((Object) baseDate, Calendar.YEAR);
        assertNotNull(result);
    }

    @Test
    public void testRoundObject_CalendarInstance_ReturnsRoundedDate() {
        Date result = DateUtils.round((Object) baseCal, Calendar.YEAR);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundObject_Null_ThrowsException() {
        DateUtils.round((Object) null, Calendar.YEAR);
    }

    @Test(expected = ClassCastException.class)
    public void testRoundObject_InvalidType_ThrowsClassCastException() {
        DateUtils.round((Object) "not a date", Calendar.YEAR);
    }

    // ---------------------- truncate(Date, field) ----------------------

    @Test
    public void testTruncateDate_HourField_TruncatesCorrectly() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 15, 13, 45, 30);
        cal.set(Calendar.MILLISECOND, 500);
        Date result = DateUtils.truncate(cal.getTime(), Calendar.HOUR_OF_DAY);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(13, resultCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, resultCal.get(Calendar.MINUTE));
        assertEquals(0, resultCal.get(Calendar.SECOND));
        assertEquals(0, resultCal.get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateDate_NullDate_ThrowsException() {
        DateUtils.truncate((Date) null, Calendar.HOUR_OF_DAY);
    }

    @Test
    public void testTruncateDate_SemiMonthField_TruncatesCorrectly() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 20, 13, 45, 30);
        Date result = DateUtils.truncate(cal.getTime(), DateUtils.SEMI_MONTH);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(16, resultCal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testTruncateDate_SemiMonthFieldFirstHalf_TruncatesToFirst() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 10, 13, 45, 30);
        Date result = DateUtils.truncate(cal.getTime(), DateUtils.SEMI_MONTH);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(1, resultCal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testTruncateDate_AmPmField_TruncatesCorrectly() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 15, 20, 30, 0);
        Date result = DateUtils.truncate(cal.getTime(), Calendar.AM_PM);
        Calendar resultCal = Calendar.getInstance();
        resultCal.setTime(result);
        assertEquals(12, resultCal.get(Calendar.HOUR_OF_DAY));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateDate_UnsupportedField_ThrowsException() {
        DateUtils.truncate(baseDate, Calendar.ZONE_OFFSET);
    }

    @Test(expected = ArithmeticException.class)
    public void testTruncateDate_YearTooLarge_ThrowsArithmeticException() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 280000001);
        DateUtils.truncate(cal.getTime(), Calendar.HOUR_OF_DAY);
    }

    // ---------------------- truncate(Calendar, field) ----------------------

    @Test
    public void testTruncateCalendar_MonthField_TruncatesToFirstDay() {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JUNE, 20, 13, 45, 30);
        Calendar result = DateUtils.truncate(cal, Calendar.MONTH);
        assertEquals(1, result.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateCalendar_NullCalendar_ThrowsException() {
        DateUtils.truncate((Calendar) null, Calendar.HOUR_OF_DAY);
    }

    // ---------------------- truncate(Object, field) ----------------------

    @Test
    public void testTruncateObject_DateInstance_ReturnsTruncatedDate() {
        Date result = DateUtils.truncate((Object) baseDate, Calendar.YEAR);
        assertNotNull(result);
    }

    @Test
    public void testTruncateObject_CalendarInstance_ReturnsTruncatedDate() {
        Date result = DateUtils.truncate((Object) baseCal, Calendar.YEAR);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateObject_Null_ThrowsException() {
        DateUtils.truncate((Object) null, Calendar.YEAR);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncateObject_InvalidType_ThrowsClassCastException() {
        DateUtils.truncate((Object) "not a date", Calendar.YEAR);
    }

    // ---------------------- iterator(Date, int) ----------------------

    @Test
    public void testIteratorDate_ValidRangeStyle_ReturnsIterator() {
        Iterator it = DateUtils.iterator(baseDate, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorDate_NullDate_ThrowsException() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    // ---------------------- iterator(Calendar, int) ----------------------

    @Test
    public void testIteratorCalendar_RangeWeekSunday_ReturnsIterator() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_SUNDAY);
        int count = 0;
        while (it.hasNext()) {
            Object o = it.next();
            assertNotNull(o);
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIteratorCalendar_RangeWeekMonday_ReturnsIterator() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_MONDAY);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIteratorCalendar_RangeWeekRelative_ReturnsIterator() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_RELATIVE);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIteratorCalendar_RangeWeekCenter_ReturnsIterator() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_CENTER);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIteratorCalendar_RangeMonthSunday_ReturnsIterator() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_MONTH_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
        while (it.hasNext()) {
            it.next();
        }
    }

    @Test
    public void testIteratorCalendar_RangeMonthMonday_ReturnsIterator() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_MONTH_MONDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());
        while (it.hasNext()) {
            it.next();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorCalendar_NullCalendar_ThrowsException() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorCalendar_InvalidRangeStyle_ThrowsException() {
        DateUtils.iterator(baseCal, 999);
    }

    // ---------------------- iterator(Object, int) ----------------------

    @Test
    public void testIteratorObject_DateInstance_ReturnsIterator() {
        Iterator it = DateUtils.iterator((Object) baseDate, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
    }

    @Test
    public void testIteratorObject_CalendarInstance_ReturnsIterator() {
        Iterator it = DateUtils.iterator((Object) baseCal, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorObject_Null_ThrowsException() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIteratorObject_InvalidType_ThrowsClassCastException() {
        DateUtils.iterator((Object) "not a date", DateUtils.RANGE_WEEK_SUNDAY);
    }

    // ---------------------- DateIterator inner class behavior ----------------------

    @Test
    public void testDateIterator_NextThrowsNoSuchElementAfterExhausted() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_SUNDAY);
        while (it.hasNext()) {
            it.next();
        }
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDateIterator_Remove_ThrowsUnsupportedOperationException() {
        Iterator it = DateUtils.iterator(baseCal, DateUtils.RANGE_WEEK_SUNDAY);
        it.remove();
    }

    // ---------------------- Constants sanity checks ----------------------

    @Test
    public void testConstants_MillisValues_AreCorrect() {
        assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
        assertEquals(60000L, DateUtils.MILLIS_PER_MINUTE);
        assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
        assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);
        assertEquals(1000, DateUtils.MILLIS_IN_SECOND);
        assertEquals(60000, DateUtils.MILLIS_IN_MINUTE);
        assertEquals(3600000, DateUtils.MILLIS_IN_HOUR);
        assertEquals(86400000, DateUtils.MILLIS_IN_DAY);
    }

    @Test
    public void testConstructor_CreatesInstance() {
        DateUtils du = new DateUtils();
        assertNotNull(du);
    }
}
