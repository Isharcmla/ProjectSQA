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

public class PeepholeFoldConstants_optimizeSubtree_1606506993224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35729;
     Object term35799;
     Object term36266;
     Object term36267;
     Object term36245;

    public PeepholeFoldConstants_optimizeSubtree_1606506993224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term35799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35799, term35799.getClass(), "type", 37);
        term36266 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term36266, term36266.getClass(), "currentTraversal", null);
        term36267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36267, term36267.getClass(), "type", 37);
        setField(term36267, term36267.getClass(), "next", null);
        setField(term36267, term36267.getClass(), "first", null);
        setField(term36267, term36267.getClass(), "last", null);
        setField(term36267, term36267.getClass(), "propListHead", null);
        setIntField(term36267, term36267.getClass(), "sourcePosition", 0);
        setField(term36267, term36267.getClass(), "jsType", null);
        setField(term36267, term36267.getClass(), "parent", null);
        term36245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36245, term36245.getClass(), "type", 37);
        setField(term36245, term36245.getClass(), "next", null);
        setField(term36245, term36245.getClass(), "first", null);
        setField(term36245, term36245.getClass(), "last", null);
        setField(term36245, term36245.getClass(), "propListHead", null);
        setIntField(term36245, term36245.getClass(), "sourcePosition", 0);
        setField(term36245, term36245.getClass(), "jsType", null);
        setField(term36245, term36245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35799;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term35729, args);
        assertTrue(recursiveEquals(term35729, term36266));
        assertTrue(recursiveEquals(term35799, term36267));
        assertTrue(recursiveEquals(retValue, term36245));
    }

};


