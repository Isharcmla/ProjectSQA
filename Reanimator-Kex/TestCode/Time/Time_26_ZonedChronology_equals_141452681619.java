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

public class ZonedChronology_equals_141452681619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280744;
     Object term281212;

    public ZonedChronology_equals_141452681619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280744 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term280822 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term280900 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term280978 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term281056 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term281251 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term281251, term281251.getClass(), "iBase", term281251);
        setField(term281056, term281056.getClass(), "iBase", term281251);
        setField(term280978, term280978.getClass(), "iBase", term281056);
        setField(term280900, term280900.getClass(), "iBase", term280978);
        setField(term280822, term280822.getClass(), "iBase", term280900);
        setField(term280744, term280744.getClass(), "iBase", term280822);
        term281212 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term281212, term281212.getClass(), "iBase", term281251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term281212;
        try {
            callMethod(klass, "equals", argTypes, term280744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


