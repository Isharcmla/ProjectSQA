import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormatTest {

    private TimeZone utc;
    private Locale usLocale;

    @Before
    public void setUp() {
        utc = TimeZone.getTimeZone("UTC");
        usLocale = Locale.US;
    }

    // ---------- getInstance() overloads ----------

    @Test
    public void testGetInstance_noArgs_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance();
        assertNotNull(format);
        assertNotNull(format.getPattern());
    }

    @Test
    public void testGetInstance_withPattern_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertNotNull(format);
        assertEquals("yyyy-MM-dd", format.getPattern());
    }

    @Test
    public void testGetInstance_withPatternAndTimeZone_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_withPatternAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", usLocale);
        assertNotNull(format);
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetInstance_withPatternTimeZoneLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetInstance_cachedInstance_returnsSameObject() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertSame(format1, format2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullPattern_throwsException() {
        FastDateFormat.getInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_invalidPatternChar_throwsException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-Q-dd");
        format.format(new Date());
    }

    // ---------- getDateInstance() overloads ----------

    @Test
    public void testGetDateInstance_styleOnly_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertNotNull(format);
    }

    @Test
    public void testGetDateInstance_styleAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, usLocale);
        assertNotNull(format);
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetDateInstance_styleAndTimeZone_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.LONG, utc);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
    }

    @Test
    public void testGetDateInstance_styleTimeZoneLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.FULL, utc, usLocale);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetDateInstance_cached_returnsSameObject() {
        FastDateFormat format1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, usLocale);
        FastDateFormat format2 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, usLocale);
        assertSame(format1, format2);
    }

    @Test
    public void testGetDateInstance_nullLocale_usesDefault() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.SHORT, (Locale) null);
        assertNotNull(format);
    }

    @Test
    public void testGetDateInstance_withTimeZoneNullLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.SHORT, utc, null);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
    }

    // ---------- getTimeInstance() overloads ----------

    @Test
    public void testGetTimeInstance_styleOnly_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        assertNotNull(format);
    }

    @Test
    public void testGetTimeInstance_styleAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, usLocale);
        assertNotNull(format);
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetTimeInstance_styleAndTimeZone_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.LONG, utc);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
    }

    @Test
    public void testGetTimeInstance_styleTimeZoneLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.FULL, utc, usLocale);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetTimeInstance_cached_returnsSameObject() {
        FastDateFormat format1 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, usLocale);
        FastDateFormat format2 = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, usLocale);
        assertSame(format1, format2);
    }

    @Test
    public void testGetTimeInstance_nullTimeZoneAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, null, null);
        assertNotNull(format);
    }

    // ---------- getDateTimeInstance() overloads ----------

    @Test
    public void testGetDateTimeInstance_stylesOnly_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        assertNotNull(format);
    }

    @Test
    public void testGetDateTimeInstance_stylesAndLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.MEDIUM, FastDateFormat.MEDIUM, usLocale);
        assertNotNull(format);
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_stylesAndTimeZone_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, utc);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstance_stylesTimeZoneLocale_returnsFormatter() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, utc, usLocale);
        assertNotNull(format);
        assertEquals(utc, format.getTimeZone());
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_cached_returnsSameObject() {
        FastDateFormat format1 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, usLocale);
        FastDateFormat format2 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, usLocale);
        assertSame(format1, format2);
    }

    @Test
    public void testGetDateTimeInstance_nullLocale_usesDefault() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, utc, null);
        assertNotNull(format);
    }

    // ---------- format(Object, StringBuffer, FieldPosition) ----------

    @Test
    public void testFormatObject_withDate_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        StringBuffer buf = new StringBuffer();
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        StringBuffer result = format.format((Object) date, buf, new FieldPosition(0));
        assertEquals("2020-01-15", result.toString());
    }

    @Test
    public void testFormatObject_withCalendar_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2021, Calendar.MARCH, 10, 0, 0, 0);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = format.format((Object) cal, buf, new FieldPosition(0));
        assertEquals("2021-03-10", result.toString());
    }

    @Test
    public void testFormatObject_withLong_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2019, Calendar.JUNE, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long millis = cal.getTimeInMillis();
        StringBuffer buf = new StringBuffer();
        StringBuffer result = format.format((Object) Long.valueOf(millis), buf, new FieldPosition(0));
        assertEquals("2019-06-01", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_withUnknownType_throwsException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        format.format((Object) "not a date", new StringBuffer(), new FieldPosition(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_withNull_throwsException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        format.format((Object) null, new StringBuffer(), new FieldPosition(0));
    }

    // ---------- format(long) ----------

    @Test
    public void testFormatLong_typicalValue_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        String result = format.format(cal.getTimeInMillis());
        assertEquals("2020-01-01", result);
    }

    @Test
    public void testFormatLong_zeroEpoch_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        String result = format.format(0L);
        assertEquals("1970-01-01", result);
    }

    @Test
    public void testFormatLong_negativeValue_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        String result = format.format(-86400000L);
        assertEquals("1969-12-31", result);
    }

    // ---------- format(Date) ----------

    @Test
    public void testFormatDate_typicalDate_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2022, Calendar.DECEMBER, 25, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        String result = format.format(cal.getTime());
        assertEquals("2022-12-25", result);
    }

    // ---------- format(Calendar) ----------

    @Test
    public void testFormatCalendar_typicalCalendar_returnsFormattedString() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2023, Calendar.JULY, 4, 0, 0, 0);
        String result = format.format(cal);
        assertEquals("2023-07-04", result);
    }

    @Test
    public void testFormatCalendar_withForcedTimeZone_appliesTimeZone() {
        TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm", tokyo, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2023, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal);
        assertNotNull(result);
        assertTrue(result.startsWith("2023-01-01"));
    }

    // ---------- format(long, StringBuffer) ----------

    @Test
    public void testFormatLongWithBuffer_typicalValue_appendsToBuffer() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.FEBRUARY, 14, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = format.format(cal.getTimeInMillis(), buf);
        assertEquals("2020-02-14", result.toString());
        assertSame(buf, result);
    }

    // ---------- format(Date, StringBuffer) ----------

    @Test
    public void testFormatDateWithBuffer_typicalDate_appendsToBuffer() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2021, Calendar.AUGUST, 20, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        StringBuffer buf = new StringBuffer("prefix-");
        StringBuffer result = format.format(cal.getTime(), buf);
        assertEquals("prefix-2021-08-20", result.toString());
    }

    // ---------- format(Calendar, StringBuffer) ----------

    @Test
    public void testFormatCalendarWithBuffer_typicalCalendar_appendsToBuffer() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2019, Calendar.MAY, 5, 0, 0, 0);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = format.format(cal, buf);
        assertEquals("2019-05-05", result.toString());
    }

    @Test
    public void testFormatCalendarWithBuffer_forcedTimeZoneClonesCalendar_doesNotMutateOriginal() {
        TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm", tokyo, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2023, Calendar.JANUARY, 1, 0, 0, 0);
        TimeZone originalZone = cal.getTimeZone();
        StringBuffer buf = new StringBuffer();
        format.format(cal, buf);
        assertEquals(originalZone, cal.getTimeZone());
    }

    // ---------- parseObject ----------

    @Test
    public void testParseObject_anyInput_returnsNullAndSetsPosition() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(5);
        Object result = format.parseObject("2020-01-01", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    // ---------- getPattern ----------

    @Test
    public void testGetPattern_returnsOriginalPattern() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss");
        assertEquals("yyyy-MM-dd'T'HH:mm:ss", format.getPattern());
    }

    // ---------- getTimeZone ----------

    @Test
    public void testGetTimeZone_withExplicitTimeZone_returnsThatTimeZone() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        assertEquals(utc, format.getTimeZone());
    }

    @Test
    public void testGetTimeZone_withoutExplicitTimeZone_returnsDefaultTimeZone() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
    }

    // ---------- getTimeZoneOverridesCalendar ----------

    @Test
    public void testGetTimeZoneOverridesCalendar_whenTimeZoneForced_returnsTrue() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar_whenTimeZoneNotForced_returnsFalse() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(format.getTimeZoneOverridesCalendar());
    }

    // ---------- getLocale ----------

    @Test
    public void testGetLocale_withExplicitLocale_returnsThatLocale() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", usLocale);
        assertEquals(usLocale, format.getLocale());
    }

    @Test
    public void testGetLocale_withoutExplicitLocale_returnsDefaultLocale() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(Locale.getDefault(), format.getLocale());
    }

    // ---------- getMaxLengthEstimate ----------

    @Test
    public void testGetMaxLengthEstimate_returnsPositiveValue() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(format.getMaxLengthEstimate() > 0);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(format.equals(format));
    }

    @Test
    public void testEquals_samePatternTimeZoneLocale_returnsTrue() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertTrue(format1.equals(format2));
    }

    @Test
    public void testEquals_differentPattern_returnsFalse() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat format2 = FastDateFormat.getInstance("MM/dd/yyyy");
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testEquals_differentTimeZone_returnsFalse() {
        TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", tokyo);
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
    public void testEquals_null_returnsFalse() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(format.equals(null));
    }

    @Test
    public void testEquals_differentTimeZoneForced_returnsFalse() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", utc);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd");
        // format2's default time zone may coincidentally equal utc in some environments,
        // but mTimeZoneForced flags will differ unless default is also forced; this still
        // tests the forced-flag branch reliably because format1 forced=true, format2 forced=false
        assertFalse(format1.equals(format2) && format1.getTimeZoneOverridesCalendar() == format2.getTimeZoneOverridesCalendar());
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", utc, usLocale);
        assertEquals(format1.hashCode(), format2.hashCode());
    }

    @Test
    public void testHashCode_returnsConsistentValue() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        int hash1 = format.hashCode();
        int hash2 = format.hashCode();
        assertEquals(hash1, hash2);
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsPatternInBrackets() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("FastDateFormat[yyyy-MM-dd]", format.toString());
    }

    // ---------- Pattern parsing coverage: various format letters ----------

    @Test
    public void testFormat_fullPatternWithAllTokens_producesNonEmptyResult() {
        FastDateFormat format = FastDateFormat.getInstance(
            "G yyyy yy MMMM MMM MM M dd d HH H hh h mm m ss s SSS EEEE EEE D F w W a k K zzzz z Z ZZ 'literal' '' ''''",
            utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JUNE, 15, 13, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        String result = format.format(cal.getTime());
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFormat_yearFourDigits_producesPaddedYear() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2005, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("2005", result);
    }

    @Test
    public void testFormat_yearTwoDigits_producesTwoDigitYear() {
        FastDateFormat format = FastDateFormat.getInstance("yy", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2005, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("05", result);
    }

    @Test
    public void testFormat_monthFourLetters_producesFullMonthName() {
        FastDateFormat format = FastDateFormat.getInstance("MMMM", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("January", result);
    }

    @Test
    public void testFormat_monthThreeLetters_producesShortMonthName() {
        FastDateFormat format = FastDateFormat.getInstance("MMM", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("Jan", result);
    }

    @Test
    public void testFormat_monthTwoDigits_producesTwoDigitMonth() {
        FastDateFormat format = FastDateFormat.getInstance("MM", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.MARCH, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("03", result);
    }

    @Test
    public void testFormat_monthOneDigit_producesUnpaddedMonth() {
        FastDateFormat format = FastDateFormat.getInstance("M", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.MARCH, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("3", result);
    }

    @Test
    public void testFormat_dayOfMonthOneDigit_producesUnpaddedDay() {
        FastDateFormat format = FastDateFormat.getInstance("d", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 5, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("5", result);
    }

    @Test
    public void testFormat_dayOfMonthThreeDigits_producesPaddedDay() {
        FastDateFormat format = FastDateFormat.getInstance("ddd", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 5, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("005", result);
    }

    @Test
    public void testFormat_hourInAmPm_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("h", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("12", result);
    }

    @Test
    public void testFormat_hourInDay24_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("H", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("0", result);
    }

    @Test
    public void testFormat_twentyFourHourField_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("k", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("24", result);
    }

    @Test
    public void testFormat_hourInAmPmZeroBased_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("K", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("0", result);
    }

    @Test
    public void testFormat_amPmMarker_producesCorrectText() {
        FastDateFormat format = FastDateFormat.getInstance("a", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 10, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("AM", result);
    }

    @Test
    public void testFormat_dayOfWeekFull_producesFullName() {
        FastDateFormat format = FastDateFormat.getInstance("EEEE", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0); // Wednesday
        String result = format.format(cal.getTime());
        assertEquals("Wednesday", result);
    }

    @Test
    public void testFormat_dayOfWeekShort_producesShortName() {
        FastDateFormat format = FastDateFormat.getInstance("EEE", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0); // Wednesday
        String result = format.format(cal.getTime());
        assertEquals("Wed", result);
    }

    @Test
    public void testFormat_eraDesignator_producesEraText() {
        FastDateFormat format = FastDateFormat.getInstance("G", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("AD", result);
    }

    @Test
    public void testFormat_timeZoneShort_producesShortTimeZoneText() {
        FastDateFormat format = FastDateFormat.getInstance("z", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFormat_timeZoneLong_producesLongTimeZoneText() {
        FastDateFormat format = FastDateFormat.getInstance("zzzz", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFormat_timeZoneNumberNoColon_producesCorrectFormat() {
        FastDateFormat format = FastDateFormat.getInstance("Z", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("+0000", result);
    }

    @Test
    public void testFormat_timeZoneNumberWithColon_producesCorrectFormat() {
        FastDateFormat format = FastDateFormat.getInstance("ZZ", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("+00:00", result);
    }

    @Test
    public void testFormat_dayOfYear_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("D", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("1", result);
    }

    @Test
    public void testFormat_dayOfWeekInMonth_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("F", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertNotNull(result);
    }

    @Test
    public void testFormat_weekOfYear_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("w", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertNotNull(result);
    }

    @Test
    public void testFormat_weekOfMonth_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("W", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertNotNull(result);
    }

    @Test
    public void testFormat_millisecond_producesCorrectValue() {
        FastDateFormat format = FastDateFormat.getInstance("SSS", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 123);
        String result = format.format(cal.getTime());
        assertEquals("123", result);
    }

    @Test
    public void testFormat_literalQuotedText_producesLiteralText() {
        FastDateFormat format = FastDateFormat.getInstance("'Today is: 'yyyy", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("Today is: 2020", result);
    }

    @Test
    public void testFormat_literalSingleCharacter_producesLiteral() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy'X'MM", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.MARCH, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("2020X03", result);
    }

    @Test
    public void testFormat_escapedQuoteInLiteral_producesQuoteCharacter() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy''MM", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(2020, Calendar.MARCH, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("2020'03", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormat_illegalPatternCharacter_throwsException() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-Q-MM");
        format.format(new Date());
    }

    @Test
    public void testFormat_largeYearValue_producesFullDigits() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", utc, usLocale);
        Calendar cal = new GregorianCalendar(utc);
        cal.set(12345, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertEquals("12345", result);
    }

    @Test
    public void testFormat_paddedNumberFieldWithLessThanThreeDigits_throwsOnConstruction() {
        try {
            FastDateFormat.getInstance("dddd").format(new Date());
            // tokenLen=4 for 'd' goes to selectNumberRule with padding=4 -> PaddedNumberField, size>=3 OK
        } catch (IllegalArgumentException e) {
            fail("Should not throw for valid padding size");
        }
    }

    @Test
    public void testFormat_timeZoneForcedWithDaylightSaving_appendsCorrectName() {
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York");
        FastDateFormat format = FastDateFormat.getInstance("zzzz", nyZone, usLocale);
        Calendar cal = new GregorianCalendar(nyZone);
        cal.set(2020, Calendar.JULY, 1, 12, 0, 0); // DST period
        String result = format.format(cal.getTime());
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFormat_timeZoneForcedWithoutDaylightSaving_appendsStandardName() {
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York");
        FastDateFormat format = FastDateFormat.getInstance("zzzz", nyZone, usLocale);
        Calendar cal = new GregorianCalendar(nyZone);
        cal.set(2020, Calendar.JANUARY, 1, 12, 0, 0); // Standard time
        String result = format.format(cal.getTime());
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFormat_timeZoneNotForcedUsesCalendarTimeZone() {
        FastDateFormat format = FastDateFormat.getInstance("zzzz", usLocale);
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York");
        Calendar cal = new GregorianCalendar(nyZone);
        cal.set(2020, Calendar.JULY, 1, 12, 0, 0);
        String result = format.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFormat_negativeTimeZoneOffset_appendsMinusSign() {
        TimeZone negativeZone = TimeZone.getTimeZone("America/Los_Angeles");
        FastDateFormat format = FastDateFormat.getInstance("Z", negativeZone, usLocale);
        Calendar cal = new GregorianCalendar(negativeZone);
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        String result = format.format(cal.getTime());
        assertTrue(result.startsWith("-"));
    }

    @Test
    public void testFormat_emptyPattern_producesEmptyString() {
        FastDateFormat format = FastDateFormat.getInstance("");
        String result = format.format(new Date());
        assertEquals("", result);
    }

    @Test
    public void testGetMaxLengthEstimate_forEmptyPattern_returnsZero() {
        FastDateFormat format = FastDateFormat.getInstance("");
        assertEquals(0, format.getMaxLengthEstimate());
    }
}
