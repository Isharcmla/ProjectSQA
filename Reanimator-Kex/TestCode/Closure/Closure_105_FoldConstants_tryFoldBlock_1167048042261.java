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

public class FoldConstants_tryFoldBlock_1167048042261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69575;
     Object term69645;
     Object term69913;
     Object term69914;

    public FoldConstants_tryFoldBlock_1167048042261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69575 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term69645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69715, term69715.getClass(), "next", term69645);
        setIntField(term69715, term69715.getClass(), "type", 48);
        setField(term69645, term69645.getClass(), "first", term69715);
        setField(term69645, term69645.getClass(), "next", term69785);
        setIntField(term69645, term69645.getClass(), "type", 89);
        term69913 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term69913, term69913.getClass(), "compiler", null);
        term69914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69914, term69914.getClass(), "type", 89);
        setIntField(term69915, term69915.getClass(), "type", 0);
        setField(term69915, term69915.getClass(), "next", null);
        setField(term69915, term69915.getClass(), "first", null);
        setField(term69915, term69915.getClass(), "last", null);
        setField(term69915, term69915.getClass(), "propListHead", null);
        setIntField(term69915, term69915.getClass(), "sourcePosition", 0);
        setField(term69915, term69915.getClass(), "jsType", null);
        setField(term69915, term69915.getClass(), "parent", null);
        setField(term69914, term69914.getClass(), "next", term69915);
        setIntField(term69916, term69916.getClass(), "type", 48);
        setField(term69916, term69916.getClass(), "next", term69914);
        setField(term69916, term69916.getClass(), "first", null);
        setField(term69916, term69916.getClass(), "last", null);
        setField(term69916, term69916.getClass(), "propListHead", null);
        setIntField(term69916, term69916.getClass(), "sourcePosition", 0);
        setField(term69916, term69916.getClass(), "jsType", null);
        setField(term69916, term69916.getClass(), "parent", null);
        setField(term69914, term69914.getClass(), "first", term69916);
        setField(term69914, term69914.getClass(), "last", null);
        setField(term69914, term69914.getClass(), "propListHead", null);
        setIntField(term69914, term69914.getClass(), "sourcePosition", 0);
        setField(term69914, term69914.getClass(), "jsType", null);
        setField(term69914, term69914.getClass(), "parent", null);
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
        args[1] = term69645;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term69575, args);
        assertTrue(recursiveEquals(term69575, term69913));
        assertTrue(recursiveEquals(term69645, null));
    }

};


