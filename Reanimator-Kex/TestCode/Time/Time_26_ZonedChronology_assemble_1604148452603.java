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

public class ZonedChronology_assemble_1604148452603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273486;
     Object term273662;

    public ZonedChronology_assemble_1604148452603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273486 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term273562 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term273486, term273486.getClass(), "iParam", term273562);
        term273662 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term273756 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term273872 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term273662, term273662.getClass(), "eras", null);
        setField(term273662, term273662.getClass(), "centuries", null);
        setField(term273662, term273662.getClass(), "years", null);
        setField(term273662, term273662.getClass(), "months", null);
        setField(term273662, term273662.getClass(), "weekyears", null);
        setField(term273662, term273662.getClass(), "weeks", null);
        setField(term273662, term273662.getClass(), "days", null);
        setField(term273662, term273662.getClass(), "halfdays", null);
        setField(term273662, term273662.getClass(), "hours", null);
        setField(term273662, term273662.getClass(), "minutes", null);
        setField(term273662, term273662.getClass(), "seconds", null);
        setField(term273662, term273662.getClass(), "millis", null);
        setField(term273662, term273662.getClass(), "year", null);
        setField(term273662, term273662.getClass(), "yearOfEra", null);
        setField(term273662, term273662.getClass(), "yearOfCentury", null);
        setField(term273662, term273662.getClass(), "centuryOfEra", null);
        setField(term273662, term273662.getClass(), "era", null);
        setField(term273662, term273662.getClass(), "dayOfWeek", null);
        setField(term273662, term273662.getClass(), "dayOfMonth", null);
        setField(term273662, term273662.getClass(), "dayOfYear", null);
        setField(term273662, term273662.getClass(), "monthOfYear", null);
        setField(term273662, term273662.getClass(), "weekOfWeekyear", null);
        setField(term273662, term273662.getClass(), "weekyear", null);
        setField(term273662, term273662.getClass(), "weekyearOfCentury", null);
        setField(term273662, term273662.getClass(), "millisOfSecond", null);
        setField(term273662, term273662.getClass(), "millisOfDay", term273756);
        setField(term273662, term273662.getClass(), "secondOfMinute", null);
        setField(term273662, term273662.getClass(), "secondOfDay", null);
        setField(term273662, term273662.getClass(), "minuteOfHour", null);
        setField(term273662, term273662.getClass(), "minuteOfDay", term273872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term273662;
        try {
            callMethod(klass, "assemble", argTypes, term273486, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


