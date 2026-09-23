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

public class PeepholeFoldConstants_optimizeSubtree_160650699386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13357;
     Object term13427;
     Object term13814;
     Object term13815;
     Object term13804;

    public PeepholeFoldConstants_optimizeSubtree_160650699386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13357 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13427, term13427.getClass(), "type", 11);
        term13814 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term13814, term13814.getClass(), "currentTraversal", null);
        term13815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13815, term13815.getClass(), "type", 11);
        setField(term13815, term13815.getClass(), "next", null);
        setField(term13815, term13815.getClass(), "first", null);
        setField(term13815, term13815.getClass(), "last", null);
        setField(term13815, term13815.getClass(), "propListHead", null);
        setIntField(term13815, term13815.getClass(), "sourcePosition", 0);
        setField(term13815, term13815.getClass(), "jsType", null);
        setField(term13815, term13815.getClass(), "parent", null);
        term13804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13804, term13804.getClass(), "type", 11);
        setField(term13804, term13804.getClass(), "next", null);
        setField(term13804, term13804.getClass(), "first", null);
        setField(term13804, term13804.getClass(), "last", null);
        setField(term13804, term13804.getClass(), "propListHead", null);
        setIntField(term13804, term13804.getClass(), "sourcePosition", 0);
        setField(term13804, term13804.getClass(), "jsType", null);
        setField(term13804, term13804.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13427;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13357, args);
        assertTrue(recursiveEquals(term13357, term13814));
        assertTrue(recursiveEquals(term13427, term13815));
        assertTrue(recursiveEquals(retValue, term13804));
    }

};


