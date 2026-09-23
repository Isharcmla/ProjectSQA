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

public class ZonedChronology_assemble_1604148452117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40379;
     Object term40479;

    public ZonedChronology_assemble_1604148452117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40379 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term40479 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term40565 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term40479, term40479.getClass(), "eras", null);
        setField(term40479, term40479.getClass(), "centuries", null);
        setField(term40479, term40479.getClass(), "years", null);
        setField(term40479, term40479.getClass(), "months", null);
        setField(term40479, term40479.getClass(), "weekyears", null);
        setField(term40479, term40479.getClass(), "weeks", null);
        setField(term40479, term40479.getClass(), "days", null);
        setField(term40479, term40479.getClass(), "halfdays", null);
        setField(term40479, term40479.getClass(), "hours", null);
        setField(term40479, term40479.getClass(), "minutes", null);
        setField(term40479, term40479.getClass(), "seconds", null);
        setField(term40479, term40479.getClass(), "millis", null);
        setField(term40479, term40479.getClass(), "year", null);
        setField(term40479, term40479.getClass(), "yearOfEra", null);
        setField(term40479, term40479.getClass(), "yearOfCentury", null);
        setField(term40479, term40479.getClass(), "centuryOfEra", null);
        setField(term40479, term40479.getClass(), "era", null);
        setField(term40479, term40479.getClass(), "dayOfWeek", null);
        setField(term40479, term40479.getClass(), "dayOfMonth", null);
        setField(term40479, term40479.getClass(), "dayOfYear", null);
        setField(term40479, term40479.getClass(), "monthOfYear", null);
        setField(term40479, term40479.getClass(), "weekOfWeekyear", null);
        setField(term40479, term40479.getClass(), "weekyear", null);
        setField(term40479, term40479.getClass(), "weekyearOfCentury", null);
        setField(term40479, term40479.getClass(), "millisOfSecond", null);
        setField(term40479, term40479.getClass(), "millisOfDay", null);
        setField(term40479, term40479.getClass(), "secondOfMinute", null);
        setField(term40479, term40479.getClass(), "secondOfDay", null);
        setField(term40479, term40479.getClass(), "minuteOfHour", term40565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term40479;
        try {
            callMethod(klass, "assemble", argTypes, term40379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


