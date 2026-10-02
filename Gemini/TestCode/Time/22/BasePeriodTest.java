package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

public class BasePeriodTest {

    private static class ConcreteBasePeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;

        public ConcreteBasePeriod(int years, int months, int weeks, int days,
                                  int hours, int minutes, int seconds, int millis,
                                  PeriodType type) {
            super(years, months, weeks, days, hours, minutes, seconds, millis, type);
        }

        public ConcreteBasePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
            super(startInstant, endInstant, type, chrono);
        }

        public ConcreteBasePeriod(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type) {
            super(startInstant, endInstant, type);
        }

        public ConcreteBasePeriod(ReadablePartial start, ReadablePartial end, PeriodType type) {
            super(start, end, type);
        }

        public ConcreteBasePeriod(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) {
            super(startInstant, duration, type);
        }

        public ConcreteBasePeriod(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) {
            super(duration, endInstant, type);
        }

        public ConcreteBasePeriod(long duration) {
            super(duration);
        }

        public ConcreteBasePeriod(long duration, PeriodType type, Chronology chrono) {
            super(duration, type, chrono);
        }

        public ConcreteBasePeriod(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        public ConcreteBasePeriod(int[] values, PeriodType type) {
            super(values, type);
        }

        @Override
        public PeriodType checkPeriodType(PeriodType type) {
            return super.checkPeriodType(type);
        }

        @Override
        public void setPeriod(ReadablePeriod period) {
            super.setPeriod(period);
        }

        @Override
        public void setPeriod(int years, int months, int weeks, int days,
                              int hours, int minutes, int seconds, int millis) {
            super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
        }

        @Override
        public void setField(DurationFieldType field, int value) {
            super.setField(field, value);
        }

        @Override
        public void setFieldInto(int[] values, DurationFieldType field, int value) {
            super.setFieldInto(values, field, value);
        }

        @Override
        public void addField(DurationFieldType field, int value) {
            super.addField(field, value);
        }

        @Override
        public void addFieldInto(int[] values, DurationFieldType field, int value) {
            super.addFieldInto(values, field, value);
        }

        @Override
        public void mergePeriod(ReadablePeriod period) {
            super.mergePeriod(period);
        }

        @Override
        public int[] mergePeriodInto(int[] values, ReadablePeriod period) {
            return super.mergePeriodInto(values, period);
        }

        @Override
        public void addPeriod(ReadablePeriod period) {
            super.addPeriod(period);
        }

        @Override
        public int[] addPeriodInto(int[] values, ReadablePeriod period) {
            return super.addPeriodInto(values, period);
        }

        @Override
        public void setValue(int index, int value) {
            super.setValue(index, value);
        }

        @Override
        public void setValues(int[] values) {
            super.setValues(values);
        }
    }

    private static class ConcreteReadWritablePeriod extends BasePeriod implements ReadWritablePeriod {
        private static final long serialVersionUID = 1L;

        public ConcreteReadWritablePeriod(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        public void clear() {
            setValues(new int[size()]);
        }

        public void setValue(int index, int value) {
            super.setValue(index, value);
        }

        public void setValues(int[] values) {
            super.setValues(values);
        }

        public void setPeriod(ReadablePeriod period) {
            super.setPeriod(period);
        }

        public void setPeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) {
            super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
        }

        public void setField(DurationFieldType field, int value) {
            super.setField(field, value);
        }

        public void addField(DurationFieldType field, int value) {
            super.addField(field, value);
        }

        public void mergePeriod(ReadablePeriod period) {
            super.mergePeriod(period);
        }

        public void addPeriod(ReadablePeriod period) {
            super.addPeriod(period);
        }

        public void setYears(int years) {
            setField(DurationFieldType.years(), years);
        }

        public void addYears(int years) {
            addField(DurationFieldType.years(), years);
        }

        public void setMonths(int months) {
            setField(DurationFieldType.months(), months);
        }

        public void addMonths(int months) {
            addField(DurationFieldType.months(), months);
        }

        public void setWeeks(int weeks) {
            setField(DurationFieldType.weeks(), weeks);
        }

        public void addWeeks(int weeks) {
            addField(DurationFieldType.weeks(), weeks);
        }

        public void setDays(int days) {
            setField(DurationFieldType.days(), days);
        }

        public void addDays(int days) {
            addField(DurationFieldType.days(), days);
        }

        public void setHours(int hours) {
            setField(DurationFieldType.hours(), hours);
        }

        public void addHours(int hours) {
            addField(DurationFieldType.hours(), hours);
        }

        public void setMinutes(int minutes) {
            setField(DurationFieldType.minutes(), minutes);
        }

        public void addMinutes(int minutes) {
            addField(DurationFieldType.minutes(), minutes);
        }

        public void setSeconds(int seconds) {
            setField(DurationFieldType.seconds(), seconds);
        }

        public void addSeconds(int seconds) {
            addField(DurationFieldType.seconds(), seconds);
        }

        public void setMillis(int millis) {
            setField(DurationFieldType.millis(), millis);
        }

        public void addMillis(int millis) {
            addField(DurationFieldType.millis(), millis);
        }
    }

    // -----------------------------------------------------------------------
    // Constructor 1: (int, int, int, int, int, int, int, int, PeriodType)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_8IntFields_validValues() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Assert.assertEquals(1, p.getYears());
        Assert.assertEquals(2, p.getMonths());
        Assert.assertEquals(3, p.getWeeks());
        Assert.assertEquals(4, p.getDays());
        Assert.assertEquals(5, p.getHours());
        Assert.assertEquals(6, p.getMinutes());
        Assert.assertEquals(7, p.getSeconds());
        Assert.assertEquals(8, p.getMillis());
    }

    @Test
    public void testConstructor_8IntFields_nullPeriodTypeDefaultsStandard() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, null);
        Assert.assertEquals(PeriodType.standard(), p.getPeriodType());
        Assert.assertEquals(1, p.getYears());
    }

    @Test
    public void testConstructor_8IntFields_unsupportedFieldZeroAllowed() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        Assert.assertEquals(PeriodType.time(), p.getPeriodType());
        Assert.assertEquals(5, p.getValue(0)); // hours
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_8IntFields_unsupportedFieldNonZeroThrowsException() {
        new ConcreteBasePeriod(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.time());
    }

    // -----------------------------------------------------------------------
    // Constructor 2: (long, long, PeriodType, Chronology)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_longLongTypeChrono_normal() {
        long start = 0L;
        long end = 1000L * 60 * 60 * 24 * 3; // 3 days
        ConcreteBasePeriod p = new ConcreteBasePeriod(start, end, PeriodType.days(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(3, p.getDays());
    }

    @Test
    public void testConstructor_longLongTypeChrono_nullTypeAndChrono() {
        long start = 1000L;
        long end = 5000L;
        ConcreteBasePeriod p = new ConcreteBasePeriod(start, end, null, null);
        Assert.assertEquals(PeriodType.standard(), p.getPeriodType());
        Assert.assertEquals(4, p.getSeconds());
    }

    // -----------------------------------------------------------------------
    // Constructor 3: (ReadableInstant, ReadableInstant, PeriodType)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_readableInstants_bothNull() {
        ConcreteBasePeriod p = new ConcreteBasePeriod((ReadableInstant) null, (ReadableInstant) null, PeriodType.standard());
        Assert.assertEquals(PeriodType.standard(), p.getPeriodType());
        for (int i = 0; i < p.size(); i++) {
            Assert.assertEquals(0, p.getValue(i));
        }
    }

    @Test
    public void testConstructor_readableInstants_validInstants() {
        Instant start = new Instant(1000000L);
        Instant end = new Instant(2000000L);
        ConcreteBasePeriod p = new ConcreteBasePeriod(start, end, PeriodType.standard());
        Assert.assertEquals(1000, p.getSeconds());
    }

    @Test
    public void testConstructor_readableInstants_startNullEndNotNull() {
        Instant end = new Instant(DateTimeUtils.currentTimeMillis() + 60000L);
        ConcreteBasePeriod p = new ConcreteBasePeriod(null, end, PeriodType.minutes());
        Assert.assertTrue(p.getMinutes() >= 0);
    }

    @Test
    public void testConstructor_readableInstants_startNotNullEndNull() {
        Instant start = new Instant(DateTimeUtils.currentTimeMillis() - 60000L);
        ConcreteBasePeriod p = new ConcreteBasePeriod(start, null, PeriodType.minutes());
        Assert.assertTrue(p.getMinutes() >= 0);
    }

    // -----------------------------------------------------------------------
    // Constructor 4: (ReadablePartial, ReadablePartial, PeriodType)
    // -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_readablePartial_startNullThrowsException() {
        new ConcreteBasePeriod(null, new LocalDate(2020, 1, 1), PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_readablePartial_endNullThrowsException() {
        new ConcreteBasePeriod(new LocalDate(2020, 1, 1), null, PeriodType.standard());
    }

    @Test
    public void testConstructor_readablePartial_baseLocalSameClass() {
        LocalDate start = new LocalDate(2020, 1, 1);
        LocalDate end = new LocalDate(2020, 1, 11);
        ConcreteBasePeriod p = new ConcreteBasePeriod(start, end, PeriodType.days());
        Assert.assertEquals(10, p.getDays());
    }

    @Test
    public void testConstructor_readablePartial_baseLocalDifferentClassesThrowsException() {
        LocalDate start = new LocalDate(2020, 1, 1);
        LocalTime end = new LocalTime(12, 0);
        try {
            new ConcreteBasePeriod(start, end, PeriodType.standard());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_readablePartial_differentSizesThrowsException() {
        YearMonth ym = new YearMonth(2020, 1);
        LocalDate ld = new LocalDate(2020, 1, 1);
        new ConcreteBasePeriod(ym, ld, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_readablePartial_sameSizeDifferentFieldTypesThrowsException() {
        YearMonth ym = new YearMonth(2020, 1);
        MonthDay md = new MonthDay(1, 1);
        new ConcreteBasePeriod(ym, md, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_readablePartial_notContiguousThrowsException() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()};
        int[] values1 = new int[]{2020, 1};
        int[] values2 = new int[]{2020, 5};
        Partial p1 = new Partial(types, values1);
        Partial p2 = new Partial(types, values2);
        new ConcreteBasePeriod(p1, p2, PeriodType.standard());
    }

    @Test
    public void testConstructor_readablePartial_genericContiguousPartials() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()};
        Partial p1 = new Partial(types, new int[]{10, 15});
        Partial p2 = new Partial(types, new int[]{12, 45});
        ConcreteBasePeriod p = new ConcreteBasePeriod(p1, p2, PeriodType.hours());
        Assert.assertEquals(2, p.getHours());
    }

    // -----------------------------------------------------------------------
    // Constructor 5: (ReadableInstant, ReadableDuration, PeriodType)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_instantAndDuration_bothNull() {
        ConcreteBasePeriod p = new ConcreteBasePeriod((ReadableInstant) null, (ReadableDuration) null, null);
        Assert.assertEquals(PeriodType.standard(), p.getPeriodType());
    }

    @Test
    public void testConstructor_instantAndDuration_validValues() {
        DateTime start = new DateTime(2020, 1, 1, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration dur = Duration.standardHours(2);
        ConcreteBasePeriod p = new ConcreteBasePeriod(start, dur, PeriodType.hours());
        Assert.assertEquals(2, p.getHours());
    }

    // -----------------------------------------------------------------------
    // Constructor 6: (ReadableDuration, ReadableInstant, PeriodType)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_durationAndInstant_bothNull() {
        ConcreteBasePeriod p = new ConcreteBasePeriod((ReadableDuration) null, (ReadableInstant) null, null);
        Assert.assertEquals(PeriodType.standard(), p.getPeriodType());
    }

    @Test
    public void testConstructor_durationAndInstant_validValues() {
        DateTime end = new DateTime(2020, 1, 1, 2, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration dur = Duration.standardHours(2);
        ConcreteBasePeriod p = new ConcreteBasePeriod(dur, end, PeriodType.hours());
        Assert.assertEquals(2, p.getHours());
    }

    // -----------------------------------------------------------------------
    // Constructor 7 & 8: (long duration) & (long duration, PeriodType, Chronology)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_durationLongSingleParam() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(123456L);
        Assert.assertEquals(PeriodType.standard(), p.getPeriodType());
        Assert.assertEquals(123, p.getSeconds());
        Assert.assertEquals(456, p.getMillis());
    }

    @Test
    public void testConstructor_durationLongWithTypeAndChrono() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(3600000L, PeriodType.hours(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, p.getHours());
    }

    @Test
    public void testConstructor_durationLongWithNullTypeAndNullChrono() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1000L, null, null);
        Assert.assertEquals(PeriodType.standard(), p.getPeriodType());
        Assert.assertEquals(1, p.getSeconds());
    }

    // -----------------------------------------------------------------------
    // Constructor 9: (Object period, PeriodType, Chronology)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_objectPeriod_stringPeriod() {
        ConcreteBasePeriod p = new ConcreteBasePeriod("P1Y2M3W4DT5H6M7.008S", null, null);
        Assert.assertEquals(1, p.getYears());
        Assert.assertEquals(2, p.getMonths());
        Assert.assertEquals(3, p.getWeeks());
        Assert.assertEquals(4, p.getDays());
        Assert.assertEquals(5, p.getHours());
        Assert.assertEquals(6, p.getMinutes());
        Assert.assertEquals(7, p.getSeconds());
        Assert.assertEquals(8, p.getMillis());
    }

    @Test
    public void testConstructor_objectPeriod_readWritablePeriodInstance() {
        ConcreteReadWritablePeriod rwp = new ConcreteReadWritablePeriod("PT1H2M", PeriodType.time(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, rwp.getHours());
        Assert.assertEquals(2, rwp.getMinutes());
    }

    // -----------------------------------------------------------------------
    // Constructor 10: (int[] values, PeriodType)
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_intValuesAndPeriodType() {
        int[] vals = new int[]{10, 20};
        ConcreteBasePeriod p = new ConcreteBasePeriod(vals, PeriodType.yearMonth());
        Assert.assertEquals(10, p.getValue(0));
        Assert.assertEquals(20, p.getValue(1));
    }

    // -----------------------------------------------------------------------
    // Methods: checkPeriodType, size, getFieldType, getValue
    // -----------------------------------------------------------------------
    @Test
    public void testCheckPeriodType_nullReturnsStandard() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0L);
        Assert.assertEquals(PeriodType.standard(), p.checkPeriodType(null));
        Assert.assertEquals(PeriodType.days(), p.checkPeriodType(PeriodType.days()));
    }

    @Test
    public void testSizeAndGetFieldTypeAndGetValue() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 0, 0, 0, 0, 0, 0, PeriodType.yearMonth());
        Assert.assertEquals(2, p.size());
        Assert.assertEquals(DurationFieldType.years(), p.getFieldType(0));
        Assert.assertEquals(DurationFieldType.months(), p.getFieldType(1));
        Assert.assertEquals(1, p.getValue(0));
        Assert.assertEquals(2, p.getValue(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndexThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0L);
        p.getFieldType(99);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndexThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0L);
        p.getValue(99);
    }

    // -----------------------------------------------------------------------
    // Methods: toDurationFrom, toDurationTo
    // -----------------------------------------------------------------------
    @Test
    public void testToDurationFrom_validInstant() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.days());
        DateTime start = new DateTime(2020, 1, 1, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = p.toDurationFrom(start);
        Assert.assertEquals(86400000L, duration.getMillis());
    }

    @Test
    public void testToDurationFrom_nullInstantDefaultsToNow() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.hours());
        Duration duration = p.toDurationFrom(null);
        Assert.assertEquals(3600000L, duration.getMillis());
    }

    @Test
    public void testToDurationTo_validInstant() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.days());
        DateTime end = new DateTime(2020, 1, 2, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration duration = p.toDurationTo(end);
        Assert.assertEquals(86400000L, duration.getMillis());
    }

    @Test
    public void testToDurationTo_nullInstantDefaultsToNow() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.hours());
        Duration duration = p.toDurationTo(null);
        Assert.assertEquals(3600000L, duration.getMillis());
    }

    // -----------------------------------------------------------------------
    // Methods: setPeriod
    // -----------------------------------------------------------------------
    @Test
    public void testSetPeriod_readablePeriod_nullClearsValues() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        p.setPeriod((ReadablePeriod) null);
        for (int i = 0; i < p.size(); i++) {
            Assert.assertEquals(0, p.getValue(i));
        }
    }

    @Test
    public void testSetPeriod_readablePeriod_valid() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        Period src = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        p.setPeriod(src);
        Assert.assertEquals(1, p.getYears());
        Assert.assertEquals(8, p.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod_readablePeriod_unsupportedFieldThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.days());
        Period src = new Period(1, 0, 0, 0, 0, 0, 0, 0); // 1 year
        p.setPeriod(src);
    }

    @Test
    public void testSetPeriod_8Ints() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.setPeriod(10, 20, 30, 40, 50, 60, 70, 80);
        Assert.assertEquals(10, p.getYears());
        Assert.assertEquals(80, p.getMillis());
    }

    // -----------------------------------------------------------------------
    // Methods: setField, setFieldInto, addField, addFieldInto
    // -----------------------------------------------------------------------
    @Test
    public void testSetField_supportedField() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.setField(DurationFieldType.years(), 5);
        Assert.assertEquals(5, p.getYears());
    }

    @Test
    public void testSetField_unsupportedFieldZeroAllowed() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.days());
        p.setField(DurationFieldType.years(), 0);
        Assert.assertEquals(0, p.getDays());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_unsupportedFieldNonZeroThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.days());
        p.setField(DurationFieldType.years(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_nullFieldThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.setField(null, 5);
    }

    @Test
    public void testAddField_supportedField() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.addField(DurationFieldType.years(), 3);
        Assert.assertEquals(5, p.getYears());
    }

    @Test
    public void testAddField_unsupportedFieldZeroAllowed() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.days());
        p.addField(DurationFieldType.years(), 0);
        Assert.assertEquals(0, p.getDays());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_unsupportedFieldNonZeroThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.days());
        p.addField(DurationFieldType.years(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_nullFieldThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        p.addField(null, 1);
    }

    @Test
    public void testSetFieldIntoAndAddFieldInto() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        int[] values = new int[p.size()];
        p.setFieldInto(values, DurationFieldType.days(), 7);
        Assert.assertEquals(7, values[p.indexOf(DurationFieldType.days())]);

        p.addFieldInto(values, DurationFieldType.days(), 3);
        Assert.assertEquals(10, values[p.indexOf(DurationFieldType.days())]);
    }

    // -----------------------------------------------------------------------
    // Methods: mergePeriod, mergePeriodInto, addPeriod, addPeriodInto
    // -----------------------------------------------------------------------
    @Test
    public void testMergePeriod_nullNoOp() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        p.mergePeriod(null);
        Assert.assertEquals(1, p.getYears());
    }

    @Test
    public void testMergePeriod_validPeriod() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Period other = new Period(0, 0, 0, 10, 0, 0, 0, 0);
        p.mergePeriod(other);
        Assert.assertEquals(10, p.getDays());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMergePeriod_unsupportedNonZeroThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
        Period other = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        p.mergePeriod(other);
    }

    @Test
    public void testAddPeriod_nullNoOp() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        p.addPeriod(null);
        Assert.assertEquals(1, p.getYears());
    }

    @Test
    public void testAddPeriod_validPeriod() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Period other = new Period(2, 3, 0, 0, 0, 0, 0, 0);
        p.addPeriod(other);
        Assert.assertEquals(3, p.getYears());
        Assert.assertEquals(5, p.getMonths());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPeriod_unsupportedNonZeroThrowsException() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.hours());
        Period other = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        p.addPeriod(other);
    }

    @Test
    public void testAddPeriod_unsupportedZeroAllowed() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0, 0, 0, 0, 5, 0, 0, 0, PeriodType.hours());
        Period other = new Period(0, 0, 0, 0, 2, 0, 0, 0);
        p.addPeriod(other);
        Assert.assertEquals(7, p.getValue(0));
    }

    // -----------------------------------------------------------------------
    // Methods: setValue, setValues
    // -----------------------------------------------------------------------
    @Test
    public void testSetValueAndSetValues() {
        ConcreteBasePeriod p = new ConcreteBasePeriod(0L);
        p.setValue(0, 99);
        Assert.assertEquals(99, p.getValue(0));

        int[] newVals = new int[p.size()];
        newVals[1] = 42;
        p.setValues(newVals);
        Assert.assertEquals(42, p.getValue(1));
        Assert.assertEquals(0, p.getValue(0));
    }
}
