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

public class MustBeReachingVariableDef_computeMustDef_1796935056192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52953;
     Object term53023;
     Object term60169;
     Object term60170;

    public MustBeReachingVariableDef_computeMustDef_1796935056192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52953 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term53023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53023, term53023.getClass(), "type", 1265463001);
        setIntField(term53093, term53093.getClass(), "type", 117);
        setField(term53023, term53023.getClass(), "first", term53093);
        term60169 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term60169, term60169.getClass(), "jsScope", null);
        setField(term60169, term60169.getClass(), "compiler", null);
        setField(term60169, term60169.getClass(), "escaped", null);
        setField(term60169, term60169.getClass(), "cfg", null);
        setField(term60169, term60169.getClass(), "joinOp", null);
        setField(term60169, term60169.getClass(), "orderedWorkSet", null);
        term60170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60170, term60170.getClass(), "type", 1265463001);
        setField(term60170, term60170.getClass(), "next", null);
        setIntField(term60171, term60171.getClass(), "type", 117);
        setField(term60171, term60171.getClass(), "next", null);
        setField(term60171, term60171.getClass(), "first", null);
        setField(term60171, term60171.getClass(), "last", null);
        setField(term60171, term60171.getClass(), "propListHead", null);
        setIntField(term60171, term60171.getClass(), "sourcePosition", 0);
        setField(term60171, term60171.getClass(), "jsType", null);
        setField(term60171, term60171.getClass(), "parent", null);
        setField(term60170, term60170.getClass(), "first", term60171);
        setField(term60170, term60170.getClass(), "last", null);
        setField(term60170, term60170.getClass(), "propListHead", null);
        setIntField(term60170, term60170.getClass(), "sourcePosition", 0);
        setField(term60170, term60170.getClass(), "jsType", null);
        setField(term60170, term60170.getClass(), "parent", null);
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
        args[0] = term53023;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term52953, args);
        assertTrue(recursiveEquals(term52953, term60169));
        assertTrue(recursiveEquals(term53023, term60170));
    }

};


