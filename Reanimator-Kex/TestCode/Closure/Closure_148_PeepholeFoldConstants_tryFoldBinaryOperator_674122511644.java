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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142083;
     Object term142175;
     Object term142785;
     Object term142786;
     Object term142739;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142083 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term142175 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142267 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term142359, term142359.getClass(), "type", 42);
        setField(term142267, term142267.getClass(), "next", term142359);
        setIntField(term142267, term142267.getClass(), "type", 42);
        setField(term142175, term142175.getClass(), "first", term142267);
        setIntField(term142175, term142175.getClass(), "type", 14);
        term142785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term142785, term142785.getClass(), "currentTraversal", null);
        term142786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term142786, term142786.getClass(), "str", null);
        setIntField(term142786, term142786.getClass(), "type", 14);
        setField(term142786, term142786.getClass(), "next", null);
        setField(term142787, term142787.getClass(), "str", null);
        setIntField(term142787, term142787.getClass(), "type", 42);
        setField(term142788, term142788.getClass(), "str", null);
        setIntField(term142788, term142788.getClass(), "type", 42);
        setField(term142788, term142788.getClass(), "next", null);
        setField(term142788, term142788.getClass(), "first", null);
        setField(term142788, term142788.getClass(), "last", null);
        setField(term142788, term142788.getClass(), "propListHead", null);
        setIntField(term142788, term142788.getClass(), "sourcePosition", 0);
        setField(term142788, term142788.getClass(), "jsType", null);
        setField(term142788, term142788.getClass(), "parent", null);
        setField(term142787, term142787.getClass(), "next", term142788);
        setField(term142787, term142787.getClass(), "first", null);
        setField(term142787, term142787.getClass(), "last", null);
        setField(term142787, term142787.getClass(), "propListHead", null);
        setIntField(term142787, term142787.getClass(), "sourcePosition", 0);
        setField(term142787, term142787.getClass(), "jsType", null);
        setField(term142787, term142787.getClass(), "parent", null);
        setField(term142786, term142786.getClass(), "first", term142787);
        setField(term142786, term142786.getClass(), "last", null);
        setField(term142786, term142786.getClass(), "propListHead", null);
        setIntField(term142786, term142786.getClass(), "sourcePosition", 0);
        setField(term142786, term142786.getClass(), "jsType", null);
        setField(term142786, term142786.getClass(), "parent", null);
        term142739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term142739, term142739.getClass(), "str", null);
        setIntField(term142739, term142739.getClass(), "type", 14);
        setField(term142739, term142739.getClass(), "next", null);
        setField(term142741, term142741.getClass(), "str", null);
        setIntField(term142741, term142741.getClass(), "type", 42);
        setField(term142743, term142743.getClass(), "str", null);
        setIntField(term142743, term142743.getClass(), "type", 42);
        setField(term142743, term142743.getClass(), "next", null);
        setField(term142743, term142743.getClass(), "first", null);
        setField(term142743, term142743.getClass(), "last", null);
        setField(term142743, term142743.getClass(), "propListHead", null);
        setIntField(term142743, term142743.getClass(), "sourcePosition", 0);
        setField(term142743, term142743.getClass(), "jsType", null);
        setField(term142743, term142743.getClass(), "parent", null);
        setField(term142741, term142741.getClass(), "next", term142743);
        setField(term142741, term142741.getClass(), "first", null);
        setField(term142741, term142741.getClass(), "last", null);
        setField(term142741, term142741.getClass(), "propListHead", null);
        setIntField(term142741, term142741.getClass(), "sourcePosition", 0);
        setField(term142741, term142741.getClass(), "jsType", null);
        setField(term142741, term142741.getClass(), "parent", null);
        setField(term142739, term142739.getClass(), "first", term142741);
        setField(term142739, term142739.getClass(), "last", null);
        setField(term142739, term142739.getClass(), "propListHead", null);
        setIntField(term142739, term142739.getClass(), "sourcePosition", 0);
        setField(term142739, term142739.getClass(), "jsType", null);
        setField(term142739, term142739.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term142175;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term142083, args);
        assertTrue(recursiveEquals(term142083, term142785));
        assertTrue(recursiveEquals(term142175, term142786));
        assertTrue(recursiveEquals(retValue, term142739));
    }

};


