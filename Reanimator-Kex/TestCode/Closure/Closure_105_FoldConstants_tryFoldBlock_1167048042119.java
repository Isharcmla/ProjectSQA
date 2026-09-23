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

public class FoldConstants_tryFoldBlock_1167048042119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17962;
     Object term18032;
     Object term29876;
     Object term29877;

    public FoldConstants_tryFoldBlock_1167048042119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17962 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term18032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18032, term18032.getClass(), "first", term18032);
        setField(term18032, term18032.getClass(), "next", term18102);
        setIntField(term18032, term18032.getClass(), "type", 112);
        term29876 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term29876, term29876.getClass(), "compiler", null);
        term29877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29877, term29877.getClass(), "type", 112);
        setIntField(term29878, term29878.getClass(), "type", 0);
        setField(term29878, term29878.getClass(), "next", null);
        setField(term29878, term29878.getClass(), "first", null);
        setField(term29878, term29878.getClass(), "last", null);
        setField(term29878, term29878.getClass(), "propListHead", null);
        setIntField(term29878, term29878.getClass(), "sourcePosition", 0);
        setField(term29878, term29878.getClass(), "jsType", null);
        setField(term29878, term29878.getClass(), "parent", null);
        setField(term29877, term29877.getClass(), "next", term29878);
        setField(term29877, term29877.getClass(), "first", term29877);
        setField(term29877, term29877.getClass(), "last", null);
        setField(term29877, term29877.getClass(), "propListHead", null);
        setIntField(term29877, term29877.getClass(), "sourcePosition", 0);
        setField(term29877, term29877.getClass(), "jsType", null);
        setField(term29877, term29877.getClass(), "parent", null);
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
        args[1] = term18032;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term17962, args);
        assertTrue(recursiveEquals(term17962, term29876));
        assertTrue(recursiveEquals(term18032, null));
    }

};


