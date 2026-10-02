import com.google.gson.internal.bind.util.ISO8601Utils;
import org.junit.Test;
import org.junit.Before;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class ISO8601UtilsTest {

    private Date buildUtcDate(int year, int month, int day, int hour, int minute, int second, int millis) {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        cal.clear();
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal.getTime();
    }

    // ---------------------------------------------------------------
    // format(Date) tests
    // ---------------------------------------------------------------

    @Test
    public void testFormatDate_normalInput_returnsIso8601StringWithZ() {
        Date date = buildUtcDate(2023, Calendar.MARCH, 15, 10, 30, 45, 0);
        String result = ISO8601Utils.format(date);
        assertEquals("2023-03-15T10:30:45Z", result);
    }

    @Test(expected = NullPointerException.class)
    public void testFormatDate_nullDate_throwsNullPointerException() {
        ISO8601Utils.format(null);
    }

    // ---------------------------------------------------------------
    // format(Date, boolean) tests
    // ---------------------------------------------------------------

    @Test
    public void testFormatDateBoolean_millisTrue_includesMilliseconds() {
        Date date = buildUtcDate(2023, Calendar.MARCH, 15, 10, 30, 45, 123);
        String result = ISO8601Utils.format(date, true);
        assertEquals("2023-03-15T10:30:45.123Z", result);
    }

    @Test
    public void testFormatDateBoolean_millisFalse_excludesMilliseconds() {
        Date date = buildUtcDate(2023, Calendar.MARCH, 15, 10, 30, 45, 123);
        String result = ISO8601Utils.format(date, false);
        assertEquals("2023-03-15T10:30:45Z", result);
    }

    @Test
    public void testFormatDateBoolean_millisZero_padsWithZeros() {
        Date date = buildUtcDate(2023, Calendar.JANUARY, 1, 0, 0, 0, 5);
        String result = ISO8601Utils.format(date, true);
        assertEquals("2023-01-01T00:00:00.005Z", result);
    }

    // ---------------------------------------------------------------
    // format(Date, boolean, TimeZone) tests
    // ---------------------------------------------------------------

    @Test
    public void testFormatDateBooleanTimeZone_positiveOffset_returnsCorrectOffsetString() {
        Date date = buildUtcDate(2023, Calendar.MARCH, 15, 10, 30, 45, 0);
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        String result = ISO8601Utils.format(date, false, tz);
        assertEquals("2023-03-15T12:30:45+02:00", result);
    }

    @Test
    public void testFormatDateBooleanTimeZone_negativeOffset_returnsCorrectOffsetString() {
        Date date = buildUtcDate(2023, Calendar.MARCH, 15, 10, 30, 45, 0);
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        String result = ISO8601Utils.format(date, false, tz);
        assertEquals("2023-03-15T05:30:45-05:00", result);
    }

    @Test
    public void testFormatDateBooleanTimeZone_utcTimeZone_returnsZ() {
        Date date = buildUtcDate(2023, Calendar.MARCH, 15, 10, 30, 45, 0);
        TimeZone tz = TimeZone.getTimeZone("UTC");
        String result = ISO8601Utils.format(date, false, tz);
        assertEquals("2023-03-15T10:30:45Z", result);
    }

    @Test
    public void testFormatDateBooleanTimeZone_withMillisAndOffset_returnsCorrectString() {
        Date date = buildUtcDate(2023, Calendar.MARCH, 15, 10, 30, 45, 500);
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        String result = ISO8601Utils.format(date, true, tz);
        assertEquals("2023-03-15T12:30:45.500+02:00", result);
    }

    // ---------------------------------------------------------------
    // parse(String, ParsePosition) tests - normal cases
    // ---------------------------------------------------------------

    @Test
    public void testParse_dateOnlyWithDashes_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15", pos);

        Calendar expected = new GregorianCalendar(2023, Calendar.MARCH, 15);
        assertEquals(expected.getTime(), result);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParse_dateOnlyWithoutDashes_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("20230315", pos);

        Calendar expected = new GregorianCalendar(2023, Calendar.MARCH, 15);
        assertEquals(expected.getTime(), result);
        assertEquals(8, pos.getIndex());
    }

    @Test
    public void testParse_dateTimeWithZ_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45Z", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        assertEquals(expected.getTime(), result);
        assertEquals("2023-03-15T10:30:45Z".length(), pos.getIndex());
    }

    @Test
    public void testParse_dateTimeWithMilliseconds_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45.123Z", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        expected.set(Calendar.MILLISECOND, 123);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_dateTimeWithSingleDigitMillisecond_returnsScaledMillis() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45.1Z", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        expected.set(Calendar.MILLISECOND, 100);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_dateTimeWithTwoDigitMillisecond_returnsScaledMillis() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45.12Z", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        expected.set(Calendar.MILLISECOND, 120);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_dateTimeWithPositiveOffsetColon_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45+02:00", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_dateTimeWithPositiveOffsetNoColon_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45+0200", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_dateTimeWithPlusZeroZeroZeroZero_returnsUtcDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45+0000", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_dateTimeWithPlusZeroZeroColonZeroZero_returnsUtcDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45+00:00", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_dateTimeWithNegativeOffset_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:45-05:00", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("GMT-05:00"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_leapSecond_truncatesTo59() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30:60Z", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 59);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_timeWithoutSeconds_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T10:30Z", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_timeWithoutColons_returnsCorrectDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("2023-03-15T1030Z", pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testParse_startingAtNonZeroOffset_parsesFromOffset() throws ParseException {
        String data = "prefix2023-03-15T10:30:45Z";
        ParsePosition pos = new ParsePosition(6);
        Date result = ISO8601Utils.parse(data, pos);

        Calendar expected = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        expected.clear();
        expected.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        assertEquals(expected.getTime(), result);
        assertEquals(data.length(), pos.getIndex());
    }

    // ---------------------------------------------------------------
    // parse(String, ParsePosition) tests - edge / exception cases
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testParse_nullDate_throwsNullPointerException() throws ParseException {
        ISO8601Utils.parse(null, new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_emptyString_throwsParseException() throws ParseException {
        ISO8601Utils.parse("", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidYearNumber_throwsParseException() throws ParseException {
        ISO8601Utils.parse("abcd-03-15", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidTimezoneIndicator_throwsParseException() throws ParseException {
        ISO8601Utils.parse("2023-03-15T10:30:45X", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_noTimeZoneIndicator_throwsParseException() throws ParseException {
        ISO8601Utils.parse("2023-03-15T10:30:45", new ParsePosition(0));
    }

    @Test(expected = ParseException.class)
    public void testParse_mismatchingTimeZone_throwsParseException() throws ParseException {
        ISO8601Utils.parse("2023-03-15T10:30:45+25:70", new ParsePosition(0));
    }

    @Test
    public void testParse_parseExceptionMessage_containsInputAndReason() {
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("invalid-date-string", pos);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Failed to parse date"));
        }
    }

    @Test
    public void testParse_causeIsSetOnParseException() {
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("2023-03-15T10:30:45X", pos);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertNotNull(e.getCause());
        }
    }
}
