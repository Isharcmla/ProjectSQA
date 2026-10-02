package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeFormatterTest {

    private DateTimeZone originalZone;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalZone = DateTimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
        Locale.setDefault(originalLocale);
    }

    @Test
    public void testConstructor_andGetters() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTime();
        Assert.assertTrue(formatter.isPrinter());
        Assert.assertTrue(formatter.isParser());
        Assert.assertNotNull(formatter.getPrinter());
        Assert.assertNotNull(formatter.getParser());
        Assert.assertNull(formatter.getLocale());
        Assert.assertFalse(formatter.isOffsetParsed());
        Assert.assertNull(formatter.getChronology());
        Assert.assertNull(formatter.getChronolgy());
        Assert.assertNull(formatter.getZone());
        Assert.assertNull(formatter.getPivotYear());
        Assert.assertEquals(2000, formatter.getDefaultYear());
    }

    @Test
    public void testConstructor_nullPrinterAndParser() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        Assert.assertFalse(formatter.isPrinter());
        Assert.assertFalse(formatter.isParser());
        Assert.assertNull(formatter.getPrinter());
        Assert.assertNull(formatter.getParser());
    }

    @Test
    public void testWithLocale_sameAndDifferent() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTime();
        Assert.assertSame(formatter, formatter.withLocale(null));

        DateTimeFormatter french = formatter.withLocale(Locale.FRENCH);
        Assert.assertNotSame(formatter, french);
        Assert.assertEquals(Locale.FRENCH, french.getLocale());
        Assert.assertSame(french, french.withLocale(Locale.FRENCH));
        Assert.assertSame(french, french.withLocale(new Locale("fr")));

        DateTimeFormatter uk = french.withLocale(Locale.UK);
        Assert.assertEquals(Locale.UK, uk.getLocale());
    }

    @Test
    public void testWithOffsetParsed_sameAndToggle() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTime();
        Assert.assertFalse(formatter.isOffsetParsed());

        DateTimeFormatter withOffset = formatter.withOffsetParsed();
        Assert.assertTrue(withOffset.isOffsetParsed());
        Assert.assertNull(withOffset.getZone());
        Assert.assertSame(withOffset, withOffset.withOffsetParsed());

        DateTimeFormatter withZone = withOffset.withZone(DateTimeZone.forOffsetHours(2));
        Assert.assertFalse(withZone.isOffsetParsed());
        Assert.assertEquals(DateTimeZone.forOffsetHours(2), withZone.getZone());
    }

    @Test
    public void testWithChronology_sameAndDifferent() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTime();
        Assert.assertSame(formatter, formatter.withChronology(null));

        Chronology chrono = BuddhistChronology.getInstanceUTC();
        DateTimeFormatter buddhist = formatter.withChronology(chrono);
        Assert.assertNotSame(formatter, buddhist);
        Assert.assertEquals(chrono, buddhist.getChronology());
        Assert.assertEquals(chrono, buddhist.getChronolgy());
        Assert.assertSame(buddhist, buddhist.withChronology(chrono));

        DateTimeFormatter iso = buddhist.withChronology(ISOChronology.getInstanceUTC());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), iso.getChronology());
    }

    @Test
    public void testWithZone_andWithZoneUTC() {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTime();
        Assert.assertSame(formatter, formatter.withZone(null));

        DateTimeZone zoneParis = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter paris = formatter.withZone(zoneParis);
        Assert.assertNotSame(formatter, paris);
        Assert.assertEquals(zoneParis, paris.getZone());
        Assert.assertSame(paris, paris.withZone(zoneParis));

        DateTimeFormatter utc = paris.withZoneUTC();
        Assert.assertEquals(DateTimeZone.UTC, utc.getZone());
        Assert.assertSame(utc, utc.withZone(DateTimeZone.UTC));
    }

    @Test
    public void testWithPivotYear_integerAndInt() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yy-MM-dd");
        Assert.assertNull(formatter.getPivotYear());
        Assert.assertSame(formatter, formatter.withPivotYear((Integer) null));

        DateTimeFormatter pivot2020 = formatter.withPivotYear(2020);
        Assert.assertEquals(Integer.valueOf(2020), pivot2020.getPivotYear());
        Assert.assertSame(pivot2020, pivot2020.withPivotYear(Integer.valueOf(2020)));
        Assert.assertSame(pivot2020, pivot2020.withPivotYear(2020));

        DateTimeFormatter pivot1950 = pivot2020.withPivotYear(Integer.valueOf(1950));
        Assert.assertEquals(Integer.valueOf(1950), pivot1950.getPivotYear());

        DateTime dt20 = pivot2020.parseDateTime("20-01-01");
        DateTime dt50 = pivot1950.parseDateTime("20-01-01");
        Assert.assertEquals(2020, dt20.getYear());
        Assert.assertEquals(2020, dt50.getYear());
    }

    @Test
    public void testWithDefaultYear() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM-dd");
        Assert.assertEquals(2000, formatter.getDefaultYear());

        DateTimeFormatter def1980 = formatter.withDefaultYear(1980);
        Assert.assertEquals(1980, def1980.getDefaultYear());
        DateTime parsed = def1980.parseDateTime("02-29");
        Assert.assertEquals(1980, parsed.getYear());
        Assert.assertEquals(2, parsed.getMonthOfYear());
        Assert.assertEquals(29, parsed.getDayOfMonth());
    }

    @Test
    public void testPrint_ReadableInstant() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 10, 30, 0, 0, DateTimeZone.UTC);

        String result = formatter.print(dt);
        Assert.assertEquals("2023-05-12 10:30:00", result);

        long now = System.currentTimeMillis();
        DateTimeUtils.setCurrentMillisFixed(now);
        try {
            String resultNull = formatter.print((ReadableInstant) null);
            Assert.assertEquals(formatter.print(now), resultNull);
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    @Test
    public void testPrint_long() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 10, 30, 0, 0, DateTimeZone.UTC);
        String result = formatter.print(dt.getMillis());
        Assert.assertEquals("2023-05-12 10:30:00", result);
    }

    @Test
    public void testPrint_ReadablePartial() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        LocalDate date = new LocalDate(2023, 5, 12);
        String result = formatter.print(date);
        Assert.assertEquals("2023-05-12", result);
    }

    @Test
    public void testPrintTo_StringBuffer_ReadableInstant() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 0, 0, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer("Date: ");
        formatter.printTo(buf, dt);
        Assert.assertEquals("Date: 2023-05-12", buf.toString());

        long now = 1000000L;
        DateTimeUtils.setCurrentMillisFixed(now);
        try {
            StringBuffer bufNull = new StringBuffer();
            formatter.printTo(bufNull, (ReadableInstant) null);
            Assert.assertEquals(formatter.print(now), bufNull.toString());
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    @Test
    public void testPrintTo_Writer_ReadableInstant() throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 0, 0, 0, DateTimeZone.UTC);
        StringWriter writer = new StringWriter();
        formatter.printTo(writer, dt);
        Assert.assertEquals("2023-05-12", writer.toString());

        long now = 2000000L;
        DateTimeUtils.setCurrentMillisFixed(now);
        try {
            StringWriter writerNull = new StringWriter();
            formatter.printTo(writerNull, (ReadableInstant) null);
            Assert.assertEquals(formatter.print(now), writerNull.toString());
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    @Test
    public void testPrintTo_Appendable_ReadableInstant() throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 0, 0, 0, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, (ReadableInstant) dt);
        Assert.assertEquals("2023-05-12", sb.toString());
    }

    @Test
    public void testPrintTo_StringBuffer_long() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 0, 0, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, dt.getMillis());
        Assert.assertEquals("2023-05-12", buf.toString());
    }

    @Test
    public void testPrintTo_Writer_long() throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 0, 0, 0, DateTimeZone.UTC);
        StringWriter writer = new StringWriter();
        formatter.printTo(writer, dt.getMillis());
        Assert.assertEquals("2023-05-12", writer.toString());
    }

    @Test
    public void testPrintTo_Appendable_long() throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 12, 0, 0, 0, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, dt.getMillis());
        Assert.assertEquals("2023-05-12", sb.toString());
    }

    @Test
    public void testPrintTo_StringBuffer_ReadablePartial() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        LocalTime time = new LocalTime(14, 30, 45);
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, time);
        Assert.assertEquals("14:30:45", buf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_StringBuffer_ReadablePartial_nullThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        formatter.printTo(new StringBuffer(), (ReadablePartial) null);
    }

    @Test
    public void testPrintTo_Writer_ReadablePartial() throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        LocalTime time = new LocalTime(14, 30, 45);
        StringWriter writer = new StringWriter();
        formatter.printTo(writer, time);
        Assert.assertEquals("14:30:45", writer.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_Writer_ReadablePartial_nullThrows() throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        formatter.printTo(new StringWriter(), (ReadablePartial) null);
    }

    @Test
    public void testPrintTo_Appendable_ReadablePartial() throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        LocalTime time = new LocalTime(14, 30, 45);
        StringBuilder sb = new StringBuilder();
        formatter.printTo((Appendable) sb, (ReadablePartial) time);
        Assert.assertEquals("14:30:45", sb.toString());
    }

    @Test
    public void testPrint_withChronologyAndZoneOverride() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
                .withChronology(ISOChronology.getInstanceUTC())
                .withZone(DateTimeZone.forOffsetHours(3));

        DateTime dt = new DateTime(2023, 5, 12, 10, 0, 0, DateTimeZone.UTC);
        String result = formatter.print(dt);
        Assert.assertEquals("2023-05-12 13:00:00", result);
    }

    @Test
    public void testPrint_timeZoneOffsetOverflowRevertToUTC() throws IOException {
        DateTimeZone largePositiveZone = DateTimeZone.forOffsetHours(5);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZone(largePositiveZone);
        long overflowInstant = Long.MAX_VALUE - 1000L;

        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, overflowInstant);
        Assert.assertNotNull(buf.toString());

        StringWriter writer = new StringWriter();
        formatter.printTo(writer, overflowInstant);
        Assert.assertEquals(buf.toString(), writer.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrint_noPrinterThrows() {
        DateTimeParser parser = DateTimeFormat.forPattern("yyyy-MM-dd").getParser();
        DateTimeFormatter parserOnly = new DateTimeFormatter(null, parser);
        parserOnly.print(new DateTime());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrintLong_noPrinterThrows() {
        DateTimeParser parser = DateTimeFormat.forPattern("yyyy-MM-dd").getParser();
        DateTimeFormatter parserOnly = new DateTimeFormatter(null, parser);
        parserOnly.print(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrintPartial_noPrinterThrows() {
        DateTimeParser parser = DateTimeFormat.forPattern("yyyy-MM-dd").getParser();
        DateTimeFormatter parserOnly = new DateTimeFormatter(null, parser);
        parserOnly.print(new LocalDate());
    }

    @Test
    public void testParseInto_success() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "2023-05-12 14:30:00", 0);
        Assert.assertEquals(19, pos);
        Assert.assertEquals(2023, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(12, mdt.getDayOfMonth());
        Assert.assertEquals(14, mdt.getHourOfDay());
        Assert.assertEquals(30, mdt.getMinuteOfHour());
        Assert.assertEquals(0, mdt.getSecondOfMinute());
    }

    @Test
    public void testParseInto_withOffsetParsedAndZoneOverride() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z")
                .withOffsetParsed()
                .withZone(DateTimeZone.forOffsetHours(5));

        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "2023-05-12 14:30:00 +0200", 0);
        Assert.assertEquals(25, pos);
        Assert.assertEquals(DateTimeZone.forOffsetHours(5), mdt.getZone());
    }

    @Test
    public void testParseInto_withOffsetParsedWithoutZoneOverride() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z").withOffsetParsed();
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "2023-05-12 14:30:00 +0200", 0);
        Assert.assertEquals(25, pos);
        Assert.assertEquals(DateTimeZone.forOffsetHours(2), mdt.getZone());
    }

    @Test
    public void testParseInto_withNamedZoneInBucket() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss zzz");
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "2023-05-12 14:30:00 UTC", 0);
        Assert.assertEquals(23, pos);
        Assert.assertEquals(DateTimeZone.UTC, mdt.getZone());
    }

    @Test
    public void testParseInto_failureReturnsNegative() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        int pos = formatter.parseInto(mdt, "invalid-date", 0);
        Assert.assertTrue(pos < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInto_nullInstantThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseInto(null, "2023-05-12", 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseInto_noParserThrows() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy-MM-dd").getPrinter();
        DateTimeFormatter printerOnly = new DateTimeFormatter(printer, null);
        printerOnly.parseInto(new MutableDateTime(), "2023-05-12", 0);
    }

    @Test
    public void testParseMillis_valid() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        long millis = formatter.parseMillis("2023-05-12 14:30:00");
        DateTime dt = new DateTime(2023, 5, 12, 14, 30, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals(dt.getMillis(), millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_invalidTextThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMillis("not-a-date");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_partialMatchThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMillis("2023-05-12 extra text");
    }

    @Test
    public void testParseLocalDate_valid() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate date = formatter.parseLocalDate("2023-05-12 14:30:00");
        Assert.assertEquals(new LocalDate(2023, 5, 12), date);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDate_invalidThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseLocalDate("bad");
    }

    @Test
    public void testParseLocalTime_valid() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        LocalTime time = formatter.parseLocalTime("2023-05-12 14:30:15");
        Assert.assertEquals(new LocalTime(14, 30, 15), time);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalTime_invalidThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        formatter.parseLocalTime("bad");
    }

    @Test
    public void testParseLocalDateTime_validWithOffsetAndZone() {
        DateTimeFormatter formatterWithOffset = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        LocalDateTime ldt = formatterWithOffset.parseLocalDateTime("2023-05-12 14:30:00 +0200");
        Assert.assertEquals(new LocalDateTime(2023, 5, 12, 14, 30, 0), ldt);

        DateTimeFormatter formatterWithZone = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss zzz");
        LocalDateTime ldt2 = formatterWithZone.parseLocalDateTime("2023-05-12 14:30:00 UTC");
        Assert.assertEquals(new LocalDateTime(2023, 5, 12, 14, 30, 0), ldt2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_invalidThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseLocalDateTime("bad");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLocalDateTime_incompleteMatchThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseLocalDateTime("2023-05-12trailing");
    }

    @Test
    public void testParseDateTime_validAndBranches() {
        DateTimeFormatter formatterNoOffset = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
                .withZone(DateTimeZone.UTC);
        DateTime dt1 = formatterNoOffset.parseDateTime("2023-05-12 14:30:00");
        Assert.assertEquals(new DateTime(2023, 5, 12, 14, 30, 0, DateTimeZone.UTC), dt1);

        DateTimeFormatter formatterOffsetParsed = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z")
                .withOffsetParsed();
        DateTime dt2 = formatterOffsetParsed.parseDateTime("2023-05-12 14:30:00 +0300");
        Assert.assertEquals(DateTimeZone.forOffsetHours(3), dt2.getZone());

        DateTimeFormatter formatterNamedZone = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss zzz");
        DateTime dt3 = formatterNamedZone.parseDateTime("2023-05-12 14:30:00 UTC");
        Assert.assertEquals(DateTimeZone.UTC, dt3.getZone());

        DateTimeFormatter formatterWithZoneOverride = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
                .withZone(DateTimeZone.forOffsetHours(1));
        DateTime dt4 = formatterWithZoneOverride.parseDateTime("2023-05-12 14:30:00");
        Assert.assertEquals(DateTimeZone.forOffsetHours(1), dt4.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_invalidThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseDateTime("bad");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateTime_incompleteMatchThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseDateTime("2023-05-12 trailing");
    }

    @Test
    public void testParseMutableDateTime_validAndBranches() {
        DateTimeFormatter formatterNoOffset = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
                .withZone(DateTimeZone.UTC);
        MutableDateTime mdt1 = formatterNoOffset.parseMutableDateTime("2023-05-12 14:30:00");
        Assert.assertEquals(new MutableDateTime(2023, 5, 12, 14, 30, 0, 0, DateTimeZone.UTC), mdt1);

        DateTimeFormatter formatterOffsetParsed = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z")
                .withOffsetParsed();
        MutableDateTime mdt2 = formatterOffsetParsed.parseMutableDateTime("2023-05-12 14:30:00 +0300");
        Assert.assertEquals(DateTimeZone.forOffsetHours(3), mdt2.getZone());

        DateTimeFormatter formatterNamedZone = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss zzz");
        MutableDateTime mdt3 = formatterNamedZone.parseMutableDateTime("2023-05-12 14:30:00 UTC");
        Assert.assertEquals(DateTimeZone.UTC, mdt3.getZone());

        DateTimeFormatter formatterWithZoneOverride = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
                .withZone(DateTimeZone.forOffsetHours(1));
        MutableDateTime mdt4 = formatterWithZoneOverride.parseMutableDateTime("2023-05-12 14:30:00");
        Assert.assertEquals(DateTimeZone.forOffsetHours(1), mdt4.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTime_invalidThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMutableDateTime("invalid-date");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMutableDateTime_incompleteMatchThrows() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        formatter.parseMutableDateTime("2023-05-12extra");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParse_noParserThrows_parseMillis() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy-MM-dd").getPrinter();
        DateTimeFormatter printerOnly = new DateTimeFormatter(printer, null);
        printerOnly.parseMillis("2023-05-12");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParse_noParserThrows_parseLocalDate() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy-MM-dd").getPrinter();
        DateTimeFormatter printerOnly = new DateTimeFormatter(printer, null);
        printerOnly.parseLocalDate("2023-05-12");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParse_noParserThrows_parseLocalTime() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy-MM-dd").getPrinter();
        DateTimeFormatter printerOnly = new DateTimeFormatter(printer, null);
        printerOnly.parseLocalTime("12:00:00");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParse_noParserThrows_parseLocalDateTime() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy-MM-dd").getPrinter();
        DateTimeFormatter printerOnly = new DateTimeFormatter(printer, null);
        printerOnly.parseLocalDateTime("2023-05-12T12:00:00");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParse_noParserThrows_parseDateTime() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy-MM-dd").getPrinter();
        DateTimeFormatter printerOnly = new DateTimeFormatter(printer, null);
        printerOnly.parseDateTime("2023-05-12T12:00:00");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParse_noParserThrows_parseMutableDateTime() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy-MM-dd").getPrinter();
        DateTimeFormatter printerOnly = new DateTimeFormatter(printer, null);
        printerOnly.parseMutableDateTime("2023-05-12T12:00:00");
    }
}
