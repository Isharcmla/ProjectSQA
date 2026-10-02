package com.fasterxml.jackson.databind.util;

import org.junit.Assert;
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

    @Test
    public void testConstructorsAndDefaults() {
        StdDateFormat dfDefault = new StdDateFormat();
        Assert.assertTrue(dfDefault.isLenient());
        Assert.assertNull(dfDefault.getTimeZone());

        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        @SuppressWarnings("deprecation")
        StdDateFormat dfDeprecated = new StdDateFormat(tz, Locale.GERMANY);
        Assert.assertEquals(tz, dfDeprecated.getTimeZone());
        Assert.assertTrue(dfDeprecated.isLenient());

        StdDateFormat dfCustom = new StdDateFormat(tz, Locale.GERMANY, Boolean.FALSE);
        Assert.assertEquals(tz, dfCustom.getTimeZone());
        Assert.assertFalse(dfCustom.isLenient());

        Assert.assertNotNull(StdDateFormat.getDefaultTimeZone());
        Assert.assertEquals("UTC", StdDateFormat.getDefaultTimeZone().getID());
        Assert.assertNotNull(StdDateFormat.instance);
    }

    @Test
    public void testWithTimeZone() {
        StdDateFormat df = new StdDateFormat();
        TimeZone tz1 = TimeZone.getTimeZone("PST");
        StdDateFormat df2 = df.withTimeZone(tz1);
        Assert.assertNotSame(df, df2);
        Assert.assertEquals(tz1, df2.getTimeZone());

        StdDateFormat df3 = df2.withTimeZone(tz1);
        Assert.assertSame(df2, df3);

        StdDateFormat dfNullTz = df2.withTimeZone(null);
        Assert.assertEquals(StdDateFormat.getDefaultTimeZone(), dfNullTz.getTimeZone());
    }

    @Test
    public void testWithLocale() {
        StdDateFormat df = new StdDateFormat();
        StdDateFormat dfSameLocale = df.withLocale(Locale.US);
        Assert.assertSame(df, dfSameLocale);

        StdDateFormat dfDifferentLocale = df.withLocale(Locale.FRANCE);
        Assert.assertNotSame(df, dfDifferentLocale);
    }

    @Test
    public void testClone() {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("EST"), Locale.ITALY, Boolean.TRUE);
        StdDateFormat cloned = df.clone();
        Assert.assertNotSame(df, cloned);
        Assert.assertEquals(df.getTimeZone(), cloned.getTimeZone());
        Assert.assertEquals(df.isLenient(), cloned.isLenient());
        Assert.assertEquals(df.toString(), cloned.toString());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testStaticGetISO8601Format() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df1 = StdDateFormat.getISO8601Format(tz);
        Assert.assertNotNull(df1);
        Assert.assertEquals(tz, df1.getTimeZone());

        DateFormat df2 = StdDateFormat.getISO8601Format(tz, Locale.GERMAN);
        Assert.assertNotNull(df2);
        Assert.assertEquals(tz, df2.getTimeZone());

        DateFormat df3 = StdDateFormat.getISO8601Format(null, Locale.GERMAN);
        Assert.assertNotNull(df3);
        Assert.assertEquals(StdDateFormat.getDefaultTimeZone(), df3.getTimeZone());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testStaticGetRFC1123Format() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df1 = StdDateFormat.getRFC1123Format(tz);
        Assert.assertNotNull(df1);
        Assert.assertEquals(tz, df1.getTimeZone());

        DateFormat df2 = StdDateFormat.getRFC1123Format(tz, Locale.FRENCH);
        Assert.assertNotNull(df2);
        Assert.assertEquals(tz, df2.getTimeZone());

        DateFormat df3 = StdDateFormat.getRFC1123Format(null, Locale.FRENCH);
        Assert.assertNotNull(df3);
        Assert.assertEquals(StdDateFormat.getDefaultTimeZone(), df3.getTimeZone());
    }

    @Test
    public void testSetTimeZoneAndClearFormats() {
        StdDateFormat df = new StdDateFormat();
        TimeZone tz1 = TimeZone.getTimeZone("GMT+1");
        df.setTimeZone(tz1);
        Assert.assertEquals(tz1, df.getTimeZone());

        // Formatting initializes internal cached formatters
        Date date = new Date(0L);
        df.format(date);

        // Setting a new timezone clears cached formats
        TimeZone tz2 = TimeZone.getTimeZone("GMT+5");
        df.setTimeZone(tz2);
        Assert.assertEquals(tz2, df.getTimeZone());

        // Setting same timezone should be a no-op
        df.setTimeZone(tz2);
        Assert.assertEquals(tz2, df.getTimeZone());
    }

    @Test
    public void testFormat() {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.TRUE);
        Date date = new Date(0L);
        StringBuffer sb = new StringBuffer();
        StringBuffer res = df.format(date, sb, new FieldPosition(0));
        Assert.assertSame(sb, res);
        Assert.assertEquals("1970-01-01T00:00:00.000+0000", res.toString());

        String formatted = df.format(date);
        Assert.assertEquals("1970-01-01T00:00:00.000+0000", formatted);
    }

    @Test
    public void testToString() {
        StdDateFormat df1 = new StdDateFormat();
        String str1 = df1.toString();
        Assert.assertTrue(str1.contains("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat"));
        Assert.assertTrue(str1.contains("(locale: en_US)"));

        StdDateFormat df2 = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.GERMAN, Boolean.TRUE);
        String str2 = df2.toString();
        Assert.assertTrue(str2.contains("timezone:"));
        Assert.assertTrue(str2.contains("locale: de"));
    }

    @Test
    public void testLooksLikeISO8601() {
        StdDateFormat df = new StdDateFormat();
        Assert.assertTrue(df.looksLikeISO8601("1984-01-01"));
        Assert.assertTrue(df.looksLikeISO8601("2023-12-31T23:59:59.000Z"));
        Assert.assertFalse(df.looksLikeISO8601("198-01-01"));
        Assert.assertFalse(df.looksLikeISO8601("1984/01/01"));
        Assert.assertFalse(df.looksLikeISO8601(""));
        Assert.assertFalse(df.looksLikeISO8601("Thu, 01 Jan 1970 00:00:00 GMT"));
    }

    @Test
    public void testParseStringifiedTimestamps() throws Exception {
        StdDateFormat df = new StdDateFormat();

        Date d1 = df.parse("0");
        Assert.assertEquals(0L, d1.getTime());

        Date d2 = df.parse("1234567890");
        Assert.assertEquals(1234567890L, d2.getTime());

        Date d3 = df.parse("-1000");
        Assert.assertEquals(-1000L, d3.getTime());

        ParsePosition pos = new ParsePosition(0);
        Date d4 = df.parse("5000", pos);
        Assert.assertEquals(5000L, d4.getTime());

        pos = new ParsePosition(0);
        Date d5 = df.parse("-5000", pos);
        Assert.assertEquals(-5000L, d5.getTime());
    }

    @Test
    public void testParseRFC1123() throws Exception {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.TRUE);
        Date d1 = df.parse("Thu, 01 Jan 1970 00:00:00 GMT");
        Assert.assertEquals(0L, d1.getTime());

        ParsePosition pos = new ParsePosition(0);
        Date d2 = df.parse("Thu, 01 Jan 1970 00:00:00 GMT", pos);
        Assert.assertNotNull(d2);
        Assert.assertEquals(0L, d2.getTime());
    }

    @Test
    public void testParsePlainISO8601() throws Exception {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.TRUE);
        Date d1 = df.parse("1970-01-01");
        Assert.assertEquals(0L, d1.getTime());

        ParsePosition pos = new ParsePosition(0);
        Date d2 = df.parse("1970-01-01", pos);
        Assert.assertNotNull(d2);
        Assert.assertEquals(0L, d2.getTime());
    }

    @Test
    public void testParseZuluISO8601() throws Exception {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.TRUE);

        Date d1 = df.parse("1970-01-01T00:00:00.000Z");
        Assert.assertEquals(0L, d1.getTime());

        // Without millis, with Z
        Date d2 = df.parse("1970-01-01T00:00:00Z");
        Assert.assertEquals(0L, d2.getTime());
    }

    @Test
    public void testParseISO8601WithTimezones() throws Exception {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.TRUE);

        // Standard with offset "+0000"
        Date d1 = df.parse("1970-01-01T00:00:00.000+0000");
        Assert.assertEquals(0L, d1.getTime());

        // Offset with colon "+00:00"
        Date d2 = df.parse("1970-01-01T00:00:00.000+00:00");
        Assert.assertEquals(0L, d2.getTime());

        // Offset with hour only "+00"
        Date d3 = df.parse("1970-01-01T00:00:00.000+00");
        Assert.assertEquals(0L, d3.getTime());

        // Offset minus "-05:00"
        Date d4 = df.parse("1970-01-01T00:00:00.000-05:00");
        Assert.assertEquals(5 * 3600 * 1000L, d4.getTime());

        // Time lengths variation (partial millis, seconds omitted)
        Date d5 = df.parse("1970-01-01T00:00:00.00+0000"); // timeLen 11
        Assert.assertEquals(0L, d5.getTime());

        Date d6 = df.parse("1970-01-01T00:00:00.0+0000");  // timeLen 10
        Assert.assertEquals(0L, d6.getTime());

        Date d7 = df.parse("1970-01-01T00:00:00.+0000");   // timeLen 9
        Assert.assertEquals(0L, d7.getTime());

        Date d8 = df.parse("1970-01-01T00:00:00+0000");    // timeLen 8
        Assert.assertEquals(0L, d8.getTime());

        Date d9 = df.parse("1970-01-01T00:00:0+0000");     // timeLen 7 (edge case)
        Assert.assertNotNull(d9);

        Date d10 = df.parse("1970-01-01T00:00+0000");      // timeLen 5
        Assert.assertEquals(0L, d10.getTime());

        Date d11 = df.parse("1970-01-01T0000+0000");       // timeLen 6
        Assert.assertEquals(0L, d11.getTime());
    }

    @Test
    public void testParseISO8601NoTimezone() throws Exception {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.TRUE);

        Date d1 = df.parse("1970-01-01T00:00:00.000");
        Assert.assertEquals(0L, d1.getTime());

        Date d2 = df.parse("1970-01-01T00:00:00.00");
        Assert.assertEquals(0L, d2.getTime());

        Date d3 = df.parse("1970-01-01T00:00:00.0");
        Assert.assertEquals(0L, d3.getTime());

        Date d4 = df.parse("1970-01-01T00:00:00.");
        Assert.assertEquals(0L, d4.getTime());

        Date d5 = df.parse("1970-01-01T00:00:00");
        Assert.assertEquals(0L, d5.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidISO8601NonLenient() throws Exception {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.FALSE);
        df.parse("2023-02-31T00:00:00.000Z");
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidFormatThrowsException() throws Exception {
        StdDateFormat df = new StdDateFormat();
        df.parse("invalid-date-string");
    }

    @Test
    public void testParsePositionWithInvalidISO8601() {
        StdDateFormat df = new StdDateFormat(TimeZone.getTimeZone("UTC"), Locale.US, Boolean.FALSE);
        ParsePosition pos = new ParsePosition(0);
        Date d = df.parse("2023-02-31T00:00:00.000Z", pos);
        Assert.assertNull(d);
    }

    @Test
    public void testParsePositionWithInvalidRFC1123() {
        StdDateFormat df = new StdDateFormat();
        ParsePosition pos = new ParsePosition(0);
        Date d = df.parse("not-a-valid-date-format", pos);
        Assert.assertNull(d);
    }
}
