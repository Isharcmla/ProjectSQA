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

public class BasicMonthOfYearDateTimeField_getRangeDurationField_77737311154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7628;
     Object term7927;

    public BasicMonthOfYearDateTimeField_getRangeDurationField_77737311154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7628 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term7708 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term7628, term7628.getClass(), "iChronology", term7708);
        term7927 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term7928 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term7928, term7928.getClass(), "iYearInfoCache", null);
        setIntField(term7928, term7928.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term7928, term7928.getClass(), "iBase", null);
        setField(term7928, term7928.getClass(), "iParam", null);
        setField(term7928, term7928.getClass(), "iMillis", null);
        setField(term7928, term7928.getClass(), "iSeconds", null);
        setField(term7928, term7928.getClass(), "iMinutes", null);
        setField(term7928, term7928.getClass(), "iHours", null);
        setField(term7928, term7928.getClass(), "iHalfdays", null);
        setField(term7928, term7928.getClass(), "iDays", null);
        setField(term7928, term7928.getClass(), "iWeeks", null);
        setField(term7928, term7928.getClass(), "iWeekyears", null);
        setField(term7928, term7928.getClass(), "iMonths", null);
        setField(term7928, term7928.getClass(), "iYears", null);
        setField(term7928, term7928.getClass(), "iCenturies", null);
        setField(term7928, term7928.getClass(), "iEras", null);
        setField(term7928, term7928.getClass(), "iMillisOfSecond", null);
        setField(term7928, term7928.getClass(), "iMillisOfDay", null);
        setField(term7928, term7928.getClass(), "iSecondOfMinute", null);
        setField(term7928, term7928.getClass(), "iSecondOfDay", null);
        setField(term7928, term7928.getClass(), "iMinuteOfHour", null);
        setField(term7928, term7928.getClass(), "iMinuteOfDay", null);
        setField(term7928, term7928.getClass(), "iHourOfDay", null);
        setField(term7928, term7928.getClass(), "iClockhourOfDay", null);
        setField(term7928, term7928.getClass(), "iHourOfHalfday", null);
        setField(term7928, term7928.getClass(), "iClockhourOfHalfday", null);
        setField(term7928, term7928.getClass(), "iHalfdayOfDay", null);
        setField(term7928, term7928.getClass(), "iDayOfWeek", null);
        setField(term7928, term7928.getClass(), "iDayOfMonth", null);
        setField(term7928, term7928.getClass(), "iDayOfYear", null);
        setField(term7928, term7928.getClass(), "iWeekOfWeekyear", null);
        setField(term7928, term7928.getClass(), "iWeekyear", null);
        setField(term7928, term7928.getClass(), "iWeekyearOfCentury", null);
        setField(term7928, term7928.getClass(), "iMonthOfYear", null);
        setField(term7928, term7928.getClass(), "iYear", null);
        setField(term7928, term7928.getClass(), "iYearOfEra", null);
        setField(term7928, term7928.getClass(), "iYearOfCentury", null);
        setField(term7928, term7928.getClass(), "iCenturyOfEra", null);
        setField(term7928, term7928.getClass(), "iEra", null);
        setIntField(term7928, term7928.getClass(), "iBaseFlags", 0);
        setField(term7927, term7927.getClass(), "iChronology", term7928);
        setIntField(term7927, term7927.getClass(), "iMax", 0);
        setIntField(term7927, term7927.getClass(), "iLeapMonth", 0);
        setLongField(term7927, term7927.getClass(), "iUnitMillis", 0L);
        setField(term7927, term7927.getClass(), "iDurationField", null);
        setField(term7927, term7927.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDurationField", argTypes, term7628, args);
        assertTrue(recursiveEquals(term7628, term7927));
        assertTrue(recursiveEquals(retValue, null));
    }

};


