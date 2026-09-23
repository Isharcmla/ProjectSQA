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

public class ZonedChronology_equals_141452681365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136526;
     Object term136760;

    public ZonedChronology_equals_141452681365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136526 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term136604 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term136955 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term136955, term136955.getClass(), "iBase", term136955);
        setField(term136604, term136604.getClass(), "iBase", term136955);
        setField(term136526, term136526.getClass(), "iBase", term136604);
        term136760 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term136838 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term136916 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term136916, term136916.getClass(), "iBase", term136955);
        setField(term136838, term136838.getClass(), "iBase", term136916);
        setField(term136760, term136760.getClass(), "iBase", term136838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term136760;
        try {
            callMethod(klass, "equals", argTypes, term136526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


