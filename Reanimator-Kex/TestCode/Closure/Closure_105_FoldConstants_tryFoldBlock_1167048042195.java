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

public class FoldConstants_tryFoldBlock_1167048042195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49749;
     Object term49819;
     Object term50059;
     Object term50060;

    public FoldConstants_tryFoldBlock_1167048042195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49749 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term49819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49889, term49889.getClass(), "next", term49819);
        setIntField(term49889, term49889.getClass(), "type", 60);
        setField(term49819, term49819.getClass(), "first", term49889);
        setField(term49819, term49819.getClass(), "next", term49959);
        setIntField(term49819, term49819.getClass(), "type", 54);
        term50059 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term50059, term50059.getClass(), "compiler", null);
        term50060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50060, term50060.getClass(), "type", 54);
        setIntField(term50061, term50061.getClass(), "type", 0);
        setField(term50061, term50061.getClass(), "next", null);
        setField(term50061, term50061.getClass(), "first", null);
        setField(term50061, term50061.getClass(), "last", null);
        setField(term50061, term50061.getClass(), "propListHead", null);
        setIntField(term50061, term50061.getClass(), "sourcePosition", 0);
        setField(term50061, term50061.getClass(), "jsType", null);
        setField(term50061, term50061.getClass(), "parent", null);
        setField(term50060, term50060.getClass(), "next", term50061);
        setIntField(term50062, term50062.getClass(), "type", 60);
        setField(term50062, term50062.getClass(), "next", term50060);
        setField(term50062, term50062.getClass(), "first", null);
        setField(term50062, term50062.getClass(), "last", null);
        setField(term50062, term50062.getClass(), "propListHead", null);
        setIntField(term50062, term50062.getClass(), "sourcePosition", 0);
        setField(term50062, term50062.getClass(), "jsType", null);
        setField(term50062, term50062.getClass(), "parent", null);
        setField(term50060, term50060.getClass(), "first", term50062);
        setField(term50060, term50060.getClass(), "last", null);
        setField(term50060, term50060.getClass(), "propListHead", null);
        setIntField(term50060, term50060.getClass(), "sourcePosition", 0);
        setField(term50060, term50060.getClass(), "jsType", null);
        setField(term50060, term50060.getClass(), "parent", null);
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
        args[1] = term49819;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term49749, args);
        assertTrue(recursiveEquals(term49749, term50059));
        assertTrue(recursiveEquals(term49819, null));
    }

};


