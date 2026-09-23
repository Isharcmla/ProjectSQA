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

public class ZonedChronology_withZone_102197958421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term6432;

    public ZonedChronology_withZone_102197958421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        setField(term7, term7.getClass(), "iBase", null);
        setField(term7, term7.getClass(), "iParam", term8);
        setField(term7, term7.getClass(), "iMillis", null);
        setField(term7, term7.getClass(), "iSeconds", null);
        setField(term7, term7.getClass(), "iMinutes", null);
        setField(term7, term7.getClass(), "iHours", null);
        setField(term7, term7.getClass(), "iHalfdays", null);
        setField(term7, term7.getClass(), "iDays", null);
        setField(term7, term7.getClass(), "iWeeks", null);
        setField(term7, term7.getClass(), "iWeekyears", null);
        setField(term7, term7.getClass(), "iMonths", null);
        setField(term7, term7.getClass(), "iYears", null);
        setField(term7, term7.getClass(), "iCenturies", null);
        setField(term7, term7.getClass(), "iEras", null);
        setField(term7, term7.getClass(), "iMillisOfSecond", null);
        setField(term7, term7.getClass(), "iMillisOfDay", null);
        setField(term7, term7.getClass(), "iSecondOfMinute", null);
        setField(term7, term7.getClass(), "iSecondOfDay", null);
        setField(term7, term7.getClass(), "iMinuteOfHour", null);
        setField(term7, term7.getClass(), "iMinuteOfDay", null);
        setField(term7, term7.getClass(), "iHourOfDay", null);
        setField(term7, term7.getClass(), "iClockhourOfDay", null);
        setField(term7, term7.getClass(), "iHourOfHalfday", null);
        setField(term7, term7.getClass(), "iClockhourOfHalfday", null);
        setField(term7, term7.getClass(), "iHalfdayOfDay", null);
        setField(term7, term7.getClass(), "iDayOfWeek", null);
        setField(term7, term7.getClass(), "iDayOfMonth", null);
        setField(term7, term7.getClass(), "iDayOfYear", null);
        setField(term7, term7.getClass(), "iWeekOfWeekyear", null);
        setField(term7, term7.getClass(), "iWeekyear", null);
        setField(term7, term7.getClass(), "iWeekyearOfCentury", null);
        setField(term7, term7.getClass(), "iMonthOfYear", null);
        setField(term7, term7.getClass(), "iYear", null);
        setField(term7, term7.getClass(), "iYearOfEra", null);
        setField(term7, term7.getClass(), "iYearOfCentury", null);
        setField(term7, term7.getClass(), "iCenturyOfEra", null);
        setField(term7, term7.getClass(), "iEra", null);
        setIntField(term7, term7.getClass(), "iBaseFlags", 0);
        term6432 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term6433 = newInstance(Class.forName("java.lang.Object"));
        setField(term6432, term6432.getClass(), "iBase", null);
        setField(term6432, term6432.getClass(), "iParam", term6433);
        setField(term6432, term6432.getClass(), "iMillis", null);
        setField(term6432, term6432.getClass(), "iSeconds", null);
        setField(term6432, term6432.getClass(), "iMinutes", null);
        setField(term6432, term6432.getClass(), "iHours", null);
        setField(term6432, term6432.getClass(), "iHalfdays", null);
        setField(term6432, term6432.getClass(), "iDays", null);
        setField(term6432, term6432.getClass(), "iWeeks", null);
        setField(term6432, term6432.getClass(), "iWeekyears", null);
        setField(term6432, term6432.getClass(), "iMonths", null);
        setField(term6432, term6432.getClass(), "iYears", null);
        setField(term6432, term6432.getClass(), "iCenturies", null);
        setField(term6432, term6432.getClass(), "iEras", null);
        setField(term6432, term6432.getClass(), "iMillisOfSecond", null);
        setField(term6432, term6432.getClass(), "iMillisOfDay", null);
        setField(term6432, term6432.getClass(), "iSecondOfMinute", null);
        setField(term6432, term6432.getClass(), "iSecondOfDay", null);
        setField(term6432, term6432.getClass(), "iMinuteOfHour", null);
        setField(term6432, term6432.getClass(), "iMinuteOfDay", null);
        setField(term6432, term6432.getClass(), "iHourOfDay", null);
        setField(term6432, term6432.getClass(), "iClockhourOfDay", null);
        setField(term6432, term6432.getClass(), "iHourOfHalfday", null);
        setField(term6432, term6432.getClass(), "iClockhourOfHalfday", null);
        setField(term6432, term6432.getClass(), "iHalfdayOfDay", null);
        setField(term6432, term6432.getClass(), "iDayOfWeek", null);
        setField(term6432, term6432.getClass(), "iDayOfMonth", null);
        setField(term6432, term6432.getClass(), "iDayOfYear", null);
        setField(term6432, term6432.getClass(), "iWeekOfWeekyear", null);
        setField(term6432, term6432.getClass(), "iWeekyear", null);
        setField(term6432, term6432.getClass(), "iWeekyearOfCentury", null);
        setField(term6432, term6432.getClass(), "iMonthOfYear", null);
        setField(term6432, term6432.getClass(), "iYear", null);
        setField(term6432, term6432.getClass(), "iYearOfEra", null);
        setField(term6432, term6432.getClass(), "iYearOfCentury", null);
        setField(term6432, term6432.getClass(), "iCenturyOfEra", null);
        setField(term6432, term6432.getClass(), "iEra", null);
        setIntField(term6432, term6432.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withZone", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term6432));
        assertTrue(recursiveEquals(retValue, null));
    }

};


