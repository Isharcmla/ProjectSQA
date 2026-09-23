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

public class ZonedChronology_hashCode_30723399430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;

    public ZonedChronology_hashCode_30723399430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term125 = newInstance(Class.forName("java.lang.Object"));
        setField(term124, term124.getClass(), "iBase", null);
        setField(term124, term124.getClass(), "iParam", term125);
        setField(term124, term124.getClass(), "iMillis", null);
        setField(term124, term124.getClass(), "iSeconds", null);
        setField(term124, term124.getClass(), "iMinutes", null);
        setField(term124, term124.getClass(), "iHours", null);
        setField(term124, term124.getClass(), "iHalfdays", null);
        setField(term124, term124.getClass(), "iDays", null);
        setField(term124, term124.getClass(), "iWeeks", null);
        setField(term124, term124.getClass(), "iWeekyears", null);
        setField(term124, term124.getClass(), "iMonths", null);
        setField(term124, term124.getClass(), "iYears", null);
        setField(term124, term124.getClass(), "iCenturies", null);
        setField(term124, term124.getClass(), "iEras", null);
        setField(term124, term124.getClass(), "iMillisOfSecond", null);
        setField(term124, term124.getClass(), "iMillisOfDay", null);
        setField(term124, term124.getClass(), "iSecondOfMinute", null);
        setField(term124, term124.getClass(), "iSecondOfDay", null);
        setField(term124, term124.getClass(), "iMinuteOfHour", null);
        setField(term124, term124.getClass(), "iMinuteOfDay", null);
        setField(term124, term124.getClass(), "iHourOfDay", null);
        setField(term124, term124.getClass(), "iClockhourOfDay", null);
        setField(term124, term124.getClass(), "iHourOfHalfday", null);
        setField(term124, term124.getClass(), "iClockhourOfHalfday", null);
        setField(term124, term124.getClass(), "iHalfdayOfDay", null);
        setField(term124, term124.getClass(), "iDayOfWeek", null);
        setField(term124, term124.getClass(), "iDayOfMonth", null);
        setField(term124, term124.getClass(), "iDayOfYear", null);
        setField(term124, term124.getClass(), "iWeekOfWeekyear", null);
        setField(term124, term124.getClass(), "iWeekyear", null);
        setField(term124, term124.getClass(), "iWeekyearOfCentury", null);
        setField(term124, term124.getClass(), "iMonthOfYear", null);
        setField(term124, term124.getClass(), "iYear", null);
        setField(term124, term124.getClass(), "iYearOfEra", null);
        setField(term124, term124.getClass(), "iYearOfCentury", null);
        setField(term124, term124.getClass(), "iCenturyOfEra", null);
        setField(term124, term124.getClass(), "iEra", null);
        setIntField(term124, term124.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term124, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


