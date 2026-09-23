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

public class ZonedChronology_equals_141452681523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238705;
     Object term238939;

    public ZonedChronology_equals_141452681523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238705 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term238783 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term239056 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term238783, term238783.getClass(), "iBase", term239056);
        setField(term238783, term238783.getClass(), "iParam", null);
        setField(term238705, term238705.getClass(), "iBase", term238783);
        term238939 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term239017 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term239094 = newInstance(Class.forName("java.lang.Object"));
        setField(term239017, term239017.getClass(), "iBase", term239056);
        setField(term239017, term239017.getClass(), "iParam", term239094);
        setField(term238939, term238939.getClass(), "iBase", term239017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term238939;
        try {
            callMethod(klass, "equals", argTypes, term238705, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


