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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143960;
     Object term144052;
     Object term144166;
     Object term144167;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143960 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term144052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term144144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term144052, term144052.getClass(), "first", term144144);
        term144166 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term144166, term144166.getClass(), "propertyTestFunctions", null);
        term144167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term144168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term144167, term144167.getClass(), "str", null);
        setIntField(term144167, term144167.getClass(), "type", 0);
        setField(term144167, term144167.getClass(), "next", null);
        setDoubleField(term144168, term144168.getClass(), "number", 0.0);
        setIntField(term144168, term144168.getClass(), "type", 0);
        setField(term144168, term144168.getClass(), "next", null);
        setField(term144168, term144168.getClass(), "first", null);
        setField(term144168, term144168.getClass(), "last", null);
        setField(term144168, term144168.getClass(), "propListHead", null);
        setIntField(term144168, term144168.getClass(), "sourcePosition", 0);
        setField(term144168, term144168.getClass(), "jsType", null);
        setField(term144168, term144168.getClass(), "parent", null);
        setField(term144167, term144167.getClass(), "first", term144168);
        setField(term144167, term144167.getClass(), "last", null);
        setField(term144167, term144167.getClass(), "propListHead", null);
        setIntField(term144167, term144167.getClass(), "sourcePosition", 0);
        setField(term144167, term144167.getClass(), "jsType", null);
        setField(term144167, term144167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144052;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term143960, args);
        assertTrue(recursiveEquals(term143960, term144166));
        assertTrue(recursiveEquals(term144052, term144167));
        assertTrue(recursiveEquals(retValue, null));
    }

};


