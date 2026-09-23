package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125556;
     Object term125648;
     Object term125787;
     Object term125788;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125556 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term125648 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term125648, term125648.getClass(), "first", term125740);
        term125787 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term125787, term125787.getClass(), "propertyTestFunctions", null);
        term125788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term125788, term125788.getClass(), "str", null);
        setIntField(term125788, term125788.getClass(), "type", 0);
        setField(term125788, term125788.getClass(), "next", null);
        setField(term125789, term125789.getClass(), "str", null);
        setIntField(term125789, term125789.getClass(), "type", 0);
        setField(term125789, term125789.getClass(), "next", null);
        setField(term125789, term125789.getClass(), "first", null);
        setField(term125789, term125789.getClass(), "last", null);
        setField(term125789, term125789.getClass(), "propListHead", null);
        setIntField(term125789, term125789.getClass(), "sourcePosition", 0);
        setField(term125789, term125789.getClass(), "jsType", null);
        setField(term125789, term125789.getClass(), "parent", null);
        setField(term125788, term125788.getClass(), "first", term125789);
        setField(term125788, term125788.getClass(), "last", null);
        setField(term125788, term125788.getClass(), "propListHead", null);
        setIntField(term125788, term125788.getClass(), "sourcePosition", 0);
        setField(term125788, term125788.getClass(), "jsType", null);
        setField(term125788, term125788.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term125648;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term125556, args);
        assertTrue(recursiveEquals(term125556, term125787));
        assertTrue(recursiveEquals(term125648, term125788));
        assertTrue(recursiveEquals(retValue, null));
    }

};


