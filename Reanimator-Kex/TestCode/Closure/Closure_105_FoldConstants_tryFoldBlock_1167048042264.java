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

public class FoldConstants_tryFoldBlock_1167048042264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70039;
     Object term70109;
     Object term70922;
     Object term70923;

    public FoldConstants_tryFoldBlock_1167048042264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70039 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term70109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70179, term70179.getClass(), "next", term70109);
        setIntField(term70179, term70179.getClass(), "type", 112);
        setField(term70109, term70109.getClass(), "first", term70179);
        setField(term70109, term70109.getClass(), "next", term70249);
        setIntField(term70109, term70109.getClass(), "type", 61);
        term70922 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term70922, term70922.getClass(), "compiler", null);
        term70923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70923, term70923.getClass(), "type", 61);
        setIntField(term70924, term70924.getClass(), "type", 0);
        setField(term70924, term70924.getClass(), "next", null);
        setField(term70924, term70924.getClass(), "first", null);
        setField(term70924, term70924.getClass(), "last", null);
        setField(term70924, term70924.getClass(), "propListHead", null);
        setIntField(term70924, term70924.getClass(), "sourcePosition", 0);
        setField(term70924, term70924.getClass(), "jsType", null);
        setField(term70924, term70924.getClass(), "parent", null);
        setField(term70923, term70923.getClass(), "next", term70924);
        setIntField(term70925, term70925.getClass(), "type", 112);
        setField(term70925, term70925.getClass(), "next", term70923);
        setField(term70925, term70925.getClass(), "first", null);
        setField(term70925, term70925.getClass(), "last", null);
        setField(term70925, term70925.getClass(), "propListHead", null);
        setIntField(term70925, term70925.getClass(), "sourcePosition", 0);
        setField(term70925, term70925.getClass(), "jsType", null);
        setField(term70925, term70925.getClass(), "parent", null);
        setField(term70923, term70923.getClass(), "first", term70925);
        setField(term70923, term70923.getClass(), "last", null);
        setField(term70923, term70923.getClass(), "propListHead", null);
        setIntField(term70923, term70923.getClass(), "sourcePosition", 0);
        setField(term70923, term70923.getClass(), "jsType", null);
        setField(term70923, term70923.getClass(), "parent", null);
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
        args[1] = term70109;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term70039, args);
        assertTrue(recursiveEquals(term70039, term70922));
        assertTrue(recursiveEquals(term70109, null));
    }

};


