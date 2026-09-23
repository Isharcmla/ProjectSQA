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

public class GJChronology_getDateTimeMillis_294454801103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34173;

    public GJChronology_getDateTimeMillis_294454801103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34173 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term34245 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term34331 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term34245, term34245.getClass(), "iBase", null);
        setField(term34245, term34245.getClass(), "iGregorianChronology", term34331);
        setField(term34173, term34173.getClass(), "iBase", term34245);
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
            callMethod(klass, "getDateTimeMillis", argTypes, term34173, args);
            assertTrue(false);
        }
        catch (IllegalFieldValueException e) {
        }

    }

};


