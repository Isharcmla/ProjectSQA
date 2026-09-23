package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LenientDateTimeField_set_38423629239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6425;

    public LenientDateTimeField_set_38423629239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6425 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term6511 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term6597 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term6511, term6511.getClass(), "iBase", null);
        setField(term6425, term6425.getClass(), "iBase", term6511);
        setField(term6425, term6425.getClass(), "iField", term6597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0L;
        args[1] = 0;
        try {
            callMethod(klass, "set", argTypes, term6425, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


