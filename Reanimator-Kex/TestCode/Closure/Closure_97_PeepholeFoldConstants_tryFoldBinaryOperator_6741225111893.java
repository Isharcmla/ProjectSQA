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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723849;
     Object term723941;
     Object term724676;
     Object term724677;
     Object term724640;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723849 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term723941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term724033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term724125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term724033, term724033.getClass(), "next", term724125);
        setIntField(term724033, term724033.getClass(), "type", 39);
        setField(term723941, term723941.getClass(), "first", term724033);
        setIntField(term723941, term723941.getClass(), "type", 18);
        term724676 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term724676, term724676.getClass(), "currentTraversal", null);
        term724677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term724678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term724679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term724677, term724677.getClass(), "number", 0.0);
        setIntField(term724677, term724677.getClass(), "type", 18);
        setField(term724677, term724677.getClass(), "next", null);
        setDoubleField(term724678, term724678.getClass(), "number", 0.0);
        setIntField(term724678, term724678.getClass(), "type", 39);
        setDoubleField(term724679, term724679.getClass(), "number", 0.0);
        setIntField(term724679, term724679.getClass(), "type", 0);
        setField(term724679, term724679.getClass(), "next", null);
        setField(term724679, term724679.getClass(), "first", null);
        setField(term724679, term724679.getClass(), "last", null);
        setField(term724679, term724679.getClass(), "propListHead", null);
        setIntField(term724679, term724679.getClass(), "sourcePosition", 0);
        setField(term724679, term724679.getClass(), "jsType", null);
        setField(term724679, term724679.getClass(), "parent", null);
        setField(term724678, term724678.getClass(), "next", term724679);
        setField(term724678, term724678.getClass(), "first", null);
        setField(term724678, term724678.getClass(), "last", null);
        setField(term724678, term724678.getClass(), "propListHead", null);
        setIntField(term724678, term724678.getClass(), "sourcePosition", 0);
        setField(term724678, term724678.getClass(), "jsType", null);
        setField(term724678, term724678.getClass(), "parent", null);
        setField(term724677, term724677.getClass(), "first", term724678);
        setField(term724677, term724677.getClass(), "last", null);
        setField(term724677, term724677.getClass(), "propListHead", null);
        setIntField(term724677, term724677.getClass(), "sourcePosition", 0);
        setField(term724677, term724677.getClass(), "jsType", null);
        setField(term724677, term724677.getClass(), "parent", null);
        term724640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term724643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term724646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term724640, term724640.getClass(), "number", 0.0);
        setIntField(term724640, term724640.getClass(), "type", 18);
        setField(term724640, term724640.getClass(), "next", null);
        setDoubleField(term724643, term724643.getClass(), "number", 0.0);
        setIntField(term724643, term724643.getClass(), "type", 39);
        setDoubleField(term724646, term724646.getClass(), "number", 0.0);
        setIntField(term724646, term724646.getClass(), "type", 0);
        setField(term724646, term724646.getClass(), "next", null);
        setField(term724646, term724646.getClass(), "first", null);
        setField(term724646, term724646.getClass(), "last", null);
        setField(term724646, term724646.getClass(), "propListHead", null);
        setIntField(term724646, term724646.getClass(), "sourcePosition", 0);
        setField(term724646, term724646.getClass(), "jsType", null);
        setField(term724646, term724646.getClass(), "parent", null);
        setField(term724643, term724643.getClass(), "next", term724646);
        setField(term724643, term724643.getClass(), "first", null);
        setField(term724643, term724643.getClass(), "last", null);
        setField(term724643, term724643.getClass(), "propListHead", null);
        setIntField(term724643, term724643.getClass(), "sourcePosition", 0);
        setField(term724643, term724643.getClass(), "jsType", null);
        setField(term724643, term724643.getClass(), "parent", null);
        setField(term724640, term724640.getClass(), "first", term724643);
        setField(term724640, term724640.getClass(), "last", null);
        setField(term724640, term724640.getClass(), "propListHead", null);
        setIntField(term724640, term724640.getClass(), "sourcePosition", 0);
        setField(term724640, term724640.getClass(), "jsType", null);
        setField(term724640, term724640.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term723941;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term723849, args);
        assertTrue(recursiveEquals(term723849, term724676));
        assertTrue(recursiveEquals(term723941, term724677));
        assertTrue(recursiveEquals(retValue, term724640));
    }

};


