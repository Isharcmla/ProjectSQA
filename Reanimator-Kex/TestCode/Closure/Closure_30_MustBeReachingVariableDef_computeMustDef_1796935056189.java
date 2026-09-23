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

public class MustBeReachingVariableDef_computeMustDef_1796935056189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51687;
     Object term51757;
     Object term59898;
     Object term59899;

    public MustBeReachingVariableDef_computeMustDef_1796935056189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51687 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term51757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51757, term51757.getClass(), "type", 1265463001);
        setIntField(term51827, term51827.getClass(), "type", -2027534003);
        setIntField(term51897, term51897.getClass(), "type", 107);
        setField(term51897, term51897.getClass(), "first", null);
        setField(term51897, term51897.getClass(), "next", null);
        setField(term51827, term51827.getClass(), "first", term51897);
        setField(term51827, term51827.getClass(), "next", term51967);
        setField(term51757, term51757.getClass(), "first", term51827);
        term59898 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term59898, term59898.getClass(), "jsScope", null);
        setField(term59898, term59898.getClass(), "compiler", null);
        setField(term59898, term59898.getClass(), "escaped", null);
        setField(term59898, term59898.getClass(), "cfg", null);
        setField(term59898, term59898.getClass(), "joinOp", null);
        setField(term59898, term59898.getClass(), "orderedWorkSet", null);
        term59899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59899, term59899.getClass(), "type", 1265463001);
        setField(term59899, term59899.getClass(), "next", null);
        setIntField(term59900, term59900.getClass(), "type", -2027534003);
        setIntField(term59901, term59901.getClass(), "type", 0);
        setField(term59901, term59901.getClass(), "next", null);
        setField(term59901, term59901.getClass(), "first", null);
        setField(term59901, term59901.getClass(), "last", null);
        setField(term59901, term59901.getClass(), "propListHead", null);
        setIntField(term59901, term59901.getClass(), "sourcePosition", 0);
        setField(term59901, term59901.getClass(), "jsType", null);
        setField(term59901, term59901.getClass(), "parent", null);
        setField(term59900, term59900.getClass(), "next", term59901);
        setIntField(term59902, term59902.getClass(), "type", 107);
        setField(term59902, term59902.getClass(), "next", null);
        setField(term59902, term59902.getClass(), "first", null);
        setField(term59902, term59902.getClass(), "last", null);
        setField(term59902, term59902.getClass(), "propListHead", null);
        setIntField(term59902, term59902.getClass(), "sourcePosition", 0);
        setField(term59902, term59902.getClass(), "jsType", null);
        setField(term59902, term59902.getClass(), "parent", null);
        setField(term59900, term59900.getClass(), "first", term59902);
        setField(term59900, term59900.getClass(), "last", null);
        setField(term59900, term59900.getClass(), "propListHead", null);
        setIntField(term59900, term59900.getClass(), "sourcePosition", 0);
        setField(term59900, term59900.getClass(), "jsType", null);
        setField(term59900, term59900.getClass(), "parent", null);
        setField(term59899, term59899.getClass(), "first", term59900);
        setField(term59899, term59899.getClass(), "last", null);
        setField(term59899, term59899.getClass(), "propListHead", null);
        setIntField(term59899, term59899.getClass(), "sourcePosition", 0);
        setField(term59899, term59899.getClass(), "jsType", null);
        setField(term59899, term59899.getClass(), "parent", null);
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
        args[0] = term51757;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term51687, args);
        assertTrue(recursiveEquals(term51687, term59898));
        assertTrue(recursiveEquals(term51757, term59899));
    }

};


