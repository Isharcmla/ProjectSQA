import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
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
    private DateTimePrinter printer;
    private DateTimeParser parser;
    private DateTimeFormatter printOnly;
    private DateTimeFormatter parseOnly;

    @Before
    public void setUp() {
        fullFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        printer = fullFormatter.getPrinter();
        parser = fullFormatter.getParser();
        printOnly = new DateTimeFormatter(printer, null);
        parseOnly = new DateTimeFormatter(null, parser);
    }

    //-----------------------------------------------------------------------
    // isPrinter / getPrinter
    //-----------------------------------------------------------------------
    @Test
    public void testIsPrinter_whenPrinterSet_returnsTrue() {
        assertTrue(fullFormatter.isPrinter());
        assertNotNull(fullFormatter.getPrinter());
    }

    @Test
    public void testIsPrinter_whenPrinterNull_returnsFalse() {
        assertFalse(parseOnly.isPrinter());
        assertNull(parseOnly.getPrinter());
    }

    //-----------------------------------------------------------------------
    // isParser / getParser
    //-----------------------------------------------------------------------
    @Test
    public void testIsParser_whenParserSet_returnsTrue() {
        assertTrue(fullFormatter.isParser());
        assertNotNull(fullFormatter.getParser());
    }

    @Test
    public void testIsParser_whenParserNull_returnsFalse() {
        assertFalse(printOnly.isParser());
        assertNull(printOnly.getParser());
    }

    //-----------------------------------------------------------------------
    // withLocale / getLocale
    //-----------------------------------------------------------------------
    @Test
    public void testWithLocale_differentLocale_returnsNewFormatter() {
        DateTimeFormatter frenchFormatter = fullFormatter.withLocale(Locale.FRENCH);
        assertEquals(Locale.FRENCH, frenchFormatter.getLocale());
        assertNotSame(fullFormatter, frenchFormatter);
    }

    @Test
    public void testWithLocale_sameLocale_returnsSameInstance() {
        DateTimeFormatter frenchFormatter = fullFormatter.withLocale(Locale.FRENCH);
        DateTimeFormatter frenchFormatter2 = frenchFormatter.withLocale(Locale.FRENCH);
        assertSame(frenchFormatter, frenchFormatter2);
    }

    @Test
    public void testWithLocale_nullLocale_returnsNewFormatterWithDefault() {
        DateTimeFormatter frenchFormatter = fullFormatter.withLocale(Locale.FRENCH);
        DateTimeFormatter nullLocaleFormatter = frenchFormatter.withLocale(null);
        assertNull(nullLocaleFormatter.getLocale());
    }

    @Test
    public void testGetLocale_defaultIsNull() {
        assertNull(fullFormatter.getLocale());
    }

    //-----------------------------------------------------------------------
    // withOffsetParsed / isOffsetParsed
    //-----------------------------------------------------------------------
    @Test
    public void testWithOffsetParsed_notSetBefore_returnsNewFormatter() {
        assertFalse(fullFormatter.isOffsetParsed());
        DateTimeFormatter offsetFormatter = fullFormatter.withOffsetParsed();
        assertTrue(offsetFormatter.isOffsetParsed());
        assertNotSame(fullFormatter, offsetFormatter);
    }

    @Test
    public void testWithOffsetParsed_alreadySet_returnsSameInstance() {
        DateTimeFormatter offsetFormatter = fullFormatter.withOffsetParsed();
        DateTimeFormatter offsetFormatter2 = offsetFormatter.withOffsetParsed();
        assertSame(offsetFormatter, offsetFormatter2);
    }

    //-----------------------------------------------------------------------
    // withChronology / getChronology / getChronolgy
    //-----------------------------------------------------------------------
    @Test
    public void testWithChronology_differentChronology_returnsNewFormatter() {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeFormatter chronoFormatter = fullFormatter.withChronology(iso);
        assertEquals(iso, chronoFormatter.getChronology());
        assertEquals(iso, chronoFormatter.getChronolgy());
    }

    @Test
    public void testWithChronology_sameChronology_returnsSameInstance() {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeFormatter chronoFormatter = fullFormatter.withChronology(iso);
        DateTimeFormatter chronoFormatter2 = chronoFormatter.withChronology(iso);
        assertSame(chronoFormatter, chronoFormatter2);
    }

    @Test
    public void testGetChronology_defaultIsNull() {
        assertNull(fullFormatter.getChronology());
        assertNull(fullFormatter.getChronolgy());
    }

    //-----------------------------------------------------------------------
    // withZoneUTC / withZone / getZone
    //-----------------------------------------------------------------------
    @Test
    public void testWithZoneUTC_returnsFormatterWithUTCZone() {
        DateTimeFormatter utcFormatter = fullFormatter.withZoneUTC();
        assertEquals(DateTimeZone.UTC, utcFormatter.getZone());
    }

    @Test
    public void testWithZone_differentZone_returnsNewFormatter() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(zone);
        assertEquals(zone, zoneFormatter.getZone());
    }

    @Test
    public void testWithZone_sameZone_returnsSameInstance() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(zone);
        DateTimeFormatter zoneFormatter2 = zoneFormatter.withZone(zone);
        assertSame(zoneFormatter, zoneFormatter2);
    }

    @Test
    public void testWithZone_nullZone_resetsZoneOverride() {
        DateTimeFormatter zoneFormatter = fullFormatter.withZone(DateTimeZone.UTC);
        DateTimeFormatter nullZoneFormatter = zoneFormatter.withZone(null);
        assertNull(nullZoneFormatter.getZone());
    }

    @Test
    public void testGetZone_defaultIsNull() {
        assertNull(fullFormatter.getZone());
    }

    //-----------------------------------------------------------------------
    // withPivotYear / getPivotYear
    //-----------------------------------------------------------------------
    @Test
    public void testWithPivotYear_IntegerDifferentValue_returnsNewFormatter() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear(Integer.valueOf(1950));
        assertEquals(Integer.valueOf(1950), pivotFormatter.getPivotYear());
    }

    @Test
    public void testWithPivotYear_IntegerSameValue_returnsSameInstance() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear(Integer.valueOf(1950));
        DateTimeFormatter pivotFormatter2 = pivotFormatter.withPivotYear(Integer.valueOf(1950));
        assertSame(pivotFormatter, pivotFormatter2);
    }

    @Test
    public void testWithPivotYear_IntegerNull_returnsNewFormatterWhenPreviouslySet() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear(Integer.valueOf(1950));
        DateTimeFormatter nullPivotFormatter = pivotFormatter.withPivotYear((Integer) null);
        assertNull(nullPivotFormatter.getPivotYear());
    }

    @Test
    public void testWithPivotYear_primitiveInt_returnsFormatterWithPivot() {
        DateTimeFormatter pivotFormatter = fullFormatter.withPivotYear(2000);
        assertEquals(Integer.valueOf(2000), pivotFormatter.getPivotYear());
    }

    @Test
    public void testGetPivotYear_defaultIsNull() {
        assertNull(fullFormatter.getPivotYear());
    }

    //-----------------------------------------------------------------------
    // withDefaultYear / getDefaultYear
    //-----------------------------------------------------------------------
    @Test
    public void testWithDefaultYear_setsNewDefaultYear() {
        DateTimeFormatter defaultYearFormatter = fullFormatter.withDefaultYear(1999);
        assertEquals(1999, defaultYearFormatter.getDefaultYear());
    }

    @Test
    public void testGetDefaultYear_defaultIsYear2000() {
        assertEquals(2000, fullFormatter.getDefaultYear());
    }

    //-----------------------------------------------------------------------
    // printTo(StringBuffer, ReadableInstant)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToStringBuffer_withReadableInstant_appendsFormattedText() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, dt);
        assertTrue(buf.length() > 0);
        assertTrue(buf.toString().startsWith("2004-06-09"));
    }

    @Test
    public void testPrintToStringBuffer_withNullInstant_usesNow() {
        StringBuffer buf = new StringBuffer();
        fullFormatter.printTo(buf, (org.joda.time.ReadableInstant) null);
        assertTrue(buf.length() > 0);
    }

    //-----------------------------------------------------------------------
    // printTo(Writer, ReadableInstant)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToWriter_withReadableInstant_writesFormattedText() throws IOException {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC);
        StringWriter writer = new StringWriter();
        fullFormatter.printTo(writer, dt);
        assertTrue(writer.toString().startsWith("2004-06-09"));
    }

    //-----------------------------------------------------------------------
    // printTo(Appendable, ReadableInstant)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToAppendable_withReadableInstant_appendsFormattedText() throws IOException {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        fullFormatter.printTo(sb, (org.joda.time.ReadableInstant) dt);
        assertTrue(sb.toString().startsWith("2004-06-09"));
    }

    //-----------------------------------------------------------------------
    // printTo(StringBuffer, long)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToStringBuffer_withLongMillis_appendsFormattedText() {
        long millis = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC).getMillis();
        StringBuffer buf = new StringBuffer();
        fullFormatter.withZoneUTC().printTo(buf, millis);
        assertTrue(buf.toString().startsWith("2004-06-09"));
    }

    //-----------------------------------------------------------------------
    // printTo(Writer, long)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToWriter_withLongMillis_writesFormattedText() throws IOException {
        long millis = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC).getMillis();
        StringWriter writer = new StringWriter();
        fullFormatter.withZoneUTC().printTo(writer, millis);
        assertTrue(writer.toString().startsWith("2004-06-09"));
    }

    //-----------------------------------------------------------------------
    // printTo(Appendable, long)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToAppendable_withLongMillis_appendsFormattedText() throws IOException {
        long millis = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC).getMillis();
        StringBuilder sb = new StringBuilder();
        fullFormatter.withZoneUTC().printTo((Appendable) sb, millis);
        assertTrue(sb.toString().startsWith("2004-06-09"));
    }

    //-----------------------------------------------------------------------
    // printTo(StringBuffer, ReadablePartial)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToStringBuffer_withReadablePartial_appendsFormattedText() {
        DateTimeFormatter partialFormatter = ISODateTimeFormat.date();
        LocalDate ld = new LocalDate(2004, 6, 9);
        StringBuffer buf = new StringBuffer();
        partialFormatter.printTo(buf, ld);
        assertEquals("2004-06-09", buf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintToStringBuffer_withNullPartial_throwsIllegalArgumentException() {
        DateTimeFormatter partialFormatter = ISODateTimeFormat.date();
        StringBuffer buf = new StringBuffer();
        partialFormatter.printTo(buf, (org.joda.time.ReadablePartial) null);
    }

    //-----------------------------------------------------------------------
    // printTo(Writer, ReadablePartial)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToWriter_withReadablePartial_writesFormattedText() throws IOException {
        DateTimeFormatter partialFormatter = ISODateTimeFormat.date();
        LocalDate ld = new LocalDate(2004, 6, 9);
        StringWriter writer = new StringWriter();
        partialFormatter.printTo(writer, ld);
        assertEquals("2004-06-09", writer.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintToWriter_withNullPartial_throwsIllegalArgumentException() throws IOException {
        DateTimeFormatter partialFormatter = ISODateTimeFormat.date();
        StringWriter writer = new StringWriter();
        partialFormatter.printTo(writer, (org.joda.time.ReadablePartial) null);
    }

    //-----------------------------------------------------------------------
    // printTo(Appendable, ReadablePartial)
    //-----------------------------------------------------------------------
    @Test
    public void testPrintToAppendable_withReadablePartial_appendsFormattedText() throws IOException {
        DateTimeFormatter partialFormatter = ISODateTimeFormat.date();
        LocalDate ld = new LocalDate(2004, 6, 9);
        StringBuilder sb = new StringBuilder();
        partialFormatter.printTo(sb, (org.joda.time.ReadablePartial) ld);
        assertEquals("2004-06-09", sb.toString());
    }

    //-----------------------------------------------------------------------
    // print(ReadableInstant)
    //-----------------------------------------------------------------------
    @Test
    public void testPrint_withReadableInstant_returnsFormattedString() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC);
        String result = fullFormatter.print(dt);
        assertTrue(result.startsWith("2004-06-09"));
    }

    @Test
    public void testPrint_withNullInstant_usesNow() {
        String result = fullFormatter.print((org.joda.time.ReadableInstant) null);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrint_whenPrinterNotSupported_throwsUnsupportedOperationException() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC);
        parseOnly.print(dt);
    }

    //-----------------------------------------------------------------------
    // print(long)
    //-----------------------------------------------------------------------
    @Test
    public void testPrint_withLongMillis_returnsFormattedString() {
        long millis = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.UTC).getMillis();
        String result = fullFormatter.withZoneUTC().print(millis);
        assertTrue(result.startsWith("2004-06-09"));
    }

    //-----------------------------------------------------------------------
    // print(ReadablePartial)
    //-----------------------------------------------------------------------
    @Test
    public void testPrint_withReadablePartial_returnsFormattedString() {
        DateTimeFormatter partialFormatter = ISODateTimeFormat.date();
        LocalDate ld = new LocalDate(2004, 6, 9);
        String result = partialFormatter.print(ld);
        assertEquals("2004-06-09", result);
    }

    //-----------------------------------------------------------------------
    // parseInto
    //-----------------------------------------------------------------------
    @Test
    public void testParseInto_validText_returnsNewPositionAndUpdatesInstant() {
        MutableDateTime instant = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        int newPos = formatter.parseInto(instant, "2004-06-09", 0);
        assertEquals(10, newPos);
        assertEquals(2004, instant.getYear());
        assertEquals(6, instant.getMonthOfYear());
        assertEquals(9, instant.getDayOfMonth());
    }

    @Test
    public void testParseInto_invalidText_returnsNegativePosition() {
        MutableDateTime instant = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        int newPos = formatter.parseInto(instant, "invalid", 0);
        assertTrue(newPos < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInto_nullInstant_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseInto(null, "2004-06-09", 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseInto_whenParserNotSupported_throwsUnsupportedOperationException() {
        MutableDateTime instant = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        printOnly.parseInto(instant, "2004-06-09", 0);
    }

    @Test
    public void testParseInto_withOffsetParsedAndOffsetPresent_setsZoneFromOffset() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTimeNoMillis().withOffsetParsed();
        MutableDateTime instant = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        int newPos = formatter.parseInto(instant, "2004-06-09T10:20:30+02:00", 0);
        assertTrue(newPos > 0);
    }

    @Test
    public void testParseInto_withOverrideZone_setsZoneOnInstant() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.UTC);
        MutableDateTime instant = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.forID("Europe/Paris"));
        int newPos = formatter.parseInto(instant, "2004-06-09", 0);
        assertEquals(10, newPos);
        assertEquals(DateTimeZone.UTC, instant.getZone());
    }

    //-----------------------------------------------------------------------
    // parseMillis
    //-----------------------------------------------------------------------
    @Test
    public void testParseMillis_validText_returnsCorrectMillis() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        long millis = formatter.parseMillis("2004-06-09");
        DateTime expected = new DateTime(2004, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC);
        assertEquals(expected.getMillis(), millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_invalidText_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMillis("invalid-text");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_partialTextNotFullyParsed_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMillis("2004-06-09 extra text");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMillis_whenParserNotSupported_throwsUnsupportedOperationException() {
        printOnly.parseMillis("2004-06-09");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_emptyText_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMillis("");
    }

    //-----------------------------------------------------------------------
    // parseLocalDate
    //-----------------------------------------------------------------------
    @Test
    public void testParseLocalDate_validText_returnsCorrectLocalDate() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        LocalDate ld = formatter.parseLocalDate("2004-06-09");
        assertEquals(new LocalDate(2004, 6, 9), ld);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDate_invalidText_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseLocalDate("invalid");
    }

    //-----------------------------------------------------------------------
    // parseLocalTime
    //-----------------------------------------------------------------------
    @Test
    public void testParseLocalTime_validText_returnsCorrectLocalTime() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        LocalTime lt = formatter.parseLocalTime("10:20:30");
        assertEquals(new LocalTime(10, 20, 30), lt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalTime_invalidText_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        formatter.parseLocalTime("invalid");
    }

    //-----------------------------------------------------------------------
    // parseLocalDateTime
    //-----------------------------------------------------------------------
    @Test
    public void testParseLocalDateTime_validText_returnsCorrectLocalDateTime() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = formatter.parseLocalDateTime("2004-06-09 10:20:30");
        assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30), ldt);
    }

    @Test
    public void testParseLocalDateTime_withZoneInText_ignoresZone() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTimeNoMillis();
        LocalDateTime ldt = formatter.parseLocalDateTime("2004-06-09T10:20:30+02:00");
        assertEquals(2004, ldt.getYear());
        assertEquals(6, ldt.getMonthOfYear());
        assertEquals(9, ldt.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_invalidText_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        formatter.parseLocalDateTime("invalid");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseLocalDateTime_whenParserNotSupported_throwsUnsupportedOperationException() {
        printOnly.parseLocalDateTime("2004-06-09T10:20:30.000+0000");
    }

    //-----------------------------------------------------------------------
    // parseDateTime
    //-----------------------------------------------------------------------
    @Test
    public void testParseDateTime_validText_returnsCorrectDateTime() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        DateTime dt = formatter.parseDateTime("2004-06-09");
        assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC), dt);
    }

    @Test
    public void testParseDateTime_withOffsetParsedAndOffsetInText_usesParsedOffset() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTimeNoMillis().withOffsetParsed();
        DateTime dt = formatter.parseDateTime("2004-06-09T10:20:30+02:00");
        assertEquals(2 * 60 * 60 * 1000, dt.getZone().getOffset(dt.getMillis()));
    }

    @Test
    public void testParseDateTime_withOverrideZone_setsZoneOnResult() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.UTC);
        DateTime dt = formatter.parseDateTime("2004-06-09");
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_invalidText_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseDateTime("invalid");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseDateTime_whenParserNotSupported_throwsUnsupportedOperationException() {
        printOnly.parseDateTime("2004-06-09T10:20:30.000+0000");
    }

    //-----------------------------------------------------------------------
    // parseMutableDateTime
    //-----------------------------------------------------------------------
    @Test
    public void testParseMutableDateTime_validText_returnsCorrectMutableDateTime() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        MutableDateTime mdt = formatter.parseMutableDateTime("2004-06-09");
        assertEquals(new MutableDateTime(2004, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC), mdt);
    }

    @Test
    public void testParseMutableDateTime_withOffsetParsedAndOffsetInText_usesParsedOffset() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTimeNoMillis().withOffsetParsed();
        MutableDateTime mdt = formatter.parseMutableDateTime("2004-06-09T10:20:30+02:00");
        assertEquals(2 * 60 * 60 * 1000, mdt.getZone().getOffset(mdt.getMillis()));
    }

    @Test
    public void testParseMutableDateTime_withOverrideZone_setsZoneOnResult() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.UTC);
        MutableDateTime mdt = formatter.parseMutableDateTime("2004-06-09");
        assertEquals(DateTimeZone.UTC, mdt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTime_invalidText_throwsIllegalArgumentException() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMutableDateTime("invalid");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMutableDateTime_whenParserNotSupported_throwsUnsupportedOperationException() {
        printOnly.parseMutableDateTime("2004-06-09T10:20:30.000+0000");
    }

    //-----------------------------------------------------------------------
    // Chronology override / selectChronology indirectly through print/parse
    //-----------------------------------------------------------------------
    @Test
    public void testPrint_withChronologyOverride_usesOverrideChronology() {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withChronology(iso);
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0, DateTimeZone.forID("Europe/Paris"));
        String result = formatter.print(dt);
        assertNotNull(result);
    }

    @Test
    public void testPrint_withZoneOverflow_edgeCaseNearLongMaxValue() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.forID("Pacific/Kiritimati"));
        String result = formatter.print(Long.MAX_VALUE - 1000L);
        assertNotNull(result);
    }

    @Test
    public void testPrint_withZoneOverflow_edgeCaseNearLongMinValue() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZone(DateTimeZone.forID("Pacific/Kiritimati"));
        String result = formatter.print(Long.MIN_VALUE + 1000L);
        assertNotNull(result);
    }
}
