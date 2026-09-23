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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172366;
     Object term172458;
     Object term173098;
     Object term173099;
     Object term173056;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172366 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term172458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term172550, term172550.getClass(), "next", term172642);
        setIntField(term172550, term172550.getClass(), "type", 16);
        setField(term172458, term172458.getClass(), "first", term172550);
        setIntField(term172458, term172458.getClass(), "type", 16);
        term173098 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term173098, term173098.getClass(), "currentTraversal", null);
        term173099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term173099, term173099.getClass(), "str", null);
        setIntField(term173099, term173099.getClass(), "type", 16);
        setField(term173099, term173099.getClass(), "next", null);
        setField(term173100, term173100.getClass(), "str", null);
        setIntField(term173100, term173100.getClass(), "type", 16);
        setField(term173101, term173101.getClass(), "str", null);
        setIntField(term173101, term173101.getClass(), "type", 0);
        setField(term173101, term173101.getClass(), "next", null);
        setField(term173101, term173101.getClass(), "first", null);
        setField(term173101, term173101.getClass(), "last", null);
        setField(term173101, term173101.getClass(), "propListHead", null);
        setIntField(term173101, term173101.getClass(), "sourcePosition", 0);
        setField(term173101, term173101.getClass(), "jsType", null);
        setField(term173101, term173101.getClass(), "parent", null);
        setField(term173100, term173100.getClass(), "next", term173101);
        setField(term173100, term173100.getClass(), "first", null);
        setField(term173100, term173100.getClass(), "last", null);
        setField(term173100, term173100.getClass(), "propListHead", null);
        setIntField(term173100, term173100.getClass(), "sourcePosition", 0);
        setField(term173100, term173100.getClass(), "jsType", null);
        setField(term173100, term173100.getClass(), "parent", null);
        setField(term173099, term173099.getClass(), "first", term173100);
        setField(term173099, term173099.getClass(), "last", null);
        setField(term173099, term173099.getClass(), "propListHead", null);
        setIntField(term173099, term173099.getClass(), "sourcePosition", 0);
        setField(term173099, term173099.getClass(), "jsType", null);
        setField(term173099, term173099.getClass(), "parent", null);
        term173056 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173060 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term173056, term173056.getClass(), "str", null);
        setIntField(term173056, term173056.getClass(), "type", 16);
        setField(term173056, term173056.getClass(), "next", null);
        setField(term173058, term173058.getClass(), "str", null);
        setIntField(term173058, term173058.getClass(), "type", 16);
        setField(term173060, term173060.getClass(), "str", null);
        setIntField(term173060, term173060.getClass(), "type", 0);
        setField(term173060, term173060.getClass(), "next", null);
        setField(term173060, term173060.getClass(), "first", null);
        setField(term173060, term173060.getClass(), "last", null);
        setField(term173060, term173060.getClass(), "propListHead", null);
        setIntField(term173060, term173060.getClass(), "sourcePosition", 0);
        setField(term173060, term173060.getClass(), "jsType", null);
        setField(term173060, term173060.getClass(), "parent", null);
        setField(term173058, term173058.getClass(), "next", term173060);
        setField(term173058, term173058.getClass(), "first", null);
        setField(term173058, term173058.getClass(), "last", null);
        setField(term173058, term173058.getClass(), "propListHead", null);
        setIntField(term173058, term173058.getClass(), "sourcePosition", 0);
        setField(term173058, term173058.getClass(), "jsType", null);
        setField(term173058, term173058.getClass(), "parent", null);
        setField(term173056, term173056.getClass(), "first", term173058);
        setField(term173056, term173056.getClass(), "last", null);
        setField(term173056, term173056.getClass(), "propListHead", null);
        setIntField(term173056, term173056.getClass(), "sourcePosition", 0);
        setField(term173056, term173056.getClass(), "jsType", null);
        setField(term173056, term173056.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term172458;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term172366, args);
        assertTrue(recursiveEquals(term172366, term173098));
        assertTrue(recursiveEquals(term172458, term173099));
        assertTrue(recursiveEquals(retValue, term173056));
    }

};


