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

public class FoldConstants_tryFoldBlock_1167048042265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70402;
     Object term70472;
     Object term71092;
     Object term71093;

    public FoldConstants_tryFoldBlock_1167048042265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70402 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term70472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70682, term70682.getClass(), "next", term70752);
        setIntField(term70682, term70682.getClass(), "type", 36);
        setField(term70612, term70612.getClass(), "next", term70682);
        setIntField(term70612, term70612.getClass(), "type", 91);
        setIntField(term70822, term70822.getClass(), "type", 129);
        setField(term70612, term70612.getClass(), "first", term70822);
        setField(term70542, term70542.getClass(), "next", term70612);
        setIntField(term70542, term70542.getClass(), "type", 129);
        setField(term70472, term70472.getClass(), "first", term70542);
        term71092 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term71092, term71092.getClass(), "compiler", null);
        term71093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71093, term71093.getClass(), "type", 0);
        setField(term71093, term71093.getClass(), "next", null);
        setIntField(term71094, term71094.getClass(), "type", 129);
        setIntField(term71095, term71095.getClass(), "type", 91);
        setIntField(term71096, term71096.getClass(), "type", 36);
        setIntField(term71097, term71097.getClass(), "type", 0);
        setField(term71097, term71097.getClass(), "next", null);
        setField(term71097, term71097.getClass(), "first", null);
        setField(term71097, term71097.getClass(), "last", null);
        setField(term71097, term71097.getClass(), "propListHead", null);
        setIntField(term71097, term71097.getClass(), "sourcePosition", 0);
        setField(term71097, term71097.getClass(), "jsType", null);
        setField(term71097, term71097.getClass(), "parent", null);
        setField(term71096, term71096.getClass(), "next", term71097);
        setField(term71096, term71096.getClass(), "first", null);
        setField(term71096, term71096.getClass(), "last", null);
        setField(term71096, term71096.getClass(), "propListHead", null);
        setIntField(term71096, term71096.getClass(), "sourcePosition", 0);
        setField(term71096, term71096.getClass(), "jsType", null);
        setField(term71096, term71096.getClass(), "parent", null);
        setField(term71095, term71095.getClass(), "next", term71096);
        setIntField(term71098, term71098.getClass(), "type", 129);
        setField(term71098, term71098.getClass(), "next", null);
        setField(term71098, term71098.getClass(), "first", null);
        setField(term71098, term71098.getClass(), "last", null);
        setField(term71098, term71098.getClass(), "propListHead", null);
        setIntField(term71098, term71098.getClass(), "sourcePosition", 0);
        setField(term71098, term71098.getClass(), "jsType", null);
        setField(term71098, term71098.getClass(), "parent", null);
        setField(term71095, term71095.getClass(), "first", term71098);
        setField(term71095, term71095.getClass(), "last", null);
        setField(term71095, term71095.getClass(), "propListHead", null);
        setIntField(term71095, term71095.getClass(), "sourcePosition", 0);
        setField(term71095, term71095.getClass(), "jsType", null);
        setField(term71095, term71095.getClass(), "parent", null);
        setField(term71094, term71094.getClass(), "next", term71095);
        setField(term71094, term71094.getClass(), "first", null);
        setField(term71094, term71094.getClass(), "last", null);
        setField(term71094, term71094.getClass(), "propListHead", null);
        setIntField(term71094, term71094.getClass(), "sourcePosition", 0);
        setField(term71094, term71094.getClass(), "jsType", null);
        setField(term71094, term71094.getClass(), "parent", null);
        setField(term71093, term71093.getClass(), "first", term71094);
        setField(term71093, term71093.getClass(), "last", null);
        setField(term71093, term71093.getClass(), "propListHead", null);
        setIntField(term71093, term71093.getClass(), "sourcePosition", 0);
        setField(term71093, term71093.getClass(), "jsType", null);
        setField(term71093, term71093.getClass(), "parent", null);
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
        args[1] = term70472;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term70402, args);
        assertTrue(recursiveEquals(term70402, term71092));
        assertTrue(recursiveEquals(term70472, null));
    }

};


