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

public class FoldConstants_tryFoldBlock_1167048042309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83708;
     Object term83778;
     Object term84194;
     Object term84195;

    public FoldConstants_tryFoldBlock_1167048042309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83708 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term83778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83988, term83988.getClass(), "next", term84058);
        setIntField(term83988, term83988.getClass(), "type", 117);
        setField(term83918, term83918.getClass(), "next", term83988);
        setIntField(term83918, term83918.getClass(), "type", 55);
        setField(term83848, term83848.getClass(), "next", term83918);
        setIntField(term83848, term83848.getClass(), "type", 31);
        setField(term83778, term83778.getClass(), "first", term83848);
        term84194 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term84194, term84194.getClass(), "compiler", null);
        term84195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84195, term84195.getClass(), "type", 0);
        setField(term84195, term84195.getClass(), "next", null);
        setIntField(term84196, term84196.getClass(), "type", 31);
        setIntField(term84197, term84197.getClass(), "type", 55);
        setIntField(term84198, term84198.getClass(), "type", 117);
        setIntField(term84199, term84199.getClass(), "type", 0);
        setField(term84199, term84199.getClass(), "next", null);
        setField(term84199, term84199.getClass(), "first", null);
        setField(term84199, term84199.getClass(), "last", null);
        setField(term84199, term84199.getClass(), "propListHead", null);
        setIntField(term84199, term84199.getClass(), "sourcePosition", 0);
        setField(term84199, term84199.getClass(), "jsType", null);
        setField(term84199, term84199.getClass(), "parent", null);
        setField(term84198, term84198.getClass(), "next", term84199);
        setField(term84198, term84198.getClass(), "first", null);
        setField(term84198, term84198.getClass(), "last", null);
        setField(term84198, term84198.getClass(), "propListHead", null);
        setIntField(term84198, term84198.getClass(), "sourcePosition", 0);
        setField(term84198, term84198.getClass(), "jsType", null);
        setField(term84198, term84198.getClass(), "parent", null);
        setField(term84197, term84197.getClass(), "next", term84198);
        setField(term84197, term84197.getClass(), "first", null);
        setField(term84197, term84197.getClass(), "last", null);
        setField(term84197, term84197.getClass(), "propListHead", null);
        setIntField(term84197, term84197.getClass(), "sourcePosition", 0);
        setField(term84197, term84197.getClass(), "jsType", null);
        setField(term84197, term84197.getClass(), "parent", null);
        setField(term84196, term84196.getClass(), "next", term84197);
        setField(term84196, term84196.getClass(), "first", null);
        setField(term84196, term84196.getClass(), "last", null);
        setField(term84196, term84196.getClass(), "propListHead", null);
        setIntField(term84196, term84196.getClass(), "sourcePosition", 0);
        setField(term84196, term84196.getClass(), "jsType", null);
        setField(term84196, term84196.getClass(), "parent", null);
        setField(term84195, term84195.getClass(), "first", term84196);
        setField(term84195, term84195.getClass(), "last", null);
        setField(term84195, term84195.getClass(), "propListHead", null);
        setIntField(term84195, term84195.getClass(), "sourcePosition", 0);
        setField(term84195, term84195.getClass(), "jsType", null);
        setField(term84195, term84195.getClass(), "parent", null);
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
        args[1] = term83778;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term83708, args);
        assertTrue(recursiveEquals(term83708, term84194));
        assertTrue(recursiveEquals(term83778, null));
    }

};


