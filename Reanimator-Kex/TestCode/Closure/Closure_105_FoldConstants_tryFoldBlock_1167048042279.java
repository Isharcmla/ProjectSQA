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

public class FoldConstants_tryFoldBlock_1167048042279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74372;
     Object term74442;
     Object term74880;
     Object term74881;

    public FoldConstants_tryFoldBlock_1167048042279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74372 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term74442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74652, term74652.getClass(), "next", term74722);
        setIntField(term74652, term74652.getClass(), "type", 120);
        setField(term74582, term74582.getClass(), "next", term74652);
        setIntField(term74582, term74582.getClass(), "type", 127);
        setField(term74512, term74512.getClass(), "next", term74582);
        setIntField(term74512, term74512.getClass(), "type", 103);
        setField(term74442, term74442.getClass(), "first", term74512);
        term74880 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term74880, term74880.getClass(), "compiler", null);
        term74881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74881, term74881.getClass(), "type", 0);
        setField(term74881, term74881.getClass(), "next", null);
        setIntField(term74882, term74882.getClass(), "type", 103);
        setIntField(term74883, term74883.getClass(), "type", 127);
        setIntField(term74884, term74884.getClass(), "type", 120);
        setIntField(term74885, term74885.getClass(), "type", 0);
        setField(term74885, term74885.getClass(), "next", null);
        setField(term74885, term74885.getClass(), "first", null);
        setField(term74885, term74885.getClass(), "last", null);
        setField(term74885, term74885.getClass(), "propListHead", null);
        setIntField(term74885, term74885.getClass(), "sourcePosition", 0);
        setField(term74885, term74885.getClass(), "jsType", null);
        setField(term74885, term74885.getClass(), "parent", null);
        setField(term74884, term74884.getClass(), "next", term74885);
        setField(term74884, term74884.getClass(), "first", null);
        setField(term74884, term74884.getClass(), "last", null);
        setField(term74884, term74884.getClass(), "propListHead", null);
        setIntField(term74884, term74884.getClass(), "sourcePosition", 0);
        setField(term74884, term74884.getClass(), "jsType", null);
        setField(term74884, term74884.getClass(), "parent", null);
        setField(term74883, term74883.getClass(), "next", term74884);
        setField(term74883, term74883.getClass(), "first", null);
        setField(term74883, term74883.getClass(), "last", null);
        setField(term74883, term74883.getClass(), "propListHead", null);
        setIntField(term74883, term74883.getClass(), "sourcePosition", 0);
        setField(term74883, term74883.getClass(), "jsType", null);
        setField(term74883, term74883.getClass(), "parent", null);
        setField(term74882, term74882.getClass(), "next", term74883);
        setField(term74882, term74882.getClass(), "first", null);
        setField(term74882, term74882.getClass(), "last", null);
        setField(term74882, term74882.getClass(), "propListHead", null);
        setIntField(term74882, term74882.getClass(), "sourcePosition", 0);
        setField(term74882, term74882.getClass(), "jsType", null);
        setField(term74882, term74882.getClass(), "parent", null);
        setField(term74881, term74881.getClass(), "first", term74882);
        setField(term74881, term74881.getClass(), "last", null);
        setField(term74881, term74881.getClass(), "propListHead", null);
        setIntField(term74881, term74881.getClass(), "sourcePosition", 0);
        setField(term74881, term74881.getClass(), "jsType", null);
        setField(term74881, term74881.getClass(), "parent", null);
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
        args[1] = term74442;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term74372, args);
        assertTrue(recursiveEquals(term74372, term74880));
        assertTrue(recursiveEquals(term74442, null));
    }

};


