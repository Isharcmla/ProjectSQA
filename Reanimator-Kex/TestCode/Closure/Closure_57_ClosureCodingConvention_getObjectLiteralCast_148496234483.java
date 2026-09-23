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

public class ClosureCodingConvention_getObjectLiteralCast_148496234483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157342;
     Object term157434;
     Object term157551;
     Object term157552;

    public ClosureCodingConvention_getObjectLiteralCast_148496234483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157342 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term157434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term157434, term157434.getClass(), "type", 37);
        setField(term157434, term157434.getClass(), "first", term157526);
        term157551 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term157551, term157551.getClass(), "propertyTestFunctions", null);
        term157552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term157552, term157552.getClass(), "str", null);
        setIntField(term157552, term157552.getClass(), "type", 37);
        setField(term157552, term157552.getClass(), "next", null);
        setDoubleField(term157553, term157553.getClass(), "number", 0.0);
        setIntField(term157553, term157553.getClass(), "type", 0);
        setField(term157553, term157553.getClass(), "next", null);
        setField(term157553, term157553.getClass(), "first", null);
        setField(term157553, term157553.getClass(), "last", null);
        setField(term157553, term157553.getClass(), "propListHead", null);
        setIntField(term157553, term157553.getClass(), "sourcePosition", 0);
        setField(term157553, term157553.getClass(), "jsType", null);
        setField(term157553, term157553.getClass(), "parent", null);
        setField(term157552, term157552.getClass(), "first", term157553);
        setField(term157552, term157552.getClass(), "last", null);
        setField(term157552, term157552.getClass(), "propListHead", null);
        setIntField(term157552, term157552.getClass(), "sourcePosition", 0);
        setField(term157552, term157552.getClass(), "jsType", null);
        setField(term157552, term157552.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term157434;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term157342, args);
        assertTrue(recursiveEquals(term157342, term157551));
        assertTrue(recursiveEquals(term157434, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


