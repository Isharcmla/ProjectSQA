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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GJChronology_withZone_108568505939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;

    public GJChronology_withZone_108568505939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term153 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term154 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 6);
        Object term155 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term158 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term161 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term164 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term167 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term170 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term174 = newInstance(Class.forName("java.lang.Object"));
        Object term176 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term179 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term155, term155.getClass(), "iYear", 1193880199);
        setLongField(term155, term155.getClass(), "iFirstDayMillis", -484994522244390100L);
        setElement(term154, 0, term155);
        setIntField(term158, term158.getClass(), "iYear", -1087774327);
        setLongField(term158, term158.getClass(), "iFirstDayMillis", 1233889271256172047L);
        setElement(term154, 1, term158);
        setIntField(term161, term161.getClass(), "iYear", -1530420153);
        setLongField(term161, term161.getClass(), "iFirstDayMillis", 6617340557564669657L);
        setElement(term154, 2, term161);
        setIntField(term164, term164.getClass(), "iYear", -469968304);
        setLongField(term164, term164.getClass(), "iFirstDayMillis", 1439298019805881866L);
        setElement(term154, 3, term164);
        setIntField(term167, term167.getClass(), "iYear", -1145578966);
        setLongField(term167, term167.getClass(), "iFirstDayMillis", -8708192233349544946L);
        setElement(term154, 4, term167);
        setIntField(term170, term170.getClass(), "iYear", 679763016);
        setLongField(term170, term170.getClass(), "iFirstDayMillis", 5907001541142728739L);
        setElement(term154, 5, term170);
        setField(term153, term153.getClass(), "iYearInfoCache", term154);
        setIntField(term153, term153.getClass(), "iMinDaysInFirstWeek", 1962444399);
        setField(term153, term153.getClass(), "iBase", null);
        setField(term153, term153.getClass(), "iParam", term174);
        setField(term153, term153.getClass(), "iMillis", null);
        setField(term153, term153.getClass(), "iSeconds", null);
        setField(term153, term153.getClass(), "iMinutes", null);
        setField(term153, term153.getClass(), "iHours", null);
        setField(term153, term153.getClass(), "iHalfdays", null);
        setField(term153, term153.getClass(), "iDays", null);
        setField(term153, term153.getClass(), "iWeeks", null);
        setField(term153, term153.getClass(), "iWeekyears", null);
        setField(term153, term153.getClass(), "iMonths", null);
        setField(term153, term153.getClass(), "iYears", null);
        setField(term153, term153.getClass(), "iCenturies", null);
        setField(term153, term153.getClass(), "iEras", null);
        setField(term153, term153.getClass(), "iMillisOfSecond", null);
        setField(term153, term153.getClass(), "iMillisOfDay", null);
        setField(term153, term153.getClass(), "iSecondOfMinute", null);
        setField(term153, term153.getClass(), "iSecondOfDay", null);
        setField(term153, term153.getClass(), "iMinuteOfHour", null);
        setField(term153, term153.getClass(), "iMinuteOfDay", null);
        setField(term153, term153.getClass(), "iHourOfDay", null);
        setField(term153, term153.getClass(), "iClockhourOfDay", null);
        setField(term153, term153.getClass(), "iHourOfHalfday", null);
        setField(term153, term153.getClass(), "iClockhourOfHalfday", null);
        setField(term153, term153.getClass(), "iHalfdayOfDay", null);
        setField(term153, term153.getClass(), "iDayOfWeek", null);
        setField(term153, term153.getClass(), "iDayOfMonth", null);
        setField(term153, term153.getClass(), "iDayOfYear", null);
        setField(term153, term153.getClass(), "iWeekOfWeekyear", null);
        setField(term153, term153.getClass(), "iWeekyear", null);
        setField(term153, term153.getClass(), "iWeekyearOfCentury", null);
        setField(term153, term153.getClass(), "iMonthOfYear", null);
        setField(term153, term153.getClass(), "iYear", null);
        setField(term153, term153.getClass(), "iYearOfEra", null);
        setField(term153, term153.getClass(), "iYearOfCentury", null);
        setField(term153, term153.getClass(), "iCenturyOfEra", null);
        setField(term153, term153.getClass(), "iEra", null);
        setIntField(term153, term153.getClass(), "iBaseFlags", 0);
        setField(term152, term152.getClass(), "iJulianChronology", term153);
        setField(term176, term176.getClass(), "iYearInfoCache", null);
        setIntField(term176, term176.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term176, term176.getClass(), "iBase", null);
        setField(term176, term176.getClass(), "iParam", null);
        setField(term176, term176.getClass(), "iMillis", null);
        setField(term176, term176.getClass(), "iSeconds", null);
        setField(term176, term176.getClass(), "iMinutes", null);
        setField(term176, term176.getClass(), "iHours", null);
        setField(term176, term176.getClass(), "iHalfdays", null);
        setField(term176, term176.getClass(), "iDays", null);
        setField(term176, term176.getClass(), "iWeeks", null);
        setField(term176, term176.getClass(), "iWeekyears", null);
        setField(term176, term176.getClass(), "iMonths", null);
        setField(term176, term176.getClass(), "iYears", null);
        setField(term176, term176.getClass(), "iCenturies", null);
        setField(term176, term176.getClass(), "iEras", null);
        setField(term176, term176.getClass(), "iMillisOfSecond", null);
        setField(term176, term176.getClass(), "iMillisOfDay", null);
        setField(term176, term176.getClass(), "iSecondOfMinute", null);
        setField(term176, term176.getClass(), "iSecondOfDay", null);
        setField(term176, term176.getClass(), "iMinuteOfHour", null);
        setField(term176, term176.getClass(), "iMinuteOfDay", null);
        setField(term176, term176.getClass(), "iHourOfDay", null);
        setField(term176, term176.getClass(), "iClockhourOfDay", null);
        setField(term176, term176.getClass(), "iHourOfHalfday", null);
        setField(term176, term176.getClass(), "iClockhourOfHalfday", null);
        setField(term176, term176.getClass(), "iHalfdayOfDay", null);
        setField(term176, term176.getClass(), "iDayOfWeek", null);
        setField(term176, term176.getClass(), "iDayOfMonth", null);
        setField(term176, term176.getClass(), "iDayOfYear", null);
        setField(term176, term176.getClass(), "iWeekOfWeekyear", null);
        setField(term176, term176.getClass(), "iWeekyear", null);
        setField(term176, term176.getClass(), "iWeekyearOfCentury", null);
        setField(term176, term176.getClass(), "iMonthOfYear", null);
        setField(term176, term176.getClass(), "iYear", null);
        setField(term176, term176.getClass(), "iYearOfEra", null);
        setField(term176, term176.getClass(), "iYearOfCentury", null);
        setField(term176, term176.getClass(), "iCenturyOfEra", null);
        setField(term176, term176.getClass(), "iEra", null);
        setIntField(term176, term176.getClass(), "iBaseFlags", 0);
        setField(term152, term152.getClass(), "iGregorianChronology", term176);
        setLongField(term179, term179.getClass(), "iMillis", 1790195839003L);
        setField(term152, term152.getClass(), "iCutoverInstant", term179);
        setLongField(term152, term152.getClass(), "iCutoverMillis", 4178434741742309755L);
        setLongField(term152, term152.getClass(), "iGapDuration", -2068172595987555756L);
        setField(term152, term152.getClass(), "iBase", null);
        setField(term152, term152.getClass(), "iParam", null);
        setField(term152, term152.getClass(), "iMillis", null);
        setField(term152, term152.getClass(), "iSeconds", null);
        setField(term152, term152.getClass(), "iMinutes", null);
        setField(term152, term152.getClass(), "iHours", null);
        setField(term152, term152.getClass(), "iHalfdays", null);
        setField(term152, term152.getClass(), "iDays", null);
        setField(term152, term152.getClass(), "iWeeks", null);
        setField(term152, term152.getClass(), "iWeekyears", null);
        setField(term152, term152.getClass(), "iMonths", null);
        setField(term152, term152.getClass(), "iYears", null);
        setField(term152, term152.getClass(), "iCenturies", null);
        setField(term152, term152.getClass(), "iEras", null);
        setField(term152, term152.getClass(), "iMillisOfSecond", null);
        setField(term152, term152.getClass(), "iMillisOfDay", null);
        setField(term152, term152.getClass(), "iSecondOfMinute", null);
        setField(term152, term152.getClass(), "iSecondOfDay", null);
        setField(term152, term152.getClass(), "iMinuteOfHour", null);
        setField(term152, term152.getClass(), "iMinuteOfDay", null);
        setField(term152, term152.getClass(), "iHourOfDay", null);
        setField(term152, term152.getClass(), "iClockhourOfDay", null);
        setField(term152, term152.getClass(), "iHourOfHalfday", null);
        setField(term152, term152.getClass(), "iClockhourOfHalfday", null);
        setField(term152, term152.getClass(), "iHalfdayOfDay", null);
        setField(term152, term152.getClass(), "iDayOfWeek", null);
        setField(term152, term152.getClass(), "iDayOfMonth", null);
        setField(term152, term152.getClass(), "iDayOfYear", null);
        setField(term152, term152.getClass(), "iWeekOfWeekyear", null);
        setField(term152, term152.getClass(), "iWeekyear", null);
        setField(term152, term152.getClass(), "iWeekyearOfCentury", null);
        setField(term152, term152.getClass(), "iMonthOfYear", null);
        setField(term152, term152.getClass(), "iYear", null);
        setField(term152, term152.getClass(), "iYearOfEra", null);
        setField(term152, term152.getClass(), "iYearOfCentury", null);
        setField(term152, term152.getClass(), "iCenturyOfEra", null);
        setField(term152, term152.getClass(), "iEra", null);
        setIntField(term152, term152.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "withZone", argTypes, term152, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


