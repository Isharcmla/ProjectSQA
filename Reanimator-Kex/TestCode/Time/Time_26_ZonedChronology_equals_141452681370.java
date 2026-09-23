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

public class ZonedChronology_equals_141452681370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138819;
     Object term138975;

    public ZonedChronology_equals_141452681370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138819 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term139092 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term139092, term139092.getClass(), "iBase", term139092);
        setField(term138819, term138819.getClass(), "iBase", term139092);
        term138975 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term139053 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term139053, term139053.getClass(), "iBase", term139092);
        setField(term138975, term138975.getClass(), "iBase", term139053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term138975;
        try {
            callMethod(klass, "equals", argTypes, term138819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


