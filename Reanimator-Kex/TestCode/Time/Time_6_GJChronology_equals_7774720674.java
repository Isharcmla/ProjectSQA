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

public class GJChronology_equals_7774720674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29301;
     Object term29308;
     Object term29309;

    public GJChronology_equals_7774720674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29301 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        term29308 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term29308, term29308.getClass(), "iJulianChronology", null);
        setField(term29308, term29308.getClass(), "iGregorianChronology", null);
        setField(term29308, term29308.getClass(), "iCutoverInstant", null);
        setLongField(term29308, term29308.getClass(), "iCutoverMillis", 0L);
        setLongField(term29308, term29308.getClass(), "iGapDuration", 0L);
        setField(term29308, term29308.getClass(), "iBase", null);
        setField(term29308, term29308.getClass(), "iParam", null);
        setField(term29308, term29308.getClass(), "iMillis", null);
        setField(term29308, term29308.getClass(), "iSeconds", null);
        setField(term29308, term29308.getClass(), "iMinutes", null);
        setField(term29308, term29308.getClass(), "iHours", null);
        setField(term29308, term29308.getClass(), "iHalfdays", null);
        setField(term29308, term29308.getClass(), "iDays", null);
        setField(term29308, term29308.getClass(), "iWeeks", null);
        setField(term29308, term29308.getClass(), "iWeekyears", null);
        setField(term29308, term29308.getClass(), "iMonths", null);
        setField(term29308, term29308.getClass(), "iYears", null);
        setField(term29308, term29308.getClass(), "iCenturies", null);
        setField(term29308, term29308.getClass(), "iEras", null);
        setField(term29308, term29308.getClass(), "iMillisOfSecond", null);
        setField(term29308, term29308.getClass(), "iMillisOfDay", null);
        setField(term29308, term29308.getClass(), "iSecondOfMinute", null);
        setField(term29308, term29308.getClass(), "iSecondOfDay", null);
        setField(term29308, term29308.getClass(), "iMinuteOfHour", null);
        setField(term29308, term29308.getClass(), "iMinuteOfDay", null);
        setField(term29308, term29308.getClass(), "iHourOfDay", null);
        setField(term29308, term29308.getClass(), "iClockhourOfDay", null);
        setField(term29308, term29308.getClass(), "iHourOfHalfday", null);
        setField(term29308, term29308.getClass(), "iClockhourOfHalfday", null);
        setField(term29308, term29308.getClass(), "iHalfdayOfDay", null);
        setField(term29308, term29308.getClass(), "iDayOfWeek", null);
        setField(term29308, term29308.getClass(), "iDayOfMonth", null);
        setField(term29308, term29308.getClass(), "iDayOfYear", null);
        setField(term29308, term29308.getClass(), "iWeekOfWeekyear", null);
        setField(term29308, term29308.getClass(), "iWeekyear", null);
        setField(term29308, term29308.getClass(), "iWeekyearOfCentury", null);
        setField(term29308, term29308.getClass(), "iMonthOfYear", null);
        setField(term29308, term29308.getClass(), "iYear", null);
        setField(term29308, term29308.getClass(), "iYearOfEra", null);
        setField(term29308, term29308.getClass(), "iYearOfCentury", null);
        setField(term29308, term29308.getClass(), "iCenturyOfEra", null);
        setField(term29308, term29308.getClass(), "iEra", null);
        setIntField(term29308, term29308.getClass(), "iBaseFlags", 0);
        term29309 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term29309, term29309.getClass(), "iJulianChronology", null);
        setField(term29309, term29309.getClass(), "iGregorianChronology", null);
        setField(term29309, term29309.getClass(), "iCutoverInstant", null);
        setLongField(term29309, term29309.getClass(), "iCutoverMillis", 0L);
        setLongField(term29309, term29309.getClass(), "iGapDuration", 0L);
        setField(term29309, term29309.getClass(), "iBase", null);
        setField(term29309, term29309.getClass(), "iParam", null);
        setField(term29309, term29309.getClass(), "iMillis", null);
        setField(term29309, term29309.getClass(), "iSeconds", null);
        setField(term29309, term29309.getClass(), "iMinutes", null);
        setField(term29309, term29309.getClass(), "iHours", null);
        setField(term29309, term29309.getClass(), "iHalfdays", null);
        setField(term29309, term29309.getClass(), "iDays", null);
        setField(term29309, term29309.getClass(), "iWeeks", null);
        setField(term29309, term29309.getClass(), "iWeekyears", null);
        setField(term29309, term29309.getClass(), "iMonths", null);
        setField(term29309, term29309.getClass(), "iYears", null);
        setField(term29309, term29309.getClass(), "iCenturies", null);
        setField(term29309, term29309.getClass(), "iEras", null);
        setField(term29309, term29309.getClass(), "iMillisOfSecond", null);
        setField(term29309, term29309.getClass(), "iMillisOfDay", null);
        setField(term29309, term29309.getClass(), "iSecondOfMinute", null);
        setField(term29309, term29309.getClass(), "iSecondOfDay", null);
        setField(term29309, term29309.getClass(), "iMinuteOfHour", null);
        setField(term29309, term29309.getClass(), "iMinuteOfDay", null);
        setField(term29309, term29309.getClass(), "iHourOfDay", null);
        setField(term29309, term29309.getClass(), "iClockhourOfDay", null);
        setField(term29309, term29309.getClass(), "iHourOfHalfday", null);
        setField(term29309, term29309.getClass(), "iClockhourOfHalfday", null);
        setField(term29309, term29309.getClass(), "iHalfdayOfDay", null);
        setField(term29309, term29309.getClass(), "iDayOfWeek", null);
        setField(term29309, term29309.getClass(), "iDayOfMonth", null);
        setField(term29309, term29309.getClass(), "iDayOfYear", null);
        setField(term29309, term29309.getClass(), "iWeekOfWeekyear", null);
        setField(term29309, term29309.getClass(), "iWeekyear", null);
        setField(term29309, term29309.getClass(), "iWeekyearOfCentury", null);
        setField(term29309, term29309.getClass(), "iMonthOfYear", null);
        setField(term29309, term29309.getClass(), "iYear", null);
        setField(term29309, term29309.getClass(), "iYearOfEra", null);
        setField(term29309, term29309.getClass(), "iYearOfCentury", null);
        setField(term29309, term29309.getClass(), "iCenturyOfEra", null);
        setField(term29309, term29309.getClass(), "iEra", null);
        setIntField(term29309, term29309.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29301;
        Object retValue = callMethod(klass, "equals", argTypes, term29301, args);
        assertTrue(recursiveEquals(term29301, term29308));
        assertTrue(recursiveEquals(term29301, term29309));
        assertTrue(recursiveEquals(retValue, true));
    }

};


