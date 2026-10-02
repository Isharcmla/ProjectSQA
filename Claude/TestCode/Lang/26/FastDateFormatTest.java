import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.time.FastDateFormat;

public class FastDateFormatTest {

    private TimeZone utc;
    private Locale usLocale;
    private Calendar cal;

    @Before
    public void setUp() {
        utc = TimeZone.getTimeZone("UTC");
        usLocale = Locale.US;
        cal = new GregorianCalendar(2021, Calendar.JANUARY, 15, 10, 30, 45);
        cal.setTimeZone(utc);
        cal.set(Calendar.MILLISECOND, 123);
    }

    // ---------- getInstance() variants ----------

    @Test
    public void testGetInstance_noArgs_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getInstance();
        assertNotNull(fdf);
        assertNotNull(fdf.getPattern());
    }

    @Test
    public void testGetInstance_withPattern_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", fdf.getPattern());
    }

    @Test
    public void testGetInstance_withPatternAndTimeZone_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        assertEquals(utc, fdf.getTimeZone());
        assertTrue(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_withPatternAndLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", usLocale);
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetInstance_withPatternTimeZoneLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertEquals(utc, fdf.getTimeZone());
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetInstance_sameArgsCached_returnsSameInstance() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertSame(fdf1, fdf2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throwsException() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_invalidPatternChar_throwsException() {
        FastDateFormat.getInstance("yyyy-Q-dd");
    }

    // ---------- getDateInstance() variants ----------

    @Test
    public void testGetDateInstance_style_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(fdf);
    }

    @Test
    public void testGetDateInstance_styleLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.FULL, usLocale);
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetDateInstance_styleTimeZone_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, utc);
        assertEquals(utc, fdf.getTimeZone());
    }

    @Test
    public void testGetDateInstance_styleTimeZoneLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.LONG, utc, usLocale);
        assertEquals(utc, fdf.getTimeZone());
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetDateInstance_cached_returnsSameInstance() {
        FastDateFormat fdf1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, utc, usLocale);
        FastDateFormat fdf2 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, utc, usLocale);
        assertSame(fdf1, fdf2);
    }

    @Test
    public void testGetDateInstance_nullLocale_usesDefault() {
        FastDateFormat fdf = FastDateFormat.getDateInstance(FastDateFormat.SHORT, null, null);
        assertNotNull(fdf);
    }

    // ---------- getTimeInstance() variants ----------

    @Test
    public void testGetTimeInstance_style_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        assertNotNull(fdf);
    }

    @Test
    public void testGetTimeInstance_styleLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.FULL, usLocale);
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetTimeInstance_styleTimeZone_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, utc);
        assertEquals(utc, fdf.getTimeZone());
    }

    @Test
    public void testGetTimeInstance_styleTimeZoneLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.LONG, utc, usLocale);
        assertEquals(utc, fdf.getTimeZone());
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetTimeInstance_cached_returnsSameInstance() {
        FastDateFormat fdf1 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, utc, usLocale);
        FastDateFormat fdf2 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, utc, usLocale);
        assertSame(fdf1, fdf2);
    }

    @Test
    public void testGetTimeInstance_noTimeZoneNoLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, null, null);
        assertNotNull(fdf);
    }

    // ---------- getDateTimeInstance() variants ----------

    @Test
    public void testGetDateTimeInstance_styles_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        assertNotNull(fdf);
    }

    @Test
    public void testGetDateTimeInstance_stylesLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, usLocale);
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZone_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.MEDIUM, utc);
        assertEquals(utc, fdf.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZoneLocale_returnsFormatter() {
        FastDateFormat fdf = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, utc, usLocale);
        assertEquals(utc, fdf.getTimeZone());
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_cached_returnsSameInstance() {
        FastDateFormat fdf1 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, utc, usLocale);
        FastDateFormat fdf2 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, utc, usLocale);
        assertSame(fdf1, fdf2);
    }

    // ---------- format(Object, StringBuffer, FieldPosition) ----------

    @Test
    public void testFormatObject_dateInstance_formatsCorrectly() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        StringBuffer sb = new StringBuffer();
        Date date = cal.getTime();
        StringBuffer result = fdf.format((Object) date, sb, new FieldPosition(0));
        assertEquals("2021", result.toString());
    }

    @Test
    public void testFormatObject_calendarInstance_formatsCorrectly() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = fdf.format((Object) cal, sb, new FieldPosition(0));
        assertEquals("2021", result.toString());
    }

    @Test
    public void testFormatObject_longInstance_formatsCorrectly() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        StringBuffer sb = new StringBuffer();
        Long millis = Long.valueOf(cal.getTimeInMillis());
        StringBuffer result = fdf.format((Object) millis, sb, new FieldPosition(0));
        assertEquals("2021", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_unknownClass_throwsException() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format((Object) "not a date", new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_null_throwsException() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        fdf.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    // ---------- format(long) ----------

    @Test
    public void testFormatLong_returnsFormattedString() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        String result = fdf.format(cal.getTimeInMillis());
        assertEquals("2021-01-15", result);
    }

    // ---------- format(Date) ----------

    @Test
    public void testFormatDate_returnsFormattedString() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        String result = fdf.format(cal.getTime());
        assertEquals("2021-01-15", result);
    }

    // ---------- format(Calendar) ----------

    @Test
    public void testFormatCalendar_returnsFormattedString() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        String result = fdf.format(cal);
        assertEquals("2021-01-15", result);
    }

    // ---------- format(long, StringBuffer) ----------

    @Test
    public void testFormatLongWithBuffer_returnsFormattedBuffer() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = fdf.format(cal.getTimeInMillis(), buf);
        assertEquals("2021", result.toString());
    }

    // ---------- format(Date, StringBuffer) ----------

    @Test
    public void testFormatDateWithBuffer_returnsFormattedBuffer() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = fdf.format(cal.getTime(), buf);
        assertEquals("2021", result.toString());
    }

    // ---------- format(Calendar, StringBuffer) ----------

    @Test
    public void testFormatCalendarWithBuffer_noForcedTimeZone_formatsCorrectly() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", null, usLocale);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = fdf.format(cal, buf);
        assertEquals("2021", result.toString());
    }

    @Test
    public void testFormatCalendarWithBuffer_forcedTimeZone_formatsCorrectly() {
        TimeZone otherZone = TimeZone.getTimeZone("America/New_York");
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm", otherZone, usLocale);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = fdf.format(cal, buf);
        assertNotNull(result);
        assertTrue(fdf.getTimeZoneOverridesCalendar());
    }

    // ---------- parseObject ----------

    @Test
    public void testParseObject_returnsNullAndResetsPosition() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(5);
        Object result = fdf.parseObject("2021-01-15", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // ---------- accessors ----------

    @Test
    public void testGetPattern_returnsSetPattern() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", fdf.getPattern());
    }

    @Test
    public void testGetTimeZone_returnsSetTimeZone() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        assertEquals(utc, fdf.getTimeZone());
    }

    @Test
    public void testGetTimeZone_defaultWhenNotSpecified_returnsDefault() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", (TimeZone) null, usLocale);
        assertEquals(TimeZone.getDefault(), fdf.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar_whenForced_returnsTrue() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        assertTrue(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar_whenNotForced_returnsFalse() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        assertFalse(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale_returnsSetLocale() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", usLocale);
        assertEquals(usLocale, fdf.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate_returnsPositiveValue() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(fdf.getMaxLengthEstimate() > 0);
    }

    // ---------- equals / hashCode / toString ----------

    @Test
    public void testEquals_sameAttributes_returnsTrue() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertTrue(fdf1.equals(fdf2));
    }

    @Test
    public void testEquals_differentPattern_returnsFalse() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy", utc, usLocale);
        assertFalse(fdf1.equals(fdf2));
    }

    @Test
    public void testEquals_notFastDateFormatInstance_returnsFalse() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        assertFalse(fdf.equals("not a FastDateFormat"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        assertFalse(fdf.equals(null));
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        assertTrue(fdf.equals(fdf));
    }

    @Test
    public void testHashCode_sameAttributes_returnsSameHashCode() {
        FastDateFormat fdf1 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        FastDateFormat fdf2 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertEquals(fdf1.hashCode(), fdf2.hashCode());
    }

    @Test
    public void testToString_containsPattern() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        String str = fdf.toString();
        assertTrue(str.contains("yyyy-MM-dd"));
        assertTrue(str.startsWith("FastDateFormat["));
    }

    // ---------- Pattern tokens coverage ----------

    @Test
    public void testFormat_eraPattern_formatsEra() {
        FastDateFormat fdf = FastDateFormat.getInstance("G", utc, usLocale);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testFormat_yearFourDigits_formatsYear() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy", utc);
        assertEquals("2021", fdf.format(cal));
    }

    @Test
    public void testFormat_yearTwoDigits_formatsYear() {
        FastDateFormat fdf = FastDateFormat.getInstance("yy", utc);
        assertEquals("21", fdf.format(cal));
    }

    @Test
    public void testFormat_monthFourDigits_formatsFullMonthName() {
        FastDateFormat fdf = FastDateFormat.getInstance("MMMM", utc, usLocale);
        assertEquals("January", fdf.format(cal));
    }

    @Test
    public void testFormat_monthThreeDigits_formatsShortMonthName() {
        FastDateFormat fdf = FastDateFormat.getInstance("MMM", utc, usLocale);
        assertEquals("Jan", fdf.format(cal));
    }

    @Test
    public void testFormat_monthTwoDigits_formatsPaddedMonth() {
        FastDateFormat fdf = FastDateFormat.getInstance("MM", utc);
        assertEquals("01", fdf.format(cal));
    }

    @Test
    public void testFormat_monthOneDigit_formatsUnpaddedMonth() {
        FastDateFormat fdf = FastDateFormat.getInstance("M", utc);
        assertEquals("1", fdf.format(cal));
    }

    @Test
    public void testFormat_dayOfMonth_formatsDay() {
        FastDateFormat fdf = FastDateFormat.getInstance("dd", utc);
        assertEquals("15", fdf.format(cal));
    }

    @Test
    public void testFormat_hourInAmPm_formatsHour() {
        FastDateFormat fdf = FastDateFormat.getInstance("h", utc);
        String result = fdf.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_hourInAmPmMidnight_formatsTwelve() {
        Calendar midnight = new GregorianCalendar(2021, Calendar.JANUARY, 15, 0, 0, 0);
        midnight.setTimeZone(utc);
        FastDateFormat fdf = FastDateFormat.getInstance("h", utc);
        String result = fdf.format(midnight);
        assertEquals("12", result);
    }

    @Test
    public void testFormat_hourInDay_formatsHourOfDay() {
        FastDateFormat fdf = FastDateFormat.getInstance("HH", utc);
        assertEquals("10", fdf.format(cal));
    }

    @Test
    public void testFormat_minute_formatsMinute() {
        FastDateFormat fdf = FastDateFormat.getInstance("mm", utc);
        assertEquals("30", fdf.format(cal));
    }

    @Test
    public void testFormat_second_formatsSecond() {
        FastDateFormat fdf = FastDateFormat.getInstance("ss", utc);
        assertEquals("45", fdf.format(cal));
    }

    @Test
    public void testFormat_millisecond_formatsMillisecond() {
        FastDateFormat fdf = FastDateFormat.getInstance("SSS", utc);
        assertEquals("123", fdf.format(cal));
    }

    @Test
    public void testFormat_dayOfWeekShort_formatsShortWeekday() {
        FastDateFormat fdf = FastDateFormat.getInstance("EEE", utc, usLocale);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testFormat_dayOfWeekFull_formatsFullWeekday() {
        FastDateFormat fdf = FastDateFormat.getInstance("EEEE", utc, usLocale);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testFormat_dayOfYear_formatsDayOfYear() {
        FastDateFormat fdf = FastDateFormat.getInstance("D", utc);
        String result = fdf.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_dayOfWeekInMonth_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("F", utc);
        String result = fdf.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_weekInYear_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("w", utc);
        String result = fdf.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_weekInMonth_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("W", utc);
        String result = fdf.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_amPmMarker_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("a", utc, usLocale);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testFormat_hourInDayTwentyFour_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("k", utc);
        String result = fdf.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_hourInDayTwentyFourMidnight_formatsTwentyFour() {
        Calendar midnight = new GregorianCalendar(2021, Calendar.JANUARY, 15, 0, 0, 0);
        midnight.setTimeZone(utc);
        FastDateFormat fdf = FastDateFormat.getInstance("k", utc);
        String result = fdf.format(midnight);
        assertEquals("24", result);
    }

    @Test
    public void testFormat_hourInAmPmZeroBase_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("K", utc);
        String result = fdf.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_timeZoneNameShort_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("z", utc, usLocale);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testFormat_timeZoneNameLong_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("zzzz", utc, usLocale);
        String result = fdf.format(cal);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testFormat_timeZoneNumberNoColon_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("Z", utc);
        String result = fdf.format(cal);
        assertEquals("+0000", result);
    }

    @Test
    public void testFormat_timeZoneNumberColon_formatsField() {
        FastDateFormat fdf = FastDateFormat.getInstance("ZZ", utc);
        String result = fdf.format(cal);
        assertEquals("+00:00", result);
    }

    @Test
    public void testFormat_literalSingleQuoteChar_formatsLiteral() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy'T'", utc);
        String result = fdf.format(cal);
        assertEquals("2021T", result);
    }

    @Test
    public void testFormat_literalMultiCharString_formatsLiteral() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy'ABC'", utc);
        String result = fdf.format(cal);
        assertEquals("2021ABC", result);
    }

    @Test
    public void testFormat_literalEscapedQuote_formatsCorrectly() {
        FastDateFormat fdf = FastDateFormat.getInstance("''", utc);
        String result = fdf.format(cal);
        assertEquals("'", result);
    }

    @Test
    public void testFormat_plainTextNoLetters_formatsLiteral() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        String result = fdf.format(cal);
        assertEquals("2021-01-15", result);
    }

    @Test
    public void testFormat_yearThreeDigits_usesPaddedNumberField() {
        FastDateFormat fdf = FastDateFormat.getInstance("yyy", utc);
        String result = fdf.format(cal);
        assertEquals("2021", result);
    }

    @Test
    public void testFormat_dayOfMonthThreeDigitsPadding_usesPaddedField() {
        FastDateFormat fdf = FastDateFormat.getInstance("ddd", utc);
        String result = fdf.format(cal);
        assertEquals("015", result);
    }

    @Test
    public void testFormat_dayOfMonthOneDigit_usesUnpaddedField() {
        FastDateFormat fdf = FastDateFormat.getInstance("d", utc);
        String result = fdf.format(cal);
        assertEquals("15", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_unsupportedPatternLetter_throwsException() {
        FastDateFormat.getInstance("yyyy-XX-dd");
    }
}
