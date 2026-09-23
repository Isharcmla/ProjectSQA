package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.lang.String;

public class ConstructorConstructor_newDefaultConstructor_134310589327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13080;
     Object term13116;
     Object term13494;
     Object term13495;

    public ConstructorConstructor_newDefaultConstructor_134310589327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13080 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        term13116 = Class.forName((String) "java.util.stream.DistinctOps");
        term13494 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term13494, term13494.getClass(), "instanceCreators", null);
        term13495 = Class.forName((String) "java.util.stream.TerminalSink");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = term13116;
        Object retValue = callMethod(klass, "newDefaultConstructor", argTypes, term13080, args);
        assertTrue(recursiveEquals(term13080, term13494));
        assertTrue(recursiveEquals(term13116, term13495));
        assertTrue(recursiveEquals(retValue, null));
    }

};


