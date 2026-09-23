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

public class ZonedChronology_equals_141452681241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88845;
     Object term89079;

    public ZonedChronology_equals_141452681241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88845 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term88923 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term89001 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term88923, term88923.getClass(), "iBase", term89001);
        setField(term88845, term88845.getClass(), "iBase", term88923);
        term89079 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term89157 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term89235 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term89157, term89157.getClass(), "iBase", term89235);
        setField(term89079, term89079.getClass(), "iBase", term89157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term89079;
        try {
            callMethod(klass, "equals", argTypes, term88845, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


