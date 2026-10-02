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

import org.apache.commons.lang.time.FastDateFormat;

public class FastDateFormatTest {

    private TimeZone defaultZone;
    private Locale defaultLocale;

    @Before
    public void setUp() {
        defaultZone = TimeZone.getDefault();
        defaultLocale = Locale.getDefault();
    }

    // ---------------------------------------------------------------
    // getInstance() variants
    // ---------------------------------------------------------------

    @Test
    public void testGetInstance_noArgs_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance();
        assertNotNull(format);
        assertNotNull(format.getPattern());
    }

    @Test
    public void testGetInstance_withPattern_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", format.getPattern());
    }

    @Test
    public void testGetInstance_withPatternAndTimeZone_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        assertEquals(tz, format.getTimeZone());
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_withPatternAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetInstance_withPatternTimeZoneLocale_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", tz, Locale.US);
        assertEquals(tz, format.getTimeZone());
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetInstance_sameArguments_returnsCachedInstance() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", null, Locale.US);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", null, Locale.US);
        assertSame(format1, format2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throwsIllegalArgumentException() {
        FastDateFormat.getInstance(null, null, null);
    }

    // ---------------------------------------------------------------
    // getDateInstance() variants
    // ---------------------------------------------------------------

    @Test
    public void testGetDateInstance_style_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(format);
    }

    @Test
    public void testGetDateInstance_styleAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.US);
        assertNotNull(format);
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetDateInstance_styleAndTimeZone_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, tz);
        assertNotNull(format);
        assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testGetDateInstance_styleTimeZoneLocale_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.FULL, tz, Locale.US);
        assertNotNull(format);
        assertEquals(tz, format.getTimeZone());
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetDateInstance_sameArgs_returnsCachedInstance() {
        FastDateFormat format1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, null, Locale.US);
        FastDateFormat format2 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, null, Locale.US);
        assertSame(format1, format2);
    }

    // ---------------------------------------------------------------
    // getTimeInstance() variants
    // ---------------------------------------------------------------

    @Test
    public void testGetTimeInstance_style_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        assertNotNull(format);
    }

    @Test
    public void testGetTimeInstance_styleAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.LONG, Locale.US);
        assertNotNull(format);
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetTimeInstance_styleAndTimeZone_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, tz);
        assertNotNull(format);
        assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testGetTimeInstance_styleTimeZoneLocale_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.FULL, tz, Locale.US);
        assertNotNull(format);
        assertEquals(tz, format.getTimeZone());
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetTimeInstance_sameArgs_returnsCachedInstance() {
        FastDateFormat format1 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, null, Locale.US);
        FastDateFormat format2 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, null, Locale.US);
        assertSame(format1, format2);
    }

    // ---------------------------------------------------------------
    // getDateTimeInstance() variants
    // ---------------------------------------------------------------

    @Test
    public void testGetDateTimeInstance_styles_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        assertNotNull(format);
    }

    @Test
    public void testGetDateTimeInstance_stylesAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, Locale.US);
        assertNotNull(format);
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_stylesAndTimeZone_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.MEDIUM, tz);
        assertNotNull(format);
        assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZoneLocale_returnsFormatter() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, tz, Locale.US);
        assertNotNull(format);
        assertEquals(tz, format.getTimeZone());
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_sameArgs_returnsCachedInstance() {
        FastDateFormat format1 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, null, Locale.US);
        FastDateFormat format2 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, null, Locale.US);
        assertSame(format1, format2);
    }

    // ---------------------------------------------------------------
    // format(Object, StringBuffer, FieldPosition)
    // ---------------------------------------------------------------

    @Test
    public void testFormatObject_withDate_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        StringBuffer buf = new StringBuffer();
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        Date date = cal.getTime();
        StringBuffer result = format.format((Object) date, buf, new FieldPosition(0));
        assertEquals("2020-01-15", result.toString());
    }

    @Test
    public void testFormatObject_withCalendar_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        StringBuffer buf = new StringBuffer();
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        StringBuffer result = format.format((Object) cal, buf, new FieldPosition(0));
        assertEquals("2020-01-15", result.toString());
    }

    @Test
    public void testFormatObject_withLong_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        StringBuffer buf = new StringBuffer();
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        Long millis = new Long(cal.getTimeInMillis());
        StringBuffer result = format.format((Object) millis, buf, new FieldPosition(0));
        assertEquals("2020-01-15", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_withNullObject_throwsIllegalArgumentException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        format.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_withUnsupportedType_throwsIllegalArgumentException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        format.format((Object) "notADate", new StringBuffer(), new FieldPosition(0));
    }

    // ---------------------------------------------------------------
    // format(long)
    // ---------------------------------------------------------------

    @Test
    public void testFormatLong_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal.getTimeInMillis());
        assertEquals("2020-01-15", result);
    }

    @Test
    public void testFormatLong_zeroMillis_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy");
        String result = format.format(0L);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // format(Date)
    // ---------------------------------------------------------------

    @Test
    public void testFormatDate_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal.getTime());
        assertEquals("2020-01-15", result);
    }

    // ---------------------------------------------------------------
    // format(Calendar)
    // ---------------------------------------------------------------

    @Test
    public void testFormatCalendar_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertEquals("2020-01-15", result);
    }

    @Test
    public void testFormatCalendar_withForcedTimeZone_returnsFormattedString() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm", tz);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
        cal.set(2020, Calendar.JANUARY, 15, 10, 0, 0);
        String result = format.format(cal);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // format(long, StringBuffer)
    // ---------------------------------------------------------------

    @Test
    public void testFormatLongWithBuffer_returnsFormattedBuffer() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = format.format(cal.getTimeInMillis(), buf);
        assertEquals("2020-01-15", result.toString());
    }

    // ---------------------------------------------------------------
    // format(Date, StringBuffer)
    // ---------------------------------------------------------------

    @Test
    public void testFormatDateWithBuffer_returnsFormattedBuffer() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = format.format(cal.getTime(), buf);
        assertEquals("2020-01-15", result.toString());
    }

    // ---------------------------------------------------------------
    // format(Calendar, StringBuffer)
    // ---------------------------------------------------------------

    @Test
    public void testFormatCalendarWithBuffer_returnsFormattedBuffer() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = format.format(cal, buf);
        assertEquals("2020-01-15", result.toString());
    }

    // ---------------------------------------------------------------
    // parseObject
    // ---------------------------------------------------------------

    @Test
    public void testParseObject_returnsNull() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(5);
        Object result = format.parseObject("2020-01-15", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // ---------------------------------------------------------------
    // Accessors
    // ---------------------------------------------------------------

    @Test
    public void testGetPattern_returnsOriginalPattern() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("yyyy-MM-dd", format.getPattern());
    }

    @Test
    public void testGetTimeZone_withoutForced_returnsDefaultTimeZone() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
    }

    @Test
    public void testGetTimeZone_withForced_returnsSpecifiedTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar_whenNotForced_returnsFalse() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", (TimeZone) null, (Locale) null);
        assertFalse(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar_whenForced_returnsTrue() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale_withoutForced_returnsDefaultLocale() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", (TimeZone) null, (Locale) null);
        assertEquals(Locale.getDefault(), format.getLocale());
    }

    @Test
    public void testGetLocale_withForced_returnsSpecifiedLocale() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", Locale.FRANCE);
        assertEquals(Locale.FRANCE, format.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate_returnsPositiveValue() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(format.getMaxLengthEstimate() > 0);
    }

    // ---------------------------------------------------------------
    // equals / hashCode / toString
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameAttributes_returnsTrue() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertTrue(format1.equals(format2));
    }

    @Test
    public void testEquals_differentPattern_returnsFalse() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat format2 = FastDateFormat.getInstance("dd-MM-yyyy");
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testEquals_differentTimeZone_returnsFalse() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"));
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("America/New_York"));
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testEquals_differentLocale_returnsFalse() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.FRANCE);
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testEquals_notFastDateFormatInstance_returnsFalse() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(format.equals("not a FastDateFormat"));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(format.equals(null));
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(format.equals(format));
    }

    @Test
    public void testHashCode_sameAttributes_returnsSameHashCode() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(format1.hashCode(), format2.hashCode());
    }

    @Test
    public void testToString_returnsExpectedFormat() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("FastDateFormat[yyyy-MM-dd]", format.toString());
    }

    // ---------------------------------------------------------------
    // Pattern parsing coverage - various pattern letters
    // ---------------------------------------------------------------

    @Test
    public void testPattern_era_formatsSuccessfully() {
        FastDateFormat format = FastDateFormat.getInstance("G");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_yearFourDigits_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("2020", format.format(cal));
    }

    @Test
    public void testPattern_yearTwoDigits_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("yy");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("20", format.format(cal));
    }

    @Test
    public void testPattern_yearOneDigit_formatsAsTwoDigitYear() {
        FastDateFormat format = FastDateFormat.getInstance("y");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("20", format.format(cal));
    }

    @Test
    public void testPattern_monthFull_formatsAsTextMonth() {
        FastDateFormat format = FastDateFormat.getInstance("MMMM", Locale.US);
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("January", format.format(cal));
    }

    @Test
    public void testPattern_monthShort_formatsAsShortTextMonth() {
        FastDateFormat format = FastDateFormat.getInstance("MMM", Locale.US);
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("Jan", format.format(cal));
    }

    @Test
    public void testPattern_monthTwoDigits_formatsPadded() {
        FastDateFormat format = FastDateFormat.getInstance("MM");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("01", format.format(cal));
    }

    @Test
    public void testPattern_monthOneDigit_formatsUnpadded() {
        FastDateFormat format = FastDateFormat.getInstance("M");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("1", format.format(cal));
    }

    @Test
    public void testPattern_dayOfMonth_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 5);
        assertEquals("05", format.format(cal));
    }

    @Test
    public void testPattern_hourAmPm_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("h");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15, 0, 0, 0);
        String result = format.format(cal);
        assertEquals("12", result);
    }

    @Test
    public void testPattern_hourOfDay_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("HH");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15, 14, 0, 0);
        assertEquals("14", format.format(cal));
    }

    @Test
    public void testPattern_minute_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("mm");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15, 0, 5, 0);
        assertEquals("05", format.format(cal));
    }

    @Test
    public void testPattern_second_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("ss");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15, 0, 0, 9);
        assertEquals("09", format.format(cal));
    }

    @Test
    public void testPattern_millisecond_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("SSS");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("123", format.format(cal));
    }

    @Test
    public void testPattern_dayOfWeekShort_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("EEE", Locale.US);
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15); // Wednesday
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_dayOfWeekFull_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("EEEE", Locale.US);
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_dayOfYear_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("D");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_dayOfWeekInMonth_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("F");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_weekOfYear_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("w");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_weekOfMonth_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("W");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_amPmMarker_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("a", Locale.US);
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15, 10, 0, 0);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_hourInDayTwentyFour_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("k");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15, 0, 0, 0);
        String result = format.format(cal);
        assertEquals("24", result);
    }

    @Test
    public void testPattern_hourInAmPmZeroEleven_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("K");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15, 0, 0, 0);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_timeZoneShort_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("z", TimeZone.getTimeZone("GMT"));
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_timeZoneLong_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("zzzz", TimeZone.getTimeZone("GMT"));
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_timeZoneNoColon_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("GMT"));
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertEquals("+0000", result);
    }

    @Test
    public void testPattern_timeZoneWithColon_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT"));
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertEquals("+00:00", result);
    }

    @Test
    public void testPattern_literalSingleQuoteChar_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy'T'MM");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("2020T01", format.format(cal));
    }

    @Test
    public void testPattern_literalMultiCharString_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy'ABC'MM");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("2020ABC01", format.format(cal));
    }

    @Test
    public void testPattern_escapedQuote_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy''MM");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertEquals("2020'01", result);
    }

    @Test
    public void testPattern_plainTextNonLetterCharacters_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("2020-01-15", format.format(cal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPattern_illegalPatternCharacter_throwsIllegalArgumentException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-Q");
        format.format(new Date());
    }

    @Test
    public void testPattern_largeYearPadding_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("yyyyy");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_paddedDayOfMonthThreeDigits_formatsCorrectly() {
        FastDateFormat format = FastDateFormat.getInstance("ddd");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 5);
        String result = format.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testFormat_emptyPattern_returnsEmptyString() {
        FastDateFormat format = FastDateFormat.getInstance("");
        Calendar cal = new GregorianCalendar(2020, Calendar.JANUARY, 15);
        assertEquals("", format.format(cal));
    }
}
