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

public class BasicMonthOfYearDateTimeField_getRangeDurationField_777373111235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55711;
     Object term55808;

    public BasicMonthOfYearDateTimeField_getRangeDurationField_777373111235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55711 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term55797 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term55711, term55711.getClass(), "iChronology", term55797);
        term55808 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term55809 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term55809, term55809.getClass(), "iYearInfoCache", null);
        setIntField(term55809, term55809.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term55809, term55809.getClass(), "iBase", null);
        setField(term55809, term55809.getClass(), "iParam", null);
        setField(term55809, term55809.getClass(), "iMillis", null);
        setField(term55809, term55809.getClass(), "iSeconds", null);
        setField(term55809, term55809.getClass(), "iMinutes", null);
        setField(term55809, term55809.getClass(), "iHours", null);
        setField(term55809, term55809.getClass(), "iHalfdays", null);
        setField(term55809, term55809.getClass(), "iDays", null);
        setField(term55809, term55809.getClass(), "iWeeks", null);
        setField(term55809, term55809.getClass(), "iWeekyears", null);
        setField(term55809, term55809.getClass(), "iMonths", null);
        setField(term55809, term55809.getClass(), "iYears", null);
        setField(term55809, term55809.getClass(), "iCenturies", null);
        setField(term55809, term55809.getClass(), "iEras", null);
        setField(term55809, term55809.getClass(), "iMillisOfSecond", null);
        setField(term55809, term55809.getClass(), "iMillisOfDay", null);
        setField(term55809, term55809.getClass(), "iSecondOfMinute", null);
        setField(term55809, term55809.getClass(), "iSecondOfDay", null);
        setField(term55809, term55809.getClass(), "iMinuteOfHour", null);
        setField(term55809, term55809.getClass(), "iMinuteOfDay", null);
        setField(term55809, term55809.getClass(), "iHourOfDay", null);
        setField(term55809, term55809.getClass(), "iClockhourOfDay", null);
        setField(term55809, term55809.getClass(), "iHourOfHalfday", null);
        setField(term55809, term55809.getClass(), "iClockhourOfHalfday", null);
        setField(term55809, term55809.getClass(), "iHalfdayOfDay", null);
        setField(term55809, term55809.getClass(), "iDayOfWeek", null);
        setField(term55809, term55809.getClass(), "iDayOfMonth", null);
        setField(term55809, term55809.getClass(), "iDayOfYear", null);
        setField(term55809, term55809.getClass(), "iWeekOfWeekyear", null);
        setField(term55809, term55809.getClass(), "iWeekyear", null);
        setField(term55809, term55809.getClass(), "iWeekyearOfCentury", null);
        setField(term55809, term55809.getClass(), "iMonthOfYear", null);
        setField(term55809, term55809.getClass(), "iYear", null);
        setField(term55809, term55809.getClass(), "iYearOfEra", null);
        setField(term55809, term55809.getClass(), "iYearOfCentury", null);
        setField(term55809, term55809.getClass(), "iCenturyOfEra", null);
        setField(term55809, term55809.getClass(), "iEra", null);
        setIntField(term55809, term55809.getClass(), "iBaseFlags", 0);
        setField(term55808, term55808.getClass(), "iChronology", term55809);
        setIntField(term55808, term55808.getClass(), "iMax", 0);
        setIntField(term55808, term55808.getClass(), "iLeapMonth", 0);
        setLongField(term55808, term55808.getClass(), "iUnitMillis", 0L);
        setField(term55808, term55808.getClass(), "iDurationField", null);
        setField(term55808, term55808.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDurationField", argTypes, term55711, args);
        assertTrue(recursiveEquals(term55711, term55808));
        assertTrue(recursiveEquals(retValue, null));
    }

};


