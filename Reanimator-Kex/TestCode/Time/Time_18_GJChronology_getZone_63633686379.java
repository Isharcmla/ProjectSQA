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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.chrono.EqualityUtils.*;
import java.lang.Object;

public class GJChronology_getZone_63633686379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24124;
     Object term24577;
     Object term24564;

    public GJChronology_getZone_63633686379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24124 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term24196 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term24124, term24124.getClass(), "iBase", term24196);
        term24577 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term24578 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term24577, term24577.getClass(), "iJulianChronology", null);
        setField(term24577, term24577.getClass(), "iGregorianChronology", null);
        setField(term24577, term24577.getClass(), "iCutoverInstant", null);
        setLongField(term24577, term24577.getClass(), "iCutoverMillis", 0L);
        setLongField(term24577, term24577.getClass(), "iGapDuration", 0L);
        setField(term24578, term24578.getClass(), "iJulianChronology", null);
        setField(term24578, term24578.getClass(), "iGregorianChronology", null);
        setField(term24578, term24578.getClass(), "iCutoverInstant", null);
        setLongField(term24578, term24578.getClass(), "iCutoverMillis", 0L);
        setLongField(term24578, term24578.getClass(), "iGapDuration", 0L);
        setField(term24578, term24578.getClass(), "iBase", null);
        setField(term24578, term24578.getClass(), "iParam", null);
        setField(term24578, term24578.getClass(), "iMillis", null);
        setField(term24578, term24578.getClass(), "iSeconds", null);
        setField(term24578, term24578.getClass(), "iMinutes", null);
        setField(term24578, term24578.getClass(), "iHours", null);
        setField(term24578, term24578.getClass(), "iHalfdays", null);
        setField(term24578, term24578.getClass(), "iDays", null);
        setField(term24578, term24578.getClass(), "iWeeks", null);
        setField(term24578, term24578.getClass(), "iWeekyears", null);
        setField(term24578, term24578.getClass(), "iMonths", null);
        setField(term24578, term24578.getClass(), "iYears", null);
        setField(term24578, term24578.getClass(), "iCenturies", null);
        setField(term24578, term24578.getClass(), "iEras", null);
        setField(term24578, term24578.getClass(), "iMillisOfSecond", null);
        setField(term24578, term24578.getClass(), "iMillisOfDay", null);
        setField(term24578, term24578.getClass(), "iSecondOfMinute", null);
        setField(term24578, term24578.getClass(), "iSecondOfDay", null);
        setField(term24578, term24578.getClass(), "iMinuteOfHour", null);
        setField(term24578, term24578.getClass(), "iMinuteOfDay", null);
        setField(term24578, term24578.getClass(), "iHourOfDay", null);
        setField(term24578, term24578.getClass(), "iClockhourOfDay", null);
        setField(term24578, term24578.getClass(), "iHourOfHalfday", null);
        setField(term24578, term24578.getClass(), "iClockhourOfHalfday", null);
        setField(term24578, term24578.getClass(), "iHalfdayOfDay", null);
        setField(term24578, term24578.getClass(), "iDayOfWeek", null);
        setField(term24578, term24578.getClass(), "iDayOfMonth", null);
        setField(term24578, term24578.getClass(), "iDayOfYear", null);
        setField(term24578, term24578.getClass(), "iWeekOfWeekyear", null);
        setField(term24578, term24578.getClass(), "iWeekyear", null);
        setField(term24578, term24578.getClass(), "iWeekyearOfCentury", null);
        setField(term24578, term24578.getClass(), "iMonthOfYear", null);
        setField(term24578, term24578.getClass(), "iYear", null);
        setField(term24578, term24578.getClass(), "iYearOfEra", null);
        setField(term24578, term24578.getClass(), "iYearOfCentury", null);
        setField(term24578, term24578.getClass(), "iCenturyOfEra", null);
        setField(term24578, term24578.getClass(), "iEra", null);
        setIntField(term24578, term24578.getClass(), "iBaseFlags", 0);
        setField(term24577, term24577.getClass(), "iBase", term24578);
        setField(term24577, term24577.getClass(), "iParam", null);
        setField(term24577, term24577.getClass(), "iMillis", null);
        setField(term24577, term24577.getClass(), "iSeconds", null);
        setField(term24577, term24577.getClass(), "iMinutes", null);
        setField(term24577, term24577.getClass(), "iHours", null);
        setField(term24577, term24577.getClass(), "iHalfdays", null);
        setField(term24577, term24577.getClass(), "iDays", null);
        setField(term24577, term24577.getClass(), "iWeeks", null);
        setField(term24577, term24577.getClass(), "iWeekyears", null);
        setField(term24577, term24577.getClass(), "iMonths", null);
        setField(term24577, term24577.getClass(), "iYears", null);
        setField(term24577, term24577.getClass(), "iCenturies", null);
        setField(term24577, term24577.getClass(), "iEras", null);
        setField(term24577, term24577.getClass(), "iMillisOfSecond", null);
        setField(term24577, term24577.getClass(), "iMillisOfDay", null);
        setField(term24577, term24577.getClass(), "iSecondOfMinute", null);
        setField(term24577, term24577.getClass(), "iSecondOfDay", null);
        setField(term24577, term24577.getClass(), "iMinuteOfHour", null);
        setField(term24577, term24577.getClass(), "iMinuteOfDay", null);
        setField(term24577, term24577.getClass(), "iHourOfDay", null);
        setField(term24577, term24577.getClass(), "iClockhourOfDay", null);
        setField(term24577, term24577.getClass(), "iHourOfHalfday", null);
        setField(term24577, term24577.getClass(), "iClockhourOfHalfday", null);
        setField(term24577, term24577.getClass(), "iHalfdayOfDay", null);
        setField(term24577, term24577.getClass(), "iDayOfWeek", null);
        setField(term24577, term24577.getClass(), "iDayOfMonth", null);
        setField(term24577, term24577.getClass(), "iDayOfYear", null);
        setField(term24577, term24577.getClass(), "iWeekOfWeekyear", null);
        setField(term24577, term24577.getClass(), "iWeekyear", null);
        setField(term24577, term24577.getClass(), "iWeekyearOfCentury", null);
        setField(term24577, term24577.getClass(), "iMonthOfYear", null);
        setField(term24577, term24577.getClass(), "iYear", null);
        setField(term24577, term24577.getClass(), "iYearOfEra", null);
        setField(term24577, term24577.getClass(), "iYearOfCentury", null);
        setField(term24577, term24577.getClass(), "iCenturyOfEra", null);
        setField(term24577, term24577.getClass(), "iEra", null);
        setIntField(term24577, term24577.getClass(), "iBaseFlags", 0);
        term24564 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term24564, term24564.getClass(), "iNameKey", "UTC");
        setIntField(term24564, term24564.getClass(), "iWallOffset", 0);
        setIntField(term24564, term24564.getClass(), "iStandardOffset", 0);
        setField(term24564, term24564.getClass(), "iID", "UTC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getZone", argTypes, term24124, args);
        assertTrue(recursiveEquals(term24124, term24577));
        assertTrue(recursiveEquals(retValue, term24564));
    }

};


