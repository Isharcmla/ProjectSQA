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

public class BasicMonthOfYearDateTimeField_getRangeDurationField_777373111185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40787;
     Object term41286;

    public BasicMonthOfYearDateTimeField_getRangeDurationField_777373111185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40787 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term40869 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term40787, term40787.getClass(), "iChronology", term40869);
        term41286 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term41287 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term41287, term41287.getClass(), "iLeapYears", null);
        setField(term41287, term41287.getClass(), "iYearInfoCache", null);
        setIntField(term41287, term41287.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term41287, term41287.getClass(), "iBase", null);
        setField(term41287, term41287.getClass(), "iParam", null);
        setField(term41287, term41287.getClass(), "iMillis", null);
        setField(term41287, term41287.getClass(), "iSeconds", null);
        setField(term41287, term41287.getClass(), "iMinutes", null);
        setField(term41287, term41287.getClass(), "iHours", null);
        setField(term41287, term41287.getClass(), "iHalfdays", null);
        setField(term41287, term41287.getClass(), "iDays", null);
        setField(term41287, term41287.getClass(), "iWeeks", null);
        setField(term41287, term41287.getClass(), "iWeekyears", null);
        setField(term41287, term41287.getClass(), "iMonths", null);
        setField(term41287, term41287.getClass(), "iYears", null);
        setField(term41287, term41287.getClass(), "iCenturies", null);
        setField(term41287, term41287.getClass(), "iEras", null);
        setField(term41287, term41287.getClass(), "iMillisOfSecond", null);
        setField(term41287, term41287.getClass(), "iMillisOfDay", null);
        setField(term41287, term41287.getClass(), "iSecondOfMinute", null);
        setField(term41287, term41287.getClass(), "iSecondOfDay", null);
        setField(term41287, term41287.getClass(), "iMinuteOfHour", null);
        setField(term41287, term41287.getClass(), "iMinuteOfDay", null);
        setField(term41287, term41287.getClass(), "iHourOfDay", null);
        setField(term41287, term41287.getClass(), "iClockhourOfDay", null);
        setField(term41287, term41287.getClass(), "iHourOfHalfday", null);
        setField(term41287, term41287.getClass(), "iClockhourOfHalfday", null);
        setField(term41287, term41287.getClass(), "iHalfdayOfDay", null);
        setField(term41287, term41287.getClass(), "iDayOfWeek", null);
        setField(term41287, term41287.getClass(), "iDayOfMonth", null);
        setField(term41287, term41287.getClass(), "iDayOfYear", null);
        setField(term41287, term41287.getClass(), "iWeekOfWeekyear", null);
        setField(term41287, term41287.getClass(), "iWeekyear", null);
        setField(term41287, term41287.getClass(), "iWeekyearOfCentury", null);
        setField(term41287, term41287.getClass(), "iMonthOfYear", null);
        setField(term41287, term41287.getClass(), "iYear", null);
        setField(term41287, term41287.getClass(), "iYearOfEra", null);
        setField(term41287, term41287.getClass(), "iYearOfCentury", null);
        setField(term41287, term41287.getClass(), "iCenturyOfEra", null);
        setField(term41287, term41287.getClass(), "iEra", null);
        setIntField(term41287, term41287.getClass(), "iBaseFlags", 0);
        setField(term41286, term41286.getClass(), "iChronology", term41287);
        setIntField(term41286, term41286.getClass(), "iMax", 0);
        setIntField(term41286, term41286.getClass(), "iLeapMonth", 0);
        setLongField(term41286, term41286.getClass(), "iUnitMillis", 0L);
        setField(term41286, term41286.getClass(), "iDurationField", null);
        setField(term41286, term41286.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDurationField", argTypes, term40787, args);
        assertTrue(recursiveEquals(term40787, term41286));
        assertTrue(recursiveEquals(retValue, null));
    }

};


