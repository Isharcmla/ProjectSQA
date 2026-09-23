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

public class FoldConstants_tryFoldBlock_1167048042203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51688;
     Object term51758;
     Object term51998;
     Object term51999;

    public FoldConstants_tryFoldBlock_1167048042203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51688 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term51758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51828, term51828.getClass(), "next", term51758);
        setIntField(term51828, term51828.getClass(), "type", 112);
        setField(term51758, term51758.getClass(), "first", term51828);
        setField(term51758, term51758.getClass(), "next", term51898);
        setIntField(term51758, term51758.getClass(), "type", 74);
        term51998 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term51998, term51998.getClass(), "compiler", null);
        term51999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51999, term51999.getClass(), "type", 74);
        setIntField(term52000, term52000.getClass(), "type", 0);
        setField(term52000, term52000.getClass(), "next", null);
        setField(term52000, term52000.getClass(), "first", null);
        setField(term52000, term52000.getClass(), "last", null);
        setField(term52000, term52000.getClass(), "propListHead", null);
        setIntField(term52000, term52000.getClass(), "sourcePosition", 0);
        setField(term52000, term52000.getClass(), "jsType", null);
        setField(term52000, term52000.getClass(), "parent", null);
        setField(term51999, term51999.getClass(), "next", term52000);
        setIntField(term52001, term52001.getClass(), "type", 112);
        setField(term52001, term52001.getClass(), "next", term51999);
        setField(term52001, term52001.getClass(), "first", null);
        setField(term52001, term52001.getClass(), "last", null);
        setField(term52001, term52001.getClass(), "propListHead", null);
        setIntField(term52001, term52001.getClass(), "sourcePosition", 0);
        setField(term52001, term52001.getClass(), "jsType", null);
        setField(term52001, term52001.getClass(), "parent", null);
        setField(term51999, term51999.getClass(), "first", term52001);
        setField(term51999, term51999.getClass(), "last", null);
        setField(term51999, term51999.getClass(), "propListHead", null);
        setIntField(term51999, term51999.getClass(), "sourcePosition", 0);
        setField(term51999, term51999.getClass(), "jsType", null);
        setField(term51999, term51999.getClass(), "parent", null);
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
        args[1] = term51758;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term51688, args);
        assertTrue(recursiveEquals(term51688, term51998));
        assertTrue(recursiveEquals(term51758, null));
    }

};


