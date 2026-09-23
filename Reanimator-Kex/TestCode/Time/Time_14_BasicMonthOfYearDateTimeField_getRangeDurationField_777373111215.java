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

public class BasicMonthOfYearDateTimeField_getRangeDurationField_777373111215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49743;
     Object term50533;

    public BasicMonthOfYearDateTimeField_getRangeDurationField_777373111215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49743 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term49827 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term49743, term49743.getClass(), "iChronology", term49827);
        term50533 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term50534 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term50534, term50534.getClass(), "iYearInfoCache", null);
        setIntField(term50534, term50534.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term50534, term50534.getClass(), "iBase", null);
        setField(term50534, term50534.getClass(), "iParam", null);
        setField(term50534, term50534.getClass(), "iMillis", null);
        setField(term50534, term50534.getClass(), "iSeconds", null);
        setField(term50534, term50534.getClass(), "iMinutes", null);
        setField(term50534, term50534.getClass(), "iHours", null);
        setField(term50534, term50534.getClass(), "iHalfdays", null);
        setField(term50534, term50534.getClass(), "iDays", null);
        setField(term50534, term50534.getClass(), "iWeeks", null);
        setField(term50534, term50534.getClass(), "iWeekyears", null);
        setField(term50534, term50534.getClass(), "iMonths", null);
        setField(term50534, term50534.getClass(), "iYears", null);
        setField(term50534, term50534.getClass(), "iCenturies", null);
        setField(term50534, term50534.getClass(), "iEras", null);
        setField(term50534, term50534.getClass(), "iMillisOfSecond", null);
        setField(term50534, term50534.getClass(), "iMillisOfDay", null);
        setField(term50534, term50534.getClass(), "iSecondOfMinute", null);
        setField(term50534, term50534.getClass(), "iSecondOfDay", null);
        setField(term50534, term50534.getClass(), "iMinuteOfHour", null);
        setField(term50534, term50534.getClass(), "iMinuteOfDay", null);
        setField(term50534, term50534.getClass(), "iHourOfDay", null);
        setField(term50534, term50534.getClass(), "iClockhourOfDay", null);
        setField(term50534, term50534.getClass(), "iHourOfHalfday", null);
        setField(term50534, term50534.getClass(), "iClockhourOfHalfday", null);
        setField(term50534, term50534.getClass(), "iHalfdayOfDay", null);
        setField(term50534, term50534.getClass(), "iDayOfWeek", null);
        setField(term50534, term50534.getClass(), "iDayOfMonth", null);
        setField(term50534, term50534.getClass(), "iDayOfYear", null);
        setField(term50534, term50534.getClass(), "iWeekOfWeekyear", null);
        setField(term50534, term50534.getClass(), "iWeekyear", null);
        setField(term50534, term50534.getClass(), "iWeekyearOfCentury", null);
        setField(term50534, term50534.getClass(), "iMonthOfYear", null);
        setField(term50534, term50534.getClass(), "iYear", null);
        setField(term50534, term50534.getClass(), "iYearOfEra", null);
        setField(term50534, term50534.getClass(), "iYearOfCentury", null);
        setField(term50534, term50534.getClass(), "iCenturyOfEra", null);
        setField(term50534, term50534.getClass(), "iEra", null);
        setIntField(term50534, term50534.getClass(), "iBaseFlags", 0);
        setField(term50533, term50533.getClass(), "iChronology", term50534);
        setIntField(term50533, term50533.getClass(), "iMax", 0);
        setIntField(term50533, term50533.getClass(), "iLeapMonth", 0);
        setLongField(term50533, term50533.getClass(), "iUnitMillis", 0L);
        setField(term50533, term50533.getClass(), "iDurationField", null);
        setField(term50533, term50533.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDurationField", argTypes, term49743, args);
        assertTrue(recursiveEquals(term49743, term50533));
        assertTrue(recursiveEquals(retValue, null));
    }

};


