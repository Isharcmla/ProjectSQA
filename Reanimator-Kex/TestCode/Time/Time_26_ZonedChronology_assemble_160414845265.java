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

public class ZonedChronology_assemble_160414845265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18051;
     Object term18151;

    public ZonedChronology_assemble_160414845265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18051 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term18151 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term18231 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term18151, term18151.getClass(), "eras", null);
        setField(term18151, term18151.getClass(), "centuries", null);
        setField(term18151, term18151.getClass(), "years", null);
        setField(term18151, term18151.getClass(), "months", null);
        setField(term18151, term18151.getClass(), "weekyears", null);
        setField(term18151, term18151.getClass(), "weeks", null);
        setField(term18151, term18151.getClass(), "days", null);
        setField(term18151, term18151.getClass(), "halfdays", null);
        setField(term18151, term18151.getClass(), "hours", null);
        setField(term18151, term18151.getClass(), "minutes", null);
        setField(term18151, term18151.getClass(), "seconds", null);
        setField(term18151, term18151.getClass(), "millis", null);
        setField(term18151, term18151.getClass(), "year", null);
        setField(term18151, term18151.getClass(), "yearOfEra", null);
        setField(term18151, term18151.getClass(), "yearOfCentury", null);
        setField(term18151, term18151.getClass(), "centuryOfEra", null);
        setField(term18151, term18151.getClass(), "era", null);
        setField(term18151, term18151.getClass(), "dayOfWeek", null);
        setField(term18151, term18151.getClass(), "dayOfMonth", term18231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term18151;
        try {
            callMethod(klass, "assemble", argTypes, term18051, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


