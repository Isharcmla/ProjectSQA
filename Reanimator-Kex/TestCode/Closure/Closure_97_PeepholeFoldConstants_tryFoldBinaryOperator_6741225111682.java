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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667755;
     Object term667847;
     Object term668812;
     Object term668813;
     Object term668776;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term667847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term667939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term667939, term667939.getClass(), "next", term668031);
        setIntField(term667939, term667939.getClass(), "type", 39);
        setField(term667847, term667847.getClass(), "first", term667939);
        setIntField(term667847, term667847.getClass(), "type", 24);
        term668812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term668812, term668812.getClass(), "currentTraversal", null);
        term668813 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term668813, term668813.getClass(), "number", 0.0);
        setIntField(term668813, term668813.getClass(), "type", 24);
        setField(term668813, term668813.getClass(), "next", null);
        setDoubleField(term668814, term668814.getClass(), "number", 0.0);
        setIntField(term668814, term668814.getClass(), "type", 39);
        setDoubleField(term668815, term668815.getClass(), "number", 0.0);
        setIntField(term668815, term668815.getClass(), "type", 0);
        setField(term668815, term668815.getClass(), "next", null);
        setField(term668815, term668815.getClass(), "first", null);
        setField(term668815, term668815.getClass(), "last", null);
        setField(term668815, term668815.getClass(), "propListHead", null);
        setIntField(term668815, term668815.getClass(), "sourcePosition", 0);
        setField(term668815, term668815.getClass(), "jsType", null);
        setField(term668815, term668815.getClass(), "parent", null);
        setField(term668814, term668814.getClass(), "next", term668815);
        setField(term668814, term668814.getClass(), "first", null);
        setField(term668814, term668814.getClass(), "last", null);
        setField(term668814, term668814.getClass(), "propListHead", null);
        setIntField(term668814, term668814.getClass(), "sourcePosition", 0);
        setField(term668814, term668814.getClass(), "jsType", null);
        setField(term668814, term668814.getClass(), "parent", null);
        setField(term668813, term668813.getClass(), "first", term668814);
        setField(term668813, term668813.getClass(), "last", null);
        setField(term668813, term668813.getClass(), "propListHead", null);
        setIntField(term668813, term668813.getClass(), "sourcePosition", 0);
        setField(term668813, term668813.getClass(), "jsType", null);
        setField(term668813, term668813.getClass(), "parent", null);
        term668776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term668776, term668776.getClass(), "number", 0.0);
        setIntField(term668776, term668776.getClass(), "type", 24);
        setField(term668776, term668776.getClass(), "next", null);
        setDoubleField(term668779, term668779.getClass(), "number", 0.0);
        setIntField(term668779, term668779.getClass(), "type", 39);
        setDoubleField(term668782, term668782.getClass(), "number", 0.0);
        setIntField(term668782, term668782.getClass(), "type", 0);
        setField(term668782, term668782.getClass(), "next", null);
        setField(term668782, term668782.getClass(), "first", null);
        setField(term668782, term668782.getClass(), "last", null);
        setField(term668782, term668782.getClass(), "propListHead", null);
        setIntField(term668782, term668782.getClass(), "sourcePosition", 0);
        setField(term668782, term668782.getClass(), "jsType", null);
        setField(term668782, term668782.getClass(), "parent", null);
        setField(term668779, term668779.getClass(), "next", term668782);
        setField(term668779, term668779.getClass(), "first", null);
        setField(term668779, term668779.getClass(), "last", null);
        setField(term668779, term668779.getClass(), "propListHead", null);
        setIntField(term668779, term668779.getClass(), "sourcePosition", 0);
        setField(term668779, term668779.getClass(), "jsType", null);
        setField(term668779, term668779.getClass(), "parent", null);
        setField(term668776, term668776.getClass(), "first", term668779);
        setField(term668776, term668776.getClass(), "last", null);
        setField(term668776, term668776.getClass(), "propListHead", null);
        setIntField(term668776, term668776.getClass(), "sourcePosition", 0);
        setField(term668776, term668776.getClass(), "jsType", null);
        setField(term668776, term668776.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term667847;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term667755, args);
        assertTrue(recursiveEquals(term667755, term668812));
        assertTrue(recursiveEquals(term667847, term668813));
        assertTrue(recursiveEquals(retValue, term668776));
    }

};


