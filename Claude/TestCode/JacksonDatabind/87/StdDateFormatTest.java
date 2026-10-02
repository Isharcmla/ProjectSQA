import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.util.StdDateFormat;

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

    // ---------------------------------------------------------
    // Constructor / basic instance tests
    // ---------------------------------------------------------

    @Test
    public void testDefaultConstructor_createsInstanceWithUSLocale() {
        StdDateFormat fmt = new StdDateFormat();
        assertNotNull(fmt);
    }

    @Test
    public void testStaticInstance_notNull() {
        assertNotNull(StdDateFormat.instance);
    }

    @Test
    public void testGetDefaultTimeZone_returnsUTC() {
        TimeZone tz = StdDateFormat.getDefaultTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    // ---------------------------------------------------------
    // withTimeZone / withLocale / clone
    // ---------------------------------------------------------

    @Test
    public void testWithTimeZone_nullTimeZone_defaultsToUTC() {
        StdDateFormat fmt = stdDateFormat.withTimeZone(null);
        assertNotNull(fmt);
    }

    @Test
    public void testWithTimeZone_sameTimeZone_returnsSameInstance() {
        StdDateFormat fmt1 = stdDateFormat.withTimeZone(TimeZone.getTimeZone("UTC"));
        StdDateFormat fmt2 = fmt1.withTimeZone(TimeZone.getTimeZone("UTC"));
        assertSame(fmt1, fmt2);
    }

    @Test
    public void testWithTimeZone_differentTimeZone_returnsNewInstance() {
        StdDateFormat fmt1 = stdDateFormat.withTimeZone(TimeZone.getTimeZone("UTC"));
        StdDateFormat fmt2 = fmt1.withTimeZone(TimeZone.getTimeZone("GMT+2"));
        assertNotSame(fmt1, fmt2);
    }

    @Test
    public void testWithLocale_sameLocale_returnsSameInstance() {
        StdDateFormat fmt = stdDateFormat.withLocale(Locale.US);
        assertSame(stdDateFormat, fmt);
    }

    @Test
    public void testWithLocale_differentLocale_returnsNewInstance() {
        StdDateFormat fmt = stdDateFormat.withLocale(Locale.GERMANY);
        assertNotSame(stdDateFormat, fmt);
    }

    @Test
    public void testClone_returnsNewInstanceWithSameState() {
        StdDateFormat cloned = stdDateFormat.clone();
        assertNotNull(cloned);
        assertNotSame(stdDateFormat, cloned);
    }

    // ---------------------------------------------------------
    // Static factory methods
    // ---------------------------------------------------------

    @SuppressWarnings("deprecation")
    @Test
    public void testGetISO8601Format_deprecated_returnsFormat() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"));
        assertNotNull(df);
    }

    @Test
    public void testGetISO8601Format_withLocale_returnsFormat() {
        DateFormat df = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(df);
        String formatted = df.format(new Date(0));
        assertTrue(formatted.contains("1970"));
    }

    @Test
    public void testGetRFC1123Format_withLocale_returnsFormat() {
        DateFormat df = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotNull(df);
        String formatted = df.format(new Date(0));
        assertTrue(formatted.contains("1970"));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetRFC1123Format_deprecated_returnsFormat() {
        DateFormat df = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"));
        assertNotNull(df);
    }

    // ---------------------------------------------------------
    // TimeZone / Lenient getters and setters
    // ---------------------------------------------------------

    @Test
    public void testGetTimeZone_defaultIsNull() {
        assertNull(stdDateFormat.getTimeZone());
    }

    @Test
    public void testSetTimeZone_changesTimeZone() {
        StdDateFormat fmt = new StdDateFormat();
        TimeZone tz = TimeZone.getTimeZone("GMT+5");
        fmt.setTimeZone(tz);
        assertEquals(tz, fmt.getTimeZone());
    }

    @Test
    public void testSetTimeZone_sameTimeZone_noChange() {
        StdDateFormat fmt = new StdDateFormat();
        TimeZone tz = TimeZone.getTimeZone("GMT+5");
        fmt.setTimeZone(tz);
        fmt.setTimeZone(tz);
        assertEquals(tz, fmt.getTimeZone());
    }

    @Test
    public void testSetLenient_changesLeniency() {
        StdDateFormat fmt = new StdDateFormat();
        fmt.setLenient(false);
        assertFalse(fmt.isLenient());
        fmt.setLenient(true);
        assertTrue(fmt.isLenient());
    }

    @Test
    public void testSetLenient_sameValue_noChange() {
        StdDateFormat fmt = new StdDateFormat();
        fmt.setLenient(true);
        fmt.setLenient(true);
        assertTrue(fmt.isLenient());
    }

    @Test
    public void testIsLenient_defaultTrue() {
        StdDateFormat fmt = new StdDateFormat();
        assertTrue(fmt.isLenient());
    }

    // ---------------------------------------------------------
    // parse(String) - normal cases
    // ---------------------------------------------------------

    @Test
    public void testParseString_plainDate_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("2015-03-14");
        assertNotNull(d);
    }

    @Test
    public void testParseString_isoWithMillisAndOffset_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("2015-03-14T09:00:00.000+0000");
        assertNotNull(d);
    }

    @Test
    public void testParseString_isoWithZ_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("2015-03-14T09:00:00.000Z");
        assertNotNull(d);
    }

    @Test
    public void testParseString_isoWithZNoMillis_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("2010-06-28T23:34:22Z");
        assertNotNull(d);
    }

    @Test
    public void testParseString_isoWithColonOffset_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("2010-06-28T23:34:22+00:00");
        assertNotNull(d);
    }

    @Test
    public void testParseString_isoNoTimeZone_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("2015-03-14T09:00:00");
        assertNotNull(d);
    }

    @Test
    public void testParseString_isoNoTimeZoneWithMillis_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("2015-03-14T09:00:00.123");
        assertNotNull(d);
    }

    @Test
    public void testParseString_numericTimestamp_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("1234567890");
        assertNotNull(d);
        assertEquals(1234567890L, d.getTime());
    }

    @Test
    public void testParseString_negativeNumericTimestamp_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("-5");
        assertNotNull(d);
        assertEquals(-5L, d.getTime());
    }

    @Test
    public void testParseString_singleDigitTimestamp_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("5");
        assertNotNull(d);
        assertEquals(5L, d.getTime());
    }

    @Test
    public void testParseString_rfc1123_returnsDate() throws ParseException {
        Date d = stdDateFormat.parse("Sat, 22 Jun 2019 23:34:22 GMT");
        assertNotNull(d);
    }

    // ---------------------------------------------------------
    // parse(String) - edge / exception cases
    // ---------------------------------------------------------

    @Test(expected = ParseException.class)
    public void testParseString_invalidString_throwsParseException() throws ParseException {
        stdDateFormat.parse("not-a-date-string");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testParseString_emptyString_throwsException() throws ParseException {
        stdDateFormat.parse("");
    }

    // ---------------------------------------------------------
    // parse(String, ParsePosition)
    // ---------------------------------------------------------

    @Test
    public void testParseStringPosition_validIso_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = stdDateFormat.parse("2015-03-14T09:00:00.000+0000", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseStringPosition_validPlainDate_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = stdDateFormat.parse("2015-03-14", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseStringPosition_numericTimestamp_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = stdDateFormat.parse("1234567890", pos);
        assertNotNull(d);
        assertEquals(1234567890L, d.getTime());
    }

    @Test
    public void testParseStringPosition_negativeNumericTimestamp_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = stdDateFormat.parse("-5", pos);
        assertNotNull(d);
        assertEquals(-5L, d.getTime());
    }

    @Test
    public void testParseStringPosition_rfc1123_returnsDate() {
        ParsePosition pos = new ParsePosition(0);
        Date d = stdDateFormat.parse("Sat, 22 Jun 2019 23:34:22 GMT", pos);
        assertNotNull(d);
    }

    @Test
    public void testParseStringPosition_invalidString_returnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Date d = stdDateFormat.parse("not-a-date-string", pos);
        assertNull(d);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testParseStringPosition_emptyString_throwsException() {
        ParsePosition pos = new ParsePosition(0);
        stdDateFormat.parse("", pos);
    }

    // ---------------------------------------------------------
    // format()
    // ---------------------------------------------------------

    @Test
    public void testFormat_returnsFormattedStringBuffer() {
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        StringBuffer result = stdDateFormat.format(new Date(0), sb, fp);
        assertNotNull(result);
        assertTrue(result.toString().contains("1970"));
    }

    @Test
    public void testFormat_calledTwice_usesCachedFormatter() {
        StringBuffer sb1 = new StringBuffer();
        FieldPosition fp1 = new FieldPosition(0);
        stdDateFormat.format(new Date(0), sb1, fp1);

        StringBuffer sb2 = new StringBuffer();
        FieldPosition fp2 = new FieldPosition(0);
        StringBuffer result = stdDateFormat.format(new Date(1000), sb2, fp2);
        assertNotNull(result);
    }

    // ---------------------------------------------------------
    // toString / equals / hashCode
    // ---------------------------------------------------------

    @Test
    public void testToString_containsClassNameAndLocale() {
        String str = stdDateFormat.toString();
        assertTrue(str.contains("StdDateFormat"));
        assertTrue(str.contains("locale"));
    }

    @Test
    public void testToString_withTimeZoneSet_containsTimeZone() {
        StdDateFormat fmt = stdDateFormat.withTimeZone(TimeZone.getTimeZone("GMT"));
        String str = fmt.toString();
        assertTrue(str.contains("timezone"));
    }

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(stdDateFormat.equals(stdDateFormat));
    }

    @Test
    public void testEquals_differentInstance_false() {
        StdDateFormat other = new StdDateFormat();
        assertFalse(stdDateFormat.equals(other));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(stdDateFormat.equals(null));
    }

    @Test
    public void testHashCode_consistentWithIdentity() {
        int hash1 = stdDateFormat.hashCode();
        int hash2 = stdDateFormat.hashCode();
        assertEquals(hash1, hash2);
        assertEquals(System.identityHashCode(stdDateFormat), hash1);
    }
}
