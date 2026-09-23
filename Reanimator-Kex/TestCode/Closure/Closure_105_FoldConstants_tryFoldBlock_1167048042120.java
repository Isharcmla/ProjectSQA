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

public class FoldConstants_tryFoldBlock_1167048042120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18210;
     Object term18280;
     Object term29894;
     Object term29895;

    public FoldConstants_tryFoldBlock_1167048042120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18210 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term18280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18280, term18280.getClass(), "first", null);
        term29894 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term29894, term29894.getClass(), "compiler", null);
        term29895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29895, term29895.getClass(), "type", 0);
        setField(term29895, term29895.getClass(), "next", null);
        setField(term29895, term29895.getClass(), "first", null);
        setField(term29895, term29895.getClass(), "last", null);
        setField(term29895, term29895.getClass(), "propListHead", null);
        setIntField(term29895, term29895.getClass(), "sourcePosition", 0);
        setField(term29895, term29895.getClass(), "jsType", null);
        setField(term29895, term29895.getClass(), "parent", null);
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
        args[1] = term18280;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term18210, args);
        assertTrue(recursiveEquals(term18210, term29894));
        assertTrue(recursiveEquals(term18280, null));
    }

};


