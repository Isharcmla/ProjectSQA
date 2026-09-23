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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425809;
     Object term425901;
     Object term426188;
     Object term426189;
     Object term426135;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425809 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term425901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term425971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term425971, term425971.getClass(), "next", term426063);
        setIntField(term425971, term425971.getClass(), "type", 0);
        setField(term425901, term425901.getClass(), "first", term425971);
        setIntField(term425901, term425901.getClass(), "type", 101);
        setField(term425901, term425901.getClass(), "parent", null);
        term426188 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term426188, term426188.getClass(), "currentTraversal", null);
        term426189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term426190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term426189, term426189.getClass(), "str", null);
        setIntField(term426189, term426189.getClass(), "type", 101);
        setField(term426189, term426189.getClass(), "next", null);
        setIntField(term426190, term426190.getClass(), "type", 0);
        setField(term426191, term426191.getClass(), "str", null);
        setIntField(term426191, term426191.getClass(), "type", 0);
        setField(term426191, term426191.getClass(), "next", null);
        setField(term426191, term426191.getClass(), "first", null);
        setField(term426191, term426191.getClass(), "last", null);
        setField(term426191, term426191.getClass(), "propListHead", null);
        setIntField(term426191, term426191.getClass(), "sourcePosition", 0);
        setField(term426191, term426191.getClass(), "jsType", null);
        setField(term426191, term426191.getClass(), "parent", null);
        setField(term426190, term426190.getClass(), "next", term426191);
        setField(term426190, term426190.getClass(), "first", null);
        setField(term426190, term426190.getClass(), "last", null);
        setField(term426190, term426190.getClass(), "propListHead", null);
        setIntField(term426190, term426190.getClass(), "sourcePosition", 0);
        setField(term426190, term426190.getClass(), "jsType", null);
        setField(term426190, term426190.getClass(), "parent", null);
        setField(term426189, term426189.getClass(), "first", term426190);
        setField(term426189, term426189.getClass(), "last", null);
        setField(term426189, term426189.getClass(), "propListHead", null);
        setIntField(term426189, term426189.getClass(), "sourcePosition", 0);
        setField(term426189, term426189.getClass(), "jsType", null);
        setField(term426189, term426189.getClass(), "parent", null);
        term426135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term426137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426139 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term426135, term426135.getClass(), "str", null);
        setIntField(term426135, term426135.getClass(), "type", 101);
        setField(term426135, term426135.getClass(), "next", null);
        setIntField(term426137, term426137.getClass(), "type", 0);
        setField(term426139, term426139.getClass(), "str", null);
        setIntField(term426139, term426139.getClass(), "type", 0);
        setField(term426139, term426139.getClass(), "next", null);
        setField(term426139, term426139.getClass(), "first", null);
        setField(term426139, term426139.getClass(), "last", null);
        setField(term426139, term426139.getClass(), "propListHead", null);
        setIntField(term426139, term426139.getClass(), "sourcePosition", 0);
        setField(term426139, term426139.getClass(), "jsType", null);
        setField(term426139, term426139.getClass(), "parent", null);
        setField(term426137, term426137.getClass(), "next", term426139);
        setField(term426137, term426137.getClass(), "first", null);
        setField(term426137, term426137.getClass(), "last", null);
        setField(term426137, term426137.getClass(), "propListHead", null);
        setIntField(term426137, term426137.getClass(), "sourcePosition", 0);
        setField(term426137, term426137.getClass(), "jsType", null);
        setField(term426137, term426137.getClass(), "parent", null);
        setField(term426135, term426135.getClass(), "first", term426137);
        setField(term426135, term426135.getClass(), "last", null);
        setField(term426135, term426135.getClass(), "propListHead", null);
        setIntField(term426135, term426135.getClass(), "sourcePosition", 0);
        setField(term426135, term426135.getClass(), "jsType", null);
        setField(term426135, term426135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term425901;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term425809, args);
        assertTrue(recursiveEquals(term425809, term426188));
        assertTrue(recursiveEquals(term425901, term426189));
        assertTrue(recursiveEquals(retValue, term426135));
    }

};


