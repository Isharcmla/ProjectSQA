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

public class BasicMonthOfYearDateTimeField_add_1905304068207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47262;
     Object term47310;

    public BasicMonthOfYearDateTimeField_add_1905304068207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47262 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term47310 = newInstance(Class.forName("org.joda.time.Partial"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term47310;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term47262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


