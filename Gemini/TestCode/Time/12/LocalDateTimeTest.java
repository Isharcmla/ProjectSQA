package org.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
import org.junit.Before;
import org.junit.Test;

public class LocalDateTimeTest {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private DateTimeZone originalDateTimeZone;
    private TimeZone originalTimeZone;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();

        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
        DateTimeUtils.setCurrentMillisFixed(10000000000L);
    }

    @After
    public void tearDown() {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
    }

    //-----------------------------------------------------------------------
    // Factories & Constructors
    //-----------------------------------------------------------------------

    @Test
    public void testNow_defaultZone() {
        LocalDateTime dt = LocalDateTime.now();
        assertEquals(ISO_UTC, dt.getChronology());
        assertEquals(new LocalDateTime(10000000000L, ISOChronology.getInstance(LONDON)), dt);
    }

    @Test
    public void testNow_DateTimeZone_valid() {
        LocalDateTime dt = LocalDateTime.now(PARIS);
        assertEquals(ISO_UTC, dt.getChronology());
        assertEquals(new LocalDateTime(10000000000L, ISOChronology.getInstance(PARIS)), dt);
    }

    @Test(expected = NullPointerException.class)
    public void testNow_DateTimeZone_null() {
        LocalDateTime.now((DateTimeZone) null);
    }

    @Test
    public void testNow_Chronology_valid() {
        LocalDateTime dt = LocalDateTime.now(COPTIC_UTC);
        assertEquals(COPTIC_UTC, dt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void testNow_Chronology_null() {
        LocalDateTime.now((Chronology) null);
    }

    @Test
    public void testParse_String() {
        LocalDateTime expected = new LocalDateTime(2004, 6, 9, 10, 20, 30, 0);
        assertEquals(expected, LocalDateTime.parse("2004-06-09T10:20:30"));
    }

    @Test
    public void testParse_String_DateTimeFormatter() {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime expected = new LocalDateTime(2004, 6, 9, 10, 20, 30, 0);
        assertEquals(expected, LocalDateTime.parse("2004/06/09 10:20:30", f));
    }

    @Test
    public void testFromCalendarFields_valid() {
        Calendar cal = new GregorianCalendar(2010, Calendar.DECEMBER, 3, 14, 15, 16);
        cal.set(Calendar.MILLISECOND, 123);
        LocalDateTime dt = LocalDateTime.fromCalendarFields(cal);
        assertEquals(2010, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(3, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(16, dt.getSecondOfMinute());
        assertEquals(123, dt.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCalendarFields_null() {
        LocalDateTime.fromCalendarFields(null);
    }

    @Test
    public void testFromDateFields_valid() {
        Calendar cal = new GregorianCalendar(2010, Calendar.DECEMBER, 3, 14, 15, 16);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        LocalDateTime dt = LocalDateTime.fromDateFields(date);
        assertEquals(2010, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(3, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(16, dt.getSecondOfMinute());
        assertEquals(123, dt.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromDateFields_null() {
        LocalDateTime.fromDateFields(null);
    }

    @Test
    public void testConstructor_noArg() {
        LocalDateTime dt = new LocalDateTime();
        assertEquals(ISO_UTC, dt.getChronology());
    }

    @Test
    public void testConstructor_DateTimeZone() {
        LocalDateTime dt = new LocalDateTime(PARIS);
        assertEquals(ISO_UTC, dt.getChronology());

        LocalDateTime dtNull = new LocalDateTime((DateTimeZone) null);
        assertEquals(ISO_UTC, dtNull.getChronology());
    }

    @Test
    public void testConstructor_Chronology() {
        LocalDateTime dt = new LocalDateTime(COPTIC_UTC);
        assertEquals(COPTIC_UTC, dt.getChronology());

        LocalDateTime dtNull = new LocalDateTime((Chronology) null);
        assertEquals(ISO_UTC, dtNull.getChronology());
    }

    @Test
    public void testConstructor_long() {
        LocalDateTime dt = new LocalDateTime(123456789L);
        assertEquals(ISO_UTC, dt.getChronology());
    }

    @Test
    public void testConstructor_long_DateTimeZone() {
        LocalDateTime dt = new LocalDateTime(123456789L, PARIS);
        assertEquals(ISO_UTC, dt.getChronology());

        LocalDateTime dtNull = new LocalDateTime(123456789L, (DateTimeZone) null);
        assertEquals(ISO_UTC, dtNull.getChronology());
    }

    @Test
    public void testConstructor_long_Chronology() {
        LocalDateTime dt = new LocalDateTime(123456789L, COPTIC_UTC);
        assertEquals(COPTIC_UTC, dt.getChronology());

        LocalDateTime dtNull = new LocalDateTime(123456789L, (Chronology) null);
        assertEquals(ISO_UTC, dtNull.getChronology());
    }

    @Test
    public void testConstructor_Object() {
        LocalDateTime dt = new LocalDateTime("2010-12-03T14:15:16.123");
        assertEquals(2010, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(3, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(16, dt.getSecondOfMinute());
        assertEquals(123, dt.getMillisOfSecond());

        LocalDateTime dtNull = new LocalDateTime((Object) null);
        assertEquals(ISO_UTC, dtNull.getChronology());
    }

    @Test
    public void testConstructor_Object_DateTimeZone() {
        LocalDateTime dt = new LocalDateTime("2010-12-03T14:15:16.123", PARIS);
        assertEquals(2010, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());

        LocalDateTime dtNullZone = new LocalDateTime("2010-12-03T14:15:16.123", (DateTimeZone) null);
        assertEquals(2010, dtNullZone.getYear());
    }

    @Test
    public void testConstructor_Object_Chronology() {
        LocalDateTime dt = new LocalDateTime("2010-12-03T14:15:16.123", GregorianChronology.getInstanceUTC());
        assertEquals(2010, dt.getYear());

        LocalDateTime dtNullChrono = new LocalDateTime("2010-12-03T14:15:16.123", (Chronology) null);
        assertEquals(2010, dtNullChrono.getYear());
    }

    @Test
    public void testConstructor_5ints() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15);
        assertEquals(2010, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(3, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(0, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());
    }

    @Test
    public void testConstructor_6ints() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16);
        assertEquals(2010, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(3, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(16, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());
    }

    @Test
    public void testConstructor_7ints() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertEquals(2010, dt.getYear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(3, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(16, dt.getSecondOfMinute());
        assertEquals(123, dt.getMillisOfSecond());
    }

    @Test
    public void testConstructor_7ints_Chronology() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123, GregorianChronology.getInstanceUTC());
        assertEquals(2010, dt.getYear());
        assertEquals(GregorianChronology.getInstanceUTC(), dt.getChronology());

        LocalDateTime dtNullChrono = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123, null);
        assertEquals(ISO_UTC, dtNullChrono.getChronology());
    }

    //-----------------------------------------------------------------------
    // Basic queries / ReadablePartial implementation
    //-----------------------------------------------------------------------

    @Test
    public void testSize() {
        LocalDateTime dt = new LocalDateTime();
        assertEquals(4, dt.size());
    }

    @Test
    public void testGetField() {
        LocalDateTime dt = new LocalDateTime();
        assertEquals(ISO_UTC.year(), dt.getField(0, ISO_UTC));
        assertEquals(ISO_UTC.monthOfYear(), dt.getField(1, ISO_UTC));
        assertEquals(ISO_UTC.dayOfMonth(), dt.getField(2, ISO_UTC));
        assertEquals(ISO_UTC.millisOfDay(), dt.getField(3, ISO_UTC));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_invalidIndexNegative() {
        new LocalDateTime().getField(-1, ISO_UTC);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetField_invalidIndexTooHigh() {
        new LocalDateTime().getField(4, ISO_UTC);
    }

    @Test
    public void testGetValue() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertEquals(2010, dt.getValue(0));
        assertEquals(12, dt.getValue(1));
        assertEquals(3, dt.getValue(2));
        assertEquals(14 * 3600000 + 15 * 60000 + 16 * 1000 + 123, dt.getValue(3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndexNegative() {
        new LocalDateTime().getValue(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndexTooHigh() {
        new LocalDateTime().getValue(4);
    }

    @Test
    public void testGet_DateTimeFieldType() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertEquals(2010, dt.get(DateTimeFieldType.year()));
        assertEquals(12, dt.get(DateTimeFieldType.monthOfYear()));
        assertEquals(3, dt.get(DateTimeFieldType.dayOfMonth()));
        assertEquals(14, dt.get(DateTimeFieldType.hourOfDay()));
        assertEquals(15, dt.get(DateTimeFieldType.minuteOfHour()));
        assertEquals(16, dt.get(DateTimeFieldType.secondOfMinute()));
        assertEquals(123, dt.get(DateTimeFieldType.millisOfSecond()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullDateTimeFieldType() {
        new LocalDateTime().get(null);
    }

    @Test
    public void testIsSupported_DateTimeFieldType() {
        LocalDateTime dt = new LocalDateTime();
        assertTrue(dt.isSupported(DateTimeFieldType.year()));
        assertTrue(dt.isSupported(DateTimeFieldType.dayOfWeek()));
        assertFalse(dt.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupported_DurationFieldType() {
        LocalDateTime dt = new LocalDateTime();
        assertTrue(dt.isSupported(DurationFieldType.years()));
        assertTrue(dt.isSupported(DurationFieldType.hours()));
        assertFalse(dt.isSupported((DurationFieldType) null));
    }

    @Test
    public void testGetLocalMillis() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        long expected = ISO_UTC.getDateTimeMillis(2010, 12, 3, 14, 15, 16, 123);
        assertEquals(expected, dt.getLocalMillis());
    }

    //-----------------------------------------------------------------------
    // Comparisons, equals & compareTo
    //-----------------------------------------------------------------------

    @Test
    public void testEquals() {
        LocalDateTime dt1 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime dt2 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime dt3 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 124);
        LocalDateTime dt4 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123, GregorianChronology.getInstanceUTC());

        assertTrue(dt1.equals(dt1));
        assertTrue(dt1.equals(dt2));
        assertFalse(dt1.equals(dt3));
        assertFalse(dt1.equals(dt4));
        assertFalse(dt1.equals(null));
        assertFalse(dt1.equals("2010-12-03"));
    }

    @Test
    public void testCompareTo() {
        LocalDateTime dt1 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime dt2 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime dt3 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 124);
        LocalDateTime dt0 = new LocalDateTime(2010, 12, 3, 14, 15, 16, 122);

        assertEquals(0, dt1.compareTo(dt1));
        assertEquals(0, dt1.compareTo(dt2));
        assertTrue(dt1.compareTo(dt3) < 0);
        assertTrue(dt1.compareTo(dt0) > 0);

        LocalDateTime dtChrono = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123, GregorianChronology.getInstanceUTC());
        assertEquals(0, dt1.compareTo(dtChrono));
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_null() {
        new LocalDateTime().compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_invalidPartial() {
        new LocalDateTime().compareTo(new LocalDate());
    }

    //-----------------------------------------------------------------------
    // Conversions
    //-----------------------------------------------------------------------

    @Test
    public void testToDateTime() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        DateTime expected = new DateTime(2010, 12, 3, 14, 15, 16, 123, LONDON);
        assertEquals(expected, dt.toDateTime());

        DateTime expectedNY = new DateTime(2010, 12, 3, 14, 15, 16, 123, NEW_YORK);
        assertEquals(expectedNY, dt.toDateTime(NEW_YORK));
        assertEquals(expected, dt.toDateTime((DateTimeZone) null));
    }

    @Test
    public void testToLocalDate() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertEquals(new LocalDate(2010, 12, 3), dt.toLocalDate());
    }

    @Test
    public void testToLocalTime() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertEquals(new LocalTime(14, 15, 16, 123), dt.toLocalTime());
    }

    @Test
    public void testToDate() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        Date date = dt.toDate();
        assertEquals(dt, LocalDateTime.fromDateFields(date));

        // Test DST Gap handling
        DateTimeZone.setDefault(NEW_YORK);
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        // 2011-03-13 02:30:00 does not exist in NY time (gap 02:00 -> 03:00)
        LocalDateTime gapDt = new LocalDateTime(2011, 3, 13, 2, 30, 0, 0);
        Date gapDate = gapDt.toDate();
        assertNotNull(gapDate);

        // Test DST Overlap handling
        // 2011-11-06 01:30:00 occurs twice (overlap 01:00 -> 02:00)
        LocalDateTime overlapDt = new LocalDateTime(2011, 11, 6, 1, 30, 0, 0);
        Date overlapDate = overlapDt.toDate();
        assertNotNull(overlapDate);
    }

    //-----------------------------------------------------------------------
    // withLocalMillis / withDate / withTime / withFields
    //-----------------------------------------------------------------------

    @Test
    public void testWithLocalMillis() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.withLocalMillis(dt.getLocalMillis()));

        LocalDateTime modified = dt.withLocalMillis(1000L);
        assertEquals(1000L, modified.getLocalMillis());
    }

    @Test
    public void testWithDate() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime updated = dt.withDate(2012, 5, 20);
        assertEquals(new LocalDateTime(2012, 5, 20, 14, 15, 16, 123), updated);
        assertSame(dt, dt.withDate(2010, 12, 3));
    }

    @Test
    public void testWithTime() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime updated = dt.withTime(8, 9, 10, 11);
        assertEquals(new LocalDateTime(2010, 12, 3, 8, 9, 10, 11), updated);
        assertSame(dt, dt.withTime(14, 15, 16, 123));
    }

    @Test
    public void testWithFields() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.withFields(null));

        LocalTime time = new LocalTime(8, 9, 10, 11);
        LocalDateTime updated = dt.withFields(time);
        assertEquals(new LocalDateTime(2010, 12, 3, 8, 9, 10, 11), updated);
    }

    @Test
    public void testWithField() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime updated = dt.withField(DateTimeFieldType.year(), 2015);
        assertEquals(2015, updated.getYear());
        assertSame(dt, dt.withField(DateTimeFieldType.year(), 2010));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_nullField() {
        new LocalDateTime().withField(null, 10);
    }

    @Test
    public void testWithFieldAdded() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.withFieldAdded(DurationFieldType.years(), 0));

        LocalDateTime updated = dt.withFieldAdded(DurationFieldType.years(), 2);
        assertEquals(2012, updated.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_nullField() {
        new LocalDateTime().withFieldAdded(null, 5);
    }

    @Test
    public void testWithDurationAdded() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.withDurationAdded(null, 1));
        assertSame(dt, dt.withDurationAdded(new Duration(1000), 0));

        LocalDateTime updated = dt.withDurationAdded(new Duration(1000), 2);
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 18, 123), updated);
    }

    @Test
    public void testWithPeriodAdded() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.withPeriodAdded(null, 1));
        assertSame(dt, dt.withPeriodAdded(Period.days(1), 0));

        LocalDateTime updated = dt.withPeriodAdded(Period.days(2), 3);
        assertEquals(new LocalDateTime(2010, 12, 9, 14, 15, 16, 123), updated);
    }

    //-----------------------------------------------------------------------
    // Plus & Minus operations
    //-----------------------------------------------------------------------

    @Test
    public void testPlus_ReadableDuration() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plus((ReadableDuration) null));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 26, 123), dt.plus(new Duration(10000)));
    }

    @Test
    public void testPlus_ReadablePeriod() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plus((ReadablePeriod) null));
        assertEquals(new LocalDateTime(2010, 12, 5, 14, 15, 16, 123), dt.plus(Period.days(2)));
    }

    @Test
    public void testPlusYears() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusYears(0));
        assertEquals(new LocalDateTime(2015, 12, 3, 14, 15, 16, 123), dt.plusYears(5));
        assertEquals(new LocalDateTime(2005, 12, 3, 14, 15, 16, 123), dt.plusYears(-5));
    }

    @Test
    public void testPlusMonths() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusMonths(0));
        assertEquals(new LocalDateTime(2011, 2, 3, 14, 15, 16, 123), dt.plusMonths(2));
        assertEquals(new LocalDateTime(2010, 10, 3, 14, 15, 16, 123), dt.plusMonths(-2));
    }

    @Test
    public void testPlusWeeks() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusWeeks(0));
        assertEquals(new LocalDateTime(2010, 12, 17, 14, 15, 16, 123), dt.plusWeeks(2));
        assertEquals(new LocalDateTime(2010, 11, 19, 14, 15, 16, 123), dt.plusWeeks(-2));
    }

    @Test
    public void testPlusDays() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusDays(0));
        assertEquals(new LocalDateTime(2010, 12, 5, 14, 15, 16, 123), dt.plusDays(2));
        assertEquals(new LocalDateTime(2010, 12, 1, 14, 15, 16, 123), dt.plusDays(-2));
    }

    @Test
    public void testPlusHours() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusHours(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 16, 15, 16, 123), dt.plusHours(2));
        assertEquals(new LocalDateTime(2010, 12, 3, 12, 15, 16, 123), dt.plusHours(-2));
    }

    @Test
    public void testPlusMinutes() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusMinutes(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 25, 16, 123), dt.plusMinutes(10));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 5, 16, 123), dt.plusMinutes(-10));
    }

    @Test
    public void testPlusSeconds() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusSeconds(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 26, 123), dt.plusSeconds(10));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 6, 123), dt.plusSeconds(-10));
    }

    @Test
    public void testPlusMillis() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.plusMillis(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 16, 223), dt.plusMillis(100));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 16, 23), dt.plusMillis(-100));
    }

    @Test
    public void testMinus_ReadableDuration() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minus((ReadableDuration) null));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 6, 123), dt.minus(new Duration(10000)));
    }

    @Test
    public void testMinus_ReadablePeriod() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minus((ReadablePeriod) null));
        assertEquals(new LocalDateTime(2010, 12, 1, 14, 15, 16, 123), dt.minus(Period.days(2)));
    }

    @Test
    public void testMinusYears() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusYears(0));
        assertEquals(new LocalDateTime(2005, 12, 3, 14, 15, 16, 123), dt.minusYears(5));
        assertEquals(new LocalDateTime(2015, 12, 3, 14, 15, 16, 123), dt.minusYears(-5));
    }

    @Test
    public void testMinusMonths() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusMonths(0));
        assertEquals(new LocalDateTime(2010, 10, 3, 14, 15, 16, 123), dt.minusMonths(2));
        assertEquals(new LocalDateTime(2011, 2, 3, 14, 15, 16, 123), dt.minusMonths(-2));
    }

    @Test
    public void testMinusWeeks() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusWeeks(0));
        assertEquals(new LocalDateTime(2010, 11, 19, 14, 15, 16, 123), dt.minusWeeks(2));
        assertEquals(new LocalDateTime(2010, 12, 17, 14, 15, 16, 123), dt.minusWeeks(-2));
    }

    @Test
    public void testMinusDays() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusDays(0));
        assertEquals(new LocalDateTime(2010, 12, 1, 14, 15, 16, 123), dt.minusDays(2));
        assertEquals(new LocalDateTime(2010, 12, 5, 14, 15, 16, 123), dt.minusDays(-2));
    }

    @Test
    public void testMinusHours() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusHours(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 12, 15, 16, 123), dt.minusHours(2));
        assertEquals(new LocalDateTime(2010, 12, 3, 16, 15, 16, 123), dt.minusHours(-2));
    }

    @Test
    public void testMinusMinutes() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusMinutes(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 5, 16, 123), dt.minusMinutes(10));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 25, 16, 123), dt.minusMinutes(-10));
    }

    @Test
    public void testMinusSeconds() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusSeconds(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 6, 123), dt.minusSeconds(10));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 26, 123), dt.minusSeconds(-10));
    }

    @Test
    public void testMinusMillis() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertSame(dt, dt.minusMillis(0));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 16, 23), dt.minusMillis(100));
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 15, 16, 223), dt.minusMillis(-100));
    }

    //-----------------------------------------------------------------------
    // Getters
    //-----------------------------------------------------------------------

    @Test
    public void testGetters() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertEquals(1, dt.getEra());
        assertEquals(20, dt.getCenturyOfEra());
        assertEquals(2010, dt.getYearOfEra());
        assertEquals(10, dt.getYearOfCentury());
        assertEquals(2010, dt.getYear());
        assertEquals(2010, dt.getWeekyear());
        assertEquals(12, dt.getMonthOfYear());
        assertEquals(48, dt.getWeekOfWeekyear());
        assertEquals(337, dt.getDayOfYear());
        assertEquals(3, dt.getDayOfMonth());
        assertEquals(DateTimeConstants.FRIDAY, dt.getDayOfWeek());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(15, dt.getMinuteOfHour());
        assertEquals(16, dt.getSecondOfMinute());
        assertEquals(123, dt.getMillisOfSecond());
        assertEquals(14 * 3600000 + 15 * 60000 + 16 * 1000 + 123, dt.getMillisOfDay());
    }

    //-----------------------------------------------------------------------
    // withXxx methods
    //-----------------------------------------------------------------------

    @Test
    public void testWithMethods() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);

        assertEquals(1, dt.withEra(1).getEra());
        assertEquals(21, dt.withCenturyOfEra(21).getCenturyOfEra());
        assertEquals(2015, dt.withYearOfEra(2015).getYearOfEra());
        assertEquals(25, dt.withYearOfCentury(25).getYearOfCentury());
        assertEquals(2015, dt.withYear(2015).getYear());
        assertEquals(2015, dt.withWeekyear(2015).getWeekyear());
        assertEquals(5, dt.withMonthOfYear(5).getMonthOfYear());
        assertEquals(20, dt.withWeekOfWeekyear(20).getWeekOfWeekyear());
        assertEquals(100, dt.withDayOfYear(100).getDayOfYear());
        assertEquals(20, dt.withDayOfMonth(20).getDayOfMonth());
        assertEquals(DateTimeConstants.MONDAY, dt.withDayOfWeek(DateTimeConstants.MONDAY).getDayOfWeek());
        assertEquals(20, dt.withHourOfDay(20).getHourOfDay());
        assertEquals(40, dt.withMinuteOfHour(40).getMinuteOfHour());
        assertEquals(50, dt.withSecondOfMinute(50).getSecondOfMinute());
        assertEquals(500, dt.withMillisOfSecond(500).getMillisOfSecond());
        assertEquals(5000, dt.withMillisOfDay(5000).getMillisOfDay());
    }

    //-----------------------------------------------------------------------
    // Property accessors
    //-----------------------------------------------------------------------

    @Test
    public void testProperties() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);

        assertEquals(dt.getEra(), dt.era().get());
        assertEquals(dt.getCenturyOfEra(), dt.centuryOfEra().get());
        assertEquals(dt.getYearOfCentury(), dt.yearOfCentury().get());
        assertEquals(dt.getYearOfEra(), dt.yearOfEra().get());
        assertEquals(dt.getYear(), dt.year().get());
        assertEquals(dt.getWeekyear(), dt.weekyear().get());
        assertEquals(dt.getMonthOfYear(), dt.monthOfYear().get());
        assertEquals(dt.getWeekOfWeekyear(), dt.weekOfWeekyear().get());
        assertEquals(dt.getDayOfYear(), dt.dayOfYear().get());
        assertEquals(dt.getDayOfMonth(), dt.dayOfMonth().get());
        assertEquals(dt.getDayOfWeek(), dt.dayOfWeek().get());
        assertEquals(dt.getHourOfDay(), dt.hourOfDay().get());
        assertEquals(dt.getMinuteOfHour(), dt.minuteOfHour().get());
        assertEquals(dt.getSecondOfMinute(), dt.secondOfMinute().get());
        assertEquals(dt.getMillisOfSecond(), dt.millisOfSecond().get());
        assertEquals(dt.getMillisOfDay(), dt.millisOfDay().get());
    }

    @Test
    public void testProperty_generic() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime.Property p = dt.property(DateTimeFieldType.monthOfYear());
        assertNotNull(p);
        assertEquals(12, p.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_genericNull() {
        new LocalDateTime().property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_genericUnsupported() {
        DateTimeFieldType unsupported = new DateTimeFieldType("unsupported") {
            private static final long serialVersionUID = 1L;
            @Override
            public DurationFieldType getDurationType() {
                return DurationFieldType.days();
            }
            @Override
            public DurationFieldType getRangeDurationType() {
                return null;
            }
            @Override
            public DateTimeField getField(Chronology chronology) {
                return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }
        };
        new LocalDateTime().property(unsupported);
    }

    //-----------------------------------------------------------------------
    // toString formatting
    //-----------------------------------------------------------------------

    @Test
    public void testToString() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        assertEquals("2010-12-03T14:15:16.123", dt.toString());
        assertEquals("2010-12-03T14:15:16.123", dt.toString((String) null));
        assertEquals("2010/12/03", dt.toString("yyyy/MM/dd"));
        assertEquals("2010-12-03T14:15:16.123", dt.toString(null, Locale.UK));
        assertEquals("03-Dec-2010", dt.toString("dd-MMM-yyyy", Locale.UK));
    }

    //-----------------------------------------------------------------------
    // LocalDateTime.Property methods
    //-----------------------------------------------------------------------

    @Test
    public void testPropertyMethods() {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime.Property prop = dt.monthOfYear();

        assertEquals(ISO_UTC.monthOfYear(), prop.getField());
        assertEquals(dt.getLocalMillis(), prop.getMillis());
        assertEquals(ISO_UTC, prop.getChronology());
        assertSame(dt, prop.getLocalDateTime());

        assertEquals(new LocalDateTime(2011, 2, 3, 14, 15, 16, 123), prop.addToCopy(2));
        assertEquals(new LocalDateTime(2011, 2, 3, 14, 15, 16, 123), prop.addToCopy(2L));
        assertEquals(new LocalDateTime(2010, 2, 3, 14, 15, 16, 123), prop.addWrapFieldToCopy(2));

        assertEquals(new LocalDateTime(2010, 5, 3, 14, 15, 16, 123), prop.setCopy(5));
        assertEquals(new LocalDateTime(2010, 5, 3, 14, 15, 16, 123), prop.setCopy("5"));
        assertEquals(new LocalDateTime(2010, 5, 3, 14, 15, 16, 123), prop.setCopy("May", Locale.UK));

        assertEquals(new LocalDateTime(2010, 12, 31, 14, 15, 16, 123), dt.dayOfMonth().withMaximumValue());
        assertEquals(new LocalDateTime(2010, 12, 1, 14, 15, 16, 123), dt.dayOfMonth().withMinimumValue());

        LocalDateTime dtRound = new LocalDateTime(2010, 12, 3, 14, 30, 45, 500);
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 0, 0, 0), dtRound.hourOfDay().roundFloorCopy());
        assertEquals(new LocalDateTime(2010, 12, 3, 15, 0, 0, 0), dtRound.hourOfDay().roundCeilingCopy());
        assertEquals(new LocalDateTime(2010, 12, 3, 15, 0, 0, 0), dtRound.hourOfDay().roundHalfFloorCopy());
        assertEquals(new LocalDateTime(2010, 12, 3, 15, 0, 0, 0), dtRound.hourOfDay().roundHalfCeilingCopy());
        assertEquals(new LocalDateTime(2010, 12, 3, 14, 0, 0, 0), dtRound.hourOfDay().roundHalfEvenCopy());
    }

    //-----------------------------------------------------------------------
    // Serialization
    //-----------------------------------------------------------------------

    @Test
    public void testSerialization_LocalDateTime() throws Exception {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123, COPTIC_UTC);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dt);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime deserialized = (LocalDateTime) ois.readObject();
        ois.close();

        assertEquals(dt, deserialized);
        assertEquals(COPTIC_UTC, deserialized.getChronology());
    }

    @Test
    public void testSerialization_Property() throws Exception {
        LocalDateTime dt = new LocalDateTime(2010, 12, 3, 14, 15, 16, 123);
        LocalDateTime.Property prop = dt.dayOfMonth();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime.Property deserialized = (LocalDateTime.Property) ois.readObject();
        ois.close();

        assertEquals(prop.get(), deserialized.get());
        assertEquals(prop.getField().getType(), deserialized.getField().getType());
        assertEquals(prop.getLocalDateTime(), deserialized.getLocalDateTime());
    }

    @Test
    public void testReadResolve_nonUTCZoneInChronology() throws Exception {
        // Construct a serialized form of LocalDateTime with non-UTC chronology to exercise readResolve branch
        Chronology chronoWithZone = ISOChronology.getInstance(PARIS);
        LocalDateTime dt = new LocalDateTime(1000L, chronoWithZone);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dt);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime deserialized = (LocalDateTime) ois.readObject();
        ois.close();

        assertEquals(ISO_UTC, deserialized.getChronology());
    }
}
