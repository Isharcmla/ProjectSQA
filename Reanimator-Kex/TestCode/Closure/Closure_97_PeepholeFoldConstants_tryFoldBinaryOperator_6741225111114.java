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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343823;
     Object term343915;
     Object term344279;
     Object term344280;
     Object term344239;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term343915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term344007, term344007.getClass(), "next", term344099);
        setIntField(term344007, term344007.getClass(), "type", 63);
        setField(term343915, term343915.getClass(), "first", term344007);
        setIntField(term343915, term343915.getClass(), "type", 35);
        term344279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term344279, term344279.getClass(), "currentTraversal", null);
        term344280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term344280, term344280.getClass(), "number", 0.0);
        setIntField(term344280, term344280.getClass(), "type", 35);
        setField(term344280, term344280.getClass(), "next", null);
        setDoubleField(term344281, term344281.getClass(), "number", 0.0);
        setIntField(term344281, term344281.getClass(), "type", 63);
        setDoubleField(term344282, term344282.getClass(), "number", 0.0);
        setIntField(term344282, term344282.getClass(), "type", 0);
        setField(term344282, term344282.getClass(), "next", null);
        setField(term344282, term344282.getClass(), "first", null);
        setField(term344282, term344282.getClass(), "last", null);
        setField(term344282, term344282.getClass(), "propListHead", null);
        setIntField(term344282, term344282.getClass(), "sourcePosition", 0);
        setField(term344282, term344282.getClass(), "jsType", null);
        setField(term344282, term344282.getClass(), "parent", null);
        setField(term344281, term344281.getClass(), "next", term344282);
        setField(term344281, term344281.getClass(), "first", null);
        setField(term344281, term344281.getClass(), "last", null);
        setField(term344281, term344281.getClass(), "propListHead", null);
        setIntField(term344281, term344281.getClass(), "sourcePosition", 0);
        setField(term344281, term344281.getClass(), "jsType", null);
        setField(term344281, term344281.getClass(), "parent", null);
        setField(term344280, term344280.getClass(), "first", term344281);
        setField(term344280, term344280.getClass(), "last", null);
        setField(term344280, term344280.getClass(), "propListHead", null);
        setIntField(term344280, term344280.getClass(), "sourcePosition", 0);
        setField(term344280, term344280.getClass(), "jsType", null);
        setField(term344280, term344280.getClass(), "parent", null);
        term344239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344242 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term344239, term344239.getClass(), "number", 0.0);
        setIntField(term344239, term344239.getClass(), "type", 35);
        setField(term344239, term344239.getClass(), "next", null);
        setDoubleField(term344242, term344242.getClass(), "number", 0.0);
        setIntField(term344242, term344242.getClass(), "type", 63);
        setDoubleField(term344245, term344245.getClass(), "number", 0.0);
        setIntField(term344245, term344245.getClass(), "type", 0);
        setField(term344245, term344245.getClass(), "next", null);
        setField(term344245, term344245.getClass(), "first", null);
        setField(term344245, term344245.getClass(), "last", null);
        setField(term344245, term344245.getClass(), "propListHead", null);
        setIntField(term344245, term344245.getClass(), "sourcePosition", 0);
        setField(term344245, term344245.getClass(), "jsType", null);
        setField(term344245, term344245.getClass(), "parent", null);
        setField(term344242, term344242.getClass(), "next", term344245);
        setField(term344242, term344242.getClass(), "first", null);
        setField(term344242, term344242.getClass(), "last", null);
        setField(term344242, term344242.getClass(), "propListHead", null);
        setIntField(term344242, term344242.getClass(), "sourcePosition", 0);
        setField(term344242, term344242.getClass(), "jsType", null);
        setField(term344242, term344242.getClass(), "parent", null);
        setField(term344239, term344239.getClass(), "first", term344242);
        setField(term344239, term344239.getClass(), "last", null);
        setField(term344239, term344239.getClass(), "propListHead", null);
        setIntField(term344239, term344239.getClass(), "sourcePosition", 0);
        setField(term344239, term344239.getClass(), "jsType", null);
        setField(term344239, term344239.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term343915;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term343823, args);
        assertTrue(recursiveEquals(term343823, term344279));
        assertTrue(recursiveEquals(term343915, term344280));
        assertTrue(recursiveEquals(retValue, term344239));
    }

};


