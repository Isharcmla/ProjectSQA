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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61781;
     Object term61873;
     Object term62416;
     Object term62417;
     Object term62378;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61781 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term61873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61965 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term61965, term61965.getClass(), "next", term62057);
        setField(term61873, term61873.getClass(), "first", term61965);
        setIntField(term61873, term61873.getClass(), "type", 33);
        term62416 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62416, term62416.getClass(), "currentTraversal", null);
        term62417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term62417, term62417.getClass(), "number", 0.0);
        setIntField(term62417, term62417.getClass(), "type", 33);
        setField(term62417, term62417.getClass(), "next", null);
        setDoubleField(term62418, term62418.getClass(), "number", 0.0);
        setIntField(term62418, term62418.getClass(), "type", 0);
        setDoubleField(term62419, term62419.getClass(), "number", 0.0);
        setIntField(term62419, term62419.getClass(), "type", 0);
        setField(term62419, term62419.getClass(), "next", null);
        setField(term62419, term62419.getClass(), "first", null);
        setField(term62419, term62419.getClass(), "last", null);
        setField(term62419, term62419.getClass(), "propListHead", null);
        setIntField(term62419, term62419.getClass(), "sourcePosition", 0);
        setField(term62419, term62419.getClass(), "jsType", null);
        setField(term62419, term62419.getClass(), "parent", null);
        setField(term62418, term62418.getClass(), "next", term62419);
        setField(term62418, term62418.getClass(), "first", null);
        setField(term62418, term62418.getClass(), "last", null);
        setField(term62418, term62418.getClass(), "propListHead", null);
        setIntField(term62418, term62418.getClass(), "sourcePosition", 0);
        setField(term62418, term62418.getClass(), "jsType", null);
        setField(term62418, term62418.getClass(), "parent", null);
        setField(term62417, term62417.getClass(), "first", term62418);
        setField(term62417, term62417.getClass(), "last", null);
        setField(term62417, term62417.getClass(), "propListHead", null);
        setIntField(term62417, term62417.getClass(), "sourcePosition", 0);
        setField(term62417, term62417.getClass(), "jsType", null);
        setField(term62417, term62417.getClass(), "parent", null);
        term62378 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term62378, term62378.getClass(), "number", 0.0);
        setIntField(term62378, term62378.getClass(), "type", 33);
        setField(term62378, term62378.getClass(), "next", null);
        setDoubleField(term62381, term62381.getClass(), "number", 0.0);
        setIntField(term62381, term62381.getClass(), "type", 0);
        setDoubleField(term62384, term62384.getClass(), "number", 0.0);
        setIntField(term62384, term62384.getClass(), "type", 0);
        setField(term62384, term62384.getClass(), "next", null);
        setField(term62384, term62384.getClass(), "first", null);
        setField(term62384, term62384.getClass(), "last", null);
        setField(term62384, term62384.getClass(), "propListHead", null);
        setIntField(term62384, term62384.getClass(), "sourcePosition", 0);
        setField(term62384, term62384.getClass(), "jsType", null);
        setField(term62384, term62384.getClass(), "parent", null);
        setField(term62381, term62381.getClass(), "next", term62384);
        setField(term62381, term62381.getClass(), "first", null);
        setField(term62381, term62381.getClass(), "last", null);
        setField(term62381, term62381.getClass(), "propListHead", null);
        setIntField(term62381, term62381.getClass(), "sourcePosition", 0);
        setField(term62381, term62381.getClass(), "jsType", null);
        setField(term62381, term62381.getClass(), "parent", null);
        setField(term62378, term62378.getClass(), "first", term62381);
        setField(term62378, term62378.getClass(), "last", null);
        setField(term62378, term62378.getClass(), "propListHead", null);
        setIntField(term62378, term62378.getClass(), "sourcePosition", 0);
        setField(term62378, term62378.getClass(), "jsType", null);
        setField(term62378, term62378.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61873;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term61781, args);
        assertTrue(recursiveEquals(term61781, term62416));
        assertTrue(recursiveEquals(term61873, term62417));
        assertTrue(recursiveEquals(retValue, term62378));
    }

};


