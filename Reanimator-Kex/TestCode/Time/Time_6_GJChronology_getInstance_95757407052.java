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
import java.lang.NumberFormatException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GJChronology_getInstance_95757407052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4935;

    public GJChronology_getInstance_95757407052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4935 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term4935, term4935.getClass(), "iJulianChronology", null);
        setField(term4935, term4935.getClass(), "iGregorianChronology", null);
        setField(term4935, term4935.getClass(), "iCutoverInstant", null);
        setLongField(term4935, term4935.getClass(), "iCutoverMillis", 0L);
        setLongField(term4935, term4935.getClass(), "iGapDuration", 0L);
        setField(term4935, term4935.getClass(), "iBase", null);
        setField(term4935, term4935.getClass(), "iParam", null);
        setField(term4935, term4935.getClass(), "iMillis", null);
        setField(term4935, term4935.getClass(), "iSeconds", null);
        setField(term4935, term4935.getClass(), "iMinutes", null);
        setField(term4935, term4935.getClass(), "iHours", null);
        setField(term4935, term4935.getClass(), "iHalfdays", null);
        setField(term4935, term4935.getClass(), "iDays", null);
        setField(term4935, term4935.getClass(), "iWeeks", null);
        setField(term4935, term4935.getClass(), "iWeekyears", null);
        setField(term4935, term4935.getClass(), "iMonths", null);
        setField(term4935, term4935.getClass(), "iYears", null);
        setField(term4935, term4935.getClass(), "iCenturies", null);
        setField(term4935, term4935.getClass(), "iEras", null);
        setField(term4935, term4935.getClass(), "iMillisOfSecond", null);
        setField(term4935, term4935.getClass(), "iMillisOfDay", null);
        setField(term4935, term4935.getClass(), "iSecondOfMinute", null);
        setField(term4935, term4935.getClass(), "iSecondOfDay", null);
        setField(term4935, term4935.getClass(), "iMinuteOfHour", null);
        setField(term4935, term4935.getClass(), "iMinuteOfDay", null);
        setField(term4935, term4935.getClass(), "iHourOfDay", null);
        setField(term4935, term4935.getClass(), "iClockhourOfDay", null);
        setField(term4935, term4935.getClass(), "iHourOfHalfday", null);
        setField(term4935, term4935.getClass(), "iClockhourOfHalfday", null);
        setField(term4935, term4935.getClass(), "iHalfdayOfDay", null);
        setField(term4935, term4935.getClass(), "iDayOfWeek", null);
        setField(term4935, term4935.getClass(), "iDayOfMonth", null);
        setField(term4935, term4935.getClass(), "iDayOfYear", null);
        setField(term4935, term4935.getClass(), "iWeekOfWeekyear", null);
        setField(term4935, term4935.getClass(), "iWeekyear", null);
        setField(term4935, term4935.getClass(), "iWeekyearOfCentury", null);
        setField(term4935, term4935.getClass(), "iMonthOfYear", null);
        setField(term4935, term4935.getClass(), "iYear", null);
        setField(term4935, term4935.getClass(), "iYearOfEra", null);
        setField(term4935, term4935.getClass(), "iYearOfCentury", null);
        setField(term4935, term4935.getClass(), "iCenturyOfEra", null);
        setField(term4935, term4935.getClass(), "iEra", null);
        setIntField(term4935, term4935.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getInstance", argTypes, term4935, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};


