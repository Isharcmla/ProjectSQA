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

public class ZonedChronology_assemble_1604148452413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180313;
     Object term180413;

    public ZonedChronology_assemble_1604148452413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180313 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term180313, term180313.getClass(), "iParam", null);
        term180413 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term180507 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term180593 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term180683 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term180413, term180413.getClass(), "eras", null);
        setField(term180413, term180413.getClass(), "centuries", null);
        setField(term180413, term180413.getClass(), "years", null);
        setField(term180413, term180413.getClass(), "months", null);
        setField(term180413, term180413.getClass(), "weekyears", null);
        setField(term180413, term180413.getClass(), "weeks", null);
        setField(term180413, term180413.getClass(), "days", null);
        setField(term180413, term180413.getClass(), "halfdays", null);
        setField(term180413, term180413.getClass(), "hours", null);
        setField(term180413, term180413.getClass(), "minutes", null);
        setField(term180413, term180413.getClass(), "seconds", null);
        setField(term180413, term180413.getClass(), "millis", null);
        setField(term180413, term180413.getClass(), "year", null);
        setField(term180413, term180413.getClass(), "yearOfEra", null);
        setField(term180413, term180413.getClass(), "yearOfCentury", null);
        setField(term180413, term180413.getClass(), "centuryOfEra", null);
        setField(term180413, term180413.getClass(), "era", null);
        setField(term180413, term180413.getClass(), "dayOfWeek", null);
        setField(term180413, term180413.getClass(), "dayOfMonth", null);
        setField(term180413, term180413.getClass(), "dayOfYear", null);
        setField(term180413, term180413.getClass(), "monthOfYear", null);
        setField(term180413, term180413.getClass(), "weekOfWeekyear", null);
        setField(term180413, term180413.getClass(), "weekyear", null);
        setField(term180413, term180413.getClass(), "weekyearOfCentury", null);
        setField(term180413, term180413.getClass(), "millisOfSecond", null);
        setField(term180413, term180413.getClass(), "millisOfDay", term180507);
        setField(term180413, term180413.getClass(), "secondOfMinute", null);
        setField(term180413, term180413.getClass(), "secondOfDay", null);
        setField(term180413, term180413.getClass(), "minuteOfHour", null);
        setField(term180413, term180413.getClass(), "minuteOfDay", null);
        setField(term180593, term180593.getClass(), "iUnitField", null);
        setField(term180593, term180593.getClass(), "iRangeField", term180683);
        setField(term180413, term180413.getClass(), "hourOfDay", term180593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term180413;
        try {
            callMethod(klass, "assemble", argTypes, term180313, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


