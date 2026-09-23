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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144269;
     Object term144361;
     Object term144597;
     Object term144598;
     Object term144570;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144269 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term144361 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term144361, term144361.getClass(), "first", term144361);
        setField(term144361, term144361.getClass(), "next", term144453);
        setIntField(term144361, term144361.getClass(), "type", 33);
        term144597 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term144597, term144597.getClass(), "currentTraversal", null);
        term144598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term144598, term144598.getClass(), "number", 0.0);
        setIntField(term144598, term144598.getClass(), "type", 33);
        setField(term144599, term144599.getClass(), "str", null);
        setIntField(term144599, term144599.getClass(), "type", 0);
        setField(term144599, term144599.getClass(), "next", null);
        setField(term144599, term144599.getClass(), "first", null);
        setField(term144599, term144599.getClass(), "last", null);
        setField(term144599, term144599.getClass(), "propListHead", null);
        setIntField(term144599, term144599.getClass(), "sourcePosition", 0);
        setField(term144599, term144599.getClass(), "jsType", null);
        setField(term144599, term144599.getClass(), "parent", null);
        setField(term144598, term144598.getClass(), "next", term144599);
        setField(term144598, term144598.getClass(), "first", term144598);
        setField(term144598, term144598.getClass(), "last", null);
        setField(term144598, term144598.getClass(), "propListHead", null);
        setIntField(term144598, term144598.getClass(), "sourcePosition", 0);
        setField(term144598, term144598.getClass(), "jsType", null);
        setField(term144598, term144598.getClass(), "parent", null);
        term144570 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144573 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term144570, term144570.getClass(), "number", 0.0);
        setIntField(term144570, term144570.getClass(), "type", 33);
        setField(term144573, term144573.getClass(), "str", null);
        setIntField(term144573, term144573.getClass(), "type", 0);
        setField(term144573, term144573.getClass(), "next", null);
        setField(term144573, term144573.getClass(), "first", null);
        setField(term144573, term144573.getClass(), "last", null);
        setField(term144573, term144573.getClass(), "propListHead", null);
        setIntField(term144573, term144573.getClass(), "sourcePosition", 0);
        setField(term144573, term144573.getClass(), "jsType", null);
        setField(term144573, term144573.getClass(), "parent", null);
        setField(term144570, term144570.getClass(), "next", term144573);
        setField(term144570, term144570.getClass(), "first", term144570);
        setField(term144570, term144570.getClass(), "last", null);
        setField(term144570, term144570.getClass(), "propListHead", null);
        setIntField(term144570, term144570.getClass(), "sourcePosition", 0);
        setField(term144570, term144570.getClass(), "jsType", null);
        setField(term144570, term144570.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144361;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term144269, args);
        assertTrue(recursiveEquals(term144269, term144597));
        assertTrue(recursiveEquals(term144361, term144598));
        assertTrue(recursiveEquals(retValue, term144570));
    }

};


