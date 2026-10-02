package org.joda.time.chrono;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;

public class GJChronologyTest {

    //-----------------------------------------------------------------------
    // Factory methods
    //-----------------------------------------------------------------------

    @Test
    public void testGetInstanceUTC_returnsUTCZone() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(DateTimeZone.UTC, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_defaultZone_notNull() {
        GJChronology chrono = GJChronology.getInstance();
        assertNotNull(chrono);
        assertNotNull(chrono.getZone());
    }

    @Test
    public void testGetInstance_withZone_normal() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        GJChronology chrono = GJChronology.getInstance(zone);
        assertEquals(zone, chrono.getZone());
    }

    @Test
    public void testGetInstance_withNullZone_usesDefault() {
        GJChronology chrono = GJChronology.getInstance((DateTimeZone) null);
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void testGetInstance_withCutoverInstant() {
        Instant cutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover);
        assertEquals(cutover, chrono.getGregorianCutover());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_withCutoverAndMinDays() {
        Instant cutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover, 7);
        assertEquals(cutover, chrono.getGregorianCutover());
        assertEquals(7, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_withNullCutoverInstant_usesDefault() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, (org.joda.time.ReadableInstant) null, 4);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_longCutoverEqualsDefault_usesNullInternally() {
        long defaultMillis = GJChronology.DEFAULT_CUTOVER.getMillis();
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, defaultMillis, 4);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_longCutoverDifferentFromDefault() {
        long customMillis = 0L;
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, customMillis, 4);
        assertEquals(customMillis, chrono.getGregorianCutover().getMillis());
    }

    @Test
    public void testGetInstance_caching_returnsSameInstance() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC);
        assertSame(chrono1, chrono2);
    }

    @Test
    public void testGetInstance_nonUTCZone_cachingReturnsSameInstance() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        GJChronology chrono1 = GJChronology.getInstance(zone, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(zone, GJChronology.DEFAULT_CUTOVER, 4);
        assertSame(chrono1, chrono2);
    }

    //-----------------------------------------------------------------------
    // withUTC / withZone
    //-----------------------------------------------------------------------

    @Test
    public void testWithUTC_returnsUTCChronology() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forOffsetHours(5));
        Chronology utcChrono = chrono.withUTC();
        assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void testWithZone_nullZone_usesDefault() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Chronology result = chrono.withZone(null);
        assertEquals(DateTimeZone.getDefault(), result.getZone());
    }

    @Test
    public void testWithZone_sameZone_returnsThis() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        Chronology result = chrono.withZone(DateTimeZone.UTC);
        assertSame(chrono, result);
    }

    @Test
    public void testWithZone_differentZone_returnsDifferentChronology() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeZone otherZone = DateTimeZone.forOffsetHours(4);
        Chronology result = chrono.withZone(otherZone);
        assertEquals(otherZone, result.getZone());
    }

    //-----------------------------------------------------------------------
    // getDateTimeMillis (4-arg)
    //-----------------------------------------------------------------------

    @Test
    public void testGetDateTimeMillis_4arg_normalAfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(2000, chrono.year().get(millis));
    }

    @Test
    public void testGetDateTimeMillis_4arg_normalBeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(1500, 1, 1, 0);
        assertEquals(1500, chrono.year().get(millis));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_4arg_cutoverGap_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 10, 0);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis_4arg_invalidFeb29AfterCutover_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // 1900 is not leap in Gregorian calendar, and it's after the default cutover (1582).
        chrono.getDateTimeMillis(1900, 2, 29, 0);
    }

    //-----------------------------------------------------------------------
    // getDateTimeMillis (7-arg)
    //-----------------------------------------------------------------------

    @Test
    public void testGetDateTimeMillis_7arg_normalAfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 6, 15, 10, 30, 15, 500);
        assertEquals(2000, chrono.year().get(millis));
        assertEquals(6, chrono.monthOfYear().get(millis));
        assertEquals(15, chrono.dayOfMonth().get(millis));
    }

    @Test
    public void testGetDateTimeMillis_7arg_normalBeforeCutover_febNonLeap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // 1500 is leap in Julian calendar (every 4 years) and before cutover (1582).
        long millis = chrono.getDateTimeMillis(1500, 2, 29, 0, 0, 0, 0);
        assertEquals(1500, chrono.year().get(millis));
        assertEquals(2, chrono.monthOfYear().get(millis));
        assertEquals(29, chrono.dayOfMonth().get(millis));
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis_7arg_invalidFeb29AfterCutover_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // 1900 is not leap in Gregorian calendar and it's after cutover.
        chrono.getDateTimeMillis(1900, 2, 29, 0, 0, 0, 0);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis_7arg_invalidMonth_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(2000, 13, 1, 0, 0, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_7arg_cutoverGap_throwsException() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        chrono.getDateTimeMillis(1582, 10, 10, 5, 0, 0, 0);
    }

    //-----------------------------------------------------------------------
    // getGregorianCutover / getMinimumDaysInFirstWeek
    //-----------------------------------------------------------------------

    @Test
    public void testGetGregorianCutover_defaultValue() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek_customValue() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 7);
        assertEquals(7, chrono.getMinimumDaysInFirstWeek());
    }

    //-----------------------------------------------------------------------
    // equals / hashCode
    //-----------------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertTrue(chrono.equals(chrono));
    }

    @Test
    public void testEquals_equivalentInstances_returnsTrue() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertTrue(chrono1.equals(chrono2));
    }

    @Test
    public void testEquals_differentZone_returnsFalse() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.forOffsetHours(6));
        assertFalse(chrono1.equals(chrono2));
    }

    @Test
    public void testEquals_differentMinDays_returnsFalse() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 7);
        assertFalse(chrono1.equals(chrono2));
    }

    @Test
    public void testEquals_differentCutover_returnsFalse() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0L), 4);
        assertFalse(chrono1.equals(chrono2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertFalse(chrono.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertFalse(chrono.equals("not a chronology"));
    }

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertEquals(chrono1.hashCode(), chrono2.hashCode());
    }

    //-----------------------------------------------------------------------
    // toString
    //-----------------------------------------------------------------------

    @Test
    public void testToString_defaultCutoverUTC() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        String str = chrono.toString();
        assertTrue(str.startsWith("GJChronology["));
        assertTrue(str.contains("UTC"));
    }

    @Test
    public void testToString_customCutoverAndMinDays() {
        Instant cutover = new Instant(0L); // epoch, midnight UTC
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover, 7);
        String str = chrono.toString();
        assertTrue(str.contains("cutover="));
        assertTrue(str.contains("mdfw=7"));
    }

    //-----------------------------------------------------------------------
    // Field behaviour (CutoverField / ImpreciseCutoverField) via public API
    //-----------------------------------------------------------------------

    @Test
    public void testYearField_get_beforeAndAfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long before = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long after = chrono.getDateTimeMillis(1600, 1, 1, 0);
        assertEquals(1500, chrono.year().get(before));
        assertEquals(1600, chrono.year().get(after));
    }

    @Test
    public void testYearField_add_crossesCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long before = chrono.getDateTimeMillis(1580, 1, 1, 0);
        long result = chrono.year().add(before, 200);
        assertEquals(1780, chrono.year().get(result));
    }

    @Test
    public void testEraField_get_beforeAndAfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long before = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long after = chrono.getDateTimeMillis(1600, 1, 1, 0);
        assertEquals(DateTimeConstants.CE, chrono.era().get(before));
        assertEquals(DateTimeConstants.CE, chrono.era().get(after));
    }

    @Test
    public void testDayOfYearField_get_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(1, chrono.dayOfYear().get(millis));
    }

    @Test
    public void testWeekOfWeekyearField_get_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        int week = chrono.weekOfWeekyear().get(millis);
        assertTrue(week >= 1 && week <= 53);
    }

    @Test
    public void testWeekyearField_get_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        int weekyear = chrono.weekyear().get(millis);
        assertTrue(weekyear == 1999 || weekyear == 2000);
    }

    @Test
    public void testMonthOfYearField_get_beforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(1500, 6, 1, 0);
        assertEquals(6, chrono.monthOfYear().get(millis));
    }

    @Test
    public void testDayOfMonthField_get_beforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(1500, 6, 15, 0);
        assertEquals(15, chrono.dayOfMonth().get(millis));
    }

    @Test
    public void testHourOfDayField_get_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 10, 30, 15, 0);
        assertEquals(10, chrono.hourOfDay().get(millis));
    }

    @Test
    public void testMillisOfDayField_get_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0, 0, 0, 123);
        assertEquals(123, chrono.millisOfDay().get(millis));
    }

    @Test
    public void testCenturyOfEraField_get_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(20, chrono.centuryOfEra().get(millis));
    }

    @Test
    public void testYearOfEraField_get_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(2000, chrono.yearOfEra().get(millis));
    }

    @Test
    public void testMonthOfYearField_getMaximumValue_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(12, chrono.monthOfYear().getMaximumValue(millis));
    }

    @Test
    public void testDayOfMonthField_getMinimumValue_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals(1, chrono.dayOfMonth().getMinimumValue());
    }

    @Test
    public void testYearField_set_normal() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        long result = chrono.year().set(millis, 1999);
        assertEquals(1999, chrono.year().get(result));
    }

    @Test
    public void testMonthOfYearField_set_crossesCutoverYear() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long millis = chrono.getDateTimeMillis(1700, 6, 1, 0);
        long result = chrono.monthOfYear().set(millis, 3);
        assertEquals(3, chrono.monthOfYear().get(result));
    }

    //-----------------------------------------------------------------------
    // Serialization singleton behaviour (via getInstance equivalence)
    //-----------------------------------------------------------------------

    @Test
    public void testGetInstance_withSpecificMinDays_sameAsReadResolveEquivalent() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 6);
        GJChronology chrono2 = GJChronology.getInstance(chrono1.getZone(), chrono1.getGregorianCutover(), chrono1.getMinimumDaysInFirstWeek());
        assertSame(chrono1, chrono2);
    }
}
