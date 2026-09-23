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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162198;
     Object term162290;
     Object term162808;
     Object term162809;
     Object term162783;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162198 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term162290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term162360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162290, term162290.getClass(), "first", term162290);
        setField(term162290, term162290.getClass(), "next", term162360);
        setIntField(term162290, term162290.getClass(), "type", 35);
        term162808 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term162808, term162808.getClass(), "currentTraversal", null);
        term162809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term162810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162809, term162809.getClass(), "str", null);
        setIntField(term162809, term162809.getClass(), "type", 35);
        setIntField(term162810, term162810.getClass(), "type", 0);
        setField(term162810, term162810.getClass(), "next", null);
        setField(term162810, term162810.getClass(), "first", null);
        setField(term162810, term162810.getClass(), "last", null);
        setField(term162810, term162810.getClass(), "propListHead", null);
        setIntField(term162810, term162810.getClass(), "sourcePosition", 0);
        setField(term162810, term162810.getClass(), "jsType", null);
        setField(term162810, term162810.getClass(), "parent", null);
        setField(term162809, term162809.getClass(), "next", term162810);
        setField(term162809, term162809.getClass(), "first", term162809);
        setField(term162809, term162809.getClass(), "last", null);
        setField(term162809, term162809.getClass(), "propListHead", null);
        setIntField(term162809, term162809.getClass(), "sourcePosition", 0);
        setField(term162809, term162809.getClass(), "jsType", null);
        setField(term162809, term162809.getClass(), "parent", null);
        term162783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term162785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162783, term162783.getClass(), "str", null);
        setIntField(term162783, term162783.getClass(), "type", 35);
        setIntField(term162785, term162785.getClass(), "type", 0);
        setField(term162785, term162785.getClass(), "next", null);
        setField(term162785, term162785.getClass(), "first", null);
        setField(term162785, term162785.getClass(), "last", null);
        setField(term162785, term162785.getClass(), "propListHead", null);
        setIntField(term162785, term162785.getClass(), "sourcePosition", 0);
        setField(term162785, term162785.getClass(), "jsType", null);
        setField(term162785, term162785.getClass(), "parent", null);
        setField(term162783, term162783.getClass(), "next", term162785);
        setField(term162783, term162783.getClass(), "first", term162783);
        setField(term162783, term162783.getClass(), "last", null);
        setField(term162783, term162783.getClass(), "propListHead", null);
        setIntField(term162783, term162783.getClass(), "sourcePosition", 0);
        setField(term162783, term162783.getClass(), "jsType", null);
        setField(term162783, term162783.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term162290;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term162198, args);
        assertTrue(recursiveEquals(term162198, term162808));
        assertTrue(recursiveEquals(term162290, term162809));
        assertTrue(recursiveEquals(retValue, term162783));
    }

};


