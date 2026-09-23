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

public class FoldConstants_tryFoldBlock_1167048042419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121851;
     Object term121921;
     Object term122449;
     Object term122450;

    public FoldConstants_tryFoldBlock_1167048042419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121851 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term121921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term122201, term122201.getClass(), "next", term122271);
        setIntField(term122201, term122201.getClass(), "type", 68);
        setField(term122131, term122131.getClass(), "next", term122201);
        setIntField(term122131, term122131.getClass(), "type", 70);
        setField(term122061, term122061.getClass(), "next", term122131);
        setIntField(term122061, term122061.getClass(), "type", 128);
        setField(term121991, term121991.getClass(), "next", term122061);
        setIntField(term121991, term121991.getClass(), "type", 103);
        setField(term121921, term121921.getClass(), "first", term121991);
        term122449 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term122449, term122449.getClass(), "compiler", null);
        term122450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term122450, term122450.getClass(), "type", 0);
        setField(term122450, term122450.getClass(), "next", null);
        setIntField(term122451, term122451.getClass(), "type", 103);
        setIntField(term122452, term122452.getClass(), "type", 128);
        setIntField(term122453, term122453.getClass(), "type", 70);
        setIntField(term122454, term122454.getClass(), "type", 68);
        setField(term122454, term122454.getClass(), "next", null);
        setField(term122454, term122454.getClass(), "first", null);
        setField(term122454, term122454.getClass(), "last", null);
        setField(term122454, term122454.getClass(), "propListHead", null);
        setIntField(term122454, term122454.getClass(), "sourcePosition", 0);
        setField(term122454, term122454.getClass(), "jsType", null);
        setField(term122454, term122454.getClass(), "parent", null);
        setField(term122453, term122453.getClass(), "next", term122454);
        setField(term122453, term122453.getClass(), "first", null);
        setField(term122453, term122453.getClass(), "last", null);
        setField(term122453, term122453.getClass(), "propListHead", null);
        setIntField(term122453, term122453.getClass(), "sourcePosition", 0);
        setField(term122453, term122453.getClass(), "jsType", null);
        setField(term122453, term122453.getClass(), "parent", null);
        setField(term122452, term122452.getClass(), "next", term122453);
        setField(term122452, term122452.getClass(), "first", null);
        setField(term122452, term122452.getClass(), "last", null);
        setField(term122452, term122452.getClass(), "propListHead", null);
        setIntField(term122452, term122452.getClass(), "sourcePosition", 0);
        setField(term122452, term122452.getClass(), "jsType", null);
        setField(term122452, term122452.getClass(), "parent", null);
        setField(term122451, term122451.getClass(), "next", term122452);
        setField(term122451, term122451.getClass(), "first", null);
        setField(term122451, term122451.getClass(), "last", null);
        setField(term122451, term122451.getClass(), "propListHead", null);
        setIntField(term122451, term122451.getClass(), "sourcePosition", 0);
        setField(term122451, term122451.getClass(), "jsType", null);
        setField(term122451, term122451.getClass(), "parent", null);
        setField(term122450, term122450.getClass(), "first", term122451);
        setField(term122450, term122450.getClass(), "last", null);
        setField(term122450, term122450.getClass(), "propListHead", null);
        setIntField(term122450, term122450.getClass(), "sourcePosition", 0);
        setField(term122450, term122450.getClass(), "jsType", null);
        setField(term122450, term122450.getClass(), "parent", null);
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
        args[1] = term121921;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term121851, args);
        assertTrue(recursiveEquals(term121851, term122449));
        assertTrue(recursiveEquals(term121921, null));
    }

};


