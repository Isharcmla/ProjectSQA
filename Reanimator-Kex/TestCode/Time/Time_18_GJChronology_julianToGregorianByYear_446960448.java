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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class GJChronology_julianToGregorianByYear_446960448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410;
     Object term424;

    public GJChronology_julianToGregorianByYear_446960448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term411 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term412 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 0);
        Object term414 = newInstance(Class.forName("java.lang.Object"));
        Object term416 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term419 = newInstance(Class.forName("org.joda.time.Instant"));
        setField(term411, term411.getClass(), "iYearInfoCache", term412);
        setIntField(term411, term411.getClass(), "iMinDaysInFirstWeek", -1772434990);
        setField(term411, term411.getClass(), "iBase", null);
        setField(term411, term411.getClass(), "iParam", term414);
        setField(term411, term411.getClass(), "iMillis", null);
        setField(term411, term411.getClass(), "iSeconds", null);
        setField(term411, term411.getClass(), "iMinutes", null);
        setField(term411, term411.getClass(), "iHours", null);
        setField(term411, term411.getClass(), "iHalfdays", null);
        setField(term411, term411.getClass(), "iDays", null);
        setField(term411, term411.getClass(), "iWeeks", null);
        setField(term411, term411.getClass(), "iWeekyears", null);
        setField(term411, term411.getClass(), "iMonths", null);
        setField(term411, term411.getClass(), "iYears", null);
        setField(term411, term411.getClass(), "iCenturies", null);
        setField(term411, term411.getClass(), "iEras", null);
        setField(term411, term411.getClass(), "iMillisOfSecond", null);
        setField(term411, term411.getClass(), "iMillisOfDay", null);
        setField(term411, term411.getClass(), "iSecondOfMinute", null);
        setField(term411, term411.getClass(), "iSecondOfDay", null);
        setField(term411, term411.getClass(), "iMinuteOfHour", null);
        setField(term411, term411.getClass(), "iMinuteOfDay", null);
        setField(term411, term411.getClass(), "iHourOfDay", null);
        setField(term411, term411.getClass(), "iClockhourOfDay", null);
        setField(term411, term411.getClass(), "iHourOfHalfday", null);
        setField(term411, term411.getClass(), "iClockhourOfHalfday", null);
        setField(term411, term411.getClass(), "iHalfdayOfDay", null);
        setField(term411, term411.getClass(), "iDayOfWeek", null);
        setField(term411, term411.getClass(), "iDayOfMonth", null);
        setField(term411, term411.getClass(), "iDayOfYear", null);
        setField(term411, term411.getClass(), "iWeekOfWeekyear", null);
        setField(term411, term411.getClass(), "iWeekyear", null);
        setField(term411, term411.getClass(), "iWeekyearOfCentury", null);
        setField(term411, term411.getClass(), "iMonthOfYear", null);
        setField(term411, term411.getClass(), "iYear", null);
        setField(term411, term411.getClass(), "iYearOfEra", null);
        setField(term411, term411.getClass(), "iYearOfCentury", null);
        setField(term411, term411.getClass(), "iCenturyOfEra", null);
        setField(term411, term411.getClass(), "iEra", null);
        setIntField(term411, term411.getClass(), "iBaseFlags", 0);
        setField(term410, term410.getClass(), "iJulianChronology", term411);
        setField(term416, term416.getClass(), "iYearInfoCache", null);
        setIntField(term416, term416.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term416, term416.getClass(), "iBase", null);
        setField(term416, term416.getClass(), "iParam", null);
        setField(term416, term416.getClass(), "iMillis", null);
        setField(term416, term416.getClass(), "iSeconds", null);
        setField(term416, term416.getClass(), "iMinutes", null);
        setField(term416, term416.getClass(), "iHours", null);
        setField(term416, term416.getClass(), "iHalfdays", null);
        setField(term416, term416.getClass(), "iDays", null);
        setField(term416, term416.getClass(), "iWeeks", null);
        setField(term416, term416.getClass(), "iWeekyears", null);
        setField(term416, term416.getClass(), "iMonths", null);
        setField(term416, term416.getClass(), "iYears", null);
        setField(term416, term416.getClass(), "iCenturies", null);
        setField(term416, term416.getClass(), "iEras", null);
        setField(term416, term416.getClass(), "iMillisOfSecond", null);
        setField(term416, term416.getClass(), "iMillisOfDay", null);
        setField(term416, term416.getClass(), "iSecondOfMinute", null);
        setField(term416, term416.getClass(), "iSecondOfDay", null);
        setField(term416, term416.getClass(), "iMinuteOfHour", null);
        setField(term416, term416.getClass(), "iMinuteOfDay", null);
        setField(term416, term416.getClass(), "iHourOfDay", null);
        setField(term416, term416.getClass(), "iClockhourOfDay", null);
        setField(term416, term416.getClass(), "iHourOfHalfday", null);
        setField(term416, term416.getClass(), "iClockhourOfHalfday", null);
        setField(term416, term416.getClass(), "iHalfdayOfDay", null);
        setField(term416, term416.getClass(), "iDayOfWeek", null);
        setField(term416, term416.getClass(), "iDayOfMonth", null);
        setField(term416, term416.getClass(), "iDayOfYear", null);
        setField(term416, term416.getClass(), "iWeekOfWeekyear", null);
        setField(term416, term416.getClass(), "iWeekyear", null);
        setField(term416, term416.getClass(), "iWeekyearOfCentury", null);
        setField(term416, term416.getClass(), "iMonthOfYear", null);
        setField(term416, term416.getClass(), "iYear", null);
        setField(term416, term416.getClass(), "iYearOfEra", null);
        setField(term416, term416.getClass(), "iYearOfCentury", null);
        setField(term416, term416.getClass(), "iCenturyOfEra", null);
        setField(term416, term416.getClass(), "iEra", null);
        setIntField(term416, term416.getClass(), "iBaseFlags", 0);
        setField(term410, term410.getClass(), "iGregorianChronology", term416);
        setLongField(term419, term419.getClass(), "iMillis", 1790195839498L);
        setField(term410, term410.getClass(), "iCutoverInstant", term419);
        setLongField(term410, term410.getClass(), "iCutoverMillis", -8876856890348836498L);
        setLongField(term410, term410.getClass(), "iGapDuration", 846579494941632714L);
        setField(term410, term410.getClass(), "iBase", null);
        setField(term410, term410.getClass(), "iParam", null);
        setField(term410, term410.getClass(), "iMillis", null);
        setField(term410, term410.getClass(), "iSeconds", null);
        setField(term410, term410.getClass(), "iMinutes", null);
        setField(term410, term410.getClass(), "iHours", null);
        setField(term410, term410.getClass(), "iHalfdays", null);
        setField(term410, term410.getClass(), "iDays", null);
        setField(term410, term410.getClass(), "iWeeks", null);
        setField(term410, term410.getClass(), "iWeekyears", null);
        setField(term410, term410.getClass(), "iMonths", null);
        setField(term410, term410.getClass(), "iYears", null);
        setField(term410, term410.getClass(), "iCenturies", null);
        setField(term410, term410.getClass(), "iEras", null);
        setField(term410, term410.getClass(), "iMillisOfSecond", null);
        setField(term410, term410.getClass(), "iMillisOfDay", null);
        setField(term410, term410.getClass(), "iSecondOfMinute", null);
        setField(term410, term410.getClass(), "iSecondOfDay", null);
        setField(term410, term410.getClass(), "iMinuteOfHour", null);
        setField(term410, term410.getClass(), "iMinuteOfDay", null);
        setField(term410, term410.getClass(), "iHourOfDay", null);
        setField(term410, term410.getClass(), "iClockhourOfDay", null);
        setField(term410, term410.getClass(), "iHourOfHalfday", null);
        setField(term410, term410.getClass(), "iClockhourOfHalfday", null);
        setField(term410, term410.getClass(), "iHalfdayOfDay", null);
        setField(term410, term410.getClass(), "iDayOfWeek", null);
        setField(term410, term410.getClass(), "iDayOfMonth", null);
        setField(term410, term410.getClass(), "iDayOfYear", null);
        setField(term410, term410.getClass(), "iWeekOfWeekyear", null);
        setField(term410, term410.getClass(), "iWeekyear", null);
        setField(term410, term410.getClass(), "iWeekyearOfCentury", null);
        setField(term410, term410.getClass(), "iMonthOfYear", null);
        setField(term410, term410.getClass(), "iYear", null);
        setField(term410, term410.getClass(), "iYearOfEra", null);
        setField(term410, term410.getClass(), "iYearOfCentury", null);
        setField(term410, term410.getClass(), "iCenturyOfEra", null);
        setField(term410, term410.getClass(), "iEra", null);
        setIntField(term410, term410.getClass(), "iBaseFlags", 0);
        term424 = new Long(6689117472719450333L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term424;
        try {
            callMethod(klass, "julianToGregorianByYear", argTypes, term410, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


