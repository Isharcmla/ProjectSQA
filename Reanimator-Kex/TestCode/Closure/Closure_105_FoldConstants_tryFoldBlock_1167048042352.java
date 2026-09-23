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

public class FoldConstants_tryFoldBlock_1167048042352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98117;
     Object term98187;
     Object term99048;
     Object term99049;

    public FoldConstants_tryFoldBlock_1167048042352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98117 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term98187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98467, term98467.getClass(), "next", term98537);
        setIntField(term98467, term98467.getClass(), "type", 123);
        setField(term98397, term98397.getClass(), "next", term98467);
        setIntField(term98397, term98397.getClass(), "type", 68);
        setField(term98327, term98327.getClass(), "next", term98397);
        setIntField(term98327, term98327.getClass(), "type", 55);
        setField(term98257, term98257.getClass(), "next", term98327);
        setIntField(term98257, term98257.getClass(), "type", 31);
        setField(term98187, term98187.getClass(), "first", term98257);
        term99048 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term99048, term99048.getClass(), "compiler", null);
        term99049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99049, term99049.getClass(), "type", 0);
        setField(term99049, term99049.getClass(), "next", null);
        setIntField(term99050, term99050.getClass(), "type", 31);
        setIntField(term99051, term99051.getClass(), "type", 55);
        setIntField(term99052, term99052.getClass(), "type", 68);
        setIntField(term99053, term99053.getClass(), "type", 123);
        setField(term99053, term99053.getClass(), "next", null);
        setField(term99053, term99053.getClass(), "first", null);
        setField(term99053, term99053.getClass(), "last", null);
        setField(term99053, term99053.getClass(), "propListHead", null);
        setIntField(term99053, term99053.getClass(), "sourcePosition", 0);
        setField(term99053, term99053.getClass(), "jsType", null);
        setField(term99053, term99053.getClass(), "parent", null);
        setField(term99052, term99052.getClass(), "next", term99053);
        setField(term99052, term99052.getClass(), "first", null);
        setField(term99052, term99052.getClass(), "last", null);
        setField(term99052, term99052.getClass(), "propListHead", null);
        setIntField(term99052, term99052.getClass(), "sourcePosition", 0);
        setField(term99052, term99052.getClass(), "jsType", null);
        setField(term99052, term99052.getClass(), "parent", null);
        setField(term99051, term99051.getClass(), "next", term99052);
        setField(term99051, term99051.getClass(), "first", null);
        setField(term99051, term99051.getClass(), "last", null);
        setField(term99051, term99051.getClass(), "propListHead", null);
        setIntField(term99051, term99051.getClass(), "sourcePosition", 0);
        setField(term99051, term99051.getClass(), "jsType", null);
        setField(term99051, term99051.getClass(), "parent", null);
        setField(term99050, term99050.getClass(), "next", term99051);
        setField(term99050, term99050.getClass(), "first", null);
        setField(term99050, term99050.getClass(), "last", null);
        setField(term99050, term99050.getClass(), "propListHead", null);
        setIntField(term99050, term99050.getClass(), "sourcePosition", 0);
        setField(term99050, term99050.getClass(), "jsType", null);
        setField(term99050, term99050.getClass(), "parent", null);
        setField(term99049, term99049.getClass(), "first", term99050);
        setField(term99049, term99049.getClass(), "last", null);
        setField(term99049, term99049.getClass(), "propListHead", null);
        setIntField(term99049, term99049.getClass(), "sourcePosition", 0);
        setField(term99049, term99049.getClass(), "jsType", null);
        setField(term99049, term99049.getClass(), "parent", null);
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
        args[1] = term98187;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term98117, args);
        assertTrue(recursiveEquals(term98117, term99048));
        assertTrue(recursiveEquals(term98187, null));
    }

};


