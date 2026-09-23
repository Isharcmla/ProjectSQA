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

public class FoldConstants_tryFoldBlock_1167048042185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38810;
     Object term38880;
     Object term47724;
     Object term47725;

    public FoldConstants_tryFoldBlock_1167048042185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38810 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term38880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38950, term38950.getClass(), "next", term38880);
        setIntField(term38950, term38950.getClass(), "type", 60);
        setField(term38880, term38880.getClass(), "first", term38950);
        setField(term38880, term38880.getClass(), "next", term39020);
        setIntField(term38880, term38880.getClass(), "type", 69);
        term47724 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47724, term47724.getClass(), "compiler", null);
        term47725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47725, term47725.getClass(), "type", 69);
        setIntField(term47726, term47726.getClass(), "type", 0);
        setField(term47726, term47726.getClass(), "next", null);
        setField(term47726, term47726.getClass(), "first", null);
        setField(term47726, term47726.getClass(), "last", null);
        setField(term47726, term47726.getClass(), "propListHead", null);
        setIntField(term47726, term47726.getClass(), "sourcePosition", 0);
        setField(term47726, term47726.getClass(), "jsType", null);
        setField(term47726, term47726.getClass(), "parent", null);
        setField(term47725, term47725.getClass(), "next", term47726);
        setIntField(term47727, term47727.getClass(), "type", 60);
        setField(term47727, term47727.getClass(), "next", term47725);
        setField(term47727, term47727.getClass(), "first", null);
        setField(term47727, term47727.getClass(), "last", null);
        setField(term47727, term47727.getClass(), "propListHead", null);
        setIntField(term47727, term47727.getClass(), "sourcePosition", 0);
        setField(term47727, term47727.getClass(), "jsType", null);
        setField(term47727, term47727.getClass(), "parent", null);
        setField(term47725, term47725.getClass(), "first", term47727);
        setField(term47725, term47725.getClass(), "last", null);
        setField(term47725, term47725.getClass(), "propListHead", null);
        setIntField(term47725, term47725.getClass(), "sourcePosition", 0);
        setField(term47725, term47725.getClass(), "jsType", null);
        setField(term47725, term47725.getClass(), "parent", null);
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
        args[1] = term38880;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term38810, args);
        assertTrue(recursiveEquals(term38810, term47724));
        assertTrue(recursiveEquals(term38880, null));
    }

};


