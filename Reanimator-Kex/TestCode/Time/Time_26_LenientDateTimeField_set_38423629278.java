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

public class LenientDateTimeField_set_38423629278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14663;

    public LenientDateTimeField_set_38423629278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14663 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term14745 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        Object term14827 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        setField(term14745, term14745.getClass(), "iBase", term14827);
        setField(term14663, term14663.getClass(), "iBase", term14745);
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
            callMethod(klass, "set", argTypes, term14663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


