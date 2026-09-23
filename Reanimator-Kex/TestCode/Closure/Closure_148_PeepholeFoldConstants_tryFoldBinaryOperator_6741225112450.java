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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684925;
     Object term685017;
     Object term685276;
     Object term685277;
     Object term685216;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684925 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term685017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term685109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term685201 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term685109, term685109.getClass(), "next", term685201);
        setIntField(term685109, term685109.getClass(), "type", 0);
        setField(term685017, term685017.getClass(), "first", term685109);
        setIntField(term685017, term685017.getClass(), "type", 100);
        setField(term685017, term685017.getClass(), "parent", null);
        term685276 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term685276, term685276.getClass(), "currentTraversal", null);
        term685277 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term685278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term685279 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term685277, term685277.getClass(), "number", 0.0);
        setIntField(term685277, term685277.getClass(), "type", 100);
        setField(term685277, term685277.getClass(), "next", null);
        setDoubleField(term685278, term685278.getClass(), "number", 0.0);
        setIntField(term685278, term685278.getClass(), "type", 0);
        setDoubleField(term685279, term685279.getClass(), "number", 0.0);
        setIntField(term685279, term685279.getClass(), "type", 0);
        setField(term685279, term685279.getClass(), "next", null);
        setField(term685279, term685279.getClass(), "first", null);
        setField(term685279, term685279.getClass(), "last", null);
        setField(term685279, term685279.getClass(), "propListHead", null);
        setIntField(term685279, term685279.getClass(), "sourcePosition", 0);
        setField(term685279, term685279.getClass(), "jsType", null);
        setField(term685279, term685279.getClass(), "parent", null);
        setField(term685278, term685278.getClass(), "next", term685279);
        setField(term685278, term685278.getClass(), "first", null);
        setField(term685278, term685278.getClass(), "last", null);
        setField(term685278, term685278.getClass(), "propListHead", null);
        setIntField(term685278, term685278.getClass(), "sourcePosition", 0);
        setField(term685278, term685278.getClass(), "jsType", null);
        setField(term685278, term685278.getClass(), "parent", null);
        setField(term685277, term685277.getClass(), "first", term685278);
        setField(term685277, term685277.getClass(), "last", null);
        setField(term685277, term685277.getClass(), "propListHead", null);
        setIntField(term685277, term685277.getClass(), "sourcePosition", 0);
        setField(term685277, term685277.getClass(), "jsType", null);
        setField(term685277, term685277.getClass(), "parent", null);
        term685216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term685219 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term685222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term685216, term685216.getClass(), "number", 0.0);
        setIntField(term685216, term685216.getClass(), "type", 100);
        setField(term685216, term685216.getClass(), "next", null);
        setDoubleField(term685219, term685219.getClass(), "number", 0.0);
        setIntField(term685219, term685219.getClass(), "type", 0);
        setDoubleField(term685222, term685222.getClass(), "number", 0.0);
        setIntField(term685222, term685222.getClass(), "type", 0);
        setField(term685222, term685222.getClass(), "next", null);
        setField(term685222, term685222.getClass(), "first", null);
        setField(term685222, term685222.getClass(), "last", null);
        setField(term685222, term685222.getClass(), "propListHead", null);
        setIntField(term685222, term685222.getClass(), "sourcePosition", 0);
        setField(term685222, term685222.getClass(), "jsType", null);
        setField(term685222, term685222.getClass(), "parent", null);
        setField(term685219, term685219.getClass(), "next", term685222);
        setField(term685219, term685219.getClass(), "first", null);
        setField(term685219, term685219.getClass(), "last", null);
        setField(term685219, term685219.getClass(), "propListHead", null);
        setIntField(term685219, term685219.getClass(), "sourcePosition", 0);
        setField(term685219, term685219.getClass(), "jsType", null);
        setField(term685219, term685219.getClass(), "parent", null);
        setField(term685216, term685216.getClass(), "first", term685219);
        setField(term685216, term685216.getClass(), "last", null);
        setField(term685216, term685216.getClass(), "propListHead", null);
        setIntField(term685216, term685216.getClass(), "sourcePosition", 0);
        setField(term685216, term685216.getClass(), "jsType", null);
        setField(term685216, term685216.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term685017;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term684925, args);
        assertTrue(recursiveEquals(term684925, term685276));
        assertTrue(recursiveEquals(term685017, term685277));
        assertTrue(recursiveEquals(retValue, term685216));
    }

};


