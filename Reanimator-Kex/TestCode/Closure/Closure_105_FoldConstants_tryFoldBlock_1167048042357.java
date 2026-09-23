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

public class FoldConstants_tryFoldBlock_1167048042357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100037;
     Object term100107;
     Object term100347;
     Object term100348;

    public FoldConstants_tryFoldBlock_1167048042357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100037 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term100107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100177, term100177.getClass(), "next", term100107);
        setIntField(term100177, term100177.getClass(), "type", 129);
        setField(term100107, term100107.getClass(), "first", term100177);
        setField(term100107, term100107.getClass(), "next", term100247);
        setIntField(term100107, term100107.getClass(), "type", 56);
        term100347 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term100347, term100347.getClass(), "compiler", null);
        term100348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100348, term100348.getClass(), "type", 56);
        setIntField(term100349, term100349.getClass(), "type", 0);
        setField(term100349, term100349.getClass(), "next", null);
        setField(term100349, term100349.getClass(), "first", null);
        setField(term100349, term100349.getClass(), "last", null);
        setField(term100349, term100349.getClass(), "propListHead", null);
        setIntField(term100349, term100349.getClass(), "sourcePosition", 0);
        setField(term100349, term100349.getClass(), "jsType", null);
        setField(term100349, term100349.getClass(), "parent", null);
        setField(term100348, term100348.getClass(), "next", term100349);
        setIntField(term100350, term100350.getClass(), "type", 129);
        setField(term100350, term100350.getClass(), "next", term100348);
        setField(term100350, term100350.getClass(), "first", null);
        setField(term100350, term100350.getClass(), "last", null);
        setField(term100350, term100350.getClass(), "propListHead", null);
        setIntField(term100350, term100350.getClass(), "sourcePosition", 0);
        setField(term100350, term100350.getClass(), "jsType", null);
        setField(term100350, term100350.getClass(), "parent", null);
        setField(term100348, term100348.getClass(), "first", term100350);
        setField(term100348, term100348.getClass(), "last", null);
        setField(term100348, term100348.getClass(), "propListHead", null);
        setIntField(term100348, term100348.getClass(), "sourcePosition", 0);
        setField(term100348, term100348.getClass(), "jsType", null);
        setField(term100348, term100348.getClass(), "parent", null);
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
        args[1] = term100107;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term100037, args);
        assertTrue(recursiveEquals(term100037, term100347));
        assertTrue(recursiveEquals(term100107, null));
    }

};


