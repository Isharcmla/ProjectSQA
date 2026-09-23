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

public class ZonedChronology_equals_141452681251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93568;
     Object term93724;

    public ZonedChronology_equals_141452681251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93568 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term93763 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term93568, term93568.getClass(), "iBase", term93763);
        setField(term93568, term93568.getClass(), "iParam", null);
        term93724 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term93801 = newInstance(Class.forName("java.lang.Object"));
        setField(term93724, term93724.getClass(), "iBase", term93763);
        setField(term93724, term93724.getClass(), "iParam", term93801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93724;
        try {
            callMethod(klass, "equals", argTypes, term93568, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


