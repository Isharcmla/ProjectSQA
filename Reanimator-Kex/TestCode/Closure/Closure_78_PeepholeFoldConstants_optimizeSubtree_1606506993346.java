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

public class PeepholeFoldConstants_optimizeSubtree_1606506993346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79937;
     Object term80007;
     Object term91913;
     Object term91914;
     Object term91895;

    public PeepholeFoldConstants_optimizeSubtree_1606506993346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term80007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80007, term80007.getClass(), "type", 89);
        setField(term80007, term80007.getClass(), "last", term80007);
        term91913 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term91913, term91913.getClass(), "currentTraversal", null);
        term91914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91914, term91914.getClass(), "type", 89);
        setField(term91914, term91914.getClass(), "next", null);
        setField(term91914, term91914.getClass(), "first", null);
        setField(term91914, term91914.getClass(), "last", term91914);
        setField(term91914, term91914.getClass(), "propListHead", null);
        setIntField(term91914, term91914.getClass(), "sourcePosition", 0);
        setField(term91914, term91914.getClass(), "jsType", null);
        setField(term91914, term91914.getClass(), "parent", null);
        term91895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91895, term91895.getClass(), "type", 89);
        setField(term91895, term91895.getClass(), "next", null);
        setField(term91895, term91895.getClass(), "first", null);
        setField(term91895, term91895.getClass(), "last", term91895);
        setField(term91895, term91895.getClass(), "propListHead", null);
        setIntField(term91895, term91895.getClass(), "sourcePosition", 0);
        setField(term91895, term91895.getClass(), "jsType", null);
        setField(term91895, term91895.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term80007;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term79937, args);
        assertTrue(recursiveEquals(term79937, term91913));
        assertTrue(recursiveEquals(term80007, term91914));
        assertTrue(recursiveEquals(retValue, term91895));
    }

};


