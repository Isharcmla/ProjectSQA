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

public class PeepholeFoldConstants_optimizeSubtree_16065069931138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268239;
     Object term268309;
     Object term268676;
     Object term268677;
     Object term268653;

    public PeepholeFoldConstants_optimizeSubtree_16065069931138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268239 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term268309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term268309, term268309.getClass(), "type", 32);
        setField(term268309, term268309.getClass(), "first", term268309);
        term268676 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term268676, term268676.getClass(), "currentTraversal", null);
        term268677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term268677, term268677.getClass(), "type", 32);
        setField(term268677, term268677.getClass(), "next", null);
        setField(term268677, term268677.getClass(), "first", term268677);
        setField(term268677, term268677.getClass(), "last", null);
        setField(term268677, term268677.getClass(), "propListHead", null);
        setIntField(term268677, term268677.getClass(), "sourcePosition", 0);
        setField(term268677, term268677.getClass(), "jsType", null);
        setField(term268677, term268677.getClass(), "parent", null);
        term268653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term268653, term268653.getClass(), "type", 32);
        setField(term268653, term268653.getClass(), "next", null);
        setField(term268653, term268653.getClass(), "first", term268653);
        setField(term268653, term268653.getClass(), "last", null);
        setField(term268653, term268653.getClass(), "propListHead", null);
        setIntField(term268653, term268653.getClass(), "sourcePosition", 0);
        setField(term268653, term268653.getClass(), "jsType", null);
        setField(term268653, term268653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term268309;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term268239, args);
        assertTrue(recursiveEquals(term268239, term268676));
        assertTrue(recursiveEquals(term268309, term268677));
        assertTrue(recursiveEquals(retValue, term268653));
    }

};


