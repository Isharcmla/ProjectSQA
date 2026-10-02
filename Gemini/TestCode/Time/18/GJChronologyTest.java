package org.joda.time.chrono;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.YearMonth;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GJChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Instant OCT_15_1582 = new Instant(-12219292800000L);

    private DateTimeZone originalZone;

    @Before
    public void setUp() {
        originalZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
    }

    @Test
    public void testGetInstanceUTC_notNullAndCorrectZone() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Assert.assertNotNull(chrono);
        Assert.assertEquals(DateTimeZone.UTC, chrono.getZone());
        Assert.assertEquals(OCT_15_1582, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_defaultZone() {
        DateTimeZone.setDefault(PARIS);
        GJChronology chrono = GJChronology.getInstance();
        Assert.assertNotNull(chrono);
        Assert.assertEquals(PARIS, chrono.getZone());
        Assert.assertEquals(OCT_15_1582, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_withZoneNull_usesDefault() {
        DateTimeZone.setDefault(LONDON);
        GJChronology chrono = GJChronology.getInstance((DateTimeZone) null);
        Assert.assertEquals(LONDON, chrono.getZone());
    }

    @Test
    public void testGetInstance_withZoneAndCutover() {
        Instant cutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(TOKYO, cutover);
        Assert.assertEquals(TOKYO, chrono.getZone());
        Assert.assertEquals(cutover, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_withZoneAndNullCutover_usesDefaultCutover() {
        GJChronology chrono = GJChronology.getInstance(PARIS, (Instant) null);
        Assert.assertEquals(OCT_15_1582, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_withZoneCutoverAndMinDays() {
        Instant cutover = new Instant(100000000L);
        GJChronology chrono = GJChronology.getInstance(PARIS, cutover, 6);
        Assert.assertEquals(PARIS, chrono.getZone());
        Assert.assertEquals(cutover, chrono.getGregorianCutover());
        Assert.assertEquals(6, chrono.getMinimumDaysInFirstWeek());

        // Cache hit test
        GJChronology chrono2 = GJChronology.getInstance(PARIS, cutover, 6);
        Assert.assertSame(chrono, chrono2);

        // Different min days
        GJChronology chrono3 = GJChronology.getInstance(PARIS, cutover, 7);
        Assert.assertNotSame(chrono, chrono3);

        // Different cutover
        GJChronology chrono4 = GJChronology.getInstance(PARIS, new Instant(200000000L), 6);
        Assert.assertNotSame(chrono, chrono4);
    }

    @Test
    public void testGetInstance_withLongCutover() {
        GJChronology chronoDefault = GJChronology.getInstance(
            DateTimeZone.UTC, OCT_15_1582.getMillis(), 4);
        Assert.assertEquals(OCT_15_1582, chronoDefault.getGregorianCutover());

        long customCutover = 123456789L;
        GJChronology chronoCustom = GJChronology.getInstance(
            DateTimeZone.UTC, customCutover, 5);
        Assert.assertEquals(new Instant(customCutover), chronoCustom.getGregorianCutover());
        Assert.assertEquals(5, chronoCustom.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testWithUTC_and_WithZone() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Chronology utcChrono = chrono.withUTC();
        Assert.assertEquals(DateTimeZone.UTC, utcChrono.getZone());

        Chronology sameChrono = utcChrono.withZone(DateTimeZone.UTC);
        Assert.assertSame(utcChrono, sameChrono);

        Chronology tokyoChrono = utcChrono.withZone(TOKYO);
        Assert.assertEquals(TOKYO, tokyoChrono.getZone());

        Chronology defaultZoneChrono = utcChrono.withZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), defaultZoneChrono.getZone());
    }

    @Test
    public void testGetDateTimeMillis_4params_gregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2020, 5, 10, 3600000);
        Assert.assertEquals(new DateTime(2020, 5, 10, 1, 0, 0, 0, DateTimeZone.UTC).getMillis(), millis);
    }

    @Test
    public void testGetDateTimeMillis_4params_julian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // Year 1500 is before 1582 cutover
        long millis = chrono.getDateTimeMillis(1500, 5, 10, 0);
        DateTime dt = new DateTime(millis, chrono);
        Assert.assertEquals(1500, dt.getYear());
        Assert.assertEquals(5, dt.getMonthOfYear());
        Assert.assertEquals(10, dt.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_4params_illegalCutoverGap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // Oct 5 to Oct 14, 1582 do not exist in default GJ
        chrono.getDateTimeMillis(1582, 10, 5, 0);
    }

    @Test
    public void testGetDateTimeMillis_7params_gregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2021, 12, 25, 10, 30, 45, 500);
        Assert.assertEquals(new DateTime(2021, 12, 25, 10, 30, 45, 500, DateTimeZone.UTC).getMillis(), millis);
    }

    @Test
    public void testGetDateTimeMillis_7params_julian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(1000, 1, 1, 12, 0, 0, 0);
        DateTime dt = new DateTime(millis, chrono);
        Assert.assertEquals(1000, dt.getYear());
        Assert.assertEquals(1, dt.getMonthOfYear());
        Assert.assertEquals(1, dt.getDayOfMonth());
        Assert.assertEquals(12, dt.getHourOfDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_7params_illegalCutoverGap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 10, 12, 0, 0, 0);
    }

    @Test
    public void testGetDateTimeMillis_zoned() {
        GJChronology chrono = GJChronology.getInstance(TOKYO);
        long millis4 = chrono.getDateTimeMillis(2020, 1, 1, 0);
        long millis7 = chrono.getDateTimeMillis(2020, 1, 1, 0, 0, 0, 0);
        Assert.assertEquals(millis4, millis7);
    }

    @Test
    public void testEqualsAndHashCode() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, OCT_15_1582, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, OCT_15_1582, 4);
        GJChronology chronoDiffZone = GJChronology.getInstance(PARIS, OCT_15_1582, 4);
        GJChronology chronoDiffCutover = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0L), 4);
        GJChronology chronoDiffMdfw = GJChronology.getInstance(DateTimeZone.UTC, OCT_15_1582, 5);

        Assert.assertTrue(chrono1.equals(chrono1));
        Assert.assertTrue(chrono1.equals(chrono2));
        Assert.assertFalse(chrono1.equals(null));
        Assert.assertFalse(chrono1.equals("NotAChronology"));
        Assert.assertFalse(chrono1.equals(chronoDiffZone));
        Assert.assertFalse(chrono1.equals(chronoDiffCutover));
        Assert.assertFalse(chrono1.equals(chronoDiffMdfw));

        Assert.assertEquals(chrono1.hashCode(), chrono2.hashCode());
        Assert.assertNotEquals(0, chrono1.hashCode());
    }

    @Test
    public void testToString_formats() {
        GJChronology chronoDefault = GJChronology.getInstanceUTC();
        Assert.assertEquals("GJChronology[UTC]", chronoDefault.toString());

        // Custom cutover on day boundary
        GJChronology chronoCutoverDay = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0L), 4);
        Assert.assertTrue(chronoCutoverDay.toString().contains("cutover=1970-01-01"));

        // Custom cutover with time (non-midnight)
        GJChronology chronoCutoverTime = GJChronology.getInstance(DateTimeZone.UTC, new Instant(3600000L), 4);
        Assert.assertTrue(chronoCutoverTime.toString().contains("cutover=1970-01-01T01:00:00.000Z"));

        // Custom mdfw
        GJChronology chronoMdfw = GJChronology.getInstance(DateTimeZone.UTC, OCT_15_1582, 2);
        Assert.assertTrue(chronoMdfw.toString().contains("mdfw=2"));
    }

    @Test
    public void testSerialization() throws Exception {
        GJChronology chrono = GJChronology.getInstance(PARIS, new Instant(12345678L), 5);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(chrono);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        GJChronology deserialized = (GJChronology) ois.readObject();
        ois.close();

        Assert.assertEquals(chrono.getZone(), deserialized.getZone());
        Assert.assertEquals(chrono.getGregorianCutover(), deserialized.getGregorianCutover());
        Assert.assertEquals(chrono.getMinimumDaysInFirstWeek(), deserialized.getMinimumDaysInFirstWeek());
        Assert.assertEquals(chrono, deserialized);
    }

    @Test
    public void testCutoverField_getAndText() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();

        // Julian era: 1582-10-04 (Julian)
        long julianInstant = new DateTime(1582, 10, 4, 12, 0, 0, 0, chrono).getMillis();
        Assert.assertEquals(4, dayField.get(julianInstant));
        Assert.assertEquals("4", dayField.getAsText(julianInstant, Locale.ENGLISH));
        Assert.assertEquals("4", dayField.getAsShortText(julianInstant, Locale.ENGLISH));

        // Gregorian era: 1582-10-15 (Gregorian)
        long gregorianInstant = new DateTime(1582, 10, 15, 12, 0, 0, 0, chrono).getMillis();
        Assert.assertEquals(15, dayField.get(gregorianInstant));
        Assert.assertEquals("15", dayField.getAsText(gregorianInstant, Locale.ENGLISH));
        Assert.assertEquals("15", dayField.getAsShortText(gregorianInstant, Locale.ENGLISH));

        Assert.assertEquals("15", dayField.getAsText(15, Locale.ENGLISH));
        Assert.assertEquals("15", dayField.getAsShortText(15, Locale.ENGLISH));
        Assert.assertFalse(dayField.isLenient());
    }

    @Test
    public void testCutoverField_addAndDifference() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();

        long instant = new DateTime(1582, 10, 4, 0, 0, 0, 0, chrono).getMillis();
        // Oct 4 Julian + 1 day = Oct 15 Gregorian
        long nextDay = dayField.add(instant, 1);
        DateTime dt = new DateTime(nextDay, chrono);
        Assert.assertEquals(1582, dt.getYear());
        Assert.assertEquals(10, dt.getMonthOfYear());
        Assert.assertEquals(15, dt.getDayOfMonth());

        long nextDayLong = dayField.add(instant, 1L);
        Assert.assertEquals(nextDay, nextDayLong);

        int diff = dayField.getDifference(nextDay, instant);
        Assert.assertEquals(1, diff);

        long diffLong = dayField.getDifferenceAsLong(nextDay, instant);
        Assert.assertEquals(1L, diffLong);
    }

    @Test
    public void testCutoverField_setOperations() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();

        // Set day on Gregorian side to a valid Gregorian day
        long instantGreg = new DateTime(1582, 10, 15, 0, 0, 0, 0, chrono).getMillis();
        long updatedGreg = dayField.set(instantGreg, 16);
        Assert.assertEquals(16, dayField.get(updatedGreg));

        // Set day on Julian side to a valid Julian day
        long instantJul = new DateTime(1582, 10, 4, 0, 0, 0, 0, chrono).getMillis();
        long updatedJul = dayField.set(instantJul, 3);
        Assert.assertEquals(3, dayField.get(updatedJul));

        // Set text
        long setTextGreg = dayField.set(instantGreg, "20", Locale.ENGLISH);
        Assert.assertEquals(20, dayField.get(setTextGreg));

        long setTextJul = dayField.set(instantJul, "2", Locale.ENGLISH);
        Assert.assertEquals(2, dayField.get(setTextJul));
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testCutoverField_setInvalidInCutover_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();
        long instant = new DateTime(1582, 10, 15, 0, 0, 0, 0, chrono).getMillis();
        // Setting day of month 10 in October 1582 falls into gap
        dayField.set(instant, 10);
    }

    @Test
    public void testCutoverField_minMaxValues() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();

        Assert.assertEquals(1, dayField.getMinimumValue());
        Assert.assertEquals(31, dayField.getMaximumValue());

        // Julian instant
        long julInstant = new DateTime(1582, 10, 4, 0, 0, 0, 0, chrono).getMillis();
        Assert.assertEquals(1, dayField.getMinimumValue(julInstant));
        Assert.assertEquals(4, dayField.getMaximumValue(julInstant));

        // Gregorian instant
        long gregInstant = new DateTime(1582, 10, 15, 0, 0, 0, 0, chrono).getMillis();
        Assert.assertEquals(15, dayField.getMinimumValue(gregInstant));
        Assert.assertEquals(31, dayField.getMaximumValue(gregInstant));

        // ReadablePartial min/max
        YearMonth ymCutover = new YearMonth(1582, 10, chrono);
        Assert.assertEquals(1, dayField.getMinimumValue(ymCutover));
        Assert.assertEquals(1, dayField.getMinimumValue(ymCutover, new int[] {1582, 10}));
        Assert.assertEquals(31, dayField.getMaximumValue(ymCutover));
        Assert.assertEquals(31, dayField.getMaximumValue(ymCutover, new int[] {1582, 10}));

        YearMonth ymNormal = new YearMonth(2020, 2, chrono);
        Assert.assertEquals(29, dayField.getMaximumValue(ymNormal, new int[] {2020, 2}));
    }

    @Test
    public void testCutoverField_leapAndDurationProperties() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthField = chrono.monthOfYear();
        DateTimeField dayField = chrono.dayOfMonth();

        long leapJulian = new DateTime(1500, 2, 28, 0, 0, 0, 0, chrono).getMillis();
        long nonLeapGregorian = new DateTime(1700, 2, 28, 0, 0, 0, 0, chrono).getMillis();

        Assert.assertTrue(chrono.year().isLeap(leapJulian));
        Assert.assertFalse(chrono.year().isLeap(nonLeapGregorian));
        Assert.assertEquals(1, chrono.year().getLeapAmount(leapJulian));
        Assert.assertEquals(0, chrono.year().getLeapAmount(nonLeapGregorian));
        Assert.assertNotNull(chrono.year().getLeapDurationField());

        Assert.assertNotNull(dayField.getDurationField());
        Assert.assertNotNull(dayField.getRangeDurationField());
        Assert.assertTrue(dayField.getMaximumTextLength(Locale.ENGLISH) > 0);
        Assert.assertTrue(dayField.getMaximumShortTextLength(Locale.ENGLISH) > 0);
    }

    @Test
    public void testCutoverField_roundFloorAndCeiling() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthField = chrono.monthOfYear();

        long instantGreg = new DateTime(1582, 10, 20, 15, 30, 0, 0, chrono).getMillis();
        long roundFloorGreg = monthField.roundFloor(instantGreg);
        Assert.assertEquals(new DateTime(1582, 10, 15, 0, 0, 0, 0, chrono).getMillis(), roundFloorGreg);

        long roundCeilGreg = monthField.roundCeiling(instantGreg);
        Assert.assertEquals(new DateTime(1582, 11, 1, 0, 0, 0, 0, chrono).getMillis(), roundCeilGreg);

        long instantJul = new DateTime(1582, 9, 20, 15, 30, 0, 0, chrono).getMillis();
        long roundFloorJul = monthField.roundFloor(instantJul);
        Assert.assertEquals(new DateTime(1582, 9, 1, 0, 0, 0, 0, chrono).getMillis(), roundFloorJul);

        long roundCeilJul = monthField.roundCeiling(instantJul);
        Assert.assertEquals(new DateTime(1582, 10, 1, 0, 0, 0, 0, chrono).getMillis(), roundCeilJul);
    }

    @Test
    public void testImpreciseCutoverField_addAndDifferencesCrossCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField yearField = chrono.year();

        long julInstant = new DateTime(1500, 1, 1, 0, 0, 0, 0, chrono).getMillis();
        long gregInstant = new DateTime(1600, 1, 1, 0, 0, 0, 0, chrono).getMillis();

        // Julian to Gregorian via add
        long added = yearField.add(julInstant, 100);
        Assert.assertEquals(1600, yearField.get(added));

        long addedLong = yearField.add(julInstant, 100L);
        Assert.assertEquals(added, addedLong);

        // Gregorian to Julian via add
        long subtracted = yearField.add(gregInstant, -100);
        Assert.assertEquals(1500, yearField.get(subtracted));

        long subtractedLong = yearField.add(gregInstant, -100L);
        Assert.assertEquals(subtracted, subtractedLong);

        // Differences: Julian - Gregorian and Gregorian - Julian
        int diff1 = yearField.getDifference(gregInstant, julInstant);
        Assert.assertEquals(100, diff1);
        long diff1Long = yearField.getDifferenceAsLong(gregInstant, julInstant);
        Assert.assertEquals(100L, diff1Long);

        int diff2 = yearField.getDifference(julInstant, gregInstant);
        Assert.assertEquals(-100, diff2);
        long diff2Long = yearField.getDifferenceAsLong(julInstant, gregInstant);
        Assert.assertEquals(-100L, diff2Long);

        // Both in Julian
        long julInstant2 = new DateTime(1400, 1, 1, 0, 0, 0, 0, chrono).getMillis();
        Assert.assertEquals(100, yearField.getDifference(julInstant, julInstant2));
        Assert.assertEquals(100L, yearField.getDifferenceAsLong(julInstant, julInstant2));

        // Both in Gregorian
        long gregInstant2 = new DateTime(1700, 1, 1, 0, 0, 0, 0, chrono).getMillis();
        Assert.assertEquals(100, yearField.getDifference(gregInstant2, gregInstant));
        Assert.assertEquals(100L, yearField.getDifferenceAsLong(gregInstant2, gregInstant));
    }

    @Test
    public void testImpreciseCutoverField_minMaxValues() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField yearField = chrono.year();

        long julInstant = new DateTime(1500, 1, 1, 0, 0, 0, 0, chrono).getMillis();
        long gregInstant = new DateTime(2000, 1, 1, 0, 0, 0, 0, chrono).getMillis();

        Assert.assertTrue(yearField.getMinimumValue(julInstant) < 0);
        Assert.assertTrue(yearField.getMaximumValue(julInstant) > 0);
        Assert.assertTrue(yearField.getMinimumValue(gregInstant) < 0);
        Assert.assertTrue(yearField.getMaximumValue(gregInstant) > 0);
    }

    @Test
    public void testCutoverField_addReadablePartial() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthField = chrono.dayOfMonth();

        LocalDate date = new LocalDate(2004, 2, 29, chrono);
        int[] values = new int[] {2004, 2, 29};

        // Adding 0
        int[] result0 = monthField.add(date, 0, values, 0);
        Assert.assertArrayEquals(values, result0);

        // Contiguous partial addition
        int[] resultAdd = monthField.add(date, 2, values, 1);
        Assert.assertEquals(1, resultAdd[2]); // March 1st

        // Non-contiguous partial
        MonthDay monthDay = new MonthDay(2, 29, chrono);
        int[] mdValues = new int[] {2, 29};
        int[] mdResult = chrono.dayOfMonth().add(monthDay, 1, mdValues, 1);
        Assert.assertNotNull(mdResult);
    }

    @Test
    public void testWeekyearAndWeekOfWeekyearCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTime dt = new DateTime(1582, 10, 18, 0, 0, 0, 0, chrono);

        int week = dt.getWeekOfWeekyear();
        int weekyear = dt.getWeekyear();
        Assert.assertTrue(week >= 1 && week <= 53);
        Assert.assertEquals(1582, weekyear);

        DateTime addedWeeks = dt.plusWeeks(2);
        Assert.assertEquals(dt.getMillis() + 2 * 7 * 86400000L, addedWeeks.getMillis());
    }

    @Test
    public void testDayOfYearCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTime dtBefore = new DateTime(1582, 10, 4, 0, 0, 0, 0, chrono);
        DateTime dtAfter = new DateTime(1582, 10, 15, 0, 0, 0, 0, chrono);

        Assert.assertEquals(277, dtBefore.getDayOfYear());
        Assert.assertEquals(278, dtAfter.getDayOfYear());
    }

    @Test
    public void testLinkedDurationField() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DurationField years = chrono.years();

        long start = new DateTime(1500, 1, 1, 0, 0, 0, 0, chrono).getMillis();
        long end = years.add(start, 200);
        DateTime endDt = new DateTime(end, chrono);
        Assert.assertEquals(1700, endDt.getYear());

        long endLong = years.add(start, 200L);
        Assert.assertEquals(end, endLong);

        Assert.assertEquals(200, years.getDifference(end, start));
        Assert.assertEquals(200L, years.getDifferenceAsLong(end, start));
    }

    @Test
    public void testNonMidnightCutover_createsCutoverTimeFields() {
        Instant nonMidnightCutover = new Instant(1000L * 3600 * 5); // 05:00:00
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, nonMidnightCutover, 4);

        Assert.assertNotNull(chrono.millisOfSecond());
        Assert.assertNotNull(chrono.millisOfDay());
        Assert.assertNotNull(chrono.secondOfMinute());
        Assert.assertNotNull(chrono.secondOfDay());
        Assert.assertNotNull(chrono.minuteOfHour());
        Assert.assertNotNull(chrono.minuteOfDay());
        Assert.assertNotNull(chrono.hourOfDay());
        Assert.assertNotNull(chrono.hourOfHalfday());
        Assert.assertNotNull(chrono.clockhourOfDay());
        Assert.assertNotNull(chrono.clockhourOfHalfday());
        Assert.assertNotNull(chrono.halfdayOfDay());

        DateTime dt = new DateTime(1970, 1, 1, 4, 0, 0, 0, chrono);
        Assert.assertEquals(4, dt.getHourOfDay());
    }

    @Test
    public void testEraAndCenturiesFields() {
        GJChronology chrono = GJChronology.getInstanceUTC();

        DateTime bce = new DateTime(-500, 6, 1, 0, 0, 0, 0, chrono);
        Assert.assertEquals(0, bce.getEra());
        Assert.assertEquals(501, bce.getYearOfEra());

        DateTime ce = new DateTime(2020, 6, 1, 0, 0, 0, 0, chrono);
        Assert.assertEquals(1, ce.getEra());
        Assert.assertEquals(20, ce.getCenturyOfEra());
        Assert.assertEquals(20, ce.getYearOfCentury());

        DateTime weekCentury = new DateTime(2020, 1, 1, 0, 0, 0, 0, chrono);
        Assert.assertTrue(chrono.weekyearOfCentury().get(weekCentury.getMillis()) >= 0);
    }
}
