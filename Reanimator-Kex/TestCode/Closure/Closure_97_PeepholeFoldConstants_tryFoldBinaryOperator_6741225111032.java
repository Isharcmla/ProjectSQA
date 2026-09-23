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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322199;
     Object term322291;
     Object term322520;
     Object term322521;
     Object term322484;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322199 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term322291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term322383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term322475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term322383, term322383.getClass(), "next", term322475);
        setIntField(term322383, term322383.getClass(), "type", 39);
        setField(term322291, term322291.getClass(), "first", term322383);
        setIntField(term322291, term322291.getClass(), "type", 22);
        term322520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term322520, term322520.getClass(), "currentTraversal", null);
        term322521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term322522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term322523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term322521, term322521.getClass(), "number", 0.0);
        setIntField(term322521, term322521.getClass(), "type", 22);
        setField(term322521, term322521.getClass(), "next", null);
        setDoubleField(term322522, term322522.getClass(), "number", 0.0);
        setIntField(term322522, term322522.getClass(), "type", 39);
        setDoubleField(term322523, term322523.getClass(), "number", 0.0);
        setIntField(term322523, term322523.getClass(), "type", 0);
        setField(term322523, term322523.getClass(), "next", null);
        setField(term322523, term322523.getClass(), "first", null);
        setField(term322523, term322523.getClass(), "last", null);
        setField(term322523, term322523.getClass(), "propListHead", null);
        setIntField(term322523, term322523.getClass(), "sourcePosition", 0);
        setField(term322523, term322523.getClass(), "jsType", null);
        setField(term322523, term322523.getClass(), "parent", null);
        setField(term322522, term322522.getClass(), "next", term322523);
        setField(term322522, term322522.getClass(), "first", null);
        setField(term322522, term322522.getClass(), "last", null);
        setField(term322522, term322522.getClass(), "propListHead", null);
        setIntField(term322522, term322522.getClass(), "sourcePosition", 0);
        setField(term322522, term322522.getClass(), "jsType", null);
        setField(term322522, term322522.getClass(), "parent", null);
        setField(term322521, term322521.getClass(), "first", term322522);
        setField(term322521, term322521.getClass(), "last", null);
        setField(term322521, term322521.getClass(), "propListHead", null);
        setIntField(term322521, term322521.getClass(), "sourcePosition", 0);
        setField(term322521, term322521.getClass(), "jsType", null);
        setField(term322521, term322521.getClass(), "parent", null);
        term322484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term322487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term322490 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term322484, term322484.getClass(), "number", 0.0);
        setIntField(term322484, term322484.getClass(), "type", 22);
        setField(term322484, term322484.getClass(), "next", null);
        setDoubleField(term322487, term322487.getClass(), "number", 0.0);
        setIntField(term322487, term322487.getClass(), "type", 39);
        setDoubleField(term322490, term322490.getClass(), "number", 0.0);
        setIntField(term322490, term322490.getClass(), "type", 0);
        setField(term322490, term322490.getClass(), "next", null);
        setField(term322490, term322490.getClass(), "first", null);
        setField(term322490, term322490.getClass(), "last", null);
        setField(term322490, term322490.getClass(), "propListHead", null);
        setIntField(term322490, term322490.getClass(), "sourcePosition", 0);
        setField(term322490, term322490.getClass(), "jsType", null);
        setField(term322490, term322490.getClass(), "parent", null);
        setField(term322487, term322487.getClass(), "next", term322490);
        setField(term322487, term322487.getClass(), "first", null);
        setField(term322487, term322487.getClass(), "last", null);
        setField(term322487, term322487.getClass(), "propListHead", null);
        setIntField(term322487, term322487.getClass(), "sourcePosition", 0);
        setField(term322487, term322487.getClass(), "jsType", null);
        setField(term322487, term322487.getClass(), "parent", null);
        setField(term322484, term322484.getClass(), "first", term322487);
        setField(term322484, term322484.getClass(), "last", null);
        setField(term322484, term322484.getClass(), "propListHead", null);
        setIntField(term322484, term322484.getClass(), "sourcePosition", 0);
        setField(term322484, term322484.getClass(), "jsType", null);
        setField(term322484, term322484.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term322291;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term322199, args);
        assertTrue(recursiveEquals(term322199, term322520));
        assertTrue(recursiveEquals(term322291, term322521));
        assertTrue(recursiveEquals(retValue, term322484));
    }

};


