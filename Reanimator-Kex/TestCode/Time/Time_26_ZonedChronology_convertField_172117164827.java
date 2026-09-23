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

public class ZonedChronology_convertField_172117164827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term63;
     Object term8007;
     Object term8009;

    public ZonedChronology_convertField_172117164827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term61 = newInstance(Class.forName("java.lang.Object"));
        setField(term60, term60.getClass(), "iBase", null);
        setField(term60, term60.getClass(), "iParam", term61);
        setField(term60, term60.getClass(), "iMillis", null);
        setField(term60, term60.getClass(), "iSeconds", null);
        setField(term60, term60.getClass(), "iMinutes", null);
        setField(term60, term60.getClass(), "iHours", null);
        setField(term60, term60.getClass(), "iHalfdays", null);
        setField(term60, term60.getClass(), "iDays", null);
        setField(term60, term60.getClass(), "iWeeks", null);
        setField(term60, term60.getClass(), "iWeekyears", null);
        setField(term60, term60.getClass(), "iMonths", null);
        setField(term60, term60.getClass(), "iYears", null);
        setField(term60, term60.getClass(), "iCenturies", null);
        setField(term60, term60.getClass(), "iEras", null);
        setField(term60, term60.getClass(), "iMillisOfSecond", null);
        setField(term60, term60.getClass(), "iMillisOfDay", null);
        setField(term60, term60.getClass(), "iSecondOfMinute", null);
        setField(term60, term60.getClass(), "iSecondOfDay", null);
        setField(term60, term60.getClass(), "iMinuteOfHour", null);
        setField(term60, term60.getClass(), "iMinuteOfDay", null);
        setField(term60, term60.getClass(), "iHourOfDay", null);
        setField(term60, term60.getClass(), "iClockhourOfDay", null);
        setField(term60, term60.getClass(), "iHourOfHalfday", null);
        setField(term60, term60.getClass(), "iClockhourOfHalfday", null);
        setField(term60, term60.getClass(), "iHalfdayOfDay", null);
        setField(term60, term60.getClass(), "iDayOfWeek", null);
        setField(term60, term60.getClass(), "iDayOfMonth", null);
        setField(term60, term60.getClass(), "iDayOfYear", null);
        setField(term60, term60.getClass(), "iWeekOfWeekyear", null);
        setField(term60, term60.getClass(), "iWeekyear", null);
        setField(term60, term60.getClass(), "iWeekyearOfCentury", null);
        setField(term60, term60.getClass(), "iMonthOfYear", null);
        setField(term60, term60.getClass(), "iYear", null);
        setField(term60, term60.getClass(), "iYearOfEra", null);
        setField(term60, term60.getClass(), "iYearOfCentury", null);
        setField(term60, term60.getClass(), "iCenturyOfEra", null);
        setField(term60, term60.getClass(), "iEra", null);
        setIntField(term60, term60.getClass(), "iBaseFlags", 0);
        term63 = new LinkedHashMap();
        term8007 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term8008 = newInstance(Class.forName("java.lang.Object"));
        setField(term8007, term8007.getClass(), "iBase", null);
        setField(term8007, term8007.getClass(), "iParam", term8008);
        setField(term8007, term8007.getClass(), "iMillis", null);
        setField(term8007, term8007.getClass(), "iSeconds", null);
        setField(term8007, term8007.getClass(), "iMinutes", null);
        setField(term8007, term8007.getClass(), "iHours", null);
        setField(term8007, term8007.getClass(), "iHalfdays", null);
        setField(term8007, term8007.getClass(), "iDays", null);
        setField(term8007, term8007.getClass(), "iWeeks", null);
        setField(term8007, term8007.getClass(), "iWeekyears", null);
        setField(term8007, term8007.getClass(), "iMonths", null);
        setField(term8007, term8007.getClass(), "iYears", null);
        setField(term8007, term8007.getClass(), "iCenturies", null);
        setField(term8007, term8007.getClass(), "iEras", null);
        setField(term8007, term8007.getClass(), "iMillisOfSecond", null);
        setField(term8007, term8007.getClass(), "iMillisOfDay", null);
        setField(term8007, term8007.getClass(), "iSecondOfMinute", null);
        setField(term8007, term8007.getClass(), "iSecondOfDay", null);
        setField(term8007, term8007.getClass(), "iMinuteOfHour", null);
        setField(term8007, term8007.getClass(), "iMinuteOfDay", null);
        setField(term8007, term8007.getClass(), "iHourOfDay", null);
        setField(term8007, term8007.getClass(), "iClockhourOfDay", null);
        setField(term8007, term8007.getClass(), "iHourOfHalfday", null);
        setField(term8007, term8007.getClass(), "iClockhourOfHalfday", null);
        setField(term8007, term8007.getClass(), "iHalfdayOfDay", null);
        setField(term8007, term8007.getClass(), "iDayOfWeek", null);
        setField(term8007, term8007.getClass(), "iDayOfMonth", null);
        setField(term8007, term8007.getClass(), "iDayOfYear", null);
        setField(term8007, term8007.getClass(), "iWeekOfWeekyear", null);
        setField(term8007, term8007.getClass(), "iWeekyear", null);
        setField(term8007, term8007.getClass(), "iWeekyearOfCentury", null);
        setField(term8007, term8007.getClass(), "iMonthOfYear", null);
        setField(term8007, term8007.getClass(), "iYear", null);
        setField(term8007, term8007.getClass(), "iYearOfEra", null);
        setField(term8007, term8007.getClass(), "iYearOfCentury", null);
        setField(term8007, term8007.getClass(), "iCenturyOfEra", null);
        setField(term8007, term8007.getClass(), "iEra", null);
        setIntField(term8007, term8007.getClass(), "iBaseFlags", 0);
        term8009 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        argTypes[1] = Class.forName("java.util.HashMap");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term63;
        Object retValue = callMethod(klass, "convertField", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term8007));
        assertTrue(recursiveEquals(term63, term8009));
        assertTrue(recursiveEquals(retValue, null));
    }

};


