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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167260;
     Object term167352;
     Object term178094;
     Object term178095;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167260 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term167352 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term167444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term167444, term167444.getClass(), "type", 42);
        setField(term167352, term167352.getClass(), "first", term167444);
        term178094 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term178094, term178094.getClass(), "propertyTestFunctions", null);
        term178095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term178095, term178095.getClass(), "str", null);
        setIntField(term178095, term178095.getClass(), "type", 0);
        setField(term178095, term178095.getClass(), "next", null);
        setDoubleField(term178096, term178096.getClass(), "number", 0.0);
        setIntField(term178096, term178096.getClass(), "type", 42);
        setField(term178096, term178096.getClass(), "next", null);
        setField(term178096, term178096.getClass(), "first", null);
        setField(term178096, term178096.getClass(), "last", null);
        setField(term178096, term178096.getClass(), "propListHead", null);
        setIntField(term178096, term178096.getClass(), "sourcePosition", 0);
        setField(term178096, term178096.getClass(), "jsType", null);
        setField(term178096, term178096.getClass(), "parent", null);
        setField(term178095, term178095.getClass(), "first", term178096);
        setField(term178095, term178095.getClass(), "last", null);
        setField(term178095, term178095.getClass(), "propListHead", null);
        setIntField(term178095, term178095.getClass(), "sourcePosition", 0);
        setField(term178095, term178095.getClass(), "jsType", null);
        setField(term178095, term178095.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term167352;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term167260, args);
        assertTrue(recursiveEquals(term167260, term178094));
        assertTrue(recursiveEquals(term167352, term178095));
        assertTrue(recursiveEquals(retValue, null));
    }

};


