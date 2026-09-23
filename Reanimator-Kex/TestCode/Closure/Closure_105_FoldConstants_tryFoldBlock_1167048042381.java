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

public class FoldConstants_tryFoldBlock_1167048042381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108525;
     Object term108595;
     Object term108835;
     Object term108836;

    public FoldConstants_tryFoldBlock_1167048042381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108525 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term108595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term108665, term108665.getClass(), "next", term108595);
        setIntField(term108665, term108665.getClass(), "type", 60);
        setField(term108595, term108595.getClass(), "first", term108665);
        setField(term108595, term108595.getClass(), "next", term108735);
        setIntField(term108595, term108595.getClass(), "type", 82);
        term108835 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term108835, term108835.getClass(), "compiler", null);
        term108836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108836, term108836.getClass(), "type", 82);
        setIntField(term108837, term108837.getClass(), "type", 0);
        setField(term108837, term108837.getClass(), "next", null);
        setField(term108837, term108837.getClass(), "first", null);
        setField(term108837, term108837.getClass(), "last", null);
        setField(term108837, term108837.getClass(), "propListHead", null);
        setIntField(term108837, term108837.getClass(), "sourcePosition", 0);
        setField(term108837, term108837.getClass(), "jsType", null);
        setField(term108837, term108837.getClass(), "parent", null);
        setField(term108836, term108836.getClass(), "next", term108837);
        setIntField(term108838, term108838.getClass(), "type", 60);
        setField(term108838, term108838.getClass(), "next", term108836);
        setField(term108838, term108838.getClass(), "first", null);
        setField(term108838, term108838.getClass(), "last", null);
        setField(term108838, term108838.getClass(), "propListHead", null);
        setIntField(term108838, term108838.getClass(), "sourcePosition", 0);
        setField(term108838, term108838.getClass(), "jsType", null);
        setField(term108838, term108838.getClass(), "parent", null);
        setField(term108836, term108836.getClass(), "first", term108838);
        setField(term108836, term108836.getClass(), "last", null);
        setField(term108836, term108836.getClass(), "propListHead", null);
        setIntField(term108836, term108836.getClass(), "sourcePosition", 0);
        setField(term108836, term108836.getClass(), "jsType", null);
        setField(term108836, term108836.getClass(), "parent", null);
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
        args[1] = term108595;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term108525, args);
        assertTrue(recursiveEquals(term108525, term108835));
        assertTrue(recursiveEquals(term108595, null));
    }

};


