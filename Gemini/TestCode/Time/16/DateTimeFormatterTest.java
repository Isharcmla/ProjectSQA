package org.joda.time.format;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
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
    public void testConstructor_and_isPrinter_isParser_getters() {
        DateTimeFormatter full = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS Z");
        Assert.assertTrue(full.isPrinter());
        Assert.assertTrue(full.isParser());
        Assert.assertNotNull(full.getPrinter());
        Assert.assertNotNull(full.getParser());
        Assert.assertNull(full.getLocale());
        Assert.assertFalse(full.isOffsetParsed());
        Assert.assertNull(full.getChronology());
        Assert.assertNull(full.getChronolgy());
        Assert.assertNull(full.getZone());
        Assert.assertNull(full.getPivotYear());
        Assert.assertEquals(2000, full.getDefaultYear());

        DateTimeFormatter printerOnly = new DateTimeFormatter(full.getPrinter(), null);
        Assert.assertTrue(printerOnly.isPrinter());
        Assert.assertFalse(printerOnly.isParser());
        Assert.assertNotNull(printerOnly.getPrinter());
        Assert.assertNull(printerOnly.getParser());

        DateTimeFormatter parserOnly = new DateTimeFormatter(null, full.getParser());
        Assert.assertFalse(parserOnly.isPrinter());
        Assert.assertTrue(parserOnly.isParser());
        Assert.assertNull(parserOnly.getPrinter());
        Assert.assertNotNull(parserOnly.getParser());

        DateTimeFormatter neither = new DateTimeFormatter(null, null);
        Assert.assertFalse(neither.isPrinter());
        Assert.assertFalse(neither.isParser());
    }

    @Test
    public void testWithLocale_normalAndEdgeCases() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        Assert.assertNull(f.getLocale());

        DateTimeFormatter sameNull = f.withLocale(null);
        Assert.assertSame(f, sameNull);

        DateTimeFormatter french = f.withLocale(Locale.FRENCH);
        Assert.assertEquals(Locale.FRENCH, french.getLocale());

        DateTimeFormatter frenchSame = french.withLocale(Locale.FRENCH);
        Assert.assertSame(french, frenchSame);

        DateTimeFormatter frenchEqual = french.withLocale(new Locale("fr"));
        Assert.assertSame(french, frenchEqual);

        DateTimeFormatter backToNull = french.withLocale(null);
        Assert.assertNull(backToNull.getLocale());
        Assert.assertNotSame(french, backToNull);
    }

    @Test
    public void testWithOffsetParsed_toggle() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd Z");
        Assert.assertFalse(f.isOffsetParsed());

        DateTimeFormatter offsetParsed = f.withOffsetParsed();
        Assert.assertTrue(offsetParsed.isOffsetParsed());
        Assert.assertNull(offsetParsed.getZone());

        DateTimeFormatter sameOffsetParsed = offsetParsed.withOffsetParsed();
        Assert.assertSame(offsetParsed, sameOffsetParsed);

        DateTimeFormatter withZoneResetsOffsetParsed = offsetParsed.withZone(DateTimeZone.UTC);
        Assert.assertFalse(withZoneResetsOffsetParsed.isOffsetParsed());
        Assert.assertEquals(DateTimeZone.UTC, withZoneResetsOffsetParsed.getZone());
    }

    @Test
    public void testWithChronology_and_getChronolgy() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        Assert.assertNull(f.getChronology());

        Chronology chrono = BuddhistChronology.getInstanceUTC();
        DateTimeFormatter f2 = f.withChronology(chrono);
        Assert.assertEquals(chrono, f2.getChronology());
        Assert.assertEquals(chrono, f2.getChronolgy());

        DateTimeFormatter f2Same = f2.withChronology(chrono);
        Assert.assertSame(f2, f2Same);

        DateTimeFormatter f3 = f2.withChronology(null);
        Assert.assertNull(f3.getChronology());
    }

    @Test
    public void testWithZone_and_withZoneUTC() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        Assert.assertNull(f.getZone());

        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter fParis = f.withZone(paris);
        Assert.assertEquals(paris, fParis.getZone());

        DateTimeFormatter fParisSame = fParis.withZone(paris);
        Assert.assertSame(fParis, fParisSame);

        DateTimeFormatter fUTC = fParis.withZoneUTC();
        Assert.assertEquals(DateTimeZone.UTC, fUTC.getZone());

        DateTimeFormatter fNull = fUTC.withZone(null);
        Assert.assertNull(fNull.getZone());
    }

    @Test
    public void testWithPivotYear_integerAndInt() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yy-MM-dd");
        Assert.assertNull(f.getPivotYear());

        DateTimeFormatter fPivot = f.withPivotYear(2020);
        Assert.assertEquals(Integer.valueOf(2020), fPivot.getPivotYear());

        DateTimeFormatter fPivotSame = fPivot.withPivotYear(Integer.valueOf(2020));
        Assert.assertSame(fPivot, fPivotSame);

        DateTimeFormatter fPivotNull = fPivot.withPivotYear((Integer) null);
        Assert.assertNull(fPivotNull.getPivotYear());

        DateTimeFormatter fPivotNullSame = fPivotNull.withPivotYear((Integer) null);
        Assert.assertSame(fPivotNull, fPivotNullSame);
    }

    @Test
    public void testWithDefaultYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("MM-dd");
        Assert.assertEquals(2000, f.getDefaultYear());

        DateTimeFormatter f2024 = f.withDefaultYear(2024);
        Assert.assertEquals(2024, f2024.getDefaultYear());
    }

    @Test
    public void testPrint_ReadableInstant() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);

        String result = f.print(dt);
        Assert.assertEquals("2023-05-10 14:30:00", result);

        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        try {
            String resultNullInstant = f.print((ReadableInstant) null);
            Assert.assertEquals("2023-05-10 14:30:00", resultNullInstant);
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    @Test
    public void testPrint_long() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);
        String result = f.print(dt.getMillis());
        Assert.assertEquals("2023-05-10 14:30:00", result);
    }

    @Test
    public void testPrint_ReadablePartial() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        LocalDate date = new LocalDate(2023, 5, 10);
        String result = f.print(date);
        Assert.assertEquals("2023-05-10", result);
    }

    @Test
    public void testPrintTo_StringBuffer_ReadableInstant() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer("Date: ");
        f.printTo(buf, dt);
        Assert.assertEquals("Date: 2023-05-10 14:30:00", buf.toString());
    }

    @Test
    public void testPrintTo_Writer_ReadableInstant() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);
        StringWriter sw = new StringWriter();
        f.printTo(sw, dt);
        Assert.assertEquals("2023-05-10 14:30:00", sw.toString());

        StringWriter swNull = new StringWriter();
        f.printTo(swNull, (ReadableInstant) null);
        Assert.assertFalse(swNull.toString().isEmpty());
    }

    @Test
    public void testPrintTo_Appendable_ReadableInstant() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        f.printTo((Appendable) sb, dt);
        Assert.assertEquals("2023-05-10 14:30:00", sb.toString());
    }

    @Test
    public void testPrintTo_StringBuffer_long() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);
        StringBuffer buf = new StringBuffer();
        f.printTo(buf, dt.getMillis());
        Assert.assertEquals("2023-05-10 14:30:00", buf.toString());
    }

    @Test
    public void testPrintTo_Writer_long() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);
        StringWriter sw = new StringWriter();
        f.printTo(sw, dt.getMillis());
        Assert.assertEquals("2023-05-10 14:30:00", sw.toString());
    }

    @Test
    public void testPrintTo_Appendable_long() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC);
        StringBuilder sb = new StringBuilder();
        f.printTo((Appendable) sb, dt.getMillis());
        Assert.assertEquals("2023-05-10 14:30:00", sb.toString());
    }

    @Test
    public void testPrintTo_StringBuffer_ReadablePartial() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        StringBuffer buf = new StringBuffer();
        f.printTo(buf, new LocalDate(2023, 5, 10));
        Assert.assertEquals("2023-05-10", buf.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_StringBuffer_ReadablePartial_null() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        f.printTo(new StringBuffer(), (ReadablePartial) null);
    }

    @Test
    public void testPrintTo_Writer_ReadablePartial() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        StringWriter sw = new StringWriter();
        f.printTo(sw, new LocalDate(2023, 5, 10));
        Assert.assertEquals("2023-05-10", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTo_Writer_ReadablePartial_null() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        f.printTo(new StringWriter(), (ReadablePartial) null);
    }

    @Test
    public void testPrintTo_Appendable_ReadablePartial() throws IOException {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        StringBuilder sb = new StringBuilder();
        f.printTo((Appendable) sb, new LocalDate(2023, 5, 10));
        Assert.assertEquals("2023-05-10", sb.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequirePrinter_throwsWhenNoPrinter() {
        DateTimeFormatter parserOnly = new DateTimeFormatter(null, DateTimeFormat.forPattern("yyyy").getParser());
        parserOnly.print(0L);
    }

    @Test
    public void testPrint_timezoneOverflowBranch() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS")
                .withZone(DateTimeZone.forOffsetHours(5));
        long overflowInstant = Long.MAX_VALUE - 1000L;
        String resultBuf = f.print(overflowInstant);
        Assert.assertNotNull(resultBuf);

        StringWriter sw = new StringWriter();
        try {
            f.printTo(sw, overflowInstant);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertEquals(resultBuf, sw.toString());
    }

    @Test
    public void testParseInto_successAndModifiers() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);

        int pos = f.parseInto(mdt, "2023-05-10 14:30:00 +0200", 0);
        Assert.assertEquals(26, pos);
        Assert.assertEquals(new DateTime(2023, 5, 10, 12, 30, 0, DateTimeZone.UTC).getMillis(), mdt.getMillis());

        DateTimeFormatter fOffsetParsed = f.withOffsetParsed();
        mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        fOffsetParsed.parseInto(mdt, "2023-05-10 14:30:00 +0200", 0);
        Assert.assertEquals(DateTimeZone.forOffsetHours(2), mdt.getZone());

        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        DateTimeFormatter fZone = f.withZone(tokyo);
        mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        fZone.parseInto(mdt, "2023-05-10 14:30:00 +0200", 0);
        Assert.assertEquals(tokyo, mdt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInto_nullInstant() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd");
        f.parseInto(null, "2023-05-10", 0);
    }

    @Test
    public void testParseMillis_validAndInvalid() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZoneUTC();
        long millis = f.parseMillis("2023-05-10 14:30:00");
        Assert.assertEquals(new DateTime(2023, 5, 10, 14, 30, 0, DateTimeZone.UTC).getMillis(), millis);

        try {
            f.parseMillis("2023-05-10 14:30:00 extra");
            Assert.fail("Expected IllegalArgumentException for unparsed trailing text");
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            f.parseMillis("invalid-date-string");
            Assert.fail("Expected IllegalArgumentException for invalid input");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testParseLocalDate() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate date = f.parseLocalDate("2023-05-10 14:30:00");
        Assert.assertEquals(new LocalDate(2023, 5, 10), date);

        try {
            f.parseLocalDate("invalid");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testParseLocalTime() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        LocalTime time = f.parseLocalTime("2023-05-10 14:30:00");
        Assert.assertEquals(new LocalTime(14, 30, 0), time);

        try {
            f.parseLocalTime("invalid");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testParseLocalDateTime() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = f.parseLocalDateTime("2023-05-10 14:30:00");
        Assert.assertEquals(new LocalDateTime(2023, 5, 10, 14, 30, 0), ldt);

        DateTimeFormatter fWithZone = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        LocalDateTime ldtWithOffset = fWithZone.parseLocalDateTime("2023-05-10 14:30:00 +0300");
        Assert.assertNotNull(ldtWithOffset);

        try {
            f.parseLocalDateTime("2023-05-10 incomplete");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            f.parseLocalDateTime("invalid");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testParseDateTime_withOffsetParsed_and_zoneOverrides() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        DateTime dt = f.parseDateTime("2023-05-10 14:30:00 +0300");
        Assert.assertEquals(DateTimeZone.UTC, dt.getZone());

        DateTimeFormatter fOffsetParsed = f.withOffsetParsed();
        DateTime dtOffsetParsed = fOffsetParsed.parseDateTime("2023-05-10 14:30:00 +0300");
        Assert.assertEquals(DateTimeZone.forOffsetHours(3), dtOffsetParsed.getZone());

        DateTimeZone nyZone = DateTimeZone.forID("America/New_York");
        DateTimeFormatter fWithZone = f.withZone(nyZone);
        DateTime dtWithZone = fWithZone.parseDateTime("2023-05-10 14:30:00 +0300");
        Assert.assertEquals(nyZone, dtWithZone.getZone());

        try {
            f.parseDateTime("invalid");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testParseMutableDateTime_withOffsetParsed_and_zoneOverrides() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss Z");
        MutableDateTime mdt = f.parseMutableDateTime("2023-05-10 14:30:00 +0300");
        Assert.assertEquals(DateTimeZone.UTC, mdt.getZone());

        DateTimeFormatter fOffsetParsed = f.withOffsetParsed();
        MutableDateTime mdtOffsetParsed = fOffsetParsed.parseMutableDateTime("2023-05-10 14:30:00 +0300");
        Assert.assertEquals(DateTimeZone.forOffsetHours(3), mdtOffsetParsed.getZone());

        DateTimeZone nyZone = DateTimeZone.forID("America/New_York");
        DateTimeFormatter fWithZone = f.withZone(nyZone);
        MutableDateTime mdtWithZone = fWithZone.parseMutableDateTime("2023-05-10 14:30:00 +0300");
        Assert.assertEquals(nyZone, mdtWithZone.getZone());

        try {
            f.parseMutableDateTime("invalid");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequireParser_throwsWhenNoParser_parseMillis() {
        DateTimeFormatter printerOnly = new DateTimeFormatter(DateTimeFormat.forPattern("yyyy").getPrinter(), null);
        printerOnly.parseMillis("2020");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequireParser_throwsWhenNoParser_parseInto() {
        DateTimeFormatter printerOnly = new DateTimeFormatter(DateTimeFormat.forPattern("yyyy").getPrinter(), null);
        printerOnly.parseInto(new MutableDateTime(), "2020", 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequireParser_throwsWhenNoParser_parseDateTime() {
        DateTimeFormatter printerOnly = new DateTimeFormatter(DateTimeFormat.forPattern("yyyy").getPrinter(), null);
        printerOnly.parseDateTime("2020");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequireParser_throwsWhenNoParser_parseMutableDateTime() {
        DateTimeFormatter printerOnly = new DateTimeFormatter(DateTimeFormat.forPattern("yyyy").getPrinter(), null);
        printerOnly.parseMutableDateTime("2020");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRequireParser_throwsWhenNoParser_parseLocalDateTime() {
        DateTimeFormatter printerOnly = new DateTimeFormatter(DateTimeFormat.forPattern("yyyy").getPrinter(), null);
        printerOnly.parseLocalDateTime("2020");
    }

    @Test
    public void testSelectChronology_withOverrideChronologyAndZone() {
        Chronology gj = GJChronology.getInstanceUTC();
        DateTimeZone tokyo = DateTimeZone.forID("Asia/Tokyo");
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd")
                .withChronology(gj)
                .withZone(tokyo);

        DateTime dt = f.parseDateTime("2023-05-10");
        Assert.assertEquals(tokyo, dt.getZone());
        Assert.assertEquals(gj.withZone(tokyo), dt.getChronology());
    }

    @Test
    public void testPivotYear_twoDigitYearParsing() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yy-MM-dd").withPivotYear(1950);
        DateTime dt1950 = f.parseDateTime("49-01-01");
        Assert.assertEquals(1949, dt1950.getYear());
        DateTime dt1999 = f.parseDateTime("99-01-01");
        Assert.assertEquals(1999, dt1999.getYear());
        DateTime dt1900 = f.parseDateTime("00-01-01");
        Assert.assertEquals(1900, dt1900.getYear());
    }

    @Test
    public void testDefaultYear_leapYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("MM-dd").withDefaultYear(2004);
        DateTime dt = f.parseDateTime("02-29");
        Assert.assertEquals(2004, dt.getYear());
        Assert.assertEquals(2, dt.getMonthOfYear());
        Assert.assertEquals(29, dt.getDayOfMonth());
    }
}
