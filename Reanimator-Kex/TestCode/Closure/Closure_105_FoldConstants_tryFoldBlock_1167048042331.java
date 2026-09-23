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

public class FoldConstants_tryFoldBlock_1167048042331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91140;
     Object term91210;
     Object term91801;
     Object term91802;

    public FoldConstants_tryFoldBlock_1167048042331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91140 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term91210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91280, term91280.getClass(), "next", term91210);
        setIntField(term91280, term91280.getClass(), "type", 82);
        setField(term91210, term91210.getClass(), "first", term91280);
        setField(term91210, term91210.getClass(), "next", term91350);
        setIntField(term91210, term91210.getClass(), "type", 106);
        term91801 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term91801, term91801.getClass(), "compiler", null);
        term91802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91802, term91802.getClass(), "type", 106);
        setIntField(term91803, term91803.getClass(), "type", 0);
        setField(term91803, term91803.getClass(), "next", null);
        setField(term91803, term91803.getClass(), "first", null);
        setField(term91803, term91803.getClass(), "last", null);
        setField(term91803, term91803.getClass(), "propListHead", null);
        setIntField(term91803, term91803.getClass(), "sourcePosition", 0);
        setField(term91803, term91803.getClass(), "jsType", null);
        setField(term91803, term91803.getClass(), "parent", null);
        setField(term91802, term91802.getClass(), "next", term91803);
        setIntField(term91804, term91804.getClass(), "type", 82);
        setField(term91804, term91804.getClass(), "next", term91802);
        setField(term91804, term91804.getClass(), "first", null);
        setField(term91804, term91804.getClass(), "last", null);
        setField(term91804, term91804.getClass(), "propListHead", null);
        setIntField(term91804, term91804.getClass(), "sourcePosition", 0);
        setField(term91804, term91804.getClass(), "jsType", null);
        setField(term91804, term91804.getClass(), "parent", null);
        setField(term91802, term91802.getClass(), "first", term91804);
        setField(term91802, term91802.getClass(), "last", null);
        setField(term91802, term91802.getClass(), "propListHead", null);
        setIntField(term91802, term91802.getClass(), "sourcePosition", 0);
        setField(term91802, term91802.getClass(), "jsType", null);
        setField(term91802, term91802.getClass(), "parent", null);
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
        args[1] = term91210;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term91140, args);
        assertTrue(recursiveEquals(term91140, term91801));
        assertTrue(recursiveEquals(term91210, null));
    }

};


