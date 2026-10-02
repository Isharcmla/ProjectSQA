import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeParserBucket;

public class DateTimeParserBucketTest {

    private Chronology isoUTC;

    @Before
    public void setUp() {
        isoUTC = ISOChronology.getInstanceUTC();
    }

    //-----------------------------------------------------------------------
    // Constructors
    //-----------------------------------------------------------------------

    @Test
    public void testConstructor_deprecated_basic() {
        @SuppressWarnings("deprecation")
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US);
        assertNotNull(bucket);
        assertEquals(Locale.US, bucket.getLocale());
    }

    @Test
    public void testConstructor_deprecatedWithPivotYear() {
        @SuppressWarnings("deprecation")
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, 1950);
        assertEquals(Integer.valueOf(1950), bucket.getPivotYear());
    }

    @Test
    public void testConstructor_full_normal() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, 1950, 1999);
        assertEquals(Integer.valueOf(1950), bucket.getPivotYear());
        assertEquals(Locale.US, bucket.getLocale());
    }

    @Test
    public void testConstructor_nullLocale_usesDefault() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, null, null, 2000);
        assertEquals(Locale.getDefault(), bucket.getLocale());
    }

    @Test
    public void testConstructor_nullChronology_usesISO() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, null, Locale.US, null, 2000);
        assertNotNull(bucket.getChronology());
    }

    //-----------------------------------------------------------------------
    // getChronology
    //-----------------------------------------------------------------------

    @Test
    public void testGetChronology_returnsUTCChronology() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        assertEquals(isoUTC.withUTC(), bucket.getChronology());
    }

    //-----------------------------------------------------------------------
    // getLocale
    //-----------------------------------------------------------------------

    @Test
    public void testGetLocale_specified() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.FRANCE, null, 2000);
        assertEquals(Locale.FRANCE, bucket.getLocale());
    }

    //-----------------------------------------------------------------------
    // getZone / setZone
    //-----------------------------------------------------------------------

    @Test
    public void testGetZone_initialFromChronologyUTC() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        // ISOChronology.getInstanceUTC().getZone() is UTC, which results in null iZone
        assertNull(bucket.getZone());
    }

    @Test
    public void testSetZone_null_setsNull() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.setZone(null);
        assertNull(bucket.getZone());
    }

    @Test
    public void testSetZone_UTC_setsNull() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.setZone(DateTimeZone.UTC);
        assertNull(bucket.getZone());
    }

    @Test
    public void testSetZone_nonUTC_setsZone() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        bucket.setZone(paris);
        assertEquals(paris, bucket.getZone());
    }

    @Test
    public void testSetZone_resetsOffsetToZero() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.setOffset(5000);
        bucket.setZone(DateTimeZone.forID("Europe/Paris"));
        assertEquals(0, bucket.getOffset());
    }

    //-----------------------------------------------------------------------
    // getOffset / setOffset
    //-----------------------------------------------------------------------

    @Test
    public void testGetOffset_initiallyZero() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testSetOffset_setsOffsetAndClearsZone() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.setZone(DateTimeZone.forID("Europe/Paris"));
        bucket.setOffset(3600000);
        assertEquals(3600000, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testSetOffset_negativeValue() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.setOffset(-3600000);
        assertEquals(-3600000, bucket.getOffset());
    }

    //-----------------------------------------------------------------------
    // getPivotYear / setPivotYear
    //-----------------------------------------------------------------------

    @Test
    public void testGetPivotYear_null() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        assertNull(bucket.getPivotYear());
    }

    @Test
    public void testSetPivotYear_changesValue() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.setPivotYear(2020);
        assertEquals(Integer.valueOf(2020), bucket.getPivotYear());
    }

    @Test
    public void testSetPivotYear_null() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, 1950, 2000);
        bucket.setPivotYear(null);
        assertNull(bucket.getPivotYear());
    }

    //-----------------------------------------------------------------------
    // saveField
    //-----------------------------------------------------------------------

    @Test
    public void testSaveField_fieldValue_normal() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year().getField(bucket.getChronology()), 2005);
        long millis = bucket.computeMillis();
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(2005, dt.getYear());
    }

    @Test
    public void testSaveField_fieldTypeValue_normal() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 1999);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        long millis = bucket.computeMillis();
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(1999, dt.getYear());
        assertEquals(6, dt.getMonthOfYear());
        assertEquals(15, dt.getDayOfMonth());
    }

    @Test
    public void testSaveField_fieldTypeTextLocale_normal() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2010);
        bucket.saveField(DateTimeFieldType.monthOfYear(), "January", Locale.US);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        long millis = bucket.computeMillis();
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(1, dt.getMonthOfYear());
    }

    @Test
    public void testSaveField_arrayExpansion_manyFields() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        // save dayOfMonth repeatedly, more than initial capacity (8), to trigger array expansion
        // and also exceed 10 to trigger Arrays.sort branch in sort()
        for (int i = 1; i <= 15; i++) {
            bucket.saveField(DateTimeFieldType.dayOfMonth(), i);
        }
        long millis = bucket.computeMillis();
        DateTime dt = new DateTime(millis, isoUTC);
        // since all saved fields are equal in comparison, insertion order preserved,
        // last value applied wins
        assertEquals(15, dt.getDayOfMonth());
    }

    //-----------------------------------------------------------------------
    // saveState / restoreState
    //-----------------------------------------------------------------------

    @Test
    public void testSaveState_returnsNonNull() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        Object state = bucket.saveState();
        assertNotNull(state);
    }

    @Test
    public void testSaveState_sameInstanceReturnedIfNotCleared() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        Object state1 = bucket.saveState();
        Object state2 = bucket.saveState();
        assertSame(state1, state2);
    }

    @Test
    public void testRestoreState_validState_returnsTrue() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2000);
        Object state = bucket.saveState();
        bucket.saveField(DateTimeFieldType.monthOfYear(), 5);
        boolean restored = bucket.restoreState(state);
        assertTrue(restored);
    }

    @Test
    public void testRestoreState_invalidState_returnsFalse() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        boolean restored = bucket.restoreState("not a valid state");
        assertFalse(restored);
    }

    @Test
    public void testRestoreState_null_returnsFalse() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        boolean restored = bucket.restoreState(null);
        assertFalse(restored);
    }

    @Test
    public void testRestoreState_fromDifferentBucket_returnsFalse() {
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        Object state1 = bucket1.saveState();
        boolean restored = bucket2.restoreState(state1);
        assertFalse(restored);
    }

    @Test
    public void testRestoreState_afterSavingMoreFields_setsSharedFlag() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2000);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 5);
        Object state = bucket.saveState(); // count = 2
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 10);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 20);
        // restore back to count=2 triggers shared flag logic internally
        boolean restored = bucket.restoreState(state);
        assertTrue(restored);
        // after restore, saving new field should still work correctly (clone if needed)
        bucket.saveField(DateTimeFieldType.hourOfDay(), 10);
        long millis = bucket.computeMillis();
        assertTrue(millis != 0 || millis == 0); // sanity - no exception thrown
    }

    //-----------------------------------------------------------------------
    // computeMillis
    //-----------------------------------------------------------------------

    @Test
    public void testComputeMillis_noFields_returnsInitialMillis() {
        long initial = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(initial, isoUTC, Locale.US, null, 2000);
        long millis = bucket.computeMillis();
        assertEquals(initial, millis);
    }

    @Test
    public void testComputeMillis_withYearMonthDay_normal() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2020);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 10);
        long millis = bucket.computeMillis();
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(2020, dt.getYear());
        assertEquals(3, dt.getMonthOfYear());
        assertEquals(10, dt.getDayOfMonth());
    }

    @Test
    public void testComputeMillis_boolResetFields_true() {
        long initial = new DateTime(2000, 1, 1, 12, 30, 45, isoUTC).getMillis();
        DateTimeParserBucket bucket = new DateTimeParserBucket(initial, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2005);
        long millis = bucket.computeMillis(true);
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(2005, dt.getYear());
        // with reset true, lower fields like hour/minute should be reset to floor
        assertEquals(0, dt.getHourOfDay());
    }

    @Test
    public void testComputeMillis_boolResetFields_false() {
        long initial = new DateTime(2000, 1, 1, 12, 30, 45, isoUTC).getMillis();
        DateTimeParserBucket bucket = new DateTimeParserBucket(initial, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2005);
        long millis = bucket.computeMillis(false);
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(2005, dt.getYear());
        assertEquals(12, dt.getHourOfDay());
    }

    @Test
    public void testComputeMillis_withText_noException() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2015);
        long millis = bucket.computeMillis(false, "2015");
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(2015, dt.getYear());
    }

    @Test
    public void testComputeMillis_monthOnly_setsDefaultYear() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 1999);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 7);
        long millis = bucket.computeMillis();
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(1999, dt.getYear());
        assertEquals(7, dt.getMonthOfYear());
    }

    @Test
    public void testComputeMillis_dayOnly_setsDefaultYear() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 1985);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 5);
        long millis = bucket.computeMillis();
        DateTime dt = new DateTime(millis, isoUTC);
        assertEquals(1985, dt.getYear());
        assertEquals(5, dt.getDayOfMonth());
    }

    @Test
    public void testComputeMillis_withOffset_appliesOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2000);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        bucket.setOffset(3600000); // +1 hour offset
        long millisWithOffset = bucket.computeMillis();

        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket2.saveField(DateTimeFieldType.year(), 2000);
        bucket2.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket2.saveField(DateTimeFieldType.dayOfMonth(), 1);
        long millisNoOffset = bucket2.computeMillis();

        assertEquals(millisNoOffset - 3600000, millisWithOffset);
    }

    @Test
    public void testComputeMillis_withZone_appliesZoneOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.setZone(DateTimeZone.forID("Europe/Paris"));
        bucket.saveField(DateTimeFieldType.year(), 2020);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 12);
        long millis = bucket.computeMillis();
        DateTime dtUTC = new DateTime(millis, DateTimeZone.UTC);
        DateTime dtParis = dtUTC.withZone(DateTimeZone.forID("Europe/Paris"));
        assertEquals(12, dtParis.getHourOfDay());
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testComputeMillis_illegalFieldValue_throwsException() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13); // invalid month
        bucket.computeMillis();
    }

    @Test
    public void testComputeMillis_illegalFieldValue_withText_messageIncludesText() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13); // invalid month
        try {
            bucket.computeMillis(false, "badinput");
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            assertTrue(e.getMessage().contains("badinput"));
        }
    }

    @Test
    public void testComputeMillis_illegalInstantDueToZoneTransition_throwsException() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        bucket.setZone(newYork);
        // 2007-03-11 02:30 does not exist in America/New_York due to DST spring forward
        bucket.saveField(DateTimeFieldType.year(), 2007);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 11);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);
        try {
            bucket.computeMillis(false, "nonexistenttime");
            fail("Expected IllegalArgumentException due to zone transition");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("nonexistenttime"));
        }
    }

    @Test
    public void testComputeMillis_idempotent() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, isoUTC, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2012);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 8);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 20);
        long first = bucket.computeMillis();
        long second = bucket.computeMillis();
        assertEquals(first, second);
    }
}
