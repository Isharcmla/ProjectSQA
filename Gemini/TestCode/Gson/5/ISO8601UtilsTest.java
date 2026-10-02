package com.google.gson.internal.bind.util;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601UtilsTest {

    @Test
    public void testConstructor() {
        ISO8601Utils utils = new ISO8601Utils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testFormat_dateOnlyDefaultUtc() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 15, 8, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date);
        Assert.assertEquals("2023-01-15T08:30:45Z", formatted);
    }

    @Test
    public void testFormat_withMillisDefaultUtc() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 15, 8, 30, 45);
        cal.set(Calendar.MILLISECOND, 5);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, true);
        Assert.assertEquals("2023-01-15T08:30:45.005Z", formatted);
    }

    @Test
    public void testFormat_withPositiveTimezoneOffset() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        cal.set(2023, Calendar.DECEMBER, 5, 14, 20, 10);
        cal.set(Calendar.MILLISECOND, 500);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, true, TimeZone.getTimeZone("GMT+02:00"));
        Assert.assertEquals("2023-12-05T14:20:10.500+02:00", formatted);
    }

    @Test
    public void testFormat_withNegativeTimezoneOffset() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT-05:00"), Locale.US);
        cal.set(2023, Calendar.MARCH, 1, 9, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, false, TimeZone.getTimeZone("GMT-05:00"));
        Assert.assertEquals("2023-03-01T09:00:00-05:00", formatted);
    }

    @Test
    public void testFormat_withUtcTimezoneZeroRawOffset() {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.JULY, 4, 12, 0, 0);
        Date date = cal.getTime();

        String formatted = ISO8601Utils.format(date, false, TimeZone.getTimeZone("UTC"));
        Assert.assertEquals("2023-07-04T12:00:00Z", formatted);
    }

    @Test
    public void testParse_dateOnlyWithHyphens() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18", pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(10, pos.getIndex());

        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 18);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateOnlyWithoutHyphens() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("20230518", pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(8, pos.getIndex());

        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 18);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateTimeWithUtcZ() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25Z", pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(20, pos.getIndex());

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateTimeWithoutColonsOrHyphens() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("20230518T143025Z", pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(16, pos.getIndex());

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateTimeWithoutSeconds() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30Z", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateTimeWithOneDigitMillis() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25.5Z", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 500);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateTimeWithTwoDigitsMillis() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25.54Z", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 540);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateTimeWithThreeDigitsMillis() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25.543Z", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 543);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_dateTimeWithMoreThanThreeDigitsMillis() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25.54321Z", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 543);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_leapSecondsTruncated() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T23:59:60Z", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_withPositiveZeroTimezoneOffsetFormats() throws ParseException {
        ParsePosition pos1 = new ParsePosition(0);
        Date date1 = ISO8601Utils.parse("2023-05-18T14:30:25+00:00", pos1);

        ParsePosition pos2 = new ParsePosition(0);
        Date date2 = ISO8601Utils.parse("2023-05-18T14:30:25+0000", pos2);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 0);

        Assert.assertEquals(cal.getTime(), date1);
        Assert.assertEquals(cal.getTime(), date2);
    }

    @Test
    public void testParse_withPositiveTimezoneOffset() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25+02:00", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_withPositiveTimezoneOffsetNoColon() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25+0200", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_withNegativeTimezoneOffset() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2023-05-18T14:30:25-05:00", pos);
        Assert.assertNotNull(date);

        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT-05:00"));
        cal.set(2023, Calendar.MAY, 18, 14, 30, 25);
        cal.set(Calendar.MILLISECOND, 0);
        Assert.assertEquals(cal.getTime(), date);
    }

    @Test
    public void testParse_withStartOffsetInParsePosition() throws ParseException {
        String input = "PREFIX2023-05-18T14:30:25Z";
        ParsePosition pos = new ParsePosition(6);
        Date date = ISO8601Utils.parse(input, pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(input.length(), pos.getIndex());
    }

    @Test(expected = ParseException.class)
    public void testParse_nullDateThrowsParseException() throws ParseException {
        ISO8601Utils.parse(null, new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_emptyDateThrowsParseException() throws ParseException {
        ISO8601Utils.parse("", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_tooShortDateThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidYearDigitsThrowsParseException() throws ParseException {
        ISO8601Utils.parse("202X-01-01", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidMonthDigitsThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-XX-01", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidDayDigitsThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-01-XX", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_missingTimezoneThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-05-18T14:30:25", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidTimezoneIndicatorThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-05-18T14:30:25X", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_mismatchingTimezoneIndicatorThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-05-18T14:30:25+INVALID", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidCalendarDateNonLenientThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-02-30T10:00:00Z", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidHourThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-05-18TAX:30:25Z", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidMinuteThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-05-18T14:AX:25Z", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidSecondThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-05-18T14:30:AXZ", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidMillisFractionThrowsParseException() throws ParseException {
        ISO8601Utils.parse("2023-05-18T14:30:25.XYZ", new ParsePosition(0));
    }

    @Test
    public void testParse_exceptionMessageContainsOriginalInputAndClass() {
        try {
            ISO8601Utils.parse("invalid-date", new ParsePosition(0));
            Assert.fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to parse date [\"invalid-date']"));
            Assert.assertEquals(0, e.getErrorOffset());
            Assert.assertNotNull(e.getCause());
        }
    }
}
