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

public class ZonedChronology_assemble_160414845226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term59;
     Object term7994;
     Object term7996;

    public ZonedChronology_assemble_160414845226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term57 = newInstance(Class.forName("java.lang.Object"));
        setField(term56, term56.getClass(), "iBase", null);
        setField(term56, term56.getClass(), "iParam", term57);
        setField(term56, term56.getClass(), "iMillis", null);
        setField(term56, term56.getClass(), "iSeconds", null);
        setField(term56, term56.getClass(), "iMinutes", null);
        setField(term56, term56.getClass(), "iHours", null);
        setField(term56, term56.getClass(), "iHalfdays", null);
        setField(term56, term56.getClass(), "iDays", null);
        setField(term56, term56.getClass(), "iWeeks", null);
        setField(term56, term56.getClass(), "iWeekyears", null);
        setField(term56, term56.getClass(), "iMonths", null);
        setField(term56, term56.getClass(), "iYears", null);
        setField(term56, term56.getClass(), "iCenturies", null);
        setField(term56, term56.getClass(), "iEras", null);
        setField(term56, term56.getClass(), "iMillisOfSecond", null);
        setField(term56, term56.getClass(), "iMillisOfDay", null);
        setField(term56, term56.getClass(), "iSecondOfMinute", null);
        setField(term56, term56.getClass(), "iSecondOfDay", null);
        setField(term56, term56.getClass(), "iMinuteOfHour", null);
        setField(term56, term56.getClass(), "iMinuteOfDay", null);
        setField(term56, term56.getClass(), "iHourOfDay", null);
        setField(term56, term56.getClass(), "iClockhourOfDay", null);
        setField(term56, term56.getClass(), "iHourOfHalfday", null);
        setField(term56, term56.getClass(), "iClockhourOfHalfday", null);
        setField(term56, term56.getClass(), "iHalfdayOfDay", null);
        setField(term56, term56.getClass(), "iDayOfWeek", null);
        setField(term56, term56.getClass(), "iDayOfMonth", null);
        setField(term56, term56.getClass(), "iDayOfYear", null);
        setField(term56, term56.getClass(), "iWeekOfWeekyear", null);
        setField(term56, term56.getClass(), "iWeekyear", null);
        setField(term56, term56.getClass(), "iWeekyearOfCentury", null);
        setField(term56, term56.getClass(), "iMonthOfYear", null);
        setField(term56, term56.getClass(), "iYear", null);
        setField(term56, term56.getClass(), "iYearOfEra", null);
        setField(term56, term56.getClass(), "iYearOfCentury", null);
        setField(term56, term56.getClass(), "iCenturyOfEra", null);
        setField(term56, term56.getClass(), "iEra", null);
        setIntField(term56, term56.getClass(), "iBaseFlags", 0);
        term59 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        setField(term59, term59.getClass(), "millis", null);
        setField(term59, term59.getClass(), "seconds", null);
        setField(term59, term59.getClass(), "minutes", null);
        setField(term59, term59.getClass(), "hours", null);
        setField(term59, term59.getClass(), "halfdays", null);
        setField(term59, term59.getClass(), "days", null);
        setField(term59, term59.getClass(), "weeks", null);
        setField(term59, term59.getClass(), "weekyears", null);
        setField(term59, term59.getClass(), "months", null);
        setField(term59, term59.getClass(), "years", null);
        setField(term59, term59.getClass(), "centuries", null);
        setField(term59, term59.getClass(), "eras", null);
        setField(term59, term59.getClass(), "millisOfSecond", null);
        setField(term59, term59.getClass(), "millisOfDay", null);
        setField(term59, term59.getClass(), "secondOfMinute", null);
        setField(term59, term59.getClass(), "secondOfDay", null);
        setField(term59, term59.getClass(), "minuteOfHour", null);
        setField(term59, term59.getClass(), "minuteOfDay", null);
        setField(term59, term59.getClass(), "hourOfDay", null);
        setField(term59, term59.getClass(), "clockhourOfDay", null);
        setField(term59, term59.getClass(), "hourOfHalfday", null);
        setField(term59, term59.getClass(), "clockhourOfHalfday", null);
        setField(term59, term59.getClass(), "halfdayOfDay", null);
        setField(term59, term59.getClass(), "dayOfWeek", null);
        setField(term59, term59.getClass(), "dayOfMonth", null);
        setField(term59, term59.getClass(), "dayOfYear", null);
        setField(term59, term59.getClass(), "weekOfWeekyear", null);
        setField(term59, term59.getClass(), "weekyear", null);
        setField(term59, term59.getClass(), "weekyearOfCentury", null);
        setField(term59, term59.getClass(), "monthOfYear", null);
        setField(term59, term59.getClass(), "year", null);
        setField(term59, term59.getClass(), "yearOfEra", null);
        setField(term59, term59.getClass(), "yearOfCentury", null);
        setField(term59, term59.getClass(), "centuryOfEra", null);
        setField(term59, term59.getClass(), "era", null);
        term7994 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term7995 = newInstance(Class.forName("java.lang.Object"));
        setField(term7994, term7994.getClass(), "iBase", null);
        setField(term7994, term7994.getClass(), "iParam", term7995);
        setField(term7994, term7994.getClass(), "iMillis", null);
        setField(term7994, term7994.getClass(), "iSeconds", null);
        setField(term7994, term7994.getClass(), "iMinutes", null);
        setField(term7994, term7994.getClass(), "iHours", null);
        setField(term7994, term7994.getClass(), "iHalfdays", null);
        setField(term7994, term7994.getClass(), "iDays", null);
        setField(term7994, term7994.getClass(), "iWeeks", null);
        setField(term7994, term7994.getClass(), "iWeekyears", null);
        setField(term7994, term7994.getClass(), "iMonths", null);
        setField(term7994, term7994.getClass(), "iYears", null);
        setField(term7994, term7994.getClass(), "iCenturies", null);
        setField(term7994, term7994.getClass(), "iEras", null);
        setField(term7994, term7994.getClass(), "iMillisOfSecond", null);
        setField(term7994, term7994.getClass(), "iMillisOfDay", null);
        setField(term7994, term7994.getClass(), "iSecondOfMinute", null);
        setField(term7994, term7994.getClass(), "iSecondOfDay", null);
        setField(term7994, term7994.getClass(), "iMinuteOfHour", null);
        setField(term7994, term7994.getClass(), "iMinuteOfDay", null);
        setField(term7994, term7994.getClass(), "iHourOfDay", null);
        setField(term7994, term7994.getClass(), "iClockhourOfDay", null);
        setField(term7994, term7994.getClass(), "iHourOfHalfday", null);
        setField(term7994, term7994.getClass(), "iClockhourOfHalfday", null);
        setField(term7994, term7994.getClass(), "iHalfdayOfDay", null);
        setField(term7994, term7994.getClass(), "iDayOfWeek", null);
        setField(term7994, term7994.getClass(), "iDayOfMonth", null);
        setField(term7994, term7994.getClass(), "iDayOfYear", null);
        setField(term7994, term7994.getClass(), "iWeekOfWeekyear", null);
        setField(term7994, term7994.getClass(), "iWeekyear", null);
        setField(term7994, term7994.getClass(), "iWeekyearOfCentury", null);
        setField(term7994, term7994.getClass(), "iMonthOfYear", null);
        setField(term7994, term7994.getClass(), "iYear", null);
        setField(term7994, term7994.getClass(), "iYearOfEra", null);
        setField(term7994, term7994.getClass(), "iYearOfCentury", null);
        setField(term7994, term7994.getClass(), "iCenturyOfEra", null);
        setField(term7994, term7994.getClass(), "iEra", null);
        setIntField(term7994, term7994.getClass(), "iBaseFlags", 0);
        term7996 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        setField(term7996, term7996.getClass(), "millis", null);
        setField(term7996, term7996.getClass(), "seconds", null);
        setField(term7996, term7996.getClass(), "minutes", null);
        setField(term7996, term7996.getClass(), "hours", null);
        setField(term7996, term7996.getClass(), "halfdays", null);
        setField(term7996, term7996.getClass(), "days", null);
        setField(term7996, term7996.getClass(), "weeks", null);
        setField(term7996, term7996.getClass(), "weekyears", null);
        setField(term7996, term7996.getClass(), "months", null);
        setField(term7996, term7996.getClass(), "years", null);
        setField(term7996, term7996.getClass(), "centuries", null);
        setField(term7996, term7996.getClass(), "eras", null);
        setField(term7996, term7996.getClass(), "millisOfSecond", null);
        setField(term7996, term7996.getClass(), "millisOfDay", null);
        setField(term7996, term7996.getClass(), "secondOfMinute", null);
        setField(term7996, term7996.getClass(), "secondOfDay", null);
        setField(term7996, term7996.getClass(), "minuteOfHour", null);
        setField(term7996, term7996.getClass(), "minuteOfDay", null);
        setField(term7996, term7996.getClass(), "hourOfDay", null);
        setField(term7996, term7996.getClass(), "clockhourOfDay", null);
        setField(term7996, term7996.getClass(), "hourOfHalfday", null);
        setField(term7996, term7996.getClass(), "clockhourOfHalfday", null);
        setField(term7996, term7996.getClass(), "halfdayOfDay", null);
        setField(term7996, term7996.getClass(), "dayOfWeek", null);
        setField(term7996, term7996.getClass(), "dayOfMonth", null);
        setField(term7996, term7996.getClass(), "dayOfYear", null);
        setField(term7996, term7996.getClass(), "weekOfWeekyear", null);
        setField(term7996, term7996.getClass(), "weekyear", null);
        setField(term7996, term7996.getClass(), "weekyearOfCentury", null);
        setField(term7996, term7996.getClass(), "monthOfYear", null);
        setField(term7996, term7996.getClass(), "year", null);
        setField(term7996, term7996.getClass(), "yearOfEra", null);
        setField(term7996, term7996.getClass(), "yearOfCentury", null);
        setField(term7996, term7996.getClass(), "centuryOfEra", null);
        setField(term7996, term7996.getClass(), "era", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "assemble", argTypes, term56, args);
        assertTrue(recursiveEquals(term56, term7994));
        assertTrue(recursiveEquals(term59, term7996));
    }

};


