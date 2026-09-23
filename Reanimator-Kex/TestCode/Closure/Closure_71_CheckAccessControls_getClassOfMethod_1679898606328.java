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

public class CheckAccessControls_getClassOfMethod_1679898606328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105340;
     Object term105432;
     Object term105691;
     Object term105692;

    public CheckAccessControls_getClassOfMethod_1679898606328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105340 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term105432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term105432, term105432.getClass(), "type", 86);
        setField(term105432, term105432.getClass(), "first", term105524);
        term105691 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term105691, term105691.getClass(), "compiler", null);
        setField(term105691, term105691.getClass(), "validator", null);
        setIntField(term105691, term105691.getClass(), "deprecatedDepth", 0);
        setIntField(term105691, term105691.getClass(), "methodDepth", 0);
        setField(term105691, term105691.getClass(), "currentClass", null);
        setField(term105691, term105691.getClass(), "initializedConstantProperties", null);
        term105692 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term105692, term105692.getClass(), "number", 0.0);
        setIntField(term105692, term105692.getClass(), "type", 86);
        setField(term105692, term105692.getClass(), "next", null);
        setDoubleField(term105693, term105693.getClass(), "number", 0.0);
        setIntField(term105693, term105693.getClass(), "type", 0);
        setField(term105693, term105693.getClass(), "next", null);
        setField(term105693, term105693.getClass(), "first", null);
        setField(term105693, term105693.getClass(), "last", null);
        setField(term105693, term105693.getClass(), "propListHead", null);
        setIntField(term105693, term105693.getClass(), "sourcePosition", 0);
        setField(term105693, term105693.getClass(), "jsType", null);
        setField(term105693, term105693.getClass(), "parent", null);
        setField(term105692, term105692.getClass(), "first", term105693);
        setField(term105692, term105692.getClass(), "last", null);
        setField(term105692, term105692.getClass(), "propListHead", null);
        setIntField(term105692, term105692.getClass(), "sourcePosition", 0);
        setField(term105692, term105692.getClass(), "jsType", null);
        setField(term105692, term105692.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term105432;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term105340, args);
        assertTrue(recursiveEquals(term105340, term105691));
        assertTrue(recursiveEquals(term105432, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


