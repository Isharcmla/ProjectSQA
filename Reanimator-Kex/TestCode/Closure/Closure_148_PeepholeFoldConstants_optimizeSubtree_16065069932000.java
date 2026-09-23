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
import java.lang.Object;

public class PeepholeFoldConstants_optimizeSubtree_16065069932000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535128;
     Object term535220;
     Object term535803;
     Object term535804;
     Object term535762;

    public PeepholeFoldConstants_optimizeSubtree_16065069932000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term535128 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term535220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term535312 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term535220, term535220.getClass(), "type", 33);
        setField(term535220, term535220.getClass(), "first", term535220);
        setField(term535220, term535220.getClass(), "next", term535312);
        term535803 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term535803, term535803.getClass(), "currentTraversal", null);
        term535804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term535805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term535804, term535804.getClass(), "number", 0.0);
        setIntField(term535804, term535804.getClass(), "type", 33);
        setField(term535805, term535805.getClass(), "str", null);
        setIntField(term535805, term535805.getClass(), "type", 0);
        setField(term535805, term535805.getClass(), "next", null);
        setField(term535805, term535805.getClass(), "first", null);
        setField(term535805, term535805.getClass(), "last", null);
        setField(term535805, term535805.getClass(), "propListHead", null);
        setIntField(term535805, term535805.getClass(), "sourcePosition", 0);
        setField(term535805, term535805.getClass(), "jsType", null);
        setField(term535805, term535805.getClass(), "parent", null);
        setField(term535804, term535804.getClass(), "next", term535805);
        setField(term535804, term535804.getClass(), "first", term535804);
        setField(term535804, term535804.getClass(), "last", null);
        setField(term535804, term535804.getClass(), "propListHead", null);
        setIntField(term535804, term535804.getClass(), "sourcePosition", 0);
        setField(term535804, term535804.getClass(), "jsType", null);
        setField(term535804, term535804.getClass(), "parent", null);
        term535762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term535765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term535762, term535762.getClass(), "number", 0.0);
        setIntField(term535762, term535762.getClass(), "type", 33);
        setField(term535765, term535765.getClass(), "str", null);
        setIntField(term535765, term535765.getClass(), "type", 0);
        setField(term535765, term535765.getClass(), "next", null);
        setField(term535765, term535765.getClass(), "first", null);
        setField(term535765, term535765.getClass(), "last", null);
        setField(term535765, term535765.getClass(), "propListHead", null);
        setIntField(term535765, term535765.getClass(), "sourcePosition", 0);
        setField(term535765, term535765.getClass(), "jsType", null);
        setField(term535765, term535765.getClass(), "parent", null);
        setField(term535762, term535762.getClass(), "next", term535765);
        setField(term535762, term535762.getClass(), "first", term535762);
        setField(term535762, term535762.getClass(), "last", null);
        setField(term535762, term535762.getClass(), "propListHead", null);
        setIntField(term535762, term535762.getClass(), "sourcePosition", 0);
        setField(term535762, term535762.getClass(), "jsType", null);
        setField(term535762, term535762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term535220;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term535128, args);
        assertTrue(recursiveEquals(term535128, term535803));
        assertTrue(recursiveEquals(term535220, term535804));
        assertTrue(recursiveEquals(retValue, term535762));
    }

};


