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

public class GJChronology_gregorianToJulianByYear_15622547649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;
     Object term446;

    public GJChronology_gregorianToJulianByYear_15622547649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term427 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term428 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 2);
        Object term429 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term432 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term436 = newInstance(Class.forName("java.lang.Object"));
        Object term438 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term441 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term429, term429.getClass(), "iYear", -1845499264);
        setLongField(term429, term429.getClass(), "iFirstDayMillis", 5836128569274066678L);
        setElement(term428, 0, term429);
        setIntField(term432, term432.getClass(), "iYear", -505439934);
        setLongField(term432, term432.getClass(), "iFirstDayMillis", -2177368829816872572L);
        setElement(term428, 1, term432);
        setField(term427, term427.getClass(), "iYearInfoCache", term428);
        setIntField(term427, term427.getClass(), "iMinDaysInFirstWeek", -344842608);
        setField(term427, term427.getClass(), "iBase", null);
        setField(term427, term427.getClass(), "iParam", term436);
        setField(term427, term427.getClass(), "iMillis", null);
        setField(term427, term427.getClass(), "iSeconds", null);
        setField(term427, term427.getClass(), "iMinutes", null);
        setField(term427, term427.getClass(), "iHours", null);
        setField(term427, term427.getClass(), "iHalfdays", null);
        setField(term427, term427.getClass(), "iDays", null);
        setField(term427, term427.getClass(), "iWeeks", null);
        setField(term427, term427.getClass(), "iWeekyears", null);
        setField(term427, term427.getClass(), "iMonths", null);
        setField(term427, term427.getClass(), "iYears", null);
        setField(term427, term427.getClass(), "iCenturies", null);
        setField(term427, term427.getClass(), "iEras", null);
        setField(term427, term427.getClass(), "iMillisOfSecond", null);
        setField(term427, term427.getClass(), "iMillisOfDay", null);
        setField(term427, term427.getClass(), "iSecondOfMinute", null);
        setField(term427, term427.getClass(), "iSecondOfDay", null);
        setField(term427, term427.getClass(), "iMinuteOfHour", null);
        setField(term427, term427.getClass(), "iMinuteOfDay", null);
        setField(term427, term427.getClass(), "iHourOfDay", null);
        setField(term427, term427.getClass(), "iClockhourOfDay", null);
        setField(term427, term427.getClass(), "iHourOfHalfday", null);
        setField(term427, term427.getClass(), "iClockhourOfHalfday", null);
        setField(term427, term427.getClass(), "iHalfdayOfDay", null);
        setField(term427, term427.getClass(), "iDayOfWeek", null);
        setField(term427, term427.getClass(), "iDayOfMonth", null);
        setField(term427, term427.getClass(), "iDayOfYear", null);
        setField(term427, term427.getClass(), "iWeekOfWeekyear", null);
        setField(term427, term427.getClass(), "iWeekyear", null);
        setField(term427, term427.getClass(), "iWeekyearOfCentury", null);
        setField(term427, term427.getClass(), "iMonthOfYear", null);
        setField(term427, term427.getClass(), "iYear", null);
        setField(term427, term427.getClass(), "iYearOfEra", null);
        setField(term427, term427.getClass(), "iYearOfCentury", null);
        setField(term427, term427.getClass(), "iCenturyOfEra", null);
        setField(term427, term427.getClass(), "iEra", null);
        setIntField(term427, term427.getClass(), "iBaseFlags", 0);
        setField(term426, term426.getClass(), "iJulianChronology", term427);
        setField(term438, term438.getClass(), "iYearInfoCache", null);
        setIntField(term438, term438.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term438, term438.getClass(), "iBase", null);
        setField(term438, term438.getClass(), "iParam", null);
        setField(term438, term438.getClass(), "iMillis", null);
        setField(term438, term438.getClass(), "iSeconds", null);
        setField(term438, term438.getClass(), "iMinutes", null);
        setField(term438, term438.getClass(), "iHours", null);
        setField(term438, term438.getClass(), "iHalfdays", null);
        setField(term438, term438.getClass(), "iDays", null);
        setField(term438, term438.getClass(), "iWeeks", null);
        setField(term438, term438.getClass(), "iWeekyears", null);
        setField(term438, term438.getClass(), "iMonths", null);
        setField(term438, term438.getClass(), "iYears", null);
        setField(term438, term438.getClass(), "iCenturies", null);
        setField(term438, term438.getClass(), "iEras", null);
        setField(term438, term438.getClass(), "iMillisOfSecond", null);
        setField(term438, term438.getClass(), "iMillisOfDay", null);
        setField(term438, term438.getClass(), "iSecondOfMinute", null);
        setField(term438, term438.getClass(), "iSecondOfDay", null);
        setField(term438, term438.getClass(), "iMinuteOfHour", null);
        setField(term438, term438.getClass(), "iMinuteOfDay", null);
        setField(term438, term438.getClass(), "iHourOfDay", null);
        setField(term438, term438.getClass(), "iClockhourOfDay", null);
        setField(term438, term438.getClass(), "iHourOfHalfday", null);
        setField(term438, term438.getClass(), "iClockhourOfHalfday", null);
        setField(term438, term438.getClass(), "iHalfdayOfDay", null);
        setField(term438, term438.getClass(), "iDayOfWeek", null);
        setField(term438, term438.getClass(), "iDayOfMonth", null);
        setField(term438, term438.getClass(), "iDayOfYear", null);
        setField(term438, term438.getClass(), "iWeekOfWeekyear", null);
        setField(term438, term438.getClass(), "iWeekyear", null);
        setField(term438, term438.getClass(), "iWeekyearOfCentury", null);
        setField(term438, term438.getClass(), "iMonthOfYear", null);
        setField(term438, term438.getClass(), "iYear", null);
        setField(term438, term438.getClass(), "iYearOfEra", null);
        setField(term438, term438.getClass(), "iYearOfCentury", null);
        setField(term438, term438.getClass(), "iCenturyOfEra", null);
        setField(term438, term438.getClass(), "iEra", null);
        setIntField(term438, term438.getClass(), "iBaseFlags", 0);
        setField(term426, term426.getClass(), "iGregorianChronology", term438);
        setLongField(term441, term441.getClass(), "iMillis", 1790192411890L);
        setField(term426, term426.getClass(), "iCutoverInstant", term441);
        setLongField(term426, term426.getClass(), "iCutoverMillis", -8463029266761149071L);
        setLongField(term426, term426.getClass(), "iGapDuration", 3133860696238261492L);
        setField(term426, term426.getClass(), "iBase", null);
        setField(term426, term426.getClass(), "iParam", null);
        setField(term426, term426.getClass(), "iMillis", null);
        setField(term426, term426.getClass(), "iSeconds", null);
        setField(term426, term426.getClass(), "iMinutes", null);
        setField(term426, term426.getClass(), "iHours", null);
        setField(term426, term426.getClass(), "iHalfdays", null);
        setField(term426, term426.getClass(), "iDays", null);
        setField(term426, term426.getClass(), "iWeeks", null);
        setField(term426, term426.getClass(), "iWeekyears", null);
        setField(term426, term426.getClass(), "iMonths", null);
        setField(term426, term426.getClass(), "iYears", null);
        setField(term426, term426.getClass(), "iCenturies", null);
        setField(term426, term426.getClass(), "iEras", null);
        setField(term426, term426.getClass(), "iMillisOfSecond", null);
        setField(term426, term426.getClass(), "iMillisOfDay", null);
        setField(term426, term426.getClass(), "iSecondOfMinute", null);
        setField(term426, term426.getClass(), "iSecondOfDay", null);
        setField(term426, term426.getClass(), "iMinuteOfHour", null);
        setField(term426, term426.getClass(), "iMinuteOfDay", null);
        setField(term426, term426.getClass(), "iHourOfDay", null);
        setField(term426, term426.getClass(), "iClockhourOfDay", null);
        setField(term426, term426.getClass(), "iHourOfHalfday", null);
        setField(term426, term426.getClass(), "iClockhourOfHalfday", null);
        setField(term426, term426.getClass(), "iHalfdayOfDay", null);
        setField(term426, term426.getClass(), "iDayOfWeek", null);
        setField(term426, term426.getClass(), "iDayOfMonth", null);
        setField(term426, term426.getClass(), "iDayOfYear", null);
        setField(term426, term426.getClass(), "iWeekOfWeekyear", null);
        setField(term426, term426.getClass(), "iWeekyear", null);
        setField(term426, term426.getClass(), "iWeekyearOfCentury", null);
        setField(term426, term426.getClass(), "iMonthOfYear", null);
        setField(term426, term426.getClass(), "iYear", null);
        setField(term426, term426.getClass(), "iYearOfEra", null);
        setField(term426, term426.getClass(), "iYearOfCentury", null);
        setField(term426, term426.getClass(), "iCenturyOfEra", null);
        setField(term426, term426.getClass(), "iEra", null);
        setIntField(term426, term426.getClass(), "iBaseFlags", 0);
        term446 = new Long(7247160664318067468L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term446;
        try {
            callMethod(klass, "gregorianToJulianByYear", argTypes, term426, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


