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

public class ZonedChronology_equals_141452681467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210080;
     Object term210314;

    public ZonedChronology_equals_141452681467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210080 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term210158 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term210353 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term210353, term210353.getClass(), "iBase", term210353);
        setField(term210158, term210158.getClass(), "iBase", term210353);
        setField(term210080, term210080.getClass(), "iBase", term210158);
        term210314 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term210314, term210314.getClass(), "iBase", term210353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term210314;
        try {
            callMethod(klass, "equals", argTypes, term210080, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


