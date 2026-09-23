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

public class CheckAccessControls_getClassOfMethod_1679898606398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201350;
     Object term201442;
     Object term201684;
     Object term201685;

    public CheckAccessControls_getClassOfMethod_1679898606398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201350 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term201442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term201534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term201442, term201442.getClass(), "type", 86);
        setField(term201442, term201442.getClass(), "first", term201534);
        term201684 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term201684, term201684.getClass(), "compiler", null);
        setField(term201684, term201684.getClass(), "validator", null);
        setIntField(term201684, term201684.getClass(), "deprecatedDepth", 0);
        setIntField(term201684, term201684.getClass(), "methodDepth", 0);
        setField(term201684, term201684.getClass(), "currentClass", null);
        setField(term201684, term201684.getClass(), "initializedConstantProperties", null);
        term201685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term201686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term201685, term201685.getClass(), "number", 0.0);
        setIntField(term201685, term201685.getClass(), "type", 86);
        setField(term201685, term201685.getClass(), "next", null);
        setField(term201686, term201686.getClass(), "str", null);
        setIntField(term201686, term201686.getClass(), "type", 0);
        setField(term201686, term201686.getClass(), "next", null);
        setField(term201686, term201686.getClass(), "first", null);
        setField(term201686, term201686.getClass(), "last", null);
        setField(term201686, term201686.getClass(), "propListHead", null);
        setIntField(term201686, term201686.getClass(), "sourcePosition", 0);
        setField(term201686, term201686.getClass(), "jsType", null);
        setField(term201686, term201686.getClass(), "parent", null);
        setField(term201685, term201685.getClass(), "first", term201686);
        setField(term201685, term201685.getClass(), "last", null);
        setField(term201685, term201685.getClass(), "propListHead", null);
        setIntField(term201685, term201685.getClass(), "sourcePosition", 0);
        setField(term201685, term201685.getClass(), "jsType", null);
        setField(term201685, term201685.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term201442;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term201350, args);
        assertTrue(recursiveEquals(term201350, term201684));
        assertTrue(recursiveEquals(term201442, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


