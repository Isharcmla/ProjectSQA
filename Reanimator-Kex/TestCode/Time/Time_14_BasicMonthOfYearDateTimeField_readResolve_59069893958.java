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

public class BasicMonthOfYearDateTimeField_readResolve_59069893958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8444;
     Object term8751;

    public BasicMonthOfYearDateTimeField_readResolve_59069893958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8444 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term8528 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term8444, term8444.getClass(), "iChronology", term8528);
        term8751 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term8752 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term8752, term8752.getClass(), "iYearInfoCache", null);
        setIntField(term8752, term8752.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term8752, term8752.getClass(), "iBase", null);
        setField(term8752, term8752.getClass(), "iParam", null);
        setField(term8752, term8752.getClass(), "iMillis", null);
        setField(term8752, term8752.getClass(), "iSeconds", null);
        setField(term8752, term8752.getClass(), "iMinutes", null);
        setField(term8752, term8752.getClass(), "iHours", null);
        setField(term8752, term8752.getClass(), "iHalfdays", null);
        setField(term8752, term8752.getClass(), "iDays", null);
        setField(term8752, term8752.getClass(), "iWeeks", null);
        setField(term8752, term8752.getClass(), "iWeekyears", null);
        setField(term8752, term8752.getClass(), "iMonths", null);
        setField(term8752, term8752.getClass(), "iYears", null);
        setField(term8752, term8752.getClass(), "iCenturies", null);
        setField(term8752, term8752.getClass(), "iEras", null);
        setField(term8752, term8752.getClass(), "iMillisOfSecond", null);
        setField(term8752, term8752.getClass(), "iMillisOfDay", null);
        setField(term8752, term8752.getClass(), "iSecondOfMinute", null);
        setField(term8752, term8752.getClass(), "iSecondOfDay", null);
        setField(term8752, term8752.getClass(), "iMinuteOfHour", null);
        setField(term8752, term8752.getClass(), "iMinuteOfDay", null);
        setField(term8752, term8752.getClass(), "iHourOfDay", null);
        setField(term8752, term8752.getClass(), "iClockhourOfDay", null);
        setField(term8752, term8752.getClass(), "iHourOfHalfday", null);
        setField(term8752, term8752.getClass(), "iClockhourOfHalfday", null);
        setField(term8752, term8752.getClass(), "iHalfdayOfDay", null);
        setField(term8752, term8752.getClass(), "iDayOfWeek", null);
        setField(term8752, term8752.getClass(), "iDayOfMonth", null);
        setField(term8752, term8752.getClass(), "iDayOfYear", null);
        setField(term8752, term8752.getClass(), "iWeekOfWeekyear", null);
        setField(term8752, term8752.getClass(), "iWeekyear", null);
        setField(term8752, term8752.getClass(), "iWeekyearOfCentury", null);
        setField(term8752, term8752.getClass(), "iMonthOfYear", null);
        setField(term8752, term8752.getClass(), "iYear", null);
        setField(term8752, term8752.getClass(), "iYearOfEra", null);
        setField(term8752, term8752.getClass(), "iYearOfCentury", null);
        setField(term8752, term8752.getClass(), "iCenturyOfEra", null);
        setField(term8752, term8752.getClass(), "iEra", null);
        setIntField(term8752, term8752.getClass(), "iBaseFlags", 0);
        setField(term8751, term8751.getClass(), "iChronology", term8752);
        setIntField(term8751, term8751.getClass(), "iMax", 0);
        setIntField(term8751, term8751.getClass(), "iLeapMonth", 0);
        setLongField(term8751, term8751.getClass(), "iUnitMillis", 0L);
        setField(term8751, term8751.getClass(), "iDurationField", null);
        setField(term8751, term8751.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term8444, args);
        assertTrue(recursiveEquals(term8444, term8751));
        assertTrue(recursiveEquals(retValue, null));
    }

};


