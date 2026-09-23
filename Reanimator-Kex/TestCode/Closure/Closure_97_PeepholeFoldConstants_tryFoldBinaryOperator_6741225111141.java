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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351202;
     Object term351294;
     Object term351940;
     Object term351941;
     Object term351900;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351202 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term351294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term351386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term351478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term351386, term351386.getClass(), "next", term351478);
        setIntField(term351386, term351386.getClass(), "type", 39);
        setField(term351294, term351294.getClass(), "first", term351386);
        setIntField(term351294, term351294.getClass(), "type", 11);
        term351940 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term351940, term351940.getClass(), "currentTraversal", null);
        term351941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term351942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term351943 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term351941, term351941.getClass(), "number", 0.0);
        setIntField(term351941, term351941.getClass(), "type", 11);
        setField(term351941, term351941.getClass(), "next", null);
        setDoubleField(term351942, term351942.getClass(), "number", 0.0);
        setIntField(term351942, term351942.getClass(), "type", 39);
        setDoubleField(term351943, term351943.getClass(), "number", 0.0);
        setIntField(term351943, term351943.getClass(), "type", 0);
        setField(term351943, term351943.getClass(), "next", null);
        setField(term351943, term351943.getClass(), "first", null);
        setField(term351943, term351943.getClass(), "last", null);
        setField(term351943, term351943.getClass(), "propListHead", null);
        setIntField(term351943, term351943.getClass(), "sourcePosition", 0);
        setField(term351943, term351943.getClass(), "jsType", null);
        setField(term351943, term351943.getClass(), "parent", null);
        setField(term351942, term351942.getClass(), "next", term351943);
        setField(term351942, term351942.getClass(), "first", null);
        setField(term351942, term351942.getClass(), "last", null);
        setField(term351942, term351942.getClass(), "propListHead", null);
        setIntField(term351942, term351942.getClass(), "sourcePosition", 0);
        setField(term351942, term351942.getClass(), "jsType", null);
        setField(term351942, term351942.getClass(), "parent", null);
        setField(term351941, term351941.getClass(), "first", term351942);
        setField(term351941, term351941.getClass(), "last", null);
        setField(term351941, term351941.getClass(), "propListHead", null);
        setIntField(term351941, term351941.getClass(), "sourcePosition", 0);
        setField(term351941, term351941.getClass(), "jsType", null);
        setField(term351941, term351941.getClass(), "parent", null);
        term351900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term351903 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term351906 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term351900, term351900.getClass(), "number", 0.0);
        setIntField(term351900, term351900.getClass(), "type", 11);
        setField(term351900, term351900.getClass(), "next", null);
        setDoubleField(term351903, term351903.getClass(), "number", 0.0);
        setIntField(term351903, term351903.getClass(), "type", 39);
        setDoubleField(term351906, term351906.getClass(), "number", 0.0);
        setIntField(term351906, term351906.getClass(), "type", 0);
        setField(term351906, term351906.getClass(), "next", null);
        setField(term351906, term351906.getClass(), "first", null);
        setField(term351906, term351906.getClass(), "last", null);
        setField(term351906, term351906.getClass(), "propListHead", null);
        setIntField(term351906, term351906.getClass(), "sourcePosition", 0);
        setField(term351906, term351906.getClass(), "jsType", null);
        setField(term351906, term351906.getClass(), "parent", null);
        setField(term351903, term351903.getClass(), "next", term351906);
        setField(term351903, term351903.getClass(), "first", null);
        setField(term351903, term351903.getClass(), "last", null);
        setField(term351903, term351903.getClass(), "propListHead", null);
        setIntField(term351903, term351903.getClass(), "sourcePosition", 0);
        setField(term351903, term351903.getClass(), "jsType", null);
        setField(term351903, term351903.getClass(), "parent", null);
        setField(term351900, term351900.getClass(), "first", term351903);
        setField(term351900, term351900.getClass(), "last", null);
        setField(term351900, term351900.getClass(), "propListHead", null);
        setIntField(term351900, term351900.getClass(), "sourcePosition", 0);
        setField(term351900, term351900.getClass(), "jsType", null);
        setField(term351900, term351900.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term351294;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term351202, args);
        assertTrue(recursiveEquals(term351202, term351940));
        assertTrue(recursiveEquals(term351294, term351941));
        assertTrue(recursiveEquals(retValue, term351900));
    }

};


