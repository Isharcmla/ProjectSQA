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

public class FoldConstants_tryFoldBlock_1167048042207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52998;
     Object term53068;
     Object term53308;
     Object term53309;

    public FoldConstants_tryFoldBlock_1167048042207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52998 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term53068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53138, term53138.getClass(), "next", term53068);
        setIntField(term53138, term53138.getClass(), "type", 107);
        setField(term53068, term53068.getClass(), "first", term53138);
        setField(term53068, term53068.getClass(), "next", term53208);
        setIntField(term53068, term53068.getClass(), "type", 109);
        term53308 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term53308, term53308.getClass(), "compiler", null);
        term53309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53309, term53309.getClass(), "type", 109);
        setIntField(term53310, term53310.getClass(), "type", 0);
        setField(term53310, term53310.getClass(), "next", null);
        setField(term53310, term53310.getClass(), "first", null);
        setField(term53310, term53310.getClass(), "last", null);
        setField(term53310, term53310.getClass(), "propListHead", null);
        setIntField(term53310, term53310.getClass(), "sourcePosition", 0);
        setField(term53310, term53310.getClass(), "jsType", null);
        setField(term53310, term53310.getClass(), "parent", null);
        setField(term53309, term53309.getClass(), "next", term53310);
        setIntField(term53311, term53311.getClass(), "type", 107);
        setField(term53311, term53311.getClass(), "next", term53309);
        setField(term53311, term53311.getClass(), "first", null);
        setField(term53311, term53311.getClass(), "last", null);
        setField(term53311, term53311.getClass(), "propListHead", null);
        setIntField(term53311, term53311.getClass(), "sourcePosition", 0);
        setField(term53311, term53311.getClass(), "jsType", null);
        setField(term53311, term53311.getClass(), "parent", null);
        setField(term53309, term53309.getClass(), "first", term53311);
        setField(term53309, term53309.getClass(), "last", null);
        setField(term53309, term53309.getClass(), "propListHead", null);
        setIntField(term53309, term53309.getClass(), "sourcePosition", 0);
        setField(term53309, term53309.getClass(), "jsType", null);
        setField(term53309, term53309.getClass(), "parent", null);
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
        args[1] = term53068;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term52998, args);
        assertTrue(recursiveEquals(term52998, term53308));
        assertTrue(recursiveEquals(term53068, null));
    }

};


