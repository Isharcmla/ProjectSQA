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

public class FoldConstants_tryFoldBlock_1167048042237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62250;
     Object term62320;
     Object term62560;
     Object term62561;

    public FoldConstants_tryFoldBlock_1167048042237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62250 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term62320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62390, term62390.getClass(), "next", term62320);
        setIntField(term62390, term62390.getClass(), "type", 60);
        setField(term62320, term62320.getClass(), "first", term62390);
        setField(term62320, term62320.getClass(), "next", term62460);
        setIntField(term62320, term62320.getClass(), "type", 79);
        term62560 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term62560, term62560.getClass(), "compiler", null);
        term62561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62561, term62561.getClass(), "type", 79);
        setIntField(term62562, term62562.getClass(), "type", 0);
        setField(term62562, term62562.getClass(), "next", null);
        setField(term62562, term62562.getClass(), "first", null);
        setField(term62562, term62562.getClass(), "last", null);
        setField(term62562, term62562.getClass(), "propListHead", null);
        setIntField(term62562, term62562.getClass(), "sourcePosition", 0);
        setField(term62562, term62562.getClass(), "jsType", null);
        setField(term62562, term62562.getClass(), "parent", null);
        setField(term62561, term62561.getClass(), "next", term62562);
        setIntField(term62563, term62563.getClass(), "type", 60);
        setField(term62563, term62563.getClass(), "next", term62561);
        setField(term62563, term62563.getClass(), "first", null);
        setField(term62563, term62563.getClass(), "last", null);
        setField(term62563, term62563.getClass(), "propListHead", null);
        setIntField(term62563, term62563.getClass(), "sourcePosition", 0);
        setField(term62563, term62563.getClass(), "jsType", null);
        setField(term62563, term62563.getClass(), "parent", null);
        setField(term62561, term62561.getClass(), "first", term62563);
        setField(term62561, term62561.getClass(), "last", null);
        setField(term62561, term62561.getClass(), "propListHead", null);
        setIntField(term62561, term62561.getClass(), "sourcePosition", 0);
        setField(term62561, term62561.getClass(), "jsType", null);
        setField(term62561, term62561.getClass(), "parent", null);
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
        args[1] = term62320;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term62250, args);
        assertTrue(recursiveEquals(term62250, term62560));
        assertTrue(recursiveEquals(term62320, null));
    }

};


