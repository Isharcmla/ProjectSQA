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

public class ZonedChronology_equals_14145268181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23242;
     Object term23398;

    public ZonedChronology_equals_14145268181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23242 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term23320 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term23242, term23242.getClass(), "iBase", term23320);
        term23398 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term23476 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term23398, term23398.getClass(), "iBase", term23476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23398;
        try {
            callMethod(klass, "equals", argTypes, term23242, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


