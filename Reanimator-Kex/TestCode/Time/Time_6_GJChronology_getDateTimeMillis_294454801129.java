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

public class GJChronology_getDateTimeMillis_294454801129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38476;

    public GJChronology_getDateTimeMillis_294454801129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38476 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term38548 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term38476, term38476.getClass(), "iBase", term38548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
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
            callMethod(klass, "getDateTimeMillis", argTypes, term38476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


