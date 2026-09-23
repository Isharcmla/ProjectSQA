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

public class PeepholeFoldConstants_optimizeSubtree_160650699345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7681;
     Object term7751;
     Object term8212;
     Object term8213;
     Object term8196;

    public PeepholeFoldConstants_optimizeSubtree_160650699345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term7751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7751, term7751.getClass(), "type", 1725571209);
        setField(term7751, term7751.getClass(), "first", term7751);
        setField(term7751, term7751.getClass(), "next", term7751);
        term8212 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term8212, term8212.getClass(), "currentTraversal", null);
        term8213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8213, term8213.getClass(), "type", 1725571209);
        setField(term8213, term8213.getClass(), "next", term8213);
        setField(term8213, term8213.getClass(), "first", term8213);
        setField(term8213, term8213.getClass(), "last", null);
        setField(term8213, term8213.getClass(), "propListHead", null);
        setIntField(term8213, term8213.getClass(), "sourcePosition", 0);
        setField(term8213, term8213.getClass(), "jsType", null);
        setField(term8213, term8213.getClass(), "parent", null);
        term8196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8196, term8196.getClass(), "type", 1725571209);
        setField(term8196, term8196.getClass(), "next", term8196);
        setField(term8196, term8196.getClass(), "first", term8196);
        setField(term8196, term8196.getClass(), "last", null);
        setField(term8196, term8196.getClass(), "propListHead", null);
        setIntField(term8196, term8196.getClass(), "sourcePosition", 0);
        setField(term8196, term8196.getClass(), "jsType", null);
        setField(term8196, term8196.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7751;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term7681, args);
        assertTrue(recursiveEquals(term7681, term8212));
        assertTrue(recursiveEquals(term7751, term8213));
        assertTrue(recursiveEquals(retValue, term8196));
    }

};


