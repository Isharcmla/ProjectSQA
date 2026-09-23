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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_init_3537177894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term6;

    public Partial_init_3537177894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 5);
        term6 = (int[]) newIntArray(4);
        setIntElement(term6, 0, 1484323161);
        setIntElement(term6, 1, 391863371);
        setIntElement(term6, 2, -1922583790);
        setIntElement(term6, 3, -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.joda.time.DateTimeFieldType"), 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term6;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


