import com.fasterxml.jackson.databind.util.StdDateFormat;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormatTest {

    private StdDateFormat format;

    @Before
    public void setUp() {
        format = new StdDateFormat();
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_createsInstance_withDefaultLocale() {
        StdDateFormat f = new StdDateFormat();
        assertNotNull(f);
        assertNull(f.getTimeZone());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructor_withTimeZoneAndLocale_setsFields() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        StdDateFormat f = new StdDateFormat(tz, Locale.US);
        assertEquals(tz, f.getTimeZone());
    }

    // ---------- getDefaultTimeZone ----------

    @Test
    public void testGetDefaultTimeZone_returnsUTC() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    // ---------- withTimeZone ----------

    @Test
    public void testWithTimeZone_nullArgument_usesDefaultTimeZone() {
        StdDateFormat f = format.withTimeZone(null);
        assertNotNull(f);
        assertEquals(StdDateFormat.getDefaultTimeZone(), f.getTimeZone());
    }

    @Test
    public void testWithTimeZone_differentTimeZone_returnsNewInstance() {
        TimeZone tz = TimeZone.getTimeZone("America/Chicago");
        StdDateFormat f = format.withTimeZone(tz);
        assertNotSame(format, f);
        assertEquals(tz, f.getTimeZone());
    }

    @Test
    public void testWithTimeZone_sameTimeZoneAsCurrent_returnsSameInstance() {
        // default _timezone is null; withTimeZone(null) internally becomes DEFAULT_TIMEZONE
        StdDateFormat f1 = format.withTimeZone(StdDateFormat.getDefaultTimeZone());
        StdDateFormat f2 = f1.withTimeZone(StdDateFormat.getDefaultTimeZone());
        assertSame(f1, f2);
    }

    // ---------- withLocale ----------

    @Test
    public void testWithLocale_sameLocale_returnsSameInstance() {
        StdDateFormat f = format.withLocale(Locale.US);
        assertSame(format, f);
    }

    @Test
    public void testWithLocale_differentLocale_returnsNewInstance() {
        StdDateFormat f = format.withLocale(Locale.GERMANY);
        assertNotSame(format, f);
    }

    // ---------- clone ----------

    @Test
    public void testClone_returnsEquivalentButDifferentInstance() {
        StdDateFormat f = format.clone();
        assertNotSame(format, f);
        assertEquals(format.getTimeZone(), f.getTimeZone());
    }

    // ---------- getISO8601Format ----------

    @SuppressWarnings("deprecation")
    @Test
    public void testGetISO8601Format_deprecatedOverload_returnsDateFormat() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"));
        assertNotNull(df);
    }

    @Test
    public void testGetISO8601Format_withLocale_returnsDateFormat() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(df);
    }

    @Test
    public void testGetISO8601Format_withDifferentLocale_createsNewSimpleDateFormat() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"), Locale.GERMANY);
        assertNotNull(df);
    }

    @Test
    public void testGetISO8601Format_withNullTimeZone_usesDefaultTimeZone() {
        DateFormat df = StdDateFormat.getISO8601Format(null, Locale.GERMANY);
        assertNotNull(df);
    }

    // ---------- getRFC1123Format ----------

    @Test
    public void testGetRFC1123Format_withLocale_returnsDateFormat() {
        DateFormat df = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(df);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetRFC1123Format_deprecatedOverload_returnsDateFormat() {
        DateFormat df = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"));
        assertNotNull(df);
    }

    // ---------- getTimeZone / setTimeZone ----------

    @Test
    public void testGetTimeZone_defaultInstance_returnsNull() {
        assertNull(format.getTimeZone());
    }

    @Test
    public void testSetTimeZone_newTimeZone_updatesTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        format.setTimeZone(tz);
        assertEquals(tz, format.getTimeZone());
    }

    @Test
    public void testSetTimeZone_sameTimeZoneTwice_doesNotThrow() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        format.setTimeZone(tz);
        format.setTimeZone(tz);
        assertEquals(tz, format.getTimeZone());
    }

    // ---------- isLenient ----------

    @Test
    public void testIsLenient_defaultInstance_returnsTrue() {
        assertTrue(format.isLenient());
    }

    @Test
    public void testIsLenient_afterSetLenientFalse_stillTrueSinceFieldNotOverridden() {
        // setLenient() is inherited from DateFormat and doesn't touch the internal
        // _lenient field, so isLenient() should still report true.
        format.setLenient(false);
        assertTrue(format.isLenient());
    }

    // ---------- parse(String) ----------

    @Test
    public void testParseString_plainDate_returnsValidDate() throws ParseException {
        Date d = format.parse("2015-05-25");
        assertNotNull(d);
    }

    @Test
    public void testParseString_iso8601WithZulu_returnsValidDate() throws ParseException {
        Date d = format.parse("2015-05-25T17:12:00.000Z");
        assertNotNull(d);
    }

    @Test
    public void testParseString_iso8601ZuluMissingMillis_returnsValidDate() throws ParseException {
        Date d = format.parse("2015-05-25T17:12:00Z");
        assertNotNull(d);
    }

    @Test
    public void testParseString_iso8601WithColonTimeZone_returnsValidDate() throws ParseException {
        Date d = format.parse("2015-05-25T17:12:00.000+01:00");
        assertNotNull(d);
    }

    @Test
    public void testParseString_iso8601WithFourDigitTimeZone_returnsValidDate() throws ParseException {
        Date d = format.parse("2015-05-25T17:12:00.000+0100");
        assertNotNull(d);
    }

    @Test
    public void testParseString_iso8601WithHourOnlyTimeZone_returnsValidDate() throws ParseException {
        Date d = format.parse("2015-05-25T17:12:00.000+01");
        assertNotNull(d);
    }

    @Test
    public void testParseString_iso8601NoTimeZoneNoZ_returnsValidDate() throws ParseException {
        Date d = format.parse("2015-05-25T17:12:00");
        assertNotNull(d);
    }

    @Test
    public void testParseString_rfc1123Format_returnsValidDate() throws ParseException {
        Date d = format.parse("Sat, 30 Nov 2002 08:45:30 GMT");
        assertNotNull(d);
    }

    @Test
    public void testParseString_plainTimestampPositive_returnsValidDate() throws ParseException {
        Date d = format.parse("1420070400000");
        assertNotNull(d);
        assertEquals(1420070400000L, d.getTime());
    }

    @Test
    public void testParseString_plainTimestampNegative_returnsValidDate() throws ParseException {
        Date d = format.parse("-1420070400000");
        assertNotNull(d);
        assertEquals(-1420070400000L, d.getTime());
    }

    @Test(expected = ParseException.class)
    public void testParseString_invalidDateString_throwsParseException() throws ParseException {
        format.parse("not-a-valid-date");
    }

    @Test
    public void testParseString_withLeadingTrailingWhitespace_trimsAndParses() throws ParseException {
        Date d = format.parse("  2015-05-25  ");
        assertNotNull(d);
    }

    // ---------- parse(String, ParsePosition) ----------

    @Test
    public void testParseWithPosition_validISO8601_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = format.parse("2015-05-25T17:12:00.000Z", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseWithPosition_validTimestamp_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = format.parse("1420070400000", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseWithPosition_validNegativeTimestamp_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = format.parse("-1420070400000", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseWithPosition_validRFC1123_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = format.parse("Sat, 30 Nov 2002 08:45:30 GMT", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseWithPosition_invalidString_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Date d = format.parse("not-a-valid-date", pos);
        assertNull(d);
    }

    // ---------- format ----------

    @Test
    public void testFormat_validDate_returnsFormattedStringBuffer() {
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        StringBuffer result = format.format(new Date(0), sb, fp);
        assertNotNull(result);
        assertTrue(result.toString().contains("1970"));
    }

    @Test
    public void testFormat_calledTwice_reusesCachedFormatter() {
        StringBuffer sb1 = new StringBuffer();
        FieldPosition fp1 = new FieldPosition(0);
        format.format(new Date(0), sb1, fp1);

        StringBuffer sb2 = new StringBuffer();
        FieldPosition fp2 = new FieldPosition(0);
        StringBuffer result2 = format.format(new Date(1000), sb2, fp2);
        assertNotNull(result2);
    }

    // ---------- toString ----------

    @Test
    public void testToString_defaultInstance_doesNotContainTimezoneLabel() {
        String s = format.toString();
        assertNotNull(s);
        assertFalse(s.contains("(timezone:"));
        assertTrue(s.contains("(locale:"));
    }

    @Test
    public void testToString_withTimeZoneSet_containsTimezoneLabel() {
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        String s = format.toString();
        assertTrue(s.contains("(timezone:"));
    }

    // ---------- singleton instance ----------

    @Test
    public void testSingletonInstance_isNotNull() {
        assertNotNull(StdDateFormat.instance);
    }
}
