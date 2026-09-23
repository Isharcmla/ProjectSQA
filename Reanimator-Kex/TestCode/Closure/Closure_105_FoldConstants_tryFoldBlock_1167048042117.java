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

public class FoldConstants_tryFoldBlock_1167048042117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17530;
     Object term17600;
     Object term29546;
     Object term29547;

    public FoldConstants_tryFoldBlock_1167048042117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17530 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term17600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17600, term17600.getClass(), "first", term17600);
        setField(term17600, term17600.getClass(), "next", term17670);
        setIntField(term17600, term17600.getClass(), "type", 31);
        term29546 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term29546, term29546.getClass(), "compiler", null);
        term29547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29547, term29547.getClass(), "type", 31);
        setIntField(term29548, term29548.getClass(), "type", 0);
        setField(term29548, term29548.getClass(), "next", null);
        setField(term29548, term29548.getClass(), "first", null);
        setField(term29548, term29548.getClass(), "last", null);
        setField(term29548, term29548.getClass(), "propListHead", null);
        setIntField(term29548, term29548.getClass(), "sourcePosition", 0);
        setField(term29548, term29548.getClass(), "jsType", null);
        setField(term29548, term29548.getClass(), "parent", null);
        setField(term29547, term29547.getClass(), "next", term29548);
        setField(term29547, term29547.getClass(), "first", term29547);
        setField(term29547, term29547.getClass(), "last", null);
        setField(term29547, term29547.getClass(), "propListHead", null);
        setIntField(term29547, term29547.getClass(), "sourcePosition", 0);
        setField(term29547, term29547.getClass(), "jsType", null);
        setField(term29547, term29547.getClass(), "parent", null);
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
        args[1] = term17600;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term17530, args);
        assertTrue(recursiveEquals(term17530, term29546));
        assertTrue(recursiveEquals(term17600, null));
    }

};


