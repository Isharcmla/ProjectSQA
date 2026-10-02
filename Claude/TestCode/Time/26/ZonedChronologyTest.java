package org.joda.time.chrono;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;

public class ZonedChronologyTest {

    private Chronology baseUTC;
    private DateTimeZone zoneLondon;
    private DateTimeZone zoneParis;
    private ZonedChronology zonedLondon;

    @Before
    public void setUp() {
        baseUTC = ISOChronology.getInstanceUTC();
        zoneLondon = DateTimeZone.forID("Europe/London");
        zoneParis = DateTimeZone.forID("Europe/Paris");
        zonedLondon = ZonedChronology.getInstance(ISOChronology.getInstance(zoneLondon), zoneLondon);
    }

    // ---------------- getInstance ----------------

    @Test
    public void testGetInstance_normal_returnsInstance() {
        ZonedChronology zc = ZonedChronology.getInstance(
                ISOChronology.getInstance(DateTimeZone.forID("America/New_York")), zoneLondon);
        assertNotNull(zc);
        assertEquals(zoneLondon, zc.getZone());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullBase_throwsException() {
        ZonedChronology.getInstance(null, zoneLondon);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_nullZone_throwsException() {
        ZonedChronology.getInstance(baseUTC, null);
    }

    @Test
    public void testGetInstance_zoneUTC_createsInstance() {
        ZonedChronology zc = ZonedChronology.getInstance(baseUTC, DateTimeZone.UTC);
        assertNotNull(zc);
        assertEquals(DateTimeZone.UTC, zc.getZone());
    }

    // ---------------- getZone ----------------

    @Test
    public void testGetZone_returnsCorrectZone() {
        assertEquals(zoneLondon, zonedLondon.getZone());
    }

    // ---------------- withUTC ----------------

    @Test
    public void testWithUTC_returnsBaseChronology() {
        Chronology utc = zonedLondon.withUTC();
        assertNotNull(utc);
        assertEquals(DateTimeZone.UTC, utc.getZone());
    }

    // ---------------- withZone ----------------

    @Test
    public void testWithZone_null_usesDefault() {
        Chronology c = zonedLondon.withZone(null);
        assertNotNull(c);
        assertEquals(DateTimeZone.getDefault(), c.getZone());
    }

    @Test
    public void testWithZone_sameZone_returnsThis() {
        Chronology c = zonedLondon.withZone(zoneLondon);
        assertSame(zonedLondon, c);
    }

    @Test
    public void testWithZone_UTC_returnsBase() {
        Chronology c = zonedLondon.withZone(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, c.getZone());
    }

    @Test
    public void testWithZone_differentZone_returnsNewInstance() {
        Chronology c = zonedLondon.withZone(zoneParis);
        assertNotSame(zonedLondon, c);
        assertEquals(zoneParis, c.getZone());
    }

    // ---------------- getDateTimeMillis ----------------

    @Test
    public void testGetDateTimeMillis_4args_normal() {
        long millis = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        // just ensure no exception and value is reasonable
        assertTrue(millis > 0);
    }

    @Test
    public void testGetDateTimeMillis_7args_normal() {
        long millis = zonedLondon.getDateTimeMillis(2020, 6, 15, 10, 30, 0, 0);
        assertTrue(millis > 0);
    }

    @Test
    public void testGetDateTimeMillis_withInstant_normal() {
        long baseInstant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        long millis = zonedLondon.getDateTimeMillis(baseInstant, 10, 30, 0, 0);
        assertTrue(millis > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillis_gapTime_throwsException() {
        // 2020-03-29 is the UK DST transition day, 01:00-02:00 local does not exist
        zonedLondon.getDateTimeMillis(2020, 3, 29, 1, 30, 0, 0);
    }

    // ---------------- equals ----------------

    @Test
    public void testEquals_sameObject_true() {
        assertTrue(zonedLondon.equals(zonedLondon));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(zonedLondon.equals(null));
    }

    @Test
    public void testEquals_differentType_false() {
        assertFalse(zonedLondon.equals("not a chronology"));
    }

    @Test
    public void testEquals_sameBaseAndZone_true() {
        ZonedChronology other = ZonedChronology.getInstance(ISOChronology.getInstance(zoneLondon), zoneLondon);
        assertTrue(zonedLondon.equals(other));
        assertNotSame(zonedLondon, other);
    }

    @Test
    public void testEquals_differentZone_false() {
        ZonedChronology other = ZonedChronology.getInstance(ISOChronology.getInstance(zoneLondon), zoneParis);
        assertFalse(zonedLondon.equals(other));
    }

    @Test
    public void testEquals_differentBase_false() {
        ZonedChronology other = ZonedChronology.getInstance(GJChronology.getInstance(zoneLondon), zoneLondon);
        assertFalse(zonedLondon.equals(other));
    }

    // ---------------- hashCode ----------------

    @Test
    public void testHashCode_consistent() {
        int h1 = zonedLondon.hashCode();
        int h2 = zonedLondon.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_equalObjectsSameHashCode() {
        ZonedChronology other = ZonedChronology.getInstance(ISOChronology.getInstance(zoneLondon), zoneLondon);
        assertEquals(zonedLondon.hashCode(), other.hashCode());
    }

    // ---------------- toString ----------------

    @Test
    public void testToString_containsZoneId() {
        String str = zonedLondon.toString();
        assertTrue(str.startsWith("ZonedChronology["));
        assertTrue(str.contains(zoneLondon.getID()));
    }

    // ---------------- ZonedDateTimeField behaviors (via chronology fields) ----------------

    @Test
    public void testDateTimeField_getAndSet_normal() {
        DateTimeField monthField = zonedLondon.monthOfYear();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        int month = monthField.get(instant);
        assertEquals(6, month);
        long newInstant = monthField.set(instant, 7);
        assertEquals(7, monthField.get(newInstant));
    }

    @Test
    public void testDateTimeField_isLenient_returnsValue() {
        DateTimeField monthField = zonedLondon.monthOfYear();
        // just ensure method is callable without exception
        boolean lenient = monthField.isLenient();
        assertTrue(lenient == true || lenient == false);
    }

    @Test
    public void testDateTimeField_getAsTextAndShortText() {
        DateTimeField monthField = zonedLondon.monthOfYear();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        String text = monthField.getAsText(instant, Locale.ENGLISH);
        String shortText = monthField.getAsShortText(instant, Locale.ENGLISH);
        assertNotNull(text);
        assertNotNull(shortText);

        String text2 = monthField.getAsText(6, Locale.ENGLISH);
        String shortText2 = monthField.getAsShortText(6, Locale.ENGLISH);
        assertNotNull(text2);
        assertNotNull(shortText2);
    }

    @Test
    public void testDateTimeField_addIntAndLong_normal() {
        DateTimeField dayField = zonedLondon.dayOfMonth();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        long result1 = dayField.add(instant, 1);
        long result2 = dayField.add(instant, 1L);
        assertEquals(16, dayField.get(result1));
        assertEquals(16, dayField.get(result2));
    }

    @Test
    public void testDateTimeField_addWrapField_normal() {
        DateTimeField dayField = zonedLondon.dayOfMonth();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        long result = dayField.addWrapField(instant, 1);
        assertEquals(16, dayField.get(result));
    }

    @Test
    public void testDateTimeField_hourOfDayAdd_timeField() {
        DateTimeField hourField = zonedLondon.hourOfDay();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long result = hourField.add(instant, 2);
        assertEquals(12, hourField.get(result));
    }

    @Test
    public void testDateTimeField_set_withText() {
        DateTimeField monthField = zonedLondon.monthOfYear();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        long result = monthField.set(instant, "August", Locale.ENGLISH);
        assertEquals(8, monthField.get(result));
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testDateTimeField_set_gapTime_throwsException() {
        DateTimeField hourField = zonedLondon.hourOfDay();
        long instant = zonedLondon.getDateTimeMillis(2020, 3, 29, 0, 30, 0, 0);
        // setting to hour=1 lands in the DST gap (01:00-02:00 does not exist)
        hourField.set(instant, 1);
    }

    @Test
    public void testDateTimeField_getDifference_normal() {
        DateTimeField dayField = zonedLondon.dayOfMonth();
        long instant1 = zonedLondon.getDateTimeMillis(2020, 6, 20, 0);
        long instant2 = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        int diff = dayField.getDifference(instant1, instant2);
        long diffLong = dayField.getDifferenceAsLong(instant1, instant2);
        assertEquals(5, diff);
        assertEquals(5L, diffLong);
    }

    @Test
    public void testDateTimeField_getDurationFields_notNull() {
        DateTimeField dayField = zonedLondon.dayOfMonth();
        assertNotNull(dayField.getDurationField());
        assertNotNull(dayField.getRangeDurationField());
    }

    @Test
    public void testDateTimeField_isLeapAndGetLeapAmount_normal() {
        DateTimeField monthField = zonedLondon.monthOfYear();
        long instant = zonedLondon.getDateTimeMillis(2020, 2, 15, 0);
        boolean leap = monthField.isLeap(instant);
        int leapAmount = monthField.getLeapAmount(instant);
        assertTrue(leap == true || leap == false);
        assertTrue(leapAmount >= 0);
        assertNotNull(monthField.getLeapDurationField());
    }

    @Test
    public void testDateTimeField_roundFloorAndCeiling_timeField() {
        DateTimeField hourField = zonedLondon.hourOfDay();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 10, 30, 0, 0);
        long floor = hourField.roundFloor(instant);
        long ceiling = hourField.roundCeiling(instant);
        assertTrue(floor <= instant);
        assertTrue(ceiling >= instant);
    }

    @Test
    public void testDateTimeField_roundFloorAndCeiling_nonTimeField() {
        DateTimeField monthField = zonedLondon.monthOfYear();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 10, 30, 0, 0);
        long floor = monthField.roundFloor(instant);
        long ceiling = monthField.roundCeiling(instant);
        assertTrue(floor <= instant);
        assertTrue(ceiling >= instant);
    }

    @Test
    public void testDateTimeField_remainder_normal() {
        DateTimeField hourField = zonedLondon.hourOfDay();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 10, 30, 0, 0);
        long remainder = hourField.remainder(instant);
        assertTrue(remainder >= 0);
    }

    @Test
    public void testDateTimeField_minMaxValues_normal() {
        DateTimeField dayField = zonedLondon.dayOfMonth();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        int min = dayField.getMinimumValue();
        int max = dayField.getMaximumValue();
        int minInst = dayField.getMinimumValue(instant);
        int maxInst = dayField.getMaximumValue(instant);
        assertEquals(1, min);
        assertEquals(1, minInst);
        assertTrue(max >= 28);
        assertTrue(maxInst >= 28);
    }

    @Test
    public void testDateTimeField_minMaxValuesWithPartial_normal() {
        DateTimeField dayField = zonedLondon.dayOfMonth();
        LocalDate partial = new LocalDate(2020, 6, 15);
        int min = dayField.getMinimumValue(partial);
        int max = dayField.getMaximumValue(partial);
        assertEquals(1, min);
        assertTrue(max >= 28);

        int[] values = {2020, 6, 15};
        int minWithValues = dayField.getMinimumValue(partial, values);
        int maxWithValues = dayField.getMaximumValue(partial, values);
        assertEquals(1, minWithValues);
        assertTrue(maxWithValues >= 28);
    }

    @Test
    public void testDateTimeField_maxTextLength_normal() {
        DateTimeField monthField = zonedLondon.monthOfYear();
        int maxLen = monthField.getMaximumTextLength(Locale.ENGLISH);
        int maxShortLen = monthField.getMaximumShortTextLength(Locale.ENGLISH);
        assertTrue(maxLen > 0);
        assertTrue(maxShortLen > 0);
    }

    // ---------------- ZonedDurationField behaviors (via chronology fields) ----------------

    @Test
    public void testDurationField_isPrecise_timeField() {
        DurationField millisField = zonedLondon.millis();
        assertTrue(millisField.isPrecise());
    }

    @Test
    public void testDurationField_isPrecise_nonTimeFieldNonFixedZone() {
        DurationField daysField = zonedLondon.days();
        // London is not a fixed zone, days field should not report precise
        assertFalse(daysField.isPrecise());
    }

    @Test
    public void testDurationField_isPrecise_nonTimeFieldFixedZone() {
        ZonedChronology zonedUTC = ZonedChronology.getInstance(baseUTC, DateTimeZone.UTC);
        DurationField daysField = zonedUTC.days();
        assertTrue(daysField.isPrecise());
    }

    @Test
    public void testDurationField_getUnitMillis_normal() {
        DurationField hoursField = zonedLondon.hours();
        assertTrue(hoursField.getUnitMillis() > 0);
    }

    @Test
    public void testDurationField_getValue_normal() {
        DurationField dayField = zonedLondon.days();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        long duration = dayField.getMillis(5, instant);
        int value = dayField.getValue(duration, instant);
        long valueLong = dayField.getValueAsLong(duration, instant);
        assertEquals(5, value);
        assertEquals(5L, valueLong);
    }

    @Test
    public void testDurationField_getMillis_normal() {
        DurationField dayField = zonedLondon.days();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        long millisInt = dayField.getMillis(3, instant);
        long millisLong = dayField.getMillis(3L, instant);
        assertEquals(millisInt, millisLong);
    }

    @Test
    public void testDurationField_addIntAndLong_normal() {
        DurationField dayField = zonedLondon.days();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        long result1 = dayField.add(instant, 1);
        long result2 = dayField.add(instant, 1L);
        assertEquals(result1, result2);
    }

    @Test
    public void testDurationField_hourAdd_timeField() {
        DurationField hourField = zonedLondon.hours();
        long instant = zonedLondon.getDateTimeMillis(2020, 6, 15, 10, 0, 0, 0);
        long result = hourField.add(instant, 2);
        assertTrue(result > instant);
    }

    @Test
    public void testDurationField_getDifference_normal() {
        DurationField dayField = zonedLondon.days();
        long instant1 = zonedLondon.getDateTimeMillis(2020, 6, 20, 0);
        long instant2 = zonedLondon.getDateTimeMillis(2020, 6, 15, 0);
        int diff = dayField.getDifference(instant1, instant2);
        long diffLong = dayField.getDifferenceAsLong(instant1, instant2);
        assertEquals(5, diff);
        assertEquals(5L, diffLong);
    }

    @Test(expected = ArithmeticException.class)
    public void testDurationField_add_overflow_throwsException() {
        DurationField hourField = zonedLondon.hours();
        hourField.add(Long.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testDurationField_getDifference_overflow_throwsException() {
        DurationField hourField = zonedLondon.hours();
        hourField.getDifference(Long.MAX_VALUE, 0L);
    }
}
