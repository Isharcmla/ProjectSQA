package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class FastDateFormatTest {

    @Test
    public void testGetInstance_noArgs_returnsNonNullInstance() {
        FastDateFormat fdf = FastDateFormat.getInstance();
        assertNotNull(fdf);
        assertNotNull(fdf.getPattern());
        assertEquals(TimeZone.getDefault(), fdf.getTimeZone());
        assertEquals(Locale.getDefault(), fdf.getLocale());
        assertFalse(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternOnly_returnsCorrectInstance() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern);
        assertNotNull(fdf);
        assertEquals(pattern, fdf.getPattern());
        assertSame(fdf, FastDateFormat.getInstance(pattern));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throwsIllegalArgumentException() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_invalidPatternToken_throwsIllegalArgumentException() {
        FastDateFormat.getInstance("yyyy-MM-dd X");
    }

    @Test
    public void testGetInstance_patternAndTimeZone_returnsConfiguredInstance() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        assertNotNull(fdf);
        assertEquals(tz, fdf.getTimeZone());
        assertTrue(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_patternAndLocale_returnsConfiguredInstance() {
        Locale loc = Locale.GERMANY;
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", loc);
        assertNotNull(fdf);
        assertEquals(loc, fdf.getLocale());
    }

    @Test
    public void testGetInstance_patternTimeZoneLocale_cachesCorrectly() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale loc = Locale.FRANCE;
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", tz, loc);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", tz, loc);
        assertSame(fdf1, fdf2);
    }

    @Test
    public void testGetDateInstance_allOverloads() {
        FastDateFormat fdf1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(fdf1);

        FastDateFormat fdf2 = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, Locale.US);
        assertNotNull(fdf2);
        assertEquals(Locale.US, fdf2.getLocale());

        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat fdf3 = FastDateFormat.getDateInstance(FastDateFormat.LONG, tz);
        assertNotNull(fdf3);
        assertEquals(tz, fdf3.getTimeZone());

        FastDateFormat fdf4 = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.UK);
        assertNotNull(fdf4);
        assertEquals(tz, fdf4.getTimeZone());
        assertEquals(Locale.UK, fdf4.getLocale());

        FastDateFormat cached = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.UK);
        assertSame(fdf4, cached);
    }

    @Test
    public void testGetTimeInstance_allOverloads() {
        FastDateFormat fdf1 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        assertNotNull(fdf1);

        FastDateFormat fdf2 = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, Locale.GERMANY);
        assertNotNull(fdf2);
        assertEquals(Locale.GERMANY, fdf2.getLocale());

        TimeZone tz = TimeZone.getTimeZone("PST");
        FastDateFormat fdf3 = FastDateFormat.getTimeInstance(FastDateFormat.LONG, tz);
        assertNotNull(fdf3);
        assertEquals(tz, fdf3.getTimeZone());

        FastDateFormat fdf4 = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.FRANCE);
        assertNotNull(fdf4);
        assertEquals(tz, fdf4.getTimeZone());
        assertEquals(Locale.FRANCE, fdf4.getLocale());

        FastDateFormat cached = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.FRANCE);
        assertSame(fdf4, cached);
    }

    @Test
    public void testGetDateTimeInstance_allOverloads() {
        FastDateFormat fdf1 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        assertNotNull(fdf1);

        FastDateFormat fdf2 = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.LONG, Locale.ITALY);
        assertNotNull(fdf2);
        assertEquals(Locale.ITALY, fdf2.getLocale());

        TimeZone tz = TimeZone.getTimeZone("EST");
        FastDateFormat fdf3 = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, tz);
        assertNotNull(fdf3);
        assertEquals(tz, fdf3.getTimeZone());

        FastDateFormat fdf4 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.JAPAN);
        assertNotNull(fdf4);
        assertEquals(tz, fdf4.getTimeZone());
        assertEquals(Locale.JAPAN, fdf4.getLocale());

        FastDateFormat cached = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.JAPAN);
        assertSame(fdf4, cached);
    }

    @Test
    public void testFormat_objectTypes_andExceptions() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        Long millis = new Long(now.getTime());

        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);

        assertEquals(fdf.format(now), fdf.format((Object) now, sb, pos).toString());
        sb.setLength(0);
        assertEquals(fdf.format(cal), fdf.format((Object) cal, sb, pos).toString());
        sb.setLength(0);
        assertEquals(fdf.format(millis.longValue()), fdf.format((Object) millis, sb, pos).toString());

        try {
            fdf.format("Not a date", new StringBuffer(), pos);
            fail("Expected IllegalArgumentException for String");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unknown class"));
        }

        try {
            fdf.format(null, new StringBuffer(), pos);
            fail("Expected IllegalArgumentException for null");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("<null>"));
        }
    }

    @Test
    public void testFormat_long_and_date_and_calendar() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS", tz, Locale.US);

        long timeMillis = 1609459200000L; // 2021-01-01 00:00:00.000 GMT
        Date date = new Date(timeMillis);
        Calendar cal = new GregorianCalendar(tz, Locale.US);
        cal.setTime(date);

        String expected = "2021-01-01 00:00:00.000";
        assertEquals(expected, fdf.format(timeMillis));
        assertEquals(expected, fdf.format(date));
        assertEquals(expected, fdf.format(cal));

        StringBuffer buf1 = new StringBuffer("Result: ");
        assertEquals("Result: " + expected, fdf.format(timeMillis, buf1).toString());

        StringBuffer buf2 = new StringBuffer("Result: ");
        assertEquals("Result: " + expected, fdf.format(date, buf2).toString());

        StringBuffer buf3 = new StringBuffer("Result: ");
        assertEquals("Result: " + expected, fdf.format(cal, buf3).toString());
    }

    @Test
    public void testFormat_calendarWithUnforcedTimeZone() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        cal.set(2022, Calendar.MAY, 4, 15, 30, 0);

        StringBuffer buf = new StringBuffer();
        String result = fdf.format(cal, buf).toString();
        assertTrue(result.contains("2022-05-04"));
    }

    @Test
    public void testPattern_Era_G() {
        FastDateFormat fdf = FastDateFormat.getInstance("G GGGG", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        String formatted = fdf.format(cal);
        assertTrue(formatted.contains("AD"));
    }

    @Test
    public void testPattern_YearRules() {
        FastDateFormat fdfShortYear = FastDateFormat.getInstance("yy", Locale.US);
        FastDateFormat fdfLongYear = FastDateFormat.getInstance("yyyy", Locale.US);
        FastDateFormat fdfPaddedYear = FastDateFormat.getInstance("yyyyy", Locale.US);

        Calendar cal = new GregorianCalendar(2005, Calendar.JANUARY, 1);
        assertEquals("05", fdfShortYear.format(cal));
        assertEquals("2005", fdfLongYear.format(cal));
        assertEquals("02005", fdfPaddedYear.format(cal));

        cal.set(Calendar.YEAR, 9);
        assertEquals("00009", fdfPaddedYear.format(cal));

        cal.set(Calendar.YEAR, 99);
        assertEquals("00099", fdfPaddedYear.format(cal));

        cal.set(Calendar.YEAR, 999);
        assertEquals("00999", fdfPaddedYear.format(cal));
    }

    @Test
    public void testPattern_MonthRules() {
        FastDateFormat fdfUnpadded = FastDateFormat.getInstance("M", Locale.US);
        FastDateFormat fdfTwoDigit = FastDateFormat.getInstance("MM", Locale.US);
        FastDateFormat fdfShortText = FastDateFormat.getInstance("MMM", Locale.US);
        FastDateFormat fdfFullText = FastDateFormat.getInstance("MMMM", Locale.US);

        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 1);
        assertEquals("3", fdfUnpadded.format(cal));
        assertEquals("03", fdfTwoDigit.format(cal));
        assertEquals("Mar", fdfShortText.format(cal));
        assertEquals("March", fdfFullText.format(cal));

        cal.set(Calendar.MONTH, Calendar.NOVEMBER);
        assertEquals("11", fdfUnpadded.format(cal));
        assertEquals("11", fdfTwoDigit.format(cal));
    }

    @Test
    public void testPattern_DayOfMonthAndYearRules() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("d dd ddd", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 5);
        assertEquals("5 05 005", fdf1.format(cal));

        cal.set(Calendar.DAY_OF_MONTH, 25);
        assertEquals("25 25 025", fdf1.format(cal));

        FastDateFormat fdfDayOfYear = FastDateFormat.getInstance("D DD DDD", Locale.US);
        cal.set(Calendar.DAY_OF_YEAR, 7);
        assertEquals("7 07 007", fdfDayOfYear.format(cal));
        cal.set(Calendar.DAY_OF_YEAR, 75);
        assertEquals("75 75 075", fdfDayOfYear.format(cal));
        cal.set(Calendar.DAY_OF_YEAR, 250);
        assertEquals("250 250 250", fdfDayOfYear.format(cal));
    }

    @Test
    public void testPattern_HourRules_TwelveAndTwentyFour() {
        FastDateFormat fdf12 = FastDateFormat.getInstance("h hh hhh", Locale.US);
        FastDateFormat fdf24_H = FastDateFormat.getInstance("H HH HHH", Locale.US);
        FastDateFormat fdf24_k = FastDateFormat.getInstance("k kk kkk", Locale.US);
        FastDateFormat fdf12_K = FastDateFormat.getInstance("K KK KKK", Locale.US);

        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0); // Midnight
        assertEquals("12 12 012", fdf12.format(cal));
        assertEquals("0 00 000", fdf24_H.format(cal));
        assertEquals("24 24 024", fdf24_k.format(cal));
        assertEquals("0 00 000", fdf12_K.format(cal));

        cal.set(Calendar.HOUR_OF_DAY, 5);
        assertEquals("5 05 005", fdf12.format(cal));
        assertEquals("5 05 005", fdf24_H.format(cal));
        assertEquals("5 05 005", fdf24_k.format(cal));
        assertEquals("5 05 005", fdf12_K.format(cal));

        cal.set(Calendar.HOUR_OF_DAY, 15);
        assertEquals("3 03 003", fdf12.format(cal));
        assertEquals("15 15 015", fdf24_H.format(cal));
        assertEquals("15 15 015", fdf24_k.format(cal));
        assertEquals("3 03 003", fdf12_K.format(cal));
    }

    @Test
    public void testPattern_MinutesSecondsMillis() {
        FastDateFormat fdf = FastDateFormat.getInstance("m mm mmm : s ss sss : S SS SSS SSSS SSSSS", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 4, 7);
        cal.set(Calendar.MILLISECOND, 9);
        assertEquals("4 04 004 : 7 07 007 : 9 09 009 0009 00009", fdf.format(cal));

        cal.set(Calendar.MINUTE, 45);
        cal.set(Calendar.SECOND, 50);
        cal.set(Calendar.MILLISECOND, 95);
        assertEquals("45 45 045 : 50 50 050 : 95 95 095 0095 00095", fdf.format(cal));

        cal.set(Calendar.MILLISECOND, 500);
        assertEquals("45 45 045 : 50 50 050 : 500 500 500 0500 00500", fdf.format(cal));
    }

    @Test
    public void testPattern_WeekAndDayFields() {
        FastDateFormat fdf = FastDateFormat.getInstance("E EEEE w ww W F a", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 10, 0, 0); // Sunday
        String result = fdf.format(cal);
        assertTrue(result.startsWith("Sun Sunday"));
        assertTrue(result.endsWith("AM"));

        cal.set(Calendar.HOUR_OF_DAY, 20);
        assertTrue(fdf.format(cal).endsWith("PM"));
    }

    @Test
    public void testPattern_TimeZoneRules() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat fdfShort = FastDateFormat.getInstance("z", tz, Locale.US);
        FastDateFormat fdfLong = FastDateFormat.getInstance("zzzz", tz, Locale.US);
        FastDateFormat fdfRFC = FastDateFormat.getInstance("Z", tz, Locale.US);
        FastDateFormat fdfISO = FastDateFormat.getInstance("ZZ", tz, Locale.US);

        Calendar standardCal = new GregorianCalendar(tz, Locale.US);
        standardCal.set(2023, Calendar.JANUARY, 15, 12, 0, 0);

        assertEquals("EST", fdfShort.format(standardCal));
        assertEquals("Eastern Standard Time", fdfLong.format(standardCal));
        assertEquals("-0500", fdfRFC.format(standardCal));
        assertEquals("-05:00", fdfISO.format(standardCal));

        Calendar daylightCal = new GregorianCalendar(tz, Locale.US);
        daylightCal.set(2023, Calendar.JULY, 15, 12, 0, 0);

        assertEquals("EDT", fdfShort.format(daylightCal));
        assertEquals("Eastern Daylight Time", fdfLong.format(daylightCal));
        assertEquals("-0400", fdfRFC.format(daylightCal));
        assertEquals("-04:00", fdfISO.format(daylightCal));

        // Test with unforced timezone
        FastDateFormat fdfUnforcedShort = FastDateFormat.getInstance("z", Locale.US);
        FastDateFormat fdfUnforcedLong = FastDateFormat.getInstance("zzzz", Locale.US);
        assertEquals("EST", fdfUnforcedShort.format(standardCal));
        assertEquals("Eastern Standard Time", fdfUnforcedLong.format(standardCal));
        assertEquals("EDT", fdfUnforcedShort.format(daylightCal));
        assertEquals("Eastern Daylight Time", fdfUnforcedLong.format(daylightCal));

        // Positive timezone offset
        TimeZone positiveTz = TimeZone.getTimeZone("GMT+07:00");
        FastDateFormat fdfPosRFC = FastDateFormat.getInstance("Z", positiveTz, Locale.US);
        FastDateFormat fdfPosISO = FastDateFormat.getInstance("ZZ", positiveTz, Locale.US);
        Calendar posCal = new GregorianCalendar(positiveTz, Locale.US);
        posCal.set(2023, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals("+0700", fdfPosRFC.format(posCal));
        assertEquals("+07:00", fdfPosISO.format(posCal));
    }

    @Test
    public void testPattern_LiteralsAndEscapes() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy'T'MM''dd' 'HH'''foo'''", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 5, 12, 0, 0);
        assertEquals("2023T03'05 12'foo'", fdf1.format(cal));

        FastDateFormat fdf2 = FastDateFormat.getInstance("''yyyy", Locale.US);
        assertEquals("'2023", fdf2.format(cal));

        FastDateFormat fdf3 = FastDateFormat.getInstance("'literal'", Locale.US);
        assertEquals("literal", fdf3.format(cal));
    }

    @Test
    public void testParseObject_unsupportedOperationReturnsNull() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(5);
        pos.setErrorIndex(3);

        Object result = fdf.parseObject("2023-01-01", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testAccessorsAndEstimates() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.ENGLISH);
        assertEquals("yyyy-MM-dd HH:mm:ss", fdf.getPattern());
        assertEquals(TimeZone.getTimeZone("GMT"), fdf.getTimeZone());
        assertEquals(Locale.ENGLISH, fdf.getLocale());
        assertTrue(fdf.getTimeZoneOverridesCalendar());
        assertTrue(fdf.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeZone tz1 = TimeZone.getTimeZone("GMT+1");
        TimeZone tz2 = TimeZone.getTimeZone("GMT+2");
        Locale loc1 = Locale.US;
        Locale loc2 = Locale.UK;

        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", tz1, loc1);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", tz1, loc1);
        FastDateFormat fdfDiffPattern = FastDateFormat.getInstance("yyyy/MM/dd", tz1, loc1);
        FastDateFormat fdfDiffTz = FastDateFormat.getInstance("yyyy-MM-dd", tz2, loc1);
        FastDateFormat fdfDiffLoc = FastDateFormat.getInstance("yyyy-MM-dd", tz1, loc2);
        FastDateFormat fdfUnforcedTz = FastDateFormat.getInstance("yyyy-MM-dd", loc1);

        assertEquals(fdf1, fdf1);
        assertEquals(fdf1, fdf2);
        assertEquals(fdf1.hashCode(), fdf2.hashCode());

        assertFalse(fdf1.equals(null));
        assertFalse(fdf1.equals("Other Object"));
        assertFalse(fdf1.equals(fdfDiffPattern));
        assertFalse(fdf1.equals(fdfDiffTz));
        assertFalse(fdf1.equals(fdfDiffLoc));
        assertFalse(fdf1.equals(fdfUnforcedTz));
    }

    @Test
    public void testToString() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("FastDateFormat[yyyy-MM-dd]", fdf.toString());
    }

    @Test
    public void testGetTimeZoneDisplay_staticMethod() {
        TimeZone tz = TimeZone.getTimeZone("America/Chicago");
        Locale loc = Locale.US;

        String standard = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.LONG, loc);
        String daylight = FastDateFormat.getTimeZoneDisplay(tz, true, TimeZone.LONG, loc);

        assertNotNull(standard);
        assertNotNull(daylight);
        assertFalse(standard.equals(daylight));

        // Test caching path
        String cachedStandard = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.LONG, loc);
        assertEquals(standard, cachedStandard);
    }
}
