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

public class FoldConstants_tryFoldBlock_1167048042401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114772;
     Object term114842;
     Object term115511;
     Object term115512;

    public FoldConstants_tryFoldBlock_1167048042401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114772 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term114842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term115122, term115122.getClass(), "next", term115192);
        setIntField(term115122, term115122.getClass(), "type", 80);
        setField(term115052, term115052.getClass(), "next", term115122);
        setIntField(term115052, term115052.getClass(), "type", 116);
        setField(term114982, term114982.getClass(), "next", term115052);
        setIntField(term114982, term114982.getClass(), "type", 55);
        setField(term114912, term114912.getClass(), "next", term114982);
        setIntField(term114912, term114912.getClass(), "type", 31);
        setField(term114842, term114842.getClass(), "first", term114912);
        term115511 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term115511, term115511.getClass(), "compiler", null);
        term115512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115512, term115512.getClass(), "type", 0);
        setField(term115512, term115512.getClass(), "next", null);
        setIntField(term115513, term115513.getClass(), "type", 31);
        setIntField(term115514, term115514.getClass(), "type", 55);
        setIntField(term115515, term115515.getClass(), "type", 116);
        setIntField(term115516, term115516.getClass(), "type", 80);
        setField(term115516, term115516.getClass(), "next", null);
        setField(term115516, term115516.getClass(), "first", null);
        setField(term115516, term115516.getClass(), "last", null);
        setField(term115516, term115516.getClass(), "propListHead", null);
        setIntField(term115516, term115516.getClass(), "sourcePosition", 0);
        setField(term115516, term115516.getClass(), "jsType", null);
        setField(term115516, term115516.getClass(), "parent", null);
        setField(term115515, term115515.getClass(), "next", term115516);
        setField(term115515, term115515.getClass(), "first", null);
        setField(term115515, term115515.getClass(), "last", null);
        setField(term115515, term115515.getClass(), "propListHead", null);
        setIntField(term115515, term115515.getClass(), "sourcePosition", 0);
        setField(term115515, term115515.getClass(), "jsType", null);
        setField(term115515, term115515.getClass(), "parent", null);
        setField(term115514, term115514.getClass(), "next", term115515);
        setField(term115514, term115514.getClass(), "first", null);
        setField(term115514, term115514.getClass(), "last", null);
        setField(term115514, term115514.getClass(), "propListHead", null);
        setIntField(term115514, term115514.getClass(), "sourcePosition", 0);
        setField(term115514, term115514.getClass(), "jsType", null);
        setField(term115514, term115514.getClass(), "parent", null);
        setField(term115513, term115513.getClass(), "next", term115514);
        setField(term115513, term115513.getClass(), "first", null);
        setField(term115513, term115513.getClass(), "last", null);
        setField(term115513, term115513.getClass(), "propListHead", null);
        setIntField(term115513, term115513.getClass(), "sourcePosition", 0);
        setField(term115513, term115513.getClass(), "jsType", null);
        setField(term115513, term115513.getClass(), "parent", null);
        setField(term115512, term115512.getClass(), "first", term115513);
        setField(term115512, term115512.getClass(), "last", null);
        setField(term115512, term115512.getClass(), "propListHead", null);
        setIntField(term115512, term115512.getClass(), "sourcePosition", 0);
        setField(term115512, term115512.getClass(), "jsType", null);
        setField(term115512, term115512.getClass(), "parent", null);
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
        args[1] = term114842;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term114772, args);
        assertTrue(recursiveEquals(term114772, term115511));
        assertTrue(recursiveEquals(term114842, null));
    }

};


