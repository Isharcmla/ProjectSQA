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
import java.util.LinkedHashMap;

public class ZonedChronology_convertField_48336801428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;
     Object term91;
     Object term8020;
     Object term8022;

    public ZonedChronology_convertField_48336801428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term89 = newInstance(Class.forName("java.lang.Object"));
        setField(term88, term88.getClass(), "iBase", null);
        setField(term88, term88.getClass(), "iParam", term89);
        setField(term88, term88.getClass(), "iMillis", null);
        setField(term88, term88.getClass(), "iSeconds", null);
        setField(term88, term88.getClass(), "iMinutes", null);
        setField(term88, term88.getClass(), "iHours", null);
        setField(term88, term88.getClass(), "iHalfdays", null);
        setField(term88, term88.getClass(), "iDays", null);
        setField(term88, term88.getClass(), "iWeeks", null);
        setField(term88, term88.getClass(), "iWeekyears", null);
        setField(term88, term88.getClass(), "iMonths", null);
        setField(term88, term88.getClass(), "iYears", null);
        setField(term88, term88.getClass(), "iCenturies", null);
        setField(term88, term88.getClass(), "iEras", null);
        setField(term88, term88.getClass(), "iMillisOfSecond", null);
        setField(term88, term88.getClass(), "iMillisOfDay", null);
        setField(term88, term88.getClass(), "iSecondOfMinute", null);
        setField(term88, term88.getClass(), "iSecondOfDay", null);
        setField(term88, term88.getClass(), "iMinuteOfHour", null);
        setField(term88, term88.getClass(), "iMinuteOfDay", null);
        setField(term88, term88.getClass(), "iHourOfDay", null);
        setField(term88, term88.getClass(), "iClockhourOfDay", null);
        setField(term88, term88.getClass(), "iHourOfHalfday", null);
        setField(term88, term88.getClass(), "iClockhourOfHalfday", null);
        setField(term88, term88.getClass(), "iHalfdayOfDay", null);
        setField(term88, term88.getClass(), "iDayOfWeek", null);
        setField(term88, term88.getClass(), "iDayOfMonth", null);
        setField(term88, term88.getClass(), "iDayOfYear", null);
        setField(term88, term88.getClass(), "iWeekOfWeekyear", null);
        setField(term88, term88.getClass(), "iWeekyear", null);
        setField(term88, term88.getClass(), "iWeekyearOfCentury", null);
        setField(term88, term88.getClass(), "iMonthOfYear", null);
        setField(term88, term88.getClass(), "iYear", null);
        setField(term88, term88.getClass(), "iYearOfEra", null);
        setField(term88, term88.getClass(), "iYearOfCentury", null);
        setField(term88, term88.getClass(), "iCenturyOfEra", null);
        setField(term88, term88.getClass(), "iEra", null);
        setIntField(term88, term88.getClass(), "iBaseFlags", 0);
        term91 = new LinkedHashMap();
        term8020 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term8021 = newInstance(Class.forName("java.lang.Object"));
        setField(term8020, term8020.getClass(), "iBase", null);
        setField(term8020, term8020.getClass(), "iParam", term8021);
        setField(term8020, term8020.getClass(), "iMillis", null);
        setField(term8020, term8020.getClass(), "iSeconds", null);
        setField(term8020, term8020.getClass(), "iMinutes", null);
        setField(term8020, term8020.getClass(), "iHours", null);
        setField(term8020, term8020.getClass(), "iHalfdays", null);
        setField(term8020, term8020.getClass(), "iDays", null);
        setField(term8020, term8020.getClass(), "iWeeks", null);
        setField(term8020, term8020.getClass(), "iWeekyears", null);
        setField(term8020, term8020.getClass(), "iMonths", null);
        setField(term8020, term8020.getClass(), "iYears", null);
        setField(term8020, term8020.getClass(), "iCenturies", null);
        setField(term8020, term8020.getClass(), "iEras", null);
        setField(term8020, term8020.getClass(), "iMillisOfSecond", null);
        setField(term8020, term8020.getClass(), "iMillisOfDay", null);
        setField(term8020, term8020.getClass(), "iSecondOfMinute", null);
        setField(term8020, term8020.getClass(), "iSecondOfDay", null);
        setField(term8020, term8020.getClass(), "iMinuteOfHour", null);
        setField(term8020, term8020.getClass(), "iMinuteOfDay", null);
        setField(term8020, term8020.getClass(), "iHourOfDay", null);
        setField(term8020, term8020.getClass(), "iClockhourOfDay", null);
        setField(term8020, term8020.getClass(), "iHourOfHalfday", null);
        setField(term8020, term8020.getClass(), "iClockhourOfHalfday", null);
        setField(term8020, term8020.getClass(), "iHalfdayOfDay", null);
        setField(term8020, term8020.getClass(), "iDayOfWeek", null);
        setField(term8020, term8020.getClass(), "iDayOfMonth", null);
        setField(term8020, term8020.getClass(), "iDayOfYear", null);
        setField(term8020, term8020.getClass(), "iWeekOfWeekyear", null);
        setField(term8020, term8020.getClass(), "iWeekyear", null);
        setField(term8020, term8020.getClass(), "iWeekyearOfCentury", null);
        setField(term8020, term8020.getClass(), "iMonthOfYear", null);
        setField(term8020, term8020.getClass(), "iYear", null);
        setField(term8020, term8020.getClass(), "iYearOfEra", null);
        setField(term8020, term8020.getClass(), "iYearOfCentury", null);
        setField(term8020, term8020.getClass(), "iCenturyOfEra", null);
        setField(term8020, term8020.getClass(), "iEra", null);
        setIntField(term8020, term8020.getClass(), "iBaseFlags", 0);
        term8022 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("java.util.HashMap");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term91;
        Object retValue = callMethod(klass, "convertField", argTypes, term88, args);
        assertTrue(recursiveEquals(term88, term8020));
        assertTrue(recursiveEquals(term91, term8022));
        assertTrue(recursiveEquals(retValue, null));
    }

};


