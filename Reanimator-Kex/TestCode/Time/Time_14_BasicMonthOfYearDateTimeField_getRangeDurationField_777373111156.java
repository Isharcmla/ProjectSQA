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

public class BasicMonthOfYearDateTimeField_getRangeDurationField_777373111156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33440;
     Object term33730;

    public BasicMonthOfYearDateTimeField_getRangeDurationField_777373111156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33440 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term33520 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term33440, term33440.getClass(), "iChronology", term33520);
        term33730 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term33731 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term33731, term33731.getClass(), "iYearInfoCache", null);
        setIntField(term33731, term33731.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term33731, term33731.getClass(), "iBase", null);
        setField(term33731, term33731.getClass(), "iParam", null);
        setField(term33731, term33731.getClass(), "iMillis", null);
        setField(term33731, term33731.getClass(), "iSeconds", null);
        setField(term33731, term33731.getClass(), "iMinutes", null);
        setField(term33731, term33731.getClass(), "iHours", null);
        setField(term33731, term33731.getClass(), "iHalfdays", null);
        setField(term33731, term33731.getClass(), "iDays", null);
        setField(term33731, term33731.getClass(), "iWeeks", null);
        setField(term33731, term33731.getClass(), "iWeekyears", null);
        setField(term33731, term33731.getClass(), "iMonths", null);
        setField(term33731, term33731.getClass(), "iYears", null);
        setField(term33731, term33731.getClass(), "iCenturies", null);
        setField(term33731, term33731.getClass(), "iEras", null);
        setField(term33731, term33731.getClass(), "iMillisOfSecond", null);
        setField(term33731, term33731.getClass(), "iMillisOfDay", null);
        setField(term33731, term33731.getClass(), "iSecondOfMinute", null);
        setField(term33731, term33731.getClass(), "iSecondOfDay", null);
        setField(term33731, term33731.getClass(), "iMinuteOfHour", null);
        setField(term33731, term33731.getClass(), "iMinuteOfDay", null);
        setField(term33731, term33731.getClass(), "iHourOfDay", null);
        setField(term33731, term33731.getClass(), "iClockhourOfDay", null);
        setField(term33731, term33731.getClass(), "iHourOfHalfday", null);
        setField(term33731, term33731.getClass(), "iClockhourOfHalfday", null);
        setField(term33731, term33731.getClass(), "iHalfdayOfDay", null);
        setField(term33731, term33731.getClass(), "iDayOfWeek", null);
        setField(term33731, term33731.getClass(), "iDayOfMonth", null);
        setField(term33731, term33731.getClass(), "iDayOfYear", null);
        setField(term33731, term33731.getClass(), "iWeekOfWeekyear", null);
        setField(term33731, term33731.getClass(), "iWeekyear", null);
        setField(term33731, term33731.getClass(), "iWeekyearOfCentury", null);
        setField(term33731, term33731.getClass(), "iMonthOfYear", null);
        setField(term33731, term33731.getClass(), "iYear", null);
        setField(term33731, term33731.getClass(), "iYearOfEra", null);
        setField(term33731, term33731.getClass(), "iYearOfCentury", null);
        setField(term33731, term33731.getClass(), "iCenturyOfEra", null);
        setField(term33731, term33731.getClass(), "iEra", null);
        setIntField(term33731, term33731.getClass(), "iBaseFlags", 0);
        setField(term33730, term33730.getClass(), "iChronology", term33731);
        setIntField(term33730, term33730.getClass(), "iMax", 0);
        setIntField(term33730, term33730.getClass(), "iLeapMonth", 0);
        setLongField(term33730, term33730.getClass(), "iUnitMillis", 0L);
        setField(term33730, term33730.getClass(), "iDurationField", null);
        setField(term33730, term33730.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDurationField", argTypes, term33440, args);
        assertTrue(recursiveEquals(term33440, term33730));
        assertTrue(recursiveEquals(retValue, null));
    }

};


