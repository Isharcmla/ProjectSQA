package org.joda.time.chrono;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.joda.time.IllegalFieldValueException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GJChronology_getDateTimeMillis_135126430541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term244;
     Object term246;
     Object term248;
     Object term250;
     Object term252;
     Object term254;
     Object term256;

    public GJChronology_getDateTimeMillis_135126430541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term228 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term229 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        Object term230 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term234 = newInstance(Class.forName("java.lang.Object"));
        Object term236 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term239 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term230, term230.getClass(), "iYear", 2055867847);
        setLongField(term230, term230.getClass(), "iFirstDayMillis", 2936323121573284007L);
        setElement(term229, 0, term230);
        setField(term228, term228.getClass(), "iYearInfoCache", term229);
        setIntField(term228, term228.getClass(), "iMinDaysInFirstWeek", -1048298087);
        setField(term228, term228.getClass(), "iBase", null);
        setField(term228, term228.getClass(), "iParam", term234);
        setField(term228, term228.getClass(), "iMillis", null);
        setField(term228, term228.getClass(), "iSeconds", null);
        setField(term228, term228.getClass(), "iMinutes", null);
        setField(term228, term228.getClass(), "iHours", null);
        setField(term228, term228.getClass(), "iHalfdays", null);
        setField(term228, term228.getClass(), "iDays", null);
        setField(term228, term228.getClass(), "iWeeks", null);
        setField(term228, term228.getClass(), "iWeekyears", null);
        setField(term228, term228.getClass(), "iMonths", null);
        setField(term228, term228.getClass(), "iYears", null);
        setField(term228, term228.getClass(), "iCenturies", null);
        setField(term228, term228.getClass(), "iEras", null);
        setField(term228, term228.getClass(), "iMillisOfSecond", null);
        setField(term228, term228.getClass(), "iMillisOfDay", null);
        setField(term228, term228.getClass(), "iSecondOfMinute", null);
        setField(term228, term228.getClass(), "iSecondOfDay", null);
        setField(term228, term228.getClass(), "iMinuteOfHour", null);
        setField(term228, term228.getClass(), "iMinuteOfDay", null);
        setField(term228, term228.getClass(), "iHourOfDay", null);
        setField(term228, term228.getClass(), "iClockhourOfDay", null);
        setField(term228, term228.getClass(), "iHourOfHalfday", null);
        setField(term228, term228.getClass(), "iClockhourOfHalfday", null);
        setField(term228, term228.getClass(), "iHalfdayOfDay", null);
        setField(term228, term228.getClass(), "iDayOfWeek", null);
        setField(term228, term228.getClass(), "iDayOfMonth", null);
        setField(term228, term228.getClass(), "iDayOfYear", null);
        setField(term228, term228.getClass(), "iWeekOfWeekyear", null);
        setField(term228, term228.getClass(), "iWeekyear", null);
        setField(term228, term228.getClass(), "iWeekyearOfCentury", null);
        setField(term228, term228.getClass(), "iMonthOfYear", null);
        setField(term228, term228.getClass(), "iYear", null);
        setField(term228, term228.getClass(), "iYearOfEra", null);
        setField(term228, term228.getClass(), "iYearOfCentury", null);
        setField(term228, term228.getClass(), "iCenturyOfEra", null);
        setField(term228, term228.getClass(), "iEra", null);
        setIntField(term228, term228.getClass(), "iBaseFlags", 0);
        setField(term227, term227.getClass(), "iJulianChronology", term228);
        setField(term236, term236.getClass(), "iYearInfoCache", null);
        setIntField(term236, term236.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term236, term236.getClass(), "iBase", null);
        setField(term236, term236.getClass(), "iParam", null);
        setField(term236, term236.getClass(), "iMillis", null);
        setField(term236, term236.getClass(), "iSeconds", null);
        setField(term236, term236.getClass(), "iMinutes", null);
        setField(term236, term236.getClass(), "iHours", null);
        setField(term236, term236.getClass(), "iHalfdays", null);
        setField(term236, term236.getClass(), "iDays", null);
        setField(term236, term236.getClass(), "iWeeks", null);
        setField(term236, term236.getClass(), "iWeekyears", null);
        setField(term236, term236.getClass(), "iMonths", null);
        setField(term236, term236.getClass(), "iYears", null);
        setField(term236, term236.getClass(), "iCenturies", null);
        setField(term236, term236.getClass(), "iEras", null);
        setField(term236, term236.getClass(), "iMillisOfSecond", null);
        setField(term236, term236.getClass(), "iMillisOfDay", null);
        setField(term236, term236.getClass(), "iSecondOfMinute", null);
        setField(term236, term236.getClass(), "iSecondOfDay", null);
        setField(term236, term236.getClass(), "iMinuteOfHour", null);
        setField(term236, term236.getClass(), "iMinuteOfDay", null);
        setField(term236, term236.getClass(), "iHourOfDay", null);
        setField(term236, term236.getClass(), "iClockhourOfDay", null);
        setField(term236, term236.getClass(), "iHourOfHalfday", null);
        setField(term236, term236.getClass(), "iClockhourOfHalfday", null);
        setField(term236, term236.getClass(), "iHalfdayOfDay", null);
        setField(term236, term236.getClass(), "iDayOfWeek", null);
        setField(term236, term236.getClass(), "iDayOfMonth", null);
        setField(term236, term236.getClass(), "iDayOfYear", null);
        setField(term236, term236.getClass(), "iWeekOfWeekyear", null);
        setField(term236, term236.getClass(), "iWeekyear", null);
        setField(term236, term236.getClass(), "iWeekyearOfCentury", null);
        setField(term236, term236.getClass(), "iMonthOfYear", null);
        setField(term236, term236.getClass(), "iYear", null);
        setField(term236, term236.getClass(), "iYearOfEra", null);
        setField(term236, term236.getClass(), "iYearOfCentury", null);
        setField(term236, term236.getClass(), "iCenturyOfEra", null);
        setField(term236, term236.getClass(), "iEra", null);
        setIntField(term236, term236.getClass(), "iBaseFlags", 0);
        setField(term227, term227.getClass(), "iGregorianChronology", term236);
        setLongField(term239, term239.getClass(), "iMillis", 1790192411407L);
        setField(term227, term227.getClass(), "iCutoverInstant", term239);
        setLongField(term227, term227.getClass(), "iCutoverMillis", -1154553077993834885L);
        setLongField(term227, term227.getClass(), "iGapDuration", -2850532706972744550L);
        setField(term227, term227.getClass(), "iBase", null);
        setField(term227, term227.getClass(), "iParam", null);
        setField(term227, term227.getClass(), "iMillis", null);
        setField(term227, term227.getClass(), "iSeconds", null);
        setField(term227, term227.getClass(), "iMinutes", null);
        setField(term227, term227.getClass(), "iHours", null);
        setField(term227, term227.getClass(), "iHalfdays", null);
        setField(term227, term227.getClass(), "iDays", null);
        setField(term227, term227.getClass(), "iWeeks", null);
        setField(term227, term227.getClass(), "iWeekyears", null);
        setField(term227, term227.getClass(), "iMonths", null);
        setField(term227, term227.getClass(), "iYears", null);
        setField(term227, term227.getClass(), "iCenturies", null);
        setField(term227, term227.getClass(), "iEras", null);
        setField(term227, term227.getClass(), "iMillisOfSecond", null);
        setField(term227, term227.getClass(), "iMillisOfDay", null);
        setField(term227, term227.getClass(), "iSecondOfMinute", null);
        setField(term227, term227.getClass(), "iSecondOfDay", null);
        setField(term227, term227.getClass(), "iMinuteOfHour", null);
        setField(term227, term227.getClass(), "iMinuteOfDay", null);
        setField(term227, term227.getClass(), "iHourOfDay", null);
        setField(term227, term227.getClass(), "iClockhourOfDay", null);
        setField(term227, term227.getClass(), "iHourOfHalfday", null);
        setField(term227, term227.getClass(), "iClockhourOfHalfday", null);
        setField(term227, term227.getClass(), "iHalfdayOfDay", null);
        setField(term227, term227.getClass(), "iDayOfWeek", null);
        setField(term227, term227.getClass(), "iDayOfMonth", null);
        setField(term227, term227.getClass(), "iDayOfYear", null);
        setField(term227, term227.getClass(), "iWeekOfWeekyear", null);
        setField(term227, term227.getClass(), "iWeekyear", null);
        setField(term227, term227.getClass(), "iWeekyearOfCentury", null);
        setField(term227, term227.getClass(), "iMonthOfYear", null);
        setField(term227, term227.getClass(), "iYear", null);
        setField(term227, term227.getClass(), "iYearOfEra", null);
        setField(term227, term227.getClass(), "iYearOfCentury", null);
        setField(term227, term227.getClass(), "iCenturyOfEra", null);
        setField(term227, term227.getClass(), "iEra", null);
        setIntField(term227, term227.getClass(), "iBaseFlags", 0);
        term244 = new Integer(292681826);
        term246 = new Integer(458147407);
        term248 = new Integer(-184153539);
        term250 = new Integer(493620644);
        term252 = new Integer(1328271830);
        term254 = new Integer(1596070772);
        term256 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term244;
        args[1] = term246;
        args[2] = term248;
        args[3] = term250;
        args[4] = term252;
        args[5] = term254;
        args[6] = term256;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term227, args);
            assertTrue(false);
        }
        catch (IllegalFieldValueException e) {
        }

    }

};


