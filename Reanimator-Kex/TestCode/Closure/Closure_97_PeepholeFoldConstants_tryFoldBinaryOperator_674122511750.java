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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207226;
     Object term207318;
     Object term216558;
     Object term216559;
     Object term216524;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207226 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term207318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207410 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207502 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term207410, term207410.getClass(), "next", term207502);
        setField(term207318, term207318.getClass(), "first", term207410);
        setIntField(term207318, term207318.getClass(), "type", 18);
        term216558 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term216558, term216558.getClass(), "currentTraversal", null);
        term216559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216560 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term216559, term216559.getClass(), "number", 0.0);
        setIntField(term216559, term216559.getClass(), "type", 18);
        setField(term216559, term216559.getClass(), "next", null);
        setDoubleField(term216560, term216560.getClass(), "number", 0.0);
        setIntField(term216560, term216560.getClass(), "type", 0);
        setDoubleField(term216561, term216561.getClass(), "number", 0.0);
        setIntField(term216561, term216561.getClass(), "type", 0);
        setField(term216561, term216561.getClass(), "next", null);
        setField(term216561, term216561.getClass(), "first", null);
        setField(term216561, term216561.getClass(), "last", null);
        setField(term216561, term216561.getClass(), "propListHead", null);
        setIntField(term216561, term216561.getClass(), "sourcePosition", 0);
        setField(term216561, term216561.getClass(), "jsType", null);
        setField(term216561, term216561.getClass(), "parent", null);
        setField(term216560, term216560.getClass(), "next", term216561);
        setField(term216560, term216560.getClass(), "first", null);
        setField(term216560, term216560.getClass(), "last", null);
        setField(term216560, term216560.getClass(), "propListHead", null);
        setIntField(term216560, term216560.getClass(), "sourcePosition", 0);
        setField(term216560, term216560.getClass(), "jsType", null);
        setField(term216560, term216560.getClass(), "parent", null);
        setField(term216559, term216559.getClass(), "first", term216560);
        setField(term216559, term216559.getClass(), "last", null);
        setField(term216559, term216559.getClass(), "propListHead", null);
        setIntField(term216559, term216559.getClass(), "sourcePosition", 0);
        setField(term216559, term216559.getClass(), "jsType", null);
        setField(term216559, term216559.getClass(), "parent", null);
        term216524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term216524, term216524.getClass(), "number", 0.0);
        setIntField(term216524, term216524.getClass(), "type", 18);
        setField(term216524, term216524.getClass(), "next", null);
        setDoubleField(term216527, term216527.getClass(), "number", 0.0);
        setIntField(term216527, term216527.getClass(), "type", 0);
        setDoubleField(term216530, term216530.getClass(), "number", 0.0);
        setIntField(term216530, term216530.getClass(), "type", 0);
        setField(term216530, term216530.getClass(), "next", null);
        setField(term216530, term216530.getClass(), "first", null);
        setField(term216530, term216530.getClass(), "last", null);
        setField(term216530, term216530.getClass(), "propListHead", null);
        setIntField(term216530, term216530.getClass(), "sourcePosition", 0);
        setField(term216530, term216530.getClass(), "jsType", null);
        setField(term216530, term216530.getClass(), "parent", null);
        setField(term216527, term216527.getClass(), "next", term216530);
        setField(term216527, term216527.getClass(), "first", null);
        setField(term216527, term216527.getClass(), "last", null);
        setField(term216527, term216527.getClass(), "propListHead", null);
        setIntField(term216527, term216527.getClass(), "sourcePosition", 0);
        setField(term216527, term216527.getClass(), "jsType", null);
        setField(term216527, term216527.getClass(), "parent", null);
        setField(term216524, term216524.getClass(), "first", term216527);
        setField(term216524, term216524.getClass(), "last", null);
        setField(term216524, term216524.getClass(), "propListHead", null);
        setIntField(term216524, term216524.getClass(), "sourcePosition", 0);
        setField(term216524, term216524.getClass(), "jsType", null);
        setField(term216524, term216524.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term207318;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term207226, args);
        assertTrue(recursiveEquals(term207226, term216558));
        assertTrue(recursiveEquals(term207318, term216559));
        assertTrue(recursiveEquals(retValue, term216524));
    }

};


