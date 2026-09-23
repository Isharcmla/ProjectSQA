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

public class MustBeReachingVariableDef_computeMustDef_1796935056188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51218;
     Object term51310;
     Object term59782;
     Object term59783;

    public MustBeReachingVariableDef_computeMustDef_1796935056188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51218 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term51310 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51402 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51494 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term51310, term51310.getClass(), "type", 1265463001);
        setIntField(term51402, term51402.getClass(), "type", 110);
        setField(term51402, term51402.getClass(), "first", null);
        setField(term51402, term51402.getClass(), "next", term51494);
        setField(term51310, term51310.getClass(), "first", term51402);
        term59782 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term59782, term59782.getClass(), "jsScope", null);
        setField(term59782, term59782.getClass(), "compiler", null);
        setField(term59782, term59782.getClass(), "escaped", null);
        setField(term59782, term59782.getClass(), "cfg", null);
        setField(term59782, term59782.getClass(), "joinOp", null);
        setField(term59782, term59782.getClass(), "orderedWorkSet", null);
        term59783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term59784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term59785 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term59783, term59783.getClass(), "str", null);
        setIntField(term59783, term59783.getClass(), "type", 1265463001);
        setField(term59783, term59783.getClass(), "next", null);
        setField(term59784, term59784.getClass(), "str", null);
        setIntField(term59784, term59784.getClass(), "type", 110);
        setField(term59785, term59785.getClass(), "str", null);
        setIntField(term59785, term59785.getClass(), "type", 0);
        setField(term59785, term59785.getClass(), "next", null);
        setField(term59785, term59785.getClass(), "first", null);
        setField(term59785, term59785.getClass(), "last", null);
        setField(term59785, term59785.getClass(), "propListHead", null);
        setIntField(term59785, term59785.getClass(), "sourcePosition", 0);
        setField(term59785, term59785.getClass(), "jsType", null);
        setField(term59785, term59785.getClass(), "parent", null);
        setField(term59784, term59784.getClass(), "next", term59785);
        setField(term59784, term59784.getClass(), "first", null);
        setField(term59784, term59784.getClass(), "last", null);
        setField(term59784, term59784.getClass(), "propListHead", null);
        setIntField(term59784, term59784.getClass(), "sourcePosition", 0);
        setField(term59784, term59784.getClass(), "jsType", null);
        setField(term59784, term59784.getClass(), "parent", null);
        setField(term59783, term59783.getClass(), "first", term59784);
        setField(term59783, term59783.getClass(), "last", null);
        setField(term59783, term59783.getClass(), "propListHead", null);
        setIntField(term59783, term59783.getClass(), "sourcePosition", 0);
        setField(term59783, term59783.getClass(), "jsType", null);
        setField(term59783, term59783.getClass(), "parent", null);
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
        args[0] = term51310;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term51218, args);
        assertTrue(recursiveEquals(term51218, term59782));
        assertTrue(recursiveEquals(term51310, term59783));
    }

};


