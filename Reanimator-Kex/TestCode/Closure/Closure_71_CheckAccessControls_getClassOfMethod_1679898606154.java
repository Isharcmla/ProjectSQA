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

public class CheckAccessControls_getClassOfMethod_1679898606154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42095;
     Object term42187;
     Object term42371;
     Object term42700;
     Object term42701;
     Object term42702;
     Object term42681;

    public CheckAccessControls_getClassOfMethod_1679898606154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42095 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term42187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term42187, term42187.getClass(), "type", 38);
        setField(term42187, term42187.getClass(), "jsType", term42279);
        term42371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term42371, term42371.getClass(), "type", 38);
        term42700 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term42700, term42700.getClass(), "compiler", null);
        setField(term42700, term42700.getClass(), "validator", null);
        setIntField(term42700, term42700.getClass(), "deprecatedDepth", 0);
        setIntField(term42700, term42700.getClass(), "methodDepth", 0);
        setField(term42700, term42700.getClass(), "currentClass", null);
        setField(term42700, term42700.getClass(), "initializedConstantProperties", null);
        term42701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42701, term42701.getClass(), "str", null);
        setIntField(term42701, term42701.getClass(), "type", 38);
        setField(term42701, term42701.getClass(), "next", null);
        setField(term42701, term42701.getClass(), "first", null);
        setField(term42701, term42701.getClass(), "last", null);
        setField(term42701, term42701.getClass(), "propListHead", null);
        setIntField(term42701, term42701.getClass(), "sourcePosition", 0);
        setField(term42701, term42701.getClass(), "jsType", null);
        setField(term42701, term42701.getClass(), "parent", null);
        term42702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term42702, term42702.getClass(), "str", null);
        setIntField(term42702, term42702.getClass(), "type", 38);
        setField(term42702, term42702.getClass(), "next", null);
        setField(term42702, term42702.getClass(), "first", null);
        setField(term42702, term42702.getClass(), "last", null);
        setField(term42702, term42702.getClass(), "propListHead", null);
        setIntField(term42702, term42702.getClass(), "sourcePosition", 0);
        setBooleanField(term42703, term42703.getClass(), "resolved", false);
        setField(term42703, term42703.getClass(), "resolveResult", null);
        setField(term42703, term42703.getClass(), "registry", null);
        setField(term42702, term42702.getClass(), "jsType", term42703);
        setField(term42702, term42702.getClass(), "parent", null);
        term42681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term42681, term42681.getClass(), "resolved", false);
        setField(term42681, term42681.getClass(), "resolveResult", null);
        setField(term42681, term42681.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term42187;
        args[1] = term42371;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term42095, args);
        assertTrue(recursiveEquals(term42095, term42700));
        assertTrue(recursiveEquals(term42187, term42701));
        assertTrue(recursiveEquals(term42371, term42702));
        assertTrue(recursiveEquals(retValue, term42681));
    }

};


