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

public class PeepholeFoldConstants_optimizeSubtree_1606506993181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28274;
     Object term28344;
     Object term28356;
     Object term28357;
     Object term28346;

    public PeepholeFoldConstants_optimizeSubtree_1606506993181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28344, term28344.getClass(), "type", 9);
        term28356 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28356, term28356.getClass(), "currentTraversal", null);
        term28357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28357, term28357.getClass(), "type", 9);
        setField(term28357, term28357.getClass(), "next", null);
        setField(term28357, term28357.getClass(), "first", null);
        setField(term28357, term28357.getClass(), "last", null);
        setField(term28357, term28357.getClass(), "propListHead", null);
        setIntField(term28357, term28357.getClass(), "sourcePosition", 0);
        setField(term28357, term28357.getClass(), "jsType", null);
        setField(term28357, term28357.getClass(), "parent", null);
        term28346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28346, term28346.getClass(), "type", 9);
        setField(term28346, term28346.getClass(), "next", null);
        setField(term28346, term28346.getClass(), "first", null);
        setField(term28346, term28346.getClass(), "last", null);
        setField(term28346, term28346.getClass(), "propListHead", null);
        setIntField(term28346, term28346.getClass(), "sourcePosition", 0);
        setField(term28346, term28346.getClass(), "jsType", null);
        setField(term28346, term28346.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28344;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term28274, args);
        assertTrue(recursiveEquals(term28274, term28356));
        assertTrue(recursiveEquals(term28344, term28357));
        assertTrue(recursiveEquals(retValue, term28346));
    }

};


