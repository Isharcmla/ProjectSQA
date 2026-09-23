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

public class ZonedChronology_assemble_1604148452328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119287;
     Object term119387;

    public ZonedChronology_assemble_1604148452328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119287 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term119287, term119287.getClass(), "iParam", term119287);
        term119387 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term119473 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        setField(term119387, term119387.getClass(), "eras", null);
        setField(term119387, term119387.getClass(), "centuries", null);
        setField(term119387, term119387.getClass(), "years", null);
        setField(term119387, term119387.getClass(), "months", null);
        setField(term119387, term119387.getClass(), "weekyears", null);
        setField(term119387, term119387.getClass(), "weeks", null);
        setField(term119387, term119387.getClass(), "days", null);
        setField(term119387, term119387.getClass(), "halfdays", null);
        setField(term119387, term119387.getClass(), "hours", null);
        setField(term119387, term119387.getClass(), "minutes", null);
        setField(term119387, term119387.getClass(), "seconds", null);
        setField(term119387, term119387.getClass(), "millis", null);
        setField(term119387, term119387.getClass(), "year", null);
        setField(term119387, term119387.getClass(), "yearOfEra", null);
        setField(term119387, term119387.getClass(), "yearOfCentury", null);
        setField(term119387, term119387.getClass(), "centuryOfEra", null);
        setField(term119387, term119387.getClass(), "era", null);
        setField(term119387, term119387.getClass(), "dayOfWeek", null);
        setField(term119387, term119387.getClass(), "dayOfMonth", null);
        setField(term119387, term119387.getClass(), "dayOfYear", null);
        setField(term119387, term119387.getClass(), "monthOfYear", null);
        setField(term119387, term119387.getClass(), "weekOfWeekyear", null);
        setField(term119387, term119387.getClass(), "weekyear", null);
        setField(term119387, term119387.getClass(), "weekyearOfCentury", null);
        setField(term119387, term119387.getClass(), "millisOfSecond", null);
        setField(term119387, term119387.getClass(), "millisOfDay", null);
        setField(term119387, term119387.getClass(), "secondOfMinute", term119473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term119387;
        try {
            callMethod(klass, "assemble", argTypes, term119287, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


