package org.joda.time.base;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Years;
import org.junit.Assert;
import org.junit.Test;

public class BaseSingleFieldPeriodTest {

    private static class SingleTestPeriod extends BaseSingleFieldPeriod {
        private static final long serialVersionUID = 1L;

        SingleTestPeriod(int period) {
            super(period);
        }

        public static int callBetween(ReadableInstant start, ReadableInstant end, DurationFieldType field) {
            return between(start, end, field);
        }

        public static int callBetween(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {
            return between(start, end, zeroInstance);
        }

        public static int callStandardPeriodIn(ReadablePeriod period, long millisPerUnit) {
            return standardPeriodIn(period, millisPerUnit);
        }

        public int callGetValue() {
            return getValue();
        }

        public void callSetValue(int value) {
            setValue(value);
        }

        @Override
        public DurationFieldType getFieldType() {
            return DurationFieldType.days();
        }

        @Override
        public PeriodType getPeriodType() {
            return PeriodType.days();
        }
    }

    private static class AnotherSingleTestPeriod extends BaseSingleFieldPeriod {
        private static final long serialVersionUID = 1L;

        AnotherSingleTestPeriod(int period) {
            super(period);
        }

        @Override
        public DurationFieldType getFieldType() {
            return DurationFieldType.hours();
        }

        @Override
        public PeriodType getPeriodType() {
            return PeriodType.hours();
        }
    }

    // ---------------------------------------------------------
    // between(ReadableInstant, ReadableInstant, DurationFieldType)
    // ---------------------------------------------------------

    @Test
    public void testBetween_ReadableInstant_normal() {
        DateTime start = new DateTime(2020, 1, 1, 0, 0, 0, DateTimeZone.UTC);
        DateTime end = new DateTime(2020, 1, 6, 0, 0, 0, DateTimeZone.UTC);
        int result = SingleTestPeriod.callBetween(start, end, DurationFieldType.days());
        Assert.assertEquals(5, result);

        int resultNegative = SingleTestPeriod.callBetween(end, start, DurationFieldType.days());
        Assert.assertEquals(-5, resultNegative);

        int resultZero = SingleTestPeriod.callBetween(start, start, DurationFieldType.days());
        Assert.assertEquals(0, resultZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ReadableInstant_nullStart_throwsException() {
        DateTime end = new DateTime(2020, 1, 6, 0, 0, 0, DateTimeZone.UTC);
        SingleTestPeriod.callBetween(null, end, DurationFieldType.days());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ReadableInstant_nullEnd_throwsException() {
        DateTime start = new DateTime(2020, 1, 1, 0, 0, 0, DateTimeZone.UTC);
        SingleTestPeriod.callBetween(start, null, DurationFieldType.days());
    }

    // ---------------------------------------------------------
    // between(ReadablePartial, ReadablePartial, ReadablePeriod)
    // ---------------------------------------------------------

    @Test
    public void testBetween_ReadablePartial_normal() {
        LocalDate start = new LocalDate(2020, 1, 1);
        LocalDate end = new LocalDate(2020, 1, 11);
        int result = SingleTestPeriod.callBetween(start, end, new SingleTestPeriod(0));
        Assert.assertEquals(10, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ReadablePartial_nullStart_throwsException() {
        LocalDate end = new LocalDate(2020, 1, 11);
        SingleTestPeriod.callBetween(null, end, new SingleTestPeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ReadablePartial_nullEnd_throwsException() {
        LocalDate start = new LocalDate(2020, 1, 1);
        SingleTestPeriod.callBetween(start, null, new SingleTestPeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ReadablePartial_differentSizes_throwsException() {
        LocalDate start = new LocalDate(2020, 1, 1);
        Partial end = new Partial(DateTimeFieldType.year(), 2020);
        SingleTestPeriod.callBetween(start, end, new SingleTestPeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ReadablePartial_differentFieldTypes_throwsException() {
        Partial start = new Partial(DateTimeFieldType.year(), 2020).with(DateTimeFieldType.monthOfYear(), 1);
        Partial end = new Partial(DateTimeFieldType.monthOfYear(), 1).with(DateTimeFieldType.dayOfMonth(), 10);
        SingleTestPeriod.callBetween(start, end, new SingleTestPeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ReadablePartial_notContiguous_throwsException() {
        Partial start = new Partial(DateTimeFieldType.year(), 2020).with(DateTimeFieldType.dayOfMonth(), 1);
        Partial end = new Partial(DateTimeFieldType.year(), 2020).with(DateTimeFieldType.dayOfMonth(), 10);
        SingleTestPeriod.callBetween(start, end, new SingleTestPeriod(0));
    }

    // ---------------------------------------------------------
    // standardPeriodIn(ReadablePeriod, long)
    // ---------------------------------------------------------

    @Test
    public void testStandardPeriodIn_nullPeriod_returnsZero() {
        int result = SingleTestPeriod.callStandardPeriodIn(null, 1000L);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testStandardPeriodIn_normal() {
        Period period = Period.hours(2).withMinutes(30);
        long millisPerMinute = 60000L;
        int result = SingleTestPeriod.callStandardPeriodIn(period, millisPerMinute);
        Assert.assertEquals(150, result);
    }

    @Test
    public void testStandardPeriodIn_withZeroValues() {
        Period period = Period.hours(0).withMinutes(0);
        int result = SingleTestPeriod.callStandardPeriodIn(period, 1000L);
        Assert.assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStandardPeriodIn_impreciseField_throwsException() {
        Period period = Period.months(1);
        SingleTestPeriod.callStandardPeriodIn(period, 1000L);
    }

    // ---------------------------------------------------------
    // Instance Methods
    // ---------------------------------------------------------

    @Test
    public void testGetAndSetValue() {
        SingleTestPeriod period = new SingleTestPeriod(10);
        Assert.assertEquals(10, period.callGetValue());
        period.callSetValue(25);
        Assert.assertEquals(25, period.callGetValue());
    }

    @Test
    public void testSize() {
        SingleTestPeriod period = new SingleTestPeriod(5);
        Assert.assertEquals(1, period.size());
    }

    @Test
    public void testGetFieldType_indexZero() {
        SingleTestPeriod period = new SingleTestPeriod(5);
        Assert.assertEquals(DurationFieldType.days(), period.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_invalidIndex_throwsException() {
        SingleTestPeriod period = new SingleTestPeriod(5);
        period.getFieldType(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_negativeIndex_throwsException() {
        SingleTestPeriod period = new SingleTestPeriod(5);
        period.getFieldType(-1);
    }

    @Test
    public void testGetValue_indexZero() {
        SingleTestPeriod period = new SingleTestPeriod(42);
        Assert.assertEquals(42, period.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex_throwsException() {
        SingleTestPeriod period = new SingleTestPeriod(42);
        period.getValue(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_negativeIndex_throwsException() {
        SingleTestPeriod period = new SingleTestPeriod(42);
        period.getValue(-1);
    }

    @Test
    public void testGet_byDurationFieldType() {
        SingleTestPeriod period = new SingleTestPeriod(7);
        Assert.assertEquals(7, period.get(DurationFieldType.days()));
        Assert.assertEquals(0, period.get(DurationFieldType.hours()));
        Assert.assertEquals(0, period.get(null));
    }

    @Test
    public void testIsSupported() {
        SingleTestPeriod period = new SingleTestPeriod(7);
        Assert.assertTrue(period.isSupported(DurationFieldType.days()));
        Assert.assertFalse(period.isSupported(DurationFieldType.hours()));
        Assert.assertFalse(period.isSupported(null));
    }

    @Test
    public void testToPeriod() {
        SingleTestPeriod period = new SingleTestPeriod(5);
        Period result = period.toPeriod();
        Assert.assertNotNull(result);
        Assert.assertEquals(5, result.getDays());
        Assert.assertEquals(PeriodType.standard(), result.getPeriodType());
    }

    @Test
    public void testToMutablePeriod() {
        SingleTestPeriod period = new SingleTestPeriod(5);
        MutablePeriod result = period.toMutablePeriod();
        Assert.assertNotNull(result);
        Assert.assertEquals(5, result.getDays());
        Assert.assertEquals(PeriodType.standard(), result.getPeriodType());
    }

    // ---------------------------------------------------------
    // equals and hashCode
    // ---------------------------------------------------------

    @Test
    public void testEquals_and_hashCode() {
        SingleTestPeriod period1 = new SingleTestPeriod(10);
        SingleTestPeriod period2 = new SingleTestPeriod(10);
        SingleTestPeriod period3 = new SingleTestPeriod(20);
        AnotherSingleTestPeriod differentFieldPeriod = new AnotherSingleTestPeriod(10);

        // Same instance
        Assert.assertTrue(period1.equals(period1));
        // Equal instances
        Assert.assertTrue(period1.equals(period2));
        Assert.assertTrue(period2.equals(period1));
        Assert.assertEquals(period1.hashCode(), period2.hashCode());

        // Different value
        Assert.assertFalse(period1.equals(period3));
        Assert.assertNotEquals(period1.hashCode(), period3.hashCode());

        // Different field/period type
        Assert.assertFalse(period1.equals(differentFieldPeriod));

        // Non-ReadablePeriod object
        Assert.assertFalse(period1.equals("Not a period"));
        // Null
        Assert.assertFalse(period1.equals(null));
    }

    // ---------------------------------------------------------
    // compareTo
    // ---------------------------------------------------------

    @Test
    public void testCompareTo_sameClass() {
        SingleTestPeriod period10 = new SingleTestPeriod(10);
        SingleTestPeriod period20 = new SingleTestPeriod(20);
        SingleTestPeriod period10Another = new SingleTestPeriod(10);

        Assert.assertEquals(0, period10.compareTo(period10Another));
        Assert.assertTrue(period10.compareTo(period20) < 0);
        Assert.assertTrue(period20.compareTo(period10) > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_null_throwsException() {
        SingleTestPeriod period = new SingleTestPeriod(10);
        period.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_differentClass_throwsException() {
        SingleTestPeriod period = new SingleTestPeriod(10);
        AnotherSingleTestPeriod other = new AnotherSingleTestPeriod(10);
        period.compareTo(other);
    }
}
