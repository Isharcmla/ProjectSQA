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

public class BasicMonthOfYearDateTimeField_readResolve_590698939146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31435;
     Object term31734;

    public BasicMonthOfYearDateTimeField_readResolve_590698939146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31435 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term31515 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term31435, term31435.getClass(), "iChronology", term31515);
        term31734 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term31735 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term31735, term31735.getClass(), "iYearInfoCache", null);
        setIntField(term31735, term31735.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term31735, term31735.getClass(), "iBase", null);
        setField(term31735, term31735.getClass(), "iParam", null);
        setField(term31735, term31735.getClass(), "iMillis", null);
        setField(term31735, term31735.getClass(), "iSeconds", null);
        setField(term31735, term31735.getClass(), "iMinutes", null);
        setField(term31735, term31735.getClass(), "iHours", null);
        setField(term31735, term31735.getClass(), "iHalfdays", null);
        setField(term31735, term31735.getClass(), "iDays", null);
        setField(term31735, term31735.getClass(), "iWeeks", null);
        setField(term31735, term31735.getClass(), "iWeekyears", null);
        setField(term31735, term31735.getClass(), "iMonths", null);
        setField(term31735, term31735.getClass(), "iYears", null);
        setField(term31735, term31735.getClass(), "iCenturies", null);
        setField(term31735, term31735.getClass(), "iEras", null);
        setField(term31735, term31735.getClass(), "iMillisOfSecond", null);
        setField(term31735, term31735.getClass(), "iMillisOfDay", null);
        setField(term31735, term31735.getClass(), "iSecondOfMinute", null);
        setField(term31735, term31735.getClass(), "iSecondOfDay", null);
        setField(term31735, term31735.getClass(), "iMinuteOfHour", null);
        setField(term31735, term31735.getClass(), "iMinuteOfDay", null);
        setField(term31735, term31735.getClass(), "iHourOfDay", null);
        setField(term31735, term31735.getClass(), "iClockhourOfDay", null);
        setField(term31735, term31735.getClass(), "iHourOfHalfday", null);
        setField(term31735, term31735.getClass(), "iClockhourOfHalfday", null);
        setField(term31735, term31735.getClass(), "iHalfdayOfDay", null);
        setField(term31735, term31735.getClass(), "iDayOfWeek", null);
        setField(term31735, term31735.getClass(), "iDayOfMonth", null);
        setField(term31735, term31735.getClass(), "iDayOfYear", null);
        setField(term31735, term31735.getClass(), "iWeekOfWeekyear", null);
        setField(term31735, term31735.getClass(), "iWeekyear", null);
        setField(term31735, term31735.getClass(), "iWeekyearOfCentury", null);
        setField(term31735, term31735.getClass(), "iMonthOfYear", null);
        setField(term31735, term31735.getClass(), "iYear", null);
        setField(term31735, term31735.getClass(), "iYearOfEra", null);
        setField(term31735, term31735.getClass(), "iYearOfCentury", null);
        setField(term31735, term31735.getClass(), "iCenturyOfEra", null);
        setField(term31735, term31735.getClass(), "iEra", null);
        setIntField(term31735, term31735.getClass(), "iBaseFlags", 0);
        setField(term31734, term31734.getClass(), "iChronology", term31735);
        setIntField(term31734, term31734.getClass(), "iMax", 0);
        setIntField(term31734, term31734.getClass(), "iLeapMonth", 0);
        setLongField(term31734, term31734.getClass(), "iUnitMillis", 0L);
        setField(term31734, term31734.getClass(), "iDurationField", null);
        setField(term31734, term31734.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term31435, args);
        assertTrue(recursiveEquals(term31435, term31734));
        assertTrue(recursiveEquals(retValue, null));
    }

};


