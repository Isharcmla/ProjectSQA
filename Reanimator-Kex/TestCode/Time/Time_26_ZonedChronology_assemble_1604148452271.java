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

public class ZonedChronology_assemble_1604148452271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101111;
     Object term101211;
     Object term101353;
     Object term101354;

    public ZonedChronology_assemble_1604148452271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101111 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term101211 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term101305 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        setField(term101211, term101211.getClass(), "eras", null);
        setField(term101211, term101211.getClass(), "centuries", null);
        setField(term101211, term101211.getClass(), "years", null);
        setField(term101211, term101211.getClass(), "months", null);
        setField(term101211, term101211.getClass(), "weekyears", null);
        setField(term101211, term101211.getClass(), "weeks", null);
        setField(term101211, term101211.getClass(), "days", null);
        setField(term101211, term101211.getClass(), "halfdays", null);
        setField(term101211, term101211.getClass(), "hours", null);
        setField(term101211, term101211.getClass(), "minutes", null);
        setField(term101211, term101211.getClass(), "seconds", null);
        setField(term101211, term101211.getClass(), "millis", null);
        setField(term101211, term101211.getClass(), "year", null);
        setField(term101211, term101211.getClass(), "yearOfEra", null);
        setField(term101211, term101211.getClass(), "yearOfCentury", null);
        setField(term101211, term101211.getClass(), "centuryOfEra", null);
        setField(term101211, term101211.getClass(), "era", null);
        setField(term101211, term101211.getClass(), "dayOfWeek", null);
        setField(term101211, term101211.getClass(), "dayOfMonth", null);
        setField(term101211, term101211.getClass(), "dayOfYear", null);
        setField(term101211, term101211.getClass(), "monthOfYear", null);
        setField(term101211, term101211.getClass(), "weekOfWeekyear", null);
        setField(term101211, term101211.getClass(), "weekyear", null);
        setField(term101211, term101211.getClass(), "weekyearOfCentury", null);
        setField(term101211, term101211.getClass(), "millisOfSecond", null);
        setField(term101211, term101211.getClass(), "millisOfDay", term101305);
        term101353 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term101353, term101353.getClass(), "iBase", null);
        setField(term101353, term101353.getClass(), "iParam", null);
        setField(term101353, term101353.getClass(), "iMillis", null);
        setField(term101353, term101353.getClass(), "iSeconds", null);
        setField(term101353, term101353.getClass(), "iMinutes", null);
        setField(term101353, term101353.getClass(), "iHours", null);
        setField(term101353, term101353.getClass(), "iHalfdays", null);
        setField(term101353, term101353.getClass(), "iDays", null);
        setField(term101353, term101353.getClass(), "iWeeks", null);
        setField(term101353, term101353.getClass(), "iWeekyears", null);
        setField(term101353, term101353.getClass(), "iMonths", null);
        setField(term101353, term101353.getClass(), "iYears", null);
        setField(term101353, term101353.getClass(), "iCenturies", null);
        setField(term101353, term101353.getClass(), "iEras", null);
        setField(term101353, term101353.getClass(), "iMillisOfSecond", null);
        setField(term101353, term101353.getClass(), "iMillisOfDay", null);
        setField(term101353, term101353.getClass(), "iSecondOfMinute", null);
        setField(term101353, term101353.getClass(), "iSecondOfDay", null);
        setField(term101353, term101353.getClass(), "iMinuteOfHour", null);
        setField(term101353, term101353.getClass(), "iMinuteOfDay", null);
        setField(term101353, term101353.getClass(), "iHourOfDay", null);
        setField(term101353, term101353.getClass(), "iClockhourOfDay", null);
        setField(term101353, term101353.getClass(), "iHourOfHalfday", null);
        setField(term101353, term101353.getClass(), "iClockhourOfHalfday", null);
        setField(term101353, term101353.getClass(), "iHalfdayOfDay", null);
        setField(term101353, term101353.getClass(), "iDayOfWeek", null);
        setField(term101353, term101353.getClass(), "iDayOfMonth", null);
        setField(term101353, term101353.getClass(), "iDayOfYear", null);
        setField(term101353, term101353.getClass(), "iWeekOfWeekyear", null);
        setField(term101353, term101353.getClass(), "iWeekyear", null);
        setField(term101353, term101353.getClass(), "iWeekyearOfCentury", null);
        setField(term101353, term101353.getClass(), "iMonthOfYear", null);
        setField(term101353, term101353.getClass(), "iYear", null);
        setField(term101353, term101353.getClass(), "iYearOfEra", null);
        setField(term101353, term101353.getClass(), "iYearOfCentury", null);
        setField(term101353, term101353.getClass(), "iCenturyOfEra", null);
        setField(term101353, term101353.getClass(), "iEra", null);
        setIntField(term101353, term101353.getClass(), "iBaseFlags", 0);
        term101354 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term101355 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        setField(term101354, term101354.getClass(), "millis", null);
        setField(term101354, term101354.getClass(), "seconds", null);
        setField(term101354, term101354.getClass(), "minutes", null);
        setField(term101354, term101354.getClass(), "hours", null);
        setField(term101354, term101354.getClass(), "halfdays", null);
        setField(term101354, term101354.getClass(), "days", null);
        setField(term101354, term101354.getClass(), "weeks", null);
        setField(term101354, term101354.getClass(), "weekyears", null);
        setField(term101354, term101354.getClass(), "months", null);
        setField(term101354, term101354.getClass(), "years", null);
        setField(term101354, term101354.getClass(), "centuries", null);
        setField(term101354, term101354.getClass(), "eras", null);
        setField(term101354, term101354.getClass(), "millisOfSecond", null);
        setField(term101355, term101355.getClass(), "iType", null);
        setField(term101355, term101355.getClass(), "iDurationField", null);
        setField(term101354, term101354.getClass(), "millisOfDay", term101355);
        setField(term101354, term101354.getClass(), "secondOfMinute", null);
        setField(term101354, term101354.getClass(), "secondOfDay", null);
        setField(term101354, term101354.getClass(), "minuteOfHour", null);
        setField(term101354, term101354.getClass(), "minuteOfDay", null);
        setField(term101354, term101354.getClass(), "hourOfDay", null);
        setField(term101354, term101354.getClass(), "clockhourOfDay", null);
        setField(term101354, term101354.getClass(), "hourOfHalfday", null);
        setField(term101354, term101354.getClass(), "clockhourOfHalfday", null);
        setField(term101354, term101354.getClass(), "halfdayOfDay", null);
        setField(term101354, term101354.getClass(), "dayOfWeek", null);
        setField(term101354, term101354.getClass(), "dayOfMonth", null);
        setField(term101354, term101354.getClass(), "dayOfYear", null);
        setField(term101354, term101354.getClass(), "weekOfWeekyear", null);
        setField(term101354, term101354.getClass(), "weekyear", null);
        setField(term101354, term101354.getClass(), "weekyearOfCentury", null);
        setField(term101354, term101354.getClass(), "monthOfYear", null);
        setField(term101354, term101354.getClass(), "year", null);
        setField(term101354, term101354.getClass(), "yearOfEra", null);
        setField(term101354, term101354.getClass(), "yearOfCentury", null);
        setField(term101354, term101354.getClass(), "centuryOfEra", null);
        setField(term101354, term101354.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term101211;
        callMethod(klass, "assemble", argTypes, term101111, args);
        assertTrue(recursiveEquals(term101111, term101353));
        assertTrue(recursiveEquals(term101211, term101354));
    }

};


