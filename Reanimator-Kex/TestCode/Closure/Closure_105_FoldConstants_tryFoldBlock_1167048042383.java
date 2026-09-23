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

public class FoldConstants_tryFoldBlock_1167048042383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108961;
     Object term109031;
     Object term109271;
     Object term109272;

    public FoldConstants_tryFoldBlock_1167048042383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108961 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term109031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109101, term109101.getClass(), "next", term109031);
        setIntField(term109101, term109101.getClass(), "type", 81);
        setField(term109031, term109031.getClass(), "first", term109101);
        setField(term109031, term109031.getClass(), "next", term109171);
        setIntField(term109031, term109031.getClass(), "type", 75);
        term109271 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term109271, term109271.getClass(), "compiler", null);
        term109272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term109272, term109272.getClass(), "type", 75);
        setIntField(term109273, term109273.getClass(), "type", 0);
        setField(term109273, term109273.getClass(), "next", null);
        setField(term109273, term109273.getClass(), "first", null);
        setField(term109273, term109273.getClass(), "last", null);
        setField(term109273, term109273.getClass(), "propListHead", null);
        setIntField(term109273, term109273.getClass(), "sourcePosition", 0);
        setField(term109273, term109273.getClass(), "jsType", null);
        setField(term109273, term109273.getClass(), "parent", null);
        setField(term109272, term109272.getClass(), "next", term109273);
        setIntField(term109274, term109274.getClass(), "type", 81);
        setField(term109274, term109274.getClass(), "next", term109272);
        setField(term109274, term109274.getClass(), "first", null);
        setField(term109274, term109274.getClass(), "last", null);
        setField(term109274, term109274.getClass(), "propListHead", null);
        setIntField(term109274, term109274.getClass(), "sourcePosition", 0);
        setField(term109274, term109274.getClass(), "jsType", null);
        setField(term109274, term109274.getClass(), "parent", null);
        setField(term109272, term109272.getClass(), "first", term109274);
        setField(term109272, term109272.getClass(), "last", null);
        setField(term109272, term109272.getClass(), "propListHead", null);
        setIntField(term109272, term109272.getClass(), "sourcePosition", 0);
        setField(term109272, term109272.getClass(), "jsType", null);
        setField(term109272, term109272.getClass(), "parent", null);
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
        args[1] = term109031;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term108961, args);
        assertTrue(recursiveEquals(term108961, term109271));
        assertTrue(recursiveEquals(term109031, null));
    }

};


