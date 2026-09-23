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

public class ZonedChronology_equals_14145268129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;
     Object term123;
     Object term8030;
     Object term8032;

    public ZonedChronology_equals_14145268129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term121 = newInstance(Class.forName("java.lang.Object"));
        setField(term120, term120.getClass(), "iBase", null);
        setField(term120, term120.getClass(), "iParam", term121);
        setField(term120, term120.getClass(), "iMillis", null);
        setField(term120, term120.getClass(), "iSeconds", null);
        setField(term120, term120.getClass(), "iMinutes", null);
        setField(term120, term120.getClass(), "iHours", null);
        setField(term120, term120.getClass(), "iHalfdays", null);
        setField(term120, term120.getClass(), "iDays", null);
        setField(term120, term120.getClass(), "iWeeks", null);
        setField(term120, term120.getClass(), "iWeekyears", null);
        setField(term120, term120.getClass(), "iMonths", null);
        setField(term120, term120.getClass(), "iYears", null);
        setField(term120, term120.getClass(), "iCenturies", null);
        setField(term120, term120.getClass(), "iEras", null);
        setField(term120, term120.getClass(), "iMillisOfSecond", null);
        setField(term120, term120.getClass(), "iMillisOfDay", null);
        setField(term120, term120.getClass(), "iSecondOfMinute", null);
        setField(term120, term120.getClass(), "iSecondOfDay", null);
        setField(term120, term120.getClass(), "iMinuteOfHour", null);
        setField(term120, term120.getClass(), "iMinuteOfDay", null);
        setField(term120, term120.getClass(), "iHourOfDay", null);
        setField(term120, term120.getClass(), "iClockhourOfDay", null);
        setField(term120, term120.getClass(), "iHourOfHalfday", null);
        setField(term120, term120.getClass(), "iClockhourOfHalfday", null);
        setField(term120, term120.getClass(), "iHalfdayOfDay", null);
        setField(term120, term120.getClass(), "iDayOfWeek", null);
        setField(term120, term120.getClass(), "iDayOfMonth", null);
        setField(term120, term120.getClass(), "iDayOfYear", null);
        setField(term120, term120.getClass(), "iWeekOfWeekyear", null);
        setField(term120, term120.getClass(), "iWeekyear", null);
        setField(term120, term120.getClass(), "iWeekyearOfCentury", null);
        setField(term120, term120.getClass(), "iMonthOfYear", null);
        setField(term120, term120.getClass(), "iYear", null);
        setField(term120, term120.getClass(), "iYearOfEra", null);
        setField(term120, term120.getClass(), "iYearOfCentury", null);
        setField(term120, term120.getClass(), "iCenturyOfEra", null);
        setField(term120, term120.getClass(), "iEra", null);
        setIntField(term120, term120.getClass(), "iBaseFlags", 0);
        term123 = newInstance(Class.forName("java.lang.Object"));
        term8030 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term8031 = newInstance(Class.forName("java.lang.Object"));
        setField(term8030, term8030.getClass(), "iBase", null);
        setField(term8030, term8030.getClass(), "iParam", term8031);
        setField(term8030, term8030.getClass(), "iMillis", null);
        setField(term8030, term8030.getClass(), "iSeconds", null);
        setField(term8030, term8030.getClass(), "iMinutes", null);
        setField(term8030, term8030.getClass(), "iHours", null);
        setField(term8030, term8030.getClass(), "iHalfdays", null);
        setField(term8030, term8030.getClass(), "iDays", null);
        setField(term8030, term8030.getClass(), "iWeeks", null);
        setField(term8030, term8030.getClass(), "iWeekyears", null);
        setField(term8030, term8030.getClass(), "iMonths", null);
        setField(term8030, term8030.getClass(), "iYears", null);
        setField(term8030, term8030.getClass(), "iCenturies", null);
        setField(term8030, term8030.getClass(), "iEras", null);
        setField(term8030, term8030.getClass(), "iMillisOfSecond", null);
        setField(term8030, term8030.getClass(), "iMillisOfDay", null);
        setField(term8030, term8030.getClass(), "iSecondOfMinute", null);
        setField(term8030, term8030.getClass(), "iSecondOfDay", null);
        setField(term8030, term8030.getClass(), "iMinuteOfHour", null);
        setField(term8030, term8030.getClass(), "iMinuteOfDay", null);
        setField(term8030, term8030.getClass(), "iHourOfDay", null);
        setField(term8030, term8030.getClass(), "iClockhourOfDay", null);
        setField(term8030, term8030.getClass(), "iHourOfHalfday", null);
        setField(term8030, term8030.getClass(), "iClockhourOfHalfday", null);
        setField(term8030, term8030.getClass(), "iHalfdayOfDay", null);
        setField(term8030, term8030.getClass(), "iDayOfWeek", null);
        setField(term8030, term8030.getClass(), "iDayOfMonth", null);
        setField(term8030, term8030.getClass(), "iDayOfYear", null);
        setField(term8030, term8030.getClass(), "iWeekOfWeekyear", null);
        setField(term8030, term8030.getClass(), "iWeekyear", null);
        setField(term8030, term8030.getClass(), "iWeekyearOfCentury", null);
        setField(term8030, term8030.getClass(), "iMonthOfYear", null);
        setField(term8030, term8030.getClass(), "iYear", null);
        setField(term8030, term8030.getClass(), "iYearOfEra", null);
        setField(term8030, term8030.getClass(), "iYearOfCentury", null);
        setField(term8030, term8030.getClass(), "iCenturyOfEra", null);
        setField(term8030, term8030.getClass(), "iEra", null);
        setIntField(term8030, term8030.getClass(), "iBaseFlags", 0);
        term8032 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123;
        Object retValue = callMethod(klass, "equals", argTypes, term120, args);
        assertTrue(recursiveEquals(term120, term8030));
        assertTrue(recursiveEquals(term123, term8032));
        assertTrue(recursiveEquals(retValue, false));
    }

};


