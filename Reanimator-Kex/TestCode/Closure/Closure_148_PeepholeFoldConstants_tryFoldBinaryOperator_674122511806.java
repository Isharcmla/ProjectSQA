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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182941;
     Object term183033;
     Object term183383;
     Object term183384;
     Object term183338;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182941 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term183033 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term183125, term183125.getClass(), "next", term183217);
        setIntField(term183125, term183125.getClass(), "type", 16);
        setField(term183033, term183033.getClass(), "first", term183125);
        setIntField(term183033, term183033.getClass(), "type", 16);
        term183383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term183383, term183383.getClass(), "currentTraversal", null);
        term183384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term183384, term183384.getClass(), "str", null);
        setIntField(term183384, term183384.getClass(), "type", 16);
        setField(term183384, term183384.getClass(), "next", null);
        setField(term183385, term183385.getClass(), "str", null);
        setIntField(term183385, term183385.getClass(), "type", 16);
        setDoubleField(term183386, term183386.getClass(), "number", 0.0);
        setIntField(term183386, term183386.getClass(), "type", 0);
        setField(term183386, term183386.getClass(), "next", null);
        setField(term183386, term183386.getClass(), "first", null);
        setField(term183386, term183386.getClass(), "last", null);
        setField(term183386, term183386.getClass(), "propListHead", null);
        setIntField(term183386, term183386.getClass(), "sourcePosition", 0);
        setField(term183386, term183386.getClass(), "jsType", null);
        setField(term183386, term183386.getClass(), "parent", null);
        setField(term183385, term183385.getClass(), "next", term183386);
        setField(term183385, term183385.getClass(), "first", null);
        setField(term183385, term183385.getClass(), "last", null);
        setField(term183385, term183385.getClass(), "propListHead", null);
        setIntField(term183385, term183385.getClass(), "sourcePosition", 0);
        setField(term183385, term183385.getClass(), "jsType", null);
        setField(term183385, term183385.getClass(), "parent", null);
        setField(term183384, term183384.getClass(), "first", term183385);
        setField(term183384, term183384.getClass(), "last", null);
        setField(term183384, term183384.getClass(), "propListHead", null);
        setIntField(term183384, term183384.getClass(), "sourcePosition", 0);
        setField(term183384, term183384.getClass(), "jsType", null);
        setField(term183384, term183384.getClass(), "parent", null);
        term183338 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term183342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term183338, term183338.getClass(), "str", null);
        setIntField(term183338, term183338.getClass(), "type", 16);
        setField(term183338, term183338.getClass(), "next", null);
        setField(term183340, term183340.getClass(), "str", null);
        setIntField(term183340, term183340.getClass(), "type", 16);
        setDoubleField(term183342, term183342.getClass(), "number", 0.0);
        setIntField(term183342, term183342.getClass(), "type", 0);
        setField(term183342, term183342.getClass(), "next", null);
        setField(term183342, term183342.getClass(), "first", null);
        setField(term183342, term183342.getClass(), "last", null);
        setField(term183342, term183342.getClass(), "propListHead", null);
        setIntField(term183342, term183342.getClass(), "sourcePosition", 0);
        setField(term183342, term183342.getClass(), "jsType", null);
        setField(term183342, term183342.getClass(), "parent", null);
        setField(term183340, term183340.getClass(), "next", term183342);
        setField(term183340, term183340.getClass(), "first", null);
        setField(term183340, term183340.getClass(), "last", null);
        setField(term183340, term183340.getClass(), "propListHead", null);
        setIntField(term183340, term183340.getClass(), "sourcePosition", 0);
        setField(term183340, term183340.getClass(), "jsType", null);
        setField(term183340, term183340.getClass(), "parent", null);
        setField(term183338, term183338.getClass(), "first", term183340);
        setField(term183338, term183338.getClass(), "last", null);
        setField(term183338, term183338.getClass(), "propListHead", null);
        setIntField(term183338, term183338.getClass(), "sourcePosition", 0);
        setField(term183338, term183338.getClass(), "jsType", null);
        setField(term183338, term183338.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term183033;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term182941, args);
        assertTrue(recursiveEquals(term182941, term183383));
        assertTrue(recursiveEquals(term183033, term183384));
        assertTrue(recursiveEquals(retValue, term183338));
    }

};


