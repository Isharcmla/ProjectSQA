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

public class PeepholeFoldConstants_optimizeSubtree_16065069931932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734796;
     Object term734888;
     Object term735106;
     Object term735107;
     Object term735047;

    public PeepholeFoldConstants_optimizeSubtree_16065069931932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734796 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term734888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term734980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term734888, term734888.getClass(), "type", 37);
        setField(term734888, term734888.getClass(), "first", term734980);
        term735106 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term735106, term735106.getClass(), "currentTraversal", null);
        term735107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term735108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term735107, term735107.getClass(), "number", 0.0);
        setIntField(term735107, term735107.getClass(), "type", 37);
        setField(term735107, term735107.getClass(), "next", null);
        setDoubleField(term735108, term735108.getClass(), "number", 0.0);
        setIntField(term735108, term735108.getClass(), "type", 0);
        setField(term735108, term735108.getClass(), "next", null);
        setField(term735108, term735108.getClass(), "first", null);
        setField(term735108, term735108.getClass(), "last", null);
        setField(term735108, term735108.getClass(), "propListHead", null);
        setIntField(term735108, term735108.getClass(), "sourcePosition", 0);
        setField(term735108, term735108.getClass(), "jsType", null);
        setField(term735108, term735108.getClass(), "parent", null);
        setField(term735107, term735107.getClass(), "first", term735108);
        setField(term735107, term735107.getClass(), "last", null);
        setField(term735107, term735107.getClass(), "propListHead", null);
        setIntField(term735107, term735107.getClass(), "sourcePosition", 0);
        setField(term735107, term735107.getClass(), "jsType", null);
        setField(term735107, term735107.getClass(), "parent", null);
        term735047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term735050 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term735047, term735047.getClass(), "number", 0.0);
        setIntField(term735047, term735047.getClass(), "type", 37);
        setField(term735047, term735047.getClass(), "next", null);
        setDoubleField(term735050, term735050.getClass(), "number", 0.0);
        setIntField(term735050, term735050.getClass(), "type", 0);
        setField(term735050, term735050.getClass(), "next", null);
        setField(term735050, term735050.getClass(), "first", null);
        setField(term735050, term735050.getClass(), "last", null);
        setField(term735050, term735050.getClass(), "propListHead", null);
        setIntField(term735050, term735050.getClass(), "sourcePosition", 0);
        setField(term735050, term735050.getClass(), "jsType", null);
        setField(term735050, term735050.getClass(), "parent", null);
        setField(term735047, term735047.getClass(), "first", term735050);
        setField(term735047, term735047.getClass(), "last", null);
        setField(term735047, term735047.getClass(), "propListHead", null);
        setIntField(term735047, term735047.getClass(), "sourcePosition", 0);
        setField(term735047, term735047.getClass(), "jsType", null);
        setField(term735047, term735047.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term734888;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term734796, args);
        assertTrue(recursiveEquals(term734796, term735106));
        assertTrue(recursiveEquals(term734888, term735107));
        assertTrue(recursiveEquals(retValue, term735047));
    }

};


