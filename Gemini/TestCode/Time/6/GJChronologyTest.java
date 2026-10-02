package org.joda.time.chrono;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.YearMonthDay;
import org.junit.Assert;
import org.junit.Test;

public class GJChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Instant CUTOVER_1582 = new Instant(-12219292800000L);

    @Test
    public void testGetInstanceUTC_notNullAndCorrectZone() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Assert.assertNotNull(chrono);
        Assert.assertEquals(DateTimeZone.UTC, chrono.getZone());
        Assert.assertEquals(CUTOVER_1582, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_defaultZone() {
        GJChronology chrono = GJChronology.getInstance();
        Assert.assertNotNull(chrono);
        Assert.assertEquals(DateTimeZone.getDefault(), chrono.getZone());
        Assert.assertEquals(CUTOVER_1582, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_zone() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Assert.assertNotNull(chrono);
        Assert.assertEquals(PARIS, chrono.getZone());

        GJChronology chronoNull = GJChronology.getInstance((DateTimeZone) null);
        Assert.assertEquals(DateTimeZone.getDefault(), chronoNull.getZone());
    }

    @Test
    public void testGetInstance_zoneAndCutover() {
        Instant cutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(LONDON, cutover);
        Assert.assertEquals(LONDON, chrono.getZone());
        Assert.assertEquals(cutover, chrono.getGregorianCutover());

        GJChronology chronoNullCutover = GJChronology.getInstance(LONDON, (Instant) null);
        Assert.assertEquals(CUTOVER_1582, chronoNullCutover.getGregorianCutover());
    }

    @Test
    public void testGetInstance_zoneCutoverMinDays() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, CUTOVER_1582, 3);
        Assert.assertEquals(3, chrono.getMinimumDaysInFirstWeek());

        GJChronology cached = GJChronology.getInstance(DateTimeZone.UTC, CUTOVER_1582, 3);
        Assert.assertSame(chrono, cached);

        GJChronology chronoZoned = GJChronology.getInstance(PARIS, CUTOVER_1582, 3);
        Assert.assertEquals(PARIS, chronoZoned.getZone());
        Assert.assertEquals(3, chronoZoned.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_longCutover() {
        GJChronology chronoDefault = GJChronology.getInstance(DateTimeZone.UTC, CUTOVER_1582.getMillis(), 4);
        Assert.assertEquals(CUTOVER_1582, chronoDefault.getGregorianCutover());

        GJChronology chronoCustom = GJChronology.getInstance(DateTimeZone.UTC, 0L, 4);
        Assert.assertEquals(new Instant(0L), chronoCustom.getGregorianCutover());
    }

    @Test
    public void testWithUTC() {
        GJChronology chrono = GJChronology.getInstance(PARIS);
        Chronology utcChrono = chrono.withUTC();
        Assert.assertEquals(DateTimeZone.UTC, utcChrono.getZone());

        Chronology sameUTC = GJChronology.getInstanceUTC().withUTC();
        Assert.assertSame(GJChronology.getInstanceUTC(), sameUTC);
    }

    @Test
    public void testWithZone() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Chronology zoned = chrono.withZone(PARIS);
        Assert.assertEquals(PARIS, zoned.getZone());

        Chronology same = chrono.withZone(DateTimeZone.UTC);
        Assert.assertSame(chrono, same);

        Chronology defZone = chrono.withZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), defZone.getZone());
    }

    @Test
    public void testGetDateTimeMillis_4params_validDates() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long greg = chrono.getDateTimeMillis(2020, 5, 10, 12345);
        Assert.assertTrue(greg > 0);

        long julian = chrono.getDateTimeMillis(1500, 5, 10, 12345);
        Assert.assertTrue(julian < CUTOVER_1582.getMillis());

        GJChronology zoned = GJChronology.getInstance(PARIS);
        long zonedMillis = zoned.getDateTimeMillis(2020, 5, 10, 12345);
        Assert.assertTrue(zonedMillis > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_4params_cutoverGap_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 5, 0);
    }

    @Test
    public void testGetDateTimeMillis_7params_validDates() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long greg = chrono.getDateTimeMillis(2020, 5, 10, 10, 20, 30, 40);
        Assert.assertTrue(greg > 0);

        long julian = chrono.getDateTimeMillis(1500, 5, 10, 10, 20, 30, 40);
        Assert.assertTrue(julian < CUTOVER_1582.getMillis());

        long julianLeap = chrono.getDateTimeMillis(1500, 2, 29, 12, 0, 0, 0);
        Assert.assertTrue(julianLeap < CUTOVER_1582.getMillis());

        GJChronology zoned = GJChronology.getInstance(PARIS);
        long zonedMillis = zoned.getDateTimeMillis(2020, 5, 10, 10, 20, 30, 40);
        Assert.assertTrue(zonedMillis > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_7params_cutoverGap_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 10, 12, 0, 0, 0);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis_7params_gregorianInvalidLeap_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1900, 2, 29, 12, 0, 0, 0);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis_7params_invalidMonth_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(2020, 13, 10, 12, 0, 0, 0);
    }

    @Test
    public void testEqualsAndHashCode() {
        GJChronology c1 = GJChronology.getInstance(PARIS, CUTOVER_1582, 4);
        GJChronology c2 = GJChronology.getInstance(PARIS, CUTOVER_1582, 4);
        GJChronology c3 = GJChronology.getInstance(LONDON, CUTOVER_1582, 4);
        GJChronology c4 = GJChronology.getInstance(PARIS, new Instant(0L), 4);
        GJChronology c5 = GJChronology.getInstance(PARIS, CUTOVER_1582, 3);

        Assert.assertEquals(c1, c1);
        Assert.assertEquals(c1, c2);
        Assert.assertEquals(c1.hashCode(), c2.hashCode());

        Assert.assertNotEquals(c1, c3);
        Assert.assertNotEquals(c1, c4);
        Assert.assertNotEquals(c1, c5);
        Assert.assertNotEquals(c1, null);
        Assert.assertNotEquals(c1, "other object");
    }

    @Test
    public void testToString() {
        GJChronology c1 = GJChronology.getInstanceUTC();
        Assert.assertEquals("GJChronology[UTC]", c1.toString());

        GJChronology c2 = GJChronology.getInstance(PARIS, new Instant(0L), 3);
        Assert.assertEquals("GJChronology[Europe/Paris,cutover=1970-01-01,mdfw=3]", c2.toString());

        GJChronology c3 = GJChronology.getInstance(DateTimeZone.UTC, new Instant(12345L), 4);
        Assert.assertTrue(c3.toString().contains("cutover=1970-01-01T00:00:12.345Z"));
    }

    @Test
    public void testSerialization() throws Exception {
        GJChronology chrono = GJChronology.getInstance(PARIS, new Instant(100000L), 3);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(chrono);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        GJChronology deserialized = (GJChronology) ois.readObject();
        ois.close();

        Assert.assertEquals(chrono, deserialized);
        Assert.assertEquals(chrono.getZone(), deserialized.getZone());
        Assert.assertEquals(chrono.getGregorianCutover(), deserialized.getGregorianCutover());
        Assert.assertEquals(chrono.getMinimumDaysInFirstWeek(), deserialized.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testCutoverField_getAndText() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long preCutover = chrono.getDateTimeMillis(1500, 6, 15, 0);
        long postCutover = chrono.getDateTimeMillis(2000, 6, 15, 0);

        DateTimeField monthField = chrono.monthOfYear();
        Assert.assertFalse(monthField.isLenient());
        Assert.assertEquals(6, monthField.get(preCutover));
        Assert.assertEquals(6, monthField.get(postCutover));

        Assert.assertEquals("June", monthField.getAsText(preCutover, Locale.ENGLISH));
        Assert.assertEquals("June", monthField.getAsText(postCutover, Locale.ENGLISH));
        Assert.assertEquals("June", monthField.getAsText(6, Locale.ENGLISH));

        Assert.assertEquals("Jun", monthField.getAsShortText(preCutover, Locale.ENGLISH));
        Assert.assertEquals("Jun", monthField.getAsShortText(postCutover, Locale.ENGLISH));
        Assert.assertEquals("Jun", monthField.getAsShortText(6, Locale.ENGLISH));

        Assert.assertTrue(monthField.getMaximumTextLength(Locale.ENGLISH) > 0);
        Assert.assertTrue(monthField.getMaximumShortTextLength(Locale.ENGLISH) > 0);
    }

    @Test
    public void testCutoverField_addAndSet() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();

        long post = chrono.getDateTimeMillis(2000, 1, 1, 0);
        long added = dayField.add(post, 5);
        Assert.assertEquals(6, dayField.get(added));

        long addedLong = dayField.add(post, 10L);
        Assert.assertEquals(11, dayField.get(addedLong));

        long setPost = dayField.set(post, 15);
        Assert.assertEquals(15, dayField.get(setPost));

        long pre = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long setPre = dayField.set(pre, 20);
        Assert.assertEquals(20, dayField.get(setPre));

        long setTextPost = dayField.set(post, "25", Locale.ENGLISH);
        Assert.assertEquals(25, dayField.get(setTextPost));

        long setTextPre = dayField.set(pre, "25", Locale.ENGLISH);
        Assert.assertEquals(25, dayField.get(setTextPre));

        long crossToJulian = dayField.set(CUTOVER_1582.getMillis() + 86400000L, 1);
        Assert.assertTrue(crossToJulian < CUTOVER_1582.getMillis());

        long crossToGregorian = dayField.set(CUTOVER_1582.getMillis() - 86400000L * 20, 20);
        Assert.assertTrue(crossToGregorian >= CUTOVER_1582.getMillis());
    }

    @Test
    public void testCutoverField_addReadablePartial() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthField = chrono.monthOfYear();

        YearMonthDay ymd = new YearMonthDay(2004, 2, 29, chrono);
        int[] values = monthField.add(ymd, 1, new int[]{2004, 2, 29}, 48);
        Assert.assertEquals(2008, values[0]);
        Assert.assertEquals(2, values[1]);
        Assert.assertEquals(29, values[2]);

        int[] zeroAdd = monthField.add(ymd, 1, new int[]{2004, 2, 29}, 0);
        Assert.assertArrayEquals(new int[]{2004, 2, 29}, zeroAdd);
    }

    @Test
    public void testCutoverField_differenceAndLeap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();
        long t1 = chrono.getDateTimeMillis(2020, 1, 10, 0);
        long t2 = chrono.getDateTimeMillis(2020, 1, 1, 0);

        Assert.assertEquals(9, dayField.getDifference(t1, t2));
        Assert.assertEquals(9L, dayField.getDifferenceAsLong(t1, t2));

        DateTimeField yearField = chrono.year();
        long leapJulian = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long nonLeapGreg = chrono.getDateTimeMillis(1900, 1, 1, 0);

        Assert.assertTrue(yearField.isLeap(leapJulian));
        Assert.assertFalse(yearField.isLeap(nonLeapGreg));
        Assert.assertEquals(1, yearField.getLeapAmount(leapJulian));
        Assert.assertEquals(0, yearField.getLeapAmount(nonLeapGreg));
        Assert.assertNotNull(yearField.getLeapDurationField());
    }

    @Test
    public void testCutoverField_minMaxValues() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayField = chrono.dayOfMonth();

        Assert.assertEquals(1, dayField.getMinimumValue());
        Assert.assertEquals(31, dayField.getMaximumValue());

        YearMonthDay ymd = new YearMonthDay(2020, 2, 15, chrono);
        Assert.assertEquals(1, dayField.getMinimumValue(ymd));
        Assert.assertEquals(1, dayField.getMinimumValue(ymd, new int[]{2020, 2, 15}));
        Assert.assertEquals(29, dayField.getMaximumValue(ymd));
        Assert.assertEquals(29, dayField.getMaximumValue(ymd, new int[]{2020, 2, 15}));

        long pre = chrono.getDateTimeMillis(1500, 2, 1, 0);
        long post = chrono.getDateTimeMillis(2020, 2, 1, 0);

        Assert.assertEquals(1, dayField.getMinimumValue(pre));
        Assert.assertEquals(1, dayField.getMinimumValue(post));
        Assert.assertEquals(29, dayField.getMaximumValue(pre));
        Assert.assertEquals(29, dayField.getMaximumValue(post));

        long nearCutover = CUTOVER_1582.getMillis();
        Assert.assertEquals(15, dayField.getMinimumValue(nearCutover));

        long justBeforeCutover = CUTOVER_1582.getMillis() - 86400000L;
        Assert.assertEquals(4, dayField.getMaximumValue(justBeforeCutover));
    }

    @Test
    public void testCutoverField_roundFloorAndCeiling() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField yearField = chrono.year();

        long post = chrono.getDateTimeMillis(2020, 6, 15, 12, 0, 0, 0);
        long pre = chrono.getDateTimeMillis(1500, 6, 15, 12, 0, 0, 0);

        Assert.assertEquals(chrono.getDateTimeMillis(2020, 1, 1, 0), yearField.roundFloor(post));
        Assert.assertEquals(chrono.getDateTimeMillis(1500, 1, 1, 0), yearField.roundFloor(pre));
        Assert.assertEquals(chrono.getDateTimeMillis(2021, 1, 1, 0), yearField.roundCeiling(post));
        Assert.assertEquals(chrono.getDateTimeMillis(1501, 1, 1, 0), yearField.roundCeiling(pre));

        long justAfterCutover = CUTOVER_1582.getMillis() + 86400000L * 2;
        long floorCutover = yearField.roundFloor(justAfterCutover);
        Assert.assertTrue(floorCutover < CUTOVER_1582.getMillis());

        long justBefore = CUTOVER_1582.getMillis() - 86400000L * 100;
        long ceilCutover = yearField.roundCeiling(justBefore);
        Assert.assertTrue(ceilCutover >= CUTOVER_1582.getMillis());
    }

    @Test
    public void testCutoverField_conversionsByWeekyear() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField weekyearField = chrono.weekyear();

        long post = chrono.getDateTimeMillis(2020, 6, 15, 0);
        long julianEq = chrono.gregorianToJulianByWeekyear(post);
        long backToGreg = chrono.julianToGregorianByWeekyear(julianEq);
        Assert.assertEquals(post, backToGreg);

        long pre = chrono.getDateTimeMillis(1500, 6, 15, 0);
        long gregEq = chrono.julianToGregorianByWeekyear(pre);
        long backToJulian = chrono.gregorianToJulianByWeekyear(gregEq);
        Assert.assertEquals(pre, backToJulian);

        Assert.assertNotNull(weekyearField.getDurationField());
        Assert.assertNull(weekyearField.getRangeDurationField());
    }

    @Test
    public void testImpreciseCutoverField_addAndDifferenceAcrossCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField yearField = chrono.year();

        long pre = chrono.getDateTimeMillis(1580, 1, 1, 0);
        long addedAcross = yearField.add(pre, 10);
        Assert.assertEquals(1590, yearField.get(addedAcross));

        long addedAcrossLong = yearField.add(pre, 10L);
        Assert.assertEquals(1590, yearField.get(addedAcrossLong));

        long backAcross = yearField.add(addedAcross, -10);
        Assert.assertEquals(1580, yearField.get(backAcross));

        long backAcrossLong = yearField.add(addedAcross, -10L);
        Assert.assertEquals(1580, yearField.get(backAcrossLong));

        Assert.assertEquals(10, yearField.getDifference(addedAcross, pre));
        Assert.assertEquals(10L, yearField.getDifferenceAsLong(addedAcross, pre));
        Assert.assertEquals(-10, yearField.getDifference(pre, addedAcross));
        Assert.assertEquals(-10L, yearField.getDifferenceAsLong(pre, addedAcross));

        long post1 = chrono.getDateTimeMillis(2000, 1, 1, 0);
        long post2 = chrono.getDateTimeMillis(2010, 1, 1, 0);
        Assert.assertEquals(10, yearField.getDifference(post2, post1));
        Assert.assertEquals(10L, yearField.getDifferenceAsLong(post2, post1));

        long pre1 = chrono.getDateTimeMillis(1400, 1, 1, 0);
        long pre2 = chrono.getDateTimeMillis(1410, 1, 1, 0);
        Assert.assertEquals(10, yearField.getDifference(pre2, pre1));
        Assert.assertEquals(10L, yearField.getDifferenceAsLong(pre2, pre1));

        Assert.assertEquals(yearField.getMinimumValue(post1), yearField.getMinimumValue(pre1));
        Assert.assertEquals(yearField.getMaximumValue(post1), yearField.getMaximumValue(pre1));
    }

    @Test
    public void testLinkedDurationField() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DurationField yearsField = chrono.years();

        long pre = chrono.getDateTimeMillis(1580, 1, 1, 0);
        long post = yearsField.add(pre, 10);
        Assert.assertEquals(1590, chrono.year().get(post));

        long postLong = yearsField.add(pre, 10L);
        Assert.assertEquals(1590, chrono.year().get(postLong));

        Assert.assertEquals(10, yearsField.getDifference(post, pre));
        Assert.assertEquals(10L, yearsField.getDifferenceAsLong(post, pre));
    }

    @Test
    public void testTimeOfDayCutoverFields() {
        Instant cutoverTime = new Instant(CUTOVER_1582.getMillis() + 3600000L * 12 + 1234L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutoverTime, 4);

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
        Assert.assertNotNull(chrono.era());
        Assert.assertNotNull(chrono.centuryOfEra());
        Assert.assertNotNull(chrono.centuries());
        Assert.assertNotNull(chrono.yearOfCentury());
        Assert.assertNotNull(chrono.yearOfEra());
        Assert.assertNotNull(chrono.weekyearOfCentury());

        long testInstant = cutoverTime.getMillis();
        Assert.assertEquals(12, chrono.hourOfDay().get(testInstant));
        Assert.assertEquals(1, chrono.era().get(testInstant));
    }

    @Test
    public void testCutoverGapDurationConversions() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long cutover = chrono.getGregorianCutover().getMillis();

        long julianEq = chrono.gregorianToJulianByYear(cutover);
        long backToGreg = chrono.julianToGregorianByYear(julianEq);
        Assert.assertEquals(cutover, backToGreg);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testCutoverField_set_invalidJulianCross_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.getDateTimeMillis(1582, 10, 4, 0);
        chrono.dayOfMonth().set(instant, 10);
    }
}
