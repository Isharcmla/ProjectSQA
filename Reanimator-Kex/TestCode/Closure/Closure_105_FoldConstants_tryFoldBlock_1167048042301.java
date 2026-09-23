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

public class FoldConstants_tryFoldBlock_1167048042301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81240;
     Object term81310;
     Object term81726;
     Object term81727;

    public FoldConstants_tryFoldBlock_1167048042301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81240 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term81310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81520, term81520.getClass(), "next", term81590);
        setIntField(term81520, term81520.getClass(), "type", 70);
        setField(term81450, term81450.getClass(), "next", term81520);
        setIntField(term81450, term81450.getClass(), "type", 55);
        setField(term81380, term81380.getClass(), "next", term81450);
        setIntField(term81380, term81380.getClass(), "type", 103);
        setField(term81310, term81310.getClass(), "first", term81380);
        term81726 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term81726, term81726.getClass(), "compiler", null);
        term81727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81727, term81727.getClass(), "type", 0);
        setField(term81727, term81727.getClass(), "next", null);
        setIntField(term81728, term81728.getClass(), "type", 103);
        setIntField(term81729, term81729.getClass(), "type", 55);
        setIntField(term81730, term81730.getClass(), "type", 70);
        setIntField(term81731, term81731.getClass(), "type", 0);
        setField(term81731, term81731.getClass(), "next", null);
        setField(term81731, term81731.getClass(), "first", null);
        setField(term81731, term81731.getClass(), "last", null);
        setField(term81731, term81731.getClass(), "propListHead", null);
        setIntField(term81731, term81731.getClass(), "sourcePosition", 0);
        setField(term81731, term81731.getClass(), "jsType", null);
        setField(term81731, term81731.getClass(), "parent", null);
        setField(term81730, term81730.getClass(), "next", term81731);
        setField(term81730, term81730.getClass(), "first", null);
        setField(term81730, term81730.getClass(), "last", null);
        setField(term81730, term81730.getClass(), "propListHead", null);
        setIntField(term81730, term81730.getClass(), "sourcePosition", 0);
        setField(term81730, term81730.getClass(), "jsType", null);
        setField(term81730, term81730.getClass(), "parent", null);
        setField(term81729, term81729.getClass(), "next", term81730);
        setField(term81729, term81729.getClass(), "first", null);
        setField(term81729, term81729.getClass(), "last", null);
        setField(term81729, term81729.getClass(), "propListHead", null);
        setIntField(term81729, term81729.getClass(), "sourcePosition", 0);
        setField(term81729, term81729.getClass(), "jsType", null);
        setField(term81729, term81729.getClass(), "parent", null);
        setField(term81728, term81728.getClass(), "next", term81729);
        setField(term81728, term81728.getClass(), "first", null);
        setField(term81728, term81728.getClass(), "last", null);
        setField(term81728, term81728.getClass(), "propListHead", null);
        setIntField(term81728, term81728.getClass(), "sourcePosition", 0);
        setField(term81728, term81728.getClass(), "jsType", null);
        setField(term81728, term81728.getClass(), "parent", null);
        setField(term81727, term81727.getClass(), "first", term81728);
        setField(term81727, term81727.getClass(), "last", null);
        setField(term81727, term81727.getClass(), "propListHead", null);
        setIntField(term81727, term81727.getClass(), "sourcePosition", 0);
        setField(term81727, term81727.getClass(), "jsType", null);
        setField(term81727, term81727.getClass(), "parent", null);
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
        args[1] = term81310;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term81240, args);
        assertTrue(recursiveEquals(term81240, term81726));
        assertTrue(recursiveEquals(term81310, null));
    }

};


