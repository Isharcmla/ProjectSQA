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

public class FoldConstants_tryFoldBlock_1167048042152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33827;
     Object term33897;
     Object term34209;
     Object term34210;

    public FoldConstants_tryFoldBlock_1167048042152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33827 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term33897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33897, term33897.getClass(), "first", term33897);
        setField(term33897, term33897.getClass(), "next", term33967);
        setIntField(term33897, term33897.getClass(), "type", 107);
        term34209 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term34209, term34209.getClass(), "compiler", null);
        term34210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34210, term34210.getClass(), "type", 107);
        setIntField(term34211, term34211.getClass(), "type", 0);
        setField(term34211, term34211.getClass(), "next", null);
        setField(term34211, term34211.getClass(), "first", null);
        setField(term34211, term34211.getClass(), "last", null);
        setField(term34211, term34211.getClass(), "propListHead", null);
        setIntField(term34211, term34211.getClass(), "sourcePosition", 0);
        setField(term34211, term34211.getClass(), "jsType", null);
        setField(term34211, term34211.getClass(), "parent", null);
        setField(term34210, term34210.getClass(), "next", term34211);
        setField(term34210, term34210.getClass(), "first", term34210);
        setField(term34210, term34210.getClass(), "last", null);
        setField(term34210, term34210.getClass(), "propListHead", null);
        setIntField(term34210, term34210.getClass(), "sourcePosition", 0);
        setField(term34210, term34210.getClass(), "jsType", null);
        setField(term34210, term34210.getClass(), "parent", null);
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
        args[1] = term33897;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term33827, args);
        assertTrue(recursiveEquals(term33827, term34209));
        assertTrue(recursiveEquals(term33897, null));
    }

};


