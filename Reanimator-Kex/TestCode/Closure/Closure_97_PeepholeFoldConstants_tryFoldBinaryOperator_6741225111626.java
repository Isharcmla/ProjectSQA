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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653191;
     Object term653283;
     Object term653571;
     Object term653572;
     Object term653542;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term653283 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term653375, term653375.getClass(), "next", term653467);
        setIntField(term653375, term653375.getClass(), "type", 39);
        setField(term653283, term653283.getClass(), "first", term653375);
        setIntField(term653283, term653283.getClass(), "type", 18);
        term653571 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term653571, term653571.getClass(), "currentTraversal", null);
        term653572 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653573 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term653572, term653572.getClass(), "str", null);
        setIntField(term653572, term653572.getClass(), "type", 18);
        setField(term653572, term653572.getClass(), "next", null);
        setField(term653573, term653573.getClass(), "str", null);
        setIntField(term653573, term653573.getClass(), "type", 39);
        setField(term653574, term653574.getClass(), "str", null);
        setIntField(term653574, term653574.getClass(), "type", 0);
        setField(term653574, term653574.getClass(), "next", null);
        setField(term653574, term653574.getClass(), "first", null);
        setField(term653574, term653574.getClass(), "last", null);
        setField(term653574, term653574.getClass(), "propListHead", null);
        setIntField(term653574, term653574.getClass(), "sourcePosition", 0);
        setField(term653574, term653574.getClass(), "jsType", null);
        setField(term653574, term653574.getClass(), "parent", null);
        setField(term653573, term653573.getClass(), "next", term653574);
        setField(term653573, term653573.getClass(), "first", null);
        setField(term653573, term653573.getClass(), "last", null);
        setField(term653573, term653573.getClass(), "propListHead", null);
        setIntField(term653573, term653573.getClass(), "sourcePosition", 0);
        setField(term653573, term653573.getClass(), "jsType", null);
        setField(term653573, term653573.getClass(), "parent", null);
        setField(term653572, term653572.getClass(), "first", term653573);
        setField(term653572, term653572.getClass(), "last", null);
        setField(term653572, term653572.getClass(), "propListHead", null);
        setIntField(term653572, term653572.getClass(), "sourcePosition", 0);
        setField(term653572, term653572.getClass(), "jsType", null);
        setField(term653572, term653572.getClass(), "parent", null);
        term653542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653544 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term653542, term653542.getClass(), "str", null);
        setIntField(term653542, term653542.getClass(), "type", 18);
        setField(term653542, term653542.getClass(), "next", null);
        setField(term653544, term653544.getClass(), "str", null);
        setIntField(term653544, term653544.getClass(), "type", 39);
        setField(term653546, term653546.getClass(), "str", null);
        setIntField(term653546, term653546.getClass(), "type", 0);
        setField(term653546, term653546.getClass(), "next", null);
        setField(term653546, term653546.getClass(), "first", null);
        setField(term653546, term653546.getClass(), "last", null);
        setField(term653546, term653546.getClass(), "propListHead", null);
        setIntField(term653546, term653546.getClass(), "sourcePosition", 0);
        setField(term653546, term653546.getClass(), "jsType", null);
        setField(term653546, term653546.getClass(), "parent", null);
        setField(term653544, term653544.getClass(), "next", term653546);
        setField(term653544, term653544.getClass(), "first", null);
        setField(term653544, term653544.getClass(), "last", null);
        setField(term653544, term653544.getClass(), "propListHead", null);
        setIntField(term653544, term653544.getClass(), "sourcePosition", 0);
        setField(term653544, term653544.getClass(), "jsType", null);
        setField(term653544, term653544.getClass(), "parent", null);
        setField(term653542, term653542.getClass(), "first", term653544);
        setField(term653542, term653542.getClass(), "last", null);
        setField(term653542, term653542.getClass(), "propListHead", null);
        setIntField(term653542, term653542.getClass(), "sourcePosition", 0);
        setField(term653542, term653542.getClass(), "jsType", null);
        setField(term653542, term653542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term653283;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term653191, args);
        assertTrue(recursiveEquals(term653191, term653571));
        assertTrue(recursiveEquals(term653283, term653572));
        assertTrue(recursiveEquals(retValue, term653542));
    }

};


