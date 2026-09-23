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

public class FoldConstants_tryFoldBlock_1167048042395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112779;
     Object term112849;
     Object term113377;
     Object term113378;

    public FoldConstants_tryFoldBlock_1167048042395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112779 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term112849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term113129, term113129.getClass(), "next", term113199);
        setIntField(term113129, term113129.getClass(), "type", 129);
        setField(term113059, term113059.getClass(), "next", term113129);
        setIntField(term113059, term113059.getClass(), "type", 128);
        setField(term112989, term112989.getClass(), "next", term113059);
        setIntField(term112989, term112989.getClass(), "type", 81);
        setField(term112919, term112919.getClass(), "next", term112989);
        setIntField(term112919, term112919.getClass(), "type", 60);
        setField(term112849, term112849.getClass(), "first", term112919);
        term113377 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term113377, term113377.getClass(), "compiler", null);
        term113378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113378, term113378.getClass(), "type", 0);
        setField(term113378, term113378.getClass(), "next", null);
        setIntField(term113379, term113379.getClass(), "type", 60);
        setIntField(term113380, term113380.getClass(), "type", 81);
        setIntField(term113381, term113381.getClass(), "type", 128);
        setIntField(term113382, term113382.getClass(), "type", 129);
        setField(term113382, term113382.getClass(), "next", null);
        setField(term113382, term113382.getClass(), "first", null);
        setField(term113382, term113382.getClass(), "last", null);
        setField(term113382, term113382.getClass(), "propListHead", null);
        setIntField(term113382, term113382.getClass(), "sourcePosition", 0);
        setField(term113382, term113382.getClass(), "jsType", null);
        setField(term113382, term113382.getClass(), "parent", null);
        setField(term113381, term113381.getClass(), "next", term113382);
        setField(term113381, term113381.getClass(), "first", null);
        setField(term113381, term113381.getClass(), "last", null);
        setField(term113381, term113381.getClass(), "propListHead", null);
        setIntField(term113381, term113381.getClass(), "sourcePosition", 0);
        setField(term113381, term113381.getClass(), "jsType", null);
        setField(term113381, term113381.getClass(), "parent", null);
        setField(term113380, term113380.getClass(), "next", term113381);
        setField(term113380, term113380.getClass(), "first", null);
        setField(term113380, term113380.getClass(), "last", null);
        setField(term113380, term113380.getClass(), "propListHead", null);
        setIntField(term113380, term113380.getClass(), "sourcePosition", 0);
        setField(term113380, term113380.getClass(), "jsType", null);
        setField(term113380, term113380.getClass(), "parent", null);
        setField(term113379, term113379.getClass(), "next", term113380);
        setField(term113379, term113379.getClass(), "first", null);
        setField(term113379, term113379.getClass(), "last", null);
        setField(term113379, term113379.getClass(), "propListHead", null);
        setIntField(term113379, term113379.getClass(), "sourcePosition", 0);
        setField(term113379, term113379.getClass(), "jsType", null);
        setField(term113379, term113379.getClass(), "parent", null);
        setField(term113378, term113378.getClass(), "first", term113379);
        setField(term113378, term113378.getClass(), "last", null);
        setField(term113378, term113378.getClass(), "propListHead", null);
        setIntField(term113378, term113378.getClass(), "sourcePosition", 0);
        setField(term113378, term113378.getClass(), "jsType", null);
        setField(term113378, term113378.getClass(), "parent", null);
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
        args[1] = term112849;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term112779, args);
        assertTrue(recursiveEquals(term112779, term113377));
        assertTrue(recursiveEquals(term112849, null));
    }

};


