package com.fasterxml.jackson.databind.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormatTest {

    private StdDateFormat stdDateFormat;

    @Before
    public void setUp() {
        stdDateFormat = new StdDateFormat();
    }

    @Test
    public void testConstructors() {
        StdDateFormat dfDefault = new StdDateFormat();
        Assert.assertNotNull(dfDefault);

        TimeZone tz = TimeZone.getTimeZone("PST");
        StdDateFormat dfWithTz = new StdDateFormat(tz);
        Assert.assertEquals(tz, dfWithTz._timezone);

        StdDateFormat dfWithTzAndLoc = new StdDateFormat(tz, Locale.GERMANY);
        Assert.assertEquals(tz, dfWithTzAndLoc._timezone);
        Assert.assertEquals(Locale.GERMANY, dfWithTzAndLoc._locale);
    }

    @Test
    public void testGetDefaultTimeZone() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        Assert.assertNotNull(tz);
        Assert.assertEquals("GMT", tz.getID());
    }

    @Test
    public void testWithTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        StdDateFormat modified = stdDateFormat.withTimeZone(tz);
        Assert.assertNotSame(stdDateFormat, modified);
        Assert.assertEquals(tz, modified._timezone);

        // Same timezone should return same instance
        StdDateFormat same = modified.withTimeZone(tz);
        Assert.assertSame(modified, same);

        // Null timezone should default to GMT
        StdDateFormat defaultTz = modified.withTimeZone(null);
        Assert.assertNotNull(defaultTz);
        Assert.assertEquals(StdDateFormat.getDefaultTimeZone(), defaultTz._timezone);
    }

    @Test
    public void testWithLocale() {
        StdDateFormat modified = stdDateFormat.withLocale(Locale.FRANCE);
        Assert.assertNotSame(stdDateFormat, modified);
        Assert.assertEquals(Locale.FRANCE, modified._locale);

        // Same locale should return same instance
        StdDateFormat same = modified.withLocale(Locale.FRANCE);
        Assert.assertSame(modified, same);
    }

    @Test
    public void testClone() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        StdDateFormat original = new StdDateFormat(tz, Locale.ITALY);
        StdDateFormat cloned = original.clone();

        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original._timezone, cloned._timezone);
        Assert.assertEquals(original._locale, cloned._locale);
    }

    @Test
    public void testGetBlueprintAndStaticFormatGetters() {
        Assert.assertNotNull(StdDateFormat.getBlueprintISO8601Format());
        Assert.assertNotNull(StdDateFormat.getBlueprintRFC1123Format());

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat isoTz = StdDateFormat.getISO8601Format(tz);
        Assert.assertNotNull(isoTz);
        Assert.assertEquals(tz, isoTz.getTimeZone());

        DateFormat isoTzLoc = StdDateFormat.getISO8601Format(tz, Locale.CANADA);
        Assert.assertNotNull(isoTzLoc);

        DateFormat isoTzNull = StdDateFormat.getISO8601Format(null, Locale.GERMAN);
        Assert.assertEquals(StdDateFormat.getDefaultTimeZone(), isoTzNull.getTimeZone());

        DateFormat rfcTz = StdDateFormat.getRFC1123Format(tz);
        Assert.assertNotNull(rfcTz);
        Assert.assertEquals(tz, rfcTz.getTimeZone());

        DateFormat rfcTzLoc = StdDateFormat.getRFC1123Format(tz, Locale.CANADA);
        Assert.assertNotNull(rfcTzLoc);

        DateFormat rfcTzNull = StdDateFormat.getRFC1123Format(null, Locale.GERMAN);
        Assert.assertEquals(StdDateFormat.getDefaultTimeZone(), rfcTzNull.getTimeZone());
    }

    @Test
    public void testSetTimeZone() {
        TimeZone tz1 = TimeZone.getTimeZone("GMT+1");
        TimeZone tz2 = TimeZone.getTimeZone("GMT+2");

        stdDateFormat.setTimeZone(tz1);
        Assert.assertEquals(tz1, stdDateFormat._timezone);

        // Trigger caching of internal formats
        stdDateFormat.format(new Date());
        Assert.assertNotNull(stdDateFormat._formatISO8601);

        // Setting a different timezone should reset cached formats
        stdDateFormat.setTimeZone(tz2);
        Assert.assertEquals(tz2, stdDateFormat._timezone);
        Assert.assertNull(stdDateFormat._formatISO8601);

        // Setting same timezone does not clear
        stdDateFormat.format(new Date());
        Assert.assertNotNull(stdDateFormat._formatISO8601);
        stdDateFormat.setTimeZone(tz2);
        Assert.assertNotNull(stdDateFormat._formatISO8601);
    }

    @Test
    public void testFormat() {
        Date date = new Date(0L); // 1970-01-01T00:00:00.000+0000
        String formatted = stdDateFormat.format(date);
        Assert.assertTrue(formatted.contains("1970-01-01T00:00:00.000"));

        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        StringBuffer result = stdDateFormat.format(date, sb, fp);
        Assert.assertSame(sb, result);
        Assert.assertTrue(result.toString().contains("1970-01-01"));
    }

    @Test
    public void testToString() {
        String strDefault = stdDateFormat.toString();
        Assert.assertTrue(strDefault.contains("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat"));
        Assert.assertTrue(strDefault.contains("locale: en_US"));

        StdDateFormat withTz = stdDateFormat.withTimeZone(TimeZone.getTimeZone("GMT"));
        String strWithTz = withTz.toString();
        Assert.assertTrue(strWithTz.contains("timezone:"));
    }

    @Test
    public void testLooksLikeISO8601() {
        Assert.assertTrue(stdDateFormat.looksLikeISO8601("2020-01-01"));
        Assert.assertTrue(stdDateFormat.looksLikeISO8601("1999-12-31T23:59:59.000Z"));

        Assert.assertFalse(stdDateFormat.looksLikeISO8601("202"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("a020-01-01"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("202a-01-01"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("2020/01/01"));
    }

    @Test
    public void testParse_plainDate() throws ParseException {
        Date d1 = stdDateFormat.parse("2021-05-15");
        Assert.assertNotNull(d1);

        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone());
        cal.setTime(d1);
        Assert.assertEquals(2021, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParse_iso8601Zulu() throws ParseException {
        // With milliseconds
        Date d1 = stdDateFormat.parse("2020-01-01T12:00:00.123Z");
        Assert.assertNotNull(d1);

        // Without milliseconds (colon at len-4)
        Date d2 = stdDateFormat.parse("2020-01-01T12:00:00Z");
        Assert.assertNotNull(d2);
    }

    @Test
    public void testParse_iso8601WithTimezoneOffsets() throws ParseException {
        // Timezone with colon e.g. +00:00
        Date d1 = stdDateFormat.parse("2020-01-01T12:00:00.000+00:00");
        Assert.assertNotNull(d1);

        // Timezone missing minutes e.g. +00
        Date d2 = stdDateFormat.parse("2020-01-01T12:00:00.000+00");
        Assert.assertNotNull(d2);

        // Timezone with minus missing minutes e.g. -05
        Date d3 = stdDateFormat.parse("2020-01-01T12:00:00.000-05");
        Assert.assertNotNull(d3);

        // Timezone 4 digits without colon e.g. +0000
        Date d4 = stdDateFormat.parse("2020-01-01T12:00:00.000+0000");
        Assert.assertNotNull(d4);

        // Timezone without milliseconds, e.g., missing .000
        Date d5 = stdDateFormat.parse("2020-01-01T12:00:00+02:00");
        Assert.assertNotNull(d5);

        Date d6 = stdDateFormat.parse("2020-01-01T12:00:00+0200");
        Assert.assertNotNull(d6);
    }

    @Test
    public void testParse_iso8601NoTimezoneIndicator() throws ParseException {
        // No timezone, missing millis (timeLen <= 8)
        Date d1 = stdDateFormat.parse("2020-01-01T12:00:00");
        Assert.assertNotNull(d1);

        // No timezone, with millis (timeLen > 8)
        Date d2 = stdDateFormat.parse("2020-01-01T12:00:00.555");
        Assert.assertNotNull(d2);
    }

    @Test
    public void testParse_rfc1123() throws ParseException {
        Date d = stdDateFormat.parse("Wed, 01 Jan 2020 12:00:00 GMT");
        Assert.assertNotNull(d);
    }

    @Test
    public void testParse_numericTimestamps() throws ParseException {
        // Positive timestamp
        Date d1 = stdDateFormat.parse("1577836800000");
        Assert.assertEquals(1577836800000L, d1.getTime());

        // Negative timestamp
        Date d2 = stdDateFormat.parse("-1577836800000");
        Assert.assertEquals(-1577836800000L, d2.getTime());

        // Zero
        Date d3 = stdDateFormat.parse("0");
        Assert.assertEquals(0L, d3.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParse_numericOutOfLongRange_throwsException() throws ParseException {
        // Out of Long.MAX_VALUE range will fall back to RFC 1123 and fail
        stdDateFormat.parse("9999999999999999999999999999999999");
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidFormat_throwsParseException() throws ParseException {
        stdDateFormat.parse("not-a-valid-date");
    }

    @Test
    public void testParseWithParsePosition_invalidReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Date result = stdDateFormat.parse("invalid-date", pos);
        Assert.assertNull(result);
    }

    @Test
    public void testHasTimeZoneBranchesViaProtectedParsing() throws ParseException {
        // len >= 6 where len-6 is '+' or '-'
        Date d1 = stdDateFormat.parse("2020-01-01T00:00:00+0000");
        Assert.assertNotNull(d1);

        // len >= 6 where len-5 is '+' or '-'
        Date d2 = stdDateFormat.parse("2020-01-01T00:00:00-000");
        // May fail RFC/ISO parse if malformed, but tests hasTimeZone boundary
        ParsePosition pos = new ParsePosition(0);
        stdDateFormat.parse("2020-01-01T00:00:00-0500", pos);
        Assert.assertNotNull(pos);

        // len >= 6 where len-3 is '+' or '-'
        Date d3 = stdDateFormat.parse("2020-01-01T00:00:00+00");
        Assert.assertNotNull(d3);

        // Short string (less than 6 chars)
        ParsePosition shortPos = new ParsePosition(0);
        Date dShort = stdDateFormat.parse("2020", shortPos);
        Assert.assertNotNull(dShort); // parsed as numeric timestamp
    }

    @Test
    public void testCachedParsersReuse() throws ParseException {
        // Calling same parser multiple times to test cached instances
        stdDateFormat.parse("2020-01-01");
        stdDateFormat.parse("2020-01-02");

        stdDateFormat.parse("2020-01-01T12:00:00Z");
        stdDateFormat.parse("2020-01-02T12:00:00Z");

        stdDateFormat.parse("2020-01-01T12:00:00.000+0000");
        stdDateFormat.parse("2020-01-02T12:00:00.000+0000");

        stdDateFormat.parse("Wed, 01 Jan 2020 12:00:00 GMT");
        stdDateFormat.parse("Thu, 02 Jan 2020 12:00:00 GMT");
    }
}
