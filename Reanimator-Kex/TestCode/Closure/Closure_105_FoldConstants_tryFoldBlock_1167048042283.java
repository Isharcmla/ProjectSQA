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

public class FoldConstants_tryFoldBlock_1167048042283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75529;
     Object term75599;
     Object term76268;
     Object term76269;

    public FoldConstants_tryFoldBlock_1167048042283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75529 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term75599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75879, term75879.getClass(), "next", term75949);
        setIntField(term75879, term75879.getClass(), "type", 119);
        setField(term75809, term75809.getClass(), "next", term75879);
        setIntField(term75809, term75809.getClass(), "type", 65);
        setField(term75739, term75739.getClass(), "next", term75809);
        setIntField(term75739, term75739.getClass(), "type", 112);
        setField(term75669, term75669.getClass(), "next", term75739);
        setIntField(term75669, term75669.getClass(), "type", 112);
        setField(term75599, term75599.getClass(), "first", term75669);
        term76268 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term76268, term76268.getClass(), "compiler", null);
        term76269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76269, term76269.getClass(), "type", 0);
        setField(term76269, term76269.getClass(), "next", null);
        setIntField(term76270, term76270.getClass(), "type", 112);
        setIntField(term76271, term76271.getClass(), "type", 112);
        setIntField(term76272, term76272.getClass(), "type", 65);
        setIntField(term76273, term76273.getClass(), "type", 119);
        setField(term76273, term76273.getClass(), "next", null);
        setField(term76273, term76273.getClass(), "first", null);
        setField(term76273, term76273.getClass(), "last", null);
        setField(term76273, term76273.getClass(), "propListHead", null);
        setIntField(term76273, term76273.getClass(), "sourcePosition", 0);
        setField(term76273, term76273.getClass(), "jsType", null);
        setField(term76273, term76273.getClass(), "parent", null);
        setField(term76272, term76272.getClass(), "next", term76273);
        setField(term76272, term76272.getClass(), "first", null);
        setField(term76272, term76272.getClass(), "last", null);
        setField(term76272, term76272.getClass(), "propListHead", null);
        setIntField(term76272, term76272.getClass(), "sourcePosition", 0);
        setField(term76272, term76272.getClass(), "jsType", null);
        setField(term76272, term76272.getClass(), "parent", null);
        setField(term76271, term76271.getClass(), "next", term76272);
        setField(term76271, term76271.getClass(), "first", null);
        setField(term76271, term76271.getClass(), "last", null);
        setField(term76271, term76271.getClass(), "propListHead", null);
        setIntField(term76271, term76271.getClass(), "sourcePosition", 0);
        setField(term76271, term76271.getClass(), "jsType", null);
        setField(term76271, term76271.getClass(), "parent", null);
        setField(term76270, term76270.getClass(), "next", term76271);
        setField(term76270, term76270.getClass(), "first", null);
        setField(term76270, term76270.getClass(), "last", null);
        setField(term76270, term76270.getClass(), "propListHead", null);
        setIntField(term76270, term76270.getClass(), "sourcePosition", 0);
        setField(term76270, term76270.getClass(), "jsType", null);
        setField(term76270, term76270.getClass(), "parent", null);
        setField(term76269, term76269.getClass(), "first", term76270);
        setField(term76269, term76269.getClass(), "last", null);
        setField(term76269, term76269.getClass(), "propListHead", null);
        setIntField(term76269, term76269.getClass(), "sourcePosition", 0);
        setField(term76269, term76269.getClass(), "jsType", null);
        setField(term76269, term76269.getClass(), "parent", null);
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
        args[1] = term75599;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term75529, args);
        assertTrue(recursiveEquals(term75529, term76268));
        assertTrue(recursiveEquals(term75599, null));
    }

};


