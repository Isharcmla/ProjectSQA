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

public class FoldConstants_tryFoldBlock_1167048042197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50184;
     Object term50254;
     Object term50488;
     Object term50489;

    public FoldConstants_tryFoldBlock_1167048042197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50184 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term50254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50254, term50254.getClass(), "first", term50254);
        setField(term50324, term50324.getClass(), "next", term50394);
        setIntField(term50324, term50324.getClass(), "type", 103);
        setField(term50254, term50254.getClass(), "next", term50324);
        setIntField(term50254, term50254.getClass(), "type", 103);
        term50488 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term50488, term50488.getClass(), "compiler", null);
        term50489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50489, term50489.getClass(), "type", 103);
        setIntField(term50490, term50490.getClass(), "type", 103);
        setIntField(term50491, term50491.getClass(), "type", 0);
        setField(term50491, term50491.getClass(), "next", null);
        setField(term50491, term50491.getClass(), "first", null);
        setField(term50491, term50491.getClass(), "last", null);
        setField(term50491, term50491.getClass(), "propListHead", null);
        setIntField(term50491, term50491.getClass(), "sourcePosition", 0);
        setField(term50491, term50491.getClass(), "jsType", null);
        setField(term50491, term50491.getClass(), "parent", null);
        setField(term50490, term50490.getClass(), "next", term50491);
        setField(term50490, term50490.getClass(), "first", null);
        setField(term50490, term50490.getClass(), "last", null);
        setField(term50490, term50490.getClass(), "propListHead", null);
        setIntField(term50490, term50490.getClass(), "sourcePosition", 0);
        setField(term50490, term50490.getClass(), "jsType", null);
        setField(term50490, term50490.getClass(), "parent", null);
        setField(term50489, term50489.getClass(), "next", term50490);
        setField(term50489, term50489.getClass(), "first", term50489);
        setField(term50489, term50489.getClass(), "last", null);
        setField(term50489, term50489.getClass(), "propListHead", null);
        setIntField(term50489, term50489.getClass(), "sourcePosition", 0);
        setField(term50489, term50489.getClass(), "jsType", null);
        setField(term50489, term50489.getClass(), "parent", null);
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
        args[1] = term50254;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term50184, args);
        assertTrue(recursiveEquals(term50184, term50488));
        assertTrue(recursiveEquals(term50254, null));
    }

};


