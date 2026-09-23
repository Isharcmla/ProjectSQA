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

public class ZonedChronology_assemble_160414845267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18369;
     Object term18469;

    public ZonedChronology_assemble_160414845267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18369 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term18469 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term18571 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term18469, term18469.getClass(), "eras", null);
        setField(term18469, term18469.getClass(), "centuries", null);
        setField(term18469, term18469.getClass(), "years", null);
        setField(term18469, term18469.getClass(), "months", null);
        setField(term18469, term18469.getClass(), "weekyears", null);
        setField(term18469, term18469.getClass(), "weeks", null);
        setField(term18469, term18469.getClass(), "days", null);
        setField(term18469, term18469.getClass(), "halfdays", null);
        setField(term18469, term18469.getClass(), "hours", null);
        setField(term18469, term18469.getClass(), "minutes", null);
        setField(term18469, term18469.getClass(), "seconds", null);
        setField(term18469, term18469.getClass(), "millis", null);
        setField(term18469, term18469.getClass(), "year", null);
        setField(term18469, term18469.getClass(), "yearOfEra", null);
        setField(term18469, term18469.getClass(), "yearOfCentury", null);
        setField(term18469, term18469.getClass(), "centuryOfEra", null);
        setField(term18469, term18469.getClass(), "era", null);
        setField(term18469, term18469.getClass(), "dayOfWeek", null);
        setField(term18469, term18469.getClass(), "dayOfMonth", null);
        setField(term18469, term18469.getClass(), "dayOfYear", null);
        setField(term18469, term18469.getClass(), "monthOfYear", term18571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term18469;
        try {
            callMethod(klass, "assemble", argTypes, term18369, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


