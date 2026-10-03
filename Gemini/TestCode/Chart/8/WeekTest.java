package org.jfree.data.time;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class WeekTest {

    @Test
    public void testDefaultConstructor_createsValidWeek() {
        Week week = new Week();
        Assert.assertTrue(week.getWeek() >= 1 && week.getWeek() <= 53);
        Assert.assertTrue(week.getYearValue() >= 1900);
        Assert.assertTrue(week.getFirstMillisecond() > 0);
        Assert.assertTrue(week.getLastMillisecond() >= week.getFirstMillisecond());
    }

    @Test
    public void testConstructor_intWeekAndIntYear() {
        Week week = new Week(1, 2023);
        Assert.assertEquals(1, week.getWeek());
        Assert.assertEquals(2023, week.getYearValue());
        Assert.assertEquals(new Year(2023), week.getYear());
    }

    @Test
    public void testConstructor_intWeekAndYearObject() {
        Year year = new Year(2023);
        Week week = new Week(52, year);
        Assert.assertEquals(52, week.getWeek());
        Assert.assertEquals(2023, week.getYearValue());
        Assert.assertEquals(year, week.getYear());
    }

    @Test
    public void testConstructor_dateOnly() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK);
        cal.clear();
        cal.set(2023, Calendar.JANUARY, 15);
        Week week = new Week(cal.getTime());
        Assert.assertTrue(week.getWeek() >= 1 && week.getWeek() <= 53);
        Assert.assertEquals(2023, week.getYearValue());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructor_dateAndZoneDeprecated() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK);
        cal.clear();
        cal.set(2023, Calendar.JUNE, 1);
        Week week = new Week(cal.getTime(), TimeZone.getTimeZone("UTC"));
        Assert.assertEquals(2023, week.getYearValue());
        Assert.assertTrue(week.getWeek() >= 1 && week.getWeek() <= 53);
    }

    @Test
    public void testConstructor_dateZoneAndLocale_decemberBelongsToNextYear() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK);
        cal.clear();
        cal.set(Calendar.YEAR, 2014);
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 30);
        cal.set(Calendar.WEEK_OF_YEAR, 1);

        Week week = new Week(cal.getTime(), TimeZone.getTimeZone("UTC"), Locale.UK);
        Assert.assertEquals(1, week.getWeek());
        Assert.assertEquals(2015, week.getYearValue());
    }

    @Test
    public void testConstructor_dateZoneAndLocale_januaryBelongsToPreviousYear() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK);
        cal.clear();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        Week week = new Week(cal.getTime(), TimeZone.getTimeZone("UTC"), Locale.UK);
        if (week.getWeek() >= 52) {
            Assert.assertEquals(2015, week.getYearValue());
        } else {
            Assert.assertEquals(2016, week.getYearValue());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullDate_throwsException() {
        new Week(null, TimeZone.getTimeZone("UTC"), Locale.UK);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullZone_throwsException() {
        new Week(new Date(), null, Locale.UK);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullLocale_throwsException() {
        new Week(new Date(), TimeZone.getTimeZone("UTC"), null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullDateSingleArg_throwsException() {
        new Week((Date) null);
    }

    @Test
    public void testPeg_recalculatesMilliseconds() {
        Week week = new Week(10, 2023);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK);
        week.peg(cal);
        long expectedFirst = week.getFirstMillisecond(cal);
        long expectedLast = week.getLastMillisecond(cal);
        Assert.assertEquals(expectedFirst, week.getFirstMillisecond());
        Assert.assertEquals(expectedLast, week.getLastMillisecond());
    }

    @Test(expected = NullPointerException.class)
    public void testPeg_nullCalendar_throwsException() {
        Week week = new Week(10, 2023);
        week.peg(null);
    }

    @Test
    public void testPrevious_middleOfWeek() {
        Week week = new Week(10, 2023);
        Week prev = (Week) week.previous();
        Assert.assertNotNull(prev);
        Assert.assertEquals(9, prev.getWeek());
        Assert.assertEquals(2023, prev.getYearValue());
    }

    @Test
    public void testPrevious_firstWeekOfYear() {
        Week week = new Week(1, 2023);
        Week prev = (Week) week.previous();
        Assert.assertNotNull(prev);
        Assert.assertEquals(2022, prev.getYearValue());
        Assert.assertTrue(prev.getWeek() == 52 || prev.getWeek() == 53);
    }

    @Test
    public void testPrevious_minYearBoundary_returnsNull() {
        Week week = new Week(1, 1900);
        Assert.assertNull(week.previous());
    }

    @Test
    public void testNext_middleOfWeek() {
        Week week = new Week(10, 2023);
        Week next = (Week) week.next();
        Assert.assertNotNull(next);
        Assert.assertEquals(11, next.getWeek());
        Assert.assertEquals(2023, next.getYearValue());
    }

    @Test
    public void testNext_week52RollOverOrIncrement() {
        Week week = new Week(52, 2023);
        Week next = (Week) week.next();
        Assert.assertNotNull(next);
        if (next.getWeek() == 53) {
            Assert.assertEquals(2023, next.getYearValue());
        } else {
            Assert.assertEquals(1, next.getWeek());
            Assert.assertEquals(2024, next.getYearValue());
        }
    }

    @Test
    public void testNext_week53RollOver() {
        Week week = new Week(53, 2020);
        Week next = (Week) week.next();
        Assert.assertNotNull(next);
        Assert.assertEquals(1, next.getWeek());
        Assert.assertEquals(2021, next.getYearValue());
    }

    @Test
    public void testNext_maxYearBoundary_returnsNull() {
        Week week = new Week(53, 9999);
        Assert.assertNull(week.next());
    }

    @Test
    public void testGetSerialIndex() {
        Week week = new Week(10, 2023);
        Assert.assertEquals(2023 * 53L + 10, week.getSerialIndex());
    }

    @Test
    public void testGetFirstAndLastMillisecondWithCalendar() {
        Week week = new Week(1, 2023);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK);
        long first = week.getFirstMillisecond(cal);
        long last = week.getLastMillisecond(cal);
        Assert.assertTrue(last > first);
        Assert.assertEquals(7 * 24 * 60 * 60 * 1000L - 1, last - first);
    }

    @Test(expected = NullPointerException.class)
    public void testGetFirstMillisecond_nullCalendar_throwsException() {
        Week week = new Week(1, 2023);
        week.getFirstMillisecond(null);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLastMillisecond_nullCalendar_throwsException() {
        Week week = new Week(1, 2023);
        week.getLastMillisecond(null);
    }

    @Test
    public void testToString() {
        Week week = new Week(9, 2002);
        Assert.assertEquals("Week 9, 2002", week.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Week w1 = new Week(10, 2023);
        Week w2 = new Week(10, 2023);
        Week w3 = new Week(11, 2023);
        Week w4 = new Week(10, 2024);

        Assert.assertTrue(w1.equals(w1));
        Assert.assertTrue(w1.equals(w2));
        Assert.assertEquals(w1.hashCode(), w2.hashCode());

        Assert.assertFalse(w1.equals(null));
        Assert.assertFalse(w1.equals(new Object()));
        Assert.assertFalse(w1.equals(w3));
        Assert.assertFalse(w1.equals(w4));
    }

    @Test
    public void testCompareTo() {
        Week w1 = new Week(10, 2023);
        Week w2 = new Week(10, 2023);
        Week wPrev = new Week(9, 2023);
        Week wNext = new Week(11, 2023);
        Week wNextYear = new Week(10, 2024);
        Week wPrevYear = new Week(10, 2022);

        Assert.assertEquals(0, w1.compareTo(w2));
        Assert.assertTrue(w1.compareTo(wPrev) > 0);
        Assert.assertTrue(w1.compareTo(wNext) < 0);
        Assert.assertTrue(w1.compareTo(wPrevYear) > 0);
        Assert.assertTrue(w1.compareTo(wNextYear) < 0);

        Year year = new Year(2023);
        Assert.assertEquals(0, w1.compareTo(year));
        Assert.assertEquals(1, w1.compareTo("Not a TimePeriod"));
    }

    @Test
    public void testParseWeek_validFormats() {
        Week w1 = Week.parseWeek("2023-W10");
        Assert.assertEquals(10, w1.getWeek());
        Assert.assertEquals(2023, w1.getYearValue());

        Week w2 = Week.parseWeek("W10-2023");
        Assert.assertEquals(10, w2.getWeek());
        Assert.assertEquals(2023, w2.getYearValue());

        Week w3 = Week.parseWeek("2023 10");
        Assert.assertEquals(10, w3.getWeek());
        Assert.assertEquals(2023, w3.getYearValue());

        Week w4 = Week.parseWeek("2023,10");
        Assert.assertEquals(10, w4.getWeek());
        Assert.assertEquals(2023, w4.getYearValue());

        Week w5 = Week.parseWeek("2023.10");
        Assert.assertEquals(10, w5.getWeek());
        Assert.assertEquals(2023, w5.getYearValue());

        Assert.assertNull(Week.parseWeek(null));
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_noSeparator_throwsException() {
        Week.parseWeek("2023W10");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_invalidWeekNumber_throwsException() {
        Week.parseWeek("2023-W99");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_invalidWeekString_throwsException() {
        Week.parseWeek("2023-XYZ");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_invalidWeekInReverseOrder_throwsException() {
        Week.parseWeek("XYZ-2023");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeek_invalidYearBothSides_throwsException() {
        Week.parseWeek("ABC-DEF");
    }

    @Test
    public void testSerialization() throws Exception {
        Week w1 = new Week(25, 2023);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(w1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        Week w2 = (Week) in.readObject();
        in.close();

        Assert.assertEquals(w1, w2);
        Assert.assertEquals(w1.getFirstMillisecond(), w2.getFirstMillisecond());
        Assert.assertEquals(w1.getLastMillisecond(), w2.getLastMillisecond());
    }
}
