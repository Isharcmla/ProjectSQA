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

public class FoldConstants_tryFoldBlock_1167048042135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21815;
     Object term21885;
     Object term31056;
     Object term31057;

    public FoldConstants_tryFoldBlock_1167048042135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21815 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term21885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21885, term21885.getClass(), "first", term21885);
        setField(term21885, term21885.getClass(), "next", term21955);
        setIntField(term21885, term21885.getClass(), "type", 75);
        term31056 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term31056, term31056.getClass(), "compiler", null);
        term31057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31057, term31057.getClass(), "type", 75);
        setIntField(term31058, term31058.getClass(), "type", 0);
        setField(term31058, term31058.getClass(), "next", null);
        setField(term31058, term31058.getClass(), "first", null);
        setField(term31058, term31058.getClass(), "last", null);
        setField(term31058, term31058.getClass(), "propListHead", null);
        setIntField(term31058, term31058.getClass(), "sourcePosition", 0);
        setField(term31058, term31058.getClass(), "jsType", null);
        setField(term31058, term31058.getClass(), "parent", null);
        setField(term31057, term31057.getClass(), "next", term31058);
        setField(term31057, term31057.getClass(), "first", term31057);
        setField(term31057, term31057.getClass(), "last", null);
        setField(term31057, term31057.getClass(), "propListHead", null);
        setIntField(term31057, term31057.getClass(), "sourcePosition", 0);
        setField(term31057, term31057.getClass(), "jsType", null);
        setField(term31057, term31057.getClass(), "parent", null);
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
        args[1] = term21885;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term21815, args);
        assertTrue(recursiveEquals(term21815, term31056));
        assertTrue(recursiveEquals(term21885, null));
    }

};


