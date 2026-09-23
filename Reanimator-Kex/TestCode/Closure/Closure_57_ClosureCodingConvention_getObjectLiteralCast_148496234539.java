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

public class ClosureCodingConvention_getObjectLiteralCast_148496234539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179679;
     Object term179771;
     Object term179892;
     Object term179893;

    public ClosureCodingConvention_getObjectLiteralCast_148496234539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179679 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term179771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term179771, term179771.getClass(), "type", 37);
        setIntField(term179863, term179863.getClass(), "type", 42);
        setField(term179771, term179771.getClass(), "first", term179863);
        term179892 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term179892, term179892.getClass(), "propertyTestFunctions", null);
        term179893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term179893, term179893.getClass(), "number", 0.0);
        setIntField(term179893, term179893.getClass(), "type", 37);
        setField(term179893, term179893.getClass(), "next", null);
        setField(term179894, term179894.getClass(), "str", null);
        setIntField(term179894, term179894.getClass(), "type", 42);
        setField(term179894, term179894.getClass(), "next", null);
        setField(term179894, term179894.getClass(), "first", null);
        setField(term179894, term179894.getClass(), "last", null);
        setField(term179894, term179894.getClass(), "propListHead", null);
        setIntField(term179894, term179894.getClass(), "sourcePosition", 0);
        setField(term179894, term179894.getClass(), "jsType", null);
        setField(term179894, term179894.getClass(), "parent", null);
        setField(term179893, term179893.getClass(), "first", term179894);
        setField(term179893, term179893.getClass(), "last", null);
        setField(term179893, term179893.getClass(), "propListHead", null);
        setIntField(term179893, term179893.getClass(), "sourcePosition", 0);
        setField(term179893, term179893.getClass(), "jsType", null);
        setField(term179893, term179893.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term179771;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term179679, args);
        assertTrue(recursiveEquals(term179679, term179892));
        assertTrue(recursiveEquals(term179771, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


