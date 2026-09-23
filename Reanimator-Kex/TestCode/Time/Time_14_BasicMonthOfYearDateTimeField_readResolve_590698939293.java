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

public class BasicMonthOfYearDateTimeField_readResolve_590698939293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72248;
     Object term72554;

    public BasicMonthOfYearDateTimeField_readResolve_590698939293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72248 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term72330 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term72248, term72248.getClass(), "iChronology", term72330);
        term72554 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term72555 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term72555, term72555.getClass(), "iLeapYears", null);
        setField(term72555, term72555.getClass(), "iYearInfoCache", null);
        setIntField(term72555, term72555.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term72555, term72555.getClass(), "iBase", null);
        setField(term72555, term72555.getClass(), "iParam", null);
        setField(term72555, term72555.getClass(), "iMillis", null);
        setField(term72555, term72555.getClass(), "iSeconds", null);
        setField(term72555, term72555.getClass(), "iMinutes", null);
        setField(term72555, term72555.getClass(), "iHours", null);
        setField(term72555, term72555.getClass(), "iHalfdays", null);
        setField(term72555, term72555.getClass(), "iDays", null);
        setField(term72555, term72555.getClass(), "iWeeks", null);
        setField(term72555, term72555.getClass(), "iWeekyears", null);
        setField(term72555, term72555.getClass(), "iMonths", null);
        setField(term72555, term72555.getClass(), "iYears", null);
        setField(term72555, term72555.getClass(), "iCenturies", null);
        setField(term72555, term72555.getClass(), "iEras", null);
        setField(term72555, term72555.getClass(), "iMillisOfSecond", null);
        setField(term72555, term72555.getClass(), "iMillisOfDay", null);
        setField(term72555, term72555.getClass(), "iSecondOfMinute", null);
        setField(term72555, term72555.getClass(), "iSecondOfDay", null);
        setField(term72555, term72555.getClass(), "iMinuteOfHour", null);
        setField(term72555, term72555.getClass(), "iMinuteOfDay", null);
        setField(term72555, term72555.getClass(), "iHourOfDay", null);
        setField(term72555, term72555.getClass(), "iClockhourOfDay", null);
        setField(term72555, term72555.getClass(), "iHourOfHalfday", null);
        setField(term72555, term72555.getClass(), "iClockhourOfHalfday", null);
        setField(term72555, term72555.getClass(), "iHalfdayOfDay", null);
        setField(term72555, term72555.getClass(), "iDayOfWeek", null);
        setField(term72555, term72555.getClass(), "iDayOfMonth", null);
        setField(term72555, term72555.getClass(), "iDayOfYear", null);
        setField(term72555, term72555.getClass(), "iWeekOfWeekyear", null);
        setField(term72555, term72555.getClass(), "iWeekyear", null);
        setField(term72555, term72555.getClass(), "iWeekyearOfCentury", null);
        setField(term72555, term72555.getClass(), "iMonthOfYear", null);
        setField(term72555, term72555.getClass(), "iYear", null);
        setField(term72555, term72555.getClass(), "iYearOfEra", null);
        setField(term72555, term72555.getClass(), "iYearOfCentury", null);
        setField(term72555, term72555.getClass(), "iCenturyOfEra", null);
        setField(term72555, term72555.getClass(), "iEra", null);
        setIntField(term72555, term72555.getClass(), "iBaseFlags", 0);
        setField(term72554, term72554.getClass(), "iChronology", term72555);
        setIntField(term72554, term72554.getClass(), "iMax", 0);
        setIntField(term72554, term72554.getClass(), "iLeapMonth", 0);
        setLongField(term72554, term72554.getClass(), "iUnitMillis", 0L);
        setField(term72554, term72554.getClass(), "iDurationField", null);
        setField(term72554, term72554.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term72248, args);
        assertTrue(recursiveEquals(term72248, term72554));
        assertTrue(recursiveEquals(retValue, null));
    }

};


