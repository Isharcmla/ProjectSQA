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

public class GJChronology_getZone_63633686376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29408;
     Object term29525;
     Object term29512;

    public GJChronology_getZone_63633686376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29408 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term29480 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term29408, term29408.getClass(), "iBase", term29480);
        term29525 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term29526 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term29525, term29525.getClass(), "iJulianChronology", null);
        setField(term29525, term29525.getClass(), "iGregorianChronology", null);
        setField(term29525, term29525.getClass(), "iCutoverInstant", null);
        setLongField(term29525, term29525.getClass(), "iCutoverMillis", 0L);
        setLongField(term29525, term29525.getClass(), "iGapDuration", 0L);
        setField(term29526, term29526.getClass(), "iJulianChronology", null);
        setField(term29526, term29526.getClass(), "iGregorianChronology", null);
        setField(term29526, term29526.getClass(), "iCutoverInstant", null);
        setLongField(term29526, term29526.getClass(), "iCutoverMillis", 0L);
        setLongField(term29526, term29526.getClass(), "iGapDuration", 0L);
        setField(term29526, term29526.getClass(), "iBase", null);
        setField(term29526, term29526.getClass(), "iParam", null);
        setField(term29526, term29526.getClass(), "iMillis", null);
        setField(term29526, term29526.getClass(), "iSeconds", null);
        setField(term29526, term29526.getClass(), "iMinutes", null);
        setField(term29526, term29526.getClass(), "iHours", null);
        setField(term29526, term29526.getClass(), "iHalfdays", null);
        setField(term29526, term29526.getClass(), "iDays", null);
        setField(term29526, term29526.getClass(), "iWeeks", null);
        setField(term29526, term29526.getClass(), "iWeekyears", null);
        setField(term29526, term29526.getClass(), "iMonths", null);
        setField(term29526, term29526.getClass(), "iYears", null);
        setField(term29526, term29526.getClass(), "iCenturies", null);
        setField(term29526, term29526.getClass(), "iEras", null);
        setField(term29526, term29526.getClass(), "iMillisOfSecond", null);
        setField(term29526, term29526.getClass(), "iMillisOfDay", null);
        setField(term29526, term29526.getClass(), "iSecondOfMinute", null);
        setField(term29526, term29526.getClass(), "iSecondOfDay", null);
        setField(term29526, term29526.getClass(), "iMinuteOfHour", null);
        setField(term29526, term29526.getClass(), "iMinuteOfDay", null);
        setField(term29526, term29526.getClass(), "iHourOfDay", null);
        setField(term29526, term29526.getClass(), "iClockhourOfDay", null);
        setField(term29526, term29526.getClass(), "iHourOfHalfday", null);
        setField(term29526, term29526.getClass(), "iClockhourOfHalfday", null);
        setField(term29526, term29526.getClass(), "iHalfdayOfDay", null);
        setField(term29526, term29526.getClass(), "iDayOfWeek", null);
        setField(term29526, term29526.getClass(), "iDayOfMonth", null);
        setField(term29526, term29526.getClass(), "iDayOfYear", null);
        setField(term29526, term29526.getClass(), "iWeekOfWeekyear", null);
        setField(term29526, term29526.getClass(), "iWeekyear", null);
        setField(term29526, term29526.getClass(), "iWeekyearOfCentury", null);
        setField(term29526, term29526.getClass(), "iMonthOfYear", null);
        setField(term29526, term29526.getClass(), "iYear", null);
        setField(term29526, term29526.getClass(), "iYearOfEra", null);
        setField(term29526, term29526.getClass(), "iYearOfCentury", null);
        setField(term29526, term29526.getClass(), "iCenturyOfEra", null);
        setField(term29526, term29526.getClass(), "iEra", null);
        setIntField(term29526, term29526.getClass(), "iBaseFlags", 0);
        setField(term29525, term29525.getClass(), "iBase", term29526);
        setField(term29525, term29525.getClass(), "iParam", null);
        setField(term29525, term29525.getClass(), "iMillis", null);
        setField(term29525, term29525.getClass(), "iSeconds", null);
        setField(term29525, term29525.getClass(), "iMinutes", null);
        setField(term29525, term29525.getClass(), "iHours", null);
        setField(term29525, term29525.getClass(), "iHalfdays", null);
        setField(term29525, term29525.getClass(), "iDays", null);
        setField(term29525, term29525.getClass(), "iWeeks", null);
        setField(term29525, term29525.getClass(), "iWeekyears", null);
        setField(term29525, term29525.getClass(), "iMonths", null);
        setField(term29525, term29525.getClass(), "iYears", null);
        setField(term29525, term29525.getClass(), "iCenturies", null);
        setField(term29525, term29525.getClass(), "iEras", null);
        setField(term29525, term29525.getClass(), "iMillisOfSecond", null);
        setField(term29525, term29525.getClass(), "iMillisOfDay", null);
        setField(term29525, term29525.getClass(), "iSecondOfMinute", null);
        setField(term29525, term29525.getClass(), "iSecondOfDay", null);
        setField(term29525, term29525.getClass(), "iMinuteOfHour", null);
        setField(term29525, term29525.getClass(), "iMinuteOfDay", null);
        setField(term29525, term29525.getClass(), "iHourOfDay", null);
        setField(term29525, term29525.getClass(), "iClockhourOfDay", null);
        setField(term29525, term29525.getClass(), "iHourOfHalfday", null);
        setField(term29525, term29525.getClass(), "iClockhourOfHalfday", null);
        setField(term29525, term29525.getClass(), "iHalfdayOfDay", null);
        setField(term29525, term29525.getClass(), "iDayOfWeek", null);
        setField(term29525, term29525.getClass(), "iDayOfMonth", null);
        setField(term29525, term29525.getClass(), "iDayOfYear", null);
        setField(term29525, term29525.getClass(), "iWeekOfWeekyear", null);
        setField(term29525, term29525.getClass(), "iWeekyear", null);
        setField(term29525, term29525.getClass(), "iWeekyearOfCentury", null);
        setField(term29525, term29525.getClass(), "iMonthOfYear", null);
        setField(term29525, term29525.getClass(), "iYear", null);
        setField(term29525, term29525.getClass(), "iYearOfEra", null);
        setField(term29525, term29525.getClass(), "iYearOfCentury", null);
        setField(term29525, term29525.getClass(), "iCenturyOfEra", null);
        setField(term29525, term29525.getClass(), "iEra", null);
        setIntField(term29525, term29525.getClass(), "iBaseFlags", 0);
        term29512 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term29512, term29512.getClass(), "iNameKey", "UTC");
        setIntField(term29512, term29512.getClass(), "iWallOffset", 0);
        setIntField(term29512, term29512.getClass(), "iStandardOffset", 0);
        setField(term29512, term29512.getClass(), "iID", "UTC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getZone", argTypes, term29408, args);
        assertTrue(recursiveEquals(term29408, term29525));
        assertTrue(recursiveEquals(retValue, term29512));
    }

};


