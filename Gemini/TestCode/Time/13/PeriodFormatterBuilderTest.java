package org.joda.time.format;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.DateTimeConstants;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeriodFormatterBuilderTest {

    private PeriodFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new PeriodFormatterBuilder();
    }

    // -----------------------------------------------------------------------
    // Constructor & Basic Builder Lifecycle
    // -----------------------------------------------------------------------

    @Test
    public void testClear_resetsState() {
        builder.appendYears().appendLiteral(" years");
        builder.clear();
        builder.appendDays();
        PeriodFormatter formatter = builder.toFormatter();
        assertEquals("5", formatter.print(new Period().withDays(5)));
    }

    @Test(expected = IllegalStateException.class)
    public void testToFormatter_emptyBuilder_throwsException() {
        builder.toFormatter();
    }

    @Test
    public void testToPrinterAndToParser_validBuilder() {
        builder.appendDays();
        PeriodPrinter printer = builder.toPrinter();
        PeriodParser parser = builder.toParser();
        assertNotNull(printer);
        assertNotNull(parser);
    }

    @Test
    public void testToPrinter_whenPrinterDisabled_returnsNull() {
        PeriodParser dummyParser = new PeriodParser() {
            public int parseInto(ReadWritablePeriod period, String periodStr, int position, Locale locale) {
                return position;
            }
        };
        builder.append(null, dummyParser);
        assertNull(builder.toPrinter());
        assertNotNull(builder.toParser());
    }

    @Test
    public void testToParser_whenParserDisabled_returnsNull() {
        PeriodPrinter dummyPrinter = new PeriodPrinter() {
            public int calculatePrintedLength(ReadablePeriod period, Locale locale) {
                return 0;
            }
            public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {
                return 0;
            }
            public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {}
            public void printTo(java.io.Writer out, ReadablePeriod period, Locale locale) {}
        };
        builder.append(dummyPrinter, null);
        assertNotNull(builder.toPrinter());
        assertNull(builder.toParser());
    }

    // -----------------------------------------------------------------------
    // Append Formatter / Printer / Parser
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullFormatter_throwsException() {
        builder.append((PeriodFormatter) null);
    }

    @Test
    public void testAppend_validFormatter() {
        PeriodFormatter subFormatter = new PeriodFormatterBuilder().appendDays().appendSuffix("d").toFormatter();
        builder.append(subFormatter).appendHours().appendSuffix("h");
        PeriodFormatter formatter = builder.toFormatter();

        Period p = new Period().withDays(2).withHours(3);
        assertEquals("2d3h", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "2d3h", 0, null);
        assertEquals(4, pos);
        assertEquals(2, mp.getDays());
        assertEquals(3, mp.getHours());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullPrinterAndNullParser_throwsException() {
        builder.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test
    public void testAppendLiteral_normal() {
        builder.appendLiteral("P").appendDays().appendLiteral("D");
        PeriodFormatter formatter = builder.toFormatter();
        assertEquals("P5D", formatter.print(new Period().withDays(5)));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "P5D", 0, null);
        assertEquals(3, pos);
        assertEquals(5, mp.getDays());

        // Parse mismatch
        assertEquals(~0, formatter.getParser().parseInto(mp, "X5D", 0, null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_null_throwsException() {
        builder.appendLiteral(null);
    }

    // -----------------------------------------------------------------------
    // All Period Field Appends (Years, Months, Weeks, Days, etc.)
    // -----------------------------------------------------------------------

    @Test
    public void testAppendAllFields_printAndParse() {
        builder.appendYears().appendSuffix("Y")
               .appendMonths().appendSuffix("M")
               .appendWeeks().appendSuffix("W")
               .appendDays().appendSuffix("D")
               .appendHours().appendSuffix("h")
               .appendMinutes().appendSuffix("m")
               .appendSeconds().appendSuffix("s")
               .appendMillis().appendSuffix("ms");
        PeriodFormatter formatter = builder.toFormatter();

        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("1Y2M3W4D5h6m7s8ms", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "1Y2M3W4D5h6m7s8ms", 0, null);
        assertEquals("1Y2M3W4D5h6m7s8ms".length(), pos);
        assertEquals(p, mp.toPeriod());
    }

    @Test
    public void testAppendMillis3Digit() {
        builder.appendMillis3Digit().appendSuffix("ms");
        PeriodFormatter formatter = builder.toFormatter();

        Period p = new Period().withMillis(5);
        assertEquals("005ms", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "042ms", 0, null);
        assertEquals(42, mp.getMillis());
    }

    @Test
    public void testAppendSecondsWithMillis() {
        builder.appendSecondsWithMillis().appendSuffix("s");
        PeriodFormatter formatter = builder.toFormatter();

        Period p1 = new Period().withSeconds(5).withMillis(20);
        assertEquals("5.020s", formatter.print(p1));

        Period p2 = new Period().withSeconds(5).withMillis(0);
        assertEquals("5.000s", formatter.print(p2));

        MutablePeriod mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "5.020s", 0, null);
        assertEquals(5, mp.getSeconds());
        assertEquals(20, mp.getMillis());
    }

    @Test
    public void testAppendSecondsWithOptionalMillis() {
        builder.appendSecondsWithOptionalMillis().appendSuffix("s");
        PeriodFormatter formatter = builder.toFormatter();

        Period p1 = new Period().withSeconds(5).withMillis(20);
        assertEquals("5.020s", formatter.print(p1));

        Period p2 = new Period().withSeconds(5).withMillis(0);
        assertEquals("5s", formatter.print(p2));

        // Parse with fractional dot
        MutablePeriod mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "12.345s", 0, null);
        assertEquals(12, mp.getSeconds());
        assertEquals(345, mp.getMillis());

        // Parse with fractional comma
        mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "12,345s", 0, null);
        assertEquals(12, mp.getSeconds());
        assertEquals(345, mp.getMillis());

        // Parse with 1 fraction digit
        mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "12.3s", 0, null);
        assertEquals(12, mp.getSeconds());
        assertEquals(300, mp.getMillis());

        // Parse with 2 fraction digits
        mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "12.34s", 0, null);
        assertEquals(12, mp.getSeconds());
        assertEquals(340, mp.getMillis());

        // Parse with 4 fraction digits (truncated to 3 digits)
        mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "12.3456s", 0, null);
        assertEquals(12, mp.getSeconds());
        assertEquals(345, mp.getMillis());

        // Parse without fraction
        mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "12s", 0, null);
        assertEquals(12, mp.getSeconds());
        assertEquals(0, mp.getMillis());

        // Parse negative value
        mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "-12.500s", 0, null);
        assertEquals(-12, mp.getSeconds());
        assertEquals(-500, mp.getMillis());
    }

    // -----------------------------------------------------------------------
    // Formatting & Parsing Options (minDigits, maxDigits, rejectSignedValues)
    // -----------------------------------------------------------------------

    @Test
    public void testMinimumPrintedDigits() {
        builder.minimumPrintedDigits(3).appendDays().appendSuffix("d");
        PeriodFormatter formatter = builder.toFormatter();
        assertEquals("005d", formatter.print(new Period().withDays(5)));
    }

    @Test
    public void testMaximumParsedDigits() {
        builder.maximumParsedDigits(2).appendDays();
        PeriodFormatter formatter = builder.toFormatter();

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "12345", 0, null);
        assertEquals(2, pos);
        assertEquals(12, mp.getDays());
    }

    @Test
    public void testRejectSignedValues() {
        builder.rejectSignedValues(true).appendDays();
        PeriodFormatter formatter = builder.toFormatter();

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "-5", 0, null);
        assertEquals(~0, pos); // parsing failed because signs are rejected

        builder.clear();
        builder.rejectSignedValues(false).appendDays();
        formatter = builder.toFormatter();
        pos = formatter.getParser().parseInto(mp, "-5", 0, null);
        assertEquals(2, pos);
        assertEquals(-5, mp.getDays());

        // Test with '+'
        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "+15", 0, null);
        assertEquals(3, pos);
        assertEquals(15, mp.getDays());
    }

    @Test
    public void testParseInt_largeNumberOver10Digits() {
        builder.maximumParsedDigits(12).appendDays();
        PeriodFormatter formatter = builder.toFormatter();

        MutablePeriod mp = new MutablePeriod();
        formatter.getParser().parseInto(mp, "1234567890", 0, null);
        assertEquals(1234567890, mp.getDays());
    }

    // -----------------------------------------------------------------------
    // Print Zero Configurations
    // -----------------------------------------------------------------------

    @Test
    public void testPrintZeroRarelyLast() {
        builder.printZeroRarelyLast().appendDays().appendSuffix("d ")
               .appendHours().appendSuffix("h");
        PeriodFormatter formatter = builder.toFormatter();

        Period zeroPeriod = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("0h", formatter.print(zeroPeriod)); // Last field outputs zero

        Period nonZero = new Period().withDays(2);
        assertEquals("2d ", formatter.print(nonZero));
    }

    @Test
    public void testPrintZeroRarelyFirst() {
        builder.printZeroRarelyFirst().appendDays().appendSuffix("d ")
               .appendHours().appendSuffix("h");
        PeriodFormatter formatter = builder.toFormatter();

        Period zeroPeriod = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("0d ", formatter.print(zeroPeriod)); // First field outputs zero
    }

    @Test
    public void testPrintZeroAlways() {
        builder.printZeroAlways().appendDays().appendSuffix("d ")
               .appendHours().appendSuffix("h");
        PeriodFormatter formatter = builder.toFormatter();

        Period zeroPeriod = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("0d 0h", formatter.print(zeroPeriod));

        PeriodType hoursOnly = PeriodType.hours();
        Period p = new Period(0, 0, 0, 0, 5, 0, 0, 0, hoursOnly);
        assertEquals("0d 5h", formatter.print(p));
    }

    @Test
    public void testPrintZeroNever() {
        builder.printZeroNever().appendDays().appendSuffix("d ")
               .appendHours().appendSuffix("h");
        PeriodFormatter formatter = builder.toFormatter();

        Period zeroPeriod = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("", formatter.print(zeroPeriod));
    }

    @Test
    public void testPrintZeroIfSupported() {
        builder.printZeroIfSupported().appendDays().appendSuffix("d ")
               .appendHours().appendSuffix("h");
        PeriodFormatter formatter = builder.toFormatter();

        PeriodType daysOnly = PeriodType.days();
        Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0, daysOnly);
        assertEquals("0d ", formatter.print(p));
    }

    // -----------------------------------------------------------------------
    // Prefixes and Suffixes (Simple, Plural, Composite)
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_null_throwsException() {
        builder.appendPrefix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixPlural_nullSingular_throwsException() {
        builder.appendPrefix(null, "plural");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixPlural_nullPlural_throwsException() {
        builder.appendPrefix("singular", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixNotFollowedByField_throwsException() {
        builder.appendPrefix("P").appendLiteral("L");
    }

    @Test
    public void testPrefix_simpleAndComposite() {
        builder.appendPrefix("Pre-").appendPrefix("Fixed-").appendDays().appendSuffix("d");
        PeriodFormatter formatter = builder.toFormatter();

        Period p = new Period().withDays(5);
        assertEquals("Pre-Fixed-5d", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "Pre-Fixed-5d", 0, null);
        assertEquals("Pre-Fixed-5d".length(), pos);
        assertEquals(5, mp.getDays());

        // Parse mismatch prefix
        pos = formatter.getParser().parseInto(mp, "Wrong-5d", 0, null);
        assertEquals(~0, pos);
    }

    @Test
    public void testPluralPrefixAndSuffix() {
        // Singular longer than plural vs plural longer than singular (testing swap branch)
        builder.appendPrefix("day: ", "days: ")
               .appendDays()
               .appendSuffix(" day", " days");
        PeriodFormatter formatter = builder.toFormatter();

        Period p1 = new Period().withDays(1);
        assertEquals("day: 1 day", formatter.print(p1));

        Period p2 = new Period().withDays(2);
        assertEquals("days: 2 days", formatter.print(p2));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "day: 1 day", 0, null);
        assertEquals("day: 1 day".length(), pos);
        assertEquals(1, mp.getDays());

        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "days: 2 days", 0, null);
        assertEquals("days: 2 days".length(), pos);
        assertEquals(2, mp.getDays());

        // Reverse length test (singular > plural)
        builder.clear();
        builder.appendDays().appendSuffix(" singularLong", " s");
        formatter = builder.toFormatter();
        assertEquals("1 singularLong", formatter.print(p1));
        assertEquals("2 s", formatter.print(p2));

        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "1 singularLong", 0, null);
        assertEquals("1 singularLong".length(), pos);
        assertEquals(1, mp.getDays());

        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "2 s", 0, null);
        assertEquals("2 s".length(), pos);
        assertEquals(2, mp.getDays());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_null_throwsException() {
        builder.appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixPlural_nullSingular_throwsException() {
        builder.appendSuffix(null, "plural");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixPlural_nullPlural_throwsException() {
        builder.appendSuffix("singular", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_noField_throwsException() {
        builder.appendSuffix("d");
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffixPlural_noField_throwsException() {
        builder.appendSuffix("d", "days");
    }

    @Test
    public void testCompositeSuffix() {
        builder.appendDays().appendSuffix(" day").appendSuffix("!");
        PeriodFormatter formatter = builder.toFormatter();

        assertEquals("5 day!", formatter.print(new Period().withDays(5)));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "5 day!", 0, null);
        assertEquals("5 day!".length(), pos);
        assertEquals(5, mp.getDays());
    }

    // -----------------------------------------------------------------------
    // Separators
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_nullText_throwsException() {
        builder.appendSeparator(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_nullFinalText_throwsException() {
        builder.appendSeparator("a", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_adjacentSeparators_throwsException() {
        builder.appendDays().appendSeparator(",").appendSeparator(";");
    }

    @Test
    public void testAppendSeparator_simple() {
        builder.appendDays().appendSeparator(", ").appendHours();
        PeriodFormatter formatter = builder.toFormatter();

        assertEquals("1, 2", formatter.print(new Period().withDays(1).withHours(2)));
        assertEquals("1", formatter.print(new Period().withDays(1)));
        assertEquals("2", formatter.print(new Period().withHours(2)));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "1, 2", 0, null);
        assertEquals(4, pos);
        assertEquals(1, mp.getDays());
        assertEquals(2, mp.getHours());
    }

    @Test
    public void testAppendSeparator_withFinalText() {
        builder.appendDays().appendSeparator(", ", " and ")
               .appendHours().appendSeparator(", ", " and ")
               .appendMinutes();
        PeriodFormatter formatter = builder.toFormatter();

        Period p3 = new Period().withDays(1).withHours(2).withMinutes(3);
        assertEquals("1, 2 and 3", formatter.print(p3));

        Period p2 = new Period().withDays(1).withMinutes(3);
        assertEquals("1 and 3", formatter.print(p2));

        Period p1 = new Period().withDays(1);
        assertEquals("1", formatter.print(p1));
    }

    @Test
    public void testAppendSeparator_withVariants() {
        String[] variants = new String[] {", and ", " & "};
        builder.appendDays().appendSeparator(", ", " and ", variants).appendHours();
        PeriodFormatter formatter = builder.toFormatter();

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "5 & 6", 0, null);
        assertEquals(5, pos);
        assertEquals(5, mp.getDays());
        assertEquals(6, mp.getHours());

        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "5, and 6", 0, null);
        assertEquals(8, pos);
        assertEquals(5, mp.getDays());
        assertEquals(6, mp.getHours());
    }

    @Test
    public void testAppendSeparatorIfFieldsAfter() {
        builder.appendSeparatorIfFieldsAfter("T").appendHours();
        PeriodFormatter formatter = builder.toFormatter();

        assertEquals("T5", formatter.print(new Period().withHours(5)));
        assertEquals("", formatter.print(new Period()));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "T5", 0, null);
        assertEquals(2, pos);
        assertEquals(5, mp.getHours());

        // Parse without separator when field is present should fail
        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "5", 0, null);
        assertTrue(pos < 0);
    }

    @Test
    public void testAppendSeparatorIfFieldsBefore() {
        builder.appendDays().appendSeparatorIfFieldsBefore(" finished");
        PeriodFormatter formatter = builder.toFormatter();

        assertEquals("5 finished", formatter.print(new Period().withDays(5)));
        assertEquals("", formatter.print(new Period()));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "5 finished", 0, null);
        assertEquals("5 finished".length(), pos);
        assertEquals(5, mp.getDays());
    }

    // -----------------------------------------------------------------------
    // Writer Printing & Length Calculations
    // -----------------------------------------------------------------------

    @Test
    public void testPrintTo_Writer_andCalculatePrintedLength() throws IOException {
        builder.appendPrefix("P")
               .appendDays().appendSuffix("D")
               .appendSeparator("T")
               .appendHours().appendSuffix("H")
               .appendSecondsWithMillis().appendSuffix("S");
        PeriodFormatter formatter = builder.toFormatter();

        Period p = new Period().withDays(2).withHours(4).withSeconds(12).withMillis(345);

        StringWriter writer = new StringWriter();
        formatter.getPrinter().printTo(writer, p, Locale.getDefault());
        String expected = "P2DT4H12.345S";
        assertEquals(expected, writer.toString());

        int calculatedLen = formatter.getPrinter().calculatePrintedLength(p, Locale.getDefault());
        assertEquals(expected.length(), calculatedLen);

        StringBuffer buf = new StringBuffer();
        formatter.getPrinter().printTo(buf, p, Locale.getDefault());
        assertEquals(expected, buf.toString());
    }

    @Test
    public void testCountFieldsToPrint() {
        builder.appendDays().appendSeparator(",").appendHours().appendSeparator(",").appendMinutes();
        PeriodFormatter formatter = builder.toFormatter();

        Period p = new Period().withDays(1).withMinutes(3);
        assertEquals(2, formatter.getPrinter().countFieldsToPrint(p, Integer.MAX_VALUE, null));
        assertEquals(0, formatter.getPrinter().countFieldsToPrint(p, 0, null));
        assertEquals(1, formatter.getPrinter().countFieldsToPrint(p, 1, null));
    }

    // -----------------------------------------------------------------------
    // Parsing Edge Cases & Negative Tests
    // -----------------------------------------------------------------------

    @Test
    public void testParse_atEndOfString() {
        builder.appendDays();
        PeriodFormatter formatter = builder.toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "10", 2, null);
        assertEquals(2, pos); // at end of string, non-mandatory
    }

    @Test
    public void testParse_invalidCharacter_returnsTildePosition() {
        builder.appendDays();
        PeriodFormatter formatter = builder.toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "abc", 0, null);
        assertEquals(~0, pos);
    }

    @Test
    public void testParse_twoDecimalsInSeconds_stopsAtSecondDecimal() {
        builder.appendSecondsWithMillis();
        PeriodFormatter formatter = builder.toFormatter();
        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "12.34.56", 0, null);
        assertEquals(5, pos);
        assertEquals(12, mp.getSeconds());
        assertEquals(340, mp.getMillis());
    }

    @Test
    public void testParse_unsupportedFieldInPeriod() {
        builder.appendDays().appendHours();
        PeriodFormatter formatter = builder.toFormatter();

        // Target period only supports Hours
        MutablePeriod mp = new MutablePeriod(PeriodType.hours());
        int pos = formatter.getParser().parseInto(mp, "12", 0, null);
        // Days skipped gracefully, parses 12 as Hours
        assertEquals(2, pos);
        assertEquals(12, mp.getHours());
    }

    @Test
    public void testSeparatorParse_extraSeparatorSupplied_failsGracefully() {
        builder.appendDays().appendSeparator(",").appendHours();
        PeriodFormatter formatter = builder.toFormatter();

        MutablePeriod mp = new MutablePeriod();
        // Separator given but no hours follow
        int pos = formatter.getParser().parseInto(mp, "5,", 0, null);
        assertTrue(pos < 0);
    }
}
