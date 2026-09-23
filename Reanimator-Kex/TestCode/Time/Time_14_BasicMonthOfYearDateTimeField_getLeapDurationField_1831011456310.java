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

public class BasicMonthOfYearDateTimeField_getLeapDurationField_1831011456310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77327;
     Object term77744;

    public BasicMonthOfYearDateTimeField_getLeapDurationField_1831011456310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77327 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term77407 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term77327, term77327.getClass(), "iChronology", term77407);
        term77744 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term77745 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term77745, term77745.getClass(), "iYearInfoCache", null);
        setIntField(term77745, term77745.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term77745, term77745.getClass(), "iBase", null);
        setField(term77745, term77745.getClass(), "iParam", null);
        setField(term77745, term77745.getClass(), "iMillis", null);
        setField(term77745, term77745.getClass(), "iSeconds", null);
        setField(term77745, term77745.getClass(), "iMinutes", null);
        setField(term77745, term77745.getClass(), "iHours", null);
        setField(term77745, term77745.getClass(), "iHalfdays", null);
        setField(term77745, term77745.getClass(), "iDays", null);
        setField(term77745, term77745.getClass(), "iWeeks", null);
        setField(term77745, term77745.getClass(), "iWeekyears", null);
        setField(term77745, term77745.getClass(), "iMonths", null);
        setField(term77745, term77745.getClass(), "iYears", null);
        setField(term77745, term77745.getClass(), "iCenturies", null);
        setField(term77745, term77745.getClass(), "iEras", null);
        setField(term77745, term77745.getClass(), "iMillisOfSecond", null);
        setField(term77745, term77745.getClass(), "iMillisOfDay", null);
        setField(term77745, term77745.getClass(), "iSecondOfMinute", null);
        setField(term77745, term77745.getClass(), "iSecondOfDay", null);
        setField(term77745, term77745.getClass(), "iMinuteOfHour", null);
        setField(term77745, term77745.getClass(), "iMinuteOfDay", null);
        setField(term77745, term77745.getClass(), "iHourOfDay", null);
        setField(term77745, term77745.getClass(), "iClockhourOfDay", null);
        setField(term77745, term77745.getClass(), "iHourOfHalfday", null);
        setField(term77745, term77745.getClass(), "iClockhourOfHalfday", null);
        setField(term77745, term77745.getClass(), "iHalfdayOfDay", null);
        setField(term77745, term77745.getClass(), "iDayOfWeek", null);
        setField(term77745, term77745.getClass(), "iDayOfMonth", null);
        setField(term77745, term77745.getClass(), "iDayOfYear", null);
        setField(term77745, term77745.getClass(), "iWeekOfWeekyear", null);
        setField(term77745, term77745.getClass(), "iWeekyear", null);
        setField(term77745, term77745.getClass(), "iWeekyearOfCentury", null);
        setField(term77745, term77745.getClass(), "iMonthOfYear", null);
        setField(term77745, term77745.getClass(), "iYear", null);
        setField(term77745, term77745.getClass(), "iYearOfEra", null);
        setField(term77745, term77745.getClass(), "iYearOfCentury", null);
        setField(term77745, term77745.getClass(), "iCenturyOfEra", null);
        setField(term77745, term77745.getClass(), "iEra", null);
        setIntField(term77745, term77745.getClass(), "iBaseFlags", 0);
        setField(term77744, term77744.getClass(), "iChronology", term77745);
        setIntField(term77744, term77744.getClass(), "iMax", 0);
        setIntField(term77744, term77744.getClass(), "iLeapMonth", 0);
        setLongField(term77744, term77744.getClass(), "iUnitMillis", 0L);
        setField(term77744, term77744.getClass(), "iDurationField", null);
        setField(term77744, term77744.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeapDurationField", argTypes, term77327, args);
        assertTrue(recursiveEquals(term77327, term77744));
        assertTrue(recursiveEquals(retValue, null));
    }

};


