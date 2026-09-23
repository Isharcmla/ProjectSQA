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

public class ZonedChronology_equals_141452681489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220672;
     Object term220828;

    public ZonedChronology_equals_141452681489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220672 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term220867 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term220672, term220672.getClass(), "iBase", term220867);
        setField(term220672, term220672.getClass(), "iParam", null);
        term220828 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term220943 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term220828, term220828.getClass(), "iBase", term220867);
        setField(term220828, term220828.getClass(), "iParam", term220943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term220828;
        try {
            callMethod(klass, "equals", argTypes, term220672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


