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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542688;
     Object term542780;
     Object term542912;
     Object term542913;
     Object term542891;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542688 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term542780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term542850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term542780, term542780.getClass(), "first", term542780);
        setField(term542780, term542780.getClass(), "next", term542850);
        setIntField(term542780, term542780.getClass(), "type", 18);
        term542912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term542912, term542912.getClass(), "currentTraversal", null);
        term542913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term542914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term542913, term542913.getClass(), "str", null);
        setIntField(term542913, term542913.getClass(), "type", 18);
        setIntField(term542914, term542914.getClass(), "type", 0);
        setField(term542914, term542914.getClass(), "next", null);
        setField(term542914, term542914.getClass(), "first", null);
        setField(term542914, term542914.getClass(), "last", null);
        setField(term542914, term542914.getClass(), "propListHead", null);
        setIntField(term542914, term542914.getClass(), "sourcePosition", 0);
        setField(term542914, term542914.getClass(), "jsType", null);
        setField(term542914, term542914.getClass(), "parent", null);
        setField(term542913, term542913.getClass(), "next", term542914);
        setField(term542913, term542913.getClass(), "first", term542913);
        setField(term542913, term542913.getClass(), "last", null);
        setField(term542913, term542913.getClass(), "propListHead", null);
        setIntField(term542913, term542913.getClass(), "sourcePosition", 0);
        setField(term542913, term542913.getClass(), "jsType", null);
        setField(term542913, term542913.getClass(), "parent", null);
        term542891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term542893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term542891, term542891.getClass(), "str", null);
        setIntField(term542891, term542891.getClass(), "type", 18);
        setIntField(term542893, term542893.getClass(), "type", 0);
        setField(term542893, term542893.getClass(), "next", null);
        setField(term542893, term542893.getClass(), "first", null);
        setField(term542893, term542893.getClass(), "last", null);
        setField(term542893, term542893.getClass(), "propListHead", null);
        setIntField(term542893, term542893.getClass(), "sourcePosition", 0);
        setField(term542893, term542893.getClass(), "jsType", null);
        setField(term542893, term542893.getClass(), "parent", null);
        setField(term542891, term542891.getClass(), "next", term542893);
        setField(term542891, term542891.getClass(), "first", term542891);
        setField(term542891, term542891.getClass(), "last", null);
        setField(term542891, term542891.getClass(), "propListHead", null);
        setIntField(term542891, term542891.getClass(), "sourcePosition", 0);
        setField(term542891, term542891.getClass(), "jsType", null);
        setField(term542891, term542891.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term542780;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term542688, args);
        assertTrue(recursiveEquals(term542688, term542912));
        assertTrue(recursiveEquals(term542780, term542913));
        assertTrue(recursiveEquals(retValue, term542891));
    }

};


