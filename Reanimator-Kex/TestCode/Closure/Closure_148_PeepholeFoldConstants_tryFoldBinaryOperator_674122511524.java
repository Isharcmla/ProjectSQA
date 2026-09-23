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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111438;
     Object term111530;
     Object term111892;
     Object term111893;
     Object term111819;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term111530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111714 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term111714, term111714.getClass(), "first", term111806);
        setField(term111622, term111622.getClass(), "next", term111714);
        setField(term111530, term111530.getClass(), "first", term111622);
        setIntField(term111530, term111530.getClass(), "type", 86);
        term111892 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term111892, term111892.getClass(), "currentTraversal", null);
        term111893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111893, term111893.getClass(), "number", 0.0);
        setIntField(term111893, term111893.getClass(), "type", 86);
        setField(term111893, term111893.getClass(), "next", null);
        setDoubleField(term111894, term111894.getClass(), "number", 0.0);
        setIntField(term111894, term111894.getClass(), "type", 0);
        setDoubleField(term111895, term111895.getClass(), "number", 0.0);
        setIntField(term111895, term111895.getClass(), "type", 0);
        setField(term111895, term111895.getClass(), "next", null);
        setDoubleField(term111896, term111896.getClass(), "number", 0.0);
        setIntField(term111896, term111896.getClass(), "type", 0);
        setField(term111896, term111896.getClass(), "next", null);
        setField(term111896, term111896.getClass(), "first", null);
        setField(term111896, term111896.getClass(), "last", null);
        setField(term111896, term111896.getClass(), "propListHead", null);
        setIntField(term111896, term111896.getClass(), "sourcePosition", 0);
        setField(term111896, term111896.getClass(), "jsType", null);
        setField(term111896, term111896.getClass(), "parent", null);
        setField(term111895, term111895.getClass(), "first", term111896);
        setField(term111895, term111895.getClass(), "last", null);
        setField(term111895, term111895.getClass(), "propListHead", null);
        setIntField(term111895, term111895.getClass(), "sourcePosition", 0);
        setField(term111895, term111895.getClass(), "jsType", null);
        setField(term111895, term111895.getClass(), "parent", null);
        setField(term111894, term111894.getClass(), "next", term111895);
        setField(term111894, term111894.getClass(), "first", null);
        setField(term111894, term111894.getClass(), "last", null);
        setField(term111894, term111894.getClass(), "propListHead", null);
        setIntField(term111894, term111894.getClass(), "sourcePosition", 0);
        setField(term111894, term111894.getClass(), "jsType", null);
        setField(term111894, term111894.getClass(), "parent", null);
        setField(term111893, term111893.getClass(), "first", term111894);
        setField(term111893, term111893.getClass(), "last", null);
        setField(term111893, term111893.getClass(), "propListHead", null);
        setIntField(term111893, term111893.getClass(), "sourcePosition", 0);
        setField(term111893, term111893.getClass(), "jsType", null);
        setField(term111893, term111893.getClass(), "parent", null);
        term111819 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111828 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111819, term111819.getClass(), "number", 0.0);
        setIntField(term111819, term111819.getClass(), "type", 86);
        setField(term111819, term111819.getClass(), "next", null);
        setDoubleField(term111822, term111822.getClass(), "number", 0.0);
        setIntField(term111822, term111822.getClass(), "type", 0);
        setDoubleField(term111825, term111825.getClass(), "number", 0.0);
        setIntField(term111825, term111825.getClass(), "type", 0);
        setField(term111825, term111825.getClass(), "next", null);
        setDoubleField(term111828, term111828.getClass(), "number", 0.0);
        setIntField(term111828, term111828.getClass(), "type", 0);
        setField(term111828, term111828.getClass(), "next", null);
        setField(term111828, term111828.getClass(), "first", null);
        setField(term111828, term111828.getClass(), "last", null);
        setField(term111828, term111828.getClass(), "propListHead", null);
        setIntField(term111828, term111828.getClass(), "sourcePosition", 0);
        setField(term111828, term111828.getClass(), "jsType", null);
        setField(term111828, term111828.getClass(), "parent", null);
        setField(term111825, term111825.getClass(), "first", term111828);
        setField(term111825, term111825.getClass(), "last", null);
        setField(term111825, term111825.getClass(), "propListHead", null);
        setIntField(term111825, term111825.getClass(), "sourcePosition", 0);
        setField(term111825, term111825.getClass(), "jsType", null);
        setField(term111825, term111825.getClass(), "parent", null);
        setField(term111822, term111822.getClass(), "next", term111825);
        setField(term111822, term111822.getClass(), "first", null);
        setField(term111822, term111822.getClass(), "last", null);
        setField(term111822, term111822.getClass(), "propListHead", null);
        setIntField(term111822, term111822.getClass(), "sourcePosition", 0);
        setField(term111822, term111822.getClass(), "jsType", null);
        setField(term111822, term111822.getClass(), "parent", null);
        setField(term111819, term111819.getClass(), "first", term111822);
        setField(term111819, term111819.getClass(), "last", null);
        setField(term111819, term111819.getClass(), "propListHead", null);
        setIntField(term111819, term111819.getClass(), "sourcePosition", 0);
        setField(term111819, term111819.getClass(), "jsType", null);
        setField(term111819, term111819.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term111530;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term111438, args);
        assertTrue(recursiveEquals(term111438, term111892));
        assertTrue(recursiveEquals(term111530, term111893));
        assertTrue(recursiveEquals(retValue, term111819));
    }

};


