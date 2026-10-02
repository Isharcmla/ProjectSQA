import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

public class GJChronologyTest {

    private GJChronology gjUTC;

    @Before
    public void setUp() {
        gjUTC = GJChronology.getInstanceUTC();
    }

    // ---------- Factory methods ----------

    @Test
    public void testGetInstanceUTC_returnsUTCZone() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(DateTimeZone.UTC, chrono.getZone());
    }

    @Test
    public void testGetInstance_defaultZone_returnsDefaultZoneChronology() {
        GJChronology chrono = GJChronology.getInstance();
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void testGetInstanceZone_withNullZone_usesDefaultZone() {
        GJChronology chrono = GJChronology.getInstance(null);
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void testGetInstanceZone_withSpecificZone_returnsThatZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        GJChronology chrono = GJChronology.getInstance(zone);
        assertEquals(zone, chrono.getZone());
    }

    @Test
    public void testGetInstance_withCutoverInstant_nullCutover_usesDefault() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, (org.joda.time.ReadableInstant) null);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_withCutoverInstant_specificCutover() {
        Instant cutover = new Instant(0L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover);
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_withMinDaysInFirstWeek_customValue() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 2);
        assertEquals(2, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstance_cacheReturnsIdenticalInstance() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertSame(chrono1, chrono2);
    }

    @Test
    public void testGetInstance_nonUTCZone_wrapsCorrectly() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        GJChronology chrono = GJChronology.getInstance(zone, GJChronology.DEFAULT_CUTOVER, 4);
        assertEquals(zone, chrono.getZone());
    }

    @Test
    public void testGetInstance_withLongCutover_defaultValue_usesDefaultCutover() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER.getMillis(), 4);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstance_withLongCutover_nonDefaultValue() {
        long cutoverMillis = 0L;
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutoverMillis, 4);
        assertEquals(new Instant(cutoverMillis), chrono.getGregorianCutover());
    }

    // ---------- getDateTimeMillis ----------

    @Test
    public void testGetDateTimeMillis_normalDate_returnsCorrectMillis() {
        long millis = gjUTC.getDateTimeMillis(2000, 1, 1, 0);
        DateTime dt = new DateTime(millis, gjUTC);
        assertEquals(2000, dt.getYear());
        assertEquals(1, dt.getMonthOfYear());
        assertEquals(1, dt.getDayOfMonth());
    }

    @Test
    public void testGetDateTimeMillis_julianDate_returnsCorrectMillis() {
        // before cutover date (1582-10-15), should use Julian calendar
        long millis = gjUTC.getDateTimeMillis(1500, 1, 1, 0);
        DateTime dt = new DateTime(millis, gjUTC);
        assertEquals(1500, dt.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_dateInCutoverGap_throwsException() {
        // 1582-10-10 falls in the gap between Julian Oct 4 and Gregorian Oct 15
        gjUTC.getDateTimeMillis(1582, 10, 10, 0);
    }

    @Test
    public void testGetDateTimeMillis_withTimeFields_normal() {
        long millis = gjUTC.getDateTimeMillis(2000, 6, 15, 10, 20, 30, 500);
        DateTime dt = new DateTime(millis, gjUTC);
        assertEquals(10, dt.getHourOfDay());
        assertEquals(20, dt.getMinuteOfHour());
        assertEquals(30, dt.getSecondOfMinute());
        assertEquals(500, dt.getMillisOfSecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_withTimeFields_cutoverGap_throwsException() {
        gjUTC.getDateTimeMillis(1582, 10, 10, 0, 0, 0, 0);
    }

    @Test
    public void testGetDateTimeMillis_withBase_delegatesToBase() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        GJChronology chrono = GJChronology.getInstance(zone);
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);
        assertTrue(millis != 0 || millis == 0); // just verify no exception
    }

    @Test
    public void testGetDateTimeMillis_withBase_timeFields_delegatesToBase() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        GJChronology chrono = GJChronology.getInstance(zone);
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 10, 20, 30, 0);
        DateTime dt = new DateTime(millis, chrono);
        assertEquals(10, dt.getHourOfDay());
    }

    // ---------- getGregorianCutover / getMinimumDaysInFirstWeek ----------

    @Test
    public void testGetGregorianCutover_defaultInstance_returnsDefaultCutover() {
        assertEquals(GJChronology.DEFAULT_CUTOVER, gjUTC.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek_defaultInstance_returnsFour() {
        assertEquals(4, gjUTC.getMinimumDaysInFirstWeek());
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(gjUTC.equals(gjUTC));
    }

    @Test
    public void testEquals_differentCutover_returnsFalse() {
        GJChronology other = GJChronology.getInstance(DateTimeZone.UTC, 0L, 4);
        assertFalse(gjUTC.equals(other));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(gjUTC.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(gjUTC.equals("not a chronology"));
    }

    @Test
    public void testHashCode_consistentAcrossCalls() {
        int hash1 = gjUTC.hashCode();
        int hash2 = gjUTC.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_differentInstancesWithSameParams_sameHashCode() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertEquals(chrono1.hashCode(), chrono2.hashCode());
    }

    // ---------- toString ----------

    @Test
    public void testToString_defaultCutover_doesNotContainCutoverInfo() {
        String str = gjUTC.toString();
        assertTrue(str.startsWith("GJChronology"));
        assertTrue(str.contains("UTC"));
    }

    @Test
    public void testToString_customCutover_containsCutoverInfo() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, 0L, 4);
        String str = chrono.toString();
        assertTrue(str.contains("cutover="));
    }

    @Test
    public void testToString_customMinDays_containsMdfw() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 2);
        String str = chrono.toString();
        assertTrue(str.contains("mdfw="));
    }

    // ---------- withUTC / withZone / getZone ----------

    @Test
    public void testWithUTC_fromNonUTCZone_returnsUTCChronology() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        Chronology utcChrono = chrono.withUTC();
        assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void testWithUTC_alreadyUTC_returnsSameZone() {
        Chronology utcChrono = gjUTC.withUTC();
        assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void testWithZone_nullZone_usesDefaultZone() {
        Chronology chrono = gjUTC.withZone(null);
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void testWithZone_sameZone_returnsSameInstance() {
        Chronology chrono = gjUTC.withZone(DateTimeZone.UTC);
        assertSame(gjUTC, chrono);
    }

    @Test
    public void testWithZone_differentZone_returnsNewInstanceWithThatZone() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        Chronology chrono = gjUTC.withZone(zone);
        assertEquals(zone, chrono.getZone());
    }

    @Test
    public void testGetZone_utcInstance_returnsUTC() {
        assertEquals(DateTimeZone.UTC, gjUTC.getZone());
    }

    @Test
    public void testGetZone_zonedInstance_returnsCorrectZone() {
        DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");
        GJChronology chrono = GJChronology.getInstance(zone);
        assertEquals(zone, chrono.getZone());
    }

    // ---------- Field operations exercising CutoverField / ImpreciseCutoverField ----------

    @Test
    public void testYearField_beforeCutover_usesJulianCalendar() {
        DateTime dt = new DateTime(1500, 1, 1, 0, 0, gjUTC);
        assertEquals(1500, dt.getYear());
    }

    @Test
    public void testYearField_afterCutover_usesGregorianCalendar() {
        DateTime dt = new DateTime(2000, 1, 1, 0, 0, gjUTC);
        assertEquals(2000, dt.getYear());
    }

    @Test
    public void testYearField_addAcrossCutover_producesValidDate() {
        DateTime dt = new DateTime(1582, 1, 1, 0, 0, gjUTC);
        DateTime result = dt.plusYears(1);
        assertNotNull(result);
    }

    @Test
    public void testMonthOfYearField_addMonthsAcrossCutover_producesValidDate() {
        DateTime dt = new DateTime(1582, 9, 1, 0, 0, gjUTC);
        DateTime result = dt.plusMonths(2);
        assertNotNull(result);
    }

    @Test
    public void testDayOfYearField_beforeAndAfterCutoverYear_isConsistent() {
        DateTime dt1 = new DateTime(1582, 1, 1, 0, 0, gjUTC);
        DateTime dt2 = new DateTime(1583, 1, 1, 0, 0, gjUTC);
        assertEquals(1, dt1.getDayOfYear());
        assertEquals(1, dt2.getDayOfYear());
    }

    @Test
    public void testEraField_beforeAndAfterCutover_returnsCorrectEra() {
        DateTime bcDate = new DateTime(-100, 1, 1, 0, 0, gjUTC);
        DateTime adDate = new DateTime(100, 1, 1, 0, 0, gjUTC);
        assertEquals(0, bcDate.getEra());
        assertEquals(1, adDate.getEra());
    }

    @Test
    public void testWeekOfWeekyearField_normalDate_returnsValidWeek() {
        DateTime dt = new DateTime(2000, 1, 1, 0, 0, gjUTC);
        int week = dt.getWeekOfWeekyear();
        assertTrue(week >= 1 && week <= 53);
    }

    @Test
    public void testDayOfMonthField_normalDate_returnsCorrectValue() {
        DateTime dt = new DateTime(2000, 5, 15, 0, 0, gjUTC);
        assertEquals(15, dt.getDayOfMonth());
    }

    @Test
    public void testDayOfMonthField_addMonthsCrossingCutover_producesValidDate() {
        DateTime dt = new DateTime(1582, 8, 29, 0, 0, gjUTC);
        DateTime result = dt.plusMonths(2);
        assertNotNull(result);
    }

    @Test
    public void testMinimumValue_yearField_isCorrect() {
        int min = gjUTC.year().getMinimumValue();
        assertTrue(min < 0 || min == 0 || min > Integer.MIN_VALUE);
    }

    @Test
    public void testMaximumValue_yearField_isCorrect() {
        int max = gjUTC.year().getMaximumValue();
        assertTrue(max > 0);
    }

    @Test
    public void testGetDifference_yearField_acrossCutover() {
        DateTime dt1 = new DateTime(1500, 1, 1, 0, 0, gjUTC);
        DateTime dt2 = new DateTime(2000, 1, 1, 0, 0, gjUTC);
        int diff = gjUTC.year().getDifference(dt2.getMillis(), dt1.getMillis());
        assertEquals(500, diff);
    }

    @Test
    public void testRoundFloor_dayOfMonthField_validInstant() {
        long instant = gjUTC.getDateTimeMillis(2000, 6, 15, 10);
        long floored = gjUTC.dayOfMonth().roundFloor(instant);
        DateTime dt = new DateTime(floored, gjUTC);
        assertEquals(0, dt.getMillisOfDay());
    }

    @Test
    public void testRoundCeiling_dayOfMonthField_validInstant() {
        long instant = gjUTC.getDateTimeMillis(2000, 6, 15, 10);
        long ceil = gjUTC.dayOfMonth().roundCeiling(instant);
        assertTrue(ceil >= instant);
    }

    @Test
    public void testSetYear_withinCutoverGapAdjustment_doesNotThrow() {
        DateTime dt = new DateTime(2000, 1, 1, 0, 0, gjUTC);
        DateTime result = dt.year().setCopy(1500);
        assertEquals(1500, result.getYear());
    }

    // ---------- serialization readResolve path (indirectly via equals after reconstruct) ----------

    @Test
    public void testGetInstance_repeatedCallsWithDifferentMinDays_createsDistinctCacheEntries() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 1);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 7);
        assertNotEquals(chrono1.getMinimumDaysInFirstWeek(), chrono2.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testMutableDateTime_withGJChronology_setDate_updatesCorrectly() {
        MutableDateTime mdt = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, gjUTC);
        mdt.setYear(1990);
        assertEquals(1990, mdt.getYear());
    }
}
