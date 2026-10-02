package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

public class LenientDateTimeFieldTest {

    @Test
    public void testGetInstance_nullField_returnsNull() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField result = LenientDateTimeField.getInstance(null, chrono);
        Assert.assertNull(result);
    }

    @Test
    public void testGetInstance_strictDateTimeField_unwrapsStrictAndReturnsLenient() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField baseField = chrono.dayOfMonth();
        DateTimeField strictField = StrictDateTimeField.getInstance(baseField);
        
        DateTimeField lenient = LenientDateTimeField.getInstance(strictField, chrono);
        
        Assert.assertNotNull(lenient);
        Assert.assertTrue(lenient.isLenient());
        Assert.assertEquals(baseField.getType(), lenient.getType());
    }

    @Test
    public void testGetInstance_alreadyLenientField_returnsSameField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField baseField = chrono.dayOfMonth();
        DateTimeField lenient1 = LenientDateTimeField.getInstance(baseField, chrono);
        
        DateTimeField lenient2 = LenientDateTimeField.getInstance(lenient1, chrono);
        
        Assert.assertSame(lenient1, lenient2);
    }

    @Test
    public void testGetInstance_standardField_returnsLenientDateTimeField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField baseField = chrono.dayOfMonth();
        
        DateTimeField lenient = LenientDateTimeField.getInstance(baseField, chrono);
        
        Assert.assertNotNull(lenient);
        Assert.assertTrue(lenient instanceof LenientDateTimeField);
        Assert.assertTrue(lenient.isLenient());
    }

    @Test
    public void testIsLenient_returnsTrue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenient = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        
        Assert.assertTrue(lenient.isLenient());
    }

    @Test
    public void testSet_valueWithinBounds_setsCorrectly() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenient = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        
        // 2020-01-15T00:00:00.000Z
        long instant = 1579046400000L;
        long result = lenient.set(instant, 20);
        
        // Expected: 2020-01-20T00:00:00.000Z
        long expected = 1579478400000L;
        Assert.assertEquals(expected, result);
        Assert.assertEquals(20, lenient.get(result));
    }

    @Test
    public void testSet_positiveOverflow_rollsOverToNextMonth() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenient = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        
        // 2020-01-15T00:00:00.000Z (January has 31 days)
        long instant = 1579046400000L;
        // Setting day of month to 32 should result in 2020-02-01
        long result = lenient.set(instant, 32);
        
        Assert.assertEquals(2, chrono.monthOfYear().get(result));
        Assert.assertEquals(1, chrono.dayOfMonth().get(result));
        Assert.assertEquals(2020, chrono.year().get(result));
    }

    @Test
    public void testSet_zeroAndNegativeValue_rollsBackToPreviousMonth() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenient = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        
        // 2020-01-15T00:00:00.000Z
        long instant = 1579046400000L;
        
        // Setting day to 0 should result in 2019-12-31
        long resultZero = lenient.set(instant, 0);
        Assert.assertEquals(2019, chrono.year().get(resultZero));
        Assert.assertEquals(12, chrono.monthOfYear().get(resultZero));
        Assert.assertEquals(31, chrono.dayOfMonth().get(resultZero));
        
        // Setting day to -5 should result in 2019-12-26
        long resultNegative = lenient.set(instant, -5);
        Assert.assertEquals(2019, chrono.year().get(resultNegative));
        Assert.assertEquals(12, chrono.monthOfYear().get(resultNegative));
        Assert.assertEquals(26, chrono.dayOfMonth().get(resultNegative));
    }

    @Test
    public void testSet_withNonUtcTimeZone_calculatesCorrectlyWithZoneOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        Chronology chrono = ISOChronology.getInstance(zone);
        DateTimeField lenient = LenientDateTimeField.getInstance(chrono.hourOfDay(), chrono);
        
        // 2020-01-01T00:00:00.000Z (which is 05:00:00 in UTC+5)
        long instant = 1577836800000L;
        
        // In local time, hour is 5. Setting hour to 28 (overflow by 4 hours into next day)
        long result = lenient.set(instant, 28);
        
        Assert.assertEquals(4, lenient.get(result));
        Assert.assertEquals(2, chrono.dayOfMonth().get(result));
    }

    @Test
    public void testSet_monthFieldLenientOverflow_rollsOverYears() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenient = LenientDateTimeField.getInstance(chrono.monthOfYear(), chrono);
        
        // 2020-01-15T00:00:00.000Z
        long instant = 1579046400000L;
        
        // Setting month to 14 should result in 2021-02-15
        long result = lenient.set(instant, 14);
        Assert.assertEquals(2021, chrono.year().get(result));
        Assert.assertEquals(2, chrono.monthOfYear().get(result));
        Assert.assertEquals(15, chrono.dayOfMonth().get(result));
    }

    @Test
    public void testConstructor_protectedSubclassInstantiatesCorrectly() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField baseField = chrono.dayOfMonth();
        
        LenientDateTimeField customLenient = new LenientDateTimeField(baseField, chrono) {};
        
        Assert.assertNotNull(customLenient);
        Assert.assertTrue(customLenient.isLenient());
        Assert.assertEquals(DateTimeFieldType.dayOfMonth(), customLenient.getType());
    }
}
