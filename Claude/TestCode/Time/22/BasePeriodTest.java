package org.joda.time.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link BasePeriod}.
 * Since BasePeriod is abstract, we use a small testable subclass
 * (TestablePeriod) that exposes the protected constructors/methods
 * through public wrapper methods.
 */
public class BasePeriodTest {

    //-----------------------------------------------------------------------
    // Testable subclass
    //-----------------------------------------------------------------------
    static class TestablePeriod extends BasePeriod {

        public TestablePeriod(int years, int months, int weeks, int days,
                               int hours, int minutes, int seconds, int millis,
                               PeriodType type) {
            super(years, months, weeks, days, hours, minutes, seconds, millis, type);
        }

        public TestablePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
            super(startInstant, endInstant, type, chrono);
        }

        public TestablePeriod(ReadableInstant start, ReadableInstant end, PeriodType type) {
            super(start, end, type);
        }

        public TestablePeriod(ReadablePartial start, ReadablePartial end, PeriodType type) {
            super(start, end, type);
        }

        public TestablePeriod(ReadableInstant start, ReadableDuration duration, PeriodType type) {
            super(start, duration, type);
        }

        public TestablePeriod(ReadableDuration duration, ReadableInstant end, PeriodType type) {
            super(duration, end, type);
        }

        public TestablePeriod(long duration) {
            super(duration);
        }

        public TestablePeriod(long duration, PeriodType type, Chronology chrono) {
            super(duration, type, chrono);
        }

        public TestablePeriod(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        public TestablePeriod(int[] values, PeriodType type) {
            super(values, type);
        }

        // ---- wrapper methods ----
        public PeriodType checkPeriodTypePublic(PeriodType type) {
            return checkPeriodType(type);
        }

        public void setPeriodPublic(ReadablePeriod period) {
            setPeriod(period);
        }

        public void setPeriodPublic(int years, int months, int weeks, int days,
                                     int hours, int minutes, int seconds, int millis) {
            setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
        }

        public void setFieldPublic(DurationFieldType field, int value) {
            setField(field, value);
        }

        public void setFieldIntoPublic(int[] values, DurationFieldType field, int value) {
            setFieldInto(values, field, value);
        }

        public void addFieldPublic(DurationFieldType field, int value) {
            addField(field, value);
        }

        public void addFieldIntoPublic(int[] values, DurationFieldType field, int value) {
            addFieldInto(values, field, value);
        }

        public void mergePeriodPublic(ReadablePeriod period) {
            mergePeriod(period);
        }

        public int[] mergePeriodIntoPublic(int[] values, ReadablePeriod period) {
            return mergePeriodInto(values, period);
        }

        public void addPeriodPublic(ReadablePeriod period) {
            addPeriod(period);
        }

        public int[] addPeriodIntoPublic(int[] values, ReadablePeriod period) {
            return addPeriodInto(values, period);
        }

        public void setValuePublic(int index, int value) {
            setValue(index, value);
        }

        public void setValuesPublic(int[] values) {
            setValues(values);
        }
    }

    //-----------------------------------------------------------------------
    // Constructor 1: (ints..., PeriodType)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor1_normal_valuesSetCorrectly() {
        TestablePeriod p = new TestablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        assertEquals(1, p.getValue(0));
        assertEquals(2, p.getValue(1));
        assertEquals(3, p.getValue(2));
        assertEquals(4, p.getValue(3));
        assertEquals(5, p.getValue(4));
        assertEquals(6, p.getValue(5));
        assertEquals(7, p.getValue(6));
        assertEquals(8, p.getValue(7));
    }

    @Test
    public void testConstructor1_nullType_usesStandardType() {
        TestablePeriod p = new TestablePeriod(1, 0, 0, 0, 0, 0, 0, 0, null);
        assertNotNull(p.getPeriodType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor1_unsupportedFieldNonZero_throwsException() {
        new TestablePeriod(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.years());
    }

    //-----------------------------------------------------------------------
    // Constructor 2: (long, long, PeriodType, Chronology)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor2_normal_producesValues() {
        long start = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        long end = new DateTime(2004, 8, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        TestablePeriod p = new TestablePeriod(start, end, PeriodType.standard(), null);
        assertEquals(2, p.getValue(1)); // 2 months difference
    }

    @Test
    public void testConstructor2_nullTypeAndChrono_usesDefaults() {
        long start = 0L;
        long end = 1000L;
        TestablePeriod p = new TestablePeriod(start, end, null, null);
        assertNotNull(p.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // Constructor 3: (ReadableInstant, ReadableInstant, PeriodType)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor3_bothNull_returnsZeroValues() {
        TestablePeriod p = new TestablePeriod((ReadableInstant) null, (ReadableInstant) null, PeriodType.standard());
        for (int i = 0; i < p.size(); i++) {
            assertEquals(0, p.getValue(i));
        }
    }

    @Test
    public void testConstructor3_normalInstants_producesValues() {
        DateTime start = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        DateTime end = new DateTime(2004, 8, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        TestablePeriod p = new TestablePeriod(start, end, PeriodType.standard());
        assertEquals(2, p.getValue(1));
    }

    //-----------------------------------------------------------------------
    // Constructor 4: (ReadablePartial, ReadablePartial, PeriodType)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor4_baseLocalPartials_producesValues() {
        LocalDate start = new LocalDate(2004, 6, 9);
        LocalDate end = new LocalDate(2004, 8, 9);
        TestablePeriod p = new TestablePeriod(start, end, PeriodType.yearMonthDay());
        assertEquals(2, p.getValue(1));
    }

    @Test
    public void testConstructor4_nonBaseLocalPartials_producesValues() {
        Partial start = new Partial(org.joda.time.DateTimeFieldType.year(), 2000);
        Partial end = new Partial(org.joda.time.DateTimeFieldType.year(), 2005);
        TestablePeriod p = new TestablePeriod(start, end, PeriodType.years());
        assertEquals(5, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor4_nullStart_throwsException() {
        LocalDate end = new LocalDate(2004, 8, 9);
        new TestablePeriod((ReadablePartial) null, end, PeriodType.yearMonthDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor4_nullEnd_throwsException() {
        LocalDate start = new LocalDate(2004, 6, 9);
        new TestablePeriod(start, (ReadablePartial) null, PeriodType.yearMonthDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor4_differentFieldTypes_throwsException() {
        Partial start = new Partial(org.joda.time.DateTimeFieldType.year(), 2000);
        Partial end = new Partial(org.joda.time.DateTimeFieldType.monthOfYear(), 5);
        new TestablePeriod(start, end, PeriodType.years());
    }

    //-----------------------------------------------------------------------
    // Constructor 5: (ReadableInstant, ReadableDuration, PeriodType)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor5_normal_producesValues() {
        DateTime start = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = new Duration(1000L * 60 * 60 * 24 * 2); // 2 days
        TestablePeriod p = new TestablePeriod(start, duration, PeriodType.standard());
        assertNotNull(p.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // Constructor 6: (ReadableDuration, ReadableInstant, PeriodType)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor6_normal_producesValues() {
        DateTime end = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = new Duration(1000L * 60 * 60 * 24 * 2); // 2 days
        TestablePeriod p = new TestablePeriod(duration, end, PeriodType.standard());
        assertNotNull(p.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // Constructor 7: (long duration)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor7_normal_producesValues() {
        TestablePeriod p = new TestablePeriod(1000L * 60 * 60 * 5); // 5 hours
        assertNotNull(p.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // Constructor 8: (long duration, PeriodType, Chronology)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor8_normal_producesValues() {
        TestablePeriod p = new TestablePeriod(1000L * 60 * 60 * 5, PeriodType.standard(), null);
        assertNotNull(p.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // Constructor 9: (Object period, PeriodType, Chronology)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor9_fromPeriodObject_withNullType() {
        Period source = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        TestablePeriod p = new TestablePeriod(source, null, null);
        assertEquals(1, p.getValue(0));
    }

    @Test
    public void testConstructor9_fromPeriodObject_withExplicitType() {
        Period source = new Period(1, 2, 0, 0, 0, 0, 0, 0, PeriodType.yearMonthDay());
        TestablePeriod p = new TestablePeriod(source, PeriodType.yearMonthDay(), null);
        assertEquals(1, p.getValue(0));
        assertEquals(2, p.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor9_unsupportedObjectType_throwsException() {
        new TestablePeriod(Integer.valueOf(5), null, null);
    }

    //-----------------------------------------------------------------------
    // Constructor 10: (int[] values, PeriodType)
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor10_normal_valuesSetDirectly() {
        int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        TestablePeriod p = new TestablePeriod(values, PeriodType.standard());
        assertEquals(1, p.getValue(0));
        assertEquals(8, p.getValue(7));
    }

    //-----------------------------------------------------------------------
    // checkPeriodType
    //-----------------------------------------------------------------------
    @Test
    public void testCheckPeriodType_nullInput_returnsStandardType() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        PeriodType result = p.checkPeriodTypePublic(null);
        assertNotNull(result);
    }

    @Test
    public void testCheckPeriodType_explicitType_returnsSameType() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        PeriodType result = p.checkPeriodTypePublic(PeriodType.yearMonthDay());
        assertEquals(PeriodType.yearMonthDay(), result);
    }

    //-----------------------------------------------------------------------
    // getPeriodType
    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_normal_returnsCorrectType() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        assertEquals(PeriodType.standard(), p.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // size
    //-----------------------------------------------------------------------
    @Test
    public void testSize_standardType_returnsEight() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        assertEquals(8, p.size());
    }

    //-----------------------------------------------------------------------
    // getFieldType
    //-----------------------------------------------------------------------
    @Test
    public void testGetFieldType_validIndex_returnsCorrectField() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        assertEquals(DurationFieldType.years(), p.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndex_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        p.getFieldType(100);
    }

    //-----------------------------------------------------------------------
    // getValue
    //-----------------------------------------------------------------------
    @Test
    public void testGetValue_validIndex_returnsCorrectValue() {
        TestablePeriod p = new TestablePeriod(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, PeriodType.standard());
        assertEquals(3, p.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        p.getValue(100);
    }

    //-----------------------------------------------------------------------
    // toDurationFrom
    //-----------------------------------------------------------------------
    @Test
    public void testToDurationFrom_normal_returnsDuration() {
        TestablePeriod p = new TestablePeriod(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard());
        DateTime start = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration d = p.toDurationFrom(start);
        assertEquals(1000L * 60 * 60 * 24, d.getMillis());
    }

    //-----------------------------------------------------------------------
    // toDurationTo
    //-----------------------------------------------------------------------
    @Test
    public void testToDurationTo_normal_returnsDuration() {
        TestablePeriod p = new TestablePeriod(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard());
        DateTime end = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration d = p.toDurationTo(end);
        assertEquals(1000L * 60 * 60 * 24, d.getMillis());
    }

    //-----------------------------------------------------------------------
    // setPeriod(ReadablePeriod)
    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_nullPeriod_setsZeroValues() {
        TestablePeriod p = new TestablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        p.setPeriodPublic((ReadablePeriod) null);
        for (int i = 0; i < p.size(); i++) {
            assertEquals(0, p.getValue(i));
        }
    }

    @Test
    public void testSetPeriod_validPeriod_copiesValues() {
        TestablePeriod p = new TestablePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        Period source = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        p.setPeriodPublic(source);
        assertEquals(1, p.getValue(0));
        assertEquals(8, p.getValue(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod_unsupportedFieldNonZero_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[1], PeriodType.years());
        Period source = new Period(1, 2, 0, 0, 0, 0, 0, 0);
        p.setPeriodPublic(source);
    }

    //-----------------------------------------------------------------------
    // setPeriod(ints...)
    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriodInts_normal_setsValues() {
        TestablePeriod p = new TestablePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.setPeriodPublic(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(1, p.getValue(0));
        assertEquals(8, p.getValue(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriodInts_unsupportedFieldNonZero_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[1], PeriodType.years());
        p.setPeriodPublic(1, 2, 0, 0, 0, 0, 0, 0);
    }

    //-----------------------------------------------------------------------
    // setField / setFieldInto
    //-----------------------------------------------------------------------
    @Test
    public void testSetField_normal_setsValue() {
        TestablePeriod p = new TestablePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.setFieldPublic(DurationFieldType.years(), 10);
        assertEquals(10, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_unsupportedFieldNonZero_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[1], PeriodType.years());
        p.setFieldPublic(DurationFieldType.months(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_nullField_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[1], PeriodType.years());
        p.setFieldPublic(null, 0);
    }

    @Test
    public void testSetFieldInto_normal_setsValue() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        int[] values = new int[8];
        p.setFieldIntoPublic(values, DurationFieldType.years(), 7);
        assertEquals(7, values[0]);
    }

    //-----------------------------------------------------------------------
    // addField / addFieldInto
    //-----------------------------------------------------------------------
    @Test
    public void testAddField_normal_addsValue() {
        TestablePeriod p = new TestablePeriod(5, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.addFieldPublic(DurationFieldType.years(), 3);
        assertEquals(8, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_unsupportedFieldNonZero_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[1], PeriodType.years());
        p.addFieldPublic(DurationFieldType.months(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_nullField_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[1], PeriodType.years());
        p.addFieldPublic(null, 0);
    }

    @Test
    public void testAddFieldInto_normal_addsValue() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        int[] values = new int[]{5, 0, 0, 0, 0, 0, 0, 0};
        p.addFieldIntoPublic(values, DurationFieldType.years(), 3);
        assertEquals(8, values[0]);
    }

    //-----------------------------------------------------------------------
    // mergePeriod / mergePeriodInto
    //-----------------------------------------------------------------------
    @Test
    public void testMergePeriod_nullPeriod_doesNothing() {
        TestablePeriod p = new TestablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        p.mergePeriodPublic(null);
        assertEquals(1, p.getValue(0));
    }

    @Test
    public void testMergePeriod_validPeriod_mergesValues() {
        TestablePeriod p = new TestablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Period source = new Period(10, 20, 30, 40, 50, 60, 70, 80);
        p.mergePeriodPublic(source);
        assertEquals(10, p.getValue(0));
        assertEquals(80, p.getValue(7));
    }

    @Test
    public void testMergePeriodInto_normal_returnsUpdatedArray() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        int[] values = new int[8];
        Period source = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        int[] result = p.mergePeriodIntoPublic(values, source);
        assertEquals(1, result[0]);
        assertEquals(8, result[7]);
    }

    //-----------------------------------------------------------------------
    // addPeriod / addPeriodInto
    //-----------------------------------------------------------------------
    @Test
    public void testAddPeriod_nullPeriod_doesNothing() {
        TestablePeriod p = new TestablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        p.addPeriodPublic(null);
        assertEquals(1, p.getValue(0));
    }

    @Test
    public void testAddPeriod_validPeriod_addsValues() {
        TestablePeriod p = new TestablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Period source = new Period(1, 1, 1, 1, 1, 1, 1, 1);
        p.addPeriodPublic(source);
        assertEquals(2, p.getValue(0));
        assertEquals(9, p.getValue(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPeriodInto_unsupportedField_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[1], PeriodType.years());
        int[] values = new int[]{0};
        Period source = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        p.addPeriodIntoPublic(values, source);
    }

    @Test
    public void testAddPeriodInto_normal_returnsUpdatedArray() {
        TestablePeriod p = new TestablePeriod(new int[]{1, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
        int[] values = new int[]{1, 0, 0, 0, 0, 0, 0, 0};
        Period source = new Period(2, 0, 0, 0, 0, 0, 0, 0);
        int[] result = p.addPeriodIntoPublic(values, source);
        assertEquals(3, result[0]);
    }

    //-----------------------------------------------------------------------
    // setValue
    //-----------------------------------------------------------------------
    @Test
    public void testSetValue_normal_setsValueAtIndex() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        p.setValuePublic(2, 99);
        assertEquals(99, p.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValue_invalidIndex_throwsException() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        p.setValuePublic(100, 99);
    }

    //-----------------------------------------------------------------------
    // setValues
    //-----------------------------------------------------------------------
    @Test
    public void testSetValues_normal_replacesAllValues() {
        TestablePeriod p = new TestablePeriod(new int[8], PeriodType.standard());
        int[] newValues = new int[]{9, 8, 7, 6, 5, 4, 3, 2};
        p.setValuesPublic(newValues);
        assertEquals(9, p.getValue(0));
        assertEquals(2, p.getValue(7));
    }
}
