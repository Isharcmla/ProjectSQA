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

public class FoldConstants_tryFoldBlock_1167048042353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98660;
     Object term98730;
     Object term99153;
     Object term99154;

    public FoldConstants_tryFoldBlock_1167048042353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98660 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term98730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98800, term98800.getClass(), "next", term98730);
        setIntField(term98800, term98800.getClass(), "type", 112);
        setField(term98730, term98730.getClass(), "first", term98800);
        setField(term98730, term98730.getClass(), "next", term98870);
        setIntField(term98730, term98730.getClass(), "type", 117);
        term99153 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term99153, term99153.getClass(), "compiler", null);
        term99154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99154, term99154.getClass(), "type", 117);
        setIntField(term99155, term99155.getClass(), "type", 0);
        setField(term99155, term99155.getClass(), "next", null);
        setField(term99155, term99155.getClass(), "first", null);
        setField(term99155, term99155.getClass(), "last", null);
        setField(term99155, term99155.getClass(), "propListHead", null);
        setIntField(term99155, term99155.getClass(), "sourcePosition", 0);
        setField(term99155, term99155.getClass(), "jsType", null);
        setField(term99155, term99155.getClass(), "parent", null);
        setField(term99154, term99154.getClass(), "next", term99155);
        setIntField(term99156, term99156.getClass(), "type", 112);
        setField(term99156, term99156.getClass(), "next", term99154);
        setField(term99156, term99156.getClass(), "first", null);
        setField(term99156, term99156.getClass(), "last", null);
        setField(term99156, term99156.getClass(), "propListHead", null);
        setIntField(term99156, term99156.getClass(), "sourcePosition", 0);
        setField(term99156, term99156.getClass(), "jsType", null);
        setField(term99156, term99156.getClass(), "parent", null);
        setField(term99154, term99154.getClass(), "first", term99156);
        setField(term99154, term99154.getClass(), "last", null);
        setField(term99154, term99154.getClass(), "propListHead", null);
        setIntField(term99154, term99154.getClass(), "sourcePosition", 0);
        setField(term99154, term99154.getClass(), "jsType", null);
        setField(term99154, term99154.getClass(), "parent", null);
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
        args[1] = term98730;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term98660, args);
        assertTrue(recursiveEquals(term98660, term99153));
        assertTrue(recursiveEquals(term98730, null));
    }

};


