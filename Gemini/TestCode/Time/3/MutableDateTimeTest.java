package org.joda.time;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MutableDateTimeTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone UTC = DateTimeZone.UTC;

    private DateTimeZone defaultZone;
    private Locale defaultLocale;

    @Before
    public void setUp() {
        defaultZone = DateTimeZone.getDefault();
        defaultLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(defaultZone);
        Locale.setDefault(defaultLocale);
    }

    // -----------------------------------------------------------------------
    // Constructors & Factory Methods
    // -----------------------------------------------------------------------

    @Test
    public void testNow_default_returnsNotNull() {
        MutableDateTime mdt = MutableDateTime.now();
        Assert.assertNotNull(mdt);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdt.getChronology());
    }

    @Test
    public void testNow_zone_returnsNotNull() {
        MutableDateTime mdt = MutableDateTime.now(PARIS);
        Assert.assertNotNull(mdt);
        Assert.assertEquals(ISOChronology.getInstance(PARIS), mdt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void testNow_nullZone_throwsException() {
        MutableDateTime.now((DateTimeZone) null);
    }

    @Test
    public void testNow_chronology_returnsNotNull() {
        Chronology chrono = GregorianChronology.getInstance(PARIS);
        MutableDateTime mdt = MutableDateTime.now(chrono);
        Assert.assertNotNull(mdt);
        Assert.assertEquals(chrono, mdt.getChronology());
    }

    @Test(expected = NullPointerException.class)
    public void testNow_nullChronology_throwsException() {
        MutableDateTime.now((Chronology) null);
    }

    @Test
    public void testParse_string_valid() {
        MutableDateTime mdt = MutableDateTime.parse("2010-06-15T12:30:45.123+02:00");
        Assert.assertEquals(2010, mdt.getYear());
        Assert.assertEquals(6, mdt.getMonthOfYear());
        Assert.assertEquals(15, mdt.getDayOfMonth());
        Assert.assertEquals(12, mdt.getHourOfDay());
        Assert.assertEquals(30, mdt.getMinuteOfHour());
        Assert.assertEquals(45, mdt.getSecondOfMinute());
        Assert.assertEquals(123, mdt.getMillisOfSecond());
        Assert.assertEquals(DateTimeZone.forOffsetHours(2), mdt.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_invalidString_throwsException() {
        MutableDateTime.parse("not-a-date");
    }

    @Test
    public void testParse_stringWithFormatter_valid() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss").withZone(UTC);
        MutableDateTime mdt = MutableDateTime.parse("2021/05/20 14:15:16", formatter);
        Assert.assertEquals(2021, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(20, mdt.getDayOfMonth());
        Assert.assertEquals(14, mdt.getHourOfDay());
        Assert.assertEquals(15, mdt.getMinuteOfHour());
        Assert.assertEquals(16, mdt.getSecondOfMinute());
    }

    @Test
    public void testConstructor_noArg() {
        long before = System.currentTimeMillis();
        MutableDateTime mdt = new MutableDateTime();
        long after = System.currentTimeMillis();
        Assert.assertTrue(mdt.getMillis() >= before && mdt.getMillis() <= after);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdt.getChronology());
    }

    @Test
    public void testConstructor_zone() {
        MutableDateTime mdt = new MutableDateTime(PARIS);
        Assert.assertEquals(ISOChronology.getInstance(PARIS), mdt.getChronology());

        MutableDateTime mdtNull = new MutableDateTime((DateTimeZone) null);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNull.getChronology());
    }

    @Test
    public void testConstructor_chronology() {
        Chronology chrono = GregorianChronology.getInstance(PARIS);
        MutableDateTime mdt = new MutableDateTime(chrono);
        Assert.assertEquals(chrono, mdt.getChronology());

        MutableDateTime mdtNull = new MutableDateTime((Chronology) null);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNull.getChronology());
    }

    @Test
    public void testConstructor_longInstant() {
        MutableDateTime mdt = new MutableDateTime(123456789L);
        Assert.assertEquals(123456789L, mdt.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdt.getChronology());
    }

    @Test
    public void testConstructor_longInstant_zone() {
        MutableDateTime mdt = new MutableDateTime(123456789L, PARIS);
        Assert.assertEquals(123456789L, mdt.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(PARIS), mdt.getChronology());

        MutableDateTime mdtNull = new MutableDateTime(123456789L, (DateTimeZone) null);
        Assert.assertEquals(123456789L, mdtNull.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNull.getChronology());
    }

    @Test
    public void testConstructor_longInstant_chronology() {
        Chronology chrono = GregorianChronology.getInstance(PARIS);
        MutableDateTime mdt = new MutableDateTime(123456789L, chrono);
        Assert.assertEquals(123456789L, mdt.getMillis());
        Assert.assertEquals(chrono, mdt.getChronology());

        MutableDateTime mdtNull = new MutableDateTime(123456789L, (Chronology) null);
        Assert.assertEquals(123456789L, mdtNull.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNull.getChronology());
    }

    @Test
    public void testConstructor_object() {
        Date date = new Date(1000000L);
        MutableDateTime mdt = new MutableDateTime(date);
        Assert.assertEquals(1000000L, mdt.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdt.getChronology());

        GregorianCalendar cal = new GregorianCalendar();
        MutableDateTime mdtCal = new MutableDateTime(cal);
        Assert.assertEquals(cal.getTimeInMillis(), mdtCal.getMillis());
        Assert.assertEquals(GJChronology.getInstance(LONDON), mdtCal.getChronology());

        MutableDateTime mdtNull = new MutableDateTime((Object) null);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNull.getChronology());
    }

    @Test
    public void testConstructor_object_zone() {
        Date date = new Date(1000000L);
        MutableDateTime mdt = new MutableDateTime(date, PARIS);
        Assert.assertEquals(1000000L, mdt.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(PARIS), mdt.getChronology());

        MutableDateTime mdtNullZone = new MutableDateTime(date, (DateTimeZone) null);
        Assert.assertEquals(1000000L, mdtNullZone.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNullZone.getChronology());

        MutableDateTime mdtNullObj = new MutableDateTime((Object) null, PARIS);
        Assert.assertEquals(ISOChronology.getInstance(PARIS), mdtNullObj.getChronology());
    }

    @Test
    public void testConstructor_object_chronology() {
        Chronology chrono = GregorianChronology.getInstance(PARIS);
        Date date = new Date(1000000L);
        MutableDateTime mdt = new MutableDateTime(date, chrono);
        Assert.assertEquals(1000000L, mdt.getMillis());
        Assert.assertEquals(chrono, mdt.getChronology());

        MutableDateTime mdtNullChrono = new MutableDateTime(date, (Chronology) null);
        Assert.assertEquals(1000000L, mdtNullChrono.getMillis());
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNullChrono.getChronology());

        MutableDateTime mdtNullObj = new MutableDateTime((Object) null, chrono);
        Assert.assertEquals(chrono, mdtNullObj.getChronology());
    }

    @Test
    public void testConstructor_fields_defaultZone() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450);
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(12, mdt.getDayOfMonth());
        Assert.assertEquals(10, mdt.getHourOfDay());
        Assert.assertEquals(15, mdt.getMinuteOfHour());
        Assert.assertEquals(30, mdt.getSecondOfMinute());
        Assert.assertEquals(450, mdt.getMillisOfSecond());
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdt.getChronology());
    }

    @Test
    public void testConstructor_fields_zone() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, PARIS);
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(12, mdt.getDayOfMonth());
        Assert.assertEquals(10, mdt.getHourOfDay());
        Assert.assertEquals(15, mdt.getMinuteOfHour());
        Assert.assertEquals(30, mdt.getSecondOfMinute());
        Assert.assertEquals(450, mdt.getMillisOfSecond());
        Assert.assertEquals(ISOChronology.getInstance(PARIS), mdt.getChronology());

        MutableDateTime mdtNull = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, (DateTimeZone) null);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNull.getChronology());
    }

    @Test
    public void testConstructor_fields_chronology() {
        Chronology chrono = GregorianChronology.getInstance(PARIS);
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, chrono);
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(5, mdt.getMonthOfYear());
        Assert.assertEquals(12, mdt.getDayOfMonth());
        Assert.assertEquals(10, mdt.getHourOfDay());
        Assert.assertEquals(15, mdt.getMinuteOfHour());
        Assert.assertEquals(30, mdt.getSecondOfMinute());
        Assert.assertEquals(450, mdt.getMillisOfSecond());
        Assert.assertEquals(chrono, mdt.getChronology());

        MutableDateTime mdtNull = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, (Chronology) null);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdtNull.getChronology());
    }

    // -----------------------------------------------------------------------
    // Rounding Tests
    // -----------------------------------------------------------------------

    @Test
    public void testRounding_gettersAndSetters() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        Assert.assertNull(mdt.getRoundingField());
        Assert.assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());

        DateTimeField minuteField = mdt.getChronology().minuteOfHour();
        mdt.setRounding(minuteField);
        Assert.assertEquals(minuteField, mdt.getRoundingField());
        Assert.assertEquals(MutableDateTime.ROUND_FLOOR, mdt.getRoundingMode());
        Assert.assertEquals(0, mdt.getSecondOfMinute());
        Assert.assertEquals(0, mdt.getMillisOfSecond());

        mdt.setRounding(null);
        Assert.assertNull(mdt.getRoundingField());
        Assert.assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test
    public void testRounding_allModes() {
        DateTimeField secField = ISOChronology.getInstanceUTC().secondOfMinute();

        // ROUND_FLOOR
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 10, 600, UTC);
        mdt.setRounding(secField, MutableDateTime.ROUND_FLOOR);
        Assert.assertEquals(10, mdt.getSecondOfMinute());
        Assert.assertEquals(0, mdt.getMillisOfSecond());

        // ROUND_CEILING
        mdt.setRounding(null, MutableDateTime.ROUND_NONE);
        mdt.setMillisOfSecond(600);
        mdt.setRounding(secField, MutableDateTime.ROUND_CEILING);
        Assert.assertEquals(11, mdt.getSecondOfMinute());
        Assert.assertEquals(0, mdt.getMillisOfSecond());

        // ROUND_HALF_FLOOR
        mdt.setRounding(null, MutableDateTime.ROUND_NONE);
        mdt.setMillisOfDay(10500); // 10.500s
        mdt.setRounding(secField, MutableDateTime.ROUND_HALF_FLOOR);
        Assert.assertEquals(10, mdt.getSecondOfMinute());

        // ROUND_HALF_CEILING
        mdt.setRounding(null, MutableDateTime.ROUND_NONE);
        mdt.setMillisOfDay(10500);
        mdt.setRounding(secField, MutableDateTime.ROUND_HALF_CEILING);
        Assert.assertEquals(11, mdt.getSecondOfMinute());

        // ROUND_HALF_EVEN
        mdt.setRounding(null, MutableDateTime.ROUND_NONE);
        mdt.setMillisOfDay(10500); // 10.500 -> round to even (10)
        mdt.setRounding(secField, MutableDateTime.ROUND_HALF_EVEN);
        Assert.assertEquals(10, mdt.getSecondOfMinute());

        mdt.setRounding(null, MutableDateTime.ROUND_NONE);
        mdt.setMillisOfDay(11500); // 11.500 -> round to even (12)
        mdt.setRounding(secField, MutableDateTime.ROUND_HALF_EVEN);
        Assert.assertEquals(12, mdt.getSecondOfMinute());

        // Mode ROUND_NONE with field
        mdt.setRounding(secField, MutableDateTime.ROUND_NONE);
        Assert.assertNull(mdt.getRoundingField());
        Assert.assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());

        // null field
        mdt.setRounding(null, MutableDateTime.ROUND_FLOOR);
        Assert.assertNull(mdt.getRoundingField());
        Assert.assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRounding_illegalModeNegative_throwsException() {
        MutableDateTime mdt = new MutableDateTime();
        mdt.setRounding(mdt.getChronology().minuteOfHour(), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRounding_illegalModeTooHigh_throwsException() {
        MutableDateTime mdt = new MutableDateTime();
        mdt.setRounding(mdt.getChronology().minuteOfHour(), 6);
    }

    // -----------------------------------------------------------------------
    // setMillis, add, setChronology, setZone
    // -----------------------------------------------------------------------

    @Test
    public void testSetMillis_long() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.setMillis(5000L);
        Assert.assertEquals(5000L, mdt.getMillis());
    }

    @Test
    public void testSetMillis_readableInstant() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        DateTime dt = new DateTime(123456L, UTC);
        mdt.setMillis(dt);
        Assert.assertEquals(123456L, mdt.getMillis());

        mdt.setMillis((ReadableInstant) null);
        Assert.assertTrue(Math.abs(System.currentTimeMillis() - mdt.getMillis()) < 2000L);
    }

    @Test
    public void testAdd_long() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add(500L);
        Assert.assertEquals(1500L, mdt.getMillis());
        mdt.add(-200L);
        Assert.assertEquals(1300L, mdt.getMillis());
    }

    @Test
    public void testAdd_readableDuration() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add(new Duration(500L));
        Assert.assertEquals(1500L, mdt.getMillis());

        mdt.add((ReadableDuration) null);
        Assert.assertEquals(1500L, mdt.getMillis());
    }

    @Test
    public void testAdd_readableDuration_scalar() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        mdt.add(new Duration(500L), 3);
        Assert.assertEquals(2500L, mdt.getMillis());

        mdt.add(new Duration(500L), -2);
        Assert.assertEquals(1500L, mdt.getMillis());

        mdt.add((ReadableDuration) null, 5);
        Assert.assertEquals(1500L, mdt.getMillis());
    }

    @Test
    public void testAdd_readablePeriod() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add(Period.days(2));
        Assert.assertEquals(3, mdt.getDayOfMonth());

        mdt.add((ReadablePeriod) null);
        Assert.assertEquals(3, mdt.getDayOfMonth());
    }

    @Test
    public void testAdd_readablePeriod_scalar() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add(Period.days(2), 3);
        Assert.assertEquals(7, mdt.getDayOfMonth());

        mdt.add(Period.days(1), -2);
        Assert.assertEquals(5, mdt.getDayOfMonth());

        mdt.add((ReadablePeriod) null, 3);
        Assert.assertEquals(5, mdt.getDayOfMonth());
    }

    @Test
    public void testSetChronology() {
        MutableDateTime mdt = new MutableDateTime(1000L, UTC);
        Chronology bChrono = BuddhistChronology.getInstance(UTC);
        mdt.setChronology(bChrono);
        Assert.assertEquals(bChrono, mdt.getChronology());

        mdt.setChronology(null);
        Assert.assertEquals(ISOChronology.getInstance(LONDON), mdt.getChronology());
    }

    @Test
    public void testSetZone() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 12, 0, 0, 0, UTC);
        long millis = mdt.getMillis();
        mdt.setZone(PARIS);
        Assert.assertEquals(PARIS, mdt.getZone());
        Assert.assertEquals(millis, mdt.getMillis());

        // Same zone
        mdt.setZone(PARIS);
        Assert.assertEquals(PARIS, mdt.getZone());

        // null zone -> default zone
        mdt.setZone(null);
        Assert.assertEquals(LONDON, mdt.getZone());
    }

    @Test
    public void testSetZoneRetainFields() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 12, 0, 0, 0, UTC);
        mdt.setZoneRetainFields(PARIS);
        Assert.assertEquals(PARIS, mdt.getZone());
        Assert.assertEquals(12, mdt.getHourOfDay());
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(1, mdt.getMonthOfYear());
        Assert.assertEquals(1, mdt.getDayOfMonth());

        // Same zone
        mdt.setZoneRetainFields(PARIS);
        Assert.assertEquals(PARIS, mdt.getZone());

        // null zone -> default zone
        mdt.setZoneRetainFields(null);
        Assert.assertEquals(LONDON, mdt.getZone());
        Assert.assertEquals(12, mdt.getHourOfDay());
    }

    // -----------------------------------------------------------------------
    // Generic set and add with DateTimeFieldType / DurationFieldType
    // -----------------------------------------------------------------------

    @Test
    public void testSet_dateTimeFieldType() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.set(DateTimeFieldType.monthOfYear(), 6);
        Assert.assertEquals(6, mdt.getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSet_nullDateTimeFieldType_throwsException() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.set(null, 5);
    }

    @Test
    public void testAdd_durationFieldType() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.add(DurationFieldType.months(), 3);
        Assert.assertEquals(4, mdt.getMonthOfYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullDurationFieldType_throwsException() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.add(null, 5);
    }

    // -----------------------------------------------------------------------
    // Direct Field Mutators (set/add for year, month, day, hour, etc.)
    // -----------------------------------------------------------------------

    @Test
    public void testYearMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setYear(2025);
        Assert.assertEquals(2025, mdt.getYear());
        mdt.addYears(3);
        Assert.assertEquals(2028, mdt.getYear());
        mdt.addYears(-5);
        Assert.assertEquals(2023, mdt.getYear());
    }

    @Test
    public void testWeekyearMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setWeekyear(2025);
        Assert.assertEquals(2025, mdt.getWeekyear());
        mdt.addWeekyears(2);
        Assert.assertEquals(2027, mdt.getWeekyear());
        mdt.addWeekyears(-3);
        Assert.assertEquals(2024, mdt.getWeekyear());
    }

    @Test
    public void testMonthOfYearMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setMonthOfYear(5);
        Assert.assertEquals(5, mdt.getMonthOfYear());
        mdt.addMonths(4);
        Assert.assertEquals(9, mdt.getMonthOfYear());
        mdt.addMonths(-2);
        Assert.assertEquals(7, mdt.getMonthOfYear());
    }

    @Test
    public void testWeekOfWeekyearMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 6, 1, 0, 0, 0, 0, UTC);
        mdt.setWeekOfWeekyear(10);
        Assert.assertEquals(10, mdt.getWeekOfWeekyear());
        mdt.addWeeks(2);
        Assert.assertEquals(12, mdt.getWeekOfWeekyear());
        mdt.addWeeks(-4);
        Assert.assertEquals(8, mdt.getWeekOfWeekyear());
    }

    @Test
    public void testDayMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setDayOfYear(50);
        Assert.assertEquals(50, mdt.getDayOfYear());

        mdt.setDayOfMonth(15);
        Assert.assertEquals(15, mdt.getDayOfMonth());

        mdt.setDayOfWeek(DateTimeConstants.FRIDAY);
        Assert.assertEquals(DateTimeConstants.FRIDAY, mdt.getDayOfWeek());

        mdt.addDays(5);
        Assert.assertEquals(DateTimeConstants.WEDNESDAY, mdt.getDayOfWeek());
    }

    @Test
    public void testHourMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setHourOfDay(14);
        Assert.assertEquals(14, mdt.getHourOfDay());
        mdt.addHours(3);
        Assert.assertEquals(17, mdt.getHourOfDay());
        mdt.addHours(-2);
        Assert.assertEquals(15, mdt.getHourOfDay());
    }

    @Test
    public void testMinuteMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setMinuteOfDay(125);
        Assert.assertEquals(125, mdt.getMinuteOfDay());
        Assert.assertEquals(2, mdt.getHourOfDay());
        Assert.assertEquals(5, mdt.getMinuteOfHour());

        mdt.setMinuteOfHour(45);
        Assert.assertEquals(45, mdt.getMinuteOfHour());

        mdt.addMinutes(20);
        Assert.assertEquals(5, mdt.getMinuteOfHour());
        Assert.assertEquals(3, mdt.getHourOfDay());
    }

    @Test
    public void testSecondMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setSecondOfDay(3665);
        Assert.assertEquals(3665, mdt.getSecondOfDay());
        Assert.assertEquals(1, mdt.getHourOfDay());
        Assert.assertEquals(1, mdt.getMinuteOfHour());
        Assert.assertEquals(5, mdt.getSecondOfMinute());

        mdt.setSecondOfMinute(30);
        Assert.assertEquals(30, mdt.getSecondOfMinute());

        mdt.addSeconds(40);
        Assert.assertEquals(10, mdt.getSecondOfMinute());
        Assert.assertEquals(2, mdt.getMinuteOfHour());
    }

    @Test
    public void testMillisMutators() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 0, 0, 0, 0, UTC);
        mdt.setMillisOfDay(5000);
        Assert.assertEquals(5000, mdt.getMillisOfDay());

        mdt.setMillisOfSecond(250);
        Assert.assertEquals(250, mdt.getMillisOfSecond());

        mdt.addMillis(500);
        Assert.assertEquals(750, mdt.getMillisOfSecond());
    }

    // -----------------------------------------------------------------------
    // setDate, setTime, setDateTime composite methods
    // -----------------------------------------------------------------------

    @Test
    public void testSetDate_long() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 20, 30, 400, UTC);
        MutableDateTime other = new MutableDateTime(2025, 6, 15, 22, 44, 55, 666, UTC);
        mdt.setDate(other.getMillis());
        Assert.assertEquals(2025, mdt.getYear());
        Assert.assertEquals(6, mdt.getMonthOfYear());
        Assert.assertEquals(15, mdt.getDayOfMonth());
        Assert.assertEquals(10, mdt.getHourOfDay());
        Assert.assertEquals(20, mdt.getMinuteOfHour());
        Assert.assertEquals(30, mdt.getSecondOfMinute());
        Assert.assertEquals(400, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetDate_readableInstant() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 20, 30, 400, UTC);
        DateTime dt = new DateTime(2025, 6, 15, 5, 0, 0, 0, PARIS);
        mdt.setDate(dt);
        Assert.assertEquals(2025, mdt.getYear());
        Assert.assertEquals(6, mdt.getMonthOfYear());
        Assert.assertEquals(15, mdt.getDayOfMonth());
        Assert.assertEquals(10, mdt.getHourOfDay());

        // Instant with no ReadableDateTime
        Instant instant = new Instant(0L);
        mdt.setDate(instant);
        Assert.assertEquals(1970, mdt.getYear());
        Assert.assertEquals(1, mdt.getMonthOfYear());
        Assert.assertEquals(1, mdt.getDayOfMonth());
    }

    @Test
    public void testSetDate_fields() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 20, 30, 400, UTC);
        mdt.setDate(2022, 11, 25);
        Assert.assertEquals(2022, mdt.getYear());
        Assert.assertEquals(11, mdt.getMonthOfYear());
        Assert.assertEquals(25, mdt.getDayOfMonth());
        Assert.assertEquals(10, mdt.getHourOfDay());
        Assert.assertEquals(20, mdt.getMinuteOfHour());
        Assert.assertEquals(30, mdt.getSecondOfMinute());
        Assert.assertEquals(400, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetTime_long() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 20, 30, 400, UTC);
        MutableDateTime other = new MutableDateTime(2025, 6, 15, 14, 25, 36, 789, UTC);
        mdt.setTime(other.getMillis());
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(1, mdt.getMonthOfYear());
        Assert.assertEquals(1, mdt.getDayOfMonth());
        Assert.assertEquals(14, mdt.getHourOfDay());
        Assert.assertEquals(25, mdt.getMinuteOfHour());
        Assert.assertEquals(36, mdt.getSecondOfMinute());
        Assert.assertEquals(789, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetTime_readableInstant() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 20, 30, 400, UTC);
        DateTime dt = new DateTime(2025, 6, 15, 14, 25, 36, 789, PARIS);
        mdt.setTime(dt);
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(1, mdt.getMonthOfYear());
        Assert.assertEquals(1, mdt.getDayOfMonth());
        Assert.assertEquals(14, mdt.getHourOfDay());
        Assert.assertEquals(25, mdt.getMinuteOfHour());
        Assert.assertEquals(36, mdt.getSecondOfMinute());
        Assert.assertEquals(789, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetTime_fields() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 20, 30, 400, UTC);
        mdt.setTime(18, 45, 12, 345);
        Assert.assertEquals(2020, mdt.getYear());
        Assert.assertEquals(1, mdt.getMonthOfYear());
        Assert.assertEquals(1, mdt.getDayOfMonth());
        Assert.assertEquals(18, mdt.getHourOfDay());
        Assert.assertEquals(45, mdt.getMinuteOfHour());
        Assert.assertEquals(12, mdt.getSecondOfMinute());
        Assert.assertEquals(345, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetDateTime_fields() {
        MutableDateTime mdt = new MutableDateTime(2020, 1, 1, 10, 20, 30, 400, UTC);
        mdt.setDateTime(2023, 7, 19, 15, 30, 45, 678);
        Assert.assertEquals(2023, mdt.getYear());
        Assert.assertEquals(7, mdt.getMonthOfYear());
        Assert.assertEquals(19, mdt.getDayOfMonth());
        Assert.assertEquals(15, mdt.getHourOfDay());
        Assert.assertEquals(30, mdt.getMinuteOfHour());
        Assert.assertEquals(45, mdt.getSecondOfMinute());
        Assert.assertEquals(678, mdt.getMillisOfSecond());
    }

    // -----------------------------------------------------------------------
    // Property getters on MutableDateTime
    // -----------------------------------------------------------------------

    @Test
    public void testProperty_generic() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        MutableDateTime.Property prop = mdt.property(DateTimeFieldType.monthOfYear());
        Assert.assertNotNull(prop);
        Assert.assertEquals(5, prop.get());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_nullType_throwsException() {
        MutableDateTime mdt = new MutableDateTime(0L, UTC);
        mdt.property(null);
    }

    @Test
    public void testAllPropertyGetters() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);

        Assert.assertNotNull(mdt.era());
        Assert.assertNotNull(mdt.centuryOfEra());
        Assert.assertNotNull(mdt.yearOfCentury());
        Assert.assertNotNull(mdt.yearOfEra());
        Assert.assertNotNull(mdt.year());
        Assert.assertNotNull(mdt.weekyear());
        Assert.assertNotNull(mdt.monthOfYear());
        Assert.assertNotNull(mdt.weekOfWeekyear());
        Assert.assertNotNull(mdt.dayOfYear());
        Assert.assertNotNull(mdt.dayOfMonth());
        Assert.assertNotNull(mdt.dayOfWeek());
        Assert.assertNotNull(mdt.hourOfDay());
        Assert.assertNotNull(mdt.minuteOfDay());
        Assert.assertNotNull(mdt.minuteOfHour());
        Assert.assertNotNull(mdt.secondOfDay());
        Assert.assertNotNull(mdt.secondOfMinute());
        Assert.assertNotNull(mdt.millisOfDay());
        Assert.assertNotNull(mdt.millisOfSecond());

        Assert.assertEquals(2020, mdt.year().get());
        Assert.assertEquals(5, mdt.monthOfYear().get());
        Assert.assertEquals(12, mdt.dayOfMonth().get());
        Assert.assertEquals(10, mdt.hourOfDay().get());
        Assert.assertEquals(15, mdt.minuteOfHour().get());
        Assert.assertEquals(30, mdt.secondOfMinute().get());
        Assert.assertEquals(450, mdt.millisOfSecond().get());
    }

    // -----------------------------------------------------------------------
    // MutableDateTime.Property Methods
    // -----------------------------------------------------------------------

    @Test
    public void testProperty_getField_getMillis_getChronology_getMutableDateTime() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        MutableDateTime.Property prop = mdt.year();

        Assert.assertEquals(mdt.getChronology().year(), prop.getField());
        Assert.assertEquals(mdt.getMillis(), prop.getMillis());
        Assert.assertEquals(mdt.getChronology(), prop.getChronology());
        Assert.assertSame(mdt, prop.getMutableDateTime());
    }

    @Test
    public void testProperty_add_int() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        MutableDateTime result = mdt.year().add(5);
        Assert.assertSame(mdt, result);
        Assert.assertEquals(2025, mdt.getYear());
    }

    @Test
    public void testProperty_add_long() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        MutableDateTime result = mdt.year().add(5L);
        Assert.assertSame(mdt, result);
        Assert.assertEquals(2025, mdt.getYear());
    }

    @Test
    public void testProperty_addWrapField() {
        MutableDateTime mdt = new MutableDateTime(2020, 12, 12, 10, 15, 30, 450, UTC);
        MutableDateTime result = mdt.monthOfYear().addWrapField(2);
        Assert.assertSame(mdt, result);
        Assert.assertEquals(2, mdt.getMonthOfYear());
        Assert.assertEquals(2020, mdt.getYear()); // year unchanged
    }

    @Test
    public void testProperty_set_int() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        MutableDateTime result = mdt.monthOfYear().set(11);
        Assert.assertSame(mdt, result);
        Assert.assertEquals(11, mdt.getMonthOfYear());
    }

    @Test
    public void testProperty_set_string() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        MutableDateTime result = mdt.monthOfYear().set("December");
        Assert.assertSame(mdt, result);
        Assert.assertEquals(12, mdt.getMonthOfYear());
    }

    @Test
    public void testProperty_set_string_locale() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        MutableDateTime result = mdt.monthOfYear().set("décembre", Locale.FRENCH);
        Assert.assertSame(mdt, result);
        Assert.assertEquals(12, mdt.getMonthOfYear());
    }

    @Test
    public void testProperty_roundings() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);

        mdt.secondOfMinute().roundFloor();
        Assert.assertEquals(0, mdt.getMillisOfSecond());
        Assert.assertEquals(30, mdt.getSecondOfMinute());

        mdt.setMillisOfSecond(600);
        mdt.secondOfMinute().roundCeiling();
        Assert.assertEquals(0, mdt.getMillisOfSecond());
        Assert.assertEquals(31, mdt.getSecondOfMinute());

        mdt.setMillisOfDay(10500); // 10s 500ms
        mdt.secondOfMinute().roundHalfFloor();
        Assert.assertEquals(10, mdt.getSecondOfMinute());

        mdt.setMillisOfDay(10500);
        mdt.secondOfMinute().roundHalfCeiling();
        Assert.assertEquals(11, mdt.getSecondOfMinute());

        mdt.setMillisOfDay(10500); // 10.5 -> round to even (10)
        mdt.secondOfMinute().roundHalfEven();
        Assert.assertEquals(10, mdt.getSecondOfMinute());

        mdt.setMillisOfDay(11500); // 11.5 -> round to even (12)
        mdt.secondOfMinute().roundHalfEven();
        Assert.assertEquals(12, mdt.getSecondOfMinute());
    }

    // -----------------------------------------------------------------------
    // Clone & Copy & Serialization & toString
    // -----------------------------------------------------------------------

    @Test
    public void testCloneAndCopy() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, PARIS);
        MutableDateTime copy = mdt.copy();
        Assert.assertNotSame(mdt, copy);
        Assert.assertEquals(mdt, copy);
        Assert.assertEquals(mdt.getMillis(), copy.getMillis());
        Assert.assertEquals(mdt.getChronology(), copy.getChronology());

        Object cloned = mdt.clone();
        Assert.assertNotSame(mdt, cloned);
        Assert.assertEquals(mdt, cloned);
        Assert.assertTrue(cloned instanceof MutableDateTime);
    }

    @Test
    public void testToString() {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, UTC);
        Assert.assertEquals("2020-05-12T10:15:30.450Z", mdt.toString());
    }

    @Test
    public void testSerialization_MutableDateTime() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, PARIS);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(mdt);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MutableDateTime result = (MutableDateTime) ois.readObject();
        ois.close();

        Assert.assertEquals(mdt, result);
        Assert.assertEquals(mdt.getMillis(), result.getMillis());
        Assert.assertEquals(mdt.getChronology(), result.getChronology());
    }

    @Test
    public void testSerialization_Property() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2020, 5, 12, 10, 15, 30, 450, PARIS);
        MutableDateTime.Property prop = mdt.dayOfMonth();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(prop);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MutableDateTime.Property result = (MutableDateTime.Property) ois.readObject();
        ois.close();

        Assert.assertEquals(prop.get(), result.get());
        Assert.assertEquals(prop.getField().getType(), result.getField().getType());
        Assert.assertEquals(prop.getMutableDateTime().getMillis(), result.getMutableDateTime().getMillis());
        Assert.assertEquals(prop.getMutableDateTime().getChronology(), result.getMutableDateTime().getChronology());
    }
}
