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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173832;
     Object term173924;
     Object term174166;
     Object term174167;
     Object term174116;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173832 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term173924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term174108, term174108.getClass(), "type", 42);
        setField(term174016, term174016.getClass(), "next", term174108);
        setIntField(term174016, term174016.getClass(), "type", 42);
        setField(term173924, term173924.getClass(), "first", term174016);
        setIntField(term173924, term173924.getClass(), "type", 14);
        term174166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term174166, term174166.getClass(), "currentTraversal", null);
        term174167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term174167, term174167.getClass(), "number", 0.0);
        setIntField(term174167, term174167.getClass(), "type", 14);
        setField(term174167, term174167.getClass(), "next", null);
        setDoubleField(term174168, term174168.getClass(), "number", 0.0);
        setIntField(term174168, term174168.getClass(), "type", 42);
        setField(term174169, term174169.getClass(), "str", null);
        setIntField(term174169, term174169.getClass(), "type", 42);
        setField(term174169, term174169.getClass(), "next", null);
        setField(term174169, term174169.getClass(), "first", null);
        setField(term174169, term174169.getClass(), "last", null);
        setField(term174169, term174169.getClass(), "propListHead", null);
        setIntField(term174169, term174169.getClass(), "sourcePosition", 0);
        setField(term174169, term174169.getClass(), "jsType", null);
        setField(term174169, term174169.getClass(), "parent", null);
        setField(term174168, term174168.getClass(), "next", term174169);
        setField(term174168, term174168.getClass(), "first", null);
        setField(term174168, term174168.getClass(), "last", null);
        setField(term174168, term174168.getClass(), "propListHead", null);
        setIntField(term174168, term174168.getClass(), "sourcePosition", 0);
        setField(term174168, term174168.getClass(), "jsType", null);
        setField(term174168, term174168.getClass(), "parent", null);
        setField(term174167, term174167.getClass(), "first", term174168);
        setField(term174167, term174167.getClass(), "last", null);
        setField(term174167, term174167.getClass(), "propListHead", null);
        setIntField(term174167, term174167.getClass(), "sourcePosition", 0);
        setField(term174167, term174167.getClass(), "jsType", null);
        setField(term174167, term174167.getClass(), "parent", null);
        term174116 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term174116, term174116.getClass(), "number", 0.0);
        setIntField(term174116, term174116.getClass(), "type", 14);
        setField(term174116, term174116.getClass(), "next", null);
        setDoubleField(term174119, term174119.getClass(), "number", 0.0);
        setIntField(term174119, term174119.getClass(), "type", 42);
        setField(term174122, term174122.getClass(), "str", null);
        setIntField(term174122, term174122.getClass(), "type", 42);
        setField(term174122, term174122.getClass(), "next", null);
        setField(term174122, term174122.getClass(), "first", null);
        setField(term174122, term174122.getClass(), "last", null);
        setField(term174122, term174122.getClass(), "propListHead", null);
        setIntField(term174122, term174122.getClass(), "sourcePosition", 0);
        setField(term174122, term174122.getClass(), "jsType", null);
        setField(term174122, term174122.getClass(), "parent", null);
        setField(term174119, term174119.getClass(), "next", term174122);
        setField(term174119, term174119.getClass(), "first", null);
        setField(term174119, term174119.getClass(), "last", null);
        setField(term174119, term174119.getClass(), "propListHead", null);
        setIntField(term174119, term174119.getClass(), "sourcePosition", 0);
        setField(term174119, term174119.getClass(), "jsType", null);
        setField(term174119, term174119.getClass(), "parent", null);
        setField(term174116, term174116.getClass(), "first", term174119);
        setField(term174116, term174116.getClass(), "last", null);
        setField(term174116, term174116.getClass(), "propListHead", null);
        setIntField(term174116, term174116.getClass(), "sourcePosition", 0);
        setField(term174116, term174116.getClass(), "jsType", null);
        setField(term174116, term174116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term173924;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term173832, args);
        assertTrue(recursiveEquals(term173832, term174166));
        assertTrue(recursiveEquals(term173924, term174167));
        assertTrue(recursiveEquals(retValue, term174116));
    }

};


