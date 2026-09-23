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

public class ZonedChronology_toString_81799368431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;

    public ZonedChronology_toString_81799368431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term128 = newInstance(Class.forName("java.lang.Object"));
        setField(term127, term127.getClass(), "iBase", null);
        setField(term127, term127.getClass(), "iParam", term128);
        setField(term127, term127.getClass(), "iMillis", null);
        setField(term127, term127.getClass(), "iSeconds", null);
        setField(term127, term127.getClass(), "iMinutes", null);
        setField(term127, term127.getClass(), "iHours", null);
        setField(term127, term127.getClass(), "iHalfdays", null);
        setField(term127, term127.getClass(), "iDays", null);
        setField(term127, term127.getClass(), "iWeeks", null);
        setField(term127, term127.getClass(), "iWeekyears", null);
        setField(term127, term127.getClass(), "iMonths", null);
        setField(term127, term127.getClass(), "iYears", null);
        setField(term127, term127.getClass(), "iCenturies", null);
        setField(term127, term127.getClass(), "iEras", null);
        setField(term127, term127.getClass(), "iMillisOfSecond", null);
        setField(term127, term127.getClass(), "iMillisOfDay", null);
        setField(term127, term127.getClass(), "iSecondOfMinute", null);
        setField(term127, term127.getClass(), "iSecondOfDay", null);
        setField(term127, term127.getClass(), "iMinuteOfHour", null);
        setField(term127, term127.getClass(), "iMinuteOfDay", null);
        setField(term127, term127.getClass(), "iHourOfDay", null);
        setField(term127, term127.getClass(), "iClockhourOfDay", null);
        setField(term127, term127.getClass(), "iHourOfHalfday", null);
        setField(term127, term127.getClass(), "iClockhourOfHalfday", null);
        setField(term127, term127.getClass(), "iHalfdayOfDay", null);
        setField(term127, term127.getClass(), "iDayOfWeek", null);
        setField(term127, term127.getClass(), "iDayOfMonth", null);
        setField(term127, term127.getClass(), "iDayOfYear", null);
        setField(term127, term127.getClass(), "iWeekOfWeekyear", null);
        setField(term127, term127.getClass(), "iWeekyear", null);
        setField(term127, term127.getClass(), "iWeekyearOfCentury", null);
        setField(term127, term127.getClass(), "iMonthOfYear", null);
        setField(term127, term127.getClass(), "iYear", null);
        setField(term127, term127.getClass(), "iYearOfEra", null);
        setField(term127, term127.getClass(), "iYearOfCentury", null);
        setField(term127, term127.getClass(), "iCenturyOfEra", null);
        setField(term127, term127.getClass(), "iEra", null);
        setIntField(term127, term127.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term127, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


