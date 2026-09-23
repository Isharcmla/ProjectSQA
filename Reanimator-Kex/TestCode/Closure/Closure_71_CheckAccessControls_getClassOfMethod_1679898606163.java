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

public class CheckAccessControls_getClassOfMethod_1679898606163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44378;
     Object term44470;
     Object term44562;
     Object term44860;
     Object term44861;
     Object term44862;

    public CheckAccessControls_getClassOfMethod_1679898606163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44378 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term44470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term44562 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term44562, term44562.getClass(), "type", -87);
        term44860 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term44860, term44860.getClass(), "compiler", null);
        setField(term44860, term44860.getClass(), "validator", null);
        setIntField(term44860, term44860.getClass(), "deprecatedDepth", 0);
        setIntField(term44860, term44860.getClass(), "methodDepth", 0);
        setField(term44860, term44860.getClass(), "currentClass", null);
        setField(term44860, term44860.getClass(), "initializedConstantProperties", null);
        term44861 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term44861, term44861.getClass(), "number", 0.0);
        setIntField(term44861, term44861.getClass(), "type", -87);
        setField(term44861, term44861.getClass(), "next", null);
        setField(term44861, term44861.getClass(), "first", null);
        setField(term44861, term44861.getClass(), "last", null);
        setField(term44861, term44861.getClass(), "propListHead", null);
        setIntField(term44861, term44861.getClass(), "sourcePosition", 0);
        setField(term44861, term44861.getClass(), "jsType", null);
        setField(term44861, term44861.getClass(), "parent", null);
        term44862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term44862, term44862.getClass(), "number", 0.0);
        setIntField(term44862, term44862.getClass(), "type", 0);
        setField(term44862, term44862.getClass(), "next", null);
        setField(term44862, term44862.getClass(), "first", null);
        setField(term44862, term44862.getClass(), "last", null);
        setField(term44862, term44862.getClass(), "propListHead", null);
        setIntField(term44862, term44862.getClass(), "sourcePosition", 0);
        setField(term44862, term44862.getClass(), "jsType", null);
        setField(term44862, term44862.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term44470;
        args[1] = term44562;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term44378, args);
        assertTrue(recursiveEquals(term44378, term44860));
        assertTrue(recursiveEquals(term44470, term44861));
        assertTrue(recursiveEquals(term44562, term44862));
        assertTrue(recursiveEquals(retValue, null));
    }

};


