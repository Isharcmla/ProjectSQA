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

public class LenientDateTimeField_set_38423629244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7240;

    public LenientDateTimeField_set_38423629244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7240 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term7318 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term7402 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term7318, term7318.getClass(), "iBase", term7402);
        setField(term7240, term7240.getClass(), "iBase", term7318);
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
            callMethod(klass, "set", argTypes, term7240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


