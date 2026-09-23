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

public class GJChronology_init_158390597035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term64;
     Object term81;

    public GJChronology_init_158390597035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term51 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 3);
        Object term52 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term55 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term58 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term62 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term52, term52.getClass(), "iYear", -883034806);
        setLongField(term52, term52.getClass(), "iFirstDayMillis", -4325723315152823407L);
        setElement(term51, 0, term52);
        setIntField(term55, term55.getClass(), "iYear", 1585847225);
        setLongField(term55, term55.getClass(), "iFirstDayMillis", 2535595959091595249L);
        setElement(term51, 1, term55);
        setIntField(term58, term58.getClass(), "iYear", 597278769);
        setLongField(term58, term58.getClass(), "iFirstDayMillis", -5476826692763582090L);
        setElement(term51, 2, term58);
        setField(term50, term50.getClass(), "iYearInfoCache", term51);
        setIntField(term50, term50.getClass(), "iMinDaysInFirstWeek", -1685132342);
        setField(term50, term50.getClass(), "iBase", null);
        setField(term50, term50.getClass(), "iParam", term62);
        setField(term50, term50.getClass(), "iMillis", null);
        setField(term50, term50.getClass(), "iSeconds", null);
        setField(term50, term50.getClass(), "iMinutes", null);
        setField(term50, term50.getClass(), "iHours", null);
        setField(term50, term50.getClass(), "iHalfdays", null);
        setField(term50, term50.getClass(), "iDays", null);
        setField(term50, term50.getClass(), "iWeeks", null);
        setField(term50, term50.getClass(), "iWeekyears", null);
        setField(term50, term50.getClass(), "iMonths", null);
        setField(term50, term50.getClass(), "iYears", null);
        setField(term50, term50.getClass(), "iCenturies", null);
        setField(term50, term50.getClass(), "iEras", null);
        setField(term50, term50.getClass(), "iMillisOfSecond", null);
        setField(term50, term50.getClass(), "iMillisOfDay", null);
        setField(term50, term50.getClass(), "iSecondOfMinute", null);
        setField(term50, term50.getClass(), "iSecondOfDay", null);
        setField(term50, term50.getClass(), "iMinuteOfHour", null);
        setField(term50, term50.getClass(), "iMinuteOfDay", null);
        setField(term50, term50.getClass(), "iHourOfDay", null);
        setField(term50, term50.getClass(), "iClockhourOfDay", null);
        setField(term50, term50.getClass(), "iHourOfHalfday", null);
        setField(term50, term50.getClass(), "iClockhourOfHalfday", null);
        setField(term50, term50.getClass(), "iHalfdayOfDay", null);
        setField(term50, term50.getClass(), "iDayOfWeek", null);
        setField(term50, term50.getClass(), "iDayOfMonth", null);
        setField(term50, term50.getClass(), "iDayOfYear", null);
        setField(term50, term50.getClass(), "iWeekOfWeekyear", null);
        setField(term50, term50.getClass(), "iWeekyear", null);
        setField(term50, term50.getClass(), "iWeekyearOfCentury", null);
        setField(term50, term50.getClass(), "iMonthOfYear", null);
        setField(term50, term50.getClass(), "iYear", null);
        setField(term50, term50.getClass(), "iYearOfEra", null);
        setField(term50, term50.getClass(), "iYearOfCentury", null);
        setField(term50, term50.getClass(), "iCenturyOfEra", null);
        setField(term50, term50.getClass(), "iEra", null);
        setIntField(term50, term50.getClass(), "iBaseFlags", 0);
        term64 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object[] term65 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 4);
        Object term66 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term69 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term72 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term75 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term79 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term66, term66.getClass(), "iYear", -1456670397);
        setLongField(term66, term66.getClass(), "iFirstDayMillis", -872011222785455006L);
        setElement(term65, 0, term66);
        setIntField(term69, term69.getClass(), "iYear", 1622346318);
        setLongField(term69, term69.getClass(), "iFirstDayMillis", -316468845751588286L);
        setElement(term65, 1, term69);
        setIntField(term72, term72.getClass(), "iYear", 1048535127);
        setLongField(term72, term72.getClass(), "iFirstDayMillis", 5127676408959197577L);
        setElement(term65, 2, term72);
        setIntField(term75, term75.getClass(), "iYear", -655067527);
        setLongField(term75, term75.getClass(), "iFirstDayMillis", -6573104506744284592L);
        setElement(term65, 3, term75);
        setField(term64, term64.getClass(), "iYearInfoCache", term65);
        setIntField(term64, term64.getClass(), "iMinDaysInFirstWeek", -6029667);
        setField(term64, term64.getClass(), "iBase", null);
        setField(term64, term64.getClass(), "iParam", term79);
        setField(term64, term64.getClass(), "iMillis", null);
        setField(term64, term64.getClass(), "iSeconds", null);
        setField(term64, term64.getClass(), "iMinutes", null);
        setField(term64, term64.getClass(), "iHours", null);
        setField(term64, term64.getClass(), "iHalfdays", null);
        setField(term64, term64.getClass(), "iDays", null);
        setField(term64, term64.getClass(), "iWeeks", null);
        setField(term64, term64.getClass(), "iWeekyears", null);
        setField(term64, term64.getClass(), "iMonths", null);
        setField(term64, term64.getClass(), "iYears", null);
        setField(term64, term64.getClass(), "iCenturies", null);
        setField(term64, term64.getClass(), "iEras", null);
        setField(term64, term64.getClass(), "iMillisOfSecond", null);
        setField(term64, term64.getClass(), "iMillisOfDay", null);
        setField(term64, term64.getClass(), "iSecondOfMinute", null);
        setField(term64, term64.getClass(), "iSecondOfDay", null);
        setField(term64, term64.getClass(), "iMinuteOfHour", null);
        setField(term64, term64.getClass(), "iMinuteOfDay", null);
        setField(term64, term64.getClass(), "iHourOfDay", null);
        setField(term64, term64.getClass(), "iClockhourOfDay", null);
        setField(term64, term64.getClass(), "iHourOfHalfday", null);
        setField(term64, term64.getClass(), "iClockhourOfHalfday", null);
        setField(term64, term64.getClass(), "iHalfdayOfDay", null);
        setField(term64, term64.getClass(), "iDayOfWeek", null);
        setField(term64, term64.getClass(), "iDayOfMonth", null);
        setField(term64, term64.getClass(), "iDayOfYear", null);
        setField(term64, term64.getClass(), "iWeekOfWeekyear", null);
        setField(term64, term64.getClass(), "iWeekyear", null);
        setField(term64, term64.getClass(), "iWeekyearOfCentury", null);
        setField(term64, term64.getClass(), "iMonthOfYear", null);
        setField(term64, term64.getClass(), "iYear", null);
        setField(term64, term64.getClass(), "iYearOfEra", null);
        setField(term64, term64.getClass(), "iYearOfCentury", null);
        setField(term64, term64.getClass(), "iCenturyOfEra", null);
        setField(term64, term64.getClass(), "iEra", null);
        setIntField(term64, term64.getClass(), "iBaseFlags", 0);
        term81 = newInstance(Class.forName("org.joda.time.Instant"));
        setLongField(term81, term81.getClass(), "iMillis", 1790195838586L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        argTypes[1] = Class.forName("org.joda.time.chrono.JulianChronology");
        argTypes[2] = Class.forName("org.joda.time.chrono.GregorianChronology");
        argTypes[3] = Class.forName("org.joda.time.Instant");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term50;
        args[2] = term64;
        args[3] = term81;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


