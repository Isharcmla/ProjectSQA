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

public class FoldConstants_tryFoldBlock_1167048042291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78532;
     Object term78602;
     Object term78870;
     Object term78871;

    public FoldConstants_tryFoldBlock_1167048042291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78532 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term78602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78672, term78672.getClass(), "next", term78602);
        setIntField(term78672, term78672.getClass(), "type", 102);
        setField(term78602, term78602.getClass(), "first", term78672);
        setField(term78602, term78602.getClass(), "next", term78742);
        setIntField(term78602, term78602.getClass(), "type", 86);
        term78870 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term78870, term78870.getClass(), "compiler", null);
        term78871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78871, term78871.getClass(), "type", 86);
        setIntField(term78872, term78872.getClass(), "type", 0);
        setField(term78872, term78872.getClass(), "next", null);
        setField(term78872, term78872.getClass(), "first", null);
        setField(term78872, term78872.getClass(), "last", null);
        setField(term78872, term78872.getClass(), "propListHead", null);
        setIntField(term78872, term78872.getClass(), "sourcePosition", 0);
        setField(term78872, term78872.getClass(), "jsType", null);
        setField(term78872, term78872.getClass(), "parent", null);
        setField(term78871, term78871.getClass(), "next", term78872);
        setIntField(term78873, term78873.getClass(), "type", 102);
        setField(term78873, term78873.getClass(), "next", term78871);
        setField(term78873, term78873.getClass(), "first", null);
        setField(term78873, term78873.getClass(), "last", null);
        setField(term78873, term78873.getClass(), "propListHead", null);
        setIntField(term78873, term78873.getClass(), "sourcePosition", 0);
        setField(term78873, term78873.getClass(), "jsType", null);
        setField(term78873, term78873.getClass(), "parent", null);
        setField(term78871, term78871.getClass(), "first", term78873);
        setField(term78871, term78871.getClass(), "last", null);
        setField(term78871, term78871.getClass(), "propListHead", null);
        setIntField(term78871, term78871.getClass(), "sourcePosition", 0);
        setField(term78871, term78871.getClass(), "jsType", null);
        setField(term78871, term78871.getClass(), "parent", null);
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
        args[1] = term78602;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term78532, args);
        assertTrue(recursiveEquals(term78532, term78870));
        assertTrue(recursiveEquals(term78602, null));
    }

};


