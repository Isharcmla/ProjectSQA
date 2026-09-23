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

public class Partial_minus_670011712105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30361;
     Object term30409;

    public Partial_minus_670011712105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30361 = newInstance(Class.forName("org.joda.time.Partial"));
        int[] term30300 = (int[]) newIntArray(0);
        setField(term30361, term30361.getClass(), "iValues", term30300);
        term30409 = newInstance(Class.forName("org.joda.time.Minutes"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[1];
        args[0] = term30409;
        try {
            callMethod(klass, "minus", argTypes, term30361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


