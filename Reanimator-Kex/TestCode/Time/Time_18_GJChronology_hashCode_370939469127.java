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

public class GJChronology_hashCode_370939469127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40811;
     Object term62842;

    public GJChronology_hashCode_370939469127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40811 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term40851 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object term40894 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term40942 = newInstance(Class.forName("org.joda.time.Instant"));
        setField(term40851, term40851.getClass(), "iBase", null);
        setIntField(term40851, term40851.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term40811, term40811.getClass(), "iJulianChronology", term40851);
        setField(term40894, term40894.getClass(), "iBase", null);
        setIntField(term40894, term40894.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term40811, term40811.getClass(), "iGregorianChronology", term40894);
        setLongField(term40942, term40942.getClass(), "iMillis", 0L);
        setField(term40811, term40811.getClass(), "iCutoverInstant", term40942);
        term62842 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term62843 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object term62844 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term62845 = newInstance(Class.forName("org.joda.time.Instant"));
        setField(term62843, term62843.getClass(), "iYearInfoCache", null);
        setIntField(term62843, term62843.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term62843, term62843.getClass(), "iBase", null);
        setField(term62843, term62843.getClass(), "iParam", null);
        setField(term62843, term62843.getClass(), "iMillis", null);
        setField(term62843, term62843.getClass(), "iSeconds", null);
        setField(term62843, term62843.getClass(), "iMinutes", null);
        setField(term62843, term62843.getClass(), "iHours", null);
        setField(term62843, term62843.getClass(), "iHalfdays", null);
        setField(term62843, term62843.getClass(), "iDays", null);
        setField(term62843, term62843.getClass(), "iWeeks", null);
        setField(term62843, term62843.getClass(), "iWeekyears", null);
        setField(term62843, term62843.getClass(), "iMonths", null);
        setField(term62843, term62843.getClass(), "iYears", null);
        setField(term62843, term62843.getClass(), "iCenturies", null);
        setField(term62843, term62843.getClass(), "iEras", null);
        setField(term62843, term62843.getClass(), "iMillisOfSecond", null);
        setField(term62843, term62843.getClass(), "iMillisOfDay", null);
        setField(term62843, term62843.getClass(), "iSecondOfMinute", null);
        setField(term62843, term62843.getClass(), "iSecondOfDay", null);
        setField(term62843, term62843.getClass(), "iMinuteOfHour", null);
        setField(term62843, term62843.getClass(), "iMinuteOfDay", null);
        setField(term62843, term62843.getClass(), "iHourOfDay", null);
        setField(term62843, term62843.getClass(), "iClockhourOfDay", null);
        setField(term62843, term62843.getClass(), "iHourOfHalfday", null);
        setField(term62843, term62843.getClass(), "iClockhourOfHalfday", null);
        setField(term62843, term62843.getClass(), "iHalfdayOfDay", null);
        setField(term62843, term62843.getClass(), "iDayOfWeek", null);
        setField(term62843, term62843.getClass(), "iDayOfMonth", null);
        setField(term62843, term62843.getClass(), "iDayOfYear", null);
        setField(term62843, term62843.getClass(), "iWeekOfWeekyear", null);
        setField(term62843, term62843.getClass(), "iWeekyear", null);
        setField(term62843, term62843.getClass(), "iWeekyearOfCentury", null);
        setField(term62843, term62843.getClass(), "iMonthOfYear", null);
        setField(term62843, term62843.getClass(), "iYear", null);
        setField(term62843, term62843.getClass(), "iYearOfEra", null);
        setField(term62843, term62843.getClass(), "iYearOfCentury", null);
        setField(term62843, term62843.getClass(), "iCenturyOfEra", null);
        setField(term62843, term62843.getClass(), "iEra", null);
        setIntField(term62843, term62843.getClass(), "iBaseFlags", 0);
        setField(term62842, term62842.getClass(), "iJulianChronology", term62843);
        setField(term62844, term62844.getClass(), "iYearInfoCache", null);
        setIntField(term62844, term62844.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term62844, term62844.getClass(), "iBase", null);
        setField(term62844, term62844.getClass(), "iParam", null);
        setField(term62844, term62844.getClass(), "iMillis", null);
        setField(term62844, term62844.getClass(), "iSeconds", null);
        setField(term62844, term62844.getClass(), "iMinutes", null);
        setField(term62844, term62844.getClass(), "iHours", null);
        setField(term62844, term62844.getClass(), "iHalfdays", null);
        setField(term62844, term62844.getClass(), "iDays", null);
        setField(term62844, term62844.getClass(), "iWeeks", null);
        setField(term62844, term62844.getClass(), "iWeekyears", null);
        setField(term62844, term62844.getClass(), "iMonths", null);
        setField(term62844, term62844.getClass(), "iYears", null);
        setField(term62844, term62844.getClass(), "iCenturies", null);
        setField(term62844, term62844.getClass(), "iEras", null);
        setField(term62844, term62844.getClass(), "iMillisOfSecond", null);
        setField(term62844, term62844.getClass(), "iMillisOfDay", null);
        setField(term62844, term62844.getClass(), "iSecondOfMinute", null);
        setField(term62844, term62844.getClass(), "iSecondOfDay", null);
        setField(term62844, term62844.getClass(), "iMinuteOfHour", null);
        setField(term62844, term62844.getClass(), "iMinuteOfDay", null);
        setField(term62844, term62844.getClass(), "iHourOfDay", null);
        setField(term62844, term62844.getClass(), "iClockhourOfDay", null);
        setField(term62844, term62844.getClass(), "iHourOfHalfday", null);
        setField(term62844, term62844.getClass(), "iClockhourOfHalfday", null);
        setField(term62844, term62844.getClass(), "iHalfdayOfDay", null);
        setField(term62844, term62844.getClass(), "iDayOfWeek", null);
        setField(term62844, term62844.getClass(), "iDayOfMonth", null);
        setField(term62844, term62844.getClass(), "iDayOfYear", null);
        setField(term62844, term62844.getClass(), "iWeekOfWeekyear", null);
        setField(term62844, term62844.getClass(), "iWeekyear", null);
        setField(term62844, term62844.getClass(), "iWeekyearOfCentury", null);
        setField(term62844, term62844.getClass(), "iMonthOfYear", null);
        setField(term62844, term62844.getClass(), "iYear", null);
        setField(term62844, term62844.getClass(), "iYearOfEra", null);
        setField(term62844, term62844.getClass(), "iYearOfCentury", null);
        setField(term62844, term62844.getClass(), "iCenturyOfEra", null);
        setField(term62844, term62844.getClass(), "iEra", null);
        setIntField(term62844, term62844.getClass(), "iBaseFlags", 0);
        setField(term62842, term62842.getClass(), "iGregorianChronology", term62844);
        setLongField(term62845, term62845.getClass(), "iMillis", 0L);
        setField(term62842, term62842.getClass(), "iCutoverInstant", term62845);
        setLongField(term62842, term62842.getClass(), "iCutoverMillis", 0L);
        setLongField(term62842, term62842.getClass(), "iGapDuration", 0L);
        setField(term62842, term62842.getClass(), "iBase", null);
        setField(term62842, term62842.getClass(), "iParam", null);
        setField(term62842, term62842.getClass(), "iMillis", null);
        setField(term62842, term62842.getClass(), "iSeconds", null);
        setField(term62842, term62842.getClass(), "iMinutes", null);
        setField(term62842, term62842.getClass(), "iHours", null);
        setField(term62842, term62842.getClass(), "iHalfdays", null);
        setField(term62842, term62842.getClass(), "iDays", null);
        setField(term62842, term62842.getClass(), "iWeeks", null);
        setField(term62842, term62842.getClass(), "iWeekyears", null);
        setField(term62842, term62842.getClass(), "iMonths", null);
        setField(term62842, term62842.getClass(), "iYears", null);
        setField(term62842, term62842.getClass(), "iCenturies", null);
        setField(term62842, term62842.getClass(), "iEras", null);
        setField(term62842, term62842.getClass(), "iMillisOfSecond", null);
        setField(term62842, term62842.getClass(), "iMillisOfDay", null);
        setField(term62842, term62842.getClass(), "iSecondOfMinute", null);
        setField(term62842, term62842.getClass(), "iSecondOfDay", null);
        setField(term62842, term62842.getClass(), "iMinuteOfHour", null);
        setField(term62842, term62842.getClass(), "iMinuteOfDay", null);
        setField(term62842, term62842.getClass(), "iHourOfDay", null);
        setField(term62842, term62842.getClass(), "iClockhourOfDay", null);
        setField(term62842, term62842.getClass(), "iHourOfHalfday", null);
        setField(term62842, term62842.getClass(), "iClockhourOfHalfday", null);
        setField(term62842, term62842.getClass(), "iHalfdayOfDay", null);
        setField(term62842, term62842.getClass(), "iDayOfWeek", null);
        setField(term62842, term62842.getClass(), "iDayOfMonth", null);
        setField(term62842, term62842.getClass(), "iDayOfYear", null);
        setField(term62842, term62842.getClass(), "iWeekOfWeekyear", null);
        setField(term62842, term62842.getClass(), "iWeekyear", null);
        setField(term62842, term62842.getClass(), "iWeekyearOfCentury", null);
        setField(term62842, term62842.getClass(), "iMonthOfYear", null);
        setField(term62842, term62842.getClass(), "iYear", null);
        setField(term62842, term62842.getClass(), "iYearOfEra", null);
        setField(term62842, term62842.getClass(), "iYearOfCentury", null);
        setField(term62842, term62842.getClass(), "iCenturyOfEra", null);
        setField(term62842, term62842.getClass(), "iEra", null);
        setIntField(term62842, term62842.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term40811, args);
        assertTrue(recursiveEquals(term40811, term62842));
        assertTrue(recursiveEquals(retValue, 192662109));
    }

};


