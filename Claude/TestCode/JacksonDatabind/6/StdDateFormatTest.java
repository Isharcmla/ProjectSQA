package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormatTest {

    // -------------------- Constructors --------------------

    @Test
    public void testDefaultConstructor_normal_localeIsUS() {
        StdDateFormat fmt = new StdDateFormat();
        assertEquals(Locale.US, fmt._locale);
        assertNull(fmt._timezone);
    }

    @Test
    public void testTimeZoneConstructor_normal_setsTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        StdDateFormat fmt = new StdDateFormat(tz);
        assertEquals(tz, fmt._timezone);
        assertEquals(Locale.US, fmt._locale);
    }

    @Test
    public void testTimeZoneLocaleConstructor_normal_setsBoth() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        StdDateFormat fmt = new StdDateFormat(tz, Locale.GERMANY);
        assertEquals(tz, fmt._timezone);
        assertEquals(Locale.GERMANY, fmt._locale);
    }

    // -------------------- getDefaultTimeZone --------------------

    @Test
    public void testGetDefaultTimeZone_normal_returnsGMT() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        assertEquals(TimeZone.getTimeZone("GMT"), tz);
    }

    // -------------------- withTimeZone --------------------

    @Test
    public void testWithTimeZone_nullTz_usesDefaultTimeZone() {
        StdDateFormat fmt = new StdDateFormat();
        StdDateFormat result = fmt.withTimeZone(null);
        assertNotNull(result);
        assertEquals(TimeZone.getTimeZone("GMT"), result._timezone);
    }

    @Test
    public void testWithTimeZone_sameTz_returnsSameInstance() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        StdDateFormat fmt = new StdDateFormat(tz, Locale.US);
        StdDateFormat result = fmt.withTimeZone(tz);
        assertSame(fmt, result);
    }

    @Test
    public void testWithTimeZone_differentTz_returnsNewInstance() {
        TimeZone tz1 = TimeZone.getTimeZone("GMT");
        TimeZone tz2 = TimeZone.getTimeZone("America/Chicago");
        StdDateFormat fmt = new StdDateFormat(tz1, Locale.US);
        StdDateFormat result = fmt.withTimeZone(tz2);
        assertNotSame(fmt, result);
        assertEquals(tz2, result._timezone);
    }

    // -------------------- withLocale --------------------

    @Test
    public void testWithLocale_sameLocale_returnsSameInstance() {
        StdDateFormat fmt = new StdDateFormat();
        StdDateFormat result = fmt.withLocale(Locale.US);
        assertSame(fmt, result);
    }

    @Test
    public void testWithLocale_differentLocale_returnsNewInstance() {
        StdDateFormat fmt = new StdDateFormat();
        StdDateFormat result = fmt.withLocale(Locale.GERMANY);
        assertNotSame(fmt, result);
        assertEquals(Locale.GERMANY, result._locale);
    }

    // -------------------- clone --------------------

    @Test
    public void testClone_normal_returnsNewEquivalentInstance() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        StdDateFormat fmt = new StdDateFormat(tz, Locale.US);
        StdDateFormat cloned = fmt.clone();
        assertNotSame(fmt, cloned);
        assertEquals(fmt._timezone, cloned._timezone);
        assertEquals(fmt._locale, cloned._locale);
    }

    // -------------------- Static blueprint / factory methods --------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testGetBlueprintISO8601Format_normal_returnsSameReference() {
        DateFormat df1 = StdDateFormat.getBlueprintISO8601Format();
        DateFormat df2 = StdDateFormat.getBlueprintISO8601Format();
        assertNotNull(df1);
        assertSame(df1, df2);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetBlueprintRFC1123Format_normal_returnsSameReference() {
        DateFormat df1 = StdDateFormat.getBlueprintRFC1123Format();
        DateFormat df2 = StdDateFormat.getBlueprintRFC1123Format();
        assertNotNull(df1);
        assertSame(df1, df2);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetISO8601Format_deprecatedVariant_returnsUsableFormat() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        DateFormat df = StdDateFormat.getISO8601Format(tz);
        assertNotNull(df);
    }

    @Test
    public void testGetISO8601Format_withLocale_returnsUsableFormat() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        DateFormat df = StdDateFormat.getISO8601Format(tz, Locale.GERMANY);
        assertNotNull(df);
    }

    @Test
    public void testGetISO8601Format_nullTimeZone_usesDefault() {
        DateFormat df = StdDateFormat.getISO8601Format(null, Locale.GERMANY);
        assertNotNull(df);
    }

    @Test
    public void testGetRFC1123Format_withLocale_returnsUsableFormat() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        DateFormat df = StdDateFormat.getRFC1123Format(tz, Locale.US);
        assertNotNull(df);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGetRFC1123Format_deprecatedVariant_returnsUsableFormat() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        DateFormat df = StdDateFormat.getRFC1123Format(tz);
        assertNotNull(df);
    }

    // -------------------- setTimeZone --------------------

    @Test
    public void testSetTimeZone_differentTz_resetsCachedFormats() {
        StdDateFormat fmt = new StdDateFormat();
        // force creation of cached formats
        fmt.format(new Date(0), new StringBuffer(), new FieldPosition(0));
        assertNotNull(fmt._formatISO8601);

        TimeZone newTz = TimeZone.getTimeZone("America/Los_Angeles");
        fmt.setTimeZone(newTz);
        assertNull(fmt._formatISO8601);
        assertNull(fmt._formatRFC1123);
        assertNull(fmt._formatISO8601_z);
        assertNull(fmt._formatPlain);
        assertEquals(newTz, fmt._timezone);
    }

    @Test
    public void testSetTimeZone_sameTz_doesNotResetCachedFormats() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        StdDateFormat fmt = new StdDateFormat(tz, Locale.US);
        fmt.format(new Date(0), new StringBuffer(), new FieldPosition(0));
        assertNotNull(fmt._formatISO8601);
        fmt.setTimeZone(TimeZone.getTimeZone("GMT"));
        assertNotNull(fmt._formatISO8601);
    }

    @Test(expected = NullPointerException.class)
    public void testSetTimeZone_null_throwsNullPointerException() {
        StdDateFormat fmt = new StdDateFormat();
        fmt.setTimeZone(null);
    }

    // -------------------- format --------------------

    @Test
    public void testFormat_normalDate_returnsIso8601String() {
        StdDateFormat fmt = new StdDateFormat();
        Date date = new Date(0L);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = fmt.format(date, sb, new FieldPosition(0));
        assertNotNull(result);
        assertTrue(result.toString().startsWith("1970-01-01T00:00:00.000"));
    }

    @Test(expected = NullPointerException.class)
    public void testFormat_nullDate_throwsNullPointerException() {
        StdDateFormat fmt = new StdDateFormat();
        fmt.format((Date) null, new StringBuffer(), new FieldPosition(0));
    }

    // -------------------- toString --------------------

    @Test
    public void testToString_withTimeZone_containsTimeZoneInfo() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        StdDateFormat fmt = new StdDateFormat(tz, Locale.US);
        String s = fmt.toString();
        assertTrue(s.contains("timezone"));
        assertTrue(s.contains("locale"));
    }

    @Test
    public void testToString_withoutTimeZone_containsLocaleOnly() {
        StdDateFormat fmt = new StdDateFormat();
        String s = fmt.toString();
        assertFalse(s.contains("timezone"));
        assertTrue(s.contains("locale"));
    }

    // -------------------- looksLikeISO8601 --------------------

    @Test
    public void testLooksLikeISO8601_validIsoPrefix_returnsTrue() {
        StdDateFormat fmt = new StdDateFormat();
        assertTrue(fmt.looksLikeISO8601("2015-06-15"));
    }

    @Test
    public void testLooksLikeISO8601_nonDigitStart_returnsFalse() {
        StdDateFormat fmt = new StdDateFormat();
        assertFalse(fmt.looksLikeISO8601("abcdef"));
    }

    @Test
    public void testLooksLikeISO8601_tooShort_returnsFalse() {
        StdDateFormat fmt = new StdDateFormat();
        assertFalse(fmt.looksLikeISO8601(""));
    }

    @Test
    public void testLooksLikeISO8601_noDashAtIndex4_returnsFalse() {
        StdDateFormat fmt = new StdDateFormat();
        assertFalse(fmt.looksLikeISO8601("20150615"));
    }

    @Test(expected = NullPointerException.class)
    public void testLooksLikeISO8601_null_throwsNullPointerException() {
        StdDateFormat fmt = new StdDateFormat();
        fmt.looksLikeISO8601(null);
    }

    // -------------------- parseAsISO8601 --------------------

    @Test
    public void testParseAsISO8601_plainDate_parsesSuccessfully() throws Exception {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsISO8601_zFormatMissingMillis_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15T10:20:30Z", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsISO8601_zFormatWithMillis_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15T10:20:30.123Z", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsISO8601_timezoneWithColon_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15T10:20:30+02:00", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsISO8601_timezoneMissingMinutes_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15T10:20:30+02", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsISO8601_noTimeZoneShortTime_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15T10:20:30", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsISO8601_noTimeZoneWithMillis_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15T10:20:30.123", pos);
        assertNotNull(d);
    }

    // -------------------- parseAsRFC1123 --------------------

    @Test
    public void testParseAsRFC1123_validRfcString_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsRFC1123("Mon, 15 Jun 2015 10:20:30 GMT", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsRFC1123_invalidString_returnsNull() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsRFC1123("not a valid rfc date", pos);
        assertNull(d);
    }

    // -------------------- parse(String, ParsePosition) --------------------

    @Test
    public void testParsePosVariant_plainIsoDate_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parse("2015-06-15", pos);
        assertNotNull(d);
    }

    @Test
    public void testParsePosVariant_positiveTimestamp_parsesAsLong() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        String ts = "1000000000000";
        Date d = fmt.parse(ts, pos);
        assertNotNull(d);
        assertEquals(Long.parseLong(ts), d.getTime());
    }

    @Test
    public void testParsePosVariant_negativeTimestamp_parsesAsLong() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parse("-5000", pos);
        assertNotNull(d);
        assertEquals(-5000L, d.getTime());
    }

    @Test
    public void testParsePosVariant_rfc1123String_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parse("Mon, 15 Jun 2015 10:20:30 GMT", pos);
        assertNotNull(d);
    }

    @Test
    public void testParsePosVariant_invalidString_returnsNull() {
        StdDateFormat fmt = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parse("totally invalid date string", pos);
        assertNull(d);
    }

    // -------------------- parse(String) --------------------

    @Test
    public void testParse_plainIsoDate_returnsDate() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        Date d = fmt.parse("2015-06-15");
        assertNotNull(d);
    }

    @Test
    public void testParse_withLeadingTrailingWhitespace_trimsAndParses() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        Date d = fmt.parse("  2015-06-15  ");
        assertNotNull(d);
    }

    @Test
    public void testParse_positiveTimestampString_returnsCorrectDate() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        String ts = "1000000000000";
        Date d = fmt.parse(ts);
        assertEquals(Long.parseLong(ts), d.getTime());
    }

    @Test
    public void testParse_negativeTimestampString_returnsCorrectDate() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        Date d = fmt.parse("-12345");
        assertEquals(-12345L, d.getTime());
    }

    @Test
    public void testParse_rfc1123String_returnsDate() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        Date d = fmt.parse("Mon, 15 Jun 2015 10:20:30 GMT");
        assertNotNull(d);
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidString_throwsParseException() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        fmt.parse("this is not a date at all");
    }

    @Test(expected = NullPointerException.class)
    public void testParse_null_throwsNullPointerException() throws ParseException {
        StdDateFormat fmt = new StdDateFormat();
        fmt.parse((String) null);
    }

    // -------------------- Locale-specific cloning branch --------------------

    @Test
    public void testFormat_nonDefaultLocale_returnsFormattedString() {
        StdDateFormat fmt = new StdDateFormat(TimeZone.getTimeZone("GMT"), Locale.GERMANY);
        Date date = new Date(0L);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = fmt.format(date, sb, new FieldPosition(0));
        assertNotNull(result);
        assertTrue(result.toString().startsWith("1970-01-01T00:00:00.000"));
    }

    @Test
    public void testParseAsISO8601_nonDefaultLocale_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat(TimeZone.getTimeZone("GMT"), Locale.GERMANY);
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsISO8601("2015-06-15", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseAsRFC1123_nonDefaultLocale_parsesSuccessfully() {
        StdDateFormat fmt = new StdDateFormat(TimeZone.getTimeZone("GMT"), Locale.GERMANY);
        ParsePosition pos = new ParsePosition(0);
        Date d = fmt.parseAsRFC1123("Mon, 15 Jun 2015 10:20:30 GMT", pos);
        assertNotNull(d);
    }
}
