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

public class MustBeReachingVariableDef_computeMustDef_1796935056160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44749;
     Object term44841;
     Object term45693;
     Object term45694;

    public MustBeReachingVariableDef_computeMustDef_1796935056160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44749 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term44841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term44933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term44841, term44841.getClass(), "type", 1265463001);
        setIntField(term44933, term44933.getClass(), "type", -2027534003);
        setIntField(term45025, term45025.getClass(), "type", 105);
        setField(term44933, term44933.getClass(), "first", term45025);
        setField(term44841, term44841.getClass(), "first", term44933);
        term45693 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term45693, term45693.getClass(), "jsScope", null);
        setField(term45693, term45693.getClass(), "compiler", null);
        setField(term45693, term45693.getClass(), "escaped", null);
        setField(term45693, term45693.getClass(), "cfg", null);
        setField(term45693, term45693.getClass(), "joinOp", null);
        setField(term45693, term45693.getClass(), "orderedWorkSet", null);
        term45694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45696 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term45694, term45694.getClass(), "str", null);
        setIntField(term45694, term45694.getClass(), "type", 1265463001);
        setField(term45694, term45694.getClass(), "next", null);
        setField(term45695, term45695.getClass(), "str", null);
        setIntField(term45695, term45695.getClass(), "type", -2027534003);
        setField(term45695, term45695.getClass(), "next", null);
        setField(term45696, term45696.getClass(), "str", null);
        setIntField(term45696, term45696.getClass(), "type", 105);
        setField(term45696, term45696.getClass(), "next", null);
        setField(term45696, term45696.getClass(), "first", null);
        setField(term45696, term45696.getClass(), "last", null);
        setField(term45696, term45696.getClass(), "propListHead", null);
        setIntField(term45696, term45696.getClass(), "sourcePosition", 0);
        setField(term45696, term45696.getClass(), "jsType", null);
        setField(term45696, term45696.getClass(), "parent", null);
        setField(term45695, term45695.getClass(), "first", term45696);
        setField(term45695, term45695.getClass(), "last", null);
        setField(term45695, term45695.getClass(), "propListHead", null);
        setIntField(term45695, term45695.getClass(), "sourcePosition", 0);
        setField(term45695, term45695.getClass(), "jsType", null);
        setField(term45695, term45695.getClass(), "parent", null);
        setField(term45694, term45694.getClass(), "first", term45695);
        setField(term45694, term45694.getClass(), "last", null);
        setField(term45694, term45694.getClass(), "propListHead", null);
        setIntField(term45694, term45694.getClass(), "sourcePosition", 0);
        setField(term45694, term45694.getClass(), "jsType", null);
        setField(term45694, term45694.getClass(), "parent", null);
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
        args[0] = term44841;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term44749, args);
        assertTrue(recursiveEquals(term44749, term45693));
        assertTrue(recursiveEquals(term44841, term45694));
    }

};


