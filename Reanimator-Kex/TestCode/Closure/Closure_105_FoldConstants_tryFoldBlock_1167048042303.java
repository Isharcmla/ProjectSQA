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

public class FoldConstants_tryFoldBlock_1167048042303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81884;
     Object term81954;
     Object term82471;
     Object term82472;

    public FoldConstants_tryFoldBlock_1167048042303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81884 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term81954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82164, term82164.getClass(), "next", term82234);
        setIntField(term82164, term82164.getClass(), "type", 126);
        setField(term82094, term82094.getClass(), "next", term82164);
        setIntField(term82094, term82094.getClass(), "type", 96);
        setIntField(term82304, term82304.getClass(), "type", 129);
        setField(term82094, term82094.getClass(), "first", term82304);
        setField(term82024, term82024.getClass(), "next", term82094);
        setIntField(term82024, term82024.getClass(), "type", 129);
        setField(term81954, term81954.getClass(), "first", term82024);
        term82471 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term82471, term82471.getClass(), "compiler", null);
        term82472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82472, term82472.getClass(), "type", 0);
        setField(term82472, term82472.getClass(), "next", null);
        setIntField(term82473, term82473.getClass(), "type", 129);
        setIntField(term82474, term82474.getClass(), "type", 96);
        setIntField(term82475, term82475.getClass(), "type", 126);
        setIntField(term82476, term82476.getClass(), "type", 0);
        setField(term82476, term82476.getClass(), "next", null);
        setField(term82476, term82476.getClass(), "first", null);
        setField(term82476, term82476.getClass(), "last", null);
        setField(term82476, term82476.getClass(), "propListHead", null);
        setIntField(term82476, term82476.getClass(), "sourcePosition", 0);
        setField(term82476, term82476.getClass(), "jsType", null);
        setField(term82476, term82476.getClass(), "parent", null);
        setField(term82475, term82475.getClass(), "next", term82476);
        setField(term82475, term82475.getClass(), "first", null);
        setField(term82475, term82475.getClass(), "last", null);
        setField(term82475, term82475.getClass(), "propListHead", null);
        setIntField(term82475, term82475.getClass(), "sourcePosition", 0);
        setField(term82475, term82475.getClass(), "jsType", null);
        setField(term82475, term82475.getClass(), "parent", null);
        setField(term82474, term82474.getClass(), "next", term82475);
        setIntField(term82477, term82477.getClass(), "type", 129);
        setField(term82477, term82477.getClass(), "next", null);
        setField(term82477, term82477.getClass(), "first", null);
        setField(term82477, term82477.getClass(), "last", null);
        setField(term82477, term82477.getClass(), "propListHead", null);
        setIntField(term82477, term82477.getClass(), "sourcePosition", 0);
        setField(term82477, term82477.getClass(), "jsType", null);
        setField(term82477, term82477.getClass(), "parent", null);
        setField(term82474, term82474.getClass(), "first", term82477);
        setField(term82474, term82474.getClass(), "last", null);
        setField(term82474, term82474.getClass(), "propListHead", null);
        setIntField(term82474, term82474.getClass(), "sourcePosition", 0);
        setField(term82474, term82474.getClass(), "jsType", null);
        setField(term82474, term82474.getClass(), "parent", null);
        setField(term82473, term82473.getClass(), "next", term82474);
        setField(term82473, term82473.getClass(), "first", null);
        setField(term82473, term82473.getClass(), "last", null);
        setField(term82473, term82473.getClass(), "propListHead", null);
        setIntField(term82473, term82473.getClass(), "sourcePosition", 0);
        setField(term82473, term82473.getClass(), "jsType", null);
        setField(term82473, term82473.getClass(), "parent", null);
        setField(term82472, term82472.getClass(), "first", term82473);
        setField(term82472, term82472.getClass(), "last", null);
        setField(term82472, term82472.getClass(), "propListHead", null);
        setIntField(term82472, term82472.getClass(), "sourcePosition", 0);
        setField(term82472, term82472.getClass(), "jsType", null);
        setField(term82472, term82472.getClass(), "parent", null);
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
        args[1] = term81954;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term81884, args);
        assertTrue(recursiveEquals(term81884, term82471));
        assertTrue(recursiveEquals(term81954, null));
    }

};


