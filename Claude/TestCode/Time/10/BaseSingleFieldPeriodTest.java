package org.joda.time.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.ISOChronology;

public class BaseSingleFieldPeriodTest {

    //-----------------------------------------------------------------------
    // Concrete subclass exposing days field
    static class TestDaysPeriod extends BaseSingleFieldPeriod {
        TestDaysPeriod(int value) {
            super(value);
        }

        public DurationFieldType getFieldType() {
            return DurationFieldType.days();
        }

        public PeriodType getPeriodType() {
            return PeriodType.days();
        }

        public int publicGetValue() {
            return getValue();
        }

        public void publicSetValue(int v) {
            setValue(v);
        }
    }

    // Concrete subclass exposing hours field (different type for equals/compareTo tests)
    static class TestHoursPeriod extends BaseSingleFieldPeriod {
        TestHoursPeriod(int value) {
            super(value);
        }

        public DurationFieldType getFieldType() {
            return DurationFieldType.hours();
        }

        public PeriodType getPeriodType() {
            return PeriodType.hours();
        }
    }

    // Helper subclass to call protected static methods
    static class Helper extends BaseSingleFieldPeriod {
        Helper(int value) {
            super(value);
        }

        public DurationFieldType getFieldType() {
            return DurationFieldType.days();
        }

        public PeriodType getPeriodType() {
            return PeriodType.days();
        }

        public static int publicBetween(ReadableInstant start, ReadableInstant end, DurationFieldType field) {
            return between(start, end, field);
        }

        public static int publicBetween(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {
            return between(start, end, zeroInstance);
        }

        public static int publicStandardPeriodIn(ReadablePeriod period, long millisPerUnit) {
            return standardPeriodIn(period, millisPerUnit);
        }
    }

    //-----------------------------------------------------------------------
    // between(ReadableInstant, ReadableInstant, DurationFieldType)
    //-----------------------------------------------------------------------

    @Test
    public void testBetweenInstants_normal_returnsCorrectDifference() {
        DateTime start = new DateTime(2012, 1, 1, 0, 0, ISOChronology.getInstanceUTC());
        DateTime end = new DateTime(2012, 1, 10, 0, 0, ISOChronology.getInstanceUTC());
        int result = Helper.publicBetween(start, end, DurationFieldType.days());
        assertEquals(9, result);
    }

    @Test
    public void testBetweenInstants_sameInstant_returnsZero() {
        DateTime start = new DateTime(2012, 1, 1, 0, 0, ISOChronology.getInstanceUTC());
        DateTime end = new DateTime(2012, 1, 1, 0, 0, ISOChronology.getInstanceUTC());
        int result = Helper.publicBetween(start, end, DurationFieldType.days());
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetweenInstants_nullStart_throwsException() {
        DateTime end = new DateTime(2012, 1, 10, 0, 0, ISOChronology.getInstanceUTC());
        Helper.publicBetween(null, end, DurationFieldType.days());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetweenInstants_nullEnd_throwsException() {
        DateTime start = new DateTime(2012, 1, 1, 0, 0, ISOChronology.getInstanceUTC());
        Helper.publicBetween(start, null, DurationFieldType.days());
    }

    //-----------------------------------------------------------------------
    // between(ReadablePartial, ReadablePartial, ReadablePeriod)
    //-----------------------------------------------------------------------

    @Test
    public void testBetweenPartials_normal_returnsCorrectDifference() {
        LocalDate start = new LocalDate(2012, 1, 1);
        LocalDate end = new LocalDate(2012, 1, 10);
        TestDaysPeriod zero = new TestDaysPeriod(0);
        int result = Helper.publicBetween(start, end, zero);
        assertEquals(9, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetweenPartials_nullStart_throwsException() {
        LocalDate end = new LocalDate(2012, 1, 10);
        TestDaysPeriod zero = new TestDaysPeriod(0);
        Helper.publicBetween((ReadablePartial) null, end, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetweenPartials_nullEnd_throwsException() {
        LocalDate start = new LocalDate(2012, 1, 1);
        TestDaysPeriod zero = new TestDaysPeriod(0);
        Helper.publicBetween(start, (ReadablePartial) null, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetweenPartials_differentSize_throwsException() {
        LocalDate start = new LocalDate(2012, 1, 1);
        YearMonth end = new YearMonth(2012, 1);
        TestDaysPeriod zero = new TestDaysPeriod(0);
        Helper.publicBetween(start, end, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetweenPartials_differentFieldTypes_throwsException() {
        Partial p1 = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[]{2012, 1});
        Partial p2 = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()},
                new int[]{2012, 1});
        TestDaysPeriod zero = new TestDaysPeriod(0);
        Helper.publicBetween(p1, p2, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBetweenPartials_nonContiguous_throwsException() {
        Partial p1 = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()},
                new int[]{2012, 1});
        Partial p2 = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()},
                new int[]{2012, 10});
        TestDaysPeriod zero = new TestDaysPeriod(0);
        Helper.publicBetween(p1, p2, zero);
    }

    //-----------------------------------------------------------------------
    // standardPeriodIn(ReadablePeriod, long)
    //-----------------------------------------------------------------------

    @Test
    public void testStandardPeriodIn_nullPeriod_returnsZero() {
        int result = Helper.publicStandardPeriodIn(null, DateTimeConstants.MILLIS_PER_HOUR);
        assertEquals(0, result);
    }

    @Test
    public void testStandardPeriodIn_daysToHours_returnsCorrectValue() {
        Period period = Period.days(5);
        int result = Helper.publicStandardPeriodIn(period, DateTimeConstants.MILLIS_PER_HOUR);
        assertEquals(5 * 24, result);
    }

    @Test
    public void testStandardPeriodIn_zeroValue_returnsZero() {
        Period period = Period.days(0);
        int result = Helper.publicStandardPeriodIn(period, DateTimeConstants.MILLIS_PER_HOUR);
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStandardPeriodIn_imprecisePeriod_throwsException() {
        Period period = Period.months(1);
        Helper.publicStandardPeriodIn(period, DateTimeConstants.MILLIS_PER_HOUR);
    }

    //-----------------------------------------------------------------------
    // constructor, getValue, setValue
    //-----------------------------------------------------------------------

    @Test
    public void testConstructor_setsValue() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(5, p.publicGetValue());
    }

    @Test
    public void testSetValue_updatesValue() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        p.publicSetValue(10);
        assertEquals(10, p.publicGetValue());
    }

    @Test
    public void testSetValue_negativeValue_updatesValue() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        p.publicSetValue(-3);
        assertEquals(-3, p.publicGetValue());
    }

    //-----------------------------------------------------------------------
    // getFieldType(), getPeriodType()
    //-----------------------------------------------------------------------

    @Test
    public void testGetFieldType_returnsDays() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(DurationFieldType.days(), p.getFieldType());
    }

    @Test
    public void testGetPeriodType_returnsDaysType() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(PeriodType.days(), p.getPeriodType());
    }

    //-----------------------------------------------------------------------
    // size()
    //-----------------------------------------------------------------------

    @Test
    public void testSize_returnsOne() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(1, p.size());
    }

    //-----------------------------------------------------------------------
    // getFieldType(int)
    //-----------------------------------------------------------------------

    @Test
    public void testGetFieldTypeIndex_zero_returnsFieldType() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(DurationFieldType.days(), p.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldTypeIndex_nonZero_throwsException() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        p.getFieldType(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldTypeIndex_negative_throwsException() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        p.getFieldType(-1);
    }

    //-----------------------------------------------------------------------
    // getValue(int)
    //-----------------------------------------------------------------------

    @Test
    public void testGetValueIndex_zero_returnsValue() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(5, p.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueIndex_nonZero_throwsException() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        p.getValue(1);
    }

    //-----------------------------------------------------------------------
    // get(DurationFieldType)
    //-----------------------------------------------------------------------

    @Test
    public void testGet_matchingType_returnsValue() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(5, p.get(DurationFieldType.days()));
    }

    @Test
    public void testGet_nonMatchingType_returnsZero() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(0, p.get(DurationFieldType.hours()));
    }

    @Test
    public void testGet_nullType_returnsZero() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertEquals(0, p.get(null));
    }

    //-----------------------------------------------------------------------
    // isSupported(DurationFieldType)
    //-----------------------------------------------------------------------

    @Test
    public void testIsSupported_matchingType_returnsTrue() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertTrue(p.isSupported(DurationFieldType.days()));
    }

    @Test
    public void testIsSupported_nonMatchingType_returnsFalse() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertFalse(p.isSupported(DurationFieldType.hours()));
    }

    @Test
    public void testIsSupported_nullType_returnsFalse() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertFalse(p.isSupported(null));
    }

    //-----------------------------------------------------------------------
    // toPeriod()
    //-----------------------------------------------------------------------

    @Test
    public void testToPeriod_returnsCorrectPeriod() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        Period period = p.toPeriod();
        assertEquals(5, period.getDays());
    }

    @Test
    public void testToPeriod_zeroValue_returnsZeroDays() {
        TestDaysPeriod p = new TestDaysPeriod(0);
        Period period = p.toPeriod();
        assertEquals(0, period.getDays());
    }

    //-----------------------------------------------------------------------
    // toMutablePeriod()
    //-----------------------------------------------------------------------

    @Test
    public void testToMutablePeriod_returnsCorrectPeriod() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        MutablePeriod period = p.toMutablePeriod();
        assertEquals(5, period.getDays());
    }

    //-----------------------------------------------------------------------
    // equals()
    //-----------------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_notReadablePeriod_returnsFalse() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertFalse(p.equals("not a period"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        assertFalse(p.equals(null));
    }

    @Test
    public void testEquals_sameTypeSameValue_returnsTrue() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        TestDaysPeriod p2 = new TestDaysPeriod(5);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_sameTypeDifferentValue_returnsFalse() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        TestDaysPeriod p2 = new TestDaysPeriod(10);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_differentPeriodType_returnsFalse() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        TestHoursPeriod p2 = new TestHoursPeriod(5);
        assertFalse(p1.equals(p2));
    }

    //-----------------------------------------------------------------------
    // hashCode()
    //-----------------------------------------------------------------------

    @Test
    public void testHashCode_consistentWithEquals() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        TestDaysPeriod p2 = new TestDaysPeriod(5);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testHashCode_matchesExpectedFormula() {
        TestDaysPeriod p = new TestDaysPeriod(5);
        int expected = 17;
        expected = 27 * expected + 5;
        expected = 27 * expected + DurationFieldType.days().hashCode();
        assertEquals(expected, p.hashCode());
    }

    //-----------------------------------------------------------------------
    // compareTo()
    //-----------------------------------------------------------------------

    @Test
    public void testCompareTo_greaterValue_returnsPositive() {
        TestDaysPeriod p1 = new TestDaysPeriod(10);
        TestDaysPeriod p2 = new TestDaysPeriod(5);
        assertTrue(p1.compareTo(p2) > 0);
    }

    @Test
    public void testCompareTo_lesserValue_returnsNegative() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        TestDaysPeriod p2 = new TestDaysPeriod(10);
        assertTrue(p1.compareTo(p2) < 0);
    }

    @Test
    public void testCompareTo_equalValue_returnsZero() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        TestDaysPeriod p2 = new TestDaysPeriod(5);
        assertEquals(0, p1.compareTo(p2));
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_differentClass_throwsException() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        TestHoursPeriod p2 = new TestHoursPeriod(5);
        p1.compareTo(p2);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareTo_null_throwsException() {
        TestDaysPeriod p1 = new TestDaysPeriod(5);
        p1.compareTo(null);
    }
}
