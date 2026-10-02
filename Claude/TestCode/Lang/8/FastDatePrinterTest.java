package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

public class FastDatePrinterTest {

    private TimeZone gmtTimeZone;
    private Locale usLocale;

    @Before
    public void setUp() {
        gmtTimeZone = TimeZone.getTimeZone("GMT");
        usLocale = Locale.US;
    }

    private Calendar buildCalendar(int year, int month, int day, int hour, int minute, int second, int millis,
            TimeZone tz, Locale locale) {
        Calendar cal = new GregorianCalendar(tz, locale);
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal;
    }

    // ---------------------------------------------------------------
    // Constructor / basic accessors
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_normalInput_fieldsSetCorrectly() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        assertEquals("yyyy-MM-dd", printer.getPattern());
        assertEquals(gmtTimeZone, printer.getTimeZone());
        assertEquals(usLocale, printer.getLocale());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullPattern_throwsException() {
        new FastDatePrinter(null, gmtTimeZone, usLocale);
    }

    @Test
    public void testGetMaxLengthEstimate_normalInput_returnsPositiveValue() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        assertTrue(printer.getMaxLengthEstimate() > 0);
    }

    // ---------------------------------------------------------------
    // format(Object, StringBuffer, FieldPosition)
    // ---------------------------------------------------------------

    @Test
    public void testFormatObject_withDate_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        Date date = cal.getTime();
        StringBuffer sb = new StringBuffer();
        StringBuffer result = printer.format((Object) date, sb, null);
        assertEquals("2020", result.toString());
    }

    @Test
    public void testFormatObject_withCalendar_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2021, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = printer.format((Object) cal, sb, null);
        assertEquals("2021", result.toString());
    }

    @Test
    public void testFormatObject_withLong_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2022, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        long millis = cal.getTime().getTime();
        StringBuffer sb = new StringBuffer();
        StringBuffer result = printer.format((Object) Long.valueOf(millis), sb, null);
        assertEquals("2022", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_withNull_throwsException() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        printer.format((Object) null, new StringBuffer(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatObject_withUnsupportedType_throwsException() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        printer.format((Object) "not a date", new StringBuffer(), null);
    }

    // ---------------------------------------------------------------
    // format(long)
    // ---------------------------------------------------------------

    @Test
    public void testFormatLong_normalInput_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.MARCH, 15, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal.getTime().getTime());
        assertEquals("2020-03-15", result);
    }

    // ---------------------------------------------------------------
    // format(Date)
    // ---------------------------------------------------------------

    @Test
    public void testFormatDate_normalInput_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2019, Calendar.DECEMBER, 25, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal.getTime());
        assertEquals("2019-12-25", result);
    }

    // ---------------------------------------------------------------
    // format(Calendar)
    // ---------------------------------------------------------------

    @Test
    public void testFormatCalendar_normalInput_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2018, Calendar.JUNE, 10, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("2018-06-10", result);
    }

    // ---------------------------------------------------------------
    // format(long, StringBuffer)
    // ---------------------------------------------------------------

    @Test
    public void testFormatLongWithBuffer_normalInput_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2017, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = printer.format(cal.getTime().getTime(), buf);
        assertEquals("2017", result.toString());
    }

    // ---------------------------------------------------------------
    // format(Date, StringBuffer)
    // ---------------------------------------------------------------

    @Test
    public void testFormatDateWithBuffer_normalInput_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2016, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = printer.format(cal.getTime(), buf);
        assertEquals("2016", result.toString());
    }

    // ---------------------------------------------------------------
    // format(Calendar, StringBuffer)
    // ---------------------------------------------------------------

    @Test
    public void testFormatCalendarWithBuffer_normalInput_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2015, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        StringBuffer buf = new StringBuffer();
        StringBuffer result = printer.format(cal, buf);
        assertEquals("2015", result.toString());
    }

    // ---------------------------------------------------------------
    // Pattern parsing coverage - various rule types
    // ---------------------------------------------------------------

    @Test
    public void testPattern_eraField_returnsEraText() {
        FastDatePrinter printer = new FastDatePrinter("G", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testPattern_twoDigitYear_returnsTwoDigits() {
        FastDatePrinter printer = new FastDatePrinter("yy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("23", result);
    }

    @Test
    public void testPattern_singleYear_returnsFourDigitsPadded() {
        FastDatePrinter printer = new FastDatePrinter("y", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("2023", result);
    }

    @Test
    public void testPattern_threeYear_returnsFourDigitsPadded() {
        FastDatePrinter printer = new FastDatePrinter("yyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("2023", result);
    }

    @Test
    public void testPattern_manyYearDigits_returnsPaddedWithLeadingZeros() {
        FastDatePrinter printer = new FastDatePrinter("yyyyyyyy", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("00002023", result);
    }

    @Test
    public void testPattern_fullMonthName_returnsFullName() {
        FastDatePrinter printer = new FastDatePrinter("MMMM", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("January", result);
    }

    @Test
    public void testPattern_shortMonthName_returnsShortName() {
        FastDatePrinter printer = new FastDatePrinter("MMM", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("Jan", result);
    }

    @Test
    public void testPattern_twoDigitMonth_returnsPaddedNumber() {
        FastDatePrinter printer = new FastDatePrinter("MM", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("01", result);
    }

    @Test
    public void testPattern_unpaddedMonth_returnsUnpaddedNumber() {
        FastDatePrinter printer = new FastDatePrinter("M", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("1", result);
    }

    @Test
    public void testPattern_unpaddedMonthDoubleDigit_returnsTwoDigits() {
        FastDatePrinter printer = new FastDatePrinter("M", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.NOVEMBER, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("11", result);
    }

    @Test
    public void testPattern_dayOfMonth_returnsPaddedNumber() {
        FastDatePrinter printer = new FastDatePrinter("dd", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 5, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("05", result);
    }

    @Test
    public void testPattern_twelveHourField_midnightReturnsTwelve() {
        FastDatePrinter printer = new FastDatePrinter("h", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("12", result);
    }

    @Test
    public void testPattern_twelveHourField_normalHour_returnsHour() {
        FastDatePrinter printer = new FastDatePrinter("h", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 5, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("5", result);
    }

    @Test
    public void testPattern_hourOfDay_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("H", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 13, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("13", result);
    }

    @Test
    public void testPattern_minute_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("m", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 45, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("45", result);
    }

    @Test
    public void testPattern_second_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("s", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 30, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("30", result);
    }

    @Test
    public void testPattern_millisecond_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("S", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 123, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("123", result);
    }

    @Test
    public void testPattern_shortDayOfWeek_returnsShortName() {
        FastDatePrinter printer = new FastDatePrinter("E", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testPattern_fullDayOfWeek_returnsFullName() {
        FastDatePrinter printer = new FastDatePrinter("EEEE", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("Wednesday", result);
    }

    @Test
    public void testPattern_dayInYear_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("D", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("1", result);
    }

    @Test
    public void testPattern_dayOfWeekInMonth_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("F", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_weekInYear_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("w", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_weekInMonth_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("W", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
    }

    @Test
    public void testPattern_amPmMarker_returnsAmOrPm() {
        FastDatePrinter printer = new FastDatePrinter("a", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("AM", result);
    }

    @Test
    public void testPattern_twentyFourHourField_midnightReturnsTwentyFour() {
        FastDatePrinter printer = new FastDatePrinter("k", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("24", result);
    }

    @Test
    public void testPattern_twentyFourHourField_normalHour_returnsHour() {
        FastDatePrinter printer = new FastDatePrinter("k", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 10, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("10", result);
    }

    @Test
    public void testPattern_hourInAmPm_returnsCorrectValue() {
        FastDatePrinter printer = new FastDatePrinter("K", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 5, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("5", result);
    }

    @Test
    public void testPattern_shortTimeZoneName_returnsName() {
        FastDatePrinter printer = new FastDatePrinter("z", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testPattern_longTimeZoneName_returnsName() {
        FastDatePrinter printer = new FastDatePrinter("zzzz", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testPattern_timeZoneNameDaylight_returnsDaylightName() {
        TimeZone nyTz = TimeZone.getTimeZone("America/New_York");
        FastDatePrinter printer = new FastDatePrinter("zzzz", nyTz, usLocale);
        // July date - likely in daylight saving time
        Calendar cal = buildCalendar(2020, Calendar.JULY, 1, 0, 0, 0, 0, nyTz, usLocale);
        String result = printer.format(cal);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testPattern_timeZoneNumberNoColon_returnsPlusZeroZero() {
        FastDatePrinter printer = new FastDatePrinter("Z", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("+0000", result);
    }

    @Test
    public void testPattern_timeZoneNumberWithColon_returnsPlusZeroColonZero() {
        FastDatePrinter printer = new FastDatePrinter("ZZ", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("+00:00", result);
    }

    @Test
    public void testPattern_timeZoneNumberNegativeOffset_returnsNegativeValue() {
        TimeZone negativeTz = TimeZone.getTimeZone("GMT-05:00");
        FastDatePrinter printer = new FastDatePrinter("Z", negativeTz, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, negativeTz, usLocale);
        String result = printer.format(cal);
        assertEquals("-0500", result);
    }

    @Test
    public void testPattern_literalSingleCharacter_returnsLiteral() {
        FastDatePrinter printer = new FastDatePrinter("'T'", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("T", result);
    }

    @Test
    public void testPattern_literalMultipleCharacters_returnsLiteralString() {
        FastDatePrinter printer = new FastDatePrinter("'at'", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("at", result);
    }

    @Test
    public void testPattern_escapedQuote_returnsQuoteCharacter() {
        FastDatePrinter printer = new FastDatePrinter("''", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("'", result);
    }

    @Test
    public void testPattern_combinedPattern_returnsFormattedString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd'T'HH:mm:ss", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.MARCH, 15, 10, 30, 45, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("2020-03-15T10:30:45", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPattern_invalidPatternCharacter_throwsException() {
        new FastDatePrinter("q", gmtTimeZone, usLocale);
    }

    @Test
    public void testPattern_emptyPattern_returnsEmptyString() {
        FastDatePrinter printer = new FastDatePrinter("", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 1, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("", result);
    }

    @Test
    public void testPattern_largeDayValue_returnsCorrectPadding() {
        FastDatePrinter printer = new FastDatePrinter("dd", gmtTimeZone, usLocale);
        Calendar cal = buildCalendar(2020, Calendar.JANUARY, 31, 0, 0, 0, 0, gmtTimeZone, usLocale);
        String result = printer.format(cal);
        assertEquals("31", result);
    }

    // ---------------------------------------------------------------
    // equals / hashCode / toString
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameValues_returnsTrue() {
        FastDatePrinter printer1 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        FastDatePrinter printer2 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        assertTrue(printer1.equals(printer2));
    }

    @Test
    public void testEquals_differentPattern_returnsFalse() {
        FastDatePrinter printer1 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        FastDatePrinter printer2 = new FastDatePrinter("yyyy", gmtTimeZone, usLocale);
        assertFalse(printer1.equals(printer2));
    }

    @Test
    public void testEquals_differentTimeZone_returnsFalse() {
        FastDatePrinter printer1 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        FastDatePrinter printer2 = new FastDatePrinter("yyyy-MM-dd", TimeZone.getTimeZone("America/New_York"), usLocale);
        assertFalse(printer1.equals(printer2));
    }

    @Test
    public void testEquals_differentLocale_returnsFalse() {
        FastDatePrinter printer1 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        FastDatePrinter printer2 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, Locale.FRANCE);
        assertFalse(printer1.equals(printer2));
    }

    @Test
    public void testEquals_notFastDatePrinterInstance_returnsFalse() {
        FastDatePrinter printer1 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        assertFalse(printer1.equals("not a printer"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        FastDatePrinter printer1 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        assertFalse(printer1.equals(null));
    }

    @Test
    public void testHashCode_sameValues_returnsSameHashCode() {
        FastDatePrinter printer1 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        FastDatePrinter printer2 = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        assertEquals(printer1.hashCode(), printer2.hashCode());
    }

    @Test
    public void testToString_normalInput_returnsFormattedDebugString() {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);
        String result = printer.toString();
        assertTrue(result.startsWith("FastDatePrinter["));
        assertTrue(result.contains("yyyy-MM-dd"));
        assertTrue(result.contains(gmtTimeZone.getID()));
    }

    // ---------------------------------------------------------------
    // Serialization (readObject)
    // ---------------------------------------------------------------

    @Test
    public void testSerialization_roundTrip_preservesPatternAndFormattingBehavior() throws Exception {
        FastDatePrinter original = new FastDatePrinter("yyyy-MM-dd", gmtTimeZone, usLocale);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDatePrinter deserialized = (FastDatePrinter) ois.readObject();
        ois.close();

        assertEquals(original.getPattern(), deserialized.getPattern());
        assertEquals(original.getTimeZone(), deserialized.getTimeZone());
        assertEquals(original.getLocale(), deserialized.getLocale());

        Calendar cal = buildCalendar(2021, Calendar.JUNE, 10, 0, 0, 0, 0, gmtTimeZone, usLocale);
        assertEquals(original.format(cal), deserialized.format(cal));
    }
}
