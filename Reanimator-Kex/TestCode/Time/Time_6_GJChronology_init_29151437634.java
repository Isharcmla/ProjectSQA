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

public class GJChronology_init_29151437634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term31;
     Object term48;

    public GJChronology_init_29151437634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term12 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 5);
        Object term13 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term16 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term19 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term22 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term25 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term29 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term13, term13.getClass(), "iYear", 1484323161);
        setLongField(term13, term13.getClass(), "iFirstDayMillis", -8400487765614892086L);
        setElement(term12, 0, term13);
        setIntField(term16, term16.getClass(), "iYear", 391863371);
        setLongField(term16, term16.getClass(), "iFirstDayMillis", 5270370404989704783L);
        setElement(term12, 1, term16);
        setIntField(term19, term19.getClass(), "iYear", -1922583790);
        setLongField(term19, term19.getClass(), "iFirstDayMillis", 7411271909051562686L);
        setElement(term12, 2, term19);
        setIntField(term22, term22.getClass(), "iYear", -616727354);
        setLongField(term22, term22.getClass(), "iFirstDayMillis", 4872422362414183754L);
        setElement(term12, 3, term22);
        setIntField(term25, term25.getClass(), "iYear", -1955890973);
        setLongField(term25, term25.getClass(), "iFirstDayMillis", 6811161968424632369L);
        setElement(term12, 4, term25);
        setField(term11, term11.getClass(), "iYearInfoCache", term12);
        setIntField(term11, term11.getClass(), "iMinDaysInFirstWeek", -2038273078);
        setField(term11, term11.getClass(), "iBase", null);
        setField(term11, term11.getClass(), "iParam", term29);
        setField(term11, term11.getClass(), "iMillis", null);
        setField(term11, term11.getClass(), "iSeconds", null);
        setField(term11, term11.getClass(), "iMinutes", null);
        setField(term11, term11.getClass(), "iHours", null);
        setField(term11, term11.getClass(), "iHalfdays", null);
        setField(term11, term11.getClass(), "iDays", null);
        setField(term11, term11.getClass(), "iWeeks", null);
        setField(term11, term11.getClass(), "iWeekyears", null);
        setField(term11, term11.getClass(), "iMonths", null);
        setField(term11, term11.getClass(), "iYears", null);
        setField(term11, term11.getClass(), "iCenturies", null);
        setField(term11, term11.getClass(), "iEras", null);
        setField(term11, term11.getClass(), "iMillisOfSecond", null);
        setField(term11, term11.getClass(), "iMillisOfDay", null);
        setField(term11, term11.getClass(), "iSecondOfMinute", null);
        setField(term11, term11.getClass(), "iSecondOfDay", null);
        setField(term11, term11.getClass(), "iMinuteOfHour", null);
        setField(term11, term11.getClass(), "iMinuteOfDay", null);
        setField(term11, term11.getClass(), "iHourOfDay", null);
        setField(term11, term11.getClass(), "iClockhourOfDay", null);
        setField(term11, term11.getClass(), "iHourOfHalfday", null);
        setField(term11, term11.getClass(), "iClockhourOfHalfday", null);
        setField(term11, term11.getClass(), "iHalfdayOfDay", null);
        setField(term11, term11.getClass(), "iDayOfWeek", null);
        setField(term11, term11.getClass(), "iDayOfMonth", null);
        setField(term11, term11.getClass(), "iDayOfYear", null);
        setField(term11, term11.getClass(), "iWeekOfWeekyear", null);
        setField(term11, term11.getClass(), "iWeekyear", null);
        setField(term11, term11.getClass(), "iWeekyearOfCentury", null);
        setField(term11, term11.getClass(), "iMonthOfYear", null);
        setField(term11, term11.getClass(), "iYear", null);
        setField(term11, term11.getClass(), "iYearOfEra", null);
        setField(term11, term11.getClass(), "iYearOfCentury", null);
        setField(term11, term11.getClass(), "iCenturyOfEra", null);
        setField(term11, term11.getClass(), "iEra", null);
        setIntField(term11, term11.getClass(), "iBaseFlags", 0);
        term31 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object[] term32 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 4);
        Object term33 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term36 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term39 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term42 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term46 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term33, term33.getClass(), "iYear", 1227103734);
        setLongField(term33, term33.getClass(), "iFirstDayMillis", -7237588299778557629L);
        setElement(term32, 0, term33);
        setIntField(term36, term36.getClass(), "iYear", -1339778481);
        setLongField(term36, term36.getClass(), "iFirstDayMillis", 6967924379644551255L);
        setElement(term32, 1, term36);
        setIntField(term39, term39.getClass(), "iYear", 1725571209);
        setLongField(term39, term39.getClass(), "iFirstDayMillis", -2813493605142626659L);
        setElement(term32, 2, term39);
        setIntField(term42, term42.getClass(), "iYear", -522618178);
        setLongField(term42, term42.getClass(), "iFirstDayMillis", -8885298608300233488L);
        setElement(term32, 3, term42);
        setField(term31, term31.getClass(), "iYearInfoCache", term32);
        setIntField(term31, term31.getClass(), "iMinDaysInFirstWeek", 1134449235);
        setField(term31, term31.getClass(), "iBase", null);
        setField(term31, term31.getClass(), "iParam", term46);
        setField(term31, term31.getClass(), "iMillis", null);
        setField(term31, term31.getClass(), "iSeconds", null);
        setField(term31, term31.getClass(), "iMinutes", null);
        setField(term31, term31.getClass(), "iHours", null);
        setField(term31, term31.getClass(), "iHalfdays", null);
        setField(term31, term31.getClass(), "iDays", null);
        setField(term31, term31.getClass(), "iWeeks", null);
        setField(term31, term31.getClass(), "iWeekyears", null);
        setField(term31, term31.getClass(), "iMonths", null);
        setField(term31, term31.getClass(), "iYears", null);
        setField(term31, term31.getClass(), "iCenturies", null);
        setField(term31, term31.getClass(), "iEras", null);
        setField(term31, term31.getClass(), "iMillisOfSecond", null);
        setField(term31, term31.getClass(), "iMillisOfDay", null);
        setField(term31, term31.getClass(), "iSecondOfMinute", null);
        setField(term31, term31.getClass(), "iSecondOfDay", null);
        setField(term31, term31.getClass(), "iMinuteOfHour", null);
        setField(term31, term31.getClass(), "iMinuteOfDay", null);
        setField(term31, term31.getClass(), "iHourOfDay", null);
        setField(term31, term31.getClass(), "iClockhourOfDay", null);
        setField(term31, term31.getClass(), "iHourOfHalfday", null);
        setField(term31, term31.getClass(), "iClockhourOfHalfday", null);
        setField(term31, term31.getClass(), "iHalfdayOfDay", null);
        setField(term31, term31.getClass(), "iDayOfWeek", null);
        setField(term31, term31.getClass(), "iDayOfMonth", null);
        setField(term31, term31.getClass(), "iDayOfYear", null);
        setField(term31, term31.getClass(), "iWeekOfWeekyear", null);
        setField(term31, term31.getClass(), "iWeekyear", null);
        setField(term31, term31.getClass(), "iWeekyearOfCentury", null);
        setField(term31, term31.getClass(), "iMonthOfYear", null);
        setField(term31, term31.getClass(), "iYear", null);
        setField(term31, term31.getClass(), "iYearOfEra", null);
        setField(term31, term31.getClass(), "iYearOfCentury", null);
        setField(term31, term31.getClass(), "iCenturyOfEra", null);
        setField(term31, term31.getClass(), "iEra", null);
        setIntField(term31, term31.getClass(), "iBaseFlags", 0);
        term48 = newInstance(Class.forName("org.joda.time.Instant"));
        setLongField(term48, term48.getClass(), "iMillis", 1790192410593L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.chrono.JulianChronology");
        argTypes[1] = Class.forName("org.joda.time.chrono.GregorianChronology");
        argTypes[2] = Class.forName("org.joda.time.Instant");
        Object[] args = new Object[3];
        args[0] = term11;
        args[1] = term31;
        args[2] = term48;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


