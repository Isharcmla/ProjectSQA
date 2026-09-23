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

public class BasicMonthOfYearDateTimeField_readResolve_590698939139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30387;
     Object term30736;

    public BasicMonthOfYearDateTimeField_readResolve_590698939139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30387 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term30467 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term30387, term30387.getClass(), "iChronology", term30467);
        term30736 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term30737 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term30737, term30737.getClass(), "iYearInfoCache", null);
        setIntField(term30737, term30737.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term30737, term30737.getClass(), "iBase", null);
        setField(term30737, term30737.getClass(), "iParam", null);
        setField(term30737, term30737.getClass(), "iMillis", null);
        setField(term30737, term30737.getClass(), "iSeconds", null);
        setField(term30737, term30737.getClass(), "iMinutes", null);
        setField(term30737, term30737.getClass(), "iHours", null);
        setField(term30737, term30737.getClass(), "iHalfdays", null);
        setField(term30737, term30737.getClass(), "iDays", null);
        setField(term30737, term30737.getClass(), "iWeeks", null);
        setField(term30737, term30737.getClass(), "iWeekyears", null);
        setField(term30737, term30737.getClass(), "iMonths", null);
        setField(term30737, term30737.getClass(), "iYears", null);
        setField(term30737, term30737.getClass(), "iCenturies", null);
        setField(term30737, term30737.getClass(), "iEras", null);
        setField(term30737, term30737.getClass(), "iMillisOfSecond", null);
        setField(term30737, term30737.getClass(), "iMillisOfDay", null);
        setField(term30737, term30737.getClass(), "iSecondOfMinute", null);
        setField(term30737, term30737.getClass(), "iSecondOfDay", null);
        setField(term30737, term30737.getClass(), "iMinuteOfHour", null);
        setField(term30737, term30737.getClass(), "iMinuteOfDay", null);
        setField(term30737, term30737.getClass(), "iHourOfDay", null);
        setField(term30737, term30737.getClass(), "iClockhourOfDay", null);
        setField(term30737, term30737.getClass(), "iHourOfHalfday", null);
        setField(term30737, term30737.getClass(), "iClockhourOfHalfday", null);
        setField(term30737, term30737.getClass(), "iHalfdayOfDay", null);
        setField(term30737, term30737.getClass(), "iDayOfWeek", null);
        setField(term30737, term30737.getClass(), "iDayOfMonth", null);
        setField(term30737, term30737.getClass(), "iDayOfYear", null);
        setField(term30737, term30737.getClass(), "iWeekOfWeekyear", null);
        setField(term30737, term30737.getClass(), "iWeekyear", null);
        setField(term30737, term30737.getClass(), "iWeekyearOfCentury", null);
        setField(term30737, term30737.getClass(), "iMonthOfYear", null);
        setField(term30737, term30737.getClass(), "iYear", null);
        setField(term30737, term30737.getClass(), "iYearOfEra", null);
        setField(term30737, term30737.getClass(), "iYearOfCentury", null);
        setField(term30737, term30737.getClass(), "iCenturyOfEra", null);
        setField(term30737, term30737.getClass(), "iEra", null);
        setIntField(term30737, term30737.getClass(), "iBaseFlags", 0);
        setField(term30736, term30736.getClass(), "iChronology", term30737);
        setIntField(term30736, term30736.getClass(), "iMax", 0);
        setIntField(term30736, term30736.getClass(), "iLeapMonth", 0);
        setLongField(term30736, term30736.getClass(), "iUnitMillis", 0L);
        setField(term30736, term30736.getClass(), "iDurationField", null);
        setField(term30736, term30736.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term30387, args);
        assertTrue(recursiveEquals(term30387, term30736));
        assertTrue(recursiveEquals(retValue, null));
    }

};


