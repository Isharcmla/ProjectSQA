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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class ZonedChronology_localToUTC_118844988325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term54;

    public ZonedChronology_localToUTC_118844988325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term52 = newInstance(Class.forName("java.lang.Object"));
        setField(term51, term51.getClass(), "iBase", null);
        setField(term51, term51.getClass(), "iParam", term52);
        setField(term51, term51.getClass(), "iMillis", null);
        setField(term51, term51.getClass(), "iSeconds", null);
        setField(term51, term51.getClass(), "iMinutes", null);
        setField(term51, term51.getClass(), "iHours", null);
        setField(term51, term51.getClass(), "iHalfdays", null);
        setField(term51, term51.getClass(), "iDays", null);
        setField(term51, term51.getClass(), "iWeeks", null);
        setField(term51, term51.getClass(), "iWeekyears", null);
        setField(term51, term51.getClass(), "iMonths", null);
        setField(term51, term51.getClass(), "iYears", null);
        setField(term51, term51.getClass(), "iCenturies", null);
        setField(term51, term51.getClass(), "iEras", null);
        setField(term51, term51.getClass(), "iMillisOfSecond", null);
        setField(term51, term51.getClass(), "iMillisOfDay", null);
        setField(term51, term51.getClass(), "iSecondOfMinute", null);
        setField(term51, term51.getClass(), "iSecondOfDay", null);
        setField(term51, term51.getClass(), "iMinuteOfHour", null);
        setField(term51, term51.getClass(), "iMinuteOfDay", null);
        setField(term51, term51.getClass(), "iHourOfDay", null);
        setField(term51, term51.getClass(), "iClockhourOfDay", null);
        setField(term51, term51.getClass(), "iHourOfHalfday", null);
        setField(term51, term51.getClass(), "iClockhourOfHalfday", null);
        setField(term51, term51.getClass(), "iHalfdayOfDay", null);
        setField(term51, term51.getClass(), "iDayOfWeek", null);
        setField(term51, term51.getClass(), "iDayOfMonth", null);
        setField(term51, term51.getClass(), "iDayOfYear", null);
        setField(term51, term51.getClass(), "iWeekOfWeekyear", null);
        setField(term51, term51.getClass(), "iWeekyear", null);
        setField(term51, term51.getClass(), "iWeekyearOfCentury", null);
        setField(term51, term51.getClass(), "iMonthOfYear", null);
        setField(term51, term51.getClass(), "iYear", null);
        setField(term51, term51.getClass(), "iYearOfEra", null);
        setField(term51, term51.getClass(), "iYearOfCentury", null);
        setField(term51, term51.getClass(), "iCenturyOfEra", null);
        setField(term51, term51.getClass(), "iEra", null);
        setIntField(term51, term51.getClass(), "iBaseFlags", 0);
        term54 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term54;
        try {
            callMethod(klass, "localToUTC", argTypes, term51, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


