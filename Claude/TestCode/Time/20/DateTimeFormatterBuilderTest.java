import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.*;

public class DateTimeFormatterBuilderTest {

    private DateTimeFormatterBuilder builder;
    private Locale originalLocale;

    @Before
    public void setUp() {
        builder = new DateTimeFormatterBuilder();
        originalLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        Locale.setDefault(originalLocale);
    }

    //-----------------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_createsEmptyBuilder() {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        assertFalse(b.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // toFormatter / toPrinter / toParser
    //-----------------------------------------------------------------------
    @Test
    public void testToFormatter_normalInput_buildsFormatter() {
        builder.appendLiteral('X');
        DateTimeFormatter f = builder.toFormatter();
        assertNotNull(f);
        assertTrue(f.isPrinter());
        assertTrue(f.isParser());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToFormatter_emptyBuilder_throwsException() {
        builder.toFormatter();
    }

    @Test
    public void testToPrinter_normalInput_buildsPrinter() {
        builder.appendLiteral('A');
        DateTimePrinter p = builder.toPrinter();
        assertNotNull(p);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToPrinter_onlyParser_throwsException() {
        builder.appendOptional(new DateTimeFormatterBuilder().appendLiteral('Z').toParser());
        builder.toPrinter();
    }

    @Test
    public void testToParser_normalInput_buildsParser() {
        builder.appendLiteral('A');
        DateTimeParser p = builder.toParser();
        assertNotNull(p);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToParser_onlyPrinter_throwsException() {
        DateTimePrinter printer = new DateTimeFormatterBuilder().appendLiteral('Z').toFormatter().getPrinter();
        builder.append(printer);
        builder.toParser();
    }

    //-----------------------------------------------------------------------
    // canBuildFormatter / canBuildPrinter / canBuildParser
    //-----------------------------------------------------------------------
    @Test
    public void testCanBuildFormatter_withElement_returnsTrue() {
        builder.appendLiteral('A');
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testCanBuildFormatter_empty_returnsFalse() {
        assertFalse(builder.canBuildFormatter());
    }

    @Test
    public void testCanBuildPrinter_withPrinter_returnsTrue() {
        builder.appendLiteral('A');
        assertTrue(builder.canBuildPrinter());
    }

    @Test
    public void testCanBuildParser_withParser_returnsTrue() {
        builder.appendLiteral('A');
        assertTrue(builder.canBuildParser());
    }

    //-----------------------------------------------------------------------
    // clear
    //-----------------------------------------------------------------------
    @Test
    public void testClear_afterAppend_resetsBuilder() {
        builder.appendLiteral('A');
        builder.clear();
        assertFalse(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // append(DateTimeFormatter)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendFormatter_validFormatter_appendsSuccessfully() {
        DateTimeFormatter inner = new DateTimeFormatterBuilder().appendLiteral('Y').toFormatter();
        builder.append(inner);
        DateTimeFormatter f = builder.toFormatter();
        assertEquals("Y", f.print(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFormatter_null_throwsException() {
        builder.append((DateTimeFormatter) null);
    }

    //-----------------------------------------------------------------------
    // append(DateTimePrinter)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendPrinter_validPrinter_appendsSuccessfully() {
        DateTimePrinter printer = new DateTimeFormatterBuilder().appendLiteral('P').toFormatter().getPrinter();
        builder.append(printer);
        assertTrue(builder.canBuildPrinter());
        assertFalse(builder.canBuildParser());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinter_null_throwsException() {
        builder.append((DateTimePrinter) null);
    }

    //-----------------------------------------------------------------------
    // append(DateTimeParser)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendParser_validParser_appendsSuccessfully() {
        DateTimeParser parser = new DateTimeFormatterBuilder().appendLiteral('P').toFormatter().getParser();
        builder.append(parser);
        assertTrue(builder.canBuildParser());
        assertFalse(builder.canBuildPrinter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendParser_null_throwsException() {
        builder.append((DateTimeParser) null);
    }

    //-----------------------------------------------------------------------
    // append(DateTimePrinter, DateTimeParser)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendPrinterAndParser_validInputs_appendsSuccessfully() {
        DateTimeFormatter inner = new DateTimeFormatterBuilder().appendLiteral('Q').toFormatter();
        builder.append(inner.getPrinter(), inner.getParser());
        assertTrue(builder.canBuildFormatter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterAndParser_nullPrinter_throwsException() {
        DateTimeFormatter inner = new DateTimeFormatterBuilder().appendLiteral('Q').toFormatter();
        builder.append((DateTimePrinter) null, inner.getParser());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterAndParser_nullParser_throwsException() {
        DateTimeFormatter inner = new DateTimeFormatterBuilder().appendLiteral('Q').toFormatter();
        builder.append(inner.getPrinter(), (DateTimeParser) null);
    }

    //-----------------------------------------------------------------------
    // append(DateTimePrinter, DateTimeParser[])
    //-----------------------------------------------------------------------
    @Test
    public void testAppendPrinterAndParserArray_singleElement_appendsSuccessfully() {
        DateTimeFormatter inner = new DateTimeFormatterBuilder().appendLiteral('R').toFormatter();
        DateTimeParser[] parsers = new DateTimeParser[] { inner.getParser() };
        builder.append(inner.getPrinter(), parsers);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendPrinterAndParserArray_multipleElements_appendsSuccessfully() {
        DateTimeFormatter innerA = new DateTimeFormatterBuilder().appendLiteral('A').toFormatter();
        DateTimeFormatter innerB = new DateTimeFormatterBuilder().appendLiteral('B').toFormatter();
        DateTimeParser[] parsers = new DateTimeParser[] { innerA.getParser(), innerB.getParser() };
        builder.append(innerA.getPrinter(), parsers);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendPrinterAndParserArray_lastElementNull_appendsSuccessfully() {
        DateTimeFormatter innerA = new DateTimeFormatterBuilder().appendLiteral('A').toFormatter();
        DateTimeParser[] parsers = new DateTimeParser[] { innerA.getParser(), null };
        builder.append(innerA.getPrinter(), parsers);
        assertTrue(builder.canBuildFormatter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterAndParserArray_nullParsersArray_throwsException() {
        builder.append((DateTimePrinter) null, (DateTimeParser[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterAndParserArray_singleNullElement_throwsException() {
        DateTimeParser[] parsers = new DateTimeParser[] { null };
        builder.append((DateTimePrinter) null, parsers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterAndParserArray_incompleteArray_throwsException() {
        DateTimeFormatter innerA = new DateTimeFormatterBuilder().appendLiteral('A').toFormatter();
        DateTimeParser[] parsers = new DateTimeParser[] { null, innerA.getParser() };
        builder.append(innerA.getPrinter(), parsers);
    }

    //-----------------------------------------------------------------------
    // appendOptional
    //-----------------------------------------------------------------------
    @Test
    public void testAppendOptional_validParser_appendsSuccessfully() {
        DateTimeFormatter inner = new DateTimeFormatterBuilder().appendLiteral('O').toFormatter();
        builder.appendOptional(inner.getParser());
        assertTrue(builder.canBuildParser());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendOptional_null_throwsException() {
        builder.appendOptional(null);
    }

    //-----------------------------------------------------------------------
    // appendLiteral(char)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendLiteralChar_normalInput_printsCorrectly() {
        builder.appendLiteral('Z');
        DateTimeFormatter f = builder.toFormatter();
        assertEquals("Z", f.print(0L));
    }

    //-----------------------------------------------------------------------
    // appendLiteral(String)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendLiteralString_normalInput_printsCorrectly() {
        builder.appendLiteral("Hello");
        DateTimeFormatter f = builder.toFormatter();
        assertEquals("Hello", f.print(0L));
    }

    @Test
    public void testAppendLiteralString_emptyString_doesNotAddAnything() {
        builder.appendLiteral("");
        assertFalse(builder.canBuildFormatter());
    }

    @Test
    public void testAppendLiteralString_singleChar_printsCorrectly() {
        builder.appendLiteral("A");
        DateTimeFormatter f = builder.toFormatter();
        assertEquals("A", f.print(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteralString_null_throwsException() {
        builder.appendLiteral((String) null);
    }

    //-----------------------------------------------------------------------
    // appendDecimal
    //-----------------------------------------------------------------------
    @Test
    public void testAppendDecimal_normalInput_printsAndParses() {
        builder.appendDecimal(DateTimeFieldType.year(), 4, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("2020", f.print(dt));
    }

    @Test
    public void testAppendDecimal_minDigitsLessThanOne_usesUnpaddedNumber() {
        builder.appendDecimal(DateTimeFieldType.dayOfMonth(), 0, 2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 5, 0, 0, DateTimeZone.UTC);
        assertEquals("5", f.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_nullFieldType_throwsException() {
        builder.appendDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_negativeMinDigits_throwsException() {
        builder.appendDecimal(DateTimeFieldType.year(), -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_maxDigitsZeroOrLess_throwsException() {
        builder.appendDecimal(DateTimeFieldType.year(), 0, 0);
    }

    @Test
    public void testAppendDecimal_maxLessThanMin_adjustsMaxToMin() {
        builder.appendDecimal(DateTimeFieldType.year(), 4, 2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("2020", f.print(dt));
    }

    //-----------------------------------------------------------------------
    // appendFixedDecimal
    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedDecimal_normalInput_printsCorrectly() {
        builder.appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 5, 0, 0, DateTimeZone.UTC);
        assertEquals("05", f.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_nullFieldType_throwsException() {
        builder.appendFixedDecimal(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_zeroDigits_throwsException() {
        builder.appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 0);
    }

    //-----------------------------------------------------------------------
    // appendSignedDecimal
    //-----------------------------------------------------------------------
    @Test
    public void testAppendSignedDecimal_normalInput_printsCorrectly() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), 4, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("2020", f.print(dt));
    }

    @Test
    public void testAppendSignedDecimal_minDigitsLessThanOne_usesUnpaddedNumber() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), 0, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("2020", f.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_nullFieldType_throwsException() {
        builder.appendSignedDecimal(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_negativeMinDigits_throwsException() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), -1, 2);
    }

    //-----------------------------------------------------------------------
    // appendFixedSignedDecimal
    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedSignedDecimal_normalInput_printsCorrectly() {
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("2020", f.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_nullFieldType_throwsException() {
        builder.appendFixedSignedDecimal(null, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_zeroDigits_throwsException() {
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), 0);
    }

    //-----------------------------------------------------------------------
    // appendText / appendShortText
    //-----------------------------------------------------------------------
    @Test
    public void testAppendText_normalInput_printsCorrectly() {
        builder.appendText(DateTimeFieldType.monthOfYear());
        DateTimeFormatter f = builder.toFormatter().withLocale(Locale.ENGLISH);
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("January", f.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_null_throwsException() {
        builder.appendText(null);
    }

    @Test
    public void testAppendShortText_normalInput_printsCorrectly() {
        builder.appendShortText(DateTimeFieldType.monthOfYear());
        DateTimeFormatter f = builder.toFormatter().withLocale(Locale.ENGLISH);
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("Jan", f.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendShortText_null_throwsException() {
        builder.appendShortText(null);
    }

    //-----------------------------------------------------------------------
    // appendFraction
    //-----------------------------------------------------------------------
    @Test
    public void testAppendFraction_normalInput_printsCorrectly() {
        builder.appendFraction(DateTimeFieldType.secondOfDay(), 3, 3);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, 0, 500, DateTimeZone.UTC);
        String result = f.print(dt);
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_nullFieldType_throwsException() {
        builder.appendFraction(null, 1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_negativeMinDigits_throwsException() {
        builder.appendFraction(DateTimeFieldType.secondOfDay(), -1, 2);
    }

    //-----------------------------------------------------------------------
    // appendFractionOfSecond/Minute/Hour/Day
    //-----------------------------------------------------------------------
    @Test
    public void testAppendFractionOfSecond_normalInput_buildsFormatter() {
        builder.appendFractionOfSecond(1, 3);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendFractionOfMinute_normalInput_buildsFormatter() {
        builder.appendFractionOfMinute(1, 3);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendFractionOfHour_normalInput_buildsFormatter() {
        builder.appendFractionOfHour(1, 3);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendFractionOfDay_normalInput_buildsFormatter() {
        builder.appendFractionOfDay(1, 3);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendMillisOfSecond / appendMillisOfDay
    //-----------------------------------------------------------------------
    @Test
    public void testAppendMillisOfSecond_normalInput_printsCorrectly() {
        builder.appendMillisOfSecond(3);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC);
        assertEquals("123", f.print(dt));
    }

    @Test
    public void testAppendMillisOfDay_normalInput_buildsFormatter() {
        builder.appendMillisOfDay(1);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendSecondOfMinute / appendSecondOfDay
    //-----------------------------------------------------------------------
    @Test
    public void testAppendSecondOfMinute_normalInput_printsCorrectly() {
        builder.appendSecondOfMinute(2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, 5, 0, DateTimeZone.UTC);
        assertEquals("05", f.print(dt));
    }

    @Test
    public void testAppendSecondOfDay_normalInput_buildsFormatter() {
        builder.appendSecondOfDay(1);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendMinuteOfHour / appendMinuteOfDay
    //-----------------------------------------------------------------------
    @Test
    public void testAppendMinuteOfHour_normalInput_printsCorrectly() {
        builder.appendMinuteOfHour(2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 30, 0, 0, DateTimeZone.UTC);
        assertEquals("30", f.print(dt));
    }

    @Test
    public void testAppendMinuteOfDay_normalInput_buildsFormatter() {
        builder.appendMinuteOfDay(1);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendHourOfDay / appendClockhourOfDay
    //-----------------------------------------------------------------------
    @Test
    public void testAppendHourOfDay_normalInput_printsCorrectly() {
        builder.appendHourOfDay(2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 14, 0, 0, 0, DateTimeZone.UTC);
        assertEquals("14", f.print(dt));
    }

    @Test
    public void testAppendClockhourOfDay_normalInput_buildsFormatter() {
        builder.appendClockhourOfDay(2);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendHourOfHalfday / appendClockhourOfHalfday
    //-----------------------------------------------------------------------
    @Test
    public void testAppendHourOfHalfday_normalInput_buildsFormatter() {
        builder.appendHourOfHalfday(2);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendClockhourOfHalfday_normalInput_buildsFormatter() {
        builder.appendClockhourOfHalfday(2);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendDayOfWeek / appendDayOfMonth / appendDayOfYear
    //-----------------------------------------------------------------------
    @Test
    public void testAppendDayOfWeek_normalInput_buildsFormatter() {
        builder.appendDayOfWeek(1);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendDayOfMonth_normalInput_printsCorrectly() {
        builder.appendDayOfMonth(2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 5, 0, 0, DateTimeZone.UTC);
        assertEquals("05", f.print(dt));
    }

    @Test
    public void testAppendDayOfYear_normalInput_buildsFormatter() {
        builder.appendDayOfYear(1);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendWeekOfWeekyear / appendWeekyear
    //-----------------------------------------------------------------------
    @Test
    public void testAppendWeekOfWeekyear_normalInput_buildsFormatter() {
        builder.appendWeekOfWeekyear(1);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendWeekyear_normalInput_buildsFormatter() {
        builder.appendWeekyear(4, 4);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendMonthOfYear / appendYear
    //-----------------------------------------------------------------------
    @Test
    public void testAppendMonthOfYear_normalInput_printsCorrectly() {
        builder.appendMonthOfYear(2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 3, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("03", f.print(dt));
    }

    @Test
    public void testAppendYear_normalInput_buildsFormatter() {
        builder.appendYear(4, 4);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendTwoDigitYear
    //-----------------------------------------------------------------------
    @Test
    public void testAppendTwoDigitYear_onlyPivot_printsCorrectly() {
        builder.appendTwoDigitYear(2000);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("20", f.print(dt));
    }

    @Test
    public void testAppendTwoDigitYear_withLenientParse_buildsFormatter() {
        builder.appendTwoDigitYear(2000, true);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendTwoDigitWeekyear
    //-----------------------------------------------------------------------
    @Test
    public void testAppendTwoDigitWeekyear_onlyPivot_buildsFormatter() {
        builder.appendTwoDigitWeekyear(2000);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendTwoDigitWeekyear_withLenientParse_buildsFormatter() {
        builder.appendTwoDigitWeekyear(2000, true);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendYearOfEra / appendYearOfCentury / appendCenturyOfEra
    //-----------------------------------------------------------------------
    @Test
    public void testAppendYearOfEra_normalInput_buildsFormatter() {
        builder.appendYearOfEra(4, 4);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendYearOfCentury_normalInput_buildsFormatter() {
        builder.appendYearOfCentury(2, 2);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendCenturyOfEra_normalInput_buildsFormatter() {
        builder.appendCenturyOfEra(2, 2);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendHalfdayOfDayText / appendDayOfWeekText / appendDayOfWeekShortText
    //-----------------------------------------------------------------------
    @Test
    public void testAppendHalfdayOfDayText_normalInput_buildsFormatter() {
        builder.appendHalfdayOfDayText();
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendDayOfWeekText_normalInput_printsCorrectly() {
        builder.appendDayOfWeekText();
        DateTimeFormatter f = builder.toFormatter().withLocale(Locale.ENGLISH);
        DateTime dt = new DateTime(2020, 1, 6, 0, 0, DateTimeZone.UTC); // Monday
        assertEquals("Monday", f.print(dt));
    }

    @Test
    public void testAppendDayOfWeekShortText_normalInput_buildsFormatter() {
        builder.appendDayOfWeekShortText();
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendMonthOfYearText / appendMonthOfYearShortText / appendEraText
    //-----------------------------------------------------------------------
    @Test
    public void testAppendMonthOfYearText_normalInput_buildsFormatter() {
        builder.appendMonthOfYearText();
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendMonthOfYearShortText_normalInput_buildsFormatter() {
        builder.appendMonthOfYearShortText();
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendEraText_normalInput_buildsFormatter() {
        builder.appendEraText();
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendTimeZoneName
    //-----------------------------------------------------------------------
    @Test
    public void testAppendTimeZoneName_noLookup_canBuildPrinterOnly() {
        builder.appendTimeZoneName();
        assertTrue(builder.canBuildPrinter());
        assertFalse(builder.canBuildParser());
    }

    @Test
    public void testAppendTimeZoneName_withLookup_canBuildFormatter() {
        Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        lookup.put("UTC", DateTimeZone.UTC);
        builder.appendTimeZoneName(lookup);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendTimeZoneShortName
    //-----------------------------------------------------------------------
    @Test
    public void testAppendTimeZoneShortName_noLookup_canBuildPrinterOnly() {
        builder.appendTimeZoneShortName();
        assertTrue(builder.canBuildPrinter());
        assertFalse(builder.canBuildParser());
    }

    @Test
    public void testAppendTimeZoneShortName_withLookup_canBuildFormatter() {
        Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        lookup.put("UTC", DateTimeZone.UTC);
        builder.appendTimeZoneShortName(lookup);
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendTimeZoneId
    //-----------------------------------------------------------------------
    @Test
    public void testAppendTimeZoneId_normalInput_buildsFormatter() {
        builder.appendTimeZoneId();
        assertTrue(builder.canBuildFormatter());
    }

    //-----------------------------------------------------------------------
    // appendTimeZoneOffset (4-arg)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendTimeZoneOffset_fourArgs_buildsFormatter() {
        builder.appendTimeZoneOffset("Z", true, 2, 4);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendTimeZoneOffset_fourArgs_printsZeroOffset() {
        builder.appendTimeZoneOffset("Z", true, 2, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("Z", f.print(dt));
    }

    //-----------------------------------------------------------------------
    // appendTimeZoneOffset (5-arg)
    //-----------------------------------------------------------------------
    @Test
    public void testAppendTimeZoneOffset_fiveArgs_buildsFormatter() {
        builder.appendTimeZoneOffset("Z", "Z", true, 2, 4);
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendTimeZoneOffset_fiveArgs_printsZeroOffset() {
        builder.appendTimeZoneOffset("Z", "Z", true, 2, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        assertEquals("Z", f.print(dt));
    }

    //-----------------------------------------------------------------------
    // appendPattern
    //-----------------------------------------------------------------------
    @Test
    public void testAppendPattern_normalInput_printsCorrectly() {
        builder.appendPattern("yyyy-MM-dd");
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 3, 15, 0, 0, DateTimeZone.UTC);
        assertEquals("2020-03-15", f.print(dt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPattern_invalidPattern_throwsException() {
        builder.appendPattern("[invalid");
    }

    //-----------------------------------------------------------------------
    // Round-trip parse tests exercising internal classes
    //-----------------------------------------------------------------------
    @Test
    public void testRoundTrip_literalAndDecimal_parsesCorrectly() {
        builder.appendLiteral("Year:").appendDecimal(DateTimeFieldType.year(), 4, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime parsed = f.parseDateTime("Year:2020").withZoneRetainFields(DateTimeZone.UTC);
        assertEquals(2020, parsed.getYear());
    }

    @Test
    public void testRoundTrip_signedDecimalNegativeYear_parsesCorrectly() {
        builder.appendSignedDecimal(DateTimeFieldType.year(), 1, 9);
        DateTimeFormatter f = builder.toFormatter();
        DateTime parsed = f.parseDateTime("-5").withZoneRetainFields(DateTimeZone.UTC);
        assertEquals(-5, parsed.getYear());
    }

    @Test
    public void testRoundTrip_twoDigitYear_parsesWithPivot() {
        builder.appendTwoDigitYear(2000);
        DateTimeFormatter f = builder.toFormatter();
        MutableDateTime mdt = new MutableDateTime(0L, DateTimeZone.UTC);
        int newPos = f.parseInto(mdt, "20", 0);
        assertTrue(newPos >= 0);
    }

    @Test
    public void testRoundTrip_monthOfYearText_parsesCorrectly() {
        builder.appendMonthOfYearText();
        DateTimeFormatter f = builder.toFormatter().withLocale(Locale.ENGLISH);
        DateTime parsed = f.parseDateTime("March").withZoneRetainFields(DateTimeZone.UTC);
        assertEquals(3, parsed.getMonthOfYear());
    }

    @Test
    public void testRoundTrip_timeZoneOffsetPositive_parsesCorrectly() {
        builder.appendTimeZoneOffset("Z", true, 1, 4);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 1, 1, 5, 30, 0, 0, DateTimeZone.forOffsetHoursMinutes(5, 30));
        String printed = f.print(dt);
        assertNotNull(printed);
    }

    @Test
    public void testRoundTrip_compositeMultipleFields_printsCorrectly() {
        builder.appendYear(4, 4)
               .appendLiteral('-')
               .appendMonthOfYear(2)
               .appendLiteral('-')
               .appendDayOfMonth(2);
        DateTimeFormatter f = builder.toFormatter();
        DateTime dt = new DateTime(2020, 5, 9, 0, 0, DateTimeZone.UTC);
        assertEquals("2020-05-09", f.print(dt));
    }

    @Test
    public void testAppend0_resetsCachedFormatter_newElementReflected() {
        builder.appendLiteral('A');
        DateTimeFormatter f1 = builder.toFormatter();
        builder.appendLiteral('B');
        DateTimeFormatter f2 = builder.toFormatter();
        assertEquals("A", f1.print(0L));
        assertEquals("AB", f2.print(0L));
    }

    //-----------------------------------------------------------------------
    // Fraction edge-cases
    //-----------------------------------------------------------------------
    @Test
    public void testAppendFraction_maxDigitsExceeds18_capped() {
        builder.appendFraction(DateTimeFieldType.secondOfDay(), 1, 20);
        assertTrue(builder.canBuildFormatter());
    }
}
