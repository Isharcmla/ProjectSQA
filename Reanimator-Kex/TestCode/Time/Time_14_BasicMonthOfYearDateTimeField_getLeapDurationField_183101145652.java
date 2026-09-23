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

public class BasicMonthOfYearDateTimeField_getLeapDurationField_183101145652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6206;
     Object term7719;

    public BasicMonthOfYearDateTimeField_getLeapDurationField_183101145652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6206 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term6290 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term6206, term6206.getClass(), "iChronology", term6290);
        term7719 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term7720 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term7720, term7720.getClass(), "iYearInfoCache", null);
        setIntField(term7720, term7720.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term7720, term7720.getClass(), "iBase", null);
        setField(term7720, term7720.getClass(), "iParam", null);
        setField(term7720, term7720.getClass(), "iMillis", null);
        setField(term7720, term7720.getClass(), "iSeconds", null);
        setField(term7720, term7720.getClass(), "iMinutes", null);
        setField(term7720, term7720.getClass(), "iHours", null);
        setField(term7720, term7720.getClass(), "iHalfdays", null);
        setField(term7720, term7720.getClass(), "iDays", null);
        setField(term7720, term7720.getClass(), "iWeeks", null);
        setField(term7720, term7720.getClass(), "iWeekyears", null);
        setField(term7720, term7720.getClass(), "iMonths", null);
        setField(term7720, term7720.getClass(), "iYears", null);
        setField(term7720, term7720.getClass(), "iCenturies", null);
        setField(term7720, term7720.getClass(), "iEras", null);
        setField(term7720, term7720.getClass(), "iMillisOfSecond", null);
        setField(term7720, term7720.getClass(), "iMillisOfDay", null);
        setField(term7720, term7720.getClass(), "iSecondOfMinute", null);
        setField(term7720, term7720.getClass(), "iSecondOfDay", null);
        setField(term7720, term7720.getClass(), "iMinuteOfHour", null);
        setField(term7720, term7720.getClass(), "iMinuteOfDay", null);
        setField(term7720, term7720.getClass(), "iHourOfDay", null);
        setField(term7720, term7720.getClass(), "iClockhourOfDay", null);
        setField(term7720, term7720.getClass(), "iHourOfHalfday", null);
        setField(term7720, term7720.getClass(), "iClockhourOfHalfday", null);
        setField(term7720, term7720.getClass(), "iHalfdayOfDay", null);
        setField(term7720, term7720.getClass(), "iDayOfWeek", null);
        setField(term7720, term7720.getClass(), "iDayOfMonth", null);
        setField(term7720, term7720.getClass(), "iDayOfYear", null);
        setField(term7720, term7720.getClass(), "iWeekOfWeekyear", null);
        setField(term7720, term7720.getClass(), "iWeekyear", null);
        setField(term7720, term7720.getClass(), "iWeekyearOfCentury", null);
        setField(term7720, term7720.getClass(), "iMonthOfYear", null);
        setField(term7720, term7720.getClass(), "iYear", null);
        setField(term7720, term7720.getClass(), "iYearOfEra", null);
        setField(term7720, term7720.getClass(), "iYearOfCentury", null);
        setField(term7720, term7720.getClass(), "iCenturyOfEra", null);
        setField(term7720, term7720.getClass(), "iEra", null);
        setIntField(term7720, term7720.getClass(), "iBaseFlags", 0);
        setField(term7719, term7719.getClass(), "iChronology", term7720);
        setIntField(term7719, term7719.getClass(), "iMax", 0);
        setIntField(term7719, term7719.getClass(), "iLeapMonth", 0);
        setLongField(term7719, term7719.getClass(), "iUnitMillis", 0L);
        setField(term7719, term7719.getClass(), "iDurationField", null);
        setField(term7719, term7719.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeapDurationField", argTypes, term6206, args);
        assertTrue(recursiveEquals(term6206, term7719));
        assertTrue(recursiveEquals(retValue, null));
    }

};


