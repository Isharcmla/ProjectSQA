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

public class FoldConstants_tryFoldBlock_1167048042397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113535;
     Object term113605;
     Object term114122;
     Object term114123;

    public FoldConstants_tryFoldBlock_1167048042397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113535 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term113605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term113815, term113815.getClass(), "next", term113885);
        setIntField(term113815, term113815.getClass(), "type", 59);
        setField(term113745, term113745.getClass(), "next", term113815);
        setIntField(term113745, term113745.getClass(), "type", 96);
        setIntField(term113955, term113955.getClass(), "type", 129);
        setField(term113745, term113745.getClass(), "first", term113955);
        setField(term113675, term113675.getClass(), "next", term113745);
        setIntField(term113675, term113675.getClass(), "type", 129);
        setField(term113605, term113605.getClass(), "first", term113675);
        term114122 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term114122, term114122.getClass(), "compiler", null);
        term114123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term114123, term114123.getClass(), "type", 0);
        setField(term114123, term114123.getClass(), "next", null);
        setIntField(term114124, term114124.getClass(), "type", 129);
        setIntField(term114125, term114125.getClass(), "type", 96);
        setIntField(term114126, term114126.getClass(), "type", 59);
        setIntField(term114127, term114127.getClass(), "type", 0);
        setField(term114127, term114127.getClass(), "next", null);
        setField(term114127, term114127.getClass(), "first", null);
        setField(term114127, term114127.getClass(), "last", null);
        setField(term114127, term114127.getClass(), "propListHead", null);
        setIntField(term114127, term114127.getClass(), "sourcePosition", 0);
        setField(term114127, term114127.getClass(), "jsType", null);
        setField(term114127, term114127.getClass(), "parent", null);
        setField(term114126, term114126.getClass(), "next", term114127);
        setField(term114126, term114126.getClass(), "first", null);
        setField(term114126, term114126.getClass(), "last", null);
        setField(term114126, term114126.getClass(), "propListHead", null);
        setIntField(term114126, term114126.getClass(), "sourcePosition", 0);
        setField(term114126, term114126.getClass(), "jsType", null);
        setField(term114126, term114126.getClass(), "parent", null);
        setField(term114125, term114125.getClass(), "next", term114126);
        setIntField(term114128, term114128.getClass(), "type", 129);
        setField(term114128, term114128.getClass(), "next", null);
        setField(term114128, term114128.getClass(), "first", null);
        setField(term114128, term114128.getClass(), "last", null);
        setField(term114128, term114128.getClass(), "propListHead", null);
        setIntField(term114128, term114128.getClass(), "sourcePosition", 0);
        setField(term114128, term114128.getClass(), "jsType", null);
        setField(term114128, term114128.getClass(), "parent", null);
        setField(term114125, term114125.getClass(), "first", term114128);
        setField(term114125, term114125.getClass(), "last", null);
        setField(term114125, term114125.getClass(), "propListHead", null);
        setIntField(term114125, term114125.getClass(), "sourcePosition", 0);
        setField(term114125, term114125.getClass(), "jsType", null);
        setField(term114125, term114125.getClass(), "parent", null);
        setField(term114124, term114124.getClass(), "next", term114125);
        setField(term114124, term114124.getClass(), "first", null);
        setField(term114124, term114124.getClass(), "last", null);
        setField(term114124, term114124.getClass(), "propListHead", null);
        setIntField(term114124, term114124.getClass(), "sourcePosition", 0);
        setField(term114124, term114124.getClass(), "jsType", null);
        setField(term114124, term114124.getClass(), "parent", null);
        setField(term114123, term114123.getClass(), "first", term114124);
        setField(term114123, term114123.getClass(), "last", null);
        setField(term114123, term114123.getClass(), "propListHead", null);
        setIntField(term114123, term114123.getClass(), "sourcePosition", 0);
        setField(term114123, term114123.getClass(), "jsType", null);
        setField(term114123, term114123.getClass(), "parent", null);
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
        args[1] = term113605;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term113535, args);
        assertTrue(recursiveEquals(term113535, term114122));
        assertTrue(recursiveEquals(term113605, null));
    }

};


