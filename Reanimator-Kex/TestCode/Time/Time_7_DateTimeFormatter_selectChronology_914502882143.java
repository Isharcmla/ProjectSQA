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

public class DateTimeFormatter_selectChronology_914502882143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31371;
     Object term31457;
     Object term31585;
     Object term31586;
     Object term31577;

    public DateTimeFormatter_selectChronology_914502882143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31371 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        term31457 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        term31585 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term31585, term31585.getClass(), "iPrinter", null);
        setField(term31585, term31585.getClass(), "iParser", null);
        setField(term31585, term31585.getClass(), "iLocale", null);
        setBooleanField(term31585, term31585.getClass(), "iOffsetParsed", false);
        setField(term31585, term31585.getClass(), "iChrono", null);
        setField(term31585, term31585.getClass(), "iZone", null);
        setField(term31585, term31585.getClass(), "iPivotYear", null);
        setIntField(term31585, term31585.getClass(), "iDefaultYear", 0);
        term31586 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term31586, term31586.getClass(), "iYearInfoCache", null);
        setIntField(term31586, term31586.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term31586, term31586.getClass(), "iBase", null);
        setField(term31586, term31586.getClass(), "iParam", null);
        setField(term31586, term31586.getClass(), "iMillis", null);
        setField(term31586, term31586.getClass(), "iSeconds", null);
        setField(term31586, term31586.getClass(), "iMinutes", null);
        setField(term31586, term31586.getClass(), "iHours", null);
        setField(term31586, term31586.getClass(), "iHalfdays", null);
        setField(term31586, term31586.getClass(), "iDays", null);
        setField(term31586, term31586.getClass(), "iWeeks", null);
        setField(term31586, term31586.getClass(), "iWeekyears", null);
        setField(term31586, term31586.getClass(), "iMonths", null);
        setField(term31586, term31586.getClass(), "iYears", null);
        setField(term31586, term31586.getClass(), "iCenturies", null);
        setField(term31586, term31586.getClass(), "iEras", null);
        setField(term31586, term31586.getClass(), "iMillisOfSecond", null);
        setField(term31586, term31586.getClass(), "iMillisOfDay", null);
        setField(term31586, term31586.getClass(), "iSecondOfMinute", null);
        setField(term31586, term31586.getClass(), "iSecondOfDay", null);
        setField(term31586, term31586.getClass(), "iMinuteOfHour", null);
        setField(term31586, term31586.getClass(), "iMinuteOfDay", null);
        setField(term31586, term31586.getClass(), "iHourOfDay", null);
        setField(term31586, term31586.getClass(), "iClockhourOfDay", null);
        setField(term31586, term31586.getClass(), "iHourOfHalfday", null);
        setField(term31586, term31586.getClass(), "iClockhourOfHalfday", null);
        setField(term31586, term31586.getClass(), "iHalfdayOfDay", null);
        setField(term31586, term31586.getClass(), "iDayOfWeek", null);
        setField(term31586, term31586.getClass(), "iDayOfMonth", null);
        setField(term31586, term31586.getClass(), "iDayOfYear", null);
        setField(term31586, term31586.getClass(), "iWeekOfWeekyear", null);
        setField(term31586, term31586.getClass(), "iWeekyear", null);
        setField(term31586, term31586.getClass(), "iWeekyearOfCentury", null);
        setField(term31586, term31586.getClass(), "iMonthOfYear", null);
        setField(term31586, term31586.getClass(), "iYear", null);
        setField(term31586, term31586.getClass(), "iYearOfEra", null);
        setField(term31586, term31586.getClass(), "iYearOfCentury", null);
        setField(term31586, term31586.getClass(), "iCenturyOfEra", null);
        setField(term31586, term31586.getClass(), "iEra", null);
        setIntField(term31586, term31586.getClass(), "iBaseFlags", 0);
        term31577 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term31577, term31577.getClass(), "iYearInfoCache", null);
        setIntField(term31577, term31577.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term31577, term31577.getClass(), "iBase", null);
        setField(term31577, term31577.getClass(), "iParam", null);
        setField(term31577, term31577.getClass(), "iMillis", null);
        setField(term31577, term31577.getClass(), "iSeconds", null);
        setField(term31577, term31577.getClass(), "iMinutes", null);
        setField(term31577, term31577.getClass(), "iHours", null);
        setField(term31577, term31577.getClass(), "iHalfdays", null);
        setField(term31577, term31577.getClass(), "iDays", null);
        setField(term31577, term31577.getClass(), "iWeeks", null);
        setField(term31577, term31577.getClass(), "iWeekyears", null);
        setField(term31577, term31577.getClass(), "iMonths", null);
        setField(term31577, term31577.getClass(), "iYears", null);
        setField(term31577, term31577.getClass(), "iCenturies", null);
        setField(term31577, term31577.getClass(), "iEras", null);
        setField(term31577, term31577.getClass(), "iMillisOfSecond", null);
        setField(term31577, term31577.getClass(), "iMillisOfDay", null);
        setField(term31577, term31577.getClass(), "iSecondOfMinute", null);
        setField(term31577, term31577.getClass(), "iSecondOfDay", null);
        setField(term31577, term31577.getClass(), "iMinuteOfHour", null);
        setField(term31577, term31577.getClass(), "iMinuteOfDay", null);
        setField(term31577, term31577.getClass(), "iHourOfDay", null);
        setField(term31577, term31577.getClass(), "iClockhourOfDay", null);
        setField(term31577, term31577.getClass(), "iHourOfHalfday", null);
        setField(term31577, term31577.getClass(), "iClockhourOfHalfday", null);
        setField(term31577, term31577.getClass(), "iHalfdayOfDay", null);
        setField(term31577, term31577.getClass(), "iDayOfWeek", null);
        setField(term31577, term31577.getClass(), "iDayOfMonth", null);
        setField(term31577, term31577.getClass(), "iDayOfYear", null);
        setField(term31577, term31577.getClass(), "iWeekOfWeekyear", null);
        setField(term31577, term31577.getClass(), "iWeekyear", null);
        setField(term31577, term31577.getClass(), "iWeekyearOfCentury", null);
        setField(term31577, term31577.getClass(), "iMonthOfYear", null);
        setField(term31577, term31577.getClass(), "iYear", null);
        setField(term31577, term31577.getClass(), "iYearOfEra", null);
        setField(term31577, term31577.getClass(), "iYearOfCentury", null);
        setField(term31577, term31577.getClass(), "iCenturyOfEra", null);
        setField(term31577, term31577.getClass(), "iEra", null);
        setIntField(term31577, term31577.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = term31457;
        Object retValue = callMethod(klass, "selectChronology", argTypes, term31371, args);
        assertTrue(recursiveEquals(term31371, term31585));
        assertTrue(recursiveEquals(term31457, term31586));
        assertTrue(recursiveEquals(retValue, term31577));
    }

};


