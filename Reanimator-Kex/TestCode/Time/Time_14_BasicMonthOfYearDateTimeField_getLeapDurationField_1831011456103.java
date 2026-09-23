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

public class BasicMonthOfYearDateTimeField_getLeapDurationField_1831011456103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20322;
     Object term20820;

    public BasicMonthOfYearDateTimeField_getLeapDurationField_1831011456103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20322 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term20408 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term20322, term20322.getClass(), "iChronology", term20408);
        term20820 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term20821 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term20821, term20821.getClass(), "iYearInfoCache", null);
        setIntField(term20821, term20821.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term20821, term20821.getClass(), "iBase", null);
        setField(term20821, term20821.getClass(), "iParam", null);
        setField(term20821, term20821.getClass(), "iMillis", null);
        setField(term20821, term20821.getClass(), "iSeconds", null);
        setField(term20821, term20821.getClass(), "iMinutes", null);
        setField(term20821, term20821.getClass(), "iHours", null);
        setField(term20821, term20821.getClass(), "iHalfdays", null);
        setField(term20821, term20821.getClass(), "iDays", null);
        setField(term20821, term20821.getClass(), "iWeeks", null);
        setField(term20821, term20821.getClass(), "iWeekyears", null);
        setField(term20821, term20821.getClass(), "iMonths", null);
        setField(term20821, term20821.getClass(), "iYears", null);
        setField(term20821, term20821.getClass(), "iCenturies", null);
        setField(term20821, term20821.getClass(), "iEras", null);
        setField(term20821, term20821.getClass(), "iMillisOfSecond", null);
        setField(term20821, term20821.getClass(), "iMillisOfDay", null);
        setField(term20821, term20821.getClass(), "iSecondOfMinute", null);
        setField(term20821, term20821.getClass(), "iSecondOfDay", null);
        setField(term20821, term20821.getClass(), "iMinuteOfHour", null);
        setField(term20821, term20821.getClass(), "iMinuteOfDay", null);
        setField(term20821, term20821.getClass(), "iHourOfDay", null);
        setField(term20821, term20821.getClass(), "iClockhourOfDay", null);
        setField(term20821, term20821.getClass(), "iHourOfHalfday", null);
        setField(term20821, term20821.getClass(), "iClockhourOfHalfday", null);
        setField(term20821, term20821.getClass(), "iHalfdayOfDay", null);
        setField(term20821, term20821.getClass(), "iDayOfWeek", null);
        setField(term20821, term20821.getClass(), "iDayOfMonth", null);
        setField(term20821, term20821.getClass(), "iDayOfYear", null);
        setField(term20821, term20821.getClass(), "iWeekOfWeekyear", null);
        setField(term20821, term20821.getClass(), "iWeekyear", null);
        setField(term20821, term20821.getClass(), "iWeekyearOfCentury", null);
        setField(term20821, term20821.getClass(), "iMonthOfYear", null);
        setField(term20821, term20821.getClass(), "iYear", null);
        setField(term20821, term20821.getClass(), "iYearOfEra", null);
        setField(term20821, term20821.getClass(), "iYearOfCentury", null);
        setField(term20821, term20821.getClass(), "iCenturyOfEra", null);
        setField(term20821, term20821.getClass(), "iEra", null);
        setIntField(term20821, term20821.getClass(), "iBaseFlags", 0);
        setField(term20820, term20820.getClass(), "iChronology", term20821);
        setIntField(term20820, term20820.getClass(), "iMax", 0);
        setIntField(term20820, term20820.getClass(), "iLeapMonth", 0);
        setLongField(term20820, term20820.getClass(), "iUnitMillis", 0L);
        setField(term20820, term20820.getClass(), "iDurationField", null);
        setField(term20820, term20820.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeapDurationField", argTypes, term20322, args);
        assertTrue(recursiveEquals(term20322, term20820));
        assertTrue(recursiveEquals(retValue, null));
    }

};


