package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;

public class DateTimeFormatter_withChronology_444327897108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15971;
     Object term16053;
     Object term16388;
     Object term16389;
     Object term16382;

    public DateTimeFormatter_withChronology_444327897108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15971 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term15971, term15971.getClass(), "iChrono", null);
        term16053 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        term16388 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term16388, term16388.getClass(), "iPrinter", null);
        setField(term16388, term16388.getClass(), "iParser", null);
        setField(term16388, term16388.getClass(), "iLocale", null);
        setBooleanField(term16388, term16388.getClass(), "iOffsetParsed", false);
        setField(term16388, term16388.getClass(), "iChrono", null);
        setField(term16388, term16388.getClass(), "iZone", null);
        setField(term16388, term16388.getClass(), "iPivotYear", null);
        setIntField(term16388, term16388.getClass(), "iDefaultYear", 0);
        term16389 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        setField(term16389, term16389.getClass(), "iWithUTC", null);
        setField(term16389, term16389.getClass(), "iBase", null);
        setField(term16389, term16389.getClass(), "iParam", null);
        setField(term16389, term16389.getClass(), "iMillis", null);
        setField(term16389, term16389.getClass(), "iSeconds", null);
        setField(term16389, term16389.getClass(), "iMinutes", null);
        setField(term16389, term16389.getClass(), "iHours", null);
        setField(term16389, term16389.getClass(), "iHalfdays", null);
        setField(term16389, term16389.getClass(), "iDays", null);
        setField(term16389, term16389.getClass(), "iWeeks", null);
        setField(term16389, term16389.getClass(), "iWeekyears", null);
        setField(term16389, term16389.getClass(), "iMonths", null);
        setField(term16389, term16389.getClass(), "iYears", null);
        setField(term16389, term16389.getClass(), "iCenturies", null);
        setField(term16389, term16389.getClass(), "iEras", null);
        setField(term16389, term16389.getClass(), "iMillisOfSecond", null);
        setField(term16389, term16389.getClass(), "iMillisOfDay", null);
        setField(term16389, term16389.getClass(), "iSecondOfMinute", null);
        setField(term16389, term16389.getClass(), "iSecondOfDay", null);
        setField(term16389, term16389.getClass(), "iMinuteOfHour", null);
        setField(term16389, term16389.getClass(), "iMinuteOfDay", null);
        setField(term16389, term16389.getClass(), "iHourOfDay", null);
        setField(term16389, term16389.getClass(), "iClockhourOfDay", null);
        setField(term16389, term16389.getClass(), "iHourOfHalfday", null);
        setField(term16389, term16389.getClass(), "iClockhourOfHalfday", null);
        setField(term16389, term16389.getClass(), "iHalfdayOfDay", null);
        setField(term16389, term16389.getClass(), "iDayOfWeek", null);
        setField(term16389, term16389.getClass(), "iDayOfMonth", null);
        setField(term16389, term16389.getClass(), "iDayOfYear", null);
        setField(term16389, term16389.getClass(), "iWeekOfWeekyear", null);
        setField(term16389, term16389.getClass(), "iWeekyear", null);
        setField(term16389, term16389.getClass(), "iWeekyearOfCentury", null);
        setField(term16389, term16389.getClass(), "iMonthOfYear", null);
        setField(term16389, term16389.getClass(), "iYear", null);
        setField(term16389, term16389.getClass(), "iYearOfEra", null);
        setField(term16389, term16389.getClass(), "iYearOfCentury", null);
        setField(term16389, term16389.getClass(), "iCenturyOfEra", null);
        setField(term16389, term16389.getClass(), "iEra", null);
        setIntField(term16389, term16389.getClass(), "iBaseFlags", 0);
        term16382 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term16379 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        setField(term16382, term16382.getClass(), "iPrinter", null);
        setField(term16382, term16382.getClass(), "iParser", null);
        setField(term16382, term16382.getClass(), "iLocale", null);
        setBooleanField(term16382, term16382.getClass(), "iOffsetParsed", false);
        setField(term16379, term16379.getClass(), "iWithUTC", null);
        setField(term16379, term16379.getClass(), "iBase", null);
        setField(term16379, term16379.getClass(), "iParam", null);
        setField(term16379, term16379.getClass(), "iMillis", null);
        setField(term16379, term16379.getClass(), "iSeconds", null);
        setField(term16379, term16379.getClass(), "iMinutes", null);
        setField(term16379, term16379.getClass(), "iHours", null);
        setField(term16379, term16379.getClass(), "iHalfdays", null);
        setField(term16379, term16379.getClass(), "iDays", null);
        setField(term16379, term16379.getClass(), "iWeeks", null);
        setField(term16379, term16379.getClass(), "iWeekyears", null);
        setField(term16379, term16379.getClass(), "iMonths", null);
        setField(term16379, term16379.getClass(), "iYears", null);
        setField(term16379, term16379.getClass(), "iCenturies", null);
        setField(term16379, term16379.getClass(), "iEras", null);
        setField(term16379, term16379.getClass(), "iMillisOfSecond", null);
        setField(term16379, term16379.getClass(), "iMillisOfDay", null);
        setField(term16379, term16379.getClass(), "iSecondOfMinute", null);
        setField(term16379, term16379.getClass(), "iSecondOfDay", null);
        setField(term16379, term16379.getClass(), "iMinuteOfHour", null);
        setField(term16379, term16379.getClass(), "iMinuteOfDay", null);
        setField(term16379, term16379.getClass(), "iHourOfDay", null);
        setField(term16379, term16379.getClass(), "iClockhourOfDay", null);
        setField(term16379, term16379.getClass(), "iHourOfHalfday", null);
        setField(term16379, term16379.getClass(), "iClockhourOfHalfday", null);
        setField(term16379, term16379.getClass(), "iHalfdayOfDay", null);
        setField(term16379, term16379.getClass(), "iDayOfWeek", null);
        setField(term16379, term16379.getClass(), "iDayOfMonth", null);
        setField(term16379, term16379.getClass(), "iDayOfYear", null);
        setField(term16379, term16379.getClass(), "iWeekOfWeekyear", null);
        setField(term16379, term16379.getClass(), "iWeekyear", null);
        setField(term16379, term16379.getClass(), "iWeekyearOfCentury", null);
        setField(term16379, term16379.getClass(), "iMonthOfYear", null);
        setField(term16379, term16379.getClass(), "iYear", null);
        setField(term16379, term16379.getClass(), "iYearOfEra", null);
        setField(term16379, term16379.getClass(), "iYearOfCentury", null);
        setField(term16379, term16379.getClass(), "iCenturyOfEra", null);
        setField(term16379, term16379.getClass(), "iEra", null);
        setIntField(term16379, term16379.getClass(), "iBaseFlags", 0);
        setField(term16382, term16382.getClass(), "iChrono", term16379);
        setField(term16382, term16382.getClass(), "iZone", null);
        setField(term16382, term16382.getClass(), "iPivotYear", null);
        setIntField(term16382, term16382.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = term16053;
        Object retValue = callMethod(klass, "withChronology", argTypes, term15971, args);
        assertTrue(recursiveEquals(term15971, term16388));
        assertTrue(recursiveEquals(term16053, term16389));
        assertTrue(recursiveEquals(retValue, term16382));
    }

};


