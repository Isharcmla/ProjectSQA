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

public class PeepholeFoldConstants_optimizeSubtree_160650699384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13167;
     Object term13237;
     Object term13438;
     Object term13439;
     Object term13429;

    public PeepholeFoldConstants_optimizeSubtree_160650699384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13237, term13237.getClass(), "type", 69);
        term13438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term13438, term13438.getClass(), "currentTraversal", null);
        term13439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13439, term13439.getClass(), "type", 69);
        setField(term13439, term13439.getClass(), "next", null);
        setField(term13439, term13439.getClass(), "first", null);
        setField(term13439, term13439.getClass(), "last", null);
        setField(term13439, term13439.getClass(), "propListHead", null);
        setIntField(term13439, term13439.getClass(), "sourcePosition", 0);
        setField(term13439, term13439.getClass(), "jsType", null);
        setField(term13439, term13439.getClass(), "parent", null);
        term13429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13429, term13429.getClass(), "type", 69);
        setField(term13429, term13429.getClass(), "next", null);
        setField(term13429, term13429.getClass(), "first", null);
        setField(term13429, term13429.getClass(), "last", null);
        setField(term13429, term13429.getClass(), "propListHead", null);
        setIntField(term13429, term13429.getClass(), "sourcePosition", 0);
        setField(term13429, term13429.getClass(), "jsType", null);
        setField(term13429, term13429.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13237;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13167, args);
        assertTrue(recursiveEquals(term13167, term13438));
        assertTrue(recursiveEquals(term13237, term13439));
        assertTrue(recursiveEquals(retValue, term13429));
    }

};


