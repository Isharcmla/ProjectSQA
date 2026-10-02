import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.LocalDateTime;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.Interval;
import org.joda.time.DateMidnight;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class LocalDateTest {

    private LocalDate testDate;

    @Before
    public void setUp() {
        testDate = new LocalDate(2012, 6, 30);
    }

    //-----------------------------------------------------------------------
    // Static factory methods
    //-----------------------------------------------------------------------

    @Test
    public void testNow_returnsCurrentDate() {
        LocalDate date = LocalDate.now();
        assertNotNull(date);
    }

    @Test
    public void testNowWithZone_validZone_returnsDate() {
        LocalDate date = LocalDate.now(DateTimeZone.UTC);
        assertNotNull(date);
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithZone_nullZone_throwsException() {
        LocalDate.now((DateTimeZone) null);
    }

    @Test
    public void testNowWithChronology_validChronology_returnsDate() {
        LocalDate date = LocalDate.now(ISOChronology.getInstanceUTC());
        assertNotNull(date);
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithChronology_nullChronology_throwsException() {
        LocalDate.now((Chronology) null);
    }

    @Test
    public void testParse_validString_returnsLocalDate() {
        LocalDate date = LocalDate.parse("2012-06-30");
        assertEquals(2012, date.getYear());
        assertEquals(6, date.getMonthOfYear());
        assertEquals(30, date.getDayOfMonth());
    }

    @Test
    public void testParseWithFormatter_validStringAndFormatter_returnsLocalDate() {
        DateTimeFormatter formatter = ISODateTimeFormat.localDateParser();
        LocalDate date = LocalDate.parse("2012-06-30", formatter);
        assertEquals(2012, date.getYear());
    }

    @Test
    public void testFromCalendarFields_validCalendar_returnsLocalDate() {
        Calendar cal = new GregorianCalendar(2012, Calendar.JUNE, 30);
        LocalDate date = LocalDate.fromCalendarFields(cal);
        assertEquals(2012, date.getYear());
        assertEquals(6, date.getMonthOfYear());
        assertEquals(30, date.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFields_nullCalendar_throwsException() {
        LocalDate.fromCalendarFields(null);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFromDateFields_validDate_returnsLocalDate() {
        Date d = new Date(2012 - 1900, 5, 30);
        LocalDate date = LocalDate.fromDateFields(d);
        assertEquals(2012, date.getYear());
        assertEquals(6, date.getMonthOfYear());
        assertEquals(30, date.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFields_nullDate_throwsException() {
        LocalDate.fromDateFields(null);
    }

    //-----------------------------------------------------------------------
    // Constructors
    //-----------------------------------------------------------------------

    @Test
    public void testConstructor_noArgs_createsCurrentDate() {
        LocalDate date = new LocalDate();
        assertNotNull(date);
    }

    @Test
    public void testConstructor_withZone_createsDate() {
        LocalDate date = new LocalDate(DateTimeZone.UTC);
        assertNotNull(date);
    }

    @Test
    public void testConstructor_withNullZone_createsDate() {
        LocalDate date = new LocalDate((DateTimeZone) null);
        assertNotNull(date);
    }

    @Test
    public void testConstructor_withChronology_createsDate() {
        LocalDate date = new LocalDate(ISOChronology.getInstanceUTC());
        assertNotNull(date);
    }

    @Test
    public void testConstructor_withNullChronology_createsDate() {
        LocalDate date = new LocalDate((Chronology) null);
        assertNotNull(date);
    }

    @Test
    public void testConstructor_withInstant_createsDate() {
        LocalDate date = new LocalDate(0L);
        assertEquals(1970, date.getYear());
    }

    @Test
    public void testConstructor_withInstantAndZone_createsDate() {
        LocalDate date = new LocalDate(0L, DateTimeZone.UTC);
        assertEquals(1970, date.getYear());
    }

    @Test
    public void testConstructor_withInstantAndChronology_createsDate() {
        LocalDate date = new LocalDate(0L, ISOChronology.getInstanceUTC());
        assertEquals(1970, date.getYear());
    }

    @Test
    public void testConstructor_withObject_createsDate() {
        LocalDate date = new LocalDate("2012-06-30");
        assertEquals(2012, date.getYear());
    }

    @Test
    public void testConstructor_withObjectAndZone_createsDate() {
        LocalDate date = new LocalDate("2012-06-30", DateTimeZone.UTC);
        assertEquals(2012, date.getYear());
    }

    @Test
    public void testConstructor_withObjectAndChronology_createsDate() {
        LocalDate date = new LocalDate("2012-06-30", ISOChronology.getInstanceUTC());
        assertEquals(2012, date.getYear());
    }

    @Test
    public void testConstructor_withYearMonthDay_createsDate() {
        LocalDate date = new LocalDate(2012, 6, 30);
        assertEquals(2012, date.getYear());
        assertEquals(6, date.getMonthOfYear());
        assertEquals(30, date.getDayOfMonth());
    }

    @Test
    public void testConstructor_withYearMonthDayAndChronology_createsDate() {
        LocalDate date = new LocalDate(2012, 6, 30, ISOChronology.getInstanceUTC());
        assertEquals(2012, date.getYear());
    }

    @Test
    public void testConstructor_withYearMonthDayAndNullChronology_createsDate() {
        LocalDate date = new LocalDate(2012, 6, 30, (Chronology) null);
        assertEquals(2012, date.getYear());
    }

    //-----------------------------------------------------------------------
    // size, getValue
    //-----------------------------------------------------------------------

    @Test
    public void testSize_returnsThree() {
        assertEquals(3, testDate.size());
    }

    @Test
    public void testGetValue_yearIndex_returnsYear() {
        assertEquals(2012, testDate.getValue(0));
    }

    @Test
    public void testGetValue_monthIndex_returnsMonth() {
        assertEquals(6, testDate.getValue(1));
    }

    @Test
    public void testGetValue_dayIndex_returnsDay() {
        assertEquals(30, testDate.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throwsException() {
        testDate.getValue(3);
    }

    //-----------------------------------------------------------------------
    // get(DateTimeFieldType), isSupported
    //-----------------------------------------------------------------------

    @Test
    public void testGet_validFieldType_returnsValue() {
        assertEquals(2012, testDate.get(DateTimeFieldType.year()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullFieldType_throwsException() {
        testDate.get((DateTimeFieldType) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_unsupportedFieldType_throwsException() {
        testDate.get(DateTimeFieldType.hourOfDay());
    }

    @Test
    public void testIsSupportedFieldType_supportedField_returnsTrue() {
        assertTrue(testDate.isSupported(DateTimeFieldType.year()));
    }

    @Test
    public void testIsSupportedFieldType_nullField_returnsFalse() {
        assertFalse(testDate.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupportedFieldType_unsupportedField_returnsFalse() {
        assertFalse(testDate.isSupported(DateTimeFieldType.hourOfDay()));
    }

    @Test
    public void testIsSupportedDurationType_supportedType_returnsTrue() {
        assertTrue(testDate.isSupported(DurationFieldType.days()));
    }

    @Test
    public void testIsSupportedDurationType_nullType_returnsFalse() {
        assertFalse(testDate.isSupported((DurationFieldType) null));
    }

    @Test
    public void testIsSupportedDurationType_unsupportedType_returnsFalse() {
        assertFalse(testDate.isSupported(DurationFieldType.hours()));
    }

    //-----------------------------------------------------------------------
    // getChronology, equals, hashCode, compareTo
    //-----------------------------------------------------------------------

    @Test
    public void testGetChronology_returnsChronology() {
        assertNotNull(testDate.getChronology());
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(testDate.equals(testDate));
    }

    @Test
    public void testEquals_equalLocalDate_returnsTrue() {
        LocalDate other = new LocalDate(2012, 6, 30);
        assertTrue(testDate.equals(other));
    }

    @Test
    public void testEquals_differentLocalDate_returnsFalse() {
        LocalDate other = new LocalDate(2013, 6, 30);
        assertFalse(testDate.equals(other));
    }

    @Test
    public void testEquals_nonLocalDateObject_returnsFalse() {
        assertFalse(testDate.equals("not a date"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(testDate.equals(null));
    }

    @Test
    public void testHashCode_sameValues_returnsSameHash() {
        LocalDate other = new LocalDate(2012, 6, 30);
        assertEquals(testDate.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_calledTwice_returnsSameValue() {
        int hash1 = testDate.hashCode();
        int hash2 = testDate.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testCompareTo_sameInstance_returnsZero() {
        assertEquals(0, testDate.compareTo(testDate));
    }

    @Test
    public void testCompareTo_equalLocalDate_returnsZero() {
        LocalDate other = new LocalDate(2012, 6, 30);
        assertEquals(0, testDate.compareTo(other));
    }

    @Test
    public void testCompareTo_earlierLocalDate_returnsPositive() {
        LocalDate other = new LocalDate(2011, 6, 30);
        assertTrue(testDate.compareTo(other) > 0);
    }

    @Test
    public void testCompareTo_laterLocalDate_returnsNegative() {
        LocalDate other = new LocalDate(2013, 6, 30);
        assertTrue(testDate.compareTo(other) < 0);
    }

    //-----------------------------------------------------------------------
    // toDateTimeAtStartOfDay
    //-----------------------------------------------------------------------

    @Test
    public void testToDateTimeAtStartOfDay_noArgs_returnsDateTime() {
        DateTime dt = testDate.toDateTimeAtStartOfDay();
        assertNotNull(dt);
        assertEquals(2012, dt.getYear());
    }

    @Test
    public void testToDateTimeAtStartOfDay_withZone_returnsDateTime() {
        DateTime dt = testDate.toDateTimeAtStartOfDay(DateTimeZone.UTC);
        assertNotNull(dt);
    }

    @Test
    public void testToDateTimeAtStartOfDay_withNullZone_returnsDateTime() {
        DateTime dt = testDate.toDateTimeAtStartOfDay((DateTimeZone) null);
        assertNotNull(dt);
    }

    //-----------------------------------------------------------------------
    // toDateTimeAtMidnight (deprecated)
    //-----------------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testToDateTimeAtMidnight_noArgs_returnsDateTime() {
        DateTime dt = testDate.toDateTimeAtMidnight();
        assertNotNull(dt);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testToDateTimeAtMidnight_withZone_returnsDateTime() {
        DateTime dt = testDate.toDateTimeAtMidnight(DateTimeZone.UTC);
        assertNotNull(dt);
    }

    //-----------------------------------------------------------------------
    // toDateTimeAtCurrentTime
    //-----------------------------------------------------------------------

    @Test
    public void testToDateTimeAtCurrentTime_noArgs_returnsDateTime() {
        DateTime dt = testDate.toDateTimeAtCurrentTime();
        assertNotNull(dt);
    }

    @Test
    public void testToDateTimeAtCurrentTime_withZone_returnsDateTime() {
        DateTime dt = testDate.toDateTimeAtCurrentTime(DateTimeZone.UTC);
        assertNotNull(dt);
    }

    //-----------------------------------------------------------------------
    // toDateMidnight
    //-----------------------------------------------------------------------

    @Test
    public void testToDateMidnight_noArgs_returnsDateMidnight() {
        DateMidnight dm = testDate.toDateMidnight();
        assertNotNull(dm);
    }

    @Test
    public void testToDateMidnight_withZone_returnsDateMidnight() {
        DateMidnight dm = testDate.toDateMidnight(DateTimeZone.UTC);
        assertNotNull(dm);
    }

    //-----------------------------------------------------------------------
    // toLocalDateTime
    //-----------------------------------------------------------------------

    @Test
    public void testToLocalDateTime_validTime_returnsLocalDateTime() {
        LocalTime time = new LocalTime(10, 20, 30);
        LocalDateTime ldt = testDate.toLocalDateTime(time);
        assertNotNull(ldt);
        assertEquals(2012, ldt.getYear());
        assertEquals(10, ldt.getHourOfDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTime_nullTime_throwsException() {
        testDate.toLocalDateTime(null);
    }

    //-----------------------------------------------------------------------
    // toDateTime(LocalTime)
    //-----------------------------------------------------------------------

    @Test
    public void testToDateTime_withTime_returnsDateTime() {
        LocalTime time = new LocalTime(10, 20, 30);
        DateTime dt = testDate.toDateTime(time);
        assertNotNull(dt);
    }

    @Test
    public void testToDateTime_withNullTime_returnsDateTime() {
        DateTime dt = testDate.toDateTime((LocalTime) null);
        assertNotNull(dt);
    }

    @Test
    public void testToDateTime_withTimeAndZone_returnsDateTime() {
        LocalTime time = new LocalTime(10, 20, 30);
        DateTime dt = testDate.toDateTime(time, DateTimeZone.UTC);
        assertNotNull(dt);
    }

    //-----------------------------------------------------------------------
    // toInterval
    //-----------------------------------------------------------------------

    @Test
    public void testToInterval_noArgs_returnsInterval() {
        Interval interval = testDate.toInterval();
        assertNotNull(interval);
    }

    @Test
    public void testToInterval_withZone_returnsInterval() {
        Interval interval = testDate.toInterval(DateTimeZone.UTC);
        assertNotNull(interval);
    }

    //-----------------------------------------------------------------------
    // toDate
    //-----------------------------------------------------------------------

    @Test
    public void testToDate_returnsJavaUtilDate() {
        Date date = testDate.toDate();
        assertNotNull(date);
    }

    //-----------------------------------------------------------------------
    // withFields, withField, withFieldAdded
    //-----------------------------------------------------------------------

    @Test
    public void testWithFields_validPartial_returnsNewLocalDate() {
        LocalDate partial = new LocalDate(2000, 1, 1);
        LocalDate result = testDate.withFields(partial);
        assertNotNull(result);
    }

    @Test
    public void testWithFields_nullPartial_returnsSameInstance() {
        LocalDate result = testDate.withFields(null);
        assertSame(testDate, result);
    }

    @Test
    public void testWithField_validField_returnsNewLocalDate() {
        LocalDate result = testDate.withField(DateTimeFieldType.year(), 2020);
        assertEquals(2020, result.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_nullField_throwsException() {
        testDate.withField(null, 2020);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupportedField_throwsException() {
        testDate.withField(DateTimeFieldType.hourOfDay(), 5);
    }

    @Test
    public void testWithFieldAdded_validFieldNonZero_returnsNewLocalDate() {
        LocalDate result = testDate.withFieldAdded(DurationFieldType.years(), 1);
        assertEquals(2013, result.getYear());
    }

    @Test
    public void testWithFieldAdded_zeroAmount_returnsSameInstance() {
        LocalDate result = testDate.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(testDate, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_nullField_throwsException() {
        testDate.withFieldAdded(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupportedField_throwsException() {
        testDate.withFieldAdded(DurationFieldType.hours(), 1);
    }

    //-----------------------------------------------------------------------
    // withPeriodAdded, plus, minus
    //-----------------------------------------------------------------------

    @Test
    public void testWithPeriodAdded_validPeriod_returnsNewLocalDate() {
        Period period = Period.years(1).withMonths(2);
        LocalDate result = testDate.withPeriodAdded(period, 1);
        assertNotNull(result);
    }

    @Test
    public void testWithPeriodAdded_nullPeriod_returnsSameInstance() {
        LocalDate result = testDate.withPeriodAdded(null, 1);
        assertSame(testDate, result);
    }

    @Test
    public void testWithPeriodAdded_zeroScalar_returnsSameInstance() {
        Period period = Period.years(1);
        LocalDate result = testDate.withPeriodAdded(period, 0);
        assertSame(testDate, result);
    }

    @Test
    public void testWithPeriodAdded_periodWithUnsupportedField_ignoresUnsupported() {
        Period period = Period.hours(5);
        LocalDate result = testDate.withPeriodAdded(period, 1);
        assertEquals(testDate, result);
    }

    @Test
    public void testPlus_validPeriod_returnsNewLocalDate() {
        Period period = Period.years(1);
        LocalDate result = testDate.plus(period);
        assertEquals(2013, result.getYear());
    }

    @Test
    public void testMinus_validPeriod_returnsNewLocalDate() {
        Period period = Period.years(1);
        LocalDate result = testDate.minus(period);
        assertEquals(2011, result.getYear());
    }

    //-----------------------------------------------------------------------
    // plusYears, plusMonths, plusWeeks, plusDays
    //-----------------------------------------------------------------------

    @Test
    public void testPlusYears_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.plusYears(5);
        assertEquals(2017, result.getYear());
    }

    @Test
    public void testPlusYears_zero_returnsSameInstance() {
        LocalDate result = testDate.plusYears(0);
        assertSame(testDate, result);
    }

    @Test
    public void testPlusYears_negative_returnsEarlierDate() {
        LocalDate result = testDate.plusYears(-1);
        assertEquals(2011, result.getYear());
    }

    @Test
    public void testPlusMonths_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.plusMonths(3);
        assertEquals(9, result.getMonthOfYear());
    }

    @Test
    public void testPlusMonths_zero_returnsSameInstance() {
        LocalDate result = testDate.plusMonths(0);
        assertSame(testDate, result);
    }

    @Test
    public void testPlusWeeks_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.plusWeeks(2);
        assertNotNull(result);
    }

    @Test
    public void testPlusWeeks_zero_returnsSameInstance() {
        LocalDate result = testDate.plusWeeks(0);
        assertSame(testDate, result);
    }

    @Test
    public void testPlusDays_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.plusDays(1);
        assertEquals(1, result.getDayOfMonth());
        assertEquals(7, result.getMonthOfYear());
    }

    @Test
    public void testPlusDays_zero_returnsSameInstance() {
        LocalDate result = testDate.plusDays(0);
        assertSame(testDate, result);
    }

    //-----------------------------------------------------------------------
    // minusYears, minusMonths, minusWeeks, minusDays
    //-----------------------------------------------------------------------

    @Test
    public void testMinusYears_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.minusYears(5);
        assertEquals(2007, result.getYear());
    }

    @Test
    public void testMinusYears_zero_returnsSameInstance() {
        LocalDate result = testDate.minusYears(0);
        assertSame(testDate, result);
    }

    @Test
    public void testMinusMonths_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.minusMonths(3);
        assertEquals(3, result.getMonthOfYear());
    }

    @Test
    public void testMinusMonths_zero_returnsSameInstance() {
        LocalDate result = testDate.minusMonths(0);
        assertSame(testDate, result);
    }

    @Test
    public void testMinusWeeks_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.minusWeeks(2);
        assertNotNull(result);
    }

    @Test
    public void testMinusWeeks_zero_returnsSameInstance() {
        LocalDate result = testDate.minusWeeks(0);
        assertSame(testDate, result);
    }

    @Test
    public void testMinusDays_nonZero_returnsNewLocalDate() {
        LocalDate result = testDate.minusDays(30);
        assertEquals(5, result.getMonthOfYear());
    }

    @Test
    public void testMinusDays_zero_returnsSameInstance() {
        LocalDate result = testDate.minusDays(0);
        assertSame(testDate, result);
    }

    //-----------------------------------------------------------------------
    // property
    //-----------------------------------------------------------------------

    @Test
    public void testProperty_validFieldType_returnsProperty() {
        LocalDate.Property prop = testDate.property(DateTimeFieldType.year());
        assertNotNull(prop);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_nullFieldType_throwsException() {
        testDate.property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupportedFieldType_throwsException() {
        testDate.property(DateTimeFieldType.hourOfDay());
    }

    //-----------------------------------------------------------------------
    // getters: getEra, getCenturyOfEra, getYearOfEra, etc.
    //-----------------------------------------------------------------------

    @Test
    public void testGetEra_returnsEraValue() {
        assertTrue(testDate.getEra() >= 0);
    }

    @Test
    public void testGetCenturyOfEra_returnsCentury() {
        assertEquals(20, testDate.getCenturyOfEra());
    }

    @Test
    public void testGetYearOfEra_returnsYearOfEra() {
        assertEquals(2012, testDate.getYearOfEra());
    }

    @Test
    public void testGetYearOfCentury_returnsYearOfCentury() {
        assertEquals(12, testDate.getYearOfCentury());
    }

    @Test
    public void testGetYear_returnsYear() {
        assertEquals(2012, testDate.getYear());
    }

    @Test
    public void testGetWeekyear_returnsWeekyear() {
        assertTrue(testDate.getWeekyear() > 0);
    }

    @Test
    public void testGetMonthOfYear_returnsMonth() {
        assertEquals(6, testDate.getMonthOfYear());
    }

    @Test
    public void testGetWeekOfWeekyear_returnsWeek() {
        assertTrue(testDate.getWeekOfWeekyear() > 0);
    }

    @Test
    public void testGetDayOfYear_returnsDayOfYear() {
        assertTrue(testDate.getDayOfYear() > 0);
    }

    @Test
    public void testGetDayOfMonth_returnsDay() {
        assertEquals(30, testDate.getDayOfMonth());
    }

    @Test
    public void testGetDayOfWeek_returnsDayOfWeek() {
        assertTrue(testDate.getDayOfWeek() >= 1 && testDate.getDayOfWeek() <= 7);
    }

    //-----------------------------------------------------------------------
    // withers: withEra, withCenturyOfEra, withYearOfEra, etc.
    //-----------------------------------------------------------------------

    @Test
    public void testWithEra_sameEra_returnsSameOrNewLocalDate() {
        LocalDate result = testDate.withEra(1);
        assertNotNull(result);
    }

    @Test
    public void testWithCenturyOfEra_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withCenturyOfEra(21);
        assertEquals(2112, result.getYear());
    }

    @Test
    public void testWithYearOfEra_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withYearOfEra(2020);
        assertEquals(2020, result.getYear());
    }

    @Test
    public void testWithYearOfCentury_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withYearOfCentury(50);
        assertEquals(2050, result.getYear());
    }

    @Test
    public void testWithYear_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withYear(2020);
        assertEquals(2020, result.getYear());
    }

    @Test
    public void testWithWeekyear_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withWeekyear(2020);
        assertNotNull(result);
    }

    @Test
    public void testWithMonthOfYear_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withMonthOfYear(1);
        assertEquals(1, result.getMonthOfYear());
    }

    @Test
    public void testWithWeekOfWeekyear_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withWeekOfWeekyear(10);
        assertNotNull(result);
    }

    @Test
    public void testWithDayOfYear_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withDayOfYear(100);
        assertEquals(100, result.getDayOfYear());
    }

    @Test
    public void testWithDayOfMonth_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withDayOfMonth(15);
        assertEquals(15, result.getDayOfMonth());
    }

    @Test
    public void testWithDayOfWeek_validValue_returnsNewLocalDate() {
        LocalDate result = testDate.withDayOfWeek(1);
        assertEquals(1, result.getDayOfWeek());
    }

    //-----------------------------------------------------------------------
    // property accessors: era(), centuryOfEra(), etc.
    //-----------------------------------------------------------------------

    @Test
    public void testEraProperty_returnsProperty() {
        LocalDate.Property prop = testDate.era();
        assertNotNull(prop);
    }

    @Test
    public void testCenturyOfEraProperty_returnsProperty() {
        LocalDate.Property prop = testDate.centuryOfEra();
        assertNotNull(prop);
    }

    @Test
    public void testYearOfCenturyProperty_returnsProperty() {
        LocalDate.Property prop = testDate.yearOfCentury();
        assertNotNull(prop);
    }

    @Test
    public void testYearOfEraProperty_returnsProperty() {
        LocalDate.Property prop = testDate.yearOfEra();
        assertNotNull(prop);
    }

    @Test
    public void testYearProperty_returnsProperty() {
        LocalDate.Property prop = testDate.year();
        assertNotNull(prop);
    }

    @Test
    public void testWeekyearProperty_returnsProperty() {
        LocalDate.Property prop = testDate.weekyear();
        assertNotNull(prop);
    }

    @Test
    public void testMonthOfYearProperty_returnsProperty() {
        LocalDate.Property prop = testDate.monthOfYear();
        assertNotNull(prop);
    }

    @Test
    public void testWeekOfWeekyearProperty_returnsProperty() {
        LocalDate.Property prop = testDate.weekOfWeekyear();
        assertNotNull(prop);
    }

    @Test
    public void testDayOfYearProperty_returnsProperty() {
        LocalDate.Property prop = testDate.dayOfYear();
        assertNotNull(prop);
    }

    @Test
    public void testDayOfMonthProperty_returnsProperty() {
        LocalDate.Property prop = testDate.dayOfMonth();
        assertNotNull(prop);
    }

    @Test
    public void testDayOfWeekProperty_returnsProperty() {
        LocalDate.Property prop = testDate.dayOfWeek();
        assertNotNull(prop);
    }

    //-----------------------------------------------------------------------
    // toString methods
    //-----------------------------------------------------------------------

    @Test
    public void testToString_noArgs_returnsISOFormat() {
        String result = testDate.toString();
        assertEquals("2012-06-30", result);
    }

    @Test
    public void testToString_withPattern_returnsFormattedString() {
        String result = testDate.toString("yyyy/MM/dd");
        assertEquals("2012/06/30", result);
    }

    @Test
    public void testToString_withNullPattern_returnsDefaultToString() {
        String result = testDate.toString((String) null);
        assertEquals("2012-06-30", result);
    }

    @Test
    public void testToString_withPatternAndLocale_returnsFormattedString() {
        String result = testDate.toString("yyyy/MM/dd", Locale.US);
        assertEquals("2012/06/30", result);
    }

    @Test
    public void testToString_withNullPatternAndLocale_returnsDefaultToString() {
        String result = testDate.toString(null, Locale.US);
        assertEquals("2012-06-30", result);
    }

    @Test
    public void testToString_withPatternAndNullLocale_returnsFormattedString() {
        String result = testDate.toString("yyyy/MM/dd", null);
        assertEquals("2012/06/30", result);
    }

    //-----------------------------------------------------------------------
    // Property class methods
    //-----------------------------------------------------------------------

    @Test
    public void testPropertyGetField_returnsField() {
        LocalDate.Property prop = testDate.year();
        assertNotNull(prop.getField());
    }

    @Test
    public void testPropertyGetLocalDate_returnsLinkedLocalDate() {
        LocalDate.Property prop = testDate.year();
        assertEquals(testDate, prop.getLocalDate());
    }

    @Test
    public void testPropertyAddToCopy_validValue_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.year();
        LocalDate result = prop.addToCopy(1);
        assertEquals(2013, result.getYear());
    }

    @Test
    public void testPropertyAddWrapFieldToCopy_validValue_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.monthOfYear();
        LocalDate result = prop.addWrapFieldToCopy(1);
        assertNotNull(result);
    }

    @Test
    public void testPropertySetCopyInt_validValue_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.year();
        LocalDate result = prop.setCopy(2020);
        assertEquals(2020, result.getYear());
    }

    @Test
    public void testPropertySetCopyText_validText_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.monthOfYear();
        LocalDate result = prop.setCopy("December");
        assertEquals(12, result.getMonthOfYear());
    }

    @Test
    public void testPropertySetCopyTextAndLocale_validText_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.monthOfYear();
        LocalDate result = prop.setCopy("December", Locale.US);
        assertEquals(12, result.getMonthOfYear());
    }

    @Test
    public void testPropertyWithMaximumValue_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.dayOfMonth();
        LocalDate result = prop.withMaximumValue();
        assertEquals(30, result.getDayOfMonth());
    }

    @Test
    public void testPropertyWithMinimumValue_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.dayOfMonth();
        LocalDate result = prop.withMinimumValue();
        assertEquals(1, result.getDayOfMonth());
    }

    @Test
    public void testPropertyRoundFloorCopy_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.year();
        LocalDate result = prop.roundFloorCopy();
        assertNotNull(result);
    }

    @Test
    public void testPropertyRoundCeilingCopy_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.year();
        LocalDate result = prop.roundCeilingCopy();
        assertNotNull(result);
    }

    @Test
    public void testPropertyRoundHalfFloorCopy_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.year();
        LocalDate result = prop.roundHalfFloorCopy();
        assertNotNull(result);
    }

    @Test
    public void testPropertyRoundHalfCeilingCopy_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.year();
        LocalDate result = prop.roundHalfCeilingCopy();
        assertNotNull(result);
    }

    @Test
    public void testPropertyRoundHalfEvenCopy_returnsNewLocalDate() {
        LocalDate.Property prop = testDate.year();
        LocalDate result = prop.roundHalfEvenCopy();
        assertNotNull(result);
    }

    //-----------------------------------------------------------------------
    // Additional edge cases
    //-----------------------------------------------------------------------

    @Test
    public void testLeapYearDate_handlesFebruary29() {
        LocalDate leapDate = new LocalDate(2012, 2, 29);
        assertEquals(29, leapDate.getDayOfMonth());
    }

    @Test
    public void testPlusMonths_dayOfMonthAdjustment_handlesInvalidDay() {
        LocalDate date = new LocalDate(2012, 1, 31);
        LocalDate result = date.plusMonths(1);
        assertEquals(29, result.getDayOfMonth());
    }

    @Test
    public void testMinYearDate_createsSuccessfully() {
        LocalDate date = new LocalDate(1, 1, 1);
        assertEquals(1, date.getYear());
    }

    @Test
    public void testNegativeYearDate_createsSuccessfully() {
        LocalDate date = new LocalDate(-1, 1, 1);
        assertEquals(-1, date.getYear());
    }

    @Test
    public void testWithLocalMillis_sameValue_returnsThis() throws Exception {
        // indirectly tested via withField with same value
        LocalDate result = testDate.withYear(2012);
        assertEquals(testDate, result);
    }

    @Test
    public void testCompareTo_differentChronology_usesSuperCompareTo() {
        LocalDate isoDate = new LocalDate(2012, 6, 30, ISOChronology.getInstanceUTC());
        LocalDate other = new LocalDate(2012, 6, 30);
        int result = isoDate.compareTo(other);
        assertEquals(0, result);
    }

    @Test
    public void testToDate_checkDateFields() {
        Date date = testDate.toDate();
        assertNotNull(date);
        LocalDate checkDate = LocalDate.fromDateFields(date);
        assertEquals(testDate.getYear(), checkDate.getYear());
        assertEquals(testDate.getMonthOfYear(), checkDate.getMonthOfYear());
        assertEquals(testDate.getDayOfMonth(), checkDate.getDayOfMonth());
    }
}
