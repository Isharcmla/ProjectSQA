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

public class DateTimeFormatter_selectChronology_914502882167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42255;
     Object term42363;
     Object term42378;
     Object term42380;
     Object term42369;

    public DateTimeFormatter_selectChronology_914502882167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42255 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        term42363 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term42255, term42255.getClass(), "iChrono", term42363);
        term42378 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term42379 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term42378, term42378.getClass(), "iPrinter", null);
        setField(term42378, term42378.getClass(), "iParser", null);
        setField(term42378, term42378.getClass(), "iLocale", null);
        setBooleanField(term42378, term42378.getClass(), "iOffsetParsed", false);
        setField(term42379, term42379.getClass(), "iJulianChronology", null);
        setField(term42379, term42379.getClass(), "iGregorianChronology", null);
        setField(term42379, term42379.getClass(), "iCutoverInstant", null);
        setLongField(term42379, term42379.getClass(), "iCutoverMillis", 0L);
        setLongField(term42379, term42379.getClass(), "iGapDuration", 0L);
        setField(term42379, term42379.getClass(), "iBase", null);
        setField(term42379, term42379.getClass(), "iParam", null);
        setField(term42379, term42379.getClass(), "iMillis", null);
        setField(term42379, term42379.getClass(), "iSeconds", null);
        setField(term42379, term42379.getClass(), "iMinutes", null);
        setField(term42379, term42379.getClass(), "iHours", null);
        setField(term42379, term42379.getClass(), "iHalfdays", null);
        setField(term42379, term42379.getClass(), "iDays", null);
        setField(term42379, term42379.getClass(), "iWeeks", null);
        setField(term42379, term42379.getClass(), "iWeekyears", null);
        setField(term42379, term42379.getClass(), "iMonths", null);
        setField(term42379, term42379.getClass(), "iYears", null);
        setField(term42379, term42379.getClass(), "iCenturies", null);
        setField(term42379, term42379.getClass(), "iEras", null);
        setField(term42379, term42379.getClass(), "iMillisOfSecond", null);
        setField(term42379, term42379.getClass(), "iMillisOfDay", null);
        setField(term42379, term42379.getClass(), "iSecondOfMinute", null);
        setField(term42379, term42379.getClass(), "iSecondOfDay", null);
        setField(term42379, term42379.getClass(), "iMinuteOfHour", null);
        setField(term42379, term42379.getClass(), "iMinuteOfDay", null);
        setField(term42379, term42379.getClass(), "iHourOfDay", null);
        setField(term42379, term42379.getClass(), "iClockhourOfDay", null);
        setField(term42379, term42379.getClass(), "iHourOfHalfday", null);
        setField(term42379, term42379.getClass(), "iClockhourOfHalfday", null);
        setField(term42379, term42379.getClass(), "iHalfdayOfDay", null);
        setField(term42379, term42379.getClass(), "iDayOfWeek", null);
        setField(term42379, term42379.getClass(), "iDayOfMonth", null);
        setField(term42379, term42379.getClass(), "iDayOfYear", null);
        setField(term42379, term42379.getClass(), "iWeekOfWeekyear", null);
        setField(term42379, term42379.getClass(), "iWeekyear", null);
        setField(term42379, term42379.getClass(), "iWeekyearOfCentury", null);
        setField(term42379, term42379.getClass(), "iMonthOfYear", null);
        setField(term42379, term42379.getClass(), "iYear", null);
        setField(term42379, term42379.getClass(), "iYearOfEra", null);
        setField(term42379, term42379.getClass(), "iYearOfCentury", null);
        setField(term42379, term42379.getClass(), "iCenturyOfEra", null);
        setField(term42379, term42379.getClass(), "iEra", null);
        setIntField(term42379, term42379.getClass(), "iBaseFlags", 0);
        setField(term42378, term42378.getClass(), "iChrono", term42379);
        setField(term42378, term42378.getClass(), "iZone", null);
        setField(term42378, term42378.getClass(), "iPivotYear", null);
        setIntField(term42378, term42378.getClass(), "iDefaultYear", 0);
        term42380 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term42380, term42380.getClass(), "iJulianChronology", null);
        setField(term42380, term42380.getClass(), "iGregorianChronology", null);
        setField(term42380, term42380.getClass(), "iCutoverInstant", null);
        setLongField(term42380, term42380.getClass(), "iCutoverMillis", 0L);
        setLongField(term42380, term42380.getClass(), "iGapDuration", 0L);
        setField(term42380, term42380.getClass(), "iBase", null);
        setField(term42380, term42380.getClass(), "iParam", null);
        setField(term42380, term42380.getClass(), "iMillis", null);
        setField(term42380, term42380.getClass(), "iSeconds", null);
        setField(term42380, term42380.getClass(), "iMinutes", null);
        setField(term42380, term42380.getClass(), "iHours", null);
        setField(term42380, term42380.getClass(), "iHalfdays", null);
        setField(term42380, term42380.getClass(), "iDays", null);
        setField(term42380, term42380.getClass(), "iWeeks", null);
        setField(term42380, term42380.getClass(), "iWeekyears", null);
        setField(term42380, term42380.getClass(), "iMonths", null);
        setField(term42380, term42380.getClass(), "iYears", null);
        setField(term42380, term42380.getClass(), "iCenturies", null);
        setField(term42380, term42380.getClass(), "iEras", null);
        setField(term42380, term42380.getClass(), "iMillisOfSecond", null);
        setField(term42380, term42380.getClass(), "iMillisOfDay", null);
        setField(term42380, term42380.getClass(), "iSecondOfMinute", null);
        setField(term42380, term42380.getClass(), "iSecondOfDay", null);
        setField(term42380, term42380.getClass(), "iMinuteOfHour", null);
        setField(term42380, term42380.getClass(), "iMinuteOfDay", null);
        setField(term42380, term42380.getClass(), "iHourOfDay", null);
        setField(term42380, term42380.getClass(), "iClockhourOfDay", null);
        setField(term42380, term42380.getClass(), "iHourOfHalfday", null);
        setField(term42380, term42380.getClass(), "iClockhourOfHalfday", null);
        setField(term42380, term42380.getClass(), "iHalfdayOfDay", null);
        setField(term42380, term42380.getClass(), "iDayOfWeek", null);
        setField(term42380, term42380.getClass(), "iDayOfMonth", null);
        setField(term42380, term42380.getClass(), "iDayOfYear", null);
        setField(term42380, term42380.getClass(), "iWeekOfWeekyear", null);
        setField(term42380, term42380.getClass(), "iWeekyear", null);
        setField(term42380, term42380.getClass(), "iWeekyearOfCentury", null);
        setField(term42380, term42380.getClass(), "iMonthOfYear", null);
        setField(term42380, term42380.getClass(), "iYear", null);
        setField(term42380, term42380.getClass(), "iYearOfEra", null);
        setField(term42380, term42380.getClass(), "iYearOfCentury", null);
        setField(term42380, term42380.getClass(), "iCenturyOfEra", null);
        setField(term42380, term42380.getClass(), "iEra", null);
        setIntField(term42380, term42380.getClass(), "iBaseFlags", 0);
        term42369 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term42369, term42369.getClass(), "iJulianChronology", null);
        setField(term42369, term42369.getClass(), "iGregorianChronology", null);
        setField(term42369, term42369.getClass(), "iCutoverInstant", null);
        setLongField(term42369, term42369.getClass(), "iCutoverMillis", 0L);
        setLongField(term42369, term42369.getClass(), "iGapDuration", 0L);
        setField(term42369, term42369.getClass(), "iBase", null);
        setField(term42369, term42369.getClass(), "iParam", null);
        setField(term42369, term42369.getClass(), "iMillis", null);
        setField(term42369, term42369.getClass(), "iSeconds", null);
        setField(term42369, term42369.getClass(), "iMinutes", null);
        setField(term42369, term42369.getClass(), "iHours", null);
        setField(term42369, term42369.getClass(), "iHalfdays", null);
        setField(term42369, term42369.getClass(), "iDays", null);
        setField(term42369, term42369.getClass(), "iWeeks", null);
        setField(term42369, term42369.getClass(), "iWeekyears", null);
        setField(term42369, term42369.getClass(), "iMonths", null);
        setField(term42369, term42369.getClass(), "iYears", null);
        setField(term42369, term42369.getClass(), "iCenturies", null);
        setField(term42369, term42369.getClass(), "iEras", null);
        setField(term42369, term42369.getClass(), "iMillisOfSecond", null);
        setField(term42369, term42369.getClass(), "iMillisOfDay", null);
        setField(term42369, term42369.getClass(), "iSecondOfMinute", null);
        setField(term42369, term42369.getClass(), "iSecondOfDay", null);
        setField(term42369, term42369.getClass(), "iMinuteOfHour", null);
        setField(term42369, term42369.getClass(), "iMinuteOfDay", null);
        setField(term42369, term42369.getClass(), "iHourOfDay", null);
        setField(term42369, term42369.getClass(), "iClockhourOfDay", null);
        setField(term42369, term42369.getClass(), "iHourOfHalfday", null);
        setField(term42369, term42369.getClass(), "iClockhourOfHalfday", null);
        setField(term42369, term42369.getClass(), "iHalfdayOfDay", null);
        setField(term42369, term42369.getClass(), "iDayOfWeek", null);
        setField(term42369, term42369.getClass(), "iDayOfMonth", null);
        setField(term42369, term42369.getClass(), "iDayOfYear", null);
        setField(term42369, term42369.getClass(), "iWeekOfWeekyear", null);
        setField(term42369, term42369.getClass(), "iWeekyear", null);
        setField(term42369, term42369.getClass(), "iWeekyearOfCentury", null);
        setField(term42369, term42369.getClass(), "iMonthOfYear", null);
        setField(term42369, term42369.getClass(), "iYear", null);
        setField(term42369, term42369.getClass(), "iYearOfEra", null);
        setField(term42369, term42369.getClass(), "iYearOfCentury", null);
        setField(term42369, term42369.getClass(), "iCenturyOfEra", null);
        setField(term42369, term42369.getClass(), "iEra", null);
        setIntField(term42369, term42369.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = term42363;
        Object retValue = callMethod(klass, "selectChronology", argTypes, term42255, args);
        assertTrue(recursiveEquals(term42255, term42378));
        assertTrue(recursiveEquals(term42363, term42380));
        assertTrue(recursiveEquals(retValue, term42369));
    }

};


