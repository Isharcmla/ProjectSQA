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

public class ClosureCodingConvention_getObjectLiteralCast_148496234425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147346;
     Object term147438;
     Object term147553;
     Object term147554;

    public ClosureCodingConvention_getObjectLiteralCast_148496234425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147346 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term147438 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term147438, term147438.getClass(), "type", 37);
        setField(term147438, term147438.getClass(), "first", term147530);
        term147553 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term147553, term147553.getClass(), "propertyTestFunctions", null);
        term147554 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term147554, term147554.getClass(), "number", 0.0);
        setIntField(term147554, term147554.getClass(), "type", 37);
        setField(term147554, term147554.getClass(), "next", null);
        setField(term147555, term147555.getClass(), "str", null);
        setIntField(term147555, term147555.getClass(), "type", 0);
        setField(term147555, term147555.getClass(), "next", null);
        setField(term147555, term147555.getClass(), "first", null);
        setField(term147555, term147555.getClass(), "last", null);
        setField(term147555, term147555.getClass(), "propListHead", null);
        setIntField(term147555, term147555.getClass(), "sourcePosition", 0);
        setField(term147555, term147555.getClass(), "jsType", null);
        setField(term147555, term147555.getClass(), "parent", null);
        setField(term147554, term147554.getClass(), "first", term147555);
        setField(term147554, term147554.getClass(), "last", null);
        setField(term147554, term147554.getClass(), "propListHead", null);
        setIntField(term147554, term147554.getClass(), "sourcePosition", 0);
        setField(term147554, term147554.getClass(), "jsType", null);
        setField(term147554, term147554.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term147438;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term147346, args);
        assertTrue(recursiveEquals(term147346, term147553));
        assertTrue(recursiveEquals(term147438, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


