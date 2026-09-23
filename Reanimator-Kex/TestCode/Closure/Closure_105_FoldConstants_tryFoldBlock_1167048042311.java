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

public class FoldConstants_tryFoldBlock_1167048042311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84339;
     Object term84409;
     Object term84825;
     Object term84826;

    public FoldConstants_tryFoldBlock_1167048042311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84339 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term84409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84619, term84619.getClass(), "next", term84689);
        setIntField(term84619, term84619.getClass(), "type", 116);
        setField(term84549, term84549.getClass(), "next", term84619);
        setIntField(term84549, term84549.getClass(), "type", 55);
        setField(term84479, term84479.getClass(), "next", term84549);
        setIntField(term84479, term84479.getClass(), "type", 31);
        setField(term84409, term84409.getClass(), "first", term84479);
        term84825 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term84825, term84825.getClass(), "compiler", null);
        term84826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84826, term84826.getClass(), "type", 0);
        setField(term84826, term84826.getClass(), "next", null);
        setIntField(term84827, term84827.getClass(), "type", 31);
        setIntField(term84828, term84828.getClass(), "type", 55);
        setIntField(term84829, term84829.getClass(), "type", 116);
        setIntField(term84830, term84830.getClass(), "type", 0);
        setField(term84830, term84830.getClass(), "next", null);
        setField(term84830, term84830.getClass(), "first", null);
        setField(term84830, term84830.getClass(), "last", null);
        setField(term84830, term84830.getClass(), "propListHead", null);
        setIntField(term84830, term84830.getClass(), "sourcePosition", 0);
        setField(term84830, term84830.getClass(), "jsType", null);
        setField(term84830, term84830.getClass(), "parent", null);
        setField(term84829, term84829.getClass(), "next", term84830);
        setField(term84829, term84829.getClass(), "first", null);
        setField(term84829, term84829.getClass(), "last", null);
        setField(term84829, term84829.getClass(), "propListHead", null);
        setIntField(term84829, term84829.getClass(), "sourcePosition", 0);
        setField(term84829, term84829.getClass(), "jsType", null);
        setField(term84829, term84829.getClass(), "parent", null);
        setField(term84828, term84828.getClass(), "next", term84829);
        setField(term84828, term84828.getClass(), "first", null);
        setField(term84828, term84828.getClass(), "last", null);
        setField(term84828, term84828.getClass(), "propListHead", null);
        setIntField(term84828, term84828.getClass(), "sourcePosition", 0);
        setField(term84828, term84828.getClass(), "jsType", null);
        setField(term84828, term84828.getClass(), "parent", null);
        setField(term84827, term84827.getClass(), "next", term84828);
        setField(term84827, term84827.getClass(), "first", null);
        setField(term84827, term84827.getClass(), "last", null);
        setField(term84827, term84827.getClass(), "propListHead", null);
        setIntField(term84827, term84827.getClass(), "sourcePosition", 0);
        setField(term84827, term84827.getClass(), "jsType", null);
        setField(term84827, term84827.getClass(), "parent", null);
        setField(term84826, term84826.getClass(), "first", term84827);
        setField(term84826, term84826.getClass(), "last", null);
        setField(term84826, term84826.getClass(), "propListHead", null);
        setIntField(term84826, term84826.getClass(), "sourcePosition", 0);
        setField(term84826, term84826.getClass(), "jsType", null);
        setField(term84826, term84826.getClass(), "parent", null);
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
        args[1] = term84409;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term84339, args);
        assertTrue(recursiveEquals(term84339, term84825));
        assertTrue(recursiveEquals(term84409, null));
    }

};


