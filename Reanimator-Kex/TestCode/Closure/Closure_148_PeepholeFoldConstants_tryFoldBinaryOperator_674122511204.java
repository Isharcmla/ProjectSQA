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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39040;
     Object term39132;
     Object term39492;
     Object term39493;
     Object term39434;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39040 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term39132 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term39202, term39202.getClass(), "next", term39294);
        setIntField(term39202, term39202.getClass(), "type", 0);
        setField(term39132, term39132.getClass(), "first", term39202);
        setIntField(term39132, term39132.getClass(), "type", 101);
        setField(term39132, term39132.getClass(), "parent", null);
        term39492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term39492, term39492.getClass(), "currentTraversal", null);
        term39493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term39493, term39493.getClass(), "number", 0.0);
        setIntField(term39493, term39493.getClass(), "type", 101);
        setField(term39493, term39493.getClass(), "next", null);
        setIntField(term39494, term39494.getClass(), "type", 0);
        setDoubleField(term39495, term39495.getClass(), "number", 0.0);
        setIntField(term39495, term39495.getClass(), "type", 0);
        setField(term39495, term39495.getClass(), "next", null);
        setField(term39495, term39495.getClass(), "first", null);
        setField(term39495, term39495.getClass(), "last", null);
        setField(term39495, term39495.getClass(), "propListHead", null);
        setIntField(term39495, term39495.getClass(), "sourcePosition", 0);
        setField(term39495, term39495.getClass(), "jsType", null);
        setField(term39495, term39495.getClass(), "parent", null);
        setField(term39494, term39494.getClass(), "next", term39495);
        setField(term39494, term39494.getClass(), "first", null);
        setField(term39494, term39494.getClass(), "last", null);
        setField(term39494, term39494.getClass(), "propListHead", null);
        setIntField(term39494, term39494.getClass(), "sourcePosition", 0);
        setField(term39494, term39494.getClass(), "jsType", null);
        setField(term39494, term39494.getClass(), "parent", null);
        setField(term39493, term39493.getClass(), "first", term39494);
        setField(term39493, term39493.getClass(), "last", null);
        setField(term39493, term39493.getClass(), "propListHead", null);
        setIntField(term39493, term39493.getClass(), "sourcePosition", 0);
        setField(term39493, term39493.getClass(), "jsType", null);
        setField(term39493, term39493.getClass(), "parent", null);
        term39434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term39434, term39434.getClass(), "number", 0.0);
        setIntField(term39434, term39434.getClass(), "type", 101);
        setField(term39434, term39434.getClass(), "next", null);
        setIntField(term39437, term39437.getClass(), "type", 0);
        setDoubleField(term39439, term39439.getClass(), "number", 0.0);
        setIntField(term39439, term39439.getClass(), "type", 0);
        setField(term39439, term39439.getClass(), "next", null);
        setField(term39439, term39439.getClass(), "first", null);
        setField(term39439, term39439.getClass(), "last", null);
        setField(term39439, term39439.getClass(), "propListHead", null);
        setIntField(term39439, term39439.getClass(), "sourcePosition", 0);
        setField(term39439, term39439.getClass(), "jsType", null);
        setField(term39439, term39439.getClass(), "parent", null);
        setField(term39437, term39437.getClass(), "next", term39439);
        setField(term39437, term39437.getClass(), "first", null);
        setField(term39437, term39437.getClass(), "last", null);
        setField(term39437, term39437.getClass(), "propListHead", null);
        setIntField(term39437, term39437.getClass(), "sourcePosition", 0);
        setField(term39437, term39437.getClass(), "jsType", null);
        setField(term39437, term39437.getClass(), "parent", null);
        setField(term39434, term39434.getClass(), "first", term39437);
        setField(term39434, term39434.getClass(), "last", null);
        setField(term39434, term39434.getClass(), "propListHead", null);
        setIntField(term39434, term39434.getClass(), "sourcePosition", 0);
        setField(term39434, term39434.getClass(), "jsType", null);
        setField(term39434, term39434.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39132;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term39040, args);
        assertTrue(recursiveEquals(term39040, term39492));
        assertTrue(recursiveEquals(term39132, term39493));
        assertTrue(recursiveEquals(retValue, term39434));
    }

};


