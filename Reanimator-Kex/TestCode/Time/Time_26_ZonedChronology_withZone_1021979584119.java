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

public class ZonedChronology_withZone_1021979584119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41250;
     Object term41391;
     Object term41406;
     Object term41408;
     Object term41401;

    public ZonedChronology_withZone_1021979584119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41250 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term41391 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term41250, term41250.getClass(), "iParam", term41391);
        term41406 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term41407 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term41406, term41406.getClass(), "iBase", null);
        setIntField(term41407, term41407.getClass(), "iStandardOffset", 0);
        setField(term41407, term41407.getClass(), "iStartRecurrence", null);
        setField(term41407, term41407.getClass(), "iEndRecurrence", null);
        setField(term41407, term41407.getClass(), "iID", null);
        setField(term41406, term41406.getClass(), "iParam", term41407);
        setField(term41406, term41406.getClass(), "iMillis", null);
        setField(term41406, term41406.getClass(), "iSeconds", null);
        setField(term41406, term41406.getClass(), "iMinutes", null);
        setField(term41406, term41406.getClass(), "iHours", null);
        setField(term41406, term41406.getClass(), "iHalfdays", null);
        setField(term41406, term41406.getClass(), "iDays", null);
        setField(term41406, term41406.getClass(), "iWeeks", null);
        setField(term41406, term41406.getClass(), "iWeekyears", null);
        setField(term41406, term41406.getClass(), "iMonths", null);
        setField(term41406, term41406.getClass(), "iYears", null);
        setField(term41406, term41406.getClass(), "iCenturies", null);
        setField(term41406, term41406.getClass(), "iEras", null);
        setField(term41406, term41406.getClass(), "iMillisOfSecond", null);
        setField(term41406, term41406.getClass(), "iMillisOfDay", null);
        setField(term41406, term41406.getClass(), "iSecondOfMinute", null);
        setField(term41406, term41406.getClass(), "iSecondOfDay", null);
        setField(term41406, term41406.getClass(), "iMinuteOfHour", null);
        setField(term41406, term41406.getClass(), "iMinuteOfDay", null);
        setField(term41406, term41406.getClass(), "iHourOfDay", null);
        setField(term41406, term41406.getClass(), "iClockhourOfDay", null);
        setField(term41406, term41406.getClass(), "iHourOfHalfday", null);
        setField(term41406, term41406.getClass(), "iClockhourOfHalfday", null);
        setField(term41406, term41406.getClass(), "iHalfdayOfDay", null);
        setField(term41406, term41406.getClass(), "iDayOfWeek", null);
        setField(term41406, term41406.getClass(), "iDayOfMonth", null);
        setField(term41406, term41406.getClass(), "iDayOfYear", null);
        setField(term41406, term41406.getClass(), "iWeekOfWeekyear", null);
        setField(term41406, term41406.getClass(), "iWeekyear", null);
        setField(term41406, term41406.getClass(), "iWeekyearOfCentury", null);
        setField(term41406, term41406.getClass(), "iMonthOfYear", null);
        setField(term41406, term41406.getClass(), "iYear", null);
        setField(term41406, term41406.getClass(), "iYearOfEra", null);
        setField(term41406, term41406.getClass(), "iYearOfCentury", null);
        setField(term41406, term41406.getClass(), "iCenturyOfEra", null);
        setField(term41406, term41406.getClass(), "iEra", null);
        setIntField(term41406, term41406.getClass(), "iBaseFlags", 0);
        term41408 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setIntField(term41408, term41408.getClass(), "iStandardOffset", 0);
        setField(term41408, term41408.getClass(), "iStartRecurrence", null);
        setField(term41408, term41408.getClass(), "iEndRecurrence", null);
        setField(term41408, term41408.getClass(), "iID", null);
        term41401 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term41402 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term41401, term41401.getClass(), "iBase", null);
        setIntField(term41402, term41402.getClass(), "iStandardOffset", 0);
        setField(term41402, term41402.getClass(), "iStartRecurrence", null);
        setField(term41402, term41402.getClass(), "iEndRecurrence", null);
        setField(term41402, term41402.getClass(), "iID", null);
        setField(term41401, term41401.getClass(), "iParam", term41402);
        setField(term41401, term41401.getClass(), "iMillis", null);
        setField(term41401, term41401.getClass(), "iSeconds", null);
        setField(term41401, term41401.getClass(), "iMinutes", null);
        setField(term41401, term41401.getClass(), "iHours", null);
        setField(term41401, term41401.getClass(), "iHalfdays", null);
        setField(term41401, term41401.getClass(), "iDays", null);
        setField(term41401, term41401.getClass(), "iWeeks", null);
        setField(term41401, term41401.getClass(), "iWeekyears", null);
        setField(term41401, term41401.getClass(), "iMonths", null);
        setField(term41401, term41401.getClass(), "iYears", null);
        setField(term41401, term41401.getClass(), "iCenturies", null);
        setField(term41401, term41401.getClass(), "iEras", null);
        setField(term41401, term41401.getClass(), "iMillisOfSecond", null);
        setField(term41401, term41401.getClass(), "iMillisOfDay", null);
        setField(term41401, term41401.getClass(), "iSecondOfMinute", null);
        setField(term41401, term41401.getClass(), "iSecondOfDay", null);
        setField(term41401, term41401.getClass(), "iMinuteOfHour", null);
        setField(term41401, term41401.getClass(), "iMinuteOfDay", null);
        setField(term41401, term41401.getClass(), "iHourOfDay", null);
        setField(term41401, term41401.getClass(), "iClockhourOfDay", null);
        setField(term41401, term41401.getClass(), "iHourOfHalfday", null);
        setField(term41401, term41401.getClass(), "iClockhourOfHalfday", null);
        setField(term41401, term41401.getClass(), "iHalfdayOfDay", null);
        setField(term41401, term41401.getClass(), "iDayOfWeek", null);
        setField(term41401, term41401.getClass(), "iDayOfMonth", null);
        setField(term41401, term41401.getClass(), "iDayOfYear", null);
        setField(term41401, term41401.getClass(), "iWeekOfWeekyear", null);
        setField(term41401, term41401.getClass(), "iWeekyear", null);
        setField(term41401, term41401.getClass(), "iWeekyearOfCentury", null);
        setField(term41401, term41401.getClass(), "iMonthOfYear", null);
        setField(term41401, term41401.getClass(), "iYear", null);
        setField(term41401, term41401.getClass(), "iYearOfEra", null);
        setField(term41401, term41401.getClass(), "iYearOfCentury", null);
        setField(term41401, term41401.getClass(), "iCenturyOfEra", null);
        setField(term41401, term41401.getClass(), "iEra", null);
        setIntField(term41401, term41401.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = term41391;
        Object retValue = callMethod(klass, "withZone", argTypes, term41250, args);
        assertTrue(recursiveEquals(term41250, term41406));
        assertTrue(recursiveEquals(term41391, term41408));
        assertTrue(recursiveEquals(retValue, term41401));
    }

};


