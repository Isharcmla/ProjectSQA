package com.fasterxml.jackson.databind.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
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
    public void testGetDefaultTimeZone_returnsUtc() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        Assert.assertNotNull(tz);
        Assert.assertEquals("UTC", tz.getID());
    }

    @Test
    public void testConstructorsAndDeprecatedVariants() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        StdDateFormat custom = new StdDateFormat(tz, Locale.GERMAN);
        Assert.assertEquals(tz, custom.getTimeZone());

        StdDateFormat custom3 = new StdDateFormat(tz, Locale.GERMAN, Boolean.FALSE);
        Assert.assertEquals(tz, custom3.getTimeZone());
        Assert.assertFalse(custom3.isLenient());
    }

    @Test
    public void testWithTimeZone_normalAndSameAndNull() {
        TimeZone tz1 = TimeZone.getTimeZone("GMT+1");
        StdDateFormat df1 = stdDateFormat.withTimeZone(tz1);
        Assert.assertNotSame(stdDateFormat, df1);
        Assert.assertEquals(tz1, df1.getTimeZone());

        StdDateFormat dfSame = df1.withTimeZone(tz1);
        Assert.assertSame(df1, dfSame);

        StdDateFormat dfNull = df1.withTimeZone(null);
        Assert.assertEquals(StdDateFormat.getDefaultTimeZone(), dfNull.getTimeZone());

        StdDateFormat defaultTzInstance = stdDateFormat.withTimeZone(TimeZone.getTimeZone("UTC"));
        StdDateFormat sameNull = defaultTzInstance.withTimeZone(null);
        Assert.assertSame(defaultTzInstance, sameNull);
    }

    @Test
    public void testWithLocale_differentAndSame() {
        StdDateFormat df1 = stdDateFormat.withLocale(Locale.FRANCE);
        Assert.assertNotSame(stdDateFormat, df1);

        StdDateFormat dfSame = df1.withLocale(Locale.FRANCE);
        Assert.assertSame(df1, dfSame);
    }

    @Test
    public void testClone_createsIndependentCopy() {
        stdDateFormat.setTimeZone(TimeZone.getTimeZone("PST"));
        stdDateFormat.setLenient(false);

        StdDateFormat clone = stdDateFormat.clone();
        Assert.assertNotSame(stdDateFormat, clone);
        Assert.assertEquals(stdDateFormat.getTimeZone(), clone.getTimeZone());
        Assert.assertEquals(stdDateFormat.isLenient(), clone.isLenient());
    }

    @Test
    public void testGetISO8601Format_staticFactoryMethods() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateFormat df1 = StdDateFormat.getISO8601Format(tz);
        Assert.assertNotNull(df1);
        Assert.assertEquals(tz, df1.getTimeZone());

        DateFormat df2 = StdDateFormat.getISO8601Format(tz, Locale.GERMANY);
        Assert.assertNotNull(df2);
        Assert.assertEquals(tz, df2.getTimeZone());
    }

    @Test
    public void testGetRFC1123Format_staticFactoryMethods() {
        TimeZone tz = TimeZone.getTimeZone("PST");
        DateFormat df1 = StdDateFormat.getRFC1123Format(tz);
        Assert.assertNotNull(df1);
        Assert.assertEquals(tz, df1.getTimeZone());

        DateFormat df2 = StdDateFormat.getRFC1123Format(tz, Locale.UK);
        Assert.assertNotNull(df2);
        Assert.assertEquals(tz, df2.getTimeZone());
    }

    @Test
    public void testSetTimeZone_clearsFormatsAndUpdates() {
        Date date = new Date(0L);
        stdDateFormat.format(date); // Initialize formats

        TimeZone newTz = TimeZone.getTimeZone("GMT+5");
        stdDateFormat.setTimeZone(newTz);
        Assert.assertEquals(newTz, stdDateFormat.getTimeZone());

        stdDateFormat.setTimeZone(newTz);
        Assert.assertEquals(newTz, stdDateFormat.getTimeZone());
    }

    @Test
    public void testLenient_getterAndSetter() {
        Assert.assertTrue(stdDateFormat.isLenient());

        stdDateFormat.setLenient(false);
        Assert.assertFalse(stdDateFormat.isLenient());

        stdDateFormat.setLenient(false);
        Assert.assertFalse(stdDateFormat.isLenient());

        stdDateFormat.setLenient(true);
        Assert.assertTrue(stdDateFormat.isLenient());
    }

    @Test
    public void testFormat_withFieldPosition() {
        Date date = new Date(1580000000000L);
        StringBuffer sb = new StringBuffer("Date: ");
        StringBuffer result = stdDateFormat.format(date, sb, new FieldPosition(0));
        Assert.assertNotNull(result);
        Assert.assertTrue(result.toString().startsWith("Date: "));
    }

    @Test
    public void testToString_formatsProperly() {
        String str1 = stdDateFormat.toString();
        Assert.assertTrue(str1.contains("DateFormat"));
        Assert.assertTrue(str1.contains("locale: en_US"));

        StdDateFormat withTz = stdDateFormat.withTimeZone(TimeZone.getTimeZone("GMT+1"));
        String str2 = withTz.toString();
        Assert.assertTrue(str2.contains("timezone: "));
    }

    @Test
    public void testEqualsAndHashCode() {
        Assert.assertEquals(stdDateFormat, stdDateFormat);
        Assert.assertNotEquals(stdDateFormat, new StdDateFormat());
        Assert.assertNotEquals(stdDateFormat, "someString");
        Assert.assertNotEquals(stdDateFormat, null);

        Assert.assertEquals(System.identityHashCode(stdDateFormat), stdDateFormat.hashCode());
    }

    @Test
    public void testLooksLikeISO8601() {
        Assert.assertTrue(stdDateFormat.looksLikeISO8601("2020-01-01"));
        Assert.assertTrue(stdDateFormat.looksLikeISO8601("1999-12-31T23:59:59.000Z"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("202"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("2020/01/01"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("abcd-ef-gh"));
    }

    @Test
    public void testParse_plainDate() throws Exception {
        Date dt = stdDateFormat.parse("2020-01-01");
        Assert.assertNotNull(dt);

        ParsePosition pos = new ParsePosition(0);
        Date dtPos = stdDateFormat.parse("2020-01-01", pos);
        Assert.assertNotNull(dtPos);
        Assert.assertEquals(dt, dtPos);
    }

    @Test
    public void testParse_iso8601Zulu() throws Exception {
        Date dt1 = stdDateFormat.parse("2020-01-01T12:00:00.000Z");
        Assert.assertNotNull(dt1);

        Date dt2 = stdDateFormat.parse("2020-01-01T12:00:00Z");
        Assert.assertNotNull(dt2);
        Assert.assertEquals(dt1, dt2);

        ParsePosition pos = new ParsePosition(0);
        Date dtPos = stdDateFormat.parse("2020-01-01T12:00:00Z", pos);
        Assert.assertEquals(dt1, dtPos);
    }

    @Test
    public void testParse_iso8601WithTimezones() throws Exception {
        Date dtColon = stdDateFormat.parse("2020-01-01T12:00:00.000+02:00");
        Assert.assertNotNull(dtColon);

        Date dtNoColon = stdDateFormat.parse("2020-01-01T12:00:00.000+0200");
        Assert.assertEquals(dtColon, dtNoColon);

        Date dtHourOnly = stdDateFormat.parse("2020-01-01T12:00:00.000+02");
        Assert.assertEquals(dtColon, dtHourOnly);

        Date dtMinusHour = stdDateFormat.parse("2020-01-01T12:00:00.000-02");
        Assert.assertNotNull(dtMinusHour);
    }

    @Test
    public void testParse_iso8601VariedPrecisionWithTimezone() throws Exception {
        Date base = stdDateFormat.parse("2020-01-01T12:00:00.000+0000");

        Date dt11 = stdDateFormat.parse("2020-01-01T12:00:00.00+0000");
        Assert.assertEquals(base, dt11);

        Date dt10 = stdDateFormat.parse("2020-01-01T12:00:00.0+0000");
        Assert.assertEquals(base, dt10);

        Date dt9 = stdDateFormat.parse("2020-01-01T12:00:00.+0000");
        Assert.assertEquals(base, dt9);

        Date dt8 = stdDateFormat.parse("2020-01-01T12:00:00+0000");
        Assert.assertEquals(base, dt8);

        Date dt6 = stdDateFormat.parse("2020-01-01T12:00+0000");
        Assert.assertEquals(base, dt6);

        Date dt5 = stdDateFormat.parse("2020-01-01T12+0000");
        Assert.assertEquals(base, dt5);
    }

    @Test
    public void testParse_iso8601NoTimezone() throws Exception {
        Date dt1 = stdDateFormat.parse("2020-01-01T12:00:00.000");
        Assert.assertNotNull(dt1);

        Date dt11 = stdDateFormat.parse("2020-01-01T12:00:00.00");
        Assert.assertEquals(dt1, dt11);

        Date dt10 = stdDateFormat.parse("2020-01-01T12:00:00.0");
        Assert.assertEquals(dt1, dt10);

        Date dt9 = stdDateFormat.parse("2020-01-01T12:00:00.");
        Assert.assertEquals(dt1, dt9);

        Date dtDefault = stdDateFormat.parse("2020-01-01T12:00:00");
        Assert.assertEquals(dt1, dtDefault);
    }

    @Test
    public void testParse_rfc1123() throws Exception {
        String rfcStr = "Wed, 01 Jan 2020 12:00:00 GMT";
        Date dt = stdDateFormat.parse(rfcStr);
        Assert.assertNotNull(dt);

        ParsePosition pos = new ParsePosition(0);
        Date dtPos = stdDateFormat.parse(rfcStr, pos);
        Assert.assertEquals(dt, dtPos);
    }

    @Test
    public void testParse_timestampStrings() throws Exception {
        long now = 1580000000000L;
        Date dtPositive = stdDateFormat.parse(String.valueOf(now));
        Assert.assertEquals(now, dtPositive.getTime());

        long negativeTimestamp = -100000L;
        Date dtNegative = stdDateFormat.parse(String.valueOf(negativeTimestamp));
        Assert.assertEquals(negativeTimestamp, dtNegative.getTime());

        ParsePosition pos1 = new ParsePosition(0);
        Date dtPos1 = stdDateFormat.parse(String.valueOf(now), pos1);
        Assert.assertEquals(now, dtPos1.getTime());

        ParsePosition pos2 = new ParsePosition(0);
        Date dtPos2 = stdDateFormat.parse(String.valueOf(negativeTimestamp), pos2);
        Assert.assertEquals(negativeTimestamp, dtPos2.getTime());
    }

    @Test
    public void testParse_numberOutOfLongRangeFallsBackToRFC1123() {
        String outOfRange = "999999999999999999999999999999";
        try {
            stdDateFormat.parse(outOfRange);
            Assert.fail("Should have thrown ParseException");
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().contains("Can not parse date"));
        }

        ParsePosition pos = new ParsePosition(0);
        Date res = stdDateFormat.parse(outOfRange, pos);
        Assert.assertNull(res);
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidFormat_throwsParseException() throws Exception {
        stdDateFormat.parse("invalid-date-format");
    }

    @Test
    public void testParseWithPosition_invalidIso8601() {
        ParsePosition pos = new ParsePosition(0);
        Date dt = stdDateFormat.parse("2020-99-99T99:99:99", pos);
        Assert.assertNotNull(dt); // Lenient parses, but non-lenient will fail
    }

    @Test
    public void testParse_nonLenientFailure() {
        StdDateFormat nonLenient = stdDateFormat.clone();
        nonLenient.setLenient(false);

        try {
            nonLenient.parse("2020-02-31T00:00:00.000Z");
            Assert.fail("Should fail for invalid date in non-lenient mode");
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().contains("leniency? false"));
        }
    }

    @Test
    public void testParse_withDifferentLocale() throws Exception {
        StdDateFormat locFormat = stdDateFormat.withLocale(Locale.GERMANY);
        Date dt = locFormat.parse("2020-01-01T12:00:00.000Z");
        Assert.assertNotNull(dt);

        Date dtPlain = locFormat.parse("2020-01-01");
        Assert.assertNotNull(dtPlain);

        Date dtRfc = locFormat.parse("Mi., 01 Jan. 2020 12:00:00 GMT");
        Assert.assertNotNull(dtRfc);
    }

    @Test
    public void testSingletonInstance() {
        Assert.assertNotNull(StdDateFormat.instance);
        Assert.assertTrue(StdDateFormat.instance.isLenient());
    }
}
