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

public class MustBeReachingVariableDef_computeMustDef_1796935056218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205657;
     Object term205749;
     Object term211427;
     Object term211428;

    public MustBeReachingVariableDef_computeMustDef_1796935056218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205657 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term205749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term206025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term205749, term205749.getClass(), "type", 1265463001);
        setIntField(term205841, term205841.getClass(), "type", -2027534003);
        setIntField(term205933, term205933.getClass(), "type", 1375330971);
        setField(term205933, term205933.getClass(), "first", null);
        setField(term205933, term205933.getClass(), "next", null);
        setField(term205841, term205841.getClass(), "first", term205933);
        setIntField(term206025, term206025.getClass(), "type", 122);
        setField(term205841, term205841.getClass(), "next", term206025);
        setField(term205749, term205749.getClass(), "first", term205841);
        term211427 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term211427, term211427.getClass(), "jsScope", null);
        setField(term211427, term211427.getClass(), "compiler", null);
        setField(term211427, term211427.getClass(), "escaped", null);
        setField(term211427, term211427.getClass(), "cfg", null);
        setField(term211427, term211427.getClass(), "joinOp", null);
        setField(term211427, term211427.getClass(), "orderedWorkSet", null);
        term211428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211429 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term211428, term211428.getClass(), "str", null);
        setIntField(term211428, term211428.getClass(), "type", 1265463001);
        setField(term211428, term211428.getClass(), "next", null);
        setField(term211429, term211429.getClass(), "str", null);
        setIntField(term211429, term211429.getClass(), "type", -2027534003);
        setField(term211430, term211430.getClass(), "str", null);
        setIntField(term211430, term211430.getClass(), "type", 122);
        setField(term211430, term211430.getClass(), "next", null);
        setField(term211430, term211430.getClass(), "first", null);
        setField(term211430, term211430.getClass(), "last", null);
        setField(term211430, term211430.getClass(), "propListHead", null);
        setIntField(term211430, term211430.getClass(), "sourcePosition", 0);
        setField(term211430, term211430.getClass(), "jsType", null);
        setField(term211430, term211430.getClass(), "parent", null);
        setField(term211429, term211429.getClass(), "next", term211430);
        setField(term211431, term211431.getClass(), "str", null);
        setIntField(term211431, term211431.getClass(), "type", 1375330971);
        setField(term211431, term211431.getClass(), "next", null);
        setField(term211431, term211431.getClass(), "first", null);
        setField(term211431, term211431.getClass(), "last", null);
        setField(term211431, term211431.getClass(), "propListHead", null);
        setIntField(term211431, term211431.getClass(), "sourcePosition", 0);
        setField(term211431, term211431.getClass(), "jsType", null);
        setField(term211431, term211431.getClass(), "parent", null);
        setField(term211429, term211429.getClass(), "first", term211431);
        setField(term211429, term211429.getClass(), "last", null);
        setField(term211429, term211429.getClass(), "propListHead", null);
        setIntField(term211429, term211429.getClass(), "sourcePosition", 0);
        setField(term211429, term211429.getClass(), "jsType", null);
        setField(term211429, term211429.getClass(), "parent", null);
        setField(term211428, term211428.getClass(), "first", term211429);
        setField(term211428, term211428.getClass(), "last", null);
        setField(term211428, term211428.getClass(), "propListHead", null);
        setIntField(term211428, term211428.getClass(), "sourcePosition", 0);
        setField(term211428, term211428.getClass(), "jsType", null);
        setField(term211428, term211428.getClass(), "parent", null);
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
        args[0] = term205749;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term205657, args);
        assertTrue(recursiveEquals(term205657, term211427));
        assertTrue(recursiveEquals(term205749, term211428));
    }

};


