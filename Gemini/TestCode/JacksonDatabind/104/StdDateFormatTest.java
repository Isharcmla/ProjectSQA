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
    public void testGetDefaultTimeZone_returnsUtc() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        Assert.assertNotNull(tz);
        Assert.assertEquals("UTC", tz.getID());
    }

    @Test
    public void testConstructors_allVariants() {
        StdDateFormat dfDefault = new StdDateFormat();
        Assert.assertNull(dfDefault.getTimeZone());
        Assert.assertTrue(dfDefault.isLenient());
        Assert.assertFalse(dfDefault.isColonIncludedInTimeZone());

        TimeZone tzPST = TimeZone.getTimeZone("PST");
        StdDateFormat dfDeprecated = new StdDateFormat(tzPST, Locale.GERMANY);
        Assert.assertEquals(tzPST, dfDeprecated.getTimeZone());
        Assert.assertTrue(dfDeprecated.isLenient());

        StdDateFormat dfLenient = new StdDateFormat(tzPST, Locale.US, Boolean.FALSE);
        Assert.assertFalse(dfLenient.isLenient());

        StdDateFormat dfColon = new StdDateFormat(tzPST, Locale.US, Boolean.TRUE, true);
        Assert.assertTrue(dfColon.isColonIncludedInTimeZone());
        Assert.assertTrue(dfColon.isLenient());
    }

    @Test
    public void testWithTimeZone_changesOrRetainsInstance() {
        TimeZone tzEST = TimeZone.getTimeZone("EST");
        StdDateFormat modified = stdDateFormat.withTimeZone(tzEST);
        Assert.assertNotSame(stdDateFormat, modified);
        Assert.assertEquals(tzEST, modified.getTimeZone());

        StdDateFormat sameTz = modified.withTimeZone(tzEST);
        Assert.assertSame(modified, sameTz);

        StdDateFormat withNullTz = stdDateFormat.withTimeZone(null);
        Assert.assertNotNull(withNullTz);
    }

    @Test
    public void testWithLocale_changesOrRetainsInstance() {
        StdDateFormat modified = stdDateFormat.withLocale(Locale.FRANCE);
        Assert.assertNotSame(stdDateFormat, modified);

        StdDateFormat sameLocale = modified.withLocale(Locale.FRANCE);
        Assert.assertSame(modified, sameLocale);
    }

    @Test
    public void testWithLenient_changesOrRetainsInstance() {
        StdDateFormat strict = stdDateFormat.withLenient(Boolean.FALSE);
        Assert.assertNotSame(stdDateFormat, strict);
        Assert.assertFalse(strict.isLenient());

        StdDateFormat sameStrict = strict.withLenient(Boolean.FALSE);
        Assert.assertSame(strict, sameStrict);

        StdDateFormat backToDefault = strict.withLenient(null);
        Assert.assertNotSame(strict, backToDefault);
        Assert.assertTrue(backToDefault.isLenient());
    }

    @Test
    public void testWithColonInTimeZone_changesOrRetainsInstance() {
        StdDateFormat withColon = stdDateFormat.withColonInTimeZone(true);
        Assert.assertNotSame(stdDateFormat, withColon);
        Assert.assertTrue(withColon.isColonIncludedInTimeZone());

        StdDateFormat sameColon = withColon.withColonInTimeZone(true);
        Assert.assertSame(withColon, sameColon);

        StdDateFormat withoutColon = withColon.withColonInTimeZone(false);
        Assert.assertFalse(withoutColon.isColonIncludedInTimeZone());
    }

    @Test
    public void testClone_createsDistinctCopy() {
        StdDateFormat clone = stdDateFormat.clone();
        Assert.assertNotNull(clone);
        Assert.assertNotSame(stdDateFormat, clone);
        Assert.assertEquals(stdDateFormat.isLenient(), clone.isLenient());
        Assert.assertEquals(stdDateFormat.isColonIncludedInTimeZone(), clone.isColonIncludedInTimeZone());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testStaticFormatGetters_returnsConfiguredInstances() {
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        DateFormat isoFormat = StdDateFormat.getISO8601Format(tz, Locale.US);
        Assert.assertNotNull(isoFormat);
        Assert.assertEquals(tz, isoFormat.getTimeZone());

        DateFormat rfcFormat = StdDateFormat.getRFC1123Format(tz, Locale.GERMANY);
        Assert.assertNotNull(rfcFormat);
        Assert.assertEquals(tz, rfcFormat.getTimeZone());
    }

    @Test
    public void testSetTimeZoneAndSetLenient_mutatesAndClearsState() {
        StdDateFormat df = new StdDateFormat();
        TimeZone tz1 = TimeZone.getTimeZone("GMT+1");
        df.setTimeZone(tz1);
        Assert.assertEquals(tz1, df.getTimeZone());

        df.setTimeZone(tz1);
        Assert.assertEquals(tz1, df.getTimeZone());

        df.setLenient(false);
        Assert.assertFalse(df.isLenient());

        df.setLenient(false);
        Assert.assertFalse(df.isLenient());
    }

    @Test
    public void testToStringAndToPattern_returnsExpectedDescriptions() {
        String str = stdDateFormat.toString();
        Assert.assertTrue(str.contains("StdDateFormat"));

        String pattern = stdDateFormat.toPattern();
        Assert.assertTrue(pattern.contains("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        Assert.assertTrue(pattern.contains("lenient"));

        StdDateFormat strict = stdDateFormat.withLenient(Boolean.FALSE);
        Assert.assertTrue(strict.toPattern().contains("strict"));
    }

    @Test
    public void testEqualsAndHashCode_identitySemantics() {
        Assert.assertEquals(stdDateFormat, stdDateFormat);
        Assert.assertNotEquals(stdDateFormat, new StdDateFormat());
        Assert.assertNotEquals(stdDateFormat, null);
        Assert.assertNotEquals(stdDateFormat, "other type");
        Assert.assertEquals(System.identityHashCode(stdDateFormat), stdDateFormat.hashCode());
    }

    @Test
    public void testParse_plainIso8601Date() throws Exception {
        Date d = stdDateFormat.parse("2021-05-18");
        Assert.assertNotNull(d);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(d);
        Assert.assertEquals(2021, cal.get(Calendar.YEAR));
        Assert.assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        Assert.assertEquals(18, cal.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testParse_iso8601WithVariousOffsetsAndFractions() throws Exception {
        Date d1 = stdDateFormat.parse("2021-05-18T10:30Z");
        Assert.assertNotNull(d1);

        Date d2 = stdDateFormat.parse("2021-05-18T10:30:45Z");
        Assert.assertNotNull(d2);

        Date d3 = stdDateFormat.parse("2021-05-18T10:30:45.1Z");
        Date d4 = stdDateFormat.parse("2021-05-18T10:30:45.12Z");
        Date d5 = stdDateFormat.parse("2021-05-18T10:30:45.123Z");
        Date d6 = stdDateFormat.parse("2021-05-18T10:30:45.123456789Z");
        Assert.assertNotNull(d3);
        Assert.assertNotNull(d4);
        Assert.assertNotNull(d5);
        Assert.assertNotNull(d6);

        Date dOffsetPositive = stdDateFormat.parse("2021-05-18T10:30:45+02");
        Date dOffsetColon = stdDateFormat.parse("2021-05-18T10:30:45+02:00");
        Date dOffsetNoColon = stdDateFormat.parse("2021-05-18T10:30:45-0500");
        Assert.assertNotNull(dOffsetPositive);
        Assert.assertNotNull(dOffsetColon);
        Assert.assertNotNull(dOffsetNoColon);
    }

    @Test
    public void testParse_rfc1123Format() throws Exception {
        Date d = stdDateFormat.parse("Tue, 18 May 2021 10:30:45 GMT");
        Assert.assertNotNull(d);
    }

    @Test
    public void testParse_numericTimestamps() throws Exception {
        Date d1 = stdDateFormat.parse("1621333845000");
        Assert.assertEquals(1621333845000L, d1.getTime());

        Date d2 = stdDateFormat.parse("-1000");
        Assert.assertEquals(-1000L, d2.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidFormat_throwsParseException() throws Exception {
        stdDateFormat.parse("not-a-valid-date-string");
    }

    @Test(expected = ParseException.class)
    public void testParse_numericOutOfRange_throwsParseException() throws Exception {
        stdDateFormat.parse("999999999999999999999999999999");
    }

    @Test(expected = ParseException.class)
    public void testParse_excessiveFractions_throwsParseException() throws Exception {
        stdDateFormat.parse("2021-05-18T10:30:45.1234567890Z");
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidIsoLikePattern_throwsParseException() throws Exception {
        stdDateFormat.parse("2021-05-1");
    }

    @Test
    public void testParseWithPosition_validAndInvalid() {
        ParsePosition pos = new ParsePosition(0);
        Date d = stdDateFormat.parse("2021-05-18T10:30:45Z", pos);
        Assert.assertNotNull(d);

        ParsePosition invalidPos = new ParsePosition(0);
        Date dInvalid = stdDateFormat.parse("invalid-date", invalidPos);
        Assert.assertNull(dInvalid);
    }

    @Test
    public void testFormat_withDefaultUtcAndOffsets() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2021, Calendar.MAY, 18, 9, 5, 3);
        cal.set(Calendar.MILLISECOND, 7);
        Date date = cal.getTime();

        StringBuffer sb = new StringBuffer();
        stdDateFormat.format(date, sb, new FieldPosition(0));
        Assert.assertEquals("2021-05-18T09:05:03.007+0000", sb.toString());

        StdDateFormat colonDf = stdDateFormat.withColonInTimeZone(true);
        StringBuffer sbColon = new StringBuffer();
        colonDf.format(date, sbColon, new FieldPosition(0));
        Assert.assertEquals("2021-05-18T09:05:03.007+00:00", sbColon.toString());

        TimeZone tzPositive = TimeZone.getTimeZone("GMT+05:30");
        StdDateFormat posOffsetDf = stdDateFormat.withTimeZone(tzPositive).withColonInTimeZone(true);
        StringBuffer sbPos = new StringBuffer();
        posOffsetDf.format(date, sbPos, new FieldPosition(0));
        Assert.assertEquals("2021-05-18T14:35:03.007+05:30", sbPos.toString());

        TimeZone tzNegative = TimeZone.getTimeZone("GMT-04:00");
        StdDateFormat negOffsetDf = stdDateFormat.withTimeZone(tzNegative).withColonInTimeZone(false);
        StringBuffer sbNeg = new StringBuffer();
        negOffsetDf.format(date, sbNeg, new FieldPosition(0));
        Assert.assertEquals("2021-05-18T05:05:03.007-0400", sbNeg.toString());
    }

    @Test
    public void testFormat_paddingBranchesForDateComponents() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(Calendar.ERA, GregorianCalendar.AD);
        cal.set(5, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        StringBuffer sb = new StringBuffer();
        stdDateFormat.format(date, sb, new FieldPosition(0));
        Assert.assertTrue(sb.toString().startsWith("0005-01-01T00:00:00.000"));

        cal.set(12345, Calendar.NOVEMBER, 25, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 120);
        date = cal.getTime();
        sb = new StringBuffer();
        stdDateFormat.format(date, sb, new FieldPosition(0));
        Assert.assertTrue(sb.toString().contains("12345-11-25T23:59:59.120"));
    }

    @Test
    public void testLooksLikeISO8601_branches() {
        Assert.assertTrue(stdDateFormat.looksLikeISO8601("2021-05-18"));
        Assert.assertTrue(stdDateFormat.looksLikeISO8601("2021-05-18T10:00:00Z"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("202"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("abcd-ef-gh"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("2021/05/18"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("202a-05-18"));
        Assert.assertFalse(stdDateFormat.looksLikeISO8601("2021-a5-18"));
    }
}
