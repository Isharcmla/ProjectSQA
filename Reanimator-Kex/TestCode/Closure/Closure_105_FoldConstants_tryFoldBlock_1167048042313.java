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

public class FoldConstants_tryFoldBlock_1167048042313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84953;
     Object term85023;
     Object term85263;
     Object term85264;

    public FoldConstants_tryFoldBlock_1167048042313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84953 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term85023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85093, term85093.getClass(), "next", term85023);
        setIntField(term85093, term85093.getClass(), "type", 103);
        setField(term85023, term85023.getClass(), "first", term85093);
        setField(term85023, term85023.getClass(), "next", term85163);
        setIntField(term85023, term85023.getClass(), "type", 121);
        term85263 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term85263, term85263.getClass(), "compiler", null);
        term85264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85264, term85264.getClass(), "type", 121);
        setIntField(term85265, term85265.getClass(), "type", 0);
        setField(term85265, term85265.getClass(), "next", null);
        setField(term85265, term85265.getClass(), "first", null);
        setField(term85265, term85265.getClass(), "last", null);
        setField(term85265, term85265.getClass(), "propListHead", null);
        setIntField(term85265, term85265.getClass(), "sourcePosition", 0);
        setField(term85265, term85265.getClass(), "jsType", null);
        setField(term85265, term85265.getClass(), "parent", null);
        setField(term85264, term85264.getClass(), "next", term85265);
        setIntField(term85266, term85266.getClass(), "type", 103);
        setField(term85266, term85266.getClass(), "next", term85264);
        setField(term85266, term85266.getClass(), "first", null);
        setField(term85266, term85266.getClass(), "last", null);
        setField(term85266, term85266.getClass(), "propListHead", null);
        setIntField(term85266, term85266.getClass(), "sourcePosition", 0);
        setField(term85266, term85266.getClass(), "jsType", null);
        setField(term85266, term85266.getClass(), "parent", null);
        setField(term85264, term85264.getClass(), "first", term85266);
        setField(term85264, term85264.getClass(), "last", null);
        setField(term85264, term85264.getClass(), "propListHead", null);
        setIntField(term85264, term85264.getClass(), "sourcePosition", 0);
        setField(term85264, term85264.getClass(), "jsType", null);
        setField(term85264, term85264.getClass(), "parent", null);
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
        args[1] = term85023;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term84953, args);
        assertTrue(recursiveEquals(term84953, term85263));
        assertTrue(recursiveEquals(term85023, null));
    }

};


