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

public class ZonedChronology_getZone_57263138819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ZonedChronology_getZone_57263138819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term2 = newInstance(Class.forName("java.lang.Object"));
        setField(term1, term1.getClass(), "iBase", null);
        setField(term1, term1.getClass(), "iParam", term2);
        setField(term1, term1.getClass(), "iMillis", null);
        setField(term1, term1.getClass(), "iSeconds", null);
        setField(term1, term1.getClass(), "iMinutes", null);
        setField(term1, term1.getClass(), "iHours", null);
        setField(term1, term1.getClass(), "iHalfdays", null);
        setField(term1, term1.getClass(), "iDays", null);
        setField(term1, term1.getClass(), "iWeeks", null);
        setField(term1, term1.getClass(), "iWeekyears", null);
        setField(term1, term1.getClass(), "iMonths", null);
        setField(term1, term1.getClass(), "iYears", null);
        setField(term1, term1.getClass(), "iCenturies", null);
        setField(term1, term1.getClass(), "iEras", null);
        setField(term1, term1.getClass(), "iMillisOfSecond", null);
        setField(term1, term1.getClass(), "iMillisOfDay", null);
        setField(term1, term1.getClass(), "iSecondOfMinute", null);
        setField(term1, term1.getClass(), "iSecondOfDay", null);
        setField(term1, term1.getClass(), "iMinuteOfHour", null);
        setField(term1, term1.getClass(), "iMinuteOfDay", null);
        setField(term1, term1.getClass(), "iHourOfDay", null);
        setField(term1, term1.getClass(), "iClockhourOfDay", null);
        setField(term1, term1.getClass(), "iHourOfHalfday", null);
        setField(term1, term1.getClass(), "iClockhourOfHalfday", null);
        setField(term1, term1.getClass(), "iHalfdayOfDay", null);
        setField(term1, term1.getClass(), "iDayOfWeek", null);
        setField(term1, term1.getClass(), "iDayOfMonth", null);
        setField(term1, term1.getClass(), "iDayOfYear", null);
        setField(term1, term1.getClass(), "iWeekOfWeekyear", null);
        setField(term1, term1.getClass(), "iWeekyear", null);
        setField(term1, term1.getClass(), "iWeekyearOfCentury", null);
        setField(term1, term1.getClass(), "iMonthOfYear", null);
        setField(term1, term1.getClass(), "iYear", null);
        setField(term1, term1.getClass(), "iYearOfEra", null);
        setField(term1, term1.getClass(), "iYearOfCentury", null);
        setField(term1, term1.getClass(), "iCenturyOfEra", null);
        setField(term1, term1.getClass(), "iEra", null);
        setIntField(term1, term1.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getZone", argTypes, term1, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


