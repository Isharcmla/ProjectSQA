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

public class PeepholeFoldConstants_optimizeSubtree_1606506993331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63619;
     Object term63689;
     Object term79299;
     Object term79300;
     Object term79283;

    public PeepholeFoldConstants_optimizeSubtree_1606506993331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63619 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term63689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63689, term63689.getClass(), "type", 75);
        setField(term63689, term63689.getClass(), "first", term63689);
        term79299 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term79299, term79299.getClass(), "currentTraversal", null);
        term79300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79300, term79300.getClass(), "type", 75);
        setField(term79300, term79300.getClass(), "next", null);
        setField(term79300, term79300.getClass(), "first", term79300);
        setField(term79300, term79300.getClass(), "last", null);
        setField(term79300, term79300.getClass(), "propListHead", null);
        setIntField(term79300, term79300.getClass(), "sourcePosition", 0);
        setField(term79300, term79300.getClass(), "jsType", null);
        setField(term79300, term79300.getClass(), "parent", null);
        term79283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79283, term79283.getClass(), "type", 75);
        setField(term79283, term79283.getClass(), "next", null);
        setField(term79283, term79283.getClass(), "first", term79283);
        setField(term79283, term79283.getClass(), "last", null);
        setField(term79283, term79283.getClass(), "propListHead", null);
        setIntField(term79283, term79283.getClass(), "sourcePosition", 0);
        setField(term79283, term79283.getClass(), "jsType", null);
        setField(term79283, term79283.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63689;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term63619, args);
        assertTrue(recursiveEquals(term63619, term79299));
        assertTrue(recursiveEquals(term63689, term79300));
        assertTrue(recursiveEquals(retValue, term79283));
    }

};


