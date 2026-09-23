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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227699;
     Object term227877;

    public ZonedChronology_assemble_1604148452505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227699 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term227777 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term227699, term227699.getClass(), "iParam", term227777);
        term227877 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term227971 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term228087 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term227877, term227877.getClass(), "eras", null);
        setField(term227877, term227877.getClass(), "centuries", null);
        setField(term227877, term227877.getClass(), "years", null);
        setField(term227877, term227877.getClass(), "months", null);
        setField(term227877, term227877.getClass(), "weekyears", null);
        setField(term227877, term227877.getClass(), "weeks", null);
        setField(term227877, term227877.getClass(), "days", null);
        setField(term227877, term227877.getClass(), "halfdays", null);
        setField(term227877, term227877.getClass(), "hours", null);
        setField(term227877, term227877.getClass(), "minutes", null);
        setField(term227877, term227877.getClass(), "seconds", null);
        setField(term227877, term227877.getClass(), "millis", null);
        setField(term227877, term227877.getClass(), "year", null);
        setField(term227877, term227877.getClass(), "yearOfEra", null);
        setField(term227877, term227877.getClass(), "yearOfCentury", null);
        setField(term227877, term227877.getClass(), "centuryOfEra", null);
        setField(term227877, term227877.getClass(), "era", null);
        setField(term227877, term227877.getClass(), "dayOfWeek", null);
        setField(term227877, term227877.getClass(), "dayOfMonth", null);
        setField(term227877, term227877.getClass(), "dayOfYear", null);
        setField(term227877, term227877.getClass(), "monthOfYear", null);
        setField(term227877, term227877.getClass(), "weekOfWeekyear", null);
        setField(term227877, term227877.getClass(), "weekyear", null);
        setField(term227877, term227877.getClass(), "weekyearOfCentury", null);
        setField(term227877, term227877.getClass(), "millisOfSecond", null);
        setField(term227877, term227877.getClass(), "millisOfDay", term227971);
        setField(term227877, term227877.getClass(), "secondOfMinute", null);
        setField(term227877, term227877.getClass(), "secondOfDay", null);
        setField(term227877, term227877.getClass(), "minuteOfHour", null);
        setField(term227877, term227877.getClass(), "minuteOfDay", term228087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term227877;
        try {
            callMethod(klass, "assemble", argTypes, term227699, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


