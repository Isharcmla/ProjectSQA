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

public class FoldConstants_tryFoldBlock_1167048042122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18561;
     Object term18631;
     Object term30210;
     Object term30211;

    public FoldConstants_tryFoldBlock_1167048042122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18561 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term18631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18631, term18631.getClass(), "first", term18631);
        setField(term18631, term18631.getClass(), "next", term18701);
        setIntField(term18631, term18631.getClass(), "type", 60);
        term30210 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30210, term30210.getClass(), "compiler", null);
        term30211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30211, term30211.getClass(), "type", 60);
        setIntField(term30212, term30212.getClass(), "type", 0);
        setField(term30212, term30212.getClass(), "next", null);
        setField(term30212, term30212.getClass(), "first", null);
        setField(term30212, term30212.getClass(), "last", null);
        setField(term30212, term30212.getClass(), "propListHead", null);
        setIntField(term30212, term30212.getClass(), "sourcePosition", 0);
        setField(term30212, term30212.getClass(), "jsType", null);
        setField(term30212, term30212.getClass(), "parent", null);
        setField(term30211, term30211.getClass(), "next", term30212);
        setField(term30211, term30211.getClass(), "first", term30211);
        setField(term30211, term30211.getClass(), "last", null);
        setField(term30211, term30211.getClass(), "propListHead", null);
        setIntField(term30211, term30211.getClass(), "sourcePosition", 0);
        setField(term30211, term30211.getClass(), "jsType", null);
        setField(term30211, term30211.getClass(), "parent", null);
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
        args[1] = term18631;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term18561, args);
        assertTrue(recursiveEquals(term18561, term30210));
        assertTrue(recursiveEquals(term18631, null));
    }

};


