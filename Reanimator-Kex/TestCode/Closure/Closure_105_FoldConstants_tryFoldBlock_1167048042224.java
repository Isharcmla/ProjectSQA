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

public class FoldConstants_tryFoldBlock_1167048042224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58135;
     Object term58205;
     Object term59111;
     Object term59112;

    public FoldConstants_tryFoldBlock_1167048042224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58135 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term58205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58415, term58415.getClass(), "next", term58485);
        setIntField(term58415, term58415.getClass(), "type", 68);
        setField(term58345, term58345.getClass(), "next", term58415);
        setIntField(term58345, term58345.getClass(), "type", 81);
        setField(term58275, term58275.getClass(), "next", term58345);
        setIntField(term58275, term58275.getClass(), "type", 103);
        setField(term58205, term58205.getClass(), "first", term58275);
        term59111 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term59111, term59111.getClass(), "compiler", null);
        term59112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59112, term59112.getClass(), "type", 0);
        setField(term59112, term59112.getClass(), "next", null);
        setIntField(term59113, term59113.getClass(), "type", 103);
        setIntField(term59114, term59114.getClass(), "type", 81);
        setIntField(term59115, term59115.getClass(), "type", 68);
        setIntField(term59116, term59116.getClass(), "type", 0);
        setField(term59116, term59116.getClass(), "next", null);
        setField(term59116, term59116.getClass(), "first", null);
        setField(term59116, term59116.getClass(), "last", null);
        setField(term59116, term59116.getClass(), "propListHead", null);
        setIntField(term59116, term59116.getClass(), "sourcePosition", 0);
        setField(term59116, term59116.getClass(), "jsType", null);
        setField(term59116, term59116.getClass(), "parent", null);
        setField(term59115, term59115.getClass(), "next", term59116);
        setField(term59115, term59115.getClass(), "first", null);
        setField(term59115, term59115.getClass(), "last", null);
        setField(term59115, term59115.getClass(), "propListHead", null);
        setIntField(term59115, term59115.getClass(), "sourcePosition", 0);
        setField(term59115, term59115.getClass(), "jsType", null);
        setField(term59115, term59115.getClass(), "parent", null);
        setField(term59114, term59114.getClass(), "next", term59115);
        setField(term59114, term59114.getClass(), "first", null);
        setField(term59114, term59114.getClass(), "last", null);
        setField(term59114, term59114.getClass(), "propListHead", null);
        setIntField(term59114, term59114.getClass(), "sourcePosition", 0);
        setField(term59114, term59114.getClass(), "jsType", null);
        setField(term59114, term59114.getClass(), "parent", null);
        setField(term59113, term59113.getClass(), "next", term59114);
        setField(term59113, term59113.getClass(), "first", null);
        setField(term59113, term59113.getClass(), "last", null);
        setField(term59113, term59113.getClass(), "propListHead", null);
        setIntField(term59113, term59113.getClass(), "sourcePosition", 0);
        setField(term59113, term59113.getClass(), "jsType", null);
        setField(term59113, term59113.getClass(), "parent", null);
        setField(term59112, term59112.getClass(), "first", term59113);
        setField(term59112, term59112.getClass(), "last", null);
        setField(term59112, term59112.getClass(), "propListHead", null);
        setIntField(term59112, term59112.getClass(), "sourcePosition", 0);
        setField(term59112, term59112.getClass(), "jsType", null);
        setField(term59112, term59112.getClass(), "parent", null);
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
        args[1] = term58205;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term58135, args);
        assertTrue(recursiveEquals(term58135, term59111));
        assertTrue(recursiveEquals(term58205, null));
    }

};


