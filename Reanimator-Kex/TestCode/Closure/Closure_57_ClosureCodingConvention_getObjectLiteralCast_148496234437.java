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

public class ClosureCodingConvention_getObjectLiteralCast_148496234437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149219;
     Object term149311;
     Object term149455;
     Object term149456;

    public ClosureCodingConvention_getObjectLiteralCast_148496234437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149219 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term149311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term149311, term149311.getClass(), "type", 37);
        setIntField(term149403, term149403.getClass(), "type", 42);
        setField(term149311, term149311.getClass(), "first", term149403);
        term149455 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term149455, term149455.getClass(), "propertyTestFunctions", null);
        term149456 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term149457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149456, term149456.getClass(), "str", null);
        setIntField(term149456, term149456.getClass(), "type", 37);
        setField(term149456, term149456.getClass(), "next", null);
        setField(term149457, term149457.getClass(), "str", null);
        setIntField(term149457, term149457.getClass(), "type", 42);
        setField(term149457, term149457.getClass(), "next", null);
        setField(term149457, term149457.getClass(), "first", null);
        setField(term149457, term149457.getClass(), "last", null);
        setField(term149457, term149457.getClass(), "propListHead", null);
        setIntField(term149457, term149457.getClass(), "sourcePosition", 0);
        setField(term149457, term149457.getClass(), "jsType", null);
        setField(term149457, term149457.getClass(), "parent", null);
        setField(term149456, term149456.getClass(), "first", term149457);
        setField(term149456, term149456.getClass(), "last", null);
        setField(term149456, term149456.getClass(), "propListHead", null);
        setIntField(term149456, term149456.getClass(), "sourcePosition", 0);
        setField(term149456, term149456.getClass(), "jsType", null);
        setField(term149456, term149456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term149311;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term149219, args);
        assertTrue(recursiveEquals(term149219, term149455));
        assertTrue(recursiveEquals(term149311, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


