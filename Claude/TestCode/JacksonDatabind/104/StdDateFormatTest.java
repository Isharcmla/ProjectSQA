package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormatTest {

    private StdDateFormat defaultFormat;

    @Before
    public void setUp() {
        defaultFormat = new StdDateFormat();
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_createsInstanceWithNoTimeZone() {
        StdDateFormat fmt = new StdDateFormat();
        assertNull(fmt.getTimeZone());
    }

    @Test
    public void testDeprecatedConstructor_setsTimeZoneAndLocale() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        StdDateFormat fmt = new StdDateFormat(tz, Locale.US);
        assertEquals(tz, fmt.getTimeZone());
    }

    // ---------- Static Utility Methods ----------

    @Test
    public void testGetDefaultTimeZone_returnsUTC() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    @Test
    public void testGetISO8601Format_returnsNonNullFormat() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("GMT"), Locale.US);
        assertNotNull(df);
    }

    @Test
    public void testGetRFC1123Format_returnsNonNullFormat() {
        DateFormat df = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("GMT"), Locale.US);
        assertNotNull(df);
    }

    // ---------- withXxx methods ----------

    @Test
    public void testWithTimeZone_null_usesDefaultTimeZone() {
        StdDateFormat fmt = defaultFormat.withTimeZone(null);
        assertEquals(StdDateFormat.getDefaultTimeZone(), fmt.getTimeZone());
    }

    @Test
    public void testWithTimeZone_sameTimeZone_returnsSameInstance() {
        StdDateFormat fmt1 = defaultFormat.withTimeZone(StdDateFormat.getDefaultTimeZone());
        StdDateFormat fmt2 = fmt1.withTimeZone(StdDateFormat.getDefaultTimeZone());
        assertSame(fmt1, fmt2);
    }

    @Test
    public void testWithTimeZone_differentTimeZone_returnsNewInstance() {
        TimeZone tz1 = TimeZone.getTimeZone("GMT");
        TimeZone tz2 = TimeZone.getTimeZone("GMT+5");
        StdDateFormat fmt1 = defaultFormat.withTimeZone(tz1);
        StdDateFormat fmt2 = fmt1.withTimeZone(tz2);
        assertNotSame(fmt1, fmt2);
        assertEquals(tz2, fmt2.getTimeZone());
    }

    @Test
    public void testWithLocale_sameLocale_returnsSameInstance() {
        StdDateFormat fmt = defaultFormat.withLocale(Locale.US);
        assertSame(defaultFormat, fmt);
    }

    @Test
    public void testWithLocale_differentLocale_returnsNewInstance() {
        StdDateFormat fmt = defaultFormat.withLocale(Locale.FRANCE);
        assertNotSame(defaultFormat, fmt);
    }

    @Test
    public void testWithLenient_sameValue_returnsSameInstance() {
        StdDateFormat fmt1 = defaultFormat.withLenient(null);
        assertSame(defaultFormat, fmt1);
    }

    @Test
    public void testWithLenient_differentValue_returnsNewInstance() {
        StdDateFormat fmt = defaultFormat.withLenient(Boolean.TRUE);
        assertNotSame(defaultFormat, fmt);
    }

    @Test
    public void testWithColonInTimeZone_sameValue_returnsSameInstance() {
        StdDateFormat fmt = defaultFormat.withColonInTimeZone(false);
        assertSame(defaultFormat, fmt);
    }

    @Test
    public void testWithColonInTimeZone_differentValue_returnsNewInstance() {
        StdDateFormat fmt = defaultFormat.withColonInTimeZone(true);
        assertNotSame(defaultFormat, fmt);
        assertTrue(fmt.isColonIncludedInTimeZone());
    }

    // ---------- clone ----------

    @Test
    public void testClone_returnsNewInstanceNotSameReference() {
        StdDateFormat cloned = defaultFormat.clone();
        assertNotSame(defaultFormat, cloned);
        assertNotNull(cloned);
    }

    // ---------- getTimeZone / setTimeZone ----------

    @Test
    public void testGetTimeZone_initiallyNull() {
        assertNull(defaultFormat.getTimeZone());
    }

    @Test
    public void testSetTimeZone_changesTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+3");
        defaultFormat.setTimeZone(tz);
        assertEquals(tz, defaultFormat.getTimeZone());
    }

    @Test
    public void testSetTimeZone_sameTimeZone_noEffectiveChange() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        defaultFormat.setTimeZone(tz);
        defaultFormat.setTimeZone(tz);
        assertEquals(tz, defaultFormat.getTimeZone());
    }

    // ---------- setLenient / isLenient ----------

    @Test
    public void testIsLenient_defaultIsTrue() {
        assertTrue(defaultFormat.isLenient());
    }

    @Test
    public void testSetLenient_changesLeniency() {
        defaultFormat.setLenient(false);
        assertFalse(defaultFormat.isLenient());
    }

    @Test
    public void testSetLenient_sameValueTwice_noException() {
        defaultFormat.setLenient(true);
        defaultFormat.setLenient(true);
        assertTrue(defaultFormat.isLenient());
    }

    // ---------- isColonIncludedInTimeZone ----------

    @Test
    public void testIsColonIncludedInTimeZone_defaultFalse() {
        assertFalse(defaultFormat.isColonIncludedInTimeZone());
    }

    // ---------- parse(String) ----------

    @Test
    public void testParse_plainDate_success() throws ParseException {
        Date d = defaultFormat.parse("2020-01-01");
        assertNotNull(d);
    }

    @Test
    public void testParse_isoDateTime_success() throws ParseException {
        Date d = defaultFormat.parse("2020-01-01T10:15:30.123Z");
        assertNotNull(d);
    }

    @Test
    public void testParse_isoDateTimeWithoutMillis_success() throws ParseException {
        Date d = defaultFormat.parse("2020-01-01T10:15:30Z");
        assertNotNull(d);
    }

    @Test
    public void testParse_isoDateTimeWithOffset_success() throws ParseException {
        Date d = defaultFormat.parse("2020-01-01T10:15:30+05:00");
        assertNotNull(d);
    }

    @Test
    public void testParse_isoDateTimeWithOffsetNoColon_success() throws ParseException {
        Date d = defaultFormat.parse("2020-01-01T10:15:30-0500");
        assertNotNull(d);
    }

    @Test
    public void testParse_timestamp_success() throws ParseException {
        Date d = defaultFormat.parse("1234567890123");
        assertNotNull(d);
        assertEquals(1234567890123L, d.getTime());
    }

    @Test
    public void testParse_negativeTimestamp_success() throws ParseException {
        Date d = defaultFormat.parse("-1000");
        assertNotNull(d);
        assertEquals(-1000L, d.getTime());
    }

    @Test
    public void testParse_rfc1123_success() throws ParseException {
        Date d = defaultFormat.parse("Tue, 3 Jun 2008 11:05:30 GMT");
        assertNotNull(d);
    }

    @Test(expected = ParseException.class)
    public void testParse_invalidString_throwsParseException() throws ParseException {
        defaultFormat.parse("not-a-valid-date-string");
    }

    @Test(expected = ParseException.class)
    public void testParse_negativeNumberOutOfLongRange_throwsParseException() throws ParseException {
        defaultFormat.parse("-99999999999999999999999999999999");
    }

    @Test(expected = ParseException.class)
    public void testParse_plainMalformedDate_throwsParseException() throws ParseException {
        // Looks like plain date pattern (first chars) but full pattern match fails
        defaultFormat.parse("2020-01-0A");
    }

    @Test(expected = ParseException.class)
    public void testParse_isoMalformedDateTime_throwsParseException() throws ParseException {
        // Looks like ISO8601 (first chars) but full regex fails
        defaultFormat.parse("2020-01-01TXX:00:00");
    }

    @Test(expected = ParseException.class)
    public void testParse_fractionalSecondsTooLong_throwsParseException() throws ParseException {
        defaultFormat.parse("2020-01-01T00:00:00.1234567890Z");
    }

    @Test
    public void testParse_withParsePosition_validString_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = defaultFormat.parse("2020-01-01", pos);
        assertNotNull(d);
    }

    @Test
    public void testParse_withParsePosition_invalidString_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Date d = defaultFormat.parse("invalid-string-not-date", pos);
        assertNull(d);
    }

    // ---------- format ----------

    @Test
    public void testFormat_defaultUTC_zeroOffset_appendsPlusZero() {
        StdDateFormat fmt = new StdDateFormat();
        String result = fmt.format(new Date(0));
        assertNotNull(result);
        assertTrue(result.endsWith("+0000"));
    }

    @Test
    public void testFormat_withColonAndZeroOffset_appendsColonZero() {
        StdDateFormat fmt = new StdDateFormat().withColonInTimeZone(true);
        String result = fmt.format(new Date(0));
        assertTrue(result.endsWith("+00:00"));
    }

    @Test
    public void testFormat_withPositiveOffsetNoColon_appendsPlusOffset() {
        StdDateFormat fmt = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("GMT+05:00"));
        String result = fmt.format(new Date(0));
        assertTrue(result.contains("+0500"));
    }

    @Test
    public void testFormat_withNegativeOffsetWithColon_appendsMinusColonOffset() {
        StdDateFormat fmt = new StdDateFormat()
                .withTimeZone(TimeZone.getTimeZone("GMT-05:00"))
                .withColonInTimeZone(true);
        String result = fmt.format(new Date(0));
        assertTrue(result.contains("-05:00"));
    }

    // ---------- toString / toPattern ----------

    @Test
    public void testToString_containsClassName() {
        String s = defaultFormat.toString();
        assertTrue(s.contains("StdDateFormat"));
    }

    @Test
    public void testToPattern_defaultLenient_containsLenientText() {
        String pattern = defaultFormat.toPattern();
        assertTrue(pattern.contains("lenient"));
    }

    @Test
    public void testToPattern_strictMode_containsStrictText() {
        StdDateFormat fmt = defaultFormat.withLenient(Boolean.FALSE);
        String pattern = fmt.toPattern();
        assertTrue(pattern.contains("strict"));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(defaultFormat.equals(defaultFormat));
    }

    @Test
    public void testEquals_differentInstance_returnsFalse() {
        StdDateFormat other = new StdDateFormat();
        assertFalse(defaultFormat.equals(other));
    }

    @Test
    public void testHashCode_matchesIdentityHashCode() {
        assertEquals(System.identityHashCode(defaultFormat), defaultFormat.hashCode());
    }

    // ---------- looksLikeISO8601 (protected, same package access) ----------

    @Test
    public void testLooksLikeISO8601_validDateString_returnsTrue() {
        assertTrue(defaultFormat.looksLikeISO8601("2020-01-01"));
    }

    @Test
    public void testLooksLikeISO8601_invalidShortString_returnsFalse() {
        assertFalse(defaultFormat.looksLikeISO8601("abc"));
    }

    @Test
    public void testLooksLikeISO8601_invalidFormat_returnsFalse() {
        assertFalse(defaultFormat.looksLikeISO8601("abcdefg"));
    }

    // ---------- singleton instance ----------

    @Test
    public void testSingletonInstance_isNotNull() {
        assertNotNull(StdDateFormat.instance);
    }

    // ---------- DATE_FORMAT_STR_ISO8601 constant ----------

    @Test
    public void testDateFormatStrIso8601_hasExpectedValue() {
        assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", StdDateFormat.DATE_FORMAT_STR_ISO8601);
    }
}
