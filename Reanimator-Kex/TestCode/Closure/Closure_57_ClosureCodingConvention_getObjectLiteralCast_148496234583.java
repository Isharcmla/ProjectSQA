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

public class ClosureCodingConvention_getObjectLiteralCast_148496234583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206149;
     Object term206241;
     Object term206364;
     Object term206365;

    public ClosureCodingConvention_getObjectLiteralCast_148496234583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206149 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term206241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term206333 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term206241, term206241.getClass(), "type", 37);
        setIntField(term206333, term206333.getClass(), "type", 42);
        setField(term206241, term206241.getClass(), "first", term206333);
        term206364 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term206364, term206364.getClass(), "propertyTestFunctions", null);
        term206365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term206366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term206365, term206365.getClass(), "str", null);
        setIntField(term206365, term206365.getClass(), "type", 37);
        setField(term206365, term206365.getClass(), "next", null);
        setDoubleField(term206366, term206366.getClass(), "number", 0.0);
        setIntField(term206366, term206366.getClass(), "type", 42);
        setField(term206366, term206366.getClass(), "next", null);
        setField(term206366, term206366.getClass(), "first", null);
        setField(term206366, term206366.getClass(), "last", null);
        setField(term206366, term206366.getClass(), "propListHead", null);
        setIntField(term206366, term206366.getClass(), "sourcePosition", 0);
        setField(term206366, term206366.getClass(), "jsType", null);
        setField(term206366, term206366.getClass(), "parent", null);
        setField(term206365, term206365.getClass(), "first", term206366);
        setField(term206365, term206365.getClass(), "last", null);
        setField(term206365, term206365.getClass(), "propListHead", null);
        setIntField(term206365, term206365.getClass(), "sourcePosition", 0);
        setField(term206365, term206365.getClass(), "jsType", null);
        setField(term206365, term206365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term206241;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term206149, args);
        assertTrue(recursiveEquals(term206149, term206364));
        assertTrue(recursiveEquals(term206241, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


