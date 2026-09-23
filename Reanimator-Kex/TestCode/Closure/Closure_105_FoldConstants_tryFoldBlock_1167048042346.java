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

public class FoldConstants_tryFoldBlock_1167048042346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96000;
     Object term96070;
     Object term96975;
     Object term96976;

    public FoldConstants_tryFoldBlock_1167048042346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96000 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term96070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96280, term96280.getClass(), "next", term96350);
        setIntField(term96280, term96280.getClass(), "type", 74);
        setField(term96210, term96210.getClass(), "next", term96280);
        setIntField(term96210, term96210.getClass(), "type", 79);
        setField(term96140, term96140.getClass(), "next", term96210);
        setIntField(term96140, term96140.getClass(), "type", 60);
        setField(term96070, term96070.getClass(), "first", term96140);
        term96975 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term96975, term96975.getClass(), "compiler", null);
        term96976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96976, term96976.getClass(), "type", 0);
        setField(term96976, term96976.getClass(), "next", null);
        setIntField(term96977, term96977.getClass(), "type", 60);
        setIntField(term96978, term96978.getClass(), "type", 79);
        setIntField(term96979, term96979.getClass(), "type", 74);
        setIntField(term96980, term96980.getClass(), "type", 0);
        setField(term96980, term96980.getClass(), "next", null);
        setField(term96980, term96980.getClass(), "first", null);
        setField(term96980, term96980.getClass(), "last", null);
        setField(term96980, term96980.getClass(), "propListHead", null);
        setIntField(term96980, term96980.getClass(), "sourcePosition", 0);
        setField(term96980, term96980.getClass(), "jsType", null);
        setField(term96980, term96980.getClass(), "parent", null);
        setField(term96979, term96979.getClass(), "next", term96980);
        setField(term96979, term96979.getClass(), "first", null);
        setField(term96979, term96979.getClass(), "last", null);
        setField(term96979, term96979.getClass(), "propListHead", null);
        setIntField(term96979, term96979.getClass(), "sourcePosition", 0);
        setField(term96979, term96979.getClass(), "jsType", null);
        setField(term96979, term96979.getClass(), "parent", null);
        setField(term96978, term96978.getClass(), "next", term96979);
        setField(term96978, term96978.getClass(), "first", null);
        setField(term96978, term96978.getClass(), "last", null);
        setField(term96978, term96978.getClass(), "propListHead", null);
        setIntField(term96978, term96978.getClass(), "sourcePosition", 0);
        setField(term96978, term96978.getClass(), "jsType", null);
        setField(term96978, term96978.getClass(), "parent", null);
        setField(term96977, term96977.getClass(), "next", term96978);
        setField(term96977, term96977.getClass(), "first", null);
        setField(term96977, term96977.getClass(), "last", null);
        setField(term96977, term96977.getClass(), "propListHead", null);
        setIntField(term96977, term96977.getClass(), "sourcePosition", 0);
        setField(term96977, term96977.getClass(), "jsType", null);
        setField(term96977, term96977.getClass(), "parent", null);
        setField(term96976, term96976.getClass(), "first", term96977);
        setField(term96976, term96976.getClass(), "last", null);
        setField(term96976, term96976.getClass(), "propListHead", null);
        setIntField(term96976, term96976.getClass(), "sourcePosition", 0);
        setField(term96976, term96976.getClass(), "jsType", null);
        setField(term96976, term96976.getClass(), "parent", null);
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
        args[1] = term96070;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term96000, args);
        assertTrue(recursiveEquals(term96000, term96975));
        assertTrue(recursiveEquals(term96070, null));
    }

};


