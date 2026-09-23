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

public class BasicMonthOfYearDateTimeField_readResolve_590698939176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38316;
     Object term38874;

    public BasicMonthOfYearDateTimeField_readResolve_590698939176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38316 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term38402 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term38316, term38316.getClass(), "iChronology", term38402);
        term38874 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term38875 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term38875, term38875.getClass(), "iYearInfoCache", null);
        setIntField(term38875, term38875.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term38875, term38875.getClass(), "iBase", null);
        setField(term38875, term38875.getClass(), "iParam", null);
        setField(term38875, term38875.getClass(), "iMillis", null);
        setField(term38875, term38875.getClass(), "iSeconds", null);
        setField(term38875, term38875.getClass(), "iMinutes", null);
        setField(term38875, term38875.getClass(), "iHours", null);
        setField(term38875, term38875.getClass(), "iHalfdays", null);
        setField(term38875, term38875.getClass(), "iDays", null);
        setField(term38875, term38875.getClass(), "iWeeks", null);
        setField(term38875, term38875.getClass(), "iWeekyears", null);
        setField(term38875, term38875.getClass(), "iMonths", null);
        setField(term38875, term38875.getClass(), "iYears", null);
        setField(term38875, term38875.getClass(), "iCenturies", null);
        setField(term38875, term38875.getClass(), "iEras", null);
        setField(term38875, term38875.getClass(), "iMillisOfSecond", null);
        setField(term38875, term38875.getClass(), "iMillisOfDay", null);
        setField(term38875, term38875.getClass(), "iSecondOfMinute", null);
        setField(term38875, term38875.getClass(), "iSecondOfDay", null);
        setField(term38875, term38875.getClass(), "iMinuteOfHour", null);
        setField(term38875, term38875.getClass(), "iMinuteOfDay", null);
        setField(term38875, term38875.getClass(), "iHourOfDay", null);
        setField(term38875, term38875.getClass(), "iClockhourOfDay", null);
        setField(term38875, term38875.getClass(), "iHourOfHalfday", null);
        setField(term38875, term38875.getClass(), "iClockhourOfHalfday", null);
        setField(term38875, term38875.getClass(), "iHalfdayOfDay", null);
        setField(term38875, term38875.getClass(), "iDayOfWeek", null);
        setField(term38875, term38875.getClass(), "iDayOfMonth", null);
        setField(term38875, term38875.getClass(), "iDayOfYear", null);
        setField(term38875, term38875.getClass(), "iWeekOfWeekyear", null);
        setField(term38875, term38875.getClass(), "iWeekyear", null);
        setField(term38875, term38875.getClass(), "iWeekyearOfCentury", null);
        setField(term38875, term38875.getClass(), "iMonthOfYear", null);
        setField(term38875, term38875.getClass(), "iYear", null);
        setField(term38875, term38875.getClass(), "iYearOfEra", null);
        setField(term38875, term38875.getClass(), "iYearOfCentury", null);
        setField(term38875, term38875.getClass(), "iCenturyOfEra", null);
        setField(term38875, term38875.getClass(), "iEra", null);
        setIntField(term38875, term38875.getClass(), "iBaseFlags", 0);
        setField(term38874, term38874.getClass(), "iChronology", term38875);
        setIntField(term38874, term38874.getClass(), "iMax", 0);
        setIntField(term38874, term38874.getClass(), "iLeapMonth", 0);
        setLongField(term38874, term38874.getClass(), "iUnitMillis", 0L);
        setField(term38874, term38874.getClass(), "iDurationField", null);
        setField(term38874, term38874.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term38316, args);
        assertTrue(recursiveEquals(term38316, term38874));
        assertTrue(recursiveEquals(retValue, null));
    }

};


