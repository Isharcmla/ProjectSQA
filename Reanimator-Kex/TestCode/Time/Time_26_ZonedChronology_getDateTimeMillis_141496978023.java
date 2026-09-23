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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ZonedChronology_getDateTimeMillis_141496978023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term24;
     Object term26;
     Object term28;
     Object term30;
     Object term32;
     Object term34;
     Object term36;

    public ZonedChronology_getDateTimeMillis_141496978023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term22 = newInstance(Class.forName("java.lang.Object"));
        setField(term21, term21.getClass(), "iBase", null);
        setField(term21, term21.getClass(), "iParam", term22);
        setField(term21, term21.getClass(), "iMillis", null);
        setField(term21, term21.getClass(), "iSeconds", null);
        setField(term21, term21.getClass(), "iMinutes", null);
        setField(term21, term21.getClass(), "iHours", null);
        setField(term21, term21.getClass(), "iHalfdays", null);
        setField(term21, term21.getClass(), "iDays", null);
        setField(term21, term21.getClass(), "iWeeks", null);
        setField(term21, term21.getClass(), "iWeekyears", null);
        setField(term21, term21.getClass(), "iMonths", null);
        setField(term21, term21.getClass(), "iYears", null);
        setField(term21, term21.getClass(), "iCenturies", null);
        setField(term21, term21.getClass(), "iEras", null);
        setField(term21, term21.getClass(), "iMillisOfSecond", null);
        setField(term21, term21.getClass(), "iMillisOfDay", null);
        setField(term21, term21.getClass(), "iSecondOfMinute", null);
        setField(term21, term21.getClass(), "iSecondOfDay", null);
        setField(term21, term21.getClass(), "iMinuteOfHour", null);
        setField(term21, term21.getClass(), "iMinuteOfDay", null);
        setField(term21, term21.getClass(), "iHourOfDay", null);
        setField(term21, term21.getClass(), "iClockhourOfDay", null);
        setField(term21, term21.getClass(), "iHourOfHalfday", null);
        setField(term21, term21.getClass(), "iClockhourOfHalfday", null);
        setField(term21, term21.getClass(), "iHalfdayOfDay", null);
        setField(term21, term21.getClass(), "iDayOfWeek", null);
        setField(term21, term21.getClass(), "iDayOfMonth", null);
        setField(term21, term21.getClass(), "iDayOfYear", null);
        setField(term21, term21.getClass(), "iWeekOfWeekyear", null);
        setField(term21, term21.getClass(), "iWeekyear", null);
        setField(term21, term21.getClass(), "iWeekyearOfCentury", null);
        setField(term21, term21.getClass(), "iMonthOfYear", null);
        setField(term21, term21.getClass(), "iYear", null);
        setField(term21, term21.getClass(), "iYearOfEra", null);
        setField(term21, term21.getClass(), "iYearOfCentury", null);
        setField(term21, term21.getClass(), "iCenturyOfEra", null);
        setField(term21, term21.getClass(), "iEra", null);
        setIntField(term21, term21.getClass(), "iBaseFlags", 0);
        term24 = new Integer(-1922583790);
        term26 = new Integer(-616727354);
        term28 = new Integer(-1955890973);
        term30 = new Integer(-2038273078);
        term32 = new Integer(1227103734);
        term34 = new Integer(-1339778481);
        term36 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term24;
        args[1] = term26;
        args[2] = term28;
        args[3] = term30;
        args[4] = term32;
        args[5] = term34;
        args[6] = term36;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term21, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


