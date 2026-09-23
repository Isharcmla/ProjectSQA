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

public class FoldConstants_tryFoldBlock_1167048042125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19248;
     Object term19318;
     Object term30309;
     Object term30310;

    public FoldConstants_tryFoldBlock_1167048042125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19248 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term19318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19318, term19318.getClass(), "first", term19318);
        setField(term19318, term19318.getClass(), "next", term19388);
        setIntField(term19318, term19318.getClass(), "type", 129);
        term30309 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30309, term30309.getClass(), "compiler", null);
        term30310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30310, term30310.getClass(), "type", 129);
        setIntField(term30311, term30311.getClass(), "type", 0);
        setField(term30311, term30311.getClass(), "next", null);
        setField(term30311, term30311.getClass(), "first", null);
        setField(term30311, term30311.getClass(), "last", null);
        setField(term30311, term30311.getClass(), "propListHead", null);
        setIntField(term30311, term30311.getClass(), "sourcePosition", 0);
        setField(term30311, term30311.getClass(), "jsType", null);
        setField(term30311, term30311.getClass(), "parent", null);
        setField(term30310, term30310.getClass(), "next", term30311);
        setField(term30310, term30310.getClass(), "first", term30310);
        setField(term30310, term30310.getClass(), "last", null);
        setField(term30310, term30310.getClass(), "propListHead", null);
        setIntField(term30310, term30310.getClass(), "sourcePosition", 0);
        setField(term30310, term30310.getClass(), "jsType", null);
        setField(term30310, term30310.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term19318;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term19248, args);
        assertTrue(recursiveEquals(term19248, term30309));
        assertTrue(recursiveEquals(term19318, null));
    }

};


