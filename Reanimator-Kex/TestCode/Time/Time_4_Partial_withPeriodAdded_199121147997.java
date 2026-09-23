package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Partial_withPeriodAdded_199121147997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29506;
     Object term29554;

    public Partial_withPeriodAdded_199121147997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29506 = newInstance(Class.forName("org.joda.time.Partial"));
        term29554 = newInstance(Class.forName("org.joda.time.Seconds"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term29554;
        args[1] = -1;
        try {
            callMethod(klass, "withPeriodAdded", argTypes, term29506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


