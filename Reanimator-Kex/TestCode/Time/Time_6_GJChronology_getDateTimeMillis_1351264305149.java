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

public class GJChronology_getDateTimeMillis_1351264305149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42945;

    public GJChronology_getDateTimeMillis_1351264305149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42945 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term43031 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term42945, term42945.getClass(), "iBase", null);
        setField(term43031, term43031.getClass(), "iBase", null);
        setField(term42945, term42945.getClass(), "iGregorianChronology", term43031);
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
        args[1] = 2;
        args[2] = 29;
        args[3] = 32;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term42945, args);
            assertTrue(false);
        }
        catch (IllegalFieldValueException e) {
        }

    }

};


