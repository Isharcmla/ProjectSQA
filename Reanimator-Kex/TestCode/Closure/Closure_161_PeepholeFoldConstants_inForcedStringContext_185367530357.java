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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class PeepholeFoldConstants_inForcedStringContext_185367530357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2646;
     Object term2687;

    public PeepholeFoldConstants_inForcedStringContext_185367530357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2662 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2662, term2662.getClass(), "vars", null);
        setField(term2662, term2662.getClass(), "parent", null);
        setIntField(term2662, term2662.getClass(), "depth", 0);
        setField(term2662, term2662.getClass(), "rootNode", null);
        setField(term2662, term2662.getClass(), "thisType", null);
        setBooleanField(term2662, term2662.getClass(), "isBottom", false);
        setField(term2662, term2662.getClass(), "arguments", null);
        ArrayDeque term2660 = new ArrayDeque();
        ((ArrayDeque) term2660).add(term2662);
        ArrayDeque term2667 = new ArrayDeque();
        ArrayDeque term2671 = new ArrayDeque();
        term2646 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term2647 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term2648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2647, term2647.getClass(), "compiler", null);
        setField(term2647, term2647.getClass(), "callback", null);
        setIntField(term2648, term2648.getClass(), "type", -344907703);
        setIntField(term2650, term2650.getClass(), "type", 0);
        setField(term2650, term2650.getClass(), "next", null);
        setField(term2650, term2650.getClass(), "first", null);
        setField(term2650, term2650.getClass(), "last", null);
        setField(term2650, term2650.getClass(), "propListHead", null);
        setIntField(term2650, term2650.getClass(), "sourcePosition", 0);
        setField(term2650, term2650.getClass(), "jsType", null);
        setField(term2650, term2650.getClass(), "parent", null);
        setField(term2648, term2648.getClass(), "next", term2650);
        setIntField(term2653, term2653.getClass(), "type", 0);
        setField(term2653, term2653.getClass(), "next", null);
        setField(term2653, term2653.getClass(), "first", null);
        setField(term2653, term2653.getClass(), "last", null);
        setField(term2653, term2653.getClass(), "propListHead", null);
        setIntField(term2653, term2653.getClass(), "sourcePosition", 0);
        setField(term2653, term2653.getClass(), "jsType", null);
        setField(term2653, term2653.getClass(), "parent", null);
        setField(term2648, term2648.getClass(), "first", term2653);
        setIntField(term2656, term2656.getClass(), "type", 0);
        setField(term2656, term2656.getClass(), "next", null);
        setField(term2656, term2656.getClass(), "first", null);
        setField(term2656, term2656.getClass(), "last", null);
        setField(term2656, term2656.getClass(), "propListHead", null);
        setIntField(term2656, term2656.getClass(), "sourcePosition", 0);
        setField(term2656, term2656.getClass(), "jsType", null);
        setField(term2656, term2656.getClass(), "parent", null);
        setField(term2648, term2648.getClass(), "last", term2656);
        setField(term2648, term2648.getClass(), "propListHead", null);
        setIntField(term2648, term2648.getClass(), "sourcePosition", 0);
        setField(term2648, term2648.getClass(), "jsType", null);
        setField(term2648, term2648.getClass(), "parent", null);
        setField(term2647, term2647.getClass(), "curNode", term2648);
        setField(term2647, term2647.getClass(), "scopes", term2660);
        setField(term2647, term2647.getClass(), "scopeRoots", term2667);
        setField(term2647, term2647.getClass(), "cfgs", term2671);
        setField(term2647, term2647.getClass(), "sourceName", "eZFUvlxvGV");
        setField(term2647, term2647.getClass(), "scopeCreator", null);
        setField(term2647, term2647.getClass(), "scopeCallback", null);
        setField(term2646, term2646.getClass(), "currentTraversal", term2647);
        term2687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2687, term2687.getClass(), "type", 1091954101);
        setIntField(term2689, term2689.getClass(), "type", 470895808);
        setIntField(term2691, term2691.getClass(), "type", 0);
        setField(term2691, term2691.getClass(), "next", null);
        setField(term2691, term2691.getClass(), "first", null);
        setField(term2691, term2691.getClass(), "last", null);
        setField(term2691, term2691.getClass(), "propListHead", null);
        setIntField(term2691, term2691.getClass(), "sourcePosition", 0);
        setField(term2691, term2691.getClass(), "jsType", null);
        setField(term2691, term2691.getClass(), "parent", null);
        setField(term2689, term2689.getClass(), "next", term2691);
        setIntField(term2694, term2694.getClass(), "type", 0);
        setField(term2694, term2694.getClass(), "next", null);
        setField(term2694, term2694.getClass(), "first", null);
        setField(term2694, term2694.getClass(), "last", null);
        setField(term2694, term2694.getClass(), "propListHead", null);
        setIntField(term2694, term2694.getClass(), "sourcePosition", 0);
        setField(term2694, term2694.getClass(), "jsType", null);
        setField(term2694, term2694.getClass(), "parent", null);
        setField(term2689, term2689.getClass(), "first", term2694);
        setIntField(term2697, term2697.getClass(), "type", 0);
        setField(term2697, term2697.getClass(), "next", null);
        setField(term2697, term2697.getClass(), "first", null);
        setField(term2697, term2697.getClass(), "last", null);
        setField(term2697, term2697.getClass(), "propListHead", null);
        setIntField(term2697, term2697.getClass(), "sourcePosition", 0);
        setField(term2697, term2697.getClass(), "jsType", null);
        setField(term2697, term2697.getClass(), "parent", null);
        setField(term2689, term2689.getClass(), "last", term2697);
        setField(term2689, term2689.getClass(), "propListHead", null);
        setIntField(term2689, term2689.getClass(), "sourcePosition", 0);
        setField(term2689, term2689.getClass(), "jsType", null);
        setField(term2689, term2689.getClass(), "parent", null);
        setField(term2687, term2687.getClass(), "next", term2689);
        setIntField(term2701, term2701.getClass(), "type", 0);
        setField(term2701, term2701.getClass(), "next", null);
        setField(term2701, term2701.getClass(), "first", null);
        setField(term2701, term2701.getClass(), "last", null);
        setField(term2701, term2701.getClass(), "propListHead", null);
        setIntField(term2701, term2701.getClass(), "sourcePosition", 0);
        setField(term2701, term2701.getClass(), "jsType", null);
        setField(term2701, term2701.getClass(), "parent", null);
        setField(term2687, term2687.getClass(), "first", term2701);
        setIntField(term2704, term2704.getClass(), "type", 0);
        setField(term2704, term2704.getClass(), "next", null);
        setField(term2704, term2704.getClass(), "first", null);
        setField(term2704, term2704.getClass(), "last", null);
        setField(term2704, term2704.getClass(), "propListHead", null);
        setIntField(term2704, term2704.getClass(), "sourcePosition", 0);
        setField(term2704, term2704.getClass(), "jsType", null);
        setField(term2704, term2704.getClass(), "parent", null);
        setField(term2687, term2687.getClass(), "last", term2704);
        setField(term2687, term2687.getClass(), "propListHead", null);
        setIntField(term2687, term2687.getClass(), "sourcePosition", 0);
        setField(term2687, term2687.getClass(), "jsType", null);
        setField(term2687, term2687.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2687;
        try {
            callMethod(klass, "inForcedStringContext", argTypes, term2646, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


