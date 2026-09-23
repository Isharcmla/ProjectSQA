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

public class BasicMonthOfYearDateTimeField_getLeapDurationField_1831011456142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30853;
     Object term31067;

    public BasicMonthOfYearDateTimeField_getLeapDurationField_1831011456142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30853 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term30933 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term30853, term30853.getClass(), "iChronology", term30933);
        term31067 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term31068 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term31068, term31068.getClass(), "iYearInfoCache", null);
        setIntField(term31068, term31068.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term31068, term31068.getClass(), "iBase", null);
        setField(term31068, term31068.getClass(), "iParam", null);
        setField(term31068, term31068.getClass(), "iMillis", null);
        setField(term31068, term31068.getClass(), "iSeconds", null);
        setField(term31068, term31068.getClass(), "iMinutes", null);
        setField(term31068, term31068.getClass(), "iHours", null);
        setField(term31068, term31068.getClass(), "iHalfdays", null);
        setField(term31068, term31068.getClass(), "iDays", null);
        setField(term31068, term31068.getClass(), "iWeeks", null);
        setField(term31068, term31068.getClass(), "iWeekyears", null);
        setField(term31068, term31068.getClass(), "iMonths", null);
        setField(term31068, term31068.getClass(), "iYears", null);
        setField(term31068, term31068.getClass(), "iCenturies", null);
        setField(term31068, term31068.getClass(), "iEras", null);
        setField(term31068, term31068.getClass(), "iMillisOfSecond", null);
        setField(term31068, term31068.getClass(), "iMillisOfDay", null);
        setField(term31068, term31068.getClass(), "iSecondOfMinute", null);
        setField(term31068, term31068.getClass(), "iSecondOfDay", null);
        setField(term31068, term31068.getClass(), "iMinuteOfHour", null);
        setField(term31068, term31068.getClass(), "iMinuteOfDay", null);
        setField(term31068, term31068.getClass(), "iHourOfDay", null);
        setField(term31068, term31068.getClass(), "iClockhourOfDay", null);
        setField(term31068, term31068.getClass(), "iHourOfHalfday", null);
        setField(term31068, term31068.getClass(), "iClockhourOfHalfday", null);
        setField(term31068, term31068.getClass(), "iHalfdayOfDay", null);
        setField(term31068, term31068.getClass(), "iDayOfWeek", null);
        setField(term31068, term31068.getClass(), "iDayOfMonth", null);
        setField(term31068, term31068.getClass(), "iDayOfYear", null);
        setField(term31068, term31068.getClass(), "iWeekOfWeekyear", null);
        setField(term31068, term31068.getClass(), "iWeekyear", null);
        setField(term31068, term31068.getClass(), "iWeekyearOfCentury", null);
        setField(term31068, term31068.getClass(), "iMonthOfYear", null);
        setField(term31068, term31068.getClass(), "iYear", null);
        setField(term31068, term31068.getClass(), "iYearOfEra", null);
        setField(term31068, term31068.getClass(), "iYearOfCentury", null);
        setField(term31068, term31068.getClass(), "iCenturyOfEra", null);
        setField(term31068, term31068.getClass(), "iEra", null);
        setIntField(term31068, term31068.getClass(), "iBaseFlags", 0);
        setField(term31067, term31067.getClass(), "iChronology", term31068);
        setIntField(term31067, term31067.getClass(), "iMax", 0);
        setIntField(term31067, term31067.getClass(), "iLeapMonth", 0);
        setLongField(term31067, term31067.getClass(), "iUnitMillis", 0L);
        setField(term31067, term31067.getClass(), "iDurationField", null);
        setField(term31067, term31067.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeapDurationField", argTypes, term30853, args);
        assertTrue(recursiveEquals(term30853, term31067));
        assertTrue(recursiveEquals(retValue, null));
    }

};


