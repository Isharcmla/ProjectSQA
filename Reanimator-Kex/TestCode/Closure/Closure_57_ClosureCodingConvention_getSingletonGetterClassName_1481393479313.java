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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126216;
     Object term126308;
     Object term126479;
     Object term126480;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126216 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term126308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term126308, term126308.getClass(), "first", term126400);
        term126479 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term126479, term126479.getClass(), "propertyTestFunctions", null);
        term126480 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126481 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term126480, term126480.getClass(), "number", 0.0);
        setIntField(term126480, term126480.getClass(), "type", 0);
        setField(term126480, term126480.getClass(), "next", null);
        setDoubleField(term126481, term126481.getClass(), "number", 0.0);
        setIntField(term126481, term126481.getClass(), "type", 0);
        setField(term126481, term126481.getClass(), "next", null);
        setField(term126481, term126481.getClass(), "first", null);
        setField(term126481, term126481.getClass(), "last", null);
        setField(term126481, term126481.getClass(), "propListHead", null);
        setIntField(term126481, term126481.getClass(), "sourcePosition", 0);
        setField(term126481, term126481.getClass(), "jsType", null);
        setField(term126481, term126481.getClass(), "parent", null);
        setField(term126480, term126480.getClass(), "first", term126481);
        setField(term126480, term126480.getClass(), "last", null);
        setField(term126480, term126480.getClass(), "propListHead", null);
        setIntField(term126480, term126480.getClass(), "sourcePosition", 0);
        setField(term126480, term126480.getClass(), "jsType", null);
        setField(term126480, term126480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term126308;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term126216, args);
        assertTrue(recursiveEquals(term126216, term126479));
        assertTrue(recursiveEquals(term126308, term126480));
        assertTrue(recursiveEquals(retValue, null));
    }

};


