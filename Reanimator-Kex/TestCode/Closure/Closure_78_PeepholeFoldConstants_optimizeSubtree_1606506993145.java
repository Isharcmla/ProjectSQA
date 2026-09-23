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

public class PeepholeFoldConstants_optimizeSubtree_1606506993145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23729;
     Object term23799;
     Object term24362;
     Object term24363;
     Object term24353;

    public PeepholeFoldConstants_optimizeSubtree_1606506993145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23799, term23799.getClass(), "type", 50);
        term24362 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24362, term24362.getClass(), "currentTraversal", null);
        term24363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24363, term24363.getClass(), "type", 50);
        setField(term24363, term24363.getClass(), "next", null);
        setField(term24363, term24363.getClass(), "first", null);
        setField(term24363, term24363.getClass(), "last", null);
        setField(term24363, term24363.getClass(), "propListHead", null);
        setIntField(term24363, term24363.getClass(), "sourcePosition", 0);
        setField(term24363, term24363.getClass(), "jsType", null);
        setField(term24363, term24363.getClass(), "parent", null);
        term24353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24353, term24353.getClass(), "type", 50);
        setField(term24353, term24353.getClass(), "next", null);
        setField(term24353, term24353.getClass(), "first", null);
        setField(term24353, term24353.getClass(), "last", null);
        setField(term24353, term24353.getClass(), "propListHead", null);
        setIntField(term24353, term24353.getClass(), "sourcePosition", 0);
        setField(term24353, term24353.getClass(), "jsType", null);
        setField(term24353, term24353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23799;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term23729, args);
        assertTrue(recursiveEquals(term23729, term24362));
        assertTrue(recursiveEquals(term23799, term24363));
        assertTrue(recursiveEquals(retValue, term24353));
    }

};


