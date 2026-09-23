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

public class ZonedChronology_equals_141452681481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216360;
     Object term216828;

    public ZonedChronology_equals_141452681481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216360 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term216438 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term216516 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term216594 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term216672 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term216750 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term216672, term216672.getClass(), "iBase", term216750);
        setField(term216594, term216594.getClass(), "iBase", term216672);
        setField(term216516, term216516.getClass(), "iBase", term216594);
        setField(term216438, term216438.getClass(), "iBase", term216516);
        setField(term216360, term216360.getClass(), "iBase", term216438);
        term216828 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term216906 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term216984 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term217062 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term217140 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term217140, term217140.getClass(), "iBase", term216906);
        setField(term217062, term217062.getClass(), "iBase", term217140);
        setField(term216984, term216984.getClass(), "iBase", term217062);
        setField(term216906, term216906.getClass(), "iBase", term216984);
        setField(term216828, term216828.getClass(), "iBase", term216906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term216828;
        try {
            callMethod(klass, "equals", argTypes, term216360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


