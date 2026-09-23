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

public class PeepholeFoldConstants_optimizeSubtree_16065069931906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727931;
     Object term728023;
     Object term728262;
     Object term728263;
     Object term728209;

    public PeepholeFoldConstants_optimizeSubtree_16065069931906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term727931 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term728023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term728023, term728023.getClass(), "type", 35);
        setField(term728115, term728115.getClass(), "next", term728207);
        setIntField(term728115, term728115.getClass(), "type", 63);
        setField(term728023, term728023.getClass(), "first", term728115);
        term728262 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term728262, term728262.getClass(), "currentTraversal", null);
        term728263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728265 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term728263, term728263.getClass(), "str", null);
        setIntField(term728263, term728263.getClass(), "type", 35);
        setField(term728263, term728263.getClass(), "next", null);
        setField(term728264, term728264.getClass(), "str", null);
        setIntField(term728264, term728264.getClass(), "type", 63);
        setDoubleField(term728265, term728265.getClass(), "number", 0.0);
        setIntField(term728265, term728265.getClass(), "type", 0);
        setField(term728265, term728265.getClass(), "next", null);
        setField(term728265, term728265.getClass(), "first", null);
        setField(term728265, term728265.getClass(), "last", null);
        setField(term728265, term728265.getClass(), "propListHead", null);
        setIntField(term728265, term728265.getClass(), "sourcePosition", 0);
        setField(term728265, term728265.getClass(), "jsType", null);
        setField(term728265, term728265.getClass(), "parent", null);
        setField(term728264, term728264.getClass(), "next", term728265);
        setField(term728264, term728264.getClass(), "first", null);
        setField(term728264, term728264.getClass(), "last", null);
        setField(term728264, term728264.getClass(), "propListHead", null);
        setIntField(term728264, term728264.getClass(), "sourcePosition", 0);
        setField(term728264, term728264.getClass(), "jsType", null);
        setField(term728264, term728264.getClass(), "parent", null);
        setField(term728263, term728263.getClass(), "first", term728264);
        setField(term728263, term728263.getClass(), "last", null);
        setField(term728263, term728263.getClass(), "propListHead", null);
        setIntField(term728263, term728263.getClass(), "sourcePosition", 0);
        setField(term728263, term728263.getClass(), "jsType", null);
        setField(term728263, term728263.getClass(), "parent", null);
        term728209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728213 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term728209, term728209.getClass(), "str", null);
        setIntField(term728209, term728209.getClass(), "type", 35);
        setField(term728209, term728209.getClass(), "next", null);
        setField(term728211, term728211.getClass(), "str", null);
        setIntField(term728211, term728211.getClass(), "type", 63);
        setDoubleField(term728213, term728213.getClass(), "number", 0.0);
        setIntField(term728213, term728213.getClass(), "type", 0);
        setField(term728213, term728213.getClass(), "next", null);
        setField(term728213, term728213.getClass(), "first", null);
        setField(term728213, term728213.getClass(), "last", null);
        setField(term728213, term728213.getClass(), "propListHead", null);
        setIntField(term728213, term728213.getClass(), "sourcePosition", 0);
        setField(term728213, term728213.getClass(), "jsType", null);
        setField(term728213, term728213.getClass(), "parent", null);
        setField(term728211, term728211.getClass(), "next", term728213);
        setField(term728211, term728211.getClass(), "first", null);
        setField(term728211, term728211.getClass(), "last", null);
        setField(term728211, term728211.getClass(), "propListHead", null);
        setIntField(term728211, term728211.getClass(), "sourcePosition", 0);
        setField(term728211, term728211.getClass(), "jsType", null);
        setField(term728211, term728211.getClass(), "parent", null);
        setField(term728209, term728209.getClass(), "first", term728211);
        setField(term728209, term728209.getClass(), "last", null);
        setField(term728209, term728209.getClass(), "propListHead", null);
        setIntField(term728209, term728209.getClass(), "sourcePosition", 0);
        setField(term728209, term728209.getClass(), "jsType", null);
        setField(term728209, term728209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term728023;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term727931, args);
        assertTrue(recursiveEquals(term727931, term728262));
        assertTrue(recursiveEquals(term728023, term728263));
        assertTrue(recursiveEquals(retValue, term728209));
    }

};


