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

public class PeepholeFoldConstants_optimizeSubtree_160650699393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15923;
     Object term15993;
     Object term16263;
     Object term16264;
     Object term16253;

    public PeepholeFoldConstants_optimizeSubtree_160650699393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15923 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term15993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15993, term15993.getClass(), "type", 11);
        term16263 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term16263, term16263.getClass(), "currentTraversal", null);
        term16264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16264, term16264.getClass(), "type", 11);
        setField(term16264, term16264.getClass(), "next", null);
        setField(term16264, term16264.getClass(), "first", null);
        setField(term16264, term16264.getClass(), "last", null);
        setField(term16264, term16264.getClass(), "propListHead", null);
        setIntField(term16264, term16264.getClass(), "sourcePosition", 0);
        setField(term16264, term16264.getClass(), "jsType", null);
        setField(term16264, term16264.getClass(), "parent", null);
        term16253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16253, term16253.getClass(), "type", 11);
        setField(term16253, term16253.getClass(), "next", null);
        setField(term16253, term16253.getClass(), "first", null);
        setField(term16253, term16253.getClass(), "last", null);
        setField(term16253, term16253.getClass(), "propListHead", null);
        setIntField(term16253, term16253.getClass(), "sourcePosition", 0);
        setField(term16253, term16253.getClass(), "jsType", null);
        setField(term16253, term16253.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15993;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term15923, args);
        assertTrue(recursiveEquals(term15923, term16263));
        assertTrue(recursiveEquals(term15993, term16264));
        assertTrue(recursiveEquals(retValue, term16253));
    }

};


