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

public class ZonedChronology_getDateTimeMillis_230749326293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108344;

    public ZonedChronology_getDateTimeMillis_230749326293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108344 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term108422 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term108500 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term108578 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term108500, term108500.getClass(), "iBase", term108578);
        setField(term108422, term108422.getClass(), "iBase", term108500);
        setField(term108344, term108344.getClass(), "iBase", term108422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term108344, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


