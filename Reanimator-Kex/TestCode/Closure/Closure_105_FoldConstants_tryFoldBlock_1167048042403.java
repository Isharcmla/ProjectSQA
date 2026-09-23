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

public class FoldConstants_tryFoldBlock_1167048042403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115684;
     Object term115754;
     Object term116390;
     Object term116391;

    public FoldConstants_tryFoldBlock_1167048042403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115684 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term115754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term116034, term116034.getClass(), "next", term116104);
        setIntField(term116034, term116034.getClass(), "type", 99);
        setField(term115964, term115964.getClass(), "next", term116034);
        setIntField(term115964, term115964.getClass(), "type", 126);
        setField(term115894, term115894.getClass(), "next", term115964);
        setIntField(term115894, term115894.getClass(), "type", 96);
        setIntField(term116174, term116174.getClass(), "type", 129);
        setField(term115894, term115894.getClass(), "first", term116174);
        setField(term115824, term115824.getClass(), "next", term115894);
        setIntField(term115824, term115824.getClass(), "type", 129);
        setField(term115754, term115754.getClass(), "first", term115824);
        term116390 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term116390, term116390.getClass(), "compiler", null);
        term116391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116391, term116391.getClass(), "type", 0);
        setField(term116391, term116391.getClass(), "next", null);
        setIntField(term116392, term116392.getClass(), "type", 129);
        setIntField(term116393, term116393.getClass(), "type", 96);
        setIntField(term116394, term116394.getClass(), "type", 126);
        setIntField(term116395, term116395.getClass(), "type", 99);
        setField(term116395, term116395.getClass(), "next", null);
        setField(term116395, term116395.getClass(), "first", null);
        setField(term116395, term116395.getClass(), "last", null);
        setField(term116395, term116395.getClass(), "propListHead", null);
        setIntField(term116395, term116395.getClass(), "sourcePosition", 0);
        setField(term116395, term116395.getClass(), "jsType", null);
        setField(term116395, term116395.getClass(), "parent", null);
        setField(term116394, term116394.getClass(), "next", term116395);
        setField(term116394, term116394.getClass(), "first", null);
        setField(term116394, term116394.getClass(), "last", null);
        setField(term116394, term116394.getClass(), "propListHead", null);
        setIntField(term116394, term116394.getClass(), "sourcePosition", 0);
        setField(term116394, term116394.getClass(), "jsType", null);
        setField(term116394, term116394.getClass(), "parent", null);
        setField(term116393, term116393.getClass(), "next", term116394);
        setIntField(term116396, term116396.getClass(), "type", 129);
        setField(term116396, term116396.getClass(), "next", null);
        setField(term116396, term116396.getClass(), "first", null);
        setField(term116396, term116396.getClass(), "last", null);
        setField(term116396, term116396.getClass(), "propListHead", null);
        setIntField(term116396, term116396.getClass(), "sourcePosition", 0);
        setField(term116396, term116396.getClass(), "jsType", null);
        setField(term116396, term116396.getClass(), "parent", null);
        setField(term116393, term116393.getClass(), "first", term116396);
        setField(term116393, term116393.getClass(), "last", null);
        setField(term116393, term116393.getClass(), "propListHead", null);
        setIntField(term116393, term116393.getClass(), "sourcePosition", 0);
        setField(term116393, term116393.getClass(), "jsType", null);
        setField(term116393, term116393.getClass(), "parent", null);
        setField(term116392, term116392.getClass(), "next", term116393);
        setField(term116392, term116392.getClass(), "first", null);
        setField(term116392, term116392.getClass(), "last", null);
        setField(term116392, term116392.getClass(), "propListHead", null);
        setIntField(term116392, term116392.getClass(), "sourcePosition", 0);
        setField(term116392, term116392.getClass(), "jsType", null);
        setField(term116392, term116392.getClass(), "parent", null);
        setField(term116391, term116391.getClass(), "first", term116392);
        setField(term116391, term116391.getClass(), "last", null);
        setField(term116391, term116391.getClass(), "propListHead", null);
        setIntField(term116391, term116391.getClass(), "sourcePosition", 0);
        setField(term116391, term116391.getClass(), "jsType", null);
        setField(term116391, term116391.getClass(), "parent", null);
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
        args[1] = term115754;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term115684, args);
        assertTrue(recursiveEquals(term115684, term116390));
        assertTrue(recursiveEquals(term115754, null));
    }

};


