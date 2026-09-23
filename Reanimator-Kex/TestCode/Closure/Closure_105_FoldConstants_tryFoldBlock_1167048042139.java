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

public class FoldConstants_tryFoldBlock_1167048042139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31443;
     Object term31513;
     Object term31925;
     Object term31926;

    public FoldConstants_tryFoldBlock_1167048042139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31443 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term31513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31513, term31513.getClass(), "first", term31513);
        setField(term31513, term31513.getClass(), "next", term31583);
        setIntField(term31513, term31513.getClass(), "type", 102);
        term31925 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term31925, term31925.getClass(), "compiler", null);
        term31926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31926, term31926.getClass(), "type", 102);
        setIntField(term31927, term31927.getClass(), "type", 0);
        setField(term31927, term31927.getClass(), "next", null);
        setField(term31927, term31927.getClass(), "first", null);
        setField(term31927, term31927.getClass(), "last", null);
        setField(term31927, term31927.getClass(), "propListHead", null);
        setIntField(term31927, term31927.getClass(), "sourcePosition", 0);
        setField(term31927, term31927.getClass(), "jsType", null);
        setField(term31927, term31927.getClass(), "parent", null);
        setField(term31926, term31926.getClass(), "next", term31927);
        setField(term31926, term31926.getClass(), "first", term31926);
        setField(term31926, term31926.getClass(), "last", null);
        setField(term31926, term31926.getClass(), "propListHead", null);
        setIntField(term31926, term31926.getClass(), "sourcePosition", 0);
        setField(term31926, term31926.getClass(), "jsType", null);
        setField(term31926, term31926.getClass(), "parent", null);
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
        args[1] = term31513;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term31443, args);
        assertTrue(recursiveEquals(term31443, term31925));
        assertTrue(recursiveEquals(term31513, null));
    }

};


