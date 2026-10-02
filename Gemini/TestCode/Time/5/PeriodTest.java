package org.joda.time;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PeriodTest {

    @Test
    public void testConstantsAndZero() {
        Period zero = Period.ZERO;
        Assert.assertNotNull(zero);
        Assert.assertEquals(0, zero.getYears());
        Assert.assertEquals(0, zero.getMonths());
        Assert.assertEquals(0, zero.getWeeks());
        Assert.assertEquals(0, zero.getDays());
        Assert.assertEquals(0, zero.getHours());
        Assert.assertEquals(0, zero.getMinutes());
        Assert.assertEquals(0, zero.getSeconds());
        Assert.assertEquals(0, zero.getMillis());
        Assert.assertEquals(PeriodType.standard(), zero.getPeriodType());
    }

    @Test
    public void testParse_string() {
        Period p = Period.parse("P1Y2M3W4DT5H6M7.008S");
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
    public void testParse_stringWithFormatter() {
        PeriodFormatter formatter = ISOPeriodFormat.standard();
        Period p = Period.parse("P2Y3M", formatter);
        Assert.assertEquals(2, p.getYears());
        Assert.assertEquals(3, p.getMonths());
        Assert.assertEquals(0, p.getDays());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_invalidString_throwsException() {
        Period.parse("invalid");
    }

    @Test
    public void testFactoryMethods() {
        Assert.assertEquals(5, Period.years(5).getYears());
        Assert.assertEquals(4, Period.months(4).getMonths());
        Assert.assertEquals(3, Period.weeks(3).getWeeks());
        Assert.assertEquals(2, Period.days(2).getDays());
        Assert.assertEquals(1, Period.hours(1).getHours());
        Assert.assertEquals(50, Period.minutes(50).getMinutes());
        Assert.assertEquals(40, Period.seconds(40).getSeconds());
        Assert.assertEquals(300, Period.millis(300).getMillis());

        Assert.assertEquals(-5, Period.years(-5).getYears());
        Assert.assertEquals(0, Period.years(0).getYears());
    }

    @Test
    public void testFieldDifference_validPartials() {
        LocalDate start = new LocalDate(2005, 6, 9);
        LocalDate end = new LocalDate(2007, 4, 12);
        Period p = Period.fieldDifference(start, end);
        Assert.assertEquals(2, p.getYears());
        Assert.assertEquals(-2, p.getMonths());
        Assert.assertEquals(3, p.getDays());

        LocalTime timeStart = new LocalTime(10, 20, 30, 40);
        LocalTime timeEnd = new LocalTime(12, 15, 35, 100);
        Period pTime = Period.fieldDifference(timeStart, timeEnd);
        Assert.assertEquals(2, pTime.getHours());
        Assert.assertEquals(-5, pTime.getMinutes());
        Assert.assertEquals(5, pTime.getSeconds());
        Assert.assertEquals(60, pTime.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_startNull_throwsException() {
        Period.fieldDifference(null, new LocalDate(2020, 1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_endNull_throwsException() {
        Period.fieldDifference(new LocalDate(2020, 1, 1), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_differentSize_throwsException() {
        YearMonth start = new YearMonth(2020, 1);
        LocalDate end = new LocalDate(2020, 1, 1);
        Period.fieldDifference(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_differentFieldTypes_throwsException() {
        Partial start = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Partial end = new Partial(DateTimeFieldType.minuteOfHour(), 10);
        Period.fieldDifference(start, end);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFieldDifference_overlappingFields_throwsException() {
        Partial start = new Partial()
                .with(DateTimeFieldType.dayOfMonth(), 1)
                .with(DateTimeFieldType.dayOfWeek(), 1);
        Partial end = new Partial()
                .with(DateTimeFieldType.dayOfMonth(), 2)
                .with(DateTimeFieldType.dayOfWeek(), 2);
        Period.fieldDifference(start, end);
    }

    @Test
    public void testConstructors() {
        Period p0 = new Period();
        Assert.assertEquals(0, p0.getYears());

        Period p4 = new Period(1, 2, 3, 4);
        Assert.assertEquals(0, p4.getYears());
        Assert.assertEquals(1, p4.getHours());
        Assert.assertEquals(2, p4.getMinutes());
        Assert.assertEquals(3, p4.getSeconds());
        Assert.assertEquals(4, p4.getMillis());

        Period p8 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertEquals(1, p8.getYears());
        Assert.assertEquals(2, p8.getMonths());
        Assert.assertEquals(3, p8.getWeeks());
        Assert.assertEquals(4, p8.getDays());
        Assert.assertEquals(5, p8.getHours());
        Assert.assertEquals(6, p8.getMinutes());
        Assert.assertEquals(7, p8.getSeconds());
        Assert.assertEquals(8, p8.getMillis());

        Period pType = new Period(1, 2, 0, 0, 0, 0, 0, 0, PeriodType.yearMonthDayTime());
        Assert.assertEquals(1, pType.getYears());
        Assert.assertEquals(2, pType.getMonths());

        Period pDuration = new Period(3661001L);
        Assert.assertEquals(1, pDuration.getHours());
        Assert.assertEquals(1, pDuration.getMinutes());
        Assert.assertEquals(1, pDuration.getSeconds());
        Assert.assertEquals(1, pDuration.getMillis());

        Period pDurationType = new Period(3661001L, PeriodType.time());
        Assert.assertEquals(1, pDurationType.getHours());

        Period pDurationChrono = new Period(3661001L, ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pDurationChrono.getHours());

        Period pDurationTypeChrono = new Period(3661001L, PeriodType.time(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pDurationTypeChrono.getHours());

        Period pInstants = new Period(1000L, 5000L);
        Assert.assertEquals(4, pInstants.getSeconds());

        Period pInstantsType = new Period(1000L, 5000L, PeriodType.standard());
        Assert.assertEquals(4, pInstantsType.getSeconds());

        Period pInstantsChrono = new Period(1000L, 5000L, ISOChronology.getInstanceUTC());
        Assert.assertEquals(4, pInstantsChrono.getSeconds());

        Period pInstantsTypeChrono = new Period(1000L, 5000L, PeriodType.standard(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(4, pInstantsTypeChrono.getSeconds());

        DateTime dt1 = new DateTime(2020, 1, 1, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2020, 2, 1, 0, 0, 0, 0);
        Period pReadInstants = new Period(dt1, dt2);
        Assert.assertEquals(1, pReadInstants.getMonths());

        Period pReadInstantsType = new Period(dt1, dt2, PeriodType.months());
        Assert.assertEquals(1, pReadInstantsType.getMonths());

        LocalDate ld1 = new LocalDate(2020, 1, 1);
        LocalDate ld2 = new LocalDate(2020, 1, 15);
        Period pPartials = new Period(ld1, ld2);
        Assert.assertEquals(2, pPartials.getWeeks());

        Period pPartialsType = new Period(ld1, ld2, PeriodType.days());
        Assert.assertEquals(14, pPartialsType.getDays());

        Duration dur = new Duration(5000L);
        Period pStartDur = new Period(dt1, dur);
        Assert.assertEquals(5, pStartDur.getSeconds());

        Period pStartDurType = new Period(dt1, dur, PeriodType.seconds());
        Assert.assertEquals(5, pStartDurType.getSeconds());

        Period pDurEnd = new Period(dur, dt2);
        Assert.assertEquals(5, pDurEnd.getSeconds());

        Period pDurEndType = new Period(dur, dt2, PeriodType.seconds());
        Assert.assertEquals(5, pDurEndType.getSeconds());

        Period pObj = new Period("P1Y2M");
        Assert.assertEquals(1, pObj.getYears());
        Assert.assertEquals(2, pObj.getMonths());

        Period pObjType = new Period("P1Y2M", PeriodType.yearMonthDay());
        Assert.assertEquals(1, pObjType.getYears());

        Period pObjChrono = new Period("P1Y2M", ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pObjChrono.getYears());

        Period pObjTypeChrono = new Period("P1Y2M", PeriodType.yearMonthDay(), ISOChronology.getInstanceUTC());
        Assert.assertEquals(1, pObjTypeChrono.getYears());
    }

    @Test
    public void testToPeriod() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertSame(p, p.toPeriod());
    }

    @Test
    public void testWithPeriodType() {
        Period p = new Period(0, 0, 2, 3, 4, 5, 6, 7);
        Assert.assertSame(p, p.withPeriodType(PeriodType.standard()));

        Period converted = p.withPeriodType(PeriodType.dayTime());
        Assert.assertEquals(0, converted.getWeeks());
        Assert.assertEquals(17, converted.getDays());

        Period defaultType = converted.withPeriodType(null);
        Assert.assertEquals(PeriodType.standard(), defaultType.getPeriodType());
    }

    @Test
    public void testWithFields() {
        Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertSame(base, base.withFields(null));

        Period additional = new Period(0, 5, 0, 10, 0, 0, 0, 0);
        Period result = base.withFields(additional);
        Assert.assertEquals(1, result.getYears());
        Assert.assertEquals(5, result.getMonths());
        Assert.assertEquals(3, result.getWeeks());
        Assert.assertEquals(10, result.getDays());
        Assert.assertEquals(5, result.getHours());
    }

    @Test
    public void testWithField() {
        Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period updated = base.withField(DurationFieldType.years(), 10);
        Assert.assertEquals(10, updated.getYears());
        Assert.assertEquals(2, updated.getMonths());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_nullField_throwsException() {
        Period.ZERO.withField(null, 1);
    }

    @Test
    public void testWithFieldAdded() {
        Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertSame(base, base.withFieldAdded(DurationFieldType.years(), 0));

        Period updated = base.withFieldAdded(DurationFieldType.years(), 5);
        Assert.assertEquals(6, updated.getYears());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_nullField_throwsException() {
        Period.ZERO.withFieldAdded(null, 1);
    }

    @Test
    public void testWithIndividualFields() {
        Period p = Period.ZERO
                .withYears(1)
                .withMonths(2)
                .withWeeks(3)
                .withDays(4)
                .withHours(5)
                .withMinutes(6)
                .withSeconds(7)
                .withMillis(8);

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
    public void testPlusReadablePeriod() {
        Period p1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertSame(p1, p1.plus(null));

        Period p2 = new Period(2, 3, 4, 5, 6, 7, 8, 9);
        Period res = p1.plus(p2);
        Assert.assertEquals(3, res.getYears());
        Assert.assertEquals(5, res.getMonths());
        Assert.assertEquals(7, res.getWeeks());
        Assert.assertEquals(9, res.getDays());
        Assert.assertEquals(11, res.getHours());
        Assert.assertEquals(13, res.getMinutes());
        Assert.assertEquals(15, res.getSeconds());
        Assert.assertEquals(17, res.getMillis());
    }

    @Test
    public void testPlusIndividualFields() {
        Period p = Period.ZERO;
        Assert.assertSame(p, p.plusYears(0));
        Assert.assertSame(p, p.plusMonths(0));
        Assert.assertSame(p, p.plusWeeks(0));
        Assert.assertSame(p, p.plusDays(0));
        Assert.assertSame(p, p.plusHours(0));
        Assert.assertSame(p, p.plusMinutes(0));
        Assert.assertSame(p, p.plusSeconds(0));
        Assert.assertSame(p, p.plusMillis(0));

        p = p.plusYears(1)
                .plusMonths(2)
                .plusWeeks(3)
                .plusDays(4)
                .plusHours(5)
                .plusMinutes(6)
                .plusSeconds(7)
                .plusMillis(8);

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
    public void testMinusReadablePeriod() {
        Period p1 = new Period(5, 5, 5, 5, 5, 5, 5, 5);
        Assert.assertSame(p1, p1.minus(null));

        Period p2 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period res = p1.minus(p2);
        Assert.assertEquals(4, res.getYears());
        Assert.assertEquals(3, res.getMonths());
        Assert.assertEquals(2, res.getWeeks());
        Assert.assertEquals(1, res.getDays());
        Assert.assertEquals(0, res.getHours());
        Assert.assertEquals(-1, res.getMinutes());
        Assert.assertEquals(-2, res.getSeconds());
        Assert.assertEquals(-3, res.getMillis());
    }

    @Test
    public void testMinusIndividualFields() {
        Period p = new Period(10, 10, 10, 10, 10, 10, 10, 10);
        Assert.assertSame(p, p.minusYears(0));
        Assert.assertSame(p, p.minusMonths(0));
        Assert.assertSame(p, p.minusWeeks(0));
        Assert.assertSame(p, p.minusDays(0));
        Assert.assertSame(p, p.minusHours(0));
        Assert.assertSame(p, p.minusMinutes(0));
        Assert.assertSame(p, p.minusSeconds(0));
        Assert.assertSame(p, p.minusMillis(0));

        p = p.minusYears(1)
                .minusMonths(2)
                .minusWeeks(3)
                .minusDays(4)
                .minusHours(5)
                .minusMinutes(6)
                .minusSeconds(7)
                .minusMillis(8);

        Assert.assertEquals(9, p.getYears());
        Assert.assertEquals(8, p.getMonths());
        Assert.assertEquals(7, p.getWeeks());
        Assert.assertEquals(6, p.getDays());
        Assert.assertEquals(5, p.getHours());
        Assert.assertEquals(4, p.getMinutes());
        Assert.assertEquals(3, p.getSeconds());
        Assert.assertEquals(2, p.getMillis());
    }

    @Test
    public void testMultipliedByAndNegated() {
        Period zero = Period.ZERO;
        Assert.assertSame(zero, zero.multipliedBy(5));

        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertSame(p, p.multipliedBy(1));

        Period multiplied = p.multipliedBy(2);
        Assert.assertEquals(2, multiplied.getYears());
        Assert.assertEquals(4, multiplied.getMonths());
        Assert.assertEquals(6, multiplied.getWeeks());
        Assert.assertEquals(8, multiplied.getDays());
        Assert.assertEquals(10, multiplied.getHours());
        Assert.assertEquals(12, multiplied.getMinutes());
        Assert.assertEquals(14, multiplied.getSeconds());
        Assert.assertEquals(16, multiplied.getMillis());

        Period negated = p.negated();
        Assert.assertEquals(-1, negated.getYears());
        Assert.assertEquals(-2, negated.getMonths());
        Assert.assertEquals(-3, negated.getWeeks());
        Assert.assertEquals(-4, negated.getDays());
        Assert.assertEquals(-5, negated.getHours());
        Assert.assertEquals(-6, negated.getMinutes());
        Assert.assertEquals(-7, negated.getSeconds());
        Assert.assertEquals(-8, negated.getMillis());
    }

    @Test
    public void testToStandardWeeks() {
        Period p = new Period(0, 0, 2, 14, 0, 0, 0, 0);
        Assert.assertEquals(Weeks.weeks(4), p.toStandardWeeks());

        Period pWithTime = new Period(0, 0, 1, 6, 23, 59, 59, 1000);
        Assert.assertEquals(Weeks.weeks(2), pWithTime.toStandardWeeks());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardWeeks_withYears_throwsException() {
        Period.years(1).toStandardWeeks();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardWeeks_withMonths_throwsException() {
        Period.months(1).toStandardWeeks();
    }

    @Test
    public void testToStandardDays() {
        Period p = new Period(0, 0, 2, 3, 48, 0, 0, 0);
        Assert.assertEquals(Days.days(19), p.toStandardDays());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardDays_withMonths_throwsException() {
        Period.months(1).toStandardDays();
    }

    @Test
    public void testToStandardHours() {
        Period p = new Period(0, 0, 1, 1, 2, 120, 0, 0);
        Assert.assertEquals(Hours.hours(7 * 24 + 24 + 4), p.toStandardHours());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardHours_withYears_throwsException() {
        Period.years(1).toStandardHours();
    }

    @Test
    public void testToStandardMinutes() {
        Period p = new Period(0, 0, 0, 1, 2, 3, 120, 0);
        Assert.assertEquals(Minutes.minutes(24 * 60 + 2 * 60 + 3 + 2), p.toStandardMinutes());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardMinutes_withYears_throwsException() {
        Period.years(1).toStandardMinutes();
    }

    @Test
    public void testToStandardSeconds() {
        Period p = new Period(0, 0, 0, 0, 1, 1, 1, 2000);
        Assert.assertEquals(Seconds.seconds(3600 + 60 + 1 + 2), p.toStandardSeconds());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardSeconds_withMonths_throwsException() {
        Period.months(1).toStandardSeconds();
    }

    @Test
    public void testToStandardDuration() {
        Period p = new Period(0, 0, 1, 2, 3, 4, 5, 6);
        long expectedMillis = (7L + 2L) * 24L * 3600L * 1000L
                + 3L * 3600L * 1000L
                + 4L * 60L * 1000L
                + 5L * 1000L
                + 6L;
        Assert.assertEquals(new Duration(expectedMillis), p.toStandardDuration());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToStandardDuration_withYears_throwsException() {
        Period.years(1).toStandardDuration();
    }

    @Test
    public void testNormalizedStandard() {
        Period p = new Period(1, 15, 2, 8, 25, 65, 65, 1005);
        Period normalized = p.normalizedStandard();

        Assert.assertEquals(2, normalized.getYears());
        Assert.assertEquals(3, normalized.getMonths());
        Assert.assertEquals(3, normalized.getWeeks());
        Assert.assertEquals(2, normalized.getDays());
        Assert.assertEquals(2, normalized.getHours());
        Assert.assertEquals(6, normalized.getMinutes());
        Assert.assertEquals(6, normalized.getSeconds());
        Assert.assertEquals(5, normalized.getMillis());
    }

    @Test
    public void testNormalizedStandard_withPeriodType() {
        Period p = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        Period normYearMonth = p.normalizedStandard(PeriodType.yearMonthDay());
        Assert.assertEquals(2, normYearMonth.getYears());
        Assert.assertEquals(3, normYearMonth.getMonths());

        Period pNoYearMonth = new Period(0, 0, 0, 0, 25, 0, 0, 0);
        Period normDayTime = pNoYearMonth.normalizedStandard(PeriodType.dayTime());
        Assert.assertEquals(1, normDayTime.getDays());
        Assert.assertEquals(1, normDayTime.getHours());

        Period normDefaultType = p.normalizedStandard(null);
        Assert.assertEquals(PeriodType.standard(), normDefaultType.getPeriodType());
        Assert.assertEquals(2, normDefaultType.getYears());
        Assert.assertEquals(3, normDefaultType.getMonths());

        Period pOnlyMonths = new Period(0, 5, 0, 0, 0, 0, 0, 0);
        Period normOnlyMonths = pOnlyMonths.normalizedStandard();
        Assert.assertEquals(0, normOnlyMonths.getYears());
        Assert.assertEquals(5, normOnlyMonths.getMonths());

        Period pOnlyYears = new Period(5, 0, 0, 0, 0, 0, 0, 0);
        Period normOnlyYears = pOnlyYears.normalizedStandard();
        Assert.assertEquals(5, normOnlyYears.getYears());
        Assert.assertEquals(0, normOnlyYears.getMonths());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizedStandard_withUnsupportedYearMonthType_throwsException() {
        Period p = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        p.normalizedStandard(PeriodType.time());
    }

    @Test
    public void testSerialization() throws Exception {
        Period original = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Period deserialized = (Period) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
    }
}
