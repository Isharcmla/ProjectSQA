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

public class ZonedChronology_withUTC_37686564920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term6130;

    public ZonedChronology_withUTC_37686564920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        setField(term4, term4.getClass(), "iBase", null);
        setField(term4, term4.getClass(), "iParam", term5);
        setField(term4, term4.getClass(), "iMillis", null);
        setField(term4, term4.getClass(), "iSeconds", null);
        setField(term4, term4.getClass(), "iMinutes", null);
        setField(term4, term4.getClass(), "iHours", null);
        setField(term4, term4.getClass(), "iHalfdays", null);
        setField(term4, term4.getClass(), "iDays", null);
        setField(term4, term4.getClass(), "iWeeks", null);
        setField(term4, term4.getClass(), "iWeekyears", null);
        setField(term4, term4.getClass(), "iMonths", null);
        setField(term4, term4.getClass(), "iYears", null);
        setField(term4, term4.getClass(), "iCenturies", null);
        setField(term4, term4.getClass(), "iEras", null);
        setField(term4, term4.getClass(), "iMillisOfSecond", null);
        setField(term4, term4.getClass(), "iMillisOfDay", null);
        setField(term4, term4.getClass(), "iSecondOfMinute", null);
        setField(term4, term4.getClass(), "iSecondOfDay", null);
        setField(term4, term4.getClass(), "iMinuteOfHour", null);
        setField(term4, term4.getClass(), "iMinuteOfDay", null);
        setField(term4, term4.getClass(), "iHourOfDay", null);
        setField(term4, term4.getClass(), "iClockhourOfDay", null);
        setField(term4, term4.getClass(), "iHourOfHalfday", null);
        setField(term4, term4.getClass(), "iClockhourOfHalfday", null);
        setField(term4, term4.getClass(), "iHalfdayOfDay", null);
        setField(term4, term4.getClass(), "iDayOfWeek", null);
        setField(term4, term4.getClass(), "iDayOfMonth", null);
        setField(term4, term4.getClass(), "iDayOfYear", null);
        setField(term4, term4.getClass(), "iWeekOfWeekyear", null);
        setField(term4, term4.getClass(), "iWeekyear", null);
        setField(term4, term4.getClass(), "iWeekyearOfCentury", null);
        setField(term4, term4.getClass(), "iMonthOfYear", null);
        setField(term4, term4.getClass(), "iYear", null);
        setField(term4, term4.getClass(), "iYearOfEra", null);
        setField(term4, term4.getClass(), "iYearOfCentury", null);
        setField(term4, term4.getClass(), "iCenturyOfEra", null);
        setField(term4, term4.getClass(), "iEra", null);
        setIntField(term4, term4.getClass(), "iBaseFlags", 0);
        term6130 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term6131 = newInstance(Class.forName("java.lang.Object"));
        setField(term6130, term6130.getClass(), "iBase", null);
        setField(term6130, term6130.getClass(), "iParam", term6131);
        setField(term6130, term6130.getClass(), "iMillis", null);
        setField(term6130, term6130.getClass(), "iSeconds", null);
        setField(term6130, term6130.getClass(), "iMinutes", null);
        setField(term6130, term6130.getClass(), "iHours", null);
        setField(term6130, term6130.getClass(), "iHalfdays", null);
        setField(term6130, term6130.getClass(), "iDays", null);
        setField(term6130, term6130.getClass(), "iWeeks", null);
        setField(term6130, term6130.getClass(), "iWeekyears", null);
        setField(term6130, term6130.getClass(), "iMonths", null);
        setField(term6130, term6130.getClass(), "iYears", null);
        setField(term6130, term6130.getClass(), "iCenturies", null);
        setField(term6130, term6130.getClass(), "iEras", null);
        setField(term6130, term6130.getClass(), "iMillisOfSecond", null);
        setField(term6130, term6130.getClass(), "iMillisOfDay", null);
        setField(term6130, term6130.getClass(), "iSecondOfMinute", null);
        setField(term6130, term6130.getClass(), "iSecondOfDay", null);
        setField(term6130, term6130.getClass(), "iMinuteOfHour", null);
        setField(term6130, term6130.getClass(), "iMinuteOfDay", null);
        setField(term6130, term6130.getClass(), "iHourOfDay", null);
        setField(term6130, term6130.getClass(), "iClockhourOfDay", null);
        setField(term6130, term6130.getClass(), "iHourOfHalfday", null);
        setField(term6130, term6130.getClass(), "iClockhourOfHalfday", null);
        setField(term6130, term6130.getClass(), "iHalfdayOfDay", null);
        setField(term6130, term6130.getClass(), "iDayOfWeek", null);
        setField(term6130, term6130.getClass(), "iDayOfMonth", null);
        setField(term6130, term6130.getClass(), "iDayOfYear", null);
        setField(term6130, term6130.getClass(), "iWeekOfWeekyear", null);
        setField(term6130, term6130.getClass(), "iWeekyear", null);
        setField(term6130, term6130.getClass(), "iWeekyearOfCentury", null);
        setField(term6130, term6130.getClass(), "iMonthOfYear", null);
        setField(term6130, term6130.getClass(), "iYear", null);
        setField(term6130, term6130.getClass(), "iYearOfEra", null);
        setField(term6130, term6130.getClass(), "iYearOfCentury", null);
        setField(term6130, term6130.getClass(), "iCenturyOfEra", null);
        setField(term6130, term6130.getClass(), "iEra", null);
        setIntField(term6130, term6130.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withUTC", argTypes, term4, args);
        assertTrue(recursiveEquals(term4, term6130));
        assertTrue(recursiveEquals(retValue, null));
    }

};


