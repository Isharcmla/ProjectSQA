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

public class LenientDateTimeField_set_38423629284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15909;

    public LenientDateTimeField_set_38423629284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15909 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term15981 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term16053 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term16053, term16053.getClass(), "iBase", null);
        setField(term15981, term15981.getClass(), "iBase", term16053);
        setField(term15909, term15909.getClass(), "iBase", term15981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 4294967293L;
        args[1] = 0;
        try {
            callMethod(klass, "set", argTypes, term15909, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


