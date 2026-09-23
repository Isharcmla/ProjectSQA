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

public class GJChronology_assemble_154044297747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;
     Object term409;

    public GJChronology_assemble_154044297747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term393 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term394 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        Object term395 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term399 = newInstance(Class.forName("java.lang.Object"));
        Object term401 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term404 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term395, term395.getClass(), "iYear", 1114000454);
        setLongField(term395, term395.getClass(), "iFirstDayMillis", 2701184207686293431L);
        setElement(term394, 0, term395);
        setField(term393, term393.getClass(), "iYearInfoCache", term394);
        setIntField(term393, term393.getClass(), "iMinDaysInFirstWeek", -556405712);
        setField(term393, term393.getClass(), "iBase", null);
        setField(term393, term393.getClass(), "iParam", term399);
        setField(term393, term393.getClass(), "iMillis", null);
        setField(term393, term393.getClass(), "iSeconds", null);
        setField(term393, term393.getClass(), "iMinutes", null);
        setField(term393, term393.getClass(), "iHours", null);
        setField(term393, term393.getClass(), "iHalfdays", null);
        setField(term393, term393.getClass(), "iDays", null);
        setField(term393, term393.getClass(), "iWeeks", null);
        setField(term393, term393.getClass(), "iWeekyears", null);
        setField(term393, term393.getClass(), "iMonths", null);
        setField(term393, term393.getClass(), "iYears", null);
        setField(term393, term393.getClass(), "iCenturies", null);
        setField(term393, term393.getClass(), "iEras", null);
        setField(term393, term393.getClass(), "iMillisOfSecond", null);
        setField(term393, term393.getClass(), "iMillisOfDay", null);
        setField(term393, term393.getClass(), "iSecondOfMinute", null);
        setField(term393, term393.getClass(), "iSecondOfDay", null);
        setField(term393, term393.getClass(), "iMinuteOfHour", null);
        setField(term393, term393.getClass(), "iMinuteOfDay", null);
        setField(term393, term393.getClass(), "iHourOfDay", null);
        setField(term393, term393.getClass(), "iClockhourOfDay", null);
        setField(term393, term393.getClass(), "iHourOfHalfday", null);
        setField(term393, term393.getClass(), "iClockhourOfHalfday", null);
        setField(term393, term393.getClass(), "iHalfdayOfDay", null);
        setField(term393, term393.getClass(), "iDayOfWeek", null);
        setField(term393, term393.getClass(), "iDayOfMonth", null);
        setField(term393, term393.getClass(), "iDayOfYear", null);
        setField(term393, term393.getClass(), "iWeekOfWeekyear", null);
        setField(term393, term393.getClass(), "iWeekyear", null);
        setField(term393, term393.getClass(), "iWeekyearOfCentury", null);
        setField(term393, term393.getClass(), "iMonthOfYear", null);
        setField(term393, term393.getClass(), "iYear", null);
        setField(term393, term393.getClass(), "iYearOfEra", null);
        setField(term393, term393.getClass(), "iYearOfCentury", null);
        setField(term393, term393.getClass(), "iCenturyOfEra", null);
        setField(term393, term393.getClass(), "iEra", null);
        setIntField(term393, term393.getClass(), "iBaseFlags", 0);
        setField(term392, term392.getClass(), "iJulianChronology", term393);
        setField(term401, term401.getClass(), "iYearInfoCache", null);
        setIntField(term401, term401.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term401, term401.getClass(), "iBase", null);
        setField(term401, term401.getClass(), "iParam", null);
        setField(term401, term401.getClass(), "iMillis", null);
        setField(term401, term401.getClass(), "iSeconds", null);
        setField(term401, term401.getClass(), "iMinutes", null);
        setField(term401, term401.getClass(), "iHours", null);
        setField(term401, term401.getClass(), "iHalfdays", null);
        setField(term401, term401.getClass(), "iDays", null);
        setField(term401, term401.getClass(), "iWeeks", null);
        setField(term401, term401.getClass(), "iWeekyears", null);
        setField(term401, term401.getClass(), "iMonths", null);
        setField(term401, term401.getClass(), "iYears", null);
        setField(term401, term401.getClass(), "iCenturies", null);
        setField(term401, term401.getClass(), "iEras", null);
        setField(term401, term401.getClass(), "iMillisOfSecond", null);
        setField(term401, term401.getClass(), "iMillisOfDay", null);
        setField(term401, term401.getClass(), "iSecondOfMinute", null);
        setField(term401, term401.getClass(), "iSecondOfDay", null);
        setField(term401, term401.getClass(), "iMinuteOfHour", null);
        setField(term401, term401.getClass(), "iMinuteOfDay", null);
        setField(term401, term401.getClass(), "iHourOfDay", null);
        setField(term401, term401.getClass(), "iClockhourOfDay", null);
        setField(term401, term401.getClass(), "iHourOfHalfday", null);
        setField(term401, term401.getClass(), "iClockhourOfHalfday", null);
        setField(term401, term401.getClass(), "iHalfdayOfDay", null);
        setField(term401, term401.getClass(), "iDayOfWeek", null);
        setField(term401, term401.getClass(), "iDayOfMonth", null);
        setField(term401, term401.getClass(), "iDayOfYear", null);
        setField(term401, term401.getClass(), "iWeekOfWeekyear", null);
        setField(term401, term401.getClass(), "iWeekyear", null);
        setField(term401, term401.getClass(), "iWeekyearOfCentury", null);
        setField(term401, term401.getClass(), "iMonthOfYear", null);
        setField(term401, term401.getClass(), "iYear", null);
        setField(term401, term401.getClass(), "iYearOfEra", null);
        setField(term401, term401.getClass(), "iYearOfCentury", null);
        setField(term401, term401.getClass(), "iCenturyOfEra", null);
        setField(term401, term401.getClass(), "iEra", null);
        setIntField(term401, term401.getClass(), "iBaseFlags", 0);
        setField(term392, term392.getClass(), "iGregorianChronology", term401);
        setLongField(term404, term404.getClass(), "iMillis", 1790195839446L);
        setField(term392, term392.getClass(), "iCutoverInstant", term404);
        setLongField(term392, term392.getClass(), "iCutoverMillis", 4474998035090263139L);
        setLongField(term392, term392.getClass(), "iGapDuration", 2848819812340321742L);
        setField(term392, term392.getClass(), "iBase", null);
        setField(term392, term392.getClass(), "iParam", null);
        setField(term392, term392.getClass(), "iMillis", null);
        setField(term392, term392.getClass(), "iSeconds", null);
        setField(term392, term392.getClass(), "iMinutes", null);
        setField(term392, term392.getClass(), "iHours", null);
        setField(term392, term392.getClass(), "iHalfdays", null);
        setField(term392, term392.getClass(), "iDays", null);
        setField(term392, term392.getClass(), "iWeeks", null);
        setField(term392, term392.getClass(), "iWeekyears", null);
        setField(term392, term392.getClass(), "iMonths", null);
        setField(term392, term392.getClass(), "iYears", null);
        setField(term392, term392.getClass(), "iCenturies", null);
        setField(term392, term392.getClass(), "iEras", null);
        setField(term392, term392.getClass(), "iMillisOfSecond", null);
        setField(term392, term392.getClass(), "iMillisOfDay", null);
        setField(term392, term392.getClass(), "iSecondOfMinute", null);
        setField(term392, term392.getClass(), "iSecondOfDay", null);
        setField(term392, term392.getClass(), "iMinuteOfHour", null);
        setField(term392, term392.getClass(), "iMinuteOfDay", null);
        setField(term392, term392.getClass(), "iHourOfDay", null);
        setField(term392, term392.getClass(), "iClockhourOfDay", null);
        setField(term392, term392.getClass(), "iHourOfHalfday", null);
        setField(term392, term392.getClass(), "iClockhourOfHalfday", null);
        setField(term392, term392.getClass(), "iHalfdayOfDay", null);
        setField(term392, term392.getClass(), "iDayOfWeek", null);
        setField(term392, term392.getClass(), "iDayOfMonth", null);
        setField(term392, term392.getClass(), "iDayOfYear", null);
        setField(term392, term392.getClass(), "iWeekOfWeekyear", null);
        setField(term392, term392.getClass(), "iWeekyear", null);
        setField(term392, term392.getClass(), "iWeekyearOfCentury", null);
        setField(term392, term392.getClass(), "iMonthOfYear", null);
        setField(term392, term392.getClass(), "iYear", null);
        setField(term392, term392.getClass(), "iYearOfEra", null);
        setField(term392, term392.getClass(), "iYearOfCentury", null);
        setField(term392, term392.getClass(), "iCenturyOfEra", null);
        setField(term392, term392.getClass(), "iEra", null);
        setIntField(term392, term392.getClass(), "iBaseFlags", 0);
        term409 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        setField(term409, term409.getClass(), "millis", null);
        setField(term409, term409.getClass(), "seconds", null);
        setField(term409, term409.getClass(), "minutes", null);
        setField(term409, term409.getClass(), "hours", null);
        setField(term409, term409.getClass(), "halfdays", null);
        setField(term409, term409.getClass(), "days", null);
        setField(term409, term409.getClass(), "weeks", null);
        setField(term409, term409.getClass(), "weekyears", null);
        setField(term409, term409.getClass(), "months", null);
        setField(term409, term409.getClass(), "years", null);
        setField(term409, term409.getClass(), "centuries", null);
        setField(term409, term409.getClass(), "eras", null);
        setField(term409, term409.getClass(), "millisOfSecond", null);
        setField(term409, term409.getClass(), "millisOfDay", null);
        setField(term409, term409.getClass(), "secondOfMinute", null);
        setField(term409, term409.getClass(), "secondOfDay", null);
        setField(term409, term409.getClass(), "minuteOfHour", null);
        setField(term409, term409.getClass(), "minuteOfDay", null);
        setField(term409, term409.getClass(), "hourOfDay", null);
        setField(term409, term409.getClass(), "clockhourOfDay", null);
        setField(term409, term409.getClass(), "hourOfHalfday", null);
        setField(term409, term409.getClass(), "clockhourOfHalfday", null);
        setField(term409, term409.getClass(), "halfdayOfDay", null);
        setField(term409, term409.getClass(), "dayOfWeek", null);
        setField(term409, term409.getClass(), "dayOfMonth", null);
        setField(term409, term409.getClass(), "dayOfYear", null);
        setField(term409, term409.getClass(), "weekOfWeekyear", null);
        setField(term409, term409.getClass(), "weekyear", null);
        setField(term409, term409.getClass(), "weekyearOfCentury", null);
        setField(term409, term409.getClass(), "monthOfYear", null);
        setField(term409, term409.getClass(), "year", null);
        setField(term409, term409.getClass(), "yearOfEra", null);
        setField(term409, term409.getClass(), "yearOfCentury", null);
        setField(term409, term409.getClass(), "centuryOfEra", null);
        setField(term409, term409.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term409;
        try {
            callMethod(klass, "assemble", argTypes, term392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


