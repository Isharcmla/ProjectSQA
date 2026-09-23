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

public class MustBeReachingVariableDef_computeMustDef_1796935056112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30324;
     Object term30416;
     Object term31124;
     Object term31125;

    public MustBeReachingVariableDef_computeMustDef_1796935056112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30324 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term30416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term30508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term30416, term30416.getClass(), "type", 1265463001);
        setIntField(term30508, term30508.getClass(), "type", 122);
        setField(term30416, term30416.getClass(), "first", term30508);
        term31124 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term31124, term31124.getClass(), "jsScope", null);
        setField(term31124, term31124.getClass(), "compiler", null);
        setField(term31124, term31124.getClass(), "escaped", null);
        setField(term31124, term31124.getClass(), "cfg", null);
        setField(term31124, term31124.getClass(), "joinOp", null);
        setField(term31124, term31124.getClass(), "orderedWorkSet", null);
        term31125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term31125, term31125.getClass(), "str", null);
        setIntField(term31125, term31125.getClass(), "type", 1265463001);
        setField(term31125, term31125.getClass(), "next", null);
        setField(term31126, term31126.getClass(), "str", null);
        setIntField(term31126, term31126.getClass(), "type", 122);
        setField(term31126, term31126.getClass(), "next", null);
        setField(term31126, term31126.getClass(), "first", null);
        setField(term31126, term31126.getClass(), "last", null);
        setField(term31126, term31126.getClass(), "propListHead", null);
        setIntField(term31126, term31126.getClass(), "sourcePosition", 0);
        setField(term31126, term31126.getClass(), "jsType", null);
        setField(term31126, term31126.getClass(), "parent", null);
        setField(term31125, term31125.getClass(), "first", term31126);
        setField(term31125, term31125.getClass(), "last", null);
        setField(term31125, term31125.getClass(), "propListHead", null);
        setIntField(term31125, term31125.getClass(), "sourcePosition", 0);
        setField(term31125, term31125.getClass(), "jsType", null);
        setField(term31125, term31125.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term30416;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term30324, args);
        assertTrue(recursiveEquals(term30324, term31124));
        assertTrue(recursiveEquals(term30416, term31125));
    }

};


