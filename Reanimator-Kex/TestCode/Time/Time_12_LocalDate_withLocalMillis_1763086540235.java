package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class LocalDate_withLocalMillis_1763086540235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127113;
     Object term127312;
     Object term127303;

    public LocalDate_withLocalMillis_1763086540235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127113 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term127187 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term127291 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term127291, term127291.getClass(), "iUnitMillis", -9223372036854775808L);
        setField(term127187, term127187.getClass(), "iDayOfMonth", term127291);
        setField(term127113, term127113.getClass(), "iChronology", term127187);
        setLongField(term127113, term127113.getClass(), "iLocalMillis", -9223372036854775808L);
        term127312 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term127313 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term127314 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term127312, term127312.getClass(), "iLocalMillis", -9223372036854775808L);
        setField(term127313, term127313.getClass(), "iBase", null);
        setField(term127313, term127313.getClass(), "iParam", null);
        setField(term127313, term127313.getClass(), "iMillis", null);
        setField(term127313, term127313.getClass(), "iSeconds", null);
        setField(term127313, term127313.getClass(), "iMinutes", null);
        setField(term127313, term127313.getClass(), "iHours", null);
        setField(term127313, term127313.getClass(), "iHalfdays", null);
        setField(term127313, term127313.getClass(), "iDays", null);
        setField(term127313, term127313.getClass(), "iWeeks", null);
        setField(term127313, term127313.getClass(), "iWeekyears", null);
        setField(term127313, term127313.getClass(), "iMonths", null);
        setField(term127313, term127313.getClass(), "iYears", null);
        setField(term127313, term127313.getClass(), "iCenturies", null);
        setField(term127313, term127313.getClass(), "iEras", null);
        setField(term127313, term127313.getClass(), "iMillisOfSecond", null);
        setField(term127313, term127313.getClass(), "iMillisOfDay", null);
        setField(term127313, term127313.getClass(), "iSecondOfMinute", null);
        setField(term127313, term127313.getClass(), "iSecondOfDay", null);
        setField(term127313, term127313.getClass(), "iMinuteOfHour", null);
        setField(term127313, term127313.getClass(), "iMinuteOfDay", null);
        setField(term127313, term127313.getClass(), "iHourOfDay", null);
        setField(term127313, term127313.getClass(), "iClockhourOfDay", null);
        setField(term127313, term127313.getClass(), "iHourOfHalfday", null);
        setField(term127313, term127313.getClass(), "iClockhourOfHalfday", null);
        setField(term127313, term127313.getClass(), "iHalfdayOfDay", null);
        setField(term127313, term127313.getClass(), "iDayOfWeek", null);
        setField(term127314, term127314.getClass(), "iChronology", null);
        setLongField(term127314, term127314.getClass(), "iUnitMillis", -9223372036854775808L);
        setField(term127314, term127314.getClass(), "iUnitField", null);
        setField(term127314, term127314.getClass(), "iType", null);
        setField(term127313, term127313.getClass(), "iDayOfMonth", term127314);
        setField(term127313, term127313.getClass(), "iDayOfYear", null);
        setField(term127313, term127313.getClass(), "iWeekOfWeekyear", null);
        setField(term127313, term127313.getClass(), "iWeekyear", null);
        setField(term127313, term127313.getClass(), "iWeekyearOfCentury", null);
        setField(term127313, term127313.getClass(), "iMonthOfYear", null);
        setField(term127313, term127313.getClass(), "iYear", null);
        setField(term127313, term127313.getClass(), "iYearOfEra", null);
        setField(term127313, term127313.getClass(), "iYearOfCentury", null);
        setField(term127313, term127313.getClass(), "iCenturyOfEra", null);
        setField(term127313, term127313.getClass(), "iEra", null);
        setIntField(term127313, term127313.getClass(), "iBaseFlags", 0);
        setField(term127312, term127312.getClass(), "iChronology", term127313);
        setIntField(term127312, term127312.getClass(), "iHash", 0);
        term127303 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term127305 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term127306 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term127303, term127303.getClass(), "iLocalMillis", -9223372036854775808L);
        setField(term127305, term127305.getClass(), "iBase", null);
        setField(term127305, term127305.getClass(), "iParam", null);
        setField(term127305, term127305.getClass(), "iMillis", null);
        setField(term127305, term127305.getClass(), "iSeconds", null);
        setField(term127305, term127305.getClass(), "iMinutes", null);
        setField(term127305, term127305.getClass(), "iHours", null);
        setField(term127305, term127305.getClass(), "iHalfdays", null);
        setField(term127305, term127305.getClass(), "iDays", null);
        setField(term127305, term127305.getClass(), "iWeeks", null);
        setField(term127305, term127305.getClass(), "iWeekyears", null);
        setField(term127305, term127305.getClass(), "iMonths", null);
        setField(term127305, term127305.getClass(), "iYears", null);
        setField(term127305, term127305.getClass(), "iCenturies", null);
        setField(term127305, term127305.getClass(), "iEras", null);
        setField(term127305, term127305.getClass(), "iMillisOfSecond", null);
        setField(term127305, term127305.getClass(), "iMillisOfDay", null);
        setField(term127305, term127305.getClass(), "iSecondOfMinute", null);
        setField(term127305, term127305.getClass(), "iSecondOfDay", null);
        setField(term127305, term127305.getClass(), "iMinuteOfHour", null);
        setField(term127305, term127305.getClass(), "iMinuteOfDay", null);
        setField(term127305, term127305.getClass(), "iHourOfDay", null);
        setField(term127305, term127305.getClass(), "iClockhourOfDay", null);
        setField(term127305, term127305.getClass(), "iHourOfHalfday", null);
        setField(term127305, term127305.getClass(), "iClockhourOfHalfday", null);
        setField(term127305, term127305.getClass(), "iHalfdayOfDay", null);
        setField(term127305, term127305.getClass(), "iDayOfWeek", null);
        setField(term127306, term127306.getClass(), "iChronology", null);
        setLongField(term127306, term127306.getClass(), "iUnitMillis", -9223372036854775808L);
        setField(term127306, term127306.getClass(), "iUnitField", null);
        setField(term127306, term127306.getClass(), "iType", null);
        setField(term127305, term127305.getClass(), "iDayOfMonth", term127306);
        setField(term127305, term127305.getClass(), "iDayOfYear", null);
        setField(term127305, term127305.getClass(), "iWeekOfWeekyear", null);
        setField(term127305, term127305.getClass(), "iWeekyear", null);
        setField(term127305, term127305.getClass(), "iWeekyearOfCentury", null);
        setField(term127305, term127305.getClass(), "iMonthOfYear", null);
        setField(term127305, term127305.getClass(), "iYear", null);
        setField(term127305, term127305.getClass(), "iYearOfEra", null);
        setField(term127305, term127305.getClass(), "iYearOfCentury", null);
        setField(term127305, term127305.getClass(), "iCenturyOfEra", null);
        setField(term127305, term127305.getClass(), "iEra", null);
        setIntField(term127305, term127305.getClass(), "iBaseFlags", 0);
        setField(term127303, term127303.getClass(), "iChronology", term127305);
        setIntField(term127303, term127303.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = -9220837014266683107L;
        Object retValue = callMethod(klass, "withLocalMillis", argTypes, term127113, args);
        assertTrue(recursiveEquals(term127113, term127312));
        assertTrue(recursiveEquals(retValue, term127303));
    }

};


