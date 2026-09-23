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
import java.lang.Integer;

public class ZonedChronology_getDateTimeMillis_183457642824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term41;
     Object term43;
     Object term45;
     Object term47;
     Object term49;

    public ZonedChronology_getDateTimeMillis_183457642824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term39 = newInstance(Class.forName("java.lang.Object"));
        setField(term38, term38.getClass(), "iBase", null);
        setField(term38, term38.getClass(), "iParam", term39);
        setField(term38, term38.getClass(), "iMillis", null);
        setField(term38, term38.getClass(), "iSeconds", null);
        setField(term38, term38.getClass(), "iMinutes", null);
        setField(term38, term38.getClass(), "iHours", null);
        setField(term38, term38.getClass(), "iHalfdays", null);
        setField(term38, term38.getClass(), "iDays", null);
        setField(term38, term38.getClass(), "iWeeks", null);
        setField(term38, term38.getClass(), "iWeekyears", null);
        setField(term38, term38.getClass(), "iMonths", null);
        setField(term38, term38.getClass(), "iYears", null);
        setField(term38, term38.getClass(), "iCenturies", null);
        setField(term38, term38.getClass(), "iEras", null);
        setField(term38, term38.getClass(), "iMillisOfSecond", null);
        setField(term38, term38.getClass(), "iMillisOfDay", null);
        setField(term38, term38.getClass(), "iSecondOfMinute", null);
        setField(term38, term38.getClass(), "iSecondOfDay", null);
        setField(term38, term38.getClass(), "iMinuteOfHour", null);
        setField(term38, term38.getClass(), "iMinuteOfDay", null);
        setField(term38, term38.getClass(), "iHourOfDay", null);
        setField(term38, term38.getClass(), "iClockhourOfDay", null);
        setField(term38, term38.getClass(), "iHourOfHalfday", null);
        setField(term38, term38.getClass(), "iClockhourOfHalfday", null);
        setField(term38, term38.getClass(), "iHalfdayOfDay", null);
        setField(term38, term38.getClass(), "iDayOfWeek", null);
        setField(term38, term38.getClass(), "iDayOfMonth", null);
        setField(term38, term38.getClass(), "iDayOfYear", null);
        setField(term38, term38.getClass(), "iWeekOfWeekyear", null);
        setField(term38, term38.getClass(), "iWeekyear", null);
        setField(term38, term38.getClass(), "iWeekyearOfCentury", null);
        setField(term38, term38.getClass(), "iMonthOfYear", null);
        setField(term38, term38.getClass(), "iYear", null);
        setField(term38, term38.getClass(), "iYearOfEra", null);
        setField(term38, term38.getClass(), "iYearOfCentury", null);
        setField(term38, term38.getClass(), "iCenturyOfEra", null);
        setField(term38, term38.getClass(), "iEra", null);
        setIntField(term38, term38.getClass(), "iBaseFlags", 0);
        term41 = new Long(2442117782898005296L);
        term43 = new Integer(-522618178);
        term45 = new Integer(1134449235);
        term47 = new Integer(-883034806);
        term49 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term41;
        args[1] = term43;
        args[2] = term45;
        args[3] = term47;
        args[4] = term49;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term38, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


