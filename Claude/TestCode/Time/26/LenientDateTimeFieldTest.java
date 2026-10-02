package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

import static org.junit.Assert.*;

public class LenientDateTimeFieldTest {

    private final Chronology chronology = ISOChronology.getInstanceUTC();

    // ---------- getInstance() tests ----------

    @Test
    public void testGetInstance_nullField_returnsNull() {
        DateTimeField result = LenientDateTimeField.getInstance(null, chronology);
        assertNull(result);
    }

    @Test
    public void testGetInstance_strictField_unwrapsAndWrapsLenient() {
        DateTimeField base = chronology.monthOfYear();
        DateTimeField strict = new StrictDateTimeField(base);
        DateTimeField result = LenientDateTimeField.getInstance(strict, chronology);
        assertNotNull(result);
        assertTrue(result.isLenient());
        assertTrue(result instanceof LenientDateTimeField);
    }

    @Test
    public void testGetInstance_lenientField_returnsSameInstance() {
        DateTimeField base = chronology.monthOfYear();
        DateTimeField lenient = LenientDateTimeField.getInstance(base, chronology);
        DateTimeField result = LenientDateTimeField.getInstance(lenient, chronology);
        assertSame(lenient, result);
    }

    @Test
    public void testGetInstance_strictFieldWrappingLenientField_returnsSameLenientInstance() {
        DateTimeField base = chronology.monthOfYear();
        DateTimeField lenient = LenientDateTimeField.getInstance(base, chronology);
        DateTimeField strictWrappingLenient = new StrictDateTimeField(lenient);
        DateTimeField result = LenientDateTimeField.getInstance(strictWrappingLenient, chronology);
        assertSame(lenient, result);
    }

    @Test
    public void testGetInstance_normalStrictField_createsNewLenientInstance() {
        DateTimeField base = chronology.dayOfMonth();
        DateTimeField result = LenientDateTimeField.getInstance(base, chronology);
        assertNotNull(result);
        assertTrue(result instanceof LenientDateTimeField);
        assertTrue(result.isLenient());
    }

    // ---------- isLenient() tests ----------

    @Test
    public void testIsLenient_alwaysReturnsTrue() {
        DateTimeField base = chronology.monthOfYear();
        LenientDateTimeField field = new LenientDateTimeField(base, chronology);
        assertTrue(field.isLenient());
    }

    // ---------- set() tests ----------

    @Test
    public void testSet_normalValue_withinBounds_setsCorrectly() {
        DateTimeField base = chronology.monthOfYear();
        LenientDateTimeField field = new LenientDateTimeField(base, chronology);
        long instant = new DateTime(2023, 5, 15, 0, 0, chronology).getMillis();
        long result = field.set(instant, 6);
        DateTime dt = new DateTime(result, chronology);
        assertEquals(6, dt.getMonthOfYear());
        assertEquals(2023, dt.getYear());
    }

    @Test
    public void testSet_outOfBoundsValue_performsAdditionRollover() {
        DateTimeField base = chronology.monthOfYear();
        LenientDateTimeField field = new LenientDateTimeField(base, chronology);
        long instant = new DateTime(2023, 5, 15, 0, 0, chronology).getMillis();
        // month 13 is out of range, lenient field should roll over to next year's January
        long result = field.set(instant, 13);
        DateTime dt = new DateTime(result, chronology);
        assertEquals(1, dt.getMonthOfYear());
        assertEquals(2024, dt.getYear());
    }

    @Test
    public void testSet_negativeValue_performsSubtractionRollback() {
        DateTimeField base = chronology.monthOfYear();
        LenientDateTimeField field = new LenientDateTimeField(base, chronology);
        long instant = new DateTime(2023, 5, 15, 0, 0, chronology).getMillis();
        long result = field.set(instant, -1);
        DateTime dt = new DateTime(result, chronology);
        assertEquals(11, dt.getMonthOfYear());
        assertEquals(2022, dt.getYear());
    }

    @Test
    public void testSet_zeroInstant_setsValueCorrectly() {
        DateTimeField base = chronology.dayOfMonth();
        LenientDateTimeField field = new LenientDateTimeField(base, chronology);
        long result = field.set(0L, 15);
        DateTime dt = new DateTime(result, chronology);
        assertEquals(15, dt.getDayOfMonth());
    }

    @Test
    public void testSet_zeroValue_setsFieldToZeroEquivalent() {
        DateTimeField base = chronology.dayOfMonth();
        LenientDateTimeField field = new LenientDateTimeField(base, chronology);
        long instant = new DateTime(2023, 5, 15, 0, 0, chronology).getMillis();
        long result = field.set(instant, 0);
        DateTime dt = new DateTime(result, chronology);
        // day 0 of May rolls back to the last day of April
        assertEquals(30, dt.getDayOfMonth());
        assertEquals(4, dt.getMonthOfYear());
    }

    @Test(expected = ArithmeticException.class)
    public void testSet_extremeInstantWithNonUtcZone_throwsArithmeticException() {
        Chronology nonUtcChronology = ISOChronology.getInstance(DateTimeZone.forOffsetHours(10));
        DateTimeField base = nonUtcChronology.dayOfMonth();
        LenientDateTimeField field = new LenientDateTimeField(base, nonUtcChronology);
        field.set(Long.MAX_VALUE, 15);
    }
}
