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

public class FoldConstants_tryFoldBlock_1167048042245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63989;
     Object term64059;
     Object term65091;
     Object term65092;

    public FoldConstants_tryFoldBlock_1167048042245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63989 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term64059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64269, term64269.getClass(), "next", term64339);
        setIntField(term64269, term64269.getClass(), "type", 73);
        setField(term64199, term64199.getClass(), "next", term64269);
        setIntField(term64199, term64199.getClass(), "type", 81);
        setField(term64129, term64129.getClass(), "next", term64199);
        setIntField(term64129, term64129.getClass(), "type", 103);
        setField(term64059, term64059.getClass(), "first", term64129);
        term65091 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term65091, term65091.getClass(), "compiler", null);
        term65092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65092, term65092.getClass(), "type", 0);
        setField(term65092, term65092.getClass(), "next", null);
        setIntField(term65093, term65093.getClass(), "type", 103);
        setIntField(term65094, term65094.getClass(), "type", 81);
        setIntField(term65095, term65095.getClass(), "type", 73);
        setIntField(term65096, term65096.getClass(), "type", 0);
        setField(term65096, term65096.getClass(), "next", null);
        setField(term65096, term65096.getClass(), "first", null);
        setField(term65096, term65096.getClass(), "last", null);
        setField(term65096, term65096.getClass(), "propListHead", null);
        setIntField(term65096, term65096.getClass(), "sourcePosition", 0);
        setField(term65096, term65096.getClass(), "jsType", null);
        setField(term65096, term65096.getClass(), "parent", null);
        setField(term65095, term65095.getClass(), "next", term65096);
        setField(term65095, term65095.getClass(), "first", null);
        setField(term65095, term65095.getClass(), "last", null);
        setField(term65095, term65095.getClass(), "propListHead", null);
        setIntField(term65095, term65095.getClass(), "sourcePosition", 0);
        setField(term65095, term65095.getClass(), "jsType", null);
        setField(term65095, term65095.getClass(), "parent", null);
        setField(term65094, term65094.getClass(), "next", term65095);
        setField(term65094, term65094.getClass(), "first", null);
        setField(term65094, term65094.getClass(), "last", null);
        setField(term65094, term65094.getClass(), "propListHead", null);
        setIntField(term65094, term65094.getClass(), "sourcePosition", 0);
        setField(term65094, term65094.getClass(), "jsType", null);
        setField(term65094, term65094.getClass(), "parent", null);
        setField(term65093, term65093.getClass(), "next", term65094);
        setField(term65093, term65093.getClass(), "first", null);
        setField(term65093, term65093.getClass(), "last", null);
        setField(term65093, term65093.getClass(), "propListHead", null);
        setIntField(term65093, term65093.getClass(), "sourcePosition", 0);
        setField(term65093, term65093.getClass(), "jsType", null);
        setField(term65093, term65093.getClass(), "parent", null);
        setField(term65092, term65092.getClass(), "first", term65093);
        setField(term65092, term65092.getClass(), "last", null);
        setField(term65092, term65092.getClass(), "propListHead", null);
        setIntField(term65092, term65092.getClass(), "sourcePosition", 0);
        setField(term65092, term65092.getClass(), "jsType", null);
        setField(term65092, term65092.getClass(), "parent", null);
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
        args[1] = term64059;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term63989, args);
        assertTrue(recursiveEquals(term63989, term65091));
        assertTrue(recursiveEquals(term64059, null));
    }

};


