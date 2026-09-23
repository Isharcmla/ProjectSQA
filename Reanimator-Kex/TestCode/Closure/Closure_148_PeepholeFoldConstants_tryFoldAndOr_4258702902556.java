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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723224;
     Object term723316;
     Object term723478;
     Object term723570;
     Object term723919;
     Object term723920;
     Object term723922;
     Object term723923;
     Object term723869;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723224 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term723316 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term723386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term723316, term723316.getClass(), "parent", term723386);
        setIntField(term723316, term723316.getClass(), "type", 0);
        term723478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term723478, term723478.getClass(), "type", 0);
        term723570 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term723570, term723570.getClass(), "type", 47);
        term723919 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term723919, term723919.getClass(), "currentTraversal", null);
        term723920 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term723921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term723920, term723920.getClass(), "number", 0.0);
        setIntField(term723920, term723920.getClass(), "type", 0);
        setField(term723920, term723920.getClass(), "next", null);
        setField(term723920, term723920.getClass(), "first", null);
        setField(term723920, term723920.getClass(), "last", null);
        setField(term723920, term723920.getClass(), "propListHead", null);
        setIntField(term723920, term723920.getClass(), "sourcePosition", 0);
        setField(term723920, term723920.getClass(), "jsType", null);
        setIntField(term723921, term723921.getClass(), "type", 0);
        setField(term723921, term723921.getClass(), "next", null);
        setField(term723921, term723921.getClass(), "first", null);
        setField(term723921, term723921.getClass(), "last", null);
        setField(term723921, term723921.getClass(), "propListHead", null);
        setIntField(term723921, term723921.getClass(), "sourcePosition", 0);
        setField(term723921, term723921.getClass(), "jsType", null);
        setField(term723921, term723921.getClass(), "parent", null);
        setField(term723920, term723920.getClass(), "parent", term723921);
        term723922 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term723922, term723922.getClass(), "number", 0.0);
        setIntField(term723922, term723922.getClass(), "type", 0);
        setField(term723922, term723922.getClass(), "next", null);
        setField(term723922, term723922.getClass(), "first", null);
        setField(term723922, term723922.getClass(), "last", null);
        setField(term723922, term723922.getClass(), "propListHead", null);
        setIntField(term723922, term723922.getClass(), "sourcePosition", 0);
        setField(term723922, term723922.getClass(), "jsType", null);
        setField(term723922, term723922.getClass(), "parent", null);
        term723923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term723923, term723923.getClass(), "number", 0.0);
        setIntField(term723923, term723923.getClass(), "type", 47);
        setField(term723923, term723923.getClass(), "next", null);
        setField(term723923, term723923.getClass(), "first", null);
        setField(term723923, term723923.getClass(), "last", null);
        setField(term723923, term723923.getClass(), "propListHead", null);
        setIntField(term723923, term723923.getClass(), "sourcePosition", 0);
        setField(term723923, term723923.getClass(), "jsType", null);
        setField(term723923, term723923.getClass(), "parent", null);
        term723869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term723873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term723869, term723869.getClass(), "number", 0.0);
        setIntField(term723869, term723869.getClass(), "type", 0);
        setField(term723869, term723869.getClass(), "next", null);
        setField(term723869, term723869.getClass(), "first", null);
        setField(term723869, term723869.getClass(), "last", null);
        setField(term723869, term723869.getClass(), "propListHead", null);
        setIntField(term723869, term723869.getClass(), "sourcePosition", 0);
        setField(term723869, term723869.getClass(), "jsType", null);
        setIntField(term723873, term723873.getClass(), "type", 0);
        setField(term723873, term723873.getClass(), "next", null);
        setField(term723873, term723873.getClass(), "first", null);
        setField(term723873, term723873.getClass(), "last", null);
        setField(term723873, term723873.getClass(), "propListHead", null);
        setIntField(term723873, term723873.getClass(), "sourcePosition", 0);
        setField(term723873, term723873.getClass(), "jsType", null);
        setField(term723873, term723873.getClass(), "parent", null);
        setField(term723869, term723869.getClass(), "parent", term723873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term723316;
        args[1] = term723478;
        args[2] = term723570;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term723224, args);
        assertTrue(recursiveEquals(term723224, term723919));
        assertTrue(recursiveEquals(term723316, term723920));
        assertTrue(recursiveEquals(term723478, term723922));
        assertTrue(recursiveEquals(term723570, term723923));
        assertTrue(recursiveEquals(retValue, term723869));
    }

};


