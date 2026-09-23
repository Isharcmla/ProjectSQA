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

public class PeepholeFoldConstants_optimizeSubtree_16065069931711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442444;
     Object term442536;
     Object term443213;
     Object term443214;
     Object term443167;

    public PeepholeFoldConstants_optimizeSubtree_16065069931711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442444 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term442536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442628 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term442536, term442536.getClass(), "type", 33);
        setField(term442536, term442536.getClass(), "first", term442536);
        setField(term442536, term442536.getClass(), "next", term442628);
        term443213 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term443213, term443213.getClass(), "currentTraversal", null);
        term443214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443215 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term443214, term443214.getClass(), "number", 0.0);
        setIntField(term443214, term443214.getClass(), "type", 33);
        setDoubleField(term443215, term443215.getClass(), "number", 0.0);
        setIntField(term443215, term443215.getClass(), "type", 0);
        setField(term443215, term443215.getClass(), "next", null);
        setField(term443215, term443215.getClass(), "first", null);
        setField(term443215, term443215.getClass(), "last", null);
        setField(term443215, term443215.getClass(), "propListHead", null);
        setIntField(term443215, term443215.getClass(), "sourcePosition", 0);
        setField(term443215, term443215.getClass(), "jsType", null);
        setField(term443215, term443215.getClass(), "parent", null);
        setField(term443214, term443214.getClass(), "next", term443215);
        setField(term443214, term443214.getClass(), "first", term443214);
        setField(term443214, term443214.getClass(), "last", null);
        setField(term443214, term443214.getClass(), "propListHead", null);
        setIntField(term443214, term443214.getClass(), "sourcePosition", 0);
        setField(term443214, term443214.getClass(), "jsType", null);
        setField(term443214, term443214.getClass(), "parent", null);
        term443167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443170 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term443167, term443167.getClass(), "number", 0.0);
        setIntField(term443167, term443167.getClass(), "type", 33);
        setDoubleField(term443170, term443170.getClass(), "number", 0.0);
        setIntField(term443170, term443170.getClass(), "type", 0);
        setField(term443170, term443170.getClass(), "next", null);
        setField(term443170, term443170.getClass(), "first", null);
        setField(term443170, term443170.getClass(), "last", null);
        setField(term443170, term443170.getClass(), "propListHead", null);
        setIntField(term443170, term443170.getClass(), "sourcePosition", 0);
        setField(term443170, term443170.getClass(), "jsType", null);
        setField(term443170, term443170.getClass(), "parent", null);
        setField(term443167, term443167.getClass(), "next", term443170);
        setField(term443167, term443167.getClass(), "first", term443167);
        setField(term443167, term443167.getClass(), "last", null);
        setField(term443167, term443167.getClass(), "propListHead", null);
        setIntField(term443167, term443167.getClass(), "sourcePosition", 0);
        setField(term443167, term443167.getClass(), "jsType", null);
        setField(term443167, term443167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term442536;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term442444, args);
        assertTrue(recursiveEquals(term442444, term443213));
        assertTrue(recursiveEquals(term442536, term443214));
        assertTrue(recursiveEquals(retValue, term443167));
    }

};


