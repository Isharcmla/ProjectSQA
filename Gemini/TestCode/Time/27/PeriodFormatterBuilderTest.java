package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class PeriodFormatterBuilderTest {

    private PeriodFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new PeriodFormatterBuilder();
    }

    // -----------------------------------------------------------------------
    // Builder lifecycle & Configuration tests
    // -----------------------------------------------------------------------

    @Test
    public void testClear_resetsBuilderState() {
        builder.appendYears().appendMonths();
        builder.clear();
        builder.appendDays();
        PeriodFormatter formatter = builder.toFormatter();
        assertEquals("5", formatter.print(new Period().withDays(5)));
    }

    @Test
    public void testToPrinterAndToParser_bothSupported() {
        builder.appendYears();
        assertNotNull(builder.toPrinter());
        assertNotNull(builder.toParser());
        PeriodFormatter f = builder.toFormatter();
        assertTrue(f.isPrinter());
        assertTrue(f.isParser());
    }

    @Test
    public void testToPrinterAndToParser_printerOnly() {
        builder.append(new PeriodFormatterBuilder().appendYears().toPrinter(), null);
        assertNotNull(builder.toPrinter());
        assertNull(builder.toParser());
        PeriodFormatter f = builder.toFormatter();
        assertTrue(f.isPrinter());
        assertFalse(f.isParser());
    }

    @Test
    public void testToPrinterAndToParser_parserOnly() {
        builder.append(null, new PeriodFormatterBuilder().appendYears().toParser());
        assertNull(builder.toPrinter());
        assertNotNull(builder.toParser());
        PeriodFormatter f = builder.toFormatter();
        assertFalse(f.isPrinter());
        assertTrue(f.isParser());
    }

    @Test(expected = IllegalStateException.class)
    public void testToFormatter_neitherPrinterNorParser_throwsException() {
        builder.append(null, null);
    }

    @Test(expected = IllegalStateException.class)
    public void testToFormatter_emptyBuilder_throwsException() {
        PeriodFormatterBuilder empty = new PeriodFormatterBuilder();
        empty.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_PeriodFormatter_null_throwsException() {
        builder.append((PeriodFormatter) null);
    }

    @Test
    public void testAppend_PeriodFormatter_valid() {
        PeriodFormatter sub = new PeriodFormatterBuilder().appendYears().appendLiteral("Y").toFormatter();
        builder.append(sub).appendMonths().appendLiteral("M");
        PeriodFormatter formatter = builder.toFormatter();
        assertEquals("1Y2M", formatter.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_null_throwsException() {
        builder.appendLiteral(null);
    }

    @Test
    public void testAppendLiteral_validAndEmpty() {
        builder.appendLiteral("").appendYears().appendLiteral(" Year(s)");
        PeriodFormatter formatter = builder.toFormatter();
        assertEquals("2 Year(s)", formatter.print(new Period().withYears(2)));

        MutablePeriod p = new MutablePeriod();
        int pos = formatter.getParser().parseInto(p, "2 Year(s)", 0, Locale.ENGLISH);
        assertEquals(9, pos);
        assertEquals(2, p.getYears());

        // Parse failure on literal
        pos = formatter.getParser().parseInto(p, "2 Days", 0, Locale.ENGLISH);
        assertTrue(pos < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_nullString_throwsException() {
        builder.appendPrefix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_nullPlural_throwsException() {
        builder.appendPrefix(null, "years");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_nullSingular_throwsException() {
        builder.appendPrefix("year", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixNotFollowedByField_throwsException() {
        builder.appendPrefix("P").appendLiteral("L");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_nullString_throwsException() {
        builder.appendYears();
        builder.appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_nullPlural_throwsException() {
        builder.appendYears();
        builder.appendSuffix(null, "years");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_nullSingular_throwsException() {
        builder.appendYears();
        builder.appendSuffix("year", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_withoutPrecedingField_throwsException() {
        builder.appendSuffix("years");
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_afterLiteral_throwsException() {
        builder.appendLiteral("text").appendSuffix("suffix");
    }

    // -----------------------------------------------------------------------
    // All Period Fields Formatting and Parsing
    // -----------------------------------------------------------------------

    @Test
    public void testAllFields_formattingAndParsing() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .appendWeeks().appendSuffix("w")
                .appendDays().appendSuffix("d")
                .appendHours().appendSuffix("h")
                .appendMinutes().appendSuffix("min")
                .appendSeconds().appendSuffix("s")
                .appendMillis().appendSuffix("ms")
                .toFormatter();

        Period period = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("1y2m3w4d5h6min7s8ms", formatter.print(period));

        Period parsed = formatter.parsePeriod("1y2m3w4d5h6min7s8ms");
        assertEquals(period, parsed);
    }

    @Test
    public void testAppendMillis3Digit() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMillis3Digit()
                .appendSuffix("ms")
                .toFormatter();

        assertEquals("005ms", formatter.print(new Period().withMillis(5)));
        assertEquals("050ms", formatter.print(new Period().withMillis(50)));
        assertEquals("500ms", formatter.print(new Period().withMillis(500)));

        Period parsed = formatter.parsePeriod("042ms");
        assertEquals(42, parsed.getMillis());
    }

    @Test
    public void testSecondsWithMillis_formattingAndParsing() throws IOException {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithMillis()
                .appendSuffix("s")
                .toFormatter();

        Period p = new Period().withSeconds(5).withMillis(20);
        assertEquals("5.020s", formatter.print(p));

        // Test Writer
        StringWriter sw = new StringWriter();
        formatter.getPrinter().printTo(sw, p, Locale.getDefault());
        assertEquals("5.020s", sw.toString());

        // Parse 3 digits fract
        Period parsed3 = formatter.parsePeriod("5.020s");
        assertEquals(5, parsed3.getSeconds());
        assertEquals(20, parsed3.getMillis());

        // Parse 2 digits fract
        Period parsed2 = formatter.parsePeriod("5.20s");
        assertEquals(5, parsed2.getSeconds());
        assertEquals(200, parsed2.getMillis());

        // Parse 1 digit fract
        Period parsed1 = formatter.parsePeriod("5.2s");
        assertEquals(5, parsed1.getSeconds());
        assertEquals(200, parsed1.getMillis());

        // Parse with comma
        Period parsedComma = formatter.parsePeriod("5,250s");
        assertEquals(5, parsedComma.getSeconds());
        assertEquals(250, parsedComma.getMillis());

        // Parse with 0 fract digits
        Period parsedNoFract = formatter.parsePeriod("5s");
        assertEquals(5, parsedNoFract.getSeconds());
        assertEquals(0, parsedNoFract.getMillis());

        // Parse negative fract
        Period parsedNeg = formatter.parsePeriod("-5.250s");
        assertEquals(-5, parsedNeg.getSeconds());
        assertEquals(-250, parsedNeg.getMillis());
    }

    @Test
    public void testSecondsWithOptionalMillis() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithOptionalMillis()
                .appendSuffix("s")
                .toFormatter();

        assertEquals("5s", formatter.print(new Period().withSeconds(5)));
        assertEquals("5.050s", formatter.print(new Period().withSeconds(5).withMillis(50)));

        Period parsedWith = formatter.parsePeriod("5.123s");
        assertEquals(5, parsedWith.getSeconds());
        assertEquals(123, parsedWith.getMillis());

        Period parsedWithout = formatter.parsePeriod("5s");
        assertEquals(5, parsedWithout.getSeconds());
        assertEquals(0, parsedWithout.getMillis());
    }

    // -----------------------------------------------------------------------
    // Prefix and Suffix Variations (Simple, Plural, Composite)
    // -----------------------------------------------------------------------

    @Test
    public void testPluralAffix_printingAndParsing() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("In: ")
                .appendYears()
                .appendSuffix(" year", " years")
                .appendSeparator(", ")
                .appendDays()
                .appendSuffix(" day", " days")
                .toFormatter();

        assertEquals("In: 1 year, 1 day", formatter.print(new Period().withYears(1).withDays(1)));
        assertEquals("In: 2 years, 3 days", formatter.print(new Period().withYears(2).withDays(3)));

        Period parsedSingular = formatter.parsePeriod("In: 1 year, 1 day");
        assertEquals(1, parsedSingular.getYears());
        assertEquals(1, parsedSingular.getDays());

        Period parsedPlural = formatter.parsePeriod("In: 5 years, 10 days");
        assertEquals(5, parsedPlural.getYears());
        assertEquals(10, parsedPlural.getDays());
    }

    @Test
    public void testPrefixSingularAndPlural() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("year: ", "years: ")
                .appendYears()
                .toFormatter();

        assertEquals("year: 1", formatter.print(new Period().withYears(1)));
        assertEquals("years: 2", formatter.print(new Period().withYears(2)));

        Period parsed = formatter.parsePeriod("years: 10");
        assertEquals(10, parsed.getYears());
    }

    @Test
    public void testCompositeAffixes() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("PRE1_")
                .appendPrefix("PRE2_")
                .appendYears()
                .appendSuffix("_SUF1")
                .appendSuffix("_SUF2")
                .toFormatter();

        assertEquals("PRE1_PRE2_5_SUF1_SUF2", formatter.print(new Period().withYears(5)));

        Period parsed = formatter.parsePeriod("PRE1_PRE2_5_SUF1_SUF2");
        assertEquals(5, parsed.getYears());
    }

    // -----------------------------------------------------------------------
    // Print Zero Settings
    // -----------------------------------------------------------------------

    @Test
    public void testPrintZeroAlways() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        assertEquals("0y0m", formatter.print(Period.ZERO));
    }

    @Test
    public void testPrintZeroNever() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroNever()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        assertEquals("", formatter.print(Period.ZERO));
    }

    @Test
    public void testPrintZeroRarelyLast() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroRarelyLast()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        assertEquals("0m", formatter.print(Period.ZERO));
        assertEquals("1y", formatter.print(new Period().withYears(1)));
    }

    @Test
    public void testPrintZeroRarelyFirst() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        assertEquals("0y", formatter.print(Period.ZERO));
        assertEquals("1m", formatter.print(new Period().withMonths(1)));
    }

    @Test
    public void testPrintZeroIfSupported() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .appendYears().appendSuffix("y")
                .appendDays().appendSuffix("d")
                .toFormatter();

        Period periodOnlyYears = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.years());
        assertEquals("0y", formatter.print(periodOnlyYears));
    }

    // -----------------------------------------------------------------------
    // Digit Padding, Max Parsed Digits, Signed Rejection
    // -----------------------------------------------------------------------

    @Test
    public void testMinimumPrintedDigits() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .minimumPrintedDigits(3)
                .appendYears()
                .toFormatter();

        assertEquals("005", formatter.print(new Period().withYears(5)));
        assertEquals("1234", formatter.print(new Period().withYears(1234)));
    }

    @Test
    public void testMaximumParsedDigits() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(2)
                .appendYears()
                .appendMonths()
                .toFormatter();

        // 1234 should be parsed as 12 years and 34 months
        MutablePeriod p = new MutablePeriod();
        int pos = formatter.getParser().parseInto(p, "1234", 0, Locale.ENGLISH);
        assertEquals(4, pos);
        assertEquals(12, p.getYears());
        assertEquals(34, p.getMonths());
    }

    @Test
    public void testSignedValuesParsing() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .toFormatter();

        assertEquals(-5, formatter.parsePeriod("-5").getYears());
        assertEquals(5, formatter.parsePeriod("+5").getYears());

        PeriodFormatter rejectSigned = new PeriodFormatterBuilder()
                .rejectSignedValues(true)
                .appendYears()
                .toFormatter();

        MutablePeriod p = new MutablePeriod();
        int pos = rejectSigned.getParser().parseInto(p, "-5", 0, Locale.ENGLISH);
        assertTrue(pos < 0);
    }

    @Test
    public void testLargeDigitsParsing_triggersStockParser() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(15)
                .appendMillis()
                .toFormatter();

        Period p = formatter.parsePeriod("1000000005");
        assertEquals(1000000005, p.getMillis());
    }

    // -----------------------------------------------------------------------
    // Separators
    // -----------------------------------------------------------------------

    @Test
    public void testAppendSeparator_simple() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix("y")
                .appendSeparator(", ")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        assertEquals("1y, 2m", formatter.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("1y", formatter.print(new Period(1, 0, 0, 0, 0, 0, 0, 0)));
        assertEquals("2m", formatter.print(new Period(0, 2, 0, 0, 0, 0, 0, 0)));

        Period parsed = formatter.parsePeriod("1y, 2m");
        assertEquals(1, parsed.getYears());
        assertEquals(2, parsed.getMonths());
    }

    @Test
    public void testAppendSeparator_textAndFinalText() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix("y")
                .appendSeparator(", ", " and ")
                .appendMonths().appendSuffix("m")
                .appendSeparator(", ", " and ")
                .appendDays().appendSuffix("d")
                .toFormatter();

        assertEquals("1y, 2m and 3d", formatter.print(new Period(1, 2, 0, 3, 0, 0, 0, 0)));
        assertEquals("1y and 2m", formatter.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("1y", formatter.print(new Period(1, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSeparator_withVariants() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix("y")
                .appendSeparator(", ", " & ", new String[]{", and ", " and "})
                .appendMonths().appendSuffix("m")
                .toFormatter();

        assertEquals("1y & 2m", formatter.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));

        assertEquals(1, formatter.parsePeriod("1y, and 2m").getYears());
        assertEquals(2, formatter.parsePeriod("1y, and 2m").getMonths());
        assertEquals(1, formatter.parsePeriod("1y & 2m").getYears());
        assertEquals(2, formatter.parsePeriod("1y & 2m").getMonths());
    }

    @Test
    public void testAppendSeparatorIfFieldsBefore() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix("y")
                .appendSeparatorIfFieldsBefore(";")
                .appendMonths().appendSuffix("m")
                .toFormatter();

        assertEquals("1y;2m", formatter.print(new Period(1, 2, 0, 0, 0, 0, 0, 0)));
        assertEquals("1y;", formatter.print(new Period(1, 0, 0, 0, 0, 0, 0, 0)));
        assertEquals("2m", formatter.print(new Period(0, 2, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSeparatorIfFieldsAfter() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSeparatorIfFieldsAfter("T")
                .appendHours().appendSuffix("H")
                .toFormatter();

        assertEquals("T5H", formatter.print(new Period().withHours(5)));
        assertEquals("", formatter.print(Period.ZERO));

        Period parsed = formatter.parsePeriod("T5H");
        assertEquals(5, parsed.getHours());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_nullText_throwsException() {
        builder.appendSeparator(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAdjacentSeparators_throwsException() {
        builder.appendYears()
                .appendSeparator(",")
                .appendSeparator(";")
                .appendMonths();
    }

    // -----------------------------------------------------------------------
    // Print/Parse Direct Method Calls on Inner Classes
    // -----------------------------------------------------------------------

    @Test
    public void testPrinterAndParser_directMethodsAndWriters() throws IOException {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("P")
                .minimumPrintedDigits(2)
                .appendYears().appendSuffix("Y")
                .appendMonths().appendSuffix("M")
                .appendLiteral("END")
                .toFormatter();

        Period period = new Period(1, 2, 0, 0, 0, 0, 0, 0);

        // calculatePrintedLength
        int length = formatter.getPrinter().calculatePrintedLength(period, Locale.ENGLISH);
        assertTrue(length > 0);

        // countFieldsToPrint
        int count = formatter.getPrinter().countFieldsToPrint(period, 10, Locale.ENGLISH);
        assertEquals(2, count);

        // printTo with StringBuffer
        StringBuffer sb = new StringBuffer();
        formatter.getPrinter().printTo(sb, period, Locale.ENGLISH);
        assertEquals("P01Y02MEND", sb.toString());

        // printTo with Writer
        CharArrayWriter caw = new CharArrayWriter();
        formatter.getPrinter().printTo(caw, period, Locale.ENGLISH);
        assertEquals("P01Y02MEND", caw.toString());

        // parseInto edge cases
        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "P01Y02MEND", 0, Locale.ENGLISH);
        assertEquals(10, pos);
        assertEquals(1, mp.getYears());
        assertEquals(2, mp.getMonths());

        // Short cut parsing at string length
        pos = formatter.getParser().parseInto(mp, "P01Y02MEND", 10, Locale.ENGLISH);
        assertEquals(10, pos);
    }

    @Test
    public void testUnsupportedPeriodTypeHandling() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix("Y")
                .appendHours().appendSuffix("H")
                .toFormatter();

        Period timeOnly = new Period(0, 0, 0, 0, 5, 0, 0, 0, PeriodType.time());
        assertEquals("5H", formatter.print(timeOnly));

        MutablePeriod mp = new MutablePeriod(PeriodType.time());
        int pos = formatter.getParser().parseInto(mp, "5H", 0, Locale.ENGLISH);
        assertEquals(2, pos);
        assertEquals(5, mp.getHours());
    }

    @Test
    public void testSeparatorEdgeCases_printAndParse() throws IOException {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .appendSeparatorIfFieldsBefore(";")
                .appendMonths()
                .toFormatter();

        Period period = new Period().withYears(2);

        // calculatePrintedLength with only before printer
        int len = formatter.getPrinter().calculatePrintedLength(period, Locale.ENGLISH);
        assertEquals(2, len); // "2;"

        StringWriter sw = new StringWriter();
        formatter.getPrinter().printTo(sw, period, Locale.ENGLISH);
        assertEquals("2;", sw.toString());

        // Separator parsing missing required field after separator
        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "2;", 0, Locale.ENGLISH);
        assertEquals(2, pos);
    }

    @Test
    public void testCompositeAffix_scanAndParseFailure() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("A", "B")
                .appendPrefix("X", "Y")
                .appendYears()
                .toFormatter();

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "ZZZ", 0, Locale.ENGLISH);
        assertTrue(pos < 0);
    }

    @Test
    public void testParseNegativeNumber_withinRange() {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendHours()
                .appendSuffix("h")
                .toFormatter();

        Period p = formatter.parsePeriod("-12h");
        assertEquals(-12, p.getHours());
    }
}
