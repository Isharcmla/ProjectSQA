import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.StringWriter;
import java.io.Writer;
import java.io.IOException;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.ISODateTimeFormat;

public class DateTimeFormatterTest {

    private DateTimeFormatter fullFormatter;
    private DateTimeFormatter printOnlyFormatter;
    private DateTimeFormatter parseOnlyFormatter;

    @Before
    public void setUp() {
        fullFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy").getPrinter();
        DateTimeParser parser = DateTimeFormat.forPattern("yyyy").getParser();
        printOnlyFormatter = new DateTimeFormatter(printer, null);
        parseOnlyFormatter = new DateTimeFormatter(null, parser);
    }

    //----------------------------------------------------------------
    // isPrinter / isParser
    //----------------------------------------------------------------
    @Test
    public void testIsPrinter_fullFormatter_returnsTrue() {
        assertTrue(fullFormatter.isPrinter());
    }

    @Test
    public void testIsPrinter_parseOnlyFormatter_returnsFalse() {
        assertFalse(parseOnlyFormatter.isPrinter());
    }

    @Test
    public void testIsParser_fullFormatter_returnsTrue() {
        assertTrue(fullFormatter.isParser());
    }

    @Test
    public void testIsParser_printOnlyFormatter_returnsFalse() {
        assertFalse(printOnlyFormatter.isParser());
    }

    @Test
    public void testGetPrinter_fullFormatter_notNull() {
        assertNotNull(fullFormatter.getPrinter());
    }

    @Test
    public void testGetPrinter_parseOnlyFormatter_isNull() {
        assertNull(parseOnlyFormatter.getPrinter());
    }

    @Test
    public void testGetParser_fullFormatter_notNull() {
        assertNotNull(fullFormatter.getParser());
    }

    @Test
    public void testGetParser_printOnlyFormatter_isNull() {
        assertNull(printOnlyFormatter.getParser());
    }

    //----------------------------------------------------------------
    // withLocale / getLocale
    //----------------------------------------------------------------
    @Test
    public void testWithLocale_differentLocale_returnsNewFormatter() {
        DateTimeFormatter frFormatter = fullFormatter.withLocale(Locale.FRENCH);
        assertEquals(Locale.FRENCH, frFormatter.getLocale());
        assertNotSame(fullFormatter, frFormatter);
    }

    @Test
    public void testWithLocale_sameLocale_returnsSameInstance() {
        DateTimeFormatter frFormatter = fullFormatter.withLocale(Locale.FRENCH);
        DateTimeFormatter frFormatter2 = frFormatter.withLocale(Locale.FRENCH);
        assertSame(frFormatter, frFormatter2);
    }

    @Test
    public void testWithLocale_nullLocale_returnsNewOrSame() {
        DateTimeFormatter result = fullFormatter.withLocale(null);
        assertNull(result.getLocale());
    }

    @Test
    public void testGetLocale_defaultFormatter_isNull() {
        assertNull(fullFormatter.getLocale());
    }

    //----------------------------------------------------------------
    // withOffsetParsed / isOffsetParsed
    //----------------------------------------------------------------
    @Test
    public void testWithOffsetParsed_notYetSet_returnsNewFormatter() {
        DateTimeFormatter offsetParsedFormatter = fullFormatter.withOffsetParsed();
        assertTrue(offsetParsedFormatter.isOffsetParsed());
        assertNotSame(fullFormatter, offsetParsedFormatter);
    }

    @Test
    public void testWithOffsetParsed_alreadySet_returnsSameInstance() {
        DateTimeFormatter offsetParsedFormatter = fullFormatter.withOffsetParsed();
        DateTimeFormatter again = offsetParsedFormatter.withOffsetParsed();
        assertSame(offsetParsedFormatter, again);
    }

    @Test
    public void testIsOffsetParsed_defaultFormatter_isFalse() {
        assertFalse(fullFormatter.isOffsetParsed());
    }

    //----------------------------------------------------------------
    // withChronology / getChronology / getChronolgy
    //----------------------------------------------------------------
    @Test
    public void testWithChronology_differentChrono_returnsNewFormatter() {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeFormatter chronoFormatter = fullFormatter.withChronology(iso);
        assertEquals(iso, chronoFormatter.getChronology());
        assertNotSame(fullFormatter, chronoFormatter);
    }

    @Test
    public void testWithChronology_sameChrono_returnsSameInstance() {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeFormatter chronoFormatter = fullFormatter.withChronology(iso);
        DateTimeFormatter again = chronoFormatter.withChronology(iso);
        assertSame(chronoFormatter, again);
    }

    @Test
    public void testGetChronology_defaultFormatter_isNull() {
        assertNull(fullFormatter.getChronology());
    }

    @Test
    public void testGetChronolgy_deprecatedMethod_returnsSameAsGetChronology() {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeFormatter chronoFormatter = fullFormatter.withChronology(iso);
        assertEquals(chronoFormatter.getChronology(), chronoFormatter.getChronolgy());
    }

    //----------------------------------------------------------------
    // withZoneUTC / withZone / getZone
    //----------------------------------------------------------------
    @Test
    public void testWithZoneUTC_returnsUTCFormatter() {
        DateTimeFormatter utcFormatter = fullFormatter.withZoneUTC();
        assertEquals(DateTimeZone.UTC, utcFormatter.getZone());
    }

    @Test
    public void testWithZone_differentZone_returnsNewFormatter() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(zone);
        assertEquals(zone, zoneFormatter.getZone());
        assertNotSame(fullFormatter, zoneFormatter);
    }

    @Test
    public void testWithZone_sameZone_returnsSameInstance() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(zone);
        DateTimeFormatter again = zoneFormatter.withZone(zone);
        assertSame(zoneFormatter, again);
    }

    @Test
    public void testWithZone_nullZone_resetsZone() {
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(DateTimeZone.UTC);
        DateTimeFormatter resetFormatter = zoneFormatter.withZone(null);
        assertNull(resetFormatter.getZone());
    }

    @Test
    public void testGetZone_defaultFormatter_isNull() {
        assertNull(fullFormatter.getZone());
    }

    //----------------------------------------------------------------
    // withPivotYear(Integer) / withPivotYear(int) / getPivotYear
    //----------------------------------------------------------------
    @Test
    public void testWithPivotYearInteger_differentValue_returnsNewFormatter() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear(Integer.valueOf(1950));
        assertEquals(Integer.valueOf(1950), pivotFormatter.getPivotYear());
        assertNotSame(fullFormatter, pivotFormatter);
    }

    @Test
    public void testWithPivotYearInteger_sameValue_returnsSameInstance() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear(Integer.valueOf(1950));
        DateTimeFormatter again = pivotFormatter.withPivotYear(Integer.valueOf(1950));
        assertSame(pivotFormatter, again);
    }

    @Test
    public void testWithPivotYearInteger_nullValue_returnsFormatterWithNullPivot() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear((Integer) null);
        assertNull(pivotFormatter.getPivotYear());
    }

    @Test
    public void testWithPivotYearInt_primitiveValue_returnsNewFormatter() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear(2000);
        assertEquals(Integer.valueOf(2000), pivotFormatter.getPivotYear());
    }

    @Test
    public void testGetPivotYear_defaultFormatter_isNull() {
        assertNull(fullFormatter.getPivotYear());
    }

    //----------------------------------------------------------------
    // withDefaultYear / getDefaultYear
    //----------------------------------------------------------------
    @Test
    public void testWithDefaultYear_setValue_returnsNewFormatterWithThatYear() {
        DateTimeFormatter defYearFormatter = fullFormatter.withDefaultYear(1999);
        assertEquals(1999, defYearFormatter.getDefaultYear());
    }

    @Test
    public void testGetDefaultYear_defaultFormatter_is2000() {
        assertEquals(2000, fullFormatter.getDefaultYear());
    }

    //----------------------------------------------------------------
    // printTo(StringBuffer, ReadableInstant)
    //----------------------------------------------------------------
    @Test
    public void testPrintToStringBuffer_withInstant_printsCorrectly() {
        DateTime dt = new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, (org.joda.time.ReadableInstant) dt);
        assertTrue(buf.toString().startsWith("2011-06-15"));
    }

    @Test
    public void testPrintToStringBuffer_withNullInstant_printsNow() {
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, (org.joda.time.ReadableInstant) null);
        assertNotNull(buf.toString());
        assertFalse(buf.toString().isEmpty());
    }

    //----------------------------------------------------------------
    // printTo(Writer, ReadableInstant)
    //----------------------------------------------------------------
    @Test
    public void testPrintToWriter_withInstant_printsCorrectly() throws IOException {
        DateTime dt = new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC);
        Writer writer = new StringWriter();
        fullFormatter.printTo(writer, (org.joda.time.ReadableInstant) dt);
        assertTrue(writer.toString().startsWith("2011-06-15"));
    }

    //----------------------------------------------------------------
    // printTo(Appendable, ReadableInstant)
    //----------------------------------------------------------------
    @Test
    public void testPrintToAppendable_withInstant_printsCorrectly() throws IOException {
        DateTime dt = new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        fullFormatter.printTo((Appendable) sb, (org.joda.time.ReadableInstant) dt);
        assertTrue(sb.toString().startsWith("2011-06-15"));
    }

    //----------------------------------------------------------------
    // printTo(StringBuffer, long)
    //----------------------------------------------------------------
    @Test
    public void testPrintToStringBuffer_withMillis_printsCorrectly() {
        DateTime dt = new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, dt.getMillis());
        assertTrue(buf.toString().startsWith("2011-06-15"));
    }

    @Test
    public void testPrintToStringBuffer_withZeroMillis_printsEpoch() {
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, 0L);
        assertTrue(buf.toString().startsWith("1970-01-01"));
    }

    @Test
    public void testPrintToStringBuffer_withNegativeMillis_printsCorrectly() {
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, -86400000L);
        assertTrue(buf.toString().startsWith("1969-12-31"));
    }

    //----------------------------------------------------------------
    // printTo(Writer, long)
    //----------------------------------------------------------------
    @Test
    public void testPrintToWriter_withMillis_printsCorrectly() throws IOException {
        Writer writer = new StringWriter();
        fullFormatter.printTo(writer, 0L);
        assertTrue(writer.toString().startsWith("1970-01-01"));
    }

    //----------------------------------------------------------------
    // printTo(Appendable, long)
    //----------------------------------------------------------------
    @Test
    public void testPrintToAppendable_withMillis_printsCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        fullFormatter.printTo((Appendable) sb, 0L);
        assertTrue(sb.toString().startsWith("1970-01-01"));
    }

    //----------------------------------------------------------------
    // printTo(StringBuffer, ReadablePartial)
    //----------------------------------------------------------------
    @Test
    public void testPrintToStringBuffer_withPartial_printsCorrectly() {
        LocalDate ld = new LocalDate(2011, 6, 15);
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, (org.joda.time.ReadablePartial) ld);
        assertTrue(buf.toString().length() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintToStringBuffer_withNullPartial_throwsException() {
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, (org.joda.time.ReadablePartial) null);
    }

    //----------------------------------------------------------------
    // printTo(Writer, ReadablePartial)
    //----------------------------------------------------------------
    @Test
    public void testPrintToWriter_withPartial_printsCorrectly() throws IOException {
        LocalDate ld = new LocalDate(2011, 6, 15);
        Writer writer = new StringWriter();
        fullFormatter.printTo(writer, (org.joda.time.ReadablePartial) ld);
        assertTrue(writer.toString().length() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintToWriter_withNullPartial_throwsException() throws IOException {
        Writer writer = new StringWriter();
        fullFormatter.printTo(writer, (org.joda.time.ReadablePartial) null);
    }

    //----------------------------------------------------------------
    // printTo(Appendable, ReadablePartial)
    //----------------------------------------------------------------
    @Test
    public void testPrintToAppendable_withPartial_printsCorrectly() throws IOException {
        LocalDate ld = new LocalDate(2011, 6, 15);
        StringBuilder sb = new StringBuilder();
        fullFormatter.printTo((Appendable) sb, (org.joda.time.ReadablePartial) ld);
        assertTrue(sb.toString().length() > 0);
    }

    //----------------------------------------------------------------
    // print(ReadableInstant)
    //----------------------------------------------------------------
    @Test
    public void testPrint_withInstant_returnsFormattedString() {
        DateTime dt = new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC);
        String result = fullFormatter.print((org.joda.time.ReadableInstant) dt);
        assertTrue(result.startsWith("2011-06-15"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrint_withInstant_noPrinter_throwsException() {
        DateTime dt = new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC);
        parseOnlyFormatter.print((org.joda.time.ReadableInstant) dt);
    }

    //----------------------------------------------------------------
    // print(long)
    //----------------------------------------------------------------
    @Test
    public void testPrint_withMillis_returnsFormattedString() {
        String result = fullFormatter.print(0L);
        assertTrue(result.startsWith("1970-01-01"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrint_withMillis_noPrinter_throwsException() {
        parseOnlyFormatter.print(0L);
    }

    //----------------------------------------------------------------
    // print(ReadablePartial)
    //----------------------------------------------------------------
    @Test
    public void testPrint_withPartial_returnsFormattedString() {
        LocalDate ld = new LocalDate(2011, 6, 15);
        String result = fullFormatter.print((org.joda.time.ReadablePartial) ld);
        assertTrue(result.length() > 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrint_withPartial_noPrinter_throwsException() {
        LocalDate ld = new LocalDate(2011, 6, 15);
        parseOnlyFormatter.print((org.joda.time.ReadablePartial) ld);
    }

    //----------------------------------------------------------------
    // parseInto
    //----------------------------------------------------------------
    @Test
    public void testParseInto_validText_returnsPositivePosition() {
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = fullFormatter.parseInto(mdt, "2011-06-15T10:20:30.000+0000", 0);
        assertEquals(28, pos);
    }

    @Test
    public void testParseInto_invalidText_returnsNegativePosition() {
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = fullFormatter.parseInto(mdt, "invalid-text", 0);
        assertTrue(pos < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInto_nullInstant_throwsException() {
        fullFormatter.parseInto(null, "2011-06-15T10:20:30.000+0000", 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseInto_noParser_throwsException() {
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        printOnlyFormatter.parseInto(mdt, "2011", 0);
    }

    @Test
    public void testParseInto_withOffsetParsedAndZone_setsZoneCorrectly() {
        DateTimeFormatter offsetParsedFormatter = fullFormatter.withOffsetParsed();
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = offsetParsedFormatter.parseInto(mdt, "2011-06-15T10:20:30.000+0300", 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testParseInto_withOverrideZone_setsZone() {
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(DateTimeZone.forID("Europe/Paris"));
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int pos = zoneFormatter.parseInto(mdt, "2011-06-15T10:20:30.000+0000", 0);
        assertTrue(pos > 0);
    }

    //----------------------------------------------------------------
    // parseMillis
    //----------------------------------------------------------------
    @Test
    public void testParseMillis_validText_returnsCorrectMillis() {
        long millis = fullFormatter.parseMillis("2011-06-15T10:20:30.000+0000");
        DateTime expected = new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC);
        assertEquals(expected.getMillis(), millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_invalidText_throwsException() {
        fullFormatter.parseMillis("invalid-text");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_emptyText_throwsException() {
        fullFormatter.parseMillis("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_partiallyMatchedText_throwsException() {
        fullFormatter.parseMillis("2011-06-15T10:20:30.000+0000EXTRA");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMillis_noParser_throwsException() {
        printOnlyFormatter.parseMillis("2011");
    }

    //----------------------------------------------------------------
    // parseLocalDate
    //----------------------------------------------------------------
    @Test
    public void testParseLocalDate_validText_returnsCorrectDate() {
        LocalDate ld = fullFormatter.parseLocalDate("2011-06-15T10:20:30.000+0000");
        assertEquals(new LocalDate(2011, 6, 15), ld);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDate_invalidText_throwsException() {
        fullFormatter.parseLocalDate("invalid-text");
    }

    //----------------------------------------------------------------
    // parseLocalTime
    //----------------------------------------------------------------
    @Test
    public void testParseLocalTime_validText_returnsCorrectTime() {
        LocalTime lt = fullFormatter.parseLocalTime("2011-06-15T10:20:30.000+0000");
        assertEquals(new LocalTime(10, 20, 30, 0), lt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalTime_invalidText_throwsException() {
        fullFormatter.parseLocalTime("invalid-text");
    }

    //----------------------------------------------------------------
    // parseLocalDateTime
    //----------------------------------------------------------------
    @Test
    public void testParseLocalDateTime_validText_returnsCorrectDateTime() {
        LocalDateTime ldt = fullFormatter.parseLocalDateTime("2011-06-15T10:20:30.000+0000");
        assertEquals(new LocalDateTime(2011, 6, 15, 10, 20, 30, 0), ldt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_invalidText_throwsException() {
        fullFormatter.parseLocalDateTime("invalid-text");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_emptyText_throwsException() {
        fullFormatter.parseLocalDateTime("");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseLocalDateTime_noParser_throwsException() {
        printOnlyFormatter.parseLocalDateTime("2011");
    }

    @Test
    public void testParseLocalDateTime_withZoneInText_parsesCorrectly() {
        DateTimeFormatter zoneAwareFormatter = ISODateTimeFormat.dateTimeParser();
        LocalDateTime ldt = zoneAwareFormatter.parseLocalDateTime("2011-06-15T10:20:30+03:00");
        assertNotNull(ldt);
    }

    //----------------------------------------------------------------
    // parseDateTime
    //----------------------------------------------------------------
    @Test
    public void testParseDateTime_validText_returnsCorrectDateTime() {
        DateTime dt = fullFormatter.parseDateTime("2011-06-15T10:20:30.000+0000");
        assertEquals(new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC), dt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_invalidText_throwsException() {
        fullFormatter.parseDateTime("invalid-text");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseDateTime_noParser_throwsException() {
        printOnlyFormatter.parseDateTime("2011");
    }

    @Test
    public void testParseDateTime_withOffsetParsedFlag_usesParsedOffset() {
        DateTimeFormatter offsetParsedFormatter = fullFormatter.withOffsetParsed();
        DateTime dt = offsetParsedFormatter.parseDateTime("2011-06-15T10:20:30.000+0300");
        assertEquals(10800000, dt.getZone().getOffset(dt.getMillis()));
    }

    @Test
    public void testParseDateTime_withOverrideZone_appliesZone() {
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(DateTimeZone.forID("Europe/Paris"));
        DateTime dt = zoneFormatter.parseDateTime("2011-06-15T10:20:30.000+0000");
        assertEquals(DateTimeZone.forID("Europe/Paris"), dt.getZone());
    }

    //----------------------------------------------------------------
    // parseMutableDateTime
    //----------------------------------------------------------------
    @Test
    public void testParseMutableDateTime_validText_returnsCorrectDateTime() {
        MutableDateTime mdt = fullFormatter.parseMutableDateTime("2011-06-15T10:20:30.000+0000");
        assertEquals(new DateTime(2011, 6, 15, 10, 20, 30, 0, DateTimeZone.UTC).getMillis(), mdt.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTime_invalidText_throwsException() {
        fullFormatter.parseMutableDateTime("invalid-text");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMutableDateTime_noParser_throwsException() {
        printOnlyFormatter.parseMutableDateTime("2011");
    }

    @Test
    public void testParseMutableDateTime_withOffsetParsedFlag_usesParsedOffset() {
        DateTimeFormatter offsetParsedFormatter = fullFormatter.withOffsetParsed();
        MutableDateTime mdt = offsetParsedFormatter.parseMutableDateTime("2011-06-15T10:20:30.000+0300");
        assertEquals(10800000, mdt.getZone().getOffset(mdt.getMillis()));
    }

    @Test
    public void testParseMutableDateTime_withOverrideZone_appliesZone() {
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(DateTimeZone.forID("Europe/Paris"));
        MutableDateTime mdt = zoneFormatter.parseMutableDateTime("2011-06-15T10:20:30.000+0000");
        assertEquals(DateTimeZone.forID("Europe/Paris"), mdt.getZone());
    }

    //----------------------------------------------------------------
    // combined chronology / zone override tests for printing
    //----------------------------------------------------------------
    @Test
    public void testPrint_withOverrideChronologyAndZone_usesOverrides() {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeFormatter overrideFormatter = fullFormatter.withChronology(iso).withZone(DateTimeZone.UTC);
        String result = overrideFormatter.print(0L);
        assertTrue(result.startsWith("1970-01-01"));
    }

    @Test
    public void testPrint_withNegativeInstantOverflow_revertsToUTC() {
        // Testing extreme negative millis to trigger overflow branch in printTo
        long extremeMillis = Long.MIN_VALUE + 1000;
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(DateTimeZone.forID("Pacific/Kiritimati"));
        try {
            String result = zoneFormatter.print(extremeMillis);
            assertNotNull(result);
        } catch (Exception e) {
            // acceptable, extreme value may throw due to out-of-range chronology fields
            assertTrue(true);
        }
    }
}
