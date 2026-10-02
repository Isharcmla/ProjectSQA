package org.joda.time.format;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

public class DateTimeParserBucketTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");

    @Test
    public void testConstructor_3Args_deprecated() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(1000L, ISOChronology.getInstanceUTC(), Locale.FRANCE);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
        Assert.assertEquals(Locale.FRANCE, bucket.getLocale());
        Assert.assertNull(bucket.getZone());
        Assert.assertEquals(0, bucket.getOffset());
        Assert.assertNull(bucket.getPivotYear());
    }

    @Test
    public void testConstructor_4Args_deprecated() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(1000L, ISOChronology.getInstanceUTC(), Locale.GERMANY, 2020);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
        Assert.assertEquals(Locale.GERMANY, bucket.getLocale());
        Assert.assertEquals(Integer.valueOf(2020), bucket.getPivotYear());
    }

    @Test
    public void testConstructor_5Args_nullInputs() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, null, null, null, 1995);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
        Assert.assertEquals(Locale.getDefault(), bucket.getLocale());
        Assert.assertNull(bucket.getPivotYear());
    }

    @Test
    public void testConstructor_withNonUtcChronology() {
        Chronology chrono = ISOChronology.getInstance(PARIS);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.ENGLISH, 2010, 2000);
        Assert.assertEquals(ISOChronology.getInstanceUTC(), bucket.getChronology());
        Assert.assertEquals(PARIS, bucket.getZone());
    }

    @Test
    public void testGetAndSetZone() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.setZone(PARIS);
        Assert.assertEquals(PARIS, bucket.getZone());

        bucket.setZone(DateTimeZone.UTC);
        Assert.assertNull(bucket.getZone());
    }

    @Test
    public void testGetAndSetOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.setZone(PARIS);
        Assert.assertEquals(PARIS, bucket.getZone());

        bucket.setOffset(3600000);
        Assert.assertEquals(3600000, bucket.getOffset());
        Assert.assertNull(bucket.getZone());

        bucket.setOffset(-1800000);
        Assert.assertEquals(-1800000, bucket.getOffset());
    }

    @Test
    public void testGetAndSetPivotYear() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        Assert.assertNull(bucket.getPivotYear());

        bucket.setPivotYear(1980);
        Assert.assertEquals(Integer.valueOf(1980), bucket.getPivotYear());

        bucket.setPivotYear(null);
        Assert.assertNull(bucket.getPivotYear());
    }

    @Test
    public void testSaveField_DateTimeField_and_computeMillis() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        DateTimeField yearField = ISOChronology.getInstanceUTC().year();
        bucket.saveField(yearField, 2023);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 5);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);

        long millis = bucket.computeMillis();
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 5, 15, 0);
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void testSaveField_text() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.year(), 2024);
        bucket.saveField(DateTimeFieldType.monthOfYear(), "March", Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 10);

        long millis = bucket.computeMillis(false);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2024, 3, 10, 0);
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void testComputeMillis_withResetFields() {
        // Start from a non-zero millis within the day (e.g. 15:30:45.123)
        long initial = 15 * 3600000L + 30 * 60000L + 45000L + 123L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(initial, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.year(), 2021);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);

        long computedWithoutReset = bucket.computeMillis(false);
        Assert.assertEquals(ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 1, 1, 0) + initial, computedWithoutReset);

        long computedWithReset = bucket.computeMillis(true);
        Assert.assertEquals(ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 1, 1, 0), computedWithReset);
    }

    @Test
    public void testComputeMillis_withDefaultYearFallback() {
        // When first field is month or day, bucket will default to iDefaultYear
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH, null, 2015);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 20);

        long millis = bucket.computeMillis(true, "06-20");
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2015, 6, 20, 0);
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void testComputeMillis_withTimezoneAndOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.setZone(PARIS);
        bucket.saveField(DateTimeFieldType.year(), 2020);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 1);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 12);

        long millis = bucket.computeMillis(true);
        long localMillis = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 12, 0, 0, 0);
        int expectedOffset = PARIS.getOffsetFromLocal(localMillis);
        Assert.assertEquals(localMillis - expectedOffset, millis);

        bucket.setOffset(7200000);
        long offsetMillis = bucket.computeMillis(true);
        Assert.assertEquals(localMillis - 7200000, offsetMillis);
    }

    @Test
    public void testComputeMillis_illegalFieldValueException_withText() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13);
        try {
            bucket.computeMillis(false, "invalid-date-text");
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertTrue(ex.getMessage().contains("Cannot parse \"invalid-date-text\""));
        }
    }

    @Test
    public void testComputeMillis_illegalFieldValueException_withoutText() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13);
        try {
            bucket.computeMillis();
            Assert.fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException ex) {
            Assert.assertFalse(ex.getMessage().contains("Cannot parse"));
        }
    }

    @Test
    public void testComputeMillis_dstGapException_withText() {
        // America/New_York spring forward DST gap: 2007-03-11 02:30:00 doesn't exist
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.setZone(NEW_YORK);
        bucket.saveField(DateTimeFieldType.year(), 2007);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 11);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);

        try {
            bucket.computeMillis(true, "2007-03-11 02:30");
            Assert.fail("Expected IllegalArgumentException due to DST gap");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Cannot parse \"2007-03-11 02:30\""));
            Assert.assertTrue(ex.getMessage().contains("Illegal instant due to time zone offset transition"));
        }
    }

    @Test
    public void testComputeMillis_dstGapException_withoutText() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.setZone(NEW_YORK);
        bucket.saveField(DateTimeFieldType.year(), 2007);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 11);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);

        try {
            bucket.computeMillis(true, null);
            Assert.fail("Expected IllegalArgumentException due to DST gap");
        } catch (IllegalArgumentException ex) {
            Assert.assertFalse(ex.getMessage().contains("Cannot parse"));
            Assert.assertTrue(ex.getMessage().contains("Illegal instant due to time zone offset transition"));
        }
    }

    @Test
    public void testArrayExpansion_and_sortLargeNumber_over10Fields() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        // Add more than 10 fields to trigger array expansion (> 8) and Arrays.sort (> 10)
        bucket.saveField(DateTimeFieldType.millisOfSecond(), 100);
        bucket.saveField(DateTimeFieldType.secondOfMinute(), 10);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 20);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 14);
        bucket.saveField(DateTimeFieldType.dayOfWeek(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.dayOfYear(), 105);
        bucket.saveField(DateTimeFieldType.weekOfWeekyear(), 15);
        bucket.saveField(DateTimeFieldType.weekyear(), 2021);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 4);
        bucket.saveField(DateTimeFieldType.year(), 2021);
        bucket.saveField(DateTimeFieldType.centuryOfEra(), 20);

        long millis = bucket.computeMillis(false);
        Assert.assertTrue(millis > 0);
    }

    @Test
    public void testSaveState_and_restoreState_success() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.year(), 2020);
        bucket.setZone(PARIS);
        bucket.setOffset(100);

        Object state = bucket.saveState();
        Assert.assertNotNull(state);

        bucket.saveField(DateTimeFieldType.monthOfYear(), 12);
        bucket.setZone(NEW_YORK);
        bucket.setOffset(200);

        boolean restored = bucket.restoreState(state);
        Assert.assertTrue(restored);
        Assert.assertEquals(PARIS, bucket.getZone());
        Assert.assertEquals(100, bucket.getOffset());

        long millis = bucket.computeMillis();
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 0) - PARIS.getOffsetFromLocal(ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 1, 1, 0));
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void testRestoreState_invalidObject() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        Assert.assertFalse(bucket.restoreState("InvalidStateObject"));
        Assert.assertFalse(bucket.restoreState(null));
    }

    @Test
    public void testRestoreState_fromDifferentBucket() {
        DateTimeParserBucket bucket1 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        DateTimeParserBucket bucket2 = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        Object state1 = bucket1.saveState();
        Assert.assertFalse(bucket2.restoreState(state1));
    }

    @Test
    public void testSavedFieldsShared_flagTriggered() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.year(), 2022);
        Object state = bucket.saveState();

        bucket.saveField(DateTimeFieldType.monthOfYear(), 5);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 10);

        // Restoring to lower count sets iSavedFieldsShared = true
        bucket.restoreState(state);

        // Saving field after restore causes array copy branch
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        long millis = bucket.computeMillis(true);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2022, 6, 1, 0);
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void testSavedFieldsShared_cloningDuringComputeMillis() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.year(), 2022);
        Object state = bucket.saveState();

        bucket.saveField(DateTimeFieldType.monthOfYear(), 5);
        bucket.restoreState(state);

        // computeMillis directly with shared fields
        long millis = bucket.computeMillis(true);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2022, 1, 1, 0);
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void testCompareReverse_coverage() {
        DurationField months = DurationFieldType.months().getField(ISOChronology.getInstanceUTC());
        DurationField days = DurationFieldType.days().getField(ISOChronology.getInstanceUTC());
        DurationField unsupported = BuddhistChronology.getInstanceUTC().eras();

        // null/unsupported comparisons
        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(null, null));
        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(unsupported, null));
        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(null, unsupported));
        Assert.assertEquals(-1, DateTimeParserBucket.compareReverse(null, months));
        Assert.assertEquals(-1, DateTimeParserBucket.compareReverse(unsupported, months));
        Assert.assertEquals(1, DateTimeParserBucket.compareReverse(months, null));
        Assert.assertEquals(1, DateTimeParserBucket.compareReverse(months, unsupported));

        // supported vs supported
        Assert.assertTrue(DateTimeParserBucket.compareReverse(months, days) < 0);
        Assert.assertTrue(DateTimeParserBucket.compareReverse(days, months) > 0);
        Assert.assertEquals(0, DateTimeParserBucket.compareReverse(days, days));
    }

    @Test
    public void testSavedField_compareTo_ordering() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, GJChronology.getInstanceUTC(), Locale.ENGLISH);
        // Era has null range duration field
        bucket.saveField(DateTimeFieldType.era(), 1);
        bucket.saveField(DateTimeFieldType.centuryOfEra(), 20);
        bucket.saveField(DateTimeFieldType.year(), 2005);
        bucket.saveField(DateTimeFieldType.dayOfWeek(), 4);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 14);

        long millis = bucket.computeMillis(true);
        Assert.assertTrue(millis != 0);
    }
}
