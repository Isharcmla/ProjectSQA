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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165762;
     Object term165854;
     Object term177604;
     Object term177605;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165762 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term165854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term165946, term165946.getClass(), "type", 42);
        setField(term165854, term165854.getClass(), "first", term165946);
        term177604 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term177604, term177604.getClass(), "propertyTestFunctions", null);
        term177605 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term177605, term177605.getClass(), "number", 0.0);
        setIntField(term177605, term177605.getClass(), "type", 0);
        setField(term177605, term177605.getClass(), "next", null);
        setField(term177606, term177606.getClass(), "str", null);
        setIntField(term177606, term177606.getClass(), "type", 42);
        setField(term177606, term177606.getClass(), "next", null);
        setField(term177606, term177606.getClass(), "first", null);
        setField(term177606, term177606.getClass(), "last", null);
        setField(term177606, term177606.getClass(), "propListHead", null);
        setIntField(term177606, term177606.getClass(), "sourcePosition", 0);
        setField(term177606, term177606.getClass(), "jsType", null);
        setField(term177606, term177606.getClass(), "parent", null);
        setField(term177605, term177605.getClass(), "first", term177606);
        setField(term177605, term177605.getClass(), "last", null);
        setField(term177605, term177605.getClass(), "propListHead", null);
        setIntField(term177605, term177605.getClass(), "sourcePosition", 0);
        setField(term177605, term177605.getClass(), "jsType", null);
        setField(term177605, term177605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term165854;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term165762, args);
        assertTrue(recursiveEquals(term165762, term177604));
        assertTrue(recursiveEquals(term165854, term177605));
        assertTrue(recursiveEquals(retValue, null));
    }

};


