package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocalDateTest {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone UTC = DateTimeZone.UTC;

    private DateTimeZone originalZone;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalZone = DateTimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
        DateTimeUtils.setCurrentMillisFixed(1577836800000L); // 2020-01-01T00:00:00Z
    }

    @After
    public void tearDown() {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalZone);
        Locale.setDefault(originalLocale);
    }

    // -----------------------------------------------------------------------
    // Static Factories & Constructors
    // -----------------------------------------------------------------------

    @Test
    public void testNow_defaultZone() {
        LocalDate test = LocalDate.now();
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(1, test.getMonthOfYear());
        Assert.assertEquals(1, test.getDayOfMonth());
    }

    @Test
    public void testNow_specificZone() {
        LocalDate test = LocalDate.now(PARIS);
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(1, test.getMonthOfYear());
        Assert.assertEquals(1, test.getDayOfMonth());
    }

    @Test(expected = NullPointerException.class)
    public void testNow_nullZone_throwsException() {
        LocalDate.now((DateTimeZone) null);
    }

    @Test
    public void testNow_specificChronology() {
        LocalDate test = LocalDate.now(GregorianChronology.getInstanceUTC());
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(1, test.getMonthOfYear());
        Assert.assertEquals(1, test.getDayOfMonth());
        Assert.assertEquals(GregorianChronology.getInstanceUTC(), test.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void testNow_nullChronology_throwsException() {
        LocalDate.now((Chronology) null);
    }

    @Test
    public void testParse_string() {
        LocalDate test = LocalDate.parse("2020-05-15");
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(5, test.getMonthOfYear());
        Assert.assertEquals(15, test.getDayOfMonth());
    }

    @Test
    public void testParse_stringAndFormatter() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        LocalDate test = LocalDate.parse("15/05/2020", formatter);
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(5, test.getMonthOfYear());
        Assert.assertEquals(15, test.getDayOfMonth());
    }

    @Test
    public void testFromCalendarFields_validCalendar() {
        Calendar cal = new GregorianCalendar(2021, Calendar.MARCH, 25);
        LocalDate test = LocalDate.fromCalendarFields(cal);
        Assert.assertEquals(2021, test.getYear());
        Assert.assertEquals(3, test.getMonthOfYear());
        Assert.assertEquals(25, test.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFields_nullCalendar_throwsException() {
        LocalDate.fromCalendarFields(null);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testFromDateFields_validDate() {
        Date date = new Date(121, Calendar.MARCH, 25); // 2021-03-25
        LocalDate test = LocalDate.fromDateFields(date);
        Assert.assertEquals(2021, test.getYear());
        Assert.assertEquals(3, test.getMonthOfYear());
        Assert.assertEquals(25, test.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFields_nullDate_throwsException() {
        LocalDate.fromDateFields(null);
    }

    @Test
    public void testConstructor_default() {
        LocalDate test = new LocalDate();
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(1, test.getMonthOfYear());
        Assert.assertEquals(1, test.getDayOfMonth());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
    }

    @Test
    public void testConstructor_zone() {
        LocalDate testNull = new LocalDate((DateTimeZone) null);
        Assert.assertEquals(2020, testNull.getYear());

        LocalDate testParis = new LocalDate(PARIS);
        Assert.assertEquals(2020, testParis.getYear());
    }

    @Test
    public void testConstructor_chronology() {
        LocalDate testNull = new LocalDate((Chronology) null);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), testNull.getChronology());

        LocalDate testBuddhist = new LocalDate(BuddhistChronology.getInstance(LONDON));
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), testBuddhist.getChronology());
    }

    @Test
    public void testConstructor_millis() {
        LocalDate test = new LocalDate(1577836800000L);
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(1, test.getMonthOfYear());
        Assert.assertEquals(1, test.getDayOfMonth());
    }

    @Test
    public void testConstructor_millisZone() {
        LocalDate testNull = new LocalDate(1577836800000L, (DateTimeZone) null);
        Assert.assertEquals(2020, testNull.getYear());

        LocalDate test = new LocalDate(1577836800000L, PARIS);
        Assert.assertEquals(2020, test.getYear());
    }

    @Test
    public void testConstructor_millisChronology() {
        LocalDate testNull = new LocalDate(1577836800000L, (Chronology) null);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), testNull.getChronology());

        LocalDate test = new LocalDate(1577836800000L, CopticChronology.getInstanceUTC());
        Assert.assertEquals(CopticChronology.getInstanceUTC(), test.getChronology());
    }

    @Test
    public void testConstructor_object() {
        LocalDate test = new LocalDate("2020-02-10");
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(2, test.getMonthOfYear());
        Assert.assertEquals(10, test.getDayOfMonth());
    }

    @Test
    public void testConstructor_objectZone() {
        LocalDate testNullZone = new LocalDate("2020-02-10", (DateTimeZone) null);
        Assert.assertEquals(2020, testNullZone.getYear());

        LocalDate testZone = new LocalDate("2020-02-10", PARIS);
        Assert.assertEquals(2020, testZone.getYear());
    }

    @Test
    public void testConstructor_objectChronology() {
        LocalDate testNullChrono = new LocalDate("2020-02-10", (Chronology) null);
        Assert.assertEquals(2020, testNullChrono.getYear());

        LocalDate test = new LocalDate("2020-02-10", GregorianChronology.getInstanceUTC());
        Assert.assertEquals(GregorianChronology.getInstanceUTC(), test.getChronology());
    }

    @Test
    public void testConstructor_ints() {
        LocalDate test = new LocalDate(2022, 11, 20);
        Assert.assertEquals(2022, test.getYear());
        Assert.assertEquals(11, test.getMonthOfYear());
        Assert.assertEquals(20, test.getDayOfMonth());
        Assert.assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
    }

    @Test
    public void testConstructor_intsChronology() {
        LocalDate testNullChrono = new LocalDate(2022, 11, 20, null);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), testNullChrono.getChronology());

        LocalDate test = new LocalDate(2022, 11, 20, BuddhistChronology.getInstanceUTC());
        Assert.assertEquals(BuddhistChronology.getInstanceUTC(), test.getChronology());
    }

    // -----------------------------------------------------------------------
    // Core Methods & Structure
    // -----------------------------------------------------------------------

    @Test
    public void testSize() {
        LocalDate test = new LocalDate(2020, 1, 1);
        Assert.assertEquals(3, test.size());
    }

    @Test
    public void testGetField_allIndices() {
        LocalDate test = new LocalDate(2020, 1, 1);
        Assert.assertEquals(ISOChronology.getInstanceUTC().year(), test.getField(0, ISOChronology.getInstanceUTC()));
        Assert.assertEquals(ISOChronology.getInstanceUTC().monthOfYear(), test.getField(1, ISOChronology.getInstanceUTC()));
        Assert.assertEquals(ISOChronology.getInstanceUTC().dayOfMonth(), test.getField(2, ISOChronology.getInstanceUTC()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_invalidIndexNegative_throwsException() {
        LocalDate test = new LocalDate(2020, 1, 1);
        test.getField(-1, ISOChronology.getInstanceUTC());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_invalidIndexTooLarge_throwsException() {
        LocalDate test = new LocalDate(2020, 1, 1);
        test.getField(3, ISOChronology.getInstanceUTC());
    }

    @Test
    public void testGetValue_allIndices() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertEquals(2020, test.getValue(0));
        Assert.assertEquals(5, test.getValue(1));
        Assert.assertEquals(12, test.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.getValue(3);
    }

    @Test
    public void testGet_dateTimeFieldType() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertEquals(2020, test.get(DateTimeFieldType.year()));
        Assert.assertEquals(5, test.get(DateTimeFieldType.monthOfYear()));
        Assert.assertEquals(12, test.get(DateTimeFieldType.dayOfMonth()));
        Assert.assertEquals(133, test.get(DateTimeFieldType.dayOfYear()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullFieldType_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_unsupportedFieldType_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.get(DateTimeFieldType.hourOfDay());
    }

    @Test
    public void testIsSupported_dateTimeFieldType() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertFalse(test.isSupported((DateTimeFieldType) null));
        Assert.assertTrue(test.isSupported(DateTimeFieldType.year()));
        Assert.assertTrue(test.isSupported(DateTimeFieldType.dayOfMonth()));
        Assert.assertTrue(test.isSupported(DateTimeFieldType.centuryOfEra()));
        Assert.assertTrue(test.isSupported(DateTimeFieldType.era()));
        Assert.assertFalse(test.isSupported(DateTimeFieldType.hourOfDay()));
        Assert.assertFalse(test.isSupported(DateTimeFieldType.secondOfMinute()));
    }

    @Test
    public void testIsSupported_durationFieldType() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertFalse(test.isSupported((DurationFieldType) null));
        Assert.assertTrue(test.isSupported(DurationFieldType.days()));
        Assert.assertTrue(test.isSupported(DurationFieldType.weeks()));
        Assert.assertTrue(test.isSupported(DurationFieldType.months()));
        Assert.assertTrue(test.isSupported(DurationFieldType.years()));
        Assert.assertTrue(test.isSupported(DurationFieldType.centuries()));
        Assert.assertTrue(test.isSupported(DurationFieldType.eras()));
        Assert.assertFalse(test.isSupported(DurationFieldType.hours()));
        Assert.assertFalse(test.isSupported(DurationFieldType.minutes()));
        Assert.assertFalse(test.isSupported(DurationFieldType.seconds()));
    }

    @Test
    public void testGetLocalMillis() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertTrue(test.getLocalMillis() > 0);
    }

    // -----------------------------------------------------------------------
    // Equals, HashCode, CompareTo
    // -----------------------------------------------------------------------

    @Test
    public void testEqualsAndHashCode() {
        LocalDate test1 = new LocalDate(2020, 5, 12);
        LocalDate test2 = new LocalDate(2020, 5, 12);
        LocalDate test3 = new LocalDate(2020, 5, 13);
        LocalDate test4 = new LocalDate(2020, 5, 12, GregorianChronology.getInstanceUTC());

        Assert.assertTrue(test1.equals(test1));
        Assert.assertTrue(test1.equals(test2));
        Assert.assertFalse(test1.equals(test3));
        Assert.assertFalse(test1.equals(test4));
        Assert.assertFalse(test1.equals("String"));
        Assert.assertFalse(test1.equals(null));

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
        Assert.assertEquals(test1.hashCode(), test1.hashCode());
    }

    @Test
    public void testCompareTo() {
        LocalDate test1 = new LocalDate(2020, 5, 12);
        LocalDate test2 = new LocalDate(2020, 5, 12);
        LocalDate test3 = new LocalDate(2020, 5, 13);
        LocalDate testEarlier = new LocalDate(2019, 5, 12);

        Assert.assertEquals(0, test1.compareTo(test1));
        Assert.assertEquals(0, test1.compareTo(test2));
        Assert.assertTrue(test1.compareTo(test3) < 0);
        Assert.assertTrue(test1.compareTo(testEarlier) > 0);
        Assert.assertTrue(test3.compareTo(test1) > 0);

        YearMonthDay ymd = new YearMonthDay(2020, 5, 12);
        Assert.assertEquals(0, test1.compareTo(ymd));
    }

    // -----------------------------------------------------------------------
    // Conversions
    // -----------------------------------------------------------------------

    @Test
    public void testToDateTimeAtStartOfDay() {
        LocalDate test = new LocalDate(2020, 5, 12);
        DateTime dtDefault = test.toDateTimeAtStartOfDay();
        Assert.assertEquals(2020, dtDefault.getYear());
        Assert.assertEquals(5, dtDefault.getMonthOfYear());
        Assert.assertEquals(12, dtDefault.getDayOfMonth());
        Assert.assertEquals(0, dtDefault.getHourOfDay());

        DateTime dtParis = test.toDateTimeAtStartOfDay(PARIS);
        Assert.assertEquals(PARIS, dtParis.getZone());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight() {
        LocalDate test = new LocalDate(2020, 5, 12);
        DateTime dtDefault = test.toDateTimeAtMidnight();
        Assert.assertEquals(0, dtDefault.getHourOfDay());

        DateTime dtParis = test.toDateTimeAtMidnight(PARIS);
        Assert.assertEquals(PARIS, dtParis.getZone());
    }

    @Test
    public void testToDateTimeAtCurrentTime() {
        LocalDate test = new LocalDate(2020, 5, 12);
        DateTime dtDefault = test.toDateTimeAtCurrentTime();
        Assert.assertEquals(2020, dtDefault.getYear());
        Assert.assertEquals(5, dtDefault.getMonthOfYear());
        Assert.assertEquals(12, dtDefault.getDayOfMonth());

        DateTime dtParis = test.toDateTimeAtCurrentTime(PARIS);
        Assert.assertEquals(PARIS, dtParis.getZone());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight() {
        LocalDate test = new LocalDate(2020, 5, 12);
        DateMidnight dmDefault = test.toDateMidnight();
        Assert.assertEquals(2020, dmDefault.getYear());

        DateMidnight dmParis = test.toDateMidnight(PARIS);
        Assert.assertEquals(PARIS, dmParis.getZone());
    }

    @Test
    public void testToLocalDateTime() {
        LocalDate test = new LocalDate(2020, 5, 12);
        LocalTime time = new LocalTime(14, 30, 15);
        LocalDateTime ldt = test.toLocalDateTime(time);
        Assert.assertEquals(2020, ldt.getYear());
        Assert.assertEquals(5, ldt.getMonthOfYear());
        Assert.assertEquals(12, ldt.getDayOfMonth());
        Assert.assertEquals(14, ldt.getHourOfDay());
        Assert.assertEquals(30, ldt.getMinuteOfHour());
        Assert.assertEquals(15, ldt.getSecondOfMinute());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTime_nullTime_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.toLocalDateTime(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTime_mismatchedChrono_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12, ISOChronology.getInstanceUTC());
        LocalTime time = new LocalTime(14, 30, CopticChronology.getInstanceUTC());
        test.toLocalDateTime(time);
    }

    @Test
    public void testToDateTime_localTime() {
        LocalDate test = new LocalDate(2020, 5, 12);
        LocalTime time = new LocalTime(14, 30);
        DateTime dt = test.toDateTime(time);
        Assert.assertEquals(2020, dt.getYear());
        Assert.assertEquals(14, dt.getHourOfDay());

        DateTime dtNullTime = test.toDateTime((LocalTime) null);
        Assert.assertEquals(2020, dtNullTime.getYear());
    }

    @Test
    public void testToDateTime_localTimeZone() {
        LocalDate test = new LocalDate(2020, 5, 12);
        LocalTime time = new LocalTime(14, 30);
        DateTime dt = test.toDateTime(time, PARIS);
        Assert.assertEquals(PARIS, dt.getZone());
        Assert.assertEquals(14, dt.getHourOfDay());

        DateTime dtNullTime = test.toDateTime(null, PARIS);
        Assert.assertEquals(PARIS, dtNullTime.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToDateTime_mismatchedChrono_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12, ISOChronology.getInstanceUTC());
        LocalTime time = new LocalTime(14, 30, CopticChronology.getInstanceUTC());
        test.toDateTime(time, PARIS);
    }

    @Test
    public void testToInterval() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Interval intervalDefault = test.toInterval();
        Assert.assertEquals(test.toDateTimeAtStartOfDay(), intervalDefault.getStart());
        Assert.assertEquals(test.plusDays(1).toDateTimeAtStartOfDay(), intervalDefault.getEnd());

        Interval intervalParis = test.toInterval(PARIS);
        Assert.assertEquals(test.toDateTimeAtStartOfDay(PARIS), intervalParis.getStart());
        Assert.assertEquals(test.plusDays(1).toDateTimeAtStartOfDay(PARIS), intervalParis.getEnd());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDate() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Date date = test.toDate();
        Assert.assertEquals(120, date.getYear());
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(12, date.getDate());

        // Test DST handling branches by testing various dates
        LocalDate winterDate = new LocalDate(2020, 1, 15);
        Assert.assertEquals(15, winterDate.toDate().getDate());

        LocalDate summerDate = new LocalDate(2020, 7, 15);
        Assert.assertEquals(15, summerDate.toDate().getDate());
    }

    // -----------------------------------------------------------------------
    // Transformations (with*, plus*, minus*)
    // -----------------------------------------------------------------------

    @Test
    public void testWithLocalMillis() {
        LocalDate base = new LocalDate(2020, 5, 12);
        LocalDate same = base.withLocalMillis(base.getLocalMillis());
        Assert.assertSame(base, same);

        LocalDate diff = base.withLocalMillis(0L);
        Assert.assertNotSame(base, diff);
        Assert.assertEquals(1970, diff.getYear());
    }

    @Test
    public void testWithFields() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertSame(test, test.withFields(null));

        LocalDate updated = test.withFields(new YearMonthDay(2018, 2, 8));
        Assert.assertEquals(2018, updated.getYear());
        Assert.assertEquals(2, updated.getMonthOfYear());
        Assert.assertEquals(8, updated.getDayOfMonth());
    }

    @Test
    public void testWithField() {
        LocalDate test = new LocalDate(2020, 5, 12);
        LocalDate modified = test.withField(DateTimeFieldType.monthOfYear(), 8);
        Assert.assertEquals(8, modified.getMonthOfYear());
        Assert.assertEquals(12, modified.getDayOfMonth());

        LocalDate same = test.withField(DateTimeFieldType.monthOfYear(), 5);
        Assert.assertSame(test, same);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_nullField_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.withField(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupportedField_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.withField(DateTimeFieldType.secondOfMinute(), 10);
    }

    @Test
    public void testWithFieldAdded() {
        LocalDate test = new LocalDate(2020, 5, 12);
        LocalDate modified = test.withFieldAdded(DurationFieldType.months(), 2);
        Assert.assertEquals(7, modified.getMonthOfYear());

        LocalDate same = test.withFieldAdded(DurationFieldType.months(), 0);
        Assert.assertSame(test, same);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_nullField_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.withFieldAdded(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupportedField_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.withFieldAdded(DurationFieldType.minutes(), 2);
    }

    @Test
    public void testWithPeriodAdded() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertSame(test, test.withPeriodAdded(null, 1));
        Assert.assertSame(test, test.withPeriodAdded(Period.days(5), 0));

        Period period = Period.days(3).withHours(5); // hours should be ignored
        LocalDate modified = test.withPeriodAdded(period, 2);
        Assert.assertEquals(18, modified.getDayOfMonth());
    }

    @Test
    public void testPlus_minus_Period() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Period period = Period.days(5).withMonths(1);

        LocalDate plus = test.plus(period);
        Assert.assertEquals(6, plus.getMonthOfYear());
        Assert.assertEquals(17, plus.getDayOfMonth());

        LocalDate minus = test.minus(period);
        Assert.assertEquals(4, minus.getMonthOfYear());
        Assert.assertEquals(7, minus.getDayOfMonth());

        Assert.assertSame(test, test.plus(null));
        Assert.assertSame(test, test.minus(null));
    }

    @Test
    public void testPlusMinusYears() {
        LocalDate test = new LocalDate(2020, 2, 29);
        Assert.assertSame(test, test.plusYears(0));
        Assert.assertSame(test, test.minusYears(0));

        LocalDate plus1 = test.plusYears(1);
        Assert.assertEquals(2021, plus1.getYear());
        Assert.assertEquals(28, plus1.getDayOfMonth());

        LocalDate minus1 = test.minusYears(1);
        Assert.assertEquals(2019, minus1.getYear());
        Assert.assertEquals(28, minus1.getDayOfMonth());
    }

    @Test
    public void testPlusMinusMonths() {
        LocalDate test = new LocalDate(2020, 1, 31);
        Assert.assertSame(test, test.plusMonths(0));
        Assert.assertSame(test, test.minusMonths(0));

        LocalDate plus1 = test.plusMonths(1);
        Assert.assertEquals(2, plus1.getMonthOfYear());
        Assert.assertEquals(29, plus1.getDayOfMonth());

        LocalDate minus1 = test.minusMonths(1);
        Assert.assertEquals(2019, minus1.getYear());
        Assert.assertEquals(12, minus1.getMonthOfYear());
        Assert.assertEquals(31, minus1.getDayOfMonth());
    }

    @Test
    public void testPlusMinusWeeks() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertSame(test, test.plusWeeks(0));
        Assert.assertSame(test, test.minusWeeks(0));

        LocalDate plus1 = test.plusWeeks(1);
        Assert.assertEquals(19, plus1.getDayOfMonth());

        LocalDate minus1 = test.minusWeeks(1);
        Assert.assertEquals(5, minus1.getDayOfMonth());
    }

    @Test
    public void testPlusMinusDays() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertSame(test, test.plusDays(0));
        Assert.assertSame(test, test.minusDays(0));

        LocalDate plus1 = test.plusDays(1);
        Assert.assertEquals(13, plus1.getDayOfMonth());

        LocalDate minus1 = test.minusDays(1);
        Assert.assertEquals(11, minus1.getDayOfMonth());
    }

    // -----------------------------------------------------------------------
    // Field Getters and Setters (with*)
    // -----------------------------------------------------------------------

    @Test
    public void testGettersAndWithMethods() {
        LocalDate test = new LocalDate(2020, 5, 12);

        Assert.assertEquals(1, test.getEra());
        Assert.assertEquals(21, test.getCenturyOfEra());
        Assert.assertEquals(2020, test.getYearOfEra());
        Assert.assertEquals(20, test.getYearOfCentury());
        Assert.assertEquals(2020, test.getYear());
        Assert.assertEquals(2020, test.getWeekyear());
        Assert.assertEquals(5, test.getMonthOfYear());
        Assert.assertEquals(20, test.getWeekOfWeekyear());
        Assert.assertEquals(133, test.getDayOfYear());
        Assert.assertEquals(12, test.getDayOfMonth());
        Assert.assertEquals(2, test.getDayOfWeek()); // Tuesday

        Assert.assertEquals(2020, test.withEra(1).getYear());
        Assert.assertEquals(1920, test.withCenturyOfEra(20).getYear());
        Assert.assertEquals(2015, test.withYearOfEra(2015).getYear());
        Assert.assertEquals(2099, test.withYearOfCentury(99).getYear());
        Assert.assertEquals(2010, test.withYear(2010).getYear());
        Assert.assertEquals(2015, test.withWeekyear(2015).getWeekyear());
        Assert.assertEquals(11, test.withMonthOfYear(11).getMonthOfYear());
        Assert.assertEquals(1, test.withWeekOfWeekyear(1).getWeekOfWeekyear());
        Assert.assertEquals(50, test.withDayOfYear(50).getDayOfYear());
        Assert.assertEquals(25, test.withDayOfMonth(25).getDayOfMonth());
        Assert.assertEquals(7, test.withDayOfWeek(7).getDayOfWeek());
    }

    // -----------------------------------------------------------------------
    // Property accessors & Property class
    // -----------------------------------------------------------------------

    @Test
    public void testPropertyMethods() {
        LocalDate test = new LocalDate(2020, 5, 12);

        Assert.assertNotNull(test.era());
        Assert.assertNotNull(test.centuryOfEra());
        Assert.assertNotNull(test.yearOfCentury());
        Assert.assertNotNull(test.yearOfEra());
        Assert.assertNotNull(test.year());
        Assert.assertNotNull(test.weekyear());
        Assert.assertNotNull(test.monthOfYear());
        Assert.assertNotNull(test.weekOfWeekyear());
        Assert.assertNotNull(test.dayOfYear());
        Assert.assertNotNull(test.dayOfMonth());
        Assert.assertNotNull(test.dayOfWeek());

        LocalDate.Property prop = test.property(DateTimeFieldType.monthOfYear());
        Assert.assertNotNull(prop);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_nullType_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupportedType_throwsException() {
        LocalDate test = new LocalDate(2020, 5, 12);
        test.property(DateTimeFieldType.hourOfDay());
    }

    @Test
    public void testPropertyOperations() {
        LocalDate test = new LocalDate(2020, 5, 12);
        LocalDate.Property prop = test.monthOfYear();

        Assert.assertEquals(test.getChronology().monthOfYear(), prop.getField());
        Assert.assertEquals(test.getLocalMillis(), prop.getMillis());
        Assert.assertEquals(test.getChronology(), prop.getChronology());
        Assert.assertSame(test, prop.getLocalDate());

        LocalDate added = prop.addToCopy(2);
        Assert.assertEquals(7, added.getMonthOfYear());

        LocalDate wrapped = test.dayOfMonth().addWrapFieldToCopy(25);
        Assert.assertEquals(6, wrapped.getDayOfMonth());

        LocalDate setInt = prop.setCopy(8);
        Assert.assertEquals(8, setInt.getMonthOfYear());

        LocalDate setStrLocale = prop.setCopy("July", Locale.UK);
        Assert.assertEquals(7, setStrLocale.getMonthOfYear());

        LocalDate setStr = prop.setCopy("June");
        Assert.assertEquals(6, setStr.getMonthOfYear());

        LocalDate maxMonth = test.dayOfMonth().withMaximumValue();
        Assert.assertEquals(31, maxMonth.getDayOfMonth());

        LocalDate minMonth = test.dayOfMonth().withMinimumValue();
        Assert.assertEquals(1, minMonth.getDayOfMonth());

        LocalDate roundFloor = prop.roundFloorCopy();
        Assert.assertEquals(1, roundFloor.getDayOfMonth());

        LocalDate roundCeiling = prop.roundCeilingCopy();
        Assert.assertEquals(1, roundCeiling.getDayOfMonth());
        Assert.assertEquals(6, roundCeiling.getMonthOfYear());

        LocalDate roundHalfFloor = prop.roundHalfFloorCopy();
        Assert.assertEquals(1, roundHalfFloor.getDayOfMonth());

        LocalDate roundHalfCeiling = prop.roundHalfCeilingCopy();
        Assert.assertEquals(1, roundHalfCeiling.getDayOfMonth());

        LocalDate roundHalfEven = prop.roundHalfEvenCopy();
        Assert.assertEquals(1, roundHalfEven.getDayOfMonth());
    }

    // -----------------------------------------------------------------------
    // ToString
    // -----------------------------------------------------------------------

    @Test
    public void testToString() {
        LocalDate test = new LocalDate(2020, 5, 12);
        Assert.assertEquals("2020-05-12", test.toString());
        Assert.assertEquals("12/05/2020", test.toString("dd/MM/yyyy"));
        Assert.assertEquals("2020-05-12", test.toString(null));
        Assert.assertEquals("12-May-2020", test.toString("dd-MMM-yyyy", Locale.UK));
        Assert.assertEquals("2020-05-12", test.toString(null, Locale.UK));
    }

    // -----------------------------------------------------------------------
    // Serialization & readResolve
    // -----------------------------------------------------------------------

    @Test
    public void testSerialization() throws Exception {
        LocalDate test = new LocalDate(2020, 5, 12, GJChronology.getInstanceUTC());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDate result = (LocalDate) ois.readObject();
        ois.close();

        Assert.assertEquals(test, result);
    }

    @Test
    public void testPropertySerialization() throws Exception {
        LocalDate test = new LocalDate(2020, 5, 12);
        LocalDate.Property prop = test.monthOfYear();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDate.Property result = (LocalDate.Property) ois.readObject();
        ois.close();

        Assert.assertEquals(prop.get(), result.get());
        Assert.assertEquals(prop.getLocalDate(), result.getLocalDate());
    }
}
