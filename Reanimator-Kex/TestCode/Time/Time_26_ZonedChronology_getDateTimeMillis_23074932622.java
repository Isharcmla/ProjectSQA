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

public class ZonedChronology_getDateTimeMillis_23074932622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term13;
     Object term15;
     Object term17;
     Object term19;

    public ZonedChronology_getDateTimeMillis_23074932622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term11 = newInstance(Class.forName("java.lang.Object"));
        setField(term10, term10.getClass(), "iBase", null);
        setField(term10, term10.getClass(), "iParam", term11);
        setField(term10, term10.getClass(), "iMillis", null);
        setField(term10, term10.getClass(), "iSeconds", null);
        setField(term10, term10.getClass(), "iMinutes", null);
        setField(term10, term10.getClass(), "iHours", null);
        setField(term10, term10.getClass(), "iHalfdays", null);
        setField(term10, term10.getClass(), "iDays", null);
        setField(term10, term10.getClass(), "iWeeks", null);
        setField(term10, term10.getClass(), "iWeekyears", null);
        setField(term10, term10.getClass(), "iMonths", null);
        setField(term10, term10.getClass(), "iYears", null);
        setField(term10, term10.getClass(), "iCenturies", null);
        setField(term10, term10.getClass(), "iEras", null);
        setField(term10, term10.getClass(), "iMillisOfSecond", null);
        setField(term10, term10.getClass(), "iMillisOfDay", null);
        setField(term10, term10.getClass(), "iSecondOfMinute", null);
        setField(term10, term10.getClass(), "iSecondOfDay", null);
        setField(term10, term10.getClass(), "iMinuteOfHour", null);
        setField(term10, term10.getClass(), "iMinuteOfDay", null);
        setField(term10, term10.getClass(), "iHourOfDay", null);
        setField(term10, term10.getClass(), "iClockhourOfDay", null);
        setField(term10, term10.getClass(), "iHourOfHalfday", null);
        setField(term10, term10.getClass(), "iClockhourOfHalfday", null);
        setField(term10, term10.getClass(), "iHalfdayOfDay", null);
        setField(term10, term10.getClass(), "iDayOfWeek", null);
        setField(term10, term10.getClass(), "iDayOfMonth", null);
        setField(term10, term10.getClass(), "iDayOfYear", null);
        setField(term10, term10.getClass(), "iWeekOfWeekyear", null);
        setField(term10, term10.getClass(), "iWeekyear", null);
        setField(term10, term10.getClass(), "iWeekyearOfCentury", null);
        setField(term10, term10.getClass(), "iMonthOfYear", null);
        setField(term10, term10.getClass(), "iYear", null);
        setField(term10, term10.getClass(), "iYearOfEra", null);
        setField(term10, term10.getClass(), "iYearOfCentury", null);
        setField(term10, term10.getClass(), "iCenturyOfEra", null);
        setField(term10, term10.getClass(), "iEra", null);
        setIntField(term10, term10.getClass(), "iBaseFlags", 0);
        term13 = new Integer(568599855);
        term15 = new Integer(1162663216);
        term17 = new Integer(1484323161);
        term19 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term13;
        args[1] = term15;
        args[2] = term17;
        args[3] = term19;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term10, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


