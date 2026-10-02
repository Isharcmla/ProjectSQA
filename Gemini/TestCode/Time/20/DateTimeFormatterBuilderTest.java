package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeFormatterBuilderTest {

    private Locale originalLocale;
    private DateTimeZone originalZone;
    private DateTimeFormatterBuilder builder;

    @Before
    public void setUp() {
        originalLocale = Locale.getDefault();
        originalZone = DateTimeZone.getDefault();
        Locale.setDefault(Locale.ENGLISH);
        DateTimeZone.setDefault(DateTimeZone.UTC);
        builder = new DateTimeFormatterBuilder();
    }

    @After
    public void tearDown() {
        Locale.setDefault(originalLocale);
        DateTimeZone.setDefault(originalZone);
    }

    @Test
    public void testAppendLiteralChar_printAndParse_success() {
        DateTimeFormatter f = builder.appendLiteral('A').toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("A", f.print(dt));

        DateTimeParserBucket bucket = new DateTimeParserBucket(0, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        DateTimeParser parser = f.getParser();
        int pos = parser.parseInto(bucket, "a", 0);
        Assert.assertEquals(1, pos);
        Assert.assertEquals(~0, parser.parseInto(bucket, "b", 0));
        Assert.assertEquals(~1, parser.parseInto(bucket, "a", 1));
    }

    @Test
    public void testAppendLiteralString_emptySingleMultiple_success() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        b.appendLiteral("");
        b.appendLiteral("X");
        b.appendLiteral("YZ");
        DateTimeFormatter f = b.toFormatter();
        Assert.assertEquals("XYZ", f.print(0L));

        DateTimeParserBucket bucket = new DateTimeParserBucket(0, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        int pos = f.getParser().parseInto(bucket, "xyz", 0);
        Assert.assertEquals(3, pos);
        Assert.assertEquals(~0, f.getParser().parseInto(bucket, "ab", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteralString_null_throwsException() {
        builder.appendLiteral((String) null);
    }

    @Test
    public void testAppendDecimalAndSignedDecimal_printAndParse_success() {
        DateTimeFormatter f = builder
                .appendDecimal(DateTimeFieldType.monthOfYear(), 1, 2)
                .appendLiteral('-')
                .appendSignedDecimal(DateTimeFieldType.year(), 4, 4)
                .toFormatter();

        DateTime dt = new DateTime(2023, 5, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("5-2023", f.print(dt));

        DateTime parsed = f.parseDateTime("05-2023");
        Assert.assertEquals(2023, parsed.getYear());
        Assert.assertEquals(5, parsed.getMonthOfYear());

        DateTime parsedSigned = f.parseDateTime("5-+2023");
        Assert.assertEquals(2023, parsedSigned.getYear());

        DateTime parsedNegative = f.parseDateTime("5--2023");
        Assert.assertEquals(-2023, parsedNegative.getYear());
    }

    @Test
    public void testAppendPaddedDecimal_printAndParse() {
        DateTimeFormatter f = builder
                .appendDecimal(DateTimeFieldType.monthOfYear(), 2, 2)
                .toFormatter();
        Assert.assertEquals("05", f.print(new DateTime(2023, 5, 1, 0, 0, 0, 0, DateTimeZone.UTC)));
        Assert.assertEquals(5, f.parseDateTime("05").getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_nullField_throwsException() {
        builder.appendDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_invalidDigits_throwsException() {
        builder.appendDecimal(DateTimeFieldType.year(), -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_nullField_throwsException() {
        builder.appendSignedDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_invalidDigits_throwsException() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), 0, 0);
    }

    @Test
    public void testAppendFixedDecimalAndSigned_success() {
        DateTimeFormatter f = builder
                .appendFixedDecimal(DateTimeFieldType.year(), 4)
                .appendFixedSignedDecimal(DateTimeFieldType.monthOfYear(), 2)
                .toFormatter();

        DateTime dt = new DateTime(2023, 8, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("202308", f.print(dt));

        DateTime parsed = f.parseDateTime("202308");
        Assert.assertEquals(2023, parsed.getYear());
        Assert.assertEquals(8, parsed.getMonthOfYear());

        DateTimeParserBucket bucket = new DateTimeParserBucket(0, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        Assert.assertTrue(f.getParser().parseInto(bucket, "20238", 0) < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_nullField_throwsException() {
        builder.appendFixedDecimal(null, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_invalidDigits_throwsException() {
        builder.appendFixedDecimal(DateTimeFieldType.year(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_nullField_throwsException() {
        builder.appendFixedSignedDecimal(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_invalidDigits_throwsException() {
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), -1);
    }

    @Test
    public void testAppendTextAndShortText_printAndParse_success() {
        DateTimeFormatter f = builder
                .appendText(DateTimeFieldType.monthOfYear())
                .appendLiteral(' ')
                .appendShortText(DateTimeFieldType.monthOfYear())
                .toFormatter();

        DateTime dt = new DateTime(2023, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("January Jan", f.print(dt));

        DateTime parsed = f.parseDateTime("january JAN");
        Assert.assertEquals(1, parsed.getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_null_throwsException() {
        builder.appendText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendShortText_null_throwsException() {
        builder.appendShortText(null);
    }

    @Test
    public void testAppendFractionMethods_printAndParse_success() {
        DateTimeFormatter f = builder
                .appendFraction(DateTimeFieldType.secondOfDay(), 1, 3)
                .toFormatter();

        DateTime dt = new DateTime(2023, 1, 1, 0, 0, 0, 500, DateTimeZone.UTC);
        Assert.assertEquals("5", f.print(dt));

        DateTime parsed = f.parseDateTime("5");
        Assert.assertEquals(500, parsed.getMillisOfSecond());

        builder.clear();
        DateTimeFormatter f2 = builder.appendFractionOfSecond(1, 3).toFormatter();
        Assert.assertEquals("5", f2.print(dt));

        builder.clear();
        DateTimeFormatter f3 = builder.appendFractionOfMinute(1, 2).toFormatter();
        Assert.assertNotNull(f3.print(dt));

        builder.clear();
        DateTimeFormatter f4 = builder.appendFractionOfHour(1, 2).toFormatter();
        Assert.assertNotNull(f4.print(dt));

        builder.clear();
        DateTimeFormatter f5 = builder.appendFractionOfDay(1, 2).toFormatter();
        Assert.assertNotNull(f5.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_nullField_throwsException() {
        builder.appendFraction(null, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_invalidDigits_throwsException() {
        builder.appendFraction(DateTimeFieldType.secondOfDay(), -1, 3);
    }

    @Test
    public void testConvenienceAppendNumericMethods() {
        DateTimeFormatter f = builder
                .appendMillisOfSecond(3)
                .appendMillisOfDay(8)
                .appendSecondOfMinute(2)
                .appendSecondOfDay(5)
                .appendMinuteOfHour(2)
                .appendMinuteOfDay(4)
                .appendHourOfDay(2)
                .appendClockhourOfDay(2)
                .appendHourOfHalfday(2)
                .appendClockhourOfHalfday(2)
                .appendDayOfWeek(1)
                .appendDayOfMonth(2)
                .appendDayOfYear(3)
                .appendWeekOfWeekyear(2)
                .appendWeekyear(4, 4)
                .appendMonthOfYear(2)
                .appendYear(4, 4)
                .appendYearOfEra(4, 4)
                .appendYearOfCentury(2, 2)
                .appendCenturyOfEra(2, 2)
                .toFormatter();

        DateTime dt = new DateTime(2023, 12, 25, 14, 30, 45, 123, DateTimeZone.UTC);
        String printed = f.print(dt);
        Assert.assertNotNull(printed);
        Assert.assertTrue(printed.length() > 0);
    }

    @Test
    public void testAppendTwoDigitYearAndWeekyear_success() {
        DateTimeFormatter f = builder
                .appendTwoDigitYear(2000)
                .appendLiteral('-')
                .appendTwoDigitYear(2000, true)
                .appendLiteral('-')
                .appendTwoDigitWeekyear(2000)
                .appendLiteral('-')
                .appendTwoDigitWeekyear(2000, true)
                .toFormatter();

        DateTime dt = new DateTime(2023, 5, 10, 0, 0, 0, 0, DateTimeZone.UTC);
        Assert.assertEquals("23-23-23-23", f.print(dt));

        DateTime parsed = f.parseDateTime("23-2023-23-2023");
        Assert.assertEquals(2023, parsed.getYear());
        Assert.assertEquals(2023, parsed.getWeekyear());

        DateTime parsedTwoDigit = f.parseDateTime("90-90-90-90");
        Assert.assertEquals(1990, parsedTwoDigit.getYear());
    }

    @Test
    public void testConvenienceTextMethods_success() {
        DateTimeFormatter f = builder
                .appendHalfdayOfDayText()
                .appendLiteral(' ')
                .appendDayOfWeekText()
                .appendLiteral(' ')
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .appendMonthOfYearText()
                .appendLiteral(' ')
                .appendMonthOfYearShortText()
                .appendLiteral(' ')
                .appendEraText()
                .toFormatter();

        DateTime dt = new DateTime(2023, 1, 2, 10, 0, 0, 0, DateTimeZone.UTC);
        String printed = f.print(dt);
        Assert.assertTrue(printed.contains("AM"));
        Assert.assertTrue(printed.contains("Monday"));
        Assert.assertTrue(printed.contains("Mon"));
        Assert.assertTrue(printed.contains("January"));
        Assert.assertTrue(printed.contains("Jan"));
        Assert.assertTrue(printed.contains("AD"));

        DateTime parsed = f.parseDateTime("AM Monday Mon January Jan AD");
        Assert.assertEquals(1, parsed.getMonthOfYear());
    }

    @Test
    public void testAppendTimeZoneNameAndId_printAndParse_success() {
        Map<String, DateTimeZone> lookup = new HashMap<String, DateTimeZone>();
        lookup.put("UTC", DateTimeZone.UTC);
        lookup.put("GMT", DateTimeZone.UTC);

        DateTimeFormatter f = builder
                .appendTimeZoneName()
                .appendLiteral('|')
                .appendTimeZoneName(lookup)
                .appendLiteral('|')
                .appendTimeZoneShortName()
                .appendLiteral('|')
                .appendTimeZoneShortName(lookup)
                .appendLiteral('|')
                .appendTimeZoneId()
                .toFormatter();

        DateTime dt = new DateTime(2023, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        String printed = f.print(dt);
        Assert.assertTrue(printed.contains("UTC"));

        DateTime parsed = f.parseDateTime("Coordinated Universal Time|UTC|UTC|UTC|UTC");
        Assert.assertEquals(DateTimeZone.UTC, parsed.getZone());
    }

    @Test
    public void testAppendTimeZoneOffset_variousConfigurations_success() {
        DateTimeFormatter f1 = builder
                .appendTimeZoneOffset("Z", true, 2, 4)
                .toFormatter();

        Assert.assertEquals("Z", f1.print(new DateTime(0L, DateTimeZone.UTC)));
        DateTimeZone plus2 = DateTimeZone.forOffsetHoursMinutes(2, 30);
        Assert.assertEquals("+02:30", f1.print(new DateTime(0L, plus2)));

        DateTime parsed1 = f1.parseDateTime("Z");
        Assert.assertEquals(0, parsed1.getZone().getOffset(0L));

        DateTime parsed2 = f1.parseDateTime("+02:30");
        Assert.assertEquals(plus2.getOffset(0L), parsed2.getZone().getOffset(0L));

        builder.clear();
        DateTimeFormatter f2 = builder
                .appendTimeZoneOffset("UTC", "Z", false, 1, 2)
                .toFormatter();
        Assert.assertEquals("UTC", f2.print(new DateTime(0L, DateTimeZone.UTC)));
        Assert.assertEquals("+02", f2.print(new DateTime(0L, DateTimeZone.forOffsetHours(2))));
        Assert.assertEquals(0, f2.parseDateTime("Z").getZone().getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset_invalidMinFields_throwsException() {
        builder.appendTimeZoneOffset("Z", true, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset_maxLessThanMin_throwsException() {
        builder.appendTimeZoneOffset("Z", true, 3, 2);
    }

    @Test
    public void testAppendPattern_success() {
        DateTimeFormatter f = builder.appendPattern("yyyy-MM-dd HH:mm:ss").toFormatter();
        DateTime dt = new DateTime(2023, 5, 10, 12, 30, 45, 0, DateTimeZone.UTC);
        Assert.assertEquals("2023-05-10 12:30:45", f.print(dt));
        DateTime parsed = f.parseDateTime("2023-05-10 12:30:45");
        Assert.assertEquals(dt, parsed);
    }

    @Test
    public void testAppendCustomPrinterParserAndOptional() {
        DateTimeFormatter dummyFormatter = DateTimeFormat.forPattern("yyyy");
        DateTimePrinter printer = dummyFormatter.getPrinter();
        DateTimeParser parser = dummyFormatter.getParser();

        DateTimeFormatter f1 = builder
                .append(dummyFormatter)
                .append(printer)
                .append(parser)
                .append(printer, parser)
                .toFormatter();
        Assert.assertNotNull(f1);

        builder.clear();
        DateTimeFormatter f2 = builder
                .append(printer, new DateTimeParser[]{parser})
                .append(printer, new DateTimeParser[]{parser, null})
                .appendOptional(parser)
                .toFormatter();
        Assert.assertNotNull(f2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFormatter_null_throwsException() {
        builder.append((DateTimeFormatter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinter_null_throwsException() {
        builder.append((DateTimePrinter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendParser_null_throwsException() {
        builder.append((DateTimeParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterAndParser_nullPrinter_throwsException() {
        DateTimeParser parser = DateTimeFormat.forPattern("yyyy").getParser();
        builder.append(null, parser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterAndParser_nullParser_throwsException() {
        DateTimePrinter printer = DateTimeFormat.forPattern("yyyy").getPrinter();
        builder.append(printer, (DateTimeParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendParsers_nullArray_throwsException() {
        builder.append(null, (DateTimeParser[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendParsers_singleNull_throwsException() {
        builder.append(null, new DateTimeParser[]{null});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendParsers_incompleteArray_throwsException() {
        DateTimeParser parser = DateTimeFormat.forPattern("yyyy").getParser();
        builder.append(null, new DateTimeParser[]{null, parser});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendOptional_null_throwsException() {
        builder.appendOptional(null);
    }

    @Test
    public void testCanBuildAndToMethods() {
        Assert.assertFalse(builder.canBuildFormatter());
        Assert.assertFalse(builder.canBuildPrinter());
        Assert.assertFalse(builder.canBuildParser());

        try {
            builder.toFormatter();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {}

        try {
            builder.toPrinter();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {}

        try {
            builder.toParser();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {}

        DateTimeFormatter subFormatter = DateTimeFormat.forPattern("yyyy");
        builder.append(subFormatter.getPrinter());
        Assert.assertTrue(builder.canBuildPrinter());
        Assert.assertFalse(builder.canBuildParser());
        Assert.assertTrue(builder.canBuildFormatter());
        Assert.assertNotNull(builder.toPrinter());

        try {
            builder.toParser();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {}

        builder.clear();
        builder.append(subFormatter.getParser());
        Assert.assertFalse(builder.canBuildPrinter());
        Assert.assertTrue(builder.canBuildParser());
        Assert.assertTrue(builder.canBuildFormatter());
        Assert.assertNotNull(builder.toParser());

        try {
            builder.toPrinter();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {}
    }

    @Test
    public void testPrintingToWriterAndPartial() throws IOException {
        DateTimeFormatter f = builder
                .appendLiteral('T')
                .appendLiteral("ime: ")
                .appendDecimal(DateTimeFieldType.hourOfDay(), 2, 2)
                .appendLiteral(':')
                .appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2)
                .appendLiteral(':')
                .appendTwoDigitYear(2000)
                .appendLiteral(' ')
                .appendText(DateTimeFieldType.monthOfYear())
                .appendLiteral(' ')
                .appendFraction(DateTimeFieldType.secondOfDay(), 1, 3)
                .appendTimeZoneOffset("Z", true, 2, 2)
                .appendTimeZoneId()
                .toFormatter();

        LocalTime time = new LocalTime(14, 30);
        StringBuffer buf = new StringBuffer();
        f.printTo(buf, time);
        Assert.assertTrue(buf.length() > 0);

        StringWriter sw = new StringWriter();
        f.printTo(sw, time);
        Assert.assertTrue(sw.toString().length() > 0);

        DateTime dt = new DateTime(2023, 5, 10, 14, 30, 45, 123, DateTimeZone.UTC);
        sw = new StringWriter();
        f.printTo(sw, dt);
        Assert.assertTrue(sw.toString().length() > 0);

        LocalDate date = new LocalDate(2023, 5, 10);
        buf = new StringBuffer();
        f.printTo(buf, date);
        Assert.assertTrue(buf.length() > 0);

        sw = new StringWriter();
        f.printTo(sw, date);
        Assert.assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testAppendUnknownStringAndPrintUnknownString() throws IOException {
        StringBuffer buf = new StringBuffer();
        DateTimeFormatterBuilder.appendUnknownString(buf, 3);
        Assert.assertEquals("\ufffd\ufffd\ufffd", buf.toString());

        StringWriter sw = new StringWriter();
        DateTimeFormatterBuilder.printUnknownString(sw, 2);
        Assert.assertEquals("\ufffd\ufffd", sw.toString());
    }

    @Test
    public void testMatchingParser_branchCoverage() {
        DateTimeParser p1 = DateTimeFormat.forPattern("yyyy-MM-dd").getParser();
        DateTimeParser p2 = DateTimeFormat.forPattern("yyyy/MM/dd").getParser();

        DateTimeFormatter f = builder.append(null, new DateTimeParser[]{p1, p2}).toFormatter();
        DateTime dt1 = f.parseDateTime("2023-05-10");
        Assert.assertEquals(2023, dt1.getYear());
        DateTime dt2 = f.parseDateTime("2023/05/10");
        Assert.assertEquals(2023, dt2.getYear());

        try {
            f.parseDateTime("invalid-date");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}
    }

    @Test
    public void testPaddedAndUnpaddedNumber_largeValuesAndLimits() {
        DateTimeFormatter f = builder
                .appendSignedDecimal(DateTimeFieldType.year(), 1, 10)
                .toFormatter();
        DateTime dt = f.parseDateTime("123456789");
        Assert.assertEquals(123456789, dt.getYear());

        DateTime dtNeg = f.parseDateTime("-123456789");
        Assert.assertEquals(-123456789, dtNeg.getYear());
    }

    @Test
    public void testTwoDigitYear_lenientParsingWithSigns() {
        DateTimeFormatter f = builder
                .appendTwoDigitYear(2000, true)
                .toFormatter();

        Assert.assertEquals(2023, f.parseDateTime("+2023").getYear());
        Assert.assertEquals(-500, f.parseDateTime("-500").getYear());
        Assert.assertEquals(123456789, f.parseDateTime("123456789").getYear());
        Assert.assertEquals(2023, f.parseDateTime("23").getYear());
    }

    @Test
    public void testTimeZoneOffset_variousParses() {
        DateTimeFormatter f = builder
                .appendTimeZoneOffset("Z", true, 1, 4)
                .toFormatter();

        Assert.assertEquals(0, f.parseDateTime("+00").getZone().getOffset(0L));
        Assert.assertEquals(0, f.parseDateTime("+00:00").getZone().getOffset(0L));
        Assert.assertEquals(0, f.parseDateTime("+00:00:00").getZone().getOffset(0L));
        Assert.assertEquals(123, f.parseDateTime("+00:00:00.123").getZone().getOffset(0L));

        builder.clear();
        DateTimeFormatter fNoSep = builder
                .appendTimeZoneOffset("Z", false, 1, 4)
                .toFormatter();
        Assert.assertEquals(2 * 3600 * 1000, fNoSep.parseDateTime("+02").getZone().getOffset(0L));
        Assert.assertEquals((2 * 3600 + 30 * 60) * 1000, fNoSep.parseDateTime("+0230").getZone().getOffset(0L));
        Assert.assertEquals((2 * 3600 + 30 * 60 + 15) * 1000, fNoSep.parseDateTime("+023015").getZone().getOffset(0L));
        Assert.assertEquals((2 * 3600 + 30 * 60 + 15) * 1000 + 500, fNoSep.parseDateTime("+023015500").getZone().getOffset(0L));
    }
}
