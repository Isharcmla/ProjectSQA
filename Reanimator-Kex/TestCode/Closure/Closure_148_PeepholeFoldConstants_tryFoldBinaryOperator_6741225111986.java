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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530729;
     Object term530821;
     Object term531413;
     Object term531414;
     Object term531357;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term530821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term530913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term530913, term530913.getClass(), "next", term531005);
        setIntField(term530913, term530913.getClass(), "type", 0);
        setField(term530821, term530821.getClass(), "first", term530913);
        setIntField(term530821, term530821.getClass(), "type", 100);
        setField(term530821, term530821.getClass(), "parent", null);
        term531413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term531413, term531413.getClass(), "currentTraversal", null);
        term531414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term531414, term531414.getClass(), "str", null);
        setIntField(term531414, term531414.getClass(), "type", 100);
        setField(term531414, term531414.getClass(), "next", null);
        setField(term531415, term531415.getClass(), "str", null);
        setIntField(term531415, term531415.getClass(), "type", 0);
        setDoubleField(term531416, term531416.getClass(), "number", 0.0);
        setIntField(term531416, term531416.getClass(), "type", 0);
        setField(term531416, term531416.getClass(), "next", null);
        setField(term531416, term531416.getClass(), "first", null);
        setField(term531416, term531416.getClass(), "last", null);
        setField(term531416, term531416.getClass(), "propListHead", null);
        setIntField(term531416, term531416.getClass(), "sourcePosition", 0);
        setField(term531416, term531416.getClass(), "jsType", null);
        setField(term531416, term531416.getClass(), "parent", null);
        setField(term531415, term531415.getClass(), "next", term531416);
        setField(term531415, term531415.getClass(), "first", null);
        setField(term531415, term531415.getClass(), "last", null);
        setField(term531415, term531415.getClass(), "propListHead", null);
        setIntField(term531415, term531415.getClass(), "sourcePosition", 0);
        setField(term531415, term531415.getClass(), "jsType", null);
        setField(term531415, term531415.getClass(), "parent", null);
        setField(term531414, term531414.getClass(), "first", term531415);
        setField(term531414, term531414.getClass(), "last", null);
        setField(term531414, term531414.getClass(), "propListHead", null);
        setIntField(term531414, term531414.getClass(), "sourcePosition", 0);
        setField(term531414, term531414.getClass(), "jsType", null);
        setField(term531414, term531414.getClass(), "parent", null);
        term531357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531361 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term531357, term531357.getClass(), "str", null);
        setIntField(term531357, term531357.getClass(), "type", 100);
        setField(term531357, term531357.getClass(), "next", null);
        setField(term531359, term531359.getClass(), "str", null);
        setIntField(term531359, term531359.getClass(), "type", 0);
        setDoubleField(term531361, term531361.getClass(), "number", 0.0);
        setIntField(term531361, term531361.getClass(), "type", 0);
        setField(term531361, term531361.getClass(), "next", null);
        setField(term531361, term531361.getClass(), "first", null);
        setField(term531361, term531361.getClass(), "last", null);
        setField(term531361, term531361.getClass(), "propListHead", null);
        setIntField(term531361, term531361.getClass(), "sourcePosition", 0);
        setField(term531361, term531361.getClass(), "jsType", null);
        setField(term531361, term531361.getClass(), "parent", null);
        setField(term531359, term531359.getClass(), "next", term531361);
        setField(term531359, term531359.getClass(), "first", null);
        setField(term531359, term531359.getClass(), "last", null);
        setField(term531359, term531359.getClass(), "propListHead", null);
        setIntField(term531359, term531359.getClass(), "sourcePosition", 0);
        setField(term531359, term531359.getClass(), "jsType", null);
        setField(term531359, term531359.getClass(), "parent", null);
        setField(term531357, term531357.getClass(), "first", term531359);
        setField(term531357, term531357.getClass(), "last", null);
        setField(term531357, term531357.getClass(), "propListHead", null);
        setIntField(term531357, term531357.getClass(), "sourcePosition", 0);
        setField(term531357, term531357.getClass(), "jsType", null);
        setField(term531357, term531357.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term530821;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term530729, args);
        assertTrue(recursiveEquals(term530729, term531413));
        assertTrue(recursiveEquals(term530821, term531414));
        assertTrue(recursiveEquals(retValue, term531357));
    }

};


