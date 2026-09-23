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

public class ZonedChronology_equals_141452681415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181098;
     Object term181410;

    public ZonedChronology_equals_141452681415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181098 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term181176 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term181527 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term181332 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        setField(term181176, term181176.getClass(), "iBase", term181527);
        setField(term181176, term181176.getClass(), "iParam", term181332);
        setField(term181098, term181098.getClass(), "iBase", term181176);
        term181410 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term181488 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term181488, term181488.getClass(), "iBase", term181527);
        setField(term181410, term181410.getClass(), "iBase", term181488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term181410;
        try {
            callMethod(klass, "equals", argTypes, term181098, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


