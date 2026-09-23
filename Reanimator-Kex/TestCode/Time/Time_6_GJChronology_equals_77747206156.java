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

public class GJChronology_equals_77747206156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78852;
     Object term78924;
     Object term82429;
     Object term82430;

    public GJChronology_equals_77747206156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78852 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setLongField(term78852, term78852.getClass(), "iCutoverMillis", -1L);
        term78924 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setLongField(term78924, term78924.getClass(), "iCutoverMillis", 0L);
        term82429 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term82429, term82429.getClass(), "iJulianChronology", null);
        setField(term82429, term82429.getClass(), "iGregorianChronology", null);
        setField(term82429, term82429.getClass(), "iCutoverInstant", null);
        setLongField(term82429, term82429.getClass(), "iCutoverMillis", -1L);
        setLongField(term82429, term82429.getClass(), "iGapDuration", 0L);
        setField(term82429, term82429.getClass(), "iBase", null);
        setField(term82429, term82429.getClass(), "iParam", null);
        setField(term82429, term82429.getClass(), "iMillis", null);
        setField(term82429, term82429.getClass(), "iSeconds", null);
        setField(term82429, term82429.getClass(), "iMinutes", null);
        setField(term82429, term82429.getClass(), "iHours", null);
        setField(term82429, term82429.getClass(), "iHalfdays", null);
        setField(term82429, term82429.getClass(), "iDays", null);
        setField(term82429, term82429.getClass(), "iWeeks", null);
        setField(term82429, term82429.getClass(), "iWeekyears", null);
        setField(term82429, term82429.getClass(), "iMonths", null);
        setField(term82429, term82429.getClass(), "iYears", null);
        setField(term82429, term82429.getClass(), "iCenturies", null);
        setField(term82429, term82429.getClass(), "iEras", null);
        setField(term82429, term82429.getClass(), "iMillisOfSecond", null);
        setField(term82429, term82429.getClass(), "iMillisOfDay", null);
        setField(term82429, term82429.getClass(), "iSecondOfMinute", null);
        setField(term82429, term82429.getClass(), "iSecondOfDay", null);
        setField(term82429, term82429.getClass(), "iMinuteOfHour", null);
        setField(term82429, term82429.getClass(), "iMinuteOfDay", null);
        setField(term82429, term82429.getClass(), "iHourOfDay", null);
        setField(term82429, term82429.getClass(), "iClockhourOfDay", null);
        setField(term82429, term82429.getClass(), "iHourOfHalfday", null);
        setField(term82429, term82429.getClass(), "iClockhourOfHalfday", null);
        setField(term82429, term82429.getClass(), "iHalfdayOfDay", null);
        setField(term82429, term82429.getClass(), "iDayOfWeek", null);
        setField(term82429, term82429.getClass(), "iDayOfMonth", null);
        setField(term82429, term82429.getClass(), "iDayOfYear", null);
        setField(term82429, term82429.getClass(), "iWeekOfWeekyear", null);
        setField(term82429, term82429.getClass(), "iWeekyear", null);
        setField(term82429, term82429.getClass(), "iWeekyearOfCentury", null);
        setField(term82429, term82429.getClass(), "iMonthOfYear", null);
        setField(term82429, term82429.getClass(), "iYear", null);
        setField(term82429, term82429.getClass(), "iYearOfEra", null);
        setField(term82429, term82429.getClass(), "iYearOfCentury", null);
        setField(term82429, term82429.getClass(), "iCenturyOfEra", null);
        setField(term82429, term82429.getClass(), "iEra", null);
        setIntField(term82429, term82429.getClass(), "iBaseFlags", 0);
        term82430 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term82430, term82430.getClass(), "iJulianChronology", null);
        setField(term82430, term82430.getClass(), "iGregorianChronology", null);
        setField(term82430, term82430.getClass(), "iCutoverInstant", null);
        setLongField(term82430, term82430.getClass(), "iCutoverMillis", 0L);
        setLongField(term82430, term82430.getClass(), "iGapDuration", 0L);
        setField(term82430, term82430.getClass(), "iBase", null);
        setField(term82430, term82430.getClass(), "iParam", null);
        setField(term82430, term82430.getClass(), "iMillis", null);
        setField(term82430, term82430.getClass(), "iSeconds", null);
        setField(term82430, term82430.getClass(), "iMinutes", null);
        setField(term82430, term82430.getClass(), "iHours", null);
        setField(term82430, term82430.getClass(), "iHalfdays", null);
        setField(term82430, term82430.getClass(), "iDays", null);
        setField(term82430, term82430.getClass(), "iWeeks", null);
        setField(term82430, term82430.getClass(), "iWeekyears", null);
        setField(term82430, term82430.getClass(), "iMonths", null);
        setField(term82430, term82430.getClass(), "iYears", null);
        setField(term82430, term82430.getClass(), "iCenturies", null);
        setField(term82430, term82430.getClass(), "iEras", null);
        setField(term82430, term82430.getClass(), "iMillisOfSecond", null);
        setField(term82430, term82430.getClass(), "iMillisOfDay", null);
        setField(term82430, term82430.getClass(), "iSecondOfMinute", null);
        setField(term82430, term82430.getClass(), "iSecondOfDay", null);
        setField(term82430, term82430.getClass(), "iMinuteOfHour", null);
        setField(term82430, term82430.getClass(), "iMinuteOfDay", null);
        setField(term82430, term82430.getClass(), "iHourOfDay", null);
        setField(term82430, term82430.getClass(), "iClockhourOfDay", null);
        setField(term82430, term82430.getClass(), "iHourOfHalfday", null);
        setField(term82430, term82430.getClass(), "iClockhourOfHalfday", null);
        setField(term82430, term82430.getClass(), "iHalfdayOfDay", null);
        setField(term82430, term82430.getClass(), "iDayOfWeek", null);
        setField(term82430, term82430.getClass(), "iDayOfMonth", null);
        setField(term82430, term82430.getClass(), "iDayOfYear", null);
        setField(term82430, term82430.getClass(), "iWeekOfWeekyear", null);
        setField(term82430, term82430.getClass(), "iWeekyear", null);
        setField(term82430, term82430.getClass(), "iWeekyearOfCentury", null);
        setField(term82430, term82430.getClass(), "iMonthOfYear", null);
        setField(term82430, term82430.getClass(), "iYear", null);
        setField(term82430, term82430.getClass(), "iYearOfEra", null);
        setField(term82430, term82430.getClass(), "iYearOfCentury", null);
        setField(term82430, term82430.getClass(), "iCenturyOfEra", null);
        setField(term82430, term82430.getClass(), "iEra", null);
        setIntField(term82430, term82430.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term78924;
        Object retValue = callMethod(klass, "equals", argTypes, term78852, args);
        assertTrue(recursiveEquals(term78852, term82429));
        assertTrue(recursiveEquals(term78924, term82430));
        assertTrue(recursiveEquals(retValue, false));
    }

};


