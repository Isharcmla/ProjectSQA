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

public class GJChronology_toString_88169915946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public GJChronology_toString_88169915946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term370 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term371 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 3);
        Object term372 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term375 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term378 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term382 = newInstance(Class.forName("java.lang.Object"));
        Object term384 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term387 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term372, term372.getClass(), "iYear", -1465035361);
        setLongField(term372, term372.getClass(), "iFirstDayMillis", 5510783420697225605L);
        setElement(term371, 0, term372);
        setIntField(term375, term375.getClass(), "iYear", 1090617576);
        setLongField(term375, term375.getClass(), "iFirstDayMillis", 6005241913654469005L);
        setElement(term371, 1, term375);
        setIntField(term378, term378.getClass(), "iYear", -1547384488);
        setLongField(term378, term378.getClass(), "iFirstDayMillis", -1983291584002806658L);
        setElement(term371, 2, term378);
        setField(term370, term370.getClass(), "iYearInfoCache", term371);
        setIntField(term370, term370.getClass(), "iMinDaysInFirstWeek", 1442160736);
        setField(term370, term370.getClass(), "iBase", null);
        setField(term370, term370.getClass(), "iParam", term382);
        setField(term370, term370.getClass(), "iMillis", null);
        setField(term370, term370.getClass(), "iSeconds", null);
        setField(term370, term370.getClass(), "iMinutes", null);
        setField(term370, term370.getClass(), "iHours", null);
        setField(term370, term370.getClass(), "iHalfdays", null);
        setField(term370, term370.getClass(), "iDays", null);
        setField(term370, term370.getClass(), "iWeeks", null);
        setField(term370, term370.getClass(), "iWeekyears", null);
        setField(term370, term370.getClass(), "iMonths", null);
        setField(term370, term370.getClass(), "iYears", null);
        setField(term370, term370.getClass(), "iCenturies", null);
        setField(term370, term370.getClass(), "iEras", null);
        setField(term370, term370.getClass(), "iMillisOfSecond", null);
        setField(term370, term370.getClass(), "iMillisOfDay", null);
        setField(term370, term370.getClass(), "iSecondOfMinute", null);
        setField(term370, term370.getClass(), "iSecondOfDay", null);
        setField(term370, term370.getClass(), "iMinuteOfHour", null);
        setField(term370, term370.getClass(), "iMinuteOfDay", null);
        setField(term370, term370.getClass(), "iHourOfDay", null);
        setField(term370, term370.getClass(), "iClockhourOfDay", null);
        setField(term370, term370.getClass(), "iHourOfHalfday", null);
        setField(term370, term370.getClass(), "iClockhourOfHalfday", null);
        setField(term370, term370.getClass(), "iHalfdayOfDay", null);
        setField(term370, term370.getClass(), "iDayOfWeek", null);
        setField(term370, term370.getClass(), "iDayOfMonth", null);
        setField(term370, term370.getClass(), "iDayOfYear", null);
        setField(term370, term370.getClass(), "iWeekOfWeekyear", null);
        setField(term370, term370.getClass(), "iWeekyear", null);
        setField(term370, term370.getClass(), "iWeekyearOfCentury", null);
        setField(term370, term370.getClass(), "iMonthOfYear", null);
        setField(term370, term370.getClass(), "iYear", null);
        setField(term370, term370.getClass(), "iYearOfEra", null);
        setField(term370, term370.getClass(), "iYearOfCentury", null);
        setField(term370, term370.getClass(), "iCenturyOfEra", null);
        setField(term370, term370.getClass(), "iEra", null);
        setIntField(term370, term370.getClass(), "iBaseFlags", 0);
        setField(term369, term369.getClass(), "iJulianChronology", term370);
        setField(term384, term384.getClass(), "iYearInfoCache", null);
        setIntField(term384, term384.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term384, term384.getClass(), "iBase", null);
        setField(term384, term384.getClass(), "iParam", null);
        setField(term384, term384.getClass(), "iMillis", null);
        setField(term384, term384.getClass(), "iSeconds", null);
        setField(term384, term384.getClass(), "iMinutes", null);
        setField(term384, term384.getClass(), "iHours", null);
        setField(term384, term384.getClass(), "iHalfdays", null);
        setField(term384, term384.getClass(), "iDays", null);
        setField(term384, term384.getClass(), "iWeeks", null);
        setField(term384, term384.getClass(), "iWeekyears", null);
        setField(term384, term384.getClass(), "iMonths", null);
        setField(term384, term384.getClass(), "iYears", null);
        setField(term384, term384.getClass(), "iCenturies", null);
        setField(term384, term384.getClass(), "iEras", null);
        setField(term384, term384.getClass(), "iMillisOfSecond", null);
        setField(term384, term384.getClass(), "iMillisOfDay", null);
        setField(term384, term384.getClass(), "iSecondOfMinute", null);
        setField(term384, term384.getClass(), "iSecondOfDay", null);
        setField(term384, term384.getClass(), "iMinuteOfHour", null);
        setField(term384, term384.getClass(), "iMinuteOfDay", null);
        setField(term384, term384.getClass(), "iHourOfDay", null);
        setField(term384, term384.getClass(), "iClockhourOfDay", null);
        setField(term384, term384.getClass(), "iHourOfHalfday", null);
        setField(term384, term384.getClass(), "iClockhourOfHalfday", null);
        setField(term384, term384.getClass(), "iHalfdayOfDay", null);
        setField(term384, term384.getClass(), "iDayOfWeek", null);
        setField(term384, term384.getClass(), "iDayOfMonth", null);
        setField(term384, term384.getClass(), "iDayOfYear", null);
        setField(term384, term384.getClass(), "iWeekOfWeekyear", null);
        setField(term384, term384.getClass(), "iWeekyear", null);
        setField(term384, term384.getClass(), "iWeekyearOfCentury", null);
        setField(term384, term384.getClass(), "iMonthOfYear", null);
        setField(term384, term384.getClass(), "iYear", null);
        setField(term384, term384.getClass(), "iYearOfEra", null);
        setField(term384, term384.getClass(), "iYearOfCentury", null);
        setField(term384, term384.getClass(), "iCenturyOfEra", null);
        setField(term384, term384.getClass(), "iEra", null);
        setIntField(term384, term384.getClass(), "iBaseFlags", 0);
        setField(term369, term369.getClass(), "iGregorianChronology", term384);
        setLongField(term387, term387.getClass(), "iMillis", 1790195839398L);
        setField(term369, term369.getClass(), "iCutoverInstant", term387);
        setLongField(term369, term369.getClass(), "iCutoverMillis", 5946780097489996391L);
        setLongField(term369, term369.getClass(), "iGapDuration", -8652538484981166496L);
        setField(term369, term369.getClass(), "iBase", null);
        setField(term369, term369.getClass(), "iParam", null);
        setField(term369, term369.getClass(), "iMillis", null);
        setField(term369, term369.getClass(), "iSeconds", null);
        setField(term369, term369.getClass(), "iMinutes", null);
        setField(term369, term369.getClass(), "iHours", null);
        setField(term369, term369.getClass(), "iHalfdays", null);
        setField(term369, term369.getClass(), "iDays", null);
        setField(term369, term369.getClass(), "iWeeks", null);
        setField(term369, term369.getClass(), "iWeekyears", null);
        setField(term369, term369.getClass(), "iMonths", null);
        setField(term369, term369.getClass(), "iYears", null);
        setField(term369, term369.getClass(), "iCenturies", null);
        setField(term369, term369.getClass(), "iEras", null);
        setField(term369, term369.getClass(), "iMillisOfSecond", null);
        setField(term369, term369.getClass(), "iMillisOfDay", null);
        setField(term369, term369.getClass(), "iSecondOfMinute", null);
        setField(term369, term369.getClass(), "iSecondOfDay", null);
        setField(term369, term369.getClass(), "iMinuteOfHour", null);
        setField(term369, term369.getClass(), "iMinuteOfDay", null);
        setField(term369, term369.getClass(), "iHourOfDay", null);
        setField(term369, term369.getClass(), "iClockhourOfDay", null);
        setField(term369, term369.getClass(), "iHourOfHalfday", null);
        setField(term369, term369.getClass(), "iClockhourOfHalfday", null);
        setField(term369, term369.getClass(), "iHalfdayOfDay", null);
        setField(term369, term369.getClass(), "iDayOfWeek", null);
        setField(term369, term369.getClass(), "iDayOfMonth", null);
        setField(term369, term369.getClass(), "iDayOfYear", null);
        setField(term369, term369.getClass(), "iWeekOfWeekyear", null);
        setField(term369, term369.getClass(), "iWeekyear", null);
        setField(term369, term369.getClass(), "iWeekyearOfCentury", null);
        setField(term369, term369.getClass(), "iMonthOfYear", null);
        setField(term369, term369.getClass(), "iYear", null);
        setField(term369, term369.getClass(), "iYearOfEra", null);
        setField(term369, term369.getClass(), "iYearOfCentury", null);
        setField(term369, term369.getClass(), "iCenturyOfEra", null);
        setField(term369, term369.getClass(), "iEra", null);
        setIntField(term369, term369.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


