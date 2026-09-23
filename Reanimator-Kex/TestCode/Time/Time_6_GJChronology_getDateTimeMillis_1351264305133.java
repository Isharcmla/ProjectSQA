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
import org.joda.time.IllegalFieldValueException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GJChronology_getDateTimeMillis_1351264305133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39097;

    public GJChronology_getDateTimeMillis_1351264305133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39097 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term39169 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term39255 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term39169, term39169.getClass(), "iBase", null);
        setField(term39169, term39169.getClass(), "iGregorianChronology", term39255);
        setField(term39097, term39097.getClass(), "iBase", term39169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term39097, args);
            assertTrue(false);
        }
        catch (IllegalFieldValueException e) {
        }

    }

};


