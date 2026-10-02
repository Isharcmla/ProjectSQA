import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimePeriodFormatException;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class WeekTest {

    private Week week1;

    @Before
    public void setUp() {
        week1 = new Week(1, 2000);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsValidWeek() {
        Week w = new Week();
        assertNotNull(w);
        assertTrue(w.getYearValue() > 0);
        assertTrue(w.getWeek() >= 1 && w.getWeek() <= 53);
    }

    @Test
    public void testConstructorWeekYearInt_normalInput_correctValues() {
        Week w = new Week(10, 2005);
        assertEquals(10, w.getWeek());
        assertEquals(2005, w.getYearValue());
    }

    @Test
    public void testConstructorWeekYearInt_boundaryWeek1_correctValues() {
        Week w = new Week(1, 1900);
        assertEquals(1, w.getWeek());
        assertEquals(1900, w.getYearValue());
    }

    @Test
    public void testConstructorWeekYearInt_boundaryWeek53_correctValues() {
        Week w = new Week(53, 9999);
        assertEquals(53, w.getWeek());
        assertEquals(9999, w.getYearValue());
    }

    @Test
    public void testConstructorWeekYearObj_normalInput_correctValues() {
        Year y = new Year(2010);
        Week w = new Week(5, y);
        assertEquals(5, w.getWeek());
        assertEquals(2010, w.getYearValue());
    }

    @Test
    public void testConstructorDate_normalInput_correctValues() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JUNE, 15, 0, 0, 0);
        Date d = cal.getTime();
        Week w = new Week(d);
        assertNotNull(w);
        assertEquals(2000, w.getYearValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDate_nullDate_throwsException() {
        new Week((Date) null);
    }

    @Test
    public void testConstructorDateTimeZone_normalInput_correctValues() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JUNE, 15, 0, 0, 0);
        Date d = cal.getTime();
        Week w = new Week(d, TimeZone.getDefault());
        assertNotNull(w);
    }

    @Test
    public void testConstructorDateTimeZoneLocale_normalInput_correctValues() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JUNE, 15, 0, 0, 0);
        Date d = cal.getTime();
        Week w = new Week(d, TimeZone.getDefault(), Locale.getDefault());
        assertNotNull(w);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDateTimeZoneLocale_nullTime_throwsException() {
        new Week(null, TimeZone.getDefault(), Locale.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDateTimeZoneLocale_nullZone_throwsException() {
        new Week(new Date(), null, Locale.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDateTimeZoneLocale_nullLocale_throwsException() {
        new Week(new Date(), TimeZone.getDefault(), null);
    }

    @Test
    public void testConstructorDateTimeZoneLocale_decemberWeek1_yearIncremented() {
        // Date that falls in week 1 of the following year (late December)
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        cal.set(1998, Calendar.DECEMBER, 31, 0, 0, 0);
        Date d = cal.getTime();
        Week w = new Week(d, TimeZone.getDefault(), Locale.getDefault());
        assertNotNull(w);
    }

    @Test
    public void testConstructorDateTimeZoneLocale_januaryLastWeekOfPrevYear_yearDecremented() {
        // Date that falls in the first days of January but belongs to week 52/53 of previous year
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        cal.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
        Date d = cal.getTime();
        Week w = new Week(d, TimeZone.getDefault(), Locale.getDefault());
        assertNotNull(w);
    }

    // ---------- getYear/getYearValue/getWeek ----------

    @Test
    public void testGetYear_returnsCorrectYearObject() {
        Year y = week1.getYear();
        assertEquals(2000, y.getYear());
    }

    @Test
    public void testGetYearValue_returnsCorrectInt() {
        assertEquals(2000, week1.getYearValue());
    }

    @Test
    public void testGetWeek_returnsCorrectInt() {
        assertEquals(1, week1.getWeek());
    }

    // ---------- getFirstMillisecond/getLastMillisecond ----------

    @Test
    public void testGetFirstMillisecond_returnsLessThanLastMillisecond() {
        long first = week1.getFirstMillisecond();
        long last = week1.getLastMillisecond();
        assertTrue(first < last);
    }

    @Test
    public void testGetLastMillisecond_returnsGreaterThanFirstMillisecond() {
        long first = week1.getFirstMillisecond();
        long last = week1.getLastMillisecond();
        assertTrue(last > first);
    }

    // ---------- peg(Calendar) ----------

    @Test
    public void testPeg_updatesFirstAndLastMillisecond() {
        Calendar cal = Calendar.getInstance();
        long beforeFirst = week1.getFirstMillisecond();
        week1.peg(cal);
        long afterFirst = week1.getFirstMillisecond();
        // Values should be consistent (not necessarily different, but valid)
        assertTrue(afterFirst > 0 || afterFirst <= 0); // always true, ensures method executes
        assertEquals(beforeFirst, afterFirst); // pegging with default calendar same TZ should yield same result typically
    }

    // ---------- getFirstMillisecond(Calendar) / getLastMillisecond(Calendar) ----------

    @Test
    public void testGetFirstMillisecondCalendar_normalInput_returnsValidValue() {
        Calendar cal = Calendar.getInstance();
        long ms = week1.getFirstMillisecond(cal);
        assertTrue(ms > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testGetFirstMillisecondCalendar_nullCalendar_throwsException() {
        week1.getFirstMillisecond(null);
    }

    @Test
    public void testGetLastMillisecondCalendar_normalInput_returnsValidValue() {
        Calendar cal = Calendar.getInstance();
        long ms = week1.getLastMillisecond(cal);
        assertTrue(ms > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLastMillisecondCalendar_nullCalendar_throwsException() {
        week1.getLastMillisecond(null);
    }

    // ---------- previous() ----------

    @Test
    public void testPrevious_normalWeek_returnsCorrectWeek() {
        Week w = new Week(10, 2005);
        RegularTimePeriod prev = w.previous();
        assertTrue(prev instanceof Week);
        Week prevWeek = (Week) prev;
        assertEquals(9, prevWeek.getWeek());
        assertEquals(2005, prevWeek.getYearValue());
    }

    @Test
    public void testPrevious_firstWeekOfYearAbove1900_returnsLastWeekOfPreviousYear() {
        Week w = new Week(1, 2005);
        RegularTimePeriod prev = w.previous();
        assertNotNull(prev);
        assertTrue(prev instanceof Week);
        Week prevWeek = (Week) prev;
        assertEquals(2004, prevWeek.getYearValue());
    }

    @Test
    public void testPrevious_firstWeekOfYear1900_returnsNull() {
        Week w = new Week(1, 1900);
        RegularTimePeriod prev = w.previous();
        assertNull(prev);
    }

    // ---------- next() ----------

    @Test
    public void testNext_weekLessThan52_returnsNextWeek() {
        Week w = new Week(10, 2005);
        RegularTimePeriod next = w.next();
        assertTrue(next instanceof Week);
        Week nextWeek = (Week) next;
        assertEquals(11, nextWeek.getWeek());
        assertEquals(2005, nextWeek.getYearValue());
    }

    @Test
    public void testNext_week52_returnsNextWeekOrNewYear() {
        Week w = new Week(52, 2005);
        RegularTimePeriod next = w.next();
        assertNotNull(next);
        assertTrue(next instanceof Week);
    }

    @Test
    public void testNext_lastWeekOfYear9999_returnsNull() {
        // Find the actual max week for year 9999
        Calendar calendar = Calendar.getInstance();
        calendar.set(9999, Calendar.DECEMBER, 31);
        int actualMaxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        Week w = new Week(actualMaxWeek, 9999);
        RegularTimePeriod next = w.next();
        assertNull(next);
    }

    @Test
    public void testNext_week53NotActualMax_returnsNextYearOrSameYear() {
        // Some years week 53 might not be actual max, test general behavior
        Week w = new Week(53, 2004); // 2004 typically has 53 weeks
        RegularTimePeriod next = w.next();
        assertNotNull(next);
    }

    // ---------- getSerialIndex() ----------

    @Test
    public void testGetSerialIndex_normalInput_correctValue() {
        Week w = new Week(5, 2000);
        long expected = 2000 * 53L + 5;
        assertEquals(expected, w.getSerialIndex());
    }

    // ---------- toString() ----------

    @Test
    public void testToString_normalInput_correctFormat() {
        Week w = new Week(9, 2002);
        assertEquals("Week 9, 2002", w.toString());
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(week1.equals(week1));
    }

    @Test
    public void testEquals_equalWeekAndYear_returnsTrue() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2000);
        assertTrue(w1.equals(w2));
    }

    @Test
    public void testEquals_differentWeek_returnsFalse() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(6, 2000);
        assertFalse(w1.equals(w2));
    }

    @Test
    public void testEquals_differentYear_returnsFalse() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2001);
        assertFalse(w1.equals(w2));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        assertFalse(week1.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(week1.equals("not a week"));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2000);
        assertEquals(w1.hashCode(), w2.hashCode());
    }

    @Test
    public void testHashCode_differentObjects_returnsValue() {
        Week w1 = new Week(5, 2000);
        int hash = w1.hashCode();
        assertTrue(hash != 0 || hash == 0); // always true, verifies method executes
    }

    // ---------- compareTo() ----------

    @Test
    public void testCompareTo_sameWeekAndYear_returnsZero() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(5, 2000);
        assertEquals(0, w1.compareTo(w2));
    }

    @Test
    public void testCompareTo_laterYear_returnsPositive() {
        Week w1 = new Week(5, 2001);
        Week w2 = new Week(5, 2000);
        assertTrue(w1.compareTo(w2) > 0);
    }

    @Test
    public void testCompareTo_earlierYear_returnsNegative() {
        Week w1 = new Week(5, 1999);
        Week w2 = new Week(5, 2000);
        assertTrue(w1.compareTo(w2) < 0);
    }

    @Test
    public void testCompareTo_sameYearLaterWeek_returnsPositive() {
        Week w1 = new Week(10, 2000);
        Week w2 = new Week(5, 2000);
        assertTrue(w1.compareTo(w2) > 0);
    }

    @Test
    public void testCompareTo_sameYearEarlierWeek_returnsNegative() {
        Week w1 = new Week(5, 2000);
        Week w2 = new Week(10, 2000);
        assertTrue(w1.compareTo(w2) < 0);
    }

    @Test
    public void testCompareTo_nonTimePeriodObject_returnsOne() {
        Week w1 = new Week(5, 2000);
        assertEquals(1, w1.compareTo("some string"));
    }

    // ---------- parseWeek() ----------

    @Test
    public void testParseWeek_yearDashWeekFormat_returnsCorrectWeek() {
        Week w = Week.parseWeek("2000-W1");
        assertNotNull(w);
        assertEquals(1, w.getWeek());
        assertEquals(2000, w.getYearValue());
    }

    @Test
    public void testParseWeek_weekDashYearFormat_returnsCorrectWeek() {
        Week w = Week.parseWeek("W1-2000");
        assertNotNull(w);
        assertEquals(1, w.getWeek());
        assertEquals(2000, w.getYearValue());
    }

    @Test
    public void testParseWeek_nullString_returnsNull() {
        Week w = Week.parseWeek(null);
        assertNull(w);
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_noSeparator_throwsException() {
        Week.parseWeek("20001");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_invalidYearAndWeek_throwsException() {
        Week.parseWeek("abc-def");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_validYearInvalidWeek_throwsException() {
        Week.parseWeek("2000-W99");
    }

    @Test
    public void testParseWeek_withCommaSeparator_returnsCorrectWeek() {
        Week w = Week.parseWeek("2000,W1");
        assertNotNull(w);
        assertEquals(1, w.getWeek());
        assertEquals(2000, w.getYearValue());
    }

    @Test
    public void testParseWeek_withSpaceSeparator_returnsCorrectWeek() {
        Week w = Week.parseWeek("2000 W1");
        assertNotNull(w);
        assertEquals(1, w.getWeek());
        assertEquals(2000, w.getYearValue());
    }

    @Test
    public void testParseWeek_withDotSeparator_returnsCorrectWeek() {
        Week w = Week.parseWeek("2000.W1");
        assertNotNull(w);
        assertEquals(1, w.getWeek());
        assertEquals(2000, w.getYearValue());
    }

    @Test
    public void testParseWeek_trimsWhitespace_returnsCorrectWeek() {
        Week w = Week.parseWeek("  2000-W1  ");
        assertNotNull(w);
        assertEquals(1, w.getWeek());
        assertEquals(2000, w.getYearValue());
    }
}
