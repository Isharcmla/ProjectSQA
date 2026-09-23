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

public class FoldConstants_tryFoldBlock_116704804291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15741;
     Object term15811;
     Object term16120;
     Object term16121;

    public FoldConstants_tryFoldBlock_116704804291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15741 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term15811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15977 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16073 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term15881, term15881.getClass(), "next", null);
        setIntField(term15881, term15881.getClass(), "type", 0);
        setField(term15811, term15811.getClass(), "first", term15881);
        setIntField(term15977, term15977.getClass(), "type", -38);
        setField(term15977, term15977.getClass(), "next", term16073);
        setField(term15811, term15811.getClass(), "propListHead", term15977);
        term16120 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term16120, term16120.getClass(), "compiler", null);
        term16121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16123 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16124 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16121, term16121.getClass(), "type", 0);
        setField(term16121, term16121.getClass(), "next", null);
        setIntField(term16122, term16122.getClass(), "type", 0);
        setField(term16122, term16122.getClass(), "next", null);
        setField(term16122, term16122.getClass(), "first", null);
        setField(term16122, term16122.getClass(), "last", null);
        setField(term16122, term16122.getClass(), "propListHead", null);
        setIntField(term16122, term16122.getClass(), "sourcePosition", 0);
        setField(term16122, term16122.getClass(), "jsType", null);
        setField(term16122, term16122.getClass(), "parent", null);
        setField(term16121, term16121.getClass(), "first", term16122);
        setField(term16121, term16121.getClass(), "last", null);
        setField(term16124, term16124.getClass(), "next", null);
        setIntField(term16124, term16124.getClass(), "type", 0);
        setIntField(term16124, term16124.getClass(), "intValue", 0);
        setField(term16124, term16124.getClass(), "objectValue", null);
        setField(term16123, term16123.getClass(), "next", term16124);
        setIntField(term16123, term16123.getClass(), "type", -38);
        setIntField(term16123, term16123.getClass(), "intValue", 0);
        setField(term16123, term16123.getClass(), "objectValue", null);
        setField(term16121, term16121.getClass(), "propListHead", term16123);
        setIntField(term16121, term16121.getClass(), "sourcePosition", 0);
        setField(term16121, term16121.getClass(), "jsType", null);
        setField(term16121, term16121.getClass(), "parent", null);
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
        args[1] = term15811;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term15741, args);
        assertTrue(recursiveEquals(term15741, term16120));
        assertTrue(recursiveEquals(term15811, null));
    }

};


