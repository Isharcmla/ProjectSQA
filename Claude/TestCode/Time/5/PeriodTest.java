import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableDuration;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Weeks;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public class PeriodTest {

    private Period standardPeriod;

    @Before
    public void setUp() {
        standardPeriod = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    }

    //----------------------------------------------------------------
    // ZERO constant
    //----------------------------------------------------------------
    @Test
    public void testZero_isZeroLength() {
        assertEquals(0, Period.ZERO.getYears());
        assertEquals(0, Period.ZERO.getMonths());
        assertEquals(0, Period.ZERO.getSeconds());
    }

    //----------------------------------------------------------------
    // parse
    //----------------------------------------------------------------
    @Test
    public void testParse_validIsoString_returnsPeriod() {
        Period p = Period.parse("P1Y2M3W4DT5H6M7.008S");
        assertEquals(1, p.getYears());
        assertEquals(2, p.getMonths());
        assertEquals(3, p.getWeeks());
        assertEquals(4, p.getDays());
        assertEquals(5, p.getHours());
        assertEquals(6, p.getMinutes());
        assertEquals(7, p.getSeconds());
        assertEquals(8, p.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_invalidString_throwsException() {
        Period.parse("invalid-period-string");
    }

    @Test
    public void testParse_withFormatter_returnsPeriod() {
        PeriodFormatter formatter = ISOPeriodFormat.standard();
        Period p = Period.parse("P1Y", formatter);
        assertEquals(1, p.getYears());
    }

    //----------------------------------------------------------------
    // static factory methods
    //----------------------------------------------------------------
    @Test
    public void testYears_positiveValue_createsPeriodWithYears() {
        Period p = Period.years(5);
        assertEquals(5, p.getYears());
        assertEquals(0, p.getMonths());
    }

    @Test
    public void testMonths_positiveValue_createsPeriodWithMonths() {
        Period p = Period.months(5);
        assertEquals(5, p.getMonths());
    }

    @Test
    public void testWeeks_positiveValue_createsPeriodWithWeeks() {
        Period p = Period.weeks(5);
        assertEquals(5, p.getWeeks());
    }

    @Test
    public void testDays_positiveValue_createsPeriodWithDays() {
        Period p = Period.days(5);
        assertEquals(5, p.getDays());
    }

    @Test
    public void testHours_positiveValue_createsPeriodWithHours() {
        Period p = Period.hours(5);
        assertEquals(5, p.getHours());
    }

    @Test
    public void testMinutes_positiveValue_createsPeriodWithMinutes() {
        Period p = Period.minutes(5);
        assertEquals(5, p.getMinutes());
    }

    @Test
    public void testSeconds_positiveValue_createsPeriodWithSeconds() {
        Period p = Period.seconds(5);
        assertEquals(5, p.getSeconds());
    }

    @Test
    public void testMillis_positiveValue_createsPeriodWithMillis() {
        Period p = Period.millis(5);
        assertEquals(5, p.getMillis());
    }

    @Test
    public void testYears_negativeValue_createsPeriodWithNegativeYears() {
        Period p = Period.years(-3);
        assertEquals(-3, p.getYears());
    }

    @Test
    public void testMillis_zeroValue_createsZeroPeriod() {
        Period p = Period.millis(0);
        assertEquals(0, p.getMillis());
    }

    //----------------------------------------------------------------
    // fieldDifference
    //----------------------------------------------------------------
    @Test
    public void testFieldDifference_validPartials_returnsCorrectPeriod() {
        LocalDate start = new LocalDate(2005, 6, 9);
        LocalDate end = new LocalDate(2007, 4, 12);
        Period p = Period.fieldDifference(start, end);
        assertNotNull(p);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_nullStart_throwsException() {
        LocalDate end = new LocalDate(2007, 4, 12);
        Period.fieldDifference(null, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_nullEnd_throwsException() {
        LocalDate start = new LocalDate(2005, 6, 9);
        Period.fieldDifference(start, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_differentSizedPartials_throwsException() {
        LocalDate start = new LocalDate(2005, 6, 9);
        LocalTime end = new LocalTime(10, 20, 30);
        Period.fieldDifference(start, end);
    }

    //----------------------------------------------------------------
    // Constructors
    //----------------------------------------------------------------
    @Test
    public void testConstructor_empty_createsZeroPeriod() {
        Period p = new Period();
        assertEquals(0, p.getYears());
        assertEquals(0, p.getMillis());
    }

    @Test
    public void testConstructor_fourArgs_createsPeriodWithTimeFields() {
        Period p = new Period(1, 2, 3, 4);
        assertEquals(1, p.getHours());
        assertEquals(2, p.getMinutes());
        assertEquals(3, p.getSeconds());
        assertEquals(4, p.getMillis());
    }

    @Test
    public void testConstructor_eightArgs_createsFullPeriod() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(1, p.getYears());
        assertEquals(2, p.getMonths());
        assertEquals(3, p.getWeeks());
        assertEquals(4, p.getDays());
        assertEquals(5, p.getHours());
        assertEquals(6, p.getMinutes());
        assertEquals(7, p.getSeconds());
        assertEquals(8, p.getMillis());
    }

    @Test
    public void testConstructor_eightArgsWithType_createsFullPeriod() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        assertEquals(1, p.getYears());
        assertEquals(8, p.getMillis());
    }

    @Test
    public void testConstructor_eightArgsWithNullType_usesStandard() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0, null);
        assertEquals(1, p.getYears());
    }

    @Test
    public void testConstructor_durationOnly_createsPeriod() {
        Period p = new Period(3600000L);
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_durationAndType_createsPeriod() {
        Period p = new Period(3600000L, PeriodType.standard());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_durationAndChronology_createsPeriod() {
        Period p = new Period(3600000L, ISOChronology.getInstanceUTC());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_durationTypeAndChronology_createsPeriod() {
        Period p = new Period(3600000L, PeriodType.standard(), ISOChronology.getInstanceUTC());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_startEndMillis_createsPeriod() {
        Period p = new Period(0L, 3600000L);
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_startEndMillisWithType_createsPeriod() {
        Period p = new Period(0L, 3600000L, PeriodType.standard());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_startEndMillisWithChronology_createsPeriod() {
        Period p = new Period(0L, 3600000L, ISOChronology.getInstanceUTC());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_startEndMillisWithTypeAndChronology_createsPeriod() {
        Period p = new Period(0L, 3600000L, PeriodType.standard(), ISOChronology.getInstanceUTC());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_readableInstants_createsPeriod() {
        DateTime start = new DateTime(2000, 1, 1, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        DateTime end = new DateTime(2000, 1, 2, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Period p = new Period((ReadableInstant) start, (ReadableInstant) end);
        assertEquals(1, p.getDays());
    }

    @Test
    public void testConstructor_readableInstantsWithType_createsPeriod() {
        DateTime start = new DateTime(2000, 1, 1, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        DateTime end = new DateTime(2000, 1, 2, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Period p = new Period((ReadableInstant) start, (ReadableInstant) end, PeriodType.standard());
        assertEquals(1, p.getDays());
    }

    @Test
    public void testConstructor_readablePartials_createsPeriod() {
        LocalDate start = new LocalDate(2000, 1, 1);
        LocalDate end = new LocalDate(2000, 1, 2);
        Period p = new Period((ReadablePartial) start, (ReadablePartial) end);
        assertEquals(1, p.getDays());
    }

    @Test
    public void testConstructor_readablePartialsWithType_createsPeriod() {
        LocalDate start = new LocalDate(2000, 1, 1);
        LocalDate end = new LocalDate(2000, 1, 2);
        Period p = new Period((ReadablePartial) start, (ReadablePartial) end, PeriodType.standard());
        assertEquals(1, p.getDays());
    }

    @Test
    public void testConstructor_instantAndDuration_createsPeriod() {
        DateTime start = new DateTime(2000, 1, 1, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = new Duration(3600000L);
        Period p = new Period((ReadableInstant) start, (ReadableDuration) duration);
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_instantAndDurationWithType_createsPeriod() {
        DateTime start = new DateTime(2000, 1, 1, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = new Duration(3600000L);
        Period p = new Period((ReadableInstant) start, (ReadableDuration) duration, PeriodType.standard());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_durationAndInstant_createsPeriod() {
        DateTime end = new DateTime(2000, 1, 1, 1, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = new Duration(3600000L);
        Period p = new Period((ReadableDuration) duration, (ReadableInstant) end);
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_durationAndInstantWithType_createsPeriod() {
        DateTime end = new DateTime(2000, 1, 1, 1, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = new Duration(3600000L);
        Period p = new Period((ReadableDuration) duration, (ReadableInstant) end, PeriodType.standard());
        assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_objectConversion_createsPeriod() {
        Period original = Period.years(5);
        Period p = new Period((Object) original);
        assertEquals(5, p.getYears());
    }

    @Test
    public void testConstructor_objectConversionWithType_createsPeriod() {
        Period original = Period.years(5);
        Period p = new Period((Object) original, PeriodType.standard());
        assertEquals(5, p.getYears());
    }

    @Test
    public void testConstructor_objectConversionWithChronology_createsPeriod() {
        Period original = Period.years(5);
        Period p = new Period((Object) original, ISOChronology.getInstanceUTC());
        assertEquals(5, p.getYears());
    }

    @Test
    public void testConstructor_objectConversionWithTypeAndChronology_createsPeriod() {
        Period original = Period.years(5);
        Period p = new Period((Object) original, PeriodType.standard(), ISOChronology.getInstanceUTC());
        assertEquals(5, p.getYears());
    }

    @Test
    public void testConstructor_stringObjectConversion_createsPeriod() {
        Period p = new Period((Object) "P1Y2M3W4DT5H6M7.008S");
        assertEquals(1, p.getYears());
    }

    //----------------------------------------------------------------
    // toPeriod
    //----------------------------------------------------------------
    @Test
    public void testToPeriod_returnsThis() {
        assertSame(standardPeriod, standardPeriod.toPeriod());
    }

    //----------------------------------------------------------------
    // getters
    //----------------------------------------------------------------
    @Test
    public void testGetYears_returnsCorrectValue() {
        assertEquals(1, standardPeriod.getYears());
    }

    @Test
    public void testGetMonths_returnsCorrectValue() {
        assertEquals(2, standardPeriod.getMonths());
    }

    @Test
    public void testGetWeeks_returnsCorrectValue() {
        assertEquals(3, standardPeriod.getWeeks());
    }

    @Test
    public void testGetDays_returnsCorrectValue() {
        assertEquals(4, standardPeriod.getDays());
    }

    @Test
    public void testGetHours_returnsCorrectValue() {
        assertEquals(5, standardPeriod.getHours());
    }

    @Test
    public void testGetMinutes_returnsCorrectValue() {
        assertEquals(6, standardPeriod.getMinutes());
    }

    @Test
    public void testGetSeconds_returnsCorrectValue() {
        assertEquals(7, standardPeriod.getSeconds());
    }

    @Test
    public void testGetMillis_returnsCorrectValue() {
        assertEquals(8, standardPeriod.getMillis());
    }

    //----------------------------------------------------------------
    // withPeriodType
    //----------------------------------------------------------------
    @Test
    public void testWithPeriodType_sameType_returnsThis() {
        Period p = Period.years(1);
        Period result = p.withPeriodType(PeriodType.standard());
        assertSame(p, result);
    }

    @Test
    public void testWithPeriodType_differentType_returnsNewPeriod() {
        Period p = Period.years(1);
        Period result = p.withPeriodType(PeriodType.yearMonthDay());
        assertEquals(1, result.getYears());
        assertNotSame(p, result);
    }

    @Test
    public void testWithPeriodType_nullType_usesStandard() {
        Period p = Period.years(1);
        Period result = p.withPeriodType(null);
        assertEquals(PeriodType.standard(), result.getPeriodType());
    }

    //----------------------------------------------------------------
    // withFields
    //----------------------------------------------------------------
    @Test
    public void testWithFields_nullPeriod_returnsThis() {
        Period p = Period.years(1);
        Period result = p.withFields(null);
        assertSame(p, result);
    }

    @Test
    public void testWithFields_validPeriod_mergesFields() {
        Period p = Period.years(1);
        Period toMerge = Period.months(5);
        Period result = p.withFields(toMerge);
        assertEquals(1, result.getYears());
        assertEquals(5, result.getMonths());
    }

    //----------------------------------------------------------------
    // withField
    //----------------------------------------------------------------
    @Test
    public void testWithField_validField_setsValue() {
        Period p = Period.years(1);
        Period result = p.withField(DurationFieldType.years(), 10);
        assertEquals(10, result.getYears());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_nullField_throwsException() {
        Period p = Period.years(1);
        p.withField(null, 10);
    }

    //----------------------------------------------------------------
    // withFieldAdded
    //----------------------------------------------------------------
    @Test
    public void testWithFieldAdded_nonZeroValue_addsValue() {
        Period p = Period.years(1);
        Period result = p.withFieldAdded(DurationFieldType.years(), 5);
        assertEquals(6, result.getYears());
    }

    @Test
    public void testWithFieldAdded_zeroValue_returnsThis() {
        Period p = Period.years(1);
        Period result = p.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(p, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_nullField_throwsException() {
        Period p = Period.years(1);
        p.withFieldAdded(null, 5);
    }

    //----------------------------------------------------------------
    // withYears/withMonths/withWeeks/withDays/withHours/withMinutes/withSeconds/withMillis
    //----------------------------------------------------------------
    @Test
    public void testWithYears_setsYearsField() {
        Period result = standardPeriod.withYears(100);
        assertEquals(100, result.getYears());
        assertEquals(2, result.getMonths());
    }

    @Test
    public void testWithMonths_setsMonthsField() {
        Period result = standardPeriod.withMonths(100);
        assertEquals(100, result.getMonths());
    }

    @Test
    public void testWithWeeks_setsWeeksField() {
        Period result = standardPeriod.withWeeks(100);
        assertEquals(100, result.getWeeks());
    }

    @Test
    public void testWithDays_setsDaysField() {
        Period result = standardPeriod.withDays(100);
        assertEquals(100, result.getDays());
    }

    @Test
    public void testWithHours_setsHoursField() {
        Period result = standardPeriod.withHours(100);
        assertEquals(100, result.getHours());
    }

    @Test
    public void testWithMinutes_setsMinutesField() {
        Period result = standardPeriod.withMinutes(100);
        assertEquals(100, result.getMinutes());
    }

    @Test
    public void testWithSeconds_setsSecondsField() {
        Period result = standardPeriod.withSeconds(100);
        assertEquals(100, result.getSeconds());
    }

    @Test
    public void testWithMillis_setsMillisField() {
        Period result = standardPeriod.withMillis(100);
        assertEquals(100, result.getMillis());
    }

    //----------------------------------------------------------------
    // plus(ReadablePeriod)
    //----------------------------------------------------------------
    @Test
    public void testPlus_nullPeriod_returnsThis() {
        Period result = standardPeriod.plus(null);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlus_validPeriod_addsAllFields() {
        Period p1 = Period.years(1);
        Period p2 = Period.years(2);
        Period result = p1.plus(p2);
        assertEquals(3, result.getYears());
    }

    //----------------------------------------------------------------
    // plusYears/plusMonths/plusWeeks/plusDays/plusHours/plusMinutes/plusSeconds/plusMillis
    //----------------------------------------------------------------
    @Test
    public void testPlusYears_nonZero_addsYears() {
        Period result = standardPeriod.plusYears(5);
        assertEquals(6, result.getYears());
    }

    @Test
    public void testPlusYears_zero_returnsThis() {
        Period result = standardPeriod.plusYears(0);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlusMonths_nonZero_addsMonths() {
        Period result = standardPeriod.plusMonths(5);
        assertEquals(7, result.getMonths());
    }

    @Test
    public void testPlusMonths_zero_returnsThis() {
        Period result = standardPeriod.plusMonths(0);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlusWeeks_nonZero_addsWeeks() {
        Period result = standardPeriod.plusWeeks(5);
        assertEquals(8, result.getWeeks());
    }

    @Test
    public void testPlusWeeks_zero_returnsThis() {
        Period result = standardPeriod.plusWeeks(0);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlusDays_nonZero_addsDays() {
        Period result = standardPeriod.plusDays(5);
        assertEquals(9, result.getDays());
    }

    @Test
    public void testPlusDays_zero_returnsThis() {
        Period result = standardPeriod.plusDays(0);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlusHours_nonZero_addsHours() {
        Period result = standardPeriod.plusHours(5);
        assertEquals(10, result.getHours());
    }

    @Test
    public void testPlusHours_zero_returnsThis() {
        Period result = standardPeriod.plusHours(0);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlusMinutes_nonZero_addsMinutes() {
        Period result = standardPeriod.plusMinutes(5);
        assertEquals(11, result.getMinutes());
    }

    @Test
    public void testPlusMinutes_zero_returnsThis() {
        Period result = standardPeriod.plusMinutes(0);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlusSeconds_nonZero_addsSeconds() {
        Period result = standardPeriod.plusSeconds(5);
        assertEquals(12, result.getSeconds());
    }

    @Test
    public void testPlusSeconds_zero_returnsThis() {
        Period result = standardPeriod.plusSeconds(0);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testPlusMillis_nonZero_addsMillis() {
        Period result = standardPeriod.plusMillis(5);
        assertEquals(13, result.getMillis());
    }

    @Test
    public void testPlusMillis_zero_returnsThis() {
        Period result = standardPeriod.plusMillis(0);
        assertSame(standardPeriod, result);
    }

    //----------------------------------------------------------------
    // minus(ReadablePeriod)
    //----------------------------------------------------------------
    @Test
    public void testMinus_nullPeriod_returnsThis() {
        Period result = standardPeriod.minus(null);
        assertSame(standardPeriod, result);
    }

    @Test
    public void testMinus_validPeriod_subtractsAllFields() {
        Period p1 = Period.years(5);
        Period p2 = Period.years(2);
        Period result = p1.minus(p2);
        assertEquals(3, result.getYears());
    }

    //----------------------------------------------------------------
    // minusYears/minusMonths/minusWeeks/minusDays/minusHours/minusMinutes/minusSeconds/minusMillis
    //----------------------------------------------------------------
    @Test
    public void testMinusYears_subtractsYears() {
        Period result = standardPeriod.minusYears(1);
        assertEquals(0, result.getYears());
    }

    @Test
    public void testMinusMonths_subtractsMonths() {
        Period result = standardPeriod.minusMonths(2);
        assertEquals(0, result.getMonths());
    }

    @Test
    public void testMinusWeeks_subtractsWeeks() {
        Period result = standardPeriod.minusWeeks(3);
        assertEquals(0, result.getWeeks());
    }

    @Test
    public void testMinusDays_subtractsDays() {
        Period result = standardPeriod.minusDays(4);
        assertEquals(0, result.getDays());
    }

    @Test
    public void testMinusHours_subtractsHours() {
        Period result = standardPeriod.minusHours(5);
        assertEquals(0, result.getHours());
    }

    @Test
    public void testMinusMinutes_subtractsMinutes() {
        Period result = standardPeriod.minusMinutes(6);
        assertEquals(0, result.getMinutes());
    }

    @Test
    public void testMinusSeconds_subtractsSeconds() {
        Period result = standardPeriod.minusSeconds(7);
        assertEquals(0, result.getSeconds());
    }

    @Test
    public void testMinusMillis_subtractsMillis() {
        Period result = standardPeriod.minusMillis(8);
        assertEquals(0, result.getMillis());
    }

    //----------------------------------------------------------------
    // multipliedBy
    //----------------------------------------------------------------
    @Test
    public void testMultipliedBy_scalarTwo_multipliesAllFields() {
        Period p = Period.years(2);
        Period result = p.multipliedBy(2);
        assertEquals(4, result.getYears());
    }

    @Test
    public void testMultipliedBy_scalarOne_returnsThis() {
        Period p = Period.years(2);
        Period result = p.multipliedBy(1);
        assertSame(p, result);
    }

    @Test
    public void testMultipliedBy_zeroInstance_returnsThis() {
        Period result = Period.ZERO.multipliedBy(5);
        assertSame(Period.ZERO, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultipliedBy_overflow_throwsException() {
        Period p = Period.years(Integer.MAX_VALUE);
        p.multipliedBy(2);
    }

    //----------------------------------------------------------------
    // negated
    //----------------------------------------------------------------
    @Test
    public void testNegated_positiveValues_returnsNegatedValues() {
        Period p = Period.years(5);
        Period result = p.negated();
        assertEquals(-5, result.getYears());
    }

    //----------------------------------------------------------------
    // toStandardWeeks
    //----------------------------------------------------------------
    @Test
    public void testToStandardWeeks_validPeriod_returnsWeeks() {
        Period p = new Period(0, 0, 1, 7, 0, 0, 0, 0);
        Weeks weeks = p.toStandardWeeks();
        assertEquals(2, weeks.getWeeks());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardWeeks_hasYears_throwsException() {
        Period p = Period.years(1);
        p.toStandardWeeks();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardWeeks_hasMonths_throwsException() {
        Period p = Period.months(1);
        p.toStandardWeeks();
    }

    //----------------------------------------------------------------
    // toStandardDays
    //----------------------------------------------------------------
    @Test
    public void testToStandardDays_validPeriod_returnsDays() {
        Period p = new Period(0, 0, 1, 1, 0, 0, 0, 0);
        Days days = p.toStandardDays();
        assertEquals(8, days.getDays());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardDays_hasYears_throwsException() {
        Period p = Period.years(1);
        p.toStandardDays();
    }

    //----------------------------------------------------------------
    // toStandardHours
    //----------------------------------------------------------------
    @Test
    public void testToStandardHours_validPeriod_returnsHours() {
        Period p = new Period(0, 0, 0, 1, 1, 0, 0, 0);
        Hours hours = p.toStandardHours();
        assertEquals(25, hours.getHours());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardHours_hasMonths_throwsException() {
        Period p = Period.months(1);
        p.toStandardHours();
    }

    //----------------------------------------------------------------
    // toStandardMinutes
    //----------------------------------------------------------------
    @Test
    public void testToStandardMinutes_validPeriod_returnsMinutes() {
        Period p = new Period(0, 0, 0, 0, 1, 1, 0, 0);
        Minutes minutes = p.toStandardMinutes();
        assertEquals(61, minutes.getMinutes());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardMinutes_hasYears_throwsException() {
        Period p = Period.years(1);
        p.toStandardMinutes();
    }

    //----------------------------------------------------------------
    // toStandardSeconds
    //----------------------------------------------------------------
    @Test
    public void testToStandardSeconds_validPeriod_returnsSeconds() {
        Period p = new Period(0, 0, 0, 0, 0, 1, 1, 0);
        Seconds seconds = p.toStandardSeconds();
        assertEquals(61, seconds.getSeconds());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardSeconds_hasMonths_throwsException() {
        Period p = Period.months(1);
        p.toStandardSeconds();
    }

    //----------------------------------------------------------------
    // toStandardDuration
    //----------------------------------------------------------------
    @Test
    public void testToStandardDuration_validPeriod_returnsDuration() {
        Period p = new Period(0, 0, 0, 1, 0, 0, 0, 0);
        Duration duration = p.toStandardDuration();
        assertEquals(24 * 60 * 60 * 1000L, duration.getMillis());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardDuration_hasYears_throwsException() {
        Period p = Period.years(1);
        p.toStandardDuration();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardDuration_hasMonths_throwsException() {
        Period p = Period.months(1);
        p.toStandardDuration();
    }

    //----------------------------------------------------------------
    // normalizedStandard()
    //----------------------------------------------------------------
    @Test
    public void testNormalizedStandard_noArgs_normalizesPeriod() {
        Period p = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard();
        assertEquals(2, result.getYears());
        assertEquals(3, result.getMonths());
    }

    @Test
    public void testNormalizedStandard_onlyTimeFields_normalizesCorrectly() {
        Period p = new Period(0, 0, 0, 0, 25, 0, 0, 0);
        Period result = p.normalizedStandard();
        assertEquals(1, result.getDays());
        assertEquals(1, result.getHours());
    }

    //----------------------------------------------------------------
    // normalizedStandard(PeriodType)
    //----------------------------------------------------------------
    @Test
    public void testNormalizedStandardWithType_validType_normalizesPeriod() {
        Period p = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        Period result = p.normalizedStandard(PeriodType.yearMonthDayTime());
        assertEquals(2, result.getYears());
        assertEquals(3, result.getMonths());
    }

    @Test
    public void testNormalizedStandardWithType_nullType_usesStandard() {
        Period p = Period.years(1);
        Period result = p.normalizedStandard(null);
        assertEquals(PeriodType.standard(), result.getPeriodType());
    }

    @Test
    public void testNormalizedStandardWithType_zeroYearsAndMonths_noChange() {
        Period p = new Period(0, 0, 0, 1, 0, 0, 0, 0);
        Period result = p.normalizedStandard(PeriodType.standard());
        assertEquals(0, result.getYears());
        assertEquals(0, result.getMonths());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizedStandardWithType_unsupportedYears_throwsException() {
        Period p = Period.years(1);
        p.normalizedStandard(PeriodType.dayTime());
    }
}
