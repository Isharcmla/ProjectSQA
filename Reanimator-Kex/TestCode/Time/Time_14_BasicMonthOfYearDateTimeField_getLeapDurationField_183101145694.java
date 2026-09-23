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

public class BasicMonthOfYearDateTimeField_getLeapDurationField_183101145694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18079;
     Object term18373;

    public BasicMonthOfYearDateTimeField_getLeapDurationField_183101145694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18079 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term18161 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term18079, term18079.getClass(), "iChronology", term18161);
        term18373 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term18374 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term18374, term18374.getClass(), "iLeapYears", null);
        setField(term18374, term18374.getClass(), "iYearInfoCache", null);
        setIntField(term18374, term18374.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term18374, term18374.getClass(), "iBase", null);
        setField(term18374, term18374.getClass(), "iParam", null);
        setField(term18374, term18374.getClass(), "iMillis", null);
        setField(term18374, term18374.getClass(), "iSeconds", null);
        setField(term18374, term18374.getClass(), "iMinutes", null);
        setField(term18374, term18374.getClass(), "iHours", null);
        setField(term18374, term18374.getClass(), "iHalfdays", null);
        setField(term18374, term18374.getClass(), "iDays", null);
        setField(term18374, term18374.getClass(), "iWeeks", null);
        setField(term18374, term18374.getClass(), "iWeekyears", null);
        setField(term18374, term18374.getClass(), "iMonths", null);
        setField(term18374, term18374.getClass(), "iYears", null);
        setField(term18374, term18374.getClass(), "iCenturies", null);
        setField(term18374, term18374.getClass(), "iEras", null);
        setField(term18374, term18374.getClass(), "iMillisOfSecond", null);
        setField(term18374, term18374.getClass(), "iMillisOfDay", null);
        setField(term18374, term18374.getClass(), "iSecondOfMinute", null);
        setField(term18374, term18374.getClass(), "iSecondOfDay", null);
        setField(term18374, term18374.getClass(), "iMinuteOfHour", null);
        setField(term18374, term18374.getClass(), "iMinuteOfDay", null);
        setField(term18374, term18374.getClass(), "iHourOfDay", null);
        setField(term18374, term18374.getClass(), "iClockhourOfDay", null);
        setField(term18374, term18374.getClass(), "iHourOfHalfday", null);
        setField(term18374, term18374.getClass(), "iClockhourOfHalfday", null);
        setField(term18374, term18374.getClass(), "iHalfdayOfDay", null);
        setField(term18374, term18374.getClass(), "iDayOfWeek", null);
        setField(term18374, term18374.getClass(), "iDayOfMonth", null);
        setField(term18374, term18374.getClass(), "iDayOfYear", null);
        setField(term18374, term18374.getClass(), "iWeekOfWeekyear", null);
        setField(term18374, term18374.getClass(), "iWeekyear", null);
        setField(term18374, term18374.getClass(), "iWeekyearOfCentury", null);
        setField(term18374, term18374.getClass(), "iMonthOfYear", null);
        setField(term18374, term18374.getClass(), "iYear", null);
        setField(term18374, term18374.getClass(), "iYearOfEra", null);
        setField(term18374, term18374.getClass(), "iYearOfCentury", null);
        setField(term18374, term18374.getClass(), "iCenturyOfEra", null);
        setField(term18374, term18374.getClass(), "iEra", null);
        setIntField(term18374, term18374.getClass(), "iBaseFlags", 0);
        setField(term18373, term18373.getClass(), "iChronology", term18374);
        setIntField(term18373, term18373.getClass(), "iMax", 0);
        setIntField(term18373, term18373.getClass(), "iLeapMonth", 0);
        setLongField(term18373, term18373.getClass(), "iUnitMillis", 0L);
        setField(term18373, term18373.getClass(), "iDurationField", null);
        setField(term18373, term18373.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeapDurationField", argTypes, term18079, args);
        assertTrue(recursiveEquals(term18079, term18373));
        assertTrue(recursiveEquals(retValue, null));
    }

};


