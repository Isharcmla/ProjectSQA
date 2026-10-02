package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

public class FastDateParserTest {

    private TimeZone defaultTimeZone;
    private Locale defaultLocale;

    @Before
    public void setUp() {
        defaultTimeZone = TimeZone.getTimeZone("GMT");
        defaultLocale = Locale.US;
    }

    // ---------- Accessors ----------

    @Test
    public void testGetPattern_returnsPattern() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertEquals("yyyy-MM-dd", parser.getPattern());
    }

    @Test
    public void testGetTimeZone_returnsTimeZone() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertEquals(defaultTimeZone, parser.getTimeZone());
    }

    @Test
    public void testGetLocale_returnsLocale() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertEquals(defaultLocale, parser.getLocale());
    }

    // ---------- Basic parse ----------

    @Test
    public void testParse_validDate_returnsCorrectDate() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        Date date = parser.parse("2023-05-15");
        Calendar cal = Calendar.getInstance(defaultTimeZone, defaultLocale);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidDate_throwsParseException() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        parser.parse("not-a-date");
    }

    @Test
    public void testParse_japaneseImperialLocale_unparseableDate_throwsParseExceptionWithSpecialMessage() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, FastDateParser.JAPANESE_IMPERIAL);
        try {
            parser.parse("xxxx-xx-xx");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("does not support dates before 1868"));
        }
    }

    // ---------- parse(String, ParsePosition) ----------

    @Test
    public void testParseWithPosition_validDate_updatesPosition() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-05-15", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseWithPosition_invalidDate_returnsNull() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("invalid", pos);
        assertNull(date);
    }

    @Test
    public void testParseWithPosition_offsetInMiddle_parsesCorrectly() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        ParsePosition pos = new ParsePosition(5);
        String source = "xxxxx2023-05-15";
        Date date = parser.parse(source, pos);
        assertNotNull(date);
    }

    // ---------- parseObject ----------

    @Test
    public void testParseObject_validDate_returnsDate() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        Object obj = parser.parseObject("2023-05-15");
        assertTrue(obj instanceof Date);
    }

    @Test(expected = ParseException.class)
    public void testParseObject_invalidDate_throwsParseException() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        parser.parseObject("invalid");
    }

    @Test
    public void testParseObjectWithPosition_validDate_returnsDate() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        ParsePosition pos = new ParsePosition(0);
        Object obj = parser.parseObject("2023-05-15", pos);
        assertTrue(obj instanceof Date);
    }

    @Test
    public void testParseObjectWithPosition_invalidDate_returnsNull() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        ParsePosition pos = new ParsePosition(0);
        Object obj = parser.parseObject("invalid", pos);
        assertNull(obj);
    }

    // ---------- equals / hashCode / toString ----------

    @Test
    public void testEquals_sameValues_returnsTrue() {
        FastDateParser p1 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        FastDateParser p2 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_differentPattern_returnsFalse() {
        FastDateParser p1 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        FastDateParser p2 = new FastDateParser("yyyy/MM/dd", defaultTimeZone, defaultLocale);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_differentTimeZone_returnsFalse() {
        FastDateParser p1 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), defaultLocale);
        FastDateParser p2 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), defaultLocale);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_differentLocale_returnsFalse() {
        FastDateParser p1 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, Locale.US);
        FastDateParser p2 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, Locale.FRANCE);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_notFastDateParserInstance_returnsFalse() {
        FastDateParser p1 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertFalse(p1.equals("not a parser"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        FastDateParser p1 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertFalse(p1.equals(null));
    }

    @Test
    public void testHashCode_sameValues_sameHashCode() {
        FastDateParser p1 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        FastDateParser p2 = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testToString_returnsFormattedString() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        String str = parser.toString();
        assertTrue(str.startsWith("FastDateParser["));
        assertTrue(str.contains("yyyy-MM-dd"));
    }

    // ---------- Invalid pattern ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_invalidPattern_throwsIllegalArgumentException() {
        new FastDateParser("'", defaultTimeZone, defaultLocale);
    }

    // ---------- Various format strategies ----------

    @Test
    public void testParse_timeFields_HHmmss_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("HH:mm:ss", defaultTimeZone, defaultLocale);
        Date date = parser.parse("13:45:30");
        Calendar cal = Calendar.getInstance(defaultTimeZone, defaultLocale);
        cal.setTime(date);
        assertEquals(13, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(45, cal.get(Calendar.MINUTE));
        assertEquals(30, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParse_millisecondField_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("ss.SSS", defaultTimeZone, defaultLocale);
        Date date = parser.parse("30.123");
        Calendar cal = Calendar.getInstance(defaultTimeZone, defaultLocale);
        cal.setTime(date);
        assertEquals(30, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParse_dayOfWeekText_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("EEE, dd MMM yyyy", defaultTimeZone, Locale.US);
        Date date = parser.parse("Mon, 15 May 2023");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParse_amPmField_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("hh:mm a", defaultTimeZone, Locale.US);
        Date date = parser.parse("02:30 PM");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testParse_eraField_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("G yyyy-MM-dd", defaultTimeZone, Locale.US);
        Date date = parser.parse("AD 2023-05-15");
        assertNotNull(date);
    }

    @Test
    public void testParse_dayOfYearField_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-D", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-100");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        assertEquals(100, cal.get(Calendar.DAY_OF_YEAR));
    }

    @Test
    public void testParse_weekOfYearField_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-ww", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-10");
        assertNotNull(date);
    }

    @Test
    public void testParse_weekOfMonthField_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-W", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-05-2");
        assertNotNull(date);
    }

    @Test
    public void testParse_dayOfWeekInMonthField_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-F", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-05-2");
        assertNotNull(date);
    }

    @Test
    public void testParse_hourStrategy_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("K:mm a", defaultTimeZone, Locale.US);
        Date date = parser.parse("5:30 PM");
        assertNotNull(date);
    }

    @Test
    public void testParse_moduloHourOfDayStrategy_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("H:mm", defaultTimeZone, Locale.US);
        Date date = parser.parse("24:00");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testParse_moduloHourStrategy_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("h:mm", defaultTimeZone, Locale.US);
        Date date = parser.parse("12:00");
        assertNotNull(date);
    }

    @Test
    public void testParse_numberMonthStrategy_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-05");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParse_textMonthStrategy_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MMM-dd", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-May-15");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParse_abbreviatedYearStrategy_adjustsYear() throws ParseException {
        FastDateParser parser = new FastDateParser("yy-MM-dd", defaultTimeZone, Locale.US);
        Date date = parser.parse("23-05-15");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        assertTrue(year == 1923 || year == 2023);
    }

    @Test
    public void testParse_literalYearStrategy_parsesFullYear() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, Locale.US);
        Date date = parser.parse("1999-01-01");
        Calendar cal = Calendar.getInstance(defaultTimeZone, Locale.US);
        cal.setTime(date);
        assertEquals(1999, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParse_timeZoneField_z_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm z", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-05-15 10:00 GMT");
        assertNotNull(date);
    }

    @Test
    public void testParse_timeZoneField_Z_withOffset_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm Z", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023-05-15 10:00 +0200");
        assertNotNull(date);
    }

    @Test
    public void testParse_quotedLiteralText_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("'Date:' yyyy-MM-dd", defaultTimeZone, Locale.US);
        Date date = parser.parse("Date: 2023-05-15");
        assertNotNull(date);
    }

    @Test
    public void testParse_doubleSingleQuoteLiteral_parsesCorrectly() throws ParseException {
        // '' represents a literal single quote escaped within pattern handling
        FastDateParser parser = new FastDateParser("yyyy''yy-MM-dd", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023'23-05-15");
        assertNotNull(date);
    }

    @Test
    public void testParse_whitespaceInPattern_parsesCorrectly() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy MM dd", defaultTimeZone, Locale.US);
        Date date = parser.parse("2023 05 15");
        assertNotNull(date);
    }

    // ---------- Serialization support via readObject indirectly tested through init consistency ----------

    @Test
    public void testParse_multipleCallsSameInstance_consistentResults() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        Date d1 = parser.parse("2023-05-15");
        Date d2 = parser.parse("2023-05-15");
        assertEquals(d1, d2);
    }

    @Test
    public void testParse_emptySourceWithNonEmptyPattern_throwsParseException() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        try {
            parser.parse("");
            fail("Expected ParseException for empty source");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Unparseable date"));
        }
    }

    @Test
    public void testParse_partialMatchWithTrailingGarbage_updatesPositionToMatchEnd() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-05-15 extra text", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testGetParsePattern_returnsCompiledPattern() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        assertNotNull(parser.getParsePattern());
    }

    @Test
    public void testAdjustYear_boundaryBehavior() {
        FastDateParser parser = new FastDateParser("yy", defaultTimeZone, defaultLocale);
        int adjusted = parser.adjustYear(50);
        assertTrue(adjusted > 1900);
    }

    @Test
    public void testIsNextNumber_andGetFieldWidth_notThrowing() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", defaultTimeZone, defaultLocale);
        // these are package-private helper methods invoked internally during init();
        // just verify parser constructed successfully implies no exceptions were thrown
        assertNotNull(parser.getPattern());
    }
}
